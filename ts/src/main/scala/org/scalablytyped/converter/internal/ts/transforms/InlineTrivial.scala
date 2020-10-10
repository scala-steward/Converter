package org.scalablytyped.converter.internal
package ts
package transforms

/**
  * This is the first part of a two step process to rid ourselves of the myriad of
  *  type aliases resulting from the resolution of modules.
  *
  *  Here, we inline all trivial type aliases.
  *  We need to do the removal in scala.js (`CleanupTypeAliases`) to ensure that
  *  all dependencies can also resolve all their uses of the intermediate type aliases.
  */
object InlineTrivial extends TreeTransformationScopedChanges {
  override def enterTsTypeRef(scope: TsTreeScope)(x: TsTypeRef): TsTypeRef =
    rewritten(scope, x.name).map(newName => x.copy(name = newName)).getOrElse(x)

  def shouldGeneralize(scope: TsTreeScope): Boolean =
    scope.stack match {
      case _ :: (_: TsFunSig) :: _        => false // return type
      case _ :: (_: TsDeclClassLike) :: _ => false // parent
      case _ => true
    }

  def rewritten(scope: TsTreeScope, current: TsQIdent): Option[TsQIdent] =
    scope.lookupType(current, skipValidation = true).firstDefined {
      case TsDeclEnum(_, _, _, _, _, _, Some(exportedFrom), _, _) =>
        Some(exportedFrom.name)

      case ta @ NameFromTypeAlias(nextName) if ta.comments.has[Markers.IsTrivial.type] =>
        rewritten(scope, nextName).orElse(Some(nextName))

      case NameFromTypeAlias(nextName) if shouldGeneralize(scope) =>
        rewritten(scope, nextName)

      case next: TsDeclClassLike if next.comments.has[Markers.IsTrivial.type] =>
        val nextParentOpt = next.inheritance match {
          case IArray.exactlyOne(one) => Some(one)
          case more                   => more.find(_.name.parts.last === next.name)
        }
        nextParentOpt match {
          case Some(nextParent) => rewritten(scope, nextParent.name).orElse(Some(nextParent.name))
          case None             => Some(current)
        }

      case next: TsDeclClassLike if next.inheritance.nonEmpty && shouldGeneralize(scope) =>
        val nextParentOptAndRest = next.inheritance match {
          case IArray.exactlyOne(one) =>
            (IArray(one), Empty)
          case more =>
            more.partitionCollect {
              case i if i.name.parts.last === next.name && i.tparams.length === next.tparams.length => i
            }
        }
        nextParentOptAndRest match {
          case (IArray.exactlyOne(nextParent), restParents) =>
            val parents: IArray[TsDeclClassLike] =
              ParentsResolver(scope, next).parents

            lazy val inheritedMemberName: Set[TsIdentSimple] =
              parents.flatMap(p => IArray.fromTraversable(p.membersByName.keys)).toSet

            lazy val hasNewMembers: Boolean =
              next.membersByName.exists { case (name, _) => !inheritedMemberName(name) }

            lazy val alreadyInherited: Set[TsQIdent] =
              parents.map(_.codePath.forceHasPath.codePath).toSet

            lazy val hasNewInheritance: Boolean =
              restParents.exists(tr => !alreadyInherited(tr.name))

            if (hasNewInheritance || hasNewMembers) None
            else rewritten(scope, nextParent.name)

          case _ => None
        }

      case _ => None
    }

  /* bugfix for a case where we have ended up combining two types which are structurally equal */
  object NameFromTypeAlias {
    def unapply(tpe: TsDeclTypeAlias): Option[TsQIdent] =
      tpe.alias match {
        case tr: TsTypeRef => Some(tr.name)
        case TsTypeIntersect(types) =>
          types.partitionCollect { case x: TsTypeRef => x } match {
            case (all, Empty) if all.map(_.name.parts.last).distinct.length === 1 => Some(all.head.name)
            case _                                                                => None
          }
        case _ => None
      }
  }
}
