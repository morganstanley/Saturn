package com.ms.qaTools.saturn.annotations.saturnWeb.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.ms.qaTools.saturn.SaturnPackage;
import com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage;
import com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportPackageImpl;
import com.ms.qaTools.saturn.annotations.saturnVerbosity.SaturnVerbosityPackage;
import com.ms.qaTools.saturn.annotations.saturnVerbosity.impl.SaturnVerbosityPackageImpl;
import com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.AbstractTargetDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption;
import com.ms.qaTools.saturn.annotations.saturnWeb.DropDownSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration;
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebFactory;
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage;
import com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum;
import com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueEnvVarTargetDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueTargetDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.ValueDefinition;
import com.ms.qaTools.saturn.exception.ExceptionPackage;
import com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl;
import com.ms.qaTools.saturn.impl.SaturnPackageImpl;
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
public class SaturnWebPackageImpl extends EPackageImpl implements SaturnWebPackage
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    abstractSourceDefinitionEClass          = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    abstractTargetDefinitionEClass          = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    dropDownOptionEClass                    = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    dropDownSourceDefinitionEClass          = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    fileSelectorSourceDefinitionEClass      = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    saturnWebConfigurationEClass            = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    singleValueEnvVarTargetDefinitionEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    singleValueTargetDefinitionEClass       = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    textSourceDefinitionEClass              = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    valueDefinitionEClass                   = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     selectorTypeEnumEEnum                   = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType selectorTypeEnumObjectEDataType         = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SaturnWebPackageImpl()
  {
    super(eNS_URI, SaturnWebFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SaturnWebPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SaturnWebPackage init()
  {
    if (isInited) return (SaturnWebPackage)EPackage.Registry.INSTANCE.getEPackage(SaturnWebPackage.eNS_URI);

    // Obtain or create and register package
    SaturnWebPackageImpl theSaturnWebPackage = (SaturnWebPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SaturnWebPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SaturnWebPackageImpl());

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
    SaturnPackageImpl theSaturnPackage = (SaturnPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SaturnPackage.eNS_URI) instanceof SaturnPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SaturnPackage.eNS_URI) : SaturnPackage.eINSTANCE);
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
    theSaturnWebPackage.createPackageContents();
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
    theSaturnPackage.createPackageContents();
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
    theSaturnWebPackage.initializePackageContents();
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
    theSaturnPackage.initializePackageContents();
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
    theSaturnWebPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SaturnWebPackage.eNS_URI, theSaturnWebPackage);
    return theSaturnWebPackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractSourceDefinition()
  {
    return abstractSourceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractSourceDefinition_Caption()
  {
    return (EAttribute)abstractSourceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractSourceDefinition_Description()
  {
    return (EAttribute)abstractSourceDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractTargetDefinition()
  {
    return abstractTargetDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDropDownOption()
  {
    return dropDownOptionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDropDownOption_Selected()
  {
    return (EAttribute)dropDownOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDropDownOption_Text()
  {
    return (EAttribute)dropDownOptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDropDownOption_Value()
  {
    return (EAttribute)dropDownOptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDropDownSourceDefinition()
  {
    return dropDownSourceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDropDownSourceDefinition_Options()
  {
    return (EReference)dropDownSourceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDropDownSourceDefinition_MultiSelect()
  {
    return (EAttribute)dropDownSourceDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getFileSelectorSourceDefinition()
  {
    return fileSelectorSourceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileSelectorSourceDefinition_DefaultValue()
  {
    return (EAttribute)fileSelectorSourceDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileSelectorSourceDefinition_Directory()
  {
    return (EAttribute)fileSelectorSourceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileSelectorSourceDefinition_FilePattern()
  {
    return (EAttribute)fileSelectorSourceDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileSelectorSourceDefinition_SelectorType()
  {
    return (EAttribute)fileSelectorSourceDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSaturnWebConfiguration()
  {
    return saturnWebConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSaturnWebConfiguration_Name()
  {
    return (EAttribute)saturnWebConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSaturnWebConfiguration_Description()
  {
    return (EAttribute)saturnWebConfigurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSaturnWebConfiguration_Values()
  {
    return (EReference)saturnWebConfigurationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSaturnWebConfiguration_Enabled()
  {
    return (EAttribute)saturnWebConfigurationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleValueEnvVarTargetDefinition()
  {
    return singleValueEnvVarTargetDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleValueEnvVarTargetDefinition_EnvVar()
  {
    return (EAttribute)singleValueEnvVarTargetDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleValueTargetDefinition()
  {
    return singleValueTargetDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextSourceDefinition()
  {
    return textSourceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextSourceDefinition_DefaultValue()
  {
    return (EAttribute)textSourceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextSourceDefinition_MultiLine()
  {
    return (EAttribute)textSourceDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextSourceDefinition_Password()
  {
    return (EAttribute)textSourceDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueDefinition()
  {
    return valueDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueDefinition_Source()
  {
    return (EReference)valueDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueDefinition_Target()
  {
    return (EReference)valueDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSelectorTypeEnum()
  {
    return selectorTypeEnumEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getSelectorTypeEnumObject()
  {
    return selectorTypeEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnWebFactory getSaturnWebFactory()
  {
    return (SaturnWebFactory)getEFactoryInstance();
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
    abstractSourceDefinitionEClass = createEClass(ABSTRACT_SOURCE_DEFINITION);
    createEAttribute(abstractSourceDefinitionEClass, ABSTRACT_SOURCE_DEFINITION__CAPTION);
    createEAttribute(abstractSourceDefinitionEClass, ABSTRACT_SOURCE_DEFINITION__DESCRIPTION);

    abstractTargetDefinitionEClass = createEClass(ABSTRACT_TARGET_DEFINITION);

    dropDownOptionEClass = createEClass(DROP_DOWN_OPTION);
    createEAttribute(dropDownOptionEClass, DROP_DOWN_OPTION__SELECTED);
    createEAttribute(dropDownOptionEClass, DROP_DOWN_OPTION__TEXT);
    createEAttribute(dropDownOptionEClass, DROP_DOWN_OPTION__VALUE);

    dropDownSourceDefinitionEClass = createEClass(DROP_DOWN_SOURCE_DEFINITION);
    createEReference(dropDownSourceDefinitionEClass, DROP_DOWN_SOURCE_DEFINITION__OPTIONS);
    createEAttribute(dropDownSourceDefinitionEClass, DROP_DOWN_SOURCE_DEFINITION__MULTI_SELECT);

    fileSelectorSourceDefinitionEClass = createEClass(FILE_SELECTOR_SOURCE_DEFINITION);
    createEAttribute(fileSelectorSourceDefinitionEClass, FILE_SELECTOR_SOURCE_DEFINITION__DIRECTORY);
    createEAttribute(fileSelectorSourceDefinitionEClass, FILE_SELECTOR_SOURCE_DEFINITION__FILE_PATTERN);
    createEAttribute(fileSelectorSourceDefinitionEClass, FILE_SELECTOR_SOURCE_DEFINITION__DEFAULT_VALUE);
    createEAttribute(fileSelectorSourceDefinitionEClass, FILE_SELECTOR_SOURCE_DEFINITION__SELECTOR_TYPE);

    saturnWebConfigurationEClass = createEClass(SATURN_WEB_CONFIGURATION);
    createEAttribute(saturnWebConfigurationEClass, SATURN_WEB_CONFIGURATION__NAME);
    createEAttribute(saturnWebConfigurationEClass, SATURN_WEB_CONFIGURATION__DESCRIPTION);
    createEReference(saturnWebConfigurationEClass, SATURN_WEB_CONFIGURATION__VALUES);
    createEAttribute(saturnWebConfigurationEClass, SATURN_WEB_CONFIGURATION__ENABLED);

    singleValueEnvVarTargetDefinitionEClass = createEClass(SINGLE_VALUE_ENV_VAR_TARGET_DEFINITION);
    createEAttribute(singleValueEnvVarTargetDefinitionEClass, SINGLE_VALUE_ENV_VAR_TARGET_DEFINITION__ENV_VAR);

    singleValueTargetDefinitionEClass = createEClass(SINGLE_VALUE_TARGET_DEFINITION);

    textSourceDefinitionEClass = createEClass(TEXT_SOURCE_DEFINITION);
    createEAttribute(textSourceDefinitionEClass, TEXT_SOURCE_DEFINITION__DEFAULT_VALUE);
    createEAttribute(textSourceDefinitionEClass, TEXT_SOURCE_DEFINITION__MULTI_LINE);
    createEAttribute(textSourceDefinitionEClass, TEXT_SOURCE_DEFINITION__PASSWORD);

    valueDefinitionEClass = createEClass(VALUE_DEFINITION);
    createEReference(valueDefinitionEClass, VALUE_DEFINITION__SOURCE);
    createEReference(valueDefinitionEClass, VALUE_DEFINITION__TARGET);

    // Create enums
    selectorTypeEnumEEnum = createEEnum(SELECTOR_TYPE_ENUM);

    // Create data types
    selectorTypeEnumObjectEDataType = createEDataType(SELECTOR_TYPE_ENUM_OBJECT);
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
    XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    dropDownSourceDefinitionEClass.getESuperTypes().add(this.getAbstractSourceDefinition());
    fileSelectorSourceDefinitionEClass.getESuperTypes().add(this.getAbstractSourceDefinition());
    saturnWebConfigurationEClass.getESuperTypes().add(theTypesPackage.getAbstractAnnotation());
    singleValueEnvVarTargetDefinitionEClass.getESuperTypes().add(this.getSingleValueTargetDefinition());
    singleValueTargetDefinitionEClass.getESuperTypes().add(this.getAbstractTargetDefinition());
    textSourceDefinitionEClass.getESuperTypes().add(this.getAbstractSourceDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(abstractSourceDefinitionEClass, AbstractSourceDefinition.class, "AbstractSourceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractSourceDefinition_Caption(), theXMLTypePackage.getString(), "caption", null, 0, 1, AbstractSourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractSourceDefinition_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, AbstractSourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractTargetDefinitionEClass, AbstractTargetDefinition.class, "AbstractTargetDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dropDownOptionEClass, DropDownOption.class, "DropDownOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDropDownOption_Selected(), theXMLTypePackage.getBoolean(), "selected", "false", 0, 1, DropDownOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDropDownOption_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, DropDownOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDropDownOption_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, DropDownOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dropDownSourceDefinitionEClass, DropDownSourceDefinition.class, "DropDownSourceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDropDownSourceDefinition_Options(), this.getDropDownOption(), null, "options", null, 0, -1, DropDownSourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDropDownSourceDefinition_MultiSelect(), theXMLTypePackage.getBoolean(), "multiSelect", "false", 0, 1, DropDownSourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fileSelectorSourceDefinitionEClass, FileSelectorSourceDefinition.class, "FileSelectorSourceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFileSelectorSourceDefinition_Directory(), theXMLTypePackage.getString(), "directory", null, 0, 1, FileSelectorSourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFileSelectorSourceDefinition_FilePattern(), theXMLTypePackage.getString(), "filePattern", null, 0, 1, FileSelectorSourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFileSelectorSourceDefinition_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1, FileSelectorSourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFileSelectorSourceDefinition_SelectorType(), this.getSelectorTypeEnum(), "selectorType", "FILE", 0, 1, FileSelectorSourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(saturnWebConfigurationEClass, SaturnWebConfiguration.class, "SaturnWebConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSaturnWebConfiguration_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SaturnWebConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSaturnWebConfiguration_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, SaturnWebConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSaturnWebConfiguration_Values(), this.getValueDefinition(), null, "values", null, 0, -1, SaturnWebConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSaturnWebConfiguration_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, SaturnWebConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleValueEnvVarTargetDefinitionEClass, SingleValueEnvVarTargetDefinition.class, "SingleValueEnvVarTargetDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSingleValueEnvVarTargetDefinition_EnvVar(), theXMLTypePackage.getString(), "envVar", null, 1, 1, SingleValueEnvVarTargetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleValueTargetDefinitionEClass, SingleValueTargetDefinition.class, "SingleValueTargetDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(textSourceDefinitionEClass, TextSourceDefinition.class, "TextSourceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextSourceDefinition_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1, TextSourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTextSourceDefinition_MultiLine(), theXMLTypePackage.getBoolean(), "multiLine", "false", 0, 1, TextSourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTextSourceDefinition_Password(), theXMLTypePackage.getBoolean(), "password", "false", 0, 1, TextSourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueDefinitionEClass, ValueDefinition.class, "ValueDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValueDefinition_Source(), this.getAbstractSourceDefinition(), null, "source", null, 1, 1, ValueDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValueDefinition_Target(), this.getAbstractTargetDefinition(), null, "target", null, 1, 1, ValueDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(selectorTypeEnumEEnum, SelectorTypeEnum.class, "SelectorTypeEnum");
    addEEnumLiteral(selectorTypeEnumEEnum, SelectorTypeEnum.FILE);
    addEEnumLiteral(selectorTypeEnumEEnum, SelectorTypeEnum.DIRECTORY);

    // Initialize data types
    initEDataType(selectorTypeEnumObjectEDataType, SelectorTypeEnum.class, "SelectorTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.ms.com/2006/pdsttools/xsd2perl
    createXsd2perlAnnotations();
    // http://www.ms.com/2011/tdo-qa-tools/rcs
    createRcsAnnotations();
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
    // caption
    createCaptionAnnotations();
    // description
    createDescriptionAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.ms.com/2006/pdsttools/xsd2perl</b>.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void createXsd2perlAnnotations()
  {
    String source = "http://www.ms.com/2006/pdsttools/xsd2perl";	
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "nsPrefix", "saturnWeb",
       "package", "Saturn::Web::XML"
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
      (abstractSourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractSourceDefinition",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getAbstractSourceDefinition_Caption(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Caption",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getAbstractSourceDefinition_Description(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Description",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (abstractTargetDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractTargetDefinition",
       "kind", "empty"
       });	
    addAnnotation
      (dropDownOptionEClass, 
       source, 
       new String[] 
       {
       "name", "DropDownOption",
       "kind", "empty"
       });	
    addAnnotation
      (getDropDownOption_Selected(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "selected"
       });	
    addAnnotation
      (getDropDownOption_Text(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "text"
       });	
    addAnnotation
      (getDropDownOption_Value(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "value"
       });	
    addAnnotation
      (dropDownSourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "DropDownSourceDefinition",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getDropDownSourceDefinition_Options(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Options",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getDropDownSourceDefinition_MultiSelect(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "multiSelect"
       });	
    addAnnotation
      (fileSelectorSourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "FileSelectorSourceDefinition",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getFileSelectorSourceDefinition_Directory(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "directory"
       });	
    addAnnotation
      (getFileSelectorSourceDefinition_FilePattern(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "filePattern"
       });	
    addAnnotation
      (getFileSelectorSourceDefinition_DefaultValue(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "defaultValue"
       });	
    addAnnotation
      (getFileSelectorSourceDefinition_SelectorType(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "selectorType"
       });	
    addAnnotation
      (saturnWebConfigurationEClass, 
       source, 
       new String[] 
       {
       "name", "SaturnWebConfiguration",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getSaturnWebConfiguration_Name(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Name",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSaturnWebConfiguration_Description(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Description",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSaturnWebConfiguration_Values(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Values",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSaturnWebConfiguration_Enabled(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "enabled"
       });	
    addAnnotation
      (selectorTypeEnumEEnum, 
       source, 
       new String[] 
       {
       "name", "SelectorTypeEnum"
       });	
    addAnnotation
      (selectorTypeEnumObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "SelectorTypeEnum:Object",
       "baseType", "SelectorTypeEnum"
       });	
    addAnnotation
      (singleValueEnvVarTargetDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "SingleValueEnvVarTargetDefinition",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getSingleValueEnvVarTargetDefinition_EnvVar(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "EnvVar",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (singleValueTargetDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "SingleValueTargetDefinition",
       "kind", "empty"
       });	
    addAnnotation
      (textSourceDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "TextSourceDefinition",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getTextSourceDefinition_DefaultValue(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "defaultValue"
       });	
    addAnnotation
      (getTextSourceDefinition_MultiLine(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "multiLine"
       });	
    addAnnotation
      (getTextSourceDefinition_Password(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "password"
       });	
    addAnnotation
      (valueDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "ValueDefinition",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getValueDefinition_Source(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Source",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getValueDefinition_Target(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Target",
       "namespace", "##targetNamespace"
       });
  }

  /**
   * Initializes the annotations for <b>caption</b>.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void createCaptionAnnotations()
  {
    String source = "caption";	
    addAnnotation
      (saturnWebConfigurationEClass, 
       source, 
       new String[] 
       {
       "appinfo", "Saturn Web Annotation"
       });
  }

  /**
   * Initializes the annotations for <b>description</b>.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void createDescriptionAnnotations()
  {
    String source = "description";	
    addAnnotation
      (saturnWebConfigurationEClass, 
       source, 
       new String[] 
       {
       "appinfo", ""
       });
  }

} // SaturnWebPackageImpl
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
