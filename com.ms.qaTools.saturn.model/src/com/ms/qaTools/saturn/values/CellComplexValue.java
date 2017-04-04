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

import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Complex Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.values.CellComplexValue#getResource <em>Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.CellComplexValue#getRow <em>Row</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.CellComplexValue#getColumn <em>Column</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.CellComplexValue#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.CellComplexValue#isMemoize <em>Memoize</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.values.ValuesPackage#getCellComplexValue()
 * @model extendedMetaData="name='CellValue_._type' kind='elementOnly'"
 * @generated
 */
public interface CellComplexValue extends Fallible, Describable
{
  /**
   * Returns the value of the '<em><b>Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' containment reference.
   * @see #setResource(ResourceDefinition)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getCellComplexValue_Resource()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Resource' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.CellComplexValue#getResource <em>Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' containment reference.
   * @see #getResource()
   * @generated
   */
  void setResource(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Row</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Row</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Row</em>' containment reference.
   * @see #setRow(ComplexValue)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getCellComplexValue_Row()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Row' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getRow();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.CellComplexValue#getRow <em>Row</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Row</em>' containment reference.
   * @see #getRow()
   * @generated
   */
  void setRow(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' containment reference.
   * @see #setColumn(ComplexValue)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getCellComplexValue_Column()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Column' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getColumn();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.CellComplexValue#getColumn <em>Column</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' containment reference.
   * @see #getColumn()
   * @generated
   */
  void setColumn(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Column Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Name</em>' containment reference.
   * @see #setColumnName(ComplexValue)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getCellComplexValue_ColumnName()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ColumnName' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getColumnName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.CellComplexValue#getColumnName <em>Column Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Name</em>' containment reference.
   * @see #getColumnName()
   * @generated
   */
  void setColumnName(ComplexValue value);

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
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getCellComplexValue_Memoize()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='memoize'"
   * @generated
   */
  boolean isMemoize();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.CellComplexValue#isMemoize <em>Memoize</em>}' attribute.
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
   * Unsets the value of the '{@link com.ms.qaTools.saturn.values.CellComplexValue#isMemoize <em>Memoize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetMemoize()
   * @see #isMemoize()
   * @see #setMemoize(boolean)
   * @generated
   */
  void unsetMemoize();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.values.CellComplexValue#isMemoize <em>Memoize</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Memoize</em>' attribute is set.
   * @see #unsetMemoize()
   * @see #isMemoize()
   * @see #setMemoize(boolean)
   * @generated
   */
  boolean isSetMemoize();

} // CellComplexValue
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
