package com.ms.qaTools.saturn.resources.soapIOResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.soapIOResource.AuthenticationMethod;
import com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>HTTP Transport</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.HTTPTransportImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.HTTPTransportImpl#getProxyUrl <em>Proxy Url</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.HTTPTransportImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.HTTPTransportImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.HTTPTransportImpl#isForwardSMSession <em>Forward SM Session</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.HTTPTransportImpl#isDisableChunkedEncoding <em>Disable Chunked Encoding</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.soapIOResource.impl.HTTPTransportImpl#getAuthenticationMethod <em>Authentication Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HTTPTransportImpl extends AbstractTransportImpl implements HTTPTransport
{
  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected ComplexValue url;

  /**
   * The cached value of the '{@link #getProxyUrl() <em>Proxy Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProxyUrl()
   * @generated
   * @ordered
   */
  protected ComplexValue                      proxyUrl;

  /**
   * The cached value of the '{@link #getUserId() <em>User Id</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getUserId()
   * @generated
   * @ordered
   */
  protected ComplexValue                      userId;

  /**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected ComplexValue                      password;

  /**
   * The default value of the '{@link #isForwardSMSession() <em>Forward SM Session</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForwardSMSession()
   * @generated
   * @ordered
   */
  protected static final boolean FORWARD_SM_SESSION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isForwardSMSession() <em>Forward SM Session</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForwardSMSession()
   * @generated
   * @ordered
   */
  protected boolean forwardSMSession = FORWARD_SM_SESSION_EDEFAULT;

  /**
   * This is true if the Forward SM Session attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean forwardSMSessionESet;

  /**
   * The default value of the '{@link #isDisableChunkedEncoding() <em>Disable Chunked Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDisableChunkedEncoding()
   * @generated
   * @ordered
   */
  protected static final boolean DISABLE_CHUNKED_ENCODING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDisableChunkedEncoding() <em>Disable Chunked Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDisableChunkedEncoding()
   * @generated
   * @ordered
   */
  protected boolean disableChunkedEncoding = DISABLE_CHUNKED_ENCODING_EDEFAULT;

  /**
   * This is true if the Disable Chunked Encoding attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean disableChunkedEncodingESet;

  /**
   * The default value of the '{@link #getAuthenticationMethod() <em>Authentication Method</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getAuthenticationMethod()
   * @generated
   * @ordered
   */
  protected static final AuthenticationMethod AUTHENTICATION_METHOD_EDEFAULT = AuthenticationMethod.NONE;

  /**
   * The cached value of the '{@link #getAuthenticationMethod() <em>Authentication Method</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getAuthenticationMethod()
   * @generated
   * @ordered
   */
  protected AuthenticationMethod              authenticationMethod           = AUTHENTICATION_METHOD_EDEFAULT;

  /**
   * This is true if the Authentication Method attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                           authenticationMethodESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected HTTPTransportImpl()
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
    return SoapIOResourcePackage.Literals.HTTP_TRANSPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUrl(ComplexValue newUrl, NotificationChain msgs)
  {
    ComplexValue oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.HTTP_TRANSPORT__URL, oldUrl, newUrl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(ComplexValue newUrl)
  {
    if (newUrl != url)
    {
      NotificationChain msgs = null;
      if (url != null)
        msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.HTTP_TRANSPORT__URL, null, msgs);
      if (newUrl != null)
        msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.HTTP_TRANSPORT__URL, null, msgs);
      msgs = basicSetUrl(newUrl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.HTTP_TRANSPORT__URL, newUrl, newUrl));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getProxyUrl()
  {
    return proxyUrl;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProxyUrl(ComplexValue newProxyUrl, NotificationChain msgs)
  {
    ComplexValue oldProxyUrl = proxyUrl;
    proxyUrl = newProxyUrl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.HTTP_TRANSPORT__PROXY_URL, oldProxyUrl, newProxyUrl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setProxyUrl(ComplexValue newProxyUrl)
  {
    if (newProxyUrl != proxyUrl)
    {
      NotificationChain msgs = null;
      if (proxyUrl != null)
        msgs = ((InternalEObject)proxyUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.HTTP_TRANSPORT__PROXY_URL, null, msgs);
      if (newProxyUrl != null)
        msgs = ((InternalEObject)newProxyUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.HTTP_TRANSPORT__PROXY_URL, null, msgs);
      msgs = basicSetProxyUrl(newProxyUrl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.HTTP_TRANSPORT__PROXY_URL, newProxyUrl, newProxyUrl));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getUserId()
  {
    return userId;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUserId(ComplexValue newUserId, NotificationChain msgs)
  {
    ComplexValue oldUserId = userId;
    userId = newUserId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.HTTP_TRANSPORT__USER_ID, oldUserId, newUserId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setUserId(ComplexValue newUserId)
  {
    if (newUserId != userId)
    {
      NotificationChain msgs = null;
      if (userId != null)
        msgs = ((InternalEObject)userId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.HTTP_TRANSPORT__USER_ID, null, msgs);
      if (newUserId != null)
        msgs = ((InternalEObject)newUserId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.HTTP_TRANSPORT__USER_ID, null, msgs);
      msgs = basicSetUserId(newUserId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.HTTP_TRANSPORT__USER_ID, newUserId, newUserId));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.HTTP_TRANSPORT__PASSWORD, oldPassword, newPassword);
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
        msgs = ((InternalEObject)password).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.HTTP_TRANSPORT__PASSWORD, null, msgs);
      if (newPassword != null)
        msgs = ((InternalEObject)newPassword).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoapIOResourcePackage.HTTP_TRANSPORT__PASSWORD, null, msgs);
      msgs = basicSetPassword(newPassword, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.HTTP_TRANSPORT__PASSWORD, newPassword, newPassword));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isForwardSMSession()
  {
    return forwardSMSession;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForwardSMSession(boolean newForwardSMSession)
  {
    boolean oldForwardSMSession = forwardSMSession;
    forwardSMSession = newForwardSMSession;
    boolean oldForwardSMSessionESet = forwardSMSessionESet;
    forwardSMSessionESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.HTTP_TRANSPORT__FORWARD_SM_SESSION, oldForwardSMSession, forwardSMSession, !oldForwardSMSessionESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetForwardSMSession()
  {
    boolean oldForwardSMSession = forwardSMSession;
    boolean oldForwardSMSessionESet = forwardSMSessionESet;
    forwardSMSession = FORWARD_SM_SESSION_EDEFAULT;
    forwardSMSessionESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoapIOResourcePackage.HTTP_TRANSPORT__FORWARD_SM_SESSION, oldForwardSMSession, FORWARD_SM_SESSION_EDEFAULT, oldForwardSMSessionESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetForwardSMSession()
  {
    return forwardSMSessionESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDisableChunkedEncoding()
  {
    return disableChunkedEncoding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisableChunkedEncoding(boolean newDisableChunkedEncoding)
  {
    boolean oldDisableChunkedEncoding = disableChunkedEncoding;
    disableChunkedEncoding = newDisableChunkedEncoding;
    boolean oldDisableChunkedEncodingESet = disableChunkedEncodingESet;
    disableChunkedEncodingESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.HTTP_TRANSPORT__DISABLE_CHUNKED_ENCODING, oldDisableChunkedEncoding, disableChunkedEncoding, !oldDisableChunkedEncodingESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetDisableChunkedEncoding()
  {
    boolean oldDisableChunkedEncoding = disableChunkedEncoding;
    boolean oldDisableChunkedEncodingESet = disableChunkedEncodingESet;
    disableChunkedEncoding = DISABLE_CHUNKED_ENCODING_EDEFAULT;
    disableChunkedEncodingESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoapIOResourcePackage.HTTP_TRANSPORT__DISABLE_CHUNKED_ENCODING, oldDisableChunkedEncoding, DISABLE_CHUNKED_ENCODING_EDEFAULT, oldDisableChunkedEncodingESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDisableChunkedEncoding()
  {
    return disableChunkedEncodingESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AuthenticationMethod getAuthenticationMethod()
  {
    return authenticationMethod;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAuthenticationMethod(AuthenticationMethod newAuthenticationMethod)
  {
    AuthenticationMethod oldAuthenticationMethod = authenticationMethod;
    authenticationMethod = newAuthenticationMethod == null ? AUTHENTICATION_METHOD_EDEFAULT : newAuthenticationMethod;
    boolean oldAuthenticationMethodESet = authenticationMethodESet;
    authenticationMethodESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoapIOResourcePackage.HTTP_TRANSPORT__AUTHENTICATION_METHOD, oldAuthenticationMethod, authenticationMethod, !oldAuthenticationMethodESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetAuthenticationMethod()
  {
    AuthenticationMethod oldAuthenticationMethod = authenticationMethod;
    boolean oldAuthenticationMethodESet = authenticationMethodESet;
    authenticationMethod = AUTHENTICATION_METHOD_EDEFAULT;
    authenticationMethodESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SoapIOResourcePackage.HTTP_TRANSPORT__AUTHENTICATION_METHOD, oldAuthenticationMethod, AUTHENTICATION_METHOD_EDEFAULT, oldAuthenticationMethodESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAuthenticationMethod()
  {
    return authenticationMethodESet;
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
      case SoapIOResourcePackage.HTTP_TRANSPORT__URL:
        return basicSetUrl(null, msgs);
      case SoapIOResourcePackage.HTTP_TRANSPORT__PROXY_URL:
        return basicSetProxyUrl(null, msgs);
      case SoapIOResourcePackage.HTTP_TRANSPORT__USER_ID:
        return basicSetUserId(null, msgs);
      case SoapIOResourcePackage.HTTP_TRANSPORT__PASSWORD:
        return basicSetPassword(null, msgs);
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
      case SoapIOResourcePackage.HTTP_TRANSPORT__URL:
        return getUrl();
      case SoapIOResourcePackage.HTTP_TRANSPORT__PROXY_URL:
        return getProxyUrl();
      case SoapIOResourcePackage.HTTP_TRANSPORT__USER_ID:
        return getUserId();
      case SoapIOResourcePackage.HTTP_TRANSPORT__PASSWORD:
        return getPassword();
      case SoapIOResourcePackage.HTTP_TRANSPORT__FORWARD_SM_SESSION:
        return isForwardSMSession();
      case SoapIOResourcePackage.HTTP_TRANSPORT__DISABLE_CHUNKED_ENCODING:
        return isDisableChunkedEncoding();
      case SoapIOResourcePackage.HTTP_TRANSPORT__AUTHENTICATION_METHOD:
        return getAuthenticationMethod();
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
      case SoapIOResourcePackage.HTTP_TRANSPORT__URL:
        setUrl((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.HTTP_TRANSPORT__PROXY_URL:
        setProxyUrl((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.HTTP_TRANSPORT__USER_ID:
        setUserId((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.HTTP_TRANSPORT__PASSWORD:
        setPassword((ComplexValue)newValue);
        return;
      case SoapIOResourcePackage.HTTP_TRANSPORT__FORWARD_SM_SESSION:
        setForwardSMSession((Boolean)newValue);
        return;
      case SoapIOResourcePackage.HTTP_TRANSPORT__DISABLE_CHUNKED_ENCODING:
        setDisableChunkedEncoding((Boolean)newValue);
        return;
      case SoapIOResourcePackage.HTTP_TRANSPORT__AUTHENTICATION_METHOD:
        setAuthenticationMethod((AuthenticationMethod)newValue);
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
      case SoapIOResourcePackage.HTTP_TRANSPORT__URL:
        setUrl((ComplexValue)null);
        return;
      case SoapIOResourcePackage.HTTP_TRANSPORT__PROXY_URL:
        setProxyUrl((ComplexValue)null);
        return;
      case SoapIOResourcePackage.HTTP_TRANSPORT__USER_ID:
        setUserId((ComplexValue)null);
        return;
      case SoapIOResourcePackage.HTTP_TRANSPORT__PASSWORD:
        setPassword((ComplexValue)null);
        return;
      case SoapIOResourcePackage.HTTP_TRANSPORT__FORWARD_SM_SESSION:
        unsetForwardSMSession();
        return;
      case SoapIOResourcePackage.HTTP_TRANSPORT__DISABLE_CHUNKED_ENCODING:
        unsetDisableChunkedEncoding();
        return;
      case SoapIOResourcePackage.HTTP_TRANSPORT__AUTHENTICATION_METHOD:
        unsetAuthenticationMethod();
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
      case SoapIOResourcePackage.HTTP_TRANSPORT__URL:
        return url != null;
      case SoapIOResourcePackage.HTTP_TRANSPORT__PROXY_URL:
        return proxyUrl != null;
      case SoapIOResourcePackage.HTTP_TRANSPORT__USER_ID:
        return userId != null;
      case SoapIOResourcePackage.HTTP_TRANSPORT__PASSWORD:
        return password != null;
      case SoapIOResourcePackage.HTTP_TRANSPORT__FORWARD_SM_SESSION:
        return isSetForwardSMSession();
      case SoapIOResourcePackage.HTTP_TRANSPORT__DISABLE_CHUNKED_ENCODING:
        return isSetDisableChunkedEncoding();
      case SoapIOResourcePackage.HTTP_TRANSPORT__AUTHENTICATION_METHOD:
        return isSetAuthenticationMethod();
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
    result.append(" (forwardSMSession: ");
    if (forwardSMSessionESet) result.append(forwardSMSession); else result.append("<unset>");
    result.append(", disableChunkedEncoding: ");
    if (disableChunkedEncodingESet) result.append(disableChunkedEncoding); else result.append("<unset>");
    result.append(", authenticationMethod: ");
    if (authenticationMethodESet) result.append(authenticationMethod); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // HTTPTransportImpl
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
