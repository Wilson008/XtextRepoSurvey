package de.sebastianbenz.xgherkin.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.sebastianbenz.xgherkin.services.GherkinGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGherkinParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TAG", "RULE_FEATURE_TEXT", "RULE_TEXT", "RULE_AS_A", "RULE_IN_ORDER_TO", "RULE_I_WANT_TO", "RULE_SCENARIO_TEXT", "RULE_SCENARIO_OUTLINE_TEXT", "RULE_EXAMPLE_HEADING", "RULE_EXAMPLE_ROW_END", "RULE_EXAMPLE_CELL", "RULE_BACKGROUND_TEXT", "RULE_WHEN_TEXT", "RULE_THEN_TEXT", "RULE_GIVEN_TEXT", "RULE_AND_TEXT", "RULE_CODE", "RULE_SPACES", "RULE_NNL", "RULE_NL", "RULE_SL_COMMENT", "RULE_WS"
    };
    public static final int RULE_WHEN_TEXT=16;
    public static final int RULE_TAG=4;
    public static final int RULE_I_WANT_TO=9;
    public static final int RULE_THEN_TEXT=17;
    public static final int RULE_FEATURE_TEXT=5;
    public static final int RULE_SCENARIO_TEXT=10;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_GIVEN_TEXT=18;
    public static final int RULE_EXAMPLE_HEADING=12;
    public static final int RULE_BACKGROUND_TEXT=15;
    public static final int EOF=-1;
    public static final int RULE_IN_ORDER_TO=8;
    public static final int RULE_AND_TEXT=19;
    public static final int RULE_WS=25;
    public static final int RULE_SCENARIO_OUTLINE_TEXT=11;
    public static final int RULE_SPACES=21;
    public static final int RULE_CODE=20;
    public static final int RULE_NNL=22;
    public static final int RULE_EXAMPLE_CELL=14;
    public static final int RULE_AS_A=7;
    public static final int RULE_TEXT=6;
    public static final int RULE_NL=23;
    public static final int RULE_EXAMPLE_ROW_END=13;

    // delegates
    // delegators


        public InternalGherkinParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGherkinParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGherkinParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGherkin.g"; }



     	private GherkinGrammarAccess grammarAccess;

        public InternalGherkinParser(TokenStream input, GherkinGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Feature";
       	}

       	@Override
       	protected GherkinGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFeature"
    // InternalGherkin.g:64:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalGherkin.g:64:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalGherkin.g:65:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalGherkin.g:71:1: ruleFeature returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_FEATURE_TEXT ) )? ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_scenarios_3_0= ruleAbstractScenario ) )* ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_scenarios_3_0 = null;



        	enterRule();

        try {
            // InternalGherkin.g:77:2: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_FEATURE_TEXT ) )? ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_scenarios_3_0= ruleAbstractScenario ) )* ) )
            // InternalGherkin.g:78:2: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_FEATURE_TEXT ) )? ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_scenarios_3_0= ruleAbstractScenario ) )* )
            {
            // InternalGherkin.g:78:2: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_FEATURE_TEXT ) )? ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_scenarios_3_0= ruleAbstractScenario ) )* )
            // InternalGherkin.g:79:3: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_FEATURE_TEXT ) )? ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_scenarios_3_0= ruleAbstractScenario ) )*
            {
            // InternalGherkin.g:79:3: ( (lv_tags_0_0= RULE_TAG ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_TAG) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGherkin.g:80:4: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // InternalGherkin.g:80:4: (lv_tags_0_0= RULE_TAG )
            	    // InternalGherkin.g:81:5: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_3); 

            	    					newLeafNode(lv_tags_0_0, grammarAccess.getFeatureAccess().getTagsTAGTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getFeatureRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"tags",
            	    						lv_tags_0_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.TAG");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalGherkin.g:97:3: ( (lv_name_1_0= RULE_FEATURE_TEXT ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_FEATURE_TEXT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGherkin.g:98:4: (lv_name_1_0= RULE_FEATURE_TEXT )
                    {
                    // InternalGherkin.g:98:4: (lv_name_1_0= RULE_FEATURE_TEXT )
                    // InternalGherkin.g:99:5: lv_name_1_0= RULE_FEATURE_TEXT
                    {
                    lv_name_1_0=(Token)match(input,RULE_FEATURE_TEXT,FOLLOW_4); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameFEATURE_TEXTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"de.sebastianbenz.xgherkin.Gherkin.FEATURE_TEXT");
                    				

                    }


                    }
                    break;

            }

            // InternalGherkin.g:115:3: ( (lv_elements_2_0= ruleNarrativeElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_TEXT && LA3_0<=RULE_I_WANT_TO)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGherkin.g:116:4: (lv_elements_2_0= ruleNarrativeElement )
            	    {
            	    // InternalGherkin.g:116:4: (lv_elements_2_0= ruleNarrativeElement )
            	    // InternalGherkin.g:117:5: lv_elements_2_0= ruleNarrativeElement
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getElementsNarrativeElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_elements_2_0=ruleNarrativeElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.NarrativeElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalGherkin.g:134:3: ( (lv_scenarios_3_0= ruleAbstractScenario ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_TAG||(LA4_0>=RULE_SCENARIO_TEXT && LA4_0<=RULE_SCENARIO_OUTLINE_TEXT)||LA4_0==RULE_BACKGROUND_TEXT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGherkin.g:135:4: (lv_scenarios_3_0= ruleAbstractScenario )
            	    {
            	    // InternalGherkin.g:135:4: (lv_scenarios_3_0= ruleAbstractScenario )
            	    // InternalGherkin.g:136:5: lv_scenarios_3_0= ruleAbstractScenario
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_scenarios_3_0=ruleAbstractScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_3_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.AbstractScenario");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleNarrativeElement"
    // InternalGherkin.g:157:1: entryRuleNarrativeElement returns [EObject current=null] : iv_ruleNarrativeElement= ruleNarrativeElement EOF ;
    public final EObject entryRuleNarrativeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNarrativeElement = null;


        try {
            // InternalGherkin.g:157:57: (iv_ruleNarrativeElement= ruleNarrativeElement EOF )
            // InternalGherkin.g:158:2: iv_ruleNarrativeElement= ruleNarrativeElement EOF
            {
             newCompositeNode(grammarAccess.getNarrativeElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNarrativeElement=ruleNarrativeElement();

            state._fsp--;

             current =iv_ruleNarrativeElement; 
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
    // $ANTLR end "entryRuleNarrativeElement"


    // $ANTLR start "ruleNarrativeElement"
    // InternalGherkin.g:164:1: ruleNarrativeElement returns [EObject current=null] : (this_InOrderTo_0= ruleInOrderTo | this_AsA_1= ruleAsA | this_IWantTo_2= ruleIWantTo | this_FreeText_3= ruleFreeText ) ;
    public final EObject ruleNarrativeElement() throws RecognitionException {
        EObject current = null;

        EObject this_InOrderTo_0 = null;

        EObject this_AsA_1 = null;

        EObject this_IWantTo_2 = null;

        EObject this_FreeText_3 = null;



        	enterRule();

        try {
            // InternalGherkin.g:170:2: ( (this_InOrderTo_0= ruleInOrderTo | this_AsA_1= ruleAsA | this_IWantTo_2= ruleIWantTo | this_FreeText_3= ruleFreeText ) )
            // InternalGherkin.g:171:2: (this_InOrderTo_0= ruleInOrderTo | this_AsA_1= ruleAsA | this_IWantTo_2= ruleIWantTo | this_FreeText_3= ruleFreeText )
            {
            // InternalGherkin.g:171:2: (this_InOrderTo_0= ruleInOrderTo | this_AsA_1= ruleAsA | this_IWantTo_2= ruleIWantTo | this_FreeText_3= ruleFreeText )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_IN_ORDER_TO:
                {
                alt5=1;
                }
                break;
            case RULE_AS_A:
                {
                alt5=2;
                }
                break;
            case RULE_I_WANT_TO:
                {
                alt5=3;
                }
                break;
            case RULE_TEXT:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGherkin.g:172:3: this_InOrderTo_0= ruleInOrderTo
                    {

                    			newCompositeNode(grammarAccess.getNarrativeElementAccess().getInOrderToParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InOrderTo_0=ruleInOrderTo();

                    state._fsp--;


                    			current = this_InOrderTo_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGherkin.g:181:3: this_AsA_1= ruleAsA
                    {

                    			newCompositeNode(grammarAccess.getNarrativeElementAccess().getAsAParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AsA_1=ruleAsA();

                    state._fsp--;


                    			current = this_AsA_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGherkin.g:190:3: this_IWantTo_2= ruleIWantTo
                    {

                    			newCompositeNode(grammarAccess.getNarrativeElementAccess().getIWantToParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IWantTo_2=ruleIWantTo();

                    state._fsp--;


                    			current = this_IWantTo_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGherkin.g:199:3: this_FreeText_3= ruleFreeText
                    {

                    			newCompositeNode(grammarAccess.getNarrativeElementAccess().getFreeTextParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FreeText_3=ruleFreeText();

                    state._fsp--;


                    			current = this_FreeText_3;
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
    // $ANTLR end "ruleNarrativeElement"


    // $ANTLR start "entryRuleFreeText"
    // InternalGherkin.g:211:1: entryRuleFreeText returns [EObject current=null] : iv_ruleFreeText= ruleFreeText EOF ;
    public final EObject entryRuleFreeText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeText = null;


        try {
            // InternalGherkin.g:211:49: (iv_ruleFreeText= ruleFreeText EOF )
            // InternalGherkin.g:212:2: iv_ruleFreeText= ruleFreeText EOF
            {
             newCompositeNode(grammarAccess.getFreeTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFreeText=ruleFreeText();

            state._fsp--;

             current =iv_ruleFreeText; 
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
    // $ANTLR end "entryRuleFreeText"


    // $ANTLR start "ruleFreeText"
    // InternalGherkin.g:218:1: ruleFreeText returns [EObject current=null] : ( (lv_name_0_0= RULE_TEXT ) ) ;
    public final EObject ruleFreeText() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGherkin.g:224:2: ( ( (lv_name_0_0= RULE_TEXT ) ) )
            // InternalGherkin.g:225:2: ( (lv_name_0_0= RULE_TEXT ) )
            {
            // InternalGherkin.g:225:2: ( (lv_name_0_0= RULE_TEXT ) )
            // InternalGherkin.g:226:3: (lv_name_0_0= RULE_TEXT )
            {
            // InternalGherkin.g:226:3: (lv_name_0_0= RULE_TEXT )
            // InternalGherkin.g:227:4: lv_name_0_0= RULE_TEXT
            {
            lv_name_0_0=(Token)match(input,RULE_TEXT,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFreeTextAccess().getNameTEXTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFreeTextRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"de.sebastianbenz.xgherkin.Gherkin.TEXT");
            			

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
    // $ANTLR end "ruleFreeText"


    // $ANTLR start "entryRuleAsA"
    // InternalGherkin.g:246:1: entryRuleAsA returns [EObject current=null] : iv_ruleAsA= ruleAsA EOF ;
    public final EObject entryRuleAsA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsA = null;


        try {
            // InternalGherkin.g:246:44: (iv_ruleAsA= ruleAsA EOF )
            // InternalGherkin.g:247:2: iv_ruleAsA= ruleAsA EOF
            {
             newCompositeNode(grammarAccess.getAsARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsA=ruleAsA();

            state._fsp--;

             current =iv_ruleAsA; 
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
    // $ANTLR end "entryRuleAsA"


    // $ANTLR start "ruleAsA"
    // InternalGherkin.g:253:1: ruleAsA returns [EObject current=null] : ( (lv_name_0_0= RULE_AS_A ) ) ;
    public final EObject ruleAsA() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGherkin.g:259:2: ( ( (lv_name_0_0= RULE_AS_A ) ) )
            // InternalGherkin.g:260:2: ( (lv_name_0_0= RULE_AS_A ) )
            {
            // InternalGherkin.g:260:2: ( (lv_name_0_0= RULE_AS_A ) )
            // InternalGherkin.g:261:3: (lv_name_0_0= RULE_AS_A )
            {
            // InternalGherkin.g:261:3: (lv_name_0_0= RULE_AS_A )
            // InternalGherkin.g:262:4: lv_name_0_0= RULE_AS_A
            {
            lv_name_0_0=(Token)match(input,RULE_AS_A,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAsAAccess().getNameAS_ATerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAsARule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"de.sebastianbenz.xgherkin.Gherkin.AS_A");
            			

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
    // $ANTLR end "ruleAsA"


    // $ANTLR start "entryRuleInOrderTo"
    // InternalGherkin.g:281:1: entryRuleInOrderTo returns [EObject current=null] : iv_ruleInOrderTo= ruleInOrderTo EOF ;
    public final EObject entryRuleInOrderTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInOrderTo = null;


        try {
            // InternalGherkin.g:281:50: (iv_ruleInOrderTo= ruleInOrderTo EOF )
            // InternalGherkin.g:282:2: iv_ruleInOrderTo= ruleInOrderTo EOF
            {
             newCompositeNode(grammarAccess.getInOrderToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInOrderTo=ruleInOrderTo();

            state._fsp--;

             current =iv_ruleInOrderTo; 
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
    // $ANTLR end "entryRuleInOrderTo"


    // $ANTLR start "ruleInOrderTo"
    // InternalGherkin.g:288:1: ruleInOrderTo returns [EObject current=null] : ( (lv_name_0_0= RULE_IN_ORDER_TO ) ) ;
    public final EObject ruleInOrderTo() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGherkin.g:294:2: ( ( (lv_name_0_0= RULE_IN_ORDER_TO ) ) )
            // InternalGherkin.g:295:2: ( (lv_name_0_0= RULE_IN_ORDER_TO ) )
            {
            // InternalGherkin.g:295:2: ( (lv_name_0_0= RULE_IN_ORDER_TO ) )
            // InternalGherkin.g:296:3: (lv_name_0_0= RULE_IN_ORDER_TO )
            {
            // InternalGherkin.g:296:3: (lv_name_0_0= RULE_IN_ORDER_TO )
            // InternalGherkin.g:297:4: lv_name_0_0= RULE_IN_ORDER_TO
            {
            lv_name_0_0=(Token)match(input,RULE_IN_ORDER_TO,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getInOrderToAccess().getNameIN_ORDER_TOTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInOrderToRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"de.sebastianbenz.xgherkin.Gherkin.IN_ORDER_TO");
            			

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
    // $ANTLR end "ruleInOrderTo"


    // $ANTLR start "entryRuleIWantTo"
    // InternalGherkin.g:316:1: entryRuleIWantTo returns [EObject current=null] : iv_ruleIWantTo= ruleIWantTo EOF ;
    public final EObject entryRuleIWantTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIWantTo = null;


        try {
            // InternalGherkin.g:316:48: (iv_ruleIWantTo= ruleIWantTo EOF )
            // InternalGherkin.g:317:2: iv_ruleIWantTo= ruleIWantTo EOF
            {
             newCompositeNode(grammarAccess.getIWantToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIWantTo=ruleIWantTo();

            state._fsp--;

             current =iv_ruleIWantTo; 
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
    // $ANTLR end "entryRuleIWantTo"


    // $ANTLR start "ruleIWantTo"
    // InternalGherkin.g:323:1: ruleIWantTo returns [EObject current=null] : ( (lv_name_0_0= RULE_I_WANT_TO ) ) ;
    public final EObject ruleIWantTo() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGherkin.g:329:2: ( ( (lv_name_0_0= RULE_I_WANT_TO ) ) )
            // InternalGherkin.g:330:2: ( (lv_name_0_0= RULE_I_WANT_TO ) )
            {
            // InternalGherkin.g:330:2: ( (lv_name_0_0= RULE_I_WANT_TO ) )
            // InternalGherkin.g:331:3: (lv_name_0_0= RULE_I_WANT_TO )
            {
            // InternalGherkin.g:331:3: (lv_name_0_0= RULE_I_WANT_TO )
            // InternalGherkin.g:332:4: lv_name_0_0= RULE_I_WANT_TO
            {
            lv_name_0_0=(Token)match(input,RULE_I_WANT_TO,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getIWantToAccess().getNameI_WANT_TOTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIWantToRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"de.sebastianbenz.xgherkin.Gherkin.I_WANT_TO");
            			

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
    // $ANTLR end "ruleIWantTo"


    // $ANTLR start "entryRuleAbstractScenario"
    // InternalGherkin.g:351:1: entryRuleAbstractScenario returns [EObject current=null] : iv_ruleAbstractScenario= ruleAbstractScenario EOF ;
    public final EObject entryRuleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractScenario = null;


        try {
            // InternalGherkin.g:351:57: (iv_ruleAbstractScenario= ruleAbstractScenario EOF )
            // InternalGherkin.g:352:2: iv_ruleAbstractScenario= ruleAbstractScenario EOF
            {
             newCompositeNode(grammarAccess.getAbstractScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractScenario=ruleAbstractScenario();

            state._fsp--;

             current =iv_ruleAbstractScenario; 
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
    // $ANTLR end "entryRuleAbstractScenario"


    // $ANTLR start "ruleAbstractScenario"
    // InternalGherkin.g:358:1: ruleAbstractScenario returns [EObject current=null] : (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioWithOutline_2= ruleScenarioWithOutline ) ;
    public final EObject ruleAbstractScenario() throws RecognitionException {
        EObject current = null;

        EObject this_Background_0 = null;

        EObject this_Scenario_1 = null;

        EObject this_ScenarioWithOutline_2 = null;



        	enterRule();

        try {
            // InternalGherkin.g:364:2: ( (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioWithOutline_2= ruleScenarioWithOutline ) )
            // InternalGherkin.g:365:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioWithOutline_2= ruleScenarioWithOutline )
            {
            // InternalGherkin.g:365:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioWithOutline_2= ruleScenarioWithOutline )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalGherkin.g:366:3: this_Background_0= ruleBackground
                    {

                    			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Background_0=ruleBackground();

                    state._fsp--;


                    			current = this_Background_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGherkin.g:375:3: this_Scenario_1= ruleScenario
                    {

                    			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Scenario_1=ruleScenario();

                    state._fsp--;


                    			current = this_Scenario_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGherkin.g:384:3: this_ScenarioWithOutline_2= ruleScenarioWithOutline
                    {

                    			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioWithOutlineParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScenarioWithOutline_2=ruleScenarioWithOutline();

                    state._fsp--;


                    			current = this_ScenarioWithOutline_2;
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
    // $ANTLR end "ruleAbstractScenario"


    // $ANTLR start "entryRuleScenario"
    // InternalGherkin.g:396:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalGherkin.g:396:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalGherkin.g:397:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalGherkin.g:403:1: ruleScenario returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_steps_3_0 = null;



        	enterRule();

        try {
            // InternalGherkin.g:409:2: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ ) )
            // InternalGherkin.g:410:2: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ )
            {
            // InternalGherkin.g:410:2: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ )
            // InternalGherkin.g:411:3: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+
            {
            // InternalGherkin.g:411:3: ( (lv_tags_0_0= RULE_TAG ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_TAG) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGherkin.g:412:4: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // InternalGherkin.g:412:4: (lv_tags_0_0= RULE_TAG )
            	    // InternalGherkin.g:413:5: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_6); 

            	    					newLeafNode(lv_tags_0_0, grammarAccess.getScenarioAccess().getTagsTAGTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getScenarioRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"tags",
            	    						lv_tags_0_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.TAG");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalGherkin.g:429:3: ( (lv_name_1_0= RULE_SCENARIO_TEXT ) )
            // InternalGherkin.g:430:4: (lv_name_1_0= RULE_SCENARIO_TEXT )
            {
            // InternalGherkin.g:430:4: (lv_name_1_0= RULE_SCENARIO_TEXT )
            // InternalGherkin.g:431:5: lv_name_1_0= RULE_SCENARIO_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_SCENARIO_TEXT,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameSCENARIO_TEXTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScenarioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.sebastianbenz.xgherkin.Gherkin.SCENARIO_TEXT");
            				

            }


            }

            // InternalGherkin.g:447:3: ( (lv_elements_2_0= ruleNarrativeElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_TEXT && LA8_0<=RULE_I_WANT_TO)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGherkin.g:448:4: (lv_elements_2_0= ruleNarrativeElement )
            	    {
            	    // InternalGherkin.g:448:4: (lv_elements_2_0= ruleNarrativeElement )
            	    // InternalGherkin.g:449:5: lv_elements_2_0= ruleNarrativeElement
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getElementsNarrativeElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elements_2_0=ruleNarrativeElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.NarrativeElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalGherkin.g:466:3: ( (lv_steps_3_0= ruleStep ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalGherkin.g:467:4: (lv_steps_3_0= ruleStep )
            	    {
            	    // InternalGherkin.g:467:4: (lv_steps_3_0= ruleStep )
            	    // InternalGherkin.g:468:5: lv_steps_3_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_steps_3_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_3_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.Step");
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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleScenarioWithOutline"
    // InternalGherkin.g:489:1: entryRuleScenarioWithOutline returns [EObject current=null] : iv_ruleScenarioWithOutline= ruleScenarioWithOutline EOF ;
    public final EObject entryRuleScenarioWithOutline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioWithOutline = null;


        try {
            // InternalGherkin.g:489:60: (iv_ruleScenarioWithOutline= ruleScenarioWithOutline EOF )
            // InternalGherkin.g:490:2: iv_ruleScenarioWithOutline= ruleScenarioWithOutline EOF
            {
             newCompositeNode(grammarAccess.getScenarioWithOutlineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenarioWithOutline=ruleScenarioWithOutline();

            state._fsp--;

             current =iv_ruleScenarioWithOutline; 
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
    // $ANTLR end "entryRuleScenarioWithOutline"


    // $ANTLR start "ruleScenarioWithOutline"
    // InternalGherkin.g:496:1: ruleScenarioWithOutline returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ ( (lv_example_4_0= ruleExample ) ) ) ;
    public final EObject ruleScenarioWithOutline() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;

        EObject lv_steps_3_0 = null;

        EObject lv_example_4_0 = null;



        	enterRule();

        try {
            // InternalGherkin.g:502:2: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ ( (lv_example_4_0= ruleExample ) ) ) )
            // InternalGherkin.g:503:2: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ ( (lv_example_4_0= ruleExample ) ) )
            {
            // InternalGherkin.g:503:2: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ ( (lv_example_4_0= ruleExample ) ) )
            // InternalGherkin.g:504:3: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) ) ( (lv_elements_2_0= ruleNarrativeElement ) )* ( (lv_steps_3_0= ruleStep ) )+ ( (lv_example_4_0= ruleExample ) )
            {
            // InternalGherkin.g:504:3: ( (lv_tags_0_0= RULE_TAG ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_TAG) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGherkin.g:505:4: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // InternalGherkin.g:505:4: (lv_tags_0_0= RULE_TAG )
            	    // InternalGherkin.g:506:5: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_9); 

            	    					newLeafNode(lv_tags_0_0, grammarAccess.getScenarioWithOutlineAccess().getTagsTAGTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getScenarioWithOutlineRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"tags",
            	    						lv_tags_0_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.TAG");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalGherkin.g:522:3: ( (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT ) )
            // InternalGherkin.g:523:4: (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT )
            {
            // InternalGherkin.g:523:4: (lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT )
            // InternalGherkin.g:524:5: lv_name_1_0= RULE_SCENARIO_OUTLINE_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_SCENARIO_OUTLINE_TEXT,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScenarioWithOutlineAccess().getNameSCENARIO_OUTLINE_TEXTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScenarioWithOutlineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.sebastianbenz.xgherkin.Gherkin.SCENARIO_OUTLINE_TEXT");
            				

            }


            }

            // InternalGherkin.g:540:3: ( (lv_elements_2_0= ruleNarrativeElement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_TEXT && LA11_0<=RULE_I_WANT_TO)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGherkin.g:541:4: (lv_elements_2_0= ruleNarrativeElement )
            	    {
            	    // InternalGherkin.g:541:4: (lv_elements_2_0= ruleNarrativeElement )
            	    // InternalGherkin.g:542:5: lv_elements_2_0= ruleNarrativeElement
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getElementsNarrativeElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elements_2_0=ruleNarrativeElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.NarrativeElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalGherkin.g:559:3: ( (lv_steps_3_0= ruleStep ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_TAG||(LA12_0>=RULE_WHEN_TEXT && LA12_0<=RULE_AND_TEXT)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGherkin.g:560:4: (lv_steps_3_0= ruleStep )
            	    {
            	    // InternalGherkin.g:560:4: (lv_steps_3_0= ruleStep )
            	    // InternalGherkin.g:561:5: lv_steps_3_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getStepsStepParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_steps_3_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_3_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // InternalGherkin.g:578:3: ( (lv_example_4_0= ruleExample ) )
            // InternalGherkin.g:579:4: (lv_example_4_0= ruleExample )
            {
            // InternalGherkin.g:579:4: (lv_example_4_0= ruleExample )
            // InternalGherkin.g:580:5: lv_example_4_0= ruleExample
            {

            					newCompositeNode(grammarAccess.getScenarioWithOutlineAccess().getExampleExampleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_example_4_0=ruleExample();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioWithOutlineRule());
            					}
            					set(
            						current,
            						"example",
            						lv_example_4_0,
            						"de.sebastianbenz.xgherkin.Gherkin.Example");
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
    // $ANTLR end "ruleScenarioWithOutline"


    // $ANTLR start "entryRuleExample"
    // InternalGherkin.g:601:1: entryRuleExample returns [EObject current=null] : iv_ruleExample= ruleExample EOF ;
    public final EObject entryRuleExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExample = null;


        try {
            // InternalGherkin.g:601:48: (iv_ruleExample= ruleExample EOF )
            // InternalGherkin.g:602:2: iv_ruleExample= ruleExample EOF
            {
             newCompositeNode(grammarAccess.getExampleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExample=ruleExample();

            state._fsp--;

             current =iv_ruleExample; 
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
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // InternalGherkin.g:608:1: ruleExample returns [EObject current=null] : (this_EXAMPLE_HEADING_0= RULE_EXAMPLE_HEADING ( (lv_heading_1_0= ruleExampleRow ) ) ( (lv_rows_2_0= ruleExampleRow ) )* ) ;
    public final EObject ruleExample() throws RecognitionException {
        EObject current = null;

        Token this_EXAMPLE_HEADING_0=null;
        EObject lv_heading_1_0 = null;

        EObject lv_rows_2_0 = null;



        	enterRule();

        try {
            // InternalGherkin.g:614:2: ( (this_EXAMPLE_HEADING_0= RULE_EXAMPLE_HEADING ( (lv_heading_1_0= ruleExampleRow ) ) ( (lv_rows_2_0= ruleExampleRow ) )* ) )
            // InternalGherkin.g:615:2: (this_EXAMPLE_HEADING_0= RULE_EXAMPLE_HEADING ( (lv_heading_1_0= ruleExampleRow ) ) ( (lv_rows_2_0= ruleExampleRow ) )* )
            {
            // InternalGherkin.g:615:2: (this_EXAMPLE_HEADING_0= RULE_EXAMPLE_HEADING ( (lv_heading_1_0= ruleExampleRow ) ) ( (lv_rows_2_0= ruleExampleRow ) )* )
            // InternalGherkin.g:616:3: this_EXAMPLE_HEADING_0= RULE_EXAMPLE_HEADING ( (lv_heading_1_0= ruleExampleRow ) ) ( (lv_rows_2_0= ruleExampleRow ) )*
            {
            this_EXAMPLE_HEADING_0=(Token)match(input,RULE_EXAMPLE_HEADING,FOLLOW_11); 

            			newLeafNode(this_EXAMPLE_HEADING_0, grammarAccess.getExampleAccess().getEXAMPLE_HEADINGTerminalRuleCall_0());
            		
            // InternalGherkin.g:620:3: ( (lv_heading_1_0= ruleExampleRow ) )
            // InternalGherkin.g:621:4: (lv_heading_1_0= ruleExampleRow )
            {
            // InternalGherkin.g:621:4: (lv_heading_1_0= ruleExampleRow )
            // InternalGherkin.g:622:5: lv_heading_1_0= ruleExampleRow
            {

            					newCompositeNode(grammarAccess.getExampleAccess().getHeadingExampleRowParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_heading_1_0=ruleExampleRow();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExampleRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_1_0,
            						"de.sebastianbenz.xgherkin.Gherkin.ExampleRow");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGherkin.g:639:3: ( (lv_rows_2_0= ruleExampleRow ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_EXAMPLE_CELL) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGherkin.g:640:4: (lv_rows_2_0= ruleExampleRow )
            	    {
            	    // InternalGherkin.g:640:4: (lv_rows_2_0= ruleExampleRow )
            	    // InternalGherkin.g:641:5: lv_rows_2_0= ruleExampleRow
            	    {

            	    					newCompositeNode(grammarAccess.getExampleAccess().getRowsExampleRowParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_rows_2_0=ruleExampleRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExampleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rows",
            	    						lv_rows_2_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.ExampleRow");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleExampleRow"
    // InternalGherkin.g:662:1: entryRuleExampleRow returns [EObject current=null] : iv_ruleExampleRow= ruleExampleRow EOF ;
    public final EObject entryRuleExampleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExampleRow = null;


        try {
            // InternalGherkin.g:662:51: (iv_ruleExampleRow= ruleExampleRow EOF )
            // InternalGherkin.g:663:2: iv_ruleExampleRow= ruleExampleRow EOF
            {
             newCompositeNode(grammarAccess.getExampleRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExampleRow=ruleExampleRow();

            state._fsp--;

             current =iv_ruleExampleRow; 
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
    // $ANTLR end "entryRuleExampleRow"


    // $ANTLR start "ruleExampleRow"
    // InternalGherkin.g:669:1: ruleExampleRow returns [EObject current=null] : ( ( (lv_cells_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END ) ;
    public final EObject ruleExampleRow() throws RecognitionException {
        EObject current = null;

        Token this_EXAMPLE_ROW_END_1=null;
        EObject lv_cells_0_0 = null;



        	enterRule();

        try {
            // InternalGherkin.g:675:2: ( ( ( (lv_cells_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END ) )
            // InternalGherkin.g:676:2: ( ( (lv_cells_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END )
            {
            // InternalGherkin.g:676:2: ( ( (lv_cells_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END )
            // InternalGherkin.g:677:3: ( (lv_cells_0_0= ruleExampleCell ) )+ this_EXAMPLE_ROW_END_1= RULE_EXAMPLE_ROW_END
            {
            // InternalGherkin.g:677:3: ( (lv_cells_0_0= ruleExampleCell ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_EXAMPLE_CELL) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGherkin.g:678:4: (lv_cells_0_0= ruleExampleCell )
            	    {
            	    // InternalGherkin.g:678:4: (lv_cells_0_0= ruleExampleCell )
            	    // InternalGherkin.g:679:5: lv_cells_0_0= ruleExampleCell
            	    {

            	    					newCompositeNode(grammarAccess.getExampleRowAccess().getCellsExampleCellParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_cells_0_0=ruleExampleCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExampleRowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cells",
            	    						lv_cells_0_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.ExampleCell");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            this_EXAMPLE_ROW_END_1=(Token)match(input,RULE_EXAMPLE_ROW_END,FOLLOW_2); 

            			newLeafNode(this_EXAMPLE_ROW_END_1, grammarAccess.getExampleRowAccess().getEXAMPLE_ROW_ENDTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleExampleRow"


    // $ANTLR start "entryRuleExampleCell"
    // InternalGherkin.g:704:1: entryRuleExampleCell returns [EObject current=null] : iv_ruleExampleCell= ruleExampleCell EOF ;
    public final EObject entryRuleExampleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExampleCell = null;


        try {
            // InternalGherkin.g:704:52: (iv_ruleExampleCell= ruleExampleCell EOF )
            // InternalGherkin.g:705:2: iv_ruleExampleCell= ruleExampleCell EOF
            {
             newCompositeNode(grammarAccess.getExampleCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExampleCell=ruleExampleCell();

            state._fsp--;

             current =iv_ruleExampleCell; 
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
    // $ANTLR end "entryRuleExampleCell"


    // $ANTLR start "ruleExampleCell"
    // InternalGherkin.g:711:1: ruleExampleCell returns [EObject current=null] : ( (lv_value_0_0= RULE_EXAMPLE_CELL ) ) ;
    public final EObject ruleExampleCell() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGherkin.g:717:2: ( ( (lv_value_0_0= RULE_EXAMPLE_CELL ) ) )
            // InternalGherkin.g:718:2: ( (lv_value_0_0= RULE_EXAMPLE_CELL ) )
            {
            // InternalGherkin.g:718:2: ( (lv_value_0_0= RULE_EXAMPLE_CELL ) )
            // InternalGherkin.g:719:3: (lv_value_0_0= RULE_EXAMPLE_CELL )
            {
            // InternalGherkin.g:719:3: (lv_value_0_0= RULE_EXAMPLE_CELL )
            // InternalGherkin.g:720:4: lv_value_0_0= RULE_EXAMPLE_CELL
            {
            lv_value_0_0=(Token)match(input,RULE_EXAMPLE_CELL,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getExampleCellAccess().getValueEXAMPLE_CELLTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExampleCellRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.sebastianbenz.xgherkin.Gherkin.EXAMPLE_CELL");
            			

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
    // $ANTLR end "ruleExampleCell"


    // $ANTLR start "entryRuleBackground"
    // InternalGherkin.g:739:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalGherkin.g:739:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalGherkin.g:740:2: iv_ruleBackground= ruleBackground EOF
            {
             newCompositeNode(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackground=ruleBackground();

            state._fsp--;

             current =iv_ruleBackground; 
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
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // InternalGherkin.g:746:1: ruleBackground returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_name_1_0=null;
        EObject lv_steps_2_0 = null;



        	enterRule();

        try {
            // InternalGherkin.g:752:2: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* ) )
            // InternalGherkin.g:753:2: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* )
            {
            // InternalGherkin.g:753:2: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )* )
            // InternalGherkin.g:754:3: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) ) ( (lv_steps_2_0= ruleStep ) )*
            {
            // InternalGherkin.g:754:3: ( (lv_tags_0_0= RULE_TAG ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_TAG) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGherkin.g:755:4: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // InternalGherkin.g:755:4: (lv_tags_0_0= RULE_TAG )
            	    // InternalGherkin.g:756:5: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_14); 

            	    					newLeafNode(lv_tags_0_0, grammarAccess.getBackgroundAccess().getTagsTAGTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getBackgroundRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"tags",
            	    						lv_tags_0_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.TAG");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalGherkin.g:772:3: ( (lv_name_1_0= RULE_BACKGROUND_TEXT ) )
            // InternalGherkin.g:773:4: (lv_name_1_0= RULE_BACKGROUND_TEXT )
            {
            // InternalGherkin.g:773:4: (lv_name_1_0= RULE_BACKGROUND_TEXT )
            // InternalGherkin.g:774:5: lv_name_1_0= RULE_BACKGROUND_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_BACKGROUND_TEXT,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBackgroundAccess().getNameBACKGROUND_TEXTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackgroundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.sebastianbenz.xgherkin.Gherkin.BACKGROUND_TEXT");
            				

            }


            }

            // InternalGherkin.g:790:3: ( (lv_steps_2_0= ruleStep ) )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalGherkin.g:791:4: (lv_steps_2_0= ruleStep )
            	    {
            	    // InternalGherkin.g:791:4: (lv_steps_2_0= ruleStep )
            	    // InternalGherkin.g:792:5: lv_steps_2_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_steps_2_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_2_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.Step");
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
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleStep"
    // InternalGherkin.g:813:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalGherkin.g:813:45: (iv_ruleStep= ruleStep EOF )
            // InternalGherkin.g:814:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalGherkin.g:820:1: ruleStep returns [EObject current=null] : (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_WhenStep_0 = null;

        EObject this_ThenStep_1 = null;

        EObject this_GivenStep_2 = null;

        EObject this_AndStep_3 = null;



        	enterRule();

        try {
            // InternalGherkin.g:826:2: ( (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep ) )
            // InternalGherkin.g:827:2: (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep )
            {
            // InternalGherkin.g:827:2: (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep )
            int alt17=4;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalGherkin.g:828:3: this_WhenStep_0= ruleWhenStep
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getWhenStepParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhenStep_0=ruleWhenStep();

                    state._fsp--;


                    			current = this_WhenStep_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGherkin.g:837:3: this_ThenStep_1= ruleThenStep
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getThenStepParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ThenStep_1=ruleThenStep();

                    state._fsp--;


                    			current = this_ThenStep_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGherkin.g:846:3: this_GivenStep_2= ruleGivenStep
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getGivenStepParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GivenStep_2=ruleGivenStep();

                    state._fsp--;


                    			current = this_GivenStep_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGherkin.g:855:3: this_AndStep_3= ruleAndStep
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getAndStepParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AndStep_3=ruleAndStep();

                    state._fsp--;


                    			current = this_AndStep_3;
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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleWhenStep"
    // InternalGherkin.g:867:1: entryRuleWhenStep returns [EObject current=null] : iv_ruleWhenStep= ruleWhenStep EOF ;
    public final EObject entryRuleWhenStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenStep = null;


        try {
            // InternalGherkin.g:867:49: (iv_ruleWhenStep= ruleWhenStep EOF )
            // InternalGherkin.g:868:2: iv_ruleWhenStep= ruleWhenStep EOF
            {
             newCompositeNode(grammarAccess.getWhenStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhenStep=ruleWhenStep();

            state._fsp--;

             current =iv_ruleWhenStep; 
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
    // $ANTLR end "entryRuleWhenStep"


    // $ANTLR start "ruleWhenStep"
    // InternalGherkin.g:874:1: ruleWhenStep returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* ) ;
    public final EObject ruleWhenStep() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_desc_1_0=null;
        AntlrDatatypeRuleToken lv_desc_2_0 = null;

        EObject lv_rows_3_0 = null;



        	enterRule();

        try {
            // InternalGherkin.g:880:2: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* ) )
            // InternalGherkin.g:881:2: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* )
            {
            // InternalGherkin.g:881:2: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* )
            // InternalGherkin.g:882:3: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_WHEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )*
            {
            // InternalGherkin.g:882:3: ( (lv_tags_0_0= RULE_TAG ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_TAG) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGherkin.g:883:4: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // InternalGherkin.g:883:4: (lv_tags_0_0= RULE_TAG )
            	    // InternalGherkin.g:884:5: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_15); 

            	    					newLeafNode(lv_tags_0_0, grammarAccess.getWhenStepAccess().getTagsTAGTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getWhenStepRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"tags",
            	    						lv_tags_0_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.TAG");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalGherkin.g:900:3: ( (lv_desc_1_0= RULE_WHEN_TEXT ) )
            // InternalGherkin.g:901:4: (lv_desc_1_0= RULE_WHEN_TEXT )
            {
            // InternalGherkin.g:901:4: (lv_desc_1_0= RULE_WHEN_TEXT )
            // InternalGherkin.g:902:5: lv_desc_1_0= RULE_WHEN_TEXT
            {
            lv_desc_1_0=(Token)match(input,RULE_WHEN_TEXT,FOLLOW_16); 

            					newLeafNode(lv_desc_1_0, grammarAccess.getWhenStepAccess().getDescWHEN_TEXTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhenStepRule());
            					}
            					addWithLastConsumed(
            						current,
            						"desc",
            						lv_desc_1_0,
            						"de.sebastianbenz.xgherkin.Gherkin.WHEN_TEXT");
            				

            }


            }

            // InternalGherkin.g:918:3: ( (lv_desc_2_0= ruleOptionalText ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_TEXT||LA19_0==RULE_CODE) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGherkin.g:919:4: (lv_desc_2_0= ruleOptionalText )
            	    {
            	    // InternalGherkin.g:919:4: (lv_desc_2_0= ruleOptionalText )
            	    // InternalGherkin.g:920:5: lv_desc_2_0= ruleOptionalText
            	    {

            	    					newCompositeNode(grammarAccess.getWhenStepAccess().getDescOptionalTextParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_desc_2_0=ruleOptionalText();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhenStepRule());
            	    					}
            	    					add(
            	    						current,
            	    						"desc",
            	    						lv_desc_2_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.OptionalText");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalGherkin.g:937:3: ( (lv_rows_3_0= ruleExampleRow ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_EXAMPLE_CELL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGherkin.g:938:4: (lv_rows_3_0= ruleExampleRow )
            	    {
            	    // InternalGherkin.g:938:4: (lv_rows_3_0= ruleExampleRow )
            	    // InternalGherkin.g:939:5: lv_rows_3_0= ruleExampleRow
            	    {

            	    					newCompositeNode(grammarAccess.getWhenStepAccess().getRowsExampleRowParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_rows_3_0=ruleExampleRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhenStepRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rows",
            	    						lv_rows_3_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.ExampleRow");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleWhenStep"


    // $ANTLR start "entryRuleThenStep"
    // InternalGherkin.g:960:1: entryRuleThenStep returns [EObject current=null] : iv_ruleThenStep= ruleThenStep EOF ;
    public final EObject entryRuleThenStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThenStep = null;


        try {
            // InternalGherkin.g:960:49: (iv_ruleThenStep= ruleThenStep EOF )
            // InternalGherkin.g:961:2: iv_ruleThenStep= ruleThenStep EOF
            {
             newCompositeNode(grammarAccess.getThenStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThenStep=ruleThenStep();

            state._fsp--;

             current =iv_ruleThenStep; 
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
    // $ANTLR end "entryRuleThenStep"


    // $ANTLR start "ruleThenStep"
    // InternalGherkin.g:967:1: ruleThenStep returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* ) ;
    public final EObject ruleThenStep() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_desc_1_0=null;
        AntlrDatatypeRuleToken lv_desc_2_0 = null;

        EObject lv_rows_3_0 = null;



        	enterRule();

        try {
            // InternalGherkin.g:973:2: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* ) )
            // InternalGherkin.g:974:2: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* )
            {
            // InternalGherkin.g:974:2: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* )
            // InternalGherkin.g:975:3: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_THEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )*
            {
            // InternalGherkin.g:975:3: ( (lv_tags_0_0= RULE_TAG ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_TAG) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGherkin.g:976:4: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // InternalGherkin.g:976:4: (lv_tags_0_0= RULE_TAG )
            	    // InternalGherkin.g:977:5: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_17); 

            	    					newLeafNode(lv_tags_0_0, grammarAccess.getThenStepAccess().getTagsTAGTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getThenStepRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"tags",
            	    						lv_tags_0_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.TAG");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalGherkin.g:993:3: ( (lv_desc_1_0= RULE_THEN_TEXT ) )
            // InternalGherkin.g:994:4: (lv_desc_1_0= RULE_THEN_TEXT )
            {
            // InternalGherkin.g:994:4: (lv_desc_1_0= RULE_THEN_TEXT )
            // InternalGherkin.g:995:5: lv_desc_1_0= RULE_THEN_TEXT
            {
            lv_desc_1_0=(Token)match(input,RULE_THEN_TEXT,FOLLOW_16); 

            					newLeafNode(lv_desc_1_0, grammarAccess.getThenStepAccess().getDescTHEN_TEXTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThenStepRule());
            					}
            					addWithLastConsumed(
            						current,
            						"desc",
            						lv_desc_1_0,
            						"de.sebastianbenz.xgherkin.Gherkin.THEN_TEXT");
            				

            }


            }

            // InternalGherkin.g:1011:3: ( (lv_desc_2_0= ruleOptionalText ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_TEXT||LA22_0==RULE_CODE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGherkin.g:1012:4: (lv_desc_2_0= ruleOptionalText )
            	    {
            	    // InternalGherkin.g:1012:4: (lv_desc_2_0= ruleOptionalText )
            	    // InternalGherkin.g:1013:5: lv_desc_2_0= ruleOptionalText
            	    {

            	    					newCompositeNode(grammarAccess.getThenStepAccess().getDescOptionalTextParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_desc_2_0=ruleOptionalText();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getThenStepRule());
            	    					}
            	    					add(
            	    						current,
            	    						"desc",
            	    						lv_desc_2_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.OptionalText");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalGherkin.g:1030:3: ( (lv_rows_3_0= ruleExampleRow ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_EXAMPLE_CELL) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGherkin.g:1031:4: (lv_rows_3_0= ruleExampleRow )
            	    {
            	    // InternalGherkin.g:1031:4: (lv_rows_3_0= ruleExampleRow )
            	    // InternalGherkin.g:1032:5: lv_rows_3_0= ruleExampleRow
            	    {

            	    					newCompositeNode(grammarAccess.getThenStepAccess().getRowsExampleRowParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_rows_3_0=ruleExampleRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getThenStepRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rows",
            	    						lv_rows_3_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.ExampleRow");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleThenStep"


    // $ANTLR start "entryRuleGivenStep"
    // InternalGherkin.g:1053:1: entryRuleGivenStep returns [EObject current=null] : iv_ruleGivenStep= ruleGivenStep EOF ;
    public final EObject entryRuleGivenStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGivenStep = null;


        try {
            // InternalGherkin.g:1053:50: (iv_ruleGivenStep= ruleGivenStep EOF )
            // InternalGherkin.g:1054:2: iv_ruleGivenStep= ruleGivenStep EOF
            {
             newCompositeNode(grammarAccess.getGivenStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGivenStep=ruleGivenStep();

            state._fsp--;

             current =iv_ruleGivenStep; 
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
    // $ANTLR end "entryRuleGivenStep"


    // $ANTLR start "ruleGivenStep"
    // InternalGherkin.g:1060:1: ruleGivenStep returns [EObject current=null] : ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* ) ;
    public final EObject ruleGivenStep() throws RecognitionException {
        EObject current = null;

        Token lv_tags_0_0=null;
        Token lv_desc_1_0=null;
        AntlrDatatypeRuleToken lv_desc_2_0 = null;

        EObject lv_rows_3_0 = null;



        	enterRule();

        try {
            // InternalGherkin.g:1066:2: ( ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* ) )
            // InternalGherkin.g:1067:2: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* )
            {
            // InternalGherkin.g:1067:2: ( ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )* )
            // InternalGherkin.g:1068:3: ( (lv_tags_0_0= RULE_TAG ) )* ( (lv_desc_1_0= RULE_GIVEN_TEXT ) ) ( (lv_desc_2_0= ruleOptionalText ) )* ( (lv_rows_3_0= ruleExampleRow ) )*
            {
            // InternalGherkin.g:1068:3: ( (lv_tags_0_0= RULE_TAG ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_TAG) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGherkin.g:1069:4: (lv_tags_0_0= RULE_TAG )
            	    {
            	    // InternalGherkin.g:1069:4: (lv_tags_0_0= RULE_TAG )
            	    // InternalGherkin.g:1070:5: lv_tags_0_0= RULE_TAG
            	    {
            	    lv_tags_0_0=(Token)match(input,RULE_TAG,FOLLOW_18); 

            	    					newLeafNode(lv_tags_0_0, grammarAccess.getGivenStepAccess().getTagsTAGTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getGivenStepRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"tags",
            	    						lv_tags_0_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.TAG");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalGherkin.g:1086:3: ( (lv_desc_1_0= RULE_GIVEN_TEXT ) )
            // InternalGherkin.g:1087:4: (lv_desc_1_0= RULE_GIVEN_TEXT )
            {
            // InternalGherkin.g:1087:4: (lv_desc_1_0= RULE_GIVEN_TEXT )
            // InternalGherkin.g:1088:5: lv_desc_1_0= RULE_GIVEN_TEXT
            {
            lv_desc_1_0=(Token)match(input,RULE_GIVEN_TEXT,FOLLOW_16); 

            					newLeafNode(lv_desc_1_0, grammarAccess.getGivenStepAccess().getDescGIVEN_TEXTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivenStepRule());
            					}
            					addWithLastConsumed(
            						current,
            						"desc",
            						lv_desc_1_0,
            						"de.sebastianbenz.xgherkin.Gherkin.GIVEN_TEXT");
            				

            }


            }

            // InternalGherkin.g:1104:3: ( (lv_desc_2_0= ruleOptionalText ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_TEXT||LA25_0==RULE_CODE) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGherkin.g:1105:4: (lv_desc_2_0= ruleOptionalText )
            	    {
            	    // InternalGherkin.g:1105:4: (lv_desc_2_0= ruleOptionalText )
            	    // InternalGherkin.g:1106:5: lv_desc_2_0= ruleOptionalText
            	    {

            	    					newCompositeNode(grammarAccess.getGivenStepAccess().getDescOptionalTextParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_desc_2_0=ruleOptionalText();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGivenStepRule());
            	    					}
            	    					add(
            	    						current,
            	    						"desc",
            	    						lv_desc_2_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.OptionalText");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalGherkin.g:1123:3: ( (lv_rows_3_0= ruleExampleRow ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_EXAMPLE_CELL) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGherkin.g:1124:4: (lv_rows_3_0= ruleExampleRow )
            	    {
            	    // InternalGherkin.g:1124:4: (lv_rows_3_0= ruleExampleRow )
            	    // InternalGherkin.g:1125:5: lv_rows_3_0= ruleExampleRow
            	    {

            	    					newCompositeNode(grammarAccess.getGivenStepAccess().getRowsExampleRowParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_rows_3_0=ruleExampleRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGivenStepRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rows",
            	    						lv_rows_3_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.ExampleRow");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleGivenStep"


    // $ANTLR start "entryRuleAndStep"
    // InternalGherkin.g:1146:1: entryRuleAndStep returns [EObject current=null] : iv_ruleAndStep= ruleAndStep EOF ;
    public final EObject entryRuleAndStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndStep = null;


        try {
            // InternalGherkin.g:1146:48: (iv_ruleAndStep= ruleAndStep EOF )
            // InternalGherkin.g:1147:2: iv_ruleAndStep= ruleAndStep EOF
            {
             newCompositeNode(grammarAccess.getAndStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndStep=ruleAndStep();

            state._fsp--;

             current =iv_ruleAndStep; 
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
    // $ANTLR end "entryRuleAndStep"


    // $ANTLR start "ruleAndStep"
    // InternalGherkin.g:1153:1: ruleAndStep returns [EObject current=null] : ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( (lv_desc_1_0= ruleOptionalText ) )* ( (lv_rows_2_0= ruleExampleRow ) )* ) ;
    public final EObject ruleAndStep() throws RecognitionException {
        EObject current = null;

        Token lv_desc_0_0=null;
        AntlrDatatypeRuleToken lv_desc_1_0 = null;

        EObject lv_rows_2_0 = null;



        	enterRule();

        try {
            // InternalGherkin.g:1159:2: ( ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( (lv_desc_1_0= ruleOptionalText ) )* ( (lv_rows_2_0= ruleExampleRow ) )* ) )
            // InternalGherkin.g:1160:2: ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( (lv_desc_1_0= ruleOptionalText ) )* ( (lv_rows_2_0= ruleExampleRow ) )* )
            {
            // InternalGherkin.g:1160:2: ( ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( (lv_desc_1_0= ruleOptionalText ) )* ( (lv_rows_2_0= ruleExampleRow ) )* )
            // InternalGherkin.g:1161:3: ( (lv_desc_0_0= RULE_AND_TEXT ) ) ( (lv_desc_1_0= ruleOptionalText ) )* ( (lv_rows_2_0= ruleExampleRow ) )*
            {
            // InternalGherkin.g:1161:3: ( (lv_desc_0_0= RULE_AND_TEXT ) )
            // InternalGherkin.g:1162:4: (lv_desc_0_0= RULE_AND_TEXT )
            {
            // InternalGherkin.g:1162:4: (lv_desc_0_0= RULE_AND_TEXT )
            // InternalGherkin.g:1163:5: lv_desc_0_0= RULE_AND_TEXT
            {
            lv_desc_0_0=(Token)match(input,RULE_AND_TEXT,FOLLOW_16); 

            					newLeafNode(lv_desc_0_0, grammarAccess.getAndStepAccess().getDescAND_TEXTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAndStepRule());
            					}
            					addWithLastConsumed(
            						current,
            						"desc",
            						lv_desc_0_0,
            						"de.sebastianbenz.xgherkin.Gherkin.AND_TEXT");
            				

            }


            }

            // InternalGherkin.g:1179:3: ( (lv_desc_1_0= ruleOptionalText ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_TEXT||LA27_0==RULE_CODE) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGherkin.g:1180:4: (lv_desc_1_0= ruleOptionalText )
            	    {
            	    // InternalGherkin.g:1180:4: (lv_desc_1_0= ruleOptionalText )
            	    // InternalGherkin.g:1181:5: lv_desc_1_0= ruleOptionalText
            	    {

            	    					newCompositeNode(grammarAccess.getAndStepAccess().getDescOptionalTextParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_desc_1_0=ruleOptionalText();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAndStepRule());
            	    					}
            	    					add(
            	    						current,
            	    						"desc",
            	    						lv_desc_1_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.OptionalText");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalGherkin.g:1198:3: ( (lv_rows_2_0= ruleExampleRow ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_EXAMPLE_CELL) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGherkin.g:1199:4: (lv_rows_2_0= ruleExampleRow )
            	    {
            	    // InternalGherkin.g:1199:4: (lv_rows_2_0= ruleExampleRow )
            	    // InternalGherkin.g:1200:5: lv_rows_2_0= ruleExampleRow
            	    {

            	    					newCompositeNode(grammarAccess.getAndStepAccess().getRowsExampleRowParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_rows_2_0=ruleExampleRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAndStepRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rows",
            	    						lv_rows_2_0,
            	    						"de.sebastianbenz.xgherkin.Gherkin.ExampleRow");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleAndStep"


    // $ANTLR start "entryRuleOptionalText"
    // InternalGherkin.g:1221:1: entryRuleOptionalText returns [String current=null] : iv_ruleOptionalText= ruleOptionalText EOF ;
    public final String entryRuleOptionalText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOptionalText = null;


        try {
            // InternalGherkin.g:1221:52: (iv_ruleOptionalText= ruleOptionalText EOF )
            // InternalGherkin.g:1222:2: iv_ruleOptionalText= ruleOptionalText EOF
            {
             newCompositeNode(grammarAccess.getOptionalTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionalText=ruleOptionalText();

            state._fsp--;

             current =iv_ruleOptionalText.getText(); 
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
    // $ANTLR end "entryRuleOptionalText"


    // $ANTLR start "ruleOptionalText"
    // InternalGherkin.g:1228:1: ruleOptionalText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TEXT_0= RULE_TEXT | this_CODE_1= RULE_CODE ) ;
    public final AntlrDatatypeRuleToken ruleOptionalText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TEXT_0=null;
        Token this_CODE_1=null;


        	enterRule();

        try {
            // InternalGherkin.g:1234:2: ( (this_TEXT_0= RULE_TEXT | this_CODE_1= RULE_CODE ) )
            // InternalGherkin.g:1235:2: (this_TEXT_0= RULE_TEXT | this_CODE_1= RULE_CODE )
            {
            // InternalGherkin.g:1235:2: (this_TEXT_0= RULE_TEXT | this_CODE_1= RULE_CODE )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_TEXT) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_CODE) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalGherkin.g:1236:3: this_TEXT_0= RULE_TEXT
                    {
                    this_TEXT_0=(Token)match(input,RULE_TEXT,FOLLOW_2); 

                    			current.merge(this_TEXT_0);
                    		

                    			newLeafNode(this_TEXT_0, grammarAccess.getOptionalTextAccess().getTEXTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGherkin.g:1244:3: this_CODE_1= RULE_CODE
                    {
                    this_CODE_1=(Token)match(input,RULE_CODE,FOLLOW_2); 

                    			current.merge(this_CODE_1);
                    		

                    			newLeafNode(this_CODE_1, grammarAccess.getOptionalTextAccess().getCODETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleOptionalText"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\2\4\3\uffff";
    static final String dfa_3s = "\2\17\3\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\3";
    static final String dfa_5s = "\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\5\uffff\1\3\1\4\3\uffff\1\2",
            "\1\1\5\uffff\1\3\1\4\3\uffff\1\2",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "365:2: (this_Background_0= ruleBackground | this_Scenario_1= ruleScenario | this_ScenarioWithOutline_2= ruleScenarioWithOutline )";
        }
    }
    static final String dfa_7s = "\4\uffff";
    static final String dfa_8s = "\1\1\3\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\4\1\uffff";
    static final String dfa_10s = "\1\23\1\uffff\1\22\1\uffff";
    static final String dfa_11s = "\1\uffff\1\2\1\uffff\1\1";
    static final String dfa_12s = "\4\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\5\uffff\2\1\3\uffff\1\1\4\3",
            "",
            "\1\2\5\uffff\2\1\3\uffff\1\1\3\3",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 466:3: ( (lv_steps_3_0= ruleStep ) )+";
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 790:3: ( (lv_steps_2_0= ruleStep ) )*";
        }
    }
    static final String dfa_14s = "\6\uffff";
    static final String dfa_15s = "\2\4\4\uffff";
    static final String dfa_16s = "\1\23\1\22\4\uffff";
    static final String dfa_17s = "\2\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_18s = "\6\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\13\uffff\1\2\1\3\1\4\1\5",
            "\1\1\13\uffff\1\2\1\3\1\4",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "827:2: (this_WhenStep_0= ruleWhenStep | this_ThenStep_1= ruleThenStep | this_GivenStep_2= ruleGivenStep | this_AndStep_3= ruleAndStep )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008FF2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008FD2L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008C12L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000F03D0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F03D2L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000F13D0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000104042L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040010L});

}