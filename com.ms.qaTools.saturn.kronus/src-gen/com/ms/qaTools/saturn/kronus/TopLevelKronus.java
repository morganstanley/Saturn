/**
 */
package com.ms.qaTools.saturn.kronus;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Level Kronus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.TopLevelKronus#getPackage <em>Package</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.TopLevelKronus#getKronus <em>Kronus</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTopLevelKronus()
 * @model
 * @generated
 */
public interface TopLevelKronus extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' containment reference.
   * @see #setPackage(PackageDef)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTopLevelKronus_Package()
   * @model containment="true"
   * @generated
   */
  PackageDef getPackage();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.TopLevelKronus#getPackage <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' containment reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(PackageDef value);

  /**
   * Returns the value of the '<em><b>Kronus</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kronus</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kronus</em>' containment reference.
   * @see #setKronus(Kronus)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTopLevelKronus_Kronus()
   * @model containment="true"
   * @generated
   */
  Kronus getKronus();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.TopLevelKronus#getKronus <em>Kronus</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kronus</em>' containment reference.
   * @see #getKronus()
   * @generated
   */
  void setKronus(Kronus value);

} // TopLevelKronus
