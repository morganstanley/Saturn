package com.ms.qaTools.saturn.modules.dsConvertModule;

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
 * @see com.ms.qaTools.saturn.modules.dsConvertModule.DsConvertModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface DsConvertModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNAME                                   = "dsConvertModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNS_URI                                 = "http://www.ms.com/2009/Saturn/Modules/DsConvert";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNS_PREFIX                              = "dsConvertModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  DsConvertModulePackage eINSTANCE                               = com.ms.qaTools.saturn.modules.dsConvertModule.impl.DsConvertModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.dsConvertModule.impl.AbstractOperationImpl <em>Abstract Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.AbstractOperationImpl
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.DsConvertModulePackageImpl#getAbstractOperation()
   * @generated
   */
  int                    ABSTRACT_OPERATION                      = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    ABSTRACT_OPERATION__ENABLED             = 0;

  /**
   * The number of structural features of the '<em>Abstract Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    ABSTRACT_OPERATION_FEATURE_COUNT        = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.dsConvertModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.DsConvertModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                    DOCUMENT_ROOT                           = 1;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DOCUMENT_ROOT__MIXED                    = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DOCUMENT_ROOT__XMLNS_PREFIX_MAP         = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DOCUMENT_ROOT__XSI_SCHEMA_LOCATION      = 2;

  /**
   * The feature id for the '<em><b>DS Convert Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DOCUMENT_ROOT__DS_CONVERT_CONFIGURATION = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    DOCUMENT_ROOT_FEATURE_COUNT             = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.dsConvertModule.impl.DSConvertConfigurationImpl <em>DS Convert Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.DSConvertConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.DsConvertModulePackageImpl#getDSConvertConfiguration()
   * @generated
   */
  int                    DS_CONVERT_CONFIGURATION                = 2;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DS_CONVERT_CONFIGURATION__OPERATIONS    = 0;

  /**
   * The number of structural features of the '<em>DS Convert Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DS_CONVERT_CONFIGURATION_FEATURE_COUNT  = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.dsConvertModule.impl.SimpleOperationImpl <em>Simple Operation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.SimpleOperationImpl
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.DsConvertModulePackageImpl#getSimpleOperation()
   * @generated
   */
  int                    SIMPLE_OPERATION                        = 3;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    SIMPLE_OPERATION__ENABLED               = ABSTRACT_OPERATION__ENABLED;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    SIMPLE_OPERATION__SOURCE                = ABSTRACT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    SIMPLE_OPERATION__TARGET                = ABSTRACT_OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ignore Cols</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    SIMPLE_OPERATION__IGNORE_COLS           = ABSTRACT_OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    SIMPLE_OPERATION__EXCEPTION             = ABSTRACT_OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Number Duplicate Cols</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    SIMPLE_OPERATION__NUMBER_DUPLICATE_COLS = ABSTRACT_OPERATION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Simple Operation</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    SIMPLE_OPERATION_FEATURE_COUNT          = ABSTRACT_OPERATION_FEATURE_COUNT + 5;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.dsConvertModule.AbstractOperation <em>Abstract Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.AbstractOperation
   * @generated
   */
  EClass getAbstractOperation();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.dsConvertModule.AbstractOperation#isEnabled <em>Enabled</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.AbstractOperation#isEnabled()
   * @see #getAbstractOperation()
   * @generated
   */
  EAttribute getAbstractOperation_Enabled();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.dsConvertModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.dsConvertModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.dsConvertModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.dsConvertModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.dsConvertModule.DocumentRoot#getDSConvertConfiguration <em>DS Convert Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>DS Convert Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.DocumentRoot#getDSConvertConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_DSConvertConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.dsConvertModule.DSConvertConfiguration <em>DS Convert Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>DS Convert Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.DSConvertConfiguration
   * @generated
   */
  EClass getDSConvertConfiguration();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.modules.dsConvertModule.DSConvertConfiguration#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.DSConvertConfiguration#getOperations()
   * @see #getDSConvertConfiguration()
   * @generated
   */
  EReference getDSConvertConfiguration_Operations();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation <em>Simple Operation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Operation</em>'.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation
   * @generated
   */
  EClass getSimpleOperation();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#getSource <em>Source</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#getSource()
   * @see #getSimpleOperation()
   * @generated
   */
  EReference getSimpleOperation_Source();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#getTarget <em>Target</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#getTarget()
   * @see #getSimpleOperation()
   * @generated
   */
  EReference getSimpleOperation_Target();

  /**
   * Returns the meta object for the containment reference list '
   * {@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#getIgnoreCols <em>Ignore Cols</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Ignore Cols</em>'.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#getIgnoreCols()
   * @see #getSimpleOperation()
   * @generated
   */
  EReference getSimpleOperation_IgnoreCols();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#getException <em>Exception</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#getException()
   * @see #getSimpleOperation()
   * @generated
   */
  EReference getSimpleOperation_Exception();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#isNumberDuplicateCols <em>Number Duplicate Cols</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Duplicate Cols</em>'.
   * @see com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation#isNumberDuplicateCols()
   * @see #getSimpleOperation()
   * @generated
   */
  EAttribute getSimpleOperation_NumberDuplicateCols();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DsConvertModuleFactory getDsConvertModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.dsConvertModule.impl.AbstractOperationImpl <em>Abstract Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.AbstractOperationImpl
     * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.DsConvertModulePackageImpl#getAbstractOperation()
     * @generated
     */
    EClass     ABSTRACT_OPERATION                      = eINSTANCE.getAbstractOperation();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_OPERATION__ENABLED             = eINSTANCE.getAbstractOperation_Enabled();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.dsConvertModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.DsConvertModulePackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                           = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED                    = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP         = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION      = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>DS Convert Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__DS_CONVERT_CONFIGURATION = eINSTANCE.getDocumentRoot_DSConvertConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.dsConvertModule.impl.DSConvertConfigurationImpl <em>DS Convert Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.DSConvertConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.DsConvertModulePackageImpl#getDSConvertConfiguration()
     * @generated
     */
    EClass     DS_CONVERT_CONFIGURATION                = eINSTANCE.getDSConvertConfiguration();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DS_CONVERT_CONFIGURATION__OPERATIONS    = eINSTANCE.getDSConvertConfiguration_Operations();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.dsConvertModule.impl.SimpleOperationImpl <em>Simple Operation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.SimpleOperationImpl
     * @see com.ms.qaTools.saturn.modules.dsConvertModule.impl.DsConvertModulePackageImpl#getSimpleOperation()
     * @generated
     */
    EClass     SIMPLE_OPERATION                        = eINSTANCE.getSimpleOperation();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_OPERATION__SOURCE                = eINSTANCE.getSimpleOperation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_OPERATION__TARGET                = eINSTANCE.getSimpleOperation_Target();

    /**
     * The meta object literal for the '<em><b>Ignore Cols</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference SIMPLE_OPERATION__IGNORE_COLS           = eINSTANCE.getSimpleOperation_IgnoreCols();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_OPERATION__EXCEPTION             = eINSTANCE.getSimpleOperation_Exception();

    /**
     * The meta object literal for the '<em><b>Number Duplicate Cols</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_OPERATION__NUMBER_DUPLICATE_COLS = eINSTANCE.getSimpleOperation_NumberDuplicateCols();

  }

} // DsConvertModulePackage
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
