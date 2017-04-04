/**
 */
package com.ms.qaTools.saturn.kronus.impl;

import com.ms.qaTools.saturn.kronus.Kronus;
import com.ms.qaTools.saturn.kronus.KronusPackage;
import com.ms.qaTools.saturn.kronus.PackageDef;
import com.ms.qaTools.saturn.kronus.TopLevelKronus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level Kronus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.TopLevelKronusImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.impl.TopLevelKronusImpl#getKronus <em>Kronus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopLevelKronusImpl extends MinimalEObjectImpl.Container implements TopLevelKronus
{
  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected PackageDef package_;

  /**
   * The cached value of the '{@link #getKronus() <em>Kronus</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKronus()
   * @generated
   * @ordered
   */
  protected Kronus kronus;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TopLevelKronusImpl()
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
    return KronusPackage.Literals.TOP_LEVEL_KRONUS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDef getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackage(PackageDef newPackage, NotificationChain msgs)
  {
    PackageDef oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KronusPackage.TOP_LEVEL_KRONUS__PACKAGE, oldPackage, newPackage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(PackageDef newPackage)
  {
    if (newPackage != package_)
    {
      NotificationChain msgs = null;
      if (package_ != null)
        msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KronusPackage.TOP_LEVEL_KRONUS__PACKAGE, null, msgs);
      if (newPackage != null)
        msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KronusPackage.TOP_LEVEL_KRONUS__PACKAGE, null, msgs);
      msgs = basicSetPackage(newPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KronusPackage.TOP_LEVEL_KRONUS__PACKAGE, newPackage, newPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Kronus getKronus()
  {
    return kronus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKronus(Kronus newKronus, NotificationChain msgs)
  {
    Kronus oldKronus = kronus;
    kronus = newKronus;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KronusPackage.TOP_LEVEL_KRONUS__KRONUS, oldKronus, newKronus);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKronus(Kronus newKronus)
  {
    if (newKronus != kronus)
    {
      NotificationChain msgs = null;
      if (kronus != null)
        msgs = ((InternalEObject)kronus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KronusPackage.TOP_LEVEL_KRONUS__KRONUS, null, msgs);
      if (newKronus != null)
        msgs = ((InternalEObject)newKronus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KronusPackage.TOP_LEVEL_KRONUS__KRONUS, null, msgs);
      msgs = basicSetKronus(newKronus, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KronusPackage.TOP_LEVEL_KRONUS__KRONUS, newKronus, newKronus));
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
      case KronusPackage.TOP_LEVEL_KRONUS__PACKAGE:
        return basicSetPackage(null, msgs);
      case KronusPackage.TOP_LEVEL_KRONUS__KRONUS:
        return basicSetKronus(null, msgs);
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
      case KronusPackage.TOP_LEVEL_KRONUS__PACKAGE:
        return getPackage();
      case KronusPackage.TOP_LEVEL_KRONUS__KRONUS:
        return getKronus();
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
      case KronusPackage.TOP_LEVEL_KRONUS__PACKAGE:
        setPackage((PackageDef)newValue);
        return;
      case KronusPackage.TOP_LEVEL_KRONUS__KRONUS:
        setKronus((Kronus)newValue);
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
      case KronusPackage.TOP_LEVEL_KRONUS__PACKAGE:
        setPackage((PackageDef)null);
        return;
      case KronusPackage.TOP_LEVEL_KRONUS__KRONUS:
        setKronus((Kronus)null);
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
      case KronusPackage.TOP_LEVEL_KRONUS__PACKAGE:
        return package_ != null;
      case KronusPackage.TOP_LEVEL_KRONUS__KRONUS:
        return kronus != null;
    }
    return super.eIsSet(featureID);
  }

} //TopLevelKronusImpl
