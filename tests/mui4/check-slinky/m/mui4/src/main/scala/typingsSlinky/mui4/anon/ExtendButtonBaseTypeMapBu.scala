package typingsSlinky.mui4.anon

import typingsSlinky.mui4.mod.ButtonBaseClassKey
import typingsSlinky.mui4.mui4Strings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mui4.mui4.ExtendButtonBaseTypeMap<mui4.mui4.ButtonBaseTypeMap<{}, 'button'>> */
@js.native
trait ExtendButtonBaseTypeMapBu extends js.Object {
  var classKey: ButtonBaseClassKey = js.native
  var defaultComponent: button = js.native
  var props: CenterRipple = js.native
}

object ExtendButtonBaseTypeMapBu {
  @scala.inline
  def apply(classKey: ButtonBaseClassKey, defaultComponent: button, props: CenterRipple): ExtendButtonBaseTypeMapBu = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendButtonBaseTypeMapBu]
  }
  @scala.inline
  implicit class ExtendButtonBaseTypeMapBuOps[Self <: ExtendButtonBaseTypeMapBu] (val x: Self) extends AnyVal {
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
    def setClassKey(value: ButtonBaseClassKey): Self = this.set("classKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultComponent(value: button): Self = this.set("defaultComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: CenterRipple): Self = this.set("props", value.asInstanceOf[js.Any])
  }
  
}

