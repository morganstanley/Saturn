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
package com.ms.qaTools.saturn.modules.cpsModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.modules.cpsModule.CpsModulePackage;
import com.ms.qaTools.saturn.modules.cpsModule.CpsPutOperation;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Cps Put Operation</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsPutOperationImpl#getInput <em>Input</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsPutOperationImpl#getTopic <em>Topic</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsPutOperationImpl#isIsXml <em>Is Xml</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.cpsModule.impl.CpsPutOperationImpl#isPersistent <em>Persistent</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CpsPutOperationImpl extends AbstractCpsOperationImpl implements CpsPutOperation
{
  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected ResourceDefinition   input;

  /**
   * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getTopic()
   * @generated
   * @ordered
   */
  protected ComplexValue         topic;

  /**
   * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isPersistent()
   * @generated
   * @ordered
   */
  protected static final boolean PERSISTENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isPersistent()
   * @generated
   * @ordered
   */
  protected boolean              persistent          = PERSISTENT_EDEFAULT;

  /**
   * This is true if the Persistent attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              persistentESet;

  /**
   * The default value of the '{@link #isIsXml() <em>Is Xml</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isIsXml()
   * @generated
   * @ordered
   */
  protected static final boolean IS_XML_EDEFAULT     = true;

  /**
   * The cached value of the '{@link #isIsXml() <em>Is Xml</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isIsXml()
   * @generated
   * @ordered
   */
  protected boolean              isXml               = IS_XML_EDEFAULT;

  /**
   * This is true if the Is Xml attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              isXmlESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected CpsPutOperationImpl()
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
    return CpsModulePackage.Literals.CPS_PUT_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(ResourceDefinition newInput, NotificationChain msgs)
  {
    ResourceDefinition oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpsModulePackage.CPS_PUT_OPERATION__INPUT, oldInput, newInput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInput(ResourceDefinition newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpsModulePackage.CPS_PUT_OPERATION__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpsModulePackage.CPS_PUT_OPERATION__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CpsModulePackage.CPS_PUT_OPERATION__INPUT, newInput, newInput));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getTopic()
  {
    return topic;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTopic(ComplexValue newTopic, NotificationChain msgs)
  {
    ComplexValue oldTopic = topic;
    topic = newTopic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpsModulePackage.CPS_PUT_OPERATION__TOPIC, oldTopic, newTopic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTopic(ComplexValue newTopic)
  {
    if (newTopic != topic)
    {
      NotificationChain msgs = null;
      if (topic != null)
        msgs = ((InternalEObject)topic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpsModulePackage.CPS_PUT_OPERATION__TOPIC, null, msgs);
      if (newTopic != null)
        msgs = ((InternalEObject)newTopic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpsModulePackage.CPS_PUT_OPERATION__TOPIC, null, msgs);
      msgs = basicSetTopic(newTopic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CpsModulePackage.CPS_PUT_OPERATION__TOPIC, newTopic, newTopic));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CpsModulePackage.CPS_PUT_OPERATION__IS_XML, oldIsXml, isXml, !oldIsXmlESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, CpsModulePackage.CPS_PUT_OPERATION__IS_XML, oldIsXml, IS_XML_EDEFAULT, oldIsXmlESet));
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
  public boolean isPersistent()
  {
    return persistent;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setPersistent(boolean newPersistent)
  {
    boolean oldPersistent = persistent;
    persistent = newPersistent;
    boolean oldPersistentESet = persistentESet;
    persistentESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CpsModulePackage.CPS_PUT_OPERATION__PERSISTENT, oldPersistent, persistent, !oldPersistentESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetPersistent()
  {
    boolean oldPersistent = persistent;
    boolean oldPersistentESet = persistentESet;
    persistent = PERSISTENT_EDEFAULT;
    persistentESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, CpsModulePackage.CPS_PUT_OPERATION__PERSISTENT, oldPersistent, PERSISTENT_EDEFAULT, oldPersistentESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetPersistent()
  {
    return persistentESet;
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
      case CpsModulePackage.CPS_PUT_OPERATION__INPUT:
        return basicSetInput(null, msgs);
      case CpsModulePackage.CPS_PUT_OPERATION__TOPIC:
        return basicSetTopic(null, msgs);
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
      case CpsModulePackage.CPS_PUT_OPERATION__INPUT:
        return getInput();
      case CpsModulePackage.CPS_PUT_OPERATION__TOPIC:
        return getTopic();
      case CpsModulePackage.CPS_PUT_OPERATION__PERSISTENT:
        return isPersistent();
      case CpsModulePackage.CPS_PUT_OPERATION__IS_XML:
        return isIsXml();
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
      case CpsModulePackage.CPS_PUT_OPERATION__INPUT:
        setInput((ResourceDefinition)newValue);
        return;
      case CpsModulePackage.CPS_PUT_OPERATION__TOPIC:
        setTopic((ComplexValue)newValue);
        return;
      case CpsModulePackage.CPS_PUT_OPERATION__PERSISTENT:
        setPersistent((Boolean)newValue);
        return;
      case CpsModulePackage.CPS_PUT_OPERATION__IS_XML:
        setIsXml((Boolean)newValue);
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
      case CpsModulePackage.CPS_PUT_OPERATION__INPUT:
        setInput((ResourceDefinition)null);
        return;
      case CpsModulePackage.CPS_PUT_OPERATION__TOPIC:
        setTopic((ComplexValue)null);
        return;
      case CpsModulePackage.CPS_PUT_OPERATION__PERSISTENT:
        unsetPersistent();
        return;
      case CpsModulePackage.CPS_PUT_OPERATION__IS_XML:
        unsetIsXml();
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
      case CpsModulePackage.CPS_PUT_OPERATION__INPUT:
        return input != null;
      case CpsModulePackage.CPS_PUT_OPERATION__TOPIC:
        return topic != null;
      case CpsModulePackage.CPS_PUT_OPERATION__PERSISTENT:
        return isSetPersistent();
      case CpsModulePackage.CPS_PUT_OPERATION__IS_XML:
        return isSetIsXml();
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
    result.append(" (persistent: ");
    if (persistentESet) result.append(persistent); else result.append("<unset>");
    result.append(", isXml: ");
    if (isXmlESet) result.append(isXml); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // CpsPutOperationImpl
