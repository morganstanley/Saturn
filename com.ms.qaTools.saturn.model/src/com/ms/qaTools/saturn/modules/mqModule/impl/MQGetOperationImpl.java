package com.ms.qaTools.saturn.modules.mqModule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.modules.mqModule.AbstractMessageProcessor;
import com.ms.qaTools.saturn.modules.mqModule.MQGetAction;
import com.ms.qaTools.saturn.modules.mqModule.MQGetOperation;
import com.ms.qaTools.saturn.modules.mqModule.MQGetOutputFormat;
import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>MQ Get Operation</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOperationImpl#getException <em>Exception</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOperationImpl#getOutputResource <em>Output Resource</em>}
 * </li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOperationImpl#getPattern <em>Pattern</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOperationImpl#getPriority <em>Priority</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOperationImpl#getDelimiter <em>Delimiter</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOperationImpl#getOutputFormat <em>Output Format</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOperationImpl#getActions <em>Actions</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOperationImpl#getMessageProcessors <em>Message Processors
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQGetOperationImpl#isRemoveFromQueue <em>Remove From Queue
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MQGetOperationImpl extends AbstractMQOperationImpl implements MQGetOperation
{
  /**
   * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException()
   * @generated
   * @ordered
   */
  protected exception                       exception;

  /**
   * The cached value of the '{@link #getOutputResource() <em>Output Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOutputResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition              outputResource;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected ComplexValue                    pattern;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected ComplexValue                    priority;

  /**
   * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelimiter()
   * @generated
   * @ordered
   */
  protected ComplexValue                    delimiter;

  /**
   * The cached value of the '{@link #getOutputFormat() <em>Output Format</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOutputFormat()
   * @generated
   * @ordered
   */
  protected MQGetOutputFormat               outputFormat;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<MQGetAction>              actions;

  /**
   * The cached value of the '{@link #getMessageProcessors() <em>Message Processors</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getMessageProcessors()
   * @generated
   * @ordered
   */
  protected EList<AbstractMessageProcessor> messageProcessors;

  /**
   * The default value of the '{@link #isRemoveFromQueue() <em>Remove From Queue</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isRemoveFromQueue()
   * @generated
   * @ordered
   */
  protected static final boolean            REMOVE_FROM_QUEUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRemoveFromQueue() <em>Remove From Queue</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isRemoveFromQueue()
   * @generated
   * @ordered
   */
  protected boolean                         removeFromQueue            = REMOVE_FROM_QUEUE_EDEFAULT;

  /**
   * This is true if the Remove From Queue attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                         removeFromQueueESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MQGetOperationImpl()
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
    return MqModulePackage.Literals.MQ_GET_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public exception getException()
  {
    return exception;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetException(exception newException, NotificationChain msgs)
  {
    exception oldException = exception;
    exception = newException;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OPERATION__EXCEPTION, oldException, newException);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setException(exception newException)
  {
    if (newException != exception)
    {
      NotificationChain msgs = null;
      if (exception != null)
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_GET_OPERATION__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_GET_OPERATION__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OPERATION__EXCEPTION, newException, newException));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getOutputResource()
  {
    return outputResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputResource(ResourceDefinition newOutputResource, NotificationChain msgs)
  {
    ResourceDefinition oldOutputResource = outputResource;
    outputResource = newOutputResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OPERATION__OUTPUT_RESOURCE, oldOutputResource, newOutputResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOutputResource(ResourceDefinition newOutputResource)
  {
    if (newOutputResource != outputResource)
    {
      NotificationChain msgs = null;
      if (outputResource != null)
        msgs = ((InternalEObject)outputResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_GET_OPERATION__OUTPUT_RESOURCE, null, msgs);
      if (newOutputResource != null)
        msgs = ((InternalEObject)newOutputResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_GET_OPERATION__OUTPUT_RESOURCE, null, msgs);
      msgs = basicSetOutputResource(newOutputResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OPERATION__OUTPUT_RESOURCE, newOutputResource, newOutputResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPattern(ComplexValue newPattern, NotificationChain msgs)
  {
    ComplexValue oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OPERATION__PATTERN, oldPattern, newPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(ComplexValue newPattern)
  {
    if (newPattern != pattern)
    {
      NotificationChain msgs = null;
      if (pattern != null)
        msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_GET_OPERATION__PATTERN, null, msgs);
      if (newPattern != null)
        msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_GET_OPERATION__PATTERN, null, msgs);
      msgs = basicSetPattern(newPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OPERATION__PATTERN, newPattern, newPattern));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPriority(ComplexValue newPriority, NotificationChain msgs)
  {
    ComplexValue oldPriority = priority;
    priority = newPriority;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OPERATION__PRIORITY, oldPriority, newPriority);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(ComplexValue newPriority)
  {
    if (newPriority != priority)
    {
      NotificationChain msgs = null;
      if (priority != null)
        msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_GET_OPERATION__PRIORITY, null, msgs);
      if (newPriority != null)
        msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_GET_OPERATION__PRIORITY, null, msgs);
      msgs = basicSetPriority(newPriority, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OPERATION__PRIORITY, newPriority, newPriority));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDelimiter()
  {
    return delimiter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelimiter(ComplexValue newDelimiter, NotificationChain msgs)
  {
    ComplexValue oldDelimiter = delimiter;
    delimiter = newDelimiter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OPERATION__DELIMITER, oldDelimiter, newDelimiter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDelimiter(ComplexValue newDelimiter)
  {
    if (newDelimiter != delimiter)
    {
      NotificationChain msgs = null;
      if (delimiter != null)
        msgs = ((InternalEObject)delimiter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_GET_OPERATION__DELIMITER, null, msgs);
      if (newDelimiter != null)
        msgs = ((InternalEObject)newDelimiter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_GET_OPERATION__DELIMITER, null, msgs);
      msgs = basicSetDelimiter(newDelimiter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OPERATION__DELIMITER, newDelimiter, newDelimiter));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MQGetOutputFormat getOutputFormat()
  {
    return outputFormat;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputFormat(MQGetOutputFormat newOutputFormat, NotificationChain msgs)
  {
    MQGetOutputFormat oldOutputFormat = outputFormat;
    outputFormat = newOutputFormat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OPERATION__OUTPUT_FORMAT, oldOutputFormat, newOutputFormat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOutputFormat(MQGetOutputFormat newOutputFormat)
  {
    if (newOutputFormat != outputFormat)
    {
      NotificationChain msgs = null;
      if (outputFormat != null)
        msgs = ((InternalEObject)outputFormat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_GET_OPERATION__OUTPUT_FORMAT, null, msgs);
      if (newOutputFormat != null)
        msgs = ((InternalEObject)newOutputFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_GET_OPERATION__OUTPUT_FORMAT, null, msgs);
      msgs = basicSetOutputFormat(newOutputFormat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OPERATION__OUTPUT_FORMAT, newOutputFormat, newOutputFormat));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<MQGetAction> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<MQGetAction>(MQGetAction.class, this, MqModulePackage.MQ_GET_OPERATION__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractMessageProcessor> getMessageProcessors()
  {
    if (messageProcessors == null)
    {
      messageProcessors = new EObjectContainmentEList<AbstractMessageProcessor>(AbstractMessageProcessor.class, this, MqModulePackage.MQ_GET_OPERATION__MESSAGE_PROCESSORS);
    }
    return messageProcessors;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isRemoveFromQueue()
  {
    return removeFromQueue;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRemoveFromQueue(boolean newRemoveFromQueue)
  {
    boolean oldRemoveFromQueue = removeFromQueue;
    removeFromQueue = newRemoveFromQueue;
    boolean oldRemoveFromQueueESet = removeFromQueueESet;
    removeFromQueueESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_GET_OPERATION__REMOVE_FROM_QUEUE, oldRemoveFromQueue, removeFromQueue, !oldRemoveFromQueueESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetRemoveFromQueue()
  {
    boolean oldRemoveFromQueue = removeFromQueue;
    boolean oldRemoveFromQueueESet = removeFromQueueESet;
    removeFromQueue = REMOVE_FROM_QUEUE_EDEFAULT;
    removeFromQueueESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MqModulePackage.MQ_GET_OPERATION__REMOVE_FROM_QUEUE, oldRemoveFromQueue, REMOVE_FROM_QUEUE_EDEFAULT, oldRemoveFromQueueESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetRemoveFromQueue()
  {
    return removeFromQueueESet;
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
      case MqModulePackage.MQ_GET_OPERATION__EXCEPTION:
        return basicSetException(null, msgs);
      case MqModulePackage.MQ_GET_OPERATION__OUTPUT_RESOURCE:
        return basicSetOutputResource(null, msgs);
      case MqModulePackage.MQ_GET_OPERATION__PATTERN:
        return basicSetPattern(null, msgs);
      case MqModulePackage.MQ_GET_OPERATION__PRIORITY:
        return basicSetPriority(null, msgs);
      case MqModulePackage.MQ_GET_OPERATION__DELIMITER:
        return basicSetDelimiter(null, msgs);
      case MqModulePackage.MQ_GET_OPERATION__OUTPUT_FORMAT:
        return basicSetOutputFormat(null, msgs);
      case MqModulePackage.MQ_GET_OPERATION__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case MqModulePackage.MQ_GET_OPERATION__MESSAGE_PROCESSORS:
        return ((InternalEList<?>)getMessageProcessors()).basicRemove(otherEnd, msgs);
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
      case MqModulePackage.MQ_GET_OPERATION__EXCEPTION:
        return getException();
      case MqModulePackage.MQ_GET_OPERATION__OUTPUT_RESOURCE:
        return getOutputResource();
      case MqModulePackage.MQ_GET_OPERATION__PATTERN:
        return getPattern();
      case MqModulePackage.MQ_GET_OPERATION__PRIORITY:
        return getPriority();
      case MqModulePackage.MQ_GET_OPERATION__DELIMITER:
        return getDelimiter();
      case MqModulePackage.MQ_GET_OPERATION__OUTPUT_FORMAT:
        return getOutputFormat();
      case MqModulePackage.MQ_GET_OPERATION__ACTIONS:
        return getActions();
      case MqModulePackage.MQ_GET_OPERATION__MESSAGE_PROCESSORS:
        return getMessageProcessors();
      case MqModulePackage.MQ_GET_OPERATION__REMOVE_FROM_QUEUE:
        return isRemoveFromQueue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MqModulePackage.MQ_GET_OPERATION__EXCEPTION:
        setException((exception)newValue);
        return;
      case MqModulePackage.MQ_GET_OPERATION__OUTPUT_RESOURCE:
        setOutputResource((ResourceDefinition)newValue);
        return;
      case MqModulePackage.MQ_GET_OPERATION__PATTERN:
        setPattern((ComplexValue)newValue);
        return;
      case MqModulePackage.MQ_GET_OPERATION__PRIORITY:
        setPriority((ComplexValue)newValue);
        return;
      case MqModulePackage.MQ_GET_OPERATION__DELIMITER:
        setDelimiter((ComplexValue)newValue);
        return;
      case MqModulePackage.MQ_GET_OPERATION__OUTPUT_FORMAT:
        setOutputFormat((MQGetOutputFormat)newValue);
        return;
      case MqModulePackage.MQ_GET_OPERATION__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends MQGetAction>)newValue);
        return;
      case MqModulePackage.MQ_GET_OPERATION__MESSAGE_PROCESSORS:
        getMessageProcessors().clear();
        getMessageProcessors().addAll((Collection<? extends AbstractMessageProcessor>)newValue);
        return;
      case MqModulePackage.MQ_GET_OPERATION__REMOVE_FROM_QUEUE:
        setRemoveFromQueue((Boolean)newValue);
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
      case MqModulePackage.MQ_GET_OPERATION__EXCEPTION:
        setException((exception)null);
        return;
      case MqModulePackage.MQ_GET_OPERATION__OUTPUT_RESOURCE:
        setOutputResource((ResourceDefinition)null);
        return;
      case MqModulePackage.MQ_GET_OPERATION__PATTERN:
        setPattern((ComplexValue)null);
        return;
      case MqModulePackage.MQ_GET_OPERATION__PRIORITY:
        setPriority((ComplexValue)null);
        return;
      case MqModulePackage.MQ_GET_OPERATION__DELIMITER:
        setDelimiter((ComplexValue)null);
        return;
      case MqModulePackage.MQ_GET_OPERATION__OUTPUT_FORMAT:
        setOutputFormat((MQGetOutputFormat)null);
        return;
      case MqModulePackage.MQ_GET_OPERATION__ACTIONS:
        getActions().clear();
        return;
      case MqModulePackage.MQ_GET_OPERATION__MESSAGE_PROCESSORS:
        getMessageProcessors().clear();
        return;
      case MqModulePackage.MQ_GET_OPERATION__REMOVE_FROM_QUEUE:
        unsetRemoveFromQueue();
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
      case MqModulePackage.MQ_GET_OPERATION__EXCEPTION:
        return exception != null;
      case MqModulePackage.MQ_GET_OPERATION__OUTPUT_RESOURCE:
        return outputResource != null;
      case MqModulePackage.MQ_GET_OPERATION__PATTERN:
        return pattern != null;
      case MqModulePackage.MQ_GET_OPERATION__PRIORITY:
        return priority != null;
      case MqModulePackage.MQ_GET_OPERATION__DELIMITER:
        return delimiter != null;
      case MqModulePackage.MQ_GET_OPERATION__OUTPUT_FORMAT:
        return outputFormat != null;
      case MqModulePackage.MQ_GET_OPERATION__ACTIONS:
        return actions != null && !actions.isEmpty();
      case MqModulePackage.MQ_GET_OPERATION__MESSAGE_PROCESSORS:
        return messageProcessors != null && !messageProcessors.isEmpty();
      case MqModulePackage.MQ_GET_OPERATION__REMOVE_FROM_QUEUE:
        return isSetRemoveFromQueue();
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
    result.append(" (removeFromQueue: ");
    if (removeFromQueueESet) result.append(removeFromQueue); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // MQGetOperationImpl
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
