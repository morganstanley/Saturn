package com.ms.qaTools.saturn.annotations.saturnReport;

import com.ms.qaTools.saturn.types.AbstractAnnotation;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Configuration</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getRepetitionName <em>Repetition Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getTitle <em>Title</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getRepetitionTitle <em>Repetition Title</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isIsScenario <em>Is Scenario</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isShowIterationNo <em>Show Iteration No</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getOnStatus <em>On Status</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isIgnored <em>Ignored</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideHeader <em>Hide Header</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideContent <em>Hide Content</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideRepeatingHeader <em>Hide Repeating Header</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideRepeatingContent <em>Hide Repeating Content</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isExpandOnPass <em>Expand On Pass</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getExpandOnStatus <em>Expand On Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration()
 * @model annotation="caption appinfo='Saturn Report Annotation'"
 *        annotation="description appinfo=''"
 *        extendedMetaData="name='SaturnReportConfiguration' kind='elementOnly'"
 * @generated
 */
public interface SaturnReportConfiguration extends AbstractAnnotation
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(ComplexValue)
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_Name()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Repetition Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repetition Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repetition Name</em>' containment reference.
   * @see #setRepetitionName(ComplexValue)
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_RepetitionName()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='RepetitionName' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getRepetitionName();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getRepetitionName <em>Repetition Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repetition Name</em>' containment reference.
   * @see #getRepetitionName()
   * @generated
   */
  void setRepetitionName(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(ComplexValue)
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_Title()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getTitle();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Repetition Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repetition Title</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repetition Title</em>' containment reference.
   * @see #setRepetitionTitle(ComplexValue)
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_RepetitionTitle()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='RepetitionTitle' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getRepetitionTitle();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getRepetitionTitle <em>Repetition Title</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Repetition Title</em>' containment reference.
   * @see #getRepetitionTitle()
   * @generated
   */
  void setRepetitionTitle(ComplexValue value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(ComplexValue)
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_Description()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
   * @generated
   */
  ComplexValue getDescription();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(ComplexValue value);

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
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_Enabled()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='enabled'"
   * @generated
   */
  boolean isEnabled();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see #isSetEnabled()
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @generated
   */
  void setEnabled(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  void unsetEnabled();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isEnabled <em>Enabled</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Enabled</em>' attribute is set.
   * @see #unsetEnabled()
   * @see #isEnabled()
   * @see #setEnabled(boolean)
   * @generated
   */
  boolean isSetEnabled();

  /**
   * Returns the value of the '<em><b>Expand On Pass</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expand On Pass</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expand On Pass</em>' attribute.
   * @see #isSetExpandOnPass()
   * @see #unsetExpandOnPass()
   * @see #setExpandOnPass(boolean)
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_ExpandOnPass()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='expandOnPass'"
   * @generated
   */
  boolean isExpandOnPass();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isExpandOnPass <em>Expand On Pass</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Expand On Pass</em>' attribute.
   * @see #isSetExpandOnPass()
   * @see #unsetExpandOnPass()
   * @see #isExpandOnPass()
   * @generated
   */
  void setExpandOnPass(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isExpandOnPass <em>Expand On Pass</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetExpandOnPass()
   * @see #isExpandOnPass()
   * @see #setExpandOnPass(boolean)
   * @generated
   */
  void unsetExpandOnPass();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isExpandOnPass <em>Expand On Pass</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Expand On Pass</em>' attribute is set.
   * @see #unsetExpandOnPass()
   * @see #isExpandOnPass()
   * @see #setExpandOnPass(boolean)
   * @generated
   */
  boolean isSetExpandOnPass();

  /**
   * Returns the value of the '<em><b>Expand On Status</b></em>' attribute. The default value is <code>"FAIL"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expand On Status</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Expand On Status</em>' attribute.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus
   * @see #isSetExpandOnStatus()
   * @see #unsetExpandOnStatus()
   * @see #setExpandOnStatus(ResultStatus)
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_ExpandOnStatus()
   * @model default="FAIL" unsettable="true" extendedMetaData="kind='attribute' name='expandOnStatus'"
   * @generated
   */
  ResultStatus getExpandOnStatus();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getExpandOnStatus <em>Expand On Status</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Expand On Status</em>' attribute.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus
   * @see #isSetExpandOnStatus()
   * @see #unsetExpandOnStatus()
   * @see #getExpandOnStatus()
   * @generated
   */
  void setExpandOnStatus(ResultStatus value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getExpandOnStatus <em>Expand On Status</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetExpandOnStatus()
   * @see #getExpandOnStatus()
   * @see #setExpandOnStatus(ResultStatus)
   * @generated
   */
  void unsetExpandOnStatus();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getExpandOnStatus <em>Expand On Status</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Expand On Status</em>' attribute is set.
   * @see #unsetExpandOnStatus()
   * @see #getExpandOnStatus()
   * @see #setExpandOnStatus(ResultStatus)
   * @generated
   */
  boolean isSetExpandOnStatus();

  /**
   * Returns the value of the '<em><b>Hide Content</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hide Content</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Hide Content</em>' attribute.
   * @see #isSetHideContent()
   * @see #unsetHideContent()
   * @see #setHideContent(boolean)
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_HideContent()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='hideContent'"
   * @generated
   */
  boolean isHideContent();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideContent <em>Hide Content</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide Content</em>' attribute.
   * @see #isSetHideContent()
   * @see #unsetHideContent()
   * @see #isHideContent()
   * @generated
   */
  void setHideContent(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideContent <em>Hide Content</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetHideContent()
   * @see #isHideContent()
   * @see #setHideContent(boolean)
   * @generated
   */
  void unsetHideContent();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideContent <em>Hide Content</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Hide Content</em>' attribute is set.
   * @see #unsetHideContent()
   * @see #isHideContent()
   * @see #setHideContent(boolean)
   * @generated
   */
  boolean isSetHideContent();

  /**
   * Returns the value of the '<em><b>Hide Header</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hide Header</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Hide Header</em>' attribute.
   * @see #isSetHideHeader()
   * @see #unsetHideHeader()
   * @see #setHideHeader(boolean)
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_HideHeader()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='hideHeader'"
   * @generated
   */
  boolean isHideHeader();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideHeader <em>Hide Header</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide Header</em>' attribute.
   * @see #isSetHideHeader()
   * @see #unsetHideHeader()
   * @see #isHideHeader()
   * @generated
   */
  void setHideHeader(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideHeader <em>Hide Header</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetHideHeader()
   * @see #isHideHeader()
   * @see #setHideHeader(boolean)
   * @generated
   */
  void unsetHideHeader();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideHeader <em>Hide Header</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Hide Header</em>' attribute is set.
   * @see #unsetHideHeader()
   * @see #isHideHeader()
   * @see #setHideHeader(boolean)
   * @generated
   */
  boolean isSetHideHeader();

  /**
   * Returns the value of the '<em><b>Hide Repeating Content</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hide Repeating Content</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hide Repeating Content</em>' attribute.
   * @see #isSetHideRepeatingContent()
   * @see #unsetHideRepeatingContent()
   * @see #setHideRepeatingContent(boolean)
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_HideRepeatingContent()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='hideRepeatingContent'"
   * @generated
   */
  boolean isHideRepeatingContent();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideRepeatingContent <em>Hide Repeating Content</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide Repeating Content</em>' attribute.
   * @see #isSetHideRepeatingContent()
   * @see #unsetHideRepeatingContent()
   * @see #isHideRepeatingContent()
   * @generated
   */
  void setHideRepeatingContent(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideRepeatingContent <em>Hide Repeating Content</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetHideRepeatingContent()
   * @see #isHideRepeatingContent()
   * @see #setHideRepeatingContent(boolean)
   * @generated
   */
  void unsetHideRepeatingContent();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideRepeatingContent <em>Hide Repeating Content</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Hide Repeating Content</em>' attribute is set.
   * @see #unsetHideRepeatingContent()
   * @see #isHideRepeatingContent()
   * @see #setHideRepeatingContent(boolean)
   * @generated
   */
  boolean isSetHideRepeatingContent();

  /**
   * Returns the value of the '<em><b>Hide Repeating Header</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hide Repeating Header</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hide Repeating Header</em>' attribute.
   * @see #isSetHideRepeatingHeader()
   * @see #unsetHideRepeatingHeader()
   * @see #setHideRepeatingHeader(boolean)
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_HideRepeatingHeader()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='hideRepeatingHeader'"
   * @generated
   */
  boolean isHideRepeatingHeader();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideRepeatingHeader <em>Hide Repeating Header</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide Repeating Header</em>' attribute.
   * @see #isSetHideRepeatingHeader()
   * @see #unsetHideRepeatingHeader()
   * @see #isHideRepeatingHeader()
   * @generated
   */
  void setHideRepeatingHeader(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideRepeatingHeader <em>Hide Repeating Header</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetHideRepeatingHeader()
   * @see #isHideRepeatingHeader()
   * @see #setHideRepeatingHeader(boolean)
   * @generated
   */
  void unsetHideRepeatingHeader();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isHideRepeatingHeader <em>Hide Repeating Header</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Hide Repeating Header</em>' attribute is set.
   * @see #unsetHideRepeatingHeader()
   * @see #isHideRepeatingHeader()
   * @see #setHideRepeatingHeader(boolean)
   * @generated
   */
  boolean isSetHideRepeatingHeader();

  /**
   * Returns the value of the '<em><b>Ignored</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignored</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Ignored</em>' attribute.
   * @see #isSetIgnored()
   * @see #unsetIgnored()
   * @see #setIgnored(boolean)
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_Ignored()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='ignored'"
   * @generated
   */
  boolean isIgnored();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isIgnored <em>Ignored</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignored</em>' attribute.
   * @see #isSetIgnored()
   * @see #unsetIgnored()
   * @see #isIgnored()
   * @generated
   */
  void setIgnored(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isIgnored <em>Ignored</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIgnored()
   * @see #isIgnored()
   * @see #setIgnored(boolean)
   * @generated
   */
  void unsetIgnored();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isIgnored <em>Ignored</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Ignored</em>' attribute is set.
   * @see #unsetIgnored()
   * @see #isIgnored()
   * @see #setIgnored(boolean)
   * @generated
   */
  boolean isSetIgnored();

  /**
   * Returns the value of the '<em><b>Is Scenario</b></em>' attribute. The default value is <code>"false"</code>. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Scenario</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Is Scenario</em>' attribute.
   * @see #isSetIsScenario()
   * @see #unsetIsScenario()
   * @see #setIsScenario(boolean)
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_IsScenario()
   * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='isScenario'"
   * @generated
   */
  boolean isIsScenario();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isIsScenario <em>Is Scenario</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Scenario</em>' attribute.
   * @see #isSetIsScenario()
   * @see #unsetIsScenario()
   * @see #isIsScenario()
   * @generated
   */
  void setIsScenario(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isIsScenario <em>Is Scenario</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetIsScenario()
   * @see #isIsScenario()
   * @see #setIsScenario(boolean)
   * @generated
   */
  void unsetIsScenario();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isIsScenario <em>Is Scenario</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Is Scenario</em>' attribute is set.
   * @see #unsetIsScenario()
   * @see #isIsScenario()
   * @see #setIsScenario(boolean)
   * @generated
   */
  boolean isSetIsScenario();

  /**
   * Returns the value of the '<em><b>On Status</b></em>' attribute. The default value is <code>"ANY"</code>. The
   * literals are from the enumeration {@link com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Status</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>On Status</em>' attribute.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus
   * @see #isSetOnStatus()
   * @see #unsetOnStatus()
   * @see #setOnStatus(ResultStatus)
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_OnStatus()
   * @model default="ANY" unsettable="true" extendedMetaData="kind='attribute' name='onStatus'"
   * @generated
   */
  ResultStatus getOnStatus();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getOnStatus <em>On Status</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>On Status</em>' attribute.
   * @see com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus
   * @see #isSetOnStatus()
   * @see #unsetOnStatus()
   * @see #getOnStatus()
   * @generated
   */
  void setOnStatus(ResultStatus value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getOnStatus <em>On Status</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOnStatus()
   * @see #getOnStatus()
   * @see #setOnStatus(ResultStatus)
   * @generated
   */
  void unsetOnStatus();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#getOnStatus <em>On Status</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>On Status</em>' attribute is set.
   * @see #unsetOnStatus()
   * @see #getOnStatus()
   * @see #setOnStatus(ResultStatus)
   * @generated
   */
  boolean isSetOnStatus();

  /**
   * Returns the value of the '<em><b>Show Iteration No</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Show Iteration No</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Show Iteration No</em>' attribute.
   * @see #isSetShowIterationNo()
   * @see #unsetShowIterationNo()
   * @see #setShowIterationNo(boolean)
   * @see com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage#getSaturnReportConfiguration_ShowIterationNo()
   * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='showIterationNo'"
   * @generated
   */
  boolean isShowIterationNo();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isShowIterationNo <em>Show Iteration No</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Show Iteration No</em>' attribute.
   * @see #isSetShowIterationNo()
   * @see #unsetShowIterationNo()
   * @see #isShowIterationNo()
   * @generated
   */
  void setShowIterationNo(boolean value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isShowIterationNo <em>Show Iteration No</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetShowIterationNo()
   * @see #isShowIterationNo()
   * @see #setShowIterationNo(boolean)
   * @generated
   */
  void unsetShowIterationNo();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration#isShowIterationNo <em>Show Iteration No</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Show Iteration No</em>' attribute is set.
   * @see #unsetShowIterationNo()
   * @see #isShowIterationNo()
   * @see #setShowIterationNo(boolean)
   * @generated
   */
  boolean isSetShowIterationNo();

} // SaturnReportConfiguration
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
