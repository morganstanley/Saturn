package com.ms.qaTools.saturn.modules.extractDDLModule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.exception.exception;
import com.ms.qaTools.saturn.modules.extractDDLModule.DiffOperation;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage;
import com.ms.qaTools.saturn.types.ComplexValueMap;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Diff Operation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#getException <em>Exception</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#getOutputResource <em>Output Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#getDataBaseQualifier <em>Data Base Qualifier</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#getColumnLength <em>Column Length</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#getObjectMaps <em>Object Maps</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#isIgnoreMissing <em>Ignore Missing</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#isShowIdenticals <em>Show Identicals</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#isOmitNewlyAdded <em>Omit Newly Added</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#isOmitTables <em>Omit Tables</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#isOmitViews <em>Omit Views</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#isOmitSequences <em>Omit Sequences</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#isOmitProcedures <em>Omit Procedures</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#isOmitPermissions <em>Omit Permissions</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#isOmitIndexes <em>Omit Indexes</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#isOmitTableSpaces <em>Omit Table Spaces</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#isOmitStorage <em>Omit Storage</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.extractDDLModule.impl.DiffOperationImpl#isPreserveColumnSequence <em>Preserve Column Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiffOperationImpl extends AbstractOperationImpl implements DiffOperation
{
  /**
   * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException()
   * @generated
   * @ordered
   */
  protected exception               exception;

  /**
   * The cached value of the '{@link #getOutputResource() <em>Output Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOutputResource()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition outputResource;

  /**
   * The cached value of the '{@link #getDataBaseQualifier() <em>Data Base Qualifier</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDataBaseQualifier()
   * @generated
   * @ordered
   */
  protected ComplexValue            dataBaseQualifier;

  /**
   * The cached value of the '{@link #getColumnLength() <em>Column Length</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getColumnLength()
   * @generated
   * @ordered
   */
  protected ComplexValue            columnLength;

  /**
   * The cached value of the '{@link #getObjectMaps() <em>Object Maps</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getObjectMaps()
   * @generated
   * @ordered
   */
  protected EList<ComplexValueMap>  objectMaps;

  /**
   * The default value of the '{@link #isIgnoreMissing() <em>Ignore Missing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIgnoreMissing()
   * @generated
   * @ordered
   */
  protected static final boolean    IGNORE_MISSING_EDEFAULT           = false;

  /**
   * The cached value of the '{@link #isIgnoreMissing() <em>Ignore Missing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIgnoreMissing()
   * @generated
   * @ordered
   */
  protected boolean                 ignoreMissing                     = IGNORE_MISSING_EDEFAULT;

  /**
   * This is true if the Ignore Missing attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 ignoreMissingESet;

  /**
   * The default value of the '{@link #isShowIdenticals() <em>Show Identicals</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShowIdenticals()
   * @generated
   * @ordered
   */
  protected static final boolean    SHOW_IDENTICALS_EDEFAULT          = false;

  /**
   * The cached value of the '{@link #isShowIdenticals() <em>Show Identicals</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShowIdenticals()
   * @generated
   * @ordered
   */
  protected boolean                 showIdenticals                    = SHOW_IDENTICALS_EDEFAULT;

  /**
   * This is true if the Show Identicals attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 showIdenticalsESet;

  /**
   * The default value of the '{@link #isOmitNewlyAdded() <em>Omit Newly Added</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOmitNewlyAdded()
   * @generated
   * @ordered
   */
  protected static final boolean    OMIT_NEWLY_ADDED_EDEFAULT         = false;

  /**
   * The cached value of the '{@link #isOmitNewlyAdded() <em>Omit Newly Added</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOmitNewlyAdded()
   * @generated
   * @ordered
   */
  protected boolean                 omitNewlyAdded                    = OMIT_NEWLY_ADDED_EDEFAULT;

  /**
   * This is true if the Omit Newly Added attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 omitNewlyAddedESet;

  /**
   * The default value of the '{@link #isOmitTables() <em>Omit Tables</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOmitTables()
   * @generated
   * @ordered
   */
  protected static final boolean    OMIT_TABLES_EDEFAULT              = false;

  /**
   * The cached value of the '{@link #isOmitTables() <em>Omit Tables</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOmitTables()
   * @generated
   * @ordered
   */
  protected boolean                 omitTables                        = OMIT_TABLES_EDEFAULT;

  /**
   * This is true if the Omit Tables attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 omitTablesESet;

  /**
   * The default value of the '{@link #isOmitViews() <em>Omit Views</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOmitViews()
   * @generated
   * @ordered
   */
  protected static final boolean    OMIT_VIEWS_EDEFAULT               = false;

  /**
   * The cached value of the '{@link #isOmitViews() <em>Omit Views</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOmitViews()
   * @generated
   * @ordered
   */
  protected boolean                 omitViews                         = OMIT_VIEWS_EDEFAULT;

  /**
   * This is true if the Omit Views attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 omitViewsESet;

  /**
   * The default value of the '{@link #isOmitSequences() <em>Omit Sequences</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOmitSequences()
   * @generated
   * @ordered
   */
  protected static final boolean    OMIT_SEQUENCES_EDEFAULT           = false;

  /**
   * The cached value of the '{@link #isOmitSequences() <em>Omit Sequences</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOmitSequences()
   * @generated
   * @ordered
   */
  protected boolean                 omitSequences                     = OMIT_SEQUENCES_EDEFAULT;

  /**
   * This is true if the Omit Sequences attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 omitSequencesESet;

  /**
   * The default value of the '{@link #isOmitProcedures() <em>Omit Procedures</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOmitProcedures()
   * @generated
   * @ordered
   */
  protected static final boolean    OMIT_PROCEDURES_EDEFAULT          = false;

  /**
   * The cached value of the '{@link #isOmitProcedures() <em>Omit Procedures</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOmitProcedures()
   * @generated
   * @ordered
   */
  protected boolean                 omitProcedures                    = OMIT_PROCEDURES_EDEFAULT;

  /**
   * This is true if the Omit Procedures attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 omitProceduresESet;

  /**
   * The default value of the '{@link #isOmitPermissions() <em>Omit Permissions</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isOmitPermissions()
   * @generated
   * @ordered
   */
  protected static final boolean    OMIT_PERMISSIONS_EDEFAULT         = false;

  /**
   * The cached value of the '{@link #isOmitPermissions() <em>Omit Permissions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOmitPermissions()
   * @generated
   * @ordered
   */
  protected boolean                 omitPermissions                   = OMIT_PERMISSIONS_EDEFAULT;

  /**
   * This is true if the Omit Permissions attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 omitPermissionsESet;

  /**
   * The default value of the '{@link #isOmitIndexes() <em>Omit Indexes</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOmitIndexes()
   * @generated
   * @ordered
   */
  protected static final boolean    OMIT_INDEXES_EDEFAULT             = false;

  /**
   * The cached value of the '{@link #isOmitIndexes() <em>Omit Indexes</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOmitIndexes()
   * @generated
   * @ordered
   */
  protected boolean                 omitIndexes                       = OMIT_INDEXES_EDEFAULT;

  /**
   * This is true if the Omit Indexes attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 omitIndexesESet;

  /**
   * The default value of the '{@link #isOmitTableSpaces() <em>Omit Table Spaces</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isOmitTableSpaces()
   * @generated
   * @ordered
   */
  protected static final boolean    OMIT_TABLE_SPACES_EDEFAULT        = false;

  /**
   * The cached value of the '{@link #isOmitTableSpaces() <em>Omit Table Spaces</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isOmitTableSpaces()
   * @generated
   * @ordered
   */
  protected boolean                 omitTableSpaces                   = OMIT_TABLE_SPACES_EDEFAULT;

  /**
   * This is true if the Omit Table Spaces attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 omitTableSpacesESet;

  /**
   * The default value of the '{@link #isOmitStorage() <em>Omit Storage</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOmitStorage()
   * @generated
   * @ordered
   */
  protected static final boolean    OMIT_STORAGE_EDEFAULT             = false;

  /**
   * The cached value of the '{@link #isOmitStorage() <em>Omit Storage</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isOmitStorage()
   * @generated
   * @ordered
   */
  protected boolean                 omitStorage                       = OMIT_STORAGE_EDEFAULT;

  /**
   * This is true if the Omit Storage attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 omitStorageESet;

  /**
   * The default value of the '{@link #isPreserveColumnSequence() <em>Preserve Column Sequence</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isPreserveColumnSequence()
   * @generated
   * @ordered
   */
  protected static final boolean    PRESERVE_COLUMN_SEQUENCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPreserveColumnSequence() <em>Preserve Column Sequence</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isPreserveColumnSequence()
   * @generated
   * @ordered
   */
  protected boolean                 preserveColumnSequence            = PRESERVE_COLUMN_SEQUENCE_EDEFAULT;

  /**
   * This is true if the Preserve Column Sequence attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 preserveColumnSequenceESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected DiffOperationImpl()
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
    return ExtractDDLModulePackage.Literals.DIFF_OPERATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__EXCEPTION, oldException, newException);
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
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.DIFF_OPERATION__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.DIFF_OPERATION__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__EXCEPTION, newException, newException));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getOutputResource()
  {
    return outputResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputResource(NamedResourceDefinition newOutputResource, NotificationChain msgs)
  {
    NamedResourceDefinition oldOutputResource = outputResource;
    outputResource = newOutputResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__OUTPUT_RESOURCE, oldOutputResource, newOutputResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOutputResource(NamedResourceDefinition newOutputResource)
  {
    if (newOutputResource != outputResource)
    {
      NotificationChain msgs = null;
      if (outputResource != null)
        msgs = ((InternalEObject)outputResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.DIFF_OPERATION__OUTPUT_RESOURCE, null, msgs);
      if (newOutputResource != null)
        msgs = ((InternalEObject)newOutputResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.DIFF_OPERATION__OUTPUT_RESOURCE, null, msgs);
      msgs = basicSetOutputResource(newOutputResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__OUTPUT_RESOURCE, newOutputResource, newOutputResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDataBaseQualifier()
  {
    return dataBaseQualifier;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataBaseQualifier(ComplexValue newDataBaseQualifier, NotificationChain msgs)
  {
    ComplexValue oldDataBaseQualifier = dataBaseQualifier;
    dataBaseQualifier = newDataBaseQualifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__DATA_BASE_QUALIFIER, oldDataBaseQualifier, newDataBaseQualifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDataBaseQualifier(ComplexValue newDataBaseQualifier)
  {
    if (newDataBaseQualifier != dataBaseQualifier)
    {
      NotificationChain msgs = null;
      if (dataBaseQualifier != null)
        msgs = ((InternalEObject)dataBaseQualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.DIFF_OPERATION__DATA_BASE_QUALIFIER, null, msgs);
      if (newDataBaseQualifier != null)
        msgs = ((InternalEObject)newDataBaseQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.DIFF_OPERATION__DATA_BASE_QUALIFIER, null, msgs);
      msgs = basicSetDataBaseQualifier(newDataBaseQualifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__DATA_BASE_QUALIFIER, newDataBaseQualifier, newDataBaseQualifier));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getColumnLength()
  {
    return columnLength;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumnLength(ComplexValue newColumnLength, NotificationChain msgs)
  {
    ComplexValue oldColumnLength = columnLength;
    columnLength = newColumnLength;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__COLUMN_LENGTH, oldColumnLength, newColumnLength);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setColumnLength(ComplexValue newColumnLength)
  {
    if (newColumnLength != columnLength)
    {
      NotificationChain msgs = null;
      if (columnLength != null)
        msgs = ((InternalEObject)columnLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.DIFF_OPERATION__COLUMN_LENGTH, null, msgs);
      if (newColumnLength != null)
        msgs = ((InternalEObject)newColumnLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtractDDLModulePackage.DIFF_OPERATION__COLUMN_LENGTH, null, msgs);
      msgs = basicSetColumnLength(newColumnLength, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__COLUMN_LENGTH, newColumnLength, newColumnLength));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ComplexValueMap> getObjectMaps()
  {
    if (objectMaps == null)
    {
      objectMaps = new EObjectContainmentEList<ComplexValueMap>(ComplexValueMap.class, this, ExtractDDLModulePackage.DIFF_OPERATION__OBJECT_MAPS);
    }
    return objectMaps;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIgnoreMissing()
  {
    return ignoreMissing;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIgnoreMissing(boolean newIgnoreMissing)
  {
    boolean oldIgnoreMissing = ignoreMissing;
    ignoreMissing = newIgnoreMissing;
    boolean oldIgnoreMissingESet = ignoreMissingESet;
    ignoreMissingESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__IGNORE_MISSING, oldIgnoreMissing, ignoreMissing, !oldIgnoreMissingESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIgnoreMissing()
  {
    boolean oldIgnoreMissing = ignoreMissing;
    boolean oldIgnoreMissingESet = ignoreMissingESet;
    ignoreMissing = IGNORE_MISSING_EDEFAULT;
    ignoreMissingESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.DIFF_OPERATION__IGNORE_MISSING, oldIgnoreMissing, IGNORE_MISSING_EDEFAULT, oldIgnoreMissingESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIgnoreMissing()
  {
    return ignoreMissingESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isOmitIndexes()
  {
    return omitIndexes;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOmitIndexes(boolean newOmitIndexes)
  {
    boolean oldOmitIndexes = omitIndexes;
    omitIndexes = newOmitIndexes;
    boolean oldOmitIndexesESet = omitIndexesESet;
    omitIndexesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_INDEXES, oldOmitIndexes, omitIndexes, !oldOmitIndexesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOmitIndexes()
  {
    boolean oldOmitIndexes = omitIndexes;
    boolean oldOmitIndexesESet = omitIndexesESet;
    omitIndexes = OMIT_INDEXES_EDEFAULT;
    omitIndexesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_INDEXES, oldOmitIndexes, OMIT_INDEXES_EDEFAULT, oldOmitIndexesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOmitIndexes()
  {
    return omitIndexesESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isOmitNewlyAdded()
  {
    return omitNewlyAdded;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOmitNewlyAdded(boolean newOmitNewlyAdded)
  {
    boolean oldOmitNewlyAdded = omitNewlyAdded;
    omitNewlyAdded = newOmitNewlyAdded;
    boolean oldOmitNewlyAddedESet = omitNewlyAddedESet;
    omitNewlyAddedESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_NEWLY_ADDED, oldOmitNewlyAdded, omitNewlyAdded, !oldOmitNewlyAddedESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOmitNewlyAdded()
  {
    boolean oldOmitNewlyAdded = omitNewlyAdded;
    boolean oldOmitNewlyAddedESet = omitNewlyAddedESet;
    omitNewlyAdded = OMIT_NEWLY_ADDED_EDEFAULT;
    omitNewlyAddedESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_NEWLY_ADDED, oldOmitNewlyAdded, OMIT_NEWLY_ADDED_EDEFAULT, oldOmitNewlyAddedESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOmitNewlyAdded()
  {
    return omitNewlyAddedESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isOmitPermissions()
  {
    return omitPermissions;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOmitPermissions(boolean newOmitPermissions)
  {
    boolean oldOmitPermissions = omitPermissions;
    omitPermissions = newOmitPermissions;
    boolean oldOmitPermissionsESet = omitPermissionsESet;
    omitPermissionsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_PERMISSIONS, oldOmitPermissions, omitPermissions, !oldOmitPermissionsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOmitPermissions()
  {
    boolean oldOmitPermissions = omitPermissions;
    boolean oldOmitPermissionsESet = omitPermissionsESet;
    omitPermissions = OMIT_PERMISSIONS_EDEFAULT;
    omitPermissionsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_PERMISSIONS, oldOmitPermissions, OMIT_PERMISSIONS_EDEFAULT, oldOmitPermissionsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOmitPermissions()
  {
    return omitPermissionsESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isOmitProcedures()
  {
    return omitProcedures;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOmitProcedures(boolean newOmitProcedures)
  {
    boolean oldOmitProcedures = omitProcedures;
    omitProcedures = newOmitProcedures;
    boolean oldOmitProceduresESet = omitProceduresESet;
    omitProceduresESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_PROCEDURES, oldOmitProcedures, omitProcedures, !oldOmitProceduresESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOmitProcedures()
  {
    boolean oldOmitProcedures = omitProcedures;
    boolean oldOmitProceduresESet = omitProceduresESet;
    omitProcedures = OMIT_PROCEDURES_EDEFAULT;
    omitProceduresESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_PROCEDURES, oldOmitProcedures, OMIT_PROCEDURES_EDEFAULT, oldOmitProceduresESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOmitProcedures()
  {
    return omitProceduresESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isOmitSequences()
  {
    return omitSequences;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOmitSequences(boolean newOmitSequences)
  {
    boolean oldOmitSequences = omitSequences;
    omitSequences = newOmitSequences;
    boolean oldOmitSequencesESet = omitSequencesESet;
    omitSequencesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_SEQUENCES, oldOmitSequences, omitSequences, !oldOmitSequencesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOmitSequences()
  {
    boolean oldOmitSequences = omitSequences;
    boolean oldOmitSequencesESet = omitSequencesESet;
    omitSequences = OMIT_SEQUENCES_EDEFAULT;
    omitSequencesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_SEQUENCES, oldOmitSequences, OMIT_SEQUENCES_EDEFAULT, oldOmitSequencesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOmitSequences()
  {
    return omitSequencesESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isOmitStorage()
  {
    return omitStorage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOmitStorage(boolean newOmitStorage)
  {
    boolean oldOmitStorage = omitStorage;
    omitStorage = newOmitStorage;
    boolean oldOmitStorageESet = omitStorageESet;
    omitStorageESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_STORAGE, oldOmitStorage, omitStorage, !oldOmitStorageESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOmitStorage()
  {
    boolean oldOmitStorage = omitStorage;
    boolean oldOmitStorageESet = omitStorageESet;
    omitStorage = OMIT_STORAGE_EDEFAULT;
    omitStorageESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_STORAGE, oldOmitStorage, OMIT_STORAGE_EDEFAULT, oldOmitStorageESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOmitStorage()
  {
    return omitStorageESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isOmitTables()
  {
    return omitTables;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOmitTables(boolean newOmitTables)
  {
    boolean oldOmitTables = omitTables;
    omitTables = newOmitTables;
    boolean oldOmitTablesESet = omitTablesESet;
    omitTablesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_TABLES, oldOmitTables, omitTables, !oldOmitTablesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOmitTables()
  {
    boolean oldOmitTables = omitTables;
    boolean oldOmitTablesESet = omitTablesESet;
    omitTables = OMIT_TABLES_EDEFAULT;
    omitTablesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_TABLES, oldOmitTables, OMIT_TABLES_EDEFAULT, oldOmitTablesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOmitTables()
  {
    return omitTablesESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isOmitTableSpaces()
  {
    return omitTableSpaces;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOmitTableSpaces(boolean newOmitTableSpaces)
  {
    boolean oldOmitTableSpaces = omitTableSpaces;
    omitTableSpaces = newOmitTableSpaces;
    boolean oldOmitTableSpacesESet = omitTableSpacesESet;
    omitTableSpacesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_TABLE_SPACES, oldOmitTableSpaces, omitTableSpaces, !oldOmitTableSpacesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOmitTableSpaces()
  {
    boolean oldOmitTableSpaces = omitTableSpaces;
    boolean oldOmitTableSpacesESet = omitTableSpacesESet;
    omitTableSpaces = OMIT_TABLE_SPACES_EDEFAULT;
    omitTableSpacesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_TABLE_SPACES, oldOmitTableSpaces, OMIT_TABLE_SPACES_EDEFAULT, oldOmitTableSpacesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOmitTableSpaces()
  {
    return omitTableSpacesESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isOmitViews()
  {
    return omitViews;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOmitViews(boolean newOmitViews)
  {
    boolean oldOmitViews = omitViews;
    omitViews = newOmitViews;
    boolean oldOmitViewsESet = omitViewsESet;
    omitViewsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_VIEWS, oldOmitViews, omitViews, !oldOmitViewsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetOmitViews()
  {
    boolean oldOmitViews = omitViews;
    boolean oldOmitViewsESet = omitViewsESet;
    omitViews = OMIT_VIEWS_EDEFAULT;
    omitViewsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.DIFF_OPERATION__OMIT_VIEWS, oldOmitViews, OMIT_VIEWS_EDEFAULT, oldOmitViewsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOmitViews()
  {
    return omitViewsESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isPreserveColumnSequence()
  {
    return preserveColumnSequence;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPreserveColumnSequence(boolean newPreserveColumnSequence)
  {
    boolean oldPreserveColumnSequence = preserveColumnSequence;
    preserveColumnSequence = newPreserveColumnSequence;
    boolean oldPreserveColumnSequenceESet = preserveColumnSequenceESet;
    preserveColumnSequenceESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__PRESERVE_COLUMN_SEQUENCE, oldPreserveColumnSequence, preserveColumnSequence, !oldPreserveColumnSequenceESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetPreserveColumnSequence()
  {
    boolean oldPreserveColumnSequence = preserveColumnSequence;
    boolean oldPreserveColumnSequenceESet = preserveColumnSequenceESet;
    preserveColumnSequence = PRESERVE_COLUMN_SEQUENCE_EDEFAULT;
    preserveColumnSequenceESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.DIFF_OPERATION__PRESERVE_COLUMN_SEQUENCE, oldPreserveColumnSequence, PRESERVE_COLUMN_SEQUENCE_EDEFAULT, oldPreserveColumnSequenceESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetPreserveColumnSequence()
  {
    return preserveColumnSequenceESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isShowIdenticals()
  {
    return showIdenticals;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setShowIdenticals(boolean newShowIdenticals)
  {
    boolean oldShowIdenticals = showIdenticals;
    showIdenticals = newShowIdenticals;
    boolean oldShowIdenticalsESet = showIdenticalsESet;
    showIdenticalsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtractDDLModulePackage.DIFF_OPERATION__SHOW_IDENTICALS, oldShowIdenticals, showIdenticals, !oldShowIdenticalsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetShowIdenticals()
  {
    boolean oldShowIdenticals = showIdenticals;
    boolean oldShowIdenticalsESet = showIdenticalsESet;
    showIdenticals = SHOW_IDENTICALS_EDEFAULT;
    showIdenticalsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ExtractDDLModulePackage.DIFF_OPERATION__SHOW_IDENTICALS, oldShowIdenticals, SHOW_IDENTICALS_EDEFAULT, oldShowIdenticalsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetShowIdenticals()
  {
    return showIdenticalsESet;
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
      case ExtractDDLModulePackage.DIFF_OPERATION__EXCEPTION:
        return basicSetException(null, msgs);
      case ExtractDDLModulePackage.DIFF_OPERATION__OUTPUT_RESOURCE:
        return basicSetOutputResource(null, msgs);
      case ExtractDDLModulePackage.DIFF_OPERATION__DATA_BASE_QUALIFIER:
        return basicSetDataBaseQualifier(null, msgs);
      case ExtractDDLModulePackage.DIFF_OPERATION__COLUMN_LENGTH:
        return basicSetColumnLength(null, msgs);
      case ExtractDDLModulePackage.DIFF_OPERATION__OBJECT_MAPS:
        return ((InternalEList<?>)getObjectMaps()).basicRemove(otherEnd, msgs);
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
      case ExtractDDLModulePackage.DIFF_OPERATION__EXCEPTION:
        return getException();
      case ExtractDDLModulePackage.DIFF_OPERATION__OUTPUT_RESOURCE:
        return getOutputResource();
      case ExtractDDLModulePackage.DIFF_OPERATION__DATA_BASE_QUALIFIER:
        return getDataBaseQualifier();
      case ExtractDDLModulePackage.DIFF_OPERATION__COLUMN_LENGTH:
        return getColumnLength();
      case ExtractDDLModulePackage.DIFF_OPERATION__OBJECT_MAPS:
        return getObjectMaps();
      case ExtractDDLModulePackage.DIFF_OPERATION__IGNORE_MISSING:
        return isIgnoreMissing();
      case ExtractDDLModulePackage.DIFF_OPERATION__SHOW_IDENTICALS:
        return isShowIdenticals();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_NEWLY_ADDED:
        return isOmitNewlyAdded();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_TABLES:
        return isOmitTables();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_VIEWS:
        return isOmitViews();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_SEQUENCES:
        return isOmitSequences();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_PROCEDURES:
        return isOmitProcedures();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_PERMISSIONS:
        return isOmitPermissions();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_INDEXES:
        return isOmitIndexes();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_TABLE_SPACES:
        return isOmitTableSpaces();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_STORAGE:
        return isOmitStorage();
      case ExtractDDLModulePackage.DIFF_OPERATION__PRESERVE_COLUMN_SEQUENCE:
        return isPreserveColumnSequence();
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
      case ExtractDDLModulePackage.DIFF_OPERATION__EXCEPTION:
        setException((exception)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OUTPUT_RESOURCE:
        setOutputResource((NamedResourceDefinition)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__DATA_BASE_QUALIFIER:
        setDataBaseQualifier((ComplexValue)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__COLUMN_LENGTH:
        setColumnLength((ComplexValue)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OBJECT_MAPS:
        getObjectMaps().clear();
        getObjectMaps().addAll((Collection<? extends ComplexValueMap>)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__IGNORE_MISSING:
        setIgnoreMissing((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__SHOW_IDENTICALS:
        setShowIdenticals((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_NEWLY_ADDED:
        setOmitNewlyAdded((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_TABLES:
        setOmitTables((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_VIEWS:
        setOmitViews((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_SEQUENCES:
        setOmitSequences((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_PROCEDURES:
        setOmitProcedures((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_PERMISSIONS:
        setOmitPermissions((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_INDEXES:
        setOmitIndexes((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_TABLE_SPACES:
        setOmitTableSpaces((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_STORAGE:
        setOmitStorage((Boolean)newValue);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__PRESERVE_COLUMN_SEQUENCE:
        setPreserveColumnSequence((Boolean)newValue);
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
      case ExtractDDLModulePackage.DIFF_OPERATION__EXCEPTION:
        setException((exception)null);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OUTPUT_RESOURCE:
        setOutputResource((NamedResourceDefinition)null);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__DATA_BASE_QUALIFIER:
        setDataBaseQualifier((ComplexValue)null);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__COLUMN_LENGTH:
        setColumnLength((ComplexValue)null);
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OBJECT_MAPS:
        getObjectMaps().clear();
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__IGNORE_MISSING:
        unsetIgnoreMissing();
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__SHOW_IDENTICALS:
        unsetShowIdenticals();
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_NEWLY_ADDED:
        unsetOmitNewlyAdded();
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_TABLES:
        unsetOmitTables();
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_VIEWS:
        unsetOmitViews();
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_SEQUENCES:
        unsetOmitSequences();
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_PROCEDURES:
        unsetOmitProcedures();
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_PERMISSIONS:
        unsetOmitPermissions();
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_INDEXES:
        unsetOmitIndexes();
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_TABLE_SPACES:
        unsetOmitTableSpaces();
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_STORAGE:
        unsetOmitStorage();
        return;
      case ExtractDDLModulePackage.DIFF_OPERATION__PRESERVE_COLUMN_SEQUENCE:
        unsetPreserveColumnSequence();
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
      case ExtractDDLModulePackage.DIFF_OPERATION__EXCEPTION:
        return exception != null;
      case ExtractDDLModulePackage.DIFF_OPERATION__OUTPUT_RESOURCE:
        return outputResource != null;
      case ExtractDDLModulePackage.DIFF_OPERATION__DATA_BASE_QUALIFIER:
        return dataBaseQualifier != null;
      case ExtractDDLModulePackage.DIFF_OPERATION__COLUMN_LENGTH:
        return columnLength != null;
      case ExtractDDLModulePackage.DIFF_OPERATION__OBJECT_MAPS:
        return objectMaps != null && !objectMaps.isEmpty();
      case ExtractDDLModulePackage.DIFF_OPERATION__IGNORE_MISSING:
        return isSetIgnoreMissing();
      case ExtractDDLModulePackage.DIFF_OPERATION__SHOW_IDENTICALS:
        return isSetShowIdenticals();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_NEWLY_ADDED:
        return isSetOmitNewlyAdded();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_TABLES:
        return isSetOmitTables();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_VIEWS:
        return isSetOmitViews();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_SEQUENCES:
        return isSetOmitSequences();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_PROCEDURES:
        return isSetOmitProcedures();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_PERMISSIONS:
        return isSetOmitPermissions();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_INDEXES:
        return isSetOmitIndexes();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_TABLE_SPACES:
        return isSetOmitTableSpaces();
      case ExtractDDLModulePackage.DIFF_OPERATION__OMIT_STORAGE:
        return isSetOmitStorage();
      case ExtractDDLModulePackage.DIFF_OPERATION__PRESERVE_COLUMN_SEQUENCE:
        return isSetPreserveColumnSequence();
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
    result.append(" (ignoreMissing: ");
    if (ignoreMissingESet) result.append(ignoreMissing); else result.append("<unset>");
    result.append(", showIdenticals: ");
    if (showIdenticalsESet) result.append(showIdenticals); else result.append("<unset>");
    result.append(", omitNewlyAdded: ");
    if (omitNewlyAddedESet) result.append(omitNewlyAdded); else result.append("<unset>");
    result.append(", omitTables: ");
    if (omitTablesESet) result.append(omitTables); else result.append("<unset>");
    result.append(", omitViews: ");
    if (omitViewsESet) result.append(omitViews); else result.append("<unset>");
    result.append(", omitSequences: ");
    if (omitSequencesESet) result.append(omitSequences); else result.append("<unset>");
    result.append(", omitProcedures: ");
    if (omitProceduresESet) result.append(omitProcedures); else result.append("<unset>");
    result.append(", omitPermissions: ");
    if (omitPermissionsESet) result.append(omitPermissions); else result.append("<unset>");
    result.append(", omitIndexes: ");
    if (omitIndexesESet) result.append(omitIndexes); else result.append("<unset>");
    result.append(", omitTableSpaces: ");
    if (omitTableSpacesESet) result.append(omitTableSpaces); else result.append("<unset>");
    result.append(", omitStorage: ");
    if (omitStorageESet) result.append(omitStorage); else result.append("<unset>");
    result.append(", preserveColumnSequence: ");
    if (preserveColumnSequenceESet) result.append(preserveColumnSequence); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // DiffOperationImpl
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
