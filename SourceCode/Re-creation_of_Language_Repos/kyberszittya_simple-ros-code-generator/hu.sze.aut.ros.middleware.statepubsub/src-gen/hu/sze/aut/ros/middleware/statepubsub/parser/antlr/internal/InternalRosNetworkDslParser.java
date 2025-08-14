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
import hu.sze.aut.ros.middleware.statepubsub.services.RosNetworkDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosNetworkDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stack'", "'{'", "'networktype'", "','", "'channels'", "'}'", "'package'", "'generate'", "'filter'", "'input'", "'output'", "'field'", "'ROS1'", "'ROS2'", "'messagetype'", "'servicetype'", "'service'", "':'", "'topic'", "'bool'", "'='", "'->'", "'int'", "'<'", "'>'", "'double'", "'parametergroup'", "'configobject'", "'templatenode'", "'namespace'", "'implements'", "'language'", "'parameters'", "'stati'", "'node'", "'['", "']'", "'continuousstate'", "'Python'", "'Cpp'", "'port'", "'<-'", "'estimated_freq'", "'sample_tolerance'", "'debug'", "'syncstate'", "'true'", "'false'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRosNetworkDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosNetworkDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRosNetworkDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRosNetworkDsl.g"; }



     	private RosNetworkDslGrammarAccess grammarAccess;

        public InternalRosNetworkDslParser(TokenStream input, RosNetworkDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MiddleWareNetwork";
       	}

       	@Override
       	protected RosNetworkDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMiddleWareNetwork"
    // InternalRosNetworkDsl.g:64:1: entryRuleMiddleWareNetwork returns [EObject current=null] : iv_ruleMiddleWareNetwork= ruleMiddleWareNetwork EOF ;
    public final EObject entryRuleMiddleWareNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMiddleWareNetwork = null;


        try {
            // InternalRosNetworkDsl.g:64:58: (iv_ruleMiddleWareNetwork= ruleMiddleWareNetwork EOF )
            // InternalRosNetworkDsl.g:65:2: iv_ruleMiddleWareNetwork= ruleMiddleWareNetwork EOF
            {
             newCompositeNode(grammarAccess.getMiddleWareNetworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMiddleWareNetwork=ruleMiddleWareNetwork();

            state._fsp--;

             current =iv_ruleMiddleWareNetwork; 
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
    // $ANTLR end "entryRuleMiddleWareNetwork"


    // $ANTLR start "ruleMiddleWareNetwork"
    // InternalRosNetworkDsl.g:71:1: ruleMiddleWareNetwork returns [EObject current=null] : ( () otherlv_1= 'stack' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'networktype' ( (lv_networktype_5_0= ruleNetworkType ) ) (otherlv_6= ',' ( (lv_networktype_7_0= ruleNetworkType ) ) )* ( (lv_filepackage_8_0= ruleFilePackage ) ) ( (lv_filepackage_9_0= ruleFilePackage ) )* (otherlv_10= 'channels' otherlv_11= '{' ( (lv_channels_12_0= ruleChannel ) ) ( (lv_channels_13_0= ruleChannel ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleMiddleWareNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_networktype_5_0 = null;

        AntlrDatatypeRuleToken lv_networktype_7_0 = null;

        EObject lv_filepackage_8_0 = null;

        EObject lv_filepackage_9_0 = null;

        EObject lv_channels_12_0 = null;

        EObject lv_channels_13_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:77:2: ( ( () otherlv_1= 'stack' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'networktype' ( (lv_networktype_5_0= ruleNetworkType ) ) (otherlv_6= ',' ( (lv_networktype_7_0= ruleNetworkType ) ) )* ( (lv_filepackage_8_0= ruleFilePackage ) ) ( (lv_filepackage_9_0= ruleFilePackage ) )* (otherlv_10= 'channels' otherlv_11= '{' ( (lv_channels_12_0= ruleChannel ) ) ( (lv_channels_13_0= ruleChannel ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalRosNetworkDsl.g:78:2: ( () otherlv_1= 'stack' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'networktype' ( (lv_networktype_5_0= ruleNetworkType ) ) (otherlv_6= ',' ( (lv_networktype_7_0= ruleNetworkType ) ) )* ( (lv_filepackage_8_0= ruleFilePackage ) ) ( (lv_filepackage_9_0= ruleFilePackage ) )* (otherlv_10= 'channels' otherlv_11= '{' ( (lv_channels_12_0= ruleChannel ) ) ( (lv_channels_13_0= ruleChannel ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalRosNetworkDsl.g:78:2: ( () otherlv_1= 'stack' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'networktype' ( (lv_networktype_5_0= ruleNetworkType ) ) (otherlv_6= ',' ( (lv_networktype_7_0= ruleNetworkType ) ) )* ( (lv_filepackage_8_0= ruleFilePackage ) ) ( (lv_filepackage_9_0= ruleFilePackage ) )* (otherlv_10= 'channels' otherlv_11= '{' ( (lv_channels_12_0= ruleChannel ) ) ( (lv_channels_13_0= ruleChannel ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalRosNetworkDsl.g:79:3: () otherlv_1= 'stack' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'networktype' ( (lv_networktype_5_0= ruleNetworkType ) ) (otherlv_6= ',' ( (lv_networktype_7_0= ruleNetworkType ) ) )* ( (lv_filepackage_8_0= ruleFilePackage ) ) ( (lv_filepackage_9_0= ruleFilePackage ) )* (otherlv_10= 'channels' otherlv_11= '{' ( (lv_channels_12_0= ruleChannel ) ) ( (lv_channels_13_0= ruleChannel ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalRosNetworkDsl.g:79:3: ()
            // InternalRosNetworkDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMiddleWareNetworkAccess().getStackAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMiddleWareNetworkAccess().getStackKeyword_1());
            		
            // InternalRosNetworkDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMiddleWareNetworkAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMiddleWareNetworkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getMiddleWareNetworkAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getMiddleWareNetworkAccess().getNetworktypeKeyword_4());
            		
            // InternalRosNetworkDsl.g:117:3: ( (lv_networktype_5_0= ruleNetworkType ) )
            // InternalRosNetworkDsl.g:118:4: (lv_networktype_5_0= ruleNetworkType )
            {
            // InternalRosNetworkDsl.g:118:4: (lv_networktype_5_0= ruleNetworkType )
            // InternalRosNetworkDsl.g:119:5: lv_networktype_5_0= ruleNetworkType
            {

            					newCompositeNode(grammarAccess.getMiddleWareNetworkAccess().getNetworktypeNetworkTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_networktype_5_0=ruleNetworkType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMiddleWareNetworkRule());
            					}
            					add(
            						current,
            						"networktype",
            						lv_networktype_5_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.NetworkType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:136:3: (otherlv_6= ',' ( (lv_networktype_7_0= ruleNetworkType ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:137:4: otherlv_6= ',' ( (lv_networktype_7_0= ruleNetworkType ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getMiddleWareNetworkAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRosNetworkDsl.g:141:4: ( (lv_networktype_7_0= ruleNetworkType ) )
            	    // InternalRosNetworkDsl.g:142:5: (lv_networktype_7_0= ruleNetworkType )
            	    {
            	    // InternalRosNetworkDsl.g:142:5: (lv_networktype_7_0= ruleNetworkType )
            	    // InternalRosNetworkDsl.g:143:6: lv_networktype_7_0= ruleNetworkType
            	    {

            	    						newCompositeNode(grammarAccess.getMiddleWareNetworkAccess().getNetworktypeNetworkTypeParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_networktype_7_0=ruleNetworkType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMiddleWareNetworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"networktype",
            	    							lv_networktype_7_0,
            	    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.NetworkType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalRosNetworkDsl.g:161:3: ( (lv_filepackage_8_0= ruleFilePackage ) )
            // InternalRosNetworkDsl.g:162:4: (lv_filepackage_8_0= ruleFilePackage )
            {
            // InternalRosNetworkDsl.g:162:4: (lv_filepackage_8_0= ruleFilePackage )
            // InternalRosNetworkDsl.g:163:5: lv_filepackage_8_0= ruleFilePackage
            {

            					newCompositeNode(grammarAccess.getMiddleWareNetworkAccess().getFilepackageFilePackageParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_filepackage_8_0=ruleFilePackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMiddleWareNetworkRule());
            					}
            					add(
            						current,
            						"filepackage",
            						lv_filepackage_8_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.FilePackage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:180:3: ( (lv_filepackage_9_0= ruleFilePackage ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:181:4: (lv_filepackage_9_0= ruleFilePackage )
            	    {
            	    // InternalRosNetworkDsl.g:181:4: (lv_filepackage_9_0= ruleFilePackage )
            	    // InternalRosNetworkDsl.g:182:5: lv_filepackage_9_0= ruleFilePackage
            	    {

            	    					newCompositeNode(grammarAccess.getMiddleWareNetworkAccess().getFilepackageFilePackageParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_filepackage_9_0=ruleFilePackage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMiddleWareNetworkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"filepackage",
            	    						lv_filepackage_9_0,
            	    						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.FilePackage");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalRosNetworkDsl.g:199:3: (otherlv_10= 'channels' otherlv_11= '{' ( (lv_channels_12_0= ruleChannel ) ) ( (lv_channels_13_0= ruleChannel ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRosNetworkDsl.g:200:4: otherlv_10= 'channels' otherlv_11= '{' ( (lv_channels_12_0= ruleChannel ) ) ( (lv_channels_13_0= ruleChannel ) )* otherlv_14= '}'
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getMiddleWareNetworkAccess().getChannelsKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getMiddleWareNetworkAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRosNetworkDsl.g:208:4: ( (lv_channels_12_0= ruleChannel ) )
                    // InternalRosNetworkDsl.g:209:5: (lv_channels_12_0= ruleChannel )
                    {
                    // InternalRosNetworkDsl.g:209:5: (lv_channels_12_0= ruleChannel )
                    // InternalRosNetworkDsl.g:210:6: lv_channels_12_0= ruleChannel
                    {

                    						newCompositeNode(grammarAccess.getMiddleWareNetworkAccess().getChannelsChannelParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_channels_12_0=ruleChannel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMiddleWareNetworkRule());
                    						}
                    						add(
                    							current,
                    							"channels",
                    							lv_channels_12_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.Channel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosNetworkDsl.g:227:4: ( (lv_channels_13_0= ruleChannel ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==27||LA3_0==29) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRosNetworkDsl.g:228:5: (lv_channels_13_0= ruleChannel )
                    	    {
                    	    // InternalRosNetworkDsl.g:228:5: (lv_channels_13_0= ruleChannel )
                    	    // InternalRosNetworkDsl.g:229:6: lv_channels_13_0= ruleChannel
                    	    {

                    	    						newCompositeNode(grammarAccess.getMiddleWareNetworkAccess().getChannelsChannelParserRuleCall_9_3_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_channels_13_0=ruleChannel();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMiddleWareNetworkRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"channels",
                    	    							lv_channels_13_0,
                    	    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.Channel");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getMiddleWareNetworkAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getMiddleWareNetworkAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleMiddleWareNetwork"


    // $ANTLR start "entryRuleFilePackage"
    // InternalRosNetworkDsl.g:259:1: entryRuleFilePackage returns [EObject current=null] : iv_ruleFilePackage= ruleFilePackage EOF ;
    public final EObject entryRuleFilePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilePackage = null;


        try {
            // InternalRosNetworkDsl.g:259:52: (iv_ruleFilePackage= ruleFilePackage EOF )
            // InternalRosNetworkDsl.g:260:2: iv_ruleFilePackage= ruleFilePackage EOF
            {
             newCompositeNode(grammarAccess.getFilePackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilePackage=ruleFilePackage();

            state._fsp--;

             current =iv_ruleFilePackage; 
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
    // $ANTLR end "entryRuleFilePackage"


    // $ANTLR start "ruleFilePackage"
    // InternalRosNetworkDsl.g:266:1: ruleFilePackage returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= ruleEString ) ) ( (lv_generateartifact_3_0= 'generate' ) )? otherlv_4= '{' ( (lv_abstractroselement_5_0= ruleAbstractRosFileElement ) ) ( (lv_abstractroselement_6_0= ruleAbstractRosFileElement ) )* ( ( (lv_filter_7_0= ruleFilterDefinition ) ) ( (lv_filter_8_0= ruleFilterDefinition ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleFilePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_generateartifact_3_0=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_abstractroselement_5_0 = null;

        EObject lv_abstractroselement_6_0 = null;

        EObject lv_filter_7_0 = null;

        EObject lv_filter_8_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:272:2: ( ( () otherlv_1= 'package' ( (lv_name_2_0= ruleEString ) ) ( (lv_generateartifact_3_0= 'generate' ) )? otherlv_4= '{' ( (lv_abstractroselement_5_0= ruleAbstractRosFileElement ) ) ( (lv_abstractroselement_6_0= ruleAbstractRosFileElement ) )* ( ( (lv_filter_7_0= ruleFilterDefinition ) ) ( (lv_filter_8_0= ruleFilterDefinition ) )* )? otherlv_9= '}' ) )
            // InternalRosNetworkDsl.g:273:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleEString ) ) ( (lv_generateartifact_3_0= 'generate' ) )? otherlv_4= '{' ( (lv_abstractroselement_5_0= ruleAbstractRosFileElement ) ) ( (lv_abstractroselement_6_0= ruleAbstractRosFileElement ) )* ( ( (lv_filter_7_0= ruleFilterDefinition ) ) ( (lv_filter_8_0= ruleFilterDefinition ) )* )? otherlv_9= '}' )
            {
            // InternalRosNetworkDsl.g:273:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleEString ) ) ( (lv_generateartifact_3_0= 'generate' ) )? otherlv_4= '{' ( (lv_abstractroselement_5_0= ruleAbstractRosFileElement ) ) ( (lv_abstractroselement_6_0= ruleAbstractRosFileElement ) )* ( ( (lv_filter_7_0= ruleFilterDefinition ) ) ( (lv_filter_8_0= ruleFilterDefinition ) )* )? otherlv_9= '}' )
            // InternalRosNetworkDsl.g:274:3: () otherlv_1= 'package' ( (lv_name_2_0= ruleEString ) ) ( (lv_generateartifact_3_0= 'generate' ) )? otherlv_4= '{' ( (lv_abstractroselement_5_0= ruleAbstractRosFileElement ) ) ( (lv_abstractroselement_6_0= ruleAbstractRosFileElement ) )* ( ( (lv_filter_7_0= ruleFilterDefinition ) ) ( (lv_filter_8_0= ruleFilterDefinition ) )* )? otherlv_9= '}'
            {
            // InternalRosNetworkDsl.g:274:3: ()
            // InternalRosNetworkDsl.g:275:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFilePackageAccess().getFilePackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFilePackageAccess().getPackageKeyword_1());
            		
            // InternalRosNetworkDsl.g:285:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:286:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:286:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:287:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFilePackageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilePackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:304:3: ( (lv_generateartifact_3_0= 'generate' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRosNetworkDsl.g:305:4: (lv_generateartifact_3_0= 'generate' )
                    {
                    // InternalRosNetworkDsl.g:305:4: (lv_generateartifact_3_0= 'generate' )
                    // InternalRosNetworkDsl.g:306:5: lv_generateartifact_3_0= 'generate'
                    {
                    lv_generateartifact_3_0=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(lv_generateartifact_3_0, grammarAccess.getFilePackageAccess().getGenerateartifactGenerateKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFilePackageRule());
                    					}
                    					setWithLastConsumed(current, "generateartifact", lv_generateartifact_3_0 != null, "generate");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getFilePackageAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRosNetworkDsl.g:322:3: ( (lv_abstractroselement_5_0= ruleAbstractRosFileElement ) )
            // InternalRosNetworkDsl.g:323:4: (lv_abstractroselement_5_0= ruleAbstractRosFileElement )
            {
            // InternalRosNetworkDsl.g:323:4: (lv_abstractroselement_5_0= ruleAbstractRosFileElement )
            // InternalRosNetworkDsl.g:324:5: lv_abstractroselement_5_0= ruleAbstractRosFileElement
            {

            					newCompositeNode(grammarAccess.getFilePackageAccess().getAbstractroselementAbstractRosFileElementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_abstractroselement_5_0=ruleAbstractRosFileElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilePackageRule());
            					}
            					add(
            						current,
            						"abstractroselement",
            						lv_abstractroselement_5_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.AbstractRosFileElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:341:3: ( (lv_abstractroselement_6_0= ruleAbstractRosFileElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=25 && LA6_0<=26)||LA6_0==45) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:342:4: (lv_abstractroselement_6_0= ruleAbstractRosFileElement )
            	    {
            	    // InternalRosNetworkDsl.g:342:4: (lv_abstractroselement_6_0= ruleAbstractRosFileElement )
            	    // InternalRosNetworkDsl.g:343:5: lv_abstractroselement_6_0= ruleAbstractRosFileElement
            	    {

            	    					newCompositeNode(grammarAccess.getFilePackageAccess().getAbstractroselementAbstractRosFileElementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_abstractroselement_6_0=ruleAbstractRosFileElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFilePackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstractroselement",
            	    						lv_abstractroselement_6_0,
            	    						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.AbstractRosFileElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalRosNetworkDsl.g:360:3: ( ( (lv_filter_7_0= ruleFilterDefinition ) ) ( (lv_filter_8_0= ruleFilterDefinition ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRosNetworkDsl.g:361:4: ( (lv_filter_7_0= ruleFilterDefinition ) ) ( (lv_filter_8_0= ruleFilterDefinition ) )*
                    {
                    // InternalRosNetworkDsl.g:361:4: ( (lv_filter_7_0= ruleFilterDefinition ) )
                    // InternalRosNetworkDsl.g:362:5: (lv_filter_7_0= ruleFilterDefinition )
                    {
                    // InternalRosNetworkDsl.g:362:5: (lv_filter_7_0= ruleFilterDefinition )
                    // InternalRosNetworkDsl.g:363:6: lv_filter_7_0= ruleFilterDefinition
                    {

                    						newCompositeNode(grammarAccess.getFilePackageAccess().getFilterFilterDefinitionParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_filter_7_0=ruleFilterDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilePackageRule());
                    						}
                    						add(
                    							current,
                    							"filter",
                    							lv_filter_7_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.FilterDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosNetworkDsl.g:380:4: ( (lv_filter_8_0= ruleFilterDefinition ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRosNetworkDsl.g:381:5: (lv_filter_8_0= ruleFilterDefinition )
                    	    {
                    	    // InternalRosNetworkDsl.g:381:5: (lv_filter_8_0= ruleFilterDefinition )
                    	    // InternalRosNetworkDsl.g:382:6: lv_filter_8_0= ruleFilterDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getFilePackageAccess().getFilterFilterDefinitionParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_filter_8_0=ruleFilterDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFilePackageRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"filter",
                    	    							lv_filter_8_0,
                    	    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.FilterDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFilePackageAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleFilePackage"


    // $ANTLR start "entryRuleFilterDefinition"
    // InternalRosNetworkDsl.g:408:1: entryRuleFilterDefinition returns [EObject current=null] : iv_ruleFilterDefinition= ruleFilterDefinition EOF ;
    public final EObject entryRuleFilterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterDefinition = null;


        try {
            // InternalRosNetworkDsl.g:408:57: (iv_ruleFilterDefinition= ruleFilterDefinition EOF )
            // InternalRosNetworkDsl.g:409:2: iv_ruleFilterDefinition= ruleFilterDefinition EOF
            {
             newCompositeNode(grammarAccess.getFilterDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterDefinition=ruleFilterDefinition();

            state._fsp--;

             current =iv_ruleFilterDefinition; 
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
    // $ANTLR end "entryRuleFilterDefinition"


    // $ANTLR start "ruleFilterDefinition"
    // InternalRosNetworkDsl.g:415:1: ruleFilterDefinition returns [EObject current=null] : ( () otherlv_1= 'filter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'input' ( (lv_input_field_5_0= ruleSerializedField ) ) (otherlv_6= 'input' ( (lv_input_field_7_0= ruleSerializedField ) ) )* otherlv_8= 'output' ( (lv_output_field_9_0= ruleSerializedField ) ) otherlv_10= '}' ) ;
    public final EObject ruleFilterDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_input_field_5_0 = null;

        EObject lv_input_field_7_0 = null;

        EObject lv_output_field_9_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:421:2: ( ( () otherlv_1= 'filter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'input' ( (lv_input_field_5_0= ruleSerializedField ) ) (otherlv_6= 'input' ( (lv_input_field_7_0= ruleSerializedField ) ) )* otherlv_8= 'output' ( (lv_output_field_9_0= ruleSerializedField ) ) otherlv_10= '}' ) )
            // InternalRosNetworkDsl.g:422:2: ( () otherlv_1= 'filter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'input' ( (lv_input_field_5_0= ruleSerializedField ) ) (otherlv_6= 'input' ( (lv_input_field_7_0= ruleSerializedField ) ) )* otherlv_8= 'output' ( (lv_output_field_9_0= ruleSerializedField ) ) otherlv_10= '}' )
            {
            // InternalRosNetworkDsl.g:422:2: ( () otherlv_1= 'filter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'input' ( (lv_input_field_5_0= ruleSerializedField ) ) (otherlv_6= 'input' ( (lv_input_field_7_0= ruleSerializedField ) ) )* otherlv_8= 'output' ( (lv_output_field_9_0= ruleSerializedField ) ) otherlv_10= '}' )
            // InternalRosNetworkDsl.g:423:3: () otherlv_1= 'filter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'input' ( (lv_input_field_5_0= ruleSerializedField ) ) (otherlv_6= 'input' ( (lv_input_field_7_0= ruleSerializedField ) ) )* otherlv_8= 'output' ( (lv_output_field_9_0= ruleSerializedField ) ) otherlv_10= '}'
            {
            // InternalRosNetworkDsl.g:423:3: ()
            // InternalRosNetworkDsl.g:424:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFilterDefinitionAccess().getFilterDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterDefinitionAccess().getFilterKeyword_1());
            		
            // InternalRosNetworkDsl.g:434:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:435:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:435:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:436:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFilterDefinitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getFilterDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getFilterDefinitionAccess().getInputKeyword_4());
            		
            // InternalRosNetworkDsl.g:461:3: ( (lv_input_field_5_0= ruleSerializedField ) )
            // InternalRosNetworkDsl.g:462:4: (lv_input_field_5_0= ruleSerializedField )
            {
            // InternalRosNetworkDsl.g:462:4: (lv_input_field_5_0= ruleSerializedField )
            // InternalRosNetworkDsl.g:463:5: lv_input_field_5_0= ruleSerializedField
            {

            					newCompositeNode(grammarAccess.getFilterDefinitionAccess().getInput_fieldSerializedFieldParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_input_field_5_0=ruleSerializedField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterDefinitionRule());
            					}
            					add(
            						current,
            						"input_field",
            						lv_input_field_5_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.SerializedField");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:480:3: (otherlv_6= 'input' ( (lv_input_field_7_0= ruleSerializedField ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:481:4: otherlv_6= 'input' ( (lv_input_field_7_0= ruleSerializedField ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_17); 

            	    				newLeafNode(otherlv_6, grammarAccess.getFilterDefinitionAccess().getInputKeyword_6_0());
            	    			
            	    // InternalRosNetworkDsl.g:485:4: ( (lv_input_field_7_0= ruleSerializedField ) )
            	    // InternalRosNetworkDsl.g:486:5: (lv_input_field_7_0= ruleSerializedField )
            	    {
            	    // InternalRosNetworkDsl.g:486:5: (lv_input_field_7_0= ruleSerializedField )
            	    // InternalRosNetworkDsl.g:487:6: lv_input_field_7_0= ruleSerializedField
            	    {

            	    						newCompositeNode(grammarAccess.getFilterDefinitionAccess().getInput_fieldSerializedFieldParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_input_field_7_0=ruleSerializedField();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFilterDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"input_field",
            	    							lv_input_field_7_0,
            	    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.SerializedField");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getFilterDefinitionAccess().getOutputKeyword_7());
            		
            // InternalRosNetworkDsl.g:509:3: ( (lv_output_field_9_0= ruleSerializedField ) )
            // InternalRosNetworkDsl.g:510:4: (lv_output_field_9_0= ruleSerializedField )
            {
            // InternalRosNetworkDsl.g:510:4: (lv_output_field_9_0= ruleSerializedField )
            // InternalRosNetworkDsl.g:511:5: lv_output_field_9_0= ruleSerializedField
            {

            					newCompositeNode(grammarAccess.getFilterDefinitionAccess().getOutput_fieldSerializedFieldParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_output_field_9_0=ruleSerializedField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterDefinitionRule());
            					}
            					set(
            						current,
            						"output_field",
            						lv_output_field_9_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.SerializedField");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFilterDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleFilterDefinition"


    // $ANTLR start "entryRuleSerializedField"
    // InternalRosNetworkDsl.g:536:1: entryRuleSerializedField returns [EObject current=null] : iv_ruleSerializedField= ruleSerializedField EOF ;
    public final EObject entryRuleSerializedField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSerializedField = null;


        try {
            // InternalRosNetworkDsl.g:536:56: (iv_ruleSerializedField= ruleSerializedField EOF )
            // InternalRosNetworkDsl.g:537:2: iv_ruleSerializedField= ruleSerializedField EOF
            {
             newCompositeNode(grammarAccess.getSerializedFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSerializedField=ruleSerializedField();

            state._fsp--;

             current =iv_ruleSerializedField; 
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
    // $ANTLR end "entryRuleSerializedField"


    // $ANTLR start "ruleSerializedField"
    // InternalRosNetworkDsl.g:543:1: ruleSerializedField returns [EObject current=null] : ( () otherlv_1= 'field' ( (lv_id_2_0= ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleSerializedField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:549:2: ( ( () otherlv_1= 'field' ( (lv_id_2_0= ruleEString ) ) ( ( ruleEString ) ) ) )
            // InternalRosNetworkDsl.g:550:2: ( () otherlv_1= 'field' ( (lv_id_2_0= ruleEString ) ) ( ( ruleEString ) ) )
            {
            // InternalRosNetworkDsl.g:550:2: ( () otherlv_1= 'field' ( (lv_id_2_0= ruleEString ) ) ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:551:3: () otherlv_1= 'field' ( (lv_id_2_0= ruleEString ) ) ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:551:3: ()
            // InternalRosNetworkDsl.g:552:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSerializedFieldAccess().getSerializedFieldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSerializedFieldAccess().getFieldKeyword_1());
            		
            // InternalRosNetworkDsl.g:562:3: ( (lv_id_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:563:4: (lv_id_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:563:4: (lv_id_2_0= ruleEString )
            // InternalRosNetworkDsl.g:564:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSerializedFieldAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSerializedFieldRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:581:3: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:582:4: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:582:4: ( ruleEString )
            // InternalRosNetworkDsl.g:583:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSerializedFieldRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSerializedFieldAccess().getTopicmessageTopicMessageCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleSerializedField"


    // $ANTLR start "entryRuleAbstractRosFileElement"
    // InternalRosNetworkDsl.g:601:1: entryRuleAbstractRosFileElement returns [EObject current=null] : iv_ruleAbstractRosFileElement= ruleAbstractRosFileElement EOF ;
    public final EObject entryRuleAbstractRosFileElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRosFileElement = null;


        try {
            // InternalRosNetworkDsl.g:601:63: (iv_ruleAbstractRosFileElement= ruleAbstractRosFileElement EOF )
            // InternalRosNetworkDsl.g:602:2: iv_ruleAbstractRosFileElement= ruleAbstractRosFileElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractRosFileElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractRosFileElement=ruleAbstractRosFileElement();

            state._fsp--;

             current =iv_ruleAbstractRosFileElement; 
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
    // $ANTLR end "entryRuleAbstractRosFileElement"


    // $ANTLR start "ruleAbstractRosFileElement"
    // InternalRosNetworkDsl.g:608:1: ruleAbstractRosFileElement returns [EObject current=null] : (this_AbstractMessageType_0= ruleAbstractMessageType | this_Node_1= ruleNode ) ;
    public final EObject ruleAbstractRosFileElement() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractMessageType_0 = null;

        EObject this_Node_1 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:614:2: ( (this_AbstractMessageType_0= ruleAbstractMessageType | this_Node_1= ruleNode ) )
            // InternalRosNetworkDsl.g:615:2: (this_AbstractMessageType_0= ruleAbstractMessageType | this_Node_1= ruleNode )
            {
            // InternalRosNetworkDsl.g:615:2: (this_AbstractMessageType_0= ruleAbstractMessageType | this_Node_1= ruleNode )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=25 && LA10_0<=26)) ) {
                alt10=1;
            }
            else if ( (LA10_0==45) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRosNetworkDsl.g:616:3: this_AbstractMessageType_0= ruleAbstractMessageType
                    {

                    			newCompositeNode(grammarAccess.getAbstractRosFileElementAccess().getAbstractMessageTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractMessageType_0=ruleAbstractMessageType();

                    state._fsp--;


                    			current = this_AbstractMessageType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:625:3: this_Node_1= ruleNode
                    {

                    			newCompositeNode(grammarAccess.getAbstractRosFileElementAccess().getNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Node_1=ruleNode();

                    state._fsp--;


                    			current = this_Node_1;
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
    // $ANTLR end "ruleAbstractRosFileElement"


    // $ANTLR start "entryRuleAbstractMessageType"
    // InternalRosNetworkDsl.g:637:1: entryRuleAbstractMessageType returns [EObject current=null] : iv_ruleAbstractMessageType= ruleAbstractMessageType EOF ;
    public final EObject entryRuleAbstractMessageType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMessageType = null;


        try {
            // InternalRosNetworkDsl.g:637:60: (iv_ruleAbstractMessageType= ruleAbstractMessageType EOF )
            // InternalRosNetworkDsl.g:638:2: iv_ruleAbstractMessageType= ruleAbstractMessageType EOF
            {
             newCompositeNode(grammarAccess.getAbstractMessageTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractMessageType=ruleAbstractMessageType();

            state._fsp--;

             current =iv_ruleAbstractMessageType; 
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
    // $ANTLR end "entryRuleAbstractMessageType"


    // $ANTLR start "ruleAbstractMessageType"
    // InternalRosNetworkDsl.g:644:1: ruleAbstractMessageType returns [EObject current=null] : (this_TopicMessage_0= ruleTopicMessage | this_ServiceType_1= ruleServiceType ) ;
    public final EObject ruleAbstractMessageType() throws RecognitionException {
        EObject current = null;

        EObject this_TopicMessage_0 = null;

        EObject this_ServiceType_1 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:650:2: ( (this_TopicMessage_0= ruleTopicMessage | this_ServiceType_1= ruleServiceType ) )
            // InternalRosNetworkDsl.g:651:2: (this_TopicMessage_0= ruleTopicMessage | this_ServiceType_1= ruleServiceType )
            {
            // InternalRosNetworkDsl.g:651:2: (this_TopicMessage_0= ruleTopicMessage | this_ServiceType_1= ruleServiceType )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRosNetworkDsl.g:652:3: this_TopicMessage_0= ruleTopicMessage
                    {

                    			newCompositeNode(grammarAccess.getAbstractMessageTypeAccess().getTopicMessageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TopicMessage_0=ruleTopicMessage();

                    state._fsp--;


                    			current = this_TopicMessage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:661:3: this_ServiceType_1= ruleServiceType
                    {

                    			newCompositeNode(grammarAccess.getAbstractMessageTypeAccess().getServiceTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServiceType_1=ruleServiceType();

                    state._fsp--;


                    			current = this_ServiceType_1;
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
    // $ANTLR end "ruleAbstractMessageType"


    // $ANTLR start "entryRuleNetworkType"
    // InternalRosNetworkDsl.g:673:1: entryRuleNetworkType returns [String current=null] : iv_ruleNetworkType= ruleNetworkType EOF ;
    public final String entryRuleNetworkType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNetworkType = null;


        try {
            // InternalRosNetworkDsl.g:673:51: (iv_ruleNetworkType= ruleNetworkType EOF )
            // InternalRosNetworkDsl.g:674:2: iv_ruleNetworkType= ruleNetworkType EOF
            {
             newCompositeNode(grammarAccess.getNetworkTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkType=ruleNetworkType();

            state._fsp--;

             current =iv_ruleNetworkType.getText(); 
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
    // $ANTLR end "entryRuleNetworkType"


    // $ANTLR start "ruleNetworkType"
    // InternalRosNetworkDsl.g:680:1: ruleNetworkType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ROS1' | kw= 'ROS2' ) ;
    public final AntlrDatatypeRuleToken ruleNetworkType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosNetworkDsl.g:686:2: ( (kw= 'ROS1' | kw= 'ROS2' ) )
            // InternalRosNetworkDsl.g:687:2: (kw= 'ROS1' | kw= 'ROS2' )
            {
            // InternalRosNetworkDsl.g:687:2: (kw= 'ROS1' | kw= 'ROS2' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRosNetworkDsl.g:688:3: kw= 'ROS1'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNetworkTypeAccess().getROS1Keyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:694:3: kw= 'ROS2'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNetworkTypeAccess().getROS2Keyword_1());
                    		

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
    // $ANTLR end "ruleNetworkType"


    // $ANTLR start "entryRuleTopicMessage"
    // InternalRosNetworkDsl.g:703:1: entryRuleTopicMessage returns [EObject current=null] : iv_ruleTopicMessage= ruleTopicMessage EOF ;
    public final EObject entryRuleTopicMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicMessage = null;


        try {
            // InternalRosNetworkDsl.g:703:53: (iv_ruleTopicMessage= ruleTopicMessage EOF )
            // InternalRosNetworkDsl.g:704:2: iv_ruleTopicMessage= ruleTopicMessage EOF
            {
             newCompositeNode(grammarAccess.getTopicMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopicMessage=ruleTopicMessage();

            state._fsp--;

             current =iv_ruleTopicMessage; 
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
    // $ANTLR end "entryRuleTopicMessage"


    // $ANTLR start "ruleTopicMessage"
    // InternalRosNetworkDsl.g:710:1: ruleTopicMessage returns [EObject current=null] : ( () otherlv_1= 'messagetype' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleTopicMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:716:2: ( ( () otherlv_1= 'messagetype' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRosNetworkDsl.g:717:2: ( () otherlv_1= 'messagetype' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRosNetworkDsl.g:717:2: ( () otherlv_1= 'messagetype' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRosNetworkDsl.g:718:3: () otherlv_1= 'messagetype' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRosNetworkDsl.g:718:3: ()
            // InternalRosNetworkDsl.g:719:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopicMessageAccess().getTopicMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTopicMessageAccess().getMessagetypeKeyword_1());
            		
            // InternalRosNetworkDsl.g:729:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:730:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:730:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:731:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTopicMessageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTopicMessageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
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
    // $ANTLR end "ruleTopicMessage"


    // $ANTLR start "entryRuleServiceType"
    // InternalRosNetworkDsl.g:752:1: entryRuleServiceType returns [EObject current=null] : iv_ruleServiceType= ruleServiceType EOF ;
    public final EObject entryRuleServiceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceType = null;


        try {
            // InternalRosNetworkDsl.g:752:52: (iv_ruleServiceType= ruleServiceType EOF )
            // InternalRosNetworkDsl.g:753:2: iv_ruleServiceType= ruleServiceType EOF
            {
             newCompositeNode(grammarAccess.getServiceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceType=ruleServiceType();

            state._fsp--;

             current =iv_ruleServiceType; 
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
    // $ANTLR end "entryRuleServiceType"


    // $ANTLR start "ruleServiceType"
    // InternalRosNetworkDsl.g:759:1: ruleServiceType returns [EObject current=null] : ( () otherlv_1= 'servicetype' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleServiceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:765:2: ( ( () otherlv_1= 'servicetype' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRosNetworkDsl.g:766:2: ( () otherlv_1= 'servicetype' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRosNetworkDsl.g:766:2: ( () otherlv_1= 'servicetype' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRosNetworkDsl.g:767:3: () otherlv_1= 'servicetype' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRosNetworkDsl.g:767:3: ()
            // InternalRosNetworkDsl.g:768:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceTypeAccess().getServiceTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceTypeAccess().getServicetypeKeyword_1());
            		
            // InternalRosNetworkDsl.g:778:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:779:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:779:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:780:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
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
    // $ANTLR end "ruleServiceType"


    // $ANTLR start "entryRuleChannel"
    // InternalRosNetworkDsl.g:801:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalRosNetworkDsl.g:801:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalRosNetworkDsl.g:802:2: iv_ruleChannel= ruleChannel EOF
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
    // InternalRosNetworkDsl.g:808:1: ruleChannel returns [EObject current=null] : (this_Topic_0= ruleTopic | this_Service_1= ruleService ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        EObject this_Topic_0 = null;

        EObject this_Service_1 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:814:2: ( (this_Topic_0= ruleTopic | this_Service_1= ruleService ) )
            // InternalRosNetworkDsl.g:815:2: (this_Topic_0= ruleTopic | this_Service_1= ruleService )
            {
            // InternalRosNetworkDsl.g:815:2: (this_Topic_0= ruleTopic | this_Service_1= ruleService )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRosNetworkDsl.g:816:3: this_Topic_0= ruleTopic
                    {

                    			newCompositeNode(grammarAccess.getChannelAccess().getTopicParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Topic_0=ruleTopic();

                    state._fsp--;


                    			current = this_Topic_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:825:3: this_Service_1= ruleService
                    {

                    			newCompositeNode(grammarAccess.getChannelAccess().getServiceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Service_1=ruleService();

                    state._fsp--;


                    			current = this_Service_1;
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
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleService"
    // InternalRosNetworkDsl.g:837:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalRosNetworkDsl.g:837:48: (iv_ruleService= ruleService EOF )
            // InternalRosNetworkDsl.g:838:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalRosNetworkDsl.g:844:1: ruleService returns [EObject current=null] : ( () otherlv_1= 'service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:850:2: ( ( () otherlv_1= 'service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) )
            // InternalRosNetworkDsl.g:851:2: ( () otherlv_1= 'service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            {
            // InternalRosNetworkDsl.g:851:2: ( () otherlv_1= 'service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:852:3: () otherlv_1= 'service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:852:3: ()
            // InternalRosNetworkDsl.g:853:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceAccess().getServiceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getServiceKeyword_1());
            		
            // InternalRosNetworkDsl.g:863:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:864:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:864:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:865:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getColonKeyword_3());
            		
            // InternalRosNetworkDsl.g:886:3: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:887:4: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:887:4: ( ruleEString )
            // InternalRosNetworkDsl.g:888:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceAccess().getTypeServiceTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleTopic"
    // InternalRosNetworkDsl.g:906:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // InternalRosNetworkDsl.g:906:46: (iv_ruleTopic= ruleTopic EOF )
            // InternalRosNetworkDsl.g:907:2: iv_ruleTopic= ruleTopic EOF
            {
             newCompositeNode(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopic=ruleTopic();

            state._fsp--;

             current =iv_ruleTopic; 
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
    // $ANTLR end "entryRuleTopic"


    // $ANTLR start "ruleTopic"
    // InternalRosNetworkDsl.g:913:1: ruleTopic returns [EObject current=null] : ( () otherlv_1= 'topic' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:919:2: ( ( () otherlv_1= 'topic' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) )
            // InternalRosNetworkDsl.g:920:2: ( () otherlv_1= 'topic' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            {
            // InternalRosNetworkDsl.g:920:2: ( () otherlv_1= 'topic' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:921:3: () otherlv_1= 'topic' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:921:3: ()
            // InternalRosNetworkDsl.g:922:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopicAccess().getTopicAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTopicAccess().getTopicKeyword_1());
            		
            // InternalRosNetworkDsl.g:932:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:933:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:933:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:934:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTopicAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTopicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTopicAccess().getColonKeyword_3());
            		
            // InternalRosNetworkDsl.g:955:3: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:956:4: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:956:4: ( ruleEString )
            // InternalRosNetworkDsl.g:957:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopicRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTopicAccess().getTypeTopicMessageCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleTopic"


    // $ANTLR start "entryRuleNodeParameter"
    // InternalRosNetworkDsl.g:975:1: entryRuleNodeParameter returns [EObject current=null] : iv_ruleNodeParameter= ruleNodeParameter EOF ;
    public final EObject entryRuleNodeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeParameter = null;


        try {
            // InternalRosNetworkDsl.g:975:54: (iv_ruleNodeParameter= ruleNodeParameter EOF )
            // InternalRosNetworkDsl.g:976:2: iv_ruleNodeParameter= ruleNodeParameter EOF
            {
             newCompositeNode(grammarAccess.getNodeParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeParameter=ruleNodeParameter();

            state._fsp--;

             current =iv_ruleNodeParameter; 
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
    // $ANTLR end "entryRuleNodeParameter"


    // $ANTLR start "ruleNodeParameter"
    // InternalRosNetworkDsl.g:982:1: ruleNodeParameter returns [EObject current=null] : (this_DoubleParameter_0= ruleDoubleParameter | this_IntegerParameter_1= ruleIntegerParameter | this_BooleanParameter_2= ruleBooleanParameter ) ;
    public final EObject ruleNodeParameter() throws RecognitionException {
        EObject current = null;

        EObject this_DoubleParameter_0 = null;

        EObject this_IntegerParameter_1 = null;

        EObject this_BooleanParameter_2 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:988:2: ( (this_DoubleParameter_0= ruleDoubleParameter | this_IntegerParameter_1= ruleIntegerParameter | this_BooleanParameter_2= ruleBooleanParameter ) )
            // InternalRosNetworkDsl.g:989:2: (this_DoubleParameter_0= ruleDoubleParameter | this_IntegerParameter_1= ruleIntegerParameter | this_BooleanParameter_2= ruleBooleanParameter )
            {
            // InternalRosNetworkDsl.g:989:2: (this_DoubleParameter_0= ruleDoubleParameter | this_IntegerParameter_1= ruleIntegerParameter | this_BooleanParameter_2= ruleBooleanParameter )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt14=1;
                }
                break;
            case 33:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalRosNetworkDsl.g:990:3: this_DoubleParameter_0= ruleDoubleParameter
                    {

                    			newCompositeNode(grammarAccess.getNodeParameterAccess().getDoubleParameterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleParameter_0=ruleDoubleParameter();

                    state._fsp--;


                    			current = this_DoubleParameter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:999:3: this_IntegerParameter_1= ruleIntegerParameter
                    {

                    			newCompositeNode(grammarAccess.getNodeParameterAccess().getIntegerParameterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerParameter_1=ruleIntegerParameter();

                    state._fsp--;


                    			current = this_IntegerParameter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRosNetworkDsl.g:1008:3: this_BooleanParameter_2= ruleBooleanParameter
                    {

                    			newCompositeNode(grammarAccess.getNodeParameterAccess().getBooleanParameterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanParameter_2=ruleBooleanParameter();

                    state._fsp--;


                    			current = this_BooleanParameter_2;
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
    // $ANTLR end "ruleNodeParameter"


    // $ANTLR start "entryRuleBooleanParameter"
    // InternalRosNetworkDsl.g:1020:1: entryRuleBooleanParameter returns [EObject current=null] : iv_ruleBooleanParameter= ruleBooleanParameter EOF ;
    public final EObject entryRuleBooleanParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanParameter = null;


        try {
            // InternalRosNetworkDsl.g:1020:57: (iv_ruleBooleanParameter= ruleBooleanParameter EOF )
            // InternalRosNetworkDsl.g:1021:2: iv_ruleBooleanParameter= ruleBooleanParameter EOF
            {
             newCompositeNode(grammarAccess.getBooleanParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanParameter=ruleBooleanParameter();

            state._fsp--;

             current =iv_ruleBooleanParameter; 
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
    // $ANTLR end "entryRuleBooleanParameter"


    // $ANTLR start "ruleBooleanParameter"
    // InternalRosNetworkDsl.g:1027:1: ruleBooleanParameter returns [EObject current=null] : ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_defaultval_4_0= ruleEBoolean ) ) (otherlv_5= '->' ( (lv_targetvar_6_0= ruleEString ) ) )? ) ;
    public final EObject ruleBooleanParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_defaultval_4_0 = null;

        AntlrDatatypeRuleToken lv_targetvar_6_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:1033:2: ( ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_defaultval_4_0= ruleEBoolean ) ) (otherlv_5= '->' ( (lv_targetvar_6_0= ruleEString ) ) )? ) )
            // InternalRosNetworkDsl.g:1034:2: ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_defaultval_4_0= ruleEBoolean ) ) (otherlv_5= '->' ( (lv_targetvar_6_0= ruleEString ) ) )? )
            {
            // InternalRosNetworkDsl.g:1034:2: ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_defaultval_4_0= ruleEBoolean ) ) (otherlv_5= '->' ( (lv_targetvar_6_0= ruleEString ) ) )? )
            // InternalRosNetworkDsl.g:1035:3: () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_defaultval_4_0= ruleEBoolean ) ) (otherlv_5= '->' ( (lv_targetvar_6_0= ruleEString ) ) )?
            {
            // InternalRosNetworkDsl.g:1035:3: ()
            // InternalRosNetworkDsl.g:1036:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanParameterAccess().getBooleanParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanParameterAccess().getBoolKeyword_1());
            		
            // InternalRosNetworkDsl.g:1046:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:1047:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:1047:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:1048:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBooleanParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getBooleanParameterAccess().getEqualsSignKeyword_3());
            		
            // InternalRosNetworkDsl.g:1069:3: ( (lv_defaultval_4_0= ruleEBoolean ) )
            // InternalRosNetworkDsl.g:1070:4: (lv_defaultval_4_0= ruleEBoolean )
            {
            // InternalRosNetworkDsl.g:1070:4: (lv_defaultval_4_0= ruleEBoolean )
            // InternalRosNetworkDsl.g:1071:5: lv_defaultval_4_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getBooleanParameterAccess().getDefaultvalEBooleanParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_defaultval_4_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanParameterRule());
            					}
            					set(
            						current,
            						"defaultval",
            						lv_defaultval_4_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:1088:3: (otherlv_5= '->' ( (lv_targetvar_6_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosNetworkDsl.g:1089:4: otherlv_5= '->' ( (lv_targetvar_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getBooleanParameterAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                    			
                    // InternalRosNetworkDsl.g:1093:4: ( (lv_targetvar_6_0= ruleEString ) )
                    // InternalRosNetworkDsl.g:1094:5: (lv_targetvar_6_0= ruleEString )
                    {
                    // InternalRosNetworkDsl.g:1094:5: (lv_targetvar_6_0= ruleEString )
                    // InternalRosNetworkDsl.g:1095:6: lv_targetvar_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBooleanParameterAccess().getTargetvarEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_targetvar_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanParameterRule());
                    						}
                    						set(
                    							current,
                    							"targetvar",
                    							lv_targetvar_6_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
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
    // $ANTLR end "ruleBooleanParameter"


    // $ANTLR start "entryRuleIntegerParameter"
    // InternalRosNetworkDsl.g:1117:1: entryRuleIntegerParameter returns [EObject current=null] : iv_ruleIntegerParameter= ruleIntegerParameter EOF ;
    public final EObject entryRuleIntegerParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerParameter = null;


        try {
            // InternalRosNetworkDsl.g:1117:57: (iv_ruleIntegerParameter= ruleIntegerParameter EOF )
            // InternalRosNetworkDsl.g:1118:2: iv_ruleIntegerParameter= ruleIntegerParameter EOF
            {
             newCompositeNode(grammarAccess.getIntegerParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerParameter=ruleIntegerParameter();

            state._fsp--;

             current =iv_ruleIntegerParameter; 
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
    // $ANTLR end "entryRuleIntegerParameter"


    // $ANTLR start "ruleIntegerParameter"
    // InternalRosNetworkDsl.g:1124:1: ruleIntegerParameter returns [EObject current=null] : ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_defaultval_4_0= ruleEInt ) ) otherlv_5= '<' ( (lv_minval_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_maxval_8_0= ruleEInt ) ) otherlv_9= '>' (otherlv_10= '->' ( (lv_targetvar_11_0= ruleEString ) ) )? ) ;
    public final EObject ruleIntegerParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_defaultval_4_0 = null;

        AntlrDatatypeRuleToken lv_minval_6_0 = null;

        AntlrDatatypeRuleToken lv_maxval_8_0 = null;

        AntlrDatatypeRuleToken lv_targetvar_11_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:1130:2: ( ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_defaultval_4_0= ruleEInt ) ) otherlv_5= '<' ( (lv_minval_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_maxval_8_0= ruleEInt ) ) otherlv_9= '>' (otherlv_10= '->' ( (lv_targetvar_11_0= ruleEString ) ) )? ) )
            // InternalRosNetworkDsl.g:1131:2: ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_defaultval_4_0= ruleEInt ) ) otherlv_5= '<' ( (lv_minval_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_maxval_8_0= ruleEInt ) ) otherlv_9= '>' (otherlv_10= '->' ( (lv_targetvar_11_0= ruleEString ) ) )? )
            {
            // InternalRosNetworkDsl.g:1131:2: ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_defaultval_4_0= ruleEInt ) ) otherlv_5= '<' ( (lv_minval_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_maxval_8_0= ruleEInt ) ) otherlv_9= '>' (otherlv_10= '->' ( (lv_targetvar_11_0= ruleEString ) ) )? )
            // InternalRosNetworkDsl.g:1132:3: () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_defaultval_4_0= ruleEInt ) ) otherlv_5= '<' ( (lv_minval_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_maxval_8_0= ruleEInt ) ) otherlv_9= '>' (otherlv_10= '->' ( (lv_targetvar_11_0= ruleEString ) ) )?
            {
            // InternalRosNetworkDsl.g:1132:3: ()
            // InternalRosNetworkDsl.g:1133:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerParameterAccess().getIntegerParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerParameterAccess().getIntKeyword_1());
            		
            // InternalRosNetworkDsl.g:1143:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:1144:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:1144:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:1145:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegerParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getIntegerParameterAccess().getEqualsSignKeyword_3());
            		
            // InternalRosNetworkDsl.g:1166:3: ( (lv_defaultval_4_0= ruleEInt ) )
            // InternalRosNetworkDsl.g:1167:4: (lv_defaultval_4_0= ruleEInt )
            {
            // InternalRosNetworkDsl.g:1167:4: (lv_defaultval_4_0= ruleEInt )
            // InternalRosNetworkDsl.g:1168:5: lv_defaultval_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getIntegerParameterAccess().getDefaultvalEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_defaultval_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerParameterRule());
            					}
            					set(
            						current,
            						"defaultval",
            						lv_defaultval_4_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getIntegerParameterAccess().getLessThanSignKeyword_5());
            		
            // InternalRosNetworkDsl.g:1189:3: ( (lv_minval_6_0= ruleEInt ) )
            // InternalRosNetworkDsl.g:1190:4: (lv_minval_6_0= ruleEInt )
            {
            // InternalRosNetworkDsl.g:1190:4: (lv_minval_6_0= ruleEInt )
            // InternalRosNetworkDsl.g:1191:5: lv_minval_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getIntegerParameterAccess().getMinvalEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
            lv_minval_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerParameterRule());
            					}
            					set(
            						current,
            						"minval",
            						lv_minval_6_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getIntegerParameterAccess().getCommaKeyword_7());
            		
            // InternalRosNetworkDsl.g:1212:3: ( (lv_maxval_8_0= ruleEInt ) )
            // InternalRosNetworkDsl.g:1213:4: (lv_maxval_8_0= ruleEInt )
            {
            // InternalRosNetworkDsl.g:1213:4: (lv_maxval_8_0= ruleEInt )
            // InternalRosNetworkDsl.g:1214:5: lv_maxval_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getIntegerParameterAccess().getMaxvalEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_26);
            lv_maxval_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerParameterRule());
            					}
            					set(
            						current,
            						"maxval",
            						lv_maxval_8_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getIntegerParameterAccess().getGreaterThanSignKeyword_9());
            		
            // InternalRosNetworkDsl.g:1235:3: (otherlv_10= '->' ( (lv_targetvar_11_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRosNetworkDsl.g:1236:4: otherlv_10= '->' ( (lv_targetvar_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getIntegerParameterAccess().getHyphenMinusGreaterThanSignKeyword_10_0());
                    			
                    // InternalRosNetworkDsl.g:1240:4: ( (lv_targetvar_11_0= ruleEString ) )
                    // InternalRosNetworkDsl.g:1241:5: (lv_targetvar_11_0= ruleEString )
                    {
                    // InternalRosNetworkDsl.g:1241:5: (lv_targetvar_11_0= ruleEString )
                    // InternalRosNetworkDsl.g:1242:6: lv_targetvar_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIntegerParameterAccess().getTargetvarEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_targetvar_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerParameterRule());
                    						}
                    						set(
                    							current,
                    							"targetvar",
                    							lv_targetvar_11_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
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
    // $ANTLR end "ruleIntegerParameter"


    // $ANTLR start "entryRuleDoubleParameter"
    // InternalRosNetworkDsl.g:1264:1: entryRuleDoubleParameter returns [EObject current=null] : iv_ruleDoubleParameter= ruleDoubleParameter EOF ;
    public final EObject entryRuleDoubleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleParameter = null;


        try {
            // InternalRosNetworkDsl.g:1264:56: (iv_ruleDoubleParameter= ruleDoubleParameter EOF )
            // InternalRosNetworkDsl.g:1265:2: iv_ruleDoubleParameter= ruleDoubleParameter EOF
            {
             newCompositeNode(grammarAccess.getDoubleParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleParameter=ruleDoubleParameter();

            state._fsp--;

             current =iv_ruleDoubleParameter; 
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
    // $ANTLR end "entryRuleDoubleParameter"


    // $ANTLR start "ruleDoubleParameter"
    // InternalRosNetworkDsl.g:1271:1: ruleDoubleParameter returns [EObject current=null] : ( () otherlv_1= 'double' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_defaultval_4_0= ruleDouble ) ) otherlv_5= '<' ( (lv_minval_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_maxval_8_0= ruleDouble ) ) otherlv_9= '>' (otherlv_10= '->' ( (lv_targetvar_11_0= ruleEString ) ) )? ) ;
    public final EObject ruleDoubleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_defaultval_4_0 = null;

        AntlrDatatypeRuleToken lv_minval_6_0 = null;

        AntlrDatatypeRuleToken lv_maxval_8_0 = null;

        AntlrDatatypeRuleToken lv_targetvar_11_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:1277:2: ( ( () otherlv_1= 'double' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_defaultval_4_0= ruleDouble ) ) otherlv_5= '<' ( (lv_minval_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_maxval_8_0= ruleDouble ) ) otherlv_9= '>' (otherlv_10= '->' ( (lv_targetvar_11_0= ruleEString ) ) )? ) )
            // InternalRosNetworkDsl.g:1278:2: ( () otherlv_1= 'double' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_defaultval_4_0= ruleDouble ) ) otherlv_5= '<' ( (lv_minval_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_maxval_8_0= ruleDouble ) ) otherlv_9= '>' (otherlv_10= '->' ( (lv_targetvar_11_0= ruleEString ) ) )? )
            {
            // InternalRosNetworkDsl.g:1278:2: ( () otherlv_1= 'double' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_defaultval_4_0= ruleDouble ) ) otherlv_5= '<' ( (lv_minval_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_maxval_8_0= ruleDouble ) ) otherlv_9= '>' (otherlv_10= '->' ( (lv_targetvar_11_0= ruleEString ) ) )? )
            // InternalRosNetworkDsl.g:1279:3: () otherlv_1= 'double' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_defaultval_4_0= ruleDouble ) ) otherlv_5= '<' ( (lv_minval_6_0= ruleDouble ) ) otherlv_7= ',' ( (lv_maxval_8_0= ruleDouble ) ) otherlv_9= '>' (otherlv_10= '->' ( (lv_targetvar_11_0= ruleEString ) ) )?
            {
            // InternalRosNetworkDsl.g:1279:3: ()
            // InternalRosNetworkDsl.g:1280:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDoubleParameterAccess().getDoubleParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDoubleParameterAccess().getDoubleKeyword_1());
            		
            // InternalRosNetworkDsl.g:1290:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:1291:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:1291:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:1292:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDoubleParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoubleParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getDoubleParameterAccess().getEqualsSignKeyword_3());
            		
            // InternalRosNetworkDsl.g:1313:3: ( (lv_defaultval_4_0= ruleDouble ) )
            // InternalRosNetworkDsl.g:1314:4: (lv_defaultval_4_0= ruleDouble )
            {
            // InternalRosNetworkDsl.g:1314:4: (lv_defaultval_4_0= ruleDouble )
            // InternalRosNetworkDsl.g:1315:5: lv_defaultval_4_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getDoubleParameterAccess().getDefaultvalDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_defaultval_4_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoubleParameterRule());
            					}
            					set(
            						current,
            						"defaultval",
            						lv_defaultval_4_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getDoubleParameterAccess().getLessThanSignKeyword_5());
            		
            // InternalRosNetworkDsl.g:1336:3: ( (lv_minval_6_0= ruleDouble ) )
            // InternalRosNetworkDsl.g:1337:4: (lv_minval_6_0= ruleDouble )
            {
            // InternalRosNetworkDsl.g:1337:4: (lv_minval_6_0= ruleDouble )
            // InternalRosNetworkDsl.g:1338:5: lv_minval_6_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getDoubleParameterAccess().getMinvalDoubleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
            lv_minval_6_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoubleParameterRule());
            					}
            					set(
            						current,
            						"minval",
            						lv_minval_6_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getDoubleParameterAccess().getCommaKeyword_7());
            		
            // InternalRosNetworkDsl.g:1359:3: ( (lv_maxval_8_0= ruleDouble ) )
            // InternalRosNetworkDsl.g:1360:4: (lv_maxval_8_0= ruleDouble )
            {
            // InternalRosNetworkDsl.g:1360:4: (lv_maxval_8_0= ruleDouble )
            // InternalRosNetworkDsl.g:1361:5: lv_maxval_8_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getDoubleParameterAccess().getMaxvalDoubleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_26);
            lv_maxval_8_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoubleParameterRule());
            					}
            					set(
            						current,
            						"maxval",
            						lv_maxval_8_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getDoubleParameterAccess().getGreaterThanSignKeyword_9());
            		
            // InternalRosNetworkDsl.g:1382:3: (otherlv_10= '->' ( (lv_targetvar_11_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRosNetworkDsl.g:1383:4: otherlv_10= '->' ( (lv_targetvar_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getDoubleParameterAccess().getHyphenMinusGreaterThanSignKeyword_10_0());
                    			
                    // InternalRosNetworkDsl.g:1387:4: ( (lv_targetvar_11_0= ruleEString ) )
                    // InternalRosNetworkDsl.g:1388:5: (lv_targetvar_11_0= ruleEString )
                    {
                    // InternalRosNetworkDsl.g:1388:5: (lv_targetvar_11_0= ruleEString )
                    // InternalRosNetworkDsl.g:1389:6: lv_targetvar_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDoubleParameterAccess().getTargetvarEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_targetvar_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDoubleParameterRule());
                    						}
                    						set(
                    							current,
                    							"targetvar",
                    							lv_targetvar_11_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
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
    // $ANTLR end "ruleDoubleParameter"


    // $ANTLR start "entryRuleNodeParameterGroup"
    // InternalRosNetworkDsl.g:1411:1: entryRuleNodeParameterGroup returns [EObject current=null] : iv_ruleNodeParameterGroup= ruleNodeParameterGroup EOF ;
    public final EObject entryRuleNodeParameterGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeParameterGroup = null;


        try {
            // InternalRosNetworkDsl.g:1411:59: (iv_ruleNodeParameterGroup= ruleNodeParameterGroup EOF )
            // InternalRosNetworkDsl.g:1412:2: iv_ruleNodeParameterGroup= ruleNodeParameterGroup EOF
            {
             newCompositeNode(grammarAccess.getNodeParameterGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeParameterGroup=ruleNodeParameterGroup();

            state._fsp--;

             current =iv_ruleNodeParameterGroup; 
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
    // $ANTLR end "entryRuleNodeParameterGroup"


    // $ANTLR start "ruleNodeParameterGroup"
    // InternalRosNetworkDsl.g:1418:1: ruleNodeParameterGroup returns [EObject current=null] : ( () otherlv_1= 'parametergroup' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'configobject' ( (lv_config_obj_4_0= ruleEString ) ) )? (otherlv_5= 'generate' ( (lv_generate_struct_6_0= ruleEBoolean ) ) )? otherlv_7= '{' ( (lv_nodeparameter_8_0= ruleNodeParameter ) ) ( (lv_nodeparameter_9_0= ruleNodeParameter ) )* otherlv_10= '}' ) ;
    public final EObject ruleNodeParameterGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_config_obj_4_0 = null;

        AntlrDatatypeRuleToken lv_generate_struct_6_0 = null;

        EObject lv_nodeparameter_8_0 = null;

        EObject lv_nodeparameter_9_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:1424:2: ( ( () otherlv_1= 'parametergroup' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'configobject' ( (lv_config_obj_4_0= ruleEString ) ) )? (otherlv_5= 'generate' ( (lv_generate_struct_6_0= ruleEBoolean ) ) )? otherlv_7= '{' ( (lv_nodeparameter_8_0= ruleNodeParameter ) ) ( (lv_nodeparameter_9_0= ruleNodeParameter ) )* otherlv_10= '}' ) )
            // InternalRosNetworkDsl.g:1425:2: ( () otherlv_1= 'parametergroup' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'configobject' ( (lv_config_obj_4_0= ruleEString ) ) )? (otherlv_5= 'generate' ( (lv_generate_struct_6_0= ruleEBoolean ) ) )? otherlv_7= '{' ( (lv_nodeparameter_8_0= ruleNodeParameter ) ) ( (lv_nodeparameter_9_0= ruleNodeParameter ) )* otherlv_10= '}' )
            {
            // InternalRosNetworkDsl.g:1425:2: ( () otherlv_1= 'parametergroup' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'configobject' ( (lv_config_obj_4_0= ruleEString ) ) )? (otherlv_5= 'generate' ( (lv_generate_struct_6_0= ruleEBoolean ) ) )? otherlv_7= '{' ( (lv_nodeparameter_8_0= ruleNodeParameter ) ) ( (lv_nodeparameter_9_0= ruleNodeParameter ) )* otherlv_10= '}' )
            // InternalRosNetworkDsl.g:1426:3: () otherlv_1= 'parametergroup' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'configobject' ( (lv_config_obj_4_0= ruleEString ) ) )? (otherlv_5= 'generate' ( (lv_generate_struct_6_0= ruleEBoolean ) ) )? otherlv_7= '{' ( (lv_nodeparameter_8_0= ruleNodeParameter ) ) ( (lv_nodeparameter_9_0= ruleNodeParameter ) )* otherlv_10= '}'
            {
            // InternalRosNetworkDsl.g:1426:3: ()
            // InternalRosNetworkDsl.g:1427:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeParameterGroupAccess().getNodeParameterGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeParameterGroupAccess().getParametergroupKeyword_1());
            		
            // InternalRosNetworkDsl.g:1437:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:1438:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:1438:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:1439:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNodeParameterGroupAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeParameterGroupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:1456:3: (otherlv_3= 'configobject' ( (lv_config_obj_4_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRosNetworkDsl.g:1457:4: otherlv_3= 'configobject' ( (lv_config_obj_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getNodeParameterGroupAccess().getConfigobjectKeyword_3_0());
                    			
                    // InternalRosNetworkDsl.g:1461:4: ( (lv_config_obj_4_0= ruleEString ) )
                    // InternalRosNetworkDsl.g:1462:5: (lv_config_obj_4_0= ruleEString )
                    {
                    // InternalRosNetworkDsl.g:1462:5: (lv_config_obj_4_0= ruleEString )
                    // InternalRosNetworkDsl.g:1463:6: lv_config_obj_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNodeParameterGroupAccess().getConfig_objEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_config_obj_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeParameterGroupRule());
                    						}
                    						set(
                    							current,
                    							"config_obj",
                    							lv_config_obj_4_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosNetworkDsl.g:1481:3: (otherlv_5= 'generate' ( (lv_generate_struct_6_0= ruleEBoolean ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRosNetworkDsl.g:1482:4: otherlv_5= 'generate' ( (lv_generate_struct_6_0= ruleEBoolean ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getNodeParameterGroupAccess().getGenerateKeyword_4_0());
                    			
                    // InternalRosNetworkDsl.g:1486:4: ( (lv_generate_struct_6_0= ruleEBoolean ) )
                    // InternalRosNetworkDsl.g:1487:5: (lv_generate_struct_6_0= ruleEBoolean )
                    {
                    // InternalRosNetworkDsl.g:1487:5: (lv_generate_struct_6_0= ruleEBoolean )
                    // InternalRosNetworkDsl.g:1488:6: lv_generate_struct_6_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getNodeParameterGroupAccess().getGenerate_structEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_generate_struct_6_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeParameterGroupRule());
                    						}
                    						set(
                    							current,
                    							"generate_struct",
                    							lv_generate_struct_6_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_7, grammarAccess.getNodeParameterGroupAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalRosNetworkDsl.g:1510:3: ( (lv_nodeparameter_8_0= ruleNodeParameter ) )
            // InternalRosNetworkDsl.g:1511:4: (lv_nodeparameter_8_0= ruleNodeParameter )
            {
            // InternalRosNetworkDsl.g:1511:4: (lv_nodeparameter_8_0= ruleNodeParameter )
            // InternalRosNetworkDsl.g:1512:5: lv_nodeparameter_8_0= ruleNodeParameter
            {

            					newCompositeNode(grammarAccess.getNodeParameterGroupAccess().getNodeparameterNodeParameterParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_29);
            lv_nodeparameter_8_0=ruleNodeParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeParameterGroupRule());
            					}
            					add(
            						current,
            						"nodeparameter",
            						lv_nodeparameter_8_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.NodeParameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:1529:3: ( (lv_nodeparameter_9_0= ruleNodeParameter ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30||LA20_0==33||LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:1530:4: (lv_nodeparameter_9_0= ruleNodeParameter )
            	    {
            	    // InternalRosNetworkDsl.g:1530:4: (lv_nodeparameter_9_0= ruleNodeParameter )
            	    // InternalRosNetworkDsl.g:1531:5: lv_nodeparameter_9_0= ruleNodeParameter
            	    {

            	    					newCompositeNode(grammarAccess.getNodeParameterGroupAccess().getNodeparameterNodeParameterParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_nodeparameter_9_0=ruleNodeParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeParameterGroupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodeparameter",
            	    						lv_nodeparameter_9_0,
            	    						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.NodeParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getNodeParameterGroupAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleNodeParameterGroup"


    // $ANTLR start "entryRuleAbstractNodeParameter"
    // InternalRosNetworkDsl.g:1556:1: entryRuleAbstractNodeParameter returns [EObject current=null] : iv_ruleAbstractNodeParameter= ruleAbstractNodeParameter EOF ;
    public final EObject entryRuleAbstractNodeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNodeParameter = null;


        try {
            // InternalRosNetworkDsl.g:1556:62: (iv_ruleAbstractNodeParameter= ruleAbstractNodeParameter EOF )
            // InternalRosNetworkDsl.g:1557:2: iv_ruleAbstractNodeParameter= ruleAbstractNodeParameter EOF
            {
             newCompositeNode(grammarAccess.getAbstractNodeParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractNodeParameter=ruleAbstractNodeParameter();

            state._fsp--;

             current =iv_ruleAbstractNodeParameter; 
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
    // $ANTLR end "entryRuleAbstractNodeParameter"


    // $ANTLR start "ruleAbstractNodeParameter"
    // InternalRosNetworkDsl.g:1563:1: ruleAbstractNodeParameter returns [EObject current=null] : (this_NodeParameter_0= ruleNodeParameter | this_NodeParameterGroup_1= ruleNodeParameterGroup ) ;
    public final EObject ruleAbstractNodeParameter() throws RecognitionException {
        EObject current = null;

        EObject this_NodeParameter_0 = null;

        EObject this_NodeParameterGroup_1 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:1569:2: ( (this_NodeParameter_0= ruleNodeParameter | this_NodeParameterGroup_1= ruleNodeParameterGroup ) )
            // InternalRosNetworkDsl.g:1570:2: (this_NodeParameter_0= ruleNodeParameter | this_NodeParameterGroup_1= ruleNodeParameterGroup )
            {
            // InternalRosNetworkDsl.g:1570:2: (this_NodeParameter_0= ruleNodeParameter | this_NodeParameterGroup_1= ruleNodeParameterGroup )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30||LA21_0==33||LA21_0==36) ) {
                alt21=1;
            }
            else if ( (LA21_0==37) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalRosNetworkDsl.g:1571:3: this_NodeParameter_0= ruleNodeParameter
                    {

                    			newCompositeNode(grammarAccess.getAbstractNodeParameterAccess().getNodeParameterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NodeParameter_0=ruleNodeParameter();

                    state._fsp--;


                    			current = this_NodeParameter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:1580:3: this_NodeParameterGroup_1= ruleNodeParameterGroup
                    {

                    			newCompositeNode(grammarAccess.getAbstractNodeParameterAccess().getNodeParameterGroupParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NodeParameterGroup_1=ruleNodeParameterGroup();

                    state._fsp--;


                    			current = this_NodeParameterGroup_1;
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
    // $ANTLR end "ruleAbstractNodeParameter"


    // $ANTLR start "entryRuleLibrary"
    // InternalRosNetworkDsl.g:1592:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // InternalRosNetworkDsl.g:1592:48: (iv_ruleLibrary= ruleLibrary EOF )
            // InternalRosNetworkDsl.g:1593:2: iv_ruleLibrary= ruleLibrary EOF
            {
             newCompositeNode(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;

             current =iv_ruleLibrary; 
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
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // InternalRosNetworkDsl.g:1599:1: ruleLibrary returns [EObject current=null] : ( () otherlv_1= 'templatenode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) (otherlv_5= 'implements' ( ( ruleEString ) ) )? ( (lv_generateartifact_7_0= 'generate' ) )? otherlv_8= '{' otherlv_9= 'language' ( (lv_language_10_0= ruleLanguageType ) ) (otherlv_11= ',' ( (lv_language_12_0= ruleLanguageType ) ) )* (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) ) ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )* otherlv_17= '}' )? (otherlv_18= 'stati' otherlv_19= '{' ( (lv_continousstate_20_0= ruleContinuousState ) ) otherlv_21= '}' )? ( ( (lv_port_22_0= rulePort ) ) ( (lv_port_23_0= rulePort ) )* )? otherlv_24= '}' ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_generateartifact_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_namespace_4_0 = null;

        AntlrDatatypeRuleToken lv_language_10_0 = null;

        AntlrDatatypeRuleToken lv_language_12_0 = null;

        EObject lv_nodeparameters_15_0 = null;

        EObject lv_nodeparameters_16_0 = null;

        EObject lv_continousstate_20_0 = null;

        EObject lv_port_22_0 = null;

        EObject lv_port_23_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:1605:2: ( ( () otherlv_1= 'templatenode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) (otherlv_5= 'implements' ( ( ruleEString ) ) )? ( (lv_generateartifact_7_0= 'generate' ) )? otherlv_8= '{' otherlv_9= 'language' ( (lv_language_10_0= ruleLanguageType ) ) (otherlv_11= ',' ( (lv_language_12_0= ruleLanguageType ) ) )* (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) ) ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )* otherlv_17= '}' )? (otherlv_18= 'stati' otherlv_19= '{' ( (lv_continousstate_20_0= ruleContinuousState ) ) otherlv_21= '}' )? ( ( (lv_port_22_0= rulePort ) ) ( (lv_port_23_0= rulePort ) )* )? otherlv_24= '}' ) )
            // InternalRosNetworkDsl.g:1606:2: ( () otherlv_1= 'templatenode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) (otherlv_5= 'implements' ( ( ruleEString ) ) )? ( (lv_generateartifact_7_0= 'generate' ) )? otherlv_8= '{' otherlv_9= 'language' ( (lv_language_10_0= ruleLanguageType ) ) (otherlv_11= ',' ( (lv_language_12_0= ruleLanguageType ) ) )* (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) ) ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )* otherlv_17= '}' )? (otherlv_18= 'stati' otherlv_19= '{' ( (lv_continousstate_20_0= ruleContinuousState ) ) otherlv_21= '}' )? ( ( (lv_port_22_0= rulePort ) ) ( (lv_port_23_0= rulePort ) )* )? otherlv_24= '}' )
            {
            // InternalRosNetworkDsl.g:1606:2: ( () otherlv_1= 'templatenode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) (otherlv_5= 'implements' ( ( ruleEString ) ) )? ( (lv_generateartifact_7_0= 'generate' ) )? otherlv_8= '{' otherlv_9= 'language' ( (lv_language_10_0= ruleLanguageType ) ) (otherlv_11= ',' ( (lv_language_12_0= ruleLanguageType ) ) )* (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) ) ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )* otherlv_17= '}' )? (otherlv_18= 'stati' otherlv_19= '{' ( (lv_continousstate_20_0= ruleContinuousState ) ) otherlv_21= '}' )? ( ( (lv_port_22_0= rulePort ) ) ( (lv_port_23_0= rulePort ) )* )? otherlv_24= '}' )
            // InternalRosNetworkDsl.g:1607:3: () otherlv_1= 'templatenode' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) (otherlv_5= 'implements' ( ( ruleEString ) ) )? ( (lv_generateartifact_7_0= 'generate' ) )? otherlv_8= '{' otherlv_9= 'language' ( (lv_language_10_0= ruleLanguageType ) ) (otherlv_11= ',' ( (lv_language_12_0= ruleLanguageType ) ) )* (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) ) ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )* otherlv_17= '}' )? (otherlv_18= 'stati' otherlv_19= '{' ( (lv_continousstate_20_0= ruleContinuousState ) ) otherlv_21= '}' )? ( ( (lv_port_22_0= rulePort ) ) ( (lv_port_23_0= rulePort ) )* )? otherlv_24= '}'
            {
            // InternalRosNetworkDsl.g:1607:3: ()
            // InternalRosNetworkDsl.g:1608:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLibraryAccess().getTemplateNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLibraryAccess().getTemplatenodeKeyword_1());
            		
            // InternalRosNetworkDsl.g:1618:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:1619:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:1619:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:1620:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLibraryAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLibraryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getLibraryAccess().getNamespaceKeyword_3());
            		
            // InternalRosNetworkDsl.g:1641:3: ( (lv_namespace_4_0= ruleEString ) )
            // InternalRosNetworkDsl.g:1642:4: (lv_namespace_4_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:1642:4: (lv_namespace_4_0= ruleEString )
            // InternalRosNetworkDsl.g:1643:5: lv_namespace_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLibraryAccess().getNamespaceEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_namespace_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLibraryRule());
            					}
            					set(
            						current,
            						"namespace",
            						lv_namespace_4_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:1660:3: (otherlv_5= 'implements' ( ( ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRosNetworkDsl.g:1661:4: otherlv_5= 'implements' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getLibraryAccess().getImplementsKeyword_5_0());
                    			
                    // InternalRosNetworkDsl.g:1665:4: ( ( ruleEString ) )
                    // InternalRosNetworkDsl.g:1666:5: ( ruleEString )
                    {
                    // InternalRosNetworkDsl.g:1666:5: ( ruleEString )
                    // InternalRosNetworkDsl.g:1667:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLibraryRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLibraryAccess().getImplementsNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosNetworkDsl.g:1682:3: ( (lv_generateartifact_7_0= 'generate' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRosNetworkDsl.g:1683:4: (lv_generateartifact_7_0= 'generate' )
                    {
                    // InternalRosNetworkDsl.g:1683:4: (lv_generateartifact_7_0= 'generate' )
                    // InternalRosNetworkDsl.g:1684:5: lv_generateartifact_7_0= 'generate'
                    {
                    lv_generateartifact_7_0=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(lv_generateartifact_7_0, grammarAccess.getLibraryAccess().getGenerateartifactGenerateKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLibraryRule());
                    					}
                    					setWithLastConsumed(current, "generateartifact", lv_generateartifact_7_0 != null, "generate");
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,42,FOLLOW_33); 

            			newLeafNode(otherlv_9, grammarAccess.getLibraryAccess().getLanguageKeyword_8());
            		
            // InternalRosNetworkDsl.g:1704:3: ( (lv_language_10_0= ruleLanguageType ) )
            // InternalRosNetworkDsl.g:1705:4: (lv_language_10_0= ruleLanguageType )
            {
            // InternalRosNetworkDsl.g:1705:4: (lv_language_10_0= ruleLanguageType )
            // InternalRosNetworkDsl.g:1706:5: lv_language_10_0= ruleLanguageType
            {

            					newCompositeNode(grammarAccess.getLibraryAccess().getLanguageLanguageTypeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_34);
            lv_language_10_0=ruleLanguageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLibraryRule());
            					}
            					add(
            						current,
            						"language",
            						lv_language_10_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.LanguageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:1723:3: (otherlv_11= ',' ( (lv_language_12_0= ruleLanguageType ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==14) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:1724:4: otherlv_11= ',' ( (lv_language_12_0= ruleLanguageType ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_33); 

            	    				newLeafNode(otherlv_11, grammarAccess.getLibraryAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalRosNetworkDsl.g:1728:4: ( (lv_language_12_0= ruleLanguageType ) )
            	    // InternalRosNetworkDsl.g:1729:5: (lv_language_12_0= ruleLanguageType )
            	    {
            	    // InternalRosNetworkDsl.g:1729:5: (lv_language_12_0= ruleLanguageType )
            	    // InternalRosNetworkDsl.g:1730:6: lv_language_12_0= ruleLanguageType
            	    {

            	    						newCompositeNode(grammarAccess.getLibraryAccess().getLanguageLanguageTypeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_language_12_0=ruleLanguageType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLibraryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"language",
            	    							lv_language_12_0,
            	    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.LanguageType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalRosNetworkDsl.g:1748:3: (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) ) ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )* otherlv_17= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRosNetworkDsl.g:1749:4: otherlv_13= 'parameters' otherlv_14= '{' ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) ) ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )* otherlv_17= '}'
                    {
                    otherlv_13=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getLibraryAccess().getParametersKeyword_11_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_14, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalRosNetworkDsl.g:1757:4: ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) )
                    // InternalRosNetworkDsl.g:1758:5: (lv_nodeparameters_15_0= ruleAbstractNodeParameter )
                    {
                    // InternalRosNetworkDsl.g:1758:5: (lv_nodeparameters_15_0= ruleAbstractNodeParameter )
                    // InternalRosNetworkDsl.g:1759:6: lv_nodeparameters_15_0= ruleAbstractNodeParameter
                    {

                    						newCompositeNode(grammarAccess.getLibraryAccess().getNodeparametersAbstractNodeParameterParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_nodeparameters_15_0=ruleAbstractNodeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLibraryRule());
                    						}
                    						add(
                    							current,
                    							"nodeparameters",
                    							lv_nodeparameters_15_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.AbstractNodeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosNetworkDsl.g:1776:4: ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==30||LA25_0==33||(LA25_0>=36 && LA25_0<=37)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalRosNetworkDsl.g:1777:5: (lv_nodeparameters_16_0= ruleAbstractNodeParameter )
                    	    {
                    	    // InternalRosNetworkDsl.g:1777:5: (lv_nodeparameters_16_0= ruleAbstractNodeParameter )
                    	    // InternalRosNetworkDsl.g:1778:6: lv_nodeparameters_16_0= ruleAbstractNodeParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getLibraryAccess().getNodeparametersAbstractNodeParameterParserRuleCall_11_3_0());
                    	    					
                    	    pushFollow(FOLLOW_36);
                    	    lv_nodeparameters_16_0=ruleAbstractNodeParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLibraryRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"nodeparameters",
                    	    							lv_nodeparameters_16_0,
                    	    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.AbstractNodeParameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_37); 

                    				newLeafNode(otherlv_17, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalRosNetworkDsl.g:1800:3: (otherlv_18= 'stati' otherlv_19= '{' ( (lv_continousstate_20_0= ruleContinuousState ) ) otherlv_21= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRosNetworkDsl.g:1801:4: otherlv_18= 'stati' otherlv_19= '{' ( (lv_continousstate_20_0= ruleContinuousState ) ) otherlv_21= '}'
                    {
                    otherlv_18=(Token)match(input,44,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getLibraryAccess().getStatiKeyword_12_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_38); 

                    				newLeafNode(otherlv_19, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalRosNetworkDsl.g:1809:4: ( (lv_continousstate_20_0= ruleContinuousState ) )
                    // InternalRosNetworkDsl.g:1810:5: (lv_continousstate_20_0= ruleContinuousState )
                    {
                    // InternalRosNetworkDsl.g:1810:5: (lv_continousstate_20_0= ruleContinuousState )
                    // InternalRosNetworkDsl.g:1811:6: lv_continousstate_20_0= ruleContinuousState
                    {

                    						newCompositeNode(grammarAccess.getLibraryAccess().getContinousstateContinuousStateParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_continousstate_20_0=ruleContinuousState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLibraryRule());
                    						}
                    						add(
                    							current,
                    							"continousstate",
                    							lv_continousstate_20_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.ContinuousState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,16,FOLLOW_39); 

                    				newLeafNode(otherlv_21, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_12_3());
                    			

                    }
                    break;

            }

            // InternalRosNetworkDsl.g:1833:3: ( ( (lv_port_22_0= rulePort ) ) ( (lv_port_23_0= rulePort ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRosNetworkDsl.g:1834:4: ( (lv_port_22_0= rulePort ) ) ( (lv_port_23_0= rulePort ) )*
                    {
                    // InternalRosNetworkDsl.g:1834:4: ( (lv_port_22_0= rulePort ) )
                    // InternalRosNetworkDsl.g:1835:5: (lv_port_22_0= rulePort )
                    {
                    // InternalRosNetworkDsl.g:1835:5: (lv_port_22_0= rulePort )
                    // InternalRosNetworkDsl.g:1836:6: lv_port_22_0= rulePort
                    {

                    						newCompositeNode(grammarAccess.getLibraryAccess().getPortPortParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_port_22_0=rulePort();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLibraryRule());
                    						}
                    						add(
                    							current,
                    							"port",
                    							lv_port_22_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.Port");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosNetworkDsl.g:1853:4: ( (lv_port_23_0= rulePort ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==51) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalRosNetworkDsl.g:1854:5: (lv_port_23_0= rulePort )
                    	    {
                    	    // InternalRosNetworkDsl.g:1854:5: (lv_port_23_0= rulePort )
                    	    // InternalRosNetworkDsl.g:1855:6: lv_port_23_0= rulePort
                    	    {

                    	    						newCompositeNode(grammarAccess.getLibraryAccess().getPortPortParserRuleCall_13_1_0());
                    	    					
                    	    pushFollow(FOLLOW_39);
                    	    lv_port_23_0=rulePort();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLibraryRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"port",
                    	    							lv_port_23_0,
                    	    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.Port");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleNode"
    // InternalRosNetworkDsl.g:1881:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalRosNetworkDsl.g:1881:45: (iv_ruleNode= ruleNode EOF )
            // InternalRosNetworkDsl.g:1882:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalRosNetworkDsl.g:1888:1: ruleNode returns [EObject current=null] : ( () otherlv_1= 'node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) (otherlv_5= 'implements' ( ( ruleEString ) ) )? ( (lv_generateartifact_7_0= 'generate' ) )? otherlv_8= '{' otherlv_9= 'language' ( (lv_language_10_0= ruleLanguageType ) ) (otherlv_11= ',' ( (lv_language_12_0= ruleLanguageType ) ) )* (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) ) ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )* otherlv_17= '}' )? (otherlv_18= 'stati' otherlv_19= '{' ( (lv_continousstate_20_0= ruleContinuousState ) ) otherlv_21= '}' )? ( ( (lv_port_22_0= rulePort ) ) ( (lv_port_23_0= rulePort ) )* )? ( ( (lv_filterconnection_24_0= ruleFilterConnection ) ) ( (lv_filterconnection_25_0= ruleFilterConnection ) )* )? otherlv_26= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_generateartifact_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_namespace_4_0 = null;

        AntlrDatatypeRuleToken lv_language_10_0 = null;

        AntlrDatatypeRuleToken lv_language_12_0 = null;

        EObject lv_nodeparameters_15_0 = null;

        EObject lv_nodeparameters_16_0 = null;

        EObject lv_continousstate_20_0 = null;

        EObject lv_port_22_0 = null;

        EObject lv_port_23_0 = null;

        EObject lv_filterconnection_24_0 = null;

        EObject lv_filterconnection_25_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:1894:2: ( ( () otherlv_1= 'node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) (otherlv_5= 'implements' ( ( ruleEString ) ) )? ( (lv_generateartifact_7_0= 'generate' ) )? otherlv_8= '{' otherlv_9= 'language' ( (lv_language_10_0= ruleLanguageType ) ) (otherlv_11= ',' ( (lv_language_12_0= ruleLanguageType ) ) )* (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) ) ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )* otherlv_17= '}' )? (otherlv_18= 'stati' otherlv_19= '{' ( (lv_continousstate_20_0= ruleContinuousState ) ) otherlv_21= '}' )? ( ( (lv_port_22_0= rulePort ) ) ( (lv_port_23_0= rulePort ) )* )? ( ( (lv_filterconnection_24_0= ruleFilterConnection ) ) ( (lv_filterconnection_25_0= ruleFilterConnection ) )* )? otherlv_26= '}' ) )
            // InternalRosNetworkDsl.g:1895:2: ( () otherlv_1= 'node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) (otherlv_5= 'implements' ( ( ruleEString ) ) )? ( (lv_generateartifact_7_0= 'generate' ) )? otherlv_8= '{' otherlv_9= 'language' ( (lv_language_10_0= ruleLanguageType ) ) (otherlv_11= ',' ( (lv_language_12_0= ruleLanguageType ) ) )* (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) ) ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )* otherlv_17= '}' )? (otherlv_18= 'stati' otherlv_19= '{' ( (lv_continousstate_20_0= ruleContinuousState ) ) otherlv_21= '}' )? ( ( (lv_port_22_0= rulePort ) ) ( (lv_port_23_0= rulePort ) )* )? ( ( (lv_filterconnection_24_0= ruleFilterConnection ) ) ( (lv_filterconnection_25_0= ruleFilterConnection ) )* )? otherlv_26= '}' )
            {
            // InternalRosNetworkDsl.g:1895:2: ( () otherlv_1= 'node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) (otherlv_5= 'implements' ( ( ruleEString ) ) )? ( (lv_generateartifact_7_0= 'generate' ) )? otherlv_8= '{' otherlv_9= 'language' ( (lv_language_10_0= ruleLanguageType ) ) (otherlv_11= ',' ( (lv_language_12_0= ruleLanguageType ) ) )* (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) ) ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )* otherlv_17= '}' )? (otherlv_18= 'stati' otherlv_19= '{' ( (lv_continousstate_20_0= ruleContinuousState ) ) otherlv_21= '}' )? ( ( (lv_port_22_0= rulePort ) ) ( (lv_port_23_0= rulePort ) )* )? ( ( (lv_filterconnection_24_0= ruleFilterConnection ) ) ( (lv_filterconnection_25_0= ruleFilterConnection ) )* )? otherlv_26= '}' )
            // InternalRosNetworkDsl.g:1896:3: () otherlv_1= 'node' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) (otherlv_5= 'implements' ( ( ruleEString ) ) )? ( (lv_generateartifact_7_0= 'generate' ) )? otherlv_8= '{' otherlv_9= 'language' ( (lv_language_10_0= ruleLanguageType ) ) (otherlv_11= ',' ( (lv_language_12_0= ruleLanguageType ) ) )* (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) ) ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )* otherlv_17= '}' )? (otherlv_18= 'stati' otherlv_19= '{' ( (lv_continousstate_20_0= ruleContinuousState ) ) otherlv_21= '}' )? ( ( (lv_port_22_0= rulePort ) ) ( (lv_port_23_0= rulePort ) )* )? ( ( (lv_filterconnection_24_0= ruleFilterConnection ) ) ( (lv_filterconnection_25_0= ruleFilterConnection ) )* )? otherlv_26= '}'
            {
            // InternalRosNetworkDsl.g:1896:3: ()
            // InternalRosNetworkDsl.g:1897:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeAccess().getNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
            		
            // InternalRosNetworkDsl.g:1907:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:1908:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:1908:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:1909:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getNamespaceKeyword_3());
            		
            // InternalRosNetworkDsl.g:1930:3: ( (lv_namespace_4_0= ruleEString ) )
            // InternalRosNetworkDsl.g:1931:4: (lv_namespace_4_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:1931:4: (lv_namespace_4_0= ruleEString )
            // InternalRosNetworkDsl.g:1932:5: lv_namespace_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getNamespaceEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_namespace_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"namespace",
            						lv_namespace_4_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:1949:3: (otherlv_5= 'implements' ( ( ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRosNetworkDsl.g:1950:4: otherlv_5= 'implements' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getImplementsKeyword_5_0());
                    			
                    // InternalRosNetworkDsl.g:1954:4: ( ( ruleEString ) )
                    // InternalRosNetworkDsl.g:1955:5: ( ruleEString )
                    {
                    // InternalRosNetworkDsl.g:1955:5: ( ruleEString )
                    // InternalRosNetworkDsl.g:1956:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNodeAccess().getImplementsNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosNetworkDsl.g:1971:3: ( (lv_generateartifact_7_0= 'generate' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRosNetworkDsl.g:1972:4: (lv_generateartifact_7_0= 'generate' )
                    {
                    // InternalRosNetworkDsl.g:1972:4: (lv_generateartifact_7_0= 'generate' )
                    // InternalRosNetworkDsl.g:1973:5: lv_generateartifact_7_0= 'generate'
                    {
                    lv_generateartifact_7_0=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(lv_generateartifact_7_0, grammarAccess.getNodeAccess().getGenerateartifactGenerateKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeRule());
                    					}
                    					setWithLastConsumed(current, "generateartifact", lv_generateartifact_7_0 != null, "generate");
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,42,FOLLOW_33); 

            			newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getLanguageKeyword_8());
            		
            // InternalRosNetworkDsl.g:1993:3: ( (lv_language_10_0= ruleLanguageType ) )
            // InternalRosNetworkDsl.g:1994:4: (lv_language_10_0= ruleLanguageType )
            {
            // InternalRosNetworkDsl.g:1994:4: (lv_language_10_0= ruleLanguageType )
            // InternalRosNetworkDsl.g:1995:5: lv_language_10_0= ruleLanguageType
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getLanguageLanguageTypeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_40);
            lv_language_10_0=ruleLanguageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					add(
            						current,
            						"language",
            						lv_language_10_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.LanguageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:2012:3: (otherlv_11= ',' ( (lv_language_12_0= ruleLanguageType ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==14) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:2013:4: otherlv_11= ',' ( (lv_language_12_0= ruleLanguageType ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_33); 

            	    				newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalRosNetworkDsl.g:2017:4: ( (lv_language_12_0= ruleLanguageType ) )
            	    // InternalRosNetworkDsl.g:2018:5: (lv_language_12_0= ruleLanguageType )
            	    {
            	    // InternalRosNetworkDsl.g:2018:5: (lv_language_12_0= ruleLanguageType )
            	    // InternalRosNetworkDsl.g:2019:6: lv_language_12_0= ruleLanguageType
            	    {

            	    						newCompositeNode(grammarAccess.getNodeAccess().getLanguageLanguageTypeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_language_12_0=ruleLanguageType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"language",
            	    							lv_language_12_0,
            	    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.LanguageType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalRosNetworkDsl.g:2037:3: (otherlv_13= 'parameters' otherlv_14= '{' ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) ) ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )* otherlv_17= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRosNetworkDsl.g:2038:4: otherlv_13= 'parameters' otherlv_14= '{' ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) ) ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )* otherlv_17= '}'
                    {
                    otherlv_13=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getNodeAccess().getParametersKeyword_11_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_14, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalRosNetworkDsl.g:2046:4: ( (lv_nodeparameters_15_0= ruleAbstractNodeParameter ) )
                    // InternalRosNetworkDsl.g:2047:5: (lv_nodeparameters_15_0= ruleAbstractNodeParameter )
                    {
                    // InternalRosNetworkDsl.g:2047:5: (lv_nodeparameters_15_0= ruleAbstractNodeParameter )
                    // InternalRosNetworkDsl.g:2048:6: lv_nodeparameters_15_0= ruleAbstractNodeParameter
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getNodeparametersAbstractNodeParameterParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_nodeparameters_15_0=ruleAbstractNodeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"nodeparameters",
                    							lv_nodeparameters_15_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.AbstractNodeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosNetworkDsl.g:2065:4: ( (lv_nodeparameters_16_0= ruleAbstractNodeParameter ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==30||LA33_0==33||(LA33_0>=36 && LA33_0<=37)) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalRosNetworkDsl.g:2066:5: (lv_nodeparameters_16_0= ruleAbstractNodeParameter )
                    	    {
                    	    // InternalRosNetworkDsl.g:2066:5: (lv_nodeparameters_16_0= ruleAbstractNodeParameter )
                    	    // InternalRosNetworkDsl.g:2067:6: lv_nodeparameters_16_0= ruleAbstractNodeParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getNodeAccess().getNodeparametersAbstractNodeParameterParserRuleCall_11_3_0());
                    	    					
                    	    pushFollow(FOLLOW_36);
                    	    lv_nodeparameters_16_0=ruleAbstractNodeParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"nodeparameters",
                    	    							lv_nodeparameters_16_0,
                    	    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.AbstractNodeParameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_41); 

                    				newLeafNode(otherlv_17, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalRosNetworkDsl.g:2089:3: (otherlv_18= 'stati' otherlv_19= '{' ( (lv_continousstate_20_0= ruleContinuousState ) ) otherlv_21= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRosNetworkDsl.g:2090:4: otherlv_18= 'stati' otherlv_19= '{' ( (lv_continousstate_20_0= ruleContinuousState ) ) otherlv_21= '}'
                    {
                    otherlv_18=(Token)match(input,44,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getNodeAccess().getStatiKeyword_12_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_38); 

                    				newLeafNode(otherlv_19, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalRosNetworkDsl.g:2098:4: ( (lv_continousstate_20_0= ruleContinuousState ) )
                    // InternalRosNetworkDsl.g:2099:5: (lv_continousstate_20_0= ruleContinuousState )
                    {
                    // InternalRosNetworkDsl.g:2099:5: (lv_continousstate_20_0= ruleContinuousState )
                    // InternalRosNetworkDsl.g:2100:6: lv_continousstate_20_0= ruleContinuousState
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getContinousstateContinuousStateParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_continousstate_20_0=ruleContinuousState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"continousstate",
                    							lv_continousstate_20_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.ContinuousState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,16,FOLLOW_42); 

                    				newLeafNode(otherlv_21, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_12_3());
                    			

                    }
                    break;

            }

            // InternalRosNetworkDsl.g:2122:3: ( ( (lv_port_22_0= rulePort ) ) ( (lv_port_23_0= rulePort ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==51) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRosNetworkDsl.g:2123:4: ( (lv_port_22_0= rulePort ) ) ( (lv_port_23_0= rulePort ) )*
                    {
                    // InternalRosNetworkDsl.g:2123:4: ( (lv_port_22_0= rulePort ) )
                    // InternalRosNetworkDsl.g:2124:5: (lv_port_22_0= rulePort )
                    {
                    // InternalRosNetworkDsl.g:2124:5: (lv_port_22_0= rulePort )
                    // InternalRosNetworkDsl.g:2125:6: lv_port_22_0= rulePort
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getPortPortParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_port_22_0=rulePort();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"port",
                    							lv_port_22_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.Port");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosNetworkDsl.g:2142:4: ( (lv_port_23_0= rulePort ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==51) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalRosNetworkDsl.g:2143:5: (lv_port_23_0= rulePort )
                    	    {
                    	    // InternalRosNetworkDsl.g:2143:5: (lv_port_23_0= rulePort )
                    	    // InternalRosNetworkDsl.g:2144:6: lv_port_23_0= rulePort
                    	    {

                    	    						newCompositeNode(grammarAccess.getNodeAccess().getPortPortParserRuleCall_13_1_0());
                    	    					
                    	    pushFollow(FOLLOW_42);
                    	    lv_port_23_0=rulePort();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"port",
                    	    							lv_port_23_0,
                    	    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.Port");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRosNetworkDsl.g:2162:3: ( ( (lv_filterconnection_24_0= ruleFilterConnection ) ) ( (lv_filterconnection_25_0= ruleFilterConnection ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==19) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRosNetworkDsl.g:2163:4: ( (lv_filterconnection_24_0= ruleFilterConnection ) ) ( (lv_filterconnection_25_0= ruleFilterConnection ) )*
                    {
                    // InternalRosNetworkDsl.g:2163:4: ( (lv_filterconnection_24_0= ruleFilterConnection ) )
                    // InternalRosNetworkDsl.g:2164:5: (lv_filterconnection_24_0= ruleFilterConnection )
                    {
                    // InternalRosNetworkDsl.g:2164:5: (lv_filterconnection_24_0= ruleFilterConnection )
                    // InternalRosNetworkDsl.g:2165:6: lv_filterconnection_24_0= ruleFilterConnection
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getFilterconnectionFilterConnectionParserRuleCall_14_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_filterconnection_24_0=ruleFilterConnection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"filterconnection",
                    							lv_filterconnection_24_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.FilterConnection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosNetworkDsl.g:2182:4: ( (lv_filterconnection_25_0= ruleFilterConnection ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==19) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalRosNetworkDsl.g:2183:5: (lv_filterconnection_25_0= ruleFilterConnection )
                    	    {
                    	    // InternalRosNetworkDsl.g:2183:5: (lv_filterconnection_25_0= ruleFilterConnection )
                    	    // InternalRosNetworkDsl.g:2184:6: lv_filterconnection_25_0= ruleFilterConnection
                    	    {

                    	    						newCompositeNode(grammarAccess.getNodeAccess().getFilterconnectionFilterConnectionParserRuleCall_14_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_filterconnection_25_0=ruleFilterConnection();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"filterconnection",
                    	    							lv_filterconnection_25_0,
                    	    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.FilterConnection");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_26=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleFilterConnection"
    // InternalRosNetworkDsl.g:2210:1: entryRuleFilterConnection returns [EObject current=null] : iv_ruleFilterConnection= ruleFilterConnection EOF ;
    public final EObject entryRuleFilterConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterConnection = null;


        try {
            // InternalRosNetworkDsl.g:2210:57: (iv_ruleFilterConnection= ruleFilterConnection EOF )
            // InternalRosNetworkDsl.g:2211:2: iv_ruleFilterConnection= ruleFilterConnection EOF
            {
             newCompositeNode(grammarAccess.getFilterConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterConnection=ruleFilterConnection();

            state._fsp--;

             current =iv_ruleFilterConnection; 
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
    // $ANTLR end "entryRuleFilterConnection"


    // $ANTLR start "ruleFilterConnection"
    // InternalRosNetworkDsl.g:2217:1: ruleFilterConnection returns [EObject current=null] : ( () otherlv_1= 'filter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ']' otherlv_10= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleFilterConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:2223:2: ( ( () otherlv_1= 'filter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ']' otherlv_10= '->' ( ( ruleEString ) ) ) )
            // InternalRosNetworkDsl.g:2224:2: ( () otherlv_1= 'filter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ']' otherlv_10= '->' ( ( ruleEString ) ) )
            {
            // InternalRosNetworkDsl.g:2224:2: ( () otherlv_1= 'filter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ']' otherlv_10= '->' ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:2225:3: () otherlv_1= 'filter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '[' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ']' otherlv_10= '->' ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:2225:3: ()
            // InternalRosNetworkDsl.g:2226:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFilterConnectionAccess().getFilterConnectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterConnectionAccess().getFilterKeyword_1());
            		
            // InternalRosNetworkDsl.g:2236:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:2237:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:2237:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:2238:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFilterConnectionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterConnectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFilterConnectionAccess().getColonKeyword_3());
            		
            // InternalRosNetworkDsl.g:2259:3: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:2260:4: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:2260:4: ( ruleEString )
            // InternalRosNetworkDsl.g:2261:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFilterConnectionAccess().getUsedfilterFilterDefinitionCrossReference_4_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFilterConnectionAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalRosNetworkDsl.g:2279:3: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:2280:4: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:2280:4: ( ruleEString )
            // InternalRosNetworkDsl.g:2281:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFilterConnectionAccess().getInputInternalNodeCrossReference_6_0());
            				
            pushFollow(FOLLOW_44);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:2295:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==14) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:2296:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getFilterConnectionAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalRosNetworkDsl.g:2300:4: ( ( ruleEString ) )
            	    // InternalRosNetworkDsl.g:2301:5: ( ruleEString )
            	    {
            	    // InternalRosNetworkDsl.g:2301:5: ( ruleEString )
            	    // InternalRosNetworkDsl.g:2302:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFilterConnectionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getFilterConnectionAccess().getInputInternalNodeCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_9=(Token)match(input,47,FOLLOW_45); 

            			newLeafNode(otherlv_9, grammarAccess.getFilterConnectionAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getFilterConnectionAccess().getHyphenMinusGreaterThanSignKeyword_9());
            		
            // InternalRosNetworkDsl.g:2325:3: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:2326:4: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:2326:4: ( ruleEString )
            // InternalRosNetworkDsl.g:2327:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFilterConnectionAccess().getOutputInternalNodeCrossReference_10_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleFilterConnection"


    // $ANTLR start "entryRuleContinuousState"
    // InternalRosNetworkDsl.g:2345:1: entryRuleContinuousState returns [EObject current=null] : iv_ruleContinuousState= ruleContinuousState EOF ;
    public final EObject entryRuleContinuousState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinuousState = null;


        try {
            // InternalRosNetworkDsl.g:2345:56: (iv_ruleContinuousState= ruleContinuousState EOF )
            // InternalRosNetworkDsl.g:2346:2: iv_ruleContinuousState= ruleContinuousState EOF
            {
             newCompositeNode(grammarAccess.getContinuousStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContinuousState=ruleContinuousState();

            state._fsp--;

             current =iv_ruleContinuousState; 
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
    // $ANTLR end "entryRuleContinuousState"


    // $ANTLR start "ruleContinuousState"
    // InternalRosNetworkDsl.g:2352:1: ruleContinuousState returns [EObject current=null] : ( () otherlv_1= 'continuousstate' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleContinuousState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:2358:2: ( ( () otherlv_1= 'continuousstate' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRosNetworkDsl.g:2359:2: ( () otherlv_1= 'continuousstate' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRosNetworkDsl.g:2359:2: ( () otherlv_1= 'continuousstate' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRosNetworkDsl.g:2360:3: () otherlv_1= 'continuousstate' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRosNetworkDsl.g:2360:3: ()
            // InternalRosNetworkDsl.g:2361:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContinuousStateAccess().getContinousStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContinuousStateAccess().getContinuousstateKeyword_1());
            		
            // InternalRosNetworkDsl.g:2371:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:2372:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:2372:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:2373:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContinuousStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContinuousStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
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
    // $ANTLR end "ruleContinuousState"


    // $ANTLR start "entryRuleLanguageType"
    // InternalRosNetworkDsl.g:2394:1: entryRuleLanguageType returns [String current=null] : iv_ruleLanguageType= ruleLanguageType EOF ;
    public final String entryRuleLanguageType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLanguageType = null;


        try {
            // InternalRosNetworkDsl.g:2394:52: (iv_ruleLanguageType= ruleLanguageType EOF )
            // InternalRosNetworkDsl.g:2395:2: iv_ruleLanguageType= ruleLanguageType EOF
            {
             newCompositeNode(grammarAccess.getLanguageTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguageType=ruleLanguageType();

            state._fsp--;

             current =iv_ruleLanguageType.getText(); 
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
    // $ANTLR end "entryRuleLanguageType"


    // $ANTLR start "ruleLanguageType"
    // InternalRosNetworkDsl.g:2401:1: ruleLanguageType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Python' | kw= 'Cpp' ) ;
    public final AntlrDatatypeRuleToken ruleLanguageType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosNetworkDsl.g:2407:2: ( (kw= 'Python' | kw= 'Cpp' ) )
            // InternalRosNetworkDsl.g:2408:2: (kw= 'Python' | kw= 'Cpp' )
            {
            // InternalRosNetworkDsl.g:2408:2: (kw= 'Python' | kw= 'Cpp' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==49) ) {
                alt41=1;
            }
            else if ( (LA41_0==50) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalRosNetworkDsl.g:2409:3: kw= 'Python'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLanguageTypeAccess().getPythonKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:2415:3: kw= 'Cpp'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLanguageTypeAccess().getCppKeyword_1());
                    		

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
    // $ANTLR end "ruleLanguageType"


    // $ANTLR start "entryRulePort"
    // InternalRosNetworkDsl.g:2424:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalRosNetworkDsl.g:2424:45: (iv_rulePort= rulePort EOF )
            // InternalRosNetworkDsl.g:2425:2: iv_rulePort= rulePort EOF
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
    // InternalRosNetworkDsl.g:2431:1: rulePort returns [EObject current=null] : (this_InputPort_0= ruleInputPort | this_OutputPort_1= ruleOutputPort ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject this_InputPort_0 = null;

        EObject this_OutputPort_1 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:2437:2: ( (this_InputPort_0= ruleInputPort | this_OutputPort_1= ruleOutputPort ) )
            // InternalRosNetworkDsl.g:2438:2: (this_InputPort_0= ruleInputPort | this_OutputPort_1= ruleOutputPort )
            {
            // InternalRosNetworkDsl.g:2438:2: (this_InputPort_0= ruleInputPort | this_OutputPort_1= ruleOutputPort )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==51) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==RULE_STRING) ) {
                    int LA42_2 = input.LA(3);

                    if ( (LA42_2==32) ) {
                        alt42=2;
                    }
                    else if ( (LA42_2==52) ) {
                        alt42=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA42_1==RULE_ID) ) {
                    int LA42_3 = input.LA(3);

                    if ( (LA42_3==32) ) {
                        alt42=2;
                    }
                    else if ( (LA42_3==52) ) {
                        alt42=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalRosNetworkDsl.g:2439:3: this_InputPort_0= ruleInputPort
                    {

                    			newCompositeNode(grammarAccess.getPortAccess().getInputPortParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputPort_0=ruleInputPort();

                    state._fsp--;


                    			current = this_InputPort_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:2448:3: this_OutputPort_1= ruleOutputPort
                    {

                    			newCompositeNode(grammarAccess.getPortAccess().getOutputPortParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OutputPort_1=ruleOutputPort();

                    state._fsp--;


                    			current = this_OutputPort_1;
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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleInputPort"
    // InternalRosNetworkDsl.g:2460:1: entryRuleInputPort returns [EObject current=null] : iv_ruleInputPort= ruleInputPort EOF ;
    public final EObject entryRuleInputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputPort = null;


        try {
            // InternalRosNetworkDsl.g:2460:50: (iv_ruleInputPort= ruleInputPort EOF )
            // InternalRosNetworkDsl.g:2461:2: iv_ruleInputPort= ruleInputPort EOF
            {
             newCompositeNode(grammarAccess.getInputPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputPort=ruleInputPort();

            state._fsp--;

             current =iv_ruleInputPort; 
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
    // $ANTLR end "entryRuleInputPort"


    // $ANTLR start "ruleInputPort"
    // InternalRosNetworkDsl.g:2467:1: ruleInputPort returns [EObject current=null] : ( () otherlv_1= 'port' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '<-' ( ( ruleEString ) ) (otherlv_5= 'estimated_freq' ( (lv_estimated_freq_6_0= ruleEInt ) ) otherlv_7= 'sample_tolerance' ( (lv_sample_tolerance_8_0= ruleDouble ) ) ( (lv_debug_9_0= 'debug' ) )? )? (otherlv_10= 'syncstate' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleInputPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_debug_9_0=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_estimated_freq_6_0 = null;

        AntlrDatatypeRuleToken lv_sample_tolerance_8_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:2473:2: ( ( () otherlv_1= 'port' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '<-' ( ( ruleEString ) ) (otherlv_5= 'estimated_freq' ( (lv_estimated_freq_6_0= ruleEInt ) ) otherlv_7= 'sample_tolerance' ( (lv_sample_tolerance_8_0= ruleDouble ) ) ( (lv_debug_9_0= 'debug' ) )? )? (otherlv_10= 'syncstate' ( ( ruleEString ) ) )? ) )
            // InternalRosNetworkDsl.g:2474:2: ( () otherlv_1= 'port' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '<-' ( ( ruleEString ) ) (otherlv_5= 'estimated_freq' ( (lv_estimated_freq_6_0= ruleEInt ) ) otherlv_7= 'sample_tolerance' ( (lv_sample_tolerance_8_0= ruleDouble ) ) ( (lv_debug_9_0= 'debug' ) )? )? (otherlv_10= 'syncstate' ( ( ruleEString ) ) )? )
            {
            // InternalRosNetworkDsl.g:2474:2: ( () otherlv_1= 'port' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '<-' ( ( ruleEString ) ) (otherlv_5= 'estimated_freq' ( (lv_estimated_freq_6_0= ruleEInt ) ) otherlv_7= 'sample_tolerance' ( (lv_sample_tolerance_8_0= ruleDouble ) ) ( (lv_debug_9_0= 'debug' ) )? )? (otherlv_10= 'syncstate' ( ( ruleEString ) ) )? )
            // InternalRosNetworkDsl.g:2475:3: () otherlv_1= 'port' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '<-' ( ( ruleEString ) ) (otherlv_5= 'estimated_freq' ( (lv_estimated_freq_6_0= ruleEInt ) ) otherlv_7= 'sample_tolerance' ( (lv_sample_tolerance_8_0= ruleDouble ) ) ( (lv_debug_9_0= 'debug' ) )? )? (otherlv_10= 'syncstate' ( ( ruleEString ) ) )?
            {
            // InternalRosNetworkDsl.g:2475:3: ()
            // InternalRosNetworkDsl.g:2476:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputPortAccess().getInputPortAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInputPortAccess().getPortKeyword_1());
            		
            // InternalRosNetworkDsl.g:2486:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:2487:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:2487:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:2488:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputPortAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputPortRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getInputPortAccess().getLessThanSignHyphenMinusKeyword_3());
            		
            // InternalRosNetworkDsl.g:2509:3: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:2510:4: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:2510:4: ( ruleEString )
            // InternalRosNetworkDsl.g:2511:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputPortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInputPortAccess().getChannelChannelCrossReference_4_0());
            				
            pushFollow(FOLLOW_47);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:2525:3: (otherlv_5= 'estimated_freq' ( (lv_estimated_freq_6_0= ruleEInt ) ) otherlv_7= 'sample_tolerance' ( (lv_sample_tolerance_8_0= ruleDouble ) ) ( (lv_debug_9_0= 'debug' ) )? )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRosNetworkDsl.g:2526:4: otherlv_5= 'estimated_freq' ( (lv_estimated_freq_6_0= ruleEInt ) ) otherlv_7= 'sample_tolerance' ( (lv_sample_tolerance_8_0= ruleDouble ) ) ( (lv_debug_9_0= 'debug' ) )?
                    {
                    otherlv_5=(Token)match(input,53,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getInputPortAccess().getEstimated_freqKeyword_5_0());
                    			
                    // InternalRosNetworkDsl.g:2530:4: ( (lv_estimated_freq_6_0= ruleEInt ) )
                    // InternalRosNetworkDsl.g:2531:5: (lv_estimated_freq_6_0= ruleEInt )
                    {
                    // InternalRosNetworkDsl.g:2531:5: (lv_estimated_freq_6_0= ruleEInt )
                    // InternalRosNetworkDsl.g:2532:6: lv_estimated_freq_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getInputPortAccess().getEstimated_freqEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_estimated_freq_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputPortRule());
                    						}
                    						set(
                    							current,
                    							"estimated_freq",
                    							lv_estimated_freq_6_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,54,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getInputPortAccess().getSample_toleranceKeyword_5_2());
                    			
                    // InternalRosNetworkDsl.g:2553:4: ( (lv_sample_tolerance_8_0= ruleDouble ) )
                    // InternalRosNetworkDsl.g:2554:5: (lv_sample_tolerance_8_0= ruleDouble )
                    {
                    // InternalRosNetworkDsl.g:2554:5: (lv_sample_tolerance_8_0= ruleDouble )
                    // InternalRosNetworkDsl.g:2555:6: lv_sample_tolerance_8_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getInputPortAccess().getSample_toleranceDoubleParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_sample_tolerance_8_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputPortRule());
                    						}
                    						set(
                    							current,
                    							"sample_tolerance",
                    							lv_sample_tolerance_8_0,
                    							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosNetworkDsl.g:2572:4: ( (lv_debug_9_0= 'debug' ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==55) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalRosNetworkDsl.g:2573:5: (lv_debug_9_0= 'debug' )
                            {
                            // InternalRosNetworkDsl.g:2573:5: (lv_debug_9_0= 'debug' )
                            // InternalRosNetworkDsl.g:2574:6: lv_debug_9_0= 'debug'
                            {
                            lv_debug_9_0=(Token)match(input,55,FOLLOW_50); 

                            						newLeafNode(lv_debug_9_0, grammarAccess.getInputPortAccess().getDebugDebugKeyword_5_4_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getInputPortRule());
                            						}
                            						setWithLastConsumed(current, "debug", lv_debug_9_0 != null, "debug");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalRosNetworkDsl.g:2587:3: (otherlv_10= 'syncstate' ( ( ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRosNetworkDsl.g:2588:4: otherlv_10= 'syncstate' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getInputPortAccess().getSyncstateKeyword_6_0());
                    			
                    // InternalRosNetworkDsl.g:2592:4: ( ( ruleEString ) )
                    // InternalRosNetworkDsl.g:2593:5: ( ruleEString )
                    {
                    // InternalRosNetworkDsl.g:2593:5: ( ruleEString )
                    // InternalRosNetworkDsl.g:2594:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputPortRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInputPortAccess().getSynchronizesStateContinousStateCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


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
    // $ANTLR end "ruleInputPort"


    // $ANTLR start "entryRuleOutputPort"
    // InternalRosNetworkDsl.g:2613:1: entryRuleOutputPort returns [EObject current=null] : iv_ruleOutputPort= ruleOutputPort EOF ;
    public final EObject entryRuleOutputPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputPort = null;


        try {
            // InternalRosNetworkDsl.g:2613:51: (iv_ruleOutputPort= ruleOutputPort EOF )
            // InternalRosNetworkDsl.g:2614:2: iv_ruleOutputPort= ruleOutputPort EOF
            {
             newCompositeNode(grammarAccess.getOutputPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputPort=ruleOutputPort();

            state._fsp--;

             current =iv_ruleOutputPort; 
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
    // $ANTLR end "entryRuleOutputPort"


    // $ANTLR start "ruleOutputPort"
    // InternalRosNetworkDsl.g:2620:1: ruleOutputPort returns [EObject current=null] : ( () otherlv_1= 'port' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= 'estimated_freq' ( (lv_estimated_freq_6_0= ruleEInt ) ) ( (lv_debug_7_0= 'debug' ) )? ) ) ;
    public final EObject ruleOutputPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_debug_7_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_estimated_freq_6_0 = null;



        	enterRule();

        try {
            // InternalRosNetworkDsl.g:2626:2: ( ( () otherlv_1= 'port' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= 'estimated_freq' ( (lv_estimated_freq_6_0= ruleEInt ) ) ( (lv_debug_7_0= 'debug' ) )? ) ) )
            // InternalRosNetworkDsl.g:2627:2: ( () otherlv_1= 'port' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= 'estimated_freq' ( (lv_estimated_freq_6_0= ruleEInt ) ) ( (lv_debug_7_0= 'debug' ) )? ) )
            {
            // InternalRosNetworkDsl.g:2627:2: ( () otherlv_1= 'port' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= 'estimated_freq' ( (lv_estimated_freq_6_0= ruleEInt ) ) ( (lv_debug_7_0= 'debug' ) )? ) )
            // InternalRosNetworkDsl.g:2628:3: () otherlv_1= 'port' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) (otherlv_5= 'estimated_freq' ( (lv_estimated_freq_6_0= ruleEInt ) ) ( (lv_debug_7_0= 'debug' ) )? )
            {
            // InternalRosNetworkDsl.g:2628:3: ()
            // InternalRosNetworkDsl.g:2629:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputPortAccess().getOutputPortAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputPortAccess().getPortKeyword_1());
            		
            // InternalRosNetworkDsl.g:2639:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosNetworkDsl.g:2640:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosNetworkDsl.g:2640:4: (lv_name_2_0= ruleEString )
            // InternalRosNetworkDsl.g:2641:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOutputPortAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_45);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputPortRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getOutputPortAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalRosNetworkDsl.g:2662:3: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:2663:4: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:2663:4: ( ruleEString )
            // InternalRosNetworkDsl.g:2664:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputPortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOutputPortAccess().getChannelChannelCrossReference_4_0());
            				
            pushFollow(FOLLOW_51);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosNetworkDsl.g:2678:3: (otherlv_5= 'estimated_freq' ( (lv_estimated_freq_6_0= ruleEInt ) ) ( (lv_debug_7_0= 'debug' ) )? )
            // InternalRosNetworkDsl.g:2679:4: otherlv_5= 'estimated_freq' ( (lv_estimated_freq_6_0= ruleEInt ) ) ( (lv_debug_7_0= 'debug' ) )?
            {
            otherlv_5=(Token)match(input,53,FOLLOW_23); 

            				newLeafNode(otherlv_5, grammarAccess.getOutputPortAccess().getEstimated_freqKeyword_5_0());
            			
            // InternalRosNetworkDsl.g:2683:4: ( (lv_estimated_freq_6_0= ruleEInt ) )
            // InternalRosNetworkDsl.g:2684:5: (lv_estimated_freq_6_0= ruleEInt )
            {
            // InternalRosNetworkDsl.g:2684:5: (lv_estimated_freq_6_0= ruleEInt )
            // InternalRosNetworkDsl.g:2685:6: lv_estimated_freq_6_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getOutputPortAccess().getEstimated_freqEIntParserRuleCall_5_1_0());
            					
            pushFollow(FOLLOW_52);
            lv_estimated_freq_6_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getOutputPortRule());
            						}
            						set(
            							current,
            							"estimated_freq",
            							lv_estimated_freq_6_0,
            							"hu.sze.aut.ros.middleware.statepubsub.RosNetworkDsl.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalRosNetworkDsl.g:2702:4: ( (lv_debug_7_0= 'debug' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==55) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRosNetworkDsl.g:2703:5: (lv_debug_7_0= 'debug' )
                    {
                    // InternalRosNetworkDsl.g:2703:5: (lv_debug_7_0= 'debug' )
                    // InternalRosNetworkDsl.g:2704:6: lv_debug_7_0= 'debug'
                    {
                    lv_debug_7_0=(Token)match(input,55,FOLLOW_2); 

                    						newLeafNode(lv_debug_7_0, grammarAccess.getOutputPortAccess().getDebugDebugKeyword_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputPortRule());
                    						}
                    						setWithLastConsumed(current, "debug", lv_debug_7_0 != null, "debug");
                    					

                    }


                    }
                    break;

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
    // $ANTLR end "ruleOutputPort"


    // $ANTLR start "entryRuleEBoolean"
    // InternalRosNetworkDsl.g:2721:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalRosNetworkDsl.g:2721:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalRosNetworkDsl.g:2722:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalRosNetworkDsl.g:2728:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosNetworkDsl.g:2734:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalRosNetworkDsl.g:2735:2: (kw= 'true' | kw= 'false' )
            {
            // InternalRosNetworkDsl.g:2735:2: (kw= 'true' | kw= 'false' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==57) ) {
                alt47=1;
            }
            else if ( (LA47_0==58) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalRosNetworkDsl.g:2736:3: kw= 'true'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:2742:3: kw= 'false'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalRosNetworkDsl.g:2751:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRosNetworkDsl.g:2751:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRosNetworkDsl.g:2752:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRosNetworkDsl.g:2758:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalRosNetworkDsl.g:2764:2: (this_INT_0= RULE_INT )
            // InternalRosNetworkDsl.g:2765:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleDouble"
    // InternalRosNetworkDsl.g:2775:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalRosNetworkDsl.g:2775:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalRosNetworkDsl.g:2776:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalRosNetworkDsl.g:2782:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalRosNetworkDsl.g:2788:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalRosNetworkDsl.g:2789:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalRosNetworkDsl.g:2789:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalRosNetworkDsl.g:2790:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_53); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,59,FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleEString"
    // InternalRosNetworkDsl.g:2813:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRosNetworkDsl.g:2813:47: (iv_ruleEString= ruleEString EOF )
            // InternalRosNetworkDsl.g:2814:2: iv_ruleEString= ruleEString EOF
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
    // InternalRosNetworkDsl.g:2820:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRosNetworkDsl.g:2826:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRosNetworkDsl.g:2827:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRosNetworkDsl.g:2827:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_ID) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalRosNetworkDsl.g:2828:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:2836:3: this_ID_1= RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000028010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000200006000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000200006090000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000041000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001240000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001240010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000041000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008180000014000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000003240000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000003240010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008100000010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008180000094000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008100000090000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000090000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0120000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0800000000000000L});

}