package com.ms.qaTools.saturn.kronus.runtime

import scala.annotation.implicitNotFound
import scala.util.Try

import spray.json._

trait ConstellationDecoration {
  def decorationType: ConstellationDecoration.Type
  def decorationValue: JsValue
}

object ConstellationDecoration {
  case class Type(name: String)
  object UnknownType extends Type("Common.Unknown")
  object GenericJson extends Type("Common.JSON")
  object ExceptionType extends Type("Common.Exception")
  object AnnotationType extends Type("Meta.Annotation")

  def apply(typ: ConstellationDecoration.Type, value: JsValue) = new ConstellationDecoration {
    def decorationType = typ
    def decorationValue = value
  }

  def from[A: From](x: A): Option[ConstellationDecoration] = implicitly[From[A]].from(x)

  @implicitNotFound("Fail to convert ${A} to ConstellationDecoration")
  trait From[A] {
    def from(x: A): Option[ConstellationDecoration]
  }

  object From extends FallBackFromImplicits {
    implicit object ThrowableJsonWriter extends JsonWriter[Throwable] {
      def write(t: Throwable) = {
        val cause = Option(t.getCause).map(c => "cause" -> c.toJson)
        JsObject(Map("message" -> JsString(t.getMessage)) ++ cause)
      }
    }

    implicit object ThrowableIsConstellationDecoration extends From[Throwable] {
      def from(t: Throwable) = Some(ConstellationDecoration(ExceptionType, t.toJson))
    }

    // No need to upload aggregated results since the individual ones are already uploaded as ValDefs
    implicit object SeqTryAnyIsNotConstellationDecoration extends NotFrom[Seq[Try[Any]]]
  }

  class NotFrom[A] extends From[A] {
    def from(x: A) = None
  }

  trait HighPriorityFromImplicits extends DefaultJsonProtocol {
    implicit object NothingIsNotConstellationDecoration extends NotFrom[Nothing]

    implicit def jsonWriterIsConstellationDecoration[A: JsonWriter] = new From[A] {
      def from(x: A) = x match {
        case () | null => None
        case _         => Some(ConstellationDecoration(GenericJson, implicitly[JsonWriter[A]].write(x)))
      }
    }
  }

  trait FallBackFromImplicits {
    // Need this dummy type class to de-prioritize the implicit From[Any]
    class FromAny[A]
    object FromAny {
      implicit def AnyIsFromAny[A <: Any] = new FromAny[A]
    }

    implicit def anyIsConstellationDecoration[A: FromAny] = new From[A] {
      def from(x: A) = x match {
        case cd: ConstellationDecoration => Some(cd)
        case _ => Some(ConstellationDecoration(ConstellationDecoration.UnknownType, JsString(x.toString)))
      }
    }
  }
}
