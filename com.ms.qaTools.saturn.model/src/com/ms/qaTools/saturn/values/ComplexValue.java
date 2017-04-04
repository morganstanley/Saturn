/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 */
package com.ms.qaTools.saturn.values;

import com.ms.qaTools.saturn.types.Empty;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.values.ComplexValue#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ComplexValue#getNull <em>Null</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ComplexValue#getGroup <em>Group</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ComplexValue#getText <em>Text</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ComplexValue#getEnvVar <em>Env Var</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ComplexValue#getFile <em>File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ComplexValue#getXPathValue <em>XPath Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ComplexValue#getJSONValue <em>JSON Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ComplexValue#getFIXValue <em>FIX Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ComplexValue#getCellValue <em>Cell Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ComplexValue#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ComplexValue#getCode <em>Code</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ComplexValue#getRunNumber <em>Run Number</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ComplexValue#getReference <em>Reference</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ComplexValue#isMemoize <em>Memoize</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue()
 * @model extendedMetaData="name='complexValue' kind='mixed'"
 * @generated
 */
public interface ComplexValue extends Describable
{
  /**
   * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mixed</em>' attribute list.
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue_Mixed()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='elementWildcard' name=':mixed'"
   * @generated
   */
  FeatureMap getMixed();

  /**
   * Returns the value of the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Null</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Null</em>' containment reference.
   * @see #setNull(Empty)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue_Null()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Null' namespace='##targetNamespace'"
   * @generated
   */
  Empty getNull();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.ComplexValue#getNull <em>Null</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Null</em>' containment reference.
   * @see #getNull()
   * @generated
   */
  void setNull(Empty value);

  /**
   * Returns the value of the '<em><b>Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute list.
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='group' name='group:3'"
   * @generated
   */
  FeatureMap getGroup();

  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.values.TextComplexValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference list.
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue_Text()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Text' namespace='##targetNamespace' group='#group:3'"
   * @generated
   */
  EList<TextComplexValue> getText();

  /**
   * Returns the value of the '<em><b>Env Var</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.values.FallibleComplexValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Env Var</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Env Var</em>' containment reference list.
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue_EnvVar()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='EnvVar' namespace='##targetNamespace' group='#group:3'"
   * @generated
   */
  EList<FallibleComplexValue> getEnvVar();

  /**
   * Returns the value of the '<em><b>File</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.values.FallibleComplexValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' containment reference list.
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue_File()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='File' namespace='##targetNamespace' group='#group:3'"
   * @generated
   */
  EList<FallibleComplexValue> getFile();

  /**
   * Returns the value of the '<em><b>XPath Value</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.values.XPathComplexValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XPath Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XPath Value</em>' containment reference list.
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue_XPathValue()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='XPathValue' namespace='##targetNamespace' group='#group:3'"
   * @generated
   */
  EList<XPathComplexValue> getXPathValue();

  /**
   * Returns the value of the '<em><b>JSON Value</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.values.JSONComplexValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>JSON Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>JSON Value</em>' containment reference list.
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue_JSONValue()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='JSONValue' namespace='##targetNamespace' group='#group:3'"
   * @generated
   */
  EList<JSONComplexValue> getJSONValue();

  /**
   * Returns the value of the '<em><b>FIX Value</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.values.FIXComplexValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>FIX Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>FIX Value</em>' containment reference list.
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue_FIXValue()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='FIXValue' namespace='##targetNamespace' group='#group:3'"
   * @generated
   */
  EList<FIXComplexValue> getFIXValue();

  /**
   * Returns the value of the '<em><b>Cell Value</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.values.CellComplexValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cell Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cell Value</em>' containment reference list.
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue_CellValue()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='CellValue' namespace='##targetNamespace' group='#group:3'"
   * @generated
   */
  EList<CellComplexValue> getCellValue();

  /**
   * Returns the value of the '<em><b>Property Value</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.values.PropertyComplexValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Value</em>' containment reference list.
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue_PropertyValue()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='PropertyValue' namespace='##targetNamespace' group='#group:3'"
   * @generated
   */
  EList<PropertyComplexValue> getPropertyValue();

  /**
   * Returns the value of the '<em><b>Code</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.values.CodeComplexValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' containment reference list.
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue_Code()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Code' namespace='##targetNamespace' group='#group:3'"
   * @generated
   */
  EList<CodeComplexValue> getCode();

  /**
   * Returns the value of the '<em><b>Run Number</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.values.RunNumberComplexValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Run Number</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Run Number</em>' containment reference list.
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue_RunNumber()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='RunNumber' namespace='##targetNamespace' group='#group:3'"
   * @generated
   */
  EList<RunNumberComplexValue> getRunNumber();

  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.values.ReferenceComplexValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference list.
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue_Reference()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace' group='#group:3'"
   * @generated
   */
  EList<ReferenceComplexValue> getReference();

  /**
   * Returns the value of the '<em><b>Memoize</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Memoize</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Memoize</em>' attribute.
   * @see #isSetMemoize()
   * @see #unsetMemoize()
   * @see #setMemoize(boolean)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getComplexValue_Memoize()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='memoize'"
   * @generated
   */
  boolean isMemoize();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.ComplexValue#isMemoize <em>Memoize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Memoize</em>' attribute.
   * @see #isSetMemoize()
   * @see #unsetMemoize()
   * @see #isMemoize()
   * @generated
   */
  void setMemoize(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.values.ComplexValue#isMemoize <em>Memoize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetMemoize()
   * @see #isMemoize()
   * @see #setMemoize(boolean)
   * @generated
   */
  void unsetMemoize();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.values.ComplexValue#isMemoize <em>Memoize</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Memoize</em>' attribute is set.
   * @see #unsetMemoize()
   * @see #isMemoize()
   * @see #setMemoize(boolean)
   * @generated
   */
  boolean isSetMemoize();

} // ComplexValue
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
