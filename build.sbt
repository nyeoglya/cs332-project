name := "MyScalaTestProject"

version := "0.1"

scalaVersion := "2.12.19"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % Test

excludeFilter := HiddenFileFilter || "*.sc"
