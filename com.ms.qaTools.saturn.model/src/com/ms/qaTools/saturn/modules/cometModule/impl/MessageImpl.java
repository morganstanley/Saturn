package com.ms.qaTools.saturn.modules.cometModule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.modules.cometModule.AbstractDescriptor;
import com.ms.qaTools.saturn.modules.cometModule.CometModulePackage;
import com.ms.qaTools.saturn.modules.cometModule.Message;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Message</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.cometModule.impl.MessageImpl#getDescriptors <em>Descriptors</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.cometModule.impl.MessageImpl#getCheckpoint <em>Checkpoint</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.cometModule.impl.MessageImpl#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends EObjectImpl implements Message
{
  /**
   * The cached value of the '{@link #getDescriptors() <em>Descriptors</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDescriptors()
   * @generated
   * @ordered
   */
  protected EList<AbstractDescriptor> descriptors;

  /**
   * The cached value of the '{@link #getCheckpoint() <em>Checkpoint</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getCheckpoint()
   * @generated
   * @ordered
   */
  protected ComplexValue              checkpoint;

  /**
   * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean      ENABLED_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected boolean                   enabled          = ENABLED_EDEFAULT;

  /**
   * This is true if the Enabled attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   enabledESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MessageImpl()
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
    return CometModulePackage.Literals.MESSAGE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractDescriptor> getDescriptors()
  {
    if (descriptors == null)
    {
      descriptors = new EObjectContainmentEList<AbstractDescriptor>(AbstractDescriptor.class, this, CometModulePackage.MESSAGE__DESCRIPTORS);
    }
    return descriptors;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getCheckpoint()
  {
    return checkpoint;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCheckpoint(ComplexValue newCheckpoint, NotificationChain msgs)
  {
    ComplexValue oldCheckpoint = checkpoint;
    checkpoint = newCheckpoint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CometModulePackage.MESSAGE__CHECKPOINT, oldCheckpoint, newCheckpoint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCheckpoint(ComplexValue newCheckpoint)
  {
    if (newCheckpoint != checkpoint)
    {
      NotificationChain msgs = null;
      if (checkpoint != null)
        msgs = ((InternalEObject)checkpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CometModulePackage.MESSAGE__CHECKPOINT, null, msgs);
      if (newCheckpoint != null)
        msgs = ((InternalEObject)newCheckpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CometModulePackage.MESSAGE__CHECKPOINT, null, msgs);
      msgs = basicSetCheckpoint(newCheckpoint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CometModulePackage.MESSAGE__CHECKPOINT, newCheckpoint, newCheckpoint));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CometModulePackage.MESSAGE__ENABLED, oldEnabled, enabled, !oldEnabledESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, CometModulePackage.MESSAGE__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CometModulePackage.MESSAGE__DESCRIPTORS:
        return ((InternalEList<?>)getDescriptors()).basicRemove(otherEnd, msgs);
      case CometModulePackage.MESSAGE__CHECKPOINT:
        return basicSetCheckpoint(null, msgs);
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
      case CometModulePackage.MESSAGE__DESCRIPTORS:
        return getDescriptors();
      case CometModulePackage.MESSAGE__CHECKPOINT:
        return getCheckpoint();
      case CometModulePackage.MESSAGE__ENABLED:
        return isEnabled();
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
      case CometModulePackage.MESSAGE__DESCRIPTORS:
        getDescriptors().clear();
        getDescriptors().addAll((Collection<? extends AbstractDescriptor>)newValue);
        return;
      case CometModulePackage.MESSAGE__CHECKPOINT:
        setCheckpoint((ComplexValue)newValue);
        return;
      case CometModulePackage.MESSAGE__ENABLED:
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
      case CometModulePackage.MESSAGE__DESCRIPTORS:
        getDescriptors().clear();
        return;
      case CometModulePackage.MESSAGE__CHECKPOINT:
        setCheckpoint((ComplexValue)null);
        return;
      case CometModulePackage.MESSAGE__ENABLED:
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
      case CometModulePackage.MESSAGE__DESCRIPTORS:
        return descriptors != null && !descriptors.isEmpty();
      case CometModulePackage.MESSAGE__CHECKPOINT:
        return checkpoint != null;
      case CometModulePackage.MESSAGE__ENABLED:
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
    result.append(" (enabled: ");
    if (enabledESet) result.append(enabled); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // MessageImpl
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
