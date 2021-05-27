name := "approvals-scala"

ThisBuild / organization := "com.colisweb"
ThisBuild / organizationName := "Colisweb"

ThisBuild / organizationHomepage := Some(url("https://github.com/colisweb"))
ThisBuild / scmInfo := Some(ScmInfo(
  url("https://github.com/colisweb/approvals-scala"),
  "scm:git:git@github.com:colisweb/approvals-scala.git"
))

ThisBuild / developers := List(
  Developer(
    id = "tyrcho",
    name = "Michel Daviot",
    email = "tyrcho@colisweb.com",
    url = url("https://github.com/tyrcho")
  )
)

ThisBuild / description := "Approbation lib for scala"
ThisBuild / licenses := List("GPL-3.0" -> url("https://opensource.org/licenses/GPL-3.0"))
ThisBuild / homepage := Some(url("https://github.com/colisweb/approvals-scala"))


crossScalaVersions := List("2.12.13", "2.13.5")

libraryDependencies ++= Seq(scalaTest, approvalsJava, pprint)

ThisBuild / pushRemoteCacheTo := Some(MavenCache("local-cache", file("/tmp/remote-cache")))

version := "0.0.3"

lazy val pprint = "com.lihaoyi" %% "pprint" % "0.6.5"
lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.8"
lazy val approvalsJava = "com.colisweb" % "approvals-java" % "0.13.2"

Global / onChangedBuildSource := ReloadOnSourceChanges
