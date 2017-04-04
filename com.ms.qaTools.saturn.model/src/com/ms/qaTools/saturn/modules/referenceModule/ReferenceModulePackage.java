package com.ms.qaTools.saturn.modules.referenceModule;

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
 * @see com.ms.qaTools.saturn.modules.referenceModule.ReferenceModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface ReferenceModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNAME                                     = "referenceModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNS_URI                                   = "http://www.ms.com/2007/Saturn/Modules/Reference";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNS_PREFIX                                = "referenceModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  ReferenceModulePackage eINSTANCE                                 = com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.referenceModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.referenceModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                    DOCUMENT_ROOT                             = 0;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DOCUMENT_ROOT__MIXED                      = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DOCUMENT_ROOT__XMLNS_PREFIX_MAP           = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DOCUMENT_ROOT__XSI_SCHEMA_LOCATION        = 2;

  /**
   * The feature id for the '<em><b>Reference Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    DOCUMENT_ROOT__REFERENCE_CONFIGURATION    = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    DOCUMENT_ROOT_FEATURE_COUNT               = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceConfigurationImpl <em>Reference Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceModulePackageImpl#getReferenceConfiguration()
   * @generated
   */
  int                    REFERENCE_CONFIGURATION                   = 1;

  /**
   * The feature id for the '<em><b>Include File Adv</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    REFERENCE_CONFIGURATION__INCLUDE_FILE_ADV = 0;

  /**
   * The feature id for the '<em><b>Run Group Adv</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    REFERENCE_CONFIGURATION__RUN_GROUP_ADV    = 1;

  /**
   * The feature id for the '<em><b>Include File</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    REFERENCE_CONFIGURATION__INCLUDE_FILE     = 2;

  /**
   * The feature id for the '<em><b>Run Group</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    REFERENCE_CONFIGURATION__RUN_GROUP        = 3;

  /**
   * The feature id for the '<em><b>Advanced</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    REFERENCE_CONFIGURATION__ADVANCED         = 4;

  /**
   * The number of structural features of the '<em>Reference Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    REFERENCE_CONFIGURATION_FEATURE_COUNT     = 5;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.referenceModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.referenceModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.referenceModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.referenceModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.referenceModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.referenceModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.referenceModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.referenceModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.referenceModule.DocumentRoot#getReferenceConfiguration <em>Reference Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.referenceModule.DocumentRoot#getReferenceConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ReferenceConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration <em>Reference Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration
   * @generated
   */
  EClass getReferenceConfiguration();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getIncludeFileAdv <em>Include File Adv</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Include File Adv</em>'.
   * @see com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getIncludeFileAdv()
   * @see #getReferenceConfiguration()
   * @generated
   */
  EReference getReferenceConfiguration_IncludeFileAdv();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getRunGroupAdv <em>Run Group Adv</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Run Group Adv</em>'.
   * @see com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getRunGroupAdv()
   * @see #getReferenceConfiguration()
   * @generated
   */
  EReference getReferenceConfiguration_RunGroupAdv();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#isAdvanced <em>Advanced</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Advanced</em>'.
   * @see com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#isAdvanced()
   * @see #getReferenceConfiguration()
   * @generated
   */
  EAttribute getReferenceConfiguration_Advanced();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getIncludeFile <em>Include File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include File</em>'.
   * @see com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getIncludeFile()
   * @see #getReferenceConfiguration()
   * @generated
   */
  EAttribute getReferenceConfiguration_IncludeFile();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getRunGroup <em>Run Group</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Run Group</em>'.
   * @see com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration#getRunGroup()
   * @see #getReferenceConfiguration()
   * @generated
   */
  EAttribute getReferenceConfiguration_RunGroup();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ReferenceModuleFactory getReferenceModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.referenceModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.referenceModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceModulePackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>Reference Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__REFERENCE_CONFIGURATION    = eINSTANCE.getDocumentRoot_ReferenceConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceConfigurationImpl <em>Reference Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceModulePackageImpl#getReferenceConfiguration()
     * @generated
     */
    EClass     REFERENCE_CONFIGURATION                   = eINSTANCE.getReferenceConfiguration();

    /**
     * The meta object literal for the '<em><b>Include File Adv</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference REFERENCE_CONFIGURATION__INCLUDE_FILE_ADV = eINSTANCE.getReferenceConfiguration_IncludeFileAdv();

    /**
     * The meta object literal for the '<em><b>Run Group Adv</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference REFERENCE_CONFIGURATION__RUN_GROUP_ADV    = eINSTANCE.getReferenceConfiguration_RunGroupAdv();

    /**
     * The meta object literal for the '<em><b>Advanced</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_CONFIGURATION__ADVANCED         = eINSTANCE.getReferenceConfiguration_Advanced();

    /**
     * The meta object literal for the '<em><b>Include File</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_CONFIGURATION__INCLUDE_FILE     = eINSTANCE.getReferenceConfiguration_IncludeFile();

    /**
     * The meta object literal for the '<em><b>Run Group</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_CONFIGURATION__RUN_GROUP        = eINSTANCE.getReferenceConfiguration_RunGroup();

  }

} // ReferenceModulePackage
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
