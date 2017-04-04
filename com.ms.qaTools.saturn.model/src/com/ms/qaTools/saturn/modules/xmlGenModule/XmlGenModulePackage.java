package com.ms.qaTools.saturn.modules.xmlGenModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourcePackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2006/pdsttools/xsd2perl nsPrefix='xGenModule' package='Saturn::Module::XMLGen' typeExtractorBase='Saturn::Script::TypeExtractor'"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface XmlGenModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String              eNAME                                  = "xmlGenModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String              eNS_URI                                = "http://www.ms.com/2007/Saturn/Modules/XmlGen";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String              eNS_PREFIX                             = "xGenModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  XmlGenModulePackage eINSTANCE                              = com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.impl.DataSetImpl <em>Data Set</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.DataSetImpl
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenModulePackageImpl#getDataSet()
   * @generated
   */
  int                 DATA_SET                               = 0;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_SET__FILE                         = 0;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 DATA_SET__PREFIX                       = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_SET__ENABLED                      = 2;

  /**
   * The number of structural features of the '<em>Data Set</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DATA_SET_FEATURE_COUNT                 = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                 DOCUMENT_ROOT                          = 1;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DOCUMENT_ROOT__MIXED                   = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DOCUMENT_ROOT__XMLNS_PREFIX_MAP        = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DOCUMENT_ROOT__XSI_SCHEMA_LOCATION     = 2;

  /**
   * The feature id for the '<em><b>Xml Gen Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 DOCUMENT_ROOT__XML_GEN_CONFIGURATION   = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 DOCUMENT_ROOT_FEATURE_COUNT            = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.impl.OutputDirectoryImpl <em>Output Directory</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.OutputDirectoryImpl
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenModulePackageImpl#getOutputDirectory()
   * @generated
   */
  int                 OUTPUT_DIRECTORY                       = 2;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY__ENABLED              = DirectoryResourcePackage.DIRECTORY_RESOURCE__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY__STATE                = DirectoryResourcePackage.DIRECTORY_RESOURCE__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY__CONNECTOR_PREFERENCE = DirectoryResourcePackage.DIRECTORY_RESOURCE__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY__NAME                 = DirectoryResourcePackage.DIRECTORY_RESOURCE__NAME;

  /**
   * The feature id for the '<em><b>Initialize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY__INITIALIZE           = DirectoryResourcePackage.DIRECTORY_RESOURCE__INITIALIZE;

  /**
   * The feature id for the '<em><b>Is Inline</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY__IS_INLINE            = DirectoryResourcePackage.DIRECTORY_RESOURCE__IS_INLINE;

  /**
   * The feature id for the '<em><b>Directory</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY__DIRECTORY            = DirectoryResourcePackage.DIRECTORY_RESOURCE__DIRECTORY;

  /**
   * The feature id for the '<em><b>Available Size</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY__AVAILABLE_SIZE       = DirectoryResourcePackage.DIRECTORY_RESOURCE__AVAILABLE_SIZE;

  /**
   * The feature id for the '<em><b>Can Read</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY__CAN_READ             = DirectoryResourcePackage.DIRECTORY_RESOURCE__CAN_READ;

  /**
   * The feature id for the '<em><b>Can Write</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY__CAN_WRITE            = DirectoryResourcePackage.DIRECTORY_RESOURCE__CAN_WRITE;

  /**
   * The feature id for the '<em><b>Exists</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY__EXISTS               = DirectoryResourcePackage.DIRECTORY_RESOURCE__EXISTS;

  /**
   * The feature id for the '<em><b>Create</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY__CREATE               = DirectoryResourcePackage.DIRECTORY_RESOURCE__CREATE;

  /**
   * The feature id for the '<em><b>Check Available Size</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY__CHECK_AVAILABLE_SIZE = DirectoryResourcePackage.DIRECTORY_RESOURCE__CHECK_AVAILABLE_SIZE;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY__FILTER               = DirectoryResourcePackage.DIRECTORY_RESOURCE__FILTER;

  /**
   * The feature id for the '<em><b>File Name Pattern</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY__FILE_NAME_PATTERN    = DirectoryResourcePackage.DIRECTORY_RESOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Output Directory</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 OUTPUT_DIRECTORY_FEATURE_COUNT         = DirectoryResourcePackage.DIRECTORY_RESOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenConfigurationImpl <em>Xml Gen Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenModulePackageImpl#getXmlGenConfiguration()
   * @generated
   */
  int                 XML_GEN_CONFIGURATION                  = 3;

  /**
   * The feature id for the '<em><b>Template File</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XML_GEN_CONFIGURATION__TEMPLATE_FILE   = 0;

  /**
   * The feature id for the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XML_GEN_CONFIGURATION__OUTPUT_RESOURCE = 1;

  /**
   * The feature id for the '<em><b>Data Sets</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XML_GEN_CONFIGURATION__DATA_SETS       = 2;

  /**
   * The feature id for the '<em><b>Xml Format</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XML_GEN_CONFIGURATION__XML_FORMAT      = 3;

  /**
   * The feature id for the '<em><b>Legacy Mode</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XML_GEN_CONFIGURATION__LEGACY_MODE     = 4;

  /**
   * The number of structural features of the '<em>Xml Gen Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                 XML_GEN_CONFIGURATION_FEATURE_COUNT    = 5;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums <em>Xml Format Enums</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenModulePackageImpl#getXmlFormatEnums()
   * @generated
   */
  int                 XML_FORMAT_ENUMS                       = 4;

  /**
   * The meta object id for the '<em>Xml Format Enums Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenModulePackageImpl#getXmlFormatEnumsObject()
   * @generated
   */
  int                 XML_FORMAT_ENUMS_OBJECT                = 5;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlGenModule.DataSet <em>Data Set</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Set</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.DataSet
   * @generated
   */
  EClass getDataSet();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlGenModule.DataSet#getFile <em>File</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>File</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.DataSet#getFile()
   * @see #getDataSet()
   * @generated
   */
  EReference getDataSet_File();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlGenModule.DataSet#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Prefix</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.DataSet#getPrefix()
   * @see #getDataSet()
   * @generated
   */
  EReference getDataSet_Prefix();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.xmlGenModule.DataSet#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.DataSet#isEnabled()
   * @see #getDataSet()
   * @generated
   */
  EAttribute getDataSet_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlGenModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.xmlGenModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '
   * {@link com.ms.qaTools.saturn.modules.xmlGenModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.xmlGenModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlGenModule.DocumentRoot#getXmlGenConfiguration <em>Xml Gen Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xml Gen Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.DocumentRoot#getXmlGenConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XmlGenConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlGenModule.OutputDirectory <em>Output Directory</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Directory</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.OutputDirectory
   * @generated
   */
  EClass getOutputDirectory();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlGenModule.OutputDirectory#getFileNamePattern <em>File Name Pattern</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>File Name Pattern</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.OutputDirectory#getFileNamePattern()
   * @see #getOutputDirectory()
   * @generated
   */
  EReference getOutputDirectory_FileNamePattern();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration <em>Xml Gen Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Gen Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration
   * @generated
   */
  EClass getXmlGenConfiguration();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getTemplateFile <em>Template File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template File</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getTemplateFile()
   * @see #getXmlGenConfiguration()
   * @generated
   */
  EReference getXmlGenConfiguration_TemplateFile();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getOutputResource <em>Output Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getOutputResource()
   * @see #getXmlGenConfiguration()
   * @generated
   */
  EReference getXmlGenConfiguration_OutputResource();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getDataSets <em>Data Sets</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Data Sets</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getDataSets()
   * @see #getXmlGenConfiguration()
   * @generated
   */
  EReference getXmlGenConfiguration_DataSets();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#isLegacyMode <em>Legacy Mode</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Legacy Mode</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#isLegacyMode()
   * @see #getXmlGenConfiguration()
   * @generated
   */
  EAttribute getXmlGenConfiguration_LegacyMode();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getXmlFormat <em>Xml Format</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Xml Format</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration#getXmlFormat()
   * @see #getXmlGenConfiguration()
   * @generated
   */
  EAttribute getXmlGenConfiguration_XmlFormat();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums <em>Xml Format Enums</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Xml Format Enums</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums
   * @generated
   */
  EEnum getXmlFormatEnums();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums <em>Xml Format Enums Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Xml Format Enums Object</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums
   * @model instanceClass="com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums"
   *        extendedMetaData="name='XmlFormatEnums:Object' baseType='XmlFormatEnums'"
   * @generated
   */
  EDataType getXmlFormatEnumsObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XmlGenModuleFactory getXmlGenModuleFactory();

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.impl.DataSetImpl <em>Data Set</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.DataSetImpl
     * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenModulePackageImpl#getDataSet()
     * @generated
     */
    EClass     DATA_SET                               = eINSTANCE.getDataSet();

    /**
     * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SET__FILE                         = eINSTANCE.getDataSet_File();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SET__PREFIX                       = eINSTANCE.getDataSet_Prefix();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DATA_SET__ENABLED                      = eINSTANCE.getDataSet_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenModulePackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                          = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED                   = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP        = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION     = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Xml Gen Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__XML_GEN_CONFIGURATION   = eINSTANCE.getDocumentRoot_XmlGenConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.impl.OutputDirectoryImpl <em>Output Directory</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.OutputDirectoryImpl
     * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenModulePackageImpl#getOutputDirectory()
     * @generated
     */
    EClass     OUTPUT_DIRECTORY                       = eINSTANCE.getOutputDirectory();

    /**
     * The meta object literal for the '<em><b>File Name Pattern</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference OUTPUT_DIRECTORY__FILE_NAME_PATTERN    = eINSTANCE.getOutputDirectory_FileNamePattern();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenConfigurationImpl <em>Xml Gen Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenModulePackageImpl#getXmlGenConfiguration()
     * @generated
     */
    EClass     XML_GEN_CONFIGURATION                  = eINSTANCE.getXmlGenConfiguration();

    /**
     * The meta object literal for the '<em><b>Template File</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML_GEN_CONFIGURATION__TEMPLATE_FILE   = eINSTANCE.getXmlGenConfiguration_TemplateFile();

    /**
     * The meta object literal for the '<em><b>Output Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML_GEN_CONFIGURATION__OUTPUT_RESOURCE = eINSTANCE.getXmlGenConfiguration_OutputResource();

    /**
     * The meta object literal for the '<em><b>Data Sets</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML_GEN_CONFIGURATION__DATA_SETS       = eINSTANCE.getXmlGenConfiguration_DataSets();

    /**
     * The meta object literal for the '<em><b>Legacy Mode</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XML_GEN_CONFIGURATION__LEGACY_MODE     = eINSTANCE.getXmlGenConfiguration_LegacyMode();

    /**
     * The meta object literal for the '<em><b>Xml Format</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XML_GEN_CONFIGURATION__XML_FORMAT      = eINSTANCE.getXmlGenConfiguration_XmlFormat();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums <em>Xml Format Enums</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums
     * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenModulePackageImpl#getXmlFormatEnums()
     * @generated
     */
    EEnum      XML_FORMAT_ENUMS                       = eINSTANCE.getXmlFormatEnums();

    /**
     * The meta object literal for the '<em>Xml Format Enums Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums
     * @see com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenModulePackageImpl#getXmlFormatEnumsObject()
     * @generated
     */
    EDataType  XML_FORMAT_ENUMS_OBJECT                = eINSTANCE.getXmlFormatEnumsObject();

  }

} // XmlGenModulePackage
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
