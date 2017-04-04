/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 *
 * $Id$
 */
package com.ms.qaTools.saturn.modules.xmlDiffModule.impl;

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

import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffColumn;
import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffConfiguration;
import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage;
import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffNamespace;
import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffObject;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xml Diff Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffConfigurationImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffConfigurationImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffConfigurationImpl#getDocumentKeys <em>Document Keys</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffConfigurationImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffConfigurationImpl#getLeftFile <em>Left File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffConfigurationImpl#getRightFile <em>Right File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffConfigurationImpl#getOutResource <em>Out Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffConfigurationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffConfigurationImpl#isFailOnValidation <em>Fail On Validation</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffConfigurationImpl#isIgnoreInLeftOnly <em>Ignore In Left Only</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlDiffModule.impl.XmlDiffConfigurationImpl#isIgnoreInRightOnly <em>Ignore In Right Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XmlDiffConfigurationImpl extends EObjectImpl implements XmlDiffConfiguration
{
  /**
   * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getObjects()
   * @generated
   * @ordered
   */
  protected EList<XmlDiffObject>    objects;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<XmlDiffColumn>    columns;

  /**
   * The cached value of the '{@link #getDocumentKeys() <em>Document Keys</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDocumentKeys()
   * @generated
   * @ordered
   */
  protected EList<XmlDiffColumn>    documentKeys;

  /**
   * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getNamespaces()
   * @generated
   * @ordered
   */
  protected EList<XmlDiffNamespace> namespaces;

  /**
   * The cached value of the '{@link #getLeftFile() <em>Left File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftFile()
   * @generated
   * @ordered
   */
  protected ResourceDefinition      leftFile;

  /**
   * The cached value of the '{@link #getRightFile() <em>Right File</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getRightFile()
   * @generated
   * @ordered
   */
  protected ResourceDefinition      rightFile;

  /**
   * The cached value of the '{@link #getOutResource() <em>Out Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOutResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition      outResource;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected ComplexValue            description;

  /**
   * The default value of the '{@link #isFailOnValidation() <em>Fail On Validation</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isFailOnValidation()
   * @generated
   * @ordered
   */
  protected static final boolean    FAIL_ON_VALIDATION_EDEFAULT   = true;

  /**
   * The cached value of the '{@link #isFailOnValidation() <em>Fail On Validation</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isFailOnValidation()
   * @generated
   * @ordered
   */
  protected boolean                 failOnValidation              = FAIL_ON_VALIDATION_EDEFAULT;

  /**
   * This is true if the Fail On Validation attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 failOnValidationESet;

  /**
   * The default value of the '{@link #isIgnoreInLeftOnly() <em>Ignore In Left Only</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isIgnoreInLeftOnly()
   * @generated
   * @ordered
   */
  protected static final boolean    IGNORE_IN_LEFT_ONLY_EDEFAULT  = false;

  /**
   * The cached value of the '{@link #isIgnoreInLeftOnly() <em>Ignore In Left Only</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #isIgnoreInLeftOnly()
   * @generated
   * @ordered
   */
  protected boolean                 ignoreInLeftOnly              = IGNORE_IN_LEFT_ONLY_EDEFAULT;

  /**
   * This is true if the Ignore In Left Only attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 ignoreInLeftOnlyESet;

  /**
   * The default value of the '{@link #isIgnoreInRightOnly() <em>Ignore In Right Only</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isIgnoreInRightOnly()
   * @generated
   * @ordered
   */
  protected static final boolean    IGNORE_IN_RIGHT_ONLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIgnoreInRightOnly() <em>Ignore In Right Only</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isIgnoreInRightOnly()
   * @generated
   * @ordered
   */
  protected boolean                 ignoreInRightOnly             = IGNORE_IN_RIGHT_ONLY_EDEFAULT;

  /**
   * This is true if the Ignore In Right Only attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                 ignoreInRightOnlyESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected XmlDiffConfigurationImpl()
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
    return XmlDiffModulePackage.Literals.XML_DIFF_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<XmlDiffObject> getObjects()
  {
    if (objects == null)
    {
      objects = new EObjectContainmentEList<XmlDiffObject>(XmlDiffObject.class, this, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__OBJECTS);
    }
    return objects;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<XmlDiffColumn> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<XmlDiffColumn>(XmlDiffColumn.class, this, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<XmlDiffColumn> getDocumentKeys()
  {
    if (documentKeys == null)
    {
      documentKeys = new EObjectContainmentEList<XmlDiffColumn>(XmlDiffColumn.class, this, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__DOCUMENT_KEYS);
    }
    return documentKeys;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<XmlDiffNamespace> getNamespaces()
  {
    if (namespaces == null)
    {
      namespaces = new EObjectContainmentEList<XmlDiffNamespace>(XmlDiffNamespace.class, this, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__NAMESPACES);
    }
    return namespaces;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getLeftFile()
  {
    return leftFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftFile(ResourceDefinition newLeftFile, NotificationChain msgs)
  {
    ResourceDefinition oldLeftFile = leftFile;
    leftFile = newLeftFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__LEFT_FILE, oldLeftFile, newLeftFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setLeftFile(ResourceDefinition newLeftFile)
  {
    if (newLeftFile != leftFile)
    {
      NotificationChain msgs = null;
      if (leftFile != null)
        msgs = ((InternalEObject)leftFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlDiffModulePackage.XML_DIFF_CONFIGURATION__LEFT_FILE, null, msgs);
      if (newLeftFile != null)
        msgs = ((InternalEObject)newLeftFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlDiffModulePackage.XML_DIFF_CONFIGURATION__LEFT_FILE, null, msgs);
      msgs = basicSetLeftFile(newLeftFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__LEFT_FILE, newLeftFile, newLeftFile));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getRightFile()
  {
    return rightFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightFile(ResourceDefinition newRightFile, NotificationChain msgs)
  {
    ResourceDefinition oldRightFile = rightFile;
    rightFile = newRightFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__RIGHT_FILE, oldRightFile, newRightFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRightFile(ResourceDefinition newRightFile)
  {
    if (newRightFile != rightFile)
    {
      NotificationChain msgs = null;
      if (rightFile != null)
        msgs = ((InternalEObject)rightFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlDiffModulePackage.XML_DIFF_CONFIGURATION__RIGHT_FILE, null, msgs);
      if (newRightFile != null)
        msgs = ((InternalEObject)newRightFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlDiffModulePackage.XML_DIFF_CONFIGURATION__RIGHT_FILE, null, msgs);
      msgs = basicSetRightFile(newRightFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__RIGHT_FILE, newRightFile, newRightFile));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getOutResource()
  {
    return outResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutResource(ResourceDefinition newOutResource, NotificationChain msgs)
  {
    ResourceDefinition oldOutResource = outResource;
    outResource = newOutResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__OUT_RESOURCE, oldOutResource, newOutResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOutResource(ResourceDefinition newOutResource)
  {
    if (newOutResource != outResource)
    {
      NotificationChain msgs = null;
      if (outResource != null)
        msgs = ((InternalEObject)outResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlDiffModulePackage.XML_DIFF_CONFIGURATION__OUT_RESOURCE, null, msgs);
      if (newOutResource != null)
        msgs = ((InternalEObject)newOutResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlDiffModulePackage.XML_DIFF_CONFIGURATION__OUT_RESOURCE, null, msgs);
      msgs = basicSetOutResource(newOutResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__OUT_RESOURCE, newOutResource, newOutResource));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__DESCRIPTION, oldDescription, newDescription);
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
        msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlDiffModulePackage.XML_DIFF_CONFIGURATION__DESCRIPTION, null, msgs);
      if (newDescription != null)
        msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlDiffModulePackage.XML_DIFF_CONFIGURATION__DESCRIPTION, null, msgs);
      msgs = basicSetDescription(newDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__DESCRIPTION, newDescription, newDescription));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isFailOnValidation()
  {
    return failOnValidation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setFailOnValidation(boolean newFailOnValidation)
  {
    boolean oldFailOnValidation = failOnValidation;
    failOnValidation = newFailOnValidation;
    boolean oldFailOnValidationESet = failOnValidationESet;
    failOnValidationESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__FAIL_ON_VALIDATION, oldFailOnValidation, failOnValidation, !oldFailOnValidationESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetFailOnValidation()
  {
    boolean oldFailOnValidation = failOnValidation;
    boolean oldFailOnValidationESet = failOnValidationESet;
    failOnValidation = FAIL_ON_VALIDATION_EDEFAULT;
    failOnValidationESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__FAIL_ON_VALIDATION, oldFailOnValidation, FAIL_ON_VALIDATION_EDEFAULT, oldFailOnValidationESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetFailOnValidation()
  {
    return failOnValidationESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIgnoreInLeftOnly()
  {
    return ignoreInLeftOnly;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIgnoreInLeftOnly(boolean newIgnoreInLeftOnly)
  {
    boolean oldIgnoreInLeftOnly = ignoreInLeftOnly;
    ignoreInLeftOnly = newIgnoreInLeftOnly;
    boolean oldIgnoreInLeftOnlyESet = ignoreInLeftOnlyESet;
    ignoreInLeftOnlyESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__IGNORE_IN_LEFT_ONLY, oldIgnoreInLeftOnly, ignoreInLeftOnly, !oldIgnoreInLeftOnlyESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIgnoreInLeftOnly()
  {
    boolean oldIgnoreInLeftOnly = ignoreInLeftOnly;
    boolean oldIgnoreInLeftOnlyESet = ignoreInLeftOnlyESet;
    ignoreInLeftOnly = IGNORE_IN_LEFT_ONLY_EDEFAULT;
    ignoreInLeftOnlyESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__IGNORE_IN_LEFT_ONLY, oldIgnoreInLeftOnly, IGNORE_IN_LEFT_ONLY_EDEFAULT, oldIgnoreInLeftOnlyESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIgnoreInLeftOnly()
  {
    return ignoreInLeftOnlyESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIgnoreInRightOnly()
  {
    return ignoreInRightOnly;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIgnoreInRightOnly(boolean newIgnoreInRightOnly)
  {
    boolean oldIgnoreInRightOnly = ignoreInRightOnly;
    ignoreInRightOnly = newIgnoreInRightOnly;
    boolean oldIgnoreInRightOnlyESet = ignoreInRightOnlyESet;
    ignoreInRightOnlyESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__IGNORE_IN_RIGHT_ONLY, oldIgnoreInRightOnly, ignoreInRightOnly, !oldIgnoreInRightOnlyESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIgnoreInRightOnly()
  {
    boolean oldIgnoreInRightOnly = ignoreInRightOnly;
    boolean oldIgnoreInRightOnlyESet = ignoreInRightOnlyESet;
    ignoreInRightOnly = IGNORE_IN_RIGHT_ONLY_EDEFAULT;
    ignoreInRightOnlyESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XmlDiffModulePackage.XML_DIFF_CONFIGURATION__IGNORE_IN_RIGHT_ONLY, oldIgnoreInRightOnly, IGNORE_IN_RIGHT_ONLY_EDEFAULT, oldIgnoreInRightOnlyESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIgnoreInRightOnly()
  {
    return ignoreInRightOnlyESet;
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
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__OBJECTS:
        return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__DOCUMENT_KEYS:
        return ((InternalEList<?>)getDocumentKeys()).basicRemove(otherEnd, msgs);
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__NAMESPACES:
        return ((InternalEList<?>)getNamespaces()).basicRemove(otherEnd, msgs);
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__LEFT_FILE:
        return basicSetLeftFile(null, msgs);
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__RIGHT_FILE:
        return basicSetRightFile(null, msgs);
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__OUT_RESOURCE:
        return basicSetOutResource(null, msgs);
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__DESCRIPTION:
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
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__OBJECTS:
        return getObjects();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__COLUMNS:
        return getColumns();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__DOCUMENT_KEYS:
        return getDocumentKeys();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__NAMESPACES:
        return getNamespaces();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__LEFT_FILE:
        return getLeftFile();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__RIGHT_FILE:
        return getRightFile();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__OUT_RESOURCE:
        return getOutResource();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__DESCRIPTION:
        return getDescription();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__FAIL_ON_VALIDATION:
        return isFailOnValidation();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__IGNORE_IN_LEFT_ONLY:
        return isIgnoreInLeftOnly();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__IGNORE_IN_RIGHT_ONLY:
        return isIgnoreInRightOnly();
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
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__OBJECTS:
        getObjects().clear();
        getObjects().addAll((Collection<? extends XmlDiffObject>)newValue);
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends XmlDiffColumn>)newValue);
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__DOCUMENT_KEYS:
        getDocumentKeys().clear();
        getDocumentKeys().addAll((Collection<? extends XmlDiffColumn>)newValue);
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__NAMESPACES:
        getNamespaces().clear();
        getNamespaces().addAll((Collection<? extends XmlDiffNamespace>)newValue);
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__LEFT_FILE:
        setLeftFile((ResourceDefinition)newValue);
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__RIGHT_FILE:
        setRightFile((ResourceDefinition)newValue);
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__OUT_RESOURCE:
        setOutResource((ResourceDefinition)newValue);
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__DESCRIPTION:
        setDescription((ComplexValue)newValue);
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__FAIL_ON_VALIDATION:
        setFailOnValidation((Boolean)newValue);
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__IGNORE_IN_LEFT_ONLY:
        setIgnoreInLeftOnly((Boolean)newValue);
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__IGNORE_IN_RIGHT_ONLY:
        setIgnoreInRightOnly((Boolean)newValue);
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
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__OBJECTS:
        getObjects().clear();
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__COLUMNS:
        getColumns().clear();
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__DOCUMENT_KEYS:
        getDocumentKeys().clear();
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__NAMESPACES:
        getNamespaces().clear();
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__LEFT_FILE:
        setLeftFile((ResourceDefinition)null);
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__RIGHT_FILE:
        setRightFile((ResourceDefinition)null);
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__OUT_RESOURCE:
        setOutResource((ResourceDefinition)null);
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__DESCRIPTION:
        setDescription((ComplexValue)null);
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__FAIL_ON_VALIDATION:
        unsetFailOnValidation();
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__IGNORE_IN_LEFT_ONLY:
        unsetIgnoreInLeftOnly();
        return;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__IGNORE_IN_RIGHT_ONLY:
        unsetIgnoreInRightOnly();
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
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__OBJECTS:
        return objects != null && !objects.isEmpty();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__COLUMNS:
        return columns != null && !columns.isEmpty();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__DOCUMENT_KEYS:
        return documentKeys != null && !documentKeys.isEmpty();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__NAMESPACES:
        return namespaces != null && !namespaces.isEmpty();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__LEFT_FILE:
        return leftFile != null;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__RIGHT_FILE:
        return rightFile != null;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__OUT_RESOURCE:
        return outResource != null;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__DESCRIPTION:
        return description != null;
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__FAIL_ON_VALIDATION:
        return isSetFailOnValidation();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__IGNORE_IN_LEFT_ONLY:
        return isSetIgnoreInLeftOnly();
      case XmlDiffModulePackage.XML_DIFF_CONFIGURATION__IGNORE_IN_RIGHT_ONLY:
        return isSetIgnoreInRightOnly();
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
    result.append(" (failOnValidation: ");
    if (failOnValidationESet) result.append(failOnValidation); else result.append("<unset>");
    result.append(", ignoreInLeftOnly: ");
    if (ignoreInLeftOnlyESet) result.append(ignoreInLeftOnly); else result.append("<unset>");
    result.append(", ignoreInRightOnly: ");
    if (ignoreInRightOnlyESet) result.append(ignoreInRightOnly); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // XmlDiffConfigurationImpl
