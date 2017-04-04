package com.ms.qaTools.saturn.annotations.saturnWeb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Drop Down Option</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption#isSelected <em>Selected</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption#getText <em>Text</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getDropDownOption()
 * @model extendedMetaData="name='DropDownOption' kind='empty'"
 * @generated
 */
public interface DropDownOption extends EObject
{
  /**
   * Returns the value of the '<em><b>Selected</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selected</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Selected</em>' attribute.
   * @see #isSetSelected()
   * @see #unsetSelected()
   * @see #setSelected(boolean)
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getDropDownOption_Selected()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='selected'"
   * @generated
   */
  boolean isSelected();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption#isSelected <em>Selected</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Selected</em>' attribute.
   * @see #isSetSelected()
   * @see #unsetSelected()
   * @see #isSelected()
   * @generated
   */
  void setSelected(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption#isSelected <em>Selected</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetSelected()
   * @see #isSelected()
   * @see #setSelected(boolean)
   * @generated
   */
  void unsetSelected();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption#isSelected <em>Selected</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Selected</em>' attribute is set.
   * @see #unsetSelected()
   * @see #isSelected()
   * @see #setSelected(boolean)
   * @generated
   */
  boolean isSetSelected();

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getDropDownOption_Text()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='text'"
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getDropDownOption_Value()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='value'"
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // DropDownOption
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
