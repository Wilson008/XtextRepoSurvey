/*
 * generated by Xtext 2.35.0
 */
package com.coffee.serializer;

import com.coffee.services.HlvlGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class HlvlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected HlvlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ListOfIDs_CommaKeyword_2_0_p;
	protected AbstractElementAlias match_ListOfModelRef_CommaKeyword_2_0_p;
	protected AbstractElementAlias match_ListOfRelRefs_CommaKeyword_2_0_p;
	protected AbstractElementAlias match_ListOfValuation_CommaKeyword_1_0_p;
	protected AbstractElementAlias match_ListOfValues_CommaKeyword_1_0_p;
	protected AbstractElementAlias match_MixedListOfIDs_CommaKeyword_2_0_p;
	protected AbstractElementAlias match_MixedList_CommaKeyword_2_0_p;
	protected AbstractElementAlias match_Operations_CommaKeyword_1_0_p;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (HlvlGrammarAccess) access;
		match_ListOfIDs_CommaKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getListOfIDsAccess().getCommaKeyword_2_0());
		match_ListOfModelRef_CommaKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getListOfModelRefAccess().getCommaKeyword_2_0());
		match_ListOfRelRefs_CommaKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getListOfRelRefsAccess().getCommaKeyword_2_0());
		match_ListOfValuation_CommaKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getListOfValuationAccess().getCommaKeyword_1_0());
		match_ListOfValues_CommaKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0());
		match_MixedListOfIDs_CommaKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getMixedListOfIDsAccess().getCommaKeyword_2_0());
		match_MixedList_CommaKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getMixedListAccess().getCommaKeyword_2_0());
		match_Operations_CommaKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getOperationsAccess().getCommaKeyword_1_0());
		match_Primary_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_Primary_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ListOfIDs_CommaKeyword_2_0_p.equals(syntax))
				emit_ListOfIDs_CommaKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ListOfModelRef_CommaKeyword_2_0_p.equals(syntax))
				emit_ListOfModelRef_CommaKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ListOfRelRefs_CommaKeyword_2_0_p.equals(syntax))
				emit_ListOfRelRefs_CommaKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ListOfValuation_CommaKeyword_1_0_p.equals(syntax))
				emit_ListOfValuation_CommaKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ListOfValues_CommaKeyword_1_0_p.equals(syntax))
				emit_ListOfValues_CommaKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MixedListOfIDs_CommaKeyword_2_0_p.equals(syntax))
				emit_MixedListOfIDs_CommaKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MixedList_CommaKeyword_2_0_p.equals(syntax))
				emit_MixedList_CommaKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Operations_CommaKeyword_1_0_p.equals(syntax))
				emit_Operations_CommaKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     values+=[ElmDeclaration|ID] (ambiguity) values+=[ElmDeclaration|ID]
	 
	 * </pre>
	 */
	protected void emit_ListOfIDs_CommaKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     ids+=ModelRef (ambiguity) ids+=ModelRef
	 
	 * </pre>
	 */
	protected void emit_ListOfModelRef_CommaKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     ids+=[RelDeclaration|ID] (ambiguity) ids+=[RelDeclaration|ID]
	 
	 * </pre>
	 */
	protected void emit_ListOfRelRefs_CommaKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     pairs+=Valuation (ambiguity) pairs+=Valuation
	 
	 * </pre>
	 */
	protected void emit_ListOfValuation_CommaKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     values+=Relational (ambiguity) values+=Relational
	 
	 * </pre>
	 */
	protected void emit_ListOfValues_CommaKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     values+=[ElmDeclaration|GeneralQualifiedName] (ambiguity) values+=[ElmDeclaration|GeneralQualifiedName]
	 
	 * </pre>
	 */
	protected void emit_MixedListOfIDs_CommaKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     ids+=[NamedItem|ID] (ambiguity) ids+=[NamedItem|ID]
	 
	 * </pre>
	 */
	protected void emit_MixedList_CommaKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     op+=Operation (ambiguity) op+=Operation
	 
	 * </pre>
	 */
	protected void emit_Operations_CommaKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'entailed' '(' element=[ElmDeclaration|ID]
	 *     (rule start) (ambiguity) 'instances' '(' element=[ElmDeclaration|ID]
	 *     (rule start) (ambiguity) 'selected' '(' element=[ElmDeclaration|ID]
	 *     (rule start) (ambiguity) '~' expression=Primary
	 *     (rule start) (ambiguity) attribute=QualifiedName
	 *     (rule start) (ambiguity) op='abs'
	 *     (rule start) (ambiguity) op='dist'
	 *     (rule start) (ambiguity) op='if'
	 *     (rule start) (ambiguity) op='max'
	 *     (rule start) (ambiguity) op='min'
	 *     (rule start) (ambiguity) op='pow'
	 *     (rule start) (ambiguity) op='sqrt'
	 *     (rule start) (ambiguity) value='false'
	 *     (rule start) (ambiguity) value='true'
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) variable=[ElmDeclaration|ID]
	 *     (rule start) (ambiguity) {And.left=}
	 *     (rule start) (ambiguity) {Comparison.left=}
	 *     (rule start) (ambiguity) {Equality.left=}
	 *     (rule start) (ambiguity) {Iff.left=}
	 *     (rule start) (ambiguity) {Implies.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {MulOrDiv.left=}
	 *     (rule start) (ambiguity) {Or.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 
	 * </pre>
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {And.left=}
	 *     (rule start) (ambiguity) {Comparison.left=}
	 *     (rule start) (ambiguity) {Equality.left=}
	 *     (rule start) (ambiguity) {Iff.left=}
	 *     (rule start) (ambiguity) {Implies.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {MulOrDiv.left=}
	 *     (rule start) (ambiguity) {Or.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 
	 * </pre>
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
