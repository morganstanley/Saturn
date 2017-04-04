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
package com.ms.qaTools.saturn.modules.mqModule;

import java.math.BigInteger;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Wait Comparison</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getDepth <em>Depth</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#isCheckTotal <em>Check Total</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getWaitComparison()
 * @model extendedMetaData="name='Comparison_._type' kind='mixed'"
 * @generated
 */
public interface WaitComparison extends ComplexValue
{
  /**
   * Returns the value of the '<em><b>Check Total</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Check Total</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Check Total</em>' attribute.
   * @see #isSetCheckTotal()
   * @see #unsetCheckTotal()
   * @see #setCheckTotal(boolean)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getWaitComparison_CheckTotal()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='checkTotal'"
   * @generated
   */
  boolean isCheckTotal();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#isCheckTotal <em>Check Total</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Check Total</em>' attribute.
   * @see #isSetCheckTotal()
   * @see #unsetCheckTotal()
   * @see #isCheckTotal()
   * @generated
   */
  void setCheckTotal(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#isCheckTotal <em>Check Total</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCheckTotal()
   * @see #isCheckTotal()
   * @see #setCheckTotal(boolean)
   * @generated
   */
  void unsetCheckTotal();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#isCheckTotal <em>Check Total</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Check Total</em>' attribute is set.
   * @see #unsetCheckTotal()
   * @see #isCheckTotal()
   * @see #setCheckTotal(boolean)
   * @generated
   */
  boolean isSetCheckTotal();

  /**
   * Returns the value of the '<em><b>Depth</b></em>' attribute. The default value is <code>"0"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Depth</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Depth</em>' attribute.
   * @see #isSetDepth()
   * @see #unsetDepth()
   * @see #setDepth(BigInteger)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getWaitComparison_Depth()
   * @model default="0" unsettable="true" dataType="com.ms.qaTools.saturn.modules.mqModule.WaitDepth"
   *        extendedMetaData="kind='attribute' name='depth'"
   * @generated
   */
  BigInteger getDepth();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getDepth <em>Depth</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Depth</em>' attribute.
   * @see #isSetDepth()
   * @see #unsetDepth()
   * @see #getDepth()
   * @generated
   */
  void setDepth(BigInteger value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getDepth <em>Depth</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDepth()
   * @see #getDepth()
   * @see #setDepth(BigInteger)
   * @generated
   */
  void unsetDepth();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getDepth <em>Depth</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Depth</em>' attribute is set.
   * @see #unsetDepth()
   * @see #getDepth()
   * @see #setDepth(BigInteger)
   * @generated
   */
  boolean isSetDepth();

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The default value is <code>"=="</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.modules.mqModule.WaitOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.mqModule.WaitOperator
   * @see #isSetOperator()
   * @see #unsetOperator()
   * @see #setOperator(WaitOperator)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getWaitComparison_Operator()
   * @model default="==" unsettable="true"
   *        extendedMetaData="kind='attribute' name='operator'"
   * @generated
   */
  WaitOperator getOperator();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.mqModule.WaitOperator
   * @see #isSetOperator()
   * @see #unsetOperator()
   * @see #getOperator()
   * @generated
   */
  void setOperator(WaitOperator value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOperator()
   * @see #getOperator()
   * @see #setOperator(WaitOperator)
   * @generated
   */
  void unsetOperator();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getOperator <em>Operator</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Operator</em>' attribute is set.
   * @see #unsetOperator()
   * @see #getOperator()
   * @see #setOperator(WaitOperator)
   * @generated
   */
  boolean isSetOperator();

  /**
   * Returns the value of the '<em><b>Timeout</b></em>' attribute. The default value is <code>"0"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timeout</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Timeout</em>' attribute.
   * @see #isSetTimeout()
   * @see #unsetTimeout()
   * @see #setTimeout(BigInteger)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getWaitComparison_Timeout()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='timeout'"
   * @generated
   */
  BigInteger getTimeout();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getTimeout <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeout</em>' attribute.
   * @see #isSetTimeout()
   * @see #unsetTimeout()
   * @see #getTimeout()
   * @generated
   */
  void setTimeout(BigInteger value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getTimeout <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetTimeout()
   * @see #getTimeout()
   * @see #setTimeout(BigInteger)
   * @generated
   */
  void unsetTimeout();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.WaitComparison#getTimeout <em>Timeout</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Timeout</em>' attribute is set.
   * @see #unsetTimeout()
   * @see #getTimeout()
   * @see #setTimeout(BigInteger)
   * @generated
   */
  boolean isSetTimeout();

} // WaitComparison
