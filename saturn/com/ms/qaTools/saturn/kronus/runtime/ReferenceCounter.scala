package com.ms.qaTools.saturn.kronus.runtime

import java.io.Closeable

import scala.collection.mutable
import scala.util.DynamicVariable

object ReferenceCounter {
  val debug = new DynamicVariable(false)
}

class ReferenceCounter {
  import ReferenceCounter._

  protected val counter: mutable.Map[Closeable, (Int, Seq[Closeable])] = mutable.HashMap.empty

  def inc(x: Closeable): Unit = withDebug(s"inc $x") {
    val (n, cs) = counter(x)
    counter(x) = (n + 1, cs)
  }

  protected def dec(x: Closeable): (Int, Seq[Closeable]) = withDebug(s"dec $x") {
    val (n, cs) = counter(x)
    assert(n > 0)
    val v = (n - 1, cs)
    counter(x) = v
    v
  }

  def addNew(x: Closeable, deps: Seq[Closeable]): Unit = withDebug(s"+ $x -> $deps") {
    require(!counter.contains(x))
    deps.foreach(inc)
    counter += x -> (1, deps)
  }

  def remove(x: Closeable, keep: Option[Any]): Unit = withDebug(s"- $x") {
    val (n, cs) = dec(x)
    if (keep.forall(x != _) && n <= 0) {
      x.close()
      counter -= x
      cs.foreach(remove(_, keep))
    }
  }

  def withDebug[A](msg: String)(body: => A): A = counter.synchronized {
    if (debug.value) println(msg)
    val x = debug.withValue(false)(body)
    if (debug.value) {
      if (counter.isEmpty) println("<empty>")
      else for ((k, v) <- counter) println(s"$k -> $v")
      println()
    }
    x
  }
}
