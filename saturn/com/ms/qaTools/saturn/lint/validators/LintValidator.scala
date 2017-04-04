package com.ms.qaTools.saturn.lint.validators

import org.eclipse.emf.ecore.EObject
import com.ms.qaTools.saturn.lint.SaturnLintRuleResult

trait LintValidator {
  def validate(eObject:EObject):Seq[SaturnLintRuleResult]
}