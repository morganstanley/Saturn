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
package com.ms.qaTools.saturn.modules.xmlManipModule.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.modules.xmlManipModule.ShiftOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Shift Operation</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ShiftOperationImpl#getOutputResource <em>Output Resource
 * </em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ShiftOperationImpl#getCount <em>Count</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ShiftOperationImpl#isRemain <em>Remain</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.ShiftOperationImpl#isRemove <em>Remove</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ShiftOperationImpl extends AbstractOperationImpl implements ShiftOperation
{
  /**
   * The cached value of the '{@link #getOutputResource() <em>Output Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOutputResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition      outputResource;

  /**
   * The default value of the '{@link #getCount() <em>Count</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected static final BigInteger COUNT_EDEFAULT  = new BigInteger("1");

  /**
   * The cached value of the '{@link #getCount() <em>Count</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected BigInteger              count           = COUNT_EDEFAULT;

  /**
   * This is true if the Count attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 countESet;

  /**
   * The default value of the '{@link #isRemain() <em>Remain</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isRemain()
   * @generated
   * @ordered
   */
  protected static final boolean    REMAIN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRemain() <em>Remain</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isRemain()
   * @generated
   * @ordered
   */
  protected boolean                 remain          = REMAIN_EDEFAULT;

  /**
   * This is true if the Remain attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 remainESet;

  /**
   * The default value of the '{@link #isRemove() <em>Remove</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isRemove()
   * @generated
   * @ordered
   */
  protected static final boolean    REMOVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRemove() <em>Remove</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isRemove()
   * @generated
   * @ordered
   */
  protected boolean                 remove          = REMOVE_EDEFAULT;

  /**
   * This is true if the Remove attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 removeESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ShiftOperationImpl()
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
    return XmlManipModulePackage.Literals.SHIFT_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getOutputResource()
  {
    return outputResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputResource(ResourceDefinition newOutputResource, NotificationChain msgs)
  {
    ResourceDefinition oldOutputResource = outputResource;
    outputResource = newOutputResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.SHIFT_OPERATION__OUTPUT_RESOURCE, oldOutputResource, newOutputResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOutputResource(ResourceDefinition newOutputResource)
  {
    if (newOutputResource != outputResource)
    {
      NotificationChain msgs = null;
      if (outputResource != null)
        msgs = ((InternalEObject)outputResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.SHIFT_OPERATION__OUTPUT_RESOURCE, null, msgs);
      if (newOutputResource != null)
        msgs = ((InternalEObject)newOutputResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.SHIFT_OPERATION__OUTPUT_RESOURCE, null, msgs);
      msgs = basicSetOutputResource(newOutputResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.SHIFT_OPERATION__OUTPUT_RESOURCE, newOutputResource, newOutputResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getCount()
  {
    return count;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCount(BigInteger newCount)
  {
    BigInteger oldCount = count;
    count = newCount;
    boolean oldCountESet = countESet;
    countESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.SHIFT_OPERATION__COUNT, oldCount, count, !oldCountESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCount()
  {
    BigInteger oldCount = count;
    boolean oldCountESet = countESet;
    count = COUNT_EDEFAULT;
    countESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XmlManipModulePackage.SHIFT_OPERATION__COUNT, oldCount, COUNT_EDEFAULT, oldCountESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCount()
  {
    return countESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isRemain()
  {
    return remain;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRemain(boolean newRemain)
  {
    boolean oldRemain = remain;
    remain = newRemain;
    boolean oldRemainESet = remainESet;
    remainESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.SHIFT_OPERATION__REMAIN, oldRemain, remain, !oldRemainESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetRemain()
  {
    boolean oldRemain = remain;
    boolean oldRemainESet = remainESet;
    remain = REMAIN_EDEFAULT;
    remainESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XmlManipModulePackage.SHIFT_OPERATION__REMAIN, oldRemain, REMAIN_EDEFAULT, oldRemainESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetRemain()
  {
    return remainESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isRemove()
  {
    return remove;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRemove(boolean newRemove)
  {
    boolean oldRemove = remove;
    remove = newRemove;
    boolean oldRemoveESet = removeESet;
    removeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.SHIFT_OPERATION__REMOVE, oldRemove, remove, !oldRemoveESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetRemove()
  {
    boolean oldRemove = remove;
    boolean oldRemoveESet = removeESet;
    remove = REMOVE_EDEFAULT;
    removeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XmlManipModulePackage.SHIFT_OPERATION__REMOVE, oldRemove, REMOVE_EDEFAULT, oldRemoveESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetRemove()
  {
    return removeESet;
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
      case XmlManipModulePackage.SHIFT_OPERATION__OUTPUT_RESOURCE:
        return basicSetOutputResource(null, msgs);
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
      case XmlManipModulePackage.SHIFT_OPERATION__OUTPUT_RESOURCE:
        return getOutputResource();
      case XmlManipModulePackage.SHIFT_OPERATION__COUNT:
        return getCount();
      case XmlManipModulePackage.SHIFT_OPERATION__REMAIN:
        return isRemain();
      case XmlManipModulePackage.SHIFT_OPERATION__REMOVE:
        return isRemove();
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
      case XmlManipModulePackage.SHIFT_OPERATION__OUTPUT_RESOURCE:
        setOutputResource((ResourceDefinition)newValue);
        return;
      case XmlManipModulePackage.SHIFT_OPERATION__COUNT:
        setCount((BigInteger)newValue);
        return;
      case XmlManipModulePackage.SHIFT_OPERATION__REMAIN:
        setRemain((Boolean)newValue);
        return;
      case XmlManipModulePackage.SHIFT_OPERATION__REMOVE:
        setRemove((Boolean)newValue);
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
      case XmlManipModulePackage.SHIFT_OPERATION__OUTPUT_RESOURCE:
        setOutputResource((ResourceDefinition)null);
        return;
      case XmlManipModulePackage.SHIFT_OPERATION__COUNT:
        unsetCount();
        return;
      case XmlManipModulePackage.SHIFT_OPERATION__REMAIN:
        unsetRemain();
        return;
      case XmlManipModulePackage.SHIFT_OPERATION__REMOVE:
        unsetRemove();
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
      case XmlManipModulePackage.SHIFT_OPERATION__OUTPUT_RESOURCE:
        return outputResource != null;
      case XmlManipModulePackage.SHIFT_OPERATION__COUNT:
        return isSetCount();
      case XmlManipModulePackage.SHIFT_OPERATION__REMAIN:
        return isSetRemain();
      case XmlManipModulePackage.SHIFT_OPERATION__REMOVE:
        return isSetRemove();
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
    result.append(" (count: ");
    if (countESet) result.append(count); else result.append("<unset>");
    result.append(", remain: ");
    if (remainESet) result.append(remain); else result.append("<unset>");
    result.append(", remove: ");
    if (removeESet) result.append(remove); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // ShiftOperationImpl
