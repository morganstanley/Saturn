package com.ms.qaTools.saturn.modules.documentumModule;

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
 * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumModuleFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface DocumentumModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                  eNAME                                   = "documentumModule";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                  eNS_URI                                 = "http://www.ms.com/2006/Saturn/Modules/Documentum";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                  eNS_PREFIX                              = "documentumModule";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  DocumentumModulePackage eINSTANCE                               = com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumModulePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumModulePackageImpl#getDocumentRoot()
   * @generated
   */
  int                     DOCUMENT_ROOT                           = 0;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DOCUMENT_ROOT__MIXED                    = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DOCUMENT_ROOT__XMLNS_PREFIX_MAP         = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DOCUMENT_ROOT__XSI_SCHEMA_LOCATION      = 2;

  /**
   * The feature id for the '<em><b>Documentum Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DOCUMENT_ROOT__DOCUMENTUM_CONFIGURATION = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     DOCUMENT_ROOT_FEATURE_COUNT             = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumConfigurationImpl <em>Documentum Configuration</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumConfigurationImpl
   * @see com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumModulePackageImpl#getDocumentumConfiguration()
   * @generated
   */
  int                     DOCUMENTUM_CONFIGURATION                = 1;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DOCUMENTUM_CONFIGURATION__BASE          = 0;

  /**
   * The feature id for the '<em><b>Username</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     DOCUMENTUM_CONFIGURATION__USERNAME      = 1;

  /**
   * The feature id for the '<em><b>Password</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     DOCUMENTUM_CONFIGURATION__PASSWORD      = 2;

  /**
   * The feature id for the '<em><b>Folder</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     DOCUMENTUM_CONFIGURATION__FOLDER        = 3;

  /**
   * The feature id for the '<em><b>Document</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                     DOCUMENTUM_CONFIGURATION__DOCUMENT      = 4;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DOCUMENTUM_CONFIGURATION__FILE          = 5;

  /**
   * The feature id for the '<em><b>Debug</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DOCUMENTUM_CONFIGURATION__DEBUG         = 6;

  /**
   * The number of structural features of the '<em>Documentum Configuration</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                     DOCUMENTUM_CONFIGURATION_FEATURE_COUNT  = 7;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentRoot#getDocumentumConfiguration <em>Documentum Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Documentum Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentRoot#getDocumentumConfiguration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_DocumentumConfiguration();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration <em>Documentum Configuration</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Documentum Configuration</em>'.
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration
   * @generated
   */
  EClass getDocumentumConfiguration();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getBase <em>Base</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getBase()
   * @see #getDocumentumConfiguration()
   * @generated
   */
  EReference getDocumentumConfiguration_Base();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getUsername <em>Username</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Username</em>'.
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getUsername()
   * @see #getDocumentumConfiguration()
   * @generated
   */
  EReference getDocumentumConfiguration_Username();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getPassword <em>Password</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Password</em>'.
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getPassword()
   * @see #getDocumentumConfiguration()
   * @generated
   */
  EReference getDocumentumConfiguration_Password();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getFolder <em>Folder</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Folder</em>'.
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getFolder()
   * @see #getDocumentumConfiguration()
   * @generated
   */
  EReference getDocumentumConfiguration_Folder();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getDocument <em>Document</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Document</em>'.
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getDocument()
   * @see #getDocumentumConfiguration()
   * @generated
   */
  EReference getDocumentumConfiguration_Document();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getFile <em>File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>File</em>'.
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#getFile()
   * @see #getDocumentumConfiguration()
   * @generated
   */
  EReference getDocumentumConfiguration_File();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#isDebug <em>Debug</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Debug</em>'.
   * @see com.ms.qaTools.saturn.modules.documentumModule.DocumentumConfiguration#isDebug()
   * @see #getDocumentumConfiguration()
   * @generated
   */
  EAttribute getDocumentumConfiguration_Debug();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DocumentumModuleFactory getDocumentumModuleFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumModulePackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>Documentum Configuration</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DOCUMENT_ROOT__DOCUMENTUM_CONFIGURATION = eINSTANCE.getDocumentRoot_DocumentumConfiguration();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumConfigurationImpl <em>Documentum Configuration</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumConfigurationImpl
     * @see com.ms.qaTools.saturn.modules.documentumModule.impl.DocumentumModulePackageImpl#getDocumentumConfiguration()
     * @generated
     */
    EClass     DOCUMENTUM_CONFIGURATION                = eINSTANCE.getDocumentumConfiguration();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTUM_CONFIGURATION__BASE          = eINSTANCE.getDocumentumConfiguration_Base();

    /**
     * The meta object literal for the '<em><b>Username</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTUM_CONFIGURATION__USERNAME      = eINSTANCE.getDocumentumConfiguration_Username();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTUM_CONFIGURATION__PASSWORD      = eINSTANCE.getDocumentumConfiguration_Password();

    /**
     * The meta object literal for the '<em><b>Folder</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTUM_CONFIGURATION__FOLDER        = eINSTANCE.getDocumentumConfiguration_Folder();

    /**
     * The meta object literal for the '<em><b>Document</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTUM_CONFIGURATION__DOCUMENT      = eINSTANCE.getDocumentumConfiguration_Document();

    /**
     * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTUM_CONFIGURATION__FILE          = eINSTANCE.getDocumentumConfiguration_File();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENTUM_CONFIGURATION__DEBUG         = eINSTANCE.getDocumentumConfiguration_Debug();

  }

} // DocumentumModulePackage
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
