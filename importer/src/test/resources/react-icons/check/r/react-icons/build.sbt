organization := "com.olvind.scalablytyped"
name := "react-icons"
version := "2.2-725bf1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.olvind.scalablytyped" %%% "react" % "0.0-unknown-be16ac",
  "com.olvind.scalablytyped" %%% "react-icon-base" % "2.1-2958a8",
  "com.olvind.scalablytyped" %%% "std" % "0.0-unknown-87233b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
        