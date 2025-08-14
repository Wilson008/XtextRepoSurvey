package de.altimos.mdsd.majordomo.dsl.parser.antlr.internal;

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
import de.altimos.mdsd.majordomo.dsl.services.MajordomoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMajordomoDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_CONST", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'{'", "';'", "'}'", "'house'", "'room'", "'on'", "'do'", "','", "'not'", "'!'", "'('", "')'", "'?'", "'def'", "':'", "'set'", "'val'", "'@light'", "'@temp'", "'@rain'", "'@switch'", "'@number'", "'@clock'", "'@lamp'", "'@roller'", "'@roof'", "'@radiator'", "'@boiler'", "'@coffee'", "'.'", "'and'", "'&&'", "'&'", "'or'", "'||'", "'|'", "'-'", "'E'", "'e'", "'true'", "'false'", "'<'", "'<='", "'>='", "'>'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int RULE_CONST=5;
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


        public InternalMajordomoDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMajordomoDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMajordomoDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMajordomoDsl.g"; }



     	private MajordomoDslGrammarAccess grammarAccess;

        public InternalMajordomoDslParser(TokenStream input, MajordomoDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Majordomo";
       	}

       	@Override
       	protected MajordomoDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMajordomo"
    // InternalMajordomoDsl.g:65:1: entryRuleMajordomo returns [EObject current=null] : iv_ruleMajordomo= ruleMajordomo EOF ;
    public final EObject entryRuleMajordomo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMajordomo = null;


        try {
            // InternalMajordomoDsl.g:65:50: (iv_ruleMajordomo= ruleMajordomo EOF )
            // InternalMajordomoDsl.g:66:2: iv_ruleMajordomo= ruleMajordomo EOF
            {
             newCompositeNode(grammarAccess.getMajordomoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMajordomo=ruleMajordomo();

            state._fsp--;

             current =iv_ruleMajordomo; 
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
    // $ANTLR end "entryRuleMajordomo"


    // $ANTLR start "ruleMajordomo"
    // InternalMajordomoDsl.g:72:1: ruleMajordomo returns [EObject current=null] : ( () ( (lv_house_1_0= ruleHouse ) )? ( (lv_rooms_2_0= ruleRoom ) )* ( (lv_program_3_0= ruleProgram ) ) ) ;
    public final EObject ruleMajordomo() throws RecognitionException {
        EObject current = null;

        EObject lv_house_1_0 = null;

        EObject lv_rooms_2_0 = null;

        EObject lv_program_3_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:78:2: ( ( () ( (lv_house_1_0= ruleHouse ) )? ( (lv_rooms_2_0= ruleRoom ) )* ( (lv_program_3_0= ruleProgram ) ) ) )
            // InternalMajordomoDsl.g:79:2: ( () ( (lv_house_1_0= ruleHouse ) )? ( (lv_rooms_2_0= ruleRoom ) )* ( (lv_program_3_0= ruleProgram ) ) )
            {
            // InternalMajordomoDsl.g:79:2: ( () ( (lv_house_1_0= ruleHouse ) )? ( (lv_rooms_2_0= ruleRoom ) )* ( (lv_program_3_0= ruleProgram ) ) )
            // InternalMajordomoDsl.g:80:3: () ( (lv_house_1_0= ruleHouse ) )? ( (lv_rooms_2_0= ruleRoom ) )* ( (lv_program_3_0= ruleProgram ) )
            {
            // InternalMajordomoDsl.g:80:3: ()
            // InternalMajordomoDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMajordomoAccess().getMajordomoAction_0(),
            					current);
            			

            }

            // InternalMajordomoDsl.g:87:3: ( (lv_house_1_0= ruleHouse ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMajordomoDsl.g:88:4: (lv_house_1_0= ruleHouse )
                    {
                    // InternalMajordomoDsl.g:88:4: (lv_house_1_0= ruleHouse )
                    // InternalMajordomoDsl.g:89:5: lv_house_1_0= ruleHouse
                    {

                    					newCompositeNode(grammarAccess.getMajordomoAccess().getHouseHouseParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_house_1_0=ruleHouse();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMajordomoRule());
                    					}
                    					set(
                    						current,
                    						"house",
                    						lv_house_1_0,
                    						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.House");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMajordomoDsl.g:106:3: ( (lv_rooms_2_0= ruleRoom ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMajordomoDsl.g:107:4: (lv_rooms_2_0= ruleRoom )
            	    {
            	    // InternalMajordomoDsl.g:107:4: (lv_rooms_2_0= ruleRoom )
            	    // InternalMajordomoDsl.g:108:5: lv_rooms_2_0= ruleRoom
            	    {

            	    					newCompositeNode(grammarAccess.getMajordomoAccess().getRoomsRoomParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_rooms_2_0=ruleRoom();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMajordomoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rooms",
            	    						lv_rooms_2_0,
            	    						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Room");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMajordomoDsl.g:125:3: ( (lv_program_3_0= ruleProgram ) )
            // InternalMajordomoDsl.g:126:4: (lv_program_3_0= ruleProgram )
            {
            // InternalMajordomoDsl.g:126:4: (lv_program_3_0= ruleProgram )
            // InternalMajordomoDsl.g:127:5: lv_program_3_0= ruleProgram
            {

            					newCompositeNode(grammarAccess.getMajordomoAccess().getProgramProgramParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_program_3_0=ruleProgram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMajordomoRule());
            					}
            					set(
            						current,
            						"program",
            						lv_program_3_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Program");
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
    // $ANTLR end "ruleMajordomo"


    // $ANTLR start "entryRuleProgram"
    // InternalMajordomoDsl.g:148:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMajordomoDsl.g:148:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMajordomoDsl.g:149:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalMajordomoDsl.g:155:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= 'program' otherlv_2= '{' ( ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ';' )? ) | ( ( (lv_preparedStatements_5_0= rulePreparedStatement ) ) (otherlv_6= ';' )? ) | ( ( (lv_preparedActionSets_7_0= rulePreparedActionSet ) ) (otherlv_8= ';' )? ) | ( ( (lv_constants_9_0= rulePreparedValue ) ) (otherlv_10= ';' )? ) )* otherlv_11= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_rules_3_0 = null;

        EObject lv_preparedStatements_5_0 = null;

        EObject lv_preparedActionSets_7_0 = null;

        EObject lv_constants_9_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:161:2: ( ( () otherlv_1= 'program' otherlv_2= '{' ( ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ';' )? ) | ( ( (lv_preparedStatements_5_0= rulePreparedStatement ) ) (otherlv_6= ';' )? ) | ( ( (lv_preparedActionSets_7_0= rulePreparedActionSet ) ) (otherlv_8= ';' )? ) | ( ( (lv_constants_9_0= rulePreparedValue ) ) (otherlv_10= ';' )? ) )* otherlv_11= '}' ) )
            // InternalMajordomoDsl.g:162:2: ( () otherlv_1= 'program' otherlv_2= '{' ( ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ';' )? ) | ( ( (lv_preparedStatements_5_0= rulePreparedStatement ) ) (otherlv_6= ';' )? ) | ( ( (lv_preparedActionSets_7_0= rulePreparedActionSet ) ) (otherlv_8= ';' )? ) | ( ( (lv_constants_9_0= rulePreparedValue ) ) (otherlv_10= ';' )? ) )* otherlv_11= '}' )
            {
            // InternalMajordomoDsl.g:162:2: ( () otherlv_1= 'program' otherlv_2= '{' ( ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ';' )? ) | ( ( (lv_preparedStatements_5_0= rulePreparedStatement ) ) (otherlv_6= ';' )? ) | ( ( (lv_preparedActionSets_7_0= rulePreparedActionSet ) ) (otherlv_8= ';' )? ) | ( ( (lv_constants_9_0= rulePreparedValue ) ) (otherlv_10= ';' )? ) )* otherlv_11= '}' )
            // InternalMajordomoDsl.g:163:3: () otherlv_1= 'program' otherlv_2= '{' ( ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ';' )? ) | ( ( (lv_preparedStatements_5_0= rulePreparedStatement ) ) (otherlv_6= ';' )? ) | ( ( (lv_preparedActionSets_7_0= rulePreparedActionSet ) ) (otherlv_8= ';' )? ) | ( ( (lv_constants_9_0= rulePreparedValue ) ) (otherlv_10= ';' )? ) )* otherlv_11= '}'
            {
            // InternalMajordomoDsl.g:163:3: ()
            // InternalMajordomoDsl.g:164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getProgramKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMajordomoDsl.g:178:3: ( ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ';' )? ) | ( ( (lv_preparedStatements_5_0= rulePreparedStatement ) ) (otherlv_6= ';' )? ) | ( ( (lv_preparedActionSets_7_0= rulePreparedActionSet ) ) (otherlv_8= ';' )? ) | ( ( (lv_constants_9_0= rulePreparedValue ) ) (otherlv_10= ';' )? ) )*
            loop7:
            do {
                int alt7=5;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt7=1;
                    }
                    break;
                case 26:
                    {
                    alt7=2;
                    }
                    break;
                case 28:
                    {
                    alt7=3;
                    }
                    break;
                case 29:
                    {
                    alt7=4;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // InternalMajordomoDsl.g:179:4: ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ';' )? )
            	    {
            	    // InternalMajordomoDsl.g:179:4: ( ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ';' )? )
            	    // InternalMajordomoDsl.g:180:5: ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= ';' )?
            	    {
            	    // InternalMajordomoDsl.g:180:5: ( (lv_rules_3_0= ruleRule ) )
            	    // InternalMajordomoDsl.g:181:6: (lv_rules_3_0= ruleRule )
            	    {
            	    // InternalMajordomoDsl.g:181:6: (lv_rules_3_0= ruleRule )
            	    // InternalMajordomoDsl.g:182:7: lv_rules_3_0= ruleRule
            	    {

            	    							newCompositeNode(grammarAccess.getProgramAccess().getRulesRuleParserRuleCall_3_0_0_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_rules_3_0=ruleRule();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProgramRule());
            	    							}
            	    							add(
            	    								current,
            	    								"rules",
            	    								lv_rules_3_0,
            	    								"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Rule");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMajordomoDsl.g:199:5: (otherlv_4= ';' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==14) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalMajordomoDsl.g:200:6: otherlv_4= ';'
            	            {
            	            otherlv_4=(Token)match(input,14,FOLLOW_5); 

            	            						newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getSemicolonKeyword_3_0_1());
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMajordomoDsl.g:207:4: ( ( (lv_preparedStatements_5_0= rulePreparedStatement ) ) (otherlv_6= ';' )? )
            	    {
            	    // InternalMajordomoDsl.g:207:4: ( ( (lv_preparedStatements_5_0= rulePreparedStatement ) ) (otherlv_6= ';' )? )
            	    // InternalMajordomoDsl.g:208:5: ( (lv_preparedStatements_5_0= rulePreparedStatement ) ) (otherlv_6= ';' )?
            	    {
            	    // InternalMajordomoDsl.g:208:5: ( (lv_preparedStatements_5_0= rulePreparedStatement ) )
            	    // InternalMajordomoDsl.g:209:6: (lv_preparedStatements_5_0= rulePreparedStatement )
            	    {
            	    // InternalMajordomoDsl.g:209:6: (lv_preparedStatements_5_0= rulePreparedStatement )
            	    // InternalMajordomoDsl.g:210:7: lv_preparedStatements_5_0= rulePreparedStatement
            	    {

            	    							newCompositeNode(grammarAccess.getProgramAccess().getPreparedStatementsPreparedStatementParserRuleCall_3_1_0_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_preparedStatements_5_0=rulePreparedStatement();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProgramRule());
            	    							}
            	    							add(
            	    								current,
            	    								"preparedStatements",
            	    								lv_preparedStatements_5_0,
            	    								"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.PreparedStatement");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMajordomoDsl.g:227:5: (otherlv_6= ';' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==14) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMajordomoDsl.g:228:6: otherlv_6= ';'
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_5); 

            	            						newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getSemicolonKeyword_3_1_1());
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMajordomoDsl.g:235:4: ( ( (lv_preparedActionSets_7_0= rulePreparedActionSet ) ) (otherlv_8= ';' )? )
            	    {
            	    // InternalMajordomoDsl.g:235:4: ( ( (lv_preparedActionSets_7_0= rulePreparedActionSet ) ) (otherlv_8= ';' )? )
            	    // InternalMajordomoDsl.g:236:5: ( (lv_preparedActionSets_7_0= rulePreparedActionSet ) ) (otherlv_8= ';' )?
            	    {
            	    // InternalMajordomoDsl.g:236:5: ( (lv_preparedActionSets_7_0= rulePreparedActionSet ) )
            	    // InternalMajordomoDsl.g:237:6: (lv_preparedActionSets_7_0= rulePreparedActionSet )
            	    {
            	    // InternalMajordomoDsl.g:237:6: (lv_preparedActionSets_7_0= rulePreparedActionSet )
            	    // InternalMajordomoDsl.g:238:7: lv_preparedActionSets_7_0= rulePreparedActionSet
            	    {

            	    							newCompositeNode(grammarAccess.getProgramAccess().getPreparedActionSetsPreparedActionSetParserRuleCall_3_2_0_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_preparedActionSets_7_0=rulePreparedActionSet();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProgramRule());
            	    							}
            	    							add(
            	    								current,
            	    								"preparedActionSets",
            	    								lv_preparedActionSets_7_0,
            	    								"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.PreparedActionSet");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMajordomoDsl.g:255:5: (otherlv_8= ';' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==14) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalMajordomoDsl.g:256:6: otherlv_8= ';'
            	            {
            	            otherlv_8=(Token)match(input,14,FOLLOW_5); 

            	            						newLeafNode(otherlv_8, grammarAccess.getProgramAccess().getSemicolonKeyword_3_2_1());
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMajordomoDsl.g:263:4: ( ( (lv_constants_9_0= rulePreparedValue ) ) (otherlv_10= ';' )? )
            	    {
            	    // InternalMajordomoDsl.g:263:4: ( ( (lv_constants_9_0= rulePreparedValue ) ) (otherlv_10= ';' )? )
            	    // InternalMajordomoDsl.g:264:5: ( (lv_constants_9_0= rulePreparedValue ) ) (otherlv_10= ';' )?
            	    {
            	    // InternalMajordomoDsl.g:264:5: ( (lv_constants_9_0= rulePreparedValue ) )
            	    // InternalMajordomoDsl.g:265:6: (lv_constants_9_0= rulePreparedValue )
            	    {
            	    // InternalMajordomoDsl.g:265:6: (lv_constants_9_0= rulePreparedValue )
            	    // InternalMajordomoDsl.g:266:7: lv_constants_9_0= rulePreparedValue
            	    {

            	    							newCompositeNode(grammarAccess.getProgramAccess().getConstantsPreparedValueParserRuleCall_3_3_0_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_constants_9_0=rulePreparedValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getProgramRule());
            	    							}
            	    							add(
            	    								current,
            	    								"constants",
            	    								lv_constants_9_0,
            	    								"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.PreparedValue");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMajordomoDsl.g:283:5: (otherlv_10= ';' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==14) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalMajordomoDsl.g:284:6: otherlv_10= ';'
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_5); 

            	            						newLeafNode(otherlv_10, grammarAccess.getProgramAccess().getSemicolonKeyword_3_3_1());
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleHouse"
    // InternalMajordomoDsl.g:299:1: entryRuleHouse returns [EObject current=null] : iv_ruleHouse= ruleHouse EOF ;
    public final EObject entryRuleHouse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHouse = null;


        try {
            // InternalMajordomoDsl.g:299:46: (iv_ruleHouse= ruleHouse EOF )
            // InternalMajordomoDsl.g:300:2: iv_ruleHouse= ruleHouse EOF
            {
             newCompositeNode(grammarAccess.getHouseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHouse=ruleHouse();

            state._fsp--;

             current =iv_ruleHouse; 
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
    // $ANTLR end "entryRuleHouse"


    // $ANTLR start "ruleHouse"
    // InternalMajordomoDsl.g:306:1: ruleHouse returns [EObject current=null] : ( () otherlv_1= 'house' otherlv_2= '{' ( ( ( (lv_sensors_3_0= ruleSensor ) ) | ( (lv_actors_4_0= ruleActor ) ) ) (otherlv_5= ';' )? )* otherlv_6= '}' ) ;
    public final EObject ruleHouse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_sensors_3_0 = null;

        EObject lv_actors_4_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:312:2: ( ( () otherlv_1= 'house' otherlv_2= '{' ( ( ( (lv_sensors_3_0= ruleSensor ) ) | ( (lv_actors_4_0= ruleActor ) ) ) (otherlv_5= ';' )? )* otherlv_6= '}' ) )
            // InternalMajordomoDsl.g:313:2: ( () otherlv_1= 'house' otherlv_2= '{' ( ( ( (lv_sensors_3_0= ruleSensor ) ) | ( (lv_actors_4_0= ruleActor ) ) ) (otherlv_5= ';' )? )* otherlv_6= '}' )
            {
            // InternalMajordomoDsl.g:313:2: ( () otherlv_1= 'house' otherlv_2= '{' ( ( ( (lv_sensors_3_0= ruleSensor ) ) | ( (lv_actors_4_0= ruleActor ) ) ) (otherlv_5= ';' )? )* otherlv_6= '}' )
            // InternalMajordomoDsl.g:314:3: () otherlv_1= 'house' otherlv_2= '{' ( ( ( (lv_sensors_3_0= ruleSensor ) ) | ( (lv_actors_4_0= ruleActor ) ) ) (otherlv_5= ';' )? )* otherlv_6= '}'
            {
            // InternalMajordomoDsl.g:314:3: ()
            // InternalMajordomoDsl.g:315:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHouseAccess().getHouseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHouseAccess().getHouseKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMajordomoDsl.g:329:3: ( ( ( (lv_sensors_3_0= ruleSensor ) ) | ( (lv_actors_4_0= ruleActor ) ) ) (otherlv_5= ';' )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=30 && LA10_0<=41)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMajordomoDsl.g:330:4: ( ( (lv_sensors_3_0= ruleSensor ) ) | ( (lv_actors_4_0= ruleActor ) ) ) (otherlv_5= ';' )?
            	    {
            	    // InternalMajordomoDsl.g:330:4: ( ( (lv_sensors_3_0= ruleSensor ) ) | ( (lv_actors_4_0= ruleActor ) ) )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( ((LA8_0>=30 && LA8_0<=35)) ) {
            	        alt8=1;
            	    }
            	    else if ( ((LA8_0>=36 && LA8_0<=41)) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalMajordomoDsl.g:331:5: ( (lv_sensors_3_0= ruleSensor ) )
            	            {
            	            // InternalMajordomoDsl.g:331:5: ( (lv_sensors_3_0= ruleSensor ) )
            	            // InternalMajordomoDsl.g:332:6: (lv_sensors_3_0= ruleSensor )
            	            {
            	            // InternalMajordomoDsl.g:332:6: (lv_sensors_3_0= ruleSensor )
            	            // InternalMajordomoDsl.g:333:7: lv_sensors_3_0= ruleSensor
            	            {

            	            							newCompositeNode(grammarAccess.getHouseAccess().getSensorsSensorParserRuleCall_3_0_0_0());
            	            						
            	            pushFollow(FOLLOW_8);
            	            lv_sensors_3_0=ruleSensor();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getHouseRule());
            	            							}
            	            							add(
            	            								current,
            	            								"sensors",
            	            								lv_sensors_3_0,
            	            								"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Sensor");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMajordomoDsl.g:351:5: ( (lv_actors_4_0= ruleActor ) )
            	            {
            	            // InternalMajordomoDsl.g:351:5: ( (lv_actors_4_0= ruleActor ) )
            	            // InternalMajordomoDsl.g:352:6: (lv_actors_4_0= ruleActor )
            	            {
            	            // InternalMajordomoDsl.g:352:6: (lv_actors_4_0= ruleActor )
            	            // InternalMajordomoDsl.g:353:7: lv_actors_4_0= ruleActor
            	            {

            	            							newCompositeNode(grammarAccess.getHouseAccess().getActorsActorParserRuleCall_3_0_1_0());
            	            						
            	            pushFollow(FOLLOW_8);
            	            lv_actors_4_0=ruleActor();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getHouseRule());
            	            							}
            	            							add(
            	            								current,
            	            								"actors",
            	            								lv_actors_4_0,
            	            								"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Actor");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMajordomoDsl.g:371:4: (otherlv_5= ';' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==14) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalMajordomoDsl.g:372:5: otherlv_5= ';'
            	            {
            	            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            	            					newLeafNode(otherlv_5, grammarAccess.getHouseAccess().getSemicolonKeyword_3_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleHouse"


    // $ANTLR start "entryRuleRoom"
    // InternalMajordomoDsl.g:386:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalMajordomoDsl.g:386:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalMajordomoDsl.g:387:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalMajordomoDsl.g:393:1: ruleRoom returns [EObject current=null] : ( () otherlv_1= 'room' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( ( ( (lv_sensors_4_0= ruleSensor ) ) | ( (lv_actors_5_0= ruleActor ) ) ) (otherlv_6= ';' )? )* otherlv_7= '}' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sensors_4_0 = null;

        EObject lv_actors_5_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:399:2: ( ( () otherlv_1= 'room' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( ( ( (lv_sensors_4_0= ruleSensor ) ) | ( (lv_actors_5_0= ruleActor ) ) ) (otherlv_6= ';' )? )* otherlv_7= '}' ) )
            // InternalMajordomoDsl.g:400:2: ( () otherlv_1= 'room' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( ( ( (lv_sensors_4_0= ruleSensor ) ) | ( (lv_actors_5_0= ruleActor ) ) ) (otherlv_6= ';' )? )* otherlv_7= '}' )
            {
            // InternalMajordomoDsl.g:400:2: ( () otherlv_1= 'room' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( ( ( (lv_sensors_4_0= ruleSensor ) ) | ( (lv_actors_5_0= ruleActor ) ) ) (otherlv_6= ';' )? )* otherlv_7= '}' )
            // InternalMajordomoDsl.g:401:3: () otherlv_1= 'room' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( ( ( (lv_sensors_4_0= ruleSensor ) ) | ( (lv_actors_5_0= ruleActor ) ) ) (otherlv_6= ';' )? )* otherlv_7= '}'
            {
            // InternalMajordomoDsl.g:401:3: ()
            // InternalMajordomoDsl.g:402:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoomAccess().getRoomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getRoomKeyword_1());
            		
            // InternalMajordomoDsl.g:412:3: ( (lv_name_2_0= ruleName ) )
            // InternalMajordomoDsl.g:413:4: (lv_name_2_0= ruleName )
            {
            // InternalMajordomoDsl.g:413:4: (lv_name_2_0= ruleName )
            // InternalMajordomoDsl.g:414:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMajordomoDsl.g:435:3: ( ( ( (lv_sensors_4_0= ruleSensor ) ) | ( (lv_actors_5_0= ruleActor ) ) ) (otherlv_6= ';' )? )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=30 && LA13_0<=41)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMajordomoDsl.g:436:4: ( ( (lv_sensors_4_0= ruleSensor ) ) | ( (lv_actors_5_0= ruleActor ) ) ) (otherlv_6= ';' )?
            	    {
            	    // InternalMajordomoDsl.g:436:4: ( ( (lv_sensors_4_0= ruleSensor ) ) | ( (lv_actors_5_0= ruleActor ) ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( ((LA11_0>=30 && LA11_0<=35)) ) {
            	        alt11=1;
            	    }
            	    else if ( ((LA11_0>=36 && LA11_0<=41)) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalMajordomoDsl.g:437:5: ( (lv_sensors_4_0= ruleSensor ) )
            	            {
            	            // InternalMajordomoDsl.g:437:5: ( (lv_sensors_4_0= ruleSensor ) )
            	            // InternalMajordomoDsl.g:438:6: (lv_sensors_4_0= ruleSensor )
            	            {
            	            // InternalMajordomoDsl.g:438:6: (lv_sensors_4_0= ruleSensor )
            	            // InternalMajordomoDsl.g:439:7: lv_sensors_4_0= ruleSensor
            	            {

            	            							newCompositeNode(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_4_0_0_0());
            	            						
            	            pushFollow(FOLLOW_8);
            	            lv_sensors_4_0=ruleSensor();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getRoomRule());
            	            							}
            	            							add(
            	            								current,
            	            								"sensors",
            	            								lv_sensors_4_0,
            	            								"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Sensor");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMajordomoDsl.g:457:5: ( (lv_actors_5_0= ruleActor ) )
            	            {
            	            // InternalMajordomoDsl.g:457:5: ( (lv_actors_5_0= ruleActor ) )
            	            // InternalMajordomoDsl.g:458:6: (lv_actors_5_0= ruleActor )
            	            {
            	            // InternalMajordomoDsl.g:458:6: (lv_actors_5_0= ruleActor )
            	            // InternalMajordomoDsl.g:459:7: lv_actors_5_0= ruleActor
            	            {

            	            							newCompositeNode(grammarAccess.getRoomAccess().getActorsActorParserRuleCall_4_0_1_0());
            	            						
            	            pushFollow(FOLLOW_8);
            	            lv_actors_5_0=ruleActor();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getRoomRule());
            	            							}
            	            							add(
            	            								current,
            	            								"actors",
            	            								lv_actors_5_0,
            	            								"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Actor");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMajordomoDsl.g:477:4: (otherlv_6= ';' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==14) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalMajordomoDsl.g:478:5: otherlv_6= ';'
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            	            					newLeafNode(otherlv_6, grammarAccess.getRoomAccess().getSemicolonKeyword_4_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleSensor"
    // InternalMajordomoDsl.g:492:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalMajordomoDsl.g:492:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalMajordomoDsl.g:493:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalMajordomoDsl.g:499:1: ruleSensor returns [EObject current=null] : (this_LightSensor_0= ruleLightSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_RainSensor_2= ruleRainSensor | this_SwitchSensor_3= ruleSwitchSensor | this_NumberSensor_4= ruleNumberSensor | this_ClockSensor_5= ruleClockSensor ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        EObject this_LightSensor_0 = null;

        EObject this_TemperatureSensor_1 = null;

        EObject this_RainSensor_2 = null;

        EObject this_SwitchSensor_3 = null;

        EObject this_NumberSensor_4 = null;

        EObject this_ClockSensor_5 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:505:2: ( (this_LightSensor_0= ruleLightSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_RainSensor_2= ruleRainSensor | this_SwitchSensor_3= ruleSwitchSensor | this_NumberSensor_4= ruleNumberSensor | this_ClockSensor_5= ruleClockSensor ) )
            // InternalMajordomoDsl.g:506:2: (this_LightSensor_0= ruleLightSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_RainSensor_2= ruleRainSensor | this_SwitchSensor_3= ruleSwitchSensor | this_NumberSensor_4= ruleNumberSensor | this_ClockSensor_5= ruleClockSensor )
            {
            // InternalMajordomoDsl.g:506:2: (this_LightSensor_0= ruleLightSensor | this_TemperatureSensor_1= ruleTemperatureSensor | this_RainSensor_2= ruleRainSensor | this_SwitchSensor_3= ruleSwitchSensor | this_NumberSensor_4= ruleNumberSensor | this_ClockSensor_5= ruleClockSensor )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            case 33:
                {
                alt14=4;
                }
                break;
            case 34:
                {
                alt14=5;
                }
                break;
            case 35:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMajordomoDsl.g:507:3: this_LightSensor_0= ruleLightSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getLightSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LightSensor_0=ruleLightSensor();

                    state._fsp--;


                    			current = this_LightSensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMajordomoDsl.g:516:3: this_TemperatureSensor_1= ruleTemperatureSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getTemperatureSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TemperatureSensor_1=ruleTemperatureSensor();

                    state._fsp--;


                    			current = this_TemperatureSensor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMajordomoDsl.g:525:3: this_RainSensor_2= ruleRainSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getRainSensorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RainSensor_2=ruleRainSensor();

                    state._fsp--;


                    			current = this_RainSensor_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMajordomoDsl.g:534:3: this_SwitchSensor_3= ruleSwitchSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getSwitchSensorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SwitchSensor_3=ruleSwitchSensor();

                    state._fsp--;


                    			current = this_SwitchSensor_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMajordomoDsl.g:543:3: this_NumberSensor_4= ruleNumberSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getNumberSensorParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberSensor_4=ruleNumberSensor();

                    state._fsp--;


                    			current = this_NumberSensor_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMajordomoDsl.g:552:3: this_ClockSensor_5= ruleClockSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getClockSensorParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClockSensor_5=ruleClockSensor();

                    state._fsp--;


                    			current = this_ClockSensor_5;
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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActor"
    // InternalMajordomoDsl.g:564:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalMajordomoDsl.g:564:46: (iv_ruleActor= ruleActor EOF )
            // InternalMajordomoDsl.g:565:2: iv_ruleActor= ruleActor EOF
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
    // InternalMajordomoDsl.g:571:1: ruleActor returns [EObject current=null] : (this_LampActor_0= ruleLampActor | this_RollerActor_1= ruleRollerActor | this_RoofWindowActor_2= ruleRoofWindowActor | this_RadiatorActor_3= ruleRadiatorActor | this_BoilerActor_4= ruleBoilerActor | this_CoffeeActor_5= ruleCoffeeActor ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        EObject this_LampActor_0 = null;

        EObject this_RollerActor_1 = null;

        EObject this_RoofWindowActor_2 = null;

        EObject this_RadiatorActor_3 = null;

        EObject this_BoilerActor_4 = null;

        EObject this_CoffeeActor_5 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:577:2: ( (this_LampActor_0= ruleLampActor | this_RollerActor_1= ruleRollerActor | this_RoofWindowActor_2= ruleRoofWindowActor | this_RadiatorActor_3= ruleRadiatorActor | this_BoilerActor_4= ruleBoilerActor | this_CoffeeActor_5= ruleCoffeeActor ) )
            // InternalMajordomoDsl.g:578:2: (this_LampActor_0= ruleLampActor | this_RollerActor_1= ruleRollerActor | this_RoofWindowActor_2= ruleRoofWindowActor | this_RadiatorActor_3= ruleRadiatorActor | this_BoilerActor_4= ruleBoilerActor | this_CoffeeActor_5= ruleCoffeeActor )
            {
            // InternalMajordomoDsl.g:578:2: (this_LampActor_0= ruleLampActor | this_RollerActor_1= ruleRollerActor | this_RoofWindowActor_2= ruleRoofWindowActor | this_RadiatorActor_3= ruleRadiatorActor | this_BoilerActor_4= ruleBoilerActor | this_CoffeeActor_5= ruleCoffeeActor )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt15=1;
                }
                break;
            case 37:
                {
                alt15=2;
                }
                break;
            case 38:
                {
                alt15=3;
                }
                break;
            case 39:
                {
                alt15=4;
                }
                break;
            case 40:
                {
                alt15=5;
                }
                break;
            case 41:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMajordomoDsl.g:579:3: this_LampActor_0= ruleLampActor
                    {

                    			newCompositeNode(grammarAccess.getActorAccess().getLampActorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LampActor_0=ruleLampActor();

                    state._fsp--;


                    			current = this_LampActor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMajordomoDsl.g:588:3: this_RollerActor_1= ruleRollerActor
                    {

                    			newCompositeNode(grammarAccess.getActorAccess().getRollerActorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RollerActor_1=ruleRollerActor();

                    state._fsp--;


                    			current = this_RollerActor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMajordomoDsl.g:597:3: this_RoofWindowActor_2= ruleRoofWindowActor
                    {

                    			newCompositeNode(grammarAccess.getActorAccess().getRoofWindowActorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoofWindowActor_2=ruleRoofWindowActor();

                    state._fsp--;


                    			current = this_RoofWindowActor_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMajordomoDsl.g:606:3: this_RadiatorActor_3= ruleRadiatorActor
                    {

                    			newCompositeNode(grammarAccess.getActorAccess().getRadiatorActorParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RadiatorActor_3=ruleRadiatorActor();

                    state._fsp--;


                    			current = this_RadiatorActor_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMajordomoDsl.g:615:3: this_BoilerActor_4= ruleBoilerActor
                    {

                    			newCompositeNode(grammarAccess.getActorAccess().getBoilerActorParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoilerActor_4=ruleBoilerActor();

                    state._fsp--;


                    			current = this_BoilerActor_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMajordomoDsl.g:624:3: this_CoffeeActor_5= ruleCoffeeActor
                    {

                    			newCompositeNode(grammarAccess.getActorAccess().getCoffeeActorParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CoffeeActor_5=ruleCoffeeActor();

                    state._fsp--;


                    			current = this_CoffeeActor_5;
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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleRule"
    // InternalMajordomoDsl.g:636:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalMajordomoDsl.g:636:45: (iv_ruleRule= ruleRule EOF )
            // InternalMajordomoDsl.g:637:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMajordomoDsl.g:643:1: ruleRule returns [EObject current=null] : (otherlv_0= 'on' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'do' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statement_1_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_actions_5_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:649:2: ( (otherlv_0= 'on' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'do' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* ) )
            // InternalMajordomoDsl.g:650:2: (otherlv_0= 'on' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'do' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* )
            {
            // InternalMajordomoDsl.g:650:2: (otherlv_0= 'on' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'do' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* )
            // InternalMajordomoDsl.g:651:3: otherlv_0= 'on' ( (lv_statement_1_0= ruleStatement ) ) otherlv_2= 'do' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getOnKeyword_0());
            		
            // InternalMajordomoDsl.g:655:3: ( (lv_statement_1_0= ruleStatement ) )
            // InternalMajordomoDsl.g:656:4: (lv_statement_1_0= ruleStatement )
            {
            // InternalMajordomoDsl.g:656:4: (lv_statement_1_0= ruleStatement )
            // InternalMajordomoDsl.g:657:5: lv_statement_1_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getStatementStatementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_statement_1_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getDoKeyword_2());
            		
            // InternalMajordomoDsl.g:678:3: ( (lv_actions_3_0= ruleAction ) )
            // InternalMajordomoDsl.g:679:4: (lv_actions_3_0= ruleAction )
            {
            // InternalMajordomoDsl.g:679:4: (lv_actions_3_0= ruleAction )
            // InternalMajordomoDsl.g:680:5: lv_actions_3_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getActionsActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_actions_3_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_3_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMajordomoDsl.g:697:3: (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMajordomoDsl.g:698:4: otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMajordomoDsl.g:702:4: ( (lv_actions_5_0= ruleAction ) )
            	    // InternalMajordomoDsl.g:703:5: (lv_actions_5_0= ruleAction )
            	    {
            	    // InternalMajordomoDsl.g:703:5: (lv_actions_5_0= ruleAction )
            	    // InternalMajordomoDsl.g:704:6: lv_actions_5_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getActionsActionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_actions_5_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_5_0,
            	    							"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleStatement"
    // InternalMajordomoDsl.g:726:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMajordomoDsl.g:726:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMajordomoDsl.g:727:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMajordomoDsl.g:733:1: ruleStatement returns [EObject current=null] : this_BinaryOrOperation_0= ruleBinaryOrOperation ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryOrOperation_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:739:2: (this_BinaryOrOperation_0= ruleBinaryOrOperation )
            // InternalMajordomoDsl.g:740:2: this_BinaryOrOperation_0= ruleBinaryOrOperation
            {

            		newCompositeNode(grammarAccess.getStatementAccess().getBinaryOrOperationParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BinaryOrOperation_0=ruleBinaryOrOperation();

            state._fsp--;


            		current = this_BinaryOrOperation_0;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleBinaryOrOperation"
    // InternalMajordomoDsl.g:751:1: entryRuleBinaryOrOperation returns [EObject current=null] : iv_ruleBinaryOrOperation= ruleBinaryOrOperation EOF ;
    public final EObject entryRuleBinaryOrOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOrOperation = null;


        try {
            // InternalMajordomoDsl.g:751:58: (iv_ruleBinaryOrOperation= ruleBinaryOrOperation EOF )
            // InternalMajordomoDsl.g:752:2: iv_ruleBinaryOrOperation= ruleBinaryOrOperation EOF
            {
             newCompositeNode(grammarAccess.getBinaryOrOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOrOperation=ruleBinaryOrOperation();

            state._fsp--;

             current =iv_ruleBinaryOrOperation; 
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
    // $ANTLR end "entryRuleBinaryOrOperation"


    // $ANTLR start "ruleBinaryOrOperation"
    // InternalMajordomoDsl.g:758:1: ruleBinaryOrOperation returns [EObject current=null] : (this_BinaryAndOperation_0= ruleBinaryAndOperation ( () ruleBinaryOrOperator ( (lv_right_3_0= ruleBinaryAndOperation ) ) )* ) ;
    public final EObject ruleBinaryOrOperation() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryAndOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:764:2: ( (this_BinaryAndOperation_0= ruleBinaryAndOperation ( () ruleBinaryOrOperator ( (lv_right_3_0= ruleBinaryAndOperation ) ) )* ) )
            // InternalMajordomoDsl.g:765:2: (this_BinaryAndOperation_0= ruleBinaryAndOperation ( () ruleBinaryOrOperator ( (lv_right_3_0= ruleBinaryAndOperation ) ) )* )
            {
            // InternalMajordomoDsl.g:765:2: (this_BinaryAndOperation_0= ruleBinaryAndOperation ( () ruleBinaryOrOperator ( (lv_right_3_0= ruleBinaryAndOperation ) ) )* )
            // InternalMajordomoDsl.g:766:3: this_BinaryAndOperation_0= ruleBinaryAndOperation ( () ruleBinaryOrOperator ( (lv_right_3_0= ruleBinaryAndOperation ) ) )*
            {

            			newCompositeNode(grammarAccess.getBinaryOrOperationAccess().getBinaryAndOperationParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_BinaryAndOperation_0=ruleBinaryAndOperation();

            state._fsp--;


            			current = this_BinaryAndOperation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMajordomoDsl.g:774:3: ( () ruleBinaryOrOperator ( (lv_right_3_0= ruleBinaryAndOperation ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=46 && LA17_0<=48)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMajordomoDsl.g:775:4: () ruleBinaryOrOperator ( (lv_right_3_0= ruleBinaryAndOperation ) )
            	    {
            	    // InternalMajordomoDsl.g:775:4: ()
            	    // InternalMajordomoDsl.g:776:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBinaryOrOperationAccess().getBinaryOrOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getBinaryOrOperationAccess().getBinaryOrOperatorParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_10);
            	    ruleBinaryOrOperator();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalMajordomoDsl.g:789:4: ( (lv_right_3_0= ruleBinaryAndOperation ) )
            	    // InternalMajordomoDsl.g:790:5: (lv_right_3_0= ruleBinaryAndOperation )
            	    {
            	    // InternalMajordomoDsl.g:790:5: (lv_right_3_0= ruleBinaryAndOperation )
            	    // InternalMajordomoDsl.g:791:6: lv_right_3_0= ruleBinaryAndOperation
            	    {

            	    						newCompositeNode(grammarAccess.getBinaryOrOperationAccess().getRightBinaryAndOperationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=ruleBinaryAndOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBinaryOrOperationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.BinaryAndOperation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleBinaryOrOperation"


    // $ANTLR start "entryRuleBinaryAndOperation"
    // InternalMajordomoDsl.g:813:1: entryRuleBinaryAndOperation returns [EObject current=null] : iv_ruleBinaryAndOperation= ruleBinaryAndOperation EOF ;
    public final EObject entryRuleBinaryAndOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryAndOperation = null;


        try {
            // InternalMajordomoDsl.g:813:59: (iv_ruleBinaryAndOperation= ruleBinaryAndOperation EOF )
            // InternalMajordomoDsl.g:814:2: iv_ruleBinaryAndOperation= ruleBinaryAndOperation EOF
            {
             newCompositeNode(grammarAccess.getBinaryAndOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryAndOperation=ruleBinaryAndOperation();

            state._fsp--;

             current =iv_ruleBinaryAndOperation; 
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
    // $ANTLR end "entryRuleBinaryAndOperation"


    // $ANTLR start "ruleBinaryAndOperation"
    // InternalMajordomoDsl.g:820:1: ruleBinaryAndOperation returns [EObject current=null] : (this_NotOperation_0= ruleNotOperation ( () ruleBinaryAndOperator ( (lv_right_3_0= ruleNotOperation ) ) )* ) ;
    public final EObject ruleBinaryAndOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOperation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:826:2: ( (this_NotOperation_0= ruleNotOperation ( () ruleBinaryAndOperator ( (lv_right_3_0= ruleNotOperation ) ) )* ) )
            // InternalMajordomoDsl.g:827:2: (this_NotOperation_0= ruleNotOperation ( () ruleBinaryAndOperator ( (lv_right_3_0= ruleNotOperation ) ) )* )
            {
            // InternalMajordomoDsl.g:827:2: (this_NotOperation_0= ruleNotOperation ( () ruleBinaryAndOperator ( (lv_right_3_0= ruleNotOperation ) ) )* )
            // InternalMajordomoDsl.g:828:3: this_NotOperation_0= ruleNotOperation ( () ruleBinaryAndOperator ( (lv_right_3_0= ruleNotOperation ) ) )*
            {

            			newCompositeNode(grammarAccess.getBinaryAndOperationAccess().getNotOperationParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_NotOperation_0=ruleNotOperation();

            state._fsp--;


            			current = this_NotOperation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMajordomoDsl.g:836:3: ( () ruleBinaryAndOperator ( (lv_right_3_0= ruleNotOperation ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=43 && LA18_0<=45)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMajordomoDsl.g:837:4: () ruleBinaryAndOperator ( (lv_right_3_0= ruleNotOperation ) )
            	    {
            	    // InternalMajordomoDsl.g:837:4: ()
            	    // InternalMajordomoDsl.g:838:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBinaryAndOperationAccess().getBinaryAndOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getBinaryAndOperationAccess().getBinaryAndOperatorParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_10);
            	    ruleBinaryAndOperator();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalMajordomoDsl.g:851:4: ( (lv_right_3_0= ruleNotOperation ) )
            	    // InternalMajordomoDsl.g:852:5: (lv_right_3_0= ruleNotOperation )
            	    {
            	    // InternalMajordomoDsl.g:852:5: (lv_right_3_0= ruleNotOperation )
            	    // InternalMajordomoDsl.g:853:6: lv_right_3_0= ruleNotOperation
            	    {

            	    						newCompositeNode(grammarAccess.getBinaryAndOperationAccess().getRightNotOperationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=ruleNotOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBinaryAndOperationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.NotOperation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleBinaryAndOperation"


    // $ANTLR start "entryRuleNotOperation"
    // InternalMajordomoDsl.g:875:1: entryRuleNotOperation returns [EObject current=null] : iv_ruleNotOperation= ruleNotOperation EOF ;
    public final EObject entryRuleNotOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperation = null;


        try {
            // InternalMajordomoDsl.g:875:53: (iv_ruleNotOperation= ruleNotOperation EOF )
            // InternalMajordomoDsl.g:876:2: iv_ruleNotOperation= ruleNotOperation EOF
            {
             newCompositeNode(grammarAccess.getNotOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotOperation=ruleNotOperation();

            state._fsp--;

             current =iv_ruleNotOperation; 
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
    // $ANTLR end "entryRuleNotOperation"


    // $ANTLR start "ruleNotOperation"
    // InternalMajordomoDsl.g:882:1: ruleNotOperation returns [EObject current=null] : (this_UnaryStatement_0= ruleUnaryStatement | ( () (otherlv_2= 'not' | otherlv_3= '!' ) ( (lv_statement_4_0= ruleUnaryStatement ) ) ) ) ;
    public final EObject ruleNotOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_UnaryStatement_0 = null;

        EObject lv_statement_4_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:888:2: ( (this_UnaryStatement_0= ruleUnaryStatement | ( () (otherlv_2= 'not' | otherlv_3= '!' ) ( (lv_statement_4_0= ruleUnaryStatement ) ) ) ) )
            // InternalMajordomoDsl.g:889:2: (this_UnaryStatement_0= ruleUnaryStatement | ( () (otherlv_2= 'not' | otherlv_3= '!' ) ( (lv_statement_4_0= ruleUnaryStatement ) ) ) )
            {
            // InternalMajordomoDsl.g:889:2: (this_UnaryStatement_0= ruleUnaryStatement | ( () (otherlv_2= 'not' | otherlv_3= '!' ) ( (lv_statement_4_0= ruleUnaryStatement ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==EOF||(LA20_0>=RULE_ID && LA20_0<=RULE_INT)||(LA20_0>=14 && LA20_0<=15)||(LA20_0>=18 && LA20_0<=20)||(LA20_0>=23 && LA20_0<=24)||LA20_0==26||(LA20_0>=28 && LA20_0<=29)||(LA20_0>=42 && LA20_0<=49)||(LA20_0>=54 && LA20_0<=57)) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=21 && LA20_0<=22)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMajordomoDsl.g:890:3: this_UnaryStatement_0= ruleUnaryStatement
                    {

                    			newCompositeNode(grammarAccess.getNotOperationAccess().getUnaryStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnaryStatement_0=ruleUnaryStatement();

                    state._fsp--;


                    			current = this_UnaryStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMajordomoDsl.g:899:3: ( () (otherlv_2= 'not' | otherlv_3= '!' ) ( (lv_statement_4_0= ruleUnaryStatement ) ) )
                    {
                    // InternalMajordomoDsl.g:899:3: ( () (otherlv_2= 'not' | otherlv_3= '!' ) ( (lv_statement_4_0= ruleUnaryStatement ) ) )
                    // InternalMajordomoDsl.g:900:4: () (otherlv_2= 'not' | otherlv_3= '!' ) ( (lv_statement_4_0= ruleUnaryStatement ) )
                    {
                    // InternalMajordomoDsl.g:900:4: ()
                    // InternalMajordomoDsl.g:901:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotOperationAccess().getNotOperationAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMajordomoDsl.g:907:4: (otherlv_2= 'not' | otherlv_3= '!' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==21) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==22) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalMajordomoDsl.g:908:5: otherlv_2= 'not'
                            {
                            otherlv_2=(Token)match(input,21,FOLLOW_15); 

                            					newLeafNode(otherlv_2, grammarAccess.getNotOperationAccess().getNotKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMajordomoDsl.g:913:5: otherlv_3= '!'
                            {
                            otherlv_3=(Token)match(input,22,FOLLOW_15); 

                            					newLeafNode(otherlv_3, grammarAccess.getNotOperationAccess().getExclamationMarkKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    // InternalMajordomoDsl.g:918:4: ( (lv_statement_4_0= ruleUnaryStatement ) )
                    // InternalMajordomoDsl.g:919:5: (lv_statement_4_0= ruleUnaryStatement )
                    {
                    // InternalMajordomoDsl.g:919:5: (lv_statement_4_0= ruleUnaryStatement )
                    // InternalMajordomoDsl.g:920:6: lv_statement_4_0= ruleUnaryStatement
                    {

                    						newCompositeNode(grammarAccess.getNotOperationAccess().getStatementUnaryStatementParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_statement_4_0=ruleUnaryStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotOperationRule());
                    						}
                    						set(
                    							current,
                    							"statement",
                    							lv_statement_4_0,
                    							"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.UnaryStatement");
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
    // $ANTLR end "ruleNotOperation"


    // $ANTLR start "entryRuleUnaryStatement"
    // InternalMajordomoDsl.g:942:1: entryRuleUnaryStatement returns [EObject current=null] : iv_ruleUnaryStatement= ruleUnaryStatement EOF ;
    public final EObject entryRuleUnaryStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryStatement = null;


        try {
            // InternalMajordomoDsl.g:942:55: (iv_ruleUnaryStatement= ruleUnaryStatement EOF )
            // InternalMajordomoDsl.g:943:2: iv_ruleUnaryStatement= ruleUnaryStatement EOF
            {
             newCompositeNode(grammarAccess.getUnaryStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryStatement=ruleUnaryStatement();

            state._fsp--;

             current =iv_ruleUnaryStatement; 
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
    // $ANTLR end "entryRuleUnaryStatement"


    // $ANTLR start "ruleUnaryStatement"
    // InternalMajordomoDsl.g:949:1: ruleUnaryStatement returns [EObject current=null] : ( (otherlv_0= '(' this_Statement_1= ruleStatement otherlv_2= ')' ) | this_StatementReference_3= ruleStatementReference | this_BooleanSensorStatement_4= ruleBooleanSensorStatement | this_CompareOperation_5= ruleCompareOperation ) ;
    public final EObject ruleUnaryStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Statement_1 = null;

        EObject this_StatementReference_3 = null;

        EObject this_BooleanSensorStatement_4 = null;

        EObject this_CompareOperation_5 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:955:2: ( ( (otherlv_0= '(' this_Statement_1= ruleStatement otherlv_2= ')' ) | this_StatementReference_3= ruleStatementReference | this_BooleanSensorStatement_4= ruleBooleanSensorStatement | this_CompareOperation_5= ruleCompareOperation ) )
            // InternalMajordomoDsl.g:956:2: ( (otherlv_0= '(' this_Statement_1= ruleStatement otherlv_2= ')' ) | this_StatementReference_3= ruleStatementReference | this_BooleanSensorStatement_4= ruleBooleanSensorStatement | this_CompareOperation_5= ruleCompareOperation )
            {
            // InternalMajordomoDsl.g:956:2: ( (otherlv_0= '(' this_Statement_1= ruleStatement otherlv_2= ')' ) | this_StatementReference_3= ruleStatementReference | this_BooleanSensorStatement_4= ruleBooleanSensorStatement | this_CompareOperation_5= ruleCompareOperation )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalMajordomoDsl.g:957:3: (otherlv_0= '(' this_Statement_1= ruleStatement otherlv_2= ')' )
                    {
                    // InternalMajordomoDsl.g:957:3: (otherlv_0= '(' this_Statement_1= ruleStatement otherlv_2= ')' )
                    // InternalMajordomoDsl.g:958:4: otherlv_0= '(' this_Statement_1= ruleStatement otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getUnaryStatementAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getUnaryStatementAccess().getStatementParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_16);
                    this_Statement_1=ruleStatement();

                    state._fsp--;


                    				current = this_Statement_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getUnaryStatementAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMajordomoDsl.g:976:3: this_StatementReference_3= ruleStatementReference
                    {

                    			newCompositeNode(grammarAccess.getUnaryStatementAccess().getStatementReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StatementReference_3=ruleStatementReference();

                    state._fsp--;


                    			current = this_StatementReference_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMajordomoDsl.g:985:3: this_BooleanSensorStatement_4= ruleBooleanSensorStatement
                    {

                    			newCompositeNode(grammarAccess.getUnaryStatementAccess().getBooleanSensorStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanSensorStatement_4=ruleBooleanSensorStatement();

                    state._fsp--;


                    			current = this_BooleanSensorStatement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMajordomoDsl.g:994:3: this_CompareOperation_5= ruleCompareOperation
                    {

                    			newCompositeNode(grammarAccess.getUnaryStatementAccess().getCompareOperationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompareOperation_5=ruleCompareOperation();

                    state._fsp--;


                    			current = this_CompareOperation_5;
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
    // $ANTLR end "ruleUnaryStatement"


    // $ANTLR start "entryRuleBooleanSensorStatement"
    // InternalMajordomoDsl.g:1006:1: entryRuleBooleanSensorStatement returns [EObject current=null] : iv_ruleBooleanSensorStatement= ruleBooleanSensorStatement EOF ;
    public final EObject entryRuleBooleanSensorStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanSensorStatement = null;


        try {
            // InternalMajordomoDsl.g:1006:63: (iv_ruleBooleanSensorStatement= ruleBooleanSensorStatement EOF )
            // InternalMajordomoDsl.g:1007:2: iv_ruleBooleanSensorStatement= ruleBooleanSensorStatement EOF
            {
             newCompositeNode(grammarAccess.getBooleanSensorStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanSensorStatement=ruleBooleanSensorStatement();

            state._fsp--;

             current =iv_ruleBooleanSensorStatement; 
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
    // $ANTLR end "entryRuleBooleanSensorStatement"


    // $ANTLR start "ruleBooleanSensorStatement"
    // InternalMajordomoDsl.g:1013:1: ruleBooleanSensorStatement returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '?' ) ;
    public final EObject ruleBooleanSensorStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMajordomoDsl.g:1019:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '?' ) )
            // InternalMajordomoDsl.g:1020:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '?' )
            {
            // InternalMajordomoDsl.g:1020:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '?' )
            // InternalMajordomoDsl.g:1021:3: ( ( ruleQualifiedName ) ) otherlv_1= '?'
            {
            // InternalMajordomoDsl.g:1021:3: ( ( ruleQualifiedName ) )
            // InternalMajordomoDsl.g:1022:4: ( ruleQualifiedName )
            {
            // InternalMajordomoDsl.g:1022:4: ( ruleQualifiedName )
            // InternalMajordomoDsl.g:1023:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanSensorStatementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBooleanSensorStatementAccess().getSensorBooleanSensorCrossReference_0_0());
            				
            pushFollow(FOLLOW_17);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanSensorStatementAccess().getQuestionMarkKeyword_1());
            		

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
    // $ANTLR end "ruleBooleanSensorStatement"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalMajordomoDsl.g:1045:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalMajordomoDsl.g:1045:57: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalMajordomoDsl.g:1046:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
             newCompositeNode(grammarAccess.getCompareOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;

             current =iv_ruleCompareOperation; 
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
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // InternalMajordomoDsl.g:1052:1: ruleCompareOperation returns [EObject current=null] : ( ( (lv_left_0_0= ruleValueExpression ) ) ( (lv_comparator_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleValueExpression ) ) ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_comparator_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1058:2: ( ( ( (lv_left_0_0= ruleValueExpression ) ) ( (lv_comparator_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleValueExpression ) ) ) )
            // InternalMajordomoDsl.g:1059:2: ( ( (lv_left_0_0= ruleValueExpression ) ) ( (lv_comparator_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleValueExpression ) ) )
            {
            // InternalMajordomoDsl.g:1059:2: ( ( (lv_left_0_0= ruleValueExpression ) ) ( (lv_comparator_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleValueExpression ) ) )
            // InternalMajordomoDsl.g:1060:3: ( (lv_left_0_0= ruleValueExpression ) ) ( (lv_comparator_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleValueExpression ) )
            {
            // InternalMajordomoDsl.g:1060:3: ( (lv_left_0_0= ruleValueExpression ) )
            // InternalMajordomoDsl.g:1061:4: (lv_left_0_0= ruleValueExpression )
            {
            // InternalMajordomoDsl.g:1061:4: (lv_left_0_0= ruleValueExpression )
            // InternalMajordomoDsl.g:1062:5: lv_left_0_0= ruleValueExpression
            {

            					newCompositeNode(grammarAccess.getCompareOperationAccess().getLeftValueExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_left_0_0=ruleValueExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompareOperationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.ValueExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMajordomoDsl.g:1079:3: ( (lv_comparator_1_0= ruleComparator ) )
            // InternalMajordomoDsl.g:1080:4: (lv_comparator_1_0= ruleComparator )
            {
            // InternalMajordomoDsl.g:1080:4: (lv_comparator_1_0= ruleComparator )
            // InternalMajordomoDsl.g:1081:5: lv_comparator_1_0= ruleComparator
            {

            					newCompositeNode(grammarAccess.getCompareOperationAccess().getComparatorComparatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_comparator_1_0=ruleComparator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompareOperationRule());
            					}
            					set(
            						current,
            						"comparator",
            						lv_comparator_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Comparator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMajordomoDsl.g:1098:3: ( (lv_right_2_0= ruleValueExpression ) )
            // InternalMajordomoDsl.g:1099:4: (lv_right_2_0= ruleValueExpression )
            {
            // InternalMajordomoDsl.g:1099:4: (lv_right_2_0= ruleValueExpression )
            // InternalMajordomoDsl.g:1100:5: lv_right_2_0= ruleValueExpression
            {

            					newCompositeNode(grammarAccess.getCompareOperationAccess().getRightValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleValueExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompareOperationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.ValueExpression");
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
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleValueExpression"
    // InternalMajordomoDsl.g:1121:1: entryRuleValueExpression returns [EObject current=null] : iv_ruleValueExpression= ruleValueExpression EOF ;
    public final EObject entryRuleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpression = null;


        try {
            // InternalMajordomoDsl.g:1121:56: (iv_ruleValueExpression= ruleValueExpression EOF )
            // InternalMajordomoDsl.g:1122:2: iv_ruleValueExpression= ruleValueExpression EOF
            {
             newCompositeNode(grammarAccess.getValueExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueExpression=ruleValueExpression();

            state._fsp--;

             current =iv_ruleValueExpression; 
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
    // $ANTLR end "entryRuleValueExpression"


    // $ANTLR start "ruleValueExpression"
    // InternalMajordomoDsl.g:1128:1: ruleValueExpression returns [EObject current=null] : (this_SensorValue_0= ruleSensorValue | this_ConstantValue_1= ruleConstantValue | this_ValueReference_2= ruleValueReference ) ;
    public final EObject ruleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SensorValue_0 = null;

        EObject this_ConstantValue_1 = null;

        EObject this_ValueReference_2 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1134:2: ( (this_SensorValue_0= ruleSensorValue | this_ConstantValue_1= ruleConstantValue | this_ValueReference_2= ruleValueReference ) )
            // InternalMajordomoDsl.g:1135:2: (this_SensorValue_0= ruleSensorValue | this_ConstantValue_1= ruleConstantValue | this_ValueReference_2= ruleValueReference )
            {
            // InternalMajordomoDsl.g:1135:2: (this_SensorValue_0= ruleSensorValue | this_ConstantValue_1= ruleConstantValue | this_ValueReference_2= ruleValueReference )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt22=1;
                }
                break;
            case EOF:
            case RULE_INT:
            case 14:
            case 15:
            case 18:
            case 19:
            case 20:
            case 24:
            case 26:
            case 28:
            case 29:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt22=2;
                }
                break;
            case RULE_CONST:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMajordomoDsl.g:1136:3: this_SensorValue_0= ruleSensorValue
                    {

                    			newCompositeNode(grammarAccess.getValueExpressionAccess().getSensorValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SensorValue_0=ruleSensorValue();

                    state._fsp--;


                    			current = this_SensorValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMajordomoDsl.g:1145:3: this_ConstantValue_1= ruleConstantValue
                    {

                    			newCompositeNode(grammarAccess.getValueExpressionAccess().getConstantValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstantValue_1=ruleConstantValue();

                    state._fsp--;


                    			current = this_ConstantValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMajordomoDsl.g:1154:3: this_ValueReference_2= ruleValueReference
                    {

                    			newCompositeNode(grammarAccess.getValueExpressionAccess().getValueReferenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueReference_2=ruleValueReference();

                    state._fsp--;


                    			current = this_ValueReference_2;
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
    // $ANTLR end "ruleValueExpression"


    // $ANTLR start "entryRuleSensorValue"
    // InternalMajordomoDsl.g:1166:1: entryRuleSensorValue returns [EObject current=null] : iv_ruleSensorValue= ruleSensorValue EOF ;
    public final EObject entryRuleSensorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorValue = null;


        try {
            // InternalMajordomoDsl.g:1166:52: (iv_ruleSensorValue= ruleSensorValue EOF )
            // InternalMajordomoDsl.g:1167:2: iv_ruleSensorValue= ruleSensorValue EOF
            {
             newCompositeNode(grammarAccess.getSensorValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorValue=ruleSensorValue();

            state._fsp--;

             current =iv_ruleSensorValue; 
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
    // $ANTLR end "entryRuleSensorValue"


    // $ANTLR start "ruleSensorValue"
    // InternalMajordomoDsl.g:1173:1: ruleSensorValue returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSensorValue() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalMajordomoDsl.g:1179:2: ( ( ( ruleQualifiedName ) ) )
            // InternalMajordomoDsl.g:1180:2: ( ( ruleQualifiedName ) )
            {
            // InternalMajordomoDsl.g:1180:2: ( ( ruleQualifiedName ) )
            // InternalMajordomoDsl.g:1181:3: ( ruleQualifiedName )
            {
            // InternalMajordomoDsl.g:1181:3: ( ruleQualifiedName )
            // InternalMajordomoDsl.g:1182:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSensorValueRule());
            				}
            			

            				newCompositeNode(grammarAccess.getSensorValueAccess().getSensorFloatSensorCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "ruleSensorValue"


    // $ANTLR start "entryRuleConstantValue"
    // InternalMajordomoDsl.g:1199:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalMajordomoDsl.g:1199:54: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalMajordomoDsl.g:1200:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             newCompositeNode(grammarAccess.getConstantValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;

             current =iv_ruleConstantValue; 
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
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // InternalMajordomoDsl.g:1206:1: ruleConstantValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloat ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1212:2: ( ( (lv_value_0_0= ruleEFloat ) ) )
            // InternalMajordomoDsl.g:1213:2: ( (lv_value_0_0= ruleEFloat ) )
            {
            // InternalMajordomoDsl.g:1213:2: ( (lv_value_0_0= ruleEFloat ) )
            // InternalMajordomoDsl.g:1214:3: (lv_value_0_0= ruleEFloat )
            {
            // InternalMajordomoDsl.g:1214:3: (lv_value_0_0= ruleEFloat )
            // InternalMajordomoDsl.g:1215:4: lv_value_0_0= ruleEFloat
            {

            				newCompositeNode(grammarAccess.getConstantValueAccess().getValueEFloatParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEFloat();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConstantValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.EFloat");
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
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "entryRuleValueReference"
    // InternalMajordomoDsl.g:1235:1: entryRuleValueReference returns [EObject current=null] : iv_ruleValueReference= ruleValueReference EOF ;
    public final EObject entryRuleValueReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueReference = null;


        try {
            // InternalMajordomoDsl.g:1235:55: (iv_ruleValueReference= ruleValueReference EOF )
            // InternalMajordomoDsl.g:1236:2: iv_ruleValueReference= ruleValueReference EOF
            {
             newCompositeNode(grammarAccess.getValueReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueReference=ruleValueReference();

            state._fsp--;

             current =iv_ruleValueReference; 
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
    // $ANTLR end "entryRuleValueReference"


    // $ANTLR start "ruleValueReference"
    // InternalMajordomoDsl.g:1242:1: ruleValueReference returns [EObject current=null] : ( ( ruleConstID ) ) ;
    public final EObject ruleValueReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalMajordomoDsl.g:1248:2: ( ( ( ruleConstID ) ) )
            // InternalMajordomoDsl.g:1249:2: ( ( ruleConstID ) )
            {
            // InternalMajordomoDsl.g:1249:2: ( ( ruleConstID ) )
            // InternalMajordomoDsl.g:1250:3: ( ruleConstID )
            {
            // InternalMajordomoDsl.g:1250:3: ( ruleConstID )
            // InternalMajordomoDsl.g:1251:4: ruleConstID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getValueReferenceRule());
            				}
            			

            				newCompositeNode(grammarAccess.getValueReferenceAccess().getRefPreparedValueCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleConstID();

            state._fsp--;


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
    // $ANTLR end "ruleValueReference"


    // $ANTLR start "entryRulePreparedStatement"
    // InternalMajordomoDsl.g:1268:1: entryRulePreparedStatement returns [EObject current=null] : iv_rulePreparedStatement= rulePreparedStatement EOF ;
    public final EObject entryRulePreparedStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreparedStatement = null;


        try {
            // InternalMajordomoDsl.g:1268:58: (iv_rulePreparedStatement= rulePreparedStatement EOF )
            // InternalMajordomoDsl.g:1269:2: iv_rulePreparedStatement= rulePreparedStatement EOF
            {
             newCompositeNode(grammarAccess.getPreparedStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreparedStatement=rulePreparedStatement();

            state._fsp--;

             current =iv_rulePreparedStatement; 
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
    // $ANTLR end "entryRulePreparedStatement"


    // $ANTLR start "rulePreparedStatement"
    // InternalMajordomoDsl.g:1275:1: rulePreparedStatement returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= ruleName ) ) otherlv_2= ':' ( (lv_statement_3_0= ruleStatement ) ) ) ;
    public final EObject rulePreparedStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1281:2: ( (otherlv_0= 'def' ( (lv_name_1_0= ruleName ) ) otherlv_2= ':' ( (lv_statement_3_0= ruleStatement ) ) ) )
            // InternalMajordomoDsl.g:1282:2: (otherlv_0= 'def' ( (lv_name_1_0= ruleName ) ) otherlv_2= ':' ( (lv_statement_3_0= ruleStatement ) ) )
            {
            // InternalMajordomoDsl.g:1282:2: (otherlv_0= 'def' ( (lv_name_1_0= ruleName ) ) otherlv_2= ':' ( (lv_statement_3_0= ruleStatement ) ) )
            // InternalMajordomoDsl.g:1283:3: otherlv_0= 'def' ( (lv_name_1_0= ruleName ) ) otherlv_2= ':' ( (lv_statement_3_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPreparedStatementAccess().getDefKeyword_0());
            		
            // InternalMajordomoDsl.g:1287:3: ( (lv_name_1_0= ruleName ) )
            // InternalMajordomoDsl.g:1288:4: (lv_name_1_0= ruleName )
            {
            // InternalMajordomoDsl.g:1288:4: (lv_name_1_0= ruleName )
            // InternalMajordomoDsl.g:1289:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getPreparedStatementAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreparedStatementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPreparedStatementAccess().getColonKeyword_2());
            		
            // InternalMajordomoDsl.g:1310:3: ( (lv_statement_3_0= ruleStatement ) )
            // InternalMajordomoDsl.g:1311:4: (lv_statement_3_0= ruleStatement )
            {
            // InternalMajordomoDsl.g:1311:4: (lv_statement_3_0= ruleStatement )
            // InternalMajordomoDsl.g:1312:5: lv_statement_3_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getPreparedStatementAccess().getStatementStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_3_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreparedStatementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_3_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Statement");
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
    // $ANTLR end "rulePreparedStatement"


    // $ANTLR start "entryRuleStatementReference"
    // InternalMajordomoDsl.g:1333:1: entryRuleStatementReference returns [EObject current=null] : iv_ruleStatementReference= ruleStatementReference EOF ;
    public final EObject entryRuleStatementReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementReference = null;


        try {
            // InternalMajordomoDsl.g:1333:59: (iv_ruleStatementReference= ruleStatementReference EOF )
            // InternalMajordomoDsl.g:1334:2: iv_ruleStatementReference= ruleStatementReference EOF
            {
             newCompositeNode(grammarAccess.getStatementReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatementReference=ruleStatementReference();

            state._fsp--;

             current =iv_ruleStatementReference; 
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
    // $ANTLR end "entryRuleStatementReference"


    // $ANTLR start "ruleStatementReference"
    // InternalMajordomoDsl.g:1340:1: ruleStatementReference returns [EObject current=null] : ( ( ruleName ) ) ;
    public final EObject ruleStatementReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalMajordomoDsl.g:1346:2: ( ( ( ruleName ) ) )
            // InternalMajordomoDsl.g:1347:2: ( ( ruleName ) )
            {
            // InternalMajordomoDsl.g:1347:2: ( ( ruleName ) )
            // InternalMajordomoDsl.g:1348:3: ( ruleName )
            {
            // InternalMajordomoDsl.g:1348:3: ( ruleName )
            // InternalMajordomoDsl.g:1349:4: ruleName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStatementReferenceRule());
            				}
            			

            				newCompositeNode(grammarAccess.getStatementReferenceAccess().getRefPreparedStatementCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;


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
    // $ANTLR end "ruleStatementReference"


    // $ANTLR start "entryRulePreparedActionSet"
    // InternalMajordomoDsl.g:1366:1: entryRulePreparedActionSet returns [EObject current=null] : iv_rulePreparedActionSet= rulePreparedActionSet EOF ;
    public final EObject entryRulePreparedActionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreparedActionSet = null;


        try {
            // InternalMajordomoDsl.g:1366:58: (iv_rulePreparedActionSet= rulePreparedActionSet EOF )
            // InternalMajordomoDsl.g:1367:2: iv_rulePreparedActionSet= rulePreparedActionSet EOF
            {
             newCompositeNode(grammarAccess.getPreparedActionSetRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreparedActionSet=rulePreparedActionSet();

            state._fsp--;

             current =iv_rulePreparedActionSet; 
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
    // $ANTLR end "entryRulePreparedActionSet"


    // $ANTLR start "rulePreparedActionSet"
    // InternalMajordomoDsl.g:1373:1: rulePreparedActionSet returns [EObject current=null] : (otherlv_0= 'set' ( (lv_name_1_0= ruleName ) ) otherlv_2= ':' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* ) ;
    public final EObject rulePreparedActionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_actions_5_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1379:2: ( (otherlv_0= 'set' ( (lv_name_1_0= ruleName ) ) otherlv_2= ':' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* ) )
            // InternalMajordomoDsl.g:1380:2: (otherlv_0= 'set' ( (lv_name_1_0= ruleName ) ) otherlv_2= ':' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* )
            {
            // InternalMajordomoDsl.g:1380:2: (otherlv_0= 'set' ( (lv_name_1_0= ruleName ) ) otherlv_2= ':' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* )
            // InternalMajordomoDsl.g:1381:3: otherlv_0= 'set' ( (lv_name_1_0= ruleName ) ) otherlv_2= ':' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPreparedActionSetAccess().getSetKeyword_0());
            		
            // InternalMajordomoDsl.g:1385:3: ( (lv_name_1_0= ruleName ) )
            // InternalMajordomoDsl.g:1386:4: (lv_name_1_0= ruleName )
            {
            // InternalMajordomoDsl.g:1386:4: (lv_name_1_0= ruleName )
            // InternalMajordomoDsl.g:1387:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getPreparedActionSetAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreparedActionSetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPreparedActionSetAccess().getColonKeyword_2());
            		
            // InternalMajordomoDsl.g:1408:3: ( (lv_actions_3_0= ruleAction ) )
            // InternalMajordomoDsl.g:1409:4: (lv_actions_3_0= ruleAction )
            {
            // InternalMajordomoDsl.g:1409:4: (lv_actions_3_0= ruleAction )
            // InternalMajordomoDsl.g:1410:5: lv_actions_3_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getPreparedActionSetAccess().getActionsActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_actions_3_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreparedActionSetRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_3_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMajordomoDsl.g:1427:3: (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMajordomoDsl.g:1428:4: otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPreparedActionSetAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMajordomoDsl.g:1432:4: ( (lv_actions_5_0= ruleAction ) )
            	    // InternalMajordomoDsl.g:1433:5: (lv_actions_5_0= ruleAction )
            	    {
            	    // InternalMajordomoDsl.g:1433:5: (lv_actions_5_0= ruleAction )
            	    // InternalMajordomoDsl.g:1434:6: lv_actions_5_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getPreparedActionSetAccess().getActionsActionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_actions_5_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPreparedActionSetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_5_0,
            	    							"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "rulePreparedActionSet"


    // $ANTLR start "entryRuleActionSetReference"
    // InternalMajordomoDsl.g:1456:1: entryRuleActionSetReference returns [EObject current=null] : iv_ruleActionSetReference= ruleActionSetReference EOF ;
    public final EObject entryRuleActionSetReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSetReference = null;


        try {
            // InternalMajordomoDsl.g:1456:59: (iv_ruleActionSetReference= ruleActionSetReference EOF )
            // InternalMajordomoDsl.g:1457:2: iv_ruleActionSetReference= ruleActionSetReference EOF
            {
             newCompositeNode(grammarAccess.getActionSetReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionSetReference=ruleActionSetReference();

            state._fsp--;

             current =iv_ruleActionSetReference; 
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
    // $ANTLR end "entryRuleActionSetReference"


    // $ANTLR start "ruleActionSetReference"
    // InternalMajordomoDsl.g:1463:1: ruleActionSetReference returns [EObject current=null] : ( ( ruleName ) ) ;
    public final EObject ruleActionSetReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalMajordomoDsl.g:1469:2: ( ( ( ruleName ) ) )
            // InternalMajordomoDsl.g:1470:2: ( ( ruleName ) )
            {
            // InternalMajordomoDsl.g:1470:2: ( ( ruleName ) )
            // InternalMajordomoDsl.g:1471:3: ( ruleName )
            {
            // InternalMajordomoDsl.g:1471:3: ( ruleName )
            // InternalMajordomoDsl.g:1472:4: ruleName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getActionSetReferenceRule());
            				}
            			

            				newCompositeNode(grammarAccess.getActionSetReferenceAccess().getRefPreparedActionSetCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;


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
    // $ANTLR end "ruleActionSetReference"


    // $ANTLR start "entryRulePreparedValue"
    // InternalMajordomoDsl.g:1489:1: entryRulePreparedValue returns [EObject current=null] : iv_rulePreparedValue= rulePreparedValue EOF ;
    public final EObject entryRulePreparedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreparedValue = null;


        try {
            // InternalMajordomoDsl.g:1489:54: (iv_rulePreparedValue= rulePreparedValue EOF )
            // InternalMajordomoDsl.g:1490:2: iv_rulePreparedValue= rulePreparedValue EOF
            {
             newCompositeNode(grammarAccess.getPreparedValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreparedValue=rulePreparedValue();

            state._fsp--;

             current =iv_rulePreparedValue; 
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
    // $ANTLR end "entryRulePreparedValue"


    // $ANTLR start "rulePreparedValue"
    // InternalMajordomoDsl.g:1496:1: rulePreparedValue returns [EObject current=null] : (otherlv_0= 'val' ( (lv_name_1_0= ruleConstID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleValueExpression ) ) ) ;
    public final EObject rulePreparedValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1502:2: ( (otherlv_0= 'val' ( (lv_name_1_0= ruleConstID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleValueExpression ) ) ) )
            // InternalMajordomoDsl.g:1503:2: (otherlv_0= 'val' ( (lv_name_1_0= ruleConstID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleValueExpression ) ) )
            {
            // InternalMajordomoDsl.g:1503:2: (otherlv_0= 'val' ( (lv_name_1_0= ruleConstID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleValueExpression ) ) )
            // InternalMajordomoDsl.g:1504:3: otherlv_0= 'val' ( (lv_name_1_0= ruleConstID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleValueExpression ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPreparedValueAccess().getValKeyword_0());
            		
            // InternalMajordomoDsl.g:1508:3: ( (lv_name_1_0= ruleConstID ) )
            // InternalMajordomoDsl.g:1509:4: (lv_name_1_0= ruleConstID )
            {
            // InternalMajordomoDsl.g:1509:4: (lv_name_1_0= ruleConstID )
            // InternalMajordomoDsl.g:1510:5: lv_name_1_0= ruleConstID
            {

            					newCompositeNode(grammarAccess.getPreparedValueAccess().getNameConstIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_1_0=ruleConstID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreparedValueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.ConstID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getPreparedValueAccess().getColonKeyword_2());
            		
            // InternalMajordomoDsl.g:1531:3: ( (lv_value_3_0= ruleValueExpression ) )
            // InternalMajordomoDsl.g:1532:4: (lv_value_3_0= ruleValueExpression )
            {
            // InternalMajordomoDsl.g:1532:4: (lv_value_3_0= ruleValueExpression )
            // InternalMajordomoDsl.g:1533:5: lv_value_3_0= ruleValueExpression
            {

            					newCompositeNode(grammarAccess.getPreparedValueAccess().getValueValueExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleValueExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreparedValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.ValueExpression");
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
    // $ANTLR end "rulePreparedValue"


    // $ANTLR start "entryRuleAction"
    // InternalMajordomoDsl.g:1554:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMajordomoDsl.g:1554:47: (iv_ruleAction= ruleAction EOF )
            // InternalMajordomoDsl.g:1555:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMajordomoDsl.g:1561:1: ruleAction returns [EObject current=null] : (this_BooleanAction_0= ruleBooleanAction | this_FloatAction_1= ruleFloatAction | this_ActionSetReference_2= ruleActionSetReference ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanAction_0 = null;

        EObject this_FloatAction_1 = null;

        EObject this_ActionSetReference_2 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1567:2: ( (this_BooleanAction_0= ruleBooleanAction | this_FloatAction_1= ruleFloatAction | this_ActionSetReference_2= ruleActionSetReference ) )
            // InternalMajordomoDsl.g:1568:2: (this_BooleanAction_0= ruleBooleanAction | this_FloatAction_1= ruleFloatAction | this_ActionSetReference_2= ruleActionSetReference )
            {
            // InternalMajordomoDsl.g:1568:2: (this_BooleanAction_0= ruleBooleanAction | this_FloatAction_1= ruleFloatAction | this_ActionSetReference_2= ruleActionSetReference )
            int alt24=3;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalMajordomoDsl.g:1569:3: this_BooleanAction_0= ruleBooleanAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getBooleanActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanAction_0=ruleBooleanAction();

                    state._fsp--;


                    			current = this_BooleanAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMajordomoDsl.g:1578:3: this_FloatAction_1= ruleFloatAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getFloatActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatAction_1=ruleFloatAction();

                    state._fsp--;


                    			current = this_FloatAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMajordomoDsl.g:1587:3: this_ActionSetReference_2= ruleActionSetReference
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getActionSetReferenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionSetReference_2=ruleActionSetReference();

                    state._fsp--;


                    			current = this_ActionSetReference_2;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleBooleanAction"
    // InternalMajordomoDsl.g:1599:1: entryRuleBooleanAction returns [EObject current=null] : iv_ruleBooleanAction= ruleBooleanAction EOF ;
    public final EObject entryRuleBooleanAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAction = null;


        try {
            // InternalMajordomoDsl.g:1599:54: (iv_ruleBooleanAction= ruleBooleanAction EOF )
            // InternalMajordomoDsl.g:1600:2: iv_ruleBooleanAction= ruleBooleanAction EOF
            {
             newCompositeNode(grammarAccess.getBooleanActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanAction=ruleBooleanAction();

            state._fsp--;

             current =iv_ruleBooleanAction; 
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
    // $ANTLR end "entryRuleBooleanAction"


    // $ANTLR start "ruleBooleanAction"
    // InternalMajordomoDsl.g:1606:1: ruleBooleanAction returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEBoolean ) ) ) ;
    public final EObject ruleBooleanAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1612:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEBoolean ) ) ) )
            // InternalMajordomoDsl.g:1613:2: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEBoolean ) ) )
            {
            // InternalMajordomoDsl.g:1613:2: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEBoolean ) ) )
            // InternalMajordomoDsl.g:1614:3: ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEBoolean ) )
            {
            // InternalMajordomoDsl.g:1614:3: ( ( ruleQualifiedName ) )
            // InternalMajordomoDsl.g:1615:4: ( ruleQualifiedName )
            {
            // InternalMajordomoDsl.g:1615:4: ( ruleQualifiedName )
            // InternalMajordomoDsl.g:1616:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBooleanActionAccess().getActorBooleanActorCrossReference_0_0());
            				
            pushFollow(FOLLOW_19);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanActionAccess().getColonKeyword_1());
            		
            // InternalMajordomoDsl.g:1634:3: ( (lv_value_2_0= ruleEBoolean ) )
            // InternalMajordomoDsl.g:1635:4: (lv_value_2_0= ruleEBoolean )
            {
            // InternalMajordomoDsl.g:1635:4: (lv_value_2_0= ruleEBoolean )
            // InternalMajordomoDsl.g:1636:5: lv_value_2_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getBooleanActionAccess().getValueEBooleanParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanActionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.EBoolean");
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
    // $ANTLR end "ruleBooleanAction"


    // $ANTLR start "entryRuleFloatAction"
    // InternalMajordomoDsl.g:1657:1: entryRuleFloatAction returns [EObject current=null] : iv_ruleFloatAction= ruleFloatAction EOF ;
    public final EObject entryRuleFloatAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatAction = null;


        try {
            // InternalMajordomoDsl.g:1657:52: (iv_ruleFloatAction= ruleFloatAction EOF )
            // InternalMajordomoDsl.g:1658:2: iv_ruleFloatAction= ruleFloatAction EOF
            {
             newCompositeNode(grammarAccess.getFloatActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatAction=ruleFloatAction();

            state._fsp--;

             current =iv_ruleFloatAction; 
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
    // $ANTLR end "entryRuleFloatAction"


    // $ANTLR start "ruleFloatAction"
    // InternalMajordomoDsl.g:1664:1: ruleFloatAction returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEFloat ) ) ) ;
    public final EObject ruleFloatAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1670:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEFloat ) ) ) )
            // InternalMajordomoDsl.g:1671:2: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEFloat ) ) )
            {
            // InternalMajordomoDsl.g:1671:2: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEFloat ) ) )
            // InternalMajordomoDsl.g:1672:3: ( ( ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEFloat ) )
            {
            // InternalMajordomoDsl.g:1672:3: ( ( ruleQualifiedName ) )
            // InternalMajordomoDsl.g:1673:4: ( ruleQualifiedName )
            {
            // InternalMajordomoDsl.g:1673:4: ( ruleQualifiedName )
            // InternalMajordomoDsl.g:1674:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFloatActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFloatActionAccess().getActorFloatActorCrossReference_0_0());
            				
            pushFollow(FOLLOW_19);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatActionAccess().getColonKeyword_1());
            		
            // InternalMajordomoDsl.g:1692:3: ( (lv_value_2_0= ruleEFloat ) )
            // InternalMajordomoDsl.g:1693:4: (lv_value_2_0= ruleEFloat )
            {
            // InternalMajordomoDsl.g:1693:4: (lv_value_2_0= ruleEFloat )
            // InternalMajordomoDsl.g:1694:5: lv_value_2_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getFloatActionAccess().getValueEFloatParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloatActionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.EFloat");
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
    // $ANTLR end "ruleFloatAction"


    // $ANTLR start "entryRuleLightSensor"
    // InternalMajordomoDsl.g:1715:1: entryRuleLightSensor returns [EObject current=null] : iv_ruleLightSensor= ruleLightSensor EOF ;
    public final EObject entryRuleLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSensor = null;


        try {
            // InternalMajordomoDsl.g:1715:52: (iv_ruleLightSensor= ruleLightSensor EOF )
            // InternalMajordomoDsl.g:1716:2: iv_ruleLightSensor= ruleLightSensor EOF
            {
             newCompositeNode(grammarAccess.getLightSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLightSensor=ruleLightSensor();

            state._fsp--;

             current =iv_ruleLightSensor; 
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
    // $ANTLR end "entryRuleLightSensor"


    // $ANTLR start "ruleLightSensor"
    // InternalMajordomoDsl.g:1722:1: ruleLightSensor returns [EObject current=null] : (otherlv_0= '@light' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleLightSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1728:2: ( (otherlv_0= '@light' ( (lv_name_1_0= ruleName ) ) ) )
            // InternalMajordomoDsl.g:1729:2: (otherlv_0= '@light' ( (lv_name_1_0= ruleName ) ) )
            {
            // InternalMajordomoDsl.g:1729:2: (otherlv_0= '@light' ( (lv_name_1_0= ruleName ) ) )
            // InternalMajordomoDsl.g:1730:3: otherlv_0= '@light' ( (lv_name_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLightSensorAccess().getLightKeyword_0());
            		
            // InternalMajordomoDsl.g:1734:3: ( (lv_name_1_0= ruleName ) )
            // InternalMajordomoDsl.g:1735:4: (lv_name_1_0= ruleName )
            {
            // InternalMajordomoDsl.g:1735:4: (lv_name_1_0= ruleName )
            // InternalMajordomoDsl.g:1736:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getLightSensorAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLightSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Name");
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
    // $ANTLR end "ruleLightSensor"


    // $ANTLR start "entryRuleTemperatureSensor"
    // InternalMajordomoDsl.g:1757:1: entryRuleTemperatureSensor returns [EObject current=null] : iv_ruleTemperatureSensor= ruleTemperatureSensor EOF ;
    public final EObject entryRuleTemperatureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemperatureSensor = null;


        try {
            // InternalMajordomoDsl.g:1757:58: (iv_ruleTemperatureSensor= ruleTemperatureSensor EOF )
            // InternalMajordomoDsl.g:1758:2: iv_ruleTemperatureSensor= ruleTemperatureSensor EOF
            {
             newCompositeNode(grammarAccess.getTemperatureSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemperatureSensor=ruleTemperatureSensor();

            state._fsp--;

             current =iv_ruleTemperatureSensor; 
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
    // $ANTLR end "entryRuleTemperatureSensor"


    // $ANTLR start "ruleTemperatureSensor"
    // InternalMajordomoDsl.g:1764:1: ruleTemperatureSensor returns [EObject current=null] : (otherlv_0= '@temp' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleTemperatureSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1770:2: ( (otherlv_0= '@temp' ( (lv_name_1_0= ruleName ) ) ) )
            // InternalMajordomoDsl.g:1771:2: (otherlv_0= '@temp' ( (lv_name_1_0= ruleName ) ) )
            {
            // InternalMajordomoDsl.g:1771:2: (otherlv_0= '@temp' ( (lv_name_1_0= ruleName ) ) )
            // InternalMajordomoDsl.g:1772:3: otherlv_0= '@temp' ( (lv_name_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTemperatureSensorAccess().getTempKeyword_0());
            		
            // InternalMajordomoDsl.g:1776:3: ( (lv_name_1_0= ruleName ) )
            // InternalMajordomoDsl.g:1777:4: (lv_name_1_0= ruleName )
            {
            // InternalMajordomoDsl.g:1777:4: (lv_name_1_0= ruleName )
            // InternalMajordomoDsl.g:1778:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getTemperatureSensorAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTemperatureSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Name");
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
    // $ANTLR end "ruleTemperatureSensor"


    // $ANTLR start "entryRuleRainSensor"
    // InternalMajordomoDsl.g:1799:1: entryRuleRainSensor returns [EObject current=null] : iv_ruleRainSensor= ruleRainSensor EOF ;
    public final EObject entryRuleRainSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRainSensor = null;


        try {
            // InternalMajordomoDsl.g:1799:51: (iv_ruleRainSensor= ruleRainSensor EOF )
            // InternalMajordomoDsl.g:1800:2: iv_ruleRainSensor= ruleRainSensor EOF
            {
             newCompositeNode(grammarAccess.getRainSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRainSensor=ruleRainSensor();

            state._fsp--;

             current =iv_ruleRainSensor; 
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
    // $ANTLR end "entryRuleRainSensor"


    // $ANTLR start "ruleRainSensor"
    // InternalMajordomoDsl.g:1806:1: ruleRainSensor returns [EObject current=null] : (otherlv_0= '@rain' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleRainSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1812:2: ( (otherlv_0= '@rain' ( (lv_name_1_0= ruleName ) ) ) )
            // InternalMajordomoDsl.g:1813:2: (otherlv_0= '@rain' ( (lv_name_1_0= ruleName ) ) )
            {
            // InternalMajordomoDsl.g:1813:2: (otherlv_0= '@rain' ( (lv_name_1_0= ruleName ) ) )
            // InternalMajordomoDsl.g:1814:3: otherlv_0= '@rain' ( (lv_name_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRainSensorAccess().getRainKeyword_0());
            		
            // InternalMajordomoDsl.g:1818:3: ( (lv_name_1_0= ruleName ) )
            // InternalMajordomoDsl.g:1819:4: (lv_name_1_0= ruleName )
            {
            // InternalMajordomoDsl.g:1819:4: (lv_name_1_0= ruleName )
            // InternalMajordomoDsl.g:1820:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getRainSensorAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRainSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Name");
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
    // $ANTLR end "ruleRainSensor"


    // $ANTLR start "entryRuleSwitchSensor"
    // InternalMajordomoDsl.g:1841:1: entryRuleSwitchSensor returns [EObject current=null] : iv_ruleSwitchSensor= ruleSwitchSensor EOF ;
    public final EObject entryRuleSwitchSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchSensor = null;


        try {
            // InternalMajordomoDsl.g:1841:53: (iv_ruleSwitchSensor= ruleSwitchSensor EOF )
            // InternalMajordomoDsl.g:1842:2: iv_ruleSwitchSensor= ruleSwitchSensor EOF
            {
             newCompositeNode(grammarAccess.getSwitchSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitchSensor=ruleSwitchSensor();

            state._fsp--;

             current =iv_ruleSwitchSensor; 
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
    // $ANTLR end "entryRuleSwitchSensor"


    // $ANTLR start "ruleSwitchSensor"
    // InternalMajordomoDsl.g:1848:1: ruleSwitchSensor returns [EObject current=null] : (otherlv_0= '@switch' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleSwitchSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1854:2: ( (otherlv_0= '@switch' ( (lv_name_1_0= ruleName ) ) ) )
            // InternalMajordomoDsl.g:1855:2: (otherlv_0= '@switch' ( (lv_name_1_0= ruleName ) ) )
            {
            // InternalMajordomoDsl.g:1855:2: (otherlv_0= '@switch' ( (lv_name_1_0= ruleName ) ) )
            // InternalMajordomoDsl.g:1856:3: otherlv_0= '@switch' ( (lv_name_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSwitchSensorAccess().getSwitchKeyword_0());
            		
            // InternalMajordomoDsl.g:1860:3: ( (lv_name_1_0= ruleName ) )
            // InternalMajordomoDsl.g:1861:4: (lv_name_1_0= ruleName )
            {
            // InternalMajordomoDsl.g:1861:4: (lv_name_1_0= ruleName )
            // InternalMajordomoDsl.g:1862:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getSwitchSensorAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSwitchSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Name");
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
    // $ANTLR end "ruleSwitchSensor"


    // $ANTLR start "entryRuleNumberSensor"
    // InternalMajordomoDsl.g:1883:1: entryRuleNumberSensor returns [EObject current=null] : iv_ruleNumberSensor= ruleNumberSensor EOF ;
    public final EObject entryRuleNumberSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberSensor = null;


        try {
            // InternalMajordomoDsl.g:1883:53: (iv_ruleNumberSensor= ruleNumberSensor EOF )
            // InternalMajordomoDsl.g:1884:2: iv_ruleNumberSensor= ruleNumberSensor EOF
            {
             newCompositeNode(grammarAccess.getNumberSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberSensor=ruleNumberSensor();

            state._fsp--;

             current =iv_ruleNumberSensor; 
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
    // $ANTLR end "entryRuleNumberSensor"


    // $ANTLR start "ruleNumberSensor"
    // InternalMajordomoDsl.g:1890:1: ruleNumberSensor returns [EObject current=null] : (otherlv_0= '@number' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleNumberSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1896:2: ( (otherlv_0= '@number' ( (lv_name_1_0= ruleName ) ) ) )
            // InternalMajordomoDsl.g:1897:2: (otherlv_0= '@number' ( (lv_name_1_0= ruleName ) ) )
            {
            // InternalMajordomoDsl.g:1897:2: (otherlv_0= '@number' ( (lv_name_1_0= ruleName ) ) )
            // InternalMajordomoDsl.g:1898:3: otherlv_0= '@number' ( (lv_name_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberSensorAccess().getNumberKeyword_0());
            		
            // InternalMajordomoDsl.g:1902:3: ( (lv_name_1_0= ruleName ) )
            // InternalMajordomoDsl.g:1903:4: (lv_name_1_0= ruleName )
            {
            // InternalMajordomoDsl.g:1903:4: (lv_name_1_0= ruleName )
            // InternalMajordomoDsl.g:1904:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getNumberSensorAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Name");
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
    // $ANTLR end "ruleNumberSensor"


    // $ANTLR start "entryRuleClockSensor"
    // InternalMajordomoDsl.g:1925:1: entryRuleClockSensor returns [EObject current=null] : iv_ruleClockSensor= ruleClockSensor EOF ;
    public final EObject entryRuleClockSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClockSensor = null;


        try {
            // InternalMajordomoDsl.g:1925:52: (iv_ruleClockSensor= ruleClockSensor EOF )
            // InternalMajordomoDsl.g:1926:2: iv_ruleClockSensor= ruleClockSensor EOF
            {
             newCompositeNode(grammarAccess.getClockSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClockSensor=ruleClockSensor();

            state._fsp--;

             current =iv_ruleClockSensor; 
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
    // $ANTLR end "entryRuleClockSensor"


    // $ANTLR start "ruleClockSensor"
    // InternalMajordomoDsl.g:1932:1: ruleClockSensor returns [EObject current=null] : (otherlv_0= '@clock' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleClockSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1938:2: ( (otherlv_0= '@clock' ( (lv_name_1_0= ruleName ) ) ) )
            // InternalMajordomoDsl.g:1939:2: (otherlv_0= '@clock' ( (lv_name_1_0= ruleName ) ) )
            {
            // InternalMajordomoDsl.g:1939:2: (otherlv_0= '@clock' ( (lv_name_1_0= ruleName ) ) )
            // InternalMajordomoDsl.g:1940:3: otherlv_0= '@clock' ( (lv_name_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getClockSensorAccess().getClockKeyword_0());
            		
            // InternalMajordomoDsl.g:1944:3: ( (lv_name_1_0= ruleName ) )
            // InternalMajordomoDsl.g:1945:4: (lv_name_1_0= ruleName )
            {
            // InternalMajordomoDsl.g:1945:4: (lv_name_1_0= ruleName )
            // InternalMajordomoDsl.g:1946:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClockSensorAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClockSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Name");
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
    // $ANTLR end "ruleClockSensor"


    // $ANTLR start "entryRuleLampActor"
    // InternalMajordomoDsl.g:1967:1: entryRuleLampActor returns [EObject current=null] : iv_ruleLampActor= ruleLampActor EOF ;
    public final EObject entryRuleLampActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLampActor = null;


        try {
            // InternalMajordomoDsl.g:1967:50: (iv_ruleLampActor= ruleLampActor EOF )
            // InternalMajordomoDsl.g:1968:2: iv_ruleLampActor= ruleLampActor EOF
            {
             newCompositeNode(grammarAccess.getLampActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLampActor=ruleLampActor();

            state._fsp--;

             current =iv_ruleLampActor; 
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
    // $ANTLR end "entryRuleLampActor"


    // $ANTLR start "ruleLampActor"
    // InternalMajordomoDsl.g:1974:1: ruleLampActor returns [EObject current=null] : (otherlv_0= '@lamp' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleLampActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:1980:2: ( (otherlv_0= '@lamp' ( (lv_name_1_0= ruleName ) ) ) )
            // InternalMajordomoDsl.g:1981:2: (otherlv_0= '@lamp' ( (lv_name_1_0= ruleName ) ) )
            {
            // InternalMajordomoDsl.g:1981:2: (otherlv_0= '@lamp' ( (lv_name_1_0= ruleName ) ) )
            // InternalMajordomoDsl.g:1982:3: otherlv_0= '@lamp' ( (lv_name_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLampActorAccess().getLampKeyword_0());
            		
            // InternalMajordomoDsl.g:1986:3: ( (lv_name_1_0= ruleName ) )
            // InternalMajordomoDsl.g:1987:4: (lv_name_1_0= ruleName )
            {
            // InternalMajordomoDsl.g:1987:4: (lv_name_1_0= ruleName )
            // InternalMajordomoDsl.g:1988:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getLampActorAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLampActorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Name");
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
    // $ANTLR end "ruleLampActor"


    // $ANTLR start "entryRuleRollerActor"
    // InternalMajordomoDsl.g:2009:1: entryRuleRollerActor returns [EObject current=null] : iv_ruleRollerActor= ruleRollerActor EOF ;
    public final EObject entryRuleRollerActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRollerActor = null;


        try {
            // InternalMajordomoDsl.g:2009:52: (iv_ruleRollerActor= ruleRollerActor EOF )
            // InternalMajordomoDsl.g:2010:2: iv_ruleRollerActor= ruleRollerActor EOF
            {
             newCompositeNode(grammarAccess.getRollerActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRollerActor=ruleRollerActor();

            state._fsp--;

             current =iv_ruleRollerActor; 
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
    // $ANTLR end "entryRuleRollerActor"


    // $ANTLR start "ruleRollerActor"
    // InternalMajordomoDsl.g:2016:1: ruleRollerActor returns [EObject current=null] : (otherlv_0= '@roller' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleRollerActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:2022:2: ( (otherlv_0= '@roller' ( (lv_name_1_0= ruleName ) ) ) )
            // InternalMajordomoDsl.g:2023:2: (otherlv_0= '@roller' ( (lv_name_1_0= ruleName ) ) )
            {
            // InternalMajordomoDsl.g:2023:2: (otherlv_0= '@roller' ( (lv_name_1_0= ruleName ) ) )
            // InternalMajordomoDsl.g:2024:3: otherlv_0= '@roller' ( (lv_name_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRollerActorAccess().getRollerKeyword_0());
            		
            // InternalMajordomoDsl.g:2028:3: ( (lv_name_1_0= ruleName ) )
            // InternalMajordomoDsl.g:2029:4: (lv_name_1_0= ruleName )
            {
            // InternalMajordomoDsl.g:2029:4: (lv_name_1_0= ruleName )
            // InternalMajordomoDsl.g:2030:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getRollerActorAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRollerActorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Name");
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
    // $ANTLR end "ruleRollerActor"


    // $ANTLR start "entryRuleRoofWindowActor"
    // InternalMajordomoDsl.g:2051:1: entryRuleRoofWindowActor returns [EObject current=null] : iv_ruleRoofWindowActor= ruleRoofWindowActor EOF ;
    public final EObject entryRuleRoofWindowActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoofWindowActor = null;


        try {
            // InternalMajordomoDsl.g:2051:56: (iv_ruleRoofWindowActor= ruleRoofWindowActor EOF )
            // InternalMajordomoDsl.g:2052:2: iv_ruleRoofWindowActor= ruleRoofWindowActor EOF
            {
             newCompositeNode(grammarAccess.getRoofWindowActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoofWindowActor=ruleRoofWindowActor();

            state._fsp--;

             current =iv_ruleRoofWindowActor; 
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
    // $ANTLR end "entryRuleRoofWindowActor"


    // $ANTLR start "ruleRoofWindowActor"
    // InternalMajordomoDsl.g:2058:1: ruleRoofWindowActor returns [EObject current=null] : (otherlv_0= '@roof' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleRoofWindowActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:2064:2: ( (otherlv_0= '@roof' ( (lv_name_1_0= ruleName ) ) ) )
            // InternalMajordomoDsl.g:2065:2: (otherlv_0= '@roof' ( (lv_name_1_0= ruleName ) ) )
            {
            // InternalMajordomoDsl.g:2065:2: (otherlv_0= '@roof' ( (lv_name_1_0= ruleName ) ) )
            // InternalMajordomoDsl.g:2066:3: otherlv_0= '@roof' ( (lv_name_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRoofWindowActorAccess().getRoofKeyword_0());
            		
            // InternalMajordomoDsl.g:2070:3: ( (lv_name_1_0= ruleName ) )
            // InternalMajordomoDsl.g:2071:4: (lv_name_1_0= ruleName )
            {
            // InternalMajordomoDsl.g:2071:4: (lv_name_1_0= ruleName )
            // InternalMajordomoDsl.g:2072:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getRoofWindowActorAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoofWindowActorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Name");
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
    // $ANTLR end "ruleRoofWindowActor"


    // $ANTLR start "entryRuleRadiatorActor"
    // InternalMajordomoDsl.g:2093:1: entryRuleRadiatorActor returns [EObject current=null] : iv_ruleRadiatorActor= ruleRadiatorActor EOF ;
    public final EObject entryRuleRadiatorActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadiatorActor = null;


        try {
            // InternalMajordomoDsl.g:2093:54: (iv_ruleRadiatorActor= ruleRadiatorActor EOF )
            // InternalMajordomoDsl.g:2094:2: iv_ruleRadiatorActor= ruleRadiatorActor EOF
            {
             newCompositeNode(grammarAccess.getRadiatorActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRadiatorActor=ruleRadiatorActor();

            state._fsp--;

             current =iv_ruleRadiatorActor; 
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
    // $ANTLR end "entryRuleRadiatorActor"


    // $ANTLR start "ruleRadiatorActor"
    // InternalMajordomoDsl.g:2100:1: ruleRadiatorActor returns [EObject current=null] : (otherlv_0= '@radiator' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleRadiatorActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:2106:2: ( (otherlv_0= '@radiator' ( (lv_name_1_0= ruleName ) ) ) )
            // InternalMajordomoDsl.g:2107:2: (otherlv_0= '@radiator' ( (lv_name_1_0= ruleName ) ) )
            {
            // InternalMajordomoDsl.g:2107:2: (otherlv_0= '@radiator' ( (lv_name_1_0= ruleName ) ) )
            // InternalMajordomoDsl.g:2108:3: otherlv_0= '@radiator' ( (lv_name_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRadiatorActorAccess().getRadiatorKeyword_0());
            		
            // InternalMajordomoDsl.g:2112:3: ( (lv_name_1_0= ruleName ) )
            // InternalMajordomoDsl.g:2113:4: (lv_name_1_0= ruleName )
            {
            // InternalMajordomoDsl.g:2113:4: (lv_name_1_0= ruleName )
            // InternalMajordomoDsl.g:2114:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getRadiatorActorAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadiatorActorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Name");
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
    // $ANTLR end "ruleRadiatorActor"


    // $ANTLR start "entryRuleBoilerActor"
    // InternalMajordomoDsl.g:2135:1: entryRuleBoilerActor returns [EObject current=null] : iv_ruleBoilerActor= ruleBoilerActor EOF ;
    public final EObject entryRuleBoilerActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoilerActor = null;


        try {
            // InternalMajordomoDsl.g:2135:52: (iv_ruleBoilerActor= ruleBoilerActor EOF )
            // InternalMajordomoDsl.g:2136:2: iv_ruleBoilerActor= ruleBoilerActor EOF
            {
             newCompositeNode(grammarAccess.getBoilerActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoilerActor=ruleBoilerActor();

            state._fsp--;

             current =iv_ruleBoilerActor; 
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
    // $ANTLR end "entryRuleBoilerActor"


    // $ANTLR start "ruleBoilerActor"
    // InternalMajordomoDsl.g:2142:1: ruleBoilerActor returns [EObject current=null] : (otherlv_0= '@boiler' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleBoilerActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:2148:2: ( (otherlv_0= '@boiler' ( (lv_name_1_0= ruleName ) ) ) )
            // InternalMajordomoDsl.g:2149:2: (otherlv_0= '@boiler' ( (lv_name_1_0= ruleName ) ) )
            {
            // InternalMajordomoDsl.g:2149:2: (otherlv_0= '@boiler' ( (lv_name_1_0= ruleName ) ) )
            // InternalMajordomoDsl.g:2150:3: otherlv_0= '@boiler' ( (lv_name_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBoilerActorAccess().getBoilerKeyword_0());
            		
            // InternalMajordomoDsl.g:2154:3: ( (lv_name_1_0= ruleName ) )
            // InternalMajordomoDsl.g:2155:4: (lv_name_1_0= ruleName )
            {
            // InternalMajordomoDsl.g:2155:4: (lv_name_1_0= ruleName )
            // InternalMajordomoDsl.g:2156:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getBoilerActorAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoilerActorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Name");
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
    // $ANTLR end "ruleBoilerActor"


    // $ANTLR start "entryRuleCoffeeActor"
    // InternalMajordomoDsl.g:2177:1: entryRuleCoffeeActor returns [EObject current=null] : iv_ruleCoffeeActor= ruleCoffeeActor EOF ;
    public final EObject entryRuleCoffeeActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoffeeActor = null;


        try {
            // InternalMajordomoDsl.g:2177:52: (iv_ruleCoffeeActor= ruleCoffeeActor EOF )
            // InternalMajordomoDsl.g:2178:2: iv_ruleCoffeeActor= ruleCoffeeActor EOF
            {
             newCompositeNode(grammarAccess.getCoffeeActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoffeeActor=ruleCoffeeActor();

            state._fsp--;

             current =iv_ruleCoffeeActor; 
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
    // $ANTLR end "entryRuleCoffeeActor"


    // $ANTLR start "ruleCoffeeActor"
    // InternalMajordomoDsl.g:2184:1: ruleCoffeeActor returns [EObject current=null] : (otherlv_0= '@coffee' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleCoffeeActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:2190:2: ( (otherlv_0= '@coffee' ( (lv_name_1_0= ruleName ) ) ) )
            // InternalMajordomoDsl.g:2191:2: (otherlv_0= '@coffee' ( (lv_name_1_0= ruleName ) ) )
            {
            // InternalMajordomoDsl.g:2191:2: (otherlv_0= '@coffee' ( (lv_name_1_0= ruleName ) ) )
            // InternalMajordomoDsl.g:2192:3: otherlv_0= '@coffee' ( (lv_name_1_0= ruleName ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCoffeeActorAccess().getCoffeeKeyword_0());
            		
            // InternalMajordomoDsl.g:2196:3: ( (lv_name_1_0= ruleName ) )
            // InternalMajordomoDsl.g:2197:4: (lv_name_1_0= ruleName )
            {
            // InternalMajordomoDsl.g:2197:4: (lv_name_1_0= ruleName )
            // InternalMajordomoDsl.g:2198:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getCoffeeActorAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoffeeActorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.altimos.mdsd.majordomo.dsl.MajordomoDsl.Name");
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
    // $ANTLR end "ruleCoffeeActor"


    // $ANTLR start "entryRuleName"
    // InternalMajordomoDsl.g:2219:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalMajordomoDsl.g:2219:44: (iv_ruleName= ruleName EOF )
            // InternalMajordomoDsl.g:2220:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalMajordomoDsl.g:2226:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalMajordomoDsl.g:2232:2: (this_ID_0= RULE_ID )
            // InternalMajordomoDsl.g:2233:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMajordomoDsl.g:2243:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMajordomoDsl.g:2243:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMajordomoDsl.g:2244:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMajordomoDsl.g:2250:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalMajordomoDsl.g:2256:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // InternalMajordomoDsl.g:2257:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // InternalMajordomoDsl.g:2257:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // InternalMajordomoDsl.g:2258:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMajordomoDsl.g:2268:3: (kw= '.' this_Name_2= ruleName )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMajordomoDsl.g:2269:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,42,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_22);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleConstID"
    // InternalMajordomoDsl.g:2289:1: entryRuleConstID returns [String current=null] : iv_ruleConstID= ruleConstID EOF ;
    public final String entryRuleConstID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstID = null;


        try {
            // InternalMajordomoDsl.g:2289:47: (iv_ruleConstID= ruleConstID EOF )
            // InternalMajordomoDsl.g:2290:2: iv_ruleConstID= ruleConstID EOF
            {
             newCompositeNode(grammarAccess.getConstIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstID=ruleConstID();

            state._fsp--;

             current =iv_ruleConstID.getText(); 
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
    // $ANTLR end "entryRuleConstID"


    // $ANTLR start "ruleConstID"
    // InternalMajordomoDsl.g:2296:1: ruleConstID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_CONST_0= RULE_CONST ;
    public final AntlrDatatypeRuleToken ruleConstID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CONST_0=null;


        	enterRule();

        try {
            // InternalMajordomoDsl.g:2302:2: (this_CONST_0= RULE_CONST )
            // InternalMajordomoDsl.g:2303:2: this_CONST_0= RULE_CONST
            {
            this_CONST_0=(Token)match(input,RULE_CONST,FOLLOW_2); 

            		current.merge(this_CONST_0);
            	

            		newLeafNode(this_CONST_0, grammarAccess.getConstIDAccess().getCONSTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleConstID"


    // $ANTLR start "entryRuleBinaryAndOperator"
    // InternalMajordomoDsl.g:2313:1: entryRuleBinaryAndOperator returns [String current=null] : iv_ruleBinaryAndOperator= ruleBinaryAndOperator EOF ;
    public final String entryRuleBinaryAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryAndOperator = null;


        try {
            // InternalMajordomoDsl.g:2313:57: (iv_ruleBinaryAndOperator= ruleBinaryAndOperator EOF )
            // InternalMajordomoDsl.g:2314:2: iv_ruleBinaryAndOperator= ruleBinaryAndOperator EOF
            {
             newCompositeNode(grammarAccess.getBinaryAndOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryAndOperator=ruleBinaryAndOperator();

            state._fsp--;

             current =iv_ruleBinaryAndOperator.getText(); 
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
    // $ANTLR end "entryRuleBinaryAndOperator"


    // $ANTLR start "ruleBinaryAndOperator"
    // InternalMajordomoDsl.g:2320:1: ruleBinaryAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= '&&' | kw= '&' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMajordomoDsl.g:2326:2: ( (kw= 'and' | kw= '&&' | kw= '&' ) )
            // InternalMajordomoDsl.g:2327:2: (kw= 'and' | kw= '&&' | kw= '&' )
            {
            // InternalMajordomoDsl.g:2327:2: (kw= 'and' | kw= '&&' | kw= '&' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt26=1;
                }
                break;
            case 44:
                {
                alt26=2;
                }
                break;
            case 45:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMajordomoDsl.g:2328:3: kw= 'and'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryAndOperatorAccess().getAndKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMajordomoDsl.g:2334:3: kw= '&&'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryAndOperatorAccess().getAmpersandAmpersandKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMajordomoDsl.g:2340:3: kw= '&'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryAndOperatorAccess().getAmpersandKeyword_2());
                    		

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
    // $ANTLR end "ruleBinaryAndOperator"


    // $ANTLR start "entryRuleBinaryOrOperator"
    // InternalMajordomoDsl.g:2349:1: entryRuleBinaryOrOperator returns [String current=null] : iv_ruleBinaryOrOperator= ruleBinaryOrOperator EOF ;
    public final String entryRuleBinaryOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOrOperator = null;


        try {
            // InternalMajordomoDsl.g:2349:56: (iv_ruleBinaryOrOperator= ruleBinaryOrOperator EOF )
            // InternalMajordomoDsl.g:2350:2: iv_ruleBinaryOrOperator= ruleBinaryOrOperator EOF
            {
             newCompositeNode(grammarAccess.getBinaryOrOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOrOperator=ruleBinaryOrOperator();

            state._fsp--;

             current =iv_ruleBinaryOrOperator.getText(); 
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
    // $ANTLR end "entryRuleBinaryOrOperator"


    // $ANTLR start "ruleBinaryOrOperator"
    // InternalMajordomoDsl.g:2356:1: ruleBinaryOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'or' | kw= '||' | kw= '|' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMajordomoDsl.g:2362:2: ( (kw= 'or' | kw= '||' | kw= '|' ) )
            // InternalMajordomoDsl.g:2363:2: (kw= 'or' | kw= '||' | kw= '|' )
            {
            // InternalMajordomoDsl.g:2363:2: (kw= 'or' | kw= '||' | kw= '|' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt27=1;
                }
                break;
            case 47:
                {
                alt27=2;
                }
                break;
            case 48:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMajordomoDsl.g:2364:3: kw= 'or'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOrOperatorAccess().getOrKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMajordomoDsl.g:2370:3: kw= '||'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOrOperatorAccess().getVerticalLineVerticalLineKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMajordomoDsl.g:2376:3: kw= '|'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOrOperatorAccess().getVerticalLineKeyword_2());
                    		

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
    // $ANTLR end "ruleBinaryOrOperator"


    // $ANTLR start "entryRuleEFloat"
    // InternalMajordomoDsl.g:2385:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalMajordomoDsl.g:2385:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalMajordomoDsl.g:2386:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalMajordomoDsl.g:2392:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMajordomoDsl.g:2398:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? ) )
            // InternalMajordomoDsl.g:2399:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? )
            {
            // InternalMajordomoDsl.g:2399:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? )
            // InternalMajordomoDsl.g:2400:3: (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )?
            {
            // InternalMajordomoDsl.g:2400:3: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==49) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMajordomoDsl.g:2401:4: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMajordomoDsl.g:2407:3: (this_INT_1= RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMajordomoDsl.g:2408:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_22); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMajordomoDsl.g:2416:3: (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMajordomoDsl.g:2417:4: kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
                    {
                    kw=(Token)match(input,42,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2_0());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_25); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2_1());
                    			
                    // InternalMajordomoDsl.g:2429:4: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=50 && LA32_0<=51)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalMajordomoDsl.g:2430:5: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                            {
                            // InternalMajordomoDsl.g:2430:5: (kw= 'E' | kw= 'e' )
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==50) ) {
                                alt30=1;
                            }
                            else if ( (LA30_0==51) ) {
                                alt30=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 30, 0, input);

                                throw nvae;
                            }
                            switch (alt30) {
                                case 1 :
                                    // InternalMajordomoDsl.g:2431:6: kw= 'E'
                                    {
                                    kw=(Token)match(input,50,FOLLOW_26); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_2_2_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalMajordomoDsl.g:2437:6: kw= 'e'
                                    {
                                    kw=(Token)match(input,51,FOLLOW_26); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_2_2_0_1());
                                    					

                                    }
                                    break;

                            }

                            // InternalMajordomoDsl.g:2443:5: (kw= '-' )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==49) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // InternalMajordomoDsl.g:2444:6: kw= '-'
                                    {
                                    kw=(Token)match(input,49,FOLLOW_24); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_2_2_1());
                                    					

                                    }
                                    break;

                            }

                            this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                            					current.merge(this_INT_7);
                            				

                            					newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2_2_2());
                            				

                            }
                            break;

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEBoolean"
    // InternalMajordomoDsl.g:2463:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMajordomoDsl.g:2463:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMajordomoDsl.g:2464:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalMajordomoDsl.g:2470:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMajordomoDsl.g:2476:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMajordomoDsl.g:2477:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMajordomoDsl.g:2477:2: (kw= 'true' | kw= 'false' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==52) ) {
                alt34=1;
            }
            else if ( (LA34_0==53) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMajordomoDsl.g:2478:3: kw= 'true'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMajordomoDsl.g:2484:3: kw= 'false'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

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


    // $ANTLR start "ruleComparator"
    // InternalMajordomoDsl.g:2493:1: ruleComparator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) ;
    public final Enumerator ruleComparator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMajordomoDsl.g:2499:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) )
            // InternalMajordomoDsl.g:2500:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            {
            // InternalMajordomoDsl.g:2500:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt35=1;
                }
                break;
            case 55:
                {
                alt35=2;
                }
                break;
            case 56:
                {
                alt35=3;
                }
                break;
            case 57:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalMajordomoDsl.g:2501:3: (enumLiteral_0= '<' )
                    {
                    // InternalMajordomoDsl.g:2501:3: (enumLiteral_0= '<' )
                    // InternalMajordomoDsl.g:2502:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getComparatorAccess().getLTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparatorAccess().getLTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMajordomoDsl.g:2509:3: (enumLiteral_1= '<=' )
                    {
                    // InternalMajordomoDsl.g:2509:3: (enumLiteral_1= '<=' )
                    // InternalMajordomoDsl.g:2510:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getComparatorAccess().getLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparatorAccess().getLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMajordomoDsl.g:2517:3: (enumLiteral_2= '>=' )
                    {
                    // InternalMajordomoDsl.g:2517:3: (enumLiteral_2= '>=' )
                    // InternalMajordomoDsl.g:2518:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getComparatorAccess().getGEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparatorAccess().getGEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMajordomoDsl.g:2525:3: (enumLiteral_3= '>' )
                    {
                    // InternalMajordomoDsl.g:2525:3: (enumLiteral_3= '>' )
                    // InternalMajordomoDsl.g:2526:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getComparatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparatorAccess().getGTEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleComparator"

    // Delegated rules


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\2\uffff\1\6\5\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\16\1\uffff\1\4\2\uffff\1\31";
    static final String dfa_4s = "\1\71\1\uffff\1\71\1\uffff\1\4\2\uffff\1\71";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\4\1\uffff\1\3\1\2\1\uffff";
    static final String dfa_6s = "\10\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\2\3\20\uffff\1\1\22\uffff\1\3\6\uffff\1\3\4\uffff\4\3",
            "",
            "\2\6\2\uffff\2\6\4\uffff\1\6\1\5\1\6\1\uffff\2\6\14\uffff\1\4\6\6\5\uffff\4\3",
            "",
            "\1\7",
            "",
            "",
            "\1\5\20\uffff\1\4\13\uffff\4\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "956:2: ( (otherlv_0= '(' this_Statement_1= ruleStatement otherlv_2= ')' ) | this_StatementReference_3= ruleStatementReference | this_BooleanSensorStatement_4= ruleBooleanSensorStatement | this_CompareOperation_5= ruleCompareOperation )";
        }
    }
    static final String dfa_8s = "\1\uffff\1\4\1\uffff\1\7\4\uffff";
    static final String dfa_9s = "\1\4\1\16\1\4\1\6\1\uffff\1\33\2\uffff";
    static final String dfa_10s = "\1\4\1\52\1\4\1\65\1\uffff\1\52\2\uffff";
    static final String dfa_11s = "\4\uffff\1\3\1\uffff\1\1\1\2";
    static final String[] dfa_12s = {
            "\1\1",
            "\2\4\2\uffff\1\4\1\uffff\1\4\5\uffff\1\4\1\3\2\4\14\uffff\1\2",
            "\1\5",
            "\1\7\7\uffff\2\7\2\uffff\1\7\1\uffff\1\7\5\uffff\1\7\1\uffff\2\7\14\uffff\1\7\6\uffff\1\7\2\uffff\2\6",
            "",
            "\1\3\16\uffff\1\2",
            "",
            ""
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_6;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1568:2: (this_BooleanAction_0= ruleBooleanAction | this_FloatAction_1= ruleFloatAction | this_ActionSetReference_2= ruleActionSetReference )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000034048000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000003404C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000003FFC0008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000003FFC000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002040000E00070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0002040000800070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x03C0000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002040000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000042L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002000000000040L});

}