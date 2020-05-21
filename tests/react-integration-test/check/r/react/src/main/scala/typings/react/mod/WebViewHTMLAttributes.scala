package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebViewHTMLAttributes[T] extends HTMLAttributes[T] {
  var allowFullScreen: js.UndefOr[Boolean] = js.native
  var allowpopups: js.UndefOr[Boolean] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var autosize: js.UndefOr[Boolean] = js.native
  var blinkfeatures: js.UndefOr[String] = js.native
  var disableblinkfeatures: js.UndefOr[String] = js.native
  var disableguestresize: js.UndefOr[Boolean] = js.native
  var disablewebsecurity: js.UndefOr[Boolean] = js.native
  var guestinstance: js.UndefOr[String] = js.native
  var httpreferrer: js.UndefOr[String] = js.native
  var nodeintegration: js.UndefOr[Boolean] = js.native
  var partition: js.UndefOr[String] = js.native
  var plugins: js.UndefOr[Boolean] = js.native
  var preload: js.UndefOr[String] = js.native
  var src: js.UndefOr[String] = js.native
  var useragent: js.UndefOr[String] = js.native
  var webpreferences: js.UndefOr[String] = js.native
}

object WebViewHTMLAttributes {
  @scala.inline
  def apply[T](): WebViewHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebViewHTMLAttributes[T]]
  }
  @scala.inline
  implicit class WebViewHTMLAttributesOps[Self <: WebViewHTMLAttributes[_], T] (val x: Self with WebViewHTMLAttributes[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFullScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowpopups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowpopups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowpopups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowpopups")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withAutosize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutosize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosize")(js.undefined)
        ret
    }
    @scala.inline
    def withBlinkfeatures(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blinkfeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlinkfeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blinkfeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableblinkfeatures(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableblinkfeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableblinkfeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableblinkfeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableguestresize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableguestresize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableguestresize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableguestresize")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablewebsecurity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablewebsecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablewebsecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablewebsecurity")(js.undefined)
        ret
    }
    @scala.inline
    def withGuestinstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestinstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuestinstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestinstance")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpreferrer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpreferrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpreferrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpreferrer")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeintegration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeintegration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeintegration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeintegration")(js.undefined)
        ret
    }
    @scala.inline
    def withPartition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partition")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withUseragent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useragent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseragent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useragent")(js.undefined)
        ret
    }
    @scala.inline
    def withWebpreferences(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpreferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebpreferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpreferences")(js.undefined)
        ret
    }
  }
  
}

