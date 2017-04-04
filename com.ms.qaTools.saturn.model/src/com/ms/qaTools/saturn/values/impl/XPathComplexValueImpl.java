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

import com.ms.qaTools.saturn.types.ResourceDefinition;

import com.ms.qaTools.saturn.values.ComplexValue;
import com.ms.qaTools.saturn.values.Describable;
import com.ms.qaTools.saturn.values.FailBehaviorsEnum;
import com.ms.qaTools.saturn.values.ValuesPackage;
import com.ms.qaTools.saturn.values.XPathComplexValue;
import com.ms.qaTools.saturn.values.XPathReturnTypeEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XPath Complex Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.XPathComplexValueImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.XPathComplexValueImpl#getFailBehavior <em>Fail Behavior</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.XPathComplexValueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.XPathComplexValueImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.XPathComplexValueImpl#getXPath <em>XPath</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.XPathComplexValueImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.XPathComplexValueImpl#getRow <em>Row</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.XPathComplexValueImpl#isFragment <em>Fragment</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.XPathComplexValueImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XPathComplexValueImpl extends EObjectImpl implements XPathComplexValue
{
  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected ComplexValue defaultValue;

  /**
   * The default value of the '{@link #getFailBehavior() <em>Fail Behavior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFailBehavior()
   * @generated
   * @ordered
   */
  protected static final FailBehaviorsEnum FAIL_BEHAVIOR_EDEFAULT = FailBehaviorsEnum.IGNORE;

  /**
   * The cached value of the '{@link #getFailBehavior() <em>Fail Behavior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFailBehavior()
   * @generated
   * @ordered
   */
  protected FailBehaviorsEnum failBehavior = FAIL_BEHAVIOR_EDEFAULT;

  /**
   * This is true if the Fail Behavior attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean failBehaviorESet;

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
   * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition resource;

  /**
   * The cached value of the '{@link #getXPath() <em>XPath</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXPath()
   * @generated
   * @ordered
   */
  protected ComplexValue xPath;

  /**
   * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespaces()
   * @generated
   * @ordered
   */
  protected ResourceDefinition namespaces;

  /**
   * The cached value of the '{@link #getRow() <em>Row</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRow()
   * @generated
   * @ordered
   */
  protected ComplexValue row;

  /**
   * The default value of the '{@link #isFragment() <em>Fragment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFragment()
   * @generated
   * @ordered
   */
  protected static final boolean FRAGMENT_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isFragment() <em>Fragment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFragment()
   * @generated
   * @ordered
   */
  protected boolean fragment = FRAGMENT_EDEFAULT;

  /**
   * This is true if the Fragment attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean fragmentESet;

  /**
   * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected static final XPathReturnTypeEnum RETURN_TYPE_EDEFAULT = XPathReturnTypeEnum.NODE;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected XPathReturnTypeEnum returnType = RETURN_TYPE_EDEFAULT;

  /**
   * This is true if the Return Type attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean returnTypeESet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XPathComplexValueImpl()
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
    return ValuesPackage.Literals.XPATH_COMPLEX_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultValue(ComplexValue newDefaultValue, NotificationChain msgs)
  {
    ComplexValue oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.XPATH_COMPLEX_VALUE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(ComplexValue newDefaultValue)
  {
    if (newDefaultValue != defaultValue)
    {
      NotificationChain msgs = null;
      if (defaultValue != null)
        msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.XPATH_COMPLEX_VALUE__DEFAULT_VALUE, null, msgs);
      if (newDefaultValue != null)
        msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.XPATH_COMPLEX_VALUE__DEFAULT_VALUE, null, msgs);
      msgs = basicSetDefaultValue(newDefaultValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.XPATH_COMPLEX_VALUE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FailBehaviorsEnum getFailBehavior()
  {
    return failBehavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFailBehavior(FailBehaviorsEnum newFailBehavior)
  {
    FailBehaviorsEnum oldFailBehavior = failBehavior;
    failBehavior = newFailBehavior == null ? FAIL_BEHAVIOR_EDEFAULT : newFailBehavior;
    boolean oldFailBehaviorESet = failBehaviorESet;
    failBehaviorESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.XPATH_COMPLEX_VALUE__FAIL_BEHAVIOR, oldFailBehavior, failBehavior, !oldFailBehaviorESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetFailBehavior()
  {
    FailBehaviorsEnum oldFailBehavior = failBehavior;
    boolean oldFailBehaviorESet = failBehaviorESet;
    failBehavior = FAIL_BEHAVIOR_EDEFAULT;
    failBehaviorESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ValuesPackage.XPATH_COMPLEX_VALUE__FAIL_BEHAVIOR, oldFailBehavior, FAIL_BEHAVIOR_EDEFAULT, oldFailBehaviorESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetFailBehavior()
  {
    return failBehaviorESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.XPATH_COMPLEX_VALUE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getResource()
  {
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResource(ResourceDefinition newResource, NotificationChain msgs)
  {
    ResourceDefinition oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.XPATH_COMPLEX_VALUE__RESOURCE, oldResource, newResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResource(ResourceDefinition newResource)
  {
    if (newResource != resource)
    {
      NotificationChain msgs = null;
      if (resource != null)
        msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.XPATH_COMPLEX_VALUE__RESOURCE, null, msgs);
      if (newResource != null)
        msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.XPATH_COMPLEX_VALUE__RESOURCE, null, msgs);
      msgs = basicSetResource(newResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.XPATH_COMPLEX_VALUE__RESOURCE, newResource, newResource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getXPath()
  {
    return xPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXPath(ComplexValue newXPath, NotificationChain msgs)
  {
    ComplexValue oldXPath = xPath;
    xPath = newXPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.XPATH_COMPLEX_VALUE__XPATH, oldXPath, newXPath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXPath(ComplexValue newXPath)
  {
    if (newXPath != xPath)
    {
      NotificationChain msgs = null;
      if (xPath != null)
        msgs = ((InternalEObject)xPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.XPATH_COMPLEX_VALUE__XPATH, null, msgs);
      if (newXPath != null)
        msgs = ((InternalEObject)newXPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.XPATH_COMPLEX_VALUE__XPATH, null, msgs);
      msgs = basicSetXPath(newXPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.XPATH_COMPLEX_VALUE__XPATH, newXPath, newXPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getNamespaces()
  {
    return namespaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespaces(ResourceDefinition newNamespaces, NotificationChain msgs)
  {
    ResourceDefinition oldNamespaces = namespaces;
    namespaces = newNamespaces;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.XPATH_COMPLEX_VALUE__NAMESPACES, oldNamespaces, newNamespaces);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespaces(ResourceDefinition newNamespaces)
  {
    if (newNamespaces != namespaces)
    {
      NotificationChain msgs = null;
      if (namespaces != null)
        msgs = ((InternalEObject)namespaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.XPATH_COMPLEX_VALUE__NAMESPACES, null, msgs);
      if (newNamespaces != null)
        msgs = ((InternalEObject)newNamespaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.XPATH_COMPLEX_VALUE__NAMESPACES, null, msgs);
      msgs = basicSetNamespaces(newNamespaces, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.XPATH_COMPLEX_VALUE__NAMESPACES, newNamespaces, newNamespaces));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getRow()
  {
    return row;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRow(ComplexValue newRow, NotificationChain msgs)
  {
    ComplexValue oldRow = row;
    row = newRow;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.XPATH_COMPLEX_VALUE__ROW, oldRow, newRow);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRow(ComplexValue newRow)
  {
    if (newRow != row)
    {
      NotificationChain msgs = null;
      if (row != null)
        msgs = ((InternalEObject)row).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.XPATH_COMPLEX_VALUE__ROW, null, msgs);
      if (newRow != null)
        msgs = ((InternalEObject)newRow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.XPATH_COMPLEX_VALUE__ROW, null, msgs);
      msgs = basicSetRow(newRow, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.XPATH_COMPLEX_VALUE__ROW, newRow, newRow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFragment()
  {
    return fragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFragment(boolean newFragment)
  {
    boolean oldFragment = fragment;
    fragment = newFragment;
    boolean oldFragmentESet = fragmentESet;
    fragmentESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.XPATH_COMPLEX_VALUE__FRAGMENT, oldFragment, fragment, !oldFragmentESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetFragment()
  {
    boolean oldFragment = fragment;
    boolean oldFragmentESet = fragmentESet;
    fragment = FRAGMENT_EDEFAULT;
    fragmentESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ValuesPackage.XPATH_COMPLEX_VALUE__FRAGMENT, oldFragment, FRAGMENT_EDEFAULT, oldFragmentESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetFragment()
  {
    return fragmentESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XPathReturnTypeEnum getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(XPathReturnTypeEnum newReturnType)
  {
    XPathReturnTypeEnum oldReturnType = returnType;
    returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
    boolean oldReturnTypeESet = returnTypeESet;
    returnTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.XPATH_COMPLEX_VALUE__RETURN_TYPE, oldReturnType, returnType, !oldReturnTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetReturnType()
  {
    XPathReturnTypeEnum oldReturnType = returnType;
    boolean oldReturnTypeESet = returnTypeESet;
    returnType = RETURN_TYPE_EDEFAULT;
    returnTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ValuesPackage.XPATH_COMPLEX_VALUE__RETURN_TYPE, oldReturnType, RETURN_TYPE_EDEFAULT, oldReturnTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetReturnType()
  {
    return returnTypeESet;
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
      case ValuesPackage.XPATH_COMPLEX_VALUE__DEFAULT_VALUE:
        return basicSetDefaultValue(null, msgs);
      case ValuesPackage.XPATH_COMPLEX_VALUE__RESOURCE:
        return basicSetResource(null, msgs);
      case ValuesPackage.XPATH_COMPLEX_VALUE__XPATH:
        return basicSetXPath(null, msgs);
      case ValuesPackage.XPATH_COMPLEX_VALUE__NAMESPACES:
        return basicSetNamespaces(null, msgs);
      case ValuesPackage.XPATH_COMPLEX_VALUE__ROW:
        return basicSetRow(null, msgs);
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
      case ValuesPackage.XPATH_COMPLEX_VALUE__DEFAULT_VALUE:
        return getDefaultValue();
      case ValuesPackage.XPATH_COMPLEX_VALUE__FAIL_BEHAVIOR:
        return getFailBehavior();
      case ValuesPackage.XPATH_COMPLEX_VALUE__DESCRIPTION:
        return getDescription();
      case ValuesPackage.XPATH_COMPLEX_VALUE__RESOURCE:
        return getResource();
      case ValuesPackage.XPATH_COMPLEX_VALUE__XPATH:
        return getXPath();
      case ValuesPackage.XPATH_COMPLEX_VALUE__NAMESPACES:
        return getNamespaces();
      case ValuesPackage.XPATH_COMPLEX_VALUE__ROW:
        return getRow();
      case ValuesPackage.XPATH_COMPLEX_VALUE__FRAGMENT:
        return isFragment();
      case ValuesPackage.XPATH_COMPLEX_VALUE__RETURN_TYPE:
        return getReturnType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ValuesPackage.XPATH_COMPLEX_VALUE__DEFAULT_VALUE:
        setDefaultValue((ComplexValue)newValue);
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__FAIL_BEHAVIOR:
        setFailBehavior((FailBehaviorsEnum)newValue);
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__RESOURCE:
        setResource((ResourceDefinition)newValue);
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__XPATH:
        setXPath((ComplexValue)newValue);
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__NAMESPACES:
        setNamespaces((ResourceDefinition)newValue);
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__ROW:
        setRow((ComplexValue)newValue);
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__FRAGMENT:
        setFragment((Boolean)newValue);
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__RETURN_TYPE:
        setReturnType((XPathReturnTypeEnum)newValue);
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
      case ValuesPackage.XPATH_COMPLEX_VALUE__DEFAULT_VALUE:
        setDefaultValue((ComplexValue)null);
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__FAIL_BEHAVIOR:
        unsetFailBehavior();
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__RESOURCE:
        setResource((ResourceDefinition)null);
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__XPATH:
        setXPath((ComplexValue)null);
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__NAMESPACES:
        setNamespaces((ResourceDefinition)null);
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__ROW:
        setRow((ComplexValue)null);
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__FRAGMENT:
        unsetFragment();
        return;
      case ValuesPackage.XPATH_COMPLEX_VALUE__RETURN_TYPE:
        unsetReturnType();
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
      case ValuesPackage.XPATH_COMPLEX_VALUE__DEFAULT_VALUE:
        return defaultValue != null;
      case ValuesPackage.XPATH_COMPLEX_VALUE__FAIL_BEHAVIOR:
        return isSetFailBehavior();
      case ValuesPackage.XPATH_COMPLEX_VALUE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ValuesPackage.XPATH_COMPLEX_VALUE__RESOURCE:
        return resource != null;
      case ValuesPackage.XPATH_COMPLEX_VALUE__XPATH:
        return xPath != null;
      case ValuesPackage.XPATH_COMPLEX_VALUE__NAMESPACES:
        return namespaces != null;
      case ValuesPackage.XPATH_COMPLEX_VALUE__ROW:
        return row != null;
      case ValuesPackage.XPATH_COMPLEX_VALUE__FRAGMENT:
        return isSetFragment();
      case ValuesPackage.XPATH_COMPLEX_VALUE__RETURN_TYPE:
        return isSetReturnType();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Describable.class)
    {
      switch (derivedFeatureID)
      {
        case ValuesPackage.XPATH_COMPLEX_VALUE__DESCRIPTION: return ValuesPackage.DESCRIBABLE__DESCRIPTION;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Describable.class)
    {
      switch (baseFeatureID)
      {
        case ValuesPackage.DESCRIBABLE__DESCRIPTION: return ValuesPackage.XPATH_COMPLEX_VALUE__DESCRIPTION;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (failBehavior: ");
    if (failBehaviorESet) result.append(failBehavior); else result.append("<unset>");
    result.append(", description: ");
    result.append(description);
    result.append(", fragment: ");
    if (fragmentESet) result.append(fragment); else result.append("<unset>");
    result.append(", returnType: ");
    if (returnTypeESet) result.append(returnType); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //XPathComplexValueImpl
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
