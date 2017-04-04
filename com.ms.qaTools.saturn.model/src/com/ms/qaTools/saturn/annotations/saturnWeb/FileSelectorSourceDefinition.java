package com.ms.qaTools.saturn.annotations.saturnWeb;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>File Selector Source Definition</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getDirectory <em>Directory</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getFilePattern <em>File Pattern</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getSelectorType <em>Selector Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getFileSelectorSourceDefinition()
 * @model extendedMetaData="name='FileSelectorSourceDefinition' kind='elementOnly'"
 * @generated
 */
public interface FileSelectorSourceDefinition extends AbstractSourceDefinition
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
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getFileSelectorSourceDefinition_DefaultValue()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='defaultValue'"
   * @generated
   */
  String getDefaultValue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(String value);

  /**
   * Returns the value of the '<em><b>Directory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directory</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directory</em>' attribute.
   * @see #setDirectory(String)
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getFileSelectorSourceDefinition_Directory()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='directory'"
   * @generated
   */
  String getDirectory();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getDirectory <em>Directory</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Directory</em>' attribute.
   * @see #getDirectory()
   * @generated
   */
  void setDirectory(String value);

  /**
   * Returns the value of the '<em><b>File Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Pattern</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Pattern</em>' attribute.
   * @see #setFilePattern(String)
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getFileSelectorSourceDefinition_FilePattern()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='filePattern'"
   * @generated
   */
  String getFilePattern();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getFilePattern <em>File Pattern</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>File Pattern</em>' attribute.
   * @see #getFilePattern()
   * @generated
   */
  void setFilePattern(String value);

  /**
   * Returns the value of the '<em><b>Selector Type</b></em>' attribute. The default value is <code>"FILE"</code>. The
   * literals are from the enumeration {@link com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector Type</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Selector Type</em>' attribute.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum
   * @see #isSetSelectorType()
   * @see #unsetSelectorType()
   * @see #setSelectorType(SelectorTypeEnum)
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage#getFileSelectorSourceDefinition_SelectorType()
   * @model default="FILE" unsettable="true" extendedMetaData="kind='attribute' name='selectorType'"
   * @generated
   */
  SelectorTypeEnum getSelectorType();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getSelectorType <em>Selector Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector Type</em>' attribute.
   * @see com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum
   * @see #isSetSelectorType()
   * @see #unsetSelectorType()
   * @see #getSelectorType()
   * @generated
   */
  void setSelectorType(SelectorTypeEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getSelectorType <em>Selector Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetSelectorType()
   * @see #getSelectorType()
   * @see #setSelectorType(SelectorTypeEnum)
   * @generated
   */
  void unsetSelectorType();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition#getSelectorType <em>Selector Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Selector Type</em>' attribute is set.
   * @see #unsetSelectorType()
   * @see #getSelectorType()
   * @see #setSelectorType(SelectorTypeEnum)
   * @generated
   */
  boolean isSetSelectorType();

} // FileSelectorSourceDefinition
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
