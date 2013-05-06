name := "sprouch"

scalaVersion := "2.10.1"

version := "0.5.11"

testOptions in Test := Nil

parallelExecution in Test := false

scalacOptions in ThisBuild ++= Seq(
    "-language:_",
    "-feature",
    "-unchecked",
    "-deprecation")

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "2.0.M5b" % "test",
    "io.spray" % "spray-can" % "1.1-M7",
    "io.spray" % "spray-client" % "1.1-M7",
    "io.spray" %%  "spray-json" % "1.2.3",
    "com.typesafe.akka" %% "akka-actor" % "2.1.0",
    "com.novocode" % "junit-interface" % "0.10-M1" % "test")