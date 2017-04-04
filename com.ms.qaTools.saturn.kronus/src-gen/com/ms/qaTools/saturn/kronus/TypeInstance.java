/**
 */
package com.ms.qaTools.saturn.kronus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.TypeInstance#getName <em>Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.TypeInstance#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeInstance()
 * @model
 * @generated
 */
public interface TypeInstance extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(TypeDef)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeInstance_Name()
   * @model
   * @generated
   */
  TypeDef getName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.TypeInstance#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(TypeDef value);

  /**
   * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.kronus.TypeInstance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Parameters</em>' containment reference list.
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeInstance_TypeParameters()
   * @model containment="true"
   * @generated
   */
  EList<TypeInstance> getTypeParameters();

} // TypeInstance
