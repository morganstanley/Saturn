/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 *
 * $Id$
 */
package com.ms.qaTools.saturn.modules.cpsModule;

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
 * @see com.ms.qaTools.saturn.modules.cpsModule.CpsModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface CpsModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String           eNAME                                        = "cpsModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String           eNS_URI                                      = "http://www.ms.com/2009/Saturn/Modules/Cps";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String           eNS_PREFIX                                   = "cpsModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  CpsModulePackage eINSTANCE                                    = com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.AbstractCpsOperationImpl <em>Abstract Cps Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.AbstractCpsOperationImpl
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getAbstractCpsOperation()
   * @generated
   */
  int              ABSTRACT_CPS_OPERATION                       = 0;

  /**
   * The feature id for the '<em><b>Time Out</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              ABSTRACT_CPS_OPERATION__TIME_OUT             = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              ABSTRACT_CPS_OPERATION__ENABLED              = 1;

  /**
   * The number of structural features of the '<em>Abstract Cps Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              ABSTRACT_CPS_OPERATION_FEATURE_COUNT         = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.AbstractTerminationConditionImpl <em>Abstract Termination Condition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.AbstractTerminationConditionImpl
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getAbstractTerminationCondition()
   * @generated
   */
  int              ABSTRACT_TERMINATION_CONDITION               = 1;

  /**
   * The number of structural features of the '<em>Abstract Termination Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              ABSTRACT_TERMINATION_CONDITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsConfigurationImpl <em>Cps Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getCpsConfiguration()
   * @generated
   */
  int              CPS_CONFIGURATION                            = 2;

  /**
   * The feature id for the '<em><b>Cps Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_CONFIGURATION__CPS_RESOURCE              = 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_CONFIGURATION__OPERATIONS                = 1;

  /**
   * The number of structural features of the '<em>Cps Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_CONFIGURATION_FEATURE_COUNT              = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsGetOperationImpl <em>Cps Get Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsGetOperationImpl
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getCpsGetOperation()
   * @generated
   */
  int              CPS_GET_OPERATION                            = 3;

  /**
   * The feature id for the '<em><b>Time Out</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              CPS_GET_OPERATION__TIME_OUT                  = ABSTRACT_CPS_OPERATION__TIME_OUT;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_GET_OPERATION__ENABLED                   = ABSTRACT_CPS_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              CPS_GET_OPERATION__OUTPUT                    = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Termination Condition</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_GET_OPERATION__TERMINATION_CONDITION     = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cps Get Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_GET_OPERATION_FEATURE_COUNT              = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsPutOperationImpl <em>Cps Put Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsPutOperationImpl
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getCpsPutOperation()
   * @generated
   */
  int              CPS_PUT_OPERATION                            = 4;

  /**
   * The feature id for the '<em><b>Time Out</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              CPS_PUT_OPERATION__TIME_OUT                  = ABSTRACT_CPS_OPERATION__TIME_OUT;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_PUT_OPERATION__ENABLED                   = ABSTRACT_CPS_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_PUT_OPERATION__INPUT                     = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Topic</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_PUT_OPERATION__TOPIC                     = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_PUT_OPERATION__PERSISTENT                = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is Xml</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_PUT_OPERATION__IS_XML                    = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Cps Put Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_PUT_OPERATION_FEATURE_COUNT              = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsSowDeleteOperationImpl <em>Cps Sow Delete Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsSowDeleteOperationImpl
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getCpsSowDeleteOperation()
   * @generated
   */
  int              CPS_SOW_DELETE_OPERATION                     = 5;

  /**
   * The feature id for the '<em><b>Time Out</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              CPS_SOW_DELETE_OPERATION__TIME_OUT           = ABSTRACT_CPS_OPERATION__TIME_OUT;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_SOW_DELETE_OPERATION__ENABLED            = ABSTRACT_CPS_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Topic</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_SOW_DELETE_OPERATION__TOPIC              = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              CPS_SOW_DELETE_OPERATION__FILTER             = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cps Sow Delete Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_SOW_DELETE_OPERATION_FEATURE_COUNT       = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsSubscribeOperationImpl <em>Cps Subscribe Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsSubscribeOperationImpl
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getCpsSubscribeOperation()
   * @generated
   */
  int              CPS_SUBSCRIBE_OPERATION                      = 6;

  /**
   * The feature id for the '<em><b>Time Out</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              CPS_SUBSCRIBE_OPERATION__TIME_OUT            = ABSTRACT_CPS_OPERATION__TIME_OUT;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_SUBSCRIBE_OPERATION__ENABLED             = ABSTRACT_CPS_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Topic</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_SUBSCRIBE_OPERATION__TOPIC               = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              CPS_SUBSCRIBE_OPERATION__FILTER              = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sow Init</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_SUBSCRIBE_OPERATION__SOW_INIT            = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Cps Subscribe Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_SUBSCRIBE_OPERATION_FEATURE_COUNT        = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsUnsubscribeOperationImpl <em>Cps Unsubscribe Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsUnsubscribeOperationImpl
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getCpsUnsubscribeOperation()
   * @generated
   */
  int              CPS_UNSUBSCRIBE_OPERATION                    = 7;

  /**
   * The feature id for the '<em><b>Time Out</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              CPS_UNSUBSCRIBE_OPERATION__TIME_OUT          = ABSTRACT_CPS_OPERATION__TIME_OUT;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_UNSUBSCRIBE_OPERATION__ENABLED           = ABSTRACT_CPS_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Topic</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_UNSUBSCRIBE_OPERATION__TOPIC             = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Cps Unsubscribe Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              CPS_UNSUBSCRIBE_OPERATION_FEATURE_COUNT      = ABSTRACT_CPS_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int              DOCUMENT_ROOT                                = 8;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DOCUMENT_ROOT__MIXED                         = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DOCUMENT_ROOT__XMLNS_PREFIX_MAP              = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DOCUMENT_ROOT__XSI_SCHEMA_LOCATION           = 2;

  /**
   * The feature id for the '<em><b>Cps Configuration</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              DOCUMENT_ROOT__CPS_CONFIGURATION             = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              DOCUMENT_ROOT_FEATURE_COUNT                  = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.GroovyTerminationConditionImpl <em>Groovy Termination Condition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.GroovyTerminationConditionImpl
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getGroovyTerminationCondition()
   * @generated
   */
  int              GROOVY_TERMINATION_CONDITION                 = 9;

  /**
   * The feature id for the '<em><b>Groovy Code</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              GROOVY_TERMINATION_CONDITION__GROOVY_CODE    = ABSTRACT_TERMINATION_CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Groovy Termination Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              GROOVY_TERMINATION_CONDITION_FEATURE_COUNT   = ABSTRACT_TERMINATION_CONDITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.PerlTerminationConditionImpl <em>Perl Termination Condition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.PerlTerminationConditionImpl
   * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getPerlTerminationCondition()
   * @generated
   */
  int              PERL_TERMINATION_CONDITION                   = 10;

  /**
   * The feature id for the '<em><b>Perl Code</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              PERL_TERMINATION_CONDITION__PERL_CODE        = ABSTRACT_TERMINATION_CONDITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Perl Termination Condition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              PERL_TERMINATION_CONDITION_FEATURE_COUNT     = ABSTRACT_TERMINATION_CONDITION_FEATURE_COUNT + 1;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cpsModule.AbstractCpsOperation <em>Abstract Cps Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Cps Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.AbstractCpsOperation
   * @generated
   */
  EClass getAbstractCpsOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.cpsModule.AbstractCpsOperation#getTimeOut <em>Time Out</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Time Out</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.AbstractCpsOperation#getTimeOut()
   * @see #getAbstractCpsOperation()
   * @generated
   */
  EReference getAbstractCpsOperation_TimeOut();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.cpsModule.AbstractCpsOperation#isEnabled <em>Enabled</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.AbstractCpsOperation#isEnabled()
   * @see #getAbstractCpsOperation()
   * @generated
   */
  EAttribute getAbstractCpsOperation_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cpsModule.AbstractTerminationCondition <em>Abstract Termination Condition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Termination Condition</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.AbstractTerminationCondition
   * @generated
   */
  EClass getAbstractTerminationCondition();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsConfiguration <em>Cps Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Cps Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsConfiguration
   * @generated
   */
  EClass getCpsConfiguration();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.cpsModule.CpsConfiguration#getCpsResource <em>Cps Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Cps Resource</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsConfiguration#getCpsResource()
   * @see #getCpsConfiguration()
   * @generated
   */
  EReference getCpsConfiguration_CpsResource();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.cpsModule.CpsConfiguration#getOperations <em>Operations</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsConfiguration#getOperations()
   * @see #getCpsConfiguration()
   * @generated
   */
  EReference getCpsConfiguration_Operations();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsGetOperation <em>Cps Get Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Cps Get Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsGetOperation
   * @generated
   */
  EClass getCpsGetOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsGetOperation#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsGetOperation#getOutput()
   * @see #getCpsGetOperation()
   * @generated
   */
  EReference getCpsGetOperation_Output();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsGetOperation#getTerminationCondition <em>Termination Condition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Termination Condition</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsGetOperation#getTerminationCondition()
   * @see #getCpsGetOperation()
   * @generated
   */
  EReference getCpsGetOperation_TerminationCondition();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsPutOperation <em>Cps Put Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Cps Put Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsPutOperation
   * @generated
   */
  EClass getCpsPutOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsPutOperation#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsPutOperation#getInput()
   * @see #getCpsPutOperation()
   * @generated
   */
  EReference getCpsPutOperation_Input();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsPutOperation#getTopic <em>Topic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Topic</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsPutOperation#getTopic()
   * @see #getCpsPutOperation()
   * @generated
   */
  EReference getCpsPutOperation_Topic();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsPutOperation#isIsXml <em>Is Xml</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Xml</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsPutOperation#isIsXml()
   * @see #getCpsPutOperation()
   * @generated
   */
  EAttribute getCpsPutOperation_IsXml();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.cpsModule.CpsPutOperation#isPersistent <em>Persistent</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Persistent</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsPutOperation#isPersistent()
   * @see #getCpsPutOperation()
   * @generated
   */
  EAttribute getCpsPutOperation_Persistent();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsSowDeleteOperation <em>Cps Sow Delete Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Cps Sow Delete Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsSowDeleteOperation
   * @generated
   */
  EClass getCpsSowDeleteOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.cpsModule.CpsSowDeleteOperation#getFilter <em>Filter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsSowDeleteOperation#getFilter()
   * @see #getCpsSowDeleteOperation()
   * @generated
   */
  EReference getCpsSowDeleteOperation_Filter();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsSowDeleteOperation#getTopic <em>Topic</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Topic</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsSowDeleteOperation#getTopic()
   * @see #getCpsSowDeleteOperation()
   * @generated
   */
  EReference getCpsSowDeleteOperation_Topic();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation <em>Cps Subscribe Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Cps Subscribe Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation
   * @generated
   */
  EClass getCpsSubscribeOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation#getTopic <em>Topic</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Topic</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation#getTopic()
   * @see #getCpsSubscribeOperation()
   * @generated
   */
  EReference getCpsSubscribeOperation_Topic();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation#getFilter <em>Filter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation#getFilter()
   * @see #getCpsSubscribeOperation()
   * @generated
   */
  EReference getCpsSubscribeOperation_Filter();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation#isSowInit <em>Sow Init</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Sow Init</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation#isSowInit()
   * @see #getCpsSubscribeOperation()
   * @generated
   */
  EAttribute getCpsSubscribeOperation_SowInit();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsUnsubscribeOperation <em>Cps Unsubscribe Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Cps Unsubscribe Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsUnsubscribeOperation
   * @generated
   */
  EClass getCpsUnsubscribeOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.cpsModule.CpsUnsubscribeOperation#getTopic <em>Topic</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Topic</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsUnsubscribeOperation#getTopic()
   * @see #getCpsUnsubscribeOperation()
   * @generated
   */
  EReference getCpsUnsubscribeOperation_Topic();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cpsModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.cpsModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.cpsModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.cpsModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.cpsModule.DocumentRoot#getCpsConfiguration <em>Cps Configuration</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Cps Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.DocumentRoot#getCpsConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CpsConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cpsModule.GroovyTerminationCondition <em>Groovy Termination Condition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Groovy Termination Condition</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.GroovyTerminationCondition
   * @generated
   */
  EClass getGroovyTerminationCondition();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.cpsModule.GroovyTerminationCondition#getGroovyCode <em>Groovy Code</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Groovy Code</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.GroovyTerminationCondition#getGroovyCode()
   * @see #getGroovyTerminationCondition()
   * @generated
   */
  EReference getGroovyTerminationCondition_GroovyCode();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.cpsModule.PerlTerminationCondition <em>Perl Termination Condition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Perl Termination Condition</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.PerlTerminationCondition
   * @generated
   */
  EClass getPerlTerminationCondition();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.cpsModule.PerlTerminationCondition#getPerlCode <em>Perl Code</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Perl Code</em>'.
   * @see com.ms.qaTools.saturn.modules.cpsModule.PerlTerminationCondition#getPerlCode()
   * @see #getPerlTerminationCondition()
   * @generated
   */
  EReference getPerlTerminationCondition_PerlCode();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CpsModuleFactory getCpsModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.AbstractCpsOperationImpl <em>Abstract Cps Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.AbstractCpsOperationImpl
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getAbstractCpsOperation()
     * @generated
     */
    EClass     ABSTRACT_CPS_OPERATION                    = eINSTANCE.getAbstractCpsOperation();

    /**
     * The meta object literal for the '<em><b>Time Out</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_CPS_OPERATION__TIME_OUT          = eINSTANCE.getAbstractCpsOperation_TimeOut();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_CPS_OPERATION__ENABLED           = eINSTANCE.getAbstractCpsOperation_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.AbstractTerminationConditionImpl <em>Abstract Termination Condition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.AbstractTerminationConditionImpl
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getAbstractTerminationCondition()
     * @generated
     */
    EClass     ABSTRACT_TERMINATION_CONDITION            = eINSTANCE.getAbstractTerminationCondition();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsConfigurationImpl <em>Cps Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getCpsConfiguration()
     * @generated
     */
    EClass     CPS_CONFIGURATION                         = eINSTANCE.getCpsConfiguration();

    /**
     * The meta object literal for the '<em><b>Cps Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_CONFIGURATION__CPS_RESOURCE           = eINSTANCE.getCpsConfiguration_CpsResource();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference CPS_CONFIGURATION__OPERATIONS             = eINSTANCE.getCpsConfiguration_Operations();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsGetOperationImpl <em>Cps Get Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsGetOperationImpl
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getCpsGetOperation()
     * @generated
     */
    EClass     CPS_GET_OPERATION                         = eINSTANCE.getCpsGetOperation();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_GET_OPERATION__OUTPUT                 = eINSTANCE.getCpsGetOperation_Output();

    /**
     * The meta object literal for the '<em><b>Termination Condition</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference CPS_GET_OPERATION__TERMINATION_CONDITION  = eINSTANCE.getCpsGetOperation_TerminationCondition();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsPutOperationImpl <em>Cps Put Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsPutOperationImpl
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getCpsPutOperation()
     * @generated
     */
    EClass     CPS_PUT_OPERATION                         = eINSTANCE.getCpsPutOperation();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_PUT_OPERATION__INPUT                  = eINSTANCE.getCpsPutOperation_Input();

    /**
     * The meta object literal for the '<em><b>Topic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_PUT_OPERATION__TOPIC                  = eINSTANCE.getCpsPutOperation_Topic();

    /**
     * The meta object literal for the '<em><b>Is Xml</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute CPS_PUT_OPERATION__IS_XML                 = eINSTANCE.getCpsPutOperation_IsXml();

    /**
     * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute CPS_PUT_OPERATION__PERSISTENT             = eINSTANCE.getCpsPutOperation_Persistent();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsSowDeleteOperationImpl <em>Cps Sow Delete Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsSowDeleteOperationImpl
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getCpsSowDeleteOperation()
     * @generated
     */
    EClass     CPS_SOW_DELETE_OPERATION                  = eINSTANCE.getCpsSowDeleteOperation();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_SOW_DELETE_OPERATION__FILTER          = eINSTANCE.getCpsSowDeleteOperation_Filter();

    /**
     * The meta object literal for the '<em><b>Topic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_SOW_DELETE_OPERATION__TOPIC           = eINSTANCE.getCpsSowDeleteOperation_Topic();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsSubscribeOperationImpl <em>Cps Subscribe Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsSubscribeOperationImpl
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getCpsSubscribeOperation()
     * @generated
     */
    EClass     CPS_SUBSCRIBE_OPERATION                   = eINSTANCE.getCpsSubscribeOperation();

    /**
     * The meta object literal for the '<em><b>Topic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_SUBSCRIBE_OPERATION__TOPIC            = eINSTANCE.getCpsSubscribeOperation_Topic();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_SUBSCRIBE_OPERATION__FILTER           = eINSTANCE.getCpsSubscribeOperation_Filter();

    /**
     * The meta object literal for the '<em><b>Sow Init</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute CPS_SUBSCRIBE_OPERATION__SOW_INIT         = eINSTANCE.getCpsSubscribeOperation_SowInit();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsUnsubscribeOperationImpl <em>Cps Unsubscribe Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsUnsubscribeOperationImpl
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getCpsUnsubscribeOperation()
     * @generated
     */
    EClass     CPS_UNSUBSCRIBE_OPERATION                 = eINSTANCE.getCpsUnsubscribeOperation();

    /**
     * The meta object literal for the '<em><b>Topic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPS_UNSUBSCRIBE_OPERATION__TOPIC          = eINSTANCE.getCpsUnsubscribeOperation_Topic();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                             = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED                      = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP           = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION        = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Cps Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__CPS_CONFIGURATION          = eINSTANCE.getDocumentRoot_CpsConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.GroovyTerminationConditionImpl <em>Groovy Termination Condition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.GroovyTerminationConditionImpl
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getGroovyTerminationCondition()
     * @generated
     */
    EClass     GROOVY_TERMINATION_CONDITION              = eINSTANCE.getGroovyTerminationCondition();

    /**
     * The meta object literal for the '<em><b>Groovy Code</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference GROOVY_TERMINATION_CONDITION__GROOVY_CODE = eINSTANCE.getGroovyTerminationCondition_GroovyCode();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.cpsModule.impl.PerlTerminationConditionImpl <em>Perl Termination Condition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.PerlTerminationConditionImpl
     * @see com.ms.qaTools.saturn.modules.cpsModule.impl.CpsModulePackageImpl#getPerlTerminationCondition()
     * @generated
     */
    EClass     PERL_TERMINATION_CONDITION                = eINSTANCE.getPerlTerminationCondition();

    /**
     * The meta object literal for the '<em><b>Perl Code</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference PERL_TERMINATION_CONDITION__PERL_CODE     = eINSTANCE.getPerlTerminationCondition_PerlCode();

  }

} // CpsModulePackage
