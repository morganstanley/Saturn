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

import com.ms.qaTools.saturn.types.NamedResourceDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FIX Complex Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.values.FIXComplexValue#getResource <em>Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.FIXComplexValue#getFIXPath <em>FIX Path</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.FIXComplexValue#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.FIXComplexValue#getRow <em>Row</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.FIXComplexValue#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.values.ValuesPackage#getFIXComplexValue()
 * @model extendedMetaData="name='FIXValue_._type' kind='elementOnly'"
 * @generated
 */
public interface FIXComplexValue extends Fallible, Describable
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
   * @see #setResource(NamedResourceDefinition)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getFIXComplexValue_Resource()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Resource' namespace='##targetNamespace'"
   * @generated
   */
  NamedResourceDefinition getResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.FIXComplexValue#getResource <em>Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' containment reference.
   * @see #getResource()
   * @generated
   */
  void setResource(NamedResourceDefinition value);

  /**
   * Returns the value of the '<em><b>FIX Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>FIX Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>FIX Path</em>' containment reference.
   * @see #setFIXPath(ComplexValue)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getFIXComplexValue_FIXPath()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='FIXPath' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getFIXPath();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.FIXComplexValue#getFIXPath <em>FIX Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>FIX Path</em>' containment reference.
   * @see #getFIXPath()
   * @generated
   */
  void setFIXPath(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Message Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message Type</em>' containment reference.
   * @see #setMessageType(ComplexValue)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getFIXComplexValue_MessageType()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='MessageType' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getMessageType();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.FIXComplexValue#getMessageType <em>Message Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message Type</em>' containment reference.
   * @see #getMessageType()
   * @generated
   */
  void setMessageType(ComplexValue value);

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
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getFIXComplexValue_Row()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Row' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getRow();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.FIXComplexValue#getRow <em>Row</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Row</em>' containment reference.
   * @see #getRow()
   * @generated
   */
  void setRow(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' attribute.
   * The default value is <code>"STRING"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.values.XPathReturnTypeEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' attribute.
   * @see com.ms.qaTools.saturn.values.XPathReturnTypeEnum
   * @see #isSetReturnType()
   * @see #unsetReturnType()
   * @see #setReturnType(XPathReturnTypeEnum)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getFIXComplexValue_ReturnType()
   * @model default="STRING" unsettable="true"
   *        extendedMetaData="kind='attribute' name='returnType'"
   * @generated
   */
  XPathReturnTypeEnum getReturnType();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.FIXComplexValue#getReturnType <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' attribute.
   * @see com.ms.qaTools.saturn.values.XPathReturnTypeEnum
   * @see #isSetReturnType()
   * @see #unsetReturnType()
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(XPathReturnTypeEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.values.FIXComplexValue#getReturnType <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetReturnType()
   * @see #getReturnType()
   * @see #setReturnType(XPathReturnTypeEnum)
   * @generated
   */
  void unsetReturnType();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.values.FIXComplexValue#getReturnType <em>Return Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Return Type</em>' attribute is set.
   * @see #unsetReturnType()
   * @see #getReturnType()
   * @see #setReturnType(XPathReturnTypeEnum)
   * @generated
   */
  boolean isSetReturnType();

} // FIXComplexValue
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
