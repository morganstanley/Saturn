package com.ms.qaTools.saturn.kronus.runtime

import java.io.Closeable

import scala.collection.mutable.Buffer
import scala.concurrent.ExecutionContext
import scala.util.Success

class Closeables {
  protected val underlying = Buffer.empty[Closeable]
  protected var closed = false

  def addNew[A <: Closeable](deps: Seq[Context[Any]], x: Context[A])
                            (implicit executor: ExecutionContext, counter: ReferenceCounter): Context[A] =
    x.andThen { t =>
      synchronized {
        t match {
          case Success(x) if closed =>
            x.close()
          case Success(x) =>
            underlying += x
            val ds = deps.map(_.future.value).collect {
              case Some(Success((Success(c: Closeable), _))) => c
            }
            counter.addNew(x, ds)
          case _ =>
        }
      }
    }

  def addRef[A](x: Context[A])
               (implicit executor: ExecutionContext, counter: ReferenceCounter): Context[A] = x.andThen { t =>
    synchronized {
      t match {
        case Success(x: Closeable) if !closed =>
          underlying += x
          counter.inc(x)
        case _ =>
      }
    }
  }

  def closeAll(except: Option[Any])(implicit counter: ReferenceCounter): Unit = synchronized {
    closed = true
    underlying.foreach(counter.remove(_, except))
  }
}
