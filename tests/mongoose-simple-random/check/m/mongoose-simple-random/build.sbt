organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-6bfb3c"
scalaVersion := "0.28.0-bin-20200925-f4528ce-NIGHTLY"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.2.0",
  "org.scalablytyped" %%% "mongoose" % "0.0-unknown-02f797",
  "org.scalablytyped" %%% "node" % "0.0-unknown-f5f05a",
  "org.scalablytyped" %%% "std" % "0.0-unknown-cb803c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-scalajs")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
