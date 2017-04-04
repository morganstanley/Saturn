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
package com.ms.qaTools.saturn.resources.mongoDbResource;

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
 * @see com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface MongoDbResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNAME                                   = "mongoDbResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNS_URI                                 = "http://www.ms.com/2013/Saturn/Resources/MongoDb";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                 eNS_PREFIX                              = "mongoDbResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  MongoDbResourcePackage eINSTANCE                               = com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourceImpl <em>Mongo Db Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourceImpl
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourcePackageImpl#getMongoDbResource()
   * @generated
   */
  int                    MONGO_DB_RESOURCE                       = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    MONGO_DB_RESOURCE__ENABLED              = TypesPackage.DATABASE_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    MONGO_DB_RESOURCE__STATE                = TypesPackage.DATABASE_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    MONGO_DB_RESOURCE__CONNECTOR_PREFERENCE = TypesPackage.DATABASE_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    MONGO_DB_RESOURCE__NAME                 = TypesPackage.DATABASE_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONGO_DB_RESOURCE__PERSISTENT = TypesPackage.DATABASE_RESOURCE_DEFINITION__PERSISTENT;

  /**
   * The feature id for the '<em><b>Host</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    MONGO_DB_RESOURCE__HOST                 = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    MONGO_DB_RESOURCE__PORT                 = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Database</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    MONGO_DB_RESOURCE__DATABASE             = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Login</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    MONGO_DB_RESOURCE__LOGIN                = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Password</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                    MONGO_DB_RESOURCE__PASSWORD             = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Authentification</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    MONGO_DB_RESOURCE__AUTHENTIFICATION     = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    MONGO_DB_RESOURCE__CONNECT_TIMEOUT      = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Socket Timeout</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                    MONGO_DB_RESOURCE__SOCKET_TIMEOUT       = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Mongo Db Resource</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                    MONGO_DB_RESOURCE_FEATURE_COUNT         = TypesPackage.DATABASE_RESOURCE_DEFINITION_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.mongoDbResource.AuthentificationEnums <em>Authentification Enums</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.AuthentificationEnums
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourcePackageImpl#getAuthentificationEnums()
   * @generated
   */
  int                    AUTHENTIFICATION_ENUMS                  = 1;

  /**
   * The meta object id for the '<em>Authentification Enums Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.AuthentificationEnums
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourcePackageImpl#getAuthentificationEnumsObject()
   * @generated
   */
  int                    AUTHENTIFICATION_ENUMS_OBJECT           = 2;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource <em>Mongo Db Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Mongo Db Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource
   * @generated
   */
  EClass getMongoDbResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getHost <em>Host</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Host</em>'.
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getHost()
   * @see #getMongoDbResource()
   * @generated
   */
  EReference getMongoDbResource_Host();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getPort <em>Port</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Port</em>'.
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getPort()
   * @see #getMongoDbResource()
   * @generated
   */
  EReference getMongoDbResource_Port();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getDatabase <em>Database</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Database</em>'.
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getDatabase()
   * @see #getMongoDbResource()
   * @generated
   */
  EReference getMongoDbResource_Database();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getLogin <em>Login</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Login</em>'.
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getLogin()
   * @see #getMongoDbResource()
   * @generated
   */
  EReference getMongoDbResource_Login();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getPassword <em>Password</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Password</em>'.
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getPassword()
   * @see #getMongoDbResource()
   * @generated
   */
  EReference getMongoDbResource_Password();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getAuthentification <em>Authentification</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Authentification</em>'.
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getAuthentification()
   * @see #getMongoDbResource()
   * @generated
   */
  EAttribute getMongoDbResource_Authentification();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getConnectTimeout <em>Connect Timeout</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connect Timeout</em>'.
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getConnectTimeout()
   * @see #getMongoDbResource()
   * @generated
   */
  EAttribute getMongoDbResource_ConnectTimeout();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getSocketTimeout <em>Socket Timeout</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Socket Timeout</em>'.
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.MongoDbResource#getSocketTimeout()
   * @see #getMongoDbResource()
   * @generated
   */
  EAttribute getMongoDbResource_SocketTimeout();

  /**
   * Returns the meta object for enum '{@link com.ms.qaTools.saturn.resources.mongoDbResource.AuthentificationEnums <em>Authentification Enums</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Authentification Enums</em>'.
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.AuthentificationEnums
   * @generated
   */
  EEnum getAuthentificationEnums();

  /**
   * Returns the meta object for data type '{@link com.ms.qaTools.saturn.resources.mongoDbResource.AuthentificationEnums <em>Authentification Enums Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Authentification Enums Object</em>'.
   * @see com.ms.qaTools.saturn.resources.mongoDbResource.AuthentificationEnums
   * @model instanceClass="com.ms.qaTools.saturn.resources.mongoDbResource.AuthentificationEnums"
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
  MongoDbResourceFactory getMongoDbResourceFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourceImpl <em>Mongo Db Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourceImpl
     * @see com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourcePackageImpl#getMongoDbResource()
     * @generated
     */
    EClass     MONGO_DB_RESOURCE                   = eINSTANCE.getMongoDbResource();

    /**
     * The meta object literal for the '<em><b>Host</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MONGO_DB_RESOURCE__HOST             = eINSTANCE.getMongoDbResource_Host();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MONGO_DB_RESOURCE__PORT             = eINSTANCE.getMongoDbResource_Port();

    /**
     * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MONGO_DB_RESOURCE__DATABASE         = eINSTANCE.getMongoDbResource_Database();

    /**
     * The meta object literal for the '<em><b>Login</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MONGO_DB_RESOURCE__LOGIN            = eINSTANCE.getMongoDbResource_Login();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MONGO_DB_RESOURCE__PASSWORD         = eINSTANCE.getMongoDbResource_Password();

    /**
     * The meta object literal for the '<em><b>Authentification</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MONGO_DB_RESOURCE__AUTHENTIFICATION = eINSTANCE.getMongoDbResource_Authentification();

    /**
     * The meta object literal for the '<em><b>Connect Timeout</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MONGO_DB_RESOURCE__CONNECT_TIMEOUT  = eINSTANCE.getMongoDbResource_ConnectTimeout();

    /**
     * The meta object literal for the '<em><b>Socket Timeout</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute MONGO_DB_RESOURCE__SOCKET_TIMEOUT   = eINSTANCE.getMongoDbResource_SocketTimeout();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.mongoDbResource.AuthentificationEnums <em>Authentification Enums</em>}' enum.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.mongoDbResource.AuthentificationEnums
     * @see com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourcePackageImpl#getAuthentificationEnums()
     * @generated
     */
    EEnum      AUTHENTIFICATION_ENUMS              = eINSTANCE.getAuthentificationEnums();

    /**
     * The meta object literal for the '<em>Authentification Enums Object</em>' data type.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.mongoDbResource.AuthentificationEnums
     * @see com.ms.qaTools.saturn.resources.mongoDbResource.impl.MongoDbResourcePackageImpl#getAuthentificationEnumsObject()
     * @generated
     */
    EDataType  AUTHENTIFICATION_ENUMS_OBJECT       = eINSTANCE.getAuthentificationEnumsObject();

  }

} // MongoDbResourcePackage
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
