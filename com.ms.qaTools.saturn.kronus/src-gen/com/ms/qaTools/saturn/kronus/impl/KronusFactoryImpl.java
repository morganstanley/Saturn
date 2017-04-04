/**
 */
package com.ms.qaTools.saturn.kronus.impl;

import com.ms.qaTools.saturn.kronus.*;

import org.eclipse.emf.ecore.EClass;
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
public class KronusFactoryImpl extends EFactoryImpl implements KronusFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KronusFactory init()
  {
    try
    {
      KronusFactory theKronusFactory = (KronusFactory)EPackage.Registry.INSTANCE.getEFactory(KronusPackage.eNS_URI);
      if (theKronusFactory != null)
      {
        return theKronusFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new KronusFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KronusFactoryImpl()
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
      case KronusPackage.TOP_LEVEL_KRONUS: return createTopLevelKronus();
      case KronusPackage.KRONUS: return createKronus();
      case KronusPackage.ABSTRACT_DEF: return createAbstractDef();
      case KronusPackage.REFERENCEABLE_DEFS: return createReferenceableDefs();
      case KronusPackage.VAL_DEF: return createValDef();
      case KronusPackage.PACKAGE_DEF: return createPackageDef();
      case KronusPackage.IMPORT_DEF: return createImportDef();
      case KronusPackage.INCLUDE_DEF: return createIncludeDef();
      case KronusPackage.TYPE_DEF: return createTypeDef();
      case KronusPackage.TYPE_VALUE: return createTypeValue();
      case KronusPackage.TYPE_NAME: return createTypeName();
      case KronusPackage.TYPE_REF: return createTypeRef();
      case KronusPackage.TYPE_ID: return createTypeId();
      case KronusPackage.TYPE_INSTANCE: return createTypeInstance();
      case KronusPackage.FUNCTION_DEF: return createFunctionDef();
      case KronusPackage.ANNOTATION_DEF: return createAnnotationDef();
      case KronusPackage.HASHTAG_DEF: return createHashtagDef();
      case KronusPackage.CODE_ASSIGNMENT: return createCodeAssignment();
      case KronusPackage.CODE_BLOCK: return createCodeBlock();
      case KronusPackage.SCALA_CODE_BLOCK: return createScalaCodeBlock();
      case KronusPackage.KRONUS_CODE_BLOCK: return createKronusCodeBlock();
      case KronusPackage.SIMPLE_PARAMETER_VALUE: return createSimpleParameterValue();
      case KronusPackage.HASHTAG_CALL: return createHashtagCall();
      case KronusPackage.ANNOTATION_CALL: return createAnnotationCall();
      case KronusPackage.PARAMETER_DEF: return createParameterDef();
      case KronusPackage.PARAMETER_VALUE: return createParameterValue();
      case KronusPackage.KEYWORD_PARAMETER_VALUE: return createKeywordParameterValue();
      case KronusPackage.POSITION_PARAMETER_VALUE: return createPositionParameterValue();
      case KronusPackage.EXPRESSION: return createExpression();
      case KronusPackage.VALUE: return createValue();
      case KronusPackage.SEQUENCE: return createSequence();
      case KronusPackage.VAL_REF: return createValRef();
      case KronusPackage.FUNCTION_CALL: return createFunctionCall();
      case KronusPackage.INCLUDE_REF: return createIncludeRef();
      case KronusPackage.STRING_LITERAL: return createStringLiteral();
      case KronusPackage.DOUBLE_LITERAL: return createDoubleLiteral();
      case KronusPackage.INTEGER_LITERAL: return createIntegerLiteral();
      case KronusPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case KronusPackage.UNARY_OPERATION: return createUnaryOperation();
      case KronusPackage.BINARY_OPERATION: return createBinaryOperation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelKronus createTopLevelKronus()
  {
    TopLevelKronusImpl topLevelKronus = new TopLevelKronusImpl();
    return topLevelKronus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Kronus createKronus()
  {
    KronusImpl kronus = new KronusImpl();
    return kronus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDef createAbstractDef()
  {
    AbstractDefImpl abstractDef = new AbstractDefImpl();
    return abstractDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceableDefs createReferenceableDefs()
  {
    ReferenceableDefsImpl referenceableDefs = new ReferenceableDefsImpl();
    return referenceableDefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValDef createValDef()
  {
    ValDefImpl valDef = new ValDefImpl();
    return valDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDef createPackageDef()
  {
    PackageDefImpl packageDef = new PackageDefImpl();
    return packageDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportDef createImportDef()
  {
    ImportDefImpl importDef = new ImportDefImpl();
    return importDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeDef createIncludeDef()
  {
    IncludeDefImpl includeDef = new IncludeDefImpl();
    return includeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef createTypeDef()
  {
    TypeDefImpl typeDef = new TypeDefImpl();
    return typeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeValue createTypeValue()
  {
    TypeValueImpl typeValue = new TypeValueImpl();
    return typeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeName createTypeName()
  {
    TypeNameImpl typeName = new TypeNameImpl();
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef createTypeRef()
  {
    TypeRefImpl typeRef = new TypeRefImpl();
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeId createTypeId()
  {
    TypeIdImpl typeId = new TypeIdImpl();
    return typeId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeInstance createTypeInstance()
  {
    TypeInstanceImpl typeInstance = new TypeInstanceImpl();
    return typeInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDef createFunctionDef()
  {
    FunctionDefImpl functionDef = new FunctionDefImpl();
    return functionDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationDef createAnnotationDef()
  {
    AnnotationDefImpl annotationDef = new AnnotationDefImpl();
    return annotationDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HashtagDef createHashtagDef()
  {
    HashtagDefImpl hashtagDef = new HashtagDefImpl();
    return hashtagDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeAssignment createCodeAssignment()
  {
    CodeAssignmentImpl codeAssignment = new CodeAssignmentImpl();
    return codeAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeBlock createCodeBlock()
  {
    CodeBlockImpl codeBlock = new CodeBlockImpl();
    return codeBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalaCodeBlock createScalaCodeBlock()
  {
    ScalaCodeBlockImpl scalaCodeBlock = new ScalaCodeBlockImpl();
    return scalaCodeBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KronusCodeBlock createKronusCodeBlock()
  {
    KronusCodeBlockImpl kronusCodeBlock = new KronusCodeBlockImpl();
    return kronusCodeBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleParameterValue createSimpleParameterValue()
  {
    SimpleParameterValueImpl simpleParameterValue = new SimpleParameterValueImpl();
    return simpleParameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HashtagCall createHashtagCall()
  {
    HashtagCallImpl hashtagCall = new HashtagCallImpl();
    return hashtagCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationCall createAnnotationCall()
  {
    AnnotationCallImpl annotationCall = new AnnotationCallImpl();
    return annotationCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDef createParameterDef()
  {
    ParameterDefImpl parameterDef = new ParameterDefImpl();
    return parameterDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterValue createParameterValue()
  {
    ParameterValueImpl parameterValue = new ParameterValueImpl();
    return parameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeywordParameterValue createKeywordParameterValue()
  {
    KeywordParameterValueImpl keywordParameterValue = new KeywordParameterValueImpl();
    return keywordParameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PositionParameterValue createPositionParameterValue()
  {
    PositionParameterValueImpl positionParameterValue = new PositionParameterValueImpl();
    return positionParameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequence createSequence()
  {
    SequenceImpl sequence = new SequenceImpl();
    return sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValRef createValRef()
  {
    ValRefImpl valRef = new ValRefImpl();
    return valRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeRef createIncludeRef()
  {
    IncludeRefImpl includeRef = new IncludeRefImpl();
    return includeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral createDoubleLiteral()
  {
    DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
    return doubleLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOperation createUnaryOperation()
  {
    UnaryOperationImpl unaryOperation = new UnaryOperationImpl();
    return unaryOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryOperation createBinaryOperation()
  {
    BinaryOperationImpl binaryOperation = new BinaryOperationImpl();
    return binaryOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KronusPackage getKronusPackage()
  {
    return (KronusPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static KronusPackage getPackage()
  {
    return KronusPackage.eINSTANCE;
  }

} //KronusFactoryImpl
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
