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
package com.ms.qaTools.saturn.modules.soapIOModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.modules.soapIOModule.AbstractSoapIOOperation;
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOConfiguration;
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Soap IO Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOConfigurationImpl#getSoapIOResource <em>Soap IO Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.soapIOModule.impl.SoapIOConfigurationImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoapIOConfigurationImpl extends EObjectImpl implements SoapIOConfiguration
{
  /**
   * The cached value of the '{@link #getSoapIOResource() <em>Soap IO Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSoapIOResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition      soapIOResource;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected AbstractSoapIOOperation operation;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SoapIOConfigurationImpl()
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
    return SoapIOModulePackage.Literals.SOAP_IO_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getSoapIOResource()
  {
    return soapIOResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSoapIOResource(ResourceDefinition newSoapIOResource, NotificationChain msgs)
  {
    ResourceDefinition oldSoapIOResource = soapIOResource;
    soapIOResource = newSoapIOResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_CONFIGURATION__SOAP_IO_RESOURCE, oldSoapIOResource, newSoapIOResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSoapIOResource(ResourceDefinition newSoapIOResource)
  {
    if (newSoapIOResource != soapIOResource)
    {
      NotificationChain msgs = null;
      if (soapIOResource != null)
        msgs = ((InternalEObject)soapIOResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_CONFIGURATION__SOAP_IO_RESOURCE, null, msgs);
      if (newSoapIOResource != null)
        msgs = ((InternalEObject)newSoapIOResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_CONFIGURATION__SOAP_IO_RESOURCE, null, msgs);
      msgs = basicSetSoapIOResource(newSoapIOResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_CONFIGURATION__SOAP_IO_RESOURCE, newSoapIOResource, newSoapIOResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractSoapIOOperation getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperation(AbstractSoapIOOperation newOperation, NotificationChain msgs)
  {
    AbstractSoapIOOperation oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_CONFIGURATION__OPERATION, oldOperation, newOperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(AbstractSoapIOOperation newOperation)
  {
    if (newOperation != operation)
    {
      NotificationChain msgs = null;
      if (operation != null)
        msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_CONFIGURATION__OPERATION, null, msgs);
      if (newOperation != null)
        msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOModulePackage.SOAP_IO_CONFIGURATION__OPERATION, null, msgs);
      msgs = basicSetOperation(newOperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOModulePackage.SOAP_IO_CONFIGURATION__OPERATION, newOperation, newOperation));
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
      case SoapIOModulePackage.SOAP_IO_CONFIGURATION__SOAP_IO_RESOURCE:
        return basicSetSoapIOResource(null, msgs);
      case SoapIOModulePackage.SOAP_IO_CONFIGURATION__OPERATION:
        return basicSetOperation(null, msgs);
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
      case SoapIOModulePackage.SOAP_IO_CONFIGURATION__SOAP_IO_RESOURCE:
        return getSoapIOResource();
      case SoapIOModulePackage.SOAP_IO_CONFIGURATION__OPERATION:
        return getOperation();
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
      case SoapIOModulePackage.SOAP_IO_CONFIGURATION__SOAP_IO_RESOURCE:
        setSoapIOResource((ResourceDefinition)newValue);
        return;
      case SoapIOModulePackage.SOAP_IO_CONFIGURATION__OPERATION:
        setOperation((AbstractSoapIOOperation)newValue);
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
      case SoapIOModulePackage.SOAP_IO_CONFIGURATION__SOAP_IO_RESOURCE:
        setSoapIOResource((ResourceDefinition)null);
        return;
      case SoapIOModulePackage.SOAP_IO_CONFIGURATION__OPERATION:
        setOperation((AbstractSoapIOOperation)null);
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
      case SoapIOModulePackage.SOAP_IO_CONFIGURATION__SOAP_IO_RESOURCE:
        return soapIOResource != null;
      case SoapIOModulePackage.SOAP_IO_CONFIGURATION__OPERATION:
        return operation != null;
    }
    return super.eIsSet(featureID);
  }

} // SoapIOConfigurationImpl
