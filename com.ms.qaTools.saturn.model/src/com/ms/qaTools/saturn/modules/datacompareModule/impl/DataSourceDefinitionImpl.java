package com.ms.qaTools.saturn.modules.datacompareModule.impl;

import java.math.BigInteger;
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

import com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition;
import com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage;
import com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn;
import com.ms.qaTools.saturn.modules.datacompareModule.SortType;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Data Source Definition</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataSourceDefinitionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataSourceDefinitionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataSourceDefinitionImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataSourceDefinitionImpl#getSortDatasets <em>Sort Datasets</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataSourceDefinitionImpl#isPartialCompare <em>Partial Compare</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataSourceDefinitionImpl#getMaxRows <em>Max Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSourceDefinitionImpl extends EObjectImpl implements DataSourceDefinition
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected ResourceDefinition      left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected ResourceDefinition      right;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<MappedColumn>     columns;

  /**
   * The default value of the '{@link #getSortDatasets() <em>Sort Datasets</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortDatasets()
   * @generated
   * @ordered
   */
  protected static final SortType   SORT_DATASETS_EDEFAULT   = SortType.BOTH;

  /**
   * The cached value of the '{@link #getSortDatasets() <em>Sort Datasets</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSortDatasets()
   * @generated
   * @ordered
   */
  protected SortType                sortDatasets             = SORT_DATASETS_EDEFAULT;

  /**
   * This is true if the Sort Datasets attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 sortDatasetsESet;

  /**
   * The default value of the '{@link #isPartialCompare() <em>Partial Compare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialCompare()
   * @generated
   * @ordered
   */
  protected static final boolean    PARTIAL_COMPARE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPartialCompare() <em>Partial Compare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPartialCompare()
   * @generated
   * @ordered
   */
  protected boolean                 partialCompare           = PARTIAL_COMPARE_EDEFAULT;

  /**
   * This is true if the Partial Compare attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 partialCompareESet;

  /**
   * The default value of the '{@link #getMaxRows() <em>Max Rows</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getMaxRows()
   * @generated
   * @ordered
   */
  protected static final BigInteger MAX_ROWS_EDEFAULT        = new BigInteger("0");

  /**
   * The cached value of the '{@link #getMaxRows() <em>Max Rows</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getMaxRows()
   * @generated
   * @ordered
   */
  protected BigInteger              maxRows                  = MAX_ROWS_EDEFAULT;

  /**
   * This is true if the Max Rows attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 maxRowsESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected DataSourceDefinitionImpl()
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
    return DatacompareModulePackage.Literals.DATA_SOURCE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(ResourceDefinition newLeft, NotificationChain msgs)
  {
    ResourceDefinition oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_SOURCE_DEFINITION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(ResourceDefinition newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.DATA_SOURCE_DEFINITION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.DATA_SOURCE_DEFINITION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_SOURCE_DEFINITION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(ResourceDefinition newRight, NotificationChain msgs)
  {
    ResourceDefinition oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_SOURCE_DEFINITION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRight(ResourceDefinition newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.DATA_SOURCE_DEFINITION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.DATA_SOURCE_DEFINITION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_SOURCE_DEFINITION__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<MappedColumn> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<MappedColumn>(MappedColumn.class, this, DatacompareModulePackage.DATA_SOURCE_DEFINITION__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getMaxRows()
  {
    return maxRows;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMaxRows(BigInteger newMaxRows)
  {
    BigInteger oldMaxRows = maxRows;
    maxRows = newMaxRows;
    boolean oldMaxRowsESet = maxRowsESet;
    maxRowsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_SOURCE_DEFINITION__MAX_ROWS, oldMaxRows, maxRows, !oldMaxRowsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetMaxRows()
  {
    BigInteger oldMaxRows = maxRows;
    boolean oldMaxRowsESet = maxRowsESet;
    maxRows = MAX_ROWS_EDEFAULT;
    maxRowsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DatacompareModulePackage.DATA_SOURCE_DEFINITION__MAX_ROWS, oldMaxRows, MAX_ROWS_EDEFAULT, oldMaxRowsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetMaxRows()
  {
    return maxRowsESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isPartialCompare()
  {
    return partialCompare;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPartialCompare(boolean newPartialCompare)
  {
    boolean oldPartialCompare = partialCompare;
    partialCompare = newPartialCompare;
    boolean oldPartialCompareESet = partialCompareESet;
    partialCompareESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_SOURCE_DEFINITION__PARTIAL_COMPARE, oldPartialCompare, partialCompare, !oldPartialCompareESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetPartialCompare()
  {
    boolean oldPartialCompare = partialCompare;
    boolean oldPartialCompareESet = partialCompareESet;
    partialCompare = PARTIAL_COMPARE_EDEFAULT;
    partialCompareESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DatacompareModulePackage.DATA_SOURCE_DEFINITION__PARTIAL_COMPARE, oldPartialCompare, PARTIAL_COMPARE_EDEFAULT, oldPartialCompareESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetPartialCompare()
  {
    return partialCompareESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SortType getSortDatasets()
  {
    return sortDatasets;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSortDatasets(SortType newSortDatasets)
  {
    SortType oldSortDatasets = sortDatasets;
    sortDatasets = newSortDatasets == null ? SORT_DATASETS_EDEFAULT : newSortDatasets;
    boolean oldSortDatasetsESet = sortDatasetsESet;
    sortDatasetsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_SOURCE_DEFINITION__SORT_DATASETS, oldSortDatasets, sortDatasets, !oldSortDatasetsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetSortDatasets()
  {
    SortType oldSortDatasets = sortDatasets;
    boolean oldSortDatasetsESet = sortDatasetsESet;
    sortDatasets = SORT_DATASETS_EDEFAULT;
    sortDatasetsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DatacompareModulePackage.DATA_SOURCE_DEFINITION__SORT_DATASETS, oldSortDatasets, SORT_DATASETS_EDEFAULT, oldSortDatasetsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetSortDatasets()
  {
    return sortDatasetsESet;
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
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__LEFT:
        return basicSetLeft(null, msgs);
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__RIGHT:
        return basicSetRight(null, msgs);
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__COLUMNS:
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
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__LEFT:
        return getLeft();
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__RIGHT:
        return getRight();
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__COLUMNS:
        return getColumns();
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__SORT_DATASETS:
        return getSortDatasets();
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__PARTIAL_COMPARE:
        return isPartialCompare();
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__MAX_ROWS:
        return getMaxRows();
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
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__LEFT:
        setLeft((ResourceDefinition)newValue);
        return;
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__RIGHT:
        setRight((ResourceDefinition)newValue);
        return;
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends MappedColumn>)newValue);
        return;
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__SORT_DATASETS:
        setSortDatasets((SortType)newValue);
        return;
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__PARTIAL_COMPARE:
        setPartialCompare((Boolean)newValue);
        return;
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__MAX_ROWS:
        setMaxRows((BigInteger)newValue);
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
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__LEFT:
        setLeft((ResourceDefinition)null);
        return;
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__RIGHT:
        setRight((ResourceDefinition)null);
        return;
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__COLUMNS:
        getColumns().clear();
        return;
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__SORT_DATASETS:
        unsetSortDatasets();
        return;
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__PARTIAL_COMPARE:
        unsetPartialCompare();
        return;
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__MAX_ROWS:
        unsetMaxRows();
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
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__LEFT:
        return left != null;
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__RIGHT:
        return right != null;
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__COLUMNS:
        return columns != null && !columns.isEmpty();
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__SORT_DATASETS:
        return isSetSortDatasets();
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__PARTIAL_COMPARE:
        return isSetPartialCompare();
      case DatacompareModulePackage.DATA_SOURCE_DEFINITION__MAX_ROWS:
        return isSetMaxRows();
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
    result.append(" (sortDatasets: ");
    if (sortDatasetsESet) result.append(sortDatasets); else result.append("<unset>");
    result.append(", partialCompare: ");
    if (partialCompareESet) result.append(partialCompare); else result.append("<unset>");
    result.append(", maxRows: ");
    if (maxRowsESet) result.append(maxRows); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // DataSourceDefinitionImpl
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
