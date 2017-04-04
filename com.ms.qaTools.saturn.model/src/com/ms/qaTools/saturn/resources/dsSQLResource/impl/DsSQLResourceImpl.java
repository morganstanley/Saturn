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
package com.ms.qaTools.saturn.resources.dsSQLResource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.resources.dsSQLResource.AbstractTable;
import com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResource;
import com.ms.qaTools.saturn.resources.dsSQLResource.DsSQLResourcePackage;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.types.impl.NamedResourceDefinitionImpl;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Ds SQL Resource</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourceImpl#getSQL <em>SQL</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourceImpl#getLibraries <em>Libraries</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourceImpl#getDatabases <em>Databases</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.dsSQLResource.impl.DsSQLResourceImpl#getTables <em>Tables</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DsSQLResourceImpl extends NamedResourceDefinitionImpl implements DsSQLResource
{
  /**
   * The cached value of the '{@link #getSQL() <em>SQL</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSQL()
   * @generated
   * @ordered
   */
  protected ComplexValue                   sQL;

  /**
   * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getLibraries()
   * @generated
   * @ordered
   */
  protected EList<ResourceDefinition>      libraries;

  /**
   * The cached value of the '{@link #getDatabases() <em>Databases</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDatabases()
   * @generated
   * @ordered
   */
  protected EList<NamedResourceDefinition> databases;

  /**
   * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTables()
   * @generated
   * @ordered
   */
  protected EList<AbstractTable>           tables;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected DsSQLResourceImpl()
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
    return DsSQLResourcePackage.Literals.DS_SQL_RESOURCE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getSQL()
  {
    return sQL;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSQL(ComplexValue newSQL, NotificationChain msgs)
  {
    ComplexValue oldSQL = sQL;
    sQL = newSQL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsSQLResourcePackage.DS_SQL_RESOURCE__SQL, oldSQL, newSQL);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSQL(ComplexValue newSQL)
  {
    if (newSQL != sQL)
    {
      NotificationChain msgs = null;
      if (sQL != null)
        msgs = ((InternalEObject)sQL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsSQLResourcePackage.DS_SQL_RESOURCE__SQL, null, msgs);
      if (newSQL != null)
        msgs = ((InternalEObject)newSQL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsSQLResourcePackage.DS_SQL_RESOURCE__SQL, null, msgs);
      msgs = basicSetSQL(newSQL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DsSQLResourcePackage.DS_SQL_RESOURCE__SQL, newSQL, newSQL));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourceDefinition> getLibraries()
  {
    if (libraries == null)
    {
      libraries = new EObjectContainmentEList<ResourceDefinition>(ResourceDefinition.class, this, DsSQLResourcePackage.DS_SQL_RESOURCE__LIBRARIES);
    }
    return libraries;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedResourceDefinition> getDatabases()
  {
    if (databases == null)
    {
      databases = new EObjectContainmentEList<NamedResourceDefinition>(NamedResourceDefinition.class, this, DsSQLResourcePackage.DS_SQL_RESOURCE__DATABASES);
    }
    return databases;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractTable> getTables()
  {
    if (tables == null)
    {
      tables = new EObjectContainmentEList<AbstractTable>(AbstractTable.class, this, DsSQLResourcePackage.DS_SQL_RESOURCE__TABLES);
    }
    return tables;
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
      case DsSQLResourcePackage.DS_SQL_RESOURCE__SQL:
        return basicSetSQL(null, msgs);
      case DsSQLResourcePackage.DS_SQL_RESOURCE__LIBRARIES:
        return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
      case DsSQLResourcePackage.DS_SQL_RESOURCE__DATABASES:
        return ((InternalEList<?>)getDatabases()).basicRemove(otherEnd, msgs);
      case DsSQLResourcePackage.DS_SQL_RESOURCE__TABLES:
        return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
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
      case DsSQLResourcePackage.DS_SQL_RESOURCE__SQL:
        return getSQL();
      case DsSQLResourcePackage.DS_SQL_RESOURCE__LIBRARIES:
        return getLibraries();
      case DsSQLResourcePackage.DS_SQL_RESOURCE__DATABASES:
        return getDatabases();
      case DsSQLResourcePackage.DS_SQL_RESOURCE__TABLES:
        return getTables();
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
      case DsSQLResourcePackage.DS_SQL_RESOURCE__SQL:
        setSQL((ComplexValue)newValue);
        return;
      case DsSQLResourcePackage.DS_SQL_RESOURCE__LIBRARIES:
        getLibraries().clear();
        getLibraries().addAll((Collection<? extends ResourceDefinition>)newValue);
        return;
      case DsSQLResourcePackage.DS_SQL_RESOURCE__DATABASES:
        getDatabases().clear();
        getDatabases().addAll((Collection<? extends NamedResourceDefinition>)newValue);
        return;
      case DsSQLResourcePackage.DS_SQL_RESOURCE__TABLES:
        getTables().clear();
        getTables().addAll((Collection<? extends AbstractTable>)newValue);
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
      case DsSQLResourcePackage.DS_SQL_RESOURCE__SQL:
        setSQL((ComplexValue)null);
        return;
      case DsSQLResourcePackage.DS_SQL_RESOURCE__LIBRARIES:
        getLibraries().clear();
        return;
      case DsSQLResourcePackage.DS_SQL_RESOURCE__DATABASES:
        getDatabases().clear();
        return;
      case DsSQLResourcePackage.DS_SQL_RESOURCE__TABLES:
        getTables().clear();
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
      case DsSQLResourcePackage.DS_SQL_RESOURCE__SQL:
        return sQL != null;
      case DsSQLResourcePackage.DS_SQL_RESOURCE__LIBRARIES:
        return libraries != null && !libraries.isEmpty();
      case DsSQLResourcePackage.DS_SQL_RESOURCE__DATABASES:
        return databases != null && !databases.isEmpty();
      case DsSQLResourcePackage.DS_SQL_RESOURCE__TABLES:
        return tables != null && !tables.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // DsSQLResourceImpl
