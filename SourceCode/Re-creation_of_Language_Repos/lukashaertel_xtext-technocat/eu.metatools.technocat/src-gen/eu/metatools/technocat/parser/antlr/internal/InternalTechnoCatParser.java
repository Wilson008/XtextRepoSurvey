package eu.metatools.technocat.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.metatools.technocat.services.TechnoCatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTechnoCatParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_SL_COMMENT", "RULE_WS", "'model'", "'import'", "'type'", "'from'", "','", "'='", "'relation'", "'->'", "':'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'!'", "'&&'", "'||'", "'~'", "'&'", "'|'", "'^'", "'<<'", "'>>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'?'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=6;
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
    public static final int RULE_WS=7;
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


        public InternalTechnoCatParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTechnoCatParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTechnoCatParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTechnoCat.g"; }



     	private TechnoCatGrammarAccess grammarAccess;

        public InternalTechnoCatParser(TokenStream input, TechnoCatGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TechnologyCatalog";
       	}

       	@Override
       	protected TechnoCatGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTechnologyCatalog"
    // InternalTechnoCat.g:64:1: entryRuleTechnologyCatalog returns [EObject current=null] : iv_ruleTechnologyCatalog= ruleTechnologyCatalog EOF ;
    public final EObject entryRuleTechnologyCatalog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnologyCatalog = null;


        try {
            // InternalTechnoCat.g:64:58: (iv_ruleTechnologyCatalog= ruleTechnologyCatalog EOF )
            // InternalTechnoCat.g:65:2: iv_ruleTechnologyCatalog= ruleTechnologyCatalog EOF
            {
             newCompositeNode(grammarAccess.getTechnologyCatalogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTechnologyCatalog=ruleTechnologyCatalog();

            state._fsp--;

             current =iv_ruleTechnologyCatalog; 
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
    // $ANTLR end "entryRuleTechnologyCatalog"


    // $ANTLR start "ruleTechnologyCatalog"
    // InternalTechnoCat.g:71:1: ruleTechnologyCatalog returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= ruleTCID ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_entityTypes_3_0= ruleETD ) ) | ( (lv_relationTypes_4_0= ruleRTD ) ) | ( (lv_entities_5_0= ruleED ) ) | ( (lv_relations_6_0= ruleRD ) ) )* ) ;
    public final EObject ruleTechnologyCatalog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_entityTypes_3_0 = null;

        EObject lv_relationTypes_4_0 = null;

        EObject lv_entities_5_0 = null;

        EObject lv_relations_6_0 = null;



        	enterRule();

        try {
            // InternalTechnoCat.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= ruleTCID ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_entityTypes_3_0= ruleETD ) ) | ( (lv_relationTypes_4_0= ruleRTD ) ) | ( (lv_entities_5_0= ruleED ) ) | ( (lv_relations_6_0= ruleRD ) ) )* ) )
            // InternalTechnoCat.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= ruleTCID ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_entityTypes_3_0= ruleETD ) ) | ( (lv_relationTypes_4_0= ruleRTD ) ) | ( (lv_entities_5_0= ruleED ) ) | ( (lv_relations_6_0= ruleRD ) ) )* )
            {
            // InternalTechnoCat.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= ruleTCID ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_entityTypes_3_0= ruleETD ) ) | ( (lv_relationTypes_4_0= ruleRTD ) ) | ( (lv_entities_5_0= ruleED ) ) | ( (lv_relations_6_0= ruleRD ) ) )* )
            // InternalTechnoCat.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= ruleTCID ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_entityTypes_3_0= ruleETD ) ) | ( (lv_relationTypes_4_0= ruleRTD ) ) | ( (lv_entities_5_0= ruleED ) ) | ( (lv_relations_6_0= ruleRD ) ) )*
            {
            otherlv_0=(Token)match(input,8,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTechnologyCatalogAccess().getModelKeyword_0());
            		
            // InternalTechnoCat.g:83:3: ( (lv_name_1_0= ruleTCID ) )
            // InternalTechnoCat.g:84:4: (lv_name_1_0= ruleTCID )
            {
            // InternalTechnoCat.g:84:4: (lv_name_1_0= ruleTCID )
            // InternalTechnoCat.g:85:5: lv_name_1_0= ruleTCID
            {

            					newCompositeNode(grammarAccess.getTechnologyCatalogAccess().getNameTCIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleTCID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTechnologyCatalogRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"eu.metatools.technocat.TechnoCat.TCID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTechnoCat.g:102:3: ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_entityTypes_3_0= ruleETD ) ) | ( (lv_relationTypes_4_0= ruleRTD ) ) | ( (lv_entities_5_0= ruleED ) ) | ( (lv_relations_6_0= ruleRD ) ) )*
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 9:
                    {
                    alt1=1;
                    }
                    break;
                case 10:
                    {
                    alt1=2;
                    }
                    break;
                case 14:
                    {
                    alt1=3;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA1_5 = input.LA(2);

                    if ( ((LA1_5>=RULE_STRING && LA1_5<=RULE_ID)||LA1_5==13||(LA1_5>=17 && LA1_5<=49)) ) {
                        alt1=5;
                    }
                    else if ( (LA1_5==16) ) {
                        alt1=4;
                    }


                    }
                    break;
                case RULE_STRING:
                    {
                    int LA1_6 = input.LA(2);

                    if ( ((LA1_6>=RULE_STRING && LA1_6<=RULE_ID)||LA1_6==13||(LA1_6>=17 && LA1_6<=49)) ) {
                        alt1=5;
                    }
                    else if ( (LA1_6==16) ) {
                        alt1=4;
                    }


                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalTechnoCat.g:103:4: ( (lv_imports_2_0= ruleImport ) )
            	    {
            	    // InternalTechnoCat.g:103:4: ( (lv_imports_2_0= ruleImport ) )
            	    // InternalTechnoCat.g:104:5: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalTechnoCat.g:104:5: (lv_imports_2_0= ruleImport )
            	    // InternalTechnoCat.g:105:6: lv_imports_2_0= ruleImport
            	    {

            	    						newCompositeNode(grammarAccess.getTechnologyCatalogAccess().getImportsImportParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTechnologyCatalogRule());
            	    						}
            	    						add(
            	    							current,
            	    							"imports",
            	    							lv_imports_2_0,
            	    							"eu.metatools.technocat.TechnoCat.Import");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTechnoCat.g:123:4: ( (lv_entityTypes_3_0= ruleETD ) )
            	    {
            	    // InternalTechnoCat.g:123:4: ( (lv_entityTypes_3_0= ruleETD ) )
            	    // InternalTechnoCat.g:124:5: (lv_entityTypes_3_0= ruleETD )
            	    {
            	    // InternalTechnoCat.g:124:5: (lv_entityTypes_3_0= ruleETD )
            	    // InternalTechnoCat.g:125:6: lv_entityTypes_3_0= ruleETD
            	    {

            	    						newCompositeNode(grammarAccess.getTechnologyCatalogAccess().getEntityTypesETDParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_entityTypes_3_0=ruleETD();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTechnologyCatalogRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entityTypes",
            	    							lv_entityTypes_3_0,
            	    							"eu.metatools.technocat.TechnoCat.ETD");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTechnoCat.g:143:4: ( (lv_relationTypes_4_0= ruleRTD ) )
            	    {
            	    // InternalTechnoCat.g:143:4: ( (lv_relationTypes_4_0= ruleRTD ) )
            	    // InternalTechnoCat.g:144:5: (lv_relationTypes_4_0= ruleRTD )
            	    {
            	    // InternalTechnoCat.g:144:5: (lv_relationTypes_4_0= ruleRTD )
            	    // InternalTechnoCat.g:145:6: lv_relationTypes_4_0= ruleRTD
            	    {

            	    						newCompositeNode(grammarAccess.getTechnologyCatalogAccess().getRelationTypesRTDParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_relationTypes_4_0=ruleRTD();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTechnologyCatalogRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relationTypes",
            	    							lv_relationTypes_4_0,
            	    							"eu.metatools.technocat.TechnoCat.RTD");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalTechnoCat.g:163:4: ( (lv_entities_5_0= ruleED ) )
            	    {
            	    // InternalTechnoCat.g:163:4: ( (lv_entities_5_0= ruleED ) )
            	    // InternalTechnoCat.g:164:5: (lv_entities_5_0= ruleED )
            	    {
            	    // InternalTechnoCat.g:164:5: (lv_entities_5_0= ruleED )
            	    // InternalTechnoCat.g:165:6: lv_entities_5_0= ruleED
            	    {

            	    						newCompositeNode(grammarAccess.getTechnologyCatalogAccess().getEntitiesEDParserRuleCall_2_3_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_entities_5_0=ruleED();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTechnologyCatalogRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entities",
            	    							lv_entities_5_0,
            	    							"eu.metatools.technocat.TechnoCat.ED");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalTechnoCat.g:183:4: ( (lv_relations_6_0= ruleRD ) )
            	    {
            	    // InternalTechnoCat.g:183:4: ( (lv_relations_6_0= ruleRD ) )
            	    // InternalTechnoCat.g:184:5: (lv_relations_6_0= ruleRD )
            	    {
            	    // InternalTechnoCat.g:184:5: (lv_relations_6_0= ruleRD )
            	    // InternalTechnoCat.g:185:6: lv_relations_6_0= ruleRD
            	    {

            	    						newCompositeNode(grammarAccess.getTechnologyCatalogAccess().getRelationsRDParserRuleCall_2_4_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_relations_6_0=ruleRD();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTechnologyCatalogRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relations",
            	    							lv_relations_6_0,
            	    							"eu.metatools.technocat.TechnoCat.RD");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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
    // $ANTLR end "ruleTechnologyCatalog"


    // $ANTLR start "entryRuleImport"
    // InternalTechnoCat.g:207:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalTechnoCat.g:207:47: (iv_ruleImport= ruleImport EOF )
            // InternalTechnoCat.g:208:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalTechnoCat.g:214:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ruleTCID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTechnoCat.g:220:2: ( (otherlv_0= 'import' ( ( ruleTCID ) ) ) )
            // InternalTechnoCat.g:221:2: (otherlv_0= 'import' ( ( ruleTCID ) ) )
            {
            // InternalTechnoCat.g:221:2: (otherlv_0= 'import' ( ( ruleTCID ) ) )
            // InternalTechnoCat.g:222:3: otherlv_0= 'import' ( ( ruleTCID ) )
            {
            otherlv_0=(Token)match(input,9,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalTechnoCat.g:226:3: ( ( ruleTCID ) )
            // InternalTechnoCat.g:227:4: ( ruleTCID )
            {
            // InternalTechnoCat.g:227:4: ( ruleTCID )
            // InternalTechnoCat.g:228:5: ruleTCID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            				

            					newCompositeNode(grammarAccess.getImportAccess().getRefTechnologyCatalogCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleTCID();

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleModelElement"
    // InternalTechnoCat.g:246:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // InternalTechnoCat.g:246:53: (iv_ruleModelElement= ruleModelElement EOF )
            // InternalTechnoCat.g:247:2: iv_ruleModelElement= ruleModelElement EOF
            {
             newCompositeNode(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelElement=ruleModelElement();

            state._fsp--;

             current =iv_ruleModelElement; 
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
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // InternalTechnoCat.g:253:1: ruleModelElement returns [EObject current=null] : (this_DefinitionElement_0= ruleDefinitionElement | this_InstanceElement_1= ruleInstanceElement ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_DefinitionElement_0 = null;

        EObject this_InstanceElement_1 = null;



        	enterRule();

        try {
            // InternalTechnoCat.g:259:2: ( (this_DefinitionElement_0= ruleDefinitionElement | this_InstanceElement_1= ruleInstanceElement ) )
            // InternalTechnoCat.g:260:2: (this_DefinitionElement_0= ruleDefinitionElement | this_InstanceElement_1= ruleInstanceElement )
            {
            // InternalTechnoCat.g:260:2: (this_DefinitionElement_0= ruleDefinitionElement | this_InstanceElement_1= ruleInstanceElement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10||LA2_0==14) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTechnoCat.g:261:3: this_DefinitionElement_0= ruleDefinitionElement
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getDefinitionElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefinitionElement_0=ruleDefinitionElement();

                    state._fsp--;


                    			current = this_DefinitionElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTechnoCat.g:270:3: this_InstanceElement_1= ruleInstanceElement
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getInstanceElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstanceElement_1=ruleInstanceElement();

                    state._fsp--;


                    			current = this_InstanceElement_1;
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
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleDefinitionElement"
    // InternalTechnoCat.g:282:1: entryRuleDefinitionElement returns [EObject current=null] : iv_ruleDefinitionElement= ruleDefinitionElement EOF ;
    public final EObject entryRuleDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionElement = null;


        try {
            // InternalTechnoCat.g:282:58: (iv_ruleDefinitionElement= ruleDefinitionElement EOF )
            // InternalTechnoCat.g:283:2: iv_ruleDefinitionElement= ruleDefinitionElement EOF
            {
             newCompositeNode(grammarAccess.getDefinitionElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinitionElement=ruleDefinitionElement();

            state._fsp--;

             current =iv_ruleDefinitionElement; 
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
    // $ANTLR end "entryRuleDefinitionElement"


    // $ANTLR start "ruleDefinitionElement"
    // InternalTechnoCat.g:289:1: ruleDefinitionElement returns [EObject current=null] : (this_ETD_0= ruleETD | this_RTD_1= ruleRTD ) ;
    public final EObject ruleDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_ETD_0 = null;

        EObject this_RTD_1 = null;



        	enterRule();

        try {
            // InternalTechnoCat.g:295:2: ( (this_ETD_0= ruleETD | this_RTD_1= ruleRTD ) )
            // InternalTechnoCat.g:296:2: (this_ETD_0= ruleETD | this_RTD_1= ruleRTD )
            {
            // InternalTechnoCat.g:296:2: (this_ETD_0= ruleETD | this_RTD_1= ruleRTD )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTechnoCat.g:297:3: this_ETD_0= ruleETD
                    {

                    			newCompositeNode(grammarAccess.getDefinitionElementAccess().getETDParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ETD_0=ruleETD();

                    state._fsp--;


                    			current = this_ETD_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTechnoCat.g:306:3: this_RTD_1= ruleRTD
                    {

                    			newCompositeNode(grammarAccess.getDefinitionElementAccess().getRTDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RTD_1=ruleRTD();

                    state._fsp--;


                    			current = this_RTD_1;
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
    // $ANTLR end "ruleDefinitionElement"


    // $ANTLR start "entryRuleInstanceElement"
    // InternalTechnoCat.g:318:1: entryRuleInstanceElement returns [EObject current=null] : iv_ruleInstanceElement= ruleInstanceElement EOF ;
    public final EObject entryRuleInstanceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceElement = null;


        try {
            // InternalTechnoCat.g:318:56: (iv_ruleInstanceElement= ruleInstanceElement EOF )
            // InternalTechnoCat.g:319:2: iv_ruleInstanceElement= ruleInstanceElement EOF
            {
             newCompositeNode(grammarAccess.getInstanceElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceElement=ruleInstanceElement();

            state._fsp--;

             current =iv_ruleInstanceElement; 
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
    // $ANTLR end "entryRuleInstanceElement"


    // $ANTLR start "ruleInstanceElement"
    // InternalTechnoCat.g:325:1: ruleInstanceElement returns [EObject current=null] : (this_ED_0= ruleED | this_RD_1= ruleRD ) ;
    public final EObject ruleInstanceElement() throws RecognitionException {
        EObject current = null;

        EObject this_ED_0 = null;

        EObject this_RD_1 = null;



        	enterRule();

        try {
            // InternalTechnoCat.g:331:2: ( (this_ED_0= ruleED | this_RD_1= ruleRD ) )
            // InternalTechnoCat.g:332:2: (this_ED_0= ruleED | this_RD_1= ruleRD )
            {
            // InternalTechnoCat.g:332:2: (this_ED_0= ruleED | this_RD_1= ruleRD )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=RULE_STRING && LA4_1<=RULE_ID)||LA4_1==13||(LA4_1>=17 && LA4_1<=49)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==16) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_STRING) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==16) ) {
                    alt4=1;
                }
                else if ( ((LA4_2>=RULE_STRING && LA4_2<=RULE_ID)||LA4_2==13||(LA4_2>=17 && LA4_2<=49)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTechnoCat.g:333:3: this_ED_0= ruleED
                    {

                    			newCompositeNode(grammarAccess.getInstanceElementAccess().getEDParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ED_0=ruleED();

                    state._fsp--;


                    			current = this_ED_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTechnoCat.g:342:3: this_RD_1= ruleRD
                    {

                    			newCompositeNode(grammarAccess.getInstanceElementAccess().getRDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RD_1=ruleRD();

                    state._fsp--;


                    			current = this_RD_1;
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
    // $ANTLR end "ruleInstanceElement"


    // $ANTLR start "entryRuleETD"
    // InternalTechnoCat.g:354:1: entryRuleETD returns [EObject current=null] : iv_ruleETD= ruleETD EOF ;
    public final EObject entryRuleETD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETD = null;


        try {
            // InternalTechnoCat.g:354:44: (iv_ruleETD= ruleETD EOF )
            // InternalTechnoCat.g:355:2: iv_ruleETD= ruleETD EOF
            {
             newCompositeNode(grammarAccess.getETDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETD=ruleETD();

            state._fsp--;

             current =iv_ruleETD; 
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
    // $ANTLR end "entryRuleETD"


    // $ANTLR start "ruleETD"
    // InternalTechnoCat.g:361:1: ruleETD returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= ruleETID ) ) (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleETD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalTechnoCat.g:367:2: ( (otherlv_0= 'type' ( (lv_name_1_0= ruleETID ) ) (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ) )
            // InternalTechnoCat.g:368:2: (otherlv_0= 'type' ( (lv_name_1_0= ruleETID ) ) (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? )
            {
            // InternalTechnoCat.g:368:2: (otherlv_0= 'type' ( (lv_name_1_0= ruleETID ) ) (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? )
            // InternalTechnoCat.g:369:3: otherlv_0= 'type' ( (lv_name_1_0= ruleETID ) ) (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,10,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getETDAccess().getTypeKeyword_0());
            		
            // InternalTechnoCat.g:373:3: ( (lv_name_1_0= ruleETID ) )
            // InternalTechnoCat.g:374:4: (lv_name_1_0= ruleETID )
            {
            // InternalTechnoCat.g:374:4: (lv_name_1_0= ruleETID )
            // InternalTechnoCat.g:375:5: lv_name_1_0= ruleETID
            {

            					newCompositeNode(grammarAccess.getETDAccess().getNameETIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleETID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETDRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"eu.metatools.technocat.TechnoCat.ETID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTechnoCat.g:392:3: (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTechnoCat.g:393:4: otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )*
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getETDAccess().getFromKeyword_2_0());
                    			
                    // InternalTechnoCat.g:397:4: ( ( ruleETID ) )
                    // InternalTechnoCat.g:398:5: ( ruleETID )
                    {
                    // InternalTechnoCat.g:398:5: ( ruleETID )
                    // InternalTechnoCat.g:399:6: ruleETID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getETDRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getETDAccess().getBasesETDCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleETID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTechnoCat.g:413:4: (otherlv_4= ',' ( ( ruleETID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==12) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTechnoCat.g:414:5: otherlv_4= ',' ( ( ruleETID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getETDAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalTechnoCat.g:418:5: ( ( ruleETID ) )
                    	    // InternalTechnoCat.g:419:6: ( ruleETID )
                    	    {
                    	    // InternalTechnoCat.g:419:6: ( ruleETID )
                    	    // InternalTechnoCat.g:420:7: ruleETID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getETDRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getETDAccess().getBasesETDCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleETID();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalTechnoCat.g:436:3: (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTechnoCat.g:437:4: otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getETDAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalTechnoCat.g:441:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalTechnoCat.g:442:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalTechnoCat.g:442:5: (lv_value_7_0= RULE_STRING )
                    // InternalTechnoCat.g:443:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getETDAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getETDRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"eu.metatools.technocat.TechnoCat.STRING");
                    					

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
    // $ANTLR end "ruleETD"


    // $ANTLR start "entryRuleRTD"
    // InternalTechnoCat.g:464:1: entryRuleRTD returns [EObject current=null] : iv_ruleRTD= ruleRTD EOF ;
    public final EObject entryRuleRTD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTD = null;


        try {
            // InternalTechnoCat.g:464:44: (iv_ruleRTD= ruleRTD EOF )
            // InternalTechnoCat.g:465:2: iv_ruleRTD= ruleRTD EOF
            {
             newCompositeNode(grammarAccess.getRTDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRTD=ruleRTD();

            state._fsp--;

             current =iv_ruleRTD; 
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
    // $ANTLR end "entryRuleRTD"


    // $ANTLR start "ruleRTD"
    // InternalTechnoCat.g:471:1: ruleRTD returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_name_1_0= ruleRTID ) ) (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ( (lv_items_8_0= ruleRTDItem ) )* ) ;
    public final EObject ruleRTD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_items_8_0 = null;



        	enterRule();

        try {
            // InternalTechnoCat.g:477:2: ( (otherlv_0= 'relation' ( (lv_name_1_0= ruleRTID ) ) (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ( (lv_items_8_0= ruleRTDItem ) )* ) )
            // InternalTechnoCat.g:478:2: (otherlv_0= 'relation' ( (lv_name_1_0= ruleRTID ) ) (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ( (lv_items_8_0= ruleRTDItem ) )* )
            {
            // InternalTechnoCat.g:478:2: (otherlv_0= 'relation' ( (lv_name_1_0= ruleRTID ) ) (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ( (lv_items_8_0= ruleRTDItem ) )* )
            // InternalTechnoCat.g:479:3: otherlv_0= 'relation' ( (lv_name_1_0= ruleRTID ) ) (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ( (lv_items_8_0= ruleRTDItem ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRTDAccess().getRelationKeyword_0());
            		
            // InternalTechnoCat.g:483:3: ( (lv_name_1_0= ruleRTID ) )
            // InternalTechnoCat.g:484:4: (lv_name_1_0= ruleRTID )
            {
            // InternalTechnoCat.g:484:4: (lv_name_1_0= ruleRTID )
            // InternalTechnoCat.g:485:5: lv_name_1_0= ruleRTID
            {

            					newCompositeNode(grammarAccess.getRTDAccess().getNameRTIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_1_0=ruleRTID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRTDRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"eu.metatools.technocat.TechnoCat.RTID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTechnoCat.g:502:3: (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTechnoCat.g:503:4: otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )*
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getRTDAccess().getFromKeyword_2_0());
                    			
                    // InternalTechnoCat.g:507:4: ( ( ruleRTID ) )
                    // InternalTechnoCat.g:508:5: ( ruleRTID )
                    {
                    // InternalTechnoCat.g:508:5: ( ruleRTID )
                    // InternalTechnoCat.g:509:6: ruleRTID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRTDRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleRTID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTechnoCat.g:523:4: (otherlv_4= ',' ( ( ruleRTID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==12) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalTechnoCat.g:524:5: otherlv_4= ',' ( ( ruleRTID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRTDAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalTechnoCat.g:528:5: ( ( ruleRTID ) )
                    	    // InternalTechnoCat.g:529:6: ( ruleRTID )
                    	    {
                    	    // InternalTechnoCat.g:529:6: ( ruleRTID )
                    	    // InternalTechnoCat.g:530:7: ruleRTID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRTDRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleRTID();

                    	    state._fsp--;


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
                    break;

            }

            // InternalTechnoCat.g:546:3: (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTechnoCat.g:547:4: otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getRTDAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalTechnoCat.g:551:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalTechnoCat.g:552:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalTechnoCat.g:552:5: (lv_value_7_0= RULE_STRING )
                    // InternalTechnoCat.g:553:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getRTDAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRTDRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"eu.metatools.technocat.TechnoCat.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTechnoCat.g:570:3: ( (lv_items_8_0= ruleRTDItem ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==15) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==RULE_STRING) ) {
                    int LA11_3 = input.LA(2);

                    if ( (LA11_3==15) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalTechnoCat.g:571:4: (lv_items_8_0= ruleRTDItem )
            	    {
            	    // InternalTechnoCat.g:571:4: (lv_items_8_0= ruleRTDItem )
            	    // InternalTechnoCat.g:572:5: lv_items_8_0= ruleRTDItem
            	    {

            	    					newCompositeNode(grammarAccess.getRTDAccess().getItemsRTDItemParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_items_8_0=ruleRTDItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRTDRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_8_0,
            	    						"eu.metatools.technocat.TechnoCat.RTDItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleRTD"


    // $ANTLR start "entryRuleRTDItem"
    // InternalTechnoCat.g:593:1: entryRuleRTDItem returns [EObject current=null] : iv_ruleRTDItem= ruleRTDItem EOF ;
    public final EObject entryRuleRTDItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTDItem = null;


        try {
            // InternalTechnoCat.g:593:48: (iv_ruleRTDItem= ruleRTDItem EOF )
            // InternalTechnoCat.g:594:2: iv_ruleRTDItem= ruleRTDItem EOF
            {
             newCompositeNode(grammarAccess.getRTDItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRTDItem=ruleRTDItem();

            state._fsp--;

             current =iv_ruleRTDItem; 
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
    // $ANTLR end "entryRuleRTDItem"


    // $ANTLR start "ruleRTDItem"
    // InternalTechnoCat.g:600:1: ruleRTDItem returns [EObject current=null] : ( ( ( ruleETID ) ) otherlv_1= '->' ( ( ruleETID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRTDItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalTechnoCat.g:606:2: ( ( ( ( ruleETID ) ) otherlv_1= '->' ( ( ruleETID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? ) )
            // InternalTechnoCat.g:607:2: ( ( ( ruleETID ) ) otherlv_1= '->' ( ( ruleETID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? )
            {
            // InternalTechnoCat.g:607:2: ( ( ( ruleETID ) ) otherlv_1= '->' ( ( ruleETID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? )
            // InternalTechnoCat.g:608:3: ( ( ruleETID ) ) otherlv_1= '->' ( ( ruleETID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )?
            {
            // InternalTechnoCat.g:608:3: ( ( ruleETID ) )
            // InternalTechnoCat.g:609:4: ( ruleETID )
            {
            // InternalTechnoCat.g:609:4: ( ruleETID )
            // InternalTechnoCat.g:610:5: ruleETID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRTDItemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRTDItemAccess().getDomainETDCrossReference_0_0());
            				
            pushFollow(FOLLOW_13);
            ruleETID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRTDItemAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalTechnoCat.g:628:3: ( ( ruleETID ) )
            // InternalTechnoCat.g:629:4: ( ruleETID )
            {
            // InternalTechnoCat.g:629:4: ( ruleETID )
            // InternalTechnoCat.g:630:5: ruleETID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRTDItemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRTDItemAccess().getCodomainETDCrossReference_2_0());
            				
            pushFollow(FOLLOW_14);
            ruleETID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTechnoCat.g:644:3: (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTechnoCat.g:645:4: otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getRTDItemAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalTechnoCat.g:649:4: ( (lv_value_4_0= RULE_STRING ) )
                    // InternalTechnoCat.g:650:5: (lv_value_4_0= RULE_STRING )
                    {
                    // InternalTechnoCat.g:650:5: (lv_value_4_0= RULE_STRING )
                    // InternalTechnoCat.g:651:6: lv_value_4_0= RULE_STRING
                    {
                    lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_4_0, grammarAccess.getRTDItemAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRTDItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"eu.metatools.technocat.TechnoCat.STRING");
                    					

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
    // $ANTLR end "ruleRTDItem"


    // $ANTLR start "entryRuleED"
    // InternalTechnoCat.g:672:1: entryRuleED returns [EObject current=null] : iv_ruleED= ruleED EOF ;
    public final EObject entryRuleED() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleED = null;


        try {
            // InternalTechnoCat.g:672:43: (iv_ruleED= ruleED EOF )
            // InternalTechnoCat.g:673:2: iv_ruleED= ruleED EOF
            {
             newCompositeNode(grammarAccess.getEDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleED=ruleED();

            state._fsp--;

             current =iv_ruleED; 
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
    // $ANTLR end "entryRuleED"


    // $ANTLR start "ruleED"
    // InternalTechnoCat.g:679:1: ruleED returns [EObject current=null] : ( ( ( ruleETID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleEDItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )* ) ;
    public final EObject ruleED() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalTechnoCat.g:685:2: ( ( ( ( ruleETID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleEDItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )* ) )
            // InternalTechnoCat.g:686:2: ( ( ( ruleETID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleEDItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )* )
            {
            // InternalTechnoCat.g:686:2: ( ( ( ruleETID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleEDItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )* )
            // InternalTechnoCat.g:687:3: ( ( ruleETID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleEDItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )*
            {
            // InternalTechnoCat.g:687:3: ( ( ruleETID ) )
            // InternalTechnoCat.g:688:4: ( ruleETID )
            {
            // InternalTechnoCat.g:688:4: ( ruleETID )
            // InternalTechnoCat.g:689:5: ruleETID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEDRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEDAccess().getTypeETDCrossReference_0_0());
            				
            pushFollow(FOLLOW_15);
            ruleETID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getEDAccess().getColonKeyword_1());
            		
            // InternalTechnoCat.g:707:3: ( (lv_items_2_0= ruleEDItem ) )
            // InternalTechnoCat.g:708:4: (lv_items_2_0= ruleEDItem )
            {
            // InternalTechnoCat.g:708:4: (lv_items_2_0= ruleEDItem )
            // InternalTechnoCat.g:709:5: lv_items_2_0= ruleEDItem
            {

            					newCompositeNode(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_items_2_0=ruleEDItem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_2_0,
            						"eu.metatools.technocat.TechnoCat.EDItem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTechnoCat.g:726:3: (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTechnoCat.g:727:4: otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_16); 

            	    				newLeafNode(otherlv_3, grammarAccess.getEDAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalTechnoCat.g:731:4: ( (lv_items_4_0= ruleEDItem ) )
            	    // InternalTechnoCat.g:732:5: (lv_items_4_0= ruleEDItem )
            	    {
            	    // InternalTechnoCat.g:732:5: (lv_items_4_0= ruleEDItem )
            	    // InternalTechnoCat.g:733:6: lv_items_4_0= ruleEDItem
            	    {

            	    						newCompositeNode(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_items_4_0=ruleEDItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEDRule());
            	    						}
            	    						add(
            	    							current,
            	    							"items",
            	    							lv_items_4_0,
            	    							"eu.metatools.technocat.TechnoCat.EDItem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleED"


    // $ANTLR start "entryRuleEDItem"
    // InternalTechnoCat.g:755:1: entryRuleEDItem returns [EObject current=null] : iv_ruleEDItem= ruleEDItem EOF ;
    public final EObject entryRuleEDItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDItem = null;


        try {
            // InternalTechnoCat.g:755:47: (iv_ruleEDItem= ruleEDItem EOF )
            // InternalTechnoCat.g:756:2: iv_ruleEDItem= ruleEDItem EOF
            {
             newCompositeNode(grammarAccess.getEDItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDItem=ruleEDItem();

            state._fsp--;

             current =iv_ruleEDItem; 
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
    // $ANTLR end "entryRuleEDItem"


    // $ANTLR start "ruleEDItem"
    // InternalTechnoCat.g:762:1: ruleEDItem returns [EObject current=null] : ( ( (lv_name_0_0= ruleEID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEDItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTechnoCat.g:768:2: ( ( ( (lv_name_0_0= ruleEID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? ) )
            // InternalTechnoCat.g:769:2: ( ( (lv_name_0_0= ruleEID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? )
            {
            // InternalTechnoCat.g:769:2: ( ( (lv_name_0_0= ruleEID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? )
            // InternalTechnoCat.g:770:3: ( (lv_name_0_0= ruleEID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )?
            {
            // InternalTechnoCat.g:770:3: ( (lv_name_0_0= ruleEID ) )
            // InternalTechnoCat.g:771:4: (lv_name_0_0= ruleEID )
            {
            // InternalTechnoCat.g:771:4: (lv_name_0_0= ruleEID )
            // InternalTechnoCat.g:772:5: lv_name_0_0= ruleEID
            {

            					newCompositeNode(grammarAccess.getEDItemAccess().getNameEIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_0_0=ruleEID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDItemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"eu.metatools.technocat.TechnoCat.EID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTechnoCat.g:789:3: (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTechnoCat.g:790:4: otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getEDItemAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalTechnoCat.g:794:4: ( (lv_value_2_0= RULE_STRING ) )
                    // InternalTechnoCat.g:795:5: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalTechnoCat.g:795:5: (lv_value_2_0= RULE_STRING )
                    // InternalTechnoCat.g:796:6: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getEDItemAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEDItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"eu.metatools.technocat.TechnoCat.STRING");
                    					

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
    // $ANTLR end "ruleEDItem"


    // $ANTLR start "entryRuleRD"
    // InternalTechnoCat.g:817:1: entryRuleRD returns [EObject current=null] : iv_ruleRD= ruleRD EOF ;
    public final EObject entryRuleRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRD = null;


        try {
            // InternalTechnoCat.g:817:43: (iv_ruleRD= ruleRD EOF )
            // InternalTechnoCat.g:818:2: iv_ruleRD= ruleRD EOF
            {
             newCompositeNode(grammarAccess.getRDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRD=ruleRD();

            state._fsp--;

             current =iv_ruleRD; 
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
    // $ANTLR end "entryRuleRD"


    // $ANTLR start "ruleRD"
    // InternalTechnoCat.g:824:1: ruleRD returns [EObject current=null] : ( ( ( ruleEID ) ) ( ( ruleRTID ) ) ( ( ruleEID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRD() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalTechnoCat.g:830:2: ( ( ( ( ruleEID ) ) ( ( ruleRTID ) ) ( ( ruleEID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? ) )
            // InternalTechnoCat.g:831:2: ( ( ( ruleEID ) ) ( ( ruleRTID ) ) ( ( ruleEID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? )
            {
            // InternalTechnoCat.g:831:2: ( ( ( ruleEID ) ) ( ( ruleRTID ) ) ( ( ruleEID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? )
            // InternalTechnoCat.g:832:3: ( ( ruleEID ) ) ( ( ruleRTID ) ) ( ( ruleEID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )?
            {
            // InternalTechnoCat.g:832:3: ( ( ruleEID ) )
            // InternalTechnoCat.g:833:4: ( ruleEID )
            {
            // InternalTechnoCat.g:833:4: ( ruleEID )
            // InternalTechnoCat.g:834:5: ruleEID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRDRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRDAccess().getLeftEDItemCrossReference_0_0());
            				
            pushFollow(FOLLOW_9);
            ruleEID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTechnoCat.g:848:3: ( ( ruleRTID ) )
            // InternalTechnoCat.g:849:4: ( ruleRTID )
            {
            // InternalTechnoCat.g:849:4: ( ruleRTID )
            // InternalTechnoCat.g:850:5: ruleRTID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRDRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRDAccess().getRelationRTDCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleRTID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTechnoCat.g:864:3: ( ( ruleEID ) )
            // InternalTechnoCat.g:865:4: ( ruleEID )
            {
            // InternalTechnoCat.g:865:4: ( ruleEID )
            // InternalTechnoCat.g:866:5: ruleEID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRDRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRDAccess().getRightEDItemCrossReference_2_0());
            				
            pushFollow(FOLLOW_14);
            ruleEID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTechnoCat.g:880:3: (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTechnoCat.g:881:4: otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getRDAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalTechnoCat.g:885:4: ( (lv_value_4_0= RULE_STRING ) )
                    // InternalTechnoCat.g:886:5: (lv_value_4_0= RULE_STRING )
                    {
                    // InternalTechnoCat.g:886:5: (lv_value_4_0= RULE_STRING )
                    // InternalTechnoCat.g:887:6: lv_value_4_0= RULE_STRING
                    {
                    lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_4_0, grammarAccess.getRDAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRDRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"eu.metatools.technocat.TechnoCat.STRING");
                    					

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
    // $ANTLR end "ruleRD"


    // $ANTLR start "entryRuleTCID"
    // InternalTechnoCat.g:908:1: entryRuleTCID returns [String current=null] : iv_ruleTCID= ruleTCID EOF ;
    public final String entryRuleTCID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTCID = null;


        try {
            // InternalTechnoCat.g:908:44: (iv_ruleTCID= ruleTCID EOF )
            // InternalTechnoCat.g:909:2: iv_ruleTCID= ruleTCID EOF
            {
             newCompositeNode(grammarAccess.getTCIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTCID=ruleTCID();

            state._fsp--;

             current =iv_ruleTCID.getText(); 
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
    // $ANTLR end "entryRuleTCID"


    // $ANTLR start "ruleTCID"
    // InternalTechnoCat.g:915:1: ruleTCID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleTCID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalTechnoCat.g:921:2: (this_ID_0= RULE_ID )
            // InternalTechnoCat.g:922:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getTCIDAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleTCID"


    // $ANTLR start "entryRuleRTID"
    // InternalTechnoCat.g:932:1: entryRuleRTID returns [String current=null] : iv_ruleRTID= ruleRTID EOF ;
    public final String entryRuleRTID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRTID = null;


        try {
            // InternalTechnoCat.g:932:44: (iv_ruleRTID= ruleRTID EOF )
            // InternalTechnoCat.g:933:2: iv_ruleRTID= ruleRTID EOF
            {
             newCompositeNode(grammarAccess.getRTIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRTID=ruleRTID();

            state._fsp--;

             current =iv_ruleRTID.getText(); 
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
    // $ANTLR end "entryRuleRTID"


    // $ANTLR start "ruleRTID"
    // InternalTechnoCat.g:939:1: ruleRTID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_RSYM_2= ruleRSYM ) ;
    public final AntlrDatatypeRuleToken ruleRTID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_RSYM_2 = null;



        	enterRule();

        try {
            // InternalTechnoCat.g:945:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_RSYM_2= ruleRSYM ) )
            // InternalTechnoCat.g:946:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_RSYM_2= ruleRSYM )
            {
            // InternalTechnoCat.g:946:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_RSYM_2= ruleRSYM )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case RULE_STRING:
                {
                alt16=2;
                }
                break;
            case 13:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalTechnoCat.g:947:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getRTIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTechnoCat.g:955:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getRTIDAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTechnoCat.g:963:3: this_RSYM_2= ruleRSYM
                    {

                    			newCompositeNode(grammarAccess.getRTIDAccess().getRSYMParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RSYM_2=ruleRSYM();

                    state._fsp--;


                    			current.merge(this_RSYM_2);
                    		

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
    // $ANTLR end "ruleRTID"


    // $ANTLR start "entryRuleETID"
    // InternalTechnoCat.g:977:1: entryRuleETID returns [String current=null] : iv_ruleETID= ruleETID EOF ;
    public final String entryRuleETID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleETID = null;


        try {
            // InternalTechnoCat.g:977:44: (iv_ruleETID= ruleETID EOF )
            // InternalTechnoCat.g:978:2: iv_ruleETID= ruleETID EOF
            {
             newCompositeNode(grammarAccess.getETIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETID=ruleETID();

            state._fsp--;

             current =iv_ruleETID.getText(); 
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
    // $ANTLR end "entryRuleETID"


    // $ANTLR start "ruleETID"
    // InternalTechnoCat.g:984:1: ruleETID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleETID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalTechnoCat.g:990:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // InternalTechnoCat.g:991:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // InternalTechnoCat.g:991:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_STRING) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalTechnoCat.g:992:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getETIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTechnoCat.g:1000:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getETIDAccess().getSTRINGTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleETID"


    // $ANTLR start "entryRuleEID"
    // InternalTechnoCat.g:1011:1: entryRuleEID returns [String current=null] : iv_ruleEID= ruleEID EOF ;
    public final String entryRuleEID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEID = null;


        try {
            // InternalTechnoCat.g:1011:43: (iv_ruleEID= ruleEID EOF )
            // InternalTechnoCat.g:1012:2: iv_ruleEID= ruleEID EOF
            {
             newCompositeNode(grammarAccess.getEIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEID=ruleEID();

            state._fsp--;

             current =iv_ruleEID.getText(); 
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
    // $ANTLR end "entryRuleEID"


    // $ANTLR start "ruleEID"
    // InternalTechnoCat.g:1018:1: ruleEID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleEID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalTechnoCat.g:1024:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // InternalTechnoCat.g:1025:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // InternalTechnoCat.g:1025:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_STRING) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalTechnoCat.g:1026:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getEIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTechnoCat.g:1034:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getEIDAccess().getSTRINGTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEID"


    // $ANTLR start "entryRuleRSYM"
    // InternalTechnoCat.g:1045:1: entryRuleRSYM returns [String current=null] : iv_ruleRSYM= ruleRSYM EOF ;
    public final String entryRuleRSYM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRSYM = null;


        try {
            // InternalTechnoCat.g:1045:44: (iv_ruleRSYM= ruleRSYM EOF )
            // InternalTechnoCat.g:1046:2: iv_ruleRSYM= ruleRSYM EOF
            {
             newCompositeNode(grammarAccess.getRSYMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRSYM=ruleRSYM();

            state._fsp--;

             current =iv_ruleRSYM.getText(); 
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
    // $ANTLR end "entryRuleRSYM"


    // $ANTLR start "ruleRSYM"
    // InternalTechnoCat.g:1052:1: ruleRSYM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '!' | kw= '&&' | kw= '||' | kw= '~' | kw= '&' | kw= '|' | kw= '^' | kw= '<<' | kw= '>>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '?' ) ;
    public final AntlrDatatypeRuleToken ruleRSYM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTechnoCat.g:1058:2: ( (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '!' | kw= '&&' | kw= '||' | kw= '~' | kw= '&' | kw= '|' | kw= '^' | kw= '<<' | kw= '>>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '?' ) )
            // InternalTechnoCat.g:1059:2: (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '!' | kw= '&&' | kw= '||' | kw= '~' | kw= '&' | kw= '|' | kw= '^' | kw= '<<' | kw= '>>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '?' )
            {
            // InternalTechnoCat.g:1059:2: (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '!' | kw= '&&' | kw= '||' | kw= '~' | kw= '&' | kw= '|' | kw= '^' | kw= '<<' | kw= '>>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '?' )
            int alt19=34;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt19=1;
                }
                break;
            case 17:
                {
                alt19=2;
                }
                break;
            case 18:
                {
                alt19=3;
                }
                break;
            case 19:
                {
                alt19=4;
                }
                break;
            case 20:
                {
                alt19=5;
                }
                break;
            case 21:
                {
                alt19=6;
                }
                break;
            case 22:
                {
                alt19=7;
                }
                break;
            case 23:
                {
                alt19=8;
                }
                break;
            case 24:
                {
                alt19=9;
                }
                break;
            case 25:
                {
                alt19=10;
                }
                break;
            case 26:
                {
                alt19=11;
                }
                break;
            case 27:
                {
                alt19=12;
                }
                break;
            case 28:
                {
                alt19=13;
                }
                break;
            case 29:
                {
                alt19=14;
                }
                break;
            case 30:
                {
                alt19=15;
                }
                break;
            case 31:
                {
                alt19=16;
                }
                break;
            case 32:
                {
                alt19=17;
                }
                break;
            case 33:
                {
                alt19=18;
                }
                break;
            case 34:
                {
                alt19=19;
                }
                break;
            case 35:
                {
                alt19=20;
                }
                break;
            case 36:
                {
                alt19=21;
                }
                break;
            case 37:
                {
                alt19=22;
                }
                break;
            case 38:
                {
                alt19=23;
                }
                break;
            case 39:
                {
                alt19=24;
                }
                break;
            case 40:
                {
                alt19=25;
                }
                break;
            case 41:
                {
                alt19=26;
                }
                break;
            case 42:
                {
                alt19=27;
                }
                break;
            case 43:
                {
                alt19=28;
                }
                break;
            case 44:
                {
                alt19=29;
                }
                break;
            case 45:
                {
                alt19=30;
                }
                break;
            case 46:
                {
                alt19=31;
                }
                break;
            case 47:
                {
                alt19=32;
                }
                break;
            case 48:
                {
                alt19=33;
                }
                break;
            case 49:
                {
                alt19=34;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalTechnoCat.g:1060:3: kw= '='
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTechnoCat.g:1066:3: kw= '+'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getPlusSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTechnoCat.g:1072:3: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getHyphenMinusKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTechnoCat.g:1078:3: kw= '*'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getAsteriskKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTechnoCat.g:1084:3: kw= '/'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getSolidusKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalTechnoCat.g:1090:3: kw= '%'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getPercentSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalTechnoCat.g:1096:3: kw= '++'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getPlusSignPlusSignKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalTechnoCat.g:1102:3: kw= '--'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getHyphenMinusHyphenMinusKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalTechnoCat.g:1108:3: kw= '=='
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getEqualsSignEqualsSignKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalTechnoCat.g:1114:3: kw= '!='
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getExclamationMarkEqualsSignKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalTechnoCat.g:1120:3: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getGreaterThanSignKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalTechnoCat.g:1126:3: kw= '<'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getLessThanSignKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalTechnoCat.g:1132:3: kw= '>='
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getGreaterThanSignEqualsSignKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalTechnoCat.g:1138:3: kw= '<='
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getLessThanSignEqualsSignKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalTechnoCat.g:1144:3: kw= '!'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getExclamationMarkKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalTechnoCat.g:1150:3: kw= '&&'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getAmpersandAmpersandKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalTechnoCat.g:1156:3: kw= '||'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getVerticalLineVerticalLineKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalTechnoCat.g:1162:3: kw= '~'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getTildeKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalTechnoCat.g:1168:3: kw= '&'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getAmpersandKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalTechnoCat.g:1174:3: kw= '|'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getVerticalLineKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalTechnoCat.g:1180:3: kw= '^'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getCircumflexAccentKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalTechnoCat.g:1186:3: kw= '<<'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getLessThanSignLessThanSignKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalTechnoCat.g:1192:3: kw= '>>'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalTechnoCat.g:1198:3: kw= '+='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getPlusSignEqualsSignKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalTechnoCat.g:1204:3: kw= '-='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getHyphenMinusEqualsSignKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalTechnoCat.g:1210:3: kw= '*='
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getAsteriskEqualsSignKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalTechnoCat.g:1216:3: kw= '/='
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getSolidusEqualsSignKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalTechnoCat.g:1222:3: kw= '%='
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getPercentSignEqualsSignKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalTechnoCat.g:1228:3: kw= '&='
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getAmpersandEqualsSignKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalTechnoCat.g:1234:3: kw= '|='
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getVerticalLineEqualsSignKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalTechnoCat.g:1240:3: kw= '^='
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getCircumflexAccentEqualsSignKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalTechnoCat.g:1246:3: kw= '<<='
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getLessThanSignLessThanSignEqualsSignKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalTechnoCat.g:1252:3: kw= '>>='
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalTechnoCat.g:1258:3: kw= '?'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRSYMAccess().getQuestionMarkKeyword_33());
                    		

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
    // $ANTLR end "ruleRSYM"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004632L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0003FFFFFFFE2030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002832L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004630L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001002L});

}