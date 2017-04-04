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

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Data Set Resource Definition</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.types.DataSetResourceDefinition#getDeviceResource <em>Device Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.DataSetResourceDefinition#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.DataSetResourceDefinition#isHasColNames <em>Has Col Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.types.TypesPackage#getDataSetResourceDefinition()
 * @model abstract="true"
 *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib name='dataSetResource'"
 *        extendedMetaData="name='DataSetResourceDefinition' kind='elementOnly'"
 * @generated
 */
public interface DataSetResourceDefinition extends NamedResourceDefinition
{
  /**
   * Returns the value of the '<em><b>Device Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device Resource</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Resource</em>' containment reference.
   * @see #setDeviceResource(ResourceDefinition)
   * @see com.ms.qaTools.saturn.types.TypesPackage#getDataSetResourceDefinition_DeviceResource()
   * @model containment="true"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib dontSerialize='true'"
   *        extendedMetaData="kind='element' name='DeviceResource' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getDeviceResource();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.DataSetResourceDefinition#getDeviceResource <em>Device Resource</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Device Resource</em>' containment reference.
   * @see #getDeviceResource()
   * @generated
   */
  void setDeviceResource(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Data Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Set</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Set</em>' containment reference.
   * @see #setDataSet(DataSet)
   * @see com.ms.qaTools.saturn.types.TypesPackage#getDataSetResourceDefinition_DataSet()
   * @model containment="true"
   *        annotation="http://www.ms.com/2006/pdsttools/xsd2perl init='true'"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib include='true'"
   *        extendedMetaData="kind='element' name='DataSet' namespace='##targetNamespace'"
   * @generated
   */
  DataSet getDataSet();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.DataSetResourceDefinition#getDataSet <em>Data Set</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Set</em>' containment reference.
   * @see #getDataSet()
   * @generated
   */
  void setDataSet(DataSet value);

  /**
   * Returns the value of the '<em><b>Has Col Names</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Col Names</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Has Col Names</em>' attribute.
   * @see #isSetHasColNames()
   * @see #unsetHasColNames()
   * @see #setHasColNames(boolean)
   * @see com.ms.qaTools.saturn.types.TypesPackage#getDataSetResourceDefinition_HasColNames()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='hasColNames'"
   * @generated
   */
  boolean isHasColNames();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.DataSetResourceDefinition#isHasColNames <em>Has Col Names</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Col Names</em>' attribute.
   * @see #isSetHasColNames()
   * @see #unsetHasColNames()
   * @see #isHasColNames()
   * @generated
   */
  void setHasColNames(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.types.DataSetResourceDefinition#isHasColNames <em>Has Col Names</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetHasColNames()
   * @see #isHasColNames()
   * @see #setHasColNames(boolean)
   * @generated
   */
  void unsetHasColNames();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.types.DataSetResourceDefinition#isHasColNames <em>Has Col Names</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Has Col Names</em>' attribute is set.
   * @see #unsetHasColNames()
   * @see #isHasColNames()
   * @see #setHasColNames(boolean)
   * @generated
   */
  boolean isSetHasColNames();

} // DataSetResourceDefinition
