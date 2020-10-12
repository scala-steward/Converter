package org.scalablytyped.converter.internal
package scalajs
package transforms

import maps._

object CombineAndSimplifyModules extends TreeTransformation {
  override def leaveContainerTree(scope: TreeScope)(c: ContainerTree): ContainerTree =
    simplifyModules(combineModules(c))

  def combineModules[C <: ContainerTree](c: C): C = {
    val withCombinedModules: IArray[Tree] =
      c.index.flatMapToIArray {
        case (_, ts) =>
          val (mods, rest) = ts.partitionCollect { case x: ModuleTree => x }
          val combinedModules: Option[ModuleTree] =
            mods.reduceOption { (mod1, mod2) =>
              ModuleTree(
                annotations = mod1.annotations,
                name        = mod1.name,
                parents     = (mod1.parents ++ mod2.parents).distinct,
                members     = (mod1.members ++ mod2.members).distinct,
                comments    = mod1.comments ++ mod2.comments,
                codePath    = mod1.codePath,
                isOverride  = false,
              )
            }

          rest ++ IArray.fromOption(combinedModules)
      }

    c.withMembers(withCombinedModules).asInstanceOf[C]
  }

  object Legal {
    def unapply(annotations: IArray[Annotation]): Boolean =
      annotations.forall {
        case Annotation.JsImport(_, imported, _) =>
          imported match {
            case Imported.Namespace => false
            case Imported.Default   => false
            case Imported.Named(_)  => true
          }
        case _ => true
      }
  }

  def simplifyModules[C <: ContainerTree](c: C): C = {
    val withSimplifiedMembers: IArray[Tree] =
      c.members.flatMap {
        case ModuleTree(annotations @ Legal(), name, Empty, AllCalls(applies), comments, codePath, isOverride) =>
          applies.map(a =>
            a.copy(
              annotations = annotations,
              name        = name,
              codePath    = codePath,
              isOverride  = isOverride,
              comments    = a.comments ++ comments,
            ),
          )
        case ModuleTree(annotations @ Legal(), name, parents, Empty, comments, codePath, isOverride)
            if parents.nonEmpty =>
          IArray(
            FieldTree(
              annotations,
              name,
              tpe        = TypeRef.Intersection(parents, NoComments),
              impl       = ExprTree.native,
              isReadOnly = true,
              isOverride = isOverride,
              comments   = comments,
              codePath   = codePath,
            ),
          )
        case other => IArray(other)
      }

    c.withMembers(withSimplifiedMembers).asInstanceOf[C]
  }

  object AllCalls {
    def unapply(members: IArray[Tree]): Option[IArray[MethodTree]] =
      members.partitionCollect { case x: MethodTree if x.name === Name.APPLY => x } match {
        case (applies, Empty) if applies.nonEmpty => Some(applies)
        case _                                    => None
      }
  }
}
