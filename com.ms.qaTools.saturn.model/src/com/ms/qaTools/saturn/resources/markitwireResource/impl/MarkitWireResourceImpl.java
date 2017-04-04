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
package com.ms.qaTools.saturn.resources.markitwireResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.markitwireResource.MarkitWireResource;
import com.ms.qaTools.saturn.resources.markitwireResource.MarkitwireResourcePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.types.impl.NamedResourceDefinitionImpl;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Markit Wire Resource</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.markitwireResource.impl.MarkitWireResourceImpl#getRmiResource <em>Rmi Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.markitwireResource.impl.MarkitWireResourceImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.markitwireResource.impl.MarkitWireResourceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.markitwireResource.impl.MarkitWireResourceImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.markitwireResource.impl.MarkitWireResourceImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.markitwireResource.impl.MarkitWireResourceImpl#getTimeOut <em>Time Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarkitWireResourceImpl extends NamedResourceDefinitionImpl implements MarkitWireResource
{
  /**
   * The cached value of the '{@link #getRmiResource() <em>Rmi Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRmiResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition rmiResource;

  /**
   * The cached value of the '{@link #getHost() <em>Host</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getHost()
   * @generated
   * @ordered
   */
  protected ComplexValue       host;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected ComplexValue       port;

  /**
   * The cached value of the '{@link #getUserName() <em>User Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserName()
   * @generated
   * @ordered
   */
  protected ComplexValue       userName;

  /**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected ComplexValue       password;

  /**
   * The cached value of the '{@link #getTimeOut() <em>Time Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeOut()
   * @generated
   * @ordered
   */
  protected ComplexValue       timeOut;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MarkitWireResourceImpl()
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
    return MarkitwireResourcePackage.Literals.MARKIT_WIRE_RESOURCE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getRmiResource()
  {
    return rmiResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRmiResource(ResourceDefinition newRmiResource, NotificationChain msgs)
  {
    ResourceDefinition oldRmiResource = rmiResource;
    rmiResource = newRmiResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__RMI_RESOURCE, oldRmiResource, newRmiResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRmiResource(ResourceDefinition newRmiResource)
  {
    if (newRmiResource != rmiResource)
    {
      NotificationChain msgs = null;
      if (rmiResource != null)
        msgs = ((InternalEObject)rmiResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__RMI_RESOURCE, null, msgs);
      if (newRmiResource != null)
        msgs = ((InternalEObject)newRmiResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__RMI_RESOURCE, null, msgs);
      msgs = basicSetRmiResource(newRmiResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__RMI_RESOURCE, newRmiResource, newRmiResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getHost()
  {
    return host;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHost(ComplexValue newHost, NotificationChain msgs)
  {
    ComplexValue oldHost = host;
    host = newHost;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__HOST, oldHost, newHost);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setHost(ComplexValue newHost)
  {
    if (newHost != host)
    {
      NotificationChain msgs = null;
      if (host != null)
        msgs = ((InternalEObject)host).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__HOST, null, msgs);
      if (newHost != null)
        msgs = ((InternalEObject)newHost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__HOST, null, msgs);
      msgs = basicSetHost(newHost, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__HOST, newHost, newHost));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPort(ComplexValue newPort, NotificationChain msgs)
  {
    ComplexValue oldPort = port;
    port = newPort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PORT, oldPort, newPort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPort(ComplexValue newPort)
  {
    if (newPort != port)
    {
      NotificationChain msgs = null;
      if (port != null)
        msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PORT, null, msgs);
      if (newPort != null)
        msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PORT, null, msgs);
      msgs = basicSetPort(newPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PORT, newPort, newPort));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getUserName()
  {
    return userName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUserName(ComplexValue newUserName, NotificationChain msgs)
  {
    ComplexValue oldUserName = userName;
    userName = newUserName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__USER_NAME, oldUserName, newUserName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setUserName(ComplexValue newUserName)
  {
    if (newUserName != userName)
    {
      NotificationChain msgs = null;
      if (userName != null)
        msgs = ((InternalEObject)userName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__USER_NAME, null, msgs);
      if (newUserName != null)
        msgs = ((InternalEObject)newUserName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__USER_NAME, null, msgs);
      msgs = basicSetUserName(newUserName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__USER_NAME, newUserName, newUserName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getPassword()
  {
    return password;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPassword(ComplexValue newPassword, NotificationChain msgs)
  {
    ComplexValue oldPassword = password;
    password = newPassword;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PASSWORD, oldPassword, newPassword);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPassword(ComplexValue newPassword)
  {
    if (newPassword != password)
    {
      NotificationChain msgs = null;
      if (password != null)
        msgs = ((InternalEObject)password).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PASSWORD, null, msgs);
      if (newPassword != null)
        msgs = ((InternalEObject)newPassword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PASSWORD, null, msgs);
      msgs = basicSetPassword(newPassword, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PASSWORD, newPassword, newPassword));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__TIME_OUT, oldTimeOut, newTimeOut);
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
        msgs = ((InternalEObject)timeOut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__TIME_OUT, null, msgs);
      if (newTimeOut != null)
        msgs = ((InternalEObject)newTimeOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__TIME_OUT, null, msgs);
      msgs = basicSetTimeOut(newTimeOut, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__TIME_OUT, newTimeOut, newTimeOut));
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
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__RMI_RESOURCE:
        return basicSetRmiResource(null, msgs);
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__HOST:
        return basicSetHost(null, msgs);
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PORT:
        return basicSetPort(null, msgs);
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__USER_NAME:
        return basicSetUserName(null, msgs);
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PASSWORD:
        return basicSetPassword(null, msgs);
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__TIME_OUT:
        return basicSetTimeOut(null, msgs);
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
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__RMI_RESOURCE:
        return getRmiResource();
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__HOST:
        return getHost();
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PORT:
        return getPort();
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__USER_NAME:
        return getUserName();
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PASSWORD:
        return getPassword();
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__TIME_OUT:
        return getTimeOut();
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
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__RMI_RESOURCE:
        setRmiResource((ResourceDefinition)newValue);
        return;
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__HOST:
        setHost((ComplexValue)newValue);
        return;
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PORT:
        setPort((ComplexValue)newValue);
        return;
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__USER_NAME:
        setUserName((ComplexValue)newValue);
        return;
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PASSWORD:
        setPassword((ComplexValue)newValue);
        return;
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__TIME_OUT:
        setTimeOut((ComplexValue)newValue);
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
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__RMI_RESOURCE:
        setRmiResource((ResourceDefinition)null);
        return;
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__HOST:
        setHost((ComplexValue)null);
        return;
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PORT:
        setPort((ComplexValue)null);
        return;
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__USER_NAME:
        setUserName((ComplexValue)null);
        return;
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PASSWORD:
        setPassword((ComplexValue)null);
        return;
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__TIME_OUT:
        setTimeOut((ComplexValue)null);
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
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__RMI_RESOURCE:
        return rmiResource != null;
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__HOST:
        return host != null;
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PORT:
        return port != null;
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__USER_NAME:
        return userName != null;
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__PASSWORD:
        return password != null;
      case MarkitwireResourcePackage.MARKIT_WIRE_RESOURCE__TIME_OUT:
        return timeOut != null;
    }
    return super.eIsSet(featureID);
  }

} // MarkitWireResourceImpl
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
