/**
 */
package com.ms.qaTools.saturn.kronus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.TypeDef#getVariance <em>Variance</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.TypeDef#getBoundsHi <em>Bounds Hi</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.TypeDef#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.TypeDef#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeDef()
 * @model
 * @generated
 */
public interface TypeDef extends NamedRuntimeDef
{
  /**
   * Returns the value of the '<em><b>Variance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variance</em>' attribute.
   * @see #setVariance(String)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeDef_Variance()
   * @model
   * @generated
   */
  String getVariance();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.TypeDef#getVariance <em>Variance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variance</em>' attribute.
   * @see #getVariance()
   * @generated
   */
  void setVariance(String value);

  /**
   * Returns the value of the '<em><b>Bounds Hi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bounds Hi</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bounds Hi</em>' containment reference.
   * @see #setBoundsHi(TypeInstance)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeDef_BoundsHi()
   * @model containment="true"
   * @generated
   */
  TypeInstance getBoundsHi();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.TypeDef#getBoundsHi <em>Bounds Hi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bounds Hi</em>' containment reference.
   * @see #getBoundsHi()
   * @generated
   */
  void setBoundsHi(TypeInstance value);

  /**
   * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.kronus.TypeDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Parameters</em>' containment reference list.
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeDef_TypeParameters()
   * @model containment="true"
   * @generated
   */
  EList<TypeDef> getTypeParameters();

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(TypeValue)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeDef_Value()
   * @model containment="true"
   * @generated
   */
  TypeValue getValue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.TypeDef#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(TypeValue value);

} // TypeDef
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
