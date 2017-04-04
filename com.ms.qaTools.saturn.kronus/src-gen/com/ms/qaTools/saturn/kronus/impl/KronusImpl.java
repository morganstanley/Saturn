/**
 */
package com.ms.qaTools.saturn.kronus.impl;

import com.ms.qaTools.saturn.kronus.AbstractDef;
import com.ms.qaTools.saturn.kronus.Expression;
import com.ms.qaTools.saturn.kronus.ImportDef;
import com.ms.qaTools.saturn.kronus.IncludeDef;
import com.ms.qaTools.saturn.kronus.Kronus;
import com.ms.qaTools.saturn.kronus.KronusPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kronus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.KronusImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.KronusImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.KronusImpl#getDefs <em>Defs</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.KronusImpl#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KronusImpl extends MinimalEObjectImpl.Container implements Kronus
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportDef> imports;

  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<IncludeDef> includes;

  /**
   * The cached value of the '{@link #getDefs() <em>Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefs()
   * @generated
   * @ordered
   */
  protected EList<AbstractDef> defs;

  /**
   * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected Expression return_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KronusImpl()
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
    return KronusPackage.Literals.KRONUS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportDef> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportDef>(ImportDef.class, this, KronusPackage.KRONUS__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IncludeDef> getIncludes()
  {
    if (includes == null)
    {
      includes = new EObjectContainmentEList<IncludeDef>(IncludeDef.class, this, KronusPackage.KRONUS__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractDef> getDefs()
  {
    if (defs == null)
    {
      defs = new EObjectContainmentEList<AbstractDef>(AbstractDef.class, this, KronusPackage.KRONUS__DEFS);
    }
    return defs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getReturn()
  {
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturn(Expression newReturn, NotificationChain msgs)
  {
    Expression oldReturn = return_;
    return_ = newReturn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KronusPackage.KRONUS__RETURN, oldReturn, newReturn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturn(Expression newReturn)
  {
    if (newReturn != return_)
    {
      NotificationChain msgs = null;
      if (return_ != null)
        msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KronusPackage.KRONUS__RETURN, null, msgs);
      if (newReturn != null)
        msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KronusPackage.KRONUS__RETURN, null, msgs);
      msgs = basicSetReturn(newReturn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KronusPackage.KRONUS__RETURN, newReturn, newReturn));
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
      case KronusPackage.KRONUS__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case KronusPackage.KRONUS__INCLUDES:
        return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
      case KronusPackage.KRONUS__DEFS:
        return ((InternalEList<?>)getDefs()).basicRemove(otherEnd, msgs);
      case KronusPackage.KRONUS__RETURN:
        return basicSetReturn(null, msgs);
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
      case KronusPackage.KRONUS__IMPORTS:
        return getImports();
      case KronusPackage.KRONUS__INCLUDES:
        return getIncludes();
      case KronusPackage.KRONUS__DEFS:
        return getDefs();
      case KronusPackage.KRONUS__RETURN:
        return getReturn();
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
      case KronusPackage.KRONUS__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportDef>)newValue);
        return;
      case KronusPackage.KRONUS__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends IncludeDef>)newValue);
        return;
      case KronusPackage.KRONUS__DEFS:
        getDefs().clear();
        getDefs().addAll((Collection<? extends AbstractDef>)newValue);
        return;
      case KronusPackage.KRONUS__RETURN:
        setReturn((Expression)newValue);
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
      case KronusPackage.KRONUS__IMPORTS:
        getImports().clear();
        return;
      case KronusPackage.KRONUS__INCLUDES:
        getIncludes().clear();
        return;
      case KronusPackage.KRONUS__DEFS:
        getDefs().clear();
        return;
      case KronusPackage.KRONUS__RETURN:
        setReturn((Expression)null);
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
      case KronusPackage.KRONUS__IMPORTS:
        return imports != null && !imports.isEmpty();
      case KronusPackage.KRONUS__INCLUDES:
        return includes != null && !includes.isEmpty();
      case KronusPackage.KRONUS__DEFS:
        return defs != null && !defs.isEmpty();
      case KronusPackage.KRONUS__RETURN:
        return return_ != null;
    }
    return super.eIsSet(featureID);
  }

} //KronusImpl
