package com.ms.qaTools.saturn.kronus.runtime

import scala.util.{ Success, Failure }

import spray.json.{JsValue, JsNull}
import spray.json.JsonFormat

trait DynamicAnnotation extends ConstellationDecoration {
  def decorationType: ConstellationDecoration.Type = ConstellationDecoration.AnnotationType

  implicit def contextJsonFormat[A: JsonFormat] = new JsonFormat[Context[A]] {
    def read(json: JsValue) = Context.successful(implicitly[JsonFormat[A]].read(json))

    def write(ctx: Context[A]) = ctx.future.value.map(_.flatMap(_._1)) match {
      case None             => JsNull
      case Some(Success(x)) => implicitly[JsonFormat[A]].write(x)
      case Some(Failure(t)) => ConstellationDecoration.from(t).get.decorationValue
    }
  }
}
