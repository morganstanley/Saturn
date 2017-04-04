package com.ms.qaTools.saturn.annotations.saturnReport.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.annotations.saturnReport.ResultStatus;
import com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration;
import com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage;
import com.ms.qaTools.saturn.types.impl.AbstractAnnotationImpl;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Configuration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#getRepetitionName <em>Repetition Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#getRepetitionTitle <em>Repetition Title</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#isIsScenario <em>Is Scenario</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#isShowIterationNo <em>Show Iteration No</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#getOnStatus <em>On Status</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#isIgnored <em>Ignored</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#isHideHeader <em>Hide Header</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#isHideContent <em>Hide Content</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#isHideRepeatingHeader <em>Hide Repeating Header</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#isHideRepeatingContent <em>Hide Repeating Content</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#isExpandOnPass <em>Expand On Pass</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnReport.impl.SaturnReportConfigurationImpl#getExpandOnStatus <em>Expand On Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SaturnReportConfigurationImpl extends AbstractAnnotationImpl implements SaturnReportConfiguration
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected ComplexValue              name;

  /**
   * The cached value of the '{@link #getRepetitionName() <em>Repetition Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepetitionName()
   * @generated
   * @ordered
   */
  protected ComplexValue repetitionName;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected ComplexValue              title;

  /**
   * The cached value of the '{@link #getRepetitionTitle() <em>Repetition Title</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRepetitionTitle()
   * @generated
   * @ordered
   */
  protected ComplexValue              repetitionTitle;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected ComplexValue              description;

  /**
   * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean      ENABLED_EDEFAULT                = true;

  /**
   * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected boolean                   enabled                         = ENABLED_EDEFAULT;

  /**
   * This is true if the Enabled attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   enabledESet;

  /**
   * The default value of the '{@link #isIsScenario() <em>Is Scenario</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIsScenario()
   * @generated
   * @ordered
   */
  protected static final boolean      IS_SCENARIO_EDEFAULT            = false;

  /**
   * The cached value of the '{@link #isIsScenario() <em>Is Scenario</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIsScenario()
   * @generated
   * @ordered
   */
  protected boolean                   isScenario                      = IS_SCENARIO_EDEFAULT;

  /**
   * This is true if the Is Scenario attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   isScenarioESet;

  /**
   * The default value of the '{@link #isShowIterationNo() <em>Show Iteration No</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isShowIterationNo()
   * @generated
   * @ordered
   */
  protected static final boolean      SHOW_ITERATION_NO_EDEFAULT      = true;

  /**
   * The cached value of the '{@link #isShowIterationNo() <em>Show Iteration No</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isShowIterationNo()
   * @generated
   * @ordered
   */
  protected boolean                   showIterationNo                 = SHOW_ITERATION_NO_EDEFAULT;

  /**
   * This is true if the Show Iteration No attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   showIterationNoESet;

  /**
   * The default value of the '{@link #getOnStatus() <em>On Status</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOnStatus()
   * @generated
   * @ordered
   */
  protected static final ResultStatus ON_STATUS_EDEFAULT              = ResultStatus.ANY;

  /**
   * The cached value of the '{@link #getOnStatus() <em>On Status</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOnStatus()
   * @generated
   * @ordered
   */
  protected ResultStatus              onStatus                        = ON_STATUS_EDEFAULT;

  /**
   * This is true if the On Status attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   onStatusESet;

  /**
   * The default value of the '{@link #isIgnored() <em>Ignored</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIgnored()
   * @generated
   * @ordered
   */
  protected static final boolean      IGNORED_EDEFAULT                = false;

  /**
   * The cached value of the '{@link #isIgnored() <em>Ignored</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIgnored()
   * @generated
   * @ordered
   */
  protected boolean                   ignored                         = IGNORED_EDEFAULT;

  /**
   * This is true if the Ignored attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   ignoredESet;

  /**
   * The default value of the '{@link #isHideHeader() <em>Hide Header</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isHideHeader()
   * @generated
   * @ordered
   */
  protected static final boolean      HIDE_HEADER_EDEFAULT            = false;

  /**
   * The cached value of the '{@link #isHideHeader() <em>Hide Header</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isHideHeader()
   * @generated
   * @ordered
   */
  protected boolean                   hideHeader                      = HIDE_HEADER_EDEFAULT;

  /**
   * This is true if the Hide Header attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   hideHeaderESet;

  /**
   * The default value of the '{@link #isHideContent() <em>Hide Content</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isHideContent()
   * @generated
   * @ordered
   */
  protected static final boolean      HIDE_CONTENT_EDEFAULT           = false;

  /**
   * The cached value of the '{@link #isHideContent() <em>Hide Content</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isHideContent()
   * @generated
   * @ordered
   */
  protected boolean                   hideContent                     = HIDE_CONTENT_EDEFAULT;

  /**
   * This is true if the Hide Content attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   hideContentESet;

  /**
   * The default value of the '{@link #isHideRepeatingHeader() <em>Hide Repeating Header</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isHideRepeatingHeader()
   * @generated
   * @ordered
   */
  protected static final boolean      HIDE_REPEATING_HEADER_EDEFAULT  = false;

  /**
   * The cached value of the '{@link #isHideRepeatingHeader() <em>Hide Repeating Header</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isHideRepeatingHeader()
   * @generated
   * @ordered
   */
  protected boolean                   hideRepeatingHeader             = HIDE_REPEATING_HEADER_EDEFAULT;

  /**
   * This is true if the Hide Repeating Header attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   hideRepeatingHeaderESet;

  /**
   * The default value of the '{@link #isHideRepeatingContent() <em>Hide Repeating Content</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isHideRepeatingContent()
   * @generated
   * @ordered
   */
  protected static final boolean      HIDE_REPEATING_CONTENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHideRepeatingContent() <em>Hide Repeating Content</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isHideRepeatingContent()
   * @generated
   * @ordered
   */
  protected boolean                   hideRepeatingContent            = HIDE_REPEATING_CONTENT_EDEFAULT;

  /**
   * This is true if the Hide Repeating Content attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   hideRepeatingContentESet;

  /**
   * The default value of the '{@link #isExpandOnPass() <em>Expand On Pass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExpandOnPass()
   * @generated
   * @ordered
   */
  protected static final boolean      EXPAND_ON_PASS_EDEFAULT         = false;

  /**
   * The cached value of the '{@link #isExpandOnPass() <em>Expand On Pass</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isExpandOnPass()
   * @generated
   * @ordered
   */
  protected boolean                   expandOnPass                    = EXPAND_ON_PASS_EDEFAULT;

  /**
   * This is true if the Expand On Pass attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   expandOnPassESet;

  /**
   * The default value of the '{@link #getExpandOnStatus() <em>Expand On Status</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getExpandOnStatus()
   * @generated
   * @ordered
   */
  protected static final ResultStatus EXPAND_ON_STATUS_EDEFAULT       = ResultStatus.FAIL;

  /**
   * The cached value of the '{@link #getExpandOnStatus() <em>Expand On Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpandOnStatus()
   * @generated
   * @ordered
   */
  protected ResultStatus              expandOnStatus                  = EXPAND_ON_STATUS_EDEFAULT;

  /**
   * This is true if the Expand On Status attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                   expandOnStatusESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected SaturnReportConfigurationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SaturnReportPackage.Literals.SATURN_REPORT_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(ComplexValue newName, NotificationChain msgs)
  {
    ComplexValue oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setName(ComplexValue newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaturnReportPackage.SATURN_REPORT_CONFIGURATION__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaturnReportPackage.SATURN_REPORT_CONFIGURATION__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getRepetitionName()
  {
    return repetitionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepetitionName(ComplexValue newRepetitionName, NotificationChain msgs)
  {
    ComplexValue oldRepetitionName = repetitionName;
    repetitionName = newRepetitionName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_NAME, oldRepetitionName, newRepetitionName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepetitionName(ComplexValue newRepetitionName)
  {
    if (newRepetitionName != repetitionName)
    {
      NotificationChain msgs = null;
      if (repetitionName != null)
        msgs = ((InternalEObject)repetitionName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_NAME, null, msgs);
      if (newRepetitionName != null)
        msgs = ((InternalEObject)newRepetitionName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_NAME, null, msgs);
      msgs = basicSetRepetitionName(newRepetitionName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_NAME, newRepetitionName, newRepetitionName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTitle(ComplexValue newTitle, NotificationChain msgs)
  {
    ComplexValue oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__TITLE, oldTitle, newTitle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(ComplexValue newTitle)
  {
    if (newTitle != title)
    {
      NotificationChain msgs = null;
      if (title != null)
        msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaturnReportPackage.SATURN_REPORT_CONFIGURATION__TITLE, null, msgs);
      if (newTitle != null)
        msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaturnReportPackage.SATURN_REPORT_CONFIGURATION__TITLE, null, msgs);
      msgs = basicSetTitle(newTitle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__TITLE, newTitle, newTitle));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getRepetitionTitle()
  {
    return repetitionTitle;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepetitionTitle(ComplexValue newRepetitionTitle, NotificationChain msgs)
  {
    ComplexValue oldRepetitionTitle = repetitionTitle;
    repetitionTitle = newRepetitionTitle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_TITLE, oldRepetitionTitle, newRepetitionTitle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRepetitionTitle(ComplexValue newRepetitionTitle)
  {
    if (newRepetitionTitle != repetitionTitle)
    {
      NotificationChain msgs = null;
      if (repetitionTitle != null)
        msgs = ((InternalEObject)repetitionTitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_TITLE, null, msgs);
      if (newRepetitionTitle != null)
        msgs = ((InternalEObject)newRepetitionTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_TITLE, null, msgs);
      msgs = basicSetRepetitionTitle(newRepetitionTitle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_TITLE, newRepetitionTitle, newRepetitionTitle));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDescription(ComplexValue newDescription, NotificationChain msgs)
  {
    ComplexValue oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__DESCRIPTION, oldDescription, newDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(ComplexValue newDescription)
  {
    if (newDescription != description)
    {
      NotificationChain msgs = null;
      if (description != null)
        msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaturnReportPackage.SATURN_REPORT_CONFIGURATION__DESCRIPTION, null, msgs);
      if (newDescription != null)
        msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaturnReportPackage.SATURN_REPORT_CONFIGURATION__DESCRIPTION, null, msgs);
      msgs = basicSetDescription(newDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__DESCRIPTION, newDescription, newDescription));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnabled()
  {
    return enabled;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setEnabled(boolean newEnabled)
  {
    boolean oldEnabled = enabled;
    enabled = newEnabled;
    boolean oldEnabledESet = enabledESet;
    enabledESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__ENABLED, oldEnabled, enabled, !oldEnabledESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetEnabled()
  {
    boolean oldEnabled = enabled;
    boolean oldEnabledESet = enabledESet;
    enabled = ENABLED_EDEFAULT;
    enabledESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetEnabled()
  {
    return enabledESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isExpandOnPass()
  {
    return expandOnPass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setExpandOnPass(boolean newExpandOnPass)
  {
    boolean oldExpandOnPass = expandOnPass;
    expandOnPass = newExpandOnPass;
    boolean oldExpandOnPassESet = expandOnPassESet;
    expandOnPassESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__EXPAND_ON_PASS, oldExpandOnPass, expandOnPass, !oldExpandOnPassESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetExpandOnPass()
  {
    boolean oldExpandOnPass = expandOnPass;
    boolean oldExpandOnPassESet = expandOnPassESet;
    expandOnPass = EXPAND_ON_PASS_EDEFAULT;
    expandOnPassESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__EXPAND_ON_PASS, oldExpandOnPass, EXPAND_ON_PASS_EDEFAULT, oldExpandOnPassESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetExpandOnPass()
  {
    return expandOnPassESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResultStatus getExpandOnStatus()
  {
    return expandOnStatus;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setExpandOnStatus(ResultStatus newExpandOnStatus)
  {
    ResultStatus oldExpandOnStatus = expandOnStatus;
    expandOnStatus = newExpandOnStatus == null ? EXPAND_ON_STATUS_EDEFAULT : newExpandOnStatus;
    boolean oldExpandOnStatusESet = expandOnStatusESet;
    expandOnStatusESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__EXPAND_ON_STATUS, oldExpandOnStatus, expandOnStatus, !oldExpandOnStatusESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetExpandOnStatus()
  {
    ResultStatus oldExpandOnStatus = expandOnStatus;
    boolean oldExpandOnStatusESet = expandOnStatusESet;
    expandOnStatus = EXPAND_ON_STATUS_EDEFAULT;
    expandOnStatusESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__EXPAND_ON_STATUS, oldExpandOnStatus, EXPAND_ON_STATUS_EDEFAULT, oldExpandOnStatusESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetExpandOnStatus()
  {
    return expandOnStatusESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isHideContent()
  {
    return hideContent;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setHideContent(boolean newHideContent)
  {
    boolean oldHideContent = hideContent;
    hideContent = newHideContent;
    boolean oldHideContentESet = hideContentESet;
    hideContentESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_CONTENT, oldHideContent, hideContent, !oldHideContentESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetHideContent()
  {
    boolean oldHideContent = hideContent;
    boolean oldHideContentESet = hideContentESet;
    hideContent = HIDE_CONTENT_EDEFAULT;
    hideContentESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_CONTENT, oldHideContent, HIDE_CONTENT_EDEFAULT, oldHideContentESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetHideContent()
  {
    return hideContentESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isHideHeader()
  {
    return hideHeader;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setHideHeader(boolean newHideHeader)
  {
    boolean oldHideHeader = hideHeader;
    hideHeader = newHideHeader;
    boolean oldHideHeaderESet = hideHeaderESet;
    hideHeaderESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_HEADER, oldHideHeader, hideHeader, !oldHideHeaderESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetHideHeader()
  {
    boolean oldHideHeader = hideHeader;
    boolean oldHideHeaderESet = hideHeaderESet;
    hideHeader = HIDE_HEADER_EDEFAULT;
    hideHeaderESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_HEADER, oldHideHeader, HIDE_HEADER_EDEFAULT, oldHideHeaderESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetHideHeader()
  {
    return hideHeaderESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isHideRepeatingContent()
  {
    return hideRepeatingContent;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setHideRepeatingContent(boolean newHideRepeatingContent)
  {
    boolean oldHideRepeatingContent = hideRepeatingContent;
    hideRepeatingContent = newHideRepeatingContent;
    boolean oldHideRepeatingContentESet = hideRepeatingContentESet;
    hideRepeatingContentESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_CONTENT, oldHideRepeatingContent, hideRepeatingContent, !oldHideRepeatingContentESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetHideRepeatingContent()
  {
    boolean oldHideRepeatingContent = hideRepeatingContent;
    boolean oldHideRepeatingContentESet = hideRepeatingContentESet;
    hideRepeatingContent = HIDE_REPEATING_CONTENT_EDEFAULT;
    hideRepeatingContentESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_CONTENT, oldHideRepeatingContent, HIDE_REPEATING_CONTENT_EDEFAULT, oldHideRepeatingContentESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetHideRepeatingContent()
  {
    return hideRepeatingContentESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isHideRepeatingHeader()
  {
    return hideRepeatingHeader;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setHideRepeatingHeader(boolean newHideRepeatingHeader)
  {
    boolean oldHideRepeatingHeader = hideRepeatingHeader;
    hideRepeatingHeader = newHideRepeatingHeader;
    boolean oldHideRepeatingHeaderESet = hideRepeatingHeaderESet;
    hideRepeatingHeaderESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_HEADER, oldHideRepeatingHeader, hideRepeatingHeader, !oldHideRepeatingHeaderESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetHideRepeatingHeader()
  {
    boolean oldHideRepeatingHeader = hideRepeatingHeader;
    boolean oldHideRepeatingHeaderESet = hideRepeatingHeaderESet;
    hideRepeatingHeader = HIDE_REPEATING_HEADER_EDEFAULT;
    hideRepeatingHeaderESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_HEADER, oldHideRepeatingHeader, HIDE_REPEATING_HEADER_EDEFAULT, oldHideRepeatingHeaderESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetHideRepeatingHeader()
  {
    return hideRepeatingHeaderESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIgnored()
  {
    return ignored;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIgnored(boolean newIgnored)
  {
    boolean oldIgnored = ignored;
    ignored = newIgnored;
    boolean oldIgnoredESet = ignoredESet;
    ignoredESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__IGNORED, oldIgnored, ignored, !oldIgnoredESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIgnored()
  {
    boolean oldIgnored = ignored;
    boolean oldIgnoredESet = ignoredESet;
    ignored = IGNORED_EDEFAULT;
    ignoredESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__IGNORED, oldIgnored, IGNORED_EDEFAULT, oldIgnoredESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIgnored()
  {
    return ignoredESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsScenario()
  {
    return isScenario;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIsScenario(boolean newIsScenario)
  {
    boolean oldIsScenario = isScenario;
    isScenario = newIsScenario;
    boolean oldIsScenarioESet = isScenarioESet;
    isScenarioESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__IS_SCENARIO, oldIsScenario, isScenario, !oldIsScenarioESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIsScenario()
  {
    boolean oldIsScenario = isScenario;
    boolean oldIsScenarioESet = isScenarioESet;
    isScenario = IS_SCENARIO_EDEFAULT;
    isScenarioESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__IS_SCENARIO, oldIsScenario, IS_SCENARIO_EDEFAULT, oldIsScenarioESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIsScenario()
  {
    return isScenarioESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResultStatus getOnStatus()
  {
    return onStatus;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOnStatus(ResultStatus newOnStatus)
  {
    ResultStatus oldOnStatus = onStatus;
    onStatus = newOnStatus == null ? ON_STATUS_EDEFAULT : newOnStatus;
    boolean oldOnStatusESet = onStatusESet;
    onStatusESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__ON_STATUS, oldOnStatus, onStatus, !oldOnStatusESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOnStatus()
  {
    ResultStatus oldOnStatus = onStatus;
    boolean oldOnStatusESet = onStatusESet;
    onStatus = ON_STATUS_EDEFAULT;
    onStatusESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__ON_STATUS, oldOnStatus, ON_STATUS_EDEFAULT, oldOnStatusESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOnStatus()
  {
    return onStatusESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isShowIterationNo()
  {
    return showIterationNo;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setShowIterationNo(boolean newShowIterationNo)
  {
    boolean oldShowIterationNo = showIterationNo;
    showIterationNo = newShowIterationNo;
    boolean oldShowIterationNoESet = showIterationNoESet;
    showIterationNoESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__SHOW_ITERATION_NO, oldShowIterationNo, showIterationNo, !oldShowIterationNoESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetShowIterationNo()
  {
    boolean oldShowIterationNo = showIterationNo;
    boolean oldShowIterationNoESet = showIterationNoESet;
    showIterationNo = SHOW_ITERATION_NO_EDEFAULT;
    showIterationNoESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnReportPackage.SATURN_REPORT_CONFIGURATION__SHOW_ITERATION_NO, oldShowIterationNo, SHOW_ITERATION_NO_EDEFAULT, oldShowIterationNoESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetShowIterationNo()
  {
    return showIterationNoESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__NAME:
        return basicSetName(null, msgs);
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_NAME:
        return basicSetRepetitionName(null, msgs);
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__TITLE:
        return basicSetTitle(null, msgs);
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_TITLE:
        return basicSetRepetitionTitle(null, msgs);
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__DESCRIPTION:
        return basicSetDescription(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__NAME:
        return getName();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_NAME:
        return getRepetitionName();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__TITLE:
        return getTitle();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_TITLE:
        return getRepetitionTitle();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__DESCRIPTION:
        return getDescription();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__ENABLED:
        return isEnabled();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__IS_SCENARIO:
        return isIsScenario();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__SHOW_ITERATION_NO:
        return isShowIterationNo();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__ON_STATUS:
        return getOnStatus();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__IGNORED:
        return isIgnored();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_HEADER:
        return isHideHeader();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_CONTENT:
        return isHideContent();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_HEADER:
        return isHideRepeatingHeader();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_CONTENT:
        return isHideRepeatingContent();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__EXPAND_ON_PASS:
        return isExpandOnPass();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__EXPAND_ON_STATUS:
        return getExpandOnStatus();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__NAME:
        setName((ComplexValue)newValue);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_NAME:
        setRepetitionName((ComplexValue)newValue);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__TITLE:
        setTitle((ComplexValue)newValue);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_TITLE:
        setRepetitionTitle((ComplexValue)newValue);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__DESCRIPTION:
        setDescription((ComplexValue)newValue);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__ENABLED:
        setEnabled((Boolean)newValue);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__IS_SCENARIO:
        setIsScenario((Boolean)newValue);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__SHOW_ITERATION_NO:
        setShowIterationNo((Boolean)newValue);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__ON_STATUS:
        setOnStatus((ResultStatus)newValue);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__IGNORED:
        setIgnored((Boolean)newValue);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_HEADER:
        setHideHeader((Boolean)newValue);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_CONTENT:
        setHideContent((Boolean)newValue);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_HEADER:
        setHideRepeatingHeader((Boolean)newValue);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_CONTENT:
        setHideRepeatingContent((Boolean)newValue);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__EXPAND_ON_PASS:
        setExpandOnPass((Boolean)newValue);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__EXPAND_ON_STATUS:
        setExpandOnStatus((ResultStatus)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__NAME:
        setName((ComplexValue)null);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_NAME:
        setRepetitionName((ComplexValue)null);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__TITLE:
        setTitle((ComplexValue)null);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_TITLE:
        setRepetitionTitle((ComplexValue)null);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__DESCRIPTION:
        setDescription((ComplexValue)null);
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__ENABLED:
        unsetEnabled();
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__IS_SCENARIO:
        unsetIsScenario();
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__SHOW_ITERATION_NO:
        unsetShowIterationNo();
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__ON_STATUS:
        unsetOnStatus();
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__IGNORED:
        unsetIgnored();
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_HEADER:
        unsetHideHeader();
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_CONTENT:
        unsetHideContent();
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_HEADER:
        unsetHideRepeatingHeader();
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_CONTENT:
        unsetHideRepeatingContent();
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__EXPAND_ON_PASS:
        unsetExpandOnPass();
        return;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__EXPAND_ON_STATUS:
        unsetExpandOnStatus();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__NAME:
        return name != null;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_NAME:
        return repetitionName != null;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__TITLE:
        return title != null;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__REPETITION_TITLE:
        return repetitionTitle != null;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__DESCRIPTION:
        return description != null;
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__ENABLED:
        return isSetEnabled();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__IS_SCENARIO:
        return isSetIsScenario();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__SHOW_ITERATION_NO:
        return isSetShowIterationNo();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__ON_STATUS:
        return isSetOnStatus();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__IGNORED:
        return isSetIgnored();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_HEADER:
        return isSetHideHeader();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_CONTENT:
        return isSetHideContent();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_HEADER:
        return isSetHideRepeatingHeader();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__HIDE_REPEATING_CONTENT:
        return isSetHideRepeatingContent();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__EXPAND_ON_PASS:
        return isSetExpandOnPass();
      case SaturnReportPackage.SATURN_REPORT_CONFIGURATION__EXPAND_ON_STATUS:
        return isSetExpandOnStatus();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (enabled: ");
    if (enabledESet) result.append(enabled); else result.append("<unset>");
    result.append(", isScenario: ");
    if (isScenarioESet) result.append(isScenario); else result.append("<unset>");
    result.append(", showIterationNo: ");
    if (showIterationNoESet) result.append(showIterationNo); else result.append("<unset>");
    result.append(", onStatus: ");
    if (onStatusESet) result.append(onStatus); else result.append("<unset>");
    result.append(", ignored: ");
    if (ignoredESet) result.append(ignored); else result.append("<unset>");
    result.append(", hideHeader: ");
    if (hideHeaderESet) result.append(hideHeader); else result.append("<unset>");
    result.append(", hideContent: ");
    if (hideContentESet) result.append(hideContent); else result.append("<unset>");
    result.append(", hideRepeatingHeader: ");
    if (hideRepeatingHeaderESet) result.append(hideRepeatingHeader); else result.append("<unset>");
    result.append(", hideRepeatingContent: ");
    if (hideRepeatingContentESet) result.append(hideRepeatingContent); else result.append("<unset>");
    result.append(", expandOnPass: ");
    if (expandOnPassESet) result.append(expandOnPass); else result.append("<unset>");
    result.append(", expandOnStatus: ");
    if (expandOnStatusESet) result.append(expandOnStatus); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // SaturnReportConfigurationImpl
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
