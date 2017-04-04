package com.ms.qaTools.saturn.lint

import org.eclipse.emf.ecore.EObject
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils._
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Status

case class SaturnLintResult(override val status:Status, validationResults:Seq[SaturnLintRuleResult]) extends Result

sealed trait SaturnLintRuleResult {
  def rule:String
  def description:String
  
  def status:String
  def isOk:Boolean
  def isWarning:Boolean
  def isError:Boolean
  def level: Int
  
  def eObjects:Seq[EObject] = Nil

  def fullDescription: Seq[String] = Seq(rule, description, eObjects.map(_.eObjectToPath).mkString(","))
}

object SaturnLintRuleResult extends Ordering.ExtraImplicits {
  implicit val saturnLintRuleResultOrdering: Ordering[SaturnLintRuleResult] = Ordering.by(_.level)
}

case class ResultOK(rule:String, description:String) extends SaturnLintRuleResult {
  override val status = "OK"
  override val isOk = true
  override val isWarning = false
  override val isError = false
  def level = 0
}

case class ResultWarning(rule:String, description:String, override val eObjects:Seq[EObject]) extends SaturnLintRuleResult {
  override val status = "WARNING"
  override val isOk = false
  override val isWarning = true
  override val isError = false
  def level = 1
}

case class ResultError(rule:String, description:String, override val eObjects:Seq[EObject]) extends SaturnLintRuleResult {
  override val status = "ERROR"
  override val isOk = false
  override val isWarning = false
  override val isError = true
  def level = 2
}