import Dependencies._

lazy val commonSettings = Seq(
  organization := "com.evolutiongaming",
  homepage := Some(new URL("http://github.com/evolution-gaming/edge")),
  startYear := Some(2020),
  organizationName := "Evolution Gaming",
  organizationHomepage := Some(url("http://evolutiongaming.com")),
  bintrayOrganization := Some("evolutiongaming"),
  scalaVersion := crossScalaVersions.value.head,
  crossScalaVersions := Seq("2.13.1", "2.12.10"),
  scalacOptions in(Compile, doc) ++= Seq("-groups", "-implicits", "-no-link-warnings"),
  scalacOptsFailOnWarn := Some(false),
  resolvers += Resolver.bintrayRepo("evolutiongaming", "maven"),
  licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT"))),
  releaseCrossBuild := true,
  testOptions in Test ++= Seq(Tests.Argument(TestFrameworks.ScalaTest, "-oUDNCXEHLOPQRM")),
  libraryDependencies += compilerPlugin(`kind-projector` cross CrossVersion.full))


lazy val root = (project in file(".")
  settings (name := "edge")
  settings commonSettings
  settings (skip in publish := true)
  aggregate(
    common,
    client,
    hub))

lazy val common = (project in file("common")
  settings (name := "edge-common")
  settings commonSettings
  settings (libraryDependencies ++= Seq(
    `cats-helper`,
    random,
    retry,
    hostname,
    scache,
    Pureconfig.pureconfig,
    Pureconfig.cats,
    Smetrics.smetrics,
    Cats.core,
    Cats.effect,
    Scodec.core,
    Scodec.bits,
    scalatest % Test,
    Logback.core % Test,
    Logback.classic % Test)))

lazy val client = (project in file("client")
  settings (name := "edge-client")
  settings commonSettings
  dependsOn (common % "test->test;compile->compile")
  settings (libraryDependencies ++= Seq()))

lazy val hub = (project in file("hub")
  settings (name := "edge-hub")
  settings commonSettings
  dependsOn (common % "test->test;compile->compile")
  settings (libraryDependencies ++= Seq()))