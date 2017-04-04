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

import com.ms.qaTools.saturn.annotations.saturnWeb.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.annotations.saturnWeb.AbstractSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.AbstractTargetDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.DropDownOption;
import com.ms.qaTools.saturn.annotations.saturnWeb.DropDownSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.FileSelectorSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration;
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebFactory;
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage;
import com.ms.qaTools.saturn.annotations.saturnWeb.SelectorTypeEnum;
import com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueEnvVarTargetDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueTargetDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.TextSourceDefinition;
import com.ms.qaTools.saturn.annotations.saturnWeb.ValueDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class SaturnWebFactoryImpl extends EFactoryImpl implements SaturnWebFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static SaturnWebFactory init()
  {
    try
    {
      SaturnWebFactory theSaturnWebFactory = (SaturnWebFactory)EPackage.Registry.INSTANCE.getEFactory(SaturnWebPackage.eNS_URI);
      if (theSaturnWebFactory != null)
      {
        return theSaturnWebFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SaturnWebFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnWebFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SaturnWebPackage.ABSTRACT_SOURCE_DEFINITION: return createAbstractSourceDefinition();
      case SaturnWebPackage.ABSTRACT_TARGET_DEFINITION: return createAbstractTargetDefinition();
      case SaturnWebPackage.DROP_DOWN_OPTION: return createDropDownOption();
      case SaturnWebPackage.DROP_DOWN_SOURCE_DEFINITION: return createDropDownSourceDefinition();
      case SaturnWebPackage.FILE_SELECTOR_SOURCE_DEFINITION: return createFileSelectorSourceDefinition();
      case SaturnWebPackage.SATURN_WEB_CONFIGURATION: return createSaturnWebConfiguration();
      case SaturnWebPackage.SINGLE_VALUE_ENV_VAR_TARGET_DEFINITION: return createSingleValueEnvVarTargetDefinition();
      case SaturnWebPackage.SINGLE_VALUE_TARGET_DEFINITION: return createSingleValueTargetDefinition();
      case SaturnWebPackage.TEXT_SOURCE_DEFINITION: return createTextSourceDefinition();
      case SaturnWebPackage.VALUE_DEFINITION: return createValueDefinition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SaturnWebPackage.SELECTOR_TYPE_ENUM:
        return createSelectorTypeEnumFromString(eDataType, initialValue);
      case SaturnWebPackage.SELECTOR_TYPE_ENUM_OBJECT:
        return createSelectorTypeEnumObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SaturnWebPackage.SELECTOR_TYPE_ENUM:
        return convertSelectorTypeEnumToString(eDataType, instanceValue);
      case SaturnWebPackage.SELECTOR_TYPE_ENUM_OBJECT:
        return convertSelectorTypeEnumObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractSourceDefinition createAbstractSourceDefinition()
  {
    AbstractSourceDefinitionImpl abstractSourceDefinition = new AbstractSourceDefinitionImpl();
    return abstractSourceDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractTargetDefinition createAbstractTargetDefinition()
  {
    AbstractTargetDefinitionImpl abstractTargetDefinition = new AbstractTargetDefinitionImpl();
    return abstractTargetDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DropDownOption createDropDownOption()
  {
    DropDownOptionImpl dropDownOption = new DropDownOptionImpl();
    return dropDownOption;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DropDownSourceDefinition createDropDownSourceDefinition()
  {
    DropDownSourceDefinitionImpl dropDownSourceDefinition = new DropDownSourceDefinitionImpl();
    return dropDownSourceDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public FileSelectorSourceDefinition createFileSelectorSourceDefinition()
  {
    FileSelectorSourceDefinitionImpl fileSelectorSourceDefinition = new FileSelectorSourceDefinitionImpl();
    return fileSelectorSourceDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnWebConfiguration createSaturnWebConfiguration()
  {
    SaturnWebConfigurationImpl saturnWebConfiguration = new SaturnWebConfigurationImpl();
    return saturnWebConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SingleValueEnvVarTargetDefinition createSingleValueEnvVarTargetDefinition()
  {
    SingleValueEnvVarTargetDefinitionImpl singleValueEnvVarTargetDefinition = new SingleValueEnvVarTargetDefinitionImpl();
    return singleValueEnvVarTargetDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SingleValueTargetDefinition createSingleValueTargetDefinition()
  {
    SingleValueTargetDefinitionImpl singleValueTargetDefinition = new SingleValueTargetDefinitionImpl();
    return singleValueTargetDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TextSourceDefinition createTextSourceDefinition()
  {
    TextSourceDefinitionImpl textSourceDefinition = new TextSourceDefinitionImpl();
    return textSourceDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ValueDefinition createValueDefinition()
  {
    ValueDefinitionImpl valueDefinition = new ValueDefinitionImpl();
    return valueDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SelectorTypeEnum createSelectorTypeEnumFromString(EDataType eDataType, String initialValue)
  {
    SelectorTypeEnum result = SelectorTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertSelectorTypeEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SelectorTypeEnum createSelectorTypeEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createSelectorTypeEnumFromString(SaturnWebPackage.Literals.SELECTOR_TYPE_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertSelectorTypeEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertSelectorTypeEnumToString(SaturnWebPackage.Literals.SELECTOR_TYPE_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnWebPackage getSaturnWebPackage()
  {
    return (SaturnWebPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SaturnWebPackage getPackage()
  {
    return SaturnWebPackage.eINSTANCE;
  }

} // SaturnWebFactoryImpl
