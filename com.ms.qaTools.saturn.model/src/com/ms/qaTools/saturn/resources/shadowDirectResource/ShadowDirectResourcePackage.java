package com.ms.qaTools.saturn.resources.shadowDirectResource;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.ms.qaTools.saturn.types.TypesPackage;
import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface ShadowDirectResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                      eNAME                                        = "shadowDirectResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                      eNS_URI                                      = "http://www.ms.com/2006/Saturn/Resources/ShadowDirect";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                      eNS_PREFIX                                   = "shadowDirectResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  ShadowDirectResourcePackage eINSTANCE                                    = com.ms.qaTools.saturn.resources.shadowDirectResource.impl.ShadowDirectResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.shadowDirectResource.impl.ShadowDirectResourceImpl <em>Shadow Direct Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.shadowDirectResource.impl.ShadowDirectResourceImpl
   * @see com.ms.qaTools.saturn.resources.shadowDirectResource.impl.ShadowDirectResourcePackageImpl#getShadowDirectResource()
   * @generated
   */
  int                         SHADOW_DIRECT_RESOURCE                       = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                         SHADOW_DIRECT_RESOURCE__ENABLED              = TypesPackage.DATABASE_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                         SHADOW_DIRECT_RESOURCE__STATE                = TypesPackage.DATABASE_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                         SHADOW_DIRECT_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.DATABASE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                         SHADOW_DIRECT_RESOURCE__NAME                 = TypesPackage.DATABASE_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHADOW_DIRECT_RESOURCE__PERSISTENT = TypesPackage.DATABASE_RESOURCE_DEFINITION__PERSISTENT;

  /**
   * The feature id for the '<em><b>Login</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                         SHADOW_DIRECT_RESOURCE__LOGIN                = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Password</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                         SHADOW_DIRECT_RESOURCE__PASSWORD             = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Server</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                         SHADOW_DIRECT_RESOURCE__SERVER               = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                         SHADOW_DIRECT_RESOURCE__QUALIFIER            = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Shadow Direct Resource</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                         SHADOW_DIRECT_RESOURCE_FEATURE_COUNT         = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource <em>Shadow Direct Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Shadow Direct Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource
   * @generated
   */
  EClass getShadowDirectResource();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getLogin <em>Login</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Login</em>'.
   * @see com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getLogin()
   * @see #getShadowDirectResource()
   * @generated
   */
  EReference getShadowDirectResource_Login();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Password</em>'.
   * @see com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getPassword()
   * @see #getShadowDirectResource()
   * @generated
   */
  EReference getShadowDirectResource_Password();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getServer <em>Server</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Server</em>'.
   * @see com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getServer()
   * @see #getShadowDirectResource()
   * @generated
   */
  EReference getShadowDirectResource_Server();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualifier</em>'.
   * @see com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getQualifier()
   * @see #getShadowDirectResource()
   * @generated
   */
  EReference getShadowDirectResource_Qualifier();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ShadowDirectResourceFactory getShadowDirectResourceFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.shadowDirectResource.impl.ShadowDirectResourceImpl <em>Shadow Direct Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.shadowDirectResource.impl.ShadowDirectResourceImpl
     * @see com.ms.qaTools.saturn.resources.shadowDirectResource.impl.ShadowDirectResourcePackageImpl#getShadowDirectResource()
     * @generated
     */
    EClass     SHADOW_DIRECT_RESOURCE            = eINSTANCE.getShadowDirectResource();

    /**
     * The meta object literal for the '<em><b>Login</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHADOW_DIRECT_RESOURCE__LOGIN     = eINSTANCE.getShadowDirectResource_Login();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHADOW_DIRECT_RESOURCE__PASSWORD  = eINSTANCE.getShadowDirectResource_Password();

    /**
     * The meta object literal for the '<em><b>Server</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHADOW_DIRECT_RESOURCE__SERVER    = eINSTANCE.getShadowDirectResource_Server();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SHADOW_DIRECT_RESOURCE__QUALIFIER = eINSTANCE.getShadowDirectResource_Qualifier();

  }

} // ShadowDirectResourcePackage
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
