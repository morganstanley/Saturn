package com.ms.qaTools.saturn.modules.psManagerModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface PsManagerModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNAME                                             = "psManagerModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNS_URI                                           = "http://www.ms.com/2009/Saturn/Modules/PsManager";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNS_PREFIX                                        = "psManagerModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  PsManagerModulePackage eINSTANCE                                         = com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.AbstractOperationImpl <em>Abstract Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.AbstractOperationImpl
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getAbstractOperation()
   * @generated
   */
  int                    ABSTRACT_OPERATION                                = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    ABSTRACT_OPERATION__ENABLED                       = 0;

  /**
   * The number of structural features of the '<em>Abstract Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    ABSTRACT_OPERATION_FEATURE_COUNT                  = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.CheckSessionDownOperationImpl <em>Check Session Down Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.CheckSessionDownOperationImpl
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getCheckSessionDownOperation()
   * @generated
   */
  int                    CHECK_SESSION_DOWN_OPERATION                      = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    CHECK_SESSION_DOWN_OPERATION__ENABLED             = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    CHECK_SESSION_DOWN_OPERATION__EXCEPTION           = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Session Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    CHECK_SESSION_DOWN_OPERATION__SESSION_NAME        = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Check Session Down Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    CHECK_SESSION_DOWN_OPERATION_FEATURE_COUNT        = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.CheckSessionUpOperationImpl <em>Check Session Up Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.CheckSessionUpOperationImpl
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getCheckSessionUpOperation()
   * @generated
   */
  int                    CHECK_SESSION_UP_OPERATION                        = 2;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    CHECK_SESSION_UP_OPERATION__ENABLED               = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    CHECK_SESSION_UP_OPERATION__EXCEPTION             = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Session Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    CHECK_SESSION_UP_OPERATION__SESSION_NAME          = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Check Session Up Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    CHECK_SESSION_UP_OPERATION_FEATURE_COUNT          = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                    DOCUMENT_ROOT                                     = 3;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DOCUMENT_ROOT__MIXED                              = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DOCUMENT_ROOT__XMLNS_PREFIX_MAP                   = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DOCUMENT_ROOT__XSI_SCHEMA_LOCATION                = 2;

  /**
   * The feature id for the '<em><b>Ps Manager Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DOCUMENT_ROOT__PS_MANAGER_CONFIGURATION           = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    DOCUMENT_ROOT_FEATURE_COUNT                       = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.LaunchProcessOperationImpl <em>Launch Process Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.LaunchProcessOperationImpl
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getLaunchProcessOperation()
   * @generated
   */
  int                    LAUNCH_PROCESS_OPERATION                          = 4;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    LAUNCH_PROCESS_OPERATION__ENABLED                 = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    LAUNCH_PROCESS_OPERATION__EXCEPTION               = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Process Ids</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    LAUNCH_PROCESS_OPERATION__PROCESS_IDS             = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Launch Process Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    LAUNCH_PROCESS_OPERATION_FEATURE_COUNT            = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.LaunchSessionOperationImpl <em>Launch Session Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.LaunchSessionOperationImpl
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getLaunchSessionOperation()
   * @generated
   */
  int                    LAUNCH_SESSION_OPERATION                          = 5;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    LAUNCH_SESSION_OPERATION__ENABLED                 = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    LAUNCH_SESSION_OPERATION__EXCEPTION               = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Session Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    LAUNCH_SESSION_OPERATION__SESSION_NAME            = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    LAUNCH_SESSION_OPERATION__TIMEOUT                 = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Poll Interval</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    LAUNCH_SESSION_OPERATION__POLL_INTERVAL           = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Pause</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    LAUNCH_SESSION_OPERATION__PAUSE                   = ABSTRACT_OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Wait</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    LAUNCH_SESSION_OPERATION__WAIT                    = ABSTRACT_OPERATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Force</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    LAUNCH_SESSION_OPERATION__FORCE                   = ABSTRACT_OPERATION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Launch Session Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    LAUNCH_SESSION_OPERATION_FEATURE_COUNT            = ABSTRACT_OPERATION_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerConfigurationImpl <em>Ps Manager Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getPsManagerConfiguration()
   * @generated
   */
  int                    PS_MANAGER_CONFIGURATION                          = 6;

  /**
   * The feature id for the '<em><b>Config File</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    PS_MANAGER_CONFIGURATION__CONFIG_FILE             = 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    PS_MANAGER_CONFIGURATION__OPERATIONS              = 1;

  /**
   * The number of structural features of the '<em>Ps Manager Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    PS_MANAGER_CONFIGURATION_FEATURE_COUNT            = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.RemoveSessionOperationImpl <em>Remove Session Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.RemoveSessionOperationImpl
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getRemoveSessionOperation()
   * @generated
   */
  int                    REMOVE_SESSION_OPERATION                          = 7;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    REMOVE_SESSION_OPERATION__ENABLED                 = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    REMOVE_SESSION_OPERATION__EXCEPTION               = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Session Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    REMOVE_SESSION_OPERATION__SESSION_NAME            = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ignore If Not Exists</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    REMOVE_SESSION_OPERATION__IGNORE_IF_NOT_EXISTS    = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Force</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    REMOVE_SESSION_OPERATION__FORCE                   = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Remove Session Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    REMOVE_SESSION_OPERATION_FEATURE_COUNT            = ABSTRACT_OPERATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.TerminateProcessOperationImpl <em>Terminate Process Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.TerminateProcessOperationImpl
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getTerminateProcessOperation()
   * @generated
   */
  int                    TERMINATE_PROCESS_OPERATION                       = 8;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    TERMINATE_PROCESS_OPERATION__ENABLED              = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    TERMINATE_PROCESS_OPERATION__EXCEPTION            = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Process Ids</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    TERMINATE_PROCESS_OPERATION__PROCESS_IDS          = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Terminate Process Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    TERMINATE_PROCESS_OPERATION_FEATURE_COUNT         = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.TerminateSessionOperationImpl <em>Terminate Session Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.TerminateSessionOperationImpl
   * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getTerminateSessionOperation()
   * @generated
   */
  int                    TERMINATE_SESSION_OPERATION                       = 9;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    TERMINATE_SESSION_OPERATION__ENABLED              = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    TERMINATE_SESSION_OPERATION__EXCEPTION            = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Session Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    TERMINATE_SESSION_OPERATION__SESSION_NAME         = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    TERMINATE_SESSION_OPERATION__TIMEOUT              = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Poll Interval</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    TERMINATE_SESSION_OPERATION__POLL_INTERVAL        = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Kill After</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    TERMINATE_SESSION_OPERATION__KILL_AFTER           = ABSTRACT_OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Wait</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    TERMINATE_SESSION_OPERATION__WAIT                 = ABSTRACT_OPERATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Ignore If Not Exists</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    TERMINATE_SESSION_OPERATION__IGNORE_IF_NOT_EXISTS = ABSTRACT_OPERATION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Terminate Session Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    TERMINATE_SESSION_OPERATION_FEATURE_COUNT         = ABSTRACT_OPERATION_FEATURE_COUNT + 7;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.psManagerModule.AbstractOperation <em>Abstract Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.AbstractOperation
   * @generated
   */
  EClass getAbstractOperation();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.psManagerModule.AbstractOperation#isEnabled <em>Enabled</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.AbstractOperation#isEnabled()
   * @see #getAbstractOperation()
   * @generated
   */
  EAttribute getAbstractOperation_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionDownOperation <em>Check Session Down Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Session Down Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionDownOperation
   * @generated
   */
  EClass getCheckSessionDownOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionDownOperation#getException <em>Exception</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionDownOperation#getException()
   * @see #getCheckSessionDownOperation()
   * @generated
   */
  EReference getCheckSessionDownOperation_Exception();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionDownOperation#getSessionName <em>Session Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Session Name</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionDownOperation#getSessionName()
   * @see #getCheckSessionDownOperation()
   * @generated
   */
  EReference getCheckSessionDownOperation_SessionName();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionUpOperation <em>Check Session Up Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Session Up Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionUpOperation
   * @generated
   */
  EClass getCheckSessionUpOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionUpOperation#getException <em>Exception</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionUpOperation#getException()
   * @see #getCheckSessionUpOperation()
   * @generated
   */
  EReference getCheckSessionUpOperation_Exception();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionUpOperation#getSessionName <em>Session Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Session Name</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.CheckSessionUpOperation#getSessionName()
   * @see #getCheckSessionUpOperation()
   * @generated
   */
  EReference getCheckSessionUpOperation_SessionName();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.psManagerModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.psManagerModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.psManagerModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.psManagerModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.psManagerModule.DocumentRoot#getPsManagerConfiguration <em>Ps Manager Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ps Manager Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.DocumentRoot#getPsManagerConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_PsManagerConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchProcessOperation <em>Launch Process Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Launch Process Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.LaunchProcessOperation
   * @generated
   */
  EClass getLaunchProcessOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchProcessOperation#getException <em>Exception</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.LaunchProcessOperation#getException()
   * @see #getLaunchProcessOperation()
   * @generated
   */
  EReference getLaunchProcessOperation_Exception();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchProcessOperation#getProcessIds <em>Process Ids</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Process Ids</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.LaunchProcessOperation#getProcessIds()
   * @see #getLaunchProcessOperation()
   * @generated
   */
  EReference getLaunchProcessOperation_ProcessIds();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation <em>Launch Session Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Launch Session Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation
   * @generated
   */
  EClass getLaunchSessionOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getException <em>Exception</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getException()
   * @see #getLaunchSessionOperation()
   * @generated
   */
  EReference getLaunchSessionOperation_Exception();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getSessionName <em>Session Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Session Name</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getSessionName()
   * @see #getLaunchSessionOperation()
   * @generated
   */
  EReference getLaunchSessionOperation_SessionName();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getTimeout <em>Timeout</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Timeout</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getTimeout()
   * @see #getLaunchSessionOperation()
   * @generated
   */
  EReference getLaunchSessionOperation_Timeout();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getPollInterval <em>Poll Interval</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Poll Interval</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getPollInterval()
   * @see #getLaunchSessionOperation()
   * @generated
   */
  EReference getLaunchSessionOperation_PollInterval();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getPause <em>Pause</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Pause</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#getPause()
   * @see #getLaunchSessionOperation()
   * @generated
   */
  EReference getLaunchSessionOperation_Pause();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#isForce <em>Force</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Force</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#isForce()
   * @see #getLaunchSessionOperation()
   * @generated
   */
  EAttribute getLaunchSessionOperation_Force();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#isWait <em>Wait</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Wait</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.LaunchSessionOperation#isWait()
   * @see #getLaunchSessionOperation()
   * @generated
   */
  EAttribute getLaunchSessionOperation_Wait();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.psManagerModule.PsManagerConfiguration <em>Ps Manager Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Ps Manager Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerConfiguration
   * @generated
   */
  EClass getPsManagerConfiguration();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.psManagerModule.PsManagerConfiguration#getConfigFile <em>Config File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Config File</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerConfiguration#getConfigFile()
   * @see #getPsManagerConfiguration()
   * @generated
   */
  EReference getPsManagerConfiguration_ConfigFile();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.psManagerModule.PsManagerConfiguration#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.PsManagerConfiguration#getOperations()
   * @see #getPsManagerConfiguration()
   * @generated
   */
  EReference getPsManagerConfiguration_Operations();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.psManagerModule.RemoveSessionOperation <em>Remove Session Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Remove Session Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.RemoveSessionOperation
   * @generated
   */
  EClass getRemoveSessionOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.psManagerModule.RemoveSessionOperation#getException <em>Exception</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.RemoveSessionOperation#getException()
   * @see #getRemoveSessionOperation()
   * @generated
   */
  EReference getRemoveSessionOperation_Exception();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.psManagerModule.RemoveSessionOperation#getSessionName <em>Session Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Session Name</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.RemoveSessionOperation#getSessionName()
   * @see #getRemoveSessionOperation()
   * @generated
   */
  EReference getRemoveSessionOperation_SessionName();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.psManagerModule.RemoveSessionOperation#isForce <em>Force</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Force</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.RemoveSessionOperation#isForce()
   * @see #getRemoveSessionOperation()
   * @generated
   */
  EAttribute getRemoveSessionOperation_Force();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.psManagerModule.RemoveSessionOperation#isIgnoreIfNotExists <em>Ignore If Not Exists</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ignore If Not Exists</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.RemoveSessionOperation#isIgnoreIfNotExists()
   * @see #getRemoveSessionOperation()
   * @generated
   */
  EAttribute getRemoveSessionOperation_IgnoreIfNotExists();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateProcessOperation <em>Terminate Process Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminate Process Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.TerminateProcessOperation
   * @generated
   */
  EClass getTerminateProcessOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateProcessOperation#getException <em>Exception</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.TerminateProcessOperation#getException()
   * @see #getTerminateProcessOperation()
   * @generated
   */
  EReference getTerminateProcessOperation_Exception();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateProcessOperation#getProcessIds <em>Process Ids</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Process Ids</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.TerminateProcessOperation#getProcessIds()
   * @see #getTerminateProcessOperation()
   * @generated
   */
  EReference getTerminateProcessOperation_ProcessIds();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation <em>Terminate Session Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminate Session Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation
   * @generated
   */
  EClass getTerminateSessionOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getException <em>Exception</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getException()
   * @see #getTerminateSessionOperation()
   * @generated
   */
  EReference getTerminateSessionOperation_Exception();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getSessionName <em>Session Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Session Name</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getSessionName()
   * @see #getTerminateSessionOperation()
   * @generated
   */
  EReference getTerminateSessionOperation_SessionName();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getTimeout <em>Timeout</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Timeout</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getTimeout()
   * @see #getTerminateSessionOperation()
   * @generated
   */
  EReference getTerminateSessionOperation_Timeout();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getPollInterval <em>Poll Interval</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Poll Interval</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getPollInterval()
   * @see #getTerminateSessionOperation()
   * @generated
   */
  EReference getTerminateSessionOperation_PollInterval();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getKillAfter <em>Kill After</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kill After</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#getKillAfter()
   * @see #getTerminateSessionOperation()
   * @generated
   */
  EReference getTerminateSessionOperation_KillAfter();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#isIgnoreIfNotExists <em>Ignore If Not Exists</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ignore If Not Exists</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#isIgnoreIfNotExists()
   * @see #getTerminateSessionOperation()
   * @generated
   */
  EAttribute getTerminateSessionOperation_IgnoreIfNotExists();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#isWait <em>Wait</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Wait</em>'.
   * @see com.ms.qaTools.saturn.modules.psManagerModule.TerminateSessionOperation#isWait()
   * @see #getTerminateSessionOperation()
   * @generated
   */
  EAttribute getTerminateSessionOperation_Wait();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PsManagerModuleFactory getPsManagerModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.AbstractOperationImpl <em>Abstract Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.AbstractOperationImpl
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getAbstractOperation()
     * @generated
     */
    EClass     ABSTRACT_OPERATION                                = eINSTANCE.getAbstractOperation();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_OPERATION__ENABLED                       = eINSTANCE.getAbstractOperation_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.CheckSessionDownOperationImpl <em>Check Session Down Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.CheckSessionDownOperationImpl
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getCheckSessionDownOperation()
     * @generated
     */
    EClass     CHECK_SESSION_DOWN_OPERATION                      = eINSTANCE.getCheckSessionDownOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_SESSION_DOWN_OPERATION__EXCEPTION           = eINSTANCE.getCheckSessionDownOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Session Name</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_SESSION_DOWN_OPERATION__SESSION_NAME        = eINSTANCE.getCheckSessionDownOperation_SessionName();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.CheckSessionUpOperationImpl <em>Check Session Up Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.CheckSessionUpOperationImpl
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getCheckSessionUpOperation()
     * @generated
     */
    EClass     CHECK_SESSION_UP_OPERATION                        = eINSTANCE.getCheckSessionUpOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_SESSION_UP_OPERATION__EXCEPTION             = eINSTANCE.getCheckSessionUpOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Session Name</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_SESSION_UP_OPERATION__SESSION_NAME          = eINSTANCE.getCheckSessionUpOperation_SessionName();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                                     = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED                              = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP                   = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION                = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Ps Manager Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__PS_MANAGER_CONFIGURATION           = eINSTANCE.getDocumentRoot_PsManagerConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.LaunchProcessOperationImpl <em>Launch Process Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.LaunchProcessOperationImpl
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getLaunchProcessOperation()
     * @generated
     */
    EClass     LAUNCH_PROCESS_OPERATION                          = eINSTANCE.getLaunchProcessOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference LAUNCH_PROCESS_OPERATION__EXCEPTION               = eINSTANCE.getLaunchProcessOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Process Ids</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference LAUNCH_PROCESS_OPERATION__PROCESS_IDS             = eINSTANCE.getLaunchProcessOperation_ProcessIds();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.LaunchSessionOperationImpl <em>Launch Session Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.LaunchSessionOperationImpl
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getLaunchSessionOperation()
     * @generated
     */
    EClass     LAUNCH_SESSION_OPERATION                          = eINSTANCE.getLaunchSessionOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference LAUNCH_SESSION_OPERATION__EXCEPTION               = eINSTANCE.getLaunchSessionOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Session Name</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference LAUNCH_SESSION_OPERATION__SESSION_NAME            = eINSTANCE.getLaunchSessionOperation_SessionName();

    /**
     * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAUNCH_SESSION_OPERATION__TIMEOUT                 = eINSTANCE.getLaunchSessionOperation_Timeout();

    /**
     * The meta object literal for the '<em><b>Poll Interval</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference LAUNCH_SESSION_OPERATION__POLL_INTERVAL           = eINSTANCE.getLaunchSessionOperation_PollInterval();

    /**
     * The meta object literal for the '<em><b>Pause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAUNCH_SESSION_OPERATION__PAUSE                   = eINSTANCE.getLaunchSessionOperation_Pause();

    /**
     * The meta object literal for the '<em><b>Force</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute LAUNCH_SESSION_OPERATION__FORCE                   = eINSTANCE.getLaunchSessionOperation_Force();

    /**
     * The meta object literal for the '<em><b>Wait</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute LAUNCH_SESSION_OPERATION__WAIT                    = eINSTANCE.getLaunchSessionOperation_Wait();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerConfigurationImpl <em>Ps Manager Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getPsManagerConfiguration()
     * @generated
     */
    EClass     PS_MANAGER_CONFIGURATION                          = eINSTANCE.getPsManagerConfiguration();

    /**
     * The meta object literal for the '<em><b>Config File</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference PS_MANAGER_CONFIGURATION__CONFIG_FILE             = eINSTANCE.getPsManagerConfiguration_ConfigFile();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference PS_MANAGER_CONFIGURATION__OPERATIONS              = eINSTANCE.getPsManagerConfiguration_Operations();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.RemoveSessionOperationImpl <em>Remove Session Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.RemoveSessionOperationImpl
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getRemoveSessionOperation()
     * @generated
     */
    EClass     REMOVE_SESSION_OPERATION                          = eINSTANCE.getRemoveSessionOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference REMOVE_SESSION_OPERATION__EXCEPTION               = eINSTANCE.getRemoveSessionOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Session Name</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference REMOVE_SESSION_OPERATION__SESSION_NAME            = eINSTANCE.getRemoveSessionOperation_SessionName();

    /**
     * The meta object literal for the '<em><b>Force</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute REMOVE_SESSION_OPERATION__FORCE                   = eINSTANCE.getRemoveSessionOperation_Force();

    /**
     * The meta object literal for the '<em><b>Ignore If Not Exists</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOVE_SESSION_OPERATION__IGNORE_IF_NOT_EXISTS    = eINSTANCE.getRemoveSessionOperation_IgnoreIfNotExists();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.TerminateProcessOperationImpl <em>Terminate Process Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.TerminateProcessOperationImpl
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getTerminateProcessOperation()
     * @generated
     */
    EClass     TERMINATE_PROCESS_OPERATION                       = eINSTANCE.getTerminateProcessOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINATE_PROCESS_OPERATION__EXCEPTION            = eINSTANCE.getTerminateProcessOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Process Ids</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference TERMINATE_PROCESS_OPERATION__PROCESS_IDS          = eINSTANCE.getTerminateProcessOperation_ProcessIds();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.TerminateSessionOperationImpl <em>Terminate Session Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.TerminateSessionOperationImpl
     * @see com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerModulePackageImpl#getTerminateSessionOperation()
     * @generated
     */
    EClass     TERMINATE_SESSION_OPERATION                       = eINSTANCE.getTerminateSessionOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINATE_SESSION_OPERATION__EXCEPTION            = eINSTANCE.getTerminateSessionOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Session Name</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINATE_SESSION_OPERATION__SESSION_NAME         = eINSTANCE.getTerminateSessionOperation_SessionName();

    /**
     * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINATE_SESSION_OPERATION__TIMEOUT              = eINSTANCE.getTerminateSessionOperation_Timeout();

    /**
     * The meta object literal for the '<em><b>Poll Interval</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference TERMINATE_SESSION_OPERATION__POLL_INTERVAL        = eINSTANCE.getTerminateSessionOperation_PollInterval();

    /**
     * The meta object literal for the '<em><b>Kill After</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINATE_SESSION_OPERATION__KILL_AFTER           = eINSTANCE.getTerminateSessionOperation_KillAfter();

    /**
     * The meta object literal for the '<em><b>Ignore If Not Exists</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERMINATE_SESSION_OPERATION__IGNORE_IF_NOT_EXISTS = eINSTANCE.getTerminateSessionOperation_IgnoreIfNotExists();

    /**
     * The meta object literal for the '<em><b>Wait</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TERMINATE_SESSION_OPERATION__WAIT                 = eINSTANCE.getTerminateSessionOperation_Wait();

  }

} // PsManagerModulePackage
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
