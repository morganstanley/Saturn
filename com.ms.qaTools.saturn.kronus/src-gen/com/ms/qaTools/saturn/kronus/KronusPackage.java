/**
 */
package com.ms.qaTools.saturn.kronus;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.kronus.KronusFactory
 * @model kind="package"
 * @generated
 */
public interface KronusPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kronus";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ms.com/qaTools/saturn/Kronus";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kronus";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KronusPackage eINSTANCE = com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.TopLevelKronusImpl <em>Top Level Kronus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.TopLevelKronusImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getTopLevelKronus()
   * @generated
   */
  int TOP_LEVEL_KRONUS = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_KRONUS__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Exports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_KRONUS__EXPORTS = 1;

  /**
   * The feature id for the '<em><b>Kronus</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_KRONUS__KRONUS = 2;

  /**
   * The number of structural features of the '<em>Top Level Kronus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_KRONUS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.KronusImpl <em>Kronus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.KronusImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getKronus()
   * @generated
   */
  int KRONUS = 1;

  /**
   * The feature id for the '<em><b>Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS__DEFS = 0;

  /**
   * The feature id for the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS__RETURN = 1;

  /**
   * The number of structural features of the '<em>Kronus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.AbstractDefImpl <em>Abstract Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.AbstractDefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getAbstractDef()
   * @generated
   */
  int ABSTRACT_DEF = 4;

  /**
   * The number of structural features of the '<em>Abstract Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DEF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.AssignmentImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 2;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__LHS = ABSTRACT_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lhs Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__LHS_PARAMETER = ABSTRACT_DEF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__RHS = ABSTRACT_DEF_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Rhs Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__RHS_PARAMETER = ABSTRACT_DEF_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = ABSTRACT_DEF_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.AnnotatedDefImpl <em>Annotated Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.AnnotatedDefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getAnnotatedDef()
   * @generated
   */
  int ANNOTATED_DEF = 3;

  /**
   * The feature id for the '<em><b>Hashtags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_DEF__HASHTAGS = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_DEF__ANNOTATIONS = 1;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_DEF__DEF = 2;

  /**
   * The number of structural features of the '<em>Annotated Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.ReferenceableDefsImpl <em>Referenceable Defs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.ReferenceableDefsImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getReferenceableDefs()
   * @generated
   */
  int REFERENCEABLE_DEFS = 5;

  /**
   * The number of structural features of the '<em>Referenceable Defs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCEABLE_DEFS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.NamedAbstractDefImpl <em>Named Abstract Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.NamedAbstractDefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getNamedAbstractDef()
   * @generated
   */
  int NAMED_ABSTRACT_DEF = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ABSTRACT_DEF__NAME = ABSTRACT_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Abstract Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ABSTRACT_DEF_FEATURE_COUNT = ABSTRACT_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.NamedRuntimeDefImpl <em>Named Runtime Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.NamedRuntimeDefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getNamedRuntimeDef()
   * @generated
   */
  int NAMED_RUNTIME_DEF = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_RUNTIME_DEF__NAME = NAMED_ABSTRACT_DEF__NAME;

  /**
   * The number of structural features of the '<em>Named Runtime Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_RUNTIME_DEF_FEATURE_COUNT = NAMED_ABSTRACT_DEF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.TypeInstanceImpl <em>Type Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.TypeInstanceImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getTypeInstance()
   * @generated
   */
  int TYPE_INSTANCE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INSTANCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INSTANCE__TYPE_PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Type Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INSTANCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.FunctionDefImpl <em>Function Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.FunctionDefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getFunctionDef()
   * @generated
   */
  int FUNCTION_DEF = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEF__NAME = REFERENCEABLE_DEFS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEF__TYPE_PARAMETERS = REFERENCEABLE_DEFS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameter Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEF__PARAMETER_DEFS = REFERENCEABLE_DEFS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEF__RETURN_TYPE = REFERENCEABLE_DEFS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEF__VALUE = REFERENCEABLE_DEFS_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Function Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEF_FEATURE_COUNT = REFERENCEABLE_DEFS_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.AnnotationDefImpl <em>Annotation Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.AnnotationDefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getAnnotationDef()
   * @generated
   */
  int ANNOTATION_DEF = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DEF__NAME = NAMED_RUNTIME_DEF__NAME;

  /**
   * The feature id for the '<em><b>Parameter Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DEF__PARAMETER_DEFS = NAMED_RUNTIME_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Annotation Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DEF_FEATURE_COUNT = NAMED_RUNTIME_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.HashtagDefImpl <em>Hashtag Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.HashtagDefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getHashtagDef()
   * @generated
   */
  int HASHTAG_DEF = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HASHTAG_DEF__NAME = NAMED_ABSTRACT_DEF__NAME;

  /**
   * The feature id for the '<em><b>Parameter Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HASHTAG_DEF__PARAMETER_DEFS = NAMED_ABSTRACT_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hashtag Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HASHTAG_DEF_FEATURE_COUNT = NAMED_ABSTRACT_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.ValDefImpl <em>Val Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.ValDefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getValDef()
   * @generated
   */
  int VAL_DEF = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL_DEF__NAME = REFERENCEABLE_DEFS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL_DEF__VALUE = REFERENCEABLE_DEFS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Val Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL_DEF_FEATURE_COUNT = REFERENCEABLE_DEFS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.PackageDefImpl <em>Package Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.PackageDefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getPackageDef()
   * @generated
   */
  int PACKAGE_DEF = 13;

  /**
   * The feature id for the '<em><b>Module</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEF__MODULE = 0;

  /**
   * The number of structural features of the '<em>Package Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.ImportDefImpl <em>Import Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.ImportDefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getImportDef()
   * @generated
   */
  int IMPORT_DEF = 14;

  /**
   * The feature id for the '<em><b>Module</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DEF__MODULE = ABSTRACT_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DEF_FEATURE_COUNT = ABSTRACT_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.IncludeDefImpl <em>Include Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.IncludeDefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getIncludeDef()
   * @generated
   */
  int INCLUDE_DEF = 15;

  /**
   * The feature id for the '<em><b>Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DEF__MODULE = ABSTRACT_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DEF__NAME = ABSTRACT_DEF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Reexport</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DEF__REEXPORT = ABSTRACT_DEF_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Include Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DEF_FEATURE_COUNT = ABSTRACT_DEF_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.ExportDefImpl <em>Export Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.ExportDefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getExportDef()
   * @generated
   */
  int EXPORT_DEF = 16;

  /**
   * The feature id for the '<em><b>Symbols</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_DEF__SYMBOLS = 0;

  /**
   * The number of structural features of the '<em>Export Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.ExportClauseImpl <em>Export Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.ExportClauseImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getExportClause()
   * @generated
   */
  int EXPORT_CLAUSE = 17;

  /**
   * The feature id for the '<em><b>Unexport</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_CLAUSE__UNEXPORT = 0;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_CLAUSE__SYMBOL = 1;

  /**
   * The number of structural features of the '<em>Export Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.ExportSymbolImpl <em>Export Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.ExportSymbolImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getExportSymbol()
   * @generated
   */
  int EXPORT_SYMBOL = 18;

  /**
   * The number of structural features of the '<em>Export Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_SYMBOL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.ExportAllImpl <em>Export All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.ExportAllImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getExportAll()
   * @generated
   */
  int EXPORT_ALL = 19;

  /**
   * The number of structural features of the '<em>Export All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_ALL_FEATURE_COUNT = EXPORT_SYMBOL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.ExportHashtagImpl <em>Export Hashtag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.ExportHashtagImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getExportHashtag()
   * @generated
   */
  int EXPORT_HASHTAG = 20;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_HASHTAG__REF = EXPORT_SYMBOL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Export Hashtag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_HASHTAG_FEATURE_COUNT = EXPORT_SYMBOL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.ExportRuntimeNameImpl <em>Export Runtime Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.ExportRuntimeNameImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getExportRuntimeName()
   * @generated
   */
  int EXPORT_RUNTIME_NAME = 21;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_RUNTIME_NAME__REF = EXPORT_SYMBOL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Export Runtime Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPORT_RUNTIME_NAME_FEATURE_COUNT = EXPORT_SYMBOL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.TypeDefImpl <em>Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.TypeDefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getTypeDef()
   * @generated
   */
  int TYPE_DEF = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__NAME = NAMED_RUNTIME_DEF__NAME;

  /**
   * The feature id for the '<em><b>Variance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__VARIANCE = NAMED_RUNTIME_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bounds Hi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__BOUNDS_HI = NAMED_RUNTIME_DEF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__TYPE_PARAMETERS = NAMED_RUNTIME_DEF_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF__VALUE = NAMED_RUNTIME_DEF_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF_FEATURE_COUNT = NAMED_RUNTIME_DEF_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.TypeValueImpl <em>Type Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.TypeValueImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getTypeValue()
   * @generated
   */
  int TYPE_VALUE = 23;

  /**
   * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_VALUE__EXTENSIONS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_VALUE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Parms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_VALUE__PARMS = 2;

  /**
   * The number of structural features of the '<em>Type Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_VALUE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.TypeIdImpl <em>Type Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.TypeIdImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getTypeId()
   * @generated
   */
  int TYPE_ID = 26;

  /**
   * The number of structural features of the '<em>Type Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ID_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.TypeNameImpl <em>Type Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.TypeNameImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getTypeName()
   * @generated
   */
  int TYPE_NAME = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME__NAME = TYPE_ID_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_FEATURE_COUNT = TYPE_ID_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.TypeRefImpl <em>Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.TypeRefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getTypeRef()
   * @generated
   */
  int TYPE_REF = 25;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__TYPE_REF = TYPE_ID_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF_FEATURE_COUNT = TYPE_ID_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.CodeAssignmentImpl <em>Code Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.CodeAssignmentImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getCodeAssignment()
   * @generated
   */
  int CODE_ASSIGNMENT = 27;

  /**
   * The number of structural features of the '<em>Code Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ASSIGNMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.CodeBlockImpl <em>Code Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.CodeBlockImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getCodeBlock()
   * @generated
   */
  int CODE_BLOCK = 28;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_BLOCK__TYPE = CODE_ASSIGNMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Code Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_BLOCK_FEATURE_COUNT = CODE_ASSIGNMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.ScalaCodeBlockImpl <em>Scala Code Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.ScalaCodeBlockImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getScalaCodeBlock()
   * @generated
   */
  int SCALA_CODE_BLOCK = 29;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALA_CODE_BLOCK__TYPE = CODE_BLOCK__TYPE;

  /**
   * The feature id for the '<em><b>Code Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALA_CODE_BLOCK__CODE_STR = CODE_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scala Code Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALA_CODE_BLOCK_FEATURE_COUNT = CODE_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.KronusCodeBlockImpl <em>Code Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.KronusCodeBlockImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getKronusCodeBlock()
   * @generated
   */
  int KRONUS_CODE_BLOCK = 30;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_CODE_BLOCK__TYPE = CODE_BLOCK__TYPE;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_CODE_BLOCK__CODE = CODE_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Code Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KRONUS_CODE_BLOCK_FEATURE_COUNT = CODE_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.SimpleParameterValueImpl <em>Simple Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.SimpleParameterValueImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getSimpleParameterValue()
   * @generated
   */
  int SIMPLE_PARAMETER_VALUE = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_PARAMETER_VALUE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_PARAMETER_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Simple Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_PARAMETER_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.HashtagCallImpl <em>Hashtag Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.HashtagCallImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getHashtagCall()
   * @generated
   */
  int HASHTAG_CALL = 32;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HASHTAG_CALL__METHOD = 0;

  /**
   * The feature id for the '<em><b>Parameter Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HASHTAG_CALL__PARAMETER_VALUES = 1;

  /**
   * The number of structural features of the '<em>Hashtag Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HASHTAG_CALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.AnnotationCallImpl <em>Annotation Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.AnnotationCallImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getAnnotationCall()
   * @generated
   */
  int ANNOTATION_CALL = 33;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_CALL__METHOD = 0;

  /**
   * The feature id for the '<em><b>Parameter Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_CALL__PARAMETER_VALUES = 1;

  /**
   * The number of structural features of the '<em>Annotation Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_CALL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.ParameterDefImpl <em>Parameter Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.ParameterDefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getParameterDef()
   * @generated
   */
  int PARAMETER_DEF = 34;

  /**
   * The feature id for the '<em><b>Hashtags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEF__HASHTAGS = REFERENCEABLE_DEFS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEF__ANNOTATIONS = REFERENCEABLE_DEFS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEF__NAME = REFERENCEABLE_DEFS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>By Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEF__BY_NAME = REFERENCEABLE_DEFS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEF__TYPE = REFERENCEABLE_DEFS_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEF__LIST = REFERENCEABLE_DEFS_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEF__DEFAULT_VALUE = REFERENCEABLE_DEFS_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Parameter Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEF_FEATURE_COUNT = REFERENCEABLE_DEFS_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.ParameterValueImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getParameterValue()
   * @generated
   */
  int PARAMETER_VALUE = 35;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.KeywordParameterValueImpl <em>Keyword Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.KeywordParameterValueImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getKeywordParameterValue()
   * @generated
   */
  int KEYWORD_PARAMETER_VALUE = 36;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYWORD_PARAMETER_VALUE__VALUE = PARAMETER_VALUE__VALUE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYWORD_PARAMETER_VALUE__NAME = PARAMETER_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Keyword Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYWORD_PARAMETER_VALUE_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.PositionParameterValueImpl <em>Position Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.PositionParameterValueImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getPositionParameterValue()
   * @generated
   */
  int POSITION_PARAMETER_VALUE = 37;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_PARAMETER_VALUE__VALUE = PARAMETER_VALUE__VALUE;

  /**
   * The number of structural features of the '<em>Position Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_PARAMETER_VALUE_FEATURE_COUNT = PARAMETER_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.ExpressionImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 38;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.ValueImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getValue()
   * @generated
   */
  int VALUE = 39;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.SequenceImpl <em>Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.SequenceImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getSequence()
   * @generated
   */
  int SEQUENCE = 40;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__VALUES = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.ValRefImpl <em>Val Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.ValRefImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getValRef()
   * @generated
   */
  int VAL_REF = 41;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL_REF__REF = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Val Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL_REF_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.FunctionCallImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 42;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__METHOD = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__PARAMETER_VALUES = VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.StringLiteralImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 43;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.DoubleLiteralImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getDoubleLiteral()
   * @generated
   */
  int DOUBLE_LITERAL = 44;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.IntegerLiteralImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getIntegerLiteral()
   * @generated
   */
  int INTEGER_LITERAL = 45;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.BooleanLiteralImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 46;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.UnaryOperationImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getUnaryOperation()
   * @generated
   */
  int UNARY_OPERATION = 47;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATION__OP = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATION__EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.kronus.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.kronus.impl.BinaryOperationImpl
   * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getBinaryOperation()
   * @generated
   */
  int BINARY_OPERATION = 48;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binary Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.TopLevelKronus <em>Top Level Kronus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Level Kronus</em>'.
   * @see com.ms.qaTools.saturn.kronus.TopLevelKronus
   * @generated
   */
  EClass getTopLevelKronus();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.TopLevelKronus#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see com.ms.qaTools.saturn.kronus.TopLevelKronus#getPackage()
   * @see #getTopLevelKronus()
   * @generated
   */
  EReference getTopLevelKronus_Package();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.TopLevelKronus#getExports <em>Exports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exports</em>'.
   * @see com.ms.qaTools.saturn.kronus.TopLevelKronus#getExports()
   * @see #getTopLevelKronus()
   * @generated
   */
  EReference getTopLevelKronus_Exports();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.TopLevelKronus#getKronus <em>Kronus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kronus</em>'.
   * @see com.ms.qaTools.saturn.kronus.TopLevelKronus#getKronus()
   * @see #getTopLevelKronus()
   * @generated
   */
  EReference getTopLevelKronus_Kronus();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.Kronus <em>Kronus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kronus</em>'.
   * @see com.ms.qaTools.saturn.kronus.Kronus
   * @generated
   */
  EClass getKronus();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.Kronus#getDefs <em>Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Defs</em>'.
   * @see com.ms.qaTools.saturn.kronus.Kronus#getDefs()
   * @see #getKronus()
   * @generated
   */
  EReference getKronus_Defs();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.Kronus#getReturn <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return</em>'.
   * @see com.ms.qaTools.saturn.kronus.Kronus#getReturn()
   * @see #getKronus()
   * @generated
   */
  EReference getKronus_Return();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see com.ms.qaTools.saturn.kronus.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.kronus.Assignment#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Lhs</em>'.
   * @see com.ms.qaTools.saturn.kronus.Assignment#getLhs()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Lhs();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.Assignment#getLhsParameter <em>Lhs Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lhs Parameter</em>'.
   * @see com.ms.qaTools.saturn.kronus.Assignment#getLhsParameter()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_LhsParameter();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.kronus.Assignment#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rhs</em>'.
   * @see com.ms.qaTools.saturn.kronus.Assignment#getRhs()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Rhs();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.Assignment#getRhsParameter <em>Rhs Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rhs Parameter</em>'.
   * @see com.ms.qaTools.saturn.kronus.Assignment#getRhsParameter()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_RhsParameter();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.AnnotatedDef <em>Annotated Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotated Def</em>'.
   * @see com.ms.qaTools.saturn.kronus.AnnotatedDef
   * @generated
   */
  EClass getAnnotatedDef();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.AnnotatedDef#getHashtags <em>Hashtags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hashtags</em>'.
   * @see com.ms.qaTools.saturn.kronus.AnnotatedDef#getHashtags()
   * @see #getAnnotatedDef()
   * @generated
   */
  EReference getAnnotatedDef_Hashtags();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.AnnotatedDef#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see com.ms.qaTools.saturn.kronus.AnnotatedDef#getAnnotations()
   * @see #getAnnotatedDef()
   * @generated
   */
  EReference getAnnotatedDef_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.AnnotatedDef#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see com.ms.qaTools.saturn.kronus.AnnotatedDef#getDef()
   * @see #getAnnotatedDef()
   * @generated
   */
  EReference getAnnotatedDef_Def();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.AbstractDef <em>Abstract Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Def</em>'.
   * @see com.ms.qaTools.saturn.kronus.AbstractDef
   * @generated
   */
  EClass getAbstractDef();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.ReferenceableDefs <em>Referenceable Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenceable Defs</em>'.
   * @see com.ms.qaTools.saturn.kronus.ReferenceableDefs
   * @generated
   */
  EClass getReferenceableDefs();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.NamedAbstractDef <em>Named Abstract Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Abstract Def</em>'.
   * @see com.ms.qaTools.saturn.kronus.NamedAbstractDef
   * @generated
   */
  EClass getNamedAbstractDef();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.NamedAbstractDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.kronus.NamedAbstractDef#getName()
   * @see #getNamedAbstractDef()
   * @generated
   */
  EAttribute getNamedAbstractDef_Name();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.NamedRuntimeDef <em>Named Runtime Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Runtime Def</em>'.
   * @see com.ms.qaTools.saturn.kronus.NamedRuntimeDef
   * @generated
   */
  EClass getNamedRuntimeDef();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.TypeInstance <em>Type Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Instance</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeInstance
   * @generated
   */
  EClass getTypeInstance();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.kronus.TypeInstance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeInstance#getName()
   * @see #getTypeInstance()
   * @generated
   */
  EReference getTypeInstance_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.TypeInstance#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeInstance#getTypeParameters()
   * @see #getTypeInstance()
   * @generated
   */
  EReference getTypeInstance_TypeParameters();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.FunctionDef <em>Function Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Def</em>'.
   * @see com.ms.qaTools.saturn.kronus.FunctionDef
   * @generated
   */
  EClass getFunctionDef();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.FunctionDef#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
   * @see com.ms.qaTools.saturn.kronus.FunctionDef#getTypeParameters()
   * @see #getFunctionDef()
   * @generated
   */
  EReference getFunctionDef_TypeParameters();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.FunctionDef#getParameterDefs <em>Parameter Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Defs</em>'.
   * @see com.ms.qaTools.saturn.kronus.FunctionDef#getParameterDefs()
   * @see #getFunctionDef()
   * @generated
   */
  EReference getFunctionDef_ParameterDefs();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.FunctionDef#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see com.ms.qaTools.saturn.kronus.FunctionDef#getReturnType()
   * @see #getFunctionDef()
   * @generated
   */
  EReference getFunctionDef_ReturnType();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.FunctionDef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.FunctionDef#getValue()
   * @see #getFunctionDef()
   * @generated
   */
  EReference getFunctionDef_Value();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.AnnotationDef <em>Annotation Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Def</em>'.
   * @see com.ms.qaTools.saturn.kronus.AnnotationDef
   * @generated
   */
  EClass getAnnotationDef();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.AnnotationDef#getParameterDefs <em>Parameter Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Defs</em>'.
   * @see com.ms.qaTools.saturn.kronus.AnnotationDef#getParameterDefs()
   * @see #getAnnotationDef()
   * @generated
   */
  EReference getAnnotationDef_ParameterDefs();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.HashtagDef <em>Hashtag Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hashtag Def</em>'.
   * @see com.ms.qaTools.saturn.kronus.HashtagDef
   * @generated
   */
  EClass getHashtagDef();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.HashtagDef#getParameterDefs <em>Parameter Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Defs</em>'.
   * @see com.ms.qaTools.saturn.kronus.HashtagDef#getParameterDefs()
   * @see #getHashtagDef()
   * @generated
   */
  EReference getHashtagDef_ParameterDefs();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.ValDef <em>Val Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Val Def</em>'.
   * @see com.ms.qaTools.saturn.kronus.ValDef
   * @generated
   */
  EClass getValDef();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.ValDef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.ValDef#getValue()
   * @see #getValDef()
   * @generated
   */
  EReference getValDef_Value();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.PackageDef <em>Package Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Def</em>'.
   * @see com.ms.qaTools.saturn.kronus.PackageDef
   * @generated
   */
  EClass getPackageDef();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.PackageDef#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Module</em>'.
   * @see com.ms.qaTools.saturn.kronus.PackageDef#getModule()
   * @see #getPackageDef()
   * @generated
   */
  EAttribute getPackageDef_Module();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.ImportDef <em>Import Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Def</em>'.
   * @see com.ms.qaTools.saturn.kronus.ImportDef
   * @generated
   */
  EClass getImportDef();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.ImportDef#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Module</em>'.
   * @see com.ms.qaTools.saturn.kronus.ImportDef#getModule()
   * @see #getImportDef()
   * @generated
   */
  EAttribute getImportDef_Module();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.IncludeDef <em>Include Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Def</em>'.
   * @see com.ms.qaTools.saturn.kronus.IncludeDef
   * @generated
   */
  EClass getIncludeDef();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.kronus.IncludeDef#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Module</em>'.
   * @see com.ms.qaTools.saturn.kronus.IncludeDef#getModule()
   * @see #getIncludeDef()
   * @generated
   */
  EReference getIncludeDef_Module();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.IncludeDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.kronus.IncludeDef#getName()
   * @see #getIncludeDef()
   * @generated
   */
  EAttribute getIncludeDef_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.IncludeDef#isReexport <em>Reexport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reexport</em>'.
   * @see com.ms.qaTools.saturn.kronus.IncludeDef#isReexport()
   * @see #getIncludeDef()
   * @generated
   */
  EAttribute getIncludeDef_Reexport();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.ExportDef <em>Export Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Export Def</em>'.
   * @see com.ms.qaTools.saturn.kronus.ExportDef
   * @generated
   */
  EClass getExportDef();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.ExportDef#getSymbols <em>Symbols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Symbols</em>'.
   * @see com.ms.qaTools.saturn.kronus.ExportDef#getSymbols()
   * @see #getExportDef()
   * @generated
   */
  EReference getExportDef_Symbols();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.ExportClause <em>Export Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Export Clause</em>'.
   * @see com.ms.qaTools.saturn.kronus.ExportClause
   * @generated
   */
  EClass getExportClause();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.ExportClause#isUnexport <em>Unexport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unexport</em>'.
   * @see com.ms.qaTools.saturn.kronus.ExportClause#isUnexport()
   * @see #getExportClause()
   * @generated
   */
  EAttribute getExportClause_Unexport();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.ExportClause#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Symbol</em>'.
   * @see com.ms.qaTools.saturn.kronus.ExportClause#getSymbol()
   * @see #getExportClause()
   * @generated
   */
  EReference getExportClause_Symbol();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.ExportSymbol <em>Export Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Export Symbol</em>'.
   * @see com.ms.qaTools.saturn.kronus.ExportSymbol
   * @generated
   */
  EClass getExportSymbol();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.ExportAll <em>Export All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Export All</em>'.
   * @see com.ms.qaTools.saturn.kronus.ExportAll
   * @generated
   */
  EClass getExportAll();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.ExportHashtag <em>Export Hashtag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Export Hashtag</em>'.
   * @see com.ms.qaTools.saturn.kronus.ExportHashtag
   * @generated
   */
  EClass getExportHashtag();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.kronus.ExportHashtag#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.ms.qaTools.saturn.kronus.ExportHashtag#getRef()
   * @see #getExportHashtag()
   * @generated
   */
  EReference getExportHashtag_Ref();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.ExportRuntimeName <em>Export Runtime Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Export Runtime Name</em>'.
   * @see com.ms.qaTools.saturn.kronus.ExportRuntimeName
   * @generated
   */
  EClass getExportRuntimeName();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.kronus.ExportRuntimeName#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.ms.qaTools.saturn.kronus.ExportRuntimeName#getRef()
   * @see #getExportRuntimeName()
   * @generated
   */
  EReference getExportRuntimeName_Ref();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Def</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeDef
   * @generated
   */
  EClass getTypeDef();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.TypeDef#getVariance <em>Variance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variance</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeDef#getVariance()
   * @see #getTypeDef()
   * @generated
   */
  EAttribute getTypeDef_Variance();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.TypeDef#getBoundsHi <em>Bounds Hi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bounds Hi</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeDef#getBoundsHi()
   * @see #getTypeDef()
   * @generated
   */
  EReference getTypeDef_BoundsHi();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.TypeDef#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeDef#getTypeParameters()
   * @see #getTypeDef()
   * @generated
   */
  EReference getTypeDef_TypeParameters();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.TypeDef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeDef#getValue()
   * @see #getTypeDef()
   * @generated
   */
  EReference getTypeDef_Value();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.TypeValue <em>Type Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeValue
   * @generated
   */
  EClass getTypeValue();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.TypeValue#getExtensions <em>Extensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extensions</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeValue#getExtensions()
   * @see #getTypeValue()
   * @generated
   */
  EReference getTypeValue_Extensions();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.TypeValue#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeValue#getType()
   * @see #getTypeValue()
   * @generated
   */
  EReference getTypeValue_Type();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.TypeValue#getParms <em>Parms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parms</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeValue#getParms()
   * @see #getTypeValue()
   * @generated
   */
  EReference getTypeValue_Parms();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.TypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Name</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeName
   * @generated
   */
  EClass getTypeName();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.TypeName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeName#getName()
   * @see #getTypeName()
   * @generated
   */
  EAttribute getTypeName_Name();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Ref</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeRef
   * @generated
   */
  EClass getTypeRef();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.kronus.TypeRef#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Ref</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeRef#getTypeRef()
   * @see #getTypeRef()
   * @generated
   */
  EReference getTypeRef_TypeRef();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.TypeId <em>Type Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Id</em>'.
   * @see com.ms.qaTools.saturn.kronus.TypeId
   * @generated
   */
  EClass getTypeId();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.CodeAssignment <em>Code Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code Assignment</em>'.
   * @see com.ms.qaTools.saturn.kronus.CodeAssignment
   * @generated
   */
  EClass getCodeAssignment();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.CodeBlock <em>Code Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code Block</em>'.
   * @see com.ms.qaTools.saturn.kronus.CodeBlock
   * @generated
   */
  EClass getCodeBlock();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.CodeBlock#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.ms.qaTools.saturn.kronus.CodeBlock#getType()
   * @see #getCodeBlock()
   * @generated
   */
  EAttribute getCodeBlock_Type();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.ScalaCodeBlock <em>Scala Code Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scala Code Block</em>'.
   * @see com.ms.qaTools.saturn.kronus.ScalaCodeBlock
   * @generated
   */
  EClass getScalaCodeBlock();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.ScalaCodeBlock#getCodeStr <em>Code Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code Str</em>'.
   * @see com.ms.qaTools.saturn.kronus.ScalaCodeBlock#getCodeStr()
   * @see #getScalaCodeBlock()
   * @generated
   */
  EAttribute getScalaCodeBlock_CodeStr();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.KronusCodeBlock <em>Code Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code Block</em>'.
   * @see com.ms.qaTools.saturn.kronus.KronusCodeBlock
   * @generated
   */
  EClass getKronusCodeBlock();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.KronusCodeBlock#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Code</em>'.
   * @see com.ms.qaTools.saturn.kronus.KronusCodeBlock#getCode()
   * @see #getKronusCodeBlock()
   * @generated
   */
  EReference getKronusCodeBlock_Code();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.SimpleParameterValue <em>Simple Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Parameter Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.SimpleParameterValue
   * @generated
   */
  EClass getSimpleParameterValue();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.SimpleParameterValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.kronus.SimpleParameterValue#getName()
   * @see #getSimpleParameterValue()
   * @generated
   */
  EAttribute getSimpleParameterValue_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.SimpleParameterValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.SimpleParameterValue#getValue()
   * @see #getSimpleParameterValue()
   * @generated
   */
  EAttribute getSimpleParameterValue_Value();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.HashtagCall <em>Hashtag Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hashtag Call</em>'.
   * @see com.ms.qaTools.saturn.kronus.HashtagCall
   * @generated
   */
  EClass getHashtagCall();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.kronus.HashtagCall#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method</em>'.
   * @see com.ms.qaTools.saturn.kronus.HashtagCall#getMethod()
   * @see #getHashtagCall()
   * @generated
   */
  EReference getHashtagCall_Method();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.HashtagCall#getParameterValues <em>Parameter Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Values</em>'.
   * @see com.ms.qaTools.saturn.kronus.HashtagCall#getParameterValues()
   * @see #getHashtagCall()
   * @generated
   */
  EReference getHashtagCall_ParameterValues();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.AnnotationCall <em>Annotation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Call</em>'.
   * @see com.ms.qaTools.saturn.kronus.AnnotationCall
   * @generated
   */
  EClass getAnnotationCall();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.kronus.AnnotationCall#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method</em>'.
   * @see com.ms.qaTools.saturn.kronus.AnnotationCall#getMethod()
   * @see #getAnnotationCall()
   * @generated
   */
  EReference getAnnotationCall_Method();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.AnnotationCall#getParameterValues <em>Parameter Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Values</em>'.
   * @see com.ms.qaTools.saturn.kronus.AnnotationCall#getParameterValues()
   * @see #getAnnotationCall()
   * @generated
   */
  EReference getAnnotationCall_ParameterValues();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.ParameterDef <em>Parameter Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Def</em>'.
   * @see com.ms.qaTools.saturn.kronus.ParameterDef
   * @generated
   */
  EClass getParameterDef();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.ParameterDef#getHashtags <em>Hashtags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hashtags</em>'.
   * @see com.ms.qaTools.saturn.kronus.ParameterDef#getHashtags()
   * @see #getParameterDef()
   * @generated
   */
  EReference getParameterDef_Hashtags();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.ParameterDef#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see com.ms.qaTools.saturn.kronus.ParameterDef#getAnnotations()
   * @see #getParameterDef()
   * @generated
   */
  EReference getParameterDef_Annotations();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.ParameterDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.kronus.ParameterDef#getName()
   * @see #getParameterDef()
   * @generated
   */
  EAttribute getParameterDef_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.ParameterDef#isByName <em>By Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>By Name</em>'.
   * @see com.ms.qaTools.saturn.kronus.ParameterDef#isByName()
   * @see #getParameterDef()
   * @generated
   */
  EAttribute getParameterDef_ByName();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.ParameterDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.ms.qaTools.saturn.kronus.ParameterDef#getType()
   * @see #getParameterDef()
   * @generated
   */
  EReference getParameterDef_Type();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.ParameterDef#isList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List</em>'.
   * @see com.ms.qaTools.saturn.kronus.ParameterDef#isList()
   * @see #getParameterDef()
   * @generated
   */
  EAttribute getParameterDef_List();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.ParameterDef#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.ParameterDef#getDefaultValue()
   * @see #getParameterDef()
   * @generated
   */
  EReference getParameterDef_DefaultValue();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.ParameterValue <em>Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.ParameterValue
   * @generated
   */
  EClass getParameterValue();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.ParameterValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.ParameterValue#getValue()
   * @see #getParameterValue()
   * @generated
   */
  EReference getParameterValue_Value();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.KeywordParameterValue <em>Keyword Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Keyword Parameter Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.KeywordParameterValue
   * @generated
   */
  EClass getKeywordParameterValue();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.KeywordParameterValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.kronus.KeywordParameterValue#getName()
   * @see #getKeywordParameterValue()
   * @generated
   */
  EAttribute getKeywordParameterValue_Name();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.PositionParameterValue <em>Position Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Position Parameter Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.PositionParameterValue
   * @generated
   */
  EClass getPositionParameterValue();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see com.ms.qaTools.saturn.kronus.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence</em>'.
   * @see com.ms.qaTools.saturn.kronus.Sequence
   * @generated
   */
  EClass getSequence();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.Sequence#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see com.ms.qaTools.saturn.kronus.Sequence#getValues()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Values();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.ValRef <em>Val Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Val Ref</em>'.
   * @see com.ms.qaTools.saturn.kronus.ValRef
   * @generated
   */
  EClass getValRef();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.kronus.ValRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.ms.qaTools.saturn.kronus.ValRef#getRef()
   * @see #getValRef()
   * @generated
   */
  EReference getValRef_Ref();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see com.ms.qaTools.saturn.kronus.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the reference '{@link com.ms.qaTools.saturn.kronus.FunctionCall#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method</em>'.
   * @see com.ms.qaTools.saturn.kronus.FunctionCall#getMethod()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Method();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.kronus.FunctionCall#getParameterValues <em>Parameter Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Values</em>'.
   * @see com.ms.qaTools.saturn.kronus.FunctionCall#getParameterValues()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_ParameterValues();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see com.ms.qaTools.saturn.kronus.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.DoubleLiteral <em>Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Literal</em>'.
   * @see com.ms.qaTools.saturn.kronus.DoubleLiteral
   * @generated
   */
  EClass getDoubleLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.DoubleLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.DoubleLiteral#getValue()
   * @see #getDoubleLiteral()
   * @generated
   */
  EAttribute getDoubleLiteral_Value();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal</em>'.
   * @see com.ms.qaTools.saturn.kronus.IntegerLiteral
   * @generated
   */
  EClass getIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.IntegerLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.IntegerLiteral#getValue()
   * @see #getIntegerLiteral()
   * @generated
   */
  EAttribute getIntegerLiteral_Value();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see com.ms.qaTools.saturn.kronus.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.BooleanLiteral#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.ms.qaTools.saturn.kronus.BooleanLiteral#isValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.UnaryOperation <em>Unary Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Operation</em>'.
   * @see com.ms.qaTools.saturn.kronus.UnaryOperation
   * @generated
   */
  EClass getUnaryOperation();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.UnaryOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.ms.qaTools.saturn.kronus.UnaryOperation#getOp()
   * @see #getUnaryOperation()
   * @generated
   */
  EAttribute getUnaryOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.UnaryOperation#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see com.ms.qaTools.saturn.kronus.UnaryOperation#getExpr()
   * @see #getUnaryOperation()
   * @generated
   */
  EReference getUnaryOperation_Expr();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.kronus.BinaryOperation <em>Binary Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Operation</em>'.
   * @see com.ms.qaTools.saturn.kronus.BinaryOperation
   * @generated
   */
  EClass getBinaryOperation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.BinaryOperation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.ms.qaTools.saturn.kronus.BinaryOperation#getLeft()
   * @see #getBinaryOperation()
   * @generated
   */
  EReference getBinaryOperation_Left();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.kronus.BinaryOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.ms.qaTools.saturn.kronus.BinaryOperation#getOp()
   * @see #getBinaryOperation()
   * @generated
   */
  EAttribute getBinaryOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.kronus.BinaryOperation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.ms.qaTools.saturn.kronus.BinaryOperation#getRight()
   * @see #getBinaryOperation()
   * @generated
   */
  EReference getBinaryOperation_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KronusFactory getKronusFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.TopLevelKronusImpl <em>Top Level Kronus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.TopLevelKronusImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getTopLevelKronus()
     * @generated
     */
    EClass TOP_LEVEL_KRONUS = eINSTANCE.getTopLevelKronus();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP_LEVEL_KRONUS__PACKAGE = eINSTANCE.getTopLevelKronus_Package();

    /**
     * The meta object literal for the '<em><b>Exports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP_LEVEL_KRONUS__EXPORTS = eINSTANCE.getTopLevelKronus_Exports();

    /**
     * The meta object literal for the '<em><b>Kronus</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP_LEVEL_KRONUS__KRONUS = eINSTANCE.getTopLevelKronus_Kronus();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.KronusImpl <em>Kronus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.KronusImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getKronus()
     * @generated
     */
    EClass KRONUS = eINSTANCE.getKronus();

    /**
     * The meta object literal for the '<em><b>Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KRONUS__DEFS = eINSTANCE.getKronus_Defs();

    /**
     * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KRONUS__RETURN = eINSTANCE.getKronus_Return();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.AssignmentImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__LHS = eINSTANCE.getAssignment_Lhs();

    /**
     * The meta object literal for the '<em><b>Lhs Parameter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__LHS_PARAMETER = eINSTANCE.getAssignment_LhsParameter();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__RHS = eINSTANCE.getAssignment_Rhs();

    /**
     * The meta object literal for the '<em><b>Rhs Parameter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__RHS_PARAMETER = eINSTANCE.getAssignment_RhsParameter();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.AnnotatedDefImpl <em>Annotated Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.AnnotatedDefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getAnnotatedDef()
     * @generated
     */
    EClass ANNOTATED_DEF = eINSTANCE.getAnnotatedDef();

    /**
     * The meta object literal for the '<em><b>Hashtags</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATED_DEF__HASHTAGS = eINSTANCE.getAnnotatedDef_Hashtags();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATED_DEF__ANNOTATIONS = eINSTANCE.getAnnotatedDef_Annotations();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATED_DEF__DEF = eINSTANCE.getAnnotatedDef_Def();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.AbstractDefImpl <em>Abstract Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.AbstractDefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getAbstractDef()
     * @generated
     */
    EClass ABSTRACT_DEF = eINSTANCE.getAbstractDef();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.ReferenceableDefsImpl <em>Referenceable Defs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.ReferenceableDefsImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getReferenceableDefs()
     * @generated
     */
    EClass REFERENCEABLE_DEFS = eINSTANCE.getReferenceableDefs();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.NamedAbstractDefImpl <em>Named Abstract Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.NamedAbstractDefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getNamedAbstractDef()
     * @generated
     */
    EClass NAMED_ABSTRACT_DEF = eINSTANCE.getNamedAbstractDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ABSTRACT_DEF__NAME = eINSTANCE.getNamedAbstractDef_Name();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.NamedRuntimeDefImpl <em>Named Runtime Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.NamedRuntimeDefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getNamedRuntimeDef()
     * @generated
     */
    EClass NAMED_RUNTIME_DEF = eINSTANCE.getNamedRuntimeDef();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.TypeInstanceImpl <em>Type Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.TypeInstanceImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getTypeInstance()
     * @generated
     */
    EClass TYPE_INSTANCE = eINSTANCE.getTypeInstance();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_INSTANCE__NAME = eINSTANCE.getTypeInstance_Name();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_INSTANCE__TYPE_PARAMETERS = eINSTANCE.getTypeInstance_TypeParameters();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.FunctionDefImpl <em>Function Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.FunctionDefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getFunctionDef()
     * @generated
     */
    EClass FUNCTION_DEF = eINSTANCE.getFunctionDef();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEF__TYPE_PARAMETERS = eINSTANCE.getFunctionDef_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Parameter Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEF__PARAMETER_DEFS = eINSTANCE.getFunctionDef_ParameterDefs();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEF__RETURN_TYPE = eINSTANCE.getFunctionDef_ReturnType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEF__VALUE = eINSTANCE.getFunctionDef_Value();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.AnnotationDefImpl <em>Annotation Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.AnnotationDefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getAnnotationDef()
     * @generated
     */
    EClass ANNOTATION_DEF = eINSTANCE.getAnnotationDef();

    /**
     * The meta object literal for the '<em><b>Parameter Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_DEF__PARAMETER_DEFS = eINSTANCE.getAnnotationDef_ParameterDefs();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.HashtagDefImpl <em>Hashtag Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.HashtagDefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getHashtagDef()
     * @generated
     */
    EClass HASHTAG_DEF = eINSTANCE.getHashtagDef();

    /**
     * The meta object literal for the '<em><b>Parameter Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HASHTAG_DEF__PARAMETER_DEFS = eINSTANCE.getHashtagDef_ParameterDefs();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.ValDefImpl <em>Val Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.ValDefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getValDef()
     * @generated
     */
    EClass VAL_DEF = eINSTANCE.getValDef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAL_DEF__VALUE = eINSTANCE.getValDef_Value();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.PackageDefImpl <em>Package Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.PackageDefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getPackageDef()
     * @generated
     */
    EClass PACKAGE_DEF = eINSTANCE.getPackageDef();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DEF__MODULE = eINSTANCE.getPackageDef_Module();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.ImportDefImpl <em>Import Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.ImportDefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getImportDef()
     * @generated
     */
    EClass IMPORT_DEF = eINSTANCE.getImportDef();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_DEF__MODULE = eINSTANCE.getImportDef_Module();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.IncludeDefImpl <em>Include Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.IncludeDefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getIncludeDef()
     * @generated
     */
    EClass INCLUDE_DEF = eINSTANCE.getIncludeDef();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUDE_DEF__MODULE = eINSTANCE.getIncludeDef_Module();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE_DEF__NAME = eINSTANCE.getIncludeDef_Name();

    /**
     * The meta object literal for the '<em><b>Reexport</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE_DEF__REEXPORT = eINSTANCE.getIncludeDef_Reexport();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.ExportDefImpl <em>Export Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.ExportDefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getExportDef()
     * @generated
     */
    EClass EXPORT_DEF = eINSTANCE.getExportDef();

    /**
     * The meta object literal for the '<em><b>Symbols</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPORT_DEF__SYMBOLS = eINSTANCE.getExportDef_Symbols();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.ExportClauseImpl <em>Export Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.ExportClauseImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getExportClause()
     * @generated
     */
    EClass EXPORT_CLAUSE = eINSTANCE.getExportClause();

    /**
     * The meta object literal for the '<em><b>Unexport</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPORT_CLAUSE__UNEXPORT = eINSTANCE.getExportClause_Unexport();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPORT_CLAUSE__SYMBOL = eINSTANCE.getExportClause_Symbol();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.ExportSymbolImpl <em>Export Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.ExportSymbolImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getExportSymbol()
     * @generated
     */
    EClass EXPORT_SYMBOL = eINSTANCE.getExportSymbol();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.ExportAllImpl <em>Export All</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.ExportAllImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getExportAll()
     * @generated
     */
    EClass EXPORT_ALL = eINSTANCE.getExportAll();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.ExportHashtagImpl <em>Export Hashtag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.ExportHashtagImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getExportHashtag()
     * @generated
     */
    EClass EXPORT_HASHTAG = eINSTANCE.getExportHashtag();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPORT_HASHTAG__REF = eINSTANCE.getExportHashtag_Ref();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.ExportRuntimeNameImpl <em>Export Runtime Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.ExportRuntimeNameImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getExportRuntimeName()
     * @generated
     */
    EClass EXPORT_RUNTIME_NAME = eINSTANCE.getExportRuntimeName();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPORT_RUNTIME_NAME__REF = eINSTANCE.getExportRuntimeName_Ref();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.TypeDefImpl <em>Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.TypeDefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getTypeDef()
     * @generated
     */
    EClass TYPE_DEF = eINSTANCE.getTypeDef();

    /**
     * The meta object literal for the '<em><b>Variance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DEF__VARIANCE = eINSTANCE.getTypeDef_Variance();

    /**
     * The meta object literal for the '<em><b>Bounds Hi</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEF__BOUNDS_HI = eINSTANCE.getTypeDef_BoundsHi();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEF__TYPE_PARAMETERS = eINSTANCE.getTypeDef_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DEF__VALUE = eINSTANCE.getTypeDef_Value();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.TypeValueImpl <em>Type Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.TypeValueImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getTypeValue()
     * @generated
     */
    EClass TYPE_VALUE = eINSTANCE.getTypeValue();

    /**
     * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_VALUE__EXTENSIONS = eINSTANCE.getTypeValue_Extensions();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_VALUE__TYPE = eINSTANCE.getTypeValue_Type();

    /**
     * The meta object literal for the '<em><b>Parms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_VALUE__PARMS = eINSTANCE.getTypeValue_Parms();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.TypeNameImpl <em>Type Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.TypeNameImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getTypeName()
     * @generated
     */
    EClass TYPE_NAME = eINSTANCE.getTypeName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_NAME__NAME = eINSTANCE.getTypeName_Name();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.TypeRefImpl <em>Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.TypeRefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getTypeRef()
     * @generated
     */
    EClass TYPE_REF = eINSTANCE.getTypeRef();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REF__TYPE_REF = eINSTANCE.getTypeRef_TypeRef();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.TypeIdImpl <em>Type Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.TypeIdImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getTypeId()
     * @generated
     */
    EClass TYPE_ID = eINSTANCE.getTypeId();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.CodeAssignmentImpl <em>Code Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.CodeAssignmentImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getCodeAssignment()
     * @generated
     */
    EClass CODE_ASSIGNMENT = eINSTANCE.getCodeAssignment();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.CodeBlockImpl <em>Code Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.CodeBlockImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getCodeBlock()
     * @generated
     */
    EClass CODE_BLOCK = eINSTANCE.getCodeBlock();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODE_BLOCK__TYPE = eINSTANCE.getCodeBlock_Type();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.ScalaCodeBlockImpl <em>Scala Code Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.ScalaCodeBlockImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getScalaCodeBlock()
     * @generated
     */
    EClass SCALA_CODE_BLOCK = eINSTANCE.getScalaCodeBlock();

    /**
     * The meta object literal for the '<em><b>Code Str</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCALA_CODE_BLOCK__CODE_STR = eINSTANCE.getScalaCodeBlock_CodeStr();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.KronusCodeBlockImpl <em>Code Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.KronusCodeBlockImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getKronusCodeBlock()
     * @generated
     */
    EClass KRONUS_CODE_BLOCK = eINSTANCE.getKronusCodeBlock();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KRONUS_CODE_BLOCK__CODE = eINSTANCE.getKronusCodeBlock_Code();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.SimpleParameterValueImpl <em>Simple Parameter Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.SimpleParameterValueImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getSimpleParameterValue()
     * @generated
     */
    EClass SIMPLE_PARAMETER_VALUE = eINSTANCE.getSimpleParameterValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_PARAMETER_VALUE__NAME = eINSTANCE.getSimpleParameterValue_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_PARAMETER_VALUE__VALUE = eINSTANCE.getSimpleParameterValue_Value();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.HashtagCallImpl <em>Hashtag Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.HashtagCallImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getHashtagCall()
     * @generated
     */
    EClass HASHTAG_CALL = eINSTANCE.getHashtagCall();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HASHTAG_CALL__METHOD = eINSTANCE.getHashtagCall_Method();

    /**
     * The meta object literal for the '<em><b>Parameter Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HASHTAG_CALL__PARAMETER_VALUES = eINSTANCE.getHashtagCall_ParameterValues();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.AnnotationCallImpl <em>Annotation Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.AnnotationCallImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getAnnotationCall()
     * @generated
     */
    EClass ANNOTATION_CALL = eINSTANCE.getAnnotationCall();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_CALL__METHOD = eINSTANCE.getAnnotationCall_Method();

    /**
     * The meta object literal for the '<em><b>Parameter Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_CALL__PARAMETER_VALUES = eINSTANCE.getAnnotationCall_ParameterValues();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.ParameterDefImpl <em>Parameter Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.ParameterDefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getParameterDef()
     * @generated
     */
    EClass PARAMETER_DEF = eINSTANCE.getParameterDef();

    /**
     * The meta object literal for the '<em><b>Hashtags</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DEF__HASHTAGS = eINSTANCE.getParameterDef_Hashtags();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DEF__ANNOTATIONS = eINSTANCE.getParameterDef_Annotations();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DEF__NAME = eINSTANCE.getParameterDef_Name();

    /**
     * The meta object literal for the '<em><b>By Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DEF__BY_NAME = eINSTANCE.getParameterDef_ByName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DEF__TYPE = eINSTANCE.getParameterDef_Type();

    /**
     * The meta object literal for the '<em><b>List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DEF__LIST = eINSTANCE.getParameterDef_List();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DEF__DEFAULT_VALUE = eINSTANCE.getParameterDef_DefaultValue();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.ParameterValueImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getParameterValue()
     * @generated
     */
    EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_VALUE__VALUE = eINSTANCE.getParameterValue_Value();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.KeywordParameterValueImpl <em>Keyword Parameter Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.KeywordParameterValueImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getKeywordParameterValue()
     * @generated
     */
    EClass KEYWORD_PARAMETER_VALUE = eINSTANCE.getKeywordParameterValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEYWORD_PARAMETER_VALUE__NAME = eINSTANCE.getKeywordParameterValue_Name();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.PositionParameterValueImpl <em>Position Parameter Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.PositionParameterValueImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getPositionParameterValue()
     * @generated
     */
    EClass POSITION_PARAMETER_VALUE = eINSTANCE.getPositionParameterValue();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.ExpressionImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.ValueImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.SequenceImpl <em>Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.SequenceImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getSequence()
     * @generated
     */
    EClass SEQUENCE = eINSTANCE.getSequence();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__VALUES = eINSTANCE.getSequence_Values();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.ValRefImpl <em>Val Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.ValRefImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getValRef()
     * @generated
     */
    EClass VAL_REF = eINSTANCE.getValRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAL_REF__REF = eINSTANCE.getValRef_Ref();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.FunctionCallImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__METHOD = eINSTANCE.getFunctionCall_Method();

    /**
     * The meta object literal for the '<em><b>Parameter Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__PARAMETER_VALUES = eINSTANCE.getFunctionCall_ParameterValues();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.StringLiteralImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.DoubleLiteralImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getDoubleLiteral()
     * @generated
     */
    EClass DOUBLE_LITERAL = eINSTANCE.getDoubleLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_LITERAL__VALUE = eINSTANCE.getDoubleLiteral_Value();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.IntegerLiteralImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getIntegerLiteral()
     * @generated
     */
    EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.BooleanLiteralImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.UnaryOperationImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getUnaryOperation()
     * @generated
     */
    EClass UNARY_OPERATION = eINSTANCE.getUnaryOperation();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_OPERATION__OP = eINSTANCE.getUnaryOperation_Op();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_OPERATION__EXPR = eINSTANCE.getUnaryOperation_Expr();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.kronus.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.kronus.impl.BinaryOperationImpl
     * @see com.ms.qaTools.saturn.kronus.impl.KronusPackageImpl#getBinaryOperation()
     * @generated
     */
    EClass BINARY_OPERATION = eINSTANCE.getBinaryOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_OPERATION__LEFT = eINSTANCE.getBinaryOperation_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_OPERATION__OP = eINSTANCE.getBinaryOperation_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_OPERATION__RIGHT = eINSTANCE.getBinaryOperation_Right();

  }

} //KronusPackage
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
