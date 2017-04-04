/**
 */
package com.ms.qaTools.saturn.kronus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.TypeValue#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.TypeValue#getType <em>Type</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.TypeValue#getParms <em>Parms</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeValue()
 * @model
 * @generated
 */
public interface TypeValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.kronus.TypeValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extensions</em>' containment reference list.
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeValue_Extensions()
   * @model containment="true"
   * @generated
   */
  EList<TypeValue> getExtensions();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeId)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeValue_Type()
   * @model containment="true"
   * @generated
   */
  TypeId getType();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.TypeValue#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeId value);

  /**
   * Returns the value of the '<em><b>Parms</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.kronus.TypeValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parms</em>' containment reference list.
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeValue_Parms()
   * @model containment="true"
   * @generated
   */
  EList<TypeValue> getParms();

} // TypeValue
