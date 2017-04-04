package com.ms.qaTools.saturn.resources.soapIOResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.soapIOResource.MQTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>MQ Transport</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.MQTransportImpl#getMQResource <em>MQ Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.MQTransportImpl#getRequestQueue <em>Request Queue</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.MQTransportImpl#getResponseQueue <em>Response Queue</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.MQTransportImpl#getModelQName <em>Model QName</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.MQTransportImpl#getDynamicQName <em>Dynamic QName</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.MQTransportImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.MQTransportImpl#isUseCorrelId <em>Use Correl Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MQTransportImpl extends AbstractTransportImpl implements MQTransport
{
  /**
   * The cached value of the '{@link #getMQResource() <em>MQ Resource</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getMQResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition   mQResource;

  /**
   * The cached value of the '{@link #getRequestQueue() <em>Request Queue</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRequestQueue()
   * @generated
   * @ordered
   */
  protected ComplexValue         requestQueue;

  /**
   * The cached value of the '{@link #getResponseQueue() <em>Response Queue</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getResponseQueue()
   * @generated
   * @ordered
   */
  protected ComplexValue         responseQueue;

  /**
   * The cached value of the '{@link #getModelQName() <em>Model QName</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getModelQName()
   * @generated
   * @ordered
   */
  protected ComplexValue         modelQName;

  /**
   * The cached value of the '{@link #getDynamicQName() <em>Dynamic QName</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDynamicQName()
   * @generated
   * @ordered
   */
  protected ComplexValue         dynamicQName;

  /**
   * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isPersistent()
   * @generated
   * @ordered
   */
  protected static final boolean PERSISTENT_EDEFAULT    = false;

  /**
   * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isPersistent()
   * @generated
   * @ordered
   */
  protected boolean              persistent             = PERSISTENT_EDEFAULT;

  /**
   * This is true if the Persistent attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              persistentESet;

  /**
   * The default value of the '{@link #isUseCorrelId() <em>Use Correl Id</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isUseCorrelId()
   * @generated
   * @ordered
   */
  protected static final boolean USE_CORREL_ID_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isUseCorrelId() <em>Use Correl Id</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isUseCorrelId()
   * @generated
   * @ordered
   */
  protected boolean              useCorrelId            = USE_CORREL_ID_EDEFAULT;

  /**
   * This is true if the Use Correl Id attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              useCorrelIdESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MQTransportImpl()
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
    return SoapIOResourcePackage.Literals.MQ_TRANSPORT;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getMQResource()
  {
    return mQResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMQResource(ResourceDefinition newMQResource, NotificationChain msgs)
  {
    ResourceDefinition oldMQResource = mQResource;
    mQResource = newMQResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.MQ_TRANSPORT__MQ_RESOURCE, oldMQResource, newMQResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMQResource(ResourceDefinition newMQResource)
  {
    if (newMQResource != mQResource)
    {
      NotificationChain msgs = null;
      if (mQResource != null)
        msgs = ((InternalEObject)mQResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.MQ_TRANSPORT__MQ_RESOURCE, null, msgs);
      if (newMQResource != null)
        msgs = ((InternalEObject)newMQResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.MQ_TRANSPORT__MQ_RESOURCE, null, msgs);
      msgs = basicSetMQResource(newMQResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.MQ_TRANSPORT__MQ_RESOURCE, newMQResource, newMQResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getRequestQueue()
  {
    return requestQueue;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequestQueue(ComplexValue newRequestQueue, NotificationChain msgs)
  {
    ComplexValue oldRequestQueue = requestQueue;
    requestQueue = newRequestQueue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.MQ_TRANSPORT__REQUEST_QUEUE, oldRequestQueue, newRequestQueue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRequestQueue(ComplexValue newRequestQueue)
  {
    if (newRequestQueue != requestQueue)
    {
      NotificationChain msgs = null;
      if (requestQueue != null)
        msgs = ((InternalEObject)requestQueue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.MQ_TRANSPORT__REQUEST_QUEUE, null, msgs);
      if (newRequestQueue != null)
        msgs = ((InternalEObject)newRequestQueue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.MQ_TRANSPORT__REQUEST_QUEUE, null, msgs);
      msgs = basicSetRequestQueue(newRequestQueue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.MQ_TRANSPORT__REQUEST_QUEUE, newRequestQueue, newRequestQueue));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getResponseQueue()
  {
    return responseQueue;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResponseQueue(ComplexValue newResponseQueue, NotificationChain msgs)
  {
    ComplexValue oldResponseQueue = responseQueue;
    responseQueue = newResponseQueue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.MQ_TRANSPORT__RESPONSE_QUEUE, oldResponseQueue, newResponseQueue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setResponseQueue(ComplexValue newResponseQueue)
  {
    if (newResponseQueue != responseQueue)
    {
      NotificationChain msgs = null;
      if (responseQueue != null)
        msgs = ((InternalEObject)responseQueue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.MQ_TRANSPORT__RESPONSE_QUEUE, null, msgs);
      if (newResponseQueue != null)
        msgs = ((InternalEObject)newResponseQueue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.MQ_TRANSPORT__RESPONSE_QUEUE, null, msgs);
      msgs = basicSetResponseQueue(newResponseQueue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.MQ_TRANSPORT__RESPONSE_QUEUE, newResponseQueue, newResponseQueue));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getModelQName()
  {
    return modelQName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModelQName(ComplexValue newModelQName, NotificationChain msgs)
  {
    ComplexValue oldModelQName = modelQName;
    modelQName = newModelQName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.MQ_TRANSPORT__MODEL_QNAME, oldModelQName, newModelQName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setModelQName(ComplexValue newModelQName)
  {
    if (newModelQName != modelQName)
    {
      NotificationChain msgs = null;
      if (modelQName != null)
        msgs = ((InternalEObject)modelQName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.MQ_TRANSPORT__MODEL_QNAME, null, msgs);
      if (newModelQName != null)
        msgs = ((InternalEObject)newModelQName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.MQ_TRANSPORT__MODEL_QNAME, null, msgs);
      msgs = basicSetModelQName(newModelQName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.MQ_TRANSPORT__MODEL_QNAME, newModelQName, newModelQName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDynamicQName()
  {
    return dynamicQName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDynamicQName(ComplexValue newDynamicQName, NotificationChain msgs)
  {
    ComplexValue oldDynamicQName = dynamicQName;
    dynamicQName = newDynamicQName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.MQ_TRANSPORT__DYNAMIC_QNAME, oldDynamicQName, newDynamicQName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDynamicQName(ComplexValue newDynamicQName)
  {
    if (newDynamicQName != dynamicQName)
    {
      NotificationChain msgs = null;
      if (dynamicQName != null)
        msgs = ((InternalEObject)dynamicQName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.MQ_TRANSPORT__DYNAMIC_QNAME, null, msgs);
      if (newDynamicQName != null)
        msgs = ((InternalEObject)newDynamicQName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.MQ_TRANSPORT__DYNAMIC_QNAME, null, msgs);
      msgs = basicSetDynamicQName(newDynamicQName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.MQ_TRANSPORT__DYNAMIC_QNAME, newDynamicQName, newDynamicQName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isPersistent()
  {
    return persistent;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPersistent(boolean newPersistent)
  {
    boolean oldPersistent = persistent;
    persistent = newPersistent;
    boolean oldPersistentESet = persistentESet;
    persistentESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.MQ_TRANSPORT__PERSISTENT, oldPersistent, persistent, !oldPersistentESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetPersistent()
  {
    boolean oldPersistent = persistent;
    boolean oldPersistentESet = persistentESet;
    persistent = PERSISTENT_EDEFAULT;
    persistentESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoapIOResourcePackage.MQ_TRANSPORT__PERSISTENT, oldPersistent, PERSISTENT_EDEFAULT, oldPersistentESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetPersistent()
  {
    return persistentESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isUseCorrelId()
  {
    return useCorrelId;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setUseCorrelId(boolean newUseCorrelId)
  {
    boolean oldUseCorrelId = useCorrelId;
    useCorrelId = newUseCorrelId;
    boolean oldUseCorrelIdESet = useCorrelIdESet;
    useCorrelIdESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.MQ_TRANSPORT__USE_CORREL_ID, oldUseCorrelId, useCorrelId, !oldUseCorrelIdESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetUseCorrelId()
  {
    boolean oldUseCorrelId = useCorrelId;
    boolean oldUseCorrelIdESet = useCorrelIdESet;
    useCorrelId = USE_CORREL_ID_EDEFAULT;
    useCorrelIdESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoapIOResourcePackage.MQ_TRANSPORT__USE_CORREL_ID, oldUseCorrelId, USE_CORREL_ID_EDEFAULT, oldUseCorrelIdESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetUseCorrelId()
  {
    return useCorrelIdESet;
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
      case SoapIOResourcePackage.MQ_TRANSPORT__MQ_RESOURCE:
        return basicSetMQResource(null, msgs);
      case SoapIOResourcePackage.MQ_TRANSPORT__REQUEST_QUEUE:
        return basicSetRequestQueue(null, msgs);
      case SoapIOResourcePackage.MQ_TRANSPORT__RESPONSE_QUEUE:
        return basicSetResponseQueue(null, msgs);
      case SoapIOResourcePackage.MQ_TRANSPORT__MODEL_QNAME:
        return basicSetModelQName(null, msgs);
      case SoapIOResourcePackage.MQ_TRANSPORT__DYNAMIC_QNAME:
        return basicSetDynamicQName(null, msgs);
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
      case SoapIOResourcePackage.MQ_TRANSPORT__MQ_RESOURCE:
        return getMQResource();
      case SoapIOResourcePackage.MQ_TRANSPORT__REQUEST_QUEUE:
        return getRequestQueue();
      case SoapIOResourcePackage.MQ_TRANSPORT__RESPONSE_QUEUE:
        return getResponseQueue();
      case SoapIOResourcePackage.MQ_TRANSPORT__MODEL_QNAME:
        return getModelQName();
      case SoapIOResourcePackage.MQ_TRANSPORT__DYNAMIC_QNAME:
        return getDynamicQName();
      case SoapIOResourcePackage.MQ_TRANSPORT__PERSISTENT:
        return isPersistent();
      case SoapIOResourcePackage.MQ_TRANSPORT__USE_CORREL_ID:
        return isUseCorrelId();
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
      case SoapIOResourcePackage.MQ_TRANSPORT__MQ_RESOURCE:
        setMQResource((ResourceDefinition)newValue);
        return;
      case SoapIOResourcePackage.MQ_TRANSPORT__REQUEST_QUEUE:
        setRequestQueue((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.MQ_TRANSPORT__RESPONSE_QUEUE:
        setResponseQueue((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.MQ_TRANSPORT__MODEL_QNAME:
        setModelQName((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.MQ_TRANSPORT__DYNAMIC_QNAME:
        setDynamicQName((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.MQ_TRANSPORT__PERSISTENT:
        setPersistent((Boolean)newValue);
        return;
      case SoapIOResourcePackage.MQ_TRANSPORT__USE_CORREL_ID:
        setUseCorrelId((Boolean)newValue);
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
      case SoapIOResourcePackage.MQ_TRANSPORT__MQ_RESOURCE:
        setMQResource((ResourceDefinition)null);
        return;
      case SoapIOResourcePackage.MQ_TRANSPORT__REQUEST_QUEUE:
        setRequestQueue((ComplexValue)null);
        return;
      case SoapIOResourcePackage.MQ_TRANSPORT__RESPONSE_QUEUE:
        setResponseQueue((ComplexValue)null);
        return;
      case SoapIOResourcePackage.MQ_TRANSPORT__MODEL_QNAME:
        setModelQName((ComplexValue)null);
        return;
      case SoapIOResourcePackage.MQ_TRANSPORT__DYNAMIC_QNAME:
        setDynamicQName((ComplexValue)null);
        return;
      case SoapIOResourcePackage.MQ_TRANSPORT__PERSISTENT:
        unsetPersistent();
        return;
      case SoapIOResourcePackage.MQ_TRANSPORT__USE_CORREL_ID:
        unsetUseCorrelId();
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
      case SoapIOResourcePackage.MQ_TRANSPORT__MQ_RESOURCE:
        return mQResource != null;
      case SoapIOResourcePackage.MQ_TRANSPORT__REQUEST_QUEUE:
        return requestQueue != null;
      case SoapIOResourcePackage.MQ_TRANSPORT__RESPONSE_QUEUE:
        return responseQueue != null;
      case SoapIOResourcePackage.MQ_TRANSPORT__MODEL_QNAME:
        return modelQName != null;
      case SoapIOResourcePackage.MQ_TRANSPORT__DYNAMIC_QNAME:
        return dynamicQName != null;
      case SoapIOResourcePackage.MQ_TRANSPORT__PERSISTENT:
        return isSetPersistent();
      case SoapIOResourcePackage.MQ_TRANSPORT__USE_CORREL_ID:
        return isSetUseCorrelId();
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
    result.append(" (persistent: ");
    if (persistentESet) result.append(persistent); else result.append("<unset>");
    result.append(", useCorrelId: ");
    if (useCorrelIdESet) result.append(useCorrelId); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // MQTransportImpl
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
