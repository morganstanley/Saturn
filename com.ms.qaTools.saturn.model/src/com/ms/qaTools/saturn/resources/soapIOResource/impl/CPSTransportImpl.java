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

import com.ms.qaTools.saturn.resources.soapIOResource.AbstractTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.CpsMessageTypes;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage;
import com.ms.qaTools.saturn.resources.soapIOResource.SubscribeEnums;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>CPS Transport</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.CPSTransportImpl#getTransport <em>Transport</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.CPSTransportImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.CPSTransportImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.CPSTransportImpl#getNamespaceDefinition <em>Namespace Definition</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.CPSTransportImpl#getCpsMessageType <em>Cps Message Type</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.CPSTransportImpl#getJarLocation <em>Jar Location</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.CPSTransportImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.CPSTransportImpl#getSubscribe <em>Subscribe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CPSTransportImpl extends AbstractTransportImpl implements CPSTransport
{
  /**
   * The cached value of the '{@link #getTransport() <em>Transport</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransport()
   * @generated
   * @ordered
   */
  protected AbstractTransport            transport;

  /**
   * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTopic()
   * @generated
   * @ordered
   */
  protected ComplexValue                 topic;

  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected ComplexValue                 filter;

  /**
   * The cached value of the '{@link #getNamespaceDefinition() <em>Namespace Definition</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getNamespaceDefinition()
   * @generated
   * @ordered
   */
  protected ResourceDefinition           namespaceDefinition;

  /**
   * The default value of the '{@link #getCpsMessageType() <em>Cps Message Type</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getCpsMessageType()
   * @generated
   * @ordered
   */
  protected static final CpsMessageTypes CPS_MESSAGE_TYPE_EDEFAULT = CpsMessageTypes.CPS0;

  /**
   * The cached value of the '{@link #getCpsMessageType() <em>Cps Message Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpsMessageType()
   * @generated
   * @ordered
   */
  protected CpsMessageTypes              cpsMessageType            = CPS_MESSAGE_TYPE_EDEFAULT;

  /**
   * This is true if the Cps Message Type attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                      cpsMessageTypeESet;

  /**
   * The cached value of the '{@link #getJarLocation() <em>Jar Location</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getJarLocation()
   * @generated
   * @ordered
   */
  protected ComplexValue                 jarLocation;

  /**
   * The cached value of the '{@link #getClassName() <em>Class Name</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected ComplexValue                 className;

  /**
   * The default value of the '{@link #getSubscribe() <em>Subscribe</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSubscribe()
   * @generated
   * @ordered
   */
  protected static final SubscribeEnums  SUBSCRIBE_EDEFAULT        = SubscribeEnums.NONE;

  /**
   * The cached value of the '{@link #getSubscribe() <em>Subscribe</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSubscribe()
   * @generated
   * @ordered
   */
  protected SubscribeEnums               subscribe                 = SUBSCRIBE_EDEFAULT;

  /**
   * This is true if the Subscribe attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                      subscribeESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected CPSTransportImpl()
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
    return SoapIOResourcePackage.Literals.CPS_TRANSPORT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_TRANSPORT__TRANSPORT, oldTransport, newTransport);
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
        msgs = ((InternalEObject)transport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_TRANSPORT__TRANSPORT, null, msgs);
      if (newTransport != null)
        msgs = ((InternalEObject)newTransport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_TRANSPORT__TRANSPORT, null, msgs);
      msgs = basicSetTransport(newTransport, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_TRANSPORT__TRANSPORT, newTransport, newTransport));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getTopic()
  {
    return topic;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTopic(ComplexValue newTopic, NotificationChain msgs)
  {
    ComplexValue oldTopic = topic;
    topic = newTopic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_TRANSPORT__TOPIC, oldTopic, newTopic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTopic(ComplexValue newTopic)
  {
    if (newTopic != topic)
    {
      NotificationChain msgs = null;
      if (topic != null)
        msgs = ((InternalEObject)topic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_TRANSPORT__TOPIC, null, msgs);
      if (newTopic != null)
        msgs = ((InternalEObject)newTopic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_TRANSPORT__TOPIC, null, msgs);
      msgs = basicSetTopic(newTopic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_TRANSPORT__TOPIC, newTopic, newTopic));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter(ComplexValue newFilter, NotificationChain msgs)
  {
    ComplexValue oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_TRANSPORT__FILTER, oldFilter, newFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(ComplexValue newFilter)
  {
    if (newFilter != filter)
    {
      NotificationChain msgs = null;
      if (filter != null)
        msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_TRANSPORT__FILTER, null, msgs);
      if (newFilter != null)
        msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_TRANSPORT__FILTER, null, msgs);
      msgs = basicSetFilter(newFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_TRANSPORT__FILTER, newFilter, newFilter));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getNamespaceDefinition()
  {
    return namespaceDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespaceDefinition(ResourceDefinition newNamespaceDefinition, NotificationChain msgs)
  {
    ResourceDefinition oldNamespaceDefinition = namespaceDefinition;
    namespaceDefinition = newNamespaceDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_TRANSPORT__NAMESPACE_DEFINITION, oldNamespaceDefinition, newNamespaceDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNamespaceDefinition(ResourceDefinition newNamespaceDefinition)
  {
    if (newNamespaceDefinition != namespaceDefinition)
    {
      NotificationChain msgs = null;
      if (namespaceDefinition != null)
        msgs = ((InternalEObject)namespaceDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_TRANSPORT__NAMESPACE_DEFINITION, null, msgs);
      if (newNamespaceDefinition != null)
        msgs = ((InternalEObject)newNamespaceDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_TRANSPORT__NAMESPACE_DEFINITION, null, msgs);
      msgs = basicSetNamespaceDefinition(newNamespaceDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_TRANSPORT__NAMESPACE_DEFINITION, newNamespaceDefinition, newNamespaceDefinition));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CpsMessageTypes getCpsMessageType()
  {
    return cpsMessageType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCpsMessageType(CpsMessageTypes newCpsMessageType)
  {
    CpsMessageTypes oldCpsMessageType = cpsMessageType;
    cpsMessageType = newCpsMessageType == null ? CPS_MESSAGE_TYPE_EDEFAULT : newCpsMessageType;
    boolean oldCpsMessageTypeESet = cpsMessageTypeESet;
    cpsMessageTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_TRANSPORT__CPS_MESSAGE_TYPE, oldCpsMessageType, cpsMessageType, !oldCpsMessageTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCpsMessageType()
  {
    CpsMessageTypes oldCpsMessageType = cpsMessageType;
    boolean oldCpsMessageTypeESet = cpsMessageTypeESet;
    cpsMessageType = CPS_MESSAGE_TYPE_EDEFAULT;
    cpsMessageTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoapIOResourcePackage.CPS_TRANSPORT__CPS_MESSAGE_TYPE, oldCpsMessageType, CPS_MESSAGE_TYPE_EDEFAULT, oldCpsMessageTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCpsMessageType()
  {
    return cpsMessageTypeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getJarLocation()
  {
    return jarLocation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJarLocation(ComplexValue newJarLocation, NotificationChain msgs)
  {
    ComplexValue oldJarLocation = jarLocation;
    jarLocation = newJarLocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_TRANSPORT__JAR_LOCATION, oldJarLocation, newJarLocation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setJarLocation(ComplexValue newJarLocation)
  {
    if (newJarLocation != jarLocation)
    {
      NotificationChain msgs = null;
      if (jarLocation != null)
        msgs = ((InternalEObject)jarLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_TRANSPORT__JAR_LOCATION, null, msgs);
      if (newJarLocation != null)
        msgs = ((InternalEObject)newJarLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_TRANSPORT__JAR_LOCATION, null, msgs);
      msgs = basicSetJarLocation(newJarLocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_TRANSPORT__JAR_LOCATION, newJarLocation, newJarLocation));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getClassName()
  {
    return className;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassName(ComplexValue newClassName, NotificationChain msgs)
  {
    ComplexValue oldClassName = className;
    className = newClassName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_TRANSPORT__CLASS_NAME, oldClassName, newClassName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setClassName(ComplexValue newClassName)
  {
    if (newClassName != className)
    {
      NotificationChain msgs = null;
      if (className != null)
        msgs = ((InternalEObject)className).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_TRANSPORT__CLASS_NAME, null, msgs);
      if (newClassName != null)
        msgs = ((InternalEObject)newClassName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.CPS_TRANSPORT__CLASS_NAME, null, msgs);
      msgs = basicSetClassName(newClassName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_TRANSPORT__CLASS_NAME, newClassName, newClassName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SubscribeEnums getSubscribe()
  {
    return subscribe;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSubscribe(SubscribeEnums newSubscribe)
  {
    SubscribeEnums oldSubscribe = subscribe;
    subscribe = newSubscribe == null ? SUBSCRIBE_EDEFAULT : newSubscribe;
    boolean oldSubscribeESet = subscribeESet;
    subscribeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.CPS_TRANSPORT__SUBSCRIBE, oldSubscribe, subscribe, !oldSubscribeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetSubscribe()
  {
    SubscribeEnums oldSubscribe = subscribe;
    boolean oldSubscribeESet = subscribeESet;
    subscribe = SUBSCRIBE_EDEFAULT;
    subscribeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoapIOResourcePackage.CPS_TRANSPORT__SUBSCRIBE, oldSubscribe, SUBSCRIBE_EDEFAULT, oldSubscribeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetSubscribe()
  {
    return subscribeESet;
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
      case SoapIOResourcePackage.CPS_TRANSPORT__TRANSPORT:
        return basicSetTransport(null, msgs);
      case SoapIOResourcePackage.CPS_TRANSPORT__TOPIC:
        return basicSetTopic(null, msgs);
      case SoapIOResourcePackage.CPS_TRANSPORT__FILTER:
        return basicSetFilter(null, msgs);
      case SoapIOResourcePackage.CPS_TRANSPORT__NAMESPACE_DEFINITION:
        return basicSetNamespaceDefinition(null, msgs);
      case SoapIOResourcePackage.CPS_TRANSPORT__JAR_LOCATION:
        return basicSetJarLocation(null, msgs);
      case SoapIOResourcePackage.CPS_TRANSPORT__CLASS_NAME:
        return basicSetClassName(null, msgs);
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
      case SoapIOResourcePackage.CPS_TRANSPORT__TRANSPORT:
        return getTransport();
      case SoapIOResourcePackage.CPS_TRANSPORT__TOPIC:
        return getTopic();
      case SoapIOResourcePackage.CPS_TRANSPORT__FILTER:
        return getFilter();
      case SoapIOResourcePackage.CPS_TRANSPORT__NAMESPACE_DEFINITION:
        return getNamespaceDefinition();
      case SoapIOResourcePackage.CPS_TRANSPORT__CPS_MESSAGE_TYPE:
        return getCpsMessageType();
      case SoapIOResourcePackage.CPS_TRANSPORT__JAR_LOCATION:
        return getJarLocation();
      case SoapIOResourcePackage.CPS_TRANSPORT__CLASS_NAME:
        return getClassName();
      case SoapIOResourcePackage.CPS_TRANSPORT__SUBSCRIBE:
        return getSubscribe();
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
      case SoapIOResourcePackage.CPS_TRANSPORT__TRANSPORT:
        setTransport((AbstractTransport)newValue);
        return;
      case SoapIOResourcePackage.CPS_TRANSPORT__TOPIC:
        setTopic((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.CPS_TRANSPORT__FILTER:
        setFilter((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.CPS_TRANSPORT__NAMESPACE_DEFINITION:
        setNamespaceDefinition((ResourceDefinition)newValue);
        return;
      case SoapIOResourcePackage.CPS_TRANSPORT__CPS_MESSAGE_TYPE:
        setCpsMessageType((CpsMessageTypes)newValue);
        return;
      case SoapIOResourcePackage.CPS_TRANSPORT__JAR_LOCATION:
        setJarLocation((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.CPS_TRANSPORT__CLASS_NAME:
        setClassName((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.CPS_TRANSPORT__SUBSCRIBE:
        setSubscribe((SubscribeEnums)newValue);
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
      case SoapIOResourcePackage.CPS_TRANSPORT__TRANSPORT:
        setTransport((AbstractTransport)null);
        return;
      case SoapIOResourcePackage.CPS_TRANSPORT__TOPIC:
        setTopic((ComplexValue)null);
        return;
      case SoapIOResourcePackage.CPS_TRANSPORT__FILTER:
        setFilter((ComplexValue)null);
        return;
      case SoapIOResourcePackage.CPS_TRANSPORT__NAMESPACE_DEFINITION:
        setNamespaceDefinition((ResourceDefinition)null);
        return;
      case SoapIOResourcePackage.CPS_TRANSPORT__CPS_MESSAGE_TYPE:
        unsetCpsMessageType();
        return;
      case SoapIOResourcePackage.CPS_TRANSPORT__JAR_LOCATION:
        setJarLocation((ComplexValue)null);
        return;
      case SoapIOResourcePackage.CPS_TRANSPORT__CLASS_NAME:
        setClassName((ComplexValue)null);
        return;
      case SoapIOResourcePackage.CPS_TRANSPORT__SUBSCRIBE:
        unsetSubscribe();
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
      case SoapIOResourcePackage.CPS_TRANSPORT__TRANSPORT:
        return transport != null;
      case SoapIOResourcePackage.CPS_TRANSPORT__TOPIC:
        return topic != null;
      case SoapIOResourcePackage.CPS_TRANSPORT__FILTER:
        return filter != null;
      case SoapIOResourcePackage.CPS_TRANSPORT__NAMESPACE_DEFINITION:
        return namespaceDefinition != null;
      case SoapIOResourcePackage.CPS_TRANSPORT__CPS_MESSAGE_TYPE:
        return isSetCpsMessageType();
      case SoapIOResourcePackage.CPS_TRANSPORT__JAR_LOCATION:
        return jarLocation != null;
      case SoapIOResourcePackage.CPS_TRANSPORT__CLASS_NAME:
        return className != null;
      case SoapIOResourcePackage.CPS_TRANSPORT__SUBSCRIBE:
        return isSetSubscribe();
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
    result.append(" (cpsMessageType: ");
    if (cpsMessageTypeESet) result.append(cpsMessageType); else result.append("<unset>");
    result.append(", subscribe: ");
    if (subscribeESet) result.append(subscribe); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // CPSTransportImpl
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
