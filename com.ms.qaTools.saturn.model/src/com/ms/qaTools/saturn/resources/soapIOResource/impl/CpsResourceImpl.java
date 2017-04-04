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
package com.ms.qaTools.saturn.resources.soapIOResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.CpsResource;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage;
import com.ms.qaTools.saturn.types.impl.DeviceResourceDefinitionImpl;
import com.ms.qaTools.saturn.types.impl.NamedResourceDefinitionImpl;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Cps Resource</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.CpsResourceImpl#getTimeOut <em>Time Out</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.CpsResourceImpl#getTransport <em>Transport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CpsResourceImpl extends DeviceResourceDefinitionImpl implements CpsResource
{
  /**
   * The cached value of the '{@link #getTimeOut() <em>Time Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeOut()
   * @generated
   * @ordered
   */
  protected ComplexValue timeOut;

  /**
   * The cached value of the '{@link #getTransport() <em>Transport</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransport()
   * @generated
   * @ordered
   */
  protected CPSTransport transport;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected CpsResourceImpl()
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
    return SoapIOResourcePackage.Literals.CPS_RESOURCE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getTimeOut()
  {
    return timeOut;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimeOut(ComplexValue newTimeOut, NotificationChain msgs)
  {
    ComplexValue oldTimeOut = timeOut;
    timeOut = newTimeOut;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_RESOURCE__TIME_OUT, oldTimeOut, newTimeOut);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTimeOut(ComplexValue newTimeOut)
  {
    if (newTimeOut != timeOut)
    {
      NotificationChain msgs = null;
      if (timeOut != null)
        msgs = ((InternalEObject)timeOut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_RESOURCE__TIME_OUT, null, msgs);
      if (newTimeOut != null)
        msgs = ((InternalEObject)newTimeOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_RESOURCE__TIME_OUT, null, msgs);
      msgs = basicSetTimeOut(newTimeOut, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_RESOURCE__TIME_OUT, newTimeOut, newTimeOut));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CPSTransport getTransport()
  {
    return transport;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransport(CPSTransport newTransport, NotificationChain msgs)
  {
    CPSTransport oldTransport = transport;
    transport = newTransport;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_RESOURCE__TRANSPORT, oldTransport, newTransport);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTransport(CPSTransport newTransport)
  {
    if (newTransport != transport)
    {
      NotificationChain msgs = null;
      if (transport != null)
        msgs = ((InternalEObject)transport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_RESOURCE__TRANSPORT, null, msgs);
      if (newTransport != null)
        msgs = ((InternalEObject)newTransport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_RESOURCE__TRANSPORT, null, msgs);
      msgs = basicSetTransport(newTransport, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_RESOURCE__TRANSPORT, newTransport, newTransport));
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
      case SoapIOResourcePackage.CPS_RESOURCE__TIME_OUT:
        return basicSetTimeOut(null, msgs);
      case SoapIOResourcePackage.CPS_RESOURCE__TRANSPORT:
        return basicSetTransport(null, msgs);
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
      case SoapIOResourcePackage.CPS_RESOURCE__TIME_OUT:
        return getTimeOut();
      case SoapIOResourcePackage.CPS_RESOURCE__TRANSPORT:
        return getTransport();
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
      case SoapIOResourcePackage.CPS_RESOURCE__TIME_OUT:
        setTimeOut((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.CPS_RESOURCE__TRANSPORT:
        setTransport((CPSTransport)newValue);
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
      case SoapIOResourcePackage.CPS_RESOURCE__TIME_OUT:
        setTimeOut((ComplexValue)null);
        return;
      case SoapIOResourcePackage.CPS_RESOURCE__TRANSPORT:
        setTransport((CPSTransport)null);
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
      case SoapIOResourcePackage.CPS_RESOURCE__TIME_OUT:
        return timeOut != null;
      case SoapIOResourcePackage.CPS_RESOURCE__TRANSPORT:
        return transport != null;
    }
    return super.eIsSet(featureID);
  }

} // CpsResourceImpl
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
