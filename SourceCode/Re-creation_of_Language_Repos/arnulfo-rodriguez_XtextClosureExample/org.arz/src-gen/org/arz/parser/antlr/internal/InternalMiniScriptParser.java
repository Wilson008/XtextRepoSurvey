package org.arz.parser.antlr.internal;

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
import org.arz.services.MiniScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiniScriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'{'", "'}'", "'let'", "','", "'('", "')'", "'func'", "'='", "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'not'", "'and'", "'or'", "'if'", "'true'", "'false'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMiniScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiniScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiniScriptParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMiniScript.g"; }



     	private MiniScriptGrammarAccess grammarAccess;

        public InternalMiniScriptParser(TokenStream input, MiniScriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MiniScriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMiniScript.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMiniScript.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMiniScript.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMiniScript.g:72:1: ruleModel returns [EObject current=null] : this_Program_0= ruleProgram ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Program_0 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:78:2: (this_Program_0= ruleProgram )
            // InternalMiniScript.g:79:2: this_Program_0= ruleProgram
            {

            		newCompositeNode(grammarAccess.getModelAccess().getProgramParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Program_0=ruleProgram();

            state._fsp--;


            		current = this_Program_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProgram"
    // InternalMiniScript.g:90:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMiniScript.g:90:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMiniScript.g:91:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMiniScript.g:97:1: ruleProgram returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpression ) ) otherlv_1= ';' ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:103:2: ( ( ( (lv_expressions_0_0= ruleExpression ) ) otherlv_1= ';' ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )* ) )
            // InternalMiniScript.g:104:2: ( ( (lv_expressions_0_0= ruleExpression ) ) otherlv_1= ';' ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )* )
            {
            // InternalMiniScript.g:104:2: ( ( (lv_expressions_0_0= ruleExpression ) ) otherlv_1= ';' ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )* )
            // InternalMiniScript.g:105:3: ( (lv_expressions_0_0= ruleExpression ) ) otherlv_1= ';' ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )*
            {
            // InternalMiniScript.g:105:3: ( (lv_expressions_0_0= ruleExpression ) )
            // InternalMiniScript.g:106:4: (lv_expressions_0_0= ruleExpression )
            {
            // InternalMiniScript.g:106:4: (lv_expressions_0_0= ruleExpression )
            // InternalMiniScript.g:107:5: lv_expressions_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_expressions_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_0_0,
            						"org.arz.MiniScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getSemicolonKeyword_1());
            		
            // InternalMiniScript.g:128:3: ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==12||LA1_0==14||LA1_0==16||LA1_0==18||(LA1_0>=30 && LA1_0<=35)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMiniScript.g:129:4: ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';'
            	    {
            	    // InternalMiniScript.g:129:4: ( (lv_expressions_2_0= ruleExpression ) )
            	    // InternalMiniScript.g:130:5: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // InternalMiniScript.g:130:5: (lv_expressions_2_0= ruleExpression )
            	    // InternalMiniScript.g:131:6: lv_expressions_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_2_0,
            	    							"org.arz.MiniScript.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,11,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniScript.g:157:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMiniScript.g:157:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMiniScript.g:158:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMiniScript.g:164:1: ruleExpression returns [EObject current=null] : (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression | this_TernaryExpression_4= ruleTernaryExpression | this_ComparisonExpression_5= ruleComparisonExpression | this_LetExpression_6= ruleLetExpression | this_BlockExpression_7= ruleBlockExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionDeclaration_0 = null;

        EObject this_VariableAssignment_1 = null;

        EObject this_LogicalBinaryExpression_2 = null;

        EObject this_LogicalUnaryExpression_3 = null;

        EObject this_TernaryExpression_4 = null;

        EObject this_ComparisonExpression_5 = null;

        EObject this_LetExpression_6 = null;

        EObject this_BlockExpression_7 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:170:2: ( (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression | this_TernaryExpression_4= ruleTernaryExpression | this_ComparisonExpression_5= ruleComparisonExpression | this_LetExpression_6= ruleLetExpression | this_BlockExpression_7= ruleBlockExpression ) )
            // InternalMiniScript.g:171:2: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression | this_TernaryExpression_4= ruleTernaryExpression | this_ComparisonExpression_5= ruleComparisonExpression | this_LetExpression_6= ruleLetExpression | this_BlockExpression_7= ruleBlockExpression )
            {
            // InternalMiniScript.g:171:2: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression | this_TernaryExpression_4= ruleTernaryExpression | this_ComparisonExpression_5= ruleComparisonExpression | this_LetExpression_6= ruleLetExpression | this_BlockExpression_7= ruleBlockExpression )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMiniScript.g:172:3: this_FunctionDeclaration_0= ruleFunctionDeclaration
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFunctionDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionDeclaration_0=ruleFunctionDeclaration();

                    state._fsp--;


                    			current = this_FunctionDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:181:3: this_VariableAssignment_1= ruleVariableAssignment
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getVariableAssignmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableAssignment_1=ruleVariableAssignment();

                    state._fsp--;


                    			current = this_VariableAssignment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMiniScript.g:190:3: this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLogicalBinaryExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalBinaryExpression_2=ruleLogicalBinaryExpression();

                    state._fsp--;


                    			current = this_LogicalBinaryExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMiniScript.g:199:3: this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLogicalUnaryExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalUnaryExpression_3=ruleLogicalUnaryExpression();

                    state._fsp--;


                    			current = this_LogicalUnaryExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMiniScript.g:208:3: this_TernaryExpression_4= ruleTernaryExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getTernaryExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TernaryExpression_4=ruleTernaryExpression();

                    state._fsp--;


                    			current = this_TernaryExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMiniScript.g:217:3: this_ComparisonExpression_5= ruleComparisonExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getComparisonExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComparisonExpression_5=ruleComparisonExpression();

                    state._fsp--;


                    			current = this_ComparisonExpression_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMiniScript.g:226:3: this_LetExpression_6= ruleLetExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLetExpressionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetExpression_6=ruleLetExpression();

                    state._fsp--;


                    			current = this_LetExpression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMiniScript.g:235:3: this_BlockExpression_7= ruleBlockExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBlockExpressionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_BlockExpression_7=ruleBlockExpression();

                    state._fsp--;


                    			current = this_BlockExpression_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBlockExpression"
    // InternalMiniScript.g:247:1: entryRuleBlockExpression returns [EObject current=null] : iv_ruleBlockExpression= ruleBlockExpression EOF ;
    public final EObject entryRuleBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockExpression = null;


        try {
            // InternalMiniScript.g:247:56: (iv_ruleBlockExpression= ruleBlockExpression EOF )
            // InternalMiniScript.g:248:2: iv_ruleBlockExpression= ruleBlockExpression EOF
            {
             newCompositeNode(grammarAccess.getBlockExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlockExpression=ruleBlockExpression();

            state._fsp--;

             current =iv_ruleBlockExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockExpression"


    // $ANTLR start "ruleBlockExpression"
    // InternalMiniScript.g:254:1: ruleBlockExpression returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_expressions_1_0= ruleExpression ) ) otherlv_2= ';' )+ otherlv_3= '}' ) ;
    public final EObject ruleBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:260:2: ( (otherlv_0= '{' ( ( (lv_expressions_1_0= ruleExpression ) ) otherlv_2= ';' )+ otherlv_3= '}' ) )
            // InternalMiniScript.g:261:2: (otherlv_0= '{' ( ( (lv_expressions_1_0= ruleExpression ) ) otherlv_2= ';' )+ otherlv_3= '}' )
            {
            // InternalMiniScript.g:261:2: (otherlv_0= '{' ( ( (lv_expressions_1_0= ruleExpression ) ) otherlv_2= ';' )+ otherlv_3= '}' )
            // InternalMiniScript.g:262:3: otherlv_0= '{' ( ( (lv_expressions_1_0= ruleExpression ) ) otherlv_2= ';' )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMiniScript.g:266:3: ( ( (lv_expressions_1_0= ruleExpression ) ) otherlv_2= ';' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||LA3_0==12||LA3_0==14||LA3_0==16||LA3_0==18||(LA3_0>=30 && LA3_0<=35)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMiniScript.g:267:4: ( (lv_expressions_1_0= ruleExpression ) ) otherlv_2= ';'
            	    {
            	    // InternalMiniScript.g:267:4: ( (lv_expressions_1_0= ruleExpression ) )
            	    // InternalMiniScript.g:268:5: (lv_expressions_1_0= ruleExpression )
            	    {
            	    // InternalMiniScript.g:268:5: (lv_expressions_1_0= ruleExpression )
            	    // InternalMiniScript.g:269:6: lv_expressions_1_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getBlockExpressionAccess().getExpressionsExpressionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_expressions_1_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_1_0,
            	    							"org.arz.MiniScript.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,11,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockExpression"


    // $ANTLR start "entryRuleLetExpression"
    // InternalMiniScript.g:299:1: entryRuleLetExpression returns [EObject current=null] : iv_ruleLetExpression= ruleLetExpression EOF ;
    public final EObject entryRuleLetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpression = null;


        try {
            // InternalMiniScript.g:299:54: (iv_ruleLetExpression= ruleLetExpression EOF )
            // InternalMiniScript.g:300:2: iv_ruleLetExpression= ruleLetExpression EOF
            {
             newCompositeNode(grammarAccess.getLetExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetExpression=ruleLetExpression();

            state._fsp--;

             current =iv_ruleLetExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetExpression"


    // $ANTLR start "ruleLetExpression"
    // InternalMiniScript.g:306:1: ruleLetExpression returns [EObject current=null] : (otherlv_0= 'let' ( ( (lv_assigment_1_0= ruleVariableAssignment ) ) otherlv_2= ',' ) ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleLetExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_assigment_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:312:2: ( (otherlv_0= 'let' ( ( (lv_assigment_1_0= ruleVariableAssignment ) ) otherlv_2= ',' ) ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalMiniScript.g:313:2: (otherlv_0= 'let' ( ( (lv_assigment_1_0= ruleVariableAssignment ) ) otherlv_2= ',' ) ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalMiniScript.g:313:2: (otherlv_0= 'let' ( ( (lv_assigment_1_0= ruleVariableAssignment ) ) otherlv_2= ',' ) ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalMiniScript.g:314:3: otherlv_0= 'let' ( ( (lv_assigment_1_0= ruleVariableAssignment ) ) otherlv_2= ',' ) ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLetExpressionAccess().getLetKeyword_0());
            		
            // InternalMiniScript.g:318:3: ( ( (lv_assigment_1_0= ruleVariableAssignment ) ) otherlv_2= ',' )
            // InternalMiniScript.g:319:4: ( (lv_assigment_1_0= ruleVariableAssignment ) ) otherlv_2= ','
            {
            // InternalMiniScript.g:319:4: ( (lv_assigment_1_0= ruleVariableAssignment ) )
            // InternalMiniScript.g:320:5: (lv_assigment_1_0= ruleVariableAssignment )
            {
            // InternalMiniScript.g:320:5: (lv_assigment_1_0= ruleVariableAssignment )
            // InternalMiniScript.g:321:6: lv_assigment_1_0= ruleVariableAssignment
            {

            						newCompositeNode(grammarAccess.getLetExpressionAccess().getAssigmentVariableAssignmentParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_8);
            lv_assigment_1_0=ruleVariableAssignment();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getLetExpressionRule());
            						}
            						set(
            							current,
            							"assigment",
            							lv_assigment_1_0,
            							"org.arz.MiniScript.VariableAssignment");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            				newLeafNode(otherlv_2, grammarAccess.getLetExpressionAccess().getCommaKeyword_1_1());
            			

            }

            // InternalMiniScript.g:343:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalMiniScript.g:344:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalMiniScript.g:344:4: (lv_expression_3_0= ruleExpression )
            // InternalMiniScript.g:345:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLetExpressionAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetExpressionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"org.arz.MiniScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetExpression"


    // $ANTLR start "entryRuleTernaryExpression"
    // InternalMiniScript.g:366:1: entryRuleTernaryExpression returns [EObject current=null] : iv_ruleTernaryExpression= ruleTernaryExpression EOF ;
    public final EObject entryRuleTernaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTernaryExpression = null;


        try {
            // InternalMiniScript.g:366:58: (iv_ruleTernaryExpression= ruleTernaryExpression EOF )
            // InternalMiniScript.g:367:2: iv_ruleTernaryExpression= ruleTernaryExpression EOF
            {
             newCompositeNode(grammarAccess.getTernaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTernaryExpression=ruleTernaryExpression();

            state._fsp--;

             current =iv_ruleTernaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTernaryExpression"


    // $ANTLR start "ruleTernaryExpression"
    // InternalMiniScript.g:373:1: ruleTernaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleTernaryOperator ) ) otherlv_1= '(' ( (lv_firstExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_secondExpression_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_thirdExpression_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleTernaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_firstExpression_2_0 = null;

        EObject lv_secondExpression_4_0 = null;

        EObject lv_thirdExpression_6_0 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:379:2: ( ( ( (lv_operator_0_0= ruleTernaryOperator ) ) otherlv_1= '(' ( (lv_firstExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_secondExpression_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_thirdExpression_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // InternalMiniScript.g:380:2: ( ( (lv_operator_0_0= ruleTernaryOperator ) ) otherlv_1= '(' ( (lv_firstExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_secondExpression_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_thirdExpression_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // InternalMiniScript.g:380:2: ( ( (lv_operator_0_0= ruleTernaryOperator ) ) otherlv_1= '(' ( (lv_firstExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_secondExpression_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_thirdExpression_6_0= ruleExpression ) ) otherlv_7= ')' )
            // InternalMiniScript.g:381:3: ( (lv_operator_0_0= ruleTernaryOperator ) ) otherlv_1= '(' ( (lv_firstExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_secondExpression_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_thirdExpression_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            // InternalMiniScript.g:381:3: ( (lv_operator_0_0= ruleTernaryOperator ) )
            // InternalMiniScript.g:382:4: (lv_operator_0_0= ruleTernaryOperator )
            {
            // InternalMiniScript.g:382:4: (lv_operator_0_0= ruleTernaryOperator )
            // InternalMiniScript.g:383:5: lv_operator_0_0= ruleTernaryOperator
            {

            					newCompositeNode(grammarAccess.getTernaryExpressionAccess().getOperatorTernaryOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_operator_0_0=ruleTernaryOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTernaryExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"org.arz.MiniScript.TernaryOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTernaryExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiniScript.g:404:3: ( (lv_firstExpression_2_0= ruleExpression ) )
            // InternalMiniScript.g:405:4: (lv_firstExpression_2_0= ruleExpression )
            {
            // InternalMiniScript.g:405:4: (lv_firstExpression_2_0= ruleExpression )
            // InternalMiniScript.g:406:5: lv_firstExpression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTernaryExpressionAccess().getFirstExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_firstExpression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTernaryExpressionRule());
            					}
            					set(
            						current,
            						"firstExpression",
            						lv_firstExpression_2_0,
            						"org.arz.MiniScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTernaryExpressionAccess().getCommaKeyword_3());
            		
            // InternalMiniScript.g:427:3: ( (lv_secondExpression_4_0= ruleExpression ) )
            // InternalMiniScript.g:428:4: (lv_secondExpression_4_0= ruleExpression )
            {
            // InternalMiniScript.g:428:4: (lv_secondExpression_4_0= ruleExpression )
            // InternalMiniScript.g:429:5: lv_secondExpression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTernaryExpressionAccess().getSecondExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_secondExpression_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTernaryExpressionRule());
            					}
            					set(
            						current,
            						"secondExpression",
            						lv_secondExpression_4_0,
            						"org.arz.MiniScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getTernaryExpressionAccess().getCommaKeyword_5());
            		
            // InternalMiniScript.g:450:3: ( (lv_thirdExpression_6_0= ruleExpression ) )
            // InternalMiniScript.g:451:4: (lv_thirdExpression_6_0= ruleExpression )
            {
            // InternalMiniScript.g:451:4: (lv_thirdExpression_6_0= ruleExpression )
            // InternalMiniScript.g:452:5: lv_thirdExpression_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTernaryExpressionAccess().getThirdExpressionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_thirdExpression_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTernaryExpressionRule());
            					}
            					set(
            						current,
            						"thirdExpression",
            						lv_thirdExpression_6_0,
            						"org.arz.MiniScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTernaryExpressionAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTernaryExpression"


    // $ANTLR start "entryRuleLogicalBinaryExpression"
    // InternalMiniScript.g:477:1: entryRuleLogicalBinaryExpression returns [EObject current=null] : iv_ruleLogicalBinaryExpression= ruleLogicalBinaryExpression EOF ;
    public final EObject entryRuleLogicalBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalBinaryExpression = null;


        try {
            // InternalMiniScript.g:477:64: (iv_ruleLogicalBinaryExpression= ruleLogicalBinaryExpression EOF )
            // InternalMiniScript.g:478:2: iv_ruleLogicalBinaryExpression= ruleLogicalBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalBinaryExpression=ruleLogicalBinaryExpression();

            state._fsp--;

             current =iv_ruleLogicalBinaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalBinaryExpression"


    // $ANTLR start "ruleLogicalBinaryExpression"
    // InternalMiniScript.g:484:1: ruleLogicalBinaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleBinaryLogicalOperator ) ) otherlv_1= '(' ( (lv_leftExpr_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleLogicalBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_leftExpr_2_0 = null;

        EObject lv_rightExpr_4_0 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:490:2: ( ( ( (lv_operator_0_0= ruleBinaryLogicalOperator ) ) otherlv_1= '(' ( (lv_leftExpr_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // InternalMiniScript.g:491:2: ( ( (lv_operator_0_0= ruleBinaryLogicalOperator ) ) otherlv_1= '(' ( (lv_leftExpr_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // InternalMiniScript.g:491:2: ( ( (lv_operator_0_0= ruleBinaryLogicalOperator ) ) otherlv_1= '(' ( (lv_leftExpr_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalMiniScript.g:492:3: ( (lv_operator_0_0= ruleBinaryLogicalOperator ) ) otherlv_1= '(' ( (lv_leftExpr_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpr_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            // InternalMiniScript.g:492:3: ( (lv_operator_0_0= ruleBinaryLogicalOperator ) )
            // InternalMiniScript.g:493:4: (lv_operator_0_0= ruleBinaryLogicalOperator )
            {
            // InternalMiniScript.g:493:4: (lv_operator_0_0= ruleBinaryLogicalOperator )
            // InternalMiniScript.g:494:5: lv_operator_0_0= ruleBinaryLogicalOperator
            {

            					newCompositeNode(grammarAccess.getLogicalBinaryExpressionAccess().getOperatorBinaryLogicalOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_operator_0_0=ruleBinaryLogicalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalBinaryExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"org.arz.MiniScript.BinaryLogicalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLogicalBinaryExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiniScript.g:515:3: ( (lv_leftExpr_2_0= ruleExpression ) )
            // InternalMiniScript.g:516:4: (lv_leftExpr_2_0= ruleExpression )
            {
            // InternalMiniScript.g:516:4: (lv_leftExpr_2_0= ruleExpression )
            // InternalMiniScript.g:517:5: lv_leftExpr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLogicalBinaryExpressionAccess().getLeftExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_leftExpr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalBinaryExpressionRule());
            					}
            					set(
            						current,
            						"leftExpr",
            						lv_leftExpr_2_0,
            						"org.arz.MiniScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalBinaryExpressionAccess().getCommaKeyword_3());
            		
            // InternalMiniScript.g:538:3: ( (lv_rightExpr_4_0= ruleExpression ) )
            // InternalMiniScript.g:539:4: (lv_rightExpr_4_0= ruleExpression )
            {
            // InternalMiniScript.g:539:4: (lv_rightExpr_4_0= ruleExpression )
            // InternalMiniScript.g:540:5: lv_rightExpr_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLogicalBinaryExpressionAccess().getRightExprExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_rightExpr_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalBinaryExpressionRule());
            					}
            					set(
            						current,
            						"rightExpr",
            						lv_rightExpr_4_0,
            						"org.arz.MiniScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLogicalBinaryExpressionAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalBinaryExpression"


    // $ANTLR start "entryRuleLogicalUnaryExpression"
    // InternalMiniScript.g:565:1: entryRuleLogicalUnaryExpression returns [EObject current=null] : iv_ruleLogicalUnaryExpression= ruleLogicalUnaryExpression EOF ;
    public final EObject entryRuleLogicalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalUnaryExpression = null;


        try {
            // InternalMiniScript.g:565:63: (iv_ruleLogicalUnaryExpression= ruleLogicalUnaryExpression EOF )
            // InternalMiniScript.g:566:2: iv_ruleLogicalUnaryExpression= ruleLogicalUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalUnaryExpression=ruleLogicalUnaryExpression();

            state._fsp--;

             current =iv_ruleLogicalUnaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalUnaryExpression"


    // $ANTLR start "ruleLogicalUnaryExpression"
    // InternalMiniScript.g:572:1: ruleLogicalUnaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleLogicalUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:578:2: ( ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalMiniScript.g:579:2: ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalMiniScript.g:579:2: ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalMiniScript.g:580:3: ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // InternalMiniScript.g:580:3: ( (lv_operator_0_0= ruleUnaryLogicalOperator ) )
            // InternalMiniScript.g:581:4: (lv_operator_0_0= ruleUnaryLogicalOperator )
            {
            // InternalMiniScript.g:581:4: (lv_operator_0_0= ruleUnaryLogicalOperator )
            // InternalMiniScript.g:582:5: lv_operator_0_0= ruleUnaryLogicalOperator
            {

            					newCompositeNode(grammarAccess.getLogicalUnaryExpressionAccess().getOperatorUnaryLogicalOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_operator_0_0=ruleUnaryLogicalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalUnaryExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"org.arz.MiniScript.UnaryLogicalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLogicalUnaryExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiniScript.g:603:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalMiniScript.g:604:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalMiniScript.g:604:4: (lv_expression_2_0= ruleExpression )
            // InternalMiniScript.g:605:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLogicalUnaryExpressionAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicalUnaryExpressionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.arz.MiniScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLogicalUnaryExpressionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalUnaryExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalMiniScript.g:630:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalMiniScript.g:630:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalMiniScript.g:631:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalMiniScript.g:637:1: ruleComparisonExpression returns [EObject current=null] : (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpr_3_0 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:643:2: ( (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? ) )
            // InternalMiniScript.g:644:2: (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? )
            {
            // InternalMiniScript.g:644:2: (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? )
            // InternalMiniScript.g:645:3: this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getNumericExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_NumericExpression_0=ruleNumericExpression();

            state._fsp--;


            			current = this_NumericExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniScript.g:653:3: ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=24 && LA4_0<=29)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMiniScript.g:654:4: () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) )
                    {
                    // InternalMiniScript.g:654:4: ()
                    // InternalMiniScript.g:655:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMiniScript.g:661:4: ( (lv_operator_2_0= ruleComparisonOperator ) )
                    // InternalMiniScript.g:662:5: (lv_operator_2_0= ruleComparisonOperator )
                    {
                    // InternalMiniScript.g:662:5: (lv_operator_2_0= ruleComparisonOperator )
                    // InternalMiniScript.g:663:6: lv_operator_2_0= ruleComparisonOperator
                    {

                    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_operator_2_0=ruleComparisonOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_2_0,
                    							"org.arz.MiniScript.ComparisonOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiniScript.g:680:4: ( (lv_rightExpr_3_0= ruleNumericExpression ) )
                    // InternalMiniScript.g:681:5: (lv_rightExpr_3_0= ruleNumericExpression )
                    {
                    // InternalMiniScript.g:681:5: (lv_rightExpr_3_0= ruleNumericExpression )
                    // InternalMiniScript.g:682:6: lv_rightExpr_3_0= ruleNumericExpression
                    {

                    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightExprNumericExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rightExpr_3_0=ruleNumericExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    						}
                    						set(
                    							current,
                    							"rightExpr",
                    							lv_rightExpr_3_0,
                    							"org.arz.MiniScript.NumericExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // InternalMiniScript.g:704:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // InternalMiniScript.g:704:60: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // InternalMiniScript.g:705:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;

             current =iv_ruleFunctionDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalMiniScript.g:711:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleExpression ) ) ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_parameters_2_0=null;
        Token otherlv_3=null;
        Token lv_parameters_4_0=null;
        Token otherlv_5=null;
        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:717:2: ( (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleExpression ) ) ) )
            // InternalMiniScript.g:718:2: (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleExpression ) ) )
            {
            // InternalMiniScript.g:718:2: (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleExpression ) ) )
            // InternalMiniScript.g:719:3: otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMiniScript.g:727:3: ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMiniScript.g:728:4: ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
                    {
                    // InternalMiniScript.g:728:4: ( (lv_parameters_2_0= RULE_ID ) )
                    // InternalMiniScript.g:729:5: (lv_parameters_2_0= RULE_ID )
                    {
                    // InternalMiniScript.g:729:5: (lv_parameters_2_0= RULE_ID )
                    // InternalMiniScript.g:730:6: lv_parameters_2_0= RULE_ID
                    {
                    lv_parameters_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_parameters_2_0, grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"parameters",
                    							lv_parameters_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMiniScript.g:746:4: (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMiniScript.g:747:5: otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMiniScript.g:751:5: ( (lv_parameters_4_0= RULE_ID ) )
                    	    // InternalMiniScript.g:752:6: (lv_parameters_4_0= RULE_ID )
                    	    {
                    	    // InternalMiniScript.g:752:6: (lv_parameters_4_0= RULE_ID )
                    	    // InternalMiniScript.g:753:7: lv_parameters_4_0= RULE_ID
                    	    {
                    	    lv_parameters_4_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    	    							newLeafNode(lv_parameters_4_0, grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_4_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3());
            		
            // InternalMiniScript.g:775:3: ( (lv_body_6_0= ruleExpression ) )
            // InternalMiniScript.g:776:4: (lv_body_6_0= ruleExpression )
            {
            // InternalMiniScript.g:776:4: (lv_body_6_0= ruleExpression )
            // InternalMiniScript.g:777:5: lv_body_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"org.arz.MiniScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleSymbolReference"
    // InternalMiniScript.g:798:1: entryRuleSymbolReference returns [EObject current=null] : iv_ruleSymbolReference= ruleSymbolReference EOF ;
    public final EObject entryRuleSymbolReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolReference = null;


        try {
            // InternalMiniScript.g:798:56: (iv_ruleSymbolReference= ruleSymbolReference EOF )
            // InternalMiniScript.g:799:2: iv_ruleSymbolReference= ruleSymbolReference EOF
            {
             newCompositeNode(grammarAccess.getSymbolReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSymbolReference=ruleSymbolReference();

            state._fsp--;

             current =iv_ruleSymbolReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbolReference"


    // $ANTLR start "ruleSymbolReference"
    // InternalMiniScript.g:805:1: ruleSymbolReference returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleSymbolReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMiniScript.g:811:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMiniScript.g:812:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMiniScript.g:812:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMiniScript.g:813:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMiniScript.g:813:3: (lv_id_0_0= RULE_ID )
            // InternalMiniScript.g:814:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getSymbolReferenceAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSymbolReferenceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"id",
            					lv_id_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbolReference"


    // $ANTLR start "entryRuleNumericExpression"
    // InternalMiniScript.g:833:1: entryRuleNumericExpression returns [EObject current=null] : iv_ruleNumericExpression= ruleNumericExpression EOF ;
    public final EObject entryRuleNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericExpression = null;


        try {
            // InternalMiniScript.g:833:58: (iv_ruleNumericExpression= ruleNumericExpression EOF )
            // InternalMiniScript.g:834:2: iv_ruleNumericExpression= ruleNumericExpression EOF
            {
             newCompositeNode(grammarAccess.getNumericExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericExpression=ruleNumericExpression();

            state._fsp--;

             current =iv_ruleNumericExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericExpression"


    // $ANTLR start "ruleNumericExpression"
    // InternalMiniScript.g:840:1: ruleNumericExpression returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Factor_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightFactor_3_0 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:846:2: ( (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* ) )
            // InternalMiniScript.g:847:2: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* )
            {
            // InternalMiniScript.g:847:2: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* )
            // InternalMiniScript.g:848:3: this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getNumericExpressionAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniScript.g:856:3: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMiniScript.g:857:4: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) )
            	    {
            	    // InternalMiniScript.g:857:4: ()
            	    // InternalMiniScript.g:858:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMiniScript.g:864:4: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // InternalMiniScript.g:865:5: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // InternalMiniScript.g:865:5: (lv_operator_2_0= ruleAdditionOperator )
            	    // InternalMiniScript.g:866:6: lv_operator_2_0= ruleAdditionOperator
            	    {

            	    						newCompositeNode(grammarAccess.getNumericExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_operator_2_0=ruleAdditionOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNumericExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.arz.MiniScript.AdditionOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMiniScript.g:883:4: ( (lv_rightFactor_3_0= ruleFactor ) )
            	    // InternalMiniScript.g:884:5: (lv_rightFactor_3_0= ruleFactor )
            	    {
            	    // InternalMiniScript.g:884:5: (lv_rightFactor_3_0= ruleFactor )
            	    // InternalMiniScript.g:885:6: lv_rightFactor_3_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getNumericExpressionAccess().getRightFactorFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_rightFactor_3_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNumericExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightFactor",
            	    							lv_rightFactor_3_0,
            	    							"org.arz.MiniScript.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericExpression"


    // $ANTLR start "entryRuleFactor"
    // InternalMiniScript.g:907:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMiniScript.g:907:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMiniScript.g:908:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMiniScript.g:914:1: ruleFactor returns [EObject current=null] : (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject this_Term_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightTerm_3_0 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:920:2: ( (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* ) )
            // InternalMiniScript.g:921:2: (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* )
            {
            // InternalMiniScript.g:921:2: (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* )
            // InternalMiniScript.g:922:3: this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniScript.g:930:3: ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=22 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMiniScript.g:931:4: () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) )
            	    {
            	    // InternalMiniScript.g:931:4: ()
            	    // InternalMiniScript.g:932:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMiniScript.g:938:4: ( (lv_operator_2_0= ruleFactorOperator ) )
            	    // InternalMiniScript.g:939:5: (lv_operator_2_0= ruleFactorOperator )
            	    {
            	    // InternalMiniScript.g:939:5: (lv_operator_2_0= ruleFactorOperator )
            	    // InternalMiniScript.g:940:6: lv_operator_2_0= ruleFactorOperator
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getOperatorFactorOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_operator_2_0=ruleFactorOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.arz.MiniScript.FactorOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMiniScript.g:957:4: ( (lv_rightTerm_3_0= ruleTerm ) )
            	    // InternalMiniScript.g:958:5: (lv_rightTerm_3_0= ruleTerm )
            	    {
            	    // InternalMiniScript.g:958:5: (lv_rightTerm_3_0= ruleTerm )
            	    // InternalMiniScript.g:959:6: lv_rightTerm_3_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightTermTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_rightTerm_3_0=ruleTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightTerm",
            	    							lv_rightTerm_3_0,
            	    							"org.arz.MiniScript.Term");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleTerm"
    // InternalMiniScript.g:981:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalMiniScript.g:981:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalMiniScript.g:982:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMiniScript.g:988:1: ruleTerm returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_Apply_1= ruleApply ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpression_0 = null;

        EObject this_Apply_1 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:994:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_Apply_1= ruleApply ) )
            // InternalMiniScript.g:995:2: (this_LiteralExpression_0= ruleLiteralExpression | this_Apply_1= ruleApply )
            {
            // InternalMiniScript.g:995:2: (this_LiteralExpression_0= ruleLiteralExpression | this_Apply_1= ruleApply )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||(LA9_0>=34 && LA9_0<=35)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID||LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMiniScript.g:996:3: this_LiteralExpression_0= ruleLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getLiteralExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_0=ruleLiteralExpression();

                    state._fsp--;


                    			current = this_LiteralExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:1005:3: this_Apply_1= ruleApply
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getApplyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Apply_1=ruleApply();

                    state._fsp--;


                    			current = this_Apply_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleApply"
    // InternalMiniScript.g:1017:1: entryRuleApply returns [EObject current=null] : iv_ruleApply= ruleApply EOF ;
    public final EObject entryRuleApply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApply = null;


        try {
            // InternalMiniScript.g:1017:46: (iv_ruleApply= ruleApply EOF )
            // InternalMiniScript.g:1018:2: iv_ruleApply= ruleApply EOF
            {
             newCompositeNode(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApply=ruleApply();

            state._fsp--;

             current =iv_ruleApply; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApply"


    // $ANTLR start "ruleApply"
    // InternalMiniScript.g:1024:1: ruleApply returns [EObject current=null] : (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* ) ;
    public final EObject ruleApply() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Functor_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:1030:2: ( (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* ) )
            // InternalMiniScript.g:1031:2: (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* )
            {
            // InternalMiniScript.g:1031:2: (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* )
            // InternalMiniScript.g:1032:3: this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )*
            {

            			newCompositeNode(grammarAccess.getApplyAccess().getFunctorParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Functor_0=ruleFunctor();

            state._fsp--;


            			current = this_Functor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMiniScript.g:1040:3: ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMiniScript.g:1041:4: () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
            	    {
            	    // InternalMiniScript.g:1041:4: ()
            	    // InternalMiniScript.g:1042:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getApplyAccess().getApplyFunctorAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getApplyAccess().getLeftParenthesisKeyword_1_1());
            	    			
            	    // InternalMiniScript.g:1052:4: ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||LA11_0==12||LA11_0==14||LA11_0==16||LA11_0==18||(LA11_0>=30 && LA11_0<=35)) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalMiniScript.g:1053:5: ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
            	            {
            	            // InternalMiniScript.g:1053:5: ( (lv_arguments_3_0= ruleExpression ) )
            	            // InternalMiniScript.g:1054:6: (lv_arguments_3_0= ruleExpression )
            	            {
            	            // InternalMiniScript.g:1054:6: (lv_arguments_3_0= ruleExpression )
            	            // InternalMiniScript.g:1055:7: lv_arguments_3_0= ruleExpression
            	            {

            	            							newCompositeNode(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_0_0());
            	            						
            	            pushFollow(FOLLOW_14);
            	            lv_arguments_3_0=ruleExpression();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getApplyRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_3_0,
            	            								"org.arz.MiniScript.Expression");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }

            	            // InternalMiniScript.g:1072:5: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
            	            loop10:
            	            do {
            	                int alt10=2;
            	                int LA10_0 = input.LA(1);

            	                if ( (LA10_0==15) ) {
            	                    alt10=1;
            	                }


            	                switch (alt10) {
            	            	case 1 :
            	            	    // InternalMiniScript.g:1073:6: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
            	            	    {
            	            	    otherlv_4=(Token)match(input,15,FOLLOW_5); 

            	            	    						newLeafNode(otherlv_4, grammarAccess.getApplyAccess().getCommaKeyword_1_2_1_0());
            	            	    					
            	            	    // InternalMiniScript.g:1077:6: ( (lv_arguments_5_0= ruleExpression ) )
            	            	    // InternalMiniScript.g:1078:7: (lv_arguments_5_0= ruleExpression )
            	            	    {
            	            	    // InternalMiniScript.g:1078:7: (lv_arguments_5_0= ruleExpression )
            	            	    // InternalMiniScript.g:1079:8: lv_arguments_5_0= ruleExpression
            	            	    {

            	            	    								newCompositeNode(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_1_1_0());
            	            	    							
            	            	    pushFollow(FOLLOW_14);
            	            	    lv_arguments_5_0=ruleExpression();

            	            	    state._fsp--;


            	            	    								if (current==null) {
            	            	    									current = createModelElementForParent(grammarAccess.getApplyRule());
            	            	    								}
            	            	    								add(
            	            	    									current,
            	            	    									"arguments",
            	            	    									lv_arguments_5_0,
            	            	    									"org.arz.MiniScript.Expression");
            	            	    								afterParserOrEnumRuleCall();
            	            	    							

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop10;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,17,FOLLOW_17); 

            	    				newLeafNode(otherlv_6, grammarAccess.getApplyAccess().getRightParenthesisKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApply"


    // $ANTLR start "entryRuleFunctor"
    // InternalMiniScript.g:1107:1: entryRuleFunctor returns [EObject current=null] : iv_ruleFunctor= ruleFunctor EOF ;
    public final EObject entryRuleFunctor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctor = null;


        try {
            // InternalMiniScript.g:1107:48: (iv_ruleFunctor= ruleFunctor EOF )
            // InternalMiniScript.g:1108:2: iv_ruleFunctor= ruleFunctor EOF
            {
             newCompositeNode(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctor=ruleFunctor();

            state._fsp--;

             current =iv_ruleFunctor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctor"


    // $ANTLR start "ruleFunctor"
    // InternalMiniScript.g:1114:1: ruleFunctor returns [EObject current=null] : (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression ) ;
    public final EObject ruleFunctor() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolReference_0 = null;

        EObject this_ParenthesisExpression_1 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:1120:2: ( (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression ) )
            // InternalMiniScript.g:1121:2: (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression )
            {
            // InternalMiniScript.g:1121:2: (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==16) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMiniScript.g:1122:3: this_SymbolReference_0= ruleSymbolReference
                    {

                    			newCompositeNode(grammarAccess.getFunctorAccess().getSymbolReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SymbolReference_0=ruleSymbolReference();

                    state._fsp--;


                    			current = this_SymbolReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:1131:3: this_ParenthesisExpression_1= ruleParenthesisExpression
                    {

                    			newCompositeNode(grammarAccess.getFunctorAccess().getParenthesisExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParenthesisExpression_1=ruleParenthesisExpression();

                    state._fsp--;


                    			current = this_ParenthesisExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctor"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalMiniScript.g:1143:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalMiniScript.g:1143:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalMiniScript.g:1144:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalMiniScript.g:1150:1: ruleLiteralExpression returns [EObject current=null] : (this_LiteralNumber_0= ruleLiteralNumber | this_LiteralBoolean_1= ruleLiteralBoolean ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralNumber_0 = null;

        EObject this_LiteralBoolean_1 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:1156:2: ( (this_LiteralNumber_0= ruleLiteralNumber | this_LiteralBoolean_1= ruleLiteralBoolean ) )
            // InternalMiniScript.g:1157:2: (this_LiteralNumber_0= ruleLiteralNumber | this_LiteralBoolean_1= ruleLiteralBoolean )
            {
            // InternalMiniScript.g:1157:2: (this_LiteralNumber_0= ruleLiteralNumber | this_LiteralBoolean_1= ruleLiteralBoolean )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=34 && LA14_0<=35)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMiniScript.g:1158:3: this_LiteralNumber_0= ruleLiteralNumber
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralNumber_0=ruleLiteralNumber();

                    state._fsp--;


                    			current = this_LiteralNumber_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:1167:3: this_LiteralBoolean_1= ruleLiteralBoolean
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralBoolean_1=ruleLiteralBoolean();

                    state._fsp--;


                    			current = this_LiteralBoolean_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleLiteralBoolean"
    // InternalMiniScript.g:1179:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // InternalMiniScript.g:1179:55: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // InternalMiniScript.g:1180:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
             newCompositeNode(grammarAccess.getLiteralBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();

            state._fsp--;

             current =iv_ruleLiteralBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // InternalMiniScript.g:1186:1: ruleLiteralBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanValue ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:1192:2: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
            // InternalMiniScript.g:1193:2: ( (lv_value_0_0= ruleBooleanValue ) )
            {
            // InternalMiniScript.g:1193:2: ( (lv_value_0_0= ruleBooleanValue ) )
            // InternalMiniScript.g:1194:3: (lv_value_0_0= ruleBooleanValue )
            {
            // InternalMiniScript.g:1194:3: (lv_value_0_0= ruleBooleanValue )
            // InternalMiniScript.g:1195:4: lv_value_0_0= ruleBooleanValue
            {

            				newCompositeNode(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBooleanValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLiteralBooleanRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.arz.MiniScript.BooleanValue");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleLiteralNumber"
    // InternalMiniScript.g:1215:1: entryRuleLiteralNumber returns [EObject current=null] : iv_ruleLiteralNumber= ruleLiteralNumber EOF ;
    public final EObject entryRuleLiteralNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNumber = null;


        try {
            // InternalMiniScript.g:1215:54: (iv_ruleLiteralNumber= ruleLiteralNumber EOF )
            // InternalMiniScript.g:1216:2: iv_ruleLiteralNumber= ruleLiteralNumber EOF
            {
             newCompositeNode(grammarAccess.getLiteralNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralNumber=ruleLiteralNumber();

            state._fsp--;

             current =iv_ruleLiteralNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralNumber"


    // $ANTLR start "ruleLiteralNumber"
    // InternalMiniScript.g:1222:1: ruleLiteralNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleLiteralNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMiniScript.g:1228:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMiniScript.g:1229:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMiniScript.g:1229:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMiniScript.g:1230:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMiniScript.g:1230:3: (lv_value_0_0= RULE_INT )
            // InternalMiniScript.g:1231:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getLiteralNumberAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLiteralNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralNumber"


    // $ANTLR start "entryRuleVariableAssignment"
    // InternalMiniScript.g:1250:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // InternalMiniScript.g:1250:59: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // InternalMiniScript.g:1251:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableAssignment"


    // $ANTLR start "ruleVariableAssignment"
    // InternalMiniScript.g:1257:1: ruleVariableAssignment returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:1263:2: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalMiniScript.g:1264:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalMiniScript.g:1264:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalMiniScript.g:1265:3: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalMiniScript.g:1265:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalMiniScript.g:1266:4: (lv_id_0_0= RULE_ID )
            {
            // InternalMiniScript.g:1266:4: (lv_id_0_0= RULE_ID )
            // InternalMiniScript.g:1267:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_id_0_0, grammarAccess.getVariableAssignmentAccess().getIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalMiniScript.g:1287:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalMiniScript.g:1288:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalMiniScript.g:1288:4: (lv_expression_2_0= ruleExpression )
            // InternalMiniScript.g:1289:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.arz.MiniScript.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableAssignment"


    // $ANTLR start "entryRuleParenthesisExpression"
    // InternalMiniScript.g:1310:1: entryRuleParenthesisExpression returns [EObject current=null] : iv_ruleParenthesisExpression= ruleParenthesisExpression EOF ;
    public final EObject entryRuleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisExpression = null;


        try {
            // InternalMiniScript.g:1310:62: (iv_ruleParenthesisExpression= ruleParenthesisExpression EOF )
            // InternalMiniScript.g:1311:2: iv_ruleParenthesisExpression= ruleParenthesisExpression EOF
            {
             newCompositeNode(grammarAccess.getParenthesisExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesisExpression=ruleParenthesisExpression();

            state._fsp--;

             current =iv_ruleParenthesisExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesisExpression"


    // $ANTLR start "ruleParenthesisExpression"
    // InternalMiniScript.g:1317:1: ruleParenthesisExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalMiniScript.g:1323:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // InternalMiniScript.g:1324:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // InternalMiniScript.g:1324:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // InternalMiniScript.g:1325:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            this_Expression_1=ruleExpression();

            state._fsp--;


            			current = this_Expression_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesisExpression"


    // $ANTLR start "ruleAdditionOperator"
    // InternalMiniScript.g:1345:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMiniScript.g:1351:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalMiniScript.g:1352:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalMiniScript.g:1352:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            else if ( (LA15_0==21) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMiniScript.g:1353:3: (enumLiteral_0= '+' )
                    {
                    // InternalMiniScript.g:1353:3: (enumLiteral_0= '+' )
                    // InternalMiniScript.g:1354:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:1361:3: (enumLiteral_1= '-' )
                    {
                    // InternalMiniScript.g:1361:3: (enumLiteral_1= '-' )
                    // InternalMiniScript.g:1362:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getAdditionOperatorAccess().getSubtractEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAdditionOperatorAccess().getSubtractEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "ruleFactorOperator"
    // InternalMiniScript.g:1372:1: ruleFactorOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleFactorOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMiniScript.g:1378:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // InternalMiniScript.g:1379:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // InternalMiniScript.g:1379:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            else if ( (LA16_0==23) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMiniScript.g:1380:3: (enumLiteral_0= '*' )
                    {
                    // InternalMiniScript.g:1380:3: (enumLiteral_0= '*' )
                    // InternalMiniScript.g:1381:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getFactorOperatorAccess().getMultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFactorOperatorAccess().getMultEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:1388:3: (enumLiteral_1= '/' )
                    {
                    // InternalMiniScript.g:1388:3: (enumLiteral_1= '/' )
                    // InternalMiniScript.g:1389:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getFactorOperatorAccess().getDivisionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFactorOperatorAccess().getDivisionEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactorOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalMiniScript.g:1399:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMiniScript.g:1405:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // InternalMiniScript.g:1406:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalMiniScript.g:1406:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt17=1;
                }
                break;
            case 25:
                {
                alt17=2;
                }
                break;
            case 26:
                {
                alt17=3;
                }
                break;
            case 27:
                {
                alt17=4;
                }
                break;
            case 28:
                {
                alt17=5;
                }
                break;
            case 29:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMiniScript.g:1407:3: (enumLiteral_0= '>' )
                    {
                    // InternalMiniScript.g:1407:3: (enumLiteral_0= '>' )
                    // InternalMiniScript.g:1408:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGtEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getGtEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:1415:3: (enumLiteral_1= '>=' )
                    {
                    // InternalMiniScript.g:1415:3: (enumLiteral_1= '>=' )
                    // InternalMiniScript.g:1416:4: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGteEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniScript.g:1423:3: (enumLiteral_2= '<' )
                    {
                    // InternalMiniScript.g:1423:3: (enumLiteral_2= '<' )
                    // InternalMiniScript.g:1424:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLtEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniScript.g:1431:3: (enumLiteral_3= '<=' )
                    {
                    // InternalMiniScript.g:1431:3: (enumLiteral_3= '<=' )
                    // InternalMiniScript.g:1432:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getLteEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniScript.g:1439:3: (enumLiteral_4= '==' )
                    {
                    // InternalMiniScript.g:1439:3: (enumLiteral_4= '==' )
                    // InternalMiniScript.g:1440:4: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getEqEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getEqEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniScript.g:1447:3: (enumLiteral_5= '!=' )
                    {
                    // InternalMiniScript.g:1447:3: (enumLiteral_5= '!=' )
                    // InternalMiniScript.g:1448:4: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getNoteqEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getNoteqEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleUnaryLogicalOperator"
    // InternalMiniScript.g:1458:1: ruleUnaryLogicalOperator returns [Enumerator current=null] : (enumLiteral_0= 'not' ) ;
    public final Enumerator ruleUnaryLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMiniScript.g:1464:2: ( (enumLiteral_0= 'not' ) )
            // InternalMiniScript.g:1465:2: (enumLiteral_0= 'not' )
            {
            // InternalMiniScript.g:1465:2: (enumLiteral_0= 'not' )
            // InternalMiniScript.g:1466:3: enumLiteral_0= 'not'
            {
            enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

            			current = grammarAccess.getUnaryLogicalOperatorAccess().getNotEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getUnaryLogicalOperatorAccess().getNotEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryLogicalOperator"


    // $ANTLR start "ruleBinaryLogicalOperator"
    // InternalMiniScript.g:1475:1: ruleBinaryLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleBinaryLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMiniScript.g:1481:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalMiniScript.g:1482:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalMiniScript.g:1482:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            else if ( (LA18_0==32) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMiniScript.g:1483:3: (enumLiteral_0= 'and' )
                    {
                    // InternalMiniScript.g:1483:3: (enumLiteral_0= 'and' )
                    // InternalMiniScript.g:1484:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getBinaryLogicalOperatorAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBinaryLogicalOperatorAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:1491:3: (enumLiteral_1= 'or' )
                    {
                    // InternalMiniScript.g:1491:3: (enumLiteral_1= 'or' )
                    // InternalMiniScript.g:1492:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getBinaryLogicalOperatorAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBinaryLogicalOperatorAccess().getOrEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryLogicalOperator"


    // $ANTLR start "ruleTernaryOperator"
    // InternalMiniScript.g:1502:1: ruleTernaryOperator returns [Enumerator current=null] : (enumLiteral_0= 'if' ) ;
    public final Enumerator ruleTernaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMiniScript.g:1508:2: ( (enumLiteral_0= 'if' ) )
            // InternalMiniScript.g:1509:2: (enumLiteral_0= 'if' )
            {
            // InternalMiniScript.g:1509:2: (enumLiteral_0= 'if' )
            // InternalMiniScript.g:1510:3: enumLiteral_0= 'if'
            {
            enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

            			current = grammarAccess.getTernaryOperatorAccess().getIfExpressionEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getTernaryOperatorAccess().getIfExpressionEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTernaryOperator"


    // $ANTLR start "ruleBooleanValue"
    // InternalMiniScript.g:1519:1: ruleBooleanValue returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMiniScript.g:1525:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalMiniScript.g:1526:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalMiniScript.g:1526:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            else if ( (LA19_0==35) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMiniScript.g:1527:3: (enumLiteral_0= 'true' )
                    {
                    // InternalMiniScript.g:1527:3: (enumLiteral_0= 'true' )
                    // InternalMiniScript.g:1528:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniScript.g:1535:3: (enumLiteral_1= 'false' )
                    {
                    // InternalMiniScript.g:1535:3: (enumLiteral_1= 'false' )
                    // InternalMiniScript.g:1536:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\6\7\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\13\7\uffff";
    static final String dfa_4s = "\1\43\1\uffff\1\35\7\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\2";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\6\6\uffff\1\10\1\uffff\1\7\1\uffff\1\6\1\uffff\1\1\13\uffff\1\4\2\3\1\5\2\6",
            "",
            "\1\6\3\uffff\3\6\1\uffff\1\11\12\6",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "171:2: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression | this_TernaryExpression_4= ruleTernaryExpression | this_ComparisonExpression_5= ruleComparisonExpression | this_LetExpression_6= ruleLetExpression | this_BlockExpression_7= ruleBlockExpression )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000FC0055032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000FC0055030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000FC0057030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000003F000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000C00010030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000FC0075030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});

}