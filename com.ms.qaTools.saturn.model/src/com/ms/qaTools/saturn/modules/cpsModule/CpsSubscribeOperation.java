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
package com.ms.qaTools.saturn.modules.cpsModule;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Cps Subscribe Operation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation#getTopic <em>Topic</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation#getFilter <em>Filter</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation#isSowInit <em>Sow Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.cpsModule.CpsModulePackage#getCpsSubscribeOperation()
 * @model extendedMetaData="name='CpsSubscribeOperation' kind='elementOnly'"
 * @generated
 */
public interface CpsSubscribeOperation extends AbstractCpsOperation
{
  /**
   * Returns the value of the '<em><b>Topic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Topic</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Topic</em>' containment reference.
   * @see #setTopic(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsModulePackage#getCpsSubscribeOperation_Topic()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Topic' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getTopic();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation#getTopic <em>Topic</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Topic</em>' containment reference.
   * @see #getTopic()
   * @generated
   */
  void setTopic(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsModulePackage#getCpsSubscribeOperation_Filter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Filter' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getFilter();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Sow Init</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sow Init</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sow Init</em>' attribute.
   * @see #isSetSowInit()
   * @see #unsetSowInit()
   * @see #setSowInit(boolean)
   * @see com.ms.qaTools.saturn.modules.cpsModule.CpsModulePackage#getCpsSubscribeOperation_SowInit()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='sowInit'"
   * @generated
   */
  boolean isSowInit();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation#isSowInit <em>Sow Init</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Sow Init</em>' attribute.
   * @see #isSetSowInit()
   * @see #unsetSowInit()
   * @see #isSowInit()
   * @generated
   */
  void setSowInit(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation#isSowInit <em>Sow Init</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetSowInit()
   * @see #isSowInit()
   * @see #setSowInit(boolean)
   * @generated
   */
  void unsetSowInit();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation#isSowInit <em>Sow Init</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Sow Init</em>' attribute is set.
   * @see #unsetSowInit()
   * @see #isSowInit()
   * @see #setSowInit(boolean)
   * @generated
   */
  boolean isSetSowInit();

} // CpsSubscribeOperation
