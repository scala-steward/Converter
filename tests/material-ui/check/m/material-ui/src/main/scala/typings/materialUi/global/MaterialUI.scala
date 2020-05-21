package typings.materialUi.global

import typings.materialUi.MaterialUI.BottomNavigation.BottomNavigationItemProps
import typings.materialUi.MaterialUI.Styles.MuiTheme
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__MaterialUI")
@js.native
object MaterialUI extends js.Object {
  @js.native
  class SvgIcon ()
    extends Component[js.Object, js.Object]
  
  @js.native
  object BottomNavigation extends js.Object {
    @js.native
    class BottomNavigationItem ()
      extends Component[BottomNavigationItemProps, js.Object]
    
  }
  
  @js.native
  object Styles extends js.Object {
    var Transitions: js.Any = js.native
    var Typography: js.Any = js.native
    var a: js.Any = js.native
    var zIndex: js.Any = js.native
    def getMuiTheme(muiTheme: MuiTheme*): MuiTheme = js.native
  }
  
}
