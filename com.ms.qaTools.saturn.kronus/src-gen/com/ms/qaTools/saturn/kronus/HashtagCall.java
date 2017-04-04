/**
 */
package com.ms.qaTools.saturn.kronus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hashtag Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.HashtagCall#getMethod <em>Method</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.HashtagCall#getParameterValues <em>Parameter Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.kronus.KronusPackage#getHashtagCall()
 * @model
 * @generated
 */
public interface HashtagCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' reference.
   * @see #setMethod(HashtagDef)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getHashtagCall_Method()
   * @model
   * @generated
   */
  HashtagDef getMethod();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.HashtagCall#getMethod <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(HashtagDef value);

  /**
   * Returns the value of the '<em><b>Parameter Values</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.kronus.SimpleParameterValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Values</em>' containment reference list.
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getHashtagCall_ParameterValues()
   * @model containment="true"
   * @generated
   */
  EList<SimpleParameterValue> getParameterValues();

} // HashtagCall
