package com.ms.qaTools.saturn.modules.fixManipModule;

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
 * @see com.ms.qaTools.saturn.modules.fixManipModule.FixManipModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface FixManipModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                eNAME                                      = "fixManipModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                eNS_URI                                    = "http://www.ms.com/2011/Saturn/Modules/FixManip";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                eNS_PREFIX                                 = "fManipModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  FixManipModulePackage eINSTANCE                                  = com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.AbstractOperationImpl <em>Abstract Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.AbstractOperationImpl
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getAbstractOperation()
   * @generated
   */
  int                   ABSTRACT_OPERATION                         = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ABSTRACT_OPERATION__ENABLED                = 0;

  /**
   * The number of structural features of the '<em>Abstract Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ABSTRACT_OPERATION_FEATURE_COUNT           = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.AddOperationImpl <em>Add Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.AddOperationImpl
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getAddOperation()
   * @generated
   */
  int                   ADD_OPERATION                              = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ADD_OPERATION__ENABLED                     = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ADD_OPERATION__TAG                         = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ADD_OPERATION__VALUE                       = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   ADD_OPERATION__NAME                        = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Add Operation</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   ADD_OPERATION_FEATURE_COUNT                = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.DeleteOperationImpl <em>Delete Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.DeleteOperationImpl
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getDeleteOperation()
   * @generated
   */
  int                   DELETE_OPERATION                           = 2;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   DELETE_OPERATION__ENABLED                  = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   DELETE_OPERATION__TAG                      = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   DELETE_OPERATION__VALUE                    = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Delete Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   DELETE_OPERATION_FEATURE_COUNT             = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                   DOCUMENT_ROOT                              = 3;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   DOCUMENT_ROOT__MIXED                       = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   DOCUMENT_ROOT__XMLNS_PREFIX_MAP            = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   DOCUMENT_ROOT__XSI_SCHEMA_LOCATION         = 2;

  /**
   * The feature id for the '<em><b>Fix Manip Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   DOCUMENT_ROOT__FIX_MANIP_CONFIGURATION     = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   DOCUMENT_ROOT_FEATURE_COUNT                = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipConfigurationImpl <em>Fix Manip Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getFixManipConfiguration()
   * @generated
   */
  int                   FIX_MANIP_CONFIGURATION                    = 4;

  /**
   * The feature id for the '<em><b>Input Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   FIX_MANIP_CONFIGURATION__INPUT_RESOURCE    = 0;

  /**
   * The feature id for the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   FIX_MANIP_CONFIGURATION__OUTPUT_RESOURCE   = 1;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   FIX_MANIP_CONFIGURATION__OPERATIONS        = 2;

  /**
   * The number of structural features of the '<em>Fix Manip Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   FIX_MANIP_CONFIGURATION_FEATURE_COUNT      = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.ReplaceOperationImpl <em>Replace Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.ReplaceOperationImpl
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getReplaceOperation()
   * @generated
   */
  int                   REPLACE_OPERATION                          = 5;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   REPLACE_OPERATION__ENABLED                 = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   REPLACE_OPERATION__TAG                     = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Old Value</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   REPLACE_OPERATION__OLD_VALUE               = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>New Value</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   REPLACE_OPERATION__NEW_VALUE               = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Replace Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   REPLACE_OPERATION_FEATURE_COUNT            = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.UpdateBodyLengthOperationImpl <em>Update Body Length Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.UpdateBodyLengthOperationImpl
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getUpdateBodyLengthOperation()
   * @generated
   */
  int                   UPDATE_BODY_LENGTH_OPERATION               = 6;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   UPDATE_BODY_LENGTH_OPERATION__ENABLED      = ABSTRACT_OPERATION__ENABLED;

  /**
   * The number of structural features of the '<em>Update Body Length Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   UPDATE_BODY_LENGTH_OPERATION_FEATURE_COUNT = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.UpdateCheckSumOperationImpl <em>Update Check Sum Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.UpdateCheckSumOperationImpl
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getUpdateCheckSumOperation()
   * @generated
   */
  int                   UPDATE_CHECK_SUM_OPERATION                 = 7;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   UPDATE_CHECK_SUM_OPERATION__ENABLED        = ABSTRACT_OPERATION__ENABLED;

  /**
   * The number of structural features of the '<em>Update Check Sum Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   UPDATE_CHECK_SUM_OPERATION_FEATURE_COUNT   = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.ValueReplaceOperationImpl <em>Value Replace Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.ValueReplaceOperationImpl
   * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getValueReplaceOperation()
   * @generated
   */
  int                   VALUE_REPLACE_OPERATION                    = 8;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   VALUE_REPLACE_OPERATION__ENABLED           = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Reg Exp</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   VALUE_REPLACE_OPERATION__REG_EXP           = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>New Value</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   VALUE_REPLACE_OPERATION__NEW_VALUE         = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Value Replace Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   VALUE_REPLACE_OPERATION_FEATURE_COUNT      = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.fixManipModule.AbstractOperation <em>Abstract Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.AbstractOperation
   * @generated
   */
  EClass getAbstractOperation();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.fixManipModule.AbstractOperation#isEnabled <em>Enabled</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.AbstractOperation#isEnabled()
   * @see #getAbstractOperation()
   * @generated
   */
  EAttribute getAbstractOperation_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.fixManipModule.AddOperation <em>Add Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.AddOperation
   * @generated
   */
  EClass getAddOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.fixManipModule.AddOperation#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tag</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.AddOperation#getTag()
   * @see #getAddOperation()
   * @generated
   */
  EReference getAddOperation_Tag();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.fixManipModule.AddOperation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.AddOperation#getValue()
   * @see #getAddOperation()
   * @generated
   */
  EReference getAddOperation_Value();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.fixManipModule.AddOperation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.AddOperation#getName()
   * @see #getAddOperation()
   * @generated
   */
  EReference getAddOperation_Name();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.fixManipModule.DeleteOperation <em>Delete Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.DeleteOperation
   * @generated
   */
  EClass getDeleteOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.fixManipModule.DeleteOperation#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tag</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.DeleteOperation#getTag()
   * @see #getDeleteOperation()
   * @generated
   */
  EReference getDeleteOperation_Tag();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.fixManipModule.DeleteOperation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.DeleteOperation#getValue()
   * @see #getDeleteOperation()
   * @generated
   */
  EReference getDeleteOperation_Value();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.fixManipModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.fixManipModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.fixManipModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.fixManipModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.fixManipModule.DocumentRoot#getFixManipConfiguration <em>Fix Manip Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fix Manip Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.DocumentRoot#getFixManipConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_FixManipConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.fixManipModule.FixManipConfiguration <em>Fix Manip Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Fix Manip Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.FixManipConfiguration
   * @generated
   */
  EClass getFixManipConfiguration();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.fixManipModule.FixManipConfiguration#getInputResource <em>Input Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.FixManipConfiguration#getInputResource()
   * @see #getFixManipConfiguration()
   * @generated
   */
  EReference getFixManipConfiguration_InputResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.fixManipModule.FixManipConfiguration#getOutputResource <em>Output Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.FixManipConfiguration#getOutputResource()
   * @see #getFixManipConfiguration()
   * @generated
   */
  EReference getFixManipConfiguration_OutputResource();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.fixManipModule.FixManipConfiguration#getOperations <em>Operations</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.FixManipConfiguration#getOperations()
   * @see #getFixManipConfiguration()
   * @generated
   */
  EReference getFixManipConfiguration_Operations();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.fixManipModule.ReplaceOperation <em>Replace Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Replace Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.ReplaceOperation
   * @generated
   */
  EClass getReplaceOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.fixManipModule.ReplaceOperation#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tag</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.ReplaceOperation#getTag()
   * @see #getReplaceOperation()
   * @generated
   */
  EReference getReplaceOperation_Tag();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.fixManipModule.ReplaceOperation#getOldValue <em>Old Value</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Old Value</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.ReplaceOperation#getOldValue()
   * @see #getReplaceOperation()
   * @generated
   */
  EReference getReplaceOperation_OldValue();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.fixManipModule.ReplaceOperation#getNewValue <em>New Value</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>New Value</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.ReplaceOperation#getNewValue()
   * @see #getReplaceOperation()
   * @generated
   */
  EReference getReplaceOperation_NewValue();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.fixManipModule.UpdateBodyLengthOperation <em>Update Body Length Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Body Length Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.UpdateBodyLengthOperation
   * @generated
   */
  EClass getUpdateBodyLengthOperation();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.fixManipModule.UpdateCheckSumOperation <em>Update Check Sum Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Check Sum Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.UpdateCheckSumOperation
   * @generated
   */
  EClass getUpdateCheckSumOperation();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.fixManipModule.ValueReplaceOperation <em>Value Replace Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Replace Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.ValueReplaceOperation
   * @generated
   */
  EClass getValueReplaceOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.fixManipModule.ValueReplaceOperation#getRegExp <em>Reg Exp</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Reg Exp</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.ValueReplaceOperation#getRegExp()
   * @see #getValueReplaceOperation()
   * @generated
   */
  EReference getValueReplaceOperation_RegExp();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.fixManipModule.ValueReplaceOperation#getNewValue <em>New Value</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>New Value</em>'.
   * @see com.ms.qaTools.saturn.modules.fixManipModule.ValueReplaceOperation#getNewValue()
   * @see #getValueReplaceOperation()
   * @generated
   */
  EReference getValueReplaceOperation_NewValue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FixManipModuleFactory getFixManipModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.AbstractOperationImpl <em>Abstract Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.AbstractOperationImpl
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getAbstractOperation()
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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.AddOperationImpl <em>Add Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.AddOperationImpl
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getAddOperation()
     * @generated
     */
    EClass     ADD_OPERATION                            = eINSTANCE.getAddOperation();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference ADD_OPERATION__TAG                       = eINSTANCE.getAddOperation_Tag();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_OPERATION__VALUE                     = eINSTANCE.getAddOperation_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_OPERATION__NAME                      = eINSTANCE.getAddOperation_Name();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.DeleteOperationImpl <em>Delete Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.DeleteOperationImpl
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getDeleteOperation()
     * @generated
     */
    EClass     DELETE_OPERATION                         = eINSTANCE.getDeleteOperation();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DELETE_OPERATION__TAG                    = eINSTANCE.getDeleteOperation_Tag();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_OPERATION__VALUE                  = eINSTANCE.getDeleteOperation_Value();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>Fix Manip Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__FIX_MANIP_CONFIGURATION   = eINSTANCE.getDocumentRoot_FixManipConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipConfigurationImpl <em>Fix Manip Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getFixManipConfiguration()
     * @generated
     */
    EClass     FIX_MANIP_CONFIGURATION                  = eINSTANCE.getFixManipConfiguration();

    /**
     * The meta object literal for the '<em><b>Input Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference FIX_MANIP_CONFIGURATION__INPUT_RESOURCE  = eINSTANCE.getFixManipConfiguration_InputResource();

    /**
     * The meta object literal for the '<em><b>Output Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference FIX_MANIP_CONFIGURATION__OUTPUT_RESOURCE = eINSTANCE.getFixManipConfiguration_OutputResource();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference FIX_MANIP_CONFIGURATION__OPERATIONS      = eINSTANCE.getFixManipConfiguration_Operations();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.ReplaceOperationImpl <em>Replace Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.ReplaceOperationImpl
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getReplaceOperation()
     * @generated
     */
    EClass     REPLACE_OPERATION                        = eINSTANCE.getReplaceOperation();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference REPLACE_OPERATION__TAG                   = eINSTANCE.getReplaceOperation_Tag();

    /**
     * The meta object literal for the '<em><b>Old Value</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference REPLACE_OPERATION__OLD_VALUE             = eINSTANCE.getReplaceOperation_OldValue();

    /**
     * The meta object literal for the '<em><b>New Value</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference REPLACE_OPERATION__NEW_VALUE             = eINSTANCE.getReplaceOperation_NewValue();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.UpdateBodyLengthOperationImpl <em>Update Body Length Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.UpdateBodyLengthOperationImpl
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getUpdateBodyLengthOperation()
     * @generated
     */
    EClass     UPDATE_BODY_LENGTH_OPERATION             = eINSTANCE.getUpdateBodyLengthOperation();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.UpdateCheckSumOperationImpl <em>Update Check Sum Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.UpdateCheckSumOperationImpl
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getUpdateCheckSumOperation()
     * @generated
     */
    EClass     UPDATE_CHECK_SUM_OPERATION               = eINSTANCE.getUpdateCheckSumOperation();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.ValueReplaceOperationImpl <em>Value Replace Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.ValueReplaceOperationImpl
     * @see com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipModulePackageImpl#getValueReplaceOperation()
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

  }

} // FixManipModulePackage
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
