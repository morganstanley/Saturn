package com.ms.qaTools.saturn.listeners.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.listeners.ID;
import com.ms.qaTools.saturn.listeners.ListenersPackage;
import com.ms.qaTools.saturn.listeners.TAPOutputTypeEnum;
import com.ms.qaTools.saturn.listeners.TAPReportListener;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.types.impl.AbstractListenerImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>TAP Report Listener</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.listeners.impl.TAPReportListenerImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.listeners.impl.TAPReportListenerImpl#getOmittedIDs <em>Omitted IDs</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.listeners.impl.TAPReportListenerImpl#getIDs <em>IDs</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.listeners.impl.TAPReportListenerImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TAPReportListenerImpl extends AbstractListenerImpl implements TAPReportListener
{
  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected ResourceDefinition             output;

  /**
   * The cached value of the '{@link #getOmittedIDs() <em>Omitted IDs</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOmittedIDs()
   * @generated
   * @ordered
   */
  protected EList<ID>                      omittedIDs;

  /**
   * The cached value of the '{@link #getIDs() <em>IDs</em>}' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getIDs()
   * @generated
   * @ordered
   */
  protected EList<ID>                      iDs;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final TAPOutputTypeEnum TYPE_EDEFAULT = TAPOutputTypeEnum.TEXT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TAPOutputTypeEnum              type          = TYPE_EDEFAULT;

  /**
   * This is true if the Type attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                        typeESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected TAPReportListenerImpl()
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
    return ListenersPackage.Literals.TAP_REPORT_LISTENER;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutput(ResourceDefinition newOutput, NotificationChain msgs)
  {
    ResourceDefinition oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ListenersPackage.TAP_REPORT_LISTENER__OUTPUT, oldOutput, newOutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(ResourceDefinition newOutput)
  {
    if (newOutput != output)
    {
      NotificationChain msgs = null;
      if (output != null)
        msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ListenersPackage.TAP_REPORT_LISTENER__OUTPUT, null, msgs);
      if (newOutput != null)
        msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ListenersPackage.TAP_REPORT_LISTENER__OUTPUT, null, msgs);
      msgs = basicSetOutput(newOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ListenersPackage.TAP_REPORT_LISTENER__OUTPUT, newOutput, newOutput));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ID> getOmittedIDs()
  {
    if (omittedIDs == null)
    {
      omittedIDs = new EObjectContainmentEList<ID>(ID.class, this, ListenersPackage.TAP_REPORT_LISTENER__OMITTED_IDS);
    }
    return omittedIDs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ID> getIDs()
  {
    if (iDs == null)
    {
      iDs = new EObjectContainmentEList<ID>(ID.class, this, ListenersPackage.TAP_REPORT_LISTENER__IDS);
    }
    return iDs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TAPOutputTypeEnum getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setType(TAPOutputTypeEnum newType)
  {
    TAPOutputTypeEnum oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    boolean oldTypeESet = typeESet;
    typeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ListenersPackage.TAP_REPORT_LISTENER__TYPE, oldType, type, !oldTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetType()
  {
    TAPOutputTypeEnum oldType = type;
    boolean oldTypeESet = typeESet;
    type = TYPE_EDEFAULT;
    typeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, ListenersPackage.TAP_REPORT_LISTENER__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetType()
  {
    return typeESet;
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
      case ListenersPackage.TAP_REPORT_LISTENER__OUTPUT:
        return basicSetOutput(null, msgs);
      case ListenersPackage.TAP_REPORT_LISTENER__OMITTED_IDS:
        return ((InternalEList<?>)getOmittedIDs()).basicRemove(otherEnd, msgs);
      case ListenersPackage.TAP_REPORT_LISTENER__IDS:
        return ((InternalEList<?>)getIDs()).basicRemove(otherEnd, msgs);
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
      case ListenersPackage.TAP_REPORT_LISTENER__OUTPUT:
        return getOutput();
      case ListenersPackage.TAP_REPORT_LISTENER__OMITTED_IDS:
        return getOmittedIDs();
      case ListenersPackage.TAP_REPORT_LISTENER__IDS:
        return getIDs();
      case ListenersPackage.TAP_REPORT_LISTENER__TYPE:
        return getType();
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
      case ListenersPackage.TAP_REPORT_LISTENER__OUTPUT:
        setOutput((ResourceDefinition)newValue);
        return;
      case ListenersPackage.TAP_REPORT_LISTENER__OMITTED_IDS:
        getOmittedIDs().clear();
        getOmittedIDs().addAll((Collection<? extends ID>)newValue);
        return;
      case ListenersPackage.TAP_REPORT_LISTENER__IDS:
        getIDs().clear();
        getIDs().addAll((Collection<? extends ID>)newValue);
        return;
      case ListenersPackage.TAP_REPORT_LISTENER__TYPE:
        setType((TAPOutputTypeEnum)newValue);
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
      case ListenersPackage.TAP_REPORT_LISTENER__OUTPUT:
        setOutput((ResourceDefinition)null);
        return;
      case ListenersPackage.TAP_REPORT_LISTENER__OMITTED_IDS:
        getOmittedIDs().clear();
        return;
      case ListenersPackage.TAP_REPORT_LISTENER__IDS:
        getIDs().clear();
        return;
      case ListenersPackage.TAP_REPORT_LISTENER__TYPE:
        unsetType();
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
      case ListenersPackage.TAP_REPORT_LISTENER__OUTPUT:
        return output != null;
      case ListenersPackage.TAP_REPORT_LISTENER__OMITTED_IDS:
        return omittedIDs != null && !omittedIDs.isEmpty();
      case ListenersPackage.TAP_REPORT_LISTENER__IDS:
        return iDs != null && !iDs.isEmpty();
      case ListenersPackage.TAP_REPORT_LISTENER__TYPE:
        return isSetType();
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
    result.append(" (type: ");
    if (typeESet) result.append(type); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // TAPReportListenerImpl
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
