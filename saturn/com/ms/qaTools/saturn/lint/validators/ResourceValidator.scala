package com.ms.qaTools.saturn.lint.validators

import com.ms.qaTools.saturn.lint.SaturnLintRuleResult
import org.eclipse.emf.ecore.EObject
import com.ms.qaTools.saturn.SaturnPackage
import com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallModulePackage
import com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage
import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage
import com.ms.qaTools.saturn.types.TypesPackage
import com.ms.qaTools.saturn.lint.ResultOK
import com.ms.qaTools.saturn.lint.ResultError
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils._
import com.ms.qaTools.saturn.types.{NamedResourceDefinition => MNamedResourceDefinition}
import com.ms.qaTools.saturn.types.{DeviceResourceDefinition => MDeviceResourceDefinition}

object ResourceValidator extends LintValidator {
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = DataSetResourceValidator.validate(eObject)

}

object DataSetResourceValidator extends LintValidator {
  val rule:String = "SAT-RESOURCE-DEVICE-001"
  val description:String = "Device resources used in place of reference or dataSet resources."
  
  val deviceFeatures = Seq(
    SaturnPackage.eINSTANCE.getAbstractRunGroup_Resources(),
    SaturnPackage.eINSTANCE.getResourceParameter_DefaultResource(),
    ProcedureCallModulePackage.eINSTANCE.getResourceArgument_Resource(),
    DatacompareModulePackage.eINSTANCE.getOutput_Resource(),
    MqModulePackage.eINSTANCE.getMQConfiguration_MQResource(),
    SqlModulePackage.eINSTANCE.getSQLConfiguration_DatabaseResource(),
    SoapIOModulePackage.eINSTANCE.getSoapIOConfiguration_SoapIOResource(),
    TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource()
  )    
    
  def validate(eObject:EObject):Seq[SaturnLintRuleResult] = {
    val resources = eObject.eAllContentsByType[MNamedResourceDefinition]()
    val invalidDeviceResources = resources.filter{resource => !deviceFeatures.contains(resource.eContainingFeature())}.collect{case d:MDeviceResourceDefinition => d}.toSeq
    if(invalidDeviceResources.isEmpty) Seq(ResultOK(rule, description)) 
    else                               invalidDeviceResources.map{eObject => ResultError(rule, description, Seq(eObject))}
  }
}