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
package com.ms.qaTools.saturn.values.impl;

import com.ms.qaTools.saturn.values.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValuesFactoryImpl extends EFactoryImpl implements ValuesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ValuesFactory init()
  {
    try
    {
      ValuesFactory theValuesFactory = (ValuesFactory)EPackage.Registry.INSTANCE.getEFactory(ValuesPackage.eNS_URI);
      if (theValuesFactory != null)
      {
        return theValuesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ValuesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ValuesPackage.CELL_COMPLEX_VALUE: return createCellComplexValue();
      case ValuesPackage.CODE_COMPLEX_VALUE: return createCodeComplexValue();
      case ValuesPackage.COMPLEX_VALUE: return createComplexValue();
      case ValuesPackage.FALLIBLE_COMPLEX_VALUE: return createFallibleComplexValue();
      case ValuesPackage.FIX_COMPLEX_VALUE: return createFIXComplexValue();
      case ValuesPackage.JSON_COMPLEX_VALUE: return createJSONComplexValue();
      case ValuesPackage.PROPERTY_COMPLEX_VALUE: return createPropertyComplexValue();
      case ValuesPackage.REFERENCE_COMPLEX_VALUE: return createReferenceComplexValue();
      case ValuesPackage.RUN_NUMBER_COMPLEX_VALUE: return createRunNumberComplexValue();
      case ValuesPackage.TEXT_COMPLEX_VALUE: return createTextComplexValue();
      case ValuesPackage.XPATH_COMPLEX_VALUE: return createXPathComplexValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ValuesPackage.FAIL_BEHAVIORS_ENUM:
        return createFailBehaviorsEnumFromString(eDataType, initialValue);
      case ValuesPackage.XPATH_RETURN_TYPE_ENUM:
        return createXPathReturnTypeEnumFromString(eDataType, initialValue);
      case ValuesPackage.FAIL_BEHAVIORS_ENUM_OBJECT:
        return createFailBehaviorsEnumObjectFromString(eDataType, initialValue);
      case ValuesPackage.XPATH_RETURN_TYPE_ENUM_OBJECT:
        return createXPathReturnTypeEnumObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ValuesPackage.FAIL_BEHAVIORS_ENUM:
        return convertFailBehaviorsEnumToString(eDataType, instanceValue);
      case ValuesPackage.XPATH_RETURN_TYPE_ENUM:
        return convertXPathReturnTypeEnumToString(eDataType, instanceValue);
      case ValuesPackage.FAIL_BEHAVIORS_ENUM_OBJECT:
        return convertFailBehaviorsEnumObjectToString(eDataType, instanceValue);
      case ValuesPackage.XPATH_RETURN_TYPE_ENUM_OBJECT:
        return convertXPathReturnTypeEnumObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellComplexValue createCellComplexValue()
  {
    CellComplexValueImpl cellComplexValue = new CellComplexValueImpl();
    return cellComplexValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeComplexValue createCodeComplexValue()
  {
    CodeComplexValueImpl codeComplexValue = new CodeComplexValueImpl();
    return codeComplexValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue createComplexValue()
  {
    ComplexValueImpl complexValue = new ComplexValueImpl();
    return complexValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FallibleComplexValue createFallibleComplexValue()
  {
    FallibleComplexValueImpl fallibleComplexValue = new FallibleComplexValueImpl();
    return fallibleComplexValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FIXComplexValue createFIXComplexValue()
  {
    FIXComplexValueImpl fixComplexValue = new FIXComplexValueImpl();
    return fixComplexValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSONComplexValue createJSONComplexValue()
  {
    JSONComplexValueImpl jsonComplexValue = new JSONComplexValueImpl();
    return jsonComplexValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyComplexValue createPropertyComplexValue()
  {
    PropertyComplexValueImpl propertyComplexValue = new PropertyComplexValueImpl();
    return propertyComplexValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceComplexValue createReferenceComplexValue()
  {
    ReferenceComplexValueImpl referenceComplexValue = new ReferenceComplexValueImpl();
    return referenceComplexValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunNumberComplexValue createRunNumberComplexValue()
  {
    RunNumberComplexValueImpl runNumberComplexValue = new RunNumberComplexValueImpl();
    return runNumberComplexValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextComplexValue createTextComplexValue()
  {
    TextComplexValueImpl textComplexValue = new TextComplexValueImpl();
    return textComplexValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XPathComplexValue createXPathComplexValue()
  {
    XPathComplexValueImpl xPathComplexValue = new XPathComplexValueImpl();
    return xPathComplexValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FailBehaviorsEnum createFailBehaviorsEnumFromString(EDataType eDataType, String initialValue)
  {
    FailBehaviorsEnum result = FailBehaviorsEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFailBehaviorsEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XPathReturnTypeEnum createXPathReturnTypeEnumFromString(EDataType eDataType, String initialValue)
  {
    XPathReturnTypeEnum result = XPathReturnTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertXPathReturnTypeEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FailBehaviorsEnum createFailBehaviorsEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createFailBehaviorsEnumFromString(ValuesPackage.Literals.FAIL_BEHAVIORS_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFailBehaviorsEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertFailBehaviorsEnumToString(ValuesPackage.Literals.FAIL_BEHAVIORS_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XPathReturnTypeEnum createXPathReturnTypeEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createXPathReturnTypeEnumFromString(ValuesPackage.Literals.XPATH_RETURN_TYPE_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertXPathReturnTypeEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertXPathReturnTypeEnumToString(ValuesPackage.Literals.XPATH_RETURN_TYPE_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuesPackage getValuesPackage()
  {
    return (ValuesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ValuesPackage getPackage()
  {
    return ValuesPackage.eINSTANCE;
  }

} //ValuesFactoryImpl
