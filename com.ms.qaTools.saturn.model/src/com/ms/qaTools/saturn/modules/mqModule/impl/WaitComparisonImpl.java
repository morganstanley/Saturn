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

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage;
import com.ms.qaTools.saturn.modules.mqModule.WaitComparison;
import com.ms.qaTools.saturn.modules.mqModule.WaitOperator;
import com.ms.qaTools.saturn.values.impl.ComplexValueImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Wait Comparison</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.WaitComparisonImpl#isCheckTotal <em>Check Total</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.WaitComparisonImpl#getDepth <em>Depth</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.WaitComparisonImpl#getOperator <em>Operator</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.mqModule.impl.WaitComparisonImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class WaitComparisonImpl extends ComplexValueImpl implements WaitComparison
{
  /**
   * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTimeout()
   * @generated
   * @ordered
   */
  protected static final BigInteger   TIMEOUT_EDEFAULT     = new BigInteger("0");

  /**
   * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTimeout()
   * @generated
   * @ordered
   */
  protected BigInteger                timeout              = TIMEOUT_EDEFAULT;

  /**
   * This is true if the Timeout attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   timeoutESet;

  /**
   * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getDepth()
   * @generated
   * @ordered
   */
  protected static final BigInteger   DEPTH_EDEFAULT       = new BigInteger("0");

  /**
   * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getDepth()
   * @generated
   * @ordered
   */
  protected BigInteger                depth                = DEPTH_EDEFAULT;

  /**
   * This is true if the Depth attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   depthESet;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final WaitOperator OPERATOR_EDEFAULT    = WaitOperator._2;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected WaitOperator              operator             = OPERATOR_EDEFAULT;

  /**
   * This is true if the Operator attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   operatorESet;

  /**
   * The default value of the '{@link #isCheckTotal() <em>Check Total</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isCheckTotal()
   * @generated
   * @ordered
   */
  protected static final boolean      CHECK_TOTAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCheckTotal() <em>Check Total</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isCheckTotal()
   * @generated
   * @ordered
   */
  protected boolean                   checkTotal           = CHECK_TOTAL_EDEFAULT;

  /**
   * This is true if the Check Total attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   checkTotalESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected WaitComparisonImpl()
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
    return MqModulePackage.Literals.WAIT_COMPARISON;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isCheckTotal()
  {
    return checkTotal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCheckTotal(boolean newCheckTotal)
  {
    boolean oldCheckTotal = checkTotal;
    checkTotal = newCheckTotal;
    boolean oldCheckTotalESet = checkTotalESet;
    checkTotalESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.WAIT_COMPARISON__CHECK_TOTAL, oldCheckTotal, checkTotal, !oldCheckTotalESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCheckTotal()
  {
    boolean oldCheckTotal = checkTotal;
    boolean oldCheckTotalESet = checkTotalESet;
    checkTotal = CHECK_TOTAL_EDEFAULT;
    checkTotalESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MqModulePackage.WAIT_COMPARISON__CHECK_TOTAL, oldCheckTotal, CHECK_TOTAL_EDEFAULT, oldCheckTotalESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCheckTotal()
  {
    return checkTotalESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getDepth()
  {
    return depth;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDepth(BigInteger newDepth)
  {
    BigInteger oldDepth = depth;
    depth = newDepth;
    boolean oldDepthESet = depthESet;
    depthESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.WAIT_COMPARISON__DEPTH, oldDepth, depth, !oldDepthESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDepth()
  {
    BigInteger oldDepth = depth;
    boolean oldDepthESet = depthESet;
    depth = DEPTH_EDEFAULT;
    depthESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MqModulePackage.WAIT_COMPARISON__DEPTH, oldDepth, DEPTH_EDEFAULT, oldDepthESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDepth()
  {
    return depthESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public WaitOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(WaitOperator newOperator)
  {
    WaitOperator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    boolean oldOperatorESet = operatorESet;
    operatorESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.WAIT_COMPARISON__OPERATOR, oldOperator, operator, !oldOperatorESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOperator()
  {
    WaitOperator oldOperator = operator;
    boolean oldOperatorESet = operatorESet;
    operator = OPERATOR_EDEFAULT;
    operatorESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MqModulePackage.WAIT_COMPARISON__OPERATOR, oldOperator, OPERATOR_EDEFAULT, oldOperatorESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOperator()
  {
    return operatorESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getTimeout()
  {
    return timeout;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTimeout(BigInteger newTimeout)
  {
    BigInteger oldTimeout = timeout;
    timeout = newTimeout;
    boolean oldTimeoutESet = timeoutESet;
    timeoutESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqModulePackage.WAIT_COMPARISON__TIMEOUT, oldTimeout, timeout, !oldTimeoutESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetTimeout()
  {
    BigInteger oldTimeout = timeout;
    boolean oldTimeoutESet = timeoutESet;
    timeout = TIMEOUT_EDEFAULT;
    timeoutESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MqModulePackage.WAIT_COMPARISON__TIMEOUT, oldTimeout, TIMEOUT_EDEFAULT, oldTimeoutESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetTimeout()
  {
    return timeoutESet;
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
      case MqModulePackage.WAIT_COMPARISON__TIMEOUT:
        return getTimeout();
      case MqModulePackage.WAIT_COMPARISON__DEPTH:
        return getDepth();
      case MqModulePackage.WAIT_COMPARISON__OPERATOR:
        return getOperator();
      case MqModulePackage.WAIT_COMPARISON__CHECK_TOTAL:
        return isCheckTotal();
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
      case MqModulePackage.WAIT_COMPARISON__TIMEOUT:
        setTimeout((BigInteger)newValue);
        return;
      case MqModulePackage.WAIT_COMPARISON__DEPTH:
        setDepth((BigInteger)newValue);
        return;
      case MqModulePackage.WAIT_COMPARISON__OPERATOR:
        setOperator((WaitOperator)newValue);
        return;
      case MqModulePackage.WAIT_COMPARISON__CHECK_TOTAL:
        setCheckTotal((Boolean)newValue);
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
      case MqModulePackage.WAIT_COMPARISON__TIMEOUT:
        unsetTimeout();
        return;
      case MqModulePackage.WAIT_COMPARISON__DEPTH:
        unsetDepth();
        return;
      case MqModulePackage.WAIT_COMPARISON__OPERATOR:
        unsetOperator();
        return;
      case MqModulePackage.WAIT_COMPARISON__CHECK_TOTAL:
        unsetCheckTotal();
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
      case MqModulePackage.WAIT_COMPARISON__TIMEOUT:
        return isSetTimeout();
      case MqModulePackage.WAIT_COMPARISON__DEPTH:
        return isSetDepth();
      case MqModulePackage.WAIT_COMPARISON__OPERATOR:
        return isSetOperator();
      case MqModulePackage.WAIT_COMPARISON__CHECK_TOTAL:
        return isSetCheckTotal();
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
    result.append(" (timeout: ");
    if (timeoutESet) result.append(timeout); else result.append("<unset>");
    result.append(", depth: ");
    if (depthESet) result.append(depth); else result.append("<unset>");
    result.append(", operator: ");
    if (operatorESet) result.append(operator); else result.append("<unset>");
    result.append(", checkTotal: ");
    if (checkTotalESet) result.append(checkTotal); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // WaitComparisonImpl
