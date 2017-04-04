package com.ms.qaTools.saturn.ant

import org.apache.tools.ant.ProjectComponent

trait PropertyAccessor extends ProjectComponent {
  def getProperty(p: String): Option[String] = Option(getProject.getProperty(p))
  def getOrThrow(ps: String*): String = ps.map(getProperty).reduceLeft(_ orElse _).getOrElse {
    throw new IllegalStateException("One of these properties must be set: " + ps.mkString(", "))
  }
}
