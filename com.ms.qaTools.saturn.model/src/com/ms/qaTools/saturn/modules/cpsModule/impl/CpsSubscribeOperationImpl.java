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
package com.ms.qaTools.saturn.modules.cpsModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.modules.cpsModule.CpsModulePackage;
import com.ms.qaTools.saturn.modules.cpsModule.CpsSubscribeOperation;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Cps Subscribe Operation</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsSubscribeOperationImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsSubscribeOperationImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsSubscribeOperationImpl#isSowInit <em>Sow Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CpsSubscribeOperationImpl extends AbstractCpsOperationImpl implements CpsSubscribeOperation
{
  /**
   * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTopic()
   * @generated
   * @ordered
   */
  protected ComplexValue         topic;

  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected ComplexValue         filter;

  /**
   * The default value of the '{@link #isSowInit() <em>Sow Init</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isSowInit()
   * @generated
   * @ordered
   */
  protected static final boolean SOW_INIT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSowInit() <em>Sow Init</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isSowInit()
   * @generated
   * @ordered
   */
  protected boolean              sowInit           = SOW_INIT_EDEFAULT;

  /**
   * This is true if the Sow Init attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              sowInitESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected CpsSubscribeOperationImpl()
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
    return CpsModulePackage.Literals.CPS_SUBSCRIBE_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getTopic()
  {
    return topic;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTopic(ComplexValue newTopic, NotificationChain msgs)
  {
    ComplexValue oldTopic = topic;
    topic = newTopic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpsModulePackage.CPS_SUBSCRIBE_OPERATION__TOPIC, oldTopic, newTopic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTopic(ComplexValue newTopic)
  {
    if (newTopic != topic)
    {
      NotificationChain msgs = null;
      if (topic != null)
        msgs = ((InternalEObject)topic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpsModulePackage.CPS_SUBSCRIBE_OPERATION__TOPIC, null, msgs);
      if (newTopic != null)
        msgs = ((InternalEObject)newTopic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpsModulePackage.CPS_SUBSCRIBE_OPERATION__TOPIC, null, msgs);
      msgs = basicSetTopic(newTopic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CpsModulePackage.CPS_SUBSCRIBE_OPERATION__TOPIC, newTopic, newTopic));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter(ComplexValue newFilter, NotificationChain msgs)
  {
    ComplexValue oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpsModulePackage.CPS_SUBSCRIBE_OPERATION__FILTER, oldFilter, newFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(ComplexValue newFilter)
  {
    if (newFilter != filter)
    {
      NotificationChain msgs = null;
      if (filter != null)
        msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpsModulePackage.CPS_SUBSCRIBE_OPERATION__FILTER, null, msgs);
      if (newFilter != null)
        msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpsModulePackage.CPS_SUBSCRIBE_OPERATION__FILTER, null, msgs);
      msgs = basicSetFilter(newFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CpsModulePackage.CPS_SUBSCRIBE_OPERATION__FILTER, newFilter, newFilter));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSowInit()
  {
    return sowInit;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSowInit(boolean newSowInit)
  {
    boolean oldSowInit = sowInit;
    sowInit = newSowInit;
    boolean oldSowInitESet = sowInitESet;
    sowInitESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CpsModulePackage.CPS_SUBSCRIBE_OPERATION__SOW_INIT, oldSowInit, sowInit, !oldSowInitESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetSowInit()
  {
    boolean oldSowInit = sowInit;
    boolean oldSowInitESet = sowInitESet;
    sowInit = SOW_INIT_EDEFAULT;
    sowInitESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, CpsModulePackage.CPS_SUBSCRIBE_OPERATION__SOW_INIT, oldSowInit, SOW_INIT_EDEFAULT, oldSowInitESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetSowInit()
  {
    return sowInitESet;
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
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION__TOPIC:
        return basicSetTopic(null, msgs);
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION__FILTER:
        return basicSetFilter(null, msgs);
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
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION__TOPIC:
        return getTopic();
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION__FILTER:
        return getFilter();
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION__SOW_INIT:
        return isSowInit();
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
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION__TOPIC:
        setTopic((ComplexValue)newValue);
        return;
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION__FILTER:
        setFilter((ComplexValue)newValue);
        return;
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION__SOW_INIT:
        setSowInit((Boolean)newValue);
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
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION__TOPIC:
        setTopic((ComplexValue)null);
        return;
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION__FILTER:
        setFilter((ComplexValue)null);
        return;
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION__SOW_INIT:
        unsetSowInit();
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
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION__TOPIC:
        return topic != null;
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION__FILTER:
        return filter != null;
      case CpsModulePackage.CPS_SUBSCRIBE_OPERATION__SOW_INIT:
        return isSetSowInit();
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
    result.append(" (sowInit: ");
    if (sowInitESet) result.append(sowInit); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // CpsSubscribeOperationImpl
