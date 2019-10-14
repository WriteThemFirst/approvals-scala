name := "approvals-scala"

organization := "com.github.writethemfirst"

val approvalsVersion = "0.12.0"

version := approvalsVersion

homepage := Some(url("https://github.com/WriteThemFirst/approvals-scala"))

crossScalaVersions := List("2.10.7", "2.11.12", "2.12.10", "2.13.0")

libraryDependencies ++= Seq(scalaTest, approvalsJava, pprint)

resolvers += Resolver.bintrayRepo("writethemfirst", "maven")
resolvers += Resolver.mavenLocal

lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.8"
lazy val pprint = "com.lihaoyi" %% "pprint" % "0.5.5"
lazy val approvalsJava = "com.github.writethemfirst" % "approvals-java" % approvalsVersion

bintrayOrganization := Some("writethemfirst")
licenses += ("GPL-3.0", url("https://opensource.org/licenses/GPL-3.0"))
bintrayRepository := "maven"

pomExtra :=
  <developers>
    <developer>
      <id>tyrcho</id>
      <name>Michel Daviot</name>
    </developer>
  </developers>

