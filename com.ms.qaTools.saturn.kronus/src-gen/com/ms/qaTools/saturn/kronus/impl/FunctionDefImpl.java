/**
 */
package com.ms.qaTools.saturn.kronus.impl;

import com.ms.qaTools.saturn.kronus.CodeAssignment;
import com.ms.qaTools.saturn.kronus.FunctionDef;
import com.ms.qaTools.saturn.kronus.HashtagCall;
import com.ms.qaTools.saturn.kronus.KronusPackage;
import com.ms.qaTools.saturn.kronus.ParameterDef;
import com.ms.qaTools.saturn.kronus.TypeDef;
import com.ms.qaTools.saturn.kronus.TypeInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.FunctionDefImpl#getHashtags <em>Hashtags</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.FunctionDefImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.FunctionDefImpl#getParameterDefs <em>Parameter Defs</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.FunctionDefImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.FunctionDefImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDefImpl extends AbstractDefImpl implements FunctionDef
{
  /**
   * The cached value of the '{@link #getHashtags() <em>Hashtags</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHashtags()
   * @generated
   * @ordered
   */
  protected EList<HashtagCall> hashtags;

  /**
   * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeParameters()
   * @generated
   * @ordered
   */
  protected EList<TypeDef> typeParameters;

  /**
   * The cached value of the '{@link #getParameterDefs() <em>Parameter Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterDefs()
   * @generated
   * @ordered
   */
  protected EList<ParameterDef> parameterDefs;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected TypeInstance returnType;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected CodeAssignment value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionDefImpl()
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
    return KronusPackage.Literals.FUNCTION_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HashtagCall> getHashtags()
  {
    if (hashtags == null)
    {
      hashtags = new EObjectContainmentEList<HashtagCall>(HashtagCall.class, this, KronusPackage.FUNCTION_DEF__HASHTAGS);
    }
    return hashtags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeDef> getTypeParameters()
  {
    if (typeParameters == null)
    {
      typeParameters = new EObjectContainmentEList<TypeDef>(TypeDef.class, this, KronusPackage.FUNCTION_DEF__TYPE_PARAMETERS);
    }
    return typeParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterDef> getParameterDefs()
  {
    if (parameterDefs == null)
    {
      parameterDefs = new EObjectContainmentEList<ParameterDef>(ParameterDef.class, this, KronusPackage.FUNCTION_DEF__PARAMETER_DEFS);
    }
    return parameterDefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeInstance getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(TypeInstance newReturnType, NotificationChain msgs)
  {
    TypeInstance oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KronusPackage.FUNCTION_DEF__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(TypeInstance newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KronusPackage.FUNCTION_DEF__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KronusPackage.FUNCTION_DEF__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KronusPackage.FUNCTION_DEF__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeAssignment getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(CodeAssignment newValue, NotificationChain msgs)
  {
    CodeAssignment oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KronusPackage.FUNCTION_DEF__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(CodeAssignment newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KronusPackage.FUNCTION_DEF__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KronusPackage.FUNCTION_DEF__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KronusPackage.FUNCTION_DEF__VALUE, newValue, newValue));
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
      case KronusPackage.FUNCTION_DEF__HASHTAGS:
        return ((InternalEList<?>)getHashtags()).basicRemove(otherEnd, msgs);
      case KronusPackage.FUNCTION_DEF__TYPE_PARAMETERS:
        return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
      case KronusPackage.FUNCTION_DEF__PARAMETER_DEFS:
        return ((InternalEList<?>)getParameterDefs()).basicRemove(otherEnd, msgs);
      case KronusPackage.FUNCTION_DEF__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case KronusPackage.FUNCTION_DEF__VALUE:
        return basicSetValue(null, msgs);
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
      case KronusPackage.FUNCTION_DEF__HASHTAGS:
        return getHashtags();
      case KronusPackage.FUNCTION_DEF__TYPE_PARAMETERS:
        return getTypeParameters();
      case KronusPackage.FUNCTION_DEF__PARAMETER_DEFS:
        return getParameterDefs();
      case KronusPackage.FUNCTION_DEF__RETURN_TYPE:
        return getReturnType();
      case KronusPackage.FUNCTION_DEF__VALUE:
        return getValue();
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
      case KronusPackage.FUNCTION_DEF__HASHTAGS:
        getHashtags().clear();
        getHashtags().addAll((Collection<? extends HashtagCall>)newValue);
        return;
      case KronusPackage.FUNCTION_DEF__TYPE_PARAMETERS:
        getTypeParameters().clear();
        getTypeParameters().addAll((Collection<? extends TypeDef>)newValue);
        return;
      case KronusPackage.FUNCTION_DEF__PARAMETER_DEFS:
        getParameterDefs().clear();
        getParameterDefs().addAll((Collection<? extends ParameterDef>)newValue);
        return;
      case KronusPackage.FUNCTION_DEF__RETURN_TYPE:
        setReturnType((TypeInstance)newValue);
        return;
      case KronusPackage.FUNCTION_DEF__VALUE:
        setValue((CodeAssignment)newValue);
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
      case KronusPackage.FUNCTION_DEF__HASHTAGS:
        getHashtags().clear();
        return;
      case KronusPackage.FUNCTION_DEF__TYPE_PARAMETERS:
        getTypeParameters().clear();
        return;
      case KronusPackage.FUNCTION_DEF__PARAMETER_DEFS:
        getParameterDefs().clear();
        return;
      case KronusPackage.FUNCTION_DEF__RETURN_TYPE:
        setReturnType((TypeInstance)null);
        return;
      case KronusPackage.FUNCTION_DEF__VALUE:
        setValue((CodeAssignment)null);
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
      case KronusPackage.FUNCTION_DEF__HASHTAGS:
        return hashtags != null && !hashtags.isEmpty();
      case KronusPackage.FUNCTION_DEF__TYPE_PARAMETERS:
        return typeParameters != null && !typeParameters.isEmpty();
      case KronusPackage.FUNCTION_DEF__PARAMETER_DEFS:
        return parameterDefs != null && !parameterDefs.isEmpty();
      case KronusPackage.FUNCTION_DEF__RETURN_TYPE:
        return returnType != null;
      case KronusPackage.FUNCTION_DEF__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //FunctionDefImpl
