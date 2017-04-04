/**
 */
package com.ms.qaTools.saturn.kronus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.AnnotationDef#getParameterDefs <em>Parameter Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.kronus.KronusPackage#getAnnotationDef()
 * @model
 * @generated
 */
public interface AnnotationDef extends AbstractDef
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
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getAnnotationDef_ParameterDefs()
   * @model containment="true"
   * @generated
   */
  EList<ParameterDef> getParameterDefs();

} // AnnotationDef
