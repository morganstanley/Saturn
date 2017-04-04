/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 */
package com.ms.qaTools.saturn.values.impl;

import com.ms.qaTools.saturn.types.ResourceDefinition;

import com.ms.qaTools.saturn.values.CellComplexValue;
import com.ms.qaTools.saturn.values.ComplexValue;
import com.ms.qaTools.saturn.values.Describable;
import com.ms.qaTools.saturn.values.FailBehaviorsEnum;
import com.ms.qaTools.saturn.values.ValuesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Complex Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.CellComplexValueImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.CellComplexValueImpl#getFailBehavior <em>Fail Behavior</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.CellComplexValueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.CellComplexValueImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.CellComplexValueImpl#getRow <em>Row</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.CellComplexValueImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.CellComplexValueImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.CellComplexValueImpl#isMemoize <em>Memoize</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellComplexValueImpl extends EObjectImpl implements CellComplexValue
{
  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected ComplexValue defaultValue;

  /**
   * The default value of the '{@link #getFailBehavior() <em>Fail Behavior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFailBehavior()
   * @generated
   * @ordered
   */
  protected static final FailBehaviorsEnum FAIL_BEHAVIOR_EDEFAULT = FailBehaviorsEnum.IGNORE;

  /**
   * The cached value of the '{@link #getFailBehavior() <em>Fail Behavior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFailBehavior()
   * @generated
   * @ordered
   */
  protected FailBehaviorsEnum failBehavior = FAIL_BEHAVIOR_EDEFAULT;

  /**
   * This is true if the Fail Behavior attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean failBehaviorESet;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition resource;

  /**
   * The cached value of the '{@link #getRow() <em>Row</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRow()
   * @generated
   * @ordered
   */
  protected ComplexValue row;

  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected ComplexValue column;

  /**
   * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnName()
   * @generated
   * @ordered
   */
  protected ComplexValue columnName;

  /**
   * The default value of the '{@link #isMemoize() <em>Memoize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMemoize()
   * @generated
   * @ordered
   */
  protected static final boolean MEMOIZE_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isMemoize() <em>Memoize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMemoize()
   * @generated
   * @ordered
   */
  protected boolean memoize = MEMOIZE_EDEFAULT;

  /**
   * This is true if the Memoize attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean memoizeESet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CellComplexValueImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ValuesPackage.Literals.CELL_COMPLEX_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultValue(ComplexValue newDefaultValue, NotificationChain msgs)
  {
    ComplexValue oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.CELL_COMPLEX_VALUE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(ComplexValue newDefaultValue)
  {
    if (newDefaultValue != defaultValue)
    {
      NotificationChain msgs = null;
      if (defaultValue != null)
        msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.CELL_COMPLEX_VALUE__DEFAULT_VALUE, null, msgs);
      if (newDefaultValue != null)
        msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.CELL_COMPLEX_VALUE__DEFAULT_VALUE, null, msgs);
      msgs = basicSetDefaultValue(newDefaultValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.CELL_COMPLEX_VALUE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FailBehaviorsEnum getFailBehavior()
  {
    return failBehavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFailBehavior(FailBehaviorsEnum newFailBehavior)
  {
    FailBehaviorsEnum oldFailBehavior = failBehavior;
    failBehavior = newFailBehavior == null ? FAIL_BEHAVIOR_EDEFAULT : newFailBehavior;
    boolean oldFailBehaviorESet = failBehaviorESet;
    failBehaviorESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.CELL_COMPLEX_VALUE__FAIL_BEHAVIOR, oldFailBehavior, failBehavior, !oldFailBehaviorESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetFailBehavior()
  {
    FailBehaviorsEnum oldFailBehavior = failBehavior;
    boolean oldFailBehaviorESet = failBehaviorESet;
    failBehavior = FAIL_BEHAVIOR_EDEFAULT;
    failBehaviorESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ValuesPackage.CELL_COMPLEX_VALUE__FAIL_BEHAVIOR, oldFailBehavior, FAIL_BEHAVIOR_EDEFAULT, oldFailBehaviorESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetFailBehavior()
  {
    return failBehaviorESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.CELL_COMPLEX_VALUE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getResource()
  {
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResource(ResourceDefinition newResource, NotificationChain msgs)
  {
    ResourceDefinition oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.CELL_COMPLEX_VALUE__RESOURCE, oldResource, newResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResource(ResourceDefinition newResource)
  {
    if (newResource != resource)
    {
      NotificationChain msgs = null;
      if (resource != null)
        msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.CELL_COMPLEX_VALUE__RESOURCE, null, msgs);
      if (newResource != null)
        msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.CELL_COMPLEX_VALUE__RESOURCE, null, msgs);
      msgs = basicSetResource(newResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.CELL_COMPLEX_VALUE__RESOURCE, newResource, newResource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getRow()
  {
    return row;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRow(ComplexValue newRow, NotificationChain msgs)
  {
    ComplexValue oldRow = row;
    row = newRow;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.CELL_COMPLEX_VALUE__ROW, oldRow, newRow);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRow(ComplexValue newRow)
  {
    if (newRow != row)
    {
      NotificationChain msgs = null;
      if (row != null)
        msgs = ((InternalEObject)row).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.CELL_COMPLEX_VALUE__ROW, null, msgs);
      if (newRow != null)
        msgs = ((InternalEObject)newRow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.CELL_COMPLEX_VALUE__ROW, null, msgs);
      msgs = basicSetRow(newRow, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.CELL_COMPLEX_VALUE__ROW, newRow, newRow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getColumn()
  {
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumn(ComplexValue newColumn, NotificationChain msgs)
  {
    ComplexValue oldColumn = column;
    column = newColumn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.CELL_COMPLEX_VALUE__COLUMN, oldColumn, newColumn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumn(ComplexValue newColumn)
  {
    if (newColumn != column)
    {
      NotificationChain msgs = null;
      if (column != null)
        msgs = ((InternalEObject)column).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.CELL_COMPLEX_VALUE__COLUMN, null, msgs);
      if (newColumn != null)
        msgs = ((InternalEObject)newColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.CELL_COMPLEX_VALUE__COLUMN, null, msgs);
      msgs = basicSetColumn(newColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.CELL_COMPLEX_VALUE__COLUMN, newColumn, newColumn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getColumnName()
  {
    return columnName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumnName(ComplexValue newColumnName, NotificationChain msgs)
  {
    ComplexValue oldColumnName = columnName;
    columnName = newColumnName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.CELL_COMPLEX_VALUE__COLUMN_NAME, oldColumnName, newColumnName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnName(ComplexValue newColumnName)
  {
    if (newColumnName != columnName)
    {
      NotificationChain msgs = null;
      if (columnName != null)
        msgs = ((InternalEObject)columnName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.CELL_COMPLEX_VALUE__COLUMN_NAME, null, msgs);
      if (newColumnName != null)
        msgs = ((InternalEObject)newColumnName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.CELL_COMPLEX_VALUE__COLUMN_NAME, null, msgs);
      msgs = basicSetColumnName(newColumnName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.CELL_COMPLEX_VALUE__COLUMN_NAME, newColumnName, newColumnName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMemoize()
  {
    return memoize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMemoize(boolean newMemoize)
  {
    boolean oldMemoize = memoize;
    memoize = newMemoize;
    boolean oldMemoizeESet = memoizeESet;
    memoizeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.CELL_COMPLEX_VALUE__MEMOIZE, oldMemoize, memoize, !oldMemoizeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetMemoize()
  {
    boolean oldMemoize = memoize;
    boolean oldMemoizeESet = memoizeESet;
    memoize = MEMOIZE_EDEFAULT;
    memoizeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ValuesPackage.CELL_COMPLEX_VALUE__MEMOIZE, oldMemoize, MEMOIZE_EDEFAULT, oldMemoizeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetMemoize()
  {
    return memoizeESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ValuesPackage.CELL_COMPLEX_VALUE__DEFAULT_VALUE:
        return basicSetDefaultValue(null, msgs);
      case ValuesPackage.CELL_COMPLEX_VALUE__RESOURCE:
        return basicSetResource(null, msgs);
      case ValuesPackage.CELL_COMPLEX_VALUE__ROW:
        return basicSetRow(null, msgs);
      case ValuesPackage.CELL_COMPLEX_VALUE__COLUMN:
        return basicSetColumn(null, msgs);
      case ValuesPackage.CELL_COMPLEX_VALUE__COLUMN_NAME:
        return basicSetColumnName(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ValuesPackage.CELL_COMPLEX_VALUE__DEFAULT_VALUE:
        return getDefaultValue();
      case ValuesPackage.CELL_COMPLEX_VALUE__FAIL_BEHAVIOR:
        return getFailBehavior();
      case ValuesPackage.CELL_COMPLEX_VALUE__DESCRIPTION:
        return getDescription();
      case ValuesPackage.CELL_COMPLEX_VALUE__RESOURCE:
        return getResource();
      case ValuesPackage.CELL_COMPLEX_VALUE__ROW:
        return getRow();
      case ValuesPackage.CELL_COMPLEX_VALUE__COLUMN:
        return getColumn();
      case ValuesPackage.CELL_COMPLEX_VALUE__COLUMN_NAME:
        return getColumnName();
      case ValuesPackage.CELL_COMPLEX_VALUE__MEMOIZE:
        return isMemoize();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ValuesPackage.CELL_COMPLEX_VALUE__DEFAULT_VALUE:
        setDefaultValue((ComplexValue)newValue);
        return;
      case ValuesPackage.CELL_COMPLEX_VALUE__FAIL_BEHAVIOR:
        setFailBehavior((FailBehaviorsEnum)newValue);
        return;
      case ValuesPackage.CELL_COMPLEX_VALUE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ValuesPackage.CELL_COMPLEX_VALUE__RESOURCE:
        setResource((ResourceDefinition)newValue);
        return;
      case ValuesPackage.CELL_COMPLEX_VALUE__ROW:
        setRow((ComplexValue)newValue);
        return;
      case ValuesPackage.CELL_COMPLEX_VALUE__COLUMN:
        setColumn((ComplexValue)newValue);
        return;
      case ValuesPackage.CELL_COMPLEX_VALUE__COLUMN_NAME:
        setColumnName((ComplexValue)newValue);
        return;
      case ValuesPackage.CELL_COMPLEX_VALUE__MEMOIZE:
        setMemoize((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ValuesPackage.CELL_COMPLEX_VALUE__DEFAULT_VALUE:
        setDefaultValue((ComplexValue)null);
        return;
      case ValuesPackage.CELL_COMPLEX_VALUE__FAIL_BEHAVIOR:
        unsetFailBehavior();
        return;
      case ValuesPackage.CELL_COMPLEX_VALUE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ValuesPackage.CELL_COMPLEX_VALUE__RESOURCE:
        setResource((ResourceDefinition)null);
        return;
      case ValuesPackage.CELL_COMPLEX_VALUE__ROW:
        setRow((ComplexValue)null);
        return;
      case ValuesPackage.CELL_COMPLEX_VALUE__COLUMN:
        setColumn((ComplexValue)null);
        return;
      case ValuesPackage.CELL_COMPLEX_VALUE__COLUMN_NAME:
        setColumnName((ComplexValue)null);
        return;
      case ValuesPackage.CELL_COMPLEX_VALUE__MEMOIZE:
        unsetMemoize();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ValuesPackage.CELL_COMPLEX_VALUE__DEFAULT_VALUE:
        return defaultValue != null;
      case ValuesPackage.CELL_COMPLEX_VALUE__FAIL_BEHAVIOR:
        return isSetFailBehavior();
      case ValuesPackage.CELL_COMPLEX_VALUE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ValuesPackage.CELL_COMPLEX_VALUE__RESOURCE:
        return resource != null;
      case ValuesPackage.CELL_COMPLEX_VALUE__ROW:
        return row != null;
      case ValuesPackage.CELL_COMPLEX_VALUE__COLUMN:
        return column != null;
      case ValuesPackage.CELL_COMPLEX_VALUE__COLUMN_NAME:
        return columnName != null;
      case ValuesPackage.CELL_COMPLEX_VALUE__MEMOIZE:
        return isSetMemoize();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Describable.class)
    {
      switch (derivedFeatureID)
      {
        case ValuesPackage.CELL_COMPLEX_VALUE__DESCRIPTION: return ValuesPackage.DESCRIBABLE__DESCRIPTION;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Describable.class)
    {
      switch (baseFeatureID)
      {
        case ValuesPackage.DESCRIBABLE__DESCRIPTION: return ValuesPackage.CELL_COMPLEX_VALUE__DESCRIPTION;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (failBehavior: ");
    if (failBehaviorESet) result.append(failBehavior); else result.append("<unset>");
    result.append(", description: ");
    result.append(description);
    result.append(", memoize: ");
    if (memoizeESet) result.append(memoize); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //CellComplexValueImpl
