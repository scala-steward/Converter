package typingsSlinky.react.mod

import typingsSlinky.react.reactStrings.baseline
import typingsSlinky.react.reactStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSProperties extends js.Object {
  var `align-content`: js.UndefOr[baseline | normal] = js.native
}

object CSSProperties {
  @scala.inline
  def apply(): CSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSProperties]
  }
  @scala.inline
  implicit class CSSPropertiesOps[Self <: CSSProperties] (val x: Self) extends AnyVal {
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
    def `setAlign-content`(value: baseline | normal): Self = this.set("align-content", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAlign-content`: Self = this.set("align-content", js.undefined)
  }
  
}

