/**
 */
package com.ms.qaTools.saturn.kronus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.kronus.ParameterDef#getName <em>Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.ParameterDef#isByName <em>By Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.ParameterDef#getType <em>Type</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.ParameterDef#isList <em>List</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.kronus.ParameterDef#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.kronus.KronusPackage#getParameterDef()
 * @model
 * @generated
 */
public interface ParameterDef extends ReferenceableDefs
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getParameterDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.ParameterDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>By Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>By Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>By Name</em>' attribute.
   * @see #setByName(boolean)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getParameterDef_ByName()
   * @model
   * @generated
   */
  boolean isByName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.ParameterDef#isByName <em>By Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>By Name</em>' attribute.
   * @see #isByName()
   * @generated
   */
  void setByName(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeInstance)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getParameterDef_Type()
   * @model containment="true"
   * @generated
   */
  TypeInstance getType();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.ParameterDef#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeInstance value);

  /**
   * Returns the value of the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' attribute.
   * @see #setList(boolean)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getParameterDef_List()
   * @model
   * @generated
   */
  boolean isList();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.ParameterDef#isList <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' attribute.
   * @see #isList()
   * @generated
   */
  void setList(boolean value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' containment reference.
   * @see #setDefaultValue(Expression)
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#getParameterDef_DefaultValue()
   * @model containment="true"
   * @generated
   */
  Expression getDefaultValue();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.kronus.ParameterDef#getDefaultValue <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' containment reference.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(Expression value);

} // ParameterDef
