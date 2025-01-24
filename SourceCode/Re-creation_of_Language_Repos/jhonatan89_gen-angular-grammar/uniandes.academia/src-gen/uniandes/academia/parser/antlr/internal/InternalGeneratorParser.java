package uniandes.academia.parser.antlr.internal;

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
import uniandes.academia.services.GeneratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGeneratorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LEFTCURLY", "RULE_RIGTHCURLY", "RULE_ID", "RULE_COLON", "RULE_LEFTBRACKET", "RULE_COMA", "RULE_RIGHTBRACKET", "RULE_SEMICOLON", "RULE_BOOLEAN", "RULE_STRING", "RULE_WS", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'package'", "'import'", "'.'", "'.*'", "'Modules'", "'ServicesGroup'", "'baseUrl'", "'Components'", "'Models'", "'Children'", "'Model'", "'attributes'", "'children'", "'idAtribute'", "'showAttributeList'", "'attributeName'", "'type'", "'component'", "'isRequired'", "'mockType'", "'relationshipType'", "'VisualModule'", "'parent'", "'imports'", "'exports'", "'route'", "'show'", "'defaultRoute'", "'showLayout'", "'components'", "'ContainerModule'", "'ComponentContainer'", "'Crud'", "'model'", "'showAsGallery'", "'enableMock'", "'createService'", "'updateService'", "'listService'", "'listNumService'", "'deleteService'", "'getService'", "'Service'", "'url'", "'collectionName'", "'String'", "'Number'", "'Boolean'", "'Any'", "'Date'", "'SearchComboBox'", "'POST'", "'GET'", "'UPDATE'", "'DELETE'", "'PATCH'", "'PUT'", "'List'", "'GALLERY'", "'Spanish'", "'English'", "'Composite'", "'Shared'", "'Simple'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=12;
    public static final int T__19=19;
    public static final int RULE_RIGHTBRACKET=10;
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
    public static final int RULE_RIGTHCURLY=5;
    public static final int RULE_ID=6;
    public static final int RULE_COLON=7;
    public static final int RULE_LEFTBRACKET=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=15;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int RULE_SEMICOLON=11;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_COMA=9;
    public static final int T__72=72;
    public static final int RULE_STRING=13;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_LEFTCURLY=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=18;
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


        public InternalGeneratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGeneratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGenerator.g"; }



     	private GeneratorGrammarAccess grammarAccess;

        public InternalGeneratorParser(TokenStream input, GeneratorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected GeneratorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalGenerator.g:65:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalGenerator.g:65:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalGenerator.g:66:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalGenerator.g:72:1: ruleRoot returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:78:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalGenerator.g:79:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalGenerator.g:79:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=19 && LA1_0<=20)||(LA1_0>=23 && LA1_0<=24)||(LA1_0>=26 && LA1_0<=28)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGenerator.g:80:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalGenerator.g:80:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalGenerator.g:81:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getRootAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getRootRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"uniandes.academia.Generator.AbstractElement");
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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalGenerator.g:101:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalGenerator.g:101:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalGenerator.g:102:2: iv_ruleAbstractElement= ruleAbstractElement EOF
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
    // InternalGenerator.g:108:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Application_1= ruleApplication | this_Import_2= ruleImport | this_Services_3= ruleServices | this_Modules_4= ruleModules | this_Components_5= ruleComponents | this_Models_6= ruleModels | this_Children_7= ruleChildren ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Application_1 = null;

        EObject this_Import_2 = null;

        EObject this_Services_3 = null;

        EObject this_Modules_4 = null;

        EObject this_Components_5 = null;

        EObject this_Models_6 = null;

        EObject this_Children_7 = null;



        	enterRule();

        try {
            // InternalGenerator.g:114:2: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Application_1= ruleApplication | this_Import_2= ruleImport | this_Services_3= ruleServices | this_Modules_4= ruleModules | this_Components_5= ruleComponents | this_Models_6= ruleModels | this_Children_7= ruleChildren ) )
            // InternalGenerator.g:115:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Application_1= ruleApplication | this_Import_2= ruleImport | this_Services_3= ruleServices | this_Modules_4= ruleModules | this_Components_5= ruleComponents | this_Models_6= ruleModels | this_Children_7= ruleChildren )
            {
            // InternalGenerator.g:115:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Application_1= ruleApplication | this_Import_2= ruleImport | this_Services_3= ruleServices | this_Modules_4= ruleModules | this_Components_5= ruleComponents | this_Models_6= ruleModels | this_Children_7= ruleChildren )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 24:
                {
                alt2=4;
                }
                break;
            case 23:
                {
                alt2=5;
                }
                break;
            case 26:
                {
                alt2=6;
                }
                break;
            case 27:
                {
                alt2=7;
                }
                break;
            case 28:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGenerator.g:116:3: this_PackageDeclaration_0= rulePackageDeclaration
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
                    // InternalGenerator.g:125:3: this_Application_1= ruleApplication
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getApplicationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Application_1=ruleApplication();

                    state._fsp--;


                    			current = this_Application_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGenerator.g:134:3: this_Import_2= ruleImport
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
                    // InternalGenerator.g:143:3: this_Services_3= ruleServices
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getServicesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Services_3=ruleServices();

                    state._fsp--;


                    			current = this_Services_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGenerator.g:152:3: this_Modules_4= ruleModules
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getModulesParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Modules_4=ruleModules();

                    state._fsp--;


                    			current = this_Modules_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGenerator.g:161:3: this_Components_5= ruleComponents
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getComponentsParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Components_5=ruleComponents();

                    state._fsp--;


                    			current = this_Components_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalGenerator.g:170:3: this_Models_6= ruleModels
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getModelsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Models_6=ruleModels();

                    state._fsp--;


                    			current = this_Models_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalGenerator.g:179:3: this_Children_7= ruleChildren
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getChildrenParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Children_7=ruleChildren();

                    state._fsp--;


                    			current = this_Children_7;
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


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalGenerator.g:191:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalGenerator.g:191:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalGenerator.g:192:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
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
    // InternalGenerator.g:198:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY ( (lv_elements_3_0= ruleAbstractElement ) )* this_RIGTHCURLY_4= RULE_RIGTHCURLY ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFTCURLY_2=null;
        Token this_RIGTHCURLY_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:204:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY ( (lv_elements_3_0= ruleAbstractElement ) )* this_RIGTHCURLY_4= RULE_RIGTHCURLY ) )
            // InternalGenerator.g:205:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY ( (lv_elements_3_0= ruleAbstractElement ) )* this_RIGTHCURLY_4= RULE_RIGTHCURLY )
            {
            // InternalGenerator.g:205:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY ( (lv_elements_3_0= ruleAbstractElement ) )* this_RIGTHCURLY_4= RULE_RIGTHCURLY )
            // InternalGenerator.g:206:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY ( (lv_elements_3_0= ruleAbstractElement ) )* this_RIGTHCURLY_4= RULE_RIGTHCURLY
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalGenerator.g:210:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalGenerator.g:211:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalGenerator.g:211:4: (lv_name_1_0= ruleQualifiedName )
            // InternalGenerator.g:212:5: lv_name_1_0= ruleQualifiedName
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
            						"uniandes.academia.Generator.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LEFTCURLY_2=(Token)match(input,RULE_LEFTCURLY,FOLLOW_6); 

            			newLeafNode(this_LEFTCURLY_2, grammarAccess.getPackageDeclarationAccess().getLEFTCURLYTerminalRuleCall_2());
            		
            // InternalGenerator.g:233:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=19 && LA3_0<=20)||(LA3_0>=23 && LA3_0<=24)||(LA3_0>=26 && LA3_0<=28)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGenerator.g:234:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalGenerator.g:234:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalGenerator.g:235:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"uniandes.academia.Generator.AbstractElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_RIGTHCURLY_4=(Token)match(input,RULE_RIGTHCURLY,FOLLOW_2); 

            			newLeafNode(this_RIGTHCURLY_4, grammarAccess.getPackageDeclarationAccess().getRIGTHCURLYTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleApplication"
    // InternalGenerator.g:260:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalGenerator.g:260:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalGenerator.g:261:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalGenerator.g:267:1: ruleApplication returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_elements_2_0= ruleAbstractElement ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token this_LEFTCURLY_1=null;
        Token this_RIGTHCURLY_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:273:2: ( ( ( (lv_name_0_0= ruleName ) ) this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_elements_2_0= ruleAbstractElement ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY ) )
            // InternalGenerator.g:274:2: ( ( (lv_name_0_0= ruleName ) ) this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_elements_2_0= ruleAbstractElement ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY )
            {
            // InternalGenerator.g:274:2: ( ( (lv_name_0_0= ruleName ) ) this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_elements_2_0= ruleAbstractElement ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY )
            // InternalGenerator.g:275:3: ( (lv_name_0_0= ruleName ) ) this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_elements_2_0= ruleAbstractElement ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY
            {
            // InternalGenerator.g:275:3: ( (lv_name_0_0= ruleName ) )
            // InternalGenerator.g:276:4: (lv_name_0_0= ruleName )
            {
            // InternalGenerator.g:276:4: (lv_name_0_0= ruleName )
            // InternalGenerator.g:277:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"uniandes.academia.Generator.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LEFTCURLY_1=(Token)match(input,RULE_LEFTCURLY,FOLLOW_6); 

            			newLeafNode(this_LEFTCURLY_1, grammarAccess.getApplicationAccess().getLEFTCURLYTerminalRuleCall_1());
            		
            // InternalGenerator.g:298:3: ( (lv_elements_2_0= ruleAbstractElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=19 && LA4_0<=20)||(LA4_0>=23 && LA4_0<=24)||(LA4_0>=26 && LA4_0<=28)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGenerator.g:299:4: (lv_elements_2_0= ruleAbstractElement )
            	    {
            	    // InternalGenerator.g:299:4: (lv_elements_2_0= ruleAbstractElement )
            	    // InternalGenerator.g:300:5: lv_elements_2_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationAccess().getElementsAbstractElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_2_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"uniandes.academia.Generator.AbstractElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_RIGTHCURLY_3=(Token)match(input,RULE_RIGTHCURLY,FOLLOW_2); 

            			newLeafNode(this_RIGTHCURLY_3, grammarAccess.getApplicationAccess().getRIGTHCURLYTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleImport"
    // InternalGenerator.g:325:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalGenerator.g:325:47: (iv_ruleImport= ruleImport EOF )
            // InternalGenerator.g:326:2: iv_ruleImport= ruleImport EOF
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
    // InternalGenerator.g:332:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:338:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalGenerator.g:339:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalGenerator.g:339:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalGenerator.g:340:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalGenerator.g:344:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalGenerator.g:345:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalGenerator.g:345:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalGenerator.g:346:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"uniandes.academia.Generator.QualifiedNameWithWildcard");
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalGenerator.g:367:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalGenerator.g:367:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalGenerator.g:368:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalGenerator.g:374:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGenerator.g:380:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalGenerator.g:381:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalGenerator.g:381:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalGenerator.g:382:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalGenerator.g:389:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGenerator.g:390:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalGenerator.g:407:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalGenerator.g:407:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalGenerator.g:408:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalGenerator.g:414:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:420:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalGenerator.g:421:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalGenerator.g:421:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalGenerator.g:422:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalGenerator.g:432:3: (kw= '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGenerator.g:433:4: kw= '.*'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleModules"
    // InternalGenerator.g:443:1: entryRuleModules returns [EObject current=null] : iv_ruleModules= ruleModules EOF ;
    public final EObject entryRuleModules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModules = null;


        try {
            // InternalGenerator.g:443:48: (iv_ruleModules= ruleModules EOF )
            // InternalGenerator.g:444:2: iv_ruleModules= ruleModules EOF
            {
             newCompositeNode(grammarAccess.getModulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModules=ruleModules();

            state._fsp--;

             current =iv_ruleModules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModules"


    // $ANTLR start "ruleModules"
    // InternalGenerator.g:450:1: ruleModules returns [EObject current=null] : (otherlv_0= 'Modules' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_modules_2_0= ruleModule ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY ) ;
    public final EObject ruleModules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFTCURLY_1=null;
        Token this_RIGTHCURLY_3=null;
        EObject lv_modules_2_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:456:2: ( (otherlv_0= 'Modules' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_modules_2_0= ruleModule ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY ) )
            // InternalGenerator.g:457:2: (otherlv_0= 'Modules' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_modules_2_0= ruleModule ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY )
            {
            // InternalGenerator.g:457:2: (otherlv_0= 'Modules' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_modules_2_0= ruleModule ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY )
            // InternalGenerator.g:458:3: otherlv_0= 'Modules' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_modules_2_0= ruleModule ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModulesAccess().getModulesKeyword_0());
            		
            this_LEFTCURLY_1=(Token)match(input,RULE_LEFTCURLY,FOLLOW_9); 

            			newLeafNode(this_LEFTCURLY_1, grammarAccess.getModulesAccess().getLEFTCURLYTerminalRuleCall_1());
            		
            // InternalGenerator.g:466:3: ( (lv_modules_2_0= ruleModule ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==40||LA7_0==49) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGenerator.g:467:4: (lv_modules_2_0= ruleModule )
            	    {
            	    // InternalGenerator.g:467:4: (lv_modules_2_0= ruleModule )
            	    // InternalGenerator.g:468:5: lv_modules_2_0= ruleModule
            	    {

            	    					newCompositeNode(grammarAccess.getModulesAccess().getModulesModuleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_modules_2_0=ruleModule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modules",
            	    						lv_modules_2_0,
            	    						"uniandes.academia.Generator.Module");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_RIGTHCURLY_3=(Token)match(input,RULE_RIGTHCURLY,FOLLOW_2); 

            			newLeafNode(this_RIGTHCURLY_3, grammarAccess.getModulesAccess().getRIGTHCURLYTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModules"


    // $ANTLR start "entryRuleServices"
    // InternalGenerator.g:493:1: entryRuleServices returns [EObject current=null] : iv_ruleServices= ruleServices EOF ;
    public final EObject entryRuleServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServices = null;


        try {
            // InternalGenerator.g:493:49: (iv_ruleServices= ruleServices EOF )
            // InternalGenerator.g:494:2: iv_ruleServices= ruleServices EOF
            {
             newCompositeNode(grammarAccess.getServicesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServices=ruleServices();

            state._fsp--;

             current =iv_ruleServices; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServices"


    // $ANTLR start "ruleServices"
    // InternalGenerator.g:500:1: ruleServices returns [EObject current=null] : (otherlv_0= 'ServicesGroup' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'baseUrl' this_COLON_4= RULE_COLON ( (lv_baseUrl_5_0= ruleEString ) ) ( (lv_services_6_0= ruleService ) )* this_RIGTHCURLY_7= RULE_RIGTHCURLY ) ;
    public final EObject ruleServices() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFTCURLY_2=null;
        Token otherlv_3=null;
        Token this_COLON_4=null;
        Token this_RIGTHCURLY_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_baseUrl_5_0 = null;

        EObject lv_services_6_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:506:2: ( (otherlv_0= 'ServicesGroup' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'baseUrl' this_COLON_4= RULE_COLON ( (lv_baseUrl_5_0= ruleEString ) ) ( (lv_services_6_0= ruleService ) )* this_RIGTHCURLY_7= RULE_RIGTHCURLY ) )
            // InternalGenerator.g:507:2: (otherlv_0= 'ServicesGroup' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'baseUrl' this_COLON_4= RULE_COLON ( (lv_baseUrl_5_0= ruleEString ) ) ( (lv_services_6_0= ruleService ) )* this_RIGTHCURLY_7= RULE_RIGTHCURLY )
            {
            // InternalGenerator.g:507:2: (otherlv_0= 'ServicesGroup' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'baseUrl' this_COLON_4= RULE_COLON ( (lv_baseUrl_5_0= ruleEString ) ) ( (lv_services_6_0= ruleService ) )* this_RIGTHCURLY_7= RULE_RIGTHCURLY )
            // InternalGenerator.g:508:3: otherlv_0= 'ServicesGroup' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'baseUrl' this_COLON_4= RULE_COLON ( (lv_baseUrl_5_0= ruleEString ) ) ( (lv_services_6_0= ruleService ) )* this_RIGTHCURLY_7= RULE_RIGTHCURLY
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServicesAccess().getServicesGroupKeyword_0());
            		
            // InternalGenerator.g:512:3: ( (lv_name_1_0= ruleName ) )
            // InternalGenerator.g:513:4: (lv_name_1_0= ruleName )
            {
            // InternalGenerator.g:513:4: (lv_name_1_0= ruleName )
            // InternalGenerator.g:514:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getServicesAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServicesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uniandes.academia.Generator.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LEFTCURLY_2=(Token)match(input,RULE_LEFTCURLY,FOLLOW_10); 

            			newLeafNode(this_LEFTCURLY_2, grammarAccess.getServicesAccess().getLEFTCURLYTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getServicesAccess().getBaseUrlKeyword_3());
            		
            this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_12); 

            			newLeafNode(this_COLON_4, grammarAccess.getServicesAccess().getCOLONTerminalRuleCall_4());
            		
            // InternalGenerator.g:543:3: ( (lv_baseUrl_5_0= ruleEString ) )
            // InternalGenerator.g:544:4: (lv_baseUrl_5_0= ruleEString )
            {
            // InternalGenerator.g:544:4: (lv_baseUrl_5_0= ruleEString )
            // InternalGenerator.g:545:5: lv_baseUrl_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServicesAccess().getBaseUrlEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_baseUrl_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServicesRule());
            					}
            					set(
            						current,
            						"baseUrl",
            						lv_baseUrl_5_0,
            						"uniandes.academia.Generator.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGenerator.g:562:3: ( (lv_services_6_0= ruleService ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==61) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGenerator.g:563:4: (lv_services_6_0= ruleService )
            	    {
            	    // InternalGenerator.g:563:4: (lv_services_6_0= ruleService )
            	    // InternalGenerator.g:564:5: lv_services_6_0= ruleService
            	    {

            	    					newCompositeNode(grammarAccess.getServicesAccess().getServicesServiceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_services_6_0=ruleService();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServicesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"services",
            	    						lv_services_6_0,
            	    						"uniandes.academia.Generator.Service");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_RIGTHCURLY_7=(Token)match(input,RULE_RIGTHCURLY,FOLLOW_2); 

            			newLeafNode(this_RIGTHCURLY_7, grammarAccess.getServicesAccess().getRIGTHCURLYTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServices"


    // $ANTLR start "entryRuleComponents"
    // InternalGenerator.g:589:1: entryRuleComponents returns [EObject current=null] : iv_ruleComponents= ruleComponents EOF ;
    public final EObject entryRuleComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponents = null;


        try {
            // InternalGenerator.g:589:51: (iv_ruleComponents= ruleComponents EOF )
            // InternalGenerator.g:590:2: iv_ruleComponents= ruleComponents EOF
            {
             newCompositeNode(grammarAccess.getComponentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponents=ruleComponents();

            state._fsp--;

             current =iv_ruleComponents; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponents"


    // $ANTLR start "ruleComponents"
    // InternalGenerator.g:596:1: ruleComponents returns [EObject current=null] : (otherlv_0= 'Components' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_components_2_0= ruleComponent ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY ) ;
    public final EObject ruleComponents() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFTCURLY_1=null;
        Token this_RIGTHCURLY_3=null;
        EObject lv_components_2_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:602:2: ( (otherlv_0= 'Components' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_components_2_0= ruleComponent ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY ) )
            // InternalGenerator.g:603:2: (otherlv_0= 'Components' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_components_2_0= ruleComponent ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY )
            {
            // InternalGenerator.g:603:2: (otherlv_0= 'Components' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_components_2_0= ruleComponent ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY )
            // InternalGenerator.g:604:3: otherlv_0= 'Components' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_components_2_0= ruleComponent ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentsAccess().getComponentsKeyword_0());
            		
            this_LEFTCURLY_1=(Token)match(input,RULE_LEFTCURLY,FOLLOW_14); 

            			newLeafNode(this_LEFTCURLY_1, grammarAccess.getComponentsAccess().getLEFTCURLYTerminalRuleCall_1());
            		
            // InternalGenerator.g:612:3: ( (lv_components_2_0= ruleComponent ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=50 && LA9_0<=51)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGenerator.g:613:4: (lv_components_2_0= ruleComponent )
            	    {
            	    // InternalGenerator.g:613:4: (lv_components_2_0= ruleComponent )
            	    // InternalGenerator.g:614:5: lv_components_2_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getComponentsAccess().getComponentsComponentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_components_2_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_2_0,
            	    						"uniandes.academia.Generator.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            this_RIGTHCURLY_3=(Token)match(input,RULE_RIGTHCURLY,FOLLOW_2); 

            			newLeafNode(this_RIGTHCURLY_3, grammarAccess.getComponentsAccess().getRIGTHCURLYTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponents"


    // $ANTLR start "entryRuleModels"
    // InternalGenerator.g:639:1: entryRuleModels returns [EObject current=null] : iv_ruleModels= ruleModels EOF ;
    public final EObject entryRuleModels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModels = null;


        try {
            // InternalGenerator.g:639:47: (iv_ruleModels= ruleModels EOF )
            // InternalGenerator.g:640:2: iv_ruleModels= ruleModels EOF
            {
             newCompositeNode(grammarAccess.getModelsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModels=ruleModels();

            state._fsp--;

             current =iv_ruleModels; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModels"


    // $ANTLR start "ruleModels"
    // InternalGenerator.g:646:1: ruleModels returns [EObject current=null] : (otherlv_0= 'Models' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_models_2_0= ruleModel ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY ) ;
    public final EObject ruleModels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFTCURLY_1=null;
        Token this_RIGTHCURLY_3=null;
        EObject lv_models_2_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:652:2: ( (otherlv_0= 'Models' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_models_2_0= ruleModel ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY ) )
            // InternalGenerator.g:653:2: (otherlv_0= 'Models' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_models_2_0= ruleModel ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY )
            {
            // InternalGenerator.g:653:2: (otherlv_0= 'Models' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_models_2_0= ruleModel ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY )
            // InternalGenerator.g:654:3: otherlv_0= 'Models' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_models_2_0= ruleModel ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModelsAccess().getModelsKeyword_0());
            		
            this_LEFTCURLY_1=(Token)match(input,RULE_LEFTCURLY,FOLLOW_15); 

            			newLeafNode(this_LEFTCURLY_1, grammarAccess.getModelsAccess().getLEFTCURLYTerminalRuleCall_1());
            		
            // InternalGenerator.g:662:3: ( (lv_models_2_0= ruleModel ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGenerator.g:663:4: (lv_models_2_0= ruleModel )
            	    {
            	    // InternalGenerator.g:663:4: (lv_models_2_0= ruleModel )
            	    // InternalGenerator.g:664:5: lv_models_2_0= ruleModel
            	    {

            	    					newCompositeNode(grammarAccess.getModelsAccess().getModelsModelParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_models_2_0=ruleModel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"models",
            	    						lv_models_2_0,
            	    						"uniandes.academia.Generator.Model");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            this_RIGTHCURLY_3=(Token)match(input,RULE_RIGTHCURLY,FOLLOW_2); 

            			newLeafNode(this_RIGTHCURLY_3, grammarAccess.getModelsAccess().getRIGTHCURLYTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModels"


    // $ANTLR start "entryRuleChildren"
    // InternalGenerator.g:689:1: entryRuleChildren returns [EObject current=null] : iv_ruleChildren= ruleChildren EOF ;
    public final EObject entryRuleChildren() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildren = null;


        try {
            // InternalGenerator.g:689:49: (iv_ruleChildren= ruleChildren EOF )
            // InternalGenerator.g:690:2: iv_ruleChildren= ruleChildren EOF
            {
             newCompositeNode(grammarAccess.getChildrenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChildren=ruleChildren();

            state._fsp--;

             current =iv_ruleChildren; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChildren"


    // $ANTLR start "ruleChildren"
    // InternalGenerator.g:696:1: ruleChildren returns [EObject current=null] : (otherlv_0= 'Children' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_children_2_0= ruleChild ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY ) ;
    public final EObject ruleChildren() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFTCURLY_1=null;
        Token this_RIGTHCURLY_3=null;
        EObject lv_children_2_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:702:2: ( (otherlv_0= 'Children' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_children_2_0= ruleChild ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY ) )
            // InternalGenerator.g:703:2: (otherlv_0= 'Children' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_children_2_0= ruleChild ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY )
            {
            // InternalGenerator.g:703:2: (otherlv_0= 'Children' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_children_2_0= ruleChild ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY )
            // InternalGenerator.g:704:3: otherlv_0= 'Children' this_LEFTCURLY_1= RULE_LEFTCURLY ( (lv_children_2_0= ruleChild ) )* this_RIGTHCURLY_3= RULE_RIGTHCURLY
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getChildrenAccess().getChildrenKeyword_0());
            		
            this_LEFTCURLY_1=(Token)match(input,RULE_LEFTCURLY,FOLLOW_16); 

            			newLeafNode(this_LEFTCURLY_1, grammarAccess.getChildrenAccess().getLEFTCURLYTerminalRuleCall_1());
            		
            // InternalGenerator.g:712:3: ( (lv_children_2_0= ruleChild ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGenerator.g:713:4: (lv_children_2_0= ruleChild )
            	    {
            	    // InternalGenerator.g:713:4: (lv_children_2_0= ruleChild )
            	    // InternalGenerator.g:714:5: lv_children_2_0= ruleChild
            	    {

            	    					newCompositeNode(grammarAccess.getChildrenAccess().getChildrenChildParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_children_2_0=ruleChild();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChildrenRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_2_0,
            	    						"uniandes.academia.Generator.Child");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            this_RIGTHCURLY_3=(Token)match(input,RULE_RIGTHCURLY,FOLLOW_2); 

            			newLeafNode(this_RIGTHCURLY_3, grammarAccess.getChildrenAccess().getRIGTHCURLYTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChildren"


    // $ANTLR start "entryRuleModule"
    // InternalGenerator.g:739:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalGenerator.g:739:47: (iv_ruleModule= ruleModule EOF )
            // InternalGenerator.g:740:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalGenerator.g:746:1: ruleModule returns [EObject current=null] : (this_VisualModule_0= ruleVisualModule | this_ContainerModule_1= ruleContainerModule ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        EObject this_VisualModule_0 = null;

        EObject this_ContainerModule_1 = null;



        	enterRule();

        try {
            // InternalGenerator.g:752:2: ( (this_VisualModule_0= ruleVisualModule | this_ContainerModule_1= ruleContainerModule ) )
            // InternalGenerator.g:753:2: (this_VisualModule_0= ruleVisualModule | this_ContainerModule_1= ruleContainerModule )
            {
            // InternalGenerator.g:753:2: (this_VisualModule_0= ruleVisualModule | this_ContainerModule_1= ruleContainerModule )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            else if ( (LA12_0==49) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGenerator.g:754:3: this_VisualModule_0= ruleVisualModule
                    {

                    			newCompositeNode(grammarAccess.getModuleAccess().getVisualModuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VisualModule_0=ruleVisualModule();

                    state._fsp--;


                    			current = this_VisualModule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGenerator.g:763:3: this_ContainerModule_1= ruleContainerModule
                    {

                    			newCompositeNode(grammarAccess.getModuleAccess().getContainerModuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContainerModule_1=ruleContainerModule();

                    state._fsp--;


                    			current = this_ContainerModule_1;
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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleModel"
    // InternalGenerator.g:775:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGenerator.g:775:46: (iv_ruleModel= ruleModel EOF )
            // InternalGenerator.g:776:2: iv_ruleModel= ruleModel EOF
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
    // InternalGenerator.g:782:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Model' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'attributes' this_COLON_4= RULE_COLON this_LEFTBRACKET_5= RULE_LEFTBRACKET ( ( (lv_attributes_6_0= ruleAttribute ) ) (this_COMA_7= RULE_COMA )? )* this_RIGHTBRACKET_8= RULE_RIGHTBRACKET this_SEMICOLON_9= RULE_SEMICOLON (otherlv_10= 'children' this_COLON_11= RULE_COLON this_LEFTBRACKET_12= RULE_LEFTBRACKET ( ( (lv_children_13_0= ruleChild ) ) (this_COMA_14= RULE_COMA )? )* this_RIGHTBRACKET_15= RULE_RIGHTBRACKET this_SEMICOLON_16= RULE_SEMICOLON )? otherlv_17= 'idAtribute' this_COLON_18= RULE_COLON ( (lv_idAtribute_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON otherlv_21= 'showAttributeList' this_COLON_22= RULE_COLON ( (lv_nameAttribute_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON this_RIGTHCURLY_25= RULE_RIGTHCURLY ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFTCURLY_2=null;
        Token otherlv_3=null;
        Token this_COLON_4=null;
        Token this_LEFTBRACKET_5=null;
        Token this_COMA_7=null;
        Token this_RIGHTBRACKET_8=null;
        Token this_SEMICOLON_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_LEFTBRACKET_12=null;
        Token this_COMA_14=null;
        Token this_RIGHTBRACKET_15=null;
        Token this_SEMICOLON_16=null;
        Token otherlv_17=null;
        Token this_COLON_18=null;
        Token this_SEMICOLON_20=null;
        Token otherlv_21=null;
        Token this_COLON_22=null;
        Token this_SEMICOLON_24=null;
        Token this_RIGTHCURLY_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_children_13_0 = null;

        AntlrDatatypeRuleToken lv_idAtribute_19_0 = null;

        AntlrDatatypeRuleToken lv_nameAttribute_23_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:788:2: ( (otherlv_0= 'Model' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'attributes' this_COLON_4= RULE_COLON this_LEFTBRACKET_5= RULE_LEFTBRACKET ( ( (lv_attributes_6_0= ruleAttribute ) ) (this_COMA_7= RULE_COMA )? )* this_RIGHTBRACKET_8= RULE_RIGHTBRACKET this_SEMICOLON_9= RULE_SEMICOLON (otherlv_10= 'children' this_COLON_11= RULE_COLON this_LEFTBRACKET_12= RULE_LEFTBRACKET ( ( (lv_children_13_0= ruleChild ) ) (this_COMA_14= RULE_COMA )? )* this_RIGHTBRACKET_15= RULE_RIGHTBRACKET this_SEMICOLON_16= RULE_SEMICOLON )? otherlv_17= 'idAtribute' this_COLON_18= RULE_COLON ( (lv_idAtribute_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON otherlv_21= 'showAttributeList' this_COLON_22= RULE_COLON ( (lv_nameAttribute_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON this_RIGTHCURLY_25= RULE_RIGTHCURLY ) )
            // InternalGenerator.g:789:2: (otherlv_0= 'Model' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'attributes' this_COLON_4= RULE_COLON this_LEFTBRACKET_5= RULE_LEFTBRACKET ( ( (lv_attributes_6_0= ruleAttribute ) ) (this_COMA_7= RULE_COMA )? )* this_RIGHTBRACKET_8= RULE_RIGHTBRACKET this_SEMICOLON_9= RULE_SEMICOLON (otherlv_10= 'children' this_COLON_11= RULE_COLON this_LEFTBRACKET_12= RULE_LEFTBRACKET ( ( (lv_children_13_0= ruleChild ) ) (this_COMA_14= RULE_COMA )? )* this_RIGHTBRACKET_15= RULE_RIGHTBRACKET this_SEMICOLON_16= RULE_SEMICOLON )? otherlv_17= 'idAtribute' this_COLON_18= RULE_COLON ( (lv_idAtribute_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON otherlv_21= 'showAttributeList' this_COLON_22= RULE_COLON ( (lv_nameAttribute_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON this_RIGTHCURLY_25= RULE_RIGTHCURLY )
            {
            // InternalGenerator.g:789:2: (otherlv_0= 'Model' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'attributes' this_COLON_4= RULE_COLON this_LEFTBRACKET_5= RULE_LEFTBRACKET ( ( (lv_attributes_6_0= ruleAttribute ) ) (this_COMA_7= RULE_COMA )? )* this_RIGHTBRACKET_8= RULE_RIGHTBRACKET this_SEMICOLON_9= RULE_SEMICOLON (otherlv_10= 'children' this_COLON_11= RULE_COLON this_LEFTBRACKET_12= RULE_LEFTBRACKET ( ( (lv_children_13_0= ruleChild ) ) (this_COMA_14= RULE_COMA )? )* this_RIGHTBRACKET_15= RULE_RIGHTBRACKET this_SEMICOLON_16= RULE_SEMICOLON )? otherlv_17= 'idAtribute' this_COLON_18= RULE_COLON ( (lv_idAtribute_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON otherlv_21= 'showAttributeList' this_COLON_22= RULE_COLON ( (lv_nameAttribute_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON this_RIGTHCURLY_25= RULE_RIGTHCURLY )
            // InternalGenerator.g:790:3: otherlv_0= 'Model' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'attributes' this_COLON_4= RULE_COLON this_LEFTBRACKET_5= RULE_LEFTBRACKET ( ( (lv_attributes_6_0= ruleAttribute ) ) (this_COMA_7= RULE_COMA )? )* this_RIGHTBRACKET_8= RULE_RIGHTBRACKET this_SEMICOLON_9= RULE_SEMICOLON (otherlv_10= 'children' this_COLON_11= RULE_COLON this_LEFTBRACKET_12= RULE_LEFTBRACKET ( ( (lv_children_13_0= ruleChild ) ) (this_COMA_14= RULE_COMA )? )* this_RIGHTBRACKET_15= RULE_RIGHTBRACKET this_SEMICOLON_16= RULE_SEMICOLON )? otherlv_17= 'idAtribute' this_COLON_18= RULE_COLON ( (lv_idAtribute_19_0= ruleEString ) ) this_SEMICOLON_20= RULE_SEMICOLON otherlv_21= 'showAttributeList' this_COLON_22= RULE_COLON ( (lv_nameAttribute_23_0= ruleEString ) ) this_SEMICOLON_24= RULE_SEMICOLON this_RIGTHCURLY_25= RULE_RIGTHCURLY
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalGenerator.g:794:3: ( (lv_name_1_0= ruleName ) )
            // InternalGenerator.g:795:4: (lv_name_1_0= ruleName )
            {
            // InternalGenerator.g:795:4: (lv_name_1_0= ruleName )
            // InternalGenerator.g:796:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uniandes.academia.Generator.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LEFTCURLY_2=(Token)match(input,RULE_LEFTCURLY,FOLLOW_17); 

            			newLeafNode(this_LEFTCURLY_2, grammarAccess.getModelAccess().getLEFTCURLYTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getAttributesKeyword_3());
            		
            this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_18); 

            			newLeafNode(this_COLON_4, grammarAccess.getModelAccess().getCOLONTerminalRuleCall_4());
            		
            this_LEFTBRACKET_5=(Token)match(input,RULE_LEFTBRACKET,FOLLOW_19); 

            			newLeafNode(this_LEFTBRACKET_5, grammarAccess.getModelAccess().getLEFTBRACKETTerminalRuleCall_5());
            		
            // InternalGenerator.g:829:3: ( ( (lv_attributes_6_0= ruleAttribute ) ) (this_COMA_7= RULE_COMA )? )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_LEFTCURLY) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGenerator.g:830:4: ( (lv_attributes_6_0= ruleAttribute ) ) (this_COMA_7= RULE_COMA )?
            	    {
            	    // InternalGenerator.g:830:4: ( (lv_attributes_6_0= ruleAttribute ) )
            	    // InternalGenerator.g:831:5: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // InternalGenerator.g:831:5: (lv_attributes_6_0= ruleAttribute )
            	    // InternalGenerator.g:832:6: lv_attributes_6_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getAttributesAttributeParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_attributes_6_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_6_0,
            	    							"uniandes.academia.Generator.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalGenerator.g:849:4: (this_COMA_7= RULE_COMA )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==RULE_COMA) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalGenerator.g:850:5: this_COMA_7= RULE_COMA
            	            {
            	            this_COMA_7=(Token)match(input,RULE_COMA,FOLLOW_19); 

            	            					newLeafNode(this_COMA_7, grammarAccess.getModelAccess().getCOMATerminalRuleCall_6_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            this_RIGHTBRACKET_8=(Token)match(input,RULE_RIGHTBRACKET,FOLLOW_21); 

            			newLeafNode(this_RIGHTBRACKET_8, grammarAccess.getModelAccess().getRIGHTBRACKETTerminalRuleCall_7());
            		
            this_SEMICOLON_9=(Token)match(input,RULE_SEMICOLON,FOLLOW_22); 

            			newLeafNode(this_SEMICOLON_9, grammarAccess.getModelAccess().getSEMICOLONTerminalRuleCall_8());
            		
            // InternalGenerator.g:864:3: (otherlv_10= 'children' this_COLON_11= RULE_COLON this_LEFTBRACKET_12= RULE_LEFTBRACKET ( ( (lv_children_13_0= ruleChild ) ) (this_COMA_14= RULE_COMA )? )* this_RIGHTBRACKET_15= RULE_RIGHTBRACKET this_SEMICOLON_16= RULE_SEMICOLON )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGenerator.g:865:4: otherlv_10= 'children' this_COLON_11= RULE_COLON this_LEFTBRACKET_12= RULE_LEFTBRACKET ( ( (lv_children_13_0= ruleChild ) ) (this_COMA_14= RULE_COMA )? )* this_RIGHTBRACKET_15= RULE_RIGHTBRACKET this_SEMICOLON_16= RULE_SEMICOLON
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getChildrenKeyword_9_0());
                    			
                    this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_18); 

                    				newLeafNode(this_COLON_11, grammarAccess.getModelAccess().getCOLONTerminalRuleCall_9_1());
                    			
                    this_LEFTBRACKET_12=(Token)match(input,RULE_LEFTBRACKET,FOLLOW_23); 

                    				newLeafNode(this_LEFTBRACKET_12, grammarAccess.getModelAccess().getLEFTBRACKETTerminalRuleCall_9_2());
                    			
                    // InternalGenerator.g:877:4: ( ( (lv_children_13_0= ruleChild ) ) (this_COMA_14= RULE_COMA )? )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalGenerator.g:878:5: ( (lv_children_13_0= ruleChild ) ) (this_COMA_14= RULE_COMA )?
                    	    {
                    	    // InternalGenerator.g:878:5: ( (lv_children_13_0= ruleChild ) )
                    	    // InternalGenerator.g:879:6: (lv_children_13_0= ruleChild )
                    	    {
                    	    // InternalGenerator.g:879:6: (lv_children_13_0= ruleChild )
                    	    // InternalGenerator.g:880:7: lv_children_13_0= ruleChild
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelAccess().getChildrenChildParserRuleCall_9_3_0_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_children_13_0=ruleChild();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_13_0,
                    	    								"uniandes.academia.Generator.Child");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalGenerator.g:897:5: (this_COMA_14= RULE_COMA )?
                    	    int alt15=2;
                    	    int LA15_0 = input.LA(1);

                    	    if ( (LA15_0==RULE_COMA) ) {
                    	        alt15=1;
                    	    }
                    	    switch (alt15) {
                    	        case 1 :
                    	            // InternalGenerator.g:898:6: this_COMA_14= RULE_COMA
                    	            {
                    	            this_COMA_14=(Token)match(input,RULE_COMA,FOLLOW_23); 

                    	            						newLeafNode(this_COMA_14, grammarAccess.getModelAccess().getCOMATerminalRuleCall_9_3_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    this_RIGHTBRACKET_15=(Token)match(input,RULE_RIGHTBRACKET,FOLLOW_21); 

                    				newLeafNode(this_RIGHTBRACKET_15, grammarAccess.getModelAccess().getRIGHTBRACKETTerminalRuleCall_9_4());
                    			
                    this_SEMICOLON_16=(Token)match(input,RULE_SEMICOLON,FOLLOW_25); 

                    				newLeafNode(this_SEMICOLON_16, grammarAccess.getModelAccess().getSEMICOLONTerminalRuleCall_9_5());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_17, grammarAccess.getModelAccess().getIdAtributeKeyword_10());
            		
            this_COLON_18=(Token)match(input,RULE_COLON,FOLLOW_12); 

            			newLeafNode(this_COLON_18, grammarAccess.getModelAccess().getCOLONTerminalRuleCall_11());
            		
            // InternalGenerator.g:921:3: ( (lv_idAtribute_19_0= ruleEString ) )
            // InternalGenerator.g:922:4: (lv_idAtribute_19_0= ruleEString )
            {
            // InternalGenerator.g:922:4: (lv_idAtribute_19_0= ruleEString )
            // InternalGenerator.g:923:5: lv_idAtribute_19_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModelAccess().getIdAtributeEStringParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_21);
            lv_idAtribute_19_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"idAtribute",
            						lv_idAtribute_19_0,
            						"uniandes.academia.Generator.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_20=(Token)match(input,RULE_SEMICOLON,FOLLOW_26); 

            			newLeafNode(this_SEMICOLON_20, grammarAccess.getModelAccess().getSEMICOLONTerminalRuleCall_13());
            		
            otherlv_21=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_21, grammarAccess.getModelAccess().getShowAttributeListKeyword_14());
            		
            this_COLON_22=(Token)match(input,RULE_COLON,FOLLOW_12); 

            			newLeafNode(this_COLON_22, grammarAccess.getModelAccess().getCOLONTerminalRuleCall_15());
            		
            // InternalGenerator.g:952:3: ( (lv_nameAttribute_23_0= ruleEString ) )
            // InternalGenerator.g:953:4: (lv_nameAttribute_23_0= ruleEString )
            {
            // InternalGenerator.g:953:4: (lv_nameAttribute_23_0= ruleEString )
            // InternalGenerator.g:954:5: lv_nameAttribute_23_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameAttributeEStringParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_21);
            lv_nameAttribute_23_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"nameAttribute",
            						lv_nameAttribute_23_0,
            						"uniandes.academia.Generator.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_24=(Token)match(input,RULE_SEMICOLON,FOLLOW_27); 

            			newLeafNode(this_SEMICOLON_24, grammarAccess.getModelAccess().getSEMICOLONTerminalRuleCall_17());
            		
            this_RIGTHCURLY_25=(Token)match(input,RULE_RIGTHCURLY,FOLLOW_2); 

            			newLeafNode(this_RIGTHCURLY_25, grammarAccess.getModelAccess().getRIGTHCURLYTerminalRuleCall_18());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAttribute"
    // InternalGenerator.g:983:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalGenerator.g:983:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalGenerator.g:984:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalGenerator.g:990:1: ruleAttribute returns [EObject current=null] : (this_LEFTCURLY_0= RULE_LEFTCURLY otherlv_1= 'attributeName' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleName ) ) this_COMA_4= RULE_COMA otherlv_5= 'type' this_COLON_6= RULE_COLON ( (lv_type_7_0= ruleEnumType ) ) (this_COMA_8= RULE_COMA )? (otherlv_9= 'component' this_COLON_10= RULE_COLON ( (otherlv_11= RULE_ID ) ) this_COMA_12= RULE_COMA )? (otherlv_13= 'isRequired' this_COLON_14= RULE_COLON ( (lv_isRequired_15_0= RULE_BOOLEAN ) ) (this_COMA_16= RULE_COMA )? )? (otherlv_17= 'mockType' this_COLON_18= RULE_COLON ( (lv_mockType_19_0= ruleEString ) ) )? this_RIGTHCURLY_20= RULE_RIGTHCURLY ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token this_LEFTCURLY_0=null;
        Token otherlv_1=null;
        Token this_COLON_2=null;
        Token this_COMA_4=null;
        Token otherlv_5=null;
        Token this_COLON_6=null;
        Token this_COMA_8=null;
        Token otherlv_9=null;
        Token this_COLON_10=null;
        Token otherlv_11=null;
        Token this_COMA_12=null;
        Token otherlv_13=null;
        Token this_COLON_14=null;
        Token lv_isRequired_15_0=null;
        Token this_COMA_16=null;
        Token otherlv_17=null;
        Token this_COLON_18=null;
        Token this_RIGTHCURLY_20=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_type_7_0 = null;

        AntlrDatatypeRuleToken lv_mockType_19_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:996:2: ( (this_LEFTCURLY_0= RULE_LEFTCURLY otherlv_1= 'attributeName' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleName ) ) this_COMA_4= RULE_COMA otherlv_5= 'type' this_COLON_6= RULE_COLON ( (lv_type_7_0= ruleEnumType ) ) (this_COMA_8= RULE_COMA )? (otherlv_9= 'component' this_COLON_10= RULE_COLON ( (otherlv_11= RULE_ID ) ) this_COMA_12= RULE_COMA )? (otherlv_13= 'isRequired' this_COLON_14= RULE_COLON ( (lv_isRequired_15_0= RULE_BOOLEAN ) ) (this_COMA_16= RULE_COMA )? )? (otherlv_17= 'mockType' this_COLON_18= RULE_COLON ( (lv_mockType_19_0= ruleEString ) ) )? this_RIGTHCURLY_20= RULE_RIGTHCURLY ) )
            // InternalGenerator.g:997:2: (this_LEFTCURLY_0= RULE_LEFTCURLY otherlv_1= 'attributeName' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleName ) ) this_COMA_4= RULE_COMA otherlv_5= 'type' this_COLON_6= RULE_COLON ( (lv_type_7_0= ruleEnumType ) ) (this_COMA_8= RULE_COMA )? (otherlv_9= 'component' this_COLON_10= RULE_COLON ( (otherlv_11= RULE_ID ) ) this_COMA_12= RULE_COMA )? (otherlv_13= 'isRequired' this_COLON_14= RULE_COLON ( (lv_isRequired_15_0= RULE_BOOLEAN ) ) (this_COMA_16= RULE_COMA )? )? (otherlv_17= 'mockType' this_COLON_18= RULE_COLON ( (lv_mockType_19_0= ruleEString ) ) )? this_RIGTHCURLY_20= RULE_RIGTHCURLY )
            {
            // InternalGenerator.g:997:2: (this_LEFTCURLY_0= RULE_LEFTCURLY otherlv_1= 'attributeName' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleName ) ) this_COMA_4= RULE_COMA otherlv_5= 'type' this_COLON_6= RULE_COLON ( (lv_type_7_0= ruleEnumType ) ) (this_COMA_8= RULE_COMA )? (otherlv_9= 'component' this_COLON_10= RULE_COLON ( (otherlv_11= RULE_ID ) ) this_COMA_12= RULE_COMA )? (otherlv_13= 'isRequired' this_COLON_14= RULE_COLON ( (lv_isRequired_15_0= RULE_BOOLEAN ) ) (this_COMA_16= RULE_COMA )? )? (otherlv_17= 'mockType' this_COLON_18= RULE_COLON ( (lv_mockType_19_0= ruleEString ) ) )? this_RIGTHCURLY_20= RULE_RIGTHCURLY )
            // InternalGenerator.g:998:3: this_LEFTCURLY_0= RULE_LEFTCURLY otherlv_1= 'attributeName' this_COLON_2= RULE_COLON ( (lv_name_3_0= ruleName ) ) this_COMA_4= RULE_COMA otherlv_5= 'type' this_COLON_6= RULE_COLON ( (lv_type_7_0= ruleEnumType ) ) (this_COMA_8= RULE_COMA )? (otherlv_9= 'component' this_COLON_10= RULE_COLON ( (otherlv_11= RULE_ID ) ) this_COMA_12= RULE_COMA )? (otherlv_13= 'isRequired' this_COLON_14= RULE_COLON ( (lv_isRequired_15_0= RULE_BOOLEAN ) ) (this_COMA_16= RULE_COMA )? )? (otherlv_17= 'mockType' this_COLON_18= RULE_COLON ( (lv_mockType_19_0= ruleEString ) ) )? this_RIGTHCURLY_20= RULE_RIGTHCURLY
            {
            this_LEFTCURLY_0=(Token)match(input,RULE_LEFTCURLY,FOLLOW_28); 

            			newLeafNode(this_LEFTCURLY_0, grammarAccess.getAttributeAccess().getLEFTCURLYTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeNameKeyword_1());
            		
            this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_4); 

            			newLeafNode(this_COLON_2, grammarAccess.getAttributeAccess().getCOLONTerminalRuleCall_2());
            		
            // InternalGenerator.g:1010:3: ( (lv_name_3_0= ruleName ) )
            // InternalGenerator.g:1011:4: (lv_name_3_0= ruleName )
            {
            // InternalGenerator.g:1011:4: (lv_name_3_0= ruleName )
            // InternalGenerator.g:1012:5: lv_name_3_0= ruleName
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_name_3_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"uniandes.academia.Generator.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMA_4=(Token)match(input,RULE_COMA,FOLLOW_30); 

            			newLeafNode(this_COMA_4, grammarAccess.getAttributeAccess().getCOMATerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,35,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getTypeKeyword_5());
            		
            this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_31); 

            			newLeafNode(this_COLON_6, grammarAccess.getAttributeAccess().getCOLONTerminalRuleCall_6());
            		
            // InternalGenerator.g:1041:3: ( (lv_type_7_0= ruleEnumType ) )
            // InternalGenerator.g:1042:4: (lv_type_7_0= ruleEnumType )
            {
            // InternalGenerator.g:1042:4: (lv_type_7_0= ruleEnumType )
            // InternalGenerator.g:1043:5: lv_type_7_0= ruleEnumType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeEnumTypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_32);
            lv_type_7_0=ruleEnumType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"uniandes.academia.Generator.EnumType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGenerator.g:1060:3: (this_COMA_8= RULE_COMA )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_COMA) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGenerator.g:1061:4: this_COMA_8= RULE_COMA
                    {
                    this_COMA_8=(Token)match(input,RULE_COMA,FOLLOW_33); 

                    				newLeafNode(this_COMA_8, grammarAccess.getAttributeAccess().getCOMATerminalRuleCall_8());
                    			

                    }
                    break;

            }

            // InternalGenerator.g:1066:3: (otherlv_9= 'component' this_COLON_10= RULE_COLON ( (otherlv_11= RULE_ID ) ) this_COMA_12= RULE_COMA )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGenerator.g:1067:4: otherlv_9= 'component' this_COLON_10= RULE_COLON ( (otherlv_11= RULE_ID ) ) this_COMA_12= RULE_COMA
                    {
                    otherlv_9=(Token)match(input,36,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getComponentKeyword_9_0());
                    			
                    this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_4); 

                    				newLeafNode(this_COLON_10, grammarAccess.getAttributeAccess().getCOLONTerminalRuleCall_9_1());
                    			
                    // InternalGenerator.g:1075:4: ( (otherlv_11= RULE_ID ) )
                    // InternalGenerator.g:1076:5: (otherlv_11= RULE_ID )
                    {
                    // InternalGenerator.g:1076:5: (otherlv_11= RULE_ID )
                    // InternalGenerator.g:1077:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getComponentComponentBasicCrossReference_9_2_0());
                    					

                    }


                    }

                    this_COMA_12=(Token)match(input,RULE_COMA,FOLLOW_34); 

                    				newLeafNode(this_COMA_12, grammarAccess.getAttributeAccess().getCOMATerminalRuleCall_9_3());
                    			

                    }
                    break;

            }

            // InternalGenerator.g:1093:3: (otherlv_13= 'isRequired' this_COLON_14= RULE_COLON ( (lv_isRequired_15_0= RULE_BOOLEAN ) ) (this_COMA_16= RULE_COMA )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGenerator.g:1094:4: otherlv_13= 'isRequired' this_COLON_14= RULE_COLON ( (lv_isRequired_15_0= RULE_BOOLEAN ) ) (this_COMA_16= RULE_COMA )?
                    {
                    otherlv_13=(Token)match(input,37,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getIsRequiredKeyword_10_0());
                    			
                    this_COLON_14=(Token)match(input,RULE_COLON,FOLLOW_35); 

                    				newLeafNode(this_COLON_14, grammarAccess.getAttributeAccess().getCOLONTerminalRuleCall_10_1());
                    			
                    // InternalGenerator.g:1102:4: ( (lv_isRequired_15_0= RULE_BOOLEAN ) )
                    // InternalGenerator.g:1103:5: (lv_isRequired_15_0= RULE_BOOLEAN )
                    {
                    // InternalGenerator.g:1103:5: (lv_isRequired_15_0= RULE_BOOLEAN )
                    // InternalGenerator.g:1104:6: lv_isRequired_15_0= RULE_BOOLEAN
                    {
                    lv_isRequired_15_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_36); 

                    						newLeafNode(lv_isRequired_15_0, grammarAccess.getAttributeAccess().getIsRequiredBOOLEANTerminalRuleCall_10_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"isRequired",
                    							lv_isRequired_15_0,
                    							"uniandes.academia.Generator.BOOLEAN");
                    					

                    }


                    }

                    // InternalGenerator.g:1120:4: (this_COMA_16= RULE_COMA )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_COMA) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalGenerator.g:1121:5: this_COMA_16= RULE_COMA
                            {
                            this_COMA_16=(Token)match(input,RULE_COMA,FOLLOW_37); 

                            					newLeafNode(this_COMA_16, grammarAccess.getAttributeAccess().getCOMATerminalRuleCall_10_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalGenerator.g:1127:3: (otherlv_17= 'mockType' this_COLON_18= RULE_COLON ( (lv_mockType_19_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGenerator.g:1128:4: otherlv_17= 'mockType' this_COLON_18= RULE_COLON ( (lv_mockType_19_0= ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,38,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getAttributeAccess().getMockTypeKeyword_11_0());
                    			
                    this_COLON_18=(Token)match(input,RULE_COLON,FOLLOW_12); 

                    				newLeafNode(this_COLON_18, grammarAccess.getAttributeAccess().getCOLONTerminalRuleCall_11_1());
                    			
                    // InternalGenerator.g:1136:4: ( (lv_mockType_19_0= ruleEString ) )
                    // InternalGenerator.g:1137:5: (lv_mockType_19_0= ruleEString )
                    {
                    // InternalGenerator.g:1137:5: (lv_mockType_19_0= ruleEString )
                    // InternalGenerator.g:1138:6: lv_mockType_19_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getMockTypeEStringParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_mockType_19_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"mockType",
                    							lv_mockType_19_0,
                    							"uniandes.academia.Generator.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_RIGTHCURLY_20=(Token)match(input,RULE_RIGTHCURLY,FOLLOW_2); 

            			newLeafNode(this_RIGTHCURLY_20, grammarAccess.getAttributeAccess().getRIGTHCURLYTerminalRuleCall_12());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleChild"
    // InternalGenerator.g:1164:1: entryRuleChild returns [EObject current=null] : iv_ruleChild= ruleChild EOF ;
    public final EObject entryRuleChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild = null;


        try {
            // InternalGenerator.g:1164:46: (iv_ruleChild= ruleChild EOF )
            // InternalGenerator.g:1165:2: iv_ruleChild= ruleChild EOF
            {
             newCompositeNode(grammarAccess.getChildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChild=ruleChild();

            state._fsp--;

             current =iv_ruleChild; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChild"


    // $ANTLR start "ruleChild"
    // InternalGenerator.g:1171:1: ruleChild returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) this_LEFTCURLY_1= RULE_LEFTCURLY otherlv_2= 'component' this_COLON_3= RULE_COLON ( (otherlv_4= RULE_ID ) ) this_COMA_5= RULE_COMA otherlv_6= 'attributeName' this_COLON_7= RULE_COLON ( (lv_attributeName_8_0= ruleEString ) ) this_COMA_9= RULE_COMA otherlv_10= 'relationshipType' this_COLON_11= RULE_COLON ( (lv_type_12_0= ruleEnumRealtionshipType ) ) (this_COMA_13= RULE_COMA )? this_RIGTHCURLY_14= RULE_RIGTHCURLY ) ;
    public final EObject ruleChild() throws RecognitionException {
        EObject current = null;

        Token this_LEFTCURLY_1=null;
        Token otherlv_2=null;
        Token this_COLON_3=null;
        Token otherlv_4=null;
        Token this_COMA_5=null;
        Token otherlv_6=null;
        Token this_COLON_7=null;
        Token this_COMA_9=null;
        Token otherlv_10=null;
        Token this_COLON_11=null;
        Token this_COMA_13=null;
        Token this_RIGTHCURLY_14=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_attributeName_8_0 = null;

        Enumerator lv_type_12_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:1177:2: ( ( ( (lv_name_0_0= ruleName ) ) this_LEFTCURLY_1= RULE_LEFTCURLY otherlv_2= 'component' this_COLON_3= RULE_COLON ( (otherlv_4= RULE_ID ) ) this_COMA_5= RULE_COMA otherlv_6= 'attributeName' this_COLON_7= RULE_COLON ( (lv_attributeName_8_0= ruleEString ) ) this_COMA_9= RULE_COMA otherlv_10= 'relationshipType' this_COLON_11= RULE_COLON ( (lv_type_12_0= ruleEnumRealtionshipType ) ) (this_COMA_13= RULE_COMA )? this_RIGTHCURLY_14= RULE_RIGTHCURLY ) )
            // InternalGenerator.g:1178:2: ( ( (lv_name_0_0= ruleName ) ) this_LEFTCURLY_1= RULE_LEFTCURLY otherlv_2= 'component' this_COLON_3= RULE_COLON ( (otherlv_4= RULE_ID ) ) this_COMA_5= RULE_COMA otherlv_6= 'attributeName' this_COLON_7= RULE_COLON ( (lv_attributeName_8_0= ruleEString ) ) this_COMA_9= RULE_COMA otherlv_10= 'relationshipType' this_COLON_11= RULE_COLON ( (lv_type_12_0= ruleEnumRealtionshipType ) ) (this_COMA_13= RULE_COMA )? this_RIGTHCURLY_14= RULE_RIGTHCURLY )
            {
            // InternalGenerator.g:1178:2: ( ( (lv_name_0_0= ruleName ) ) this_LEFTCURLY_1= RULE_LEFTCURLY otherlv_2= 'component' this_COLON_3= RULE_COLON ( (otherlv_4= RULE_ID ) ) this_COMA_5= RULE_COMA otherlv_6= 'attributeName' this_COLON_7= RULE_COLON ( (lv_attributeName_8_0= ruleEString ) ) this_COMA_9= RULE_COMA otherlv_10= 'relationshipType' this_COLON_11= RULE_COLON ( (lv_type_12_0= ruleEnumRealtionshipType ) ) (this_COMA_13= RULE_COMA )? this_RIGTHCURLY_14= RULE_RIGTHCURLY )
            // InternalGenerator.g:1179:3: ( (lv_name_0_0= ruleName ) ) this_LEFTCURLY_1= RULE_LEFTCURLY otherlv_2= 'component' this_COLON_3= RULE_COLON ( (otherlv_4= RULE_ID ) ) this_COMA_5= RULE_COMA otherlv_6= 'attributeName' this_COLON_7= RULE_COLON ( (lv_attributeName_8_0= ruleEString ) ) this_COMA_9= RULE_COMA otherlv_10= 'relationshipType' this_COLON_11= RULE_COLON ( (lv_type_12_0= ruleEnumRealtionshipType ) ) (this_COMA_13= RULE_COMA )? this_RIGTHCURLY_14= RULE_RIGTHCURLY
            {
            // InternalGenerator.g:1179:3: ( (lv_name_0_0= ruleName ) )
            // InternalGenerator.g:1180:4: (lv_name_0_0= ruleName )
            {
            // InternalGenerator.g:1180:4: (lv_name_0_0= ruleName )
            // InternalGenerator.g:1181:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getChildAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChildRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"uniandes.academia.Generator.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LEFTCURLY_1=(Token)match(input,RULE_LEFTCURLY,FOLLOW_38); 

            			newLeafNode(this_LEFTCURLY_1, grammarAccess.getChildAccess().getLEFTCURLYTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getChildAccess().getComponentKeyword_2());
            		
            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_4); 

            			newLeafNode(this_COLON_3, grammarAccess.getChildAccess().getCOLONTerminalRuleCall_3());
            		
            // InternalGenerator.g:1210:3: ( (otherlv_4= RULE_ID ) )
            // InternalGenerator.g:1211:4: (otherlv_4= RULE_ID )
            {
            // InternalGenerator.g:1211:4: (otherlv_4= RULE_ID )
            // InternalGenerator.g:1212:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChildRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_4, grammarAccess.getChildAccess().getComponentCrudCrossReference_4_0());
            				

            }


            }

            this_COMA_5=(Token)match(input,RULE_COMA,FOLLOW_28); 

            			newLeafNode(this_COMA_5, grammarAccess.getChildAccess().getCOMATerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,34,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getChildAccess().getAttributeNameKeyword_6());
            		
            this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_12); 

            			newLeafNode(this_COLON_7, grammarAccess.getChildAccess().getCOLONTerminalRuleCall_7());
            		
            // InternalGenerator.g:1235:3: ( (lv_attributeName_8_0= ruleEString ) )
            // InternalGenerator.g:1236:4: (lv_attributeName_8_0= ruleEString )
            {
            // InternalGenerator.g:1236:4: (lv_attributeName_8_0= ruleEString )
            // InternalGenerator.g:1237:5: lv_attributeName_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getChildAccess().getAttributeNameEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_29);
            lv_attributeName_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChildRule());
            					}
            					set(
            						current,
            						"attributeName",
            						lv_attributeName_8_0,
            						"uniandes.academia.Generator.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMA_9=(Token)match(input,RULE_COMA,FOLLOW_39); 

            			newLeafNode(this_COMA_9, grammarAccess.getChildAccess().getCOMATerminalRuleCall_9());
            		
            otherlv_10=(Token)match(input,39,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getChildAccess().getRelationshipTypeKeyword_10());
            		
            this_COLON_11=(Token)match(input,RULE_COLON,FOLLOW_40); 

            			newLeafNode(this_COLON_11, grammarAccess.getChildAccess().getCOLONTerminalRuleCall_11());
            		
            // InternalGenerator.g:1266:3: ( (lv_type_12_0= ruleEnumRealtionshipType ) )
            // InternalGenerator.g:1267:4: (lv_type_12_0= ruleEnumRealtionshipType )
            {
            // InternalGenerator.g:1267:4: (lv_type_12_0= ruleEnumRealtionshipType )
            // InternalGenerator.g:1268:5: lv_type_12_0= ruleEnumRealtionshipType
            {

            					newCompositeNode(grammarAccess.getChildAccess().getTypeEnumRealtionshipTypeEnumRuleCall_12_0());
            				
            pushFollow(FOLLOW_41);
            lv_type_12_0=ruleEnumRealtionshipType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChildRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_12_0,
            						"uniandes.academia.Generator.EnumRealtionshipType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGenerator.g:1285:3: (this_COMA_13= RULE_COMA )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_COMA) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGenerator.g:1286:4: this_COMA_13= RULE_COMA
                    {
                    this_COMA_13=(Token)match(input,RULE_COMA,FOLLOW_27); 

                    				newLeafNode(this_COMA_13, grammarAccess.getChildAccess().getCOMATerminalRuleCall_13());
                    			

                    }
                    break;

            }

            this_RIGTHCURLY_14=(Token)match(input,RULE_RIGTHCURLY,FOLLOW_2); 

            			newLeafNode(this_RIGTHCURLY_14, grammarAccess.getChildAccess().getRIGTHCURLYTerminalRuleCall_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChild"


    // $ANTLR start "entryRuleVisualModule"
    // InternalGenerator.g:1299:1: entryRuleVisualModule returns [EObject current=null] : iv_ruleVisualModule= ruleVisualModule EOF ;
    public final EObject entryRuleVisualModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualModule = null;


        try {
            // InternalGenerator.g:1299:53: (iv_ruleVisualModule= ruleVisualModule EOF )
            // InternalGenerator.g:1300:2: iv_ruleVisualModule= ruleVisualModule EOF
            {
             newCompositeNode(grammarAccess.getVisualModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisualModule=ruleVisualModule();

            state._fsp--;

             current =iv_ruleVisualModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisualModule"


    // $ANTLR start "ruleVisualModule"
    // InternalGenerator.g:1306:1: ruleVisualModule returns [EObject current=null] : (otherlv_0= 'VisualModule' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY (otherlv_3= 'parent' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON )? otherlv_7= 'imports' this_COLON_8= RULE_COLON this_LEFTBRACKET_9= RULE_LEFTBRACKET ( ( (otherlv_10= RULE_ID ) ) (this_COMA_11= RULE_COMA )? )* this_RIGHTBRACKET_12= RULE_RIGHTBRACKET this_SEMICOLON_13= RULE_SEMICOLON otherlv_14= 'exports' this_COLON_15= RULE_COLON this_LEFTBRACKET_16= RULE_LEFTBRACKET ( ( (otherlv_17= RULE_ID ) ) (this_COMA_18= RULE_COMA )? )* this_RIGHTBRACKET_19= RULE_RIGHTBRACKET this_SEMICOLON_20= RULE_SEMICOLON otherlv_21= 'route' this_COLON_22= RULE_COLON this_LEFTBRACKET_23= RULE_LEFTBRACKET ( ( (lv_routes_24_0= ruleEString ) ) (this_COMA_25= RULE_COMA )? )* this_RIGHTBRACKET_26= RULE_RIGHTBRACKET this_SEMICOLON_27= RULE_SEMICOLON otherlv_28= 'show' this_COLON_29= RULE_COLON this_LEFTBRACKET_30= RULE_LEFTBRACKET ( ( (lv_show_31_0= ruleEString ) ) (this_COMA_32= RULE_COMA )? )* this_RIGHTBRACKET_33= RULE_RIGHTBRACKET this_SEMICOLON_34= RULE_SEMICOLON otherlv_35= 'defaultRoute' this_COLON_36= RULE_COLON ( (lv_defaultRoute_37_0= ruleEString ) ) this_SEMICOLON_38= RULE_SEMICOLON (otherlv_39= 'showLayout' this_COLON_40= RULE_COLON ( (lv_type_41_0= ruleEnumLayout ) ) this_SEMICOLON_42= RULE_SEMICOLON )? otherlv_43= 'components' this_COLON_44= RULE_COLON this_LEFTBRACKET_45= RULE_LEFTBRACKET ( ( (otherlv_46= RULE_ID ) ) (this_COMA_47= RULE_COMA )? )* this_RIGHTBRACKET_48= RULE_RIGHTBRACKET this_SEMICOLON_49= RULE_SEMICOLON this_RIGTHCURLY_50= RULE_RIGTHCURLY ) ;
    public final EObject ruleVisualModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFTCURLY_2=null;
        Token otherlv_3=null;
        Token this_COLON_4=null;
        Token otherlv_5=null;
        Token this_SEMICOLON_6=null;
        Token otherlv_7=null;
        Token this_COLON_8=null;
        Token this_LEFTBRACKET_9=null;
        Token otherlv_10=null;
        Token this_COMA_11=null;
        Token this_RIGHTBRACKET_12=null;
        Token this_SEMICOLON_13=null;
        Token otherlv_14=null;
        Token this_COLON_15=null;
        Token this_LEFTBRACKET_16=null;
        Token otherlv_17=null;
        Token this_COMA_18=null;
        Token this_RIGHTBRACKET_19=null;
        Token this_SEMICOLON_20=null;
        Token otherlv_21=null;
        Token this_COLON_22=null;
        Token this_LEFTBRACKET_23=null;
        Token this_COMA_25=null;
        Token this_RIGHTBRACKET_26=null;
        Token this_SEMICOLON_27=null;
        Token otherlv_28=null;
        Token this_COLON_29=null;
        Token this_LEFTBRACKET_30=null;
        Token this_COMA_32=null;
        Token this_RIGHTBRACKET_33=null;
        Token this_SEMICOLON_34=null;
        Token otherlv_35=null;
        Token this_COLON_36=null;
        Token this_SEMICOLON_38=null;
        Token otherlv_39=null;
        Token this_COLON_40=null;
        Token this_SEMICOLON_42=null;
        Token otherlv_43=null;
        Token this_COLON_44=null;
        Token this_LEFTBRACKET_45=null;
        Token otherlv_46=null;
        Token this_COMA_47=null;
        Token this_RIGHTBRACKET_48=null;
        Token this_SEMICOLON_49=null;
        Token this_RIGTHCURLY_50=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_routes_24_0 = null;

        AntlrDatatypeRuleToken lv_show_31_0 = null;

        AntlrDatatypeRuleToken lv_defaultRoute_37_0 = null;

        Enumerator lv_type_41_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:1312:2: ( (otherlv_0= 'VisualModule' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY (otherlv_3= 'parent' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON )? otherlv_7= 'imports' this_COLON_8= RULE_COLON this_LEFTBRACKET_9= RULE_LEFTBRACKET ( ( (otherlv_10= RULE_ID ) ) (this_COMA_11= RULE_COMA )? )* this_RIGHTBRACKET_12= RULE_RIGHTBRACKET this_SEMICOLON_13= RULE_SEMICOLON otherlv_14= 'exports' this_COLON_15= RULE_COLON this_LEFTBRACKET_16= RULE_LEFTBRACKET ( ( (otherlv_17= RULE_ID ) ) (this_COMA_18= RULE_COMA )? )* this_RIGHTBRACKET_19= RULE_RIGHTBRACKET this_SEMICOLON_20= RULE_SEMICOLON otherlv_21= 'route' this_COLON_22= RULE_COLON this_LEFTBRACKET_23= RULE_LEFTBRACKET ( ( (lv_routes_24_0= ruleEString ) ) (this_COMA_25= RULE_COMA )? )* this_RIGHTBRACKET_26= RULE_RIGHTBRACKET this_SEMICOLON_27= RULE_SEMICOLON otherlv_28= 'show' this_COLON_29= RULE_COLON this_LEFTBRACKET_30= RULE_LEFTBRACKET ( ( (lv_show_31_0= ruleEString ) ) (this_COMA_32= RULE_COMA )? )* this_RIGHTBRACKET_33= RULE_RIGHTBRACKET this_SEMICOLON_34= RULE_SEMICOLON otherlv_35= 'defaultRoute' this_COLON_36= RULE_COLON ( (lv_defaultRoute_37_0= ruleEString ) ) this_SEMICOLON_38= RULE_SEMICOLON (otherlv_39= 'showLayout' this_COLON_40= RULE_COLON ( (lv_type_41_0= ruleEnumLayout ) ) this_SEMICOLON_42= RULE_SEMICOLON )? otherlv_43= 'components' this_COLON_44= RULE_COLON this_LEFTBRACKET_45= RULE_LEFTBRACKET ( ( (otherlv_46= RULE_ID ) ) (this_COMA_47= RULE_COMA )? )* this_RIGHTBRACKET_48= RULE_RIGHTBRACKET this_SEMICOLON_49= RULE_SEMICOLON this_RIGTHCURLY_50= RULE_RIGTHCURLY ) )
            // InternalGenerator.g:1313:2: (otherlv_0= 'VisualModule' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY (otherlv_3= 'parent' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON )? otherlv_7= 'imports' this_COLON_8= RULE_COLON this_LEFTBRACKET_9= RULE_LEFTBRACKET ( ( (otherlv_10= RULE_ID ) ) (this_COMA_11= RULE_COMA )? )* this_RIGHTBRACKET_12= RULE_RIGHTBRACKET this_SEMICOLON_13= RULE_SEMICOLON otherlv_14= 'exports' this_COLON_15= RULE_COLON this_LEFTBRACKET_16= RULE_LEFTBRACKET ( ( (otherlv_17= RULE_ID ) ) (this_COMA_18= RULE_COMA )? )* this_RIGHTBRACKET_19= RULE_RIGHTBRACKET this_SEMICOLON_20= RULE_SEMICOLON otherlv_21= 'route' this_COLON_22= RULE_COLON this_LEFTBRACKET_23= RULE_LEFTBRACKET ( ( (lv_routes_24_0= ruleEString ) ) (this_COMA_25= RULE_COMA )? )* this_RIGHTBRACKET_26= RULE_RIGHTBRACKET this_SEMICOLON_27= RULE_SEMICOLON otherlv_28= 'show' this_COLON_29= RULE_COLON this_LEFTBRACKET_30= RULE_LEFTBRACKET ( ( (lv_show_31_0= ruleEString ) ) (this_COMA_32= RULE_COMA )? )* this_RIGHTBRACKET_33= RULE_RIGHTBRACKET this_SEMICOLON_34= RULE_SEMICOLON otherlv_35= 'defaultRoute' this_COLON_36= RULE_COLON ( (lv_defaultRoute_37_0= ruleEString ) ) this_SEMICOLON_38= RULE_SEMICOLON (otherlv_39= 'showLayout' this_COLON_40= RULE_COLON ( (lv_type_41_0= ruleEnumLayout ) ) this_SEMICOLON_42= RULE_SEMICOLON )? otherlv_43= 'components' this_COLON_44= RULE_COLON this_LEFTBRACKET_45= RULE_LEFTBRACKET ( ( (otherlv_46= RULE_ID ) ) (this_COMA_47= RULE_COMA )? )* this_RIGHTBRACKET_48= RULE_RIGHTBRACKET this_SEMICOLON_49= RULE_SEMICOLON this_RIGTHCURLY_50= RULE_RIGTHCURLY )
            {
            // InternalGenerator.g:1313:2: (otherlv_0= 'VisualModule' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY (otherlv_3= 'parent' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON )? otherlv_7= 'imports' this_COLON_8= RULE_COLON this_LEFTBRACKET_9= RULE_LEFTBRACKET ( ( (otherlv_10= RULE_ID ) ) (this_COMA_11= RULE_COMA )? )* this_RIGHTBRACKET_12= RULE_RIGHTBRACKET this_SEMICOLON_13= RULE_SEMICOLON otherlv_14= 'exports' this_COLON_15= RULE_COLON this_LEFTBRACKET_16= RULE_LEFTBRACKET ( ( (otherlv_17= RULE_ID ) ) (this_COMA_18= RULE_COMA )? )* this_RIGHTBRACKET_19= RULE_RIGHTBRACKET this_SEMICOLON_20= RULE_SEMICOLON otherlv_21= 'route' this_COLON_22= RULE_COLON this_LEFTBRACKET_23= RULE_LEFTBRACKET ( ( (lv_routes_24_0= ruleEString ) ) (this_COMA_25= RULE_COMA )? )* this_RIGHTBRACKET_26= RULE_RIGHTBRACKET this_SEMICOLON_27= RULE_SEMICOLON otherlv_28= 'show' this_COLON_29= RULE_COLON this_LEFTBRACKET_30= RULE_LEFTBRACKET ( ( (lv_show_31_0= ruleEString ) ) (this_COMA_32= RULE_COMA )? )* this_RIGHTBRACKET_33= RULE_RIGHTBRACKET this_SEMICOLON_34= RULE_SEMICOLON otherlv_35= 'defaultRoute' this_COLON_36= RULE_COLON ( (lv_defaultRoute_37_0= ruleEString ) ) this_SEMICOLON_38= RULE_SEMICOLON (otherlv_39= 'showLayout' this_COLON_40= RULE_COLON ( (lv_type_41_0= ruleEnumLayout ) ) this_SEMICOLON_42= RULE_SEMICOLON )? otherlv_43= 'components' this_COLON_44= RULE_COLON this_LEFTBRACKET_45= RULE_LEFTBRACKET ( ( (otherlv_46= RULE_ID ) ) (this_COMA_47= RULE_COMA )? )* this_RIGHTBRACKET_48= RULE_RIGHTBRACKET this_SEMICOLON_49= RULE_SEMICOLON this_RIGTHCURLY_50= RULE_RIGTHCURLY )
            // InternalGenerator.g:1314:3: otherlv_0= 'VisualModule' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY (otherlv_3= 'parent' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON )? otherlv_7= 'imports' this_COLON_8= RULE_COLON this_LEFTBRACKET_9= RULE_LEFTBRACKET ( ( (otherlv_10= RULE_ID ) ) (this_COMA_11= RULE_COMA )? )* this_RIGHTBRACKET_12= RULE_RIGHTBRACKET this_SEMICOLON_13= RULE_SEMICOLON otherlv_14= 'exports' this_COLON_15= RULE_COLON this_LEFTBRACKET_16= RULE_LEFTBRACKET ( ( (otherlv_17= RULE_ID ) ) (this_COMA_18= RULE_COMA )? )* this_RIGHTBRACKET_19= RULE_RIGHTBRACKET this_SEMICOLON_20= RULE_SEMICOLON otherlv_21= 'route' this_COLON_22= RULE_COLON this_LEFTBRACKET_23= RULE_LEFTBRACKET ( ( (lv_routes_24_0= ruleEString ) ) (this_COMA_25= RULE_COMA )? )* this_RIGHTBRACKET_26= RULE_RIGHTBRACKET this_SEMICOLON_27= RULE_SEMICOLON otherlv_28= 'show' this_COLON_29= RULE_COLON this_LEFTBRACKET_30= RULE_LEFTBRACKET ( ( (lv_show_31_0= ruleEString ) ) (this_COMA_32= RULE_COMA )? )* this_RIGHTBRACKET_33= RULE_RIGHTBRACKET this_SEMICOLON_34= RULE_SEMICOLON otherlv_35= 'defaultRoute' this_COLON_36= RULE_COLON ( (lv_defaultRoute_37_0= ruleEString ) ) this_SEMICOLON_38= RULE_SEMICOLON (otherlv_39= 'showLayout' this_COLON_40= RULE_COLON ( (lv_type_41_0= ruleEnumLayout ) ) this_SEMICOLON_42= RULE_SEMICOLON )? otherlv_43= 'components' this_COLON_44= RULE_COLON this_LEFTBRACKET_45= RULE_LEFTBRACKET ( ( (otherlv_46= RULE_ID ) ) (this_COMA_47= RULE_COMA )? )* this_RIGHTBRACKET_48= RULE_RIGHTBRACKET this_SEMICOLON_49= RULE_SEMICOLON this_RIGTHCURLY_50= RULE_RIGTHCURLY
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVisualModuleAccess().getVisualModuleKeyword_0());
            		
            // InternalGenerator.g:1318:3: ( (lv_name_1_0= ruleName ) )
            // InternalGenerator.g:1319:4: (lv_name_1_0= ruleName )
            {
            // InternalGenerator.g:1319:4: (lv_name_1_0= ruleName )
            // InternalGenerator.g:1320:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getVisualModuleAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisualModuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uniandes.academia.Generator.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LEFTCURLY_2=(Token)match(input,RULE_LEFTCURLY,FOLLOW_42); 

            			newLeafNode(this_LEFTCURLY_2, grammarAccess.getVisualModuleAccess().getLEFTCURLYTerminalRuleCall_2());
            		
            // InternalGenerator.g:1341:3: (otherlv_3= 'parent' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGenerator.g:1342:4: otherlv_3= 'parent' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getVisualModuleAccess().getParentKeyword_3_0());
                    			
                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_4); 

                    				newLeafNode(this_COLON_4, grammarAccess.getVisualModuleAccess().getCOLONTerminalRuleCall_3_1());
                    			
                    // InternalGenerator.g:1350:4: ( (otherlv_5= RULE_ID ) )
                    // InternalGenerator.g:1351:5: (otherlv_5= RULE_ID )
                    {
                    // InternalGenerator.g:1351:5: (otherlv_5= RULE_ID )
                    // InternalGenerator.g:1352:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVisualModuleRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(otherlv_5, grammarAccess.getVisualModuleAccess().getParentModuleCrossReference_3_2_0());
                    					

                    }


                    }

                    this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_43); 

                    				newLeafNode(this_SEMICOLON_6, grammarAccess.getVisualModuleAccess().getSEMICOLONTerminalRuleCall_3_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,42,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getVisualModuleAccess().getImportsKeyword_4());
            		
            this_COLON_8=(Token)match(input,RULE_COLON,FOLLOW_18); 

            			newLeafNode(this_COLON_8, grammarAccess.getVisualModuleAccess().getCOLONTerminalRuleCall_5());
            		
            this_LEFTBRACKET_9=(Token)match(input,RULE_LEFTBRACKET,FOLLOW_23); 

            			newLeafNode(this_LEFTBRACKET_9, grammarAccess.getVisualModuleAccess().getLEFTBRACKETTerminalRuleCall_6());
            		
            // InternalGenerator.g:1380:3: ( ( (otherlv_10= RULE_ID ) ) (this_COMA_11= RULE_COMA )? )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGenerator.g:1381:4: ( (otherlv_10= RULE_ID ) ) (this_COMA_11= RULE_COMA )?
            	    {
            	    // InternalGenerator.g:1381:4: ( (otherlv_10= RULE_ID ) )
            	    // InternalGenerator.g:1382:5: (otherlv_10= RULE_ID )
            	    {
            	    // InternalGenerator.g:1382:5: (otherlv_10= RULE_ID )
            	    // InternalGenerator.g:1383:6: otherlv_10= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVisualModuleRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_10, grammarAccess.getVisualModuleAccess().getImportsModuleCrossReference_7_0_0());
            	    					

            	    }


            	    }

            	    // InternalGenerator.g:1394:4: (this_COMA_11= RULE_COMA )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==RULE_COMA) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalGenerator.g:1395:5: this_COMA_11= RULE_COMA
            	            {
            	            this_COMA_11=(Token)match(input,RULE_COMA,FOLLOW_23); 

            	            					newLeafNode(this_COMA_11, grammarAccess.getVisualModuleAccess().getCOMATerminalRuleCall_7_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            this_RIGHTBRACKET_12=(Token)match(input,RULE_RIGHTBRACKET,FOLLOW_21); 

            			newLeafNode(this_RIGHTBRACKET_12, grammarAccess.getVisualModuleAccess().getRIGHTBRACKETTerminalRuleCall_8());
            		
            this_SEMICOLON_13=(Token)match(input,RULE_SEMICOLON,FOLLOW_44); 

            			newLeafNode(this_SEMICOLON_13, grammarAccess.getVisualModuleAccess().getSEMICOLONTerminalRuleCall_9());
            		
            otherlv_14=(Token)match(input,43,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getVisualModuleAccess().getExportsKeyword_10());
            		
            this_COLON_15=(Token)match(input,RULE_COLON,FOLLOW_18); 

            			newLeafNode(this_COLON_15, grammarAccess.getVisualModuleAccess().getCOLONTerminalRuleCall_11());
            		
            this_LEFTBRACKET_16=(Token)match(input,RULE_LEFTBRACKET,FOLLOW_23); 

            			newLeafNode(this_LEFTBRACKET_16, grammarAccess.getVisualModuleAccess().getLEFTBRACKETTerminalRuleCall_12());
            		
            // InternalGenerator.g:1421:3: ( ( (otherlv_17= RULE_ID ) ) (this_COMA_18= RULE_COMA )? )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGenerator.g:1422:4: ( (otherlv_17= RULE_ID ) ) (this_COMA_18= RULE_COMA )?
            	    {
            	    // InternalGenerator.g:1422:4: ( (otherlv_17= RULE_ID ) )
            	    // InternalGenerator.g:1423:5: (otherlv_17= RULE_ID )
            	    {
            	    // InternalGenerator.g:1423:5: (otherlv_17= RULE_ID )
            	    // InternalGenerator.g:1424:6: otherlv_17= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVisualModuleRule());
            	    						}
            	    					
            	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_17, grammarAccess.getVisualModuleAccess().getExportsModuleCrossReference_13_0_0());
            	    					

            	    }


            	    }

            	    // InternalGenerator.g:1435:4: (this_COMA_18= RULE_COMA )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==RULE_COMA) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalGenerator.g:1436:5: this_COMA_18= RULE_COMA
            	            {
            	            this_COMA_18=(Token)match(input,RULE_COMA,FOLLOW_23); 

            	            					newLeafNode(this_COMA_18, grammarAccess.getVisualModuleAccess().getCOMATerminalRuleCall_13_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            this_RIGHTBRACKET_19=(Token)match(input,RULE_RIGHTBRACKET,FOLLOW_21); 

            			newLeafNode(this_RIGHTBRACKET_19, grammarAccess.getVisualModuleAccess().getRIGHTBRACKETTerminalRuleCall_14());
            		
            this_SEMICOLON_20=(Token)match(input,RULE_SEMICOLON,FOLLOW_45); 

            			newLeafNode(this_SEMICOLON_20, grammarAccess.getVisualModuleAccess().getSEMICOLONTerminalRuleCall_15());
            		
            otherlv_21=(Token)match(input,44,FOLLOW_11); 

            			newLeafNode(otherlv_21, grammarAccess.getVisualModuleAccess().getRouteKeyword_16());
            		
            this_COLON_22=(Token)match(input,RULE_COLON,FOLLOW_18); 

            			newLeafNode(this_COLON_22, grammarAccess.getVisualModuleAccess().getCOLONTerminalRuleCall_17());
            		
            this_LEFTBRACKET_23=(Token)match(input,RULE_LEFTBRACKET,FOLLOW_46); 

            			newLeafNode(this_LEFTBRACKET_23, grammarAccess.getVisualModuleAccess().getLEFTBRACKETTerminalRuleCall_18());
            		
            // InternalGenerator.g:1462:3: ( ( (lv_routes_24_0= ruleEString ) ) (this_COMA_25= RULE_COMA )? )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==RULE_STRING) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGenerator.g:1463:4: ( (lv_routes_24_0= ruleEString ) ) (this_COMA_25= RULE_COMA )?
            	    {
            	    // InternalGenerator.g:1463:4: ( (lv_routes_24_0= ruleEString ) )
            	    // InternalGenerator.g:1464:5: (lv_routes_24_0= ruleEString )
            	    {
            	    // InternalGenerator.g:1464:5: (lv_routes_24_0= ruleEString )
            	    // InternalGenerator.g:1465:6: lv_routes_24_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getVisualModuleAccess().getRoutesEStringParserRuleCall_19_0_0());
            	    					
            	    pushFollow(FOLLOW_47);
            	    lv_routes_24_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVisualModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"routes",
            	    							lv_routes_24_0,
            	    							"uniandes.academia.Generator.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalGenerator.g:1482:4: (this_COMA_25= RULE_COMA )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==RULE_COMA) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalGenerator.g:1483:5: this_COMA_25= RULE_COMA
            	            {
            	            this_COMA_25=(Token)match(input,RULE_COMA,FOLLOW_46); 

            	            					newLeafNode(this_COMA_25, grammarAccess.getVisualModuleAccess().getCOMATerminalRuleCall_19_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            this_RIGHTBRACKET_26=(Token)match(input,RULE_RIGHTBRACKET,FOLLOW_21); 

            			newLeafNode(this_RIGHTBRACKET_26, grammarAccess.getVisualModuleAccess().getRIGHTBRACKETTerminalRuleCall_20());
            		
            this_SEMICOLON_27=(Token)match(input,RULE_SEMICOLON,FOLLOW_48); 

            			newLeafNode(this_SEMICOLON_27, grammarAccess.getVisualModuleAccess().getSEMICOLONTerminalRuleCall_21());
            		
            otherlv_28=(Token)match(input,45,FOLLOW_11); 

            			newLeafNode(otherlv_28, grammarAccess.getVisualModuleAccess().getShowKeyword_22());
            		
            this_COLON_29=(Token)match(input,RULE_COLON,FOLLOW_18); 

            			newLeafNode(this_COLON_29, grammarAccess.getVisualModuleAccess().getCOLONTerminalRuleCall_23());
            		
            this_LEFTBRACKET_30=(Token)match(input,RULE_LEFTBRACKET,FOLLOW_46); 

            			newLeafNode(this_LEFTBRACKET_30, grammarAccess.getVisualModuleAccess().getLEFTBRACKETTerminalRuleCall_24());
            		
            // InternalGenerator.g:1509:3: ( ( (lv_show_31_0= ruleEString ) ) (this_COMA_32= RULE_COMA )? )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||LA32_0==RULE_STRING) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalGenerator.g:1510:4: ( (lv_show_31_0= ruleEString ) ) (this_COMA_32= RULE_COMA )?
            	    {
            	    // InternalGenerator.g:1510:4: ( (lv_show_31_0= ruleEString ) )
            	    // InternalGenerator.g:1511:5: (lv_show_31_0= ruleEString )
            	    {
            	    // InternalGenerator.g:1511:5: (lv_show_31_0= ruleEString )
            	    // InternalGenerator.g:1512:6: lv_show_31_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getVisualModuleAccess().getShowEStringParserRuleCall_25_0_0());
            	    					
            	    pushFollow(FOLLOW_47);
            	    lv_show_31_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVisualModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"show",
            	    							lv_show_31_0,
            	    							"uniandes.academia.Generator.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalGenerator.g:1529:4: (this_COMA_32= RULE_COMA )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==RULE_COMA) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalGenerator.g:1530:5: this_COMA_32= RULE_COMA
            	            {
            	            this_COMA_32=(Token)match(input,RULE_COMA,FOLLOW_46); 

            	            					newLeafNode(this_COMA_32, grammarAccess.getVisualModuleAccess().getCOMATerminalRuleCall_25_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            this_RIGHTBRACKET_33=(Token)match(input,RULE_RIGHTBRACKET,FOLLOW_21); 

            			newLeafNode(this_RIGHTBRACKET_33, grammarAccess.getVisualModuleAccess().getRIGHTBRACKETTerminalRuleCall_26());
            		
            this_SEMICOLON_34=(Token)match(input,RULE_SEMICOLON,FOLLOW_49); 

            			newLeafNode(this_SEMICOLON_34, grammarAccess.getVisualModuleAccess().getSEMICOLONTerminalRuleCall_27());
            		
            otherlv_35=(Token)match(input,46,FOLLOW_11); 

            			newLeafNode(otherlv_35, grammarAccess.getVisualModuleAccess().getDefaultRouteKeyword_28());
            		
            this_COLON_36=(Token)match(input,RULE_COLON,FOLLOW_12); 

            			newLeafNode(this_COLON_36, grammarAccess.getVisualModuleAccess().getCOLONTerminalRuleCall_29());
            		
            // InternalGenerator.g:1552:3: ( (lv_defaultRoute_37_0= ruleEString ) )
            // InternalGenerator.g:1553:4: (lv_defaultRoute_37_0= ruleEString )
            {
            // InternalGenerator.g:1553:4: (lv_defaultRoute_37_0= ruleEString )
            // InternalGenerator.g:1554:5: lv_defaultRoute_37_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVisualModuleAccess().getDefaultRouteEStringParserRuleCall_30_0());
            				
            pushFollow(FOLLOW_21);
            lv_defaultRoute_37_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisualModuleRule());
            					}
            					set(
            						current,
            						"defaultRoute",
            						lv_defaultRoute_37_0,
            						"uniandes.academia.Generator.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_38=(Token)match(input,RULE_SEMICOLON,FOLLOW_50); 

            			newLeafNode(this_SEMICOLON_38, grammarAccess.getVisualModuleAccess().getSEMICOLONTerminalRuleCall_31());
            		
            // InternalGenerator.g:1575:3: (otherlv_39= 'showLayout' this_COLON_40= RULE_COLON ( (lv_type_41_0= ruleEnumLayout ) ) this_SEMICOLON_42= RULE_SEMICOLON )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==47) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGenerator.g:1576:4: otherlv_39= 'showLayout' this_COLON_40= RULE_COLON ( (lv_type_41_0= ruleEnumLayout ) ) this_SEMICOLON_42= RULE_SEMICOLON
                    {
                    otherlv_39=(Token)match(input,47,FOLLOW_11); 

                    				newLeafNode(otherlv_39, grammarAccess.getVisualModuleAccess().getShowLayoutKeyword_32_0());
                    			
                    this_COLON_40=(Token)match(input,RULE_COLON,FOLLOW_51); 

                    				newLeafNode(this_COLON_40, grammarAccess.getVisualModuleAccess().getCOLONTerminalRuleCall_32_1());
                    			
                    // InternalGenerator.g:1584:4: ( (lv_type_41_0= ruleEnumLayout ) )
                    // InternalGenerator.g:1585:5: (lv_type_41_0= ruleEnumLayout )
                    {
                    // InternalGenerator.g:1585:5: (lv_type_41_0= ruleEnumLayout )
                    // InternalGenerator.g:1586:6: lv_type_41_0= ruleEnumLayout
                    {

                    						newCompositeNode(grammarAccess.getVisualModuleAccess().getTypeEnumLayoutEnumRuleCall_32_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_type_41_0=ruleEnumLayout();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVisualModuleRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_41_0,
                    							"uniandes.academia.Generator.EnumLayout");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMICOLON_42=(Token)match(input,RULE_SEMICOLON,FOLLOW_52); 

                    				newLeafNode(this_SEMICOLON_42, grammarAccess.getVisualModuleAccess().getSEMICOLONTerminalRuleCall_32_3());
                    			

                    }
                    break;

            }

            otherlv_43=(Token)match(input,48,FOLLOW_11); 

            			newLeafNode(otherlv_43, grammarAccess.getVisualModuleAccess().getComponentsKeyword_33());
            		
            this_COLON_44=(Token)match(input,RULE_COLON,FOLLOW_18); 

            			newLeafNode(this_COLON_44, grammarAccess.getVisualModuleAccess().getCOLONTerminalRuleCall_34());
            		
            this_LEFTBRACKET_45=(Token)match(input,RULE_LEFTBRACKET,FOLLOW_23); 

            			newLeafNode(this_LEFTBRACKET_45, grammarAccess.getVisualModuleAccess().getLEFTBRACKETTerminalRuleCall_35());
            		
            // InternalGenerator.g:1620:3: ( ( (otherlv_46= RULE_ID ) ) (this_COMA_47= RULE_COMA )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGenerator.g:1621:4: ( (otherlv_46= RULE_ID ) ) (this_COMA_47= RULE_COMA )?
            	    {
            	    // InternalGenerator.g:1621:4: ( (otherlv_46= RULE_ID ) )
            	    // InternalGenerator.g:1622:5: (otherlv_46= RULE_ID )
            	    {
            	    // InternalGenerator.g:1622:5: (otherlv_46= RULE_ID )
            	    // InternalGenerator.g:1623:6: otherlv_46= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVisualModuleRule());
            	    						}
            	    					
            	    otherlv_46=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_46, grammarAccess.getVisualModuleAccess().getComponentsComponentCrossReference_36_0_0());
            	    					

            	    }


            	    }

            	    // InternalGenerator.g:1634:4: (this_COMA_47= RULE_COMA )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==RULE_COMA) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalGenerator.g:1635:5: this_COMA_47= RULE_COMA
            	            {
            	            this_COMA_47=(Token)match(input,RULE_COMA,FOLLOW_23); 

            	            					newLeafNode(this_COMA_47, grammarAccess.getVisualModuleAccess().getCOMATerminalRuleCall_36_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            this_RIGHTBRACKET_48=(Token)match(input,RULE_RIGHTBRACKET,FOLLOW_21); 

            			newLeafNode(this_RIGHTBRACKET_48, grammarAccess.getVisualModuleAccess().getRIGHTBRACKETTerminalRuleCall_37());
            		
            this_SEMICOLON_49=(Token)match(input,RULE_SEMICOLON,FOLLOW_27); 

            			newLeafNode(this_SEMICOLON_49, grammarAccess.getVisualModuleAccess().getSEMICOLONTerminalRuleCall_38());
            		
            this_RIGTHCURLY_50=(Token)match(input,RULE_RIGTHCURLY,FOLLOW_2); 

            			newLeafNode(this_RIGTHCURLY_50, grammarAccess.getVisualModuleAccess().getRIGTHCURLYTerminalRuleCall_39());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisualModule"


    // $ANTLR start "entryRuleContainerModule"
    // InternalGenerator.g:1657:1: entryRuleContainerModule returns [EObject current=null] : iv_ruleContainerModule= ruleContainerModule EOF ;
    public final EObject entryRuleContainerModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerModule = null;


        try {
            // InternalGenerator.g:1657:56: (iv_ruleContainerModule= ruleContainerModule EOF )
            // InternalGenerator.g:1658:2: iv_ruleContainerModule= ruleContainerModule EOF
            {
             newCompositeNode(grammarAccess.getContainerModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerModule=ruleContainerModule();

            state._fsp--;

             current =iv_ruleContainerModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerModule"


    // $ANTLR start "ruleContainerModule"
    // InternalGenerator.g:1664:1: ruleContainerModule returns [EObject current=null] : (otherlv_0= 'ContainerModule' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'parent' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON otherlv_7= 'imports' this_COLON_8= RULE_COLON this_LEFTBRACKET_9= RULE_LEFTBRACKET ( ( (otherlv_10= RULE_ID ) ) (this_COMA_11= RULE_COMA )? )* this_RIGHTBRACKET_12= RULE_RIGHTBRACKET this_SEMICOLON_13= RULE_SEMICOLON otherlv_14= 'exports' this_COLON_15= RULE_COLON this_LEFTBRACKET_16= RULE_LEFTBRACKET ( ( (otherlv_17= RULE_ID ) ) (this_COMA_18= RULE_COMA )? )* this_RIGHTBRACKET_19= RULE_RIGHTBRACKET this_SEMICOLON_20= RULE_SEMICOLON otherlv_21= 'components' this_COLON_22= RULE_COLON this_LEFTBRACKET_23= RULE_LEFTBRACKET ( ( (otherlv_24= RULE_ID ) ) (this_COMA_25= RULE_COMA )? )* this_RIGHTBRACKET_26= RULE_RIGHTBRACKET this_SEMICOLON_27= RULE_SEMICOLON this_RIGTHCURLY_28= RULE_RIGTHCURLY ) ;
    public final EObject ruleContainerModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFTCURLY_2=null;
        Token otherlv_3=null;
        Token this_COLON_4=null;
        Token otherlv_5=null;
        Token this_SEMICOLON_6=null;
        Token otherlv_7=null;
        Token this_COLON_8=null;
        Token this_LEFTBRACKET_9=null;
        Token otherlv_10=null;
        Token this_COMA_11=null;
        Token this_RIGHTBRACKET_12=null;
        Token this_SEMICOLON_13=null;
        Token otherlv_14=null;
        Token this_COLON_15=null;
        Token this_LEFTBRACKET_16=null;
        Token otherlv_17=null;
        Token this_COMA_18=null;
        Token this_RIGHTBRACKET_19=null;
        Token this_SEMICOLON_20=null;
        Token otherlv_21=null;
        Token this_COLON_22=null;
        Token this_LEFTBRACKET_23=null;
        Token otherlv_24=null;
        Token this_COMA_25=null;
        Token this_RIGHTBRACKET_26=null;
        Token this_SEMICOLON_27=null;
        Token this_RIGTHCURLY_28=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:1670:2: ( (otherlv_0= 'ContainerModule' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'parent' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON otherlv_7= 'imports' this_COLON_8= RULE_COLON this_LEFTBRACKET_9= RULE_LEFTBRACKET ( ( (otherlv_10= RULE_ID ) ) (this_COMA_11= RULE_COMA )? )* this_RIGHTBRACKET_12= RULE_RIGHTBRACKET this_SEMICOLON_13= RULE_SEMICOLON otherlv_14= 'exports' this_COLON_15= RULE_COLON this_LEFTBRACKET_16= RULE_LEFTBRACKET ( ( (otherlv_17= RULE_ID ) ) (this_COMA_18= RULE_COMA )? )* this_RIGHTBRACKET_19= RULE_RIGHTBRACKET this_SEMICOLON_20= RULE_SEMICOLON otherlv_21= 'components' this_COLON_22= RULE_COLON this_LEFTBRACKET_23= RULE_LEFTBRACKET ( ( (otherlv_24= RULE_ID ) ) (this_COMA_25= RULE_COMA )? )* this_RIGHTBRACKET_26= RULE_RIGHTBRACKET this_SEMICOLON_27= RULE_SEMICOLON this_RIGTHCURLY_28= RULE_RIGTHCURLY ) )
            // InternalGenerator.g:1671:2: (otherlv_0= 'ContainerModule' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'parent' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON otherlv_7= 'imports' this_COLON_8= RULE_COLON this_LEFTBRACKET_9= RULE_LEFTBRACKET ( ( (otherlv_10= RULE_ID ) ) (this_COMA_11= RULE_COMA )? )* this_RIGHTBRACKET_12= RULE_RIGHTBRACKET this_SEMICOLON_13= RULE_SEMICOLON otherlv_14= 'exports' this_COLON_15= RULE_COLON this_LEFTBRACKET_16= RULE_LEFTBRACKET ( ( (otherlv_17= RULE_ID ) ) (this_COMA_18= RULE_COMA )? )* this_RIGHTBRACKET_19= RULE_RIGHTBRACKET this_SEMICOLON_20= RULE_SEMICOLON otherlv_21= 'components' this_COLON_22= RULE_COLON this_LEFTBRACKET_23= RULE_LEFTBRACKET ( ( (otherlv_24= RULE_ID ) ) (this_COMA_25= RULE_COMA )? )* this_RIGHTBRACKET_26= RULE_RIGHTBRACKET this_SEMICOLON_27= RULE_SEMICOLON this_RIGTHCURLY_28= RULE_RIGTHCURLY )
            {
            // InternalGenerator.g:1671:2: (otherlv_0= 'ContainerModule' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'parent' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON otherlv_7= 'imports' this_COLON_8= RULE_COLON this_LEFTBRACKET_9= RULE_LEFTBRACKET ( ( (otherlv_10= RULE_ID ) ) (this_COMA_11= RULE_COMA )? )* this_RIGHTBRACKET_12= RULE_RIGHTBRACKET this_SEMICOLON_13= RULE_SEMICOLON otherlv_14= 'exports' this_COLON_15= RULE_COLON this_LEFTBRACKET_16= RULE_LEFTBRACKET ( ( (otherlv_17= RULE_ID ) ) (this_COMA_18= RULE_COMA )? )* this_RIGHTBRACKET_19= RULE_RIGHTBRACKET this_SEMICOLON_20= RULE_SEMICOLON otherlv_21= 'components' this_COLON_22= RULE_COLON this_LEFTBRACKET_23= RULE_LEFTBRACKET ( ( (otherlv_24= RULE_ID ) ) (this_COMA_25= RULE_COMA )? )* this_RIGHTBRACKET_26= RULE_RIGHTBRACKET this_SEMICOLON_27= RULE_SEMICOLON this_RIGTHCURLY_28= RULE_RIGTHCURLY )
            // InternalGenerator.g:1672:3: otherlv_0= 'ContainerModule' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'parent' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON otherlv_7= 'imports' this_COLON_8= RULE_COLON this_LEFTBRACKET_9= RULE_LEFTBRACKET ( ( (otherlv_10= RULE_ID ) ) (this_COMA_11= RULE_COMA )? )* this_RIGHTBRACKET_12= RULE_RIGHTBRACKET this_SEMICOLON_13= RULE_SEMICOLON otherlv_14= 'exports' this_COLON_15= RULE_COLON this_LEFTBRACKET_16= RULE_LEFTBRACKET ( ( (otherlv_17= RULE_ID ) ) (this_COMA_18= RULE_COMA )? )* this_RIGHTBRACKET_19= RULE_RIGHTBRACKET this_SEMICOLON_20= RULE_SEMICOLON otherlv_21= 'components' this_COLON_22= RULE_COLON this_LEFTBRACKET_23= RULE_LEFTBRACKET ( ( (otherlv_24= RULE_ID ) ) (this_COMA_25= RULE_COMA )? )* this_RIGHTBRACKET_26= RULE_RIGHTBRACKET this_SEMICOLON_27= RULE_SEMICOLON this_RIGTHCURLY_28= RULE_RIGTHCURLY
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerModuleAccess().getContainerModuleKeyword_0());
            		
            // InternalGenerator.g:1676:3: ( (lv_name_1_0= ruleName ) )
            // InternalGenerator.g:1677:4: (lv_name_1_0= ruleName )
            {
            // InternalGenerator.g:1677:4: (lv_name_1_0= ruleName )
            // InternalGenerator.g:1678:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getContainerModuleAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerModuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uniandes.academia.Generator.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LEFTCURLY_2=(Token)match(input,RULE_LEFTCURLY,FOLLOW_53); 

            			newLeafNode(this_LEFTCURLY_2, grammarAccess.getContainerModuleAccess().getLEFTCURLYTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerModuleAccess().getParentKeyword_3());
            		
            this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_4); 

            			newLeafNode(this_COLON_4, grammarAccess.getContainerModuleAccess().getCOLONTerminalRuleCall_4());
            		
            // InternalGenerator.g:1707:3: ( (otherlv_5= RULE_ID ) )
            // InternalGenerator.g:1708:4: (otherlv_5= RULE_ID )
            {
            // InternalGenerator.g:1708:4: (otherlv_5= RULE_ID )
            // InternalGenerator.g:1709:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerModuleRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_5, grammarAccess.getContainerModuleAccess().getParentModuleCrossReference_5_0());
            				

            }


            }

            this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_43); 

            			newLeafNode(this_SEMICOLON_6, grammarAccess.getContainerModuleAccess().getSEMICOLONTerminalRuleCall_6());
            		
            otherlv_7=(Token)match(input,42,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getContainerModuleAccess().getImportsKeyword_7());
            		
            this_COLON_8=(Token)match(input,RULE_COLON,FOLLOW_18); 

            			newLeafNode(this_COLON_8, grammarAccess.getContainerModuleAccess().getCOLONTerminalRuleCall_8());
            		
            this_LEFTBRACKET_9=(Token)match(input,RULE_LEFTBRACKET,FOLLOW_23); 

            			newLeafNode(this_LEFTBRACKET_9, grammarAccess.getContainerModuleAccess().getLEFTBRACKETTerminalRuleCall_9());
            		
            // InternalGenerator.g:1736:3: ( ( (otherlv_10= RULE_ID ) ) (this_COMA_11= RULE_COMA )? )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGenerator.g:1737:4: ( (otherlv_10= RULE_ID ) ) (this_COMA_11= RULE_COMA )?
            	    {
            	    // InternalGenerator.g:1737:4: ( (otherlv_10= RULE_ID ) )
            	    // InternalGenerator.g:1738:5: (otherlv_10= RULE_ID )
            	    {
            	    // InternalGenerator.g:1738:5: (otherlv_10= RULE_ID )
            	    // InternalGenerator.g:1739:6: otherlv_10= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContainerModuleRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_10, grammarAccess.getContainerModuleAccess().getImportsModuleCrossReference_10_0_0());
            	    					

            	    }


            	    }

            	    // InternalGenerator.g:1750:4: (this_COMA_11= RULE_COMA )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==RULE_COMA) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalGenerator.g:1751:5: this_COMA_11= RULE_COMA
            	            {
            	            this_COMA_11=(Token)match(input,RULE_COMA,FOLLOW_23); 

            	            					newLeafNode(this_COMA_11, grammarAccess.getContainerModuleAccess().getCOMATerminalRuleCall_10_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            this_RIGHTBRACKET_12=(Token)match(input,RULE_RIGHTBRACKET,FOLLOW_21); 

            			newLeafNode(this_RIGHTBRACKET_12, grammarAccess.getContainerModuleAccess().getRIGHTBRACKETTerminalRuleCall_11());
            		
            this_SEMICOLON_13=(Token)match(input,RULE_SEMICOLON,FOLLOW_44); 

            			newLeafNode(this_SEMICOLON_13, grammarAccess.getContainerModuleAccess().getSEMICOLONTerminalRuleCall_12());
            		
            otherlv_14=(Token)match(input,43,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getContainerModuleAccess().getExportsKeyword_13());
            		
            this_COLON_15=(Token)match(input,RULE_COLON,FOLLOW_18); 

            			newLeafNode(this_COLON_15, grammarAccess.getContainerModuleAccess().getCOLONTerminalRuleCall_14());
            		
            this_LEFTBRACKET_16=(Token)match(input,RULE_LEFTBRACKET,FOLLOW_23); 

            			newLeafNode(this_LEFTBRACKET_16, grammarAccess.getContainerModuleAccess().getLEFTBRACKETTerminalRuleCall_15());
            		
            // InternalGenerator.g:1777:3: ( ( (otherlv_17= RULE_ID ) ) (this_COMA_18= RULE_COMA )? )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGenerator.g:1778:4: ( (otherlv_17= RULE_ID ) ) (this_COMA_18= RULE_COMA )?
            	    {
            	    // InternalGenerator.g:1778:4: ( (otherlv_17= RULE_ID ) )
            	    // InternalGenerator.g:1779:5: (otherlv_17= RULE_ID )
            	    {
            	    // InternalGenerator.g:1779:5: (otherlv_17= RULE_ID )
            	    // InternalGenerator.g:1780:6: otherlv_17= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContainerModuleRule());
            	    						}
            	    					
            	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_17, grammarAccess.getContainerModuleAccess().getExportsComponentCrossReference_16_0_0());
            	    					

            	    }


            	    }

            	    // InternalGenerator.g:1791:4: (this_COMA_18= RULE_COMA )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==RULE_COMA) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalGenerator.g:1792:5: this_COMA_18= RULE_COMA
            	            {
            	            this_COMA_18=(Token)match(input,RULE_COMA,FOLLOW_23); 

            	            					newLeafNode(this_COMA_18, grammarAccess.getContainerModuleAccess().getCOMATerminalRuleCall_16_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            this_RIGHTBRACKET_19=(Token)match(input,RULE_RIGHTBRACKET,FOLLOW_21); 

            			newLeafNode(this_RIGHTBRACKET_19, grammarAccess.getContainerModuleAccess().getRIGHTBRACKETTerminalRuleCall_17());
            		
            this_SEMICOLON_20=(Token)match(input,RULE_SEMICOLON,FOLLOW_52); 

            			newLeafNode(this_SEMICOLON_20, grammarAccess.getContainerModuleAccess().getSEMICOLONTerminalRuleCall_18());
            		
            otherlv_21=(Token)match(input,48,FOLLOW_11); 

            			newLeafNode(otherlv_21, grammarAccess.getContainerModuleAccess().getComponentsKeyword_19());
            		
            this_COLON_22=(Token)match(input,RULE_COLON,FOLLOW_18); 

            			newLeafNode(this_COLON_22, grammarAccess.getContainerModuleAccess().getCOLONTerminalRuleCall_20());
            		
            this_LEFTBRACKET_23=(Token)match(input,RULE_LEFTBRACKET,FOLLOW_23); 

            			newLeafNode(this_LEFTBRACKET_23, grammarAccess.getContainerModuleAccess().getLEFTBRACKETTerminalRuleCall_21());
            		
            // InternalGenerator.g:1818:3: ( ( (otherlv_24= RULE_ID ) ) (this_COMA_25= RULE_COMA )? )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalGenerator.g:1819:4: ( (otherlv_24= RULE_ID ) ) (this_COMA_25= RULE_COMA )?
            	    {
            	    // InternalGenerator.g:1819:4: ( (otherlv_24= RULE_ID ) )
            	    // InternalGenerator.g:1820:5: (otherlv_24= RULE_ID )
            	    {
            	    // InternalGenerator.g:1820:5: (otherlv_24= RULE_ID )
            	    // InternalGenerator.g:1821:6: otherlv_24= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContainerModuleRule());
            	    						}
            	    					
            	    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    						newLeafNode(otherlv_24, grammarAccess.getContainerModuleAccess().getComponentsComponentCrossReference_22_0_0());
            	    					

            	    }


            	    }

            	    // InternalGenerator.g:1832:4: (this_COMA_25= RULE_COMA )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==RULE_COMA) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalGenerator.g:1833:5: this_COMA_25= RULE_COMA
            	            {
            	            this_COMA_25=(Token)match(input,RULE_COMA,FOLLOW_23); 

            	            					newLeafNode(this_COMA_25, grammarAccess.getContainerModuleAccess().getCOMATerminalRuleCall_22_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            this_RIGHTBRACKET_26=(Token)match(input,RULE_RIGHTBRACKET,FOLLOW_21); 

            			newLeafNode(this_RIGHTBRACKET_26, grammarAccess.getContainerModuleAccess().getRIGHTBRACKETTerminalRuleCall_23());
            		
            this_SEMICOLON_27=(Token)match(input,RULE_SEMICOLON,FOLLOW_27); 

            			newLeafNode(this_SEMICOLON_27, grammarAccess.getContainerModuleAccess().getSEMICOLONTerminalRuleCall_24());
            		
            this_RIGTHCURLY_28=(Token)match(input,RULE_RIGTHCURLY,FOLLOW_2); 

            			newLeafNode(this_RIGTHCURLY_28, grammarAccess.getContainerModuleAccess().getRIGTHCURLYTerminalRuleCall_25());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerModule"


    // $ANTLR start "entryRuleComponent"
    // InternalGenerator.g:1855:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalGenerator.g:1855:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalGenerator.g:1856:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalGenerator.g:1862:1: ruleComponent returns [EObject current=null] : (this_ComponentBasic_0= ruleComponentBasic | this_ComponentContainer_1= ruleComponentContainer ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentBasic_0 = null;

        EObject this_ComponentContainer_1 = null;



        	enterRule();

        try {
            // InternalGenerator.g:1868:2: ( (this_ComponentBasic_0= ruleComponentBasic | this_ComponentContainer_1= ruleComponentContainer ) )
            // InternalGenerator.g:1869:2: (this_ComponentBasic_0= ruleComponentBasic | this_ComponentContainer_1= ruleComponentContainer )
            {
            // InternalGenerator.g:1869:2: (this_ComponentBasic_0= ruleComponentBasic | this_ComponentContainer_1= ruleComponentContainer )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==51) ) {
                alt42=1;
            }
            else if ( (LA42_0==50) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalGenerator.g:1870:3: this_ComponentBasic_0= ruleComponentBasic
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getComponentBasicParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentBasic_0=ruleComponentBasic();

                    state._fsp--;


                    			current = this_ComponentBasic_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGenerator.g:1879:3: this_ComponentContainer_1= ruleComponentContainer
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getComponentContainerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentContainer_1=ruleComponentContainer();

                    state._fsp--;


                    			current = this_ComponentContainer_1;
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleComponentContainer"
    // InternalGenerator.g:1891:1: entryRuleComponentContainer returns [EObject current=null] : iv_ruleComponentContainer= ruleComponentContainer EOF ;
    public final EObject entryRuleComponentContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentContainer = null;


        try {
            // InternalGenerator.g:1891:59: (iv_ruleComponentContainer= ruleComponentContainer EOF )
            // InternalGenerator.g:1892:2: iv_ruleComponentContainer= ruleComponentContainer EOF
            {
             newCompositeNode(grammarAccess.getComponentContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentContainer=ruleComponentContainer();

            state._fsp--;

             current =iv_ruleComponentContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentContainer"


    // $ANTLR start "ruleComponentContainer"
    // InternalGenerator.g:1898:1: ruleComponentContainer returns [EObject current=null] : (otherlv_0= 'ComponentContainer' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY this_RIGTHCURLY_3= RULE_RIGTHCURLY ) ;
    public final EObject ruleComponentContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFTCURLY_2=null;
        Token this_RIGTHCURLY_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:1904:2: ( (otherlv_0= 'ComponentContainer' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY this_RIGTHCURLY_3= RULE_RIGTHCURLY ) )
            // InternalGenerator.g:1905:2: (otherlv_0= 'ComponentContainer' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY this_RIGTHCURLY_3= RULE_RIGTHCURLY )
            {
            // InternalGenerator.g:1905:2: (otherlv_0= 'ComponentContainer' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY this_RIGTHCURLY_3= RULE_RIGTHCURLY )
            // InternalGenerator.g:1906:3: otherlv_0= 'ComponentContainer' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY this_RIGTHCURLY_3= RULE_RIGTHCURLY
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentContainerAccess().getComponentContainerKeyword_0());
            		
            // InternalGenerator.g:1910:3: ( (lv_name_1_0= ruleName ) )
            // InternalGenerator.g:1911:4: (lv_name_1_0= ruleName )
            {
            // InternalGenerator.g:1911:4: (lv_name_1_0= ruleName )
            // InternalGenerator.g:1912:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getComponentContainerAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uniandes.academia.Generator.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LEFTCURLY_2=(Token)match(input,RULE_LEFTCURLY,FOLLOW_27); 

            			newLeafNode(this_LEFTCURLY_2, grammarAccess.getComponentContainerAccess().getLEFTCURLYTerminalRuleCall_2());
            		
            this_RIGTHCURLY_3=(Token)match(input,RULE_RIGTHCURLY,FOLLOW_2); 

            			newLeafNode(this_RIGTHCURLY_3, grammarAccess.getComponentContainerAccess().getRIGTHCURLYTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentContainer"


    // $ANTLR start "entryRuleComponentBasic"
    // InternalGenerator.g:1941:1: entryRuleComponentBasic returns [EObject current=null] : iv_ruleComponentBasic= ruleComponentBasic EOF ;
    public final EObject entryRuleComponentBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentBasic = null;


        try {
            // InternalGenerator.g:1941:55: (iv_ruleComponentBasic= ruleComponentBasic EOF )
            // InternalGenerator.g:1942:2: iv_ruleComponentBasic= ruleComponentBasic EOF
            {
             newCompositeNode(grammarAccess.getComponentBasicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentBasic=ruleComponentBasic();

            state._fsp--;

             current =iv_ruleComponentBasic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentBasic"


    // $ANTLR start "ruleComponentBasic"
    // InternalGenerator.g:1948:1: ruleComponentBasic returns [EObject current=null] : this_Crud_0= ruleCrud ;
    public final EObject ruleComponentBasic() throws RecognitionException {
        EObject current = null;

        EObject this_Crud_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:1954:2: (this_Crud_0= ruleCrud )
            // InternalGenerator.g:1955:2: this_Crud_0= ruleCrud
            {

            		newCompositeNode(grammarAccess.getComponentBasicAccess().getCrudParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Crud_0=ruleCrud();

            state._fsp--;


            		current = this_Crud_0;
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
    // $ANTLR end "ruleComponentBasic"


    // $ANTLR start "entryRuleCrud"
    // InternalGenerator.g:1966:1: entryRuleCrud returns [EObject current=null] : iv_ruleCrud= ruleCrud EOF ;
    public final EObject entryRuleCrud() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrud = null;


        try {
            // InternalGenerator.g:1966:45: (iv_ruleCrud= ruleCrud EOF )
            // InternalGenerator.g:1967:2: iv_ruleCrud= ruleCrud EOF
            {
             newCompositeNode(grammarAccess.getCrudRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrud=ruleCrud();

            state._fsp--;

             current =iv_ruleCrud; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCrud"


    // $ANTLR start "ruleCrud"
    // InternalGenerator.g:1973:1: ruleCrud returns [EObject current=null] : (otherlv_0= 'Crud' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'model' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'showAsGallery' this_COLON_8= RULE_COLON ( (lv_showAsGallery_9_0= RULE_BOOLEAN ) ) this_SEMICOLON_10= RULE_SEMICOLON )? (otherlv_11= 'enableMock' this_COLON_12= RULE_COLON ( (lv_enableMock_13_0= RULE_BOOLEAN ) ) this_SEMICOLON_14= RULE_SEMICOLON )? (otherlv_15= 'createService' this_COLON_16= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_18= RULE_SEMICOLON ) (otherlv_19= 'updateService' this_COLON_20= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_22= RULE_SEMICOLON ) (otherlv_23= 'listService' this_COLON_24= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_26= RULE_SEMICOLON ) (otherlv_27= 'listNumService' this_COLON_28= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_30= RULE_SEMICOLON ) (otherlv_31= 'deleteService' this_COLON_32= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_34= RULE_SEMICOLON ) (otherlv_35= 'getService' this_COLON_36= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_38= RULE_SEMICOLON ) this_RIGTHCURLY_39= RULE_RIGTHCURLY ) ;
    public final EObject ruleCrud() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFTCURLY_2=null;
        Token otherlv_3=null;
        Token this_COLON_4=null;
        Token otherlv_5=null;
        Token this_SEMICOLON_6=null;
        Token otherlv_7=null;
        Token this_COLON_8=null;
        Token lv_showAsGallery_9_0=null;
        Token this_SEMICOLON_10=null;
        Token otherlv_11=null;
        Token this_COLON_12=null;
        Token lv_enableMock_13_0=null;
        Token this_SEMICOLON_14=null;
        Token otherlv_15=null;
        Token this_COLON_16=null;
        Token this_SEMICOLON_18=null;
        Token otherlv_19=null;
        Token this_COLON_20=null;
        Token this_SEMICOLON_22=null;
        Token otherlv_23=null;
        Token this_COLON_24=null;
        Token this_SEMICOLON_26=null;
        Token otherlv_27=null;
        Token this_COLON_28=null;
        Token this_SEMICOLON_30=null;
        Token otherlv_31=null;
        Token this_COLON_32=null;
        Token this_SEMICOLON_34=null;
        Token otherlv_35=null;
        Token this_COLON_36=null;
        Token this_SEMICOLON_38=null;
        Token this_RIGTHCURLY_39=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:1979:2: ( (otherlv_0= 'Crud' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'model' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'showAsGallery' this_COLON_8= RULE_COLON ( (lv_showAsGallery_9_0= RULE_BOOLEAN ) ) this_SEMICOLON_10= RULE_SEMICOLON )? (otherlv_11= 'enableMock' this_COLON_12= RULE_COLON ( (lv_enableMock_13_0= RULE_BOOLEAN ) ) this_SEMICOLON_14= RULE_SEMICOLON )? (otherlv_15= 'createService' this_COLON_16= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_18= RULE_SEMICOLON ) (otherlv_19= 'updateService' this_COLON_20= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_22= RULE_SEMICOLON ) (otherlv_23= 'listService' this_COLON_24= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_26= RULE_SEMICOLON ) (otherlv_27= 'listNumService' this_COLON_28= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_30= RULE_SEMICOLON ) (otherlv_31= 'deleteService' this_COLON_32= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_34= RULE_SEMICOLON ) (otherlv_35= 'getService' this_COLON_36= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_38= RULE_SEMICOLON ) this_RIGTHCURLY_39= RULE_RIGTHCURLY ) )
            // InternalGenerator.g:1980:2: (otherlv_0= 'Crud' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'model' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'showAsGallery' this_COLON_8= RULE_COLON ( (lv_showAsGallery_9_0= RULE_BOOLEAN ) ) this_SEMICOLON_10= RULE_SEMICOLON )? (otherlv_11= 'enableMock' this_COLON_12= RULE_COLON ( (lv_enableMock_13_0= RULE_BOOLEAN ) ) this_SEMICOLON_14= RULE_SEMICOLON )? (otherlv_15= 'createService' this_COLON_16= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_18= RULE_SEMICOLON ) (otherlv_19= 'updateService' this_COLON_20= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_22= RULE_SEMICOLON ) (otherlv_23= 'listService' this_COLON_24= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_26= RULE_SEMICOLON ) (otherlv_27= 'listNumService' this_COLON_28= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_30= RULE_SEMICOLON ) (otherlv_31= 'deleteService' this_COLON_32= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_34= RULE_SEMICOLON ) (otherlv_35= 'getService' this_COLON_36= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_38= RULE_SEMICOLON ) this_RIGTHCURLY_39= RULE_RIGTHCURLY )
            {
            // InternalGenerator.g:1980:2: (otherlv_0= 'Crud' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'model' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'showAsGallery' this_COLON_8= RULE_COLON ( (lv_showAsGallery_9_0= RULE_BOOLEAN ) ) this_SEMICOLON_10= RULE_SEMICOLON )? (otherlv_11= 'enableMock' this_COLON_12= RULE_COLON ( (lv_enableMock_13_0= RULE_BOOLEAN ) ) this_SEMICOLON_14= RULE_SEMICOLON )? (otherlv_15= 'createService' this_COLON_16= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_18= RULE_SEMICOLON ) (otherlv_19= 'updateService' this_COLON_20= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_22= RULE_SEMICOLON ) (otherlv_23= 'listService' this_COLON_24= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_26= RULE_SEMICOLON ) (otherlv_27= 'listNumService' this_COLON_28= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_30= RULE_SEMICOLON ) (otherlv_31= 'deleteService' this_COLON_32= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_34= RULE_SEMICOLON ) (otherlv_35= 'getService' this_COLON_36= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_38= RULE_SEMICOLON ) this_RIGTHCURLY_39= RULE_RIGTHCURLY )
            // InternalGenerator.g:1981:3: otherlv_0= 'Crud' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'model' this_COLON_4= RULE_COLON ( (otherlv_5= RULE_ID ) ) this_SEMICOLON_6= RULE_SEMICOLON (otherlv_7= 'showAsGallery' this_COLON_8= RULE_COLON ( (lv_showAsGallery_9_0= RULE_BOOLEAN ) ) this_SEMICOLON_10= RULE_SEMICOLON )? (otherlv_11= 'enableMock' this_COLON_12= RULE_COLON ( (lv_enableMock_13_0= RULE_BOOLEAN ) ) this_SEMICOLON_14= RULE_SEMICOLON )? (otherlv_15= 'createService' this_COLON_16= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_18= RULE_SEMICOLON ) (otherlv_19= 'updateService' this_COLON_20= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_22= RULE_SEMICOLON ) (otherlv_23= 'listService' this_COLON_24= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_26= RULE_SEMICOLON ) (otherlv_27= 'listNumService' this_COLON_28= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_30= RULE_SEMICOLON ) (otherlv_31= 'deleteService' this_COLON_32= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_34= RULE_SEMICOLON ) (otherlv_35= 'getService' this_COLON_36= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_38= RULE_SEMICOLON ) this_RIGTHCURLY_39= RULE_RIGTHCURLY
            {
            otherlv_0=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCrudAccess().getCrudKeyword_0());
            		
            // InternalGenerator.g:1985:3: ( (lv_name_1_0= ruleName ) )
            // InternalGenerator.g:1986:4: (lv_name_1_0= ruleName )
            {
            // InternalGenerator.g:1986:4: (lv_name_1_0= ruleName )
            // InternalGenerator.g:1987:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getCrudAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCrudRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uniandes.academia.Generator.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LEFTCURLY_2=(Token)match(input,RULE_LEFTCURLY,FOLLOW_54); 

            			newLeafNode(this_LEFTCURLY_2, grammarAccess.getCrudAccess().getLEFTCURLYTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,52,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getCrudAccess().getModelKeyword_3());
            		
            this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_4); 

            			newLeafNode(this_COLON_4, grammarAccess.getCrudAccess().getCOLONTerminalRuleCall_4());
            		
            // InternalGenerator.g:2016:3: ( (otherlv_5= RULE_ID ) )
            // InternalGenerator.g:2017:4: (otherlv_5= RULE_ID )
            {
            // InternalGenerator.g:2017:4: (otherlv_5= RULE_ID )
            // InternalGenerator.g:2018:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCrudRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_5, grammarAccess.getCrudAccess().getModelDataModelCrossReference_5_0());
            				

            }


            }

            this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_55); 

            			newLeafNode(this_SEMICOLON_6, grammarAccess.getCrudAccess().getSEMICOLONTerminalRuleCall_6());
            		
            // InternalGenerator.g:2033:3: (otherlv_7= 'showAsGallery' this_COLON_8= RULE_COLON ( (lv_showAsGallery_9_0= RULE_BOOLEAN ) ) this_SEMICOLON_10= RULE_SEMICOLON )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGenerator.g:2034:4: otherlv_7= 'showAsGallery' this_COLON_8= RULE_COLON ( (lv_showAsGallery_9_0= RULE_BOOLEAN ) ) this_SEMICOLON_10= RULE_SEMICOLON
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getCrudAccess().getShowAsGalleryKeyword_7_0());
                    			
                    this_COLON_8=(Token)match(input,RULE_COLON,FOLLOW_35); 

                    				newLeafNode(this_COLON_8, grammarAccess.getCrudAccess().getCOLONTerminalRuleCall_7_1());
                    			
                    // InternalGenerator.g:2042:4: ( (lv_showAsGallery_9_0= RULE_BOOLEAN ) )
                    // InternalGenerator.g:2043:5: (lv_showAsGallery_9_0= RULE_BOOLEAN )
                    {
                    // InternalGenerator.g:2043:5: (lv_showAsGallery_9_0= RULE_BOOLEAN )
                    // InternalGenerator.g:2044:6: lv_showAsGallery_9_0= RULE_BOOLEAN
                    {
                    lv_showAsGallery_9_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_21); 

                    						newLeafNode(lv_showAsGallery_9_0, grammarAccess.getCrudAccess().getShowAsGalleryBOOLEANTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCrudRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"showAsGallery",
                    							lv_showAsGallery_9_0,
                    							"uniandes.academia.Generator.BOOLEAN");
                    					

                    }


                    }

                    this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_56); 

                    				newLeafNode(this_SEMICOLON_10, grammarAccess.getCrudAccess().getSEMICOLONTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            // InternalGenerator.g:2065:3: (otherlv_11= 'enableMock' this_COLON_12= RULE_COLON ( (lv_enableMock_13_0= RULE_BOOLEAN ) ) this_SEMICOLON_14= RULE_SEMICOLON )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==54) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGenerator.g:2066:4: otherlv_11= 'enableMock' this_COLON_12= RULE_COLON ( (lv_enableMock_13_0= RULE_BOOLEAN ) ) this_SEMICOLON_14= RULE_SEMICOLON
                    {
                    otherlv_11=(Token)match(input,54,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getCrudAccess().getEnableMockKeyword_8_0());
                    			
                    this_COLON_12=(Token)match(input,RULE_COLON,FOLLOW_35); 

                    				newLeafNode(this_COLON_12, grammarAccess.getCrudAccess().getCOLONTerminalRuleCall_8_1());
                    			
                    // InternalGenerator.g:2074:4: ( (lv_enableMock_13_0= RULE_BOOLEAN ) )
                    // InternalGenerator.g:2075:5: (lv_enableMock_13_0= RULE_BOOLEAN )
                    {
                    // InternalGenerator.g:2075:5: (lv_enableMock_13_0= RULE_BOOLEAN )
                    // InternalGenerator.g:2076:6: lv_enableMock_13_0= RULE_BOOLEAN
                    {
                    lv_enableMock_13_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_21); 

                    						newLeafNode(lv_enableMock_13_0, grammarAccess.getCrudAccess().getEnableMockBOOLEANTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCrudRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"enableMock",
                    							lv_enableMock_13_0,
                    							"uniandes.academia.Generator.BOOLEAN");
                    					

                    }


                    }

                    this_SEMICOLON_14=(Token)match(input,RULE_SEMICOLON,FOLLOW_57); 

                    				newLeafNode(this_SEMICOLON_14, grammarAccess.getCrudAccess().getSEMICOLONTerminalRuleCall_8_3());
                    			

                    }
                    break;

            }

            // InternalGenerator.g:2097:3: (otherlv_15= 'createService' this_COLON_16= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_18= RULE_SEMICOLON )
            // InternalGenerator.g:2098:4: otherlv_15= 'createService' this_COLON_16= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_18= RULE_SEMICOLON
            {
            otherlv_15=(Token)match(input,55,FOLLOW_11); 

            				newLeafNode(otherlv_15, grammarAccess.getCrudAccess().getCreateServiceKeyword_9_0());
            			
            this_COLON_16=(Token)match(input,RULE_COLON,FOLLOW_4); 

            				newLeafNode(this_COLON_16, grammarAccess.getCrudAccess().getCOLONTerminalRuleCall_9_1());
            			
            // InternalGenerator.g:2106:4: ( ( ruleQualifiedName ) )
            // InternalGenerator.g:2107:5: ( ruleQualifiedName )
            {
            // InternalGenerator.g:2107:5: ( ruleQualifiedName )
            // InternalGenerator.g:2108:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCrudRule());
            						}
            					

            						newCompositeNode(grammarAccess.getCrudAccess().getCreateServiceCrossReference_9_2_0());
            					
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_SEMICOLON_18=(Token)match(input,RULE_SEMICOLON,FOLLOW_58); 

            				newLeafNode(this_SEMICOLON_18, grammarAccess.getCrudAccess().getSEMICOLONTerminalRuleCall_9_3());
            			

            }

            // InternalGenerator.g:2127:3: (otherlv_19= 'updateService' this_COLON_20= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_22= RULE_SEMICOLON )
            // InternalGenerator.g:2128:4: otherlv_19= 'updateService' this_COLON_20= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_22= RULE_SEMICOLON
            {
            otherlv_19=(Token)match(input,56,FOLLOW_11); 

            				newLeafNode(otherlv_19, grammarAccess.getCrudAccess().getUpdateServiceKeyword_10_0());
            			
            this_COLON_20=(Token)match(input,RULE_COLON,FOLLOW_4); 

            				newLeafNode(this_COLON_20, grammarAccess.getCrudAccess().getCOLONTerminalRuleCall_10_1());
            			
            // InternalGenerator.g:2136:4: ( ( ruleQualifiedName ) )
            // InternalGenerator.g:2137:5: ( ruleQualifiedName )
            {
            // InternalGenerator.g:2137:5: ( ruleQualifiedName )
            // InternalGenerator.g:2138:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCrudRule());
            						}
            					

            						newCompositeNode(grammarAccess.getCrudAccess().getUpdateServiceCrossReference_10_2_0());
            					
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_SEMICOLON_22=(Token)match(input,RULE_SEMICOLON,FOLLOW_59); 

            				newLeafNode(this_SEMICOLON_22, grammarAccess.getCrudAccess().getSEMICOLONTerminalRuleCall_10_3());
            			

            }

            // InternalGenerator.g:2157:3: (otherlv_23= 'listService' this_COLON_24= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_26= RULE_SEMICOLON )
            // InternalGenerator.g:2158:4: otherlv_23= 'listService' this_COLON_24= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_26= RULE_SEMICOLON
            {
            otherlv_23=(Token)match(input,57,FOLLOW_11); 

            				newLeafNode(otherlv_23, grammarAccess.getCrudAccess().getListServiceKeyword_11_0());
            			
            this_COLON_24=(Token)match(input,RULE_COLON,FOLLOW_4); 

            				newLeafNode(this_COLON_24, grammarAccess.getCrudAccess().getCOLONTerminalRuleCall_11_1());
            			
            // InternalGenerator.g:2166:4: ( ( ruleQualifiedName ) )
            // InternalGenerator.g:2167:5: ( ruleQualifiedName )
            {
            // InternalGenerator.g:2167:5: ( ruleQualifiedName )
            // InternalGenerator.g:2168:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCrudRule());
            						}
            					

            						newCompositeNode(grammarAccess.getCrudAccess().getListServiceCrossReference_11_2_0());
            					
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_SEMICOLON_26=(Token)match(input,RULE_SEMICOLON,FOLLOW_60); 

            				newLeafNode(this_SEMICOLON_26, grammarAccess.getCrudAccess().getSEMICOLONTerminalRuleCall_11_3());
            			

            }

            // InternalGenerator.g:2187:3: (otherlv_27= 'listNumService' this_COLON_28= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_30= RULE_SEMICOLON )
            // InternalGenerator.g:2188:4: otherlv_27= 'listNumService' this_COLON_28= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_30= RULE_SEMICOLON
            {
            otherlv_27=(Token)match(input,58,FOLLOW_11); 

            				newLeafNode(otherlv_27, grammarAccess.getCrudAccess().getListNumServiceKeyword_12_0());
            			
            this_COLON_28=(Token)match(input,RULE_COLON,FOLLOW_4); 

            				newLeafNode(this_COLON_28, grammarAccess.getCrudAccess().getCOLONTerminalRuleCall_12_1());
            			
            // InternalGenerator.g:2196:4: ( ( ruleQualifiedName ) )
            // InternalGenerator.g:2197:5: ( ruleQualifiedName )
            {
            // InternalGenerator.g:2197:5: ( ruleQualifiedName )
            // InternalGenerator.g:2198:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCrudRule());
            						}
            					

            						newCompositeNode(grammarAccess.getCrudAccess().getListNumServiceCrossReference_12_2_0());
            					
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_SEMICOLON_30=(Token)match(input,RULE_SEMICOLON,FOLLOW_61); 

            				newLeafNode(this_SEMICOLON_30, grammarAccess.getCrudAccess().getSEMICOLONTerminalRuleCall_12_3());
            			

            }

            // InternalGenerator.g:2217:3: (otherlv_31= 'deleteService' this_COLON_32= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_34= RULE_SEMICOLON )
            // InternalGenerator.g:2218:4: otherlv_31= 'deleteService' this_COLON_32= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_34= RULE_SEMICOLON
            {
            otherlv_31=(Token)match(input,59,FOLLOW_11); 

            				newLeafNode(otherlv_31, grammarAccess.getCrudAccess().getDeleteServiceKeyword_13_0());
            			
            this_COLON_32=(Token)match(input,RULE_COLON,FOLLOW_4); 

            				newLeafNode(this_COLON_32, grammarAccess.getCrudAccess().getCOLONTerminalRuleCall_13_1());
            			
            // InternalGenerator.g:2226:4: ( ( ruleQualifiedName ) )
            // InternalGenerator.g:2227:5: ( ruleQualifiedName )
            {
            // InternalGenerator.g:2227:5: ( ruleQualifiedName )
            // InternalGenerator.g:2228:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCrudRule());
            						}
            					

            						newCompositeNode(grammarAccess.getCrudAccess().getDeleteItemServiceCrossReference_13_2_0());
            					
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_SEMICOLON_34=(Token)match(input,RULE_SEMICOLON,FOLLOW_62); 

            				newLeafNode(this_SEMICOLON_34, grammarAccess.getCrudAccess().getSEMICOLONTerminalRuleCall_13_3());
            			

            }

            // InternalGenerator.g:2247:3: (otherlv_35= 'getService' this_COLON_36= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_38= RULE_SEMICOLON )
            // InternalGenerator.g:2248:4: otherlv_35= 'getService' this_COLON_36= RULE_COLON ( ( ruleQualifiedName ) ) this_SEMICOLON_38= RULE_SEMICOLON
            {
            otherlv_35=(Token)match(input,60,FOLLOW_11); 

            				newLeafNode(otherlv_35, grammarAccess.getCrudAccess().getGetServiceKeyword_14_0());
            			
            this_COLON_36=(Token)match(input,RULE_COLON,FOLLOW_4); 

            				newLeafNode(this_COLON_36, grammarAccess.getCrudAccess().getCOLONTerminalRuleCall_14_1());
            			
            // InternalGenerator.g:2256:4: ( ( ruleQualifiedName ) )
            // InternalGenerator.g:2257:5: ( ruleQualifiedName )
            {
            // InternalGenerator.g:2257:5: ( ruleQualifiedName )
            // InternalGenerator.g:2258:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getCrudRule());
            						}
            					

            						newCompositeNode(grammarAccess.getCrudAccess().getGetServiceCrossReference_14_2_0());
            					
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_SEMICOLON_38=(Token)match(input,RULE_SEMICOLON,FOLLOW_27); 

            				newLeafNode(this_SEMICOLON_38, grammarAccess.getCrudAccess().getSEMICOLONTerminalRuleCall_14_3());
            			

            }

            this_RIGTHCURLY_39=(Token)match(input,RULE_RIGTHCURLY,FOLLOW_2); 

            			newLeafNode(this_RIGTHCURLY_39, grammarAccess.getCrudAccess().getRIGTHCURLYTerminalRuleCall_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrud"


    // $ANTLR start "entryRuleService"
    // InternalGenerator.g:2285:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalGenerator.g:2285:48: (iv_ruleService= ruleService EOF )
            // InternalGenerator.g:2286:2: iv_ruleService= ruleService EOF
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
    // InternalGenerator.g:2292:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'url' this_COLON_4= RULE_COLON ( (lv_url_5_0= ruleEString ) ) this_COMA_6= RULE_COMA otherlv_7= 'type' this_COLON_8= RULE_COLON ( (lv_type_9_0= ruleEnumMethodType ) ) (this_COMA_10= RULE_COMA )? (otherlv_11= 'collectionName' this_COLON_12= RULE_COLON ( (lv_collectionName_13_0= ruleEString ) ) (this_COMA_14= RULE_COMA )? )? this_RIGTHCURLY_15= RULE_RIGTHCURLY ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFTCURLY_2=null;
        Token otherlv_3=null;
        Token this_COLON_4=null;
        Token this_COMA_6=null;
        Token otherlv_7=null;
        Token this_COLON_8=null;
        Token this_COMA_10=null;
        Token otherlv_11=null;
        Token this_COLON_12=null;
        Token this_COMA_14=null;
        Token this_RIGTHCURLY_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_url_5_0 = null;

        Enumerator lv_type_9_0 = null;

        AntlrDatatypeRuleToken lv_collectionName_13_0 = null;



        	enterRule();

        try {
            // InternalGenerator.g:2298:2: ( (otherlv_0= 'Service' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'url' this_COLON_4= RULE_COLON ( (lv_url_5_0= ruleEString ) ) this_COMA_6= RULE_COMA otherlv_7= 'type' this_COLON_8= RULE_COLON ( (lv_type_9_0= ruleEnumMethodType ) ) (this_COMA_10= RULE_COMA )? (otherlv_11= 'collectionName' this_COLON_12= RULE_COLON ( (lv_collectionName_13_0= ruleEString ) ) (this_COMA_14= RULE_COMA )? )? this_RIGTHCURLY_15= RULE_RIGTHCURLY ) )
            // InternalGenerator.g:2299:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'url' this_COLON_4= RULE_COLON ( (lv_url_5_0= ruleEString ) ) this_COMA_6= RULE_COMA otherlv_7= 'type' this_COLON_8= RULE_COLON ( (lv_type_9_0= ruleEnumMethodType ) ) (this_COMA_10= RULE_COMA )? (otherlv_11= 'collectionName' this_COLON_12= RULE_COLON ( (lv_collectionName_13_0= ruleEString ) ) (this_COMA_14= RULE_COMA )? )? this_RIGTHCURLY_15= RULE_RIGTHCURLY )
            {
            // InternalGenerator.g:2299:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'url' this_COLON_4= RULE_COLON ( (lv_url_5_0= ruleEString ) ) this_COMA_6= RULE_COMA otherlv_7= 'type' this_COLON_8= RULE_COLON ( (lv_type_9_0= ruleEnumMethodType ) ) (this_COMA_10= RULE_COMA )? (otherlv_11= 'collectionName' this_COLON_12= RULE_COLON ( (lv_collectionName_13_0= ruleEString ) ) (this_COMA_14= RULE_COMA )? )? this_RIGTHCURLY_15= RULE_RIGTHCURLY )
            // InternalGenerator.g:2300:3: otherlv_0= 'Service' ( (lv_name_1_0= ruleName ) ) this_LEFTCURLY_2= RULE_LEFTCURLY otherlv_3= 'url' this_COLON_4= RULE_COLON ( (lv_url_5_0= ruleEString ) ) this_COMA_6= RULE_COMA otherlv_7= 'type' this_COLON_8= RULE_COLON ( (lv_type_9_0= ruleEnumMethodType ) ) (this_COMA_10= RULE_COMA )? (otherlv_11= 'collectionName' this_COLON_12= RULE_COLON ( (lv_collectionName_13_0= ruleEString ) ) (this_COMA_14= RULE_COMA )? )? this_RIGTHCURLY_15= RULE_RIGTHCURLY
            {
            otherlv_0=(Token)match(input,61,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalGenerator.g:2304:3: ( (lv_name_1_0= ruleName ) )
            // InternalGenerator.g:2305:4: (lv_name_1_0= ruleName )
            {
            // InternalGenerator.g:2305:4: (lv_name_1_0= ruleName )
            // InternalGenerator.g:2306:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uniandes.academia.Generator.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_LEFTCURLY_2=(Token)match(input,RULE_LEFTCURLY,FOLLOW_63); 

            			newLeafNode(this_LEFTCURLY_2, grammarAccess.getServiceAccess().getLEFTCURLYTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getUrlKeyword_3());
            		
            this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_12); 

            			newLeafNode(this_COLON_4, grammarAccess.getServiceAccess().getCOLONTerminalRuleCall_4());
            		
            // InternalGenerator.g:2335:3: ( (lv_url_5_0= ruleEString ) )
            // InternalGenerator.g:2336:4: (lv_url_5_0= ruleEString )
            {
            // InternalGenerator.g:2336:4: (lv_url_5_0= ruleEString )
            // InternalGenerator.g:2337:5: lv_url_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getUrlEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
            lv_url_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_5_0,
            						"uniandes.academia.Generator.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMA_6=(Token)match(input,RULE_COMA,FOLLOW_30); 

            			newLeafNode(this_COMA_6, grammarAccess.getServiceAccess().getCOMATerminalRuleCall_6());
            		
            otherlv_7=(Token)match(input,35,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getTypeKeyword_7());
            		
            this_COLON_8=(Token)match(input,RULE_COLON,FOLLOW_64); 

            			newLeafNode(this_COLON_8, grammarAccess.getServiceAccess().getCOLONTerminalRuleCall_8());
            		
            // InternalGenerator.g:2366:3: ( (lv_type_9_0= ruleEnumMethodType ) )
            // InternalGenerator.g:2367:4: (lv_type_9_0= ruleEnumMethodType )
            {
            // InternalGenerator.g:2367:4: (lv_type_9_0= ruleEnumMethodType )
            // InternalGenerator.g:2368:5: lv_type_9_0= ruleEnumMethodType
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getTypeEnumMethodTypeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_65);
            lv_type_9_0=ruleEnumMethodType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_9_0,
            						"uniandes.academia.Generator.EnumMethodType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGenerator.g:2385:3: (this_COMA_10= RULE_COMA )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_COMA) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGenerator.g:2386:4: this_COMA_10= RULE_COMA
                    {
                    this_COMA_10=(Token)match(input,RULE_COMA,FOLLOW_66); 

                    				newLeafNode(this_COMA_10, grammarAccess.getServiceAccess().getCOMATerminalRuleCall_10());
                    			

                    }
                    break;

            }

            // InternalGenerator.g:2391:3: (otherlv_11= 'collectionName' this_COLON_12= RULE_COLON ( (lv_collectionName_13_0= ruleEString ) ) (this_COMA_14= RULE_COMA )? )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==63) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalGenerator.g:2392:4: otherlv_11= 'collectionName' this_COLON_12= RULE_COLON ( (lv_collectionName_13_0= ruleEString ) ) (this_COMA_14= RULE_COMA )?
                    {
                    otherlv_11=(Token)match(input,63,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getCollectionNameKeyword_11_0());
                    			
                    this_COLON_12=(Token)match(input,RULE_COLON,FOLLOW_12); 

                    				newLeafNode(this_COLON_12, grammarAccess.getServiceAccess().getCOLONTerminalRuleCall_11_1());
                    			
                    // InternalGenerator.g:2400:4: ( (lv_collectionName_13_0= ruleEString ) )
                    // InternalGenerator.g:2401:5: (lv_collectionName_13_0= ruleEString )
                    {
                    // InternalGenerator.g:2401:5: (lv_collectionName_13_0= ruleEString )
                    // InternalGenerator.g:2402:6: lv_collectionName_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServiceAccess().getCollectionNameEStringParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_collectionName_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRule());
                    						}
                    						set(
                    							current,
                    							"collectionName",
                    							lv_collectionName_13_0,
                    							"uniandes.academia.Generator.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenerator.g:2419:4: (this_COMA_14= RULE_COMA )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_COMA) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalGenerator.g:2420:5: this_COMA_14= RULE_COMA
                            {
                            this_COMA_14=(Token)match(input,RULE_COMA,FOLLOW_27); 

                            					newLeafNode(this_COMA_14, grammarAccess.getServiceAccess().getCOMATerminalRuleCall_11_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            this_RIGTHCURLY_15=(Token)match(input,RULE_RIGTHCURLY,FOLLOW_2); 

            			newLeafNode(this_RIGTHCURLY_15, grammarAccess.getServiceAccess().getRIGTHCURLYTerminalRuleCall_12());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleName"
    // InternalGenerator.g:2434:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalGenerator.g:2434:44: (iv_ruleName= ruleName EOF )
            // InternalGenerator.g:2435:2: iv_ruleName= ruleName EOF
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
    // InternalGenerator.g:2441:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalGenerator.g:2447:2: (this_ID_0= RULE_ID )
            // InternalGenerator.g:2448:2: this_ID_0= RULE_ID
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


    // $ANTLR start "entryRuleEString"
    // InternalGenerator.g:2458:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGenerator.g:2458:47: (iv_ruleEString= ruleEString EOF )
            // InternalGenerator.g:2459:2: iv_ruleEString= ruleEString EOF
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
    // InternalGenerator.g:2465:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGenerator.g:2471:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGenerator.g:2472:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGenerator.g:2472:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalGenerator.g:2473:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGenerator.g:2481:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleEnumType"
    // InternalGenerator.g:2492:1: ruleEnumType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Any' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'SearchComboBox' ) ) ;
    public final Enumerator ruleEnumType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalGenerator.g:2498:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Any' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'SearchComboBox' ) ) )
            // InternalGenerator.g:2499:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Any' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'SearchComboBox' ) )
            {
            // InternalGenerator.g:2499:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Any' ) | (enumLiteral_4= 'Date' ) | (enumLiteral_5= 'SearchComboBox' ) )
            int alt49=6;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt49=1;
                }
                break;
            case 65:
                {
                alt49=2;
                }
                break;
            case 66:
                {
                alt49=3;
                }
                break;
            case 67:
                {
                alt49=4;
                }
                break;
            case 68:
                {
                alt49=5;
                }
                break;
            case 69:
                {
                alt49=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalGenerator.g:2500:3: (enumLiteral_0= 'String' )
                    {
                    // InternalGenerator.g:2500:3: (enumLiteral_0= 'String' )
                    // InternalGenerator.g:2501:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenerator.g:2508:3: (enumLiteral_1= 'Number' )
                    {
                    // InternalGenerator.g:2508:3: (enumLiteral_1= 'Number' )
                    // InternalGenerator.g:2509:4: enumLiteral_1= 'Number'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumTypeAccess().getNUMBEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGenerator.g:2516:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalGenerator.g:2516:3: (enumLiteral_2= 'Boolean' )
                    // InternalGenerator.g:2517:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEnumTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGenerator.g:2524:3: (enumLiteral_3= 'Any' )
                    {
                    // InternalGenerator.g:2524:3: (enumLiteral_3= 'Any' )
                    // InternalGenerator.g:2525:4: enumLiteral_3= 'Any'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getANYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEnumTypeAccess().getANYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGenerator.g:2532:3: (enumLiteral_4= 'Date' )
                    {
                    // InternalGenerator.g:2532:3: (enumLiteral_4= 'Date' )
                    // InternalGenerator.g:2533:4: enumLiteral_4= 'Date'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getDATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEnumTypeAccess().getDATEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGenerator.g:2540:3: (enumLiteral_5= 'SearchComboBox' )
                    {
                    // InternalGenerator.g:2540:3: (enumLiteral_5= 'SearchComboBox' )
                    // InternalGenerator.g:2541:4: enumLiteral_5= 'SearchComboBox'
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getSearchComboBoxEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEnumTypeAccess().getSearchComboBoxEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "ruleEnumMethodType"
    // InternalGenerator.g:2551:1: ruleEnumMethodType returns [Enumerator current=null] : ( (enumLiteral_0= 'POST' ) | (enumLiteral_1= 'GET' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) | (enumLiteral_4= 'PATCH' ) | (enumLiteral_5= 'PUT' ) ) ;
    public final Enumerator ruleEnumMethodType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalGenerator.g:2557:2: ( ( (enumLiteral_0= 'POST' ) | (enumLiteral_1= 'GET' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) | (enumLiteral_4= 'PATCH' ) | (enumLiteral_5= 'PUT' ) ) )
            // InternalGenerator.g:2558:2: ( (enumLiteral_0= 'POST' ) | (enumLiteral_1= 'GET' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) | (enumLiteral_4= 'PATCH' ) | (enumLiteral_5= 'PUT' ) )
            {
            // InternalGenerator.g:2558:2: ( (enumLiteral_0= 'POST' ) | (enumLiteral_1= 'GET' ) | (enumLiteral_2= 'UPDATE' ) | (enumLiteral_3= 'DELETE' ) | (enumLiteral_4= 'PATCH' ) | (enumLiteral_5= 'PUT' ) )
            int alt50=6;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt50=1;
                }
                break;
            case 71:
                {
                alt50=2;
                }
                break;
            case 72:
                {
                alt50=3;
                }
                break;
            case 73:
                {
                alt50=4;
                }
                break;
            case 74:
                {
                alt50=5;
                }
                break;
            case 75:
                {
                alt50=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalGenerator.g:2559:3: (enumLiteral_0= 'POST' )
                    {
                    // InternalGenerator.g:2559:3: (enumLiteral_0= 'POST' )
                    // InternalGenerator.g:2560:4: enumLiteral_0= 'POST'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getEnumMethodTypeAccess().getPOSTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumMethodTypeAccess().getPOSTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenerator.g:2567:3: (enumLiteral_1= 'GET' )
                    {
                    // InternalGenerator.g:2567:3: (enumLiteral_1= 'GET' )
                    // InternalGenerator.g:2568:4: enumLiteral_1= 'GET'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getEnumMethodTypeAccess().getGETEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumMethodTypeAccess().getGETEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGenerator.g:2575:3: (enumLiteral_2= 'UPDATE' )
                    {
                    // InternalGenerator.g:2575:3: (enumLiteral_2= 'UPDATE' )
                    // InternalGenerator.g:2576:4: enumLiteral_2= 'UPDATE'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getEnumMethodTypeAccess().getUPDATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEnumMethodTypeAccess().getUPDATEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGenerator.g:2583:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalGenerator.g:2583:3: (enumLiteral_3= 'DELETE' )
                    // InternalGenerator.g:2584:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getEnumMethodTypeAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEnumMethodTypeAccess().getDELETEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGenerator.g:2591:3: (enumLiteral_4= 'PATCH' )
                    {
                    // InternalGenerator.g:2591:3: (enumLiteral_4= 'PATCH' )
                    // InternalGenerator.g:2592:4: enumLiteral_4= 'PATCH'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getEnumMethodTypeAccess().getPATCHEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEnumMethodTypeAccess().getPATCHEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGenerator.g:2599:3: (enumLiteral_5= 'PUT' )
                    {
                    // InternalGenerator.g:2599:3: (enumLiteral_5= 'PUT' )
                    // InternalGenerator.g:2600:4: enumLiteral_5= 'PUT'
                    {
                    enumLiteral_5=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getEnumMethodTypeAccess().getPUTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEnumMethodTypeAccess().getPUTEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleEnumMethodType"


    // $ANTLR start "ruleEnumLayout"
    // InternalGenerator.g:2610:1: ruleEnumLayout returns [Enumerator current=null] : ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'GALLERY' ) ) ;
    public final Enumerator ruleEnumLayout() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGenerator.g:2616:2: ( ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'GALLERY' ) ) )
            // InternalGenerator.g:2617:2: ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'GALLERY' ) )
            {
            // InternalGenerator.g:2617:2: ( (enumLiteral_0= 'List' ) | (enumLiteral_1= 'GALLERY' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==76) ) {
                alt51=1;
            }
            else if ( (LA51_0==77) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalGenerator.g:2618:3: (enumLiteral_0= 'List' )
                    {
                    // InternalGenerator.g:2618:3: (enumLiteral_0= 'List' )
                    // InternalGenerator.g:2619:4: enumLiteral_0= 'List'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getEnumLayoutAccess().getLISTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumLayoutAccess().getLISTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenerator.g:2626:3: (enumLiteral_1= 'GALLERY' )
                    {
                    // InternalGenerator.g:2626:3: (enumLiteral_1= 'GALLERY' )
                    // InternalGenerator.g:2627:4: enumLiteral_1= 'GALLERY'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getEnumLayoutAccess().getGALLERYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumLayoutAccess().getGALLERYEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEnumLayout"


    // $ANTLR start "ruleEnumLanguage"
    // InternalGenerator.g:2637:1: ruleEnumLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) ) ;
    public final Enumerator ruleEnumLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGenerator.g:2643:2: ( ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) ) )
            // InternalGenerator.g:2644:2: ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) )
            {
            // InternalGenerator.g:2644:2: ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==78) ) {
                alt52=1;
            }
            else if ( (LA52_0==79) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalGenerator.g:2645:3: (enumLiteral_0= 'Spanish' )
                    {
                    // InternalGenerator.g:2645:3: (enumLiteral_0= 'Spanish' )
                    // InternalGenerator.g:2646:4: enumLiteral_0= 'Spanish'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getEnumLanguageAccess().getESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumLanguageAccess().getESEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenerator.g:2653:3: (enumLiteral_1= 'English' )
                    {
                    // InternalGenerator.g:2653:3: (enumLiteral_1= 'English' )
                    // InternalGenerator.g:2654:4: enumLiteral_1= 'English'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getEnumLanguageAccess().getENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumLanguageAccess().getENEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEnumLanguage"


    // $ANTLR start "ruleEnumRealtionshipType"
    // InternalGenerator.g:2664:1: ruleEnumRealtionshipType returns [Enumerator current=null] : ( (enumLiteral_0= 'Composite' ) | (enumLiteral_1= 'Shared' ) | (enumLiteral_2= 'Simple' ) ) ;
    public final Enumerator ruleEnumRealtionshipType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGenerator.g:2670:2: ( ( (enumLiteral_0= 'Composite' ) | (enumLiteral_1= 'Shared' ) | (enumLiteral_2= 'Simple' ) ) )
            // InternalGenerator.g:2671:2: ( (enumLiteral_0= 'Composite' ) | (enumLiteral_1= 'Shared' ) | (enumLiteral_2= 'Simple' ) )
            {
            // InternalGenerator.g:2671:2: ( (enumLiteral_0= 'Composite' ) | (enumLiteral_1= 'Shared' ) | (enumLiteral_2= 'Simple' ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt53=1;
                }
                break;
            case 81:
                {
                alt53=2;
                }
                break;
            case 82:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalGenerator.g:2672:3: (enumLiteral_0= 'Composite' )
                    {
                    // InternalGenerator.g:2672:3: (enumLiteral_0= 'Composite' )
                    // InternalGenerator.g:2673:4: enumLiteral_0= 'Composite'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getEnumRealtionshipTypeAccess().getCOMPOSITEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumRealtionshipTypeAccess().getCOMPOSITEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenerator.g:2680:3: (enumLiteral_1= 'Shared' )
                    {
                    // InternalGenerator.g:2680:3: (enumLiteral_1= 'Shared' )
                    // InternalGenerator.g:2681:4: enumLiteral_1= 'Shared'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getEnumRealtionshipTypeAccess().getSHAREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumRealtionshipTypeAccess().getSHAREDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGenerator.g:2688:3: (enumLiteral_2= 'Simple' )
                    {
                    // InternalGenerator.g:2688:3: (enumLiteral_2= 'Simple' )
                    // InternalGenerator.g:2689:4: enumLiteral_2= 'Simple'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getEnumRealtionshipTypeAccess().getSIMPLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEnumRealtionshipTypeAccess().getSIMPLEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleEnumRealtionshipType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000001D980042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001D980060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0002010000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000C000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000610L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000640L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000007000000220L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000007000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000006000000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000220L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000002440L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000002640L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x8000000000000220L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x8000000000000020L});

}