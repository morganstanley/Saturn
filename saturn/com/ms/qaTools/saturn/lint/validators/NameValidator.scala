package com.ms.qaTools.saturn.lint.validators

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.saturn.kronus.backport.KronusCallConfiguration
import com.ms.qaTools.saturn.lint.{SaturnLintRuleResult, ResultOK, ResultWarning, ResultError}
import com.ms.qaTools.saturn.types.KronusResource
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper

object NameValidator extends LintValidator {
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = ObjectNamePatternValidator.validate(eObject) ++ ObjectNameUniqueValidator.validate(eObject)
}

object ObjectNamePatternValidator extends LintValidator {
  val rule:String = "SAT-OBJECT-NAME-001"
  val description:String = "Objects(attributes, resources and runGroups) within a given runGroup must have names matching the pattern: '^[A-Za-z0-9_]+$'."
  
  def validate(eObjects:Iterator[(EObject, String)]):Seq[SaturnLintRuleResult] = {
    val validationResults = eObjects.collect{
      case (eObject, name) if(name == null || !name.matches("^[A-Za-z0-9_]+$")) => ResultError(rule, description, Seq(eObject))
      case (eObject, name) if(!name.matches("^[A-Z][A-Za-z0-9_]*$")) => ResultWarning(rule, s"Object(attribute, resource or runGroup) '${name}' should have a capitalized name.", Seq(eObject))
    }
    if(validationResults.isEmpty)
      Seq(ResultOK(rule, description))
    else
      validationResults.toSeq
  }
    
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = validate(eObject.eAllNamedObjects(excludeInlineResources = true))
}

object ObjectNameUniqueValidator extends LintValidator {
  val rule:String = "SAT-OBJECT-NAME-002"
  val description:String = "Objects(attributes, resources and runGroups) within a given runGroup must have unique names."
  def validate(eObjects:Iterator[(EObject,String)]):Seq[SaturnLintRuleResult] = {
    val eObjectsByParent = eObjects.toSeq groupBy {
      case (x, _) if isKronusResource(x) => x.eContainer.eContainer
      case (x, _)                        => x.eContainer.containingRunGroup
    }
    val failedResultGroups = for((_, childrenPairs) <- eObjectsByParent) yield {
      val groupedChildren = childrenPairs.groupBy(_._2)
      val failedResultGroups = for((name,children) <- groupedChildren) yield if(children.size > 1) Some(ResultError(rule, description,children.map{_._1})) else None
      failedResultGroups.toSeq.flatten
    }
    val failedResults = failedResultGroups.toSeq.flatten
    if(failedResults.isEmpty) Seq(ResultOK(rule, description)) else failedResults
  } 
    
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = validate(eObject.eAllNamedObjects(excludeInlineResources = true))

  def isKronusResource(x: EObject) = {
    val p = x.eContainer
    p.isInstanceOf[KronusCallConfiguration] && p.eContainer.isInstanceOf[KronusResource]
  }
}