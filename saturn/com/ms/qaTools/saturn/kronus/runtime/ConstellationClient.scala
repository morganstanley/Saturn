package com.ms.qaTools.saturn.kronus.runtime
import java.net.URL

import scala.concurrent.Future
import scala.concurrent.duration._

import akka.util.Timeout
import spray.client.pipelining._
import spray.http.HttpRequest
import spray.httpx.unmarshalling.FromResponseUnmarshaller

object ConstellationClient {
  def apply(url: URL): IConstellationClient = try {
    Class.forName("com.ms.qaTools.saturn.kronus.runtime.MsConstellationClient").getConstructor(classOf[URL]).newInstance(url).asInstanceOf[IConstellationClient]
  } catch {
    case _: ClassNotFoundException => new NopConstellationClient
  }
}
