/*
 * generated by Xtext 2.35.0
 */
package at.jku.se.dbml.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DBMLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.jku.se.dbml.DBML.Model");
		private final Assignment cStatementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStatementsStatementParserRuleCall_0 = (RuleCall)cStatementsAssignment.eContents().get(0);
		
		//Model:
		//    (statements+=Statement)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(statements+=Statement)*
		public Assignment getStatementsAssignment() { return cStatementsAssignment; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_0() { return cStatementsStatementParserRuleCall_0; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.jku.se.dbml.DBML.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTableParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRefParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Statement:
		//    Table | Ref;
		@Override public ParserRule getRule() { return rule; }
		
		//Table | Ref
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Table
		public RuleCall getTableParserRuleCall_0() { return cTableParserRuleCall_0; }
		
		//Ref
		public RuleCall getRefParserRuleCall_1() { return cRefParserRuleCall_1; }
	}
	public class TableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.jku.se.dbml.DBML.Table");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTableKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cQuotationMarkKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cQuotationMarkKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAttributesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAttributesAttributeParserRuleCall_5_0 = (RuleCall)cAttributesAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cIndexesKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final RuleCall cIndexParserRuleCall_6_2 = (RuleCall)cGroup_6.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Table:
		//    'Table' '"' name=ID '"' '{'
		//        attributes += Attribute*
		//    ('Indexes' '{' Index+ '}')?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Table' '"' name=ID '"' '{'
		//    attributes += Attribute*
		//('Indexes' '{' Index+ '}')?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Table'
		public Keyword getTableKeyword_0() { return cTableKeyword_0; }
		
		//'"'
		public Keyword getQuotationMarkKeyword_1() { return cQuotationMarkKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'"'
		public Keyword getQuotationMarkKeyword_3() { return cQuotationMarkKeyword_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//attributes += Attribute*
		public Assignment getAttributesAssignment_5() { return cAttributesAssignment_5; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_5_0() { return cAttributesAttributeParserRuleCall_5_0; }
		
		//('Indexes' '{' Index+ '}')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'Indexes'
		public Keyword getIndexesKeyword_6_0() { return cIndexesKeyword_6_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_1() { return cLeftCurlyBracketKeyword_6_1; }
		
		//Index+
		public RuleCall getIndexParserRuleCall_6_2() { return cIndexParserRuleCall_6_2; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6_3() { return cRightCurlyBracketKeyword_6_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class IndexElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.jku.se.dbml.DBML.Index");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0_1_0 = (Keyword)cGroup_0_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1_1 = (RuleCall)cGroup_0_1.eContents().get(1);
		private final Group cGroup_0_1_2 = (Group)cGroup_0_1.eContents().get(2);
		private final Keyword cCommaKeyword_0_1_2_0 = (Keyword)cGroup_0_1_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1_2_1 = (RuleCall)cGroup_0_1_2.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_1_3 = (Keyword)cGroup_0_1.eContents().get(3);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cUniqueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Keyword cPkKeyword_3_0 = (Keyword)cAlternatives_3.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cNameKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cQuotationMarkKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_3_1_2 = (RuleCall)cGroup_3_1.eContents().get(2);
		private final Keyword cQuotationMarkKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Index: (ID | '(' ID (',' ID)+ ')') '[' ('unique,')? ('pk' | 'name:' '"' ID '"') ']';
		@Override public ParserRule getRule() { return rule; }
		
		//(ID | '(' ID (',' ID)+ ')') '[' ('unique,')? ('pk' | 'name:' '"' ID '"') ']'
		public Group getGroup() { return cGroup; }
		
		//(ID | '(' ID (',' ID)+ ')')
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_0() { return cIDTerminalRuleCall_0_0; }
		
		//'(' ID (',' ID)+ ')'
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_1_0() { return cLeftParenthesisKeyword_0_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_1_1() { return cIDTerminalRuleCall_0_1_1; }
		
		//(',' ID)+
		public Group getGroup_0_1_2() { return cGroup_0_1_2; }
		
		//','
		public Keyword getCommaKeyword_0_1_2_0() { return cCommaKeyword_0_1_2_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_1_2_1() { return cIDTerminalRuleCall_0_1_2_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_1_3() { return cRightParenthesisKeyword_0_1_3; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//('unique,')?
		public Keyword getUniqueKeyword_2() { return cUniqueKeyword_2; }
		
		//('pk' | 'name:' '"' ID '"')
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//'pk'
		public Keyword getPkKeyword_3_0() { return cPkKeyword_3_0; }
		
		//'name:' '"' ID '"'
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'name:'
		public Keyword getNameKeyword_3_1_0() { return cNameKeyword_3_1_0; }
		
		//'"'
		public Keyword getQuotationMarkKeyword_3_1_1() { return cQuotationMarkKeyword_3_1_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_3_1_2() { return cIDTerminalRuleCall_3_1_2; }
		
		//'"'
		public Keyword getQuotationMarkKeyword_3_1_3() { return cQuotationMarkKeyword_3_1_3; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.jku.se.dbml.DBML.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuotationMarkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cQuotationMarkKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeTypeParserRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLeftSquareBracketKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cOptionsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cOptionsOptionalParserRuleCall_4_1_0 = (RuleCall)cOptionsAssignment_4_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cOptionsAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cOptionsOptionalParserRuleCall_4_2_1_0 = (RuleCall)cOptionsAssignment_4_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		
		//Attribute:
		//    '"' name=ID '"' type=Type ('[' options+=Optional ("," options+=Optional)* ']')?;
		@Override public ParserRule getRule() { return rule; }
		
		//'"' name=ID '"' type=Type ('[' options+=Optional ("," options+=Optional)* ']')?
		public Group getGroup() { return cGroup; }
		
		//'"'
		public Keyword getQuotationMarkKeyword_0() { return cQuotationMarkKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'"'
		public Keyword getQuotationMarkKeyword_2() { return cQuotationMarkKeyword_2; }
		
		//type=Type
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_3_0() { return cTypeTypeParserRuleCall_3_0; }
		
		//('[' options+=Optional ("," options+=Optional)* ']')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_4_0() { return cLeftSquareBracketKeyword_4_0; }
		
		//options+=Optional
		public Assignment getOptionsAssignment_4_1() { return cOptionsAssignment_4_1; }
		
		//Optional
		public RuleCall getOptionsOptionalParserRuleCall_4_1_0() { return cOptionsOptionalParserRuleCall_4_1_0; }
		
		//("," options+=Optional)*
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//","
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }
		
		//options+=Optional
		public Assignment getOptionsAssignment_4_2_1() { return cOptionsAssignment_4_2_1; }
		
		//Optional
		public RuleCall getOptionsOptionalParserRuleCall_4_2_1_0() { return cOptionsOptionalParserRuleCall_4_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_4_3() { return cRightSquareBracketKeyword_4_3; }
	}
	public class OptionalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.jku.se.dbml.DBML.Optional");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cPkKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cNotKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cNullKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Keyword cIncrementKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//Optional:
		//    'pk' |
		//    'not' 'null' |
		//    'increment'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'pk' |
		//'not' 'null' |
		//'increment'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'pk'
		public Keyword getPkKeyword_0() { return cPkKeyword_0; }
		
		//'not' 'null'
		public Group getGroup_1() { return cGroup_1; }
		
		//'not'
		public Keyword getNotKeyword_1_0() { return cNotKeyword_1_0; }
		
		//'null'
		public Keyword getNullKeyword_1_1() { return cNullKeyword_1_1; }
		
		//'increment'
		public Keyword getIncrementKeyword_2() { return cIncrementKeyword_2; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.jku.se.dbml.DBML.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cBOOLEANKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cBITKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cINTKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cINTEGERKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cFLOATKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cTINYINTKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Group cGroup_5_1 = (Group)cGroup_5.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_5_1_1 = (RuleCall)cGroup_5_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_5_1_2 = (Keyword)cGroup_5_1.eContents().get(2);
		private final Keyword cBIGINTKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword cSMALLINTKeyword_7 = (Keyword)cAlternatives.eContents().get(7);
		private final Keyword cBYTEKeyword_8 = (Keyword)cAlternatives.eContents().get(8);
		private final Keyword cTIMESTAMPKeyword_9 = (Keyword)cAlternatives.eContents().get(9);
		private final Keyword cDATEKeyword_10 = (Keyword)cAlternatives.eContents().get(10);
		private final Keyword cDATETIMEKeyword_11 = (Keyword)cAlternatives.eContents().get(11);
		private final Keyword cTEXTKeyword_12 = (Keyword)cAlternatives.eContents().get(12);
		private final Keyword cLONGTEXTKeyword_13 = (Keyword)cAlternatives.eContents().get(13);
		private final Group cGroup_14 = (Group)cAlternatives.eContents().get(14);
		private final Keyword cMEDIUMTEXTKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Group cGroup_14_1 = (Group)cGroup_14.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_14_1_0 = (Keyword)cGroup_14_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_14_1_1 = (RuleCall)cGroup_14_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_14_1_2 = (Keyword)cGroup_14_1.eContents().get(2);
		private final Group cGroup_15 = (Group)cAlternatives.eContents().get(15);
		private final Keyword cCHARKeyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_15_1 = (RuleCall)cGroup_15.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_15_2 = (Keyword)cGroup_15.eContents().get(2);
		private final Group cGroup_16 = (Group)cAlternatives.eContents().get(16);
		private final Keyword cVARCHARKeyword_16_0 = (Keyword)cGroup_16.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_16_1 = (RuleCall)cGroup_16.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_16_2 = (Keyword)cGroup_16.eContents().get(2);
		private final Group cGroup_17 = (Group)cAlternatives.eContents().get(17);
		private final Keyword cNCHARKeyword_17_0 = (Keyword)cGroup_17.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_17_1 = (RuleCall)cGroup_17.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_17_2 = (Keyword)cGroup_17.eContents().get(2);
		private final Group cGroup_18 = (Group)cAlternatives.eContents().get(18);
		private final Keyword cNVARCHARKeyword_18_0 = (Keyword)cGroup_18.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_18_1 = (RuleCall)cGroup_18.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_18_2 = (Keyword)cGroup_18.eContents().get(2);
		private final Group cGroup_19 = (Group)cAlternatives.eContents().get(19);
		private final Keyword cDECIMALKeyword_19_0 = (Keyword)cGroup_19.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_19_1 = (RuleCall)cGroup_19.eContents().get(1);
		private final Keyword cCommaKeyword_19_2 = (Keyword)cGroup_19.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_19_3 = (RuleCall)cGroup_19.eContents().get(3);
		private final Keyword cRightParenthesisKeyword_19_4 = (Keyword)cGroup_19.eContents().get(4);
		private final Group cGroup_20 = (Group)cAlternatives.eContents().get(20);
		private final Keyword cDOUBLEKeyword_20_0 = (Keyword)cGroup_20.eContents().get(0);
		private final Group cGroup_20_1 = (Group)cGroup_20.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_20_1_0 = (Keyword)cGroup_20_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_20_1_1 = (RuleCall)cGroup_20_1.eContents().get(1);
		private final Keyword cCommaKeyword_20_1_2 = (Keyword)cGroup_20_1.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_20_1_3 = (RuleCall)cGroup_20_1.eContents().get(3);
		private final Keyword cRightParenthesisKeyword_20_1_4 = (Keyword)cGroup_20_1.eContents().get(4);
		private final Group cGroup_21 = (Group)cAlternatives.eContents().get(21);
		private final Keyword cTimestampKeyword_21_0 = (Keyword)cGroup_21.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_21_1 = (RuleCall)cGroup_21.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_21_2 = (Keyword)cGroup_21.eContents().get(2);
		private final Keyword cJsonbKeyword_22 = (Keyword)cAlternatives.eContents().get(22);
		private final Keyword cJsonKeyword_23 = (Keyword)cAlternatives.eContents().get(23);
		private final Keyword cJSONKeyword_24 = (Keyword)cAlternatives.eContents().get(24);
		
		//Type:
		//    'BOOLEAN' |
		//    'BIT' |
		//    'INT' |
		//    'INTEGER' |
		//    'FLOAT' |
		//    'TINYINT' ('(' INT ')')? |
		//    'BIGINT' |
		//    'SMALLINT' |
		//    'BYTE' |
		//    'TIMESTAMP' |
		//    'DATE' |
		//    'DATETIME' |
		//    'TEXT' |
		//    'LONGTEXT' |
		//    'MEDIUMTEXT' ('(' INT ')')?|
		//    'CHAR(' INT ')' |
		//    'VARCHAR(' INT ')' |
		//    'NCHAR(' INT ')' |
		//    'NVARCHAR(' INT ')' |
		//    'DECIMAL(' INT ',' INT ')' |
		//    'DOUBLE'('(' INT ',' INT ')')? |
		//    'timestamp('INT')' |
		//    'jsonb' |
		//    'json' |
		//    'JSON'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'BOOLEAN' |
		//'BIT' |
		//'INT' |
		//'INTEGER' |
		//'FLOAT' |
		//'TINYINT' ('(' INT ')')? |
		//'BIGINT' |
		//'SMALLINT' |
		//'BYTE' |
		//'TIMESTAMP' |
		//'DATE' |
		//'DATETIME' |
		//'TEXT' |
		//'LONGTEXT' |
		//'MEDIUMTEXT' ('(' INT ')')?|
		//'CHAR(' INT ')' |
		//'VARCHAR(' INT ')' |
		//'NCHAR(' INT ')' |
		//'NVARCHAR(' INT ')' |
		//'DECIMAL(' INT ',' INT ')' |
		//'DOUBLE'('(' INT ',' INT ')')? |
		//'timestamp('INT')' |
		//'jsonb' |
		//'json' |
		//'JSON'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'BOOLEAN'
		public Keyword getBOOLEANKeyword_0() { return cBOOLEANKeyword_0; }
		
		//'BIT'
		public Keyword getBITKeyword_1() { return cBITKeyword_1; }
		
		//'INT'
		public Keyword getINTKeyword_2() { return cINTKeyword_2; }
		
		//'INTEGER'
		public Keyword getINTEGERKeyword_3() { return cINTEGERKeyword_3; }
		
		//'FLOAT'
		public Keyword getFLOATKeyword_4() { return cFLOATKeyword_4; }
		
		//'TINYINT' ('(' INT ')')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'TINYINT'
		public Keyword getTINYINTKeyword_5_0() { return cTINYINTKeyword_5_0; }
		
		//('(' INT ')')?
		public Group getGroup_5_1() { return cGroup_5_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5_1_0() { return cLeftParenthesisKeyword_5_1_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_5_1_1() { return cINTTerminalRuleCall_5_1_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5_1_2() { return cRightParenthesisKeyword_5_1_2; }
		
		//'BIGINT'
		public Keyword getBIGINTKeyword_6() { return cBIGINTKeyword_6; }
		
		//'SMALLINT'
		public Keyword getSMALLINTKeyword_7() { return cSMALLINTKeyword_7; }
		
		//'BYTE'
		public Keyword getBYTEKeyword_8() { return cBYTEKeyword_8; }
		
		//'TIMESTAMP'
		public Keyword getTIMESTAMPKeyword_9() { return cTIMESTAMPKeyword_9; }
		
		//'DATE'
		public Keyword getDATEKeyword_10() { return cDATEKeyword_10; }
		
		//'DATETIME'
		public Keyword getDATETIMEKeyword_11() { return cDATETIMEKeyword_11; }
		
		//'TEXT'
		public Keyword getTEXTKeyword_12() { return cTEXTKeyword_12; }
		
		//'LONGTEXT'
		public Keyword getLONGTEXTKeyword_13() { return cLONGTEXTKeyword_13; }
		
		//'MEDIUMTEXT' ('(' INT ')')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'MEDIUMTEXT'
		public Keyword getMEDIUMTEXTKeyword_14_0() { return cMEDIUMTEXTKeyword_14_0; }
		
		//('(' INT ')')?
		public Group getGroup_14_1() { return cGroup_14_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_14_1_0() { return cLeftParenthesisKeyword_14_1_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_14_1_1() { return cINTTerminalRuleCall_14_1_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_14_1_2() { return cRightParenthesisKeyword_14_1_2; }
		
		//'CHAR(' INT ')'
		public Group getGroup_15() { return cGroup_15; }
		
		//'CHAR('
		public Keyword getCHARKeyword_15_0() { return cCHARKeyword_15_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_15_1() { return cINTTerminalRuleCall_15_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_15_2() { return cRightParenthesisKeyword_15_2; }
		
		//'VARCHAR(' INT ')'
		public Group getGroup_16() { return cGroup_16; }
		
		//'VARCHAR('
		public Keyword getVARCHARKeyword_16_0() { return cVARCHARKeyword_16_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_16_1() { return cINTTerminalRuleCall_16_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_16_2() { return cRightParenthesisKeyword_16_2; }
		
		//'NCHAR(' INT ')'
		public Group getGroup_17() { return cGroup_17; }
		
		//'NCHAR('
		public Keyword getNCHARKeyword_17_0() { return cNCHARKeyword_17_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_17_1() { return cINTTerminalRuleCall_17_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_17_2() { return cRightParenthesisKeyword_17_2; }
		
		//'NVARCHAR(' INT ')'
		public Group getGroup_18() { return cGroup_18; }
		
		//'NVARCHAR('
		public Keyword getNVARCHARKeyword_18_0() { return cNVARCHARKeyword_18_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_18_1() { return cINTTerminalRuleCall_18_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_18_2() { return cRightParenthesisKeyword_18_2; }
		
		//'DECIMAL(' INT ',' INT ')'
		public Group getGroup_19() { return cGroup_19; }
		
		//'DECIMAL('
		public Keyword getDECIMALKeyword_19_0() { return cDECIMALKeyword_19_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_19_1() { return cINTTerminalRuleCall_19_1; }
		
		//','
		public Keyword getCommaKeyword_19_2() { return cCommaKeyword_19_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_19_3() { return cINTTerminalRuleCall_19_3; }
		
		//')'
		public Keyword getRightParenthesisKeyword_19_4() { return cRightParenthesisKeyword_19_4; }
		
		//'DOUBLE'('(' INT ',' INT ')')?
		public Group getGroup_20() { return cGroup_20; }
		
		//'DOUBLE'
		public Keyword getDOUBLEKeyword_20_0() { return cDOUBLEKeyword_20_0; }
		
		//('(' INT ',' INT ')')?
		public Group getGroup_20_1() { return cGroup_20_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_20_1_0() { return cLeftParenthesisKeyword_20_1_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_20_1_1() { return cINTTerminalRuleCall_20_1_1; }
		
		//','
		public Keyword getCommaKeyword_20_1_2() { return cCommaKeyword_20_1_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_20_1_3() { return cINTTerminalRuleCall_20_1_3; }
		
		//')'
		public Keyword getRightParenthesisKeyword_20_1_4() { return cRightParenthesisKeyword_20_1_4; }
		
		//'timestamp('INT')'
		public Group getGroup_21() { return cGroup_21; }
		
		//'timestamp('
		public Keyword getTimestampKeyword_21_0() { return cTimestampKeyword_21_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_21_1() { return cINTTerminalRuleCall_21_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_21_2() { return cRightParenthesisKeyword_21_2; }
		
		//'jsonb'
		public Keyword getJsonbKeyword_22() { return cJsonbKeyword_22; }
		
		//'json'
		public Keyword getJsonKeyword_23() { return cJsonKeyword_23; }
		
		//'JSON'
		public Keyword getJSONKeyword_24() { return cJSONKeyword_24; }
	}
	public class RefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.jku.se.dbml.DBML.Ref");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cQuotationMarkKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Keyword cQuotationMarkColonKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Assignment cLeftAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLeftNestedRefParserRuleCall_3_0 = (RuleCall)cLeftAssignment_3.eContents().get(0);
		private final Keyword cLessThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cRightAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRightNestedRefParserRuleCall_5_0 = (RuleCall)cRightAssignment_5.eContents().get(0);
		
		//Ref:
		//    'Ref'(':')? ('"'ID'":')? left=NestedRef '<' right=NestedRef;
		@Override public ParserRule getRule() { return rule; }
		
		//'Ref'(':')? ('"'ID'":')? left=NestedRef '<' right=NestedRef
		public Group getGroup() { return cGroup; }
		
		//'Ref'
		public Keyword getRefKeyword_0() { return cRefKeyword_0; }
		
		//(':')?
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//('"'ID'":')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'"'
		public Keyword getQuotationMarkKeyword_2_0() { return cQuotationMarkKeyword_2_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
		
		//'":'
		public Keyword getQuotationMarkColonKeyword_2_2() { return cQuotationMarkColonKeyword_2_2; }
		
		//left=NestedRef
		public Assignment getLeftAssignment_3() { return cLeftAssignment_3; }
		
		//NestedRef
		public RuleCall getLeftNestedRefParserRuleCall_3_0() { return cLeftNestedRefParserRuleCall_3_0; }
		
		//'<'
		public Keyword getLessThanSignKeyword_4() { return cLessThanSignKeyword_4; }
		
		//right=NestedRef
		public Assignment getRightAssignment_5() { return cRightAssignment_5; }
		
		//NestedRef
		public RuleCall getRightNestedRefParserRuleCall_5_0() { return cRightNestedRefParserRuleCall_5_0; }
	}
	public class NestedRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.jku.se.dbml.DBML.NestedRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuotationMarkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTableAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTableTableCrossReference_1_0 = (CrossReference)cTableAssignment_1.eContents().get(0);
		private final RuleCall cTableTableIDTerminalRuleCall_1_0_1 = (RuleCall)cTableTableCrossReference_1_0.eContents().get(1);
		private final Keyword cQuotationMarkKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cQuotationMarkKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAttrAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAttrIDTerminalRuleCall_5_0 = (RuleCall)cAttrAssignment_5.eContents().get(0);
		private final Keyword cQuotationMarkKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//NestedRef:
		//    '"'table=[Table]'"' "." '"'attr=ID'"'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'"'table=[Table]'"' "." '"'attr=ID'"'
		public Group getGroup() { return cGroup; }
		
		//'"'
		public Keyword getQuotationMarkKeyword_0() { return cQuotationMarkKeyword_0; }
		
		//table=[Table]
		public Assignment getTableAssignment_1() { return cTableAssignment_1; }
		
		//[Table]
		public CrossReference getTableTableCrossReference_1_0() { return cTableTableCrossReference_1_0; }
		
		//ID
		public RuleCall getTableTableIDTerminalRuleCall_1_0_1() { return cTableTableIDTerminalRuleCall_1_0_1; }
		
		//'"'
		public Keyword getQuotationMarkKeyword_2() { return cQuotationMarkKeyword_2; }
		
		//"."
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }
		
		//'"'
		public Keyword getQuotationMarkKeyword_4() { return cQuotationMarkKeyword_4; }
		
		//attr=ID
		public Assignment getAttrAssignment_5() { return cAttrAssignment_5; }
		
		//ID
		public RuleCall getAttrIDTerminalRuleCall_5_0() { return cAttrIDTerminalRuleCall_5_0; }
		
		//'"'
		public Keyword getQuotationMarkKeyword_6() { return cQuotationMarkKeyword_6; }
	}
	
	
	private final ModelElements pModel;
	private final StatementElements pStatement;
	private final TableElements pTable;
	private final IndexElements pIndex;
	private final AttributeElements pAttribute;
	private final OptionalElements pOptional;
	private final TypeElements pType;
	private final RefElements pRef;
	private final NestedRefElements pNestedRef;
	private final TerminalRule tID;
	private final TerminalRule tINT;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tWS;
	private final TerminalRule tANY_OTHER;
	
	private final Grammar grammar;

	@Inject
	public DBMLGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pModel = new ModelElements();
		this.pStatement = new StatementElements();
		this.pTable = new TableElements();
		this.pIndex = new IndexElements();
		this.pAttribute = new AttributeElements();
		this.pOptional = new OptionalElements();
		this.pType = new TypeElements();
		this.pRef = new RefElements();
		this.pNestedRef = new NestedRefElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "at.jku.se.dbml.DBML.ID");
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "at.jku.se.dbml.DBML.INT");
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "at.jku.se.dbml.DBML.ML_COMMENT");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "at.jku.se.dbml.DBML.SL_COMMENT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "at.jku.se.dbml.DBML.WS");
		this.tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "at.jku.se.dbml.DBML.ANY_OTHER");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("at.jku.se.dbml.DBML".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//Model:
	//    (statements+=Statement)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Statement:
	//    Table | Ref;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//Table:
	//    'Table' '"' name=ID '"' '{'
	//        attributes += Attribute*
	//    ('Indexes' '{' Index+ '}')?
	//    '}';
	public TableElements getTableAccess() {
		return pTable;
	}
	
	public ParserRule getTableRule() {
		return getTableAccess().getRule();
	}
	
	//Index: (ID | '(' ID (',' ID)+ ')') '[' ('unique,')? ('pk' | 'name:' '"' ID '"') ']';
	public IndexElements getIndexAccess() {
		return pIndex;
	}
	
	public ParserRule getIndexRule() {
		return getIndexAccess().getRule();
	}
	
	//Attribute:
	//    '"' name=ID '"' type=Type ('[' options+=Optional ("," options+=Optional)* ']')?;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//Optional:
	//    'pk' |
	//    'not' 'null' |
	//    'increment'
	//;
	public OptionalElements getOptionalAccess() {
		return pOptional;
	}
	
	public ParserRule getOptionalRule() {
		return getOptionalAccess().getRule();
	}
	
	//Type:
	//    'BOOLEAN' |
	//    'BIT' |
	//    'INT' |
	//    'INTEGER' |
	//    'FLOAT' |
	//    'TINYINT' ('(' INT ')')? |
	//    'BIGINT' |
	//    'SMALLINT' |
	//    'BYTE' |
	//    'TIMESTAMP' |
	//    'DATE' |
	//    'DATETIME' |
	//    'TEXT' |
	//    'LONGTEXT' |
	//    'MEDIUMTEXT' ('(' INT ')')?|
	//    'CHAR(' INT ')' |
	//    'VARCHAR(' INT ')' |
	//    'NCHAR(' INT ')' |
	//    'NVARCHAR(' INT ')' |
	//    'DECIMAL(' INT ',' INT ')' |
	//    'DOUBLE'('(' INT ',' INT ')')? |
	//    'timestamp('INT')' |
	//    'jsonb' |
	//    'json' |
	//    'JSON'
	//;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//Ref:
	//    'Ref'(':')? ('"'ID'":')? left=NestedRef '<' right=NestedRef;
	public RefElements getRefAccess() {
		return pRef;
	}
	
	public ParserRule getRefRule() {
		return getRefAccess().getRule();
	}
	
	//NestedRef:
	//    '"'table=[Table]'"' "." '"'attr=ID'"'
	//;
	public NestedRefElements getNestedRefAccess() {
		return pNestedRef;
	}
	
	public ParserRule getNestedRefRule() {
		return getNestedRefAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return tINT;
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return tANY_OTHER;
	}
}
