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

import com.ms.qaTools.saturn.resources.soapIOResource.PTCPTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage;

import com.ms.qaTools.saturn.values.ComplexValue;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTCP Transport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.PTCPTransportImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.PTCPTransportImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.PTCPTransportImpl#getMaxRetries <em>Max Retries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PTCPTransportImpl extends AbstractTransportImpl implements PTCPTransport
{
  /**
   * The cached value of the '{@link #getHostname() <em>Hostname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostname()
   * @generated
   * @ordered
   */
  protected ComplexValue hostname;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected ComplexValue port;

  /**
   * The default value of the '{@link #getMaxRetries() <em>Max Retries</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxRetries()
   * @generated
   * @ordered
   */
  protected static final BigInteger MAX_RETRIES_EDEFAULT = new BigInteger("0");

  /**
   * The cached value of the '{@link #getMaxRetries() <em>Max Retries</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxRetries()
   * @generated
   * @ordered
   */
  protected BigInteger maxRetries = MAX_RETRIES_EDEFAULT;

  /**
   * This is true if the Max Retries attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean maxRetriesESet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PTCPTransportImpl()
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
    return SoapIOResourcePackage.Literals.PTCP_TRANSPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getHostname()
  {
    return hostname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHostname(ComplexValue newHostname, NotificationChain msgs)
  {
    ComplexValue oldHostname = hostname;
    hostname = newHostname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.PTCP_TRANSPORT__HOSTNAME, oldHostname, newHostname);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHostname(ComplexValue newHostname)
  {
    if (newHostname != hostname)
    {
      NotificationChain msgs = null;
      if (hostname != null)
        msgs = ((InternalEObject)hostname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.PTCP_TRANSPORT__HOSTNAME, null, msgs);
      if (newHostname != null)
        msgs = ((InternalEObject)newHostname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.PTCP_TRANSPORT__HOSTNAME, null, msgs);
      msgs = basicSetHostname(newHostname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.PTCP_TRANSPORT__HOSTNAME, newHostname, newHostname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPort(ComplexValue newPort, NotificationChain msgs)
  {
    ComplexValue oldPort = port;
    port = newPort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.PTCP_TRANSPORT__PORT, oldPort, newPort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(ComplexValue newPort)
  {
    if (newPort != port)
    {
      NotificationChain msgs = null;
      if (port != null)
        msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.PTCP_TRANSPORT__PORT, null, msgs);
      if (newPort != null)
        msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.PTCP_TRANSPORT__PORT, null, msgs);
      msgs = basicSetPort(newPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.PTCP_TRANSPORT__PORT, newPort, newPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getMaxRetries()
  {
    return maxRetries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxRetries(BigInteger newMaxRetries)
  {
    BigInteger oldMaxRetries = maxRetries;
    maxRetries = newMaxRetries;
    boolean oldMaxRetriesESet = maxRetriesESet;
    maxRetriesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.PTCP_TRANSPORT__MAX_RETRIES, oldMaxRetries, maxRetries, !oldMaxRetriesESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetMaxRetries()
  {
    BigInteger oldMaxRetries = maxRetries;
    boolean oldMaxRetriesESet = maxRetriesESet;
    maxRetries = MAX_RETRIES_EDEFAULT;
    maxRetriesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoapIOResourcePackage.PTCP_TRANSPORT__MAX_RETRIES, oldMaxRetries, MAX_RETRIES_EDEFAULT, oldMaxRetriesESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetMaxRetries()
  {
    return maxRetriesESet;
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
      case SoapIOResourcePackage.PTCP_TRANSPORT__HOSTNAME:
        return basicSetHostname(null, msgs);
      case SoapIOResourcePackage.PTCP_TRANSPORT__PORT:
        return basicSetPort(null, msgs);
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
      case SoapIOResourcePackage.PTCP_TRANSPORT__HOSTNAME:
        return getHostname();
      case SoapIOResourcePackage.PTCP_TRANSPORT__PORT:
        return getPort();
      case SoapIOResourcePackage.PTCP_TRANSPORT__MAX_RETRIES:
        return getMaxRetries();
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
      case SoapIOResourcePackage.PTCP_TRANSPORT__HOSTNAME:
        setHostname((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.PTCP_TRANSPORT__PORT:
        setPort((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.PTCP_TRANSPORT__MAX_RETRIES:
        setMaxRetries((BigInteger)newValue);
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
      case SoapIOResourcePackage.PTCP_TRANSPORT__HOSTNAME:
        setHostname((ComplexValue)null);
        return;
      case SoapIOResourcePackage.PTCP_TRANSPORT__PORT:
        setPort((ComplexValue)null);
        return;
      case SoapIOResourcePackage.PTCP_TRANSPORT__MAX_RETRIES:
        unsetMaxRetries();
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
      case SoapIOResourcePackage.PTCP_TRANSPORT__HOSTNAME:
        return hostname != null;
      case SoapIOResourcePackage.PTCP_TRANSPORT__PORT:
        return port != null;
      case SoapIOResourcePackage.PTCP_TRANSPORT__MAX_RETRIES:
        return isSetMaxRetries();
    }
    return super.eIsSet(featureID);
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
    result.append(" (maxRetries: ");
    if (maxRetriesESet) result.append(maxRetries); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //PTCPTransportImpl
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
