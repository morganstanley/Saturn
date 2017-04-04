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
package com.ms.qaTools.saturn.resources.transactionResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.transactionResource.AbstractEvent;
import com.ms.qaTools.saturn.resources.transactionResource.TransactionResource;
import com.ms.qaTools.saturn.resources.transactionResource.TransactionResourcePackage;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.types.impl.NamedResourceDefinitionImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Transaction Resource</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourceImpl#getManagedResource <em>Managed Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.transactionResource.impl.TransactionResourceImpl#getTermination <em>Termination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionResourceImpl extends NamedResourceDefinitionImpl implements TransactionResource
{
  /**
   * The cached value of the '{@link #getManagedResource() <em>Managed Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getManagedResource()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition managedResource;

  /**
   * The cached value of the '{@link #getTermination() <em>Termination</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getTermination()
   * @generated
   * @ordered
   */
  protected AbstractEvent           termination;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected TransactionResourceImpl()
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
    return TransactionResourcePackage.Literals.TRANSACTION_RESOURCE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getManagedResource()
  {
    return managedResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetManagedResource(NamedResourceDefinition newManagedResource, NotificationChain msgs)
  {
    NamedResourceDefinition oldManagedResource = managedResource;
    managedResource = newManagedResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransactionResourcePackage.TRANSACTION_RESOURCE__MANAGED_RESOURCE, oldManagedResource, newManagedResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setManagedResource(NamedResourceDefinition newManagedResource)
  {
    if (newManagedResource != managedResource)
    {
      NotificationChain msgs = null;
      if (managedResource != null)
        msgs = ((InternalEObject)managedResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransactionResourcePackage.TRANSACTION_RESOURCE__MANAGED_RESOURCE, null, msgs);
      if (newManagedResource != null)
        msgs = ((InternalEObject)newManagedResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransactionResourcePackage.TRANSACTION_RESOURCE__MANAGED_RESOURCE, null, msgs);
      msgs = basicSetManagedResource(newManagedResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransactionResourcePackage.TRANSACTION_RESOURCE__MANAGED_RESOURCE, newManagedResource, newManagedResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractEvent getTermination()
  {
    return termination;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTermination(AbstractEvent newTermination, NotificationChain msgs)
  {
    AbstractEvent oldTermination = termination;
    termination = newTermination;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransactionResourcePackage.TRANSACTION_RESOURCE__TERMINATION, oldTermination, newTermination);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTermination(AbstractEvent newTermination)
  {
    if (newTermination != termination)
    {
      NotificationChain msgs = null;
      if (termination != null)
        msgs = ((InternalEObject)termination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransactionResourcePackage.TRANSACTION_RESOURCE__TERMINATION, null, msgs);
      if (newTermination != null)
        msgs = ((InternalEObject)newTermination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransactionResourcePackage.TRANSACTION_RESOURCE__TERMINATION, null, msgs);
      msgs = basicSetTermination(newTermination, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransactionResourcePackage.TRANSACTION_RESOURCE__TERMINATION, newTermination, newTermination));
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
      case TransactionResourcePackage.TRANSACTION_RESOURCE__MANAGED_RESOURCE:
        return basicSetManagedResource(null, msgs);
      case TransactionResourcePackage.TRANSACTION_RESOURCE__TERMINATION:
        return basicSetTermination(null, msgs);
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
      case TransactionResourcePackage.TRANSACTION_RESOURCE__MANAGED_RESOURCE:
        return getManagedResource();
      case TransactionResourcePackage.TRANSACTION_RESOURCE__TERMINATION:
        return getTermination();
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
      case TransactionResourcePackage.TRANSACTION_RESOURCE__MANAGED_RESOURCE:
        setManagedResource((NamedResourceDefinition)newValue);
        return;
      case TransactionResourcePackage.TRANSACTION_RESOURCE__TERMINATION:
        setTermination((AbstractEvent)newValue);
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
      case TransactionResourcePackage.TRANSACTION_RESOURCE__MANAGED_RESOURCE:
        setManagedResource((NamedResourceDefinition)null);
        return;
      case TransactionResourcePackage.TRANSACTION_RESOURCE__TERMINATION:
        setTermination((AbstractEvent)null);
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
      case TransactionResourcePackage.TRANSACTION_RESOURCE__MANAGED_RESOURCE:
        return managedResource != null;
      case TransactionResourcePackage.TRANSACTION_RESOURCE__TERMINATION:
        return termination != null;
    }
    return super.eIsSet(featureID);
  }

} // TransactionResourceImpl
