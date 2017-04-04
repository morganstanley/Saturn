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

import com.ms.qaTools.saturn.modules.cpsModule.AbstractCpsOperation;
import com.ms.qaTools.saturn.modules.cpsModule.CpsConfiguration;
import com.ms.qaTools.saturn.modules.cpsModule.CpsModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Cps Configuration</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsConfigurationImpl#getCpsResource <em>Cps Resource</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsConfigurationImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CpsConfigurationImpl extends EObjectImpl implements CpsConfiguration
{
  /**
   * The cached value of the '{@link #getCpsResource() <em>Cps Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCpsResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition          cpsResource;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<AbstractCpsOperation> operations;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected CpsConfigurationImpl()
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
    return CpsModulePackage.Literals.CPS_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getCpsResource()
  {
    return cpsResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCpsResource(ResourceDefinition newCpsResource, NotificationChain msgs)
  {
    ResourceDefinition oldCpsResource = cpsResource;
    cpsResource = newCpsResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpsModulePackage.CPS_CONFIGURATION__CPS_RESOURCE, oldCpsResource, newCpsResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCpsResource(ResourceDefinition newCpsResource)
  {
    if (newCpsResource != cpsResource)
    {
      NotificationChain msgs = null;
      if (cpsResource != null)
        msgs = ((InternalEObject)cpsResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpsModulePackage.CPS_CONFIGURATION__CPS_RESOURCE, null, msgs);
      if (newCpsResource != null)
        msgs = ((InternalEObject)newCpsResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpsModulePackage.CPS_CONFIGURATION__CPS_RESOURCE, null, msgs);
      msgs = basicSetCpsResource(newCpsResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CpsModulePackage.CPS_CONFIGURATION__CPS_RESOURCE, newCpsResource, newCpsResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractCpsOperation> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<AbstractCpsOperation>(AbstractCpsOperation.class, this, CpsModulePackage.CPS_CONFIGURATION__OPERATIONS);
    }
    return operations;
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
      case CpsModulePackage.CPS_CONFIGURATION__CPS_RESOURCE:
        return basicSetCpsResource(null, msgs);
      case CpsModulePackage.CPS_CONFIGURATION__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
      case CpsModulePackage.CPS_CONFIGURATION__CPS_RESOURCE:
        return getCpsResource();
      case CpsModulePackage.CPS_CONFIGURATION__OPERATIONS:
        return getOperations();
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
      case CpsModulePackage.CPS_CONFIGURATION__CPS_RESOURCE:
        setCpsResource((ResourceDefinition)newValue);
        return;
      case CpsModulePackage.CPS_CONFIGURATION__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends AbstractCpsOperation>)newValue);
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
      case CpsModulePackage.CPS_CONFIGURATION__CPS_RESOURCE:
        setCpsResource((ResourceDefinition)null);
        return;
      case CpsModulePackage.CPS_CONFIGURATION__OPERATIONS:
        getOperations().clear();
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
      case CpsModulePackage.CPS_CONFIGURATION__CPS_RESOURCE:
        return cpsResource != null;
      case CpsModulePackage.CPS_CONFIGURATION__OPERATIONS:
        return operations != null && !operations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // CpsConfigurationImpl
