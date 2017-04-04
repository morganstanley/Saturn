package com.ms.qaTools.saturn.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.types.TypesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Resource Definition</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.ResourceDefinitionImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.ResourceDefinitionImpl#getState <em>State</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.ResourceDefinitionImpl#getConnectorPreference <em>Connector Preference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResourceDefinitionImpl extends EObjectImpl implements ResourceDefinition
{
  /**
   * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean ENABLED_EDEFAULT              = true;

  /**
   * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected boolean              enabled                       = ENABLED_EDEFAULT;

  /**
   * This is true if the Enabled attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              enabledESet;

  /**
   * The default value of the '{@link #getState() <em>State</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getState()
   * @generated
   * @ordered
   */
  protected static final String  STATE_EDEFAULT                = "";

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getState()
   * @generated
   * @ordered
   */
  protected String               state                         = STATE_EDEFAULT;

  /**
   * This is true if the State attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              stateESet;

  /**
   * The default value of the '{@link #getConnectorPreference() <em>Connector Preference</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getConnectorPreference()
   * @generated
   * @ordered
   */
  protected static final String  CONNECTOR_PREFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConnectorPreference() <em>Connector Preference</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getConnectorPreference()
   * @generated
   * @ordered
   */
  protected String               connectorPreference           = CONNECTOR_PREFERENCE_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ResourceDefinitionImpl()
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
    return TypesPackage.Literals.RESOURCE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getConnectorPreference()
  {
    return connectorPreference;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setConnectorPreference(String newConnectorPreference)
  {
    String oldConnectorPreference = connectorPreference;
    connectorPreference = newConnectorPreference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RESOURCE_DEFINITION__CONNECTOR_PREFERENCE, oldConnectorPreference, connectorPreference));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RESOURCE_DEFINITION__ENABLED, oldEnabled, enabled, !oldEnabledESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.RESOURCE_DEFINITION__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
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
  public String getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setState(String newState)
  {
    String oldState = state;
    state = newState;
    boolean oldStateESet = stateESet;
    stateESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RESOURCE_DEFINITION__STATE, oldState, state, !oldStateESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetState()
  {
    String oldState = state;
    boolean oldStateESet = stateESet;
    state = STATE_EDEFAULT;
    stateESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.RESOURCE_DEFINITION__STATE, oldState, STATE_EDEFAULT, oldStateESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetState()
  {
    return stateESet;
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
      case TypesPackage.RESOURCE_DEFINITION__ENABLED:
        return isEnabled();
      case TypesPackage.RESOURCE_DEFINITION__STATE:
        return getState();
      case TypesPackage.RESOURCE_DEFINITION__CONNECTOR_PREFERENCE:
        return getConnectorPreference();
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
      case TypesPackage.RESOURCE_DEFINITION__ENABLED:
        setEnabled((Boolean)newValue);
        return;
      case TypesPackage.RESOURCE_DEFINITION__STATE:
        setState((String)newValue);
        return;
      case TypesPackage.RESOURCE_DEFINITION__CONNECTOR_PREFERENCE:
        setConnectorPreference((String)newValue);
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
      case TypesPackage.RESOURCE_DEFINITION__ENABLED:
        unsetEnabled();
        return;
      case TypesPackage.RESOURCE_DEFINITION__STATE:
        unsetState();
        return;
      case TypesPackage.RESOURCE_DEFINITION__CONNECTOR_PREFERENCE:
        setConnectorPreference(CONNECTOR_PREFERENCE_EDEFAULT);
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
      case TypesPackage.RESOURCE_DEFINITION__ENABLED:
        return isSetEnabled();
      case TypesPackage.RESOURCE_DEFINITION__STATE:
        return isSetState();
      case TypesPackage.RESOURCE_DEFINITION__CONNECTOR_PREFERENCE:
        return CONNECTOR_PREFERENCE_EDEFAULT == null ? connectorPreference != null : !CONNECTOR_PREFERENCE_EDEFAULT.equals(connectorPreference);
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
    result.append(" (enabled: ");
    if (enabledESet) result.append(enabled); else result.append("<unset>");
    result.append(", state: ");
    if (stateESet) result.append(state); else result.append("<unset>");
    result.append(", connectorPreference: ");
    result.append(connectorPreference);
    result.append(')');
    return result.toString();
  }

} // ResourceDefinitionImpl
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
