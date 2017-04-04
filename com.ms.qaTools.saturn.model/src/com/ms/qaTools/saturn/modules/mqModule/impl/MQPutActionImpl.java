package com.ms.qaTools.saturn.modules.mqModule.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.modules.mqModule.InputMessageType;
import com.ms.qaTools.saturn.modules.mqModule.MQPutAction;
import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>MQ Put Action</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutActionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutActionImpl#getInputType <em>Input Type</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutActionImpl#getQueue <em>Queue</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutActionImpl#isIsXml <em>Is Xml</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutActionImpl#getPhonyElementName <em>Phony Element Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutActionImpl#isOneMessage <em>One Message</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutActionImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutActionImpl#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MQPutActionImpl extends EObjectImpl implements MQPutAction
{
  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected ResourceDefinition            input;

  /**
   * The default value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getInputType()
   * @generated
   * @ordered
   */
  protected static final InputMessageType INPUT_TYPE_EDEFAULT         = InputMessageType.TEXT;

  /**
   * The cached value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getInputType()
   * @generated
   * @ordered
   */
  protected InputMessageType              inputType                   = INPUT_TYPE_EDEFAULT;

  /**
   * This is true if the Input Type attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                       inputTypeESet;

  /**
   * The cached value of the '{@link #getQueue() <em>Queue</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getQueue()
   * @generated
   * @ordered
   */
  protected ComplexValue                  queue;

  /**
   * The default value of the '{@link #isIsXml() <em>Is Xml</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isIsXml()
   * @generated
   * @ordered
   */
  protected static final boolean          IS_XML_EDEFAULT             = false;

  /**
   * The cached value of the '{@link #isIsXml() <em>Is Xml</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isIsXml()
   * @generated
   * @ordered
   */
  protected boolean                       isXml                       = IS_XML_EDEFAULT;

  /**
   * This is true if the Is Xml attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                       isXmlESet;

  /**
   * The default value of the '{@link #getPhonyElementName() <em>Phony Element Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getPhonyElementName()
   * @generated
   * @ordered
   */
  protected static final String           PHONY_ELEMENT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPhonyElementName() <em>Phony Element Name</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getPhonyElementName()
   * @generated
   * @ordered
   */
  protected String                        phonyElementName            = PHONY_ELEMENT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isOneMessage() <em>One Message</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOneMessage()
   * @generated
   * @ordered
   */
  protected static final boolean          ONE_MESSAGE_EDEFAULT        = false;

  /**
   * The cached value of the '{@link #isOneMessage() <em>One Message</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOneMessage()
   * @generated
   * @ordered
   */
  protected boolean                       oneMessage                  = ONE_MESSAGE_EDEFAULT;

  /**
   * This is true if the One Message attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                       oneMessageESet;

  /**
   * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean          ENABLED_EDEFAULT            = true;

  /**
   * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected boolean                       enabled                     = ENABLED_EDEFAULT;

  /**
   * This is true if the Enabled attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                       enabledESet;

  /**
   * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getDelay()
   * @generated
   * @ordered
   */
  protected static final BigInteger       DELAY_EDEFAULT              = new BigInteger("0");

  /**
   * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getDelay()
   * @generated
   * @ordered
   */
  protected BigInteger                    delay                       = DELAY_EDEFAULT;

  /**
   * This is true if the Delay attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                       delayESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MQPutActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MqModulePackage.Literals.MQ_PUT_ACTION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(ResourceDefinition newInput, NotificationChain msgs)
  {
    ResourceDefinition oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_ACTION__INPUT, oldInput, newInput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInput(ResourceDefinition newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_PUT_ACTION__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_PUT_ACTION__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_ACTION__INPUT, newInput, newInput));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InputMessageType getInputType()
  {
    return inputType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInputType(InputMessageType newInputType)
  {
    InputMessageType oldInputType = inputType;
    inputType = newInputType == null ? INPUT_TYPE_EDEFAULT : newInputType;
    boolean oldInputTypeESet = inputTypeESet;
    inputTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_ACTION__INPUT_TYPE, oldInputType, inputType, !oldInputTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetInputType()
  {
    InputMessageType oldInputType = inputType;
    boolean oldInputTypeESet = inputTypeESet;
    inputType = INPUT_TYPE_EDEFAULT;
    inputTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MqModulePackage.MQ_PUT_ACTION__INPUT_TYPE, oldInputType, INPUT_TYPE_EDEFAULT, oldInputTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetInputType()
  {
    return inputTypeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getQueue()
  {
    return queue;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQueue(ComplexValue newQueue, NotificationChain msgs)
  {
    ComplexValue oldQueue = queue;
    queue = newQueue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_ACTION__QUEUE, oldQueue, newQueue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setQueue(ComplexValue newQueue)
  {
    if (newQueue != queue)
    {
      NotificationChain msgs = null;
      if (queue != null)
        msgs = ((InternalEObject)queue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_PUT_ACTION__QUEUE, null, msgs);
      if (newQueue != null)
        msgs = ((InternalEObject)newQueue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_PUT_ACTION__QUEUE, null, msgs);
      msgs = basicSetQueue(newQueue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_ACTION__QUEUE, newQueue, newQueue));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getDelay()
  {
    return delay;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDelay(BigInteger newDelay)
  {
    BigInteger oldDelay = delay;
    delay = newDelay;
    boolean oldDelayESet = delayESet;
    delayESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_ACTION__DELAY, oldDelay, delay, !oldDelayESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDelay()
  {
    BigInteger oldDelay = delay;
    boolean oldDelayESet = delayESet;
    delay = DELAY_EDEFAULT;
    delayESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MqModulePackage.MQ_PUT_ACTION__DELAY, oldDelay, DELAY_EDEFAULT, oldDelayESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDelay()
  {
    return delayESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnabled()
  {
    return enabled;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setEnabled(boolean newEnabled)
  {
    boolean oldEnabled = enabled;
    enabled = newEnabled;
    boolean oldEnabledESet = enabledESet;
    enabledESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_ACTION__ENABLED, oldEnabled, enabled, !oldEnabledESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetEnabled()
  {
    boolean oldEnabled = enabled;
    boolean oldEnabledESet = enabledESet;
    enabled = ENABLED_EDEFAULT;
    enabledESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MqModulePackage.MQ_PUT_ACTION__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetEnabled()
  {
    return enabledESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsXml()
  {
    return isXml;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIsXml(boolean newIsXml)
  {
    boolean oldIsXml = isXml;
    isXml = newIsXml;
    boolean oldIsXmlESet = isXmlESet;
    isXmlESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_ACTION__IS_XML, oldIsXml, isXml, !oldIsXmlESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIsXml()
  {
    boolean oldIsXml = isXml;
    boolean oldIsXmlESet = isXmlESet;
    isXml = IS_XML_EDEFAULT;
    isXmlESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MqModulePackage.MQ_PUT_ACTION__IS_XML, oldIsXml, IS_XML_EDEFAULT, oldIsXmlESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIsXml()
  {
    return isXmlESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isOneMessage()
  {
    return oneMessage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOneMessage(boolean newOneMessage)
  {
    boolean oldOneMessage = oneMessage;
    oneMessage = newOneMessage;
    boolean oldOneMessageESet = oneMessageESet;
    oneMessageESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_ACTION__ONE_MESSAGE, oldOneMessage, oneMessage, !oldOneMessageESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOneMessage()
  {
    boolean oldOneMessage = oneMessage;
    boolean oldOneMessageESet = oneMessageESet;
    oneMessage = ONE_MESSAGE_EDEFAULT;
    oneMessageESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MqModulePackage.MQ_PUT_ACTION__ONE_MESSAGE, oldOneMessage, ONE_MESSAGE_EDEFAULT, oldOneMessageESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOneMessage()
  {
    return oneMessageESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getPhonyElementName()
  {
    return phonyElementName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPhonyElementName(String newPhonyElementName)
  {
    String oldPhonyElementName = phonyElementName;
    phonyElementName = newPhonyElementName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_ACTION__PHONY_ELEMENT_NAME, oldPhonyElementName, phonyElementName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MqModulePackage.MQ_PUT_ACTION__INPUT:
        return basicSetInput(null, msgs);
      case MqModulePackage.MQ_PUT_ACTION__QUEUE:
        return basicSetQueue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MqModulePackage.MQ_PUT_ACTION__INPUT:
        return getInput();
      case MqModulePackage.MQ_PUT_ACTION__INPUT_TYPE:
        return getInputType();
      case MqModulePackage.MQ_PUT_ACTION__QUEUE:
        return getQueue();
      case MqModulePackage.MQ_PUT_ACTION__IS_XML:
        return isIsXml();
      case MqModulePackage.MQ_PUT_ACTION__PHONY_ELEMENT_NAME:
        return getPhonyElementName();
      case MqModulePackage.MQ_PUT_ACTION__ONE_MESSAGE:
        return isOneMessage();
      case MqModulePackage.MQ_PUT_ACTION__ENABLED:
        return isEnabled();
      case MqModulePackage.MQ_PUT_ACTION__DELAY:
        return getDelay();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MqModulePackage.MQ_PUT_ACTION__INPUT:
        setInput((ResourceDefinition)newValue);
        return;
      case MqModulePackage.MQ_PUT_ACTION__INPUT_TYPE:
        setInputType((InputMessageType)newValue);
        return;
      case MqModulePackage.MQ_PUT_ACTION__QUEUE:
        setQueue((ComplexValue)newValue);
        return;
      case MqModulePackage.MQ_PUT_ACTION__IS_XML:
        setIsXml((Boolean)newValue);
        return;
      case MqModulePackage.MQ_PUT_ACTION__PHONY_ELEMENT_NAME:
        setPhonyElementName((String)newValue);
        return;
      case MqModulePackage.MQ_PUT_ACTION__ONE_MESSAGE:
        setOneMessage((Boolean)newValue);
        return;
      case MqModulePackage.MQ_PUT_ACTION__ENABLED:
        setEnabled((Boolean)newValue);
        return;
      case MqModulePackage.MQ_PUT_ACTION__DELAY:
        setDelay((BigInteger)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MqModulePackage.MQ_PUT_ACTION__INPUT:
        setInput((ResourceDefinition)null);
        return;
      case MqModulePackage.MQ_PUT_ACTION__INPUT_TYPE:
        unsetInputType();
        return;
      case MqModulePackage.MQ_PUT_ACTION__QUEUE:
        setQueue((ComplexValue)null);
        return;
      case MqModulePackage.MQ_PUT_ACTION__IS_XML:
        unsetIsXml();
        return;
      case MqModulePackage.MQ_PUT_ACTION__PHONY_ELEMENT_NAME:
        setPhonyElementName(PHONY_ELEMENT_NAME_EDEFAULT);
        return;
      case MqModulePackage.MQ_PUT_ACTION__ONE_MESSAGE:
        unsetOneMessage();
        return;
      case MqModulePackage.MQ_PUT_ACTION__ENABLED:
        unsetEnabled();
        return;
      case MqModulePackage.MQ_PUT_ACTION__DELAY:
        unsetDelay();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MqModulePackage.MQ_PUT_ACTION__INPUT:
        return input != null;
      case MqModulePackage.MQ_PUT_ACTION__INPUT_TYPE:
        return isSetInputType();
      case MqModulePackage.MQ_PUT_ACTION__QUEUE:
        return queue != null;
      case MqModulePackage.MQ_PUT_ACTION__IS_XML:
        return isSetIsXml();
      case MqModulePackage.MQ_PUT_ACTION__PHONY_ELEMENT_NAME:
        return PHONY_ELEMENT_NAME_EDEFAULT == null ? phonyElementName != null : !PHONY_ELEMENT_NAME_EDEFAULT.equals(phonyElementName);
      case MqModulePackage.MQ_PUT_ACTION__ONE_MESSAGE:
        return isSetOneMessage();
      case MqModulePackage.MQ_PUT_ACTION__ENABLED:
        return isSetEnabled();
      case MqModulePackage.MQ_PUT_ACTION__DELAY:
        return isSetDelay();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (inputType: ");
    if (inputTypeESet) result.append(inputType); else result.append("<unset>");
    result.append(", isXml: ");
    if (isXmlESet) result.append(isXml); else result.append("<unset>");
    result.append(", phonyElementName: ");
    result.append(phonyElementName);
    result.append(", oneMessage: ");
    if (oneMessageESet) result.append(oneMessage); else result.append("<unset>");
    result.append(", enabled: ");
    if (enabledESet) result.append(enabled); else result.append("<unset>");
    result.append(", delay: ");
    if (delayESet) result.append(delay); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // MQPutActionImpl
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
