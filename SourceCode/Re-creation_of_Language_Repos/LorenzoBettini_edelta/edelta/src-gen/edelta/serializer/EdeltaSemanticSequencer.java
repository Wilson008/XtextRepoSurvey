/*
 * generated by Xtext 2.35.0
 */
package edelta.serializer;

import com.google.inject.Inject;
import edelta.edelta.EdeltaEcoreDirectReference;
import edelta.edelta.EdeltaEcoreQualifiedReference;
import edelta.edelta.EdeltaEcoreReferenceExpression;
import edelta.edelta.EdeltaModifyEcoreOperation;
import edelta.edelta.EdeltaOperation;
import edelta.edelta.EdeltaPackage;
import edelta.edelta.EdeltaProgram;
import edelta.edelta.EdeltaUseAs;
import edelta.services.EdeltaGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmInnerTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.annotations.serializer.XbaseWithAnnotationsSemanticSequencer;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationElementValuePair;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.eclipse.xtext.xtype.XtypePackage;

@SuppressWarnings("all")
public class EdeltaSemanticSequencer extends XbaseWithAnnotationsSemanticSequencer {

	@Inject
	private EdeltaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EdeltaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EdeltaPackage.EDELTA_ECORE_DIRECT_REFERENCE:
				sequence_EdeltaEcoreDirectReference(context, (EdeltaEcoreDirectReference) semanticObject); 
				return; 
			case EdeltaPackage.EDELTA_ECORE_QUALIFIED_REFERENCE:
				sequence_EdeltaEcoreReference(context, (EdeltaEcoreQualifiedReference) semanticObject); 
				return; 
			case EdeltaPackage.EDELTA_ECORE_REFERENCE_EXPRESSION:
				sequence_XPrimaryExpression(context, (EdeltaEcoreReferenceExpression) semanticObject); 
				return; 
			case EdeltaPackage.EDELTA_MODIFY_ECORE_OPERATION:
				sequence_EdeltaModifyEcoreOperation(context, (EdeltaModifyEcoreOperation) semanticObject); 
				return; 
			case EdeltaPackage.EDELTA_OPERATION:
				sequence_EdeltaOperation(context, (EdeltaOperation) semanticObject); 
				return; 
			case EdeltaPackage.EDELTA_PROGRAM:
				sequence_EdeltaProgram(context, (EdeltaProgram) semanticObject); 
				return; 
			case EdeltaPackage.EDELTA_USE_AS:
				sequence_EdeltaUseAs(context, (EdeltaUseAs) semanticObject); 
				return; 
			}
		else if (epackage == TypesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_FORMAL_PARAMETER:
				if (rule == grammarAccess.getFullJvmFormalParameterRule()) {
					sequence_FullJvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmFormalParameterRule()) {
					sequence_JvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_INNER_TYPE_REFERENCE:
				sequence_JvmParameterizedTypeReference(context, (JvmInnerTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_LOWER_BOUND:
				if (rule == grammarAccess.getJvmLowerBoundAndedRule()) {
					sequence_JvmLowerBoundAnded(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if (action == grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0()) {
					sequence_JvmParameterizedTypeReference_JvmInnerTypeReference_1_4_0_0_0(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmTypeReferenceRule()
						|| action == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()
						|| rule == grammarAccess.getJvmParameterizedTypeReferenceRule()
						|| rule == grammarAccess.getJvmArgumentTypeReferenceRule()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
				return; 
			case TypesPackage.JVM_UPPER_BOUND:
				if (rule == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
				return; 
			}
		else if (epackage == XAnnotationsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XAnnotationsPackage.XANNOTATION:
				sequence_XAnnotation(context, (XAnnotation) semanticObject); 
				return; 
			case XAnnotationsPackage.XANNOTATION_ELEMENT_VALUE_PAIR:
				sequence_XAnnotationElementValuePair(context, (XAnnotationElementValuePair) semanticObject); 
				return; 
			}
		else if (epackage == XbasePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XbasePackage.XASSIGNMENT:
				sequence_XAssignment_XMemberFeatureCall(context, (XAssignment) semanticObject); 
				return; 
			case XbasePackage.XBASIC_FOR_LOOP_EXPRESSION:
				sequence_XBasicForLoopExpression(context, (XBasicForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XBINARY_OPERATION:
				sequence_XAdditiveExpression_XAndExpression_XAssignment_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XOtherOperatorExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
				return; 
			case XbasePackage.XBLOCK_EXPRESSION:
				if (rule == grammarAccess.getXPrimaryExpressionRule()
						|| rule == grammarAccess.getXAnnotationElementValueOrCommaListRule()
						|| action == grammarAccess.getXAnnotationElementValueOrCommaListAccess().getXListLiteralElementsAction_1_1_0()
						|| rule == grammarAccess.getXAnnotationElementValueRule()
						|| rule == grammarAccess.getXAnnotationOrExpressionRule()
						|| rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXbaseXPrimaryExpressionRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXBlockExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXExpressionInClosureRule()) {
					sequence_XExpressionInClosure(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBOOLEAN_LITERAL:
				sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
				return; 
			case XbasePackage.XCASE_PART:
				sequence_XCasePart(context, (XCasePart) semanticObject); 
				return; 
			case XbasePackage.XCASTED_EXPRESSION:
				sequence_XCastedExpression(context, (XCastedExpression) semanticObject); 
				return; 
			case XbasePackage.XCATCH_CLAUSE:
				sequence_XCatchClause(context, (XCatchClause) semanticObject); 
				return; 
			case XbasePackage.XCLOSURE:
				if (rule == grammarAccess.getXPrimaryExpressionRule()
						|| rule == grammarAccess.getXAnnotationElementValueOrCommaListRule()
						|| action == grammarAccess.getXAnnotationElementValueOrCommaListAccess().getXListLiteralElementsAction_1_1_0()
						|| rule == grammarAccess.getXAnnotationElementValueRule()
						|| rule == grammarAccess.getXAnnotationOrExpressionRule()
						|| rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXbaseXPrimaryExpressionRule()
						|| rule == grammarAccess.getXLiteralRule()
						|| rule == grammarAccess.getXClosureRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXShortClosureRule()) {
					sequence_XShortClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCONSTRUCTOR_CALL:
				sequence_XConstructorCall(context, (XConstructorCall) semanticObject); 
				return; 
			case XbasePackage.XDO_WHILE_EXPRESSION:
				sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
				return; 
			case XbasePackage.XFEATURE_CALL:
				sequence_XFeatureCall(context, (XFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XFOR_LOOP_EXPRESSION:
				sequence_XForLoopExpression(context, (XForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XIF_EXPRESSION:
				sequence_XIfExpression(context, (XIfExpression) semanticObject); 
				return; 
			case XbasePackage.XINSTANCE_OF_EXPRESSION:
				sequence_XRelationalExpression(context, (XInstanceOfExpression) semanticObject); 
				return; 
			case XbasePackage.XLIST_LITERAL:
				if (rule == grammarAccess.getXAnnotationElementValueOrCommaListRule()) {
					sequence_XAnnotationElementValueOrCommaList_XListLiteral(context, (XListLiteral) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXAnnotationElementValueRule()) {
					sequence_XAnnotationElementValue_XListLiteral(context, (XListLiteral) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXPrimaryExpressionRule()
						|| action == grammarAccess.getXAnnotationElementValueOrCommaListAccess().getXListLiteralElementsAction_1_1_0()
						|| rule == grammarAccess.getXAnnotationOrExpressionRule()
						|| rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXbaseXPrimaryExpressionRule()
						|| rule == grammarAccess.getXLiteralRule()
						|| rule == grammarAccess.getXCollectionLiteralRule()
						|| rule == grammarAccess.getXListLiteralRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XListLiteral(context, (XListLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XMEMBER_FEATURE_CALL:
				sequence_XMemberFeatureCall(context, (XMemberFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XNULL_LITERAL:
				sequence_XNullLiteral(context, (XNullLiteral) semanticObject); 
				return; 
			case XbasePackage.XNUMBER_LITERAL:
				sequence_XNumberLiteral(context, (XNumberLiteral) semanticObject); 
				return; 
			case XbasePackage.XPOSTFIX_OPERATION:
				sequence_XPostfixOperation(context, (XPostfixOperation) semanticObject); 
				return; 
			case XbasePackage.XRETURN_EXPRESSION:
				sequence_XReturnExpression(context, (XReturnExpression) semanticObject); 
				return; 
			case XbasePackage.XSET_LITERAL:
				sequence_XSetLiteral(context, (XSetLiteral) semanticObject); 
				return; 
			case XbasePackage.XSTRING_LITERAL:
				sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
				return; 
			case XbasePackage.XSWITCH_EXPRESSION:
				sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
				return; 
			case XbasePackage.XSYNCHRONIZED_EXPRESSION:
				sequence_XSynchronizedExpression(context, (XSynchronizedExpression) semanticObject); 
				return; 
			case XbasePackage.XTHROW_EXPRESSION:
				sequence_XThrowExpression(context, (XThrowExpression) semanticObject); 
				return; 
			case XbasePackage.XTRY_CATCH_FINALLY_EXPRESSION:
				sequence_XTryCatchFinallyExpression(context, (XTryCatchFinallyExpression) semanticObject); 
				return; 
			case XbasePackage.XTYPE_LITERAL:
				sequence_XTypeLiteral(context, (XTypeLiteral) semanticObject); 
				return; 
			case XbasePackage.XUNARY_OPERATION:
				sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
				return; 
			case XbasePackage.XVARIABLE_DECLARATION:
				sequence_XVariableDeclaration(context, (XVariableDeclaration) semanticObject); 
				return; 
			case XbasePackage.XWHILE_EXPRESSION:
				sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
				return; 
			}
		else if (epackage == XtypePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_DECLARATION:
				sequence_XImportDeclaration(context, (XImportDeclaration) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_SECTION:
				sequence_XImportSection(context, (XImportSection) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     EdeltaEcoreReference returns EdeltaEcoreDirectReference
	 *     EdeltaEcoreReference.EdeltaEcoreQualifiedReference_1_0 returns EdeltaEcoreDirectReference
	 *     EdeltaEcoreDirectReference returns EdeltaEcoreDirectReference
	 *
	 * Constraint:
	 *     enamedelement=[ENamedElement|ID]
	 * </pre>
	 */
	protected void sequence_EdeltaEcoreDirectReference(ISerializationContext context, EdeltaEcoreDirectReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdeltaPackage.Literals.EDELTA_ECORE_REFERENCE__ENAMEDELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdeltaPackage.Literals.EDELTA_ECORE_REFERENCE__ENAMEDELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEdeltaEcoreDirectReferenceAccess().getEnamedelementENamedElementIDTerminalRuleCall_1_0_1(), semanticObject.eGet(EdeltaPackage.Literals.EDELTA_ECORE_REFERENCE__ENAMEDELEMENT, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EdeltaEcoreReference returns EdeltaEcoreQualifiedReference
	 *     EdeltaEcoreReference.EdeltaEcoreQualifiedReference_1_0 returns EdeltaEcoreQualifiedReference
	 *
	 * Constraint:
	 *     (qualification=EdeltaEcoreReference_EdeltaEcoreQualifiedReference_1_0 enamedelement=[ENamedElement|ID])
	 * </pre>
	 */
	protected void sequence_EdeltaEcoreReference(ISerializationContext context, EdeltaEcoreQualifiedReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdeltaPackage.Literals.EDELTA_ECORE_QUALIFIED_REFERENCE__QUALIFICATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdeltaPackage.Literals.EDELTA_ECORE_QUALIFIED_REFERENCE__QUALIFICATION));
			if (transientValues.isValueTransient(semanticObject, EdeltaPackage.Literals.EDELTA_ECORE_REFERENCE__ENAMEDELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdeltaPackage.Literals.EDELTA_ECORE_REFERENCE__ENAMEDELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEdeltaEcoreReferenceAccess().getEdeltaEcoreQualifiedReferenceQualificationAction_1_0(), semanticObject.getQualification());
		feeder.accept(grammarAccess.getEdeltaEcoreReferenceAccess().getEnamedelementENamedElementIDTerminalRuleCall_1_2_0_1(), semanticObject.eGet(EdeltaPackage.Literals.EDELTA_ECORE_REFERENCE__ENAMEDELEMENT, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EdeltaModifyEcoreOperation returns EdeltaModifyEcoreOperation
	 *
	 * Constraint:
	 *     (name=ValidID epackage=[EPackage|ID] body=XBlockExpression)
	 * </pre>
	 */
	protected void sequence_EdeltaModifyEcoreOperation(ISerializationContext context, EdeltaModifyEcoreOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdeltaPackage.Literals.EDELTA_MODIFY_ECORE_OPERATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdeltaPackage.Literals.EDELTA_MODIFY_ECORE_OPERATION__NAME));
			if (transientValues.isValueTransient(semanticObject, EdeltaPackage.Literals.EDELTA_MODIFY_ECORE_OPERATION__EPACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdeltaPackage.Literals.EDELTA_MODIFY_ECORE_OPERATION__EPACKAGE));
			if (transientValues.isValueTransient(semanticObject, EdeltaPackage.Literals.EDELTA_MODIFY_ECORE_OPERATION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdeltaPackage.Literals.EDELTA_MODIFY_ECORE_OPERATION__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEdeltaModifyEcoreOperationAccess().getNameValidIDParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEdeltaModifyEcoreOperationAccess().getEpackageEPackageIDTerminalRuleCall_4_0_1(), semanticObject.eGet(EdeltaPackage.Literals.EDELTA_MODIFY_ECORE_OPERATION__EPACKAGE, false));
		feeder.accept(grammarAccess.getEdeltaModifyEcoreOperationAccess().getBodyXBlockExpressionParserRuleCall_5_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EdeltaOperation returns EdeltaOperation
	 *
	 * Constraint:
	 *     (
	 *         (typeParameters+=JvmTypeParameter typeParameters+=JvmTypeParameter*)? 
	 *         name=ValidID 
	 *         (params+=FullJvmFormalParameter params+=FullJvmFormalParameter*)? 
	 *         type=JvmTypeReference? 
	 *         body=XBlockExpression
	 *     )
	 * </pre>
	 */
	protected void sequence_EdeltaOperation(ISerializationContext context, EdeltaOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EdeltaProgram returns EdeltaProgram
	 *
	 * Constraint:
	 *     (
	 *         importSection=XImportSection? 
	 *         name=QualifiedName? 
	 *         metamodels+=[EPackage|STRING]* 
	 *         useAsClauses+=EdeltaUseAs* 
	 *         operations+=EdeltaOperation* 
	 *         modifyEcoreOperations+=EdeltaModifyEcoreOperation*
	 *     )
	 * </pre>
	 */
	protected void sequence_EdeltaProgram(ISerializationContext context, EdeltaProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EdeltaUseAs returns EdeltaUseAs
	 *
	 * Constraint:
	 *     (type=JvmTypeReference extension?='extension'? name=ValidID)
	 * </pre>
	 */
	protected void sequence_EdeltaUseAs(ISerializationContext context, EdeltaUseAs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     XPrimaryExpression returns EdeltaEcoreReferenceExpression
	 *     XAnnotationElementValueOrCommaList returns EdeltaEcoreReferenceExpression
	 *     XAnnotationElementValueOrCommaList.XListLiteral_1_1_0 returns EdeltaEcoreReferenceExpression
	 *     XAnnotationElementValue returns EdeltaEcoreReferenceExpression
	 *     XAnnotationOrExpression returns EdeltaEcoreReferenceExpression
	 *     XExpression returns EdeltaEcoreReferenceExpression
	 *     XAssignment returns EdeltaEcoreReferenceExpression
	 *     XAssignment.XBinaryOperation_1_1_0_0_0 returns EdeltaEcoreReferenceExpression
	 *     XOrExpression returns EdeltaEcoreReferenceExpression
	 *     XOrExpression.XBinaryOperation_1_0_0_0 returns EdeltaEcoreReferenceExpression
	 *     XAndExpression returns EdeltaEcoreReferenceExpression
	 *     XAndExpression.XBinaryOperation_1_0_0_0 returns EdeltaEcoreReferenceExpression
	 *     XEqualityExpression returns EdeltaEcoreReferenceExpression
	 *     XEqualityExpression.XBinaryOperation_1_0_0_0 returns EdeltaEcoreReferenceExpression
	 *     XRelationalExpression returns EdeltaEcoreReferenceExpression
	 *     XRelationalExpression.XInstanceOfExpression_1_0_0_0_0 returns EdeltaEcoreReferenceExpression
	 *     XRelationalExpression.XBinaryOperation_1_1_0_0_0 returns EdeltaEcoreReferenceExpression
	 *     XOtherOperatorExpression returns EdeltaEcoreReferenceExpression
	 *     XOtherOperatorExpression.XBinaryOperation_1_0_0_0 returns EdeltaEcoreReferenceExpression
	 *     XAdditiveExpression returns EdeltaEcoreReferenceExpression
	 *     XAdditiveExpression.XBinaryOperation_1_0_0_0 returns EdeltaEcoreReferenceExpression
	 *     XMultiplicativeExpression returns EdeltaEcoreReferenceExpression
	 *     XMultiplicativeExpression.XBinaryOperation_1_0_0_0 returns EdeltaEcoreReferenceExpression
	 *     XUnaryOperation returns EdeltaEcoreReferenceExpression
	 *     XCastedExpression returns EdeltaEcoreReferenceExpression
	 *     XCastedExpression.XCastedExpression_1_0_0_0 returns EdeltaEcoreReferenceExpression
	 *     XPostfixOperation returns EdeltaEcoreReferenceExpression
	 *     XPostfixOperation.XPostfixOperation_1_0_0 returns EdeltaEcoreReferenceExpression
	 *     XMemberFeatureCall returns EdeltaEcoreReferenceExpression
	 *     XMemberFeatureCall.XAssignment_1_0_0_0_0 returns EdeltaEcoreReferenceExpression
	 *     XMemberFeatureCall.XMemberFeatureCall_1_1_0_0_0 returns EdeltaEcoreReferenceExpression
	 *     XPrimaryExpression returns EdeltaEcoreReferenceExpression
	 *     XParenthesizedExpression returns EdeltaEcoreReferenceExpression
	 *     XExpressionOrVarDeclaration returns EdeltaEcoreReferenceExpression
	 *
	 * Constraint:
	 *     reference=EdeltaEcoreReference
	 * </pre>
	 */
	protected void sequence_XPrimaryExpression(ISerializationContext context, EdeltaEcoreReferenceExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EdeltaPackage.Literals.EDELTA_ECORE_REFERENCE_EXPRESSION__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EdeltaPackage.Literals.EDELTA_ECORE_REFERENCE_EXPRESSION__REFERENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getXPrimaryExpressionAccess().getReferenceEdeltaEcoreReferenceParserRuleCall_0_3_0(), semanticObject.getReference());
		feeder.finish();
	}
	
	
}
