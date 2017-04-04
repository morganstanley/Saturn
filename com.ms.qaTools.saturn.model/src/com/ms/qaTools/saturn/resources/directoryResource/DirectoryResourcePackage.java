package com.ms.qaTools.saturn.resources.directoryResource;

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
 * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface DirectoryResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                   eNAME                                    = "directoryResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                   eNS_URI                                  = "http://www.ms.com/2006/Saturn/Resources/Directory";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                   eNS_PREFIX                               = "directoryResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  DirectoryResourcePackage eINSTANCE                                = com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourceImpl <em>Directory Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourceImpl
   * @see com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourcePackageImpl#getDirectoryResource()
   * @generated
   */
  int                      DIRECTORY_RESOURCE                       = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DIRECTORY_RESOURCE__ENABLED              = TypesPackage.DEVICE_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DIRECTORY_RESOURCE__STATE                = TypesPackage.DEVICE_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      DIRECTORY_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.DEVICE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DIRECTORY_RESOURCE__NAME                 = TypesPackage.DEVICE_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Initialize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DIRECTORY_RESOURCE__INITIALIZE           = TypesPackage.DEVICE_RESOURCE_DEFINITION__INITIALIZE;

  /**
   * The feature id for the '<em><b>Is Inline</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DIRECTORY_RESOURCE__IS_INLINE            = TypesPackage.DEVICE_RESOURCE_DEFINITION__IS_INLINE;

  /**
   * The feature id for the '<em><b>Directory</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      DIRECTORY_RESOURCE__DIRECTORY            = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Available Size</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DIRECTORY_RESOURCE__AVAILABLE_SIZE       = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Can Read</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DIRECTORY_RESOURCE__CAN_READ             = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Can Write</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DIRECTORY_RESOURCE__CAN_WRITE            = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Exists</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DIRECTORY_RESOURCE__EXISTS               = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Create</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DIRECTORY_RESOURCE__CREATE               = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Check Available Size</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      DIRECTORY_RESOURCE__CHECK_AVAILABLE_SIZE = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DIRECTORY_RESOURCE__FILTER               = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Directory Resource</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      DIRECTORY_RESOURCE_FEATURE_COUNT         = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 8;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource <em>Directory Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Directory Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource
   * @generated
   */
  EClass getDirectoryResource();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#getDirectory <em>Directory</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Directory</em>'.
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#getDirectory()
   * @see #getDirectoryResource()
   * @generated
   */
  EReference getDirectoryResource_Directory();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#getAvailableSize <em>Available Size</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Available Size</em>'.
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#getAvailableSize()
   * @see #getDirectoryResource()
   * @generated
   */
  EReference getDirectoryResource_AvailableSize();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCanRead <em>Can Read</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Can Read</em>'.
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCanRead()
   * @see #getDirectoryResource()
   * @generated
   */
  EAttribute getDirectoryResource_CanRead();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCanWrite <em>Can Write</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Can Write</em>'.
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCanWrite()
   * @see #getDirectoryResource()
   * @generated
   */
  EAttribute getDirectoryResource_CanWrite();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCheckAvailableSize <em>Check Available Size</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Check Available Size</em>'.
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCheckAvailableSize()
   * @see #getDirectoryResource()
   * @generated
   */
  EAttribute getDirectoryResource_CheckAvailableSize();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCreate <em>Create</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Create</em>'.
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isCreate()
   * @see #getDirectoryResource()
   * @generated
   */
  EAttribute getDirectoryResource_Create();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isExists <em>Exists</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Exists</em>'.
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#isExists()
   * @see #getDirectoryResource()
   * @generated
   */
  EAttribute getDirectoryResource_Exists();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#getFilter <em>Filter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Filter</em>'.
   * @see com.ms.qaTools.saturn.resources.directoryResource.DirectoryResource#getFilter()
   * @see #getDirectoryResource()
   * @generated
   */
  EAttribute getDirectoryResource_Filter();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DirectoryResourceFactory getDirectoryResourceFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourceImpl <em>Directory Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourceImpl
     * @see com.ms.qaTools.saturn.resources.directoryResource.impl.DirectoryResourcePackageImpl#getDirectoryResource()
     * @generated
     */
    EClass     DIRECTORY_RESOURCE                       = eINSTANCE.getDirectoryResource();

    /**
     * The meta object literal for the '<em><b>Directory</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECTORY_RESOURCE__DIRECTORY            = eINSTANCE.getDirectoryResource_Directory();

    /**
     * The meta object literal for the '<em><b>Available Size</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference DIRECTORY_RESOURCE__AVAILABLE_SIZE       = eINSTANCE.getDirectoryResource_AvailableSize();

    /**
     * The meta object literal for the '<em><b>Can Read</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DIRECTORY_RESOURCE__CAN_READ             = eINSTANCE.getDirectoryResource_CanRead();

    /**
     * The meta object literal for the '<em><b>Can Write</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DIRECTORY_RESOURCE__CAN_WRITE            = eINSTANCE.getDirectoryResource_CanWrite();

    /**
     * The meta object literal for the '<em><b>Check Available Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECTORY_RESOURCE__CHECK_AVAILABLE_SIZE = eINSTANCE.getDirectoryResource_CheckAvailableSize();

    /**
     * The meta object literal for the '<em><b>Create</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DIRECTORY_RESOURCE__CREATE               = eINSTANCE.getDirectoryResource_Create();

    /**
     * The meta object literal for the '<em><b>Exists</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DIRECTORY_RESOURCE__EXISTS               = eINSTANCE.getDirectoryResource_Exists();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DIRECTORY_RESOURCE__FILTER               = eINSTANCE.getDirectoryResource_Filter();

  }

} // DirectoryResourcePackage
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
