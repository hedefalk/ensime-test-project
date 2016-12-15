lazy val commonSettings = Seq(
  organization := "se.hedefalk",
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.11.7"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "ensime-test-project",
    libraryDependencies ++= Seq(
      "org.scalaz" %% "scalaz-core" % "7.1.1",
      "net.liftweb" %% "lift-webkit" % "2.6" % "compile"
    )
  )
  
