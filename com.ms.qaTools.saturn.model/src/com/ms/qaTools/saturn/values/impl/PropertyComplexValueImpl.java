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
package com.ms.qaTools.saturn.values.impl;

import com.ms.qaTools.saturn.types.ResourceDefinition;

import com.ms.qaTools.saturn.values.ComplexValue;
import com.ms.qaTools.saturn.values.Describable;
import com.ms.qaTools.saturn.values.FailBehaviorsEnum;
import com.ms.qaTools.saturn.values.PropertyComplexValue;
import com.ms.qaTools.saturn.values.ValuesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Complex Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.PropertyComplexValueImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.PropertyComplexValueImpl#getFailBehavior <em>Fail Behavior</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.PropertyComplexValueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.PropertyComplexValueImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.PropertyComplexValueImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyComplexValueImpl extends EObjectImpl implements PropertyComplexValue
{
  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected ComplexValue defaultValue;

  /**
   * The default value of the '{@link #getFailBehavior() <em>Fail Behavior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFailBehavior()
   * @generated
   * @ordered
   */
  protected static final FailBehaviorsEnum FAIL_BEHAVIOR_EDEFAULT = FailBehaviorsEnum.IGNORE;

  /**
   * The cached value of the '{@link #getFailBehavior() <em>Fail Behavior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFailBehavior()
   * @generated
   * @ordered
   */
  protected FailBehaviorsEnum failBehavior = FAIL_BEHAVIOR_EDEFAULT;

  /**
   * This is true if the Fail Behavior attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean failBehaviorESet;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition resource;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected ComplexValue property;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyComplexValueImpl()
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
    return ValuesPackage.Literals.PROPERTY_COMPLEX_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultValue(ComplexValue newDefaultValue, NotificationChain msgs)
  {
    ComplexValue oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.PROPERTY_COMPLEX_VALUE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(ComplexValue newDefaultValue)
  {
    if (newDefaultValue != defaultValue)
    {
      NotificationChain msgs = null;
      if (defaultValue != null)
        msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.PROPERTY_COMPLEX_VALUE__DEFAULT_VALUE, null, msgs);
      if (newDefaultValue != null)
        msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.PROPERTY_COMPLEX_VALUE__DEFAULT_VALUE, null, msgs);
      msgs = basicSetDefaultValue(newDefaultValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.PROPERTY_COMPLEX_VALUE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FailBehaviorsEnum getFailBehavior()
  {
    return failBehavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFailBehavior(FailBehaviorsEnum newFailBehavior)
  {
    FailBehaviorsEnum oldFailBehavior = failBehavior;
    failBehavior = newFailBehavior == null ? FAIL_BEHAVIOR_EDEFAULT : newFailBehavior;
    boolean oldFailBehaviorESet = failBehaviorESet;
    failBehaviorESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.PROPERTY_COMPLEX_VALUE__FAIL_BEHAVIOR, oldFailBehavior, failBehavior, !oldFailBehaviorESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetFailBehavior()
  {
    FailBehaviorsEnum oldFailBehavior = failBehavior;
    boolean oldFailBehaviorESet = failBehaviorESet;
    failBehavior = FAIL_BEHAVIOR_EDEFAULT;
    failBehaviorESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ValuesPackage.PROPERTY_COMPLEX_VALUE__FAIL_BEHAVIOR, oldFailBehavior, FAIL_BEHAVIOR_EDEFAULT, oldFailBehaviorESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetFailBehavior()
  {
    return failBehaviorESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.PROPERTY_COMPLEX_VALUE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getResource()
  {
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResource(ResourceDefinition newResource, NotificationChain msgs)
  {
    ResourceDefinition oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.PROPERTY_COMPLEX_VALUE__RESOURCE, oldResource, newResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResource(ResourceDefinition newResource)
  {
    if (newResource != resource)
    {
      NotificationChain msgs = null;
      if (resource != null)
        msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.PROPERTY_COMPLEX_VALUE__RESOURCE, null, msgs);
      if (newResource != null)
        msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.PROPERTY_COMPLEX_VALUE__RESOURCE, null, msgs);
      msgs = basicSetResource(newResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.PROPERTY_COMPLEX_VALUE__RESOURCE, newResource, newResource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperty(ComplexValue newProperty, NotificationChain msgs)
  {
    ComplexValue oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.PROPERTY_COMPLEX_VALUE__PROPERTY, oldProperty, newProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(ComplexValue newProperty)
  {
    if (newProperty != property)
    {
      NotificationChain msgs = null;
      if (property != null)
        msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.PROPERTY_COMPLEX_VALUE__PROPERTY, null, msgs);
      if (newProperty != null)
        msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.PROPERTY_COMPLEX_VALUE__PROPERTY, null, msgs);
      msgs = basicSetProperty(newProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.PROPERTY_COMPLEX_VALUE__PROPERTY, newProperty, newProperty));
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
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__DEFAULT_VALUE:
        return basicSetDefaultValue(null, msgs);
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__RESOURCE:
        return basicSetResource(null, msgs);
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__PROPERTY:
        return basicSetProperty(null, msgs);
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
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__DEFAULT_VALUE:
        return getDefaultValue();
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__FAIL_BEHAVIOR:
        return getFailBehavior();
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__DESCRIPTION:
        return getDescription();
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__RESOURCE:
        return getResource();
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__PROPERTY:
        return getProperty();
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
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__DEFAULT_VALUE:
        setDefaultValue((ComplexValue)newValue);
        return;
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__FAIL_BEHAVIOR:
        setFailBehavior((FailBehaviorsEnum)newValue);
        return;
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__RESOURCE:
        setResource((ResourceDefinition)newValue);
        return;
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__PROPERTY:
        setProperty((ComplexValue)newValue);
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
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__DEFAULT_VALUE:
        setDefaultValue((ComplexValue)null);
        return;
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__FAIL_BEHAVIOR:
        unsetFailBehavior();
        return;
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__RESOURCE:
        setResource((ResourceDefinition)null);
        return;
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__PROPERTY:
        setProperty((ComplexValue)null);
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
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__DEFAULT_VALUE:
        return defaultValue != null;
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__FAIL_BEHAVIOR:
        return isSetFailBehavior();
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__RESOURCE:
        return resource != null;
      case ValuesPackage.PROPERTY_COMPLEX_VALUE__PROPERTY:
        return property != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Describable.class)
    {
      switch (derivedFeatureID)
      {
        case ValuesPackage.PROPERTY_COMPLEX_VALUE__DESCRIPTION: return ValuesPackage.DESCRIBABLE__DESCRIPTION;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Describable.class)
    {
      switch (baseFeatureID)
      {
        case ValuesPackage.DESCRIBABLE__DESCRIPTION: return ValuesPackage.PROPERTY_COMPLEX_VALUE__DESCRIPTION;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (failBehavior: ");
    if (failBehaviorESet) result.append(failBehavior); else result.append("<unset>");
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //PropertyComplexValueImpl
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
