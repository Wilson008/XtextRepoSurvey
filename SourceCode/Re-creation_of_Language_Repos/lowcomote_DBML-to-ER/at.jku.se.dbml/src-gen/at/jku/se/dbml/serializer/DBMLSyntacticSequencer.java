/*
 * generated by Xtext 2.35.0
 */
package at.jku.se.dbml.serializer;

import at.jku.se.dbml.services.DBMLGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DBMLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DBMLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Ref_ColonKeyword_1_q;
	protected AbstractElementAlias match_Ref___QuotationMarkKeyword_2_0_IDTerminalRuleCall_2_1_QuotationMarkColonKeyword_2_2__q;
	protected AbstractElementAlias match_Table___IndexesKeyword_6_0_LeftCurlyBracketKeyword_6_1_IndexParserRuleCall_6_2_p_RightCurlyBracketKeyword_6_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DBMLGrammarAccess) access;
		match_Ref_ColonKeyword_1_q = new TokenAlias(false, true, grammarAccess.getRefAccess().getColonKeyword_1());
		match_Ref___QuotationMarkKeyword_2_0_IDTerminalRuleCall_2_1_QuotationMarkColonKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRefAccess().getQuotationMarkKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getRefAccess().getIDTerminalRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getRefAccess().getQuotationMarkColonKeyword_2_2()));
		match_Table___IndexesKeyword_6_0_LeftCurlyBracketKeyword_6_1_IndexParserRuleCall_6_2_p_RightCurlyBracketKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTableAccess().getIndexesKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(true, false, grammarAccess.getTableAccess().getIndexParserRuleCall_6_2()), new TokenAlias(false, false, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIndexRule())
			return getIndexToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * Index: (ID | '(' ID (',' ID)+ ')') '[' ('unique,')? ('pk' | 'name:' '"' ID '"') ']';
	 */
	protected String getIndexToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[ pk ]";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Ref_ColonKeyword_1_q.equals(syntax))
				emit_Ref_ColonKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Ref___QuotationMarkKeyword_2_0_IDTerminalRuleCall_2_1_QuotationMarkColonKeyword_2_2__q.equals(syntax))
				emit_Ref___QuotationMarkKeyword_2_0_IDTerminalRuleCall_2_1_QuotationMarkColonKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Table___IndexesKeyword_6_0_LeftCurlyBracketKeyword_6_1_IndexParserRuleCall_6_2_p_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_Table___IndexesKeyword_6_0_LeftCurlyBracketKeyword_6_1_IndexParserRuleCall_6_2_p_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Ref' (ambiguity) ('"' ID '":')? left=NestedRef
	 
	 * </pre>
	 */
	protected void emit_Ref_ColonKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('"' ID '":')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Ref' ':'? (ambiguity) left=NestedRef
	 
	 * </pre>
	 */
	protected void emit_Ref___QuotationMarkKeyword_2_0_IDTerminalRuleCall_2_1_QuotationMarkColonKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('Indexes' '{' Index+ '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     attributes+=Attribute (ambiguity) '}' (rule end)
	 *     name=ID '"' '{' (ambiguity) '}' (rule end)
	 
	 * </pre>
	 */
	protected void emit_Table___IndexesKeyword_6_0_LeftCurlyBracketKeyword_6_1_IndexParserRuleCall_6_2_p_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
