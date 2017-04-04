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
package com.ms.qaTools.saturn.modules.xmlManipModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.modules.xmlManipModule.WhereOperation;
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Where Operation</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.WhereOperationImpl#getXPath <em>XPath</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.modules.xmlManipModule.impl.WhereOperationImpl#isExclude <em>Exclude</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class WhereOperationImpl extends AbstractOperationImpl implements WhereOperation
{
  /**
   * The cached value of the '{@link #getXPath() <em>XPath</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getXPath()
   * @generated
   * @ordered
   */
  protected ComplexValue         xPath;

  /**
   * The default value of the '{@link #isExclude() <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isExclude()
   * @generated
   * @ordered
   */
  protected static final boolean EXCLUDE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExclude() <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isExclude()
   * @generated
   * @ordered
   */
  protected boolean              exclude          = EXCLUDE_EDEFAULT;

  /**
   * This is true if the Exclude attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              excludeESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected WhereOperationImpl()
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
    return XmlManipModulePackage.Literals.WHERE_OPERATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getXPath()
  {
    return xPath;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXPath(ComplexValue newXPath, NotificationChain msgs)
  {
    ComplexValue oldXPath = xPath;
    xPath = newXPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.WHERE_OPERATION__XPATH, oldXPath, newXPath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setXPath(ComplexValue newXPath)
  {
    if (newXPath != xPath)
    {
      NotificationChain msgs = null;
      if (xPath != null)
        msgs = ((InternalEObject)xPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.WHERE_OPERATION__XPATH, null, msgs);
      if (newXPath != null)
        msgs = ((InternalEObject)newXPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlManipModulePackage.WHERE_OPERATION__XPATH, null, msgs);
      msgs = basicSetXPath(newXPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.WHERE_OPERATION__XPATH, newXPath, newXPath));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isExclude()
  {
    return exclude;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setExclude(boolean newExclude)
  {
    boolean oldExclude = exclude;
    exclude = newExclude;
    boolean oldExcludeESet = excludeESet;
    excludeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XmlManipModulePackage.WHERE_OPERATION__EXCLUDE, oldExclude, exclude, !oldExcludeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetExclude()
  {
    boolean oldExclude = exclude;
    boolean oldExcludeESet = excludeESet;
    exclude = EXCLUDE_EDEFAULT;
    excludeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XmlManipModulePackage.WHERE_OPERATION__EXCLUDE, oldExclude, EXCLUDE_EDEFAULT, oldExcludeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetExclude()
  {
    return excludeESet;
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
      case XmlManipModulePackage.WHERE_OPERATION__XPATH:
        return basicSetXPath(null, msgs);
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
      case XmlManipModulePackage.WHERE_OPERATION__XPATH:
        return getXPath();
      case XmlManipModulePackage.WHERE_OPERATION__EXCLUDE:
        return isExclude();
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
      case XmlManipModulePackage.WHERE_OPERATION__XPATH:
        setXPath((ComplexValue)newValue);
        return;
      case XmlManipModulePackage.WHERE_OPERATION__EXCLUDE:
        setExclude((Boolean)newValue);
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
      case XmlManipModulePackage.WHERE_OPERATION__XPATH:
        setXPath((ComplexValue)null);
        return;
      case XmlManipModulePackage.WHERE_OPERATION__EXCLUDE:
        unsetExclude();
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
      case XmlManipModulePackage.WHERE_OPERATION__XPATH:
        return xPath != null;
      case XmlManipModulePackage.WHERE_OPERATION__EXCLUDE:
        return isSetExclude();
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
    result.append(" (exclude: ");
    if (excludeESet) result.append(exclude); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // WhereOperationImpl
