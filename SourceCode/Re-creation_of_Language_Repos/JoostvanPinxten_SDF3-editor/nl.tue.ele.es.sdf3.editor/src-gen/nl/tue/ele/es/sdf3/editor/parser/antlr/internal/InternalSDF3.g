/*
 * generated by Xtext 2.35.0
 */
grammar InternalSDF3;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package nl.tue.ele.es.sdf3.editor.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package nl.tue.ele.es.sdf3.editor.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.tue.ele.es.sdf3.editor.services.SDF3GrammarAccess;

}

@parser::members {

 	private SDF3GrammarAccess grammarAccess;

    public InternalSDF3Parser(TokenStream input, SDF3GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "SDF3";
   	}

   	@Override
   	protected SDF3GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSDF3
entryRuleSDF3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSDF3Rule()); }
	iv_ruleSDF3=ruleSDF3
	{ $current=$iv_ruleSDF3.current; }
	EOF;

// Rule SDF3
ruleSDF3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='type'
		{
			newLeafNode(otherlv_0, grammarAccess.getSDF3Access().getTypeKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getSDF3Access().getSDF_TYPEParserRuleCall_1());
		}
		ruleSDF_TYPE
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getSDF3Access().getSemicolonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSDF3Access().getApplicationApplicationGraphParserRuleCall_3_0());
				}
				lv_application_3_0=ruleApplicationGraph
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSDF3Rule());
					}
					set(
						$current,
						"application",
						lv_application_3_0,
						"nl.tue.ele.es.sdf3.editor.SDF3.ApplicationGraph");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='properties'
		{
			newLeafNode(otherlv_4, grammarAccess.getSDF3Access().getPropertiesKeyword_4());
		}
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getSDF3Access().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSDF3Access().getPropertiesPropertyParserRuleCall_6_0());
				}
				lv_properties_6_0=ruleProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSDF3Rule());
					}
					add(
						$current,
						"properties",
						lv_properties_6_0,
						"nl.tue.ele.es.sdf3.editor.SDF3.Property");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getSDF3Access().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleApplicationGraph
entryRuleApplicationGraph returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getApplicationGraphRule()); }
	iv_ruleApplicationGraph=ruleApplicationGraph
	{ $current=$iv_ruleApplicationGraph.current; }
	EOF;

// Rule ApplicationGraph
ruleApplicationGraph returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='application'
		{
			newLeafNode(otherlv_0, grammarAccess.getApplicationGraphAccess().getApplicationKeyword_0());
		}
		otherlv_1='graph'
		{
			newLeafNode(otherlv_1, grammarAccess.getApplicationGraphAccess().getGraphKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getApplicationGraphAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getApplicationGraphRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getApplicationGraphAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getApplicationGraphAccess().getActorsActorParserRuleCall_4_0());
				}
				lv_actors_4_0=ruleActor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getApplicationGraphRule());
					}
					add(
						$current,
						"actors",
						lv_actors_4_0,
						"nl.tue.ele.es.sdf3.editor.SDF3.Actor");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getApplicationGraphAccess().getChannelsChannelParserRuleCall_5_0());
				}
				lv_channels_5_0=ruleChannel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getApplicationGraphRule());
					}
					add(
						$current,
						"channels",
						lv_channels_5_0,
						"nl.tue.ele.es.sdf3.editor.SDF3.Channel");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getApplicationGraphAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleActor
entryRuleActor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActorRule()); }
	iv_ruleActor=ruleActor
	{ $current=$iv_ruleActor.current; }
	EOF;

// Rule Actor
ruleActor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='actor'
		{
			newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				lv_type_3_0=RULE_ID
				{
					newLeafNode(lv_type_3_0, grammarAccess.getActorAccess().getTypeIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActorRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getActorAccess().getRightSquareBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActorAccess().getPortsPortParserRuleCall_5_0());
				}
				lv_ports_5_0=rulePort
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActorRule());
					}
					add(
						$current,
						"ports",
						lv_ports_5_0,
						"nl.tue.ele.es.sdf3.editor.SDF3.Port");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getActorAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActorAccess().getPortsPortParserRuleCall_6_1_0());
					}
					lv_ports_7_0=rulePort
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActorRule());
						}
						add(
							$current,
							"ports",
							lv_ports_7_0,
							"nl.tue.ele.es.sdf3.editor.SDF3.Port");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getActorAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRulePort
entryRulePort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPortRule()); }
	iv_rulePort=rulePort
	{ $current=$iv_rulePort.current; }
	EOF;

// Rule Port
rulePort returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getPortAccess().getPortTypePortTypeEnumRuleCall_0_0());
				}
				lv_portType_0_0=rulePortType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPortRule());
					}
					set(
						$current,
						"portType",
						lv_portType_0_0,
						"nl.tue.ele.es.sdf3.editor.SDF3.PortType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPortRule());
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
			(
				lv_rate_2_0=RULE_INT
				{
					newLeafNode(lv_rate_2_0, grammarAccess.getPortAccess().getRateINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPortRule());
					}
					setWithLastConsumed(
						$current,
						"rate",
						lv_rate_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleChannel
entryRuleChannel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChannelRule()); }
	iv_ruleChannel=ruleChannel
	{ $current=$iv_ruleChannel.current; }
	EOF;

// Rule Channel
ruleChannel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='channel'
		{
			newLeafNode(otherlv_0, grammarAccess.getChannelAccess().getChannelKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChannelRule());
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
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChannelRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getChannelAccess().getSourcePortCrossReference_2_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='to'
		{
			newLeafNode(otherlv_3, grammarAccess.getChannelAccess().getToKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChannelRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getChannelAccess().getDestinationPortCrossReference_4_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='initially'
			{
				newLeafNode(otherlv_5, grammarAccess.getChannelAccess().getInitiallyKeyword_5_0());
			}
			(
				(
					lv_initialTokens_6_0=RULE_INT
					{
						newLeafNode(lv_initialTokens_6_0, grammarAccess.getChannelAccess().getInitialTokensINTTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getChannelRule());
						}
						setWithLastConsumed(
							$current,
							"initialTokens",
							lv_initialTokens_6_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFQNRule()); }
	iv_ruleFQN=ruleFQN
	{ $current=$iv_ruleFQN.current.getText(); }
	EOF;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	iv_ruleProperty=ruleProperty
	{ $current=$iv_ruleProperty.current; }
	EOF;

// Rule Property
ruleProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPropertyAccess().getActorPropertyParserRuleCall_0());
		}
		this_ActorProperty_0=ruleActorProperty
		{
			$current = $this_ActorProperty_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPropertyAccess().getChannelPropertyParserRuleCall_1());
		}
		this_ChannelProperty_1=ruleChannelProperty
		{
			$current = $this_ChannelProperty_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPropertyAccess().getGraphPropertyParserRuleCall_2());
		}
		this_GraphProperty_2=ruleGraphProperty
		{
			$current = $this_GraphProperty_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGraphProperty
entryRuleGraphProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGraphPropertyRule()); }
	iv_ruleGraphProperty=ruleGraphProperty
	{ $current=$iv_ruleGraphProperty.current; }
	EOF;

// Rule GraphProperty
ruleGraphProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='throughput'
		{
			newLeafNode(otherlv_0, grammarAccess.getGraphPropertyAccess().getThroughputKeyword_0());
		}
		(
			(
				lv_throughput_1_0=RULE_DECIMAL
				{
					newLeafNode(lv_throughput_1_0, grammarAccess.getGraphPropertyAccess().getThroughputDECIMALTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGraphPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"throughput",
						lv_throughput_1_0,
						"nl.tue.ele.es.sdf3.editor.SDF3.DECIMAL");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getGraphPropertyAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleChannelProperty
entryRuleChannelProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChannelPropertyRule()); }
	iv_ruleChannelProperty=ruleChannelProperty
	{ $current=$iv_ruleChannelProperty.current; }
	EOF;

// Rule ChannelProperty
ruleChannelProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='for'
		{
			newLeafNode(otherlv_0, grammarAccess.getChannelPropertyAccess().getForKeyword_0());
		}
		otherlv_1='channel'
		{
			newLeafNode(otherlv_1, grammarAccess.getChannelPropertyAccess().getChannelKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChannelPropertyRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getChannelPropertyAccess().getChannelChannelCrossReference_2_0());
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getChannelPropertyAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getChannelPropertyAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleActorProperty
entryRuleActorProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActorPropertyRule()); }
	iv_ruleActorProperty=ruleActorProperty
	{ $current=$iv_ruleActorProperty.current; }
	EOF;

// Rule ActorProperty
ruleActorProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='for'
		{
			newLeafNode(otherlv_0, grammarAccess.getActorPropertyAccess().getForKeyword_0());
		}
		otherlv_1='actor'
		{
			newLeafNode(otherlv_1, grammarAccess.getActorPropertyAccess().getActorKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActorPropertyRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getActorPropertyAccess().getActorActorCrossReference_2_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getActorPropertyAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getActorPropertyAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleSDF_TYPE
entryRuleSDF_TYPE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSDF_TYPERule()); }
	iv_ruleSDF_TYPE=ruleSDF_TYPE
	{ $current=$iv_ruleSDF_TYPE.current.getText(); }
	EOF;

// Rule SDF_TYPE
ruleSDF_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='SDF'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSDF_TYPEAccess().getSDFKeyword_0());
		}
		    |
		kw='SADF'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSDF_TYPEAccess().getSADFKeyword_1());
		}
	)
;

// Rule PortType
rulePortType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='in'
			{
				$current = grammarAccess.getPortTypeAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPortTypeAccess().getINEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='out'
			{
				$current = grammarAccess.getPortTypeAccess().getOUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPortTypeAccess().getOUTEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_DECIMAL : ('0'..'9')* '.' ('0'..'9')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
