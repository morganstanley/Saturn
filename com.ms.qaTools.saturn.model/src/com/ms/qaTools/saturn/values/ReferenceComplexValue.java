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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Complex Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getIncludeFile <em>Include File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getTemplate <em>Template</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getRunGroup <em>Run Group</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getSaturnAttribute <em>Saturn Attribute</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getUserAttribute <em>User Attribute</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getModuleAttribute <em>Module Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.values.ValuesPackage#getReferenceComplexValue()
 * @model extendedMetaData="name='Reference_._type' kind='empty'"
 * @generated
 */
public interface ReferenceComplexValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Include File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include File</em>' attribute.
   * @see #setIncludeFile(String)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getReferenceComplexValue_IncludeFile()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='includeFile'"
   * @generated
   */
  String getIncludeFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getIncludeFile <em>Include File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Include File</em>' attribute.
   * @see #getIncludeFile()
   * @generated
   */
  void setIncludeFile(String value);

  /**
   * Returns the value of the '<em><b>Template</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template</em>' attribute.
   * @see #setTemplate(String)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getReferenceComplexValue_Template()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='template'"
   * @generated
   */
  String getTemplate();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getTemplate <em>Template</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template</em>' attribute.
   * @see #getTemplate()
   * @generated
   */
  void setTemplate(String value);

  /**
   * Returns the value of the '<em><b>Run Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Run Group</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Run Group</em>' attribute.
   * @see #setRunGroup(String)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getReferenceComplexValue_RunGroup()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='runGroup'"
   * @generated
   */
  String getRunGroup();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getRunGroup <em>Run Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Run Group</em>' attribute.
   * @see #getRunGroup()
   * @generated
   */
  void setRunGroup(String value);

  /**
   * Returns the value of the '<em><b>Saturn Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Saturn Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Saturn Attribute</em>' attribute.
   * @see #setSaturnAttribute(String)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getReferenceComplexValue_SaturnAttribute()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='saturnAttribute'"
   * @generated
   */
  String getSaturnAttribute();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getSaturnAttribute <em>Saturn Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Saturn Attribute</em>' attribute.
   * @see #getSaturnAttribute()
   * @generated
   */
  void setSaturnAttribute(String value);

  /**
   * Returns the value of the '<em><b>User Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Attribute</em>' attribute.
   * @see #setUserAttribute(String)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getReferenceComplexValue_UserAttribute()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='userAttribute'"
   * @generated
   */
  String getUserAttribute();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getUserAttribute <em>User Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User Attribute</em>' attribute.
   * @see #getUserAttribute()
   * @generated
   */
  void setUserAttribute(String value);

  /**
   * Returns the value of the '<em><b>Module Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module Attribute</em>' attribute.
   * @see #setModuleAttribute(String)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getReferenceComplexValue_ModuleAttribute()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='moduleAttribute'"
   * @generated
   */
  String getModuleAttribute();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.ReferenceComplexValue#getModuleAttribute <em>Module Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module Attribute</em>' attribute.
   * @see #getModuleAttribute()
   * @generated
   */
  void setModuleAttribute(String value);

} // ReferenceComplexValue
