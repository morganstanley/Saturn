package com.ms.qaTools.saturn.modules.mqModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.modules.mqModule.AbstractMQOperation;
import com.ms.qaTools.saturn.modules.mqModule.MQConfiguration;
import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>MQ Configuration</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQConfigurationImpl#getMQResource <em>MQ Resource</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQConfigurationImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MQConfigurationImpl extends EObjectImpl implements MQConfiguration
{
  /**
   * The cached value of the '{@link #getMQResource() <em>MQ Resource</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getMQResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition  mQResource;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected AbstractMQOperation operation;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MQConfigurationImpl()
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
    return MqModulePackage.Literals.MQ_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getMQResource()
  {
    return mQResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMQResource(ResourceDefinition newMQResource, NotificationChain msgs)
  {
    ResourceDefinition oldMQResource = mQResource;
    mQResource = newMQResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_CONFIGURATION__MQ_RESOURCE, oldMQResource, newMQResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMQResource(ResourceDefinition newMQResource)
  {
    if (newMQResource != mQResource)
    {
      NotificationChain msgs = null;
      if (mQResource != null)
        msgs = ((InternalEObject)mQResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_CONFIGURATION__MQ_RESOURCE, null, msgs);
      if (newMQResource != null)
        msgs = ((InternalEObject)newMQResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_CONFIGURATION__MQ_RESOURCE, null, msgs);
      msgs = basicSetMQResource(newMQResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_CONFIGURATION__MQ_RESOURCE, newMQResource, newMQResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractMQOperation getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperation(AbstractMQOperation newOperation, NotificationChain msgs)
  {
    AbstractMQOperation oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_CONFIGURATION__OPERATION, oldOperation, newOperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(AbstractMQOperation newOperation)
  {
    if (newOperation != operation)
    {
      NotificationChain msgs = null;
      if (operation != null)
        msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_CONFIGURATION__OPERATION, null, msgs);
      if (newOperation != null)
        msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_CONFIGURATION__OPERATION, null, msgs);
      msgs = basicSetOperation(newOperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_CONFIGURATION__OPERATION, newOperation, newOperation));
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
      case MqModulePackage.MQ_CONFIGURATION__MQ_RESOURCE:
        return basicSetMQResource(null, msgs);
      case MqModulePackage.MQ_CONFIGURATION__OPERATION:
        return basicSetOperation(null, msgs);
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
      case MqModulePackage.MQ_CONFIGURATION__MQ_RESOURCE:
        return getMQResource();
      case MqModulePackage.MQ_CONFIGURATION__OPERATION:
        return getOperation();
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
      case MqModulePackage.MQ_CONFIGURATION__MQ_RESOURCE:
        setMQResource((ResourceDefinition)newValue);
        return;
      case MqModulePackage.MQ_CONFIGURATION__OPERATION:
        setOperation((AbstractMQOperation)newValue);
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
      case MqModulePackage.MQ_CONFIGURATION__MQ_RESOURCE:
        setMQResource((ResourceDefinition)null);
        return;
      case MqModulePackage.MQ_CONFIGURATION__OPERATION:
        setOperation((AbstractMQOperation)null);
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
      case MqModulePackage.MQ_CONFIGURATION__MQ_RESOURCE:
        return mQResource != null;
      case MqModulePackage.MQ_CONFIGURATION__OPERATION:
        return operation != null;
    }
    return super.eIsSet(featureID);
  }

} // MQConfigurationImpl
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
