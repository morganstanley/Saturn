package com.ms.qaTools.saturn.modules.singularityModule.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.ms.qaTools.saturn.SaturnPackage;
import com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage;
import com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportPackageImpl;
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage;
import com.ms.qaTools.saturn.annotations.saturnWeb.impl.SaturnWebPackageImpl;
import com.ms.qaTools.saturn.impl.SaturnPackageImpl;
import com.ms.qaTools.saturn.listeners.ListenersPackage;
import com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl;
import com.ms.qaTools.saturn.modules.XSplitModule.XSplitModulePackage;
import com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitModulePackageImpl;
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
import com.ms.qaTools.saturn.modules.singularityModule.AbstractExtractAction;
import com.ms.qaTools.saturn.modules.singularityModule.AbstractOperation;
import com.ms.qaTools.saturn.modules.singularityModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.singularityModule.ExtractOperation;
import com.ms.qaTools.saturn.modules.singularityModule.SearchExtractOperation;
import com.ms.qaTools.saturn.modules.singularityModule.SingularityConfiguration;
import com.ms.qaTools.saturn.modules.singularityModule.SingularityFactory;
import com.ms.qaTools.saturn.modules.singularityModule.SingularityPackage;
import com.ms.qaTools.saturn.modules.singularityModule.TestCaseExtractOperation;
import com.ms.qaTools.saturn.modules.singularityModule.TestSuiteExtractOperation;
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
import com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResourcePackage;
import com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourcePackageImpl;
import com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage;
import com.ms.qaTools.saturn.resources.fileResource.impl.FileResourcePackageImpl;
import com.ms.qaTools.saturn.resources.informixResource.InformixResourcePackage;
import com.ms.qaTools.saturn.resources.informixResource.impl.InformixResourcePackageImpl;
import com.ms.qaTools.saturn.resources.mqResource.MqResourcePackage;
import com.ms.qaTools.saturn.resources.mqResource.impl.MqResourcePackageImpl;
import com.ms.qaTools.saturn.resources.oracleResource.OracleResourcePackage;
import com.ms.qaTools.saturn.resources.oracleResource.impl.OracleResourcePackageImpl;
import com.ms.qaTools.saturn.resources.queryResource.QueryResourcePackage;
import com.ms.qaTools.saturn.resources.queryResource.impl.QueryResourcePackageImpl;
import com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourcePackage;
import com.ms.qaTools.saturn.resources.referenceResource.impl.ReferenceResourcePackageImpl;
import com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResourcePackage;
import com.ms.qaTools.saturn.resources.shadowDirectResource.impl.ShadowDirectResourcePackageImpl;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage;
import com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourcePackageImpl;
import com.ms.qaTools.saturn.resources.sybaseResource.SybaseResourcePackage;
import com.ms.qaTools.saturn.resources.sybaseResource.impl.SybaseResourcePackageImpl;
import com.ms.qaTools.saturn.resources.teradataResource.TeradataResourcePackage;
import com.ms.qaTools.saturn.resources.teradataResource.impl.TeradataResourcePackageImpl;
import com.ms.qaTools.saturn.resources.udbResource.UdbResourcePackage;
import com.ms.qaTools.saturn.resources.udbResource.impl.UdbResourcePackageImpl;
import com.ms.qaTools.saturn.types.TypesPackage;
import com.ms.qaTools.saturn.types.impl.TypesPackageImpl;
import com.ms.qaTools.saturn.values.ValuesPackage;
import com.ms.qaTools.saturn.values.impl.ValuesPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class SingularityPackageImpl extends EPackageImpl implements SingularityPackage
{
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass abstractExtractActionEClass     = null;
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass abstractOperationEClass         = null;
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass documentRootEClass              = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass extractOperationEClass          = null;
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass searchExtractOperationEClass    = null;
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass singularityConfigurationEClass  = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass testCaseExtractOperationEClass  = null;
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass testSuiteExtractOperationEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.ms.qaTools.saturn.modules.singularityModule.SingularityPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SingularityPackageImpl()
  {
    super(eNS_URI, SingularityFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>
   * This method is used to initialize {@link SingularityPackage#eINSTANCE} when that field is accessed. Clients should
   * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SingularityPackage init()
  {
    if (isInited) return (SingularityPackage) EPackage.Registry.INSTANCE.getEPackage(SingularityPackage.eNS_URI);

    // Obtain or create and register package
    SingularityPackageImpl theSingularityPackage = (SingularityPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SingularityPackageImpl ? EPackage.Registry.INSTANCE
        .get(eNS_URI) : new SingularityPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    EnvValidatorModulePackageImpl theEnvValidatorModulePackage = (EnvValidatorModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(EnvValidatorModulePackage.eNS_URI) instanceof EnvValidatorModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(EnvValidatorModulePackage.eNS_URI) : EnvValidatorModulePackage.eINSTANCE);
    TypesPackageImpl theTypesPackage = (TypesPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
    ValuesPackageImpl theValuesPackage = (ValuesPackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
    CpsModulePackageImpl theCpsModulePackage = (CpsModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(CpsModulePackage.eNS_URI) instanceof CpsModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(CpsModulePackage.eNS_URI) : CpsModulePackage.eINSTANCE);
    DatacompareModulePackageImpl theDatacompareModulePackage = (DatacompareModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(DatacompareModulePackage.eNS_URI) instanceof DatacompareModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(DatacompareModulePackage.eNS_URI) : DatacompareModulePackage.eINSTANCE);
    FileResourcePackageImpl theFileResourcePackage = (FileResourcePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(FileResourcePackage.eNS_URI) instanceof FileResourcePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(FileResourcePackage.eNS_URI) : FileResourcePackage.eINSTANCE);
    DirectoryResourcePackageImpl theDirectoryResourcePackage = (DirectoryResourcePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(DirectoryResourcePackage.eNS_URI) instanceof DirectoryResourcePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(DirectoryResourcePackage.eNS_URI) : DirectoryResourcePackage.eINSTANCE);
    ReferenceResourcePackageImpl theReferenceResourcePackage = (ReferenceResourcePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(ReferenceResourcePackage.eNS_URI) instanceof ReferenceResourcePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(ReferenceResourcePackage.eNS_URI) : ReferenceResourcePackage.eINSTANCE);
    DocumentumModulePackageImpl theDocumentumModulePackage = (DocumentumModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(DocumentumModulePackage.eNS_URI) instanceof DocumentumModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(DocumentumModulePackage.eNS_URI) : DocumentumModulePackage.eINSTANCE);
    MailModulePackageImpl theMailModulePackage = (MailModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(MailModulePackage.eNS_URI) instanceof MailModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(MailModulePackage.eNS_URI) : MailModulePackage.eINSTANCE);
    MqModulePackageImpl theMqModulePackage = (MqModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(MqModulePackage.eNS_URI) instanceof MqModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(MqModulePackage.eNS_URI) : MqModulePackage.eINSTANCE);
    MqResourcePackageImpl theMqResourcePackage = (MqResourcePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(MqResourcePackage.eNS_URI) instanceof MqResourcePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(MqResourcePackage.eNS_URI) : MqResourcePackage.eINSTANCE);
    ReferenceModulePackageImpl theReferenceModulePackage = (ReferenceModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(ReferenceModulePackage.eNS_URI) instanceof ReferenceModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(ReferenceModulePackage.eNS_URI) : ReferenceModulePackage.eINSTANCE);
    RuncmdsModulePackageImpl theRuncmdsModulePackage = (RuncmdsModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(RuncmdsModulePackage.eNS_URI) instanceof RuncmdsModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(RuncmdsModulePackage.eNS_URI) : RuncmdsModulePackage.eINSTANCE);
    SoapIOModulePackageImpl theSoapIOModulePackage = (SoapIOModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(SoapIOModulePackage.eNS_URI) instanceof SoapIOModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(SoapIOModulePackage.eNS_URI) : SoapIOModulePackage.eINSTANCE);
    SqlModulePackageImpl theSqlModulePackage = (SqlModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(SqlModulePackage.eNS_URI) instanceof SqlModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(SqlModulePackage.eNS_URI) : SqlModulePackage.eINSTANCE);
    SybaseResourcePackageImpl theSybaseResourcePackage = (SybaseResourcePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(SybaseResourcePackage.eNS_URI) instanceof SybaseResourcePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(SybaseResourcePackage.eNS_URI) : SybaseResourcePackage.eINSTANCE);
    Db2ResourcePackageImpl theDb2ResourcePackage = (Db2ResourcePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(Db2ResourcePackage.eNS_URI) instanceof Db2ResourcePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(Db2ResourcePackage.eNS_URI) : Db2ResourcePackage.eINSTANCE);
    UdbResourcePackageImpl theUdbResourcePackage = (UdbResourcePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(UdbResourcePackage.eNS_URI) instanceof UdbResourcePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(UdbResourcePackage.eNS_URI) : UdbResourcePackage.eINSTANCE);
    Xml2csvModulePackageImpl theXml2csvModulePackage = (Xml2csvModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(Xml2csvModulePackage.eNS_URI) instanceof Xml2csvModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(Xml2csvModulePackage.eNS_URI) : Xml2csvModulePackage.eINSTANCE);
    XmlDiffModulePackageImpl theXmlDiffModulePackage = (XmlDiffModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(XmlDiffModulePackage.eNS_URI) instanceof XmlDiffModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(XmlDiffModulePackage.eNS_URI) : XmlDiffModulePackage.eINSTANCE);
    XmlGenModulePackageImpl theXmlGenModulePackage = (XmlGenModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(XmlGenModulePackage.eNS_URI) instanceof XmlGenModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(XmlGenModulePackage.eNS_URI) : XmlGenModulePackage.eINSTANCE);
    XSplitModulePackageImpl theXSplitModulePackage = (XSplitModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(XSplitModulePackage.eNS_URI) instanceof XSplitModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(XSplitModulePackage.eNS_URI) : XSplitModulePackage.eINSTANCE);
    DataSetResourcePackageImpl theDataSetResourcePackage = (DataSetResourcePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(DataSetResourcePackage.eNS_URI) instanceof DataSetResourcePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(DataSetResourcePackage.eNS_URI) : DataSetResourcePackage.eINSTANCE);
    ShadowDirectResourcePackageImpl theShadowDirectResourcePackage = (ShadowDirectResourcePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(ShadowDirectResourcePackage.eNS_URI) instanceof ShadowDirectResourcePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(ShadowDirectResourcePackage.eNS_URI) : ShadowDirectResourcePackage.eINSTANCE);
    SoapIOResourcePackageImpl theSoapIOResourcePackage = (SoapIOResourcePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(SoapIOResourcePackage.eNS_URI) instanceof SoapIOResourcePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(SoapIOResourcePackage.eNS_URI) : SoapIOResourcePackage.eINSTANCE);
    DsConvertModulePackageImpl theDsConvertModulePackage = (DsConvertModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(DsConvertModulePackage.eNS_URI) instanceof DsConvertModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(DsConvertModulePackage.eNS_URI) : DsConvertModulePackage.eINSTANCE);
    DsValidatorModulePackageImpl theDsValidatorModulePackage = (DsValidatorModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(DsValidatorModulePackage.eNS_URI) instanceof DsValidatorModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(DsValidatorModulePackage.eNS_URI) : DsValidatorModulePackage.eINSTANCE);
    ExtractDDLModulePackageImpl theExtractDDLModulePackage = (ExtractDDLModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(ExtractDDLModulePackage.eNS_URI) instanceof ExtractDDLModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(ExtractDDLModulePackage.eNS_URI) : ExtractDDLModulePackage.eINSTANCE);
    ProcedureCallModulePackageImpl theProcedureCallModulePackage = (ProcedureCallModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(ProcedureCallModulePackage.eNS_URI) instanceof ProcedureCallModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(ProcedureCallModulePackage.eNS_URI) : ProcedureCallModulePackage.eINSTANCE);
    PsManagerModulePackageImpl thePsManagerModulePackage = (PsManagerModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(PsManagerModulePackage.eNS_URI) instanceof PsManagerModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(PsManagerModulePackage.eNS_URI) : PsManagerModulePackage.eINSTANCE);
    XmlManipModulePackageImpl theXmlManipModulePackage = (XmlManipModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(XmlManipModulePackage.eNS_URI) instanceof XmlManipModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(XmlManipModulePackage.eNS_URI) : XmlManipModulePackage.eINSTANCE);
    XmlValidatorModulePackageImpl thexmlValidatorModulePackage = (XmlValidatorModulePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(XmlValidatorModulePackage.eNS_URI) instanceof XmlValidatorModulePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(XmlValidatorModulePackage.eNS_URI) : XmlValidatorModulePackage.eINSTANCE);
    SaturnPackageImpl theSaturnPackage = (SaturnPackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(SaturnPackage.eNS_URI) instanceof SaturnPackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(SaturnPackage.eNS_URI) : SaturnPackage.eINSTANCE);
    SaturnWebPackageImpl theSaturnWebPackage = (SaturnWebPackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(SaturnWebPackage.eNS_URI) instanceof SaturnWebPackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(SaturnWebPackage.eNS_URI) : SaturnWebPackage.eINSTANCE);
    TeradataResourcePackageImpl theTeradataResourcePackage = (TeradataResourcePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(TeradataResourcePackage.eNS_URI) instanceof TeradataResourcePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(TeradataResourcePackage.eNS_URI) : TeradataResourcePackage.eINSTANCE);
    ListenersPackageImpl theListenersPackage = (ListenersPackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(ListenersPackage.eNS_URI) instanceof ListenersPackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(ListenersPackage.eNS_URI) : ListenersPackage.eINSTANCE);
    InformixResourcePackageImpl theInformixResourcePackage = (InformixResourcePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(InformixResourcePackage.eNS_URI) instanceof InformixResourcePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(InformixResourcePackage.eNS_URI) : InformixResourcePackage.eINSTANCE);
    OracleResourcePackageImpl theOracleResourcePackage = (OracleResourcePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(OracleResourcePackage.eNS_URI) instanceof OracleResourcePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(OracleResourcePackage.eNS_URI) : OracleResourcePackage.eINSTANCE);
    RepetitionPackageImpl theRepetitionPackage = (RepetitionPackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(RepetitionPackage.eNS_URI) instanceof RepetitionPackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(RepetitionPackage.eNS_URI) : RepetitionPackage.eINSTANCE);
    SaturnReportPackageImpl theSaturnReportPackage = (SaturnReportPackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(SaturnReportPackage.eNS_URI) instanceof SaturnReportPackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(SaturnReportPackage.eNS_URI) : SaturnReportPackage.eINSTANCE);
    QueryResourcePackageImpl theQueryResourcePackage = (QueryResourcePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(QueryResourcePackage.eNS_URI) instanceof QueryResourcePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(QueryResourcePackage.eNS_URI) : QueryResourcePackage.eINSTANCE);
    DsSQLResourcePackageImpl theDsSQLResourcePackage = (DsSQLResourcePackageImpl) (EPackage.Registry.INSTANCE
        .getEPackage(DsSQLResourcePackage.eNS_URI) instanceof DsSQLResourcePackageImpl ? EPackage.Registry.INSTANCE
        .getEPackage(DsSQLResourcePackage.eNS_URI) : DsSQLResourcePackage.eINSTANCE);

    // Create package meta-data objects
    theSingularityPackage.createPackageContents();
    theEnvValidatorModulePackage.createPackageContents();
    theTypesPackage.createPackageContents();
    theValuesPackage.createPackageContents();
    theCpsModulePackage.createPackageContents();
    theDatacompareModulePackage.createPackageContents();
    theFileResourcePackage.createPackageContents();
    theDirectoryResourcePackage.createPackageContents();
    theReferenceResourcePackage.createPackageContents();
    theDocumentumModulePackage.createPackageContents();
    theMailModulePackage.createPackageContents();
    theMqModulePackage.createPackageContents();
    theMqResourcePackage.createPackageContents();
    theReferenceModulePackage.createPackageContents();
    theRuncmdsModulePackage.createPackageContents();
    theSoapIOModulePackage.createPackageContents();
    theSqlModulePackage.createPackageContents();
    theSybaseResourcePackage.createPackageContents();
    theDb2ResourcePackage.createPackageContents();
    theUdbResourcePackage.createPackageContents();
    theXml2csvModulePackage.createPackageContents();
    theXmlDiffModulePackage.createPackageContents();
    theXmlGenModulePackage.createPackageContents();
    theXSplitModulePackage.createPackageContents();
    theDataSetResourcePackage.createPackageContents();
    theShadowDirectResourcePackage.createPackageContents();
    theSoapIOResourcePackage.createPackageContents();
    theDsConvertModulePackage.createPackageContents();
    theDsValidatorModulePackage.createPackageContents();
    theExtractDDLModulePackage.createPackageContents();
    theProcedureCallModulePackage.createPackageContents();
    thePsManagerModulePackage.createPackageContents();
    theXmlManipModulePackage.createPackageContents();
    thexmlValidatorModulePackage.createPackageContents();
    theSaturnPackage.createPackageContents();
    theSaturnWebPackage.createPackageContents();
    theTeradataResourcePackage.createPackageContents();
    theListenersPackage.createPackageContents();
    theInformixResourcePackage.createPackageContents();
    theOracleResourcePackage.createPackageContents();
    theRepetitionPackage.createPackageContents();
    theSaturnReportPackage.createPackageContents();
    theQueryResourcePackage.createPackageContents();
    theDsSQLResourcePackage.createPackageContents();

    // Initialize created meta-data
    theSingularityPackage.initializePackageContents();
    theEnvValidatorModulePackage.initializePackageContents();
    theTypesPackage.initializePackageContents();
    theValuesPackage.initializePackageContents();
    theCpsModulePackage.initializePackageContents();
    theDatacompareModulePackage.initializePackageContents();
    theFileResourcePackage.initializePackageContents();
    theDirectoryResourcePackage.initializePackageContents();
    theReferenceResourcePackage.initializePackageContents();
    theDocumentumModulePackage.initializePackageContents();
    theMailModulePackage.initializePackageContents();
    theMqModulePackage.initializePackageContents();
    theMqResourcePackage.initializePackageContents();
    theReferenceModulePackage.initializePackageContents();
    theRuncmdsModulePackage.initializePackageContents();
    theSoapIOModulePackage.initializePackageContents();
    theSqlModulePackage.initializePackageContents();
    theSybaseResourcePackage.initializePackageContents();
    theDb2ResourcePackage.initializePackageContents();
    theUdbResourcePackage.initializePackageContents();
    theXml2csvModulePackage.initializePackageContents();
    theXmlDiffModulePackage.initializePackageContents();
    theXmlGenModulePackage.initializePackageContents();
    theXSplitModulePackage.initializePackageContents();
    theDataSetResourcePackage.initializePackageContents();
    theShadowDirectResourcePackage.initializePackageContents();
    theSoapIOResourcePackage.initializePackageContents();
    theDsConvertModulePackage.initializePackageContents();
    theDsValidatorModulePackage.initializePackageContents();
    theExtractDDLModulePackage.initializePackageContents();
    theProcedureCallModulePackage.initializePackageContents();
    thePsManagerModulePackage.initializePackageContents();
    theXmlManipModulePackage.initializePackageContents();
    thexmlValidatorModulePackage.initializePackageContents();
    theSaturnPackage.initializePackageContents();
    theSaturnWebPackage.initializePackageContents();
    theTeradataResourcePackage.initializePackageContents();
    theListenersPackage.initializePackageContents();
    theInformixResourcePackage.initializePackageContents();
    theOracleResourcePackage.initializePackageContents();
    theRepetitionPackage.initializePackageContents();
    theSaturnReportPackage.initializePackageContents();
    theQueryResourcePackage.initializePackageContents();
    theDsSQLResourcePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSingularityPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SingularityPackage.eNS_URI, theSingularityPackage);
    return theSingularityPackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getAbstractExtractAction()
  {
    return abstractExtractActionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAbstractExtractAction_ID()
  {
    return (EReference) abstractExtractActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAbstractExtractAction_Output()
  {
    return (EReference) abstractExtractActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getAbstractExtractAction_Enabled()
  {
    return (EAttribute) abstractExtractActionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getAbstractExtractAction_RemoveDuplicates()
  {
    return (EAttribute) abstractExtractActionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getAbstractOperation()
  {
    return abstractOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getDocumentRoot()
  {
    return documentRootEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed()
  {
    return (EAttribute) documentRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap()
  {
    return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation()
  {
    return (EReference) documentRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getDocumentRoot_SingularityConfiguration()
  {
    return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getExtractOperation()
  {
    return extractOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getExtractOperation_Actions()
  {
    return (EReference) extractOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getSearchExtractOperation()
  {
    return searchExtractOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getSingularityConfiguration()
  {
    return singularityConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getSingularityConfiguration_Operations()
  {
    return (EReference) singularityConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getTestCaseExtractOperation()
  {
    return testCaseExtractOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getTestSuiteExtractOperation()
  {
    return testSuiteExtractOperationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public SingularityFactory getSingularityFactory()
  {
    return (SingularityFactory) getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but its
   * first. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    abstractExtractActionEClass = createEClass(ABSTRACT_EXTRACT_ACTION);
    createEReference(abstractExtractActionEClass, ABSTRACT_EXTRACT_ACTION__ID);
    createEReference(abstractExtractActionEClass, ABSTRACT_EXTRACT_ACTION__OUTPUT);
    createEAttribute(abstractExtractActionEClass, ABSTRACT_EXTRACT_ACTION__ENABLED);
    createEAttribute(abstractExtractActionEClass, ABSTRACT_EXTRACT_ACTION__REMOVE_DUPLICATES);

    abstractOperationEClass = createEClass(ABSTRACT_OPERATION);

    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SINGULARITY_CONFIGURATION);

    extractOperationEClass = createEClass(EXTRACT_OPERATION);
    createEReference(extractOperationEClass, EXTRACT_OPERATION__ACTIONS);

    searchExtractOperationEClass = createEClass(SEARCH_EXTRACT_OPERATION);

    singularityConfigurationEClass = createEClass(SINGULARITY_CONFIGURATION);
    createEReference(singularityConfigurationEClass, SINGULARITY_CONFIGURATION__OPERATIONS);

    testCaseExtractOperationEClass = createEClass(TEST_CASE_EXTRACT_OPERATION);

    testSuiteExtractOperationEClass = createEClass(TEST_SUITE_EXTRACT_OPERATION);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any
   * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
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
    ValuesPackage theValuesPackage = (ValuesPackage) EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    extractOperationEClass.getESuperTypes().add(this.getAbstractOperation());
    searchExtractOperationEClass.getESuperTypes().add(this.getAbstractExtractAction());
    testCaseExtractOperationEClass.getESuperTypes().add(this.getAbstractExtractAction());
    testSuiteExtractOperationEClass.getESuperTypes().add(this.getAbstractExtractAction());

    // Initialize classes and features; add operations and parameters
    initEClass(abstractExtractActionEClass, AbstractExtractAction.class, "AbstractExtractAction", IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractExtractAction_ID(), theValuesPackage.getComplexValue(), null, "iD", null, 1, 1,
        AbstractExtractAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractExtractAction_Output(), theTypesPackage.getResourceDefinition(), null, "output", null, 1,
        1, AbstractExtractAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractExtractAction_Enabled(), theXMLTypePackage.getBoolean(), "enabled", "true", 0, 1,
        AbstractExtractAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractExtractAction_RemoveDuplicates(), theXMLTypePackage.getBoolean(), "removeDuplicates",
        "true", 0, 1, AbstractExtractAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractOperationEClass, AbstractOperation.class, "AbstractOperation", IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap",
        null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null,
        "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SingularityConfiguration(), this.getSingularityConfiguration(), null,
        "singularityConfiguration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(extractOperationEClass, ExtractOperation.class, "ExtractOperation", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtractOperation_Actions(), this.getAbstractExtractAction(), null, "actions", null, 0, -1,
        ExtractOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(searchExtractOperationEClass, SearchExtractOperation.class, "SearchExtractOperation", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(singularityConfigurationEClass, SingularityConfiguration.class, "SingularityConfiguration",
        !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSingularityConfiguration_Operations(), this.getAbstractOperation(), null, "operations", null, 0,
        -1, SingularityConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testCaseExtractOperationEClass, TestCaseExtractOperation.class, "TestCaseExtractOperation",
        !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(testSuiteExtractOperationEClass, TestSuiteExtractOperation.class, "TestSuiteExtractOperation",
        !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void createExtendedMetaDataAnnotations()
  {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
    addAnnotation(abstractExtractActionEClass, source, new String[] { "name", "AbstractExtractAction", "kind",
        "elementOnly" });
    addAnnotation(getAbstractExtractAction_ID(), source, new String[] { "kind", "element", "name", "ID", "namespace",
        "##targetNamespace" });
    addAnnotation(getAbstractExtractAction_Output(), source, new String[] { "kind", "element", "name", "Output",
        "namespace", "##targetNamespace" });
    addAnnotation(getAbstractExtractAction_Enabled(), source, new String[] { "kind", "attribute", "name", "enabled" });
    addAnnotation(getAbstractExtractAction_RemoveDuplicates(), source, new String[] { "kind", "attribute", "name",
        "removeDuplicates" });
    addAnnotation(abstractOperationEClass, source, new String[] { "name", "AbstractOperation", "kind", "empty" });
    addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
    addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
    addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source,
        new String[] { "kind", "attribute", "name", "xmlns:prefix" });
    addAnnotation(getDocumentRoot_XSISchemaLocation(), source, new String[] { "kind", "attribute", "name",
        "xsi:schemaLocation" });
    addAnnotation(getDocumentRoot_SingularityConfiguration(), source, new String[] { "kind", "element", "name",
        "Configuration", "namespace", "##targetNamespace" });
    addAnnotation(extractOperationEClass, source, new String[] { "name", "ExtractOperation", "kind", "elementOnly" });
    addAnnotation(getExtractOperation_Actions(), source, new String[] { "kind", "element", "name", "Actions",
        "namespace", "##targetNamespace" });
    addAnnotation(searchExtractOperationEClass, source, new String[] { "name", "SearchExtractOperation", "kind",
        "elementOnly" });
    addAnnotation(singularityConfigurationEClass, source, new String[] { "name", "Configuration_._type", "kind",
        "elementOnly" });
    addAnnotation(getSingularityConfiguration_Operations(), source, new String[] { "kind", "element", "name",
        "Operations", "namespace", "##targetNamespace" });
    addAnnotation(testCaseExtractOperationEClass, source, new String[] { "name", "TestCaseExtractOperation", "kind",
        "elementOnly" });
    addAnnotation(testSuiteExtractOperationEClass, source, new String[] { "name", "TestSuiteExtractOperation", "kind",
        "elementOnly" });
  }

} // SingularityPackageImpl
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
