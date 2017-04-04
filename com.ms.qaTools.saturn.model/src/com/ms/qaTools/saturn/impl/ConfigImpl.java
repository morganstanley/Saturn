package com.ms.qaTools.saturn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.Config;
import com.ms.qaTools.saturn.SaturnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Config</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.impl.ConfigImpl#getRequiredPackages <em>Required Packages</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.impl.ConfigImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.impl.ConfigImpl#getLogicProvider <em>Logic Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigImpl extends EObjectImpl implements Config
{
  /**
   * The cached value of the '{@link #getRequiredPackages() <em>Required Packages</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getRequiredPackages()
   * @generated
   * @ordered
   */
  protected EList<EObject>      requiredPackages;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT           = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String              name                    = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLogicProvider() <em>Logic Provider</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicProvider()
   * @generated
   * @ordered
   */
  protected static final Object LOGIC_PROVIDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLogicProvider() <em>Logic Provider</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicProvider()
   * @generated
   * @ordered
   */
  protected Object              logicProvider           = LOGIC_PROVIDER_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ConfigImpl()
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
    return SaturnPackage.Literals.CONFIG;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getRequiredPackages()
  {
    if (requiredPackages == null)
    {
      requiredPackages = new EObjectContainmentEList<EObject>(EObject.class, this, SaturnPackage.CONFIG__REQUIRED_PACKAGES);
    }
    return requiredPackages;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Object getLogicProvider()
  {
    return logicProvider;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setLogicProvider(Object newLogicProvider)
  {
    Object oldLogicProvider = logicProvider;
    logicProvider = newLogicProvider;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.CONFIG__LOGIC_PROVIDER, oldLogicProvider, logicProvider));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.CONFIG__NAME, oldName, name));
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
      case SaturnPackage.CONFIG__REQUIRED_PACKAGES:
        return ((InternalEList<?>)getRequiredPackages()).basicRemove(otherEnd, msgs);
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
      case SaturnPackage.CONFIG__REQUIRED_PACKAGES:
        return getRequiredPackages();
      case SaturnPackage.CONFIG__NAME:
        return getName();
      case SaturnPackage.CONFIG__LOGIC_PROVIDER:
        return getLogicProvider();
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
      case SaturnPackage.CONFIG__REQUIRED_PACKAGES:
        getRequiredPackages().clear();
        getRequiredPackages().addAll((Collection<? extends EObject>)newValue);
        return;
      case SaturnPackage.CONFIG__NAME:
        setName((String)newValue);
        return;
      case SaturnPackage.CONFIG__LOGIC_PROVIDER:
        setLogicProvider(newValue);
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
      case SaturnPackage.CONFIG__REQUIRED_PACKAGES:
        getRequiredPackages().clear();
        return;
      case SaturnPackage.CONFIG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SaturnPackage.CONFIG__LOGIC_PROVIDER:
        setLogicProvider(LOGIC_PROVIDER_EDEFAULT);
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
      case SaturnPackage.CONFIG__REQUIRED_PACKAGES:
        return requiredPackages != null && !requiredPackages.isEmpty();
      case SaturnPackage.CONFIG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SaturnPackage.CONFIG__LOGIC_PROVIDER:
        return LOGIC_PROVIDER_EDEFAULT == null ? logicProvider != null : !LOGIC_PROVIDER_EDEFAULT.equals(logicProvider);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", logicProvider: ");
    result.append(logicProvider);
    result.append(')');
    return result.toString();
  }

} // ConfigImpl
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
