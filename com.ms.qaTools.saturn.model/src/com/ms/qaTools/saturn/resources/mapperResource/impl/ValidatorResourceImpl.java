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
package com.ms.qaTools.saturn.resources.mapperResource.impl;

import com.ms.qaTools.saturn.resources.mapperResource.MapperResourcePackage;
import com.ms.qaTools.saturn.resources.mapperResource.ValidatorResource;

import com.ms.qaTools.saturn.types.NamedResourceDefinition;

import com.ms.qaTools.saturn.types.impl.NamedResourceDefinitionImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validator Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.mapperResource.impl.ValidatorResourceImpl#getLeftResource <em>Left Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mapperResource.impl.ValidatorResourceImpl#getRightResource <em>Right Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.mapperResource.impl.ValidatorResourceImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValidatorResourceImpl extends NamedResourceDefinitionImpl implements ValidatorResource
{
  /**
   * The cached value of the '{@link #getLeftResource() <em>Left Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftResource()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition leftResource;

  /**
   * The cached value of the '{@link #getRightResource() <em>Right Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightResource()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition rightResource;

  /**
   * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfiguration()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition configuration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValidatorResourceImpl()
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
    return MapperResourcePackage.Literals.VALIDATOR_RESOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getLeftResource()
  {
    return leftResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftResource(NamedResourceDefinition newLeftResource, NotificationChain msgs)
  {
    NamedResourceDefinition oldLeftResource = leftResource;
    leftResource = newLeftResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperResourcePackage.VALIDATOR_RESOURCE__LEFT_RESOURCE, oldLeftResource, newLeftResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftResource(NamedResourceDefinition newLeftResource)
  {
    if (newLeftResource != leftResource)
    {
      NotificationChain msgs = null;
      if (leftResource != null)
        msgs = ((InternalEObject)leftResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperResourcePackage.VALIDATOR_RESOURCE__LEFT_RESOURCE, null, msgs);
      if (newLeftResource != null)
        msgs = ((InternalEObject)newLeftResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperResourcePackage.VALIDATOR_RESOURCE__LEFT_RESOURCE, null, msgs);
      msgs = basicSetLeftResource(newLeftResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperResourcePackage.VALIDATOR_RESOURCE__LEFT_RESOURCE, newLeftResource, newLeftResource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getRightResource()
  {
    return rightResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightResource(NamedResourceDefinition newRightResource, NotificationChain msgs)
  {
    NamedResourceDefinition oldRightResource = rightResource;
    rightResource = newRightResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperResourcePackage.VALIDATOR_RESOURCE__RIGHT_RESOURCE, oldRightResource, newRightResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightResource(NamedResourceDefinition newRightResource)
  {
    if (newRightResource != rightResource)
    {
      NotificationChain msgs = null;
      if (rightResource != null)
        msgs = ((InternalEObject)rightResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperResourcePackage.VALIDATOR_RESOURCE__RIGHT_RESOURCE, null, msgs);
      if (newRightResource != null)
        msgs = ((InternalEObject)newRightResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperResourcePackage.VALIDATOR_RESOURCE__RIGHT_RESOURCE, null, msgs);
      msgs = basicSetRightResource(newRightResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperResourcePackage.VALIDATOR_RESOURCE__RIGHT_RESOURCE, newRightResource, newRightResource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getConfiguration()
  {
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfiguration(NamedResourceDefinition newConfiguration, NotificationChain msgs)
  {
    NamedResourceDefinition oldConfiguration = configuration;
    configuration = newConfiguration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapperResourcePackage.VALIDATOR_RESOURCE__CONFIGURATION, oldConfiguration, newConfiguration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConfiguration(NamedResourceDefinition newConfiguration)
  {
    if (newConfiguration != configuration)
    {
      NotificationChain msgs = null;
      if (configuration != null)
        msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapperResourcePackage.VALIDATOR_RESOURCE__CONFIGURATION, null, msgs);
      if (newConfiguration != null)
        msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapperResourcePackage.VALIDATOR_RESOURCE__CONFIGURATION, null, msgs);
      msgs = basicSetConfiguration(newConfiguration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapperResourcePackage.VALIDATOR_RESOURCE__CONFIGURATION, newConfiguration, newConfiguration));
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
      case MapperResourcePackage.VALIDATOR_RESOURCE__LEFT_RESOURCE:
        return basicSetLeftResource(null, msgs);
      case MapperResourcePackage.VALIDATOR_RESOURCE__RIGHT_RESOURCE:
        return basicSetRightResource(null, msgs);
      case MapperResourcePackage.VALIDATOR_RESOURCE__CONFIGURATION:
        return basicSetConfiguration(null, msgs);
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
      case MapperResourcePackage.VALIDATOR_RESOURCE__LEFT_RESOURCE:
        return getLeftResource();
      case MapperResourcePackage.VALIDATOR_RESOURCE__RIGHT_RESOURCE:
        return getRightResource();
      case MapperResourcePackage.VALIDATOR_RESOURCE__CONFIGURATION:
        return getConfiguration();
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
      case MapperResourcePackage.VALIDATOR_RESOURCE__LEFT_RESOURCE:
        setLeftResource((NamedResourceDefinition)newValue);
        return;
      case MapperResourcePackage.VALIDATOR_RESOURCE__RIGHT_RESOURCE:
        setRightResource((NamedResourceDefinition)newValue);
        return;
      case MapperResourcePackage.VALIDATOR_RESOURCE__CONFIGURATION:
        setConfiguration((NamedResourceDefinition)newValue);
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
      case MapperResourcePackage.VALIDATOR_RESOURCE__LEFT_RESOURCE:
        setLeftResource((NamedResourceDefinition)null);
        return;
      case MapperResourcePackage.VALIDATOR_RESOURCE__RIGHT_RESOURCE:
        setRightResource((NamedResourceDefinition)null);
        return;
      case MapperResourcePackage.VALIDATOR_RESOURCE__CONFIGURATION:
        setConfiguration((NamedResourceDefinition)null);
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
      case MapperResourcePackage.VALIDATOR_RESOURCE__LEFT_RESOURCE:
        return leftResource != null;
      case MapperResourcePackage.VALIDATOR_RESOURCE__RIGHT_RESOURCE:
        return rightResource != null;
      case MapperResourcePackage.VALIDATOR_RESOURCE__CONFIGURATION:
        return configuration != null;
    }
    return super.eIsSet(featureID);
  }

} //ValidatorResourceImpl
