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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'events'", "'end'", "'commands'", "'guard'", "'state'", "'entryActions'", "'{'", "'}'", "'do'", "'exitActions'", "'['", "']'", "'=>'", "'/'", "':'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalStmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStm.g"; }



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




    // $ANTLR start "entryRuleStatemachine"
    // InternalStm.g:64:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // InternalStm.g:64:53: (iv_ruleStatemachine= ruleStatemachine EOF )
            // InternalStm.g:65:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
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
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // InternalStm.g:71:1: ruleStatemachine returns [EObject current=null] : ( () otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )* otherlv_3= 'end' otherlv_4= 'commands' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= 'end' otherlv_7= 'guard' ( (lv_guards_8_0= ruleGuard ) )* otherlv_9= 'end' ( (lv_states_10_0= ruleState ) )* ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_events_2_0 = null;

        EObject lv_commands_5_0 = null;

        EObject lv_guards_8_0 = null;

        EObject lv_states_10_0 = null;



        	enterRule();

        try {
            // InternalStm.g:77:2: ( ( () otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )* otherlv_3= 'end' otherlv_4= 'commands' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= 'end' otherlv_7= 'guard' ( (lv_guards_8_0= ruleGuard ) )* otherlv_9= 'end' ( (lv_states_10_0= ruleState ) )* ) )
            // InternalStm.g:78:2: ( () otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )* otherlv_3= 'end' otherlv_4= 'commands' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= 'end' otherlv_7= 'guard' ( (lv_guards_8_0= ruleGuard ) )* otherlv_9= 'end' ( (lv_states_10_0= ruleState ) )* )
            {
            // InternalStm.g:78:2: ( () otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )* otherlv_3= 'end' otherlv_4= 'commands' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= 'end' otherlv_7= 'guard' ( (lv_guards_8_0= ruleGuard ) )* otherlv_9= 'end' ( (lv_states_10_0= ruleState ) )* )
            // InternalStm.g:79:3: () otherlv_1= 'events' ( (lv_events_2_0= ruleEvent ) )* otherlv_3= 'end' otherlv_4= 'commands' ( (lv_commands_5_0= ruleCommand ) )* otherlv_6= 'end' otherlv_7= 'guard' ( (lv_guards_8_0= ruleGuard ) )* otherlv_9= 'end' ( (lv_states_10_0= ruleState ) )*
            {
            // InternalStm.g:79:3: ()
            // InternalStm.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getEventsKeyword_1());
            		
            // InternalStm.g:90:3: ( (lv_events_2_0= ruleEvent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStm.g:91:4: (lv_events_2_0= ruleEvent )
            	    {
            	    // InternalStm.g:91:4: (lv_events_2_0= ruleEvent )
            	    // InternalStm.g:92:5: lv_events_2_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_events_2_0=ruleEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"events",
            	    						lv_events_2_0,
            	    						"net.sb.statemachine.dsl.Stm.Event");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getEndKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getCommandsKeyword_4());
            		
            // InternalStm.g:117:3: ( (lv_commands_5_0= ruleCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStm.g:118:4: (lv_commands_5_0= ruleCommand )
            	    {
            	    // InternalStm.g:118:4: (lv_commands_5_0= ruleCommand )
            	    // InternalStm.g:119:5: lv_commands_5_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_commands_5_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_5_0,
            	    						"net.sb.statemachine.dsl.Stm.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getEndKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getStatemachineAccess().getGuardKeyword_7());
            		
            // InternalStm.g:144:3: ( (lv_guards_8_0= ruleGuard ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStm.g:145:4: (lv_guards_8_0= ruleGuard )
            	    {
            	    // InternalStm.g:145:4: (lv_guards_8_0= ruleGuard )
            	    // InternalStm.g:146:5: lv_guards_8_0= ruleGuard
            	    {

            	    					newCompositeNode(grammarAccess.getStatemachineAccess().getGuardsGuardParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_guards_8_0=ruleGuard();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"guards",
            	    						lv_guards_8_0,
            	    						"net.sb.statemachine.dsl.Stm.Guard");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_9=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getStatemachineAccess().getEndKeyword_9());
            		
            // InternalStm.g:167:3: ( (lv_states_10_0= ruleState ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStm.g:168:4: (lv_states_10_0= ruleState )
            	    {
            	    // InternalStm.g:168:4: (lv_states_10_0= ruleState )
            	    // InternalStm.g:169:5: lv_states_10_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_states_10_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_10_0,
            	    						"net.sb.statemachine.dsl.Stm.State");
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
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleEvent"
    // InternalStm.g:190:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalStm.g:190:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalStm.g:191:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalStm.g:197:1: ruleEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalStm.g:203:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalStm.g:204:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalStm.g:204:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStm.g:205:3: (lv_name_0_0= RULE_ID )
            {
            // InternalStm.g:205:3: (lv_name_0_0= RULE_ID )
            // InternalStm.g:206:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEventRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleCommand"
    // InternalStm.g:225:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalStm.g:225:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalStm.g:226:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalStm.g:232:1: ruleCommand returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalStm.g:238:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalStm.g:239:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalStm.g:239:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStm.g:240:3: (lv_name_0_0= RULE_ID )
            {
            // InternalStm.g:240:3: (lv_name_0_0= RULE_ID )
            // InternalStm.g:241:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCommandRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleState"
    // InternalStm.g:260:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStm.g:260:46: (iv_ruleState= ruleState EOF )
            // InternalStm.g:261:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStm.g:267:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'entryActions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? (otherlv_6= 'do' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )? ( (lv_states_9_0= ruleState ) )* ( (lv_selfEvents_10_0= ruleSelfEvent ) )* ( (lv_transitions_11_0= ruleTransition ) )* (otherlv_12= 'exitActions' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? otherlv_16= 'end' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_states_9_0 = null;

        EObject lv_selfEvents_10_0 = null;

        EObject lv_transitions_11_0 = null;



        	enterRule();

        try {
            // InternalStm.g:273:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'entryActions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? (otherlv_6= 'do' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )? ( (lv_states_9_0= ruleState ) )* ( (lv_selfEvents_10_0= ruleSelfEvent ) )* ( (lv_transitions_11_0= ruleTransition ) )* (otherlv_12= 'exitActions' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? otherlv_16= 'end' ) )
            // InternalStm.g:274:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'entryActions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? (otherlv_6= 'do' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )? ( (lv_states_9_0= ruleState ) )* ( (lv_selfEvents_10_0= ruleSelfEvent ) )* ( (lv_transitions_11_0= ruleTransition ) )* (otherlv_12= 'exitActions' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? otherlv_16= 'end' )
            {
            // InternalStm.g:274:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'entryActions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? (otherlv_6= 'do' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )? ( (lv_states_9_0= ruleState ) )* ( (lv_selfEvents_10_0= ruleSelfEvent ) )* ( (lv_transitions_11_0= ruleTransition ) )* (otherlv_12= 'exitActions' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? otherlv_16= 'end' )
            // InternalStm.g:275:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'entryActions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )? (otherlv_6= 'do' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )? ( (lv_states_9_0= ruleState ) )* ( (lv_selfEvents_10_0= ruleSelfEvent ) )* ( (lv_transitions_11_0= ruleTransition ) )* (otherlv_12= 'exitActions' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )? otherlv_16= 'end'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalStm.g:279:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStm.g:280:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStm.g:280:4: (lv_name_1_0= RULE_ID )
            // InternalStm.g:281:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStm.g:297:3: (otherlv_2= 'entryActions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStm.g:298:4: otherlv_2= 'entryActions' otherlv_3= '{' ( (otherlv_4= RULE_ID ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getStateAccess().getEntryActionsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalStm.g:306:4: ( (otherlv_4= RULE_ID ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalStm.g:307:5: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalStm.g:307:5: (otherlv_4= RULE_ID )
                    	    // InternalStm.g:308:6: otherlv_4= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getStateRule());
                    	    						}
                    	    					
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getStateAccess().getEntryActionsCommandCrossReference_2_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalStm.g:324:3: (otherlv_6= 'do' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalStm.g:325:4: otherlv_6= 'do' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getDoKeyword_3_0());
                    			
                    // InternalStm.g:329:4: ( (otherlv_7= RULE_ID ) )
                    // InternalStm.g:330:5: (otherlv_7= RULE_ID )
                    {
                    // InternalStm.g:330:5: (otherlv_7= RULE_ID )
                    // InternalStm.g:331:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_7, grammarAccess.getStateAccess().getDoActionCommandCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalStm.g:342:4: ( (otherlv_8= RULE_ID ) )
                    // InternalStm.g:343:5: (otherlv_8= RULE_ID )
                    {
                    // InternalStm.g:343:5: (otherlv_8= RULE_ID )
                    // InternalStm.g:344:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_8, grammarAccess.getStateAccess().getStopActionCommandCrossReference_3_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStm.g:356:3: ( (lv_states_9_0= ruleState ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalStm.g:357:4: (lv_states_9_0= ruleState )
            	    {
            	    // InternalStm.g:357:4: (lv_states_9_0= ruleState )
            	    // InternalStm.g:358:5: lv_states_9_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getStatesStateParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_states_9_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_9_0,
            	    						"net.sb.statemachine.dsl.Stm.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalStm.g:375:3: ( (lv_selfEvents_10_0= ruleSelfEvent ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==21) ) {
                        int LA9_3 = input.LA(3);

                        if ( (LA9_3==RULE_ID) ) {
                            int LA9_5 = input.LA(4);

                            if ( (LA9_5==RULE_ID) ) {
                                int LA9_6 = input.LA(5);

                                if ( (LA9_6==22) ) {
                                    int LA9_7 = input.LA(6);

                                    if ( (LA9_7==24) ) {
                                        alt9=1;
                                    }


                                }


                            }
                            else if ( (LA9_5==22) ) {
                                int LA9_7 = input.LA(5);

                                if ( (LA9_7==24) ) {
                                    alt9=1;
                                }


                            }


                        }


                    }
                    else if ( (LA9_1==24) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalStm.g:376:4: (lv_selfEvents_10_0= ruleSelfEvent )
            	    {
            	    // InternalStm.g:376:4: (lv_selfEvents_10_0= ruleSelfEvent )
            	    // InternalStm.g:377:5: lv_selfEvents_10_0= ruleSelfEvent
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getSelfEventsSelfEventParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_selfEvents_10_0=ruleSelfEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"selfEvents",
            	    						lv_selfEvents_10_0,
            	    						"net.sb.statemachine.dsl.Stm.SelfEvent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalStm.g:394:3: ( (lv_transitions_11_0= ruleTransition ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalStm.g:395:4: (lv_transitions_11_0= ruleTransition )
            	    {
            	    // InternalStm.g:395:4: (lv_transitions_11_0= ruleTransition )
            	    // InternalStm.g:396:5: lv_transitions_11_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_transitions_11_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_11_0,
            	    						"net.sb.statemachine.dsl.Stm.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalStm.g:413:3: (otherlv_12= 'exitActions' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalStm.g:414:4: otherlv_12= 'exitActions' otherlv_13= '{' ( (otherlv_14= RULE_ID ) )+ otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getStateAccess().getExitActionsKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalStm.g:422:4: ( (otherlv_14= RULE_ID ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalStm.g:423:5: (otherlv_14= RULE_ID )
                    	    {
                    	    // InternalStm.g:423:5: (otherlv_14= RULE_ID )
                    	    // InternalStm.g:424:6: otherlv_14= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getStateRule());
                    	    						}
                    	    					
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getStateAccess().getExitActionsCommandCrossReference_7_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    otherlv_15=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getStateAccess().getEndKeyword_8());
            		

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalStm.g:448:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStm.g:448:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStm.g:449:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalStm.g:455:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '/' ( (otherlv_7= RULE_ID ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_guard_2_0 = null;



        	enterRule();

        try {
            // InternalStm.g:461:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '/' ( (otherlv_7= RULE_ID ) ) )? ) )
            // InternalStm.g:462:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '/' ( (otherlv_7= RULE_ID ) ) )? )
            {
            // InternalStm.g:462:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '/' ( (otherlv_7= RULE_ID ) ) )? )
            // InternalStm.g:463:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '=>' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '/' ( (otherlv_7= RULE_ID ) ) )?
            {
            // InternalStm.g:463:3: ( (otherlv_0= RULE_ID ) )
            // InternalStm.g:464:4: (otherlv_0= RULE_ID )
            {
            // InternalStm.g:464:4: (otherlv_0= RULE_ID )
            // InternalStm.g:465:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0());
            				

            }


            }

            // InternalStm.g:476:3: (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalStm.g:477:4: otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalStm.g:481:4: ( (lv_guard_2_0= ruleGuardCall ) )
                    // InternalStm.g:482:5: (lv_guard_2_0= ruleGuardCall )
                    {
                    // InternalStm.g:482:5: (lv_guard_2_0= ruleGuardCall )
                    // InternalStm.g:483:6: lv_guard_2_0= ruleGuardCall
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getGuardGuardCallParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_guard_2_0=ruleGuardCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"guard",
                    							lv_guard_2_0,
                    							"net.sb.statemachine.dsl.Stm.GuardCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalStm.g:509:3: ( (otherlv_5= RULE_ID ) )
            // InternalStm.g:510:4: (otherlv_5= RULE_ID )
            {
            // InternalStm.g:510:4: (otherlv_5= RULE_ID )
            // InternalStm.g:511:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0());
            				

            }


            }

            // InternalStm.g:522:3: (otherlv_6= '/' ( (otherlv_7= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalStm.g:523:4: otherlv_6= '/' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getSolidusKeyword_4_0());
                    			
                    // InternalStm.g:527:4: ( (otherlv_7= RULE_ID ) )
                    // InternalStm.g:528:5: (otherlv_7= RULE_ID )
                    {
                    // InternalStm.g:528:5: (otherlv_7= RULE_ID )
                    // InternalStm.g:529:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getActionCommandCrossReference_4_1_0());
                    					

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleSelfEvent"
    // InternalStm.g:545:1: entryRuleSelfEvent returns [EObject current=null] : iv_ruleSelfEvent= ruleSelfEvent EOF ;
    public final EObject entryRuleSelfEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfEvent = null;


        try {
            // InternalStm.g:545:50: (iv_ruleSelfEvent= ruleSelfEvent EOF )
            // InternalStm.g:546:2: iv_ruleSelfEvent= ruleSelfEvent EOF
            {
             newCompositeNode(grammarAccess.getSelfEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelfEvent=ruleSelfEvent();

            state._fsp--;

             current =iv_ruleSelfEvent; 
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
    // $ANTLR end "entryRuleSelfEvent"


    // $ANTLR start "ruleSelfEvent"
    // InternalStm.g:552:1: ruleSelfEvent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '/' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleSelfEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_guard_2_0 = null;



        	enterRule();

        try {
            // InternalStm.g:558:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '/' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalStm.g:559:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '/' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalStm.g:559:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '/' ( (otherlv_5= RULE_ID ) ) )
            // InternalStm.g:560:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )? otherlv_4= '/' ( (otherlv_5= RULE_ID ) )
            {
            // InternalStm.g:560:3: ( (otherlv_0= RULE_ID ) )
            // InternalStm.g:561:4: (otherlv_0= RULE_ID )
            {
            // InternalStm.g:561:4: (otherlv_0= RULE_ID )
            // InternalStm.g:562:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelfEventRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_0, grammarAccess.getSelfEventAccess().getEventEventCrossReference_0_0());
            				

            }


            }

            // InternalStm.g:573:3: (otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalStm.g:574:4: otherlv_1= '[' ( (lv_guard_2_0= ruleGuardCall ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getSelfEventAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalStm.g:578:4: ( (lv_guard_2_0= ruleGuardCall ) )
                    // InternalStm.g:579:5: (lv_guard_2_0= ruleGuardCall )
                    {
                    // InternalStm.g:579:5: (lv_guard_2_0= ruleGuardCall )
                    // InternalStm.g:580:6: lv_guard_2_0= ruleGuardCall
                    {

                    						newCompositeNode(grammarAccess.getSelfEventAccess().getGuardGuardCallParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_guard_2_0=ruleGuardCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelfEventRule());
                    						}
                    						set(
                    							current,
                    							"guard",
                    							lv_guard_2_0,
                    							"net.sb.statemachine.dsl.Stm.GuardCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getSelfEventAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getSelfEventAccess().getSolidusKeyword_2());
            		
            // InternalStm.g:606:3: ( (otherlv_5= RULE_ID ) )
            // InternalStm.g:607:4: (otherlv_5= RULE_ID )
            {
            // InternalStm.g:607:4: (otherlv_5= RULE_ID )
            // InternalStm.g:608:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelfEventRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getSelfEventAccess().getActionCommandCrossReference_3_0());
            				

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
    // $ANTLR end "ruleSelfEvent"


    // $ANTLR start "entryRuleGuardCall"
    // InternalStm.g:623:1: entryRuleGuardCall returns [EObject current=null] : iv_ruleGuardCall= ruleGuardCall EOF ;
    public final EObject entryRuleGuardCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardCall = null;


        try {
            // InternalStm.g:623:50: (iv_ruleGuardCall= ruleGuardCall EOF )
            // InternalStm.g:624:2: iv_ruleGuardCall= ruleGuardCall EOF
            {
             newCompositeNode(grammarAccess.getGuardCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuardCall=ruleGuardCall();

            state._fsp--;

             current =iv_ruleGuardCall; 
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
    // $ANTLR end "entryRuleGuardCall"


    // $ANTLR start "ruleGuardCall"
    // InternalStm.g:630:1: ruleGuardCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameters_1_0= RULE_ID ) )? ) ;
    public final EObject ruleGuardCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_parameters_1_0=null;


        	enterRule();

        try {
            // InternalStm.g:636:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameters_1_0= RULE_ID ) )? ) )
            // InternalStm.g:637:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameters_1_0= RULE_ID ) )? )
            {
            // InternalStm.g:637:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameters_1_0= RULE_ID ) )? )
            // InternalStm.g:638:3: ( (otherlv_0= RULE_ID ) ) ( (lv_parameters_1_0= RULE_ID ) )?
            {
            // InternalStm.g:638:3: ( (otherlv_0= RULE_ID ) )
            // InternalStm.g:639:4: (otherlv_0= RULE_ID )
            {
            // InternalStm.g:639:4: (otherlv_0= RULE_ID )
            // InternalStm.g:640:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuardCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getGuardCallAccess().getGuardGuardCrossReference_0_0());
            				

            }


            }

            // InternalStm.g:651:3: ( (lv_parameters_1_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalStm.g:652:4: (lv_parameters_1_0= RULE_ID )
                    {
                    // InternalStm.g:652:4: (lv_parameters_1_0= RULE_ID )
                    // InternalStm.g:653:5: lv_parameters_1_0= RULE_ID
                    {
                    lv_parameters_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_parameters_1_0, grammarAccess.getGuardCallAccess().getParametersIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGuardCallRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"parameters",
                    						lv_parameters_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleGuardCall"


    // $ANTLR start "entryRuleGuard"
    // InternalStm.g:673:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // InternalStm.g:673:46: (iv_ruleGuard= ruleGuard EOF )
            // InternalStm.g:674:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // InternalStm.g:680:1: ruleGuard returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalStm.g:686:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) ) otherlv_3= ']' )? ) )
            // InternalStm.g:687:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) ) otherlv_3= ']' )? )
            {
            // InternalStm.g:687:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) ) otherlv_3= ']' )? )
            // InternalStm.g:688:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) ) otherlv_3= ']' )?
            {
            // InternalStm.g:688:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalStm.g:689:4: (lv_name_0_0= RULE_ID )
            {
            // InternalStm.g:689:4: (lv_name_0_0= RULE_ID )
            // InternalStm.g:690:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGuardAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalStm.g:706:3: (otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) ) otherlv_3= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalStm.g:707:4: otherlv_1= '[' ( (lv_parameters_2_0= ruleParameter ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getGuardAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalStm.g:711:4: ( (lv_parameters_2_0= ruleParameter ) )
                    // InternalStm.g:712:5: (lv_parameters_2_0= ruleParameter )
                    {
                    // InternalStm.g:712:5: (lv_parameters_2_0= ruleParameter )
                    // InternalStm.g:713:6: lv_parameters_2_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getGuardAccess().getParametersParameterParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_parameters_2_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGuardRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_2_0,
                    							"net.sb.statemachine.dsl.Stm.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getGuardAccess().getRightSquareBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleParameter"
    // InternalStm.g:739:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalStm.g:739:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalStm.g:740:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalStm.g:746:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalStm.g:752:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) ) )
            // InternalStm.g:753:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            {
            // InternalStm.g:753:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) )
            // InternalStm.g:754:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) )
            {
            // InternalStm.g:754:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalStm.g:755:4: (lv_name_0_0= RULE_ID )
            {
            // InternalStm.g:755:4: (lv_name_0_0= RULE_ID )
            // InternalStm.g:756:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalStm.g:776:3: ( (lv_type_2_0= RULE_ID ) )
            // InternalStm.g:777:4: (lv_type_2_0= RULE_ID )
            {
            // InternalStm.g:777:4: (lv_type_2_0= RULE_ID )
            // InternalStm.g:778:5: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getParameterAccess().getTypeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleParameter"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000199010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000189010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000109010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000101010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});

}