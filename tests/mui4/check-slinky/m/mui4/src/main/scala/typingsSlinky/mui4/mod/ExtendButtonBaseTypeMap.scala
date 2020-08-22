package typingsSlinky.mui4.mod

import typingsSlinky.mui4.anon.centerRipplebooleanundefi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendButtonBaseTypeMap[M /* <: OverridableTypeMap */] extends js.Object {
  var classKey: /* import warning: importer.ImportType#apply Failed type conversion: M['classKey'] */ js.Any = js.native
  var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any = js.native
  var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with centerRipplebooleanundefi = js.native
}

object ExtendButtonBaseTypeMap {
  @scala.inline
  def apply[/* <: typingsSlinky.mui4.mod.OverridableTypeMap */ M](
    classKey: /* import warning: importer.ImportType#apply Failed type conversion: M['classKey'] */ js.Any,
    defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
    props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with centerRipplebooleanundefi
  ): ExtendButtonBaseTypeMap[M] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendButtonBaseTypeMap[M]]
  }
  @scala.inline
  implicit class ExtendButtonBaseTypeMapOps[Self <: ExtendButtonBaseTypeMap[_], /* <: typingsSlinky.mui4.mod.OverridableTypeMap */ M] (val x: Self with ExtendButtonBaseTypeMap[M]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassKey(
      value: /* import warning: importer.ImportType#apply Failed type conversion: M['classKey'] */ js.Any
    ): Self = this.set("classKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultComponent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    ): Self = this.set("defaultComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with centerRipplebooleanundefi
    ): Self = this.set("props", value.asInstanceOf[js.Any])
  }
  
}

