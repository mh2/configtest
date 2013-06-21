import sbt._
import sbt.Keys._

object Build extends Build {
  
  lazy val projectAA = Project(
    "configtest",
    file("."),
    settings = commonSettings ++ Seq(
      organization := "dk.mhan",
      version := "0.1",
      scalaVersion := Version.scala,
      scalacOptions ++= Seq(
        "-unchecked",
        "-deprecation",
        //"-Xlint",
        "-language:_",
        "-target:jvm-1.6",
        "-encoding", "UTF-8"
      ),
      libraryDependencies ++= Seq(
        Dependency.Compile.akkaActor
      )
    )
  )

  def commonSettings = Defaults.defaultSettings

  object Version {
    val scala = "2.10.1"
    val akka = "2.1.2"
  }

  object Dependency {
    object Compile {
      val akkaActor = "com.typesafe.akka" %% "akka-actor" % Version.akka
    }
  }
}
