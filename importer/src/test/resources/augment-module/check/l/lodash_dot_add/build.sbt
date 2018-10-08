organization := "com.olvind.scalablytyped"
name := "lodash_dot_add"
version := "3.7-e77d85"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.olvind.scalablytyped" %%% "lodash" % "4.14-23a50f",
  "com.olvind.scalablytyped" %%% "std" % "0.0-unknown-865847",
  "org.scala-js" %%% "scalajs-dom" % "0.9.5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
        