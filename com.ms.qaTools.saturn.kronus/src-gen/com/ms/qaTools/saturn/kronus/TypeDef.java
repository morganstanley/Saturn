/**
 */
package com.ms.qaTools.saturn.kronus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.TypeDef#getVariance <em>Variance</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.TypeDef#getBoundsHi <em>Bounds Hi</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.TypeDef#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.TypeDef#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeDef()
 * @model
 * @generated
 */
public interface TypeDef extends AbstractDef
{
  /**
   * Returns the value of the '<em><b>Variance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variance</em>' attribute.
   * @see #setVariance(String)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeDef_Variance()
   * @model
   * @generated
   */
  String getVariance();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.TypeDef#getVariance <em>Variance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variance</em>' attribute.
   * @see #getVariance()
   * @generated
   */
  void setVariance(String value);

  /**
   * Returns the value of the '<em><b>Bounds Hi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bounds Hi</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bounds Hi</em>' containment reference.
   * @see #setBoundsHi(TypeInstance)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeDef_BoundsHi()
   * @model containment="true"
   * @generated
   */
  TypeInstance getBoundsHi();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.TypeDef#getBoundsHi <em>Bounds Hi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bounds Hi</em>' containment reference.
   * @see #getBoundsHi()
   * @generated
   */
  void setBoundsHi(TypeInstance value);

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
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeDef_TypeParameters()
   * @model containment="true"
   * @generated
   */
  EList<TypeDef> getTypeParameters();

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(TypeValue)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getTypeDef_Value()
   * @model containment="true"
   * @generated
   */
  TypeValue getValue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.TypeDef#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(TypeValue value);

} // TypeDef
