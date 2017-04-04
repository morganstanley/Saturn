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
package com.ms.qaTools.saturn.resources.mssqlResource;

import com.ms.qaTools.saturn.types.DatabaseResourceDefinition;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>MSSQL Resource</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getLogin <em>Login</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getPassword <em>Password</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getServer <em>Server</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getDatabase <em>Database</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getHost <em>Host</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getPort <em>Port</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getAuthentification <em>Authentification</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.resources.mssqlResource.MssqlResourcePackage#getMSSQLResource()
 * @model extendedMetaData="name='MSSQLResource' kind='elementOnly'"
 * @generated
 */
public interface MSSQLResource extends DatabaseResourceDefinition
{
  /**
   * Returns the value of the '<em><b>Login</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Login</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Login</em>' containment reference.
   * @see #setLogin(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.mssqlResource.MssqlResourcePackage#getMSSQLResource_Login()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Login' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getLogin();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getLogin <em>Login</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Login</em>' containment reference.
   * @see #getLogin()
   * @generated
   */
  void setLogin(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Password</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Password</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Password</em>' containment reference.
   * @see #setPassword(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.mssqlResource.MssqlResourcePackage#getMSSQLResource_Password()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Password' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getPassword();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getPassword <em>Password</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' containment reference.
   * @see #getPassword()
   * @generated
   */
  void setPassword(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Server</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server</em>' containment reference.
   * @see #setServer(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.mssqlResource.MssqlResourcePackage#getMSSQLResource_Server()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Server' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getServer();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getServer <em>Server</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Server</em>' containment reference.
   * @see #getServer()
   * @generated
   */
  void setServer(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Database</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Database</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Database</em>' containment reference.
   * @see #setDatabase(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.mssqlResource.MssqlResourcePackage#getMSSQLResource_Database()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Database' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDatabase();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getDatabase <em>Database</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Database</em>' containment reference.
   * @see #getDatabase()
   * @generated
   */
  void setDatabase(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Host</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Host</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Host</em>' containment reference.
   * @see #setHost(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.mssqlResource.MssqlResourcePackage#getMSSQLResource_Host()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Host' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getHost();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getHost <em>Host</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Host</em>' containment reference.
   * @see #getHost()
   * @generated
   */
  void setHost(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' containment reference.
   * @see #setPort(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.mssqlResource.MssqlResourcePackage#getMSSQLResource_Port()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Port' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getPort();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getPort <em>Port</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' containment reference.
   * @see #getPort()
   * @generated
   */
  void setPort(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Authentification</b></em>' attribute.
   * The default value is <code>"PASSWORD"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.resources.mssqlResource.AuthentificationEnums}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Authentification</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Authentification</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.mssqlResource.AuthentificationEnums
   * @see #isSetAuthentification()
   * @see #unsetAuthentification()
   * @see #setAuthentification(AuthentificationEnums)
   * @see com.ms.qaTools.saturn.resources.mssqlResource.MssqlResourcePackage#getMSSQLResource_Authentification()
   * @model default="PASSWORD" unsettable="true"
   *        extendedMetaData="kind='attribute' name='authentification'"
   * @generated
   */
  AuthentificationEnums getAuthentification();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getAuthentification <em>Authentification</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Authentification</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.mssqlResource.AuthentificationEnums
   * @see #isSetAuthentification()
   * @see #unsetAuthentification()
   * @see #getAuthentification()
   * @generated
   */
  void setAuthentification(AuthentificationEnums value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getAuthentification <em>Authentification</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAuthentification()
   * @see #getAuthentification()
   * @see #setAuthentification(AuthentificationEnums)
   * @generated
   */
  void unsetAuthentification();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.mssqlResource.MSSQLResource#getAuthentification <em>Authentification</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Authentification</em>' attribute is set.
   * @see #unsetAuthentification()
   * @see #getAuthentification()
   * @see #setAuthentification(AuthentificationEnums)
   * @generated
   */
  boolean isSetAuthentification();

} // MSSQLResource
