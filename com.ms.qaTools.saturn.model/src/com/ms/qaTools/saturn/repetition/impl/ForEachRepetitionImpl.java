package com.ms.qaTools.saturn.repetition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.repetition.ColumnMapping;
import com.ms.qaTools.saturn.repetition.ForEachRepetition;
import com.ms.qaTools.saturn.repetition.RepetitionPackage;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.types.impl.AbstractRepetitionHandlerImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>For Each Repetition</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.repetition.impl.ForEachRepetitionImpl#getDataSetResource <em>Data Set Resource</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.repetition.impl.ForEachRepetitionImpl#getColumnMappings <em>Column Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForEachRepetitionImpl extends AbstractRepetitionHandlerImpl implements ForEachRepetition
{
  /**
   * The cached value of the '{@link #getDataSetResource() <em>Data Set Resource</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDataSetResource()
   * @generated
   * @ordered
   */
  protected NamedResourceDefinition dataSetResource;

  /**
   * The cached value of the '{@link #getColumnMappings() <em>Column Mappings</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getColumnMappings()
   * @generated
   * @ordered
   */
  protected EList<ColumnMapping>    columnMappings;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected ForEachRepetitionImpl()
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
    return RepetitionPackage.Literals.FOR_EACH_REPETITION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NamedResourceDefinition getDataSetResource()
  {
    return dataSetResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataSetResource(NamedResourceDefinition newDataSetResource, NotificationChain msgs)
  {
    NamedResourceDefinition oldDataSetResource = dataSetResource;
    dataSetResource = newDataSetResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RepetitionPackage.FOR_EACH_REPETITION__DATA_SET_RESOURCE, oldDataSetResource, newDataSetResource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDataSetResource(NamedResourceDefinition newDataSetResource)
  {
    if (newDataSetResource != dataSetResource)
    {
      NotificationChain msgs = null;
      if (dataSetResource != null)
        msgs = ((InternalEObject)dataSetResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RepetitionPackage.FOR_EACH_REPETITION__DATA_SET_RESOURCE, null, msgs);
      if (newDataSetResource != null)
        msgs = ((InternalEObject)newDataSetResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RepetitionPackage.FOR_EACH_REPETITION__DATA_SET_RESOURCE, null, msgs);
      msgs = basicSetDataSetResource(newDataSetResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RepetitionPackage.FOR_EACH_REPETITION__DATA_SET_RESOURCE, newDataSetResource, newDataSetResource));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ColumnMapping> getColumnMappings()
  {
    if (columnMappings == null)
    {
      columnMappings = new EObjectContainmentEList<ColumnMapping>(ColumnMapping.class, this, RepetitionPackage.FOR_EACH_REPETITION__COLUMN_MAPPINGS);
    }
    return columnMappings;
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
      case RepetitionPackage.FOR_EACH_REPETITION__DATA_SET_RESOURCE:
        return basicSetDataSetResource(null, msgs);
      case RepetitionPackage.FOR_EACH_REPETITION__COLUMN_MAPPINGS:
        return ((InternalEList<?>)getColumnMappings()).basicRemove(otherEnd, msgs);
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
      case RepetitionPackage.FOR_EACH_REPETITION__DATA_SET_RESOURCE:
        return getDataSetResource();
      case RepetitionPackage.FOR_EACH_REPETITION__COLUMN_MAPPINGS:
        return getColumnMappings();
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
      case RepetitionPackage.FOR_EACH_REPETITION__DATA_SET_RESOURCE:
        setDataSetResource((NamedResourceDefinition)newValue);
        return;
      case RepetitionPackage.FOR_EACH_REPETITION__COLUMN_MAPPINGS:
        getColumnMappings().clear();
        getColumnMappings().addAll((Collection<? extends ColumnMapping>)newValue);
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
      case RepetitionPackage.FOR_EACH_REPETITION__DATA_SET_RESOURCE:
        setDataSetResource((NamedResourceDefinition)null);
        return;
      case RepetitionPackage.FOR_EACH_REPETITION__COLUMN_MAPPINGS:
        getColumnMappings().clear();
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
      case RepetitionPackage.FOR_EACH_REPETITION__DATA_SET_RESOURCE:
        return dataSetResource != null;
      case RepetitionPackage.FOR_EACH_REPETITION__COLUMN_MAPPINGS:
        return columnMappings != null && !columnMappings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // ForEachRepetitionImpl
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
