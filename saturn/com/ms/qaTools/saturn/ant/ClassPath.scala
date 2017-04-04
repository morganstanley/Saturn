package com.ms.qaTools.saturn.ant

import java.net.URLClassLoader
import java.nio.file.Paths

import scala.beans.BeanProperty

import org.apache.tools.ant.ProjectComponent
import org.apache.tools.ant.types.{Path => AntPath}

trait ClassPath extends ProjectComponent {
  @BeanProperty var classpathref: String = _

  def classLoader: ClassLoader = {
    require(classpathref != null, "attribute `classpathref' not set")
    val path = getProject.getReference(classpathref).asInstanceOf[AntPath].ensuring(_ != null, {
      s"cannot find reference `$classpathref'"
    })
    new URLClassLoader(path.list.map(Paths.get(_).toUri.toURL))
  }

  def withCurrentThreadContextClassLoader[A](cl: ClassLoader)(thunk: => A): A = {
    val t = Thread.currentThread
    val old = t.getContextClassLoader
    try {
      t.setContextClassLoader(cl)
      thunk
    } finally t.setContextClassLoader(old)
  }
}
