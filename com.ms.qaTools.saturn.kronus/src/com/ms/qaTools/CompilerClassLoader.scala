package com.ms.qaTools

import java.net.URLClassLoader
import java.nio.file.Paths

import scala.reflect.io.File

object CompilerClassLoader {
  def classPath(cl: ClassLoader): Iterator[String] = Iterator.iterate(cl)(_.getParent).takeWhile(_ != null).flatMap {
    case cl: URLClassLoader => cl.getURLs.map(url => Paths.get(url.toURI).toString)
    case _                  => Nil
  }
}

class CompilerClassLoader(parent: ClassLoader = Thread.currentThread.getContextClassLoader) extends ClassLoader(parent) {
  override def getResource(name: String) = {
    val superResource = super.getResource(name)
    name match {
      case "app.class.path" if superResource == null =>
        val path = CompilerClassLoader.classPath(parent).mkString(File.pathSeparator)
        val f = File.makeTemp("class-path")
        f.printlnAll(path)
        f.toURL
      case _ =>
        superResource
    }
  }
}
