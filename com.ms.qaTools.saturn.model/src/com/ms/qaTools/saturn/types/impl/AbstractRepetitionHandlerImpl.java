package com.ms.qaTools.saturn.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.types.AbstractRepetitionHandler;
import com.ms.qaTools.saturn.types.SaturnStatusConditionEnum;
import com.ms.qaTools.saturn.types.SaturnStatusEnum;
import com.ms.qaTools.saturn.types.TypesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract Repetition Handler</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.AbstractRepetitionHandlerImpl#getDefaultStatus <em>Default Status</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.AbstractRepetitionHandlerImpl#getStatusCondition <em>Status Condition</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.AbstractRepetitionHandlerImpl#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractRepetitionHandlerImpl extends EObjectImpl implements AbstractRepetitionHandler
{
  /**
   * The default value of the '{@link #getDefaultStatus() <em>Default Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultStatus()
   * @generated
   * @ordered
   */
  protected static final SaturnStatusEnum          DEFAULT_STATUS_EDEFAULT   = SaturnStatusEnum.FAIL;

  /**
   * The cached value of the '{@link #getDefaultStatus() <em>Default Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultStatus()
   * @generated
   * @ordered
   */
  protected SaturnStatusEnum                       defaultStatus             = DEFAULT_STATUS_EDEFAULT;

  /**
   * This is true if the Default Status attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                defaultStatusESet;

  /**
   * The default value of the '{@link #getStatusCondition() <em>Status Condition</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getStatusCondition()
   * @generated
   * @ordered
   */
  protected static final SaturnStatusConditionEnum STATUS_CONDITION_EDEFAULT = SaturnStatusConditionEnum.ANYFAIL;

  /**
   * The cached value of the '{@link #getStatusCondition() <em>Status Condition</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getStatusCondition()
   * @generated
   * @ordered
   */
  protected SaturnStatusConditionEnum              statusCondition           = STATUS_CONDITION_EDEFAULT;

  /**
   * This is true if the Status Condition attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                statusConditionESet;

  /**
   * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean                   ENABLED_EDEFAULT          = true;

  /**
   * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected boolean                                enabled                   = ENABLED_EDEFAULT;

  /**
   * This is true if the Enabled attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                enabledESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected AbstractRepetitionHandlerImpl()
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
    return TypesPackage.Literals.ABSTRACT_REPETITION_HANDLER;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnStatusEnum getDefaultStatus()
  {
    return defaultStatus;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultStatus(SaturnStatusEnum newDefaultStatus)
  {
    SaturnStatusEnum oldDefaultStatus = defaultStatus;
    defaultStatus = newDefaultStatus == null ? DEFAULT_STATUS_EDEFAULT : newDefaultStatus;
    boolean oldDefaultStatusESet = defaultStatusESet;
    defaultStatusESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ABSTRACT_REPETITION_HANDLER__DEFAULT_STATUS, oldDefaultStatus, defaultStatus, !oldDefaultStatusESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDefaultStatus()
  {
    SaturnStatusEnum oldDefaultStatus = defaultStatus;
    boolean oldDefaultStatusESet = defaultStatusESet;
    defaultStatus = DEFAULT_STATUS_EDEFAULT;
    defaultStatusESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ABSTRACT_REPETITION_HANDLER__DEFAULT_STATUS, oldDefaultStatus, DEFAULT_STATUS_EDEFAULT, oldDefaultStatusESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDefaultStatus()
  {
    return defaultStatusESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ABSTRACT_REPETITION_HANDLER__ENABLED, oldEnabled, enabled, !oldEnabledESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ABSTRACT_REPETITION_HANDLER__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
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
  public SaturnStatusConditionEnum getStatusCondition()
  {
    return statusCondition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setStatusCondition(SaturnStatusConditionEnum newStatusCondition)
  {
    SaturnStatusConditionEnum oldStatusCondition = statusCondition;
    statusCondition = newStatusCondition == null ? STATUS_CONDITION_EDEFAULT : newStatusCondition;
    boolean oldStatusConditionESet = statusConditionESet;
    statusConditionESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ABSTRACT_REPETITION_HANDLER__STATUS_CONDITION, oldStatusCondition, statusCondition, !oldStatusConditionESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetStatusCondition()
  {
    SaturnStatusConditionEnum oldStatusCondition = statusCondition;
    boolean oldStatusConditionESet = statusConditionESet;
    statusCondition = STATUS_CONDITION_EDEFAULT;
    statusConditionESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ABSTRACT_REPETITION_HANDLER__STATUS_CONDITION, oldStatusCondition, STATUS_CONDITION_EDEFAULT, oldStatusConditionESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetStatusCondition()
  {
    return statusConditionESet;
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
      case TypesPackage.ABSTRACT_REPETITION_HANDLER__DEFAULT_STATUS:
        return getDefaultStatus();
      case TypesPackage.ABSTRACT_REPETITION_HANDLER__STATUS_CONDITION:
        return getStatusCondition();
      case TypesPackage.ABSTRACT_REPETITION_HANDLER__ENABLED:
        return isEnabled();
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
      case TypesPackage.ABSTRACT_REPETITION_HANDLER__DEFAULT_STATUS:
        setDefaultStatus((SaturnStatusEnum)newValue);
        return;
      case TypesPackage.ABSTRACT_REPETITION_HANDLER__STATUS_CONDITION:
        setStatusCondition((SaturnStatusConditionEnum)newValue);
        return;
      case TypesPackage.ABSTRACT_REPETITION_HANDLER__ENABLED:
        setEnabled((Boolean)newValue);
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
      case TypesPackage.ABSTRACT_REPETITION_HANDLER__DEFAULT_STATUS:
        unsetDefaultStatus();
        return;
      case TypesPackage.ABSTRACT_REPETITION_HANDLER__STATUS_CONDITION:
        unsetStatusCondition();
        return;
      case TypesPackage.ABSTRACT_REPETITION_HANDLER__ENABLED:
        unsetEnabled();
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
      case TypesPackage.ABSTRACT_REPETITION_HANDLER__DEFAULT_STATUS:
        return isSetDefaultStatus();
      case TypesPackage.ABSTRACT_REPETITION_HANDLER__STATUS_CONDITION:
        return isSetStatusCondition();
      case TypesPackage.ABSTRACT_REPETITION_HANDLER__ENABLED:
        return isSetEnabled();
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
    result.append(" (defaultStatus: ");
    if (defaultStatusESet) result.append(defaultStatus); else result.append("<unset>");
    result.append(", statusCondition: ");
    if (statusConditionESet) result.append(statusCondition); else result.append("<unset>");
    result.append(", enabled: ");
    if (enabledESet) result.append(enabled); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // AbstractRepetitionHandlerImpl
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
