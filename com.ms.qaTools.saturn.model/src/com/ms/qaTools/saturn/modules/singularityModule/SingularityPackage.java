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
package com.ms.qaTools.saturn.modules.singularityModule;

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
 * 
 * @see com.ms.qaTools.saturn.modules.singularityModule.SingularityFactory
 * @model kind="package"
 * @generated
 */
public interface SingularityPackage extends EPackage
{
  /**
   * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  String             eNAME                                           = "singularityModule";

  /**
   * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  String             eNS_URI                                         = "http://www.ms.com/2009/Saturn/Modules/Singularity";

  /**
   * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  String             eNS_PREFIX                                      = "singularityModule";

  /**
   * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  SingularityPackage eINSTANCE                                       = com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl
                                                                         .init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.singularityModule.impl.AbstractExtractActionImpl
   * <em>Abstract Extract Action</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.AbstractExtractActionImpl
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getAbstractExtractAction()
   * @generated
   */
  int                ABSTRACT_EXTRACT_ACTION                         = 0;

  /**
   * The feature id for the '<em><b>ID</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                ABSTRACT_EXTRACT_ACTION__ID                     = 0;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                ABSTRACT_EXTRACT_ACTION__OUTPUT                 = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                ABSTRACT_EXTRACT_ACTION__ENABLED                = 2;

  /**
   * The feature id for the '<em><b>Remove Duplicates</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                ABSTRACT_EXTRACT_ACTION__REMOVE_DUPLICATES      = 3;

  /**
   * The number of structural features of the '<em>Abstract Extract Action</em>' class. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                ABSTRACT_EXTRACT_ACTION_FEATURE_COUNT           = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.singularityModule.impl.AbstractOperationImpl
   * <em>Abstract Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.AbstractOperationImpl
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getAbstractOperation()
   * @generated
   */
  int                ABSTRACT_OPERATION                              = 1;

  /**
   * The number of structural features of the '<em>Abstract Operation</em>' class. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                ABSTRACT_OPERATION_FEATURE_COUNT                = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.singularityModule.impl.DocumentRootImpl
   * <em>Document Root</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getDocumentRoot()
   * @generated
   */
  int                DOCUMENT_ROOT                                   = 2;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                DOCUMENT_ROOT__MIXED                            = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                DOCUMENT_ROOT__XMLNS_PREFIX_MAP                 = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                DOCUMENT_ROOT__XSI_SCHEMA_LOCATION              = 2;

  /**
   * The feature id for the '<em><b>Singularity Configuration</b></em>' containment reference. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                DOCUMENT_ROOT__SINGULARITY_CONFIGURATION        = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                DOCUMENT_ROOT_FEATURE_COUNT                     = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.singularityModule.impl.ExtractOperationImpl
   * <em>Extract Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.ExtractOperationImpl
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getExtractOperation()
   * @generated
   */
  int                EXTRACT_OPERATION                               = 3;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                EXTRACT_OPERATION__ACTIONS                      = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Extract Operation</em>' class. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                EXTRACT_OPERATION_FEATURE_COUNT                 = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.singularityModule.impl.SearchExtractOperationImpl
   * <em>Search Extract Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SearchExtractOperationImpl
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getSearchExtractOperation()
   * @generated
   */
  int                SEARCH_EXTRACT_OPERATION                        = 4;

  /**
   * The feature id for the '<em><b>ID</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                SEARCH_EXTRACT_OPERATION__ID                    = ABSTRACT_EXTRACT_ACTION__ID;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                SEARCH_EXTRACT_OPERATION__OUTPUT                = ABSTRACT_EXTRACT_ACTION__OUTPUT;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                SEARCH_EXTRACT_OPERATION__ENABLED               = ABSTRACT_EXTRACT_ACTION__ENABLED;

  /**
   * The feature id for the '<em><b>Remove Duplicates</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                SEARCH_EXTRACT_OPERATION__REMOVE_DUPLICATES     = ABSTRACT_EXTRACT_ACTION__REMOVE_DUPLICATES;

  /**
   * The number of structural features of the '<em>Search Extract Operation</em>' class. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                SEARCH_EXTRACT_OPERATION_FEATURE_COUNT          = ABSTRACT_EXTRACT_ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '
   * {@link com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityConfigurationImpl <em>Configuration</em>}'
   * class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getSingularityConfiguration()
   * @generated
   */
  int                SINGULARITY_CONFIGURATION                       = 5;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                SINGULARITY_CONFIGURATION__OPERATIONS           = 0;

  /**
   * The number of structural features of the '<em>Configuration</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                SINGULARITY_CONFIGURATION_FEATURE_COUNT         = 1;

  /**
   * The meta object id for the '
   * {@link com.ms.qaTools.saturn.modules.singularityModule.impl.TestCaseExtractOperationImpl
   * <em>Test Case Extract Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.TestCaseExtractOperationImpl
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getTestCaseExtractOperation()
   * @generated
   */
  int                TEST_CASE_EXTRACT_OPERATION                     = 6;

  /**
   * The feature id for the '<em><b>ID</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                TEST_CASE_EXTRACT_OPERATION__ID                 = ABSTRACT_EXTRACT_ACTION__ID;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                TEST_CASE_EXTRACT_OPERATION__OUTPUT             = ABSTRACT_EXTRACT_ACTION__OUTPUT;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                TEST_CASE_EXTRACT_OPERATION__ENABLED            = ABSTRACT_EXTRACT_ACTION__ENABLED;

  /**
   * The feature id for the '<em><b>Remove Duplicates</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                TEST_CASE_EXTRACT_OPERATION__REMOVE_DUPLICATES  = ABSTRACT_EXTRACT_ACTION__REMOVE_DUPLICATES;

  /**
   * The number of structural features of the '<em>Test Case Extract Operation</em>' class. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                TEST_CASE_EXTRACT_OPERATION_FEATURE_COUNT       = ABSTRACT_EXTRACT_ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '
   * {@link com.ms.qaTools.saturn.modules.singularityModule.impl.TestSuiteExtractOperationImpl
   * <em>Test Suite Extract Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.TestSuiteExtractOperationImpl
   * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getTestSuiteExtractOperation()
   * @generated
   */
  int                TEST_SUITE_EXTRACT_OPERATION                    = 7;

  /**
   * The feature id for the '<em><b>ID</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                TEST_SUITE_EXTRACT_OPERATION__ID                = ABSTRACT_EXTRACT_ACTION__ID;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                TEST_SUITE_EXTRACT_OPERATION__OUTPUT            = ABSTRACT_EXTRACT_ACTION__OUTPUT;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                TEST_SUITE_EXTRACT_OPERATION__ENABLED           = ABSTRACT_EXTRACT_ACTION__ENABLED;

  /**
   * The feature id for the '<em><b>Remove Duplicates</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                TEST_SUITE_EXTRACT_OPERATION__REMOVE_DUPLICATES = ABSTRACT_EXTRACT_ACTION__REMOVE_DUPLICATES;

  /**
   * The number of structural features of the '<em>Test Suite Extract Operation</em>' class. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int                TEST_SUITE_EXTRACT_OPERATION_FEATURE_COUNT      = ABSTRACT_EXTRACT_ACTION_FEATURE_COUNT + 0;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.singularityModule.AbstractExtractAction
   * <em>Abstract Extract Action</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Abstract Extract Action</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.AbstractExtractAction
   * @generated
   */
  EClass getAbstractExtractAction();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.singularityModule.AbstractExtractAction#getID <em>ID</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>ID</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.AbstractExtractAction#getID()
   * @see #getAbstractExtractAction()
   * @generated
   */
  EReference getAbstractExtractAction_ID();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.singularityModule.AbstractExtractAction#getOutput <em>Output</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.AbstractExtractAction#getOutput()
   * @see #getAbstractExtractAction()
   * @generated
   */
  EReference getAbstractExtractAction_Output();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.singularityModule.AbstractExtractAction#isEnabled <em>Enabled</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.AbstractExtractAction#isEnabled()
   * @see #getAbstractExtractAction()
   * @generated
   */
  EAttribute getAbstractExtractAction_Enabled();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.singularityModule.AbstractExtractAction#isRemoveDuplicates
   * <em>Remove Duplicates</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Remove Duplicates</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.AbstractExtractAction#isRemoveDuplicates()
   * @see #getAbstractExtractAction()
   * @generated
   */
  EAttribute getAbstractExtractAction_RemoveDuplicates();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.singularityModule.AbstractOperation
   * <em>Abstract Operation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Abstract Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.AbstractOperation
   * @generated
   */
  EClass getAbstractOperation();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.singularityModule.DocumentRoot
   * <em>Document Root</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '
   * {@link com.ms.qaTools.saturn.modules.singularityModule.DocumentRoot#getMixed <em>Mixed</em>}'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '
   * {@link com.ms.qaTools.saturn.modules.singularityModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '
   * {@link com.ms.qaTools.saturn.modules.singularityModule.DocumentRoot#getXSISchemaLocation
   * <em>XSI Schema Location</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.singularityModule.DocumentRoot#getSingularityConfiguration
   * <em>Singularity Configuration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Singularity Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.DocumentRoot#getSingularityConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SingularityConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.singularityModule.ExtractOperation
   * <em>Extract Operation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Extract Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.ExtractOperation
   * @generated
   */
  EClass getExtractOperation();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.singularityModule.ExtractOperation#getActions <em>Actions</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.ExtractOperation#getActions()
   * @see #getExtractOperation()
   * @generated
   */
  EReference getExtractOperation_Actions();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.singularityModule.SearchExtractOperation
   * <em>Search Extract Operation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Search Extract Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.SearchExtractOperation
   * @generated
   */
  EClass getSearchExtractOperation();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.singularityModule.SingularityConfiguration
   * <em>Configuration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.SingularityConfiguration
   * @generated
   */
  EClass getSingularityConfiguration();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.singularityModule.SingularityConfiguration#getOperations <em>Operations</em>}
   * '. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.SingularityConfiguration#getOperations()
   * @see #getSingularityConfiguration()
   * @generated
   */
  EReference getSingularityConfiguration_Operations();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.singularityModule.TestCaseExtractOperation
   * <em>Test Case Extract Operation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Test Case Extract Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.TestCaseExtractOperation
   * @generated
   */
  EClass getTestCaseExtractOperation();

  /**
   * Returns the meta object for class '
   * {@link com.ms.qaTools.saturn.modules.singularityModule.TestSuiteExtractOperation
   * <em>Test Suite Extract Operation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Test Suite Extract Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.singularityModule.TestSuiteExtractOperation
   * @generated
   */
  EClass getTestSuiteExtractOperation();

  /**
   * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SingularityFactory getSingularityFactory();

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '
     * {@link com.ms.qaTools.saturn.modules.singularityModule.impl.AbstractExtractActionImpl
     * <em>Abstract Extract Action</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.AbstractExtractActionImpl
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getAbstractExtractAction()
     * @generated
     */
    EClass     ABSTRACT_EXTRACT_ACTION                    = eINSTANCE.getAbstractExtractAction();

    /**
     * The meta object literal for the '<em><b>ID</b></em>' containment reference feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    EReference ABSTRACT_EXTRACT_ACTION__ID                = eINSTANCE.getAbstractExtractAction_ID();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference ABSTRACT_EXTRACT_ACTION__OUTPUT            = eINSTANCE.getAbstractExtractAction_Output();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    EAttribute ABSTRACT_EXTRACT_ACTION__ENABLED           = eINSTANCE.getAbstractExtractAction_Enabled();

    /**
     * The meta object literal for the '<em><b>Remove Duplicates</b></em>' attribute feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    EAttribute ABSTRACT_EXTRACT_ACTION__REMOVE_DUPLICATES = eINSTANCE.getAbstractExtractAction_RemoveDuplicates();

    /**
     * The meta object literal for the '
     * {@link com.ms.qaTools.saturn.modules.singularityModule.impl.AbstractOperationImpl <em>Abstract Operation</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.AbstractOperationImpl
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getAbstractOperation()
     * @generated
     */
    EClass     ABSTRACT_OPERATION                         = eINSTANCE.getAbstractOperation();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.singularityModule.impl.DocumentRootImpl
     * <em>Document Root</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                              = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED                       = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP            = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION         = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Singularity Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__SINGULARITY_CONFIGURATION   = eINSTANCE.getDocumentRoot_SingularityConfiguration();

    /**
     * The meta object literal for the '
     * {@link com.ms.qaTools.saturn.modules.singularityModule.impl.ExtractOperationImpl <em>Extract Operation</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.ExtractOperationImpl
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getExtractOperation()
     * @generated
     */
    EClass     EXTRACT_OPERATION                          = eINSTANCE.getExtractOperation();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference EXTRACT_OPERATION__ACTIONS                 = eINSTANCE.getExtractOperation_Actions();

    /**
     * The meta object literal for the '
     * {@link com.ms.qaTools.saturn.modules.singularityModule.impl.SearchExtractOperationImpl
     * <em>Search Extract Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SearchExtractOperationImpl
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getSearchExtractOperation()
     * @generated
     */
    EClass     SEARCH_EXTRACT_OPERATION                   = eINSTANCE.getSearchExtractOperation();

    /**
     * The meta object literal for the '
     * {@link com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityConfigurationImpl <em>Configuration</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getSingularityConfiguration()
     * @generated
     */
    EClass     SINGULARITY_CONFIGURATION                  = eINSTANCE.getSingularityConfiguration();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SINGULARITY_CONFIGURATION__OPERATIONS      = eINSTANCE.getSingularityConfiguration_Operations();

    /**
     * The meta object literal for the '
     * {@link com.ms.qaTools.saturn.modules.singularityModule.impl.TestCaseExtractOperationImpl
     * <em>Test Case Extract Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.TestCaseExtractOperationImpl
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getTestCaseExtractOperation()
     * @generated
     */
    EClass     TEST_CASE_EXTRACT_OPERATION                = eINSTANCE.getTestCaseExtractOperation();

    /**
     * The meta object literal for the '
     * {@link com.ms.qaTools.saturn.modules.singularityModule.impl.TestSuiteExtractOperationImpl
     * <em>Test Suite Extract Operation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.TestSuiteExtractOperationImpl
     * @see com.ms.qaTools.saturn.modules.singularityModule.impl.SingularityPackageImpl#getTestSuiteExtractOperation()
     * @generated
     */
    EClass     TEST_SUITE_EXTRACT_OPERATION               = eINSTANCE.getTestSuiteExtractOperation();

  }

} // SingularityPackage
