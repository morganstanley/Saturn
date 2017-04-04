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
package com.ms.qaTools.saturn.types.impl;

import com.ms.qaTools.saturn.types.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.ms.qaTools.saturn.types.AbstractAnnotation;
import com.ms.qaTools.saturn.types.AbstractRepetitionHandler;
import com.ms.qaTools.saturn.types.Column;
import com.ms.qaTools.saturn.types.ColumnTrimEnum;
import com.ms.qaTools.saturn.types.ColumnTypeEnum;
import com.ms.qaTools.saturn.types.Comment;
import com.ms.qaTools.saturn.types.ComplexValueMap;
import com.ms.qaTools.saturn.types.ComplexValuePair;
import com.ms.qaTools.saturn.types.DataSet;
import com.ms.qaTools.saturn.types.DataSetInstance;
import com.ms.qaTools.saturn.types.Empty;
import com.ms.qaTools.saturn.types.InlineDeviceResourceDefinition;
import com.ms.qaTools.saturn.types.InlineNamespaceUriDefinition;
import com.ms.qaTools.saturn.types.InterpretersEnum;
import com.ms.qaTools.saturn.types.ModulesEnum;
import com.ms.qaTools.saturn.types.RepetitionActionsEnum;
import com.ms.qaTools.saturn.types.ResourcesEnum;
import com.ms.qaTools.saturn.types.RowInstance;
import com.ms.qaTools.saturn.types.SaturnStatusConditionEnum;
import com.ms.qaTools.saturn.types.SaturnStatusEnum;
import com.ms.qaTools.saturn.types.TypesFactory;
import com.ms.qaTools.saturn.types.TypesPackage;
import com.ms.qaTools.saturn.types.XmlNamespaceDefinition;
import com.ms.qaTools.saturn.types.XmlUriDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class TypesFactoryImpl extends EFactoryImpl implements TypesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static TypesFactory init()
  {
    try
    {
      TypesFactory theTypesFactory = (TypesFactory)EPackage.Registry.INSTANCE.getEFactory(TypesPackage.eNS_URI);
      if (theTypesFactory != null)
      {
        return theTypesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TypesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TypesFactoryImpl()
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
      case TypesPackage.ABSTRACT_ANNOTATION: return createAbstractAnnotation();
      case TypesPackage.ABSTRACT_REPETITION_HANDLER: return createAbstractRepetitionHandler();
      case TypesPackage.COLUMN: return createColumn();
      case TypesPackage.COMMENT: return createComment();
      case TypesPackage.COMPLEX_VALUE_MAP: return createComplexValueMap();
      case TypesPackage.COMPLEX_VALUE_PAIR: return createComplexValuePair();
      case TypesPackage.DATA_SET: return createDataSet();
      case TypesPackage.DATA_SET_INSTANCE: return createDataSetInstance();
      case TypesPackage.EMPTY: return createEmpty();
      case TypesPackage.INLINE_DEVICE_RESOURCE_DEFINITION: return createInlineDeviceResourceDefinition();
      case TypesPackage.INLINE_NAMESPACE_URI_DEFINITION: return createInlineNamespaceUriDefinition();
      case TypesPackage.KRONUS_RESOURCE: return createKronusResource();
      case TypesPackage.ROW_INSTANCE: return createRowInstance();
      case TypesPackage.XML_NAMESPACE_DEFINITION: return createXmlNamespaceDefinition();
      case TypesPackage.XML_URI_DEFINITION: return createXmlUriDefinition();
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
      case TypesPackage.COLUMN_TRIM_ENUM:
        return createColumnTrimEnumFromString(eDataType, initialValue);
      case TypesPackage.COLUMN_TYPE_ENUM:
        return createColumnTypeEnumFromString(eDataType, initialValue);
      case TypesPackage.INTERPRETERS_ENUM:
        return createInterpretersEnumFromString(eDataType, initialValue);
      case TypesPackage.MODULES_ENUM:
        return createModulesEnumFromString(eDataType, initialValue);
      case TypesPackage.REPETITION_ACTIONS_ENUM:
        return createRepetitionActionsEnumFromString(eDataType, initialValue);
      case TypesPackage.RESOURCES_ENUM:
        return createResourcesEnumFromString(eDataType, initialValue);
      case TypesPackage.SATURN_STATUS_CONDITION_ENUM:
        return createSaturnStatusConditionEnumFromString(eDataType, initialValue);
      case TypesPackage.SATURN_STATUS_ENUM:
        return createSaturnStatusEnumFromString(eDataType, initialValue);
      case TypesPackage.COLUMN_TRIM_ENUM_OBJECT:
        return createColumnTrimEnumObjectFromString(eDataType, initialValue);
      case TypesPackage.COLUMN_TYPE_ENUM_OBJECT:
        return createColumnTypeEnumObjectFromString(eDataType, initialValue);
      case TypesPackage.INTERPRETERS_ENUM_OBJECT:
        return createInterpretersEnumObjectFromString(eDataType, initialValue);
      case TypesPackage.MODULES_ENUM_OBJECT:
        return createModulesEnumObjectFromString(eDataType, initialValue);
      case TypesPackage.OBJECT_ID:
        return createObjectIdFromString(eDataType, initialValue);
      case TypesPackage.OBJECT_NAME:
        return createObjectNameFromString(eDataType, initialValue);
      case TypesPackage.REPETITION_ACTIONS_ENUM_OBJECT:
        return createRepetitionActionsEnumObjectFromString(eDataType, initialValue);
      case TypesPackage.RESOURCES_ENUM_OBJECT:
        return createResourcesEnumObjectFromString(eDataType, initialValue);
      case TypesPackage.SATURN_STATUS_CONDITION_ENUM_OBJECT:
        return createSaturnStatusConditionEnumObjectFromString(eDataType, initialValue);
      case TypesPackage.SATURN_STATUS_ENUM_OBJECT:
        return createSaturnStatusEnumObjectFromString(eDataType, initialValue);
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
      case TypesPackage.COLUMN_TRIM_ENUM:
        return convertColumnTrimEnumToString(eDataType, instanceValue);
      case TypesPackage.COLUMN_TYPE_ENUM:
        return convertColumnTypeEnumToString(eDataType, instanceValue);
      case TypesPackage.INTERPRETERS_ENUM:
        return convertInterpretersEnumToString(eDataType, instanceValue);
      case TypesPackage.MODULES_ENUM:
        return convertModulesEnumToString(eDataType, instanceValue);
      case TypesPackage.REPETITION_ACTIONS_ENUM:
        return convertRepetitionActionsEnumToString(eDataType, instanceValue);
      case TypesPackage.RESOURCES_ENUM:
        return convertResourcesEnumToString(eDataType, instanceValue);
      case TypesPackage.SATURN_STATUS_CONDITION_ENUM:
        return convertSaturnStatusConditionEnumToString(eDataType, instanceValue);
      case TypesPackage.SATURN_STATUS_ENUM:
        return convertSaturnStatusEnumToString(eDataType, instanceValue);
      case TypesPackage.COLUMN_TRIM_ENUM_OBJECT:
        return convertColumnTrimEnumObjectToString(eDataType, instanceValue);
      case TypesPackage.COLUMN_TYPE_ENUM_OBJECT:
        return convertColumnTypeEnumObjectToString(eDataType, instanceValue);
      case TypesPackage.INTERPRETERS_ENUM_OBJECT:
        return convertInterpretersEnumObjectToString(eDataType, instanceValue);
      case TypesPackage.MODULES_ENUM_OBJECT:
        return convertModulesEnumObjectToString(eDataType, instanceValue);
      case TypesPackage.OBJECT_ID:
        return convertObjectIdToString(eDataType, instanceValue);
      case TypesPackage.OBJECT_NAME:
        return convertObjectNameToString(eDataType, instanceValue);
      case TypesPackage.REPETITION_ACTIONS_ENUM_OBJECT:
        return convertRepetitionActionsEnumObjectToString(eDataType, instanceValue);
      case TypesPackage.RESOURCES_ENUM_OBJECT:
        return convertResourcesEnumObjectToString(eDataType, instanceValue);
      case TypesPackage.SATURN_STATUS_CONDITION_ENUM_OBJECT:
        return convertSaturnStatusConditionEnumObjectToString(eDataType, instanceValue);
      case TypesPackage.SATURN_STATUS_ENUM_OBJECT:
        return convertSaturnStatusEnumObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractAnnotation createAbstractAnnotation()
  {
    AbstractAnnotationImpl abstractAnnotation = new AbstractAnnotationImpl();
    return abstractAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AbstractRepetitionHandler createAbstractRepetitionHandler()
  {
    AbstractRepetitionHandlerImpl abstractRepetitionHandler = new AbstractRepetitionHandlerImpl();
    return abstractRepetitionHandler;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Column createColumn()
  {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValueMap createComplexValueMap()
  {
    ComplexValueMapImpl complexValueMap = new ComplexValueMapImpl();
    return complexValueMap;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValuePair createComplexValuePair()
  {
    ComplexValuePairImpl complexValuePair = new ComplexValuePairImpl();
    return complexValuePair;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataSet createDataSet()
  {
    DataSetImpl dataSet = new DataSetImpl();
    return dataSet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DataSetInstance createDataSetInstance()
  {
    DataSetInstanceImpl dataSetInstance = new DataSetInstanceImpl();
    return dataSetInstance;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Empty createEmpty()
  {
    EmptyImpl empty = new EmptyImpl();
    return empty;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InlineDeviceResourceDefinition createInlineDeviceResourceDefinition()
  {
    InlineDeviceResourceDefinitionImpl inlineDeviceResourceDefinition = new InlineDeviceResourceDefinitionImpl();
    return inlineDeviceResourceDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InlineNamespaceUriDefinition createInlineNamespaceUriDefinition()
  {
    InlineNamespaceUriDefinitionImpl inlineNamespaceUriDefinition = new InlineNamespaceUriDefinitionImpl();
    return inlineNamespaceUriDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KronusResource createKronusResource()
  {
    KronusResourceImpl kronusResource = new KronusResourceImpl();
    return kronusResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RowInstance createRowInstance()
  {
    RowInstanceImpl rowInstance = new RowInstanceImpl();
    return rowInstance;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlNamespaceDefinition createXmlNamespaceDefinition()
  {
    XmlNamespaceDefinitionImpl xmlNamespaceDefinition = new XmlNamespaceDefinitionImpl();
    return xmlNamespaceDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public XmlUriDefinition createXmlUriDefinition()
  {
    XmlUriDefinitionImpl xmlUriDefinition = new XmlUriDefinitionImpl();
    return xmlUriDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ColumnTrimEnum createColumnTrimEnumFromString(EDataType eDataType, String initialValue)
  {
    ColumnTrimEnum result = ColumnTrimEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertColumnTrimEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ColumnTypeEnum createColumnTypeEnumFromString(EDataType eDataType, String initialValue)
  {
    ColumnTypeEnum result = ColumnTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertColumnTypeEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InterpretersEnum createInterpretersEnumFromString(EDataType eDataType, String initialValue)
  {
    InterpretersEnum result = InterpretersEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertInterpretersEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ModulesEnum createModulesEnumFromString(EDataType eDataType, String initialValue)
  {
    ModulesEnum result = ModulesEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertModulesEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RepetitionActionsEnum createRepetitionActionsEnumFromString(EDataType eDataType, String initialValue)
  {
    RepetitionActionsEnum result = RepetitionActionsEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertRepetitionActionsEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourcesEnum createResourcesEnumFromString(EDataType eDataType, String initialValue)
  {
    ResourcesEnum result = ResourcesEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertResourcesEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnStatusConditionEnum createSaturnStatusConditionEnumFromString(EDataType eDataType, String initialValue)
  {
    SaturnStatusConditionEnum result = SaturnStatusConditionEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertSaturnStatusConditionEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnStatusEnum createSaturnStatusEnumFromString(EDataType eDataType, String initialValue)
  {
    SaturnStatusEnum result = SaturnStatusEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertSaturnStatusEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ColumnTrimEnum createColumnTrimEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createColumnTrimEnumFromString(TypesPackage.Literals.COLUMN_TRIM_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertColumnTrimEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertColumnTrimEnumToString(TypesPackage.Literals.COLUMN_TRIM_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ColumnTypeEnum createColumnTypeEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createColumnTypeEnumFromString(TypesPackage.Literals.COLUMN_TYPE_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertColumnTypeEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertColumnTypeEnumToString(TypesPackage.Literals.COLUMN_TYPE_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InterpretersEnum createInterpretersEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createInterpretersEnumFromString(TypesPackage.Literals.INTERPRETERS_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertInterpretersEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertInterpretersEnumToString(TypesPackage.Literals.INTERPRETERS_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ModulesEnum createModulesEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createModulesEnumFromString(TypesPackage.Literals.MODULES_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertModulesEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertModulesEnumToString(TypesPackage.Literals.MODULES_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String createObjectIdFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertObjectIdToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String createObjectNameFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertObjectNameToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RepetitionActionsEnum createRepetitionActionsEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createRepetitionActionsEnumFromString(TypesPackage.Literals.REPETITION_ACTIONS_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertRepetitionActionsEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertRepetitionActionsEnumToString(TypesPackage.Literals.REPETITION_ACTIONS_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourcesEnum createResourcesEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createResourcesEnumFromString(TypesPackage.Literals.RESOURCES_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertResourcesEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertResourcesEnumToString(TypesPackage.Literals.RESOURCES_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnStatusConditionEnum createSaturnStatusConditionEnumObjectFromString(EDataType eDataType,
      String initialValue)
  {
    return createSaturnStatusConditionEnumFromString(TypesPackage.Literals.SATURN_STATUS_CONDITION_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertSaturnStatusConditionEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertSaturnStatusConditionEnumToString(TypesPackage.Literals.SATURN_STATUS_CONDITION_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SaturnStatusEnum createSaturnStatusEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createSaturnStatusEnumFromString(TypesPackage.Literals.SATURN_STATUS_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertSaturnStatusEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertSaturnStatusEnumToString(TypesPackage.Literals.SATURN_STATUS_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TypesPackage getTypesPackage()
  {
    return (TypesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TypesPackage getPackage()
  {
    return TypesPackage.eINSTANCE;
  }

} // TypesFactoryImpl
