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
package com.ms.qaTools.saturn.resources.udbResource;

import com.ms.qaTools.saturn.types.DatabaseResourceDefinition;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>UDB Resource</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.udbResource.UDBResource#getLogin <em>Login</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.udbResource.UDBResource#getServer <em>Server</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.udbResource.UDBResource#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.resources.udbResource.UdbResourcePackage#getUDBResource()
 * @model extendedMetaData="name='UDBResource' kind='elementOnly'"
 * @generated
 */
public interface UDBResource extends DatabaseResourceDefinition
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
   * @see com.ms.qaTools.saturn.resources.udbResource.UdbResourcePackage#getUDBResource_Login()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Login' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getLogin();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.udbResource.UDBResource#getLogin <em>Login</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Login</em>' containment reference.
   * @see #getLogin()
   * @generated
   */
  void setLogin(ComplexValue value);

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
   * @see com.ms.qaTools.saturn.resources.udbResource.UdbResourcePackage#getUDBResource_Server()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Server' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getServer();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.udbResource.UDBResource#getServer <em>Server</em>}' containment reference.
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
   * @see com.ms.qaTools.saturn.resources.udbResource.UdbResourcePackage#getUDBResource_Qualifier()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Qualifier' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getQualifier();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.udbResource.UDBResource#getQualifier <em>Qualifier</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' containment reference.
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(ComplexValue value);

} // UDBResource
