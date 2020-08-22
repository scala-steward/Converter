package typingsSlinky.react

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentProps[T /* <: typingsSlinky.react.reactStrings.a | typingsSlinky.react.reactStrings.button | typingsSlinky.react.mod.JSXElementConstructor[_] */] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] */ js.Any)
  type ComponentPropsWithRef[T /* <: slinky.core.facade.ReactElement */] = typingsSlinky.react.mod.PropsWithRef[typingsSlinky.react.mod.ComponentProps[T]] | (typingsSlinky.react.mod.PropsWithoutRef[_] with typingsSlinky.react.mod.RefAttributes[typingsSlinky.std.InstanceType[T]])
  type ComponentPropsWithoutRef[T /* <: slinky.core.facade.ReactElement */] = typingsSlinky.react.mod.PropsWithoutRef[typingsSlinky.react.mod.ComponentProps[T]]
  type ComponentState = js.Any
  type ComponentType[P] = slinky.core.ReactComponentClass[P]
  type DetailedHTMLProps[E /* <: typingsSlinky.react.mod.HTMLAttributes[T] */, T] = typingsSlinky.react.mod.ClassAttributes[T] with E
  type ElementType[P] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in 'a' | 'button' ]: P extends react.react.<global>.JSX.IntrinsicElements[K]? K : never}['a' | 'button'] */ js.Any) | slinky.core.ReactComponentClass[P]
  type FunctionComponent[P] = js.Function2[
    /* props */ typingsSlinky.react.mod.PropsWithChildren[P], 
    /* context */ js.UndefOr[js.Any], 
    slinky.core.facade.ReactElement | scala.Null
  ]
  type JSXElementConstructor[P] = (js.Function1[/* props */ P, slinky.core.facade.ReactElement | scala.Null]) | (org.scalablytyped.runtime.Instantiable1[/* props */ P, slinky.core.ReactComponentClass[P]])
  type Key = java.lang.String | scala.Double
  type LegacyRef[T] = java.lang.String | typingsSlinky.react.mod.Ref[T]
  type PropsWithChildren[P] = P with typingsSlinky.react.anon.Children
  type PropsWithRef[P] = P | (typingsSlinky.react.mod.PropsWithoutRef[P] with typingsSlinky.react.anon.`0`)
  type PropsWithoutRef[P] = P | (typingsSlinky.std.Pick[
    P, 
    typingsSlinky.std.Exclude[/* keyof P */ java.lang.String, typingsSlinky.react.reactStrings.ref]
  ])
  type ReactNode = js.UndefOr[java.lang.String | scala.Boolean]
  type ReactType[P] = slinky.core.facade.ReactElement
  type Ref[T] = typingsSlinky.react.mod.RefCallback[T] | slinky.core.facade.ReactRef[T] | scala.Null
  type RefCallback[T] = js.Function1[/* instance */ T | scala.Null, scala.Unit]
}
