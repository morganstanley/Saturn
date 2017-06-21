/**
 */
package com.ms.qaTools.saturn.kronus.util;

import com.ms.qaTools.saturn.kronus.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.kronus.KronusPackage
 * @generated
 */
public class KronusSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static KronusPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KronusSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = KronusPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case KronusPackage.TOP_LEVEL_KRONUS:
      {
        TopLevelKronus topLevelKronus = (TopLevelKronus)theEObject;
        T result = caseTopLevelKronus(topLevelKronus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.KRONUS:
      {
        Kronus kronus = (Kronus)theEObject;
        T result = caseKronus(kronus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = caseAbstractDef(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.ANNOTATED_DEF:
      {
        AnnotatedDef annotatedDef = (AnnotatedDef)theEObject;
        T result = caseAnnotatedDef(annotatedDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.ABSTRACT_DEF:
      {
        AbstractDef abstractDef = (AbstractDef)theEObject;
        T result = caseAbstractDef(abstractDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.REFERENCEABLE_DEFS:
      {
        ReferenceableDefs referenceableDefs = (ReferenceableDefs)theEObject;
        T result = caseReferenceableDefs(referenceableDefs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.NAMED_ABSTRACT_DEF:
      {
        NamedAbstractDef namedAbstractDef = (NamedAbstractDef)theEObject;
        T result = caseNamedAbstractDef(namedAbstractDef);
        if (result == null) result = caseAbstractDef(namedAbstractDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.NAMED_RUNTIME_DEF:
      {
        NamedRuntimeDef namedRuntimeDef = (NamedRuntimeDef)theEObject;
        T result = caseNamedRuntimeDef(namedRuntimeDef);
        if (result == null) result = caseNamedAbstractDef(namedRuntimeDef);
        if (result == null) result = caseAbstractDef(namedRuntimeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.TYPE_INSTANCE:
      {
        TypeInstance typeInstance = (TypeInstance)theEObject;
        T result = caseTypeInstance(typeInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.FUNCTION_DEF:
      {
        FunctionDef functionDef = (FunctionDef)theEObject;
        T result = caseFunctionDef(functionDef);
        if (result == null) result = caseReferenceableDefs(functionDef);
        if (result == null) result = caseNamedRuntimeDef(functionDef);
        if (result == null) result = caseNamedAbstractDef(functionDef);
        if (result == null) result = caseAbstractDef(functionDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.ANNOTATION_DEF:
      {
        AnnotationDef annotationDef = (AnnotationDef)theEObject;
        T result = caseAnnotationDef(annotationDef);
        if (result == null) result = caseNamedRuntimeDef(annotationDef);
        if (result == null) result = caseNamedAbstractDef(annotationDef);
        if (result == null) result = caseAbstractDef(annotationDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.HASHTAG_DEF:
      {
        HashtagDef hashtagDef = (HashtagDef)theEObject;
        T result = caseHashtagDef(hashtagDef);
        if (result == null) result = caseNamedAbstractDef(hashtagDef);
        if (result == null) result = caseAbstractDef(hashtagDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.VAL_DEF:
      {
        ValDef valDef = (ValDef)theEObject;
        T result = caseValDef(valDef);
        if (result == null) result = caseReferenceableDefs(valDef);
        if (result == null) result = caseNamedRuntimeDef(valDef);
        if (result == null) result = caseNamedAbstractDef(valDef);
        if (result == null) result = caseAbstractDef(valDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.PACKAGE_DEF:
      {
        PackageDef packageDef = (PackageDef)theEObject;
        T result = casePackageDef(packageDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.IMPORT_DEF:
      {
        ImportDef importDef = (ImportDef)theEObject;
        T result = caseImportDef(importDef);
        if (result == null) result = caseAbstractDef(importDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.INCLUDE_DEF:
      {
        IncludeDef includeDef = (IncludeDef)theEObject;
        T result = caseIncludeDef(includeDef);
        if (result == null) result = caseAbstractDef(includeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.EXPORT_DEF:
      {
        ExportDef exportDef = (ExportDef)theEObject;
        T result = caseExportDef(exportDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.EXPORT_CLAUSE:
      {
        ExportClause exportClause = (ExportClause)theEObject;
        T result = caseExportClause(exportClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.EXPORT_SYMBOL:
      {
        ExportSymbol exportSymbol = (ExportSymbol)theEObject;
        T result = caseExportSymbol(exportSymbol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.EXPORT_ALL:
      {
        ExportAll exportAll = (ExportAll)theEObject;
        T result = caseExportAll(exportAll);
        if (result == null) result = caseExportSymbol(exportAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.EXPORT_HASHTAG:
      {
        ExportHashtag exportHashtag = (ExportHashtag)theEObject;
        T result = caseExportHashtag(exportHashtag);
        if (result == null) result = caseExportSymbol(exportHashtag);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.EXPORT_RUNTIME_NAME:
      {
        ExportRuntimeName exportRuntimeName = (ExportRuntimeName)theEObject;
        T result = caseExportRuntimeName(exportRuntimeName);
        if (result == null) result = caseExportSymbol(exportRuntimeName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.TYPE_DEF:
      {
        TypeDef typeDef = (TypeDef)theEObject;
        T result = caseTypeDef(typeDef);
        if (result == null) result = caseNamedRuntimeDef(typeDef);
        if (result == null) result = caseNamedAbstractDef(typeDef);
        if (result == null) result = caseAbstractDef(typeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.TYPE_VALUE:
      {
        TypeValue typeValue = (TypeValue)theEObject;
        T result = caseTypeValue(typeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.TYPE_NAME:
      {
        TypeName typeName = (TypeName)theEObject;
        T result = caseTypeName(typeName);
        if (result == null) result = caseTypeId(typeName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.TYPE_REF:
      {
        TypeRef typeRef = (TypeRef)theEObject;
        T result = caseTypeRef(typeRef);
        if (result == null) result = caseTypeId(typeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.TYPE_ID:
      {
        TypeId typeId = (TypeId)theEObject;
        T result = caseTypeId(typeId);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.CODE_ASSIGNMENT:
      {
        CodeAssignment codeAssignment = (CodeAssignment)theEObject;
        T result = caseCodeAssignment(codeAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.CODE_BLOCK:
      {
        CodeBlock codeBlock = (CodeBlock)theEObject;
        T result = caseCodeBlock(codeBlock);
        if (result == null) result = caseCodeAssignment(codeBlock);
        if (result == null) result = caseValue(codeBlock);
        if (result == null) result = caseExpression(codeBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.SCALA_CODE_BLOCK:
      {
        ScalaCodeBlock scalaCodeBlock = (ScalaCodeBlock)theEObject;
        T result = caseScalaCodeBlock(scalaCodeBlock);
        if (result == null) result = caseCodeBlock(scalaCodeBlock);
        if (result == null) result = caseCodeAssignment(scalaCodeBlock);
        if (result == null) result = caseValue(scalaCodeBlock);
        if (result == null) result = caseExpression(scalaCodeBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.KRONUS_CODE_BLOCK:
      {
        KronusCodeBlock kronusCodeBlock = (KronusCodeBlock)theEObject;
        T result = caseKronusCodeBlock(kronusCodeBlock);
        if (result == null) result = caseCodeBlock(kronusCodeBlock);
        if (result == null) result = caseCodeAssignment(kronusCodeBlock);
        if (result == null) result = caseValue(kronusCodeBlock);
        if (result == null) result = caseExpression(kronusCodeBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.SIMPLE_PARAMETER_VALUE:
      {
        SimpleParameterValue simpleParameterValue = (SimpleParameterValue)theEObject;
        T result = caseSimpleParameterValue(simpleParameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.HASHTAG_CALL:
      {
        HashtagCall hashtagCall = (HashtagCall)theEObject;
        T result = caseHashtagCall(hashtagCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.ANNOTATION_CALL:
      {
        AnnotationCall annotationCall = (AnnotationCall)theEObject;
        T result = caseAnnotationCall(annotationCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.PARAMETER_DEF:
      {
        ParameterDef parameterDef = (ParameterDef)theEObject;
        T result = caseParameterDef(parameterDef);
        if (result == null) result = caseReferenceableDefs(parameterDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.PARAMETER_VALUE:
      {
        ParameterValue parameterValue = (ParameterValue)theEObject;
        T result = caseParameterValue(parameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.KEYWORD_PARAMETER_VALUE:
      {
        KeywordParameterValue keywordParameterValue = (KeywordParameterValue)theEObject;
        T result = caseKeywordParameterValue(keywordParameterValue);
        if (result == null) result = caseParameterValue(keywordParameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.POSITION_PARAMETER_VALUE:
      {
        PositionParameterValue positionParameterValue = (PositionParameterValue)theEObject;
        T result = casePositionParameterValue(positionParameterValue);
        if (result == null) result = caseParameterValue(positionParameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = caseExpression(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.SEQUENCE:
      {
        Sequence sequence = (Sequence)theEObject;
        T result = caseSequence(sequence);
        if (result == null) result = caseValue(sequence);
        if (result == null) result = caseExpression(sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.VAL_REF:
      {
        ValRef valRef = (ValRef)theEObject;
        T result = caseValRef(valRef);
        if (result == null) result = caseValue(valRef);
        if (result == null) result = caseExpression(valRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.FUNCTION_CALL:
      {
        FunctionCall functionCall = (FunctionCall)theEObject;
        T result = caseFunctionCall(functionCall);
        if (result == null) result = caseValue(functionCall);
        if (result == null) result = caseExpression(functionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseValue(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.DOUBLE_LITERAL:
      {
        DoubleLiteral doubleLiteral = (DoubleLiteral)theEObject;
        T result = caseDoubleLiteral(doubleLiteral);
        if (result == null) result = caseValue(doubleLiteral);
        if (result == null) result = caseExpression(doubleLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.INTEGER_LITERAL:
      {
        IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
        T result = caseIntegerLiteral(integerLiteral);
        if (result == null) result = caseValue(integerLiteral);
        if (result == null) result = caseExpression(integerLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.BOOLEAN_LITERAL:
      {
        BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
        T result = caseBooleanLiteral(booleanLiteral);
        if (result == null) result = caseValue(booleanLiteral);
        if (result == null) result = caseExpression(booleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.UNARY_OPERATION:
      {
        UnaryOperation unaryOperation = (UnaryOperation)theEObject;
        T result = caseUnaryOperation(unaryOperation);
        if (result == null) result = caseExpression(unaryOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case KronusPackage.BINARY_OPERATION:
      {
        BinaryOperation binaryOperation = (BinaryOperation)theEObject;
        T result = caseBinaryOperation(binaryOperation);
        if (result == null) result = caseExpression(binaryOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Kronus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Kronus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelKronus(TopLevelKronus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kronus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kronus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKronus(Kronus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment(Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotated Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotated Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotatedDef(AnnotatedDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDef(AbstractDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Referenceable Defs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referenceable Defs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceableDefs(ReferenceableDefs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Abstract Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Abstract Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedAbstractDef(NamedAbstractDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Runtime Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Runtime Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedRuntimeDef(NamedRuntimeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeInstance(TypeInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDef(FunctionDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationDef(AnnotationDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hashtag Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hashtag Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHashtagDef(HashtagDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Val Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Val Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValDef(ValDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDef(PackageDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportDef(ImportDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncludeDef(IncludeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Export Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Export Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExportDef(ExportDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Export Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Export Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExportClause(ExportClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Export Symbol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Export Symbol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExportSymbol(ExportSymbol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Export All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Export All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExportAll(ExportAll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Export Hashtag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Export Hashtag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExportHashtag(ExportHashtag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Export Runtime Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Export Runtime Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExportRuntimeName(ExportRuntimeName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDef(TypeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeValue(TypeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeName(TypeName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeRef(TypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeId(TypeId object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Code Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Code Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCodeAssignment(CodeAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Code Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Code Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCodeBlock(CodeBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scala Code Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scala Code Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScalaCodeBlock(ScalaCodeBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Code Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Code Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKronusCodeBlock(KronusCodeBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleParameterValue(SimpleParameterValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hashtag Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hashtag Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHashtagCall(HashtagCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationCall(AnnotationCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterDef(ParameterDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterValue(ParameterValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Keyword Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Keyword Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeywordParameterValue(KeywordParameterValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Position Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Position Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePositionParameterValue(PositionParameterValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequence(Sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Val Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Val Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValRef(ValRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCall(FunctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleLiteral(DoubleLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerLiteral(IntegerLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteral(BooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryOperation(UnaryOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryOperation(BinaryOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //KronusSwitch
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
