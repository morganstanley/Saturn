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
package com.ms.qaTools.saturn.types;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Data Set</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.types.DataSet#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.DataSet#getName <em>Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.DataSet#getTrimAll <em>Trim All</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.DataSet#isTrimColNames <em>Trim Col Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.types.TypesPackage#getDataSet()
 * @model annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib name='dataSetConfig'"
 *        extendedMetaData="name='DataSet' kind='elementOnly'"
 * @generated
 */
public interface DataSet extends EObject
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.types.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see com.ms.qaTools.saturn.types.TypesPackage#getDataSet_Columns()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Columns' namespace='##targetNamespace'"
   * @generated
   */
  EList<Column> getColumns();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.ms.qaTools.saturn.types.TypesPackage#getDataSet_Name()
   * @model dataType="com.ms.qaTools.saturn.types.ObjectName"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib order='1'"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.DataSet#getName <em>Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Trim All</b></em>' attribute.
   * The default value is <code>"TRIM_NONE"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.types.ColumnTrimEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trim All</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trim All</em>' attribute.
   * @see com.ms.qaTools.saturn.types.ColumnTrimEnum
   * @see #isSetTrimAll()
   * @see #unsetTrimAll()
   * @see #setTrimAll(ColumnTrimEnum)
   * @see com.ms.qaTools.saturn.types.TypesPackage#getDataSet_TrimAll()
   * @model default="TRIM_NONE" unsettable="true"
   *        extendedMetaData="kind='attribute' name='trimAll'"
   * @generated
   */
  ColumnTrimEnum getTrimAll();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.DataSet#getTrimAll <em>Trim All</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Trim All</em>' attribute.
   * @see com.ms.qaTools.saturn.types.ColumnTrimEnum
   * @see #isSetTrimAll()
   * @see #unsetTrimAll()
   * @see #getTrimAll()
   * @generated
   */
  void setTrimAll(ColumnTrimEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.types.DataSet#getTrimAll <em>Trim All</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetTrimAll()
   * @see #getTrimAll()
   * @see #setTrimAll(ColumnTrimEnum)
   * @generated
   */
  void unsetTrimAll();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.types.DataSet#getTrimAll <em>Trim All</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Trim All</em>' attribute is set.
   * @see #unsetTrimAll()
   * @see #getTrimAll()
   * @see #setTrimAll(ColumnTrimEnum)
   * @generated
   */
  boolean isSetTrimAll();

  /**
   * Returns the value of the '<em><b>Trim Col Names</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trim Col Names</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Trim Col Names</em>' attribute.
   * @see #isSetTrimColNames()
   * @see #unsetTrimColNames()
   * @see #setTrimColNames(boolean)
   * @see com.ms.qaTools.saturn.types.TypesPackage#getDataSet_TrimColNames()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='trimColNames'"
   * @generated
   */
  boolean isTrimColNames();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.DataSet#isTrimColNames <em>Trim Col Names</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Trim Col Names</em>' attribute.
   * @see #isSetTrimColNames()
   * @see #unsetTrimColNames()
   * @see #isTrimColNames()
   * @generated
   */
  void setTrimColNames(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.types.DataSet#isTrimColNames <em>Trim Col Names</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetTrimColNames()
   * @see #isTrimColNames()
   * @see #setTrimColNames(boolean)
   * @generated
   */
  void unsetTrimColNames();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.types.DataSet#isTrimColNames <em>Trim Col Names</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Trim Col Names</em>' attribute is set.
   * @see #unsetTrimColNames()
   * @see #isTrimColNames()
   * @see #setTrimColNames(boolean)
   * @generated
   */
  boolean isSetTrimColNames();

} // DataSet
