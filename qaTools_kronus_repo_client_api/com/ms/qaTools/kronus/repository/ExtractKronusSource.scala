package com.ms.qaTools.kronus.repository

import java.net.URI

import scala.collection.JavaConverters._
import scala.io.Source
import scala.runtime.AbstractFunction1

object ExtractKronusSource extends AbstractFunction1[ClassLoader, Seq[URI]] {
  val sourceListFile = "META-INF/kronus/source.list"

  def apply(cl: ClassLoader = Thread.currentThread.getContextClassLoader) = cl match {
    case ExtraKronusClassLoader(parent, extra) =>
      apply(parent) ++ extra
    case _ => cl.getResources(sourceListFile).asScala.flatMap { url =>
      val list = Source.fromURL(url)
      try list.getLines.toList finally list.close()
    }.map(path => cl.getResource(path).ensuring(_ != null, s"cannot find Kronus file $path").toURI).toSeq
  }

  def withExtra(extra: Seq[URI], cl: ClassLoader = Thread.currentThread.getContextClassLoader) =
    apply(ExtraKronusClassLoader(cl, extra))

  case class ExtraKronusClassLoader(parent: ClassLoader, extraKronus: Seq[URI]) extends ClassLoader(parent)
}
