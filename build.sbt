name := "approvals-scala"

organization := "com.github.writethemfirst"

homepage := Some(url("https://github.com/WriteThemFirst/approvals-scala"))

crossScalaVersions := List("2.12.11", "2.13.2")

libraryDependencies ++= Seq(scalaTest, approvalsJava, pprint)

resolvers += Resolver.bintrayRepo("writethemfirst", "maven")
resolvers += Resolver.mavenLocal

lazy val pprint = "com.lihaoyi" %% "pprint" % "0.5.9"
lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.0"
lazy val approvalsJava = "com.github.writethemfirst" % "approvals-java" % "0.13.0"

bintrayOrganization := Some("writethemfirst")
licenses := Seq("GPL-3.0" -> url("https://opensource.org/licenses/GPL-3.0"))
bintrayRepository := "maven"

homepage := Some(url("https://github.com/WriteThemFirst/approvals-scala"))
scmInfo := Some(ScmInfo(url("https://github.com/WriteThemFirst/approvals-scala"), "scm:git:git@github.com:WriteThemFirst/approvals-scala.git"))
publishMavenStyle := true

pomExtra :=
  <developers>
    <developer>
      <id>tyrcho</id>
      <name>Michel Daviot</name>
    </developer>
  </developers>

Global / onChangedBuildSource := ReloadOnSourceChanges
