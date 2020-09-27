organization := "org.scalablytyped"
name := "commander"
version := "2.15.1-69bb82"
scalaVersion := "0.28.0-bin-20200925-f4528ce-NIGHTLY"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "org.scalablytyped" %%% "node" % "0.0-unknown-f5f05a",
  "org.scalablytyped" %%% "std" % "0.0-unknown-e19adc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-scalajs")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
