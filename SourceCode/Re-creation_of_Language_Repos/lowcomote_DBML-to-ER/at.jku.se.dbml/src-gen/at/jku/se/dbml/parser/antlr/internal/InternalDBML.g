/*
 * generated by Xtext 2.35.0
 */
grammar InternalDBML;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package at.jku.se.dbml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package at.jku.se.dbml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.jku.se.dbml.services.DBMLGrammarAccess;

}

@parser::members {

 	private DBMLGrammarAccess grammarAccess;

    public InternalDBMLParser(TokenStream input, DBMLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected DBMLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0());
			}
			lv_statements_0_0=ruleStatement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"statements",
					lv_statements_0_0,
					"at.jku.se.dbml.DBML.Statement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getTableParserRuleCall_0());
		}
		this_Table_0=ruleTable
		{
			$current = $this_Table_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getRefParserRuleCall_1());
		}
		this_Ref_1=ruleRef
		{
			$current = $this_Ref_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTable
entryRuleTable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTableRule()); }
	iv_ruleTable=ruleTable
	{ $current=$iv_ruleTable.current; }
	EOF;

// Rule Table
ruleTable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Table'
		{
			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
		}
		otherlv_1='"'
		{
			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getQuotationMarkKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"at.jku.se.dbml.DBML.ID");
				}
			)
		)
		otherlv_3='"'
		{
			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getQuotationMarkKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTableAccess().getAttributesAttributeParserRuleCall_5_0());
				}
				lv_attributes_5_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTableRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_5_0,
						"at.jku.se.dbml.DBML.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_6='Indexes'
			{
				newLeafNode(otherlv_6, grammarAccess.getTableAccess().getIndexesKeyword_6_0());
			}
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				{
					newCompositeNode(grammarAccess.getTableAccess().getIndexParserRuleCall_6_2());
				}
				ruleIndex
				{
					afterParserOrEnumRuleCall();
				}
			)+
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6_3());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleIndex
entryRuleIndex returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIndexRule()); }
	iv_ruleIndex=ruleIndex
	{ $current=$iv_ruleIndex.current.getText(); }
	EOF;

// Rule Index
ruleIndex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_ID_0=RULE_ID
			{
				$current.merge(this_ID_0);
			}
			{
				newLeafNode(this_ID_0, grammarAccess.getIndexAccess().getIDTerminalRuleCall_0_0());
			}
			    |
			(
				kw='('
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getIndexAccess().getLeftParenthesisKeyword_0_1_0());
				}
				this_ID_2=RULE_ID
				{
					$current.merge(this_ID_2);
				}
				{
					newLeafNode(this_ID_2, grammarAccess.getIndexAccess().getIDTerminalRuleCall_0_1_1());
				}
				(
					kw=','
					{
						$current.merge(kw);
						newLeafNode(kw, grammarAccess.getIndexAccess().getCommaKeyword_0_1_2_0());
					}
					this_ID_4=RULE_ID
					{
						$current.merge(this_ID_4);
					}
					{
						newLeafNode(this_ID_4, grammarAccess.getIndexAccess().getIDTerminalRuleCall_0_1_2_1());
					}
				)+
				kw=')'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getIndexAccess().getRightParenthesisKeyword_0_1_3());
				}
			)
		)
		kw='['
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getIndexAccess().getLeftSquareBracketKeyword_1());
		}
		(
			kw='unique,'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getIndexAccess().getUniqueKeyword_2());
			}
		)?
		(
			kw='pk'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getIndexAccess().getPkKeyword_3_0());
			}
			    |
			(
				kw='name:'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getIndexAccess().getNameKeyword_3_1_0());
				}
				kw='"'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getIndexAccess().getQuotationMarkKeyword_3_1_1());
				}
				this_ID_11=RULE_ID
				{
					$current.merge(this_ID_11);
				}
				{
					newLeafNode(this_ID_11, grammarAccess.getIndexAccess().getIDTerminalRuleCall_3_1_2());
				}
				kw='"'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getIndexAccess().getQuotationMarkKeyword_3_1_3());
				}
			)
		)
		kw=']'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getIndexAccess().getRightSquareBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='"'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getQuotationMarkKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"at.jku.se.dbml.DBML.ID");
				}
			)
		)
		otherlv_2='"'
		{
			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getQuotationMarkKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0());
				}
				lv_type_3_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"at.jku.se.dbml.DBML.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='['
			{
				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAttributeAccess().getOptionsOptionalParserRuleCall_4_1_0());
					}
					lv_options_5_0=ruleOptional
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAttributeRule());
						}
						add(
							$current,
							"options",
							lv_options_5_0,
							"at.jku.se.dbml.DBML.Optional");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAttributeAccess().getOptionsOptionalParserRuleCall_4_2_1_0());
						}
						lv_options_7_0=ruleOptional
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAttributeRule());
							}
							add(
								$current,
								"options",
								lv_options_7_0,
								"at.jku.se.dbml.DBML.Optional");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8=']'
			{
				newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_4_3());
			}
		)?
	)
;

// Entry rule entryRuleOptional
entryRuleOptional returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOptionalRule()); }
	iv_ruleOptional=ruleOptional
	{ $current=$iv_ruleOptional.current.getText(); }
	EOF;

// Rule Optional
ruleOptional returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='pk'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOptionalAccess().getPkKeyword_0());
		}
		    |
		(
			kw='not'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getOptionalAccess().getNotKeyword_1_0());
			}
			kw='null'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getOptionalAccess().getNullKeyword_1_1());
			}
		)
		    |
		kw='increment'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOptionalAccess().getIncrementKeyword_2());
		}
	)
;

// Entry rule entryRuleType
entryRuleType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current.getText(); }
	EOF;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='BOOLEAN'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getBOOLEANKeyword_0());
		}
		    |
		kw='BIT'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getBITKeyword_1());
		}
		    |
		kw='INT'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getINTKeyword_2());
		}
		    |
		kw='INTEGER'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getINTEGERKeyword_3());
		}
		    |
		kw='FLOAT'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getFLOATKeyword_4());
		}
		    |
		(
			kw='TINYINT'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getTINYINTKeyword_5_0());
			}
			(
				kw='('
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_5_1_0());
				}
				this_INT_7=RULE_INT
				{
					$current.merge(this_INT_7);
				}
				{
					newLeafNode(this_INT_7, grammarAccess.getTypeAccess().getINTTerminalRuleCall_5_1_1());
				}
				kw=')'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_5_1_2());
				}
			)?
		)
		    |
		kw='BIGINT'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getBIGINTKeyword_6());
		}
		    |
		kw='SMALLINT'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getSMALLINTKeyword_7());
		}
		    |
		kw='BYTE'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getBYTEKeyword_8());
		}
		    |
		kw='TIMESTAMP'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getTIMESTAMPKeyword_9());
		}
		    |
		kw='DATE'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getDATEKeyword_10());
		}
		    |
		kw='DATETIME'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getDATETIMEKeyword_11());
		}
		    |
		kw='TEXT'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getTEXTKeyword_12());
		}
		    |
		kw='LONGTEXT'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getLONGTEXTKeyword_13());
		}
		    |
		(
			kw='MEDIUMTEXT'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getMEDIUMTEXTKeyword_14_0());
			}
			(
				kw='('
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_14_1_0());
				}
				this_INT_19=RULE_INT
				{
					$current.merge(this_INT_19);
				}
				{
					newLeafNode(this_INT_19, grammarAccess.getTypeAccess().getINTTerminalRuleCall_14_1_1());
				}
				kw=')'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_14_1_2());
				}
			)?
		)
		    |
		(
			kw='CHAR('
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getCHARKeyword_15_0());
			}
			this_INT_22=RULE_INT
			{
				$current.merge(this_INT_22);
			}
			{
				newLeafNode(this_INT_22, grammarAccess.getTypeAccess().getINTTerminalRuleCall_15_1());
			}
			kw=')'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_15_2());
			}
		)
		    |
		(
			kw='VARCHAR('
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getVARCHARKeyword_16_0());
			}
			this_INT_25=RULE_INT
			{
				$current.merge(this_INT_25);
			}
			{
				newLeafNode(this_INT_25, grammarAccess.getTypeAccess().getINTTerminalRuleCall_16_1());
			}
			kw=')'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_16_2());
			}
		)
		    |
		(
			kw='NCHAR('
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getNCHARKeyword_17_0());
			}
			this_INT_28=RULE_INT
			{
				$current.merge(this_INT_28);
			}
			{
				newLeafNode(this_INT_28, grammarAccess.getTypeAccess().getINTTerminalRuleCall_17_1());
			}
			kw=')'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_17_2());
			}
		)
		    |
		(
			kw='NVARCHAR('
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getNVARCHARKeyword_18_0());
			}
			this_INT_31=RULE_INT
			{
				$current.merge(this_INT_31);
			}
			{
				newLeafNode(this_INT_31, grammarAccess.getTypeAccess().getINTTerminalRuleCall_18_1());
			}
			kw=')'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_18_2());
			}
		)
		    |
		(
			kw='DECIMAL('
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getDECIMALKeyword_19_0());
			}
			this_INT_34=RULE_INT
			{
				$current.merge(this_INT_34);
			}
			{
				newLeafNode(this_INT_34, grammarAccess.getTypeAccess().getINTTerminalRuleCall_19_1());
			}
			kw=','
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getCommaKeyword_19_2());
			}
			this_INT_36=RULE_INT
			{
				$current.merge(this_INT_36);
			}
			{
				newLeafNode(this_INT_36, grammarAccess.getTypeAccess().getINTTerminalRuleCall_19_3());
			}
			kw=')'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_19_4());
			}
		)
		    |
		(
			kw='DOUBLE'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getDOUBLEKeyword_20_0());
			}
			(
				kw='('
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_20_1_0());
				}
				this_INT_40=RULE_INT
				{
					$current.merge(this_INT_40);
				}
				{
					newLeafNode(this_INT_40, grammarAccess.getTypeAccess().getINTTerminalRuleCall_20_1_1());
				}
				kw=','
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getTypeAccess().getCommaKeyword_20_1_2());
				}
				this_INT_42=RULE_INT
				{
					$current.merge(this_INT_42);
				}
				{
					newLeafNode(this_INT_42, grammarAccess.getTypeAccess().getINTTerminalRuleCall_20_1_3());
				}
				kw=')'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_20_1_4());
				}
			)?
		)
		    |
		(
			kw='timestamp('
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getTimestampKeyword_21_0());
			}
			this_INT_45=RULE_INT
			{
				$current.merge(this_INT_45);
			}
			{
				newLeafNode(this_INT_45, grammarAccess.getTypeAccess().getINTTerminalRuleCall_21_1());
			}
			kw=')'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_21_2());
			}
		)
		    |
		kw='jsonb'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getJsonbKeyword_22());
		}
		    |
		kw='json'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getJsonKeyword_23());
		}
		    |
		kw='JSON'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getJSONKeyword_24());
		}
	)
;

// Entry rule entryRuleRef
entryRuleRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefRule()); }
	iv_ruleRef=ruleRef
	{ $current=$iv_ruleRef.current; }
	EOF;

// Rule Ref
ruleRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Ref'
		{
			newLeafNode(otherlv_0, grammarAccess.getRefAccess().getRefKeyword_0());
		}
		(
			otherlv_1=':'
			{
				newLeafNode(otherlv_1, grammarAccess.getRefAccess().getColonKeyword_1());
			}
		)?
		(
			otherlv_2='"'
			{
				newLeafNode(otherlv_2, grammarAccess.getRefAccess().getQuotationMarkKeyword_2_0());
			}
			this_ID_3=RULE_ID
			{
				newLeafNode(this_ID_3, grammarAccess.getRefAccess().getIDTerminalRuleCall_2_1());
			}
			otherlv_4='":'
			{
				newLeafNode(otherlv_4, grammarAccess.getRefAccess().getQuotationMarkColonKeyword_2_2());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getRefAccess().getLeftNestedRefParserRuleCall_3_0());
				}
				lv_left_5_0=ruleNestedRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRefRule());
					}
					set(
						$current,
						"left",
						lv_left_5_0,
						"at.jku.se.dbml.DBML.NestedRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='<'
		{
			newLeafNode(otherlv_6, grammarAccess.getRefAccess().getLessThanSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRefAccess().getRightNestedRefParserRuleCall_5_0());
				}
				lv_right_7_0=ruleNestedRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRefRule());
					}
					set(
						$current,
						"right",
						lv_right_7_0,
						"at.jku.se.dbml.DBML.NestedRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNestedRef
entryRuleNestedRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedRefRule()); }
	iv_ruleNestedRef=ruleNestedRef
	{ $current=$iv_ruleNestedRef.current; }
	EOF;

// Rule NestedRef
ruleNestedRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='"'
		{
			newLeafNode(otherlv_0, grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNestedRefRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getNestedRefAccess().getTableTableCrossReference_1_0());
				}
			)
		)
		otherlv_2='"'
		{
			newLeafNode(otherlv_2, grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_2());
		}
		otherlv_3='.'
		{
			newLeafNode(otherlv_3, grammarAccess.getNestedRefAccess().getFullStopKeyword_3());
		}
		otherlv_4='"'
		{
			newLeafNode(otherlv_4, grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_4());
		}
		(
			(
				lv_attr_5_0=RULE_ID
				{
					newLeafNode(lv_attr_5_0, grammarAccess.getNestedRefAccess().getAttrIDTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNestedRefRule());
					}
					setWithLastConsumed(
						$current,
						"attr",
						lv_attr_5_0,
						"at.jku.se.dbml.DBML.ID");
				}
			)
		)
		otherlv_6='"'
		{
			newLeafNode(otherlv_6, grammarAccess.getNestedRefAccess().getQuotationMarkKeyword_6());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
