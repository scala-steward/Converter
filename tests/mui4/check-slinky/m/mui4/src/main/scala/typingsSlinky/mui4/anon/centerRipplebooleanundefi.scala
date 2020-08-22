package typingsSlinky.mui4.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {} & {  centerRipple :boolean | undefined} */
@js.native
trait centerRipplebooleanundefi extends js.Object {
  var centerRipple: js.UndefOr[Boolean] = js.native
}

object centerRipplebooleanundefi {
  @scala.inline
  def apply(): centerRipplebooleanundefi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[centerRipplebooleanundefi]
  }
  @scala.inline
  implicit class centerRipplebooleanundefiOps[Self <: centerRipplebooleanundefi] (val x: Self) extends AnyVal {
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
    def setCenterRipple(value: Boolean): Self = this.set("centerRipple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterRipple: Self = this.set("centerRipple", js.undefined)
  }
  
}

