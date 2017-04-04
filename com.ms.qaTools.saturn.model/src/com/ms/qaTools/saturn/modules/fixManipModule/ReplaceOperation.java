package com.ms.qaTools.saturn.modules.fixManipModule;

import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Replace Operation</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.fixManipModule.ReplaceOperation#getTag <em>Tag</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.fixManipModule.ReplaceOperation#getOldValue <em>Old Value</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.fixManipModule.ReplaceOperation#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.modules.fixManipModule.FixManipModulePackage#getReplaceOperation()
 * @model extendedMetaData="name='ReplaceOperation' kind='elementOnly'"
 * @generated
 */
public interface ReplaceOperation extends AbstractOperation
{
  /**
   * Returns the value of the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' containment reference.
   * @see #setTag(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.fixManipModule.FixManipModulePackage#getReplaceOperation_Tag()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Tag' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getTag();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.fixManipModule.ReplaceOperation#getTag <em>Tag</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag</em>' containment reference.
   * @see #getTag()
   * @generated
   */
  void setTag(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Old Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Old Value</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Old Value</em>' containment reference.
   * @see #setOldValue(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.fixManipModule.FixManipModulePackage#getReplaceOperation_OldValue()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='OldValue' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getOldValue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.fixManipModule.ReplaceOperation#getOldValue <em>Old Value</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Old Value</em>' containment reference.
   * @see #getOldValue()
   * @generated
   */
  void setOldValue(ComplexValue value);

  /**
   * Returns the value of the '<em><b>New Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Value</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Value</em>' containment reference.
   * @see #setNewValue(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.fixManipModule.FixManipModulePackage#getReplaceOperation_NewValue()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='NewValue' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getNewValue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.fixManipModule.ReplaceOperation#getNewValue <em>New Value</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>New Value</em>' containment reference.
   * @see #getNewValue()
   * @generated
   */
  void setNewValue(ComplexValue value);

} // ReplaceOperation
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
