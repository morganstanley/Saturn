package com.ms.qaTools.saturn.kronus.runtime

import scala.annotation.tailrec
import scala.concurrent.ExecutionContext

import com.ms.qaTools.saturn.kronus.Location

abstract class Scope extends MetaData {
  def name: String
  def parent: Option[Scope]
  def sourceLocation: Option[Location]
  def entity: Option[ConstellationEntity]
  def annotations: Seq[DynamicAnnotation]

  def parents: Iterator[Scope] = Iterator.iterate(parent.orNull)(_.parent.orNull).takeWhile(_ != null)
  def parentEntity: Option[ConstellationEntity] = parents.map(_.entity).collectFirst {case Some(e) => e}
  protected def fullNameSegment: String = name
  def fullName: String = (fullNameSegment +: parents.map(_.fullNameSegment).toSeq).reverse.mkString(".")
  override def toString = s"${getClass.getSimpleName}($fullName)"

  /** Lowest common ancestor */
  def lca(that: Scope): Scope = {
    @tailrec def common[A](xs: Seq[A], ys: Seq[A], soFar: Seq[A]): Seq[A] = (xs, ys) match {
      case (x +: xs, y +: ys) if x == y => common(xs, ys, x +: soFar)
      case _                            => soFar
    }
    val Seq(xs, ys) = Seq(this, that).map(_.parents.toSeq.reverse)
    common(xs, ys, Nil).head
  }
}

class ValDefScope(val name: String,
                  val parent: Option[Scope],
                  val sourceLocation: Option[Location],
                  val annotations: Seq[DynamicAnnotation])
                 (implicit constellationClient: IConstellationClient, executor: ExecutionContext) extends Scope {
  val entity = Some(parentEntity.fold(new ConstellationEntity(name))(_.newChild(name)))
}

class ParameterValueScope(val name: String, val parent: Some[FunctionCallScope]) extends Scope {
  def sourceLocation = parent.get.sourceLocation

  val entity = Some {
    parentEntity.getOrElse(sys.error(s"Fail to find parent entity of $this")).newChild(s"${parent.get.name}.$name")
  }

  def annotations = Nil
}

class FunctionCallScope(val name: String,
                        val parent: Some[Scope],
                        val sourceLocation: Option[Location]) extends Scope {
  override protected def fullNameSegment = s"($name)"
  def entity = None
  def annotations = Nil
}
