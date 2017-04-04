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
package com.ms.qaTools.saturn.resources.soapIOResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.soapIOResource.AbstractTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage;
import com.ms.qaTools.saturn.types.impl.DeviceResourceDefinitionImpl;
import com.ms.qaTools.saturn.types.impl.NamedResourceDefinitionImpl;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Soap IO Resource</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourceImpl#getTimeOut <em>Time Out</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.SoapIOResourceImpl#getTransport <em>Transport</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SoapIOResourceImpl extends DeviceResourceDefinitionImpl implements SoapIOResource
{
  /**
   * The cached value of the '{@link #getTimeOut() <em>Time Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeOut()
   * @generated
   * @ordered
   */
  protected ComplexValue      timeOut;

  /**
   * The cached value of the '{@link #getTransport() <em>Transport</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransport()
   * @generated
   * @ordered
   */
  protected AbstractTransport transport;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SoapIOResourceImpl()
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
    return SoapIOResourcePackage.Literals.SOAP_IO_RESOURCE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.SOAP_IO_RESOURCE__TIME_OUT, oldTimeOut, newTimeOut);
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
        msgs = ((InternalEObject)timeOut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.SOAP_IO_RESOURCE__TIME_OUT, null, msgs);
      if (newTimeOut != null)
        msgs = ((InternalEObject)newTimeOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.SOAP_IO_RESOURCE__TIME_OUT, null, msgs);
      msgs = basicSetTimeOut(newTimeOut, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.SOAP_IO_RESOURCE__TIME_OUT, newTimeOut, newTimeOut));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractTransport getTransport()
  {
    return transport;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransport(AbstractTransport newTransport, NotificationChain msgs)
  {
    AbstractTransport oldTransport = transport;
    transport = newTransport;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.SOAP_IO_RESOURCE__TRANSPORT, oldTransport, newTransport);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTransport(AbstractTransport newTransport)
  {
    if (newTransport != transport)
    {
      NotificationChain msgs = null;
      if (transport != null)
        msgs = ((InternalEObject)transport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.SOAP_IO_RESOURCE__TRANSPORT, null, msgs);
      if (newTransport != null)
        msgs = ((InternalEObject)newTransport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.SOAP_IO_RESOURCE__TRANSPORT, null, msgs);
      msgs = basicSetTransport(newTransport, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.SOAP_IO_RESOURCE__TRANSPORT, newTransport, newTransport));
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
      case SoapIOResourcePackage.SOAP_IO_RESOURCE__TIME_OUT:
        return basicSetTimeOut(null, msgs);
      case SoapIOResourcePackage.SOAP_IO_RESOURCE__TRANSPORT:
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
      case SoapIOResourcePackage.SOAP_IO_RESOURCE__TIME_OUT:
        return getTimeOut();
      case SoapIOResourcePackage.SOAP_IO_RESOURCE__TRANSPORT:
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
      case SoapIOResourcePackage.SOAP_IO_RESOURCE__TIME_OUT:
        setTimeOut((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.SOAP_IO_RESOURCE__TRANSPORT:
        setTransport((AbstractTransport)newValue);
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
      case SoapIOResourcePackage.SOAP_IO_RESOURCE__TIME_OUT:
        setTimeOut((ComplexValue)null);
        return;
      case SoapIOResourcePackage.SOAP_IO_RESOURCE__TRANSPORT:
        setTransport((AbstractTransport)null);
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
      case SoapIOResourcePackage.SOAP_IO_RESOURCE__TIME_OUT:
        return timeOut != null;
      case SoapIOResourcePackage.SOAP_IO_RESOURCE__TRANSPORT:
        return transport != null;
    }
    return super.eIsSet(featureID);
  }

} // SoapIOResourceImpl
