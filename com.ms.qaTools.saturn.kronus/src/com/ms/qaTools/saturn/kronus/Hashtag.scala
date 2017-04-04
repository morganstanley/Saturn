package com.ms.qaTools.saturn.kronus

import scala.collection.JavaConversions._

sealed abstract class Hashtag

object Hashtag {
  def apply(call: HashtagCall): Hashtag = call.getMethod.getName match {
    case "Resource"   => ResourceDef
    case "Step"       => StepDef
    case "Implicit"   => Implicit(call.getParameterValues.find(_.getName == "paramType").get.getValue)
    case "Attributes" => Attributes(call.getParameterValues.find(_.getName == "varName").get.getValue)
    case "Closeable"  => Closeable(call.getParameterValues.collect {case pv if pv.getName == "dependsOn" => pv.getValue})
  }
}

abstract class FunctionDefType extends Hashtag
case object ResourceDef extends FunctionDefType
case object StepDef     extends FunctionDefType

case class Implicit(paramType: String) extends Hashtag

case class Attributes(varName: String) extends Hashtag

case class Closeable(dependsOn: Seq[String]) extends Hashtag
