package com.ms.qaTools.saturn.types;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Column</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.types.Column#getName <em>Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.Column#getType <em>Type</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.Column#getKeyOrder <em>Key Order</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.Column#isIgnored <em>Ignored</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.Column#getTrim <em>Trim</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.types.TypesPackage#getColumn()
 * @model extendedMetaData="name='Column' kind='empty'"
 * @generated
 */
public interface Column extends EObject
{
  /**
   * Returns the value of the '<em><b>Ignored</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignored</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Ignored</em>' attribute.
   * @see #isSetIgnored()
   * @see #unsetIgnored()
   * @see #setIgnored(boolean)
   * @see com.ms.qaTools.saturn.types.TypesPackage#getColumn_Ignored()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report colNum='10'"
   *        extendedMetaData="kind='attribute' name='ignored'"
   * @generated
   */
  boolean isIgnored();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.Column#isIgnored <em>Ignored</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Ignored</em>' attribute.
   * @see #isSetIgnored()
   * @see #unsetIgnored()
   * @see #isIgnored()
   * @generated
   */
  void setIgnored(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.types.Column#isIgnored <em>Ignored</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetIgnored()
   * @see #isIgnored()
   * @see #setIgnored(boolean)
   * @generated
   */
  void unsetIgnored();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.types.Column#isIgnored <em>Ignored</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Ignored</em>' attribute is set.
   * @see #unsetIgnored()
   * @see #isIgnored()
   * @see #setIgnored(boolean)
   * @generated
   */
  boolean isSetIgnored();

  /**
   * Returns the value of the '<em><b>Key Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Order</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Order</em>' attribute.
   * @see #setKeyOrder(BigInteger)
   * @see com.ms.qaTools.saturn.types.TypesPackage#getColumn_KeyOrder()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report colNum='2'"
   *        extendedMetaData="kind='attribute' name='keyOrder'"
   * @generated
   */
  BigInteger getKeyOrder();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.Column#getKeyOrder <em>Key Order</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Key Order</em>' attribute.
   * @see #getKeyOrder()
   * @generated
   */
  void setKeyOrder(BigInteger value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.ms.qaTools.saturn.types.TypesPackage#getColumn_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report colNum='1'"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib order='1'"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.Column#getName <em>Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Trim</b></em>' attribute.
   * The default value is <code>"TRIM_NONE"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.types.ColumnTrimEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trim</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trim</em>' attribute.
   * @see com.ms.qaTools.saturn.types.ColumnTrimEnum
   * @see #isSetTrim()
   * @see #unsetTrim()
   * @see #setTrim(ColumnTrimEnum)
   * @see com.ms.qaTools.saturn.types.TypesPackage#getColumn_Trim()
   * @model default="TRIM_NONE" unsettable="true"
   *        extendedMetaData="kind='attribute' name='trim'"
   * @generated
   */
  ColumnTrimEnum getTrim();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.Column#getTrim <em>Trim</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Trim</em>' attribute.
   * @see com.ms.qaTools.saturn.types.ColumnTrimEnum
   * @see #isSetTrim()
   * @see #unsetTrim()
   * @see #getTrim()
   * @generated
   */
  void setTrim(ColumnTrimEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.types.Column#getTrim <em>Trim</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetTrim()
   * @see #getTrim()
   * @see #setTrim(ColumnTrimEnum)
   * @generated
   */
  void unsetTrim();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.types.Column#getTrim <em>Trim</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Trim</em>' attribute is set.
   * @see #unsetTrim()
   * @see #getTrim()
   * @see #setTrim(ColumnTrimEnum)
   * @generated
   */
  boolean isSetTrim();

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The default value is <code>"STRING"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.types.ColumnTypeEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.ms.qaTools.saturn.types.ColumnTypeEnum
   * @see #isSetType()
   * @see #unsetType()
   * @see #setType(ColumnTypeEnum)
   * @see com.ms.qaTools.saturn.types.TypesPackage#getColumn_Type()
   * @model default="STRING" unsettable="true"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report colNum='3'"
   *        extendedMetaData="kind='attribute' name='type'"
   * @generated
   */
  ColumnTypeEnum getType();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.Column#getType <em>Type</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Type</em>' attribute.
   * @see com.ms.qaTools.saturn.types.ColumnTypeEnum
   * @see #isSetType()
   * @see #unsetType()
   * @see #getType()
   * @generated
   */
  void setType(ColumnTypeEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.types.Column#getType <em>Type</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetType()
   * @see #getType()
   * @see #setType(ColumnTypeEnum)
   * @generated
   */
  void unsetType();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.types.Column#getType <em>Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Type</em>' attribute is set.
   * @see #unsetType()
   * @see #getType()
   * @see #setType(ColumnTypeEnum)
   * @generated
   */
  boolean isSetType();

} // Column
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
