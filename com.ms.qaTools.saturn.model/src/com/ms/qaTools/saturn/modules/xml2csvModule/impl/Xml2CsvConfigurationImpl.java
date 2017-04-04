package com.ms.qaTools.saturn.modules.xml2csvModule.impl;

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

import com.ms.qaTools.saturn.modules.xml2csvModule.XPathMapping;
import com.ms.qaTools.saturn.modules.xml2csvModule.Xml2CsvConfiguration;
import com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xml2 Csv Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2CsvConfigurationImpl#getXMLFile <em>XML File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2CsvConfigurationImpl#getCSVFile <em>CSV File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2CsvConfigurationImpl#getConfigFile <em>Config File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2CsvConfigurationImpl#getNamespaceFile <em>Namespace File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2CsvConfigurationImpl#getXPathMappings <em>XPath Mappings</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2CsvConfigurationImpl#isRemoveNulls <em>Remove Nulls</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2CsvConfigurationImpl#isAddHeader <em>Add Header</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xml2csvModule.impl.Xml2CsvConfigurationImpl#isDetachNodes <em>Detach Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Xml2CsvConfigurationImpl extends EObjectImpl implements Xml2CsvConfiguration
{
  /**
   * The cached value of the '{@link #getXMLFile() <em>XML File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXMLFile()
   * @generated
   * @ordered
   */
  protected ResourceDefinition   xMLFile;

  /**
   * The cached value of the '{@link #getCSVFile() <em>CSV File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCSVFile()
   * @generated
   * @ordered
   */
  protected ResourceDefinition   cSVFile;

  /**
   * The cached value of the '{@link #getConfigFile() <em>Config File</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getConfigFile()
   * @generated
   * @ordered
   */
  protected ResourceDefinition   configFile;

  /**
   * The cached value of the '{@link #getNamespaceFile() <em>Namespace File</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getNamespaceFile()
   * @generated
   * @ordered
   */
  protected ResourceDefinition   namespaceFile;

  /**
   * The cached value of the '{@link #getXPathMappings() <em>XPath Mappings</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getXPathMappings()
   * @generated
   * @ordered
   */
  protected EList<XPathMapping>  xPathMappings;

  /**
   * The default value of the '{@link #isRemoveNulls() <em>Remove Nulls</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isRemoveNulls()
   * @generated
   * @ordered
   */
  protected static final boolean REMOVE_NULLS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRemoveNulls() <em>Remove Nulls</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isRemoveNulls()
   * @generated
   * @ordered
   */
  protected boolean              removeNulls           = REMOVE_NULLS_EDEFAULT;

  /**
   * This is true if the Remove Nulls attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              removeNullsESet;

  /**
   * The default value of the '{@link #isAddHeader() <em>Add Header</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isAddHeader()
   * @generated
   * @ordered
   */
  protected static final boolean ADD_HEADER_EDEFAULT   = true;

  /**
   * The cached value of the '{@link #isAddHeader() <em>Add Header</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isAddHeader()
   * @generated
   * @ordered
   */
  protected boolean              addHeader             = ADD_HEADER_EDEFAULT;

  /**
   * This is true if the Add Header attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              addHeaderESet;

  /**
   * The default value of the '{@link #isDetachNodes() <em>Detach Nodes</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isDetachNodes()
   * @generated
   * @ordered
   */
  protected static final boolean DETACH_NODES_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isDetachNodes() <em>Detach Nodes</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isDetachNodes()
   * @generated
   * @ordered
   */
  protected boolean              detachNodes           = DETACH_NODES_EDEFAULT;

  /**
   * This is true if the Detach Nodes attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              detachNodesESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected Xml2CsvConfigurationImpl()
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
    return Xml2csvModulePackage.Literals.XML2_CSV_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getXMLFile()
  {
    return xMLFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXMLFile(ResourceDefinition newXMLFile, NotificationChain msgs)
  {
    ResourceDefinition oldXMLFile = xMLFile;
    xMLFile = newXMLFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xml2csvModulePackage.XML2_CSV_CONFIGURATION__XML_FILE, oldXMLFile, newXMLFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setXMLFile(ResourceDefinition newXMLFile)
  {
    if (newXMLFile != xMLFile)
    {
      NotificationChain msgs = null;
      if (xMLFile != null)
        msgs = ((InternalEObject)xMLFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xml2csvModulePackage.XML2_CSV_CONFIGURATION__XML_FILE, null, msgs);
      if (newXMLFile != null)
        msgs = ((InternalEObject)newXMLFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xml2csvModulePackage.XML2_CSV_CONFIGURATION__XML_FILE, null, msgs);
      msgs = basicSetXMLFile(newXMLFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xml2csvModulePackage.XML2_CSV_CONFIGURATION__XML_FILE, newXMLFile, newXMLFile));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getCSVFile()
  {
    return cSVFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCSVFile(ResourceDefinition newCSVFile, NotificationChain msgs)
  {
    ResourceDefinition oldCSVFile = cSVFile;
    cSVFile = newCSVFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CSV_FILE, oldCSVFile, newCSVFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCSVFile(ResourceDefinition newCSVFile)
  {
    if (newCSVFile != cSVFile)
    {
      NotificationChain msgs = null;
      if (cSVFile != null)
        msgs = ((InternalEObject)cSVFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CSV_FILE, null, msgs);
      if (newCSVFile != null)
        msgs = ((InternalEObject)newCSVFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CSV_FILE, null, msgs);
      msgs = basicSetCSVFile(newCSVFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CSV_FILE, newCSVFile, newCSVFile));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getConfigFile()
  {
    return configFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfigFile(ResourceDefinition newConfigFile, NotificationChain msgs)
  {
    ResourceDefinition oldConfigFile = configFile;
    configFile = newConfigFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CONFIG_FILE, oldConfigFile, newConfigFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setConfigFile(ResourceDefinition newConfigFile)
  {
    if (newConfigFile != configFile)
    {
      NotificationChain msgs = null;
      if (configFile != null)
        msgs = ((InternalEObject)configFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CONFIG_FILE, null, msgs);
      if (newConfigFile != null)
        msgs = ((InternalEObject)newConfigFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CONFIG_FILE, null, msgs);
      msgs = basicSetConfigFile(newConfigFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CONFIG_FILE, newConfigFile, newConfigFile));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getNamespaceFile()
  {
    return namespaceFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespaceFile(ResourceDefinition newNamespaceFile, NotificationChain msgs)
  {
    ResourceDefinition oldNamespaceFile = namespaceFile;
    namespaceFile = newNamespaceFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xml2csvModulePackage.XML2_CSV_CONFIGURATION__NAMESPACE_FILE, oldNamespaceFile, newNamespaceFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNamespaceFile(ResourceDefinition newNamespaceFile)
  {
    if (newNamespaceFile != namespaceFile)
    {
      NotificationChain msgs = null;
      if (namespaceFile != null)
        msgs = ((InternalEObject)namespaceFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xml2csvModulePackage.XML2_CSV_CONFIGURATION__NAMESPACE_FILE, null, msgs);
      if (newNamespaceFile != null)
        msgs = ((InternalEObject)newNamespaceFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xml2csvModulePackage.XML2_CSV_CONFIGURATION__NAMESPACE_FILE, null, msgs);
      msgs = basicSetNamespaceFile(newNamespaceFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xml2csvModulePackage.XML2_CSV_CONFIGURATION__NAMESPACE_FILE, newNamespaceFile, newNamespaceFile));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<XPathMapping> getXPathMappings()
  {
    if (xPathMappings == null)
    {
      xPathMappings = new EObjectContainmentEList<XPathMapping>(XPathMapping.class, this, Xml2csvModulePackage.XML2_CSV_CONFIGURATION__XPATH_MAPPINGS);
    }
    return xPathMappings;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isAddHeader()
  {
    return addHeader;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAddHeader(boolean newAddHeader)
  {
    boolean oldAddHeader = addHeader;
    addHeader = newAddHeader;
    boolean oldAddHeaderESet = addHeaderESet;
    addHeaderESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xml2csvModulePackage.XML2_CSV_CONFIGURATION__ADD_HEADER, oldAddHeader, addHeader, !oldAddHeaderESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetAddHeader()
  {
    boolean oldAddHeader = addHeader;
    boolean oldAddHeaderESet = addHeaderESet;
    addHeader = ADD_HEADER_EDEFAULT;
    addHeaderESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, Xml2csvModulePackage.XML2_CSV_CONFIGURATION__ADD_HEADER, oldAddHeader, ADD_HEADER_EDEFAULT, oldAddHeaderESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAddHeader()
  {
    return addHeaderESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isDetachNodes()
  {
    return detachNodes;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDetachNodes(boolean newDetachNodes)
  {
    boolean oldDetachNodes = detachNodes;
    detachNodes = newDetachNodes;
    boolean oldDetachNodesESet = detachNodesESet;
    detachNodesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xml2csvModulePackage.XML2_CSV_CONFIGURATION__DETACH_NODES, oldDetachNodes, detachNodes, !oldDetachNodesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDetachNodes()
  {
    boolean oldDetachNodes = detachNodes;
    boolean oldDetachNodesESet = detachNodesESet;
    detachNodes = DETACH_NODES_EDEFAULT;
    detachNodesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, Xml2csvModulePackage.XML2_CSV_CONFIGURATION__DETACH_NODES, oldDetachNodes, DETACH_NODES_EDEFAULT, oldDetachNodesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDetachNodes()
  {
    return detachNodesESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isRemoveNulls()
  {
    return removeNulls;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRemoveNulls(boolean newRemoveNulls)
  {
    boolean oldRemoveNulls = removeNulls;
    removeNulls = newRemoveNulls;
    boolean oldRemoveNullsESet = removeNullsESet;
    removeNullsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Xml2csvModulePackage.XML2_CSV_CONFIGURATION__REMOVE_NULLS, oldRemoveNulls, removeNulls, !oldRemoveNullsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetRemoveNulls()
  {
    boolean oldRemoveNulls = removeNulls;
    boolean oldRemoveNullsESet = removeNullsESet;
    removeNulls = REMOVE_NULLS_EDEFAULT;
    removeNullsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, Xml2csvModulePackage.XML2_CSV_CONFIGURATION__REMOVE_NULLS, oldRemoveNulls, REMOVE_NULLS_EDEFAULT, oldRemoveNullsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetRemoveNulls()
  {
    return removeNullsESet;
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
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__XML_FILE:
        return basicSetXMLFile(null, msgs);
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CSV_FILE:
        return basicSetCSVFile(null, msgs);
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CONFIG_FILE:
        return basicSetConfigFile(null, msgs);
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__NAMESPACE_FILE:
        return basicSetNamespaceFile(null, msgs);
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__XPATH_MAPPINGS:
        return ((InternalEList<?>)getXPathMappings()).basicRemove(otherEnd, msgs);
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
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__XML_FILE:
        return getXMLFile();
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CSV_FILE:
        return getCSVFile();
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CONFIG_FILE:
        return getConfigFile();
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__NAMESPACE_FILE:
        return getNamespaceFile();
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__XPATH_MAPPINGS:
        return getXPathMappings();
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__REMOVE_NULLS:
        return isRemoveNulls();
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__ADD_HEADER:
        return isAddHeader();
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__DETACH_NODES:
        return isDetachNodes();
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
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__XML_FILE:
        setXMLFile((ResourceDefinition)newValue);
        return;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CSV_FILE:
        setCSVFile((ResourceDefinition)newValue);
        return;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CONFIG_FILE:
        setConfigFile((ResourceDefinition)newValue);
        return;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__NAMESPACE_FILE:
        setNamespaceFile((ResourceDefinition)newValue);
        return;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__XPATH_MAPPINGS:
        getXPathMappings().clear();
        getXPathMappings().addAll((Collection<? extends XPathMapping>)newValue);
        return;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__REMOVE_NULLS:
        setRemoveNulls((Boolean)newValue);
        return;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__ADD_HEADER:
        setAddHeader((Boolean)newValue);
        return;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__DETACH_NODES:
        setDetachNodes((Boolean)newValue);
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
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__XML_FILE:
        setXMLFile((ResourceDefinition)null);
        return;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CSV_FILE:
        setCSVFile((ResourceDefinition)null);
        return;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CONFIG_FILE:
        setConfigFile((ResourceDefinition)null);
        return;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__NAMESPACE_FILE:
        setNamespaceFile((ResourceDefinition)null);
        return;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__XPATH_MAPPINGS:
        getXPathMappings().clear();
        return;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__REMOVE_NULLS:
        unsetRemoveNulls();
        return;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__ADD_HEADER:
        unsetAddHeader();
        return;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__DETACH_NODES:
        unsetDetachNodes();
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
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__XML_FILE:
        return xMLFile != null;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CSV_FILE:
        return cSVFile != null;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__CONFIG_FILE:
        return configFile != null;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__NAMESPACE_FILE:
        return namespaceFile != null;
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__XPATH_MAPPINGS:
        return xPathMappings != null && !xPathMappings.isEmpty();
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__REMOVE_NULLS:
        return isSetRemoveNulls();
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__ADD_HEADER:
        return isSetAddHeader();
      case Xml2csvModulePackage.XML2_CSV_CONFIGURATION__DETACH_NODES:
        return isSetDetachNodes();
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
    result.append(" (removeNulls: ");
    if (removeNullsESet) result.append(removeNulls); else result.append("<unset>");
    result.append(", addHeader: ");
    if (addHeaderESet) result.append(addHeader); else result.append("<unset>");
    result.append(", detachNodes: ");
    if (detachNodesESet) result.append(detachNodes); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // Xml2CsvConfigurationImpl
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
