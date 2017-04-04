package com.ms.qaTools.saturn.resources.ldapResource;

import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>LDAP Resource</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.ldapResource.LDAPResource#getHost <em>Host</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.ldapResource.LDAPResource#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.ldapResource.LDAPResource#getPassword <em>Password</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.ldapResource.LDAPResource#isKerberos <em>Kerberos</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.resources.ldapResource.LdapResourcePackage#getLDAPResource()
 * @model extendedMetaData="name='LDAPResource' kind='elementOnly'"
 * @generated
 */
public interface LDAPResource extends NamedResourceDefinition
{
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
   * @see com.ms.qaTools.saturn.resources.ldapResource.LdapResourcePackage#getLDAPResource_Host()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Host' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getHost();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.ldapResource.LDAPResource#getHost <em>Host</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Host</em>' containment reference.
   * @see #getHost()
   * @generated
   */
  void setHost(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' containment reference.
   * @see #setDomain(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.ldapResource.LdapResourcePackage#getLDAPResource_Domain()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Domain' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDomain();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.ldapResource.LDAPResource#getDomain <em>Domain</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' containment reference.
   * @see #getDomain()
   * @generated
   */
  void setDomain(ComplexValue value);

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
   * @see com.ms.qaTools.saturn.resources.ldapResource.LdapResourcePackage#getLDAPResource_Password()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Password' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getPassword();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.ldapResource.LDAPResource#getPassword <em>Password</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' containment reference.
   * @see #getPassword()
   * @generated
   */
  void setPassword(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Kerberos</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kerberos</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Kerberos</em>' attribute.
   * @see #isSetKerberos()
   * @see #unsetKerberos()
   * @see #setKerberos(boolean)
   * @see com.ms.qaTools.saturn.resources.ldapResource.LdapResourcePackage#getLDAPResource_Kerberos()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='kerberos'"
   * @generated
   */
  boolean isKerberos();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.ldapResource.LDAPResource#isKerberos <em>Kerberos</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Kerberos</em>' attribute.
   * @see #isSetKerberos()
   * @see #unsetKerberos()
   * @see #isKerberos()
   * @generated
   */
  void setKerberos(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.ldapResource.LDAPResource#isKerberos <em>Kerberos</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetKerberos()
   * @see #isKerberos()
   * @see #setKerberos(boolean)
   * @generated
   */
  void unsetKerberos();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.ldapResource.LDAPResource#isKerberos <em>Kerberos</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Kerberos</em>' attribute is set.
   * @see #unsetKerberos()
   * @see #isKerberos()
   * @see #setKerberos(boolean)
   * @generated
   */
  boolean isSetKerberos();

} // LDAPResource
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
