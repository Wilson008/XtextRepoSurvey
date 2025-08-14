package jpadsl.parser.antlr.internal;

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
import jpadsl.services.JPADslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJPADslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'package'", "'{'", "'}'", "'datatype'", "'databaseMode'", "'entity'", "'extends'", "'read only'", "'cacheable'", "'unique id'", "'embedded id'", "'staticAttribute'", "':'", "'attribute'", "'transient'", "'id attribute'", "'one to one join column'", "'one to one mapped by'", "'one to many using join table'", "'one to many using join column'", "'one to many mapped by'", "'many to one using join column'", "'many to one using join table'", "'many to one mapped by'", "'many to many join table'", "'many to many mapped by'", "'ref'", "'opposite'", "'op'", "'('", "','", "')'", "'*'", "'.*'", "'.'", "'public'", "'private'", "'protected'"
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
    public static final int RULE_ID=4;
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


        public InternalJPADslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJPADslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJPADslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJPADsl.g"; }



     	private JPADslGrammarAccess grammarAccess;

        public InternalJPADslParser(TokenStream input, JPADslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected JPADslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalJPADsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalJPADsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalJPADsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalJPADsl.g:72:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:78:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalJPADsl.g:79:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalJPADsl.g:79:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==15||LA1_0==17||(LA1_0>=28 && LA1_0<=37)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJPADsl.g:80:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalJPADsl.g:80:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalJPADsl.g:81:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"jpadsl.JPADsl.AbstractElement");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalJPADsl.g:101:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalJPADsl.g:101:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalJPADsl.g:102:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalJPADsl.g:108:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_RelationshipAttribute_3= ruleRelationshipAttribute ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Type_1 = null;

        EObject this_Import_2 = null;

        EObject this_RelationshipAttribute_3 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:114:2: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_RelationshipAttribute_3= ruleRelationshipAttribute ) )
            // InternalJPADsl.g:115:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_RelationshipAttribute_3= ruleRelationshipAttribute )
            {
            // InternalJPADsl.g:115:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_RelationshipAttribute_3= ruleRelationshipAttribute )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 15:
            case 17:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
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
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalJPADsl.g:116:3: this_PackageDeclaration_0= rulePackageDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;


                    			current = this_PackageDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:125:3: this_Type_1= ruleType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_1=ruleType();

                    state._fsp--;


                    			current = this_Type_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJPADsl.g:134:3: this_Import_2= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_2=ruleImport();

                    state._fsp--;


                    			current = this_Import_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJPADsl.g:143:3: this_RelationshipAttribute_3= ruleRelationshipAttribute
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getRelationshipAttributeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelationshipAttribute_3=ruleRelationshipAttribute();

                    state._fsp--;


                    			current = this_RelationshipAttribute_3;
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleImport"
    // InternalJPADsl.g:155:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalJPADsl.g:155:47: (iv_ruleImport= ruleImport EOF )
            // InternalJPADsl.g:156:2: iv_ruleImport= ruleImport EOF
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
    // InternalJPADsl.g:162:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:168:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // InternalJPADsl.g:169:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // InternalJPADsl.g:169:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // InternalJPADsl.g:170:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalJPADsl.g:174:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // InternalJPADsl.g:175:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // InternalJPADsl.g:175:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // InternalJPADsl.g:176:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"jpadsl.JPADsl.QualifiedNameWithWildCard");
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


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalJPADsl.g:197:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalJPADsl.g:197:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalJPADsl.g:198:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalJPADsl.g:204:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_databaseModes_3_0= ruleDatabaseMode ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_databaseModes_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:210:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_databaseModes_3_0= ruleDatabaseMode ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' ) )
            // InternalJPADsl.g:211:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_databaseModes_3_0= ruleDatabaseMode ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' )
            {
            // InternalJPADsl.g:211:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_databaseModes_3_0= ruleDatabaseMode ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' )
            // InternalJPADsl.g:212:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_databaseModes_3_0= ruleDatabaseMode ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalJPADsl.g:216:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalJPADsl.g:217:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalJPADsl.g:217:4: (lv_name_1_0= ruleQualifiedName )
            // InternalJPADsl.g:218:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"jpadsl.JPADsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJPADsl.g:239:3: ( (lv_databaseModes_3_0= ruleDatabaseMode ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJPADsl.g:240:4: (lv_databaseModes_3_0= ruleDatabaseMode )
            	    {
            	    // InternalJPADsl.g:240:4: (lv_databaseModes_3_0= ruleDatabaseMode )
            	    // InternalJPADsl.g:241:5: lv_databaseModes_3_0= ruleDatabaseMode
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getDatabaseModesDatabaseModeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_databaseModes_3_0=ruleDatabaseMode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"databaseModes",
            	    						lv_databaseModes_3_0,
            	    						"jpadsl.JPADsl.DatabaseMode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalJPADsl.g:258:3: ( (lv_elements_4_0= ruleAbstractElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=12)||LA4_0==15||LA4_0==17||(LA4_0>=28 && LA4_0<=37)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalJPADsl.g:259:4: (lv_elements_4_0= ruleAbstractElement )
            	    {
            	    // InternalJPADsl.g:259:4: (lv_elements_4_0= ruleAbstractElement )
            	    // InternalJPADsl.g:260:5: lv_elements_4_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elements_4_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"jpadsl.JPADsl.AbstractElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleType"
    // InternalJPADsl.g:285:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalJPADsl.g:285:45: (iv_ruleType= ruleType EOF )
            // InternalJPADsl.g:286:2: iv_ruleType= ruleType EOF
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
    // InternalJPADsl.g:292:1: ruleType returns [EObject current=null] : (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_DataType_1 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:298:2: ( (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType ) )
            // InternalJPADsl.g:299:2: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType )
            {
            // InternalJPADsl.g:299:2: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalJPADsl.g:300:3: this_Entity_0= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:309:3: this_DataType_1= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_1=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_1;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalJPADsl.g:321:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalJPADsl.g:321:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalJPADsl.g:322:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalJPADsl.g:328:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalJPADsl.g:334:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalJPADsl.g:335:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalJPADsl.g:335:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalJPADsl.g:336:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalJPADsl.g:340:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:341:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:341:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:342:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleDatabaseMode"
    // InternalJPADsl.g:362:1: entryRuleDatabaseMode returns [EObject current=null] : iv_ruleDatabaseMode= ruleDatabaseMode EOF ;
    public final EObject entryRuleDatabaseMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabaseMode = null;


        try {
            // InternalJPADsl.g:362:53: (iv_ruleDatabaseMode= ruleDatabaseMode EOF )
            // InternalJPADsl.g:363:2: iv_ruleDatabaseMode= ruleDatabaseMode EOF
            {
             newCompositeNode(grammarAccess.getDatabaseModeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabaseMode=ruleDatabaseMode();

            state._fsp--;

             current =iv_ruleDatabaseMode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatabaseMode"


    // $ANTLR start "ruleDatabaseMode"
    // InternalJPADsl.g:369:1: ruleDatabaseMode returns [EObject current=null] : (otherlv_0= 'databaseMode' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDatabaseMode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalJPADsl.g:375:2: ( (otherlv_0= 'databaseMode' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalJPADsl.g:376:2: (otherlv_0= 'databaseMode' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalJPADsl.g:376:2: (otherlv_0= 'databaseMode' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalJPADsl.g:377:3: otherlv_0= 'databaseMode' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseModeAccess().getDatabaseModeKeyword_0());
            		
            // InternalJPADsl.g:381:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:382:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:382:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:383:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDatabaseModeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseModeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleDatabaseMode"


    // $ANTLR start "entryRuleEntity"
    // InternalJPADsl.g:403:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalJPADsl.g:403:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalJPADsl.g:404:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalJPADsl.g:410:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_readOnly_5_0= ruleReadOnly ) )? ( (lv_cacheable_6_0= ruleCacheable ) )? otherlv_7= '{' ( (lv_identifier_8_0= ruleIdentifier ) ) ( (lv_imports_9_0= ruleImport ) )* ( (lv_features_10_0= ruleFeature ) )* otherlv_11= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        EObject lv_readOnly_5_0 = null;

        EObject lv_cacheable_6_0 = null;

        EObject lv_identifier_8_0 = null;

        EObject lv_imports_9_0 = null;

        EObject lv_features_10_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:416:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_readOnly_5_0= ruleReadOnly ) )? ( (lv_cacheable_6_0= ruleCacheable ) )? otherlv_7= '{' ( (lv_identifier_8_0= ruleIdentifier ) ) ( (lv_imports_9_0= ruleImport ) )* ( (lv_features_10_0= ruleFeature ) )* otherlv_11= '}' ) )
            // InternalJPADsl.g:417:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_readOnly_5_0= ruleReadOnly ) )? ( (lv_cacheable_6_0= ruleCacheable ) )? otherlv_7= '{' ( (lv_identifier_8_0= ruleIdentifier ) ) ( (lv_imports_9_0= ruleImport ) )* ( (lv_features_10_0= ruleFeature ) )* otherlv_11= '}' )
            {
            // InternalJPADsl.g:417:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_readOnly_5_0= ruleReadOnly ) )? ( (lv_cacheable_6_0= ruleCacheable ) )? otherlv_7= '{' ( (lv_identifier_8_0= ruleIdentifier ) ) ( (lv_imports_9_0= ruleImport ) )* ( (lv_features_10_0= ruleFeature ) )* otherlv_11= '}' )
            // InternalJPADsl.g:418:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( (lv_readOnly_5_0= ruleReadOnly ) )? ( (lv_cacheable_6_0= ruleCacheable ) )? otherlv_7= '{' ( (lv_identifier_8_0= ruleIdentifier ) ) ( (lv_imports_9_0= ruleImport ) )* ( (lv_features_10_0= ruleFeature ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalJPADsl.g:422:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:423:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:423:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:424:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalJPADsl.g:440:3: ( (otherlv_2= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJPADsl.g:441:4: (otherlv_2= RULE_ID )
                    {
                    // InternalJPADsl.g:441:4: (otherlv_2= RULE_ID )
                    // InternalJPADsl.g:442:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

                    					newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getDatabaseVendorDatabaseModeCrossReference_2_0());
                    				

                    }


                    }
                    break;

            }

            // InternalJPADsl.g:453:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJPADsl.g:454:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
                    			
                    // InternalJPADsl.g:458:4: ( (otherlv_4= RULE_ID ) )
                    // InternalJPADsl.g:459:5: (otherlv_4= RULE_ID )
                    {
                    // InternalJPADsl.g:459:5: (otherlv_4= RULE_ID )
                    // InternalJPADsl.g:460:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJPADsl.g:472:3: ( (lv_readOnly_5_0= ruleReadOnly ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJPADsl.g:473:4: (lv_readOnly_5_0= ruleReadOnly )
                    {
                    // InternalJPADsl.g:473:4: (lv_readOnly_5_0= ruleReadOnly )
                    // InternalJPADsl.g:474:5: lv_readOnly_5_0= ruleReadOnly
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getReadOnlyReadOnlyParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_readOnly_5_0=ruleReadOnly();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityRule());
                    					}
                    					set(
                    						current,
                    						"readOnly",
                    						lv_readOnly_5_0,
                    						"jpadsl.JPADsl.ReadOnly");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalJPADsl.g:491:3: ( (lv_cacheable_6_0= ruleCacheable ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJPADsl.g:492:4: (lv_cacheable_6_0= ruleCacheable )
                    {
                    // InternalJPADsl.g:492:4: (lv_cacheable_6_0= ruleCacheable )
                    // InternalJPADsl.g:493:5: lv_cacheable_6_0= ruleCacheable
                    {

                    					newCompositeNode(grammarAccess.getEntityAccess().getCacheableCacheableParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_cacheable_6_0=ruleCacheable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntityRule());
                    					}
                    					set(
                    						current,
                    						"cacheable",
                    						lv_cacheable_6_0,
                    						"jpadsl.JPADsl.Cacheable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalJPADsl.g:514:3: ( (lv_identifier_8_0= ruleIdentifier ) )
            // InternalJPADsl.g:515:4: (lv_identifier_8_0= ruleIdentifier )
            {
            // InternalJPADsl.g:515:4: (lv_identifier_8_0= ruleIdentifier )
            // InternalJPADsl.g:516:5: lv_identifier_8_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getIdentifierIdentifierParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_13);
            lv_identifier_8_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"identifier",
            						lv_identifier_8_0,
            						"jpadsl.JPADsl.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJPADsl.g:533:3: ( (lv_imports_9_0= ruleImport ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJPADsl.g:534:4: (lv_imports_9_0= ruleImport )
            	    {
            	    // InternalJPADsl.g:534:4: (lv_imports_9_0= ruleImport )
            	    // InternalJPADsl.g:535:5: lv_imports_9_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getImportsImportParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_imports_9_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_9_0,
            	    						"jpadsl.JPADsl.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalJPADsl.g:552:3: ( (lv_features_10_0= ruleFeature ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==23||(LA11_0>=25 && LA11_0<=38)||LA11_0==40||(LA11_0>=47 && LA11_0<=49)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJPADsl.g:553:4: (lv_features_10_0= ruleFeature )
            	    {
            	    // InternalJPADsl.g:553:4: (lv_features_10_0= ruleFeature )
            	    // InternalJPADsl.g:554:5: lv_features_10_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_features_10_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_10_0,
            	    						"jpadsl.JPADsl.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleReadOnly"
    // InternalJPADsl.g:579:1: entryRuleReadOnly returns [EObject current=null] : iv_ruleReadOnly= ruleReadOnly EOF ;
    public final EObject entryRuleReadOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadOnly = null;


        try {
            // InternalJPADsl.g:579:49: (iv_ruleReadOnly= ruleReadOnly EOF )
            // InternalJPADsl.g:580:2: iv_ruleReadOnly= ruleReadOnly EOF
            {
             newCompositeNode(grammarAccess.getReadOnlyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadOnly=ruleReadOnly();

            state._fsp--;

             current =iv_ruleReadOnly; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReadOnly"


    // $ANTLR start "ruleReadOnly"
    // InternalJPADsl.g:586:1: ruleReadOnly returns [EObject current=null] : (otherlv_0= 'read only' ( (lv_tableName_1_0= RULE_STRING ) ) ( (lv_idColumn_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleReadOnly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_tableName_1_0=null;
        Token lv_idColumn_2_0=null;


        	enterRule();

        try {
            // InternalJPADsl.g:592:2: ( (otherlv_0= 'read only' ( (lv_tableName_1_0= RULE_STRING ) ) ( (lv_idColumn_2_0= RULE_STRING ) ) ) )
            // InternalJPADsl.g:593:2: (otherlv_0= 'read only' ( (lv_tableName_1_0= RULE_STRING ) ) ( (lv_idColumn_2_0= RULE_STRING ) ) )
            {
            // InternalJPADsl.g:593:2: (otherlv_0= 'read only' ( (lv_tableName_1_0= RULE_STRING ) ) ( (lv_idColumn_2_0= RULE_STRING ) ) )
            // InternalJPADsl.g:594:3: otherlv_0= 'read only' ( (lv_tableName_1_0= RULE_STRING ) ) ( (lv_idColumn_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getReadOnlyAccess().getReadOnlyKeyword_0());
            		
            // InternalJPADsl.g:598:3: ( (lv_tableName_1_0= RULE_STRING ) )
            // InternalJPADsl.g:599:4: (lv_tableName_1_0= RULE_STRING )
            {
            // InternalJPADsl.g:599:4: (lv_tableName_1_0= RULE_STRING )
            // InternalJPADsl.g:600:5: lv_tableName_1_0= RULE_STRING
            {
            lv_tableName_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_tableName_1_0, grammarAccess.getReadOnlyAccess().getTableNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadOnlyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tableName",
            						lv_tableName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalJPADsl.g:616:3: ( (lv_idColumn_2_0= RULE_STRING ) )
            // InternalJPADsl.g:617:4: (lv_idColumn_2_0= RULE_STRING )
            {
            // InternalJPADsl.g:617:4: (lv_idColumn_2_0= RULE_STRING )
            // InternalJPADsl.g:618:5: lv_idColumn_2_0= RULE_STRING
            {
            lv_idColumn_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_idColumn_2_0, grammarAccess.getReadOnlyAccess().getIdColumnSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadOnlyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"idColumn",
            						lv_idColumn_2_0,
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
    // $ANTLR end "ruleReadOnly"


    // $ANTLR start "entryRuleCacheable"
    // InternalJPADsl.g:638:1: entryRuleCacheable returns [EObject current=null] : iv_ruleCacheable= ruleCacheable EOF ;
    public final EObject entryRuleCacheable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCacheable = null;


        try {
            // InternalJPADsl.g:638:50: (iv_ruleCacheable= ruleCacheable EOF )
            // InternalJPADsl.g:639:2: iv_ruleCacheable= ruleCacheable EOF
            {
             newCompositeNode(grammarAccess.getCacheableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCacheable=ruleCacheable();

            state._fsp--;

             current =iv_ruleCacheable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCacheable"


    // $ANTLR start "ruleCacheable"
    // InternalJPADsl.g:645:1: ruleCacheable returns [EObject current=null] : (otherlv_0= 'cacheable' () ) ;
    public final EObject ruleCacheable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalJPADsl.g:651:2: ( (otherlv_0= 'cacheable' () ) )
            // InternalJPADsl.g:652:2: (otherlv_0= 'cacheable' () )
            {
            // InternalJPADsl.g:652:2: (otherlv_0= 'cacheable' () )
            // InternalJPADsl.g:653:3: otherlv_0= 'cacheable' ()
            {
            otherlv_0=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getCacheableAccess().getCacheableKeyword_0());
            		
            // InternalJPADsl.g:657:3: ()
            // InternalJPADsl.g:658:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCacheableAccess().getCacheableAction_1(),
            					current);
            			

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
    // $ANTLR end "ruleCacheable"


    // $ANTLR start "entryRuleIdentifier"
    // InternalJPADsl.g:668:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalJPADsl.g:668:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalJPADsl.g:669:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalJPADsl.g:675:1: ruleIdentifier returns [EObject current=null] : (this_UniqueIdentiferColumn_0= ruleUniqueIdentiferColumn | this_EmbeddedUniqueIdentifer_1= ruleEmbeddedUniqueIdentifer ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject this_UniqueIdentiferColumn_0 = null;

        EObject this_EmbeddedUniqueIdentifer_1 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:681:2: ( (this_UniqueIdentiferColumn_0= ruleUniqueIdentiferColumn | this_EmbeddedUniqueIdentifer_1= ruleEmbeddedUniqueIdentifer ) )
            // InternalJPADsl.g:682:2: (this_UniqueIdentiferColumn_0= ruleUniqueIdentiferColumn | this_EmbeddedUniqueIdentifer_1= ruleEmbeddedUniqueIdentifer )
            {
            // InternalJPADsl.g:682:2: (this_UniqueIdentiferColumn_0= ruleUniqueIdentiferColumn | this_EmbeddedUniqueIdentifer_1= ruleEmbeddedUniqueIdentifer )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalJPADsl.g:683:3: this_UniqueIdentiferColumn_0= ruleUniqueIdentiferColumn
                    {

                    			newCompositeNode(grammarAccess.getIdentifierAccess().getUniqueIdentiferColumnParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UniqueIdentiferColumn_0=ruleUniqueIdentiferColumn();

                    state._fsp--;


                    			current = this_UniqueIdentiferColumn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:692:3: this_EmbeddedUniqueIdentifer_1= ruleEmbeddedUniqueIdentifer
                    {

                    			newCompositeNode(grammarAccess.getIdentifierAccess().getEmbeddedUniqueIdentiferParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EmbeddedUniqueIdentifer_1=ruleEmbeddedUniqueIdentifer();

                    state._fsp--;


                    			current = this_EmbeddedUniqueIdentifer_1;
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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleUniqueIdentiferColumn"
    // InternalJPADsl.g:704:1: entryRuleUniqueIdentiferColumn returns [EObject current=null] : iv_ruleUniqueIdentiferColumn= ruleUniqueIdentiferColumn EOF ;
    public final EObject entryRuleUniqueIdentiferColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueIdentiferColumn = null;


        try {
            // InternalJPADsl.g:704:62: (iv_ruleUniqueIdentiferColumn= ruleUniqueIdentiferColumn EOF )
            // InternalJPADsl.g:705:2: iv_ruleUniqueIdentiferColumn= ruleUniqueIdentiferColumn EOF
            {
             newCompositeNode(grammarAccess.getUniqueIdentiferColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUniqueIdentiferColumn=ruleUniqueIdentiferColumn();

            state._fsp--;

             current =iv_ruleUniqueIdentiferColumn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUniqueIdentiferColumn"


    // $ANTLR start "ruleUniqueIdentiferColumn"
    // InternalJPADsl.g:711:1: ruleUniqueIdentiferColumn returns [EObject current=null] : (otherlv_0= 'unique id' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUniqueIdentiferColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalJPADsl.g:717:2: ( (otherlv_0= 'unique id' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalJPADsl.g:718:2: (otherlv_0= 'unique id' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalJPADsl.g:718:2: (otherlv_0= 'unique id' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalJPADsl.g:719:3: otherlv_0= 'unique id' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUniqueIdentiferColumnAccess().getUniqueIdKeyword_0());
            		
            // InternalJPADsl.g:723:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:724:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:724:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:725:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUniqueIdentiferColumnAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUniqueIdentiferColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleUniqueIdentiferColumn"


    // $ANTLR start "entryRuleEmbeddedUniqueIdentifer"
    // InternalJPADsl.g:745:1: entryRuleEmbeddedUniqueIdentifer returns [EObject current=null] : iv_ruleEmbeddedUniqueIdentifer= ruleEmbeddedUniqueIdentifer EOF ;
    public final EObject entryRuleEmbeddedUniqueIdentifer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmbeddedUniqueIdentifer = null;


        try {
            // InternalJPADsl.g:745:64: (iv_ruleEmbeddedUniqueIdentifer= ruleEmbeddedUniqueIdentifer EOF )
            // InternalJPADsl.g:746:2: iv_ruleEmbeddedUniqueIdentifer= ruleEmbeddedUniqueIdentifer EOF
            {
             newCompositeNode(grammarAccess.getEmbeddedUniqueIdentiferRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmbeddedUniqueIdentifer=ruleEmbeddedUniqueIdentifer();

            state._fsp--;

             current =iv_ruleEmbeddedUniqueIdentifer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmbeddedUniqueIdentifer"


    // $ANTLR start "ruleEmbeddedUniqueIdentifer"
    // InternalJPADsl.g:752:1: ruleEmbeddedUniqueIdentifer returns [EObject current=null] : (otherlv_0= 'embedded id' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEmbeddedUniqueIdentifer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalJPADsl.g:758:2: ( (otherlv_0= 'embedded id' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalJPADsl.g:759:2: (otherlv_0= 'embedded id' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalJPADsl.g:759:2: (otherlv_0= 'embedded id' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalJPADsl.g:760:3: otherlv_0= 'embedded id' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEmbeddedUniqueIdentiferAccess().getEmbeddedIdKeyword_0());
            		
            // InternalJPADsl.g:764:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:765:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:765:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:766:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEmbeddedUniqueIdentiferAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmbeddedUniqueIdentiferRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleEmbeddedUniqueIdentifer"


    // $ANTLR start "entryRuleFeature"
    // InternalJPADsl.g:786:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalJPADsl.g:786:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalJPADsl.g:787:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalJPADsl.g:793:1: ruleFeature returns [EObject current=null] : (this_StructuralFeature_0= ruleStructuralFeature | this_Operation_1= ruleOperation ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_StructuralFeature_0 = null;

        EObject this_Operation_1 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:799:2: ( (this_StructuralFeature_0= ruleStructuralFeature | this_Operation_1= ruleOperation ) )
            // InternalJPADsl.g:800:2: (this_StructuralFeature_0= ruleStructuralFeature | this_Operation_1= ruleOperation )
            {
            // InternalJPADsl.g:800:2: (this_StructuralFeature_0= ruleStructuralFeature | this_Operation_1= ruleOperation )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==23||(LA13_0>=25 && LA13_0<=38)) ) {
                alt13=1;
            }
            else if ( (LA13_0==40||(LA13_0>=47 && LA13_0<=49)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalJPADsl.g:801:3: this_StructuralFeature_0= ruleStructuralFeature
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StructuralFeature_0=ruleStructuralFeature();

                    state._fsp--;


                    			current = this_StructuralFeature_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:810:3: this_Operation_1= ruleOperation
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_1=ruleOperation();

                    state._fsp--;


                    			current = this_Operation_1;
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleStructuralFeature"
    // InternalJPADsl.g:822:1: entryRuleStructuralFeature returns [EObject current=null] : iv_ruleStructuralFeature= ruleStructuralFeature EOF ;
    public final EObject entryRuleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuralFeature = null;


        try {
            // InternalJPADsl.g:822:58: (iv_ruleStructuralFeature= ruleStructuralFeature EOF )
            // InternalJPADsl.g:823:2: iv_ruleStructuralFeature= ruleStructuralFeature EOF
            {
             newCompositeNode(grammarAccess.getStructuralFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructuralFeature=ruleStructuralFeature();

            state._fsp--;

             current =iv_ruleStructuralFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructuralFeature"


    // $ANTLR start "ruleStructuralFeature"
    // InternalJPADsl.g:829:1: ruleStructuralFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) ;
    public final EObject ruleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Reference_1 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:835:2: ( (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) )
            // InternalJPADsl.g:836:2: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            {
            // InternalJPADsl.g:836:2: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==23||(LA14_0>=25 && LA14_0<=37)) ) {
                alt14=1;
            }
            else if ( (LA14_0==38) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalJPADsl.g:837:3: this_Attribute_0= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:846:3: this_Reference_1= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_1=ruleReference();

                    state._fsp--;


                    			current = this_Reference_1;
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
    // $ANTLR end "ruleStructuralFeature"


    // $ANTLR start "entryRuleAttribute"
    // InternalJPADsl.g:858:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalJPADsl.g:858:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalJPADsl.g:859:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalJPADsl.g:865:1: ruleAttribute returns [EObject current=null] : (this_InternalAttribute_0= ruleInternalAttribute | this_RelationshipAttribute_1= ruleRelationshipAttribute | this_StaticAttribute_2= ruleStaticAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_InternalAttribute_0 = null;

        EObject this_RelationshipAttribute_1 = null;

        EObject this_StaticAttribute_2 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:871:2: ( (this_InternalAttribute_0= ruleInternalAttribute | this_RelationshipAttribute_1= ruleRelationshipAttribute | this_StaticAttribute_2= ruleStaticAttribute ) )
            // InternalJPADsl.g:872:2: (this_InternalAttribute_0= ruleInternalAttribute | this_RelationshipAttribute_1= ruleRelationshipAttribute | this_StaticAttribute_2= ruleStaticAttribute )
            {
            // InternalJPADsl.g:872:2: (this_InternalAttribute_0= ruleInternalAttribute | this_RelationshipAttribute_1= ruleRelationshipAttribute | this_StaticAttribute_2= ruleStaticAttribute )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 25:
            case 26:
            case 27:
                {
                alt15=1;
                }
                break;
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
                {
                alt15=2;
                }
                break;
            case 23:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalJPADsl.g:873:3: this_InternalAttribute_0= ruleInternalAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getInternalAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternalAttribute_0=ruleInternalAttribute();

                    state._fsp--;


                    			current = this_InternalAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:882:3: this_RelationshipAttribute_1= ruleRelationshipAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getRelationshipAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelationshipAttribute_1=ruleRelationshipAttribute();

                    state._fsp--;


                    			current = this_RelationshipAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJPADsl.g:891:3: this_StaticAttribute_2= ruleStaticAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getStaticAttributeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StaticAttribute_2=ruleStaticAttribute();

                    state._fsp--;


                    			current = this_StaticAttribute_2;
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleStaticAttribute"
    // InternalJPADsl.g:903:1: entryRuleStaticAttribute returns [EObject current=null] : iv_ruleStaticAttribute= ruleStaticAttribute EOF ;
    public final EObject entryRuleStaticAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticAttribute = null;


        try {
            // InternalJPADsl.g:903:56: (iv_ruleStaticAttribute= ruleStaticAttribute EOF )
            // InternalJPADsl.g:904:2: iv_ruleStaticAttribute= ruleStaticAttribute EOF
            {
             newCompositeNode(grammarAccess.getStaticAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaticAttribute=ruleStaticAttribute();

            state._fsp--;

             current =iv_ruleStaticAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticAttribute"


    // $ANTLR start "ruleStaticAttribute"
    // InternalJPADsl.g:910:1: ruleStaticAttribute returns [EObject current=null] : (otherlv_0= 'staticAttribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) ;
    public final EObject ruleStaticAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:916:2: ( (otherlv_0= 'staticAttribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) )
            // InternalJPADsl.g:917:2: (otherlv_0= 'staticAttribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            {
            // InternalJPADsl.g:917:2: (otherlv_0= 'staticAttribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            // InternalJPADsl.g:918:3: otherlv_0= 'staticAttribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStaticAttributeAccess().getStaticAttributeKeyword_0());
            		
            // InternalJPADsl.g:922:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:923:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:923:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:924:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStaticAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStaticAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getStaticAttributeAccess().getColonKeyword_2());
            		
            // InternalJPADsl.g:944:3: ( (lv_type_3_0= ruleTypeRef ) )
            // InternalJPADsl.g:945:4: (lv_type_3_0= ruleTypeRef )
            {
            // InternalJPADsl.g:945:4: (lv_type_3_0= ruleTypeRef )
            // InternalJPADsl.g:946:5: lv_type_3_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getStaticAttributeAccess().getTypeTypeRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaticAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jpadsl.JPADsl.TypeRef");
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
    // $ANTLR end "ruleStaticAttribute"


    // $ANTLR start "entryRuleInternalAttribute"
    // InternalJPADsl.g:967:1: entryRuleInternalAttribute returns [EObject current=null] : iv_ruleInternalAttribute= ruleInternalAttribute EOF ;
    public final EObject entryRuleInternalAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAttribute = null;


        try {
            // InternalJPADsl.g:967:58: (iv_ruleInternalAttribute= ruleInternalAttribute EOF )
            // InternalJPADsl.g:968:2: iv_ruleInternalAttribute= ruleInternalAttribute EOF
            {
             newCompositeNode(grammarAccess.getInternalAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalAttribute=ruleInternalAttribute();

            state._fsp--;

             current =iv_ruleInternalAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternalAttribute"


    // $ANTLR start "ruleInternalAttribute"
    // InternalJPADsl.g:974:1: ruleInternalAttribute returns [EObject current=null] : (this_ReadOnlyInternalAttribute_0= ruleReadOnlyInternalAttribute | this_UpdatableInternalAttribute_1= ruleUpdatableInternalAttribute | this_TransientAttribute_2= ruleTransientAttribute | this_IdAttribute_3= ruleIdAttribute ) ;
    public final EObject ruleInternalAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ReadOnlyInternalAttribute_0 = null;

        EObject this_UpdatableInternalAttribute_1 = null;

        EObject this_TransientAttribute_2 = null;

        EObject this_IdAttribute_3 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:980:2: ( (this_ReadOnlyInternalAttribute_0= ruleReadOnlyInternalAttribute | this_UpdatableInternalAttribute_1= ruleUpdatableInternalAttribute | this_TransientAttribute_2= ruleTransientAttribute | this_IdAttribute_3= ruleIdAttribute ) )
            // InternalJPADsl.g:981:2: (this_ReadOnlyInternalAttribute_0= ruleReadOnlyInternalAttribute | this_UpdatableInternalAttribute_1= ruleUpdatableInternalAttribute | this_TransientAttribute_2= ruleTransientAttribute | this_IdAttribute_3= ruleIdAttribute )
            {
            // InternalJPADsl.g:981:2: (this_ReadOnlyInternalAttribute_0= ruleReadOnlyInternalAttribute | this_UpdatableInternalAttribute_1= ruleUpdatableInternalAttribute | this_TransientAttribute_2= ruleTransientAttribute | this_IdAttribute_3= ruleIdAttribute )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case 25:
                {
                alt16=2;
                }
                break;
            case 26:
                {
                alt16=3;
                }
                break;
            case 27:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalJPADsl.g:982:3: this_ReadOnlyInternalAttribute_0= ruleReadOnlyInternalAttribute
                    {

                    			newCompositeNode(grammarAccess.getInternalAttributeAccess().getReadOnlyInternalAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReadOnlyInternalAttribute_0=ruleReadOnlyInternalAttribute();

                    state._fsp--;


                    			current = this_ReadOnlyInternalAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:991:3: this_UpdatableInternalAttribute_1= ruleUpdatableInternalAttribute
                    {

                    			newCompositeNode(grammarAccess.getInternalAttributeAccess().getUpdatableInternalAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UpdatableInternalAttribute_1=ruleUpdatableInternalAttribute();

                    state._fsp--;


                    			current = this_UpdatableInternalAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJPADsl.g:1000:3: this_TransientAttribute_2= ruleTransientAttribute
                    {

                    			newCompositeNode(grammarAccess.getInternalAttributeAccess().getTransientAttributeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransientAttribute_2=ruleTransientAttribute();

                    state._fsp--;


                    			current = this_TransientAttribute_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJPADsl.g:1009:3: this_IdAttribute_3= ruleIdAttribute
                    {

                    			newCompositeNode(grammarAccess.getInternalAttributeAccess().getIdAttributeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IdAttribute_3=ruleIdAttribute();

                    state._fsp--;


                    			current = this_IdAttribute_3;
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
    // $ANTLR end "ruleInternalAttribute"


    // $ANTLR start "entryRuleRelationshipAttribute"
    // InternalJPADsl.g:1021:1: entryRuleRelationshipAttribute returns [EObject current=null] : iv_ruleRelationshipAttribute= ruleRelationshipAttribute EOF ;
    public final EObject entryRuleRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipAttribute = null;


        try {
            // InternalJPADsl.g:1021:62: (iv_ruleRelationshipAttribute= ruleRelationshipAttribute EOF )
            // InternalJPADsl.g:1022:2: iv_ruleRelationshipAttribute= ruleRelationshipAttribute EOF
            {
             newCompositeNode(grammarAccess.getRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipAttribute=ruleRelationshipAttribute();

            state._fsp--;

             current =iv_ruleRelationshipAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationshipAttribute"


    // $ANTLR start "ruleRelationshipAttribute"
    // InternalJPADsl.g:1028:1: ruleRelationshipAttribute returns [EObject current=null] : (this_SingularRelationshipAttribute_0= ruleSingularRelationshipAttribute | this_MultipleRelationshipAttribute_1= ruleMultipleRelationshipAttribute ) ;
    public final EObject ruleRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_SingularRelationshipAttribute_0 = null;

        EObject this_MultipleRelationshipAttribute_1 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1034:2: ( (this_SingularRelationshipAttribute_0= ruleSingularRelationshipAttribute | this_MultipleRelationshipAttribute_1= ruleMultipleRelationshipAttribute ) )
            // InternalJPADsl.g:1035:2: (this_SingularRelationshipAttribute_0= ruleSingularRelationshipAttribute | this_MultipleRelationshipAttribute_1= ruleMultipleRelationshipAttribute )
            {
            // InternalJPADsl.g:1035:2: (this_SingularRelationshipAttribute_0= ruleSingularRelationshipAttribute | this_MultipleRelationshipAttribute_1= ruleMultipleRelationshipAttribute )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=28 && LA17_0<=29)||(LA17_0>=33 && LA17_0<=35)) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=30 && LA17_0<=32)||(LA17_0>=36 && LA17_0<=37)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalJPADsl.g:1036:3: this_SingularRelationshipAttribute_0= ruleSingularRelationshipAttribute
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAttributeAccess().getSingularRelationshipAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingularRelationshipAttribute_0=ruleSingularRelationshipAttribute();

                    state._fsp--;


                    			current = this_SingularRelationshipAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:1045:3: this_MultipleRelationshipAttribute_1= ruleMultipleRelationshipAttribute
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAttributeAccess().getMultipleRelationshipAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultipleRelationshipAttribute_1=ruleMultipleRelationshipAttribute();

                    state._fsp--;


                    			current = this_MultipleRelationshipAttribute_1;
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
    // $ANTLR end "ruleRelationshipAttribute"


    // $ANTLR start "entryRuleSingularRelationshipAttribute"
    // InternalJPADsl.g:1057:1: entryRuleSingularRelationshipAttribute returns [EObject current=null] : iv_ruleSingularRelationshipAttribute= ruleSingularRelationshipAttribute EOF ;
    public final EObject entryRuleSingularRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingularRelationshipAttribute = null;


        try {
            // InternalJPADsl.g:1057:70: (iv_ruleSingularRelationshipAttribute= ruleSingularRelationshipAttribute EOF )
            // InternalJPADsl.g:1058:2: iv_ruleSingularRelationshipAttribute= ruleSingularRelationshipAttribute EOF
            {
             newCompositeNode(grammarAccess.getSingularRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingularRelationshipAttribute=ruleSingularRelationshipAttribute();

            state._fsp--;

             current =iv_ruleSingularRelationshipAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingularRelationshipAttribute"


    // $ANTLR start "ruleSingularRelationshipAttribute"
    // InternalJPADsl.g:1064:1: ruleSingularRelationshipAttribute returns [EObject current=null] : (this_OneToOneRelationshipAttribute_0= ruleOneToOneRelationshipAttribute | this_OneToOneMappedByRelationshipAttribute_1= ruleOneToOneMappedByRelationshipAttribute | this_ManyToOneJoinColumnRelationShipAttribute_2= ruleManyToOneJoinColumnRelationShipAttribute | this_ManyToOneJoinTableRelationShipAttribute_3= ruleManyToOneJoinTableRelationShipAttribute | this_ManyToOneMappedByRelationShipAttribute_4= ruleManyToOneMappedByRelationShipAttribute ) ;
    public final EObject ruleSingularRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_OneToOneRelationshipAttribute_0 = null;

        EObject this_OneToOneMappedByRelationshipAttribute_1 = null;

        EObject this_ManyToOneJoinColumnRelationShipAttribute_2 = null;

        EObject this_ManyToOneJoinTableRelationShipAttribute_3 = null;

        EObject this_ManyToOneMappedByRelationShipAttribute_4 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1070:2: ( (this_OneToOneRelationshipAttribute_0= ruleOneToOneRelationshipAttribute | this_OneToOneMappedByRelationshipAttribute_1= ruleOneToOneMappedByRelationshipAttribute | this_ManyToOneJoinColumnRelationShipAttribute_2= ruleManyToOneJoinColumnRelationShipAttribute | this_ManyToOneJoinTableRelationShipAttribute_3= ruleManyToOneJoinTableRelationShipAttribute | this_ManyToOneMappedByRelationShipAttribute_4= ruleManyToOneMappedByRelationShipAttribute ) )
            // InternalJPADsl.g:1071:2: (this_OneToOneRelationshipAttribute_0= ruleOneToOneRelationshipAttribute | this_OneToOneMappedByRelationshipAttribute_1= ruleOneToOneMappedByRelationshipAttribute | this_ManyToOneJoinColumnRelationShipAttribute_2= ruleManyToOneJoinColumnRelationShipAttribute | this_ManyToOneJoinTableRelationShipAttribute_3= ruleManyToOneJoinTableRelationShipAttribute | this_ManyToOneMappedByRelationShipAttribute_4= ruleManyToOneMappedByRelationShipAttribute )
            {
            // InternalJPADsl.g:1071:2: (this_OneToOneRelationshipAttribute_0= ruleOneToOneRelationshipAttribute | this_OneToOneMappedByRelationshipAttribute_1= ruleOneToOneMappedByRelationshipAttribute | this_ManyToOneJoinColumnRelationShipAttribute_2= ruleManyToOneJoinColumnRelationShipAttribute | this_ManyToOneJoinTableRelationShipAttribute_3= ruleManyToOneJoinTableRelationShipAttribute | this_ManyToOneMappedByRelationShipAttribute_4= ruleManyToOneMappedByRelationShipAttribute )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt18=1;
                }
                break;
            case 29:
                {
                alt18=2;
                }
                break;
            case 33:
                {
                alt18=3;
                }
                break;
            case 34:
                {
                alt18=4;
                }
                break;
            case 35:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalJPADsl.g:1072:3: this_OneToOneRelationshipAttribute_0= ruleOneToOneRelationshipAttribute
                    {

                    			newCompositeNode(grammarAccess.getSingularRelationshipAttributeAccess().getOneToOneRelationshipAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OneToOneRelationshipAttribute_0=ruleOneToOneRelationshipAttribute();

                    state._fsp--;


                    			current = this_OneToOneRelationshipAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:1081:3: this_OneToOneMappedByRelationshipAttribute_1= ruleOneToOneMappedByRelationshipAttribute
                    {

                    			newCompositeNode(grammarAccess.getSingularRelationshipAttributeAccess().getOneToOneMappedByRelationshipAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OneToOneMappedByRelationshipAttribute_1=ruleOneToOneMappedByRelationshipAttribute();

                    state._fsp--;


                    			current = this_OneToOneMappedByRelationshipAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJPADsl.g:1090:3: this_ManyToOneJoinColumnRelationShipAttribute_2= ruleManyToOneJoinColumnRelationShipAttribute
                    {

                    			newCompositeNode(grammarAccess.getSingularRelationshipAttributeAccess().getManyToOneJoinColumnRelationShipAttributeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ManyToOneJoinColumnRelationShipAttribute_2=ruleManyToOneJoinColumnRelationShipAttribute();

                    state._fsp--;


                    			current = this_ManyToOneJoinColumnRelationShipAttribute_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJPADsl.g:1099:3: this_ManyToOneJoinTableRelationShipAttribute_3= ruleManyToOneJoinTableRelationShipAttribute
                    {

                    			newCompositeNode(grammarAccess.getSingularRelationshipAttributeAccess().getManyToOneJoinTableRelationShipAttributeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ManyToOneJoinTableRelationShipAttribute_3=ruleManyToOneJoinTableRelationShipAttribute();

                    state._fsp--;


                    			current = this_ManyToOneJoinTableRelationShipAttribute_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJPADsl.g:1108:3: this_ManyToOneMappedByRelationShipAttribute_4= ruleManyToOneMappedByRelationShipAttribute
                    {

                    			newCompositeNode(grammarAccess.getSingularRelationshipAttributeAccess().getManyToOneMappedByRelationShipAttributeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ManyToOneMappedByRelationShipAttribute_4=ruleManyToOneMappedByRelationShipAttribute();

                    state._fsp--;


                    			current = this_ManyToOneMappedByRelationShipAttribute_4;
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
    // $ANTLR end "ruleSingularRelationshipAttribute"


    // $ANTLR start "entryRuleMultipleRelationshipAttribute"
    // InternalJPADsl.g:1120:1: entryRuleMultipleRelationshipAttribute returns [EObject current=null] : iv_ruleMultipleRelationshipAttribute= ruleMultipleRelationshipAttribute EOF ;
    public final EObject entryRuleMultipleRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleRelationshipAttribute = null;


        try {
            // InternalJPADsl.g:1120:70: (iv_ruleMultipleRelationshipAttribute= ruleMultipleRelationshipAttribute EOF )
            // InternalJPADsl.g:1121:2: iv_ruleMultipleRelationshipAttribute= ruleMultipleRelationshipAttribute EOF
            {
             newCompositeNode(grammarAccess.getMultipleRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleRelationshipAttribute=ruleMultipleRelationshipAttribute();

            state._fsp--;

             current =iv_ruleMultipleRelationshipAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleRelationshipAttribute"


    // $ANTLR start "ruleMultipleRelationshipAttribute"
    // InternalJPADsl.g:1127:1: ruleMultipleRelationshipAttribute returns [EObject current=null] : (this_OneToManyJoinTableRelationshipAttribute_0= ruleOneToManyJoinTableRelationshipAttribute | this_OneToManyMappedByRelationshipAttribute_1= ruleOneToManyMappedByRelationshipAttribute | this_ManyToManyRelationshipAttribute_2= ruleManyToManyRelationshipAttribute | this_ManyToManyMappedByRelationshipAttribute_3= ruleManyToManyMappedByRelationshipAttribute | this_OneToManyJoinColumnRelationshipAttribute_4= ruleOneToManyJoinColumnRelationshipAttribute ) ;
    public final EObject ruleMultipleRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_OneToManyJoinTableRelationshipAttribute_0 = null;

        EObject this_OneToManyMappedByRelationshipAttribute_1 = null;

        EObject this_ManyToManyRelationshipAttribute_2 = null;

        EObject this_ManyToManyMappedByRelationshipAttribute_3 = null;

        EObject this_OneToManyJoinColumnRelationshipAttribute_4 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1133:2: ( (this_OneToManyJoinTableRelationshipAttribute_0= ruleOneToManyJoinTableRelationshipAttribute | this_OneToManyMappedByRelationshipAttribute_1= ruleOneToManyMappedByRelationshipAttribute | this_ManyToManyRelationshipAttribute_2= ruleManyToManyRelationshipAttribute | this_ManyToManyMappedByRelationshipAttribute_3= ruleManyToManyMappedByRelationshipAttribute | this_OneToManyJoinColumnRelationshipAttribute_4= ruleOneToManyJoinColumnRelationshipAttribute ) )
            // InternalJPADsl.g:1134:2: (this_OneToManyJoinTableRelationshipAttribute_0= ruleOneToManyJoinTableRelationshipAttribute | this_OneToManyMappedByRelationshipAttribute_1= ruleOneToManyMappedByRelationshipAttribute | this_ManyToManyRelationshipAttribute_2= ruleManyToManyRelationshipAttribute | this_ManyToManyMappedByRelationshipAttribute_3= ruleManyToManyMappedByRelationshipAttribute | this_OneToManyJoinColumnRelationshipAttribute_4= ruleOneToManyJoinColumnRelationshipAttribute )
            {
            // InternalJPADsl.g:1134:2: (this_OneToManyJoinTableRelationshipAttribute_0= ruleOneToManyJoinTableRelationshipAttribute | this_OneToManyMappedByRelationshipAttribute_1= ruleOneToManyMappedByRelationshipAttribute | this_ManyToManyRelationshipAttribute_2= ruleManyToManyRelationshipAttribute | this_ManyToManyMappedByRelationshipAttribute_3= ruleManyToManyMappedByRelationshipAttribute | this_OneToManyJoinColumnRelationshipAttribute_4= ruleOneToManyJoinColumnRelationshipAttribute )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt19=1;
                }
                break;
            case 32:
                {
                alt19=2;
                }
                break;
            case 36:
                {
                alt19=3;
                }
                break;
            case 37:
                {
                alt19=4;
                }
                break;
            case 31:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalJPADsl.g:1135:3: this_OneToManyJoinTableRelationshipAttribute_0= ruleOneToManyJoinTableRelationshipAttribute
                    {

                    			newCompositeNode(grammarAccess.getMultipleRelationshipAttributeAccess().getOneToManyJoinTableRelationshipAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OneToManyJoinTableRelationshipAttribute_0=ruleOneToManyJoinTableRelationshipAttribute();

                    state._fsp--;


                    			current = this_OneToManyJoinTableRelationshipAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:1144:3: this_OneToManyMappedByRelationshipAttribute_1= ruleOneToManyMappedByRelationshipAttribute
                    {

                    			newCompositeNode(grammarAccess.getMultipleRelationshipAttributeAccess().getOneToManyMappedByRelationshipAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OneToManyMappedByRelationshipAttribute_1=ruleOneToManyMappedByRelationshipAttribute();

                    state._fsp--;


                    			current = this_OneToManyMappedByRelationshipAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJPADsl.g:1153:3: this_ManyToManyRelationshipAttribute_2= ruleManyToManyRelationshipAttribute
                    {

                    			newCompositeNode(grammarAccess.getMultipleRelationshipAttributeAccess().getManyToManyRelationshipAttributeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ManyToManyRelationshipAttribute_2=ruleManyToManyRelationshipAttribute();

                    state._fsp--;


                    			current = this_ManyToManyRelationshipAttribute_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJPADsl.g:1162:3: this_ManyToManyMappedByRelationshipAttribute_3= ruleManyToManyMappedByRelationshipAttribute
                    {

                    			newCompositeNode(grammarAccess.getMultipleRelationshipAttributeAccess().getManyToManyMappedByRelationshipAttributeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ManyToManyMappedByRelationshipAttribute_3=ruleManyToManyMappedByRelationshipAttribute();

                    state._fsp--;


                    			current = this_ManyToManyMappedByRelationshipAttribute_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJPADsl.g:1171:3: this_OneToManyJoinColumnRelationshipAttribute_4= ruleOneToManyJoinColumnRelationshipAttribute
                    {

                    			newCompositeNode(grammarAccess.getMultipleRelationshipAttributeAccess().getOneToManyJoinColumnRelationshipAttributeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_OneToManyJoinColumnRelationshipAttribute_4=ruleOneToManyJoinColumnRelationshipAttribute();

                    state._fsp--;


                    			current = this_OneToManyJoinColumnRelationshipAttribute_4;
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
    // $ANTLR end "ruleMultipleRelationshipAttribute"


    // $ANTLR start "entryRuleReadOnlyInternalAttribute"
    // InternalJPADsl.g:1183:1: entryRuleReadOnlyInternalAttribute returns [EObject current=null] : iv_ruleReadOnlyInternalAttribute= ruleReadOnlyInternalAttribute EOF ;
    public final EObject entryRuleReadOnlyInternalAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadOnlyInternalAttribute = null;


        try {
            // InternalJPADsl.g:1183:66: (iv_ruleReadOnlyInternalAttribute= ruleReadOnlyInternalAttribute EOF )
            // InternalJPADsl.g:1184:2: iv_ruleReadOnlyInternalAttribute= ruleReadOnlyInternalAttribute EOF
            {
             newCompositeNode(grammarAccess.getReadOnlyInternalAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadOnlyInternalAttribute=ruleReadOnlyInternalAttribute();

            state._fsp--;

             current =iv_ruleReadOnlyInternalAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReadOnlyInternalAttribute"


    // $ANTLR start "ruleReadOnlyInternalAttribute"
    // InternalJPADsl.g:1190:1: ruleReadOnlyInternalAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ) ;
    public final EObject ruleReadOnlyInternalAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1196:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ) )
            // InternalJPADsl.g:1197:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            {
            // InternalJPADsl.g:1197:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            // InternalJPADsl.g:1198:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) )
            {
            // InternalJPADsl.g:1198:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJPADsl.g:1199:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJPADsl.g:1199:4: (lv_name_0_0= RULE_ID )
            // InternalJPADsl.g:1200:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getReadOnlyInternalAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadOnlyInternalAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReadOnlyInternalAttributeAccess().getColonKeyword_1());
            		
            // InternalJPADsl.g:1220:3: ( (lv_type_2_0= ruleTypeRef ) )
            // InternalJPADsl.g:1221:4: (lv_type_2_0= ruleTypeRef )
            {
            // InternalJPADsl.g:1221:4: (lv_type_2_0= ruleTypeRef )
            // InternalJPADsl.g:1222:5: lv_type_2_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getReadOnlyInternalAttributeAccess().getTypeTypeRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReadOnlyInternalAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"jpadsl.JPADsl.TypeRef");
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
    // $ANTLR end "ruleReadOnlyInternalAttribute"


    // $ANTLR start "entryRuleUpdatableInternalAttribute"
    // InternalJPADsl.g:1243:1: entryRuleUpdatableInternalAttribute returns [EObject current=null] : iv_ruleUpdatableInternalAttribute= ruleUpdatableInternalAttribute EOF ;
    public final EObject entryRuleUpdatableInternalAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdatableInternalAttribute = null;


        try {
            // InternalJPADsl.g:1243:67: (iv_ruleUpdatableInternalAttribute= ruleUpdatableInternalAttribute EOF )
            // InternalJPADsl.g:1244:2: iv_ruleUpdatableInternalAttribute= ruleUpdatableInternalAttribute EOF
            {
             newCompositeNode(grammarAccess.getUpdatableInternalAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdatableInternalAttribute=ruleUpdatableInternalAttribute();

            state._fsp--;

             current =iv_ruleUpdatableInternalAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdatableInternalAttribute"


    // $ANTLR start "ruleUpdatableInternalAttribute"
    // InternalJPADsl.g:1250:1: ruleUpdatableInternalAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) ;
    public final EObject ruleUpdatableInternalAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1256:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) )
            // InternalJPADsl.g:1257:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            {
            // InternalJPADsl.g:1257:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            // InternalJPADsl.g:1258:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdatableInternalAttributeAccess().getAttributeKeyword_0());
            		
            // InternalJPADsl.g:1262:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:1263:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:1263:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:1264:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUpdatableInternalAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdatableInternalAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdatableInternalAttributeAccess().getColonKeyword_2());
            		
            // InternalJPADsl.g:1284:3: ( (lv_type_3_0= ruleTypeRef ) )
            // InternalJPADsl.g:1285:4: (lv_type_3_0= ruleTypeRef )
            {
            // InternalJPADsl.g:1285:4: (lv_type_3_0= ruleTypeRef )
            // InternalJPADsl.g:1286:5: lv_type_3_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getUpdatableInternalAttributeAccess().getTypeTypeRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdatableInternalAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jpadsl.JPADsl.TypeRef");
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
    // $ANTLR end "ruleUpdatableInternalAttribute"


    // $ANTLR start "entryRuleTransientAttribute"
    // InternalJPADsl.g:1307:1: entryRuleTransientAttribute returns [EObject current=null] : iv_ruleTransientAttribute= ruleTransientAttribute EOF ;
    public final EObject entryRuleTransientAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransientAttribute = null;


        try {
            // InternalJPADsl.g:1307:59: (iv_ruleTransientAttribute= ruleTransientAttribute EOF )
            // InternalJPADsl.g:1308:2: iv_ruleTransientAttribute= ruleTransientAttribute EOF
            {
             newCompositeNode(grammarAccess.getTransientAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransientAttribute=ruleTransientAttribute();

            state._fsp--;

             current =iv_ruleTransientAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransientAttribute"


    // $ANTLR start "ruleTransientAttribute"
    // InternalJPADsl.g:1314:1: ruleTransientAttribute returns [EObject current=null] : (otherlv_0= 'transient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) ;
    public final EObject ruleTransientAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1320:2: ( (otherlv_0= 'transient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) )
            // InternalJPADsl.g:1321:2: (otherlv_0= 'transient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            {
            // InternalJPADsl.g:1321:2: (otherlv_0= 'transient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            // InternalJPADsl.g:1322:3: otherlv_0= 'transient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransientAttributeAccess().getTransientKeyword_0());
            		
            // InternalJPADsl.g:1326:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:1327:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:1327:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:1328:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTransientAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransientAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTransientAttributeAccess().getColonKeyword_2());
            		
            // InternalJPADsl.g:1348:3: ( (lv_type_3_0= ruleTypeRef ) )
            // InternalJPADsl.g:1349:4: (lv_type_3_0= ruleTypeRef )
            {
            // InternalJPADsl.g:1349:4: (lv_type_3_0= ruleTypeRef )
            // InternalJPADsl.g:1350:5: lv_type_3_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getTransientAttributeAccess().getTypeTypeRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransientAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jpadsl.JPADsl.TypeRef");
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
    // $ANTLR end "ruleTransientAttribute"


    // $ANTLR start "entryRuleIdAttribute"
    // InternalJPADsl.g:1371:1: entryRuleIdAttribute returns [EObject current=null] : iv_ruleIdAttribute= ruleIdAttribute EOF ;
    public final EObject entryRuleIdAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdAttribute = null;


        try {
            // InternalJPADsl.g:1371:52: (iv_ruleIdAttribute= ruleIdAttribute EOF )
            // InternalJPADsl.g:1372:2: iv_ruleIdAttribute= ruleIdAttribute EOF
            {
             newCompositeNode(grammarAccess.getIdAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdAttribute=ruleIdAttribute();

            state._fsp--;

             current =iv_ruleIdAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdAttribute"


    // $ANTLR start "ruleIdAttribute"
    // InternalJPADsl.g:1378:1: ruleIdAttribute returns [EObject current=null] : (otherlv_0= 'id attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) ;
    public final EObject ruleIdAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1384:2: ( (otherlv_0= 'id attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) )
            // InternalJPADsl.g:1385:2: (otherlv_0= 'id attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            {
            // InternalJPADsl.g:1385:2: (otherlv_0= 'id attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            // InternalJPADsl.g:1386:3: otherlv_0= 'id attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIdAttributeAccess().getIdAttributeKeyword_0());
            		
            // InternalJPADsl.g:1390:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:1391:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:1391:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:1392:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIdAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getIdAttributeAccess().getColonKeyword_2());
            		
            // InternalJPADsl.g:1412:3: ( (lv_type_3_0= ruleTypeRef ) )
            // InternalJPADsl.g:1413:4: (lv_type_3_0= ruleTypeRef )
            {
            // InternalJPADsl.g:1413:4: (lv_type_3_0= ruleTypeRef )
            // InternalJPADsl.g:1414:5: lv_type_3_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getIdAttributeAccess().getTypeTypeRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jpadsl.JPADsl.TypeRef");
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
    // $ANTLR end "ruleIdAttribute"


    // $ANTLR start "entryRuleOneToOneRelationshipAttribute"
    // InternalJPADsl.g:1435:1: entryRuleOneToOneRelationshipAttribute returns [EObject current=null] : iv_ruleOneToOneRelationshipAttribute= ruleOneToOneRelationshipAttribute EOF ;
    public final EObject entryRuleOneToOneRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneToOneRelationshipAttribute = null;


        try {
            // InternalJPADsl.g:1435:70: (iv_ruleOneToOneRelationshipAttribute= ruleOneToOneRelationshipAttribute EOF )
            // InternalJPADsl.g:1436:2: iv_ruleOneToOneRelationshipAttribute= ruleOneToOneRelationshipAttribute EOF
            {
             newCompositeNode(grammarAccess.getOneToOneRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOneToOneRelationshipAttribute=ruleOneToOneRelationshipAttribute();

            state._fsp--;

             current =iv_ruleOneToOneRelationshipAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOneToOneRelationshipAttribute"


    // $ANTLR start "ruleOneToOneRelationshipAttribute"
    // InternalJPADsl.g:1442:1: ruleOneToOneRelationshipAttribute returns [EObject current=null] : (otherlv_0= 'one to one join column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_joinColumnOverride_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleOneToOneRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_joinColumnOverride_4_0=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1448:2: ( (otherlv_0= 'one to one join column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_joinColumnOverride_4_0= RULE_STRING ) )? ) )
            // InternalJPADsl.g:1449:2: (otherlv_0= 'one to one join column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_joinColumnOverride_4_0= RULE_STRING ) )? )
            {
            // InternalJPADsl.g:1449:2: (otherlv_0= 'one to one join column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_joinColumnOverride_4_0= RULE_STRING ) )? )
            // InternalJPADsl.g:1450:3: otherlv_0= 'one to one join column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_joinColumnOverride_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOneToOneRelationshipAttributeAccess().getOneToOneJoinColumnKeyword_0());
            		
            // InternalJPADsl.g:1454:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:1455:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:1455:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:1456:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOneToOneRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOneToOneRelationshipAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOneToOneRelationshipAttributeAccess().getColonKeyword_2());
            		
            // InternalJPADsl.g:1476:3: ( (lv_type_3_0= ruleTypeRef ) )
            // InternalJPADsl.g:1477:4: (lv_type_3_0= ruleTypeRef )
            {
            // InternalJPADsl.g:1477:4: (lv_type_3_0= ruleTypeRef )
            // InternalJPADsl.g:1478:5: lv_type_3_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getOneToOneRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOneToOneRelationshipAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jpadsl.JPADsl.TypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJPADsl.g:1495:3: ( (lv_joinColumnOverride_4_0= RULE_STRING ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJPADsl.g:1496:4: (lv_joinColumnOverride_4_0= RULE_STRING )
                    {
                    // InternalJPADsl.g:1496:4: (lv_joinColumnOverride_4_0= RULE_STRING )
                    // InternalJPADsl.g:1497:5: lv_joinColumnOverride_4_0= RULE_STRING
                    {
                    lv_joinColumnOverride_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_joinColumnOverride_4_0, grammarAccess.getOneToOneRelationshipAttributeAccess().getJoinColumnOverrideSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOneToOneRelationshipAttributeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"joinColumnOverride",
                    						lv_joinColumnOverride_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

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
    // $ANTLR end "ruleOneToOneRelationshipAttribute"


    // $ANTLR start "entryRuleOneToOneMappedByRelationshipAttribute"
    // InternalJPADsl.g:1517:1: entryRuleOneToOneMappedByRelationshipAttribute returns [EObject current=null] : iv_ruleOneToOneMappedByRelationshipAttribute= ruleOneToOneMappedByRelationshipAttribute EOF ;
    public final EObject entryRuleOneToOneMappedByRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneToOneMappedByRelationshipAttribute = null;


        try {
            // InternalJPADsl.g:1517:78: (iv_ruleOneToOneMappedByRelationshipAttribute= ruleOneToOneMappedByRelationshipAttribute EOF )
            // InternalJPADsl.g:1518:2: iv_ruleOneToOneMappedByRelationshipAttribute= ruleOneToOneMappedByRelationshipAttribute EOF
            {
             newCompositeNode(grammarAccess.getOneToOneMappedByRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOneToOneMappedByRelationshipAttribute=ruleOneToOneMappedByRelationshipAttribute();

            state._fsp--;

             current =iv_ruleOneToOneMappedByRelationshipAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOneToOneMappedByRelationshipAttribute"


    // $ANTLR start "ruleOneToOneMappedByRelationshipAttribute"
    // InternalJPADsl.g:1524:1: ruleOneToOneMappedByRelationshipAttribute returns [EObject current=null] : (otherlv_0= 'one to one mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) ;
    public final EObject ruleOneToOneMappedByRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1530:2: ( (otherlv_0= 'one to one mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) )
            // InternalJPADsl.g:1531:2: (otherlv_0= 'one to one mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            {
            // InternalJPADsl.g:1531:2: (otherlv_0= 'one to one mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            // InternalJPADsl.g:1532:3: otherlv_0= 'one to one mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getOneToOneMappedByKeyword_0());
            		
            // InternalJPADsl.g:1536:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:1537:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:1537:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:1538:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOneToOneMappedByRelationshipAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getColonKeyword_2());
            		
            // InternalJPADsl.g:1558:3: ( (lv_type_3_0= ruleTypeRef ) )
            // InternalJPADsl.g:1559:4: (lv_type_3_0= ruleTypeRef )
            {
            // InternalJPADsl.g:1559:4: (lv_type_3_0= ruleTypeRef )
            // InternalJPADsl.g:1560:5: lv_type_3_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getOneToOneMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOneToOneMappedByRelationshipAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jpadsl.JPADsl.TypeRef");
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
    // $ANTLR end "ruleOneToOneMappedByRelationshipAttribute"


    // $ANTLR start "entryRuleOneToManyJoinTableRelationshipAttribute"
    // InternalJPADsl.g:1581:1: entryRuleOneToManyJoinTableRelationshipAttribute returns [EObject current=null] : iv_ruleOneToManyJoinTableRelationshipAttribute= ruleOneToManyJoinTableRelationshipAttribute EOF ;
    public final EObject entryRuleOneToManyJoinTableRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneToManyJoinTableRelationshipAttribute = null;


        try {
            // InternalJPADsl.g:1581:80: (iv_ruleOneToManyJoinTableRelationshipAttribute= ruleOneToManyJoinTableRelationshipAttribute EOF )
            // InternalJPADsl.g:1582:2: iv_ruleOneToManyJoinTableRelationshipAttribute= ruleOneToManyJoinTableRelationshipAttribute EOF
            {
             newCompositeNode(grammarAccess.getOneToManyJoinTableRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOneToManyJoinTableRelationshipAttribute=ruleOneToManyJoinTableRelationshipAttribute();

            state._fsp--;

             current =iv_ruleOneToManyJoinTableRelationshipAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOneToManyJoinTableRelationshipAttribute"


    // $ANTLR start "ruleOneToManyJoinTableRelationshipAttribute"
    // InternalJPADsl.g:1588:1: ruleOneToManyJoinTableRelationshipAttribute returns [EObject current=null] : (otherlv_0= 'one to many using join table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) ;
    public final EObject ruleOneToManyJoinTableRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1594:2: ( (otherlv_0= 'one to many using join table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) )
            // InternalJPADsl.g:1595:2: (otherlv_0= 'one to many using join table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            {
            // InternalJPADsl.g:1595:2: (otherlv_0= 'one to many using join table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            // InternalJPADsl.g:1596:3: otherlv_0= 'one to many using join table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getOneToManyUsingJoinTableKeyword_0());
            		
            // InternalJPADsl.g:1600:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:1601:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:1601:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:1602:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOneToManyJoinTableRelationshipAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getColonKeyword_2());
            		
            // InternalJPADsl.g:1622:3: ( (lv_type_3_0= ruleTypeRef ) )
            // InternalJPADsl.g:1623:4: (lv_type_3_0= ruleTypeRef )
            {
            // InternalJPADsl.g:1623:4: (lv_type_3_0= ruleTypeRef )
            // InternalJPADsl.g:1624:5: lv_type_3_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getOneToManyJoinTableRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOneToManyJoinTableRelationshipAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jpadsl.JPADsl.TypeRef");
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
    // $ANTLR end "ruleOneToManyJoinTableRelationshipAttribute"


    // $ANTLR start "entryRuleOneToManyJoinColumnRelationshipAttribute"
    // InternalJPADsl.g:1645:1: entryRuleOneToManyJoinColumnRelationshipAttribute returns [EObject current=null] : iv_ruleOneToManyJoinColumnRelationshipAttribute= ruleOneToManyJoinColumnRelationshipAttribute EOF ;
    public final EObject entryRuleOneToManyJoinColumnRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneToManyJoinColumnRelationshipAttribute = null;


        try {
            // InternalJPADsl.g:1645:81: (iv_ruleOneToManyJoinColumnRelationshipAttribute= ruleOneToManyJoinColumnRelationshipAttribute EOF )
            // InternalJPADsl.g:1646:2: iv_ruleOneToManyJoinColumnRelationshipAttribute= ruleOneToManyJoinColumnRelationshipAttribute EOF
            {
             newCompositeNode(grammarAccess.getOneToManyJoinColumnRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOneToManyJoinColumnRelationshipAttribute=ruleOneToManyJoinColumnRelationshipAttribute();

            state._fsp--;

             current =iv_ruleOneToManyJoinColumnRelationshipAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOneToManyJoinColumnRelationshipAttribute"


    // $ANTLR start "ruleOneToManyJoinColumnRelationshipAttribute"
    // InternalJPADsl.g:1652:1: ruleOneToManyJoinColumnRelationshipAttribute returns [EObject current=null] : (otherlv_0= 'one to many using join column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) ;
    public final EObject ruleOneToManyJoinColumnRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1658:2: ( (otherlv_0= 'one to many using join column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) )
            // InternalJPADsl.g:1659:2: (otherlv_0= 'one to many using join column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            {
            // InternalJPADsl.g:1659:2: (otherlv_0= 'one to many using join column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            // InternalJPADsl.g:1660:3: otherlv_0= 'one to many using join column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getOneToManyUsingJoinColumnKeyword_0());
            		
            // InternalJPADsl.g:1664:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:1665:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:1665:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:1666:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOneToManyJoinColumnRelationshipAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getColonKeyword_2());
            		
            // InternalJPADsl.g:1686:3: ( (lv_type_3_0= ruleTypeRef ) )
            // InternalJPADsl.g:1687:4: (lv_type_3_0= ruleTypeRef )
            {
            // InternalJPADsl.g:1687:4: (lv_type_3_0= ruleTypeRef )
            // InternalJPADsl.g:1688:5: lv_type_3_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getOneToManyJoinColumnRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOneToManyJoinColumnRelationshipAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jpadsl.JPADsl.TypeRef");
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
    // $ANTLR end "ruleOneToManyJoinColumnRelationshipAttribute"


    // $ANTLR start "entryRuleOneToManyMappedByRelationshipAttribute"
    // InternalJPADsl.g:1709:1: entryRuleOneToManyMappedByRelationshipAttribute returns [EObject current=null] : iv_ruleOneToManyMappedByRelationshipAttribute= ruleOneToManyMappedByRelationshipAttribute EOF ;
    public final EObject entryRuleOneToManyMappedByRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneToManyMappedByRelationshipAttribute = null;


        try {
            // InternalJPADsl.g:1709:79: (iv_ruleOneToManyMappedByRelationshipAttribute= ruleOneToManyMappedByRelationshipAttribute EOF )
            // InternalJPADsl.g:1710:2: iv_ruleOneToManyMappedByRelationshipAttribute= ruleOneToManyMappedByRelationshipAttribute EOF
            {
             newCompositeNode(grammarAccess.getOneToManyMappedByRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOneToManyMappedByRelationshipAttribute=ruleOneToManyMappedByRelationshipAttribute();

            state._fsp--;

             current =iv_ruleOneToManyMappedByRelationshipAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOneToManyMappedByRelationshipAttribute"


    // $ANTLR start "ruleOneToManyMappedByRelationshipAttribute"
    // InternalJPADsl.g:1716:1: ruleOneToManyMappedByRelationshipAttribute returns [EObject current=null] : (otherlv_0= 'one to many mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) ;
    public final EObject ruleOneToManyMappedByRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1722:2: ( (otherlv_0= 'one to many mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) )
            // InternalJPADsl.g:1723:2: (otherlv_0= 'one to many mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            {
            // InternalJPADsl.g:1723:2: (otherlv_0= 'one to many mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            // InternalJPADsl.g:1724:3: otherlv_0= 'one to many mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getOneToManyMappedByKeyword_0());
            		
            // InternalJPADsl.g:1728:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:1729:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:1729:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:1730:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOneToManyMappedByRelationshipAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getColonKeyword_2());
            		
            // InternalJPADsl.g:1750:3: ( (lv_type_3_0= ruleTypeRef ) )
            // InternalJPADsl.g:1751:4: (lv_type_3_0= ruleTypeRef )
            {
            // InternalJPADsl.g:1751:4: (lv_type_3_0= ruleTypeRef )
            // InternalJPADsl.g:1752:5: lv_type_3_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getOneToManyMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOneToManyMappedByRelationshipAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jpadsl.JPADsl.TypeRef");
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
    // $ANTLR end "ruleOneToManyMappedByRelationshipAttribute"


    // $ANTLR start "entryRuleManyToOneJoinColumnRelationShipAttribute"
    // InternalJPADsl.g:1773:1: entryRuleManyToOneJoinColumnRelationShipAttribute returns [EObject current=null] : iv_ruleManyToOneJoinColumnRelationShipAttribute= ruleManyToOneJoinColumnRelationShipAttribute EOF ;
    public final EObject entryRuleManyToOneJoinColumnRelationShipAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManyToOneJoinColumnRelationShipAttribute = null;


        try {
            // InternalJPADsl.g:1773:81: (iv_ruleManyToOneJoinColumnRelationShipAttribute= ruleManyToOneJoinColumnRelationShipAttribute EOF )
            // InternalJPADsl.g:1774:2: iv_ruleManyToOneJoinColumnRelationShipAttribute= ruleManyToOneJoinColumnRelationShipAttribute EOF
            {
             newCompositeNode(grammarAccess.getManyToOneJoinColumnRelationShipAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManyToOneJoinColumnRelationShipAttribute=ruleManyToOneJoinColumnRelationShipAttribute();

            state._fsp--;

             current =iv_ruleManyToOneJoinColumnRelationShipAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleManyToOneJoinColumnRelationShipAttribute"


    // $ANTLR start "ruleManyToOneJoinColumnRelationShipAttribute"
    // InternalJPADsl.g:1780:1: ruleManyToOneJoinColumnRelationShipAttribute returns [EObject current=null] : (otherlv_0= 'many to one using join column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_joinColumnOverride_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleManyToOneJoinColumnRelationShipAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_joinColumnOverride_4_0=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1786:2: ( (otherlv_0= 'many to one using join column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_joinColumnOverride_4_0= RULE_STRING ) )? ) )
            // InternalJPADsl.g:1787:2: (otherlv_0= 'many to one using join column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_joinColumnOverride_4_0= RULE_STRING ) )? )
            {
            // InternalJPADsl.g:1787:2: (otherlv_0= 'many to one using join column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_joinColumnOverride_4_0= RULE_STRING ) )? )
            // InternalJPADsl.g:1788:3: otherlv_0= 'many to one using join column' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ( (lv_joinColumnOverride_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getManyToOneUsingJoinColumnKeyword_0());
            		
            // InternalJPADsl.g:1792:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:1793:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:1793:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:1794:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManyToOneJoinColumnRelationShipAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getColonKeyword_2());
            		
            // InternalJPADsl.g:1814:3: ( (lv_type_3_0= ruleTypeRef ) )
            // InternalJPADsl.g:1815:4: (lv_type_3_0= ruleTypeRef )
            {
            // InternalJPADsl.g:1815:4: (lv_type_3_0= ruleTypeRef )
            // InternalJPADsl.g:1816:5: lv_type_3_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManyToOneJoinColumnRelationShipAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jpadsl.JPADsl.TypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJPADsl.g:1833:3: ( (lv_joinColumnOverride_4_0= RULE_STRING ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJPADsl.g:1834:4: (lv_joinColumnOverride_4_0= RULE_STRING )
                    {
                    // InternalJPADsl.g:1834:4: (lv_joinColumnOverride_4_0= RULE_STRING )
                    // InternalJPADsl.g:1835:5: lv_joinColumnOverride_4_0= RULE_STRING
                    {
                    lv_joinColumnOverride_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_joinColumnOverride_4_0, grammarAccess.getManyToOneJoinColumnRelationShipAttributeAccess().getJoinColumnOverrideSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getManyToOneJoinColumnRelationShipAttributeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"joinColumnOverride",
                    						lv_joinColumnOverride_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

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
    // $ANTLR end "ruleManyToOneJoinColumnRelationShipAttribute"


    // $ANTLR start "entryRuleManyToOneJoinTableRelationShipAttribute"
    // InternalJPADsl.g:1855:1: entryRuleManyToOneJoinTableRelationShipAttribute returns [EObject current=null] : iv_ruleManyToOneJoinTableRelationShipAttribute= ruleManyToOneJoinTableRelationShipAttribute EOF ;
    public final EObject entryRuleManyToOneJoinTableRelationShipAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManyToOneJoinTableRelationShipAttribute = null;


        try {
            // InternalJPADsl.g:1855:80: (iv_ruleManyToOneJoinTableRelationShipAttribute= ruleManyToOneJoinTableRelationShipAttribute EOF )
            // InternalJPADsl.g:1856:2: iv_ruleManyToOneJoinTableRelationShipAttribute= ruleManyToOneJoinTableRelationShipAttribute EOF
            {
             newCompositeNode(grammarAccess.getManyToOneJoinTableRelationShipAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManyToOneJoinTableRelationShipAttribute=ruleManyToOneJoinTableRelationShipAttribute();

            state._fsp--;

             current =iv_ruleManyToOneJoinTableRelationShipAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleManyToOneJoinTableRelationShipAttribute"


    // $ANTLR start "ruleManyToOneJoinTableRelationShipAttribute"
    // InternalJPADsl.g:1862:1: ruleManyToOneJoinTableRelationShipAttribute returns [EObject current=null] : (otherlv_0= 'many to one using join table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) ;
    public final EObject ruleManyToOneJoinTableRelationShipAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1868:2: ( (otherlv_0= 'many to one using join table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) )
            // InternalJPADsl.g:1869:2: (otherlv_0= 'many to one using join table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            {
            // InternalJPADsl.g:1869:2: (otherlv_0= 'many to one using join table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            // InternalJPADsl.g:1870:3: otherlv_0= 'many to one using join table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getManyToOneUsingJoinTableKeyword_0());
            		
            // InternalJPADsl.g:1874:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:1875:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:1875:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:1876:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManyToOneJoinTableRelationShipAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getColonKeyword_2());
            		
            // InternalJPADsl.g:1896:3: ( (lv_type_3_0= ruleTypeRef ) )
            // InternalJPADsl.g:1897:4: (lv_type_3_0= ruleTypeRef )
            {
            // InternalJPADsl.g:1897:4: (lv_type_3_0= ruleTypeRef )
            // InternalJPADsl.g:1898:5: lv_type_3_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getManyToOneJoinTableRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManyToOneJoinTableRelationShipAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jpadsl.JPADsl.TypeRef");
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
    // $ANTLR end "ruleManyToOneJoinTableRelationShipAttribute"


    // $ANTLR start "entryRuleManyToOneMappedByRelationShipAttribute"
    // InternalJPADsl.g:1919:1: entryRuleManyToOneMappedByRelationShipAttribute returns [EObject current=null] : iv_ruleManyToOneMappedByRelationShipAttribute= ruleManyToOneMappedByRelationShipAttribute EOF ;
    public final EObject entryRuleManyToOneMappedByRelationShipAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManyToOneMappedByRelationShipAttribute = null;


        try {
            // InternalJPADsl.g:1919:79: (iv_ruleManyToOneMappedByRelationShipAttribute= ruleManyToOneMappedByRelationShipAttribute EOF )
            // InternalJPADsl.g:1920:2: iv_ruleManyToOneMappedByRelationShipAttribute= ruleManyToOneMappedByRelationShipAttribute EOF
            {
             newCompositeNode(grammarAccess.getManyToOneMappedByRelationShipAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManyToOneMappedByRelationShipAttribute=ruleManyToOneMappedByRelationShipAttribute();

            state._fsp--;

             current =iv_ruleManyToOneMappedByRelationShipAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleManyToOneMappedByRelationShipAttribute"


    // $ANTLR start "ruleManyToOneMappedByRelationShipAttribute"
    // InternalJPADsl.g:1926:1: ruleManyToOneMappedByRelationShipAttribute returns [EObject current=null] : (otherlv_0= 'many to one mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) ;
    public final EObject ruleManyToOneMappedByRelationShipAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1932:2: ( (otherlv_0= 'many to one mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) )
            // InternalJPADsl.g:1933:2: (otherlv_0= 'many to one mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            {
            // InternalJPADsl.g:1933:2: (otherlv_0= 'many to one mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            // InternalJPADsl.g:1934:3: otherlv_0= 'many to one mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getManyToOneMappedByKeyword_0());
            		
            // InternalJPADsl.g:1938:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:1939:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:1939:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:1940:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManyToOneMappedByRelationShipAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getColonKeyword_2());
            		
            // InternalJPADsl.g:1960:3: ( (lv_type_3_0= ruleTypeRef ) )
            // InternalJPADsl.g:1961:4: (lv_type_3_0= ruleTypeRef )
            {
            // InternalJPADsl.g:1961:4: (lv_type_3_0= ruleTypeRef )
            // InternalJPADsl.g:1962:5: lv_type_3_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getManyToOneMappedByRelationShipAttributeAccess().getTypeTypeRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManyToOneMappedByRelationShipAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jpadsl.JPADsl.TypeRef");
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
    // $ANTLR end "ruleManyToOneMappedByRelationShipAttribute"


    // $ANTLR start "entryRuleManyToManyRelationshipAttribute"
    // InternalJPADsl.g:1983:1: entryRuleManyToManyRelationshipAttribute returns [EObject current=null] : iv_ruleManyToManyRelationshipAttribute= ruleManyToManyRelationshipAttribute EOF ;
    public final EObject entryRuleManyToManyRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManyToManyRelationshipAttribute = null;


        try {
            // InternalJPADsl.g:1983:72: (iv_ruleManyToManyRelationshipAttribute= ruleManyToManyRelationshipAttribute EOF )
            // InternalJPADsl.g:1984:2: iv_ruleManyToManyRelationshipAttribute= ruleManyToManyRelationshipAttribute EOF
            {
             newCompositeNode(grammarAccess.getManyToManyRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManyToManyRelationshipAttribute=ruleManyToManyRelationshipAttribute();

            state._fsp--;

             current =iv_ruleManyToManyRelationshipAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleManyToManyRelationshipAttribute"


    // $ANTLR start "ruleManyToManyRelationshipAttribute"
    // InternalJPADsl.g:1990:1: ruleManyToManyRelationshipAttribute returns [EObject current=null] : (otherlv_0= 'many to many join table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) ;
    public final EObject ruleManyToManyRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:1996:2: ( (otherlv_0= 'many to many join table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) )
            // InternalJPADsl.g:1997:2: (otherlv_0= 'many to many join table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            {
            // InternalJPADsl.g:1997:2: (otherlv_0= 'many to many join table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            // InternalJPADsl.g:1998:3: otherlv_0= 'many to many join table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getManyToManyRelationshipAttributeAccess().getManyToManyJoinTableKeyword_0());
            		
            // InternalJPADsl.g:2002:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:2003:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:2003:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:2004:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getManyToManyRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManyToManyRelationshipAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getManyToManyRelationshipAttributeAccess().getColonKeyword_2());
            		
            // InternalJPADsl.g:2024:3: ( (lv_type_3_0= ruleTypeRef ) )
            // InternalJPADsl.g:2025:4: (lv_type_3_0= ruleTypeRef )
            {
            // InternalJPADsl.g:2025:4: (lv_type_3_0= ruleTypeRef )
            // InternalJPADsl.g:2026:5: lv_type_3_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getManyToManyRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManyToManyRelationshipAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jpadsl.JPADsl.TypeRef");
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
    // $ANTLR end "ruleManyToManyRelationshipAttribute"


    // $ANTLR start "entryRuleManyToManyMappedByRelationshipAttribute"
    // InternalJPADsl.g:2047:1: entryRuleManyToManyMappedByRelationshipAttribute returns [EObject current=null] : iv_ruleManyToManyMappedByRelationshipAttribute= ruleManyToManyMappedByRelationshipAttribute EOF ;
    public final EObject entryRuleManyToManyMappedByRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManyToManyMappedByRelationshipAttribute = null;


        try {
            // InternalJPADsl.g:2047:80: (iv_ruleManyToManyMappedByRelationshipAttribute= ruleManyToManyMappedByRelationshipAttribute EOF )
            // InternalJPADsl.g:2048:2: iv_ruleManyToManyMappedByRelationshipAttribute= ruleManyToManyMappedByRelationshipAttribute EOF
            {
             newCompositeNode(grammarAccess.getManyToManyMappedByRelationshipAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManyToManyMappedByRelationshipAttribute=ruleManyToManyMappedByRelationshipAttribute();

            state._fsp--;

             current =iv_ruleManyToManyMappedByRelationshipAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleManyToManyMappedByRelationshipAttribute"


    // $ANTLR start "ruleManyToManyMappedByRelationshipAttribute"
    // InternalJPADsl.g:2054:1: ruleManyToManyMappedByRelationshipAttribute returns [EObject current=null] : (otherlv_0= 'many to many mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) ;
    public final EObject ruleManyToManyMappedByRelationshipAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:2060:2: ( (otherlv_0= 'many to many mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) ) )
            // InternalJPADsl.g:2061:2: (otherlv_0= 'many to many mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            {
            // InternalJPADsl.g:2061:2: (otherlv_0= 'many to many mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) )
            // InternalJPADsl.g:2062:3: otherlv_0= 'many to many mapped by' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getManyToManyMappedByKeyword_0());
            		
            // InternalJPADsl.g:2066:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:2067:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:2067:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:2068:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManyToManyMappedByRelationshipAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getColonKeyword_2());
            		
            // InternalJPADsl.g:2088:3: ( (lv_type_3_0= ruleTypeRef ) )
            // InternalJPADsl.g:2089:4: (lv_type_3_0= ruleTypeRef )
            {
            // InternalJPADsl.g:2089:4: (lv_type_3_0= ruleTypeRef )
            // InternalJPADsl.g:2090:5: lv_type_3_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getManyToManyMappedByRelationshipAttributeAccess().getTypeTypeRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManyToManyMappedByRelationshipAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jpadsl.JPADsl.TypeRef");
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
    // $ANTLR end "ruleManyToManyMappedByRelationshipAttribute"


    // $ANTLR start "entryRuleReference"
    // InternalJPADsl.g:2111:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalJPADsl.g:2111:50: (iv_ruleReference= ruleReference EOF )
            // InternalJPADsl.g:2112:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalJPADsl.g:2118:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:2124:2: ( (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )? ) )
            // InternalJPADsl.g:2125:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )? )
            {
            // InternalJPADsl.g:2125:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )? )
            // InternalJPADsl.g:2126:3: otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
            		
            // InternalJPADsl.g:2130:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJPADsl.g:2131:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJPADsl.g:2131:4: (lv_name_1_0= RULE_ID )
            // InternalJPADsl.g:2132:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getColonKeyword_2());
            		
            // InternalJPADsl.g:2152:3: ( (lv_type_3_0= ruleTypeRef ) )
            // InternalJPADsl.g:2153:4: (lv_type_3_0= ruleTypeRef )
            {
            // InternalJPADsl.g:2153:4: (lv_type_3_0= ruleTypeRef )
            // InternalJPADsl.g:2154:5: lv_type_3_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"jpadsl.JPADsl.TypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJPADsl.g:2171:3: (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJPADsl.g:2172:4: otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getOppositeKeyword_4_0());
                    			
                    // InternalJPADsl.g:2176:4: ( (otherlv_5= RULE_ID ) )
                    // InternalJPADsl.g:2177:5: (otherlv_5= RULE_ID )
                    {
                    // InternalJPADsl.g:2177:5: (otherlv_5= RULE_ID )
                    // InternalJPADsl.g:2178:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0());
                    					

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleOperation"
    // InternalJPADsl.g:2194:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalJPADsl.g:2194:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalJPADsl.g:2195:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalJPADsl.g:2201:1: ruleOperation returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'op' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_type_9_0= ruleTypeRef ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_type_9_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:2207:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'op' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_type_9_0= ruleTypeRef ) ) ) )
            // InternalJPADsl.g:2208:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'op' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_type_9_0= ruleTypeRef ) ) )
            {
            // InternalJPADsl.g:2208:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'op' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_type_9_0= ruleTypeRef ) ) )
            // InternalJPADsl.g:2209:3: ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'op' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_type_9_0= ruleTypeRef ) )
            {
            // InternalJPADsl.g:2209:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=47 && LA23_0<=49)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJPADsl.g:2210:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalJPADsl.g:2210:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalJPADsl.g:2211:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOperationRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"jpadsl.JPADsl.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getOpKeyword_1());
            		
            // InternalJPADsl.g:2232:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalJPADsl.g:2233:4: (lv_name_2_0= RULE_ID )
            {
            // InternalJPADsl.g:2233:4: (lv_name_2_0= RULE_ID )
            // InternalJPADsl.g:2234:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_2_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalJPADsl.g:2254:3: ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJPADsl.g:2255:4: ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )*
                    {
                    // InternalJPADsl.g:2255:4: ( (lv_params_4_0= ruleParameter ) )
                    // InternalJPADsl.g:2256:5: (lv_params_4_0= ruleParameter )
                    {
                    // InternalJPADsl.g:2256:5: (lv_params_4_0= ruleParameter )
                    // InternalJPADsl.g:2257:6: lv_params_4_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_params_4_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_4_0,
                    							"jpadsl.JPADsl.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJPADsl.g:2274:4: (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==42) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalJPADsl.g:2275:5: otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,42,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalJPADsl.g:2279:5: ( (lv_params_6_0= ruleParameter ) )
                    	    // InternalJPADsl.g:2280:6: (lv_params_6_0= ruleParameter )
                    	    {
                    	    // InternalJPADsl.g:2280:6: (lv_params_6_0= ruleParameter )
                    	    // InternalJPADsl.g:2281:7: lv_params_6_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationAccess().getParamsParameterParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_params_6_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_6_0,
                    	    								"jpadsl.JPADsl.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,43,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getColonKeyword_6());
            		
            // InternalJPADsl.g:2308:3: ( (lv_type_9_0= ruleTypeRef ) )
            // InternalJPADsl.g:2309:4: (lv_type_9_0= ruleTypeRef )
            {
            // InternalJPADsl.g:2309:4: (lv_type_9_0= ruleTypeRef )
            // InternalJPADsl.g:2310:5: lv_type_9_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getTypeTypeRefParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_9_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_9_0,
            						"jpadsl.JPADsl.TypeRef");
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // InternalJPADsl.g:2331:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalJPADsl.g:2331:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalJPADsl.g:2332:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalJPADsl.g:2338:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:2344:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) ) )
            // InternalJPADsl.g:2345:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) )
            {
            // InternalJPADsl.g:2345:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) )
            // InternalJPADsl.g:2346:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) )
            {
            // InternalJPADsl.g:2346:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJPADsl.g:2347:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJPADsl.g:2347:4: (lv_name_0_0= RULE_ID )
            // InternalJPADsl.g:2348:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            // InternalJPADsl.g:2364:3: ( (lv_type_1_0= ruleTypeRef ) )
            // InternalJPADsl.g:2365:4: (lv_type_1_0= ruleTypeRef )
            {
            // InternalJPADsl.g:2365:4: (lv_type_1_0= ruleTypeRef )
            // InternalJPADsl.g:2366:5: lv_type_1_0= ruleTypeRef
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"jpadsl.JPADsl.TypeRef");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTypeRef"
    // InternalJPADsl.g:2387:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // InternalJPADsl.g:2387:48: (iv_ruleTypeRef= ruleTypeRef EOF )
            // InternalJPADsl.g:2388:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // InternalJPADsl.g:2394:1: ruleTypeRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_multi_1_0= '*' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_multi_1_0=null;


        	enterRule();

        try {
            // InternalJPADsl.g:2400:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_multi_1_0= '*' ) )? ) )
            // InternalJPADsl.g:2401:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_multi_1_0= '*' ) )? )
            {
            // InternalJPADsl.g:2401:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_multi_1_0= '*' ) )? )
            // InternalJPADsl.g:2402:3: ( (otherlv_0= RULE_ID ) ) ( (lv_multi_1_0= '*' ) )?
            {
            // InternalJPADsl.g:2402:3: ( (otherlv_0= RULE_ID ) )
            // InternalJPADsl.g:2403:4: (otherlv_0= RULE_ID )
            {
            // InternalJPADsl.g:2403:4: (otherlv_0= RULE_ID )
            // InternalJPADsl.g:2404:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRefRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0());
            				

            }


            }

            // InternalJPADsl.g:2415:3: ( (lv_multi_1_0= '*' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJPADsl.g:2416:4: (lv_multi_1_0= '*' )
                    {
                    // InternalJPADsl.g:2416:4: (lv_multi_1_0= '*' )
                    // InternalJPADsl.g:2417:5: lv_multi_1_0= '*'
                    {
                    lv_multi_1_0=(Token)match(input,44,FOLLOW_2); 

                    					newLeafNode(lv_multi_1_0, grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRefRule());
                    					}
                    					setWithLastConsumed(current, "multi", lv_multi_1_0 != null, "*");
                    				

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
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // InternalJPADsl.g:2433:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // InternalJPADsl.g:2433:65: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // InternalJPADsl.g:2434:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // InternalJPADsl.g:2440:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalJPADsl.g:2446:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalJPADsl.g:2447:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalJPADsl.g:2447:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalJPADsl.g:2448:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalJPADsl.g:2458:3: (kw= '.*' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJPADsl.g:2459:4: kw= '.*'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalJPADsl.g:2469:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalJPADsl.g:2469:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalJPADsl.g:2470:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalJPADsl.g:2476:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalJPADsl.g:2482:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalJPADsl.g:2483:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalJPADsl.g:2483:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalJPADsl.g:2484:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalJPADsl.g:2491:3: (kw= '.' this_ID_2= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==46) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalJPADsl.g:2492:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,46,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleVisibility"
    // InternalJPADsl.g:2509:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJPADsl.g:2515:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) )
            // InternalJPADsl.g:2516:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            {
            // InternalJPADsl.g:2516:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt29=1;
                }
                break;
            case 48:
                {
                alt29=2;
                }
                break;
            case 49:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalJPADsl.g:2517:3: (enumLiteral_0= 'public' )
                    {
                    // InternalJPADsl.g:2517:3: (enumLiteral_0= 'public' )
                    // InternalJPADsl.g:2518:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJPADsl.g:2525:3: (enumLiteral_1= 'private' )
                    {
                    // InternalJPADsl.g:2525:3: (enumLiteral_1= 'private' )
                    // InternalJPADsl.g:2526:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJPADsl.g:2533:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalJPADsl.g:2533:3: (enumLiteral_2= 'protected' )
                    // InternalJPADsl.g:2534:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleVisibility"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000003FF0029802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000003FF003D800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000003FF002D800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001C2010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0003817FFE82D810L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000002L});

}