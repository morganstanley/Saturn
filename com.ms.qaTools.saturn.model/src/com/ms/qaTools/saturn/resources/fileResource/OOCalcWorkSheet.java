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
package com.ms.qaTools.saturn.resources.fileResource;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>OO Calc Work Sheet</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet#getWorkSheet <em>Work Sheet</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet#getNullMarker <em>Null Marker</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet#isHasNulls <em>Has Nulls</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getOOCalcWorkSheet()
 * @model annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib name='ooCalcWS'"
 *        extendedMetaData="name='OOCalcWorkSheet' kind='elementOnly'"
 * @generated
 */
public interface OOCalcWorkSheet extends DataSetFile
{
  /**
   * Returns the value of the '<em><b>Work Sheet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Sheet</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Sheet</em>' containment reference.
   * @see #setWorkSheet(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getOOCalcWorkSheet_WorkSheet()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='WorkSheet' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getWorkSheet();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet#getWorkSheet <em>Work Sheet</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Work Sheet</em>' containment reference.
   * @see #getWorkSheet()
   * @generated
   */
  void setWorkSheet(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Null Marker</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Null Marker</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Null Marker</em>' containment reference.
   * @see #setNullMarker(ComplexValue)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getOOCalcWorkSheet_NullMarker()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='NullMarker' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getNullMarker();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet#getNullMarker <em>Null Marker</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Null Marker</em>' containment reference.
   * @see #getNullMarker()
   * @generated
   */
  void setNullMarker(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Has Nulls</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Nulls</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Has Nulls</em>' attribute.
   * @see #isSetHasNulls()
   * @see #unsetHasNulls()
   * @see #setHasNulls(boolean)
   * @see com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage#getOOCalcWorkSheet_HasNulls()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='hasNulls'"
   * @generated
   */
  boolean isHasNulls();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet#isHasNulls <em>Has Nulls</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Nulls</em>' attribute.
   * @see #isSetHasNulls()
   * @see #unsetHasNulls()
   * @see #isHasNulls()
   * @generated
   */
  void setHasNulls(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet#isHasNulls <em>Has Nulls</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetHasNulls()
   * @see #isHasNulls()
   * @see #setHasNulls(boolean)
   * @generated
   */
  void unsetHasNulls();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.fileResource.OOCalcWorkSheet#isHasNulls <em>Has Nulls</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Has Nulls</em>' attribute is set.
   * @see #unsetHasNulls()
   * @see #isHasNulls()
   * @see #setHasNulls(boolean)
   * @generated
   */
  boolean isSetHasNulls();

} // OOCalcWorkSheet
