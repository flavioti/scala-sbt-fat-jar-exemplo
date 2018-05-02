name := "teste-fat-jar"

version := "0.1"

scalaVersion := "2.11.0"
organization := "com.semantix"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.1.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.1.0" % "provided"

libraryDependencies += "com.typesafe" % "config" % "1.3.2"
libraryDependencies += "joda-time" % "joda-time" % "2.9.9"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

test in assembly := {}

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

assemblyJarName in assembly := "semantix-claro-eaq-1.jar"

mainClass in assembly := Some("br.com.semantix.app")