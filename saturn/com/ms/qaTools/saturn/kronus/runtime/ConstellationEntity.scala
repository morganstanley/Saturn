package com.ms.qaTools.saturn.kronus.runtime

import java.util.concurrent.atomic.AtomicLong

import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.util.{Try, Success, Failure}

object ConstellationEntity {
  sealed trait Status
  case object Running   extends Status
  case object Completed extends Status
  case object Exception extends Status
}

class ConstellationEntity protected (val name: String, val parent: Option[ConstellationEntity], val sequenceNo: Long)
                                    (implicit val client: IConstellationClient, executor: ExecutionContext) {
  def this(name: String)(implicit client: IConstellationClient, executor: ExecutionContext) = this(name, None, 0)

  protected[runtime] var status: ConstellationEntity.Status = ConstellationEntity.Running
  protected val numOfChildren = new AtomicLong

  val id: Future[Long] = {
    val id = client.createEntity(this)
    id.onFailure {
      case t => new RuntimeException(s"Fail to get entity ID for $name", t).printStackTrace()
    }
    id
  }

  def newChild(name: String) = new ConstellationEntity(name, Some(this), numOfChildren.getAndIncrement())

  def complete[A: ConstellationDecoration.From](result: Try[A], annotations: Seq[DynamicAnnotation]): Unit = {
    val (newStatus, decoration) = result match {
      case Success(x) => (ConstellationEntity.Completed, ConstellationDecoration.from(x))
      case Failure(t) => (ConstellationEntity.Exception, ConstellationDecoration.from(t))
    }
    status = newStatus
    client.updateEntityStatus(this, status)
    decoration.foreach(client.attachDecoration(this, _))
    annotations.foreach(ConstellationDecoration.from(_).foreach(client.attachDecoration(this, _)))
  }
}
