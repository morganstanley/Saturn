package com.ms.qaTools.saturn.modules.fixManipModule.impl;

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

import com.ms.qaTools.saturn.modules.fixManipModule.AbstractOperation;
import com.ms.qaTools.saturn.modules.fixManipModule.FixManipConfiguration;
import com.ms.qaTools.saturn.modules.fixManipModule.FixManipModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Fix Manip Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipConfigurationImpl#getInputResource <em>Input Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipConfigurationImpl#getOutputResource <em>Output Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.fixManipModule.impl.FixManipConfigurationImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixManipConfigurationImpl extends EObjectImpl implements FixManipConfiguration
{
  /**
   * The cached value of the '{@link #getInputResource() <em>Input Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getInputResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition       inputResource;

  /**
   * The cached value of the '{@link #getOutputResource() <em>Output Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOutputResource()
   * @generated
   * @ordered
   */
  protected ResourceDefinition       outputResource;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<AbstractOperation> operations;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected FixManipConfigurationImpl()
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
    return FixManipModulePackage.Literals.FIX_MANIP_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getInputResource()
  {
    return inputResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputResource(ResourceDefinition newInputResource, NotificationChain msgs)
  {
    ResourceDefinition oldInputResource = inputResource;
    inputResource = newInputResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixManipModulePackage.FIX_MANIP_CONFIGURATION__INPUT_RESOURCE, oldInputResource, newInputResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInputResource(ResourceDefinition newInputResource)
  {
    if (newInputResource != inputResource)
    {
      NotificationChain msgs = null;
      if (inputResource != null)
        msgs = ((InternalEObject)inputResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixManipModulePackage.FIX_MANIP_CONFIGURATION__INPUT_RESOURCE, null, msgs);
      if (newInputResource != null)
        msgs = ((InternalEObject)newInputResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixManipModulePackage.FIX_MANIP_CONFIGURATION__INPUT_RESOURCE, null, msgs);
      msgs = basicSetInputResource(newInputResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixManipModulePackage.FIX_MANIP_CONFIGURATION__INPUT_RESOURCE, newInputResource, newInputResource));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FixManipModulePackage.FIX_MANIP_CONFIGURATION__OUTPUT_RESOURCE, oldOutputResource, newOutputResource);
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
        msgs = ((InternalEObject)outputResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FixManipModulePackage.FIX_MANIP_CONFIGURATION__OUTPUT_RESOURCE, null, msgs);
      if (newOutputResource != null)
        msgs = ((InternalEObject)newOutputResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FixManipModulePackage.FIX_MANIP_CONFIGURATION__OUTPUT_RESOURCE, null, msgs);
      msgs = basicSetOutputResource(newOutputResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FixManipModulePackage.FIX_MANIP_CONFIGURATION__OUTPUT_RESOURCE, newOutputResource, newOutputResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractOperation> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<AbstractOperation>(AbstractOperation.class, this, FixManipModulePackage.FIX_MANIP_CONFIGURATION__OPERATIONS);
    }
    return operations;
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
      case FixManipModulePackage.FIX_MANIP_CONFIGURATION__INPUT_RESOURCE:
        return basicSetInputResource(null, msgs);
      case FixManipModulePackage.FIX_MANIP_CONFIGURATION__OUTPUT_RESOURCE:
        return basicSetOutputResource(null, msgs);
      case FixManipModulePackage.FIX_MANIP_CONFIGURATION__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
      case FixManipModulePackage.FIX_MANIP_CONFIGURATION__INPUT_RESOURCE:
        return getInputResource();
      case FixManipModulePackage.FIX_MANIP_CONFIGURATION__OUTPUT_RESOURCE:
        return getOutputResource();
      case FixManipModulePackage.FIX_MANIP_CONFIGURATION__OPERATIONS:
        return getOperations();
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
      case FixManipModulePackage.FIX_MANIP_CONFIGURATION__INPUT_RESOURCE:
        setInputResource((ResourceDefinition)newValue);
        return;
      case FixManipModulePackage.FIX_MANIP_CONFIGURATION__OUTPUT_RESOURCE:
        setOutputResource((ResourceDefinition)newValue);
        return;
      case FixManipModulePackage.FIX_MANIP_CONFIGURATION__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends AbstractOperation>)newValue);
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
      case FixManipModulePackage.FIX_MANIP_CONFIGURATION__INPUT_RESOURCE:
        setInputResource((ResourceDefinition)null);
        return;
      case FixManipModulePackage.FIX_MANIP_CONFIGURATION__OUTPUT_RESOURCE:
        setOutputResource((ResourceDefinition)null);
        return;
      case FixManipModulePackage.FIX_MANIP_CONFIGURATION__OPERATIONS:
        getOperations().clear();
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
      case FixManipModulePackage.FIX_MANIP_CONFIGURATION__INPUT_RESOURCE:
        return inputResource != null;
      case FixManipModulePackage.FIX_MANIP_CONFIGURATION__OUTPUT_RESOURCE:
        return outputResource != null;
      case FixManipModulePackage.FIX_MANIP_CONFIGURATION__OPERATIONS:
        return operations != null && !operations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // FixManipConfigurationImpl
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
