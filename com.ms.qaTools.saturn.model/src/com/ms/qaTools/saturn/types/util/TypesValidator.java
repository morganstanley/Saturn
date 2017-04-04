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
package com.ms.qaTools.saturn.types.util;

import com.ms.qaTools.saturn.types.*;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import com.ms.qaTools.saturn.types.AbstractAnnotation;
import com.ms.qaTools.saturn.types.AbstractBatchListener;
import com.ms.qaTools.saturn.types.AbstractListener;
import com.ms.qaTools.saturn.types.AbstractRepetitionHandler;
import com.ms.qaTools.saturn.types.AbstractRunGroupModifier;
import com.ms.qaTools.saturn.types.Column;
import com.ms.qaTools.saturn.types.ColumnTrimEnum;
import com.ms.qaTools.saturn.types.ColumnTypeEnum;
import com.ms.qaTools.saturn.types.Comment;
import com.ms.qaTools.saturn.types.ComplexValueMap;
import com.ms.qaTools.saturn.types.ComplexValuePair;
import com.ms.qaTools.saturn.types.DataSet;
import com.ms.qaTools.saturn.types.DataSetInstance;
import com.ms.qaTools.saturn.types.DataSetResourceDefinition;
import com.ms.qaTools.saturn.types.DeviceResourceDefinition;
import com.ms.qaTools.saturn.types.Empty;
import com.ms.qaTools.saturn.types.InlineDeviceResourceDefinition;
import com.ms.qaTools.saturn.types.InlineNamespaceUriDefinition;
import com.ms.qaTools.saturn.types.InterpretersEnum;
import com.ms.qaTools.saturn.types.ModulesEnum;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.types.RepetitionActionsEnum;
import com.ms.qaTools.saturn.types.ResourceDefinition;
import com.ms.qaTools.saturn.types.ResourcesEnum;
import com.ms.qaTools.saturn.types.RowInstance;
import com.ms.qaTools.saturn.types.SaturnStatusConditionEnum;
import com.ms.qaTools.saturn.types.SaturnStatusEnum;
import com.ms.qaTools.saturn.types.TypesPackage;
import com.ms.qaTools.saturn.types.XmlNamespaceDefinition;
import com.ms.qaTools.saturn.types.XmlUriDefinition;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.types.TypesPackage
 * @generated
 */
public class TypesValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final TypesValidator INSTANCE                        = new TypesValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String         DIAGNOSTIC_SOURCE               = "com.ms.qaTools.saturn.types";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static final int           GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static final int         DIAGNOSTIC_CODE_COUNT           = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
   * The cached base package validator.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected XMLTypeValidator         xmlTypeValidator;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public TypesValidator()
  {
    super();
    xmlTypeValidator = XMLTypeValidator.INSTANCE;
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EPackage getEPackage()
  {
    return TypesPackage.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    switch (classifierID)
    {
      case TypesPackage.ABSTRACT_ANNOTATION:
        return validateAbstractAnnotation((AbstractAnnotation)value, diagnostics, context);
      case TypesPackage.ABSTRACT_BATCH_LISTENER:
        return validateAbstractBatchListener((AbstractBatchListener)value, diagnostics, context);
      case TypesPackage.ABSTRACT_LISTENER:
        return validateAbstractListener((AbstractListener)value, diagnostics, context);
      case TypesPackage.ABSTRACT_REPETITION_HANDLER:
        return validateAbstractRepetitionHandler((AbstractRepetitionHandler)value, diagnostics, context);
      case TypesPackage.ABSTRACT_RUN_GROUP_MODIFIER:
        return validateAbstractRunGroupModifier((AbstractRunGroupModifier)value, diagnostics, context);
      case TypesPackage.COLUMN:
        return validateColumn((Column)value, diagnostics, context);
      case TypesPackage.COMMENT:
        return validateComment((Comment)value, diagnostics, context);
      case TypesPackage.COMPLEX_VALUE_MAP:
        return validateComplexValueMap((ComplexValueMap)value, diagnostics, context);
      case TypesPackage.COMPLEX_VALUE_PAIR:
        return validateComplexValuePair((ComplexValuePair)value, diagnostics, context);
      case TypesPackage.DATABASE_RESOURCE_DEFINITION:
        return validateDatabaseResourceDefinition((DatabaseResourceDefinition)value, diagnostics, context);
      case TypesPackage.DATA_SET:
        return validateDataSet((DataSet)value, diagnostics, context);
      case TypesPackage.DATA_SET_INSTANCE:
        return validateDataSetInstance((DataSetInstance)value, diagnostics, context);
      case TypesPackage.DATA_SET_RESOURCE_DEFINITION:
        return validateDataSetResourceDefinition((DataSetResourceDefinition)value, diagnostics, context);
      case TypesPackage.DEVICE_RESOURCE_DEFINITION:
        return validateDeviceResourceDefinition((DeviceResourceDefinition)value, diagnostics, context);
      case TypesPackage.EMPTY:
        return validateEmpty((Empty)value, diagnostics, context);
      case TypesPackage.INLINE_DEVICE_RESOURCE_DEFINITION:
        return validateInlineDeviceResourceDefinition((InlineDeviceResourceDefinition)value, diagnostics, context);
      case TypesPackage.INLINE_NAMESPACE_URI_DEFINITION:
        return validateInlineNamespaceUriDefinition((InlineNamespaceUriDefinition)value, diagnostics, context);
      case TypesPackage.KRONUS_RESOURCE:
        return validateKronusResource((KronusResource)value, diagnostics, context);
      case TypesPackage.NAMED_RESOURCE_DEFINITION:
        return validateNamedResourceDefinition((NamedResourceDefinition)value, diagnostics, context);
      case TypesPackage.RESOURCE_DEFINITION:
        return validateResourceDefinition((ResourceDefinition)value, diagnostics, context);
      case TypesPackage.ROW_INSTANCE:
        return validateRowInstance((RowInstance)value, diagnostics, context);
      case TypesPackage.XML_NAMESPACE_DEFINITION:
        return validateXmlNamespaceDefinition((XmlNamespaceDefinition)value, diagnostics, context);
      case TypesPackage.XML_URI_DEFINITION:
        return validateXmlUriDefinition((XmlUriDefinition)value, diagnostics, context);
      case TypesPackage.COLUMN_TRIM_ENUM:
        return validateColumnTrimEnum((ColumnTrimEnum)value, diagnostics, context);
      case TypesPackage.COLUMN_TYPE_ENUM:
        return validateColumnTypeEnum((ColumnTypeEnum)value, diagnostics, context);
      case TypesPackage.INTERPRETERS_ENUM:
        return validateInterpretersEnum((InterpretersEnum)value, diagnostics, context);
      case TypesPackage.MODULES_ENUM:
        return validateModulesEnum((ModulesEnum)value, diagnostics, context);
      case TypesPackage.REPETITION_ACTIONS_ENUM:
        return validateRepetitionActionsEnum((RepetitionActionsEnum)value, diagnostics, context);
      case TypesPackage.RESOURCES_ENUM:
        return validateResourcesEnum((ResourcesEnum)value, diagnostics, context);
      case TypesPackage.SATURN_STATUS_CONDITION_ENUM:
        return validateSaturnStatusConditionEnum((SaturnStatusConditionEnum)value, diagnostics, context);
      case TypesPackage.SATURN_STATUS_ENUM:
        return validateSaturnStatusEnum((SaturnStatusEnum)value, diagnostics, context);
      case TypesPackage.COLUMN_TRIM_ENUM_OBJECT:
        return validateColumnTrimEnumObject((ColumnTrimEnum)value, diagnostics, context);
      case TypesPackage.COLUMN_TYPE_ENUM_OBJECT:
        return validateColumnTypeEnumObject((ColumnTypeEnum)value, diagnostics, context);
      case TypesPackage.INTERPRETERS_ENUM_OBJECT:
        return validateInterpretersEnumObject((InterpretersEnum)value, diagnostics, context);
      case TypesPackage.MODULES_ENUM_OBJECT:
        return validateModulesEnumObject((ModulesEnum)value, diagnostics, context);
      case TypesPackage.OBJECT_ID:
        return validateObjectId((String)value, diagnostics, context);
      case TypesPackage.OBJECT_NAME:
        return validateObjectName((String)value, diagnostics, context);
      case TypesPackage.REPETITION_ACTIONS_ENUM_OBJECT:
        return validateRepetitionActionsEnumObject((RepetitionActionsEnum)value, diagnostics, context);
      case TypesPackage.RESOURCES_ENUM_OBJECT:
        return validateResourcesEnumObject((ResourcesEnum)value, diagnostics, context);
      case TypesPackage.SATURN_STATUS_CONDITION_ENUM_OBJECT:
        return validateSaturnStatusConditionEnumObject((SaturnStatusConditionEnum)value, diagnostics, context);
      case TypesPackage.SATURN_STATUS_ENUM_OBJECT:
        return validateSaturnStatusEnumObject((SaturnStatusEnum)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbstractAnnotation(AbstractAnnotation abstractAnnotation, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(abstractAnnotation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbstractBatchListener(AbstractBatchListener abstractBatchListener,
      DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(abstractBatchListener, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbstractListener(AbstractListener abstractListener, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(abstractListener, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbstractRepetitionHandler(AbstractRepetitionHandler abstractRepetitionHandler,
      DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(abstractRepetitionHandler, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAbstractRunGroupModifier(AbstractRunGroupModifier abstractRunGroupModifier,
      DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(abstractRunGroupModifier, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(column, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(comment, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateComplexValueMap(ComplexValueMap complexValueMap, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(complexValueMap, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateComplexValuePair(ComplexValuePair complexValuePair, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(complexValuePair, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDatabaseResourceDefinition(DatabaseResourceDefinition databaseResourceDefinition, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(databaseResourceDefinition, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDataSet(DataSet dataSet, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(dataSet, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDataSetInstance(DataSetInstance dataSetInstance, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(dataSetInstance, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDataSetResourceDefinition(DataSetResourceDefinition dataSetResourceDefinition,
      DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(dataSetResourceDefinition, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeviceResourceDefinition(DeviceResourceDefinition deviceResourceDefinition,
      DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(deviceResourceDefinition, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEmpty(Empty empty, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(empty, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInlineDeviceResourceDefinition(InlineDeviceResourceDefinition inlineDeviceResourceDefinition,
      DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(inlineDeviceResourceDefinition, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInlineNamespaceUriDefinition(InlineNamespaceUriDefinition inlineNamespaceUriDefinition,
      DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(inlineNamespaceUriDefinition, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateKronusResource(KronusResource kronusResource, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(kronusResource, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNamedResourceDefinition(NamedResourceDefinition namedResourceDefinition,
      DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(namedResourceDefinition, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateResourceDefinition(ResourceDefinition resourceDefinition, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(resourceDefinition, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRowInstance(RowInstance rowInstance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(rowInstance, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateXmlNamespaceDefinition(XmlNamespaceDefinition xmlNamespaceDefinition,
      DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(xmlNamespaceDefinition, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateXmlUriDefinition(XmlUriDefinition xmlUriDefinition, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(xmlUriDefinition, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateColumnTrimEnum(ColumnTrimEnum columnTrimEnum, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateColumnTypeEnum(ColumnTypeEnum columnTypeEnum, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInterpretersEnum(InterpretersEnum interpretersEnum, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateModulesEnum(ModulesEnum modulesEnum, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRepetitionActionsEnum(RepetitionActionsEnum repetitionActionsEnum,
      DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateResourcesEnum(ResourcesEnum resourcesEnum, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSaturnStatusConditionEnum(SaturnStatusConditionEnum saturnStatusConditionEnum,
      DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSaturnStatusEnum(SaturnStatusEnum saturnStatusEnum, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateColumnTrimEnumObject(ColumnTrimEnum columnTrimEnumObject, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateColumnTypeEnumObject(ColumnTypeEnum columnTypeEnumObject, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInterpretersEnumObject(InterpretersEnum interpretersEnumObject, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateModulesEnumObject(ModulesEnum modulesEnumObject, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObjectId(String objectId, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateObjectId_Pattern(objectId, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @see #validateObjectId_Pattern
   */
  public static final PatternMatcher [][] OBJECT_ID__PATTERN__VALUES = new PatternMatcher [][]
    {
      new PatternMatcher []
      {
        XMLTypeUtil.createPatternMatcher("[A-Za-z0-9_]*")
      }
    };

  /**
   * Validates the Pattern constraint of '<em>Object Id</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObjectId_Pattern(String objectId, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validatePattern(TypesPackage.Literals.OBJECT_ID, objectId, OBJECT_ID__PATTERN__VALUES, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObjectName(String objectName, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateObjectName_Pattern(objectName, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @see #validateObjectName_Pattern
   */
  public static final PatternMatcher [][] OBJECT_NAME__PATTERN__VALUES = new PatternMatcher [][]
    {
      new PatternMatcher []
      {
        XMLTypeUtil.createPatternMatcher("[A-Za-z0-9_]*")
      }
    };

  /**
   * Validates the Pattern constraint of '<em>Object Name</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateObjectName_Pattern(String objectName, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validatePattern(TypesPackage.Literals.OBJECT_NAME, objectName, OBJECT_NAME__PATTERN__VALUES, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRepetitionActionsEnumObject(RepetitionActionsEnum repetitionActionsEnumObject,
      DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateResourcesEnumObject(ResourcesEnum resourcesEnumObject, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSaturnStatusConditionEnumObject(SaturnStatusConditionEnum saturnStatusConditionEnumObject,
      DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSaturnStatusEnumObject(SaturnStatusEnum saturnStatusEnumObject, DiagnosticChain diagnostics,
      Map<Object, Object> context)
  {
    return true;
  }

  /**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    // TODO
    // Specialize this to return a resource locator for messages specific to this validator.
    // Ensure that you remove @generated or mark it @generated NOT
    return super.getResourceLocator();
  }

} // TypesValidator
