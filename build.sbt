name := "y"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.18",
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings
