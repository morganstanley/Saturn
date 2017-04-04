package com.ms.qaTools.saturn;

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
 * @see com.ms.qaTools.saturn.SaturnFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface SaturnPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String        eNAME                                                  = "saturn";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String        eNS_URI                                                = "http://www.ms.com/2006/Saturn/gmf";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String        eNS_PREFIX                                             = "saturn";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  SaturnPackage eINSTANCE                                              = com.ms.qaTools.saturn.impl.SaturnPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.AbstractLinkImpl <em>Abstract Link</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.AbstractLinkImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAbstractLink()
   * @generated
   */
  int           ABSTRACT_LINK                                          = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_LINK__SOURCE                                  = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_LINK__TARGET                                  = 1;

  /**
   * The number of structural features of the '<em>Abstract Link</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           ABSTRACT_LINK_FEATURE_COUNT                            = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.AbstractParameterImpl <em>Abstract Parameter</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.AbstractParameterImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAbstractParameter()
   * @generated
   */
  int           ABSTRACT_PARAMETER                                     = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_PARAMETER__NAME                               = 0;

  /**
   * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_PARAMETER__IS_MANDATORY                       = 1;

  /**
   * The number of structural features of the '<em>Abstract Parameter</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_PARAMETER_FEATURE_COUNT                       = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.AbstractResourceLinkImpl <em>Abstract Resource Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.AbstractResourceLinkImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAbstractResourceLink()
   * @generated
   */
  int ABSTRACT_RESOURCE_LINK = 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_RESOURCE_LINK__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_RESOURCE_LINK__TARGET = 1;

  /**
   * The number of structural features of the '<em>Abstract Resource Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_RESOURCE_LINK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl <em>Abstract Run Group</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.AbstractRunGroupImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAbstractRunGroup()
   * @generated
   */
  int           ABSTRACT_RUN_GROUP                                     = 3;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__IMPORTS                            = 0;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__EXCEPTION                          = 1;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__RESOURCES                          = 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__ATTRIBUTES                         = 3;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__ANNOTATIONS                        = 4;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__REPETITION_HANDLER                 = 5;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__MODIFIERS                          = 6;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__PARAMETERS                         = 7;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__INCLUDE_FILES                      = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__NAME                               = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__ID                                 = 10;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__ENABLED                            = 11;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__WARN_ON_FAILURE                    = 12;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__WAIT_BEFORE                        = 13;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__WAIT_AFTER                         = 14;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__DEFAULT_STATUS                     = 15;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__STATUS_CONDITION                   = 16;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__PROCEDURE                          = 17;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__CAN_MULTIPLEX                      = 18;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP__MAX_SIMULTANEOUS_ITERATIONS        = 19;

  /**
   * The number of structural features of the '<em>Abstract Run Group</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_RUN_GROUP_FEATURE_COUNT                       = 20;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.AbstractStepImpl <em>Abstract Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.AbstractStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAbstractStep()
   * @generated
   */
  int           ABSTRACT_STEP                                          = 4;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__IMPORTS                                 = ABSTRACT_RUN_GROUP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__EXCEPTION                               = ABSTRACT_RUN_GROUP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__RESOURCES                               = ABSTRACT_RUN_GROUP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__ATTRIBUTES                              = ABSTRACT_RUN_GROUP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__ANNOTATIONS                             = ABSTRACT_RUN_GROUP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__REPETITION_HANDLER                      = ABSTRACT_RUN_GROUP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__MODIFIERS                               = ABSTRACT_RUN_GROUP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__PARAMETERS                              = ABSTRACT_RUN_GROUP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__INCLUDE_FILES                           = ABSTRACT_RUN_GROUP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__NAME                                    = ABSTRACT_RUN_GROUP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__ID                                      = ABSTRACT_RUN_GROUP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__ENABLED                                 = ABSTRACT_RUN_GROUP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__WARN_ON_FAILURE                         = ABSTRACT_RUN_GROUP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__WAIT_BEFORE                             = ABSTRACT_RUN_GROUP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__WAIT_AFTER                              = ABSTRACT_RUN_GROUP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__DEFAULT_STATUS                          = ABSTRACT_RUN_GROUP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__STATUS_CONDITION                        = ABSTRACT_RUN_GROUP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__PROCEDURE                               = ABSTRACT_RUN_GROUP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__CAN_MULTIPLEX                           = ABSTRACT_RUN_GROUP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS             = ABSTRACT_RUN_GROUP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The number of structural features of the '<em>Abstract Step</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           ABSTRACT_STEP_FEATURE_COUNT                            = ABSTRACT_RUN_GROUP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.AbstractTerminalImpl <em>Abstract Terminal</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.AbstractTerminalImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAbstractTerminal()
   * @generated
   */
  int           ABSTRACT_TERMINAL                                      = 5;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__IMPORTS                             = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__EXCEPTION                           = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__RESOURCES                           = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__ATTRIBUTES                          = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__ANNOTATIONS                         = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__REPETITION_HANDLER                  = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__MODIFIERS                           = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__PARAMETERS                          = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__INCLUDE_FILES                       = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__NAME                                = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__ID                                  = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__ENABLED                             = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__WARN_ON_FAILURE                     = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__WAIT_BEFORE                         = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__WAIT_AFTER                          = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__DEFAULT_STATUS                      = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__STATUS_CONDITION                    = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__PROCEDURE                           = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__CAN_MULTIPLEX                       = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__MAX_SIMULTANEOUS_ITERATIONS         = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Repetition Action</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__REPETITION_ACTION                   = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Termination Status</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL__TERMINATION_STATUS                  = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Abstract Terminal</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ABSTRACT_TERMINAL_FEATURE_COUNT                        = ABSTRACT_STEP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.AttributeImpl <em>Attribute</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.AttributeImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAttribute()
   * @generated
   */
  int           ATTRIBUTE                                              = 6;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DESCRIPTION = ValuesPackage.COMPLEX_VALUE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE__MIXED                                       = ValuesPackage.COMPLEX_VALUE__MIXED;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE__NULL                                        = ValuesPackage.COMPLEX_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE__GROUP                                       = ValuesPackage.COMPLEX_VALUE__GROUP;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           ATTRIBUTE__TEXT                                        = ValuesPackage.COMPLEX_VALUE__TEXT;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE__ENV_VAR                                     = ValuesPackage.COMPLEX_VALUE__ENV_VAR;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           ATTRIBUTE__FILE                                        = ValuesPackage.COMPLEX_VALUE__FILE;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE__XPATH_VALUE                                 = ValuesPackage.COMPLEX_VALUE__XPATH_VALUE;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__JSON_VALUE = ValuesPackage.COMPLEX_VALUE__JSON_VALUE;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__FIX_VALUE = ValuesPackage.COMPLEX_VALUE__FIX_VALUE;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE__CELL_VALUE                                  = ValuesPackage.COMPLEX_VALUE__CELL_VALUE;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE__PROPERTY_VALUE                              = ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           ATTRIBUTE__CODE                                        = ValuesPackage.COMPLEX_VALUE__CODE;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE__RUN_NUMBER                                  = ValuesPackage.COMPLEX_VALUE__RUN_NUMBER;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE__REFERENCE                                   = ValuesPackage.COMPLEX_VALUE__REFERENCE;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE__MEMOIZE                                     = ValuesPackage.COMPLEX_VALUE__MEMOIZE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE__NAME                                        = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE__EXTERNAL                                    = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE_FEATURE_COUNT                                = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.AttributeParameterImpl <em>Attribute Parameter</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.AttributeParameterImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAttributeParameter()
   * @generated
   */
  int           ATTRIBUTE_PARAMETER                                    = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE_PARAMETER__NAME                              = ABSTRACT_PARAMETER__NAME;

  /**
   * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE_PARAMETER__IS_MANDATORY                      = ABSTRACT_PARAMETER__IS_MANDATORY;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE_PARAMETER__DEFAULT_VALUE                     = ABSTRACT_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute Parameter</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ATTRIBUTE_PARAMETER_FEATURE_COUNT                      = ABSTRACT_PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.CometStepImpl <em>Comet Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.CometStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getCometStep()
   * @generated
   */
  int           COMET_STEP                                             = 8;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__IMPORTS                                    = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           COMET_STEP__EXCEPTION                                  = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__RESOURCES                                  = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__ATTRIBUTES                                 = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__ANNOTATIONS                                = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__REPETITION_HANDLER                         = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__MODIFIERS                                  = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__PARAMETERS                                 = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__INCLUDE_FILES                              = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__NAME                                       = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__ID                                         = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__ENABLED                                    = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__WARN_ON_FAILURE                            = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__WAIT_BEFORE                                = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__WAIT_AFTER                                 = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__DEFAULT_STATUS                             = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__STATUS_CONDITION                           = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__PROCEDURE                                  = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__CAN_MULTIPLEX                              = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__MAX_SIMULTANEOUS_ITERATIONS                = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Comet Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP__COMET_CONFIGURATION                        = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comet Step</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           COMET_STEP_FEATURE_COUNT                               = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.ConfigImpl <em>Config</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.ConfigImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getConfig()
   * @generated
   */
  int           CONFIG                                                 = 9;

  /**
   * The feature id for the '<em><b>Required Packages</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           CONFIG__REQUIRED_PACKAGES                              = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CONFIG__NAME                                           = 1;

  /**
   * The feature id for the '<em><b>Logic Provider</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CONFIG__LOGIC_PROVIDER                                 = 2;

  /**
   * The number of structural features of the '<em>Config</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CONFIG_FEATURE_COUNT                                   = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.CpsStepImpl <em>Cps Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.CpsStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getCpsStep()
   * @generated
   */
  int           CPS_STEP                                               = 10;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__IMPORTS                                      = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           CPS_STEP__EXCEPTION                                    = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__RESOURCES                                    = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__ATTRIBUTES                                   = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__ANNOTATIONS                                  = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__REPETITION_HANDLER                           = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__MODIFIERS                                    = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__PARAMETERS                                   = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__INCLUDE_FILES                                = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__NAME                                         = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__ID                                           = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__ENABLED                                      = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__WARN_ON_FAILURE                              = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__WAIT_BEFORE                                  = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__WAIT_AFTER                                   = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__DEFAULT_STATUS                               = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__STATUS_CONDITION                             = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__PROCEDURE                                    = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__CAN_MULTIPLEX                                = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__MAX_SIMULTANEOUS_ITERATIONS                  = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Cps Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP__CPS_CONFIGURATION                            = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Cps Step</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CPS_STEP_FEATURE_COUNT                                 = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.CustomLinkImpl <em>Custom Link</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.CustomLinkImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getCustomLink()
   * @generated
   */
  int           CUSTOM_LINK                                            = 11;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CUSTOM_LINK__SOURCE                                    = ABSTRACT_LINK__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CUSTOM_LINK__TARGET                                    = ABSTRACT_LINK__TARGET;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CUSTOM_LINK__CODE                                      = ABSTRACT_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           CUSTOM_LINK__DESCRIPTION                               = ABSTRACT_LINK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Custom Link</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           CUSTOM_LINK_FEATURE_COUNT                              = ABSTRACT_LINK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.DataCompareStepImpl <em>Data Compare Step</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.DataCompareStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getDataCompareStep()
   * @generated
   */
  int           DATA_COMPARE_STEP                                      = 12;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__IMPORTS                             = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__EXCEPTION                           = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__RESOURCES                           = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__ATTRIBUTES                          = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__ANNOTATIONS                         = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__REPETITION_HANDLER                  = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__MODIFIERS                           = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__PARAMETERS                          = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__INCLUDE_FILES                       = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__NAME                                = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__ID                                  = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__ENABLED                             = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__WARN_ON_FAILURE                     = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__WAIT_BEFORE                         = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__WAIT_AFTER                          = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__DEFAULT_STATUS                      = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__STATUS_CONDITION                    = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__PROCEDURE                           = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__CAN_MULTIPLEX                       = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__MAX_SIMULTANEOUS_ITERATIONS         = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Data Compare Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP__DATA_COMPARE_CONFIGURATION          = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Compare Step</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_STEP_FEATURE_COUNT                        = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.DataCompareSummaryStepImpl <em>Data Compare Summary Step</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.DataCompareSummaryStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getDataCompareSummaryStep()
   * @generated
   */
  int           DATA_COMPARE_SUMMARY_STEP                              = 13;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__IMPORTS                     = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__EXCEPTION                   = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__RESOURCES                   = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__ATTRIBUTES                  = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__ANNOTATIONS                 = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__REPETITION_HANDLER          = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__MODIFIERS                   = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__PARAMETERS                  = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__INCLUDE_FILES               = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__NAME                        = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__ID                          = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__ENABLED                     = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__WARN_ON_FAILURE             = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__WAIT_BEFORE                 = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__WAIT_AFTER                  = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__DEFAULT_STATUS              = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__STATUS_CONDITION            = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__PROCEDURE                   = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__CAN_MULTIPLEX               = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP__MAX_SIMULTANEOUS_ITERATIONS = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The number of structural features of the '<em>Data Compare Summary Step</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DATA_COMPARE_SUMMARY_STEP_FEATURE_COUNT                = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.DocumentRootImpl <em>Document Root</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getDocumentRoot()
   * @generated
   */
  int           DOCUMENT_ROOT                                          = 14;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENT_ROOT__MIXED                                   = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENT_ROOT__XMLNS_PREFIX_MAP                        = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENT_ROOT__XSI_SCHEMA_LOCATION                     = 2;

  /**
   * The feature id for the '<em><b>Saturn</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           DOCUMENT_ROOT__SATURN                                  = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           DOCUMENT_ROOT_FEATURE_COUNT                            = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.DocumentumStepImpl <em>Documentum Step</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.DocumentumStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getDocumentumStep()
   * @generated
   */
  int           DOCUMENTUM_STEP                                        = 15;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__IMPORTS                               = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__EXCEPTION                             = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__RESOURCES                             = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__ATTRIBUTES                            = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__ANNOTATIONS                           = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__REPETITION_HANDLER                    = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__MODIFIERS                             = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__PARAMETERS                            = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__INCLUDE_FILES                         = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__NAME                                  = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__ID                                    = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__ENABLED                               = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__WARN_ON_FAILURE                       = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__WAIT_BEFORE                           = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__WAIT_AFTER                            = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__DEFAULT_STATUS                        = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__STATUS_CONDITION                      = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__PROCEDURE                             = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__CAN_MULTIPLEX                         = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__MAX_SIMULTANEOUS_ITERATIONS           = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Documentum Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP__DOCUMENTUM_CONFIGURATION              = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Documentum Step</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DOCUMENTUM_STEP_FEATURE_COUNT                          = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.DSConvertStepImpl <em>DS Convert Step</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.DSConvertStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getDSConvertStep()
   * @generated
   */
  int           DS_CONVERT_STEP                                        = 16;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__IMPORTS                               = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__EXCEPTION                             = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__RESOURCES                             = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__ATTRIBUTES                            = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__ANNOTATIONS                           = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__REPETITION_HANDLER                    = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__MODIFIERS                             = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__PARAMETERS                            = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__INCLUDE_FILES                         = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__NAME                                  = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__ID                                    = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__ENABLED                               = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__WARN_ON_FAILURE                       = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__WAIT_BEFORE                           = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__WAIT_AFTER                            = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__DEFAULT_STATUS                        = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__STATUS_CONDITION                      = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__PROCEDURE                             = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__CAN_MULTIPLEX                         = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__MAX_SIMULTANEOUS_ITERATIONS           = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>DS Convert Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP__DS_CONVERT_CONFIGURATION              = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DS Convert Step</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_CONVERT_STEP_FEATURE_COUNT                          = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.DSValidatorStepImpl <em>DS Validator Step</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.DSValidatorStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getDSValidatorStep()
   * @generated
   */
  int           DS_VALIDATOR_STEP                                      = 17;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__IMPORTS                             = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__EXCEPTION                           = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__RESOURCES                           = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__ATTRIBUTES                          = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__ANNOTATIONS                         = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__REPETITION_HANDLER                  = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__MODIFIERS                           = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__PARAMETERS                          = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__INCLUDE_FILES                       = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__NAME                                = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__ID                                  = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__ENABLED                             = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__WARN_ON_FAILURE                     = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__WAIT_BEFORE                         = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__WAIT_AFTER                          = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__DEFAULT_STATUS                      = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__STATUS_CONDITION                    = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__PROCEDURE                           = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__CAN_MULTIPLEX                       = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__MAX_SIMULTANEOUS_ITERATIONS         = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>DS Validator Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP__DS_VALIDATOR_CONFIGURATION          = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DS Validator Step</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           DS_VALIDATOR_STEP_FEATURE_COUNT                        = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.EnvValidatorStepImpl <em>Env Validator Step</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.EnvValidatorStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getEnvValidatorStep()
   * @generated
   */
  int           ENV_VALIDATOR_STEP                                     = 18;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__IMPORTS                            = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__EXCEPTION                          = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__RESOURCES                          = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__ATTRIBUTES                         = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__ANNOTATIONS                        = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__REPETITION_HANDLER                 = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__MODIFIERS                          = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__PARAMETERS                         = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__INCLUDE_FILES                      = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__NAME                               = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__ID                                 = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__ENABLED                            = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__WARN_ON_FAILURE                    = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__WAIT_BEFORE                        = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__WAIT_AFTER                         = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__DEFAULT_STATUS                     = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__STATUS_CONDITION                   = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__PROCEDURE                          = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__CAN_MULTIPLEX                      = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__MAX_SIMULTANEOUS_ITERATIONS        = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Env Validator Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP__ENV_VALIDATOR_CONFIGURATION        = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Env Validator Step</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           ENV_VALIDATOR_STEP_FEATURE_COUNT                       = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.ExtractDDLStepImpl <em>Extract DDL Step</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.ExtractDDLStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getExtractDDLStep()
   * @generated
   */
  int           EXTRACT_DDL_STEP                                       = 19;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__IMPORTS                              = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__EXCEPTION                            = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__RESOURCES                            = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__ATTRIBUTES                           = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__ANNOTATIONS                          = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__REPETITION_HANDLER                   = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__MODIFIERS                            = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__PARAMETERS                           = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__INCLUDE_FILES                        = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__NAME                                 = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__ID                                   = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__ENABLED                              = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__WARN_ON_FAILURE                      = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__WAIT_BEFORE                          = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__WAIT_AFTER                           = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__DEFAULT_STATUS                       = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__STATUS_CONDITION                     = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__PROCEDURE                            = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__CAN_MULTIPLEX                        = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__MAX_SIMULTANEOUS_ITERATIONS          = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Extract DDL Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP__EXTRACT_DDL_CONFIGURATION            = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Extract DDL Step</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           EXTRACT_DDL_STEP_FEATURE_COUNT                         = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.FailTerminalImpl <em>Fail Terminal</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.FailTerminalImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getFailTerminal()
   * @generated
   */
  int           FAIL_TERMINAL                                          = 20;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__IMPORTS                                 = ABSTRACT_TERMINAL__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__EXCEPTION                               = ABSTRACT_TERMINAL__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__RESOURCES                               = ABSTRACT_TERMINAL__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__ATTRIBUTES                              = ABSTRACT_TERMINAL__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__ANNOTATIONS                             = ABSTRACT_TERMINAL__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__REPETITION_HANDLER                      = ABSTRACT_TERMINAL__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__MODIFIERS                               = ABSTRACT_TERMINAL__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__PARAMETERS                              = ABSTRACT_TERMINAL__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__INCLUDE_FILES                           = ABSTRACT_TERMINAL__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__NAME                                    = ABSTRACT_TERMINAL__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__ID                                      = ABSTRACT_TERMINAL__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__ENABLED                                 = ABSTRACT_TERMINAL__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__WARN_ON_FAILURE                         = ABSTRACT_TERMINAL__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__WAIT_BEFORE                             = ABSTRACT_TERMINAL__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__WAIT_AFTER                              = ABSTRACT_TERMINAL__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__DEFAULT_STATUS                          = ABSTRACT_TERMINAL__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__STATUS_CONDITION                        = ABSTRACT_TERMINAL__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__PROCEDURE                               = ABSTRACT_TERMINAL__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__CAN_MULTIPLEX                           = ABSTRACT_TERMINAL__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__MAX_SIMULTANEOUS_ITERATIONS             = ABSTRACT_TERMINAL__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Repetition Action</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__REPETITION_ACTION                       = ABSTRACT_TERMINAL__REPETITION_ACTION;

  /**
   * The feature id for the '<em><b>Termination Status</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL__TERMINATION_STATUS                      = ABSTRACT_TERMINAL__TERMINATION_STATUS;

  /**
   * The number of structural features of the '<em>Fail Terminal</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           FAIL_TERMINAL_FEATURE_COUNT                            = ABSTRACT_TERMINAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.FixManipStepImpl <em>Fix Manip Step</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.FixManipStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getFixManipStep()
   * @generated
   */
  int           FIX_MANIP_STEP                                         = 21;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__IMPORTS                                = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__EXCEPTION                              = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__RESOURCES                              = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__ATTRIBUTES                             = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__ANNOTATIONS                            = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__REPETITION_HANDLER                     = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__MODIFIERS                              = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__PARAMETERS                             = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__INCLUDE_FILES                          = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__NAME                                   = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__ID                                     = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__ENABLED                                = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__WARN_ON_FAILURE                        = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__WAIT_BEFORE                            = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__WAIT_AFTER                             = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__DEFAULT_STATUS                         = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__STATUS_CONDITION                       = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__PROCEDURE                              = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__CAN_MULTIPLEX                          = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__MAX_SIMULTANEOUS_ITERATIONS            = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Fix Manip Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP__FIX_MANIP_CONFIGURATION                = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fix Manip Step</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           FIX_MANIP_STEP_FEATURE_COUNT                           = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.IncludeFileImpl <em>Include File</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.IncludeFileImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getIncludeFile()
   * @generated
   */
  int           INCLUDE_FILE                                           = 22;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_FILE__DESCRIPTION = ValuesPackage.COMPLEX_VALUE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE__MIXED                                    = ValuesPackage.COMPLEX_VALUE__MIXED;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE__NULL                                     = ValuesPackage.COMPLEX_VALUE__NULL;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE__GROUP                                    = ValuesPackage.COMPLEX_VALUE__GROUP;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE__TEXT                                     = ValuesPackage.COMPLEX_VALUE__TEXT;

  /**
   * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE__ENV_VAR                                  = ValuesPackage.COMPLEX_VALUE__ENV_VAR;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE__FILE                                     = ValuesPackage.COMPLEX_VALUE__FILE;

  /**
   * The feature id for the '<em><b>XPath Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE__XPATH_VALUE                              = ValuesPackage.COMPLEX_VALUE__XPATH_VALUE;

  /**
   * The feature id for the '<em><b>JSON Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_FILE__JSON_VALUE = ValuesPackage.COMPLEX_VALUE__JSON_VALUE;

  /**
   * The feature id for the '<em><b>FIX Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_FILE__FIX_VALUE = ValuesPackage.COMPLEX_VALUE__FIX_VALUE;

  /**
   * The feature id for the '<em><b>Cell Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE__CELL_VALUE                               = ValuesPackage.COMPLEX_VALUE__CELL_VALUE;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE__PROPERTY_VALUE                           = ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE__CODE                                     = ValuesPackage.COMPLEX_VALUE__CODE;

  /**
   * The feature id for the '<em><b>Run Number</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE__RUN_NUMBER                               = ValuesPackage.COMPLEX_VALUE__RUN_NUMBER;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE__REFERENCE                                = ValuesPackage.COMPLEX_VALUE__REFERENCE;

  /**
   * The feature id for the '<em><b>Memoize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE__MEMOIZE                                  = ValuesPackage.COMPLEX_VALUE__MEMOIZE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE__NAME                                     = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE__FORMAT                                   = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Include File</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           INCLUDE_FILE_FEATURE_COUNT                             = ValuesPackage.COMPLEX_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.JiraStepImpl <em>Jira Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.JiraStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getJiraStep()
   * @generated
   */
  int           JIRA_STEP                                              = 23;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__IMPORTS                                     = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           JIRA_STEP__EXCEPTION                                   = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__RESOURCES                                   = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__ATTRIBUTES                                  = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__ANNOTATIONS                                 = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__REPETITION_HANDLER                          = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__MODIFIERS                                   = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__PARAMETERS                                  = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__INCLUDE_FILES                               = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__NAME                                        = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__ID                                          = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__ENABLED                                     = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__WARN_ON_FAILURE                             = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__WAIT_BEFORE                                 = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__WAIT_AFTER                                  = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__DEFAULT_STATUS                              = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__STATUS_CONDITION                            = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__PROCEDURE                                   = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__CAN_MULTIPLEX                               = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP__MAX_SIMULTANEOUS_ITERATIONS                 = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The number of structural features of the '<em>Jira Step</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           JIRA_STEP_FEATURE_COUNT                                = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.KronusStepImpl <em>Kronus Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.KronusStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getKronusStep()
   * @generated
   */
  int KRONUS_STEP = 24;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__IMPORTS = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__EXCEPTION = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__RESOURCES = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__ATTRIBUTES = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__ANNOTATIONS = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__REPETITION_HANDLER = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__MODIFIERS = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__PARAMETERS = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__INCLUDE_FILES = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__NAME = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__ID = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__ENABLED = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__WARN_ON_FAILURE = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__WAIT_BEFORE = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__WAIT_AFTER = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__DEFAULT_STATUS = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__STATUS_CONDITION = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__PROCEDURE = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__CAN_MULTIPLEX = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__MAX_SIMULTANEOUS_ITERATIONS = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Kronus Call Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP__KRONUS_CALL_CONFIGURATION = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Kronus Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_STEP_FEATURE_COUNT = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.MailStepImpl <em>Mail Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.MailStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getMailStep()
   * @generated
   */
  int           MAIL_STEP                                              = 25;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__IMPORTS                                     = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           MAIL_STEP__EXCEPTION                                   = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__RESOURCES                                   = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__ATTRIBUTES                                  = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__ANNOTATIONS                                 = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__REPETITION_HANDLER                          = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__MODIFIERS                                   = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__PARAMETERS                                  = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__INCLUDE_FILES                               = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__NAME                                        = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__ID                                          = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__ENABLED                                     = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__WARN_ON_FAILURE                             = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__WAIT_BEFORE                                 = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__WAIT_AFTER                                  = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__DEFAULT_STATUS                              = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__STATUS_CONDITION                            = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__PROCEDURE                                   = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__CAN_MULTIPLEX                               = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__MAX_SIMULTANEOUS_ITERATIONS                 = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Mail Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP__MAIL_CONFIGURATION                          = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mail Step</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MAIL_STEP_FEATURE_COUNT                                = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.MQStepImpl <em>MQ Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.MQStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getMQStep()
   * @generated
   */
  int           MQ_STEP                                                = 26;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__IMPORTS                                       = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           MQ_STEP__EXCEPTION                                     = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__RESOURCES                                     = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__ATTRIBUTES                                    = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__ANNOTATIONS                                   = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__REPETITION_HANDLER                            = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__MODIFIERS                                     = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__PARAMETERS                                    = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__INCLUDE_FILES                                 = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__NAME                                          = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__ID                                            = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__ENABLED                                       = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__WARN_ON_FAILURE                               = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__WAIT_BEFORE                                   = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__WAIT_AFTER                                    = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__DEFAULT_STATUS                                = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__STATUS_CONDITION                              = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__PROCEDURE                                     = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__CAN_MULTIPLEX                                 = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__MAX_SIMULTANEOUS_ITERATIONS                   = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>MQ Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP__MQ_CONFIGURATION                              = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>MQ Step</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           MQ_STEP_FEATURE_COUNT                                  = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.NoopTerminalImpl <em>Noop Terminal</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.NoopTerminalImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getNoopTerminal()
   * @generated
   */
  int           NOOP_TERMINAL                                          = 27;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__IMPORTS                                 = ABSTRACT_TERMINAL__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__EXCEPTION                               = ABSTRACT_TERMINAL__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__RESOURCES                               = ABSTRACT_TERMINAL__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__ATTRIBUTES                              = ABSTRACT_TERMINAL__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__ANNOTATIONS                             = ABSTRACT_TERMINAL__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__REPETITION_HANDLER                      = ABSTRACT_TERMINAL__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__MODIFIERS                               = ABSTRACT_TERMINAL__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__PARAMETERS                              = ABSTRACT_TERMINAL__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__INCLUDE_FILES                           = ABSTRACT_TERMINAL__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__NAME                                    = ABSTRACT_TERMINAL__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__ID                                      = ABSTRACT_TERMINAL__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__ENABLED                                 = ABSTRACT_TERMINAL__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__WARN_ON_FAILURE                         = ABSTRACT_TERMINAL__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__WAIT_BEFORE                             = ABSTRACT_TERMINAL__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__WAIT_AFTER                              = ABSTRACT_TERMINAL__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__DEFAULT_STATUS                          = ABSTRACT_TERMINAL__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__STATUS_CONDITION                        = ABSTRACT_TERMINAL__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__PROCEDURE                               = ABSTRACT_TERMINAL__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__CAN_MULTIPLEX                           = ABSTRACT_TERMINAL__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__MAX_SIMULTANEOUS_ITERATIONS             = ABSTRACT_TERMINAL__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Repetition Action</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__REPETITION_ACTION                       = ABSTRACT_TERMINAL__REPETITION_ACTION;

  /**
   * The feature id for the '<em><b>Termination Status</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL__TERMINATION_STATUS                      = ABSTRACT_TERMINAL__TERMINATION_STATUS;

  /**
   * The number of structural features of the '<em>Noop Terminal</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           NOOP_TERMINAL_FEATURE_COUNT                            = ABSTRACT_TERMINAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.OnFailLinkImpl <em>On Fail Link</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.OnFailLinkImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getOnFailLink()
   * @generated
   */
  int           ON_FAIL_LINK                                           = 28;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ON_FAIL_LINK__SOURCE                                   = ABSTRACT_LINK__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ON_FAIL_LINK__TARGET                                   = ABSTRACT_LINK__TARGET;

  /**
   * The number of structural features of the '<em>On Fail Link</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           ON_FAIL_LINK_FEATURE_COUNT                             = ABSTRACT_LINK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.OnFinishLinkImpl <em>On Finish Link</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.OnFinishLinkImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getOnFinishLink()
   * @generated
   */
  int           ON_FINISH_LINK                                         = 29;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ON_FINISH_LINK__SOURCE                                 = ABSTRACT_LINK__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ON_FINISH_LINK__TARGET                                 = ABSTRACT_LINK__TARGET;

  /**
   * The number of structural features of the '<em>On Finish Link</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           ON_FINISH_LINK_FEATURE_COUNT                           = ABSTRACT_LINK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.OnPassLinkImpl <em>On Pass Link</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.OnPassLinkImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getOnPassLink()
   * @generated
   */
  int           ON_PASS_LINK                                           = 30;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ON_PASS_LINK__SOURCE                                   = ABSTRACT_LINK__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           ON_PASS_LINK__TARGET                                   = ABSTRACT_LINK__TARGET;

  /**
   * The number of structural features of the '<em>On Pass Link</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           ON_PASS_LINK_FEATURE_COUNT                             = ABSTRACT_LINK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.P4StepImpl <em>P4 Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.P4StepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getP4Step()
   * @generated
   */
  int           P4_STEP                                                = 31;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__IMPORTS                                       = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           P4_STEP__EXCEPTION                                     = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__RESOURCES                                     = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__ATTRIBUTES                                    = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__ANNOTATIONS                                   = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__REPETITION_HANDLER                            = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__MODIFIERS                                     = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__PARAMETERS                                    = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__INCLUDE_FILES                                 = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__NAME                                          = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__ID                                            = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__ENABLED                                       = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__WARN_ON_FAILURE                               = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__WAIT_BEFORE                                   = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__WAIT_AFTER                                    = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__DEFAULT_STATUS                                = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__STATUS_CONDITION                              = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__PROCEDURE                                     = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__CAN_MULTIPLEX                                 = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP__MAX_SIMULTANEOUS_ITERATIONS                   = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The number of structural features of the '<em>P4 Step</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           P4_STEP_FEATURE_COUNT                                  = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.PassTerminalImpl <em>Pass Terminal</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.PassTerminalImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getPassTerminal()
   * @generated
   */
  int           PASS_TERMINAL                                          = 32;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__IMPORTS                                 = ABSTRACT_TERMINAL__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__EXCEPTION                               = ABSTRACT_TERMINAL__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__RESOURCES                               = ABSTRACT_TERMINAL__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__ATTRIBUTES                              = ABSTRACT_TERMINAL__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__ANNOTATIONS                             = ABSTRACT_TERMINAL__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__REPETITION_HANDLER                      = ABSTRACT_TERMINAL__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__MODIFIERS                               = ABSTRACT_TERMINAL__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__PARAMETERS                              = ABSTRACT_TERMINAL__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__INCLUDE_FILES                           = ABSTRACT_TERMINAL__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__NAME                                    = ABSTRACT_TERMINAL__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__ID                                      = ABSTRACT_TERMINAL__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__ENABLED                                 = ABSTRACT_TERMINAL__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__WARN_ON_FAILURE                         = ABSTRACT_TERMINAL__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__WAIT_BEFORE                             = ABSTRACT_TERMINAL__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__WAIT_AFTER                              = ABSTRACT_TERMINAL__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__DEFAULT_STATUS                          = ABSTRACT_TERMINAL__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__STATUS_CONDITION                        = ABSTRACT_TERMINAL__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__PROCEDURE                               = ABSTRACT_TERMINAL__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__CAN_MULTIPLEX                           = ABSTRACT_TERMINAL__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__MAX_SIMULTANEOUS_ITERATIONS             = ABSTRACT_TERMINAL__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Repetition Action</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__REPETITION_ACTION                       = ABSTRACT_TERMINAL__REPETITION_ACTION;

  /**
   * The feature id for the '<em><b>Termination Status</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL__TERMINATION_STATUS                      = ABSTRACT_TERMINAL__TERMINATION_STATUS;

  /**
   * The number of structural features of the '<em>Pass Terminal</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           PASS_TERMINAL_FEATURE_COUNT                            = ABSTRACT_TERMINAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.PerlRunGroupModifierImpl <em>Perl Run Group Modifier</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.PerlRunGroupModifierImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getPerlRunGroupModifier()
   * @generated
   */
  int           PERL_RUN_GROUP_MODIFIER                                = 33;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PERL_RUN_GROUP_MODIFIER__ENABLED                       = TypesPackage.ABSTRACT_RUN_GROUP_MODIFIER__ENABLED;

  /**
   * The feature id for the '<em><b>Perl Code</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           PERL_RUN_GROUP_MODIFIER__PERL_CODE                     = TypesPackage.ABSTRACT_RUN_GROUP_MODIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Perl Run Group Modifier</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PERL_RUN_GROUP_MODIFIER_FEATURE_COUNT                  = TypesPackage.ABSTRACT_RUN_GROUP_MODIFIER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.ProcedureCallStepImpl <em>Procedure Call Step</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.ProcedureCallStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getProcedureCallStep()
   * @generated
   */
  int           PROCEDURE_CALL_STEP                                    = 34;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__IMPORTS                           = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__EXCEPTION                         = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__RESOURCES                         = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__ATTRIBUTES                        = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__ANNOTATIONS                       = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__REPETITION_HANDLER                = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__MODIFIERS                         = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__PARAMETERS                        = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__INCLUDE_FILES                     = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__NAME                              = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__ID                                = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__ENABLED                           = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__WARN_ON_FAILURE                   = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__WAIT_BEFORE                       = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__WAIT_AFTER                        = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__DEFAULT_STATUS                    = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__STATUS_CONDITION                  = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__PROCEDURE                         = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__CAN_MULTIPLEX                     = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__MAX_SIMULTANEOUS_ITERATIONS       = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Procedure Call Configuration</b></em>' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP__PROCEDURE_CALL_CONFIGURATION      = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Procedure Call Step</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PROCEDURE_CALL_STEP_FEATURE_COUNT                      = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.PsManagerStepImpl <em>Ps Manager Step</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.PsManagerStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getPsManagerStep()
   * @generated
   */
  int           PS_MANAGER_STEP                                        = 35;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__IMPORTS                               = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__EXCEPTION                             = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__RESOURCES                             = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__ATTRIBUTES                            = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__ANNOTATIONS                           = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__REPETITION_HANDLER                    = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__MODIFIERS                             = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__PARAMETERS                            = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__INCLUDE_FILES                         = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__NAME                                  = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__ID                                    = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__ENABLED                               = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__WARN_ON_FAILURE                       = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__WAIT_BEFORE                           = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__WAIT_AFTER                            = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__DEFAULT_STATUS                        = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__STATUS_CONDITION                      = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__PROCEDURE                             = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__CAN_MULTIPLEX                         = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__MAX_SIMULTANEOUS_ITERATIONS           = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Ps Manager Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP__PS_MANAGER_CONFIGURATION              = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ps Manager Step</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           PS_MANAGER_STEP_FEATURE_COUNT                          = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.ReferenceImpl <em>Reference</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.ReferenceImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getReference()
   * @generated
   */
  int           REFERENCE                                              = 36;

  /**
   * The feature id for the '<em><b>Include File</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE__INCLUDE_FILE                                = 0;

  /**
   * The feature id for the '<em><b>Template</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE__TEMPLATE                                    = 1;

  /**
   * The feature id for the '<em><b>Run Group</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE__RUN_GROUP                                   = 2;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_FEATURE_COUNT                                = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.ReferenceStepImpl <em>Reference Step</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.ReferenceStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getReferenceStep()
   * @generated
   */
  int           REFERENCE_STEP                                         = 37;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__IMPORTS                                = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__EXCEPTION                              = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__RESOURCES                              = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__ATTRIBUTES                             = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__ANNOTATIONS                            = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__REPETITION_HANDLER                     = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__MODIFIERS                              = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__PARAMETERS                             = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__INCLUDE_FILES                          = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__NAME                                   = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__ID                                     = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__ENABLED                                = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__WARN_ON_FAILURE                        = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__WAIT_BEFORE                            = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__WAIT_AFTER                             = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__DEFAULT_STATUS                         = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__STATUS_CONDITION                       = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__PROCEDURE                              = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__CAN_MULTIPLEX                          = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__MAX_SIMULTANEOUS_ITERATIONS            = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Reference Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP__REFERENCE_CONFIGURATION                = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reference Step</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           REFERENCE_STEP_FEATURE_COUNT                           = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.ResourceLinkImpl <em>Resource Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.ResourceLinkImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getResourceLink()
   * @generated
   */
  int RESOURCE_LINK = 38;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_LINK__SOURCE = ABSTRACT_RESOURCE_LINK__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_LINK__TARGET = ABSTRACT_RESOURCE_LINK__TARGET;

  /**
   * The number of structural features of the '<em>Resource Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_LINK_FEATURE_COUNT = ABSTRACT_RESOURCE_LINK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.ResourceNestedLinkImpl <em>Resource Nested Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.ResourceNestedLinkImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getResourceNestedLink()
   * @generated
   */
  int RESOURCE_NESTED_LINK = 39;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_NESTED_LINK__SOURCE = ABSTRACT_RESOURCE_LINK__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_NESTED_LINK__TARGET = ABSTRACT_RESOURCE_LINK__TARGET;

  /**
   * The feature id for the '<em><b>Target Enclosing Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_NESTED_LINK__TARGET_ENCLOSING_RESOURCE = ABSTRACT_RESOURCE_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Resource Nested Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_NESTED_LINK_FEATURE_COUNT = ABSTRACT_RESOURCE_LINK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.ResourceParameterImpl <em>Resource Parameter</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.ResourceParameterImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getResourceParameter()
   * @generated
   */
  int           RESOURCE_PARAMETER                                     = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESOURCE_PARAMETER__NAME                               = ABSTRACT_PARAMETER__NAME;

  /**
   * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESOURCE_PARAMETER__IS_MANDATORY                       = ABSTRACT_PARAMETER__IS_MANDATORY;

  /**
   * The feature id for the '<em><b>Default Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESOURCE_PARAMETER__DEFAULT_RESOURCE                   = ABSTRACT_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Resource Parameter</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RESOURCE_PARAMETER_FEATURE_COUNT                       = ABSTRACT_PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.ResourceStepLinkImpl <em>Resource Step Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.ResourceStepLinkImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getResourceStepLink()
   * @generated
   */
  int RESOURCE_STEP_LINK = 41;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_STEP_LINK__SOURCE = ABSTRACT_RESOURCE_LINK__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_STEP_LINK__TARGET = ABSTRACT_RESOURCE_LINK__TARGET;

  /**
   * The feature id for the '<em><b>Target Step</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_STEP_LINK__TARGET_STEP = ABSTRACT_RESOURCE_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_STEP_LINK__DESCRIPTION = ABSTRACT_RESOURCE_LINK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Resource Step Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_STEP_LINK_FEATURE_COUNT = ABSTRACT_RESOURCE_LINK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.RunCmdsStepImpl <em>Run Cmds Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.RunCmdsStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getRunCmdsStep()
   * @generated
   */
  int           RUN_CMDS_STEP                                          = 42;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__IMPORTS                                 = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__EXCEPTION                               = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__RESOURCES                               = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__ATTRIBUTES                              = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__ANNOTATIONS                             = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__REPETITION_HANDLER                      = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__MODIFIERS                               = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__PARAMETERS                              = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__INCLUDE_FILES                           = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__NAME                                    = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__ID                                      = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__ENABLED                                 = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__WARN_ON_FAILURE                         = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__WAIT_BEFORE                             = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__WAIT_AFTER                              = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__DEFAULT_STATUS                          = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__STATUS_CONDITION                        = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__PROCEDURE                               = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__CAN_MULTIPLEX                           = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__MAX_SIMULTANEOUS_ITERATIONS             = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Run Cmds Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP__RUN_CMDS_CONFIGURATION                  = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Run Cmds Step</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           RUN_CMDS_STEP_FEATURE_COUNT                            = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.RunGroupImpl <em>Run Group</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.RunGroupImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getRunGroup()
   * @generated
   */
  int           RUN_GROUP                                              = 43;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__IMPORTS                                     = ABSTRACT_RUN_GROUP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           RUN_GROUP__EXCEPTION                                   = ABSTRACT_RUN_GROUP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__RESOURCES                                   = ABSTRACT_RUN_GROUP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__ATTRIBUTES                                  = ABSTRACT_RUN_GROUP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__ANNOTATIONS                                 = ABSTRACT_RUN_GROUP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__REPETITION_HANDLER                          = ABSTRACT_RUN_GROUP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__MODIFIERS                                   = ABSTRACT_RUN_GROUP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__PARAMETERS                                  = ABSTRACT_RUN_GROUP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__INCLUDE_FILES                               = ABSTRACT_RUN_GROUP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__NAME                                        = ABSTRACT_RUN_GROUP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__ID                                          = ABSTRACT_RUN_GROUP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__ENABLED                                     = ABSTRACT_RUN_GROUP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__WARN_ON_FAILURE                             = ABSTRACT_RUN_GROUP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__WAIT_BEFORE                                 = ABSTRACT_RUN_GROUP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__WAIT_AFTER                                  = ABSTRACT_RUN_GROUP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__DEFAULT_STATUS                              = ABSTRACT_RUN_GROUP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__STATUS_CONDITION                            = ABSTRACT_RUN_GROUP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__PROCEDURE                                   = ABSTRACT_RUN_GROUP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__CAN_MULTIPLEX                               = ABSTRACT_RUN_GROUP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__MAX_SIMULTANEOUS_ITERATIONS                 = ABSTRACT_RUN_GROUP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Run Groups</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP__RUN_GROUPS                                  = ABSTRACT_RUN_GROUP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Run Group</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP_FEATURE_COUNT                                = ABSTRACT_RUN_GROUP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.RunGroupImportImpl <em>Run Group Import</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.RunGroupImportImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getRunGroupImport()
   * @generated
   */
  int           RUN_GROUP_IMPORT                                       = 44;

  /**
   * The feature id for the '<em><b>Include File</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP_IMPORT__INCLUDE_FILE                         = 0;

  /**
   * The feature id for the '<em><b>Run Group</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP_IMPORT__RUN_GROUP                            = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP_IMPORT__ATTRIBUTES                           = 2;

  /**
   * The feature id for the '<em><b>Resources</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP_IMPORT__RESOURCES                            = 3;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP_IMPORT__ENABLED                              = 4;

  /**
   * The number of structural features of the '<em>Run Group Import</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           RUN_GROUP_IMPORT_FEATURE_COUNT                         = 5;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.SaturnImpl <em>Saturn</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.SaturnImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getSaturn()
   * @generated
   */
  int           SATURN                                                 = 45;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__IMPORTS                                        = RUN_GROUP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           SATURN__EXCEPTION                                      = RUN_GROUP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__RESOURCES                                      = RUN_GROUP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__ATTRIBUTES                                     = RUN_GROUP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__ANNOTATIONS                                    = RUN_GROUP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__REPETITION_HANDLER                             = RUN_GROUP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__MODIFIERS                                      = RUN_GROUP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__PARAMETERS                                     = RUN_GROUP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__INCLUDE_FILES                                  = RUN_GROUP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__NAME                                           = RUN_GROUP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__ID                                             = RUN_GROUP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__ENABLED                                        = RUN_GROUP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__WARN_ON_FAILURE                                = RUN_GROUP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__WAIT_BEFORE                                    = RUN_GROUP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__WAIT_AFTER                                     = RUN_GROUP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__DEFAULT_STATUS                                 = RUN_GROUP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__STATUS_CONDITION                               = RUN_GROUP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__PROCEDURE                                      = RUN_GROUP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__CAN_MULTIPLEX                                  = RUN_GROUP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__MAX_SIMULTANEOUS_ITERATIONS                    = RUN_GROUP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Run Groups</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__RUN_GROUPS                                     = RUN_GROUP__RUN_GROUPS;

  /**
   * The feature id for the '<em><b>Work Dir</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           SATURN__WORK_DIR                                       = RUN_GROUP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Run Number File Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__RUN_NUMBER_FILE_NAME                           = RUN_GROUP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Run Number</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__DEFAULT_RUN_NUMBER                             = RUN_GROUP_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Pre Execution Listeners</b></em>' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__PRE_EXECUTION_LISTENERS                        = RUN_GROUP_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Listeners</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__LISTENERS                                      = RUN_GROUP_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Post Execution Listeners</b></em>' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__POST_EXECUTION_LISTENERS                       = RUN_GROUP_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__LINKS                                          = RUN_GROUP_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Resource Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SATURN__RESOURCE_LINKS = RUN_GROUP_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN__VERSION                                        = RUN_GROUP_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Saturn</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SATURN_FEATURE_COUNT                                   = RUN_GROUP_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.SingularityStepImpl <em>Singularity Step</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.SingularityStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getSingularityStep()
   * @generated
   */
  int           SINGULARITY_STEP                                       = 46;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__IMPORTS                              = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__EXCEPTION                            = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__RESOURCES                            = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__ATTRIBUTES                           = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__ANNOTATIONS                          = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__REPETITION_HANDLER                   = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__MODIFIERS                            = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__PARAMETERS                           = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__INCLUDE_FILES                        = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__NAME                                 = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__ID                                   = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__ENABLED                              = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__WARN_ON_FAILURE                      = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__WAIT_BEFORE                          = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__WAIT_AFTER                           = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__DEFAULT_STATUS                       = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__STATUS_CONDITION                     = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__PROCEDURE                            = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__CAN_MULTIPLEX                        = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__MAX_SIMULTANEOUS_ITERATIONS          = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Singularity Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP__SINGULARITY_CONFIGURATION            = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Singularity Step</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SINGULARITY_STEP_FEATURE_COUNT                         = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.SoapIOStepImpl <em>Soap IO Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.SoapIOStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getSoapIOStep()
   * @generated
   */
  int           SOAP_IO_STEP                                           = 47;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__IMPORTS                                  = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__EXCEPTION                                = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__RESOURCES                                = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__ATTRIBUTES                               = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__ANNOTATIONS                              = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__REPETITION_HANDLER                       = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__MODIFIERS                                = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__PARAMETERS                               = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__INCLUDE_FILES                            = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__NAME                                     = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__ID                                       = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__ENABLED                                  = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__WARN_ON_FAILURE                          = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__WAIT_BEFORE                              = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__WAIT_AFTER                               = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__DEFAULT_STATUS                           = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__STATUS_CONDITION                         = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__PROCEDURE                                = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__CAN_MULTIPLEX                            = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__MAX_SIMULTANEOUS_ITERATIONS              = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Soap IO Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP__SOAP_IO_CONFIGURATION                    = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Soap IO Step</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           SOAP_IO_STEP_FEATURE_COUNT                             = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.SQLStepImpl <em>SQL Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.SQLStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getSQLStep()
   * @generated
   */
  int           SQL_STEP                                               = 48;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__IMPORTS                                      = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           SQL_STEP__EXCEPTION                                    = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__RESOURCES                                    = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__ATTRIBUTES                                   = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__ANNOTATIONS                                  = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__REPETITION_HANDLER                           = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__MODIFIERS                                    = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__PARAMETERS                                   = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__INCLUDE_FILES                                = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__NAME                                         = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__ID                                           = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__ENABLED                                      = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__WARN_ON_FAILURE                              = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__WAIT_BEFORE                                  = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__WAIT_AFTER                                   = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__DEFAULT_STATUS                               = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__STATUS_CONDITION                             = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__PROCEDURE                                    = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__CAN_MULTIPLEX                                = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__MAX_SIMULTANEOUS_ITERATIONS                  = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>SQL Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP__SQL_CONFIGURATION                            = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SQL Step</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           SQL_STEP_FEATURE_COUNT                                 = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.VmsStepImpl <em>Vms Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.VmsStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getVmsStep()
   * @generated
   */
  int           VMS_STEP                                               = 49;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__IMPORTS                                      = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           VMS_STEP__EXCEPTION                                    = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__RESOURCES                                    = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__ATTRIBUTES                                   = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__ANNOTATIONS                                  = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__REPETITION_HANDLER                           = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__MODIFIERS                                    = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__PARAMETERS                                   = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__INCLUDE_FILES                                = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__NAME                                         = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__ID                                           = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__ENABLED                                      = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__WARN_ON_FAILURE                              = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__WAIT_BEFORE                                  = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__WAIT_AFTER                                   = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__DEFAULT_STATUS                               = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__STATUS_CONDITION                             = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__PROCEDURE                                    = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__CAN_MULTIPLEX                                = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP__MAX_SIMULTANEOUS_ITERATIONS                  = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The number of structural features of the '<em>Vms Step</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           VMS_STEP_FEATURE_COUNT                                 = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.Xml2CsvStepImpl <em>Xml2 Csv Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.Xml2CsvStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getXml2CsvStep()
   * @generated
   */
  int           XML2_CSV_STEP                                          = 50;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__IMPORTS                                 = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__EXCEPTION                               = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__RESOURCES                               = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__ATTRIBUTES                              = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__ANNOTATIONS                             = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__REPETITION_HANDLER                      = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__MODIFIERS                               = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__PARAMETERS                              = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__INCLUDE_FILES                           = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__NAME                                    = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__ID                                      = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__ENABLED                                 = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__WARN_ON_FAILURE                         = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__WAIT_BEFORE                             = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__WAIT_AFTER                              = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__DEFAULT_STATUS                          = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__STATUS_CONDITION                        = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__PROCEDURE                               = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__CAN_MULTIPLEX                           = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__MAX_SIMULTANEOUS_ITERATIONS             = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Xml2 Csv Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP__XML2_CSV_CONFIGURATION                  = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Xml2 Csv Step</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           XML2_CSV_STEP_FEATURE_COUNT                            = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.XmlDiffStepImpl <em>Xml Diff Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.XmlDiffStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getXmlDiffStep()
   * @generated
   */
  int           XML_DIFF_STEP                                          = 51;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__IMPORTS                                 = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__EXCEPTION                               = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__RESOURCES                               = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__ATTRIBUTES                              = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__ANNOTATIONS                             = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__REPETITION_HANDLER                      = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__MODIFIERS                               = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__PARAMETERS                              = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__INCLUDE_FILES                           = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__NAME                                    = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__ID                                      = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__ENABLED                                 = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__WARN_ON_FAILURE                         = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__WAIT_BEFORE                             = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__WAIT_AFTER                              = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__DEFAULT_STATUS                          = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__STATUS_CONDITION                        = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__PROCEDURE                               = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__CAN_MULTIPLEX                           = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__MAX_SIMULTANEOUS_ITERATIONS             = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Xml Diff Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP__XML_DIFF_CONFIGURATION                  = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Xml Diff Step</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           XML_DIFF_STEP_FEATURE_COUNT                            = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.XmlGenStepImpl <em>Xml Gen Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.XmlGenStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getXmlGenStep()
   * @generated
   */
  int           XML_GEN_STEP                                           = 52;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__IMPORTS                                  = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__EXCEPTION                                = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__RESOURCES                                = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__ATTRIBUTES                               = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__ANNOTATIONS                              = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__REPETITION_HANDLER                       = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__MODIFIERS                                = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__PARAMETERS                               = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__INCLUDE_FILES                            = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__NAME                                     = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__ID                                       = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__ENABLED                                  = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__WARN_ON_FAILURE                          = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__WAIT_BEFORE                              = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__WAIT_AFTER                               = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__DEFAULT_STATUS                           = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__STATUS_CONDITION                         = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__PROCEDURE                                = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__CAN_MULTIPLEX                            = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__MAX_SIMULTANEOUS_ITERATIONS              = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Xml Gen Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP__XML_GEN_CONFIGURATION                    = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Xml Gen Step</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           XML_GEN_STEP_FEATURE_COUNT                             = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.XmlManipStepImpl <em>Xml Manip Step</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.XmlManipStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getXmlManipStep()
   * @generated
   */
  int           XML_MANIP_STEP                                         = 53;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__IMPORTS                                = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__EXCEPTION                              = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__RESOURCES                              = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__ATTRIBUTES                             = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__ANNOTATIONS                            = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__REPETITION_HANDLER                     = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__MODIFIERS                              = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__PARAMETERS                             = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__INCLUDE_FILES                          = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__NAME                                   = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__ID                                     = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__ENABLED                                = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__WARN_ON_FAILURE                        = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__WAIT_BEFORE                            = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__WAIT_AFTER                             = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__DEFAULT_STATUS                         = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__STATUS_CONDITION                       = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__PROCEDURE                              = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__CAN_MULTIPLEX                          = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__MAX_SIMULTANEOUS_ITERATIONS            = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Xml Manip Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP__XML_MANIP_CONFIGURATION                = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Xml Manip Step</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           XML_MANIP_STEP_FEATURE_COUNT                           = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.XmlValidatorStepImpl <em>Xml Validator Step</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.impl.XmlValidatorStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getXmlValidatorStep()
   * @generated
   */
  int           XML_VALIDATOR_STEP                                     = 54;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__IMPORTS                            = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__EXCEPTION                          = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__RESOURCES                          = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__ATTRIBUTES                         = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__ANNOTATIONS                        = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__REPETITION_HANDLER                 = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__MODIFIERS                          = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__PARAMETERS                         = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__INCLUDE_FILES                      = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__NAME                               = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__ID                                 = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__ENABLED                            = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__WARN_ON_FAILURE                    = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__WAIT_BEFORE                        = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__WAIT_AFTER                         = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__DEFAULT_STATUS                     = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__STATUS_CONDITION                   = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__PROCEDURE                          = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__CAN_MULTIPLEX                      = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__MAX_SIMULTANEOUS_ITERATIONS        = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>Xml Validator Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP__XML_VALIDATOR_CONFIGURATION        = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Xml Validator Step</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XML_VALIDATOR_STEP_FEATURE_COUNT                       = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.impl.XSplitStepImpl <em>XSplit Step</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.impl.XSplitStepImpl
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getXSplitStep()
   * @generated
   */
  int           XSPLIT_STEP                                            = 55;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__IMPORTS                                   = ABSTRACT_STEP__IMPORTS;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__EXCEPTION                                 = ABSTRACT_STEP__EXCEPTION;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__RESOURCES                                 = ABSTRACT_STEP__RESOURCES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__ATTRIBUTES                                = ABSTRACT_STEP__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__ANNOTATIONS                               = ABSTRACT_STEP__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__REPETITION_HANDLER                        = ABSTRACT_STEP__REPETITION_HANDLER;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__MODIFIERS                                 = ABSTRACT_STEP__MODIFIERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__PARAMETERS                                = ABSTRACT_STEP__PARAMETERS;

  /**
   * The feature id for the '<em><b>Include Files</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__INCLUDE_FILES                             = ABSTRACT_STEP__INCLUDE_FILES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__NAME                                      = ABSTRACT_STEP__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__ID                                        = ABSTRACT_STEP__ID;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__ENABLED                                   = ABSTRACT_STEP__ENABLED;

  /**
   * The feature id for the '<em><b>Warn On Failure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__WARN_ON_FAILURE                           = ABSTRACT_STEP__WARN_ON_FAILURE;

  /**
   * The feature id for the '<em><b>Wait Before</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__WAIT_BEFORE                               = ABSTRACT_STEP__WAIT_BEFORE;

  /**
   * The feature id for the '<em><b>Wait After</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__WAIT_AFTER                                = ABSTRACT_STEP__WAIT_AFTER;

  /**
   * The feature id for the '<em><b>Default Status</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__DEFAULT_STATUS                            = ABSTRACT_STEP__DEFAULT_STATUS;

  /**
   * The feature id for the '<em><b>Status Condition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__STATUS_CONDITION                          = ABSTRACT_STEP__STATUS_CONDITION;

  /**
   * The feature id for the '<em><b>Procedure</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__PROCEDURE                                 = ABSTRACT_STEP__PROCEDURE;

  /**
   * The feature id for the '<em><b>Can Multiplex</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__CAN_MULTIPLEX                             = ABSTRACT_STEP__CAN_MULTIPLEX;

  /**
   * The feature id for the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__MAX_SIMULTANEOUS_ITERATIONS               = ABSTRACT_STEP__MAX_SIMULTANEOUS_ITERATIONS;

  /**
   * The feature id for the '<em><b>XSplit Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP__XSPLIT_CONFIGURATION                      = ABSTRACT_STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XSplit Step</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int           XSPLIT_STEP_FEATURE_COUNT                              = ABSTRACT_STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.IncludeFileType <em>Include File Type</em>}' enum. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.IncludeFileType
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getIncludeFileType()
   * @generated
   */
  int           INCLUDE_FILE_TYPE                                      = 56;

  /**
   * The meta object id for the '<em>Include File Type Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see com.ms.qaTools.saturn.IncludeFileType
   * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getIncludeFileTypeObject()
   * @generated
   */
  int           INCLUDE_FILE_TYPE_OBJECT                               = 57;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.AbstractLink <em>Abstract Link</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Abstract Link</em>'.
   * @see com.ms.qaTools.saturn.AbstractLink
   * @generated
   */
  EClass getAbstractLink();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.AbstractLink#getSource <em>Source</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see com.ms.qaTools.saturn.AbstractLink#getSource()
   * @see #getAbstractLink()
   * @generated
   */
  EReference getAbstractLink_Source();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.AbstractLink#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see com.ms.qaTools.saturn.AbstractLink#getTarget()
   * @see #getAbstractLink()
   * @generated
   */
  EReference getAbstractLink_Target();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.AbstractParameter <em>Abstract Parameter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Parameter</em>'.
   * @see com.ms.qaTools.saturn.AbstractParameter
   * @generated
   */
  EClass getAbstractParameter();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.AbstractParameter#isIsMandatory <em>Is Mandatory</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Mandatory</em>'.
   * @see com.ms.qaTools.saturn.AbstractParameter#isIsMandatory()
   * @see #getAbstractParameter()
   * @generated
   */
  EAttribute getAbstractParameter_IsMandatory();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.AbstractParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.AbstractParameter#getName()
   * @see #getAbstractParameter()
   * @generated
   */
  EAttribute getAbstractParameter_Name();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.AbstractResourceLink <em>Abstract Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Resource Link</em>'.
   * @see com.ms.qaTools.saturn.AbstractResourceLink
   * @generated
   */
  EClass getAbstractResourceLink();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.AbstractResourceLink#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see com.ms.qaTools.saturn.AbstractResourceLink#getSource()
   * @see #getAbstractResourceLink()
   * @generated
   */
  EReference getAbstractResourceLink_Source();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.AbstractResourceLink#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see com.ms.qaTools.saturn.AbstractResourceLink#getTarget()
   * @see #getAbstractResourceLink()
   * @generated
   */
  EReference getAbstractResourceLink_Target();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.AbstractRunGroup <em>Abstract Run Group</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Run Group</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup
   * @generated
   */
  EClass getAbstractRunGroup();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.AbstractRunGroup#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getImports()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EReference getAbstractRunGroup_Imports();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.AbstractRunGroup#getException <em>Exception</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getException()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EReference getAbstractRunGroup_Exception();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.AbstractRunGroup#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getResources()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EReference getAbstractRunGroup_Resources();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.AbstractRunGroup#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getAttributes()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EReference getAbstractRunGroup_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.AbstractRunGroup#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getAnnotations()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EReference getAbstractRunGroup_Annotations();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.AbstractRunGroup#getRepetitionHandler <em>Repetition Handler</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Repetition Handler</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getRepetitionHandler()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EReference getAbstractRunGroup_RepetitionHandler();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.AbstractRunGroup#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getModifiers()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EReference getAbstractRunGroup_Modifiers();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.AbstractRunGroup#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getParameters()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EReference getAbstractRunGroup_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.AbstractRunGroup#getIncludeFiles <em>Include Files</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Include Files</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getIncludeFiles()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EReference getAbstractRunGroup_IncludeFiles();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.AbstractRunGroup#isCanMultiplex <em>Can Multiplex</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Can Multiplex</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#isCanMultiplex()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EAttribute getAbstractRunGroup_CanMultiplex();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.AbstractRunGroup#getDefaultStatus <em>Default Status</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Status</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getDefaultStatus()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EAttribute getAbstractRunGroup_DefaultStatus();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.AbstractRunGroup#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#isEnabled()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EAttribute getAbstractRunGroup_Enabled();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.AbstractRunGroup#getId <em>Id</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getId()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EAttribute getAbstractRunGroup_Id();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.AbstractRunGroup#getMaxSimultaneousIterations <em>Max Simultaneous Iterations</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Simultaneous Iterations</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getMaxSimultaneousIterations()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EAttribute getAbstractRunGroup_MaxSimultaneousIterations();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.AbstractRunGroup#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getName()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EAttribute getAbstractRunGroup_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.AbstractRunGroup#isProcedure <em>Procedure</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Procedure</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#isProcedure()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EAttribute getAbstractRunGroup_Procedure();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.AbstractRunGroup#getStatusCondition <em>Status Condition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status Condition</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getStatusCondition()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EAttribute getAbstractRunGroup_StatusCondition();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.AbstractRunGroup#getWaitAfter <em>Wait After</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wait After</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getWaitAfter()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EAttribute getAbstractRunGroup_WaitAfter();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.AbstractRunGroup#getWaitBefore <em>Wait Before</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wait Before</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#getWaitBefore()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EAttribute getAbstractRunGroup_WaitBefore();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.AbstractRunGroup#isWarnOnFailure <em>Warn On Failure</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Warn On Failure</em>'.
   * @see com.ms.qaTools.saturn.AbstractRunGroup#isWarnOnFailure()
   * @see #getAbstractRunGroup()
   * @generated
   */
  EAttribute getAbstractRunGroup_WarnOnFailure();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.AbstractStep <em>Abstract Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Abstract Step</em>'.
   * @see com.ms.qaTools.saturn.AbstractStep
   * @generated
   */
  EClass getAbstractStep();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.AbstractTerminal <em>Abstract Terminal</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Abstract Terminal</em>'.
   * @see com.ms.qaTools.saturn.AbstractTerminal
   * @generated
   */
  EClass getAbstractTerminal();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.AbstractTerminal#getRepetitionAction <em>Repetition Action</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repetition Action</em>'.
   * @see com.ms.qaTools.saturn.AbstractTerminal#getRepetitionAction()
   * @see #getAbstractTerminal()
   * @generated
   */
  EAttribute getAbstractTerminal_RepetitionAction();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.AbstractTerminal#getTerminationStatus <em>Termination Status</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Termination Status</em>'.
   * @see com.ms.qaTools.saturn.AbstractTerminal#getTerminationStatus()
   * @see #getAbstractTerminal()
   * @generated
   */
  EAttribute getAbstractTerminal_TerminationStatus();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see com.ms.qaTools.saturn.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.Attribute#isExternal <em>External</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>External</em>'.
   * @see com.ms.qaTools.saturn.Attribute#isExternal()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_External();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.Attribute#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.AttributeParameter <em>Attribute Parameter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Parameter</em>'.
   * @see com.ms.qaTools.saturn.AttributeParameter
   * @generated
   */
  EClass getAttributeParameter();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.AttributeParameter#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see com.ms.qaTools.saturn.AttributeParameter#getDefaultValue()
   * @see #getAttributeParameter()
   * @generated
   */
  EReference getAttributeParameter_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.CometStep <em>Comet Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Comet Step</em>'.
   * @see com.ms.qaTools.saturn.CometStep
   * @generated
   */
  EClass getCometStep();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.CometStep#getCometConfiguration <em>Comet Configuration</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comet Configuration</em>'.
   * @see com.ms.qaTools.saturn.CometStep#getCometConfiguration()
   * @see #getCometStep()
   * @generated
   */
  EReference getCometStep_CometConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.Config <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config</em>'.
   * @see com.ms.qaTools.saturn.Config
   * @generated
   */
  EClass getConfig();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.Config#getRequiredPackages <em>Required Packages</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference list '<em>Required Packages</em>'.
   * @see com.ms.qaTools.saturn.Config#getRequiredPackages()
   * @see #getConfig()
   * @generated
   */
  EReference getConfig_RequiredPackages();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.Config#getLogicProvider <em>Logic Provider</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Logic Provider</em>'.
   * @see com.ms.qaTools.saturn.Config#getLogicProvider()
   * @see #getConfig()
   * @generated
   */
  EAttribute getConfig_LogicProvider();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.Config#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.Config#getName()
   * @see #getConfig()
   * @generated
   */
  EAttribute getConfig_Name();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.CpsStep <em>Cps Step</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Cps Step</em>'.
   * @see com.ms.qaTools.saturn.CpsStep
   * @generated
   */
  EClass getCpsStep();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.CpsStep#getCpsConfiguration <em>Cps Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cps Configuration</em>'.
   * @see com.ms.qaTools.saturn.CpsStep#getCpsConfiguration()
   * @see #getCpsStep()
   * @generated
   */
  EReference getCpsStep_CpsConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.CustomLink <em>Custom Link</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Custom Link</em>'.
   * @see com.ms.qaTools.saturn.CustomLink
   * @generated
   */
  EClass getCustomLink();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.CustomLink#getCode <em>Code</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Code</em>'.
   * @see com.ms.qaTools.saturn.CustomLink#getCode()
   * @see #getCustomLink()
   * @generated
   */
  EReference getCustomLink_Code();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.CustomLink#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.ms.qaTools.saturn.CustomLink#getDescription()
   * @see #getCustomLink()
   * @generated
   */
  EAttribute getCustomLink_Description();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.DataCompareStep <em>Data Compare Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Data Compare Step</em>'.
   * @see com.ms.qaTools.saturn.DataCompareStep
   * @generated
   */
  EClass getDataCompareStep();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.DataCompareStep#getDataCompareConfiguration <em>Data Compare Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Compare Configuration</em>'.
   * @see com.ms.qaTools.saturn.DataCompareStep#getDataCompareConfiguration()
   * @see #getDataCompareStep()
   * @generated
   */
  EReference getDataCompareStep_DataCompareConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.DataCompareSummaryStep <em>Data Compare Summary Step</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Compare Summary Step</em>'.
   * @see com.ms.qaTools.saturn.DataCompareSummaryStep
   * @generated
   */
  EClass getDataCompareSummaryStep();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.DocumentRoot <em>Document Root</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.DocumentRoot#getSaturn <em>Saturn</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Saturn</em>'.
   * @see com.ms.qaTools.saturn.DocumentRoot#getSaturn()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Saturn();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.DocumentumStep <em>Documentum Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Documentum Step</em>'.
   * @see com.ms.qaTools.saturn.DocumentumStep
   * @generated
   */
  EClass getDocumentumStep();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.DocumentumStep#getDocumentumConfiguration <em>Documentum Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Documentum Configuration</em>'.
   * @see com.ms.qaTools.saturn.DocumentumStep#getDocumentumConfiguration()
   * @see #getDocumentumStep()
   * @generated
   */
  EReference getDocumentumStep_DocumentumConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.DSConvertStep <em>DS Convert Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>DS Convert Step</em>'.
   * @see com.ms.qaTools.saturn.DSConvertStep
   * @generated
   */
  EClass getDSConvertStep();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.DSConvertStep#getDSConvertConfiguration <em>DS Convert Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>DS Convert Configuration</em>'.
   * @see com.ms.qaTools.saturn.DSConvertStep#getDSConvertConfiguration()
   * @see #getDSConvertStep()
   * @generated
   */
  EReference getDSConvertStep_DSConvertConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.DSValidatorStep <em>DS Validator Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>DS Validator Step</em>'.
   * @see com.ms.qaTools.saturn.DSValidatorStep
   * @generated
   */
  EClass getDSValidatorStep();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.DSValidatorStep#getDSValidatorConfiguration <em>DS Validator Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>DS Validator Configuration</em>'.
   * @see com.ms.qaTools.saturn.DSValidatorStep#getDSValidatorConfiguration()
   * @see #getDSValidatorStep()
   * @generated
   */
  EReference getDSValidatorStep_DSValidatorConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.EnvValidatorStep <em>Env Validator Step</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Env Validator Step</em>'.
   * @see com.ms.qaTools.saturn.EnvValidatorStep
   * @generated
   */
  EClass getEnvValidatorStep();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.EnvValidatorStep#getEnvValidatorConfiguration <em>Env Validator Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Env Validator Configuration</em>'.
   * @see com.ms.qaTools.saturn.EnvValidatorStep#getEnvValidatorConfiguration()
   * @see #getEnvValidatorStep()
   * @generated
   */
  EReference getEnvValidatorStep_EnvValidatorConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.ExtractDDLStep <em>Extract DDL Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Extract DDL Step</em>'.
   * @see com.ms.qaTools.saturn.ExtractDDLStep
   * @generated
   */
  EClass getExtractDDLStep();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.ExtractDDLStep#getExtractDDLConfiguration <em>Extract DDL Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Extract DDL Configuration</em>'.
   * @see com.ms.qaTools.saturn.ExtractDDLStep#getExtractDDLConfiguration()
   * @see #getExtractDDLStep()
   * @generated
   */
  EReference getExtractDDLStep_ExtractDDLConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.FailTerminal <em>Fail Terminal</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Fail Terminal</em>'.
   * @see com.ms.qaTools.saturn.FailTerminal
   * @generated
   */
  EClass getFailTerminal();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.FixManipStep <em>Fix Manip Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Fix Manip Step</em>'.
   * @see com.ms.qaTools.saturn.FixManipStep
   * @generated
   */
  EClass getFixManipStep();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.FixManipStep#getFixManipConfiguration <em>Fix Manip Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Fix Manip Configuration</em>'.
   * @see com.ms.qaTools.saturn.FixManipStep#getFixManipConfiguration()
   * @see #getFixManipStep()
   * @generated
   */
  EReference getFixManipStep_FixManipConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.IncludeFile <em>Include File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Include File</em>'.
   * @see com.ms.qaTools.saturn.IncludeFile
   * @generated
   */
  EClass getIncludeFile();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.IncludeFile#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see com.ms.qaTools.saturn.IncludeFile#getFormat()
   * @see #getIncludeFile()
   * @generated
   */
  EAttribute getIncludeFile_Format();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.IncludeFile#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.IncludeFile#getName()
   * @see #getIncludeFile()
   * @generated
   */
  EAttribute getIncludeFile_Name();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.JiraStep <em>Jira Step</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Jira Step</em>'.
   * @see com.ms.qaTools.saturn.JiraStep
   * @generated
   */
  EClass getJiraStep();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.KronusStep <em>Kronus Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kronus Step</em>'.
   * @see com.ms.qaTools.saturn.KronusStep
   * @generated
   */
  EClass getKronusStep();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.KronusStep#getKronusCallConfiguration <em>Kronus Call Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kronus Call Configuration</em>'.
   * @see com.ms.qaTools.saturn.KronusStep#getKronusCallConfiguration()
   * @see #getKronusStep()
   * @generated
   */
  EReference getKronusStep_KronusCallConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.MailStep <em>Mail Step</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Mail Step</em>'.
   * @see com.ms.qaTools.saturn.MailStep
   * @generated
   */
  EClass getMailStep();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.MailStep#getMailConfiguration <em>Mail Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mail Configuration</em>'.
   * @see com.ms.qaTools.saturn.MailStep#getMailConfiguration()
   * @see #getMailStep()
   * @generated
   */
  EReference getMailStep_MailConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.MQStep <em>MQ Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MQ Step</em>'.
   * @see com.ms.qaTools.saturn.MQStep
   * @generated
   */
  EClass getMQStep();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.MQStep#getMQConfiguration <em>MQ Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>MQ Configuration</em>'.
   * @see com.ms.qaTools.saturn.MQStep#getMQConfiguration()
   * @see #getMQStep()
   * @generated
   */
  EReference getMQStep_MQConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.NoopTerminal <em>Noop Terminal</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Noop Terminal</em>'.
   * @see com.ms.qaTools.saturn.NoopTerminal
   * @generated
   */
  EClass getNoopTerminal();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.OnFailLink <em>On Fail Link</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>On Fail Link</em>'.
   * @see com.ms.qaTools.saturn.OnFailLink
   * @generated
   */
  EClass getOnFailLink();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.OnFinishLink <em>On Finish Link</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>On Finish Link</em>'.
   * @see com.ms.qaTools.saturn.OnFinishLink
   * @generated
   */
  EClass getOnFinishLink();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.OnPassLink <em>On Pass Link</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>On Pass Link</em>'.
   * @see com.ms.qaTools.saturn.OnPassLink
   * @generated
   */
  EClass getOnPassLink();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.P4Step <em>P4 Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>P4 Step</em>'.
   * @see com.ms.qaTools.saturn.P4Step
   * @generated
   */
  EClass getP4Step();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.PassTerminal <em>Pass Terminal</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Pass Terminal</em>'.
   * @see com.ms.qaTools.saturn.PassTerminal
   * @generated
   */
  EClass getPassTerminal();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.PerlRunGroupModifier <em>Perl Run Group Modifier</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Perl Run Group Modifier</em>'.
   * @see com.ms.qaTools.saturn.PerlRunGroupModifier
   * @generated
   */
  EClass getPerlRunGroupModifier();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.PerlRunGroupModifier#getPerlCode <em>Perl Code</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Perl Code</em>'.
   * @see com.ms.qaTools.saturn.PerlRunGroupModifier#getPerlCode()
   * @see #getPerlRunGroupModifier()
   * @generated
   */
  EReference getPerlRunGroupModifier_PerlCode();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.ProcedureCallStep <em>Procedure Call Step</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Call Step</em>'.
   * @see com.ms.qaTools.saturn.ProcedureCallStep
   * @generated
   */
  EClass getProcedureCallStep();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.ProcedureCallStep#getProcedureCallConfiguration <em>Procedure Call Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Procedure Call Configuration</em>'.
   * @see com.ms.qaTools.saturn.ProcedureCallStep#getProcedureCallConfiguration()
   * @see #getProcedureCallStep()
   * @generated
   */
  EReference getProcedureCallStep_ProcedureCallConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.PsManagerStep <em>Ps Manager Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Ps Manager Step</em>'.
   * @see com.ms.qaTools.saturn.PsManagerStep
   * @generated
   */
  EClass getPsManagerStep();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.PsManagerStep#getPsManagerConfiguration <em>Ps Manager Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Ps Manager Configuration</em>'.
   * @see com.ms.qaTools.saturn.PsManagerStep#getPsManagerConfiguration()
   * @see #getPsManagerStep()
   * @generated
   */
  EReference getPsManagerStep_PsManagerConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see com.ms.qaTools.saturn.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.Reference#getIncludeFile <em>Include File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include File</em>'.
   * @see com.ms.qaTools.saturn.Reference#getIncludeFile()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_IncludeFile();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.Reference#getRunGroup <em>Run Group</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Run Group</em>'.
   * @see com.ms.qaTools.saturn.Reference#getRunGroup()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_RunGroup();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.Reference#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Template</em>'.
   * @see com.ms.qaTools.saturn.Reference#getTemplate()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_Template();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.ReferenceStep <em>Reference Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Reference Step</em>'.
   * @see com.ms.qaTools.saturn.ReferenceStep
   * @generated
   */
  EClass getReferenceStep();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.ReferenceStep#getReferenceConfiguration <em>Reference Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Reference Configuration</em>'.
   * @see com.ms.qaTools.saturn.ReferenceStep#getReferenceConfiguration()
   * @see #getReferenceStep()
   * @generated
   */
  EReference getReferenceStep_ReferenceConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.ResourceLink <em>Resource Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Link</em>'.
   * @see com.ms.qaTools.saturn.ResourceLink
   * @generated
   */
  EClass getResourceLink();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.ResourceNestedLink <em>Resource Nested Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Nested Link</em>'.
   * @see com.ms.qaTools.saturn.ResourceNestedLink
   * @generated
   */
  EClass getResourceNestedLink();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.ResourceNestedLink#getTargetEnclosingResource <em>Target Enclosing Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Enclosing Resource</em>'.
   * @see com.ms.qaTools.saturn.ResourceNestedLink#getTargetEnclosingResource()
   * @see #getResourceNestedLink()
   * @generated
   */
  EReference getResourceNestedLink_TargetEnclosingResource();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.ResourceParameter <em>Resource Parameter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Parameter</em>'.
   * @see com.ms.qaTools.saturn.ResourceParameter
   * @generated
   */
  EClass getResourceParameter();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.ResourceParameter#getDefaultResource <em>Default Resource</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Resource</em>'.
   * @see com.ms.qaTools.saturn.ResourceParameter#getDefaultResource()
   * @see #getResourceParameter()
   * @generated
   */
  EReference getResourceParameter_DefaultResource();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.ResourceStepLink <em>Resource Step Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Step Link</em>'.
   * @see com.ms.qaTools.saturn.ResourceStepLink
   * @generated
   */
  EClass getResourceStepLink();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.ResourceStepLink#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.ms.qaTools.saturn.ResourceStepLink#getDescription()
   * @see #getResourceStepLink()
   * @generated
   */
  EAttribute getResourceStepLink_Description();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.ResourceStepLink#getTargetStep <em>Target Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Step</em>'.
   * @see com.ms.qaTools.saturn.ResourceStepLink#getTargetStep()
   * @see #getResourceStepLink()
   * @generated
   */
  EReference getResourceStepLink_TargetStep();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.RunCmdsStep <em>Run Cmds Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Run Cmds Step</em>'.
   * @see com.ms.qaTools.saturn.RunCmdsStep
   * @generated
   */
  EClass getRunCmdsStep();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.RunCmdsStep#getRunCmdsConfiguration <em>Run Cmds Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Run Cmds Configuration</em>'.
   * @see com.ms.qaTools.saturn.RunCmdsStep#getRunCmdsConfiguration()
   * @see #getRunCmdsStep()
   * @generated
   */
  EReference getRunCmdsStep_RunCmdsConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.RunGroup <em>Run Group</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Run Group</em>'.
   * @see com.ms.qaTools.saturn.RunGroup
   * @generated
   */
  EClass getRunGroup();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.RunGroup#getRunGroups <em>Run Groups</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Run Groups</em>'.
   * @see com.ms.qaTools.saturn.RunGroup#getRunGroups()
   * @see #getRunGroup()
   * @generated
   */
  EReference getRunGroup_RunGroups();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.RunGroupImport <em>Run Group Import</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Run Group Import</em>'.
   * @see com.ms.qaTools.saturn.RunGroupImport
   * @generated
   */
  EClass getRunGroupImport();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.RunGroupImport#isAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attributes</em>'.
   * @see com.ms.qaTools.saturn.RunGroupImport#isAttributes()
   * @see #getRunGroupImport()
   * @generated
   */
  EAttribute getRunGroupImport_Attributes();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.RunGroupImport#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.RunGroupImport#isEnabled()
   * @see #getRunGroupImport()
   * @generated
   */
  EAttribute getRunGroupImport_Enabled();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.RunGroupImport#getIncludeFile <em>Include File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include File</em>'.
   * @see com.ms.qaTools.saturn.RunGroupImport#getIncludeFile()
   * @see #getRunGroupImport()
   * @generated
   */
  EAttribute getRunGroupImport_IncludeFile();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.RunGroupImport#isResources <em>Resources</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resources</em>'.
   * @see com.ms.qaTools.saturn.RunGroupImport#isResources()
   * @see #getRunGroupImport()
   * @generated
   */
  EAttribute getRunGroupImport_Resources();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.RunGroupImport#getRunGroup <em>Run Group</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Run Group</em>'.
   * @see com.ms.qaTools.saturn.RunGroupImport#getRunGroup()
   * @see #getRunGroupImport()
   * @generated
   */
  EAttribute getRunGroupImport_RunGroup();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.Saturn <em>Saturn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Saturn</em>'.
   * @see com.ms.qaTools.saturn.Saturn
   * @generated
   */
  EClass getSaturn();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.Saturn#getWorkDir <em>Work Dir</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Work Dir</em>'.
   * @see com.ms.qaTools.saturn.Saturn#getWorkDir()
   * @see #getSaturn()
   * @generated
   */
  EReference getSaturn_WorkDir();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.Saturn#getRunNumberFileName <em>Run Number File Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Run Number File Name</em>'.
   * @see com.ms.qaTools.saturn.Saturn#getRunNumberFileName()
   * @see #getSaturn()
   * @generated
   */
  EReference getSaturn_RunNumberFileName();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.Saturn#getDefaultRunNumber <em>Default Run Number</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Run Number</em>'.
   * @see com.ms.qaTools.saturn.Saturn#getDefaultRunNumber()
   * @see #getSaturn()
   * @generated
   */
  EReference getSaturn_DefaultRunNumber();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.Saturn#getPreExecutionListeners <em>Pre Execution Listeners</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Pre Execution Listeners</em>'.
   * @see com.ms.qaTools.saturn.Saturn#getPreExecutionListeners()
   * @see #getSaturn()
   * @generated
   */
  EReference getSaturn_PreExecutionListeners();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.Saturn#getListeners <em>Listeners</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Listeners</em>'.
   * @see com.ms.qaTools.saturn.Saturn#getListeners()
   * @see #getSaturn()
   * @generated
   */
  EReference getSaturn_Listeners();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.Saturn#getPostExecutionListeners <em>Post Execution Listeners</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Post Execution Listeners</em>'.
   * @see com.ms.qaTools.saturn.Saturn#getPostExecutionListeners()
   * @see #getSaturn()
   * @generated
   */
  EReference getSaturn_PostExecutionListeners();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.Saturn#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see com.ms.qaTools.saturn.Saturn#getLinks()
   * @see #getSaturn()
   * @generated
   */
  EReference getSaturn_Links();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.Saturn#getResourceLinks <em>Resource Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resource Links</em>'.
   * @see com.ms.qaTools.saturn.Saturn#getResourceLinks()
   * @see #getSaturn()
   * @generated
   */
  EReference getSaturn_ResourceLinks();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.Saturn#getVersion <em>Version</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see com.ms.qaTools.saturn.Saturn#getVersion()
   * @see #getSaturn()
   * @generated
   */
  EAttribute getSaturn_Version();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.SingularityStep <em>Singularity Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Singularity Step</em>'.
   * @see com.ms.qaTools.saturn.SingularityStep
   * @generated
   */
  EClass getSingularityStep();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.SingularityStep#getSingularityConfiguration <em>Singularity Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Singularity Configuration</em>'.
   * @see com.ms.qaTools.saturn.SingularityStep#getSingularityConfiguration()
   * @see #getSingularityStep()
   * @generated
   */
  EReference getSingularityStep_SingularityConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.SoapIOStep <em>Soap IO Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Soap IO Step</em>'.
   * @see com.ms.qaTools.saturn.SoapIOStep
   * @generated
   */
  EClass getSoapIOStep();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.SoapIOStep#getSoapIOConfiguration <em>Soap IO Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Soap IO Configuration</em>'.
   * @see com.ms.qaTools.saturn.SoapIOStep#getSoapIOConfiguration()
   * @see #getSoapIOStep()
   * @generated
   */
  EReference getSoapIOStep_SoapIOConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.SQLStep <em>SQL Step</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for class '<em>SQL Step</em>'.
   * @see com.ms.qaTools.saturn.SQLStep
   * @generated
   */
  EClass getSQLStep();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.SQLStep#getSQLConfiguration <em>SQL Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SQL Configuration</em>'.
   * @see com.ms.qaTools.saturn.SQLStep#getSQLConfiguration()
   * @see #getSQLStep()
   * @generated
   */
  EReference getSQLStep_SQLConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.VmsStep <em>Vms Step</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Vms Step</em>'.
   * @see com.ms.qaTools.saturn.VmsStep
   * @generated
   */
  EClass getVmsStep();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.Xml2CsvStep <em>Xml2 Csv Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Xml2 Csv Step</em>'.
   * @see com.ms.qaTools.saturn.Xml2CsvStep
   * @generated
   */
  EClass getXml2CsvStep();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.Xml2CsvStep#getXml2CsvConfiguration <em>Xml2 Csv Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Xml2 Csv Configuration</em>'.
   * @see com.ms.qaTools.saturn.Xml2CsvStep#getXml2CsvConfiguration()
   * @see #getXml2CsvStep()
   * @generated
   */
  EReference getXml2CsvStep_Xml2CsvConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.XmlDiffStep <em>Xml Diff Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Xml Diff Step</em>'.
   * @see com.ms.qaTools.saturn.XmlDiffStep
   * @generated
   */
  EClass getXmlDiffStep();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.XmlDiffStep#getXmlDiffConfiguration <em>Xml Diff Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Xml Diff Configuration</em>'.
   * @see com.ms.qaTools.saturn.XmlDiffStep#getXmlDiffConfiguration()
   * @see #getXmlDiffStep()
   * @generated
   */
  EReference getXmlDiffStep_XmlDiffConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.XmlGenStep <em>Xml Gen Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Xml Gen Step</em>'.
   * @see com.ms.qaTools.saturn.XmlGenStep
   * @generated
   */
  EClass getXmlGenStep();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.XmlGenStep#getXmlGenConfiguration <em>Xml Gen Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Xml Gen Configuration</em>'.
   * @see com.ms.qaTools.saturn.XmlGenStep#getXmlGenConfiguration()
   * @see #getXmlGenStep()
   * @generated
   */
  EReference getXmlGenStep_XmlGenConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.XmlManipStep <em>Xml Manip Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Xml Manip Step</em>'.
   * @see com.ms.qaTools.saturn.XmlManipStep
   * @generated
   */
  EClass getXmlManipStep();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.XmlManipStep#getXmlManipConfiguration <em>Xml Manip Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Xml Manip Configuration</em>'.
   * @see com.ms.qaTools.saturn.XmlManipStep#getXmlManipConfiguration()
   * @see #getXmlManipStep()
   * @generated
   */
  EReference getXmlManipStep_XmlManipConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.XmlValidatorStep <em>Xml Validator Step</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Xml Validator Step</em>'.
   * @see com.ms.qaTools.saturn.XmlValidatorStep
   * @generated
   */
  EClass getXmlValidatorStep();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.XmlValidatorStep#getXmlValidatorConfiguration <em>Xml Validator Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xml Validator Configuration</em>'.
   * @see com.ms.qaTools.saturn.XmlValidatorStep#getXmlValidatorConfiguration()
   * @see #getXmlValidatorStep()
   * @generated
   */
  EReference getXmlValidatorStep_XmlValidatorConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.XSplitStep <em>XSplit Step</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>XSplit Step</em>'.
   * @see com.ms.qaTools.saturn.XSplitStep
   * @generated
   */
  EClass getXSplitStep();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.XSplitStep#getXSplitConfiguration <em>XSplit Configuration</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>XSplit Configuration</em>'.
   * @see com.ms.qaTools.saturn.XSplitStep#getXSplitConfiguration()
   * @see #getXSplitStep()
   * @generated
   */
  EReference getXSplitStep_XSplitConfiguration();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.IncludeFileType <em>Include File Type</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for enum '<em>Include File Type</em>'.
   * @see com.ms.qaTools.saturn.IncludeFileType
   * @generated
   */
  EEnum getIncludeFileType();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.IncludeFileType <em>Include File Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Include File Type Object</em>'.
   * @see com.ms.qaTools.saturn.IncludeFileType
   * @model instanceClass="com.ms.qaTools.saturn.IncludeFileType"
   *        extendedMetaData="name='IncludeFileType:Object' baseType='IncludeFileType'"
   * @generated
   */
  EDataType getIncludeFileTypeObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SaturnFactory getSaturnFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.AbstractLinkImpl <em>Abstract Link</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.AbstractLinkImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAbstractLink()
     * @generated
     */
    EClass     ABSTRACT_LINK                                     = eINSTANCE.getAbstractLink();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_LINK__SOURCE                             = eINSTANCE.getAbstractLink_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_LINK__TARGET                             = eINSTANCE.getAbstractLink_Target();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.AbstractParameterImpl <em>Abstract Parameter</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.AbstractParameterImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAbstractParameter()
     * @generated
     */
    EClass     ABSTRACT_PARAMETER                                = eINSTANCE.getAbstractParameter();

    /**
     * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_PARAMETER__IS_MANDATORY                  = eINSTANCE.getAbstractParameter_IsMandatory();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_PARAMETER__NAME                          = eINSTANCE.getAbstractParameter_Name();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.AbstractResourceLinkImpl <em>Abstract Resource Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.AbstractResourceLinkImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAbstractResourceLink()
     * @generated
     */
    EClass ABSTRACT_RESOURCE_LINK = eINSTANCE.getAbstractResourceLink();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_RESOURCE_LINK__SOURCE = eINSTANCE.getAbstractResourceLink_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_RESOURCE_LINK__TARGET = eINSTANCE.getAbstractResourceLink_Target();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl <em>Abstract Run Group</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.AbstractRunGroupImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAbstractRunGroup()
     * @generated
     */
    EClass     ABSTRACT_RUN_GROUP                                = eINSTANCE.getAbstractRunGroup();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_RUN_GROUP__IMPORTS                       = eINSTANCE.getAbstractRunGroup_Imports();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_RUN_GROUP__EXCEPTION                     = eINSTANCE.getAbstractRunGroup_Exception();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ABSTRACT_RUN_GROUP__RESOURCES                     = eINSTANCE.getAbstractRunGroup_Resources();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ABSTRACT_RUN_GROUP__ATTRIBUTES                    = eINSTANCE.getAbstractRunGroup_Attributes();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ABSTRACT_RUN_GROUP__ANNOTATIONS                   = eINSTANCE.getAbstractRunGroup_Annotations();

    /**
     * The meta object literal for the '<em><b>Repetition Handler</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ABSTRACT_RUN_GROUP__REPETITION_HANDLER            = eINSTANCE.getAbstractRunGroup_RepetitionHandler();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ABSTRACT_RUN_GROUP__MODIFIERS                     = eINSTANCE.getAbstractRunGroup_Modifiers();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ABSTRACT_RUN_GROUP__PARAMETERS                    = eINSTANCE.getAbstractRunGroup_Parameters();

    /**
     * The meta object literal for the '<em><b>Include Files</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ABSTRACT_RUN_GROUP__INCLUDE_FILES                 = eINSTANCE.getAbstractRunGroup_IncludeFiles();

    /**
     * The meta object literal for the '<em><b>Can Multiplex</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_RUN_GROUP__CAN_MULTIPLEX                 = eINSTANCE.getAbstractRunGroup_CanMultiplex();

    /**
     * The meta object literal for the '<em><b>Default Status</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_RUN_GROUP__DEFAULT_STATUS                = eINSTANCE.getAbstractRunGroup_DefaultStatus();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_RUN_GROUP__ENABLED                       = eINSTANCE.getAbstractRunGroup_Enabled();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    EAttribute ABSTRACT_RUN_GROUP__ID                            = eINSTANCE.getAbstractRunGroup_Id();

    /**
     * The meta object literal for the '<em><b>Max Simultaneous Iterations</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EAttribute ABSTRACT_RUN_GROUP__MAX_SIMULTANEOUS_ITERATIONS   = eINSTANCE.getAbstractRunGroup_MaxSimultaneousIterations();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_RUN_GROUP__NAME                          = eINSTANCE.getAbstractRunGroup_Name();

    /**
     * The meta object literal for the '<em><b>Procedure</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_RUN_GROUP__PROCEDURE                     = eINSTANCE.getAbstractRunGroup_Procedure();

    /**
     * The meta object literal for the '<em><b>Status Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_RUN_GROUP__STATUS_CONDITION              = eINSTANCE.getAbstractRunGroup_StatusCondition();

    /**
     * The meta object literal for the '<em><b>Wait After</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_RUN_GROUP__WAIT_AFTER                    = eINSTANCE.getAbstractRunGroup_WaitAfter();

    /**
     * The meta object literal for the '<em><b>Wait Before</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_RUN_GROUP__WAIT_BEFORE                   = eINSTANCE.getAbstractRunGroup_WaitBefore();

    /**
     * The meta object literal for the '<em><b>Warn On Failure</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_RUN_GROUP__WARN_ON_FAILURE               = eINSTANCE.getAbstractRunGroup_WarnOnFailure();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.AbstractStepImpl <em>Abstract Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.AbstractStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAbstractStep()
     * @generated
     */
    EClass     ABSTRACT_STEP                                     = eINSTANCE.getAbstractStep();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.AbstractTerminalImpl <em>Abstract Terminal</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.AbstractTerminalImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAbstractTerminal()
     * @generated
     */
    EClass     ABSTRACT_TERMINAL                                 = eINSTANCE.getAbstractTerminal();

    /**
     * The meta object literal for the '<em><b>Repetition Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_TERMINAL__REPETITION_ACTION              = eINSTANCE.getAbstractTerminal_RepetitionAction();

    /**
     * The meta object literal for the '<em><b>Termination Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_TERMINAL__TERMINATION_STATUS             = eINSTANCE.getAbstractTerminal_TerminationStatus();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.AttributeImpl <em>Attribute</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.impl.AttributeImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAttribute()
     * @generated
     */
    EClass     ATTRIBUTE                                         = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>External</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__EXTERNAL                               = eINSTANCE.getAttribute_External();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME                                   = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.AttributeParameterImpl <em>Attribute Parameter</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.AttributeParameterImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getAttributeParameter()
     * @generated
     */
    EClass     ATTRIBUTE_PARAMETER                               = eINSTANCE.getAttributeParameter();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ATTRIBUTE_PARAMETER__DEFAULT_VALUE                = eINSTANCE.getAttributeParameter_DefaultValue();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.CometStepImpl <em>Comet Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.CometStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getCometStep()
     * @generated
     */
    EClass     COMET_STEP                                        = eINSTANCE.getCometStep();

    /**
     * The meta object literal for the '<em><b>Comet Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference COMET_STEP__COMET_CONFIGURATION                   = eINSTANCE.getCometStep_CometConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.ConfigImpl <em>Config</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.impl.ConfigImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getConfig()
     * @generated
     */
    EClass     CONFIG                                            = eINSTANCE.getConfig();

    /**
     * The meta object literal for the '<em><b>Required Packages</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference CONFIG__REQUIRED_PACKAGES                         = eINSTANCE.getConfig_RequiredPackages();

    /**
     * The meta object literal for the '<em><b>Logic Provider</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute CONFIG__LOGIC_PROVIDER                            = eINSTANCE.getConfig_LogicProvider();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute CONFIG__NAME                                      = eINSTANCE.getConfig_Name();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.CpsStepImpl <em>Cps Step</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.impl.CpsStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getCpsStep()
     * @generated
     */
    EClass     CPS_STEP                                          = eINSTANCE.getCpsStep();

    /**
     * The meta object literal for the '<em><b>Cps Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference CPS_STEP__CPS_CONFIGURATION                       = eINSTANCE.getCpsStep_CpsConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.CustomLinkImpl <em>Custom Link</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.CustomLinkImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getCustomLink()
     * @generated
     */
    EClass     CUSTOM_LINK                                       = eINSTANCE.getCustomLink();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_LINK__CODE                                 = eINSTANCE.getCustomLink_Code();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_LINK__DESCRIPTION                          = eINSTANCE.getCustomLink_Description();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.DataCompareStepImpl <em>Data Compare Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.DataCompareStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getDataCompareStep()
     * @generated
     */
    EClass     DATA_COMPARE_STEP                                 = eINSTANCE.getDataCompareStep();

    /**
     * The meta object literal for the '<em><b>Data Compare Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DATA_COMPARE_STEP__DATA_COMPARE_CONFIGURATION     = eINSTANCE.getDataCompareStep_DataCompareConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.DataCompareSummaryStepImpl <em>Data Compare Summary Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.DataCompareSummaryStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getDataCompareSummaryStep()
     * @generated
     */
    EClass     DATA_COMPARE_SUMMARY_STEP                         = eINSTANCE.getDataCompareSummaryStep();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>Saturn</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SATURN                             = eINSTANCE.getDocumentRoot_Saturn();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.DocumentumStepImpl <em>Documentum Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.DocumentumStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getDocumentumStep()
     * @generated
     */
    EClass     DOCUMENTUM_STEP                                   = eINSTANCE.getDocumentumStep();

    /**
     * The meta object literal for the '<em><b>Documentum Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENTUM_STEP__DOCUMENTUM_CONFIGURATION         = eINSTANCE.getDocumentumStep_DocumentumConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.DSConvertStepImpl <em>DS Convert Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.DSConvertStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getDSConvertStep()
     * @generated
     */
    EClass     DS_CONVERT_STEP                                   = eINSTANCE.getDSConvertStep();

    /**
     * The meta object literal for the '<em><b>DS Convert Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DS_CONVERT_STEP__DS_CONVERT_CONFIGURATION         = eINSTANCE.getDSConvertStep_DSConvertConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.DSValidatorStepImpl <em>DS Validator Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.DSValidatorStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getDSValidatorStep()
     * @generated
     */
    EClass     DS_VALIDATOR_STEP                                 = eINSTANCE.getDSValidatorStep();

    /**
     * The meta object literal for the '<em><b>DS Validator Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DS_VALIDATOR_STEP__DS_VALIDATOR_CONFIGURATION     = eINSTANCE.getDSValidatorStep_DSValidatorConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.EnvValidatorStepImpl <em>Env Validator Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.EnvValidatorStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getEnvValidatorStep()
     * @generated
     */
    EClass     ENV_VALIDATOR_STEP                                = eINSTANCE.getEnvValidatorStep();

    /**
     * The meta object literal for the '<em><b>Env Validator Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ENV_VALIDATOR_STEP__ENV_VALIDATOR_CONFIGURATION   = eINSTANCE.getEnvValidatorStep_EnvValidatorConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.ExtractDDLStepImpl <em>Extract DDL Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.ExtractDDLStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getExtractDDLStep()
     * @generated
     */
    EClass     EXTRACT_DDL_STEP                                  = eINSTANCE.getExtractDDLStep();

    /**
     * The meta object literal for the '<em><b>Extract DDL Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference EXTRACT_DDL_STEP__EXTRACT_DDL_CONFIGURATION       = eINSTANCE.getExtractDDLStep_ExtractDDLConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.FailTerminalImpl <em>Fail Terminal</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.FailTerminalImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getFailTerminal()
     * @generated
     */
    EClass     FAIL_TERMINAL                                     = eINSTANCE.getFailTerminal();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.FixManipStepImpl <em>Fix Manip Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.FixManipStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getFixManipStep()
     * @generated
     */
    EClass     FIX_MANIP_STEP                                    = eINSTANCE.getFixManipStep();

    /**
     * The meta object literal for the '<em><b>Fix Manip Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference FIX_MANIP_STEP__FIX_MANIP_CONFIGURATION           = eINSTANCE.getFixManipStep_FixManipConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.IncludeFileImpl <em>Include File</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.IncludeFileImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getIncludeFile()
     * @generated
     */
    EClass     INCLUDE_FILE                                      = eINSTANCE.getIncludeFile();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE_FILE__FORMAT                              = eINSTANCE.getIncludeFile_Format();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE_FILE__NAME                                = eINSTANCE.getIncludeFile_Name();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.JiraStepImpl <em>Jira Step</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.impl.JiraStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getJiraStep()
     * @generated
     */
    EClass     JIRA_STEP                                         = eINSTANCE.getJiraStep();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.KronusStepImpl <em>Kronus Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.KronusStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getKronusStep()
     * @generated
     */
    EClass KRONUS_STEP = eINSTANCE.getKronusStep();

    /**
     * The meta object literal for the '<em><b>Kronus Call Configuration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KRONUS_STEP__KRONUS_CALL_CONFIGURATION = eINSTANCE.getKronusStep_KronusCallConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.MailStepImpl <em>Mail Step</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.impl.MailStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getMailStep()
     * @generated
     */
    EClass     MAIL_STEP                                         = eINSTANCE.getMailStep();

    /**
     * The meta object literal for the '<em><b>Mail Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference MAIL_STEP__MAIL_CONFIGURATION                     = eINSTANCE.getMailStep_MailConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.MQStepImpl <em>MQ Step</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.impl.MQStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getMQStep()
     * @generated
     */
    EClass     MQ_STEP                                           = eINSTANCE.getMQStep();

    /**
     * The meta object literal for the '<em><b>MQ Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference MQ_STEP__MQ_CONFIGURATION                         = eINSTANCE.getMQStep_MQConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.NoopTerminalImpl <em>Noop Terminal</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.NoopTerminalImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getNoopTerminal()
     * @generated
     */
    EClass     NOOP_TERMINAL                                     = eINSTANCE.getNoopTerminal();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.OnFailLinkImpl <em>On Fail Link</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.OnFailLinkImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getOnFailLink()
     * @generated
     */
    EClass     ON_FAIL_LINK                                      = eINSTANCE.getOnFailLink();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.OnFinishLinkImpl <em>On Finish Link</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.OnFinishLinkImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getOnFinishLink()
     * @generated
     */
    EClass     ON_FINISH_LINK                                    = eINSTANCE.getOnFinishLink();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.OnPassLinkImpl <em>On Pass Link</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.OnPassLinkImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getOnPassLink()
     * @generated
     */
    EClass     ON_PASS_LINK                                      = eINSTANCE.getOnPassLink();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.P4StepImpl <em>P4 Step</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.impl.P4StepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getP4Step()
     * @generated
     */
    EClass     P4_STEP                                           = eINSTANCE.getP4Step();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.PassTerminalImpl <em>Pass Terminal</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.PassTerminalImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getPassTerminal()
     * @generated
     */
    EClass     PASS_TERMINAL                                     = eINSTANCE.getPassTerminal();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.PerlRunGroupModifierImpl <em>Perl Run Group Modifier</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.PerlRunGroupModifierImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getPerlRunGroupModifier()
     * @generated
     */
    EClass     PERL_RUN_GROUP_MODIFIER                           = eINSTANCE.getPerlRunGroupModifier();

    /**
     * The meta object literal for the '<em><b>Perl Code</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference PERL_RUN_GROUP_MODIFIER__PERL_CODE                = eINSTANCE.getPerlRunGroupModifier_PerlCode();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.ProcedureCallStepImpl <em>Procedure Call Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.ProcedureCallStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getProcedureCallStep()
     * @generated
     */
    EClass     PROCEDURE_CALL_STEP                               = eINSTANCE.getProcedureCallStep();

    /**
     * The meta object literal for the '<em><b>Procedure Call Configuration</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_CALL_STEP__PROCEDURE_CALL_CONFIGURATION = eINSTANCE.getProcedureCallStep_ProcedureCallConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.PsManagerStepImpl <em>Ps Manager Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.PsManagerStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getPsManagerStep()
     * @generated
     */
    EClass     PS_MANAGER_STEP                                   = eINSTANCE.getPsManagerStep();

    /**
     * The meta object literal for the '<em><b>Ps Manager Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference PS_MANAGER_STEP__PS_MANAGER_CONFIGURATION         = eINSTANCE.getPsManagerStep_PsManagerConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.ReferenceImpl <em>Reference</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.impl.ReferenceImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getReference()
     * @generated
     */
    EClass     REFERENCE                                         = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Include File</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__INCLUDE_FILE                           = eINSTANCE.getReference_IncludeFile();

    /**
     * The meta object literal for the '<em><b>Run Group</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__RUN_GROUP                              = eINSTANCE.getReference_RunGroup();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__TEMPLATE                               = eINSTANCE.getReference_Template();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.ReferenceStepImpl <em>Reference Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.ReferenceStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getReferenceStep()
     * @generated
     */
    EClass     REFERENCE_STEP                                    = eINSTANCE.getReferenceStep();

    /**
     * The meta object literal for the '<em><b>Reference Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference REFERENCE_STEP__REFERENCE_CONFIGURATION           = eINSTANCE.getReferenceStep_ReferenceConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.ResourceLinkImpl <em>Resource Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.ResourceLinkImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getResourceLink()
     * @generated
     */
    EClass RESOURCE_LINK = eINSTANCE.getResourceLink();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.ResourceNestedLinkImpl <em>Resource Nested Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.ResourceNestedLinkImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getResourceNestedLink()
     * @generated
     */
    EClass RESOURCE_NESTED_LINK = eINSTANCE.getResourceNestedLink();

    /**
     * The meta object literal for the '<em><b>Target Enclosing Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_NESTED_LINK__TARGET_ENCLOSING_RESOURCE = eINSTANCE.getResourceNestedLink_TargetEnclosingResource();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.ResourceParameterImpl <em>Resource Parameter</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.ResourceParameterImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getResourceParameter()
     * @generated
     */
    EClass     RESOURCE_PARAMETER                                = eINSTANCE.getResourceParameter();

    /**
     * The meta object literal for the '<em><b>Default Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RESOURCE_PARAMETER__DEFAULT_RESOURCE              = eINSTANCE.getResourceParameter_DefaultResource();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.ResourceStepLinkImpl <em>Resource Step Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.ResourceStepLinkImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getResourceStepLink()
     * @generated
     */
    EClass RESOURCE_STEP_LINK = eINSTANCE.getResourceStepLink();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_STEP_LINK__DESCRIPTION = eINSTANCE.getResourceStepLink_Description();

    /**
     * The meta object literal for the '<em><b>Target Step</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_STEP_LINK__TARGET_STEP = eINSTANCE.getResourceStepLink_TargetStep();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.RunCmdsStepImpl <em>Run Cmds Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.RunCmdsStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getRunCmdsStep()
     * @generated
     */
    EClass     RUN_CMDS_STEP                                     = eINSTANCE.getRunCmdsStep();

    /**
     * The meta object literal for the '<em><b>Run Cmds Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RUN_CMDS_STEP__RUN_CMDS_CONFIGURATION             = eINSTANCE.getRunCmdsStep_RunCmdsConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.RunGroupImpl <em>Run Group</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.impl.RunGroupImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getRunGroup()
     * @generated
     */
    EClass     RUN_GROUP                                         = eINSTANCE.getRunGroup();

    /**
     * The meta object literal for the '<em><b>Run Groups</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RUN_GROUP__RUN_GROUPS                             = eINSTANCE.getRunGroup_RunGroups();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.RunGroupImportImpl <em>Run Group Import</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.RunGroupImportImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getRunGroupImport()
     * @generated
     */
    EClass     RUN_GROUP_IMPORT                                  = eINSTANCE.getRunGroupImport();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RUN_GROUP_IMPORT__ATTRIBUTES                      = eINSTANCE.getRunGroupImport_Attributes();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RUN_GROUP_IMPORT__ENABLED                         = eINSTANCE.getRunGroupImport_Enabled();

    /**
     * The meta object literal for the '<em><b>Include File</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RUN_GROUP_IMPORT__INCLUDE_FILE                    = eINSTANCE.getRunGroupImport_IncludeFile();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RUN_GROUP_IMPORT__RESOURCES                       = eINSTANCE.getRunGroupImport_Resources();

    /**
     * The meta object literal for the '<em><b>Run Group</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RUN_GROUP_IMPORT__RUN_GROUP                       = eINSTANCE.getRunGroupImport_RunGroup();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.SaturnImpl <em>Saturn</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.impl.SaturnImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getSaturn()
     * @generated
     */
    EClass     SATURN                                            = eINSTANCE.getSaturn();

    /**
     * The meta object literal for the '<em><b>Work Dir</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SATURN__WORK_DIR                                  = eINSTANCE.getSaturn_WorkDir();

    /**
     * The meta object literal for the '<em><b>Run Number File Name</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SATURN__RUN_NUMBER_FILE_NAME                      = eINSTANCE.getSaturn_RunNumberFileName();

    /**
     * The meta object literal for the '<em><b>Default Run Number</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SATURN__DEFAULT_RUN_NUMBER                        = eINSTANCE.getSaturn_DefaultRunNumber();

    /**
     * The meta object literal for the '<em><b>Pre Execution Listeners</b></em>' containment reference list feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    EReference SATURN__PRE_EXECUTION_LISTENERS                   = eINSTANCE.getSaturn_PreExecutionListeners();

    /**
     * The meta object literal for the '<em><b>Listeners</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SATURN__LISTENERS                                 = eINSTANCE.getSaturn_Listeners();

    /**
     * The meta object literal for the '<em><b>Post Execution Listeners</b></em>' containment reference list feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    EReference SATURN__POST_EXECUTION_LISTENERS                  = eINSTANCE.getSaturn_PostExecutionListeners();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SATURN__LINKS                                     = eINSTANCE.getSaturn_Links();

    /**
     * The meta object literal for the '<em><b>Resource Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SATURN__RESOURCE_LINKS = eINSTANCE.getSaturn_ResourceLinks();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SATURN__VERSION                                   = eINSTANCE.getSaturn_Version();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.SingularityStepImpl <em>Singularity Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.SingularityStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getSingularityStep()
     * @generated
     */
    EClass     SINGULARITY_STEP                                  = eINSTANCE.getSingularityStep();

    /**
     * The meta object literal for the '<em><b>Singularity Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SINGULARITY_STEP__SINGULARITY_CONFIGURATION       = eINSTANCE.getSingularityStep_SingularityConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.SoapIOStepImpl <em>Soap IO Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.SoapIOStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getSoapIOStep()
     * @generated
     */
    EClass     SOAP_IO_STEP                                      = eINSTANCE.getSoapIOStep();

    /**
     * The meta object literal for the '<em><b>Soap IO Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SOAP_IO_STEP__SOAP_IO_CONFIGURATION               = eINSTANCE.getSoapIOStep_SoapIOConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.SQLStepImpl <em>SQL Step</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.impl.SQLStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getSQLStep()
     * @generated
     */
    EClass     SQL_STEP                                          = eINSTANCE.getSQLStep();

    /**
     * The meta object literal for the '<em><b>SQL Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SQL_STEP__SQL_CONFIGURATION                       = eINSTANCE.getSQLStep_SQLConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.VmsStepImpl <em>Vms Step</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.impl.VmsStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getVmsStep()
     * @generated
     */
    EClass     VMS_STEP                                          = eINSTANCE.getVmsStep();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.Xml2CsvStepImpl <em>Xml2 Csv Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.Xml2CsvStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getXml2CsvStep()
     * @generated
     */
    EClass     XML2_CSV_STEP                                     = eINSTANCE.getXml2CsvStep();

    /**
     * The meta object literal for the '<em><b>Xml2 Csv Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML2_CSV_STEP__XML2_CSV_CONFIGURATION             = eINSTANCE.getXml2CsvStep_Xml2CsvConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.XmlDiffStepImpl <em>Xml Diff Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.XmlDiffStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getXmlDiffStep()
     * @generated
     */
    EClass     XML_DIFF_STEP                                     = eINSTANCE.getXmlDiffStep();

    /**
     * The meta object literal for the '<em><b>Xml Diff Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML_DIFF_STEP__XML_DIFF_CONFIGURATION             = eINSTANCE.getXmlDiffStep_XmlDiffConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.XmlGenStepImpl <em>Xml Gen Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.XmlGenStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getXmlGenStep()
     * @generated
     */
    EClass     XML_GEN_STEP                                      = eINSTANCE.getXmlGenStep();

    /**
     * The meta object literal for the '<em><b>Xml Gen Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML_GEN_STEP__XML_GEN_CONFIGURATION               = eINSTANCE.getXmlGenStep_XmlGenConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.XmlManipStepImpl <em>Xml Manip Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.XmlManipStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getXmlManipStep()
     * @generated
     */
    EClass     XML_MANIP_STEP                                    = eINSTANCE.getXmlManipStep();

    /**
     * The meta object literal for the '<em><b>Xml Manip Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML_MANIP_STEP__XML_MANIP_CONFIGURATION           = eINSTANCE.getXmlManipStep_XmlManipConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.XmlValidatorStepImpl <em>Xml Validator Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.XmlValidatorStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getXmlValidatorStep()
     * @generated
     */
    EClass     XML_VALIDATOR_STEP                                = eINSTANCE.getXmlValidatorStep();

    /**
     * The meta object literal for the '<em><b>Xml Validator Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XML_VALIDATOR_STEP__XML_VALIDATOR_CONFIGURATION   = eINSTANCE.getXmlValidatorStep_XmlValidatorConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.impl.XSplitStepImpl <em>XSplit Step</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.impl.XSplitStepImpl
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getXSplitStep()
     * @generated
     */
    EClass     XSPLIT_STEP                                       = eINSTANCE.getXSplitStep();

    /**
     * The meta object literal for the '<em><b>XSplit Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference XSPLIT_STEP__XSPLIT_CONFIGURATION                 = eINSTANCE.getXSplitStep_XSplitConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.IncludeFileType <em>Include File Type</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.IncludeFileType
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getIncludeFileType()
     * @generated
     */
    EEnum      INCLUDE_FILE_TYPE                                 = eINSTANCE.getIncludeFileType();

    /**
     * The meta object literal for the '<em>Include File Type Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.IncludeFileType
     * @see com.ms.qaTools.saturn.impl.SaturnPackageImpl#getIncludeFileTypeObject()
     * @generated
     */
    EDataType  INCLUDE_FILE_TYPE_OBJECT                          = eINSTANCE.getIncludeFileTypeObject();

  }

} // SaturnPackage
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
