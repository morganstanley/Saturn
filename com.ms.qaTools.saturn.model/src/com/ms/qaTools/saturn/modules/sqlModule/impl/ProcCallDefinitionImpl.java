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
package com.ms.qaTools.saturn.modules.sqlModule.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.modules.sqlModule.ProcCallDefinition;
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Proc Call Definition</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.ProcCallDefinitionImpl#getSQL <em>SQL</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.ProcCallDefinitionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.ProcCallDefinitionImpl#getParameterFile <em>Parameter File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.ProcCallDefinitionImpl#getIgnoreVal <em>Ignore Val</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.ProcCallDefinitionImpl#isHasOutput <em>Has Output</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.ProcCallDefinitionImpl#getCallCount <em>Call Count</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.ProcCallDefinitionImpl#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcCallDefinitionImpl extends EObjectImpl implements ProcCallDefinition
{
  /**
   * The cached value of the '{@link #getSQL() <em>SQL</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSQL()
   * @generated
   * @ordered
   */
  protected ComplexValue            sQL;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected ResourceDefinition      output;

  /**
   * The cached value of the '{@link #getParameterFile() <em>Parameter File</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getParameterFile()
   * @generated
   * @ordered
   */
  protected ResourceDefinition      parameterFile;

  /**
   * The cached value of the '{@link #getIgnoreVal() <em>Ignore Val</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getIgnoreVal()
   * @generated
   * @ordered
   */
  protected ComplexValue            ignoreVal;

  /**
   * The default value of the '{@link #isHasOutput() <em>Has Output</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isHasOutput()
   * @generated
   * @ordered
   */
  protected static final boolean    HAS_OUTPUT_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isHasOutput() <em>Has Output</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isHasOutput()
   * @generated
   * @ordered
   */
  protected boolean                 hasOutput           = HAS_OUTPUT_EDEFAULT;

  /**
   * This is true if the Has Output attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 hasOutputESet;

  /**
   * The default value of the '{@link #getCallCount() <em>Call Count</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getCallCount()
   * @generated
   * @ordered
   */
  protected static final BigInteger CALL_COUNT_EDEFAULT = new BigInteger("1");

  /**
   * The cached value of the '{@link #getCallCount() <em>Call Count</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getCallCount()
   * @generated
   * @ordered
   */
  protected BigInteger              callCount           = CALL_COUNT_EDEFAULT;

  /**
   * This is true if the Call Count attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 callCountESet;

  /**
   * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean    ENABLED_EDEFAULT    = true;

  /**
   * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected boolean                 enabled             = ENABLED_EDEFAULT;

  /**
   * This is true if the Enabled attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 enabledESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ProcCallDefinitionImpl()
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
    return SqlModulePackage.Literals.PROC_CALL_DEFINITION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getSQL()
  {
    return sQL;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSQL(ComplexValue newSQL, NotificationChain msgs)
  {
    ComplexValue oldSQL = sQL;
    sQL = newSQL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.PROC_CALL_DEFINITION__SQL, oldSQL, newSQL);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSQL(ComplexValue newSQL)
  {
    if (newSQL != sQL)
    {
      NotificationChain msgs = null;
      if (sQL != null)
        msgs = ((InternalEObject)sQL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.PROC_CALL_DEFINITION__SQL, null, msgs);
      if (newSQL != null)
        msgs = ((InternalEObject)newSQL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.PROC_CALL_DEFINITION__SQL, null, msgs);
      msgs = basicSetSQL(newSQL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.PROC_CALL_DEFINITION__SQL, newSQL, newSQL));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutput(ResourceDefinition newOutput, NotificationChain msgs)
  {
    ResourceDefinition oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.PROC_CALL_DEFINITION__OUTPUT, oldOutput, newOutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(ResourceDefinition newOutput)
  {
    if (newOutput != output)
    {
      NotificationChain msgs = null;
      if (output != null)
        msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.PROC_CALL_DEFINITION__OUTPUT, null, msgs);
      if (newOutput != null)
        msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.PROC_CALL_DEFINITION__OUTPUT, null, msgs);
      msgs = basicSetOutput(newOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.PROC_CALL_DEFINITION__OUTPUT, newOutput, newOutput));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getParameterFile()
  {
    return parameterFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterFile(ResourceDefinition newParameterFile, NotificationChain msgs)
  {
    ResourceDefinition oldParameterFile = parameterFile;
    parameterFile = newParameterFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.PROC_CALL_DEFINITION__PARAMETER_FILE, oldParameterFile, newParameterFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setParameterFile(ResourceDefinition newParameterFile)
  {
    if (newParameterFile != parameterFile)
    {
      NotificationChain msgs = null;
      if (parameterFile != null)
        msgs = ((InternalEObject)parameterFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.PROC_CALL_DEFINITION__PARAMETER_FILE, null, msgs);
      if (newParameterFile != null)
        msgs = ((InternalEObject)newParameterFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.PROC_CALL_DEFINITION__PARAMETER_FILE, null, msgs);
      msgs = basicSetParameterFile(newParameterFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.PROC_CALL_DEFINITION__PARAMETER_FILE, newParameterFile, newParameterFile));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getIgnoreVal()
  {
    return ignoreVal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIgnoreVal(ComplexValue newIgnoreVal, NotificationChain msgs)
  {
    ComplexValue oldIgnoreVal = ignoreVal;
    ignoreVal = newIgnoreVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.PROC_CALL_DEFINITION__IGNORE_VAL, oldIgnoreVal, newIgnoreVal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIgnoreVal(ComplexValue newIgnoreVal)
  {
    if (newIgnoreVal != ignoreVal)
    {
      NotificationChain msgs = null;
      if (ignoreVal != null)
        msgs = ((InternalEObject)ignoreVal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.PROC_CALL_DEFINITION__IGNORE_VAL, null, msgs);
      if (newIgnoreVal != null)
        msgs = ((InternalEObject)newIgnoreVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.PROC_CALL_DEFINITION__IGNORE_VAL, null, msgs);
      msgs = basicSetIgnoreVal(newIgnoreVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.PROC_CALL_DEFINITION__IGNORE_VAL, newIgnoreVal, newIgnoreVal));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getCallCount()
  {
    return callCount;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCallCount(BigInteger newCallCount)
  {
    BigInteger oldCallCount = callCount;
    callCount = newCallCount;
    boolean oldCallCountESet = callCountESet;
    callCountESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.PROC_CALL_DEFINITION__CALL_COUNT, oldCallCount, callCount, !oldCallCountESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCallCount()
  {
    BigInteger oldCallCount = callCount;
    boolean oldCallCountESet = callCountESet;
    callCount = CALL_COUNT_EDEFAULT;
    callCountESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SqlModulePackage.PROC_CALL_DEFINITION__CALL_COUNT, oldCallCount, CALL_COUNT_EDEFAULT, oldCallCountESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCallCount()
  {
    return callCountESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.PROC_CALL_DEFINITION__ENABLED, oldEnabled, enabled, !oldEnabledESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, SqlModulePackage.PROC_CALL_DEFINITION__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
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
  public boolean isHasOutput()
  {
    return hasOutput;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setHasOutput(boolean newHasOutput)
  {
    boolean oldHasOutput = hasOutput;
    hasOutput = newHasOutput;
    boolean oldHasOutputESet = hasOutputESet;
    hasOutputESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.PROC_CALL_DEFINITION__HAS_OUTPUT, oldHasOutput, hasOutput, !oldHasOutputESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetHasOutput()
  {
    boolean oldHasOutput = hasOutput;
    boolean oldHasOutputESet = hasOutputESet;
    hasOutput = HAS_OUTPUT_EDEFAULT;
    hasOutputESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SqlModulePackage.PROC_CALL_DEFINITION__HAS_OUTPUT, oldHasOutput, HAS_OUTPUT_EDEFAULT, oldHasOutputESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetHasOutput()
  {
    return hasOutputESet;
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
      case SqlModulePackage.PROC_CALL_DEFINITION__SQL:
        return basicSetSQL(null, msgs);
      case SqlModulePackage.PROC_CALL_DEFINITION__OUTPUT:
        return basicSetOutput(null, msgs);
      case SqlModulePackage.PROC_CALL_DEFINITION__PARAMETER_FILE:
        return basicSetParameterFile(null, msgs);
      case SqlModulePackage.PROC_CALL_DEFINITION__IGNORE_VAL:
        return basicSetIgnoreVal(null, msgs);
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
      case SqlModulePackage.PROC_CALL_DEFINITION__SQL:
        return getSQL();
      case SqlModulePackage.PROC_CALL_DEFINITION__OUTPUT:
        return getOutput();
      case SqlModulePackage.PROC_CALL_DEFINITION__PARAMETER_FILE:
        return getParameterFile();
      case SqlModulePackage.PROC_CALL_DEFINITION__IGNORE_VAL:
        return getIgnoreVal();
      case SqlModulePackage.PROC_CALL_DEFINITION__HAS_OUTPUT:
        return isHasOutput();
      case SqlModulePackage.PROC_CALL_DEFINITION__CALL_COUNT:
        return getCallCount();
      case SqlModulePackage.PROC_CALL_DEFINITION__ENABLED:
        return isEnabled();
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
      case SqlModulePackage.PROC_CALL_DEFINITION__SQL:
        setSQL((ComplexValue)newValue);
        return;
      case SqlModulePackage.PROC_CALL_DEFINITION__OUTPUT:
        setOutput((ResourceDefinition)newValue);
        return;
      case SqlModulePackage.PROC_CALL_DEFINITION__PARAMETER_FILE:
        setParameterFile((ResourceDefinition)newValue);
        return;
      case SqlModulePackage.PROC_CALL_DEFINITION__IGNORE_VAL:
        setIgnoreVal((ComplexValue)newValue);
        return;
      case SqlModulePackage.PROC_CALL_DEFINITION__HAS_OUTPUT:
        setHasOutput((Boolean)newValue);
        return;
      case SqlModulePackage.PROC_CALL_DEFINITION__CALL_COUNT:
        setCallCount((BigInteger)newValue);
        return;
      case SqlModulePackage.PROC_CALL_DEFINITION__ENABLED:
        setEnabled((Boolean)newValue);
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
      case SqlModulePackage.PROC_CALL_DEFINITION__SQL:
        setSQL((ComplexValue)null);
        return;
      case SqlModulePackage.PROC_CALL_DEFINITION__OUTPUT:
        setOutput((ResourceDefinition)null);
        return;
      case SqlModulePackage.PROC_CALL_DEFINITION__PARAMETER_FILE:
        setParameterFile((ResourceDefinition)null);
        return;
      case SqlModulePackage.PROC_CALL_DEFINITION__IGNORE_VAL:
        setIgnoreVal((ComplexValue)null);
        return;
      case SqlModulePackage.PROC_CALL_DEFINITION__HAS_OUTPUT:
        unsetHasOutput();
        return;
      case SqlModulePackage.PROC_CALL_DEFINITION__CALL_COUNT:
        unsetCallCount();
        return;
      case SqlModulePackage.PROC_CALL_DEFINITION__ENABLED:
        unsetEnabled();
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
      case SqlModulePackage.PROC_CALL_DEFINITION__SQL:
        return sQL != null;
      case SqlModulePackage.PROC_CALL_DEFINITION__OUTPUT:
        return output != null;
      case SqlModulePackage.PROC_CALL_DEFINITION__PARAMETER_FILE:
        return parameterFile != null;
      case SqlModulePackage.PROC_CALL_DEFINITION__IGNORE_VAL:
        return ignoreVal != null;
      case SqlModulePackage.PROC_CALL_DEFINITION__HAS_OUTPUT:
        return isSetHasOutput();
      case SqlModulePackage.PROC_CALL_DEFINITION__CALL_COUNT:
        return isSetCallCount();
      case SqlModulePackage.PROC_CALL_DEFINITION__ENABLED:
        return isSetEnabled();
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
    result.append(" (hasOutput: ");
    if (hasOutputESet) result.append(hasOutput); else result.append("<unset>");
    result.append(", callCount: ");
    if (callCountESet) result.append(callCount); else result.append("<unset>");
    result.append(", enabled: ");
    if (enabledESet) result.append(enabled); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // ProcCallDefinitionImpl
