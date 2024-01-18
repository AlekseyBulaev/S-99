version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.12"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % "test"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.0"


scalacOptions ++= Seq("-language:_", "-Xlog-implicits")


