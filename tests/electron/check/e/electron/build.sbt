organization := "org.scalablytyped"
name := "electron"
version := "2.0.0-91f74f"
scalaVersion := "0.28.0-bin-20200925-f4528ce-NIGHTLY"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "org.scalablytyped" %%% "node" % "0.0-unknown-38c11b",
  "org.scalablytyped" %%% "std" % "0.0-unknown-46e60f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-scalajs")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
