package com.ms.qaTools.saturn;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Attribute</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.Attribute#isExternal <em>External</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.SaturnPackage#getAttribute()
 * @model extendedMetaData="name='Attribute' kind='mixed'"
 * @generated
 */
public interface Attribute extends ComplexValue
{
  /**
   * Returns the value of the '<em><b>External</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>External</em>' attribute.
   * @see #isSetExternal()
   * @see #unsetExternal()
   * @see #setExternal(boolean)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAttribute_External()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        annotation="http://www.ms.com/2006/pdsttools/xsd2perl deprecated='true'"
   *        extendedMetaData="kind='attribute' name='external'"
   * @generated
   */
  boolean isExternal();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.Attribute#isExternal <em>External</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>External</em>' attribute.
   * @see #isSetExternal()
   * @see #unsetExternal()
   * @see #isExternal()
   * @generated
   */
  void setExternal(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.Attribute#isExternal <em>External</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetExternal()
   * @see #isExternal()
   * @see #setExternal(boolean)
   * @generated
   */
  void unsetExternal();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.Attribute#isExternal <em>External</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>External</em>' attribute is set.
   * @see #unsetExternal()
   * @see #isExternal()
   * @see #setExternal(boolean)
   * @generated
   */
  boolean isSetExternal();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAttribute_Name()
   * @model dataType="com.ms.qaTools.saturn.types.ObjectName" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.Attribute#getName <em>Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Attribute
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
