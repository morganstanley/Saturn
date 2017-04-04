package com.ms.qaTools.saturn.modules.xmlManipModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface XmlManipModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                eNAME                                     = "xmlManipModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                eNS_URI                                   = "http://www.ms.com/2009/Saturn/Modules/XmlManip";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                eNS_PREFIX                                = "xManipModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  XmlManipModulePackage eINSTANCE                                 = com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.AbstractOperationImpl <em>Abstract Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.AbstractOperationImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getAbstractOperation()
   * @generated
   */
  int                   ABSTRACT_OPERATION                        = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ABSTRACT_OPERATION__ENABLED               = 0;

  /**
   * The number of structural features of the '<em>Abstract Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ABSTRACT_OPERATION_FEATURE_COUNT          = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.AddOperationImpl <em>Add Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.AddOperationImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getAddOperation()
   * @generated
   */
  int                   ADD_OPERATION                             = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ADD_OPERATION__ENABLED                    = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Parent Node Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ADD_OPERATION__PARENT_NODE_NAME           = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Node Name</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   ADD_OPERATION__NODE_NAME                  = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ADD_OPERATION__URI                        = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ADD_OPERATION__VALUE                      = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Is Attribute</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ADD_OPERATION__IS_ATTRIBUTE               = ABSTRACT_OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Is Xml</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ADD_OPERATION__IS_XML                     = ABSTRACT_OPERATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Is CData</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ADD_OPERATION__IS_CDATA                   = ABSTRACT_OPERATION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Add Operation</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   ADD_OPERATION_FEATURE_COUNT               = ABSTRACT_OPERATION_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.CleanNamespacesOperationImpl <em>Clean Namespaces Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.CleanNamespacesOperationImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getCleanNamespacesOperation()
   * @generated
   */
  int                   CLEAN_NAMESPACES_OPERATION                = 2;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   CLEAN_NAMESPACES_OPERATION__ENABLED       = ABSTRACT_OPERATION__ENABLED;

  /**
   * The number of structural features of the '<em>Clean Namespaces Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   CLEAN_NAMESPACES_OPERATION_FEATURE_COUNT  = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.DeleteOperationImpl <em>Delete Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.DeleteOperationImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getDeleteOperation()
   * @generated
   */
  int                   DELETE_OPERATION                          = 3;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   DELETE_OPERATION__ENABLED                 = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>XPaths</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   DELETE_OPERATION__XPATHS                  = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Delete Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   DELETE_OPERATION_FEATURE_COUNT            = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                   DOCUMENT_ROOT                             = 4;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   DOCUMENT_ROOT__MIXED                      = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   DOCUMENT_ROOT__XMLNS_PREFIX_MAP           = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   DOCUMENT_ROOT__XSI_SCHEMA_LOCATION        = 2;

  /**
   * The feature id for the '<em><b>Xml Manip Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   DOCUMENT_ROOT__XML_MANIP_CONFIGURATION    = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   DOCUMENT_ROOT_FEATURE_COUNT               = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ExtractOperationImpl <em>Extract Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.ExtractOperationImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getExtractOperation()
   * @generated
   */
  int                   EXTRACT_OPERATION                         = 5;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   EXTRACT_OPERATION__ENABLED                = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>XPath</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   EXTRACT_OPERATION__XPATH                  = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Extract Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   EXTRACT_OPERATION_FEATURE_COUNT           = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.IntersectOperationImpl <em>Intersect Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.IntersectOperationImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getIntersectOperation()
   * @generated
   */
  int                   INTERSECT_OPERATION                       = 6;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   INTERSECT_OPERATION__ENABLED              = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Intersect Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   INTERSECT_OPERATION__INTERSECT_RESOURCE   = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Intersect Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   INTERSECT_OPERATION_FEATURE_COUNT         = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.RegisterFunctionOperationImpl <em>Register Function Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.RegisterFunctionOperationImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getRegisterFunctionOperation()
   * @generated
   */
  int                   REGISTER_FUNCTION_OPERATION               = 7;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   REGISTER_FUNCTION_OPERATION__ENABLED      = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   REGISTER_FUNCTION_OPERATION__FUNCTION     = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   REGISTER_FUNCTION_OPERATION__PACKAGE      = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sub Name</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   REGISTER_FUNCTION_OPERATION__SUB_NAME     = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   REGISTER_FUNCTION_OPERATION__URI          = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Register Function Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   REGISTER_FUNCTION_OPERATION_FEATURE_COUNT = ABSTRACT_OPERATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ReplaceOperationImpl <em>Replace Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.ReplaceOperationImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getReplaceOperation()
   * @generated
   */
  int                   REPLACE_OPERATION                         = 8;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   REPLACE_OPERATION__ENABLED                = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Search</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   REPLACE_OPERATION__SEARCH                 = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>With</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   REPLACE_OPERATION__WITH                   = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Replace Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   REPLACE_OPERATION_FEATURE_COUNT           = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ShiftOperationImpl <em>Shift Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.ShiftOperationImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getShiftOperation()
   * @generated
   */
  int                   SHIFT_OPERATION                           = 9;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SHIFT_OPERATION__ENABLED                  = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SHIFT_OPERATION__OUTPUT_RESOURCE          = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SHIFT_OPERATION__COUNT                    = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Remain</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SHIFT_OPERATION__REMAIN                   = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Remove</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SHIFT_OPERATION__REMOVE                   = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Shift Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SHIFT_OPERATION_FEATURE_COUNT             = ABSTRACT_OPERATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.SortOperationImpl <em>Sort Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.SortOperationImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getSortOperation()
   * @generated
   */
  int                   SORT_OPERATION                            = 10;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SORT_OPERATION__ENABLED                   = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>XPaths</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SORT_OPERATION__XPATHS                    = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sort Operation</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   SORT_OPERATION_FEATURE_COUNT              = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.SplitOperationImpl <em>Split Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.SplitOperationImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getSplitOperation()
   * @generated
   */
  int                   SPLIT_OPERATION                           = 11;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SPLIT_OPERATION__ENABLED                  = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Keys</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   SPLIT_OPERATION__KEYS                     = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Group Bys</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SPLIT_OPERATION__GROUP_BYS                = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SPLIT_OPERATION__OUTPUT_RESOURCE          = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Split Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SPLIT_OPERATION_FEATURE_COUNT             = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.StripNamespacesOperationImpl <em>Strip Namespaces Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.StripNamespacesOperationImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getStripNamespacesOperation()
   * @generated
   */
  int                   STRIP_NAMESPACES_OPERATION                = 12;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   STRIP_NAMESPACES_OPERATION__ENABLED       = ABSTRACT_OPERATION__ENABLED;

  /**
   * The number of structural features of the '<em>Strip Namespaces Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   STRIP_NAMESPACES_OPERATION_FEATURE_COUNT  = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ValueReplaceOperationImpl <em>Value Replace Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.ValueReplaceOperationImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getValueReplaceOperation()
   * @generated
   */
  int                   VALUE_REPLACE_OPERATION                   = 13;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   VALUE_REPLACE_OPERATION__ENABLED          = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Reg Exp</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   VALUE_REPLACE_OPERATION__REG_EXP          = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>New Value</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   VALUE_REPLACE_OPERATION__NEW_VALUE        = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Value Replace Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   VALUE_REPLACE_OPERATION_FEATURE_COUNT     = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.WhereOperationImpl <em>Where Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.WhereOperationImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getWhereOperation()
   * @generated
   */
  int                   WHERE_OPERATION                           = 14;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   WHERE_OPERATION__ENABLED                  = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>XPath</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   WHERE_OPERATION__XPATH                    = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exclude</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   WHERE_OPERATION__EXCLUDE                  = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Where Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   WHERE_OPERATION_FEATURE_COUNT             = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipConfigurationImpl <em>Xml Manip Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getXmlManipConfiguration()
   * @generated
   */
  int                   XML_MANIP_CONFIGURATION                   = 15;

  /**
   * The feature id for the '<em><b>Input Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XML_MANIP_CONFIGURATION__INPUT_RESOURCE   = 0;

  /**
   * The feature id for the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XML_MANIP_CONFIGURATION__OUTPUT_RESOURCE  = 1;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XML_MANIP_CONFIGURATION__OPERATIONS       = 2;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XML_MANIP_CONFIGURATION__NAMESPACES       = 3;

  /**
   * The number of structural features of the '<em>Xml Manip Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XML_MANIP_CONFIGURATION_FEATURE_COUNT     = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipNamespaceImpl <em>Xml Manip Namespace</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipNamespaceImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getXmlManipNamespace()
   * @generated
   */
  int                   XML_MANIP_NAMESPACE                       = 16;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   XML_MANIP_NAMESPACE__PREFIX               = 0;

  /**
   * The feature id for the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XML_MANIP_NAMESPACE__URI                  = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XML_MANIP_NAMESPACE__ENABLED              = 2;

  /**
   * The number of structural features of the '<em>Xml Manip Namespace</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XML_MANIP_NAMESPACE_FEATURE_COUNT         = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.XPathImpl <em>XPath</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XPathImpl
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getXPath()
   * @generated
   */
  int                   XPATH                                     = 17;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH__DESCRIPTION = ValuesPackage.COMPLEX_VALUE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XPATH__MIXED                              = ValuesPackage.COMPLEX_VALUE__MIXED;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XPATH__NULL                               = ValuesPackage.COMPLEX_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XPATH__GROUP                              = ValuesPackage.COMPLEX_VALUE__GROUP;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   XPATH__TEXT                               = ValuesPackage.COMPLEX_VALUE__TEXT;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XPATH__ENV_VAR                            = ValuesPackage.COMPLEX_VALUE__ENV_VAR;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   XPATH__FILE                               = ValuesPackage.COMPLEX_VALUE__FILE;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XPATH__XPATH_VALUE                        = ValuesPackage.COMPLEX_VALUE__XPATH_VALUE;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH__JSON_VALUE = ValuesPackage.COMPLEX_VALUE__JSON_VALUE;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPATH__FIX_VALUE = ValuesPackage.COMPLEX_VALUE__FIX_VALUE;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XPATH__CELL_VALUE                         = ValuesPackage.COMPLEX_VALUE__CELL_VALUE;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XPATH__PROPERTY_VALUE                     = ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   XPATH__CODE                               = ValuesPackage.COMPLEX_VALUE__CODE;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XPATH__RUN_NUMBER                         = ValuesPackage.COMPLEX_VALUE__RUN_NUMBER;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XPATH__REFERENCE                          = ValuesPackage.COMPLEX_VALUE__REFERENCE;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XPATH__MEMOIZE                            = ValuesPackage.COMPLEX_VALUE__MEMOIZE;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XPATH__ENABLED                            = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XPath</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   XPATH_FEATURE_COUNT                       = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AbstractOperation <em>Abstract Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.AbstractOperation
   * @generated
   */
  EClass getAbstractOperation();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.AbstractOperation#isEnabled <em>Enabled</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.AbstractOperation#isEnabled()
   * @see #getAbstractOperation()
   * @generated
   */
  EAttribute getAbstractOperation_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation <em>Add Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation
   * @generated
   */
  EClass getAddOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getParentNodeName <em>Parent Node Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parent Node Name</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getParentNodeName()
   * @see #getAddOperation()
   * @generated
   */
  EReference getAddOperation_ParentNodeName();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getNodeName <em>Node Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Node Name</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getNodeName()
   * @see #getAddOperation()
   * @generated
   */
  EReference getAddOperation_NodeName();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uri</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getUri()
   * @see #getAddOperation()
   * @generated
   */
  EReference getAddOperation_Uri();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#getValue()
   * @see #getAddOperation()
   * @generated
   */
  EReference getAddOperation_Value();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsAttribute <em>Is Attribute</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Is Attribute</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsAttribute()
   * @see #getAddOperation()
   * @generated
   */
  EAttribute getAddOperation_IsAttribute();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsCData <em>Is CData</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is CData</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsCData()
   * @see #getAddOperation()
   * @generated
   */
  EAttribute getAddOperation_IsCData();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsXml <em>Is Xml</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Xml</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation#isIsXml()
   * @see #getAddOperation()
   * @generated
   */
  EAttribute getAddOperation_IsXml();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.CleanNamespacesOperation <em>Clean Namespaces Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Clean Namespaces Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.CleanNamespacesOperation
   * @generated
   */
  EClass getCleanNamespacesOperation();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.DeleteOperation <em>Delete Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.DeleteOperation
   * @generated
   */
  EClass getDeleteOperation();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.DeleteOperation#getXPaths <em>XPaths</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>XPaths</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.DeleteOperation#getXPaths()
   * @see #getDeleteOperation()
   * @generated
   */
  EReference getDeleteOperation_XPaths();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.xmlManipModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.xmlManipModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.xmlManipModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlManipModule.DocumentRoot#getXmlManipConfiguration <em>Xml Manip Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xml Manip Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.DocumentRoot#getXmlManipConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XmlManipConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ExtractOperation <em>Extract Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Extract Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ExtractOperation
   * @generated
   */
  EClass getExtractOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ExtractOperation#getXPath <em>XPath</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>XPath</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ExtractOperation#getXPath()
   * @see #getExtractOperation()
   * @generated
   */
  EReference getExtractOperation_XPath();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.IntersectOperation <em>Intersect Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Intersect Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.IntersectOperation
   * @generated
   */
  EClass getIntersectOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlManipModule.IntersectOperation#getIntersectResource <em>Intersect Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Intersect Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.IntersectOperation#getIntersectResource()
   * @see #getIntersectOperation()
   * @generated
   */
  EReference getIntersectOperation_IntersectResource();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation <em>Register Function Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Register Function Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation
   * @generated
   */
  EClass getRegisterFunctionOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getFunction <em>Function</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getFunction()
   * @see #getRegisterFunctionOperation()
   * @generated
   */
  EReference getRegisterFunctionOperation_Function();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getPackage <em>Package</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getPackage()
   * @see #getRegisterFunctionOperation()
   * @generated
   */
  EReference getRegisterFunctionOperation_Package();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getSubName <em>Sub Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Sub Name</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getSubName()
   * @see #getRegisterFunctionOperation()
   * @generated
   */
  EReference getRegisterFunctionOperation_SubName();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getUri <em>Uri</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Uri</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getUri()
   * @see #getRegisterFunctionOperation()
   * @generated
   */
  EReference getRegisterFunctionOperation_Uri();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ReplaceOperation <em>Replace Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Replace Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ReplaceOperation
   * @generated
   */
  EClass getReplaceOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.ReplaceOperation#getSearch <em>Search</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Search</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ReplaceOperation#getSearch()
   * @see #getReplaceOperation()
   * @generated
   */
  EReference getReplaceOperation_Search();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ReplaceOperation#getWith <em>With</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>With</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ReplaceOperation#getWith()
   * @see #getReplaceOperation()
   * @generated
   */
  EReference getReplaceOperation_With();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation <em>Shift Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation
   * @generated
   */
  EClass getShiftOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#getOutputResource <em>Output Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#getOutputResource()
   * @see #getShiftOperation()
   * @generated
   */
  EReference getShiftOperation_OutputResource();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#getCount <em>Count</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#getCount()
   * @see #getShiftOperation()
   * @generated
   */
  EAttribute getShiftOperation_Count();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#isRemain <em>Remain</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remain</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#isRemain()
   * @see #getShiftOperation()
   * @generated
   */
  EAttribute getShiftOperation_Remain();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#isRemove <em>Remove</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remove</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation#isRemove()
   * @see #getShiftOperation()
   * @generated
   */
  EAttribute getShiftOperation_Remove();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.SortOperation <em>Sort Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Sort Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.SortOperation
   * @generated
   */
  EClass getSortOperation();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.xmlManipModule.SortOperation#getXPaths <em>XPaths</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>XPaths</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.SortOperation#getXPaths()
   * @see #getSortOperation()
   * @generated
   */
  EReference getSortOperation_XPaths();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.SplitOperation <em>Split Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Split Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.SplitOperation
   * @generated
   */
  EClass getSplitOperation();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.xmlManipModule.SplitOperation#getKeys <em>Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Keys</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.SplitOperation#getKeys()
   * @see #getSplitOperation()
   * @generated
   */
  EReference getSplitOperation_Keys();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.SplitOperation#getGroupBys <em>Group Bys</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Group Bys</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.SplitOperation#getGroupBys()
   * @see #getSplitOperation()
   * @generated
   */
  EReference getSplitOperation_GroupBys();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlManipModule.SplitOperation#getOutputResource <em>Output Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.SplitOperation#getOutputResource()
   * @see #getSplitOperation()
   * @generated
   */
  EReference getSplitOperation_OutputResource();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.StripNamespacesOperation <em>Strip Namespaces Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Strip Namespaces Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.StripNamespacesOperation
   * @generated
   */
  EClass getStripNamespacesOperation();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.ValueReplaceOperation <em>Value Replace Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Replace Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ValueReplaceOperation
   * @generated
   */
  EClass getValueReplaceOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.ValueReplaceOperation#getRegExp <em>Reg Exp</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Reg Exp</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ValueReplaceOperation#getRegExp()
   * @see #getValueReplaceOperation()
   * @generated
   */
  EReference getValueReplaceOperation_RegExp();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.ValueReplaceOperation#getNewValue <em>New Value</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>New Value</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.ValueReplaceOperation#getNewValue()
   * @see #getValueReplaceOperation()
   * @generated
   */
  EReference getValueReplaceOperation_NewValue();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation <em>Where Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Where Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation
   * @generated
   */
  EClass getWhereOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation#getXPath <em>XPath</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>XPath</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation#getXPath()
   * @see #getWhereOperation()
   * @generated
   */
  EReference getWhereOperation_XPath();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation#isExclude <em>Exclude</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Exclude</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation#isExclude()
   * @see #getWhereOperation()
   * @generated
   */
  EAttribute getWhereOperation_Exclude();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipConfiguration <em>Xml Manip Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Manip Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipConfiguration
   * @generated
   */
  EClass getXmlManipConfiguration();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipConfiguration#getInputResource <em>Input Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipConfiguration#getInputResource()
   * @see #getXmlManipConfiguration()
   * @generated
   */
  EReference getXmlManipConfiguration_InputResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipConfiguration#getOutputResource <em>Output Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipConfiguration#getOutputResource()
   * @see #getXmlManipConfiguration()
   * @generated
   */
  EReference getXmlManipConfiguration_OutputResource();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipConfiguration#getOperations <em>Operations</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipConfiguration#getOperations()
   * @see #getXmlManipConfiguration()
   * @generated
   */
  EReference getXmlManipConfiguration_Operations();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipConfiguration#getNamespaces <em>Namespaces</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Namespaces</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipConfiguration#getNamespaces()
   * @see #getXmlManipConfiguration()
   * @generated
   */
  EReference getXmlManipConfiguration_Namespaces();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipNamespace <em>Xml Manip Namespace</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Manip Namespace</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipNamespace
   * @generated
   */
  EClass getXmlManipNamespace();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipNamespace#getPrefix <em>Prefix</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Prefix</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipNamespace#getPrefix()
   * @see #getXmlManipNamespace()
   * @generated
   */
  EReference getXmlManipNamespace_Prefix();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipNamespace#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uri</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipNamespace#getUri()
   * @see #getXmlManipNamespace()
   * @generated
   */
  EReference getXmlManipNamespace_Uri();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipNamespace#isEnabled <em>Enabled</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipNamespace#isEnabled()
   * @see #getXmlManipNamespace()
   * @generated
   */
  EAttribute getXmlManipNamespace_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.xmlManipModule.XPath <em>XPath</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>XPath</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XPath
   * @generated
   */
  EClass getXPath();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.xmlManipModule.XPath#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XPath#isEnabled()
   * @see #getXPath()
   * @generated
   */
  EAttribute getXPath_Enabled();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XmlManipModuleFactory getXmlManipModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.AbstractOperationImpl <em>Abstract Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.AbstractOperationImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getAbstractOperation()
     * @generated
     */
    EClass     ABSTRACT_OPERATION                       = eINSTANCE.getAbstractOperation();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_OPERATION__ENABLED              = eINSTANCE.getAbstractOperation_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.AddOperationImpl <em>Add Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.AddOperationImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getAddOperation()
     * @generated
     */
    EClass     ADD_OPERATION                            = eINSTANCE.getAddOperation();

    /**
     * The meta object literal for the '<em><b>Parent Node Name</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ADD_OPERATION__PARENT_NODE_NAME          = eINSTANCE.getAddOperation_ParentNodeName();

    /**
     * The meta object literal for the '<em><b>Node Name</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_OPERATION__NODE_NAME                 = eINSTANCE.getAddOperation_NodeName();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference ADD_OPERATION__URI                       = eINSTANCE.getAddOperation_Uri();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_OPERATION__VALUE                     = eINSTANCE.getAddOperation_Value();

    /**
     * The meta object literal for the '<em><b>Is Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ADD_OPERATION__IS_ATTRIBUTE              = eINSTANCE.getAddOperation_IsAttribute();

    /**
     * The meta object literal for the '<em><b>Is CData</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ADD_OPERATION__IS_CDATA                  = eINSTANCE.getAddOperation_IsCData();

    /**
     * The meta object literal for the '<em><b>Is Xml</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ADD_OPERATION__IS_XML                    = eINSTANCE.getAddOperation_IsXml();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.CleanNamespacesOperationImpl <em>Clean Namespaces Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.CleanNamespacesOperationImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getCleanNamespacesOperation()
     * @generated
     */
    EClass     CLEAN_NAMESPACES_OPERATION               = eINSTANCE.getCleanNamespacesOperation();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.DeleteOperationImpl <em>Delete Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.DeleteOperationImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getDeleteOperation()
     * @generated
     */
    EClass     DELETE_OPERATION                         = eINSTANCE.getDeleteOperation();

    /**
     * The meta object literal for the '<em><b>XPaths</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_OPERATION__XPATHS                 = eINSTANCE.getDeleteOperation_XPaths();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                            = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED                     = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP          = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION       = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Xml Manip Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__XML_MANIP_CONFIGURATION   = eINSTANCE.getDocumentRoot_XmlManipConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ExtractOperationImpl <em>Extract Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.ExtractOperationImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getExtractOperation()
     * @generated
     */
    EClass     EXTRACT_OPERATION                        = eINSTANCE.getExtractOperation();

    /**
     * The meta object literal for the '<em><b>XPath</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTRACT_OPERATION__XPATH                 = eINSTANCE.getExtractOperation_XPath();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.IntersectOperationImpl <em>Intersect Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.IntersectOperationImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getIntersectOperation()
     * @generated
     */
    EClass     INTERSECT_OPERATION                      = eINSTANCE.getIntersectOperation();

    /**
     * The meta object literal for the '<em><b>Intersect Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference INTERSECT_OPERATION__INTERSECT_RESOURCE  = eINSTANCE.getIntersectOperation_IntersectResource();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.RegisterFunctionOperationImpl <em>Register Function Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.RegisterFunctionOperationImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getRegisterFunctionOperation()
     * @generated
     */
    EClass     REGISTER_FUNCTION_OPERATION              = eINSTANCE.getRegisterFunctionOperation();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGISTER_FUNCTION_OPERATION__FUNCTION    = eINSTANCE.getRegisterFunctionOperation_Function();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGISTER_FUNCTION_OPERATION__PACKAGE     = eINSTANCE.getRegisterFunctionOperation_Package();

    /**
     * The meta object literal for the '<em><b>Sub Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGISTER_FUNCTION_OPERATION__SUB_NAME    = eINSTANCE.getRegisterFunctionOperation_SubName();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference REGISTER_FUNCTION_OPERATION__URI         = eINSTANCE.getRegisterFunctionOperation_Uri();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ReplaceOperationImpl <em>Replace Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.ReplaceOperationImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getReplaceOperation()
     * @generated
     */
    EClass     REPLACE_OPERATION                        = eINSTANCE.getReplaceOperation();

    /**
     * The meta object literal for the '<em><b>Search</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPLACE_OPERATION__SEARCH                = eINSTANCE.getReplaceOperation_Search();

    /**
     * The meta object literal for the '<em><b>With</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPLACE_OPERATION__WITH                  = eINSTANCE.getReplaceOperation_With();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ShiftOperationImpl <em>Shift Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.ShiftOperationImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getShiftOperation()
     * @generated
     */
    EClass     SHIFT_OPERATION                          = eINSTANCE.getShiftOperation();

    /**
     * The meta object literal for the '<em><b>Output Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SHIFT_OPERATION__OUTPUT_RESOURCE         = eINSTANCE.getShiftOperation_OutputResource();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SHIFT_OPERATION__COUNT                   = eINSTANCE.getShiftOperation_Count();

    /**
     * The meta object literal for the '<em><b>Remain</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SHIFT_OPERATION__REMAIN                  = eINSTANCE.getShiftOperation_Remain();

    /**
     * The meta object literal for the '<em><b>Remove</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SHIFT_OPERATION__REMOVE                  = eINSTANCE.getShiftOperation_Remove();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.SortOperationImpl <em>Sort Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.SortOperationImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getSortOperation()
     * @generated
     */
    EClass     SORT_OPERATION                           = eINSTANCE.getSortOperation();

    /**
     * The meta object literal for the '<em><b>XPaths</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SORT_OPERATION__XPATHS                   = eINSTANCE.getSortOperation_XPaths();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.SplitOperationImpl <em>Split Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.SplitOperationImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getSplitOperation()
     * @generated
     */
    EClass     SPLIT_OPERATION                          = eINSTANCE.getSplitOperation();

    /**
     * The meta object literal for the '<em><b>Keys</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SPLIT_OPERATION__KEYS                    = eINSTANCE.getSplitOperation_Keys();

    /**
     * The meta object literal for the '<em><b>Group Bys</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SPLIT_OPERATION__GROUP_BYS               = eINSTANCE.getSplitOperation_GroupBys();

    /**
     * The meta object literal for the '<em><b>Output Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SPLIT_OPERATION__OUTPUT_RESOURCE         = eINSTANCE.getSplitOperation_OutputResource();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.StripNamespacesOperationImpl <em>Strip Namespaces Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.StripNamespacesOperationImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getStripNamespacesOperation()
     * @generated
     */
    EClass     STRIP_NAMESPACES_OPERATION               = eINSTANCE.getStripNamespacesOperation();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ValueReplaceOperationImpl <em>Value Replace Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.ValueReplaceOperationImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getValueReplaceOperation()
     * @generated
     */
    EClass     VALUE_REPLACE_OPERATION                  = eINSTANCE.getValueReplaceOperation();

    /**
     * The meta object literal for the '<em><b>Reg Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_REPLACE_OPERATION__REG_EXP         = eINSTANCE.getValueReplaceOperation_RegExp();

    /**
     * The meta object literal for the '<em><b>New Value</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_REPLACE_OPERATION__NEW_VALUE       = eINSTANCE.getValueReplaceOperation_NewValue();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.WhereOperationImpl <em>Where Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.WhereOperationImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getWhereOperation()
     * @generated
     */
    EClass     WHERE_OPERATION                          = eINSTANCE.getWhereOperation();

    /**
     * The meta object literal for the '<em><b>XPath</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_OPERATION__XPATH                   = eINSTANCE.getWhereOperation_XPath();

    /**
     * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute WHERE_OPERATION__EXCLUDE                 = eINSTANCE.getWhereOperation_Exclude();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipConfigurationImpl <em>Xml Manip Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getXmlManipConfiguration()
     * @generated
     */
    EClass     XML_MANIP_CONFIGURATION                  = eINSTANCE.getXmlManipConfiguration();

    /**
     * The meta object literal for the '<em><b>Input Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML_MANIP_CONFIGURATION__INPUT_RESOURCE  = eINSTANCE.getXmlManipConfiguration_InputResource();

    /**
     * The meta object literal for the '<em><b>Output Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML_MANIP_CONFIGURATION__OUTPUT_RESOURCE = eINSTANCE.getXmlManipConfiguration_OutputResource();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML_MANIP_CONFIGURATION__OPERATIONS      = eINSTANCE.getXmlManipConfiguration_Operations();

    /**
     * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML_MANIP_CONFIGURATION__NAMESPACES      = eINSTANCE.getXmlManipConfiguration_Namespaces();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipNamespaceImpl <em>Xml Manip Namespace</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipNamespaceImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getXmlManipNamespace()
     * @generated
     */
    EClass     XML_MANIP_NAMESPACE                      = eINSTANCE.getXmlManipNamespace();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_MANIP_NAMESPACE__PREFIX              = eINSTANCE.getXmlManipNamespace_Prefix();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference XML_MANIP_NAMESPACE__URI                 = eINSTANCE.getXmlManipNamespace_Uri();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XML_MANIP_NAMESPACE__ENABLED             = eINSTANCE.getXmlManipNamespace_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.XPathImpl <em>XPath</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XPathImpl
     * @see com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipModulePackageImpl#getXPath()
     * @generated
     */
    EClass     XPATH                                    = eINSTANCE.getXPath();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute XPATH__ENABLED                           = eINSTANCE.getXPath_Enabled();

  }

} // XmlManipModulePackage
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
