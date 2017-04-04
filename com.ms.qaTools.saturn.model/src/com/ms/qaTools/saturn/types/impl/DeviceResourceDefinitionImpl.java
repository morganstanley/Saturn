package com.ms.qaTools.saturn.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.types.DeviceResourceDefinition;
import com.ms.qaTools.saturn.types.TypesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Device Resource Definition</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.DeviceResourceDefinitionImpl#isInitialize <em>Initialize</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.DeviceResourceDefinitionImpl#isIsInline <em>Is Inline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DeviceResourceDefinitionImpl extends NamedResourceDefinitionImpl implements
    DeviceResourceDefinition
{
  /**
   * The default value of the '{@link #isInitialize() <em>Initialize</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isInitialize()
   * @generated
   * @ordered
   */
  protected static final boolean INITIALIZE_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isInitialize() <em>Initialize</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isInitialize()
   * @generated
   * @ordered
   */
  protected boolean              initialize          = INITIALIZE_EDEFAULT;

  /**
   * This is true if the Initialize attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              initializeESet;

  /**
   * The default value of the '{@link #isIsInline() <em>Is Inline</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIsInline()
   * @generated
   * @ordered
   */
  protected static final boolean IS_INLINE_EDEFAULT  = false;

  /**
   * The cached value of the '{@link #isIsInline() <em>Is Inline</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIsInline()
   * @generated
   * @ordered
   */
  protected boolean              isInline            = IS_INLINE_EDEFAULT;

  /**
   * This is true if the Is Inline attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              isInlineESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected DeviceResourceDefinitionImpl()
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
    return TypesPackage.Literals.DEVICE_RESOURCE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isInitialize()
  {
    return initialize;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInitialize(boolean newInitialize)
  {
    boolean oldInitialize = initialize;
    initialize = newInitialize;
    boolean oldInitializeESet = initializeESet;
    initializeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DEVICE_RESOURCE_DEFINITION__INITIALIZE, oldInitialize, initialize, !oldInitializeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetInitialize()
  {
    boolean oldInitialize = initialize;
    boolean oldInitializeESet = initializeESet;
    initialize = INITIALIZE_EDEFAULT;
    initializeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DEVICE_RESOURCE_DEFINITION__INITIALIZE, oldInitialize, INITIALIZE_EDEFAULT, oldInitializeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetInitialize()
  {
    return initializeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsInline()
  {
    return isInline;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIsInline(boolean newIsInline)
  {
    boolean oldIsInline = isInline;
    isInline = newIsInline;
    boolean oldIsInlineESet = isInlineESet;
    isInlineESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DEVICE_RESOURCE_DEFINITION__IS_INLINE, oldIsInline, isInline, !oldIsInlineESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIsInline()
  {
    boolean oldIsInline = isInline;
    boolean oldIsInlineESet = isInlineESet;
    isInline = IS_INLINE_EDEFAULT;
    isInlineESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DEVICE_RESOURCE_DEFINITION__IS_INLINE, oldIsInline, IS_INLINE_EDEFAULT, oldIsInlineESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIsInline()
  {
    return isInlineESet;
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
      case TypesPackage.DEVICE_RESOURCE_DEFINITION__INITIALIZE:
        return isInitialize();
      case TypesPackage.DEVICE_RESOURCE_DEFINITION__IS_INLINE:
        return isIsInline();
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
      case TypesPackage.DEVICE_RESOURCE_DEFINITION__INITIALIZE:
        setInitialize((Boolean)newValue);
        return;
      case TypesPackage.DEVICE_RESOURCE_DEFINITION__IS_INLINE:
        setIsInline((Boolean)newValue);
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
      case TypesPackage.DEVICE_RESOURCE_DEFINITION__INITIALIZE:
        unsetInitialize();
        return;
      case TypesPackage.DEVICE_RESOURCE_DEFINITION__IS_INLINE:
        unsetIsInline();
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
      case TypesPackage.DEVICE_RESOURCE_DEFINITION__INITIALIZE:
        return isSetInitialize();
      case TypesPackage.DEVICE_RESOURCE_DEFINITION__IS_INLINE:
        return isSetIsInline();
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
    result.append(" (initialize: ");
    if (initializeESet) result.append(initialize); else result.append("<unset>");
    result.append(", isInline: ");
    if (isInlineESet) result.append(isInline); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // DeviceResourceDefinitionImpl
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
