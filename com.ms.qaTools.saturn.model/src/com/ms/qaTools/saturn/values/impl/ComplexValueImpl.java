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

import com.ms.qaTools.saturn.types.Empty;

import com.ms.qaTools.saturn.values.CellComplexValue;
import com.ms.qaTools.saturn.values.CodeComplexValue;
import com.ms.qaTools.saturn.values.ComplexValue;
import com.ms.qaTools.saturn.values.FIXComplexValue;
import com.ms.qaTools.saturn.values.FallibleComplexValue;
import com.ms.qaTools.saturn.values.JSONComplexValue;
import com.ms.qaTools.saturn.values.PropertyComplexValue;
import com.ms.qaTools.saturn.values.ReferenceComplexValue;
import com.ms.qaTools.saturn.values.RunNumberComplexValue;
import com.ms.qaTools.saturn.values.TextComplexValue;
import com.ms.qaTools.saturn.values.ValuesPackage;
import com.ms.qaTools.saturn.values.XPathComplexValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#getNull <em>Null</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#getText <em>Text</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#getEnvVar <em>Env Var</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#getFile <em>File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#getXPathValue <em>XPath Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#getJSONValue <em>JSON Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#getFIXValue <em>FIX Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#getCellValue <em>Cell Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#getCode <em>Code</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#getRunNumber <em>Run Number</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ComplexValueImpl#isMemoize <em>Memoize</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexValueImpl extends EObjectImpl implements ComplexValue
{
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
   * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMixed()
   * @generated
   * @ordered
   */
  protected FeatureMap mixed;

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
  protected ComplexValueImpl()
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
    return ValuesPackage.Literals.COMPLEX_VALUE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.COMPLEX_VALUE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getMixed()
  {
    if (mixed == null)
    {
      mixed = new BasicFeatureMap(this, ValuesPackage.COMPLEX_VALUE__MIXED);
    }
    return mixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Empty getNull()
  {
    return (Empty)getMixed().get(ValuesPackage.Literals.COMPLEX_VALUE__NULL, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNull(Empty newNull, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)getMixed()).basicAdd(ValuesPackage.Literals.COMPLEX_VALUE__NULL, newNull, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNull(Empty newNull)
  {
    ((FeatureMap.Internal)getMixed()).set(ValuesPackage.Literals.COMPLEX_VALUE__NULL, newNull);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getGroup()
  {
    return (FeatureMap)getMixed().<FeatureMap.Entry>list(ValuesPackage.Literals.COMPLEX_VALUE__GROUP);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TextComplexValue> getText()
  {
    return getGroup().list(ValuesPackage.Literals.COMPLEX_VALUE__TEXT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FallibleComplexValue> getEnvVar()
  {
    return getGroup().list(ValuesPackage.Literals.COMPLEX_VALUE__ENV_VAR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FallibleComplexValue> getFile()
  {
    return getGroup().list(ValuesPackage.Literals.COMPLEX_VALUE__FILE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XPathComplexValue> getXPathValue()
  {
    return getGroup().list(ValuesPackage.Literals.COMPLEX_VALUE__XPATH_VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JSONComplexValue> getJSONValue()
  {
    return getGroup().list(ValuesPackage.Literals.COMPLEX_VALUE__JSON_VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FIXComplexValue> getFIXValue()
  {
    return getGroup().list(ValuesPackage.Literals.COMPLEX_VALUE__FIX_VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CellComplexValue> getCellValue()
  {
    return getGroup().list(ValuesPackage.Literals.COMPLEX_VALUE__CELL_VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyComplexValue> getPropertyValue()
  {
    return getGroup().list(ValuesPackage.Literals.COMPLEX_VALUE__PROPERTY_VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CodeComplexValue> getCode()
  {
    return getGroup().list(ValuesPackage.Literals.COMPLEX_VALUE__CODE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RunNumberComplexValue> getRunNumber()
  {
    return getGroup().list(ValuesPackage.Literals.COMPLEX_VALUE__RUN_NUMBER);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceComplexValue> getReference()
  {
    return getGroup().list(ValuesPackage.Literals.COMPLEX_VALUE__REFERENCE);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.COMPLEX_VALUE__MEMOIZE, oldMemoize, memoize, !oldMemoizeESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, ValuesPackage.COMPLEX_VALUE__MEMOIZE, oldMemoize, MEMOIZE_EDEFAULT, oldMemoizeESet));
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
      case ValuesPackage.COMPLEX_VALUE__MIXED:
        return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
      case ValuesPackage.COMPLEX_VALUE__NULL:
        return basicSetNull(null, msgs);
      case ValuesPackage.COMPLEX_VALUE__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case ValuesPackage.COMPLEX_VALUE__TEXT:
        return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
      case ValuesPackage.COMPLEX_VALUE__ENV_VAR:
        return ((InternalEList<?>)getEnvVar()).basicRemove(otherEnd, msgs);
      case ValuesPackage.COMPLEX_VALUE__FILE:
        return ((InternalEList<?>)getFile()).basicRemove(otherEnd, msgs);
      case ValuesPackage.COMPLEX_VALUE__XPATH_VALUE:
        return ((InternalEList<?>)getXPathValue()).basicRemove(otherEnd, msgs);
      case ValuesPackage.COMPLEX_VALUE__JSON_VALUE:
        return ((InternalEList<?>)getJSONValue()).basicRemove(otherEnd, msgs);
      case ValuesPackage.COMPLEX_VALUE__FIX_VALUE:
        return ((InternalEList<?>)getFIXValue()).basicRemove(otherEnd, msgs);
      case ValuesPackage.COMPLEX_VALUE__CELL_VALUE:
        return ((InternalEList<?>)getCellValue()).basicRemove(otherEnd, msgs);
      case ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE:
        return ((InternalEList<?>)getPropertyValue()).basicRemove(otherEnd, msgs);
      case ValuesPackage.COMPLEX_VALUE__CODE:
        return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
      case ValuesPackage.COMPLEX_VALUE__RUN_NUMBER:
        return ((InternalEList<?>)getRunNumber()).basicRemove(otherEnd, msgs);
      case ValuesPackage.COMPLEX_VALUE__REFERENCE:
        return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
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
      case ValuesPackage.COMPLEX_VALUE__DESCRIPTION:
        return getDescription();
      case ValuesPackage.COMPLEX_VALUE__MIXED:
        if (coreType) return getMixed();
        return ((FeatureMap.Internal)getMixed()).getWrapper();
      case ValuesPackage.COMPLEX_VALUE__NULL:
        return getNull();
      case ValuesPackage.COMPLEX_VALUE__GROUP:
        if (coreType) return getGroup();
        return ((FeatureMap.Internal)getGroup()).getWrapper();
      case ValuesPackage.COMPLEX_VALUE__TEXT:
        return getText();
      case ValuesPackage.COMPLEX_VALUE__ENV_VAR:
        return getEnvVar();
      case ValuesPackage.COMPLEX_VALUE__FILE:
        return getFile();
      case ValuesPackage.COMPLEX_VALUE__XPATH_VALUE:
        return getXPathValue();
      case ValuesPackage.COMPLEX_VALUE__JSON_VALUE:
        return getJSONValue();
      case ValuesPackage.COMPLEX_VALUE__FIX_VALUE:
        return getFIXValue();
      case ValuesPackage.COMPLEX_VALUE__CELL_VALUE:
        return getCellValue();
      case ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE:
        return getPropertyValue();
      case ValuesPackage.COMPLEX_VALUE__CODE:
        return getCode();
      case ValuesPackage.COMPLEX_VALUE__RUN_NUMBER:
        return getRunNumber();
      case ValuesPackage.COMPLEX_VALUE__REFERENCE:
        return getReference();
      case ValuesPackage.COMPLEX_VALUE__MEMOIZE:
        return isMemoize();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ValuesPackage.COMPLEX_VALUE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ValuesPackage.COMPLEX_VALUE__MIXED:
        ((FeatureMap.Internal)getMixed()).set(newValue);
        return;
      case ValuesPackage.COMPLEX_VALUE__NULL:
        setNull((Empty)newValue);
        return;
      case ValuesPackage.COMPLEX_VALUE__GROUP:
        ((FeatureMap.Internal)getGroup()).set(newValue);
        return;
      case ValuesPackage.COMPLEX_VALUE__TEXT:
        getText().clear();
        getText().addAll((Collection<? extends TextComplexValue>)newValue);
        return;
      case ValuesPackage.COMPLEX_VALUE__ENV_VAR:
        getEnvVar().clear();
        getEnvVar().addAll((Collection<? extends FallibleComplexValue>)newValue);
        return;
      case ValuesPackage.COMPLEX_VALUE__FILE:
        getFile().clear();
        getFile().addAll((Collection<? extends FallibleComplexValue>)newValue);
        return;
      case ValuesPackage.COMPLEX_VALUE__XPATH_VALUE:
        getXPathValue().clear();
        getXPathValue().addAll((Collection<? extends XPathComplexValue>)newValue);
        return;
      case ValuesPackage.COMPLEX_VALUE__JSON_VALUE:
        getJSONValue().clear();
        getJSONValue().addAll((Collection<? extends JSONComplexValue>)newValue);
        return;
      case ValuesPackage.COMPLEX_VALUE__FIX_VALUE:
        getFIXValue().clear();
        getFIXValue().addAll((Collection<? extends FIXComplexValue>)newValue);
        return;
      case ValuesPackage.COMPLEX_VALUE__CELL_VALUE:
        getCellValue().clear();
        getCellValue().addAll((Collection<? extends CellComplexValue>)newValue);
        return;
      case ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE:
        getPropertyValue().clear();
        getPropertyValue().addAll((Collection<? extends PropertyComplexValue>)newValue);
        return;
      case ValuesPackage.COMPLEX_VALUE__CODE:
        getCode().clear();
        getCode().addAll((Collection<? extends CodeComplexValue>)newValue);
        return;
      case ValuesPackage.COMPLEX_VALUE__RUN_NUMBER:
        getRunNumber().clear();
        getRunNumber().addAll((Collection<? extends RunNumberComplexValue>)newValue);
        return;
      case ValuesPackage.COMPLEX_VALUE__REFERENCE:
        getReference().clear();
        getReference().addAll((Collection<? extends ReferenceComplexValue>)newValue);
        return;
      case ValuesPackage.COMPLEX_VALUE__MEMOIZE:
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
      case ValuesPackage.COMPLEX_VALUE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ValuesPackage.COMPLEX_VALUE__MIXED:
        getMixed().clear();
        return;
      case ValuesPackage.COMPLEX_VALUE__NULL:
        setNull((Empty)null);
        return;
      case ValuesPackage.COMPLEX_VALUE__GROUP:
        getGroup().clear();
        return;
      case ValuesPackage.COMPLEX_VALUE__TEXT:
        getText().clear();
        return;
      case ValuesPackage.COMPLEX_VALUE__ENV_VAR:
        getEnvVar().clear();
        return;
      case ValuesPackage.COMPLEX_VALUE__FILE:
        getFile().clear();
        return;
      case ValuesPackage.COMPLEX_VALUE__XPATH_VALUE:
        getXPathValue().clear();
        return;
      case ValuesPackage.COMPLEX_VALUE__JSON_VALUE:
        getJSONValue().clear();
        return;
      case ValuesPackage.COMPLEX_VALUE__FIX_VALUE:
        getFIXValue().clear();
        return;
      case ValuesPackage.COMPLEX_VALUE__CELL_VALUE:
        getCellValue().clear();
        return;
      case ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE:
        getPropertyValue().clear();
        return;
      case ValuesPackage.COMPLEX_VALUE__CODE:
        getCode().clear();
        return;
      case ValuesPackage.COMPLEX_VALUE__RUN_NUMBER:
        getRunNumber().clear();
        return;
      case ValuesPackage.COMPLEX_VALUE__REFERENCE:
        getReference().clear();
        return;
      case ValuesPackage.COMPLEX_VALUE__MEMOIZE:
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
      case ValuesPackage.COMPLEX_VALUE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ValuesPackage.COMPLEX_VALUE__MIXED:
        return mixed != null && !mixed.isEmpty();
      case ValuesPackage.COMPLEX_VALUE__NULL:
        return getNull() != null;
      case ValuesPackage.COMPLEX_VALUE__GROUP:
        return !getGroup().isEmpty();
      case ValuesPackage.COMPLEX_VALUE__TEXT:
        return !getText().isEmpty();
      case ValuesPackage.COMPLEX_VALUE__ENV_VAR:
        return !getEnvVar().isEmpty();
      case ValuesPackage.COMPLEX_VALUE__FILE:
        return !getFile().isEmpty();
      case ValuesPackage.COMPLEX_VALUE__XPATH_VALUE:
        return !getXPathValue().isEmpty();
      case ValuesPackage.COMPLEX_VALUE__JSON_VALUE:
        return !getJSONValue().isEmpty();
      case ValuesPackage.COMPLEX_VALUE__FIX_VALUE:
        return !getFIXValue().isEmpty();
      case ValuesPackage.COMPLEX_VALUE__CELL_VALUE:
        return !getCellValue().isEmpty();
      case ValuesPackage.COMPLEX_VALUE__PROPERTY_VALUE:
        return !getPropertyValue().isEmpty();
      case ValuesPackage.COMPLEX_VALUE__CODE:
        return !getCode().isEmpty();
      case ValuesPackage.COMPLEX_VALUE__RUN_NUMBER:
        return !getRunNumber().isEmpty();
      case ValuesPackage.COMPLEX_VALUE__REFERENCE:
        return !getReference().isEmpty();
      case ValuesPackage.COMPLEX_VALUE__MEMOIZE:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (description: ");
    result.append(description);
    result.append(", mixed: ");
    result.append(mixed);
    result.append(", memoize: ");
    if (memoizeESet) result.append(memoize); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //ComplexValueImpl
