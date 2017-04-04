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

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.modules.sqlModule.LoadTable;
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Load Table</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.LoadTableImpl#getException <em>Exception</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.LoadTableImpl#getInput <em>Input</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.LoadTableImpl#getSQL <em>SQL</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.LoadTableImpl#isCleanLoad <em>Clean Load</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.LoadTableImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.sqlModule.impl.LoadTableImpl#getBatchSize <em>Batch Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadTableImpl extends EObjectImpl implements LoadTable
{
  /**
   * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException()
   * @generated
   * @ordered
   */
  protected exception               exception;

  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected ResourceDefinition      input;

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
   * The default value of the '{@link #isCleanLoad() <em>Clean Load</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isCleanLoad()
   * @generated
   * @ordered
   */
  protected static final boolean    CLEAN_LOAD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCleanLoad() <em>Clean Load</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isCleanLoad()
   * @generated
   * @ordered
   */
  protected boolean                 cleanLoad           = CLEAN_LOAD_EDEFAULT;

  /**
   * This is true if the Clean Load attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 cleanLoadESet;

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
   * The default value of the '{@link #getBatchSize() <em>Batch Size</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getBatchSize()
   * @generated
   * @ordered
   */
  protected static final BigInteger BATCH_SIZE_EDEFAULT = new BigInteger("0");

  /**
   * The cached value of the '{@link #getBatchSize() <em>Batch Size</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getBatchSize()
   * @generated
   * @ordered
   */
  protected BigInteger              batchSize           = BATCH_SIZE_EDEFAULT;

  /**
   * This is true if the Batch Size attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 batchSizeESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected LoadTableImpl()
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
    return SqlModulePackage.Literals.LOAD_TABLE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public exception getException()
  {
    return exception;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetException(exception newException, NotificationChain msgs)
  {
    exception oldException = exception;
    exception = newException;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.LOAD_TABLE__EXCEPTION, oldException, newException);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setException(exception newException)
  {
    if (newException != exception)
    {
      NotificationChain msgs = null;
      if (exception != null)
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.LOAD_TABLE__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.LOAD_TABLE__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.LOAD_TABLE__EXCEPTION, newException, newException));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(ResourceDefinition newInput, NotificationChain msgs)
  {
    ResourceDefinition oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.LOAD_TABLE__INPUT, oldInput, newInput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInput(ResourceDefinition newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.LOAD_TABLE__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.LOAD_TABLE__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.LOAD_TABLE__INPUT, newInput, newInput));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlModulePackage.LOAD_TABLE__SQL, oldSQL, newSQL);
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
        msgs = ((InternalEObject)sQL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.LOAD_TABLE__SQL, null, msgs);
      if (newSQL != null)
        msgs = ((InternalEObject)newSQL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlModulePackage.LOAD_TABLE__SQL, null, msgs);
      msgs = basicSetSQL(newSQL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.LOAD_TABLE__SQL, newSQL, newSQL));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getBatchSize()
  {
    return batchSize;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setBatchSize(BigInteger newBatchSize)
  {
    BigInteger oldBatchSize = batchSize;
    batchSize = newBatchSize;
    boolean oldBatchSizeESet = batchSizeESet;
    batchSizeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.LOAD_TABLE__BATCH_SIZE, oldBatchSize, batchSize, !oldBatchSizeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetBatchSize()
  {
    BigInteger oldBatchSize = batchSize;
    boolean oldBatchSizeESet = batchSizeESet;
    batchSize = BATCH_SIZE_EDEFAULT;
    batchSizeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SqlModulePackage.LOAD_TABLE__BATCH_SIZE, oldBatchSize, BATCH_SIZE_EDEFAULT, oldBatchSizeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetBatchSize()
  {
    return batchSizeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isCleanLoad()
  {
    return cleanLoad;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCleanLoad(boolean newCleanLoad)
  {
    boolean oldCleanLoad = cleanLoad;
    cleanLoad = newCleanLoad;
    boolean oldCleanLoadESet = cleanLoadESet;
    cleanLoadESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.LOAD_TABLE__CLEAN_LOAD, oldCleanLoad, cleanLoad, !oldCleanLoadESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCleanLoad()
  {
    boolean oldCleanLoad = cleanLoad;
    boolean oldCleanLoadESet = cleanLoadESet;
    cleanLoad = CLEAN_LOAD_EDEFAULT;
    cleanLoadESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SqlModulePackage.LOAD_TABLE__CLEAN_LOAD, oldCleanLoad, CLEAN_LOAD_EDEFAULT, oldCleanLoadESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCleanLoad()
  {
    return cleanLoadESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SqlModulePackage.LOAD_TABLE__ENABLED, oldEnabled, enabled, !oldEnabledESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, SqlModulePackage.LOAD_TABLE__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SqlModulePackage.LOAD_TABLE__EXCEPTION:
        return basicSetException(null, msgs);
      case SqlModulePackage.LOAD_TABLE__INPUT:
        return basicSetInput(null, msgs);
      case SqlModulePackage.LOAD_TABLE__SQL:
        return basicSetSQL(null, msgs);
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
      case SqlModulePackage.LOAD_TABLE__EXCEPTION:
        return getException();
      case SqlModulePackage.LOAD_TABLE__INPUT:
        return getInput();
      case SqlModulePackage.LOAD_TABLE__SQL:
        return getSQL();
      case SqlModulePackage.LOAD_TABLE__CLEAN_LOAD:
        return isCleanLoad();
      case SqlModulePackage.LOAD_TABLE__ENABLED:
        return isEnabled();
      case SqlModulePackage.LOAD_TABLE__BATCH_SIZE:
        return getBatchSize();
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
      case SqlModulePackage.LOAD_TABLE__EXCEPTION:
        setException((exception)newValue);
        return;
      case SqlModulePackage.LOAD_TABLE__INPUT:
        setInput((ResourceDefinition)newValue);
        return;
      case SqlModulePackage.LOAD_TABLE__SQL:
        setSQL((ComplexValue)newValue);
        return;
      case SqlModulePackage.LOAD_TABLE__CLEAN_LOAD:
        setCleanLoad((Boolean)newValue);
        return;
      case SqlModulePackage.LOAD_TABLE__ENABLED:
        setEnabled((Boolean)newValue);
        return;
      case SqlModulePackage.LOAD_TABLE__BATCH_SIZE:
        setBatchSize((BigInteger)newValue);
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
      case SqlModulePackage.LOAD_TABLE__EXCEPTION:
        setException((exception)null);
        return;
      case SqlModulePackage.LOAD_TABLE__INPUT:
        setInput((ResourceDefinition)null);
        return;
      case SqlModulePackage.LOAD_TABLE__SQL:
        setSQL((ComplexValue)null);
        return;
      case SqlModulePackage.LOAD_TABLE__CLEAN_LOAD:
        unsetCleanLoad();
        return;
      case SqlModulePackage.LOAD_TABLE__ENABLED:
        unsetEnabled();
        return;
      case SqlModulePackage.LOAD_TABLE__BATCH_SIZE:
        unsetBatchSize();
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
      case SqlModulePackage.LOAD_TABLE__EXCEPTION:
        return exception != null;
      case SqlModulePackage.LOAD_TABLE__INPUT:
        return input != null;
      case SqlModulePackage.LOAD_TABLE__SQL:
        return sQL != null;
      case SqlModulePackage.LOAD_TABLE__CLEAN_LOAD:
        return isSetCleanLoad();
      case SqlModulePackage.LOAD_TABLE__ENABLED:
        return isSetEnabled();
      case SqlModulePackage.LOAD_TABLE__BATCH_SIZE:
        return isSetBatchSize();
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
    result.append(" (cleanLoad: ");
    if (cleanLoadESet) result.append(cleanLoad); else result.append("<unset>");
    result.append(", enabled: ");
    if (enabledESet) result.append(enabled); else result.append("<unset>");
    result.append(", batchSize: ");
    if (batchSizeESet) result.append(batchSize); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // LoadTableImpl
