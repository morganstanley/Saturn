package com.ms.qaTools.saturn.modules.sqlModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.ms.qaTools.saturn.modules.sqlModule.SqlModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface SqlModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String           eNAME                                             = "sqlModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String           eNS_URI                                           = "http://www.ms.com/2006/Saturn/Modules/SQL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String           eNS_PREFIX                                        = "sqlModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  SqlModulePackage eINSTANCE                                         = com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.AbstractSQLOperationImpl <em>Abstract SQL Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.AbstractSQLOperationImpl
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getAbstractSQLOperation()
   * @generated
   */
  int              ABSTRACT_SQL_OPERATION                            = 0;

  /**
   * The number of structural features of the '<em>Abstract SQL Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              ABSTRACT_SQL_OPERATION_FEATURE_COUNT              = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.ClearTableImpl <em>Clear Table</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.ClearTableImpl
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getClearTable()
   * @generated
   */
  int              CLEAR_TABLE                                       = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_TABLE__DESCRIPTION = ValuesPackage.COMPLEX_VALUE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CLEAR_TABLE__MIXED                                = ValuesPackage.COMPLEX_VALUE__MIXED;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CLEAR_TABLE__NULL                                 = ValuesPackage.COMPLEX_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CLEAR_TABLE__GROUP                                = ValuesPackage.COMPLEX_VALUE__GROUP;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              CLEAR_TABLE__TEXT                                 = ValuesPackage.COMPLEX_VALUE__TEXT;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CLEAR_TABLE__ENV_VAR                              = ValuesPackage.COMPLEX_VALUE__ENV_VAR;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              CLEAR_TABLE__FILE                                 = ValuesPackage.COMPLEX_VALUE__FILE;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CLEAR_TABLE__XPATH_VALUE                          = ValuesPackage.COMPLEX_VALUE__XPATH_VALUE;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_TABLE__JSON_VALUE = ValuesPackage.COMPLEX_VALUE__JSON_VALUE;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_TABLE__FIX_VALUE = ValuesPackage.COMPLEX_VALUE__FIX_VALUE;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CLEAR_TABLE__CELL_VALUE                           = ValuesPackage.COMPLEX_VALUE__CELL_VALUE;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CLEAR_TABLE__PROPERTY_VALUE                       = ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              CLEAR_TABLE__CODE                                 = ValuesPackage.COMPLEX_VALUE__CODE;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CLEAR_TABLE__RUN_NUMBER                           = ValuesPackage.COMPLEX_VALUE__RUN_NUMBER;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CLEAR_TABLE__REFERENCE                            = ValuesPackage.COMPLEX_VALUE__REFERENCE;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CLEAR_TABLE__MEMOIZE                              = ValuesPackage.COMPLEX_VALUE__MEMOIZE;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CLEAR_TABLE__ENABLED                              = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Clear Table</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              CLEAR_TABLE_FEATURE_COUNT                         = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int              DOCUMENT_ROOT                                     = 2;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DOCUMENT_ROOT__MIXED                              = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DOCUMENT_ROOT__XMLNS_PREFIX_MAP                   = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DOCUMENT_ROOT__XSI_SCHEMA_LOCATION                = 2;

  /**
   * The feature id for the '<em><b>SQL Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              DOCUMENT_ROOT__SQL_CONFIGURATION                  = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              DOCUMENT_ROOT_FEATURE_COUNT                       = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.ExecuteCommandImpl <em>Execute Command</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.ExecuteCommandImpl
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getExecuteCommand()
   * @generated
   */
  int              EXECUTE_COMMAND                                   = 3;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              EXECUTE_COMMAND__EXCEPTION                        = 0;

  /**
   * The feature id for the '<em><b>SQL</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              EXECUTE_COMMAND__SQL                              = 1;

  /**
   * The feature id for the '<em><b>Parameter File</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              EXECUTE_COMMAND__PARAMETER_FILE                   = 2;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              EXECUTE_COMMAND__ENABLED                          = 3;

  /**
   * The number of structural features of the '<em>Execute Command</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              EXECUTE_COMMAND_FEATURE_COUNT                     = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.FetchQueryImpl <em>Fetch Query</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.FetchQueryImpl
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getFetchQuery()
   * @generated
   */
  int              FETCH_QUERY                                       = 4;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              FETCH_QUERY__EXCEPTION                            = 0;

  /**
   * The feature id for the '<em><b>SQL</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              FETCH_QUERY__SQL                                  = 1;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              FETCH_QUERY__OUTPUT                               = 2;

  /**
   * The feature id for the '<em><b>Parameter File</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              FETCH_QUERY__PARAMETER_FILE                       = 3;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              FETCH_QUERY__ENABLED                              = 4;

  /**
   * The number of structural features of the '<em>Fetch Query</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              FETCH_QUERY_FEATURE_COUNT                         = 5;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.LoadTableImpl <em>Load Table</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.LoadTableImpl
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getLoadTable()
   * @generated
   */
  int              LOAD_TABLE                                        = 5;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              LOAD_TABLE__EXCEPTION                             = 0;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              LOAD_TABLE__INPUT                                 = 1;

  /**
   * The feature id for the '<em><b>SQL</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              LOAD_TABLE__SQL                                   = 2;

  /**
   * The feature id for the '<em><b>Clean Load</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              LOAD_TABLE__CLEAN_LOAD                            = 3;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              LOAD_TABLE__ENABLED                               = 4;

  /**
   * The feature id for the '<em><b>Batch Size</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              LOAD_TABLE__BATCH_SIZE                            = 5;

  /**
   * The number of structural features of the '<em>Load Table</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              LOAD_TABLE_FEATURE_COUNT                          = 6;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.ProcCallDefinitionImpl <em>Proc Call Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.ProcCallDefinitionImpl
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getProcCallDefinition()
   * @generated
   */
  int              PROC_CALL_DEFINITION                              = 6;

  /**
   * The feature id for the '<em><b>SQL</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              PROC_CALL_DEFINITION__SQL                         = 0;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              PROC_CALL_DEFINITION__OUTPUT                      = 1;

  /**
   * The feature id for the '<em><b>Parameter File</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              PROC_CALL_DEFINITION__PARAMETER_FILE              = 2;

  /**
   * The feature id for the '<em><b>Ignore Val</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              PROC_CALL_DEFINITION__IGNORE_VAL                  = 3;

  /**
   * The feature id for the '<em><b>Has Output</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              PROC_CALL_DEFINITION__HAS_OUTPUT                  = 4;

  /**
   * The feature id for the '<em><b>Call Count</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              PROC_CALL_DEFINITION__CALL_COUNT                  = 5;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              PROC_CALL_DEFINITION__ENABLED                     = 6;

  /**
   * The number of structural features of the '<em>Proc Call Definition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              PROC_CALL_DEFINITION_FEATURE_COUNT                = 7;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLCallOperationImpl <em>SQL Call Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SQLCallOperationImpl
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getSQLCallOperation()
   * @generated
   */
  int              SQL_CALL_OPERATION                                = 7;

  /**
   * The feature id for the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_CALL_OPERATION__OUTPUT_RESOURCE               = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_CALL_OPERATION__PARAMETER_RESOURCE            = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Procedure Calls</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_CALL_OPERATION__PROCEDURE_CALLS               = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Default Output Resource Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_CALL_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE  = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>SQL Call Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_CALL_OPERATION_FEATURE_COUNT                  = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLClearOperationImpl <em>SQL Clear Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SQLClearOperationImpl
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getSQLClearOperation()
   * @generated
   */
  int              SQL_CLEAR_OPERATION                               = 8;

  /**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_CLEAR_OPERATION__TABLES                       = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Table Group Definition</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_CLEAR_OPERATION__TABLE_GROUP_DEFINITION       = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SQL Clear Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_CLEAR_OPERATION_FEATURE_COUNT                 = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLConfigurationImpl <em>SQL Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SQLConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getSQLConfiguration()
   * @generated
   */
  int              SQL_CONFIGURATION                                 = 9;

  /**
   * The feature id for the '<em><b>Database Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_CONFIGURATION__DATABASE_RESOURCE              = 0;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              SQL_CONFIGURATION__OPERATION                      = 1;

  /**
   * The number of structural features of the '<em>SQL Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_CONFIGURATION_FEATURE_COUNT                   = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLExecuteOperationImpl <em>SQL Execute Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SQLExecuteOperationImpl
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getSQLExecuteOperation()
   * @generated
   */
  int              SQL_EXECUTE_OPERATION                             = 10;

  /**
   * The feature id for the '<em><b>Parameter Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_EXECUTE_OPERATION__PARAMETER_RESOURCE         = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_EXECUTE_OPERATION__COMMANDS                   = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SQL Execute Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_EXECUTE_OPERATION_FEATURE_COUNT               = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLFetchOperationImpl <em>SQL Fetch Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SQLFetchOperationImpl
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getSQLFetchOperation()
   * @generated
   */
  int              SQL_FETCH_OPERATION                               = 11;

  /**
   * The feature id for the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_FETCH_OPERATION__OUTPUT_RESOURCE              = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_FETCH_OPERATION__PARAMETER_RESOURCE           = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Queries</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_FETCH_OPERATION__QUERIES                      = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Table Group Definition</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_FETCH_OPERATION__TABLE_GROUP_DEFINITION       = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Default Output Resource Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_FETCH_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>SQL Fetch Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_FETCH_OPERATION_FEATURE_COUNT                 = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLLoadOperationImpl <em>SQL Load Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SQLLoadOperationImpl
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getSQLLoadOperation()
   * @generated
   */
  int              SQL_LOAD_OPERATION                                = 12;

  /**
   * The feature id for the '<em><b>Input Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_LOAD_OPERATION__INPUT_RESOURCE                = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_LOAD_OPERATION__TABLES                        = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Table Group Definition</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_LOAD_OPERATION__TABLE_GROUP_DEFINITION        = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Default Input Resource Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_LOAD_OPERATION__DEFAULT_INPUT_RESOURCE_TYPE   = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>SQL Load Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              SQL_LOAD_OPERATION_FEATURE_COUNT                  = ABSTRACT_SQL_OPERATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum <em>IO File Types Enum</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getIOFileTypesEnum()
   * @generated
   */
  int              IO_FILE_TYPES_ENUM                                = 13;

  /**
   * The meta object id for the '<em>IO File Types Enum Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum
   * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getIOFileTypesEnumObject()
   * @generated
   */
  int              IO_FILE_TYPES_ENUM_OBJECT                         = 14;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.sqlModule.AbstractSQLOperation <em>Abstract SQL Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract SQL Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.AbstractSQLOperation
   * @generated
   */
  EClass getAbstractSQLOperation();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.sqlModule.ClearTable <em>Clear Table</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Clear Table</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ClearTable
   * @generated
   */
  EClass getClearTable();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.sqlModule.ClearTable#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ClearTable#isEnabled()
   * @see #getClearTable()
   * @generated
   */
  EAttribute getClearTable_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.sqlModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.sqlModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.sqlModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.sqlModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.sqlModule.DocumentRoot#getSQLConfiguration <em>SQL Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>SQL Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.DocumentRoot#getSQLConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SQLConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.sqlModule.ExecuteCommand <em>Execute Command</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Execute Command</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ExecuteCommand
   * @generated
   */
  EClass getExecuteCommand();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.sqlModule.ExecuteCommand#getException <em>Exception</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ExecuteCommand#getException()
   * @see #getExecuteCommand()
   * @generated
   */
  EReference getExecuteCommand_Exception();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.ExecuteCommand#getSQL <em>SQL</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>SQL</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ExecuteCommand#getSQL()
   * @see #getExecuteCommand()
   * @generated
   */
  EReference getExecuteCommand_SQL();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.sqlModule.ExecuteCommand#getParameterFile <em>Parameter File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Parameter File</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ExecuteCommand#getParameterFile()
   * @see #getExecuteCommand()
   * @generated
   */
  EReference getExecuteCommand_ParameterFile();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.sqlModule.ExecuteCommand#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ExecuteCommand#isEnabled()
   * @see #getExecuteCommand()
   * @generated
   */
  EAttribute getExecuteCommand_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.sqlModule.FetchQuery <em>Fetch Query</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Fetch Query</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.FetchQuery
   * @generated
   */
  EClass getFetchQuery();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.FetchQuery#getException <em>Exception</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.FetchQuery#getException()
   * @see #getFetchQuery()
   * @generated
   */
  EReference getFetchQuery_Exception();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.FetchQuery#getSQL <em>SQL</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>SQL</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.FetchQuery#getSQL()
   * @see #getFetchQuery()
   * @generated
   */
  EReference getFetchQuery_SQL();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.FetchQuery#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.FetchQuery#getOutput()
   * @see #getFetchQuery()
   * @generated
   */
  EReference getFetchQuery_Output();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.sqlModule.FetchQuery#getParameterFile <em>Parameter File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Parameter File</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.FetchQuery#getParameterFile()
   * @see #getFetchQuery()
   * @generated
   */
  EReference getFetchQuery_ParameterFile();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.sqlModule.FetchQuery#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.FetchQuery#isEnabled()
   * @see #getFetchQuery()
   * @generated
   */
  EAttribute getFetchQuery_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable <em>Load Table</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Table</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.LoadTable
   * @generated
   */
  EClass getLoadTable();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getException <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getException()
   * @see #getLoadTable()
   * @generated
   */
  EReference getLoadTable_Exception();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getInput <em>Input</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getInput()
   * @see #getLoadTable()
   * @generated
   */
  EReference getLoadTable_Input();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getSQL <em>SQL</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>SQL</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getSQL()
   * @see #getLoadTable()
   * @generated
   */
  EReference getLoadTable_SQL();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getBatchSize <em>Batch Size</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Batch Size</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.LoadTable#getBatchSize()
   * @see #getLoadTable()
   * @generated
   */
  EAttribute getLoadTable_BatchSize();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#isCleanLoad <em>Clean Load</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clean Load</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.LoadTable#isCleanLoad()
   * @see #getLoadTable()
   * @generated
   */
  EAttribute getLoadTable_CleanLoad();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.sqlModule.LoadTable#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.LoadTable#isEnabled()
   * @see #getLoadTable()
   * @generated
   */
  EAttribute getLoadTable_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition <em>Proc Call Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Proc Call Definition</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition
   * @generated
   */
  EClass getProcCallDefinition();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getSQL <em>SQL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SQL</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getSQL()
   * @see #getProcCallDefinition()
   * @generated
   */
  EReference getProcCallDefinition_SQL();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getOutput()
   * @see #getProcCallDefinition()
   * @generated
   */
  EReference getProcCallDefinition_Output();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getParameterFile <em>Parameter File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Parameter File</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getParameterFile()
   * @see #getProcCallDefinition()
   * @generated
   */
  EReference getProcCallDefinition_ParameterFile();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getIgnoreVal <em>Ignore Val</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Ignore Val</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getIgnoreVal()
   * @see #getProcCallDefinition()
   * @generated
   */
  EReference getProcCallDefinition_IgnoreVal();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getCallCount <em>Call Count</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Call Count</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#getCallCount()
   * @see #getProcCallDefinition()
   * @generated
   */
  EAttribute getProcCallDefinition_CallCount();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#isEnabled()
   * @see #getProcCallDefinition()
   * @generated
   */
  EAttribute getProcCallDefinition_Enabled();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#isHasOutput <em>Has Output</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Has Output</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition#isHasOutput()
   * @see #getProcCallDefinition()
   * @generated
   */
  EAttribute getProcCallDefinition_HasOutput();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation <em>SQL Call Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>SQL Call Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation
   * @generated
   */
  EClass getSQLCallOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getOutputResource <em>Output Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Output Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getOutputResource()
   * @see #getSQLCallOperation()
   * @generated
   */
  EReference getSQLCallOperation_OutputResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getParameterResource <em>Parameter Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getParameterResource()
   * @see #getSQLCallOperation()
   * @generated
   */
  EReference getSQLCallOperation_ParameterResource();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getProcedureCalls <em>Procedure Calls</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Procedure Calls</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getProcedureCalls()
   * @see #getSQLCallOperation()
   * @generated
   */
  EReference getSQLCallOperation_ProcedureCalls();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getDefaultOutputResourceType <em>Default Output Resource Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Output Resource Type</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation#getDefaultOutputResourceType()
   * @see #getSQLCallOperation()
   * @generated
   */
  EAttribute getSQLCallOperation_DefaultOutputResourceType();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLClearOperation <em>SQL Clear Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>SQL Clear Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLClearOperation
   * @generated
   */
  EClass getSQLClearOperation();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLClearOperation#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLClearOperation#getTables()
   * @see #getSQLClearOperation()
   * @generated
   */
  EReference getSQLClearOperation_Tables();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLClearOperation#getTableGroupDefinition <em>Table Group Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table Group Definition</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLClearOperation#getTableGroupDefinition()
   * @see #getSQLClearOperation()
   * @generated
   */
  EReference getSQLClearOperation_TableGroupDefinition();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLConfiguration <em>SQL Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>SQL Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLConfiguration
   * @generated
   */
  EClass getSQLConfiguration();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLConfiguration#getDatabaseResource <em>Database Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Database Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLConfiguration#getDatabaseResource()
   * @see #getSQLConfiguration()
   * @generated
   */
  EReference getSQLConfiguration_DatabaseResource();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.sqlModule.SQLConfiguration#getOperation <em>Operation</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLConfiguration#getOperation()
   * @see #getSQLConfiguration()
   * @generated
   */
  EReference getSQLConfiguration_Operation();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLExecuteOperation <em>SQL Execute Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>SQL Execute Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLExecuteOperation
   * @generated
   */
  EClass getSQLExecuteOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLExecuteOperation#getParameterResource <em>Parameter Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLExecuteOperation#getParameterResource()
   * @see #getSQLExecuteOperation()
   * @generated
   */
  EReference getSQLExecuteOperation_ParameterResource();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.sqlModule.SQLExecuteOperation#getCommands <em>Commands</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLExecuteOperation#getCommands()
   * @see #getSQLExecuteOperation()
   * @generated
   */
  EReference getSQLExecuteOperation_Commands();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation <em>SQL Fetch Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>SQL Fetch Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation
   * @generated
   */
  EClass getSQLFetchOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getOutputResource <em>Output Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Output Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getOutputResource()
   * @see #getSQLFetchOperation()
   * @generated
   */
  EReference getSQLFetchOperation_OutputResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getParameterResource <em>Parameter Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getParameterResource()
   * @see #getSQLFetchOperation()
   * @generated
   */
  EReference getSQLFetchOperation_ParameterResource();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getQueries <em>Queries</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Queries</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getQueries()
   * @see #getSQLFetchOperation()
   * @generated
   */
  EReference getSQLFetchOperation_Queries();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getTableGroupDefinition <em>Table Group Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table Group Definition</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getTableGroupDefinition()
   * @see #getSQLFetchOperation()
   * @generated
   */
  EReference getSQLFetchOperation_TableGroupDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getDefaultOutputResourceType <em>Default Output Resource Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Output Resource Type</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation#getDefaultOutputResourceType()
   * @see #getSQLFetchOperation()
   * @generated
   */
  EAttribute getSQLFetchOperation_DefaultOutputResourceType();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation <em>SQL Load Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>SQL Load Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation
   * @generated
   */
  EClass getSQLLoadOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation#getInputResource <em>Input Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Input Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation#getInputResource()
   * @see #getSQLLoadOperation()
   * @generated
   */
  EReference getSQLLoadOperation_InputResource();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation#getTables()
   * @see #getSQLLoadOperation()
   * @generated
   */
  EReference getSQLLoadOperation_Tables();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation#getTableGroupDefinition <em>Table Group Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table Group Definition</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation#getTableGroupDefinition()
   * @see #getSQLLoadOperation()
   * @generated
   */
  EReference getSQLLoadOperation_TableGroupDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation#getDefaultInputResourceType <em>Default Input Resource Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Input Resource Type</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation#getDefaultInputResourceType()
   * @see #getSQLLoadOperation()
   * @generated
   */
  EAttribute getSQLLoadOperation_DefaultInputResourceType();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum <em>IO File Types Enum</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>IO File Types Enum</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum
   * @generated
   */
  EEnum getIOFileTypesEnum();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum <em>IO File Types Enum Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>IO File Types Enum Object</em>'.
   * @see com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum
   * @model instanceClass="com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum"
   *        extendedMetaData="name='IOFileTypesEnum:Object' baseType='IOFileTypesEnum'"
   * @generated
   */
  EDataType getIOFileTypesEnumObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SqlModuleFactory getSqlModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.AbstractSQLOperationImpl <em>Abstract SQL Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.AbstractSQLOperationImpl
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getAbstractSQLOperation()
     * @generated
     */
    EClass     ABSTRACT_SQL_OPERATION                            = eINSTANCE.getAbstractSQLOperation();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.ClearTableImpl <em>Clear Table</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.ClearTableImpl
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getClearTable()
     * @generated
     */
    EClass     CLEAR_TABLE                                       = eINSTANCE.getClearTable();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute CLEAR_TABLE__ENABLED                              = eINSTANCE.getClearTable_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>SQL Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__SQL_CONFIGURATION                  = eINSTANCE.getDocumentRoot_SQLConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.ExecuteCommandImpl <em>Execute Command</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.ExecuteCommandImpl
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getExecuteCommand()
     * @generated
     */
    EClass     EXECUTE_COMMAND                                   = eINSTANCE.getExecuteCommand();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTE_COMMAND__EXCEPTION                        = eINSTANCE.getExecuteCommand_Exception();

    /**
     * The meta object literal for the '<em><b>SQL</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference EXECUTE_COMMAND__SQL                              = eINSTANCE.getExecuteCommand_SQL();

    /**
     * The meta object literal for the '<em><b>Parameter File</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference EXECUTE_COMMAND__PARAMETER_FILE                   = eINSTANCE.getExecuteCommand_ParameterFile();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute EXECUTE_COMMAND__ENABLED                          = eINSTANCE.getExecuteCommand_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.FetchQueryImpl <em>Fetch Query</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.FetchQueryImpl
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getFetchQuery()
     * @generated
     */
    EClass     FETCH_QUERY                                       = eINSTANCE.getFetchQuery();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference FETCH_QUERY__EXCEPTION                            = eINSTANCE.getFetchQuery_Exception();

    /**
     * The meta object literal for the '<em><b>SQL</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference FETCH_QUERY__SQL                                  = eINSTANCE.getFetchQuery_SQL();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FETCH_QUERY__OUTPUT                               = eINSTANCE.getFetchQuery_Output();

    /**
     * The meta object literal for the '<em><b>Parameter File</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference FETCH_QUERY__PARAMETER_FILE                       = eINSTANCE.getFetchQuery_ParameterFile();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute FETCH_QUERY__ENABLED                              = eINSTANCE.getFetchQuery_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.LoadTableImpl <em>Load Table</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.LoadTableImpl
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getLoadTable()
     * @generated
     */
    EClass     LOAD_TABLE                                        = eINSTANCE.getLoadTable();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference LOAD_TABLE__EXCEPTION                             = eINSTANCE.getLoadTable_Exception();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOAD_TABLE__INPUT                                 = eINSTANCE.getLoadTable_Input();

    /**
     * The meta object literal for the '<em><b>SQL</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference LOAD_TABLE__SQL                                   = eINSTANCE.getLoadTable_SQL();

    /**
     * The meta object literal for the '<em><b>Batch Size</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute LOAD_TABLE__BATCH_SIZE                            = eINSTANCE.getLoadTable_BatchSize();

    /**
     * The meta object literal for the '<em><b>Clean Load</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute LOAD_TABLE__CLEAN_LOAD                            = eINSTANCE.getLoadTable_CleanLoad();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute LOAD_TABLE__ENABLED                               = eINSTANCE.getLoadTable_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.ProcCallDefinitionImpl <em>Proc Call Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.ProcCallDefinitionImpl
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getProcCallDefinition()
     * @generated
     */
    EClass     PROC_CALL_DEFINITION                              = eINSTANCE.getProcCallDefinition();

    /**
     * The meta object literal for the '<em><b>SQL</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference PROC_CALL_DEFINITION__SQL                         = eINSTANCE.getProcCallDefinition_SQL();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROC_CALL_DEFINITION__OUTPUT                      = eINSTANCE.getProcCallDefinition_Output();

    /**
     * The meta object literal for the '<em><b>Parameter File</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference PROC_CALL_DEFINITION__PARAMETER_FILE              = eINSTANCE.getProcCallDefinition_ParameterFile();

    /**
     * The meta object literal for the '<em><b>Ignore Val</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference PROC_CALL_DEFINITION__IGNORE_VAL                  = eINSTANCE.getProcCallDefinition_IgnoreVal();

    /**
     * The meta object literal for the '<em><b>Call Count</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute PROC_CALL_DEFINITION__CALL_COUNT                  = eINSTANCE.getProcCallDefinition_CallCount();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute PROC_CALL_DEFINITION__ENABLED                     = eINSTANCE.getProcCallDefinition_Enabled();

    /**
     * The meta object literal for the '<em><b>Has Output</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute PROC_CALL_DEFINITION__HAS_OUTPUT                  = eINSTANCE.getProcCallDefinition_HasOutput();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLCallOperationImpl <em>SQL Call Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SQLCallOperationImpl
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getSQLCallOperation()
     * @generated
     */
    EClass     SQL_CALL_OPERATION                                = eINSTANCE.getSQLCallOperation();

    /**
     * The meta object literal for the '<em><b>Output Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SQL_CALL_OPERATION__OUTPUT_RESOURCE               = eINSTANCE.getSQLCallOperation_OutputResource();

    /**
     * The meta object literal for the '<em><b>Parameter Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SQL_CALL_OPERATION__PARAMETER_RESOURCE            = eINSTANCE.getSQLCallOperation_ParameterResource();

    /**
     * The meta object literal for the '<em><b>Procedure Calls</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SQL_CALL_OPERATION__PROCEDURE_CALLS               = eINSTANCE.getSQLCallOperation_ProcedureCalls();

    /**
     * The meta object literal for the '<em><b>Default Output Resource Type</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EAttribute SQL_CALL_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE  = eINSTANCE.getSQLCallOperation_DefaultOutputResourceType();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLClearOperationImpl <em>SQL Clear Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SQLClearOperationImpl
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getSQLClearOperation()
     * @generated
     */
    EClass     SQL_CLEAR_OPERATION                               = eINSTANCE.getSQLClearOperation();

    /**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_CLEAR_OPERATION__TABLES                       = eINSTANCE.getSQLClearOperation_Tables();

    /**
     * The meta object literal for the '<em><b>Table Group Definition</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SQL_CLEAR_OPERATION__TABLE_GROUP_DEFINITION       = eINSTANCE.getSQLClearOperation_TableGroupDefinition();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLConfigurationImpl <em>SQL Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SQLConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getSQLConfiguration()
     * @generated
     */
    EClass     SQL_CONFIGURATION                                 = eINSTANCE.getSQLConfiguration();

    /**
     * The meta object literal for the '<em><b>Database Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SQL_CONFIGURATION__DATABASE_RESOURCE              = eINSTANCE.getSQLConfiguration_DatabaseResource();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_CONFIGURATION__OPERATION                      = eINSTANCE.getSQLConfiguration_Operation();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLExecuteOperationImpl <em>SQL Execute Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SQLExecuteOperationImpl
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getSQLExecuteOperation()
     * @generated
     */
    EClass     SQL_EXECUTE_OPERATION                             = eINSTANCE.getSQLExecuteOperation();

    /**
     * The meta object literal for the '<em><b>Parameter Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SQL_EXECUTE_OPERATION__PARAMETER_RESOURCE         = eINSTANCE.getSQLExecuteOperation_ParameterResource();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SQL_EXECUTE_OPERATION__COMMANDS                   = eINSTANCE.getSQLExecuteOperation_Commands();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLFetchOperationImpl <em>SQL Fetch Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SQLFetchOperationImpl
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getSQLFetchOperation()
     * @generated
     */
    EClass     SQL_FETCH_OPERATION                               = eINSTANCE.getSQLFetchOperation();

    /**
     * The meta object literal for the '<em><b>Output Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SQL_FETCH_OPERATION__OUTPUT_RESOURCE              = eINSTANCE.getSQLFetchOperation_OutputResource();

    /**
     * The meta object literal for the '<em><b>Parameter Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SQL_FETCH_OPERATION__PARAMETER_RESOURCE           = eINSTANCE.getSQLFetchOperation_ParameterResource();

    /**
     * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_FETCH_OPERATION__QUERIES                      = eINSTANCE.getSQLFetchOperation_Queries();

    /**
     * The meta object literal for the '<em><b>Table Group Definition</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SQL_FETCH_OPERATION__TABLE_GROUP_DEFINITION       = eINSTANCE.getSQLFetchOperation_TableGroupDefinition();

    /**
     * The meta object literal for the '<em><b>Default Output Resource Type</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EAttribute SQL_FETCH_OPERATION__DEFAULT_OUTPUT_RESOURCE_TYPE = eINSTANCE.getSQLFetchOperation_DefaultOutputResourceType();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.sqlModule.impl.SQLLoadOperationImpl <em>SQL Load Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SQLLoadOperationImpl
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getSQLLoadOperation()
     * @generated
     */
    EClass     SQL_LOAD_OPERATION                                = eINSTANCE.getSQLLoadOperation();

    /**
     * The meta object literal for the '<em><b>Input Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SQL_LOAD_OPERATION__INPUT_RESOURCE                = eINSTANCE.getSQLLoadOperation_InputResource();

    /**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SQL_LOAD_OPERATION__TABLES                        = eINSTANCE.getSQLLoadOperation_Tables();

    /**
     * The meta object literal for the '<em><b>Table Group Definition</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SQL_LOAD_OPERATION__TABLE_GROUP_DEFINITION        = eINSTANCE.getSQLLoadOperation_TableGroupDefinition();

    /**
     * The meta object literal for the '<em><b>Default Input Resource Type</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EAttribute SQL_LOAD_OPERATION__DEFAULT_INPUT_RESOURCE_TYPE   = eINSTANCE.getSQLLoadOperation_DefaultInputResourceType();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum <em>IO File Types Enum</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getIOFileTypesEnum()
     * @generated
     */
    EEnum      IO_FILE_TYPES_ENUM                                = eINSTANCE.getIOFileTypesEnum();

    /**
     * The meta object literal for the '<em>IO File Types Enum Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.sqlModule.IOFileTypesEnum
     * @see com.ms.qaTools.saturn.modules.sqlModule.impl.SqlModulePackageImpl#getIOFileTypesEnumObject()
     * @generated
     */
    EDataType  IO_FILE_TYPES_ENUM_OBJECT                         = eINSTANCE.getIOFileTypesEnumObject();

  }

} // SqlModulePackage
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
