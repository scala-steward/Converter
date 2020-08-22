package typingsSlinky.mui4.mod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonProps[M /* <: OverridableTypeMap */]
  extends StyledComponentProps[
      /* import warning: importer.ImportType#apply Failed type conversion: M['classKey'] */ js.Any
    ] {
  var className: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object CommonProps {
  @scala.inline
  def apply[/* <: typingsSlinky.mui4.mod.OverridableTypeMap */ M](): CommonProps[M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonProps[M]]
  }
  @scala.inline
  implicit class CommonPropsOps[Self <: CommonProps[_], /* <: typingsSlinky.mui4.mod.OverridableTypeMap */ M] (val x: Self with CommonProps[M]) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

