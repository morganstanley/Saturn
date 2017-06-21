package com.ms.qaTools.saturn;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.types.AbstractAnnotation;
import com.ms.qaTools.saturn.types.AbstractRepetitionHandler;
import com.ms.qaTools.saturn.types.AbstractRunGroupModifier;
import com.ms.qaTools.saturn.types.AlmId;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.types.SaturnStatusConditionEnum;
import com.ms.qaTools.saturn.types.SaturnStatusEnum;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Abstract Run Group</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#getImports <em>Imports</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#getException <em>Exception</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#getResources <em>Resources</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#getAttributes <em>Attributes</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#getRepetitionHandler <em>Repetition Handler</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#getModifiers <em>Modifiers</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#getParameters <em>Parameters</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#isCanMultiplex <em>Can Multiplex</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#getDefaultStatus <em>Default Status</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#isEnabled <em>Enabled</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#getId <em>Id</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#getMaxSimultaneousIterations <em>Max Simultaneous Iterations</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#getName <em>Name</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#isProcedure <em>Procedure</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#getStatusCondition <em>Status Condition</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#getWaitAfter <em>Wait After</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#getWaitBefore <em>Wait Before</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.AbstractRunGroup#isWarnOnFailure <em>Warn On Failure</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup()
 * @model abstract="true" annotation="http://www.ms.com/2011/pdsttools/xsd2scriptLib updater='runGroup'"
 *        extendedMetaData="name='AbstractRunGroup' kind='elementOnly'"
 * @generated
 */
public interface AbstractRunGroup extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.RunGroupImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_Imports()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Imports' namespace='##targetNamespace'"
   * @generated
   */
  EList<RunGroupImport> getImports();

  /**
   * Returns the value of the '<em><b>Exception</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception</em>' containment reference.
   * @see #setException(exception)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_Exception()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exception' namespace='http://www.ms.com/2009/Saturn/Exception'"
   * @generated
   */
  exception getException();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getException <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception</em>' containment reference.
   * @see #getException()
   * @generated
   */
  void setException(exception value);

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.types.NamedResourceDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_Resources()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Resources' namespace='##targetNamespace'"
   * @generated
   */
  EList<NamedResourceDefinition> getResources();

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_Attributes()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attributes' namespace='##targetNamespace'"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.types.AbstractAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_Annotations()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Annotations' namespace='##targetNamespace'"
   * @generated
   */
  EList<AbstractAnnotation> getAnnotations();

  /**
   * Returns the value of the '<em><b>Repetition Handler</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repetition Handler</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repetition Handler</em>' containment reference.
   * @see #setRepetitionHandler(AbstractRepetitionHandler)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_RepetitionHandler()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='RepetitionHandler' namespace='##targetNamespace'"
   * @generated
   */
  AbstractRepetitionHandler getRepetitionHandler();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getRepetitionHandler <em>Repetition Handler</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Repetition Handler</em>' containment reference.
   * @see #getRepetitionHandler()
   * @generated
   */
  void setRepetitionHandler(AbstractRepetitionHandler value);

  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.types.AbstractRunGroupModifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' containment reference list.
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_Modifiers()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Modifiers' namespace='##targetNamespace'"
   * @generated
   */
  EList<AbstractRunGroupModifier> getModifiers();

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.AbstractParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_Parameters()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Parameters' namespace='##targetNamespace'"
   * @generated
   */
  EList<AbstractParameter> getParameters();

  /**
   * Returns the value of the '<em><b>Include Files</b></em>' containment reference list.
   * The list contents are of type {@link com.ms.qaTools.saturn.IncludeFile}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include Files</em>' containment reference list isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include Files</em>' containment reference list.
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_IncludeFiles()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='IncludeFiles' namespace='##targetNamespace'"
   * @generated
   */
  EList<IncludeFile> getIncludeFiles();

  /**
   * Returns the value of the '<em><b>Alm Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alm Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alm Id</em>' containment reference.
   * @see #setAlmId(AlmId)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_AlmId()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='AlmId' namespace='##targetNamespace'"
   * @generated
   */
  AlmId getAlmId();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getAlmId <em>Alm Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alm Id</em>' containment reference.
   * @see #getAlmId()
   * @generated
   */
  void setAlmId(AlmId value);

  /**
   * Returns the value of the '<em><b>Can Multiplex</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Can Multiplex</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Can Multiplex</em>' attribute.
   * @see #isSetCanMultiplex()
   * @see #unsetCanMultiplex()
   * @see #setCanMultiplex(boolean)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_CanMultiplex()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='canMultiplex'"
   * @generated
   */
  boolean isCanMultiplex();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#isCanMultiplex <em>Can Multiplex</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Can Multiplex</em>' attribute.
   * @see #isSetCanMultiplex()
   * @see #unsetCanMultiplex()
   * @see #isCanMultiplex()
   * @generated
   */
  void setCanMultiplex(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#isCanMultiplex <em>Can Multiplex</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetCanMultiplex()
   * @see #isCanMultiplex()
   * @see #setCanMultiplex(boolean)
   * @generated
   */
  void unsetCanMultiplex();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#isCanMultiplex <em>Can Multiplex</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Can Multiplex</em>' attribute is set.
   * @see #unsetCanMultiplex()
   * @see #isCanMultiplex()
   * @see #setCanMultiplex(boolean)
   * @generated
   */
  boolean isSetCanMultiplex();

  /**
   * Returns the value of the '<em><b>Default Status</b></em>' attribute.
   * The default value is <code>"FAIL"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.types.SaturnStatusEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Status</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Status</em>' attribute.
   * @see com.ms.qaTools.saturn.types.SaturnStatusEnum
   * @see #isSetDefaultStatus()
   * @see #unsetDefaultStatus()
   * @see #setDefaultStatus(SaturnStatusEnum)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_DefaultStatus()
   * @model default="FAIL" unsettable="true"
   *        extendedMetaData="kind='attribute' name='defaultStatus'"
   * @generated
   */
  SaturnStatusEnum getDefaultStatus();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getDefaultStatus <em>Default Status</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Status</em>' attribute.
   * @see com.ms.qaTools.saturn.types.SaturnStatusEnum
   * @see #isSetDefaultStatus()
   * @see #unsetDefaultStatus()
   * @see #getDefaultStatus()
   * @generated
   */
  void setDefaultStatus(SaturnStatusEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getDefaultStatus <em>Default Status</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDefaultStatus()
   * @see #getDefaultStatus()
   * @see #setDefaultStatus(SaturnStatusEnum)
   * @generated
   */
  void unsetDefaultStatus();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getDefaultStatus <em>Default Status</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Default Status</em>' attribute is set.
   * @see #unsetDefaultStatus()
   * @see #getDefaultStatus()
   * @see #setDefaultStatus(SaturnStatusEnum)
   * @generated
   */
  boolean isSetDefaultStatus();

  /**
   * Returns the value of the '<em><b>Enabled</b></em>' attribute. The default value is <code>"true"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #setEnabled(boolean)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_Enabled()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report displayType='none'"
   *        extendedMetaData="kind='attribute' name='enabled'"
   * @generated
   */
  boolean isEnabled();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#isEnabled <em>Enabled</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @generated
   */
  void setEnabled(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#isEnabled <em>Enabled</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  void unsetEnabled();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#isEnabled <em>Enabled</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Enabled</em>' attribute is set.
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  boolean isSetEnabled();

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_Id()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getId <em>Id</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Max Simultaneous Iterations</b></em>' attribute.
   * The default value is <code>"10"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Simultaneous Iterations</em>' attribute isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Simultaneous Iterations</em>' attribute.
   * @see #isSetMaxSimultaneousIterations()
   * @see #unsetMaxSimultaneousIterations()
   * @see #setMaxSimultaneousIterations(BigInteger)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_MaxSimultaneousIterations()
   * @model default="10" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='maxSimultaneousIterations'"
   * @generated
   */
  BigInteger getMaxSimultaneousIterations();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getMaxSimultaneousIterations <em>Max Simultaneous Iterations</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Simultaneous Iterations</em>' attribute.
   * @see #isSetMaxSimultaneousIterations()
   * @see #unsetMaxSimultaneousIterations()
   * @see #getMaxSimultaneousIterations()
   * @generated
   */
  void setMaxSimultaneousIterations(BigInteger value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getMaxSimultaneousIterations <em>Max Simultaneous Iterations</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetMaxSimultaneousIterations()
   * @see #getMaxSimultaneousIterations()
   * @see #setMaxSimultaneousIterations(BigInteger)
   * @generated
   */
  void unsetMaxSimultaneousIterations();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getMaxSimultaneousIterations <em>Max Simultaneous Iterations</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Max Simultaneous Iterations</em>' attribute is set.
   * @see #unsetMaxSimultaneousIterations()
   * @see #getMaxSimultaneousIterations()
   * @see #setMaxSimultaneousIterations(BigInteger)
   * @generated
   */
  boolean isSetMaxSimultaneousIterations();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getName <em>Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Procedure</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Procedure</em>' attribute.
   * @see #isSetProcedure()
   * @see #unsetProcedure()
   * @see #setProcedure(boolean)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_Procedure()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report displayType='none'"
   *        extendedMetaData="kind='attribute' name='procedure'"
   * @generated
   */
  boolean isProcedure();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#isProcedure <em>Procedure</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Procedure</em>' attribute.
   * @see #isSetProcedure()
   * @see #unsetProcedure()
   * @see #isProcedure()
   * @generated
   */
  void setProcedure(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#isProcedure <em>Procedure</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetProcedure()
   * @see #isProcedure()
   * @see #setProcedure(boolean)
   * @generated
   */
  void unsetProcedure();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#isProcedure <em>Procedure</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Procedure</em>' attribute is set.
   * @see #unsetProcedure()
   * @see #isProcedure()
   * @see #setProcedure(boolean)
   * @generated
   */
  boolean isSetProcedure();

  /**
   * Returns the value of the '<em><b>Status Condition</b></em>' attribute. The default value is <code>"ANY FAIL"</code>
   * . The literals are from the enumeration {@link com.ms.qaTools.saturn.types.SaturnStatusConditionEnum}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status Condition</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Status Condition</em>' attribute.
   * @see com.ms.qaTools.saturn.types.SaturnStatusConditionEnum
   * @see #isSetStatusCondition()
   * @see #unsetStatusCondition()
   * @see #setStatusCondition(SaturnStatusConditionEnum)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_StatusCondition()
   * @model default="ANY FAIL" unsettable="true"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report displayType='none'"
   *        extendedMetaData="kind='attribute' name='statusCondition'"
   * @generated
   */
  SaturnStatusConditionEnum getStatusCondition();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getStatusCondition <em>Status Condition</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Status Condition</em>' attribute.
   * @see com.ms.qaTools.saturn.types.SaturnStatusConditionEnum
   * @see #isSetStatusCondition()
   * @see #unsetStatusCondition()
   * @see #getStatusCondition()
   * @generated
   */
  void setStatusCondition(SaturnStatusConditionEnum value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getStatusCondition <em>Status Condition</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetStatusCondition()
   * @see #getStatusCondition()
   * @see #setStatusCondition(SaturnStatusConditionEnum)
   * @generated
   */
  void unsetStatusCondition();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getStatusCondition <em>Status Condition</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Status Condition</em>' attribute is set.
   * @see #unsetStatusCondition()
   * @see #getStatusCondition()
   * @see #setStatusCondition(SaturnStatusConditionEnum)
   * @generated
   */
  boolean isSetStatusCondition();

  /**
   * Returns the value of the '<em><b>Wait After</b></em>' attribute. The default value is <code>"0"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wait After</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Wait After</em>' attribute.
   * @see #isSetWaitAfter()
   * @see #unsetWaitAfter()
   * @see #setWaitAfter(BigInteger)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_WaitAfter()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report displayType='none'"
   *        extendedMetaData="kind='attribute' name='waitAfter'"
   * @generated
   */
  BigInteger getWaitAfter();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getWaitAfter <em>Wait After</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Wait After</em>' attribute.
   * @see #isSetWaitAfter()
   * @see #unsetWaitAfter()
   * @see #getWaitAfter()
   * @generated
   */
  void setWaitAfter(BigInteger value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getWaitAfter <em>Wait After</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetWaitAfter()
   * @see #getWaitAfter()
   * @see #setWaitAfter(BigInteger)
   * @generated
   */
  void unsetWaitAfter();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getWaitAfter <em>Wait After</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Wait After</em>' attribute is set.
   * @see #unsetWaitAfter()
   * @see #getWaitAfter()
   * @see #setWaitAfter(BigInteger)
   * @generated
   */
  boolean isSetWaitAfter();

  /**
   * Returns the value of the '<em><b>Wait Before</b></em>' attribute. The default value is <code>"0"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wait Before</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Wait Before</em>' attribute.
   * @see #isSetWaitBefore()
   * @see #unsetWaitBefore()
   * @see #setWaitBefore(BigInteger)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_WaitBefore()
   * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        annotation="http://www.ms.com/2011/pdsttools/xsd2report displayType='none'"
   *        extendedMetaData="kind='attribute' name='waitBefore'"
   * @generated
   */
  BigInteger getWaitBefore();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getWaitBefore <em>Wait Before</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Wait Before</em>' attribute.
   * @see #isSetWaitBefore()
   * @see #unsetWaitBefore()
   * @see #getWaitBefore()
   * @generated
   */
  void setWaitBefore(BigInteger value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getWaitBefore <em>Wait Before</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetWaitBefore()
   * @see #getWaitBefore()
   * @see #setWaitBefore(BigInteger)
   * @generated
   */
  void unsetWaitBefore();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#getWaitBefore <em>Wait Before</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Wait Before</em>' attribute is set.
   * @see #unsetWaitBefore()
   * @see #getWaitBefore()
   * @see #setWaitBefore(BigInteger)
   * @generated
   */
  boolean isSetWaitBefore();

  /**
   * Returns the value of the '<em><b>Warn On Failure</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Warn On Failure</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Warn On Failure</em>' attribute.
   * @see #isSetWarnOnFailure()
   * @see #unsetWarnOnFailure()
   * @see #setWarnOnFailure(boolean)
   * @see com.ms.qaTools.saturn.SaturnPackage#getAbstractRunGroup_WarnOnFailure()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='warnOnFailure'"
   * @generated
   */
  boolean isWarnOnFailure();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#isWarnOnFailure <em>Warn On Failure</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Warn On Failure</em>' attribute.
   * @see #isSetWarnOnFailure()
   * @see #unsetWarnOnFailure()
   * @see #isWarnOnFailure()
   * @generated
   */
  void setWarnOnFailure(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#isWarnOnFailure <em>Warn On Failure</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetWarnOnFailure()
   * @see #isWarnOnFailure()
   * @see #setWarnOnFailure(boolean)
   * @generated
   */
  void unsetWarnOnFailure();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.AbstractRunGroup#isWarnOnFailure <em>Warn On Failure</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Warn On Failure</em>' attribute is set.
   * @see #unsetWarnOnFailure()
   * @see #isWarnOnFailure()
   * @see #setWarnOnFailure(boolean)
   * @generated
   */
  boolean isSetWarnOnFailure();

} // AbstractRunGroup
/*
Copyright 2017 Morgan Stanley

Licensed under the GNU Lesser General Public License Version 3 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

https://www.gnu.org/licenses/lgpl-3.0.en.html

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

IN ADDITION, THE FOLLOWING DISCLAIMER APPLIES IN CONNECTION WITH THIS PROGRAM:

THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY
WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY
USING THIS OR ANOTHER EQUIVALENT DISCLAIMER IN ADDITION TO ANY OTHER REQUIRED
LICENSE TERMS.
*/
