package com.ms.qaTools.saturn.modules.soapIOModule;

import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Soap IO Put Operation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getAction <em>Action</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getInput <em>Input</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getMessage <em>Message</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getMessageFile <em>Message File</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage#getSoapIOPutOperation()
 * @model extendedMetaData="name='SoapIOPutOperation' kind='elementOnly'"
 * @generated
 */
public interface SoapIOPutOperation extends AbstractSoapIOOperation
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage#getSoapIOPutOperation_Action()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Action' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getAction();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace</em>' containment reference.
   * @see #setNamespace(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage#getSoapIOPutOperation_Namespace()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Namespace' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getNamespace();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getNamespace <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' containment reference.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage#getSoapIOPutOperation_Input()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Input' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getInput();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' containment reference.
   * @see #setMessage(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage#getSoapIOPutOperation_Message()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Message' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getMessage();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getMessage <em>Message</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' containment reference.
   * @see #getMessage()
   * @generated
   */
  void setMessage(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Message File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message File</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message File</em>' containment reference.
   * @see #setMessageFile(ResourceDefinition)
   * @see com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage#getSoapIOPutOperation_MessageFile()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='MessageFile' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getMessageFile();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation#getMessageFile <em>Message File</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Message File</em>' containment reference.
   * @see #getMessageFile()
   * @generated
   */
  void setMessageFile(ResourceDefinition value);

} // SoapIOPutOperation
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
