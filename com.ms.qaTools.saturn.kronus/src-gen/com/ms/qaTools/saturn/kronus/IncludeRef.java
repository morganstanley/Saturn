/**
 */
package com.ms.qaTools.saturn.kronus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.IncludeRef#getInclude <em>Include</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.IncludeRef#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.kronus.KronusPackage#getIncludeRef()
 * @model
 * @generated
 */
public interface IncludeRef extends Value
{
  /**
   * Returns the value of the '<em><b>Include</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include</em>' reference.
   * @see #setInclude(IncludeDef)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getIncludeRef_Include()
   * @model
   * @generated
   */
  IncludeDef getInclude();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.IncludeRef#getInclude <em>Include</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Include</em>' reference.
   * @see #getInclude()
   * @generated
   */
  void setInclude(IncludeDef value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(Value)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getIncludeRef_Ref()
   * @model containment="true"
   * @generated
   */
  Value getRef();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.IncludeRef#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Value value);

} // IncludeRef
