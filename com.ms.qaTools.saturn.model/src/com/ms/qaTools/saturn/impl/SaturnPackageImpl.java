package com.ms.qaTools.saturn.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.ms.qaTools.saturn.AbstractLink;
import com.ms.qaTools.saturn.AbstractParameter;
import com.ms.qaTools.saturn.AbstractResourceLink;
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
import com.ms.qaTools.saturn.IncludeFileType;
import com.ms.qaTools.saturn.JiraStep;
import com.ms.qaTools.saturn.KronusStep;
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
import com.ms.qaTools.saturn.ResourceLink;
import com.ms.qaTools.saturn.ResourceNestedLink;
import com.ms.qaTools.saturn.ResourceParameter;
import com.ms.qaTools.saturn.ResourceStepLink;
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
import com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage;
import com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportPackageImpl;
import com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityPackage;
import com.ms.qaTools.saturn.annotations.saturnVerbosity.impl.SaturnVerbosityPackageImpl;
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage;
import com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl;
import com.ms.qaTools.saturn.exception.ExceptionPackage;
import com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl;
import com.ms.qaTools.saturn.kronus.backport.BackportPackage;
import com.ms.qaTools.saturn.kronus.backport.impl.BackportPackageImpl;
import com.ms.qaTools.saturn.listeners.ListenersPackage;
import com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl;
import com.ms.qaTools.saturn.modules.XSplitModule.XSplitModulePackage;
import com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitModulePackageImpl;
import com.ms.qaTools.saturn.modules.cometModule.CometModulePackage;
import com.ms.qaTools.saturn.modules.cometModule.impl.CometModulePackageImpl;
import com.ms.qaTools.saturn.modules.cpsModule.CpsModulePackage;
import com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl;
import com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage;
import com.ms.qaTools.saturn.modules.datacompareModule.impl.DatacompareModulePackageImpl;
import com.ms.qaTools.saturn.modules.documentumModule.DocumentumModulePackage;
import com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumModulePackageImpl;
import com.ms.qaTools.saturn.modules.dsConvertModule.DsConvertModulePackage;
import com.ms.qaTools.saturn.modules.dsConvertModule.impl.DsConvertModulePackageImpl;
import com.ms.qaTools.saturn.modules.dsValidatorModule.DsValidatorModulePackage;
import com.ms.qaTools.saturn.modules.dsValidatorModule.impl.DsValidatorModulePackageImpl;
import com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage;
import com.ms.qaTools.saturn.modules.envValidatorModule.impl.EnvValidatorModulePackageImpl;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage;
import com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractDDLModulePackageImpl;
import com.ms.qaTools.saturn.modules.fixManipModule.FixManipModulePackage;
import com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl;
import com.ms.qaTools.saturn.modules.mailModule.MailModulePackage;
import com.ms.qaTools.saturn.modules.mailModule.impl.MailModulePackageImpl;
import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage;
import com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl;
import com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallModulePackage;
import com.ms.qaTools.saturn.modules.procedureCallModule.impl.ProcedureCallModulePackageImpl;
import com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage;
import com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl;
import com.ms.qaTools.saturn.modules.referenceModule.ReferenceModulePackage;
import com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceModulePackageImpl;
import com.ms.qaTools.saturn.modules.runcmdsModule.RuncmdsModulePackage;
import com.ms.qaTools.saturn.modules.runcmdsModule.impl.RuncmdsModulePackageImpl;
import com.ms.qaTools.saturn.modules.singularityModule.SingularityModulePackage;
import com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityModulePackageImpl;
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage;
import com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOModulePackageImpl;
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage;
import com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl;
import com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage;
import com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2csvModulePackageImpl;
import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage;
import com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffModulePackageImpl;
import com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage;
import com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenModulePackageImpl;
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage;
import com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl;
import com.ms.qaTools.saturn.modules.xmlValidatorModule.XmlValidatorModulePackage;
import com.ms.qaTools.saturn.modules.xmlValidatorModule.impl.XmlValidatorModulePackageImpl;
import com.ms.qaTools.saturn.repetition.RepetitionPackage;
import com.ms.qaTools.saturn.repetition.impl.RepetitionPackageImpl;
import com.ms.qaTools.saturn.resources.dataSetResource.DataSetResourcePackage;
import com.ms.qaTools.saturn.resources.dataSetResource.impl.DataSetResourcePackageImpl;
import com.ms.qaTools.saturn.resources.db2Resource.Db2ResourcePackage;
import com.ms.qaTools.saturn.resources.db2Resource.impl.Db2ResourcePackageImpl;
import com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourcePackage;
import com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourcePackageImpl;
import com.ms.qaTools.saturn.resources.documentumResource.DocumentumResourcePackage;
import com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourcePackageImpl;
import com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResourcePackage;
import com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourcePackageImpl;
import com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage;
import com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl;
import com.ms.qaTools.saturn.resources.h2Resource.H2ResourcePackage;
import com.ms.qaTools.saturn.resources.h2Resource.impl.H2ResourcePackageImpl;
import com.ms.qaTools.saturn.resources.icelinkResource.IcelinkResourcePackage;
import com.ms.qaTools.saturn.resources.icelinkResource.impl.IcelinkResourcePackageImpl;
import com.ms.qaTools.saturn.resources.informixResource.InformixResourcePackage;
import com.ms.qaTools.saturn.resources.informixResource.impl.InformixResourcePackageImpl;
import com.ms.qaTools.saturn.resources.ldapQueryResource.LdapQueryResourcePackage;
import com.ms.qaTools.saturn.resources.ldapQueryResource.impl.LdapQueryResourcePackageImpl;
import com.ms.qaTools.saturn.resources.ldapResource.LdapResourcePackage;
import com.ms.qaTools.saturn.resources.ldapResource.impl.LdapResourcePackageImpl;
import com.ms.qaTools.saturn.resources.mapperResource.MapperResourcePackage;
import com.ms.qaTools.saturn.resources.mapperResource.impl.MapperResourcePackageImpl;
import com.ms.qaTools.saturn.resources.markitwireResource.MarkitwireResourcePackage;
import com.ms.qaTools.saturn.resources.markitwireResource.impl.MarkitwireResourcePackageImpl;
import com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResourcePackage;
import com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourcePackageImpl;
import com.ms.qaTools.saturn.resources.mqResource.MqResourcePackage;
import com.ms.qaTools.saturn.resources.mqResource.impl.MqResourcePackageImpl;
import com.ms.qaTools.saturn.resources.mssqlResource.MssqlResourcePackage;
import com.ms.qaTools.saturn.resources.mssqlResource.impl.MssqlResourcePackageImpl;
import com.ms.qaTools.saturn.resources.nullResource.NullResourcePackage;
import com.ms.qaTools.saturn.resources.nullResource.impl.NullResourcePackageImpl;
import com.ms.qaTools.saturn.resources.oracleResource.OracleResourcePackage;
import com.ms.qaTools.saturn.resources.oracleResource.impl.OracleResourcePackageImpl;
import com.ms.qaTools.saturn.resources.queryResource.QueryResourcePackage;
import com.ms.qaTools.saturn.resources.queryResource.impl.QueryResourcePackageImpl;
import com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourcePackage;
import com.ms.qaTools.saturn.resources.referenceResource.impl.ReferenceResourcePackageImpl;
import com.ms.qaTools.saturn.resources.rmiConnectionResource.RmiConnectionResourcePackage;
import com.ms.qaTools.saturn.resources.rmiConnectionResource.impl.RmiConnectionResourcePackageImpl;
import com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage;
import com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl;
import com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResourcePackage;
import com.ms.qaTools.saturn.resources.shadowDirectResource.impl.ShadowDirectResourcePackageImpl;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage;
import com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl;
import com.ms.qaTools.saturn.resources.sqliteResource.SqliteResourcePackage;
import com.ms.qaTools.saturn.resources.sqliteResource.impl.SqliteResourcePackageImpl;
import com.ms.qaTools.saturn.resources.sybaseResource.SybaseResourcePackage;
import com.ms.qaTools.saturn.resources.sybaseResource.impl.SybaseResourcePackageImpl;
import com.ms.qaTools.saturn.resources.teradataResource.TeradataResourcePackage;
import com.ms.qaTools.saturn.resources.teradataResource.impl.TeradataResourcePackageImpl;
import com.ms.qaTools.saturn.resources.transactionResource.TransactionResourcePackage;
import com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourcePackageImpl;
import com.ms.qaTools.saturn.resources.udbResource.UdbResourcePackage;
import com.ms.qaTools.saturn.resources.udbResource.impl.UdbResourcePackageImpl;
import com.ms.qaTools.saturn.result.ResultPackage;
import com.ms.qaTools.saturn.result.impl.ResultPackageImpl;
import com.ms.qaTools.saturn.types.TypesPackage;
import com.ms.qaTools.saturn.types.impl.TypesPackageImpl;
import com.ms.qaTools.saturn.values.ValuesPackage;
import com.ms.qaTools.saturn.values.impl.ValuesPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class SaturnPackageImpl extends EPackageImpl implements SaturnPackage
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    abstractLinkEClass             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    abstractParameterEClass        = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractResourceLinkEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    abstractRunGroupEClass         = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    abstractStepEClass             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    abstractTerminalEClass         = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    attributeEClass                = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    attributeParameterEClass       = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    cometStepEClass                = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    configEClass                   = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    cpsStepEClass                  = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    customLinkEClass               = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    dataCompareStepEClass          = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    dataCompareSummaryStepEClass   = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    documentRootEClass             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    documentumStepEClass           = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    dsConvertStepEClass            = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    dsValidatorStepEClass          = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    envValidatorStepEClass         = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    extractDDLStepEClass           = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    failTerminalEClass             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    fixManipStepEClass             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    includeFileEClass              = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    jiraStepEClass                 = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kronusStepEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    mailStepEClass                 = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    mqStepEClass                   = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    noopTerminalEClass             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    onFailLinkEClass               = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    onFinishLinkEClass             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    onPassLinkEClass               = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    p4StepEClass                   = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    passTerminalEClass             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    perlRunGroupModifierEClass     = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    procedureCallStepEClass        = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    psManagerStepEClass            = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    referenceEClass                = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    referenceStepEClass            = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceNestedLinkEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    resourceParameterEClass        = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceStepLinkEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    runCmdsStepEClass              = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    runGroupEClass                 = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    runGroupImportEClass           = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    saturnEClass                   = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    singularityStepEClass          = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    soapIOStepEClass               = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    sqlStepEClass                  = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    vmsStepEClass                  = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    xml2CsvStepEClass              = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    xmlDiffStepEClass              = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    xmlGenStepEClass               = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    xmlManipStepEClass             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    xmlValidatorStepEClass         = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    xSplitStepEClass               = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     includeFileTypeEEnum           = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType includeFileTypeObjectEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.ms.qaTools.saturn.SaturnPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SaturnPackageImpl()
  {
    super(eNS_URI, SaturnFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SaturnPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SaturnPackage init()
  {
    if (isInited) return (SaturnPackage)EPackage.Registry.INSTANCE.getEPackage(SaturnPackage.eNS_URI);

    // Obtain or create and register package
    SaturnPackageImpl theSaturnPackage = (SaturnPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SaturnPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SaturnPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    DatacompareModulePackageImpl theDatacompareModulePackage = (DatacompareModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatacompareModulePackage.eNS_URI) instanceof DatacompareModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatacompareModulePackage.eNS_URI) : DatacompareModulePackage.eINSTANCE);
    TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
    DocumentumModulePackageImpl theDocumentumModulePackage = (DocumentumModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DocumentumModulePackage.eNS_URI) instanceof DocumentumModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DocumentumModulePackage.eNS_URI) : DocumentumModulePackage.eINSTANCE);
    ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
    MailModulePackageImpl theMailModulePackage = (MailModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MailModulePackage.eNS_URI) instanceof MailModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MailModulePackage.eNS_URI) : MailModulePackage.eINSTANCE);
    MqModulePackageImpl theMqModulePackage = (MqModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MqModulePackage.eNS_URI) instanceof MqModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MqModulePackage.eNS_URI) : MqModulePackage.eINSTANCE);
    RuncmdsModulePackageImpl theRuncmdsModulePackage = (RuncmdsModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RuncmdsModulePackage.eNS_URI) instanceof RuncmdsModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RuncmdsModulePackage.eNS_URI) : RuncmdsModulePackage.eINSTANCE);
    SqlModulePackageImpl theSqlModulePackage = (SqlModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SqlModulePackage.eNS_URI) instanceof SqlModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SqlModulePackage.eNS_URI) : SqlModulePackage.eINSTANCE);
    Xml2csvModulePackageImpl theXml2csvModulePackage = (Xml2csvModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Xml2csvModulePackage.eNS_URI) instanceof Xml2csvModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Xml2csvModulePackage.eNS_URI) : Xml2csvModulePackage.eINSTANCE);
    XSplitModulePackageImpl theXSplitModulePackage = (XSplitModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XSplitModulePackage.eNS_URI) instanceof XSplitModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XSplitModulePackage.eNS_URI) : XSplitModulePackage.eINSTANCE);
    ReferenceModulePackageImpl theReferenceModulePackage = (ReferenceModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferenceModulePackage.eNS_URI) instanceof ReferenceModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferenceModulePackage.eNS_URI) : ReferenceModulePackage.eINSTANCE);
    SoapIOModulePackageImpl theSoapIOModulePackage = (SoapIOModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoapIOModulePackage.eNS_URI) instanceof SoapIOModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoapIOModulePackage.eNS_URI) : SoapIOModulePackage.eINSTANCE);
    XmlDiffModulePackageImpl theXmlDiffModulePackage = (XmlDiffModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XmlDiffModulePackage.eNS_URI) instanceof XmlDiffModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XmlDiffModulePackage.eNS_URI) : XmlDiffModulePackage.eINSTANCE);
    XmlGenModulePackageImpl theXmlGenModulePackage = (XmlGenModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XmlGenModulePackage.eNS_URI) instanceof XmlGenModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XmlGenModulePackage.eNS_URI) : XmlGenModulePackage.eINSTANCE);
    CpsModulePackageImpl theCpsModulePackage = (CpsModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CpsModulePackage.eNS_URI) instanceof CpsModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CpsModulePackage.eNS_URI) : CpsModulePackage.eINSTANCE);
    DsConvertModulePackageImpl theDsConvertModulePackage = (DsConvertModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DsConvertModulePackage.eNS_URI) instanceof DsConvertModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DsConvertModulePackage.eNS_URI) : DsConvertModulePackage.eINSTANCE);
    DsValidatorModulePackageImpl theDsValidatorModulePackage = (DsValidatorModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DsValidatorModulePackage.eNS_URI) instanceof DsValidatorModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DsValidatorModulePackage.eNS_URI) : DsValidatorModulePackage.eINSTANCE);
    EnvValidatorModulePackageImpl theEnvValidatorModulePackage = (EnvValidatorModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvValidatorModulePackage.eNS_URI) instanceof EnvValidatorModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvValidatorModulePackage.eNS_URI) : EnvValidatorModulePackage.eINSTANCE);
    ExtractDDLModulePackageImpl theExtractDDLModulePackage = (ExtractDDLModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtractDDLModulePackage.eNS_URI) instanceof ExtractDDLModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtractDDLModulePackage.eNS_URI) : ExtractDDLModulePackage.eINSTANCE);
    ProcedureCallModulePackageImpl theProcedureCallModulePackage = (ProcedureCallModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcedureCallModulePackage.eNS_URI) instanceof ProcedureCallModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcedureCallModulePackage.eNS_URI) : ProcedureCallModulePackage.eINSTANCE);
    ResultPackageImpl theResultPackage = (ResultPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultPackage.eNS_URI) instanceof ResultPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultPackage.eNS_URI) : ResultPackage.eINSTANCE);
    PsManagerModulePackageImpl thePsManagerModulePackage = (PsManagerModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PsManagerModulePackage.eNS_URI) instanceof PsManagerModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PsManagerModulePackage.eNS_URI) : PsManagerModulePackage.eINSTANCE);
    SingularityModulePackageImpl theSingularityModulePackage = (SingularityModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SingularityModulePackage.eNS_URI) instanceof SingularityModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SingularityModulePackage.eNS_URI) : SingularityModulePackage.eINSTANCE);
    XmlManipModulePackageImpl theXmlManipModulePackage = (XmlManipModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XmlManipModulePackage.eNS_URI) instanceof XmlManipModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XmlManipModulePackage.eNS_URI) : XmlManipModulePackage.eINSTANCE);
    XmlValidatorModulePackageImpl theXmlValidatorModulePackage = (XmlValidatorModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XmlValidatorModulePackage.eNS_URI) instanceof XmlValidatorModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XmlValidatorModulePackage.eNS_URI) : XmlValidatorModulePackage.eINSTANCE);
    CometModulePackageImpl theCometModulePackage = (CometModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CometModulePackage.eNS_URI) instanceof CometModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CometModulePackage.eNS_URI) : CometModulePackage.eINSTANCE);
    FixManipModulePackageImpl theFixManipModulePackage = (FixManipModulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FixManipModulePackage.eNS_URI) instanceof FixManipModulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FixManipModulePackage.eNS_URI) : FixManipModulePackage.eINSTANCE);
    ExceptionPackageImpl theExceptionPackage = (ExceptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI) instanceof ExceptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI) : ExceptionPackage.eINSTANCE);
    BackportPackageImpl theBackportPackage = (BackportPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BackportPackage.eNS_URI) instanceof BackportPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BackportPackage.eNS_URI) : BackportPackage.eINSTANCE);
    ReferenceResourcePackageImpl theReferenceResourcePackage = (ReferenceResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferenceResourcePackage.eNS_URI) instanceof ReferenceResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferenceResourcePackage.eNS_URI) : ReferenceResourcePackage.eINSTANCE);
    DirectoryResourcePackageImpl theDirectoryResourcePackage = (DirectoryResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DirectoryResourcePackage.eNS_URI) instanceof DirectoryResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DirectoryResourcePackage.eNS_URI) : DirectoryResourcePackage.eINSTANCE);
    FileResourcePackageImpl theFileResourcePackage = (FileResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FileResourcePackage.eNS_URI) instanceof FileResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FileResourcePackage.eNS_URI) : FileResourcePackage.eINSTANCE);
    MqResourcePackageImpl theMqResourcePackage = (MqResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MqResourcePackage.eNS_URI) instanceof MqResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MqResourcePackage.eNS_URI) : MqResourcePackage.eINSTANCE);
    SybaseResourcePackageImpl theSybaseResourcePackage = (SybaseResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SybaseResourcePackage.eNS_URI) instanceof SybaseResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SybaseResourcePackage.eNS_URI) : SybaseResourcePackage.eINSTANCE);
    MssqlResourcePackageImpl theMssqlResourcePackage = (MssqlResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MssqlResourcePackage.eNS_URI) instanceof MssqlResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MssqlResourcePackage.eNS_URI) : MssqlResourcePackage.eINSTANCE);
    Db2ResourcePackageImpl theDb2ResourcePackage = (Db2ResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Db2ResourcePackage.eNS_URI) instanceof Db2ResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Db2ResourcePackage.eNS_URI) : Db2ResourcePackage.eINSTANCE);
    UdbResourcePackageImpl theUdbResourcePackage = (UdbResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UdbResourcePackage.eNS_URI) instanceof UdbResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UdbResourcePackage.eNS_URI) : UdbResourcePackage.eINSTANCE);
    DataSetResourcePackageImpl theDataSetResourcePackage = (DataSetResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataSetResourcePackage.eNS_URI) instanceof DataSetResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataSetResourcePackage.eNS_URI) : DataSetResourcePackage.eINSTANCE);
    SqliteResourcePackageImpl theSqliteResourcePackage = (SqliteResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SqliteResourcePackage.eNS_URI) instanceof SqliteResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SqliteResourcePackage.eNS_URI) : SqliteResourcePackage.eINSTANCE);
    SaturnWebPackageImpl theSaturnWebPackage = (SaturnWebPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SaturnWebPackage.eNS_URI) instanceof SaturnWebPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SaturnWebPackage.eNS_URI) : SaturnWebPackage.eINSTANCE);
    TransactionResourcePackageImpl theTransactionResourcePackage = (TransactionResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransactionResourcePackage.eNS_URI) instanceof TransactionResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransactionResourcePackage.eNS_URI) : TransactionResourcePackage.eINSTANCE);
    SoapIOResourcePackageImpl theSoapIOResourcePackage = (SoapIOResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoapIOResourcePackage.eNS_URI) instanceof SoapIOResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoapIOResourcePackage.eNS_URI) : SoapIOResourcePackage.eINSTANCE);
    TeradataResourcePackageImpl theTeradataResourcePackage = (TeradataResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TeradataResourcePackage.eNS_URI) instanceof TeradataResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TeradataResourcePackage.eNS_URI) : TeradataResourcePackage.eINSTANCE);
    ListenersPackageImpl theListenersPackage = (ListenersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ListenersPackage.eNS_URI) instanceof ListenersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ListenersPackage.eNS_URI) : ListenersPackage.eINSTANCE);
    DocumentumResourcePackageImpl theDocumentumResourcePackage = (DocumentumResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DocumentumResourcePackage.eNS_URI) instanceof DocumentumResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DocumentumResourcePackage.eNS_URI) : DocumentumResourcePackage.eINSTANCE);
    RepetitionPackageImpl theRepetitionPackage = (RepetitionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepetitionPackage.eNS_URI) instanceof RepetitionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepetitionPackage.eNS_URI) : RepetitionPackage.eINSTANCE);
    IcelinkResourcePackageImpl theIcelinkResourcePackage = (IcelinkResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IcelinkResourcePackage.eNS_URI) instanceof IcelinkResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IcelinkResourcePackage.eNS_URI) : IcelinkResourcePackage.eINSTANCE);
    InformixResourcePackageImpl theInformixResourcePackage = (InformixResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformixResourcePackage.eNS_URI) instanceof InformixResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformixResourcePackage.eNS_URI) : InformixResourcePackage.eINSTANCE);
    LdapQueryResourcePackageImpl theLdapQueryResourcePackage = (LdapQueryResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LdapQueryResourcePackage.eNS_URI) instanceof LdapQueryResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LdapQueryResourcePackage.eNS_URI) : LdapQueryResourcePackage.eINSTANCE);
    LdapResourcePackageImpl theLdapResourcePackage = (LdapResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LdapResourcePackage.eNS_URI) instanceof LdapResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LdapResourcePackage.eNS_URI) : LdapResourcePackage.eINSTANCE);
    MarkitwireResourcePackageImpl theMarkitwireResourcePackage = (MarkitwireResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MarkitwireResourcePackage.eNS_URI) instanceof MarkitwireResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MarkitwireResourcePackage.eNS_URI) : MarkitwireResourcePackage.eINSTANCE);
    OracleResourcePackageImpl theOracleResourcePackage = (OracleResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OracleResourcePackage.eNS_URI) instanceof OracleResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OracleResourcePackage.eNS_URI) : OracleResourcePackage.eINSTANCE);
    QueryResourcePackageImpl theQueryResourcePackage = (QueryResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QueryResourcePackage.eNS_URI) instanceof QueryResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QueryResourcePackage.eNS_URI) : QueryResourcePackage.eINSTANCE);
    SaturnReportPackageImpl theSaturnReportPackage = (SaturnReportPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SaturnReportPackage.eNS_URI) instanceof SaturnReportPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SaturnReportPackage.eNS_URI) : SaturnReportPackage.eINSTANCE);
    RmiConnectionResourcePackageImpl theRmiConnectionResourcePackage = (RmiConnectionResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RmiConnectionResourcePackage.eNS_URI) instanceof RmiConnectionResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RmiConnectionResourcePackage.eNS_URI) : RmiConnectionResourcePackage.eINSTANCE);
    SaturnVerbosityPackageImpl theSaturnVerbosityPackage = (SaturnVerbosityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SaturnVerbosityPackage.eNS_URI) instanceof SaturnVerbosityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SaturnVerbosityPackage.eNS_URI) : SaturnVerbosityPackage.eINSTANCE);
    ShadowDirectResourcePackageImpl theShadowDirectResourcePackage = (ShadowDirectResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ShadowDirectResourcePackage.eNS_URI) instanceof ShadowDirectResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ShadowDirectResourcePackage.eNS_URI) : ShadowDirectResourcePackage.eINSTANCE);
    NullResourcePackageImpl theNullResourcePackage = (NullResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NullResourcePackage.eNS_URI) instanceof NullResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NullResourcePackage.eNS_URI) : NullResourcePackage.eINSTANCE);
    DsSQLResourcePackageImpl theDsSQLResourcePackage = (DsSQLResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DsSQLResourcePackage.eNS_URI) instanceof DsSQLResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DsSQLResourcePackage.eNS_URI) : DsSQLResourcePackage.eINSTANCE);
    SemaphoreResourcePackageImpl theSemaphoreResourcePackage = (SemaphoreResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SemaphoreResourcePackage.eNS_URI) instanceof SemaphoreResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SemaphoreResourcePackage.eNS_URI) : SemaphoreResourcePackage.eINSTANCE);
    MongoDbResourcePackageImpl theMongoDbResourcePackage = (MongoDbResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MongoDbResourcePackage.eNS_URI) instanceof MongoDbResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MongoDbResourcePackage.eNS_URI) : MongoDbResourcePackage.eINSTANCE);
    H2ResourcePackageImpl theH2ResourcePackage = (H2ResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(H2ResourcePackage.eNS_URI) instanceof H2ResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(H2ResourcePackage.eNS_URI) : H2ResourcePackage.eINSTANCE);
    MapperResourcePackageImpl theMapperResourcePackage = (MapperResourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapperResourcePackage.eNS_URI) instanceof MapperResourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapperResourcePackage.eNS_URI) : MapperResourcePackage.eINSTANCE);

    // Create package meta-data objects
    theSaturnPackage.createPackageContents();
    theDatacompareModulePackage.createPackageContents();
    theTypesPackage.createPackageContents();
    theDocumentumModulePackage.createPackageContents();
    theValuesPackage.createPackageContents();
    theMailModulePackage.createPackageContents();
    theMqModulePackage.createPackageContents();
    theRuncmdsModulePackage.createPackageContents();
    theSqlModulePackage.createPackageContents();
    theXml2csvModulePackage.createPackageContents();
    theXSplitModulePackage.createPackageContents();
    theReferenceModulePackage.createPackageContents();
    theSoapIOModulePackage.createPackageContents();
    theXmlDiffModulePackage.createPackageContents();
    theXmlGenModulePackage.createPackageContents();
    theCpsModulePackage.createPackageContents();
    theDsConvertModulePackage.createPackageContents();
    theDsValidatorModulePackage.createPackageContents();
    theEnvValidatorModulePackage.createPackageContents();
    theExtractDDLModulePackage.createPackageContents();
    theProcedureCallModulePackage.createPackageContents();
    theResultPackage.createPackageContents();
    thePsManagerModulePackage.createPackageContents();
    theSingularityModulePackage.createPackageContents();
    theXmlManipModulePackage.createPackageContents();
    theXmlValidatorModulePackage.createPackageContents();
    theCometModulePackage.createPackageContents();
    theFixManipModulePackage.createPackageContents();
    theExceptionPackage.createPackageContents();
    theBackportPackage.createPackageContents();
    theReferenceResourcePackage.createPackageContents();
    theDirectoryResourcePackage.createPackageContents();
    theFileResourcePackage.createPackageContents();
    theMqResourcePackage.createPackageContents();
    theSybaseResourcePackage.createPackageContents();
    theMssqlResourcePackage.createPackageContents();
    theDb2ResourcePackage.createPackageContents();
    theUdbResourcePackage.createPackageContents();
    theDataSetResourcePackage.createPackageContents();
    theSqliteResourcePackage.createPackageContents();
    theSaturnWebPackage.createPackageContents();
    theTransactionResourcePackage.createPackageContents();
    theSoapIOResourcePackage.createPackageContents();
    theTeradataResourcePackage.createPackageContents();
    theListenersPackage.createPackageContents();
    theDocumentumResourcePackage.createPackageContents();
    theRepetitionPackage.createPackageContents();
    theIcelinkResourcePackage.createPackageContents();
    theInformixResourcePackage.createPackageContents();
    theLdapQueryResourcePackage.createPackageContents();
    theLdapResourcePackage.createPackageContents();
    theMarkitwireResourcePackage.createPackageContents();
    theOracleResourcePackage.createPackageContents();
    theQueryResourcePackage.createPackageContents();
    theSaturnReportPackage.createPackageContents();
    theRmiConnectionResourcePackage.createPackageContents();
    theSaturnVerbosityPackage.createPackageContents();
    theShadowDirectResourcePackage.createPackageContents();
    theNullResourcePackage.createPackageContents();
    theDsSQLResourcePackage.createPackageContents();
    theSemaphoreResourcePackage.createPackageContents();
    theMongoDbResourcePackage.createPackageContents();
    theH2ResourcePackage.createPackageContents();
    theMapperResourcePackage.createPackageContents();

    // Initialize created meta-data
    theSaturnPackage.initializePackageContents();
    theDatacompareModulePackage.initializePackageContents();
    theTypesPackage.initializePackageContents();
    theDocumentumModulePackage.initializePackageContents();
    theValuesPackage.initializePackageContents();
    theMailModulePackage.initializePackageContents();
    theMqModulePackage.initializePackageContents();
    theRuncmdsModulePackage.initializePackageContents();
    theSqlModulePackage.initializePackageContents();
    theXml2csvModulePackage.initializePackageContents();
    theXSplitModulePackage.initializePackageContents();
    theReferenceModulePackage.initializePackageContents();
    theSoapIOModulePackage.initializePackageContents();
    theXmlDiffModulePackage.initializePackageContents();
    theXmlGenModulePackage.initializePackageContents();
    theCpsModulePackage.initializePackageContents();
    theDsConvertModulePackage.initializePackageContents();
    theDsValidatorModulePackage.initializePackageContents();
    theEnvValidatorModulePackage.initializePackageContents();
    theExtractDDLModulePackage.initializePackageContents();
    theProcedureCallModulePackage.initializePackageContents();
    theResultPackage.initializePackageContents();
    thePsManagerModulePackage.initializePackageContents();
    theSingularityModulePackage.initializePackageContents();
    theXmlManipModulePackage.initializePackageContents();
    theXmlValidatorModulePackage.initializePackageContents();
    theCometModulePackage.initializePackageContents();
    theFixManipModulePackage.initializePackageContents();
    theExceptionPackage.initializePackageContents();
    theBackportPackage.initializePackageContents();
    theReferenceResourcePackage.initializePackageContents();
    theDirectoryResourcePackage.initializePackageContents();
    theFileResourcePackage.initializePackageContents();
    theMqResourcePackage.initializePackageContents();
    theSybaseResourcePackage.initializePackageContents();
    theMssqlResourcePackage.initializePackageContents();
    theDb2ResourcePackage.initializePackageContents();
    theUdbResourcePackage.initializePackageContents();
    theDataSetResourcePackage.initializePackageContents();
    theSqliteResourcePackage.initializePackageContents();
    theSaturnWebPackage.initializePackageContents();
    theTransactionResourcePackage.initializePackageContents();
    theSoapIOResourcePackage.initializePackageContents();
    theTeradataResourcePackage.initializePackageContents();
    theListenersPackage.initializePackageContents();
    theDocumentumResourcePackage.initializePackageContents();
    theRepetitionPackage.initializePackageContents();
    theIcelinkResourcePackage.initializePackageContents();
    theInformixResourcePackage.initializePackageContents();
    theLdapQueryResourcePackage.initializePackageContents();
    theLdapResourcePackage.initializePackageContents();
    theMarkitwireResourcePackage.initializePackageContents();
    theOracleResourcePackage.initializePackageContents();
    theQueryResourcePackage.initializePackageContents();
    theSaturnReportPackage.initializePackageContents();
    theRmiConnectionResourcePackage.initializePackageContents();
    theSaturnVerbosityPackage.initializePackageContents();
    theShadowDirectResourcePackage.initializePackageContents();
    theNullResourcePackage.initializePackageContents();
    theDsSQLResourcePackage.initializePackageContents();
    theSemaphoreResourcePackage.initializePackageContents();
    theMongoDbResourcePackage.initializePackageContents();
    theH2ResourcePackage.initializePackageContents();
    theMapperResourcePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSaturnPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SaturnPackage.eNS_URI, theSaturnPackage);
    return theSaturnPackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractLink()
  {
    return abstractLinkEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractLink_Source()
  {
    return (EReference)abstractLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractLink_Target()
  {
    return (EReference)abstractLinkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractParameter()
  {
    return abstractParameterEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractParameter_IsMandatory()
  {
    return (EAttribute)abstractParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractParameter_Name()
  {
    return (EAttribute)abstractParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractResourceLink()
  {
    return abstractResourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractResourceLink_Source()
  {
    return (EReference)abstractResourceLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractResourceLink_Target()
  {
    return (EReference)abstractResourceLinkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractRunGroup()
  {
    return abstractRunGroupEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractRunGroup_Imports()
  {
    return (EReference)abstractRunGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractRunGroup_Exception()
  {
    return (EReference)abstractRunGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractRunGroup_Resources()
  {
    return (EReference)abstractRunGroupEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractRunGroup_Attributes()
  {
    return (EReference)abstractRunGroupEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractRunGroup_Annotations()
  {
    return (EReference)abstractRunGroupEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractRunGroup_RepetitionHandler()
  {
    return (EReference)abstractRunGroupEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractRunGroup_Modifiers()
  {
    return (EReference)abstractRunGroupEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractRunGroup_Parameters()
  {
    return (EReference)abstractRunGroupEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractRunGroup_IncludeFiles()
  {
    return (EReference)abstractRunGroupEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractRunGroup_AlmId()
  {
    return (EReference)abstractRunGroupEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractRunGroup_CanMultiplex()
  {
    return (EAttribute)abstractRunGroupEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractRunGroup_DefaultStatus()
  {
    return (EAttribute)abstractRunGroupEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractRunGroup_Enabled()
  {
    return (EAttribute)abstractRunGroupEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractRunGroup_Id()
  {
    return (EAttribute)abstractRunGroupEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractRunGroup_MaxSimultaneousIterations()
  {
    return (EAttribute)abstractRunGroupEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractRunGroup_Name()
  {
    return (EAttribute)abstractRunGroupEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractRunGroup_Procedure()
  {
    return (EAttribute)abstractRunGroupEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractRunGroup_StatusCondition()
  {
    return (EAttribute)abstractRunGroupEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractRunGroup_WaitAfter()
  {
    return (EAttribute)abstractRunGroupEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractRunGroup_WaitBefore()
  {
    return (EAttribute)abstractRunGroupEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractRunGroup_WarnOnFailure()
  {
    return (EAttribute)abstractRunGroupEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractStep()
  {
    return abstractStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractTerminal()
  {
    return abstractTerminalEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractTerminal_RepetitionAction()
  {
    return (EAttribute)abstractTerminalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractTerminal_TerminationStatus()
  {
    return (EAttribute)abstractTerminalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_External()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeParameter()
  {
    return attributeParameterEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeParameter_DefaultValue()
  {
    return (EReference)attributeParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getCometStep()
  {
    return cometStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCometStep_CometConfiguration()
  {
    return (EReference)cometStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfig()
  {
    return configEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfig_RequiredPackages()
  {
    return (EReference)configEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfig_LogicProvider()
  {
    return (EAttribute)configEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfig_Name()
  {
    return (EAttribute)configEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getCpsStep()
  {
    return cpsStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCpsStep_CpsConfiguration()
  {
    return (EReference)cpsStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomLink()
  {
    return customLinkEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomLink_Code()
  {
    return (EReference)customLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomLink_Description()
  {
    return (EAttribute)customLinkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataCompareStep()
  {
    return dataCompareStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataCompareStep_DataCompareConfiguration()
  {
    return (EReference)dataCompareStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataCompareSummaryStep()
  {
    return dataCompareSummaryStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentRoot()
  {
    return documentRootEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Saturn()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentumStep()
  {
    return documentumStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentumStep_DocumentumConfiguration()
  {
    return (EReference)documentumStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSConvertStep()
  {
    return dsConvertStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSConvertStep_DSConvertConfiguration()
  {
    return (EReference)dsConvertStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSValidatorStep()
  {
    return dsValidatorStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSValidatorStep_DSValidatorConfiguration()
  {
    return (EReference)dsValidatorStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnvValidatorStep()
  {
    return envValidatorStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnvValidatorStep_EnvValidatorConfiguration()
  {
    return (EReference)envValidatorStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtractDDLStep()
  {
    return extractDDLStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtractDDLStep_ExtractDDLConfiguration()
  {
    return (EReference)extractDDLStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getFailTerminal()
  {
    return failTerminalEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getFixManipStep()
  {
    return fixManipStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getFixManipStep_FixManipConfiguration()
  {
    return (EReference)fixManipStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncludeFile()
  {
    return includeFileEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIncludeFile_Format()
  {
    return (EAttribute)includeFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIncludeFile_Name()
  {
    return (EAttribute)includeFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getJiraStep()
  {
    return jiraStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKronusStep()
  {
    return kronusStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKronusStep_KronusCallConfiguration()
  {
    return (EReference)kronusStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getMailStep()
  {
    return mailStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getMailStep_MailConfiguration()
  {
    return (EReference)mailStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getMQStep()
  {
    return mqStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getMQStep_MQConfiguration()
  {
    return (EReference)mqStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoopTerminal()
  {
    return noopTerminalEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getOnFailLink()
  {
    return onFailLinkEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getOnFinishLink()
  {
    return onFinishLinkEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getOnPassLink()
  {
    return onPassLinkEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getP4Step()
  {
    return p4StepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getPassTerminal()
  {
    return passTerminalEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getPerlRunGroupModifier()
  {
    return perlRunGroupModifierEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getPerlRunGroupModifier_PerlCode()
  {
    return (EReference)perlRunGroupModifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcedureCallStep()
  {
    return procedureCallStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcedureCallStep_ProcedureCallConfiguration()
  {
    return (EReference)procedureCallStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getPsManagerStep()
  {
    return psManagerStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getPsManagerStep_PsManagerConfiguration()
  {
    return (EReference)psManagerStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReference_IncludeFile()
  {
    return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReference_RunGroup()
  {
    return (EAttribute)referenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReference_Template()
  {
    return (EAttribute)referenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceStep()
  {
    return referenceStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceStep_ReferenceConfiguration()
  {
    return (EReference)referenceStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceLink()
  {
    return resourceLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceNestedLink()
  {
    return resourceNestedLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceNestedLink_TargetEnclosingResource()
  {
    return (EReference)resourceNestedLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceParameter()
  {
    return resourceParameterEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceParameter_DefaultResource()
  {
    return (EReference)resourceParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceStepLink()
  {
    return resourceStepLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceStepLink_Description()
  {
    return (EAttribute)resourceStepLinkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceStepLink_TargetStep()
  {
    return (EReference)resourceStepLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getRunCmdsStep()
  {
    return runCmdsStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRunCmdsStep_RunCmdsConfiguration()
  {
    return (EReference)runCmdsStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getRunGroup()
  {
    return runGroupEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getRunGroup_RunGroups()
  {
    return (EReference)runGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getRunGroupImport()
  {
    return runGroupImportEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRunGroupImport_Attributes()
  {
    return (EAttribute)runGroupImportEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRunGroupImport_Enabled()
  {
    return (EAttribute)runGroupImportEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRunGroupImport_IncludeFile()
  {
    return (EAttribute)runGroupImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRunGroupImport_Resources()
  {
    return (EAttribute)runGroupImportEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRunGroupImport_RunGroup()
  {
    return (EAttribute)runGroupImportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSaturn()
  {
    return saturnEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSaturn_WorkDir()
  {
    return (EReference)saturnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSaturn_RunNumberFileName()
  {
    return (EReference)saturnEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSaturn_DefaultRunNumber()
  {
    return (EReference)saturnEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSaturn_PreExecutionListeners()
  {
    return (EReference)saturnEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSaturn_Listeners()
  {
    return (EReference)saturnEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSaturn_PostExecutionListeners()
  {
    return (EReference)saturnEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSaturn_Links()
  {
    return (EReference)saturnEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSaturn_ResourceLinks()
  {
    return (EReference)saturnEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSaturn_Version()
  {
    return (EAttribute)saturnEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingularityStep()
  {
    return singularityStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingularityStep_SingularityConfiguration()
  {
    return (EReference)singularityStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSoapIOStep()
  {
    return soapIOStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSoapIOStep_SoapIOConfiguration()
  {
    return (EReference)soapIOStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSQLStep()
  {
    return sqlStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLStep_SQLConfiguration()
  {
    return (EReference)sqlStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getVmsStep()
  {
    return vmsStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getXml2CsvStep()
  {
    return xml2CsvStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getXml2CsvStep_Xml2CsvConfiguration()
  {
    return (EReference)xml2CsvStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getXmlDiffStep()
  {
    return xmlDiffStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getXmlDiffStep_XmlDiffConfiguration()
  {
    return (EReference)xmlDiffStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getXmlGenStep()
  {
    return xmlGenStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getXmlGenStep_XmlGenConfiguration()
  {
    return (EReference)xmlGenStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getXmlManipStep()
  {
    return xmlManipStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getXmlManipStep_XmlManipConfiguration()
  {
    return (EReference)xmlManipStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getXmlValidatorStep()
  {
    return xmlValidatorStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getXmlValidatorStep_XmlValidatorConfiguration()
  {
    return (EReference)xmlValidatorStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getXSplitStep()
  {
    return xSplitStepEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getXSplitStep_XSplitConfiguration()
  {
    return (EReference)xSplitStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getIncludeFileType()
  {
    return includeFileTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getIncludeFileTypeObject()
  {
    return includeFileTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnFactory getSaturnFactory()
  {
    return (SaturnFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    abstractLinkEClass = createEClass(ABSTRACT_LINK);
    createEReference(abstractLinkEClass, ABSTRACT_LINK__SOURCE);
    createEReference(abstractLinkEClass, ABSTRACT_LINK__TARGET);

    abstractParameterEClass = createEClass(ABSTRACT_PARAMETER);
    createEAttribute(abstractParameterEClass, ABSTRACT_PARAMETER__NAME);
    createEAttribute(abstractParameterEClass, ABSTRACT_PARAMETER__IS_MANDATORY);

    abstractResourceLinkEClass = createEClass(ABSTRACT_RESOURCE_LINK);
    createEReference(abstractResourceLinkEClass, ABSTRACT_RESOURCE_LINK__SOURCE);
    createEReference(abstractResourceLinkEClass, ABSTRACT_RESOURCE_LINK__TARGET);

    abstractRunGroupEClass = createEClass(ABSTRACT_RUN_GROUP);
    createEReference(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__IMPORTS);
    createEReference(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__EXCEPTION);
    createEReference(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__RESOURCES);
    createEReference(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__ATTRIBUTES);
    createEReference(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__ANNOTATIONS);
    createEReference(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__REPETITION_HANDLER);
    createEReference(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__MODIFIERS);
    createEReference(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__PARAMETERS);
    createEReference(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__INCLUDE_FILES);
    createEReference(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__ALM_ID);
    createEAttribute(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__NAME);
    createEAttribute(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__ID);
    createEAttribute(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__ENABLED);
    createEAttribute(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__WARN_ON_FAILURE);
    createEAttribute(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__WAIT_BEFORE);
    createEAttribute(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__WAIT_AFTER);
    createEAttribute(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__DEFAULT_STATUS);
    createEAttribute(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__STATUS_CONDITION);
    createEAttribute(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__PROCEDURE);
    createEAttribute(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__CAN_MULTIPLEX);
    createEAttribute(abstractRunGroupEClass, ABSTRACT_RUN_GROUP__MAX_SIMULTANEOUS_ITERATIONS);

    abstractStepEClass = createEClass(ABSTRACT_STEP);

    abstractTerminalEClass = createEClass(ABSTRACT_TERMINAL);
    createEAttribute(abstractTerminalEClass, ABSTRACT_TERMINAL__REPETITION_ACTION);
    createEAttribute(abstractTerminalEClass, ABSTRACT_TERMINAL__TERMINATION_STATUS);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__EXTERNAL);

    attributeParameterEClass = createEClass(ATTRIBUTE_PARAMETER);
    createEReference(attributeParameterEClass, ATTRIBUTE_PARAMETER__DEFAULT_VALUE);

    cometStepEClass = createEClass(COMET_STEP);
    createEReference(cometStepEClass, COMET_STEP__COMET_CONFIGURATION);

    configEClass = createEClass(CONFIG);
    createEReference(configEClass, CONFIG__REQUIRED_PACKAGES);
    createEAttribute(configEClass, CONFIG__NAME);
    createEAttribute(configEClass, CONFIG__LOGIC_PROVIDER);

    cpsStepEClass = createEClass(CPS_STEP);
    createEReference(cpsStepEClass, CPS_STEP__CPS_CONFIGURATION);

    customLinkEClass = createEClass(CUSTOM_LINK);
    createEReference(customLinkEClass, CUSTOM_LINK__CODE);
    createEAttribute(customLinkEClass, CUSTOM_LINK__DESCRIPTION);

    dataCompareStepEClass = createEClass(DATA_COMPARE_STEP);
    createEReference(dataCompareStepEClass, DATA_COMPARE_STEP__DATA_COMPARE_CONFIGURATION);

    dataCompareSummaryStepEClass = createEClass(DATA_COMPARE_SUMMARY_STEP);

    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SATURN);

    documentumStepEClass = createEClass(DOCUMENTUM_STEP);
    createEReference(documentumStepEClass, DOCUMENTUM_STEP__DOCUMENTUM_CONFIGURATION);

    dsConvertStepEClass = createEClass(DS_CONVERT_STEP);
    createEReference(dsConvertStepEClass, DS_CONVERT_STEP__DS_CONVERT_CONFIGURATION);

    dsValidatorStepEClass = createEClass(DS_VALIDATOR_STEP);
    createEReference(dsValidatorStepEClass, DS_VALIDATOR_STEP__DS_VALIDATOR_CONFIGURATION);

    envValidatorStepEClass = createEClass(ENV_VALIDATOR_STEP);
    createEReference(envValidatorStepEClass, ENV_VALIDATOR_STEP__ENV_VALIDATOR_CONFIGURATION);

    extractDDLStepEClass = createEClass(EXTRACT_DDL_STEP);
    createEReference(extractDDLStepEClass, EXTRACT_DDL_STEP__EXTRACT_DDL_CONFIGURATION);

    failTerminalEClass = createEClass(FAIL_TERMINAL);

    fixManipStepEClass = createEClass(FIX_MANIP_STEP);
    createEReference(fixManipStepEClass, FIX_MANIP_STEP__FIX_MANIP_CONFIGURATION);

    includeFileEClass = createEClass(INCLUDE_FILE);
    createEAttribute(includeFileEClass, INCLUDE_FILE__NAME);
    createEAttribute(includeFileEClass, INCLUDE_FILE__FORMAT);

    jiraStepEClass = createEClass(JIRA_STEP);

    kronusStepEClass = createEClass(KRONUS_STEP);
    createEReference(kronusStepEClass, KRONUS_STEP__KRONUS_CALL_CONFIGURATION);

    mailStepEClass = createEClass(MAIL_STEP);
    createEReference(mailStepEClass, MAIL_STEP__MAIL_CONFIGURATION);

    mqStepEClass = createEClass(MQ_STEP);
    createEReference(mqStepEClass, MQ_STEP__MQ_CONFIGURATION);

    noopTerminalEClass = createEClass(NOOP_TERMINAL);

    onFailLinkEClass = createEClass(ON_FAIL_LINK);

    onFinishLinkEClass = createEClass(ON_FINISH_LINK);

    onPassLinkEClass = createEClass(ON_PASS_LINK);

    p4StepEClass = createEClass(P4_STEP);

    passTerminalEClass = createEClass(PASS_TERMINAL);

    perlRunGroupModifierEClass = createEClass(PERL_RUN_GROUP_MODIFIER);
    createEReference(perlRunGroupModifierEClass, PERL_RUN_GROUP_MODIFIER__PERL_CODE);

    procedureCallStepEClass = createEClass(PROCEDURE_CALL_STEP);
    createEReference(procedureCallStepEClass, PROCEDURE_CALL_STEP__PROCEDURE_CALL_CONFIGURATION);

    psManagerStepEClass = createEClass(PS_MANAGER_STEP);
    createEReference(psManagerStepEClass, PS_MANAGER_STEP__PS_MANAGER_CONFIGURATION);

    referenceEClass = createEClass(REFERENCE);
    createEAttribute(referenceEClass, REFERENCE__INCLUDE_FILE);
    createEAttribute(referenceEClass, REFERENCE__TEMPLATE);
    createEAttribute(referenceEClass, REFERENCE__RUN_GROUP);

    referenceStepEClass = createEClass(REFERENCE_STEP);
    createEReference(referenceStepEClass, REFERENCE_STEP__REFERENCE_CONFIGURATION);

    resourceLinkEClass = createEClass(RESOURCE_LINK);

    resourceNestedLinkEClass = createEClass(RESOURCE_NESTED_LINK);
    createEReference(resourceNestedLinkEClass, RESOURCE_NESTED_LINK__TARGET_ENCLOSING_RESOURCE);

    resourceParameterEClass = createEClass(RESOURCE_PARAMETER);
    createEReference(resourceParameterEClass, RESOURCE_PARAMETER__DEFAULT_RESOURCE);

    resourceStepLinkEClass = createEClass(RESOURCE_STEP_LINK);
    createEReference(resourceStepLinkEClass, RESOURCE_STEP_LINK__TARGET_STEP);
    createEAttribute(resourceStepLinkEClass, RESOURCE_STEP_LINK__DESCRIPTION);

    runCmdsStepEClass = createEClass(RUN_CMDS_STEP);
    createEReference(runCmdsStepEClass, RUN_CMDS_STEP__RUN_CMDS_CONFIGURATION);

    runGroupEClass = createEClass(RUN_GROUP);
    createEReference(runGroupEClass, RUN_GROUP__RUN_GROUPS);

    runGroupImportEClass = createEClass(RUN_GROUP_IMPORT);
    createEAttribute(runGroupImportEClass, RUN_GROUP_IMPORT__INCLUDE_FILE);
    createEAttribute(runGroupImportEClass, RUN_GROUP_IMPORT__RUN_GROUP);
    createEAttribute(runGroupImportEClass, RUN_GROUP_IMPORT__ATTRIBUTES);
    createEAttribute(runGroupImportEClass, RUN_GROUP_IMPORT__RESOURCES);
    createEAttribute(runGroupImportEClass, RUN_GROUP_IMPORT__ENABLED);

    saturnEClass = createEClass(SATURN);
    createEReference(saturnEClass, SATURN__WORK_DIR);
    createEReference(saturnEClass, SATURN__RUN_NUMBER_FILE_NAME);
    createEReference(saturnEClass, SATURN__DEFAULT_RUN_NUMBER);
    createEReference(saturnEClass, SATURN__PRE_EXECUTION_LISTENERS);
    createEReference(saturnEClass, SATURN__LISTENERS);
    createEReference(saturnEClass, SATURN__POST_EXECUTION_LISTENERS);
    createEReference(saturnEClass, SATURN__LINKS);
    createEReference(saturnEClass, SATURN__RESOURCE_LINKS);
    createEAttribute(saturnEClass, SATURN__VERSION);

    singularityStepEClass = createEClass(SINGULARITY_STEP);
    createEReference(singularityStepEClass, SINGULARITY_STEP__SINGULARITY_CONFIGURATION);

    soapIOStepEClass = createEClass(SOAP_IO_STEP);
    createEReference(soapIOStepEClass, SOAP_IO_STEP__SOAP_IO_CONFIGURATION);

    sqlStepEClass = createEClass(SQL_STEP);
    createEReference(sqlStepEClass, SQL_STEP__SQL_CONFIGURATION);

    vmsStepEClass = createEClass(VMS_STEP);

    xml2CsvStepEClass = createEClass(XML2_CSV_STEP);
    createEReference(xml2CsvStepEClass, XML2_CSV_STEP__XML2_CSV_CONFIGURATION);

    xmlDiffStepEClass = createEClass(XML_DIFF_STEP);
    createEReference(xmlDiffStepEClass, XML_DIFF_STEP__XML_DIFF_CONFIGURATION);

    xmlGenStepEClass = createEClass(XML_GEN_STEP);
    createEReference(xmlGenStepEClass, XML_GEN_STEP__XML_GEN_CONFIGURATION);

    xmlManipStepEClass = createEClass(XML_MANIP_STEP);
    createEReference(xmlManipStepEClass, XML_MANIP_STEP__XML_MANIP_CONFIGURATION);

    xmlValidatorStepEClass = createEClass(XML_VALIDATOR_STEP);
    createEReference(xmlValidatorStepEClass, XML_VALIDATOR_STEP__XML_VALIDATOR_CONFIGURATION);

    xSplitStepEClass = createEClass(XSPLIT_STEP);
    createEReference(xSplitStepEClass, XSPLIT_STEP__XSPLIT_CONFIGURATION);

    // Create enums
    includeFileTypeEEnum = createEEnum(INCLUDE_FILE_TYPE);

    // Create data types
    includeFileTypeObjectEDataType = createEDataType(INCLUDE_FILE_TYPE_OBJECT);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
    ReferenceResourcePackage theReferenceResourcePackage = (ReferenceResourcePackage)EPackage.Registry.INSTANCE.getEPackage(ReferenceResourcePackage.eNS_URI);
    ExceptionPackage theExceptionPackage = (ExceptionPackage)EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI);
    ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
    CometModulePackage theCometModulePackage = (CometModulePackage)EPackage.Registry.INSTANCE.getEPackage(CometModulePackage.eNS_URI);
    CpsModulePackage theCpsModulePackage = (CpsModulePackage)EPackage.Registry.INSTANCE.getEPackage(CpsModulePackage.eNS_URI);
    DatacompareModulePackage theDatacompareModulePackage = (DatacompareModulePackage)EPackage.Registry.INSTANCE.getEPackage(DatacompareModulePackage.eNS_URI);
    DocumentumModulePackage theDocumentumModulePackage = (DocumentumModulePackage)EPackage.Registry.INSTANCE.getEPackage(DocumentumModulePackage.eNS_URI);
    DsConvertModulePackage theDsConvertModulePackage = (DsConvertModulePackage)EPackage.Registry.INSTANCE.getEPackage(DsConvertModulePackage.eNS_URI);
    DsValidatorModulePackage theDsValidatorModulePackage = (DsValidatorModulePackage)EPackage.Registry.INSTANCE.getEPackage(DsValidatorModulePackage.eNS_URI);
    EnvValidatorModulePackage theEnvValidatorModulePackage = (EnvValidatorModulePackage)EPackage.Registry.INSTANCE.getEPackage(EnvValidatorModulePackage.eNS_URI);
    ExtractDDLModulePackage theExtractDDLModulePackage = (ExtractDDLModulePackage)EPackage.Registry.INSTANCE.getEPackage(ExtractDDLModulePackage.eNS_URI);
    FixManipModulePackage theFixManipModulePackage = (FixManipModulePackage)EPackage.Registry.INSTANCE.getEPackage(FixManipModulePackage.eNS_URI);
    BackportPackage theBackportPackage = (BackportPackage)EPackage.Registry.INSTANCE.getEPackage(BackportPackage.eNS_URI);
    MailModulePackage theMailModulePackage = (MailModulePackage)EPackage.Registry.INSTANCE.getEPackage(MailModulePackage.eNS_URI);
    MqModulePackage theMqModulePackage = (MqModulePackage)EPackage.Registry.INSTANCE.getEPackage(MqModulePackage.eNS_URI);
    ProcedureCallModulePackage theProcedureCallModulePackage = (ProcedureCallModulePackage)EPackage.Registry.INSTANCE.getEPackage(ProcedureCallModulePackage.eNS_URI);
    PsManagerModulePackage thePsManagerModulePackage = (PsManagerModulePackage)EPackage.Registry.INSTANCE.getEPackage(PsManagerModulePackage.eNS_URI);
    ReferenceModulePackage theReferenceModulePackage = (ReferenceModulePackage)EPackage.Registry.INSTANCE.getEPackage(ReferenceModulePackage.eNS_URI);
    RuncmdsModulePackage theRuncmdsModulePackage = (RuncmdsModulePackage)EPackage.Registry.INSTANCE.getEPackage(RuncmdsModulePackage.eNS_URI);
    SingularityModulePackage theSingularityModulePackage = (SingularityModulePackage)EPackage.Registry.INSTANCE.getEPackage(SingularityModulePackage.eNS_URI);
    SoapIOModulePackage theSoapIOModulePackage = (SoapIOModulePackage)EPackage.Registry.INSTANCE.getEPackage(SoapIOModulePackage.eNS_URI);
    SqlModulePackage theSqlModulePackage = (SqlModulePackage)EPackage.Registry.INSTANCE.getEPackage(SqlModulePackage.eNS_URI);
    Xml2csvModulePackage theXml2csvModulePackage = (Xml2csvModulePackage)EPackage.Registry.INSTANCE.getEPackage(Xml2csvModulePackage.eNS_URI);
    XmlDiffModulePackage theXmlDiffModulePackage = (XmlDiffModulePackage)EPackage.Registry.INSTANCE.getEPackage(XmlDiffModulePackage.eNS_URI);
    XmlGenModulePackage theXmlGenModulePackage = (XmlGenModulePackage)EPackage.Registry.INSTANCE.getEPackage(XmlGenModulePackage.eNS_URI);
    XmlManipModulePackage theXmlManipModulePackage = (XmlManipModulePackage)EPackage.Registry.INSTANCE.getEPackage(XmlManipModulePackage.eNS_URI);
    XmlValidatorModulePackage theXmlValidatorModulePackage = (XmlValidatorModulePackage)EPackage.Registry.INSTANCE.getEPackage(XmlValidatorModulePackage.eNS_URI);
    XSplitModulePackage theXSplitModulePackage = (XSplitModulePackage)EPackage.Registry.INSTANCE.getEPackage(XSplitModulePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    abstractStepEClass.getESuperTypes().add(this.getAbstractRunGroup());
    abstractTerminalEClass.getESuperTypes().add(this.getAbstractStep());
    attributeEClass.getESuperTypes().add(theValuesPackage.getComplexValue());
    attributeParameterEClass.getESuperTypes().add(this.getAbstractParameter());
    cometStepEClass.getESuperTypes().add(this.getAbstractStep());
    cpsStepEClass.getESuperTypes().add(this.getAbstractStep());
    customLinkEClass.getESuperTypes().add(this.getAbstractLink());
    dataCompareStepEClass.getESuperTypes().add(this.getAbstractStep());
    dataCompareSummaryStepEClass.getESuperTypes().add(this.getAbstractStep());
    documentumStepEClass.getESuperTypes().add(this.getAbstractStep());
    dsConvertStepEClass.getESuperTypes().add(this.getAbstractStep());
    dsValidatorStepEClass.getESuperTypes().add(this.getAbstractStep());
    envValidatorStepEClass.getESuperTypes().add(this.getAbstractStep());
    extractDDLStepEClass.getESuperTypes().add(this.getAbstractStep());
    failTerminalEClass.getESuperTypes().add(this.getAbstractTerminal());
    fixManipStepEClass.getESuperTypes().add(this.getAbstractStep());
    includeFileEClass.getESuperTypes().add(theValuesPackage.getComplexValue());
    jiraStepEClass.getESuperTypes().add(this.getAbstractStep());
    kronusStepEClass.getESuperTypes().add(this.getAbstractStep());
    mailStepEClass.getESuperTypes().add(this.getAbstractStep());
    mqStepEClass.getESuperTypes().add(this.getAbstractStep());
    noopTerminalEClass.getESuperTypes().add(this.getAbstractTerminal());
    onFailLinkEClass.getESuperTypes().add(this.getAbstractLink());
    onFinishLinkEClass.getESuperTypes().add(this.getAbstractLink());
    onPassLinkEClass.getESuperTypes().add(this.getAbstractLink());
    p4StepEClass.getESuperTypes().add(this.getAbstractStep());
    passTerminalEClass.getESuperTypes().add(this.getAbstractTerminal());
    perlRunGroupModifierEClass.getESuperTypes().add(theTypesPackage.getAbstractRunGroupModifier());
    procedureCallStepEClass.getESuperTypes().add(this.getAbstractStep());
    psManagerStepEClass.getESuperTypes().add(this.getAbstractStep());
    referenceStepEClass.getESuperTypes().add(this.getAbstractStep());
    resourceLinkEClass.getESuperTypes().add(this.getAbstractResourceLink());
    resourceNestedLinkEClass.getESuperTypes().add(this.getAbstractResourceLink());
    resourceParameterEClass.getESuperTypes().add(this.getAbstractParameter());
    resourceStepLinkEClass.getESuperTypes().add(this.getAbstractResourceLink());
    runCmdsStepEClass.getESuperTypes().add(this.getAbstractStep());
    runGroupEClass.getESuperTypes().add(this.getAbstractRunGroup());
    saturnEClass.getESuperTypes().add(this.getRunGroup());
    singularityStepEClass.getESuperTypes().add(this.getAbstractStep());
    soapIOStepEClass.getESuperTypes().add(this.getAbstractStep());
    sqlStepEClass.getESuperTypes().add(this.getAbstractStep());
    vmsStepEClass.getESuperTypes().add(this.getAbstractStep());
    xml2CsvStepEClass.getESuperTypes().add(this.getAbstractStep());
    xmlDiffStepEClass.getESuperTypes().add(this.getAbstractStep());
    xmlGenStepEClass.getESuperTypes().add(this.getAbstractStep());
    xmlManipStepEClass.getESuperTypes().add(this.getAbstractStep());
    xmlValidatorStepEClass.getESuperTypes().add(this.getAbstractStep());
    xSplitStepEClass.getESuperTypes().add(this.getAbstractStep());

    // Initialize classes and features; add operations and parameters
    initEClass(abstractLinkEClass, AbstractLink.class, "AbstractLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractLink_Source(), this.getAbstractRunGroup(), null, "source", null, 0, 1, AbstractLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractLink_Target(), this.getAbstractRunGroup(), null, "target", null, 0, 1, AbstractLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractParameterEClass, AbstractParameter.class, "AbstractParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractParameter_Name(), theTypesPackage.getObjectName(), "name", null, 1, 1, AbstractParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractParameter_IsMandatory(), theXMLTypePackage.getBoolean(), "isMandatory", "false", 0, 1, AbstractParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractResourceLinkEClass, AbstractResourceLink.class, "AbstractResourceLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractResourceLink_Source(), theTypesPackage.getNamedResourceDefinition(), null, "source", null, 0, 1, AbstractResourceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractResourceLink_Target(), theReferenceResourcePackage.getReferenceResource(), null, "target", null, 0, 1, AbstractResourceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractRunGroupEClass, AbstractRunGroup.class, "AbstractRunGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractRunGroup_Imports(), this.getRunGroupImport(), null, "imports", null, 0, -1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractRunGroup_Exception(), theExceptionPackage.getexception(), null, "exception", null, 0, 1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractRunGroup_Resources(), theTypesPackage.getNamedResourceDefinition(), null, "resources", null, 0, -1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractRunGroup_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractRunGroup_Annotations(), theTypesPackage.getAbstractAnnotation(), null, "annotations", null, 0, -1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractRunGroup_RepetitionHandler(), theTypesPackage.getAbstractRepetitionHandler(), null, "repetitionHandler", null, 0, 1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractRunGroup_Modifiers(), theTypesPackage.getAbstractRunGroupModifier(), null, "modifiers", null, 0, -1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractRunGroup_Parameters(), this.getAbstractParameter(), null, "parameters", null, 0, -1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractRunGroup_IncludeFiles(), this.getIncludeFile(), null, "includeFiles", null, 0, -1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractRunGroup_AlmId(), theTypesPackage.getAlmId(), null, "almId", null, 0, 1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractRunGroup_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractRunGroup_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractRunGroup_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractRunGroup_WarnOnFailure(), theXMLTypePackage.getBoolean(), "warnOnFailure", "false", 0, 1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractRunGroup_WaitBefore(), theXMLTypePackage.getInteger(), "waitBefore", "0", 0, 1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractRunGroup_WaitAfter(), theXMLTypePackage.getInteger(), "waitAfter", "0", 0, 1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractRunGroup_DefaultStatus(), theTypesPackage.getSaturnStatusEnum(), "defaultStatus", "FAIL", 0, 1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractRunGroup_StatusCondition(), theTypesPackage.getSaturnStatusConditionEnum(), "statusCondition", "ANY FAIL", 0, 1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractRunGroup_Procedure(), theXMLTypePackage.getBoolean(), "procedure", "false", 0, 1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractRunGroup_CanMultiplex(), theXMLTypePackage.getBoolean(), "canMultiplex", "false", 0, 1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractRunGroup_MaxSimultaneousIterations(), theXMLTypePackage.getInteger(), "maxSimultaneousIterations", "10", 0, 1, AbstractRunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractStepEClass, AbstractStep.class, "AbstractStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractTerminalEClass, AbstractTerminal.class, "AbstractTerminal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractTerminal_RepetitionAction(), theTypesPackage.getRepetitionActionsEnum(), "repetitionAction", "NONE", 0, 1, AbstractTerminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractTerminal_TerminationStatus(), theXMLTypePackage.getString(), "terminationStatus", null, 0, 1, AbstractTerminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Name(), theTypesPackage.getObjectName(), "name", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_External(), theXMLTypePackage.getBoolean(), "external", "false", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeParameterEClass, AttributeParameter.class, "AttributeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeParameter_DefaultValue(), theValuesPackage.getComplexValue(), null, "defaultValue", null, 0, 1, AttributeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cometStepEClass, CometStep.class, "CometStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCometStep_CometConfiguration(), theCometModulePackage.getCometConfiguration(), null, "cometConfiguration", null, 1, 1, CometStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configEClass, Config.class, "Config", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConfig_RequiredPackages(), ecorePackage.getEObject(), null, "requiredPackages", null, 0, -1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConfig_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConfig_LogicProvider(), theXMLTypePackage.getAnySimpleType(), "logicProvider", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cpsStepEClass, CpsStep.class, "CpsStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCpsStep_CpsConfiguration(), theCpsModulePackage.getCpsConfiguration(), null, "cpsConfiguration", null, 1, 1, CpsStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customLinkEClass, CustomLink.class, "CustomLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCustomLink_Code(), theValuesPackage.getComplexValue(), null, "code", null, 0, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomLink_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, CustomLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataCompareStepEClass, DataCompareStep.class, "DataCompareStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataCompareStep_DataCompareConfiguration(), theDatacompareModulePackage.getDataCompareConfiguration(), null, "dataCompareConfiguration", null, 1, 1, DataCompareStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataCompareSummaryStepEClass, DataCompareSummaryStep.class, "DataCompareSummaryStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Saturn(), this.getSaturn(), null, "saturn", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(documentumStepEClass, DocumentumStep.class, "DocumentumStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDocumentumStep_DocumentumConfiguration(), theDocumentumModulePackage.getDocumentumConfiguration(), null, "documentumConfiguration", null, 1, 1, DocumentumStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsConvertStepEClass, DSConvertStep.class, "DSConvertStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSConvertStep_DSConvertConfiguration(), theDsConvertModulePackage.getDSConvertConfiguration(), null, "dSConvertConfiguration", null, 1, 1, DSConvertStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsValidatorStepEClass, DSValidatorStep.class, "DSValidatorStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSValidatorStep_DSValidatorConfiguration(), theDsValidatorModulePackage.getDSValidatorConfiguration(), null, "dSValidatorConfiguration", null, 1, 1, DSValidatorStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(envValidatorStepEClass, EnvValidatorStep.class, "EnvValidatorStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnvValidatorStep_EnvValidatorConfiguration(), theEnvValidatorModulePackage.getEnvValidatorConfiguration(), null, "envValidatorConfiguration", null, 1, 1, EnvValidatorStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extractDDLStepEClass, ExtractDDLStep.class, "ExtractDDLStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtractDDLStep_ExtractDDLConfiguration(), theExtractDDLModulePackage.getExtractDDLConfiguration(), null, "extractDDLConfiguration", null, 1, 1, ExtractDDLStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(failTerminalEClass, FailTerminal.class, "FailTerminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fixManipStepEClass, FixManipStep.class, "FixManipStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFixManipStep_FixManipConfiguration(), theFixManipModulePackage.getFixManipConfiguration(), null, "fixManipConfiguration", null, 1, 1, FixManipStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(includeFileEClass, IncludeFile.class, "IncludeFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIncludeFile_Name(), theTypesPackage.getObjectName(), "name", null, 1, 1, IncludeFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIncludeFile_Format(), this.getIncludeFileType(), "format", "SATURN", 0, 1, IncludeFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jiraStepEClass, JiraStep.class, "JiraStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(kronusStepEClass, KronusStep.class, "KronusStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKronusStep_KronusCallConfiguration(), theBackportPackage.getKronusCallConfiguration(), null, "kronusCallConfiguration", null, 1, 1, KronusStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mailStepEClass, MailStep.class, "MailStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMailStep_MailConfiguration(), theMailModulePackage.getMailConfiguration(), null, "mailConfiguration", null, 1, 1, MailStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mqStepEClass, MQStep.class, "MQStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMQStep_MQConfiguration(), theMqModulePackage.getMQConfiguration(), null, "mQConfiguration", null, 1, 1, MQStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noopTerminalEClass, NoopTerminal.class, "NoopTerminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(onFailLinkEClass, OnFailLink.class, "OnFailLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(onFinishLinkEClass, OnFinishLink.class, "OnFinishLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(onPassLinkEClass, OnPassLink.class, "OnPassLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(p4StepEClass, P4Step.class, "P4Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(passTerminalEClass, PassTerminal.class, "PassTerminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(perlRunGroupModifierEClass, PerlRunGroupModifier.class, "PerlRunGroupModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPerlRunGroupModifier_PerlCode(), theValuesPackage.getComplexValue(), null, "perlCode", null, 1, 1, PerlRunGroupModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procedureCallStepEClass, ProcedureCallStep.class, "ProcedureCallStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcedureCallStep_ProcedureCallConfiguration(), theProcedureCallModulePackage.getProcedureCallConfiguration(), null, "procedureCallConfiguration", null, 1, 1, ProcedureCallStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(psManagerStepEClass, PsManagerStep.class, "PsManagerStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPsManagerStep_PsManagerConfiguration(), thePsManagerModulePackage.getPsManagerConfiguration(), null, "psManagerConfiguration", null, 1, 1, PsManagerStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReference_IncludeFile(), theXMLTypePackage.getToken(), "includeFile", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReference_Template(), theXMLTypePackage.getToken(), "template", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReference_RunGroup(), theXMLTypePackage.getToken(), "runGroup", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceStepEClass, ReferenceStep.class, "ReferenceStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceStep_ReferenceConfiguration(), theReferenceModulePackage.getReferenceConfiguration(), null, "referenceConfiguration", null, 1, 1, ReferenceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceLinkEClass, ResourceLink.class, "ResourceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resourceNestedLinkEClass, ResourceNestedLink.class, "ResourceNestedLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResourceNestedLink_TargetEnclosingResource(), theTypesPackage.getNamedResourceDefinition(), null, "targetEnclosingResource", null, 0, 1, ResourceNestedLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceParameterEClass, ResourceParameter.class, "ResourceParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResourceParameter_DefaultResource(), theTypesPackage.getNamedResourceDefinition(), null, "defaultResource", null, 0, 1, ResourceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceStepLinkEClass, ResourceStepLink.class, "ResourceStepLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResourceStepLink_TargetStep(), this.getAbstractStep(), null, "targetStep", null, 0, 1, ResourceStepLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceStepLink_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, ResourceStepLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(runCmdsStepEClass, RunCmdsStep.class, "RunCmdsStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRunCmdsStep_RunCmdsConfiguration(), theRuncmdsModulePackage.getRunCmdsConfiguration(), null, "runCmdsConfiguration", null, 1, 1, RunCmdsStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(runGroupEClass, RunGroup.class, "RunGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRunGroup_RunGroups(), this.getAbstractRunGroup(), null, "runGroups", null, 0, -1, RunGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(runGroupImportEClass, RunGroupImport.class, "RunGroupImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRunGroupImport_IncludeFile(), theXMLTypePackage.getToken(), "includeFile", null, 0, 1, RunGroupImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRunGroupImport_RunGroup(), theXMLTypePackage.getToken(), "runGroup", null, 0, 1, RunGroupImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRunGroupImport_Attributes(), theXMLTypePackage.getBoolean(), "attributes", "true", 0, 1, RunGroupImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRunGroupImport_Resources(), theXMLTypePackage.getBoolean(), "resources", "true", 0, 1, RunGroupImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRunGroupImport_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, RunGroupImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(saturnEClass, Saturn.class, "Saturn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSaturn_WorkDir(), theValuesPackage.getComplexValue(), null, "workDir", null, 0, 1, Saturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSaturn_RunNumberFileName(), theValuesPackage.getComplexValue(), null, "runNumberFileName", null, 0, 1, Saturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSaturn_DefaultRunNumber(), theValuesPackage.getComplexValue(), null, "defaultRunNumber", null, 0, 1, Saturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSaturn_PreExecutionListeners(), theTypesPackage.getAbstractListener(), null, "preExecutionListeners", null, 0, -1, Saturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSaturn_Listeners(), theTypesPackage.getAbstractListener(), null, "listeners", null, 0, -1, Saturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSaturn_PostExecutionListeners(), theTypesPackage.getAbstractListener(), null, "postExecutionListeners", null, 0, -1, Saturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSaturn_Links(), this.getAbstractLink(), null, "links", null, 0, -1, Saturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSaturn_ResourceLinks(), this.getAbstractResourceLink(), null, "resourceLinks", null, 0, -1, Saturn.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSaturn_Version(), theXMLTypePackage.getToken(), "version", "2.1.11", 0, 1, Saturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singularityStepEClass, SingularityStep.class, "SingularityStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSingularityStep_SingularityConfiguration(), theSingularityModulePackage.getSingularityConfiguration(), null, "singularityConfiguration", null, 1, 1, SingularityStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(soapIOStepEClass, SoapIOStep.class, "SoapIOStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSoapIOStep_SoapIOConfiguration(), theSoapIOModulePackage.getSoapIOConfiguration(), null, "soapIOConfiguration", null, 1, 1, SoapIOStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlStepEClass, SQLStep.class, "SQLStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSQLStep_SQLConfiguration(), theSqlModulePackage.getSQLConfiguration(), null, "sQLConfiguration", null, 1, 1, SQLStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vmsStepEClass, VmsStep.class, "VmsStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xml2CsvStepEClass, Xml2CsvStep.class, "Xml2CsvStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXml2CsvStep_Xml2CsvConfiguration(), theXml2csvModulePackage.getXml2CsvConfiguration(), null, "xml2CsvConfiguration", null, 1, 1, Xml2CsvStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xmlDiffStepEClass, XmlDiffStep.class, "XmlDiffStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXmlDiffStep_XmlDiffConfiguration(), theXmlDiffModulePackage.getXmlDiffConfiguration(), null, "xmlDiffConfiguration", null, 1, 1, XmlDiffStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xmlGenStepEClass, XmlGenStep.class, "XmlGenStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXmlGenStep_XmlGenConfiguration(), theXmlGenModulePackage.getXmlGenConfiguration(), null, "xmlGenConfiguration", null, 1, 1, XmlGenStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xmlManipStepEClass, XmlManipStep.class, "XmlManipStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXmlManipStep_XmlManipConfiguration(), theXmlManipModulePackage.getXmlManipConfiguration(), null, "xmlManipConfiguration", null, 1, 1, XmlManipStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xmlValidatorStepEClass, XmlValidatorStep.class, "XmlValidatorStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXmlValidatorStep_XmlValidatorConfiguration(), theXmlValidatorModulePackage.getXmlValidatorConfiguration(), null, "xmlValidatorConfiguration", null, 1, 1, XmlValidatorStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xSplitStepEClass, XSplitStep.class, "XSplitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXSplitStep_XSplitConfiguration(), theXSplitModulePackage.getXSplitConfiguration(), null, "xSplitConfiguration", null, 1, 1, XSplitStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(includeFileTypeEEnum, IncludeFileType.class, "IncludeFileType");
    addEEnumLiteral(includeFileTypeEEnum, IncludeFileType.SATURN);
    addEEnumLiteral(includeFileTypeEEnum, IncludeFileType.SCRIPTLIB);

    // Initialize data types
    initEDataType(includeFileTypeObjectEDataType, IncludeFileType.class, "IncludeFileTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // null
    createNullAnnotations();
    // http://www.ms.com/2011/tdo-qa-tools/rcs
    createRcsAnnotations();
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>null</b>.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void createNullAnnotations()
  {
    String source = null;	
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "appinfo", "\r\n      <sl:method name=\"forLoop\" xmlns:sl=\"http://www.ms.com/2011/pdsttools/xsd2scriptLib\">\r\n        return _forLoop(iterators =&gt; [iterators(@_)]);\r\n     </sl:method>\r\n   "
       });
  }

  /**
   * Initializes the annotations for <b>http://www.ms.com/2011/tdo-qa-tools/rcs</b>.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void createRcsAnnotations()
  {
    String source = "http://www.ms.com/2011/tdo-qa-tools/rcs";	
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "author", "$Author$",
       "change", "$Change$",
       "file", "$File$",
       "id", "$Id$",
       "revision", "$Revision$",
       "timestamp", "$DateTime$"
       });
  }

  /**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createExtendedMetaDataAnnotations()
  {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
    addAnnotation
      (abstractLinkEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractLink",
       "kind", "empty"
       });	
    addAnnotation
      (getAbstractLink_Source(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "source"
       });	
    addAnnotation
      (getAbstractLink_Target(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "target"
       });	
    addAnnotation
      (abstractParameterEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractParameter",
       "kind", "empty"
       });	
    addAnnotation
      (getAbstractParameter_Name(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "name"
       });	
    addAnnotation
      (getAbstractParameter_IsMandatory(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "isMandatory"
       });	
    addAnnotation
      (abstractResourceLinkEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractResourceLink",
       "kind", "empty"
       });	
    addAnnotation
      (getAbstractResourceLink_Source(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "source"
       });	
    addAnnotation
      (getAbstractResourceLink_Target(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "target"
       });	
    addAnnotation
      (abstractRunGroupEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractRunGroup",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getAbstractRunGroup_Imports(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Imports",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAbstractRunGroup_Exception(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Exception",
       "namespace", "http://www.ms.com/2009/Saturn/Exception"
       });	
    addAnnotation
      (getAbstractRunGroup_Resources(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Resources",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAbstractRunGroup_Attributes(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Attributes",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAbstractRunGroup_Annotations(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Annotations",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAbstractRunGroup_RepetitionHandler(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "RepetitionHandler",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAbstractRunGroup_Modifiers(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Modifiers",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAbstractRunGroup_Parameters(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Parameters",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAbstractRunGroup_IncludeFiles(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "IncludeFiles",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAbstractRunGroup_AlmId(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "AlmId",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAbstractRunGroup_Name(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "name"
       });	
    addAnnotation
      (getAbstractRunGroup_Id(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "id"
       });	
    addAnnotation
      (getAbstractRunGroup_Enabled(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "enabled"
       });	
    addAnnotation
      (getAbstractRunGroup_WarnOnFailure(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "warnOnFailure"
       });	
    addAnnotation
      (getAbstractRunGroup_WaitBefore(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "waitBefore"
       });	
    addAnnotation
      (getAbstractRunGroup_WaitAfter(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "waitAfter"
       });	
    addAnnotation
      (getAbstractRunGroup_DefaultStatus(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "defaultStatus"
       });	
    addAnnotation
      (getAbstractRunGroup_StatusCondition(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "statusCondition"
       });	
    addAnnotation
      (getAbstractRunGroup_Procedure(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "procedure"
       });	
    addAnnotation
      (getAbstractRunGroup_CanMultiplex(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "canMultiplex"
       });	
    addAnnotation
      (getAbstractRunGroup_MaxSimultaneousIterations(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "maxSimultaneousIterations"
       });	
    addAnnotation
      (abstractStepEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (abstractTerminalEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractTerminal",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getAbstractTerminal_RepetitionAction(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "repetitionAction"
       });	
    addAnnotation
      (getAbstractTerminal_TerminationStatus(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "terminationStatus"
       });	
    addAnnotation
      (attributeEClass, 
       source, 
       new String[] 
       {
       "name", "Attribute",
       "kind", "mixed"
       });	
    addAnnotation
      (getAttribute_Name(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "name"
       });	
    addAnnotation
      (getAttribute_External(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "external"
       });	
    addAnnotation
      (attributeParameterEClass, 
       source, 
       new String[] 
       {
       "name", "AttributeParameter",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getAttributeParameter_DefaultValue(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DefaultValue",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (cometStepEClass, 
       source, 
       new String[] 
       {
       "name", "CometStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getCometStep_CometConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2011/Saturn/Modules/Comet"
       });	
    addAnnotation
      (configEClass, 
       source, 
       new String[] 
       {
       "name", "Config",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getConfig_RequiredPackages(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "RequiredPackages",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getConfig_Name(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "name"
       });	
    addAnnotation
      (getConfig_LogicProvider(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "logicProvider"
       });	
    addAnnotation
      (cpsStepEClass, 
       source, 
       new String[] 
       {
       "name", "CpsStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getCpsStep_CpsConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2009/Saturn/Modules/Cps"
       });	
    addAnnotation
      (customLinkEClass, 
       source, 
       new String[] 
       {
       "name", "CustomLink",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getCustomLink_Code(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Code",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCustomLink_Description(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "Description"
       });	
    addAnnotation
      (dataCompareStepEClass, 
       source, 
       new String[] 
       {
       "name", "DataCompareStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getDataCompareStep_DataCompareConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2006/Saturn/Modules/DataCompare"
       });	
    addAnnotation
      (dataCompareSummaryStepEClass, 
       source, 
       new String[] 
       {
       "name", "DataCompareSummaryStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (documentRootEClass, 
       source, 
       new String[] 
       {
       "name", "",
       "kind", "mixed"
       });	
    addAnnotation
      (getDocumentRoot_Mixed(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",
       "name", ":mixed"
       });	
    addAnnotation
      (getDocumentRoot_XMLNSPrefixMap(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xmlns:prefix"
       });	
    addAnnotation
      (getDocumentRoot_XSISchemaLocation(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xsi:schemaLocation"
       });	
    addAnnotation
      (getDocumentRoot_Saturn(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Saturn",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (documentumStepEClass, 
       source, 
       new String[] 
       {
       "name", "DocumentumStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getDocumentumStep_DocumentumConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2006/Saturn/Modules/Documentum"
       });	
    addAnnotation
      (dsConvertStepEClass, 
       source, 
       new String[] 
       {
       "name", "DSConvertStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getDSConvertStep_DSConvertConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2009/Saturn/Modules/DsConvert"
       });	
    addAnnotation
      (dsValidatorStepEClass, 
       source, 
       new String[] 
       {
       "name", "DSValidatorStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getDSValidatorStep_DSValidatorConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2009/Saturn/Modules/DsValidator"
       });	
    addAnnotation
      (envValidatorStepEClass, 
       source, 
       new String[] 
       {
       "name", "EnvValidatorStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getEnvValidatorStep_EnvValidatorConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2009/Saturn/Modules/EnvValidator"
       });	
    addAnnotation
      (extractDDLStepEClass, 
       source, 
       new String[] 
       {
       "name", "ExtractDDLStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getExtractDDLStep_ExtractDDLConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2009/Saturn/Modules/ExtractDDL"
       });	
    addAnnotation
      (failTerminalEClass, 
       source, 
       new String[] 
       {
       "name", "FailTerminal",
       "kind", "elementOnly"
       });	
    addAnnotation
      (fixManipStepEClass, 
       source, 
       new String[] 
       {
       "name", "FixManipStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getFixManipStep_FixManipConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2011/Saturn/Modules/FixManip"
       });	
    addAnnotation
      (includeFileEClass, 
       source, 
       new String[] 
       {
       "name", "IncludeFile",
       "kind", "mixed"
       });	
    addAnnotation
      (getIncludeFile_Name(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "name"
       });	
    addAnnotation
      (getIncludeFile_Format(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "format"
       });	
    addAnnotation
      (includeFileTypeEEnum, 
       source, 
       new String[] 
       {
       "name", "IncludeFileType"
       });	
    addAnnotation
      (includeFileTypeObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "IncludeFileType:Object",
       "baseType", "IncludeFileType"
       });	
    addAnnotation
      (jiraStepEClass, 
       source, 
       new String[] 
       {
       "name", "JiraStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (kronusStepEClass, 
       source, 
       new String[] 
       {
       "name", "KronusStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getKronusStep_KronusCallConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "KronusCallConfiguration",
       "namespace", "http://www.ms.com/2015/Saturn/Kronus"
       });	
    addAnnotation
      (mailStepEClass, 
       source, 
       new String[] 
       {
       "name", "MailStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getMailStep_MailConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2006/Saturn/Modules/Mail"
       });	
    addAnnotation
      (mqStepEClass, 
       source, 
       new String[] 
       {
       "name", "MQStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getMQStep_MQConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2006/Saturn/Modules/MQ"
       });	
    addAnnotation
      (noopTerminalEClass, 
       source, 
       new String[] 
       {
       "name", "NoopTerminal",
       "kind", "elementOnly"
       });	
    addAnnotation
      (onFailLinkEClass, 
       source, 
       new String[] 
       {
       "name", "OnFailLink",
       "kind", "empty"
       });	
    addAnnotation
      (onFinishLinkEClass, 
       source, 
       new String[] 
       {
       "name", "OnFinishLink",
       "kind", "empty"
       });	
    addAnnotation
      (onPassLinkEClass, 
       source, 
       new String[] 
       {
       "name", "OnPassLink",
       "kind", "empty"
       });	
    addAnnotation
      (p4StepEClass, 
       source, 
       new String[] 
       {
       "name", "P4Step",
       "kind", "elementOnly"
       });	
    addAnnotation
      (passTerminalEClass, 
       source, 
       new String[] 
       {
       "name", "PassTerminal",
       "kind", "elementOnly"
       });	
    addAnnotation
      (perlRunGroupModifierEClass, 
       source, 
       new String[] 
       {
       "name", "PerlRunGroupModifier",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getPerlRunGroupModifier_PerlCode(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "PerlCode",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (procedureCallStepEClass, 
       source, 
       new String[] 
       {
       "name", "ProcedureCallStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getProcedureCallStep_ProcedureCallConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2009/Saturn/Modules/ProcedureCall"
       });	
    addAnnotation
      (psManagerStepEClass, 
       source, 
       new String[] 
       {
       "name", "PsManagerStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getPsManagerStep_PsManagerConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2009/Saturn/Modules/PsManager"
       });	
    addAnnotation
      (referenceEClass, 
       source, 
       new String[] 
       {
       "name", "Reference",
       "kind", "empty"
       });	
    addAnnotation
      (getReference_IncludeFile(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "includeFile"
       });	
    addAnnotation
      (getReference_Template(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "template"
       });	
    addAnnotation
      (getReference_RunGroup(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "runGroup"
       });	
    addAnnotation
      (referenceStepEClass, 
       source, 
       new String[] 
       {
       "name", "ReferenceStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getReferenceStep_ReferenceConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2007/Saturn/Modules/Reference"
       });	
    addAnnotation
      (resourceLinkEClass, 
       source, 
       new String[] 
       {
       "name", "ResourceLink",
       "kind", "empty"
       });	
    addAnnotation
      (resourceNestedLinkEClass, 
       source, 
       new String[] 
       {
       "name", "ResourceNestedLink",
       "kind", "empty"
       });	
    addAnnotation
      (getResourceNestedLink_TargetEnclosingResource(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "targetEnclosingResource"
       });	
    addAnnotation
      (resourceParameterEClass, 
       source, 
       new String[] 
       {
       "name", "ResourceParameter",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getResourceParameter_DefaultResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DefaultResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (resourceStepLinkEClass, 
       source, 
       new String[] 
       {
       "name", "ResourceStepLink",
       "kind", "empty"
       });	
    addAnnotation
      (getResourceStepLink_TargetStep(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "targetStep"
       });	
    addAnnotation
      (getResourceStepLink_Description(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "description"
       });	
    addAnnotation
      (runCmdsStepEClass, 
       source, 
       new String[] 
       {
       "name", "RunCmdsStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getRunCmdsStep_RunCmdsConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2006/Saturn/Modules/RunCmds"
       });	
    addAnnotation
      (runGroupEClass, 
       source, 
       new String[] 
       {
       "name", "RunGroup",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getRunGroup_RunGroups(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "RunGroups",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (runGroupImportEClass, 
       source, 
       new String[] 
       {
       "name", "Imports_._type",
       "kind", "empty"
       });	
    addAnnotation
      (getRunGroupImport_IncludeFile(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "includeFile"
       });	
    addAnnotation
      (getRunGroupImport_RunGroup(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "runGroup"
       });	
    addAnnotation
      (getRunGroupImport_Attributes(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "attributes"
       });	
    addAnnotation
      (getRunGroupImport_Resources(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "resources"
       });	
    addAnnotation
      (getRunGroupImport_Enabled(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "enabled"
       });	
    addAnnotation
      (saturnEClass, 
       source, 
       new String[] 
       {
       "name", "Saturn_._type",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getSaturn_WorkDir(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "WorkDir",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSaturn_RunNumberFileName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "RunNumberFileName",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSaturn_DefaultRunNumber(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DefaultRunNumber",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSaturn_PreExecutionListeners(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "PreExecutionListeners",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSaturn_Listeners(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Listeners",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSaturn_PostExecutionListeners(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "PostExecutionListeners",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSaturn_Links(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Links",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSaturn_ResourceLinks(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ResourceLinks",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSaturn_Version(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "version"
       });	
    addAnnotation
      (singularityStepEClass, 
       source, 
       new String[] 
       {
       "name", "SingularityStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getSingularityStep_SingularityConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2009/Saturn/Modules/Singularity"
       });	
    addAnnotation
      (soapIOStepEClass, 
       source, 
       new String[] 
       {
       "name", "SoapIOStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getSoapIOStep_SoapIOConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2007/Saturn/Modules/SoapIO"
       });	
    addAnnotation
      (sqlStepEClass, 
       source, 
       new String[] 
       {
       "name", "SQLStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getSQLStep_SQLConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2006/Saturn/Modules/SQL"
       });	
    addAnnotation
      (vmsStepEClass, 
       source, 
       new String[] 
       {
       "name", "VmsStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (xml2CsvStepEClass, 
       source, 
       new String[] 
       {
       "name", "Xml2CsvStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getXml2CsvStep_Xml2CsvConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2006/Saturn/Modules/Xml2Csv"
       });	
    addAnnotation
      (xmlDiffStepEClass, 
       source, 
       new String[] 
       {
       "name", "XmlDiffStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getXmlDiffStep_XmlDiffConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2007/Saturn/Modules/XmlDiff"
       });	
    addAnnotation
      (xmlGenStepEClass, 
       source, 
       new String[] 
       {
       "name", "XmlGenStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getXmlGenStep_XmlGenConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2007/Saturn/Modules/XmlGen"
       });	
    addAnnotation
      (xmlManipStepEClass, 
       source, 
       new String[] 
       {
       "name", "XmlManipStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getXmlManipStep_XmlManipConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2009/Saturn/Modules/XmlManip"
       });	
    addAnnotation
      (xmlValidatorStepEClass, 
       source, 
       new String[] 
       {
       "name", "XmlValidatorStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getXmlValidatorStep_XmlValidatorConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2009/Saturn/Modules/XmlValidator"
       });	
    addAnnotation
      (xSplitStepEClass, 
       source, 
       new String[] 
       {
       "name", "XSplitStep",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getXSplitStep_XSplitConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "http://www.ms.com/2006/Saturn/Modules/XSplit"
       });
  }

} // SaturnPackageImpl
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
