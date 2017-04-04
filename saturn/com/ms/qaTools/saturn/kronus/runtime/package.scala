package com.ms.qaTools.saturn.kronus

import java.util.concurrent.ExecutorService

import scala.collection.JavaConverters._
import scala.concurrent.ExecutionContext
import scala.concurrent.duration.Duration
import scala.util.Try

package object runtime {
  import scala.language.implicitConversions

  def passIfAllPass[A](contexts: Seq[Context[A]])(implicit executionContext: ExecutionContext): Context[Seq[Try[A]]] =
    Context.removeNotRun(contexts).map(_.map(_._1)).flatMap(Context.noFailure)

  def kronusCodeBlock[A](body: Closeables => Context[A])
                        (implicit executor: ExecutionContext, counter: ReferenceCounter): Context[A] = {
    val closeables = new Closeables
    body(closeables).andThen(t => closeables.closeAll(t.toOption))
  }

  def shutdown(executor: ExecutorService, timeout: Duration, reportError: String => Unit): Unit = try {
    val Duration(n, unit) = timeout
    executor.shutdown()
    if (!executor.awaitTermination(n, unit)) {
      reportError(s"Force shutdown $executor")
      val tasks = executor.shutdownNow().asScala.toSeq
      reportError(s"Tasks not run: $tasks")
    }
  } catch {
    case _: InterruptedException =>
      executor.shutdownNow()
      Thread.currentThread.interrupt()
  }

  implicit def liftToContext[X](x: X): Context[X] = Context.successful(x)
}
