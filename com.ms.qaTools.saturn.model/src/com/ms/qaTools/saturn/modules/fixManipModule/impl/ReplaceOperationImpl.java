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
package com.ms.qaTools.saturn.modules.fixManipModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.modules.fixManipModule.FixManipModulePackage;
import com.ms.qaTools.saturn.modules.fixManipModule.ReplaceOperation;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Replace Operation</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.ReplaceOperationImpl#getTag <em>Tag</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.ReplaceOperationImpl#getOldValue <em>Old Value</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.ReplaceOperationImpl#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ReplaceOperationImpl extends AbstractOperationImpl implements ReplaceOperation
{
  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected ComplexValue tag;

  /**
   * The cached value of the '{@link #getOldValue() <em>Old Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOldValue()
   * @generated
   * @ordered
   */
  protected ComplexValue oldValue;

  /**
   * The cached value of the '{@link #getNewValue() <em>New Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewValue()
   * @generated
   * @ordered
   */
  protected ComplexValue newValue;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ReplaceOperationImpl()
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
    return FixManipModulePackage.Literals.REPLACE_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getTag()
  {
    return tag;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTag(ComplexValue newTag, NotificationChain msgs)
  {
    ComplexValue oldTag = tag;
    tag = newTag;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixManipModulePackage.REPLACE_OPERATION__TAG, oldTag, newTag);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTag(ComplexValue newTag)
  {
    if (newTag != tag)
    {
      NotificationChain msgs = null;
      if (tag != null)
        msgs = ((InternalEObject)tag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixManipModulePackage.REPLACE_OPERATION__TAG, null, msgs);
      if (newTag != null)
        msgs = ((InternalEObject)newTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixManipModulePackage.REPLACE_OPERATION__TAG, null, msgs);
      msgs = basicSetTag(newTag, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixManipModulePackage.REPLACE_OPERATION__TAG, newTag, newTag));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getOldValue()
  {
    return oldValue;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOldValue(ComplexValue newOldValue, NotificationChain msgs)
  {
    ComplexValue oldOldValue = oldValue;
    oldValue = newOldValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixManipModulePackage.REPLACE_OPERATION__OLD_VALUE, oldOldValue, newOldValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOldValue(ComplexValue newOldValue)
  {
    if (newOldValue != oldValue)
    {
      NotificationChain msgs = null;
      if (oldValue != null)
        msgs = ((InternalEObject)oldValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixManipModulePackage.REPLACE_OPERATION__OLD_VALUE, null, msgs);
      if (newOldValue != null)
        msgs = ((InternalEObject)newOldValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixManipModulePackage.REPLACE_OPERATION__OLD_VALUE, null, msgs);
      msgs = basicSetOldValue(newOldValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixManipModulePackage.REPLACE_OPERATION__OLD_VALUE, newOldValue, newOldValue));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getNewValue()
  {
    return newValue;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNewValue(ComplexValue newNewValue, NotificationChain msgs)
  {
    ComplexValue oldNewValue = newValue;
    newValue = newNewValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixManipModulePackage.REPLACE_OPERATION__NEW_VALUE, oldNewValue, newNewValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNewValue(ComplexValue newNewValue)
  {
    if (newNewValue != newValue)
    {
      NotificationChain msgs = null;
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixManipModulePackage.REPLACE_OPERATION__NEW_VALUE, null, msgs);
      if (newNewValue != null)
        msgs = ((InternalEObject)newNewValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixManipModulePackage.REPLACE_OPERATION__NEW_VALUE, null, msgs);
      msgs = basicSetNewValue(newNewValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixManipModulePackage.REPLACE_OPERATION__NEW_VALUE, newNewValue, newNewValue));
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
      case FixManipModulePackage.REPLACE_OPERATION__TAG:
        return basicSetTag(null, msgs);
      case FixManipModulePackage.REPLACE_OPERATION__OLD_VALUE:
        return basicSetOldValue(null, msgs);
      case FixManipModulePackage.REPLACE_OPERATION__NEW_VALUE:
        return basicSetNewValue(null, msgs);
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
      case FixManipModulePackage.REPLACE_OPERATION__TAG:
        return getTag();
      case FixManipModulePackage.REPLACE_OPERATION__OLD_VALUE:
        return getOldValue();
      case FixManipModulePackage.REPLACE_OPERATION__NEW_VALUE:
        return getNewValue();
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
      case FixManipModulePackage.REPLACE_OPERATION__TAG:
        setTag((ComplexValue)newValue);
        return;
      case FixManipModulePackage.REPLACE_OPERATION__OLD_VALUE:
        setOldValue((ComplexValue)newValue);
        return;
      case FixManipModulePackage.REPLACE_OPERATION__NEW_VALUE:
        setNewValue((ComplexValue)newValue);
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
      case FixManipModulePackage.REPLACE_OPERATION__TAG:
        setTag((ComplexValue)null);
        return;
      case FixManipModulePackage.REPLACE_OPERATION__OLD_VALUE:
        setOldValue((ComplexValue)null);
        return;
      case FixManipModulePackage.REPLACE_OPERATION__NEW_VALUE:
        setNewValue((ComplexValue)null);
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
      case FixManipModulePackage.REPLACE_OPERATION__TAG:
        return tag != null;
      case FixManipModulePackage.REPLACE_OPERATION__OLD_VALUE:
        return oldValue != null;
      case FixManipModulePackage.REPLACE_OPERATION__NEW_VALUE:
        return newValue != null;
    }
    return super.eIsSet(featureID);
  }

} // ReplaceOperationImpl
