package com.ms.qaTools.saturn.resources.fileResource.impl;

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
import com.ms.qaTools.saturn.resources.fileResource.BinaryFile;
import com.ms.qaTools.saturn.resources.fileResource.CSVFile;
import com.ms.qaTools.saturn.resources.fileResource.CustomFile;
import com.ms.qaTools.saturn.resources.fileResource.DataFile;
import com.ms.qaTools.saturn.resources.fileResource.DataSetFile;
import com.ms.qaTools.saturn.resources.fileResource.DeviceFile;
import com.ms.qaTools.saturn.resources.fileResource.ExcelVersions;
import com.ms.qaTools.saturn.resources.fileResource.ExcelWorkBook;
import com.ms.qaTools.saturn.resources.fileResource.ExcelWorkSheet;
import com.ms.qaTools.saturn.resources.fileResource.FIXFile;
import com.ms.qaTools.saturn.resources.fileResource.FileResourceFactory;
import com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage;
import com.ms.qaTools.saturn.resources.fileResource.FixedWidthFile;
import com.ms.qaTools.saturn.resources.fileResource.GoogleProtoBufFile;
import com.ms.qaTools.saturn.resources.fileResource.JsonFile;
import com.ms.qaTools.saturn.resources.fileResource.LineFile;
import com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkBook;
import com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet;
import com.ms.qaTools.saturn.resources.fileResource.PropertiesFile;
import com.ms.qaTools.saturn.resources.fileResource.SlurpFile;
import com.ms.qaTools.saturn.resources.fileResource.StandardIO;
import com.ms.qaTools.saturn.resources.fileResource.XMLFile;
import com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinition;
import com.ms.qaTools.saturn.resources.fileResource.XMLNamespaceDefinitions;
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
public class FileResourcePackageImpl extends EPackageImpl implements FileResourcePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryFileEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    csvFileEClass                = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    customFileEClass             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    dataFileEClass               = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    dataSetFileEClass            = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    deviceFileEClass             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    excelWorkBookEClass          = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    excelWorkSheetEClass         = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    fixedWidthFileEClass         = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    fixFileEClass                = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    googleProtoBufFileEClass     = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    jsonFileEClass               = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    lineFileEClass               = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    ooCalcWorkBookEClass         = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    ooCalcWorkSheetEClass        = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    propertiesFileEClass         = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    slurpFileEClass              = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    standardIOEClass             = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass    xmlFileEClass                = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xmlNamespaceDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xmlNamespaceDefinitionsEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum     excelVersionsEEnum           = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType excelVersionsObjectEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FileResourcePackageImpl()
  {
    super(eNS_URI, FileResourceFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FileResourcePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FileResourcePackage init()
  {
    if (isInited) return (FileResourcePackage)EPackage.Registry.INSTANCE.getEPackage(FileResourcePackage.eNS_URI);

    // Obtain or create and register package
    FileResourcePackageImpl theFileResourcePackage = (FileResourcePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FileResourcePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FileResourcePackageImpl());

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
    theFileResourcePackage.createPackageContents();
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
    theFileResourcePackage.initializePackageContents();
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
    theFileResourcePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FileResourcePackage.eNS_URI, theFileResourcePackage);
    return theFileResourcePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryFile()
  {
    return binaryFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryFile_ChunkSize()
  {
    return (EAttribute)binaryFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSVFile()
  {
    return csvFileEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomFile()
  {
    return customFileEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomFile_NullMarker()
  {
    return (EReference)customFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomFile_RowSeparator()
  {
    return (EReference)customFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomFile_CellSeparator()
  {
    return (EReference)customFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomFile_QuoteCharacter()
  {
    return (EReference)customFileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomFile_EscapeCharacter()
  {
    return (EReference)customFileEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomFile_HasNulls()
  {
    return (EAttribute)customFileEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataFile()
  {
    return dataFileEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataSetFile()
  {
    return dataSetFileEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataSetFile_FirstRow()
  {
    return (EAttribute)dataSetFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviceFile()
  {
    return deviceFileEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeviceFile_FileName()
  {
    return (EReference)deviceFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceFile_Append()
  {
    return (EAttribute)deviceFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceFile_CanRead()
  {
    return (EAttribute)deviceFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceFile_CanWrite()
  {
    return (EAttribute)deviceFileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceFile_Create()
  {
    return (EAttribute)deviceFileEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceFile_Exists()
  {
    return (EAttribute)deviceFileEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviceFile_Filter()
  {
    return (EAttribute)deviceFileEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getExcelWorkBook()
  {
    return excelWorkBookEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExcelWorkBook_Version()
  {
    return (EAttribute)excelWorkBookEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getExcelWorkSheet()
  {
    return excelWorkSheetEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getExcelWorkSheet_WorkSheet()
  {
    return (EReference)excelWorkSheetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getExcelWorkSheet_NullMarker()
  {
    return (EReference)excelWorkSheetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExcelWorkSheet_HasNulls()
  {
    return (EAttribute)excelWorkSheetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getFixedWidthFile()
  {
    return fixedWidthFileEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getFixedWidthFile_ConfigFile()
  {
    return (EReference)fixedWidthFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getFIXFile()
  {
    return fixFileEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getFIXFile_Separator()
  {
    return (EReference)fixFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFIXFile_Dictionary()
  {
    return (EReference)fixFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFIXFile_DoValidation()
  {
    return (EAttribute)fixFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoogleProtoBufFile()
  {
    return googleProtoBufFileEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoogleProtoBufFile_Classname()
  {
    return (EReference)googleProtoBufFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoogleProtoBufFile_JarLocation()
  {
    return (EReference)googleProtoBufFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoogleProtoBufFile_ReadDelimited()
  {
    return (EAttribute)googleProtoBufFileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoogleProtoBufFile_ReadEncoded()
  {
    return (EAttribute)googleProtoBufFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsonFile()
  {
    return jsonFileEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getLineFile()
  {
    return lineFileEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLineFile_Trim()
  {
    return (EAttribute)lineFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getOOCalcWorkBook()
  {
    return ooCalcWorkBookEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getOOCalcWorkSheet()
  {
    return ooCalcWorkSheetEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getOOCalcWorkSheet_WorkSheet()
  {
    return (EReference)ooCalcWorkSheetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getOOCalcWorkSheet_NullMarker()
  {
    return (EReference)ooCalcWorkSheetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOOCalcWorkSheet_HasNulls()
  {
    return (EAttribute)ooCalcWorkSheetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertiesFile()
  {
    return propertiesFileEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSlurpFile()
  {
    return slurpFileEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getStandardIO()
  {
    return standardIOEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStandardIO_UseStdErr()
  {
    return (EAttribute)standardIOEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getXMLFile()
  {
    return xmlFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMLFile_NamespaceDefinitions()
  {
    return (EReference)xmlFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMLFile_XPath()
  {
    return (EReference)xmlFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXMLNamespaceDefinition()
  {
    return xmlNamespaceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMLNamespaceDefinition_Prefix()
  {
    return (EReference)xmlNamespaceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMLNamespaceDefinition_URI()
  {
    return (EReference)xmlNamespaceDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXMLNamespaceDefinitions()
  {
    return xmlNamespaceDefinitionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMLNamespaceDefinitions_NamespaceDefinitions()
  {
    return (EReference)xmlNamespaceDefinitionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnum getExcelVersions()
  {
    return excelVersionsEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataType getExcelVersionsObject()
  {
    return excelVersionsObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FileResourceFactory getFileResourceFactory()
  {
    return (FileResourceFactory)getEFactoryInstance();
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
    binaryFileEClass = createEClass(BINARY_FILE);
    createEAttribute(binaryFileEClass, BINARY_FILE__CHUNK_SIZE);

    csvFileEClass = createEClass(CSV_FILE);

    customFileEClass = createEClass(CUSTOM_FILE);
    createEReference(customFileEClass, CUSTOM_FILE__NULL_MARKER);
    createEReference(customFileEClass, CUSTOM_FILE__ROW_SEPARATOR);
    createEReference(customFileEClass, CUSTOM_FILE__CELL_SEPARATOR);
    createEReference(customFileEClass, CUSTOM_FILE__QUOTE_CHARACTER);
    createEReference(customFileEClass, CUSTOM_FILE__ESCAPE_CHARACTER);
    createEAttribute(customFileEClass, CUSTOM_FILE__HAS_NULLS);

    dataFileEClass = createEClass(DATA_FILE);

    dataSetFileEClass = createEClass(DATA_SET_FILE);
    createEAttribute(dataSetFileEClass, DATA_SET_FILE__FIRST_ROW);

    deviceFileEClass = createEClass(DEVICE_FILE);
    createEReference(deviceFileEClass, DEVICE_FILE__FILE_NAME);
    createEAttribute(deviceFileEClass, DEVICE_FILE__APPEND);
    createEAttribute(deviceFileEClass, DEVICE_FILE__CAN_READ);
    createEAttribute(deviceFileEClass, DEVICE_FILE__CAN_WRITE);
    createEAttribute(deviceFileEClass, DEVICE_FILE__EXISTS);
    createEAttribute(deviceFileEClass, DEVICE_FILE__CREATE);
    createEAttribute(deviceFileEClass, DEVICE_FILE__FILTER);

    excelWorkBookEClass = createEClass(EXCEL_WORK_BOOK);
    createEAttribute(excelWorkBookEClass, EXCEL_WORK_BOOK__VERSION);

    excelWorkSheetEClass = createEClass(EXCEL_WORK_SHEET);
    createEReference(excelWorkSheetEClass, EXCEL_WORK_SHEET__WORK_SHEET);
    createEReference(excelWorkSheetEClass, EXCEL_WORK_SHEET__NULL_MARKER);
    createEAttribute(excelWorkSheetEClass, EXCEL_WORK_SHEET__HAS_NULLS);

    fixedWidthFileEClass = createEClass(FIXED_WIDTH_FILE);
    createEReference(fixedWidthFileEClass, FIXED_WIDTH_FILE__CONFIG_FILE);

    fixFileEClass = createEClass(FIX_FILE);
    createEReference(fixFileEClass, FIX_FILE__SEPARATOR);
    createEReference(fixFileEClass, FIX_FILE__DICTIONARY);
    createEAttribute(fixFileEClass, FIX_FILE__DO_VALIDATION);

    googleProtoBufFileEClass = createEClass(GOOGLE_PROTO_BUF_FILE);
    createEReference(googleProtoBufFileEClass, GOOGLE_PROTO_BUF_FILE__CLASSNAME);
    createEReference(googleProtoBufFileEClass, GOOGLE_PROTO_BUF_FILE__JAR_LOCATION);
    createEAttribute(googleProtoBufFileEClass, GOOGLE_PROTO_BUF_FILE__READ_ENCODED);
    createEAttribute(googleProtoBufFileEClass, GOOGLE_PROTO_BUF_FILE__READ_DELIMITED);

    jsonFileEClass = createEClass(JSON_FILE);

    lineFileEClass = createEClass(LINE_FILE);
    createEAttribute(lineFileEClass, LINE_FILE__TRIM);

    ooCalcWorkBookEClass = createEClass(OO_CALC_WORK_BOOK);

    ooCalcWorkSheetEClass = createEClass(OO_CALC_WORK_SHEET);
    createEReference(ooCalcWorkSheetEClass, OO_CALC_WORK_SHEET__WORK_SHEET);
    createEReference(ooCalcWorkSheetEClass, OO_CALC_WORK_SHEET__NULL_MARKER);
    createEAttribute(ooCalcWorkSheetEClass, OO_CALC_WORK_SHEET__HAS_NULLS);

    propertiesFileEClass = createEClass(PROPERTIES_FILE);

    slurpFileEClass = createEClass(SLURP_FILE);

    standardIOEClass = createEClass(STANDARD_IO);
    createEAttribute(standardIOEClass, STANDARD_IO__USE_STD_ERR);

    xmlFileEClass = createEClass(XML_FILE);
    createEReference(xmlFileEClass, XML_FILE__NAMESPACE_DEFINITIONS);
    createEReference(xmlFileEClass, XML_FILE__XPATH);

    xmlNamespaceDefinitionEClass = createEClass(XML_NAMESPACE_DEFINITION);
    createEReference(xmlNamespaceDefinitionEClass, XML_NAMESPACE_DEFINITION__PREFIX);
    createEReference(xmlNamespaceDefinitionEClass, XML_NAMESPACE_DEFINITION__URI);

    xmlNamespaceDefinitionsEClass = createEClass(XML_NAMESPACE_DEFINITIONS);
    createEReference(xmlNamespaceDefinitionsEClass, XML_NAMESPACE_DEFINITIONS__NAMESPACE_DEFINITIONS);

    // Create enums
    excelVersionsEEnum = createEEnum(EXCEL_VERSIONS);

    // Create data types
    excelVersionsObjectEDataType = createEDataType(EXCEL_VERSIONS_OBJECT);
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
    ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    binaryFileEClass.getESuperTypes().add(this.getDataSetFile());
    csvFileEClass.getESuperTypes().add(this.getDataSetFile());
    customFileEClass.getESuperTypes().add(this.getDataSetFile());
    dataFileEClass.getESuperTypes().add(this.getDataSetFile());
    dataSetFileEClass.getESuperTypes().add(theTypesPackage.getDataSetResourceDefinition());
    deviceFileEClass.getESuperTypes().add(theTypesPackage.getDeviceResourceDefinition());
    excelWorkBookEClass.getESuperTypes().add(this.getDeviceFile());
    excelWorkSheetEClass.getESuperTypes().add(this.getDataSetFile());
    fixedWidthFileEClass.getESuperTypes().add(this.getDataSetFile());
    fixFileEClass.getESuperTypes().add(this.getDataSetFile());
    googleProtoBufFileEClass.getESuperTypes().add(this.getDataSetFile());
    jsonFileEClass.getESuperTypes().add(this.getDataSetFile());
    lineFileEClass.getESuperTypes().add(this.getDataSetFile());
    ooCalcWorkBookEClass.getESuperTypes().add(this.getDeviceFile());
    ooCalcWorkSheetEClass.getESuperTypes().add(this.getDataSetFile());
    propertiesFileEClass.getESuperTypes().add(this.getDataSetFile());
    slurpFileEClass.getESuperTypes().add(this.getDataSetFile());
    standardIOEClass.getESuperTypes().add(theTypesPackage.getDeviceResourceDefinition());
    xmlFileEClass.getESuperTypes().add(this.getDataSetFile());
    xmlNamespaceDefinitionsEClass.getESuperTypes().add(theTypesPackage.getNamedResourceDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(binaryFileEClass, BinaryFile.class, "BinaryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBinaryFile_ChunkSize(), theXMLTypePackage.getInteger(), "chunkSize", null, 0, 1, BinaryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(csvFileEClass, CSVFile.class, "CSVFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(customFileEClass, CustomFile.class, "CustomFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCustomFile_NullMarker(), theValuesPackage.getComplexValue(), null, "nullMarker", null, 0, 1, CustomFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomFile_RowSeparator(), theValuesPackage.getComplexValue(), null, "rowSeparator", null, 0, 1, CustomFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomFile_CellSeparator(), theValuesPackage.getComplexValue(), null, "cellSeparator", null, 0, 1, CustomFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomFile_QuoteCharacter(), theValuesPackage.getComplexValue(), null, "quoteCharacter", null, 0, 1, CustomFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomFile_EscapeCharacter(), theValuesPackage.getComplexValue(), null, "escapeCharacter", null, 0, 1, CustomFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomFile_HasNulls(), theXMLTypePackage.getBoolean(), "hasNulls", "false", 0, 1, CustomFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataFileEClass, DataFile.class, "DataFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataSetFileEClass, DataSetFile.class, "DataSetFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataSetFile_FirstRow(), theXMLTypePackage.getInteger(), "firstRow", "0", 0, 1, DataSetFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deviceFileEClass, DeviceFile.class, "DeviceFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeviceFile_FileName(), theValuesPackage.getComplexValue(), null, "fileName", null, 1, 1, DeviceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeviceFile_Append(), theXMLTypePackage.getBoolean(), "append", "false", 0, 1, DeviceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeviceFile_CanRead(), theXMLTypePackage.getBoolean(), "canRead", "true", 0, 1, DeviceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeviceFile_CanWrite(), theXMLTypePackage.getBoolean(), "canWrite", "false", 0, 1, DeviceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeviceFile_Exists(), theXMLTypePackage.getBoolean(), "exists", "false", 0, 1, DeviceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeviceFile_Create(), theXMLTypePackage.getBoolean(), "create", "true", 0, 1, DeviceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeviceFile_Filter(), theXMLTypePackage.getToken(), "filter", "*", 0, 1, DeviceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(excelWorkBookEClass, ExcelWorkBook.class, "ExcelWorkBook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExcelWorkBook_Version(), this.getExcelVersions(), "version", "BIN-2003", 0, 1, ExcelWorkBook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(excelWorkSheetEClass, ExcelWorkSheet.class, "ExcelWorkSheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExcelWorkSheet_WorkSheet(), theValuesPackage.getComplexValue(), null, "workSheet", null, 0, 1, ExcelWorkSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExcelWorkSheet_NullMarker(), theValuesPackage.getComplexValue(), null, "nullMarker", null, 0, 1, ExcelWorkSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExcelWorkSheet_HasNulls(), theXMLTypePackage.getBoolean(), "hasNulls", "false", 0, 1, ExcelWorkSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fixedWidthFileEClass, FixedWidthFile.class, "FixedWidthFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFixedWidthFile_ConfigFile(), theTypesPackage.getNamedResourceDefinition(), null, "configFile", null, 1, 1, FixedWidthFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fixFileEClass, FIXFile.class, "FIXFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFIXFile_Separator(), theValuesPackage.getComplexValue(), null, "separator", null, 0, 1, FIXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFIXFile_Dictionary(), theTypesPackage.getResourceDefinition(), null, "dictionary", null, 0, 1, FIXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFIXFile_DoValidation(), theXMLTypePackage.getBoolean(), "doValidation", "false", 0, 1, FIXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(googleProtoBufFileEClass, GoogleProtoBufFile.class, "GoogleProtoBufFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGoogleProtoBufFile_Classname(), theValuesPackage.getComplexValue(), null, "classname", null, 1, 1, GoogleProtoBufFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoogleProtoBufFile_JarLocation(), theValuesPackage.getComplexValue(), null, "jarLocation", null, 1, 1, GoogleProtoBufFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoogleProtoBufFile_ReadEncoded(), theXMLTypePackage.getBoolean(), "readEncoded", "false", 0, 1, GoogleProtoBufFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoogleProtoBufFile_ReadDelimited(), theXMLTypePackage.getBoolean(), "readDelimited", "true", 0, 1, GoogleProtoBufFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonFileEClass, JsonFile.class, "JsonFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lineFileEClass, LineFile.class, "LineFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLineFile_Trim(), theXMLTypePackage.getBoolean(), "trim", "true", 0, 1, LineFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ooCalcWorkBookEClass, OOCalcWorkBook.class, "OOCalcWorkBook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ooCalcWorkSheetEClass, OOCalcWorkSheet.class, "OOCalcWorkSheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOOCalcWorkSheet_WorkSheet(), theValuesPackage.getComplexValue(), null, "workSheet", null, 0, 1, OOCalcWorkSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOOCalcWorkSheet_NullMarker(), theValuesPackage.getComplexValue(), null, "nullMarker", null, 0, 1, OOCalcWorkSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOOCalcWorkSheet_HasNulls(), theXMLTypePackage.getBoolean(), "hasNulls", "false", 0, 1, OOCalcWorkSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertiesFileEClass, PropertiesFile.class, "PropertiesFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(slurpFileEClass, SlurpFile.class, "SlurpFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(standardIOEClass, StandardIO.class, "StandardIO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStandardIO_UseStdErr(), theXMLTypePackage.getBoolean(), "useStdErr", "false", 0, 1, StandardIO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xmlFileEClass, XMLFile.class, "XMLFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXMLFile_NamespaceDefinitions(), this.getXMLNamespaceDefinitions(), null, "namespaceDefinitions", null, 0, 1, XMLFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXMLFile_XPath(), theValuesPackage.getComplexValue(), null, "xPath", null, 0, 1, XMLFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xmlNamespaceDefinitionEClass, XMLNamespaceDefinition.class, "XMLNamespaceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXMLNamespaceDefinition_Prefix(), theValuesPackage.getComplexValue(), null, "prefix", null, 1, 1, XMLNamespaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXMLNamespaceDefinition_URI(), theValuesPackage.getComplexValue(), null, "uRI", null, 1, 1, XMLNamespaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xmlNamespaceDefinitionsEClass, XMLNamespaceDefinitions.class, "XMLNamespaceDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXMLNamespaceDefinitions_NamespaceDefinitions(), this.getXMLNamespaceDefinition(), null, "namespaceDefinitions", null, 0, -1, XMLNamespaceDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(excelVersionsEEnum, ExcelVersions.class, "ExcelVersions");
    addEEnumLiteral(excelVersionsEEnum, ExcelVersions.BIN2003);
    addEEnumLiteral(excelVersionsEEnum, ExcelVersions.XML2007);

    // Initialize data types
    initEDataType(excelVersionsObjectEDataType, ExcelVersions.class, "ExcelVersionsObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
      (binaryFileEClass, 
       source, 
       new String[] 
       {
       "name", "BinaryFile",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getBinaryFile_ChunkSize(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "chunkSize"
       });	
    addAnnotation
      (csvFileEClass, 
       source, 
       new String[] 
       {
       "name", "CSVFile",
       "kind", "elementOnly"
       });	
    addAnnotation
      (customFileEClass, 
       source, 
       new String[] 
       {
       "name", "CustomFile",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getCustomFile_NullMarker(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "NullMarker",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCustomFile_RowSeparator(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "RowSeparator",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCustomFile_CellSeparator(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CellSeparator",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCustomFile_QuoteCharacter(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "QuoteCharacter",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCustomFile_EscapeCharacter(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "EscapeCharacter",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getCustomFile_HasNulls(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "hasNulls"
       });	
    addAnnotation
      (dataFileEClass, 
       source, 
       new String[] 
       {
       "name", "DataFile",
       "kind", "elementOnly"
       });	
    addAnnotation
      (dataSetFileEClass, 
       source, 
       new String[] 
       {
       "name", "DataSetFile",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getDataSetFile_FirstRow(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "firstRow"
       });	
    addAnnotation
      (deviceFileEClass, 
       source, 
       new String[] 
       {
       "name", "DeviceFile",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getDeviceFile_FileName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "FileName",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getDeviceFile_Append(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "append"
       });	
    addAnnotation
      (getDeviceFile_CanRead(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "canRead"
       });	
    addAnnotation
      (getDeviceFile_CanWrite(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "canWrite"
       });	
    addAnnotation
      (getDeviceFile_Exists(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "exists"
       });	
    addAnnotation
      (getDeviceFile_Create(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "create"
       });	
    addAnnotation
      (getDeviceFile_Filter(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "filter"
       });	
    addAnnotation
      (excelVersionsEEnum, 
       source, 
       new String[] 
       {
       "name", "ExcelVersions"
       });	
    addAnnotation
      (excelVersionsObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "ExcelVersions:Object",
       "baseType", "ExcelVersions"
       });	
    addAnnotation
      (excelWorkBookEClass, 
       source, 
       new String[] 
       {
       "name", "ExcelWorkBook",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getExcelWorkBook_Version(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "version"
       });	
    addAnnotation
      (excelWorkSheetEClass, 
       source, 
       new String[] 
       {
       "name", "ExcelWorkSheet",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getExcelWorkSheet_WorkSheet(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "WorkSheet",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getExcelWorkSheet_NullMarker(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "NullMarker",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getExcelWorkSheet_HasNulls(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "hasNulls"
       });	
    addAnnotation
      (fixedWidthFileEClass, 
       source, 
       new String[] 
       {
       "name", "FixedWidthFile",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getFixedWidthFile_ConfigFile(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ConfigFile",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (fixFileEClass, 
       source, 
       new String[] 
       {
       "name", "FIXFile",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getFIXFile_Separator(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Separator",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getFIXFile_Dictionary(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Dictionary",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getFIXFile_DoValidation(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "doValidation"
       });	
    addAnnotation
      (googleProtoBufFileEClass, 
       source, 
       new String[] 
       {
       "name", "GoogleProtoBufFile",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getGoogleProtoBufFile_Classname(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Classname",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getGoogleProtoBufFile_JarLocation(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "JarLocation",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getGoogleProtoBufFile_ReadEncoded(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "readEncoded"
       });	
    addAnnotation
      (getGoogleProtoBufFile_ReadDelimited(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "readDelimited"
       });	
    addAnnotation
      (jsonFileEClass, 
       source, 
       new String[] 
       {
       "name", "JsonFile",
       "kind", "elementOnly"
       });	
    addAnnotation
      (lineFileEClass, 
       source, 
       new String[] 
       {
       "name", "LineFile",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getLineFile_Trim(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "trim"
       });	
    addAnnotation
      (ooCalcWorkBookEClass, 
       source, 
       new String[] 
       {
       "name", "OOCalcWorkBook",
       "kind", "elementOnly"
       });	
    addAnnotation
      (ooCalcWorkSheetEClass, 
       source, 
       new String[] 
       {
       "name", "OOCalcWorkSheet",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getOOCalcWorkSheet_WorkSheet(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "WorkSheet",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getOOCalcWorkSheet_NullMarker(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "NullMarker",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getOOCalcWorkSheet_HasNulls(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "hasNulls"
       });	
    addAnnotation
      (propertiesFileEClass, 
       source, 
       new String[] 
       {
       "name", "PropertiesFile",
       "kind", "elementOnly"
       });	
    addAnnotation
      (slurpFileEClass, 
       source, 
       new String[] 
       {
       "name", "SlurpFile",
       "kind", "elementOnly"
       });	
    addAnnotation
      (standardIOEClass, 
       source, 
       new String[] 
       {
       "name", "StandardIO",
       "kind", "empty"
       });	
    addAnnotation
      (getStandardIO_UseStdErr(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "useStdErr"
       });	
    addAnnotation
      (xmlFileEClass, 
       source, 
       new String[] 
       {
       "name", "XMLFile",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getXMLFile_NamespaceDefinitions(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "NamespaceDefinitions",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getXMLFile_XPath(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "XPath",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (xmlNamespaceDefinitionEClass, 
       source, 
       new String[] 
       {
       "name", "XMLNamespaceDefinition",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getXMLNamespaceDefinition_Prefix(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Prefix",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (getXMLNamespaceDefinition_URI(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "URI",
       "namespace", "##targetNamespace"
       });	
    addAnnotation
      (xmlNamespaceDefinitionsEClass, 
       source, 
       new String[] 
       {
       "name", "XMLNamespaceDefinitions",
       "kind", "elementOnly"
       });	
    addAnnotation
      (getXMLNamespaceDefinitions_NamespaceDefinitions(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "NamespaceDefinitions",
       "namespace", "##targetNamespace"
       });
  }

} // FileResourcePackageImpl
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
