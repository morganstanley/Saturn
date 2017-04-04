package com.ms.qaTools.saturn.modules.xmlGenModule;

import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Data Set</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlGenModule.DataSet#getFile <em>File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlGenModule.DataSet#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlGenModule.DataSet#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage#getDataSet()
 * @model annotation="http://www.ms.com/2006/pdsttools/xsd2perl package='Saturn::Module::XMLGen::DataSet'"
 *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib name='xmlGen_dataSet'"
 *        extendedMetaData="name='DataSets_._type' kind='elementOnly'"
 * @generated
 */
public interface DataSet extends EObject
{
  /**
   * Returns the value of the '<em><b>File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' containment reference.
   * @see #setFile(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage#getDataSet_File()
   * @model containment="true" required="true"
   *        annotation="http://www.ms.com/2006/Saturn/gmf description='DataSet File'"
   *        annotation="http://www.ms.com/2006/pdsttools/xsd2perl accessor='file'"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report colNum='3'"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib map='genDataSet'"
   *        extendedMetaData="kind='element' name='File' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.DataSet#getFile <em>File</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' containment reference.
   * @see #getFile()
   * @generated
   */
  void setFile(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' containment reference.
   * @see #setPrefix(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage#getDataSet_Prefix()
   * @model containment="true" required="true"
   *        annotation="http://www.ms.com/2006/pdsttools/xsd2perl accessor='prefix'"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report colNum='2'"
   *        extendedMetaData="kind='element' name='Prefix' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getPrefix();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.DataSet#getPrefix <em>Prefix</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' containment reference.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Enabled</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #setEnabled(boolean)
   * @see com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage#getDataSet_Enabled()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        annotation="http://www.ms.com/2006/pdsttools/xsd2perl accessor='enabled'"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report colNum='1'"
   *        extendedMetaData="kind='attribute' name='enabled'"
   * @generated
   */
  boolean isEnabled();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.DataSet#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @generated
   */
  void setEnabled(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.DataSet#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  void unsetEnabled();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.xmlGenModule.DataSet#isEnabled <em>Enabled</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Enabled</em>' attribute is set.
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  boolean isSetEnabled();

} // DataSet
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
