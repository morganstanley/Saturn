package com.ms.qaTools.saturn.resources.documentumResource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.ms.qaTools.saturn.types.TypesPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface DocumentumResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                    eNAME                                     = "documentumResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                    eNS_URI                                   = "http://www.ms.com/2010/Saturn/Resources/Documentum";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                    eNS_PREFIX                                = "documentumResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  DocumentumResourcePackage eINSTANCE                                 = com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourceImpl <em>Documentum Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourceImpl
   * @see com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourcePackageImpl#getDocumentumResource()
   * @generated
   */
  int                       DOCUMENTUM_RESOURCE                       = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       DOCUMENTUM_RESOURCE__ENABLED              = TypesPackage.DEVICE_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       DOCUMENTUM_RESOURCE__STATE                = TypesPackage.DEVICE_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                       DOCUMENTUM_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.DEVICE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       DOCUMENTUM_RESOURCE__NAME                 = TypesPackage.DEVICE_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Initialize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       DOCUMENTUM_RESOURCE__INITIALIZE           = TypesPackage.DEVICE_RESOURCE_DEFINITION__INITIALIZE;

  /**
   * The feature id for the '<em><b>Is Inline</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       DOCUMENTUM_RESOURCE__IS_INLINE            = TypesPackage.DEVICE_RESOURCE_DEFINITION__IS_INLINE;

  /**
   * The feature id for the '<em><b>Base</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       DOCUMENTUM_RESOURCE__BASE                 = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>User Name</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                       DOCUMENTUM_RESOURCE__USER_NAME            = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Password</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                       DOCUMENTUM_RESOURCE__PASSWORD             = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Folder</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                       DOCUMENTUM_RESOURCE__FOLDER               = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Document</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                       DOCUMENTUM_RESOURCE__DOCUMENT             = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>File</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       DOCUMENTUM_RESOURCE__FILE                 = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Debug</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       DOCUMENTUM_RESOURCE__DEBUG                = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Temporary</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                       DOCUMENTUM_RESOURCE__TEMPORARY            = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Documentum Resource</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                       DOCUMENTUM_RESOURCE_FEATURE_COUNT         = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 8;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource <em>Documentum Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Documentum Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource
   * @generated
   */
  EClass getDocumentumResource();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getBase <em>Base</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Base</em>'.
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getBase()
   * @see #getDocumentumResource()
   * @generated
   */
  EReference getDocumentumResource_Base();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getUserName <em>User Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>User Name</em>'.
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getUserName()
   * @see #getDocumentumResource()
   * @generated
   */
  EReference getDocumentumResource_UserName();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getPassword <em>Password</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Password</em>'.
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getPassword()
   * @see #getDocumentumResource()
   * @generated
   */
  EReference getDocumentumResource_Password();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getFolder <em>Folder</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Folder</em>'.
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getFolder()
   * @see #getDocumentumResource()
   * @generated
   */
  EReference getDocumentumResource_Folder();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getDocument <em>Document</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Document</em>'.
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getDocument()
   * @see #getDocumentumResource()
   * @generated
   */
  EReference getDocumentumResource_Document();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getFile <em>File</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>File</em>'.
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#getFile()
   * @see #getDocumentumResource()
   * @generated
   */
  EReference getDocumentumResource_File();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#isDebug <em>Debug</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Debug</em>'.
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#isDebug()
   * @see #getDocumentumResource()
   * @generated
   */
  EAttribute getDocumentumResource_Debug();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#isTemporary <em>Temporary</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Temporary</em>'.
   * @see com.ms.qaTools.saturn.resources.documentumResource.DocumentumResource#isTemporary()
   * @see #getDocumentumResource()
   * @generated
   */
  EAttribute getDocumentumResource_Temporary();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DocumentumResourceFactory getDocumentumResourceFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourceImpl <em>Documentum Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourceImpl
     * @see com.ms.qaTools.saturn.resources.documentumResource.impl.DocumentumResourcePackageImpl#getDocumentumResource()
     * @generated
     */
    EClass     DOCUMENTUM_RESOURCE            = eINSTANCE.getDocumentumResource();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTUM_RESOURCE__BASE      = eINSTANCE.getDocumentumResource_Base();

    /**
     * The meta object literal for the '<em><b>User Name</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTUM_RESOURCE__USER_NAME = eINSTANCE.getDocumentumResource_UserName();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTUM_RESOURCE__PASSWORD  = eINSTANCE.getDocumentumResource_Password();

    /**
     * The meta object literal for the '<em><b>Folder</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTUM_RESOURCE__FOLDER    = eINSTANCE.getDocumentumResource_Folder();

    /**
     * The meta object literal for the '<em><b>Document</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTUM_RESOURCE__DOCUMENT  = eINSTANCE.getDocumentumResource_Document();

    /**
     * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTUM_RESOURCE__FILE      = eINSTANCE.getDocumentumResource_File();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENTUM_RESOURCE__DEBUG     = eINSTANCE.getDocumentumResource_Debug();

    /**
     * The meta object literal for the '<em><b>Temporary</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENTUM_RESOURCE__TEMPORARY = eINSTANCE.getDocumentumResource_Temporary();

  }

} // DocumentumResourcePackage
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
