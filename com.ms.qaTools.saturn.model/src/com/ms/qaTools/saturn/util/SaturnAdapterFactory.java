package com.ms.qaTools.saturn.util;

import com.ms.qaTools.saturn.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.SaturnPackage
 * @generated
 */
public class SaturnAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static SaturnPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SaturnPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc --> This implementation
   * returns <code>true</code> if the object is either the model's package or is an instance object of the model. <!--
   * end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SaturnSwitch<Adapter> modelSwitch = new SaturnSwitch<Adapter>()
    {
      @Override
      public Adapter caseAbstractLink(AbstractLink object)
      {
        return createAbstractLinkAdapter();
      }
      @Override
      public Adapter caseAbstractParameter(AbstractParameter object)
      {
        return createAbstractParameterAdapter();
      }
      @Override
      public Adapter caseAbstractResourceLink(AbstractResourceLink object)
      {
        return createAbstractResourceLinkAdapter();
      }
      @Override
      public Adapter caseAbstractRunGroup(AbstractRunGroup object)
      {
        return createAbstractRunGroupAdapter();
      }
      @Override
      public Adapter caseAbstractStep(AbstractStep object)
      {
        return createAbstractStepAdapter();
      }
      @Override
      public Adapter caseAbstractTerminal(AbstractTerminal object)
      {
        return createAbstractTerminalAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseAttributeParameter(AttributeParameter object)
      {
        return createAttributeParameterAdapter();
      }
      @Override
      public Adapter caseCometStep(CometStep object)
      {
        return createCometStepAdapter();
      }
      @Override
      public Adapter caseConfig(Config object)
      {
        return createConfigAdapter();
      }
      @Override
      public Adapter caseCpsStep(CpsStep object)
      {
        return createCpsStepAdapter();
      }
      @Override
      public Adapter caseCustomLink(CustomLink object)
      {
        return createCustomLinkAdapter();
      }
      @Override
      public Adapter caseDataCompareStep(DataCompareStep object)
      {
        return createDataCompareStepAdapter();
      }
      @Override
      public Adapter caseDataCompareSummaryStep(DataCompareSummaryStep object)
      {
        return createDataCompareSummaryStepAdapter();
      }
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object)
      {
        return createDocumentRootAdapter();
      }
      @Override
      public Adapter caseDocumentumStep(DocumentumStep object)
      {
        return createDocumentumStepAdapter();
      }
      @Override
      public Adapter caseDSConvertStep(DSConvertStep object)
      {
        return createDSConvertStepAdapter();
      }
      @Override
      public Adapter caseDSValidatorStep(DSValidatorStep object)
      {
        return createDSValidatorStepAdapter();
      }
      @Override
      public Adapter caseEnvValidatorStep(EnvValidatorStep object)
      {
        return createEnvValidatorStepAdapter();
      }
      @Override
      public Adapter caseExtractDDLStep(ExtractDDLStep object)
      {
        return createExtractDDLStepAdapter();
      }
      @Override
      public Adapter caseFailTerminal(FailTerminal object)
      {
        return createFailTerminalAdapter();
      }
      @Override
      public Adapter caseFixManipStep(FixManipStep object)
      {
        return createFixManipStepAdapter();
      }
      @Override
      public Adapter caseIncludeFile(IncludeFile object)
      {
        return createIncludeFileAdapter();
      }
      @Override
      public Adapter caseJiraStep(JiraStep object)
      {
        return createJiraStepAdapter();
      }
      @Override
      public Adapter caseKronusStep(KronusStep object)
      {
        return createKronusStepAdapter();
      }
      @Override
      public Adapter caseMailStep(MailStep object)
      {
        return createMailStepAdapter();
      }
      @Override
      public Adapter caseMQStep(MQStep object)
      {
        return createMQStepAdapter();
      }
      @Override
      public Adapter caseNoopTerminal(NoopTerminal object)
      {
        return createNoopTerminalAdapter();
      }
      @Override
      public Adapter caseOnFailLink(OnFailLink object)
      {
        return createOnFailLinkAdapter();
      }
      @Override
      public Adapter caseOnFinishLink(OnFinishLink object)
      {
        return createOnFinishLinkAdapter();
      }
      @Override
      public Adapter caseOnPassLink(OnPassLink object)
      {
        return createOnPassLinkAdapter();
      }
      @Override
      public Adapter caseP4Step(P4Step object)
      {
        return createP4StepAdapter();
      }
      @Override
      public Adapter casePassTerminal(PassTerminal object)
      {
        return createPassTerminalAdapter();
      }
      @Override
      public Adapter casePerlRunGroupModifier(PerlRunGroupModifier object)
      {
        return createPerlRunGroupModifierAdapter();
      }
      @Override
      public Adapter caseProcedureCallStep(ProcedureCallStep object)
      {
        return createProcedureCallStepAdapter();
      }
      @Override
      public Adapter casePsManagerStep(PsManagerStep object)
      {
        return createPsManagerStepAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseReferenceStep(ReferenceStep object)
      {
        return createReferenceStepAdapter();
      }
      @Override
      public Adapter caseResourceLink(ResourceLink object)
      {
        return createResourceLinkAdapter();
      }
      @Override
      public Adapter caseResourceNestedLink(ResourceNestedLink object)
      {
        return createResourceNestedLinkAdapter();
      }
      @Override
      public Adapter caseResourceParameter(ResourceParameter object)
      {
        return createResourceParameterAdapter();
      }
      @Override
      public Adapter caseResourceStepLink(ResourceStepLink object)
      {
        return createResourceStepLinkAdapter();
      }
      @Override
      public Adapter caseRunCmdsStep(RunCmdsStep object)
      {
        return createRunCmdsStepAdapter();
      }
      @Override
      public Adapter caseRunGroup(RunGroup object)
      {
        return createRunGroupAdapter();
      }
      @Override
      public Adapter caseRunGroupImport(RunGroupImport object)
      {
        return createRunGroupImportAdapter();
      }
      @Override
      public Adapter caseSaturn(Saturn object)
      {
        return createSaturnAdapter();
      }
      @Override
      public Adapter caseSingularityStep(SingularityStep object)
      {
        return createSingularityStepAdapter();
      }
      @Override
      public Adapter caseSoapIOStep(SoapIOStep object)
      {
        return createSoapIOStepAdapter();
      }
      @Override
      public Adapter caseSQLStep(SQLStep object)
      {
        return createSQLStepAdapter();
      }
      @Override
      public Adapter caseVmsStep(VmsStep object)
      {
        return createVmsStepAdapter();
      }
      @Override
      public Adapter caseXml2CsvStep(Xml2CsvStep object)
      {
        return createXml2CsvStepAdapter();
      }
      @Override
      public Adapter caseXmlDiffStep(XmlDiffStep object)
      {
        return createXmlDiffStepAdapter();
      }
      @Override
      public Adapter caseXmlGenStep(XmlGenStep object)
      {
        return createXmlGenStepAdapter();
      }
      @Override
      public Adapter caseXmlManipStep(XmlManipStep object)
      {
        return createXmlManipStepAdapter();
      }
      @Override
      public Adapter caseXmlValidatorStep(XmlValidatorStep object)
      {
        return createXmlValidatorStepAdapter();
      }
      @Override
      public Adapter caseXSplitStep(XSplitStep object)
      {
        return createXSplitStepAdapter();
      }
      @Override
      public Adapter caseDescribable(Describable object)
      {
        return createDescribableAdapter();
      }
      @Override
      public Adapter caseComplexValue(ComplexValue object)
      {
        return createComplexValueAdapter();
      }
      @Override
      public Adapter caseAbstractRunGroupModifier(AbstractRunGroupModifier object)
      {
        return createAbstractRunGroupModifierAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.AbstractLink <em>Abstract Link</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.AbstractLink
   * @generated
   */
  public Adapter createAbstractLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.AbstractParameter <em>Abstract Parameter</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.AbstractParameter
   * @generated
   */
  public Adapter createAbstractParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.AbstractResourceLink <em>Abstract Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.AbstractResourceLink
   * @generated
   */
  public Adapter createAbstractResourceLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.AbstractRunGroup <em>Abstract Run Group</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.AbstractRunGroup
   * @generated
   */
  public Adapter createAbstractRunGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.AbstractStep <em>Abstract Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.AbstractStep
   * @generated
   */
  public Adapter createAbstractStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.AbstractTerminal <em>Abstract Terminal</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.AbstractTerminal
   * @generated
   */
  public Adapter createAbstractTerminalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.Attribute <em>Attribute</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.AttributeParameter <em>Attribute Parameter</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.AttributeParameter
   * @generated
   */
  public Adapter createAttributeParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.CometStep <em>Comet Step</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.CometStep
   * @generated
   */
  public Adapter createCometStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.Config <em>Config</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.Config
   * @generated
   */
  public Adapter createConfigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.CpsStep <em>Cps Step</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.CpsStep
   * @generated
   */
  public Adapter createCpsStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.CustomLink <em>Custom Link</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.CustomLink
   * @generated
   */
  public Adapter createCustomLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.DataCompareStep <em>Data Compare Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.DataCompareStep
   * @generated
   */
  public Adapter createDataCompareStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.DataCompareSummaryStep <em>Data Compare Summary Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we
   * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.DataCompareSummaryStep
   * @generated
   */
  public Adapter createDataCompareSummaryStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.DocumentRoot
   * @generated
   */
  public Adapter createDocumentRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.DocumentumStep <em>Documentum Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.DocumentumStep
   * @generated
   */
  public Adapter createDocumentumStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.DSConvertStep <em>DS Convert Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.DSConvertStep
   * @generated
   */
  public Adapter createDSConvertStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.DSValidatorStep <em>DS Validator Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.DSValidatorStep
   * @generated
   */
  public Adapter createDSValidatorStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.EnvValidatorStep <em>Env Validator Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.EnvValidatorStep
   * @generated
   */
  public Adapter createEnvValidatorStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.ExtractDDLStep <em>Extract DDL Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.ExtractDDLStep
   * @generated
   */
  public Adapter createExtractDDLStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.FailTerminal <em>Fail Terminal</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.FailTerminal
   * @generated
   */
  public Adapter createFailTerminalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.FixManipStep <em>Fix Manip Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.FixManipStep
   * @generated
   */
  public Adapter createFixManipStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.IncludeFile <em>Include File</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.IncludeFile
   * @generated
   */
  public Adapter createIncludeFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.JiraStep <em>Jira Step</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.JiraStep
   * @generated
   */
  public Adapter createJiraStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.KronusStep <em>Kronus Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.KronusStep
   * @generated
   */
  public Adapter createKronusStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.MailStep <em>Mail Step</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.MailStep
   * @generated
   */
  public Adapter createMailStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.MQStep <em>MQ Step</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.MQStep
   * @generated
   */
  public Adapter createMQStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.NoopTerminal <em>Noop Terminal</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.NoopTerminal
   * @generated
   */
  public Adapter createNoopTerminalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.OnFailLink <em>On Fail Link</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.OnFailLink
   * @generated
   */
  public Adapter createOnFailLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.OnFinishLink <em>On Finish Link</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.OnFinishLink
   * @generated
   */
  public Adapter createOnFinishLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.OnPassLink <em>On Pass Link</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.OnPassLink
   * @generated
   */
  public Adapter createOnPassLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.P4Step <em>P4 Step</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.P4Step
   * @generated
   */
  public Adapter createP4StepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.PassTerminal <em>Pass Terminal</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.PassTerminal
   * @generated
   */
  public Adapter createPassTerminalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.PerlRunGroupModifier <em>Perl Run Group Modifier</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.PerlRunGroupModifier
   * @generated
   */
  public Adapter createPerlRunGroupModifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.ProcedureCallStep <em>Procedure Call Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.ProcedureCallStep
   * @generated
   */
  public Adapter createProcedureCallStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.PsManagerStep <em>Ps Manager Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful
   * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.PsManagerStep
   * @generated
   */
  public Adapter createPsManagerStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.Reference <em>Reference</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.ReferenceStep <em>Reference Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.ReferenceStep
   * @generated
   */
  public Adapter createReferenceStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.ResourceLink <em>Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.ResourceLink
   * @generated
   */
  public Adapter createResourceLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.ResourceNestedLink <em>Resource Nested Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.ResourceNestedLink
   * @generated
   */
  public Adapter createResourceNestedLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.ResourceParameter <em>Resource Parameter</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.ResourceParameter
   * @generated
   */
  public Adapter createResourceParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.ResourceStepLink <em>Resource Step Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.ResourceStepLink
   * @generated
   */
  public Adapter createResourceStepLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.RunCmdsStep <em>Run Cmds Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.RunCmdsStep
   * @generated
   */
  public Adapter createRunCmdsStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.RunGroup <em>Run Group</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.RunGroup
   * @generated
   */
  public Adapter createRunGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.RunGroupImport <em>Run Group Import</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.RunGroupImport
   * @generated
   */
  public Adapter createRunGroupImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.Saturn <em>Saturn</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.Saturn
   * @generated
   */
  public Adapter createSaturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.SingularityStep <em>Singularity Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.SingularityStep
   * @generated
   */
  public Adapter createSingularityStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.SoapIOStep <em>Soap IO Step</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.SoapIOStep
   * @generated
   */
  public Adapter createSoapIOStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.SQLStep <em>SQL Step</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.SQLStep
   * @generated
   */
  public Adapter createSQLStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.VmsStep <em>Vms Step</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.VmsStep
   * @generated
   */
  public Adapter createVmsStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.Xml2CsvStep <em>Xml2 Csv Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.Xml2CsvStep
   * @generated
   */
  public Adapter createXml2CsvStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.XmlDiffStep <em>Xml Diff Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.XmlDiffStep
   * @generated
   */
  public Adapter createXmlDiffStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.XmlGenStep <em>Xml Gen Step</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.XmlGenStep
   * @generated
   */
  public Adapter createXmlGenStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.XmlManipStep <em>Xml Manip Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.XmlManipStep
   * @generated
   */
  public Adapter createXmlManipStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.XmlValidatorStep <em>Xml Validator Step</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can
   * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.XmlValidatorStep
   * @generated
   */
  public Adapter createXmlValidatorStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.XSplitStep <em>XSplit Step</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.XSplitStep
   * @generated
   */
  public Adapter createXSplitStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.values.Describable <em>Describable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.values.Describable
   * @generated
   */
  public Adapter createDescribableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.values.ComplexValue <em>Complex Value</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily
   * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.values.ComplexValue
   * @generated
   */
  public Adapter createComplexValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ms.qaTools.saturn.types.AbstractRunGroupModifier <em>Abstract Run Group Modifier</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we
   * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @see com.ms.qaTools.saturn.types.AbstractRunGroupModifier
   * @generated
   */
  public Adapter createAbstractRunGroupModifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc --> This default implementation returns null. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} // SaturnAdapterFactory
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
