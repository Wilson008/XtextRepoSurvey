/*
 * generated by Xtext 2.35.0
 */
grammar InternalStm;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package net.sb.statemachine.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package net.sb.statemachine.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.sb.statemachine.dsl.services.StmGrammarAccess;

}

@parser::members {

 	private StmGrammarAccess grammarAccess;

    public InternalStmParser(TokenStream input, StmGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Statemachine";
   	}

   	@Override
   	protected StmGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleStatemachine
entryRuleStatemachine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatemachineRule()); }
	iv_ruleStatemachine=ruleStatemachine
	{ $current=$iv_ruleStatemachine.current; }
	EOF;

// Rule Statemachine
ruleStatemachine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
					$current);
			}
		)
		otherlv_1='events'
		{
			newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getEventsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_2_0());
				}
				lv_events_2_0=ruleEvent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatemachineRule());
					}
					add(
						$current,
						"events",
						lv_events_2_0,
						"net.sb.statemachine.dsl.Stm.Event");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='end'
		{
			newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getEndKeyword_3());
		}
		otherlv_4='commands'
		{
			newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getCommandsKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_5_0());
				}
				lv_commands_5_0=ruleCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatemachineRule());
					}
					add(
						$current,
						"commands",
						lv_commands_5_0,
						"net.sb.statemachine.dsl.Stm.Command");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='end'
		{
			newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getEndKeyword_6());
		}
		otherlv_7='guard'
		{
			newLeafNode(otherlv_7, grammarAccess.getStatemachineAccess().getGuardKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStatemachineAccess().getGuardsGuardParserRuleCall_8_0());
				}
				lv_guards_8_0=ruleGuard
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatemachineRule());
					}
					add(
						$current,
						"guards",
						lv_guards_8_0,
						"net.sb.statemachine.dsl.Stm.Guard");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9='end'
		{
			newLeafNode(otherlv_9, grammarAccess.getStatemachineAccess().getEndKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_10_0());
				}
				lv_states_10_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatemachineRule());
					}
					add(
						$current,
						"states",
						lv_states_10_0,
						"net.sb.statemachine.dsl.Stm.State");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	iv_ruleEvent=ruleEvent
	{ $current=$iv_ruleEvent.current; }
	EOF;

// Rule Event
ruleEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getEventRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getCommandRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='state'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='entryActions'
			{
				newLeafNode(otherlv_2, grammarAccess.getStateAccess().getEntryActionsKeyword_2_0());
			}
			otherlv_3='{'
			{
				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getStateAccess().getEntryActionsCommandCrossReference_2_2_0());
					}
				)
			)+
			otherlv_5='}'
			{
				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3());
			}
		)?
		(
			otherlv_6='do'
			{
				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getDoKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getStateAccess().getDoActionCommandCrossReference_3_1_0());
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateRule());
						}
					}
					otherlv_8=RULE_ID
					{
						newLeafNode(otherlv_8, grammarAccess.getStateAccess().getStopActionCommandCrossReference_3_2_0());
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getStatesStateParserRuleCall_4_0());
				}
				lv_states_9_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"states",
						lv_states_9_0,
						"net.sb.statemachine.dsl.Stm.State");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getSelfEventsSelfEventParserRuleCall_5_0());
				}
				lv_selfEvents_10_0=ruleSelfEvent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"selfEvents",
						lv_selfEvents_10_0,
						"net.sb.statemachine.dsl.Stm.SelfEvent");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_6_0());
				}
				lv_transitions_11_0=ruleTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"transitions",
						lv_transitions_11_0,
						"net.sb.statemachine.dsl.Stm.Transition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_12='exitActions'
			{
				newLeafNode(otherlv_12, grammarAccess.getStateAccess().getExitActionsKeyword_7_0());
			}
			otherlv_13='{'
			{
				newLeafNode(otherlv_13, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateRule());
						}
					}
					otherlv_14=RULE_ID
					{
						newLeafNode(otherlv_14, grammarAccess.getStateAccess().getExitActionsCommandCrossReference_7_2_0());
					}
				)
			)+
			otherlv_15='}'
			{
				newLeafNode(otherlv_15, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7_3());
			}
		)?
		otherlv_16='end'
		{
			newLeafNode(otherlv_16, grammarAccess.getStateAccess().getEndKeyword_8());
		}
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0());
				}
			)
		)
		(
			otherlv_1='['
			{
				newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getGuardGuardCallParserRuleCall_1_1_0());
					}
					lv_guard_2_0=ruleGuardCall
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRule());
						}
						set(
							$current,
							"guard",
							lv_guard_2_0,
							"net.sb.statemachine.dsl.Stm.GuardCall");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=']'
			{
				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_1_2());
			}
		)?
		otherlv_4='=>'
		{
			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0());
				}
			)
		)
		(
			otherlv_6='/'
			{
				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getSolidusKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransitionRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getActionCommandCrossReference_4_1_0());
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleSelfEvent
entryRuleSelfEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelfEventRule()); }
	iv_ruleSelfEvent=ruleSelfEvent
	{ $current=$iv_ruleSelfEvent.current; }
	EOF;

// Rule SelfEvent
ruleSelfEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelfEventRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getSelfEventAccess().getEventEventCrossReference_0_0());
				}
			)
		)
		(
			otherlv_1='['
			{
				newLeafNode(otherlv_1, grammarAccess.getSelfEventAccess().getLeftSquareBracketKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSelfEventAccess().getGuardGuardCallParserRuleCall_1_1_0());
					}
					lv_guard_2_0=ruleGuardCall
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSelfEventRule());
						}
						set(
							$current,
							"guard",
							lv_guard_2_0,
							"net.sb.statemachine.dsl.Stm.GuardCall");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=']'
			{
				newLeafNode(otherlv_3, grammarAccess.getSelfEventAccess().getRightSquareBracketKeyword_1_2());
			}
		)?
		otherlv_4='/'
		{
			newLeafNode(otherlv_4, grammarAccess.getSelfEventAccess().getSolidusKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelfEventRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getSelfEventAccess().getActionCommandCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleGuardCall
entryRuleGuardCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGuardCallRule()); }
	iv_ruleGuardCall=ruleGuardCall
	{ $current=$iv_ruleGuardCall.current; }
	EOF;

// Rule GuardCall
ruleGuardCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGuardCallRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getGuardCallAccess().getGuardGuardCrossReference_0_0());
				}
			)
		)
		(
			(
				lv_parameters_1_0=RULE_ID
				{
					newLeafNode(lv_parameters_1_0, grammarAccess.getGuardCallAccess().getParametersIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGuardCallRule());
					}
					addWithLastConsumed(
						$current,
						"parameters",
						lv_parameters_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
	)
;

// Entry rule entryRuleGuard
entryRuleGuard returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGuardRule()); }
	iv_ruleGuard=ruleGuard
	{ $current=$iv_ruleGuard.current; }
	EOF;

// Rule Guard
ruleGuard returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getGuardAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGuardRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_1='['
			{
				newLeafNode(otherlv_1, grammarAccess.getGuardAccess().getLeftSquareBracketKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGuardAccess().getParametersParameterParserRuleCall_1_1_0());
					}
					lv_parameters_2_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGuardRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_2_0,
							"net.sb.statemachine.dsl.Stm.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=']'
			{
				newLeafNode(otherlv_3, grammarAccess.getGuardAccess().getRightSquareBracketKeyword_1_2());
			}
		)?
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
		}
		(
			(
				lv_type_2_0=RULE_ID
				{
					newLeafNode(lv_type_2_0, grammarAccess.getParameterAccess().getTypeIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
