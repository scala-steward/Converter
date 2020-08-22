package typingsSlinky.mui4.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component[C /* <: ReactElement */] extends js.Object {
  var component: C = js.native
}

object Component {
  @scala.inline
  def apply[/* <: typingsSlinky.react.mod.ElementType[_] */ C](component: C): Component[C] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[C]]
  }
  @scala.inline
  implicit class ComponentOps[Self <: Component[_], /* <: typingsSlinky.react.mod.ElementType[_] */ C] (val x: Self with Component[C]) extends AnyVal {
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
    def setComponent(value: C): Self = this.set("component", value.asInstanceOf[js.Any])
  }
  
}

