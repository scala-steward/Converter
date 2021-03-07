organization := "org.scalablytyped"
name := "react-icons"
version := "2.2-cbf3b1"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "react" % "0.0-unknown-3d5187",
  "org.scalablytyped" %%% "react-icon-base" % "2.1-3cf446",
  "org.scalablytyped" %%% "std" % "0.0-unknown-dc26fd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
