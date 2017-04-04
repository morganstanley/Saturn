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
package com.ms.qaTools.saturn.modules.xmlManipModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.modules.xmlManipModule.RegisterFunctionOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Register Function Operation</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.RegisterFunctionOperationImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.RegisterFunctionOperationImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.RegisterFunctionOperationImpl#getSubName <em>Sub Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.RegisterFunctionOperationImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegisterFunctionOperationImpl extends AbstractOperationImpl implements RegisterFunctionOperation
{
  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected ComplexValue            function;

  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition package_;

  /**
   * The cached value of the '{@link #getSubName() <em>Sub Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubName()
   * @generated
   * @ordered
   */
  protected ComplexValue            subName;

  /**
   * The cached value of the '{@link #getUri() <em>Uri</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
  protected ComplexValue            uri;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected RegisterFunctionOperationImpl()
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
    return XmlManipModulePackage.Literals.REGISTER_FUNCTION_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction(ComplexValue newFunction, NotificationChain msgs)
  {
    ComplexValue oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__FUNCTION, oldFunction, newFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(ComplexValue newFunction)
  {
    if (newFunction != function)
    {
      NotificationChain msgs = null;
      if (function != null)
        msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__FUNCTION, null, msgs);
      if (newFunction != null)
        msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__FUNCTION, null, msgs);
      msgs = basicSetFunction(newFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__FUNCTION, newFunction, newFunction));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackage(NamedResourceDefinition newPackage, NotificationChain msgs)
  {
    NamedResourceDefinition oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__PACKAGE, oldPackage, newPackage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(NamedResourceDefinition newPackage)
  {
    if (newPackage != package_)
    {
      NotificationChain msgs = null;
      if (package_ != null)
        msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__PACKAGE, null, msgs);
      if (newPackage != null)
        msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__PACKAGE, null, msgs);
      msgs = basicSetPackage(newPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__PACKAGE, newPackage, newPackage));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getSubName()
  {
    return subName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubName(ComplexValue newSubName, NotificationChain msgs)
  {
    ComplexValue oldSubName = subName;
    subName = newSubName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__SUB_NAME, oldSubName, newSubName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSubName(ComplexValue newSubName)
  {
    if (newSubName != subName)
    {
      NotificationChain msgs = null;
      if (subName != null)
        msgs = ((InternalEObject)subName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__SUB_NAME, null, msgs);
      if (newSubName != null)
        msgs = ((InternalEObject)newSubName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__SUB_NAME, null, msgs);
      msgs = basicSetSubName(newSubName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__SUB_NAME, newSubName, newSubName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getUri()
  {
    return uri;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUri(ComplexValue newUri, NotificationChain msgs)
  {
    ComplexValue oldUri = uri;
    uri = newUri;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__URI, oldUri, newUri);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setUri(ComplexValue newUri)
  {
    if (newUri != uri)
    {
      NotificationChain msgs = null;
      if (uri != null)
        msgs = ((InternalEObject)uri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__URI, null, msgs);
      if (newUri != null)
        msgs = ((InternalEObject)newUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__URI, null, msgs);
      msgs = basicSetUri(newUri, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__URI, newUri, newUri));
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
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__FUNCTION:
        return basicSetFunction(null, msgs);
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__PACKAGE:
        return basicSetPackage(null, msgs);
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__SUB_NAME:
        return basicSetSubName(null, msgs);
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__URI:
        return basicSetUri(null, msgs);
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
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__FUNCTION:
        return getFunction();
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__PACKAGE:
        return getPackage();
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__SUB_NAME:
        return getSubName();
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__URI:
        return getUri();
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
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__FUNCTION:
        setFunction((ComplexValue)newValue);
        return;
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__PACKAGE:
        setPackage((NamedResourceDefinition)newValue);
        return;
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__SUB_NAME:
        setSubName((ComplexValue)newValue);
        return;
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__URI:
        setUri((ComplexValue)newValue);
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
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__FUNCTION:
        setFunction((ComplexValue)null);
        return;
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__PACKAGE:
        setPackage((NamedResourceDefinition)null);
        return;
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__SUB_NAME:
        setSubName((ComplexValue)null);
        return;
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__URI:
        setUri((ComplexValue)null);
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
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__FUNCTION:
        return function != null;
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__PACKAGE:
        return package_ != null;
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__SUB_NAME:
        return subName != null;
      case XmlManipModulePackage.REGISTER_FUNCTION_OPERATION__URI:
        return uri != null;
    }
    return super.eIsSet(featureID);
  }

} // RegisterFunctionOperationImpl
