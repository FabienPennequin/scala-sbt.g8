import sbt._
import sbt.Keys._

object ProjectBuild extends Build {

  lazy val root = Project(
    id = "root",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name          := "$name$",
      organization  := "$organization$",
      version       := "$version$",

      scalaVersion  := "$scala_version$",
      scalacOptions := Seq("-encoding", "utf8"),

      resolvers     ++= Seq(
        // "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
      ),

      libraryDependencies ++= Seq(
        // "org.joda" % "joda-convert" % "1.2"
      )
    )
  )

}
