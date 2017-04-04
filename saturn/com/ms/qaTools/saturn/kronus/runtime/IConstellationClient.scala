package com.ms.qaTools.saturn.kronus.runtime

import java.io.Closeable
import java.io.PrintStream
import java.util.{Set => JSet}
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicLong

import scala.collection.JavaConverters._
import scala.concurrent.Await
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration._

trait IConstellationClient extends Closeable {
  def createEntity(entity: ConstellationEntity): Future[Long]
  def updateEntityStatus(entity: ConstellationEntity, status: ConstellationEntity.Status): Future[Unit]
  def attachDecoration(entity: ConstellationEntity, decoration: ConstellationDecoration): Future[Unit]
}

class NopConstellationClient extends IConstellationClient {
  protected val nextEntityId = new AtomicLong
  def createEntity(entity: ConstellationEntity) = Future.successful(nextEntityId.getAndIncrement())
  def updateEntityStatus(entity: ConstellationEntity, status: ConstellationEntity.Status) = Future.successful(())
  def attachDecoration(entity: ConstellationEntity, decoration: ConstellationDecoration) = Future.successful(())
  def close() = ()
}

class FutureRegistry(implicit executor: ExecutionContext) {
  protected val futures: JSet[Future[Any]] = ConcurrentHashMap.newKeySet()

  def +=[A](f: Future[A]): Future[A] = {
    futures.add(f)
    f.onComplete(_ => futures.remove(f))
    f
  }

  def waitAllComplete(): Unit = while (!futures.isEmpty) futures.iterator.asScala.foreach(Await.ready(_, Duration.Inf))
}

trait FutureCollectingConstellationClient extends IConstellationClient {
  def registryExecutor: ExecutionContext

  lazy val registry = new FutureRegistry()(registryExecutor)

  override abstract def createEntity(entity: ConstellationEntity) = registry += super.createEntity(entity)

  override abstract def updateEntityStatus(entity: ConstellationEntity, status: ConstellationEntity.Status) =
    registry += super.updateEntityStatus(entity, status)

  override abstract def attachDecoration(entity: ConstellationEntity, decoration: ConstellationDecoration) =
    registry += super.attachDecoration(entity, decoration)

  def close() = {
    registry.waitAllComplete()
    registryExecutor match {
      case executor: ExecutorService => shutdown(executor, 15.seconds, Console.err.println)
      case _                         =>
    }
  }
}

abstract class APrintStreamConstellationClient(out: PrintStream) extends IConstellationClient {
  implicit val executor = ExecutionContext.fromExecutorService(Executors.newSingleThreadExecutor)
  protected val nextEntityId = new AtomicLong

  def createEntity(entity: ConstellationEntity) = {
    def create(parentId: Option[Long]): Long = {
      val id = nextEntityId.getAndIncrement()
      out.println(s"CREATE ENTITY {id: $id, name: ${entity.name}, parentId: $parentId, sequenceNo: ${entity.sequenceNo}, status: ${entity.status}}")
      id
    }
    entity.parent match {
      case None    => Future(create(None))
      case Some(p) => p.id.map(pid => create(Some(pid)))
    }
  }

  def updateEntityStatus(entity: ConstellationEntity, status: ConstellationEntity.Status) = entity.id.map { id =>
    out.println(s"UPDATE ENTITY STATUS {entityId: $id, status: $status}")
  }

  def attachDecoration(entity: ConstellationEntity, decoration: ConstellationDecoration) = entity.id.map { id =>
    out.println(s"ATTACH DECORATION {entityId: $id, type: ${decoration.decorationType.name}}, value: ${decoration.decorationValue.compactPrint}")
  }
}

class PrintStreamConstellationClient(out: PrintStream)
extends APrintStreamConstellationClient(out) with FutureCollectingConstellationClient {
  def registryExecutor = executor
}
