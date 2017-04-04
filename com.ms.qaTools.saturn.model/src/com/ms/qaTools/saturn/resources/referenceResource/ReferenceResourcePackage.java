/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 */
package com.ms.qaTools.saturn.resources.referenceResource;

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
 * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface ReferenceResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                   eNAME                                    = "referenceResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                   eNS_URI                                  = "http://www.ms.com/2006/Saturn/Resources/Reference";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                   eNS_PREFIX                               = "referenceResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  ReferenceResourcePackage eINSTANCE                                = com.ms.qaTools.saturn.resources.referenceResource.impl.ReferenceResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.referenceResource.impl.ReferenceResourceImpl <em>Reference Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.referenceResource.impl.ReferenceResourceImpl
   * @see com.ms.qaTools.saturn.resources.referenceResource.impl.ReferenceResourcePackageImpl#getReferenceResource()
   * @generated
   */
  int                      REFERENCE_RESOURCE                       = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      REFERENCE_RESOURCE__ENABLED              = TypesPackage.DEVICE_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      REFERENCE_RESOURCE__STATE                = TypesPackage.DEVICE_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      REFERENCE_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.DEVICE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      REFERENCE_RESOURCE__NAME                 = TypesPackage.DEVICE_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Initialize</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      REFERENCE_RESOURCE__INITIALIZE           = TypesPackage.DEVICE_RESOURCE_DEFINITION__INITIALIZE;

  /**
   * The feature id for the '<em><b>Is Inline</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      REFERENCE_RESOURCE__IS_INLINE            = TypesPackage.DEVICE_RESOURCE_DEFINITION__IS_INLINE;

  /**
   * The feature id for the '<em><b>Include File Adv</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      REFERENCE_RESOURCE__INCLUDE_FILE_ADV     = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resource Adv</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      REFERENCE_RESOURCE__RESOURCE_ADV         = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Include File</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      REFERENCE_RESOURCE__INCLUDE_FILE         = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Resource</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      REFERENCE_RESOURCE__RESOURCE             = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Advanced</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      REFERENCE_RESOURCE__ADVANCED             = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Clone</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      REFERENCE_RESOURCE__CLONE                = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_RESOURCE__LINK = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Reference Resource</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      REFERENCE_RESOURCE_FEATURE_COUNT         = TypesPackage.DEVICE_RESOURCE_DEFINITION_FEATURE_COUNT + 7;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource <em>Reference Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource
   * @generated
   */
  EClass getReferenceResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getIncludeFileAdv <em>Include File Adv</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Include File Adv</em>'.
   * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getIncludeFileAdv()
   * @see #getReferenceResource()
   * @generated
   */
  EReference getReferenceResource_IncludeFileAdv();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getResourceAdv <em>Resource Adv</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource Adv</em>'.
   * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getResourceAdv()
   * @see #getReferenceResource()
   * @generated
   */
  EReference getReferenceResource_ResourceAdv();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#isAdvanced <em>Advanced</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Advanced</em>'.
   * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#isAdvanced()
   * @see #getReferenceResource()
   * @generated
   */
  EAttribute getReferenceResource_Advanced();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#isClone <em>Clone</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Clone</em>'.
   * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#isClone()
   * @see #getReferenceResource()
   * @generated
   */
  EAttribute getReferenceResource_Clone();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getIncludeFile <em>Include File</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include File</em>'.
   * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getIncludeFile()
   * @see #getReferenceResource()
   * @generated
   */
  EAttribute getReferenceResource_IncludeFile();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Link</em>'.
   * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getLink()
   * @see #getReferenceResource()
   * @generated
   */
  EReference getReferenceResource_Link();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getResource <em>Resource</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource#getResource()
   * @see #getReferenceResource()
   * @generated
   */
  EAttribute getReferenceResource_Resource();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ReferenceResourceFactory getReferenceResourceFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.referenceResource.impl.ReferenceResourceImpl <em>Reference Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.referenceResource.impl.ReferenceResourceImpl
     * @see com.ms.qaTools.saturn.resources.referenceResource.impl.ReferenceResourcePackageImpl#getReferenceResource()
     * @generated
     */
    EClass     REFERENCE_RESOURCE                   = eINSTANCE.getReferenceResource();

    /**
     * The meta object literal for the '<em><b>Include File Adv</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference REFERENCE_RESOURCE__INCLUDE_FILE_ADV = eINSTANCE.getReferenceResource_IncludeFileAdv();

    /**
     * The meta object literal for the '<em><b>Resource Adv</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_RESOURCE__RESOURCE_ADV     = eINSTANCE.getReferenceResource_ResourceAdv();

    /**
     * The meta object literal for the '<em><b>Advanced</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_RESOURCE__ADVANCED         = eINSTANCE.getReferenceResource_Advanced();

    /**
     * The meta object literal for the '<em><b>Clone</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_RESOURCE__CLONE            = eINSTANCE.getReferenceResource_Clone();

    /**
     * The meta object literal for the '<em><b>Include File</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_RESOURCE__INCLUDE_FILE     = eINSTANCE.getReferenceResource_IncludeFile();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_RESOURCE__LINK = eINSTANCE.getReferenceResource_Link();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_RESOURCE__RESOURCE         = eINSTANCE.getReferenceResource_Resource();

  }

} // ReferenceResourcePackage
