ThisBuild / version := "1.0.0"
ThisBuild / organization := "https://github.com/suru33/"
ThisBuild / scalaVersion := "3.1.1"

ThisBuild / scalacOptions ++= Seq(
  "-encoding",
  "utf8",
  "-new-syntax",
  "-language:implicitConversions",
  "-language:higherKinds",
  "-language:existentials",
  "-language:postfixOps"
)

ThisBuild / javacOptions ++= Seq("-source", "17")

val commonDependencies = Seq(
  "org.typelevel" %% "cats-core" % "2.7.0",
  "org.scalatest" %% "scalatest" % "3.2.11" % Test,
  "org.mockito" % "mockito-core" % "4.3.1" % Test
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
