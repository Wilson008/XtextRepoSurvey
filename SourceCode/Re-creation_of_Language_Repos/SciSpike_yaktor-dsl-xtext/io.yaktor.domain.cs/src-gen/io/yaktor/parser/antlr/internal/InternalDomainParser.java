package io.yaktor.parser.antlr.internal;

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
import io.yaktor.services.DomainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'domain-model'", "'{'", "'}'", "'as'", "'association'", "'-->'", "'<-->'", "'association-ref'", "'composition'", "'unique'", "'unique-constraint'", "'composite-index'", "'abstract'", "'entity'", "'extends'", "'auditable'", "'key'", "'('", "')'", "'type'", "'enum'", "'='", "'Id'", "'indexed'", "'ShortId'", "'String'", "'pattern'", "'obscured'", "'['", "'..'", "']'", "'Date'", "'past'", "'future'", "'GeoLocation'", "'Integer'", "'Numeric'", "'Boolean'", "'Price'", "'Amount'", "'Count'", "'jpa-enum-type'", "'Any'", "'ref'", "'-'", "'.'", "'E'", "'e'", "'true'", "'false'", "'jpa-gen-options'", "'use-aspects'", "'extensions'", "'project-options'", "'project-name'", "'root-package'", "'domain-subpackage'", "'controller-subpackage'", "'json-support'", "'generation-inclusion'", "'types'", "'controller'", "'resources'", "'properties'", "'views'", "'web-xml'", "'pom'", "'styles'", "'classes'", "'layouts'", "'web-mvc'", "'tags'", "'ttl'", "'node-mongo-options'", "'use-logger'", "'model-path'", "'test-path'", "'gen-test'", "'single-table-root'", "'persistence-options'", "'database'", "'provider'", "'user'", "'password'", "'url'", "'db-name'", "'!'", "'?'", "'+'", "'*'", "'OVERWRITE'", "'PROTECTED'", "'NONE'", "'MYSQL'", "'ORACLE'", "'DATABASE_DOT_COM'", "'DB2_400'", "'DB2_EXPRESS_C'", "'DERBY_CLIENT'", "'DERBY_EMBEDDED'", "'FIREBIRD'", "'GOOGLE_APP_ENGINE'", "'H2_IN_MEMORY'", "'HYPERSONIC_IN_MEMORY'", "'HYPERSONIC_PERSISTENT'", "'MSSQL'", "'POSTGRES'", "'SYBASE'", "'HIBERNATE'", "'DATANUCLEUS'", "'ECLIPSELINK'", "'OPENJPA'", "'ORDINAL'", "'STRING'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
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
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalDomainParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomain.g"; }



     	private DomainGrammarAccess grammarAccess;

        public InternalDomainParser(TokenStream input, DomainGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";
       	}

       	@Override
       	protected DomainGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainModel"
    // InternalDomain.g:65:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // InternalDomain.g:65:52: (iv_ruleDomainModel= ruleDomainModel EOF )
            // InternalDomain.g:66:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalDomain.g:72:1: ruleDomainModel returns [EObject current=null] : ( (otherlv_0= 'import' ( (lv_domainModelImports_1_0= ruleDomainModelImport ) ) )* otherlv_2= 'domain-model' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_genOptions_5_0= ruleGenOptions ) )? ( (lv_types_6_0= ruleNamedType ) )* otherlv_7= '}' ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_domainModelImports_1_0 = null;

        EObject lv_genOptions_5_0 = null;

        EObject lv_types_6_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:78:2: ( ( (otherlv_0= 'import' ( (lv_domainModelImports_1_0= ruleDomainModelImport ) ) )* otherlv_2= 'domain-model' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_genOptions_5_0= ruleGenOptions ) )? ( (lv_types_6_0= ruleNamedType ) )* otherlv_7= '}' ) )
            // InternalDomain.g:79:2: ( (otherlv_0= 'import' ( (lv_domainModelImports_1_0= ruleDomainModelImport ) ) )* otherlv_2= 'domain-model' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_genOptions_5_0= ruleGenOptions ) )? ( (lv_types_6_0= ruleNamedType ) )* otherlv_7= '}' )
            {
            // InternalDomain.g:79:2: ( (otherlv_0= 'import' ( (lv_domainModelImports_1_0= ruleDomainModelImport ) ) )* otherlv_2= 'domain-model' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_genOptions_5_0= ruleGenOptions ) )? ( (lv_types_6_0= ruleNamedType ) )* otherlv_7= '}' )
            // InternalDomain.g:80:3: (otherlv_0= 'import' ( (lv_domainModelImports_1_0= ruleDomainModelImport ) ) )* otherlv_2= 'domain-model' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_genOptions_5_0= ruleGenOptions ) )? ( (lv_types_6_0= ruleNamedType ) )* otherlv_7= '}'
            {
            // InternalDomain.g:80:3: (otherlv_0= 'import' ( (lv_domainModelImports_1_0= ruleDomainModelImport ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomain.g:81:4: otherlv_0= 'import' ( (lv_domainModelImports_1_0= ruleDomainModelImport ) )
            	    {
            	    otherlv_0=(Token)match(input,11,FOLLOW_3); 

            	    				newLeafNode(otherlv_0, grammarAccess.getDomainModelAccess().getImportKeyword_0_0());
            	    			
            	    // InternalDomain.g:85:4: ( (lv_domainModelImports_1_0= ruleDomainModelImport ) )
            	    // InternalDomain.g:86:5: (lv_domainModelImports_1_0= ruleDomainModelImport )
            	    {
            	    // InternalDomain.g:86:5: (lv_domainModelImports_1_0= ruleDomainModelImport )
            	    // InternalDomain.g:87:6: lv_domainModelImports_1_0= ruleDomainModelImport
            	    {

            	    						newCompositeNode(grammarAccess.getDomainModelAccess().getDomainModelImportsDomainModelImportParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_domainModelImports_1_0=ruleDomainModelImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"domainModelImports",
            	    							lv_domainModelImports_1_0,
            	    							"io.yaktor.Domain.DomainModelImport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainModelAccess().getDomainModelKeyword_1());
            		
            // InternalDomain.g:109:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDomain.g:110:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDomain.g:110:4: (lv_name_3_0= RULE_ID )
            // InternalDomain.g:111:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getDomainModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDomain.g:131:3: ( (lv_genOptions_5_0= ruleGenOptions ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==62||LA2_0==85) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomain.g:132:4: (lv_genOptions_5_0= ruleGenOptions )
                    {
                    // InternalDomain.g:132:4: (lv_genOptions_5_0= ruleGenOptions )
                    // InternalDomain.g:133:5: lv_genOptions_5_0= ruleGenOptions
                    {

                    					newCompositeNode(grammarAccess.getDomainModelAccess().getGenOptionsGenOptionsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_genOptions_5_0=ruleGenOptions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDomainModelRule());
                    					}
                    					set(
                    						current,
                    						"genOptions",
                    						lv_genOptions_5_0,
                    						"io.yaktor.Domain.GenOptions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:150:3: ( (lv_types_6_0= ruleNamedType ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||LA3_0==19||(LA3_0>=24 && LA3_0<=25)||(LA3_0>=31 && LA3_0<=32)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDomain.g:151:4: (lv_types_6_0= ruleNamedType )
            	    {
            	    // InternalDomain.g:151:4: (lv_types_6_0= ruleNamedType )
            	    // InternalDomain.g:152:5: lv_types_6_0= ruleNamedType
            	    {

            	    					newCompositeNode(grammarAccess.getDomainModelAccess().getTypesNamedTypeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_types_6_0=ruleNamedType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_6_0,
            	    						"io.yaktor.Domain.NamedType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleDomainModelImport"
    // InternalDomain.g:177:1: entryRuleDomainModelImport returns [EObject current=null] : iv_ruleDomainModelImport= ruleDomainModelImport EOF ;
    public final EObject entryRuleDomainModelImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModelImport = null;


        try {
            // InternalDomain.g:177:58: (iv_ruleDomainModelImport= ruleDomainModelImport EOF )
            // InternalDomain.g:178:2: iv_ruleDomainModelImport= ruleDomainModelImport EOF
            {
             newCompositeNode(grammarAccess.getDomainModelImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainModelImport=ruleDomainModelImport();

            state._fsp--;

             current =iv_ruleDomainModelImport; 
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
    // $ANTLR end "entryRuleDomainModelImport"


    // $ANTLR start "ruleDomainModelImport"
    // InternalDomain.g:184:1: ruleDomainModelImport returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDomainModelImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_alias_2_0=null;


        	enterRule();

        try {
            // InternalDomain.g:190:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ) )
            // InternalDomain.g:191:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? )
            {
            // InternalDomain.g:191:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? )
            // InternalDomain.g:192:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )?
            {
            // InternalDomain.g:192:3: ( (otherlv_0= RULE_ID ) )
            // InternalDomain.g:193:4: (otherlv_0= RULE_ID )
            {
            // InternalDomain.g:193:4: (otherlv_0= RULE_ID )
            // InternalDomain.g:194:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainModelImportRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getDomainModelImportAccess().getRefDomainModelCrossReference_0_0());
            				

            }


            }

            // InternalDomain.g:205:3: (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomain.g:206:4: otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDomainModelImportAccess().getAsKeyword_1_0());
                    			
                    // InternalDomain.g:210:4: ( (lv_alias_2_0= RULE_ID ) )
                    // InternalDomain.g:211:5: (lv_alias_2_0= RULE_ID )
                    {
                    // InternalDomain.g:211:5: (lv_alias_2_0= RULE_ID )
                    // InternalDomain.g:212:6: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_alias_2_0, grammarAccess.getDomainModelImportAccess().getAliasIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDomainModelImportRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

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
    // $ANTLR end "ruleDomainModelImport"


    // $ANTLR start "entryRuleNamedType"
    // InternalDomain.g:233:1: entryRuleNamedType returns [EObject current=null] : iv_ruleNamedType= ruleNamedType EOF ;
    public final EObject entryRuleNamedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedType = null;


        try {
            // InternalDomain.g:233:50: (iv_ruleNamedType= ruleNamedType EOF )
            // InternalDomain.g:234:2: iv_ruleNamedType= ruleNamedType EOF
            {
             newCompositeNode(grammarAccess.getNamedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedType=ruleNamedType();

            state._fsp--;

             current =iv_ruleNamedType; 
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
    // InternalDomain.g:240:1: ruleNamedType returns [EObject current=null] : (this_Association_0= ruleAssociation | this_AssociationRef_1= ruleAssociationRef | this_Entity_2= ruleEntity | this_EnumType_3= ruleEnumType | this_Type_4= ruleType ) ;
    public final EObject ruleNamedType() throws RecognitionException {
        EObject current = null;

        EObject this_Association_0 = null;

        EObject this_AssociationRef_1 = null;

        EObject this_Entity_2 = null;

        EObject this_EnumType_3 = null;

        EObject this_Type_4 = null;



        	enterRule();

        try {
            // InternalDomain.g:246:2: ( (this_Association_0= ruleAssociation | this_AssociationRef_1= ruleAssociationRef | this_Entity_2= ruleEntity | this_EnumType_3= ruleEnumType | this_Type_4= ruleType ) )
            // InternalDomain.g:247:2: (this_Association_0= ruleAssociation | this_AssociationRef_1= ruleAssociationRef | this_Entity_2= ruleEntity | this_EnumType_3= ruleEnumType | this_Type_4= ruleType )
            {
            // InternalDomain.g:247:2: (this_Association_0= ruleAssociation | this_AssociationRef_1= ruleAssociationRef | this_Entity_2= ruleEntity | this_EnumType_3= ruleEnumType | this_Type_4= ruleType )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==31) ) {
                    alt5=5;
                }
                else if ( (LA5_3==25) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 32:
                {
                alt5=4;
                }
                break;
            case 31:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDomain.g:248:3: this_Association_0= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getNamedTypeAccess().getAssociationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_0=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomain.g:257:3: this_AssociationRef_1= ruleAssociationRef
                    {

                    			newCompositeNode(grammarAccess.getNamedTypeAccess().getAssociationRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationRef_1=ruleAssociationRef();

                    state._fsp--;


                    			current = this_AssociationRef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDomain.g:266:3: this_Entity_2= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getNamedTypeAccess().getEntityParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_2=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDomain.g:275:3: this_EnumType_3= ruleEnumType
                    {

                    			newCompositeNode(grammarAccess.getNamedTypeAccess().getEnumTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumType_3=ruleEnumType();

                    state._fsp--;


                    			current = this_EnumType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDomain.g:284:3: this_Type_4= ruleType
                    {

                    			newCompositeNode(grammarAccess.getNamedTypeAccess().getTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_4=ruleType();

                    state._fsp--;


                    			current = this_Type_4;
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
    // $ANTLR end "ruleNamedType"


    // $ANTLR start "entryRuleAssociation"
    // InternalDomain.g:296:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalDomain.g:296:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalDomain.g:297:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalDomain.g:303:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_start_3_0= ruleAssociationEnd ) ) ( ( (lv_isUnidirectional_4_0= '-->' ) ) | otherlv_5= '<-->' ) ( (lv_end_6_0= ruleAssociationEnd ) ) otherlv_7= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_isUnidirectional_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_start_3_0 = null;

        EObject lv_end_6_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:309:2: ( (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_start_3_0= ruleAssociationEnd ) ) ( ( (lv_isUnidirectional_4_0= '-->' ) ) | otherlv_5= '<-->' ) ( (lv_end_6_0= ruleAssociationEnd ) ) otherlv_7= '}' ) )
            // InternalDomain.g:310:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_start_3_0= ruleAssociationEnd ) ) ( ( (lv_isUnidirectional_4_0= '-->' ) ) | otherlv_5= '<-->' ) ( (lv_end_6_0= ruleAssociationEnd ) ) otherlv_7= '}' )
            {
            // InternalDomain.g:310:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_start_3_0= ruleAssociationEnd ) ) ( ( (lv_isUnidirectional_4_0= '-->' ) ) | otherlv_5= '<-->' ) ( (lv_end_6_0= ruleAssociationEnd ) ) otherlv_7= '}' )
            // InternalDomain.g:311:3: otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_start_3_0= ruleAssociationEnd ) ) ( ( (lv_isUnidirectional_4_0= '-->' ) ) | otherlv_5= '<-->' ) ( (lv_end_6_0= ruleAssociationEnd ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getAssociationKeyword_0());
            		
            // InternalDomain.g:315:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:316:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:316:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:317:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDomain.g:337:3: ( (lv_start_3_0= ruleAssociationEnd ) )
            // InternalDomain.g:338:4: (lv_start_3_0= ruleAssociationEnd )
            {
            // InternalDomain.g:338:4: (lv_start_3_0= ruleAssociationEnd )
            // InternalDomain.g:339:5: lv_start_3_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getStartAssociationEndParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_start_3_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_3_0,
            						"io.yaktor.Domain.AssociationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomain.g:356:3: ( ( (lv_isUnidirectional_4_0= '-->' ) ) | otherlv_5= '<-->' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDomain.g:357:4: ( (lv_isUnidirectional_4_0= '-->' ) )
                    {
                    // InternalDomain.g:357:4: ( (lv_isUnidirectional_4_0= '-->' ) )
                    // InternalDomain.g:358:5: (lv_isUnidirectional_4_0= '-->' )
                    {
                    // InternalDomain.g:358:5: (lv_isUnidirectional_4_0= '-->' )
                    // InternalDomain.g:359:6: lv_isUnidirectional_4_0= '-->'
                    {
                    lv_isUnidirectional_4_0=(Token)match(input,17,FOLLOW_3); 

                    						newLeafNode(lv_isUnidirectional_4_0, grammarAccess.getAssociationAccess().getIsUnidirectionalHyphenMinusHyphenMinusGreaterThanSignKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationRule());
                    						}
                    						setWithLastConsumed(current, "isUnidirectional", lv_isUnidirectional_4_0 != null, "-->");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:372:4: otherlv_5= '<-->'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getLessThanSignHyphenMinusHyphenMinusGreaterThanSignKeyword_4_1());
                    			

                    }
                    break;

            }

            // InternalDomain.g:377:3: ( (lv_end_6_0= ruleAssociationEnd ) )
            // InternalDomain.g:378:4: (lv_end_6_0= ruleAssociationEnd )
            {
            // InternalDomain.g:378:4: (lv_end_6_0= ruleAssociationEnd )
            // InternalDomain.g:379:5: lv_end_6_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getEndAssociationEndParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_end_6_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_6_0,
            						"io.yaktor.Domain.AssociationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleAssociationRef"
    // InternalDomain.g:404:1: entryRuleAssociationRef returns [EObject current=null] : iv_ruleAssociationRef= ruleAssociationRef EOF ;
    public final EObject entryRuleAssociationRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationRef = null;


        try {
            // InternalDomain.g:404:55: (iv_ruleAssociationRef= ruleAssociationRef EOF )
            // InternalDomain.g:405:2: iv_ruleAssociationRef= ruleAssociationRef EOF
            {
             newCompositeNode(grammarAccess.getAssociationRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationRef=ruleAssociationRef();

            state._fsp--;

             current =iv_ruleAssociationRef; 
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
    // $ANTLR end "entryRuleAssociationRef"


    // $ANTLR start "ruleAssociationRef"
    // InternalDomain.g:411:1: ruleAssociationRef returns [EObject current=null] : (otherlv_0= 'association-ref' ( ( rulePossiblyQualifiedName ) ) ) ;
    public final EObject ruleAssociationRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDomain.g:417:2: ( (otherlv_0= 'association-ref' ( ( rulePossiblyQualifiedName ) ) ) )
            // InternalDomain.g:418:2: (otherlv_0= 'association-ref' ( ( rulePossiblyQualifiedName ) ) )
            {
            // InternalDomain.g:418:2: (otherlv_0= 'association-ref' ( ( rulePossiblyQualifiedName ) ) )
            // InternalDomain.g:419:3: otherlv_0= 'association-ref' ( ( rulePossiblyQualifiedName ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationRefAccess().getAssociationRefKeyword_0());
            		
            // InternalDomain.g:423:3: ( ( rulePossiblyQualifiedName ) )
            // InternalDomain.g:424:4: ( rulePossiblyQualifiedName )
            {
            // InternalDomain.g:424:4: ( rulePossiblyQualifiedName )
            // InternalDomain.g:425:5: rulePossiblyQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationRefAccess().getRefAssociationCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            rulePossiblyQualifiedName();

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
    // $ANTLR end "ruleAssociationRef"


    // $ANTLR start "entryRuleAssociationEnd"
    // InternalDomain.g:443:1: entryRuleAssociationEnd returns [EObject current=null] : iv_ruleAssociationEnd= ruleAssociationEnd EOF ;
    public final EObject entryRuleAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEnd = null;


        try {
            // InternalDomain.g:443:55: (iv_ruleAssociationEnd= ruleAssociationEnd EOF )
            // InternalDomain.g:444:2: iv_ruleAssociationEnd= ruleAssociationEnd EOF
            {
             newCompositeNode(grammarAccess.getAssociationEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationEnd=ruleAssociationEnd();

            state._fsp--;

             current =iv_ruleAssociationEnd; 
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
    // $ANTLR end "entryRuleAssociationEnd"


    // $ANTLR start "ruleAssociationEnd"
    // InternalDomain.g:450:1: ruleAssociationEnd returns [EObject current=null] : ( ( ( rulePossiblyQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_isComposition_3_0= 'composition' ) )? ( (lv_unique_4_0= 'unique' ) )? ) ;
    public final EObject ruleAssociationEnd() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_isComposition_3_0=null;
        Token lv_unique_4_0=null;
        Enumerator lv_cardinality_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:456:2: ( ( ( ( rulePossiblyQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_isComposition_3_0= 'composition' ) )? ( (lv_unique_4_0= 'unique' ) )? ) )
            // InternalDomain.g:457:2: ( ( ( rulePossiblyQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_isComposition_3_0= 'composition' ) )? ( (lv_unique_4_0= 'unique' ) )? )
            {
            // InternalDomain.g:457:2: ( ( ( rulePossiblyQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_isComposition_3_0= 'composition' ) )? ( (lv_unique_4_0= 'unique' ) )? )
            // InternalDomain.g:458:3: ( ( rulePossiblyQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_isComposition_3_0= 'composition' ) )? ( (lv_unique_4_0= 'unique' ) )?
            {
            // InternalDomain.g:458:3: ( ( rulePossiblyQualifiedName ) )
            // InternalDomain.g:459:4: ( rulePossiblyQualifiedName )
            {
            // InternalDomain.g:459:4: ( rulePossiblyQualifiedName )
            // InternalDomain.g:460:5: rulePossiblyQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationEndRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getReferencesEntityCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            rulePossiblyQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomain.g:474:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:475:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:475:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:476:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAssociationEndAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:492:3: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=98 && LA7_0<=101)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomain.g:493:4: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // InternalDomain.g:493:4: (lv_cardinality_2_0= ruleCardinality )
                    // InternalDomain.g:494:5: lv_cardinality_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getAssociationEndAccess().getCardinalityCardinalityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationEndRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_2_0,
                    						"io.yaktor.Domain.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:511:3: ( (lv_isComposition_3_0= 'composition' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDomain.g:512:4: (lv_isComposition_3_0= 'composition' )
                    {
                    // InternalDomain.g:512:4: (lv_isComposition_3_0= 'composition' )
                    // InternalDomain.g:513:5: lv_isComposition_3_0= 'composition'
                    {
                    lv_isComposition_3_0=(Token)match(input,20,FOLLOW_13); 

                    					newLeafNode(lv_isComposition_3_0, grammarAccess.getAssociationEndAccess().getIsCompositionCompositionKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationEndRule());
                    					}
                    					setWithLastConsumed(current, "isComposition", lv_isComposition_3_0 != null, "composition");
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:525:3: ( (lv_unique_4_0= 'unique' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDomain.g:526:4: (lv_unique_4_0= 'unique' )
                    {
                    // InternalDomain.g:526:4: (lv_unique_4_0= 'unique' )
                    // InternalDomain.g:527:5: lv_unique_4_0= 'unique'
                    {
                    lv_unique_4_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_unique_4_0, grammarAccess.getAssociationEndAccess().getUniqueUniqueKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationEndRule());
                    					}
                    					setWithLastConsumed(current, "unique", lv_unique_4_0 != null, "unique");
                    				

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
    // $ANTLR end "ruleAssociationEnd"


    // $ANTLR start "entryRuleSimpleField"
    // InternalDomain.g:543:1: entryRuleSimpleField returns [EObject current=null] : iv_ruleSimpleField= ruleSimpleField EOF ;
    public final EObject entryRuleSimpleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleField = null;


        try {
            // InternalDomain.g:543:52: (iv_ruleSimpleField= ruleSimpleField EOF )
            // InternalDomain.g:544:2: iv_ruleSimpleField= ruleSimpleField EOF
            {
             newCompositeNode(grammarAccess.getSimpleFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleField=ruleSimpleField();

            state._fsp--;

             current =iv_ruleSimpleField; 
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
    // $ANTLR end "entryRuleSimpleField"


    // $ANTLR start "ruleSimpleField"
    // InternalDomain.g:550:1: ruleSimpleField returns [EObject current=null] : (this_IdField_0= ruleIdField | this_ShortIdField_1= ruleShortIdField | this_StringField_2= ruleStringField | this_DateField_3= ruleDateField | this_IntegerField_4= ruleIntegerField | this_EnumField_5= ruleEnumField | this_NumericField_6= ruleNumericField | this_BooleanField_7= ruleBooleanField | this_PriceField_8= rulePriceField | this_AmountField_9= ruleAmountField | this_CountField_10= ruleCountField | this_EntityReferenceField_11= ruleEntityReferenceField | this_GeoLocationField_12= ruleGeoLocationField ) ;
    public final EObject ruleSimpleField() throws RecognitionException {
        EObject current = null;

        EObject this_IdField_0 = null;

        EObject this_ShortIdField_1 = null;

        EObject this_StringField_2 = null;

        EObject this_DateField_3 = null;

        EObject this_IntegerField_4 = null;

        EObject this_EnumField_5 = null;

        EObject this_NumericField_6 = null;

        EObject this_BooleanField_7 = null;

        EObject this_PriceField_8 = null;

        EObject this_AmountField_9 = null;

        EObject this_CountField_10 = null;

        EObject this_EntityReferenceField_11 = null;

        EObject this_GeoLocationField_12 = null;



        	enterRule();

        try {
            // InternalDomain.g:556:2: ( (this_IdField_0= ruleIdField | this_ShortIdField_1= ruleShortIdField | this_StringField_2= ruleStringField | this_DateField_3= ruleDateField | this_IntegerField_4= ruleIntegerField | this_EnumField_5= ruleEnumField | this_NumericField_6= ruleNumericField | this_BooleanField_7= ruleBooleanField | this_PriceField_8= rulePriceField | this_AmountField_9= ruleAmountField | this_CountField_10= ruleCountField | this_EntityReferenceField_11= ruleEntityReferenceField | this_GeoLocationField_12= ruleGeoLocationField ) )
            // InternalDomain.g:557:2: (this_IdField_0= ruleIdField | this_ShortIdField_1= ruleShortIdField | this_StringField_2= ruleStringField | this_DateField_3= ruleDateField | this_IntegerField_4= ruleIntegerField | this_EnumField_5= ruleEnumField | this_NumericField_6= ruleNumericField | this_BooleanField_7= ruleBooleanField | this_PriceField_8= rulePriceField | this_AmountField_9= ruleAmountField | this_CountField_10= ruleCountField | this_EntityReferenceField_11= ruleEntityReferenceField | this_GeoLocationField_12= ruleGeoLocationField )
            {
            // InternalDomain.g:557:2: (this_IdField_0= ruleIdField | this_ShortIdField_1= ruleShortIdField | this_StringField_2= ruleStringField | this_DateField_3= ruleDateField | this_IntegerField_4= ruleIntegerField | this_EnumField_5= ruleEnumField | this_NumericField_6= ruleNumericField | this_BooleanField_7= ruleBooleanField | this_PriceField_8= rulePriceField | this_AmountField_9= ruleAmountField | this_CountField_10= ruleCountField | this_EntityReferenceField_11= ruleEntityReferenceField | this_GeoLocationField_12= ruleGeoLocationField )
            int alt10=13;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt10=1;
                }
                break;
            case 36:
                {
                alt10=2;
                }
                break;
            case 37:
                {
                alt10=3;
                }
                break;
            case 43:
                {
                alt10=4;
                }
                break;
            case 47:
                {
                alt10=5;
                }
                break;
            case 32:
                {
                alt10=6;
                }
                break;
            case 48:
                {
                alt10=7;
                }
                break;
            case 49:
                {
                alt10=8;
                }
                break;
            case 50:
                {
                alt10=9;
                }
                break;
            case 51:
                {
                alt10=10;
                }
                break;
            case 52:
                {
                alt10=11;
                }
                break;
            case 55:
                {
                alt10=12;
                }
                break;
            case 46:
                {
                alt10=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDomain.g:558:3: this_IdField_0= ruleIdField
                    {

                    			newCompositeNode(grammarAccess.getSimpleFieldAccess().getIdFieldParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IdField_0=ruleIdField();

                    state._fsp--;


                    			current = this_IdField_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomain.g:567:3: this_ShortIdField_1= ruleShortIdField
                    {

                    			newCompositeNode(grammarAccess.getSimpleFieldAccess().getShortIdFieldParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShortIdField_1=ruleShortIdField();

                    state._fsp--;


                    			current = this_ShortIdField_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDomain.g:576:3: this_StringField_2= ruleStringField
                    {

                    			newCompositeNode(grammarAccess.getSimpleFieldAccess().getStringFieldParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringField_2=ruleStringField();

                    state._fsp--;


                    			current = this_StringField_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDomain.g:585:3: this_DateField_3= ruleDateField
                    {

                    			newCompositeNode(grammarAccess.getSimpleFieldAccess().getDateFieldParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DateField_3=ruleDateField();

                    state._fsp--;


                    			current = this_DateField_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDomain.g:594:3: this_IntegerField_4= ruleIntegerField
                    {

                    			newCompositeNode(grammarAccess.getSimpleFieldAccess().getIntegerFieldParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerField_4=ruleIntegerField();

                    state._fsp--;


                    			current = this_IntegerField_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDomain.g:603:3: this_EnumField_5= ruleEnumField
                    {

                    			newCompositeNode(grammarAccess.getSimpleFieldAccess().getEnumFieldParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumField_5=ruleEnumField();

                    state._fsp--;


                    			current = this_EnumField_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDomain.g:612:3: this_NumericField_6= ruleNumericField
                    {

                    			newCompositeNode(grammarAccess.getSimpleFieldAccess().getNumericFieldParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericField_6=ruleNumericField();

                    state._fsp--;


                    			current = this_NumericField_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDomain.g:621:3: this_BooleanField_7= ruleBooleanField
                    {

                    			newCompositeNode(grammarAccess.getSimpleFieldAccess().getBooleanFieldParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanField_7=ruleBooleanField();

                    state._fsp--;


                    			current = this_BooleanField_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDomain.g:630:3: this_PriceField_8= rulePriceField
                    {

                    			newCompositeNode(grammarAccess.getSimpleFieldAccess().getPriceFieldParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_PriceField_8=rulePriceField();

                    state._fsp--;


                    			current = this_PriceField_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDomain.g:639:3: this_AmountField_9= ruleAmountField
                    {

                    			newCompositeNode(grammarAccess.getSimpleFieldAccess().getAmountFieldParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_AmountField_9=ruleAmountField();

                    state._fsp--;


                    			current = this_AmountField_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDomain.g:648:3: this_CountField_10= ruleCountField
                    {

                    			newCompositeNode(grammarAccess.getSimpleFieldAccess().getCountFieldParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_CountField_10=ruleCountField();

                    state._fsp--;


                    			current = this_CountField_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDomain.g:657:3: this_EntityReferenceField_11= ruleEntityReferenceField
                    {

                    			newCompositeNode(grammarAccess.getSimpleFieldAccess().getEntityReferenceFieldParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityReferenceField_11=ruleEntityReferenceField();

                    state._fsp--;


                    			current = this_EntityReferenceField_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalDomain.g:666:3: this_GeoLocationField_12= ruleGeoLocationField
                    {

                    			newCompositeNode(grammarAccess.getSimpleFieldAccess().getGeoLocationFieldParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeoLocationField_12=ruleGeoLocationField();

                    state._fsp--;


                    			current = this_GeoLocationField_12;
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
    // $ANTLR end "ruleSimpleField"


    // $ANTLR start "entryRuleField"
    // InternalDomain.g:678:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalDomain.g:678:46: (iv_ruleField= ruleField EOF )
            // InternalDomain.g:679:2: iv_ruleField= ruleField EOF
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
    // InternalDomain.g:685:1: ruleField returns [EObject current=null] : (this_SimpleField_0= ruleSimpleField | this_TypeField_1= ruleTypeField | this_AnyField_2= ruleAnyField ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleField_0 = null;

        EObject this_TypeField_1 = null;

        EObject this_AnyField_2 = null;



        	enterRule();

        try {
            // InternalDomain.g:691:2: ( (this_SimpleField_0= ruleSimpleField | this_TypeField_1= ruleTypeField | this_AnyField_2= ruleAnyField ) )
            // InternalDomain.g:692:2: (this_SimpleField_0= ruleSimpleField | this_TypeField_1= ruleTypeField | this_AnyField_2= ruleAnyField )
            {
            // InternalDomain.g:692:2: (this_SimpleField_0= ruleSimpleField | this_TypeField_1= ruleTypeField | this_AnyField_2= ruleAnyField )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 32:
            case 34:
            case 36:
            case 37:
            case 43:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 55:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case 54:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDomain.g:693:3: this_SimpleField_0= ruleSimpleField
                    {

                    			newCompositeNode(grammarAccess.getFieldAccess().getSimpleFieldParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleField_0=ruleSimpleField();

                    state._fsp--;


                    			current = this_SimpleField_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomain.g:702:3: this_TypeField_1= ruleTypeField
                    {

                    			newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeField_1=ruleTypeField();

                    state._fsp--;


                    			current = this_TypeField_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDomain.g:711:3: this_AnyField_2= ruleAnyField
                    {

                    			newCompositeNode(grammarAccess.getFieldAccess().getAnyFieldParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnyField_2=ruleAnyField();

                    state._fsp--;


                    			current = this_AnyField_2;
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleUniqueConstraint"
    // InternalDomain.g:723:1: entryRuleUniqueConstraint returns [EObject current=null] : iv_ruleUniqueConstraint= ruleUniqueConstraint EOF ;
    public final EObject entryRuleUniqueConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueConstraint = null;


        try {
            // InternalDomain.g:723:57: (iv_ruleUniqueConstraint= ruleUniqueConstraint EOF )
            // InternalDomain.g:724:2: iv_ruleUniqueConstraint= ruleUniqueConstraint EOF
            {
             newCompositeNode(grammarAccess.getUniqueConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUniqueConstraint=ruleUniqueConstraint();

            state._fsp--;

             current =iv_ruleUniqueConstraint; 
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
    // $ANTLR end "entryRuleUniqueConstraint"


    // $ANTLR start "ruleUniqueConstraint"
    // InternalDomain.g:730:1: ruleUniqueConstraint returns [EObject current=null] : (otherlv_0= 'unique-constraint' ( ( rulePossiblyQualifiedName ) )+ ) ;
    public final EObject ruleUniqueConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDomain.g:736:2: ( (otherlv_0= 'unique-constraint' ( ( rulePossiblyQualifiedName ) )+ ) )
            // InternalDomain.g:737:2: (otherlv_0= 'unique-constraint' ( ( rulePossiblyQualifiedName ) )+ )
            {
            // InternalDomain.g:737:2: (otherlv_0= 'unique-constraint' ( ( rulePossiblyQualifiedName ) )+ )
            // InternalDomain.g:738:3: otherlv_0= 'unique-constraint' ( ( rulePossiblyQualifiedName ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUniqueConstraintAccess().getUniqueConstraintKeyword_0());
            		
            // InternalDomain.g:742:3: ( ( rulePossiblyQualifiedName ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDomain.g:743:4: ( rulePossiblyQualifiedName )
            	    {
            	    // InternalDomain.g:743:4: ( rulePossiblyQualifiedName )
            	    // InternalDomain.g:744:5: rulePossiblyQualifiedName
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUniqueConstraintRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getUniqueConstraintAccess().getFieldsConstraintTypeFieldCrossReference_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    rulePossiblyQualifiedName();

            	    state._fsp--;


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
    // $ANTLR end "ruleUniqueConstraint"


    // $ANTLR start "entryRuleIndexConstraint"
    // InternalDomain.g:762:1: entryRuleIndexConstraint returns [EObject current=null] : iv_ruleIndexConstraint= ruleIndexConstraint EOF ;
    public final EObject entryRuleIndexConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexConstraint = null;


        try {
            // InternalDomain.g:762:56: (iv_ruleIndexConstraint= ruleIndexConstraint EOF )
            // InternalDomain.g:763:2: iv_ruleIndexConstraint= ruleIndexConstraint EOF
            {
             newCompositeNode(grammarAccess.getIndexConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexConstraint=ruleIndexConstraint();

            state._fsp--;

             current =iv_ruleIndexConstraint; 
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
    // $ANTLR end "entryRuleIndexConstraint"


    // $ANTLR start "ruleIndexConstraint"
    // InternalDomain.g:769:1: ruleIndexConstraint returns [EObject current=null] : (otherlv_0= 'composite-index' ( ( rulePossiblyQualifiedName ) )+ ) ;
    public final EObject ruleIndexConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDomain.g:775:2: ( (otherlv_0= 'composite-index' ( ( rulePossiblyQualifiedName ) )+ ) )
            // InternalDomain.g:776:2: (otherlv_0= 'composite-index' ( ( rulePossiblyQualifiedName ) )+ )
            {
            // InternalDomain.g:776:2: (otherlv_0= 'composite-index' ( ( rulePossiblyQualifiedName ) )+ )
            // InternalDomain.g:777:3: otherlv_0= 'composite-index' ( ( rulePossiblyQualifiedName ) )+
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexConstraintAccess().getCompositeIndexKeyword_0());
            		
            // InternalDomain.g:781:3: ( ( rulePossiblyQualifiedName ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDomain.g:782:4: ( rulePossiblyQualifiedName )
            	    {
            	    // InternalDomain.g:782:4: ( rulePossiblyQualifiedName )
            	    // InternalDomain.g:783:5: rulePossiblyQualifiedName
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getIndexConstraintRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getIndexConstraintAccess().getFieldsConstraintTypeFieldCrossReference_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    rulePossiblyQualifiedName();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // $ANTLR end "ruleIndexConstraint"


    // $ANTLR start "entryRuleEntity"
    // InternalDomain.g:801:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDomain.g:801:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDomain.g:802:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDomain.g:808:1: ruleEntity returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( rulePossiblyQualifiedName ) ) )? ( (lv_metaData_5_0= 'auditable' ) )? otherlv_6= '{' ( (lv_fields_7_0= ruleField ) )* ( (lv_uniqueConstraints_8_0= ruleUniqueConstraint ) )* ( (lv_indexConstraints_9_0= ruleIndexConstraint ) )* (otherlv_10= 'key' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' )? otherlv_14= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_metaData_5_0=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_fields_7_0 = null;

        EObject lv_uniqueConstraints_8_0 = null;

        EObject lv_indexConstraints_9_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:814:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( rulePossiblyQualifiedName ) ) )? ( (lv_metaData_5_0= 'auditable' ) )? otherlv_6= '{' ( (lv_fields_7_0= ruleField ) )* ( (lv_uniqueConstraints_8_0= ruleUniqueConstraint ) )* ( (lv_indexConstraints_9_0= ruleIndexConstraint ) )* (otherlv_10= 'key' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' )? otherlv_14= '}' ) )
            // InternalDomain.g:815:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( rulePossiblyQualifiedName ) ) )? ( (lv_metaData_5_0= 'auditable' ) )? otherlv_6= '{' ( (lv_fields_7_0= ruleField ) )* ( (lv_uniqueConstraints_8_0= ruleUniqueConstraint ) )* ( (lv_indexConstraints_9_0= ruleIndexConstraint ) )* (otherlv_10= 'key' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' )? otherlv_14= '}' )
            {
            // InternalDomain.g:815:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( rulePossiblyQualifiedName ) ) )? ( (lv_metaData_5_0= 'auditable' ) )? otherlv_6= '{' ( (lv_fields_7_0= ruleField ) )* ( (lv_uniqueConstraints_8_0= ruleUniqueConstraint ) )* ( (lv_indexConstraints_9_0= ruleIndexConstraint ) )* (otherlv_10= 'key' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' )? otherlv_14= '}' )
            // InternalDomain.g:816:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( rulePossiblyQualifiedName ) ) )? ( (lv_metaData_5_0= 'auditable' ) )? otherlv_6= '{' ( (lv_fields_7_0= ruleField ) )* ( (lv_uniqueConstraints_8_0= ruleUniqueConstraint ) )* ( (lv_indexConstraints_9_0= ruleIndexConstraint ) )* (otherlv_10= 'key' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' )? otherlv_14= '}'
            {
            // InternalDomain.g:816:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDomain.g:817:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalDomain.g:817:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalDomain.g:818:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,24,FOLLOW_15); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getEntityAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", lv_isAbstract_0_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalDomain.g:834:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDomain.g:835:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDomain.g:835:4: (lv_name_2_0= RULE_ID )
            // InternalDomain.g:836:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:852:3: (otherlv_3= 'extends' ( ( rulePossiblyQualifiedName ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDomain.g:853:4: otherlv_3= 'extends' ( ( rulePossiblyQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
                    			
                    // InternalDomain.g:857:4: ( ( rulePossiblyQualifiedName ) )
                    // InternalDomain.g:858:5: ( rulePossiblyQualifiedName )
                    {
                    // InternalDomain.g:858:5: ( rulePossiblyQualifiedName )
                    // InternalDomain.g:859:6: rulePossiblyQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntityAccess().getSupertypeEntityCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    rulePossiblyQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomain.g:874:3: ( (lv_metaData_5_0= 'auditable' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDomain.g:875:4: (lv_metaData_5_0= 'auditable' )
                    {
                    // InternalDomain.g:875:4: (lv_metaData_5_0= 'auditable' )
                    // InternalDomain.g:876:5: lv_metaData_5_0= 'auditable'
                    {
                    lv_metaData_5_0=(Token)match(input,27,FOLLOW_5); 

                    					newLeafNode(lv_metaData_5_0, grammarAccess.getEntityAccess().getMetaDataAuditableKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityRule());
                    					}
                    					setWithLastConsumed(current, "metaData", lv_metaData_5_0 != null, "auditable");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalDomain.g:892:3: ( (lv_fields_7_0= ruleField ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==32||LA17_0==34||(LA17_0>=36 && LA17_0<=37)||LA17_0==43||(LA17_0>=46 && LA17_0<=52)||(LA17_0>=54 && LA17_0<=55)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDomain.g:893:4: (lv_fields_7_0= ruleField )
            	    {
            	    // InternalDomain.g:893:4: (lv_fields_7_0= ruleField )
            	    // InternalDomain.g:894:5: lv_fields_7_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_fields_7_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_7_0,
            	    						"io.yaktor.Domain.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalDomain.g:911:3: ( (lv_uniqueConstraints_8_0= ruleUniqueConstraint ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==22) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDomain.g:912:4: (lv_uniqueConstraints_8_0= ruleUniqueConstraint )
            	    {
            	    // InternalDomain.g:912:4: (lv_uniqueConstraints_8_0= ruleUniqueConstraint )
            	    // InternalDomain.g:913:5: lv_uniqueConstraints_8_0= ruleUniqueConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getUniqueConstraintsUniqueConstraintParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_uniqueConstraints_8_0=ruleUniqueConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"uniqueConstraints",
            	    						lv_uniqueConstraints_8_0,
            	    						"io.yaktor.Domain.UniqueConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalDomain.g:930:3: ( (lv_indexConstraints_9_0= ruleIndexConstraint ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDomain.g:931:4: (lv_indexConstraints_9_0= ruleIndexConstraint )
            	    {
            	    // InternalDomain.g:931:4: (lv_indexConstraints_9_0= ruleIndexConstraint )
            	    // InternalDomain.g:932:5: lv_indexConstraints_9_0= ruleIndexConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getIndexConstraintsIndexConstraintParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_indexConstraints_9_0=ruleIndexConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"indexConstraints",
            	    						lv_indexConstraints_9_0,
            	    						"io.yaktor.Domain.IndexConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalDomain.g:949:3: (otherlv_10= 'key' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDomain.g:950:4: otherlv_10= 'key' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) otherlv_13= ')'
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getKeyKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalDomain.g:958:4: ( (otherlv_12= RULE_ID ) )
                    // InternalDomain.g:959:5: (otherlv_12= RULE_ID )
                    {
                    // InternalDomain.g:959:5: (otherlv_12= RULE_ID )
                    // InternalDomain.g:960:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_12, grammarAccess.getEntityAccess().getKeysFieldCrossReference_9_2_0());
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getEntityAccess().getRightParenthesisKeyword_9_3());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleType"
    // InternalDomain.g:984:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDomain.g:984:45: (iv_ruleType= ruleType EOF )
            // InternalDomain.g:985:2: iv_ruleType= ruleType EOF
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
    // InternalDomain.g:991:1: ruleType returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( rulePossiblyQualifiedName ) ) )? otherlv_5= '{' ( (lv_fields_6_0= ruleField ) )* ( (lv_uniqueConstraints_7_0= ruleUniqueConstraint ) )* ( (lv_indexConstraints_8_0= ruleIndexConstraint ) )* (otherlv_9= 'key' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )? otherlv_13= '}' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_fields_6_0 = null;

        EObject lv_uniqueConstraints_7_0 = null;

        EObject lv_indexConstraints_8_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:997:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( rulePossiblyQualifiedName ) ) )? otherlv_5= '{' ( (lv_fields_6_0= ruleField ) )* ( (lv_uniqueConstraints_7_0= ruleUniqueConstraint ) )* ( (lv_indexConstraints_8_0= ruleIndexConstraint ) )* (otherlv_9= 'key' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )? otherlv_13= '}' ) )
            // InternalDomain.g:998:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( rulePossiblyQualifiedName ) ) )? otherlv_5= '{' ( (lv_fields_6_0= ruleField ) )* ( (lv_uniqueConstraints_7_0= ruleUniqueConstraint ) )* ( (lv_indexConstraints_8_0= ruleIndexConstraint ) )* (otherlv_9= 'key' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )? otherlv_13= '}' )
            {
            // InternalDomain.g:998:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( rulePossiblyQualifiedName ) ) )? otherlv_5= '{' ( (lv_fields_6_0= ruleField ) )* ( (lv_uniqueConstraints_7_0= ruleUniqueConstraint ) )* ( (lv_indexConstraints_8_0= ruleIndexConstraint ) )* (otherlv_9= 'key' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )? otherlv_13= '}' )
            // InternalDomain.g:999:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( rulePossiblyQualifiedName ) ) )? otherlv_5= '{' ( (lv_fields_6_0= ruleField ) )* ( (lv_uniqueConstraints_7_0= ruleUniqueConstraint ) )* ( (lv_indexConstraints_8_0= ruleIndexConstraint ) )* (otherlv_9= 'key' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )? otherlv_13= '}'
            {
            // InternalDomain.g:999:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDomain.g:1000:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalDomain.g:1000:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalDomain.g:1001:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,24,FOLLOW_23); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getTypeAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", lv_isAbstract_0_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getTypeKeyword_1());
            		
            // InternalDomain.g:1017:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDomain.g:1018:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDomain.g:1018:4: (lv_name_2_0= RULE_ID )
            // InternalDomain.g:1019:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:1035:3: (otherlv_3= 'extends' ( ( rulePossiblyQualifiedName ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDomain.g:1036:4: otherlv_3= 'extends' ( ( rulePossiblyQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getExtendsKeyword_3_0());
                    			
                    // InternalDomain.g:1040:4: ( ( rulePossiblyQualifiedName ) )
                    // InternalDomain.g:1041:5: ( rulePossiblyQualifiedName )
                    {
                    // InternalDomain.g:1041:5: ( rulePossiblyQualifiedName )
                    // InternalDomain.g:1042:6: rulePossiblyQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTypeAccess().getSupertypeTypeCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    rulePossiblyQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDomain.g:1061:3: ( (lv_fields_6_0= ruleField ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==32||LA23_0==34||(LA23_0>=36 && LA23_0<=37)||LA23_0==43||(LA23_0>=46 && LA23_0<=52)||(LA23_0>=54 && LA23_0<=55)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDomain.g:1062:4: (lv_fields_6_0= ruleField )
            	    {
            	    // InternalDomain.g:1062:4: (lv_fields_6_0= ruleField )
            	    // InternalDomain.g:1063:5: lv_fields_6_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_fields_6_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_6_0,
            	    						"io.yaktor.Domain.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalDomain.g:1080:3: ( (lv_uniqueConstraints_7_0= ruleUniqueConstraint ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDomain.g:1081:4: (lv_uniqueConstraints_7_0= ruleUniqueConstraint )
            	    {
            	    // InternalDomain.g:1081:4: (lv_uniqueConstraints_7_0= ruleUniqueConstraint )
            	    // InternalDomain.g:1082:5: lv_uniqueConstraints_7_0= ruleUniqueConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getTypeAccess().getUniqueConstraintsUniqueConstraintParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_uniqueConstraints_7_0=ruleUniqueConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"uniqueConstraints",
            	    						lv_uniqueConstraints_7_0,
            	    						"io.yaktor.Domain.UniqueConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalDomain.g:1099:3: ( (lv_indexConstraints_8_0= ruleIndexConstraint ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==23) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDomain.g:1100:4: (lv_indexConstraints_8_0= ruleIndexConstraint )
            	    {
            	    // InternalDomain.g:1100:4: (lv_indexConstraints_8_0= ruleIndexConstraint )
            	    // InternalDomain.g:1101:5: lv_indexConstraints_8_0= ruleIndexConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getTypeAccess().getIndexConstraintsIndexConstraintParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_indexConstraints_8_0=ruleIndexConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"indexConstraints",
            	    						lv_indexConstraints_8_0,
            	    						"io.yaktor.Domain.IndexConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalDomain.g:1118:3: (otherlv_9= 'key' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDomain.g:1119:4: otherlv_9= 'key' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')'
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getKeyKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalDomain.g:1127:4: ( (otherlv_11= RULE_ID ) )
                    // InternalDomain.g:1128:5: (otherlv_11= RULE_ID )
                    {
                    // InternalDomain.g:1128:5: (otherlv_11= RULE_ID )
                    // InternalDomain.g:1129:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_11, grammarAccess.getTypeAccess().getKeysFieldCrossReference_8_2_0());
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getTypeAccess().getRightParenthesisKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleEnumType"
    // InternalDomain.g:1153:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // InternalDomain.g:1153:49: (iv_ruleEnumType= ruleEnumType EOF )
            // InternalDomain.g:1154:2: iv_ruleEnumType= ruleEnumType EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumType=ruleEnumType();

            state._fsp--;

             current =iv_ruleEnumType; 
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
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // InternalDomain.g:1160:1: ruleEnumType returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumValue ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:1166:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumValue ) )+ otherlv_4= '}' ) )
            // InternalDomain.g:1167:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumValue ) )+ otherlv_4= '}' )
            {
            // InternalDomain.g:1167:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumValue ) )+ otherlv_4= '}' )
            // InternalDomain.g:1168:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumValue ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumTypeAccess().getEnumKeyword_0());
            		
            // InternalDomain.g:1172:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:1173:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:1173:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:1174:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDomain.g:1194:3: ( (lv_values_3_0= ruleEnumValue ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDomain.g:1195:4: (lv_values_3_0= ruleEnumValue )
            	    {
            	    // InternalDomain.g:1195:4: (lv_values_3_0= ruleEnumValue )
            	    // InternalDomain.g:1196:5: lv_values_3_0= ruleEnumValue
            	    {

            	    					newCompositeNode(grammarAccess.getEnumTypeAccess().getValuesEnumValueParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_values_3_0=ruleEnumValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_3_0,
            	    						"io.yaktor.Domain.EnumValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleEnumValue"
    // InternalDomain.g:1221:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalDomain.g:1221:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalDomain.g:1222:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
             newCompositeNode(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;

             current =iv_ruleEnumValue; 
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
    // InternalDomain.g:1228:1: ruleEnumValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDomain.g:1234:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalDomain.g:1235:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalDomain.g:1235:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalDomain.g:1236:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalDomain.g:1236:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDomain.g:1237:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDomain.g:1237:4: (lv_name_0_0= RULE_ID )
            // InternalDomain.g:1238:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumValueAccess().getEqualsSignKeyword_1());
            		
            // InternalDomain.g:1258:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalDomain.g:1259:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalDomain.g:1259:4: (lv_value_2_0= RULE_STRING )
            // InternalDomain.g:1260:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getEnumValueAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
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
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleIdField"
    // InternalDomain.g:1280:1: entryRuleIdField returns [EObject current=null] : iv_ruleIdField= ruleIdField EOF ;
    public final EObject entryRuleIdField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdField = null;


        try {
            // InternalDomain.g:1280:48: (iv_ruleIdField= ruleIdField EOF )
            // InternalDomain.g:1281:2: iv_ruleIdField= ruleIdField EOF
            {
             newCompositeNode(grammarAccess.getIdFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdField=ruleIdField();

            state._fsp--;

             current =iv_ruleIdField; 
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
    // $ANTLR end "entryRuleIdField"


    // $ANTLR start "ruleIdField"
    // InternalDomain.g:1287:1: ruleIdField returns [EObject current=null] : (otherlv_0= 'Id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleIdField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_unique_4_0=null;
        Token lv_indexed_5_0=null;
        Enumerator lv_cardinality_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:1293:2: ( (otherlv_0= 'Id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) )* ) ) ) ) )
            // InternalDomain.g:1294:2: (otherlv_0= 'Id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) )* ) ) ) )
            {
            // InternalDomain.g:1294:2: (otherlv_0= 'Id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) )* ) ) ) )
            // InternalDomain.g:1295:3: otherlv_0= 'Id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIdFieldAccess().getIdKeyword_0());
            		
            // InternalDomain.g:1299:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:1300:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:1300:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:1301:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIdFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:1317:3: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=98 && LA28_0<=101)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDomain.g:1318:4: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // InternalDomain.g:1318:4: (lv_cardinality_2_0= ruleCardinality )
                    // InternalDomain.g:1319:5: lv_cardinality_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getIdFieldAccess().getCardinalityCardinalityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIdFieldRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_2_0,
                    						"io.yaktor.Domain.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:1336:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) )* ) ) )
            // InternalDomain.g:1337:4: ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) )* ) )
            {
            // InternalDomain.g:1337:4: ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) )* ) )
            // InternalDomain.g:1338:5: ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIdFieldAccess().getUnorderedGroup_3());
            				
            // InternalDomain.g:1341:5: ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) )* )
            // InternalDomain.g:1342:6: ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) )*
            {
            // InternalDomain.g:1342:6: ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( LA29_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getIdFieldAccess().getUnorderedGroup_3(), 0) ) {
                    alt29=1;
                }
                else if ( LA29_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getIdFieldAccess().getUnorderedGroup_3(), 1) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDomain.g:1343:4: ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) )
            	    {
            	    // InternalDomain.g:1343:4: ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) )
            	    // InternalDomain.g:1344:5: {...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIdFieldAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIdField", "getUnorderedGroupHelper().canSelect(grammarAccess.getIdFieldAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDomain.g:1344:104: ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) )
            	    // InternalDomain.g:1345:6: ({...}? => ( (lv_unique_4_0= 'unique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIdFieldAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDomain.g:1348:9: ({...}? => ( (lv_unique_4_0= 'unique' ) ) )
            	    // InternalDomain.g:1348:10: {...}? => ( (lv_unique_4_0= 'unique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIdField", "true");
            	    }
            	    // InternalDomain.g:1348:19: ( (lv_unique_4_0= 'unique' ) )
            	    // InternalDomain.g:1348:20: (lv_unique_4_0= 'unique' )
            	    {
            	    // InternalDomain.g:1348:20: (lv_unique_4_0= 'unique' )
            	    // InternalDomain.g:1349:10: lv_unique_4_0= 'unique'
            	    {
            	    lv_unique_4_0=(Token)match(input,21,FOLLOW_29); 

            	    										newLeafNode(lv_unique_4_0, grammarAccess.getIdFieldAccess().getUniqueUniqueKeyword_3_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getIdFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "unique", lv_unique_4_0 != null, "unique");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIdFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomain.g:1366:4: ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) )
            	    {
            	    // InternalDomain.g:1366:4: ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) )
            	    // InternalDomain.g:1367:5: {...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIdFieldAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIdField", "getUnorderedGroupHelper().canSelect(grammarAccess.getIdFieldAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDomain.g:1367:104: ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) )
            	    // InternalDomain.g:1368:6: ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIdFieldAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDomain.g:1371:9: ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) )
            	    // InternalDomain.g:1371:10: {...}? => ( (lv_indexed_5_0= 'indexed' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIdField", "true");
            	    }
            	    // InternalDomain.g:1371:19: ( (lv_indexed_5_0= 'indexed' ) )
            	    // InternalDomain.g:1371:20: (lv_indexed_5_0= 'indexed' )
            	    {
            	    // InternalDomain.g:1371:20: (lv_indexed_5_0= 'indexed' )
            	    // InternalDomain.g:1372:10: lv_indexed_5_0= 'indexed'
            	    {
            	    lv_indexed_5_0=(Token)match(input,35,FOLLOW_29); 

            	    										newLeafNode(lv_indexed_5_0, grammarAccess.getIdFieldAccess().getIndexedIndexedKeyword_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getIdFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "indexed", lv_indexed_5_0 != null, "indexed");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIdFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getIdFieldAccess().getUnorderedGroup_3());
            				

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
    // $ANTLR end "ruleIdField"


    // $ANTLR start "entryRuleShortIdField"
    // InternalDomain.g:1400:1: entryRuleShortIdField returns [EObject current=null] : iv_ruleShortIdField= ruleShortIdField EOF ;
    public final EObject entryRuleShortIdField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShortIdField = null;


        try {
            // InternalDomain.g:1400:53: (iv_ruleShortIdField= ruleShortIdField EOF )
            // InternalDomain.g:1401:2: iv_ruleShortIdField= ruleShortIdField EOF
            {
             newCompositeNode(grammarAccess.getShortIdFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShortIdField=ruleShortIdField();

            state._fsp--;

             current =iv_ruleShortIdField; 
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
    // $ANTLR end "entryRuleShortIdField"


    // $ANTLR start "ruleShortIdField"
    // InternalDomain.g:1407:1: ruleShortIdField returns [EObject current=null] : (otherlv_0= 'ShortId' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleShortIdField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_pattern_4_0=null;
        Token lv_maxValue_5_0=null;
        Token lv_unique_6_0=null;
        Token lv_indexed_7_0=null;
        Enumerator lv_cardinality_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:1413:2: ( (otherlv_0= 'ShortId' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) )* ) ) ) ) )
            // InternalDomain.g:1414:2: (otherlv_0= 'ShortId' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) )* ) ) ) )
            {
            // InternalDomain.g:1414:2: (otherlv_0= 'ShortId' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) )* ) ) ) )
            // InternalDomain.g:1415:3: otherlv_0= 'ShortId' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getShortIdFieldAccess().getShortIdKeyword_0());
            		
            // InternalDomain.g:1419:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:1420:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:1420:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:1421:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_1_0, grammarAccess.getShortIdFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShortIdFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:1437:3: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=98 && LA30_0<=101)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDomain.g:1438:4: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // InternalDomain.g:1438:4: (lv_cardinality_2_0= ruleCardinality )
                    // InternalDomain.g:1439:5: lv_cardinality_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getShortIdFieldAccess().getCardinalityCardinalityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_31);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShortIdFieldRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_2_0,
                    						"io.yaktor.Domain.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:1456:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) )* ) ) )
            // InternalDomain.g:1457:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) )* ) )
            {
            // InternalDomain.g:1457:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) )* ) )
            // InternalDomain.g:1458:5: ( ( ({...}? => ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3());
            				
            // InternalDomain.g:1461:5: ( ( ({...}? => ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) )* )
            // InternalDomain.g:1462:6: ( ({...}? => ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) )*
            {
            // InternalDomain.g:1462:6: ( ({...}? => ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) )*
            loop32:
            do {
                int alt32=4;
                int LA32_0 = input.LA(1);

                if ( LA32_0 == RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3(), 0) ) {
                    alt32=1;
                }
                else if ( LA32_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3(), 1) ) {
                    alt32=2;
                }
                else if ( LA32_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3(), 2) ) {
                    alt32=3;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDomain.g:1463:4: ({...}? => ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) ) )
            	    {
            	    // InternalDomain.g:1463:4: ({...}? => ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) ) )
            	    // InternalDomain.g:1464:5: {...}? => ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleShortIdField", "getUnorderedGroupHelper().canSelect(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDomain.g:1464:109: ( ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) ) )
            	    // InternalDomain.g:1465:6: ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDomain.g:1468:9: ({...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? ) )
            	    // InternalDomain.g:1468:10: {...}? => ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleShortIdField", "true");
            	    }
            	    // InternalDomain.g:1468:19: ( ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )? )
            	    // InternalDomain.g:1468:20: ( (lv_pattern_4_0= RULE_STRING ) ) ( (lv_maxValue_5_0= RULE_INT ) )?
            	    {
            	    // InternalDomain.g:1468:20: ( (lv_pattern_4_0= RULE_STRING ) )
            	    // InternalDomain.g:1469:10: (lv_pattern_4_0= RULE_STRING )
            	    {
            	    // InternalDomain.g:1469:10: (lv_pattern_4_0= RULE_STRING )
            	    // InternalDomain.g:1470:11: lv_pattern_4_0= RULE_STRING
            	    {
            	    lv_pattern_4_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            	    											newLeafNode(lv_pattern_4_0, grammarAccess.getShortIdFieldAccess().getPatternSTRINGTerminalRuleCall_3_0_0_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getShortIdFieldRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"pattern",
            	    												lv_pattern_4_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalDomain.g:1486:9: ( (lv_maxValue_5_0= RULE_INT ) )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==RULE_INT) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalDomain.g:1487:10: (lv_maxValue_5_0= RULE_INT )
            	            {
            	            // InternalDomain.g:1487:10: (lv_maxValue_5_0= RULE_INT )
            	            // InternalDomain.g:1488:11: lv_maxValue_5_0= RULE_INT
            	            {
            	            lv_maxValue_5_0=(Token)match(input,RULE_INT,FOLLOW_31); 

            	            											newLeafNode(lv_maxValue_5_0, grammarAccess.getShortIdFieldAccess().getMaxValueINTTerminalRuleCall_3_0_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getShortIdFieldRule());
            	            											}
            	            											setWithLastConsumed(
            	            												current,
            	            												"maxValue",
            	            												lv_maxValue_5_0,
            	            												"org.eclipse.xtext.common.Terminals.INT");
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomain.g:1510:4: ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) )
            	    {
            	    // InternalDomain.g:1510:4: ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) )
            	    // InternalDomain.g:1511:5: {...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleShortIdField", "getUnorderedGroupHelper().canSelect(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDomain.g:1511:109: ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) )
            	    // InternalDomain.g:1512:6: ({...}? => ( (lv_unique_6_0= 'unique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDomain.g:1515:9: ({...}? => ( (lv_unique_6_0= 'unique' ) ) )
            	    // InternalDomain.g:1515:10: {...}? => ( (lv_unique_6_0= 'unique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleShortIdField", "true");
            	    }
            	    // InternalDomain.g:1515:19: ( (lv_unique_6_0= 'unique' ) )
            	    // InternalDomain.g:1515:20: (lv_unique_6_0= 'unique' )
            	    {
            	    // InternalDomain.g:1515:20: (lv_unique_6_0= 'unique' )
            	    // InternalDomain.g:1516:10: lv_unique_6_0= 'unique'
            	    {
            	    lv_unique_6_0=(Token)match(input,21,FOLLOW_31); 

            	    										newLeafNode(lv_unique_6_0, grammarAccess.getShortIdFieldAccess().getUniqueUniqueKeyword_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getShortIdFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "unique", lv_unique_6_0 != null, "unique");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDomain.g:1533:4: ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) )
            	    {
            	    // InternalDomain.g:1533:4: ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) )
            	    // InternalDomain.g:1534:5: {...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleShortIdField", "getUnorderedGroupHelper().canSelect(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDomain.g:1534:109: ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) )
            	    // InternalDomain.g:1535:6: ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDomain.g:1538:9: ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) )
            	    // InternalDomain.g:1538:10: {...}? => ( (lv_indexed_7_0= 'indexed' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleShortIdField", "true");
            	    }
            	    // InternalDomain.g:1538:19: ( (lv_indexed_7_0= 'indexed' ) )
            	    // InternalDomain.g:1538:20: (lv_indexed_7_0= 'indexed' )
            	    {
            	    // InternalDomain.g:1538:20: (lv_indexed_7_0= 'indexed' )
            	    // InternalDomain.g:1539:10: lv_indexed_7_0= 'indexed'
            	    {
            	    lv_indexed_7_0=(Token)match(input,35,FOLLOW_31); 

            	    										newLeafNode(lv_indexed_7_0, grammarAccess.getShortIdFieldAccess().getIndexedIndexedKeyword_3_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getShortIdFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "indexed", lv_indexed_7_0 != null, "indexed");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getShortIdFieldAccess().getUnorderedGroup_3());
            				

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
    // $ANTLR end "ruleShortIdField"


    // $ANTLR start "entryRuleStringField"
    // InternalDomain.g:1567:1: entryRuleStringField returns [EObject current=null] : iv_ruleStringField= ruleStringField EOF ;
    public final EObject entryRuleStringField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringField = null;


        try {
            // InternalDomain.g:1567:52: (iv_ruleStringField= ruleStringField EOF )
            // InternalDomain.g:1568:2: iv_ruleStringField= ruleStringField EOF
            {
             newCompositeNode(grammarAccess.getStringFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringField=ruleStringField();

            state._fsp--;

             current =iv_ruleStringField; 
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
    // $ANTLR end "entryRuleStringField"


    // $ANTLR start "ruleStringField"
    // InternalDomain.g:1574:1: ruleStringField returns [EObject current=null] : (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleStringField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token lv_defaultValue_5_0=null;
        Token otherlv_6=null;
        Token lv_pattern_7_0=null;
        Token lv_unique_8_0=null;
        Token lv_indexed_9_0=null;
        Token lv_obscured_10_0=null;
        Token otherlv_11=null;
        Token lv_minLength_12_0=null;
        Token otherlv_13=null;
        Token lv_maxLength_14_0=null;
        Token otherlv_15=null;
        Enumerator lv_cardinality_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:1580:2: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) ) ) )* ) ) ) ) )
            // InternalDomain.g:1581:2: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) ) ) )* ) ) ) )
            {
            // InternalDomain.g:1581:2: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) ) ) )* ) ) ) )
            // InternalDomain.g:1582:3: otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStringFieldAccess().getStringKeyword_0());
            		
            // InternalDomain.g:1586:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:1587:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:1587:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:1588:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStringFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:1604:3: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=98 && LA33_0<=101)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDomain.g:1605:4: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // InternalDomain.g:1605:4: (lv_cardinality_2_0= ruleCardinality )
                    // InternalDomain.g:1606:5: lv_cardinality_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getStringFieldAccess().getCardinalityCardinalityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_34);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStringFieldRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_2_0,
                    						"io.yaktor.Domain.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:1623:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) ) ) )* ) ) )
            // InternalDomain.g:1624:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) ) ) )* ) )
            {
            // InternalDomain.g:1624:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) ) ) )* ) )
            // InternalDomain.g:1625:5: ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getStringFieldAccess().getUnorderedGroup_3());
            				
            // InternalDomain.g:1628:5: ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) ) ) )* )
            // InternalDomain.g:1629:6: ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) ) ) )*
            {
            // InternalDomain.g:1629:6: ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) ) ) )*
            loop36:
            do {
                int alt36=7;
                int LA36_0 = input.LA(1);

                if ( LA36_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 0) ) {
                    alt36=1;
                }
                else if ( LA36_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 1) ) {
                    alt36=2;
                }
                else if ( LA36_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 2) ) {
                    alt36=3;
                }
                else if ( LA36_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 3) ) {
                    alt36=4;
                }
                else if ( LA36_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 4) ) {
                    alt36=5;
                }
                else if ( LA36_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 5) ) {
                    alt36=6;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDomain.g:1630:4: ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:1630:4: ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalDomain.g:1631:5: {...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStringField", "getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDomain.g:1631:108: ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) ) )
            	    // InternalDomain.g:1632:6: ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDomain.g:1635:9: ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) ) )
            	    // InternalDomain.g:1635:10: {...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStringField", "true");
            	    }
            	    // InternalDomain.g:1635:19: (otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) ) )
            	    // InternalDomain.g:1635:20: otherlv_4= '=' ( (lv_defaultValue_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_27); 

            	    									newLeafNode(otherlv_4, grammarAccess.getStringFieldAccess().getEqualsSignKeyword_3_0_0());
            	    								
            	    // InternalDomain.g:1639:9: ( (lv_defaultValue_5_0= RULE_STRING ) )
            	    // InternalDomain.g:1640:10: (lv_defaultValue_5_0= RULE_STRING )
            	    {
            	    // InternalDomain.g:1640:10: (lv_defaultValue_5_0= RULE_STRING )
            	    // InternalDomain.g:1641:11: lv_defaultValue_5_0= RULE_STRING
            	    {
            	    lv_defaultValue_5_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    											newLeafNode(lv_defaultValue_5_0, grammarAccess.getStringFieldAccess().getDefaultValueSTRINGTerminalRuleCall_3_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getStringFieldRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"defaultValue",
            	    												lv_defaultValue_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStringFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomain.g:1663:4: ({...}? => ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:1663:4: ({...}? => ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalDomain.g:1664:5: {...}? => ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStringField", "getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDomain.g:1664:108: ( ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) ) )
            	    // InternalDomain.g:1665:6: ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDomain.g:1668:9: ({...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) ) )
            	    // InternalDomain.g:1668:10: {...}? => (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStringField", "true");
            	    }
            	    // InternalDomain.g:1668:19: (otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) ) )
            	    // InternalDomain.g:1668:20: otherlv_6= 'pattern' ( (lv_pattern_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,38,FOLLOW_27); 

            	    									newLeafNode(otherlv_6, grammarAccess.getStringFieldAccess().getPatternKeyword_3_1_0());
            	    								
            	    // InternalDomain.g:1672:9: ( (lv_pattern_7_0= RULE_STRING ) )
            	    // InternalDomain.g:1673:10: (lv_pattern_7_0= RULE_STRING )
            	    {
            	    // InternalDomain.g:1673:10: (lv_pattern_7_0= RULE_STRING )
            	    // InternalDomain.g:1674:11: lv_pattern_7_0= RULE_STRING
            	    {
            	    lv_pattern_7_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    											newLeafNode(lv_pattern_7_0, grammarAccess.getStringFieldAccess().getPatternSTRINGTerminalRuleCall_3_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getStringFieldRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"pattern",
            	    												lv_pattern_7_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStringFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDomain.g:1696:4: ({...}? => ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) ) )
            	    {
            	    // InternalDomain.g:1696:4: ({...}? => ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) ) )
            	    // InternalDomain.g:1697:5: {...}? => ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleStringField", "getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDomain.g:1697:108: ( ({...}? => ( (lv_unique_8_0= 'unique' ) ) ) )
            	    // InternalDomain.g:1698:6: ({...}? => ( (lv_unique_8_0= 'unique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDomain.g:1701:9: ({...}? => ( (lv_unique_8_0= 'unique' ) ) )
            	    // InternalDomain.g:1701:10: {...}? => ( (lv_unique_8_0= 'unique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStringField", "true");
            	    }
            	    // InternalDomain.g:1701:19: ( (lv_unique_8_0= 'unique' ) )
            	    // InternalDomain.g:1701:20: (lv_unique_8_0= 'unique' )
            	    {
            	    // InternalDomain.g:1701:20: (lv_unique_8_0= 'unique' )
            	    // InternalDomain.g:1702:10: lv_unique_8_0= 'unique'
            	    {
            	    lv_unique_8_0=(Token)match(input,21,FOLLOW_34); 

            	    										newLeafNode(lv_unique_8_0, grammarAccess.getStringFieldAccess().getUniqueUniqueKeyword_3_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getStringFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "unique", lv_unique_8_0 != null, "unique");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStringFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDomain.g:1719:4: ({...}? => ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) ) )
            	    {
            	    // InternalDomain.g:1719:4: ({...}? => ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) ) )
            	    // InternalDomain.g:1720:5: {...}? => ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleStringField", "getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDomain.g:1720:108: ( ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) ) )
            	    // InternalDomain.g:1721:6: ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDomain.g:1724:9: ({...}? => ( (lv_indexed_9_0= 'indexed' ) ) )
            	    // InternalDomain.g:1724:10: {...}? => ( (lv_indexed_9_0= 'indexed' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStringField", "true");
            	    }
            	    // InternalDomain.g:1724:19: ( (lv_indexed_9_0= 'indexed' ) )
            	    // InternalDomain.g:1724:20: (lv_indexed_9_0= 'indexed' )
            	    {
            	    // InternalDomain.g:1724:20: (lv_indexed_9_0= 'indexed' )
            	    // InternalDomain.g:1725:10: lv_indexed_9_0= 'indexed'
            	    {
            	    lv_indexed_9_0=(Token)match(input,35,FOLLOW_34); 

            	    										newLeafNode(lv_indexed_9_0, grammarAccess.getStringFieldAccess().getIndexedIndexedKeyword_3_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getStringFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "indexed", lv_indexed_9_0 != null, "indexed");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStringFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDomain.g:1742:4: ({...}? => ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) ) )
            	    {
            	    // InternalDomain.g:1742:4: ({...}? => ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) ) )
            	    // InternalDomain.g:1743:5: {...}? => ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleStringField", "getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalDomain.g:1743:108: ( ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) ) )
            	    // InternalDomain.g:1744:6: ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalDomain.g:1747:9: ({...}? => ( (lv_obscured_10_0= 'obscured' ) ) )
            	    // InternalDomain.g:1747:10: {...}? => ( (lv_obscured_10_0= 'obscured' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStringField", "true");
            	    }
            	    // InternalDomain.g:1747:19: ( (lv_obscured_10_0= 'obscured' ) )
            	    // InternalDomain.g:1747:20: (lv_obscured_10_0= 'obscured' )
            	    {
            	    // InternalDomain.g:1747:20: (lv_obscured_10_0= 'obscured' )
            	    // InternalDomain.g:1748:10: lv_obscured_10_0= 'obscured'
            	    {
            	    lv_obscured_10_0=(Token)match(input,39,FOLLOW_34); 

            	    										newLeafNode(lv_obscured_10_0, grammarAccess.getStringFieldAccess().getObscuredObscuredKeyword_3_4_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getStringFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "obscured", lv_obscured_10_0 != null, "obscured");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStringFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalDomain.g:1765:4: ({...}? => ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) ) )
            	    {
            	    // InternalDomain.g:1765:4: ({...}? => ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) ) )
            	    // InternalDomain.g:1766:5: {...}? => ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleStringField", "getUnorderedGroupHelper().canSelect(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalDomain.g:1766:108: ( ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) ) )
            	    // InternalDomain.g:1767:6: ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStringFieldAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalDomain.g:1770:9: ({...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' ) )
            	    // InternalDomain.g:1770:10: {...}? => (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStringField", "true");
            	    }
            	    // InternalDomain.g:1770:19: (otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']' )
            	    // InternalDomain.g:1770:20: otherlv_11= '[' ( (lv_minLength_12_0= RULE_INT ) )? otherlv_13= '..' ( (lv_maxLength_14_0= RULE_INT ) )? otherlv_15= ']'
            	    {
            	    otherlv_11=(Token)match(input,40,FOLLOW_35); 

            	    									newLeafNode(otherlv_11, grammarAccess.getStringFieldAccess().getLeftSquareBracketKeyword_3_5_0());
            	    								
            	    // InternalDomain.g:1774:9: ( (lv_minLength_12_0= RULE_INT ) )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==RULE_INT) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalDomain.g:1775:10: (lv_minLength_12_0= RULE_INT )
            	            {
            	            // InternalDomain.g:1775:10: (lv_minLength_12_0= RULE_INT )
            	            // InternalDomain.g:1776:11: lv_minLength_12_0= RULE_INT
            	            {
            	            lv_minLength_12_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            	            											newLeafNode(lv_minLength_12_0, grammarAccess.getStringFieldAccess().getMinLengthINTTerminalRuleCall_3_5_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getStringFieldRule());
            	            											}
            	            											setWithLastConsumed(
            	            												current,
            	            												"minLength",
            	            												lv_minLength_12_0,
            	            												"org.eclipse.xtext.common.Terminals.INT");
            	            										

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_13=(Token)match(input,41,FOLLOW_37); 

            	    									newLeafNode(otherlv_13, grammarAccess.getStringFieldAccess().getFullStopFullStopKeyword_3_5_2());
            	    								
            	    // InternalDomain.g:1796:9: ( (lv_maxLength_14_0= RULE_INT ) )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==RULE_INT) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalDomain.g:1797:10: (lv_maxLength_14_0= RULE_INT )
            	            {
            	            // InternalDomain.g:1797:10: (lv_maxLength_14_0= RULE_INT )
            	            // InternalDomain.g:1798:11: lv_maxLength_14_0= RULE_INT
            	            {
            	            lv_maxLength_14_0=(Token)match(input,RULE_INT,FOLLOW_38); 

            	            											newLeafNode(lv_maxLength_14_0, grammarAccess.getStringFieldAccess().getMaxLengthINTTerminalRuleCall_3_5_3_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getStringFieldRule());
            	            											}
            	            											setWithLastConsumed(
            	            												current,
            	            												"maxLength",
            	            												lv_maxLength_14_0,
            	            												"org.eclipse.xtext.common.Terminals.INT");
            	            										

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_15=(Token)match(input,42,FOLLOW_34); 

            	    									newLeafNode(otherlv_15, grammarAccess.getStringFieldAccess().getRightSquareBracketKeyword_3_5_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStringFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getStringFieldAccess().getUnorderedGroup_3());
            				

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
    // $ANTLR end "ruleStringField"


    // $ANTLR start "entryRuleDateField"
    // InternalDomain.g:1835:1: entryRuleDateField returns [EObject current=null] : iv_ruleDateField= ruleDateField EOF ;
    public final EObject entryRuleDateField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateField = null;


        try {
            // InternalDomain.g:1835:50: (iv_ruleDateField= ruleDateField EOF )
            // InternalDomain.g:1836:2: iv_ruleDateField= ruleDateField EOF
            {
             newCompositeNode(grammarAccess.getDateFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateField=ruleDateField();

            state._fsp--;

             current =iv_ruleDateField; 
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
    // $ANTLR end "entryRuleDateField"


    // $ANTLR start "ruleDateField"
    // InternalDomain.g:1842:1: ruleDateField returns [EObject current=null] : (otherlv_0= 'Date' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ( (lv_cardinality_4_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleDateField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_defaultValue_3_0=null;
        Token otherlv_6=null;
        Token lv_before_7_0=null;
        Token otherlv_8=null;
        Token lv_after_9_0=null;
        Token otherlv_10=null;
        Token lv_unique_11_0=null;
        Token lv_indexed_12_0=null;
        Token lv_past_13_0=null;
        Token lv_future_14_0=null;
        Enumerator lv_cardinality_4_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:1848:2: ( (otherlv_0= 'Date' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ( (lv_cardinality_4_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) ) ) )* ) ) ) ) )
            // InternalDomain.g:1849:2: (otherlv_0= 'Date' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ( (lv_cardinality_4_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalDomain.g:1849:2: (otherlv_0= 'Date' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ( (lv_cardinality_4_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) ) ) )* ) ) ) )
            // InternalDomain.g:1850:3: otherlv_0= 'Date' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ( (lv_cardinality_4_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDateFieldAccess().getDateKeyword_0());
            		
            // InternalDomain.g:1854:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:1855:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:1855:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:1856:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDateFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:1872:3: (otherlv_2= '=' ( (lv_defaultValue_3_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDomain.g:1873:4: otherlv_2= '=' ( (lv_defaultValue_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getDateFieldAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalDomain.g:1877:4: ( (lv_defaultValue_3_0= RULE_STRING ) )
                    // InternalDomain.g:1878:5: (lv_defaultValue_3_0= RULE_STRING )
                    {
                    // InternalDomain.g:1878:5: (lv_defaultValue_3_0= RULE_STRING )
                    // InternalDomain.g:1879:6: lv_defaultValue_3_0= RULE_STRING
                    {
                    lv_defaultValue_3_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						newLeafNode(lv_defaultValue_3_0, grammarAccess.getDateFieldAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDateFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomain.g:1896:3: ( (lv_cardinality_4_0= ruleCardinality ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=98 && LA38_0<=101)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDomain.g:1897:4: (lv_cardinality_4_0= ruleCardinality )
                    {
                    // InternalDomain.g:1897:4: (lv_cardinality_4_0= ruleCardinality )
                    // InternalDomain.g:1898:5: lv_cardinality_4_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getDateFieldAccess().getCardinalityCardinalityEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_41);
                    lv_cardinality_4_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDateFieldRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_4_0,
                    						"io.yaktor.Domain.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:1915:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) ) ) )* ) ) )
            // InternalDomain.g:1916:4: ( ( ( ({...}? => ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) ) ) )* ) )
            {
            // InternalDomain.g:1916:4: ( ( ( ({...}? => ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) ) ) )* ) )
            // InternalDomain.g:1917:5: ( ( ({...}? => ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDateFieldAccess().getUnorderedGroup_4());
            				
            // InternalDomain.g:1920:5: ( ( ({...}? => ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) ) ) )* )
            // InternalDomain.g:1921:6: ( ({...}? => ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) ) ) )*
            {
            // InternalDomain.g:1921:6: ( ({...}? => ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) ) ) )*
            loop42:
            do {
                int alt42=5;
                int LA42_0 = input.LA(1);

                if ( LA42_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 0) ) {
                    alt42=1;
                }
                else if ( LA42_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 1) ) {
                    alt42=2;
                }
                else if ( LA42_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 2) ) {
                    alt42=3;
                }
                else if ( LA42_0 >= 44 && LA42_0 <= 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 3) ) {
                    alt42=4;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDomain.g:1922:4: ({...}? => ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) ) )
            	    {
            	    // InternalDomain.g:1922:4: ({...}? => ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) ) )
            	    // InternalDomain.g:1923:5: {...}? => ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDateField", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalDomain.g:1923:106: ( ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) ) )
            	    // InternalDomain.g:1924:6: ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalDomain.g:1927:9: ({...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' ) )
            	    // InternalDomain.g:1927:10: {...}? => (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDateField", "true");
            	    }
            	    // InternalDomain.g:1927:19: (otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']' )
            	    // InternalDomain.g:1927:20: otherlv_6= '[' ( (lv_before_7_0= RULE_STRING ) )? otherlv_8= '..' ( (lv_after_9_0= RULE_STRING ) )? otherlv_10= ']'
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_42); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDateFieldAccess().getLeftSquareBracketKeyword_4_0_0());
            	    								
            	    // InternalDomain.g:1931:9: ( (lv_before_7_0= RULE_STRING ) )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==RULE_STRING) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalDomain.g:1932:10: (lv_before_7_0= RULE_STRING )
            	            {
            	            // InternalDomain.g:1932:10: (lv_before_7_0= RULE_STRING )
            	            // InternalDomain.g:1933:11: lv_before_7_0= RULE_STRING
            	            {
            	            lv_before_7_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            	            											newLeafNode(lv_before_7_0, grammarAccess.getDateFieldAccess().getBeforeSTRINGTerminalRuleCall_4_0_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getDateFieldRule());
            	            											}
            	            											setWithLastConsumed(
            	            												current,
            	            												"before",
            	            												lv_before_7_0,
            	            												"org.eclipse.xtext.common.Terminals.STRING");
            	            										

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_8=(Token)match(input,41,FOLLOW_43); 

            	    									newLeafNode(otherlv_8, grammarAccess.getDateFieldAccess().getFullStopFullStopKeyword_4_0_2());
            	    								
            	    // InternalDomain.g:1953:9: ( (lv_after_9_0= RULE_STRING ) )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==RULE_STRING) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalDomain.g:1954:10: (lv_after_9_0= RULE_STRING )
            	            {
            	            // InternalDomain.g:1954:10: (lv_after_9_0= RULE_STRING )
            	            // InternalDomain.g:1955:11: lv_after_9_0= RULE_STRING
            	            {
            	            lv_after_9_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            	            											newLeafNode(lv_after_9_0, grammarAccess.getDateFieldAccess().getAfterSTRINGTerminalRuleCall_4_0_3_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getDateFieldRule());
            	            											}
            	            											setWithLastConsumed(
            	            												current,
            	            												"after",
            	            												lv_after_9_0,
            	            												"org.eclipse.xtext.common.Terminals.STRING");
            	            										

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,42,FOLLOW_41); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDateFieldAccess().getRightSquareBracketKeyword_4_0_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateFieldAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomain.g:1981:4: ({...}? => ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) ) )
            	    {
            	    // InternalDomain.g:1981:4: ({...}? => ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) ) )
            	    // InternalDomain.g:1982:5: {...}? => ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDateField", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalDomain.g:1982:106: ( ({...}? => ( (lv_unique_11_0= 'unique' ) ) ) )
            	    // InternalDomain.g:1983:6: ({...}? => ( (lv_unique_11_0= 'unique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalDomain.g:1986:9: ({...}? => ( (lv_unique_11_0= 'unique' ) ) )
            	    // InternalDomain.g:1986:10: {...}? => ( (lv_unique_11_0= 'unique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDateField", "true");
            	    }
            	    // InternalDomain.g:1986:19: ( (lv_unique_11_0= 'unique' ) )
            	    // InternalDomain.g:1986:20: (lv_unique_11_0= 'unique' )
            	    {
            	    // InternalDomain.g:1986:20: (lv_unique_11_0= 'unique' )
            	    // InternalDomain.g:1987:10: lv_unique_11_0= 'unique'
            	    {
            	    lv_unique_11_0=(Token)match(input,21,FOLLOW_41); 

            	    										newLeafNode(lv_unique_11_0, grammarAccess.getDateFieldAccess().getUniqueUniqueKeyword_4_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDateFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "unique", lv_unique_11_0 != null, "unique");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateFieldAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDomain.g:2004:4: ({...}? => ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) ) )
            	    {
            	    // InternalDomain.g:2004:4: ({...}? => ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) ) )
            	    // InternalDomain.g:2005:5: {...}? => ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDateField", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalDomain.g:2005:106: ( ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) ) )
            	    // InternalDomain.g:2006:6: ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalDomain.g:2009:9: ({...}? => ( (lv_indexed_12_0= 'indexed' ) ) )
            	    // InternalDomain.g:2009:10: {...}? => ( (lv_indexed_12_0= 'indexed' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDateField", "true");
            	    }
            	    // InternalDomain.g:2009:19: ( (lv_indexed_12_0= 'indexed' ) )
            	    // InternalDomain.g:2009:20: (lv_indexed_12_0= 'indexed' )
            	    {
            	    // InternalDomain.g:2009:20: (lv_indexed_12_0= 'indexed' )
            	    // InternalDomain.g:2010:10: lv_indexed_12_0= 'indexed'
            	    {
            	    lv_indexed_12_0=(Token)match(input,35,FOLLOW_41); 

            	    										newLeafNode(lv_indexed_12_0, grammarAccess.getDateFieldAccess().getIndexedIndexedKeyword_4_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDateFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "indexed", lv_indexed_12_0 != null, "indexed");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateFieldAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDomain.g:2027:4: ({...}? => ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:2027:4: ({...}? => ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) ) )
            	    // InternalDomain.g:2028:5: {...}? => ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDateField", "getUnorderedGroupHelper().canSelect(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalDomain.g:2028:106: ( ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) ) )
            	    // InternalDomain.g:2029:6: ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDateFieldAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalDomain.g:2032:9: ({...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) ) )
            	    // InternalDomain.g:2032:10: {...}? => ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDateField", "true");
            	    }
            	    // InternalDomain.g:2032:19: ( ( (lv_past_13_0= 'past' ) ) | ( (lv_future_14_0= 'future' ) ) )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==44) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==45) ) {
            	        alt41=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalDomain.g:2032:20: ( (lv_past_13_0= 'past' ) )
            	            {
            	            // InternalDomain.g:2032:20: ( (lv_past_13_0= 'past' ) )
            	            // InternalDomain.g:2033:10: (lv_past_13_0= 'past' )
            	            {
            	            // InternalDomain.g:2033:10: (lv_past_13_0= 'past' )
            	            // InternalDomain.g:2034:11: lv_past_13_0= 'past'
            	            {
            	            lv_past_13_0=(Token)match(input,44,FOLLOW_41); 

            	            											newLeafNode(lv_past_13_0, grammarAccess.getDateFieldAccess().getPastPastKeyword_4_3_0_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getDateFieldRule());
            	            											}
            	            											setWithLastConsumed(current, "past", lv_past_13_0 != null, "past");
            	            										

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDomain.g:2047:9: ( (lv_future_14_0= 'future' ) )
            	            {
            	            // InternalDomain.g:2047:9: ( (lv_future_14_0= 'future' ) )
            	            // InternalDomain.g:2048:10: (lv_future_14_0= 'future' )
            	            {
            	            // InternalDomain.g:2048:10: (lv_future_14_0= 'future' )
            	            // InternalDomain.g:2049:11: lv_future_14_0= 'future'
            	            {
            	            lv_future_14_0=(Token)match(input,45,FOLLOW_41); 

            	            											newLeafNode(lv_future_14_0, grammarAccess.getDateFieldAccess().getFutureFutureKeyword_4_3_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getDateFieldRule());
            	            											}
            	            											setWithLastConsumed(current, "future", lv_future_14_0 != null, "future");
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDateFieldAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDateFieldAccess().getUnorderedGroup_4());
            				

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
    // $ANTLR end "ruleDateField"


    // $ANTLR start "entryRuleGeoLocationField"
    // InternalDomain.g:2078:1: entryRuleGeoLocationField returns [EObject current=null] : iv_ruleGeoLocationField= ruleGeoLocationField EOF ;
    public final EObject entryRuleGeoLocationField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeoLocationField = null;


        try {
            // InternalDomain.g:2078:57: (iv_ruleGeoLocationField= ruleGeoLocationField EOF )
            // InternalDomain.g:2079:2: iv_ruleGeoLocationField= ruleGeoLocationField EOF
            {
             newCompositeNode(grammarAccess.getGeoLocationFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeoLocationField=ruleGeoLocationField();

            state._fsp--;

             current =iv_ruleGeoLocationField; 
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
    // $ANTLR end "entryRuleGeoLocationField"


    // $ANTLR start "ruleGeoLocationField"
    // InternalDomain.g:2085:1: ruleGeoLocationField returns [EObject current=null] : (otherlv_0= 'GeoLocation' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleSinglularCardinality ) )? ) ;
    public final EObject ruleGeoLocationField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Enumerator lv_cardinality_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:2091:2: ( (otherlv_0= 'GeoLocation' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleSinglularCardinality ) )? ) )
            // InternalDomain.g:2092:2: (otherlv_0= 'GeoLocation' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleSinglularCardinality ) )? )
            {
            // InternalDomain.g:2092:2: (otherlv_0= 'GeoLocation' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleSinglularCardinality ) )? )
            // InternalDomain.g:2093:3: otherlv_0= 'GeoLocation' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleSinglularCardinality ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGeoLocationFieldAccess().getGeoLocationKeyword_0());
            		
            // InternalDomain.g:2097:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:2098:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:2098:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:2099:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGeoLocationFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeoLocationFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:2115:3: ( (lv_cardinality_2_0= ruleSinglularCardinality ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=98 && LA43_0<=99)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDomain.g:2116:4: (lv_cardinality_2_0= ruleSinglularCardinality )
                    {
                    // InternalDomain.g:2116:4: (lv_cardinality_2_0= ruleSinglularCardinality )
                    // InternalDomain.g:2117:5: lv_cardinality_2_0= ruleSinglularCardinality
                    {

                    					newCompositeNode(grammarAccess.getGeoLocationFieldAccess().getCardinalitySinglularCardinalityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cardinality_2_0=ruleSinglularCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGeoLocationFieldRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_2_0,
                    						"io.yaktor.Domain.SinglularCardinality");
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
    // $ANTLR end "ruleGeoLocationField"


    // $ANTLR start "entryRuleIntegerField"
    // InternalDomain.g:2138:1: entryRuleIntegerField returns [EObject current=null] : iv_ruleIntegerField= ruleIntegerField EOF ;
    public final EObject entryRuleIntegerField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerField = null;


        try {
            // InternalDomain.g:2138:53: (iv_ruleIntegerField= ruleIntegerField EOF )
            // InternalDomain.g:2139:2: iv_ruleIntegerField= ruleIntegerField EOF
            {
             newCompositeNode(grammarAccess.getIntegerFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerField=ruleIntegerField();

            state._fsp--;

             current =iv_ruleIntegerField; 
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
    // $ANTLR end "entryRuleIntegerField"


    // $ANTLR start "ruleIntegerField"
    // InternalDomain.g:2145:1: ruleIntegerField returns [EObject current=null] : (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleIntegerField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token lv_unique_6_0=null;
        Token lv_indexed_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_cardinality_2_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_5_0 = null;

        AntlrDatatypeRuleToken lv_minValue_9_0 = null;

        AntlrDatatypeRuleToken lv_maxValue_11_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:2151:2: ( (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) ) ) )* ) ) ) ) )
            // InternalDomain.g:2152:2: (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) ) ) )* ) ) ) )
            {
            // InternalDomain.g:2152:2: (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) ) ) )* ) ) ) )
            // InternalDomain.g:2153:3: otherlv_0= 'Integer' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegerFieldAccess().getIntegerKeyword_0());
            		
            // InternalDomain.g:2157:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:2158:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:2158:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:2159:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIntegerFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:2175:3: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=98 && LA44_0<=101)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDomain.g:2176:4: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // InternalDomain.g:2176:4: (lv_cardinality_2_0= ruleCardinality )
                    // InternalDomain.g:2177:5: lv_cardinality_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getIntegerFieldAccess().getCardinalityCardinalityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_46);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIntegerFieldRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_2_0,
                    						"io.yaktor.Domain.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:2194:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) ) ) )* ) ) )
            // InternalDomain.g:2195:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) ) ) )* ) )
            {
            // InternalDomain.g:2195:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) ) ) )* ) )
            // InternalDomain.g:2196:5: ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3());
            				
            // InternalDomain.g:2199:5: ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) ) ) )* )
            // InternalDomain.g:2200:6: ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) ) ) )*
            {
            // InternalDomain.g:2200:6: ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) ) ) )*
            loop47:
            do {
                int alt47=5;
                int LA47_0 = input.LA(1);

                if ( LA47_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 0) ) {
                    alt47=1;
                }
                else if ( LA47_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 1) ) {
                    alt47=2;
                }
                else if ( LA47_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 2) ) {
                    alt47=3;
                }
                else if ( LA47_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 3) ) {
                    alt47=4;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalDomain.g:2201:4: ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:2201:4: ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) ) )
            	    // InternalDomain.g:2202:5: {...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIntegerField", "getUnorderedGroupHelper().canSelect(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDomain.g:2202:109: ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) ) )
            	    // InternalDomain.g:2203:6: ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDomain.g:2206:9: ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) ) )
            	    // InternalDomain.g:2206:10: {...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIntegerField", "true");
            	    }
            	    // InternalDomain.g:2206:19: (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) ) )
            	    // InternalDomain.g:2206:20: otherlv_4= '=' ( (lv_defaultValue_5_0= ruleIntegerConst ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_47); 

            	    									newLeafNode(otherlv_4, grammarAccess.getIntegerFieldAccess().getEqualsSignKeyword_3_0_0());
            	    								
            	    // InternalDomain.g:2210:9: ( (lv_defaultValue_5_0= ruleIntegerConst ) )
            	    // InternalDomain.g:2211:10: (lv_defaultValue_5_0= ruleIntegerConst )
            	    {
            	    // InternalDomain.g:2211:10: (lv_defaultValue_5_0= ruleIntegerConst )
            	    // InternalDomain.g:2212:11: lv_defaultValue_5_0= ruleIntegerConst
            	    {

            	    											newCompositeNode(grammarAccess.getIntegerFieldAccess().getDefaultValueIntegerConstParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_46);
            	    lv_defaultValue_5_0=ruleIntegerConst();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getIntegerFieldRule());
            	    											}
            	    											set(
            	    												current,
            	    												"defaultValue",
            	    												lv_defaultValue_5_0,
            	    												"io.yaktor.Domain.IntegerConst");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomain.g:2235:4: ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) )
            	    {
            	    // InternalDomain.g:2235:4: ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) )
            	    // InternalDomain.g:2236:5: {...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIntegerField", "getUnorderedGroupHelper().canSelect(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDomain.g:2236:109: ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) )
            	    // InternalDomain.g:2237:6: ({...}? => ( (lv_unique_6_0= 'unique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDomain.g:2240:9: ({...}? => ( (lv_unique_6_0= 'unique' ) ) )
            	    // InternalDomain.g:2240:10: {...}? => ( (lv_unique_6_0= 'unique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIntegerField", "true");
            	    }
            	    // InternalDomain.g:2240:19: ( (lv_unique_6_0= 'unique' ) )
            	    // InternalDomain.g:2240:20: (lv_unique_6_0= 'unique' )
            	    {
            	    // InternalDomain.g:2240:20: (lv_unique_6_0= 'unique' )
            	    // InternalDomain.g:2241:10: lv_unique_6_0= 'unique'
            	    {
            	    lv_unique_6_0=(Token)match(input,21,FOLLOW_46); 

            	    										newLeafNode(lv_unique_6_0, grammarAccess.getIntegerFieldAccess().getUniqueUniqueKeyword_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getIntegerFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "unique", lv_unique_6_0 != null, "unique");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDomain.g:2258:4: ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) )
            	    {
            	    // InternalDomain.g:2258:4: ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) )
            	    // InternalDomain.g:2259:5: {...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIntegerField", "getUnorderedGroupHelper().canSelect(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDomain.g:2259:109: ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) )
            	    // InternalDomain.g:2260:6: ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDomain.g:2263:9: ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) )
            	    // InternalDomain.g:2263:10: {...}? => ( (lv_indexed_7_0= 'indexed' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIntegerField", "true");
            	    }
            	    // InternalDomain.g:2263:19: ( (lv_indexed_7_0= 'indexed' ) )
            	    // InternalDomain.g:2263:20: (lv_indexed_7_0= 'indexed' )
            	    {
            	    // InternalDomain.g:2263:20: (lv_indexed_7_0= 'indexed' )
            	    // InternalDomain.g:2264:10: lv_indexed_7_0= 'indexed'
            	    {
            	    lv_indexed_7_0=(Token)match(input,35,FOLLOW_46); 

            	    										newLeafNode(lv_indexed_7_0, grammarAccess.getIntegerFieldAccess().getIndexedIndexedKeyword_3_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getIntegerFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "indexed", lv_indexed_7_0 != null, "indexed");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDomain.g:2281:4: ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) ) )
            	    {
            	    // InternalDomain.g:2281:4: ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) ) )
            	    // InternalDomain.g:2282:5: {...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIntegerField", "getUnorderedGroupHelper().canSelect(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDomain.g:2282:109: ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) ) )
            	    // InternalDomain.g:2283:6: ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDomain.g:2286:9: ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' ) )
            	    // InternalDomain.g:2286:10: {...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIntegerField", "true");
            	    }
            	    // InternalDomain.g:2286:19: (otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']' )
            	    // InternalDomain.g:2286:20: otherlv_8= '[' ( (lv_minValue_9_0= ruleIntegerConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleIntegerConst ) )? otherlv_12= ']'
            	    {
            	    otherlv_8=(Token)match(input,40,FOLLOW_48); 

            	    									newLeafNode(otherlv_8, grammarAccess.getIntegerFieldAccess().getLeftSquareBracketKeyword_3_3_0());
            	    								
            	    // InternalDomain.g:2290:9: ( (lv_minValue_9_0= ruleIntegerConst ) )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==RULE_INT||LA45_0==56) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalDomain.g:2291:10: (lv_minValue_9_0= ruleIntegerConst )
            	            {
            	            // InternalDomain.g:2291:10: (lv_minValue_9_0= ruleIntegerConst )
            	            // InternalDomain.g:2292:11: lv_minValue_9_0= ruleIntegerConst
            	            {

            	            											newCompositeNode(grammarAccess.getIntegerFieldAccess().getMinValueIntegerConstParserRuleCall_3_3_1_0());
            	            										
            	            pushFollow(FOLLOW_36);
            	            lv_minValue_9_0=ruleIntegerConst();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getIntegerFieldRule());
            	            											}
            	            											set(
            	            												current,
            	            												"minValue",
            	            												lv_minValue_9_0,
            	            												"io.yaktor.Domain.IntegerConst");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,41,FOLLOW_49); 

            	    									newLeafNode(otherlv_10, grammarAccess.getIntegerFieldAccess().getFullStopFullStopKeyword_3_3_2());
            	    								
            	    // InternalDomain.g:2313:9: ( (lv_maxValue_11_0= ruleIntegerConst ) )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==RULE_INT||LA46_0==56) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalDomain.g:2314:10: (lv_maxValue_11_0= ruleIntegerConst )
            	            {
            	            // InternalDomain.g:2314:10: (lv_maxValue_11_0= ruleIntegerConst )
            	            // InternalDomain.g:2315:11: lv_maxValue_11_0= ruleIntegerConst
            	            {

            	            											newCompositeNode(grammarAccess.getIntegerFieldAccess().getMaxValueIntegerConstParserRuleCall_3_3_3_0());
            	            										
            	            pushFollow(FOLLOW_38);
            	            lv_maxValue_11_0=ruleIntegerConst();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getIntegerFieldRule());
            	            											}
            	            											set(
            	            												current,
            	            												"maxValue",
            	            												lv_maxValue_11_0,
            	            												"io.yaktor.Domain.IntegerConst");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_12=(Token)match(input,42,FOLLOW_46); 

            	    									newLeafNode(otherlv_12, grammarAccess.getIntegerFieldAccess().getRightSquareBracketKeyword_3_3_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getIntegerFieldAccess().getUnorderedGroup_3());
            				

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
    // $ANTLR end "ruleIntegerField"


    // $ANTLR start "entryRuleNumericField"
    // InternalDomain.g:2353:1: entryRuleNumericField returns [EObject current=null] : iv_ruleNumericField= ruleNumericField EOF ;
    public final EObject entryRuleNumericField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericField = null;


        try {
            // InternalDomain.g:2353:53: (iv_ruleNumericField= ruleNumericField EOF )
            // InternalDomain.g:2354:2: iv_ruleNumericField= ruleNumericField EOF
            {
             newCompositeNode(grammarAccess.getNumericFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericField=ruleNumericField();

            state._fsp--;

             current =iv_ruleNumericField; 
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
    // $ANTLR end "entryRuleNumericField"


    // $ANTLR start "ruleNumericField"
    // InternalDomain.g:2360:1: ruleNumericField returns [EObject current=null] : (otherlv_0= 'Numeric' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleNumericField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token lv_unique_6_0=null;
        Token lv_indexed_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_cardinality_2_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_5_0 = null;

        AntlrDatatypeRuleToken lv_minValue_9_0 = null;

        AntlrDatatypeRuleToken lv_maxValue_11_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:2366:2: ( (otherlv_0= 'Numeric' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) ) ) )* ) ) ) ) )
            // InternalDomain.g:2367:2: (otherlv_0= 'Numeric' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) ) ) )* ) ) ) )
            {
            // InternalDomain.g:2367:2: (otherlv_0= 'Numeric' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) ) ) )* ) ) ) )
            // InternalDomain.g:2368:3: otherlv_0= 'Numeric' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNumericFieldAccess().getNumericKeyword_0());
            		
            // InternalDomain.g:2372:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:2373:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:2373:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:2374:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNumericFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumericFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:2390:3: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=98 && LA48_0<=101)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDomain.g:2391:4: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // InternalDomain.g:2391:4: (lv_cardinality_2_0= ruleCardinality )
                    // InternalDomain.g:2392:5: lv_cardinality_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getNumericFieldAccess().getCardinalityCardinalityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_46);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNumericFieldRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_2_0,
                    						"io.yaktor.Domain.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:2409:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) ) ) )* ) ) )
            // InternalDomain.g:2410:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) ) ) )* ) )
            {
            // InternalDomain.g:2410:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) ) ) )* ) )
            // InternalDomain.g:2411:5: ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3());
            				
            // InternalDomain.g:2414:5: ( ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) ) ) )* )
            // InternalDomain.g:2415:6: ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) ) ) )*
            {
            // InternalDomain.g:2415:6: ( ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) ) ) )*
            loop51:
            do {
                int alt51=5;
                int LA51_0 = input.LA(1);

                if ( LA51_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 0) ) {
                    alt51=1;
                }
                else if ( LA51_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 1) ) {
                    alt51=2;
                }
                else if ( LA51_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 2) ) {
                    alt51=3;
                }
                else if ( LA51_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 3) ) {
                    alt51=4;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalDomain.g:2416:4: ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:2416:4: ({...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) ) )
            	    // InternalDomain.g:2417:5: {...}? => ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNumericField", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDomain.g:2417:109: ( ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) ) )
            	    // InternalDomain.g:2418:6: ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDomain.g:2421:9: ({...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) ) )
            	    // InternalDomain.g:2421:10: {...}? => (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumericField", "true");
            	    }
            	    // InternalDomain.g:2421:19: (otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) ) )
            	    // InternalDomain.g:2421:20: otherlv_4= '=' ( (lv_defaultValue_5_0= ruleFloatingPointConst ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_50); 

            	    									newLeafNode(otherlv_4, grammarAccess.getNumericFieldAccess().getEqualsSignKeyword_3_0_0());
            	    								
            	    // InternalDomain.g:2425:9: ( (lv_defaultValue_5_0= ruleFloatingPointConst ) )
            	    // InternalDomain.g:2426:10: (lv_defaultValue_5_0= ruleFloatingPointConst )
            	    {
            	    // InternalDomain.g:2426:10: (lv_defaultValue_5_0= ruleFloatingPointConst )
            	    // InternalDomain.g:2427:11: lv_defaultValue_5_0= ruleFloatingPointConst
            	    {

            	    											newCompositeNode(grammarAccess.getNumericFieldAccess().getDefaultValueFloatingPointConstParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_46);
            	    lv_defaultValue_5_0=ruleFloatingPointConst();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNumericFieldRule());
            	    											}
            	    											set(
            	    												current,
            	    												"defaultValue",
            	    												lv_defaultValue_5_0,
            	    												"io.yaktor.Domain.FloatingPointConst");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomain.g:2450:4: ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) )
            	    {
            	    // InternalDomain.g:2450:4: ({...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) ) )
            	    // InternalDomain.g:2451:5: {...}? => ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNumericField", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDomain.g:2451:109: ( ({...}? => ( (lv_unique_6_0= 'unique' ) ) ) )
            	    // InternalDomain.g:2452:6: ({...}? => ( (lv_unique_6_0= 'unique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDomain.g:2455:9: ({...}? => ( (lv_unique_6_0= 'unique' ) ) )
            	    // InternalDomain.g:2455:10: {...}? => ( (lv_unique_6_0= 'unique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumericField", "true");
            	    }
            	    // InternalDomain.g:2455:19: ( (lv_unique_6_0= 'unique' ) )
            	    // InternalDomain.g:2455:20: (lv_unique_6_0= 'unique' )
            	    {
            	    // InternalDomain.g:2455:20: (lv_unique_6_0= 'unique' )
            	    // InternalDomain.g:2456:10: lv_unique_6_0= 'unique'
            	    {
            	    lv_unique_6_0=(Token)match(input,21,FOLLOW_46); 

            	    										newLeafNode(lv_unique_6_0, grammarAccess.getNumericFieldAccess().getUniqueUniqueKeyword_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getNumericFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "unique", lv_unique_6_0 != null, "unique");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDomain.g:2473:4: ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) )
            	    {
            	    // InternalDomain.g:2473:4: ({...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) ) )
            	    // InternalDomain.g:2474:5: {...}? => ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNumericField", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDomain.g:2474:109: ( ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) ) )
            	    // InternalDomain.g:2475:6: ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDomain.g:2478:9: ({...}? => ( (lv_indexed_7_0= 'indexed' ) ) )
            	    // InternalDomain.g:2478:10: {...}? => ( (lv_indexed_7_0= 'indexed' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumericField", "true");
            	    }
            	    // InternalDomain.g:2478:19: ( (lv_indexed_7_0= 'indexed' ) )
            	    // InternalDomain.g:2478:20: (lv_indexed_7_0= 'indexed' )
            	    {
            	    // InternalDomain.g:2478:20: (lv_indexed_7_0= 'indexed' )
            	    // InternalDomain.g:2479:10: lv_indexed_7_0= 'indexed'
            	    {
            	    lv_indexed_7_0=(Token)match(input,35,FOLLOW_46); 

            	    										newLeafNode(lv_indexed_7_0, grammarAccess.getNumericFieldAccess().getIndexedIndexedKeyword_3_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getNumericFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "indexed", lv_indexed_7_0 != null, "indexed");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDomain.g:2496:4: ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) ) )
            	    {
            	    // InternalDomain.g:2496:4: ({...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) ) )
            	    // InternalDomain.g:2497:5: {...}? => ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNumericField", "getUnorderedGroupHelper().canSelect(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalDomain.g:2497:109: ( ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) ) )
            	    // InternalDomain.g:2498:6: ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalDomain.g:2501:9: ({...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' ) )
            	    // InternalDomain.g:2501:10: {...}? => (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNumericField", "true");
            	    }
            	    // InternalDomain.g:2501:19: (otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']' )
            	    // InternalDomain.g:2501:20: otherlv_8= '[' ( (lv_minValue_9_0= ruleFloatingPointConst ) )? otherlv_10= '..' ( (lv_maxValue_11_0= ruleFloatingPointConst ) )? otherlv_12= ']'
            	    {
            	    otherlv_8=(Token)match(input,40,FOLLOW_51); 

            	    									newLeafNode(otherlv_8, grammarAccess.getNumericFieldAccess().getLeftSquareBracketKeyword_3_3_0());
            	    								
            	    // InternalDomain.g:2505:9: ( (lv_minValue_9_0= ruleFloatingPointConst ) )?
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==RULE_INT||(LA49_0>=56 && LA49_0<=57)) ) {
            	        alt49=1;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // InternalDomain.g:2506:10: (lv_minValue_9_0= ruleFloatingPointConst )
            	            {
            	            // InternalDomain.g:2506:10: (lv_minValue_9_0= ruleFloatingPointConst )
            	            // InternalDomain.g:2507:11: lv_minValue_9_0= ruleFloatingPointConst
            	            {

            	            											newCompositeNode(grammarAccess.getNumericFieldAccess().getMinValueFloatingPointConstParserRuleCall_3_3_1_0());
            	            										
            	            pushFollow(FOLLOW_36);
            	            lv_minValue_9_0=ruleFloatingPointConst();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getNumericFieldRule());
            	            											}
            	            											set(
            	            												current,
            	            												"minValue",
            	            												lv_minValue_9_0,
            	            												"io.yaktor.Domain.FloatingPointConst");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,41,FOLLOW_52); 

            	    									newLeafNode(otherlv_10, grammarAccess.getNumericFieldAccess().getFullStopFullStopKeyword_3_3_2());
            	    								
            	    // InternalDomain.g:2528:9: ( (lv_maxValue_11_0= ruleFloatingPointConst ) )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==RULE_INT||(LA50_0>=56 && LA50_0<=57)) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalDomain.g:2529:10: (lv_maxValue_11_0= ruleFloatingPointConst )
            	            {
            	            // InternalDomain.g:2529:10: (lv_maxValue_11_0= ruleFloatingPointConst )
            	            // InternalDomain.g:2530:11: lv_maxValue_11_0= ruleFloatingPointConst
            	            {

            	            											newCompositeNode(grammarAccess.getNumericFieldAccess().getMaxValueFloatingPointConstParserRuleCall_3_3_3_0());
            	            										
            	            pushFollow(FOLLOW_38);
            	            lv_maxValue_11_0=ruleFloatingPointConst();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getNumericFieldRule());
            	            											}
            	            											set(
            	            												current,
            	            												"maxValue",
            	            												lv_maxValue_11_0,
            	            												"io.yaktor.Domain.FloatingPointConst");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_12=(Token)match(input,42,FOLLOW_46); 

            	    									newLeafNode(otherlv_12, grammarAccess.getNumericFieldAccess().getRightSquareBracketKeyword_3_3_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getNumericFieldAccess().getUnorderedGroup_3());
            				

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
    // $ANTLR end "ruleNumericField"


    // $ANTLR start "entryRuleBooleanField"
    // InternalDomain.g:2568:1: entryRuleBooleanField returns [EObject current=null] : iv_ruleBooleanField= ruleBooleanField EOF ;
    public final EObject entryRuleBooleanField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanField = null;


        try {
            // InternalDomain.g:2568:53: (iv_ruleBooleanField= ruleBooleanField EOF )
            // InternalDomain.g:2569:2: iv_ruleBooleanField= ruleBooleanField EOF
            {
             newCompositeNode(grammarAccess.getBooleanFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanField=ruleBooleanField();

            state._fsp--;

             current =iv_ruleBooleanField; 
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
    // $ANTLR end "entryRuleBooleanField"


    // $ANTLR start "ruleBooleanField"
    // InternalDomain.g:2575:1: ruleBooleanField returns [EObject current=null] : (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) ) ) )+ {...}?) ) )? ) ;
    public final EObject ruleBooleanField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_unique_4_0=null;
        Token lv_indexed_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_cardinality_2_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_7_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:2581:2: ( (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) ) ) )+ {...}?) ) )? ) )
            // InternalDomain.g:2582:2: (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) ) ) )+ {...}?) ) )? )
            {
            // InternalDomain.g:2582:2: (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) ) ) )+ {...}?) ) )? )
            // InternalDomain.g:2583:3: otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) ) ) )+ {...}?) ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanFieldAccess().getBooleanKeyword_0());
            		
            // InternalDomain.g:2587:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:2588:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:2588:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:2589:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_53); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBooleanFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:2605:3: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=98 && LA52_0<=101)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDomain.g:2606:4: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // InternalDomain.g:2606:4: (lv_cardinality_2_0= ruleCardinality )
                    // InternalDomain.g:2607:5: lv_cardinality_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getBooleanFieldAccess().getCardinalityCardinalityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_54);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBooleanFieldRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_2_0,
                    						"io.yaktor.Domain.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:2624:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) ) ) )+ {...}?) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==21||LA54_0==33||LA54_0==35) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDomain.g:2625:4: ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalDomain.g:2625:4: ( ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) ) ) )+ {...}?) )
                    // InternalDomain.g:2626:5: ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) ) ) )+ {...}?)
                    {
                     
                    				  getUnorderedGroupHelper().enter(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3());
                    				
                    // InternalDomain.g:2629:5: ( ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) ) ) )+ {...}?)
                    // InternalDomain.g:2630:6: ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalDomain.g:2630:6: ( ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) ) ) )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=4;
                        int LA53_0 = input.LA(1);

                        if ( LA53_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3(), 0) ) {
                            alt53=1;
                        }
                        else if ( LA53_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3(), 1) ) {
                            alt53=2;
                        }
                        else if ( LA53_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3(), 2) ) {
                            alt53=3;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalDomain.g:2631:4: ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) )
                    	    {
                    	    // InternalDomain.g:2631:4: ({...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) ) )
                    	    // InternalDomain.g:2632:5: {...}? => ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleBooleanField", "getUnorderedGroupHelper().canSelect(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3(), 0)");
                    	    }
                    	    // InternalDomain.g:2632:109: ( ({...}? => ( (lv_unique_4_0= 'unique' ) ) ) )
                    	    // InternalDomain.g:2633:6: ({...}? => ( (lv_unique_4_0= 'unique' ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3(), 0);
                    	    					
                    	    // InternalDomain.g:2636:9: ({...}? => ( (lv_unique_4_0= 'unique' ) ) )
                    	    // InternalDomain.g:2636:10: {...}? => ( (lv_unique_4_0= 'unique' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleBooleanField", "true");
                    	    }
                    	    // InternalDomain.g:2636:19: ( (lv_unique_4_0= 'unique' ) )
                    	    // InternalDomain.g:2636:20: (lv_unique_4_0= 'unique' )
                    	    {
                    	    // InternalDomain.g:2636:20: (lv_unique_4_0= 'unique' )
                    	    // InternalDomain.g:2637:10: lv_unique_4_0= 'unique'
                    	    {
                    	    lv_unique_4_0=(Token)match(input,21,FOLLOW_54); 

                    	    										newLeafNode(lv_unique_4_0, grammarAccess.getBooleanFieldAccess().getUniqueUniqueKeyword_3_0_0());
                    	    									

                    	    										if (current==null) {
                    	    											current = createModelElement(grammarAccess.getBooleanFieldRule());
                    	    										}
                    	    										setWithLastConsumed(current, "unique", lv_unique_4_0 != null, "unique");
                    	    									

                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDomain.g:2654:4: ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) )
                    	    {
                    	    // InternalDomain.g:2654:4: ({...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) ) )
                    	    // InternalDomain.g:2655:5: {...}? => ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleBooleanField", "getUnorderedGroupHelper().canSelect(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3(), 1)");
                    	    }
                    	    // InternalDomain.g:2655:109: ( ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) ) )
                    	    // InternalDomain.g:2656:6: ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3(), 1);
                    	    					
                    	    // InternalDomain.g:2659:9: ({...}? => ( (lv_indexed_5_0= 'indexed' ) ) )
                    	    // InternalDomain.g:2659:10: {...}? => ( (lv_indexed_5_0= 'indexed' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleBooleanField", "true");
                    	    }
                    	    // InternalDomain.g:2659:19: ( (lv_indexed_5_0= 'indexed' ) )
                    	    // InternalDomain.g:2659:20: (lv_indexed_5_0= 'indexed' )
                    	    {
                    	    // InternalDomain.g:2659:20: (lv_indexed_5_0= 'indexed' )
                    	    // InternalDomain.g:2660:10: lv_indexed_5_0= 'indexed'
                    	    {
                    	    lv_indexed_5_0=(Token)match(input,35,FOLLOW_54); 

                    	    										newLeafNode(lv_indexed_5_0, grammarAccess.getBooleanFieldAccess().getIndexedIndexedKeyword_3_1_0());
                    	    									

                    	    										if (current==null) {
                    	    											current = createModelElement(grammarAccess.getBooleanFieldRule());
                    	    										}
                    	    										setWithLastConsumed(current, "indexed", lv_indexed_5_0 != null, "indexed");
                    	    									

                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalDomain.g:2677:4: ({...}? => ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) ) )
                    	    {
                    	    // InternalDomain.g:2677:4: ({...}? => ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) ) )
                    	    // InternalDomain.g:2678:5: {...}? => ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleBooleanField", "getUnorderedGroupHelper().canSelect(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3(), 2)");
                    	    }
                    	    // InternalDomain.g:2678:109: ( ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) ) )
                    	    // InternalDomain.g:2679:6: ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3(), 2);
                    	    					
                    	    // InternalDomain.g:2682:9: ({...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) ) )
                    	    // InternalDomain.g:2682:10: {...}? => (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleBooleanField", "true");
                    	    }
                    	    // InternalDomain.g:2682:19: (otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) ) )
                    	    // InternalDomain.g:2682:20: otherlv_6= '=' ( (lv_defaultValue_7_0= ruleBooleanConst ) )
                    	    {
                    	    otherlv_6=(Token)match(input,33,FOLLOW_55); 

                    	    									newLeafNode(otherlv_6, grammarAccess.getBooleanFieldAccess().getEqualsSignKeyword_3_2_0());
                    	    								
                    	    // InternalDomain.g:2686:9: ( (lv_defaultValue_7_0= ruleBooleanConst ) )
                    	    // InternalDomain.g:2687:10: (lv_defaultValue_7_0= ruleBooleanConst )
                    	    {
                    	    // InternalDomain.g:2687:10: (lv_defaultValue_7_0= ruleBooleanConst )
                    	    // InternalDomain.g:2688:11: lv_defaultValue_7_0= ruleBooleanConst
                    	    {

                    	    											newCompositeNode(grammarAccess.getBooleanFieldAccess().getDefaultValueBooleanConstParserRuleCall_3_2_1_0());
                    	    										
                    	    pushFollow(FOLLOW_54);
                    	    lv_defaultValue_7_0=ruleBooleanConst();

                    	    state._fsp--;


                    	    											if (current==null) {
                    	    												current = createModelElementForParent(grammarAccess.getBooleanFieldRule());
                    	    											}
                    	    											set(
                    	    												current,
                    	    												"defaultValue",
                    	    												lv_defaultValue_7_0,
                    	    												"io.yaktor.Domain.BooleanConst");
                    	    											afterParserOrEnumRuleCall();
                    	    										

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt53 >= 1 ) break loop53;
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3()) ) {
                        throw new FailedPredicateException(input, "ruleBooleanField", "getUnorderedGroupHelper().canLeave(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3())");
                    }

                    }


                    }

                     
                    				  getUnorderedGroupHelper().leave(grammarAccess.getBooleanFieldAccess().getUnorderedGroup_3());
                    				

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
    // $ANTLR end "ruleBooleanField"


    // $ANTLR start "entryRulePriceField"
    // InternalDomain.g:2723:1: entryRulePriceField returns [EObject current=null] : iv_rulePriceField= rulePriceField EOF ;
    public final EObject entryRulePriceField() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriceField = null;


        try {
            // InternalDomain.g:2723:51: (iv_rulePriceField= rulePriceField EOF )
            // InternalDomain.g:2724:2: iv_rulePriceField= rulePriceField EOF
            {
             newCompositeNode(grammarAccess.getPriceFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePriceField=rulePriceField();

            state._fsp--;

             current =iv_rulePriceField; 
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
    // $ANTLR end "entryRulePriceField"


    // $ANTLR start "rulePriceField"
    // InternalDomain.g:2730:1: rulePriceField returns [EObject current=null] : (otherlv_0= 'Price' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject rulePriceField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_indexed_4_0=null;
        Token lv_unique_5_0=null;
        Enumerator lv_cardinality_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:2736:2: ( (otherlv_0= 'Price' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) ) ) )
            // InternalDomain.g:2737:2: (otherlv_0= 'Price' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) ) )
            {
            // InternalDomain.g:2737:2: (otherlv_0= 'Price' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) ) )
            // InternalDomain.g:2738:3: otherlv_0= 'Price' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPriceFieldAccess().getPriceKeyword_0());
            		
            // InternalDomain.g:2742:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:2743:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:2743:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:2744:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPriceFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPriceFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:2760:3: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=98 && LA55_0<=101)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDomain.g:2761:4: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // InternalDomain.g:2761:4: (lv_cardinality_2_0= ruleCardinality )
                    // InternalDomain.g:2762:5: lv_cardinality_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getPriceFieldAccess().getCardinalityCardinalityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPriceFieldRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_2_0,
                    						"io.yaktor.Domain.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:2779:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) )
            // InternalDomain.g:2780:4: ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) )
            {
            // InternalDomain.g:2780:4: ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) )
            // InternalDomain.g:2781:5: ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPriceFieldAccess().getUnorderedGroup_3());
            				
            // InternalDomain.g:2784:5: ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* )
            // InternalDomain.g:2785:6: ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )*
            {
            // InternalDomain.g:2785:6: ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )*
            loop56:
            do {
                int alt56=3;
                int LA56_0 = input.LA(1);

                if ( LA56_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getPriceFieldAccess().getUnorderedGroup_3(), 0) ) {
                    alt56=1;
                }
                else if ( LA56_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getPriceFieldAccess().getUnorderedGroup_3(), 1) ) {
                    alt56=2;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalDomain.g:2786:4: ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) )
            	    {
            	    // InternalDomain.g:2786:4: ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) )
            	    // InternalDomain.g:2787:5: {...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPriceFieldAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePriceField", "getUnorderedGroupHelper().canSelect(grammarAccess.getPriceFieldAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDomain.g:2787:107: ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) )
            	    // InternalDomain.g:2788:6: ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPriceFieldAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDomain.g:2791:9: ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) )
            	    // InternalDomain.g:2791:10: {...}? => ( (lv_indexed_4_0= 'indexed' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePriceField", "true");
            	    }
            	    // InternalDomain.g:2791:19: ( (lv_indexed_4_0= 'indexed' ) )
            	    // InternalDomain.g:2791:20: (lv_indexed_4_0= 'indexed' )
            	    {
            	    // InternalDomain.g:2791:20: (lv_indexed_4_0= 'indexed' )
            	    // InternalDomain.g:2792:10: lv_indexed_4_0= 'indexed'
            	    {
            	    lv_indexed_4_0=(Token)match(input,35,FOLLOW_29); 

            	    										newLeafNode(lv_indexed_4_0, grammarAccess.getPriceFieldAccess().getIndexedIndexedKeyword_3_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPriceFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "indexed", lv_indexed_4_0 != null, "indexed");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPriceFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomain.g:2809:4: ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) )
            	    {
            	    // InternalDomain.g:2809:4: ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) )
            	    // InternalDomain.g:2810:5: {...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPriceFieldAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePriceField", "getUnorderedGroupHelper().canSelect(grammarAccess.getPriceFieldAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDomain.g:2810:107: ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) )
            	    // InternalDomain.g:2811:6: ({...}? => ( (lv_unique_5_0= 'unique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPriceFieldAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDomain.g:2814:9: ({...}? => ( (lv_unique_5_0= 'unique' ) ) )
            	    // InternalDomain.g:2814:10: {...}? => ( (lv_unique_5_0= 'unique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePriceField", "true");
            	    }
            	    // InternalDomain.g:2814:19: ( (lv_unique_5_0= 'unique' ) )
            	    // InternalDomain.g:2814:20: (lv_unique_5_0= 'unique' )
            	    {
            	    // InternalDomain.g:2814:20: (lv_unique_5_0= 'unique' )
            	    // InternalDomain.g:2815:10: lv_unique_5_0= 'unique'
            	    {
            	    lv_unique_5_0=(Token)match(input,21,FOLLOW_29); 

            	    										newLeafNode(lv_unique_5_0, grammarAccess.getPriceFieldAccess().getUniqueUniqueKeyword_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPriceFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "unique", lv_unique_5_0 != null, "unique");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPriceFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPriceFieldAccess().getUnorderedGroup_3());
            				

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
    // $ANTLR end "rulePriceField"


    // $ANTLR start "entryRuleAmountField"
    // InternalDomain.g:2843:1: entryRuleAmountField returns [EObject current=null] : iv_ruleAmountField= ruleAmountField EOF ;
    public final EObject entryRuleAmountField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmountField = null;


        try {
            // InternalDomain.g:2843:52: (iv_ruleAmountField= ruleAmountField EOF )
            // InternalDomain.g:2844:2: iv_ruleAmountField= ruleAmountField EOF
            {
             newCompositeNode(grammarAccess.getAmountFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmountField=ruleAmountField();

            state._fsp--;

             current =iv_ruleAmountField; 
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
    // $ANTLR end "entryRuleAmountField"


    // $ANTLR start "ruleAmountField"
    // InternalDomain.g:2850:1: ruleAmountField returns [EObject current=null] : (otherlv_0= 'Amount' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleAmountField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_indexed_4_0=null;
        Token lv_unique_5_0=null;
        Enumerator lv_cardinality_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:2856:2: ( (otherlv_0= 'Amount' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) ) ) )
            // InternalDomain.g:2857:2: (otherlv_0= 'Amount' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) ) )
            {
            // InternalDomain.g:2857:2: (otherlv_0= 'Amount' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) ) )
            // InternalDomain.g:2858:3: otherlv_0= 'Amount' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAmountFieldAccess().getAmountKeyword_0());
            		
            // InternalDomain.g:2862:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:2863:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:2863:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:2864:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAmountFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAmountFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:2880:3: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=98 && LA57_0<=101)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDomain.g:2881:4: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // InternalDomain.g:2881:4: (lv_cardinality_2_0= ruleCardinality )
                    // InternalDomain.g:2882:5: lv_cardinality_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getAmountFieldAccess().getCardinalityCardinalityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAmountFieldRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_2_0,
                    						"io.yaktor.Domain.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:2899:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) )
            // InternalDomain.g:2900:4: ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) )
            {
            // InternalDomain.g:2900:4: ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) )
            // InternalDomain.g:2901:5: ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAmountFieldAccess().getUnorderedGroup_3());
            				
            // InternalDomain.g:2904:5: ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* )
            // InternalDomain.g:2905:6: ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )*
            {
            // InternalDomain.g:2905:6: ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )*
            loop58:
            do {
                int alt58=3;
                int LA58_0 = input.LA(1);

                if ( LA58_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getAmountFieldAccess().getUnorderedGroup_3(), 0) ) {
                    alt58=1;
                }
                else if ( LA58_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAmountFieldAccess().getUnorderedGroup_3(), 1) ) {
                    alt58=2;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalDomain.g:2906:4: ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) )
            	    {
            	    // InternalDomain.g:2906:4: ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) )
            	    // InternalDomain.g:2907:5: {...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAmountFieldAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAmountField", "getUnorderedGroupHelper().canSelect(grammarAccess.getAmountFieldAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDomain.g:2907:108: ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) )
            	    // InternalDomain.g:2908:6: ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAmountFieldAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDomain.g:2911:9: ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) )
            	    // InternalDomain.g:2911:10: {...}? => ( (lv_indexed_4_0= 'indexed' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAmountField", "true");
            	    }
            	    // InternalDomain.g:2911:19: ( (lv_indexed_4_0= 'indexed' ) )
            	    // InternalDomain.g:2911:20: (lv_indexed_4_0= 'indexed' )
            	    {
            	    // InternalDomain.g:2911:20: (lv_indexed_4_0= 'indexed' )
            	    // InternalDomain.g:2912:10: lv_indexed_4_0= 'indexed'
            	    {
            	    lv_indexed_4_0=(Token)match(input,35,FOLLOW_29); 

            	    										newLeafNode(lv_indexed_4_0, grammarAccess.getAmountFieldAccess().getIndexedIndexedKeyword_3_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getAmountFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "indexed", lv_indexed_4_0 != null, "indexed");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAmountFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomain.g:2929:4: ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) )
            	    {
            	    // InternalDomain.g:2929:4: ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) )
            	    // InternalDomain.g:2930:5: {...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAmountFieldAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAmountField", "getUnorderedGroupHelper().canSelect(grammarAccess.getAmountFieldAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDomain.g:2930:108: ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) )
            	    // InternalDomain.g:2931:6: ({...}? => ( (lv_unique_5_0= 'unique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAmountFieldAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDomain.g:2934:9: ({...}? => ( (lv_unique_5_0= 'unique' ) ) )
            	    // InternalDomain.g:2934:10: {...}? => ( (lv_unique_5_0= 'unique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAmountField", "true");
            	    }
            	    // InternalDomain.g:2934:19: ( (lv_unique_5_0= 'unique' ) )
            	    // InternalDomain.g:2934:20: (lv_unique_5_0= 'unique' )
            	    {
            	    // InternalDomain.g:2934:20: (lv_unique_5_0= 'unique' )
            	    // InternalDomain.g:2935:10: lv_unique_5_0= 'unique'
            	    {
            	    lv_unique_5_0=(Token)match(input,21,FOLLOW_29); 

            	    										newLeafNode(lv_unique_5_0, grammarAccess.getAmountFieldAccess().getUniqueUniqueKeyword_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getAmountFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "unique", lv_unique_5_0 != null, "unique");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAmountFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAmountFieldAccess().getUnorderedGroup_3());
            				

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
    // $ANTLR end "ruleAmountField"


    // $ANTLR start "entryRuleCountField"
    // InternalDomain.g:2963:1: entryRuleCountField returns [EObject current=null] : iv_ruleCountField= ruleCountField EOF ;
    public final EObject entryRuleCountField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountField = null;


        try {
            // InternalDomain.g:2963:51: (iv_ruleCountField= ruleCountField EOF )
            // InternalDomain.g:2964:2: iv_ruleCountField= ruleCountField EOF
            {
             newCompositeNode(grammarAccess.getCountFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountField=ruleCountField();

            state._fsp--;

             current =iv_ruleCountField; 
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
    // $ANTLR end "entryRuleCountField"


    // $ANTLR start "ruleCountField"
    // InternalDomain.g:2970:1: ruleCountField returns [EObject current=null] : (otherlv_0= 'Count' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleCountField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_indexed_4_0=null;
        Token lv_unique_5_0=null;
        Enumerator lv_cardinality_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:2976:2: ( (otherlv_0= 'Count' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) ) ) )
            // InternalDomain.g:2977:2: (otherlv_0= 'Count' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) ) )
            {
            // InternalDomain.g:2977:2: (otherlv_0= 'Count' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) ) )
            // InternalDomain.g:2978:3: otherlv_0= 'Count' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCountFieldAccess().getCountKeyword_0());
            		
            // InternalDomain.g:2982:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:2983:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:2983:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:2984:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCountFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:3000:3: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=98 && LA59_0<=101)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDomain.g:3001:4: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // InternalDomain.g:3001:4: (lv_cardinality_2_0= ruleCardinality )
                    // InternalDomain.g:3002:5: lv_cardinality_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getCountFieldAccess().getCardinalityCardinalityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCountFieldRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_2_0,
                    						"io.yaktor.Domain.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:3019:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) ) )
            // InternalDomain.g:3020:4: ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) )
            {
            // InternalDomain.g:3020:4: ( ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* ) )
            // InternalDomain.g:3021:5: ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getCountFieldAccess().getUnorderedGroup_3());
            				
            // InternalDomain.g:3024:5: ( ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )* )
            // InternalDomain.g:3025:6: ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )*
            {
            // InternalDomain.g:3025:6: ( ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) ) )*
            loop60:
            do {
                int alt60=3;
                int LA60_0 = input.LA(1);

                if ( LA60_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getCountFieldAccess().getUnorderedGroup_3(), 0) ) {
                    alt60=1;
                }
                else if ( LA60_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCountFieldAccess().getUnorderedGroup_3(), 1) ) {
                    alt60=2;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalDomain.g:3026:4: ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) )
            	    {
            	    // InternalDomain.g:3026:4: ({...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) ) )
            	    // InternalDomain.g:3027:5: {...}? => ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCountFieldAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCountField", "getUnorderedGroupHelper().canSelect(grammarAccess.getCountFieldAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDomain.g:3027:107: ( ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) ) )
            	    // InternalDomain.g:3028:6: ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCountFieldAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDomain.g:3031:9: ({...}? => ( (lv_indexed_4_0= 'indexed' ) ) )
            	    // InternalDomain.g:3031:10: {...}? => ( (lv_indexed_4_0= 'indexed' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCountField", "true");
            	    }
            	    // InternalDomain.g:3031:19: ( (lv_indexed_4_0= 'indexed' ) )
            	    // InternalDomain.g:3031:20: (lv_indexed_4_0= 'indexed' )
            	    {
            	    // InternalDomain.g:3031:20: (lv_indexed_4_0= 'indexed' )
            	    // InternalDomain.g:3032:10: lv_indexed_4_0= 'indexed'
            	    {
            	    lv_indexed_4_0=(Token)match(input,35,FOLLOW_29); 

            	    										newLeafNode(lv_indexed_4_0, grammarAccess.getCountFieldAccess().getIndexedIndexedKeyword_3_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getCountFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "indexed", lv_indexed_4_0 != null, "indexed");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCountFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomain.g:3049:4: ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) )
            	    {
            	    // InternalDomain.g:3049:4: ({...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) ) )
            	    // InternalDomain.g:3050:5: {...}? => ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCountFieldAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCountField", "getUnorderedGroupHelper().canSelect(grammarAccess.getCountFieldAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDomain.g:3050:107: ( ({...}? => ( (lv_unique_5_0= 'unique' ) ) ) )
            	    // InternalDomain.g:3051:6: ({...}? => ( (lv_unique_5_0= 'unique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCountFieldAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDomain.g:3054:9: ({...}? => ( (lv_unique_5_0= 'unique' ) ) )
            	    // InternalDomain.g:3054:10: {...}? => ( (lv_unique_5_0= 'unique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCountField", "true");
            	    }
            	    // InternalDomain.g:3054:19: ( (lv_unique_5_0= 'unique' ) )
            	    // InternalDomain.g:3054:20: (lv_unique_5_0= 'unique' )
            	    {
            	    // InternalDomain.g:3054:20: (lv_unique_5_0= 'unique' )
            	    // InternalDomain.g:3055:10: lv_unique_5_0= 'unique'
            	    {
            	    lv_unique_5_0=(Token)match(input,21,FOLLOW_29); 

            	    										newLeafNode(lv_unique_5_0, grammarAccess.getCountFieldAccess().getUniqueUniqueKeyword_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getCountFieldRule());
            	    										}
            	    										setWithLastConsumed(current, "unique", lv_unique_5_0 != null, "unique");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCountFieldAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getCountFieldAccess().getUnorderedGroup_3());
            				

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
    // $ANTLR end "ruleCountField"


    // $ANTLR start "entryRuleEnumField"
    // InternalDomain.g:3083:1: entryRuleEnumField returns [EObject current=null] : iv_ruleEnumField= ruleEnumField EOF ;
    public final EObject entryRuleEnumField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumField = null;


        try {
            // InternalDomain.g:3083:50: (iv_ruleEnumField= ruleEnumField EOF )
            // InternalDomain.g:3084:2: iv_ruleEnumField= ruleEnumField EOF
            {
             newCompositeNode(grammarAccess.getEnumFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumField=ruleEnumField();

            state._fsp--;

             current =iv_ruleEnumField; 
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
    // $ANTLR end "entryRuleEnumField"


    // $ANTLR start "ruleEnumField"
    // InternalDomain.g:3090:1: ruleEnumField returns [EObject current=null] : (otherlv_0= 'enum' ( ( rulePossiblyQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) )? (otherlv_4= 'jpa-enum-type' ( (lv_isJpaEnumType_5_0= ruleJpaEnumType ) ) )? ) ;
    public final EObject ruleEnumField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Enumerator lv_cardinality_3_0 = null;

        Enumerator lv_isJpaEnumType_5_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:3096:2: ( (otherlv_0= 'enum' ( ( rulePossiblyQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) )? (otherlv_4= 'jpa-enum-type' ( (lv_isJpaEnumType_5_0= ruleJpaEnumType ) ) )? ) )
            // InternalDomain.g:3097:2: (otherlv_0= 'enum' ( ( rulePossiblyQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) )? (otherlv_4= 'jpa-enum-type' ( (lv_isJpaEnumType_5_0= ruleJpaEnumType ) ) )? )
            {
            // InternalDomain.g:3097:2: (otherlv_0= 'enum' ( ( rulePossiblyQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) )? (otherlv_4= 'jpa-enum-type' ( (lv_isJpaEnumType_5_0= ruleJpaEnumType ) ) )? )
            // InternalDomain.g:3098:3: otherlv_0= 'enum' ( ( rulePossiblyQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) )? (otherlv_4= 'jpa-enum-type' ( (lv_isJpaEnumType_5_0= ruleJpaEnumType ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumFieldAccess().getEnumKeyword_0());
            		
            // InternalDomain.g:3102:3: ( ( rulePossiblyQualifiedName ) )
            // InternalDomain.g:3103:4: ( rulePossiblyQualifiedName )
            {
            // InternalDomain.g:3103:4: ( rulePossiblyQualifiedName )
            // InternalDomain.g:3104:5: rulePossiblyQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumFieldRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEnumFieldAccess().getIsTypeEnumTypeCrossReference_1_0());
            				
            pushFollow(FOLLOW_3);
            rulePossiblyQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomain.g:3118:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDomain.g:3119:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDomain.g:3119:4: (lv_name_2_0= RULE_ID )
            // InternalDomain.g:3120:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_56); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEnumFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:3136:3: ( (lv_cardinality_3_0= ruleCardinality ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=98 && LA61_0<=101)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalDomain.g:3137:4: (lv_cardinality_3_0= ruleCardinality )
                    {
                    // InternalDomain.g:3137:4: (lv_cardinality_3_0= ruleCardinality )
                    // InternalDomain.g:3138:5: lv_cardinality_3_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getEnumFieldAccess().getCardinalityCardinalityEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_57);
                    lv_cardinality_3_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEnumFieldRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_3_0,
                    						"io.yaktor.Domain.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:3155:3: (otherlv_4= 'jpa-enum-type' ( (lv_isJpaEnumType_5_0= ruleJpaEnumType ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==53) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalDomain.g:3156:4: otherlv_4= 'jpa-enum-type' ( (lv_isJpaEnumType_5_0= ruleJpaEnumType ) )
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_58); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnumFieldAccess().getJpaEnumTypeKeyword_4_0());
                    			
                    // InternalDomain.g:3160:4: ( (lv_isJpaEnumType_5_0= ruleJpaEnumType ) )
                    // InternalDomain.g:3161:5: (lv_isJpaEnumType_5_0= ruleJpaEnumType )
                    {
                    // InternalDomain.g:3161:5: (lv_isJpaEnumType_5_0= ruleJpaEnumType )
                    // InternalDomain.g:3162:6: lv_isJpaEnumType_5_0= ruleJpaEnumType
                    {

                    						newCompositeNode(grammarAccess.getEnumFieldAccess().getIsJpaEnumTypeJpaEnumTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_isJpaEnumType_5_0=ruleJpaEnumType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumFieldRule());
                    						}
                    						set(
                    							current,
                    							"isJpaEnumType",
                    							lv_isJpaEnumType_5_0,
                    							"io.yaktor.Domain.JpaEnumType");
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
    // $ANTLR end "ruleEnumField"


    // $ANTLR start "entryRuleTypeField"
    // InternalDomain.g:3184:1: entryRuleTypeField returns [EObject current=null] : iv_ruleTypeField= ruleTypeField EOF ;
    public final EObject entryRuleTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeField = null;


        try {
            // InternalDomain.g:3184:50: (iv_ruleTypeField= ruleTypeField EOF )
            // InternalDomain.g:3185:2: iv_ruleTypeField= ruleTypeField EOF
            {
             newCompositeNode(grammarAccess.getTypeFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeField=ruleTypeField();

            state._fsp--;

             current =iv_ruleTypeField; 
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
    // $ANTLR end "entryRuleTypeField"


    // $ANTLR start "ruleTypeField"
    // InternalDomain.g:3191:1: ruleTypeField returns [EObject current=null] : ( ( ( rulePossiblyQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ) ;
    public final EObject ruleTypeField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_cardinality_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:3197:2: ( ( ( ( rulePossiblyQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ) )
            // InternalDomain.g:3198:2: ( ( ( rulePossiblyQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? )
            {
            // InternalDomain.g:3198:2: ( ( ( rulePossiblyQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? )
            // InternalDomain.g:3199:3: ( ( rulePossiblyQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )?
            {
            // InternalDomain.g:3199:3: ( ( rulePossiblyQualifiedName ) )
            // InternalDomain.g:3200:4: ( rulePossiblyQualifiedName )
            {
            // InternalDomain.g:3200:4: ( rulePossiblyQualifiedName )
            // InternalDomain.g:3201:5: rulePossiblyQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeFieldRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTypeFieldAccess().getIsTypeTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            rulePossiblyQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomain.g:3215:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:3216:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:3216:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:3217:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_59); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:3233:3: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=98 && LA63_0<=101)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalDomain.g:3234:4: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // InternalDomain.g:3234:4: (lv_cardinality_2_0= ruleCardinality )
                    // InternalDomain.g:3235:5: lv_cardinality_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getTypeFieldAccess().getCardinalityCardinalityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeFieldRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_2_0,
                    						"io.yaktor.Domain.Cardinality");
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
    // $ANTLR end "ruleTypeField"


    // $ANTLR start "entryRuleAnyField"
    // InternalDomain.g:3256:1: entryRuleAnyField returns [EObject current=null] : iv_ruleAnyField= ruleAnyField EOF ;
    public final EObject entryRuleAnyField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyField = null;


        try {
            // InternalDomain.g:3256:49: (iv_ruleAnyField= ruleAnyField EOF )
            // InternalDomain.g:3257:2: iv_ruleAnyField= ruleAnyField EOF
            {
             newCompositeNode(grammarAccess.getAnyFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyField=ruleAnyField();

            state._fsp--;

             current =iv_ruleAnyField; 
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
    // $ANTLR end "entryRuleAnyField"


    // $ANTLR start "ruleAnyField"
    // InternalDomain.g:3263:1: ruleAnyField returns [EObject current=null] : (otherlv_0= 'Any' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ) ;
    public final EObject ruleAnyField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Enumerator lv_cardinality_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:3269:2: ( (otherlv_0= 'Any' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ) )
            // InternalDomain.g:3270:2: (otherlv_0= 'Any' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? )
            {
            // InternalDomain.g:3270:2: (otherlv_0= 'Any' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? )
            // InternalDomain.g:3271:3: otherlv_0= 'Any' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnyFieldAccess().getAnyKeyword_0());
            		
            // InternalDomain.g:3275:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomain.g:3276:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomain.g:3276:4: (lv_name_1_0= RULE_ID )
            // InternalDomain.g:3277:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_59); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnyFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnyFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:3293:3: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=98 && LA64_0<=101)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDomain.g:3294:4: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // InternalDomain.g:3294:4: (lv_cardinality_2_0= ruleCardinality )
                    // InternalDomain.g:3295:5: lv_cardinality_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getAnyFieldAccess().getCardinalityCardinalityEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnyFieldRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_2_0,
                    						"io.yaktor.Domain.Cardinality");
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
    // $ANTLR end "ruleAnyField"


    // $ANTLR start "entryRuleEntityReferenceField"
    // InternalDomain.g:3316:1: entryRuleEntityReferenceField returns [EObject current=null] : iv_ruleEntityReferenceField= ruleEntityReferenceField EOF ;
    public final EObject entryRuleEntityReferenceField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityReferenceField = null;


        try {
            // InternalDomain.g:3316:61: (iv_ruleEntityReferenceField= ruleEntityReferenceField EOF )
            // InternalDomain.g:3317:2: iv_ruleEntityReferenceField= ruleEntityReferenceField EOF
            {
             newCompositeNode(grammarAccess.getEntityReferenceFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityReferenceField=ruleEntityReferenceField();

            state._fsp--;

             current =iv_ruleEntityReferenceField; 
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
    // $ANTLR end "entryRuleEntityReferenceField"


    // $ANTLR start "ruleEntityReferenceField"
    // InternalDomain.g:3323:1: ruleEntityReferenceField returns [EObject current=null] : (otherlv_0= 'ref' ( ( rulePossiblyQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) )? ) ;
    public final EObject ruleEntityReferenceField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Enumerator lv_cardinality_3_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:3329:2: ( (otherlv_0= 'ref' ( ( rulePossiblyQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) )? ) )
            // InternalDomain.g:3330:2: (otherlv_0= 'ref' ( ( rulePossiblyQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) )? )
            {
            // InternalDomain.g:3330:2: (otherlv_0= 'ref' ( ( rulePossiblyQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) )? )
            // InternalDomain.g:3331:3: otherlv_0= 'ref' ( ( rulePossiblyQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityReferenceFieldAccess().getRefKeyword_0());
            		
            // InternalDomain.g:3335:3: ( ( rulePossiblyQualifiedName ) )
            // InternalDomain.g:3336:4: ( rulePossiblyQualifiedName )
            {
            // InternalDomain.g:3336:4: ( rulePossiblyQualifiedName )
            // InternalDomain.g:3337:5: rulePossiblyQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityReferenceFieldRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntityReferenceFieldAccess().getRefTypeEntityCrossReference_1_0());
            				
            pushFollow(FOLLOW_3);
            rulePossiblyQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomain.g:3351:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDomain.g:3352:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDomain.g:3352:4: (lv_name_2_0= RULE_ID )
            // InternalDomain.g:3353:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_59); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEntityReferenceFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityReferenceFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomain.g:3369:3: ( (lv_cardinality_3_0= ruleCardinality ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=98 && LA65_0<=101)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalDomain.g:3370:4: (lv_cardinality_3_0= ruleCardinality )
                    {
                    // InternalDomain.g:3370:4: (lv_cardinality_3_0= ruleCardinality )
                    // InternalDomain.g:3371:5: lv_cardinality_3_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getEntityReferenceFieldAccess().getCardinalityCardinalityEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cardinality_3_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityReferenceFieldRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_3_0,
                    						"io.yaktor.Domain.Cardinality");
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
    // $ANTLR end "ruleEntityReferenceField"


    // $ANTLR start "entryRuleFloatingPointConst"
    // InternalDomain.g:3392:1: entryRuleFloatingPointConst returns [String current=null] : iv_ruleFloatingPointConst= ruleFloatingPointConst EOF ;
    public final String entryRuleFloatingPointConst() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPointConst = null;


        try {
            // InternalDomain.g:3392:58: (iv_ruleFloatingPointConst= ruleFloatingPointConst EOF )
            // InternalDomain.g:3393:2: iv_ruleFloatingPointConst= ruleFloatingPointConst EOF
            {
             newCompositeNode(grammarAccess.getFloatingPointConstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatingPointConst=ruleFloatingPointConst();

            state._fsp--;

             current =iv_ruleFloatingPointConst.getText(); 
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
    // $ANTLR end "entryRuleFloatingPointConst"


    // $ANTLR start "ruleFloatingPointConst"
    // InternalDomain.g:3399:1: ruleFloatingPointConst returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloatingPointConst() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalDomain.g:3405:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalDomain.g:3406:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalDomain.g:3406:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalDomain.g:3407:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalDomain.g:3407:3: (kw= '-' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==56) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDomain.g:3408:4: kw= '-'
                    {
                    kw=(Token)match(input,56,FOLLOW_60); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFloatingPointConstAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDomain.g:3414:3: (this_INT_1= RULE_INT )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_INT) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDomain.g:3415:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_61); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getFloatingPointConstAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,57,FOLLOW_62); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFloatingPointConstAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_63); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getFloatingPointConstAccess().getINTTerminalRuleCall_3());
            		
            // InternalDomain.g:3435:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=58 && LA70_0<=59)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalDomain.g:3436:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalDomain.g:3436:4: (kw= 'E' | kw= 'e' )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==58) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==59) ) {
                        alt68=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalDomain.g:3437:5: kw= 'E'
                            {
                            kw=(Token)match(input,58,FOLLOW_47); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFloatingPointConstAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDomain.g:3443:5: kw= 'e'
                            {
                            kw=(Token)match(input,59,FOLLOW_47); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFloatingPointConstAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDomain.g:3449:4: (kw= '-' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==56) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalDomain.g:3450:5: kw= '-'
                            {
                            kw=(Token)match(input,56,FOLLOW_62); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getFloatingPointConstAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getFloatingPointConstAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleFloatingPointConst"


    // $ANTLR start "entryRuleIntegerConst"
    // InternalDomain.g:3468:1: entryRuleIntegerConst returns [String current=null] : iv_ruleIntegerConst= ruleIntegerConst EOF ;
    public final String entryRuleIntegerConst() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerConst = null;


        try {
            // InternalDomain.g:3468:52: (iv_ruleIntegerConst= ruleIntegerConst EOF )
            // InternalDomain.g:3469:2: iv_ruleIntegerConst= ruleIntegerConst EOF
            {
             newCompositeNode(grammarAccess.getIntegerConstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerConst=ruleIntegerConst();

            state._fsp--;

             current =iv_ruleIntegerConst.getText(); 
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
    // $ANTLR end "entryRuleIntegerConst"


    // $ANTLR start "ruleIntegerConst"
    // InternalDomain.g:3475:1: ruleIntegerConst returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleIntegerConst() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDomain.g:3481:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDomain.g:3482:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDomain.g:3482:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDomain.g:3483:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDomain.g:3483:3: (kw= '-' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==56) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalDomain.g:3484:4: kw= '-'
                    {
                    kw=(Token)match(input,56,FOLLOW_62); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerConstAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getIntegerConstAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleIntegerConst"


    // $ANTLR start "entryRuleBooleanConst"
    // InternalDomain.g:3501:1: entryRuleBooleanConst returns [String current=null] : iv_ruleBooleanConst= ruleBooleanConst EOF ;
    public final String entryRuleBooleanConst() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanConst = null;


        try {
            // InternalDomain.g:3501:52: (iv_ruleBooleanConst= ruleBooleanConst EOF )
            // InternalDomain.g:3502:2: iv_ruleBooleanConst= ruleBooleanConst EOF
            {
             newCompositeNode(grammarAccess.getBooleanConstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanConst=ruleBooleanConst();

            state._fsp--;

             current =iv_ruleBooleanConst.getText(); 
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
    // $ANTLR end "entryRuleBooleanConst"


    // $ANTLR start "ruleBooleanConst"
    // InternalDomain.g:3508:1: ruleBooleanConst returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanConst() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDomain.g:3514:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDomain.g:3515:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDomain.g:3515:2: (kw= 'true' | kw= 'false' )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==60) ) {
                alt72=1;
            }
            else if ( (LA72_0==61) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalDomain.g:3516:3: kw= 'true'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanConstAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDomain.g:3522:3: kw= 'false'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanConstAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleBooleanConst"


    // $ANTLR start "entryRuleGenOptions"
    // InternalDomain.g:3531:1: entryRuleGenOptions returns [EObject current=null] : iv_ruleGenOptions= ruleGenOptions EOF ;
    public final EObject entryRuleGenOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenOptions = null;


        try {
            // InternalDomain.g:3531:51: (iv_ruleGenOptions= ruleGenOptions EOF )
            // InternalDomain.g:3532:2: iv_ruleGenOptions= ruleGenOptions EOF
            {
             newCompositeNode(grammarAccess.getGenOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenOptions=ruleGenOptions();

            state._fsp--;

             current =iv_ruleGenOptions; 
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
    // $ANTLR end "entryRuleGenOptions"


    // $ANTLR start "ruleGenOptions"
    // InternalDomain.g:3538:1: ruleGenOptions returns [EObject current=null] : (this_JpaGenOptions_0= ruleJpaGenOptions | this_MongoNodeGenOptions_1= ruleMongoNodeGenOptions ) ;
    public final EObject ruleGenOptions() throws RecognitionException {
        EObject current = null;

        EObject this_JpaGenOptions_0 = null;

        EObject this_MongoNodeGenOptions_1 = null;



        	enterRule();

        try {
            // InternalDomain.g:3544:2: ( (this_JpaGenOptions_0= ruleJpaGenOptions | this_MongoNodeGenOptions_1= ruleMongoNodeGenOptions ) )
            // InternalDomain.g:3545:2: (this_JpaGenOptions_0= ruleJpaGenOptions | this_MongoNodeGenOptions_1= ruleMongoNodeGenOptions )
            {
            // InternalDomain.g:3545:2: (this_JpaGenOptions_0= ruleJpaGenOptions | this_MongoNodeGenOptions_1= ruleMongoNodeGenOptions )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==62) ) {
                alt73=1;
            }
            else if ( (LA73_0==85) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalDomain.g:3546:3: this_JpaGenOptions_0= ruleJpaGenOptions
                    {

                    			newCompositeNode(grammarAccess.getGenOptionsAccess().getJpaGenOptionsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JpaGenOptions_0=ruleJpaGenOptions();

                    state._fsp--;


                    			current = this_JpaGenOptions_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomain.g:3555:3: this_MongoNodeGenOptions_1= ruleMongoNodeGenOptions
                    {

                    			newCompositeNode(grammarAccess.getGenOptionsAccess().getMongoNodeGenOptionsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MongoNodeGenOptions_1=ruleMongoNodeGenOptions();

                    state._fsp--;


                    			current = this_MongoNodeGenOptions_1;
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
    // $ANTLR end "ruleGenOptions"


    // $ANTLR start "entryRuleJpaGenOptions"
    // InternalDomain.g:3567:1: entryRuleJpaGenOptions returns [EObject current=null] : iv_ruleJpaGenOptions= ruleJpaGenOptions EOF ;
    public final EObject entryRuleJpaGenOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJpaGenOptions = null;


        try {
            // InternalDomain.g:3567:54: (iv_ruleJpaGenOptions= ruleJpaGenOptions EOF )
            // InternalDomain.g:3568:2: iv_ruleJpaGenOptions= ruleJpaGenOptions EOF
            {
             newCompositeNode(grammarAccess.getJpaGenOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJpaGenOptions=ruleJpaGenOptions();

            state._fsp--;

             current =iv_ruleJpaGenOptions; 
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
    // $ANTLR end "entryRuleJpaGenOptions"


    // $ANTLR start "ruleJpaGenOptions"
    // InternalDomain.g:3574:1: ruleJpaGenOptions returns [EObject current=null] : (otherlv_0= 'jpa-gen-options' otherlv_1= '{' ( (lv_project_2_0= ruleProjectOptions ) ) ( (lv_persistence_3_0= rulePersistenceOptions ) )? ( (lv_generationInclusion_4_0= ruleGenerationInclusion ) )? ( (lv_useAspects_5_0= 'use-aspects' ) )? ( (lv_metaData_6_0= 'auditable' ) )? (otherlv_7= 'extensions' otherlv_8= '{' ( (lv_tableOptions_9_0= ruleJpaTableOptions ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleJpaGenOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_useAspects_5_0=null;
        Token lv_metaData_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_project_2_0 = null;

        EObject lv_persistence_3_0 = null;

        EObject lv_generationInclusion_4_0 = null;

        EObject lv_tableOptions_9_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:3580:2: ( (otherlv_0= 'jpa-gen-options' otherlv_1= '{' ( (lv_project_2_0= ruleProjectOptions ) ) ( (lv_persistence_3_0= rulePersistenceOptions ) )? ( (lv_generationInclusion_4_0= ruleGenerationInclusion ) )? ( (lv_useAspects_5_0= 'use-aspects' ) )? ( (lv_metaData_6_0= 'auditable' ) )? (otherlv_7= 'extensions' otherlv_8= '{' ( (lv_tableOptions_9_0= ruleJpaTableOptions ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalDomain.g:3581:2: (otherlv_0= 'jpa-gen-options' otherlv_1= '{' ( (lv_project_2_0= ruleProjectOptions ) ) ( (lv_persistence_3_0= rulePersistenceOptions ) )? ( (lv_generationInclusion_4_0= ruleGenerationInclusion ) )? ( (lv_useAspects_5_0= 'use-aspects' ) )? ( (lv_metaData_6_0= 'auditable' ) )? (otherlv_7= 'extensions' otherlv_8= '{' ( (lv_tableOptions_9_0= ruleJpaTableOptions ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalDomain.g:3581:2: (otherlv_0= 'jpa-gen-options' otherlv_1= '{' ( (lv_project_2_0= ruleProjectOptions ) ) ( (lv_persistence_3_0= rulePersistenceOptions ) )? ( (lv_generationInclusion_4_0= ruleGenerationInclusion ) )? ( (lv_useAspects_5_0= 'use-aspects' ) )? ( (lv_metaData_6_0= 'auditable' ) )? (otherlv_7= 'extensions' otherlv_8= '{' ( (lv_tableOptions_9_0= ruleJpaTableOptions ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalDomain.g:3582:3: otherlv_0= 'jpa-gen-options' otherlv_1= '{' ( (lv_project_2_0= ruleProjectOptions ) ) ( (lv_persistence_3_0= rulePersistenceOptions ) )? ( (lv_generationInclusion_4_0= ruleGenerationInclusion ) )? ( (lv_useAspects_5_0= 'use-aspects' ) )? ( (lv_metaData_6_0= 'auditable' ) )? (otherlv_7= 'extensions' otherlv_8= '{' ( (lv_tableOptions_9_0= ruleJpaTableOptions ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getJpaGenOptionsAccess().getJpaGenOptionsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getJpaGenOptionsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDomain.g:3590:3: ( (lv_project_2_0= ruleProjectOptions ) )
            // InternalDomain.g:3591:4: (lv_project_2_0= ruleProjectOptions )
            {
            // InternalDomain.g:3591:4: (lv_project_2_0= ruleProjectOptions )
            // InternalDomain.g:3592:5: lv_project_2_0= ruleProjectOptions
            {

            					newCompositeNode(grammarAccess.getJpaGenOptionsAccess().getProjectProjectOptionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_65);
            lv_project_2_0=ruleProjectOptions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJpaGenOptionsRule());
            					}
            					set(
            						current,
            						"project",
            						lv_project_2_0,
            						"io.yaktor.Domain.ProjectOptions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomain.g:3609:3: ( (lv_persistence_3_0= rulePersistenceOptions ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==91) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalDomain.g:3610:4: (lv_persistence_3_0= rulePersistenceOptions )
                    {
                    // InternalDomain.g:3610:4: (lv_persistence_3_0= rulePersistenceOptions )
                    // InternalDomain.g:3611:5: lv_persistence_3_0= rulePersistenceOptions
                    {

                    					newCompositeNode(grammarAccess.getJpaGenOptionsAccess().getPersistencePersistenceOptionsParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_66);
                    lv_persistence_3_0=rulePersistenceOptions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJpaGenOptionsRule());
                    					}
                    					set(
                    						current,
                    						"persistence",
                    						lv_persistence_3_0,
                    						"io.yaktor.Domain.PersistenceOptions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:3628:3: ( (lv_generationInclusion_4_0= ruleGenerationInclusion ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==71) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalDomain.g:3629:4: (lv_generationInclusion_4_0= ruleGenerationInclusion )
                    {
                    // InternalDomain.g:3629:4: (lv_generationInclusion_4_0= ruleGenerationInclusion )
                    // InternalDomain.g:3630:5: lv_generationInclusion_4_0= ruleGenerationInclusion
                    {

                    					newCompositeNode(grammarAccess.getJpaGenOptionsAccess().getGenerationInclusionGenerationInclusionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_67);
                    lv_generationInclusion_4_0=ruleGenerationInclusion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJpaGenOptionsRule());
                    					}
                    					set(
                    						current,
                    						"generationInclusion",
                    						lv_generationInclusion_4_0,
                    						"io.yaktor.Domain.GenerationInclusion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:3647:3: ( (lv_useAspects_5_0= 'use-aspects' ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==63) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalDomain.g:3648:4: (lv_useAspects_5_0= 'use-aspects' )
                    {
                    // InternalDomain.g:3648:4: (lv_useAspects_5_0= 'use-aspects' )
                    // InternalDomain.g:3649:5: lv_useAspects_5_0= 'use-aspects'
                    {
                    lv_useAspects_5_0=(Token)match(input,63,FOLLOW_68); 

                    					newLeafNode(lv_useAspects_5_0, grammarAccess.getJpaGenOptionsAccess().getUseAspectsUseAspectsKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJpaGenOptionsRule());
                    					}
                    					setWithLastConsumed(current, "useAspects", lv_useAspects_5_0 != null, "use-aspects");
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:3661:3: ( (lv_metaData_6_0= 'auditable' ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==27) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalDomain.g:3662:4: (lv_metaData_6_0= 'auditable' )
                    {
                    // InternalDomain.g:3662:4: (lv_metaData_6_0= 'auditable' )
                    // InternalDomain.g:3663:5: lv_metaData_6_0= 'auditable'
                    {
                    lv_metaData_6_0=(Token)match(input,27,FOLLOW_69); 

                    					newLeafNode(lv_metaData_6_0, grammarAccess.getJpaGenOptionsAccess().getMetaDataAuditableKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJpaGenOptionsRule());
                    					}
                    					setWithLastConsumed(current, "metaData", lv_metaData_6_0 != null, "auditable");
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:3675:3: (otherlv_7= 'extensions' otherlv_8= '{' ( (lv_tableOptions_9_0= ruleJpaTableOptions ) )* otherlv_10= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==64) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalDomain.g:3676:4: otherlv_7= 'extensions' otherlv_8= '{' ( (lv_tableOptions_9_0= ruleJpaTableOptions ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,64,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getJpaGenOptionsAccess().getExtensionsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,13,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getJpaGenOptionsAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalDomain.g:3684:4: ( (lv_tableOptions_9_0= ruleJpaTableOptions ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==RULE_ID) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalDomain.g:3685:5: (lv_tableOptions_9_0= ruleJpaTableOptions )
                    	    {
                    	    // InternalDomain.g:3685:5: (lv_tableOptions_9_0= ruleJpaTableOptions )
                    	    // InternalDomain.g:3686:6: lv_tableOptions_9_0= ruleJpaTableOptions
                    	    {

                    	    						newCompositeNode(grammarAccess.getJpaGenOptionsAccess().getTableOptionsJpaTableOptionsParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_tableOptions_9_0=ruleJpaTableOptions();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getJpaGenOptionsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tableOptions",
                    	    							lv_tableOptions_9_0,
                    	    							"io.yaktor.Domain.JpaTableOptions");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getJpaGenOptionsAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getJpaGenOptionsAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleJpaGenOptions"


    // $ANTLR start "entryRuleProjectOptions"
    // InternalDomain.g:3716:1: entryRuleProjectOptions returns [EObject current=null] : iv_ruleProjectOptions= ruleProjectOptions EOF ;
    public final EObject entryRuleProjectOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectOptions = null;


        try {
            // InternalDomain.g:3716:55: (iv_ruleProjectOptions= ruleProjectOptions EOF )
            // InternalDomain.g:3717:2: iv_ruleProjectOptions= ruleProjectOptions EOF
            {
             newCompositeNode(grammarAccess.getProjectOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectOptions=ruleProjectOptions();

            state._fsp--;

             current =iv_ruleProjectOptions; 
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
    // $ANTLR end "entryRuleProjectOptions"


    // $ANTLR start "ruleProjectOptions"
    // InternalDomain.g:3723:1: ruleProjectOptions returns [EObject current=null] : (otherlv_0= 'project-options' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) ;
    public final EObject ruleProjectOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_jsonSupport_11_0=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_rootPackage_6_0 = null;

        AntlrDatatypeRuleToken lv_domainSubpackage_8_0 = null;

        AntlrDatatypeRuleToken lv_controllerSubpackage_10_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:3729:2: ( (otherlv_0= 'project-options' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) )
            // InternalDomain.g:3730:2: (otherlv_0= 'project-options' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            {
            // InternalDomain.g:3730:2: (otherlv_0= 'project-options' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            // InternalDomain.g:3731:3: otherlv_0= 'project-options' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectOptionsAccess().getProjectOptionsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_70); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectOptionsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDomain.g:3739:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) ) ) )+ {...}?) ) )
            // InternalDomain.g:3740:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) ) ) )+ {...}?) )
            {
            // InternalDomain.g:3740:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) ) ) )+ {...}?) )
            // InternalDomain.g:3741:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2());
            				
            // InternalDomain.g:3744:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) ) ) )+ {...}?)
            // InternalDomain.g:3745:6: ( ({...}? => ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) ) ) )+ {...}?
            {
            // InternalDomain.g:3745:6: ( ({...}? => ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) ) ) )+
            int cnt80=0;
            loop80:
            do {
                int alt80=6;
                int LA80_0 = input.LA(1);

                if ( LA80_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 0) ) {
                    alt80=1;
                }
                else if ( LA80_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 1) ) {
                    alt80=2;
                }
                else if ( LA80_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 2) ) {
                    alt80=3;
                }
                else if ( LA80_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 3) ) {
                    alt80=4;
                }
                else if ( LA80_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 4) ) {
                    alt80=5;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalDomain.g:3746:4: ({...}? => ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:3746:4: ({...}? => ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) ) )
            	    // InternalDomain.g:3747:5: {...}? => ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleProjectOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalDomain.g:3747:111: ( ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) ) )
            	    // InternalDomain.g:3748:6: ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalDomain.g:3751:9: ({...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) ) )
            	    // InternalDomain.g:3751:10: {...}? => (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProjectOptions", "true");
            	    }
            	    // InternalDomain.g:3751:19: (otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) ) )
            	    // InternalDomain.g:3751:20: otherlv_3= 'project-name' ( (lv_name_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,66,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getProjectOptionsAccess().getProjectNameKeyword_2_0_0());
            	    								
            	    // InternalDomain.g:3755:9: ( (lv_name_4_0= RULE_ID ) )
            	    // InternalDomain.g:3756:10: (lv_name_4_0= RULE_ID )
            	    {
            	    // InternalDomain.g:3756:10: (lv_name_4_0= RULE_ID )
            	    // InternalDomain.g:3757:11: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_71); 

            	    											newLeafNode(lv_name_4_0, grammarAccess.getProjectOptionsAccess().getNameIDTerminalRuleCall_2_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getProjectOptionsRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"name",
            	    												lv_name_4_0,
            	    												"org.eclipse.xtext.common.Terminals.ID");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomain.g:3779:4: ({...}? => ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:3779:4: ({...}? => ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) ) )
            	    // InternalDomain.g:3780:5: {...}? => ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleProjectOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalDomain.g:3780:111: ( ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) ) )
            	    // InternalDomain.g:3781:6: ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalDomain.g:3784:9: ({...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) ) )
            	    // InternalDomain.g:3784:10: {...}? => (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProjectOptions", "true");
            	    }
            	    // InternalDomain.g:3784:19: (otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) ) )
            	    // InternalDomain.g:3784:20: otherlv_5= 'root-package' ( (lv_rootPackage_6_0= ruleQualifiedName ) )
            	    {
            	    otherlv_5=(Token)match(input,67,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getProjectOptionsAccess().getRootPackageKeyword_2_1_0());
            	    								
            	    // InternalDomain.g:3788:9: ( (lv_rootPackage_6_0= ruleQualifiedName ) )
            	    // InternalDomain.g:3789:10: (lv_rootPackage_6_0= ruleQualifiedName )
            	    {
            	    // InternalDomain.g:3789:10: (lv_rootPackage_6_0= ruleQualifiedName )
            	    // InternalDomain.g:3790:11: lv_rootPackage_6_0= ruleQualifiedName
            	    {

            	    											newCompositeNode(grammarAccess.getProjectOptionsAccess().getRootPackageQualifiedNameParserRuleCall_2_1_1_0());
            	    										
            	    pushFollow(FOLLOW_71);
            	    lv_rootPackage_6_0=ruleQualifiedName();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getProjectOptionsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"rootPackage",
            	    												lv_rootPackage_6_0,
            	    												"io.yaktor.Domain.QualifiedName");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDomain.g:3813:4: ({...}? => ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:3813:4: ({...}? => ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) ) )
            	    // InternalDomain.g:3814:5: {...}? => ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleProjectOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalDomain.g:3814:111: ( ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) ) )
            	    // InternalDomain.g:3815:6: ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalDomain.g:3818:9: ({...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) ) )
            	    // InternalDomain.g:3818:10: {...}? => (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProjectOptions", "true");
            	    }
            	    // InternalDomain.g:3818:19: (otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) ) )
            	    // InternalDomain.g:3818:20: otherlv_7= 'domain-subpackage' ( (lv_domainSubpackage_8_0= ruleQualifiedName ) )
            	    {
            	    otherlv_7=(Token)match(input,68,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getProjectOptionsAccess().getDomainSubpackageKeyword_2_2_0());
            	    								
            	    // InternalDomain.g:3822:9: ( (lv_domainSubpackage_8_0= ruleQualifiedName ) )
            	    // InternalDomain.g:3823:10: (lv_domainSubpackage_8_0= ruleQualifiedName )
            	    {
            	    // InternalDomain.g:3823:10: (lv_domainSubpackage_8_0= ruleQualifiedName )
            	    // InternalDomain.g:3824:11: lv_domainSubpackage_8_0= ruleQualifiedName
            	    {

            	    											newCompositeNode(grammarAccess.getProjectOptionsAccess().getDomainSubpackageQualifiedNameParserRuleCall_2_2_1_0());
            	    										
            	    pushFollow(FOLLOW_71);
            	    lv_domainSubpackage_8_0=ruleQualifiedName();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getProjectOptionsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"domainSubpackage",
            	    												lv_domainSubpackage_8_0,
            	    												"io.yaktor.Domain.QualifiedName");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDomain.g:3847:4: ({...}? => ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:3847:4: ({...}? => ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) ) )
            	    // InternalDomain.g:3848:5: {...}? => ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleProjectOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalDomain.g:3848:111: ( ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) ) )
            	    // InternalDomain.g:3849:6: ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalDomain.g:3852:9: ({...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) ) )
            	    // InternalDomain.g:3852:10: {...}? => (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProjectOptions", "true");
            	    }
            	    // InternalDomain.g:3852:19: (otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) ) )
            	    // InternalDomain.g:3852:20: otherlv_9= 'controller-subpackage' ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) )
            	    {
            	    otherlv_9=(Token)match(input,69,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getProjectOptionsAccess().getControllerSubpackageKeyword_2_3_0());
            	    								
            	    // InternalDomain.g:3856:9: ( (lv_controllerSubpackage_10_0= ruleQualifiedName ) )
            	    // InternalDomain.g:3857:10: (lv_controllerSubpackage_10_0= ruleQualifiedName )
            	    {
            	    // InternalDomain.g:3857:10: (lv_controllerSubpackage_10_0= ruleQualifiedName )
            	    // InternalDomain.g:3858:11: lv_controllerSubpackage_10_0= ruleQualifiedName
            	    {

            	    											newCompositeNode(grammarAccess.getProjectOptionsAccess().getControllerSubpackageQualifiedNameParserRuleCall_2_3_1_0());
            	    										
            	    pushFollow(FOLLOW_71);
            	    lv_controllerSubpackage_10_0=ruleQualifiedName();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getProjectOptionsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"controllerSubpackage",
            	    												lv_controllerSubpackage_10_0,
            	    												"io.yaktor.Domain.QualifiedName");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDomain.g:3881:4: ({...}? => ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) ) )
            	    {
            	    // InternalDomain.g:3881:4: ({...}? => ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) ) )
            	    // InternalDomain.g:3882:5: {...}? => ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleProjectOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalDomain.g:3882:111: ( ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) ) )
            	    // InternalDomain.g:3883:6: ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalDomain.g:3886:9: ({...}? => ( (lv_jsonSupport_11_0= 'json-support' ) ) )
            	    // InternalDomain.g:3886:10: {...}? => ( (lv_jsonSupport_11_0= 'json-support' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProjectOptions", "true");
            	    }
            	    // InternalDomain.g:3886:19: ( (lv_jsonSupport_11_0= 'json-support' ) )
            	    // InternalDomain.g:3886:20: (lv_jsonSupport_11_0= 'json-support' )
            	    {
            	    // InternalDomain.g:3886:20: (lv_jsonSupport_11_0= 'json-support' )
            	    // InternalDomain.g:3887:10: lv_jsonSupport_11_0= 'json-support'
            	    {
            	    lv_jsonSupport_11_0=(Token)match(input,70,FOLLOW_71); 

            	    										newLeafNode(lv_jsonSupport_11_0, grammarAccess.getProjectOptionsAccess().getJsonSupportJsonSupportKeyword_2_4_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getProjectOptionsRule());
            	    										}
            	    										setWithLastConsumed(current, "jsonSupport", lv_jsonSupport_11_0 != null, "json-support");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt80 >= 1 ) break loop80;
                        EarlyExitException eee =
                            new EarlyExitException(80, input);
                        throw eee;
                }
                cnt80++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleProjectOptions", "getUnorderedGroupHelper().canLeave(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getProjectOptionsAccess().getUnorderedGroup_2());
            				

            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getProjectOptionsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleProjectOptions"


    // $ANTLR start "entryRuleGenerationInclusion"
    // InternalDomain.g:3920:1: entryRuleGenerationInclusion returns [EObject current=null] : iv_ruleGenerationInclusion= ruleGenerationInclusion EOF ;
    public final EObject entryRuleGenerationInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerationInclusion = null;


        try {
            // InternalDomain.g:3920:60: (iv_ruleGenerationInclusion= ruleGenerationInclusion EOF )
            // InternalDomain.g:3921:2: iv_ruleGenerationInclusion= ruleGenerationInclusion EOF
            {
             newCompositeNode(grammarAccess.getGenerationInclusionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenerationInclusion=ruleGenerationInclusion();

            state._fsp--;

             current =iv_ruleGenerationInclusion; 
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
    // $ANTLR end "entryRuleGenerationInclusion"


    // $ANTLR start "ruleGenerationInclusion"
    // InternalDomain.g:3927:1: ruleGenerationInclusion returns [EObject current=null] : (otherlv_0= 'generation-inclusion' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' ) ;
    public final EObject ruleGenerationInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Enumerator lv_types_4_0 = null;

        Enumerator lv_controller_6_0 = null;

        Enumerator lv_resources_8_0 = null;

        Enumerator lv_properties_10_0 = null;

        Enumerator lv_views_12_0 = null;

        Enumerator lv_webxml_14_0 = null;

        Enumerator lv_pom_16_0 = null;

        Enumerator lv_styles_18_0 = null;

        Enumerator lv_classes_20_0 = null;

        Enumerator lv_layouts_22_0 = null;

        Enumerator lv_webmvc_24_0 = null;

        Enumerator lv_tags_26_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:3933:2: ( (otherlv_0= 'generation-inclusion' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' ) )
            // InternalDomain.g:3934:2: (otherlv_0= 'generation-inclusion' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' )
            {
            // InternalDomain.g:3934:2: (otherlv_0= 'generation-inclusion' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' )
            // InternalDomain.g:3935:3: otherlv_0= 'generation-inclusion' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) ) ) )+ {...}?) ) ) otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGenerationInclusionAccess().getGenerationInclusionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_72); 

            			newLeafNode(otherlv_1, grammarAccess.getGenerationInclusionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDomain.g:3943:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) ) ) )+ {...}?) ) )
            // InternalDomain.g:3944:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalDomain.g:3944:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) ) ) )+ {...}?) )
            // InternalDomain.g:3945:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2());
            				
            // InternalDomain.g:3948:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) ) ) )+ {...}?)
            // InternalDomain.g:3949:6: ( ({...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) ) ) )+ {...}?
            {
            // InternalDomain.g:3949:6: ( ({...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) ) ) )+
            int cnt81=0;
            loop81:
            do {
                int alt81=13;
                alt81 = dfa81.predict(input);
                switch (alt81) {
            	case 1 :
            	    // InternalDomain.g:3950:4: ({...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:3950:4: ({...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) ) )
            	    // InternalDomain.g:3951:5: {...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalDomain.g:3951:116: ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) )
            	    // InternalDomain.g:3952:6: ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalDomain.g:3955:9: ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) )
            	    // InternalDomain.g:3955:10: {...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "true");
            	    }
            	    // InternalDomain.g:3955:19: (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) )
            	    // InternalDomain.g:3955:20: otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) )
            	    {
            	    otherlv_3=(Token)match(input,72,FOLLOW_73); 

            	    									newLeafNode(otherlv_3, grammarAccess.getGenerationInclusionAccess().getTypesKeyword_2_0_0());
            	    								
            	    // InternalDomain.g:3959:9: ( (lv_types_4_0= ruleInclusionType ) )
            	    // InternalDomain.g:3960:10: (lv_types_4_0= ruleInclusionType )
            	    {
            	    // InternalDomain.g:3960:10: (lv_types_4_0= ruleInclusionType )
            	    // InternalDomain.g:3961:11: lv_types_4_0= ruleInclusionType
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationInclusionAccess().getTypesInclusionTypeEnumRuleCall_2_0_1_0());
            	    										
            	    pushFollow(FOLLOW_74);
            	    lv_types_4_0=ruleInclusionType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationInclusionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"types",
            	    												lv_types_4_0,
            	    												"io.yaktor.Domain.InclusionType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomain.g:3984:4: ({...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:3984:4: ({...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) ) )
            	    // InternalDomain.g:3985:5: {...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalDomain.g:3985:116: ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) )
            	    // InternalDomain.g:3986:6: ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalDomain.g:3989:9: ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) )
            	    // InternalDomain.g:3989:10: {...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "true");
            	    }
            	    // InternalDomain.g:3989:19: (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) )
            	    // InternalDomain.g:3989:20: otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) )
            	    {
            	    otherlv_5=(Token)match(input,73,FOLLOW_73); 

            	    									newLeafNode(otherlv_5, grammarAccess.getGenerationInclusionAccess().getControllerKeyword_2_1_0());
            	    								
            	    // InternalDomain.g:3993:9: ( (lv_controller_6_0= ruleInclusionType ) )
            	    // InternalDomain.g:3994:10: (lv_controller_6_0= ruleInclusionType )
            	    {
            	    // InternalDomain.g:3994:10: (lv_controller_6_0= ruleInclusionType )
            	    // InternalDomain.g:3995:11: lv_controller_6_0= ruleInclusionType
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationInclusionAccess().getControllerInclusionTypeEnumRuleCall_2_1_1_0());
            	    										
            	    pushFollow(FOLLOW_74);
            	    lv_controller_6_0=ruleInclusionType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationInclusionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"controller",
            	    												lv_controller_6_0,
            	    												"io.yaktor.Domain.InclusionType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDomain.g:4018:4: ({...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4018:4: ({...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) ) )
            	    // InternalDomain.g:4019:5: {...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalDomain.g:4019:116: ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) )
            	    // InternalDomain.g:4020:6: ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalDomain.g:4023:9: ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) )
            	    // InternalDomain.g:4023:10: {...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "true");
            	    }
            	    // InternalDomain.g:4023:19: (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) )
            	    // InternalDomain.g:4023:20: otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) )
            	    {
            	    otherlv_7=(Token)match(input,74,FOLLOW_73); 

            	    									newLeafNode(otherlv_7, grammarAccess.getGenerationInclusionAccess().getResourcesKeyword_2_2_0());
            	    								
            	    // InternalDomain.g:4027:9: ( (lv_resources_8_0= ruleInclusionType ) )
            	    // InternalDomain.g:4028:10: (lv_resources_8_0= ruleInclusionType )
            	    {
            	    // InternalDomain.g:4028:10: (lv_resources_8_0= ruleInclusionType )
            	    // InternalDomain.g:4029:11: lv_resources_8_0= ruleInclusionType
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationInclusionAccess().getResourcesInclusionTypeEnumRuleCall_2_2_1_0());
            	    										
            	    pushFollow(FOLLOW_74);
            	    lv_resources_8_0=ruleInclusionType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationInclusionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"resources",
            	    												lv_resources_8_0,
            	    												"io.yaktor.Domain.InclusionType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDomain.g:4052:4: ({...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4052:4: ({...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) ) )
            	    // InternalDomain.g:4053:5: {...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalDomain.g:4053:116: ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) )
            	    // InternalDomain.g:4054:6: ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalDomain.g:4057:9: ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) )
            	    // InternalDomain.g:4057:10: {...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "true");
            	    }
            	    // InternalDomain.g:4057:19: (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) )
            	    // InternalDomain.g:4057:20: otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) )
            	    {
            	    otherlv_9=(Token)match(input,75,FOLLOW_73); 

            	    									newLeafNode(otherlv_9, grammarAccess.getGenerationInclusionAccess().getPropertiesKeyword_2_3_0());
            	    								
            	    // InternalDomain.g:4061:9: ( (lv_properties_10_0= ruleInclusionType ) )
            	    // InternalDomain.g:4062:10: (lv_properties_10_0= ruleInclusionType )
            	    {
            	    // InternalDomain.g:4062:10: (lv_properties_10_0= ruleInclusionType )
            	    // InternalDomain.g:4063:11: lv_properties_10_0= ruleInclusionType
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationInclusionAccess().getPropertiesInclusionTypeEnumRuleCall_2_3_1_0());
            	    										
            	    pushFollow(FOLLOW_74);
            	    lv_properties_10_0=ruleInclusionType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationInclusionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"properties",
            	    												lv_properties_10_0,
            	    												"io.yaktor.Domain.InclusionType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDomain.g:4086:4: ({...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4086:4: ({...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) ) )
            	    // InternalDomain.g:4087:5: {...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalDomain.g:4087:116: ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) )
            	    // InternalDomain.g:4088:6: ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalDomain.g:4091:9: ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) )
            	    // InternalDomain.g:4091:10: {...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "true");
            	    }
            	    // InternalDomain.g:4091:19: (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) )
            	    // InternalDomain.g:4091:20: otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) )
            	    {
            	    otherlv_11=(Token)match(input,76,FOLLOW_73); 

            	    									newLeafNode(otherlv_11, grammarAccess.getGenerationInclusionAccess().getViewsKeyword_2_4_0());
            	    								
            	    // InternalDomain.g:4095:9: ( (lv_views_12_0= ruleInclusionType ) )
            	    // InternalDomain.g:4096:10: (lv_views_12_0= ruleInclusionType )
            	    {
            	    // InternalDomain.g:4096:10: (lv_views_12_0= ruleInclusionType )
            	    // InternalDomain.g:4097:11: lv_views_12_0= ruleInclusionType
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationInclusionAccess().getViewsInclusionTypeEnumRuleCall_2_4_1_0());
            	    										
            	    pushFollow(FOLLOW_74);
            	    lv_views_12_0=ruleInclusionType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationInclusionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"views",
            	    												lv_views_12_0,
            	    												"io.yaktor.Domain.InclusionType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalDomain.g:4120:4: ({...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4120:4: ({...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) ) )
            	    // InternalDomain.g:4121:5: {...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalDomain.g:4121:116: ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) )
            	    // InternalDomain.g:4122:6: ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalDomain.g:4125:9: ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) )
            	    // InternalDomain.g:4125:10: {...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "true");
            	    }
            	    // InternalDomain.g:4125:19: (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) )
            	    // InternalDomain.g:4125:20: otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) )
            	    {
            	    otherlv_13=(Token)match(input,77,FOLLOW_73); 

            	    									newLeafNode(otherlv_13, grammarAccess.getGenerationInclusionAccess().getWebXmlKeyword_2_5_0());
            	    								
            	    // InternalDomain.g:4129:9: ( (lv_webxml_14_0= ruleInclusionType ) )
            	    // InternalDomain.g:4130:10: (lv_webxml_14_0= ruleInclusionType )
            	    {
            	    // InternalDomain.g:4130:10: (lv_webxml_14_0= ruleInclusionType )
            	    // InternalDomain.g:4131:11: lv_webxml_14_0= ruleInclusionType
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationInclusionAccess().getWebxmlInclusionTypeEnumRuleCall_2_5_1_0());
            	    										
            	    pushFollow(FOLLOW_74);
            	    lv_webxml_14_0=ruleInclusionType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationInclusionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"webxml",
            	    												lv_webxml_14_0,
            	    												"io.yaktor.Domain.InclusionType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalDomain.g:4154:4: ({...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4154:4: ({...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) ) )
            	    // InternalDomain.g:4155:5: {...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalDomain.g:4155:116: ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) )
            	    // InternalDomain.g:4156:6: ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalDomain.g:4159:9: ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) )
            	    // InternalDomain.g:4159:10: {...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "true");
            	    }
            	    // InternalDomain.g:4159:19: (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) )
            	    // InternalDomain.g:4159:20: otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) )
            	    {
            	    otherlv_15=(Token)match(input,78,FOLLOW_73); 

            	    									newLeafNode(otherlv_15, grammarAccess.getGenerationInclusionAccess().getPomKeyword_2_6_0());
            	    								
            	    // InternalDomain.g:4163:9: ( (lv_pom_16_0= ruleInclusionType ) )
            	    // InternalDomain.g:4164:10: (lv_pom_16_0= ruleInclusionType )
            	    {
            	    // InternalDomain.g:4164:10: (lv_pom_16_0= ruleInclusionType )
            	    // InternalDomain.g:4165:11: lv_pom_16_0= ruleInclusionType
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationInclusionAccess().getPomInclusionTypeEnumRuleCall_2_6_1_0());
            	    										
            	    pushFollow(FOLLOW_74);
            	    lv_pom_16_0=ruleInclusionType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationInclusionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"pom",
            	    												lv_pom_16_0,
            	    												"io.yaktor.Domain.InclusionType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalDomain.g:4188:4: ({...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4188:4: ({...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) ) )
            	    // InternalDomain.g:4189:5: {...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalDomain.g:4189:116: ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) )
            	    // InternalDomain.g:4190:6: ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalDomain.g:4193:9: ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) )
            	    // InternalDomain.g:4193:10: {...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "true");
            	    }
            	    // InternalDomain.g:4193:19: (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) )
            	    // InternalDomain.g:4193:20: otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) )
            	    {
            	    otherlv_17=(Token)match(input,79,FOLLOW_73); 

            	    									newLeafNode(otherlv_17, grammarAccess.getGenerationInclusionAccess().getStylesKeyword_2_7_0());
            	    								
            	    // InternalDomain.g:4197:9: ( (lv_styles_18_0= ruleInclusionType ) )
            	    // InternalDomain.g:4198:10: (lv_styles_18_0= ruleInclusionType )
            	    {
            	    // InternalDomain.g:4198:10: (lv_styles_18_0= ruleInclusionType )
            	    // InternalDomain.g:4199:11: lv_styles_18_0= ruleInclusionType
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationInclusionAccess().getStylesInclusionTypeEnumRuleCall_2_7_1_0());
            	    										
            	    pushFollow(FOLLOW_74);
            	    lv_styles_18_0=ruleInclusionType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationInclusionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"styles",
            	    												lv_styles_18_0,
            	    												"io.yaktor.Domain.InclusionType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalDomain.g:4222:4: ({...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4222:4: ({...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) ) )
            	    // InternalDomain.g:4223:5: {...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalDomain.g:4223:116: ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) )
            	    // InternalDomain.g:4224:6: ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalDomain.g:4227:9: ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) )
            	    // InternalDomain.g:4227:10: {...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "true");
            	    }
            	    // InternalDomain.g:4227:19: (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) )
            	    // InternalDomain.g:4227:20: otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) )
            	    {
            	    otherlv_19=(Token)match(input,80,FOLLOW_73); 

            	    									newLeafNode(otherlv_19, grammarAccess.getGenerationInclusionAccess().getClassesKeyword_2_8_0());
            	    								
            	    // InternalDomain.g:4231:9: ( (lv_classes_20_0= ruleInclusionType ) )
            	    // InternalDomain.g:4232:10: (lv_classes_20_0= ruleInclusionType )
            	    {
            	    // InternalDomain.g:4232:10: (lv_classes_20_0= ruleInclusionType )
            	    // InternalDomain.g:4233:11: lv_classes_20_0= ruleInclusionType
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationInclusionAccess().getClassesInclusionTypeEnumRuleCall_2_8_1_0());
            	    										
            	    pushFollow(FOLLOW_74);
            	    lv_classes_20_0=ruleInclusionType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationInclusionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"classes",
            	    												lv_classes_20_0,
            	    												"io.yaktor.Domain.InclusionType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalDomain.g:4256:4: ({...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4256:4: ({...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) ) )
            	    // InternalDomain.g:4257:5: {...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // InternalDomain.g:4257:116: ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) )
            	    // InternalDomain.g:4258:6: ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 9);
            	    					
            	    // InternalDomain.g:4261:9: ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) )
            	    // InternalDomain.g:4261:10: {...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "true");
            	    }
            	    // InternalDomain.g:4261:19: (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) )
            	    // InternalDomain.g:4261:20: otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) )
            	    {
            	    otherlv_21=(Token)match(input,81,FOLLOW_73); 

            	    									newLeafNode(otherlv_21, grammarAccess.getGenerationInclusionAccess().getLayoutsKeyword_2_9_0());
            	    								
            	    // InternalDomain.g:4265:9: ( (lv_layouts_22_0= ruleInclusionType ) )
            	    // InternalDomain.g:4266:10: (lv_layouts_22_0= ruleInclusionType )
            	    {
            	    // InternalDomain.g:4266:10: (lv_layouts_22_0= ruleInclusionType )
            	    // InternalDomain.g:4267:11: lv_layouts_22_0= ruleInclusionType
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationInclusionAccess().getLayoutsInclusionTypeEnumRuleCall_2_9_1_0());
            	    										
            	    pushFollow(FOLLOW_74);
            	    lv_layouts_22_0=ruleInclusionType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationInclusionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"layouts",
            	    												lv_layouts_22_0,
            	    												"io.yaktor.Domain.InclusionType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalDomain.g:4290:4: ({...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4290:4: ({...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) ) )
            	    // InternalDomain.g:4291:5: {...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // InternalDomain.g:4291:117: ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) )
            	    // InternalDomain.g:4292:6: ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 10);
            	    					
            	    // InternalDomain.g:4295:9: ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) )
            	    // InternalDomain.g:4295:10: {...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "true");
            	    }
            	    // InternalDomain.g:4295:19: (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) )
            	    // InternalDomain.g:4295:20: otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) )
            	    {
            	    otherlv_23=(Token)match(input,82,FOLLOW_73); 

            	    									newLeafNode(otherlv_23, grammarAccess.getGenerationInclusionAccess().getWebMvcKeyword_2_10_0());
            	    								
            	    // InternalDomain.g:4299:9: ( (lv_webmvc_24_0= ruleInclusionType ) )
            	    // InternalDomain.g:4300:10: (lv_webmvc_24_0= ruleInclusionType )
            	    {
            	    // InternalDomain.g:4300:10: (lv_webmvc_24_0= ruleInclusionType )
            	    // InternalDomain.g:4301:11: lv_webmvc_24_0= ruleInclusionType
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationInclusionAccess().getWebmvcInclusionTypeEnumRuleCall_2_10_1_0());
            	    										
            	    pushFollow(FOLLOW_74);
            	    lv_webmvc_24_0=ruleInclusionType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationInclusionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"webmvc",
            	    												lv_webmvc_24_0,
            	    												"io.yaktor.Domain.InclusionType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalDomain.g:4324:4: ({...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4324:4: ({...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) ) )
            	    // InternalDomain.g:4325:5: {...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // InternalDomain.g:4325:117: ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) )
            	    // InternalDomain.g:4326:6: ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 11);
            	    					
            	    // InternalDomain.g:4329:9: ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) )
            	    // InternalDomain.g:4329:10: {...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenerationInclusion", "true");
            	    }
            	    // InternalDomain.g:4329:19: (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) )
            	    // InternalDomain.g:4329:20: otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) )
            	    {
            	    otherlv_25=(Token)match(input,83,FOLLOW_73); 

            	    									newLeafNode(otherlv_25, grammarAccess.getGenerationInclusionAccess().getTagsKeyword_2_11_0());
            	    								
            	    // InternalDomain.g:4333:9: ( (lv_tags_26_0= ruleInclusionType ) )
            	    // InternalDomain.g:4334:10: (lv_tags_26_0= ruleInclusionType )
            	    {
            	    // InternalDomain.g:4334:10: (lv_tags_26_0= ruleInclusionType )
            	    // InternalDomain.g:4335:11: lv_tags_26_0= ruleInclusionType
            	    {

            	    											newCompositeNode(grammarAccess.getGenerationInclusionAccess().getTagsInclusionTypeEnumRuleCall_2_11_1_0());
            	    										
            	    pushFollow(FOLLOW_74);
            	    lv_tags_26_0=ruleInclusionType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGenerationInclusionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"tags",
            	    												lv_tags_26_0,
            	    												"io.yaktor.Domain.InclusionType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt81 >= 1 ) break loop81;
                        EarlyExitException eee =
                            new EarlyExitException(81, input);
                        throw eee;
                }
                cnt81++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleGenerationInclusion", "getUnorderedGroupHelper().canLeave(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2());
            				

            }

            otherlv_27=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getGenerationInclusionAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleGenerationInclusion"


    // $ANTLR start "entryRuleTtl"
    // InternalDomain.g:4374:1: entryRuleTtl returns [EObject current=null] : iv_ruleTtl= ruleTtl EOF ;
    public final EObject entryRuleTtl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTtl = null;


        try {
            // InternalDomain.g:4374:44: (iv_ruleTtl= ruleTtl EOF )
            // InternalDomain.g:4375:2: iv_ruleTtl= ruleTtl EOF
            {
             newCompositeNode(grammarAccess.getTtlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTtl=ruleTtl();

            state._fsp--;

             current =iv_ruleTtl; 
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
    // $ANTLR end "entryRuleTtl"


    // $ANTLR start "ruleTtl"
    // InternalDomain.g:4381:1: ruleTtl returns [EObject current=null] : (otherlv_0= 'ttl' ( ( rulePossiblyQualifiedName ) ) ( (lv_expireAfterSeconds_2_0= RULE_INT ) ) ) ;
    public final EObject ruleTtl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_expireAfterSeconds_2_0=null;


        	enterRule();

        try {
            // InternalDomain.g:4387:2: ( (otherlv_0= 'ttl' ( ( rulePossiblyQualifiedName ) ) ( (lv_expireAfterSeconds_2_0= RULE_INT ) ) ) )
            // InternalDomain.g:4388:2: (otherlv_0= 'ttl' ( ( rulePossiblyQualifiedName ) ) ( (lv_expireAfterSeconds_2_0= RULE_INT ) ) )
            {
            // InternalDomain.g:4388:2: (otherlv_0= 'ttl' ( ( rulePossiblyQualifiedName ) ) ( (lv_expireAfterSeconds_2_0= RULE_INT ) ) )
            // InternalDomain.g:4389:3: otherlv_0= 'ttl' ( ( rulePossiblyQualifiedName ) ) ( (lv_expireAfterSeconds_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,84,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTtlAccess().getTtlKeyword_0());
            		
            // InternalDomain.g:4393:3: ( ( rulePossiblyQualifiedName ) )
            // InternalDomain.g:4394:4: ( rulePossiblyQualifiedName )
            {
            // InternalDomain.g:4394:4: ( rulePossiblyQualifiedName )
            // InternalDomain.g:4395:5: rulePossiblyQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTtlRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTtlAccess().getFieldDateFieldCrossReference_1_0());
            				
            pushFollow(FOLLOW_62);
            rulePossiblyQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomain.g:4409:3: ( (lv_expireAfterSeconds_2_0= RULE_INT ) )
            // InternalDomain.g:4410:4: (lv_expireAfterSeconds_2_0= RULE_INT )
            {
            // InternalDomain.g:4410:4: (lv_expireAfterSeconds_2_0= RULE_INT )
            // InternalDomain.g:4411:5: lv_expireAfterSeconds_2_0= RULE_INT
            {
            lv_expireAfterSeconds_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_expireAfterSeconds_2_0, grammarAccess.getTtlAccess().getExpireAfterSecondsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTtlRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expireAfterSeconds",
            						lv_expireAfterSeconds_2_0,
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
    // $ANTLR end "ruleTtl"


    // $ANTLR start "entryRuleMongoNodeGenOptions"
    // InternalDomain.g:4431:1: entryRuleMongoNodeGenOptions returns [EObject current=null] : iv_ruleMongoNodeGenOptions= ruleMongoNodeGenOptions EOF ;
    public final EObject entryRuleMongoNodeGenOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMongoNodeGenOptions = null;


        try {
            // InternalDomain.g:4431:60: (iv_ruleMongoNodeGenOptions= ruleMongoNodeGenOptions EOF )
            // InternalDomain.g:4432:2: iv_ruleMongoNodeGenOptions= ruleMongoNodeGenOptions EOF
            {
             newCompositeNode(grammarAccess.getMongoNodeGenOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMongoNodeGenOptions=ruleMongoNodeGenOptions();

            state._fsp--;

             current =iv_ruleMongoNodeGenOptions; 
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
    // $ANTLR end "entryRuleMongoNodeGenOptions"


    // $ANTLR start "ruleMongoNodeGenOptions"
    // InternalDomain.g:4438:1: ruleMongoNodeGenOptions returns [EObject current=null] : ( () otherlv_1= 'node-mongo-options' otherlv_2= '{' ( (lv_useLogger_3_0= 'use-logger' ) )? (otherlv_4= 'model-path' ( (lv_modelPath_5_0= RULE_STRING ) ) )? (otherlv_6= 'test-path' ( (lv_testPath_7_0= RULE_STRING ) ) )? ( (lv_generateTest_8_0= 'gen-test' ) )? (otherlv_9= 'extensions' otherlv_10= '{' ( (lv_tableOptions_11_0= ruleMongoNodeTableOptions ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleMongoNodeGenOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_useLogger_3_0=null;
        Token otherlv_4=null;
        Token lv_modelPath_5_0=null;
        Token otherlv_6=null;
        Token lv_testPath_7_0=null;
        Token lv_generateTest_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_tableOptions_11_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:4444:2: ( ( () otherlv_1= 'node-mongo-options' otherlv_2= '{' ( (lv_useLogger_3_0= 'use-logger' ) )? (otherlv_4= 'model-path' ( (lv_modelPath_5_0= RULE_STRING ) ) )? (otherlv_6= 'test-path' ( (lv_testPath_7_0= RULE_STRING ) ) )? ( (lv_generateTest_8_0= 'gen-test' ) )? (otherlv_9= 'extensions' otherlv_10= '{' ( (lv_tableOptions_11_0= ruleMongoNodeTableOptions ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalDomain.g:4445:2: ( () otherlv_1= 'node-mongo-options' otherlv_2= '{' ( (lv_useLogger_3_0= 'use-logger' ) )? (otherlv_4= 'model-path' ( (lv_modelPath_5_0= RULE_STRING ) ) )? (otherlv_6= 'test-path' ( (lv_testPath_7_0= RULE_STRING ) ) )? ( (lv_generateTest_8_0= 'gen-test' ) )? (otherlv_9= 'extensions' otherlv_10= '{' ( (lv_tableOptions_11_0= ruleMongoNodeTableOptions ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalDomain.g:4445:2: ( () otherlv_1= 'node-mongo-options' otherlv_2= '{' ( (lv_useLogger_3_0= 'use-logger' ) )? (otherlv_4= 'model-path' ( (lv_modelPath_5_0= RULE_STRING ) ) )? (otherlv_6= 'test-path' ( (lv_testPath_7_0= RULE_STRING ) ) )? ( (lv_generateTest_8_0= 'gen-test' ) )? (otherlv_9= 'extensions' otherlv_10= '{' ( (lv_tableOptions_11_0= ruleMongoNodeTableOptions ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalDomain.g:4446:3: () otherlv_1= 'node-mongo-options' otherlv_2= '{' ( (lv_useLogger_3_0= 'use-logger' ) )? (otherlv_4= 'model-path' ( (lv_modelPath_5_0= RULE_STRING ) ) )? (otherlv_6= 'test-path' ( (lv_testPath_7_0= RULE_STRING ) ) )? ( (lv_generateTest_8_0= 'gen-test' ) )? (otherlv_9= 'extensions' otherlv_10= '{' ( (lv_tableOptions_11_0= ruleMongoNodeTableOptions ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalDomain.g:4446:3: ()
            // InternalDomain.g:4447:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMongoNodeGenOptionsAccess().getMongoNodeGenOptionsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,85,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMongoNodeGenOptionsAccess().getNodeMongoOptionsKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_75); 

            			newLeafNode(otherlv_2, grammarAccess.getMongoNodeGenOptionsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDomain.g:4461:3: ( (lv_useLogger_3_0= 'use-logger' ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==86) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalDomain.g:4462:4: (lv_useLogger_3_0= 'use-logger' )
                    {
                    // InternalDomain.g:4462:4: (lv_useLogger_3_0= 'use-logger' )
                    // InternalDomain.g:4463:5: lv_useLogger_3_0= 'use-logger'
                    {
                    lv_useLogger_3_0=(Token)match(input,86,FOLLOW_76); 

                    					newLeafNode(lv_useLogger_3_0, grammarAccess.getMongoNodeGenOptionsAccess().getUseLoggerUseLoggerKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMongoNodeGenOptionsRule());
                    					}
                    					setWithLastConsumed(current, "useLogger", lv_useLogger_3_0 != null, "use-logger");
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:4475:3: (otherlv_4= 'model-path' ( (lv_modelPath_5_0= RULE_STRING ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==87) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalDomain.g:4476:4: otherlv_4= 'model-path' ( (lv_modelPath_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,87,FOLLOW_27); 

                    				newLeafNode(otherlv_4, grammarAccess.getMongoNodeGenOptionsAccess().getModelPathKeyword_4_0());
                    			
                    // InternalDomain.g:4480:4: ( (lv_modelPath_5_0= RULE_STRING ) )
                    // InternalDomain.g:4481:5: (lv_modelPath_5_0= RULE_STRING )
                    {
                    // InternalDomain.g:4481:5: (lv_modelPath_5_0= RULE_STRING )
                    // InternalDomain.g:4482:6: lv_modelPath_5_0= RULE_STRING
                    {
                    lv_modelPath_5_0=(Token)match(input,RULE_STRING,FOLLOW_77); 

                    						newLeafNode(lv_modelPath_5_0, grammarAccess.getMongoNodeGenOptionsAccess().getModelPathSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMongoNodeGenOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"modelPath",
                    							lv_modelPath_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomain.g:4499:3: (otherlv_6= 'test-path' ( (lv_testPath_7_0= RULE_STRING ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==88) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalDomain.g:4500:4: otherlv_6= 'test-path' ( (lv_testPath_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,88,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getMongoNodeGenOptionsAccess().getTestPathKeyword_5_0());
                    			
                    // InternalDomain.g:4504:4: ( (lv_testPath_7_0= RULE_STRING ) )
                    // InternalDomain.g:4505:5: (lv_testPath_7_0= RULE_STRING )
                    {
                    // InternalDomain.g:4505:5: (lv_testPath_7_0= RULE_STRING )
                    // InternalDomain.g:4506:6: lv_testPath_7_0= RULE_STRING
                    {
                    lv_testPath_7_0=(Token)match(input,RULE_STRING,FOLLOW_78); 

                    						newLeafNode(lv_testPath_7_0, grammarAccess.getMongoNodeGenOptionsAccess().getTestPathSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMongoNodeGenOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"testPath",
                    							lv_testPath_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomain.g:4523:3: ( (lv_generateTest_8_0= 'gen-test' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==89) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalDomain.g:4524:4: (lv_generateTest_8_0= 'gen-test' )
                    {
                    // InternalDomain.g:4524:4: (lv_generateTest_8_0= 'gen-test' )
                    // InternalDomain.g:4525:5: lv_generateTest_8_0= 'gen-test'
                    {
                    lv_generateTest_8_0=(Token)match(input,89,FOLLOW_69); 

                    					newLeafNode(lv_generateTest_8_0, grammarAccess.getMongoNodeGenOptionsAccess().getGenerateTestGenTestKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMongoNodeGenOptionsRule());
                    					}
                    					setWithLastConsumed(current, "generateTest", lv_generateTest_8_0 != null, "gen-test");
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:4537:3: (otherlv_9= 'extensions' otherlv_10= '{' ( (lv_tableOptions_11_0= ruleMongoNodeTableOptions ) )* otherlv_12= '}' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==64) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalDomain.g:4538:4: otherlv_9= 'extensions' otherlv_10= '{' ( (lv_tableOptions_11_0= ruleMongoNodeTableOptions ) )* otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,64,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getMongoNodeGenOptionsAccess().getExtensionsKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,13,FOLLOW_25); 

                    				newLeafNode(otherlv_10, grammarAccess.getMongoNodeGenOptionsAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalDomain.g:4546:4: ( (lv_tableOptions_11_0= ruleMongoNodeTableOptions ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==RULE_ID) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalDomain.g:4547:5: (lv_tableOptions_11_0= ruleMongoNodeTableOptions )
                    	    {
                    	    // InternalDomain.g:4547:5: (lv_tableOptions_11_0= ruleMongoNodeTableOptions )
                    	    // InternalDomain.g:4548:6: lv_tableOptions_11_0= ruleMongoNodeTableOptions
                    	    {

                    	    						newCompositeNode(grammarAccess.getMongoNodeGenOptionsAccess().getTableOptionsMongoNodeTableOptionsParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_tableOptions_11_0=ruleMongoNodeTableOptions();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMongoNodeGenOptionsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tableOptions",
                    	    							lv_tableOptions_11_0,
                    	    							"io.yaktor.Domain.MongoNodeTableOptions");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getMongoNodeGenOptionsAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getMongoNodeGenOptionsAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleMongoNodeGenOptions"


    // $ANTLR start "entryRuleJpaTableOptions"
    // InternalDomain.g:4578:1: entryRuleJpaTableOptions returns [EObject current=null] : iv_ruleJpaTableOptions= ruleJpaTableOptions EOF ;
    public final EObject entryRuleJpaTableOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJpaTableOptions = null;


        try {
            // InternalDomain.g:4578:56: (iv_ruleJpaTableOptions= ruleJpaTableOptions EOF )
            // InternalDomain.g:4579:2: iv_ruleJpaTableOptions= ruleJpaTableOptions EOF
            {
             newCompositeNode(grammarAccess.getJpaTableOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJpaTableOptions=ruleJpaTableOptions();

            state._fsp--;

             current =iv_ruleJpaTableOptions; 
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
    // $ANTLR end "entryRuleJpaTableOptions"


    // $ANTLR start "ruleJpaTableOptions"
    // InternalDomain.g:4585:1: ruleJpaTableOptions returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_singleTableRoot_2_0= 'single-table-root' ) )? otherlv_3= '}' ) ;
    public final EObject ruleJpaTableOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_singleTableRoot_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDomain.g:4591:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_singleTableRoot_2_0= 'single-table-root' ) )? otherlv_3= '}' ) )
            // InternalDomain.g:4592:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_singleTableRoot_2_0= 'single-table-root' ) )? otherlv_3= '}' )
            {
            // InternalDomain.g:4592:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_singleTableRoot_2_0= 'single-table-root' ) )? otherlv_3= '}' )
            // InternalDomain.g:4593:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_singleTableRoot_2_0= 'single-table-root' ) )? otherlv_3= '}'
            {
            // InternalDomain.g:4593:3: ( (otherlv_0= RULE_ID ) )
            // InternalDomain.g:4594:4: (otherlv_0= RULE_ID )
            {
            // InternalDomain.g:4594:4: (otherlv_0= RULE_ID )
            // InternalDomain.g:4595:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJpaTableOptionsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_0, grammarAccess.getJpaTableOptionsAccess().getTypeEntityCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_79); 

            			newLeafNode(otherlv_1, grammarAccess.getJpaTableOptionsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDomain.g:4610:3: ( (lv_singleTableRoot_2_0= 'single-table-root' ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==90) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalDomain.g:4611:4: (lv_singleTableRoot_2_0= 'single-table-root' )
                    {
                    // InternalDomain.g:4611:4: (lv_singleTableRoot_2_0= 'single-table-root' )
                    // InternalDomain.g:4612:5: lv_singleTableRoot_2_0= 'single-table-root'
                    {
                    lv_singleTableRoot_2_0=(Token)match(input,90,FOLLOW_10); 

                    					newLeafNode(lv_singleTableRoot_2_0, grammarAccess.getJpaTableOptionsAccess().getSingleTableRootSingleTableRootKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJpaTableOptionsRule());
                    					}
                    					setWithLastConsumed(current, "singleTableRoot", lv_singleTableRoot_2_0 != null, "single-table-root");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getJpaTableOptionsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleJpaTableOptions"


    // $ANTLR start "entryRuleMongoNodeTableOptions"
    // InternalDomain.g:4632:1: entryRuleMongoNodeTableOptions returns [EObject current=null] : iv_ruleMongoNodeTableOptions= ruleMongoNodeTableOptions EOF ;
    public final EObject entryRuleMongoNodeTableOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMongoNodeTableOptions = null;


        try {
            // InternalDomain.g:4632:62: (iv_ruleMongoNodeTableOptions= ruleMongoNodeTableOptions EOF )
            // InternalDomain.g:4633:2: iv_ruleMongoNodeTableOptions= ruleMongoNodeTableOptions EOF
            {
             newCompositeNode(grammarAccess.getMongoNodeTableOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMongoNodeTableOptions=ruleMongoNodeTableOptions();

            state._fsp--;

             current =iv_ruleMongoNodeTableOptions; 
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
    // $ANTLR end "entryRuleMongoNodeTableOptions"


    // $ANTLR start "ruleMongoNodeTableOptions"
    // InternalDomain.g:4639:1: ruleMongoNodeTableOptions returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_ttl_2_0= ruleTtl ) )? ( (lv_singleTableRoot_3_0= 'single-table-root' ) )? otherlv_4= '}' ) ;
    public final EObject ruleMongoNodeTableOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_singleTableRoot_3_0=null;
        Token otherlv_4=null;
        EObject lv_ttl_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:4645:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_ttl_2_0= ruleTtl ) )? ( (lv_singleTableRoot_3_0= 'single-table-root' ) )? otherlv_4= '}' ) )
            // InternalDomain.g:4646:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_ttl_2_0= ruleTtl ) )? ( (lv_singleTableRoot_3_0= 'single-table-root' ) )? otherlv_4= '}' )
            {
            // InternalDomain.g:4646:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_ttl_2_0= ruleTtl ) )? ( (lv_singleTableRoot_3_0= 'single-table-root' ) )? otherlv_4= '}' )
            // InternalDomain.g:4647:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '{' ( (lv_ttl_2_0= ruleTtl ) )? ( (lv_singleTableRoot_3_0= 'single-table-root' ) )? otherlv_4= '}'
            {
            // InternalDomain.g:4647:3: ( (otherlv_0= RULE_ID ) )
            // InternalDomain.g:4648:4: (otherlv_0= RULE_ID )
            {
            // InternalDomain.g:4648:4: (otherlv_0= RULE_ID )
            // InternalDomain.g:4649:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMongoNodeTableOptionsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_0, grammarAccess.getMongoNodeTableOptionsAccess().getTypeEntityCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_80); 

            			newLeafNode(otherlv_1, grammarAccess.getMongoNodeTableOptionsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDomain.g:4664:3: ( (lv_ttl_2_0= ruleTtl ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==84) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalDomain.g:4665:4: (lv_ttl_2_0= ruleTtl )
                    {
                    // InternalDomain.g:4665:4: (lv_ttl_2_0= ruleTtl )
                    // InternalDomain.g:4666:5: lv_ttl_2_0= ruleTtl
                    {

                    					newCompositeNode(grammarAccess.getMongoNodeTableOptionsAccess().getTtlTtlParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_79);
                    lv_ttl_2_0=ruleTtl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMongoNodeTableOptionsRule());
                    					}
                    					set(
                    						current,
                    						"ttl",
                    						lv_ttl_2_0,
                    						"io.yaktor.Domain.Ttl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomain.g:4683:3: ( (lv_singleTableRoot_3_0= 'single-table-root' ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==90) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalDomain.g:4684:4: (lv_singleTableRoot_3_0= 'single-table-root' )
                    {
                    // InternalDomain.g:4684:4: (lv_singleTableRoot_3_0= 'single-table-root' )
                    // InternalDomain.g:4685:5: lv_singleTableRoot_3_0= 'single-table-root'
                    {
                    lv_singleTableRoot_3_0=(Token)match(input,90,FOLLOW_10); 

                    					newLeafNode(lv_singleTableRoot_3_0, grammarAccess.getMongoNodeTableOptionsAccess().getSingleTableRootSingleTableRootKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMongoNodeTableOptionsRule());
                    					}
                    					setWithLastConsumed(current, "singleTableRoot", lv_singleTableRoot_3_0 != null, "single-table-root");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMongoNodeTableOptionsAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMongoNodeTableOptions"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDomain.g:4705:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDomain.g:4705:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDomain.g:4706:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalDomain.g:4712:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDomain.g:4718:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDomain.g:4719:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDomain.g:4719:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDomain.g:4720:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_81); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalDomain.g:4727:3: (kw= '.' this_ID_2= RULE_ID )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==57) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalDomain.g:4728:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,57,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_81); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop91;
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


    // $ANTLR start "entryRulePossiblyQualifiedName"
    // InternalDomain.g:4745:1: entryRulePossiblyQualifiedName returns [String current=null] : iv_rulePossiblyQualifiedName= rulePossiblyQualifiedName EOF ;
    public final String entryRulePossiblyQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePossiblyQualifiedName = null;


        try {
            // InternalDomain.g:4745:61: (iv_rulePossiblyQualifiedName= rulePossiblyQualifiedName EOF )
            // InternalDomain.g:4746:2: iv_rulePossiblyQualifiedName= rulePossiblyQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getPossiblyQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePossiblyQualifiedName=rulePossiblyQualifiedName();

            state._fsp--;

             current =iv_rulePossiblyQualifiedName.getText(); 
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
    // $ANTLR end "entryRulePossiblyQualifiedName"


    // $ANTLR start "rulePossiblyQualifiedName"
    // InternalDomain.g:4752:1: rulePossiblyQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken rulePossiblyQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDomain.g:4758:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDomain.g:4759:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDomain.g:4759:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDomain.g:4760:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_81); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getPossiblyQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalDomain.g:4767:3: (kw= '.' this_ID_2= RULE_ID )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==57) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalDomain.g:4768:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,57,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getPossiblyQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_81); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getPossiblyQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop92;
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
    // $ANTLR end "rulePossiblyQualifiedName"


    // $ANTLR start "entryRulePersistenceOptions"
    // InternalDomain.g:4785:1: entryRulePersistenceOptions returns [EObject current=null] : iv_rulePersistenceOptions= rulePersistenceOptions EOF ;
    public final EObject entryRulePersistenceOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistenceOptions = null;


        try {
            // InternalDomain.g:4785:59: (iv_rulePersistenceOptions= rulePersistenceOptions EOF )
            // InternalDomain.g:4786:2: iv_rulePersistenceOptions= rulePersistenceOptions EOF
            {
             newCompositeNode(grammarAccess.getPersistenceOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersistenceOptions=rulePersistenceOptions();

            state._fsp--;

             current =iv_rulePersistenceOptions; 
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
    // $ANTLR end "entryRulePersistenceOptions"


    // $ANTLR start "rulePersistenceOptions"
    // InternalDomain.g:4792:1: rulePersistenceOptions returns [EObject current=null] : (otherlv_0= 'persistence-options' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' ) ;
    public final EObject rulePersistenceOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_userName_8_0=null;
        Token otherlv_9=null;
        Token lv_password_10_1=null;
        Token lv_password_10_2=null;
        Token otherlv_11=null;
        Token lv_url_12_0=null;
        Token otherlv_13=null;
        Token lv_dbName_14_0=null;
        Token otherlv_15=null;
        Enumerator lv_dbType_4_0 = null;

        Enumerator lv_dbProvider_6_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:4798:2: ( (otherlv_0= 'persistence-options' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' ) )
            // InternalDomain.g:4799:2: (otherlv_0= 'persistence-options' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' )
            {
            // InternalDomain.g:4799:2: (otherlv_0= 'persistence-options' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' )
            // InternalDomain.g:4800:3: otherlv_0= 'persistence-options' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPersistenceOptionsAccess().getPersistenceOptionsKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_82); 

            			newLeafNode(otherlv_1, grammarAccess.getPersistenceOptionsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDomain.g:4808:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) ) ) )+ {...}?) ) )
            // InternalDomain.g:4809:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalDomain.g:4809:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) ) ) )+ {...}?) )
            // InternalDomain.g:4810:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2());
            				
            // InternalDomain.g:4813:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) ) ) )+ {...}?)
            // InternalDomain.g:4814:6: ( ({...}? => ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) ) ) )+ {...}?
            {
            // InternalDomain.g:4814:6: ( ({...}? => ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) ) ) )+
            int cnt94=0;
            loop94:
            do {
                int alt94=7;
                int LA94_0 = input.LA(1);

                if ( LA94_0 == 92 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 0) ) {
                    alt94=1;
                }
                else if ( LA94_0 == 93 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 1) ) {
                    alt94=2;
                }
                else if ( LA94_0 == 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 2) ) {
                    alt94=3;
                }
                else if ( LA94_0 == 95 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 3) ) {
                    alt94=4;
                }
                else if ( LA94_0 == 96 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 4) ) {
                    alt94=5;
                }
                else if ( LA94_0 == 97 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 5) ) {
                    alt94=6;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalDomain.g:4815:4: ({...}? => ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4815:4: ({...}? => ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) ) )
            	    // InternalDomain.g:4816:5: {...}? => ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalDomain.g:4816:115: ( ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) ) )
            	    // InternalDomain.g:4817:6: ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalDomain.g:4820:9: ({...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) ) )
            	    // InternalDomain.g:4820:10: {...}? => (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceOptions", "true");
            	    }
            	    // InternalDomain.g:4820:19: (otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) ) )
            	    // InternalDomain.g:4820:20: otherlv_3= 'database' ( (lv_dbType_4_0= ruleDbType ) )
            	    {
            	    otherlv_3=(Token)match(input,92,FOLLOW_83); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPersistenceOptionsAccess().getDatabaseKeyword_2_0_0());
            	    								
            	    // InternalDomain.g:4824:9: ( (lv_dbType_4_0= ruleDbType ) )
            	    // InternalDomain.g:4825:10: (lv_dbType_4_0= ruleDbType )
            	    {
            	    // InternalDomain.g:4825:10: (lv_dbType_4_0= ruleDbType )
            	    // InternalDomain.g:4826:11: lv_dbType_4_0= ruleDbType
            	    {

            	    											newCompositeNode(grammarAccess.getPersistenceOptionsAccess().getDbTypeDbTypeEnumRuleCall_2_0_1_0());
            	    										
            	    pushFollow(FOLLOW_84);
            	    lv_dbType_4_0=ruleDbType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPersistenceOptionsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"dbType",
            	    												lv_dbType_4_0,
            	    												"io.yaktor.Domain.DbType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomain.g:4849:4: ({...}? => ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4849:4: ({...}? => ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) ) )
            	    // InternalDomain.g:4850:5: {...}? => ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalDomain.g:4850:115: ( ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) ) )
            	    // InternalDomain.g:4851:6: ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalDomain.g:4854:9: ({...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) ) )
            	    // InternalDomain.g:4854:10: {...}? => (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceOptions", "true");
            	    }
            	    // InternalDomain.g:4854:19: (otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) ) )
            	    // InternalDomain.g:4854:20: otherlv_5= 'provider' ( (lv_dbProvider_6_0= ruleDbProvider ) )
            	    {
            	    otherlv_5=(Token)match(input,93,FOLLOW_85); 

            	    									newLeafNode(otherlv_5, grammarAccess.getPersistenceOptionsAccess().getProviderKeyword_2_1_0());
            	    								
            	    // InternalDomain.g:4858:9: ( (lv_dbProvider_6_0= ruleDbProvider ) )
            	    // InternalDomain.g:4859:10: (lv_dbProvider_6_0= ruleDbProvider )
            	    {
            	    // InternalDomain.g:4859:10: (lv_dbProvider_6_0= ruleDbProvider )
            	    // InternalDomain.g:4860:11: lv_dbProvider_6_0= ruleDbProvider
            	    {

            	    											newCompositeNode(grammarAccess.getPersistenceOptionsAccess().getDbProviderDbProviderEnumRuleCall_2_1_1_0());
            	    										
            	    pushFollow(FOLLOW_84);
            	    lv_dbProvider_6_0=ruleDbProvider();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPersistenceOptionsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"dbProvider",
            	    												lv_dbProvider_6_0,
            	    												"io.yaktor.Domain.DbProvider");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDomain.g:4883:4: ({...}? => ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4883:4: ({...}? => ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) ) )
            	    // InternalDomain.g:4884:5: {...}? => ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalDomain.g:4884:115: ( ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) ) )
            	    // InternalDomain.g:4885:6: ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalDomain.g:4888:9: ({...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) ) )
            	    // InternalDomain.g:4888:10: {...}? => (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceOptions", "true");
            	    }
            	    // InternalDomain.g:4888:19: (otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) ) )
            	    // InternalDomain.g:4888:20: otherlv_7= 'user' ( (lv_userName_8_0= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,94,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getPersistenceOptionsAccess().getUserKeyword_2_2_0());
            	    								
            	    // InternalDomain.g:4892:9: ( (lv_userName_8_0= RULE_ID ) )
            	    // InternalDomain.g:4893:10: (lv_userName_8_0= RULE_ID )
            	    {
            	    // InternalDomain.g:4893:10: (lv_userName_8_0= RULE_ID )
            	    // InternalDomain.g:4894:11: lv_userName_8_0= RULE_ID
            	    {
            	    lv_userName_8_0=(Token)match(input,RULE_ID,FOLLOW_84); 

            	    											newLeafNode(lv_userName_8_0, grammarAccess.getPersistenceOptionsAccess().getUserNameIDTerminalRuleCall_2_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPersistenceOptionsRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"userName",
            	    												lv_userName_8_0,
            	    												"org.eclipse.xtext.common.Terminals.ID");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDomain.g:4916:4: ({...}? => ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4916:4: ({...}? => ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) ) )
            	    // InternalDomain.g:4917:5: {...}? => ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalDomain.g:4917:115: ( ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) ) )
            	    // InternalDomain.g:4918:6: ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalDomain.g:4921:9: ({...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) ) )
            	    // InternalDomain.g:4921:10: {...}? => (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceOptions", "true");
            	    }
            	    // InternalDomain.g:4921:19: (otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) ) )
            	    // InternalDomain.g:4921:20: otherlv_9= 'password' ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) )
            	    {
            	    otherlv_9=(Token)match(input,95,FOLLOW_86); 

            	    									newLeafNode(otherlv_9, grammarAccess.getPersistenceOptionsAccess().getPasswordKeyword_2_3_0());
            	    								
            	    // InternalDomain.g:4925:9: ( ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) ) )
            	    // InternalDomain.g:4926:10: ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) )
            	    {
            	    // InternalDomain.g:4926:10: ( (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING ) )
            	    // InternalDomain.g:4927:11: (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING )
            	    {
            	    // InternalDomain.g:4927:11: (lv_password_10_1= RULE_ID | lv_password_10_2= RULE_STRING )
            	    int alt93=2;
            	    int LA93_0 = input.LA(1);

            	    if ( (LA93_0==RULE_ID) ) {
            	        alt93=1;
            	    }
            	    else if ( (LA93_0==RULE_STRING) ) {
            	        alt93=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 93, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt93) {
            	        case 1 :
            	            // InternalDomain.g:4928:12: lv_password_10_1= RULE_ID
            	            {
            	            lv_password_10_1=(Token)match(input,RULE_ID,FOLLOW_84); 

            	            												newLeafNode(lv_password_10_1, grammarAccess.getPersistenceOptionsAccess().getPasswordIDTerminalRuleCall_2_3_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getPersistenceOptionsRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"password",
            	            													lv_password_10_1,
            	            													"org.eclipse.xtext.common.Terminals.ID");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalDomain.g:4943:12: lv_password_10_2= RULE_STRING
            	            {
            	            lv_password_10_2=(Token)match(input,RULE_STRING,FOLLOW_84); 

            	            												newLeafNode(lv_password_10_2, grammarAccess.getPersistenceOptionsAccess().getPasswordSTRINGTerminalRuleCall_2_3_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getPersistenceOptionsRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"password",
            	            													lv_password_10_2,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDomain.g:4966:4: ({...}? => ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4966:4: ({...}? => ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) ) )
            	    // InternalDomain.g:4967:5: {...}? => ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalDomain.g:4967:115: ( ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) ) )
            	    // InternalDomain.g:4968:6: ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalDomain.g:4971:9: ({...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) ) )
            	    // InternalDomain.g:4971:10: {...}? => (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceOptions", "true");
            	    }
            	    // InternalDomain.g:4971:19: (otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) ) )
            	    // InternalDomain.g:4971:20: otherlv_11= 'url' ( (lv_url_12_0= RULE_STRING ) )
            	    {
            	    otherlv_11=(Token)match(input,96,FOLLOW_27); 

            	    									newLeafNode(otherlv_11, grammarAccess.getPersistenceOptionsAccess().getUrlKeyword_2_4_0());
            	    								
            	    // InternalDomain.g:4975:9: ( (lv_url_12_0= RULE_STRING ) )
            	    // InternalDomain.g:4976:10: (lv_url_12_0= RULE_STRING )
            	    {
            	    // InternalDomain.g:4976:10: (lv_url_12_0= RULE_STRING )
            	    // InternalDomain.g:4977:11: lv_url_12_0= RULE_STRING
            	    {
            	    lv_url_12_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

            	    											newLeafNode(lv_url_12_0, grammarAccess.getPersistenceOptionsAccess().getUrlSTRINGTerminalRuleCall_2_4_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPersistenceOptionsRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"url",
            	    												lv_url_12_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalDomain.g:4999:4: ({...}? => ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalDomain.g:4999:4: ({...}? => ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) ) )
            	    // InternalDomain.g:5000:5: {...}? => ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceOptions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalDomain.g:5000:115: ( ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) ) )
            	    // InternalDomain.g:5001:6: ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalDomain.g:5004:9: ({...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) ) )
            	    // InternalDomain.g:5004:10: {...}? => (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceOptions", "true");
            	    }
            	    // InternalDomain.g:5004:19: (otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) ) )
            	    // InternalDomain.g:5004:20: otherlv_13= 'db-name' ( (lv_dbName_14_0= RULE_ID ) )
            	    {
            	    otherlv_13=(Token)match(input,97,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getPersistenceOptionsAccess().getDbNameKeyword_2_5_0());
            	    								
            	    // InternalDomain.g:5008:9: ( (lv_dbName_14_0= RULE_ID ) )
            	    // InternalDomain.g:5009:10: (lv_dbName_14_0= RULE_ID )
            	    {
            	    // InternalDomain.g:5009:10: (lv_dbName_14_0= RULE_ID )
            	    // InternalDomain.g:5010:11: lv_dbName_14_0= RULE_ID
            	    {
            	    lv_dbName_14_0=(Token)match(input,RULE_ID,FOLLOW_84); 

            	    											newLeafNode(lv_dbName_14_0, grammarAccess.getPersistenceOptionsAccess().getDbNameIDTerminalRuleCall_2_5_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPersistenceOptionsRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"dbName",
            	    												lv_dbName_14_0,
            	    												"org.eclipse.xtext.common.Terminals.ID");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt94 >= 1 ) break loop94;
                        EarlyExitException eee =
                            new EarlyExitException(94, input);
                        throw eee;
                }
                cnt94++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "rulePersistenceOptions", "getUnorderedGroupHelper().canLeave(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPersistenceOptionsAccess().getUnorderedGroup_2());
            				

            }

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getPersistenceOptionsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulePersistenceOptions"


    // $ANTLR start "ruleCardinality"
    // InternalDomain.g:5048:1: ruleCardinality returns [Enumerator current=null] : ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) | (enumLiteral_2= '+' ) | (enumLiteral_3= '*' ) ) ;
    public final Enumerator ruleCardinality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDomain.g:5054:2: ( ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) | (enumLiteral_2= '+' ) | (enumLiteral_3= '*' ) ) )
            // InternalDomain.g:5055:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) | (enumLiteral_2= '+' ) | (enumLiteral_3= '*' ) )
            {
            // InternalDomain.g:5055:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) | (enumLiteral_2= '+' ) | (enumLiteral_3= '*' ) )
            int alt95=4;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt95=1;
                }
                break;
            case 99:
                {
                alt95=2;
                }
                break;
            case 100:
                {
                alt95=3;
                }
                break;
            case 101:
                {
                alt95=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalDomain.g:5056:3: (enumLiteral_0= '!' )
                    {
                    // InternalDomain.g:5056:3: (enumLiteral_0= '!' )
                    // InternalDomain.g:5057:4: enumLiteral_0= '!'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getRequiredEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityAccess().getRequiredEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:5064:3: (enumLiteral_1= '?' )
                    {
                    // InternalDomain.g:5064:3: (enumLiteral_1= '?' )
                    // InternalDomain.g:5065:4: enumLiteral_1= '?'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getOptionalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalityAccess().getOptionalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomain.g:5072:3: (enumLiteral_2= '+' )
                    {
                    // InternalDomain.g:5072:3: (enumLiteral_2= '+' )
                    // InternalDomain.g:5073:4: enumLiteral_2= '+'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getOneOrMoreEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCardinalityAccess().getOneOrMoreEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomain.g:5080:3: (enumLiteral_3= '*' )
                    {
                    // InternalDomain.g:5080:3: (enumLiteral_3= '*' )
                    // InternalDomain.g:5081:4: enumLiteral_3= '*'
                    {
                    enumLiteral_3=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getManyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCardinalityAccess().getManyEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "ruleSinglularCardinality"
    // InternalDomain.g:5091:1: ruleSinglularCardinality returns [Enumerator current=null] : ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) ) ;
    public final Enumerator ruleSinglularCardinality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDomain.g:5097:2: ( ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) ) )
            // InternalDomain.g:5098:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) )
            {
            // InternalDomain.g:5098:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==98) ) {
                alt96=1;
            }
            else if ( (LA96_0==99) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalDomain.g:5099:3: (enumLiteral_0= '!' )
                    {
                    // InternalDomain.g:5099:3: (enumLiteral_0= '!' )
                    // InternalDomain.g:5100:4: enumLiteral_0= '!'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getSinglularCardinalityAccess().getRequiredEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSinglularCardinalityAccess().getRequiredEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:5107:3: (enumLiteral_1= '?' )
                    {
                    // InternalDomain.g:5107:3: (enumLiteral_1= '?' )
                    // InternalDomain.g:5108:4: enumLiteral_1= '?'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getSinglularCardinalityAccess().getOptionalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSinglularCardinalityAccess().getOptionalEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSinglularCardinality"


    // $ANTLR start "ruleInclusionType"
    // InternalDomain.g:5118:1: ruleInclusionType returns [Enumerator current=null] : ( (enumLiteral_0= 'OVERWRITE' ) | (enumLiteral_1= 'PROTECTED' ) | (enumLiteral_2= 'NONE' ) ) ;
    public final Enumerator ruleInclusionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDomain.g:5124:2: ( ( (enumLiteral_0= 'OVERWRITE' ) | (enumLiteral_1= 'PROTECTED' ) | (enumLiteral_2= 'NONE' ) ) )
            // InternalDomain.g:5125:2: ( (enumLiteral_0= 'OVERWRITE' ) | (enumLiteral_1= 'PROTECTED' ) | (enumLiteral_2= 'NONE' ) )
            {
            // InternalDomain.g:5125:2: ( (enumLiteral_0= 'OVERWRITE' ) | (enumLiteral_1= 'PROTECTED' ) | (enumLiteral_2= 'NONE' ) )
            int alt97=3;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt97=1;
                }
                break;
            case 103:
                {
                alt97=2;
                }
                break;
            case 104:
                {
                alt97=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalDomain.g:5126:3: (enumLiteral_0= 'OVERWRITE' )
                    {
                    // InternalDomain.g:5126:3: (enumLiteral_0= 'OVERWRITE' )
                    // InternalDomain.g:5127:4: enumLiteral_0= 'OVERWRITE'
                    {
                    enumLiteral_0=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getInclusionTypeAccess().getOverwriteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInclusionTypeAccess().getOverwriteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:5134:3: (enumLiteral_1= 'PROTECTED' )
                    {
                    // InternalDomain.g:5134:3: (enumLiteral_1= 'PROTECTED' )
                    // InternalDomain.g:5135:4: enumLiteral_1= 'PROTECTED'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getInclusionTypeAccess().getProtectedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getInclusionTypeAccess().getProtectedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomain.g:5142:3: (enumLiteral_2= 'NONE' )
                    {
                    // InternalDomain.g:5142:3: (enumLiteral_2= 'NONE' )
                    // InternalDomain.g:5143:4: enumLiteral_2= 'NONE'
                    {
                    enumLiteral_2=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getInclusionTypeAccess().getNoneEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getInclusionTypeAccess().getNoneEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleInclusionType"


    // $ANTLR start "ruleDbType"
    // InternalDomain.g:5153:1: ruleDbType returns [Enumerator current=null] : ( (enumLiteral_0= 'MYSQL' ) | (enumLiteral_1= 'ORACLE' ) | (enumLiteral_2= 'DATABASE_DOT_COM' ) | (enumLiteral_3= 'DB2_400' ) | (enumLiteral_4= 'DB2_EXPRESS_C' ) | (enumLiteral_5= 'DERBY_CLIENT' ) | (enumLiteral_6= 'DERBY_EMBEDDED' ) | (enumLiteral_7= 'FIREBIRD' ) | (enumLiteral_8= 'GOOGLE_APP_ENGINE' ) | (enumLiteral_9= 'H2_IN_MEMORY' ) | (enumLiteral_10= 'HYPERSONIC_IN_MEMORY' ) | (enumLiteral_11= 'HYPERSONIC_PERSISTENT' ) | (enumLiteral_12= 'MSSQL' ) | (enumLiteral_13= 'POSTGRES' ) | (enumLiteral_14= 'SYBASE' ) ) ;
    public final Enumerator ruleDbType() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalDomain.g:5159:2: ( ( (enumLiteral_0= 'MYSQL' ) | (enumLiteral_1= 'ORACLE' ) | (enumLiteral_2= 'DATABASE_DOT_COM' ) | (enumLiteral_3= 'DB2_400' ) | (enumLiteral_4= 'DB2_EXPRESS_C' ) | (enumLiteral_5= 'DERBY_CLIENT' ) | (enumLiteral_6= 'DERBY_EMBEDDED' ) | (enumLiteral_7= 'FIREBIRD' ) | (enumLiteral_8= 'GOOGLE_APP_ENGINE' ) | (enumLiteral_9= 'H2_IN_MEMORY' ) | (enumLiteral_10= 'HYPERSONIC_IN_MEMORY' ) | (enumLiteral_11= 'HYPERSONIC_PERSISTENT' ) | (enumLiteral_12= 'MSSQL' ) | (enumLiteral_13= 'POSTGRES' ) | (enumLiteral_14= 'SYBASE' ) ) )
            // InternalDomain.g:5160:2: ( (enumLiteral_0= 'MYSQL' ) | (enumLiteral_1= 'ORACLE' ) | (enumLiteral_2= 'DATABASE_DOT_COM' ) | (enumLiteral_3= 'DB2_400' ) | (enumLiteral_4= 'DB2_EXPRESS_C' ) | (enumLiteral_5= 'DERBY_CLIENT' ) | (enumLiteral_6= 'DERBY_EMBEDDED' ) | (enumLiteral_7= 'FIREBIRD' ) | (enumLiteral_8= 'GOOGLE_APP_ENGINE' ) | (enumLiteral_9= 'H2_IN_MEMORY' ) | (enumLiteral_10= 'HYPERSONIC_IN_MEMORY' ) | (enumLiteral_11= 'HYPERSONIC_PERSISTENT' ) | (enumLiteral_12= 'MSSQL' ) | (enumLiteral_13= 'POSTGRES' ) | (enumLiteral_14= 'SYBASE' ) )
            {
            // InternalDomain.g:5160:2: ( (enumLiteral_0= 'MYSQL' ) | (enumLiteral_1= 'ORACLE' ) | (enumLiteral_2= 'DATABASE_DOT_COM' ) | (enumLiteral_3= 'DB2_400' ) | (enumLiteral_4= 'DB2_EXPRESS_C' ) | (enumLiteral_5= 'DERBY_CLIENT' ) | (enumLiteral_6= 'DERBY_EMBEDDED' ) | (enumLiteral_7= 'FIREBIRD' ) | (enumLiteral_8= 'GOOGLE_APP_ENGINE' ) | (enumLiteral_9= 'H2_IN_MEMORY' ) | (enumLiteral_10= 'HYPERSONIC_IN_MEMORY' ) | (enumLiteral_11= 'HYPERSONIC_PERSISTENT' ) | (enumLiteral_12= 'MSSQL' ) | (enumLiteral_13= 'POSTGRES' ) | (enumLiteral_14= 'SYBASE' ) )
            int alt98=15;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt98=1;
                }
                break;
            case 106:
                {
                alt98=2;
                }
                break;
            case 107:
                {
                alt98=3;
                }
                break;
            case 108:
                {
                alt98=4;
                }
                break;
            case 109:
                {
                alt98=5;
                }
                break;
            case 110:
                {
                alt98=6;
                }
                break;
            case 111:
                {
                alt98=7;
                }
                break;
            case 112:
                {
                alt98=8;
                }
                break;
            case 113:
                {
                alt98=9;
                }
                break;
            case 114:
                {
                alt98=10;
                }
                break;
            case 115:
                {
                alt98=11;
                }
                break;
            case 116:
                {
                alt98=12;
                }
                break;
            case 117:
                {
                alt98=13;
                }
                break;
            case 118:
                {
                alt98=14;
                }
                break;
            case 119:
                {
                alt98=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalDomain.g:5161:3: (enumLiteral_0= 'MYSQL' )
                    {
                    // InternalDomain.g:5161:3: (enumLiteral_0= 'MYSQL' )
                    // InternalDomain.g:5162:4: enumLiteral_0= 'MYSQL'
                    {
                    enumLiteral_0=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getDbTypeAccess().getMySqlEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDbTypeAccess().getMySqlEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:5169:3: (enumLiteral_1= 'ORACLE' )
                    {
                    // InternalDomain.g:5169:3: (enumLiteral_1= 'ORACLE' )
                    // InternalDomain.g:5170:4: enumLiteral_1= 'ORACLE'
                    {
                    enumLiteral_1=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getDbTypeAccess().getOracleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDbTypeAccess().getOracleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomain.g:5177:3: (enumLiteral_2= 'DATABASE_DOT_COM' )
                    {
                    // InternalDomain.g:5177:3: (enumLiteral_2= 'DATABASE_DOT_COM' )
                    // InternalDomain.g:5178:4: enumLiteral_2= 'DATABASE_DOT_COM'
                    {
                    enumLiteral_2=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getDbTypeAccess().getDatabaseDotComEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDbTypeAccess().getDatabaseDotComEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomain.g:5185:3: (enumLiteral_3= 'DB2_400' )
                    {
                    // InternalDomain.g:5185:3: (enumLiteral_3= 'DB2_400' )
                    // InternalDomain.g:5186:4: enumLiteral_3= 'DB2_400'
                    {
                    enumLiteral_3=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getDbTypeAccess().getDb2400EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDbTypeAccess().getDb2400EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDomain.g:5193:3: (enumLiteral_4= 'DB2_EXPRESS_C' )
                    {
                    // InternalDomain.g:5193:3: (enumLiteral_4= 'DB2_EXPRESS_C' )
                    // InternalDomain.g:5194:4: enumLiteral_4= 'DB2_EXPRESS_C'
                    {
                    enumLiteral_4=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getDbTypeAccess().getDb2ExpressCEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDbTypeAccess().getDb2ExpressCEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDomain.g:5201:3: (enumLiteral_5= 'DERBY_CLIENT' )
                    {
                    // InternalDomain.g:5201:3: (enumLiteral_5= 'DERBY_CLIENT' )
                    // InternalDomain.g:5202:4: enumLiteral_5= 'DERBY_CLIENT'
                    {
                    enumLiteral_5=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getDbTypeAccess().getDerbyClientEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDbTypeAccess().getDerbyClientEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDomain.g:5209:3: (enumLiteral_6= 'DERBY_EMBEDDED' )
                    {
                    // InternalDomain.g:5209:3: (enumLiteral_6= 'DERBY_EMBEDDED' )
                    // InternalDomain.g:5210:4: enumLiteral_6= 'DERBY_EMBEDDED'
                    {
                    enumLiteral_6=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getDbTypeAccess().getDerbyEmbeddedEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDbTypeAccess().getDerbyEmbeddedEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDomain.g:5217:3: (enumLiteral_7= 'FIREBIRD' )
                    {
                    // InternalDomain.g:5217:3: (enumLiteral_7= 'FIREBIRD' )
                    // InternalDomain.g:5218:4: enumLiteral_7= 'FIREBIRD'
                    {
                    enumLiteral_7=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getDbTypeAccess().getFirebirdEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDbTypeAccess().getFirebirdEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDomain.g:5225:3: (enumLiteral_8= 'GOOGLE_APP_ENGINE' )
                    {
                    // InternalDomain.g:5225:3: (enumLiteral_8= 'GOOGLE_APP_ENGINE' )
                    // InternalDomain.g:5226:4: enumLiteral_8= 'GOOGLE_APP_ENGINE'
                    {
                    enumLiteral_8=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getDbTypeAccess().getGoogleAppEngineEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDbTypeAccess().getGoogleAppEngineEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDomain.g:5233:3: (enumLiteral_9= 'H2_IN_MEMORY' )
                    {
                    // InternalDomain.g:5233:3: (enumLiteral_9= 'H2_IN_MEMORY' )
                    // InternalDomain.g:5234:4: enumLiteral_9= 'H2_IN_MEMORY'
                    {
                    enumLiteral_9=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getDbTypeAccess().getH2InMemoryEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDbTypeAccess().getH2InMemoryEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalDomain.g:5241:3: (enumLiteral_10= 'HYPERSONIC_IN_MEMORY' )
                    {
                    // InternalDomain.g:5241:3: (enumLiteral_10= 'HYPERSONIC_IN_MEMORY' )
                    // InternalDomain.g:5242:4: enumLiteral_10= 'HYPERSONIC_IN_MEMORY'
                    {
                    enumLiteral_10=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getDbTypeAccess().getHypersonicInMemoryEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getDbTypeAccess().getHypersonicInMemoryEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalDomain.g:5249:3: (enumLiteral_11= 'HYPERSONIC_PERSISTENT' )
                    {
                    // InternalDomain.g:5249:3: (enumLiteral_11= 'HYPERSONIC_PERSISTENT' )
                    // InternalDomain.g:5250:4: enumLiteral_11= 'HYPERSONIC_PERSISTENT'
                    {
                    enumLiteral_11=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getDbTypeAccess().getHypersonicPersistentEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getDbTypeAccess().getHypersonicPersistentEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalDomain.g:5257:3: (enumLiteral_12= 'MSSQL' )
                    {
                    // InternalDomain.g:5257:3: (enumLiteral_12= 'MSSQL' )
                    // InternalDomain.g:5258:4: enumLiteral_12= 'MSSQL'
                    {
                    enumLiteral_12=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getDbTypeAccess().getMsSqlEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getDbTypeAccess().getMsSqlEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalDomain.g:5265:3: (enumLiteral_13= 'POSTGRES' )
                    {
                    // InternalDomain.g:5265:3: (enumLiteral_13= 'POSTGRES' )
                    // InternalDomain.g:5266:4: enumLiteral_13= 'POSTGRES'
                    {
                    enumLiteral_13=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getDbTypeAccess().getPostgresEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getDbTypeAccess().getPostgresEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalDomain.g:5273:3: (enumLiteral_14= 'SYBASE' )
                    {
                    // InternalDomain.g:5273:3: (enumLiteral_14= 'SYBASE' )
                    // InternalDomain.g:5274:4: enumLiteral_14= 'SYBASE'
                    {
                    enumLiteral_14=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getDbTypeAccess().getSybaseEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getDbTypeAccess().getSybaseEnumLiteralDeclaration_14());
                    			

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
    // $ANTLR end "ruleDbType"


    // $ANTLR start "ruleDbProvider"
    // InternalDomain.g:5284:1: ruleDbProvider returns [Enumerator current=null] : ( (enumLiteral_0= 'HIBERNATE' ) | (enumLiteral_1= 'DATANUCLEUS' ) | (enumLiteral_2= 'ECLIPSELINK' ) | (enumLiteral_3= 'OPENJPA' ) ) ;
    public final Enumerator ruleDbProvider() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDomain.g:5290:2: ( ( (enumLiteral_0= 'HIBERNATE' ) | (enumLiteral_1= 'DATANUCLEUS' ) | (enumLiteral_2= 'ECLIPSELINK' ) | (enumLiteral_3= 'OPENJPA' ) ) )
            // InternalDomain.g:5291:2: ( (enumLiteral_0= 'HIBERNATE' ) | (enumLiteral_1= 'DATANUCLEUS' ) | (enumLiteral_2= 'ECLIPSELINK' ) | (enumLiteral_3= 'OPENJPA' ) )
            {
            // InternalDomain.g:5291:2: ( (enumLiteral_0= 'HIBERNATE' ) | (enumLiteral_1= 'DATANUCLEUS' ) | (enumLiteral_2= 'ECLIPSELINK' ) | (enumLiteral_3= 'OPENJPA' ) )
            int alt99=4;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt99=1;
                }
                break;
            case 121:
                {
                alt99=2;
                }
                break;
            case 122:
                {
                alt99=3;
                }
                break;
            case 123:
                {
                alt99=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalDomain.g:5292:3: (enumLiteral_0= 'HIBERNATE' )
                    {
                    // InternalDomain.g:5292:3: (enumLiteral_0= 'HIBERNATE' )
                    // InternalDomain.g:5293:4: enumLiteral_0= 'HIBERNATE'
                    {
                    enumLiteral_0=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getDbProviderAccess().getHibernateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDbProviderAccess().getHibernateEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:5300:3: (enumLiteral_1= 'DATANUCLEUS' )
                    {
                    // InternalDomain.g:5300:3: (enumLiteral_1= 'DATANUCLEUS' )
                    // InternalDomain.g:5301:4: enumLiteral_1= 'DATANUCLEUS'
                    {
                    enumLiteral_1=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getDbProviderAccess().getDataNucleusEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDbProviderAccess().getDataNucleusEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomain.g:5308:3: (enumLiteral_2= 'ECLIPSELINK' )
                    {
                    // InternalDomain.g:5308:3: (enumLiteral_2= 'ECLIPSELINK' )
                    // InternalDomain.g:5309:4: enumLiteral_2= 'ECLIPSELINK'
                    {
                    enumLiteral_2=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getDbProviderAccess().getEclipseLinkEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDbProviderAccess().getEclipseLinkEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomain.g:5316:3: (enumLiteral_3= 'OPENJPA' )
                    {
                    // InternalDomain.g:5316:3: (enumLiteral_3= 'OPENJPA' )
                    // InternalDomain.g:5317:4: enumLiteral_3= 'OPENJPA'
                    {
                    enumLiteral_3=(Token)match(input,123,FOLLOW_2); 

                    				current = grammarAccess.getDbProviderAccess().getOpenJPAEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDbProviderAccess().getOpenJPAEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleDbProvider"


    // $ANTLR start "ruleJpaEnumType"
    // InternalDomain.g:5327:1: ruleJpaEnumType returns [Enumerator current=null] : ( (enumLiteral_0= 'ORDINAL' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'NONE' ) ) ;
    public final Enumerator ruleJpaEnumType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDomain.g:5333:2: ( ( (enumLiteral_0= 'ORDINAL' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'NONE' ) ) )
            // InternalDomain.g:5334:2: ( (enumLiteral_0= 'ORDINAL' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'NONE' ) )
            {
            // InternalDomain.g:5334:2: ( (enumLiteral_0= 'ORDINAL' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'NONE' ) )
            int alt100=3;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt100=1;
                }
                break;
            case 125:
                {
                alt100=2;
                }
                break;
            case 104:
                {
                alt100=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalDomain.g:5335:3: (enumLiteral_0= 'ORDINAL' )
                    {
                    // InternalDomain.g:5335:3: (enumLiteral_0= 'ORDINAL' )
                    // InternalDomain.g:5336:4: enumLiteral_0= 'ORDINAL'
                    {
                    enumLiteral_0=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getJpaEnumTypeAccess().getOrdinalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJpaEnumTypeAccess().getOrdinalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:5343:3: (enumLiteral_1= 'STRING' )
                    {
                    // InternalDomain.g:5343:3: (enumLiteral_1= 'STRING' )
                    // InternalDomain.g:5344:4: enumLiteral_1= 'STRING'
                    {
                    enumLiteral_1=(Token)match(input,125,FOLLOW_2); 

                    				current = grammarAccess.getJpaEnumTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJpaEnumTypeAccess().getStringEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomain.g:5351:3: (enumLiteral_2= 'NONE' )
                    {
                    // InternalDomain.g:5351:3: (enumLiteral_2= 'NONE' )
                    // InternalDomain.g:5352:4: enumLiteral_2= 'NONE'
                    {
                    enumLiteral_2=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getJpaEnumTypeAccess().getNoneEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJpaEnumTypeAccess().getNoneEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleJpaEnumType"

    // Delegated rules


    protected DFA81 dfa81 = new DFA81(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\16\15\uffff";
    static final String dfa_3s = "\1\123\15\uffff";
    static final String dfa_4s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_5s = "\1\0\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\71\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 3949:6: ( ({...}? => ( ({...}? => (otherlv_3= 'types' ( (lv_types_4_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'controller' ( (lv_controller_6_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'resources' ( (lv_resources_8_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties' ( (lv_properties_10_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'views' ( (lv_views_12_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'web-xml' ( (lv_webxml_14_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'pom' ( (lv_pom_16_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'styles' ( (lv_styles_18_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'classes' ( (lv_classes_20_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'layouts' ( (lv_layouts_22_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'web-mvc' ( (lv_webmvc_24_0= ruleInclusionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tags' ( (lv_tags_26_0= ruleInclusionType ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_0 = input.LA(1);

                         
                        int index81_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA81_0==14) ) {s = 1;}

                        else if ( LA81_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA81_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA81_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA81_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA81_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA81_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA81_0 == 78 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA81_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA81_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA81_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA81_0 == 82 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA81_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenerationInclusionAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                         
                        input.seek(index81_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x4000000183094000L,0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000183094000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300002L,0x0000003C00000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000C002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00DFC83510C04010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010C04000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010804000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800200002L,0x0000003C00000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800200002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800200022L,0x0000003C00000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800200022L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800200062L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000001CA00200002L,0x0000003C00000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000001CA00200002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000310A00200002L,0x0000003C00000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000310800200002L,0x0000003C00000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000310800200002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000C00000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010A00200002L,0x0000003C00000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000010A00200002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100000000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0100020000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100040000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0300000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0300020000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0300040000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000A00200002L,0x0000003C00000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000A00200002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0020000000000002L,0x0000003C00000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x3000010000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000003C00000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0200000000000040L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x8000000008004000L,0x0000000008000081L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x8000000008004000L,0x0000000000000081L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x8000000008004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000008004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000004000L,0x000000000000007CL});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x00000000000FFF00L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x000001C000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000004000L,0x00000000000FFF00L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000004000L,0x0000000003C00001L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000004000L,0x0000000003800001L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000004000L,0x0000000003000001L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000004000L,0x0000000002000001L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000004000L,0x0000000004100000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x00FFFE0000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000004000L,0x00000003F0000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0F00000000000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000030L});

}
