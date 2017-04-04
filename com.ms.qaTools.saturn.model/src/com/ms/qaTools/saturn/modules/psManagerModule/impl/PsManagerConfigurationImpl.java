package com.ms.qaTools.saturn.modules.psManagerModule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.modules.psManagerModule.AbstractOperation;
import com.ms.qaTools.saturn.modules.psManagerModule.PsManagerConfiguration;
import com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Ps Manager Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerConfigurationImpl#getConfigFile <em>Config File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.psManagerModule.impl.PsManagerConfigurationImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PsManagerConfigurationImpl extends EObjectImpl implements PsManagerConfiguration
{
  /**
   * The cached value of the '{@link #getConfigFile() <em>Config File</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getConfigFile()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition  configFile;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<AbstractOperation> operations;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected PsManagerConfigurationImpl()
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
    return PsManagerModulePackage.Literals.PS_MANAGER_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getConfigFile()
  {
    return configFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfigFile(NamedResourceDefinition newConfigFile, NotificationChain msgs)
  {
    NamedResourceDefinition oldConfigFile = configFile;
    configFile = newConfigFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.PS_MANAGER_CONFIGURATION__CONFIG_FILE, oldConfigFile, newConfigFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setConfigFile(NamedResourceDefinition newConfigFile)
  {
    if (newConfigFile != configFile)
    {
      NotificationChain msgs = null;
      if (configFile != null)
        msgs = ((InternalEObject)configFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.PS_MANAGER_CONFIGURATION__CONFIG_FILE, null, msgs);
      if (newConfigFile != null)
        msgs = ((InternalEObject)newConfigFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsManagerModulePackage.PS_MANAGER_CONFIGURATION__CONFIG_FILE, null, msgs);
      msgs = basicSetConfigFile(newConfigFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsManagerModulePackage.PS_MANAGER_CONFIGURATION__CONFIG_FILE, newConfigFile, newConfigFile));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractOperation> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<AbstractOperation>(AbstractOperation.class, this, PsManagerModulePackage.PS_MANAGER_CONFIGURATION__OPERATIONS);
    }
    return operations;
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
      case PsManagerModulePackage.PS_MANAGER_CONFIGURATION__CONFIG_FILE:
        return basicSetConfigFile(null, msgs);
      case PsManagerModulePackage.PS_MANAGER_CONFIGURATION__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
      case PsManagerModulePackage.PS_MANAGER_CONFIGURATION__CONFIG_FILE:
        return getConfigFile();
      case PsManagerModulePackage.PS_MANAGER_CONFIGURATION__OPERATIONS:
        return getOperations();
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
      case PsManagerModulePackage.PS_MANAGER_CONFIGURATION__CONFIG_FILE:
        setConfigFile((NamedResourceDefinition)newValue);
        return;
      case PsManagerModulePackage.PS_MANAGER_CONFIGURATION__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends AbstractOperation>)newValue);
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
      case PsManagerModulePackage.PS_MANAGER_CONFIGURATION__CONFIG_FILE:
        setConfigFile((NamedResourceDefinition)null);
        return;
      case PsManagerModulePackage.PS_MANAGER_CONFIGURATION__OPERATIONS:
        getOperations().clear();
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
      case PsManagerModulePackage.PS_MANAGER_CONFIGURATION__CONFIG_FILE:
        return configFile != null;
      case PsManagerModulePackage.PS_MANAGER_CONFIGURATION__OPERATIONS:
        return operations != null && !operations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // PsManagerConfigurationImpl
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
