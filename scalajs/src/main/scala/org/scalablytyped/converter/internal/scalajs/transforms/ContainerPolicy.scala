package org.scalablytyped.converter.internal
package scalajs
package transforms

import org.scalablytyped.converter.internal.scalajs.ExprTree._

import scala.collection.mutable

object ContainerPolicy extends TreeTransformation {
  case object Passthrough extends Comment.Data
  case class Forwarder(anns: IArray[Annotation]) extends Comment.Data

  override def leaveContainerTree(scope: TreeScope)(s: ContainerTree): ContainerTree = {
    val classesToRename = mutable.ArrayBuffer.empty[QualifiedName]

    val rewrittenMembers = s.members.map {
      case pkg: PackageTree => genPkgForwarders(pkg, Empty)
      case mod: ModuleTree if mod.comments.has[Passthrough.type] || !mod.isNative => mod
      case mod: ModuleTree =>
        Action(scope, mod) match {
          case Action.RemainModule => genModForwarders(mod)

          case Action.ConvertToPackage(renameClassOpt) =>
            renameClassOpt.foreach(classesToRename.+=)
            genPkgForwarders(
              PackageTree(mod.annotations, mod.name, mod.members, mod.comments, mod.codePath),
              mod.parents,
            )
        }
      case other => other
    }

    val rewrittenClasses = rewrittenMembers.flatMap {
      case cls: ClassTree if classesToRename.contains(cls.codePath) =>
        val renamedClass = cls.withSuffix("")
        IArray(
          renamedClass,
          TypeAliasTree(
            cls.name,
            cls.tparams,
            TypeRef(renamedClass.codePath, TypeParamTree.asTypeArgs(cls.tparams), NoComments),
            NoComments,
            cls.codePath,
          ),
        )
      case other => IArray(other)
    }

    val isTopLevel = scope.stack.length < 3 // typings, libName
    if (isTopLevel)
      genPkgForwarders(PackageTree(s.annotations, s.name, rewrittenClasses, s.comments, s.codePath), Empty)
    else
      s.withMembers(rewrittenClasses)
  }

  sealed trait Action

  object Action {
    case object RemainModule extends Action
    case class ConvertToPackage(renameClass: Option[QualifiedName]) extends Action

    def existsClassWithSameName(scope: TreeScope, name: Name): Option[QualifiedName] =
      for {
        owner <- scope.stack.collectFirst { case x: ContainerTree => x }
        sameName <- owner.index.get(name)
        cls <- sameName.collectFirst { case x: ClassTree => x.codePath }
      } yield cls

    def apply(scope: TreeScope, mod: ModuleTree): Action = {
      def containsPackage = mod.members.exists {
        case _: PackageTree => true
        case _ => false
      }

      def tooBig = {
        def countClasses(x: ContainerTree): Int =
          x.members.foldLeft(0) {
            case (n, xx: ContainerTree)   => n + 1 + countClasses(xx)
            case (n, _:  InheritanceTree) => n + 1
            case (n, _) => n
          }

        if (mod.comments.has[Markers.EnumObject.type]) false
        else countClasses(mod) > 20
      }

      if (containsPackage || tooBig) Action.ConvertToPackage(existsClassWithSameName(scope, mod.name))
      else Action.RemainModule
    }
  }

  def genPkgForwarders(pkg: PackageTree, inheritance: IArray[TypeRef]): PackageTree = {
    val hatCp = pkg.codePath + Name.namespaced

    val (members, rest) = pkg.members.partitionCollect { case x: MemberTree => x }

    val isGlobal = pkg.annotations.contains(Annotation.JsGlobalScope)

    val dynamicRef: ExprTree =
      if (isGlobal) Ref(QualifiedName.DynamicGlobal)
      else Cast(Ref(hatCp), TypeRef.Dynamic)

    val forwarders = members.flatMap {
      case m: MethodTree =>
        val impl = {
          def call(params: IArray[Arg]) = m.originalName match {
            case Name.APPLY =>
              Call(Select(dynamicRef, Name("apply")), IArray(params))
            case name =>
              Call(Select(dynamicRef, Name("applyDynamic")), IArray(IArray(StringLit(name.unescaped)), params))
          }

          Cast(call(m.params.flatten.map(p => Cast(Ref(p.name), TypeRef.Any))), m.resultType)
        }

        IArray(
          MethodTree(
            annotations = IArray(Annotation.Inline),
            level       = ProtectionLevel.Default,
            name        = m.name,
            tparams     = m.tparams,
            params      = m.params,
            impl        = impl,
            resultType  = m.resultType,
            isOverride  = false,
            comments    = m.comments + CommentData(Forwarder(m.annotations)),
            codePath    = m.codePath,
            isImplicit  = false,
          ),
        )
      case f: FieldTree if f.tpe.typeName === QualifiedName.THIS => Empty
      case f: FieldTree =>
        val getter = {
          val impl = Cast(
            Call(Select(dynamicRef, Name("selectDynamic")), IArray(IArray(StringLit(f.originalName.unescaped)))),
            f.tpe,
          )
          MethodTree(
            annotations = IArray(Annotation.Inline),
            level       = ProtectionLevel.Default,
            name        = f.name,
            tparams     = Empty,
            params      = Empty,
            impl        = impl,
            resultType  = f.tpe,
            isOverride  = false,
            comments    = f.comments + CommentData(Forwarder(f.annotations)),
            codePath    = f.codePath,
            isImplicit  = false,
          )
        }

        val setterOpt =
          if (f.isReadOnly) None
          else {
            val xParam = ParamTree(Name("x"), isImplicit = false, isVal = false, f.tpe, NotImplemented, NoComments)

            val impl = Call(
              Select(dynamicRef, Name("updateDynamic")),
              IArray(IArray(StringLit(f.originalName.unescaped)), IArray(Cast(Ref(xParam.name), TypeRef.Any))),
            )

            val m = MethodTree(
              annotations = IArray(Annotation.Inline),
              level       = ProtectionLevel.Default,
              name        = Name(f.name.unescaped + "_="),
              tparams     = Empty,
              params      = IArray(IArray(xParam)),
              impl        = impl,
              resultType  = TypeRef.Unit,
              isOverride  = false,
              comments    = NoComments,
              codePath    = f.codePath,
              isImplicit  = false,
            )

            Some(m)
          }
        IArray.fromOptions(Some(getter), setterOpt)
    }

    val hatModuleOpt =
      if ((forwarders.isEmpty && inheritance.isEmpty) || isGlobal) None
      else
        Some(
          ModuleTree(
            annotations = pkg.annotations,
            name        = Name.namespaced,
            parents     = inheritance,
            members     = Empty,
            comments    = NoComments,
            codePath    = hatCp,
            isOverride  = false,
          ),
        )

    pkg.copy(members = rest ++ forwarders ++ IArray.fromOption(hatModuleOpt))
  }

  def genModForwarders(mod: ModuleTree): ModuleTree = {
    val isGlobal = mod.annotations.contains(Annotation.JsGlobalScope)
    val hatCp    = mod.codePath + Name.namespaced

    val dynamicRef: ExprTree =
      if (isGlobal) Ref(QualifiedName.DynamicGlobal)
      else Cast(Ref(Name.namespaced), TypeRef.Dynamic)

    val setters: IArray[MethodTree] = mod.members.collect {
      case f: FieldTree if !f.isReadOnly =>
        val xParam = ParamTree(Name("x"), isImplicit = false, isVal = false, f.tpe, NotImplemented, NoComments)

        val impl = Call(
          Select(dynamicRef, Name("updateDynamic")),
          IArray(IArray(StringLit(f.originalName.unescaped)), IArray(Cast(Ref(xParam.name), TypeRef.Any))),
        )

        MethodTree(
          annotations = IArray(Annotation.Inline),
          level       = ProtectionLevel.Default,
          name        = Name(f.name.unescaped + "_="),
          tparams     = Empty,
          params      = IArray(IArray(xParam)),
          impl        = impl,
          resultType  = TypeRef.Unit,
          isOverride  = false,
          comments    = NoComments,
          codePath    = f.codePath,
          isImplicit  = false,
        )
    }

    val rewrittenMembers: IArray[Tree] =
      mod.members.map {
        case m: MethodTree =>
          m.copy(annotations = m.annotations.filterNot(_.isInstanceOf[Annotation.JsName]))
        case f: FieldTree =>
          f.copy(annotations = f.annotations.filterNot(_.isInstanceOf[Annotation.JsName]), isReadOnly = true)
        case other =>
          other
      }

    val hatModuleOpt: Option[FieldTree] = {
      val tpe = TypeRef.Intersection(mod.parents, NoComments) match {
        case TypeRef.Nothing => TypeRef.Any
        case other           => other
      }

      if ((tpe === TypeRef.Any && setters.isEmpty) || isGlobal) None
      else {
        Some(
          FieldTree(
            annotations = mod.annotations,
            name        = Name.namespaced,
            tpe         = tpe,
            impl        = ExprTree.native,
            isReadOnly  = true,
            isOverride  = false,
            comments    = NoComments,
            codePath    = hatCp,
          ),
        )
      }
    }

    mod.copy(
      annotations = Empty,
      parents     = Empty,
      members     = rewrittenMembers ++ setters ++ IArray.fromOption(hatModuleOpt),
      comments    = mod.comments + CommentData(Forwarder(mod.annotations)),
    )
  }
}
