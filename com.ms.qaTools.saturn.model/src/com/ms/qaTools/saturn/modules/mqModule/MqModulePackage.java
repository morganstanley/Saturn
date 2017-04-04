package com.ms.qaTools.saturn.modules.mqModule;

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
 * @see com.ms.qaTools.saturn.modules.mqModule.MqModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface MqModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String          eNAME                                    = "mqModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String          eNS_URI                                  = "http://www.ms.com/2006/Saturn/Modules/MQ";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String          eNS_PREFIX                               = "mqModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  MqModulePackage eINSTANCE                                = com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.AbstractMessageProcessorImpl <em>Abstract Message Processor</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.AbstractMessageProcessorImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getAbstractMessageProcessor()
   * @generated
   */
  int             ABSTRACT_MESSAGE_PROCESSOR               = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             ABSTRACT_MESSAGE_PROCESSOR__ENABLED      = 0;

  /**
   * The number of structural features of the '<em>Abstract Message Processor</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             ABSTRACT_MESSAGE_PROCESSOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.AbstractMQOperationImpl <em>Abstract MQ Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.AbstractMQOperationImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getAbstractMQOperation()
   * @generated
   */
  int             ABSTRACT_MQ_OPERATION                    = 1;

  /**
   * The number of structural features of the '<em>Abstract MQ Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             ABSTRACT_MQ_OPERATION_FEATURE_COUNT      = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.CpsHeaderProcessorImpl <em>Cps Header Processor</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.CpsHeaderProcessorImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getCpsHeaderProcessor()
   * @generated
   */
  int             CPS_HEADER_PROCESSOR                     = 2;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             CPS_HEADER_PROCESSOR__ENABLED            = ABSTRACT_MESSAGE_PROCESSOR__ENABLED;

  /**
   * The number of structural features of the '<em>Cps Header Processor</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             CPS_HEADER_PROCESSOR_FEATURE_COUNT       = ABSTRACT_MESSAGE_PROCESSOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int             DOCUMENT_ROOT                            = 3;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             DOCUMENT_ROOT__MIXED                     = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             DOCUMENT_ROOT__XMLNS_PREFIX_MAP          = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             DOCUMENT_ROOT__XSI_SCHEMA_LOCATION       = 2;

  /**
   * The feature id for the '<em><b>MQ Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             DOCUMENT_ROOT__MQ_CONFIGURATION          = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             DOCUMENT_ROOT_FEATURE_COUNT              = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQClearActionImpl <em>MQ Clear Action</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQClearActionImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQClearAction()
   * @generated
   */
  int             MQ_CLEAR_ACTION                          = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQ_CLEAR_ACTION__DESCRIPTION = ValuesPackage.COMPLEX_VALUE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_ACTION__MIXED                   = ValuesPackage.COMPLEX_VALUE__MIXED;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_ACTION__NULL                    = ValuesPackage.COMPLEX_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_ACTION__GROUP                   = ValuesPackage.COMPLEX_VALUE__GROUP;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_ACTION__TEXT                    = ValuesPackage.COMPLEX_VALUE__TEXT;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_ACTION__ENV_VAR                 = ValuesPackage.COMPLEX_VALUE__ENV_VAR;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_ACTION__FILE                    = ValuesPackage.COMPLEX_VALUE__FILE;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_ACTION__XPATH_VALUE             = ValuesPackage.COMPLEX_VALUE__XPATH_VALUE;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQ_CLEAR_ACTION__JSON_VALUE = ValuesPackage.COMPLEX_VALUE__JSON_VALUE;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQ_CLEAR_ACTION__FIX_VALUE = ValuesPackage.COMPLEX_VALUE__FIX_VALUE;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_ACTION__CELL_VALUE              = ValuesPackage.COMPLEX_VALUE__CELL_VALUE;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_ACTION__PROPERTY_VALUE          = ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_ACTION__CODE                    = ValuesPackage.COMPLEX_VALUE__CODE;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_ACTION__RUN_NUMBER              = ValuesPackage.COMPLEX_VALUE__RUN_NUMBER;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_ACTION__REFERENCE               = ValuesPackage.COMPLEX_VALUE__REFERENCE;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_ACTION__MEMOIZE                 = ValuesPackage.COMPLEX_VALUE__MEMOIZE;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_ACTION__ENABLED                 = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>MQ Clear Action</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_ACTION_FEATURE_COUNT            = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQClearOperationImpl <em>MQ Clear Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQClearOperationImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQClearOperation()
   * @generated
   */
  int             MQ_CLEAR_OPERATION                       = 5;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_OPERATION__EXCEPTION            = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Queues</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_OPERATION__QUEUES               = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MQ Clear Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CLEAR_OPERATION_FEATURE_COUNT         = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQConfigurationImpl <em>MQ Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQConfiguration()
   * @generated
   */
  int             MQ_CONFIGURATION                         = 6;

  /**
   * The feature id for the '<em><b>MQ Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CONFIGURATION__MQ_RESOURCE            = 0;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_CONFIGURATION__OPERATION              = 1;

  /**
   * The number of structural features of the '<em>MQ Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_CONFIGURATION_FEATURE_COUNT           = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetActionImpl <em>MQ Get Action</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQGetActionImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQGetAction()
   * @generated
   */
  int             MQ_GET_ACTION                            = 7;

  /**
   * The feature id for the '<em><b>Queue</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_GET_ACTION__QUEUE                     = 0;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_GET_ACTION__OUTPUT                    = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_GET_ACTION__ENABLED                   = 2;

  /**
   * The number of structural features of the '<em>MQ Get Action</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_GET_ACTION_FEATURE_COUNT              = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOperationImpl <em>MQ Get Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOperationImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQGetOperation()
   * @generated
   */
  int             MQ_GET_OPERATION                         = 8;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_GET_OPERATION__EXCEPTION              = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Output Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_GET_OPERATION__OUTPUT_RESOURCE        = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_GET_OPERATION__PATTERN                = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_GET_OPERATION__PRIORITY               = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Delimiter</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_GET_OPERATION__DELIMITER              = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Output Format</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_GET_OPERATION__OUTPUT_FORMAT          = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_GET_OPERATION__ACTIONS                = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Message Processors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_GET_OPERATION__MESSAGE_PROCESSORS     = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Remove From Queue</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_GET_OPERATION__REMOVE_FROM_QUEUE      = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>MQ Get Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_GET_OPERATION_FEATURE_COUNT           = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOutputFormatImpl <em>MQ Get Output Format</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOutputFormatImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQGetOutputFormat()
   * @generated
   */
  int             MQ_GET_OUTPUT_FORMAT                     = 9;

  /**
   * The feature id for the '<em><b>No Cps</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_GET_OUTPUT_FORMAT__NO_CPS             = 0;

  /**
   * The feature id for the '<em><b>No Cr Lf</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_GET_OUTPUT_FORMAT__NO_CR_LF           = 1;

  /**
   * The feature id for the '<em><b>One Line</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_GET_OUTPUT_FORMAT__ONE_LINE           = 2;

  /**
   * The number of structural features of the '<em>MQ Get Output Format</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_GET_OUTPUT_FORMAT_FEATURE_COUNT       = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutActionImpl <em>MQ Put Action</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQPutActionImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQPutAction()
   * @generated
   */
  int             MQ_PUT_ACTION                            = 10;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_PUT_ACTION__INPUT                     = 0;

  /**
   * The feature id for the '<em><b>Input Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_PUT_ACTION__INPUT_TYPE                = 1;

  /**
   * The feature id for the '<em><b>Queue</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_PUT_ACTION__QUEUE                     = 2;

  /**
   * The feature id for the '<em><b>Is Xml</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_PUT_ACTION__IS_XML                    = 3;

  /**
   * The feature id for the '<em><b>Phony Element Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_PUT_ACTION__PHONY_ELEMENT_NAME        = 4;

  /**
   * The feature id for the '<em><b>One Message</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_PUT_ACTION__ONE_MESSAGE               = 5;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_PUT_ACTION__ENABLED                   = 6;

  /**
   * The feature id for the '<em><b>Delay</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_PUT_ACTION__DELAY                     = 7;

  /**
   * The number of structural features of the '<em>MQ Put Action</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_PUT_ACTION_FEATURE_COUNT              = 8;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutOperationImpl <em>MQ Put Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQPutOperationImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQPutOperation()
   * @generated
   */
  int             MQ_PUT_OPERATION                         = 11;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_PUT_OPERATION__EXCEPTION              = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Input Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_PUT_OPERATION__INPUT_RESOURCE         = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_PUT_OPERATION__ACTIONS                = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Delay</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_PUT_OPERATION__DELAY                  = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Cps Header</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_PUT_OPERATION__CPS_HEADER             = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Delimiter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_PUT_OPERATION__DELIMITER              = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>MQ Put Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_PUT_OPERATION_FEATURE_COUNT           = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQReportActionImpl <em>MQ Report Action</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQReportActionImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQReportAction()
   * @generated
   */
  int             MQ_REPORT_ACTION                         = 12;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQ_REPORT_ACTION__DESCRIPTION = ValuesPackage.COMPLEX_VALUE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_REPORT_ACTION__MIXED                  = ValuesPackage.COMPLEX_VALUE__MIXED;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_REPORT_ACTION__NULL                   = ValuesPackage.COMPLEX_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_REPORT_ACTION__GROUP                  = ValuesPackage.COMPLEX_VALUE__GROUP;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_REPORT_ACTION__TEXT                   = ValuesPackage.COMPLEX_VALUE__TEXT;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_REPORT_ACTION__ENV_VAR                = ValuesPackage.COMPLEX_VALUE__ENV_VAR;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_REPORT_ACTION__FILE                   = ValuesPackage.COMPLEX_VALUE__FILE;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_REPORT_ACTION__XPATH_VALUE            = ValuesPackage.COMPLEX_VALUE__XPATH_VALUE;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQ_REPORT_ACTION__JSON_VALUE = ValuesPackage.COMPLEX_VALUE__JSON_VALUE;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQ_REPORT_ACTION__FIX_VALUE = ValuesPackage.COMPLEX_VALUE__FIX_VALUE;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_REPORT_ACTION__CELL_VALUE             = ValuesPackage.COMPLEX_VALUE__CELL_VALUE;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_REPORT_ACTION__PROPERTY_VALUE         = ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_REPORT_ACTION__CODE                   = ValuesPackage.COMPLEX_VALUE__CODE;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_REPORT_ACTION__RUN_NUMBER             = ValuesPackage.COMPLEX_VALUE__RUN_NUMBER;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_REPORT_ACTION__REFERENCE              = ValuesPackage.COMPLEX_VALUE__REFERENCE;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_REPORT_ACTION__MEMOIZE                = ValuesPackage.COMPLEX_VALUE__MEMOIZE;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_REPORT_ACTION__ENABLED                = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>MQ Report Action</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_REPORT_ACTION_FEATURE_COUNT           = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQReportOperationImpl <em>MQ Report Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQReportOperationImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQReportOperation()
   * @generated
   */
  int             MQ_REPORT_OPERATION                      = 13;

  /**
   * The feature id for the '<em><b>Queues</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_REPORT_OPERATION__QUEUES              = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>MQ Report Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_REPORT_OPERATION_FEATURE_COUNT        = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQWaitActionImpl <em>MQ Wait Action</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQWaitActionImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQWaitAction()
   * @generated
   */
  int             MQ_WAIT_ACTION                           = 14;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQ_WAIT_ACTION__DESCRIPTION = ValuesPackage.COMPLEX_VALUE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_WAIT_ACTION__MIXED                    = ValuesPackage.COMPLEX_VALUE__MIXED;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_WAIT_ACTION__NULL                     = ValuesPackage.COMPLEX_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_WAIT_ACTION__GROUP                    = ValuesPackage.COMPLEX_VALUE__GROUP;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_WAIT_ACTION__TEXT                     = ValuesPackage.COMPLEX_VALUE__TEXT;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_WAIT_ACTION__ENV_VAR                  = ValuesPackage.COMPLEX_VALUE__ENV_VAR;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_WAIT_ACTION__FILE                     = ValuesPackage.COMPLEX_VALUE__FILE;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_WAIT_ACTION__XPATH_VALUE              = ValuesPackage.COMPLEX_VALUE__XPATH_VALUE;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQ_WAIT_ACTION__JSON_VALUE = ValuesPackage.COMPLEX_VALUE__JSON_VALUE;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQ_WAIT_ACTION__FIX_VALUE = ValuesPackage.COMPLEX_VALUE__FIX_VALUE;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_WAIT_ACTION__CELL_VALUE               = ValuesPackage.COMPLEX_VALUE__CELL_VALUE;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_WAIT_ACTION__PROPERTY_VALUE           = ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_WAIT_ACTION__CODE                     = ValuesPackage.COMPLEX_VALUE__CODE;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_WAIT_ACTION__RUN_NUMBER               = ValuesPackage.COMPLEX_VALUE__RUN_NUMBER;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_WAIT_ACTION__REFERENCE                = ValuesPackage.COMPLEX_VALUE__REFERENCE;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_WAIT_ACTION__MEMOIZE                  = ValuesPackage.COMPLEX_VALUE__MEMOIZE;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_WAIT_ACTION__ENABLED                  = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>MQ Wait Action</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             MQ_WAIT_ACTION_FEATURE_COUNT             = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQWaitOperationImpl <em>MQ Wait Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQWaitOperationImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQWaitOperation()
   * @generated
   */
  int             MQ_WAIT_OPERATION                        = 15;

  /**
   * The feature id for the '<em><b>Comparison</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_WAIT_OPERATION__COMPARISON            = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Queues</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_WAIT_OPERATION__QUEUES                = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MQ Wait Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             MQ_WAIT_OPERATION_FEATURE_COUNT          = ABSTRACT_MQ_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.SimpleHeaderProcessorImpl <em>Simple Header Processor</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.SimpleHeaderProcessorImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getSimpleHeaderProcessor()
   * @generated
   */
  int             SIMPLE_HEADER_PROCESSOR                  = 16;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             SIMPLE_HEADER_PROCESSOR__ENABLED         = ABSTRACT_MESSAGE_PROCESSOR__ENABLED;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             SIMPLE_HEADER_PROCESSOR__FIELDS          = ABSTRACT_MESSAGE_PROCESSOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Header Processor</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             SIMPLE_HEADER_PROCESSOR_FEATURE_COUNT    = ABSTRACT_MESSAGE_PROCESSOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.WaitComparisonImpl <em>Wait Comparison</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.WaitComparisonImpl
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getWaitComparison()
   * @generated
   */
  int             WAIT_COMPARISON                          = 17;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT_COMPARISON__DESCRIPTION = ValuesPackage.COMPLEX_VALUE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__MIXED                   = ValuesPackage.COMPLEX_VALUE__MIXED;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__NULL                    = ValuesPackage.COMPLEX_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__GROUP                   = ValuesPackage.COMPLEX_VALUE__GROUP;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__TEXT                    = ValuesPackage.COMPLEX_VALUE__TEXT;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__ENV_VAR                 = ValuesPackage.COMPLEX_VALUE__ENV_VAR;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__FILE                    = ValuesPackage.COMPLEX_VALUE__FILE;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__XPATH_VALUE             = ValuesPackage.COMPLEX_VALUE__XPATH_VALUE;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT_COMPARISON__JSON_VALUE = ValuesPackage.COMPLEX_VALUE__JSON_VALUE;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT_COMPARISON__FIX_VALUE = ValuesPackage.COMPLEX_VALUE__FIX_VALUE;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__CELL_VALUE              = ValuesPackage.COMPLEX_VALUE__CELL_VALUE;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__PROPERTY_VALUE          = ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__CODE                    = ValuesPackage.COMPLEX_VALUE__CODE;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__RUN_NUMBER              = ValuesPackage.COMPLEX_VALUE__RUN_NUMBER;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__REFERENCE               = ValuesPackage.COMPLEX_VALUE__REFERENCE;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__MEMOIZE                 = ValuesPackage.COMPLEX_VALUE__MEMOIZE;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__TIMEOUT                 = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Depth</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__DEPTH                   = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__OPERATOR                = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Check Total</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON__CHECK_TOTAL             = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Wait Comparison</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int             WAIT_COMPARISON_FEATURE_COUNT            = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.InputMessageType <em>Input Message Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.InputMessageType
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getInputMessageType()
   * @generated
   */
  int             INPUT_MESSAGE_TYPE                       = 18;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.mqModule.WaitOperator <em>Wait Operator</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.WaitOperator
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getWaitOperator()
   * @generated
   */
  int             WAIT_OPERATOR                            = 19;

  /**
   * The meta object id for the '<em>Input Message Type Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.InputMessageType
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getInputMessageTypeObject()
   * @generated
   */
  int             INPUT_MESSAGE_TYPE_OBJECT                = 20;

  /**
   * The meta object id for the '<em>Wait Depth</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getWaitDepth()
   * @generated
   */
  int             WAIT_DEPTH                               = 21;

  /**
   * The meta object id for the '<em>Wait Operator Object</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.mqModule.WaitOperator
   * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getWaitOperatorObject()
   * @generated
   */
  int             WAIT_OPERATOR_OBJECT                     = 22;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.AbstractMessageProcessor <em>Abstract Message Processor</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Message Processor</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.AbstractMessageProcessor
   * @generated
   */
  EClass getAbstractMessageProcessor();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.mqModule.AbstractMessageProcessor#isEnabled <em>Enabled</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.AbstractMessageProcessor#isEnabled()
   * @see #getAbstractMessageProcessor()
   * @generated
   */
  EAttribute getAbstractMessageProcessor_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.AbstractMQOperation <em>Abstract MQ Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract MQ Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.AbstractMQOperation
   * @generated
   */
  EClass getAbstractMQOperation();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.CpsHeaderProcessor <em>Cps Header Processor</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Cps Header Processor</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.CpsHeaderProcessor
   * @generated
   */
  EClass getCpsHeaderProcessor();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.mqModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.mqModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.mqModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.mqModule.DocumentRoot#getMQConfiguration <em>MQ Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>MQ Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.DocumentRoot#getMQConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_MQConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.MQClearAction <em>MQ Clear Action</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>MQ Clear Action</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQClearAction
   * @generated
   */
  EClass getMQClearAction();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.MQClearAction#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQClearAction#isEnabled()
   * @see #getMQClearAction()
   * @generated
   */
  EAttribute getMQClearAction_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.MQClearOperation <em>MQ Clear Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>MQ Clear Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQClearOperation
   * @generated
   */
  EClass getMQClearOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.mqModule.MQClearOperation#getException <em>Exception</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQClearOperation#getException()
   * @see #getMQClearOperation()
   * @generated
   */
  EReference getMQClearOperation_Exception();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.mqModule.MQClearOperation#getQueues <em>Queues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Queues</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQClearOperation#getQueues()
   * @see #getMQClearOperation()
   * @generated
   */
  EReference getMQClearOperation_Queues();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.MQConfiguration <em>MQ Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>MQ Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQConfiguration
   * @generated
   */
  EClass getMQConfiguration();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.mqModule.MQConfiguration#getMQResource <em>MQ Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>MQ Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQConfiguration#getMQResource()
   * @see #getMQConfiguration()
   * @generated
   */
  EReference getMQConfiguration_MQResource();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.mqModule.MQConfiguration#getOperation <em>Operation</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQConfiguration#getOperation()
   * @see #getMQConfiguration()
   * @generated
   */
  EReference getMQConfiguration_Operation();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetAction <em>MQ Get Action</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>MQ Get Action</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetAction
   * @generated
   */
  EClass getMQGetAction();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetAction#getQueue <em>Queue</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Queue</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetAction#getQueue()
   * @see #getMQGetAction()
   * @generated
   */
  EReference getMQGetAction_Queue();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetAction#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetAction#getOutput()
   * @see #getMQGetAction()
   * @generated
   */
  EReference getMQGetAction_Output();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetAction#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetAction#isEnabled()
   * @see #getMQGetAction()
   * @generated
   */
  EAttribute getMQGetAction_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation <em>MQ Get Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>MQ Get Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOperation
   * @generated
   */
  EClass getMQGetOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getException <em>Exception</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getException()
   * @see #getMQGetOperation()
   * @generated
   */
  EReference getMQGetOperation_Exception();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getOutputResource <em>Output Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Output Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getOutputResource()
   * @see #getMQGetOperation()
   * @generated
   */
  EReference getMQGetOperation_OutputResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getPattern()
   * @see #getMQGetOperation()
   * @generated
   */
  EReference getMQGetOperation_Pattern();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Priority</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getPriority()
   * @see #getMQGetOperation()
   * @generated
   */
  EReference getMQGetOperation_Priority();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getDelimiter <em>Delimiter</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delimiter</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getDelimiter()
   * @see #getMQGetOperation()
   * @generated
   */
  EReference getMQGetOperation_Delimiter();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getOutputFormat <em>Output Format</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Output Format</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getOutputFormat()
   * @see #getMQGetOperation()
   * @generated
   */
  EReference getMQGetOperation_OutputFormat();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getActions()
   * @see #getMQGetOperation()
   * @generated
   */
  EReference getMQGetOperation_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getMessageProcessors <em>Message Processors</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Message Processors</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#getMessageProcessors()
   * @see #getMQGetOperation()
   * @generated
   */
  EReference getMQGetOperation_MessageProcessors();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#isRemoveFromQueue <em>Remove From Queue</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Remove From Queue</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOperation#isRemoveFromQueue()
   * @see #getMQGetOperation()
   * @generated
   */
  EAttribute getMQGetOperation_RemoveFromQueue();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat <em>MQ Get Output Format</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>MQ Get Output Format</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat
   * @generated
   */
  EClass getMQGetOutputFormat();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isNoCps <em>No Cps</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>No Cps</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isNoCps()
   * @see #getMQGetOutputFormat()
   * @generated
   */
  EAttribute getMQGetOutputFormat_NoCps();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isNoCrLf <em>No Cr Lf</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>No Cr Lf</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isNoCrLf()
   * @see #getMQGetOutputFormat()
   * @generated
   */
  EAttribute getMQGetOutputFormat_NoCrLf();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isOneLine <em>One Line</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>One Line</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat#isOneLine()
   * @see #getMQGetOutputFormat()
   * @generated
   */
  EAttribute getMQGetOutputFormat_OneLine();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction <em>MQ Put Action</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>MQ Put Action</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutAction
   * @generated
   */
  EClass getMQPutAction();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getInput <em>Input</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getInput()
   * @see #getMQPutAction()
   * @generated
   */
  EReference getMQPutAction_Input();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getInputType <em>Input Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input Type</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getInputType()
   * @see #getMQPutAction()
   * @generated
   */
  EAttribute getMQPutAction_InputType();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getQueue <em>Queue</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Queue</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getQueue()
   * @see #getMQPutAction()
   * @generated
   */
  EReference getMQPutAction_Queue();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delay</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getDelay()
   * @see #getMQPutAction()
   * @generated
   */
  EAttribute getMQPutAction_Delay();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isEnabled()
   * @see #getMQPutAction()
   * @generated
   */
  EAttribute getMQPutAction_Enabled();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isIsXml <em>Is Xml</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Xml</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isIsXml()
   * @see #getMQPutAction()
   * @generated
   */
  EAttribute getMQPutAction_IsXml();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isOneMessage <em>One Message</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>One Message</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isOneMessage()
   * @see #getMQPutAction()
   * @generated
   */
  EAttribute getMQPutAction_OneMessage();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getPhonyElementName <em>Phony Element Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Phony Element Name</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getPhonyElementName()
   * @see #getMQPutAction()
   * @generated
   */
  EAttribute getMQPutAction_PhonyElementName();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation <em>MQ Put Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>MQ Put Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutOperation
   * @generated
   */
  EClass getMQPutOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getException <em>Exception</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getException()
   * @see #getMQPutOperation()
   * @generated
   */
  EReference getMQPutOperation_Exception();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getInputResource <em>Input Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Input Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getInputResource()
   * @see #getMQPutOperation()
   * @generated
   */
  EReference getMQPutOperation_InputResource();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getActions()
   * @see #getMQPutOperation()
   * @generated
   */
  EReference getMQPutOperation_Actions();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getCpsHeader <em>Cps Header</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Cps Header</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getCpsHeader()
   * @see #getMQPutOperation()
   * @generated
   */
  EAttribute getMQPutOperation_CpsHeader();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delay</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getDelay()
   * @see #getMQPutOperation()
   * @generated
   */
  EAttribute getMQPutOperation_Delay();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getDelimiter <em>Delimiter</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delimiter</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQPutOperation#getDelimiter()
   * @see #getMQPutOperation()
   * @generated
   */
  EAttribute getMQPutOperation_Delimiter();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.MQReportAction <em>MQ Report Action</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>MQ Report Action</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQReportAction
   * @generated
   */
  EClass getMQReportAction();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.MQReportAction#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQReportAction#isEnabled()
   * @see #getMQReportAction()
   * @generated
   */
  EAttribute getMQReportAction_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.MQReportOperation <em>MQ Report Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>MQ Report Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQReportOperation
   * @generated
   */
  EClass getMQReportOperation();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.mqModule.MQReportOperation#getQueues <em>Queues</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Queues</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQReportOperation#getQueues()
   * @see #getMQReportOperation()
   * @generated
   */
  EReference getMQReportOperation_Queues();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.MQWaitAction <em>MQ Wait Action</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>MQ Wait Action</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQWaitAction
   * @generated
   */
  EClass getMQWaitAction();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.MQWaitAction#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQWaitAction#isEnabled()
   * @see #getMQWaitAction()
   * @generated
   */
  EAttribute getMQWaitAction_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.MQWaitOperation <em>MQ Wait Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>MQ Wait Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQWaitOperation
   * @generated
   */
  EClass getMQWaitOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.mqModule.MQWaitOperation#getComparison <em>Comparison</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Comparison</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQWaitOperation#getComparison()
   * @see #getMQWaitOperation()
   * @generated
   */
  EReference getMQWaitOperation_Comparison();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.mqModule.MQWaitOperation#getQueues <em>Queues</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Queues</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.MQWaitOperation#getQueues()
   * @see #getMQWaitOperation()
   * @generated
   */
  EReference getMQWaitOperation_Queues();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.SimpleHeaderProcessor <em>Simple Header Processor</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Header Processor</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.SimpleHeaderProcessor
   * @generated
   */
  EClass getSimpleHeaderProcessor();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.mqModule.SimpleHeaderProcessor#getFields <em>Fields</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.SimpleHeaderProcessor#getFields()
   * @see #getSimpleHeaderProcessor()
   * @generated
   */
  EReference getSimpleHeaderProcessor_Fields();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison <em>Wait Comparison</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Wait Comparison</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.WaitComparison
   * @generated
   */
  EClass getWaitComparison();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#isCheckTotal <em>Check Total</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Check Total</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.WaitComparison#isCheckTotal()
   * @see #getWaitComparison()
   * @generated
   */
  EAttribute getWaitComparison_CheckTotal();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getDepth <em>Depth</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Depth</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getDepth()
   * @see #getWaitComparison()
   * @generated
   */
  EAttribute getWaitComparison_Depth();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getOperator()
   * @see #getWaitComparison()
   * @generated
   */
  EAttribute getWaitComparison_Operator();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getTimeout <em>Timeout</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timeout</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getTimeout()
   * @see #getWaitComparison()
   * @generated
   */
  EAttribute getWaitComparison_Timeout();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.modules.mqModule.InputMessageType <em>Input Message Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Input Message Type</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.InputMessageType
   * @generated
   */
  EEnum getInputMessageType();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.modules.mqModule.WaitOperator <em>Wait Operator</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Wait Operator</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.WaitOperator
   * @generated
   */
  EEnum getWaitOperator();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.modules.mqModule.InputMessageType <em>Input Message Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Input Message Type Object</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.InputMessageType
   * @model instanceClass="com.ms.qaTools.saturn.modules.mqModule.InputMessageType"
   *        extendedMetaData="name='InputMessageType:Object' baseType='InputMessageType'"
   * @generated
   */
  EDataType getInputMessageTypeObject();

  /**
   * Returns the meta object for data type '{@link java.math.BigInteger <em>Wait Depth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Wait Depth</em>'.
   * @see java.math.BigInteger
   * @model instanceClass="java.math.BigInteger"
   *        extendedMetaData="name='WaitDepth' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='0'"
   * @generated
   */
  EDataType getWaitDepth();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.modules.mqModule.WaitOperator <em>Wait Operator Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Wait Operator Object</em>'.
   * @see com.ms.qaTools.saturn.modules.mqModule.WaitOperator
   * @model instanceClass="com.ms.qaTools.saturn.modules.mqModule.WaitOperator"
   *        extendedMetaData="name='WaitOperator:Object' baseType='WaitOperator'"
   * @generated
   */
  EDataType getWaitOperatorObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MqModuleFactory getMqModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.AbstractMessageProcessorImpl <em>Abstract Message Processor</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.AbstractMessageProcessorImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getAbstractMessageProcessor()
     * @generated
     */
    EClass     ABSTRACT_MESSAGE_PROCESSOR           = eINSTANCE.getAbstractMessageProcessor();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_MESSAGE_PROCESSOR__ENABLED  = eINSTANCE.getAbstractMessageProcessor_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.AbstractMQOperationImpl <em>Abstract MQ Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.AbstractMQOperationImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getAbstractMQOperation()
     * @generated
     */
    EClass     ABSTRACT_MQ_OPERATION                = eINSTANCE.getAbstractMQOperation();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.CpsHeaderProcessorImpl <em>Cps Header Processor</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.CpsHeaderProcessorImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getCpsHeaderProcessor()
     * @generated
     */
    EClass     CPS_HEADER_PROCESSOR                 = eINSTANCE.getCpsHeaderProcessor();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                        = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED                 = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP      = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION   = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>MQ Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__MQ_CONFIGURATION      = eINSTANCE.getDocumentRoot_MQConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQClearActionImpl <em>MQ Clear Action</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQClearActionImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQClearAction()
     * @generated
     */
    EClass     MQ_CLEAR_ACTION                      = eINSTANCE.getMQClearAction();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_CLEAR_ACTION__ENABLED             = eINSTANCE.getMQClearAction_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQClearOperationImpl <em>MQ Clear Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQClearOperationImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQClearOperation()
     * @generated
     */
    EClass     MQ_CLEAR_OPERATION                   = eINSTANCE.getMQClearOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_CLEAR_OPERATION__EXCEPTION        = eINSTANCE.getMQClearOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Queues</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_CLEAR_OPERATION__QUEUES           = eINSTANCE.getMQClearOperation_Queues();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQConfigurationImpl <em>MQ Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQConfiguration()
     * @generated
     */
    EClass     MQ_CONFIGURATION                     = eINSTANCE.getMQConfiguration();

    /**
     * The meta object literal for the '<em><b>MQ Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_CONFIGURATION__MQ_RESOURCE        = eINSTANCE.getMQConfiguration_MQResource();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_CONFIGURATION__OPERATION          = eINSTANCE.getMQConfiguration_Operation();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetActionImpl <em>MQ Get Action</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQGetActionImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQGetAction()
     * @generated
     */
    EClass     MQ_GET_ACTION                        = eINSTANCE.getMQGetAction();

    /**
     * The meta object literal for the '<em><b>Queue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_GET_ACTION__QUEUE                 = eINSTANCE.getMQGetAction_Queue();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_GET_ACTION__OUTPUT                = eINSTANCE.getMQGetAction_Output();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_GET_ACTION__ENABLED               = eINSTANCE.getMQGetAction_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOperationImpl <em>MQ Get Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOperationImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQGetOperation()
     * @generated
     */
    EClass     MQ_GET_OPERATION                     = eINSTANCE.getMQGetOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_GET_OPERATION__EXCEPTION          = eINSTANCE.getMQGetOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Output Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference MQ_GET_OPERATION__OUTPUT_RESOURCE    = eINSTANCE.getMQGetOperation_OutputResource();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_GET_OPERATION__PATTERN            = eINSTANCE.getMQGetOperation_Pattern();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_GET_OPERATION__PRIORITY           = eINSTANCE.getMQGetOperation_Priority();

    /**
     * The meta object literal for the '<em><b>Delimiter</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_GET_OPERATION__DELIMITER          = eINSTANCE.getMQGetOperation_Delimiter();

    /**
     * The meta object literal for the '<em><b>Output Format</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference MQ_GET_OPERATION__OUTPUT_FORMAT      = eINSTANCE.getMQGetOperation_OutputFormat();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_GET_OPERATION__ACTIONS            = eINSTANCE.getMQGetOperation_Actions();

    /**
     * The meta object literal for the '<em><b>Message Processors</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference MQ_GET_OPERATION__MESSAGE_PROCESSORS = eINSTANCE.getMQGetOperation_MessageProcessors();

    /**
     * The meta object literal for the '<em><b>Remove From Queue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MQ_GET_OPERATION__REMOVE_FROM_QUEUE  = eINSTANCE.getMQGetOperation_RemoveFromQueue();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOutputFormatImpl <em>MQ Get Output Format</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOutputFormatImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQGetOutputFormat()
     * @generated
     */
    EClass     MQ_GET_OUTPUT_FORMAT                 = eINSTANCE.getMQGetOutputFormat();

    /**
     * The meta object literal for the '<em><b>No Cps</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_GET_OUTPUT_FORMAT__NO_CPS         = eINSTANCE.getMQGetOutputFormat_NoCps();

    /**
     * The meta object literal for the '<em><b>No Cr Lf</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_GET_OUTPUT_FORMAT__NO_CR_LF       = eINSTANCE.getMQGetOutputFormat_NoCrLf();

    /**
     * The meta object literal for the '<em><b>One Line</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_GET_OUTPUT_FORMAT__ONE_LINE       = eINSTANCE.getMQGetOutputFormat_OneLine();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutActionImpl <em>MQ Put Action</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQPutActionImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQPutAction()
     * @generated
     */
    EClass     MQ_PUT_ACTION                        = eINSTANCE.getMQPutAction();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_PUT_ACTION__INPUT                 = eINSTANCE.getMQPutAction_Input();

    /**
     * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_PUT_ACTION__INPUT_TYPE            = eINSTANCE.getMQPutAction_InputType();

    /**
     * The meta object literal for the '<em><b>Queue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_PUT_ACTION__QUEUE                 = eINSTANCE.getMQPutAction_Queue();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_PUT_ACTION__DELAY                 = eINSTANCE.getMQPutAction_Delay();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_PUT_ACTION__ENABLED               = eINSTANCE.getMQPutAction_Enabled();

    /**
     * The meta object literal for the '<em><b>Is Xml</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_PUT_ACTION__IS_XML                = eINSTANCE.getMQPutAction_IsXml();

    /**
     * The meta object literal for the '<em><b>One Message</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_PUT_ACTION__ONE_MESSAGE           = eINSTANCE.getMQPutAction_OneMessage();

    /**
     * The meta object literal for the '<em><b>Phony Element Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MQ_PUT_ACTION__PHONY_ELEMENT_NAME    = eINSTANCE.getMQPutAction_PhonyElementName();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutOperationImpl <em>MQ Put Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQPutOperationImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQPutOperation()
     * @generated
     */
    EClass     MQ_PUT_OPERATION                     = eINSTANCE.getMQPutOperation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_PUT_OPERATION__EXCEPTION          = eINSTANCE.getMQPutOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Input Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference MQ_PUT_OPERATION__INPUT_RESOURCE     = eINSTANCE.getMQPutOperation_InputResource();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_PUT_OPERATION__ACTIONS            = eINSTANCE.getMQPutOperation_Actions();

    /**
     * The meta object literal for the '<em><b>Cps Header</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_PUT_OPERATION__CPS_HEADER         = eINSTANCE.getMQPutOperation_CpsHeader();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_PUT_OPERATION__DELAY              = eINSTANCE.getMQPutOperation_Delay();

    /**
     * The meta object literal for the '<em><b>Delimiter</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_PUT_OPERATION__DELIMITER          = eINSTANCE.getMQPutOperation_Delimiter();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQReportActionImpl <em>MQ Report Action</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQReportActionImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQReportAction()
     * @generated
     */
    EClass     MQ_REPORT_ACTION                     = eINSTANCE.getMQReportAction();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_REPORT_ACTION__ENABLED            = eINSTANCE.getMQReportAction_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQReportOperationImpl <em>MQ Report Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQReportOperationImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQReportOperation()
     * @generated
     */
    EClass     MQ_REPORT_OPERATION                  = eINSTANCE.getMQReportOperation();

    /**
     * The meta object literal for the '<em><b>Queues</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_REPORT_OPERATION__QUEUES          = eINSTANCE.getMQReportOperation_Queues();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQWaitActionImpl <em>MQ Wait Action</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQWaitActionImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQWaitAction()
     * @generated
     */
    EClass     MQ_WAIT_ACTION                       = eINSTANCE.getMQWaitAction();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MQ_WAIT_ACTION__ENABLED              = eINSTANCE.getMQWaitAction_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQWaitOperationImpl <em>MQ Wait Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MQWaitOperationImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getMQWaitOperation()
     * @generated
     */
    EClass     MQ_WAIT_OPERATION                    = eINSTANCE.getMQWaitOperation();

    /**
     * The meta object literal for the '<em><b>Comparison</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_WAIT_OPERATION__COMPARISON        = eINSTANCE.getMQWaitOperation_Comparison();

    /**
     * The meta object literal for the '<em><b>Queues</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference MQ_WAIT_OPERATION__QUEUES            = eINSTANCE.getMQWaitOperation_Queues();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.SimpleHeaderProcessorImpl <em>Simple Header Processor</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.SimpleHeaderProcessorImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getSimpleHeaderProcessor()
     * @generated
     */
    EClass     SIMPLE_HEADER_PROCESSOR              = eINSTANCE.getSimpleHeaderProcessor();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_HEADER_PROCESSOR__FIELDS      = eINSTANCE.getSimpleHeaderProcessor_Fields();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.impl.WaitComparisonImpl <em>Wait Comparison</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.WaitComparisonImpl
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getWaitComparison()
     * @generated
     */
    EClass     WAIT_COMPARISON                      = eINSTANCE.getWaitComparison();

    /**
     * The meta object literal for the '<em><b>Check Total</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute WAIT_COMPARISON__CHECK_TOTAL         = eINSTANCE.getWaitComparison_CheckTotal();

    /**
     * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute WAIT_COMPARISON__DEPTH               = eINSTANCE.getWaitComparison_Depth();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute WAIT_COMPARISON__OPERATOR            = eINSTANCE.getWaitComparison_Operator();

    /**
     * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute WAIT_COMPARISON__TIMEOUT             = eINSTANCE.getWaitComparison_Timeout();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.InputMessageType <em>Input Message Type</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.InputMessageType
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getInputMessageType()
     * @generated
     */
    EEnum      INPUT_MESSAGE_TYPE                   = eINSTANCE.getInputMessageType();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.mqModule.WaitOperator <em>Wait Operator</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.WaitOperator
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getWaitOperator()
     * @generated
     */
    EEnum      WAIT_OPERATOR                        = eINSTANCE.getWaitOperator();

    /**
     * The meta object literal for the '<em>Input Message Type Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.InputMessageType
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getInputMessageTypeObject()
     * @generated
     */
    EDataType  INPUT_MESSAGE_TYPE_OBJECT            = eINSTANCE.getInputMessageTypeObject();

    /**
     * The meta object literal for the '<em>Wait Depth</em>' data type.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see java.math.BigInteger
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getWaitDepth()
     * @generated
     */
    EDataType  WAIT_DEPTH                           = eINSTANCE.getWaitDepth();

    /**
     * The meta object literal for the '<em>Wait Operator Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.mqModule.WaitOperator
     * @see com.ms.qaTools.saturn.modules.mqModule.impl.MqModulePackageImpl#getWaitOperatorObject()
     * @generated
     */
    EDataType  WAIT_OPERATOR_OBJECT                 = eINSTANCE.getWaitOperatorObject();

  }

} // MqModulePackage
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
