package com.ms.qaTools.saturn.modules.xmlManipModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage;
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipNamespace;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xml Manip Namespace</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipNamespaceImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipNamespaceImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.XmlManipNamespaceImpl#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XmlManipNamespaceImpl extends EObjectImpl implements XmlManipNamespace
{
  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected ComplexValue         prefix;

  /**
   * The cached value of the '{@link #getUri() <em>Uri</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
  protected ComplexValue         uri;

  /**
   * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean ENABLED_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected boolean              enabled          = ENABLED_EDEFAULT;

  /**
   * This is true if the Enabled attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              enabledESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected XmlManipNamespaceImpl()
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
    return XmlManipModulePackage.Literals.XML_MANIP_NAMESPACE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getPrefix()
  {
    return prefix;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrefix(ComplexValue newPrefix, NotificationChain msgs)
  {
    ComplexValue oldPrefix = prefix;
    prefix = newPrefix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.XML_MANIP_NAMESPACE__PREFIX, oldPrefix, newPrefix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPrefix(ComplexValue newPrefix)
  {
    if (newPrefix != prefix)
    {
      NotificationChain msgs = null;
      if (prefix != null)
        msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.XML_MANIP_NAMESPACE__PREFIX, null, msgs);
      if (newPrefix != null)
        msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.XML_MANIP_NAMESPACE__PREFIX, null, msgs);
      msgs = basicSetPrefix(newPrefix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.XML_MANIP_NAMESPACE__PREFIX, newPrefix, newPrefix));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getUri()
  {
    return uri;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUri(ComplexValue newUri, NotificationChain msgs)
  {
    ComplexValue oldUri = uri;
    uri = newUri;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.XML_MANIP_NAMESPACE__URI, oldUri, newUri);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setUri(ComplexValue newUri)
  {
    if (newUri != uri)
    {
      NotificationChain msgs = null;
      if (uri != null)
        msgs = ((InternalEObject)uri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.XML_MANIP_NAMESPACE__URI, null, msgs);
      if (newUri != null)
        msgs = ((InternalEObject)newUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.XML_MANIP_NAMESPACE__URI, null, msgs);
      msgs = basicSetUri(newUri, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.XML_MANIP_NAMESPACE__URI, newUri, newUri));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnabled()
  {
    return enabled;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setEnabled(boolean newEnabled)
  {
    boolean oldEnabled = enabled;
    enabled = newEnabled;
    boolean oldEnabledESet = enabledESet;
    enabledESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.XML_MANIP_NAMESPACE__ENABLED, oldEnabled, enabled, !oldEnabledESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetEnabled()
  {
    boolean oldEnabled = enabled;
    boolean oldEnabledESet = enabledESet;
    enabled = ENABLED_EDEFAULT;
    enabledESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XmlManipModulePackage.XML_MANIP_NAMESPACE__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetEnabled()
  {
    return enabledESet;
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
      case XmlManipModulePackage.XML_MANIP_NAMESPACE__PREFIX:
        return basicSetPrefix(null, msgs);
      case XmlManipModulePackage.XML_MANIP_NAMESPACE__URI:
        return basicSetUri(null, msgs);
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
      case XmlManipModulePackage.XML_MANIP_NAMESPACE__PREFIX:
        return getPrefix();
      case XmlManipModulePackage.XML_MANIP_NAMESPACE__URI:
        return getUri();
      case XmlManipModulePackage.XML_MANIP_NAMESPACE__ENABLED:
        return isEnabled();
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
      case XmlManipModulePackage.XML_MANIP_NAMESPACE__PREFIX:
        setPrefix((ComplexValue)newValue);
        return;
      case XmlManipModulePackage.XML_MANIP_NAMESPACE__URI:
        setUri((ComplexValue)newValue);
        return;
      case XmlManipModulePackage.XML_MANIP_NAMESPACE__ENABLED:
        setEnabled((Boolean)newValue);
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
      case XmlManipModulePackage.XML_MANIP_NAMESPACE__PREFIX:
        setPrefix((ComplexValue)null);
        return;
      case XmlManipModulePackage.XML_MANIP_NAMESPACE__URI:
        setUri((ComplexValue)null);
        return;
      case XmlManipModulePackage.XML_MANIP_NAMESPACE__ENABLED:
        unsetEnabled();
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
      case XmlManipModulePackage.XML_MANIP_NAMESPACE__PREFIX:
        return prefix != null;
      case XmlManipModulePackage.XML_MANIP_NAMESPACE__URI:
        return uri != null;
      case XmlManipModulePackage.XML_MANIP_NAMESPACE__ENABLED:
        return isSetEnabled();
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
    result.append(" (enabled: ");
    if (enabledESet) result.append(enabled); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // XmlManipNamespaceImpl
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
