package com.ms.qaTools.saturn.modules.xmlManipModule;

import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Register Function Operation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getFunction <em>Function</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getPackage <em>Package</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getSubName <em>Sub Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getRegisterFunctionOperation()
 * @model extendedMetaData="name='RegisterFunctionOperation' kind='elementOnly'"
 * @generated
 */
public interface RegisterFunctionOperation extends AbstractOperation
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getRegisterFunctionOperation_Function()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Function' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getFunction();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' containment reference.
   * @see #setPackage(NamedResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getRegisterFunctionOperation_Package()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Package' namespace='##targetNamespace'"
   * @generated
   */
  NamedResourceDefinition getPackage();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getPackage <em>Package</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' containment reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(NamedResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Sub Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Name</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Name</em>' containment reference.
   * @see #setSubName(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getRegisterFunctionOperation_SubName()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='SubName' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getSubName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getSubName <em>Sub Name</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Name</em>' containment reference.
   * @see #getSubName()
   * @generated
   */
  void setSubName(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' containment reference.
   * @see #setUri(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage#getRegisterFunctionOperation_Uri()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Uri' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getUri();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation#getUri <em>Uri</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' containment reference.
   * @see #getUri()
   * @generated
   */
  void setUri(ComplexValue value);

} // RegisterFunctionOperation
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
