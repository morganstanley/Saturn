package com.ms.qaTools.saturn.lint.validators

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.saturn.lint.ResultError
import com.ms.qaTools.saturn.lint.ResultOK
import com.ms.qaTools.saturn.lint.ResultWarning
import com.ms.qaTools.saturn.lint.SaturnLintRuleResult
import com.ms.qaTools.saturn.resources.referenceResource.{ReferenceResource => MReferenceResource}
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.ReferenceComplexValueResourceHelper
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.ReferenceResourceHelper
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper
import com.ms.qaTools.saturn.values.{ReferenceComplexValue => MReferenceComplexValue}

object ReferenceValidator extends LintValidator {
  val rule:String = "SAT-REFERENCE-VALID-001"
  val description:String = "Attribute and Reference resources must refer to valid Attributes, Resources or Procedure Parameters."
    
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = {
    val resourceReferences = eObject.eAllContentsByType[MReferenceResource]().toSeq.filter{ r => !r.isValidReference && r.isEnabledDeep }
    val attributeReferences = eObject.eAllContentsByType[MReferenceComplexValue]().toSeq.filter{ r => !r.isValidReference && r.isEnabledDeep }

    if (!resourceReferences.isEmpty || !attributeReferences.isEmpty) (resourceReferences ++ attributeReferences).map {
      //TODO references with include files need to be validated
      case ref: MReferenceResource if (ref.getIncludeFile != null)     => ResultWarning(rule, s"Resource reference '${ref.getName}' with include file is not being validated.", Seq(ref))
      case ref: MReferenceComplexValue if (ref.getIncludeFile != null) => ResultWarning(rule, s"Attribute reference '${ref.getUserAttribute()}' with include file is not being validated.", Seq(ref))
      case eObject                                                     => ResultError(rule, description, Seq(eObject))
    }
    else                                                            Seq(ResultOK(rule, description)) 
  }
}