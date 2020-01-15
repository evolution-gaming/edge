import sbt._

object Dependencies {

  val scalatest            = "org.scalatest"          %% "scalatest"             % "3.0.8"
  val `scala-java8-compat` = "org.scala-lang.modules" %% "scala-java8-compat"    % "0.9.0"
  val `kind-projector`     = "org.typelevel"           % "kind-projector"        % "0.11.0"
  val `future-helper`      = "com.evolutiongaming"    %% "future-helper"         % "1.0.6"
  val `cassandra-launcher` = "com.evolutiongaming"    %% "cassandra-launcher"    % "0.0.3"
  val hostname             = "com.evolutiongaming"    %% "hostname"              % "0.1.2"
  val `cats-helper`        = "com.evolutiongaming"    %% "cats-helper"           % "1.5.0"
  val random               = "com.evolutiongaming"    %% "random"                % "0.0.6"
  val retry                = "com.evolutiongaming"    %% "retry"                 % "1.0.2"
  val sstream              = "com.evolutiongaming"    %% "sstream"               % "0.2.0"
  val scache               = "com.evolutiongaming"    %% "scache"                % "2.1.1"
  val `akka-test-actor`    = "com.evolutiongaming"    %% "akka-test-actor"       % "0.0.2"

  object Cats {
    private val version = "2.0.0"
    val core   = "org.typelevel" %% "cats-core"   % version
    val effect = "org.typelevel" %% "cats-effect" % "2.0.0"
  }

  object Logback {
    private val version = "1.2.3"
    val core    = "ch.qos.logback" % "logback-core"    % version
    val classic = "ch.qos.logback" % "logback-classic" % version
  }

  object Scodec {
    val core = "org.scodec" %% "scodec-core" % "1.11.4"
    val bits = "org.scodec" %% "scodec-bits" % "1.1.12"
  }

  object Smetrics {
    private val version = "0.0.8"
    val smetrics   = "com.evolutiongaming" %% "smetrics"            % version
    val prometheus = "com.evolutiongaming" %% "smetrics-prometheus" % version
  }

  object Pureconfig {
    private val version = "0.12.2"
    val pureconfig = "com.github.pureconfig" %% "pureconfig"      % version
    val cats       = "com.github.pureconfig" %% "pureconfig-cats" % version
  }
}