package com.ms.qaTools.saturn.modules.xmlGenModule.impl;

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

import com.ms.qaTools.saturn.modules.xmlGenModule.DataSet;
import com.ms.qaTools.saturn.modules.xmlGenModule.XmlFormatEnums;
import com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenConfiguration;
import com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xml Gen Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenConfigurationImpl#getTemplateFile <em>Template File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenConfigurationImpl#getOutputResource <em>Output Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenConfigurationImpl#getDataSets <em>Data Sets</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenConfigurationImpl#getXmlFormat <em>Xml Format</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlGenModule.impl.XmlGenConfigurationImpl#isLegacyMode <em>Legacy Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XmlGenConfigurationImpl extends EObjectImpl implements XmlGenConfiguration
{
  /**
   * The cached value of the '{@link #getTemplateFile() <em>Template File</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTemplateFile()
   * @generated
   * @ordered
   */
  protected ResourceDefinition          templateFile;

  /**
   * The cached value of the '{@link #getOutputResource() <em>Output Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOutputResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition          outputResource;

  /**
   * The cached value of the '{@link #getDataSets() <em>Data Sets</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getDataSets()
   * @generated
   * @ordered
   */
  protected EList<DataSet>              dataSets;

  /**
   * The default value of the '{@link #getXmlFormat() <em>Xml Format</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getXmlFormat()
   * @generated
   * @ordered
   */
  protected static final XmlFormatEnums XML_FORMAT_EDEFAULT  = XmlFormatEnums.ORIGINAL;

  /**
   * The cached value of the '{@link #getXmlFormat() <em>Xml Format</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getXmlFormat()
   * @generated
   * @ordered
   */
  protected XmlFormatEnums              xmlFormat            = XML_FORMAT_EDEFAULT;

  /**
   * This is true if the Xml Format attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                     xmlFormatESet;

  /**
   * The default value of the '{@link #isLegacyMode() <em>Legacy Mode</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isLegacyMode()
   * @generated
   * @ordered
   */
  protected static final boolean        LEGACY_MODE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLegacyMode() <em>Legacy Mode</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isLegacyMode()
   * @generated
   * @ordered
   */
  protected boolean                     legacyMode           = LEGACY_MODE_EDEFAULT;

  /**
   * This is true if the Legacy Mode attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                     legacyModeESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected XmlGenConfigurationImpl()
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
    return XmlGenModulePackage.Literals.XML_GEN_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getTemplateFile()
  {
    return templateFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemplateFile(ResourceDefinition newTemplateFile, NotificationChain msgs)
  {
    ResourceDefinition oldTemplateFile = templateFile;
    templateFile = newTemplateFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlGenModulePackage.XML_GEN_CONFIGURATION__TEMPLATE_FILE, oldTemplateFile, newTemplateFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTemplateFile(ResourceDefinition newTemplateFile)
  {
    if (newTemplateFile != templateFile)
    {
      NotificationChain msgs = null;
      if (templateFile != null)
        msgs = ((InternalEObject)templateFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlGenModulePackage.XML_GEN_CONFIGURATION__TEMPLATE_FILE, null, msgs);
      if (newTemplateFile != null)
        msgs = ((InternalEObject)newTemplateFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlGenModulePackage.XML_GEN_CONFIGURATION__TEMPLATE_FILE, null, msgs);
      msgs = basicSetTemplateFile(newTemplateFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlGenModulePackage.XML_GEN_CONFIGURATION__TEMPLATE_FILE, newTemplateFile, newTemplateFile));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getOutputResource()
  {
    return outputResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputResource(ResourceDefinition newOutputResource, NotificationChain msgs)
  {
    ResourceDefinition oldOutputResource = outputResource;
    outputResource = newOutputResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlGenModulePackage.XML_GEN_CONFIGURATION__OUTPUT_RESOURCE, oldOutputResource, newOutputResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOutputResource(ResourceDefinition newOutputResource)
  {
    if (newOutputResource != outputResource)
    {
      NotificationChain msgs = null;
      if (outputResource != null)
        msgs = ((InternalEObject)outputResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlGenModulePackage.XML_GEN_CONFIGURATION__OUTPUT_RESOURCE, null, msgs);
      if (newOutputResource != null)
        msgs = ((InternalEObject)newOutputResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlGenModulePackage.XML_GEN_CONFIGURATION__OUTPUT_RESOURCE, null, msgs);
      msgs = basicSetOutputResource(newOutputResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlGenModulePackage.XML_GEN_CONFIGURATION__OUTPUT_RESOURCE, newOutputResource, newOutputResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<DataSet> getDataSets()
  {
    if (dataSets == null)
    {
      dataSets = new EObjectContainmentEList<DataSet>(DataSet.class, this, XmlGenModulePackage.XML_GEN_CONFIGURATION__DATA_SETS);
    }
    return dataSets;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isLegacyMode()
  {
    return legacyMode;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setLegacyMode(boolean newLegacyMode)
  {
    boolean oldLegacyMode = legacyMode;
    legacyMode = newLegacyMode;
    boolean oldLegacyModeESet = legacyModeESet;
    legacyModeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlGenModulePackage.XML_GEN_CONFIGURATION__LEGACY_MODE, oldLegacyMode, legacyMode, !oldLegacyModeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetLegacyMode()
  {
    boolean oldLegacyMode = legacyMode;
    boolean oldLegacyModeESet = legacyModeESet;
    legacyMode = LEGACY_MODE_EDEFAULT;
    legacyModeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XmlGenModulePackage.XML_GEN_CONFIGURATION__LEGACY_MODE, oldLegacyMode, LEGACY_MODE_EDEFAULT, oldLegacyModeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetLegacyMode()
  {
    return legacyModeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlFormatEnums getXmlFormat()
  {
    return xmlFormat;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setXmlFormat(XmlFormatEnums newXmlFormat)
  {
    XmlFormatEnums oldXmlFormat = xmlFormat;
    xmlFormat = newXmlFormat == null ? XML_FORMAT_EDEFAULT : newXmlFormat;
    boolean oldXmlFormatESet = xmlFormatESet;
    xmlFormatESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlGenModulePackage.XML_GEN_CONFIGURATION__XML_FORMAT, oldXmlFormat, xmlFormat, !oldXmlFormatESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetXmlFormat()
  {
    XmlFormatEnums oldXmlFormat = xmlFormat;
    boolean oldXmlFormatESet = xmlFormatESet;
    xmlFormat = XML_FORMAT_EDEFAULT;
    xmlFormatESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XmlGenModulePackage.XML_GEN_CONFIGURATION__XML_FORMAT, oldXmlFormat, XML_FORMAT_EDEFAULT, oldXmlFormatESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetXmlFormat()
  {
    return xmlFormatESet;
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
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__TEMPLATE_FILE:
        return basicSetTemplateFile(null, msgs);
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__OUTPUT_RESOURCE:
        return basicSetOutputResource(null, msgs);
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__DATA_SETS:
        return ((InternalEList<?>)getDataSets()).basicRemove(otherEnd, msgs);
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
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__TEMPLATE_FILE:
        return getTemplateFile();
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__OUTPUT_RESOURCE:
        return getOutputResource();
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__DATA_SETS:
        return getDataSets();
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__XML_FORMAT:
        return getXmlFormat();
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__LEGACY_MODE:
        return isLegacyMode();
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
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__TEMPLATE_FILE:
        setTemplateFile((ResourceDefinition)newValue);
        return;
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__OUTPUT_RESOURCE:
        setOutputResource((ResourceDefinition)newValue);
        return;
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__DATA_SETS:
        getDataSets().clear();
        getDataSets().addAll((Collection<? extends DataSet>)newValue);
        return;
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__XML_FORMAT:
        setXmlFormat((XmlFormatEnums)newValue);
        return;
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__LEGACY_MODE:
        setLegacyMode((Boolean)newValue);
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
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__TEMPLATE_FILE:
        setTemplateFile((ResourceDefinition)null);
        return;
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__OUTPUT_RESOURCE:
        setOutputResource((ResourceDefinition)null);
        return;
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__DATA_SETS:
        getDataSets().clear();
        return;
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__XML_FORMAT:
        unsetXmlFormat();
        return;
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__LEGACY_MODE:
        unsetLegacyMode();
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
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__TEMPLATE_FILE:
        return templateFile != null;
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__OUTPUT_RESOURCE:
        return outputResource != null;
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__DATA_SETS:
        return dataSets != null && !dataSets.isEmpty();
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__XML_FORMAT:
        return isSetXmlFormat();
      case XmlGenModulePackage.XML_GEN_CONFIGURATION__LEGACY_MODE:
        return isSetLegacyMode();
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
    result.append(" (xmlFormat: ");
    if (xmlFormatESet) result.append(xmlFormat); else result.append("<unset>");
    result.append(", legacyMode: ");
    if (legacyModeESet) result.append(legacyMode); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // XmlGenConfigurationImpl
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
