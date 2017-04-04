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
package com.ms.qaTools.saturn.modules.dsConvertModule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.modules.dsConvertModule.DsConvertModulePackage;
import com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Simple Operation</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.dsConvertModule.impl.SimpleOperationImpl#getSource <em>Source</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.dsConvertModule.impl.SimpleOperationImpl#getTarget <em>Target</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.dsConvertModule.impl.SimpleOperationImpl#getIgnoreCols <em>Ignore Cols</em>}
 * </li>
 * <li>{@link com.ms.qaTools.saturn.modules.dsConvertModule.impl.SimpleOperationImpl#getException <em>Exception</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.dsConvertModule.impl.SimpleOperationImpl#isNumberDuplicateCols <em>Number
 * Duplicate Cols</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SimpleOperationImpl extends AbstractOperationImpl implements SimpleOperation
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition   source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected ResourceDefinition   target;

  /**
   * The cached value of the '{@link #getIgnoreCols() <em>Ignore Cols</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getIgnoreCols()
   * @generated
   * @ordered
   */
  protected EList<ComplexValue>  ignoreCols;

  /**
   * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException()
   * @generated
   * @ordered
   */
  protected exception            exception;

  /**
   * The default value of the '{@link #isNumberDuplicateCols() <em>Number Duplicate Cols</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isNumberDuplicateCols()
   * @generated
   * @ordered
   */
  protected static final boolean NUMBER_DUPLICATE_COLS_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isNumberDuplicateCols() <em>Number Duplicate Cols</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isNumberDuplicateCols()
   * @generated
   * @ordered
   */
  protected boolean              numberDuplicateCols            = NUMBER_DUPLICATE_COLS_EDEFAULT;

  /**
   * This is true if the Number Duplicate Cols attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              numberDuplicateColsESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SimpleOperationImpl()
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
    return DsConvertModulePackage.Literals.SIMPLE_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(ResourceDefinition newSource, NotificationChain msgs)
  {
    ResourceDefinition oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsConvertModulePackage.SIMPLE_OPERATION__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSource(ResourceDefinition newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsConvertModulePackage.SIMPLE_OPERATION__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsConvertModulePackage.SIMPLE_OPERATION__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DsConvertModulePackage.SIMPLE_OPERATION__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(ResourceDefinition newTarget, NotificationChain msgs)
  {
    ResourceDefinition oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsConvertModulePackage.SIMPLE_OPERATION__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(ResourceDefinition newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsConvertModulePackage.SIMPLE_OPERATION__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsConvertModulePackage.SIMPLE_OPERATION__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DsConvertModulePackage.SIMPLE_OPERATION__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ComplexValue> getIgnoreCols()
  {
    if (ignoreCols == null)
    {
      ignoreCols = new EObjectContainmentEList<ComplexValue>(ComplexValue.class, this, DsConvertModulePackage.SIMPLE_OPERATION__IGNORE_COLS);
    }
    return ignoreCols;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsConvertModulePackage.SIMPLE_OPERATION__EXCEPTION, oldException, newException);
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
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsConvertModulePackage.SIMPLE_OPERATION__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsConvertModulePackage.SIMPLE_OPERATION__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DsConvertModulePackage.SIMPLE_OPERATION__EXCEPTION, newException, newException));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isNumberDuplicateCols()
  {
    return numberDuplicateCols;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNumberDuplicateCols(boolean newNumberDuplicateCols)
  {
    boolean oldNumberDuplicateCols = numberDuplicateCols;
    numberDuplicateCols = newNumberDuplicateCols;
    boolean oldNumberDuplicateColsESet = numberDuplicateColsESet;
    numberDuplicateColsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DsConvertModulePackage.SIMPLE_OPERATION__NUMBER_DUPLICATE_COLS, oldNumberDuplicateCols, numberDuplicateCols, !oldNumberDuplicateColsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetNumberDuplicateCols()
  {
    boolean oldNumberDuplicateCols = numberDuplicateCols;
    boolean oldNumberDuplicateColsESet = numberDuplicateColsESet;
    numberDuplicateCols = NUMBER_DUPLICATE_COLS_EDEFAULT;
    numberDuplicateColsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DsConvertModulePackage.SIMPLE_OPERATION__NUMBER_DUPLICATE_COLS, oldNumberDuplicateCols, NUMBER_DUPLICATE_COLS_EDEFAULT, oldNumberDuplicateColsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetNumberDuplicateCols()
  {
    return numberDuplicateColsESet;
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
      case DsConvertModulePackage.SIMPLE_OPERATION__SOURCE:
        return basicSetSource(null, msgs);
      case DsConvertModulePackage.SIMPLE_OPERATION__TARGET:
        return basicSetTarget(null, msgs);
      case DsConvertModulePackage.SIMPLE_OPERATION__IGNORE_COLS:
        return ((InternalEList<?>)getIgnoreCols()).basicRemove(otherEnd, msgs);
      case DsConvertModulePackage.SIMPLE_OPERATION__EXCEPTION:
        return basicSetException(null, msgs);
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
      case DsConvertModulePackage.SIMPLE_OPERATION__SOURCE:
        return getSource();
      case DsConvertModulePackage.SIMPLE_OPERATION__TARGET:
        return getTarget();
      case DsConvertModulePackage.SIMPLE_OPERATION__IGNORE_COLS:
        return getIgnoreCols();
      case DsConvertModulePackage.SIMPLE_OPERATION__EXCEPTION:
        return getException();
      case DsConvertModulePackage.SIMPLE_OPERATION__NUMBER_DUPLICATE_COLS:
        return isNumberDuplicateCols();
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
      case DsConvertModulePackage.SIMPLE_OPERATION__SOURCE:
        setSource((ResourceDefinition)newValue);
        return;
      case DsConvertModulePackage.SIMPLE_OPERATION__TARGET:
        setTarget((ResourceDefinition)newValue);
        return;
      case DsConvertModulePackage.SIMPLE_OPERATION__IGNORE_COLS:
        getIgnoreCols().clear();
        getIgnoreCols().addAll((Collection<? extends ComplexValue>)newValue);
        return;
      case DsConvertModulePackage.SIMPLE_OPERATION__EXCEPTION:
        setException((exception)newValue);
        return;
      case DsConvertModulePackage.SIMPLE_OPERATION__NUMBER_DUPLICATE_COLS:
        setNumberDuplicateCols((Boolean)newValue);
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
      case DsConvertModulePackage.SIMPLE_OPERATION__SOURCE:
        setSource((ResourceDefinition)null);
        return;
      case DsConvertModulePackage.SIMPLE_OPERATION__TARGET:
        setTarget((ResourceDefinition)null);
        return;
      case DsConvertModulePackage.SIMPLE_OPERATION__IGNORE_COLS:
        getIgnoreCols().clear();
        return;
      case DsConvertModulePackage.SIMPLE_OPERATION__EXCEPTION:
        setException((exception)null);
        return;
      case DsConvertModulePackage.SIMPLE_OPERATION__NUMBER_DUPLICATE_COLS:
        unsetNumberDuplicateCols();
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
      case DsConvertModulePackage.SIMPLE_OPERATION__SOURCE:
        return source != null;
      case DsConvertModulePackage.SIMPLE_OPERATION__TARGET:
        return target != null;
      case DsConvertModulePackage.SIMPLE_OPERATION__IGNORE_COLS:
        return ignoreCols != null && !ignoreCols.isEmpty();
      case DsConvertModulePackage.SIMPLE_OPERATION__EXCEPTION:
        return exception != null;
      case DsConvertModulePackage.SIMPLE_OPERATION__NUMBER_DUPLICATE_COLS:
        return isSetNumberDuplicateCols();
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
    result.append(" (numberDuplicateCols: ");
    if (numberDuplicateColsESet) result.append(numberDuplicateCols); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // SimpleOperationImpl
