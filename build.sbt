ThisBuild / version := "1.0.0"
ThisBuild / organization := "https://github.com/suru33/"
ThisBuild / scalaVersion := "3.0.0"

val commonDependencies = Seq(
  "org.typelevel" %% "cats-core" % "2.6.1",
  "org.scalatest" %% "scalatest" % "3.2.9" % Test,
  "org.mockito" % "mockito-core" % "3.11.2" % Test
)

lazy val root = project
  .in(file("."))
  .settings(
    name := "Scala 3 Playground"
  )
  .aggregate(
    `ex-1`
  )

lazy val `ex-1` = project
  .settings(libraryDependencies ++= commonDependencies)
