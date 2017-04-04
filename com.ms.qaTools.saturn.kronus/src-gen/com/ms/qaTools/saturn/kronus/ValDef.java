/**
 */
package com.ms.qaTools.saturn.kronus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Val Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.ValDef#getHashtags <em>Hashtags</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.ValDef#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.ValDef#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.kronus.KronusPackage#getValDef()
 * @model
 * @generated
 */
public interface ValDef extends AbstractDef, ReferenceableDefs
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
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getValDef_Hashtags()
   * @model containment="true"
   * @generated
   */
  EList<HashtagCall> getHashtags();

  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.kronus.AnnotationCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getValDef_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<AnnotationCall> getAnnotations();

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getValDef_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.ValDef#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // ValDef
