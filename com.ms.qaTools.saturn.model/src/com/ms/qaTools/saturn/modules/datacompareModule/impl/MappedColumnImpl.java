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
package com.ms.qaTools.saturn.modules.datacompareModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage;
import com.ms.qaTools.saturn.modules.datacompareModule.MappedColumn;
import com.ms.qaTools.saturn.types.impl.ColumnImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Mapped Column</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.MappedColumnImpl#getMappingColumn <em>Mapping Column</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.MappedColumnImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.MappedColumnImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.MappedColumnImpl#isIgnoreNull <em>Ignore Null</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappedColumnImpl extends ColumnImpl implements MappedColumn
{
  /**
   * The default value of the '{@link #getMappingColumn() <em>Mapping Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappingColumn()
   * @generated
   * @ordered
   */
  protected static final String  MAPPING_COLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMappingColumn() <em>Mapping Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappingColumn()
   * @generated
   * @ordered
   */
  protected String               mappingColumn           = MAPPING_COLUMN_EDEFAULT;

  /**
   * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
  protected static final String  THRESHOLD_EDEFAULT      = null;

  /**
   * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
  protected String               threshold               = THRESHOLD_EDEFAULT;

  /**
   * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean ENABLED_EDEFAULT        = true;

  /**
   * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected boolean              enabled                 = ENABLED_EDEFAULT;

  /**
   * This is true if the Enabled attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              enabledESet;

  /**
   * The default value of the '{@link #isIgnoreNull() <em>Ignore Null</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIgnoreNull()
   * @generated
   * @ordered
   */
  protected static final boolean IGNORE_NULL_EDEFAULT    = false;

  /**
   * The cached value of the '{@link #isIgnoreNull() <em>Ignore Null</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIgnoreNull()
   * @generated
   * @ordered
   */
  protected boolean              ignoreNull              = IGNORE_NULL_EDEFAULT;

  /**
   * This is true if the Ignore Null attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              ignoreNullESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MappedColumnImpl()
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
    return DatacompareModulePackage.Literals.MAPPED_COLUMN;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnabled()
  {
    return enabled;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setEnabled(boolean newEnabled)
  {
    boolean oldEnabled = enabled;
    enabled = newEnabled;
    boolean oldEnabledESet = enabledESet;
    enabledESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.MAPPED_COLUMN__ENABLED, oldEnabled, enabled, !oldEnabledESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetEnabled()
  {
    boolean oldEnabled = enabled;
    boolean oldEnabledESet = enabledESet;
    enabled = ENABLED_EDEFAULT;
    enabledESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DatacompareModulePackage.MAPPED_COLUMN__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetEnabled()
  {
    return enabledESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIgnoreNull()
  {
    return ignoreNull;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIgnoreNull(boolean newIgnoreNull)
  {
    boolean oldIgnoreNull = ignoreNull;
    ignoreNull = newIgnoreNull;
    boolean oldIgnoreNullESet = ignoreNullESet;
    ignoreNullESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.MAPPED_COLUMN__IGNORE_NULL, oldIgnoreNull, ignoreNull, !oldIgnoreNullESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIgnoreNull()
  {
    boolean oldIgnoreNull = ignoreNull;
    boolean oldIgnoreNullESet = ignoreNullESet;
    ignoreNull = IGNORE_NULL_EDEFAULT;
    ignoreNullESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DatacompareModulePackage.MAPPED_COLUMN__IGNORE_NULL, oldIgnoreNull, IGNORE_NULL_EDEFAULT, oldIgnoreNullESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIgnoreNull()
  {
    return ignoreNullESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getMappingColumn()
  {
    return mappingColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMappingColumn(String newMappingColumn)
  {
    String oldMappingColumn = mappingColumn;
    mappingColumn = newMappingColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.MAPPED_COLUMN__MAPPING_COLUMN, oldMappingColumn, mappingColumn));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getThreshold()
  {
    return threshold;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setThreshold(String newThreshold)
  {
    String oldThreshold = threshold;
    threshold = newThreshold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.MAPPED_COLUMN__THRESHOLD, oldThreshold, threshold));
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
      case DatacompareModulePackage.MAPPED_COLUMN__MAPPING_COLUMN:
        return getMappingColumn();
      case DatacompareModulePackage.MAPPED_COLUMN__THRESHOLD:
        return getThreshold();
      case DatacompareModulePackage.MAPPED_COLUMN__ENABLED:
        return isEnabled();
      case DatacompareModulePackage.MAPPED_COLUMN__IGNORE_NULL:
        return isIgnoreNull();
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
      case DatacompareModulePackage.MAPPED_COLUMN__MAPPING_COLUMN:
        setMappingColumn((String)newValue);
        return;
      case DatacompareModulePackage.MAPPED_COLUMN__THRESHOLD:
        setThreshold((String)newValue);
        return;
      case DatacompareModulePackage.MAPPED_COLUMN__ENABLED:
        setEnabled((Boolean)newValue);
        return;
      case DatacompareModulePackage.MAPPED_COLUMN__IGNORE_NULL:
        setIgnoreNull((Boolean)newValue);
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
      case DatacompareModulePackage.MAPPED_COLUMN__MAPPING_COLUMN:
        setMappingColumn(MAPPING_COLUMN_EDEFAULT);
        return;
      case DatacompareModulePackage.MAPPED_COLUMN__THRESHOLD:
        setThreshold(THRESHOLD_EDEFAULT);
        return;
      case DatacompareModulePackage.MAPPED_COLUMN__ENABLED:
        unsetEnabled();
        return;
      case DatacompareModulePackage.MAPPED_COLUMN__IGNORE_NULL:
        unsetIgnoreNull();
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
      case DatacompareModulePackage.MAPPED_COLUMN__MAPPING_COLUMN:
        return MAPPING_COLUMN_EDEFAULT == null ? mappingColumn != null : !MAPPING_COLUMN_EDEFAULT.equals(mappingColumn);
      case DatacompareModulePackage.MAPPED_COLUMN__THRESHOLD:
        return THRESHOLD_EDEFAULT == null ? threshold != null : !THRESHOLD_EDEFAULT.equals(threshold);
      case DatacompareModulePackage.MAPPED_COLUMN__ENABLED:
        return isSetEnabled();
      case DatacompareModulePackage.MAPPED_COLUMN__IGNORE_NULL:
        return isSetIgnoreNull();
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
    result.append(" (mappingColumn: ");
    result.append(mappingColumn);
    result.append(", threshold: ");
    result.append(threshold);
    result.append(", enabled: ");
    if (enabledESet) result.append(enabled); else result.append("<unset>");
    result.append(", ignoreNull: ");
    if (ignoreNullESet) result.append(ignoreNull); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // MappedColumnImpl
