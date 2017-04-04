package com.ms.qaTools.saturn.resources.semaphoreResource.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource;
import com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.types.impl.NamedResourceDefinitionImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Obtain Semaphore Resource</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.ObtainSemaphoreResourceImpl#getSemaphoreResource <em>Semaphore Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.ObtainSemaphoreResourceImpl#getSemaphoreName <em>Semaphore Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.ObtainSemaphoreResourceImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.ObtainSemaphoreResourceImpl#isReleaseAtEndOfScope <em>Release At End Of Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObtainSemaphoreResourceImpl extends NamedResourceDefinitionImpl implements ObtainSemaphoreResource
{
  /**
   * The cached value of the '{@link #getSemaphoreResource() <em>Semaphore Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSemaphoreResource()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition semaphoreResource;

  /**
   * The default value of the '{@link #getSemaphoreName() <em>Semaphore Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemaphoreName()
   * @generated
   * @ordered
   */
  protected static final String     SEMAPHORE_NAME_EDEFAULT          = null;

  /**
   * The cached value of the '{@link #getSemaphoreName() <em>Semaphore Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemaphoreName()
   * @generated
   * @ordered
   */
  protected String                  semaphoreName                    = SEMAPHORE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTimeout()
   * @generated
   * @ordered
   */
  protected static final BigInteger TIMEOUT_EDEFAULT                 = null;

  /**
   * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTimeout()
   * @generated
   * @ordered
   */
  protected BigInteger              timeout                          = TIMEOUT_EDEFAULT;

  /**
   * The default value of the '{@link #isReleaseAtEndOfScope() <em>Release At End Of Scope</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isReleaseAtEndOfScope()
   * @generated
   * @ordered
   */
  protected static final boolean    RELEASE_AT_END_OF_SCOPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReleaseAtEndOfScope() <em>Release At End Of Scope</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isReleaseAtEndOfScope()
   * @generated
   * @ordered
   */
  protected boolean                 releaseAtEndOfScope              = RELEASE_AT_END_OF_SCOPE_EDEFAULT;

  /**
   * This is true if the Release At End Of Scope attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 releaseAtEndOfScopeESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ObtainSemaphoreResourceImpl()
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
    return SemaphoreResourcePackage.Literals.OBTAIN_SEMAPHORE_RESOURCE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getSemaphoreResource()
  {
    return semaphoreResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSemaphoreResource(NamedResourceDefinition newSemaphoreResource,
      NotificationChain msgs)
  {
    NamedResourceDefinition oldSemaphoreResource = semaphoreResource;
    semaphoreResource = newSemaphoreResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_RESOURCE, oldSemaphoreResource, newSemaphoreResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSemaphoreResource(NamedResourceDefinition newSemaphoreResource)
  {
    if (newSemaphoreResource != semaphoreResource)
    {
      NotificationChain msgs = null;
      if (semaphoreResource != null)
        msgs = ((InternalEObject)semaphoreResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_RESOURCE, null, msgs);
      if (newSemaphoreResource != null)
        msgs = ((InternalEObject)newSemaphoreResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_RESOURCE, null, msgs);
      msgs = basicSetSemaphoreResource(newSemaphoreResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_RESOURCE, newSemaphoreResource, newSemaphoreResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getSemaphoreName()
  {
    return semaphoreName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSemaphoreName(String newSemaphoreName)
  {
    String oldSemaphoreName = semaphoreName;
    semaphoreName = newSemaphoreName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_NAME, oldSemaphoreName, semaphoreName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isReleaseAtEndOfScope()
  {
    return releaseAtEndOfScope;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setReleaseAtEndOfScope(boolean newReleaseAtEndOfScope)
  {
    boolean oldReleaseAtEndOfScope = releaseAtEndOfScope;
    releaseAtEndOfScope = newReleaseAtEndOfScope;
    boolean oldReleaseAtEndOfScopeESet = releaseAtEndOfScopeESet;
    releaseAtEndOfScopeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__RELEASE_AT_END_OF_SCOPE, oldReleaseAtEndOfScope, releaseAtEndOfScope, !oldReleaseAtEndOfScopeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetReleaseAtEndOfScope()
  {
    boolean oldReleaseAtEndOfScope = releaseAtEndOfScope;
    boolean oldReleaseAtEndOfScopeESet = releaseAtEndOfScopeESet;
    releaseAtEndOfScope = RELEASE_AT_END_OF_SCOPE_EDEFAULT;
    releaseAtEndOfScopeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__RELEASE_AT_END_OF_SCOPE, oldReleaseAtEndOfScope, RELEASE_AT_END_OF_SCOPE_EDEFAULT, oldReleaseAtEndOfScopeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetReleaseAtEndOfScope()
  {
    return releaseAtEndOfScopeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getTimeout()
  {
    return timeout;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTimeout(BigInteger newTimeout)
  {
    BigInteger oldTimeout = timeout;
    timeout = newTimeout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__TIMEOUT, oldTimeout, timeout));
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
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_RESOURCE:
        return basicSetSemaphoreResource(null, msgs);
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
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_RESOURCE:
        return getSemaphoreResource();
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_NAME:
        return getSemaphoreName();
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__TIMEOUT:
        return getTimeout();
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__RELEASE_AT_END_OF_SCOPE:
        return isReleaseAtEndOfScope();
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
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_RESOURCE:
        setSemaphoreResource((NamedResourceDefinition)newValue);
        return;
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_NAME:
        setSemaphoreName((String)newValue);
        return;
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__TIMEOUT:
        setTimeout((BigInteger)newValue);
        return;
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__RELEASE_AT_END_OF_SCOPE:
        setReleaseAtEndOfScope((Boolean)newValue);
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
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_RESOURCE:
        setSemaphoreResource((NamedResourceDefinition)null);
        return;
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_NAME:
        setSemaphoreName(SEMAPHORE_NAME_EDEFAULT);
        return;
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__TIMEOUT:
        setTimeout(TIMEOUT_EDEFAULT);
        return;
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__RELEASE_AT_END_OF_SCOPE:
        unsetReleaseAtEndOfScope();
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
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_RESOURCE:
        return semaphoreResource != null;
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_NAME:
        return SEMAPHORE_NAME_EDEFAULT == null ? semaphoreName != null : !SEMAPHORE_NAME_EDEFAULT.equals(semaphoreName);
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__TIMEOUT:
        return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE__RELEASE_AT_END_OF_SCOPE:
        return isSetReleaseAtEndOfScope();
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
    result.append(" (semaphoreName: ");
    result.append(semaphoreName);
    result.append(", timeout: ");
    result.append(timeout);
    result.append(", releaseAtEndOfScope: ");
    if (releaseAtEndOfScopeESet) result.append(releaseAtEndOfScope); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // ObtainSemaphoreResourceImpl
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
