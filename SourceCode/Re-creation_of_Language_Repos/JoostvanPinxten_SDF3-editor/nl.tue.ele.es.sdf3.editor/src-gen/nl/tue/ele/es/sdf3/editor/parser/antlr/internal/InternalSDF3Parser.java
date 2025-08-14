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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSDF3Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DECIMAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type'", "';'", "'properties'", "'{'", "'}'", "'application'", "'graph'", "'actor'", "'['", "']'", "','", "'channel'", "'to'", "'initially'", "'.'", "'throughput'", "'for'", "'SDF'", "'SADF'", "'in'", "'out'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DECIMAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSDF3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSDF3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSDF3Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalSDF3.g"; }



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




    // $ANTLR start "entryRuleSDF3"
    // InternalSDF3.g:65:1: entryRuleSDF3 returns [EObject current=null] : iv_ruleSDF3= ruleSDF3 EOF ;
    public final EObject entryRuleSDF3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDF3 = null;


        try {
            // InternalSDF3.g:65:45: (iv_ruleSDF3= ruleSDF3 EOF )
            // InternalSDF3.g:66:2: iv_ruleSDF3= ruleSDF3 EOF
            {
             newCompositeNode(grammarAccess.getSDF3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSDF3=ruleSDF3();

            state._fsp--;

             current =iv_ruleSDF3; 
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
    // $ANTLR end "entryRuleSDF3"


    // $ANTLR start "ruleSDF3"
    // InternalSDF3.g:72:1: ruleSDF3 returns [EObject current=null] : (otherlv_0= 'type' ruleSDF_TYPE otherlv_2= ';' ( (lv_application_3_0= ruleApplicationGraph ) ) otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= '}' ) ;
    public final EObject ruleSDF3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_application_3_0 = null;

        EObject lv_properties_6_0 = null;



        	enterRule();

        try {
            // InternalSDF3.g:78:2: ( (otherlv_0= 'type' ruleSDF_TYPE otherlv_2= ';' ( (lv_application_3_0= ruleApplicationGraph ) ) otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= '}' ) )
            // InternalSDF3.g:79:2: (otherlv_0= 'type' ruleSDF_TYPE otherlv_2= ';' ( (lv_application_3_0= ruleApplicationGraph ) ) otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= '}' )
            {
            // InternalSDF3.g:79:2: (otherlv_0= 'type' ruleSDF_TYPE otherlv_2= ';' ( (lv_application_3_0= ruleApplicationGraph ) ) otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= '}' )
            // InternalSDF3.g:80:3: otherlv_0= 'type' ruleSDF_TYPE otherlv_2= ';' ( (lv_application_3_0= ruleApplicationGraph ) ) otherlv_4= 'properties' otherlv_5= '{' ( (lv_properties_6_0= ruleProperty ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSDF3Access().getTypeKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSDF3Access().getSDF_TYPEParserRuleCall_1());
            		
            pushFollow(FOLLOW_4);
            ruleSDF_TYPE();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSDF3Access().getSemicolonKeyword_2());
            		
            // InternalSDF3.g:95:3: ( (lv_application_3_0= ruleApplicationGraph ) )
            // InternalSDF3.g:96:4: (lv_application_3_0= ruleApplicationGraph )
            {
            // InternalSDF3.g:96:4: (lv_application_3_0= ruleApplicationGraph )
            // InternalSDF3.g:97:5: lv_application_3_0= ruleApplicationGraph
            {

            					newCompositeNode(grammarAccess.getSDF3Access().getApplicationApplicationGraphParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_application_3_0=ruleApplicationGraph();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSDF3Rule());
            					}
            					set(
            						current,
            						"application",
            						lv_application_3_0,
            						"nl.tue.ele.es.sdf3.editor.SDF3.ApplicationGraph");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getSDF3Access().getPropertiesKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getSDF3Access().getLeftCurlyBracketKeyword_5());
            		
            // InternalSDF3.g:122:3: ( (lv_properties_6_0= ruleProperty ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=27 && LA1_0<=28)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSDF3.g:123:4: (lv_properties_6_0= ruleProperty )
            	    {
            	    // InternalSDF3.g:123:4: (lv_properties_6_0= ruleProperty )
            	    // InternalSDF3.g:124:5: lv_properties_6_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getSDF3Access().getPropertiesPropertyParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_properties_6_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSDF3Rule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_6_0,
            	    						"nl.tue.ele.es.sdf3.editor.SDF3.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSDF3Access().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSDF3"


    // $ANTLR start "entryRuleApplicationGraph"
    // InternalSDF3.g:149:1: entryRuleApplicationGraph returns [EObject current=null] : iv_ruleApplicationGraph= ruleApplicationGraph EOF ;
    public final EObject entryRuleApplicationGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationGraph = null;


        try {
            // InternalSDF3.g:149:57: (iv_ruleApplicationGraph= ruleApplicationGraph EOF )
            // InternalSDF3.g:150:2: iv_ruleApplicationGraph= ruleApplicationGraph EOF
            {
             newCompositeNode(grammarAccess.getApplicationGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationGraph=ruleApplicationGraph();

            state._fsp--;

             current =iv_ruleApplicationGraph; 
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
    // $ANTLR end "entryRuleApplicationGraph"


    // $ANTLR start "ruleApplicationGraph"
    // InternalSDF3.g:156:1: ruleApplicationGraph returns [EObject current=null] : (otherlv_0= 'application' otherlv_1= 'graph' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_actors_4_0= ruleActor ) )+ ( (lv_channels_5_0= ruleChannel ) )+ otherlv_6= '}' ) ;
    public final EObject ruleApplicationGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_actors_4_0 = null;

        EObject lv_channels_5_0 = null;



        	enterRule();

        try {
            // InternalSDF3.g:162:2: ( (otherlv_0= 'application' otherlv_1= 'graph' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_actors_4_0= ruleActor ) )+ ( (lv_channels_5_0= ruleChannel ) )+ otherlv_6= '}' ) )
            // InternalSDF3.g:163:2: (otherlv_0= 'application' otherlv_1= 'graph' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_actors_4_0= ruleActor ) )+ ( (lv_channels_5_0= ruleChannel ) )+ otherlv_6= '}' )
            {
            // InternalSDF3.g:163:2: (otherlv_0= 'application' otherlv_1= 'graph' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_actors_4_0= ruleActor ) )+ ( (lv_channels_5_0= ruleChannel ) )+ otherlv_6= '}' )
            // InternalSDF3.g:164:3: otherlv_0= 'application' otherlv_1= 'graph' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_actors_4_0= ruleActor ) )+ ( (lv_channels_5_0= ruleChannel ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationGraphAccess().getApplicationKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationGraphAccess().getGraphKeyword_1());
            		
            // InternalSDF3.g:172:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSDF3.g:173:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSDF3.g:173:4: (lv_name_2_0= RULE_ID )
            // InternalSDF3.g:174:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getApplicationGraphAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getApplicationGraphAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSDF3.g:194:3: ( (lv_actors_4_0= ruleActor ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSDF3.g:195:4: (lv_actors_4_0= ruleActor )
            	    {
            	    // InternalSDF3.g:195:4: (lv_actors_4_0= ruleActor )
            	    // InternalSDF3.g:196:5: lv_actors_4_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationGraphAccess().getActorsActorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_actors_4_0=ruleActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApplicationGraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actors",
            	    						lv_actors_4_0,
            	    						"nl.tue.ele.es.sdf3.editor.SDF3.Actor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalSDF3.g:213:3: ( (lv_channels_5_0= ruleChannel ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSDF3.g:214:4: (lv_channels_5_0= ruleChannel )
            	    {
            	    // InternalSDF3.g:214:4: (lv_channels_5_0= ruleChannel )
            	    // InternalSDF3.g:215:5: lv_channels_5_0= ruleChannel
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationGraphAccess().getChannelsChannelParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_channels_5_0=ruleChannel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApplicationGraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"channels",
            	    						lv_channels_5_0,
            	    						"nl.tue.ele.es.sdf3.editor.SDF3.Channel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getApplicationGraphAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleApplicationGraph"


    // $ANTLR start "entryRuleActor"
    // InternalSDF3.g:240:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalSDF3.g:240:46: (iv_ruleActor= ruleActor EOF )
            // InternalSDF3.g:241:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalSDF3.g:247:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_type_3_0= RULE_ID ) ) otherlv_4= ']' ( (lv_ports_5_0= rulePort ) ) (otherlv_6= ',' ( (lv_ports_7_0= rulePort ) ) )* otherlv_8= ';' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_ports_5_0 = null;

        EObject lv_ports_7_0 = null;



        	enterRule();

        try {
            // InternalSDF3.g:253:2: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_type_3_0= RULE_ID ) ) otherlv_4= ']' ( (lv_ports_5_0= rulePort ) ) (otherlv_6= ',' ( (lv_ports_7_0= rulePort ) ) )* otherlv_8= ';' ) )
            // InternalSDF3.g:254:2: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_type_3_0= RULE_ID ) ) otherlv_4= ']' ( (lv_ports_5_0= rulePort ) ) (otherlv_6= ',' ( (lv_ports_7_0= rulePort ) ) )* otherlv_8= ';' )
            {
            // InternalSDF3.g:254:2: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_type_3_0= RULE_ID ) ) otherlv_4= ']' ( (lv_ports_5_0= rulePort ) ) (otherlv_6= ',' ( (lv_ports_7_0= rulePort ) ) )* otherlv_8= ';' )
            // InternalSDF3.g:255:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_type_3_0= RULE_ID ) ) otherlv_4= ']' ( (lv_ports_5_0= rulePort ) ) (otherlv_6= ',' ( (lv_ports_7_0= rulePort ) ) )* otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
            		
            // InternalSDF3.g:259:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSDF3.g:260:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSDF3.g:260:4: (lv_name_1_0= RULE_ID )
            // InternalSDF3.g:261:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalSDF3.g:281:3: ( (lv_type_3_0= RULE_ID ) )
            // InternalSDF3.g:282:4: (lv_type_3_0= RULE_ID )
            {
            // InternalSDF3.g:282:4: (lv_type_3_0= RULE_ID )
            // InternalSDF3.g:283:5: lv_type_3_0= RULE_ID
            {
            lv_type_3_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_type_3_0, grammarAccess.getActorAccess().getTypeIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getActorAccess().getRightSquareBracketKeyword_4());
            		
            // InternalSDF3.g:303:3: ( (lv_ports_5_0= rulePort ) )
            // InternalSDF3.g:304:4: (lv_ports_5_0= rulePort )
            {
            // InternalSDF3.g:304:4: (lv_ports_5_0= rulePort )
            // InternalSDF3.g:305:5: lv_ports_5_0= rulePort
            {

            					newCompositeNode(grammarAccess.getActorAccess().getPortsPortParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
            lv_ports_5_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActorRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_5_0,
            						"nl.tue.ele.es.sdf3.editor.SDF3.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSDF3.g:322:3: (otherlv_6= ',' ( (lv_ports_7_0= rulePort ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSDF3.g:323:4: otherlv_6= ',' ( (lv_ports_7_0= rulePort ) )
            	    {
            	    otherlv_6=(Token)match(input,22,FOLLOW_16); 

            	    				newLeafNode(otherlv_6, grammarAccess.getActorAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSDF3.g:327:4: ( (lv_ports_7_0= rulePort ) )
            	    // InternalSDF3.g:328:5: (lv_ports_7_0= rulePort )
            	    {
            	    // InternalSDF3.g:328:5: (lv_ports_7_0= rulePort )
            	    // InternalSDF3.g:329:6: lv_ports_7_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getActorAccess().getPortsPortParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_ports_7_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_7_0,
            	    							"nl.tue.ele.es.sdf3.editor.SDF3.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getActorAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRulePort"
    // InternalSDF3.g:355:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalSDF3.g:355:45: (iv_rulePort= rulePort EOF )
            // InternalSDF3.g:356:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalSDF3.g:362:1: rulePort returns [EObject current=null] : ( ( (lv_portType_0_0= rulePortType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_rate_2_0= RULE_INT ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_rate_2_0=null;
        Enumerator lv_portType_0_0 = null;



        	enterRule();

        try {
            // InternalSDF3.g:368:2: ( ( ( (lv_portType_0_0= rulePortType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_rate_2_0= RULE_INT ) ) ) )
            // InternalSDF3.g:369:2: ( ( (lv_portType_0_0= rulePortType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_rate_2_0= RULE_INT ) ) )
            {
            // InternalSDF3.g:369:2: ( ( (lv_portType_0_0= rulePortType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_rate_2_0= RULE_INT ) ) )
            // InternalSDF3.g:370:3: ( (lv_portType_0_0= rulePortType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_rate_2_0= RULE_INT ) )
            {
            // InternalSDF3.g:370:3: ( (lv_portType_0_0= rulePortType ) )
            // InternalSDF3.g:371:4: (lv_portType_0_0= rulePortType )
            {
            // InternalSDF3.g:371:4: (lv_portType_0_0= rulePortType )
            // InternalSDF3.g:372:5: lv_portType_0_0= rulePortType
            {

            					newCompositeNode(grammarAccess.getPortAccess().getPortTypePortTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_portType_0_0=rulePortType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortRule());
            					}
            					set(
            						current,
            						"portType",
            						lv_portType_0_0,
            						"nl.tue.ele.es.sdf3.editor.SDF3.PortType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSDF3.g:389:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSDF3.g:390:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSDF3.g:390:4: (lv_name_1_0= RULE_ID )
            // InternalSDF3.g:391:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSDF3.g:407:3: ( (lv_rate_2_0= RULE_INT ) )
            // InternalSDF3.g:408:4: (lv_rate_2_0= RULE_INT )
            {
            // InternalSDF3.g:408:4: (lv_rate_2_0= RULE_INT )
            // InternalSDF3.g:409:5: lv_rate_2_0= RULE_INT
            {
            lv_rate_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_rate_2_0, grammarAccess.getPortAccess().getRateINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rate",
            						lv_rate_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleChannel"
    // InternalSDF3.g:429:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalSDF3.g:429:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalSDF3.g:430:2: iv_ruleChannel= ruleChannel EOF
            {
             newCompositeNode(grammarAccess.getChannelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannel=ruleChannel();

            state._fsp--;

             current =iv_ruleChannel; 
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
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalSDF3.g:436:1: ruleChannel returns [EObject current=null] : (otherlv_0= 'channel' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) otherlv_3= 'to' ( ( ruleFQN ) ) (otherlv_5= 'initially' ( (lv_initialTokens_6_0= RULE_INT ) ) )? ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_initialTokens_6_0=null;


        	enterRule();

        try {
            // InternalSDF3.g:442:2: ( (otherlv_0= 'channel' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) otherlv_3= 'to' ( ( ruleFQN ) ) (otherlv_5= 'initially' ( (lv_initialTokens_6_0= RULE_INT ) ) )? ) )
            // InternalSDF3.g:443:2: (otherlv_0= 'channel' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) otherlv_3= 'to' ( ( ruleFQN ) ) (otherlv_5= 'initially' ( (lv_initialTokens_6_0= RULE_INT ) ) )? )
            {
            // InternalSDF3.g:443:2: (otherlv_0= 'channel' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) otherlv_3= 'to' ( ( ruleFQN ) ) (otherlv_5= 'initially' ( (lv_initialTokens_6_0= RULE_INT ) ) )? )
            // InternalSDF3.g:444:3: otherlv_0= 'channel' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleFQN ) ) otherlv_3= 'to' ( ( ruleFQN ) ) (otherlv_5= 'initially' ( (lv_initialTokens_6_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getChannelAccess().getChannelKeyword_0());
            		
            // InternalSDF3.g:448:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSDF3.g:449:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSDF3.g:449:4: (lv_name_1_0= RULE_ID )
            // InternalSDF3.g:450:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChannelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSDF3.g:466:3: ( ( ruleFQN ) )
            // InternalSDF3.g:467:4: ( ruleFQN )
            {
            // InternalSDF3.g:467:4: ( ruleFQN )
            // InternalSDF3.g:468:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChannelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChannelAccess().getSourcePortCrossReference_2_0());
            				
            pushFollow(FOLLOW_19);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getChannelAccess().getToKeyword_3());
            		
            // InternalSDF3.g:486:3: ( ( ruleFQN ) )
            // InternalSDF3.g:487:4: ( ruleFQN )
            {
            // InternalSDF3.g:487:4: ( ruleFQN )
            // InternalSDF3.g:488:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChannelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChannelAccess().getDestinationPortCrossReference_4_0());
            				
            pushFollow(FOLLOW_20);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSDF3.g:502:3: (otherlv_5= 'initially' ( (lv_initialTokens_6_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSDF3.g:503:4: otherlv_5= 'initially' ( (lv_initialTokens_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getChannelAccess().getInitiallyKeyword_5_0());
                    			
                    // InternalSDF3.g:507:4: ( (lv_initialTokens_6_0= RULE_INT ) )
                    // InternalSDF3.g:508:5: (lv_initialTokens_6_0= RULE_INT )
                    {
                    // InternalSDF3.g:508:5: (lv_initialTokens_6_0= RULE_INT )
                    // InternalSDF3.g:509:6: lv_initialTokens_6_0= RULE_INT
                    {
                    lv_initialTokens_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_initialTokens_6_0, grammarAccess.getChannelAccess().getInitialTokensINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChannelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"initialTokens",
                    							lv_initialTokens_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleFQN"
    // InternalSDF3.g:530:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalSDF3.g:530:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalSDF3.g:531:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalSDF3.g:537:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSDF3.g:543:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSDF3.g:544:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSDF3.g:544:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSDF3.g:545:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalSDF3.g:552:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSDF3.g:553:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleProperty"
    // InternalSDF3.g:570:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalSDF3.g:570:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalSDF3.g:571:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalSDF3.g:577:1: ruleProperty returns [EObject current=null] : (this_ActorProperty_0= ruleActorProperty | this_ChannelProperty_1= ruleChannelProperty | this_GraphProperty_2= ruleGraphProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_ActorProperty_0 = null;

        EObject this_ChannelProperty_1 = null;

        EObject this_GraphProperty_2 = null;



        	enterRule();

        try {
            // InternalSDF3.g:583:2: ( (this_ActorProperty_0= ruleActorProperty | this_ChannelProperty_1= ruleChannelProperty | this_GraphProperty_2= ruleGraphProperty ) )
            // InternalSDF3.g:584:2: (this_ActorProperty_0= ruleActorProperty | this_ChannelProperty_1= ruleChannelProperty | this_GraphProperty_2= ruleGraphProperty )
            {
            // InternalSDF3.g:584:2: (this_ActorProperty_0= ruleActorProperty | this_ChannelProperty_1= ruleChannelProperty | this_GraphProperty_2= ruleGraphProperty )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==19) ) {
                    alt7=1;
                }
                else if ( (LA7_1==23) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==27) ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSDF3.g:585:3: this_ActorProperty_0= ruleActorProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getActorPropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActorProperty_0=ruleActorProperty();

                    state._fsp--;


                    			current = this_ActorProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSDF3.g:594:3: this_ChannelProperty_1= ruleChannelProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getChannelPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChannelProperty_1=ruleChannelProperty();

                    state._fsp--;


                    			current = this_ChannelProperty_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSDF3.g:603:3: this_GraphProperty_2= ruleGraphProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getGraphPropertyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphProperty_2=ruleGraphProperty();

                    state._fsp--;


                    			current = this_GraphProperty_2;
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleGraphProperty"
    // InternalSDF3.g:615:1: entryRuleGraphProperty returns [EObject current=null] : iv_ruleGraphProperty= ruleGraphProperty EOF ;
    public final EObject entryRuleGraphProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphProperty = null;


        try {
            // InternalSDF3.g:615:54: (iv_ruleGraphProperty= ruleGraphProperty EOF )
            // InternalSDF3.g:616:2: iv_ruleGraphProperty= ruleGraphProperty EOF
            {
             newCompositeNode(grammarAccess.getGraphPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphProperty=ruleGraphProperty();

            state._fsp--;

             current =iv_ruleGraphProperty; 
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
    // $ANTLR end "entryRuleGraphProperty"


    // $ANTLR start "ruleGraphProperty"
    // InternalSDF3.g:622:1: ruleGraphProperty returns [EObject current=null] : (otherlv_0= 'throughput' ( (lv_throughput_1_0= RULE_DECIMAL ) ) otherlv_2= ';' ) ;
    public final EObject ruleGraphProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_throughput_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSDF3.g:628:2: ( (otherlv_0= 'throughput' ( (lv_throughput_1_0= RULE_DECIMAL ) ) otherlv_2= ';' ) )
            // InternalSDF3.g:629:2: (otherlv_0= 'throughput' ( (lv_throughput_1_0= RULE_DECIMAL ) ) otherlv_2= ';' )
            {
            // InternalSDF3.g:629:2: (otherlv_0= 'throughput' ( (lv_throughput_1_0= RULE_DECIMAL ) ) otherlv_2= ';' )
            // InternalSDF3.g:630:3: otherlv_0= 'throughput' ( (lv_throughput_1_0= RULE_DECIMAL ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphPropertyAccess().getThroughputKeyword_0());
            		
            // InternalSDF3.g:634:3: ( (lv_throughput_1_0= RULE_DECIMAL ) )
            // InternalSDF3.g:635:4: (lv_throughput_1_0= RULE_DECIMAL )
            {
            // InternalSDF3.g:635:4: (lv_throughput_1_0= RULE_DECIMAL )
            // InternalSDF3.g:636:5: lv_throughput_1_0= RULE_DECIMAL
            {
            lv_throughput_1_0=(Token)match(input,RULE_DECIMAL,FOLLOW_4); 

            					newLeafNode(lv_throughput_1_0, grammarAccess.getGraphPropertyAccess().getThroughputDECIMALTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"throughput",
            						lv_throughput_1_0,
            						"nl.tue.ele.es.sdf3.editor.SDF3.DECIMAL");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getGraphPropertyAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleGraphProperty"


    // $ANTLR start "entryRuleChannelProperty"
    // InternalSDF3.g:660:1: entryRuleChannelProperty returns [EObject current=null] : iv_ruleChannelProperty= ruleChannelProperty EOF ;
    public final EObject entryRuleChannelProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelProperty = null;


        try {
            // InternalSDF3.g:660:56: (iv_ruleChannelProperty= ruleChannelProperty EOF )
            // InternalSDF3.g:661:2: iv_ruleChannelProperty= ruleChannelProperty EOF
            {
             newCompositeNode(grammarAccess.getChannelPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannelProperty=ruleChannelProperty();

            state._fsp--;

             current =iv_ruleChannelProperty; 
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
    // $ANTLR end "entryRuleChannelProperty"


    // $ANTLR start "ruleChannelProperty"
    // InternalSDF3.g:667:1: ruleChannelProperty returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= 'channel' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleChannelProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSDF3.g:673:2: ( (otherlv_0= 'for' otherlv_1= 'channel' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalSDF3.g:674:2: (otherlv_0= 'for' otherlv_1= 'channel' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalSDF3.g:674:2: (otherlv_0= 'for' otherlv_1= 'channel' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalSDF3.g:675:3: otherlv_0= 'for' otherlv_1= 'channel' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getChannelPropertyAccess().getForKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getChannelPropertyAccess().getChannelKeyword_1());
            		
            // InternalSDF3.g:683:3: ( (otherlv_2= RULE_ID ) )
            // InternalSDF3.g:684:4: (otherlv_2= RULE_ID )
            {
            // InternalSDF3.g:684:4: (otherlv_2= RULE_ID )
            // InternalSDF3.g:685:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChannelPropertyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_2, grammarAccess.getChannelPropertyAccess().getChannelChannelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getChannelPropertyAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getChannelPropertyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleChannelProperty"


    // $ANTLR start "entryRuleActorProperty"
    // InternalSDF3.g:708:1: entryRuleActorProperty returns [EObject current=null] : iv_ruleActorProperty= ruleActorProperty EOF ;
    public final EObject entryRuleActorProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorProperty = null;


        try {
            // InternalSDF3.g:708:54: (iv_ruleActorProperty= ruleActorProperty EOF )
            // InternalSDF3.g:709:2: iv_ruleActorProperty= ruleActorProperty EOF
            {
             newCompositeNode(grammarAccess.getActorPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActorProperty=ruleActorProperty();

            state._fsp--;

             current =iv_ruleActorProperty; 
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
    // $ANTLR end "entryRuleActorProperty"


    // $ANTLR start "ruleActorProperty"
    // InternalSDF3.g:715:1: ruleActorProperty returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= 'actor' ( ( ruleFQN ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleActorProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSDF3.g:721:2: ( (otherlv_0= 'for' otherlv_1= 'actor' ( ( ruleFQN ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalSDF3.g:722:2: (otherlv_0= 'for' otherlv_1= 'actor' ( ( ruleFQN ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalSDF3.g:722:2: (otherlv_0= 'for' otherlv_1= 'actor' ( ( ruleFQN ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalSDF3.g:723:3: otherlv_0= 'for' otherlv_1= 'actor' ( ( ruleFQN ) ) otherlv_3= '{' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getActorPropertyAccess().getForKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getActorPropertyAccess().getActorKeyword_1());
            		
            // InternalSDF3.g:731:3: ( ( ruleFQN ) )
            // InternalSDF3.g:732:4: ( ruleFQN )
            {
            // InternalSDF3.g:732:4: ( ruleFQN )
            // InternalSDF3.g:733:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActorPropertyAccess().getActorActorCrossReference_2_0());
            				
            pushFollow(FOLLOW_7);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getActorPropertyAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getActorPropertyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleActorProperty"


    // $ANTLR start "entryRuleSDF_TYPE"
    // InternalSDF3.g:759:1: entryRuleSDF_TYPE returns [String current=null] : iv_ruleSDF_TYPE= ruleSDF_TYPE EOF ;
    public final String entryRuleSDF_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSDF_TYPE = null;


        try {
            // InternalSDF3.g:759:48: (iv_ruleSDF_TYPE= ruleSDF_TYPE EOF )
            // InternalSDF3.g:760:2: iv_ruleSDF_TYPE= ruleSDF_TYPE EOF
            {
             newCompositeNode(grammarAccess.getSDF_TYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSDF_TYPE=ruleSDF_TYPE();

            state._fsp--;

             current =iv_ruleSDF_TYPE.getText(); 
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
    // $ANTLR end "entryRuleSDF_TYPE"


    // $ANTLR start "ruleSDF_TYPE"
    // InternalSDF3.g:766:1: ruleSDF_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'SDF' | kw= 'SADF' ) ;
    public final AntlrDatatypeRuleToken ruleSDF_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSDF3.g:772:2: ( (kw= 'SDF' | kw= 'SADF' ) )
            // InternalSDF3.g:773:2: (kw= 'SDF' | kw= 'SADF' )
            {
            // InternalSDF3.g:773:2: (kw= 'SDF' | kw= 'SADF' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==30) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSDF3.g:774:3: kw= 'SDF'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSDF_TYPEAccess().getSDFKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSDF3.g:780:3: kw= 'SADF'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSDF_TYPEAccess().getSADFKeyword_1());
                    		

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
    // $ANTLR end "ruleSDF_TYPE"


    // $ANTLR start "rulePortType"
    // InternalSDF3.g:789:1: rulePortType returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator rulePortType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSDF3.g:795:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalSDF3.g:796:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalSDF3.g:796:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            else if ( (LA9_0==32) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSDF3.g:797:3: (enumLiteral_0= 'in' )
                    {
                    // InternalSDF3.g:797:3: (enumLiteral_0= 'in' )
                    // InternalSDF3.g:798:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getPortTypeAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPortTypeAccess().getINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSDF3.g:805:3: (enumLiteral_1= 'out' )
                    {
                    // InternalSDF3.g:805:3: (enumLiteral_1= 'out' )
                    // InternalSDF3.g:806:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPortTypeAccess().getOUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPortTypeAccess().getOUTEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "rulePortType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000018010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000010000L});

}