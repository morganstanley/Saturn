package com.ms.qaTools.saturn.modules.extractDDLModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractOperation;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Extract Operation</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractOperationImpl#getException <em>Exception</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractOperationImpl#getDatabaseResource <em>Database
 * Resource</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractOperationImpl#getDataBaseQualifier <em>Data
 * Base Qualifier</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ExtractOperationImpl#isIgnoreMissing <em>Ignore
 * Missing</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ExtractOperationImpl extends AbstractOperationImpl implements ExtractOperation
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
   * The cached value of the '{@link #getDatabaseResource() <em>Database Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDatabaseResource()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition databaseResource;

  /**
   * The cached value of the '{@link #getDataBaseQualifier() <em>Data Base Qualifier</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDataBaseQualifier()
   * @generated
   * @ordered
   */
  protected ComplexValue            dataBaseQualifier;

  /**
   * The default value of the '{@link #isIgnoreMissing() <em>Ignore Missing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIgnoreMissing()
   * @generated
   * @ordered
   */
  protected static final boolean    IGNORE_MISSING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIgnoreMissing() <em>Ignore Missing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIgnoreMissing()
   * @generated
   * @ordered
   */
  protected boolean                 ignoreMissing           = IGNORE_MISSING_EDEFAULT;

  /**
   * This is true if the Ignore Missing attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 ignoreMissingESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ExtractOperationImpl()
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
    return ExtractDDLModulePackage.Literals.EXTRACT_OPERATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.EXTRACT_OPERATION__EXCEPTION, oldException, newException);
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
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.EXTRACT_OPERATION__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.EXTRACT_OPERATION__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.EXTRACT_OPERATION__EXCEPTION, newException, newException));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getDatabaseResource()
  {
    return databaseResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatabaseResource(NamedResourceDefinition newDatabaseResource, NotificationChain msgs)
  {
    NamedResourceDefinition oldDatabaseResource = databaseResource;
    databaseResource = newDatabaseResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.EXTRACT_OPERATION__DATABASE_RESOURCE, oldDatabaseResource, newDatabaseResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDatabaseResource(NamedResourceDefinition newDatabaseResource)
  {
    if (newDatabaseResource != databaseResource)
    {
      NotificationChain msgs = null;
      if (databaseResource != null)
        msgs = ((InternalEObject)databaseResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.EXTRACT_OPERATION__DATABASE_RESOURCE, null, msgs);
      if (newDatabaseResource != null)
        msgs = ((InternalEObject)newDatabaseResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.EXTRACT_OPERATION__DATABASE_RESOURCE, null, msgs);
      msgs = basicSetDatabaseResource(newDatabaseResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.EXTRACT_OPERATION__DATABASE_RESOURCE, newDatabaseResource, newDatabaseResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDataBaseQualifier()
  {
    return dataBaseQualifier;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataBaseQualifier(ComplexValue newDataBaseQualifier, NotificationChain msgs)
  {
    ComplexValue oldDataBaseQualifier = dataBaseQualifier;
    dataBaseQualifier = newDataBaseQualifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.EXTRACT_OPERATION__DATA_BASE_QUALIFIER, oldDataBaseQualifier, newDataBaseQualifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDataBaseQualifier(ComplexValue newDataBaseQualifier)
  {
    if (newDataBaseQualifier != dataBaseQualifier)
    {
      NotificationChain msgs = null;
      if (dataBaseQualifier != null)
        msgs = ((InternalEObject)dataBaseQualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.EXTRACT_OPERATION__DATA_BASE_QUALIFIER, null, msgs);
      if (newDataBaseQualifier != null)
        msgs = ((InternalEObject)newDataBaseQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.EXTRACT_OPERATION__DATA_BASE_QUALIFIER, null, msgs);
      msgs = basicSetDataBaseQualifier(newDataBaseQualifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.EXTRACT_OPERATION__DATA_BASE_QUALIFIER, newDataBaseQualifier, newDataBaseQualifier));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIgnoreMissing()
  {
    return ignoreMissing;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIgnoreMissing(boolean newIgnoreMissing)
  {
    boolean oldIgnoreMissing = ignoreMissing;
    ignoreMissing = newIgnoreMissing;
    boolean oldIgnoreMissingESet = ignoreMissingESet;
    ignoreMissingESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.EXTRACT_OPERATION__IGNORE_MISSING, oldIgnoreMissing, ignoreMissing, !oldIgnoreMissingESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIgnoreMissing()
  {
    boolean oldIgnoreMissing = ignoreMissing;
    boolean oldIgnoreMissingESet = ignoreMissingESet;
    ignoreMissing = IGNORE_MISSING_EDEFAULT;
    ignoreMissingESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.EXTRACT_OPERATION__IGNORE_MISSING, oldIgnoreMissing, IGNORE_MISSING_EDEFAULT, oldIgnoreMissingESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIgnoreMissing()
  {
    return ignoreMissingESet;
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
      case ExtractDDLModulePackage.EXTRACT_OPERATION__EXCEPTION:
        return basicSetException(null, msgs);
      case ExtractDDLModulePackage.EXTRACT_OPERATION__DATABASE_RESOURCE:
        return basicSetDatabaseResource(null, msgs);
      case ExtractDDLModulePackage.EXTRACT_OPERATION__DATA_BASE_QUALIFIER:
        return basicSetDataBaseQualifier(null, msgs);
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
      case ExtractDDLModulePackage.EXTRACT_OPERATION__EXCEPTION:
        return getException();
      case ExtractDDLModulePackage.EXTRACT_OPERATION__DATABASE_RESOURCE:
        return getDatabaseResource();
      case ExtractDDLModulePackage.EXTRACT_OPERATION__DATA_BASE_QUALIFIER:
        return getDataBaseQualifier();
      case ExtractDDLModulePackage.EXTRACT_OPERATION__IGNORE_MISSING:
        return isIgnoreMissing();
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
      case ExtractDDLModulePackage.EXTRACT_OPERATION__EXCEPTION:
        setException((exception)newValue);
        return;
      case ExtractDDLModulePackage.EXTRACT_OPERATION__DATABASE_RESOURCE:
        setDatabaseResource((NamedResourceDefinition)newValue);
        return;
      case ExtractDDLModulePackage.EXTRACT_OPERATION__DATA_BASE_QUALIFIER:
        setDataBaseQualifier((ComplexValue)newValue);
        return;
      case ExtractDDLModulePackage.EXTRACT_OPERATION__IGNORE_MISSING:
        setIgnoreMissing((Boolean)newValue);
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
      case ExtractDDLModulePackage.EXTRACT_OPERATION__EXCEPTION:
        setException((exception)null);
        return;
      case ExtractDDLModulePackage.EXTRACT_OPERATION__DATABASE_RESOURCE:
        setDatabaseResource((NamedResourceDefinition)null);
        return;
      case ExtractDDLModulePackage.EXTRACT_OPERATION__DATA_BASE_QUALIFIER:
        setDataBaseQualifier((ComplexValue)null);
        return;
      case ExtractDDLModulePackage.EXTRACT_OPERATION__IGNORE_MISSING:
        unsetIgnoreMissing();
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
      case ExtractDDLModulePackage.EXTRACT_OPERATION__EXCEPTION:
        return exception != null;
      case ExtractDDLModulePackage.EXTRACT_OPERATION__DATABASE_RESOURCE:
        return databaseResource != null;
      case ExtractDDLModulePackage.EXTRACT_OPERATION__DATA_BASE_QUALIFIER:
        return dataBaseQualifier != null;
      case ExtractDDLModulePackage.EXTRACT_OPERATION__IGNORE_MISSING:
        return isSetIgnoreMissing();
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
    result.append(" (ignoreMissing: ");
    if (ignoreMissingESet) result.append(ignoreMissing); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // ExtractOperationImpl
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
