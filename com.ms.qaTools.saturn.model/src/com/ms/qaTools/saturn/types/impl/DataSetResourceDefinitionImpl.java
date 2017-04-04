package com.ms.qaTools.saturn.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.types.DataSet;
import com.ms.qaTools.saturn.types.DataSetResourceDefinition;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.types.TypesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Data Set Resource Definition</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.DataSetResourceDefinitionImpl#getDeviceResource <em>Device Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.DataSetResourceDefinitionImpl#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.DataSetResourceDefinitionImpl#isHasColNames <em>Has Col Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataSetResourceDefinitionImpl extends NamedResourceDefinitionImpl implements
    DataSetResourceDefinition
{
  /**
   * The cached value of the '{@link #getDeviceResource() <em>Device Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDeviceResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition   deviceResource;

  /**
   * The cached value of the '{@link #getDataSet() <em>Data Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataSet()
   * @generated
   * @ordered
   */
  protected DataSet              dataSet;

  /**
   * The default value of the '{@link #isHasColNames() <em>Has Col Names</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isHasColNames()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_COL_NAMES_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isHasColNames() <em>Has Col Names</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isHasColNames()
   * @generated
   * @ordered
   */
  protected boolean              hasColNames            = HAS_COL_NAMES_EDEFAULT;

  /**
   * This is true if the Has Col Names attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              hasColNamesESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected DataSetResourceDefinitionImpl()
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
    return TypesPackage.Literals.DATA_SET_RESOURCE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getDeviceResource()
  {
    return deviceResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeviceResource(ResourceDefinition newDeviceResource, NotificationChain msgs)
  {
    ResourceDefinition oldDeviceResource = deviceResource;
    deviceResource = newDeviceResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE, oldDeviceResource, newDeviceResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDeviceResource(ResourceDefinition newDeviceResource)
  {
    if (newDeviceResource != deviceResource)
    {
      NotificationChain msgs = null;
      if (deviceResource != null)
        msgs = ((InternalEObject)deviceResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE, null, msgs);
      if (newDeviceResource != null)
        msgs = ((InternalEObject)newDeviceResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE, null, msgs);
      msgs = basicSetDeviceResource(newDeviceResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE, newDeviceResource, newDeviceResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataSet getDataSet()
  {
    return dataSet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataSet(DataSet newDataSet, NotificationChain msgs)
  {
    DataSet oldDataSet = dataSet;
    dataSet = newDataSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_RESOURCE_DEFINITION__DATA_SET, oldDataSet, newDataSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDataSet(DataSet newDataSet)
  {
    if (newDataSet != dataSet)
    {
      NotificationChain msgs = null;
      if (dataSet != null)
        msgs = ((InternalEObject)dataSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_RESOURCE_DEFINITION__DATA_SET, null, msgs);
      if (newDataSet != null)
        msgs = ((InternalEObject)newDataSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.DATA_SET_RESOURCE_DEFINITION__DATA_SET, null, msgs);
      msgs = basicSetDataSet(newDataSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_RESOURCE_DEFINITION__DATA_SET, newDataSet, newDataSet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasColNames()
  {
    return hasColNames;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setHasColNames(boolean newHasColNames)
  {
    boolean oldHasColNames = hasColNames;
    hasColNames = newHasColNames;
    boolean oldHasColNamesESet = hasColNamesESet;
    hasColNamesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET_RESOURCE_DEFINITION__HAS_COL_NAMES, oldHasColNames, hasColNames, !oldHasColNamesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetHasColNames()
  {
    boolean oldHasColNames = hasColNames;
    boolean oldHasColNamesESet = hasColNamesESet;
    hasColNames = HAS_COL_NAMES_EDEFAULT;
    hasColNamesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET_RESOURCE_DEFINITION__HAS_COL_NAMES, oldHasColNames, HAS_COL_NAMES_EDEFAULT, oldHasColNamesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetHasColNames()
  {
    return hasColNamesESet;
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
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE:
        return basicSetDeviceResource(null, msgs);
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION__DATA_SET:
        return basicSetDataSet(null, msgs);
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
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE:
        return getDeviceResource();
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION__DATA_SET:
        return getDataSet();
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION__HAS_COL_NAMES:
        return isHasColNames();
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
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE:
        setDeviceResource((ResourceDefinition)newValue);
        return;
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION__DATA_SET:
        setDataSet((DataSet)newValue);
        return;
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION__HAS_COL_NAMES:
        setHasColNames((Boolean)newValue);
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
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE:
        setDeviceResource((ResourceDefinition)null);
        return;
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION__DATA_SET:
        setDataSet((DataSet)null);
        return;
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION__HAS_COL_NAMES:
        unsetHasColNames();
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
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION__DEVICE_RESOURCE:
        return deviceResource != null;
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION__DATA_SET:
        return dataSet != null;
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION__HAS_COL_NAMES:
        return isSetHasColNames();
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
    result.append(" (hasColNames: ");
    if (hasColNamesESet) result.append(hasColNames); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // DataSetResourceDefinitionImpl
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
