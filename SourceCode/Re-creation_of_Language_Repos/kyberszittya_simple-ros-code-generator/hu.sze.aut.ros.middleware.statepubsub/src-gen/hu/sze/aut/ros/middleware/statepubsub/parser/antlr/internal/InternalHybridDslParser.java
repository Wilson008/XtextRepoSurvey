package hu.sze.aut.ros.middleware.statepubsub.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.sze.aut.ros.middleware.statepubsub.services.HybridDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHybridDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'hybridsystem'", "'{'", "'locations'", "','", "'}'", "'transitions'", "'variables'", "'activities'", "'events'", "'invariants'", "':'", "'errorlocation'", "'location'", "'transition'", "'source'", "'->'", "'target'", "'eventtrigger'", "'continuousvariable'", "'ContinuousVariable'", "'activity'", "'continousvariable'", "'event'", "'invariant'", "'RuleSet'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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


        public InternalHybridDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHybridDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHybridDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHybridDsl.g"; }



     	private HybridDslGrammarAccess grammarAccess;

        public InternalHybridDslParser(TokenStream input, HybridDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "HybridSystem_Impl";
       	}

       	@Override
       	protected HybridDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHybridSystem_Impl"
    // InternalHybridDsl.g:64:1: entryRuleHybridSystem_Impl returns [EObject current=null] : iv_ruleHybridSystem_Impl= ruleHybridSystem_Impl EOF ;
    public final EObject entryRuleHybridSystem_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHybridSystem_Impl = null;


        try {
            // InternalHybridDsl.g:64:58: (iv_ruleHybridSystem_Impl= ruleHybridSystem_Impl EOF )
            // InternalHybridDsl.g:65:2: iv_ruleHybridSystem_Impl= ruleHybridSystem_Impl EOF
            {
             newCompositeNode(grammarAccess.getHybridSystem_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHybridSystem_Impl=ruleHybridSystem_Impl();

            state._fsp--;

             current =iv_ruleHybridSystem_Impl; 
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
    // $ANTLR end "entryRuleHybridSystem_Impl"


    // $ANTLR start "ruleHybridSystem_Impl"
    // InternalHybridDsl.g:71:1: ruleHybridSystem_Impl returns [EObject current=null] : ( () otherlv_1= 'hybridsystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'locations' otherlv_5= '{' ( (lv_location_6_0= ruleLocation ) ) (otherlv_7= ',' ( (lv_location_8_0= ruleLocation ) ) )* otherlv_9= '}' )? (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* otherlv_15= '}' )? (otherlv_16= 'variables' otherlv_17= '{' ( (lv_variable_18_0= ruleContinuousVariable ) ) (otherlv_19= ',' ( (lv_variable_20_0= ruleContinuousVariable ) ) )* otherlv_21= '}' )? (otherlv_22= 'activities' otherlv_23= '{' ( (lv_activity_24_0= ruleActivity ) ) (otherlv_25= ',' ( (lv_activity_26_0= ruleActivity ) ) )* otherlv_27= '}' )? (otherlv_28= 'events' otherlv_29= '{' ( (lv_event_30_0= ruleDiscreteEvent ) ) (otherlv_31= ',' ( (lv_event_32_0= ruleDiscreteEvent ) ) )* otherlv_33= '}' )? (otherlv_34= 'invariants' otherlv_35= '{' ( (lv_invariant_36_0= ruleInvariant ) ) (otherlv_37= ',' ( (lv_invariant_38_0= ruleInvariant ) ) )* otherlv_39= '}' )? otherlv_40= '}' ) ;
    public final EObject ruleHybridSystem_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_location_6_0 = null;

        EObject lv_location_8_0 = null;

        EObject lv_transition_12_0 = null;

        EObject lv_transition_14_0 = null;

        EObject lv_variable_18_0 = null;

        EObject lv_variable_20_0 = null;

        EObject lv_activity_24_0 = null;

        EObject lv_activity_26_0 = null;

        EObject lv_event_30_0 = null;

        EObject lv_event_32_0 = null;

        EObject lv_invariant_36_0 = null;

        EObject lv_invariant_38_0 = null;



        	enterRule();

        try {
            // InternalHybridDsl.g:77:2: ( ( () otherlv_1= 'hybridsystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'locations' otherlv_5= '{' ( (lv_location_6_0= ruleLocation ) ) (otherlv_7= ',' ( (lv_location_8_0= ruleLocation ) ) )* otherlv_9= '}' )? (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* otherlv_15= '}' )? (otherlv_16= 'variables' otherlv_17= '{' ( (lv_variable_18_0= ruleContinuousVariable ) ) (otherlv_19= ',' ( (lv_variable_20_0= ruleContinuousVariable ) ) )* otherlv_21= '}' )? (otherlv_22= 'activities' otherlv_23= '{' ( (lv_activity_24_0= ruleActivity ) ) (otherlv_25= ',' ( (lv_activity_26_0= ruleActivity ) ) )* otherlv_27= '}' )? (otherlv_28= 'events' otherlv_29= '{' ( (lv_event_30_0= ruleDiscreteEvent ) ) (otherlv_31= ',' ( (lv_event_32_0= ruleDiscreteEvent ) ) )* otherlv_33= '}' )? (otherlv_34= 'invariants' otherlv_35= '{' ( (lv_invariant_36_0= ruleInvariant ) ) (otherlv_37= ',' ( (lv_invariant_38_0= ruleInvariant ) ) )* otherlv_39= '}' )? otherlv_40= '}' ) )
            // InternalHybridDsl.g:78:2: ( () otherlv_1= 'hybridsystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'locations' otherlv_5= '{' ( (lv_location_6_0= ruleLocation ) ) (otherlv_7= ',' ( (lv_location_8_0= ruleLocation ) ) )* otherlv_9= '}' )? (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* otherlv_15= '}' )? (otherlv_16= 'variables' otherlv_17= '{' ( (lv_variable_18_0= ruleContinuousVariable ) ) (otherlv_19= ',' ( (lv_variable_20_0= ruleContinuousVariable ) ) )* otherlv_21= '}' )? (otherlv_22= 'activities' otherlv_23= '{' ( (lv_activity_24_0= ruleActivity ) ) (otherlv_25= ',' ( (lv_activity_26_0= ruleActivity ) ) )* otherlv_27= '}' )? (otherlv_28= 'events' otherlv_29= '{' ( (lv_event_30_0= ruleDiscreteEvent ) ) (otherlv_31= ',' ( (lv_event_32_0= ruleDiscreteEvent ) ) )* otherlv_33= '}' )? (otherlv_34= 'invariants' otherlv_35= '{' ( (lv_invariant_36_0= ruleInvariant ) ) (otherlv_37= ',' ( (lv_invariant_38_0= ruleInvariant ) ) )* otherlv_39= '}' )? otherlv_40= '}' )
            {
            // InternalHybridDsl.g:78:2: ( () otherlv_1= 'hybridsystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'locations' otherlv_5= '{' ( (lv_location_6_0= ruleLocation ) ) (otherlv_7= ',' ( (lv_location_8_0= ruleLocation ) ) )* otherlv_9= '}' )? (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* otherlv_15= '}' )? (otherlv_16= 'variables' otherlv_17= '{' ( (lv_variable_18_0= ruleContinuousVariable ) ) (otherlv_19= ',' ( (lv_variable_20_0= ruleContinuousVariable ) ) )* otherlv_21= '}' )? (otherlv_22= 'activities' otherlv_23= '{' ( (lv_activity_24_0= ruleActivity ) ) (otherlv_25= ',' ( (lv_activity_26_0= ruleActivity ) ) )* otherlv_27= '}' )? (otherlv_28= 'events' otherlv_29= '{' ( (lv_event_30_0= ruleDiscreteEvent ) ) (otherlv_31= ',' ( (lv_event_32_0= ruleDiscreteEvent ) ) )* otherlv_33= '}' )? (otherlv_34= 'invariants' otherlv_35= '{' ( (lv_invariant_36_0= ruleInvariant ) ) (otherlv_37= ',' ( (lv_invariant_38_0= ruleInvariant ) ) )* otherlv_39= '}' )? otherlv_40= '}' )
            // InternalHybridDsl.g:79:3: () otherlv_1= 'hybridsystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'locations' otherlv_5= '{' ( (lv_location_6_0= ruleLocation ) ) (otherlv_7= ',' ( (lv_location_8_0= ruleLocation ) ) )* otherlv_9= '}' )? (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* otherlv_15= '}' )? (otherlv_16= 'variables' otherlv_17= '{' ( (lv_variable_18_0= ruleContinuousVariable ) ) (otherlv_19= ',' ( (lv_variable_20_0= ruleContinuousVariable ) ) )* otherlv_21= '}' )? (otherlv_22= 'activities' otherlv_23= '{' ( (lv_activity_24_0= ruleActivity ) ) (otherlv_25= ',' ( (lv_activity_26_0= ruleActivity ) ) )* otherlv_27= '}' )? (otherlv_28= 'events' otherlv_29= '{' ( (lv_event_30_0= ruleDiscreteEvent ) ) (otherlv_31= ',' ( (lv_event_32_0= ruleDiscreteEvent ) ) )* otherlv_33= '}' )? (otherlv_34= 'invariants' otherlv_35= '{' ( (lv_invariant_36_0= ruleInvariant ) ) (otherlv_37= ',' ( (lv_invariant_38_0= ruleInvariant ) ) )* otherlv_39= '}' )? otherlv_40= '}'
            {
            // InternalHybridDsl.g:79:3: ()
            // InternalHybridDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHybridSystem_ImplAccess().getHybridSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getHybridSystem_ImplAccess().getHybridsystemKeyword_1());
            		
            // InternalHybridDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalHybridDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalHybridDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalHybridDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHybridSystem_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHybridSystem_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getHybridSystem_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalHybridDsl.g:113:3: (otherlv_4= 'locations' otherlv_5= '{' ( (lv_location_6_0= ruleLocation ) ) (otherlv_7= ',' ( (lv_location_8_0= ruleLocation ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalHybridDsl.g:114:4: otherlv_4= 'locations' otherlv_5= '{' ( (lv_location_6_0= ruleLocation ) ) (otherlv_7= ',' ( (lv_location_8_0= ruleLocation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getHybridSystem_ImplAccess().getLocationsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getHybridSystem_ImplAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalHybridDsl.g:122:4: ( (lv_location_6_0= ruleLocation ) )
                    // InternalHybridDsl.g:123:5: (lv_location_6_0= ruleLocation )
                    {
                    // InternalHybridDsl.g:123:5: (lv_location_6_0= ruleLocation )
                    // InternalHybridDsl.g:124:6: lv_location_6_0= ruleLocation
                    {

                    						newCompositeNode(grammarAccess.getHybridSystem_ImplAccess().getLocationLocationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_location_6_0=ruleLocation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHybridSystem_ImplRule());
                    						}
                    						add(
                    							current,
                    							"location",
                    							lv_location_6_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.Location");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHybridDsl.g:141:4: (otherlv_7= ',' ( (lv_location_8_0= ruleLocation ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalHybridDsl.g:142:5: otherlv_7= ',' ( (lv_location_8_0= ruleLocation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getHybridSystem_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalHybridDsl.g:146:5: ( (lv_location_8_0= ruleLocation ) )
                    	    // InternalHybridDsl.g:147:6: (lv_location_8_0= ruleLocation )
                    	    {
                    	    // InternalHybridDsl.g:147:6: (lv_location_8_0= ruleLocation )
                    	    // InternalHybridDsl.g:148:7: lv_location_8_0= ruleLocation
                    	    {

                    	    							newCompositeNode(grammarAccess.getHybridSystem_ImplAccess().getLocationLocationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_location_8_0=ruleLocation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHybridSystem_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"location",
                    	    								lv_location_8_0,
                    	    								"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.Location");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getHybridSystem_ImplAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalHybridDsl.g:171:3: (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalHybridDsl.g:172:4: otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getHybridSystem_ImplAccess().getTransitionsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getHybridSystem_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalHybridDsl.g:180:4: ( (lv_transition_12_0= ruleTransition ) )
                    // InternalHybridDsl.g:181:5: (lv_transition_12_0= ruleTransition )
                    {
                    // InternalHybridDsl.g:181:5: (lv_transition_12_0= ruleTransition )
                    // InternalHybridDsl.g:182:6: lv_transition_12_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getHybridSystem_ImplAccess().getTransitionTransitionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_transition_12_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHybridSystem_ImplRule());
                    						}
                    						add(
                    							current,
                    							"transition",
                    							lv_transition_12_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHybridDsl.g:199:4: (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalHybridDsl.g:200:5: otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getHybridSystem_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalHybridDsl.g:204:5: ( (lv_transition_14_0= ruleTransition ) )
                    	    // InternalHybridDsl.g:205:6: (lv_transition_14_0= ruleTransition )
                    	    {
                    	    // InternalHybridDsl.g:205:6: (lv_transition_14_0= ruleTransition )
                    	    // InternalHybridDsl.g:206:7: lv_transition_14_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getHybridSystem_ImplAccess().getTransitionTransitionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_transition_14_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHybridSystem_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transition",
                    	    								lv_transition_14_0,
                    	    								"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getHybridSystem_ImplAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalHybridDsl.g:229:3: (otherlv_16= 'variables' otherlv_17= '{' ( (lv_variable_18_0= ruleContinuousVariable ) ) (otherlv_19= ',' ( (lv_variable_20_0= ruleContinuousVariable ) ) )* otherlv_21= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalHybridDsl.g:230:4: otherlv_16= 'variables' otherlv_17= '{' ( (lv_variable_18_0= ruleContinuousVariable ) ) (otherlv_19= ',' ( (lv_variable_20_0= ruleContinuousVariable ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getHybridSystem_ImplAccess().getVariablesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getHybridSystem_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalHybridDsl.g:238:4: ( (lv_variable_18_0= ruleContinuousVariable ) )
                    // InternalHybridDsl.g:239:5: (lv_variable_18_0= ruleContinuousVariable )
                    {
                    // InternalHybridDsl.g:239:5: (lv_variable_18_0= ruleContinuousVariable )
                    // InternalHybridDsl.g:240:6: lv_variable_18_0= ruleContinuousVariable
                    {

                    						newCompositeNode(grammarAccess.getHybridSystem_ImplAccess().getVariableContinuousVariableParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_variable_18_0=ruleContinuousVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHybridSystem_ImplRule());
                    						}
                    						add(
                    							current,
                    							"variable",
                    							lv_variable_18_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.ContinuousVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHybridDsl.g:257:4: (otherlv_19= ',' ( (lv_variable_20_0= ruleContinuousVariable ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalHybridDsl.g:258:5: otherlv_19= ',' ( (lv_variable_20_0= ruleContinuousVariable ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getHybridSystem_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalHybridDsl.g:262:5: ( (lv_variable_20_0= ruleContinuousVariable ) )
                    	    // InternalHybridDsl.g:263:6: (lv_variable_20_0= ruleContinuousVariable )
                    	    {
                    	    // InternalHybridDsl.g:263:6: (lv_variable_20_0= ruleContinuousVariable )
                    	    // InternalHybridDsl.g:264:7: lv_variable_20_0= ruleContinuousVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getHybridSystem_ImplAccess().getVariableContinuousVariableParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_variable_20_0=ruleContinuousVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHybridSystem_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable",
                    	    								lv_variable_20_0,
                    	    								"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.ContinuousVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_21, grammarAccess.getHybridSystem_ImplAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalHybridDsl.g:287:3: (otherlv_22= 'activities' otherlv_23= '{' ( (lv_activity_24_0= ruleActivity ) ) (otherlv_25= ',' ( (lv_activity_26_0= ruleActivity ) ) )* otherlv_27= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHybridDsl.g:288:4: otherlv_22= 'activities' otherlv_23= '{' ( (lv_activity_24_0= ruleActivity ) ) (otherlv_25= ',' ( (lv_activity_26_0= ruleActivity ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getHybridSystem_ImplAccess().getActivitiesKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_23, grammarAccess.getHybridSystem_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalHybridDsl.g:296:4: ( (lv_activity_24_0= ruleActivity ) )
                    // InternalHybridDsl.g:297:5: (lv_activity_24_0= ruleActivity )
                    {
                    // InternalHybridDsl.g:297:5: (lv_activity_24_0= ruleActivity )
                    // InternalHybridDsl.g:298:6: lv_activity_24_0= ruleActivity
                    {

                    						newCompositeNode(grammarAccess.getHybridSystem_ImplAccess().getActivityActivityParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_activity_24_0=ruleActivity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHybridSystem_ImplRule());
                    						}
                    						add(
                    							current,
                    							"activity",
                    							lv_activity_24_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.Activity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHybridDsl.g:315:4: (otherlv_25= ',' ( (lv_activity_26_0= ruleActivity ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalHybridDsl.g:316:5: otherlv_25= ',' ( (lv_activity_26_0= ruleActivity ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getHybridSystem_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalHybridDsl.g:320:5: ( (lv_activity_26_0= ruleActivity ) )
                    	    // InternalHybridDsl.g:321:6: (lv_activity_26_0= ruleActivity )
                    	    {
                    	    // InternalHybridDsl.g:321:6: (lv_activity_26_0= ruleActivity )
                    	    // InternalHybridDsl.g:322:7: lv_activity_26_0= ruleActivity
                    	    {

                    	    							newCompositeNode(grammarAccess.getHybridSystem_ImplAccess().getActivityActivityParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_activity_26_0=ruleActivity();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHybridSystem_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activity",
                    	    								lv_activity_26_0,
                    	    								"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.Activity");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_27, grammarAccess.getHybridSystem_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalHybridDsl.g:345:3: (otherlv_28= 'events' otherlv_29= '{' ( (lv_event_30_0= ruleDiscreteEvent ) ) (otherlv_31= ',' ( (lv_event_32_0= ruleDiscreteEvent ) ) )* otherlv_33= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalHybridDsl.g:346:4: otherlv_28= 'events' otherlv_29= '{' ( (lv_event_30_0= ruleDiscreteEvent ) ) (otherlv_31= ',' ( (lv_event_32_0= ruleDiscreteEvent ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getHybridSystem_ImplAccess().getEventsKeyword_8_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_29, grammarAccess.getHybridSystem_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalHybridDsl.g:354:4: ( (lv_event_30_0= ruleDiscreteEvent ) )
                    // InternalHybridDsl.g:355:5: (lv_event_30_0= ruleDiscreteEvent )
                    {
                    // InternalHybridDsl.g:355:5: (lv_event_30_0= ruleDiscreteEvent )
                    // InternalHybridDsl.g:356:6: lv_event_30_0= ruleDiscreteEvent
                    {

                    						newCompositeNode(grammarAccess.getHybridSystem_ImplAccess().getEventDiscreteEventParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_event_30_0=ruleDiscreteEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHybridSystem_ImplRule());
                    						}
                    						add(
                    							current,
                    							"event",
                    							lv_event_30_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.DiscreteEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHybridDsl.g:373:4: (otherlv_31= ',' ( (lv_event_32_0= ruleDiscreteEvent ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalHybridDsl.g:374:5: otherlv_31= ',' ( (lv_event_32_0= ruleDiscreteEvent ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getHybridSystem_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalHybridDsl.g:378:5: ( (lv_event_32_0= ruleDiscreteEvent ) )
                    	    // InternalHybridDsl.g:379:6: (lv_event_32_0= ruleDiscreteEvent )
                    	    {
                    	    // InternalHybridDsl.g:379:6: (lv_event_32_0= ruleDiscreteEvent )
                    	    // InternalHybridDsl.g:380:7: lv_event_32_0= ruleDiscreteEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getHybridSystem_ImplAccess().getEventDiscreteEventParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_event_32_0=ruleDiscreteEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHybridSystem_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"event",
                    	    								lv_event_32_0,
                    	    								"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.DiscreteEvent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_33, grammarAccess.getHybridSystem_ImplAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalHybridDsl.g:403:3: (otherlv_34= 'invariants' otherlv_35= '{' ( (lv_invariant_36_0= ruleInvariant ) ) (otherlv_37= ',' ( (lv_invariant_38_0= ruleInvariant ) ) )* otherlv_39= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalHybridDsl.g:404:4: otherlv_34= 'invariants' otherlv_35= '{' ( (lv_invariant_36_0= ruleInvariant ) ) (otherlv_37= ',' ( (lv_invariant_38_0= ruleInvariant ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getHybridSystem_ImplAccess().getInvariantsKeyword_9_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_35, grammarAccess.getHybridSystem_ImplAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalHybridDsl.g:412:4: ( (lv_invariant_36_0= ruleInvariant ) )
                    // InternalHybridDsl.g:413:5: (lv_invariant_36_0= ruleInvariant )
                    {
                    // InternalHybridDsl.g:413:5: (lv_invariant_36_0= ruleInvariant )
                    // InternalHybridDsl.g:414:6: lv_invariant_36_0= ruleInvariant
                    {

                    						newCompositeNode(grammarAccess.getHybridSystem_ImplAccess().getInvariantInvariantParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_invariant_36_0=ruleInvariant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHybridSystem_ImplRule());
                    						}
                    						add(
                    							current,
                    							"invariant",
                    							lv_invariant_36_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.Invariant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHybridDsl.g:431:4: (otherlv_37= ',' ( (lv_invariant_38_0= ruleInvariant ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalHybridDsl.g:432:5: otherlv_37= ',' ( (lv_invariant_38_0= ruleInvariant ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_15); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getHybridSystem_ImplAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalHybridDsl.g:436:5: ( (lv_invariant_38_0= ruleInvariant ) )
                    	    // InternalHybridDsl.g:437:6: (lv_invariant_38_0= ruleInvariant )
                    	    {
                    	    // InternalHybridDsl.g:437:6: (lv_invariant_38_0= ruleInvariant )
                    	    // InternalHybridDsl.g:438:7: lv_invariant_38_0= ruleInvariant
                    	    {

                    	    							newCompositeNode(grammarAccess.getHybridSystem_ImplAccess().getInvariantInvariantParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_invariant_38_0=ruleInvariant();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHybridSystem_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"invariant",
                    	    								lv_invariant_38_0,
                    	    								"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.Invariant");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_39, grammarAccess.getHybridSystem_ImplAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_40=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_40, grammarAccess.getHybridSystem_ImplAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleHybridSystem_Impl"


    // $ANTLR start "entryRuleLocation"
    // InternalHybridDsl.g:469:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalHybridDsl.g:469:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalHybridDsl.g:470:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalHybridDsl.g:476:1: ruleLocation returns [EObject current=null] : (this_SimpleLocation_0= ruleSimpleLocation | this_ErrorLocation_1= ruleErrorLocation ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleLocation_0 = null;

        EObject this_ErrorLocation_1 = null;



        	enterRule();

        try {
            // InternalHybridDsl.g:482:2: ( (this_SimpleLocation_0= ruleSimpleLocation | this_ErrorLocation_1= ruleErrorLocation ) )
            // InternalHybridDsl.g:483:2: (this_SimpleLocation_0= ruleSimpleLocation | this_ErrorLocation_1= ruleErrorLocation )
            {
            // InternalHybridDsl.g:483:2: (this_SimpleLocation_0= ruleSimpleLocation | this_ErrorLocation_1= ruleErrorLocation )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==21) ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==22) ) {
                        alt13=2;
                    }
                    else if ( (LA13_3==23) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==RULE_ID) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==21) ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==22) ) {
                        alt13=2;
                    }
                    else if ( (LA13_3==23) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalHybridDsl.g:484:3: this_SimpleLocation_0= ruleSimpleLocation
                    {

                    			newCompositeNode(grammarAccess.getLocationAccess().getSimpleLocationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleLocation_0=ruleSimpleLocation();

                    state._fsp--;


                    			current = this_SimpleLocation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHybridDsl.g:493:3: this_ErrorLocation_1= ruleErrorLocation
                    {

                    			newCompositeNode(grammarAccess.getLocationAccess().getErrorLocationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ErrorLocation_1=ruleErrorLocation();

                    state._fsp--;


                    			current = this_ErrorLocation_1;
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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleErrorLocation"
    // InternalHybridDsl.g:505:1: entryRuleErrorLocation returns [EObject current=null] : iv_ruleErrorLocation= ruleErrorLocation EOF ;
    public final EObject entryRuleErrorLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorLocation = null;


        try {
            // InternalHybridDsl.g:505:54: (iv_ruleErrorLocation= ruleErrorLocation EOF )
            // InternalHybridDsl.g:506:2: iv_ruleErrorLocation= ruleErrorLocation EOF
            {
             newCompositeNode(grammarAccess.getErrorLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorLocation=ruleErrorLocation();

            state._fsp--;

             current =iv_ruleErrorLocation; 
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
    // $ANTLR end "entryRuleErrorLocation"


    // $ANTLR start "ruleErrorLocation"
    // InternalHybridDsl.g:512:1: ruleErrorLocation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'errorlocation' ) ;
    public final EObject ruleErrorLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalHybridDsl.g:518:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'errorlocation' ) )
            // InternalHybridDsl.g:519:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'errorlocation' )
            {
            // InternalHybridDsl.g:519:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'errorlocation' )
            // InternalHybridDsl.g:520:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'errorlocation'
            {
            // InternalHybridDsl.g:520:3: ()
            // InternalHybridDsl.g:521:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getErrorLocationAccess().getErrorLocationAction_0(),
            					current);
            			

            }

            // InternalHybridDsl.g:527:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHybridDsl.g:528:4: (lv_name_1_0= ruleEString )
            {
            // InternalHybridDsl.g:528:4: (lv_name_1_0= ruleEString )
            // InternalHybridDsl.g:529:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getErrorLocationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getErrorLocationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getErrorLocationAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getErrorLocationAccess().getErrorlocationKeyword_3());
            		

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
    // $ANTLR end "ruleErrorLocation"


    // $ANTLR start "entryRuleSimpleLocation"
    // InternalHybridDsl.g:558:1: entryRuleSimpleLocation returns [EObject current=null] : iv_ruleSimpleLocation= ruleSimpleLocation EOF ;
    public final EObject entryRuleSimpleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleLocation = null;


        try {
            // InternalHybridDsl.g:558:55: (iv_ruleSimpleLocation= ruleSimpleLocation EOF )
            // InternalHybridDsl.g:559:2: iv_ruleSimpleLocation= ruleSimpleLocation EOF
            {
             newCompositeNode(grammarAccess.getSimpleLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleLocation=ruleSimpleLocation();

            state._fsp--;

             current =iv_ruleSimpleLocation; 
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
    // $ANTLR end "entryRuleSimpleLocation"


    // $ANTLR start "ruleSimpleLocation"
    // InternalHybridDsl.g:565:1: ruleSimpleLocation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'location' ) ;
    public final EObject ruleSimpleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalHybridDsl.g:571:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'location' ) )
            // InternalHybridDsl.g:572:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'location' )
            {
            // InternalHybridDsl.g:572:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'location' )
            // InternalHybridDsl.g:573:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'location'
            {
            // InternalHybridDsl.g:573:3: ()
            // InternalHybridDsl.g:574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleLocationAccess().getLocationAction_0(),
            					current);
            			

            }

            // InternalHybridDsl.g:580:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHybridDsl.g:581:4: (lv_name_1_0= ruleEString )
            {
            // InternalHybridDsl.g:581:4: (lv_name_1_0= ruleEString )
            // InternalHybridDsl.g:582:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleLocationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleLocationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleLocationAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleLocationAccess().getLocationKeyword_3());
            		

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
    // $ANTLR end "ruleSimpleLocation"


    // $ANTLR start "entryRuleTransition"
    // InternalHybridDsl.g:611:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalHybridDsl.g:611:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalHybridDsl.g:612:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalHybridDsl.g:618:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'transition' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'source' ( ( ruleEString ) ) ) otherlv_5= '->' (otherlv_6= 'target' ( ( ruleEString ) ) ) otherlv_8= '{' (otherlv_9= 'eventtrigger' ( ( ruleEString ) ) )? (otherlv_11= 'continuousvariable' ( ( ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalHybridDsl.g:624:2: ( ( () otherlv_1= 'transition' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'source' ( ( ruleEString ) ) ) otherlv_5= '->' (otherlv_6= 'target' ( ( ruleEString ) ) ) otherlv_8= '{' (otherlv_9= 'eventtrigger' ( ( ruleEString ) ) )? (otherlv_11= 'continuousvariable' ( ( ruleEString ) ) )? otherlv_13= '}' ) )
            // InternalHybridDsl.g:625:2: ( () otherlv_1= 'transition' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'source' ( ( ruleEString ) ) ) otherlv_5= '->' (otherlv_6= 'target' ( ( ruleEString ) ) ) otherlv_8= '{' (otherlv_9= 'eventtrigger' ( ( ruleEString ) ) )? (otherlv_11= 'continuousvariable' ( ( ruleEString ) ) )? otherlv_13= '}' )
            {
            // InternalHybridDsl.g:625:2: ( () otherlv_1= 'transition' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'source' ( ( ruleEString ) ) ) otherlv_5= '->' (otherlv_6= 'target' ( ( ruleEString ) ) ) otherlv_8= '{' (otherlv_9= 'eventtrigger' ( ( ruleEString ) ) )? (otherlv_11= 'continuousvariable' ( ( ruleEString ) ) )? otherlv_13= '}' )
            // InternalHybridDsl.g:626:3: () otherlv_1= 'transition' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'source' ( ( ruleEString ) ) ) otherlv_5= '->' (otherlv_6= 'target' ( ( ruleEString ) ) ) otherlv_8= '{' (otherlv_9= 'eventtrigger' ( ( ruleEString ) ) )? (otherlv_11= 'continuousvariable' ( ( ruleEString ) ) )? otherlv_13= '}'
            {
            // InternalHybridDsl.g:626:3: ()
            // InternalHybridDsl.g:627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
            		
            // InternalHybridDsl.g:637:3: ( (lv_name_2_0= ruleEString ) )
            // InternalHybridDsl.g:638:4: (lv_name_2_0= ruleEString )
            {
            // InternalHybridDsl.g:638:4: (lv_name_2_0= ruleEString )
            // InternalHybridDsl.g:639:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHybridDsl.g:656:3: (otherlv_3= 'source' ( ( ruleEString ) ) )
            // InternalHybridDsl.g:657:4: otherlv_3= 'source' ( ( ruleEString ) )
            {
            otherlv_3=(Token)match(input,25,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getSourceKeyword_3_0());
            			
            // InternalHybridDsl.g:661:4: ( ( ruleEString ) )
            // InternalHybridDsl.g:662:5: ( ruleEString )
            {
            // InternalHybridDsl.g:662:5: ( ruleEString )
            // InternalHybridDsl.g:663:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getTransitionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getTransitionAccess().getSourceLocationCrossReference_3_1_0());
            					
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalHybridDsl.g:682:3: (otherlv_6= 'target' ( ( ruleEString ) ) )
            // InternalHybridDsl.g:683:4: otherlv_6= 'target' ( ( ruleEString ) )
            {
            otherlv_6=(Token)match(input,27,FOLLOW_3); 

            				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getTargetKeyword_5_0());
            			
            // InternalHybridDsl.g:687:4: ( ( ruleEString ) )
            // InternalHybridDsl.g:688:5: ( ruleEString )
            {
            // InternalHybridDsl.g:688:5: ( ruleEString )
            // InternalHybridDsl.g:689:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getTransitionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getTransitionAccess().getTargetLocationCrossReference_5_1_0());
            					
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalHybridDsl.g:708:3: (otherlv_9= 'eventtrigger' ( ( ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalHybridDsl.g:709:4: otherlv_9= 'eventtrigger' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getEventtriggerKeyword_7_0());
                    			
                    // InternalHybridDsl.g:713:4: ( ( ruleEString ) )
                    // InternalHybridDsl.g:714:5: ( ruleEString )
                    {
                    // InternalHybridDsl.g:714:5: ( ruleEString )
                    // InternalHybridDsl.g:715:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getDiscreteeventDiscreteEventCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHybridDsl.g:730:3: (otherlv_11= 'continuousvariable' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalHybridDsl.g:731:4: otherlv_11= 'continuousvariable' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getContinuousvariableKeyword_8_0());
                    			
                    // InternalHybridDsl.g:735:4: ( ( ruleEString ) )
                    // InternalHybridDsl.g:736:5: ( ruleEString )
                    {
                    // InternalHybridDsl.g:736:5: ( ruleEString )
                    // InternalHybridDsl.g:737:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getContinuousvariableContinuousVariableCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEString"
    // InternalHybridDsl.g:760:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalHybridDsl.g:760:47: (iv_ruleEString= ruleEString EOF )
            // InternalHybridDsl.g:761:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalHybridDsl.g:767:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalHybridDsl.g:773:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalHybridDsl.g:774:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalHybridDsl.g:774:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalHybridDsl.g:775:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHybridDsl.g:783:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleContinuousVariable"
    // InternalHybridDsl.g:794:1: entryRuleContinuousVariable returns [EObject current=null] : iv_ruleContinuousVariable= ruleContinuousVariable EOF ;
    public final EObject entryRuleContinuousVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinuousVariable = null;


        try {
            // InternalHybridDsl.g:794:59: (iv_ruleContinuousVariable= ruleContinuousVariable EOF )
            // InternalHybridDsl.g:795:2: iv_ruleContinuousVariable= ruleContinuousVariable EOF
            {
             newCompositeNode(grammarAccess.getContinuousVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContinuousVariable=ruleContinuousVariable();

            state._fsp--;

             current =iv_ruleContinuousVariable; 
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
    // $ANTLR end "entryRuleContinuousVariable"


    // $ANTLR start "ruleContinuousVariable"
    // InternalHybridDsl.g:801:1: ruleContinuousVariable returns [EObject current=null] : ( () otherlv_1= 'ContinuousVariable' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleContinuousVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalHybridDsl.g:807:2: ( ( () otherlv_1= 'ContinuousVariable' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalHybridDsl.g:808:2: ( () otherlv_1= 'ContinuousVariable' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalHybridDsl.g:808:2: ( () otherlv_1= 'ContinuousVariable' ( (lv_name_2_0= ruleEString ) ) )
            // InternalHybridDsl.g:809:3: () otherlv_1= 'ContinuousVariable' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalHybridDsl.g:809:3: ()
            // InternalHybridDsl.g:810:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContinuousVariableAccess().getContinuousVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContinuousVariableAccess().getContinuousVariableKeyword_1());
            		
            // InternalHybridDsl.g:820:3: ( (lv_name_2_0= ruleEString ) )
            // InternalHybridDsl.g:821:4: (lv_name_2_0= ruleEString )
            {
            // InternalHybridDsl.g:821:4: (lv_name_2_0= ruleEString )
            // InternalHybridDsl.g:822:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContinuousVariableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContinuousVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.EString");
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
    // $ANTLR end "ruleContinuousVariable"


    // $ANTLR start "entryRuleActivity"
    // InternalHybridDsl.g:843:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalHybridDsl.g:843:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalHybridDsl.g:844:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalHybridDsl.g:850:1: ruleActivity returns [EObject current=null] : ( () otherlv_1= 'activity' otherlv_2= '{' (otherlv_3= 'continousvariable' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalHybridDsl.g:856:2: ( ( () otherlv_1= 'activity' otherlv_2= '{' (otherlv_3= 'continousvariable' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalHybridDsl.g:857:2: ( () otherlv_1= 'activity' otherlv_2= '{' (otherlv_3= 'continousvariable' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalHybridDsl.g:857:2: ( () otherlv_1= 'activity' otherlv_2= '{' (otherlv_3= 'continousvariable' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalHybridDsl.g:858:3: () otherlv_1= 'activity' otherlv_2= '{' (otherlv_3= 'continousvariable' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalHybridDsl.g:858:3: ()
            // InternalHybridDsl.g:859:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityAccess().getActivityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHybridDsl.g:873:3: (otherlv_3= 'continousvariable' ( ( ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalHybridDsl.g:874:4: otherlv_3= 'continousvariable' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getContinousvariableKeyword_3_0());
                    			
                    // InternalHybridDsl.g:878:4: ( ( ruleEString ) )
                    // InternalHybridDsl.g:879:5: ( ruleEString )
                    {
                    // InternalHybridDsl.g:879:5: ( ruleEString )
                    // InternalHybridDsl.g:880:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivityRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActivityAccess().getContinousvariableContinuousVariableCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleDiscreteEvent"
    // InternalHybridDsl.g:903:1: entryRuleDiscreteEvent returns [EObject current=null] : iv_ruleDiscreteEvent= ruleDiscreteEvent EOF ;
    public final EObject entryRuleDiscreteEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscreteEvent = null;


        try {
            // InternalHybridDsl.g:903:54: (iv_ruleDiscreteEvent= ruleDiscreteEvent EOF )
            // InternalHybridDsl.g:904:2: iv_ruleDiscreteEvent= ruleDiscreteEvent EOF
            {
             newCompositeNode(grammarAccess.getDiscreteEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiscreteEvent=ruleDiscreteEvent();

            state._fsp--;

             current =iv_ruleDiscreteEvent; 
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
    // $ANTLR end "entryRuleDiscreteEvent"


    // $ANTLR start "ruleDiscreteEvent"
    // InternalHybridDsl.g:910:1: ruleDiscreteEvent returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'event' ) ;
    public final EObject ruleDiscreteEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalHybridDsl.g:916:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'event' ) )
            // InternalHybridDsl.g:917:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'event' )
            {
            // InternalHybridDsl.g:917:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'event' )
            // InternalHybridDsl.g:918:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'event'
            {
            // InternalHybridDsl.g:918:3: ()
            // InternalHybridDsl.g:919:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiscreteEventAccess().getDiscreteEventAction_0(),
            					current);
            			

            }

            // InternalHybridDsl.g:925:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHybridDsl.g:926:4: (lv_name_1_0= ruleEString )
            {
            // InternalHybridDsl.g:926:4: (lv_name_1_0= ruleEString )
            // InternalHybridDsl.g:927:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDiscreteEventAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiscreteEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getDiscreteEventAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDiscreteEventAccess().getEventKeyword_3());
            		

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
    // $ANTLR end "ruleDiscreteEvent"


    // $ANTLR start "entryRuleInvariant"
    // InternalHybridDsl.g:956:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // InternalHybridDsl.g:956:50: (iv_ruleInvariant= ruleInvariant EOF )
            // InternalHybridDsl.g:957:2: iv_ruleInvariant= ruleInvariant EOF
            {
             newCompositeNode(grammarAccess.getInvariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;

             current =iv_ruleInvariant; 
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
    // $ANTLR end "entryRuleInvariant"


    // $ANTLR start "ruleInvariant"
    // InternalHybridDsl.g:963:1: ruleInvariant returns [EObject current=null] : ( () otherlv_1= 'invariant' otherlv_2= '{' (otherlv_3= 'location' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalHybridDsl.g:969:2: ( ( () otherlv_1= 'invariant' otherlv_2= '{' (otherlv_3= 'location' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalHybridDsl.g:970:2: ( () otherlv_1= 'invariant' otherlv_2= '{' (otherlv_3= 'location' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalHybridDsl.g:970:2: ( () otherlv_1= 'invariant' otherlv_2= '{' (otherlv_3= 'location' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalHybridDsl.g:971:3: () otherlv_1= 'invariant' otherlv_2= '{' (otherlv_3= 'location' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalHybridDsl.g:971:3: ()
            // InternalHybridDsl.g:972:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInvariantAccess().getInvariantAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInvariantAccess().getInvariantKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getInvariantAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHybridDsl.g:986:3: (otherlv_3= 'location' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHybridDsl.g:987:4: otherlv_3= 'location' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getInvariantAccess().getLocationKeyword_3_0());
                    			
                    // InternalHybridDsl.g:991:4: ( ( ruleEString ) )
                    // InternalHybridDsl.g:992:5: ( ruleEString )
                    {
                    // InternalHybridDsl.g:992:5: ( ruleEString )
                    // InternalHybridDsl.g:993:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInvariantRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInvariantAccess().getLocationLocationCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInvariantAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInvariant"


    // $ANTLR start "entryRuleRuleSet"
    // InternalHybridDsl.g:1016:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // InternalHybridDsl.g:1016:48: (iv_ruleRuleSet= ruleRuleSet EOF )
            // InternalHybridDsl.g:1017:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
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
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // InternalHybridDsl.g:1023:1: ruleRuleSet returns [EObject current=null] : ( () otherlv_1= 'RuleSet' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalHybridDsl.g:1029:2: ( ( () otherlv_1= 'RuleSet' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalHybridDsl.g:1030:2: ( () otherlv_1= 'RuleSet' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalHybridDsl.g:1030:2: ( () otherlv_1= 'RuleSet' ( (lv_name_2_0= ruleEString ) ) )
            // InternalHybridDsl.g:1031:3: () otherlv_1= 'RuleSet' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalHybridDsl.g:1031:3: ()
            // InternalHybridDsl.g:1032:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRuleSetAccess().getRuleSetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleSetAccess().getRuleSetKeyword_1());
            		
            // InternalHybridDsl.g:1042:3: ( (lv_name_2_0= ruleEString ) )
            // InternalHybridDsl.g:1043:4: (lv_name_2_0= ruleEString )
            {
            // InternalHybridDsl.g:1043:4: (lv_name_2_0= ruleEString )
            // InternalHybridDsl.g:1044:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRuleSetAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleSetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.HybridDsl.EString");
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
    // $ANTLR end "ruleRuleSet"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001FA000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001E8000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001C8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000030008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000808000L});

}