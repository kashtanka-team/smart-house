import sbt.Keys.version

name := "smart-house"

version := "0.1"

lazy val commonSettings = Seq(
  organization := "com.github.kashtanka-team",
  scalaVersion := "2.12.6"
)

val core = (project in file("core")).settings(
  commonSettings,
  name := "smart-house-core",
  libraryDependencies ++=
    Dependencies.Logging
)