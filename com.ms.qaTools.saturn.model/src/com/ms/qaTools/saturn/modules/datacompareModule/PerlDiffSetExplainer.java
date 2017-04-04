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
package com.ms.qaTools.saturn.modules.datacompareModule;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Perl Diff Set Explainer</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer#getInitCode <em>Init Code</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer#getDiffCode <em>Diff Code</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer#getDestroyCode <em>Destroy Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPerlDiffSetExplainer()
 * @model extendedMetaData="name='PerlDiffSetExplainer' kind='elementOnly'"
 * @generated
 */
public interface PerlDiffSetExplainer extends AbstractDiffSetExplainer
{
  /**
   * Returns the value of the '<em><b>Init Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Code</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Code</em>' containment reference.
   * @see #setInitCode(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPerlDiffSetExplainer_InitCode()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='InitCode' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getInitCode();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer#getInitCode <em>Init Code</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Code</em>' containment reference.
   * @see #getInitCode()
   * @generated
   */
  void setInitCode(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Diff Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Diff Code</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Diff Code</em>' containment reference.
   * @see #setDiffCode(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPerlDiffSetExplainer_DiffCode()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='DiffCode' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDiffCode();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer#getDiffCode <em>Diff Code</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Diff Code</em>' containment reference.
   * @see #getDiffCode()
   * @generated
   */
  void setDiffCode(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Destroy Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destroy Code</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destroy Code</em>' containment reference.
   * @see #setDestroyCode(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage#getPerlDiffSetExplainer_DestroyCode()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='DestroyCode' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDestroyCode();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer#getDestroyCode <em>Destroy Code</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Destroy Code</em>' containment reference.
   * @see #getDestroyCode()
   * @generated
   */
  void setDestroyCode(ComplexValue value);

} // PerlDiffSetExplainer
