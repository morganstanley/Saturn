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
package com.ms.qaTools.saturn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.AbstractLink;
import com.ms.qaTools.saturn.AbstractResourceLink;
import com.ms.qaTools.saturn.Saturn;
import com.ms.qaTools.saturn.SaturnPackage;
import com.ms.qaTools.saturn.types.AbstractListener;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Saturn</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.impl.SaturnImpl#getWorkDir <em>Work Dir</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.impl.SaturnImpl#getRunNumberFileName <em>Run Number File Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.impl.SaturnImpl#getDefaultRunNumber <em>Default Run Number</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.impl.SaturnImpl#getPreExecutionListeners <em>Pre Execution Listeners</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.impl.SaturnImpl#getListeners <em>Listeners</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.impl.SaturnImpl#getPostExecutionListeners <em>Post Execution Listeners</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.impl.SaturnImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.impl.SaturnImpl#getResourceLinks <em>Resource Links</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.impl.SaturnImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SaturnImpl extends RunGroupImpl implements Saturn
{
  /**
   * The cached value of the '{@link #getWorkDir() <em>Work Dir</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkDir()
   * @generated
   * @ordered
   */
  protected ComplexValue            workDir;

  /**
   * The cached value of the '{@link #getRunNumberFileName() <em>Run Number File Name</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRunNumberFileName()
   * @generated
   * @ordered
   */
  protected ComplexValue            runNumberFileName;

  /**
   * The cached value of the '{@link #getDefaultRunNumber() <em>Default Run Number</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDefaultRunNumber()
   * @generated
   * @ordered
   */
  protected ComplexValue            defaultRunNumber;

  /**
   * The cached value of the '{@link #getPreExecutionListeners() <em>Pre Execution Listeners</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getPreExecutionListeners()
   * @generated
   * @ordered
   */
  protected EList<AbstractListener> preExecutionListeners;

  /**
   * The cached value of the '{@link #getListeners() <em>Listeners</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getListeners()
   * @generated
   * @ordered
   */
  protected EList<AbstractListener> listeners;

  /**
   * The cached value of the '{@link #getPostExecutionListeners() <em>Post Execution Listeners</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getPostExecutionListeners()
   * @generated
   * @ordered
   */
  protected EList<AbstractListener> postExecutionListeners;

  /**
   * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinks()
   * @generated
   * @ordered
   */
  protected EList<AbstractLink>     links;

  /**
   * The cached value of the '{@link #getResourceLinks() <em>Resource Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceLinks()
   * @generated
   * @ordered
   */
  protected EList<AbstractResourceLink> resourceLinks;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String     VERSION_EDEFAULT = "2.1.11";

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String                  version          = VERSION_EDEFAULT;

  /**
   * This is true if the Version attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 versionESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SaturnImpl()
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
    return SaturnPackage.Literals.SATURN;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getWorkDir()
  {
    return workDir;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkDir(ComplexValue newWorkDir, NotificationChain msgs)
  {
    ComplexValue oldWorkDir = workDir;
    workDir = newWorkDir;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaturnPackage.SATURN__WORK_DIR, oldWorkDir, newWorkDir);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setWorkDir(ComplexValue newWorkDir)
  {
    if (newWorkDir != workDir)
    {
      NotificationChain msgs = null;
      if (workDir != null)
        msgs = ((InternalEObject)workDir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.SATURN__WORK_DIR, null, msgs);
      if (newWorkDir != null)
        msgs = ((InternalEObject)newWorkDir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.SATURN__WORK_DIR, null, msgs);
      msgs = basicSetWorkDir(newWorkDir, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.SATURN__WORK_DIR, newWorkDir, newWorkDir));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getRunNumberFileName()
  {
    return runNumberFileName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRunNumberFileName(ComplexValue newRunNumberFileName, NotificationChain msgs)
  {
    ComplexValue oldRunNumberFileName = runNumberFileName;
    runNumberFileName = newRunNumberFileName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaturnPackage.SATURN__RUN_NUMBER_FILE_NAME, oldRunNumberFileName, newRunNumberFileName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRunNumberFileName(ComplexValue newRunNumberFileName)
  {
    if (newRunNumberFileName != runNumberFileName)
    {
      NotificationChain msgs = null;
      if (runNumberFileName != null)
        msgs = ((InternalEObject)runNumberFileName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.SATURN__RUN_NUMBER_FILE_NAME, null, msgs);
      if (newRunNumberFileName != null)
        msgs = ((InternalEObject)newRunNumberFileName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.SATURN__RUN_NUMBER_FILE_NAME, null, msgs);
      msgs = basicSetRunNumberFileName(newRunNumberFileName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.SATURN__RUN_NUMBER_FILE_NAME, newRunNumberFileName, newRunNumberFileName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDefaultRunNumber()
  {
    return defaultRunNumber;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultRunNumber(ComplexValue newDefaultRunNumber, NotificationChain msgs)
  {
    ComplexValue oldDefaultRunNumber = defaultRunNumber;
    defaultRunNumber = newDefaultRunNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaturnPackage.SATURN__DEFAULT_RUN_NUMBER, oldDefaultRunNumber, newDefaultRunNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultRunNumber(ComplexValue newDefaultRunNumber)
  {
    if (newDefaultRunNumber != defaultRunNumber)
    {
      NotificationChain msgs = null;
      if (defaultRunNumber != null)
        msgs = ((InternalEObject)defaultRunNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.SATURN__DEFAULT_RUN_NUMBER, null, msgs);
      if (newDefaultRunNumber != null)
        msgs = ((InternalEObject)newDefaultRunNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.SATURN__DEFAULT_RUN_NUMBER, null, msgs);
      msgs = basicSetDefaultRunNumber(newDefaultRunNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.SATURN__DEFAULT_RUN_NUMBER, newDefaultRunNumber, newDefaultRunNumber));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractListener> getPreExecutionListeners()
  {
    if (preExecutionListeners == null)
    {
      preExecutionListeners = new EObjectContainmentEList<AbstractListener>(AbstractListener.class, this, SaturnPackage.SATURN__PRE_EXECUTION_LISTENERS);
    }
    return preExecutionListeners;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractListener> getListeners()
  {
    if (listeners == null)
    {
      listeners = new EObjectContainmentEList<AbstractListener>(AbstractListener.class, this, SaturnPackage.SATURN__LISTENERS);
    }
    return listeners;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractListener> getPostExecutionListeners()
  {
    if (postExecutionListeners == null)
    {
      postExecutionListeners = new EObjectContainmentEList<AbstractListener>(AbstractListener.class, this, SaturnPackage.SATURN__POST_EXECUTION_LISTENERS);
    }
    return postExecutionListeners;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractLink> getLinks()
  {
    if (links == null)
    {
      links = new EObjectContainmentEList<AbstractLink>(AbstractLink.class, this, SaturnPackage.SATURN__LINKS);
    }
    return links;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractResourceLink> getResourceLinks()
  {
    if (resourceLinks == null)
    {
      resourceLinks = new EObjectContainmentEList<AbstractResourceLink>(AbstractResourceLink.class, this, SaturnPackage.SATURN__RESOURCE_LINKS);
    }
    return resourceLinks;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    boolean oldVersionESet = versionESet;
    versionESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.SATURN__VERSION, oldVersion, version, !oldVersionESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetVersion()
  {
    String oldVersion = version;
    boolean oldVersionESet = versionESet;
    version = VERSION_EDEFAULT;
    versionESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnPackage.SATURN__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetVersion()
  {
    return versionESet;
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
      case SaturnPackage.SATURN__WORK_DIR:
        return basicSetWorkDir(null, msgs);
      case SaturnPackage.SATURN__RUN_NUMBER_FILE_NAME:
        return basicSetRunNumberFileName(null, msgs);
      case SaturnPackage.SATURN__DEFAULT_RUN_NUMBER:
        return basicSetDefaultRunNumber(null, msgs);
      case SaturnPackage.SATURN__PRE_EXECUTION_LISTENERS:
        return ((InternalEList<?>)getPreExecutionListeners()).basicRemove(otherEnd, msgs);
      case SaturnPackage.SATURN__LISTENERS:
        return ((InternalEList<?>)getListeners()).basicRemove(otherEnd, msgs);
      case SaturnPackage.SATURN__POST_EXECUTION_LISTENERS:
        return ((InternalEList<?>)getPostExecutionListeners()).basicRemove(otherEnd, msgs);
      case SaturnPackage.SATURN__LINKS:
        return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
      case SaturnPackage.SATURN__RESOURCE_LINKS:
        return ((InternalEList<?>)getResourceLinks()).basicRemove(otherEnd, msgs);
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
      case SaturnPackage.SATURN__WORK_DIR:
        return getWorkDir();
      case SaturnPackage.SATURN__RUN_NUMBER_FILE_NAME:
        return getRunNumberFileName();
      case SaturnPackage.SATURN__DEFAULT_RUN_NUMBER:
        return getDefaultRunNumber();
      case SaturnPackage.SATURN__PRE_EXECUTION_LISTENERS:
        return getPreExecutionListeners();
      case SaturnPackage.SATURN__LISTENERS:
        return getListeners();
      case SaturnPackage.SATURN__POST_EXECUTION_LISTENERS:
        return getPostExecutionListeners();
      case SaturnPackage.SATURN__LINKS:
        return getLinks();
      case SaturnPackage.SATURN__RESOURCE_LINKS:
        return getResourceLinks();
      case SaturnPackage.SATURN__VERSION:
        return getVersion();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SaturnPackage.SATURN__WORK_DIR:
        setWorkDir((ComplexValue)newValue);
        return;
      case SaturnPackage.SATURN__RUN_NUMBER_FILE_NAME:
        setRunNumberFileName((ComplexValue)newValue);
        return;
      case SaturnPackage.SATURN__DEFAULT_RUN_NUMBER:
        setDefaultRunNumber((ComplexValue)newValue);
        return;
      case SaturnPackage.SATURN__PRE_EXECUTION_LISTENERS:
        getPreExecutionListeners().clear();
        getPreExecutionListeners().addAll((Collection<? extends AbstractListener>)newValue);
        return;
      case SaturnPackage.SATURN__LISTENERS:
        getListeners().clear();
        getListeners().addAll((Collection<? extends AbstractListener>)newValue);
        return;
      case SaturnPackage.SATURN__POST_EXECUTION_LISTENERS:
        getPostExecutionListeners().clear();
        getPostExecutionListeners().addAll((Collection<? extends AbstractListener>)newValue);
        return;
      case SaturnPackage.SATURN__LINKS:
        getLinks().clear();
        getLinks().addAll((Collection<? extends AbstractLink>)newValue);
        return;
      case SaturnPackage.SATURN__RESOURCE_LINKS:
        getResourceLinks().clear();
        getResourceLinks().addAll((Collection<? extends AbstractResourceLink>)newValue);
        return;
      case SaturnPackage.SATURN__VERSION:
        setVersion((String)newValue);
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
      case SaturnPackage.SATURN__WORK_DIR:
        setWorkDir((ComplexValue)null);
        return;
      case SaturnPackage.SATURN__RUN_NUMBER_FILE_NAME:
        setRunNumberFileName((ComplexValue)null);
        return;
      case SaturnPackage.SATURN__DEFAULT_RUN_NUMBER:
        setDefaultRunNumber((ComplexValue)null);
        return;
      case SaturnPackage.SATURN__PRE_EXECUTION_LISTENERS:
        getPreExecutionListeners().clear();
        return;
      case SaturnPackage.SATURN__LISTENERS:
        getListeners().clear();
        return;
      case SaturnPackage.SATURN__POST_EXECUTION_LISTENERS:
        getPostExecutionListeners().clear();
        return;
      case SaturnPackage.SATURN__LINKS:
        getLinks().clear();
        return;
      case SaturnPackage.SATURN__RESOURCE_LINKS:
        getResourceLinks().clear();
        return;
      case SaturnPackage.SATURN__VERSION:
        unsetVersion();
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
      case SaturnPackage.SATURN__WORK_DIR:
        return workDir != null;
      case SaturnPackage.SATURN__RUN_NUMBER_FILE_NAME:
        return runNumberFileName != null;
      case SaturnPackage.SATURN__DEFAULT_RUN_NUMBER:
        return defaultRunNumber != null;
      case SaturnPackage.SATURN__PRE_EXECUTION_LISTENERS:
        return preExecutionListeners != null && !preExecutionListeners.isEmpty();
      case SaturnPackage.SATURN__LISTENERS:
        return listeners != null && !listeners.isEmpty();
      case SaturnPackage.SATURN__POST_EXECUTION_LISTENERS:
        return postExecutionListeners != null && !postExecutionListeners.isEmpty();
      case SaturnPackage.SATURN__LINKS:
        return links != null && !links.isEmpty();
      case SaturnPackage.SATURN__RESOURCE_LINKS:
        return resourceLinks != null && !resourceLinks.isEmpty();
      case SaturnPackage.SATURN__VERSION:
        return isSetVersion();
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
    result.append(" (version: ");
    if (versionESet) result.append(version); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // SaturnImpl
