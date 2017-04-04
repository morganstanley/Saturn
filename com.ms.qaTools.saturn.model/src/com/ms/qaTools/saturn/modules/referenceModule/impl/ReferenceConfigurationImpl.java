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
package com.ms.qaTools.saturn.modules.referenceModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.modules.referenceModule.ReferenceConfiguration;
import com.ms.qaTools.saturn.modules.referenceModule.ReferenceModulePackage;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Reference Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceConfigurationImpl#getIncludeFileAdv <em>Include File Adv</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceConfigurationImpl#getRunGroupAdv <em>Run Group Adv</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceConfigurationImpl#getIncludeFile <em>Include File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceConfigurationImpl#getRunGroup <em>Run Group</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.referenceModule.impl.ReferenceConfigurationImpl#isAdvanced <em>Advanced</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceConfigurationImpl extends EObjectImpl implements ReferenceConfiguration
{
  /**
   * The cached value of the '{@link #getIncludeFileAdv() <em>Include File Adv</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getIncludeFileAdv()
   * @generated
   * @ordered
   */
  protected ComplexValue         includeFileAdv;

  /**
   * The cached value of the '{@link #getRunGroupAdv() <em>Run Group Adv</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRunGroupAdv()
   * @generated
   * @ordered
   */
  protected ComplexValue         runGroupAdv;

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
   * The default value of the '{@link #isAdvanced() <em>Advanced</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isAdvanced()
   * @generated
   * @ordered
   */
  protected static final boolean ADVANCED_EDEFAULT     = false;

  /**
   * The cached value of the '{@link #isAdvanced() <em>Advanced</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isAdvanced()
   * @generated
   * @ordered
   */
  protected boolean              advanced              = ADVANCED_EDEFAULT;

  /**
   * This is true if the Advanced attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              advancedESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceConfigurationImpl()
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
    return ReferenceModulePackage.Literals.REFERENCE_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getIncludeFileAdv()
  {
    return includeFileAdv;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIncludeFileAdv(ComplexValue newIncludeFileAdv, NotificationChain msgs)
  {
    ComplexValue oldIncludeFileAdv = includeFileAdv;
    includeFileAdv = newIncludeFileAdv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferenceModulePackage.REFERENCE_CONFIGURATION__INCLUDE_FILE_ADV, oldIncludeFileAdv, newIncludeFileAdv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeFileAdv(ComplexValue newIncludeFileAdv)
  {
    if (newIncludeFileAdv != includeFileAdv)
    {
      NotificationChain msgs = null;
      if (includeFileAdv != null)
        msgs = ((InternalEObject)includeFileAdv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferenceModulePackage.REFERENCE_CONFIGURATION__INCLUDE_FILE_ADV, null, msgs);
      if (newIncludeFileAdv != null)
        msgs = ((InternalEObject)newIncludeFileAdv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferenceModulePackage.REFERENCE_CONFIGURATION__INCLUDE_FILE_ADV, null, msgs);
      msgs = basicSetIncludeFileAdv(newIncludeFileAdv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReferenceModulePackage.REFERENCE_CONFIGURATION__INCLUDE_FILE_ADV, newIncludeFileAdv, newIncludeFileAdv));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getRunGroupAdv()
  {
    return runGroupAdv;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRunGroupAdv(ComplexValue newRunGroupAdv, NotificationChain msgs)
  {
    ComplexValue oldRunGroupAdv = runGroupAdv;
    runGroupAdv = newRunGroupAdv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferenceModulePackage.REFERENCE_CONFIGURATION__RUN_GROUP_ADV, oldRunGroupAdv, newRunGroupAdv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRunGroupAdv(ComplexValue newRunGroupAdv)
  {
    if (newRunGroupAdv != runGroupAdv)
    {
      NotificationChain msgs = null;
      if (runGroupAdv != null)
        msgs = ((InternalEObject)runGroupAdv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferenceModulePackage.REFERENCE_CONFIGURATION__RUN_GROUP_ADV, null, msgs);
      if (newRunGroupAdv != null)
        msgs = ((InternalEObject)newRunGroupAdv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferenceModulePackage.REFERENCE_CONFIGURATION__RUN_GROUP_ADV, null, msgs);
      msgs = basicSetRunGroupAdv(newRunGroupAdv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReferenceModulePackage.REFERENCE_CONFIGURATION__RUN_GROUP_ADV, newRunGroupAdv, newRunGroupAdv));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isAdvanced()
  {
    return advanced;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAdvanced(boolean newAdvanced)
  {
    boolean oldAdvanced = advanced;
    advanced = newAdvanced;
    boolean oldAdvancedESet = advancedESet;
    advancedESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReferenceModulePackage.REFERENCE_CONFIGURATION__ADVANCED, oldAdvanced, advanced, !oldAdvancedESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetAdvanced()
  {
    boolean oldAdvanced = advanced;
    boolean oldAdvancedESet = advancedESet;
    advanced = ADVANCED_EDEFAULT;
    advancedESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ReferenceModulePackage.REFERENCE_CONFIGURATION__ADVANCED, oldAdvanced, ADVANCED_EDEFAULT, oldAdvancedESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAdvanced()
  {
    return advancedESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ReferenceModulePackage.REFERENCE_CONFIGURATION__INCLUDE_FILE, oldIncludeFile, includeFile));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ReferenceModulePackage.REFERENCE_CONFIGURATION__RUN_GROUP, oldRunGroup, runGroup));
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
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__INCLUDE_FILE_ADV:
        return basicSetIncludeFileAdv(null, msgs);
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__RUN_GROUP_ADV:
        return basicSetRunGroupAdv(null, msgs);
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
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__INCLUDE_FILE_ADV:
        return getIncludeFileAdv();
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__RUN_GROUP_ADV:
        return getRunGroupAdv();
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__INCLUDE_FILE:
        return getIncludeFile();
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__RUN_GROUP:
        return getRunGroup();
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__ADVANCED:
        return isAdvanced();
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
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__INCLUDE_FILE_ADV:
        setIncludeFileAdv((ComplexValue)newValue);
        return;
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__RUN_GROUP_ADV:
        setRunGroupAdv((ComplexValue)newValue);
        return;
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__INCLUDE_FILE:
        setIncludeFile((String)newValue);
        return;
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__RUN_GROUP:
        setRunGroup((String)newValue);
        return;
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__ADVANCED:
        setAdvanced((Boolean)newValue);
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
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__INCLUDE_FILE_ADV:
        setIncludeFileAdv((ComplexValue)null);
        return;
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__RUN_GROUP_ADV:
        setRunGroupAdv((ComplexValue)null);
        return;
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__INCLUDE_FILE:
        setIncludeFile(INCLUDE_FILE_EDEFAULT);
        return;
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__RUN_GROUP:
        setRunGroup(RUN_GROUP_EDEFAULT);
        return;
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__ADVANCED:
        unsetAdvanced();
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
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__INCLUDE_FILE_ADV:
        return includeFileAdv != null;
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__RUN_GROUP_ADV:
        return runGroupAdv != null;
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__INCLUDE_FILE:
        return INCLUDE_FILE_EDEFAULT == null ? includeFile != null : !INCLUDE_FILE_EDEFAULT.equals(includeFile);
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__RUN_GROUP:
        return RUN_GROUP_EDEFAULT == null ? runGroup != null : !RUN_GROUP_EDEFAULT.equals(runGroup);
      case ReferenceModulePackage.REFERENCE_CONFIGURATION__ADVANCED:
        return isSetAdvanced();
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
    result.append(", advanced: ");
    if (advancedESet) result.append(advanced); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // ReferenceConfigurationImpl
