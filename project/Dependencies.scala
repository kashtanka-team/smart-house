import sbt._

object Dependencies {
  val logbackVersion = "1.2.3"
  val scalaLoggingVersion = "3.9.0"

  val logback = "ch.qos.logback" % "logback-classic" % logbackVersion
  val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % scalaLoggingVersion

  val Logging = Seq(logback, scalaLogging)

}