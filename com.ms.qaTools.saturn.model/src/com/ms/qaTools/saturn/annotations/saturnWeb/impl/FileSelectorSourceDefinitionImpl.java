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
package com.ms.qaTools.saturn.annotations.saturnWeb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage;
import com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>File Selector Source Definition</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.FileSelectorSourceDefinitionImpl#getDirectory <em>Directory</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.FileSelectorSourceDefinitionImpl#getFilePattern <em>File Pattern</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.FileSelectorSourceDefinitionImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.annotations.saturnWeb.impl.FileSelectorSourceDefinitionImpl#getSelectorType <em>Selector Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileSelectorSourceDefinitionImpl extends AbstractSourceDefinitionImpl implements
    FileSelectorSourceDefinition
{
  /**
   * The default value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDirectory()
   * @generated
   * @ordered
   */
  protected static final String           DIRECTORY_EDEFAULT     = null;

  /**
   * The cached value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDirectory()
   * @generated
   * @ordered
   */
  protected String                        directory              = DIRECTORY_EDEFAULT;

  /**
   * The default value of the '{@link #getFilePattern() <em>File Pattern</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getFilePattern()
   * @generated
   * @ordered
   */
  protected static final String           FILE_PATTERN_EDEFAULT  = null;

  /**
   * The cached value of the '{@link #getFilePattern() <em>File Pattern</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getFilePattern()
   * @generated
   * @ordered
   */
  protected String                        filePattern            = FILE_PATTERN_EDEFAULT;

  /**
   * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected static final String           DEFAULT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected String                        defaultValue           = DEFAULT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getSelectorType() <em>Selector Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectorType()
   * @generated
   * @ordered
   */
  protected static final SelectorTypeEnum SELECTOR_TYPE_EDEFAULT = SelectorTypeEnum.FILE;

  /**
   * The cached value of the '{@link #getSelectorType() <em>Selector Type</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getSelectorType()
   * @generated
   * @ordered
   */
  protected SelectorTypeEnum              selectorType           = SELECTOR_TYPE_EDEFAULT;

  /**
   * This is true if the Selector Type attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                       selectorTypeESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected FileSelectorSourceDefinitionImpl()
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
    return SaturnWebPackage.Literals.FILE_SELECTOR_SOURCE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(String newDefaultValue)
  {
    String oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__DEFAULT_VALUE, oldDefaultValue, defaultValue));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getDirectory()
  {
    return directory;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDirectory(String newDirectory)
  {
    String oldDirectory = directory;
    directory = newDirectory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__DIRECTORY, oldDirectory, directory));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getFilePattern()
  {
    return filePattern;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setFilePattern(String newFilePattern)
  {
    String oldFilePattern = filePattern;
    filePattern = newFilePattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__FILE_PATTERN, oldFilePattern, filePattern));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SelectorTypeEnum getSelectorType()
  {
    return selectorType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSelectorType(SelectorTypeEnum newSelectorType)
  {
    SelectorTypeEnum oldSelectorType = selectorType;
    selectorType = newSelectorType == null ? SELECTOR_TYPE_EDEFAULT : newSelectorType;
    boolean oldSelectorTypeESet = selectorTypeESet;
    selectorTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__SELECTOR_TYPE, oldSelectorType, selectorType, !oldSelectorTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetSelectorType()
  {
    SelectorTypeEnum oldSelectorType = selectorType;
    boolean oldSelectorTypeESet = selectorTypeESet;
    selectorType = SELECTOR_TYPE_EDEFAULT;
    selectorTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__SELECTOR_TYPE, oldSelectorType, SELECTOR_TYPE_EDEFAULT, oldSelectorTypeESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetSelectorType()
  {
    return selectorTypeESet;
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
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__DIRECTORY:
        return getDirectory();
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__FILE_PATTERN:
        return getFilePattern();
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__DEFAULT_VALUE:
        return getDefaultValue();
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__SELECTOR_TYPE:
        return getSelectorType();
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
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__DIRECTORY:
        setDirectory((String)newValue);
        return;
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__FILE_PATTERN:
        setFilePattern((String)newValue);
        return;
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__DEFAULT_VALUE:
        setDefaultValue((String)newValue);
        return;
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__SELECTOR_TYPE:
        setSelectorType((SelectorTypeEnum)newValue);
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
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__DIRECTORY:
        setDirectory(DIRECTORY_EDEFAULT);
        return;
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__FILE_PATTERN:
        setFilePattern(FILE_PATTERN_EDEFAULT);
        return;
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__DEFAULT_VALUE:
        setDefaultValue(DEFAULT_VALUE_EDEFAULT);
        return;
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__SELECTOR_TYPE:
        unsetSelectorType();
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
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__DIRECTORY:
        return DIRECTORY_EDEFAULT == null ? directory != null : !DIRECTORY_EDEFAULT.equals(directory);
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__FILE_PATTERN:
        return FILE_PATTERN_EDEFAULT == null ? filePattern != null : !FILE_PATTERN_EDEFAULT.equals(filePattern);
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__DEFAULT_VALUE:
        return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION__SELECTOR_TYPE:
        return isSetSelectorType();
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
    result.append(" (directory: ");
    result.append(directory);
    result.append(", filePattern: ");
    result.append(filePattern);
    result.append(", defaultValue: ");
    result.append(defaultValue);
    result.append(", selectorType: ");
    if (selectorTypeESet) result.append(selectorType); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // FileSelectorSourceDefinitionImpl
