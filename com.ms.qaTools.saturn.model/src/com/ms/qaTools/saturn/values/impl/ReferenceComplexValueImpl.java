/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 */
package com.ms.qaTools.saturn.values.impl;

import com.ms.qaTools.saturn.values.ReferenceComplexValue;
import com.ms.qaTools.saturn.values.ValuesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Complex Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ReferenceComplexValueImpl#getIncludeFile <em>Include File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ReferenceComplexValueImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ReferenceComplexValueImpl#getRunGroup <em>Run Group</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ReferenceComplexValueImpl#getSaturnAttribute <em>Saturn Attribute</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ReferenceComplexValueImpl#getUserAttribute <em>User Attribute</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.values.impl.ReferenceComplexValueImpl#getModuleAttribute <em>Module Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceComplexValueImpl extends EObjectImpl implements ReferenceComplexValue
{
  /**
   * The default value of the '{@link #getIncludeFile() <em>Include File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeFile()
   * @generated
   * @ordered
   */
  protected static final String INCLUDE_FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIncludeFile() <em>Include File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeFile()
   * @generated
   * @ordered
   */
  protected String includeFile = INCLUDE_FILE_EDEFAULT;

  /**
   * The default value of the '{@link #getTemplate() <em>Template</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplate()
   * @generated
   * @ordered
   */
  protected static final String TEMPLATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTemplate() <em>Template</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplate()
   * @generated
   * @ordered
   */
  protected String template = TEMPLATE_EDEFAULT;

  /**
   * The default value of the '{@link #getRunGroup() <em>Run Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRunGroup()
   * @generated
   * @ordered
   */
  protected static final String RUN_GROUP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRunGroup() <em>Run Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRunGroup()
   * @generated
   * @ordered
   */
  protected String runGroup = RUN_GROUP_EDEFAULT;

  /**
   * The default value of the '{@link #getSaturnAttribute() <em>Saturn Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSaturnAttribute()
   * @generated
   * @ordered
   */
  protected static final String SATURN_ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSaturnAttribute() <em>Saturn Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSaturnAttribute()
   * @generated
   * @ordered
   */
  protected String saturnAttribute = SATURN_ATTRIBUTE_EDEFAULT;

  /**
   * The default value of the '{@link #getUserAttribute() <em>User Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserAttribute()
   * @generated
   * @ordered
   */
  protected static final String USER_ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUserAttribute() <em>User Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserAttribute()
   * @generated
   * @ordered
   */
  protected String userAttribute = USER_ATTRIBUTE_EDEFAULT;

  /**
   * The default value of the '{@link #getModuleAttribute() <em>Module Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModuleAttribute()
   * @generated
   * @ordered
   */
  protected static final String MODULE_ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModuleAttribute() <em>Module Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModuleAttribute()
   * @generated
   * @ordered
   */
  protected String moduleAttribute = MODULE_ATTRIBUTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceComplexValueImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ValuesPackage.Literals.REFERENCE_COMPLEX_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIncludeFile()
  {
    return includeFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeFile(String newIncludeFile)
  {
    String oldIncludeFile = includeFile;
    includeFile = newIncludeFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.REFERENCE_COMPLEX_VALUE__INCLUDE_FILE, oldIncludeFile, includeFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTemplate()
  {
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplate(String newTemplate)
  {
    String oldTemplate = template;
    template = newTemplate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.REFERENCE_COMPLEX_VALUE__TEMPLATE, oldTemplate, template));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRunGroup()
  {
    return runGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRunGroup(String newRunGroup)
  {
    String oldRunGroup = runGroup;
    runGroup = newRunGroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.REFERENCE_COMPLEX_VALUE__RUN_GROUP, oldRunGroup, runGroup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSaturnAttribute()
  {
    return saturnAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSaturnAttribute(String newSaturnAttribute)
  {
    String oldSaturnAttribute = saturnAttribute;
    saturnAttribute = newSaturnAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.REFERENCE_COMPLEX_VALUE__SATURN_ATTRIBUTE, oldSaturnAttribute, saturnAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUserAttribute()
  {
    return userAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUserAttribute(String newUserAttribute)
  {
    String oldUserAttribute = userAttribute;
    userAttribute = newUserAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.REFERENCE_COMPLEX_VALUE__USER_ATTRIBUTE, oldUserAttribute, userAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModuleAttribute()
  {
    return moduleAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModuleAttribute(String newModuleAttribute)
  {
    String oldModuleAttribute = moduleAttribute;
    moduleAttribute = newModuleAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.REFERENCE_COMPLEX_VALUE__MODULE_ATTRIBUTE, oldModuleAttribute, moduleAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__INCLUDE_FILE:
        return getIncludeFile();
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__TEMPLATE:
        return getTemplate();
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__RUN_GROUP:
        return getRunGroup();
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__SATURN_ATTRIBUTE:
        return getSaturnAttribute();
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__USER_ATTRIBUTE:
        return getUserAttribute();
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__MODULE_ATTRIBUTE:
        return getModuleAttribute();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__INCLUDE_FILE:
        setIncludeFile((String)newValue);
        return;
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__TEMPLATE:
        setTemplate((String)newValue);
        return;
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__RUN_GROUP:
        setRunGroup((String)newValue);
        return;
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__SATURN_ATTRIBUTE:
        setSaturnAttribute((String)newValue);
        return;
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__USER_ATTRIBUTE:
        setUserAttribute((String)newValue);
        return;
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__MODULE_ATTRIBUTE:
        setModuleAttribute((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__INCLUDE_FILE:
        setIncludeFile(INCLUDE_FILE_EDEFAULT);
        return;
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__TEMPLATE:
        setTemplate(TEMPLATE_EDEFAULT);
        return;
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__RUN_GROUP:
        setRunGroup(RUN_GROUP_EDEFAULT);
        return;
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__SATURN_ATTRIBUTE:
        setSaturnAttribute(SATURN_ATTRIBUTE_EDEFAULT);
        return;
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__USER_ATTRIBUTE:
        setUserAttribute(USER_ATTRIBUTE_EDEFAULT);
        return;
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__MODULE_ATTRIBUTE:
        setModuleAttribute(MODULE_ATTRIBUTE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__INCLUDE_FILE:
        return INCLUDE_FILE_EDEFAULT == null ? includeFile != null : !INCLUDE_FILE_EDEFAULT.equals(includeFile);
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__TEMPLATE:
        return TEMPLATE_EDEFAULT == null ? template != null : !TEMPLATE_EDEFAULT.equals(template);
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__RUN_GROUP:
        return RUN_GROUP_EDEFAULT == null ? runGroup != null : !RUN_GROUP_EDEFAULT.equals(runGroup);
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__SATURN_ATTRIBUTE:
        return SATURN_ATTRIBUTE_EDEFAULT == null ? saturnAttribute != null : !SATURN_ATTRIBUTE_EDEFAULT.equals(saturnAttribute);
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__USER_ATTRIBUTE:
        return USER_ATTRIBUTE_EDEFAULT == null ? userAttribute != null : !USER_ATTRIBUTE_EDEFAULT.equals(userAttribute);
      case ValuesPackage.REFERENCE_COMPLEX_VALUE__MODULE_ATTRIBUTE:
        return MODULE_ATTRIBUTE_EDEFAULT == null ? moduleAttribute != null : !MODULE_ATTRIBUTE_EDEFAULT.equals(moduleAttribute);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (includeFile: ");
    result.append(includeFile);
    result.append(", template: ");
    result.append(template);
    result.append(", runGroup: ");
    result.append(runGroup);
    result.append(", saturnAttribute: ");
    result.append(saturnAttribute);
    result.append(", userAttribute: ");
    result.append(userAttribute);
    result.append(", moduleAttribute: ");
    result.append(moduleAttribute);
    result.append(')');
    return result.toString();
  }

} //ReferenceComplexValueImpl
