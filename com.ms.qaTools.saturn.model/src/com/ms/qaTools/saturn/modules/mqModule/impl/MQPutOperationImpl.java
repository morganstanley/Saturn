package com.ms.qaTools.saturn.modules.mqModule.impl;

import java.math.BigInteger;
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
import com.ms.qaTools.saturn.modules.mqModule.MQPutAction;
import com.ms.qaTools.saturn.modules.mqModule.MQPutOperation;
import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>MQ Put Operation</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutOperationImpl#getException <em>Exception</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutOperationImpl#getInputResource <em>Input Resource</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutOperationImpl#getActions <em>Actions</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutOperationImpl#getCpsHeader <em>Cps Header</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutOperationImpl#getDelay <em>Delay</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQPutOperationImpl#getDelimiter <em>Delimiter</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MQPutOperationImpl extends AbstractMQOperationImpl implements MQPutOperation
{
  /**
   * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException()
   * @generated
   * @ordered
   */
  protected exception               exception;

  /**
   * The cached value of the '{@link #getInputResource() <em>Input Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getInputResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition      inputResource;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<MQPutAction>      actions;

  /**
   * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getDelay()
   * @generated
   * @ordered
   */
  protected static final BigInteger DELAY_EDEFAULT      = new BigInteger("0");

  /**
   * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getDelay()
   * @generated
   * @ordered
   */
  protected BigInteger              delay               = DELAY_EDEFAULT;

  /**
   * This is true if the Delay attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 delayESet;

  /**
   * The default value of the '{@link #getCpsHeader() <em>Cps Header</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getCpsHeader()
   * @generated
   * @ordered
   */
  protected static final String     CPS_HEADER_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getCpsHeader() <em>Cps Header</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getCpsHeader()
   * @generated
   * @ordered
   */
  protected String                  cpsHeader           = CPS_HEADER_EDEFAULT;

  /**
   * This is true if the Cps Header attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 cpsHeaderESet;

  /**
   * The default value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDelimiter()
   * @generated
   * @ordered
   */
  protected static final String     DELIMITER_EDEFAULT  = null;

  /**
   * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDelimiter()
   * @generated
   * @ordered
   */
  protected String                  delimiter           = DELIMITER_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MQPutOperationImpl()
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
    return MqModulePackage.Literals.MQ_PUT_OPERATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_OPERATION__EXCEPTION, oldException, newException);
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
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_PUT_OPERATION__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_PUT_OPERATION__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_OPERATION__EXCEPTION, newException, newException));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getInputResource()
  {
    return inputResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputResource(ResourceDefinition newInputResource, NotificationChain msgs)
  {
    ResourceDefinition oldInputResource = inputResource;
    inputResource = newInputResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_OPERATION__INPUT_RESOURCE, oldInputResource, newInputResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInputResource(ResourceDefinition newInputResource)
  {
    if (newInputResource != inputResource)
    {
      NotificationChain msgs = null;
      if (inputResource != null)
        msgs = ((InternalEObject)inputResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_PUT_OPERATION__INPUT_RESOURCE, null, msgs);
      if (newInputResource != null)
        msgs = ((InternalEObject)newInputResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_PUT_OPERATION__INPUT_RESOURCE, null, msgs);
      msgs = basicSetInputResource(newInputResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_OPERATION__INPUT_RESOURCE, newInputResource, newInputResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<MQPutAction> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<MQPutAction>(MQPutAction.class, this, MqModulePackage.MQ_PUT_OPERATION__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getCpsHeader()
  {
    return cpsHeader;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCpsHeader(String newCpsHeader)
  {
    String oldCpsHeader = cpsHeader;
    cpsHeader = newCpsHeader;
    boolean oldCpsHeaderESet = cpsHeaderESet;
    cpsHeaderESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_OPERATION__CPS_HEADER, oldCpsHeader, cpsHeader, !oldCpsHeaderESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCpsHeader()
  {
    String oldCpsHeader = cpsHeader;
    boolean oldCpsHeaderESet = cpsHeaderESet;
    cpsHeader = CPS_HEADER_EDEFAULT;
    cpsHeaderESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MqModulePackage.MQ_PUT_OPERATION__CPS_HEADER, oldCpsHeader, CPS_HEADER_EDEFAULT, oldCpsHeaderESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCpsHeader()
  {
    return cpsHeaderESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_OPERATION__DELAY, oldDelay, delay, !oldDelayESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, MqModulePackage.MQ_PUT_OPERATION__DELAY, oldDelay, DELAY_EDEFAULT, oldDelayESet));
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
  public String getDelimiter()
  {
    return delimiter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDelimiter(String newDelimiter)
  {
    String oldDelimiter = delimiter;
    delimiter = newDelimiter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_PUT_OPERATION__DELIMITER, oldDelimiter, delimiter));
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
      case MqModulePackage.MQ_PUT_OPERATION__EXCEPTION:
        return basicSetException(null, msgs);
      case MqModulePackage.MQ_PUT_OPERATION__INPUT_RESOURCE:
        return basicSetInputResource(null, msgs);
      case MqModulePackage.MQ_PUT_OPERATION__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
      case MqModulePackage.MQ_PUT_OPERATION__EXCEPTION:
        return getException();
      case MqModulePackage.MQ_PUT_OPERATION__INPUT_RESOURCE:
        return getInputResource();
      case MqModulePackage.MQ_PUT_OPERATION__ACTIONS:
        return getActions();
      case MqModulePackage.MQ_PUT_OPERATION__DELAY:
        return getDelay();
      case MqModulePackage.MQ_PUT_OPERATION__CPS_HEADER:
        return getCpsHeader();
      case MqModulePackage.MQ_PUT_OPERATION__DELIMITER:
        return getDelimiter();
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
      case MqModulePackage.MQ_PUT_OPERATION__EXCEPTION:
        setException((exception)newValue);
        return;
      case MqModulePackage.MQ_PUT_OPERATION__INPUT_RESOURCE:
        setInputResource((ResourceDefinition)newValue);
        return;
      case MqModulePackage.MQ_PUT_OPERATION__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends MQPutAction>)newValue);
        return;
      case MqModulePackage.MQ_PUT_OPERATION__DELAY:
        setDelay((BigInteger)newValue);
        return;
      case MqModulePackage.MQ_PUT_OPERATION__CPS_HEADER:
        setCpsHeader((String)newValue);
        return;
      case MqModulePackage.MQ_PUT_OPERATION__DELIMITER:
        setDelimiter((String)newValue);
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
      case MqModulePackage.MQ_PUT_OPERATION__EXCEPTION:
        setException((exception)null);
        return;
      case MqModulePackage.MQ_PUT_OPERATION__INPUT_RESOURCE:
        setInputResource((ResourceDefinition)null);
        return;
      case MqModulePackage.MQ_PUT_OPERATION__ACTIONS:
        getActions().clear();
        return;
      case MqModulePackage.MQ_PUT_OPERATION__DELAY:
        unsetDelay();
        return;
      case MqModulePackage.MQ_PUT_OPERATION__CPS_HEADER:
        unsetCpsHeader();
        return;
      case MqModulePackage.MQ_PUT_OPERATION__DELIMITER:
        setDelimiter(DELIMITER_EDEFAULT);
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
      case MqModulePackage.MQ_PUT_OPERATION__EXCEPTION:
        return exception != null;
      case MqModulePackage.MQ_PUT_OPERATION__INPUT_RESOURCE:
        return inputResource != null;
      case MqModulePackage.MQ_PUT_OPERATION__ACTIONS:
        return actions != null && !actions.isEmpty();
      case MqModulePackage.MQ_PUT_OPERATION__DELAY:
        return isSetDelay();
      case MqModulePackage.MQ_PUT_OPERATION__CPS_HEADER:
        return isSetCpsHeader();
      case MqModulePackage.MQ_PUT_OPERATION__DELIMITER:
        return DELIMITER_EDEFAULT == null ? delimiter != null : !DELIMITER_EDEFAULT.equals(delimiter);
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
    result.append(" (delay: ");
    if (delayESet) result.append(delay); else result.append("<unset>");
    result.append(", cpsHeader: ");
    if (cpsHeaderESet) result.append(cpsHeader); else result.append("<unset>");
    result.append(", delimiter: ");
    result.append(delimiter);
    result.append(')');
    return result.toString();
  }

} // MQPutOperationImpl
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
