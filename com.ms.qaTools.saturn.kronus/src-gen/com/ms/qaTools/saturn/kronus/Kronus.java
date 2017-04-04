/**
 */
package com.ms.qaTools.saturn.kronus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kronus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.Kronus#getImports <em>Imports</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.Kronus#getIncludes <em>Includes</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.Kronus#getDefs <em>Defs</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.Kronus#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.kronus.KronusPackage#getKronus()
 * @model
 * @generated
 */
public interface Kronus extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.kronus.ImportDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getKronus_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportDef> getImports();

  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.kronus.IncludeDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference list.
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getKronus_Includes()
   * @model containment="true"
   * @generated
   */
  EList<IncludeDef> getIncludes();

  /**
   * Returns the value of the '<em><b>Defs</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.kronus.AbstractDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defs</em>' containment reference list.
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getKronus_Defs()
   * @model containment="true"
   * @generated
   */
  EList<AbstractDef> getDefs();

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(Expression)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getKronus_Return()
   * @model containment="true"
   * @generated
   */
  Expression getReturn();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.Kronus#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(Expression value);

} // Kronus
