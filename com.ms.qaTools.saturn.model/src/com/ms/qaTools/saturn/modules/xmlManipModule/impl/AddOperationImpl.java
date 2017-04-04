package com.ms.qaTools.saturn.modules.xmlManipModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.modules.xmlManipModule.AddOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Add Operation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.AddOperationImpl#getParentNodeName <em>Parent Node Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.AddOperationImpl#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.AddOperationImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.AddOperationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.AddOperationImpl#isIsAttribute <em>Is Attribute</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.AddOperationImpl#isIsXml <em>Is Xml</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.AddOperationImpl#isIsCData <em>Is CData</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddOperationImpl extends AbstractOperationImpl implements AddOperation
{
  /**
   * The cached value of the '{@link #getParentNodeName() <em>Parent Node Name</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getParentNodeName()
   * @generated
   * @ordered
   */
  protected ComplexValue         parentNodeName;

  /**
   * The cached value of the '{@link #getNodeName() <em>Node Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeName()
   * @generated
   * @ordered
   */
  protected ComplexValue         nodeName;

  /**
   * The cached value of the '{@link #getUri() <em>Uri</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
  protected ComplexValue         uri;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ComplexValue         value;

  /**
   * The default value of the '{@link #isIsAttribute() <em>Is Attribute</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIsAttribute()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ATTRIBUTE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAttribute() <em>Is Attribute</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIsAttribute()
   * @generated
   * @ordered
   */
  protected boolean              isAttribute           = IS_ATTRIBUTE_EDEFAULT;

  /**
   * This is true if the Is Attribute attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              isAttributeESet;

  /**
   * The default value of the '{@link #isIsXml() <em>Is Xml</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isIsXml()
   * @generated
   * @ordered
   */
  protected static final boolean IS_XML_EDEFAULT       = false;

  /**
   * The cached value of the '{@link #isIsXml() <em>Is Xml</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isIsXml()
   * @generated
   * @ordered
   */
  protected boolean              isXml                 = IS_XML_EDEFAULT;

  /**
   * This is true if the Is Xml attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              isXmlESet;

  /**
   * The default value of the '{@link #isIsCData() <em>Is CData</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIsCData()
   * @generated
   * @ordered
   */
  protected static final boolean IS_CDATA_EDEFAULT     = false;

  /**
   * The cached value of the '{@link #isIsCData() <em>Is CData</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isIsCData()
   * @generated
   * @ordered
   */
  protected boolean              isCData               = IS_CDATA_EDEFAULT;

  /**
   * This is true if the Is CData attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              isCDataESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected AddOperationImpl()
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
    return XmlManipModulePackage.Literals.ADD_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getParentNodeName()
  {
    return parentNodeName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentNodeName(ComplexValue newParentNodeName, NotificationChain msgs)
  {
    ComplexValue oldParentNodeName = parentNodeName;
    parentNodeName = newParentNodeName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.ADD_OPERATION__PARENT_NODE_NAME, oldParentNodeName, newParentNodeName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setParentNodeName(ComplexValue newParentNodeName)
  {
    if (newParentNodeName != parentNodeName)
    {
      NotificationChain msgs = null;
      if (parentNodeName != null)
        msgs = ((InternalEObject)parentNodeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.ADD_OPERATION__PARENT_NODE_NAME, null, msgs);
      if (newParentNodeName != null)
        msgs = ((InternalEObject)newParentNodeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.ADD_OPERATION__PARENT_NODE_NAME, null, msgs);
      msgs = basicSetParentNodeName(newParentNodeName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.ADD_OPERATION__PARENT_NODE_NAME, newParentNodeName, newParentNodeName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getNodeName()
  {
    return nodeName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodeName(ComplexValue newNodeName, NotificationChain msgs)
  {
    ComplexValue oldNodeName = nodeName;
    nodeName = newNodeName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.ADD_OPERATION__NODE_NAME, oldNodeName, newNodeName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNodeName(ComplexValue newNodeName)
  {
    if (newNodeName != nodeName)
    {
      NotificationChain msgs = null;
      if (nodeName != null)
        msgs = ((InternalEObject)nodeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.ADD_OPERATION__NODE_NAME, null, msgs);
      if (newNodeName != null)
        msgs = ((InternalEObject)newNodeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.ADD_OPERATION__NODE_NAME, null, msgs);
      msgs = basicSetNodeName(newNodeName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.ADD_OPERATION__NODE_NAME, newNodeName, newNodeName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getUri()
  {
    return uri;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUri(ComplexValue newUri, NotificationChain msgs)
  {
    ComplexValue oldUri = uri;
    uri = newUri;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.ADD_OPERATION__URI, oldUri, newUri);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setUri(ComplexValue newUri)
  {
    if (newUri != uri)
    {
      NotificationChain msgs = null;
      if (uri != null)
        msgs = ((InternalEObject)uri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.ADD_OPERATION__URI, null, msgs);
      if (newUri != null)
        msgs = ((InternalEObject)newUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.ADD_OPERATION__URI, null, msgs);
      msgs = basicSetUri(newUri, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.ADD_OPERATION__URI, newUri, newUri));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(ComplexValue newValue, NotificationChain msgs)
  {
    ComplexValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.ADD_OPERATION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setValue(ComplexValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.ADD_OPERATION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.ADD_OPERATION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.ADD_OPERATION__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAttribute()
  {
    return isAttribute;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIsAttribute(boolean newIsAttribute)
  {
    boolean oldIsAttribute = isAttribute;
    isAttribute = newIsAttribute;
    boolean oldIsAttributeESet = isAttributeESet;
    isAttributeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.ADD_OPERATION__IS_ATTRIBUTE, oldIsAttribute, isAttribute, !oldIsAttributeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIsAttribute()
  {
    boolean oldIsAttribute = isAttribute;
    boolean oldIsAttributeESet = isAttributeESet;
    isAttribute = IS_ATTRIBUTE_EDEFAULT;
    isAttributeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XmlManipModulePackage.ADD_OPERATION__IS_ATTRIBUTE, oldIsAttribute, IS_ATTRIBUTE_EDEFAULT, oldIsAttributeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIsAttribute()
  {
    return isAttributeESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsCData()
  {
    return isCData;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIsCData(boolean newIsCData)
  {
    boolean oldIsCData = isCData;
    isCData = newIsCData;
    boolean oldIsCDataESet = isCDataESet;
    isCDataESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.ADD_OPERATION__IS_CDATA, oldIsCData, isCData, !oldIsCDataESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIsCData()
  {
    boolean oldIsCData = isCData;
    boolean oldIsCDataESet = isCDataESet;
    isCData = IS_CDATA_EDEFAULT;
    isCDataESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XmlManipModulePackage.ADD_OPERATION__IS_CDATA, oldIsCData, IS_CDATA_EDEFAULT, oldIsCDataESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIsCData()
  {
    return isCDataESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsXml()
  {
    return isXml;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIsXml(boolean newIsXml)
  {
    boolean oldIsXml = isXml;
    isXml = newIsXml;
    boolean oldIsXmlESet = isXmlESet;
    isXmlESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.ADD_OPERATION__IS_XML, oldIsXml, isXml, !oldIsXmlESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetIsXml()
  {
    boolean oldIsXml = isXml;
    boolean oldIsXmlESet = isXmlESet;
    isXml = IS_XML_EDEFAULT;
    isXmlESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XmlManipModulePackage.ADD_OPERATION__IS_XML, oldIsXml, IS_XML_EDEFAULT, oldIsXmlESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIsXml()
  {
    return isXmlESet;
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
      case XmlManipModulePackage.ADD_OPERATION__PARENT_NODE_NAME:
        return basicSetParentNodeName(null, msgs);
      case XmlManipModulePackage.ADD_OPERATION__NODE_NAME:
        return basicSetNodeName(null, msgs);
      case XmlManipModulePackage.ADD_OPERATION__URI:
        return basicSetUri(null, msgs);
      case XmlManipModulePackage.ADD_OPERATION__VALUE:
        return basicSetValue(null, msgs);
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
      case XmlManipModulePackage.ADD_OPERATION__PARENT_NODE_NAME:
        return getParentNodeName();
      case XmlManipModulePackage.ADD_OPERATION__NODE_NAME:
        return getNodeName();
      case XmlManipModulePackage.ADD_OPERATION__URI:
        return getUri();
      case XmlManipModulePackage.ADD_OPERATION__VALUE:
        return getValue();
      case XmlManipModulePackage.ADD_OPERATION__IS_ATTRIBUTE:
        return isIsAttribute();
      case XmlManipModulePackage.ADD_OPERATION__IS_XML:
        return isIsXml();
      case XmlManipModulePackage.ADD_OPERATION__IS_CDATA:
        return isIsCData();
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
      case XmlManipModulePackage.ADD_OPERATION__PARENT_NODE_NAME:
        setParentNodeName((ComplexValue)newValue);
        return;
      case XmlManipModulePackage.ADD_OPERATION__NODE_NAME:
        setNodeName((ComplexValue)newValue);
        return;
      case XmlManipModulePackage.ADD_OPERATION__URI:
        setUri((ComplexValue)newValue);
        return;
      case XmlManipModulePackage.ADD_OPERATION__VALUE:
        setValue((ComplexValue)newValue);
        return;
      case XmlManipModulePackage.ADD_OPERATION__IS_ATTRIBUTE:
        setIsAttribute((Boolean)newValue);
        return;
      case XmlManipModulePackage.ADD_OPERATION__IS_XML:
        setIsXml((Boolean)newValue);
        return;
      case XmlManipModulePackage.ADD_OPERATION__IS_CDATA:
        setIsCData((Boolean)newValue);
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
      case XmlManipModulePackage.ADD_OPERATION__PARENT_NODE_NAME:
        setParentNodeName((ComplexValue)null);
        return;
      case XmlManipModulePackage.ADD_OPERATION__NODE_NAME:
        setNodeName((ComplexValue)null);
        return;
      case XmlManipModulePackage.ADD_OPERATION__URI:
        setUri((ComplexValue)null);
        return;
      case XmlManipModulePackage.ADD_OPERATION__VALUE:
        setValue((ComplexValue)null);
        return;
      case XmlManipModulePackage.ADD_OPERATION__IS_ATTRIBUTE:
        unsetIsAttribute();
        return;
      case XmlManipModulePackage.ADD_OPERATION__IS_XML:
        unsetIsXml();
        return;
      case XmlManipModulePackage.ADD_OPERATION__IS_CDATA:
        unsetIsCData();
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
      case XmlManipModulePackage.ADD_OPERATION__PARENT_NODE_NAME:
        return parentNodeName != null;
      case XmlManipModulePackage.ADD_OPERATION__NODE_NAME:
        return nodeName != null;
      case XmlManipModulePackage.ADD_OPERATION__URI:
        return uri != null;
      case XmlManipModulePackage.ADD_OPERATION__VALUE:
        return value != null;
      case XmlManipModulePackage.ADD_OPERATION__IS_ATTRIBUTE:
        return isSetIsAttribute();
      case XmlManipModulePackage.ADD_OPERATION__IS_XML:
        return isSetIsXml();
      case XmlManipModulePackage.ADD_OPERATION__IS_CDATA:
        return isSetIsCData();
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
    result.append(" (isAttribute: ");
    if (isAttributeESet) result.append(isAttribute); else result.append("<unset>");
    result.append(", isXml: ");
    if (isXmlESet) result.append(isXml); else result.append("<unset>");
    result.append(", isCData: ");
    if (isCDataESet) result.append(isCData); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // AddOperationImpl
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
