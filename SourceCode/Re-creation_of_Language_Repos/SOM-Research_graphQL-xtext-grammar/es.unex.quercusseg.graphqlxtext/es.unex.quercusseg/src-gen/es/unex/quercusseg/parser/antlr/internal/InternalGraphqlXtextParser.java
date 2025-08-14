package es.unex.quercusseg.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.unex.quercusseg.services.GraphqlXtextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphqlXtextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_BOOLEANVALUE", "RULE_NULLVALUE", "RULE_DIGIT", "RULE_STRING", "RULE_COMMA", "RULE_COMMENT", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'query'", "'mutation'", "'{'", "'}'", "':'", "'...'", "'fragment'", "'on'", "'['", "']'", "'$'", "'='", "'!'", "'@'"
    };
    public static final int RULE_NAME=4;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_NULLVALUE=6;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=12;
    public static final int RULE_COMMA=9;
    public static final int RULE_WS=15;
    public static final int RULE_DIGIT=7;
    public static final int RULE_COMMENT=10;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_BOOLEANVALUE=5;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGraphqlXtextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphqlXtextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphqlXtextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGraphqlXtext.g"; }



     	private GraphqlXtextGrammarAccess grammarAccess;

        public InternalGraphqlXtextParser(TokenStream input, GraphqlXtextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Document";
       	}

       	@Override
       	protected GraphqlXtextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDocument"
    // InternalGraphqlXtext.g:64:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalGraphqlXtext.g:64:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalGraphqlXtext.g:65:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalGraphqlXtext.g:71:1: ruleDocument returns [EObject current=null] : ( (lv_defs_0_0= ruleDefinition ) )* ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_defs_0_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:77:2: ( ( (lv_defs_0_0= ruleDefinition ) )* )
            // InternalGraphqlXtext.g:78:2: ( (lv_defs_0_0= ruleDefinition ) )*
            {
            // InternalGraphqlXtext.g:78:2: ( (lv_defs_0_0= ruleDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=19 && LA1_0<=21)||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGraphqlXtext.g:79:3: (lv_defs_0_0= ruleDefinition )
            	    {
            	    // InternalGraphqlXtext.g:79:3: (lv_defs_0_0= ruleDefinition )
            	    // InternalGraphqlXtext.g:80:4: lv_defs_0_0= ruleDefinition
            	    {

            	    				newCompositeNode(grammarAccess.getDocumentAccess().getDefsDefinitionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_defs_0_0=ruleDefinition();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    				}
            	    				add(
            	    					current,
            	    					"defs",
            	    					lv_defs_0_0,
            	    					"es.unex.quercusseg.GraphqlXtext.Definition");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleDefinition"
    // InternalGraphqlXtext.g:100:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalGraphqlXtext.g:100:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalGraphqlXtext.g:101:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalGraphqlXtext.g:107:1: ruleDefinition returns [EObject current=null] : (this_OperationDefinition_0= ruleOperationDefinition | this_FragmentDefinition_1= ruleFragmentDefinition ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_OperationDefinition_0 = null;

        EObject this_FragmentDefinition_1 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:113:2: ( (this_OperationDefinition_0= ruleOperationDefinition | this_FragmentDefinition_1= ruleFragmentDefinition ) )
            // InternalGraphqlXtext.g:114:2: (this_OperationDefinition_0= ruleOperationDefinition | this_FragmentDefinition_1= ruleFragmentDefinition )
            {
            // InternalGraphqlXtext.g:114:2: (this_OperationDefinition_0= ruleOperationDefinition | this_FragmentDefinition_1= ruleFragmentDefinition )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=19 && LA2_0<=21)) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGraphqlXtext.g:115:3: this_OperationDefinition_0= ruleOperationDefinition
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getOperationDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationDefinition_0=ruleOperationDefinition();

                    state._fsp--;


                    			current = this_OperationDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:124:3: this_FragmentDefinition_1= ruleFragmentDefinition
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getFragmentDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FragmentDefinition_1=ruleFragmentDefinition();

                    state._fsp--;


                    			current = this_FragmentDefinition_1;
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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleOperationDefinition"
    // InternalGraphqlXtext.g:136:1: entryRuleOperationDefinition returns [EObject current=null] : iv_ruleOperationDefinition= ruleOperationDefinition EOF ;
    public final EObject entryRuleOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDefinition = null;


        try {
            // InternalGraphqlXtext.g:136:60: (iv_ruleOperationDefinition= ruleOperationDefinition EOF )
            // InternalGraphqlXtext.g:137:2: iv_ruleOperationDefinition= ruleOperationDefinition EOF
            {
             newCompositeNode(grammarAccess.getOperationDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDefinition=ruleOperationDefinition();

            state._fsp--;

             current =iv_ruleOperationDefinition; 
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
    // $ANTLR end "entryRuleOperationDefinition"


    // $ANTLR start "ruleOperationDefinition"
    // InternalGraphqlXtext.g:143:1: ruleOperationDefinition returns [EObject current=null] : ( ( (lv_selection_0_0= ruleSelectionSet ) ) | ( ( (lv_opType_1_0= ruleOperationType ) ) ( (lv_name_2_0= RULE_NAME ) )? (otherlv_3= '(' ( (lv_varDefinitions_4_0= ruleVariableDefinition ) )+ otherlv_5= ')' )? ( (lv_directives_6_0= ruleDirective ) )* ( (lv_selectionSet_7_0= ruleSelectionSet ) ) ) ) ;
    public final EObject ruleOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_selection_0_0 = null;

        AntlrDatatypeRuleToken lv_opType_1_0 = null;

        EObject lv_varDefinitions_4_0 = null;

        EObject lv_directives_6_0 = null;

        EObject lv_selectionSet_7_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:149:2: ( ( ( (lv_selection_0_0= ruleSelectionSet ) ) | ( ( (lv_opType_1_0= ruleOperationType ) ) ( (lv_name_2_0= RULE_NAME ) )? (otherlv_3= '(' ( (lv_varDefinitions_4_0= ruleVariableDefinition ) )+ otherlv_5= ')' )? ( (lv_directives_6_0= ruleDirective ) )* ( (lv_selectionSet_7_0= ruleSelectionSet ) ) ) ) )
            // InternalGraphqlXtext.g:150:2: ( ( (lv_selection_0_0= ruleSelectionSet ) ) | ( ( (lv_opType_1_0= ruleOperationType ) ) ( (lv_name_2_0= RULE_NAME ) )? (otherlv_3= '(' ( (lv_varDefinitions_4_0= ruleVariableDefinition ) )+ otherlv_5= ')' )? ( (lv_directives_6_0= ruleDirective ) )* ( (lv_selectionSet_7_0= ruleSelectionSet ) ) ) )
            {
            // InternalGraphqlXtext.g:150:2: ( ( (lv_selection_0_0= ruleSelectionSet ) ) | ( ( (lv_opType_1_0= ruleOperationType ) ) ( (lv_name_2_0= RULE_NAME ) )? (otherlv_3= '(' ( (lv_varDefinitions_4_0= ruleVariableDefinition ) )+ otherlv_5= ')' )? ( (lv_directives_6_0= ruleDirective ) )* ( (lv_selectionSet_7_0= ruleSelectionSet ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=19 && LA7_0<=20)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGraphqlXtext.g:151:3: ( (lv_selection_0_0= ruleSelectionSet ) )
                    {
                    // InternalGraphqlXtext.g:151:3: ( (lv_selection_0_0= ruleSelectionSet ) )
                    // InternalGraphqlXtext.g:152:4: (lv_selection_0_0= ruleSelectionSet )
                    {
                    // InternalGraphqlXtext.g:152:4: (lv_selection_0_0= ruleSelectionSet )
                    // InternalGraphqlXtext.g:153:5: lv_selection_0_0= ruleSelectionSet
                    {

                    					newCompositeNode(grammarAccess.getOperationDefinitionAccess().getSelectionSelectionSetParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_selection_0_0=ruleSelectionSet();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"selection",
                    						lv_selection_0_0,
                    						"es.unex.quercusseg.GraphqlXtext.SelectionSet");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:171:3: ( ( (lv_opType_1_0= ruleOperationType ) ) ( (lv_name_2_0= RULE_NAME ) )? (otherlv_3= '(' ( (lv_varDefinitions_4_0= ruleVariableDefinition ) )+ otherlv_5= ')' )? ( (lv_directives_6_0= ruleDirective ) )* ( (lv_selectionSet_7_0= ruleSelectionSet ) ) )
                    {
                    // InternalGraphqlXtext.g:171:3: ( ( (lv_opType_1_0= ruleOperationType ) ) ( (lv_name_2_0= RULE_NAME ) )? (otherlv_3= '(' ( (lv_varDefinitions_4_0= ruleVariableDefinition ) )+ otherlv_5= ')' )? ( (lv_directives_6_0= ruleDirective ) )* ( (lv_selectionSet_7_0= ruleSelectionSet ) ) )
                    // InternalGraphqlXtext.g:172:4: ( (lv_opType_1_0= ruleOperationType ) ) ( (lv_name_2_0= RULE_NAME ) )? (otherlv_3= '(' ( (lv_varDefinitions_4_0= ruleVariableDefinition ) )+ otherlv_5= ')' )? ( (lv_directives_6_0= ruleDirective ) )* ( (lv_selectionSet_7_0= ruleSelectionSet ) )
                    {
                    // InternalGraphqlXtext.g:172:4: ( (lv_opType_1_0= ruleOperationType ) )
                    // InternalGraphqlXtext.g:173:5: (lv_opType_1_0= ruleOperationType )
                    {
                    // InternalGraphqlXtext.g:173:5: (lv_opType_1_0= ruleOperationType )
                    // InternalGraphqlXtext.g:174:6: lv_opType_1_0= ruleOperationType
                    {

                    						newCompositeNode(grammarAccess.getOperationDefinitionAccess().getOpTypeOperationTypeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_opType_1_0=ruleOperationType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"opType",
                    							lv_opType_1_0,
                    							"es.unex.quercusseg.GraphqlXtext.OperationType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphqlXtext.g:191:4: ( (lv_name_2_0= RULE_NAME ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_NAME) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalGraphqlXtext.g:192:5: (lv_name_2_0= RULE_NAME )
                            {
                            // InternalGraphqlXtext.g:192:5: (lv_name_2_0= RULE_NAME )
                            // InternalGraphqlXtext.g:193:6: lv_name_2_0= RULE_NAME
                            {
                            lv_name_2_0=(Token)match(input,RULE_NAME,FOLLOW_5); 

                            						newLeafNode(lv_name_2_0, grammarAccess.getOperationDefinitionAccess().getNameNAMETerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getOperationDefinitionRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"name",
                            							lv_name_2_0,
                            							"es.unex.quercusseg.GraphqlXtext.NAME");
                            					

                            }


                            }
                            break;

                    }

                    // InternalGraphqlXtext.g:209:4: (otherlv_3= '(' ( (lv_varDefinitions_4_0= ruleVariableDefinition ) )+ otherlv_5= ')' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==17) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalGraphqlXtext.g:210:5: otherlv_3= '(' ( (lv_varDefinitions_4_0= ruleVariableDefinition ) )+ otherlv_5= ')'
                            {
                            otherlv_3=(Token)match(input,17,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getOperationDefinitionAccess().getLeftParenthesisKeyword_1_2_0());
                            				
                            // InternalGraphqlXtext.g:214:5: ( (lv_varDefinitions_4_0= ruleVariableDefinition ) )+
                            int cnt4=0;
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==29) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // InternalGraphqlXtext.g:215:6: (lv_varDefinitions_4_0= ruleVariableDefinition )
                            	    {
                            	    // InternalGraphqlXtext.g:215:6: (lv_varDefinitions_4_0= ruleVariableDefinition )
                            	    // InternalGraphqlXtext.g:216:7: lv_varDefinitions_4_0= ruleVariableDefinition
                            	    {

                            	    							newCompositeNode(grammarAccess.getOperationDefinitionAccess().getVarDefinitionsVariableDefinitionParserRuleCall_1_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_7);
                            	    lv_varDefinitions_4_0=ruleVariableDefinition();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"varDefinitions",
                            	    								lv_varDefinitions_4_0,
                            	    								"es.unex.quercusseg.GraphqlXtext.VariableDefinition");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt4 >= 1 ) break loop4;
                                        EarlyExitException eee =
                                            new EarlyExitException(4, input);
                                        throw eee;
                                }
                                cnt4++;
                            } while (true);

                            otherlv_5=(Token)match(input,18,FOLLOW_8); 

                            					newLeafNode(otherlv_5, grammarAccess.getOperationDefinitionAccess().getRightParenthesisKeyword_1_2_2());
                            				

                            }
                            break;

                    }

                    // InternalGraphqlXtext.g:238:4: ( (lv_directives_6_0= ruleDirective ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==32) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGraphqlXtext.g:239:5: (lv_directives_6_0= ruleDirective )
                    	    {
                    	    // InternalGraphqlXtext.g:239:5: (lv_directives_6_0= ruleDirective )
                    	    // InternalGraphqlXtext.g:240:6: lv_directives_6_0= ruleDirective
                    	    {

                    	    						newCompositeNode(grammarAccess.getOperationDefinitionAccess().getDirectivesDirectiveParserRuleCall_1_3_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_directives_6_0=ruleDirective();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"directives",
                    	    							lv_directives_6_0,
                    	    							"es.unex.quercusseg.GraphqlXtext.Directive");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalGraphqlXtext.g:257:4: ( (lv_selectionSet_7_0= ruleSelectionSet ) )
                    // InternalGraphqlXtext.g:258:5: (lv_selectionSet_7_0= ruleSelectionSet )
                    {
                    // InternalGraphqlXtext.g:258:5: (lv_selectionSet_7_0= ruleSelectionSet )
                    // InternalGraphqlXtext.g:259:6: lv_selectionSet_7_0= ruleSelectionSet
                    {

                    						newCompositeNode(grammarAccess.getOperationDefinitionAccess().getSelectionSetSelectionSetParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_selectionSet_7_0=ruleSelectionSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"selectionSet",
                    							lv_selectionSet_7_0,
                    							"es.unex.quercusseg.GraphqlXtext.SelectionSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleOperationDefinition"


    // $ANTLR start "entryRuleOperationType"
    // InternalGraphqlXtext.g:281:1: entryRuleOperationType returns [String current=null] : iv_ruleOperationType= ruleOperationType EOF ;
    public final String entryRuleOperationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperationType = null;


        try {
            // InternalGraphqlXtext.g:281:53: (iv_ruleOperationType= ruleOperationType EOF )
            // InternalGraphqlXtext.g:282:2: iv_ruleOperationType= ruleOperationType EOF
            {
             newCompositeNode(grammarAccess.getOperationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationType=ruleOperationType();

            state._fsp--;

             current =iv_ruleOperationType.getText(); 
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
    // $ANTLR end "entryRuleOperationType"


    // $ANTLR start "ruleOperationType"
    // InternalGraphqlXtext.g:288:1: ruleOperationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'query' | kw= 'mutation' ) ;
    public final AntlrDatatypeRuleToken ruleOperationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGraphqlXtext.g:294:2: ( (kw= 'query' | kw= 'mutation' ) )
            // InternalGraphqlXtext.g:295:2: (kw= 'query' | kw= 'mutation' )
            {
            // InternalGraphqlXtext.g:295:2: (kw= 'query' | kw= 'mutation' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGraphqlXtext.g:296:3: kw= 'query'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationTypeAccess().getQueryKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:302:3: kw= 'mutation'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationTypeAccess().getMutationKeyword_1());
                    		

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
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "entryRuleSelectionSet"
    // InternalGraphqlXtext.g:311:1: entryRuleSelectionSet returns [EObject current=null] : iv_ruleSelectionSet= ruleSelectionSet EOF ;
    public final EObject entryRuleSelectionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionSet = null;


        try {
            // InternalGraphqlXtext.g:311:53: (iv_ruleSelectionSet= ruleSelectionSet EOF )
            // InternalGraphqlXtext.g:312:2: iv_ruleSelectionSet= ruleSelectionSet EOF
            {
             newCompositeNode(grammarAccess.getSelectionSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectionSet=ruleSelectionSet();

            state._fsp--;

             current =iv_ruleSelectionSet; 
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
    // $ANTLR end "entryRuleSelectionSet"


    // $ANTLR start "ruleSelectionSet"
    // InternalGraphqlXtext.g:318:1: ruleSelectionSet returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_selections_2_0= ruleSelection ) )+ otherlv_3= '}' ) ;
    public final EObject ruleSelectionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_selections_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:324:2: ( ( () otherlv_1= '{' ( (lv_selections_2_0= ruleSelection ) )+ otherlv_3= '}' ) )
            // InternalGraphqlXtext.g:325:2: ( () otherlv_1= '{' ( (lv_selections_2_0= ruleSelection ) )+ otherlv_3= '}' )
            {
            // InternalGraphqlXtext.g:325:2: ( () otherlv_1= '{' ( (lv_selections_2_0= ruleSelection ) )+ otherlv_3= '}' )
            // InternalGraphqlXtext.g:326:3: () otherlv_1= '{' ( (lv_selections_2_0= ruleSelection ) )+ otherlv_3= '}'
            {
            // InternalGraphqlXtext.g:326:3: ()
            // InternalGraphqlXtext.g:327:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelectionSetAccess().getSelectionSetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectionSetAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGraphqlXtext.g:337:3: ( (lv_selections_2_0= ruleSelection ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_NAME||LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGraphqlXtext.g:338:4: (lv_selections_2_0= ruleSelection )
            	    {
            	    // InternalGraphqlXtext.g:338:4: (lv_selections_2_0= ruleSelection )
            	    // InternalGraphqlXtext.g:339:5: lv_selections_2_0= ruleSelection
            	    {

            	    					newCompositeNode(grammarAccess.getSelectionSetAccess().getSelectionsSelectionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_selections_2_0=ruleSelection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSelectionSetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"selections",
            	    						lv_selections_2_0,
            	    						"es.unex.quercusseg.GraphqlXtext.Selection");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectionSetAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSelectionSet"


    // $ANTLR start "entryRuleSelection"
    // InternalGraphqlXtext.g:364:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // InternalGraphqlXtext.g:364:50: (iv_ruleSelection= ruleSelection EOF )
            // InternalGraphqlXtext.g:365:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
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
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // InternalGraphqlXtext.g:371:1: ruleSelection returns [EObject current=null] : (this_Field_0= ruleField | this_FragmentSpread_1= ruleFragmentSpread | this_InlineFragment_2= ruleInlineFragment ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_FragmentSpread_1 = null;

        EObject this_InlineFragment_2 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:377:2: ( (this_Field_0= ruleField | this_FragmentSpread_1= ruleFragmentSpread | this_InlineFragment_2= ruleInlineFragment ) )
            // InternalGraphqlXtext.g:378:2: (this_Field_0= ruleField | this_FragmentSpread_1= ruleFragmentSpread | this_InlineFragment_2= ruleInlineFragment )
            {
            // InternalGraphqlXtext.g:378:2: (this_Field_0= ruleField | this_FragmentSpread_1= ruleFragmentSpread | this_InlineFragment_2= ruleInlineFragment )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_NAME) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==RULE_NAME) ) {
                    alt10=2;
                }
                else if ( (LA10_2==21||LA10_2==26||LA10_2==32) ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGraphqlXtext.g:379:3: this_Field_0= ruleField
                    {

                    			newCompositeNode(grammarAccess.getSelectionAccess().getFieldParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Field_0=ruleField();

                    state._fsp--;


                    			current = this_Field_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:388:3: this_FragmentSpread_1= ruleFragmentSpread
                    {

                    			newCompositeNode(grammarAccess.getSelectionAccess().getFragmentSpreadParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FragmentSpread_1=ruleFragmentSpread();

                    state._fsp--;


                    			current = this_FragmentSpread_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGraphqlXtext.g:397:3: this_InlineFragment_2= ruleInlineFragment
                    {

                    			newCompositeNode(grammarAccess.getSelectionAccess().getInlineFragmentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InlineFragment_2=ruleInlineFragment();

                    state._fsp--;


                    			current = this_InlineFragment_2;
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
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleField"
    // InternalGraphqlXtext.g:409:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalGraphqlXtext.g:409:46: (iv_ruleField= ruleField EOF )
            // InternalGraphqlXtext.g:410:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalGraphqlXtext.g:416:1: ruleField returns [EObject current=null] : ( ( (lv_alias_0_0= ruleAlias ) )? ( (lv_name_1_0= RULE_NAME ) ) ( (lv_args_2_0= ruleArguments ) )? ( (lv_directives_3_0= ruleDirective ) )* ( (lv_selectionSet_4_0= ruleSelectionSet ) )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_alias_0_0 = null;

        EObject lv_args_2_0 = null;

        EObject lv_directives_3_0 = null;

        EObject lv_selectionSet_4_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:422:2: ( ( ( (lv_alias_0_0= ruleAlias ) )? ( (lv_name_1_0= RULE_NAME ) ) ( (lv_args_2_0= ruleArguments ) )? ( (lv_directives_3_0= ruleDirective ) )* ( (lv_selectionSet_4_0= ruleSelectionSet ) )? ) )
            // InternalGraphqlXtext.g:423:2: ( ( (lv_alias_0_0= ruleAlias ) )? ( (lv_name_1_0= RULE_NAME ) ) ( (lv_args_2_0= ruleArguments ) )? ( (lv_directives_3_0= ruleDirective ) )* ( (lv_selectionSet_4_0= ruleSelectionSet ) )? )
            {
            // InternalGraphqlXtext.g:423:2: ( ( (lv_alias_0_0= ruleAlias ) )? ( (lv_name_1_0= RULE_NAME ) ) ( (lv_args_2_0= ruleArguments ) )? ( (lv_directives_3_0= ruleDirective ) )* ( (lv_selectionSet_4_0= ruleSelectionSet ) )? )
            // InternalGraphqlXtext.g:424:3: ( (lv_alias_0_0= ruleAlias ) )? ( (lv_name_1_0= RULE_NAME ) ) ( (lv_args_2_0= ruleArguments ) )? ( (lv_directives_3_0= ruleDirective ) )* ( (lv_selectionSet_4_0= ruleSelectionSet ) )?
            {
            // InternalGraphqlXtext.g:424:3: ( (lv_alias_0_0= ruleAlias ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_NAME) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==23) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalGraphqlXtext.g:425:4: (lv_alias_0_0= ruleAlias )
                    {
                    // InternalGraphqlXtext.g:425:4: (lv_alias_0_0= ruleAlias )
                    // InternalGraphqlXtext.g:426:5: lv_alias_0_0= ruleAlias
                    {

                    					newCompositeNode(grammarAccess.getFieldAccess().getAliasAliasParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_alias_0_0=ruleAlias();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldRule());
                    					}
                    					set(
                    						current,
                    						"alias",
                    						lv_alias_0_0,
                    						"es.unex.quercusseg.GraphqlXtext.Alias");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGraphqlXtext.g:443:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphqlXtext.g:444:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphqlXtext.g:444:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphqlXtext.g:445:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.unex.quercusseg.GraphqlXtext.NAME");
            				

            }


            }

            // InternalGraphqlXtext.g:461:3: ( (lv_args_2_0= ruleArguments ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGraphqlXtext.g:462:4: (lv_args_2_0= ruleArguments )
                    {
                    // InternalGraphqlXtext.g:462:4: (lv_args_2_0= ruleArguments )
                    // InternalGraphqlXtext.g:463:5: lv_args_2_0= ruleArguments
                    {

                    					newCompositeNode(grammarAccess.getFieldAccess().getArgsArgumentsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_args_2_0=ruleArguments();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldRule());
                    					}
                    					set(
                    						current,
                    						"args",
                    						lv_args_2_0,
                    						"es.unex.quercusseg.GraphqlXtext.Arguments");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGraphqlXtext.g:480:3: ( (lv_directives_3_0= ruleDirective ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGraphqlXtext.g:481:4: (lv_directives_3_0= ruleDirective )
            	    {
            	    // InternalGraphqlXtext.g:481:4: (lv_directives_3_0= ruleDirective )
            	    // InternalGraphqlXtext.g:482:5: lv_directives_3_0= ruleDirective
            	    {

            	    					newCompositeNode(grammarAccess.getFieldAccess().getDirectivesDirectiveParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_directives_3_0=ruleDirective();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFieldRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directives",
            	    						lv_directives_3_0,
            	    						"es.unex.quercusseg.GraphqlXtext.Directive");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalGraphqlXtext.g:499:3: ( (lv_selectionSet_4_0= ruleSelectionSet ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGraphqlXtext.g:500:4: (lv_selectionSet_4_0= ruleSelectionSet )
                    {
                    // InternalGraphqlXtext.g:500:4: (lv_selectionSet_4_0= ruleSelectionSet )
                    // InternalGraphqlXtext.g:501:5: lv_selectionSet_4_0= ruleSelectionSet
                    {

                    					newCompositeNode(grammarAccess.getFieldAccess().getSelectionSetSelectionSetParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_selectionSet_4_0=ruleSelectionSet();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldRule());
                    					}
                    					set(
                    						current,
                    						"selectionSet",
                    						lv_selectionSet_4_0,
                    						"es.unex.quercusseg.GraphqlXtext.SelectionSet");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleAlias"
    // InternalGraphqlXtext.g:522:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // InternalGraphqlXtext.g:522:46: (iv_ruleAlias= ruleAlias EOF )
            // InternalGraphqlXtext.g:523:2: iv_ruleAlias= ruleAlias EOF
            {
             newCompositeNode(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlias=ruleAlias();

            state._fsp--;

             current =iv_ruleAlias; 
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
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // InternalGraphqlXtext.g:529:1: ruleAlias returns [EObject current=null] : ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGraphqlXtext.g:535:2: ( ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ) )
            // InternalGraphqlXtext.g:536:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' )
            {
            // InternalGraphqlXtext.g:536:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' )
            // InternalGraphqlXtext.g:537:3: ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':'
            {
            // InternalGraphqlXtext.g:537:3: ( (lv_name_0_0= RULE_NAME ) )
            // InternalGraphqlXtext.g:538:4: (lv_name_0_0= RULE_NAME )
            {
            // InternalGraphqlXtext.g:538:4: (lv_name_0_0= RULE_NAME )
            // InternalGraphqlXtext.g:539:5: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAliasAccess().getNameNAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAliasRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"es.unex.quercusseg.GraphqlXtext.NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAliasAccess().getColonKeyword_1());
            		

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
    // $ANTLR end "ruleAlias"


    // $ANTLR start "entryRuleArguments"
    // InternalGraphqlXtext.g:563:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalGraphqlXtext.g:563:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalGraphqlXtext.g:564:2: iv_ruleArguments= ruleArguments EOF
            {
             newCompositeNode(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArguments=ruleArguments();

            state._fsp--;

             current =iv_ruleArguments; 
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
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalGraphqlXtext.g:570:1: ruleArguments returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )* otherlv_3= ')' ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:576:2: ( ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )* otherlv_3= ')' ) )
            // InternalGraphqlXtext.g:577:2: ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )* otherlv_3= ')' )
            {
            // InternalGraphqlXtext.g:577:2: ( () otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )* otherlv_3= ')' )
            // InternalGraphqlXtext.g:578:3: () otherlv_1= '(' ( (lv_args_2_0= ruleArgument ) )* otherlv_3= ')'
            {
            // InternalGraphqlXtext.g:578:3: ()
            // InternalGraphqlXtext.g:579:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArgumentsAccess().getArgumentsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGraphqlXtext.g:589:3: ( (lv_args_2_0= ruleArgument ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_NAME) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGraphqlXtext.g:590:4: (lv_args_2_0= ruleArgument )
            	    {
            	    // InternalGraphqlXtext.g:590:4: (lv_args_2_0= ruleArgument )
            	    // InternalGraphqlXtext.g:591:5: lv_args_2_0= ruleArgument
            	    {

            	    					newCompositeNode(grammarAccess.getArgumentsAccess().getArgsArgumentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_args_2_0=ruleArgument();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArgumentsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"args",
            	    						lv_args_2_0,
            	    						"es.unex.quercusseg.GraphqlXtext.Argument");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleArgument"
    // InternalGraphqlXtext.g:616:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalGraphqlXtext.g:616:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalGraphqlXtext.g:617:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalGraphqlXtext.g:623:1: ruleArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:629:2: ( ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalGraphqlXtext.g:630:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalGraphqlXtext.g:630:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            // InternalGraphqlXtext.g:631:3: ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalGraphqlXtext.g:631:3: ( (lv_name_0_0= RULE_NAME ) )
            // InternalGraphqlXtext.g:632:4: (lv_name_0_0= RULE_NAME )
            {
            // InternalGraphqlXtext.g:632:4: (lv_name_0_0= RULE_NAME )
            // InternalGraphqlXtext.g:633:5: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getArgumentAccess().getNameNAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"es.unex.quercusseg.GraphqlXtext.NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getColonKeyword_1());
            		
            // InternalGraphqlXtext.g:653:3: ( (lv_value_2_0= ruleValue ) )
            // InternalGraphqlXtext.g:654:4: (lv_value_2_0= ruleValue )
            {
            // InternalGraphqlXtext.g:654:4: (lv_value_2_0= ruleValue )
            // InternalGraphqlXtext.g:655:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getArgumentAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgumentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"es.unex.quercusseg.GraphqlXtext.Value");
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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleFragmentSpread"
    // InternalGraphqlXtext.g:676:1: entryRuleFragmentSpread returns [EObject current=null] : iv_ruleFragmentSpread= ruleFragmentSpread EOF ;
    public final EObject entryRuleFragmentSpread() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragmentSpread = null;


        try {
            // InternalGraphqlXtext.g:676:55: (iv_ruleFragmentSpread= ruleFragmentSpread EOF )
            // InternalGraphqlXtext.g:677:2: iv_ruleFragmentSpread= ruleFragmentSpread EOF
            {
             newCompositeNode(grammarAccess.getFragmentSpreadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFragmentSpread=ruleFragmentSpread();

            state._fsp--;

             current =iv_ruleFragmentSpread; 
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
    // $ANTLR end "entryRuleFragmentSpread"


    // $ANTLR start "ruleFragmentSpread"
    // InternalGraphqlXtext.g:683:1: ruleFragmentSpread returns [EObject current=null] : (otherlv_0= '...' ( (lv_fragName_1_0= ruleFragmentName ) ) ( (lv_directives_2_0= ruleDirective ) )* ) ;
    public final EObject ruleFragmentSpread() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_fragName_1_0 = null;

        EObject lv_directives_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:689:2: ( (otherlv_0= '...' ( (lv_fragName_1_0= ruleFragmentName ) ) ( (lv_directives_2_0= ruleDirective ) )* ) )
            // InternalGraphqlXtext.g:690:2: (otherlv_0= '...' ( (lv_fragName_1_0= ruleFragmentName ) ) ( (lv_directives_2_0= ruleDirective ) )* )
            {
            // InternalGraphqlXtext.g:690:2: (otherlv_0= '...' ( (lv_fragName_1_0= ruleFragmentName ) ) ( (lv_directives_2_0= ruleDirective ) )* )
            // InternalGraphqlXtext.g:691:3: otherlv_0= '...' ( (lv_fragName_1_0= ruleFragmentName ) ) ( (lv_directives_2_0= ruleDirective ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFragmentSpreadAccess().getFullStopFullStopFullStopKeyword_0());
            		
            // InternalGraphqlXtext.g:695:3: ( (lv_fragName_1_0= ruleFragmentName ) )
            // InternalGraphqlXtext.g:696:4: (lv_fragName_1_0= ruleFragmentName )
            {
            // InternalGraphqlXtext.g:696:4: (lv_fragName_1_0= ruleFragmentName )
            // InternalGraphqlXtext.g:697:5: lv_fragName_1_0= ruleFragmentName
            {

            					newCompositeNode(grammarAccess.getFragmentSpreadAccess().getFragNameFragmentNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_fragName_1_0=ruleFragmentName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFragmentSpreadRule());
            					}
            					set(
            						current,
            						"fragName",
            						lv_fragName_1_0,
            						"es.unex.quercusseg.GraphqlXtext.FragmentName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGraphqlXtext.g:714:3: ( (lv_directives_2_0= ruleDirective ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGraphqlXtext.g:715:4: (lv_directives_2_0= ruleDirective )
            	    {
            	    // InternalGraphqlXtext.g:715:4: (lv_directives_2_0= ruleDirective )
            	    // InternalGraphqlXtext.g:716:5: lv_directives_2_0= ruleDirective
            	    {

            	    					newCompositeNode(grammarAccess.getFragmentSpreadAccess().getDirectivesDirectiveParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_directives_2_0=ruleDirective();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFragmentSpreadRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directives",
            	    						lv_directives_2_0,
            	    						"es.unex.quercusseg.GraphqlXtext.Directive");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleFragmentSpread"


    // $ANTLR start "entryRuleInlineFragment"
    // InternalGraphqlXtext.g:737:1: entryRuleInlineFragment returns [EObject current=null] : iv_ruleInlineFragment= ruleInlineFragment EOF ;
    public final EObject entryRuleInlineFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineFragment = null;


        try {
            // InternalGraphqlXtext.g:737:55: (iv_ruleInlineFragment= ruleInlineFragment EOF )
            // InternalGraphqlXtext.g:738:2: iv_ruleInlineFragment= ruleInlineFragment EOF
            {
             newCompositeNode(grammarAccess.getInlineFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInlineFragment=ruleInlineFragment();

            state._fsp--;

             current =iv_ruleInlineFragment; 
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
    // $ANTLR end "entryRuleInlineFragment"


    // $ANTLR start "ruleInlineFragment"
    // InternalGraphqlXtext.g:744:1: ruleInlineFragment returns [EObject current=null] : ( () otherlv_1= '...' ( (lv_typeCondition_2_0= ruleTypeCondition ) )? ( (lv_directives_3_0= ruleDirective ) )* ( (lv_selectionSet_4_0= ruleSelectionSet ) ) ) ;
    public final EObject ruleInlineFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_typeCondition_2_0 = null;

        EObject lv_directives_3_0 = null;

        EObject lv_selectionSet_4_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:750:2: ( ( () otherlv_1= '...' ( (lv_typeCondition_2_0= ruleTypeCondition ) )? ( (lv_directives_3_0= ruleDirective ) )* ( (lv_selectionSet_4_0= ruleSelectionSet ) ) ) )
            // InternalGraphqlXtext.g:751:2: ( () otherlv_1= '...' ( (lv_typeCondition_2_0= ruleTypeCondition ) )? ( (lv_directives_3_0= ruleDirective ) )* ( (lv_selectionSet_4_0= ruleSelectionSet ) ) )
            {
            // InternalGraphqlXtext.g:751:2: ( () otherlv_1= '...' ( (lv_typeCondition_2_0= ruleTypeCondition ) )? ( (lv_directives_3_0= ruleDirective ) )* ( (lv_selectionSet_4_0= ruleSelectionSet ) ) )
            // InternalGraphqlXtext.g:752:3: () otherlv_1= '...' ( (lv_typeCondition_2_0= ruleTypeCondition ) )? ( (lv_directives_3_0= ruleDirective ) )* ( (lv_selectionSet_4_0= ruleSelectionSet ) )
            {
            // InternalGraphqlXtext.g:752:3: ()
            // InternalGraphqlXtext.g:753:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInlineFragmentAccess().getInlineFragmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getInlineFragmentAccess().getFullStopFullStopFullStopKeyword_1());
            		
            // InternalGraphqlXtext.g:763:3: ( (lv_typeCondition_2_0= ruleTypeCondition ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGraphqlXtext.g:764:4: (lv_typeCondition_2_0= ruleTypeCondition )
                    {
                    // InternalGraphqlXtext.g:764:4: (lv_typeCondition_2_0= ruleTypeCondition )
                    // InternalGraphqlXtext.g:765:5: lv_typeCondition_2_0= ruleTypeCondition
                    {

                    					newCompositeNode(grammarAccess.getInlineFragmentAccess().getTypeConditionTypeConditionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_typeCondition_2_0=ruleTypeCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInlineFragmentRule());
                    					}
                    					set(
                    						current,
                    						"typeCondition",
                    						lv_typeCondition_2_0,
                    						"es.unex.quercusseg.GraphqlXtext.TypeCondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGraphqlXtext.g:782:3: ( (lv_directives_3_0= ruleDirective ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGraphqlXtext.g:783:4: (lv_directives_3_0= ruleDirective )
            	    {
            	    // InternalGraphqlXtext.g:783:4: (lv_directives_3_0= ruleDirective )
            	    // InternalGraphqlXtext.g:784:5: lv_directives_3_0= ruleDirective
            	    {

            	    					newCompositeNode(grammarAccess.getInlineFragmentAccess().getDirectivesDirectiveParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_directives_3_0=ruleDirective();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInlineFragmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directives",
            	    						lv_directives_3_0,
            	    						"es.unex.quercusseg.GraphqlXtext.Directive");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalGraphqlXtext.g:801:3: ( (lv_selectionSet_4_0= ruleSelectionSet ) )
            // InternalGraphqlXtext.g:802:4: (lv_selectionSet_4_0= ruleSelectionSet )
            {
            // InternalGraphqlXtext.g:802:4: (lv_selectionSet_4_0= ruleSelectionSet )
            // InternalGraphqlXtext.g:803:5: lv_selectionSet_4_0= ruleSelectionSet
            {

            					newCompositeNode(grammarAccess.getInlineFragmentAccess().getSelectionSetSelectionSetParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_selectionSet_4_0=ruleSelectionSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInlineFragmentRule());
            					}
            					set(
            						current,
            						"selectionSet",
            						lv_selectionSet_4_0,
            						"es.unex.quercusseg.GraphqlXtext.SelectionSet");
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
    // $ANTLR end "ruleInlineFragment"


    // $ANTLR start "entryRuleFragmentDefinition"
    // InternalGraphqlXtext.g:824:1: entryRuleFragmentDefinition returns [EObject current=null] : iv_ruleFragmentDefinition= ruleFragmentDefinition EOF ;
    public final EObject entryRuleFragmentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragmentDefinition = null;


        try {
            // InternalGraphqlXtext.g:824:59: (iv_ruleFragmentDefinition= ruleFragmentDefinition EOF )
            // InternalGraphqlXtext.g:825:2: iv_ruleFragmentDefinition= ruleFragmentDefinition EOF
            {
             newCompositeNode(grammarAccess.getFragmentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFragmentDefinition=ruleFragmentDefinition();

            state._fsp--;

             current =iv_ruleFragmentDefinition; 
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
    // $ANTLR end "entryRuleFragmentDefinition"


    // $ANTLR start "ruleFragmentDefinition"
    // InternalGraphqlXtext.g:831:1: ruleFragmentDefinition returns [EObject current=null] : (otherlv_0= 'fragment' ( (lv_fragName_1_0= ruleFragmentName ) ) ( (lv_typeCondition_2_0= ruleTypeCondition ) )? ( (lv_directives_3_0= ruleDirective ) )* ( (lv_selectionSet_4_0= ruleSelectionSet ) ) ) ;
    public final EObject ruleFragmentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_fragName_1_0 = null;

        AntlrDatatypeRuleToken lv_typeCondition_2_0 = null;

        EObject lv_directives_3_0 = null;

        EObject lv_selectionSet_4_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:837:2: ( (otherlv_0= 'fragment' ( (lv_fragName_1_0= ruleFragmentName ) ) ( (lv_typeCondition_2_0= ruleTypeCondition ) )? ( (lv_directives_3_0= ruleDirective ) )* ( (lv_selectionSet_4_0= ruleSelectionSet ) ) ) )
            // InternalGraphqlXtext.g:838:2: (otherlv_0= 'fragment' ( (lv_fragName_1_0= ruleFragmentName ) ) ( (lv_typeCondition_2_0= ruleTypeCondition ) )? ( (lv_directives_3_0= ruleDirective ) )* ( (lv_selectionSet_4_0= ruleSelectionSet ) ) )
            {
            // InternalGraphqlXtext.g:838:2: (otherlv_0= 'fragment' ( (lv_fragName_1_0= ruleFragmentName ) ) ( (lv_typeCondition_2_0= ruleTypeCondition ) )? ( (lv_directives_3_0= ruleDirective ) )* ( (lv_selectionSet_4_0= ruleSelectionSet ) ) )
            // InternalGraphqlXtext.g:839:3: otherlv_0= 'fragment' ( (lv_fragName_1_0= ruleFragmentName ) ) ( (lv_typeCondition_2_0= ruleTypeCondition ) )? ( (lv_directives_3_0= ruleDirective ) )* ( (lv_selectionSet_4_0= ruleSelectionSet ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFragmentDefinitionAccess().getFragmentKeyword_0());
            		
            // InternalGraphqlXtext.g:843:3: ( (lv_fragName_1_0= ruleFragmentName ) )
            // InternalGraphqlXtext.g:844:4: (lv_fragName_1_0= ruleFragmentName )
            {
            // InternalGraphqlXtext.g:844:4: (lv_fragName_1_0= ruleFragmentName )
            // InternalGraphqlXtext.g:845:5: lv_fragName_1_0= ruleFragmentName
            {

            					newCompositeNode(grammarAccess.getFragmentDefinitionAccess().getFragNameFragmentNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_fragName_1_0=ruleFragmentName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFragmentDefinitionRule());
            					}
            					set(
            						current,
            						"fragName",
            						lv_fragName_1_0,
            						"es.unex.quercusseg.GraphqlXtext.FragmentName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGraphqlXtext.g:862:3: ( (lv_typeCondition_2_0= ruleTypeCondition ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGraphqlXtext.g:863:4: (lv_typeCondition_2_0= ruleTypeCondition )
                    {
                    // InternalGraphqlXtext.g:863:4: (lv_typeCondition_2_0= ruleTypeCondition )
                    // InternalGraphqlXtext.g:864:5: lv_typeCondition_2_0= ruleTypeCondition
                    {

                    					newCompositeNode(grammarAccess.getFragmentDefinitionAccess().getTypeConditionTypeConditionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_typeCondition_2_0=ruleTypeCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFragmentDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"typeCondition",
                    						lv_typeCondition_2_0,
                    						"es.unex.quercusseg.GraphqlXtext.TypeCondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGraphqlXtext.g:881:3: ( (lv_directives_3_0= ruleDirective ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGraphqlXtext.g:882:4: (lv_directives_3_0= ruleDirective )
            	    {
            	    // InternalGraphqlXtext.g:882:4: (lv_directives_3_0= ruleDirective )
            	    // InternalGraphqlXtext.g:883:5: lv_directives_3_0= ruleDirective
            	    {

            	    					newCompositeNode(grammarAccess.getFragmentDefinitionAccess().getDirectivesDirectiveParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_directives_3_0=ruleDirective();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFragmentDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directives",
            	    						lv_directives_3_0,
            	    						"es.unex.quercusseg.GraphqlXtext.Directive");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalGraphqlXtext.g:900:3: ( (lv_selectionSet_4_0= ruleSelectionSet ) )
            // InternalGraphqlXtext.g:901:4: (lv_selectionSet_4_0= ruleSelectionSet )
            {
            // InternalGraphqlXtext.g:901:4: (lv_selectionSet_4_0= ruleSelectionSet )
            // InternalGraphqlXtext.g:902:5: lv_selectionSet_4_0= ruleSelectionSet
            {

            					newCompositeNode(grammarAccess.getFragmentDefinitionAccess().getSelectionSetSelectionSetParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_selectionSet_4_0=ruleSelectionSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFragmentDefinitionRule());
            					}
            					set(
            						current,
            						"selectionSet",
            						lv_selectionSet_4_0,
            						"es.unex.quercusseg.GraphqlXtext.SelectionSet");
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
    // $ANTLR end "ruleFragmentDefinition"


    // $ANTLR start "entryRuleFragmentName"
    // InternalGraphqlXtext.g:923:1: entryRuleFragmentName returns [String current=null] : iv_ruleFragmentName= ruleFragmentName EOF ;
    public final String entryRuleFragmentName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFragmentName = null;


        try {
            // InternalGraphqlXtext.g:923:52: (iv_ruleFragmentName= ruleFragmentName EOF )
            // InternalGraphqlXtext.g:924:2: iv_ruleFragmentName= ruleFragmentName EOF
            {
             newCompositeNode(grammarAccess.getFragmentNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFragmentName=ruleFragmentName();

            state._fsp--;

             current =iv_ruleFragmentName.getText(); 
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
    // $ANTLR end "entryRuleFragmentName"


    // $ANTLR start "ruleFragmentName"
    // InternalGraphqlXtext.g:930:1: ruleFragmentName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NAME_0= RULE_NAME ;
    public final AntlrDatatypeRuleToken ruleFragmentName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NAME_0=null;


        	enterRule();

        try {
            // InternalGraphqlXtext.g:936:2: (this_NAME_0= RULE_NAME )
            // InternalGraphqlXtext.g:937:2: this_NAME_0= RULE_NAME
            {
            this_NAME_0=(Token)match(input,RULE_NAME,FOLLOW_2); 

            		current.merge(this_NAME_0);
            	

            		newLeafNode(this_NAME_0, grammarAccess.getFragmentNameAccess().getNAMETerminalRuleCall());
            	

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
    // $ANTLR end "ruleFragmentName"


    // $ANTLR start "entryRuleTypeCondition"
    // InternalGraphqlXtext.g:947:1: entryRuleTypeCondition returns [String current=null] : iv_ruleTypeCondition= ruleTypeCondition EOF ;
    public final String entryRuleTypeCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeCondition = null;


        try {
            // InternalGraphqlXtext.g:947:53: (iv_ruleTypeCondition= ruleTypeCondition EOF )
            // InternalGraphqlXtext.g:948:2: iv_ruleTypeCondition= ruleTypeCondition EOF
            {
             newCompositeNode(grammarAccess.getTypeConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeCondition=ruleTypeCondition();

            state._fsp--;

             current =iv_ruleTypeCondition.getText(); 
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
    // $ANTLR end "entryRuleTypeCondition"


    // $ANTLR start "ruleTypeCondition"
    // InternalGraphqlXtext.g:954:1: ruleTypeCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'on' this_NamedType_1= ruleNamedType ) ;
    public final AntlrDatatypeRuleToken ruleTypeCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NamedType_1 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:960:2: ( (kw= 'on' this_NamedType_1= ruleNamedType ) )
            // InternalGraphqlXtext.g:961:2: (kw= 'on' this_NamedType_1= ruleNamedType )
            {
            // InternalGraphqlXtext.g:961:2: (kw= 'on' this_NamedType_1= ruleNamedType )
            // InternalGraphqlXtext.g:962:3: kw= 'on' this_NamedType_1= ruleNamedType
            {
            kw=(Token)match(input,26,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTypeConditionAccess().getOnKeyword_0());
            		

            			newCompositeNode(grammarAccess.getTypeConditionAccess().getNamedTypeParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_NamedType_1=ruleNamedType();

            state._fsp--;


            			current.merge(this_NamedType_1);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleTypeCondition"


    // $ANTLR start "entryRuleValue"
    // InternalGraphqlXtext.g:981:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalGraphqlXtext.g:981:46: (iv_ruleValue= ruleValue EOF )
            // InternalGraphqlXtext.g:982:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalGraphqlXtext.g:988:1: ruleValue returns [EObject current=null] : (this_SingleValue_0= ruleSingleValue | this_ComplexValue_1= ruleComplexValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValue_0 = null;

        EObject this_ComplexValue_1 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:994:2: ( (this_SingleValue_0= ruleSingleValue | this_ComplexValue_1= ruleComplexValue ) )
            // InternalGraphqlXtext.g:995:2: (this_SingleValue_0= ruleSingleValue | this_ComplexValue_1= ruleComplexValue )
            {
            // InternalGraphqlXtext.g:995:2: (this_SingleValue_0= ruleSingleValue | this_ComplexValue_1= ruleComplexValue )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_NAME && LA21_0<=RULE_STRING)||LA21_0==29) ) {
                alt21=1;
            }
            else if ( (LA21_0==21||LA21_0==27) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGraphqlXtext.g:996:3: this_SingleValue_0= ruleSingleValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getSingleValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleValue_0=ruleSingleValue();

                    state._fsp--;


                    			current = this_SingleValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:1005:3: this_ComplexValue_1= ruleComplexValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getComplexValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexValue_1=ruleComplexValue();

                    state._fsp--;


                    			current = this_ComplexValue_1;
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleSingleValue"
    // InternalGraphqlXtext.g:1017:1: entryRuleSingleValue returns [EObject current=null] : iv_ruleSingleValue= ruleSingleValue EOF ;
    public final EObject entryRuleSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValue = null;


        try {
            // InternalGraphqlXtext.g:1017:52: (iv_ruleSingleValue= ruleSingleValue EOF )
            // InternalGraphqlXtext.g:1018:2: iv_ruleSingleValue= ruleSingleValue EOF
            {
             newCompositeNode(grammarAccess.getSingleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleValue=ruleSingleValue();

            state._fsp--;

             current =iv_ruleSingleValue; 
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
    // $ANTLR end "entryRuleSingleValue"


    // $ANTLR start "ruleSingleValue"
    // InternalGraphqlXtext.g:1024:1: ruleSingleValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleVariable ) ) | ( (lv_value_1_0= ruleIntValue ) ) | ( (lv_value_2_0= ruleStringValue ) ) | ( (lv_value_3_0= RULE_BOOLEANVALUE ) ) | ( (lv_value_4_0= RULE_NULLVALUE ) ) | ( (lv_value_5_0= ruleEnumValue ) ) ) ;
    public final EObject ruleSingleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_3_0=null;
        Token lv_value_4_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:1030:2: ( ( ( (lv_value_0_0= ruleVariable ) ) | ( (lv_value_1_0= ruleIntValue ) ) | ( (lv_value_2_0= ruleStringValue ) ) | ( (lv_value_3_0= RULE_BOOLEANVALUE ) ) | ( (lv_value_4_0= RULE_NULLVALUE ) ) | ( (lv_value_5_0= ruleEnumValue ) ) ) )
            // InternalGraphqlXtext.g:1031:2: ( ( (lv_value_0_0= ruleVariable ) ) | ( (lv_value_1_0= ruleIntValue ) ) | ( (lv_value_2_0= ruleStringValue ) ) | ( (lv_value_3_0= RULE_BOOLEANVALUE ) ) | ( (lv_value_4_0= RULE_NULLVALUE ) ) | ( (lv_value_5_0= ruleEnumValue ) ) )
            {
            // InternalGraphqlXtext.g:1031:2: ( ( (lv_value_0_0= ruleVariable ) ) | ( (lv_value_1_0= ruleIntValue ) ) | ( (lv_value_2_0= ruleStringValue ) ) | ( (lv_value_3_0= RULE_BOOLEANVALUE ) ) | ( (lv_value_4_0= RULE_NULLVALUE ) ) | ( (lv_value_5_0= ruleEnumValue ) ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt22=1;
                }
                break;
            case RULE_DIGIT:
                {
                alt22=2;
                }
                break;
            case RULE_STRING:
                {
                alt22=3;
                }
                break;
            case RULE_BOOLEANVALUE:
                {
                alt22=4;
                }
                break;
            case RULE_NULLVALUE:
                {
                alt22=5;
                }
                break;
            case RULE_NAME:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalGraphqlXtext.g:1032:3: ( (lv_value_0_0= ruleVariable ) )
                    {
                    // InternalGraphqlXtext.g:1032:3: ( (lv_value_0_0= ruleVariable ) )
                    // InternalGraphqlXtext.g:1033:4: (lv_value_0_0= ruleVariable )
                    {
                    // InternalGraphqlXtext.g:1033:4: (lv_value_0_0= ruleVariable )
                    // InternalGraphqlXtext.g:1034:5: lv_value_0_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getSingleValueAccess().getValueVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"es.unex.quercusseg.GraphqlXtext.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:1052:3: ( (lv_value_1_0= ruleIntValue ) )
                    {
                    // InternalGraphqlXtext.g:1052:3: ( (lv_value_1_0= ruleIntValue ) )
                    // InternalGraphqlXtext.g:1053:4: (lv_value_1_0= ruleIntValue )
                    {
                    // InternalGraphqlXtext.g:1053:4: (lv_value_1_0= ruleIntValue )
                    // InternalGraphqlXtext.g:1054:5: lv_value_1_0= ruleIntValue
                    {

                    					newCompositeNode(grammarAccess.getSingleValueAccess().getValueIntValueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleIntValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"es.unex.quercusseg.GraphqlXtext.IntValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGraphqlXtext.g:1072:3: ( (lv_value_2_0= ruleStringValue ) )
                    {
                    // InternalGraphqlXtext.g:1072:3: ( (lv_value_2_0= ruleStringValue ) )
                    // InternalGraphqlXtext.g:1073:4: (lv_value_2_0= ruleStringValue )
                    {
                    // InternalGraphqlXtext.g:1073:4: (lv_value_2_0= ruleStringValue )
                    // InternalGraphqlXtext.g:1074:5: lv_value_2_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getSingleValueAccess().getValueStringValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"es.unex.quercusseg.GraphqlXtext.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGraphqlXtext.g:1092:3: ( (lv_value_3_0= RULE_BOOLEANVALUE ) )
                    {
                    // InternalGraphqlXtext.g:1092:3: ( (lv_value_3_0= RULE_BOOLEANVALUE ) )
                    // InternalGraphqlXtext.g:1093:4: (lv_value_3_0= RULE_BOOLEANVALUE )
                    {
                    // InternalGraphqlXtext.g:1093:4: (lv_value_3_0= RULE_BOOLEANVALUE )
                    // InternalGraphqlXtext.g:1094:5: lv_value_3_0= RULE_BOOLEANVALUE
                    {
                    lv_value_3_0=(Token)match(input,RULE_BOOLEANVALUE,FOLLOW_2); 

                    					newLeafNode(lv_value_3_0, grammarAccess.getSingleValueAccess().getValueBOOLEANVALUETerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSingleValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"es.unex.quercusseg.GraphqlXtext.BOOLEANVALUE");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGraphqlXtext.g:1111:3: ( (lv_value_4_0= RULE_NULLVALUE ) )
                    {
                    // InternalGraphqlXtext.g:1111:3: ( (lv_value_4_0= RULE_NULLVALUE ) )
                    // InternalGraphqlXtext.g:1112:4: (lv_value_4_0= RULE_NULLVALUE )
                    {
                    // InternalGraphqlXtext.g:1112:4: (lv_value_4_0= RULE_NULLVALUE )
                    // InternalGraphqlXtext.g:1113:5: lv_value_4_0= RULE_NULLVALUE
                    {
                    lv_value_4_0=(Token)match(input,RULE_NULLVALUE,FOLLOW_2); 

                    					newLeafNode(lv_value_4_0, grammarAccess.getSingleValueAccess().getValueNULLVALUETerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSingleValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_4_0,
                    						"es.unex.quercusseg.GraphqlXtext.NULLVALUE");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGraphqlXtext.g:1130:3: ( (lv_value_5_0= ruleEnumValue ) )
                    {
                    // InternalGraphqlXtext.g:1130:3: ( (lv_value_5_0= ruleEnumValue ) )
                    // InternalGraphqlXtext.g:1131:4: (lv_value_5_0= ruleEnumValue )
                    {
                    // InternalGraphqlXtext.g:1131:4: (lv_value_5_0= ruleEnumValue )
                    // InternalGraphqlXtext.g:1132:5: lv_value_5_0= ruleEnumValue
                    {

                    					newCompositeNode(grammarAccess.getSingleValueAccess().getValueEnumValueParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleEnumValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_5_0,
                    						"es.unex.quercusseg.GraphqlXtext.EnumValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleSingleValue"


    // $ANTLR start "entryRuleComplexValue"
    // InternalGraphqlXtext.g:1153:1: entryRuleComplexValue returns [EObject current=null] : iv_ruleComplexValue= ruleComplexValue EOF ;
    public final EObject entryRuleComplexValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexValue = null;


        try {
            // InternalGraphqlXtext.g:1153:53: (iv_ruleComplexValue= ruleComplexValue EOF )
            // InternalGraphqlXtext.g:1154:2: iv_ruleComplexValue= ruleComplexValue EOF
            {
             newCompositeNode(grammarAccess.getComplexValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexValue=ruleComplexValue();

            state._fsp--;

             current =iv_ruleComplexValue; 
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
    // $ANTLR end "entryRuleComplexValue"


    // $ANTLR start "ruleComplexValue"
    // InternalGraphqlXtext.g:1160:1: ruleComplexValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleListValue ) ) | ( (lv_value_1_0= ruleObjectValue ) ) ) ;
    public final EObject ruleComplexValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:1166:2: ( ( ( (lv_value_0_0= ruleListValue ) ) | ( (lv_value_1_0= ruleObjectValue ) ) ) )
            // InternalGraphqlXtext.g:1167:2: ( ( (lv_value_0_0= ruleListValue ) ) | ( (lv_value_1_0= ruleObjectValue ) ) )
            {
            // InternalGraphqlXtext.g:1167:2: ( ( (lv_value_0_0= ruleListValue ) ) | ( (lv_value_1_0= ruleObjectValue ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            else if ( (LA23_0==21) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalGraphqlXtext.g:1168:3: ( (lv_value_0_0= ruleListValue ) )
                    {
                    // InternalGraphqlXtext.g:1168:3: ( (lv_value_0_0= ruleListValue ) )
                    // InternalGraphqlXtext.g:1169:4: (lv_value_0_0= ruleListValue )
                    {
                    // InternalGraphqlXtext.g:1169:4: (lv_value_0_0= ruleListValue )
                    // InternalGraphqlXtext.g:1170:5: lv_value_0_0= ruleListValue
                    {

                    					newCompositeNode(grammarAccess.getComplexValueAccess().getValueListValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleListValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComplexValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"es.unex.quercusseg.GraphqlXtext.ListValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:1188:3: ( (lv_value_1_0= ruleObjectValue ) )
                    {
                    // InternalGraphqlXtext.g:1188:3: ( (lv_value_1_0= ruleObjectValue ) )
                    // InternalGraphqlXtext.g:1189:4: (lv_value_1_0= ruleObjectValue )
                    {
                    // InternalGraphqlXtext.g:1189:4: (lv_value_1_0= ruleObjectValue )
                    // InternalGraphqlXtext.g:1190:5: lv_value_1_0= ruleObjectValue
                    {

                    					newCompositeNode(grammarAccess.getComplexValueAccess().getValueObjectValueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleObjectValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComplexValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"es.unex.quercusseg.GraphqlXtext.ObjectValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleComplexValue"


    // $ANTLR start "entryRuleEnumValue"
    // InternalGraphqlXtext.g:1211:1: entryRuleEnumValue returns [String current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final String entryRuleEnumValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumValue = null;


        try {
            // InternalGraphqlXtext.g:1211:49: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalGraphqlXtext.g:1212:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
             newCompositeNode(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;

             current =iv_ruleEnumValue.getText(); 
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
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalGraphqlXtext.g:1218:1: ruleEnumValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NAME_0= RULE_NAME ;
    public final AntlrDatatypeRuleToken ruleEnumValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NAME_0=null;


        	enterRule();

        try {
            // InternalGraphqlXtext.g:1224:2: (this_NAME_0= RULE_NAME )
            // InternalGraphqlXtext.g:1225:2: this_NAME_0= RULE_NAME
            {
            this_NAME_0=(Token)match(input,RULE_NAME,FOLLOW_2); 

            		current.merge(this_NAME_0);
            	

            		newLeafNode(this_NAME_0, grammarAccess.getEnumValueAccess().getNAMETerminalRuleCall());
            	

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
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleListValue"
    // InternalGraphqlXtext.g:1235:1: entryRuleListValue returns [EObject current=null] : iv_ruleListValue= ruleListValue EOF ;
    public final EObject entryRuleListValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListValue = null;


        try {
            // InternalGraphqlXtext.g:1235:50: (iv_ruleListValue= ruleListValue EOF )
            // InternalGraphqlXtext.g:1236:2: iv_ruleListValue= ruleListValue EOF
            {
             newCompositeNode(grammarAccess.getListValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListValue=ruleListValue();

            state._fsp--;

             current =iv_ruleListValue; 
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
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // InternalGraphqlXtext.g:1242:1: ruleListValue returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_values_2_0= ruleValue ) )* otherlv_3= ']' ) ;
    public final EObject ruleListValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:1248:2: ( ( () otherlv_1= '[' ( (lv_values_2_0= ruleValue ) )* otherlv_3= ']' ) )
            // InternalGraphqlXtext.g:1249:2: ( () otherlv_1= '[' ( (lv_values_2_0= ruleValue ) )* otherlv_3= ']' )
            {
            // InternalGraphqlXtext.g:1249:2: ( () otherlv_1= '[' ( (lv_values_2_0= ruleValue ) )* otherlv_3= ']' )
            // InternalGraphqlXtext.g:1250:3: () otherlv_1= '[' ( (lv_values_2_0= ruleValue ) )* otherlv_3= ']'
            {
            // InternalGraphqlXtext.g:1250:3: ()
            // InternalGraphqlXtext.g:1251:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListValueAccess().getListValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalGraphqlXtext.g:1261:3: ( (lv_values_2_0= ruleValue ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_NAME && LA24_0<=RULE_STRING)||LA24_0==21||LA24_0==27||LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGraphqlXtext.g:1262:4: (lv_values_2_0= ruleValue )
            	    {
            	    // InternalGraphqlXtext.g:1262:4: (lv_values_2_0= ruleValue )
            	    // InternalGraphqlXtext.g:1263:5: lv_values_2_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getListValueAccess().getValuesValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_values_2_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_2_0,
            	    						"es.unex.quercusseg.GraphqlXtext.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleListValue"


    // $ANTLR start "entryRuleObjectValue"
    // InternalGraphqlXtext.g:1288:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalGraphqlXtext.g:1288:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalGraphqlXtext.g:1289:2: iv_ruleObjectValue= ruleObjectValue EOF
            {
             newCompositeNode(grammarAccess.getObjectValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectValue=ruleObjectValue();

            state._fsp--;

             current =iv_ruleObjectValue; 
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
    // $ANTLR end "entryRuleObjectValue"


    // $ANTLR start "ruleObjectValue"
    // InternalGraphqlXtext.g:1295:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:1301:2: ( ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' ) )
            // InternalGraphqlXtext.g:1302:2: ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' )
            {
            // InternalGraphqlXtext.g:1302:2: ( () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}' )
            // InternalGraphqlXtext.g:1303:3: () otherlv_1= '{' ( (lv_fields_2_0= ruleObjectField ) )* otherlv_3= '}'
            {
            // InternalGraphqlXtext.g:1303:3: ()
            // InternalGraphqlXtext.g:1304:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGraphqlXtext.g:1314:3: ( (lv_fields_2_0= ruleObjectField ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_NAME) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGraphqlXtext.g:1315:4: (lv_fields_2_0= ruleObjectField )
            	    {
            	    // InternalGraphqlXtext.g:1315:4: (lv_fields_2_0= ruleObjectField )
            	    // InternalGraphqlXtext.g:1316:5: lv_fields_2_0= ruleObjectField
            	    {

            	    					newCompositeNode(grammarAccess.getObjectValueAccess().getFieldsObjectFieldParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_fields_2_0=ruleObjectField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectValueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_2_0,
            	    						"es.unex.quercusseg.GraphqlXtext.ObjectField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleObjectValue"


    // $ANTLR start "entryRuleObjectField"
    // InternalGraphqlXtext.g:1341:1: entryRuleObjectField returns [EObject current=null] : iv_ruleObjectField= ruleObjectField EOF ;
    public final EObject entryRuleObjectField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectField = null;


        try {
            // InternalGraphqlXtext.g:1341:52: (iv_ruleObjectField= ruleObjectField EOF )
            // InternalGraphqlXtext.g:1342:2: iv_ruleObjectField= ruleObjectField EOF
            {
             newCompositeNode(grammarAccess.getObjectFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectField=ruleObjectField();

            state._fsp--;

             current =iv_ruleObjectField; 
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
    // $ANTLR end "entryRuleObjectField"


    // $ANTLR start "ruleObjectField"
    // InternalGraphqlXtext.g:1348:1: ruleObjectField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleObjectField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:1354:2: ( ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalGraphqlXtext.g:1355:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalGraphqlXtext.g:1355:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            // InternalGraphqlXtext.g:1356:3: ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalGraphqlXtext.g:1356:3: ( (lv_name_0_0= RULE_NAME ) )
            // InternalGraphqlXtext.g:1357:4: (lv_name_0_0= RULE_NAME )
            {
            // InternalGraphqlXtext.g:1357:4: (lv_name_0_0= RULE_NAME )
            // InternalGraphqlXtext.g:1358:5: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getObjectFieldAccess().getNameNAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"es.unex.quercusseg.GraphqlXtext.NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectFieldAccess().getColonKeyword_1());
            		
            // InternalGraphqlXtext.g:1378:3: ( (lv_value_2_0= ruleValue ) )
            // InternalGraphqlXtext.g:1379:4: (lv_value_2_0= ruleValue )
            {
            // InternalGraphqlXtext.g:1379:4: (lv_value_2_0= ruleValue )
            // InternalGraphqlXtext.g:1380:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getObjectFieldAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"es.unex.quercusseg.GraphqlXtext.Value");
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
    // $ANTLR end "ruleObjectField"


    // $ANTLR start "entryRuleVariableDefinition"
    // InternalGraphqlXtext.g:1401:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // InternalGraphqlXtext.g:1401:59: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // InternalGraphqlXtext.g:1402:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;

             current =iv_ruleVariableDefinition; 
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
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // InternalGraphqlXtext.g:1408:1: ruleVariableDefinition returns [EObject current=null] : (otherlv_0= '$' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ( (lv_defValue_4_0= ruleDefaultValue ) )? ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;

        EObject lv_defValue_4_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:1414:2: ( (otherlv_0= '$' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ( (lv_defValue_4_0= ruleDefaultValue ) )? ) )
            // InternalGraphqlXtext.g:1415:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ( (lv_defValue_4_0= ruleDefaultValue ) )? )
            {
            // InternalGraphqlXtext.g:1415:2: (otherlv_0= '$' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ( (lv_defValue_4_0= ruleDefaultValue ) )? )
            // InternalGraphqlXtext.g:1416:3: otherlv_0= '$' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ( (lv_defValue_4_0= ruleDefaultValue ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDefinitionAccess().getDollarSignKeyword_0());
            		
            // InternalGraphqlXtext.g:1420:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphqlXtext.g:1421:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphqlXtext.g:1421:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphqlXtext.g:1422:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDefinitionAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.unex.quercusseg.GraphqlXtext.NAME");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDefinitionAccess().getColonKeyword_2());
            		
            // InternalGraphqlXtext.g:1442:3: ( (lv_type_3_0= ruleType ) )
            // InternalGraphqlXtext.g:1443:4: (lv_type_3_0= ruleType )
            {
            // InternalGraphqlXtext.g:1443:4: (lv_type_3_0= ruleType )
            // InternalGraphqlXtext.g:1444:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVariableDefinitionAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"es.unex.quercusseg.GraphqlXtext.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGraphqlXtext.g:1461:3: ( (lv_defValue_4_0= ruleDefaultValue ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGraphqlXtext.g:1462:4: (lv_defValue_4_0= ruleDefaultValue )
                    {
                    // InternalGraphqlXtext.g:1462:4: (lv_defValue_4_0= ruleDefaultValue )
                    // InternalGraphqlXtext.g:1463:5: lv_defValue_4_0= ruleDefaultValue
                    {

                    					newCompositeNode(grammarAccess.getVariableDefinitionAccess().getDefValueDefaultValueParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_defValue_4_0=ruleDefaultValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"defValue",
                    						lv_defValue_4_0,
                    						"es.unex.quercusseg.GraphqlXtext.DefaultValue");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleVariable"
    // InternalGraphqlXtext.g:1484:1: entryRuleVariable returns [String current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final String entryRuleVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariable = null;


        try {
            // InternalGraphqlXtext.g:1484:48: (iv_ruleVariable= ruleVariable EOF )
            // InternalGraphqlXtext.g:1485:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable.getText(); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalGraphqlXtext.g:1491:1: ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '$' this_NAME_1= RULE_NAME ) ;
    public final AntlrDatatypeRuleToken ruleVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NAME_1=null;


        	enterRule();

        try {
            // InternalGraphqlXtext.g:1497:2: ( (kw= '$' this_NAME_1= RULE_NAME ) )
            // InternalGraphqlXtext.g:1498:2: (kw= '$' this_NAME_1= RULE_NAME )
            {
            // InternalGraphqlXtext.g:1498:2: (kw= '$' this_NAME_1= RULE_NAME )
            // InternalGraphqlXtext.g:1499:3: kw= '$' this_NAME_1= RULE_NAME
            {
            kw=(Token)match(input,29,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getVariableAccess().getDollarSignKeyword_0());
            		
            this_NAME_1=(Token)match(input,RULE_NAME,FOLLOW_2); 

            			current.merge(this_NAME_1);
            		

            			newLeafNode(this_NAME_1, grammarAccess.getVariableAccess().getNAMETerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleDefaultValue"
    // InternalGraphqlXtext.g:1515:1: entryRuleDefaultValue returns [EObject current=null] : iv_ruleDefaultValue= ruleDefaultValue EOF ;
    public final EObject entryRuleDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValue = null;


        try {
            // InternalGraphqlXtext.g:1515:53: (iv_ruleDefaultValue= ruleDefaultValue EOF )
            // InternalGraphqlXtext.g:1516:2: iv_ruleDefaultValue= ruleDefaultValue EOF
            {
             newCompositeNode(grammarAccess.getDefaultValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultValue=ruleDefaultValue();

            state._fsp--;

             current =iv_ruleDefaultValue; 
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
    // $ANTLR end "entryRuleDefaultValue"


    // $ANTLR start "ruleDefaultValue"
    // InternalGraphqlXtext.g:1522:1: ruleDefaultValue returns [EObject current=null] : (otherlv_0= '=' this_Value_1= ruleValue ) ;
    public final EObject ruleDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Value_1 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:1528:2: ( (otherlv_0= '=' this_Value_1= ruleValue ) )
            // InternalGraphqlXtext.g:1529:2: (otherlv_0= '=' this_Value_1= ruleValue )
            {
            // InternalGraphqlXtext.g:1529:2: (otherlv_0= '=' this_Value_1= ruleValue )
            // InternalGraphqlXtext.g:1530:3: otherlv_0= '=' this_Value_1= ruleValue
            {
            otherlv_0=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultValueAccess().getEqualsSignKeyword_0());
            		

            			newCompositeNode(grammarAccess.getDefaultValueAccess().getValueParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Value_1=ruleValue();

            state._fsp--;


            			current = this_Value_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleDefaultValue"


    // $ANTLR start "entryRuleType"
    // InternalGraphqlXtext.g:1546:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalGraphqlXtext.g:1546:45: (iv_ruleType= ruleType EOF )
            // InternalGraphqlXtext.g:1547:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGraphqlXtext.g:1553:1: ruleType returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleNamedType ) ) ( (lv_notNull_1_0= '!' ) )? ) | ( ( (lv_list_2_0= ruleListType ) ) ( (lv_notNull_3_0= '!' ) )? ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_notNull_1_0=null;
        Token lv_notNull_3_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:1559:2: ( ( ( ( (lv_name_0_0= ruleNamedType ) ) ( (lv_notNull_1_0= '!' ) )? ) | ( ( (lv_list_2_0= ruleListType ) ) ( (lv_notNull_3_0= '!' ) )? ) ) )
            // InternalGraphqlXtext.g:1560:2: ( ( ( (lv_name_0_0= ruleNamedType ) ) ( (lv_notNull_1_0= '!' ) )? ) | ( ( (lv_list_2_0= ruleListType ) ) ( (lv_notNull_3_0= '!' ) )? ) )
            {
            // InternalGraphqlXtext.g:1560:2: ( ( ( (lv_name_0_0= ruleNamedType ) ) ( (lv_notNull_1_0= '!' ) )? ) | ( ( (lv_list_2_0= ruleListType ) ) ( (lv_notNull_3_0= '!' ) )? ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_NAME) ) {
                alt29=1;
            }
            else if ( (LA29_0==27) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalGraphqlXtext.g:1561:3: ( ( (lv_name_0_0= ruleNamedType ) ) ( (lv_notNull_1_0= '!' ) )? )
                    {
                    // InternalGraphqlXtext.g:1561:3: ( ( (lv_name_0_0= ruleNamedType ) ) ( (lv_notNull_1_0= '!' ) )? )
                    // InternalGraphqlXtext.g:1562:4: ( (lv_name_0_0= ruleNamedType ) ) ( (lv_notNull_1_0= '!' ) )?
                    {
                    // InternalGraphqlXtext.g:1562:4: ( (lv_name_0_0= ruleNamedType ) )
                    // InternalGraphqlXtext.g:1563:5: (lv_name_0_0= ruleNamedType )
                    {
                    // InternalGraphqlXtext.g:1563:5: (lv_name_0_0= ruleNamedType )
                    // InternalGraphqlXtext.g:1564:6: lv_name_0_0= ruleNamedType
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getNameNamedTypeParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_name_0_0=ruleNamedType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"es.unex.quercusseg.GraphqlXtext.NamedType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphqlXtext.g:1581:4: ( (lv_notNull_1_0= '!' ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==31) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalGraphqlXtext.g:1582:5: (lv_notNull_1_0= '!' )
                            {
                            // InternalGraphqlXtext.g:1582:5: (lv_notNull_1_0= '!' )
                            // InternalGraphqlXtext.g:1583:6: lv_notNull_1_0= '!'
                            {
                            lv_notNull_1_0=(Token)match(input,31,FOLLOW_2); 

                            						newLeafNode(lv_notNull_1_0, grammarAccess.getTypeAccess().getNotNullExclamationMarkKeyword_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypeRule());
                            						}
                            						setWithLastConsumed(current, "notNull", lv_notNull_1_0 != null, "!");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGraphqlXtext.g:1597:3: ( ( (lv_list_2_0= ruleListType ) ) ( (lv_notNull_3_0= '!' ) )? )
                    {
                    // InternalGraphqlXtext.g:1597:3: ( ( (lv_list_2_0= ruleListType ) ) ( (lv_notNull_3_0= '!' ) )? )
                    // InternalGraphqlXtext.g:1598:4: ( (lv_list_2_0= ruleListType ) ) ( (lv_notNull_3_0= '!' ) )?
                    {
                    // InternalGraphqlXtext.g:1598:4: ( (lv_list_2_0= ruleListType ) )
                    // InternalGraphqlXtext.g:1599:5: (lv_list_2_0= ruleListType )
                    {
                    // InternalGraphqlXtext.g:1599:5: (lv_list_2_0= ruleListType )
                    // InternalGraphqlXtext.g:1600:6: lv_list_2_0= ruleListType
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getListListTypeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_list_2_0=ruleListType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    						}
                    						set(
                    							current,
                    							"list",
                    							lv_list_2_0,
                    							"es.unex.quercusseg.GraphqlXtext.ListType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGraphqlXtext.g:1617:4: ( (lv_notNull_3_0= '!' ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==31) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalGraphqlXtext.g:1618:5: (lv_notNull_3_0= '!' )
                            {
                            // InternalGraphqlXtext.g:1618:5: (lv_notNull_3_0= '!' )
                            // InternalGraphqlXtext.g:1619:6: lv_notNull_3_0= '!'
                            {
                            lv_notNull_3_0=(Token)match(input,31,FOLLOW_2); 

                            						newLeafNode(lv_notNull_3_0, grammarAccess.getTypeAccess().getNotNullExclamationMarkKeyword_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypeRule());
                            						}
                            						setWithLastConsumed(current, "notNull", lv_notNull_3_0 != null, "!");
                            					

                            }


                            }
                            break;

                    }


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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleNamedType"
    // InternalGraphqlXtext.g:1636:1: entryRuleNamedType returns [String current=null] : iv_ruleNamedType= ruleNamedType EOF ;
    public final String entryRuleNamedType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamedType = null;


        try {
            // InternalGraphqlXtext.g:1636:49: (iv_ruleNamedType= ruleNamedType EOF )
            // InternalGraphqlXtext.g:1637:2: iv_ruleNamedType= ruleNamedType EOF
            {
             newCompositeNode(grammarAccess.getNamedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedType=ruleNamedType();

            state._fsp--;

             current =iv_ruleNamedType.getText(); 
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
    // $ANTLR end "entryRuleNamedType"


    // $ANTLR start "ruleNamedType"
    // InternalGraphqlXtext.g:1643:1: ruleNamedType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NAME_0= RULE_NAME ;
    public final AntlrDatatypeRuleToken ruleNamedType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NAME_0=null;


        	enterRule();

        try {
            // InternalGraphqlXtext.g:1649:2: (this_NAME_0= RULE_NAME )
            // InternalGraphqlXtext.g:1650:2: this_NAME_0= RULE_NAME
            {
            this_NAME_0=(Token)match(input,RULE_NAME,FOLLOW_2); 

            		current.merge(this_NAME_0);
            	

            		newLeafNode(this_NAME_0, grammarAccess.getNamedTypeAccess().getNAMETerminalRuleCall());
            	

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
    // $ANTLR end "ruleNamedType"


    // $ANTLR start "entryRuleListType"
    // InternalGraphqlXtext.g:1660:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalGraphqlXtext.g:1660:49: (iv_ruleListType= ruleListType EOF )
            // InternalGraphqlXtext.g:1661:2: iv_ruleListType= ruleListType EOF
            {
             newCompositeNode(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListType=ruleListType();

            state._fsp--;

             current =iv_ruleListType; 
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
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // InternalGraphqlXtext.g:1667:1: ruleListType returns [EObject current=null] : (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:1673:2: ( (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' ) )
            // InternalGraphqlXtext.g:1674:2: (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' )
            {
            // InternalGraphqlXtext.g:1674:2: (otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']' )
            // InternalGraphqlXtext.g:1675:3: otherlv_0= '[' ( (lv_type_1_0= ruleType ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getListTypeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalGraphqlXtext.g:1679:3: ( (lv_type_1_0= ruleType ) )
            // InternalGraphqlXtext.g:1680:4: (lv_type_1_0= ruleType )
            {
            // InternalGraphqlXtext.g:1680:4: (lv_type_1_0= ruleType )
            // InternalGraphqlXtext.g:1681:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"es.unex.quercusseg.GraphqlXtext.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getListTypeAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRuleDirective"
    // InternalGraphqlXtext.g:1706:1: entryRuleDirective returns [EObject current=null] : iv_ruleDirective= ruleDirective EOF ;
    public final EObject entryRuleDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirective = null;


        try {
            // InternalGraphqlXtext.g:1706:50: (iv_ruleDirective= ruleDirective EOF )
            // InternalGraphqlXtext.g:1707:2: iv_ruleDirective= ruleDirective EOF
            {
             newCompositeNode(grammarAccess.getDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirective=ruleDirective();

            state._fsp--;

             current =iv_ruleDirective; 
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
    // $ANTLR end "entryRuleDirective"


    // $ANTLR start "ruleDirective"
    // InternalGraphqlXtext.g:1713:1: ruleDirective returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_NAME ) ) ( (lv_args_2_0= ruleArguments ) )* ) ;
    public final EObject ruleDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_args_2_0 = null;



        	enterRule();

        try {
            // InternalGraphqlXtext.g:1719:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_NAME ) ) ( (lv_args_2_0= ruleArguments ) )* ) )
            // InternalGraphqlXtext.g:1720:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_NAME ) ) ( (lv_args_2_0= ruleArguments ) )* )
            {
            // InternalGraphqlXtext.g:1720:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_NAME ) ) ( (lv_args_2_0= ruleArguments ) )* )
            // InternalGraphqlXtext.g:1721:3: otherlv_0= '@' ( (lv_name_1_0= RULE_NAME ) ) ( (lv_args_2_0= ruleArguments ) )*
            {
            otherlv_0=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectiveAccess().getCommercialAtKeyword_0());
            		
            // InternalGraphqlXtext.g:1725:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalGraphqlXtext.g:1726:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalGraphqlXtext.g:1726:4: (lv_name_1_0= RULE_NAME )
            // InternalGraphqlXtext.g:1727:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDirectiveAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectiveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"es.unex.quercusseg.GraphqlXtext.NAME");
            				

            }


            }

            // InternalGraphqlXtext.g:1743:3: ( (lv_args_2_0= ruleArguments ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==17) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGraphqlXtext.g:1744:4: (lv_args_2_0= ruleArguments )
            	    {
            	    // InternalGraphqlXtext.g:1744:4: (lv_args_2_0= ruleArguments )
            	    // InternalGraphqlXtext.g:1745:5: lv_args_2_0= ruleArguments
            	    {

            	    					newCompositeNode(grammarAccess.getDirectiveAccess().getArgsArgumentsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_args_2_0=ruleArguments();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDirectiveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"args",
            	    						lv_args_2_0,
            	    						"es.unex.quercusseg.GraphqlXtext.Arguments");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleDirective"


    // $ANTLR start "entryRuleIntValue"
    // InternalGraphqlXtext.g:1766:1: entryRuleIntValue returns [String current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final String entryRuleIntValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntValue = null;


        try {
            // InternalGraphqlXtext.g:1766:48: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalGraphqlXtext.g:1767:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue.getText(); 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalGraphqlXtext.g:1773:1: ruleIntValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DIGIT_0= RULE_DIGIT ;
    public final AntlrDatatypeRuleToken ruleIntValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_0=null;


        	enterRule();

        try {
            // InternalGraphqlXtext.g:1779:2: (this_DIGIT_0= RULE_DIGIT )
            // InternalGraphqlXtext.g:1780:2: this_DIGIT_0= RULE_DIGIT
            {
            this_DIGIT_0=(Token)match(input,RULE_DIGIT,FOLLOW_2); 

            		current.merge(this_DIGIT_0);
            	

            		newLeafNode(this_DIGIT_0, grammarAccess.getIntValueAccess().getDIGITTerminalRuleCall());
            	

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalGraphqlXtext.g:1790:1: entryRuleStringValue returns [String current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final String entryRuleStringValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringValue = null;


        try {
            // InternalGraphqlXtext.g:1790:51: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalGraphqlXtext.g:1791:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue.getText(); 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalGraphqlXtext.g:1797:1: ruleStringValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalGraphqlXtext.g:1803:2: (this_STRING_0= RULE_STRING )
            // InternalGraphqlXtext.g:1804:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getStringValueAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleStringValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002380002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100220010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100220000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001400010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100220002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000282001F0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000104200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000382001F0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000020002L});

}