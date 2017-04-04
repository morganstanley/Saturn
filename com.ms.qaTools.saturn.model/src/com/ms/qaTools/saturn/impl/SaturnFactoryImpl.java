package com.ms.qaTools.saturn.impl;

import com.ms.qaTools.saturn.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import com.ms.qaTools.saturn.IncludeFileType;
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
import com.ms.qaTools.saturn.SaturnFactory;
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

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class SaturnFactoryImpl extends EFactoryImpl implements SaturnFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static SaturnFactory init()
  {
    try
    {
      SaturnFactory theSaturnFactory = (SaturnFactory)EPackage.Registry.INSTANCE.getEFactory(SaturnPackage.eNS_URI);
      if (theSaturnFactory != null)
      {
        return theSaturnFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SaturnFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SaturnPackage.ATTRIBUTE: return createAttribute();
      case SaturnPackage.ATTRIBUTE_PARAMETER: return createAttributeParameter();
      case SaturnPackage.COMET_STEP: return createCometStep();
      case SaturnPackage.CONFIG: return createConfig();
      case SaturnPackage.CPS_STEP: return createCpsStep();
      case SaturnPackage.CUSTOM_LINK: return createCustomLink();
      case SaturnPackage.DATA_COMPARE_STEP: return createDataCompareStep();
      case SaturnPackage.DATA_COMPARE_SUMMARY_STEP: return createDataCompareSummaryStep();
      case SaturnPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case SaturnPackage.DOCUMENTUM_STEP: return createDocumentumStep();
      case SaturnPackage.DS_CONVERT_STEP: return createDSConvertStep();
      case SaturnPackage.DS_VALIDATOR_STEP: return createDSValidatorStep();
      case SaturnPackage.ENV_VALIDATOR_STEP: return createEnvValidatorStep();
      case SaturnPackage.EXTRACT_DDL_STEP: return createExtractDDLStep();
      case SaturnPackage.FAIL_TERMINAL: return createFailTerminal();
      case SaturnPackage.FIX_MANIP_STEP: return createFixManipStep();
      case SaturnPackage.INCLUDE_FILE: return createIncludeFile();
      case SaturnPackage.JIRA_STEP: return createJiraStep();
      case SaturnPackage.KRONUS_STEP: return createKronusStep();
      case SaturnPackage.MAIL_STEP: return createMailStep();
      case SaturnPackage.MQ_STEP: return createMQStep();
      case SaturnPackage.NOOP_TERMINAL: return createNoopTerminal();
      case SaturnPackage.ON_FAIL_LINK: return createOnFailLink();
      case SaturnPackage.ON_FINISH_LINK: return createOnFinishLink();
      case SaturnPackage.ON_PASS_LINK: return createOnPassLink();
      case SaturnPackage.P4_STEP: return createP4Step();
      case SaturnPackage.PASS_TERMINAL: return createPassTerminal();
      case SaturnPackage.PERL_RUN_GROUP_MODIFIER: return createPerlRunGroupModifier();
      case SaturnPackage.PROCEDURE_CALL_STEP: return createProcedureCallStep();
      case SaturnPackage.PS_MANAGER_STEP: return createPsManagerStep();
      case SaturnPackage.REFERENCE: return createReference();
      case SaturnPackage.REFERENCE_STEP: return createReferenceStep();
      case SaturnPackage.RESOURCE_LINK: return createResourceLink();
      case SaturnPackage.RESOURCE_NESTED_LINK: return createResourceNestedLink();
      case SaturnPackage.RESOURCE_PARAMETER: return createResourceParameter();
      case SaturnPackage.RESOURCE_STEP_LINK: return createResourceStepLink();
      case SaturnPackage.RUN_CMDS_STEP: return createRunCmdsStep();
      case SaturnPackage.RUN_GROUP: return createRunGroup();
      case SaturnPackage.RUN_GROUP_IMPORT: return createRunGroupImport();
      case SaturnPackage.SATURN: return createSaturn();
      case SaturnPackage.SINGULARITY_STEP: return createSingularityStep();
      case SaturnPackage.SOAP_IO_STEP: return createSoapIOStep();
      case SaturnPackage.SQL_STEP: return createSQLStep();
      case SaturnPackage.VMS_STEP: return createVmsStep();
      case SaturnPackage.XML2_CSV_STEP: return createXml2CsvStep();
      case SaturnPackage.XML_DIFF_STEP: return createXmlDiffStep();
      case SaturnPackage.XML_GEN_STEP: return createXmlGenStep();
      case SaturnPackage.XML_MANIP_STEP: return createXmlManipStep();
      case SaturnPackage.XML_VALIDATOR_STEP: return createXmlValidatorStep();
      case SaturnPackage.XSPLIT_STEP: return createXSplitStep();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SaturnPackage.INCLUDE_FILE_TYPE:
        return createIncludeFileTypeFromString(eDataType, initialValue);
      case SaturnPackage.INCLUDE_FILE_TYPE_OBJECT:
        return createIncludeFileTypeObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SaturnPackage.INCLUDE_FILE_TYPE:
        return convertIncludeFileTypeToString(eDataType, instanceValue);
      case SaturnPackage.INCLUDE_FILE_TYPE_OBJECT:
        return convertIncludeFileTypeObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AttributeParameter createAttributeParameter()
  {
    AttributeParameterImpl attributeParameter = new AttributeParameterImpl();
    return attributeParameter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CometStep createCometStep()
  {
    CometStepImpl cometStep = new CometStepImpl();
    return cometStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Config createConfig()
  {
    ConfigImpl config = new ConfigImpl();
    return config;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CpsStep createCpsStep()
  {
    CpsStepImpl cpsStep = new CpsStepImpl();
    return cpsStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CustomLink createCustomLink()
  {
    CustomLinkImpl customLink = new CustomLinkImpl();
    return customLink;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataCompareStep createDataCompareStep()
  {
    DataCompareStepImpl dataCompareStep = new DataCompareStepImpl();
    return dataCompareStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataCompareSummaryStep createDataCompareSummaryStep()
  {
    DataCompareSummaryStepImpl dataCompareSummaryStep = new DataCompareSummaryStepImpl();
    return dataCompareSummaryStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot()
  {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DocumentumStep createDocumentumStep()
  {
    DocumentumStepImpl documentumStep = new DocumentumStepImpl();
    return documentumStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DSConvertStep createDSConvertStep()
  {
    DSConvertStepImpl dsConvertStep = new DSConvertStepImpl();
    return dsConvertStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DSValidatorStep createDSValidatorStep()
  {
    DSValidatorStepImpl dsValidatorStep = new DSValidatorStepImpl();
    return dsValidatorStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EnvValidatorStep createEnvValidatorStep()
  {
    EnvValidatorStepImpl envValidatorStep = new EnvValidatorStepImpl();
    return envValidatorStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ExtractDDLStep createExtractDDLStep()
  {
    ExtractDDLStepImpl extractDDLStep = new ExtractDDLStepImpl();
    return extractDDLStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FailTerminal createFailTerminal()
  {
    FailTerminalImpl failTerminal = new FailTerminalImpl();
    return failTerminal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FixManipStep createFixManipStep()
  {
    FixManipStepImpl fixManipStep = new FixManipStepImpl();
    return fixManipStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public IncludeFile createIncludeFile()
  {
    IncludeFileImpl includeFile = new IncludeFileImpl();
    return includeFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JiraStep createJiraStep()
  {
    JiraStepImpl jiraStep = new JiraStepImpl();
    return jiraStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KronusStep createKronusStep()
  {
    KronusStepImpl kronusStep = new KronusStepImpl();
    return kronusStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MailStep createMailStep()
  {
    MailStepImpl mailStep = new MailStepImpl();
    return mailStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MQStep createMQStep()
  {
    MQStepImpl mqStep = new MQStepImpl();
    return mqStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NoopTerminal createNoopTerminal()
  {
    NoopTerminalImpl noopTerminal = new NoopTerminalImpl();
    return noopTerminal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OnFailLink createOnFailLink()
  {
    OnFailLinkImpl onFailLink = new OnFailLinkImpl();
    return onFailLink;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OnFinishLink createOnFinishLink()
  {
    OnFinishLinkImpl onFinishLink = new OnFinishLinkImpl();
    return onFinishLink;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OnPassLink createOnPassLink()
  {
    OnPassLinkImpl onPassLink = new OnPassLinkImpl();
    return onPassLink;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public P4Step createP4Step()
  {
    P4StepImpl p4Step = new P4StepImpl();
    return p4Step;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PassTerminal createPassTerminal()
  {
    PassTerminalImpl passTerminal = new PassTerminalImpl();
    return passTerminal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PerlRunGroupModifier createPerlRunGroupModifier()
  {
    PerlRunGroupModifierImpl perlRunGroupModifier = new PerlRunGroupModifierImpl();
    return perlRunGroupModifier;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ProcedureCallStep createProcedureCallStep()
  {
    ProcedureCallStepImpl procedureCallStep = new ProcedureCallStepImpl();
    return procedureCallStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public PsManagerStep createPsManagerStep()
  {
    PsManagerStepImpl psManagerStep = new PsManagerStepImpl();
    return psManagerStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ReferenceStep createReferenceStep()
  {
    ReferenceStepImpl referenceStep = new ReferenceStepImpl();
    return referenceStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceLink createResourceLink()
  {
    ResourceLinkImpl resourceLink = new ResourceLinkImpl();
    return resourceLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceNestedLink createResourceNestedLink()
  {
    ResourceNestedLinkImpl resourceNestedLink = new ResourceNestedLinkImpl();
    return resourceNestedLink;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceParameter createResourceParameter()
  {
    ResourceParameterImpl resourceParameter = new ResourceParameterImpl();
    return resourceParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceStepLink createResourceStepLink()
  {
    ResourceStepLinkImpl resourceStepLink = new ResourceStepLinkImpl();
    return resourceStepLink;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RunCmdsStep createRunCmdsStep()
  {
    RunCmdsStepImpl runCmdsStep = new RunCmdsStepImpl();
    return runCmdsStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RunGroup createRunGroup()
  {
    RunGroupImpl runGroup = new RunGroupImpl();
    return runGroup;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RunGroupImport createRunGroupImport()
  {
    RunGroupImportImpl runGroupImport = new RunGroupImportImpl();
    return runGroupImport;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Saturn createSaturn()
  {
    SaturnImpl saturn = new SaturnImpl();
    return saturn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SingularityStep createSingularityStep()
  {
    SingularityStepImpl singularityStep = new SingularityStepImpl();
    return singularityStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SoapIOStep createSoapIOStep()
  {
    SoapIOStepImpl soapIOStep = new SoapIOStepImpl();
    return soapIOStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SQLStep createSQLStep()
  {
    SQLStepImpl sqlStep = new SQLStepImpl();
    return sqlStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public VmsStep createVmsStep()
  {
    VmsStepImpl vmsStep = new VmsStepImpl();
    return vmsStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Xml2CsvStep createXml2CsvStep()
  {
    Xml2CsvStepImpl xml2CsvStep = new Xml2CsvStepImpl();
    return xml2CsvStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlDiffStep createXmlDiffStep()
  {
    XmlDiffStepImpl xmlDiffStep = new XmlDiffStepImpl();
    return xmlDiffStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlGenStep createXmlGenStep()
  {
    XmlGenStepImpl xmlGenStep = new XmlGenStepImpl();
    return xmlGenStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlManipStep createXmlManipStep()
  {
    XmlManipStepImpl xmlManipStep = new XmlManipStepImpl();
    return xmlManipStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlValidatorStep createXmlValidatorStep()
  {
    XmlValidatorStepImpl xmlValidatorStep = new XmlValidatorStepImpl();
    return xmlValidatorStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XSplitStep createXSplitStep()
  {
    XSplitStepImpl xSplitStep = new XSplitStepImpl();
    return xSplitStep;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public IncludeFileType createIncludeFileTypeFromString(EDataType eDataType, String initialValue)
  {
    IncludeFileType result = IncludeFileType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertIncludeFileTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public IncludeFileType createIncludeFileTypeObjectFromString(EDataType eDataType, String initialValue)
  {
    return createIncludeFileTypeFromString(SaturnPackage.Literals.INCLUDE_FILE_TYPE, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertIncludeFileTypeObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertIncludeFileTypeToString(SaturnPackage.Literals.INCLUDE_FILE_TYPE, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnPackage getSaturnPackage()
  {
    return (SaturnPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SaturnPackage getPackage()
  {
    return SaturnPackage.eINSTANCE;
  }

} // SaturnFactoryImpl
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
