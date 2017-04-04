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
package com.ms.qaTools.saturn.modules.singularityModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.modules.singularityModule.AbstractExtractAction;
import com.ms.qaTools.saturn.modules.singularityModule.SingularityModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract Extract Action</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.singularityModule.impl.AbstractExtractActionImpl#getException <em>Exception</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.singularityModule.impl.AbstractExtractActionImpl#getID <em>ID</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.singularityModule.impl.AbstractExtractActionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.singularityModule.impl.AbstractExtractActionImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.singularityModule.impl.AbstractExtractActionImpl#isRemoveDuplicates <em>Remove Duplicates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractExtractActionImpl extends EObjectImpl implements AbstractExtractAction
{
  /**
   * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException()
   * @generated
   * @ordered
   */
  protected exception            exception;

  /**
   * The cached value of the '{@link #getID() <em>ID</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getID()
   * @generated
   * @ordered
   */
  protected ComplexValue         iD;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected ResourceDefinition   output;

  /**
   * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean ENABLED_EDEFAULT           = true;

  /**
   * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected boolean              enabled                    = ENABLED_EDEFAULT;

  /**
   * This is true if the Enabled attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              enabledESet;

  /**
   * The default value of the '{@link #isRemoveDuplicates() <em>Remove Duplicates</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isRemoveDuplicates()
   * @generated
   * @ordered
   */
  protected static final boolean REMOVE_DUPLICATES_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isRemoveDuplicates() <em>Remove Duplicates</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isRemoveDuplicates()
   * @generated
   * @ordered
   */
  protected boolean              removeDuplicates           = REMOVE_DUPLICATES_EDEFAULT;

  /**
   * This is true if the Remove Duplicates attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              removeDuplicatesESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected AbstractExtractActionImpl()
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
    return SingularityModulePackage.Literals.ABSTRACT_EXTRACT_ACTION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__EXCEPTION, oldException, newException);
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
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__EXCEPTION, newException, newException));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getID()
  {
    return iD;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetID(ComplexValue newID, NotificationChain msgs)
  {
    ComplexValue oldID = iD;
    iD = newID;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__ID, oldID, newID);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setID(ComplexValue newID)
  {
    if (newID != iD)
    {
      NotificationChain msgs = null;
      if (iD != null)
        msgs = ((InternalEObject)iD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__ID, null, msgs);
      if (newID != null)
        msgs = ((InternalEObject)newID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__ID, null, msgs);
      msgs = basicSetID(newID, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__ID, newID, newID));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutput(ResourceDefinition newOutput, NotificationChain msgs)
  {
    ResourceDefinition oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__OUTPUT, oldOutput, newOutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(ResourceDefinition newOutput)
  {
    if (newOutput != output)
    {
      NotificationChain msgs = null;
      if (output != null)
        msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__OUTPUT, null, msgs);
      if (newOutput != null)
        msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__OUTPUT, null, msgs);
      msgs = basicSetOutput(newOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__OUTPUT, newOutput, newOutput));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__ENABLED, oldEnabled, enabled, !oldEnabledESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
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
  public boolean isRemoveDuplicates()
  {
    return removeDuplicates;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRemoveDuplicates(boolean newRemoveDuplicates)
  {
    boolean oldRemoveDuplicates = removeDuplicates;
    removeDuplicates = newRemoveDuplicates;
    boolean oldRemoveDuplicatesESet = removeDuplicatesESet;
    removeDuplicatesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__REMOVE_DUPLICATES, oldRemoveDuplicates, removeDuplicates, !oldRemoveDuplicatesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetRemoveDuplicates()
  {
    boolean oldRemoveDuplicates = removeDuplicates;
    boolean oldRemoveDuplicatesESet = removeDuplicatesESet;
    removeDuplicates = REMOVE_DUPLICATES_EDEFAULT;
    removeDuplicatesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__REMOVE_DUPLICATES, oldRemoveDuplicates, REMOVE_DUPLICATES_EDEFAULT, oldRemoveDuplicatesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetRemoveDuplicates()
  {
    return removeDuplicatesESet;
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
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__EXCEPTION:
        return basicSetException(null, msgs);
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__ID:
        return basicSetID(null, msgs);
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__OUTPUT:
        return basicSetOutput(null, msgs);
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
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__EXCEPTION:
        return getException();
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__ID:
        return getID();
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__OUTPUT:
        return getOutput();
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__ENABLED:
        return isEnabled();
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__REMOVE_DUPLICATES:
        return isRemoveDuplicates();
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
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__EXCEPTION:
        setException((exception)newValue);
        return;
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__ID:
        setID((ComplexValue)newValue);
        return;
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__OUTPUT:
        setOutput((ResourceDefinition)newValue);
        return;
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__ENABLED:
        setEnabled((Boolean)newValue);
        return;
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__REMOVE_DUPLICATES:
        setRemoveDuplicates((Boolean)newValue);
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
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__EXCEPTION:
        setException((exception)null);
        return;
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__ID:
        setID((ComplexValue)null);
        return;
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__OUTPUT:
        setOutput((ResourceDefinition)null);
        return;
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__ENABLED:
        unsetEnabled();
        return;
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__REMOVE_DUPLICATES:
        unsetRemoveDuplicates();
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
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__EXCEPTION:
        return exception != null;
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__ID:
        return iD != null;
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__OUTPUT:
        return output != null;
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__ENABLED:
        return isSetEnabled();
      case SingularityModulePackage.ABSTRACT_EXTRACT_ACTION__REMOVE_DUPLICATES:
        return isSetRemoveDuplicates();
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
    result.append(", removeDuplicates: ");
    if (removeDuplicatesESet) result.append(removeDuplicates); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // AbstractExtractActionImpl
