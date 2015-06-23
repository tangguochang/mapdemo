name := "mapdemo"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
"postgresql" % "postgresql" % "8.4-702.jdbc4",
javaJdbc,
javaEbean,
cache
)     

play.Project.playJavaSettings
