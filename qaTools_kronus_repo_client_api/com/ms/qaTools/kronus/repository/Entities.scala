package com.ms.qaTools.kronus.repository

import scala.math.Ordering

trait DependencyResolver
case class Release(group: String, artifact: String, version: String, resolvers: Seq[DependencyResolver] = Seq()) {
  override def toString = s"Release [$group/$artifact/$version]"
}

object Release extends Ordering.ExtraImplicits with EntitiesJsonProtocol {
  protected class WrappedVersion(val version: String)

  implicit object VersionOrdering extends Ordering[WrappedVersion] {
    def compare(x: WrappedVersion, y: WrappedVersion) = try {
      val Seq(xns, yns) = Seq(x, y).map(_.version.split(Array('.', '-')).map(_.toInt))
      implicitly[Ordering[Seq[Int]]].compare(xns, yns)
    } catch {
      case _: NumberFormatException => implicitly[Ordering[String]].compare(x.version, y.version)
    }
  }

  implicit val ReleaseOrdering: Ordering[Release] = Ordering.by { r =>
    (r.group, r.artifact, new WrappedVersion(r.version))
  }
}

object IvySupport {
  
  /*
   * Example of KronusConfigs
   * 
   * config: {
   *   name: "kronus_ice"
   *   runtime: ["runtime", "runtime-ice"]
   * }
   * 
   * config: {
   *   name: "kronus_triclear"
   *   runtime: ["runtime", "runtime-triclear"]
   * }
   * 
   */  
  
  trait IvyConfig {
    val name: String
  }
  
  case class IvySimpleConfig(name: String) extends IvyConfig
  case class IvyKronusConfig(name: String, runtime: Seq[IvySimpleConfig]) extends IvyConfig
  case class IvyResolver(configs: Seq[IvyKronusConfig]) extends DependencyResolver
  
  implicit def name2IvySimpleConfig(name: String) = IvySimpleConfig(name)
}