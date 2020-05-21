package typingsJapgolly.react.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerProps[T] extends js.Object {
  var unstable_observedBits: js.UndefOr[Double] = js.native
  def children(value: T): Node = js.native
}

object ConsumerProps {
  @scala.inline
  def apply[T](children: T => CallbackTo[Node]): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1((t0: T) => children(t0).runNow()))
    __obj.asInstanceOf[ConsumerProps[T]]
  }
  @scala.inline
  implicit class ConsumerPropsOps[Self <: ConsumerProps[_], T] (val x: Self with ConsumerProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: T => CallbackTo[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1((t0: T) => value(t0).runNow()))
        ret
    }
    @scala.inline
    def withUnstable_observedBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstable_observedBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnstable_observedBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unstable_observedBits")(js.undefined)
        ret
    }
  }
  
}

