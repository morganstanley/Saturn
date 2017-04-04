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
package com.ms.qaTools.saturn.resources.sybaseResource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.ms.qaTools.saturn.resources.sybaseResource.SybaseResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface SybaseResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                eNAME                                 = "sybaseResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                eNS_URI                               = "http://www.ms.com/2006/Saturn/Resources/Sybase";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                eNS_PREFIX                            = "sybaseResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  SybaseResourcePackage eINSTANCE                             = com.ms.qaTools.saturn.resources.sybaseResource.impl.SybaseResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.sybaseResource.impl.SybaseResourceImpl <em>Sybase Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.sybaseResource.impl.SybaseResourceImpl
   * @see com.ms.qaTools.saturn.resources.sybaseResource.impl.SybaseResourcePackageImpl#getSybaseResource()
   * @generated
   */
  int                   SYBASE_RESOURCE                       = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SYBASE_RESOURCE__ENABLED              = TypesPackage.DATABASE_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SYBASE_RESOURCE__STATE                = TypesPackage.DATABASE_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   SYBASE_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.DATABASE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SYBASE_RESOURCE__NAME                 = TypesPackage.DATABASE_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYBASE_RESOURCE__PERSISTENT = TypesPackage.DATABASE_RESOURCE_DEFINITION__PERSISTENT;

  /**
   * The feature id for the '<em><b>Login</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SYBASE_RESOURCE__LOGIN                = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Password</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   SYBASE_RESOURCE__PASSWORD             = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Server</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   SYBASE_RESOURCE__SERVER               = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Database</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                   SYBASE_RESOURCE__DATABASE             = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Max Connect</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SYBASE_RESOURCE__MAX_CONNECT          = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Authentification</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SYBASE_RESOURCE__AUTHENTIFICATION     = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Sybase Resource</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                   SYBASE_RESOURCE_FEATURE_COUNT         = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.sybaseResource.AuthentificationEnums <em>Authentification Enums</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.sybaseResource.AuthentificationEnums
   * @see com.ms.qaTools.saturn.resources.sybaseResource.impl.SybaseResourcePackageImpl#getAuthentificationEnums()
   * @generated
   */
  int                   AUTHENTIFICATION_ENUMS                = 1;

  /**
   * The meta object id for the '<em>Authentification Enums Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.sybaseResource.AuthentificationEnums
   * @see com.ms.qaTools.saturn.resources.sybaseResource.impl.SybaseResourcePackageImpl#getAuthentificationEnumsObject()
   * @generated
   */
  int                   AUTHENTIFICATION_ENUMS_OBJECT         = 2;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.sybaseResource.SybaseResource <em>Sybase Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Sybase Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.sybaseResource.SybaseResource
   * @generated
   */
  EClass getSybaseResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.sybaseResource.SybaseResource#getLogin <em>Login</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Login</em>'.
   * @see com.ms.qaTools.saturn.resources.sybaseResource.SybaseResource#getLogin()
   * @see #getSybaseResource()
   * @generated
   */
  EReference getSybaseResource_Login();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.sybaseResource.SybaseResource#getPassword <em>Password</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Password</em>'.
   * @see com.ms.qaTools.saturn.resources.sybaseResource.SybaseResource#getPassword()
   * @see #getSybaseResource()
   * @generated
   */
  EReference getSybaseResource_Password();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.sybaseResource.SybaseResource#getServer <em>Server</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Server</em>'.
   * @see com.ms.qaTools.saturn.resources.sybaseResource.SybaseResource#getServer()
   * @see #getSybaseResource()
   * @generated
   */
  EReference getSybaseResource_Server();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.sybaseResource.SybaseResource#getDatabase <em>Database</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Database</em>'.
   * @see com.ms.qaTools.saturn.resources.sybaseResource.SybaseResource#getDatabase()
   * @see #getSybaseResource()
   * @generated
   */
  EReference getSybaseResource_Database();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.sybaseResource.SybaseResource#getMaxConnect <em>Max Connect</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Max Connect</em>'.
   * @see com.ms.qaTools.saturn.resources.sybaseResource.SybaseResource#getMaxConnect()
   * @see #getSybaseResource()
   * @generated
   */
  EReference getSybaseResource_MaxConnect();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.sybaseResource.SybaseResource#getAuthentification <em>Authentification</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Authentification</em>'.
   * @see com.ms.qaTools.saturn.resources.sybaseResource.SybaseResource#getAuthentification()
   * @see #getSybaseResource()
   * @generated
   */
  EAttribute getSybaseResource_Authentification();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.resources.sybaseResource.AuthentificationEnums <em>Authentification Enums</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Authentification Enums</em>'.
   * @see com.ms.qaTools.saturn.resources.sybaseResource.AuthentificationEnums
   * @generated
   */
  EEnum getAuthentificationEnums();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.resources.sybaseResource.AuthentificationEnums <em>Authentification Enums Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Authentification Enums Object</em>'.
   * @see com.ms.qaTools.saturn.resources.sybaseResource.AuthentificationEnums
   * @model instanceClass="com.ms.qaTools.saturn.resources.sybaseResource.AuthentificationEnums"
   *        extendedMetaData="name='AuthentificationEnums:Object' baseType='AuthentificationEnums'"
   * @generated
   */
  EDataType getAuthentificationEnumsObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SybaseResourceFactory getSybaseResourceFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.sybaseResource.impl.SybaseResourceImpl <em>Sybase Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.sybaseResource.impl.SybaseResourceImpl
     * @see com.ms.qaTools.saturn.resources.sybaseResource.impl.SybaseResourcePackageImpl#getSybaseResource()
     * @generated
     */
    EClass     SYBASE_RESOURCE                   = eINSTANCE.getSybaseResource();

    /**
     * The meta object literal for the '<em><b>Login</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYBASE_RESOURCE__LOGIN            = eINSTANCE.getSybaseResource_Login();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYBASE_RESOURCE__PASSWORD         = eINSTANCE.getSybaseResource_Password();

    /**
     * The meta object literal for the '<em><b>Server</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYBASE_RESOURCE__SERVER           = eINSTANCE.getSybaseResource_Server();

    /**
     * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYBASE_RESOURCE__DATABASE         = eINSTANCE.getSybaseResource_Database();

    /**
     * The meta object literal for the '<em><b>Max Connect</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference SYBASE_RESOURCE__MAX_CONNECT      = eINSTANCE.getSybaseResource_MaxConnect();

    /**
     * The meta object literal for the '<em><b>Authentification</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYBASE_RESOURCE__AUTHENTIFICATION = eINSTANCE.getSybaseResource_Authentification();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.sybaseResource.AuthentificationEnums <em>Authentification Enums</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.sybaseResource.AuthentificationEnums
     * @see com.ms.qaTools.saturn.resources.sybaseResource.impl.SybaseResourcePackageImpl#getAuthentificationEnums()
     * @generated
     */
    EEnum      AUTHENTIFICATION_ENUMS            = eINSTANCE.getAuthentificationEnums();

    /**
     * The meta object literal for the '<em>Authentification Enums Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.sybaseResource.AuthentificationEnums
     * @see com.ms.qaTools.saturn.resources.sybaseResource.impl.SybaseResourcePackageImpl#getAuthentificationEnumsObject()
     * @generated
     */
    EDataType  AUTHENTIFICATION_ENUMS_OBJECT     = eINSTANCE.getAuthentificationEnumsObject();

  }

} // SybaseResourcePackage
