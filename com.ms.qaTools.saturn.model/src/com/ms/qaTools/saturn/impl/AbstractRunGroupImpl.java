package com.ms.qaTools.saturn.impl;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.AbstractParameter;
import com.ms.qaTools.saturn.AbstractRunGroup;
import com.ms.qaTools.saturn.Attribute;
import com.ms.qaTools.saturn.IncludeFile;
import com.ms.qaTools.saturn.RunGroupImport;
import com.ms.qaTools.saturn.SaturnPackage;
import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.types.AbstractAnnotation;
import com.ms.qaTools.saturn.types.AbstractRepetitionHandler;
import com.ms.qaTools.saturn.types.AbstractRunGroupModifier;
import com.ms.qaTools.saturn.types.AlmId;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.types.SaturnStatusConditionEnum;
import com.ms.qaTools.saturn.types.SaturnStatusEnum;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract Run Group</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#getImports <em>Imports</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#getException <em>Exception</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#getResources <em>Resources</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#getAttributes <em>Attributes</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#getRepetitionHandler <em>Repetition Handler</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#getModifiers <em>Modifiers</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#getParameters <em>Parameters</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#isCanMultiplex <em>Can Multiplex</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#getDefaultStatus <em>Default Status</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#isEnabled <em>Enabled</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#getId <em>Id</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#getMaxSimultaneousIterations <em>Max Simultaneous
 * Iterations</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#getName <em>Name</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#isProcedure <em>Procedure</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#getStatusCondition <em>Status Condition</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#getWaitAfter <em>Wait After</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#getWaitBefore <em>Wait Before</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.AbstractRunGroupImpl#isWarnOnFailure <em>Warn On Failure</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class AbstractRunGroupImpl extends EObjectImpl implements AbstractRunGroup
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<RunGroupImport>                  imports;

  /**
   * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException()
   * @generated
   * @ordered
   */
  protected exception                              exception;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<NamedResourceDefinition>         resources;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute>                       attributes;

  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList<AbstractAnnotation>              annotations;

  /**
   * The cached value of the '{@link #getRepetitionHandler() <em>Repetition Handler</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRepetitionHandler()
   * @generated
   * @ordered
   */
  protected AbstractRepetitionHandler              repetitionHandler;

  /**
   * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getModifiers()
   * @generated
   * @ordered
   */
  protected EList<AbstractRunGroupModifier>        modifiers;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<AbstractParameter>               parameters;

  /**
   * The cached value of the '{@link #getIncludeFiles() <em>Include Files</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getIncludeFiles()
   * @generated
   * @ordered
   */
  protected EList<IncludeFile>                     includeFiles;

  /**
   * The cached value of the '{@link #getAlmId() <em>Alm Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlmId()
   * @generated
   * @ordered
   */
  protected AlmId almId;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String                    NAME_EDEFAULT                        = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String                                 name                                 = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String                    ID_EDEFAULT                          = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String                                 id                                   = ID_EDEFAULT;

  /**
   * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean                   ENABLED_EDEFAULT                     = true;

  /**
   * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected boolean                                enabled                              = ENABLED_EDEFAULT;

  /**
   * This is true if the Enabled attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                enabledESet;

  /**
   * The default value of the '{@link #isWarnOnFailure() <em>Warn On Failure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWarnOnFailure()
   * @generated
   * @ordered
   */
  protected static final boolean                   WARN_ON_FAILURE_EDEFAULT             = false;

  /**
   * The cached value of the '{@link #isWarnOnFailure() <em>Warn On Failure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWarnOnFailure()
   * @generated
   * @ordered
   */
  protected boolean                                warnOnFailure                        = WARN_ON_FAILURE_EDEFAULT;

  /**
   * This is true if the Warn On Failure attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                warnOnFailureESet;

  /**
   * The default value of the '{@link #getWaitBefore() <em>Wait Before</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getWaitBefore()
   * @generated
   * @ordered
   */
  protected static final BigInteger                WAIT_BEFORE_EDEFAULT                 = new BigInteger("0");

  /**
   * The cached value of the '{@link #getWaitBefore() <em>Wait Before</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getWaitBefore()
   * @generated
   * @ordered
   */
  protected BigInteger                             waitBefore                           = WAIT_BEFORE_EDEFAULT;

  /**
   * This is true if the Wait Before attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                waitBeforeESet;

  /**
   * The default value of the '{@link #getWaitAfter() <em>Wait After</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getWaitAfter()
   * @generated
   * @ordered
   */
  protected static final BigInteger                WAIT_AFTER_EDEFAULT                  = new BigInteger("0");

  /**
   * The cached value of the '{@link #getWaitAfter() <em>Wait After</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getWaitAfter()
   * @generated
   * @ordered
   */
  protected BigInteger                             waitAfter                            = WAIT_AFTER_EDEFAULT;

  /**
   * This is true if the Wait After attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                waitAfterESet;

  /**
   * The default value of the '{@link #getDefaultStatus() <em>Default Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultStatus()
   * @generated
   * @ordered
   */
  protected static final SaturnStatusEnum          DEFAULT_STATUS_EDEFAULT              = SaturnStatusEnum.FAIL;

  /**
   * The cached value of the '{@link #getDefaultStatus() <em>Default Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultStatus()
   * @generated
   * @ordered
   */
  protected SaturnStatusEnum                       defaultStatus                        = DEFAULT_STATUS_EDEFAULT;

  /**
   * This is true if the Default Status attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                defaultStatusESet;

  /**
   * The default value of the '{@link #getStatusCondition() <em>Status Condition</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getStatusCondition()
   * @generated
   * @ordered
   */
  protected static final SaturnStatusConditionEnum STATUS_CONDITION_EDEFAULT            = SaturnStatusConditionEnum.ANYFAIL;

  /**
   * The cached value of the '{@link #getStatusCondition() <em>Status Condition</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getStatusCondition()
   * @generated
   * @ordered
   */
  protected SaturnStatusConditionEnum              statusCondition                      = STATUS_CONDITION_EDEFAULT;

  /**
   * This is true if the Status Condition attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                statusConditionESet;

  /**
   * The default value of the '{@link #isProcedure() <em>Procedure</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isProcedure()
   * @generated
   * @ordered
   */
  protected static final boolean                   PROCEDURE_EDEFAULT                   = false;

  /**
   * The cached value of the '{@link #isProcedure() <em>Procedure</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isProcedure()
   * @generated
   * @ordered
   */
  protected boolean                                procedure                            = PROCEDURE_EDEFAULT;

  /**
   * This is true if the Procedure attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                procedureESet;

  /**
   * The default value of the '{@link #isCanMultiplex() <em>Can Multiplex</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isCanMultiplex()
   * @generated
   * @ordered
   */
  protected static final boolean                   CAN_MULTIPLEX_EDEFAULT               = false;

  /**
   * The cached value of the '{@link #isCanMultiplex() <em>Can Multiplex</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isCanMultiplex()
   * @generated
   * @ordered
   */
  protected boolean                                canMultiplex                         = CAN_MULTIPLEX_EDEFAULT;

  /**
   * This is true if the Can Multiplex attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                                canMultiplexESet;

  /**
   * The default value of the '{@link #getMaxSimultaneousIterations() <em>Max Simultaneous Iterations</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getMaxSimultaneousIterations()
   * @generated
   * @ordered
   */
  protected static final BigInteger                MAX_SIMULTANEOUS_ITERATIONS_EDEFAULT = new BigInteger("10");

  /**
   * The cached value of the '{@link #getMaxSimultaneousIterations() <em>Max Simultaneous Iterations</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getMaxSimultaneousIterations()
   * @generated
   * @ordered
   */
  protected BigInteger                             maxSimultaneousIterations            = MAX_SIMULTANEOUS_ITERATIONS_EDEFAULT;

  /**
   * This is true if the Max Simultaneous Iterations attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  protected boolean                                maxSimultaneousIterationsESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected AbstractRunGroupImpl()
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
    return SaturnPackage.Literals.ABSTRACT_RUN_GROUP;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<RunGroupImport> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<RunGroupImport>(RunGroupImport.class, this, SaturnPackage.ABSTRACT_RUN_GROUP__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public exception getException()
  {
    return exception;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetException(exception newException, NotificationChain msgs)
  {
    exception oldException = exception;
    exception = newException;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__EXCEPTION, oldException, newException);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setException(exception newException)
  {
    if (newException != exception)
    {
      NotificationChain msgs = null;
      if (exception != null)
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.ABSTRACT_RUN_GROUP__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.ABSTRACT_RUN_GROUP__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__EXCEPTION, newException, newException));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedResourceDefinition> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<NamedResourceDefinition>(NamedResourceDefinition.class, this, SaturnPackage.ABSTRACT_RUN_GROUP__RESOURCES);
    }
    return resources;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, SaturnPackage.ABSTRACT_RUN_GROUP__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractAnnotation> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectContainmentEList<AbstractAnnotation>(AbstractAnnotation.class, this, SaturnPackage.ABSTRACT_RUN_GROUP__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractRepetitionHandler getRepetitionHandler()
  {
    return repetitionHandler;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepetitionHandler(AbstractRepetitionHandler newRepetitionHandler,
      NotificationChain msgs)
  {
    AbstractRepetitionHandler oldRepetitionHandler = repetitionHandler;
    repetitionHandler = newRepetitionHandler;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__REPETITION_HANDLER, oldRepetitionHandler, newRepetitionHandler);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRepetitionHandler(AbstractRepetitionHandler newRepetitionHandler)
  {
    if (newRepetitionHandler != repetitionHandler)
    {
      NotificationChain msgs = null;
      if (repetitionHandler != null)
        msgs = ((InternalEObject)repetitionHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.ABSTRACT_RUN_GROUP__REPETITION_HANDLER, null, msgs);
      if (newRepetitionHandler != null)
        msgs = ((InternalEObject)newRepetitionHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.ABSTRACT_RUN_GROUP__REPETITION_HANDLER, null, msgs);
      msgs = basicSetRepetitionHandler(newRepetitionHandler, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__REPETITION_HANDLER, newRepetitionHandler, newRepetitionHandler));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractRunGroupModifier> getModifiers()
  {
    if (modifiers == null)
    {
      modifiers = new EObjectContainmentEList<AbstractRunGroupModifier>(AbstractRunGroupModifier.class, this, SaturnPackage.ABSTRACT_RUN_GROUP__MODIFIERS);
    }
    return modifiers;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<AbstractParameter>(AbstractParameter.class, this, SaturnPackage.ABSTRACT_RUN_GROUP__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<IncludeFile> getIncludeFiles()
  {
    if (includeFiles == null)
    {
      includeFiles = new EObjectContainmentEList<IncludeFile>(IncludeFile.class, this, SaturnPackage.ABSTRACT_RUN_GROUP__INCLUDE_FILES);
    }
    return includeFiles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlmId getAlmId()
  {
    return almId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlmId(AlmId newAlmId, NotificationChain msgs)
  {
    AlmId oldAlmId = almId;
    almId = newAlmId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__ALM_ID, oldAlmId, newAlmId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlmId(AlmId newAlmId)
  {
    if (newAlmId != almId)
    {
      NotificationChain msgs = null;
      if (almId != null)
        msgs = ((InternalEObject)almId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.ABSTRACT_RUN_GROUP__ALM_ID, null, msgs);
      if (newAlmId != null)
        msgs = ((InternalEObject)newAlmId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SaturnPackage.ABSTRACT_RUN_GROUP__ALM_ID, null, msgs);
      msgs = basicSetAlmId(newAlmId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__ALM_ID, newAlmId, newAlmId));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isCanMultiplex()
  {
    return canMultiplex;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCanMultiplex(boolean newCanMultiplex)
  {
    boolean oldCanMultiplex = canMultiplex;
    canMultiplex = newCanMultiplex;
    boolean oldCanMultiplexESet = canMultiplexESet;
    canMultiplexESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__CAN_MULTIPLEX, oldCanMultiplex, canMultiplex, !oldCanMultiplexESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCanMultiplex()
  {
    boolean oldCanMultiplex = canMultiplex;
    boolean oldCanMultiplexESet = canMultiplexESet;
    canMultiplex = CAN_MULTIPLEX_EDEFAULT;
    canMultiplexESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnPackage.ABSTRACT_RUN_GROUP__CAN_MULTIPLEX, oldCanMultiplex, CAN_MULTIPLEX_EDEFAULT, oldCanMultiplexESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCanMultiplex()
  {
    return canMultiplexESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnStatusEnum getDefaultStatus()
  {
    return defaultStatus;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultStatus(SaturnStatusEnum newDefaultStatus)
  {
    SaturnStatusEnum oldDefaultStatus = defaultStatus;
    defaultStatus = newDefaultStatus == null ? DEFAULT_STATUS_EDEFAULT : newDefaultStatus;
    boolean oldDefaultStatusESet = defaultStatusESet;
    defaultStatusESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__DEFAULT_STATUS, oldDefaultStatus, defaultStatus, !oldDefaultStatusESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDefaultStatus()
  {
    SaturnStatusEnum oldDefaultStatus = defaultStatus;
    boolean oldDefaultStatusESet = defaultStatusESet;
    defaultStatus = DEFAULT_STATUS_EDEFAULT;
    defaultStatusESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnPackage.ABSTRACT_RUN_GROUP__DEFAULT_STATUS, oldDefaultStatus, DEFAULT_STATUS_EDEFAULT, oldDefaultStatusESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDefaultStatus()
  {
    return defaultStatusESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__ENABLED, oldEnabled, enabled, !oldEnabledESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnPackage.ABSTRACT_RUN_GROUP__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
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
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getMaxSimultaneousIterations()
  {
    return maxSimultaneousIterations;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setMaxSimultaneousIterations(BigInteger newMaxSimultaneousIterations)
  {
    BigInteger oldMaxSimultaneousIterations = maxSimultaneousIterations;
    maxSimultaneousIterations = newMaxSimultaneousIterations;
    boolean oldMaxSimultaneousIterationsESet = maxSimultaneousIterationsESet;
    maxSimultaneousIterationsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__MAX_SIMULTANEOUS_ITERATIONS, oldMaxSimultaneousIterations, maxSimultaneousIterations, !oldMaxSimultaneousIterationsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetMaxSimultaneousIterations()
  {
    BigInteger oldMaxSimultaneousIterations = maxSimultaneousIterations;
    boolean oldMaxSimultaneousIterationsESet = maxSimultaneousIterationsESet;
    maxSimultaneousIterations = MAX_SIMULTANEOUS_ITERATIONS_EDEFAULT;
    maxSimultaneousIterationsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnPackage.ABSTRACT_RUN_GROUP__MAX_SIMULTANEOUS_ITERATIONS, oldMaxSimultaneousIterations, MAX_SIMULTANEOUS_ITERATIONS_EDEFAULT, oldMaxSimultaneousIterationsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetMaxSimultaneousIterations()
  {
    return maxSimultaneousIterationsESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isProcedure()
  {
    return procedure;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setProcedure(boolean newProcedure)
  {
    boolean oldProcedure = procedure;
    procedure = newProcedure;
    boolean oldProcedureESet = procedureESet;
    procedureESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__PROCEDURE, oldProcedure, procedure, !oldProcedureESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetProcedure()
  {
    boolean oldProcedure = procedure;
    boolean oldProcedureESet = procedureESet;
    procedure = PROCEDURE_EDEFAULT;
    procedureESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnPackage.ABSTRACT_RUN_GROUP__PROCEDURE, oldProcedure, PROCEDURE_EDEFAULT, oldProcedureESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetProcedure()
  {
    return procedureESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnStatusConditionEnum getStatusCondition()
  {
    return statusCondition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setStatusCondition(SaturnStatusConditionEnum newStatusCondition)
  {
    SaturnStatusConditionEnum oldStatusCondition = statusCondition;
    statusCondition = newStatusCondition == null ? STATUS_CONDITION_EDEFAULT : newStatusCondition;
    boolean oldStatusConditionESet = statusConditionESet;
    statusConditionESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__STATUS_CONDITION, oldStatusCondition, statusCondition, !oldStatusConditionESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetStatusCondition()
  {
    SaturnStatusConditionEnum oldStatusCondition = statusCondition;
    boolean oldStatusConditionESet = statusConditionESet;
    statusCondition = STATUS_CONDITION_EDEFAULT;
    statusConditionESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnPackage.ABSTRACT_RUN_GROUP__STATUS_CONDITION, oldStatusCondition, STATUS_CONDITION_EDEFAULT, oldStatusConditionESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetStatusCondition()
  {
    return statusConditionESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getWaitAfter()
  {
    return waitAfter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setWaitAfter(BigInteger newWaitAfter)
  {
    BigInteger oldWaitAfter = waitAfter;
    waitAfter = newWaitAfter;
    boolean oldWaitAfterESet = waitAfterESet;
    waitAfterESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__WAIT_AFTER, oldWaitAfter, waitAfter, !oldWaitAfterESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetWaitAfter()
  {
    BigInteger oldWaitAfter = waitAfter;
    boolean oldWaitAfterESet = waitAfterESet;
    waitAfter = WAIT_AFTER_EDEFAULT;
    waitAfterESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnPackage.ABSTRACT_RUN_GROUP__WAIT_AFTER, oldWaitAfter, WAIT_AFTER_EDEFAULT, oldWaitAfterESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetWaitAfter()
  {
    return waitAfterESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getWaitBefore()
  {
    return waitBefore;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setWaitBefore(BigInteger newWaitBefore)
  {
    BigInteger oldWaitBefore = waitBefore;
    waitBefore = newWaitBefore;
    boolean oldWaitBeforeESet = waitBeforeESet;
    waitBeforeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__WAIT_BEFORE, oldWaitBefore, waitBefore, !oldWaitBeforeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetWaitBefore()
  {
    BigInteger oldWaitBefore = waitBefore;
    boolean oldWaitBeforeESet = waitBeforeESet;
    waitBefore = WAIT_BEFORE_EDEFAULT;
    waitBeforeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnPackage.ABSTRACT_RUN_GROUP__WAIT_BEFORE, oldWaitBefore, WAIT_BEFORE_EDEFAULT, oldWaitBeforeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetWaitBefore()
  {
    return waitBeforeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isWarnOnFailure()
  {
    return warnOnFailure;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setWarnOnFailure(boolean newWarnOnFailure)
  {
    boolean oldWarnOnFailure = warnOnFailure;
    warnOnFailure = newWarnOnFailure;
    boolean oldWarnOnFailureESet = warnOnFailureESet;
    warnOnFailureESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.ABSTRACT_RUN_GROUP__WARN_ON_FAILURE, oldWarnOnFailure, warnOnFailure, !oldWarnOnFailureESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetWarnOnFailure()
  {
    boolean oldWarnOnFailure = warnOnFailure;
    boolean oldWarnOnFailureESet = warnOnFailureESet;
    warnOnFailure = WARN_ON_FAILURE_EDEFAULT;
    warnOnFailureESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnPackage.ABSTRACT_RUN_GROUP__WARN_ON_FAILURE, oldWarnOnFailure, WARN_ON_FAILURE_EDEFAULT, oldWarnOnFailureESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetWarnOnFailure()
  {
    return warnOnFailureESet;
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
      case SaturnPackage.ABSTRACT_RUN_GROUP__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case SaturnPackage.ABSTRACT_RUN_GROUP__EXCEPTION:
        return basicSetException(null, msgs);
      case SaturnPackage.ABSTRACT_RUN_GROUP__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
      case SaturnPackage.ABSTRACT_RUN_GROUP__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case SaturnPackage.ABSTRACT_RUN_GROUP__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case SaturnPackage.ABSTRACT_RUN_GROUP__REPETITION_HANDLER:
        return basicSetRepetitionHandler(null, msgs);
      case SaturnPackage.ABSTRACT_RUN_GROUP__MODIFIERS:
        return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
      case SaturnPackage.ABSTRACT_RUN_GROUP__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case SaturnPackage.ABSTRACT_RUN_GROUP__INCLUDE_FILES:
        return ((InternalEList<?>)getIncludeFiles()).basicRemove(otherEnd, msgs);
      case SaturnPackage.ABSTRACT_RUN_GROUP__ALM_ID:
        return basicSetAlmId(null, msgs);
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
      case SaturnPackage.ABSTRACT_RUN_GROUP__IMPORTS:
        return getImports();
      case SaturnPackage.ABSTRACT_RUN_GROUP__EXCEPTION:
        return getException();
      case SaturnPackage.ABSTRACT_RUN_GROUP__RESOURCES:
        return getResources();
      case SaturnPackage.ABSTRACT_RUN_GROUP__ATTRIBUTES:
        return getAttributes();
      case SaturnPackage.ABSTRACT_RUN_GROUP__ANNOTATIONS:
        return getAnnotations();
      case SaturnPackage.ABSTRACT_RUN_GROUP__REPETITION_HANDLER:
        return getRepetitionHandler();
      case SaturnPackage.ABSTRACT_RUN_GROUP__MODIFIERS:
        return getModifiers();
      case SaturnPackage.ABSTRACT_RUN_GROUP__PARAMETERS:
        return getParameters();
      case SaturnPackage.ABSTRACT_RUN_GROUP__INCLUDE_FILES:
        return getIncludeFiles();
      case SaturnPackage.ABSTRACT_RUN_GROUP__ALM_ID:
        return getAlmId();
      case SaturnPackage.ABSTRACT_RUN_GROUP__NAME:
        return getName();
      case SaturnPackage.ABSTRACT_RUN_GROUP__ID:
        return getId();
      case SaturnPackage.ABSTRACT_RUN_GROUP__ENABLED:
        return isEnabled();
      case SaturnPackage.ABSTRACT_RUN_GROUP__WARN_ON_FAILURE:
        return isWarnOnFailure();
      case SaturnPackage.ABSTRACT_RUN_GROUP__WAIT_BEFORE:
        return getWaitBefore();
      case SaturnPackage.ABSTRACT_RUN_GROUP__WAIT_AFTER:
        return getWaitAfter();
      case SaturnPackage.ABSTRACT_RUN_GROUP__DEFAULT_STATUS:
        return getDefaultStatus();
      case SaturnPackage.ABSTRACT_RUN_GROUP__STATUS_CONDITION:
        return getStatusCondition();
      case SaturnPackage.ABSTRACT_RUN_GROUP__PROCEDURE:
        return isProcedure();
      case SaturnPackage.ABSTRACT_RUN_GROUP__CAN_MULTIPLEX:
        return isCanMultiplex();
      case SaturnPackage.ABSTRACT_RUN_GROUP__MAX_SIMULTANEOUS_ITERATIONS:
        return getMaxSimultaneousIterations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SaturnPackage.ABSTRACT_RUN_GROUP__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends RunGroupImport>)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__EXCEPTION:
        setException((exception)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends NamedResourceDefinition>)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends AbstractAnnotation>)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__REPETITION_HANDLER:
        setRepetitionHandler((AbstractRepetitionHandler)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__MODIFIERS:
        getModifiers().clear();
        getModifiers().addAll((Collection<? extends AbstractRunGroupModifier>)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends AbstractParameter>)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__INCLUDE_FILES:
        getIncludeFiles().clear();
        getIncludeFiles().addAll((Collection<? extends IncludeFile>)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__ALM_ID:
        setAlmId((AlmId)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__NAME:
        setName((String)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__ID:
        setId((String)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__ENABLED:
        setEnabled((Boolean)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__WARN_ON_FAILURE:
        setWarnOnFailure((Boolean)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__WAIT_BEFORE:
        setWaitBefore((BigInteger)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__WAIT_AFTER:
        setWaitAfter((BigInteger)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__DEFAULT_STATUS:
        setDefaultStatus((SaturnStatusEnum)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__STATUS_CONDITION:
        setStatusCondition((SaturnStatusConditionEnum)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__PROCEDURE:
        setProcedure((Boolean)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__CAN_MULTIPLEX:
        setCanMultiplex((Boolean)newValue);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__MAX_SIMULTANEOUS_ITERATIONS:
        setMaxSimultaneousIterations((BigInteger)newValue);
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
      case SaturnPackage.ABSTRACT_RUN_GROUP__IMPORTS:
        getImports().clear();
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__EXCEPTION:
        setException((exception)null);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__RESOURCES:
        getResources().clear();
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__ATTRIBUTES:
        getAttributes().clear();
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__REPETITION_HANDLER:
        setRepetitionHandler((AbstractRepetitionHandler)null);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__MODIFIERS:
        getModifiers().clear();
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__PARAMETERS:
        getParameters().clear();
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__INCLUDE_FILES:
        getIncludeFiles().clear();
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__ALM_ID:
        setAlmId((AlmId)null);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__ID:
        setId(ID_EDEFAULT);
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__ENABLED:
        unsetEnabled();
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__WARN_ON_FAILURE:
        unsetWarnOnFailure();
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__WAIT_BEFORE:
        unsetWaitBefore();
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__WAIT_AFTER:
        unsetWaitAfter();
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__DEFAULT_STATUS:
        unsetDefaultStatus();
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__STATUS_CONDITION:
        unsetStatusCondition();
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__PROCEDURE:
        unsetProcedure();
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__CAN_MULTIPLEX:
        unsetCanMultiplex();
        return;
      case SaturnPackage.ABSTRACT_RUN_GROUP__MAX_SIMULTANEOUS_ITERATIONS:
        unsetMaxSimultaneousIterations();
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
      case SaturnPackage.ABSTRACT_RUN_GROUP__IMPORTS:
        return imports != null && !imports.isEmpty();
      case SaturnPackage.ABSTRACT_RUN_GROUP__EXCEPTION:
        return exception != null;
      case SaturnPackage.ABSTRACT_RUN_GROUP__RESOURCES:
        return resources != null && !resources.isEmpty();
      case SaturnPackage.ABSTRACT_RUN_GROUP__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case SaturnPackage.ABSTRACT_RUN_GROUP__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case SaturnPackage.ABSTRACT_RUN_GROUP__REPETITION_HANDLER:
        return repetitionHandler != null;
      case SaturnPackage.ABSTRACT_RUN_GROUP__MODIFIERS:
        return modifiers != null && !modifiers.isEmpty();
      case SaturnPackage.ABSTRACT_RUN_GROUP__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case SaturnPackage.ABSTRACT_RUN_GROUP__INCLUDE_FILES:
        return includeFiles != null && !includeFiles.isEmpty();
      case SaturnPackage.ABSTRACT_RUN_GROUP__ALM_ID:
        return almId != null;
      case SaturnPackage.ABSTRACT_RUN_GROUP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SaturnPackage.ABSTRACT_RUN_GROUP__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case SaturnPackage.ABSTRACT_RUN_GROUP__ENABLED:
        return isSetEnabled();
      case SaturnPackage.ABSTRACT_RUN_GROUP__WARN_ON_FAILURE:
        return isSetWarnOnFailure();
      case SaturnPackage.ABSTRACT_RUN_GROUP__WAIT_BEFORE:
        return isSetWaitBefore();
      case SaturnPackage.ABSTRACT_RUN_GROUP__WAIT_AFTER:
        return isSetWaitAfter();
      case SaturnPackage.ABSTRACT_RUN_GROUP__DEFAULT_STATUS:
        return isSetDefaultStatus();
      case SaturnPackage.ABSTRACT_RUN_GROUP__STATUS_CONDITION:
        return isSetStatusCondition();
      case SaturnPackage.ABSTRACT_RUN_GROUP__PROCEDURE:
        return isSetProcedure();
      case SaturnPackage.ABSTRACT_RUN_GROUP__CAN_MULTIPLEX:
        return isSetCanMultiplex();
      case SaturnPackage.ABSTRACT_RUN_GROUP__MAX_SIMULTANEOUS_ITERATIONS:
        return isSetMaxSimultaneousIterations();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", id: ");
    result.append(id);
    result.append(", enabled: ");
    if (enabledESet) result.append(enabled); else result.append("<unset>");
    result.append(", warnOnFailure: ");
    if (warnOnFailureESet) result.append(warnOnFailure); else result.append("<unset>");
    result.append(", waitBefore: ");
    if (waitBeforeESet) result.append(waitBefore); else result.append("<unset>");
    result.append(", waitAfter: ");
    if (waitAfterESet) result.append(waitAfter); else result.append("<unset>");
    result.append(", defaultStatus: ");
    if (defaultStatusESet) result.append(defaultStatus); else result.append("<unset>");
    result.append(", statusCondition: ");
    if (statusConditionESet) result.append(statusCondition); else result.append("<unset>");
    result.append(", procedure: ");
    if (procedureESet) result.append(procedure); else result.append("<unset>");
    result.append(", canMultiplex: ");
    if (canMultiplexESet) result.append(canMultiplex); else result.append("<unset>");
    result.append(", maxSimultaneousIterations: ");
    if (maxSimultaneousIterationsESet) result.append(maxSimultaneousIterations); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // AbstractRunGroupImpl
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
