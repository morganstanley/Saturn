/**
 */
package com.ms.qaTools.saturn.kronus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.KronusCodeBlock#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.kronus.KronusPackage#getKronusCodeBlock()
 * @model
 * @generated
 */
public interface KronusCodeBlock extends CodeBlock
{
  /**
   * Returns the value of the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' containment reference.
   * @see #setCode(Kronus)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getKronusCodeBlock_Code()
   * @model containment="true"
   * @generated
   */
  Kronus getCode();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.KronusCodeBlock#getCode <em>Code</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' containment reference.
   * @see #getCode()
   * @generated
   */
  void setCode(Kronus value);

} // KronusCodeBlock
