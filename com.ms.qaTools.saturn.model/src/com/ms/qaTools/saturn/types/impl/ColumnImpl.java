package com.ms.qaTools.saturn.types.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.types.Column;
import com.ms.qaTools.saturn.types.ColumnTrimEnum;
import com.ms.qaTools.saturn.types.ColumnTypeEnum;
import com.ms.qaTools.saturn.types.TypesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Column</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.ColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.ColumnImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.ColumnImpl#getKeyOrder <em>Key Order</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.ColumnImpl#isIgnored <em>Ignored</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.ColumnImpl#getTrim <em>Trim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnImpl extends EObjectImpl implements Column
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String         NAME_EDEFAULT      = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String                      name               = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ColumnTypeEnum TYPE_EDEFAULT      = ColumnTypeEnum.STRING;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ColumnTypeEnum              type               = TYPE_EDEFAULT;

  /**
   * This is true if the Type attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                     typeESet;

  /**
   * The default value of the '{@link #getKeyOrder() <em>Key Order</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getKeyOrder()
   * @generated
   * @ordered
   */
  protected static final BigInteger     KEY_ORDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKeyOrder() <em>Key Order</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getKeyOrder()
   * @generated
   * @ordered
   */
  protected BigInteger                  keyOrder           = KEY_ORDER_EDEFAULT;

  /**
   * The default value of the '{@link #isIgnored() <em>Ignored</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIgnored()
   * @generated
   * @ordered
   */
  protected static final boolean        IGNORED_EDEFAULT   = false;

  /**
   * The cached value of the '{@link #isIgnored() <em>Ignored</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIgnored()
   * @generated
   * @ordered
   */
  protected boolean                     ignored            = IGNORED_EDEFAULT;

  /**
   * This is true if the Ignored attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                     ignoredESet;

  /**
   * The default value of the '{@link #getTrim() <em>Trim</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getTrim()
   * @generated
   * @ordered
   */
  protected static final ColumnTrimEnum TRIM_EDEFAULT      = ColumnTrimEnum.TRIMNONE;

  /**
   * The cached value of the '{@link #getTrim() <em>Trim</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getTrim()
   * @generated
   * @ordered
   */
  protected ColumnTrimEnum              trim               = TRIM_EDEFAULT;

  /**
   * This is true if the Trim attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                     trimESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ColumnImpl()
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
    return TypesPackage.Literals.COLUMN;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIgnored()
  {
    return ignored;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIgnored(boolean newIgnored)
  {
    boolean oldIgnored = ignored;
    ignored = newIgnored;
    boolean oldIgnoredESet = ignoredESet;
    ignoredESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.COLUMN__IGNORED, oldIgnored, ignored, !oldIgnoredESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIgnored()
  {
    boolean oldIgnored = ignored;
    boolean oldIgnoredESet = ignoredESet;
    ignored = IGNORED_EDEFAULT;
    ignoredESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.COLUMN__IGNORED, oldIgnored, IGNORED_EDEFAULT, oldIgnoredESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIgnored()
  {
    return ignoredESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getKeyOrder()
  {
    return keyOrder;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setKeyOrder(BigInteger newKeyOrder)
  {
    BigInteger oldKeyOrder = keyOrder;
    keyOrder = newKeyOrder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.COLUMN__KEY_ORDER, oldKeyOrder, keyOrder));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.COLUMN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ColumnTrimEnum getTrim()
  {
    return trim;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTrim(ColumnTrimEnum newTrim)
  {
    ColumnTrimEnum oldTrim = trim;
    trim = newTrim == null ? TRIM_EDEFAULT : newTrim;
    boolean oldTrimESet = trimESet;
    trimESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.COLUMN__TRIM, oldTrim, trim, !oldTrimESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetTrim()
  {
    ColumnTrimEnum oldTrim = trim;
    boolean oldTrimESet = trimESet;
    trim = TRIM_EDEFAULT;
    trimESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.COLUMN__TRIM, oldTrim, TRIM_EDEFAULT, oldTrimESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetTrim()
  {
    return trimESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ColumnTypeEnum getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setType(ColumnTypeEnum newType)
  {
    ColumnTypeEnum oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    boolean oldTypeESet = typeESet;
    typeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.COLUMN__TYPE, oldType, type, !oldTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetType()
  {
    ColumnTypeEnum oldType = type;
    boolean oldTypeESet = typeESet;
    type = TYPE_EDEFAULT;
    typeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.COLUMN__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetType()
  {
    return typeESet;
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
      case TypesPackage.COLUMN__NAME:
        return getName();
      case TypesPackage.COLUMN__TYPE:
        return getType();
      case TypesPackage.COLUMN__KEY_ORDER:
        return getKeyOrder();
      case TypesPackage.COLUMN__IGNORED:
        return isIgnored();
      case TypesPackage.COLUMN__TRIM:
        return getTrim();
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
      case TypesPackage.COLUMN__NAME:
        setName((String)newValue);
        return;
      case TypesPackage.COLUMN__TYPE:
        setType((ColumnTypeEnum)newValue);
        return;
      case TypesPackage.COLUMN__KEY_ORDER:
        setKeyOrder((BigInteger)newValue);
        return;
      case TypesPackage.COLUMN__IGNORED:
        setIgnored((Boolean)newValue);
        return;
      case TypesPackage.COLUMN__TRIM:
        setTrim((ColumnTrimEnum)newValue);
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
      case TypesPackage.COLUMN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TypesPackage.COLUMN__TYPE:
        unsetType();
        return;
      case TypesPackage.COLUMN__KEY_ORDER:
        setKeyOrder(KEY_ORDER_EDEFAULT);
        return;
      case TypesPackage.COLUMN__IGNORED:
        unsetIgnored();
        return;
      case TypesPackage.COLUMN__TRIM:
        unsetTrim();
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
      case TypesPackage.COLUMN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TypesPackage.COLUMN__TYPE:
        return isSetType();
      case TypesPackage.COLUMN__KEY_ORDER:
        return KEY_ORDER_EDEFAULT == null ? keyOrder != null : !KEY_ORDER_EDEFAULT.equals(keyOrder);
      case TypesPackage.COLUMN__IGNORED:
        return isSetIgnored();
      case TypesPackage.COLUMN__TRIM:
        return isSetTrim();
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
    result.append(", type: ");
    if (typeESet) result.append(type); else result.append("<unset>");
    result.append(", keyOrder: ");
    result.append(keyOrder);
    result.append(", ignored: ");
    if (ignoredESet) result.append(ignored); else result.append("<unset>");
    result.append(", trim: ");
    if (trimESet) result.append(trim); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // ColumnImpl
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
