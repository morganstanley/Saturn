package com.ms.qaTools.kronus

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy

import scala.reflect.{ ClassTag, classTag }

import com.ms.qaTools.kronus.repository.IvySupport.IvyResolver

import spray.json._

package object repository {
  /**
   * `A` must not have implementation for the methods you want to overwrite; otherwise the overwrite will be ignored
   */
  def newProxyInstance[A: ClassTag](h: InvocationHandler): A = {
    val interface = classTag[A].runtimeClass
    Proxy.newProxyInstance(interface.getClassLoader, Array(interface), h).asInstanceOf[A]
  }

  trait BaseResolver {
    val resolver2JsValue: PartialFunction[DependencyResolver, JsValue]
    val jsValue2Resolver: PartialFunction[JsValue, DependencyResolver]
  }

  case object IvyJsonProtocolSupport extends DefaultJsonProtocol with BaseResolver {
    import IvySupport._

    implicit val ivyConfigJsonProtocolFormat = jsonFormat1(IvySimpleConfig)
    implicit val kronusIvyConfigJsonProtocolFormat = jsonFormat2(IvyKronusConfig)
    implicit val ivyResolverJsonProtocolFormat = jsonFormat1(IvyResolver)
    val resolver2JsValue: PartialFunction[DependencyResolver, JsValue] = { case i: IvyResolver => ivyResolverJsonProtocolFormat.write(i) }
    val jsValue2Resolver: PartialFunction[JsValue, DependencyResolver] = { case v: JsObject if (v.fields.contains("configs")) => ivyResolverJsonProtocolFormat.read(v) }
  }

  trait EntitiesJsonProtocol extends DefaultJsonProtocol {
    import scala.language.implicitConversions

    val resolvers: Seq[BaseResolver] = Seq(IvyJsonProtocolSupport)
    val resolver2JsValue = resolvers.map { _.resolver2JsValue }.reduce((f1, f2) => f1.orElse(f2))
    val jsValue2Resolver = resolvers.map { _.jsValue2Resolver }.reduce((f1, f2) => f1.orElse(f2))

    implicit val depResolverJsonProtocolFormat = new RootJsonFormat[DependencyResolver] {
      def write(d: DependencyResolver) = resolver2JsValue(d)
      def read(value: JsValue): DependencyResolver = jsValue2Resolver(value)
    }

    implicit def readSeqDepResolverJsonProtocolFormat(resolvers: JsValue) = resolvers match { case a: JsArray => a.elements.map { depResolverJsonProtocolFormat.read _ } }
    implicit def writeseqDepResolverJsonProtocolFormat(resolvers: Seq[DependencyResolver]) = JsArray(resolvers.map {depResolverJsonProtocolFormat.write _}.toVector)

    implicit val releaseJsonProtocolFormat = jsonFormat4(Release.apply)

    implicit def jsValueToReleases(v: JsValue): Seq[Release] = v match { case a: JsArray => a.elements.map { releaseJsonProtocolFormat.read(_) } }
    implicit def releasesToJsValue(r: Seq[Release]): JsValue = JsArray(r.map { releaseJsonProtocolFormat.write(_) }.toVector)
  }

}