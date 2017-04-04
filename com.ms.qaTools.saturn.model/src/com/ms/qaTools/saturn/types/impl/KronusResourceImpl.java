/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 */
package com.ms.qaTools.saturn.types.impl;

import com.ms.qaTools.saturn.kronus.backport.KronusCallConfiguration;

import com.ms.qaTools.saturn.types.KronusResource;
import com.ms.qaTools.saturn.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kronus Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.KronusResourceImpl#getKronusCallConfiguration <em>Kronus Call Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KronusResourceImpl extends NamedResourceDefinitionImpl implements KronusResource
{
  /**
   * The cached value of the '{@link #getKronusCallConfiguration() <em>Kronus Call Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKronusCallConfiguration()
   * @generated
   * @ordered
   */
  protected KronusCallConfiguration kronusCallConfiguration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KronusResourceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TypesPackage.Literals.KRONUS_RESOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KronusCallConfiguration getKronusCallConfiguration()
  {
    return kronusCallConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKronusCallConfiguration(KronusCallConfiguration newKronusCallConfiguration, NotificationChain msgs)
  {
    KronusCallConfiguration oldKronusCallConfiguration = kronusCallConfiguration;
    kronusCallConfiguration = newKronusCallConfiguration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.KRONUS_RESOURCE__KRONUS_CALL_CONFIGURATION, oldKronusCallConfiguration, newKronusCallConfiguration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKronusCallConfiguration(KronusCallConfiguration newKronusCallConfiguration)
  {
    if (newKronusCallConfiguration != kronusCallConfiguration)
    {
      NotificationChain msgs = null;
      if (kronusCallConfiguration != null)
        msgs = ((InternalEObject)kronusCallConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.KRONUS_RESOURCE__KRONUS_CALL_CONFIGURATION, null, msgs);
      if (newKronusCallConfiguration != null)
        msgs = ((InternalEObject)newKronusCallConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.KRONUS_RESOURCE__KRONUS_CALL_CONFIGURATION, null, msgs);
      msgs = basicSetKronusCallConfiguration(newKronusCallConfiguration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.KRONUS_RESOURCE__KRONUS_CALL_CONFIGURATION, newKronusCallConfiguration, newKronusCallConfiguration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TypesPackage.KRONUS_RESOURCE__KRONUS_CALL_CONFIGURATION:
        return basicSetKronusCallConfiguration(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TypesPackage.KRONUS_RESOURCE__KRONUS_CALL_CONFIGURATION:
        return getKronusCallConfiguration();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TypesPackage.KRONUS_RESOURCE__KRONUS_CALL_CONFIGURATION:
        setKronusCallConfiguration((KronusCallConfiguration)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TypesPackage.KRONUS_RESOURCE__KRONUS_CALL_CONFIGURATION:
        setKronusCallConfiguration((KronusCallConfiguration)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TypesPackage.KRONUS_RESOURCE__KRONUS_CALL_CONFIGURATION:
        return kronusCallConfiguration != null;
    }
    return super.eIsSet(featureID);
  }

} //KronusResourceImpl
