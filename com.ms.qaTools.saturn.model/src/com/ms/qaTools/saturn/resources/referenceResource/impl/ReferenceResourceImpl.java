package com.ms.qaTools.saturn.resources.referenceResource.impl;

import com.ms.qaTools.saturn.AbstractResourceLink;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource;
import com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourcePackage;
import com.ms.qaTools.saturn.types.impl.DeviceResourceDefinitionImpl;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Reference Resource</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.resources.referenceResource.impl.ReferenceResourceImpl#getIncludeFileAdv <em>Include
 * File Adv</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.referenceResource.impl.ReferenceResourceImpl#getResourceAdv <em>Resource
 * Adv</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.referenceResource.impl.ReferenceResourceImpl#isAdvanced <em>Advanced</em>}
 * </li>
 * <li>{@link com.ms.qaTools.saturn.resources.referenceResource.impl.ReferenceResourceImpl#getIncludeFile <em>Include
 * File</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.referenceResource.impl.ReferenceResourceImpl#getResource <em>Resource
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ReferenceResourceImpl extends DeviceResourceDefinitionImpl implements ReferenceResource
{
  /**
   * The cached value of the '{@link #getIncludeFileAdv() <em>Include File Adv</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getIncludeFileAdv()
   * @generated
   * @ordered
   */
  protected ComplexValue         includeFileAdv;

  /**
   * The cached value of the '{@link #getResourceAdv() <em>Resource Adv</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getResourceAdv()
   * @generated
   * @ordered
   */
  protected ComplexValue         resourceAdv;

  /**
   * The default value of the '{@link #getIncludeFile() <em>Include File</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getIncludeFile()
   * @generated
   * @ordered
   */
  protected static final String  INCLUDE_FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIncludeFile() <em>Include File</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getIncludeFile()
   * @generated
   * @ordered
   */
  protected String               includeFile           = INCLUDE_FILE_EDEFAULT;

  /**
   * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected static final String  RESOURCE_EDEFAULT     = null;

  /**
   * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected String               resource              = RESOURCE_EDEFAULT;

  /**
   * The default value of the '{@link #isAdvanced() <em>Advanced</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isAdvanced()
   * @generated
   * @ordered
   */
  protected static final boolean ADVANCED_EDEFAULT     = false;

  /**
   * The cached value of the '{@link #isAdvanced() <em>Advanced</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isAdvanced()
   * @generated
   * @ordered
   */
  protected boolean              advanced              = ADVANCED_EDEFAULT;

  /**
   * This is true if the Advanced attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              advancedESet;

  /**
   * The default value of the '{@link #isClone() <em>Clone</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isClone()
   * @generated
   * @ordered
   */
  protected static final boolean CLONE_EDEFAULT        = false;

  /**
   * The cached value of the '{@link #isClone() <em>Clone</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isClone()
   * @generated
   * @ordered
   */
  protected boolean              clone                 = CLONE_EDEFAULT;

  /**
   * This is true if the Clone attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              cloneESet;

  /**
   * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected AbstractResourceLink link;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceResourceImpl()
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
    return ReferenceResourcePackage.Literals.REFERENCE_RESOURCE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getIncludeFileAdv()
  {
    return includeFileAdv;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIncludeFileAdv(ComplexValue newIncludeFileAdv, NotificationChain msgs)
  {
    ComplexValue oldIncludeFileAdv = includeFileAdv;
    includeFileAdv = newIncludeFileAdv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferenceResourcePackage.REFERENCE_RESOURCE__INCLUDE_FILE_ADV, oldIncludeFileAdv, newIncludeFileAdv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeFileAdv(ComplexValue newIncludeFileAdv)
  {
    if (newIncludeFileAdv != includeFileAdv)
    {
      NotificationChain msgs = null;
      if (includeFileAdv != null)
        msgs = ((InternalEObject)includeFileAdv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferenceResourcePackage.REFERENCE_RESOURCE__INCLUDE_FILE_ADV, null, msgs);
      if (newIncludeFileAdv != null)
        msgs = ((InternalEObject)newIncludeFileAdv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferenceResourcePackage.REFERENCE_RESOURCE__INCLUDE_FILE_ADV, null, msgs);
      msgs = basicSetIncludeFileAdv(newIncludeFileAdv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReferenceResourcePackage.REFERENCE_RESOURCE__INCLUDE_FILE_ADV, newIncludeFileAdv, newIncludeFileAdv));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getResourceAdv()
  {
    return resourceAdv;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResourceAdv(ComplexValue newResourceAdv, NotificationChain msgs)
  {
    ComplexValue oldResourceAdv = resourceAdv;
    resourceAdv = newResourceAdv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferenceResourcePackage.REFERENCE_RESOURCE__RESOURCE_ADV, oldResourceAdv, newResourceAdv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setResourceAdv(ComplexValue newResourceAdv)
  {
    if (newResourceAdv != resourceAdv)
    {
      NotificationChain msgs = null;
      if (resourceAdv != null)
        msgs = ((InternalEObject)resourceAdv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferenceResourcePackage.REFERENCE_RESOURCE__RESOURCE_ADV, null, msgs);
      if (newResourceAdv != null)
        msgs = ((InternalEObject)newResourceAdv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferenceResourcePackage.REFERENCE_RESOURCE__RESOURCE_ADV, null, msgs);
      msgs = basicSetResourceAdv(newResourceAdv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReferenceResourcePackage.REFERENCE_RESOURCE__RESOURCE_ADV, newResourceAdv, newResourceAdv));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isAdvanced()
  {
    return advanced;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAdvanced(boolean newAdvanced)
  {
    boolean oldAdvanced = advanced;
    advanced = newAdvanced;
    boolean oldAdvancedESet = advancedESet;
    advancedESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReferenceResourcePackage.REFERENCE_RESOURCE__ADVANCED, oldAdvanced, advanced, !oldAdvancedESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetAdvanced()
  {
    boolean oldAdvanced = advanced;
    boolean oldAdvancedESet = advancedESet;
    advanced = ADVANCED_EDEFAULT;
    advancedESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ReferenceResourcePackage.REFERENCE_RESOURCE__ADVANCED, oldAdvanced, ADVANCED_EDEFAULT, oldAdvancedESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAdvanced()
  {
    return advancedESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isClone()
  {
    return clone;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setClone(boolean newClone)
  {
    boolean oldClone = clone;
    clone = newClone;
    boolean oldCloneESet = cloneESet;
    cloneESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReferenceResourcePackage.REFERENCE_RESOURCE__CLONE, oldClone, clone, !oldCloneESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetClone()
  {
    boolean oldClone = clone;
    boolean oldCloneESet = cloneESet;
    clone = CLONE_EDEFAULT;
    cloneESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ReferenceResourcePackage.REFERENCE_RESOURCE__CLONE, oldClone, CLONE_EDEFAULT, oldCloneESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetClone()
  {
    return cloneESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getIncludeFile()
  {
    return includeFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeFile(String newIncludeFile)
  {
    String oldIncludeFile = includeFile;
    includeFile = newIncludeFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReferenceResourcePackage.REFERENCE_RESOURCE__INCLUDE_FILE, oldIncludeFile, includeFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractResourceLink getLink()
  {
    if (link != null && link.eIsProxy())
    {
      InternalEObject oldLink = (InternalEObject)link;
      link = (AbstractResourceLink)eResolveProxy(oldLink);
      if (link != oldLink)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferenceResourcePackage.REFERENCE_RESOURCE__LINK, oldLink, link));
      }
    }
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractResourceLink basicGetLink()
  {
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLink(AbstractResourceLink newLink)
  {
    AbstractResourceLink oldLink = link;
    link = newLink;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReferenceResourcePackage.REFERENCE_RESOURCE__LINK, oldLink, link));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getResource()
  {
    return resource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setResource(String newResource)
  {
    String oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReferenceResourcePackage.REFERENCE_RESOURCE__RESOURCE, oldResource, resource));
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
      case ReferenceResourcePackage.REFERENCE_RESOURCE__INCLUDE_FILE_ADV:
        return basicSetIncludeFileAdv(null, msgs);
      case ReferenceResourcePackage.REFERENCE_RESOURCE__RESOURCE_ADV:
        return basicSetResourceAdv(null, msgs);
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
      case ReferenceResourcePackage.REFERENCE_RESOURCE__INCLUDE_FILE_ADV:
        return getIncludeFileAdv();
      case ReferenceResourcePackage.REFERENCE_RESOURCE__RESOURCE_ADV:
        return getResourceAdv();
      case ReferenceResourcePackage.REFERENCE_RESOURCE__INCLUDE_FILE:
        return getIncludeFile();
      case ReferenceResourcePackage.REFERENCE_RESOURCE__RESOURCE:
        return getResource();
      case ReferenceResourcePackage.REFERENCE_RESOURCE__ADVANCED:
        return isAdvanced();
      case ReferenceResourcePackage.REFERENCE_RESOURCE__CLONE:
        return isClone();
      case ReferenceResourcePackage.REFERENCE_RESOURCE__LINK:
        if (resolve) return getLink();
        return basicGetLink();
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
      case ReferenceResourcePackage.REFERENCE_RESOURCE__INCLUDE_FILE_ADV:
        setIncludeFileAdv((ComplexValue)newValue);
        return;
      case ReferenceResourcePackage.REFERENCE_RESOURCE__RESOURCE_ADV:
        setResourceAdv((ComplexValue)newValue);
        return;
      case ReferenceResourcePackage.REFERENCE_RESOURCE__INCLUDE_FILE:
        setIncludeFile((String)newValue);
        return;
      case ReferenceResourcePackage.REFERENCE_RESOURCE__RESOURCE:
        setResource((String)newValue);
        return;
      case ReferenceResourcePackage.REFERENCE_RESOURCE__ADVANCED:
        setAdvanced((Boolean)newValue);
        return;
      case ReferenceResourcePackage.REFERENCE_RESOURCE__CLONE:
        setClone((Boolean)newValue);
        return;
      case ReferenceResourcePackage.REFERENCE_RESOURCE__LINK:
        setLink((AbstractResourceLink)newValue);
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
      case ReferenceResourcePackage.REFERENCE_RESOURCE__INCLUDE_FILE_ADV:
        setIncludeFileAdv((ComplexValue)null);
        return;
      case ReferenceResourcePackage.REFERENCE_RESOURCE__RESOURCE_ADV:
        setResourceAdv((ComplexValue)null);
        return;
      case ReferenceResourcePackage.REFERENCE_RESOURCE__INCLUDE_FILE:
        setIncludeFile(INCLUDE_FILE_EDEFAULT);
        return;
      case ReferenceResourcePackage.REFERENCE_RESOURCE__RESOURCE:
        setResource(RESOURCE_EDEFAULT);
        return;
      case ReferenceResourcePackage.REFERENCE_RESOURCE__ADVANCED:
        unsetAdvanced();
        return;
      case ReferenceResourcePackage.REFERENCE_RESOURCE__CLONE:
        unsetClone();
        return;
      case ReferenceResourcePackage.REFERENCE_RESOURCE__LINK:
        setLink((AbstractResourceLink)null);
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
      case ReferenceResourcePackage.REFERENCE_RESOURCE__INCLUDE_FILE_ADV:
        return includeFileAdv != null;
      case ReferenceResourcePackage.REFERENCE_RESOURCE__RESOURCE_ADV:
        return resourceAdv != null;
      case ReferenceResourcePackage.REFERENCE_RESOURCE__INCLUDE_FILE:
        return INCLUDE_FILE_EDEFAULT == null ? includeFile != null : !INCLUDE_FILE_EDEFAULT.equals(includeFile);
      case ReferenceResourcePackage.REFERENCE_RESOURCE__RESOURCE:
        return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
      case ReferenceResourcePackage.REFERENCE_RESOURCE__ADVANCED:
        return isSetAdvanced();
      case ReferenceResourcePackage.REFERENCE_RESOURCE__CLONE:
        return isSetClone();
      case ReferenceResourcePackage.REFERENCE_RESOURCE__LINK:
        return link != null;
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
    result.append(" (includeFile: ");
    result.append(includeFile);
    result.append(", resource: ");
    result.append(resource);
    result.append(", advanced: ");
    if (advancedESet) result.append(advanced); else result.append("<unset>");
    result.append(", clone: ");
    if (cloneESet) result.append(clone); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // ReferenceResourceImpl
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
