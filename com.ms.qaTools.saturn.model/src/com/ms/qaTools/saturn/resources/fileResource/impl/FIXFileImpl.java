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
package com.ms.qaTools.saturn.resources.fileResource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.resources.fileResource.FIXFile;
import com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>FIX File</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.FIXFileImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.FIXFileImpl#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.resources.fileResource.impl.FIXFileImpl#isDoValidation <em>Do Validation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FIXFileImpl extends DataSetFileImpl implements FIXFile
{
  /**
   * The cached value of the '{@link #getSeparator() <em>Separator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeparator()
   * @generated
   * @ordered
   */
  protected ComplexValue         separator;

  /**
   * The cached value of the '{@link #getDictionary() <em>Dictionary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDictionary()
   * @generated
   * @ordered
   */
  protected ResourceDefinition dictionary;

  /**
   * The default value of the '{@link #isDoValidation() <em>Do Validation</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isDoValidation()
   * @generated
   * @ordered
   */
  protected static final boolean DO_VALIDATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDoValidation() <em>Do Validation</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isDoValidation()
   * @generated
   * @ordered
   */
  protected boolean              doValidation           = DO_VALIDATION_EDEFAULT;

  /**
   * This is true if the Do Validation attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              doValidationESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected FIXFileImpl()
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
    return FileResourcePackage.Literals.FIX_FILE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getSeparator()
  {
    return separator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSeparator(ComplexValue newSeparator, NotificationChain msgs)
  {
    ComplexValue oldSeparator = separator;
    separator = newSeparator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FileResourcePackage.FIX_FILE__SEPARATOR, oldSeparator, newSeparator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSeparator(ComplexValue newSeparator)
  {
    if (newSeparator != separator)
    {
      NotificationChain msgs = null;
      if (separator != null)
        msgs = ((InternalEObject)separator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.FIX_FILE__SEPARATOR, null, msgs);
      if (newSeparator != null)
        msgs = ((InternalEObject)newSeparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.FIX_FILE__SEPARATOR, null, msgs);
      msgs = basicSetSeparator(newSeparator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.FIX_FILE__SEPARATOR, newSeparator, newSeparator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getDictionary()
  {
    return dictionary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDictionary(ResourceDefinition newDictionary, NotificationChain msgs)
  {
    ResourceDefinition oldDictionary = dictionary;
    dictionary = newDictionary;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FileResourcePackage.FIX_FILE__DICTIONARY, oldDictionary, newDictionary);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDictionary(ResourceDefinition newDictionary)
  {
    if (newDictionary != dictionary)
    {
      NotificationChain msgs = null;
      if (dictionary != null)
        msgs = ((InternalEObject)dictionary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.FIX_FILE__DICTIONARY, null, msgs);
      if (newDictionary != null)
        msgs = ((InternalEObject)newDictionary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FileResourcePackage.FIX_FILE__DICTIONARY, null, msgs);
      msgs = basicSetDictionary(newDictionary, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.FIX_FILE__DICTIONARY, newDictionary, newDictionary));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isDoValidation()
  {
    return doValidation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDoValidation(boolean newDoValidation)
  {
    boolean oldDoValidation = doValidation;
    doValidation = newDoValidation;
    boolean oldDoValidationESet = doValidationESet;
    doValidationESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FileResourcePackage.FIX_FILE__DO_VALIDATION, oldDoValidation, doValidation, !oldDoValidationESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetDoValidation()
  {
    boolean oldDoValidation = doValidation;
    boolean oldDoValidationESet = doValidationESet;
    doValidation = DO_VALIDATION_EDEFAULT;
    doValidationESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, FileResourcePackage.FIX_FILE__DO_VALIDATION, oldDoValidation, DO_VALIDATION_EDEFAULT, oldDoValidationESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDoValidation()
  {
    return doValidationESet;
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
      case FileResourcePackage.FIX_FILE__SEPARATOR:
        return basicSetSeparator(null, msgs);
      case FileResourcePackage.FIX_FILE__DICTIONARY:
        return basicSetDictionary(null, msgs);
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
      case FileResourcePackage.FIX_FILE__SEPARATOR:
        return getSeparator();
      case FileResourcePackage.FIX_FILE__DICTIONARY:
        return getDictionary();
      case FileResourcePackage.FIX_FILE__DO_VALIDATION:
        return isDoValidation();
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
      case FileResourcePackage.FIX_FILE__SEPARATOR:
        setSeparator((ComplexValue)newValue);
        return;
      case FileResourcePackage.FIX_FILE__DICTIONARY:
        setDictionary((ResourceDefinition)newValue);
        return;
      case FileResourcePackage.FIX_FILE__DO_VALIDATION:
        setDoValidation((Boolean)newValue);
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
      case FileResourcePackage.FIX_FILE__SEPARATOR:
        setSeparator((ComplexValue)null);
        return;
      case FileResourcePackage.FIX_FILE__DICTIONARY:
        setDictionary((ResourceDefinition)null);
        return;
      case FileResourcePackage.FIX_FILE__DO_VALIDATION:
        unsetDoValidation();
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
      case FileResourcePackage.FIX_FILE__SEPARATOR:
        return separator != null;
      case FileResourcePackage.FIX_FILE__DICTIONARY:
        return dictionary != null;
      case FileResourcePackage.FIX_FILE__DO_VALIDATION:
        return isSetDoValidation();
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
    result.append(" (doValidation: ");
    if (doValidationESet) result.append(doValidation); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // FIXFileImpl
