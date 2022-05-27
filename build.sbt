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

ThisBuild / javacOptions ++= Seq("-source", "11")

val commonDependencies = Seq(
  "org.typelevel" %% "cats-core" % "2.7.0",
  "org.scalatest" %% "scalatest" % "3.2.12" % Test,
  "org.scalatestplus" %% "mockito-4-5" % "3.2.12.0" % Test
)

def prompt(state: State) = {
  val rootProject = "Scala 3 Playground"
  val id = state.currentProject.id
  s"[${if (id == "root") rootProject else s"$rootProject/$id"}]> "
}

lazy val root = project
  .in(file("."))
  .settings(
    name := "Scala 3 Playground",
    shellPrompt := { prompt }
  )
  .aggregate(
    `ex-1`
  )

lazy val `ex-1` = project
  .settings(
    name := "Example 1",
    libraryDependencies ++= commonDependencies,
    shellPrompt := { prompt }
  )
