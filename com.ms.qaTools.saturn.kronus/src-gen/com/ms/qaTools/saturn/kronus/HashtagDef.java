/**
 */
package com.ms.qaTools.saturn.kronus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hashtag Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.HashtagDef#getParameterDefs <em>Parameter Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.kronus.KronusPackage#getHashtagDef()
 * @model
 * @generated
 */
public interface HashtagDef extends AbstractDef
{
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
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getHashtagDef_ParameterDefs()
   * @model containment="true"
   * @generated
   */
  EList<ParameterDef> getParameterDefs();

} // HashtagDef
