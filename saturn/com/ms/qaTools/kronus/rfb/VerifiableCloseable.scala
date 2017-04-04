package com.ms.qaTools.kronus.rfb

import java.io.Closeable
import java.util.Collection
import java.util.concurrent.ConcurrentLinkedQueue

import scala.collection.JavaConverters._

import com.ms.qaTools.saturn.kronus.runtime.Scope

object VerifiableCloseable {
  object Registry {
    implicit val global = new Registry(new ConcurrentLinkedQueue)
  }

  class Registry(val self: Collection[VerifiableCloseable]) {
    def verifyAllClosed(): Unit = for (c <- self.asScala) assert(c.closed, s"$c is not closed")
  }
}

class VerifiableCloseable(scope: Scope)(implicit registry: VerifiableCloseable.Registry) extends Closeable {
  registry.self.add(this)
  var closed = false
  def close() = closed = true
  override def toString = scope.fullName
}

trait InheritedCloseable extends Closeable {
  def parent: VerifiableCloseable
}

class ProxyCloseable(scope: Scope, self: VerifiableCloseable)(implicit registry: VerifiableCloseable.Registry)
    extends VerifiableCloseable(scope) with InheritedCloseable {
  def parent = self

  override def close() = {
    super.close()
    parent.close()
  }
}

class TeeCloseable(scope: Scope, origin: VerifiableCloseable)(implicit registry: VerifiableCloseable.Registry)
    extends VerifiableCloseable(scope) with InheritedCloseable {
  def parent = origin
}
