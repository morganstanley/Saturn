package com.ms.qaTools.saturn.annotations.saturnWeb;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Text Source Definition</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#isMultiLine <em>Multi Line</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#isPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getTextSourceDefinition()
 * @model extendedMetaData="name='TextSourceDefinition' kind='elementOnly'"
 * @generated
 */
public interface TextSourceDefinition extends AbstractSourceDefinition
{
  /**
   * Returns the value of the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' attribute.
   * @see #setDefaultValue(String)
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getTextSourceDefinition_DefaultValue()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='defaultValue'"
   * @generated
   */
  String getDefaultValue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(String value);

  /**
   * Returns the value of the '<em><b>Multi Line</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multi Line</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Multi Line</em>' attribute.
   * @see #isSetMultiLine()
   * @see #unsetMultiLine()
   * @see #setMultiLine(boolean)
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getTextSourceDefinition_MultiLine()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='multiLine'"
   * @generated
   */
  boolean isMultiLine();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#isMultiLine <em>Multi Line</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Multi Line</em>' attribute.
   * @see #isSetMultiLine()
   * @see #unsetMultiLine()
   * @see #isMultiLine()
   * @generated
   */
  void setMultiLine(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#isMultiLine <em>Multi Line</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetMultiLine()
   * @see #isMultiLine()
   * @see #setMultiLine(boolean)
   * @generated
   */
  void unsetMultiLine();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#isMultiLine <em>Multi Line</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Multi Line</em>' attribute is set.
   * @see #unsetMultiLine()
   * @see #isMultiLine()
   * @see #setMultiLine(boolean)
   * @generated
   */
  boolean isSetMultiLine();

  /**
   * Returns the value of the '<em><b>Password</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Password</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Password</em>' attribute.
   * @see #isSetPassword()
   * @see #unsetPassword()
   * @see #setPassword(boolean)
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getTextSourceDefinition_Password()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='password'"
   * @generated
   */
  boolean isPassword();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#isPassword <em>Password</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' attribute.
   * @see #isSetPassword()
   * @see #unsetPassword()
   * @see #isPassword()
   * @generated
   */
  void setPassword(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#isPassword <em>Password</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetPassword()
   * @see #isPassword()
   * @see #setPassword(boolean)
   * @generated
   */
  void unsetPassword();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition#isPassword <em>Password</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Password</em>' attribute is set.
   * @see #unsetPassword()
   * @see #isPassword()
   * @see #setPassword(boolean)
   * @generated
   */
  boolean isSetPassword();

} // TextSourceDefinition
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
