package com.ms.qaTools.saturn.dsl.annotation

import com.ms.qaTools.saturn.kronus.runtime.ConstellationDecoration
import com.ms.qaTools.saturn.kronus.runtime.DynamicAnnotation
import com.ms.qaTools.saturn.runtime.WriteOnlyJsonFormat
import com.ms.qaTools.saturn.util.Util
import com.ms.qaTools.toolkit.Status

import spray.json._

sealed trait OnResultStatus
case object OnPassResultStatus extends OnResultStatus
case object OnFailResultStatus extends OnResultStatus
case object OnAnyResultStatus extends OnResultStatus

object OnResultStatus {
  implicit object JsonFormat extends WriteOnlyJsonFormat[OnResultStatus] {
    def write(obj: OnResultStatus) = JsString(obj.toString)
  }
}

object ScenarioAnnotation extends DefaultJsonProtocol {
  object ScenarioType extends ConstellationDecoration.Type("Meta.Scenario")
  implicit val jsonFormat = jsonFormat12(apply)
}

case class ScenarioAnnotation(
  name: Option[String]            = None,
  title: Option[String] = None,
  onStatus: OnResultStatus        = OnAnyResultStatus,
  isScenario: Boolean             = false,
  expandOnPass: Boolean           = false,
  expandOnStatus: Option[OnResultStatus]  = Some(OnFailResultStatus),
  hideHeader: Boolean             = false,
  hideRepeatingHeader: Boolean    = false,
  hideContent: Boolean            = false,
  hideRepeatingContent: Boolean   = false,
  showIterationNo: Boolean        = true,
  ignored: Boolean                = false) extends Annotation with DynamicAnnotation {

  //  rc.appendScenarioAnnotation(this)
  def expandElement(s: Status) =
    //to not break the model...
    if(expandOnPass && s.passed) true
    else
      expandOnStatus.map{
        case OnPassResultStatus => s.passed
        case OnFailResultStatus => s.failed
        case OnAnyResultStatus  => true
      }.getOrElse(false)

  def decorationValue = this.toJson
  override def decorationType = if (isScenario) ScenarioAnnotation.ScenarioType else super.decorationType
}

object ALMMapping {
  implicit val jsonFormat = {
    import DefaultJsonProtocol._
    jsonFormat3(apply)
  }

  protected val RunGroupIDRegex = """(\w+)/(\w+):(\w+)\s?.*""".r
  def fromRunGroupID(s: String): Option[ALMMapping] = Util.parseRunGroupID(s).map((apply _).tupled)
}

case class ALMMapping(domain: String, project: String, id: String) extends Annotation with DynamicAnnotation {
  override def decorationType = ConstellationDecoration.Type("ALM.Mapping")
  def decorationValue = this.toJson

  def toCode: String = {
    import scala.reflect.runtime.universe._
    s"${this.getClass.getName}(${Literal(Constant(domain))}, ${Literal(Constant(project))}, ${Literal(Constant(id))})"
  }
}
