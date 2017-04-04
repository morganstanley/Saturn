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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.modules.datacompareModule.AbstractDiffSetExplainer;
import com.ms.qaTools.saturn.modules.datacompareModule.DataCompareConfiguration;
import com.ms.qaTools.saturn.modules.datacompareModule.DataSourceDefinition;
import com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage;
import com.ms.qaTools.saturn.modules.datacompareModule.Output;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Data Compare Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataCompareConfigurationImpl#getDataSources <em>Data Sources</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataCompareConfigurationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataCompareConfigurationImpl#getDiffSetExplainer <em>Diff Set Explainer</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataCompareConfigurationImpl#isIgnoreInLeftOnlyColumns <em>Ignore In Left Only Columns</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataCompareConfigurationImpl#isIgnoreInRightOnlyColumns <em>Ignore In Right Only Columns</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.DataCompareConfigurationImpl#isFailOnValidation <em>Fail On Validation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataCompareConfigurationImpl extends EObjectImpl implements DataCompareConfiguration
{
  /**
   * The cached value of the '{@link #getDataSources() <em>Data Sources</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDataSources()
   * @generated
   * @ordered
   */
  protected DataSourceDefinition     dataSources;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected Output                   output;

  /**
   * The cached value of the '{@link #getDiffSetExplainer() <em>Diff Set Explainer</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDiffSetExplainer()
   * @generated
   * @ordered
   */
  protected AbstractDiffSetExplainer diffSetExplainer;

  /**
   * The default value of the '{@link #isIgnoreInLeftOnlyColumns() <em>Ignore In Left Only Columns</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isIgnoreInLeftOnlyColumns()
   * @generated
   * @ordered
   */
  protected static final boolean     IGNORE_IN_LEFT_ONLY_COLUMNS_EDEFAULT  = false;

  /**
   * The cached value of the '{@link #isIgnoreInLeftOnlyColumns() <em>Ignore In Left Only Columns</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isIgnoreInLeftOnlyColumns()
   * @generated
   * @ordered
   */
  protected boolean                  ignoreInLeftOnlyColumns               = IGNORE_IN_LEFT_ONLY_COLUMNS_EDEFAULT;

  /**
   * This is true if the Ignore In Left Only Columns attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  protected boolean                  ignoreInLeftOnlyColumnsESet;

  /**
   * The default value of the '{@link #isIgnoreInRightOnlyColumns() <em>Ignore In Right Only Columns</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isIgnoreInRightOnlyColumns()
   * @generated
   * @ordered
   */
  protected static final boolean     IGNORE_IN_RIGHT_ONLY_COLUMNS_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isIgnoreInRightOnlyColumns() <em>Ignore In Right Only Columns</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isIgnoreInRightOnlyColumns()
   * @generated
   * @ordered
   */
  protected boolean                  ignoreInRightOnlyColumns              = IGNORE_IN_RIGHT_ONLY_COLUMNS_EDEFAULT;

  /**
   * This is true if the Ignore In Right Only Columns attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  protected boolean                  ignoreInRightOnlyColumnsESet;

  /**
   * The default value of the '{@link #isFailOnValidation() <em>Fail On Validation</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isFailOnValidation()
   * @generated
   * @ordered
   */
  protected static final boolean     FAIL_ON_VALIDATION_EDEFAULT           = true;

  /**
   * The cached value of the '{@link #isFailOnValidation() <em>Fail On Validation</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isFailOnValidation()
   * @generated
   * @ordered
   */
  protected boolean                  failOnValidation                      = FAIL_ON_VALIDATION_EDEFAULT;

  /**
   * This is true if the Fail On Validation attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                  failOnValidationESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected DataCompareConfigurationImpl()
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
    return DatacompareModulePackage.Literals.DATA_COMPARE_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataSourceDefinition getDataSources()
  {
    return dataSources;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataSources(DataSourceDefinition newDataSources, NotificationChain msgs)
  {
    DataSourceDefinition oldDataSources = dataSources;
    dataSources = newDataSources;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DATA_SOURCES, oldDataSources, newDataSources);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDataSources(DataSourceDefinition newDataSources)
  {
    if (newDataSources != dataSources)
    {
      NotificationChain msgs = null;
      if (dataSources != null)
        msgs = ((InternalEObject)dataSources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DATA_SOURCES, null, msgs);
      if (newDataSources != null)
        msgs = ((InternalEObject)newDataSources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DATA_SOURCES, null, msgs);
      msgs = basicSetDataSources(newDataSources, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DATA_SOURCES, newDataSources, newDataSources));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Output getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutput(Output newOutput, NotificationChain msgs)
  {
    Output oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__OUTPUT, oldOutput, newOutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(Output newOutput)
  {
    if (newOutput != output)
    {
      NotificationChain msgs = null;
      if (output != null)
        msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__OUTPUT, null, msgs);
      if (newOutput != null)
        msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__OUTPUT, null, msgs);
      msgs = basicSetOutput(newOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__OUTPUT, newOutput, newOutput));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractDiffSetExplainer getDiffSetExplainer()
  {
    return diffSetExplainer;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiffSetExplainer(AbstractDiffSetExplainer newDiffSetExplainer, NotificationChain msgs)
  {
    AbstractDiffSetExplainer oldDiffSetExplainer = diffSetExplainer;
    diffSetExplainer = newDiffSetExplainer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DIFF_SET_EXPLAINER, oldDiffSetExplainer, newDiffSetExplainer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDiffSetExplainer(AbstractDiffSetExplainer newDiffSetExplainer)
  {
    if (newDiffSetExplainer != diffSetExplainer)
    {
      NotificationChain msgs = null;
      if (diffSetExplainer != null)
        msgs = ((InternalEObject)diffSetExplainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DIFF_SET_EXPLAINER, null, msgs);
      if (newDiffSetExplainer != null)
        msgs = ((InternalEObject)newDiffSetExplainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DIFF_SET_EXPLAINER, null, msgs);
      msgs = basicSetDiffSetExplainer(newDiffSetExplainer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DIFF_SET_EXPLAINER, newDiffSetExplainer, newDiffSetExplainer));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isFailOnValidation()
  {
    return failOnValidation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setFailOnValidation(boolean newFailOnValidation)
  {
    boolean oldFailOnValidation = failOnValidation;
    failOnValidation = newFailOnValidation;
    boolean oldFailOnValidationESet = failOnValidationESet;
    failOnValidationESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__FAIL_ON_VALIDATION, oldFailOnValidation, failOnValidation, !oldFailOnValidationESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetFailOnValidation()
  {
    boolean oldFailOnValidation = failOnValidation;
    boolean oldFailOnValidationESet = failOnValidationESet;
    failOnValidation = FAIL_ON_VALIDATION_EDEFAULT;
    failOnValidationESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__FAIL_ON_VALIDATION, oldFailOnValidation, FAIL_ON_VALIDATION_EDEFAULT, oldFailOnValidationESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetFailOnValidation()
  {
    return failOnValidationESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIgnoreInLeftOnlyColumns()
  {
    return ignoreInLeftOnlyColumns;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIgnoreInLeftOnlyColumns(boolean newIgnoreInLeftOnlyColumns)
  {
    boolean oldIgnoreInLeftOnlyColumns = ignoreInLeftOnlyColumns;
    ignoreInLeftOnlyColumns = newIgnoreInLeftOnlyColumns;
    boolean oldIgnoreInLeftOnlyColumnsESet = ignoreInLeftOnlyColumnsESet;
    ignoreInLeftOnlyColumnsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__IGNORE_IN_LEFT_ONLY_COLUMNS, oldIgnoreInLeftOnlyColumns, ignoreInLeftOnlyColumns, !oldIgnoreInLeftOnlyColumnsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIgnoreInLeftOnlyColumns()
  {
    boolean oldIgnoreInLeftOnlyColumns = ignoreInLeftOnlyColumns;
    boolean oldIgnoreInLeftOnlyColumnsESet = ignoreInLeftOnlyColumnsESet;
    ignoreInLeftOnlyColumns = IGNORE_IN_LEFT_ONLY_COLUMNS_EDEFAULT;
    ignoreInLeftOnlyColumnsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__IGNORE_IN_LEFT_ONLY_COLUMNS, oldIgnoreInLeftOnlyColumns, IGNORE_IN_LEFT_ONLY_COLUMNS_EDEFAULT, oldIgnoreInLeftOnlyColumnsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIgnoreInLeftOnlyColumns()
  {
    return ignoreInLeftOnlyColumnsESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIgnoreInRightOnlyColumns()
  {
    return ignoreInRightOnlyColumns;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIgnoreInRightOnlyColumns(boolean newIgnoreInRightOnlyColumns)
  {
    boolean oldIgnoreInRightOnlyColumns = ignoreInRightOnlyColumns;
    ignoreInRightOnlyColumns = newIgnoreInRightOnlyColumns;
    boolean oldIgnoreInRightOnlyColumnsESet = ignoreInRightOnlyColumnsESet;
    ignoreInRightOnlyColumnsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__IGNORE_IN_RIGHT_ONLY_COLUMNS, oldIgnoreInRightOnlyColumns, ignoreInRightOnlyColumns, !oldIgnoreInRightOnlyColumnsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIgnoreInRightOnlyColumns()
  {
    boolean oldIgnoreInRightOnlyColumns = ignoreInRightOnlyColumns;
    boolean oldIgnoreInRightOnlyColumnsESet = ignoreInRightOnlyColumnsESet;
    ignoreInRightOnlyColumns = IGNORE_IN_RIGHT_ONLY_COLUMNS_EDEFAULT;
    ignoreInRightOnlyColumnsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__IGNORE_IN_RIGHT_ONLY_COLUMNS, oldIgnoreInRightOnlyColumns, IGNORE_IN_RIGHT_ONLY_COLUMNS_EDEFAULT, oldIgnoreInRightOnlyColumnsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIgnoreInRightOnlyColumns()
  {
    return ignoreInRightOnlyColumnsESet;
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
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DATA_SOURCES:
        return basicSetDataSources(null, msgs);
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__OUTPUT:
        return basicSetOutput(null, msgs);
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DIFF_SET_EXPLAINER:
        return basicSetDiffSetExplainer(null, msgs);
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
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DATA_SOURCES:
        return getDataSources();
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__OUTPUT:
        return getOutput();
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DIFF_SET_EXPLAINER:
        return getDiffSetExplainer();
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__IGNORE_IN_LEFT_ONLY_COLUMNS:
        return isIgnoreInLeftOnlyColumns();
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__IGNORE_IN_RIGHT_ONLY_COLUMNS:
        return isIgnoreInRightOnlyColumns();
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__FAIL_ON_VALIDATION:
        return isFailOnValidation();
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
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DATA_SOURCES:
        setDataSources((DataSourceDefinition)newValue);
        return;
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__OUTPUT:
        setOutput((Output)newValue);
        return;
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DIFF_SET_EXPLAINER:
        setDiffSetExplainer((AbstractDiffSetExplainer)newValue);
        return;
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__IGNORE_IN_LEFT_ONLY_COLUMNS:
        setIgnoreInLeftOnlyColumns((Boolean)newValue);
        return;
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__IGNORE_IN_RIGHT_ONLY_COLUMNS:
        setIgnoreInRightOnlyColumns((Boolean)newValue);
        return;
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__FAIL_ON_VALIDATION:
        setFailOnValidation((Boolean)newValue);
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
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DATA_SOURCES:
        setDataSources((DataSourceDefinition)null);
        return;
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__OUTPUT:
        setOutput((Output)null);
        return;
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DIFF_SET_EXPLAINER:
        setDiffSetExplainer((AbstractDiffSetExplainer)null);
        return;
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__IGNORE_IN_LEFT_ONLY_COLUMNS:
        unsetIgnoreInLeftOnlyColumns();
        return;
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__IGNORE_IN_RIGHT_ONLY_COLUMNS:
        unsetIgnoreInRightOnlyColumns();
        return;
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__FAIL_ON_VALIDATION:
        unsetFailOnValidation();
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
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DATA_SOURCES:
        return dataSources != null;
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__OUTPUT:
        return output != null;
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__DIFF_SET_EXPLAINER:
        return diffSetExplainer != null;
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__IGNORE_IN_LEFT_ONLY_COLUMNS:
        return isSetIgnoreInLeftOnlyColumns();
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__IGNORE_IN_RIGHT_ONLY_COLUMNS:
        return isSetIgnoreInRightOnlyColumns();
      case DatacompareModulePackage.DATA_COMPARE_CONFIGURATION__FAIL_ON_VALIDATION:
        return isSetFailOnValidation();
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
    result.append(" (ignoreInLeftOnlyColumns: ");
    if (ignoreInLeftOnlyColumnsESet) result.append(ignoreInLeftOnlyColumns); else result.append("<unset>");
    result.append(", ignoreInRightOnlyColumns: ");
    if (ignoreInRightOnlyColumnsESet) result.append(ignoreInRightOnlyColumns); else result.append("<unset>");
    result.append(", failOnValidation: ");
    if (failOnValidationESet) result.append(failOnValidation); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // DataCompareConfigurationImpl
