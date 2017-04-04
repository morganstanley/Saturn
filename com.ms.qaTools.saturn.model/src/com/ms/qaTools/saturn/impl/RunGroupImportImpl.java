package com.ms.qaTools.saturn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.RunGroupImport;
import com.ms.qaTools.saturn.SaturnPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Run Group Import</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.impl.RunGroupImportImpl#isAttributes <em>Attributes</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.RunGroupImportImpl#isEnabled <em>Enabled</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.RunGroupImportImpl#getIncludeFile <em>Include File</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.RunGroupImportImpl#isResources <em>Resources</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.impl.RunGroupImportImpl#getRunGroup <em>Run Group</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RunGroupImportImpl extends EObjectImpl implements RunGroupImport
{
  /**
   * The default value of the '{@link #getIncludeFile() <em>Include File</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getIncludeFile()
   * @generated
   * @ordered
   */
  protected static final String  INCLUDE_FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIncludeFile() <em>Include File</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getIncludeFile()
   * @generated
   * @ordered
   */
  protected String               includeFile           = INCLUDE_FILE_EDEFAULT;

  /**
   * The default value of the '{@link #getRunGroup() <em>Run Group</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getRunGroup()
   * @generated
   * @ordered
   */
  protected static final String  RUN_GROUP_EDEFAULT    = null;

  /**
   * The cached value of the '{@link #getRunGroup() <em>Run Group</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getRunGroup()
   * @generated
   * @ordered
   */
  protected String               runGroup              = RUN_GROUP_EDEFAULT;

  /**
   * The default value of the '{@link #isAttributes() <em>Attributes</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isAttributes()
   * @generated
   * @ordered
   */
  protected static final boolean ATTRIBUTES_EDEFAULT   = true;

  /**
   * The cached value of the '{@link #isAttributes() <em>Attributes</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isAttributes()
   * @generated
   * @ordered
   */
  protected boolean              attributes            = ATTRIBUTES_EDEFAULT;

  /**
   * This is true if the Attributes attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              attributesESet;

  /**
   * The default value of the '{@link #isResources() <em>Resources</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isResources()
   * @generated
   * @ordered
   */
  protected static final boolean RESOURCES_EDEFAULT    = true;

  /**
   * The cached value of the '{@link #isResources() <em>Resources</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isResources()
   * @generated
   * @ordered
   */
  protected boolean              resources             = RESOURCES_EDEFAULT;

  /**
   * This is true if the Resources attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              resourcesESet;

  /**
   * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected static final boolean ENABLED_EDEFAULT      = true;

  /**
   * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isEnabled()
   * @generated
   * @ordered
   */
  protected boolean              enabled               = ENABLED_EDEFAULT;

  /**
   * This is true if the Enabled attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              enabledESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected RunGroupImportImpl()
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
    return SaturnPackage.Literals.RUN_GROUP_IMPORT;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isAttributes()
  {
    return attributes;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAttributes(boolean newAttributes)
  {
    boolean oldAttributes = attributes;
    attributes = newAttributes;
    boolean oldAttributesESet = attributesESet;
    attributesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.RUN_GROUP_IMPORT__ATTRIBUTES, oldAttributes, attributes, !oldAttributesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetAttributes()
  {
    boolean oldAttributes = attributes;
    boolean oldAttributesESet = attributesESet;
    attributes = ATTRIBUTES_EDEFAULT;
    attributesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnPackage.RUN_GROUP_IMPORT__ATTRIBUTES, oldAttributes, ATTRIBUTES_EDEFAULT, oldAttributesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAttributes()
  {
    return attributesESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.RUN_GROUP_IMPORT__ENABLED, oldEnabled, enabled, !oldEnabledESet));
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
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnPackage.RUN_GROUP_IMPORT__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
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
  public String getIncludeFile()
  {
    return includeFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeFile(String newIncludeFile)
  {
    String oldIncludeFile = includeFile;
    includeFile = newIncludeFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.RUN_GROUP_IMPORT__INCLUDE_FILE, oldIncludeFile, includeFile));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isResources()
  {
    return resources;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setResources(boolean newResources)
  {
    boolean oldResources = resources;
    resources = newResources;
    boolean oldResourcesESet = resourcesESet;
    resourcesESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.RUN_GROUP_IMPORT__RESOURCES, oldResources, resources, !oldResourcesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetResources()
  {
    boolean oldResources = resources;
    boolean oldResourcesESet = resourcesESet;
    resources = RESOURCES_EDEFAULT;
    resourcesESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnPackage.RUN_GROUP_IMPORT__RESOURCES, oldResources, RESOURCES_EDEFAULT, oldResourcesESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetResources()
  {
    return resourcesESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getRunGroup()
  {
    return runGroup;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRunGroup(String newRunGroup)
  {
    String oldRunGroup = runGroup;
    runGroup = newRunGroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnPackage.RUN_GROUP_IMPORT__RUN_GROUP, oldRunGroup, runGroup));
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
      case SaturnPackage.RUN_GROUP_IMPORT__INCLUDE_FILE:
        return getIncludeFile();
      case SaturnPackage.RUN_GROUP_IMPORT__RUN_GROUP:
        return getRunGroup();
      case SaturnPackage.RUN_GROUP_IMPORT__ATTRIBUTES:
        return isAttributes();
      case SaturnPackage.RUN_GROUP_IMPORT__RESOURCES:
        return isResources();
      case SaturnPackage.RUN_GROUP_IMPORT__ENABLED:
        return isEnabled();
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
      case SaturnPackage.RUN_GROUP_IMPORT__INCLUDE_FILE:
        setIncludeFile((String)newValue);
        return;
      case SaturnPackage.RUN_GROUP_IMPORT__RUN_GROUP:
        setRunGroup((String)newValue);
        return;
      case SaturnPackage.RUN_GROUP_IMPORT__ATTRIBUTES:
        setAttributes((Boolean)newValue);
        return;
      case SaturnPackage.RUN_GROUP_IMPORT__RESOURCES:
        setResources((Boolean)newValue);
        return;
      case SaturnPackage.RUN_GROUP_IMPORT__ENABLED:
        setEnabled((Boolean)newValue);
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
      case SaturnPackage.RUN_GROUP_IMPORT__INCLUDE_FILE:
        setIncludeFile(INCLUDE_FILE_EDEFAULT);
        return;
      case SaturnPackage.RUN_GROUP_IMPORT__RUN_GROUP:
        setRunGroup(RUN_GROUP_EDEFAULT);
        return;
      case SaturnPackage.RUN_GROUP_IMPORT__ATTRIBUTES:
        unsetAttributes();
        return;
      case SaturnPackage.RUN_GROUP_IMPORT__RESOURCES:
        unsetResources();
        return;
      case SaturnPackage.RUN_GROUP_IMPORT__ENABLED:
        unsetEnabled();
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
      case SaturnPackage.RUN_GROUP_IMPORT__INCLUDE_FILE:
        return INCLUDE_FILE_EDEFAULT == null ? includeFile != null : !INCLUDE_FILE_EDEFAULT.equals(includeFile);
      case SaturnPackage.RUN_GROUP_IMPORT__RUN_GROUP:
        return RUN_GROUP_EDEFAULT == null ? runGroup != null : !RUN_GROUP_EDEFAULT.equals(runGroup);
      case SaturnPackage.RUN_GROUP_IMPORT__ATTRIBUTES:
        return isSetAttributes();
      case SaturnPackage.RUN_GROUP_IMPORT__RESOURCES:
        return isSetResources();
      case SaturnPackage.RUN_GROUP_IMPORT__ENABLED:
        return isSetEnabled();
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
    result.append(" (includeFile: ");
    result.append(includeFile);
    result.append(", runGroup: ");
    result.append(runGroup);
    result.append(", attributes: ");
    if (attributesESet) result.append(attributes); else result.append("<unset>");
    result.append(", resources: ");
    if (resourcesESet) result.append(resources); else result.append("<unset>");
    result.append(", enabled: ");
    if (enabledESet) result.append(enabled); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // RunGroupImportImpl
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
