package typingsSlinky.react.mod.global.JSX

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.DetailedHTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrinsicElements extends js.Object {
  var a: DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement] = js.native
  var button: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement] = js.native
}

object IntrinsicElements {
  @scala.inline
  def apply(
    a: DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement],
    button: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]
  ): IntrinsicElements = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicElements]
  }
  @scala.inline
  implicit class IntrinsicElementsOps[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
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
    def setA(value: DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def setButton(value: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]): Self = this.set("button", value.asInstanceOf[js.Any])
  }
  
}

