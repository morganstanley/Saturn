package com.ms.qaTools.saturn.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.ms.qaTools.saturn.kronus.AnnotationCall;
import com.ms.qaTools.saturn.kronus.AnnotationDef;
import com.ms.qaTools.saturn.kronus.BinaryOperation;
import com.ms.qaTools.saturn.kronus.BooleanLiteral;
import com.ms.qaTools.saturn.kronus.DoubleLiteral;
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
import com.ms.qaTools.saturn.kronus.KronusPackage;
import com.ms.qaTools.saturn.kronus.PackageDef;
import com.ms.qaTools.saturn.kronus.ParameterDef;
import com.ms.qaTools.saturn.kronus.PositionParameterValue;
import com.ms.qaTools.saturn.kronus.ScalaCodeBlock;
import com.ms.qaTools.saturn.kronus.Sequence;
import com.ms.qaTools.saturn.kronus.SimpleParameterValue;
import com.ms.qaTools.saturn.kronus.StringLiteral;
import com.ms.qaTools.saturn.kronus.TopLevelKronus;
import com.ms.qaTools.saturn.kronus.TypeDef;
import com.ms.qaTools.saturn.kronus.TypeInstance;
import com.ms.qaTools.saturn.kronus.TypeName;
import com.ms.qaTools.saturn.kronus.TypeRef;
import com.ms.qaTools.saturn.kronus.TypeValue;
import com.ms.qaTools.saturn.kronus.UnaryOperation;
import com.ms.qaTools.saturn.kronus.ValDef;
import com.ms.qaTools.saturn.kronus.ValRef;
import com.ms.qaTools.saturn.services.KronusGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class KronusSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private KronusGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == KronusPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case KronusPackage.ANNOTATION_CALL:
				if(context == grammarAccess.getAnnotationCallRule()) {
					sequence_AnnotationCall(context, (AnnotationCall) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.ANNOTATION_DEF:
				if(context == grammarAccess.getAbstractDefRule() ||
				   context == grammarAccess.getAnnotationDefRule()) {
					sequence_AnnotationDef(context, (AnnotationDef) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.BINARY_OPERATION:
				if(context == grammarAccess.getBinaryOperation1Rule() ||
				   context == grammarAccess.getBinaryOperation1Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation2Rule() ||
				   context == grammarAccess.getBinaryOperation2Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation3Rule() ||
				   context == grammarAccess.getBinaryOperation3Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation4Rule() ||
				   context == grammarAccess.getBinaryOperation4Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation5Rule() ||
				   context == grammarAccess.getBinaryOperation5Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getUnaryOrPrimaryRule() ||
				   context == grammarAccess.getValueOperationRule() ||
				   context == grammarAccess.getValueOperationAccess().getBinaryOperationLeftAction_1_0()) {
					sequence_BinaryOperation1_BinaryOperation2_BinaryOperation3_BinaryOperation4_BinaryOperation5_ValueOperation(context, (BinaryOperation) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBinaryOperation1Rule() ||
				   context == grammarAccess.getBinaryOperation1Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation2Rule() ||
				   context == grammarAccess.getBinaryOperation2Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation3Rule() ||
				   context == grammarAccess.getBinaryOperation3Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation4Rule() ||
				   context == grammarAccess.getBinaryOperation4Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation5Rule() ||
				   context == grammarAccess.getBinaryOperation5Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getUnaryOrPrimaryRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getValueOperationRule() ||
				   context == grammarAccess.getValueOperationAccess().getBinaryOperationLeftAction_1_0()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.DOUBLE_LITERAL:
				if(context == grammarAccess.getBinaryOperation1Rule() ||
				   context == grammarAccess.getBinaryOperation1Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation2Rule() ||
				   context == grammarAccess.getBinaryOperation2Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation3Rule() ||
				   context == grammarAccess.getBinaryOperation3Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation4Rule() ||
				   context == grammarAccess.getBinaryOperation4Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation5Rule() ||
				   context == grammarAccess.getBinaryOperation5Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getDoubleLiteralRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getUnaryOrPrimaryRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getValueOperationRule() ||
				   context == grammarAccess.getValueOperationAccess().getBinaryOperationLeftAction_1_0()) {
					sequence_DoubleLiteral(context, (DoubleLiteral) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.FUNCTION_CALL:
				if(context == grammarAccess.getBinaryOperation1Rule() ||
				   context == grammarAccess.getBinaryOperation1Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation2Rule() ||
				   context == grammarAccess.getBinaryOperation2Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation3Rule() ||
				   context == grammarAccess.getBinaryOperation3Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation4Rule() ||
				   context == grammarAccess.getBinaryOperation4Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation5Rule() ||
				   context == grammarAccess.getBinaryOperation5Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getFunctionCallRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getUnaryOrPrimaryRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getValueOperationRule() ||
				   context == grammarAccess.getValueOperationAccess().getBinaryOperationLeftAction_1_0()) {
					sequence_FunctionCall(context, (FunctionCall) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.FUNCTION_DEF:
				if(context == grammarAccess.getAbstractDefRule() ||
				   context == grammarAccess.getFunctionDefRule() ||
				   context == grammarAccess.getReferenceableDefsRule()) {
					sequence_FunctionDef(context, (FunctionDef) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.HASHTAG_CALL:
				if(context == grammarAccess.getHashtagCallRule()) {
					sequence_HashtagCall(context, (HashtagCall) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.HASHTAG_DEF:
				if(context == grammarAccess.getAbstractDefRule() ||
				   context == grammarAccess.getHashtagDefRule()) {
					sequence_HashtagDef(context, (HashtagDef) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.IMPORT_DEF:
				if(context == grammarAccess.getImportDefRule()) {
					sequence_ImportDef(context, (ImportDef) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.INCLUDE_DEF:
				if(context == grammarAccess.getIncludeDefRule()) {
					sequence_IncludeDef(context, (IncludeDef) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.INCLUDE_REF:
				if(context == grammarAccess.getBinaryOperation1Rule() ||
				   context == grammarAccess.getBinaryOperation1Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation2Rule() ||
				   context == grammarAccess.getBinaryOperation2Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation3Rule() ||
				   context == grammarAccess.getBinaryOperation3Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation4Rule() ||
				   context == grammarAccess.getBinaryOperation4Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation5Rule() ||
				   context == grammarAccess.getBinaryOperation5Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getIncludeRefRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getUnaryOrPrimaryRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getValueOperationRule() ||
				   context == grammarAccess.getValueOperationAccess().getBinaryOperationLeftAction_1_0()) {
					sequence_IncludeRef(context, (IncludeRef) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.INTEGER_LITERAL:
				if(context == grammarAccess.getBinaryOperation1Rule() ||
				   context == grammarAccess.getBinaryOperation1Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation2Rule() ||
				   context == grammarAccess.getBinaryOperation2Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation3Rule() ||
				   context == grammarAccess.getBinaryOperation3Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation4Rule() ||
				   context == grammarAccess.getBinaryOperation4Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation5Rule() ||
				   context == grammarAccess.getBinaryOperation5Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getIntegerLiteralRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getUnaryOrPrimaryRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getValueOperationRule() ||
				   context == grammarAccess.getValueOperationAccess().getBinaryOperationLeftAction_1_0()) {
					sequence_IntegerLiteral(context, (IntegerLiteral) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.KEYWORD_PARAMETER_VALUE:
				if(context == grammarAccess.getKeywordParameterValueRule() ||
				   context == grammarAccess.getParameterValueRule()) {
					sequence_KeywordParameterValue(context, (KeywordParameterValue) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.KRONUS:
				if(context == grammarAccess.getKronusRule()) {
					sequence_Kronus(context, (Kronus) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.KRONUS_CODE_BLOCK:
				if(context == grammarAccess.getBinaryOperation1Rule() ||
				   context == grammarAccess.getBinaryOperation1Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation2Rule() ||
				   context == grammarAccess.getBinaryOperation2Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation3Rule() ||
				   context == grammarAccess.getBinaryOperation3Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation4Rule() ||
				   context == grammarAccess.getBinaryOperation4Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation5Rule() ||
				   context == grammarAccess.getBinaryOperation5Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getCodeAssignmentRule() ||
				   context == grammarAccess.getCodeBlockRule() ||
				   context == grammarAccess.getKronusCodeBlockRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getUnaryOrPrimaryRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getValueOperationRule() ||
				   context == grammarAccess.getValueOperationAccess().getBinaryOperationLeftAction_1_0()) {
					sequence_KronusCodeBlock(context, (KronusCodeBlock) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.PACKAGE_DEF:
				if(context == grammarAccess.getPackageDefRule()) {
					sequence_PackageDef(context, (PackageDef) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.PARAMETER_DEF:
				if(context == grammarAccess.getParameterDefRule() ||
				   context == grammarAccess.getReferenceableDefsRule()) {
					sequence_ParameterDef(context, (ParameterDef) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.POSITION_PARAMETER_VALUE:
				if(context == grammarAccess.getParameterValueRule() ||
				   context == grammarAccess.getPositionParameterValueRule()) {
					sequence_PositionParameterValue(context, (PositionParameterValue) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.SCALA_CODE_BLOCK:
				if(context == grammarAccess.getBinaryOperation1Rule() ||
				   context == grammarAccess.getBinaryOperation1Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation2Rule() ||
				   context == grammarAccess.getBinaryOperation2Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation3Rule() ||
				   context == grammarAccess.getBinaryOperation3Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation4Rule() ||
				   context == grammarAccess.getBinaryOperation4Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation5Rule() ||
				   context == grammarAccess.getBinaryOperation5Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getCodeAssignmentRule() ||
				   context == grammarAccess.getCodeBlockRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getScalaCodeBlockRule() ||
				   context == grammarAccess.getUnaryOrPrimaryRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getValueOperationRule() ||
				   context == grammarAccess.getValueOperationAccess().getBinaryOperationLeftAction_1_0()) {
					sequence_ScalaCodeBlock(context, (ScalaCodeBlock) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.SEQUENCE:
				if(context == grammarAccess.getBinaryOperation1Rule() ||
				   context == grammarAccess.getBinaryOperation1Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation2Rule() ||
				   context == grammarAccess.getBinaryOperation2Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation3Rule() ||
				   context == grammarAccess.getBinaryOperation3Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation4Rule() ||
				   context == grammarAccess.getBinaryOperation4Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation5Rule() ||
				   context == grammarAccess.getBinaryOperation5Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getUnaryOrPrimaryRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getValueOperationRule() ||
				   context == grammarAccess.getValueOperationAccess().getBinaryOperationLeftAction_1_0()) {
					sequence_Sequence(context, (Sequence) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.SIMPLE_PARAMETER_VALUE:
				if(context == grammarAccess.getSimpleParameterValueRule()) {
					sequence_SimpleParameterValue(context, (SimpleParameterValue) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.STRING_LITERAL:
				if(context == grammarAccess.getBinaryOperation1Rule() ||
				   context == grammarAccess.getBinaryOperation1Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation2Rule() ||
				   context == grammarAccess.getBinaryOperation2Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation3Rule() ||
				   context == grammarAccess.getBinaryOperation3Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation4Rule() ||
				   context == grammarAccess.getBinaryOperation4Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation5Rule() ||
				   context == grammarAccess.getBinaryOperation5Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getStringLiteralRule() ||
				   context == grammarAccess.getUnaryOrPrimaryRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getValueOperationRule() ||
				   context == grammarAccess.getValueOperationAccess().getBinaryOperationLeftAction_1_0()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.TOP_LEVEL_KRONUS:
				if(context == grammarAccess.getTopLevelKronusRule()) {
					sequence_TopLevelKronus(context, (TopLevelKronus) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.TYPE_DEF:
				if(context == grammarAccess.getAbstractDefRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_TypeDef(context, (TypeDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeParameterRule()) {
					sequence_TypeParameter(context, (TypeDef) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.TYPE_INSTANCE:
				if(context == grammarAccess.getTypeInstanceRule()) {
					sequence_TypeInstance(context, (TypeInstance) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.TYPE_NAME:
				if(context == grammarAccess.getTypeIdRule() ||
				   context == grammarAccess.getTypeNameRule()) {
					sequence_TypeName(context, (TypeName) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.TYPE_REF:
				if(context == grammarAccess.getTypeIdRule() ||
				   context == grammarAccess.getTypeRefRule()) {
					sequence_TypeRef(context, (TypeRef) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.TYPE_VALUE:
				if(context == grammarAccess.getTypeValueAtomicRule()) {
					sequence_TypeValueAtomic(context, (TypeValue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeValueRule()) {
					sequence_TypeValue_TypeValueAtomic(context, (TypeValue) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.UNARY_OPERATION:
				if(context == grammarAccess.getBinaryOperation1Rule() ||
				   context == grammarAccess.getBinaryOperation1Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation2Rule() ||
				   context == grammarAccess.getBinaryOperation2Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation3Rule() ||
				   context == grammarAccess.getBinaryOperation3Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation4Rule() ||
				   context == grammarAccess.getBinaryOperation4Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation5Rule() ||
				   context == grammarAccess.getBinaryOperation5Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getUnaryOrPrimaryRule() ||
				   context == grammarAccess.getValueOperationRule() ||
				   context == grammarAccess.getValueOperationAccess().getBinaryOperationLeftAction_1_0()) {
					sequence_UnaryOperation(context, (UnaryOperation) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.VAL_DEF:
				if(context == grammarAccess.getAbstractDefRule() ||
				   context == grammarAccess.getReferenceableDefsRule() ||
				   context == grammarAccess.getValDefRule()) {
					sequence_ValDef(context, (ValDef) semanticObject); 
					return; 
				}
				else break;
			case KronusPackage.VAL_REF:
				if(context == grammarAccess.getBinaryOperation1Rule() ||
				   context == grammarAccess.getBinaryOperation1Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation2Rule() ||
				   context == grammarAccess.getBinaryOperation2Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation3Rule() ||
				   context == grammarAccess.getBinaryOperation3Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation4Rule() ||
				   context == grammarAccess.getBinaryOperation4Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getBinaryOperation5Rule() ||
				   context == grammarAccess.getBinaryOperation5Access().getBinaryOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getUnaryOrPrimaryRule() ||
				   context == grammarAccess.getValRefRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getValueOperationRule() ||
				   context == grammarAccess.getValueOperationAccess().getBinaryOperationLeftAction_1_0()) {
					sequence_ValRef(context, (ValRef) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (method=[AnnotationDef|ID] (parameterValues+=ParameterValue parameterValues+=ParameterValue*)?)
	 */
	protected void sequence_AnnotationCall(EObject context, AnnotationCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=CAPITALIZED_ID (parameterDefs+=ParameterDef parameterDefs+=ParameterDef*)?)
	 */
	protected void sequence_AnnotationDef(EObject context, AnnotationDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=BinaryOperation2_BinaryOperation_1_0 op=BINARY_OPS_2 right=BinaryOperation1) | 
	 *         (left=BinaryOperation1_BinaryOperation_1_0 op=BINARY_OPS_1 right=UnaryOrPrimary) | 
	 *         (left=BinaryOperation3_BinaryOperation_1_0 op=BINARY_OPS_3 right=BinaryOperation2) | 
	 *         (left=BinaryOperation4_BinaryOperation_1_0 op=BINARY_OPS_4 right=BinaryOperation3) | 
	 *         (left=BinaryOperation5_BinaryOperation_1_0 op=BINARY_OPS_5 right=BinaryOperation4) | 
	 *         (left=ValueOperation_BinaryOperation_1_0 op=BINARY_OPS_6 right=BinaryOperation5)
	 *     )
	 */
	protected void sequence_BinaryOperation1_BinaryOperation2_BinaryOperation3_BinaryOperation4_BinaryOperation5_ValueOperation(EObject context, BinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.BOOLEAN_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.BOOLEAN_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=DOUBLE
	 */
	protected void sequence_DoubleLiteral(EObject context, DoubleLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.DOUBLE_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.DOUBLE_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoubleLiteralAccess().getValueDOUBLEParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (method=[FunctionDef|ID] (parameterValues+=ParameterValue parameterValues+=ParameterValue*)?)
	 */
	protected void sequence_FunctionCall(EObject context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         hashtags+=HashtagCall* 
	 *         name=CAPITALIZED_ID 
	 *         (typeParameters+=TypeParameter typeParameters+=TypeParameter*)? 
	 *         (parameterDefs+=ParameterDef parameterDefs+=ParameterDef*)? 
	 *         returnType=TypeInstance 
	 *         value=CodeAssignment?
	 *     )
	 */
	protected void sequence_FunctionDef(EObject context, FunctionDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (method=[HashtagDef|ID] (parameterValues+=SimpleParameterValue parameterValues+=SimpleParameterValue*)?)
	 */
	protected void sequence_HashtagCall(EObject context, HashtagCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=CAPITALIZED_ID (parameterDefs+=ParameterDef parameterDefs+=ParameterDef*)?)
	 */
	protected void sequence_HashtagDef(EObject context, HashtagDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     module=ModuleDef
	 */
	protected void sequence_ImportDef(EObject context, ImportDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.IMPORT_DEF__MODULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.IMPORT_DEF__MODULE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportDefAccess().getModuleModuleDefParserRuleCall_1_0(), semanticObject.getModule());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (module=ModuleDef name=CAPITALIZED_ID?)
	 */
	protected void sequence_IncludeDef(EObject context, IncludeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (include=[IncludeDef|ID] (ref=ValRef | ref=FunctionCall))
	 */
	protected void sequence_IncludeRef(EObject context, IncludeRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntegerLiteral(EObject context, IntegerLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.INTEGER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.INTEGER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=ValueOperation)
	 */
	protected void sequence_KeywordParameterValue(EObject context, KeywordParameterValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.PARAMETER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.PARAMETER_VALUE__VALUE));
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.KEYWORD_PARAMETER_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.KEYWORD_PARAMETER_VALUE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getKeywordParameterValueAccess().getNameIDParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getKeywordParameterValueAccess().getValueValueOperationParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=KRONUSKW? code=Kronus)
	 */
	protected void sequence_KronusCodeBlock(EObject context, KronusCodeBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=ImportDef* includes+=IncludeDef* defs+=AbstractDef* return=ValueOperation?)
	 */
	protected void sequence_Kronus(EObject context, Kronus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     module=ModuleParts
	 */
	protected void sequence_PackageDef(EObject context, PackageDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.PACKAGE_DEF__MODULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.PACKAGE_DEF__MODULE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPackageDefAccess().getModuleModulePartsParserRuleCall_1_0(), semanticObject.getModule());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID byName?='=>'? type=TypeInstance list?='*'? defaultValue=ValueOperation?)
	 */
	protected void sequence_ParameterDef(EObject context, ParameterDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ValueOperation
	 */
	protected void sequence_PositionParameterValue(EObject context, PositionParameterValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.PARAMETER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.PARAMETER_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPositionParameterValueAccess().getValueValueOperationParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=STRING codeStr=SCALA_CODE_BLOCK)
	 */
	protected void sequence_ScalaCodeBlock(EObject context, ScalaCodeBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.CODE_BLOCK__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.CODE_BLOCK__TYPE));
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.SCALA_CODE_BLOCK__CODE_STR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.SCALA_CODE_BLOCK__CODE_STR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScalaCodeBlockAccess().getTypeSTRINGTerminalRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getScalaCodeBlockAccess().getCodeStrSCALA_CODE_BLOCKParserRuleCall_4_0(), semanticObject.getCodeStr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((values+=ValueOperation values+=ValueOperation*)?)
	 */
	protected void sequence_Sequence(EObject context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=STRING)
	 */
	protected void sequence_SimpleParameterValue(EObject context, SimpleParameterValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.SIMPLE_PARAMETER_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.SIMPLE_PARAMETER_VALUE__NAME));
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.SIMPLE_PARAMETER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.SIMPLE_PARAMETER_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleParameterValueAccess().getNameIDParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSimpleParameterValueAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (package=PackageDef kronus=Kronus)
	 */
	protected void sequence_TopLevelKronus(EObject context, TopLevelKronus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.TOP_LEVEL_KRONUS__PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.TOP_LEVEL_KRONUS__PACKAGE));
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.TOP_LEVEL_KRONUS__KRONUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.TOP_LEVEL_KRONUS__KRONUS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTopLevelKronusAccess().getPackagePackageDefParserRuleCall_0_0(), semanticObject.getPackage());
		feeder.accept(grammarAccess.getTopLevelKronusAccess().getKronusKronusParserRuleCall_1_0(), semanticObject.getKronus());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=CAPITALIZED_ID (typeParameters+=TypeParameter typeParameters+=TypeParameter*)? value=TypeValue?)
	 */
	protected void sequence_TypeDef(EObject context, TypeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=[TypeDef|ID] (typeParameters+=TypeInstance typeParameters+=TypeInstance*)?)
	 */
	protected void sequence_TypeInstance(EObject context, TypeInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=TypeNameStr
	 */
	protected void sequence_TypeName(EObject context, TypeName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.TYPE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.TYPE_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeNameAccess().getNameTypeNameStrParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((variance='+' | variance='-')? name=CAPITALIZED_ID boundsHi=TypeInstance?)
	 */
	protected void sequence_TypeParameter(EObject context, TypeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     typeRef=[TypeDef|ID]
	 */
	protected void sequence_TypeRef(EObject context, TypeRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.TYPE_REF__TYPE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.TYPE_REF__TYPE_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeRefAccess().getTypeRefTypeDefIDParserRuleCall_1_0_1(), semanticObject.getTypeRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeId (parms+=TypeValue parms+=TypeValue*)?)
	 */
	protected void sequence_TypeValueAtomic(EObject context, TypeValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeId (parms+=TypeValue parms+=TypeValue*)? extensions+=TypeValueAtomic*)
	 */
	protected void sequence_TypeValue_TypeValueAtomic(EObject context, TypeValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op=UNARY_OPS expr=UnaryOrPrimary)
	 */
	protected void sequence_UnaryOperation(EObject context, UnaryOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.UNARY_OPERATION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.UNARY_OPERATION__OP));
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.UNARY_OPERATION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.UNARY_OPERATION__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnaryOperationAccess().getOpUNARY_OPSParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getUnaryOperationAccess().getExprUnaryOrPrimaryParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (hashtags+=HashtagCall* annotations+=AnnotationCall* name=CAPITALIZED_ID value=ValueOperation)
	 */
	protected void sequence_ValDef(EObject context, ValDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[ReferenceableDefs|ID]
	 */
	protected void sequence_ValRef(EObject context, ValRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KronusPackage.Literals.VAL_REF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KronusPackage.Literals.VAL_REF__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValRefAccess().getRefReferenceableDefsIDParserRuleCall_0_1(), semanticObject.getRef());
		feeder.finish();
	}
}
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
