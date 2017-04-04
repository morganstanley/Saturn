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

import com.ms.qaTools.saturn.modules.mqModule.MQWaitAction;
import com.ms.qaTools.saturn.modules.mqModule.MQWaitOperation;
import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage;
import com.ms.qaTools.saturn.modules.mqModule.WaitComparison;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>MQ Wait Operation</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQWaitOperationImpl#getComparison <em>Comparison</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQWaitOperationImpl#getQueues <em>Queues</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.MQWaitOperationImpl#getWaitedTime <em>Waited Time</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MQWaitOperationImpl extends AbstractMQOperationImpl implements MQWaitOperation
{
  /**
   * The cached value of the '{@link #getComparison() <em>Comparison</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getComparison()
   * @generated
   * @ordered
   */
  protected WaitComparison      comparison;

  /**
   * The cached value of the '{@link #getQueues() <em>Queues</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueues()
   * @generated
   * @ordered
   */
  protected EList<MQWaitAction> queues;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MQWaitOperationImpl()
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
    return MqModulePackage.Literals.MQ_WAIT_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public WaitComparison getComparison()
  {
    return comparison;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComparison(WaitComparison newComparison, NotificationChain msgs)
  {
    WaitComparison oldComparison = comparison;
    comparison = newComparison;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_WAIT_OPERATION__COMPARISON, oldComparison, newComparison);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setComparison(WaitComparison newComparison)
  {
    if (newComparison != comparison)
    {
      NotificationChain msgs = null;
      if (comparison != null)
        msgs = ((InternalEObject)comparison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_WAIT_OPERATION__COMPARISON, null, msgs);
      if (newComparison != null)
        msgs = ((InternalEObject)newComparison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MqModulePackage.MQ_WAIT_OPERATION__COMPARISON, null, msgs);
      msgs = basicSetComparison(newComparison, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.MQ_WAIT_OPERATION__COMPARISON, newComparison, newComparison));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<MQWaitAction> getQueues()
  {
    if (queues == null)
    {
      queues = new EObjectContainmentEList<MQWaitAction>(MQWaitAction.class, this, MqModulePackage.MQ_WAIT_OPERATION__QUEUES);
    }
    return queues;
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
      case MqModulePackage.MQ_WAIT_OPERATION__COMPARISON:
        return basicSetComparison(null, msgs);
      case MqModulePackage.MQ_WAIT_OPERATION__QUEUES:
        return ((InternalEList<?>)getQueues()).basicRemove(otherEnd, msgs);
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
      case MqModulePackage.MQ_WAIT_OPERATION__COMPARISON:
        return getComparison();
      case MqModulePackage.MQ_WAIT_OPERATION__QUEUES:
        return getQueues();
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
      case MqModulePackage.MQ_WAIT_OPERATION__COMPARISON:
        setComparison((WaitComparison)newValue);
        return;
      case MqModulePackage.MQ_WAIT_OPERATION__QUEUES:
        getQueues().clear();
        getQueues().addAll((Collection<? extends MQWaitAction>)newValue);
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
      case MqModulePackage.MQ_WAIT_OPERATION__COMPARISON:
        setComparison((WaitComparison)null);
        return;
      case MqModulePackage.MQ_WAIT_OPERATION__QUEUES:
        getQueues().clear();
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
      case MqModulePackage.MQ_WAIT_OPERATION__COMPARISON:
        return comparison != null;
      case MqModulePackage.MQ_WAIT_OPERATION__QUEUES:
        return queues != null && !queues.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // MQWaitOperationImpl
