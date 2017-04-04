package com.ms.qaTools.saturn.lint.validators

import org.eclipse.emf.ecore.EObject
import com.ms.qaTools.saturn.lint.SaturnLintRuleResult

object RepetitionValidator extends LintValidator {
  def validate(eObject:EObject) = ForEachValidator.validate(eObject) ++
                                  ForEachXPathValidator.validate(eObject) ++
                                  ForValidator.validate(eObject)
}

object ForEachXPathValidator extends LintValidator {
  // must have a dataSet
  // is mappings present, mappings must be valid:
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = Nil
}

object ForEachValidator extends LintValidator {
  // must have a dataSet
  // is mappings present, mappings must be valid:
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = Nil
}

object ForValidator extends LintValidator {
  val rule:String = "SAT-OBJECT-NAME-002"
  val description:String = "Objects(attributes, resources and runGroups) within a given runGroup must have unique names."
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = Nil
}