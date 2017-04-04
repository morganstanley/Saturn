package com.ms.qaTools.saturn.modules.mqModule;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>MQ Put Action</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getInput <em>Input</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getInputType <em>Input Type</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getQueue <em>Queue</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isIsXml <em>Is Xml</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getPhonyElementName <em>Phony Element Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isOneMessage <em>One Message</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutAction()
 * @model extendedMetaData="name='PutAction' kind='elementOnly'"
 * @generated
 */
public interface MQPutAction extends EObject
{
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
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutAction_Input()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Input' namespace='##targetNamespace'"
   * @generated
   */
  ResourceDefinition getInput();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(ResourceDefinition value);

  /**
   * Returns the value of the '<em><b>Input Type</b></em>' attribute. The default value is <code>"TEXT"</code>. The
   * literals are from the enumeration {@link com.ms.qaTools.saturn.modules.mqModule.InputMessageType}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Type</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Input Type</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.mqModule.InputMessageType
   * @see #isSetInputType()
   * @see #unsetInputType()
   * @see #setInputType(InputMessageType)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutAction_InputType()
   * @model default="TEXT" unsettable="true"
   *        extendedMetaData="kind='element' name='InputType' namespace='##targetNamespace'"
   * @generated
   */
  InputMessageType getInputType();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getInputType <em>Input Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Type</em>' attribute.
   * @see com.ms.qaTools.saturn.modules.mqModule.InputMessageType
   * @see #isSetInputType()
   * @see #unsetInputType()
   * @see #getInputType()
   * @generated
   */
  void setInputType(InputMessageType value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getInputType <em>Input Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetInputType()
   * @see #getInputType()
   * @see #setInputType(InputMessageType)
   * @generated
   */
  void unsetInputType();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getInputType <em>Input Type</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Input Type</em>' attribute is set.
   * @see #unsetInputType()
   * @see #getInputType()
   * @see #setInputType(InputMessageType)
   * @generated
   */
  boolean isSetInputType();

  /**
   * Returns the value of the '<em><b>Queue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Queue</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Queue</em>' containment reference.
   * @see #setQueue(ComplexValue)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutAction_Queue()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Queue' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getQueue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getQueue <em>Queue</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Queue</em>' containment reference.
   * @see #getQueue()
   * @generated
   */
  void setQueue(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Delay</b></em>' attribute. The default value is <code>"0"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delay</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Delay</em>' attribute.
   * @see #isSetDelay()
   * @see #unsetDelay()
   * @see #setDelay(BigInteger)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutAction_Delay()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='delay'"
   * @generated
   */
  BigInteger getDelay();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getDelay <em>Delay</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay</em>' attribute.
   * @see #isSetDelay()
   * @see #unsetDelay()
   * @see #getDelay()
   * @generated
   */
  void setDelay(BigInteger value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getDelay <em>Delay</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDelay()
   * @see #getDelay()
   * @see #setDelay(BigInteger)
   * @generated
   */
  void unsetDelay();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getDelay <em>Delay</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Delay</em>' attribute is set.
   * @see #unsetDelay()
   * @see #getDelay()
   * @see #setDelay(BigInteger)
   * @generated
   */
  boolean isSetDelay();

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
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutAction_Enabled()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report colNum='1'"
   *        extendedMetaData="kind='attribute' name='enabled'"
   * @generated
   */
  boolean isEnabled();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @generated
   */
  void setEnabled(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  void unsetEnabled();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isEnabled <em>Enabled</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Enabled</em>' attribute is set.
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  boolean isSetEnabled();

  /**
   * Returns the value of the '<em><b>Is Xml</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Xml</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Is Xml</em>' attribute.
   * @see #isSetIsXml()
   * @see #unsetIsXml()
   * @see #setIsXml(boolean)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutAction_IsXml()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='isXml'"
   * @generated
   */
  boolean isIsXml();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isIsXml <em>Is Xml</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Xml</em>' attribute.
   * @see #isSetIsXml()
   * @see #unsetIsXml()
   * @see #isIsXml()
   * @generated
   */
  void setIsXml(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isIsXml <em>Is Xml</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIsXml()
   * @see #isIsXml()
   * @see #setIsXml(boolean)
   * @generated
   */
  void unsetIsXml();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isIsXml <em>Is Xml</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Is Xml</em>' attribute is set.
   * @see #unsetIsXml()
   * @see #isIsXml()
   * @see #setIsXml(boolean)
   * @generated
   */
  boolean isSetIsXml();

  /**
   * Returns the value of the '<em><b>One Message</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>One Message</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>One Message</em>' attribute.
   * @see #isSetOneMessage()
   * @see #unsetOneMessage()
   * @see #setOneMessage(boolean)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutAction_OneMessage()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib accessor='oneMsg'"
   *        extendedMetaData="kind='attribute' name='oneMessage'"
   * @generated
   */
  boolean isOneMessage();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isOneMessage <em>One Message</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>One Message</em>' attribute.
   * @see #isSetOneMessage()
   * @see #unsetOneMessage()
   * @see #isOneMessage()
   * @generated
   */
  void setOneMessage(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isOneMessage <em>One Message</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOneMessage()
   * @see #isOneMessage()
   * @see #setOneMessage(boolean)
   * @generated
   */
  void unsetOneMessage();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#isOneMessage <em>One Message</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>One Message</em>' attribute is set.
   * @see #unsetOneMessage()
   * @see #isOneMessage()
   * @see #setOneMessage(boolean)
   * @generated
   */
  boolean isSetOneMessage();

  /**
   * Returns the value of the '<em><b>Phony Element Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Phony Element Name</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Phony Element Name</em>' attribute.
   * @see #setPhonyElementName(String)
   * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getMQPutAction_PhonyElementName()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
   *        extendedMetaData="kind='attribute' name='phonyElementName'"
   * @generated
   */
  String getPhonyElementName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.modules.mqModule.MQPutAction#getPhonyElementName <em>Phony Element Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Phony Element Name</em>' attribute.
   * @see #getPhonyElementName()
   * @generated
   */
  void setPhonyElementName(String value);

} // MQPutAction
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
