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
package com.ms.qaTools.saturn.resources.dataSetResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.dataSetResource.DataSetInstanceResource;
import com.ms.qaTools.saturn.resources.dataSetResource.DataSetResourcePackage;
import com.ms.qaTools.saturn.types.DataSetInstance;
import com.ms.qaTools.saturn.types.impl.DataSetResourceDefinitionImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Data Set Instance Resource</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.dataSetResource.impl.DataSetInstanceResourceImpl#getDataSetInstance <em>Data Set Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSetInstanceResourceImpl extends DataSetResourceDefinitionImpl implements DataSetInstanceResource
{
  /**
   * The cached value of the '{@link #getDataSetInstance() <em>Data Set Instance</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDataSetInstance()
   * @generated
   * @ordered
   */
  protected DataSetInstance dataSetInstance;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected DataSetInstanceResourceImpl()
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
    return DataSetResourcePackage.Literals.DATA_SET_INSTANCE_RESOURCE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataSetInstance getDataSetInstance()
  {
    return dataSetInstance;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataSetInstance(DataSetInstance newDataSetInstance, NotificationChain msgs)
  {
    DataSetInstance oldDataSetInstance = dataSetInstance;
    dataSetInstance = newDataSetInstance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataSetResourcePackage.DATA_SET_INSTANCE_RESOURCE__DATA_SET_INSTANCE, oldDataSetInstance, newDataSetInstance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDataSetInstance(DataSetInstance newDataSetInstance)
  {
    if (newDataSetInstance != dataSetInstance)
    {
      NotificationChain msgs = null;
      if (dataSetInstance != null)
        msgs = ((InternalEObject)dataSetInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataSetResourcePackage.DATA_SET_INSTANCE_RESOURCE__DATA_SET_INSTANCE, null, msgs);
      if (newDataSetInstance != null)
        msgs = ((InternalEObject)newDataSetInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataSetResourcePackage.DATA_SET_INSTANCE_RESOURCE__DATA_SET_INSTANCE, null, msgs);
      msgs = basicSetDataSetInstance(newDataSetInstance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataSetResourcePackage.DATA_SET_INSTANCE_RESOURCE__DATA_SET_INSTANCE, newDataSetInstance, newDataSetInstance));
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
      case DataSetResourcePackage.DATA_SET_INSTANCE_RESOURCE__DATA_SET_INSTANCE:
        return basicSetDataSetInstance(null, msgs);
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
      case DataSetResourcePackage.DATA_SET_INSTANCE_RESOURCE__DATA_SET_INSTANCE:
        return getDataSetInstance();
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
      case DataSetResourcePackage.DATA_SET_INSTANCE_RESOURCE__DATA_SET_INSTANCE:
        setDataSetInstance((DataSetInstance)newValue);
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
      case DataSetResourcePackage.DATA_SET_INSTANCE_RESOURCE__DATA_SET_INSTANCE:
        setDataSetInstance((DataSetInstance)null);
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
      case DataSetResourcePackage.DATA_SET_INSTANCE_RESOURCE__DATA_SET_INSTANCE:
        return dataSetInstance != null;
    }
    return super.eIsSet(featureID);
  }

} // DataSetInstanceResourceImpl
