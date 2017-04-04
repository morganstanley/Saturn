package com.ms.qaTools.saturn.modules.sqlModule.impl;

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
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage;
import com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl;
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
import com.ms.qaTools.saturn.modules.sqlModule.AbstractSQLOperation;
import com.ms.qaTools.saturn.modules.sqlModule.ClearTable;
import com.ms.qaTools.saturn.modules.sqlModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.sqlModule.ExecuteCommand;
import com.ms.qaTools.saturn.modules.sqlModule.FetchQuery;
import com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum;
import com.ms.qaTools.saturn.modules.sqlModule.LoadTable;
import com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition;
import com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SQLClearOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SQLConfiguration;
import com.ms.qaTools.saturn.modules.sqlModule.SQLExecuteOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation;
import com.ms.qaTools.saturn.modules.sqlModule.SqlModuleFactory;
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage;
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
public class SqlModulePackageImpl extends EPackageImpl implements SqlModulePackage
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    abstractSQLOperationEClass     = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    clearTableEClass               = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    documentRootEClass             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    executeCommandEClass           = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    fetchQueryEClass               = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    loadTableEClass                = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    procCallDefinitionEClass       = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    sqlCallOperationEClass         = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    sqlClearOperationEClass        = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    sqlConfigurationEClass         = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    sqlExecuteOperationEClass      = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    sqlFetchOperationEClass        = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    sqlLoadOperationEClass         = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     ioFileTypesEnumEEnum           = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType ioFileTypesEnumObjectEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SqlModulePackageImpl()
  {
    super(eNS_URI, SqlModuleFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SqlModulePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SqlModulePackage init()
  {
    if (isInited) return (SqlModulePackage)EPackage.Registry.INSTANCE.getEPackage(SqlModulePackage.eNS_URI);

    // Obtain or create and register package
    SqlModulePackageImpl theSqlModulePackage = (SqlModulePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SqlModulePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SqlModulePackageImpl());

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
    theSqlModulePackage.createPackageContents();
    theDatacompareModulePackage.createPackageContents();
    theTypesPackage.createPackageContents();
    theDocumentumModulePackage.createPackageContents();
    theValuesPackage.createPackageContents();
    theMailModulePackage.createPackageContents();
    theMqModulePackage.createPackageContents();
    theRuncmdsModulePackage.createPackageContents();
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
    theSqlModulePackage.initializePackageContents();
    theDatacompareModulePackage.initializePackageContents();
    theTypesPackage.initializePackageContents();
    theDocumentumModulePackage.initializePackageContents();
    theValuesPackage.initializePackageContents();
    theMailModulePackage.initializePackageContents();
    theMqModulePackage.initializePackageContents();
    theRuncmdsModulePackage.initializePackageContents();
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
    theSqlModulePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SqlModulePackage.eNS_URI, theSqlModulePackage);
    return theSqlModulePackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractSQLOperation()
  {
    return abstractSQLOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getClearTable()
  {
    return clearTableEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClearTable_Enabled()
  {
    return (EAttribute)clearTableEClass.getEStructuralFeatures().get(0);
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
  public EReference getDocumentRoot_SQLConfiguration()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecuteCommand()
  {
    return executeCommandEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecuteCommand_Exception()
  {
    return (EReference)executeCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecuteCommand_SQL()
  {
    return (EReference)executeCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecuteCommand_ParameterFile()
  {
    return (EReference)executeCommandEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExecuteCommand_Enabled()
  {
    return (EAttribute)executeCommandEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getFetchQuery()
  {
    return fetchQueryEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getFetchQuery_Exception()
  {
    return (EReference)fetchQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getFetchQuery_SQL()
  {
    return (EReference)fetchQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getFetchQuery_Output()
  {
    return (EReference)fetchQueryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getFetchQuery_ParameterFile()
  {
    return (EReference)fetchQueryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFetchQuery_Enabled()
  {
    return (EAttribute)fetchQueryEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoadTable()
  {
    return loadTableEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoadTable_Exception()
  {
    return (EReference)loadTableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoadTable_Input()
  {
    return (EReference)loadTableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoadTable_SQL()
  {
    return (EReference)loadTableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadTable_BatchSize()
  {
    return (EAttribute)loadTableEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadTable_CleanLoad()
  {
    return (EAttribute)loadTableEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadTable_Enabled()
  {
    return (EAttribute)loadTableEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcCallDefinition()
  {
    return procCallDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcCallDefinition_SQL()
  {
    return (EReference)procCallDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcCallDefinition_Output()
  {
    return (EReference)procCallDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcCallDefinition_ParameterFile()
  {
    return (EReference)procCallDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getProcCallDefinition_IgnoreVal()
  {
    return (EReference)procCallDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcCallDefinition_CallCount()
  {
    return (EAttribute)procCallDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcCallDefinition_Enabled()
  {
    return (EAttribute)procCallDefinitionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcCallDefinition_HasOutput()
  {
    return (EAttribute)procCallDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSQLCallOperation()
  {
    return sqlCallOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLCallOperation_OutputResource()
  {
    return (EReference)sqlCallOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLCallOperation_ParameterResource()
  {
    return (EReference)sqlCallOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLCallOperation_ProcedureCalls()
  {
    return (EReference)sqlCallOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSQLCallOperation_DefaultOutputResourceType()
  {
    return (EAttribute)sqlCallOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSQLClearOperation()
  {
    return sqlClearOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLClearOperation_Tables()
  {
    return (EReference)sqlClearOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLClearOperation_TableGroupDefinition()
  {
    return (EReference)sqlClearOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSQLConfiguration()
  {
    return sqlConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLConfiguration_DatabaseResource()
  {
    return (EReference)sqlConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLConfiguration_Operation()
  {
    return (EReference)sqlConfigurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSQLExecuteOperation()
  {
    return sqlExecuteOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLExecuteOperation_ParameterResource()
  {
    return (EReference)sqlExecuteOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLExecuteOperation_Commands()
  {
    return (EReference)sqlExecuteOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSQLFetchOperation()
  {
    return sqlFetchOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLFetchOperation_OutputResource()
  {
    return (EReference)sqlFetchOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLFetchOperation_ParameterResource()
  {
    return (EReference)sqlFetchOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLFetchOperation_Queries()
  {
    return (EReference)sqlFetchOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLFetchOperation_TableGroupDefinition()
  {
    return (EReference)sqlFetchOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSQLFetchOperation_DefaultOutputResourceType()
  {
    return (EAttribute)sqlFetchOperationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSQLLoadOperation()
  {
    return sqlLoadOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLLoadOperation_InputResource()
  {
    return (EReference)sqlLoadOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLLoadOperation_Tables()
  {
    return (EReference)sqlLoadOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getSQLLoadOperation_TableGroupDefinition()
  {
    return (EReference)sqlLoadOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSQLLoadOperation_DefaultInputResourceType()
  {
    return (EAttribute)sqlLoadOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getIOFileTypesEnum()
  {
    return ioFileTypesEnumEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getIOFileTypesEnumObject()
  {
    return ioFileTypesEnumObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SqlModuleFactory getSqlModuleFactory()
  {
    return (SqlModuleFactory)getEFactoryInstance();
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
    abstractSQLOperationEClass = createEClass(ABSTRACT_SQL_OPERATION);

    clearTableEClass = createEClass(CLEAR_TABLE);
    createEAttribute(clearTableEClass, CLEAR_TABLE__ENABLED);

    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SQL_CONFIGURATION);

    executeCommandEClass = createEClass(EXECUTE_COMMAND);
    createEReference(executeCommandEClass, EXECUTE_COMMAND__EXCEPTION);
    createEReference(executeCommandEClass, EXECUTE_COMMAND__SQL);
    createEReference(executeCommandEClass, EXECUTE_COMMAND__PARAMETER_FILE);
    createEAttribute(executeCommandEClass, EXECUTE_COMMAND__ENABLED);

    fetchQueryEClass = createEClass(FETCH_QUERY);
    createEReference(fetchQueryEClass, FETCH_QUERY__EXCEPTION);
    createEReference(fetchQueryEClass, FETCH_QUERY__SQL);
    createEReference(fetchQueryEClass, FETCH_QUERY__OUTPUT);
    createEReference(fetchQueryEClass, FETCH_QUERY__PARAMETER_FILE);
    createEAttribute(fetchQueryEClass, FETCH_QUERY__ENABLED);

    loadTableEClass = createEClass(LOAD_TABLE);
    createEReference(loadTableEClass, LOAD_TABLE__EXCEPTION);
    createEReference(loadTableEClass, LOAD_TABLE__INPUT);
    createEReference(loadTableEClass, LOAD_TABLE__SQL);
    createEAttribute(loadTableEClass, LOAD_TABLE__CLEAN_LOAD);
    createEAttribute(loadTableEClass, LOAD_TABLE__ENABLED);
    createEAttribute(loadTableEClass, LOAD_TABLE__BATCH_SIZE);

    procCallDefinitionEClass = createEClass(PROC_CALL_DEFINITION);
    createEReference(procCallDefinitionEClass, PROC_CALL_DEFINITION__SQL);
    createEReference(procCallDefinitionEClass, PROC_CALL_DEFINITION__OUTPUT);
    createEReference(procCallDefinitionEClass, PROC_CALL_DEFINITION__PARAMETER_FILE);
    createEReference(procCallDefinitionEClass, PROC_CALL_DEFINITION__IGNORE_VAL);
    createEAttribute(procCallDefinitionEClass, PROC_CALL_DEFINITION__HAS_OUTPUT);
    createEAttribute(procCallDefinitionEClass, PROC_CALL_DEFINITION__CALL_COUNT);
    createEAttribute(procCallDefinitionEClass, PROC_CALL_DEFINITION__ENABLED);

    sqlCallOperationEClass = createEClass(SQL_CALL_OPERATION);
    createEReference(sqlCallOperationEClass, SQL_CALL_OPERATION__OUTPUT_RESOURCE);
    createEReference(sqlCallOperationEClass, SQL_CALL_OPERATION__PARAMETER_RESOURCE);
    createEReference(sqlCallOperationEClass, SQL_CALL_OPERATION__PROCEDURE_CALLS);
    createEAttribute(sqlCallOperationEClass, SQL_CALL_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE);

    sqlClearOperationEClass = createEClass(SQL_CLEAR_OPERATION);
    createEReference(sqlClearOperationEClass, SQL_CLEAR_OPERATION__TABLES);
    createEReference(sqlClearOperationEClass, SQL_CLEAR_OPERATION__TABLE_GROUP_DEFINITION);

    sqlConfigurationEClass = createEClass(SQL_CONFIGURATION);
    createEReference(sqlConfigurationEClass, SQL_CONFIGURATION__DATABASE_RESOURCE);
    createEReference(sqlConfigurationEClass, SQL_CONFIGURATION__OPERATION);

    sqlExecuteOperationEClass = createEClass(SQL_EXECUTE_OPERATION);
    createEReference(sqlExecuteOperationEClass, SQL_EXECUTE_OPERATION__PARAMETER_RESOURCE);
    createEReference(sqlExecuteOperationEClass, SQL_EXECUTE_OPERATION__COMMANDS);

    sqlFetchOperationEClass = createEClass(SQL_FETCH_OPERATION);
    createEReference(sqlFetchOperationEClass, SQL_FETCH_OPERATION__OUTPUT_RESOURCE);
    createEReference(sqlFetchOperationEClass, SQL_FETCH_OPERATION__PARAMETER_RESOURCE);
    createEReference(sqlFetchOperationEClass, SQL_FETCH_OPERATION__QUERIES);
    createEReference(sqlFetchOperationEClass, SQL_FETCH_OPERATION__TABLE_GROUP_DEFINITION);
    createEAttribute(sqlFetchOperationEClass, SQL_FETCH_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE);

    sqlLoadOperationEClass = createEClass(SQL_LOAD_OPERATION);
    createEReference(sqlLoadOperationEClass, SQL_LOAD_OPERATION__INPUT_RESOURCE);
    createEReference(sqlLoadOperationEClass, SQL_LOAD_OPERATION__TABLES);
    createEReference(sqlLoadOperationEClass, SQL_LOAD_OPERATION__TABLE_GROUP_DEFINITION);
    createEAttribute(sqlLoadOperationEClass, SQL_LOAD_OPERATION__DEFAULT_INPUT_RESOURCE_TYPE);

    // Create enums
    ioFileTypesEnumEEnum = createEEnum(IO_FILE_TYPES_ENUM);

    // Create data types
    ioFileTypesEnumObjectEDataType = createEDataType(IO_FILE_TYPES_ENUM_OBJECT);
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
    ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
    XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
    ExceptionPackage theExceptionPackage = (ExceptionPackage)EPackage.Registry.INSTANCE.getEPackage(ExceptionPackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    clearTableEClass.getESuperTypes().add(theValuesPackage.getComplexValue());
    sqlCallOperationEClass.getESuperTypes().add(this.getAbstractSQLOperation());
    sqlClearOperationEClass.getESuperTypes().add(this.getAbstractSQLOperation());
    sqlExecuteOperationEClass.getESuperTypes().add(this.getAbstractSQLOperation());
    sqlFetchOperationEClass.getESuperTypes().add(this.getAbstractSQLOperation());
    sqlLoadOperationEClass.getESuperTypes().add(this.getAbstractSQLOperation());

    // Initialize classes and features; add operations and parameters
    initEClass(abstractSQLOperationEClass, AbstractSQLOperation.class, "AbstractSQLOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(clearTableEClass, ClearTable.class, "ClearTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClearTable_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, ClearTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SQLConfiguration(), this.getSQLConfiguration(), null, "sQLConfiguration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(executeCommandEClass, ExecuteCommand.class, "ExecuteCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExecuteCommand_Exception(), theExceptionPackage.getexception(), null, "exception", null, 0, 1, ExecuteCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecuteCommand_SQL(), theValuesPackage.getComplexValue(), null, "sQL", null, 1, 1, ExecuteCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecuteCommand_ParameterFile(), theTypesPackage.getResourceDefinition(), null, "parameterFile", null, 0, 1, ExecuteCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExecuteCommand_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, ExecuteCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fetchQueryEClass, FetchQuery.class, "FetchQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFetchQuery_Exception(), theExceptionPackage.getexception(), null, "exception", null, 0, 1, FetchQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFetchQuery_SQL(), theValuesPackage.getComplexValue(), null, "sQL", null, 1, 1, FetchQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFetchQuery_Output(), theTypesPackage.getResourceDefinition(), null, "output", null, 0, 1, FetchQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFetchQuery_ParameterFile(), theTypesPackage.getResourceDefinition(), null, "parameterFile", null, 0, 1, FetchQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFetchQuery_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, FetchQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loadTableEClass, LoadTable.class, "LoadTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLoadTable_Exception(), theExceptionPackage.getexception(), null, "exception", null, 0, 1, LoadTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoadTable_Input(), theTypesPackage.getResourceDefinition(), null, "input", null, 1, 1, LoadTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoadTable_SQL(), theValuesPackage.getComplexValue(), null, "sQL", null, 0, 1, LoadTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadTable_CleanLoad(), theXMLTypePackage.getBoolean(), "cleanLoad", "false", 0, 1, LoadTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadTable_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, LoadTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadTable_BatchSize(), theXMLTypePackage.getInteger(), "batchSize", "0", 0, 1, LoadTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(procCallDefinitionEClass, ProcCallDefinition.class, "ProcCallDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProcCallDefinition_SQL(), theValuesPackage.getComplexValue(), null, "sQL", null, 1, 1, ProcCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcCallDefinition_Output(), theTypesPackage.getResourceDefinition(), null, "output", null, 0, 1, ProcCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcCallDefinition_ParameterFile(), theTypesPackage.getResourceDefinition(), null, "parameterFile", null, 0, 1, ProcCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcCallDefinition_IgnoreVal(), theValuesPackage.getComplexValue(), null, "ignoreVal", null, 0, 1, ProcCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcCallDefinition_HasOutput(), theXMLTypePackage.getBoolean(), "hasOutput", "true", 0, 1, ProcCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcCallDefinition_CallCount(), theXMLTypePackage.getInteger(), "callCount", "1", 0, 1, ProcCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcCallDefinition_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1, ProcCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlCallOperationEClass, SQLCallOperation.class, "SQLCallOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSQLCallOperation_OutputResource(), theTypesPackage.getResourceDefinition(), null, "outputResource", null, 0, 1, SQLCallOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSQLCallOperation_ParameterResource(), theTypesPackage.getResourceDefinition(), null, "parameterResource", null, 0, 1, SQLCallOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSQLCallOperation_ProcedureCalls(), this.getProcCallDefinition(), null, "procedureCalls", null, 0, -1, SQLCallOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSQLCallOperation_DefaultOutputResourceType(), this.getIOFileTypesEnum(), "defaultOutputResourceType", "CSV", 0, 1, SQLCallOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlClearOperationEClass, SQLClearOperation.class, "SQLClearOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSQLClearOperation_Tables(), this.getClearTable(), null, "tables", null, 0, -1, SQLClearOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSQLClearOperation_TableGroupDefinition(), theTypesPackage.getResourceDefinition(), null, "tableGroupDefinition", null, 0, 1, SQLClearOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlConfigurationEClass, SQLConfiguration.class, "SQLConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSQLConfiguration_DatabaseResource(), theTypesPackage.getResourceDefinition(), null, "databaseResource", null, 1, 1, SQLConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSQLConfiguration_Operation(), this.getAbstractSQLOperation(), null, "operation", null, 1, 1, SQLConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlExecuteOperationEClass, SQLExecuteOperation.class, "SQLExecuteOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSQLExecuteOperation_ParameterResource(), theTypesPackage.getResourceDefinition(), null, "parameterResource", null, 0, 1, SQLExecuteOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSQLExecuteOperation_Commands(), this.getExecuteCommand(), null, "commands", null, 0, -1, SQLExecuteOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlFetchOperationEClass, SQLFetchOperation.class, "SQLFetchOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSQLFetchOperation_OutputResource(), theTypesPackage.getResourceDefinition(), null, "outputResource", null, 0, 1, SQLFetchOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSQLFetchOperation_ParameterResource(), theTypesPackage.getResourceDefinition(), null, "parameterResource", null, 0, 1, SQLFetchOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSQLFetchOperation_Queries(), this.getFetchQuery(), null, "queries", null, 0, -1, SQLFetchOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSQLFetchOperation_TableGroupDefinition(), theTypesPackage.getResourceDefinition(), null, "tableGroupDefinition", null, 0, 1, SQLFetchOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSQLFetchOperation_DefaultOutputResourceType(), this.getIOFileTypesEnum(), "defaultOutputResourceType", "CSV", 0, 1, SQLFetchOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlLoadOperationEClass, SQLLoadOperation.class, "SQLLoadOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSQLLoadOperation_InputResource(), theTypesPackage.getResourceDefinition(), null, "inputResource", null, 0, 1, SQLLoadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSQLLoadOperation_Tables(), this.getLoadTable(), null, "tables", null, 0, -1, SQLLoadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSQLLoadOperation_TableGroupDefinition(), theTypesPackage.getResourceDefinition(), null, "tableGroupDefinition", null, 0, 1, SQLLoadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSQLLoadOperation_DefaultInputResourceType(), this.getIOFileTypesEnum(), "defaultInputResourceType", "CSV", 0, 1, SQLLoadOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(ioFileTypesEnumEEnum, IOFileTypesEnum.class, "IOFileTypesEnum");
    addEEnumLiteral(ioFileTypesEnumEEnum, IOFileTypesEnum.CSV);
    addEEnumLiteral(ioFileTypesEnumEEnum, IOFileTypesEnum.DATA);

    // Initialize data types
    initEDataType(ioFileTypesEnumObjectEDataType, IOFileTypesEnum.class, "IOFileTypesEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.ms.com/2011/tdo-qa-tools/rcs
    createRcsAnnotations();
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
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
      (abstractSQLOperationEClass, 
       source, 
       new String[] 
       {
       "name", "AbstractSQLOperation",
       "kind", "empty"
       });	
    addAnnotation
      (clearTableEClass, 
       source, 
       new String[] 
       {
       "name", "ClearTable",
       "kind", "mixed"
       });	
    addAnnotation
      (getClearTable_Enabled(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "enabled"
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
      (getDocumentRoot_SQLConfiguration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Configuration",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (executeCommandEClass, 
       source, 
       new String[] 
       {
       "name", "Commands_._type",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getExecuteCommand_Exception(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Exception",
       "namespace", "http://www.ms.com/2009/Saturn/Exception"
       });	
    addAnnotation
      (getExecuteCommand_SQL(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SQL",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getExecuteCommand_ParameterFile(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ParameterFile",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getExecuteCommand_Enabled(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "enabled"
       });	
    addAnnotation
      (fetchQueryEClass, 
       source, 
       new String[] 
       {
       "name", "Queries_._type",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getFetchQuery_Exception(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Exception",
       "namespace", "http://www.ms.com/2009/Saturn/Exception"
       });	
    addAnnotation
      (getFetchQuery_SQL(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SQL",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getFetchQuery_Output(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Output",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getFetchQuery_ParameterFile(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ParameterFile",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getFetchQuery_Enabled(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "enabled"
       });	
    addAnnotation
      (ioFileTypesEnumEEnum, 
       source, 
       new String[] 
       {
       "name", "IOFileTypesEnum"
       });	
    addAnnotation
      (ioFileTypesEnumObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "IOFileTypesEnum:Object",
       "baseType", "IOFileTypesEnum"
       });	
    addAnnotation
      (loadTableEClass, 
       source, 
       new String[] 
       {
       "name", "Tables_._type",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getLoadTable_Exception(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Exception",
       "namespace", "http://www.ms.com/2009/Saturn/Exception"
       });	
    addAnnotation
      (getLoadTable_Input(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Input",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getLoadTable_SQL(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SQL",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getLoadTable_CleanLoad(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "cleanLoad"
       });	
    addAnnotation
      (getLoadTable_Enabled(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "enabled"
       });	
    addAnnotation
      (getLoadTable_BatchSize(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "batchSize"
       });	
    addAnnotation
      (procCallDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "ProcedureCalls_._type",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getProcCallDefinition_SQL(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SQL",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getProcCallDefinition_Output(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Output",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getProcCallDefinition_ParameterFile(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ParameterFile",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getProcCallDefinition_IgnoreVal(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "IgnoreVal",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getProcCallDefinition_HasOutput(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "hasOutput"
       });	
    addAnnotation
      (getProcCallDefinition_CallCount(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "callCount"
       });	
    addAnnotation
      (getProcCallDefinition_Enabled(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "enabled"
       });	
    addAnnotation
      (sqlCallOperationEClass, 
       source, 
       new String[] 
       {
       "name", "Call",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getSQLCallOperation_OutputResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "OutputResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSQLCallOperation_ParameterResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ParameterResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSQLCallOperation_ProcedureCalls(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ProcedureCalls",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSQLCallOperation_DefaultOutputResourceType(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "defaultOutputResourceType"
       });	
    addAnnotation
      (sqlClearOperationEClass, 
       source, 
       new String[] 
       {
       "name", "Clear",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getSQLClearOperation_Tables(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Tables",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSQLClearOperation_TableGroupDefinition(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "TableGroupDefinition",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (sqlConfigurationEClass, 
       source, 
       new String[] 
       {
       "name", "Configuration_._type",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getSQLConfiguration_DatabaseResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DatabaseResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSQLConfiguration_Operation(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Operation",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (sqlExecuteOperationEClass, 
       source, 
       new String[] 
       {
       "name", "Execute",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getSQLExecuteOperation_ParameterResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ParameterResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSQLExecuteOperation_Commands(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Commands",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (sqlFetchOperationEClass, 
       source, 
       new String[] 
       {
       "name", "Fetch",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getSQLFetchOperation_OutputResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "OutputResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSQLFetchOperation_ParameterResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ParameterResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSQLFetchOperation_Queries(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Queries",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSQLFetchOperation_TableGroupDefinition(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "TableGroupDefinition",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSQLFetchOperation_DefaultOutputResourceType(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "defaultOutputResourceType"
       });	
    addAnnotation
      (sqlLoadOperationEClass, 
       source, 
       new String[] 
       {
       "name", "Load",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getSQLLoadOperation_InputResource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "InputResource",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSQLLoadOperation_Tables(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Tables",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSQLLoadOperation_TableGroupDefinition(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "TableGroupDefinition",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getSQLLoadOperation_DefaultInputResourceType(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "defaultInputResourceType"
       });
  }

} // SqlModulePackageImpl
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
