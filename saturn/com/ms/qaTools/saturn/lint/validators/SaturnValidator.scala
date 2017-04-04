package com.ms.qaTools.saturn.lint.validators

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.saturn.{Saturn => MSaturn}
import com.ms.qaTools.saturn.lint.ResultOK
import com.ms.qaTools.saturn.lint.ResultWarning
import com.ms.qaTools.saturn.lint.SaturnLintRuleResult

object SaturnValidator extends LintValidator {
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = RootEnabledValidator.validate(eObject)
}

object RootEnabledValidator extends LintValidator {
  val rule:String = "SAT-SATURN-ENABLED-001"
  val description:String = "The root Saturn object should be enabled."
    
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = {
    eObject match {
      case saturn:MSaturn if saturn.isEnabled() => Seq(ResultOK(rule, description))
      case _                                    => Seq(ResultWarning(rule, description, Seq(eObject)))
    }
  }
}