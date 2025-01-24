package www.ubx.ch.parser.antlr.internal;

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
import www.ubx.ch.services.OpenAirGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOpenAirParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_REAL", "RULE_SL_COMMENT", "RULE_ID", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AC'", "'SP'", "','", "'SB'", "'AN'", "'AL'", "'AH'", "'FL'", "'SFC'", "'GND'", "'UNL'", "'V'", "'X='", "'D='", "'+'", "'-'", "'DC'", "'DP'", "':'", "'DA'", "'DB'", "'AT'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'Q'", "'R'", "'W'", "'P'", "'GP'", "'TMZ'", "'CTR'", "'Restricted'", "'UKN'", "'ft'", "'m'", "'MSL'", "'m MSL'", "'ft MSL'", "'AGL'", "'m AGL'", "'ft AGL'", "'AMSL'", "'m AMSL'", "'N'", "'S'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=8;
    public static final int RULE_REAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=7;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


        public InternalOpenAirParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOpenAirParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOpenAirParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOpenAir.g"; }



     	private OpenAirGrammarAccess grammarAccess;

        public InternalOpenAirParser(TokenStream input, OpenAirGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "OpenAir";
       	}

       	@Override
       	protected OpenAirGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOpenAir"
    // InternalOpenAir.g:65:1: entryRuleOpenAir returns [EObject current=null] : iv_ruleOpenAir= ruleOpenAir EOF ;
    public final EObject entryRuleOpenAir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenAir = null;


        try {
            // InternalOpenAir.g:65:48: (iv_ruleOpenAir= ruleOpenAir EOF )
            // InternalOpenAir.g:66:2: iv_ruleOpenAir= ruleOpenAir EOF
            {
             newCompositeNode(grammarAccess.getOpenAirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpenAir=ruleOpenAir();

            state._fsp--;

             current =iv_ruleOpenAir; 
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
    // $ANTLR end "entryRuleOpenAir"


    // $ANTLR start "ruleOpenAir"
    // InternalOpenAir.g:72:1: ruleOpenAir returns [EObject current=null] : ( (lv_airspaces_0_0= ruleAirspace ) )* ;
    public final EObject ruleOpenAir() throws RecognitionException {
        EObject current = null;

        EObject lv_airspaces_0_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:78:2: ( ( (lv_airspaces_0_0= ruleAirspace ) )* )
            // InternalOpenAir.g:79:2: ( (lv_airspaces_0_0= ruleAirspace ) )*
            {
            // InternalOpenAir.g:79:2: ( (lv_airspaces_0_0= ruleAirspace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOpenAir.g:80:3: (lv_airspaces_0_0= ruleAirspace )
            	    {
            	    // InternalOpenAir.g:80:3: (lv_airspaces_0_0= ruleAirspace )
            	    // InternalOpenAir.g:81:4: lv_airspaces_0_0= ruleAirspace
            	    {

            	    				newCompositeNode(grammarAccess.getOpenAirAccess().getAirspacesAirspaceParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_airspaces_0_0=ruleAirspace();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getOpenAirRule());
            	    				}
            	    				add(
            	    					current,
            	    					"airspaces",
            	    					lv_airspaces_0_0,
            	    					"www.ubx.ch.OpenAir.Airspace");
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
    // $ANTLR end "ruleOpenAir"


    // $ANTLR start "entryRuleAirspace"
    // InternalOpenAir.g:101:1: entryRuleAirspace returns [EObject current=null] : iv_ruleAirspace= ruleAirspace EOF ;
    public final EObject entryRuleAirspace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAirspace = null;


        try {
            // InternalOpenAir.g:101:49: (iv_ruleAirspace= ruleAirspace EOF )
            // InternalOpenAir.g:102:2: iv_ruleAirspace= ruleAirspace EOF
            {
             newCompositeNode(grammarAccess.getAirspaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAirspace=ruleAirspace();

            state._fsp--;

             current =iv_ruleAirspace; 
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
    // $ANTLR end "entryRuleAirspace"


    // $ANTLR start "ruleAirspace"
    // InternalOpenAir.g:108:1: ruleAirspace returns [EObject current=null] : ( ( (lv_thedef_0_0= ruleTheDef ) ) ( (lv_thegeom_1_0= ruleTheGeom ) )* ) ;
    public final EObject ruleAirspace() throws RecognitionException {
        EObject current = null;

        EObject lv_thedef_0_0 = null;

        EObject lv_thegeom_1_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:114:2: ( ( ( (lv_thedef_0_0= ruleTheDef ) ) ( (lv_thegeom_1_0= ruleTheGeom ) )* ) )
            // InternalOpenAir.g:115:2: ( ( (lv_thedef_0_0= ruleTheDef ) ) ( (lv_thegeom_1_0= ruleTheGeom ) )* )
            {
            // InternalOpenAir.g:115:2: ( ( (lv_thedef_0_0= ruleTheDef ) ) ( (lv_thegeom_1_0= ruleTheGeom ) )* )
            // InternalOpenAir.g:116:3: ( (lv_thedef_0_0= ruleTheDef ) ) ( (lv_thegeom_1_0= ruleTheGeom ) )*
            {
            // InternalOpenAir.g:116:3: ( (lv_thedef_0_0= ruleTheDef ) )
            // InternalOpenAir.g:117:4: (lv_thedef_0_0= ruleTheDef )
            {
            // InternalOpenAir.g:117:4: (lv_thedef_0_0= ruleTheDef )
            // InternalOpenAir.g:118:5: lv_thedef_0_0= ruleTheDef
            {

            					newCompositeNode(grammarAccess.getAirspaceAccess().getThedefTheDefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_thedef_0_0=ruleTheDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAirspaceRule());
            					}
            					set(
            						current,
            						"thedef",
            						lv_thedef_0_0,
            						"www.ubx.ch.OpenAir.TheDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:135:3: ( (lv_thegeom_1_0= ruleTheGeom ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23||(LA2_0>=28 && LA2_0<=29)||(LA2_0>=31 && LA2_0<=32)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOpenAir.g:136:4: (lv_thegeom_1_0= ruleTheGeom )
            	    {
            	    // InternalOpenAir.g:136:4: (lv_thegeom_1_0= ruleTheGeom )
            	    // InternalOpenAir.g:137:5: lv_thegeom_1_0= ruleTheGeom
            	    {

            	    					newCompositeNode(grammarAccess.getAirspaceAccess().getThegeomTheGeomParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_thegeom_1_0=ruleTheGeom();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAirspaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"thegeom",
            	    						lv_thegeom_1_0,
            	    						"www.ubx.ch.OpenAir.TheGeom");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleAirspace"


    // $ANTLR start "entryRuleTheDef"
    // InternalOpenAir.g:158:1: entryRuleTheDef returns [EObject current=null] : iv_ruleTheDef= ruleTheDef EOF ;
    public final EObject entryRuleTheDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheDef = null;


        try {
            // InternalOpenAir.g:158:47: (iv_ruleTheDef= ruleTheDef EOF )
            // InternalOpenAir.g:159:2: iv_ruleTheDef= ruleTheDef EOF
            {
             newCompositeNode(grammarAccess.getTheDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTheDef=ruleTheDef();

            state._fsp--;

             current =iv_ruleTheDef; 
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
    // $ANTLR end "entryRuleTheDef"


    // $ANTLR start "ruleTheDef"
    // InternalOpenAir.g:165:1: ruleTheDef returns [EObject current=null] : ( ( (lv_asclass_0_0= ruleAsClass ) ) ( (lv_sp_1_0= ruleSP ) )* ( (lv_sb_2_0= ruleSB ) )* ( (lv_name_3_0= ruleAsName ) ) ( (lv_at_4_0= ruleAT ) )* ( (lv_limit_5_0= ruleLimites ) ) ( (lv_at_6_0= ruleAT ) )* ) ;
    public final EObject ruleTheDef() throws RecognitionException {
        EObject current = null;

        EObject lv_asclass_0_0 = null;

        EObject lv_sp_1_0 = null;

        EObject lv_sb_2_0 = null;

        EObject lv_name_3_0 = null;

        EObject lv_at_4_0 = null;

        EObject lv_limit_5_0 = null;

        EObject lv_at_6_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:171:2: ( ( ( (lv_asclass_0_0= ruleAsClass ) ) ( (lv_sp_1_0= ruleSP ) )* ( (lv_sb_2_0= ruleSB ) )* ( (lv_name_3_0= ruleAsName ) ) ( (lv_at_4_0= ruleAT ) )* ( (lv_limit_5_0= ruleLimites ) ) ( (lv_at_6_0= ruleAT ) )* ) )
            // InternalOpenAir.g:172:2: ( ( (lv_asclass_0_0= ruleAsClass ) ) ( (lv_sp_1_0= ruleSP ) )* ( (lv_sb_2_0= ruleSB ) )* ( (lv_name_3_0= ruleAsName ) ) ( (lv_at_4_0= ruleAT ) )* ( (lv_limit_5_0= ruleLimites ) ) ( (lv_at_6_0= ruleAT ) )* )
            {
            // InternalOpenAir.g:172:2: ( ( (lv_asclass_0_0= ruleAsClass ) ) ( (lv_sp_1_0= ruleSP ) )* ( (lv_sb_2_0= ruleSB ) )* ( (lv_name_3_0= ruleAsName ) ) ( (lv_at_4_0= ruleAT ) )* ( (lv_limit_5_0= ruleLimites ) ) ( (lv_at_6_0= ruleAT ) )* )
            // InternalOpenAir.g:173:3: ( (lv_asclass_0_0= ruleAsClass ) ) ( (lv_sp_1_0= ruleSP ) )* ( (lv_sb_2_0= ruleSB ) )* ( (lv_name_3_0= ruleAsName ) ) ( (lv_at_4_0= ruleAT ) )* ( (lv_limit_5_0= ruleLimites ) ) ( (lv_at_6_0= ruleAT ) )*
            {
            // InternalOpenAir.g:173:3: ( (lv_asclass_0_0= ruleAsClass ) )
            // InternalOpenAir.g:174:4: (lv_asclass_0_0= ruleAsClass )
            {
            // InternalOpenAir.g:174:4: (lv_asclass_0_0= ruleAsClass )
            // InternalOpenAir.g:175:5: lv_asclass_0_0= ruleAsClass
            {

            					newCompositeNode(grammarAccess.getTheDefAccess().getAsclassAsClassParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_asclass_0_0=ruleAsClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTheDefRule());
            					}
            					set(
            						current,
            						"asclass",
            						lv_asclass_0_0,
            						"www.ubx.ch.OpenAir.AsClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:192:3: ( (lv_sp_1_0= ruleSP ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOpenAir.g:193:4: (lv_sp_1_0= ruleSP )
            	    {
            	    // InternalOpenAir.g:193:4: (lv_sp_1_0= ruleSP )
            	    // InternalOpenAir.g:194:5: lv_sp_1_0= ruleSP
            	    {

            	    					newCompositeNode(grammarAccess.getTheDefAccess().getSpSPParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_sp_1_0=ruleSP();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTheDefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sp",
            	    						lv_sp_1_0,
            	    						"www.ubx.ch.OpenAir.SP");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalOpenAir.g:211:3: ( (lv_sb_2_0= ruleSB ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOpenAir.g:212:4: (lv_sb_2_0= ruleSB )
            	    {
            	    // InternalOpenAir.g:212:4: (lv_sb_2_0= ruleSB )
            	    // InternalOpenAir.g:213:5: lv_sb_2_0= ruleSB
            	    {

            	    					newCompositeNode(grammarAccess.getTheDefAccess().getSbSBParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_sb_2_0=ruleSB();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTheDefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sb",
            	    						lv_sb_2_0,
            	    						"www.ubx.ch.OpenAir.SB");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalOpenAir.g:230:3: ( (lv_name_3_0= ruleAsName ) )
            // InternalOpenAir.g:231:4: (lv_name_3_0= ruleAsName )
            {
            // InternalOpenAir.g:231:4: (lv_name_3_0= ruleAsName )
            // InternalOpenAir.g:232:5: lv_name_3_0= ruleAsName
            {

            					newCompositeNode(grammarAccess.getTheDefAccess().getNameAsNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleAsName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTheDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"www.ubx.ch.OpenAir.AsName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:249:3: ( (lv_at_4_0= ruleAT ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==33) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOpenAir.g:250:4: (lv_at_4_0= ruleAT )
            	    {
            	    // InternalOpenAir.g:250:4: (lv_at_4_0= ruleAT )
            	    // InternalOpenAir.g:251:5: lv_at_4_0= ruleAT
            	    {

            	    					newCompositeNode(grammarAccess.getTheDefAccess().getAtATParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_at_4_0=ruleAT();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTheDefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"at",
            	    						lv_at_4_0,
            	    						"www.ubx.ch.OpenAir.AT");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalOpenAir.g:268:3: ( (lv_limit_5_0= ruleLimites ) )
            // InternalOpenAir.g:269:4: (lv_limit_5_0= ruleLimites )
            {
            // InternalOpenAir.g:269:4: (lv_limit_5_0= ruleLimites )
            // InternalOpenAir.g:270:5: lv_limit_5_0= ruleLimites
            {

            					newCompositeNode(grammarAccess.getTheDefAccess().getLimitLimitesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_limit_5_0=ruleLimites();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTheDefRule());
            					}
            					set(
            						current,
            						"limit",
            						lv_limit_5_0,
            						"www.ubx.ch.OpenAir.Limites");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:287:3: ( (lv_at_6_0= ruleAT ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOpenAir.g:288:4: (lv_at_6_0= ruleAT )
            	    {
            	    // InternalOpenAir.g:288:4: (lv_at_6_0= ruleAT )
            	    // InternalOpenAir.g:289:5: lv_at_6_0= ruleAT
            	    {

            	    					newCompositeNode(grammarAccess.getTheDefAccess().getAtATParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_at_6_0=ruleAT();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTheDefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"at",
            	    						lv_at_6_0,
            	    						"www.ubx.ch.OpenAir.AT");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // $ANTLR end "ruleTheDef"


    // $ANTLR start "entryRuleAsClass"
    // InternalOpenAir.g:310:1: entryRuleAsClass returns [EObject current=null] : iv_ruleAsClass= ruleAsClass EOF ;
    public final EObject entryRuleAsClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsClass = null;


        try {
            // InternalOpenAir.g:310:48: (iv_ruleAsClass= ruleAsClass EOF )
            // InternalOpenAir.g:311:2: iv_ruleAsClass= ruleAsClass EOF
            {
             newCompositeNode(grammarAccess.getAsClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsClass=ruleAsClass();

            state._fsp--;

             current =iv_ruleAsClass; 
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
    // $ANTLR end "entryRuleAsClass"


    // $ANTLR start "ruleAsClass"
    // InternalOpenAir.g:317:1: ruleAsClass returns [EObject current=null] : ( () otherlv_1= 'AC' ( (lv_name_2_0= ruleClassType ) )? ) ;
    public final EObject ruleAsClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:323:2: ( ( () otherlv_1= 'AC' ( (lv_name_2_0= ruleClassType ) )? ) )
            // InternalOpenAir.g:324:2: ( () otherlv_1= 'AC' ( (lv_name_2_0= ruleClassType ) )? )
            {
            // InternalOpenAir.g:324:2: ( () otherlv_1= 'AC' ( (lv_name_2_0= ruleClassType ) )? )
            // InternalOpenAir.g:325:3: () otherlv_1= 'AC' ( (lv_name_2_0= ruleClassType ) )?
            {
            // InternalOpenAir.g:325:3: ()
            // InternalOpenAir.g:326:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAsClassAccess().getAsClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAsClassAccess().getACKeyword_1());
            		
            // InternalOpenAir.g:336:3: ( (lv_name_2_0= ruleClassType ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=34 && LA7_0<=49)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOpenAir.g:337:4: (lv_name_2_0= ruleClassType )
                    {
                    // InternalOpenAir.g:337:4: (lv_name_2_0= ruleClassType )
                    // InternalOpenAir.g:338:5: lv_name_2_0= ruleClassType
                    {

                    					newCompositeNode(grammarAccess.getAsClassAccess().getNameClassTypeEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_2_0=ruleClassType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAsClassRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"www.ubx.ch.OpenAir.ClassType");
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
    // $ANTLR end "ruleAsClass"


    // $ANTLR start "entryRuleSP"
    // InternalOpenAir.g:359:1: entryRuleSP returns [EObject current=null] : iv_ruleSP= ruleSP EOF ;
    public final EObject entryRuleSP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSP = null;


        try {
            // InternalOpenAir.g:359:43: (iv_ruleSP= ruleSP EOF )
            // InternalOpenAir.g:360:2: iv_ruleSP= ruleSP EOF
            {
             newCompositeNode(grammarAccess.getSPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSP=ruleSP();

            state._fsp--;

             current =iv_ruleSP; 
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
    // $ANTLR end "entryRuleSP"


    // $ANTLR start "ruleSP"
    // InternalOpenAir.g:366:1: ruleSP returns [EObject current=null] : (otherlv_0= 'SP' ( (lv_sp0_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_sp1_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_sp2_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_sp3_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_sp4_9_0= RULE_INT ) ) ) ;
    public final EObject ruleSP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sp0_1_0=null;
        Token otherlv_2=null;
        Token lv_sp1_3_0=null;
        Token otherlv_4=null;
        Token lv_sp2_5_0=null;
        Token otherlv_6=null;
        Token lv_sp3_7_0=null;
        Token otherlv_8=null;
        Token lv_sp4_9_0=null;


        	enterRule();

        try {
            // InternalOpenAir.g:372:2: ( (otherlv_0= 'SP' ( (lv_sp0_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_sp1_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_sp2_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_sp3_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_sp4_9_0= RULE_INT ) ) ) )
            // InternalOpenAir.g:373:2: (otherlv_0= 'SP' ( (lv_sp0_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_sp1_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_sp2_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_sp3_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_sp4_9_0= RULE_INT ) ) )
            {
            // InternalOpenAir.g:373:2: (otherlv_0= 'SP' ( (lv_sp0_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_sp1_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_sp2_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_sp3_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_sp4_9_0= RULE_INT ) ) )
            // InternalOpenAir.g:374:3: otherlv_0= 'SP' ( (lv_sp0_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_sp1_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_sp2_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_sp3_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_sp4_9_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSPAccess().getSPKeyword_0());
            		
            // InternalOpenAir.g:378:3: ( (lv_sp0_1_0= RULE_INT ) )
            // InternalOpenAir.g:379:4: (lv_sp0_1_0= RULE_INT )
            {
            // InternalOpenAir.g:379:4: (lv_sp0_1_0= RULE_INT )
            // InternalOpenAir.g:380:5: lv_sp0_1_0= RULE_INT
            {
            lv_sp0_1_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_sp0_1_0, grammarAccess.getSPAccess().getSp0INTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sp0",
            						lv_sp0_1_0,
            						"www.ubx.ch.OpenAir.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSPAccess().getCommaKeyword_2());
            		
            // InternalOpenAir.g:400:3: ( (lv_sp1_3_0= RULE_INT ) )
            // InternalOpenAir.g:401:4: (lv_sp1_3_0= RULE_INT )
            {
            // InternalOpenAir.g:401:4: (lv_sp1_3_0= RULE_INT )
            // InternalOpenAir.g:402:5: lv_sp1_3_0= RULE_INT
            {
            lv_sp1_3_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_sp1_3_0, grammarAccess.getSPAccess().getSp1INTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sp1",
            						lv_sp1_3_0,
            						"www.ubx.ch.OpenAir.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSPAccess().getCommaKeyword_4());
            		
            // InternalOpenAir.g:422:3: ( (lv_sp2_5_0= RULE_INT ) )
            // InternalOpenAir.g:423:4: (lv_sp2_5_0= RULE_INT )
            {
            // InternalOpenAir.g:423:4: (lv_sp2_5_0= RULE_INT )
            // InternalOpenAir.g:424:5: lv_sp2_5_0= RULE_INT
            {
            lv_sp2_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_sp2_5_0, grammarAccess.getSPAccess().getSp2INTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sp2",
            						lv_sp2_5_0,
            						"www.ubx.ch.OpenAir.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getSPAccess().getCommaKeyword_6());
            		
            // InternalOpenAir.g:444:3: ( (lv_sp3_7_0= RULE_INT ) )
            // InternalOpenAir.g:445:4: (lv_sp3_7_0= RULE_INT )
            {
            // InternalOpenAir.g:445:4: (lv_sp3_7_0= RULE_INT )
            // InternalOpenAir.g:446:5: lv_sp3_7_0= RULE_INT
            {
            lv_sp3_7_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_sp3_7_0, grammarAccess.getSPAccess().getSp3INTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sp3",
            						lv_sp3_7_0,
            						"www.ubx.ch.OpenAir.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getSPAccess().getCommaKeyword_8());
            		
            // InternalOpenAir.g:466:3: ( (lv_sp4_9_0= RULE_INT ) )
            // InternalOpenAir.g:467:4: (lv_sp4_9_0= RULE_INT )
            {
            // InternalOpenAir.g:467:4: (lv_sp4_9_0= RULE_INT )
            // InternalOpenAir.g:468:5: lv_sp4_9_0= RULE_INT
            {
            lv_sp4_9_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_sp4_9_0, grammarAccess.getSPAccess().getSp4INTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sp4",
            						lv_sp4_9_0,
            						"www.ubx.ch.OpenAir.INT");
            				

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
    // $ANTLR end "ruleSP"


    // $ANTLR start "entryRuleSB"
    // InternalOpenAir.g:488:1: entryRuleSB returns [EObject current=null] : iv_ruleSB= ruleSB EOF ;
    public final EObject entryRuleSB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSB = null;


        try {
            // InternalOpenAir.g:488:43: (iv_ruleSB= ruleSB EOF )
            // InternalOpenAir.g:489:2: iv_ruleSB= ruleSB EOF
            {
             newCompositeNode(grammarAccess.getSBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSB=ruleSB();

            state._fsp--;

             current =iv_ruleSB; 
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
    // $ANTLR end "entryRuleSB"


    // $ANTLR start "ruleSB"
    // InternalOpenAir.g:495:1: ruleSB returns [EObject current=null] : (otherlv_0= 'SB' ( (lv_sbVal1_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_sbVal2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_sbVal3_5_0= RULE_INT ) ) ) ;
    public final EObject ruleSB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sbVal1_1_0=null;
        Token otherlv_2=null;
        Token lv_sbVal2_3_0=null;
        Token otherlv_4=null;
        Token lv_sbVal3_5_0=null;


        	enterRule();

        try {
            // InternalOpenAir.g:501:2: ( (otherlv_0= 'SB' ( (lv_sbVal1_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_sbVal2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_sbVal3_5_0= RULE_INT ) ) ) )
            // InternalOpenAir.g:502:2: (otherlv_0= 'SB' ( (lv_sbVal1_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_sbVal2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_sbVal3_5_0= RULE_INT ) ) )
            {
            // InternalOpenAir.g:502:2: (otherlv_0= 'SB' ( (lv_sbVal1_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_sbVal2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_sbVal3_5_0= RULE_INT ) ) )
            // InternalOpenAir.g:503:3: otherlv_0= 'SB' ( (lv_sbVal1_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_sbVal2_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_sbVal3_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSBAccess().getSBKeyword_0());
            		
            // InternalOpenAir.g:507:3: ( (lv_sbVal1_1_0= RULE_INT ) )
            // InternalOpenAir.g:508:4: (lv_sbVal1_1_0= RULE_INT )
            {
            // InternalOpenAir.g:508:4: (lv_sbVal1_1_0= RULE_INT )
            // InternalOpenAir.g:509:5: lv_sbVal1_1_0= RULE_INT
            {
            lv_sbVal1_1_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_sbVal1_1_0, grammarAccess.getSBAccess().getSbVal1INTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sbVal1",
            						lv_sbVal1_1_0,
            						"www.ubx.ch.OpenAir.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSBAccess().getCommaKeyword_2());
            		
            // InternalOpenAir.g:529:3: ( (lv_sbVal2_3_0= RULE_INT ) )
            // InternalOpenAir.g:530:4: (lv_sbVal2_3_0= RULE_INT )
            {
            // InternalOpenAir.g:530:4: (lv_sbVal2_3_0= RULE_INT )
            // InternalOpenAir.g:531:5: lv_sbVal2_3_0= RULE_INT
            {
            lv_sbVal2_3_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_sbVal2_3_0, grammarAccess.getSBAccess().getSbVal2INTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sbVal2",
            						lv_sbVal2_3_0,
            						"www.ubx.ch.OpenAir.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSBAccess().getCommaKeyword_4());
            		
            // InternalOpenAir.g:551:3: ( (lv_sbVal3_5_0= RULE_INT ) )
            // InternalOpenAir.g:552:4: (lv_sbVal3_5_0= RULE_INT )
            {
            // InternalOpenAir.g:552:4: (lv_sbVal3_5_0= RULE_INT )
            // InternalOpenAir.g:553:5: lv_sbVal3_5_0= RULE_INT
            {
            lv_sbVal3_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_sbVal3_5_0, grammarAccess.getSBAccess().getSbVal3INTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sbVal3",
            						lv_sbVal3_5_0,
            						"www.ubx.ch.OpenAir.INT");
            				

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
    // $ANTLR end "ruleSB"


    // $ANTLR start "entryRuleAsName"
    // InternalOpenAir.g:573:1: entryRuleAsName returns [EObject current=null] : iv_ruleAsName= ruleAsName EOF ;
    public final EObject entryRuleAsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsName = null;


        try {
            // InternalOpenAir.g:573:47: (iv_ruleAsName= ruleAsName EOF )
            // InternalOpenAir.g:574:2: iv_ruleAsName= ruleAsName EOF
            {
             newCompositeNode(grammarAccess.getAsNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsName=ruleAsName();

            state._fsp--;

             current =iv_ruleAsName; 
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
    // $ANTLR end "entryRuleAsName"


    // $ANTLR start "ruleAsName"
    // InternalOpenAir.g:580:1: ruleAsName returns [EObject current=null] : (otherlv_0= 'AN' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAsName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalOpenAir.g:586:2: ( (otherlv_0= 'AN' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalOpenAir.g:587:2: (otherlv_0= 'AN' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalOpenAir.g:587:2: (otherlv_0= 'AN' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalOpenAir.g:588:3: otherlv_0= 'AN' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAsNameAccess().getANKeyword_0());
            		
            // InternalOpenAir.g:592:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalOpenAir.g:593:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalOpenAir.g:593:4: (lv_name_1_0= RULE_STRING )
            // InternalOpenAir.g:594:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAsNameAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleAsName"


    // $ANTLR start "entryRuleLimites"
    // InternalOpenAir.g:614:1: entryRuleLimites returns [EObject current=null] : iv_ruleLimites= ruleLimites EOF ;
    public final EObject entryRuleLimites() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimites = null;


        try {
            // InternalOpenAir.g:614:48: (iv_ruleLimites= ruleLimites EOF )
            // InternalOpenAir.g:615:2: iv_ruleLimites= ruleLimites EOF
            {
             newCompositeNode(grammarAccess.getLimitesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLimites=ruleLimites();

            state._fsp--;

             current =iv_ruleLimites; 
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
    // $ANTLR end "entryRuleLimites"


    // $ANTLR start "ruleLimites"
    // InternalOpenAir.g:621:1: ruleLimites returns [EObject current=null] : ( ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) ) | ( ( (lv_heighLimit_2_0= ruleHighLimit ) ) ( (lv_lowLimit_3_0= ruleLowLimit ) ) ) ) ;
    public final EObject ruleLimites() throws RecognitionException {
        EObject current = null;

        EObject lv_lowLimit_0_0 = null;

        EObject lv_highLimit_1_0 = null;

        EObject lv_heighLimit_2_0 = null;

        EObject lv_lowLimit_3_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:627:2: ( ( ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) ) | ( ( (lv_heighLimit_2_0= ruleHighLimit ) ) ( (lv_lowLimit_3_0= ruleLowLimit ) ) ) ) )
            // InternalOpenAir.g:628:2: ( ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) ) | ( ( (lv_heighLimit_2_0= ruleHighLimit ) ) ( (lv_lowLimit_3_0= ruleLowLimit ) ) ) )
            {
            // InternalOpenAir.g:628:2: ( ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) ) | ( ( (lv_heighLimit_2_0= ruleHighLimit ) ) ( (lv_lowLimit_3_0= ruleLowLimit ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOpenAir.g:629:3: ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) )
                    {
                    // InternalOpenAir.g:629:3: ( ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) ) )
                    // InternalOpenAir.g:630:4: ( (lv_lowLimit_0_0= ruleLowLimit ) ) ( (lv_highLimit_1_0= ruleHighLimit ) )
                    {
                    // InternalOpenAir.g:630:4: ( (lv_lowLimit_0_0= ruleLowLimit ) )
                    // InternalOpenAir.g:631:5: (lv_lowLimit_0_0= ruleLowLimit )
                    {
                    // InternalOpenAir.g:631:5: (lv_lowLimit_0_0= ruleLowLimit )
                    // InternalOpenAir.g:632:6: lv_lowLimit_0_0= ruleLowLimit
                    {

                    						newCompositeNode(grammarAccess.getLimitesAccess().getLowLimitLowLimitParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_lowLimit_0_0=ruleLowLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitesRule());
                    						}
                    						set(
                    							current,
                    							"lowLimit",
                    							lv_lowLimit_0_0,
                    							"www.ubx.ch.OpenAir.LowLimit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOpenAir.g:649:4: ( (lv_highLimit_1_0= ruleHighLimit ) )
                    // InternalOpenAir.g:650:5: (lv_highLimit_1_0= ruleHighLimit )
                    {
                    // InternalOpenAir.g:650:5: (lv_highLimit_1_0= ruleHighLimit )
                    // InternalOpenAir.g:651:6: lv_highLimit_1_0= ruleHighLimit
                    {

                    						newCompositeNode(grammarAccess.getLimitesAccess().getHighLimitHighLimitParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_highLimit_1_0=ruleHighLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitesRule());
                    						}
                    						set(
                    							current,
                    							"highLimit",
                    							lv_highLimit_1_0,
                    							"www.ubx.ch.OpenAir.HighLimit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOpenAir.g:670:3: ( ( (lv_heighLimit_2_0= ruleHighLimit ) ) ( (lv_lowLimit_3_0= ruleLowLimit ) ) )
                    {
                    // InternalOpenAir.g:670:3: ( ( (lv_heighLimit_2_0= ruleHighLimit ) ) ( (lv_lowLimit_3_0= ruleLowLimit ) ) )
                    // InternalOpenAir.g:671:4: ( (lv_heighLimit_2_0= ruleHighLimit ) ) ( (lv_lowLimit_3_0= ruleLowLimit ) )
                    {
                    // InternalOpenAir.g:671:4: ( (lv_heighLimit_2_0= ruleHighLimit ) )
                    // InternalOpenAir.g:672:5: (lv_heighLimit_2_0= ruleHighLimit )
                    {
                    // InternalOpenAir.g:672:5: (lv_heighLimit_2_0= ruleHighLimit )
                    // InternalOpenAir.g:673:6: lv_heighLimit_2_0= ruleHighLimit
                    {

                    						newCompositeNode(grammarAccess.getLimitesAccess().getHeighLimitHighLimitParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_heighLimit_2_0=ruleHighLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitesRule());
                    						}
                    						set(
                    							current,
                    							"heighLimit",
                    							lv_heighLimit_2_0,
                    							"www.ubx.ch.OpenAir.HighLimit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOpenAir.g:690:4: ( (lv_lowLimit_3_0= ruleLowLimit ) )
                    // InternalOpenAir.g:691:5: (lv_lowLimit_3_0= ruleLowLimit )
                    {
                    // InternalOpenAir.g:691:5: (lv_lowLimit_3_0= ruleLowLimit )
                    // InternalOpenAir.g:692:6: lv_lowLimit_3_0= ruleLowLimit
                    {

                    						newCompositeNode(grammarAccess.getLimitesAccess().getLowLimitLowLimitParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_lowLimit_3_0=ruleLowLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitesRule());
                    						}
                    						set(
                    							current,
                    							"lowLimit",
                    							lv_lowLimit_3_0,
                    							"www.ubx.ch.OpenAir.LowLimit");
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
    // $ANTLR end "ruleLimites"


    // $ANTLR start "entryRuleTheGeom"
    // InternalOpenAir.g:714:1: entryRuleTheGeom returns [EObject current=null] : iv_ruleTheGeom= ruleTheGeom EOF ;
    public final EObject entryRuleTheGeom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheGeom = null;


        try {
            // InternalOpenAir.g:714:48: (iv_ruleTheGeom= ruleTheGeom EOF )
            // InternalOpenAir.g:715:2: iv_ruleTheGeom= ruleTheGeom EOF
            {
             newCompositeNode(grammarAccess.getTheGeomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTheGeom=ruleTheGeom();

            state._fsp--;

             current =iv_ruleTheGeom; 
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
    // $ANTLR end "entryRuleTheGeom"


    // $ANTLR start "ruleTheGeom"
    // InternalOpenAir.g:721:1: ruleTheGeom returns [EObject current=null] : (this_V_0= ruleV | this_DP_1= ruleDP | this_DA_2= ruleDA | this_DB_3= ruleDB | this_DC_4= ruleDC ) ;
    public final EObject ruleTheGeom() throws RecognitionException {
        EObject current = null;

        EObject this_V_0 = null;

        EObject this_DP_1 = null;

        EObject this_DA_2 = null;

        EObject this_DB_3 = null;

        EObject this_DC_4 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:727:2: ( (this_V_0= ruleV | this_DP_1= ruleDP | this_DA_2= ruleDA | this_DB_3= ruleDB | this_DC_4= ruleDC ) )
            // InternalOpenAir.g:728:2: (this_V_0= ruleV | this_DP_1= ruleDP | this_DA_2= ruleDA | this_DB_3= ruleDB | this_DC_4= ruleDC )
            {
            // InternalOpenAir.g:728:2: (this_V_0= ruleV | this_DP_1= ruleDP | this_DA_2= ruleDA | this_DB_3= ruleDB | this_DC_4= ruleDC )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 29:
                {
                alt9=2;
                }
                break;
            case 31:
                {
                alt9=3;
                }
                break;
            case 32:
                {
                alt9=4;
                }
                break;
            case 28:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalOpenAir.g:729:3: this_V_0= ruleV
                    {

                    			newCompositeNode(grammarAccess.getTheGeomAccess().getVParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_V_0=ruleV();

                    state._fsp--;


                    			current = this_V_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOpenAir.g:738:3: this_DP_1= ruleDP
                    {

                    			newCompositeNode(grammarAccess.getTheGeomAccess().getDPParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DP_1=ruleDP();

                    state._fsp--;


                    			current = this_DP_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOpenAir.g:747:3: this_DA_2= ruleDA
                    {

                    			newCompositeNode(grammarAccess.getTheGeomAccess().getDAParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DA_2=ruleDA();

                    state._fsp--;


                    			current = this_DA_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOpenAir.g:756:3: this_DB_3= ruleDB
                    {

                    			newCompositeNode(grammarAccess.getTheGeomAccess().getDBParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DB_3=ruleDB();

                    state._fsp--;


                    			current = this_DB_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOpenAir.g:765:3: this_DC_4= ruleDC
                    {

                    			newCompositeNode(grammarAccess.getTheGeomAccess().getDCParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DC_4=ruleDC();

                    state._fsp--;


                    			current = this_DC_4;
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
    // $ANTLR end "ruleTheGeom"


    // $ANTLR start "entryRuleLowLimit"
    // InternalOpenAir.g:777:1: entryRuleLowLimit returns [EObject current=null] : iv_ruleLowLimit= ruleLowLimit EOF ;
    public final EObject entryRuleLowLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowLimit = null;


        try {
            // InternalOpenAir.g:777:49: (iv_ruleLowLimit= ruleLowLimit EOF )
            // InternalOpenAir.g:778:2: iv_ruleLowLimit= ruleLowLimit EOF
            {
             newCompositeNode(grammarAccess.getLowLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLowLimit=ruleLowLimit();

            state._fsp--;

             current =iv_ruleLowLimit; 
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
    // $ANTLR end "entryRuleLowLimit"


    // $ANTLR start "ruleLowLimit"
    // InternalOpenAir.g:784:1: ruleLowLimit returns [EObject current=null] : (otherlv_0= 'AL' ( (lv_ll_1_0= ruleLimit ) ) ) ;
    public final EObject ruleLowLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ll_1_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:790:2: ( (otherlv_0= 'AL' ( (lv_ll_1_0= ruleLimit ) ) ) )
            // InternalOpenAir.g:791:2: (otherlv_0= 'AL' ( (lv_ll_1_0= ruleLimit ) ) )
            {
            // InternalOpenAir.g:791:2: (otherlv_0= 'AL' ( (lv_ll_1_0= ruleLimit ) ) )
            // InternalOpenAir.g:792:3: otherlv_0= 'AL' ( (lv_ll_1_0= ruleLimit ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getLowLimitAccess().getALKeyword_0());
            		
            // InternalOpenAir.g:796:3: ( (lv_ll_1_0= ruleLimit ) )
            // InternalOpenAir.g:797:4: (lv_ll_1_0= ruleLimit )
            {
            // InternalOpenAir.g:797:4: (lv_ll_1_0= ruleLimit )
            // InternalOpenAir.g:798:5: lv_ll_1_0= ruleLimit
            {

            					newCompositeNode(grammarAccess.getLowLimitAccess().getLlLimitParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ll_1_0=ruleLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLowLimitRule());
            					}
            					set(
            						current,
            						"ll",
            						lv_ll_1_0,
            						"www.ubx.ch.OpenAir.Limit");
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
    // $ANTLR end "ruleLowLimit"


    // $ANTLR start "entryRuleHighLimit"
    // InternalOpenAir.g:819:1: entryRuleHighLimit returns [EObject current=null] : iv_ruleHighLimit= ruleHighLimit EOF ;
    public final EObject entryRuleHighLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighLimit = null;


        try {
            // InternalOpenAir.g:819:50: (iv_ruleHighLimit= ruleHighLimit EOF )
            // InternalOpenAir.g:820:2: iv_ruleHighLimit= ruleHighLimit EOF
            {
             newCompositeNode(grammarAccess.getHighLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHighLimit=ruleHighLimit();

            state._fsp--;

             current =iv_ruleHighLimit; 
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
    // $ANTLR end "entryRuleHighLimit"


    // $ANTLR start "ruleHighLimit"
    // InternalOpenAir.g:826:1: ruleHighLimit returns [EObject current=null] : (otherlv_0= 'AH' ( (lv_hl_1_0= ruleLimit ) ) ) ;
    public final EObject ruleHighLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_hl_1_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:832:2: ( (otherlv_0= 'AH' ( (lv_hl_1_0= ruleLimit ) ) ) )
            // InternalOpenAir.g:833:2: (otherlv_0= 'AH' ( (lv_hl_1_0= ruleLimit ) ) )
            {
            // InternalOpenAir.g:833:2: (otherlv_0= 'AH' ( (lv_hl_1_0= ruleLimit ) ) )
            // InternalOpenAir.g:834:3: otherlv_0= 'AH' ( (lv_hl_1_0= ruleLimit ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getHighLimitAccess().getAHKeyword_0());
            		
            // InternalOpenAir.g:838:3: ( (lv_hl_1_0= ruleLimit ) )
            // InternalOpenAir.g:839:4: (lv_hl_1_0= ruleLimit )
            {
            // InternalOpenAir.g:839:4: (lv_hl_1_0= ruleLimit )
            // InternalOpenAir.g:840:5: lv_hl_1_0= ruleLimit
            {

            					newCompositeNode(grammarAccess.getHighLimitAccess().getHlLimitParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_hl_1_0=ruleLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHighLimitRule());
            					}
            					set(
            						current,
            						"hl",
            						lv_hl_1_0,
            						"www.ubx.ch.OpenAir.Limit");
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
    // $ANTLR end "ruleHighLimit"


    // $ANTLR start "entryRuleLimit"
    // InternalOpenAir.g:861:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalOpenAir.g:861:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalOpenAir.g:862:2: iv_ruleLimit= ruleLimit EOF
            {
             newCompositeNode(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLimit=ruleLimit();

            state._fsp--;

             current =iv_ruleLimit; 
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
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalOpenAir.g:868:1: ruleLimit returns [EObject current=null] : (this_FL_0= ruleFL | this_SFC_1= ruleSFC | this_GND_2= ruleGND | this_UNL_3= ruleUNL | this_VAL_4= ruleVAL ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        EObject this_FL_0 = null;

        EObject this_SFC_1 = null;

        EObject this_GND_2 = null;

        EObject this_UNL_3 = null;

        EObject this_VAL_4 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:874:2: ( (this_FL_0= ruleFL | this_SFC_1= ruleSFC | this_GND_2= ruleGND | this_UNL_3= ruleUNL | this_VAL_4= ruleVAL ) )
            // InternalOpenAir.g:875:2: (this_FL_0= ruleFL | this_SFC_1= ruleSFC | this_GND_2= ruleGND | this_UNL_3= ruleUNL | this_VAL_4= ruleVAL )
            {
            // InternalOpenAir.g:875:2: (this_FL_0= ruleFL | this_SFC_1= ruleSFC | this_GND_2= ruleGND | this_UNL_3= ruleUNL | this_VAL_4= ruleVAL )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            case 22:
                {
                alt10=4;
                }
                break;
            case RULE_INT:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalOpenAir.g:876:3: this_FL_0= ruleFL
                    {

                    			newCompositeNode(grammarAccess.getLimitAccess().getFLParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FL_0=ruleFL();

                    state._fsp--;


                    			current = this_FL_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOpenAir.g:885:3: this_SFC_1= ruleSFC
                    {

                    			newCompositeNode(grammarAccess.getLimitAccess().getSFCParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SFC_1=ruleSFC();

                    state._fsp--;


                    			current = this_SFC_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOpenAir.g:894:3: this_GND_2= ruleGND
                    {

                    			newCompositeNode(grammarAccess.getLimitAccess().getGNDParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GND_2=ruleGND();

                    state._fsp--;


                    			current = this_GND_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOpenAir.g:903:3: this_UNL_3= ruleUNL
                    {

                    			newCompositeNode(grammarAccess.getLimitAccess().getUNLParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_UNL_3=ruleUNL();

                    state._fsp--;


                    			current = this_UNL_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOpenAir.g:912:3: this_VAL_4= ruleVAL
                    {

                    			newCompositeNode(grammarAccess.getLimitAccess().getVALParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_VAL_4=ruleVAL();

                    state._fsp--;


                    			current = this_VAL_4;
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
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleFL"
    // InternalOpenAir.g:924:1: entryRuleFL returns [EObject current=null] : iv_ruleFL= ruleFL EOF ;
    public final EObject entryRuleFL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFL = null;


        try {
            // InternalOpenAir.g:924:43: (iv_ruleFL= ruleFL EOF )
            // InternalOpenAir.g:925:2: iv_ruleFL= ruleFL EOF
            {
             newCompositeNode(grammarAccess.getFLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFL=ruleFL();

            state._fsp--;

             current =iv_ruleFL; 
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
    // $ANTLR end "entryRuleFL"


    // $ANTLR start "ruleFL"
    // InternalOpenAir.g:931:1: ruleFL returns [EObject current=null] : (otherlv_0= 'FL' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleFL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalOpenAir.g:937:2: ( (otherlv_0= 'FL' ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalOpenAir.g:938:2: (otherlv_0= 'FL' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalOpenAir.g:938:2: (otherlv_0= 'FL' ( (lv_value_1_0= RULE_INT ) ) )
            // InternalOpenAir.g:939:3: otherlv_0= 'FL' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFLAccess().getFLKeyword_0());
            		
            // InternalOpenAir.g:943:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalOpenAir.g:944:4: (lv_value_1_0= RULE_INT )
            {
            // InternalOpenAir.g:944:4: (lv_value_1_0= RULE_INT )
            // InternalOpenAir.g:945:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getFLAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"www.ubx.ch.OpenAir.INT");
            				

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
    // $ANTLR end "ruleFL"


    // $ANTLR start "entryRuleSFC"
    // InternalOpenAir.g:965:1: entryRuleSFC returns [EObject current=null] : iv_ruleSFC= ruleSFC EOF ;
    public final EObject entryRuleSFC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFC = null;


        try {
            // InternalOpenAir.g:965:44: (iv_ruleSFC= ruleSFC EOF )
            // InternalOpenAir.g:966:2: iv_ruleSFC= ruleSFC EOF
            {
             newCompositeNode(grammarAccess.getSFCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSFC=ruleSFC();

            state._fsp--;

             current =iv_ruleSFC; 
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
    // $ANTLR end "entryRuleSFC"


    // $ANTLR start "ruleSFC"
    // InternalOpenAir.g:972:1: ruleSFC returns [EObject current=null] : ( () otherlv_1= 'SFC' ) ;
    public final EObject ruleSFC() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOpenAir.g:978:2: ( ( () otherlv_1= 'SFC' ) )
            // InternalOpenAir.g:979:2: ( () otherlv_1= 'SFC' )
            {
            // InternalOpenAir.g:979:2: ( () otherlv_1= 'SFC' )
            // InternalOpenAir.g:980:3: () otherlv_1= 'SFC'
            {
            // InternalOpenAir.g:980:3: ()
            // InternalOpenAir.g:981:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSFCAccess().getSFCAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSFCAccess().getSFCKeyword_1());
            		

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
    // $ANTLR end "ruleSFC"


    // $ANTLR start "entryRuleGND"
    // InternalOpenAir.g:995:1: entryRuleGND returns [EObject current=null] : iv_ruleGND= ruleGND EOF ;
    public final EObject entryRuleGND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGND = null;


        try {
            // InternalOpenAir.g:995:44: (iv_ruleGND= ruleGND EOF )
            // InternalOpenAir.g:996:2: iv_ruleGND= ruleGND EOF
            {
             newCompositeNode(grammarAccess.getGNDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGND=ruleGND();

            state._fsp--;

             current =iv_ruleGND; 
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
    // $ANTLR end "entryRuleGND"


    // $ANTLR start "ruleGND"
    // InternalOpenAir.g:1002:1: ruleGND returns [EObject current=null] : ( () otherlv_1= 'GND' ) ;
    public final EObject ruleGND() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOpenAir.g:1008:2: ( ( () otherlv_1= 'GND' ) )
            // InternalOpenAir.g:1009:2: ( () otherlv_1= 'GND' )
            {
            // InternalOpenAir.g:1009:2: ( () otherlv_1= 'GND' )
            // InternalOpenAir.g:1010:3: () otherlv_1= 'GND'
            {
            // InternalOpenAir.g:1010:3: ()
            // InternalOpenAir.g:1011:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGNDAccess().getGNDAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGNDAccess().getGNDKeyword_1());
            		

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
    // $ANTLR end "ruleGND"


    // $ANTLR start "entryRuleUNL"
    // InternalOpenAir.g:1025:1: entryRuleUNL returns [EObject current=null] : iv_ruleUNL= ruleUNL EOF ;
    public final EObject entryRuleUNL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUNL = null;


        try {
            // InternalOpenAir.g:1025:44: (iv_ruleUNL= ruleUNL EOF )
            // InternalOpenAir.g:1026:2: iv_ruleUNL= ruleUNL EOF
            {
             newCompositeNode(grammarAccess.getUNLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUNL=ruleUNL();

            state._fsp--;

             current =iv_ruleUNL; 
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
    // $ANTLR end "entryRuleUNL"


    // $ANTLR start "ruleUNL"
    // InternalOpenAir.g:1032:1: ruleUNL returns [EObject current=null] : ( () otherlv_1= 'UNL' ) ;
    public final EObject ruleUNL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOpenAir.g:1038:2: ( ( () otherlv_1= 'UNL' ) )
            // InternalOpenAir.g:1039:2: ( () otherlv_1= 'UNL' )
            {
            // InternalOpenAir.g:1039:2: ( () otherlv_1= 'UNL' )
            // InternalOpenAir.g:1040:3: () otherlv_1= 'UNL'
            {
            // InternalOpenAir.g:1040:3: ()
            // InternalOpenAir.g:1041:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUNLAccess().getUNLAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUNLAccess().getUNLKeyword_1());
            		

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
    // $ANTLR end "ruleUNL"


    // $ANTLR start "entryRuleVAL"
    // InternalOpenAir.g:1055:1: entryRuleVAL returns [EObject current=null] : iv_ruleVAL= ruleVAL EOF ;
    public final EObject entryRuleVAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVAL = null;


        try {
            // InternalOpenAir.g:1055:44: (iv_ruleVAL= ruleVAL EOF )
            // InternalOpenAir.g:1056:2: iv_ruleVAL= ruleVAL EOF
            {
             newCompositeNode(grammarAccess.getVALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVAL=ruleVAL();

            state._fsp--;

             current =iv_ruleVAL; 
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
    // $ANTLR end "entryRuleVAL"


    // $ANTLR start "ruleVAL"
    // InternalOpenAir.g:1062:1: ruleVAL returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnits ) ) ) ;
    public final EObject ruleVAL() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:1068:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnits ) ) ) )
            // InternalOpenAir.g:1069:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnits ) ) )
            {
            // InternalOpenAir.g:1069:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnits ) ) )
            // InternalOpenAir.g:1070:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleUnits ) )
            {
            // InternalOpenAir.g:1070:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalOpenAir.g:1071:4: (lv_value_0_0= RULE_INT )
            {
            // InternalOpenAir.g:1071:4: (lv_value_0_0= RULE_INT )
            // InternalOpenAir.g:1072:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_value_0_0, grammarAccess.getVALAccess().getValueINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVALRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"www.ubx.ch.OpenAir.INT");
            				

            }


            }

            // InternalOpenAir.g:1088:3: ( (lv_unit_1_0= ruleUnits ) )
            // InternalOpenAir.g:1089:4: (lv_unit_1_0= ruleUnits )
            {
            // InternalOpenAir.g:1089:4: (lv_unit_1_0= ruleUnits )
            // InternalOpenAir.g:1090:5: lv_unit_1_0= ruleUnits
            {

            					newCompositeNode(grammarAccess.getVALAccess().getUnitUnitsEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_1_0=ruleUnits();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVALRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_1_0,
            						"www.ubx.ch.OpenAir.Units");
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
    // $ANTLR end "ruleVAL"


    // $ANTLR start "entryRuleV"
    // InternalOpenAir.g:1111:1: entryRuleV returns [EObject current=null] : iv_ruleV= ruleV EOF ;
    public final EObject entryRuleV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleV = null;


        try {
            // InternalOpenAir.g:1111:42: (iv_ruleV= ruleV EOF )
            // InternalOpenAir.g:1112:2: iv_ruleV= ruleV EOF
            {
             newCompositeNode(grammarAccess.getVRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleV=ruleV();

            state._fsp--;

             current =iv_ruleV; 
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
    // $ANTLR end "entryRuleV"


    // $ANTLR start "ruleV"
    // InternalOpenAir.g:1118:1: ruleV returns [EObject current=null] : (otherlv_0= 'V' ( (lv_vsub_1_0= ruleVsub ) ) ) ;
    public final EObject ruleV() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_vsub_1_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:1124:2: ( (otherlv_0= 'V' ( (lv_vsub_1_0= ruleVsub ) ) ) )
            // InternalOpenAir.g:1125:2: (otherlv_0= 'V' ( (lv_vsub_1_0= ruleVsub ) ) )
            {
            // InternalOpenAir.g:1125:2: (otherlv_0= 'V' ( (lv_vsub_1_0= ruleVsub ) ) )
            // InternalOpenAir.g:1126:3: otherlv_0= 'V' ( (lv_vsub_1_0= ruleVsub ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getVAccess().getVKeyword_0());
            		
            // InternalOpenAir.g:1130:3: ( (lv_vsub_1_0= ruleVsub ) )
            // InternalOpenAir.g:1131:4: (lv_vsub_1_0= ruleVsub )
            {
            // InternalOpenAir.g:1131:4: (lv_vsub_1_0= ruleVsub )
            // InternalOpenAir.g:1132:5: lv_vsub_1_0= ruleVsub
            {

            					newCompositeNode(grammarAccess.getVAccess().getVsubVsubParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_vsub_1_0=ruleVsub();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVRule());
            					}
            					set(
            						current,
            						"vsub",
            						lv_vsub_1_0,
            						"www.ubx.ch.OpenAir.Vsub");
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
    // $ANTLR end "ruleV"


    // $ANTLR start "entryRuleVsub"
    // InternalOpenAir.g:1153:1: entryRuleVsub returns [EObject current=null] : iv_ruleVsub= ruleVsub EOF ;
    public final EObject entryRuleVsub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVsub = null;


        try {
            // InternalOpenAir.g:1153:45: (iv_ruleVsub= ruleVsub EOF )
            // InternalOpenAir.g:1154:2: iv_ruleVsub= ruleVsub EOF
            {
             newCompositeNode(grammarAccess.getVsubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVsub=ruleVsub();

            state._fsp--;

             current =iv_ruleVsub; 
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
    // $ANTLR end "entryRuleVsub"


    // $ANTLR start "ruleVsub"
    // InternalOpenAir.g:1160:1: ruleVsub returns [EObject current=null] : ( (otherlv_0= 'X=' ( (lv_x_1_0= rulePoint ) ) ) | (otherlv_2= 'D=' ( (lv_d_3_0= ruleDir ) ) ) ) ;
    public final EObject ruleVsub() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_x_1_0 = null;

        EObject lv_d_3_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:1166:2: ( ( (otherlv_0= 'X=' ( (lv_x_1_0= rulePoint ) ) ) | (otherlv_2= 'D=' ( (lv_d_3_0= ruleDir ) ) ) ) )
            // InternalOpenAir.g:1167:2: ( (otherlv_0= 'X=' ( (lv_x_1_0= rulePoint ) ) ) | (otherlv_2= 'D=' ( (lv_d_3_0= ruleDir ) ) ) )
            {
            // InternalOpenAir.g:1167:2: ( (otherlv_0= 'X=' ( (lv_x_1_0= rulePoint ) ) ) | (otherlv_2= 'D=' ( (lv_d_3_0= ruleDir ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalOpenAir.g:1168:3: (otherlv_0= 'X=' ( (lv_x_1_0= rulePoint ) ) )
                    {
                    // InternalOpenAir.g:1168:3: (otherlv_0= 'X=' ( (lv_x_1_0= rulePoint ) ) )
                    // InternalOpenAir.g:1169:4: otherlv_0= 'X=' ( (lv_x_1_0= rulePoint ) )
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getVsubAccess().getXKeyword_0_0());
                    			
                    // InternalOpenAir.g:1173:4: ( (lv_x_1_0= rulePoint ) )
                    // InternalOpenAir.g:1174:5: (lv_x_1_0= rulePoint )
                    {
                    // InternalOpenAir.g:1174:5: (lv_x_1_0= rulePoint )
                    // InternalOpenAir.g:1175:6: lv_x_1_0= rulePoint
                    {

                    						newCompositeNode(grammarAccess.getVsubAccess().getXPointParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_x_1_0=rulePoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVsubRule());
                    						}
                    						set(
                    							current,
                    							"x",
                    							lv_x_1_0,
                    							"www.ubx.ch.OpenAir.Point");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOpenAir.g:1194:3: (otherlv_2= 'D=' ( (lv_d_3_0= ruleDir ) ) )
                    {
                    // InternalOpenAir.g:1194:3: (otherlv_2= 'D=' ( (lv_d_3_0= ruleDir ) ) )
                    // InternalOpenAir.g:1195:4: otherlv_2= 'D=' ( (lv_d_3_0= ruleDir ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getVsubAccess().getDKeyword_1_0());
                    			
                    // InternalOpenAir.g:1199:4: ( (lv_d_3_0= ruleDir ) )
                    // InternalOpenAir.g:1200:5: (lv_d_3_0= ruleDir )
                    {
                    // InternalOpenAir.g:1200:5: (lv_d_3_0= ruleDir )
                    // InternalOpenAir.g:1201:6: lv_d_3_0= ruleDir
                    {

                    						newCompositeNode(grammarAccess.getVsubAccess().getDDirParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_3_0=ruleDir();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVsubRule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_3_0,
                    							"www.ubx.ch.OpenAir.Dir");
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
    // $ANTLR end "ruleVsub"


    // $ANTLR start "entryRuleDir"
    // InternalOpenAir.g:1223:1: entryRuleDir returns [EObject current=null] : iv_ruleDir= ruleDir EOF ;
    public final EObject entryRuleDir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDir = null;


        try {
            // InternalOpenAir.g:1223:44: (iv_ruleDir= ruleDir EOF )
            // InternalOpenAir.g:1224:2: iv_ruleDir= ruleDir EOF
            {
             newCompositeNode(grammarAccess.getDirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDir=ruleDir();

            state._fsp--;

             current =iv_ruleDir; 
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
    // $ANTLR end "entryRuleDir"


    // $ANTLR start "ruleDir"
    // InternalOpenAir.g:1230:1: ruleDir returns [EObject current=null] : (this_Plus_0= rulePlus | this_Minus_1= ruleMinus ) ;
    public final EObject ruleDir() throws RecognitionException {
        EObject current = null;

        EObject this_Plus_0 = null;

        EObject this_Minus_1 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:1236:2: ( (this_Plus_0= rulePlus | this_Minus_1= ruleMinus ) )
            // InternalOpenAir.g:1237:2: (this_Plus_0= rulePlus | this_Minus_1= ruleMinus )
            {
            // InternalOpenAir.g:1237:2: (this_Plus_0= rulePlus | this_Minus_1= ruleMinus )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalOpenAir.g:1238:3: this_Plus_0= rulePlus
                    {

                    			newCompositeNode(grammarAccess.getDirAccess().getPlusParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Plus_0=rulePlus();

                    state._fsp--;


                    			current = this_Plus_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOpenAir.g:1247:3: this_Minus_1= ruleMinus
                    {

                    			newCompositeNode(grammarAccess.getDirAccess().getMinusParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Minus_1=ruleMinus();

                    state._fsp--;


                    			current = this_Minus_1;
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
    // $ANTLR end "ruleDir"


    // $ANTLR start "entryRulePlus"
    // InternalOpenAir.g:1259:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalOpenAir.g:1259:45: (iv_rulePlus= rulePlus EOF )
            // InternalOpenAir.g:1260:2: iv_rulePlus= rulePlus EOF
            {
             newCompositeNode(grammarAccess.getPlusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlus=rulePlus();

            state._fsp--;

             current =iv_rulePlus; 
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
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // InternalOpenAir.g:1266:1: rulePlus returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOpenAir.g:1272:2: ( ( () otherlv_1= '+' ) )
            // InternalOpenAir.g:1273:2: ( () otherlv_1= '+' )
            {
            // InternalOpenAir.g:1273:2: ( () otherlv_1= '+' )
            // InternalOpenAir.g:1274:3: () otherlv_1= '+'
            {
            // InternalOpenAir.g:1274:3: ()
            // InternalOpenAir.g:1275:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlusAccess().getPlusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPlusAccess().getPlusSignKeyword_1());
            		

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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMinus"
    // InternalOpenAir.g:1289:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // InternalOpenAir.g:1289:46: (iv_ruleMinus= ruleMinus EOF )
            // InternalOpenAir.g:1290:2: iv_ruleMinus= ruleMinus EOF
            {
             newCompositeNode(grammarAccess.getMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinus=ruleMinus();

            state._fsp--;

             current =iv_ruleMinus; 
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
    // $ANTLR end "entryRuleMinus"


    // $ANTLR start "ruleMinus"
    // InternalOpenAir.g:1296:1: ruleMinus returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalOpenAir.g:1302:2: ( ( () otherlv_1= '-' ) )
            // InternalOpenAir.g:1303:2: ( () otherlv_1= '-' )
            {
            // InternalOpenAir.g:1303:2: ( () otherlv_1= '-' )
            // InternalOpenAir.g:1304:3: () otherlv_1= '-'
            {
            // InternalOpenAir.g:1304:3: ()
            // InternalOpenAir.g:1305:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinusAccess().getMinusAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMinusAccess().getHyphenMinusKeyword_1());
            		

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
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRuleDC"
    // InternalOpenAir.g:1319:1: entryRuleDC returns [EObject current=null] : iv_ruleDC= ruleDC EOF ;
    public final EObject entryRuleDC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDC = null;


        try {
            // InternalOpenAir.g:1319:43: (iv_ruleDC= ruleDC EOF )
            // InternalOpenAir.g:1320:2: iv_ruleDC= ruleDC EOF
            {
             newCompositeNode(grammarAccess.getDCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDC=ruleDC();

            state._fsp--;

             current =iv_ruleDC; 
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
    // $ANTLR end "entryRuleDC"


    // $ANTLR start "ruleDC"
    // InternalOpenAir.g:1326:1: ruleDC returns [EObject current=null] : (otherlv_0= 'DC' ( (lv_radius_1_0= ruleRadius ) ) ) ;
    public final EObject ruleDC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_radius_1_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:1332:2: ( (otherlv_0= 'DC' ( (lv_radius_1_0= ruleRadius ) ) ) )
            // InternalOpenAir.g:1333:2: (otherlv_0= 'DC' ( (lv_radius_1_0= ruleRadius ) ) )
            {
            // InternalOpenAir.g:1333:2: (otherlv_0= 'DC' ( (lv_radius_1_0= ruleRadius ) ) )
            // InternalOpenAir.g:1334:3: otherlv_0= 'DC' ( (lv_radius_1_0= ruleRadius ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDCAccess().getDCKeyword_0());
            		
            // InternalOpenAir.g:1338:3: ( (lv_radius_1_0= ruleRadius ) )
            // InternalOpenAir.g:1339:4: (lv_radius_1_0= ruleRadius )
            {
            // InternalOpenAir.g:1339:4: (lv_radius_1_0= ruleRadius )
            // InternalOpenAir.g:1340:5: lv_radius_1_0= ruleRadius
            {

            					newCompositeNode(grammarAccess.getDCAccess().getRadiusRadiusParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_radius_1_0=ruleRadius();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDCRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_1_0,
            						"www.ubx.ch.OpenAir.Radius");
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
    // $ANTLR end "ruleDC"


    // $ANTLR start "entryRuleRadius"
    // InternalOpenAir.g:1361:1: entryRuleRadius returns [EObject current=null] : iv_ruleRadius= ruleRadius EOF ;
    public final EObject entryRuleRadius() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadius = null;


        try {
            // InternalOpenAir.g:1361:47: (iv_ruleRadius= ruleRadius EOF )
            // InternalOpenAir.g:1362:2: iv_ruleRadius= ruleRadius EOF
            {
             newCompositeNode(grammarAccess.getRadiusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRadius=ruleRadius();

            state._fsp--;

             current =iv_ruleRadius; 
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
    // $ANTLR end "entryRuleRadius"


    // $ANTLR start "ruleRadius"
    // InternalOpenAir.g:1368:1: ruleRadius returns [EObject current=null] : ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_reakValuer_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleRadius() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_0=null;
        Token lv_reakValuer_1_0=null;


        	enterRule();

        try {
            // InternalOpenAir.g:1374:2: ( ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_reakValuer_1_0= RULE_REAL ) ) ) )
            // InternalOpenAir.g:1375:2: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_reakValuer_1_0= RULE_REAL ) ) )
            {
            // InternalOpenAir.g:1375:2: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_reakValuer_1_0= RULE_REAL ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_REAL) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalOpenAir.g:1376:3: ( (lv_intValue_0_0= RULE_INT ) )
                    {
                    // InternalOpenAir.g:1376:3: ( (lv_intValue_0_0= RULE_INT ) )
                    // InternalOpenAir.g:1377:4: (lv_intValue_0_0= RULE_INT )
                    {
                    // InternalOpenAir.g:1377:4: (lv_intValue_0_0= RULE_INT )
                    // InternalOpenAir.g:1378:5: lv_intValue_0_0= RULE_INT
                    {
                    lv_intValue_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_intValue_0_0, grammarAccess.getRadiusAccess().getIntValueINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRadiusRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"intValue",
                    						lv_intValue_0_0,
                    						"www.ubx.ch.OpenAir.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOpenAir.g:1395:3: ( (lv_reakValuer_1_0= RULE_REAL ) )
                    {
                    // InternalOpenAir.g:1395:3: ( (lv_reakValuer_1_0= RULE_REAL ) )
                    // InternalOpenAir.g:1396:4: (lv_reakValuer_1_0= RULE_REAL )
                    {
                    // InternalOpenAir.g:1396:4: (lv_reakValuer_1_0= RULE_REAL )
                    // InternalOpenAir.g:1397:5: lv_reakValuer_1_0= RULE_REAL
                    {
                    lv_reakValuer_1_0=(Token)match(input,RULE_REAL,FOLLOW_2); 

                    					newLeafNode(lv_reakValuer_1_0, grammarAccess.getRadiusAccess().getReakValuerREALTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRadiusRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"reakValuer",
                    						lv_reakValuer_1_0,
                    						"www.ubx.ch.OpenAir.REAL");
                    				

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
    // $ANTLR end "ruleRadius"


    // $ANTLR start "entryRuleDP"
    // InternalOpenAir.g:1417:1: entryRuleDP returns [EObject current=null] : iv_ruleDP= ruleDP EOF ;
    public final EObject entryRuleDP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDP = null;


        try {
            // InternalOpenAir.g:1417:43: (iv_ruleDP= ruleDP EOF )
            // InternalOpenAir.g:1418:2: iv_ruleDP= ruleDP EOF
            {
             newCompositeNode(grammarAccess.getDPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDP=ruleDP();

            state._fsp--;

             current =iv_ruleDP; 
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
    // $ANTLR end "entryRuleDP"


    // $ANTLR start "ruleDP"
    // InternalOpenAir.g:1424:1: ruleDP returns [EObject current=null] : (otherlv_0= 'DP' ( (lv_dp_1_0= rulePoint ) ) ) ;
    public final EObject ruleDP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dp_1_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:1430:2: ( (otherlv_0= 'DP' ( (lv_dp_1_0= rulePoint ) ) ) )
            // InternalOpenAir.g:1431:2: (otherlv_0= 'DP' ( (lv_dp_1_0= rulePoint ) ) )
            {
            // InternalOpenAir.g:1431:2: (otherlv_0= 'DP' ( (lv_dp_1_0= rulePoint ) ) )
            // InternalOpenAir.g:1432:3: otherlv_0= 'DP' ( (lv_dp_1_0= rulePoint ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDPAccess().getDPKeyword_0());
            		
            // InternalOpenAir.g:1436:3: ( (lv_dp_1_0= rulePoint ) )
            // InternalOpenAir.g:1437:4: (lv_dp_1_0= rulePoint )
            {
            // InternalOpenAir.g:1437:4: (lv_dp_1_0= rulePoint )
            // InternalOpenAir.g:1438:5: lv_dp_1_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getDPAccess().getDpPointParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_dp_1_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDPRule());
            					}
            					set(
            						current,
            						"dp",
            						lv_dp_1_0,
            						"www.ubx.ch.OpenAir.Point");
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
    // $ANTLR end "ruleDP"


    // $ANTLR start "entryRulePoint"
    // InternalOpenAir.g:1459:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalOpenAir.g:1459:46: (iv_rulePoint= rulePoint EOF )
            // InternalOpenAir.g:1460:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalOpenAir.g:1466:1: rulePoint returns [EObject current=null] : (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        EObject this_Point1_0 = null;

        EObject this_Point2_1 = null;

        EObject this_Point3_2 = null;

        EObject this_Point4_3 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:1472:2: ( (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 ) )
            // InternalOpenAir.g:1473:2: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )
            {
            // InternalOpenAir.g:1473:2: (this_Point1_0= rulePoint1 | this_Point2_1= rulePoint2 | this_Point3_2= rulePoint3 | this_Point4_3= rulePoint4 )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==30) ) {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==RULE_REAL) ) {
                        alt14=2;
                    }
                    else if ( (LA14_3==RULE_INT) ) {
                        int LA14_5 = input.LA(4);

                        if ( (LA14_5==30) ) {
                            int LA14_6 = input.LA(5);

                            if ( (LA14_6==RULE_INT) ) {
                                alt14=1;
                            }
                            else if ( (LA14_6==RULE_REAL) ) {
                                alt14=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 14, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==RULE_REAL) ) {
                alt14=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalOpenAir.g:1474:3: this_Point1_0= rulePoint1
                    {

                    			newCompositeNode(grammarAccess.getPointAccess().getPoint1ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Point1_0=rulePoint1();

                    state._fsp--;


                    			current = this_Point1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOpenAir.g:1483:3: this_Point2_1= rulePoint2
                    {

                    			newCompositeNode(grammarAccess.getPointAccess().getPoint2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Point2_1=rulePoint2();

                    state._fsp--;


                    			current = this_Point2_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOpenAir.g:1492:3: this_Point3_2= rulePoint3
                    {

                    			newCompositeNode(grammarAccess.getPointAccess().getPoint3ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Point3_2=rulePoint3();

                    state._fsp--;


                    			current = this_Point3_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOpenAir.g:1501:3: this_Point4_3= rulePoint4
                    {

                    			newCompositeNode(grammarAccess.getPointAccess().getPoint4ParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Point4_3=rulePoint4();

                    state._fsp--;


                    			current = this_Point4_3;
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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRulePoint1"
    // InternalOpenAir.g:1513:1: entryRulePoint1 returns [EObject current=null] : iv_rulePoint1= rulePoint1 EOF ;
    public final EObject entryRulePoint1() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint1 = null;


        try {
            // InternalOpenAir.g:1513:47: (iv_rulePoint1= rulePoint1 EOF )
            // InternalOpenAir.g:1514:2: iv_rulePoint1= rulePoint1 EOF
            {
             newCompositeNode(grammarAccess.getPoint1Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint1=rulePoint1();

            state._fsp--;

             current =iv_rulePoint1; 
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
    // $ANTLR end "entryRulePoint1"


    // $ANTLR start "rulePoint1"
    // InternalOpenAir.g:1520:1: rulePoint1 returns [EObject current=null] : ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleMinSec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleMinSec ) ) ( (lv_we_7_0= ruleWE ) ) ) ;
    public final EObject rulePoint1() throws RecognitionException {
        EObject current = null;

        EObject lv_longD_0_0 = null;

        EObject lv_longM_1_0 = null;

        EObject lv_longS_2_0 = null;

        Enumerator lv_ns_3_0 = null;

        EObject lv_latD_4_0 = null;

        EObject lv_latM_5_0 = null;

        EObject lv_latS_6_0 = null;

        Enumerator lv_we_7_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:1526:2: ( ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleMinSec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleMinSec ) ) ( (lv_we_7_0= ruleWE ) ) ) )
            // InternalOpenAir.g:1527:2: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleMinSec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleMinSec ) ) ( (lv_we_7_0= ruleWE ) ) )
            {
            // InternalOpenAir.g:1527:2: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleMinSec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleMinSec ) ) ( (lv_we_7_0= ruleWE ) ) )
            // InternalOpenAir.g:1528:3: ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleMinSec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleMinSec ) ) ( (lv_we_7_0= ruleWE ) )
            {
            // InternalOpenAir.g:1528:3: ( (lv_longD_0_0= ruleLongDegr ) )
            // InternalOpenAir.g:1529:4: (lv_longD_0_0= ruleLongDegr )
            {
            // InternalOpenAir.g:1529:4: (lv_longD_0_0= ruleLongDegr )
            // InternalOpenAir.g:1530:5: lv_longD_0_0= ruleLongDegr
            {

            					newCompositeNode(grammarAccess.getPoint1Access().getLongDLongDegrParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_longD_0_0=ruleLongDegr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint1Rule());
            					}
            					set(
            						current,
            						"longD",
            						lv_longD_0_0,
            						"www.ubx.ch.OpenAir.LongDegr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1547:3: ( (lv_longM_1_0= ruleMinSec ) )
            // InternalOpenAir.g:1548:4: (lv_longM_1_0= ruleMinSec )
            {
            // InternalOpenAir.g:1548:4: (lv_longM_1_0= ruleMinSec )
            // InternalOpenAir.g:1549:5: lv_longM_1_0= ruleMinSec
            {

            					newCompositeNode(grammarAccess.getPoint1Access().getLongMMinSecParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_longM_1_0=ruleMinSec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint1Rule());
            					}
            					set(
            						current,
            						"longM",
            						lv_longM_1_0,
            						"www.ubx.ch.OpenAir.MinSec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1566:3: ( (lv_longS_2_0= ruleMinSec ) )
            // InternalOpenAir.g:1567:4: (lv_longS_2_0= ruleMinSec )
            {
            // InternalOpenAir.g:1567:4: (lv_longS_2_0= ruleMinSec )
            // InternalOpenAir.g:1568:5: lv_longS_2_0= ruleMinSec
            {

            					newCompositeNode(grammarAccess.getPoint1Access().getLongSMinSecParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_longS_2_0=ruleMinSec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint1Rule());
            					}
            					set(
            						current,
            						"longS",
            						lv_longS_2_0,
            						"www.ubx.ch.OpenAir.MinSec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1585:3: ( (lv_ns_3_0= ruleNS ) )
            // InternalOpenAir.g:1586:4: (lv_ns_3_0= ruleNS )
            {
            // InternalOpenAir.g:1586:4: (lv_ns_3_0= ruleNS )
            // InternalOpenAir.g:1587:5: lv_ns_3_0= ruleNS
            {

            					newCompositeNode(grammarAccess.getPoint1Access().getNsNSEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_ns_3_0=ruleNS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint1Rule());
            					}
            					set(
            						current,
            						"ns",
            						lv_ns_3_0,
            						"www.ubx.ch.OpenAir.NS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1604:3: ( (lv_latD_4_0= ruleLatDegr ) )
            // InternalOpenAir.g:1605:4: (lv_latD_4_0= ruleLatDegr )
            {
            // InternalOpenAir.g:1605:4: (lv_latD_4_0= ruleLatDegr )
            // InternalOpenAir.g:1606:5: lv_latD_4_0= ruleLatDegr
            {

            					newCompositeNode(grammarAccess.getPoint1Access().getLatDLatDegrParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_latD_4_0=ruleLatDegr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint1Rule());
            					}
            					set(
            						current,
            						"latD",
            						lv_latD_4_0,
            						"www.ubx.ch.OpenAir.LatDegr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1623:3: ( (lv_latM_5_0= ruleMinSec ) )
            // InternalOpenAir.g:1624:4: (lv_latM_5_0= ruleMinSec )
            {
            // InternalOpenAir.g:1624:4: (lv_latM_5_0= ruleMinSec )
            // InternalOpenAir.g:1625:5: lv_latM_5_0= ruleMinSec
            {

            					newCompositeNode(grammarAccess.getPoint1Access().getLatMMinSecParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_latM_5_0=ruleMinSec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint1Rule());
            					}
            					set(
            						current,
            						"latM",
            						lv_latM_5_0,
            						"www.ubx.ch.OpenAir.MinSec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1642:3: ( (lv_latS_6_0= ruleMinSec ) )
            // InternalOpenAir.g:1643:4: (lv_latS_6_0= ruleMinSec )
            {
            // InternalOpenAir.g:1643:4: (lv_latS_6_0= ruleMinSec )
            // InternalOpenAir.g:1644:5: lv_latS_6_0= ruleMinSec
            {

            					newCompositeNode(grammarAccess.getPoint1Access().getLatSMinSecParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
            lv_latS_6_0=ruleMinSec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint1Rule());
            					}
            					set(
            						current,
            						"latS",
            						lv_latS_6_0,
            						"www.ubx.ch.OpenAir.MinSec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1661:3: ( (lv_we_7_0= ruleWE ) )
            // InternalOpenAir.g:1662:4: (lv_we_7_0= ruleWE )
            {
            // InternalOpenAir.g:1662:4: (lv_we_7_0= ruleWE )
            // InternalOpenAir.g:1663:5: lv_we_7_0= ruleWE
            {

            					newCompositeNode(grammarAccess.getPoint1Access().getWeWEEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_we_7_0=ruleWE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint1Rule());
            					}
            					set(
            						current,
            						"we",
            						lv_we_7_0,
            						"www.ubx.ch.OpenAir.WE");
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
    // $ANTLR end "rulePoint1"


    // $ANTLR start "entryRulePoint2"
    // InternalOpenAir.g:1684:1: entryRulePoint2 returns [EObject current=null] : iv_rulePoint2= rulePoint2 EOF ;
    public final EObject entryRulePoint2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint2 = null;


        try {
            // InternalOpenAir.g:1684:47: (iv_rulePoint2= rulePoint2 EOF )
            // InternalOpenAir.g:1685:2: iv_rulePoint2= rulePoint2 EOF
            {
             newCompositeNode(grammarAccess.getPoint2Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint2=rulePoint2();

            state._fsp--;

             current =iv_rulePoint2; 
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
    // $ANTLR end "entryRulePoint2"


    // $ANTLR start "rulePoint2"
    // InternalOpenAir.g:1691:1: rulePoint2 returns [EObject current=null] : ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longMf_1_0= ruleMinDec ) ) ( (lv_ns_2_0= ruleNS ) ) ( (lv_latD_3_0= ruleLatDegr ) ) ( (lv_latMf_4_0= ruleMinDec ) ) ( (lv_we_5_0= ruleWE ) ) ) ;
    public final EObject rulePoint2() throws RecognitionException {
        EObject current = null;

        EObject lv_longD_0_0 = null;

        EObject lv_longMf_1_0 = null;

        Enumerator lv_ns_2_0 = null;

        EObject lv_latD_3_0 = null;

        EObject lv_latMf_4_0 = null;

        Enumerator lv_we_5_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:1697:2: ( ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longMf_1_0= ruleMinDec ) ) ( (lv_ns_2_0= ruleNS ) ) ( (lv_latD_3_0= ruleLatDegr ) ) ( (lv_latMf_4_0= ruleMinDec ) ) ( (lv_we_5_0= ruleWE ) ) ) )
            // InternalOpenAir.g:1698:2: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longMf_1_0= ruleMinDec ) ) ( (lv_ns_2_0= ruleNS ) ) ( (lv_latD_3_0= ruleLatDegr ) ) ( (lv_latMf_4_0= ruleMinDec ) ) ( (lv_we_5_0= ruleWE ) ) )
            {
            // InternalOpenAir.g:1698:2: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longMf_1_0= ruleMinDec ) ) ( (lv_ns_2_0= ruleNS ) ) ( (lv_latD_3_0= ruleLatDegr ) ) ( (lv_latMf_4_0= ruleMinDec ) ) ( (lv_we_5_0= ruleWE ) ) )
            // InternalOpenAir.g:1699:3: ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longMf_1_0= ruleMinDec ) ) ( (lv_ns_2_0= ruleNS ) ) ( (lv_latD_3_0= ruleLatDegr ) ) ( (lv_latMf_4_0= ruleMinDec ) ) ( (lv_we_5_0= ruleWE ) )
            {
            // InternalOpenAir.g:1699:3: ( (lv_longD_0_0= ruleLongDegr ) )
            // InternalOpenAir.g:1700:4: (lv_longD_0_0= ruleLongDegr )
            {
            // InternalOpenAir.g:1700:4: (lv_longD_0_0= ruleLongDegr )
            // InternalOpenAir.g:1701:5: lv_longD_0_0= ruleLongDegr
            {

            					newCompositeNode(grammarAccess.getPoint2Access().getLongDLongDegrParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_longD_0_0=ruleLongDegr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint2Rule());
            					}
            					set(
            						current,
            						"longD",
            						lv_longD_0_0,
            						"www.ubx.ch.OpenAir.LongDegr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1718:3: ( (lv_longMf_1_0= ruleMinDec ) )
            // InternalOpenAir.g:1719:4: (lv_longMf_1_0= ruleMinDec )
            {
            // InternalOpenAir.g:1719:4: (lv_longMf_1_0= ruleMinDec )
            // InternalOpenAir.g:1720:5: lv_longMf_1_0= ruleMinDec
            {

            					newCompositeNode(grammarAccess.getPoint2Access().getLongMfMinDecParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_longMf_1_0=ruleMinDec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint2Rule());
            					}
            					set(
            						current,
            						"longMf",
            						lv_longMf_1_0,
            						"www.ubx.ch.OpenAir.MinDec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1737:3: ( (lv_ns_2_0= ruleNS ) )
            // InternalOpenAir.g:1738:4: (lv_ns_2_0= ruleNS )
            {
            // InternalOpenAir.g:1738:4: (lv_ns_2_0= ruleNS )
            // InternalOpenAir.g:1739:5: lv_ns_2_0= ruleNS
            {

            					newCompositeNode(grammarAccess.getPoint2Access().getNsNSEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_ns_2_0=ruleNS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint2Rule());
            					}
            					set(
            						current,
            						"ns",
            						lv_ns_2_0,
            						"www.ubx.ch.OpenAir.NS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1756:3: ( (lv_latD_3_0= ruleLatDegr ) )
            // InternalOpenAir.g:1757:4: (lv_latD_3_0= ruleLatDegr )
            {
            // InternalOpenAir.g:1757:4: (lv_latD_3_0= ruleLatDegr )
            // InternalOpenAir.g:1758:5: lv_latD_3_0= ruleLatDegr
            {

            					newCompositeNode(grammarAccess.getPoint2Access().getLatDLatDegrParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_latD_3_0=ruleLatDegr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint2Rule());
            					}
            					set(
            						current,
            						"latD",
            						lv_latD_3_0,
            						"www.ubx.ch.OpenAir.LatDegr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1775:3: ( (lv_latMf_4_0= ruleMinDec ) )
            // InternalOpenAir.g:1776:4: (lv_latMf_4_0= ruleMinDec )
            {
            // InternalOpenAir.g:1776:4: (lv_latMf_4_0= ruleMinDec )
            // InternalOpenAir.g:1777:5: lv_latMf_4_0= ruleMinDec
            {

            					newCompositeNode(grammarAccess.getPoint2Access().getLatMfMinDecParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_latMf_4_0=ruleMinDec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint2Rule());
            					}
            					set(
            						current,
            						"latMf",
            						lv_latMf_4_0,
            						"www.ubx.ch.OpenAir.MinDec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1794:3: ( (lv_we_5_0= ruleWE ) )
            // InternalOpenAir.g:1795:4: (lv_we_5_0= ruleWE )
            {
            // InternalOpenAir.g:1795:4: (lv_we_5_0= ruleWE )
            // InternalOpenAir.g:1796:5: lv_we_5_0= ruleWE
            {

            					newCompositeNode(grammarAccess.getPoint2Access().getWeWEEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_we_5_0=ruleWE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint2Rule());
            					}
            					set(
            						current,
            						"we",
            						lv_we_5_0,
            						"www.ubx.ch.OpenAir.WE");
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
    // $ANTLR end "rulePoint2"


    // $ANTLR start "entryRulePoint3"
    // InternalOpenAir.g:1817:1: entryRulePoint3 returns [EObject current=null] : iv_rulePoint3= rulePoint3 EOF ;
    public final EObject entryRulePoint3() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint3 = null;


        try {
            // InternalOpenAir.g:1817:47: (iv_rulePoint3= rulePoint3 EOF )
            // InternalOpenAir.g:1818:2: iv_rulePoint3= rulePoint3 EOF
            {
             newCompositeNode(grammarAccess.getPoint3Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint3=rulePoint3();

            state._fsp--;

             current =iv_rulePoint3; 
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
    // $ANTLR end "entryRulePoint3"


    // $ANTLR start "rulePoint3"
    // InternalOpenAir.g:1824:1: rulePoint3 returns [EObject current=null] : ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleSecDec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleSecDec ) ) ( (lv_we_7_0= ruleWE ) ) ) ;
    public final EObject rulePoint3() throws RecognitionException {
        EObject current = null;

        EObject lv_longD_0_0 = null;

        EObject lv_longM_1_0 = null;

        EObject lv_longS_2_0 = null;

        Enumerator lv_ns_3_0 = null;

        EObject lv_latD_4_0 = null;

        EObject lv_latM_5_0 = null;

        EObject lv_latS_6_0 = null;

        Enumerator lv_we_7_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:1830:2: ( ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleSecDec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleSecDec ) ) ( (lv_we_7_0= ruleWE ) ) ) )
            // InternalOpenAir.g:1831:2: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleSecDec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleSecDec ) ) ( (lv_we_7_0= ruleWE ) ) )
            {
            // InternalOpenAir.g:1831:2: ( ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleSecDec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleSecDec ) ) ( (lv_we_7_0= ruleWE ) ) )
            // InternalOpenAir.g:1832:3: ( (lv_longD_0_0= ruleLongDegr ) ) ( (lv_longM_1_0= ruleMinSec ) ) ( (lv_longS_2_0= ruleSecDec ) ) ( (lv_ns_3_0= ruleNS ) ) ( (lv_latD_4_0= ruleLatDegr ) ) ( (lv_latM_5_0= ruleMinSec ) ) ( (lv_latS_6_0= ruleSecDec ) ) ( (lv_we_7_0= ruleWE ) )
            {
            // InternalOpenAir.g:1832:3: ( (lv_longD_0_0= ruleLongDegr ) )
            // InternalOpenAir.g:1833:4: (lv_longD_0_0= ruleLongDegr )
            {
            // InternalOpenAir.g:1833:4: (lv_longD_0_0= ruleLongDegr )
            // InternalOpenAir.g:1834:5: lv_longD_0_0= ruleLongDegr
            {

            					newCompositeNode(grammarAccess.getPoint3Access().getLongDLongDegrParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_longD_0_0=ruleLongDegr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint3Rule());
            					}
            					set(
            						current,
            						"longD",
            						lv_longD_0_0,
            						"www.ubx.ch.OpenAir.LongDegr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1851:3: ( (lv_longM_1_0= ruleMinSec ) )
            // InternalOpenAir.g:1852:4: (lv_longM_1_0= ruleMinSec )
            {
            // InternalOpenAir.g:1852:4: (lv_longM_1_0= ruleMinSec )
            // InternalOpenAir.g:1853:5: lv_longM_1_0= ruleMinSec
            {

            					newCompositeNode(grammarAccess.getPoint3Access().getLongMMinSecParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_longM_1_0=ruleMinSec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint3Rule());
            					}
            					set(
            						current,
            						"longM",
            						lv_longM_1_0,
            						"www.ubx.ch.OpenAir.MinSec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1870:3: ( (lv_longS_2_0= ruleSecDec ) )
            // InternalOpenAir.g:1871:4: (lv_longS_2_0= ruleSecDec )
            {
            // InternalOpenAir.g:1871:4: (lv_longS_2_0= ruleSecDec )
            // InternalOpenAir.g:1872:5: lv_longS_2_0= ruleSecDec
            {

            					newCompositeNode(grammarAccess.getPoint3Access().getLongSSecDecParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_longS_2_0=ruleSecDec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint3Rule());
            					}
            					set(
            						current,
            						"longS",
            						lv_longS_2_0,
            						"www.ubx.ch.OpenAir.SecDec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1889:3: ( (lv_ns_3_0= ruleNS ) )
            // InternalOpenAir.g:1890:4: (lv_ns_3_0= ruleNS )
            {
            // InternalOpenAir.g:1890:4: (lv_ns_3_0= ruleNS )
            // InternalOpenAir.g:1891:5: lv_ns_3_0= ruleNS
            {

            					newCompositeNode(grammarAccess.getPoint3Access().getNsNSEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_ns_3_0=ruleNS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint3Rule());
            					}
            					set(
            						current,
            						"ns",
            						lv_ns_3_0,
            						"www.ubx.ch.OpenAir.NS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1908:3: ( (lv_latD_4_0= ruleLatDegr ) )
            // InternalOpenAir.g:1909:4: (lv_latD_4_0= ruleLatDegr )
            {
            // InternalOpenAir.g:1909:4: (lv_latD_4_0= ruleLatDegr )
            // InternalOpenAir.g:1910:5: lv_latD_4_0= ruleLatDegr
            {

            					newCompositeNode(grammarAccess.getPoint3Access().getLatDLatDegrParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_latD_4_0=ruleLatDegr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint3Rule());
            					}
            					set(
            						current,
            						"latD",
            						lv_latD_4_0,
            						"www.ubx.ch.OpenAir.LatDegr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1927:3: ( (lv_latM_5_0= ruleMinSec ) )
            // InternalOpenAir.g:1928:4: (lv_latM_5_0= ruleMinSec )
            {
            // InternalOpenAir.g:1928:4: (lv_latM_5_0= ruleMinSec )
            // InternalOpenAir.g:1929:5: lv_latM_5_0= ruleMinSec
            {

            					newCompositeNode(grammarAccess.getPoint3Access().getLatMMinSecParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_latM_5_0=ruleMinSec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint3Rule());
            					}
            					set(
            						current,
            						"latM",
            						lv_latM_5_0,
            						"www.ubx.ch.OpenAir.MinSec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1946:3: ( (lv_latS_6_0= ruleSecDec ) )
            // InternalOpenAir.g:1947:4: (lv_latS_6_0= ruleSecDec )
            {
            // InternalOpenAir.g:1947:4: (lv_latS_6_0= ruleSecDec )
            // InternalOpenAir.g:1948:5: lv_latS_6_0= ruleSecDec
            {

            					newCompositeNode(grammarAccess.getPoint3Access().getLatSSecDecParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
            lv_latS_6_0=ruleSecDec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint3Rule());
            					}
            					set(
            						current,
            						"latS",
            						lv_latS_6_0,
            						"www.ubx.ch.OpenAir.SecDec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:1965:3: ( (lv_we_7_0= ruleWE ) )
            // InternalOpenAir.g:1966:4: (lv_we_7_0= ruleWE )
            {
            // InternalOpenAir.g:1966:4: (lv_we_7_0= ruleWE )
            // InternalOpenAir.g:1967:5: lv_we_7_0= ruleWE
            {

            					newCompositeNode(grammarAccess.getPoint3Access().getWeWEEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_we_7_0=ruleWE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint3Rule());
            					}
            					set(
            						current,
            						"we",
            						lv_we_7_0,
            						"www.ubx.ch.OpenAir.WE");
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
    // $ANTLR end "rulePoint3"


    // $ANTLR start "entryRulePoint4"
    // InternalOpenAir.g:1988:1: entryRulePoint4 returns [EObject current=null] : iv_rulePoint4= rulePoint4 EOF ;
    public final EObject entryRulePoint4() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint4 = null;


        try {
            // InternalOpenAir.g:1988:47: (iv_rulePoint4= rulePoint4 EOF )
            // InternalOpenAir.g:1989:2: iv_rulePoint4= rulePoint4 EOF
            {
             newCompositeNode(grammarAccess.getPoint4Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint4=rulePoint4();

            state._fsp--;

             current =iv_rulePoint4; 
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
    // $ANTLR end "entryRulePoint4"


    // $ANTLR start "rulePoint4"
    // InternalOpenAir.g:1995:1: rulePoint4 returns [EObject current=null] : ( ( (lv_longD_0_0= ruleLongDec ) ) ( (lv_ns_1_0= ruleNS ) ) ( (lv_latD_2_0= ruleLatDec ) ) ( (lv_we_3_0= ruleWE ) ) ) ;
    public final EObject rulePoint4() throws RecognitionException {
        EObject current = null;

        EObject lv_longD_0_0 = null;

        Enumerator lv_ns_1_0 = null;

        EObject lv_latD_2_0 = null;

        Enumerator lv_we_3_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:2001:2: ( ( ( (lv_longD_0_0= ruleLongDec ) ) ( (lv_ns_1_0= ruleNS ) ) ( (lv_latD_2_0= ruleLatDec ) ) ( (lv_we_3_0= ruleWE ) ) ) )
            // InternalOpenAir.g:2002:2: ( ( (lv_longD_0_0= ruleLongDec ) ) ( (lv_ns_1_0= ruleNS ) ) ( (lv_latD_2_0= ruleLatDec ) ) ( (lv_we_3_0= ruleWE ) ) )
            {
            // InternalOpenAir.g:2002:2: ( ( (lv_longD_0_0= ruleLongDec ) ) ( (lv_ns_1_0= ruleNS ) ) ( (lv_latD_2_0= ruleLatDec ) ) ( (lv_we_3_0= ruleWE ) ) )
            // InternalOpenAir.g:2003:3: ( (lv_longD_0_0= ruleLongDec ) ) ( (lv_ns_1_0= ruleNS ) ) ( (lv_latD_2_0= ruleLatDec ) ) ( (lv_we_3_0= ruleWE ) )
            {
            // InternalOpenAir.g:2003:3: ( (lv_longD_0_0= ruleLongDec ) )
            // InternalOpenAir.g:2004:4: (lv_longD_0_0= ruleLongDec )
            {
            // InternalOpenAir.g:2004:4: (lv_longD_0_0= ruleLongDec )
            // InternalOpenAir.g:2005:5: lv_longD_0_0= ruleLongDec
            {

            					newCompositeNode(grammarAccess.getPoint4Access().getLongDLongDecParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_longD_0_0=ruleLongDec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint4Rule());
            					}
            					set(
            						current,
            						"longD",
            						lv_longD_0_0,
            						"www.ubx.ch.OpenAir.LongDec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:2022:3: ( (lv_ns_1_0= ruleNS ) )
            // InternalOpenAir.g:2023:4: (lv_ns_1_0= ruleNS )
            {
            // InternalOpenAir.g:2023:4: (lv_ns_1_0= ruleNS )
            // InternalOpenAir.g:2024:5: lv_ns_1_0= ruleNS
            {

            					newCompositeNode(grammarAccess.getPoint4Access().getNsNSEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_ns_1_0=ruleNS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint4Rule());
            					}
            					set(
            						current,
            						"ns",
            						lv_ns_1_0,
            						"www.ubx.ch.OpenAir.NS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:2041:3: ( (lv_latD_2_0= ruleLatDec ) )
            // InternalOpenAir.g:2042:4: (lv_latD_2_0= ruleLatDec )
            {
            // InternalOpenAir.g:2042:4: (lv_latD_2_0= ruleLatDec )
            // InternalOpenAir.g:2043:5: lv_latD_2_0= ruleLatDec
            {

            					newCompositeNode(grammarAccess.getPoint4Access().getLatDLatDecParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_latD_2_0=ruleLatDec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint4Rule());
            					}
            					set(
            						current,
            						"latD",
            						lv_latD_2_0,
            						"www.ubx.ch.OpenAir.LatDec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:2060:3: ( (lv_we_3_0= ruleWE ) )
            // InternalOpenAir.g:2061:4: (lv_we_3_0= ruleWE )
            {
            // InternalOpenAir.g:2061:4: (lv_we_3_0= ruleWE )
            // InternalOpenAir.g:2062:5: lv_we_3_0= ruleWE
            {

            					newCompositeNode(grammarAccess.getPoint4Access().getWeWEEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_we_3_0=ruleWE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoint4Rule());
            					}
            					set(
            						current,
            						"we",
            						lv_we_3_0,
            						"www.ubx.ch.OpenAir.WE");
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
    // $ANTLR end "rulePoint4"


    // $ANTLR start "entryRuleLongDegr"
    // InternalOpenAir.g:2083:1: entryRuleLongDegr returns [EObject current=null] : iv_ruleLongDegr= ruleLongDegr EOF ;
    public final EObject entryRuleLongDegr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongDegr = null;


        try {
            // InternalOpenAir.g:2083:49: (iv_ruleLongDegr= ruleLongDegr EOF )
            // InternalOpenAir.g:2084:2: iv_ruleLongDegr= ruleLongDegr EOF
            {
             newCompositeNode(grammarAccess.getLongDegrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLongDegr=ruleLongDegr();

            state._fsp--;

             current =iv_ruleLongDegr; 
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
    // $ANTLR end "entryRuleLongDegr"


    // $ANTLR start "ruleLongDegr"
    // InternalOpenAir.g:2090:1: ruleLongDegr returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleLongDegr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOpenAir.g:2096:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalOpenAir.g:2097:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalOpenAir.g:2097:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalOpenAir.g:2098:3: (lv_value_0_0= RULE_INT )
            {
            // InternalOpenAir.g:2098:3: (lv_value_0_0= RULE_INT )
            // InternalOpenAir.g:2099:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getLongDegrAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLongDegrRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"www.ubx.ch.OpenAir.INT");
            			

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
    // $ANTLR end "ruleLongDegr"


    // $ANTLR start "entryRuleLatDegr"
    // InternalOpenAir.g:2118:1: entryRuleLatDegr returns [EObject current=null] : iv_ruleLatDegr= ruleLatDegr EOF ;
    public final EObject entryRuleLatDegr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLatDegr = null;


        try {
            // InternalOpenAir.g:2118:48: (iv_ruleLatDegr= ruleLatDegr EOF )
            // InternalOpenAir.g:2119:2: iv_ruleLatDegr= ruleLatDegr EOF
            {
             newCompositeNode(grammarAccess.getLatDegrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLatDegr=ruleLatDegr();

            state._fsp--;

             current =iv_ruleLatDegr; 
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
    // $ANTLR end "entryRuleLatDegr"


    // $ANTLR start "ruleLatDegr"
    // InternalOpenAir.g:2125:1: ruleLatDegr returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleLatDegr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOpenAir.g:2131:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalOpenAir.g:2132:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalOpenAir.g:2132:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalOpenAir.g:2133:3: (lv_value_0_0= RULE_INT )
            {
            // InternalOpenAir.g:2133:3: (lv_value_0_0= RULE_INT )
            // InternalOpenAir.g:2134:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getLatDegrAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLatDegrRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"www.ubx.ch.OpenAir.INT");
            			

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
    // $ANTLR end "ruleLatDegr"


    // $ANTLR start "entryRuleMinSec"
    // InternalOpenAir.g:2153:1: entryRuleMinSec returns [EObject current=null] : iv_ruleMinSec= ruleMinSec EOF ;
    public final EObject entryRuleMinSec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinSec = null;


        try {
            // InternalOpenAir.g:2153:47: (iv_ruleMinSec= ruleMinSec EOF )
            // InternalOpenAir.g:2154:2: iv_ruleMinSec= ruleMinSec EOF
            {
             newCompositeNode(grammarAccess.getMinSecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinSec=ruleMinSec();

            state._fsp--;

             current =iv_ruleMinSec; 
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
    // $ANTLR end "entryRuleMinSec"


    // $ANTLR start "ruleMinSec"
    // InternalOpenAir.g:2160:1: ruleMinSec returns [EObject current=null] : ( ruleSep ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleMinSec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalOpenAir.g:2166:2: ( ( ruleSep ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalOpenAir.g:2167:2: ( ruleSep ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalOpenAir.g:2167:2: ( ruleSep ( (lv_value_1_0= RULE_INT ) ) )
            // InternalOpenAir.g:2168:3: ruleSep ( (lv_value_1_0= RULE_INT ) )
            {

            			newCompositeNode(grammarAccess.getMinSecAccess().getSepParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            ruleSep();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalOpenAir.g:2175:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalOpenAir.g:2176:4: (lv_value_1_0= RULE_INT )
            {
            // InternalOpenAir.g:2176:4: (lv_value_1_0= RULE_INT )
            // InternalOpenAir.g:2177:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getMinSecAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinSecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"www.ubx.ch.OpenAir.INT");
            				

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
    // $ANTLR end "ruleMinSec"


    // $ANTLR start "entryRuleSecDec"
    // InternalOpenAir.g:2197:1: entryRuleSecDec returns [EObject current=null] : iv_ruleSecDec= ruleSecDec EOF ;
    public final EObject entryRuleSecDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecDec = null;


        try {
            // InternalOpenAir.g:2197:47: (iv_ruleSecDec= ruleSecDec EOF )
            // InternalOpenAir.g:2198:2: iv_ruleSecDec= ruleSecDec EOF
            {
             newCompositeNode(grammarAccess.getSecDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecDec=ruleSecDec();

            state._fsp--;

             current =iv_ruleSecDec; 
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
    // $ANTLR end "entryRuleSecDec"


    // $ANTLR start "ruleSecDec"
    // InternalOpenAir.g:2204:1: ruleSecDec returns [EObject current=null] : ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleSecDec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalOpenAir.g:2210:2: ( ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) ) )
            // InternalOpenAir.g:2211:2: ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // InternalOpenAir.g:2211:2: ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) )
            // InternalOpenAir.g:2212:3: ruleSep ( (lv_value_1_0= RULE_REAL ) )
            {

            			newCompositeNode(grammarAccess.getSecDecAccess().getSepParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            ruleSep();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalOpenAir.g:2219:3: ( (lv_value_1_0= RULE_REAL ) )
            // InternalOpenAir.g:2220:4: (lv_value_1_0= RULE_REAL )
            {
            // InternalOpenAir.g:2220:4: (lv_value_1_0= RULE_REAL )
            // InternalOpenAir.g:2221:5: lv_value_1_0= RULE_REAL
            {
            lv_value_1_0=(Token)match(input,RULE_REAL,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getSecDecAccess().getValueREALTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSecDecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"www.ubx.ch.OpenAir.REAL");
            				

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
    // $ANTLR end "ruleSecDec"


    // $ANTLR start "entryRuleMinDec"
    // InternalOpenAir.g:2241:1: entryRuleMinDec returns [EObject current=null] : iv_ruleMinDec= ruleMinDec EOF ;
    public final EObject entryRuleMinDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinDec = null;


        try {
            // InternalOpenAir.g:2241:47: (iv_ruleMinDec= ruleMinDec EOF )
            // InternalOpenAir.g:2242:2: iv_ruleMinDec= ruleMinDec EOF
            {
             newCompositeNode(grammarAccess.getMinDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinDec=ruleMinDec();

            state._fsp--;

             current =iv_ruleMinDec; 
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
    // $ANTLR end "entryRuleMinDec"


    // $ANTLR start "ruleMinDec"
    // InternalOpenAir.g:2248:1: ruleMinDec returns [EObject current=null] : ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleMinDec() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalOpenAir.g:2254:2: ( ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) ) )
            // InternalOpenAir.g:2255:2: ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // InternalOpenAir.g:2255:2: ( ruleSep ( (lv_value_1_0= RULE_REAL ) ) )
            // InternalOpenAir.g:2256:3: ruleSep ( (lv_value_1_0= RULE_REAL ) )
            {

            			newCompositeNode(grammarAccess.getMinDecAccess().getSepParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            ruleSep();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalOpenAir.g:2263:3: ( (lv_value_1_0= RULE_REAL ) )
            // InternalOpenAir.g:2264:4: (lv_value_1_0= RULE_REAL )
            {
            // InternalOpenAir.g:2264:4: (lv_value_1_0= RULE_REAL )
            // InternalOpenAir.g:2265:5: lv_value_1_0= RULE_REAL
            {
            lv_value_1_0=(Token)match(input,RULE_REAL,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getMinDecAccess().getValueREALTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinDecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"www.ubx.ch.OpenAir.REAL");
            				

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
    // $ANTLR end "ruleMinDec"


    // $ANTLR start "entryRuleLongDec"
    // InternalOpenAir.g:2285:1: entryRuleLongDec returns [EObject current=null] : iv_ruleLongDec= ruleLongDec EOF ;
    public final EObject entryRuleLongDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongDec = null;


        try {
            // InternalOpenAir.g:2285:48: (iv_ruleLongDec= ruleLongDec EOF )
            // InternalOpenAir.g:2286:2: iv_ruleLongDec= ruleLongDec EOF
            {
             newCompositeNode(grammarAccess.getLongDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLongDec=ruleLongDec();

            state._fsp--;

             current =iv_ruleLongDec; 
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
    // $ANTLR end "entryRuleLongDec"


    // $ANTLR start "ruleLongDec"
    // InternalOpenAir.g:2292:1: ruleLongDec returns [EObject current=null] : ( (lv_value_0_0= RULE_REAL ) ) ;
    public final EObject ruleLongDec() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOpenAir.g:2298:2: ( ( (lv_value_0_0= RULE_REAL ) ) )
            // InternalOpenAir.g:2299:2: ( (lv_value_0_0= RULE_REAL ) )
            {
            // InternalOpenAir.g:2299:2: ( (lv_value_0_0= RULE_REAL ) )
            // InternalOpenAir.g:2300:3: (lv_value_0_0= RULE_REAL )
            {
            // InternalOpenAir.g:2300:3: (lv_value_0_0= RULE_REAL )
            // InternalOpenAir.g:2301:4: lv_value_0_0= RULE_REAL
            {
            lv_value_0_0=(Token)match(input,RULE_REAL,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getLongDecAccess().getValueREALTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLongDecRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"www.ubx.ch.OpenAir.REAL");
            			

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
    // $ANTLR end "ruleLongDec"


    // $ANTLR start "entryRuleLatDec"
    // InternalOpenAir.g:2320:1: entryRuleLatDec returns [EObject current=null] : iv_ruleLatDec= ruleLatDec EOF ;
    public final EObject entryRuleLatDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLatDec = null;


        try {
            // InternalOpenAir.g:2320:47: (iv_ruleLatDec= ruleLatDec EOF )
            // InternalOpenAir.g:2321:2: iv_ruleLatDec= ruleLatDec EOF
            {
             newCompositeNode(grammarAccess.getLatDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLatDec=ruleLatDec();

            state._fsp--;

             current =iv_ruleLatDec; 
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
    // $ANTLR end "entryRuleLatDec"


    // $ANTLR start "ruleLatDec"
    // InternalOpenAir.g:2327:1: ruleLatDec returns [EObject current=null] : ( (lv_value_0_0= RULE_REAL ) ) ;
    public final EObject ruleLatDec() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOpenAir.g:2333:2: ( ( (lv_value_0_0= RULE_REAL ) ) )
            // InternalOpenAir.g:2334:2: ( (lv_value_0_0= RULE_REAL ) )
            {
            // InternalOpenAir.g:2334:2: ( (lv_value_0_0= RULE_REAL ) )
            // InternalOpenAir.g:2335:3: (lv_value_0_0= RULE_REAL )
            {
            // InternalOpenAir.g:2335:3: (lv_value_0_0= RULE_REAL )
            // InternalOpenAir.g:2336:4: lv_value_0_0= RULE_REAL
            {
            lv_value_0_0=(Token)match(input,RULE_REAL,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getLatDecAccess().getValueREALTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLatDecRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"www.ubx.ch.OpenAir.REAL");
            			

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
    // $ANTLR end "ruleLatDec"


    // $ANTLR start "entryRuleSep"
    // InternalOpenAir.g:2355:1: entryRuleSep returns [String current=null] : iv_ruleSep= ruleSep EOF ;
    public final String entryRuleSep() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSep = null;


        try {
            // InternalOpenAir.g:2355:43: (iv_ruleSep= ruleSep EOF )
            // InternalOpenAir.g:2356:2: iv_ruleSep= ruleSep EOF
            {
             newCompositeNode(grammarAccess.getSepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSep=ruleSep();

            state._fsp--;

             current =iv_ruleSep.getText(); 
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
    // $ANTLR end "entryRuleSep"


    // $ANTLR start "ruleSep"
    // InternalOpenAir.g:2362:1: ruleSep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':' ;
    public final AntlrDatatypeRuleToken ruleSep() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOpenAir.g:2368:2: (kw= ':' )
            // InternalOpenAir.g:2369:2: kw= ':'
            {
            kw=(Token)match(input,30,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSepAccess().getColonKeyword());
            	

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
    // $ANTLR end "ruleSep"


    // $ANTLR start "entryRuleDA"
    // InternalOpenAir.g:2377:1: entryRuleDA returns [EObject current=null] : iv_ruleDA= ruleDA EOF ;
    public final EObject entryRuleDA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDA = null;


        try {
            // InternalOpenAir.g:2377:43: (iv_ruleDA= ruleDA EOF )
            // InternalOpenAir.g:2378:2: iv_ruleDA= ruleDA EOF
            {
             newCompositeNode(grammarAccess.getDARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDA=ruleDA();

            state._fsp--;

             current =iv_ruleDA; 
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
    // $ANTLR end "entryRuleDA"


    // $ANTLR start "ruleDA"
    // InternalOpenAir.g:2384:1: ruleDA returns [EObject current=null] : (otherlv_0= 'DA' ( (lv_da_1_0= ruleDaParams ) ) ) ;
    public final EObject ruleDA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_da_1_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:2390:2: ( (otherlv_0= 'DA' ( (lv_da_1_0= ruleDaParams ) ) ) )
            // InternalOpenAir.g:2391:2: (otherlv_0= 'DA' ( (lv_da_1_0= ruleDaParams ) ) )
            {
            // InternalOpenAir.g:2391:2: (otherlv_0= 'DA' ( (lv_da_1_0= ruleDaParams ) ) )
            // InternalOpenAir.g:2392:3: otherlv_0= 'DA' ( (lv_da_1_0= ruleDaParams ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDAAccess().getDAKeyword_0());
            		
            // InternalOpenAir.g:2396:3: ( (lv_da_1_0= ruleDaParams ) )
            // InternalOpenAir.g:2397:4: (lv_da_1_0= ruleDaParams )
            {
            // InternalOpenAir.g:2397:4: (lv_da_1_0= ruleDaParams )
            // InternalOpenAir.g:2398:5: lv_da_1_0= ruleDaParams
            {

            					newCompositeNode(grammarAccess.getDAAccess().getDaDaParamsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_da_1_0=ruleDaParams();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDARule());
            					}
            					set(
            						current,
            						"da",
            						lv_da_1_0,
            						"www.ubx.ch.OpenAir.DaParams");
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
    // $ANTLR end "ruleDA"


    // $ANTLR start "entryRuleDaParams"
    // InternalOpenAir.g:2419:1: entryRuleDaParams returns [EObject current=null] : iv_ruleDaParams= ruleDaParams EOF ;
    public final EObject entryRuleDaParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDaParams = null;


        try {
            // InternalOpenAir.g:2419:49: (iv_ruleDaParams= ruleDaParams EOF )
            // InternalOpenAir.g:2420:2: iv_ruleDaParams= ruleDaParams EOF
            {
             newCompositeNode(grammarAccess.getDaParamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDaParams=ruleDaParams();

            state._fsp--;

             current =iv_ruleDaParams; 
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
    // $ANTLR end "entryRuleDaParams"


    // $ANTLR start "ruleDaParams"
    // InternalOpenAir.g:2426:1: ruleDaParams returns [EObject current=null] : (this_DaParams1_0= ruleDaParams1 | this_DaParams2_1= ruleDaParams2 ) ;
    public final EObject ruleDaParams() throws RecognitionException {
        EObject current = null;

        EObject this_DaParams1_0 = null;

        EObject this_DaParams2_1 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:2432:2: ( (this_DaParams1_0= ruleDaParams1 | this_DaParams2_1= ruleDaParams2 ) )
            // InternalOpenAir.g:2433:2: (this_DaParams1_0= ruleDaParams1 | this_DaParams2_1= ruleDaParams2 )
            {
            // InternalOpenAir.g:2433:2: (this_DaParams1_0= ruleDaParams1 | this_DaParams2_1= ruleDaParams2 )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_REAL) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_INT) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalOpenAir.g:2434:3: this_DaParams1_0= ruleDaParams1
                    {

                    			newCompositeNode(grammarAccess.getDaParamsAccess().getDaParams1ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DaParams1_0=ruleDaParams1();

                    state._fsp--;


                    			current = this_DaParams1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOpenAir.g:2443:3: this_DaParams2_1= ruleDaParams2
                    {

                    			newCompositeNode(grammarAccess.getDaParamsAccess().getDaParams2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DaParams2_1=ruleDaParams2();

                    state._fsp--;


                    			current = this_DaParams2_1;
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
    // $ANTLR end "ruleDaParams"


    // $ANTLR start "entryRuleDaParams1"
    // InternalOpenAir.g:2455:1: entryRuleDaParams1 returns [EObject current=null] : iv_ruleDaParams1= ruleDaParams1 EOF ;
    public final EObject entryRuleDaParams1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDaParams1 = null;


        try {
            // InternalOpenAir.g:2455:50: (iv_ruleDaParams1= ruleDaParams1 EOF )
            // InternalOpenAir.g:2456:2: iv_ruleDaParams1= ruleDaParams1 EOF
            {
             newCompositeNode(grammarAccess.getDaParams1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDaParams1=ruleDaParams1();

            state._fsp--;

             current =iv_ruleDaParams1; 
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
    // $ANTLR end "entryRuleDaParams1"


    // $ANTLR start "ruleDaParams1"
    // InternalOpenAir.g:2462:1: ruleDaParams1 returns [EObject current=null] : ( ( (lv_radius_0_0= RULE_REAL ) ) otherlv_1= ',' ( (lv_angleStart_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_angleEnd_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDaParams1() throws RecognitionException {
        EObject current = null;

        Token lv_radius_0_0=null;
        Token otherlv_1=null;
        Token lv_angleStart_2_0=null;
        Token otherlv_3=null;
        Token lv_angleEnd_4_0=null;


        	enterRule();

        try {
            // InternalOpenAir.g:2468:2: ( ( ( (lv_radius_0_0= RULE_REAL ) ) otherlv_1= ',' ( (lv_angleStart_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_angleEnd_4_0= RULE_INT ) ) ) )
            // InternalOpenAir.g:2469:2: ( ( (lv_radius_0_0= RULE_REAL ) ) otherlv_1= ',' ( (lv_angleStart_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_angleEnd_4_0= RULE_INT ) ) )
            {
            // InternalOpenAir.g:2469:2: ( ( (lv_radius_0_0= RULE_REAL ) ) otherlv_1= ',' ( (lv_angleStart_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_angleEnd_4_0= RULE_INT ) ) )
            // InternalOpenAir.g:2470:3: ( (lv_radius_0_0= RULE_REAL ) ) otherlv_1= ',' ( (lv_angleStart_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_angleEnd_4_0= RULE_INT ) )
            {
            // InternalOpenAir.g:2470:3: ( (lv_radius_0_0= RULE_REAL ) )
            // InternalOpenAir.g:2471:4: (lv_radius_0_0= RULE_REAL )
            {
            // InternalOpenAir.g:2471:4: (lv_radius_0_0= RULE_REAL )
            // InternalOpenAir.g:2472:5: lv_radius_0_0= RULE_REAL
            {
            lv_radius_0_0=(Token)match(input,RULE_REAL,FOLLOW_10); 

            					newLeafNode(lv_radius_0_0, grammarAccess.getDaParams1Access().getRadiusREALTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDaParams1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"radius",
            						lv_radius_0_0,
            						"www.ubx.ch.OpenAir.REAL");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDaParams1Access().getCommaKeyword_1());
            		
            // InternalOpenAir.g:2492:3: ( (lv_angleStart_2_0= RULE_INT ) )
            // InternalOpenAir.g:2493:4: (lv_angleStart_2_0= RULE_INT )
            {
            // InternalOpenAir.g:2493:4: (lv_angleStart_2_0= RULE_INT )
            // InternalOpenAir.g:2494:5: lv_angleStart_2_0= RULE_INT
            {
            lv_angleStart_2_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_angleStart_2_0, grammarAccess.getDaParams1Access().getAngleStartINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDaParams1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"angleStart",
            						lv_angleStart_2_0,
            						"www.ubx.ch.OpenAir.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDaParams1Access().getCommaKeyword_3());
            		
            // InternalOpenAir.g:2514:3: ( (lv_angleEnd_4_0= RULE_INT ) )
            // InternalOpenAir.g:2515:4: (lv_angleEnd_4_0= RULE_INT )
            {
            // InternalOpenAir.g:2515:4: (lv_angleEnd_4_0= RULE_INT )
            // InternalOpenAir.g:2516:5: lv_angleEnd_4_0= RULE_INT
            {
            lv_angleEnd_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_angleEnd_4_0, grammarAccess.getDaParams1Access().getAngleEndINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDaParams1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"angleEnd",
            						lv_angleEnd_4_0,
            						"www.ubx.ch.OpenAir.INT");
            				

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
    // $ANTLR end "ruleDaParams1"


    // $ANTLR start "entryRuleDaParams2"
    // InternalOpenAir.g:2536:1: entryRuleDaParams2 returns [EObject current=null] : iv_ruleDaParams2= ruleDaParams2 EOF ;
    public final EObject entryRuleDaParams2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDaParams2 = null;


        try {
            // InternalOpenAir.g:2536:50: (iv_ruleDaParams2= ruleDaParams2 EOF )
            // InternalOpenAir.g:2537:2: iv_ruleDaParams2= ruleDaParams2 EOF
            {
             newCompositeNode(grammarAccess.getDaParams2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDaParams2=ruleDaParams2();

            state._fsp--;

             current =iv_ruleDaParams2; 
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
    // $ANTLR end "entryRuleDaParams2"


    // $ANTLR start "ruleDaParams2"
    // InternalOpenAir.g:2543:1: ruleDaParams2 returns [EObject current=null] : ( ( (lv_radius_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_angleStart_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_angleEnd_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDaParams2() throws RecognitionException {
        EObject current = null;

        Token lv_radius_0_0=null;
        Token otherlv_1=null;
        Token lv_angleStart_2_0=null;
        Token otherlv_3=null;
        Token lv_angleEnd_4_0=null;


        	enterRule();

        try {
            // InternalOpenAir.g:2549:2: ( ( ( (lv_radius_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_angleStart_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_angleEnd_4_0= RULE_INT ) ) ) )
            // InternalOpenAir.g:2550:2: ( ( (lv_radius_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_angleStart_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_angleEnd_4_0= RULE_INT ) ) )
            {
            // InternalOpenAir.g:2550:2: ( ( (lv_radius_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_angleStart_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_angleEnd_4_0= RULE_INT ) ) )
            // InternalOpenAir.g:2551:3: ( (lv_radius_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_angleStart_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_angleEnd_4_0= RULE_INT ) )
            {
            // InternalOpenAir.g:2551:3: ( (lv_radius_0_0= RULE_INT ) )
            // InternalOpenAir.g:2552:4: (lv_radius_0_0= RULE_INT )
            {
            // InternalOpenAir.g:2552:4: (lv_radius_0_0= RULE_INT )
            // InternalOpenAir.g:2553:5: lv_radius_0_0= RULE_INT
            {
            lv_radius_0_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_radius_0_0, grammarAccess.getDaParams2Access().getRadiusINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDaParams2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"radius",
            						lv_radius_0_0,
            						"www.ubx.ch.OpenAir.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDaParams2Access().getCommaKeyword_1());
            		
            // InternalOpenAir.g:2573:3: ( (lv_angleStart_2_0= RULE_INT ) )
            // InternalOpenAir.g:2574:4: (lv_angleStart_2_0= RULE_INT )
            {
            // InternalOpenAir.g:2574:4: (lv_angleStart_2_0= RULE_INT )
            // InternalOpenAir.g:2575:5: lv_angleStart_2_0= RULE_INT
            {
            lv_angleStart_2_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_angleStart_2_0, grammarAccess.getDaParams2Access().getAngleStartINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDaParams2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"angleStart",
            						lv_angleStart_2_0,
            						"www.ubx.ch.OpenAir.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDaParams2Access().getCommaKeyword_3());
            		
            // InternalOpenAir.g:2595:3: ( (lv_angleEnd_4_0= RULE_INT ) )
            // InternalOpenAir.g:2596:4: (lv_angleEnd_4_0= RULE_INT )
            {
            // InternalOpenAir.g:2596:4: (lv_angleEnd_4_0= RULE_INT )
            // InternalOpenAir.g:2597:5: lv_angleEnd_4_0= RULE_INT
            {
            lv_angleEnd_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_angleEnd_4_0, grammarAccess.getDaParams2Access().getAngleEndINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDaParams2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"angleEnd",
            						lv_angleEnd_4_0,
            						"www.ubx.ch.OpenAir.INT");
            				

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
    // $ANTLR end "ruleDaParams2"


    // $ANTLR start "entryRuleDB"
    // InternalOpenAir.g:2617:1: entryRuleDB returns [EObject current=null] : iv_ruleDB= ruleDB EOF ;
    public final EObject entryRuleDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDB = null;


        try {
            // InternalOpenAir.g:2617:43: (iv_ruleDB= ruleDB EOF )
            // InternalOpenAir.g:2618:2: iv_ruleDB= ruleDB EOF
            {
             newCompositeNode(grammarAccess.getDBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDB=ruleDB();

            state._fsp--;

             current =iv_ruleDB; 
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
    // $ANTLR end "entryRuleDB"


    // $ANTLR start "ruleDB"
    // InternalOpenAir.g:2624:1: ruleDB returns [EObject current=null] : (otherlv_0= 'DB' ( (lv_dp0_1_0= rulePoint ) ) (otherlv_2= ',' )? ( (lv_dp1_3_0= rulePoint ) ) ) ;
    public final EObject ruleDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dp0_1_0 = null;

        EObject lv_dp1_3_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:2630:2: ( (otherlv_0= 'DB' ( (lv_dp0_1_0= rulePoint ) ) (otherlv_2= ',' )? ( (lv_dp1_3_0= rulePoint ) ) ) )
            // InternalOpenAir.g:2631:2: (otherlv_0= 'DB' ( (lv_dp0_1_0= rulePoint ) ) (otherlv_2= ',' )? ( (lv_dp1_3_0= rulePoint ) ) )
            {
            // InternalOpenAir.g:2631:2: (otherlv_0= 'DB' ( (lv_dp0_1_0= rulePoint ) ) (otherlv_2= ',' )? ( (lv_dp1_3_0= rulePoint ) ) )
            // InternalOpenAir.g:2632:3: otherlv_0= 'DB' ( (lv_dp0_1_0= rulePoint ) ) (otherlv_2= ',' )? ( (lv_dp1_3_0= rulePoint ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDBAccess().getDBKeyword_0());
            		
            // InternalOpenAir.g:2636:3: ( (lv_dp0_1_0= rulePoint ) )
            // InternalOpenAir.g:2637:4: (lv_dp0_1_0= rulePoint )
            {
            // InternalOpenAir.g:2637:4: (lv_dp0_1_0= rulePoint )
            // InternalOpenAir.g:2638:5: lv_dp0_1_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getDBAccess().getDp0PointParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_dp0_1_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDBRule());
            					}
            					set(
            						current,
            						"dp0",
            						lv_dp0_1_0,
            						"www.ubx.ch.OpenAir.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenAir.g:2655:3: (otherlv_2= ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOpenAir.g:2656:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getDBAccess().getCommaKeyword_2());
                    			

                    }
                    break;

            }

            // InternalOpenAir.g:2661:3: ( (lv_dp1_3_0= rulePoint ) )
            // InternalOpenAir.g:2662:4: (lv_dp1_3_0= rulePoint )
            {
            // InternalOpenAir.g:2662:4: (lv_dp1_3_0= rulePoint )
            // InternalOpenAir.g:2663:5: lv_dp1_3_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getDBAccess().getDp1PointParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_dp1_3_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDBRule());
            					}
            					set(
            						current,
            						"dp1",
            						lv_dp1_3_0,
            						"www.ubx.ch.OpenAir.Point");
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
    // $ANTLR end "ruleDB"


    // $ANTLR start "entryRuleAT"
    // InternalOpenAir.g:2684:1: entryRuleAT returns [EObject current=null] : iv_ruleAT= ruleAT EOF ;
    public final EObject entryRuleAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAT = null;


        try {
            // InternalOpenAir.g:2684:43: (iv_ruleAT= ruleAT EOF )
            // InternalOpenAir.g:2685:2: iv_ruleAT= ruleAT EOF
            {
             newCompositeNode(grammarAccess.getATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAT=ruleAT();

            state._fsp--;

             current =iv_ruleAT; 
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
    // $ANTLR end "entryRuleAT"


    // $ANTLR start "ruleAT"
    // InternalOpenAir.g:2691:1: ruleAT returns [EObject current=null] : (otherlv_0= 'AT' ( (lv_lp_1_0= rulePoint ) ) ) ;
    public final EObject ruleAT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_lp_1_0 = null;



        	enterRule();

        try {
            // InternalOpenAir.g:2697:2: ( (otherlv_0= 'AT' ( (lv_lp_1_0= rulePoint ) ) ) )
            // InternalOpenAir.g:2698:2: (otherlv_0= 'AT' ( (lv_lp_1_0= rulePoint ) ) )
            {
            // InternalOpenAir.g:2698:2: (otherlv_0= 'AT' ( (lv_lp_1_0= rulePoint ) ) )
            // InternalOpenAir.g:2699:3: otherlv_0= 'AT' ( (lv_lp_1_0= rulePoint ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getATAccess().getATKeyword_0());
            		
            // InternalOpenAir.g:2703:3: ( (lv_lp_1_0= rulePoint ) )
            // InternalOpenAir.g:2704:4: (lv_lp_1_0= rulePoint )
            {
            // InternalOpenAir.g:2704:4: (lv_lp_1_0= rulePoint )
            // InternalOpenAir.g:2705:5: lv_lp_1_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getATAccess().getLpPointParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_lp_1_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATRule());
            					}
            					set(
            						current,
            						"lp",
            						lv_lp_1_0,
            						"www.ubx.ch.OpenAir.Point");
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
    // $ANTLR end "ruleAT"


    // $ANTLR start "ruleClassType"
    // InternalOpenAir.g:2726:1: ruleClassType returns [Enumerator current=null] : ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'Q' ) | (enumLiteral_8= 'R' ) | (enumLiteral_9= 'W' ) | (enumLiteral_10= 'P' ) | (enumLiteral_11= 'GP' ) | (enumLiteral_12= 'TMZ' ) | (enumLiteral_13= 'CTR' ) | (enumLiteral_14= 'Restricted' ) | (enumLiteral_15= 'UKN' ) ) ;
    public final Enumerator ruleClassType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;


        	enterRule();

        try {
            // InternalOpenAir.g:2732:2: ( ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'Q' ) | (enumLiteral_8= 'R' ) | (enumLiteral_9= 'W' ) | (enumLiteral_10= 'P' ) | (enumLiteral_11= 'GP' ) | (enumLiteral_12= 'TMZ' ) | (enumLiteral_13= 'CTR' ) | (enumLiteral_14= 'Restricted' ) | (enumLiteral_15= 'UKN' ) ) )
            // InternalOpenAir.g:2733:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'Q' ) | (enumLiteral_8= 'R' ) | (enumLiteral_9= 'W' ) | (enumLiteral_10= 'P' ) | (enumLiteral_11= 'GP' ) | (enumLiteral_12= 'TMZ' ) | (enumLiteral_13= 'CTR' ) | (enumLiteral_14= 'Restricted' ) | (enumLiteral_15= 'UKN' ) )
            {
            // InternalOpenAir.g:2733:2: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) | (enumLiteral_2= 'C' ) | (enumLiteral_3= 'D' ) | (enumLiteral_4= 'E' ) | (enumLiteral_5= 'F' ) | (enumLiteral_6= 'G' ) | (enumLiteral_7= 'Q' ) | (enumLiteral_8= 'R' ) | (enumLiteral_9= 'W' ) | (enumLiteral_10= 'P' ) | (enumLiteral_11= 'GP' ) | (enumLiteral_12= 'TMZ' ) | (enumLiteral_13= 'CTR' ) | (enumLiteral_14= 'Restricted' ) | (enumLiteral_15= 'UKN' ) )
            int alt17=16;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt17=1;
                }
                break;
            case 35:
                {
                alt17=2;
                }
                break;
            case 36:
                {
                alt17=3;
                }
                break;
            case 37:
                {
                alt17=4;
                }
                break;
            case 38:
                {
                alt17=5;
                }
                break;
            case 39:
                {
                alt17=6;
                }
                break;
            case 40:
                {
                alt17=7;
                }
                break;
            case 41:
                {
                alt17=8;
                }
                break;
            case 42:
                {
                alt17=9;
                }
                break;
            case 43:
                {
                alt17=10;
                }
                break;
            case 44:
                {
                alt17=11;
                }
                break;
            case 45:
                {
                alt17=12;
                }
                break;
            case 46:
                {
                alt17=13;
                }
                break;
            case 47:
                {
                alt17=14;
                }
                break;
            case 48:
                {
                alt17=15;
                }
                break;
            case 49:
                {
                alt17=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalOpenAir.g:2734:3: (enumLiteral_0= 'A' )
                    {
                    // InternalOpenAir.g:2734:3: (enumLiteral_0= 'A' )
                    // InternalOpenAir.g:2735:4: enumLiteral_0= 'A'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getClassTypeAccess().getAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenAir.g:2742:3: (enumLiteral_1= 'B' )
                    {
                    // InternalOpenAir.g:2742:3: (enumLiteral_1= 'B' )
                    // InternalOpenAir.g:2743:4: enumLiteral_1= 'B'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getClassTypeAccess().getBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOpenAir.g:2750:3: (enumLiteral_2= 'C' )
                    {
                    // InternalOpenAir.g:2750:3: (enumLiteral_2= 'C' )
                    // InternalOpenAir.g:2751:4: enumLiteral_2= 'C'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getClassTypeAccess().getCEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOpenAir.g:2758:3: (enumLiteral_3= 'D' )
                    {
                    // InternalOpenAir.g:2758:3: (enumLiteral_3= 'D' )
                    // InternalOpenAir.g:2759:4: enumLiteral_3= 'D'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getClassTypeAccess().getDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOpenAir.g:2766:3: (enumLiteral_4= 'E' )
                    {
                    // InternalOpenAir.g:2766:3: (enumLiteral_4= 'E' )
                    // InternalOpenAir.g:2767:4: enumLiteral_4= 'E'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getClassTypeAccess().getEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOpenAir.g:2774:3: (enumLiteral_5= 'F' )
                    {
                    // InternalOpenAir.g:2774:3: (enumLiteral_5= 'F' )
                    // InternalOpenAir.g:2775:4: enumLiteral_5= 'F'
                    {
                    enumLiteral_5=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getClassTypeAccess().getFEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOpenAir.g:2782:3: (enumLiteral_6= 'G' )
                    {
                    // InternalOpenAir.g:2782:3: (enumLiteral_6= 'G' )
                    // InternalOpenAir.g:2783:4: enumLiteral_6= 'G'
                    {
                    enumLiteral_6=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getClassTypeAccess().getGEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOpenAir.g:2790:3: (enumLiteral_7= 'Q' )
                    {
                    // InternalOpenAir.g:2790:3: (enumLiteral_7= 'Q' )
                    // InternalOpenAir.g:2791:4: enumLiteral_7= 'Q'
                    {
                    enumLiteral_7=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getQEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getClassTypeAccess().getQEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalOpenAir.g:2798:3: (enumLiteral_8= 'R' )
                    {
                    // InternalOpenAir.g:2798:3: (enumLiteral_8= 'R' )
                    // InternalOpenAir.g:2799:4: enumLiteral_8= 'R'
                    {
                    enumLiteral_8=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getREnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getClassTypeAccess().getREnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalOpenAir.g:2806:3: (enumLiteral_9= 'W' )
                    {
                    // InternalOpenAir.g:2806:3: (enumLiteral_9= 'W' )
                    // InternalOpenAir.g:2807:4: enumLiteral_9= 'W'
                    {
                    enumLiteral_9=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getWEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getClassTypeAccess().getWEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalOpenAir.g:2814:3: (enumLiteral_10= 'P' )
                    {
                    // InternalOpenAir.g:2814:3: (enumLiteral_10= 'P' )
                    // InternalOpenAir.g:2815:4: enumLiteral_10= 'P'
                    {
                    enumLiteral_10=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getPEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getClassTypeAccess().getPEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalOpenAir.g:2822:3: (enumLiteral_11= 'GP' )
                    {
                    // InternalOpenAir.g:2822:3: (enumLiteral_11= 'GP' )
                    // InternalOpenAir.g:2823:4: enumLiteral_11= 'GP'
                    {
                    enumLiteral_11=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getGPEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getClassTypeAccess().getGPEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalOpenAir.g:2830:3: (enumLiteral_12= 'TMZ' )
                    {
                    // InternalOpenAir.g:2830:3: (enumLiteral_12= 'TMZ' )
                    // InternalOpenAir.g:2831:4: enumLiteral_12= 'TMZ'
                    {
                    enumLiteral_12=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getTMZEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getClassTypeAccess().getTMZEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalOpenAir.g:2838:3: (enumLiteral_13= 'CTR' )
                    {
                    // InternalOpenAir.g:2838:3: (enumLiteral_13= 'CTR' )
                    // InternalOpenAir.g:2839:4: enumLiteral_13= 'CTR'
                    {
                    enumLiteral_13=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getCTREnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getClassTypeAccess().getCTREnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalOpenAir.g:2846:3: (enumLiteral_14= 'Restricted' )
                    {
                    // InternalOpenAir.g:2846:3: (enumLiteral_14= 'Restricted' )
                    // InternalOpenAir.g:2847:4: enumLiteral_14= 'Restricted'
                    {
                    enumLiteral_14=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getRestrictedEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getClassTypeAccess().getRestrictedEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalOpenAir.g:2854:3: (enumLiteral_15= 'UKN' )
                    {
                    // InternalOpenAir.g:2854:3: (enumLiteral_15= 'UKN' )
                    // InternalOpenAir.g:2855:4: enumLiteral_15= 'UKN'
                    {
                    enumLiteral_15=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getClassTypeAccess().getUKNEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getClassTypeAccess().getUKNEnumLiteralDeclaration_15());
                    			

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
    // $ANTLR end "ruleClassType"


    // $ANTLR start "ruleUnits"
    // InternalOpenAir.g:2865:1: ruleUnits returns [Enumerator current=null] : ( (enumLiteral_0= 'ft' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'MSL' ) | (enumLiteral_3= 'm MSL' ) | (enumLiteral_4= 'ft MSL' ) | (enumLiteral_5= 'AGL' ) | (enumLiteral_6= 'm AGL' ) | (enumLiteral_7= 'ft AGL' ) | (enumLiteral_8= 'AMSL' ) | (enumLiteral_9= 'm AMSL' ) ) ;
    public final Enumerator ruleUnits() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalOpenAir.g:2871:2: ( ( (enumLiteral_0= 'ft' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'MSL' ) | (enumLiteral_3= 'm MSL' ) | (enumLiteral_4= 'ft MSL' ) | (enumLiteral_5= 'AGL' ) | (enumLiteral_6= 'm AGL' ) | (enumLiteral_7= 'ft AGL' ) | (enumLiteral_8= 'AMSL' ) | (enumLiteral_9= 'm AMSL' ) ) )
            // InternalOpenAir.g:2872:2: ( (enumLiteral_0= 'ft' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'MSL' ) | (enumLiteral_3= 'm MSL' ) | (enumLiteral_4= 'ft MSL' ) | (enumLiteral_5= 'AGL' ) | (enumLiteral_6= 'm AGL' ) | (enumLiteral_7= 'ft AGL' ) | (enumLiteral_8= 'AMSL' ) | (enumLiteral_9= 'm AMSL' ) )
            {
            // InternalOpenAir.g:2872:2: ( (enumLiteral_0= 'ft' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'MSL' ) | (enumLiteral_3= 'm MSL' ) | (enumLiteral_4= 'ft MSL' ) | (enumLiteral_5= 'AGL' ) | (enumLiteral_6= 'm AGL' ) | (enumLiteral_7= 'ft AGL' ) | (enumLiteral_8= 'AMSL' ) | (enumLiteral_9= 'm AMSL' ) )
            int alt18=10;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt18=1;
                }
                break;
            case 51:
                {
                alt18=2;
                }
                break;
            case 52:
                {
                alt18=3;
                }
                break;
            case 53:
                {
                alt18=4;
                }
                break;
            case 54:
                {
                alt18=5;
                }
                break;
            case 55:
                {
                alt18=6;
                }
                break;
            case 56:
                {
                alt18=7;
                }
                break;
            case 57:
                {
                alt18=8;
                }
                break;
            case 58:
                {
                alt18=9;
                }
                break;
            case 59:
                {
                alt18=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalOpenAir.g:2873:3: (enumLiteral_0= 'ft' )
                    {
                    // InternalOpenAir.g:2873:3: (enumLiteral_0= 'ft' )
                    // InternalOpenAir.g:2874:4: enumLiteral_0= 'ft'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getUnitsAccess().getFeedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnitsAccess().getFeedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenAir.g:2881:3: (enumLiteral_1= 'm' )
                    {
                    // InternalOpenAir.g:2881:3: (enumLiteral_1= 'm' )
                    // InternalOpenAir.g:2882:4: enumLiteral_1= 'm'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getUnitsAccess().getMeterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnitsAccess().getMeterEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOpenAir.g:2889:3: (enumLiteral_2= 'MSL' )
                    {
                    // InternalOpenAir.g:2889:3: (enumLiteral_2= 'MSL' )
                    // InternalOpenAir.g:2890:4: enumLiteral_2= 'MSL'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getUnitsAccess().getMslEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnitsAccess().getMslEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOpenAir.g:2897:3: (enumLiteral_3= 'm MSL' )
                    {
                    // InternalOpenAir.g:2897:3: (enumLiteral_3= 'm MSL' )
                    // InternalOpenAir.g:2898:4: enumLiteral_3= 'm MSL'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getUnitsAccess().getM_mslEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnitsAccess().getM_mslEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOpenAir.g:2905:3: (enumLiteral_4= 'ft MSL' )
                    {
                    // InternalOpenAir.g:2905:3: (enumLiteral_4= 'ft MSL' )
                    // InternalOpenAir.g:2906:4: enumLiteral_4= 'ft MSL'
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getUnitsAccess().getFt_mslEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getUnitsAccess().getFt_mslEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOpenAir.g:2913:3: (enumLiteral_5= 'AGL' )
                    {
                    // InternalOpenAir.g:2913:3: (enumLiteral_5= 'AGL' )
                    // InternalOpenAir.g:2914:4: enumLiteral_5= 'AGL'
                    {
                    enumLiteral_5=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getUnitsAccess().getAglEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getUnitsAccess().getAglEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOpenAir.g:2921:3: (enumLiteral_6= 'm AGL' )
                    {
                    // InternalOpenAir.g:2921:3: (enumLiteral_6= 'm AGL' )
                    // InternalOpenAir.g:2922:4: enumLiteral_6= 'm AGL'
                    {
                    enumLiteral_6=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getUnitsAccess().getM_aglEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getUnitsAccess().getM_aglEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOpenAir.g:2929:3: (enumLiteral_7= 'ft AGL' )
                    {
                    // InternalOpenAir.g:2929:3: (enumLiteral_7= 'ft AGL' )
                    // InternalOpenAir.g:2930:4: enumLiteral_7= 'ft AGL'
                    {
                    enumLiteral_7=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getUnitsAccess().getFt_AGLEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getUnitsAccess().getFt_AGLEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalOpenAir.g:2937:3: (enumLiteral_8= 'AMSL' )
                    {
                    // InternalOpenAir.g:2937:3: (enumLiteral_8= 'AMSL' )
                    // InternalOpenAir.g:2938:4: enumLiteral_8= 'AMSL'
                    {
                    enumLiteral_8=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getUnitsAccess().getAMSLEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getUnitsAccess().getAMSLEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalOpenAir.g:2945:3: (enumLiteral_9= 'm AMSL' )
                    {
                    // InternalOpenAir.g:2945:3: (enumLiteral_9= 'm AMSL' )
                    // InternalOpenAir.g:2946:4: enumLiteral_9= 'm AMSL'
                    {
                    enumLiteral_9=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getUnitsAccess().getM_AMSLEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getUnitsAccess().getM_AMSLEnumLiteralDeclaration_9());
                    			

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
    // $ANTLR end "ruleUnits"


    // $ANTLR start "ruleWE"
    // InternalOpenAir.g:2956:1: ruleWE returns [Enumerator current=null] : ( (enumLiteral_0= 'W' ) | (enumLiteral_1= 'E' ) ) ;
    public final Enumerator ruleWE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOpenAir.g:2962:2: ( ( (enumLiteral_0= 'W' ) | (enumLiteral_1= 'E' ) ) )
            // InternalOpenAir.g:2963:2: ( (enumLiteral_0= 'W' ) | (enumLiteral_1= 'E' ) )
            {
            // InternalOpenAir.g:2963:2: ( (enumLiteral_0= 'W' ) | (enumLiteral_1= 'E' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            else if ( (LA19_0==38) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalOpenAir.g:2964:3: (enumLiteral_0= 'W' )
                    {
                    // InternalOpenAir.g:2964:3: (enumLiteral_0= 'W' )
                    // InternalOpenAir.g:2965:4: enumLiteral_0= 'W'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getWEAccess().getWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWEAccess().getWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenAir.g:2972:3: (enumLiteral_1= 'E' )
                    {
                    // InternalOpenAir.g:2972:3: (enumLiteral_1= 'E' )
                    // InternalOpenAir.g:2973:4: enumLiteral_1= 'E'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getWEAccess().getEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWEAccess().getEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleWE"


    // $ANTLR start "ruleNS"
    // InternalOpenAir.g:2983:1: ruleNS returns [Enumerator current=null] : ( (enumLiteral_0= 'N' ) | (enumLiteral_1= 'S' ) ) ;
    public final Enumerator ruleNS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOpenAir.g:2989:2: ( ( (enumLiteral_0= 'N' ) | (enumLiteral_1= 'S' ) ) )
            // InternalOpenAir.g:2990:2: ( (enumLiteral_0= 'N' ) | (enumLiteral_1= 'S' ) )
            {
            // InternalOpenAir.g:2990:2: ( (enumLiteral_0= 'N' ) | (enumLiteral_1= 'S' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==60) ) {
                alt20=1;
            }
            else if ( (LA20_0==61) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalOpenAir.g:2991:3: (enumLiteral_0= 'N' )
                    {
                    // InternalOpenAir.g:2991:3: (enumLiteral_0= 'N' )
                    // InternalOpenAir.g:2992:4: enumLiteral_0= 'N'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getNSAccess().getNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNSAccess().getNEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenAir.g:2999:3: (enumLiteral_1= 'S' )
                    {
                    // InternalOpenAir.g:2999:3: (enumLiteral_1= 'S' )
                    // InternalOpenAir.g:3000:4: enumLiteral_1= 'S'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getNSAccess().getSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNSAccess().getSEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleNS"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000001B0800002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200060000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0003FFFC00000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000780010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0FFC000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004050L});

}