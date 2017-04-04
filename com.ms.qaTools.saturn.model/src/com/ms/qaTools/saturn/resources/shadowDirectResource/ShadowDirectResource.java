package com.ms.qaTools.saturn.resources.shadowDirectResource;

import com.ms.qaTools.saturn.types.DatabaseResourceDefinition;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Shadow Direct Resource</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getLogin <em>Login</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getPassword <em>Password</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getServer <em>Server</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResourcePackage#getShadowDirectResource()
 * @model extendedMetaData="name='ShadowDirectResource' kind='elementOnly'"
 * @generated
 */
public interface ShadowDirectResource extends DatabaseResourceDefinition
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
   * @see com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResourcePackage#getShadowDirectResource_Login()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Login' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getLogin();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getLogin <em>Login</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResourcePackage#getShadowDirectResource_Password()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Password' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getPassword();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getPassword <em>Password</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResourcePackage#getShadowDirectResource_Server()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Server' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getServer();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getServer <em>Server</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Server</em>' containment reference.
   * @see #getServer()
   * @generated
   */
  void setServer(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifier</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier</em>' containment reference.
   * @see #setQualifier(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResourcePackage#getShadowDirectResource_Qualifier()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Qualifier' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getQualifier();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResource#getQualifier <em>Qualifier</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' containment reference.
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(ComplexValue value);

} // ShadowDirectResource
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
