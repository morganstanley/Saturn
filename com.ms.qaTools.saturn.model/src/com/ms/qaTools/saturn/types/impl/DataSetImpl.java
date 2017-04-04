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
package com.ms.qaTools.saturn.types.impl;

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

import com.ms.qaTools.saturn.types.Column;
import com.ms.qaTools.saturn.types.ColumnTrimEnum;
import com.ms.qaTools.saturn.types.DataSet;
import com.ms.qaTools.saturn.types.TypesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Data Set</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.DataSetImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.DataSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.DataSetImpl#getTrimAll <em>Trim All</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.types.impl.DataSetImpl#isTrimColNames <em>Trim Col Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSetImpl extends EObjectImpl implements DataSet
{
  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<Column>               columns;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String         NAME_EDEFAULT           = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String                      name                    = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTrimAll() <em>Trim All</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTrimAll()
   * @generated
   * @ordered
   */
  protected static final ColumnTrimEnum TRIM_ALL_EDEFAULT       = ColumnTrimEnum.TRIMNONE;

  /**
   * The cached value of the '{@link #getTrimAll() <em>Trim All</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTrimAll()
   * @generated
   * @ordered
   */
  protected ColumnTrimEnum              trimAll                 = TRIM_ALL_EDEFAULT;

  /**
   * This is true if the Trim All attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                     trimAllESet;

  /**
   * The default value of the '{@link #isTrimColNames() <em>Trim Col Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTrimColNames()
   * @generated
   * @ordered
   */
  protected static final boolean        TRIM_COL_NAMES_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isTrimColNames() <em>Trim Col Names</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isTrimColNames()
   * @generated
   * @ordered
   */
  protected boolean                     trimColNames            = TRIM_COL_NAMES_EDEFAULT;

  /**
   * This is true if the Trim Col Names attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                     trimColNamesESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected DataSetImpl()
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
    return TypesPackage.Literals.DATA_SET;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Column> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<Column>(Column.class, this, TypesPackage.DATA_SET__COLUMNS);
    }
    return columns;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ColumnTrimEnum getTrimAll()
  {
    return trimAll;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTrimAll(ColumnTrimEnum newTrimAll)
  {
    ColumnTrimEnum oldTrimAll = trimAll;
    trimAll = newTrimAll == null ? TRIM_ALL_EDEFAULT : newTrimAll;
    boolean oldTrimAllESet = trimAllESet;
    trimAllESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET__TRIM_ALL, oldTrimAll, trimAll, !oldTrimAllESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetTrimAll()
  {
    ColumnTrimEnum oldTrimAll = trimAll;
    boolean oldTrimAllESet = trimAllESet;
    trimAll = TRIM_ALL_EDEFAULT;
    trimAllESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET__TRIM_ALL, oldTrimAll, TRIM_ALL_EDEFAULT, oldTrimAllESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetTrimAll()
  {
    return trimAllESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isTrimColNames()
  {
    return trimColNames;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTrimColNames(boolean newTrimColNames)
  {
    boolean oldTrimColNames = trimColNames;
    trimColNames = newTrimColNames;
    boolean oldTrimColNamesESet = trimColNamesESet;
    trimColNamesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DATA_SET__TRIM_COL_NAMES, oldTrimColNames, trimColNames, !oldTrimColNamesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetTrimColNames()
  {
    boolean oldTrimColNames = trimColNames;
    boolean oldTrimColNamesESet = trimColNamesESet;
    trimColNames = TRIM_COL_NAMES_EDEFAULT;
    trimColNamesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.DATA_SET__TRIM_COL_NAMES, oldTrimColNames, TRIM_COL_NAMES_EDEFAULT, oldTrimColNamesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetTrimColNames()
  {
    return trimColNamesESet;
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
      case TypesPackage.DATA_SET__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
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
      case TypesPackage.DATA_SET__COLUMNS:
        return getColumns();
      case TypesPackage.DATA_SET__NAME:
        return getName();
      case TypesPackage.DATA_SET__TRIM_ALL:
        return getTrimAll();
      case TypesPackage.DATA_SET__TRIM_COL_NAMES:
        return isTrimColNames();
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
      case TypesPackage.DATA_SET__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends Column>)newValue);
        return;
      case TypesPackage.DATA_SET__NAME:
        setName((String)newValue);
        return;
      case TypesPackage.DATA_SET__TRIM_ALL:
        setTrimAll((ColumnTrimEnum)newValue);
        return;
      case TypesPackage.DATA_SET__TRIM_COL_NAMES:
        setTrimColNames((Boolean)newValue);
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
      case TypesPackage.DATA_SET__COLUMNS:
        getColumns().clear();
        return;
      case TypesPackage.DATA_SET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TypesPackage.DATA_SET__TRIM_ALL:
        unsetTrimAll();
        return;
      case TypesPackage.DATA_SET__TRIM_COL_NAMES:
        unsetTrimColNames();
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
      case TypesPackage.DATA_SET__COLUMNS:
        return columns != null && !columns.isEmpty();
      case TypesPackage.DATA_SET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TypesPackage.DATA_SET__TRIM_ALL:
        return isSetTrimAll();
      case TypesPackage.DATA_SET__TRIM_COL_NAMES:
        return isSetTrimColNames();
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
    result.append(", trimAll: ");
    if (trimAllESet) result.append(trimAll); else result.append("<unset>");
    result.append(", trimColNames: ");
    if (trimColNamesESet) result.append(trimColNames); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // DataSetImpl
