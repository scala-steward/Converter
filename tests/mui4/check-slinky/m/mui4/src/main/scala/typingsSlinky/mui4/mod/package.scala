package typingsSlinky.mui4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BaseProps[M /* <: typingsSlinky.mui4.mod.OverridableTypeMap */] = (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with typingsSlinky.mui4.mod.CommonProps[M]
  type ClassNameMap[ClassKey /* <: java.lang.String */] = typingsSlinky.std.Record[ClassKey, java.lang.String]
  type DefaultComponentProps[M /* <: typingsSlinky.mui4.mod.OverridableTypeMap */] = typingsSlinky.mui4.mod.BaseProps[M] with (typingsSlinky.std.Omit[
    typingsSlinky.react.mod.ComponentPropsWithRef[
      /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    ], 
    /* keyof mui4.mui4.BaseProps<M> */ typingsSlinky.mui4.mui4Strings.className | typingsSlinky.mui4.mui4Strings.style | typingsSlinky.mui4.mui4Strings.classes | typingsSlinky.mui4.mui4Strings.innerRef
  ])
  type ExtendButtonBase[M /* <: typingsSlinky.mui4.mod.OverridableTypeMap */] = (js.Function1[
    /* props */ typingsSlinky.mui4.anon.Href with (typingsSlinky.mui4.mod.OverrideProps[
      typingsSlinky.mui4.mod.ExtendButtonBaseTypeMap[M], 
      typingsSlinky.mui4.mui4Strings.a
    ]), 
    slinky.core.facade.ReactElement
  ]) with typingsSlinky.mui4.mod.OverridableComponent[typingsSlinky.mui4.mod.ExtendButtonBaseTypeMap[M]]
  type OverrideProps[M /* <: typingsSlinky.mui4.mod.OverridableTypeMap */, C /* <: slinky.core.facade.ReactElement */] = typingsSlinky.mui4.mod.BaseProps[M] with (typingsSlinky.std.Omit[
    typingsSlinky.react.mod.ComponentPropsWithRef[C], 
    /* keyof mui4.mui4.CommonProps<M> */ typingsSlinky.mui4.mui4Strings.className | typingsSlinky.mui4.mui4Strings.style | typingsSlinky.mui4.mui4Strings.classes | typingsSlinky.mui4.mui4Strings.innerRef
  ])
}
