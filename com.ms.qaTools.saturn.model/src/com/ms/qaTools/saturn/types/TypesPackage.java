package com.ms.qaTools.saturn.types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.ms.qaTools.saturn.types.TypesFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2006/pdsttools/xsd2perl nsPrefix='types' package='Saturn::Script::Types'"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface TypesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String       eNAME                                                   = "types";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String       eNS_URI                                                 = "http://www.ms.com/2006/Saturn/Types";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String       eNS_PREFIX                                              = "types";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  TypesPackage eINSTANCE                                               = com.ms.qaTools.saturn.types.impl.TypesPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.AbstractAnnotationImpl <em>Abstract Annotation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.AbstractAnnotationImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getAbstractAnnotation()
   * @generated
   */
  int          ABSTRACT_ANNOTATION                                     = 0;

  /**
   * The number of structural features of the '<em>Abstract Annotation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          ABSTRACT_ANNOTATION_FEATURE_COUNT                       = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.AbstractListenerImpl <em>Abstract Listener</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.AbstractListenerImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getAbstractListener()
   * @generated
   */
  int          ABSTRACT_LISTENER                                       = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          ABSTRACT_LISTENER__NAME                                 = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          ABSTRACT_LISTENER__ENABLED                              = 1;

  /**
   * The number of structural features of the '<em>Abstract Listener</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          ABSTRACT_LISTENER_FEATURE_COUNT                         = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.AbstractBatchListenerImpl <em>Abstract Batch Listener</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.AbstractBatchListenerImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getAbstractBatchListener()
   * @generated
   */
  int          ABSTRACT_BATCH_LISTENER                                 = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          ABSTRACT_BATCH_LISTENER__NAME                           = ABSTRACT_LISTENER__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          ABSTRACT_BATCH_LISTENER__ENABLED                        = ABSTRACT_LISTENER__ENABLED;

  /**
   * The number of structural features of the '<em>Abstract Batch Listener</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          ABSTRACT_BATCH_LISTENER_FEATURE_COUNT                   = ABSTRACT_LISTENER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.AbstractRepetitionHandlerImpl <em>Abstract Repetition Handler</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.AbstractRepetitionHandlerImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getAbstractRepetitionHandler()
   * @generated
   */
  int          ABSTRACT_REPETITION_HANDLER                             = 3;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          ABSTRACT_REPETITION_HANDLER__DEFAULT_STATUS             = 0;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          ABSTRACT_REPETITION_HANDLER__STATUS_CONDITION           = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          ABSTRACT_REPETITION_HANDLER__ENABLED                    = 2;

  /**
   * The number of structural features of the '<em>Abstract Repetition Handler</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          ABSTRACT_REPETITION_HANDLER_FEATURE_COUNT               = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.AbstractRunGroupModifierImpl <em>Abstract Run Group Modifier</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.AbstractRunGroupModifierImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getAbstractRunGroupModifier()
   * @generated
   */
  int          ABSTRACT_RUN_GROUP_MODIFIER                             = 4;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          ABSTRACT_RUN_GROUP_MODIFIER__ENABLED                    = 0;

  /**
   * The number of structural features of the '<em>Abstract Run Group Modifier</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          ABSTRACT_RUN_GROUP_MODIFIER_FEATURE_COUNT               = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.AlmIdImpl <em>Alm Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.AlmIdImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getAlmId()
   * @generated
   */
  int ALM_ID = 5;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALM_ID__DOMAIN = 0;

  /**
   * The feature id for the '<em><b>Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALM_ID__PROJECT = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALM_ID__ID = 2;

  /**
   * The number of structural features of the '<em>Alm Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALM_ID_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.ColumnImpl <em>Column</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.types.impl.ColumnImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getColumn()
   * @generated
   */
  int          COLUMN                                                  = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          COLUMN__NAME                                            = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          COLUMN__TYPE                                            = 1;

  /**
   * The feature id for the '<em><b>Key Order</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          COLUMN__KEY_ORDER                                       = 2;

  /**
   * The feature id for the '<em><b>Ignored</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          COLUMN__IGNORED                                         = 3;

  /**
   * The feature id for the '<em><b>Trim</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          COLUMN__TRIM                                            = 4;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          COLUMN_FEATURE_COUNT                                    = 5;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.CommentImpl <em>Comment</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.types.impl.CommentImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getComment()
   * @generated
   */
  int          COMMENT                                                 = 7;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          COMMENT_FEATURE_COUNT                                   = ABSTRACT_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.ComplexValueMapImpl <em>Complex Value Map</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.ComplexValueMapImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getComplexValueMap()
   * @generated
   */
  int          COMPLEX_VALUE_MAP                                       = 8;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int          COMPLEX_VALUE_MAP__SOURCE                               = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int          COMPLEX_VALUE_MAP__TARGET                               = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          COMPLEX_VALUE_MAP__ENABLED                              = 2;

  /**
   * The number of structural features of the '<em>Complex Value Map</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          COMPLEX_VALUE_MAP_FEATURE_COUNT                         = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.ComplexValuePairImpl <em>Complex Value Pair</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.ComplexValuePairImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getComplexValuePair()
   * @generated
   */
  int          COMPLEX_VALUE_PAIR                                      = 9;

  /**
   * The feature id for the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          COMPLEX_VALUE_PAIR__FIRST                               = 0;

  /**
   * The feature id for the '<em><b>Second</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int          COMPLEX_VALUE_PAIR__SECOND                              = 1;

  /**
   * The number of structural features of the '<em>Complex Value Pair</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          COMPLEX_VALUE_PAIR_FEATURE_COUNT                        = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.DataSetImpl <em>Data Set</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.types.impl.DataSetImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getDataSet()
   * @generated
   */
  int          DATA_SET                                                = 11;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.DataSetInstanceImpl <em>Data Set Instance</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.DataSetInstanceImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getDataSetInstance()
   * @generated
   */
  int          DATA_SET_INSTANCE                                       = 12;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.ResourceDefinitionImpl <em>Resource Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.ResourceDefinitionImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getResourceDefinition()
   * @generated
   */
  int          RESOURCE_DEFINITION                                     = 20;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          RESOURCE_DEFINITION__ENABLED                            = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          RESOURCE_DEFINITION__STATE                              = 1;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int          RESOURCE_DEFINITION__CONNECTOR_PREFERENCE               = 2;

  /**
   * The number of structural features of the '<em>Resource Definition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          RESOURCE_DEFINITION_FEATURE_COUNT                       = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.NamedResourceDefinitionImpl <em>Named Resource Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.NamedResourceDefinitionImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getNamedResourceDefinition()
   * @generated
   */
  int          NAMED_RESOURCE_DEFINITION                               = 19;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          NAMED_RESOURCE_DEFINITION__ENABLED                      = RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          NAMED_RESOURCE_DEFINITION__STATE                        = RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int          NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE         = RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          NAMED_RESOURCE_DEFINITION__NAME                         = RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Resource Definition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          NAMED_RESOURCE_DEFINITION_FEATURE_COUNT                 = RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.DatabaseResourceDefinitionImpl <em>Database Resource Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.DatabaseResourceDefinitionImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getDatabaseResourceDefinition()
   * @generated
   */
  int DATABASE_RESOURCE_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_RESOURCE_DEFINITION__ENABLED = NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_RESOURCE_DEFINITION__STATE = NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE = NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_RESOURCE_DEFINITION__NAME = NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_RESOURCE_DEFINITION__PERSISTENT = NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Database Resource Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT = NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          DATA_SET__COLUMNS                                       = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          DATA_SET__NAME                                          = 1;

  /**
   * The feature id for the '<em><b>Trim All</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          DATA_SET__TRIM_ALL                                      = 2;

  /**
   * The feature id for the '<em><b>Trim Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          DATA_SET__TRIM_COL_NAMES                                = 3;

  /**
   * The number of structural features of the '<em>Data Set</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          DATA_SET_FEATURE_COUNT                                  = 4;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int          DATA_SET_INSTANCE__ROWS                                 = 0;

  /**
   * The number of structural features of the '<em>Data Set Instance</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          DATA_SET_INSTANCE_FEATURE_COUNT                         = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.DataSetResourceDefinitionImpl <em>Data Set Resource Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.DataSetResourceDefinitionImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getDataSetResourceDefinition()
   * @generated
   */
  int          DATA_SET_RESOURCE_DEFINITION                            = 13;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          DATA_SET_RESOURCE_DEFINITION__ENABLED                   = NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          DATA_SET_RESOURCE_DEFINITION__STATE                     = NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int          DATA_SET_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE      = NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          DATA_SET_RESOURCE_DEFINITION__NAME                      = NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE           = NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int          DATA_SET_RESOURCE_DEFINITION__DATA_SET                  = NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          DATA_SET_RESOURCE_DEFINITION__HAS_COL_NAMES             = NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Set Resource Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT              = NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.DeviceResourceDefinitionImpl <em>Device Resource Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.DeviceResourceDefinitionImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getDeviceResourceDefinition()
   * @generated
   */
  int          DEVICE_RESOURCE_DEFINITION                              = 14;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          DEVICE_RESOURCE_DEFINITION__ENABLED                     = NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          DEVICE_RESOURCE_DEFINITION__STATE                       = NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int          DEVICE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE        = NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          DEVICE_RESOURCE_DEFINITION__NAME                        = NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Initialize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          DEVICE_RESOURCE_DEFINITION__INITIALIZE                  = NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Inline</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          DEVICE_RESOURCE_DEFINITION__IS_INLINE                   = NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Device Resource Definition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT                = NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.EmptyImpl <em>Empty</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.types.impl.EmptyImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getEmpty()
   * @generated
   */
  int          EMPTY                                                   = 15;

  /**
   * The number of structural features of the '<em>Empty</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          EMPTY_FEATURE_COUNT                                     = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.InlineDeviceResourceDefinitionImpl <em>Inline Device Resource Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.InlineDeviceResourceDefinitionImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getInlineDeviceResourceDefinition()
   * @generated
   */
  int          INLINE_DEVICE_RESOURCE_DEFINITION                       = 16;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          INLINE_DEVICE_RESOURCE_DEFINITION__ENABLED              = DEVICE_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          INLINE_DEVICE_RESOURCE_DEFINITION__STATE                = DEVICE_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int          INLINE_DEVICE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE = DEVICE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          INLINE_DEVICE_RESOURCE_DEFINITION__NAME                 = DEVICE_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Initialize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          INLINE_DEVICE_RESOURCE_DEFINITION__INITIALIZE           = DEVICE_RESOURCE_DEFINITION__INITIALIZE;

  /**
   * The feature id for the '<em><b>Is Inline</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          INLINE_DEVICE_RESOURCE_DEFINITION__IS_INLINE            = DEVICE_RESOURCE_DEFINITION__IS_INLINE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          INLINE_DEVICE_RESOURCE_DEFINITION__VALUE                = DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Inline Device Resource Definition</em>' class.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          INLINE_DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT         = DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.InlineNamespaceUriDefinitionImpl <em>Inline Namespace Uri Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.InlineNamespaceUriDefinitionImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getInlineNamespaceUriDefinition()
   * @generated
   */
  int          INLINE_NAMESPACE_URI_DEFINITION                         = 17;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          INLINE_NAMESPACE_URI_DEFINITION__ENABLED                = DEVICE_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          INLINE_NAMESPACE_URI_DEFINITION__STATE                  = DEVICE_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int          INLINE_NAMESPACE_URI_DEFINITION__CONNECTOR_PREFERENCE   = DEVICE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          INLINE_NAMESPACE_URI_DEFINITION__NAME                   = DEVICE_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Initialize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          INLINE_NAMESPACE_URI_DEFINITION__INITIALIZE             = DEVICE_RESOURCE_DEFINITION__INITIALIZE;

  /**
   * The feature id for the '<em><b>Is Inline</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          INLINE_NAMESPACE_URI_DEFINITION__IS_INLINE              = DEVICE_RESOURCE_DEFINITION__IS_INLINE;

  /**
   * The feature id for the '<em><b>Uri Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          INLINE_NAMESPACE_URI_DEFINITION__URI_DEFINITIONS        = DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Inline Namespace Uri Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          INLINE_NAMESPACE_URI_DEFINITION_FEATURE_COUNT           = DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.KronusResourceImpl <em>Kronus Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.KronusResourceImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getKronusResource()
   * @generated
   */
  int KRONUS_RESOURCE = 18;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_RESOURCE__ENABLED = NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_RESOURCE__STATE = NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_RESOURCE__CONNECTOR_PREFERENCE = NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_RESOURCE__NAME = NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Kronus Call Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_RESOURCE__KRONUS_CALL_CONFIGURATION = NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Kronus Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_RESOURCE_FEATURE_COUNT = NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.RowInstanceImpl <em>Row Instance</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.RowInstanceImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getRowInstance()
   * @generated
   */
  int          ROW_INSTANCE                                            = 21;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          ROW_INSTANCE__COLUMNS                                   = 0;

  /**
   * The number of structural features of the '<em>Row Instance</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int          ROW_INSTANCE_FEATURE_COUNT                              = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.XmlNamespaceDefinitionImpl <em>Xml Namespace Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.XmlNamespaceDefinitionImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getXmlNamespaceDefinition()
   * @generated
   */
  int          XML_NAMESPACE_DEFINITION                                = 22;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          XML_NAMESPACE_DEFINITION__ENABLED                       = DATA_SET_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          XML_NAMESPACE_DEFINITION__STATE                         = DATA_SET_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int          XML_NAMESPACE_DEFINITION__CONNECTOR_PREFERENCE          = DATA_SET_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          XML_NAMESPACE_DEFINITION__NAME                          = DATA_SET_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          XML_NAMESPACE_DEFINITION__DEVICE_RESOURCE               = DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int          XML_NAMESPACE_DEFINITION__DATA_SET                      = DATA_SET_RESOURCE_DEFINITION__DATA_SET;

  /**
   * The feature id for the '<em><b>Has Col Names</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          XML_NAMESPACE_DEFINITION__HAS_COL_NAMES                 = DATA_SET_RESOURCE_DEFINITION__HAS_COL_NAMES;

  /**
   * The number of structural features of the '<em>Xml Namespace Definition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          XML_NAMESPACE_DEFINITION_FEATURE_COUNT                  = DATA_SET_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.impl.XmlUriDefinitionImpl <em>Xml Uri Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.impl.XmlUriDefinitionImpl
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getXmlUriDefinition()
   * @generated
   */
  int          XML_URI_DEFINITION                                      = 23;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int          XML_URI_DEFINITION__PREFIX                              = 0;

  /**
   * The feature id for the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          XML_URI_DEFINITION__URI                                 = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int          XML_URI_DEFINITION__ENABLED                             = 2;

  /**
   * The number of structural features of the '<em>Xml Uri Definition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int          XML_URI_DEFINITION_FEATURE_COUNT                        = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.ColumnTrimEnum <em>Column Trim Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.ColumnTrimEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getColumnTrimEnum()
   * @generated
   */
  int          COLUMN_TRIM_ENUM                                        = 24;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.ColumnTypeEnum <em>Column Type Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.ColumnTypeEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getColumnTypeEnum()
   * @generated
   */
  int          COLUMN_TYPE_ENUM                                        = 25;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.InterpretersEnum <em>Interpreters Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.InterpretersEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getInterpretersEnum()
   * @generated
   */
  int          INTERPRETERS_ENUM                                       = 26;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.ModulesEnum <em>Modules Enum</em>}' enum. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.types.ModulesEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getModulesEnum()
   * @generated
   */
  int          MODULES_ENUM                                            = 27;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.RepetitionActionsEnum <em>Repetition Actions Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.RepetitionActionsEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getRepetitionActionsEnum()
   * @generated
   */
  int          REPETITION_ACTIONS_ENUM                                 = 28;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.ResourcesEnum <em>Resources Enum</em>}' enum. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.types.ResourcesEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getResourcesEnum()
   * @generated
   */
  int          RESOURCES_ENUM                                          = 29;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.SaturnStatusConditionEnum <em>Saturn Status Condition Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.SaturnStatusConditionEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getSaturnStatusConditionEnum()
   * @generated
   */
  int          SATURN_STATUS_CONDITION_ENUM                            = 30;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.types.SaturnStatusEnum <em>Saturn Status Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.SaturnStatusEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getSaturnStatusEnum()
   * @generated
   */
  int          SATURN_STATUS_ENUM                                      = 31;

  /**
   * The meta object id for the '<em>Column Trim Enum Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see com.ms.qaTools.saturn.types.ColumnTrimEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getColumnTrimEnumObject()
   * @generated
   */
  int          COLUMN_TRIM_ENUM_OBJECT                                 = 32;

  /**
   * The meta object id for the '<em>Column Type Enum Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see com.ms.qaTools.saturn.types.ColumnTypeEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getColumnTypeEnumObject()
   * @generated
   */
  int          COLUMN_TYPE_ENUM_OBJECT                                 = 33;

  /**
   * The meta object id for the '<em>Interpreters Enum Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see com.ms.qaTools.saturn.types.InterpretersEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getInterpretersEnumObject()
   * @generated
   */
  int          INTERPRETERS_ENUM_OBJECT                                = 34;

  /**
   * The meta object id for the '<em>Modules Enum Object</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.types.ModulesEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getModulesEnumObject()
   * @generated
   */
  int          MODULES_ENUM_OBJECT                                     = 35;

  /**
   * The meta object id for the '<em>Object Id</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getObjectId()
   * @generated
   */
  int          OBJECT_ID                                               = 36;

  /**
   * The meta object id for the '<em>Object Name</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getObjectName()
   * @generated
   */
  int          OBJECT_NAME                                             = 37;

  /**
   * The meta object id for the '<em>Repetition Actions Enum Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.types.RepetitionActionsEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getRepetitionActionsEnumObject()
   * @generated
   */
  int          REPETITION_ACTIONS_ENUM_OBJECT                          = 38;

  /**
   * The meta object id for the '<em>Resources Enum Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see com.ms.qaTools.saturn.types.ResourcesEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getResourcesEnumObject()
   * @generated
   */
  int          RESOURCES_ENUM_OBJECT                                   = 39;

  /**
   * The meta object id for the '<em>Saturn Status Condition Enum Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.types.SaturnStatusConditionEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getSaturnStatusConditionEnumObject()
   * @generated
   */
  int          SATURN_STATUS_CONDITION_ENUM_OBJECT                     = 40;

  /**
   * The meta object id for the '<em>Saturn Status Enum Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.types.SaturnStatusEnum
   * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getSaturnStatusEnumObject()
   * @generated
   */
  int          SATURN_STATUS_ENUM_OBJECT                               = 41;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.AbstractAnnotation <em>Abstract Annotation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Annotation</em>'.
   * @see com.ms.qaTools.saturn.types.AbstractAnnotation
   * @generated
   */
  EClass getAbstractAnnotation();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.AbstractBatchListener <em>Abstract Batch Listener</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Batch Listener</em>'.
   * @see com.ms.qaTools.saturn.types.AbstractBatchListener
   * @generated
   */
  EClass getAbstractBatchListener();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.AbstractListener <em>Abstract Listener</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Listener</em>'.
   * @see com.ms.qaTools.saturn.types.AbstractListener
   * @generated
   */
  EClass getAbstractListener();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.AbstractListener#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.types.AbstractListener#isEnabled()
   * @see #getAbstractListener()
   * @generated
   */
  EAttribute getAbstractListener_Enabled();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.AbstractListener#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.types.AbstractListener#getName()
   * @see #getAbstractListener()
   * @generated
   */
  EAttribute getAbstractListener_Name();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler <em>Abstract Repetition Handler</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Repetition Handler</em>'.
   * @see com.ms.qaTools.saturn.types.AbstractRepetitionHandler
   * @generated
   */
  EClass getAbstractRepetitionHandler();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler#getDefaultStatus <em>Default Status</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Default Status</em>'.
   * @see com.ms.qaTools.saturn.types.AbstractRepetitionHandler#getDefaultStatus()
   * @see #getAbstractRepetitionHandler()
   * @generated
   */
  EAttribute getAbstractRepetitionHandler_DefaultStatus();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.types.AbstractRepetitionHandler#isEnabled()
   * @see #getAbstractRepetitionHandler()
   * @generated
   */
  EAttribute getAbstractRepetitionHandler_Enabled();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler#getStatusCondition <em>Status Condition</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Status Condition</em>'.
   * @see com.ms.qaTools.saturn.types.AbstractRepetitionHandler#getStatusCondition()
   * @see #getAbstractRepetitionHandler()
   * @generated
   */
  EAttribute getAbstractRepetitionHandler_StatusCondition();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.AbstractRunGroupModifier <em>Abstract Run Group Modifier</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Run Group Modifier</em>'.
   * @see com.ms.qaTools.saturn.types.AbstractRunGroupModifier
   * @generated
   */
  EClass getAbstractRunGroupModifier();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.AbstractRunGroupModifier#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.types.AbstractRunGroupModifier#isEnabled()
   * @see #getAbstractRunGroupModifier()
   * @generated
   */
  EAttribute getAbstractRunGroupModifier_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.AlmId <em>Alm Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alm Id</em>'.
   * @see com.ms.qaTools.saturn.types.AlmId
   * @generated
   */
  EClass getAlmId();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.types.AlmId#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see com.ms.qaTools.saturn.types.AlmId#getDomain()
   * @see #getAlmId()
   * @generated
   */
  EReference getAlmId_Domain();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.types.AlmId#getProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Project</em>'.
   * @see com.ms.qaTools.saturn.types.AlmId#getProject()
   * @see #getAlmId()
   * @generated
   */
  EReference getAlmId_Project();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.types.AlmId#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see com.ms.qaTools.saturn.types.AlmId#getId()
   * @see #getAlmId()
   * @generated
   */
  EReference getAlmId_Id();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.Column <em>Column</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see com.ms.qaTools.saturn.types.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.Column#isIgnored <em>Ignored</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ignored</em>'.
   * @see com.ms.qaTools.saturn.types.Column#isIgnored()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Ignored();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.Column#getKeyOrder <em>Key Order</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key Order</em>'.
   * @see com.ms.qaTools.saturn.types.Column#getKeyOrder()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_KeyOrder();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.Column#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.types.Column#getName()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.Column#getTrim <em>Trim</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Trim</em>'.
   * @see com.ms.qaTools.saturn.types.Column#getTrim()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Trim();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.Column#getType <em>Type</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.ms.qaTools.saturn.types.Column#getType()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Type();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.Comment <em>Comment</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Comment</em>'.
   * @see com.ms.qaTools.saturn.types.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.ComplexValueMap <em>Complex Value Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Value Map</em>'.
   * @see com.ms.qaTools.saturn.types.ComplexValueMap
   * @generated
   */
  EClass getComplexValueMap();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.types.ComplexValueMap#getSource <em>Source</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.ms.qaTools.saturn.types.ComplexValueMap#getSource()
   * @see #getComplexValueMap()
   * @generated
   */
  EReference getComplexValueMap_Source();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.types.ComplexValueMap#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see com.ms.qaTools.saturn.types.ComplexValueMap#getTarget()
   * @see #getComplexValueMap()
   * @generated
   */
  EReference getComplexValueMap_Target();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.ComplexValueMap#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.types.ComplexValueMap#isEnabled()
   * @see #getComplexValueMap()
   * @generated
   */
  EAttribute getComplexValueMap_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.ComplexValuePair <em>Complex Value Pair</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Value Pair</em>'.
   * @see com.ms.qaTools.saturn.types.ComplexValuePair
   * @generated
   */
  EClass getComplexValuePair();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.types.ComplexValuePair#getFirst <em>First</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>First</em>'.
   * @see com.ms.qaTools.saturn.types.ComplexValuePair#getFirst()
   * @see #getComplexValuePair()
   * @generated
   */
  EReference getComplexValuePair_First();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.types.ComplexValuePair#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Second</em>'.
   * @see com.ms.qaTools.saturn.types.ComplexValuePair#getSecond()
   * @see #getComplexValuePair()
   * @generated
   */
  EReference getComplexValuePair_Second();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.DatabaseResourceDefinition <em>Database Resource Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Resource Definition</em>'.
   * @see com.ms.qaTools.saturn.types.DatabaseResourceDefinition
   * @generated
   */
  EClass getDatabaseResourceDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.DatabaseResourceDefinition#isPersistent <em>Persistent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Persistent</em>'.
   * @see com.ms.qaTools.saturn.types.DatabaseResourceDefinition#isPersistent()
   * @see #getDatabaseResourceDefinition()
   * @generated
   */
  EAttribute getDatabaseResourceDefinition_Persistent();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.DataSet <em>Data Set</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Data Set</em>'.
   * @see com.ms.qaTools.saturn.types.DataSet
   * @generated
   */
  EClass getDataSet();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.types.DataSet#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see com.ms.qaTools.saturn.types.DataSet#getColumns()
   * @see #getDataSet()
   * @generated
   */
  EReference getDataSet_Columns();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.DataSet#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.types.DataSet#getName()
   * @see #getDataSet()
   * @generated
   */
  EAttribute getDataSet_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.DataSet#getTrimAll <em>Trim All</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Trim All</em>'.
   * @see com.ms.qaTools.saturn.types.DataSet#getTrimAll()
   * @see #getDataSet()
   * @generated
   */
  EAttribute getDataSet_TrimAll();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.DataSet#isTrimColNames <em>Trim Col Names</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Trim Col Names</em>'.
   * @see com.ms.qaTools.saturn.types.DataSet#isTrimColNames()
   * @see #getDataSet()
   * @generated
   */
  EAttribute getDataSet_TrimColNames();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.DataSetInstance <em>Data Set Instance</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Set Instance</em>'.
   * @see com.ms.qaTools.saturn.types.DataSetInstance
   * @generated
   */
  EClass getDataSetInstance();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.types.DataSetInstance#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rows</em>'.
   * @see com.ms.qaTools.saturn.types.DataSetInstance#getRows()
   * @see #getDataSetInstance()
   * @generated
   */
  EReference getDataSetInstance_Rows();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.DataSetResourceDefinition <em>Data Set Resource Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Set Resource Definition</em>'.
   * @see com.ms.qaTools.saturn.types.DataSetResourceDefinition
   * @generated
   */
  EClass getDataSetResourceDefinition();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.types.DataSetResourceDefinition#getDeviceResource <em>Device Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Device Resource</em>'.
   * @see com.ms.qaTools.saturn.types.DataSetResourceDefinition#getDeviceResource()
   * @see #getDataSetResourceDefinition()
   * @generated
   */
  EReference getDataSetResourceDefinition_DeviceResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.types.DataSetResourceDefinition#getDataSet <em>Data Set</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Set</em>'.
   * @see com.ms.qaTools.saturn.types.DataSetResourceDefinition#getDataSet()
   * @see #getDataSetResourceDefinition()
   * @generated
   */
  EReference getDataSetResourceDefinition_DataSet();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.types.DataSetResourceDefinition#isHasColNames <em>Has Col Names</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Has Col Names</em>'.
   * @see com.ms.qaTools.saturn.types.DataSetResourceDefinition#isHasColNames()
   * @see #getDataSetResourceDefinition()
   * @generated
   */
  EAttribute getDataSetResourceDefinition_HasColNames();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.DeviceResourceDefinition <em>Device Resource Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Device Resource Definition</em>'.
   * @see com.ms.qaTools.saturn.types.DeviceResourceDefinition
   * @generated
   */
  EClass getDeviceResourceDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.DeviceResourceDefinition#isInitialize <em>Initialize</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initialize</em>'.
   * @see com.ms.qaTools.saturn.types.DeviceResourceDefinition#isInitialize()
   * @see #getDeviceResourceDefinition()
   * @generated
   */
  EAttribute getDeviceResourceDefinition_Initialize();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.DeviceResourceDefinition#isIsInline <em>Is Inline</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Inline</em>'.
   * @see com.ms.qaTools.saturn.types.DeviceResourceDefinition#isIsInline()
   * @see #getDeviceResourceDefinition()
   * @generated
   */
  EAttribute getDeviceResourceDefinition_IsInline();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.Empty <em>Empty</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty</em>'.
   * @see com.ms.qaTools.saturn.types.Empty
   * @generated
   */
  EClass getEmpty();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.InlineDeviceResourceDefinition <em>Inline Device Resource Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Inline Device Resource Definition</em>'.
   * @see com.ms.qaTools.saturn.types.InlineDeviceResourceDefinition
   * @generated
   */
  EClass getInlineDeviceResourceDefinition();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.types.InlineDeviceResourceDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.types.InlineDeviceResourceDefinition#getValue()
   * @see #getInlineDeviceResourceDefinition()
   * @generated
   */
  EReference getInlineDeviceResourceDefinition_Value();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.InlineNamespaceUriDefinition <em>Inline Namespace Uri Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Inline Namespace Uri Definition</em>'.
   * @see com.ms.qaTools.saturn.types.InlineNamespaceUriDefinition
   * @generated
   */
  EClass getInlineNamespaceUriDefinition();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.types.InlineNamespaceUriDefinition#getUriDefinitions <em>Uri Definitions</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Uri Definitions</em>'.
   * @see com.ms.qaTools.saturn.types.InlineNamespaceUriDefinition#getUriDefinitions()
   * @see #getInlineNamespaceUriDefinition()
   * @generated
   */
  EReference getInlineNamespaceUriDefinition_UriDefinitions();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.KronusResource <em>Kronus Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kronus Resource</em>'.
   * @see com.ms.qaTools.saturn.types.KronusResource
   * @generated
   */
  EClass getKronusResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.types.KronusResource#getKronusCallConfiguration <em>Kronus Call Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kronus Call Configuration</em>'.
   * @see com.ms.qaTools.saturn.types.KronusResource#getKronusCallConfiguration()
   * @see #getKronusResource()
   * @generated
   */
  EReference getKronusResource_KronusCallConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.NamedResourceDefinition <em>Named Resource Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Resource Definition</em>'.
   * @see com.ms.qaTools.saturn.types.NamedResourceDefinition
   * @generated
   */
  EClass getNamedResourceDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.NamedResourceDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.types.NamedResourceDefinition#getName()
   * @see #getNamedResourceDefinition()
   * @generated
   */
  EAttribute getNamedResourceDefinition_Name();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.ResourceDefinition <em>Resource Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Definition</em>'.
   * @see com.ms.qaTools.saturn.types.ResourceDefinition
   * @generated
   */
  EClass getResourceDefinition();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.types.ResourceDefinition#getConnectorPreference <em>Connector Preference</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Connector Preference</em>'.
   * @see com.ms.qaTools.saturn.types.ResourceDefinition#getConnectorPreference()
   * @see #getResourceDefinition()
   * @generated
   */
  EAttribute getResourceDefinition_ConnectorPreference();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.ResourceDefinition#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.types.ResourceDefinition#isEnabled()
   * @see #getResourceDefinition()
   * @generated
   */
  EAttribute getResourceDefinition_Enabled();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.ResourceDefinition#getState <em>State</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State</em>'.
   * @see com.ms.qaTools.saturn.types.ResourceDefinition#getState()
   * @see #getResourceDefinition()
   * @generated
   */
  EAttribute getResourceDefinition_State();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.RowInstance <em>Row Instance</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Row Instance</em>'.
   * @see com.ms.qaTools.saturn.types.RowInstance
   * @generated
   */
  EClass getRowInstance();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.types.RowInstance#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see com.ms.qaTools.saturn.types.RowInstance#getColumns()
   * @see #getRowInstance()
   * @generated
   */
  EReference getRowInstance_Columns();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.XmlNamespaceDefinition <em>Xml Namespace Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Namespace Definition</em>'.
   * @see com.ms.qaTools.saturn.types.XmlNamespaceDefinition
   * @generated
   */
  EClass getXmlNamespaceDefinition();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.types.XmlUriDefinition <em>Xml Uri Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Uri Definition</em>'.
   * @see com.ms.qaTools.saturn.types.XmlUriDefinition
   * @generated
   */
  EClass getXmlUriDefinition();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.types.XmlUriDefinition#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Prefix</em>'.
   * @see com.ms.qaTools.saturn.types.XmlUriDefinition#getPrefix()
   * @see #getXmlUriDefinition()
   * @generated
   */
  EReference getXmlUriDefinition_Prefix();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.types.XmlUriDefinition#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uri</em>'.
   * @see com.ms.qaTools.saturn.types.XmlUriDefinition#getUri()
   * @see #getXmlUriDefinition()
   * @generated
   */
  EReference getXmlUriDefinition_Uri();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.types.XmlUriDefinition#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.types.XmlUriDefinition#isEnabled()
   * @see #getXmlUriDefinition()
   * @generated
   */
  EAttribute getXmlUriDefinition_Enabled();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.types.ColumnTrimEnum <em>Column Trim Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Column Trim Enum</em>'.
   * @see com.ms.qaTools.saturn.types.ColumnTrimEnum
   * @generated
   */
  EEnum getColumnTrimEnum();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.types.ColumnTypeEnum <em>Column Type Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Column Type Enum</em>'.
   * @see com.ms.qaTools.saturn.types.ColumnTypeEnum
   * @generated
   */
  EEnum getColumnTypeEnum();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.types.InterpretersEnum <em>Interpreters Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Interpreters Enum</em>'.
   * @see com.ms.qaTools.saturn.types.InterpretersEnum
   * @generated
   */
  EEnum getInterpretersEnum();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.types.ModulesEnum <em>Modules Enum</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for enum '<em>Modules Enum</em>'.
   * @see com.ms.qaTools.saturn.types.ModulesEnum
   * @generated
   */
  EEnum getModulesEnum();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.types.RepetitionActionsEnum <em>Repetition Actions Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Repetition Actions Enum</em>'.
   * @see com.ms.qaTools.saturn.types.RepetitionActionsEnum
   * @generated
   */
  EEnum getRepetitionActionsEnum();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.types.ResourcesEnum <em>Resources Enum</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for enum '<em>Resources Enum</em>'.
   * @see com.ms.qaTools.saturn.types.ResourcesEnum
   * @generated
   */
  EEnum getResourcesEnum();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.types.SaturnStatusConditionEnum <em>Saturn Status Condition Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Saturn Status Condition Enum</em>'.
   * @see com.ms.qaTools.saturn.types.SaturnStatusConditionEnum
   * @generated
   */
  EEnum getSaturnStatusConditionEnum();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.types.SaturnStatusEnum <em>Saturn Status Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Saturn Status Enum</em>'.
   * @see com.ms.qaTools.saturn.types.SaturnStatusEnum
   * @generated
   */
  EEnum getSaturnStatusEnum();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.types.ColumnTrimEnum <em>Column Trim Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Column Trim Enum Object</em>'.
   * @see com.ms.qaTools.saturn.types.ColumnTrimEnum
   * @model instanceClass="com.ms.qaTools.saturn.types.ColumnTrimEnum"
   *        extendedMetaData="name='ColumnTrimEnum:Object' baseType='ColumnTrimEnum'"
   * @generated
   */
  EDataType getColumnTrimEnumObject();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.types.ColumnTypeEnum <em>Column Type Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Column Type Enum Object</em>'.
   * @see com.ms.qaTools.saturn.types.ColumnTypeEnum
   * @model instanceClass="com.ms.qaTools.saturn.types.ColumnTypeEnum"
   *        extendedMetaData="name='ColumnTypeEnum:Object' baseType='ColumnTypeEnum'"
   * @generated
   */
  EDataType getColumnTypeEnumObject();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.types.InterpretersEnum <em>Interpreters Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Interpreters Enum Object</em>'.
   * @see com.ms.qaTools.saturn.types.InterpretersEnum
   * @model instanceClass="com.ms.qaTools.saturn.types.InterpretersEnum"
   *        extendedMetaData="name='InterpretersEnum:Object' baseType='InterpretersEnum'"
   * @generated
   */
  EDataType getInterpretersEnumObject();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.types.ModulesEnum <em>Modules Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Modules Enum Object</em>'.
   * @see com.ms.qaTools.saturn.types.ModulesEnum
   * @model instanceClass="com.ms.qaTools.saturn.types.ModulesEnum"
   *        extendedMetaData="name='ModulesEnum:Object' baseType='ModulesEnum'"
   * @generated
   */
  EDataType getModulesEnumObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Object Id</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for data type '<em>Object Id</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='ObjectId' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Za-z0-9_]*'"
   * @generated
   */
  EDataType getObjectId();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Object Name</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for data type '<em>Object Name</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='ObjectName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Za-z0-9_]*'"
   * @generated
   */
  EDataType getObjectName();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.types.RepetitionActionsEnum <em>Repetition Actions Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Repetition Actions Enum Object</em>'.
   * @see com.ms.qaTools.saturn.types.RepetitionActionsEnum
   * @model instanceClass="com.ms.qaTools.saturn.types.RepetitionActionsEnum"
   *        extendedMetaData="name='RepetitionActionsEnum:Object' baseType='RepetitionActionsEnum'"
   * @generated
   */
  EDataType getRepetitionActionsEnumObject();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.types.ResourcesEnum <em>Resources Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Resources Enum Object</em>'.
   * @see com.ms.qaTools.saturn.types.ResourcesEnum
   * @model instanceClass="com.ms.qaTools.saturn.types.ResourcesEnum"
   *        extendedMetaData="name='ResourcesEnum:Object' baseType='ResourcesEnum'"
   * @generated
   */
  EDataType getResourcesEnumObject();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.types.SaturnStatusConditionEnum <em>Saturn Status Condition Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Saturn Status Condition Enum Object</em>'.
   * @see com.ms.qaTools.saturn.types.SaturnStatusConditionEnum
   * @model instanceClass="com.ms.qaTools.saturn.types.SaturnStatusConditionEnum"
   *        extendedMetaData="name='SaturnStatusConditionEnum:Object' baseType='SaturnStatusConditionEnum'"
   * @generated
   */
  EDataType getSaturnStatusConditionEnumObject();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.types.SaturnStatusEnum <em>Saturn Status Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Saturn Status Enum Object</em>'.
   * @see com.ms.qaTools.saturn.types.SaturnStatusEnum
   * @model instanceClass="com.ms.qaTools.saturn.types.SaturnStatusEnum"
   *        extendedMetaData="name='SaturnStatusEnum:Object' baseType='SaturnStatusEnum'"
   * @generated
   */
  EDataType getSaturnStatusEnumObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TypesFactory getTypesFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.AbstractAnnotationImpl <em>Abstract Annotation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.AbstractAnnotationImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getAbstractAnnotation()
     * @generated
     */
    EClass     ABSTRACT_ANNOTATION                              = eINSTANCE.getAbstractAnnotation();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.AbstractBatchListenerImpl <em>Abstract Batch Listener</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.AbstractBatchListenerImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getAbstractBatchListener()
     * @generated
     */
    EClass     ABSTRACT_BATCH_LISTENER                          = eINSTANCE.getAbstractBatchListener();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.AbstractListenerImpl <em>Abstract Listener</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.AbstractListenerImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getAbstractListener()
     * @generated
     */
    EClass     ABSTRACT_LISTENER                                = eINSTANCE.getAbstractListener();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_LISTENER__ENABLED                       = eINSTANCE.getAbstractListener_Enabled();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_LISTENER__NAME                          = eINSTANCE.getAbstractListener_Name();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.AbstractRepetitionHandlerImpl <em>Abstract Repetition Handler</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.AbstractRepetitionHandlerImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getAbstractRepetitionHandler()
     * @generated
     */
    EClass     ABSTRACT_REPETITION_HANDLER                      = eINSTANCE.getAbstractRepetitionHandler();

    /**
     * The meta object literal for the '<em><b>Default Status</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_REPETITION_HANDLER__DEFAULT_STATUS      = eINSTANCE.getAbstractRepetitionHandler_DefaultStatus();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_REPETITION_HANDLER__ENABLED             = eINSTANCE.getAbstractRepetitionHandler_Enabled();

    /**
     * The meta object literal for the '<em><b>Status Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_REPETITION_HANDLER__STATUS_CONDITION    = eINSTANCE.getAbstractRepetitionHandler_StatusCondition();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.AbstractRunGroupModifierImpl <em>Abstract Run Group Modifier</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.AbstractRunGroupModifierImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getAbstractRunGroupModifier()
     * @generated
     */
    EClass     ABSTRACT_RUN_GROUP_MODIFIER                      = eINSTANCE.getAbstractRunGroupModifier();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_RUN_GROUP_MODIFIER__ENABLED             = eINSTANCE.getAbstractRunGroupModifier_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.AlmIdImpl <em>Alm Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.AlmIdImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getAlmId()
     * @generated
     */
    EClass ALM_ID = eINSTANCE.getAlmId();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALM_ID__DOMAIN = eINSTANCE.getAlmId_Domain();

    /**
     * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALM_ID__PROJECT = eINSTANCE.getAlmId_Project();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALM_ID__ID = eINSTANCE.getAlmId_Id();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.ColumnImpl <em>Column</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.types.impl.ColumnImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getColumn()
     * @generated
     */
    EClass     COLUMN                                           = eINSTANCE.getColumn();

    /**
     * The meta object literal for the '<em><b>Ignored</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__IGNORED                                  = eINSTANCE.getColumn_Ignored();

    /**
     * The meta object literal for the '<em><b>Key Order</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__KEY_ORDER                                = eINSTANCE.getColumn_KeyOrder();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__NAME                                     = eINSTANCE.getColumn_Name();

    /**
     * The meta object literal for the '<em><b>Trim</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__TRIM                                     = eINSTANCE.getColumn_Trim();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__TYPE                                     = eINSTANCE.getColumn_Type();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.CommentImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getComment()
     * @generated
     */
    EClass     COMMENT                                          = eINSTANCE.getComment();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.ComplexValueMapImpl <em>Complex Value Map</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.ComplexValueMapImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getComplexValueMap()
     * @generated
     */
    EClass     COMPLEX_VALUE_MAP                                = eINSTANCE.getComplexValueMap();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE_MAP__SOURCE                        = eINSTANCE.getComplexValueMap_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE_MAP__TARGET                        = eINSTANCE.getComplexValueMap_Target();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_VALUE_MAP__ENABLED                       = eINSTANCE.getComplexValueMap_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.ComplexValuePairImpl <em>Complex Value Pair</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.ComplexValuePairImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getComplexValuePair()
     * @generated
     */
    EClass     COMPLEX_VALUE_PAIR                               = eINSTANCE.getComplexValuePair();

    /**
     * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE_PAIR__FIRST                        = eINSTANCE.getComplexValuePair_First();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE_PAIR__SECOND                       = eINSTANCE.getComplexValuePair_Second();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.DatabaseResourceDefinitionImpl <em>Database Resource Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.DatabaseResourceDefinitionImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getDatabaseResourceDefinition()
     * @generated
     */
    EClass DATABASE_RESOURCE_DEFINITION = eINSTANCE.getDatabaseResourceDefinition();

    /**
     * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_RESOURCE_DEFINITION__PERSISTENT = eINSTANCE.getDatabaseResourceDefinition_Persistent();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.DataSetImpl <em>Data Set</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.DataSetImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getDataSet()
     * @generated
     */
    EClass     DATA_SET                                         = eINSTANCE.getDataSet();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SET__COLUMNS                                = eINSTANCE.getDataSet_Columns();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DATA_SET__NAME                                   = eINSTANCE.getDataSet_Name();

    /**
     * The meta object literal for the '<em><b>Trim All</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DATA_SET__TRIM_ALL                               = eINSTANCE.getDataSet_TrimAll();

    /**
     * The meta object literal for the '<em><b>Trim Col Names</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DATA_SET__TRIM_COL_NAMES                         = eINSTANCE.getDataSet_TrimColNames();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.DataSetInstanceImpl <em>Data Set Instance</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.DataSetInstanceImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getDataSetInstance()
     * @generated
     */
    EClass     DATA_SET_INSTANCE                                = eINSTANCE.getDataSetInstance();

    /**
     * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SET_INSTANCE__ROWS                          = eINSTANCE.getDataSetInstance_Rows();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.DataSetResourceDefinitionImpl <em>Data Set Resource Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.DataSetResourceDefinitionImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getDataSetResourceDefinition()
     * @generated
     */
    EClass     DATA_SET_RESOURCE_DEFINITION                     = eINSTANCE.getDataSetResourceDefinition();

    /**
     * The meta object literal for the '<em><b>Device Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE    = eINSTANCE.getDataSetResourceDefinition_DeviceResource();

    /**
     * The meta object literal for the '<em><b>Data Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SET_RESOURCE_DEFINITION__DATA_SET           = eINSTANCE.getDataSetResourceDefinition_DataSet();

    /**
     * The meta object literal for the '<em><b>Has Col Names</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DATA_SET_RESOURCE_DEFINITION__HAS_COL_NAMES      = eINSTANCE.getDataSetResourceDefinition_HasColNames();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.DeviceResourceDefinitionImpl <em>Device Resource Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.DeviceResourceDefinitionImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getDeviceResourceDefinition()
     * @generated
     */
    EClass     DEVICE_RESOURCE_DEFINITION                       = eINSTANCE.getDeviceResourceDefinition();

    /**
     * The meta object literal for the '<em><b>Initialize</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_RESOURCE_DEFINITION__INITIALIZE           = eINSTANCE.getDeviceResourceDefinition_Initialize();

    /**
     * The meta object literal for the '<em><b>Is Inline</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_RESOURCE_DEFINITION__IS_INLINE            = eINSTANCE.getDeviceResourceDefinition_IsInline();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.EmptyImpl <em>Empty</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.types.impl.EmptyImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getEmpty()
     * @generated
     */
    EClass     EMPTY                                            = eINSTANCE.getEmpty();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.InlineDeviceResourceDefinitionImpl <em>Inline Device Resource Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.InlineDeviceResourceDefinitionImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getInlineDeviceResourceDefinition()
     * @generated
     */
    EClass     INLINE_DEVICE_RESOURCE_DEFINITION                = eINSTANCE.getInlineDeviceResourceDefinition();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INLINE_DEVICE_RESOURCE_DEFINITION__VALUE         = eINSTANCE.getInlineDeviceResourceDefinition_Value();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.InlineNamespaceUriDefinitionImpl <em>Inline Namespace Uri Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.InlineNamespaceUriDefinitionImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getInlineNamespaceUriDefinition()
     * @generated
     */
    EClass     INLINE_NAMESPACE_URI_DEFINITION                  = eINSTANCE.getInlineNamespaceUriDefinition();

    /**
     * The meta object literal for the '<em><b>Uri Definitions</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference INLINE_NAMESPACE_URI_DEFINITION__URI_DEFINITIONS = eINSTANCE.getInlineNamespaceUriDefinition_UriDefinitions();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.KronusResourceImpl <em>Kronus Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.KronusResourceImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getKronusResource()
     * @generated
     */
    EClass KRONUS_RESOURCE = eINSTANCE.getKronusResource();

    /**
     * The meta object literal for the '<em><b>Kronus Call Configuration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KRONUS_RESOURCE__KRONUS_CALL_CONFIGURATION = eINSTANCE.getKronusResource_KronusCallConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.NamedResourceDefinitionImpl <em>Named Resource Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.NamedResourceDefinitionImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getNamedResourceDefinition()
     * @generated
     */
    EClass     NAMED_RESOURCE_DEFINITION                        = eINSTANCE.getNamedResourceDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute NAMED_RESOURCE_DEFINITION__NAME                  = eINSTANCE.getNamedResourceDefinition_Name();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.ResourceDefinitionImpl <em>Resource Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.ResourceDefinitionImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getResourceDefinition()
     * @generated
     */
    EClass     RESOURCE_DEFINITION                              = eINSTANCE.getResourceDefinition();

    /**
     * The meta object literal for the '<em><b>Connector Preference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_DEFINITION__CONNECTOR_PREFERENCE        = eINSTANCE.getResourceDefinition_ConnectorPreference();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_DEFINITION__ENABLED                     = eINSTANCE.getResourceDefinition_Enabled();

    /**
     * The meta object literal for the '<em><b>State</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_DEFINITION__STATE                       = eINSTANCE.getResourceDefinition_State();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.RowInstanceImpl <em>Row Instance</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.RowInstanceImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getRowInstance()
     * @generated
     */
    EClass     ROW_INSTANCE                                     = eINSTANCE.getRowInstance();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference ROW_INSTANCE__COLUMNS                            = eINSTANCE.getRowInstance_Columns();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.XmlNamespaceDefinitionImpl <em>Xml Namespace Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.XmlNamespaceDefinitionImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getXmlNamespaceDefinition()
     * @generated
     */
    EClass     XML_NAMESPACE_DEFINITION                         = eINSTANCE.getXmlNamespaceDefinition();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.impl.XmlUriDefinitionImpl <em>Xml Uri Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.impl.XmlUriDefinitionImpl
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getXmlUriDefinition()
     * @generated
     */
    EClass     XML_URI_DEFINITION                               = eINSTANCE.getXmlUriDefinition();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_URI_DEFINITION__PREFIX                       = eINSTANCE.getXmlUriDefinition_Prefix();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference XML_URI_DEFINITION__URI                          = eINSTANCE.getXmlUriDefinition_Uri();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XML_URI_DEFINITION__ENABLED                      = eINSTANCE.getXmlUriDefinition_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.ColumnTrimEnum <em>Column Trim Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.ColumnTrimEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getColumnTrimEnum()
     * @generated
     */
    EEnum      COLUMN_TRIM_ENUM                                 = eINSTANCE.getColumnTrimEnum();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.ColumnTypeEnum <em>Column Type Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.ColumnTypeEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getColumnTypeEnum()
     * @generated
     */
    EEnum      COLUMN_TYPE_ENUM                                 = eINSTANCE.getColumnTypeEnum();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.InterpretersEnum <em>Interpreters Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.InterpretersEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getInterpretersEnum()
     * @generated
     */
    EEnum      INTERPRETERS_ENUM                                = eINSTANCE.getInterpretersEnum();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.ModulesEnum <em>Modules Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.ModulesEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getModulesEnum()
     * @generated
     */
    EEnum      MODULES_ENUM                                     = eINSTANCE.getModulesEnum();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.RepetitionActionsEnum <em>Repetition Actions Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.RepetitionActionsEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getRepetitionActionsEnum()
     * @generated
     */
    EEnum      REPETITION_ACTIONS_ENUM                          = eINSTANCE.getRepetitionActionsEnum();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.ResourcesEnum <em>Resources Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.ResourcesEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getResourcesEnum()
     * @generated
     */
    EEnum      RESOURCES_ENUM                                   = eINSTANCE.getResourcesEnum();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.SaturnStatusConditionEnum <em>Saturn Status Condition Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.SaturnStatusConditionEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getSaturnStatusConditionEnum()
     * @generated
     */
    EEnum      SATURN_STATUS_CONDITION_ENUM                     = eINSTANCE.getSaturnStatusConditionEnum();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.types.SaturnStatusEnum <em>Saturn Status Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.SaturnStatusEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getSaturnStatusEnum()
     * @generated
     */
    EEnum      SATURN_STATUS_ENUM                               = eINSTANCE.getSaturnStatusEnum();

    /**
     * The meta object literal for the '<em>Column Trim Enum Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.types.ColumnTrimEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getColumnTrimEnumObject()
     * @generated
     */
    EDataType  COLUMN_TRIM_ENUM_OBJECT                          = eINSTANCE.getColumnTrimEnumObject();

    /**
     * The meta object literal for the '<em>Column Type Enum Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.types.ColumnTypeEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getColumnTypeEnumObject()
     * @generated
     */
    EDataType  COLUMN_TYPE_ENUM_OBJECT                          = eINSTANCE.getColumnTypeEnumObject();

    /**
     * The meta object literal for the '<em>Interpreters Enum Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.types.InterpretersEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getInterpretersEnumObject()
     * @generated
     */
    EDataType  INTERPRETERS_ENUM_OBJECT                         = eINSTANCE.getInterpretersEnumObject();

    /**
     * The meta object literal for the '<em>Modules Enum Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.types.ModulesEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getModulesEnumObject()
     * @generated
     */
    EDataType  MODULES_ENUM_OBJECT                              = eINSTANCE.getModulesEnumObject();

    /**
     * The meta object literal for the '<em>Object Id</em>' data type.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getObjectId()
     * @generated
     */
    EDataType  OBJECT_ID                                        = eINSTANCE.getObjectId();

    /**
     * The meta object literal for the '<em>Object Name</em>' data type.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getObjectName()
     * @generated
     */
    EDataType  OBJECT_NAME                                      = eINSTANCE.getObjectName();

    /**
     * The meta object literal for the '<em>Repetition Actions Enum Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.types.RepetitionActionsEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getRepetitionActionsEnumObject()
     * @generated
     */
    EDataType  REPETITION_ACTIONS_ENUM_OBJECT                   = eINSTANCE.getRepetitionActionsEnumObject();

    /**
     * The meta object literal for the '<em>Resources Enum Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.types.ResourcesEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getResourcesEnumObject()
     * @generated
     */
    EDataType  RESOURCES_ENUM_OBJECT                            = eINSTANCE.getResourcesEnumObject();

    /**
     * The meta object literal for the '<em>Saturn Status Condition Enum Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.types.SaturnStatusConditionEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getSaturnStatusConditionEnumObject()
     * @generated
     */
    EDataType  SATURN_STATUS_CONDITION_ENUM_OBJECT              = eINSTANCE.getSaturnStatusConditionEnumObject();

    /**
     * The meta object literal for the '<em>Saturn Status Enum Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.types.SaturnStatusEnum
     * @see com.ms.qaTools.saturn.types.impl.TypesPackageImpl#getSaturnStatusEnumObject()
     * @generated
     */
    EDataType  SATURN_STATUS_ENUM_OBJECT                        = eINSTANCE.getSaturnStatusEnumObject();

  }

} // TypesPackage
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
