package com.ms.qaTools.saturn.listeners;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.ms.qaTools.saturn.types.TypesPackage;
import com.ms.qaTools.saturn.values.ValuesPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.listeners.ListenersFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface ListenersPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String           eNAME                                             = "listeners";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String           eNS_URI                                           = "http://www.ms.com/2006/Saturn/Listeners";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String           eNS_PREFIX                                        = "listeners";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  ListenersPackage eINSTANCE                                         = com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.listeners.impl.ConsoleReportListenerImpl <em>Console Report Listener</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.listeners.impl.ConsoleReportListenerImpl
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getConsoleReportListener()
   * @generated
   */
  int              CONSOLE_REPORT_LISTENER                           = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CONSOLE_REPORT_LISTENER__NAME                     = TypesPackage.ABSTRACT_LISTENER__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CONSOLE_REPORT_LISTENER__ENABLED                  = TypesPackage.ABSTRACT_LISTENER__ENABLED;

  /**
   * The feature id for the '<em><b>Verbosity</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CONSOLE_REPORT_LISTENER__VERBOSITY                = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CONSOLE_REPORT_LISTENER__COLOR                    = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Console Report Listener</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CONSOLE_REPORT_LISTENER_FEATURE_COUNT             = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.listeners.impl.DataSetReportListenerImpl <em>Data Set Report Listener</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.listeners.impl.DataSetReportListenerImpl
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getDataSetReportListener()
   * @generated
   */
  int              DATA_SET_REPORT_LISTENER                          = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DATA_SET_REPORT_LISTENER__NAME                    = TypesPackage.ABSTRACT_LISTENER__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DATA_SET_REPORT_LISTENER__ENABLED                 = TypesPackage.ABSTRACT_LISTENER__ENABLED;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DATA_SET_REPORT_LISTENER__INPUT                   = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              DATA_SET_REPORT_LISTENER__OUTPUT                  = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Set Report Listener</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              DATA_SET_REPORT_LISTENER_FEATURE_COUNT            = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.listeners.impl.EMailPostExecutionListenerImpl <em>EMail Post Execution Listener</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.listeners.impl.EMailPostExecutionListenerImpl
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getEMailPostExecutionListener()
   * @generated
   */
  int              EMAIL_POST_EXECUTION_LISTENER                     = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              EMAIL_POST_EXECUTION_LISTENER__NAME               = TypesPackage.ABSTRACT_LISTENER__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              EMAIL_POST_EXECUTION_LISTENER__ENABLED            = TypesPackage.ABSTRACT_LISTENER__ENABLED;

  /**
   * The number of structural features of the '<em>EMail Post Execution Listener</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              EMAIL_POST_EXECUTION_LISTENER_FEATURE_COUNT       = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.listeners.impl.IDImpl <em>ID</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.listeners.impl.IDImpl
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getID()
   * @generated
   */
  int              ID                                                = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              ID__ID                                            = 0;

  /**
   * The number of structural features of the '<em>ID</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              ID_FEATURE_COUNT                                  = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.listeners.impl.MailConfigurationImpl <em>Mail Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.listeners.impl.MailConfigurationImpl
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getMailConfiguration()
   * @generated
   */
  int              MAIL_CONFIGURATION                                = 4;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              MAIL_CONFIGURATION__SUBJECT                       = 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              MAIL_CONFIGURATION__MESSAGE                       = 1;

  /**
   * The feature id for the '<em><b>Attachments</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              MAIL_CONFIGURATION__ATTACHMENTS                   = 2;

  /**
   * The feature id for the '<em><b>Recipients</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              MAIL_CONFIGURATION__RECIPIENTS                    = 3;

  /**
   * The feature id for the '<em><b>Attach As Link</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              MAIL_CONFIGURATION__ATTACH_AS_LINK                = 4;

  /**
   * The number of structural features of the '<em>Mail Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              MAIL_CONFIGURATION_FEATURE_COUNT                  = 5;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.listeners.impl.MailRecipientImpl <em>Mail Recipient</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.listeners.impl.MailRecipientImpl
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getMailRecipient()
   * @generated
   */
  int              MAIL_RECIPIENT                                    = 5;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIL_RECIPIENT__DESCRIPTION = ValuesPackage.COMPLEX_VALUE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              MAIL_RECIPIENT__MIXED                             = ValuesPackage.COMPLEX_VALUE__MIXED;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              MAIL_RECIPIENT__NULL                              = ValuesPackage.COMPLEX_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              MAIL_RECIPIENT__GROUP                             = ValuesPackage.COMPLEX_VALUE__GROUP;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              MAIL_RECIPIENT__TEXT                              = ValuesPackage.COMPLEX_VALUE__TEXT;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              MAIL_RECIPIENT__ENV_VAR                           = ValuesPackage.COMPLEX_VALUE__ENV_VAR;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              MAIL_RECIPIENT__FILE                              = ValuesPackage.COMPLEX_VALUE__FILE;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              MAIL_RECIPIENT__XPATH_VALUE                       = ValuesPackage.COMPLEX_VALUE__XPATH_VALUE;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIL_RECIPIENT__JSON_VALUE = ValuesPackage.COMPLEX_VALUE__JSON_VALUE;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIL_RECIPIENT__FIX_VALUE = ValuesPackage.COMPLEX_VALUE__FIX_VALUE;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              MAIL_RECIPIENT__CELL_VALUE                        = ValuesPackage.COMPLEX_VALUE__CELL_VALUE;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              MAIL_RECIPIENT__PROPERTY_VALUE                    = ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              MAIL_RECIPIENT__CODE                              = ValuesPackage.COMPLEX_VALUE__CODE;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              MAIL_RECIPIENT__RUN_NUMBER                        = ValuesPackage.COMPLEX_VALUE__RUN_NUMBER;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              MAIL_RECIPIENT__REFERENCE                         = ValuesPackage.COMPLEX_VALUE__REFERENCE;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              MAIL_RECIPIENT__MEMOIZE                           = ValuesPackage.COMPLEX_VALUE__MEMOIZE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              MAIL_RECIPIENT__TYPE                              = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mail Recipient</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              MAIL_RECIPIENT_FEATURE_COUNT                      = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.listeners.impl.ScenarioReportListenerImpl <em>Scenario Report Listener</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.listeners.impl.ScenarioReportListenerImpl
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getScenarioReportListener()
   * @generated
   */
  int              SCENARIO_REPORT_LISTENER                          = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              SCENARIO_REPORT_LISTENER__NAME                    = TypesPackage.ABSTRACT_LISTENER__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              SCENARIO_REPORT_LISTENER__ENABLED                 = TypesPackage.ABSTRACT_LISTENER__ENABLED;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              SCENARIO_REPORT_LISTENER__OUTPUT                  = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              SCENARIO_REPORT_LISTENER__TITLE                   = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Scenario Report Listener</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SCENARIO_REPORT_LISTENER_FEATURE_COUNT            = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.listeners.impl.TAPReportListenerImpl <em>TAP Report Listener</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.listeners.impl.TAPReportListenerImpl
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getTAPReportListener()
   * @generated
   */
  int              TAP_REPORT_LISTENER                               = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              TAP_REPORT_LISTENER__NAME                         = TypesPackage.ABSTRACT_LISTENER__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              TAP_REPORT_LISTENER__ENABLED                      = TypesPackage.ABSTRACT_LISTENER__ENABLED;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              TAP_REPORT_LISTENER__OUTPUT                       = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Omitted IDs</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              TAP_REPORT_LISTENER__OMITTED_IDS                  = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>IDs</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              TAP_REPORT_LISTENER__IDS                          = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              TAP_REPORT_LISTENER__TYPE                         = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>TAP Report Listener</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              TAP_REPORT_LISTENER_FEATURE_COUNT                 = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.listeners.impl.XmlDirectoryImpl <em>Xml Directory</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.listeners.impl.XmlDirectoryImpl
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getXmlDirectory()
   * @generated
   */
  int              XML_DIRECTORY                                     = 8;

  /**
   * The feature id for the '<em><b>Directory</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              XML_DIRECTORY__DIRECTORY                          = 0;

  /**
   * The number of structural features of the '<em>Xml Directory</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              XML_DIRECTORY_FEATURE_COUNT                       = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.listeners.impl.XmlFileImpl <em>Xml File</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.listeners.impl.XmlFileImpl
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getXmlFile()
   * @generated
   */
  int              XML_FILE                                          = 9;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              XML_FILE__TITLE                                   = 0;

  /**
   * The feature id for the '<em><b>File Name</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              XML_FILE__FILE_NAME                               = 1;

  /**
   * The feature id for the '<em><b>Xslt URI</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              XML_FILE__XSLT_URI                                = 2;

  /**
   * The number of structural features of the '<em>Xml File</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              XML_FILE_FEATURE_COUNT                            = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.listeners.impl.XmlHierarchicalReportListenerImpl <em>Xml Hierarchical Report Listener</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.listeners.impl.XmlHierarchicalReportListenerImpl
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getXmlHierarchicalReportListener()
   * @generated
   */
  int              XML_HIERARCHICAL_REPORT_LISTENER                  = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              XML_HIERARCHICAL_REPORT_LISTENER__NAME            = TypesPackage.ABSTRACT_LISTENER__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              XML_HIERARCHICAL_REPORT_LISTENER__ENABLED         = TypesPackage.ABSTRACT_LISTENER__ENABLED;

  /**
   * The feature id for the '<em><b>Xml Directories</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              XML_HIERARCHICAL_REPORT_LISTENER__XML_DIRECTORIES = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Xml Hierarchical Report Listener</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              XML_HIERARCHICAL_REPORT_LISTENER_FEATURE_COUNT    = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.listeners.impl.XmlReportListenerImpl <em>Xml Report Listener</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.listeners.impl.XmlReportListenerImpl
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getXmlReportListener()
   * @generated
   */
  int              XML_REPORT_LISTENER                               = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              XML_REPORT_LISTENER__NAME                         = TypesPackage.ABSTRACT_LISTENER__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              XML_REPORT_LISTENER__ENABLED                      = TypesPackage.ABSTRACT_LISTENER__ENABLED;

  /**
   * The feature id for the '<em><b>Xml Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              XML_REPORT_LISTENER__XML_FILES                    = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Xml Report Listener</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              XML_REPORT_LISTENER_FEATURE_COUNT                 = TypesPackage.ABSTRACT_LISTENER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.listeners.RecipientTypeEnum <em>Recipient Type Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.listeners.RecipientTypeEnum
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getRecipientTypeEnum()
   * @generated
   */
  int              RECIPIENT_TYPE_ENUM                               = 12;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.listeners.TAPOutputTypeEnum <em>TAP Output Type Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.listeners.TAPOutputTypeEnum
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getTAPOutputTypeEnum()
   * @generated
   */
  int              TAP_OUTPUT_TYPE_ENUM                              = 13;

  /**
   * The meta object id for the '<em>Recipient Type Enum Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.listeners.RecipientTypeEnum
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getRecipientTypeEnumObject()
   * @generated
   */
  int              RECIPIENT_TYPE_ENUM_OBJECT                        = 14;

  /**
   * The meta object id for the '<em>TAP Output Type Enum Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.listeners.TAPOutputTypeEnum
   * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getTAPOutputTypeEnumObject()
   * @generated
   */
  int              TAP_OUTPUT_TYPE_ENUM_OBJECT                       = 15;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.listeners.ConsoleReportListener <em>Console Report Listener</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Console Report Listener</em>'.
   * @see com.ms.qaTools.saturn.listeners.ConsoleReportListener
   * @generated
   */
  EClass getConsoleReportListener();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.listeners.ConsoleReportListener#isColor <em>Color</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see com.ms.qaTools.saturn.listeners.ConsoleReportListener#isColor()
   * @see #getConsoleReportListener()
   * @generated
   */
  EAttribute getConsoleReportListener_Color();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.listeners.ConsoleReportListener#getVerbosity <em>Verbosity</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verbosity</em>'.
   * @see com.ms.qaTools.saturn.listeners.ConsoleReportListener#getVerbosity()
   * @see #getConsoleReportListener()
   * @generated
   */
  EAttribute getConsoleReportListener_Verbosity();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.listeners.DataSetReportListener <em>Data Set Report Listener</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Set Report Listener</em>'.
   * @see com.ms.qaTools.saturn.listeners.DataSetReportListener
   * @generated
   */
  EClass getDataSetReportListener();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.listeners.DataSetReportListener#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see com.ms.qaTools.saturn.listeners.DataSetReportListener#getInput()
   * @see #getDataSetReportListener()
   * @generated
   */
  EReference getDataSetReportListener_Input();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.listeners.DataSetReportListener#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see com.ms.qaTools.saturn.listeners.DataSetReportListener#getOutput()
   * @see #getDataSetReportListener()
   * @generated
   */
  EReference getDataSetReportListener_Output();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.listeners.EMailPostExecutionListener <em>EMail Post Execution Listener</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>EMail Post Execution Listener</em>'.
   * @see com.ms.qaTools.saturn.listeners.EMailPostExecutionListener
   * @generated
   */
  EClass getEMailPostExecutionListener();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.listeners.ID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ID</em>'.
   * @see com.ms.qaTools.saturn.listeners.ID
   * @generated
   */
  EClass getID();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.listeners.ID#getId <em>Id</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see com.ms.qaTools.saturn.listeners.ID#getId()
   * @see #getID()
   * @generated
   */
  EAttribute getID_Id();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.listeners.MailConfiguration <em>Mail Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Mail Configuration</em>'.
   * @see com.ms.qaTools.saturn.listeners.MailConfiguration
   * @generated
   */
  EClass getMailConfiguration();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.listeners.MailConfiguration#getSubject <em>Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subject</em>'.
   * @see com.ms.qaTools.saturn.listeners.MailConfiguration#getSubject()
   * @see #getMailConfiguration()
   * @generated
   */
  EReference getMailConfiguration_Subject();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.listeners.MailConfiguration#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Message</em>'.
   * @see com.ms.qaTools.saturn.listeners.MailConfiguration#getMessage()
   * @see #getMailConfiguration()
   * @generated
   */
  EReference getMailConfiguration_Message();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.listeners.MailConfiguration#getAttachments <em>Attachments</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attachments</em>'.
   * @see com.ms.qaTools.saturn.listeners.MailConfiguration#getAttachments()
   * @see #getMailConfiguration()
   * @generated
   */
  EReference getMailConfiguration_Attachments();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.listeners.MailConfiguration#getRecipients <em>Recipients</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Recipients</em>'.
   * @see com.ms.qaTools.saturn.listeners.MailConfiguration#getRecipients()
   * @see #getMailConfiguration()
   * @generated
   */
  EReference getMailConfiguration_Recipients();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.listeners.MailConfiguration#isAttachAsLink <em>Attach As Link</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attach As Link</em>'.
   * @see com.ms.qaTools.saturn.listeners.MailConfiguration#isAttachAsLink()
   * @see #getMailConfiguration()
   * @generated
   */
  EAttribute getMailConfiguration_AttachAsLink();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.listeners.MailRecipient <em>Mail Recipient</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Mail Recipient</em>'.
   * @see com.ms.qaTools.saturn.listeners.MailRecipient
   * @generated
   */
  EClass getMailRecipient();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.listeners.MailRecipient#getType <em>Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.ms.qaTools.saturn.listeners.MailRecipient#getType()
   * @see #getMailRecipient()
   * @generated
   */
  EAttribute getMailRecipient_Type();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.listeners.ScenarioReportListener <em>Scenario Report Listener</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario Report Listener</em>'.
   * @see com.ms.qaTools.saturn.listeners.ScenarioReportListener
   * @generated
   */
  EClass getScenarioReportListener();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.listeners.ScenarioReportListener#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see com.ms.qaTools.saturn.listeners.ScenarioReportListener#getOutput()
   * @see #getScenarioReportListener()
   * @generated
   */
  EReference getScenarioReportListener_Output();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.listeners.ScenarioReportListener#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see com.ms.qaTools.saturn.listeners.ScenarioReportListener#getTitle()
   * @see #getScenarioReportListener()
   * @generated
   */
  EAttribute getScenarioReportListener_Title();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.listeners.TAPReportListener <em>TAP Report Listener</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>TAP Report Listener</em>'.
   * @see com.ms.qaTools.saturn.listeners.TAPReportListener
   * @generated
   */
  EClass getTAPReportListener();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.listeners.TAPReportListener#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see com.ms.qaTools.saturn.listeners.TAPReportListener#getOutput()
   * @see #getTAPReportListener()
   * @generated
   */
  EReference getTAPReportListener_Output();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.listeners.TAPReportListener#getOmittedIDs <em>Omitted IDs</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Omitted IDs</em>'.
   * @see com.ms.qaTools.saturn.listeners.TAPReportListener#getOmittedIDs()
   * @see #getTAPReportListener()
   * @generated
   */
  EReference getTAPReportListener_OmittedIDs();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.listeners.TAPReportListener#getIDs <em>IDs</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference list '<em>IDs</em>'.
   * @see com.ms.qaTools.saturn.listeners.TAPReportListener#getIDs()
   * @see #getTAPReportListener()
   * @generated
   */
  EReference getTAPReportListener_IDs();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.listeners.TAPReportListener#getType <em>Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.ms.qaTools.saturn.listeners.TAPReportListener#getType()
   * @see #getTAPReportListener()
   * @generated
   */
  EAttribute getTAPReportListener_Type();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.listeners.XmlDirectory <em>Xml Directory</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Directory</em>'.
   * @see com.ms.qaTools.saturn.listeners.XmlDirectory
   * @generated
   */
  EClass getXmlDirectory();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.listeners.XmlDirectory#getDirectory <em>Directory</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Directory</em>'.
   * @see com.ms.qaTools.saturn.listeners.XmlDirectory#getDirectory()
   * @see #getXmlDirectory()
   * @generated
   */
  EReference getXmlDirectory_Directory();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.listeners.XmlFile <em>Xml File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Xml File</em>'.
   * @see com.ms.qaTools.saturn.listeners.XmlFile
   * @generated
   */
  EClass getXmlFile();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.listeners.XmlFile#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see com.ms.qaTools.saturn.listeners.XmlFile#getTitle()
   * @see #getXmlFile()
   * @generated
   */
  EReference getXmlFile_Title();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.listeners.XmlFile#getFileName <em>File Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>File Name</em>'.
   * @see com.ms.qaTools.saturn.listeners.XmlFile#getFileName()
   * @see #getXmlFile()
   * @generated
   */
  EReference getXmlFile_FileName();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.listeners.XmlFile#getXsltURI <em>Xslt URI</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xslt URI</em>'.
   * @see com.ms.qaTools.saturn.listeners.XmlFile#getXsltURI()
   * @see #getXmlFile()
   * @generated
   */
  EReference getXmlFile_XsltURI();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.listeners.XmlHierarchicalReportListener <em>Xml Hierarchical Report Listener</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Hierarchical Report Listener</em>'.
   * @see com.ms.qaTools.saturn.listeners.XmlHierarchicalReportListener
   * @generated
   */
  EClass getXmlHierarchicalReportListener();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.listeners.XmlHierarchicalReportListener#getXmlDirectories <em>Xml Directories</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Xml Directories</em>'.
   * @see com.ms.qaTools.saturn.listeners.XmlHierarchicalReportListener#getXmlDirectories()
   * @see #getXmlHierarchicalReportListener()
   * @generated
   */
  EReference getXmlHierarchicalReportListener_XmlDirectories();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.listeners.XmlReportListener <em>Xml Report Listener</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Report Listener</em>'.
   * @see com.ms.qaTools.saturn.listeners.XmlReportListener
   * @generated
   */
  EClass getXmlReportListener();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.listeners.XmlReportListener#getXmlFiles <em>Xml Files</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Xml Files</em>'.
   * @see com.ms.qaTools.saturn.listeners.XmlReportListener#getXmlFiles()
   * @see #getXmlReportListener()
   * @generated
   */
  EReference getXmlReportListener_XmlFiles();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.listeners.RecipientTypeEnum <em>Recipient Type Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Recipient Type Enum</em>'.
   * @see com.ms.qaTools.saturn.listeners.RecipientTypeEnum
   * @generated
   */
  EEnum getRecipientTypeEnum();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.listeners.TAPOutputTypeEnum <em>TAP Output Type Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>TAP Output Type Enum</em>'.
   * @see com.ms.qaTools.saturn.listeners.TAPOutputTypeEnum
   * @generated
   */
  EEnum getTAPOutputTypeEnum();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.listeners.RecipientTypeEnum <em>Recipient Type Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Recipient Type Enum Object</em>'.
   * @see com.ms.qaTools.saturn.listeners.RecipientTypeEnum
   * @model instanceClass="com.ms.qaTools.saturn.listeners.RecipientTypeEnum"
   *        extendedMetaData="name='RecipientTypeEnum:Object' baseType='RecipientTypeEnum'"
   * @generated
   */
  EDataType getRecipientTypeEnumObject();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.listeners.TAPOutputTypeEnum <em>TAP Output Type Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>TAP Output Type Enum Object</em>'.
   * @see com.ms.qaTools.saturn.listeners.TAPOutputTypeEnum
   * @model instanceClass="com.ms.qaTools.saturn.listeners.TAPOutputTypeEnum"
   *        extendedMetaData="name='TAPOutputTypeEnum:Object' baseType='TAPOutputTypeEnum'"
   * @generated
   */
  EDataType getTAPOutputTypeEnumObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ListenersFactory getListenersFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.listeners.impl.ConsoleReportListenerImpl <em>Console Report Listener</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.listeners.impl.ConsoleReportListenerImpl
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getConsoleReportListener()
     * @generated
     */
    EClass     CONSOLE_REPORT_LISTENER                           = eINSTANCE.getConsoleReportListener();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute CONSOLE_REPORT_LISTENER__COLOR                    = eINSTANCE.getConsoleReportListener_Color();

    /**
     * The meta object literal for the '<em><b>Verbosity</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute CONSOLE_REPORT_LISTENER__VERBOSITY                = eINSTANCE.getConsoleReportListener_Verbosity();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.listeners.impl.DataSetReportListenerImpl <em>Data Set Report Listener</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.listeners.impl.DataSetReportListenerImpl
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getDataSetReportListener()
     * @generated
     */
    EClass     DATA_SET_REPORT_LISTENER                          = eINSTANCE.getDataSetReportListener();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SET_REPORT_LISTENER__INPUT                   = eINSTANCE.getDataSetReportListener_Input();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SET_REPORT_LISTENER__OUTPUT                  = eINSTANCE.getDataSetReportListener_Output();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.listeners.impl.EMailPostExecutionListenerImpl <em>EMail Post Execution Listener</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.listeners.impl.EMailPostExecutionListenerImpl
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getEMailPostExecutionListener()
     * @generated
     */
    EClass     EMAIL_POST_EXECUTION_LISTENER                     = eINSTANCE.getEMailPostExecutionListener();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.listeners.impl.IDImpl <em>ID</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.listeners.impl.IDImpl
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getID()
     * @generated
     */
    EClass     ID                                                = eINSTANCE.getID();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    EAttribute ID__ID                                            = eINSTANCE.getID_Id();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.listeners.impl.MailConfigurationImpl <em>Mail Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.listeners.impl.MailConfigurationImpl
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getMailConfiguration()
     * @generated
     */
    EClass     MAIL_CONFIGURATION                                = eINSTANCE.getMailConfiguration();

    /**
     * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIL_CONFIGURATION__SUBJECT                       = eINSTANCE.getMailConfiguration_Subject();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIL_CONFIGURATION__MESSAGE                       = eINSTANCE.getMailConfiguration_Message();

    /**
     * The meta object literal for the '<em><b>Attachments</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference MAIL_CONFIGURATION__ATTACHMENTS                   = eINSTANCE.getMailConfiguration_Attachments();

    /**
     * The meta object literal for the '<em><b>Recipients</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference MAIL_CONFIGURATION__RECIPIENTS                    = eINSTANCE.getMailConfiguration_Recipients();

    /**
     * The meta object literal for the '<em><b>Attach As Link</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MAIL_CONFIGURATION__ATTACH_AS_LINK                = eINSTANCE.getMailConfiguration_AttachAsLink();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.listeners.impl.MailRecipientImpl <em>Mail Recipient</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.listeners.impl.MailRecipientImpl
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getMailRecipient()
     * @generated
     */
    EClass     MAIL_RECIPIENT                                    = eINSTANCE.getMailRecipient();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MAIL_RECIPIENT__TYPE                              = eINSTANCE.getMailRecipient_Type();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.listeners.impl.ScenarioReportListenerImpl <em>Scenario Report Listener</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.listeners.impl.ScenarioReportListenerImpl
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getScenarioReportListener()
     * @generated
     */
    EClass     SCENARIO_REPORT_LISTENER                          = eINSTANCE.getScenarioReportListener();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO_REPORT_LISTENER__OUTPUT                  = eINSTANCE.getScenarioReportListener_Output();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO_REPORT_LISTENER__TITLE                   = eINSTANCE.getScenarioReportListener_Title();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.listeners.impl.TAPReportListenerImpl <em>TAP Report Listener</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.listeners.impl.TAPReportListenerImpl
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getTAPReportListener()
     * @generated
     */
    EClass     TAP_REPORT_LISTENER                               = eINSTANCE.getTAPReportListener();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAP_REPORT_LISTENER__OUTPUT                       = eINSTANCE.getTAPReportListener_Output();

    /**
     * The meta object literal for the '<em><b>Omitted IDs</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference TAP_REPORT_LISTENER__OMITTED_IDS                  = eINSTANCE.getTAPReportListener_OmittedIDs();

    /**
     * The meta object literal for the '<em><b>IDs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAP_REPORT_LISTENER__IDS                          = eINSTANCE.getTAPReportListener_IDs();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TAP_REPORT_LISTENER__TYPE                         = eINSTANCE.getTAPReportListener_Type();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.listeners.impl.XmlDirectoryImpl <em>Xml Directory</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.listeners.impl.XmlDirectoryImpl
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getXmlDirectory()
     * @generated
     */
    EClass     XML_DIRECTORY                                     = eINSTANCE.getXmlDirectory();

    /**
     * The meta object literal for the '<em><b>Directory</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference XML_DIRECTORY__DIRECTORY                          = eINSTANCE.getXmlDirectory_Directory();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.listeners.impl.XmlFileImpl <em>Xml File</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.listeners.impl.XmlFileImpl
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getXmlFile()
     * @generated
     */
    EClass     XML_FILE                                          = eINSTANCE.getXmlFile();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_FILE__TITLE                                   = eINSTANCE.getXmlFile_Title();

    /**
     * The meta object literal for the '<em><b>File Name</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference XML_FILE__FILE_NAME                               = eINSTANCE.getXmlFile_FileName();

    /**
     * The meta object literal for the '<em><b>Xslt URI</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_FILE__XSLT_URI                                = eINSTANCE.getXmlFile_XsltURI();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.listeners.impl.XmlHierarchicalReportListenerImpl <em>Xml Hierarchical Report Listener</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.listeners.impl.XmlHierarchicalReportListenerImpl
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getXmlHierarchicalReportListener()
     * @generated
     */
    EClass     XML_HIERARCHICAL_REPORT_LISTENER                  = eINSTANCE.getXmlHierarchicalReportListener();

    /**
     * The meta object literal for the '<em><b>Xml Directories</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML_HIERARCHICAL_REPORT_LISTENER__XML_DIRECTORIES = eINSTANCE.getXmlHierarchicalReportListener_XmlDirectories();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.listeners.impl.XmlReportListenerImpl <em>Xml Report Listener</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.listeners.impl.XmlReportListenerImpl
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getXmlReportListener()
     * @generated
     */
    EClass     XML_REPORT_LISTENER                               = eINSTANCE.getXmlReportListener();

    /**
     * The meta object literal for the '<em><b>Xml Files</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML_REPORT_LISTENER__XML_FILES                    = eINSTANCE.getXmlReportListener_XmlFiles();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.listeners.RecipientTypeEnum <em>Recipient Type Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.listeners.RecipientTypeEnum
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getRecipientTypeEnum()
     * @generated
     */
    EEnum      RECIPIENT_TYPE_ENUM                               = eINSTANCE.getRecipientTypeEnum();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.listeners.TAPOutputTypeEnum <em>TAP Output Type Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.listeners.TAPOutputTypeEnum
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getTAPOutputTypeEnum()
     * @generated
     */
    EEnum      TAP_OUTPUT_TYPE_ENUM                              = eINSTANCE.getTAPOutputTypeEnum();

    /**
     * The meta object literal for the '<em>Recipient Type Enum Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.listeners.RecipientTypeEnum
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getRecipientTypeEnumObject()
     * @generated
     */
    EDataType  RECIPIENT_TYPE_ENUM_OBJECT                        = eINSTANCE.getRecipientTypeEnumObject();

    /**
     * The meta object literal for the '<em>TAP Output Type Enum Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.listeners.TAPOutputTypeEnum
     * @see com.ms.qaTools.saturn.listeners.impl.ListenersPackageImpl#getTAPOutputTypeEnumObject()
     * @generated
     */
    EDataType  TAP_OUTPUT_TYPE_ENUM_OBJECT                       = eINSTANCE.getTAPOutputTypeEnumObject();

  }

} // ListenersPackage
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
