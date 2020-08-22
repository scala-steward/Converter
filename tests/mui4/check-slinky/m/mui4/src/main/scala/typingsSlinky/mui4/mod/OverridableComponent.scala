package typingsSlinky.mui4.mod

import slinky.core.facade.ReactElement
import typingsSlinky.mui4.anon.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverridableComponent[M /* <: OverridableTypeMap */] extends js.Object {
  def apply(props: DefaultComponentProps[M]): ReactElement = js.native
  def apply[C /* <: ReactElement */](props: Component[C] with (OverrideProps[M, C])): ReactElement = js.native
}

