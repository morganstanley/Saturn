package com.ms.qaTools.saturn.util;

import com.ms.qaTools.saturn.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.ms.qaTools.saturn.AbstractLink;
import com.ms.qaTools.saturn.AbstractParameter;
import com.ms.qaTools.saturn.AbstractRunGroup;
import com.ms.qaTools.saturn.AbstractStep;
import com.ms.qaTools.saturn.AbstractTerminal;
import com.ms.qaTools.saturn.Attribute;
import com.ms.qaTools.saturn.AttributeParameter;
import com.ms.qaTools.saturn.CometStep;
import com.ms.qaTools.saturn.Config;
import com.ms.qaTools.saturn.CpsStep;
import com.ms.qaTools.saturn.CustomLink;
import com.ms.qaTools.saturn.DSConvertStep;
import com.ms.qaTools.saturn.DSValidatorStep;
import com.ms.qaTools.saturn.DataCompareStep;
import com.ms.qaTools.saturn.DataCompareSummaryStep;
import com.ms.qaTools.saturn.DocumentRoot;
import com.ms.qaTools.saturn.DocumentumStep;
import com.ms.qaTools.saturn.EnvValidatorStep;
import com.ms.qaTools.saturn.ExtractDDLStep;
import com.ms.qaTools.saturn.FailTerminal;
import com.ms.qaTools.saturn.FixManipStep;
import com.ms.qaTools.saturn.IncludeFile;
import com.ms.qaTools.saturn.JiraStep;
import com.ms.qaTools.saturn.MQStep;
import com.ms.qaTools.saturn.MailStep;
import com.ms.qaTools.saturn.NoopTerminal;
import com.ms.qaTools.saturn.OnFailLink;
import com.ms.qaTools.saturn.OnFinishLink;
import com.ms.qaTools.saturn.OnPassLink;
import com.ms.qaTools.saturn.P4Step;
import com.ms.qaTools.saturn.PassTerminal;
import com.ms.qaTools.saturn.PerlRunGroupModifier;
import com.ms.qaTools.saturn.ProcedureCallStep;
import com.ms.qaTools.saturn.PsManagerStep;
import com.ms.qaTools.saturn.Reference;
import com.ms.qaTools.saturn.ReferenceStep;
import com.ms.qaTools.saturn.ResourceParameter;
import com.ms.qaTools.saturn.RunCmdsStep;
import com.ms.qaTools.saturn.RunGroup;
import com.ms.qaTools.saturn.RunGroupImport;
import com.ms.qaTools.saturn.SQLStep;
import com.ms.qaTools.saturn.Saturn;
import com.ms.qaTools.saturn.SaturnPackage;
import com.ms.qaTools.saturn.SingularityStep;
import com.ms.qaTools.saturn.SoapIOStep;
import com.ms.qaTools.saturn.VmsStep;
import com.ms.qaTools.saturn.XSplitStep;
import com.ms.qaTools.saturn.Xml2CsvStep;
import com.ms.qaTools.saturn.XmlDiffStep;
import com.ms.qaTools.saturn.XmlGenStep;
import com.ms.qaTools.saturn.XmlManipStep;
import com.ms.qaTools.saturn.XmlValidatorStep;
import com.ms.qaTools.saturn.types.AbstractRunGroupModifier;
import com.ms.qaTools.saturn.values.ComplexValue;
import com.ms.qaTools.saturn.values.Describable;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.SaturnPackage
 * @generated
 */
public class SaturnSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static SaturnPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SaturnPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SaturnPackage.ABSTRACT_LINK:
      {
        AbstractLink abstractLink = (AbstractLink)theEObject;
        T result = caseAbstractLink(abstractLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.ABSTRACT_PARAMETER:
      {
        AbstractParameter abstractParameter = (AbstractParameter)theEObject;
        T result = caseAbstractParameter(abstractParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.ABSTRACT_RESOURCE_LINK:
      {
        AbstractResourceLink abstractResourceLink = (AbstractResourceLink)theEObject;
        T result = caseAbstractResourceLink(abstractResourceLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.ABSTRACT_RUN_GROUP:
      {
        AbstractRunGroup abstractRunGroup = (AbstractRunGroup)theEObject;
        T result = caseAbstractRunGroup(abstractRunGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.ABSTRACT_STEP:
      {
        AbstractStep abstractStep = (AbstractStep)theEObject;
        T result = caseAbstractStep(abstractStep);
        if (result == null) result = caseAbstractRunGroup(abstractStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.ABSTRACT_TERMINAL:
      {
        AbstractTerminal abstractTerminal = (AbstractTerminal)theEObject;
        T result = caseAbstractTerminal(abstractTerminal);
        if (result == null) result = caseAbstractStep(abstractTerminal);
        if (result == null) result = caseAbstractRunGroup(abstractTerminal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = caseComplexValue(attribute);
        if (result == null) result = caseDescribable(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.ATTRIBUTE_PARAMETER:
      {
        AttributeParameter attributeParameter = (AttributeParameter)theEObject;
        T result = caseAttributeParameter(attributeParameter);
        if (result == null) result = caseAbstractParameter(attributeParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.COMET_STEP:
      {
        CometStep cometStep = (CometStep)theEObject;
        T result = caseCometStep(cometStep);
        if (result == null) result = caseAbstractStep(cometStep);
        if (result == null) result = caseAbstractRunGroup(cometStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.CONFIG:
      {
        Config config = (Config)theEObject;
        T result = caseConfig(config);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.CPS_STEP:
      {
        CpsStep cpsStep = (CpsStep)theEObject;
        T result = caseCpsStep(cpsStep);
        if (result == null) result = caseAbstractStep(cpsStep);
        if (result == null) result = caseAbstractRunGroup(cpsStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.CUSTOM_LINK:
      {
        CustomLink customLink = (CustomLink)theEObject;
        T result = caseCustomLink(customLink);
        if (result == null) result = caseAbstractLink(customLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.DATA_COMPARE_STEP:
      {
        DataCompareStep dataCompareStep = (DataCompareStep)theEObject;
        T result = caseDataCompareStep(dataCompareStep);
        if (result == null) result = caseAbstractStep(dataCompareStep);
        if (result == null) result = caseAbstractRunGroup(dataCompareStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.DATA_COMPARE_SUMMARY_STEP:
      {
        DataCompareSummaryStep dataCompareSummaryStep = (DataCompareSummaryStep)theEObject;
        T result = caseDataCompareSummaryStep(dataCompareSummaryStep);
        if (result == null) result = caseAbstractStep(dataCompareSummaryStep);
        if (result == null) result = caseAbstractRunGroup(dataCompareSummaryStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.DOCUMENT_ROOT:
      {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.DOCUMENTUM_STEP:
      {
        DocumentumStep documentumStep = (DocumentumStep)theEObject;
        T result = caseDocumentumStep(documentumStep);
        if (result == null) result = caseAbstractStep(documentumStep);
        if (result == null) result = caseAbstractRunGroup(documentumStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.DS_CONVERT_STEP:
      {
        DSConvertStep dsConvertStep = (DSConvertStep)theEObject;
        T result = caseDSConvertStep(dsConvertStep);
        if (result == null) result = caseAbstractStep(dsConvertStep);
        if (result == null) result = caseAbstractRunGroup(dsConvertStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.DS_VALIDATOR_STEP:
      {
        DSValidatorStep dsValidatorStep = (DSValidatorStep)theEObject;
        T result = caseDSValidatorStep(dsValidatorStep);
        if (result == null) result = caseAbstractStep(dsValidatorStep);
        if (result == null) result = caseAbstractRunGroup(dsValidatorStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.ENV_VALIDATOR_STEP:
      {
        EnvValidatorStep envValidatorStep = (EnvValidatorStep)theEObject;
        T result = caseEnvValidatorStep(envValidatorStep);
        if (result == null) result = caseAbstractStep(envValidatorStep);
        if (result == null) result = caseAbstractRunGroup(envValidatorStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.EXTRACT_DDL_STEP:
      {
        ExtractDDLStep extractDDLStep = (ExtractDDLStep)theEObject;
        T result = caseExtractDDLStep(extractDDLStep);
        if (result == null) result = caseAbstractStep(extractDDLStep);
        if (result == null) result = caseAbstractRunGroup(extractDDLStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.FAIL_TERMINAL:
      {
        FailTerminal failTerminal = (FailTerminal)theEObject;
        T result = caseFailTerminal(failTerminal);
        if (result == null) result = caseAbstractTerminal(failTerminal);
        if (result == null) result = caseAbstractStep(failTerminal);
        if (result == null) result = caseAbstractRunGroup(failTerminal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.FIX_MANIP_STEP:
      {
        FixManipStep fixManipStep = (FixManipStep)theEObject;
        T result = caseFixManipStep(fixManipStep);
        if (result == null) result = caseAbstractStep(fixManipStep);
        if (result == null) result = caseAbstractRunGroup(fixManipStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.INCLUDE_FILE:
      {
        IncludeFile includeFile = (IncludeFile)theEObject;
        T result = caseIncludeFile(includeFile);
        if (result == null) result = caseComplexValue(includeFile);
        if (result == null) result = caseDescribable(includeFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.JIRA_STEP:
      {
        JiraStep jiraStep = (JiraStep)theEObject;
        T result = caseJiraStep(jiraStep);
        if (result == null) result = caseAbstractStep(jiraStep);
        if (result == null) result = caseAbstractRunGroup(jiraStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.KRONUS_STEP:
      {
        KronusStep kronusStep = (KronusStep)theEObject;
        T result = caseKronusStep(kronusStep);
        if (result == null) result = caseAbstractStep(kronusStep);
        if (result == null) result = caseAbstractRunGroup(kronusStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.MAIL_STEP:
      {
        MailStep mailStep = (MailStep)theEObject;
        T result = caseMailStep(mailStep);
        if (result == null) result = caseAbstractStep(mailStep);
        if (result == null) result = caseAbstractRunGroup(mailStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.MQ_STEP:
      {
        MQStep mqStep = (MQStep)theEObject;
        T result = caseMQStep(mqStep);
        if (result == null) result = caseAbstractStep(mqStep);
        if (result == null) result = caseAbstractRunGroup(mqStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.NOOP_TERMINAL:
      {
        NoopTerminal noopTerminal = (NoopTerminal)theEObject;
        T result = caseNoopTerminal(noopTerminal);
        if (result == null) result = caseAbstractTerminal(noopTerminal);
        if (result == null) result = caseAbstractStep(noopTerminal);
        if (result == null) result = caseAbstractRunGroup(noopTerminal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.ON_FAIL_LINK:
      {
        OnFailLink onFailLink = (OnFailLink)theEObject;
        T result = caseOnFailLink(onFailLink);
        if (result == null) result = caseAbstractLink(onFailLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.ON_FINISH_LINK:
      {
        OnFinishLink onFinishLink = (OnFinishLink)theEObject;
        T result = caseOnFinishLink(onFinishLink);
        if (result == null) result = caseAbstractLink(onFinishLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.ON_PASS_LINK:
      {
        OnPassLink onPassLink = (OnPassLink)theEObject;
        T result = caseOnPassLink(onPassLink);
        if (result == null) result = caseAbstractLink(onPassLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.P4_STEP:
      {
        P4Step p4Step = (P4Step)theEObject;
        T result = caseP4Step(p4Step);
        if (result == null) result = caseAbstractStep(p4Step);
        if (result == null) result = caseAbstractRunGroup(p4Step);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.PASS_TERMINAL:
      {
        PassTerminal passTerminal = (PassTerminal)theEObject;
        T result = casePassTerminal(passTerminal);
        if (result == null) result = caseAbstractTerminal(passTerminal);
        if (result == null) result = caseAbstractStep(passTerminal);
        if (result == null) result = caseAbstractRunGroup(passTerminal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.PERL_RUN_GROUP_MODIFIER:
      {
        PerlRunGroupModifier perlRunGroupModifier = (PerlRunGroupModifier)theEObject;
        T result = casePerlRunGroupModifier(perlRunGroupModifier);
        if (result == null) result = caseAbstractRunGroupModifier(perlRunGroupModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.PROCEDURE_CALL_STEP:
      {
        ProcedureCallStep procedureCallStep = (ProcedureCallStep)theEObject;
        T result = caseProcedureCallStep(procedureCallStep);
        if (result == null) result = caseAbstractStep(procedureCallStep);
        if (result == null) result = caseAbstractRunGroup(procedureCallStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.PS_MANAGER_STEP:
      {
        PsManagerStep psManagerStep = (PsManagerStep)theEObject;
        T result = casePsManagerStep(psManagerStep);
        if (result == null) result = caseAbstractStep(psManagerStep);
        if (result == null) result = caseAbstractRunGroup(psManagerStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.REFERENCE_STEP:
      {
        ReferenceStep referenceStep = (ReferenceStep)theEObject;
        T result = caseReferenceStep(referenceStep);
        if (result == null) result = caseAbstractStep(referenceStep);
        if (result == null) result = caseAbstractRunGroup(referenceStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.RESOURCE_LINK:
      {
        ResourceLink resourceLink = (ResourceLink)theEObject;
        T result = caseResourceLink(resourceLink);
        if (result == null) result = caseAbstractResourceLink(resourceLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.RESOURCE_NESTED_LINK:
      {
        ResourceNestedLink resourceNestedLink = (ResourceNestedLink)theEObject;
        T result = caseResourceNestedLink(resourceNestedLink);
        if (result == null) result = caseAbstractResourceLink(resourceNestedLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.RESOURCE_PARAMETER:
      {
        ResourceParameter resourceParameter = (ResourceParameter)theEObject;
        T result = caseResourceParameter(resourceParameter);
        if (result == null) result = caseAbstractParameter(resourceParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.RESOURCE_STEP_LINK:
      {
        ResourceStepLink resourceStepLink = (ResourceStepLink)theEObject;
        T result = caseResourceStepLink(resourceStepLink);
        if (result == null) result = caseAbstractResourceLink(resourceStepLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.RUN_CMDS_STEP:
      {
        RunCmdsStep runCmdsStep = (RunCmdsStep)theEObject;
        T result = caseRunCmdsStep(runCmdsStep);
        if (result == null) result = caseAbstractStep(runCmdsStep);
        if (result == null) result = caseAbstractRunGroup(runCmdsStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.RUN_GROUP:
      {
        RunGroup runGroup = (RunGroup)theEObject;
        T result = caseRunGroup(runGroup);
        if (result == null) result = caseAbstractRunGroup(runGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.RUN_GROUP_IMPORT:
      {
        RunGroupImport runGroupImport = (RunGroupImport)theEObject;
        T result = caseRunGroupImport(runGroupImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.SATURN:
      {
        Saturn saturn = (Saturn)theEObject;
        T result = caseSaturn(saturn);
        if (result == null) result = caseRunGroup(saturn);
        if (result == null) result = caseAbstractRunGroup(saturn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.SINGULARITY_STEP:
      {
        SingularityStep singularityStep = (SingularityStep)theEObject;
        T result = caseSingularityStep(singularityStep);
        if (result == null) result = caseAbstractStep(singularityStep);
        if (result == null) result = caseAbstractRunGroup(singularityStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.SOAP_IO_STEP:
      {
        SoapIOStep soapIOStep = (SoapIOStep)theEObject;
        T result = caseSoapIOStep(soapIOStep);
        if (result == null) result = caseAbstractStep(soapIOStep);
        if (result == null) result = caseAbstractRunGroup(soapIOStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.SQL_STEP:
      {
        SQLStep sqlStep = (SQLStep)theEObject;
        T result = caseSQLStep(sqlStep);
        if (result == null) result = caseAbstractStep(sqlStep);
        if (result == null) result = caseAbstractRunGroup(sqlStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.VMS_STEP:
      {
        VmsStep vmsStep = (VmsStep)theEObject;
        T result = caseVmsStep(vmsStep);
        if (result == null) result = caseAbstractStep(vmsStep);
        if (result == null) result = caseAbstractRunGroup(vmsStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.XML2_CSV_STEP:
      {
        Xml2CsvStep xml2CsvStep = (Xml2CsvStep)theEObject;
        T result = caseXml2CsvStep(xml2CsvStep);
        if (result == null) result = caseAbstractStep(xml2CsvStep);
        if (result == null) result = caseAbstractRunGroup(xml2CsvStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.XML_DIFF_STEP:
      {
        XmlDiffStep xmlDiffStep = (XmlDiffStep)theEObject;
        T result = caseXmlDiffStep(xmlDiffStep);
        if (result == null) result = caseAbstractStep(xmlDiffStep);
        if (result == null) result = caseAbstractRunGroup(xmlDiffStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.XML_GEN_STEP:
      {
        XmlGenStep xmlGenStep = (XmlGenStep)theEObject;
        T result = caseXmlGenStep(xmlGenStep);
        if (result == null) result = caseAbstractStep(xmlGenStep);
        if (result == null) result = caseAbstractRunGroup(xmlGenStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.XML_MANIP_STEP:
      {
        XmlManipStep xmlManipStep = (XmlManipStep)theEObject;
        T result = caseXmlManipStep(xmlManipStep);
        if (result == null) result = caseAbstractStep(xmlManipStep);
        if (result == null) result = caseAbstractRunGroup(xmlManipStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.XML_VALIDATOR_STEP:
      {
        XmlValidatorStep xmlValidatorStep = (XmlValidatorStep)theEObject;
        T result = caseXmlValidatorStep(xmlValidatorStep);
        if (result == null) result = caseAbstractStep(xmlValidatorStep);
        if (result == null) result = caseAbstractRunGroup(xmlValidatorStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SaturnPackage.XSPLIT_STEP:
      {
        XSplitStep xSplitStep = (XSplitStep)theEObject;
        T result = caseXSplitStep(xSplitStep);
        if (result == null) result = caseAbstractStep(xSplitStep);
        if (result == null) result = caseAbstractRunGroup(xSplitStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractLink(AbstractLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Parameter</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractParameter(AbstractParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Resource Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Resource Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractResourceLink(AbstractResourceLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Run Group</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Run Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractRunGroup(AbstractRunGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractStep(AbstractStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Terminal</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Terminal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractTerminal(AbstractTerminal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Parameter</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeParameter(AttributeParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comet Step</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comet Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCometStep(CometStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Config</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfig(Config object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cps Step</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cps Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCpsStep(CpsStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomLink(CustomLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Compare Step</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Compare Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataCompareStep(DataCompareStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Compare Summary Step</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Compare Summary Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataCompareSummaryStep(DataCompareSummaryStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentRoot(DocumentRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Documentum Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Documentum Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentumStep(DocumentumStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DS Convert Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DS Convert Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSConvertStep(DSConvertStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DS Validator Step</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DS Validator Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDSValidatorStep(DSValidatorStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Env Validator Step</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Env Validator Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvValidatorStep(EnvValidatorStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extract DDL Step</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extract DDL Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtractDDLStep(ExtractDDLStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fail Terminal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fail Terminal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFailTerminal(FailTerminal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fix Manip Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fix Manip Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFixManipStep(FixManipStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncludeFile(IncludeFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jira Step</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jira Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJiraStep(JiraStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kronus Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kronus Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKronusStep(KronusStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mail Step</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mail Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMailStep(MailStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MQ Step</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MQ Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMQStep(MQStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Noop Terminal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Noop Terminal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoopTerminal(NoopTerminal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>On Fail Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>On Fail Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOnFailLink(OnFailLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>On Finish Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>On Finish Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOnFinishLink(OnFinishLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>On Pass Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>On Pass Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOnPassLink(OnPassLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>P4 Step</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>P4 Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseP4Step(P4Step object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pass Terminal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pass Terminal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePassTerminal(PassTerminal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Perl Run Group Modifier</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Perl Run Group Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePerlRunGroupModifier(PerlRunGroupModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure Call Step</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure Call Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedureCallStep(ProcedureCallStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ps Manager Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ps Manager Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePsManagerStep(PsManagerStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceStep(ReferenceStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceLink(ResourceLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Nested Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Nested Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceNestedLink(ResourceNestedLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Parameter</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceParameter(ResourceParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Step Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Step Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceStepLink(ResourceStepLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Run Cmds Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Run Cmds Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRunCmdsStep(RunCmdsStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Run Group</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Run Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRunGroup(RunGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Run Group Import</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Run Group Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRunGroupImport(RunGroupImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Saturn</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Saturn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSaturn(Saturn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Singularity Step</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Singularity Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingularityStep(SingularityStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Soap IO Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Soap IO Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSoapIOStep(SoapIOStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SQL Step</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SQL Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSQLStep(SQLStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vms Step</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vms Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVmsStep(VmsStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xml2 Csv Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xml2 Csv Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXml2CsvStep(Xml2CsvStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xml Diff Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xml Diff Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXmlDiffStep(XmlDiffStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xml Gen Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xml Gen Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXmlGenStep(XmlGenStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xml Manip Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xml Manip Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXmlManipStep(XmlManipStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xml Validator Step</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xml Validator Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXmlValidatorStep(XmlValidatorStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XSplit Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XSplit Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXSplitStep(XSplitStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Describable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Describable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescribable(Describable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexValue(ComplexValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Run Group Modifier</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Run Group Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractRunGroupModifier(AbstractRunGroupModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
   * anyway. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} // SaturnSwitch
/*
Copyright 2017 Morgan Stanley

Licensed under the GNU Lesser General Public License Version 3 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

https://www.gnu.org/licenses/lgpl-3.0.en.html

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

IN ADDITION, THE FOLLOWING DISCLAIMER APPLIES IN CONNECTION WITH THIS PROGRAM:

THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY
WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY
USING THIS OR ANOTHER EQUIVALENT DISCLAIMER IN ADDITION TO ANY OTHER REQUIRED
LICENSE TERMS.
*/
