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
 * A representation of the model object '<em><b>Fallible</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.values.Fallible#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.Fallible#getFailBehavior <em>Fail Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.values.ValuesPackage#getFallible()
 * @model interface="true" abstract="true"
 *        extendedMetaData="name='Fallible' kind='elementOnly'"
 * @generated
 */
public interface Fallible extends EObject
{
  /**
   * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' containment reference.
   * @see #setDefaultValue(ComplexValue)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getFallible_DefaultValue()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='DefaultValue' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDefaultValue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.Fallible#getDefaultValue <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' containment reference.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Fail Behavior</b></em>' attribute.
   * The default value is <code>"IGNORE"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.values.FailBehaviorsEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fail Behavior</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fail Behavior</em>' attribute.
   * @see com.ms.qaTools.saturn.values.FailBehaviorsEnum
   * @see #isSetFailBehavior()
   * @see #unsetFailBehavior()
   * @see #setFailBehavior(FailBehaviorsEnum)
   * @see com.ms.qaTools.saturn.values.ValuesPackage#getFallible_FailBehavior()
   * @model default="IGNORE" unsettable="true"
   *        extendedMetaData="kind='attribute' name='failBehavior'"
   * @generated
   */
  FailBehaviorsEnum getFailBehavior();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.values.Fallible#getFailBehavior <em>Fail Behavior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fail Behavior</em>' attribute.
   * @see com.ms.qaTools.saturn.values.FailBehaviorsEnum
   * @see #isSetFailBehavior()
   * @see #unsetFailBehavior()
   * @see #getFailBehavior()
   * @generated
   */
  void setFailBehavior(FailBehaviorsEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.values.Fallible#getFailBehavior <em>Fail Behavior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetFailBehavior()
   * @see #getFailBehavior()
   * @see #setFailBehavior(FailBehaviorsEnum)
   * @generated
   */
  void unsetFailBehavior();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.values.Fallible#getFailBehavior <em>Fail Behavior</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Fail Behavior</em>' attribute is set.
   * @see #unsetFailBehavior()
   * @see #getFailBehavior()
   * @see #setFailBehavior(FailBehaviorsEnum)
   * @generated
   */
  boolean isSetFailBehavior();

} // Fallible
