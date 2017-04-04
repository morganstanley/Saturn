package com.ms.qaTools.saturn.lint.validators

import scala.collection.JavaConversions.asScalaIterator

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.saturn.SaturnPackage
import com.ms.qaTools.saturn.lint.ResultOK
import com.ms.qaTools.saturn.lint.ResultWarning
import com.ms.qaTools.saturn.lint.SaturnLintRuleResult
import com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourcePackage
import com.ms.qaTools.saturn.values.ValuesPackage

object DeprecatedValidator extends LintValidator{
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = DeprecatedFeatureValidator.validate(eObject) ++ DeprecatedClassValidator.validate(eObject)
}

object DeprecatedFeatureValidator extends LintValidator {
  val rule:String = "SAT-OBJECTS-DEPRECATED-001"
  val description:String = "The following features are deprecated and are either unimplemented or will be decomissioned in a future release."
  val deprecatedFeatures = List(
    SaturnPackage.eINSTANCE.getAbstractRunGroup_Imports(),
    ValuesPackage.eINSTANCE.getReferenceComplexValue_ModuleAttribute(),
    ValuesPackage.eINSTANCE.getReferenceComplexValue_RunGroup(),
    ValuesPackage.eINSTANCE.getReferenceComplexValue_SaturnAttribute(),
    ReferenceResourcePackage.eINSTANCE.getReferenceResource_Advanced(),
    ReferenceResourcePackage.eINSTANCE.getReferenceResource_IncludeFileAdv(),
    ReferenceResourcePackage.eINSTANCE.getReferenceResource_ResourceAdv()
  )
  
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = {    
    val deprecatedEObjects = eObject.eAllContents().filter{eObject => deprecatedFeatures.contains(eObject.eContainingFeature())}.toSeq
    if(deprecatedEObjects.isEmpty) Seq(ResultOK(rule, description))
    else                           Seq(ResultWarning(rule, description, deprecatedEObjects))
  }
}

object DeprecatedClassValidator extends LintValidator {
  val rule:String = "SAT-OBJECTS-DEPRECATED-002"
  val description:String = "The following classes are deprecated and are either unimplemented or will be decomissioned in a future release."
  val deprecatedEClasses = List(
    SaturnPackage.eINSTANCE.getReferenceStep(),
    SaturnPackage.eINSTANCE.getXSplitStep(),
    SaturnPackage.eINSTANCE.getXmlDiffStep()
  )
  
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = {    
    val deprecatedEObjects = eObject.eAllContents().filter{eObject => deprecatedEClasses.exists(eClass => eObject.eClass().isSuperTypeOf(eClass))}.toSeq
    if(deprecatedEObjects.isEmpty) Seq(ResultOK(rule, description))
    else                           Seq(ResultWarning(rule, description, deprecatedEObjects))
  }
}