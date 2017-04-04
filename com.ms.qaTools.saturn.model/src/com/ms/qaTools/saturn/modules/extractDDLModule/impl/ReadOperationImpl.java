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
package com.ms.qaTools.saturn.modules.extractDDLModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage;
import com.ms.qaTools.saturn.modules.extractDDLModule.ReadOperation;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Read Operation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ReadOperationImpl#getException <em>Exception</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ReadOperationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ReadOperationImpl#getDataBaseQualifier <em>Data Base Qualifier</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.ReadOperationImpl#isIgnoreMissing <em>Ignore Missing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadOperationImpl extends AbstractOperationImpl implements ReadOperation
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
  protected NamedResourceDefinition input;

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
  protected ReadOperationImpl()
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
    return ExtractDDLModulePackage.Literals.READ_OPERATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.READ_OPERATION__EXCEPTION, oldException, newException);
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
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.READ_OPERATION__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.READ_OPERATION__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.READ_OPERATION__EXCEPTION, newException, newException));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(NamedResourceDefinition newInput, NotificationChain msgs)
  {
    NamedResourceDefinition oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.READ_OPERATION__INPUT, oldInput, newInput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInput(NamedResourceDefinition newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.READ_OPERATION__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.READ_OPERATION__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.READ_OPERATION__INPUT, newInput, newInput));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.READ_OPERATION__DATA_BASE_QUALIFIER, oldDataBaseQualifier, newDataBaseQualifier);
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
        msgs = ((InternalEObject)dataBaseQualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.READ_OPERATION__DATA_BASE_QUALIFIER, null, msgs);
      if (newDataBaseQualifier != null)
        msgs = ((InternalEObject)newDataBaseQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.READ_OPERATION__DATA_BASE_QUALIFIER, null, msgs);
      msgs = basicSetDataBaseQualifier(newDataBaseQualifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.READ_OPERATION__DATA_BASE_QUALIFIER, newDataBaseQualifier, newDataBaseQualifier));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.READ_OPERATION__IGNORE_MISSING, oldIgnoreMissing, ignoreMissing, !oldIgnoreMissingESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.READ_OPERATION__IGNORE_MISSING, oldIgnoreMissing, IGNORE_MISSING_EDEFAULT, oldIgnoreMissingESet));
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
      case ExtractDDLModulePackage.READ_OPERATION__EXCEPTION:
        return basicSetException(null, msgs);
      case ExtractDDLModulePackage.READ_OPERATION__INPUT:
        return basicSetInput(null, msgs);
      case ExtractDDLModulePackage.READ_OPERATION__DATA_BASE_QUALIFIER:
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
      case ExtractDDLModulePackage.READ_OPERATION__EXCEPTION:
        return getException();
      case ExtractDDLModulePackage.READ_OPERATION__INPUT:
        return getInput();
      case ExtractDDLModulePackage.READ_OPERATION__DATA_BASE_QUALIFIER:
        return getDataBaseQualifier();
      case ExtractDDLModulePackage.READ_OPERATION__IGNORE_MISSING:
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
      case ExtractDDLModulePackage.READ_OPERATION__EXCEPTION:
        setException((exception)newValue);
        return;
      case ExtractDDLModulePackage.READ_OPERATION__INPUT:
        setInput((NamedResourceDefinition)newValue);
        return;
      case ExtractDDLModulePackage.READ_OPERATION__DATA_BASE_QUALIFIER:
        setDataBaseQualifier((ComplexValue)newValue);
        return;
      case ExtractDDLModulePackage.READ_OPERATION__IGNORE_MISSING:
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
      case ExtractDDLModulePackage.READ_OPERATION__EXCEPTION:
        setException((exception)null);
        return;
      case ExtractDDLModulePackage.READ_OPERATION__INPUT:
        setInput((NamedResourceDefinition)null);
        return;
      case ExtractDDLModulePackage.READ_OPERATION__DATA_BASE_QUALIFIER:
        setDataBaseQualifier((ComplexValue)null);
        return;
      case ExtractDDLModulePackage.READ_OPERATION__IGNORE_MISSING:
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
      case ExtractDDLModulePackage.READ_OPERATION__EXCEPTION:
        return exception != null;
      case ExtractDDLModulePackage.READ_OPERATION__INPUT:
        return input != null;
      case ExtractDDLModulePackage.READ_OPERATION__DATA_BASE_QUALIFIER:
        return dataBaseQualifier != null;
      case ExtractDDLModulePackage.READ_OPERATION__IGNORE_MISSING:
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

} // ReadOperationImpl
