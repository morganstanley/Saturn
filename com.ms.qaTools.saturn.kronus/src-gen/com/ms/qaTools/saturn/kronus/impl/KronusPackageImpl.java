/**
 */
package com.ms.qaTools.saturn.kronus.impl;

import com.ms.qaTools.saturn.kronus.AbstractDef;
import com.ms.qaTools.saturn.kronus.AnnotationCall;
import com.ms.qaTools.saturn.kronus.AnnotationDef;
import com.ms.qaTools.saturn.kronus.BinaryOperation;
import com.ms.qaTools.saturn.kronus.BooleanLiteral;
import com.ms.qaTools.saturn.kronus.CodeAssignment;
import com.ms.qaTools.saturn.kronus.CodeBlock;
import com.ms.qaTools.saturn.kronus.DoubleLiteral;
import com.ms.qaTools.saturn.kronus.Expression;
import com.ms.qaTools.saturn.kronus.FunctionCall;
import com.ms.qaTools.saturn.kronus.FunctionDef;
import com.ms.qaTools.saturn.kronus.HashtagCall;
import com.ms.qaTools.saturn.kronus.HashtagDef;
import com.ms.qaTools.saturn.kronus.ImportDef;
import com.ms.qaTools.saturn.kronus.IncludeDef;
import com.ms.qaTools.saturn.kronus.IncludeRef;
import com.ms.qaTools.saturn.kronus.IntegerLiteral;
import com.ms.qaTools.saturn.kronus.KeywordParameterValue;
import com.ms.qaTools.saturn.kronus.Kronus;
import com.ms.qaTools.saturn.kronus.KronusCodeBlock;
import com.ms.qaTools.saturn.kronus.KronusFactory;
import com.ms.qaTools.saturn.kronus.KronusPackage;
import com.ms.qaTools.saturn.kronus.PackageDef;
import com.ms.qaTools.saturn.kronus.ParameterDef;
import com.ms.qaTools.saturn.kronus.ParameterValue;
import com.ms.qaTools.saturn.kronus.PositionParameterValue;
import com.ms.qaTools.saturn.kronus.ReferenceableDefs;
import com.ms.qaTools.saturn.kronus.ScalaCodeBlock;
import com.ms.qaTools.saturn.kronus.Sequence;
import com.ms.qaTools.saturn.kronus.SimpleParameterValue;
import com.ms.qaTools.saturn.kronus.StringLiteral;
import com.ms.qaTools.saturn.kronus.TopLevelKronus;
import com.ms.qaTools.saturn.kronus.TypeDef;
import com.ms.qaTools.saturn.kronus.TypeId;
import com.ms.qaTools.saturn.kronus.TypeInstance;
import com.ms.qaTools.saturn.kronus.TypeName;
import com.ms.qaTools.saturn.kronus.TypeRef;
import com.ms.qaTools.saturn.kronus.TypeValue;
import com.ms.qaTools.saturn.kronus.UnaryOperation;
import com.ms.qaTools.saturn.kronus.ValDef;
import com.ms.qaTools.saturn.kronus.ValRef;
import com.ms.qaTools.saturn.kronus.Value;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KronusPackageImpl extends EPackageImpl implements KronusPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelKronusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kronusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceableDefsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hashtagDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scalaCodeBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kronusCodeBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleParameterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hashtagCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keywordParameterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass positionParameterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryOperationEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.ms.qaTools.saturn.kronus.KronusPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private KronusPackageImpl()
  {
    super(eNS_URI, KronusFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link KronusPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static KronusPackage init()
  {
    if (isInited) return (KronusPackage)EPackage.Registry.INSTANCE.getEPackage(KronusPackage.eNS_URI);

    // Obtain or create and register package
    KronusPackageImpl theKronusPackage = (KronusPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KronusPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KronusPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theKronusPackage.createPackageContents();

    // Initialize created meta-data
    theKronusPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theKronusPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(KronusPackage.eNS_URI, theKronusPackage);
    return theKronusPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelKronus()
  {
    return topLevelKronusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelKronus_Package()
  {
    return (EReference)topLevelKronusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelKronus_Kronus()
  {
    return (EReference)topLevelKronusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKronus()
  {
    return kronusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKronus_Imports()
  {
    return (EReference)kronusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKronus_Includes()
  {
    return (EReference)kronusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKronus_Defs()
  {
    return (EReference)kronusEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKronus_Return()
  {
    return (EReference)kronusEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractDef()
  {
    return abstractDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractDef_Name()
  {
    return (EAttribute)abstractDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceableDefs()
  {
    return referenceableDefsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValDef()
  {
    return valDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValDef_Hashtags()
  {
    return (EReference)valDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValDef_Annotations()
  {
    return (EReference)valDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValDef_Value()
  {
    return (EReference)valDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDef()
  {
    return packageDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDef_Module()
  {
    return (EAttribute)packageDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportDef()
  {
    return importDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportDef_Module()
  {
    return (EAttribute)importDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncludeDef()
  {
    return includeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIncludeDef_Module()
  {
    return (EAttribute)includeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIncludeDef_Name()
  {
    return (EAttribute)includeDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDef()
  {
    return typeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeDef_Variance()
  {
    return (EAttribute)typeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDef_BoundsHi()
  {
    return (EReference)typeDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDef_TypeParameters()
  {
    return (EReference)typeDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDef_Value()
  {
    return (EReference)typeDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeValue()
  {
    return typeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeValue_Extensions()
  {
    return (EReference)typeValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeValue_Type()
  {
    return (EReference)typeValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeValue_Parms()
  {
    return (EReference)typeValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeName()
  {
    return typeNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeName_Name()
  {
    return (EAttribute)typeNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeRef()
  {
    return typeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeRef_TypeRef()
  {
    return (EReference)typeRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeId()
  {
    return typeIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeInstance()
  {
    return typeInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeInstance_Name()
  {
    return (EReference)typeInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeInstance_TypeParameters()
  {
    return (EReference)typeInstanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionDef()
  {
    return functionDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDef_Hashtags()
  {
    return (EReference)functionDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDef_TypeParameters()
  {
    return (EReference)functionDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDef_ParameterDefs()
  {
    return (EReference)functionDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDef_ReturnType()
  {
    return (EReference)functionDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDef_Value()
  {
    return (EReference)functionDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationDef()
  {
    return annotationDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationDef_ParameterDefs()
  {
    return (EReference)annotationDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHashtagDef()
  {
    return hashtagDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHashtagDef_ParameterDefs()
  {
    return (EReference)hashtagDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeAssignment()
  {
    return codeAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeBlock()
  {
    return codeBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeBlock_Type()
  {
    return (EAttribute)codeBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScalaCodeBlock()
  {
    return scalaCodeBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScalaCodeBlock_CodeStr()
  {
    return (EAttribute)scalaCodeBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKronusCodeBlock()
  {
    return kronusCodeBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKronusCodeBlock_Code()
  {
    return (EReference)kronusCodeBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleParameterValue()
  {
    return simpleParameterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleParameterValue_Name()
  {
    return (EAttribute)simpleParameterValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleParameterValue_Value()
  {
    return (EAttribute)simpleParameterValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHashtagCall()
  {
    return hashtagCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHashtagCall_Method()
  {
    return (EReference)hashtagCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHashtagCall_ParameterValues()
  {
    return (EReference)hashtagCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationCall()
  {
    return annotationCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationCall_Method()
  {
    return (EReference)annotationCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationCall_ParameterValues()
  {
    return (EReference)annotationCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterDef()
  {
    return parameterDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterDef_Name()
  {
    return (EAttribute)parameterDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterDef_ByName()
  {
    return (EAttribute)parameterDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterDef_Type()
  {
    return (EReference)parameterDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterDef_List()
  {
    return (EAttribute)parameterDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterDef_DefaultValue()
  {
    return (EReference)parameterDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterValue()
  {
    return parameterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterValue_Value()
  {
    return (EReference)parameterValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKeywordParameterValue()
  {
    return keywordParameterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeywordParameterValue_Name()
  {
    return (EAttribute)keywordParameterValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPositionParameterValue()
  {
    return positionParameterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequence()
  {
    return sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequence_Values()
  {
    return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValRef()
  {
    return valRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValRef_Ref()
  {
    return (EReference)valRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionCall()
  {
    return functionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionCall_Method()
  {
    return (EReference)functionCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionCall_ParameterValues()
  {
    return (EReference)functionCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncludeRef()
  {
    return includeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIncludeRef_Include()
  {
    return (EReference)includeRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIncludeRef_Ref()
  {
    return (EReference)includeRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Value()
  {
    return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleLiteral()
  {
    return doubleLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoubleLiteral_Value()
  {
    return (EAttribute)doubleLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerLiteral()
  {
    return integerLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerLiteral_Value()
  {
    return (EAttribute)integerLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteral()
  {
    return booleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanLiteral_Value()
  {
    return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryOperation()
  {
    return unaryOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryOperation_Op()
  {
    return (EAttribute)unaryOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryOperation_Expr()
  {
    return (EReference)unaryOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryOperation()
  {
    return binaryOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryOperation_Left()
  {
    return (EReference)binaryOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryOperation_Op()
  {
    return (EAttribute)binaryOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryOperation_Right()
  {
    return (EReference)binaryOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KronusFactory getKronusFactory()
  {
    return (KronusFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    topLevelKronusEClass = createEClass(TOP_LEVEL_KRONUS);
    createEReference(topLevelKronusEClass, TOP_LEVEL_KRONUS__PACKAGE);
    createEReference(topLevelKronusEClass, TOP_LEVEL_KRONUS__KRONUS);

    kronusEClass = createEClass(KRONUS);
    createEReference(kronusEClass, KRONUS__IMPORTS);
    createEReference(kronusEClass, KRONUS__INCLUDES);
    createEReference(kronusEClass, KRONUS__DEFS);
    createEReference(kronusEClass, KRONUS__RETURN);

    abstractDefEClass = createEClass(ABSTRACT_DEF);
    createEAttribute(abstractDefEClass, ABSTRACT_DEF__NAME);

    referenceableDefsEClass = createEClass(REFERENCEABLE_DEFS);

    valDefEClass = createEClass(VAL_DEF);
    createEReference(valDefEClass, VAL_DEF__HASHTAGS);
    createEReference(valDefEClass, VAL_DEF__ANNOTATIONS);
    createEReference(valDefEClass, VAL_DEF__VALUE);

    packageDefEClass = createEClass(PACKAGE_DEF);
    createEAttribute(packageDefEClass, PACKAGE_DEF__MODULE);

    importDefEClass = createEClass(IMPORT_DEF);
    createEAttribute(importDefEClass, IMPORT_DEF__MODULE);

    includeDefEClass = createEClass(INCLUDE_DEF);
    createEAttribute(includeDefEClass, INCLUDE_DEF__MODULE);
    createEAttribute(includeDefEClass, INCLUDE_DEF__NAME);

    typeDefEClass = createEClass(TYPE_DEF);
    createEAttribute(typeDefEClass, TYPE_DEF__VARIANCE);
    createEReference(typeDefEClass, TYPE_DEF__BOUNDS_HI);
    createEReference(typeDefEClass, TYPE_DEF__TYPE_PARAMETERS);
    createEReference(typeDefEClass, TYPE_DEF__VALUE);

    typeValueEClass = createEClass(TYPE_VALUE);
    createEReference(typeValueEClass, TYPE_VALUE__EXTENSIONS);
    createEReference(typeValueEClass, TYPE_VALUE__TYPE);
    createEReference(typeValueEClass, TYPE_VALUE__PARMS);

    typeNameEClass = createEClass(TYPE_NAME);
    createEAttribute(typeNameEClass, TYPE_NAME__NAME);

    typeRefEClass = createEClass(TYPE_REF);
    createEReference(typeRefEClass, TYPE_REF__TYPE_REF);

    typeIdEClass = createEClass(TYPE_ID);

    typeInstanceEClass = createEClass(TYPE_INSTANCE);
    createEReference(typeInstanceEClass, TYPE_INSTANCE__NAME);
    createEReference(typeInstanceEClass, TYPE_INSTANCE__TYPE_PARAMETERS);

    functionDefEClass = createEClass(FUNCTION_DEF);
    createEReference(functionDefEClass, FUNCTION_DEF__HASHTAGS);
    createEReference(functionDefEClass, FUNCTION_DEF__TYPE_PARAMETERS);
    createEReference(functionDefEClass, FUNCTION_DEF__PARAMETER_DEFS);
    createEReference(functionDefEClass, FUNCTION_DEF__RETURN_TYPE);
    createEReference(functionDefEClass, FUNCTION_DEF__VALUE);

    annotationDefEClass = createEClass(ANNOTATION_DEF);
    createEReference(annotationDefEClass, ANNOTATION_DEF__PARAMETER_DEFS);

    hashtagDefEClass = createEClass(HASHTAG_DEF);
    createEReference(hashtagDefEClass, HASHTAG_DEF__PARAMETER_DEFS);

    codeAssignmentEClass = createEClass(CODE_ASSIGNMENT);

    codeBlockEClass = createEClass(CODE_BLOCK);
    createEAttribute(codeBlockEClass, CODE_BLOCK__TYPE);

    scalaCodeBlockEClass = createEClass(SCALA_CODE_BLOCK);
    createEAttribute(scalaCodeBlockEClass, SCALA_CODE_BLOCK__CODE_STR);

    kronusCodeBlockEClass = createEClass(KRONUS_CODE_BLOCK);
    createEReference(kronusCodeBlockEClass, KRONUS_CODE_BLOCK__CODE);

    simpleParameterValueEClass = createEClass(SIMPLE_PARAMETER_VALUE);
    createEAttribute(simpleParameterValueEClass, SIMPLE_PARAMETER_VALUE__NAME);
    createEAttribute(simpleParameterValueEClass, SIMPLE_PARAMETER_VALUE__VALUE);

    hashtagCallEClass = createEClass(HASHTAG_CALL);
    createEReference(hashtagCallEClass, HASHTAG_CALL__METHOD);
    createEReference(hashtagCallEClass, HASHTAG_CALL__PARAMETER_VALUES);

    annotationCallEClass = createEClass(ANNOTATION_CALL);
    createEReference(annotationCallEClass, ANNOTATION_CALL__METHOD);
    createEReference(annotationCallEClass, ANNOTATION_CALL__PARAMETER_VALUES);

    parameterDefEClass = createEClass(PARAMETER_DEF);
    createEAttribute(parameterDefEClass, PARAMETER_DEF__NAME);
    createEAttribute(parameterDefEClass, PARAMETER_DEF__BY_NAME);
    createEReference(parameterDefEClass, PARAMETER_DEF__TYPE);
    createEAttribute(parameterDefEClass, PARAMETER_DEF__LIST);
    createEReference(parameterDefEClass, PARAMETER_DEF__DEFAULT_VALUE);

    parameterValueEClass = createEClass(PARAMETER_VALUE);
    createEReference(parameterValueEClass, PARAMETER_VALUE__VALUE);

    keywordParameterValueEClass = createEClass(KEYWORD_PARAMETER_VALUE);
    createEAttribute(keywordParameterValueEClass, KEYWORD_PARAMETER_VALUE__NAME);

    positionParameterValueEClass = createEClass(POSITION_PARAMETER_VALUE);

    expressionEClass = createEClass(EXPRESSION);

    valueEClass = createEClass(VALUE);

    sequenceEClass = createEClass(SEQUENCE);
    createEReference(sequenceEClass, SEQUENCE__VALUES);

    valRefEClass = createEClass(VAL_REF);
    createEReference(valRefEClass, VAL_REF__REF);

    functionCallEClass = createEClass(FUNCTION_CALL);
    createEReference(functionCallEClass, FUNCTION_CALL__METHOD);
    createEReference(functionCallEClass, FUNCTION_CALL__PARAMETER_VALUES);

    includeRefEClass = createEClass(INCLUDE_REF);
    createEReference(includeRefEClass, INCLUDE_REF__INCLUDE);
    createEReference(includeRefEClass, INCLUDE_REF__REF);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

    doubleLiteralEClass = createEClass(DOUBLE_LITERAL);
    createEAttribute(doubleLiteralEClass, DOUBLE_LITERAL__VALUE);

    integerLiteralEClass = createEClass(INTEGER_LITERAL);
    createEAttribute(integerLiteralEClass, INTEGER_LITERAL__VALUE);

    booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
    createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

    unaryOperationEClass = createEClass(UNARY_OPERATION);
    createEAttribute(unaryOperationEClass, UNARY_OPERATION__OP);
    createEReference(unaryOperationEClass, UNARY_OPERATION__EXPR);

    binaryOperationEClass = createEClass(BINARY_OPERATION);
    createEReference(binaryOperationEClass, BINARY_OPERATION__LEFT);
    createEAttribute(binaryOperationEClass, BINARY_OPERATION__OP);
    createEReference(binaryOperationEClass, BINARY_OPERATION__RIGHT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    valDefEClass.getESuperTypes().add(this.getAbstractDef());
    valDefEClass.getESuperTypes().add(this.getReferenceableDefs());
    typeDefEClass.getESuperTypes().add(this.getAbstractDef());
    typeNameEClass.getESuperTypes().add(this.getTypeId());
    typeRefEClass.getESuperTypes().add(this.getTypeId());
    functionDefEClass.getESuperTypes().add(this.getAbstractDef());
    functionDefEClass.getESuperTypes().add(this.getReferenceableDefs());
    annotationDefEClass.getESuperTypes().add(this.getAbstractDef());
    hashtagDefEClass.getESuperTypes().add(this.getAbstractDef());
    codeBlockEClass.getESuperTypes().add(this.getCodeAssignment());
    codeBlockEClass.getESuperTypes().add(this.getValue());
    scalaCodeBlockEClass.getESuperTypes().add(this.getCodeBlock());
    kronusCodeBlockEClass.getESuperTypes().add(this.getCodeBlock());
    parameterDefEClass.getESuperTypes().add(this.getReferenceableDefs());
    keywordParameterValueEClass.getESuperTypes().add(this.getParameterValue());
    positionParameterValueEClass.getESuperTypes().add(this.getParameterValue());
    valueEClass.getESuperTypes().add(this.getExpression());
    sequenceEClass.getESuperTypes().add(this.getValue());
    valRefEClass.getESuperTypes().add(this.getValue());
    functionCallEClass.getESuperTypes().add(this.getValue());
    includeRefEClass.getESuperTypes().add(this.getValue());
    stringLiteralEClass.getESuperTypes().add(this.getValue());
    doubleLiteralEClass.getESuperTypes().add(this.getValue());
    integerLiteralEClass.getESuperTypes().add(this.getValue());
    booleanLiteralEClass.getESuperTypes().add(this.getValue());
    unaryOperationEClass.getESuperTypes().add(this.getExpression());
    binaryOperationEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(topLevelKronusEClass, TopLevelKronus.class, "TopLevelKronus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTopLevelKronus_Package(), this.getPackageDef(), null, "package", null, 0, 1, TopLevelKronus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopLevelKronus_Kronus(), this.getKronus(), null, "kronus", null, 0, 1, TopLevelKronus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kronusEClass, Kronus.class, "Kronus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKronus_Imports(), this.getImportDef(), null, "imports", null, 0, -1, Kronus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKronus_Includes(), this.getIncludeDef(), null, "includes", null, 0, -1, Kronus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKronus_Defs(), this.getAbstractDef(), null, "defs", null, 0, -1, Kronus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKronus_Return(), this.getExpression(), null, "return", null, 0, 1, Kronus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractDefEClass, AbstractDef.class, "AbstractDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceableDefsEClass, ReferenceableDefs.class, "ReferenceableDefs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(valDefEClass, ValDef.class, "ValDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValDef_Hashtags(), this.getHashtagCall(), null, "hashtags", null, 0, -1, ValDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValDef_Annotations(), this.getAnnotationCall(), null, "annotations", null, 0, -1, ValDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValDef_Value(), this.getExpression(), null, "value", null, 0, 1, ValDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDefEClass, PackageDef.class, "PackageDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageDef_Module(), ecorePackage.getEString(), "module", null, 0, 1, PackageDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importDefEClass, ImportDef.class, "ImportDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportDef_Module(), ecorePackage.getEString(), "module", null, 0, 1, ImportDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(includeDefEClass, IncludeDef.class, "IncludeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIncludeDef_Module(), ecorePackage.getEString(), "module", null, 0, 1, IncludeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIncludeDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, IncludeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefEClass, TypeDef.class, "TypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeDef_Variance(), ecorePackage.getEString(), "variance", null, 0, 1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDef_BoundsHi(), this.getTypeInstance(), null, "boundsHi", null, 0, 1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDef_TypeParameters(), this.getTypeDef(), null, "typeParameters", null, 0, -1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDef_Value(), this.getTypeValue(), null, "value", null, 0, 1, TypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeValueEClass, TypeValue.class, "TypeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeValue_Extensions(), this.getTypeValue(), null, "extensions", null, 0, -1, TypeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeValue_Type(), this.getTypeId(), null, "type", null, 0, 1, TypeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeValue_Parms(), this.getTypeValue(), null, "parms", null, 0, -1, TypeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeNameEClass, TypeName.class, "TypeName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeName_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeRefEClass, TypeRef.class, "TypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeRef_TypeRef(), this.getTypeDef(), null, "typeRef", null, 0, 1, TypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeIdEClass, TypeId.class, "TypeId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeInstanceEClass, TypeInstance.class, "TypeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeInstance_Name(), this.getTypeDef(), null, "name", null, 0, 1, TypeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeInstance_TypeParameters(), this.getTypeInstance(), null, "typeParameters", null, 0, -1, TypeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDefEClass, FunctionDef.class, "FunctionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionDef_Hashtags(), this.getHashtagCall(), null, "hashtags", null, 0, -1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDef_TypeParameters(), this.getTypeDef(), null, "typeParameters", null, 0, -1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDef_ParameterDefs(), this.getParameterDef(), null, "parameterDefs", null, 0, -1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDef_ReturnType(), this.getTypeInstance(), null, "returnType", null, 0, 1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDef_Value(), this.getCodeAssignment(), null, "value", null, 0, 1, FunctionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationDefEClass, AnnotationDef.class, "AnnotationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotationDef_ParameterDefs(), this.getParameterDef(), null, "parameterDefs", null, 0, -1, AnnotationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hashtagDefEClass, HashtagDef.class, "HashtagDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHashtagDef_ParameterDefs(), this.getParameterDef(), null, "parameterDefs", null, 0, -1, HashtagDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeAssignmentEClass, CodeAssignment.class, "CodeAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(codeBlockEClass, CodeBlock.class, "CodeBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCodeBlock_Type(), ecorePackage.getEString(), "type", null, 0, 1, CodeBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scalaCodeBlockEClass, ScalaCodeBlock.class, "ScalaCodeBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScalaCodeBlock_CodeStr(), ecorePackage.getEString(), "codeStr", null, 0, 1, ScalaCodeBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kronusCodeBlockEClass, KronusCodeBlock.class, "KronusCodeBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKronusCodeBlock_Code(), this.getKronus(), null, "code", null, 0, 1, KronusCodeBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleParameterValueEClass, SimpleParameterValue.class, "SimpleParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleParameterValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimpleParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleParameterValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, SimpleParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hashtagCallEClass, HashtagCall.class, "HashtagCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHashtagCall_Method(), this.getHashtagDef(), null, "method", null, 0, 1, HashtagCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHashtagCall_ParameterValues(), this.getSimpleParameterValue(), null, "parameterValues", null, 0, -1, HashtagCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationCallEClass, AnnotationCall.class, "AnnotationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotationCall_Method(), this.getAnnotationDef(), null, "method", null, 0, 1, AnnotationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotationCall_ParameterValues(), this.getParameterValue(), null, "parameterValues", null, 0, -1, AnnotationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterDefEClass, ParameterDef.class, "ParameterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterDef_ByName(), ecorePackage.getEBoolean(), "byName", null, 0, 1, ParameterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterDef_Type(), this.getTypeInstance(), null, "type", null, 0, 1, ParameterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterDef_List(), ecorePackage.getEBoolean(), "list", null, 0, 1, ParameterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterDef_DefaultValue(), this.getExpression(), null, "defaultValue", null, 0, 1, ParameterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterValueEClass, ParameterValue.class, "ParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterValue_Value(), this.getExpression(), null, "value", null, 0, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keywordParameterValueEClass, KeywordParameterValue.class, "KeywordParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKeywordParameterValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, KeywordParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(positionParameterValueEClass, PositionParameterValue.class, "PositionParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequence_Values(), this.getExpression(), null, "values", null, 0, -1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valRefEClass, ValRef.class, "ValRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValRef_Ref(), this.getReferenceableDefs(), null, "ref", null, 0, 1, ValRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionCall_Method(), this.getFunctionDef(), null, "method", null, 0, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionCall_ParameterValues(), this.getParameterValue(), null, "parameterValues", null, 0, -1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(includeRefEClass, IncludeRef.class, "IncludeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIncludeRef_Include(), this.getIncludeDef(), null, "include", null, 0, 1, IncludeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIncludeRef_Ref(), this.getValue(), null, "ref", null, 0, 1, IncludeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doubleLiteralEClass, DoubleLiteral.class, "DoubleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoubleLiteral_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, DoubleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerLiteralEClass, IntegerLiteral.class, "IntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryOperationEClass, UnaryOperation.class, "UnaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryOperation_Op(), ecorePackage.getEString(), "op", null, 0, 1, UnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryOperation_Expr(), this.getExpression(), null, "expr", null, 0, 1, UnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryOperationEClass, BinaryOperation.class, "BinaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryOperation_Left(), this.getExpression(), null, "left", null, 0, 1, BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryOperation_Op(), ecorePackage.getEString(), "op", null, 0, 1, BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryOperation_Right(), this.getExpression(), null, "right", null, 0, 1, BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //KronusPackageImpl