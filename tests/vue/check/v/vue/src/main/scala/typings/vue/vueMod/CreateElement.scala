package typings.vue.vueMod

import typings.vue.optionsMod.AsyncComponent
import typings.vue.optionsMod.Component
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import typings.vue.vnodeMod.VNode
import typings.vue.vnodeMod.VNodeChildren
import typings.vue.vnodeMod.VNodeData
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateElement extends js.Object {
  def apply(): VNode = js.native
  def apply(tag: js.UndefOr[Component[js.Any, js.Any, js.Any, js.Any]], children: VNodeChildren): VNode = js.native
  def apply(
    tag: js.UndefOr[Component[js.Any, js.Any, js.Any, js.Any]],
    data: js.UndefOr[scala.Nothing],
    children: VNodeChildren
  ): VNode = js.native
  def apply(tag: js.UndefOr[Component[js.Any, js.Any, js.Any, js.Any]], data: VNodeData): VNode = js.native
  def apply(
    tag: js.UndefOr[Component[js.Any, js.Any, js.Any, js.Any]],
    data: VNodeData,
    children: VNodeChildren
  ): VNode = js.native
  def apply(tag: String): VNode = js.native
  def apply(tag: String, children: VNodeChildren): VNode = js.native
  def apply(tag: String, data: js.UndefOr[scala.Nothing], children: VNodeChildren): VNode = js.native
  def apply(tag: String, data: VNodeData): VNode = js.native
  def apply(tag: String, data: VNodeData, children: VNodeChildren): VNode = js.native
  def apply(tag: js.Function0[Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps]]): VNode = js.native
  def apply(
    tag: js.Function0[Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps]],
    children: VNodeChildren
  ): VNode = js.native
  def apply(
    tag: js.Function0[Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps]],
    data: js.UndefOr[scala.Nothing],
    children: VNodeChildren
  ): VNode = js.native
  def apply(
    tag: js.Function0[Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps]],
    data: VNodeData
  ): VNode = js.native
  def apply(
    tag: js.Function0[Component[DefaultData[Vue], DefaultMethods[Vue], DefaultComputed, DefaultProps]],
    data: VNodeData,
    children: VNodeChildren
  ): VNode = js.native
  def apply(tag: AsyncComponent[js.Any, js.Any, js.Any, js.Any]): VNode = js.native
  def apply(tag: AsyncComponent[js.Any, js.Any, js.Any, js.Any], children: VNodeChildren): VNode = js.native
  def apply(
    tag: AsyncComponent[js.Any, js.Any, js.Any, js.Any],
    data: js.UndefOr[scala.Nothing],
    children: VNodeChildren
  ): VNode = js.native
  def apply(tag: AsyncComponent[js.Any, js.Any, js.Any, js.Any], data: VNodeData): VNode = js.native
  def apply(tag: AsyncComponent[js.Any, js.Any, js.Any, js.Any], data: VNodeData, children: VNodeChildren): VNode = js.native
  def apply(tag: Component[js.Any, js.Any, js.Any, js.Any]): VNode = js.native
}

