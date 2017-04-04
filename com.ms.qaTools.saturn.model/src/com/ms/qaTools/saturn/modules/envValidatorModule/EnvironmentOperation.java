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
package com.ms.qaTools.saturn.modules.envValidatorModule;

import org.eclipse.emf.common.util.EList;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Environment Operation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#getCurrentDir <em>Current Dir</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#getCurrentUser <em>Current User</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#getCurrentHost <em>Current Host</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#getEnvVars <em>Env Vars</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentUser <em>Validate Current User</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentDir <em>Validate Current Dir</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentHost <em>Validate Current Host</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage#getEnvironmentOperation()
 * @model extendedMetaData="name='EnvironmentOperation' kind='elementOnly'"
 * @generated
 */
public interface EnvironmentOperation extends AbstractOperation
{
  /**
   * Returns the value of the '<em><b>Current Dir</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Dir</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current Dir</em>' containment reference.
   * @see #setCurrentDir(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage#getEnvironmentOperation_CurrentDir()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='CurrentDir' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getCurrentDir();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#getCurrentDir <em>Current Dir</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Current Dir</em>' containment reference.
   * @see #getCurrentDir()
   * @generated
   */
  void setCurrentDir(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Current User</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current User</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current User</em>' containment reference.
   * @see #setCurrentUser(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage#getEnvironmentOperation_CurrentUser()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='CurrentUser' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getCurrentUser();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#getCurrentUser <em>Current User</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Current User</em>' containment reference.
   * @see #getCurrentUser()
   * @generated
   */
  void setCurrentUser(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Current Host</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Host</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current Host</em>' containment reference.
   * @see #setCurrentHost(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage#getEnvironmentOperation_CurrentHost()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='CurrentHost' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getCurrentHost();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#getCurrentHost <em>Current Host</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Current Host</em>' containment reference.
   * @see #getCurrentHost()
   * @generated
   */
  void setCurrentHost(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Env Vars</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvVar}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Env Vars</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Env Vars</em>' containment reference list.
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage#getEnvironmentOperation_EnvVars()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EnvVars' namespace='##targetNamespace'"
   * @generated
   */
  EList<EnvVar> getEnvVars();

  /**
   * Returns the value of the '<em><b>Validate Current Dir</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validate Current Dir</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validate Current Dir</em>' attribute.
   * @see #isSetValidateCurrentDir()
   * @see #unsetValidateCurrentDir()
   * @see #setValidateCurrentDir(boolean)
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage#getEnvironmentOperation_ValidateCurrentDir()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='validateCurrentDir'"
   * @generated
   */
  boolean isValidateCurrentDir();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentDir <em>Validate Current Dir</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Validate Current Dir</em>' attribute.
   * @see #isSetValidateCurrentDir()
   * @see #unsetValidateCurrentDir()
   * @see #isValidateCurrentDir()
   * @generated
   */
  void setValidateCurrentDir(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentDir <em>Validate Current Dir</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetValidateCurrentDir()
   * @see #isValidateCurrentDir()
   * @see #setValidateCurrentDir(boolean)
   * @generated
   */
  void unsetValidateCurrentDir();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentDir <em>Validate Current Dir</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Validate Current Dir</em>' attribute is set.
   * @see #unsetValidateCurrentDir()
   * @see #isValidateCurrentDir()
   * @see #setValidateCurrentDir(boolean)
   * @generated
   */
  boolean isSetValidateCurrentDir();

  /**
   * Returns the value of the '<em><b>Validate Current Host</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validate Current Host</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validate Current Host</em>' attribute.
   * @see #isSetValidateCurrentHost()
   * @see #unsetValidateCurrentHost()
   * @see #setValidateCurrentHost(boolean)
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage#getEnvironmentOperation_ValidateCurrentHost()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='validateCurrentHost'"
   * @generated
   */
  boolean isValidateCurrentHost();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentHost <em>Validate Current Host</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Validate Current Host</em>' attribute.
   * @see #isSetValidateCurrentHost()
   * @see #unsetValidateCurrentHost()
   * @see #isValidateCurrentHost()
   * @generated
   */
  void setValidateCurrentHost(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentHost <em>Validate Current Host</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetValidateCurrentHost()
   * @see #isValidateCurrentHost()
   * @see #setValidateCurrentHost(boolean)
   * @generated
   */
  void unsetValidateCurrentHost();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentHost <em>Validate Current Host</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Validate Current Host</em>' attribute is set.
   * @see #unsetValidateCurrentHost()
   * @see #isValidateCurrentHost()
   * @see #setValidateCurrentHost(boolean)
   * @generated
   */
  boolean isSetValidateCurrentHost();

  /**
   * Returns the value of the '<em><b>Validate Current User</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validate Current User</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validate Current User</em>' attribute.
   * @see #isSetValidateCurrentUser()
   * @see #unsetValidateCurrentUser()
   * @see #setValidateCurrentUser(boolean)
   * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage#getEnvironmentOperation_ValidateCurrentUser()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='validateCurrentUser'"
   * @generated
   */
  boolean isValidateCurrentUser();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentUser <em>Validate Current User</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Validate Current User</em>' attribute.
   * @see #isSetValidateCurrentUser()
   * @see #unsetValidateCurrentUser()
   * @see #isValidateCurrentUser()
   * @generated
   */
  void setValidateCurrentUser(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentUser <em>Validate Current User</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetValidateCurrentUser()
   * @see #isValidateCurrentUser()
   * @see #setValidateCurrentUser(boolean)
   * @generated
   */
  void unsetValidateCurrentUser();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.envValidatorModule.EnvironmentOperation#isValidateCurrentUser <em>Validate Current User</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Validate Current User</em>' attribute is set.
   * @see #unsetValidateCurrentUser()
   * @see #isValidateCurrentUser()
   * @see #setValidateCurrentUser(boolean)
   * @generated
   */
  boolean isSetValidateCurrentUser();

} // EnvironmentOperation
