/**
 */
package com.ms.qaTools.saturn.kronus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.FunctionDef#getHashtags <em>Hashtags</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.FunctionDef#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.FunctionDef#getParameterDefs <em>Parameter Defs</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.FunctionDef#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.FunctionDef#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.kronus.KronusPackage#getFunctionDef()
 * @model
 * @generated
 */
public interface FunctionDef extends AbstractDef, ReferenceableDefs
{
  /**
   * Returns the value of the '<em><b>Hashtags</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.kronus.HashtagCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hashtags</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hashtags</em>' containment reference list.
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getFunctionDef_Hashtags()
   * @model containment="true"
   * @generated
   */
  EList<HashtagCall> getHashtags();

  /**
   * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.kronus.TypeDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Parameters</em>' containment reference list.
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getFunctionDef_TypeParameters()
   * @model containment="true"
   * @generated
   */
  EList<TypeDef> getTypeParameters();

  /**
   * Returns the value of the '<em><b>Parameter Defs</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.kronus.ParameterDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Defs</em>' containment reference list.
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getFunctionDef_ParameterDefs()
   * @model containment="true"
   * @generated
   */
  EList<ParameterDef> getParameterDefs();

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(TypeInstance)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getFunctionDef_ReturnType()
   * @model containment="true"
   * @generated
   */
  TypeInstance getReturnType();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.FunctionDef#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(TypeInstance value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(CodeAssignment)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getFunctionDef_Value()
   * @model containment="true"
   * @generated
   */
  CodeAssignment getValue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.FunctionDef#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(CodeAssignment value);

} // FunctionDef
