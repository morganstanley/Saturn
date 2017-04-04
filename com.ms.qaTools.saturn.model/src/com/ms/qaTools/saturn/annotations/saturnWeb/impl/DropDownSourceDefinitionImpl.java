package com.ms.qaTools.saturn.annotations.saturnWeb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption;
import com.ms.qaTools.saturn.annotations.saturnWeb.DropDownSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Drop Down Source Definition</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.DropDownSourceDefinitionImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.DropDownSourceDefinitionImpl#isMultiSelect <em>Multi Select</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DropDownSourceDefinitionImpl extends AbstractSourceDefinitionImpl implements DropDownSourceDefinition
{
  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected EList<DropDownOption> options;

  /**
   * The default value of the '{@link #isMultiSelect() <em>Multi Select</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isMultiSelect()
   * @generated
   * @ordered
   */
  protected static final boolean  MULTI_SELECT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMultiSelect() <em>Multi Select</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isMultiSelect()
   * @generated
   * @ordered
   */
  protected boolean               multiSelect           = MULTI_SELECT_EDEFAULT;

  /**
   * This is true if the Multi Select attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean               multiSelectESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected DropDownSourceDefinitionImpl()
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
    return SaturnWebPackage.Literals.DROP_DOWN_SOURCE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<DropDownOption> getOptions()
  {
    if (options == null)
    {
      options = new EObjectContainmentEList<DropDownOption>(DropDownOption.class, this, SaturnWebPackage.DROP_DOWN_SOURCE_DEFINITION__OPTIONS);
    }
    return options;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isMultiSelect()
  {
    return multiSelect;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMultiSelect(boolean newMultiSelect)
  {
    boolean oldMultiSelect = multiSelect;
    multiSelect = newMultiSelect;
    boolean oldMultiSelectESet = multiSelectESet;
    multiSelectESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnWebPackage.DROP_DOWN_SOURCE_DEFINITION__MULTI_SELECT, oldMultiSelect, multiSelect, !oldMultiSelectESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetMultiSelect()
  {
    boolean oldMultiSelect = multiSelect;
    boolean oldMultiSelectESet = multiSelectESet;
    multiSelect = MULTI_SELECT_EDEFAULT;
    multiSelectESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnWebPackage.DROP_DOWN_SOURCE_DEFINITION__MULTI_SELECT, oldMultiSelect, MULTI_SELECT_EDEFAULT, oldMultiSelectESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetMultiSelect()
  {
    return multiSelectESet;
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
      case SaturnWebPackage.DROP_DOWN_SOURCE_DEFINITION__OPTIONS:
        return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
      case SaturnWebPackage.DROP_DOWN_SOURCE_DEFINITION__OPTIONS:
        return getOptions();
      case SaturnWebPackage.DROP_DOWN_SOURCE_DEFINITION__MULTI_SELECT:
        return isMultiSelect();
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
      case SaturnWebPackage.DROP_DOWN_SOURCE_DEFINITION__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends DropDownOption>)newValue);
        return;
      case SaturnWebPackage.DROP_DOWN_SOURCE_DEFINITION__MULTI_SELECT:
        setMultiSelect((Boolean)newValue);
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
      case SaturnWebPackage.DROP_DOWN_SOURCE_DEFINITION__OPTIONS:
        getOptions().clear();
        return;
      case SaturnWebPackage.DROP_DOWN_SOURCE_DEFINITION__MULTI_SELECT:
        unsetMultiSelect();
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
      case SaturnWebPackage.DROP_DOWN_SOURCE_DEFINITION__OPTIONS:
        return options != null && !options.isEmpty();
      case SaturnWebPackage.DROP_DOWN_SOURCE_DEFINITION__MULTI_SELECT:
        return isSetMultiSelect();
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
    result.append(" (multiSelect: ");
    if (multiSelectESet) result.append(multiSelect); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // DropDownSourceDefinitionImpl
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
