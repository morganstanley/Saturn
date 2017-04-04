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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Abstract Repetition Handler</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler#getDefaultStatus <em>Default Status</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler#getStatusCondition <em>Status Condition</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.types.TypesPackage#getAbstractRepetitionHandler()
 * @model annotation="http://www.ms.com/2006/pdsttools/xsd2perl package='Saturn::Script::AbstractRepetitionHandler'"
 *        extendedMetaData="name='AbstractRepetitionHandler' kind='empty'"
 * @generated
 */
public interface AbstractRepetitionHandler extends EObject
{
  /**
   * Returns the value of the '<em><b>Default Status</b></em>' attribute.
   * The default value is <code>"FAIL"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.types.SaturnStatusEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Status</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Status</em>' attribute.
   * @see com.ms.qaTools.saturn.types.SaturnStatusEnum
   * @see #isSetDefaultStatus()
   * @see #unsetDefaultStatus()
   * @see #setDefaultStatus(SaturnStatusEnum)
   * @see com.ms.qaTools.saturn.types.TypesPackage#getAbstractRepetitionHandler_DefaultStatus()
   * @model default="FAIL" unsettable="true"
   *        extendedMetaData="kind='attribute' name='defaultStatus'"
   * @generated
   */
  SaturnStatusEnum getDefaultStatus();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler#getDefaultStatus <em>Default Status</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Status</em>' attribute.
   * @see com.ms.qaTools.saturn.types.SaturnStatusEnum
   * @see #isSetDefaultStatus()
   * @see #unsetDefaultStatus()
   * @see #getDefaultStatus()
   * @generated
   */
  void setDefaultStatus(SaturnStatusEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler#getDefaultStatus <em>Default Status</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDefaultStatus()
   * @see #getDefaultStatus()
   * @see #setDefaultStatus(SaturnStatusEnum)
   * @generated
   */
  void unsetDefaultStatus();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler#getDefaultStatus <em>Default Status</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Default Status</em>' attribute is set.
   * @see #unsetDefaultStatus()
   * @see #getDefaultStatus()
   * @see #setDefaultStatus(SaturnStatusEnum)
   * @generated
   */
  boolean isSetDefaultStatus();

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
   * @see com.ms.qaTools.saturn.types.TypesPackage#getAbstractRepetitionHandler_Enabled()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='enabled'"
   * @generated
   */
  boolean isEnabled();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @generated
   */
  void setEnabled(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  void unsetEnabled();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler#isEnabled <em>Enabled</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Enabled</em>' attribute is set.
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  boolean isSetEnabled();

  /**
   * Returns the value of the '<em><b>Status Condition</b></em>' attribute. The default value is <code>"ANY FAIL"</code>
   * . The literals are from the enumeration {@link com.ms.qaTools.saturn.types.SaturnStatusConditionEnum}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status Condition</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Status Condition</em>' attribute.
   * @see com.ms.qaTools.saturn.types.SaturnStatusConditionEnum
   * @see #isSetStatusCondition()
   * @see #unsetStatusCondition()
   * @see #setStatusCondition(SaturnStatusConditionEnum)
   * @see com.ms.qaTools.saturn.types.TypesPackage#getAbstractRepetitionHandler_StatusCondition()
   * @model default="ANY FAIL" unsettable="true" extendedMetaData="kind='attribute' name='statusCondition'"
   * @generated
   */
  SaturnStatusConditionEnum getStatusCondition();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler#getStatusCondition <em>Status Condition</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Status Condition</em>' attribute.
   * @see com.ms.qaTools.saturn.types.SaturnStatusConditionEnum
   * @see #isSetStatusCondition()
   * @see #unsetStatusCondition()
   * @see #getStatusCondition()
   * @generated
   */
  void setStatusCondition(SaturnStatusConditionEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler#getStatusCondition <em>Status Condition</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetStatusCondition()
   * @see #getStatusCondition()
   * @see #setStatusCondition(SaturnStatusConditionEnum)
   * @generated
   */
  void unsetStatusCondition();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.types.AbstractRepetitionHandler#getStatusCondition <em>Status Condition</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Status Condition</em>' attribute is set.
   * @see #unsetStatusCondition()
   * @see #getStatusCondition()
   * @see #setStatusCondition(SaturnStatusConditionEnum)
   * @generated
   */
  boolean isSetStatusCondition();

} // AbstractRepetitionHandler
