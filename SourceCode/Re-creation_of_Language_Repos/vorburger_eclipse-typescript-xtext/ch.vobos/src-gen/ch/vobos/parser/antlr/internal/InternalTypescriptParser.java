package ch.vobos.parser.antlr.internal;

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
import ch.vobos.services.TypescriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTypescriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOC_COMMENT_LINE", "RULE_DOC_COMMENT_END", "RULE_DOC_ANNOTATION_PREFIX", "RULE_ML_COMMENT", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'='", "'module'", "'.'", "'{'", "'}'", "'export'", "';'", "'interface'", "'class'", "'extends'", "','", "'?'", "':'", "'['", "']'", "'/**'", "'any'", "'number'", "'boolean'", "'string'", "'void'"
    };
    public static final int RULE_DOC_COMMENT_END=6;
    public static final int RULE_STRING=10;
    public static final int RULE_DOC_COMMENT_LINE=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_DOC_ANNOTATION_PREFIX=7;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
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


        public InternalTypescriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTypescriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTypescriptParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTypescript.g"; }



     	private TypescriptGrammarAccess grammarAccess;

        public InternalTypescriptParser(TokenStream input, TypescriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Typescript";
       	}

       	@Override
       	protected TypescriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTypescript"
    // InternalTypescript.g:65:1: entryRuleTypescript returns [EObject current=null] : iv_ruleTypescript= ruleTypescript EOF ;
    public final EObject entryRuleTypescript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypescript = null;


        try {
            // InternalTypescript.g:65:51: (iv_ruleTypescript= ruleTypescript EOF )
            // InternalTypescript.g:66:2: iv_ruleTypescript= ruleTypescript EOF
            {
             newCompositeNode(grammarAccess.getTypescriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypescript=ruleTypescript();

            state._fsp--;

             current =iv_ruleTypescript; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypescript"


    // $ANTLR start "ruleTypescript"
    // InternalTypescript.g:72:1: ruleTypescript returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportDeclaration ) )* ( (lv_interfacesAndClasses_1_0= ruleInterfacesAndClasses ) ) ) ;
    public final EObject ruleTypescript() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_interfacesAndClasses_1_0 = null;



        	enterRule();

        try {
            // InternalTypescript.g:78:2: ( ( ( (lv_imports_0_0= ruleImportDeclaration ) )* ( (lv_interfacesAndClasses_1_0= ruleInterfacesAndClasses ) ) ) )
            // InternalTypescript.g:79:2: ( ( (lv_imports_0_0= ruleImportDeclaration ) )* ( (lv_interfacesAndClasses_1_0= ruleInterfacesAndClasses ) ) )
            {
            // InternalTypescript.g:79:2: ( ( (lv_imports_0_0= ruleImportDeclaration ) )* ( (lv_interfacesAndClasses_1_0= ruleInterfacesAndClasses ) ) )
            // InternalTypescript.g:80:3: ( (lv_imports_0_0= ruleImportDeclaration ) )* ( (lv_interfacesAndClasses_1_0= ruleInterfacesAndClasses ) )
            {
            // InternalTypescript.g:80:3: ( (lv_imports_0_0= ruleImportDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTypescript.g:81:4: (lv_imports_0_0= ruleImportDeclaration )
            	    {
            	    // InternalTypescript.g:81:4: (lv_imports_0_0= ruleImportDeclaration )
            	    // InternalTypescript.g:82:5: lv_imports_0_0= ruleImportDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getTypescriptAccess().getImportsImportDeclarationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImportDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypescriptRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"ch.vobos.Typescript.ImportDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTypescript.g:99:3: ( (lv_interfacesAndClasses_1_0= ruleInterfacesAndClasses ) )
            // InternalTypescript.g:100:4: (lv_interfacesAndClasses_1_0= ruleInterfacesAndClasses )
            {
            // InternalTypescript.g:100:4: (lv_interfacesAndClasses_1_0= ruleInterfacesAndClasses )
            // InternalTypescript.g:101:5: lv_interfacesAndClasses_1_0= ruleInterfacesAndClasses
            {

            					newCompositeNode(grammarAccess.getTypescriptAccess().getInterfacesAndClassesInterfacesAndClassesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_interfacesAndClasses_1_0=ruleInterfacesAndClasses();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypescriptRule());
            					}
            					set(
            						current,
            						"interfacesAndClasses",
            						lv_interfacesAndClasses_1_0,
            						"ch.vobos.Typescript.InterfacesAndClasses");
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
    // $ANTLR end "ruleTypescript"


    // $ANTLR start "entryRuleInterfacesAndClasses"
    // InternalTypescript.g:122:1: entryRuleInterfacesAndClasses returns [EObject current=null] : iv_ruleInterfacesAndClasses= ruleInterfacesAndClasses EOF ;
    public final EObject entryRuleInterfacesAndClasses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfacesAndClasses = null;


        try {
            // InternalTypescript.g:122:61: (iv_ruleInterfacesAndClasses= ruleInterfacesAndClasses EOF )
            // InternalTypescript.g:123:2: iv_ruleInterfacesAndClasses= ruleInterfacesAndClasses EOF
            {
             newCompositeNode(grammarAccess.getInterfacesAndClassesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfacesAndClasses=ruleInterfacesAndClasses();

            state._fsp--;

             current =iv_ruleInterfacesAndClasses; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfacesAndClasses"


    // $ANTLR start "ruleInterfacesAndClasses"
    // InternalTypescript.g:129:1: ruleInterfacesAndClasses returns [EObject current=null] : ( () ( ( (lv_modules_1_0= ruleModuleDeclaration ) ) | ( (lv_types_2_0= ruleDeclaration ) ) )* ) ;
    public final EObject ruleInterfacesAndClasses() throws RecognitionException {
        EObject current = null;

        EObject lv_modules_1_0 = null;

        EObject lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalTypescript.g:135:2: ( ( () ( ( (lv_modules_1_0= ruleModuleDeclaration ) ) | ( (lv_types_2_0= ruleDeclaration ) ) )* ) )
            // InternalTypescript.g:136:2: ( () ( ( (lv_modules_1_0= ruleModuleDeclaration ) ) | ( (lv_types_2_0= ruleDeclaration ) ) )* )
            {
            // InternalTypescript.g:136:2: ( () ( ( (lv_modules_1_0= ruleModuleDeclaration ) ) | ( (lv_types_2_0= ruleDeclaration ) ) )* )
            // InternalTypescript.g:137:3: () ( ( (lv_modules_1_0= ruleModuleDeclaration ) ) | ( (lv_types_2_0= ruleDeclaration ) ) )*
            {
            // InternalTypescript.g:137:3: ()
            // InternalTypescript.g:138:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfacesAndClassesAccess().getInterfacesAndClassesAction_0(),
            					current);
            			

            }

            // InternalTypescript.g:144:3: ( ( (lv_modules_1_0= ruleModuleDeclaration ) ) | ( (lv_types_2_0= ruleDeclaration ) ) )*
            loop2:
            do {
                int alt2=3;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalTypescript.g:145:4: ( (lv_modules_1_0= ruleModuleDeclaration ) )
            	    {
            	    // InternalTypescript.g:145:4: ( (lv_modules_1_0= ruleModuleDeclaration ) )
            	    // InternalTypescript.g:146:5: (lv_modules_1_0= ruleModuleDeclaration )
            	    {
            	    // InternalTypescript.g:146:5: (lv_modules_1_0= ruleModuleDeclaration )
            	    // InternalTypescript.g:147:6: lv_modules_1_0= ruleModuleDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getInterfacesAndClassesAccess().getModulesModuleDeclarationParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_modules_1_0=ruleModuleDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInterfacesAndClassesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"modules",
            	    							lv_modules_1_0,
            	    							"ch.vobos.Typescript.ModuleDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTypescript.g:165:4: ( (lv_types_2_0= ruleDeclaration ) )
            	    {
            	    // InternalTypescript.g:165:4: ( (lv_types_2_0= ruleDeclaration ) )
            	    // InternalTypescript.g:166:5: (lv_types_2_0= ruleDeclaration )
            	    {
            	    // InternalTypescript.g:166:5: (lv_types_2_0= ruleDeclaration )
            	    // InternalTypescript.g:167:6: lv_types_2_0= ruleDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getInterfacesAndClassesAccess().getTypesDeclarationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_types_2_0=ruleDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInterfacesAndClassesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_2_0,
            	    							"ch.vobos.Typescript.Declaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleInterfacesAndClasses"


    // $ANTLR start "entryRuleImportDeclaration"
    // InternalTypescript.g:189:1: entryRuleImportDeclaration returns [EObject current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final EObject entryRuleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclaration = null;


        try {
            // InternalTypescript.g:189:58: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // InternalTypescript.g:190:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
            {
             newCompositeNode(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportDeclaration=ruleImportDeclaration();

            state._fsp--;

             current =iv_ruleImportDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDeclaration"


    // $ANTLR start "ruleImportDeclaration"
    // InternalTypescript.g:196:1: ruleImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( (lv_alias_1_0= ruleIdentifier ) ) otherlv_2= '=' ( (lv_name_3_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_alias_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalTypescript.g:202:2: ( (otherlv_0= 'import' ( (lv_alias_1_0= ruleIdentifier ) ) otherlv_2= '=' ( (lv_name_3_0= ruleQualifiedName ) ) ) )
            // InternalTypescript.g:203:2: (otherlv_0= 'import' ( (lv_alias_1_0= ruleIdentifier ) ) otherlv_2= '=' ( (lv_name_3_0= ruleQualifiedName ) ) )
            {
            // InternalTypescript.g:203:2: (otherlv_0= 'import' ( (lv_alias_1_0= ruleIdentifier ) ) otherlv_2= '=' ( (lv_name_3_0= ruleQualifiedName ) ) )
            // InternalTypescript.g:204:3: otherlv_0= 'import' ( (lv_alias_1_0= ruleIdentifier ) ) otherlv_2= '=' ( (lv_name_3_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportDeclarationAccess().getImportKeyword_0());
            		
            // InternalTypescript.g:208:3: ( (lv_alias_1_0= ruleIdentifier ) )
            // InternalTypescript.g:209:4: (lv_alias_1_0= ruleIdentifier )
            {
            // InternalTypescript.g:209:4: (lv_alias_1_0= ruleIdentifier )
            // InternalTypescript.g:210:5: lv_alias_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getImportDeclarationAccess().getAliasIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_alias_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportDeclarationRule());
            					}
            					set(
            						current,
            						"alias",
            						lv_alias_1_0,
            						"ch.vobos.Typescript.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getImportDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalTypescript.g:231:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalTypescript.g:232:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalTypescript.g:232:4: (lv_name_3_0= ruleQualifiedName )
            // InternalTypescript.g:233:5: lv_name_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getImportDeclarationAccess().getNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"ch.vobos.Typescript.QualifiedName");
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
    // $ANTLR end "ruleImportDeclaration"


    // $ANTLR start "entryRuleModuleDeclaration"
    // InternalTypescript.g:254:1: entryRuleModuleDeclaration returns [EObject current=null] : iv_ruleModuleDeclaration= ruleModuleDeclaration EOF ;
    public final EObject entryRuleModuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleDeclaration = null;


        try {
            // InternalTypescript.g:254:58: (iv_ruleModuleDeclaration= ruleModuleDeclaration EOF )
            // InternalTypescript.g:255:2: iv_ruleModuleDeclaration= ruleModuleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getModuleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModuleDeclaration=ruleModuleDeclaration();

            state._fsp--;

             current =iv_ruleModuleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModuleDeclaration"


    // $ANTLR start "ruleModuleDeclaration"
    // InternalTypescript.g:261:1: ruleModuleDeclaration returns [EObject current=null] : ( ( (lv_docComment_0_0= ruleDocComment ) )? otherlv_1= 'module' ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= '.' ruleIdentifier )* otherlv_5= '{' ( (lv_body_6_0= ruleModuleBody ) ) otherlv_7= '}' ) ;
    public final EObject ruleModuleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_docComment_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalTypescript.g:267:2: ( ( ( (lv_docComment_0_0= ruleDocComment ) )? otherlv_1= 'module' ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= '.' ruleIdentifier )* otherlv_5= '{' ( (lv_body_6_0= ruleModuleBody ) ) otherlv_7= '}' ) )
            // InternalTypescript.g:268:2: ( ( (lv_docComment_0_0= ruleDocComment ) )? otherlv_1= 'module' ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= '.' ruleIdentifier )* otherlv_5= '{' ( (lv_body_6_0= ruleModuleBody ) ) otherlv_7= '}' )
            {
            // InternalTypescript.g:268:2: ( ( (lv_docComment_0_0= ruleDocComment ) )? otherlv_1= 'module' ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= '.' ruleIdentifier )* otherlv_5= '{' ( (lv_body_6_0= ruleModuleBody ) ) otherlv_7= '}' )
            // InternalTypescript.g:269:3: ( (lv_docComment_0_0= ruleDocComment ) )? otherlv_1= 'module' ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= '.' ruleIdentifier )* otherlv_5= '{' ( (lv_body_6_0= ruleModuleBody ) ) otherlv_7= '}'
            {
            // InternalTypescript.g:269:3: ( (lv_docComment_0_0= ruleDocComment ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==30) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTypescript.g:270:4: (lv_docComment_0_0= ruleDocComment )
                    {
                    // InternalTypescript.g:270:4: (lv_docComment_0_0= ruleDocComment )
                    // InternalTypescript.g:271:5: lv_docComment_0_0= ruleDocComment
                    {

                    					newCompositeNode(grammarAccess.getModuleDeclarationAccess().getDocCommentDocCommentParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_docComment_0_0=ruleDocComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModuleDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"docComment",
                    						lv_docComment_0_0,
                    						"ch.vobos.Typescript.DocComment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getModuleDeclarationAccess().getModuleKeyword_1());
            		
            // InternalTypescript.g:292:3: ( (lv_name_2_0= ruleIdentifier ) )
            // InternalTypescript.g:293:4: (lv_name_2_0= ruleIdentifier )
            {
            // InternalTypescript.g:293:4: (lv_name_2_0= ruleIdentifier )
            // InternalTypescript.g:294:5: lv_name_2_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getModuleDeclarationAccess().getNameIdentifierParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ch.vobos.Typescript.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTypescript.g:311:3: (otherlv_3= '.' ruleIdentifier )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTypescript.g:312:4: otherlv_3= '.' ruleIdentifier
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getModuleDeclarationAccess().getFullStopKeyword_3_0());
            	    			

            	    				newCompositeNode(grammarAccess.getModuleDeclarationAccess().getIdentifierParserRuleCall_3_1());
            	    			
            	    pushFollow(FOLLOW_8);
            	    ruleIdentifier();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getModuleDeclarationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTypescript.g:328:3: ( (lv_body_6_0= ruleModuleBody ) )
            // InternalTypescript.g:329:4: (lv_body_6_0= ruleModuleBody )
            {
            // InternalTypescript.g:329:4: (lv_body_6_0= ruleModuleBody )
            // InternalTypescript.g:330:5: lv_body_6_0= ruleModuleBody
            {

            					newCompositeNode(grammarAccess.getModuleDeclarationAccess().getBodyModuleBodyParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_body_6_0=ruleModuleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleDeclarationRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"ch.vobos.Typescript.ModuleBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getModuleDeclarationAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModuleDeclaration"


    // $ANTLR start "entryRuleModuleBody"
    // InternalTypescript.g:355:1: entryRuleModuleBody returns [EObject current=null] : iv_ruleModuleBody= ruleModuleBody EOF ;
    public final EObject entryRuleModuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleBody = null;


        try {
            // InternalTypescript.g:355:51: (iv_ruleModuleBody= ruleModuleBody EOF )
            // InternalTypescript.g:356:2: iv_ruleModuleBody= ruleModuleBody EOF
            {
             newCompositeNode(grammarAccess.getModuleBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModuleBody=ruleModuleBody();

            state._fsp--;

             current =iv_ruleModuleBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModuleBody"


    // $ANTLR start "ruleModuleBody"
    // InternalTypescript.g:362:1: ruleModuleBody returns [EObject current=null] : ( () ( (lv_elements_1_0= ruleModuleElement ) )* ) ;
    public final EObject ruleModuleBody() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalTypescript.g:368:2: ( ( () ( (lv_elements_1_0= ruleModuleElement ) )* ) )
            // InternalTypescript.g:369:2: ( () ( (lv_elements_1_0= ruleModuleElement ) )* )
            {
            // InternalTypescript.g:369:2: ( () ( (lv_elements_1_0= ruleModuleElement ) )* )
            // InternalTypescript.g:370:3: () ( (lv_elements_1_0= ruleModuleElement ) )*
            {
            // InternalTypescript.g:370:3: ()
            // InternalTypescript.g:371:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModuleBodyAccess().getModuleBodyAction_0(),
            					current);
            			

            }

            // InternalTypescript.g:377:3: ( (lv_elements_1_0= ruleModuleElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14||LA5_0==16||LA5_0==20||(LA5_0>=22 && LA5_0<=23)||LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTypescript.g:378:4: (lv_elements_1_0= ruleModuleElement )
            	    {
            	    // InternalTypescript.g:378:4: (lv_elements_1_0= ruleModuleElement )
            	    // InternalTypescript.g:379:5: lv_elements_1_0= ruleModuleElement
            	    {

            	    					newCompositeNode(grammarAccess.getModuleBodyAccess().getElementsModuleElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_elements_1_0=ruleModuleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"ch.vobos.Typescript.ModuleElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // $ANTLR end "ruleModuleBody"


    // $ANTLR start "entryRuleModuleElement"
    // InternalTypescript.g:400:1: entryRuleModuleElement returns [EObject current=null] : iv_ruleModuleElement= ruleModuleElement EOF ;
    public final EObject entryRuleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleElement = null;


        try {
            // InternalTypescript.g:400:54: (iv_ruleModuleElement= ruleModuleElement EOF )
            // InternalTypescript.g:401:2: iv_ruleModuleElement= ruleModuleElement EOF
            {
             newCompositeNode(grammarAccess.getModuleElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModuleElement=ruleModuleElement();

            state._fsp--;

             current =iv_ruleModuleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModuleElement"


    // $ANTLR start "ruleModuleElement"
    // InternalTypescript.g:407:1: ruleModuleElement returns [EObject current=null] : ( ( (lv_exported_0_0= 'export' ) )? ( ( (lv_moduleContent_1_1= ruleDeclaration | lv_moduleContent_1_2= ruleModuleDeclaration | lv_moduleContent_1_3= ruleImportDeclaration ) ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleModuleElement() throws RecognitionException {
        EObject current = null;

        Token lv_exported_0_0=null;
        Token otherlv_2=null;
        EObject lv_moduleContent_1_1 = null;

        EObject lv_moduleContent_1_2 = null;

        EObject lv_moduleContent_1_3 = null;



        	enterRule();

        try {
            // InternalTypescript.g:413:2: ( ( ( (lv_exported_0_0= 'export' ) )? ( ( (lv_moduleContent_1_1= ruleDeclaration | lv_moduleContent_1_2= ruleModuleDeclaration | lv_moduleContent_1_3= ruleImportDeclaration ) ) ) (otherlv_2= ';' )? ) )
            // InternalTypescript.g:414:2: ( ( (lv_exported_0_0= 'export' ) )? ( ( (lv_moduleContent_1_1= ruleDeclaration | lv_moduleContent_1_2= ruleModuleDeclaration | lv_moduleContent_1_3= ruleImportDeclaration ) ) ) (otherlv_2= ';' )? )
            {
            // InternalTypescript.g:414:2: ( ( (lv_exported_0_0= 'export' ) )? ( ( (lv_moduleContent_1_1= ruleDeclaration | lv_moduleContent_1_2= ruleModuleDeclaration | lv_moduleContent_1_3= ruleImportDeclaration ) ) ) (otherlv_2= ';' )? )
            // InternalTypescript.g:415:3: ( (lv_exported_0_0= 'export' ) )? ( ( (lv_moduleContent_1_1= ruleDeclaration | lv_moduleContent_1_2= ruleModuleDeclaration | lv_moduleContent_1_3= ruleImportDeclaration ) ) ) (otherlv_2= ';' )?
            {
            // InternalTypescript.g:415:3: ( (lv_exported_0_0= 'export' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTypescript.g:416:4: (lv_exported_0_0= 'export' )
                    {
                    // InternalTypescript.g:416:4: (lv_exported_0_0= 'export' )
                    // InternalTypescript.g:417:5: lv_exported_0_0= 'export'
                    {
                    lv_exported_0_0=(Token)match(input,20,FOLLOW_3); 

                    					newLeafNode(lv_exported_0_0, grammarAccess.getModuleElementAccess().getExportedExportKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModuleElementRule());
                    					}
                    					setWithLastConsumed(current, "exported", lv_exported_0_0 != null, "export");
                    				

                    }


                    }
                    break;

            }

            // InternalTypescript.g:429:3: ( ( (lv_moduleContent_1_1= ruleDeclaration | lv_moduleContent_1_2= ruleModuleDeclaration | lv_moduleContent_1_3= ruleImportDeclaration ) ) )
            // InternalTypescript.g:430:4: ( (lv_moduleContent_1_1= ruleDeclaration | lv_moduleContent_1_2= ruleModuleDeclaration | lv_moduleContent_1_3= ruleImportDeclaration ) )
            {
            // InternalTypescript.g:430:4: ( (lv_moduleContent_1_1= ruleDeclaration | lv_moduleContent_1_2= ruleModuleDeclaration | lv_moduleContent_1_3= ruleImportDeclaration ) )
            // InternalTypescript.g:431:5: (lv_moduleContent_1_1= ruleDeclaration | lv_moduleContent_1_2= ruleModuleDeclaration | lv_moduleContent_1_3= ruleImportDeclaration )
            {
            // InternalTypescript.g:431:5: (lv_moduleContent_1_1= ruleDeclaration | lv_moduleContent_1_2= ruleModuleDeclaration | lv_moduleContent_1_3= ruleImportDeclaration )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalTypescript.g:432:6: lv_moduleContent_1_1= ruleDeclaration
                    {

                    						newCompositeNode(grammarAccess.getModuleElementAccess().getModuleContentDeclarationParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_moduleContent_1_1=ruleDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModuleElementRule());
                    						}
                    						set(
                    							current,
                    							"moduleContent",
                    							lv_moduleContent_1_1,
                    							"ch.vobos.Typescript.Declaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTypescript.g:448:6: lv_moduleContent_1_2= ruleModuleDeclaration
                    {

                    						newCompositeNode(grammarAccess.getModuleElementAccess().getModuleContentModuleDeclarationParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_12);
                    lv_moduleContent_1_2=ruleModuleDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModuleElementRule());
                    						}
                    						set(
                    							current,
                    							"moduleContent",
                    							lv_moduleContent_1_2,
                    							"ch.vobos.Typescript.ModuleDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalTypescript.g:464:6: lv_moduleContent_1_3= ruleImportDeclaration
                    {

                    						newCompositeNode(grammarAccess.getModuleElementAccess().getModuleContentImportDeclarationParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_12);
                    lv_moduleContent_1_3=ruleImportDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModuleElementRule());
                    						}
                    						set(
                    							current,
                    							"moduleContent",
                    							lv_moduleContent_1_3,
                    							"ch.vobos.Typescript.ImportDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalTypescript.g:482:3: (otherlv_2= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTypescript.g:483:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getModuleElementAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleModuleElement"


    // $ANTLR start "entryRuleDeclaration"
    // InternalTypescript.g:492:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalTypescript.g:492:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalTypescript.g:493:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalTypescript.g:499:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_docComment_0_0= ruleDocComment ) )? ( (lv_declaration_1_0= ruleInterfaceOrClassDeclaration ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_docComment_0_0 = null;

        EObject lv_declaration_1_0 = null;



        	enterRule();

        try {
            // InternalTypescript.g:505:2: ( ( ( (lv_docComment_0_0= ruleDocComment ) )? ( (lv_declaration_1_0= ruleInterfaceOrClassDeclaration ) ) ) )
            // InternalTypescript.g:506:2: ( ( (lv_docComment_0_0= ruleDocComment ) )? ( (lv_declaration_1_0= ruleInterfaceOrClassDeclaration ) ) )
            {
            // InternalTypescript.g:506:2: ( ( (lv_docComment_0_0= ruleDocComment ) )? ( (lv_declaration_1_0= ruleInterfaceOrClassDeclaration ) ) )
            // InternalTypescript.g:507:3: ( (lv_docComment_0_0= ruleDocComment ) )? ( (lv_declaration_1_0= ruleInterfaceOrClassDeclaration ) )
            {
            // InternalTypescript.g:507:3: ( (lv_docComment_0_0= ruleDocComment ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTypescript.g:508:4: (lv_docComment_0_0= ruleDocComment )
                    {
                    // InternalTypescript.g:508:4: (lv_docComment_0_0= ruleDocComment )
                    // InternalTypescript.g:509:5: lv_docComment_0_0= ruleDocComment
                    {

                    					newCompositeNode(grammarAccess.getDeclarationAccess().getDocCommentDocCommentParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_docComment_0_0=ruleDocComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"docComment",
                    						lv_docComment_0_0,
                    						"ch.vobos.Typescript.DocComment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTypescript.g:526:3: ( (lv_declaration_1_0= ruleInterfaceOrClassDeclaration ) )
            // InternalTypescript.g:527:4: (lv_declaration_1_0= ruleInterfaceOrClassDeclaration )
            {
            // InternalTypescript.g:527:4: (lv_declaration_1_0= ruleInterfaceOrClassDeclaration )
            // InternalTypescript.g:528:5: lv_declaration_1_0= ruleInterfaceOrClassDeclaration
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getDeclarationInterfaceOrClassDeclarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_declaration_1_0=ruleInterfaceOrClassDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            					}
            					set(
            						current,
            						"declaration",
            						lv_declaration_1_0,
            						"ch.vobos.Typescript.InterfaceOrClassDeclaration");
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleInterfaceOrClassDeclaration"
    // InternalTypescript.g:549:1: entryRuleInterfaceOrClassDeclaration returns [EObject current=null] : iv_ruleInterfaceOrClassDeclaration= ruleInterfaceOrClassDeclaration EOF ;
    public final EObject entryRuleInterfaceOrClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceOrClassDeclaration = null;


        try {
            // InternalTypescript.g:549:68: (iv_ruleInterfaceOrClassDeclaration= ruleInterfaceOrClassDeclaration EOF )
            // InternalTypescript.g:550:2: iv_ruleInterfaceOrClassDeclaration= ruleInterfaceOrClassDeclaration EOF
            {
             newCompositeNode(grammarAccess.getInterfaceOrClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceOrClassDeclaration=ruleInterfaceOrClassDeclaration();

            state._fsp--;

             current =iv_ruleInterfaceOrClassDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceOrClassDeclaration"


    // $ANTLR start "ruleInterfaceOrClassDeclaration"
    // InternalTypescript.g:556:1: ruleInterfaceOrClassDeclaration returns [EObject current=null] : ( (this_InterfaceDeclaration_0= ruleInterfaceDeclaration | this_ClassDeclaration_1= ruleClassDeclaration ) ( (lv_objectType_2_0= ruleObjectType ) ) ) ;
    public final EObject ruleInterfaceOrClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceDeclaration_0 = null;

        EObject this_ClassDeclaration_1 = null;

        EObject lv_objectType_2_0 = null;



        	enterRule();

        try {
            // InternalTypescript.g:562:2: ( ( (this_InterfaceDeclaration_0= ruleInterfaceDeclaration | this_ClassDeclaration_1= ruleClassDeclaration ) ( (lv_objectType_2_0= ruleObjectType ) ) ) )
            // InternalTypescript.g:563:2: ( (this_InterfaceDeclaration_0= ruleInterfaceDeclaration | this_ClassDeclaration_1= ruleClassDeclaration ) ( (lv_objectType_2_0= ruleObjectType ) ) )
            {
            // InternalTypescript.g:563:2: ( (this_InterfaceDeclaration_0= ruleInterfaceDeclaration | this_ClassDeclaration_1= ruleClassDeclaration ) ( (lv_objectType_2_0= ruleObjectType ) ) )
            // InternalTypescript.g:564:3: (this_InterfaceDeclaration_0= ruleInterfaceDeclaration | this_ClassDeclaration_1= ruleClassDeclaration ) ( (lv_objectType_2_0= ruleObjectType ) )
            {
            // InternalTypescript.g:564:3: (this_InterfaceDeclaration_0= ruleInterfaceDeclaration | this_ClassDeclaration_1= ruleClassDeclaration )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTypescript.g:565:4: this_InterfaceDeclaration_0= ruleInterfaceDeclaration
                    {

                    				newCompositeNode(grammarAccess.getInterfaceOrClassDeclarationAccess().getInterfaceDeclarationParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_14);
                    this_InterfaceDeclaration_0=ruleInterfaceDeclaration();

                    state._fsp--;


                    				current = this_InterfaceDeclaration_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTypescript.g:574:4: this_ClassDeclaration_1= ruleClassDeclaration
                    {

                    				newCompositeNode(grammarAccess.getInterfaceOrClassDeclarationAccess().getClassDeclarationParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_14);
                    this_ClassDeclaration_1=ruleClassDeclaration();

                    state._fsp--;


                    				current = this_ClassDeclaration_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTypescript.g:583:3: ( (lv_objectType_2_0= ruleObjectType ) )
            // InternalTypescript.g:584:4: (lv_objectType_2_0= ruleObjectType )
            {
            // InternalTypescript.g:584:4: (lv_objectType_2_0= ruleObjectType )
            // InternalTypescript.g:585:5: lv_objectType_2_0= ruleObjectType
            {

            					newCompositeNode(grammarAccess.getInterfaceOrClassDeclarationAccess().getObjectTypeObjectTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_objectType_2_0=ruleObjectType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceOrClassDeclarationRule());
            					}
            					set(
            						current,
            						"objectType",
            						lv_objectType_2_0,
            						"ch.vobos.Typescript.ObjectType");
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
    // $ANTLR end "ruleInterfaceOrClassDeclaration"


    // $ANTLR start "entryRuleInterfaceDeclaration"
    // InternalTypescript.g:606:1: entryRuleInterfaceDeclaration returns [EObject current=null] : iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF ;
    public final EObject entryRuleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDeclaration = null;


        try {
            // InternalTypescript.g:606:61: (iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF )
            // InternalTypescript.g:607:2: iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getInterfaceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceDeclaration=ruleInterfaceDeclaration();

            state._fsp--;

             current =iv_ruleInterfaceDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceDeclaration"


    // $ANTLR start "ruleInterfaceDeclaration"
    // InternalTypescript.g:613:1: ruleInterfaceDeclaration returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_extendClause_2_0= ruleInterfaceExtendsClause ) )? ) ;
    public final EObject ruleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_extendClause_2_0 = null;



        	enterRule();

        try {
            // InternalTypescript.g:619:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_extendClause_2_0= ruleInterfaceExtendsClause ) )? ) )
            // InternalTypescript.g:620:2: (otherlv_0= 'interface' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_extendClause_2_0= ruleInterfaceExtendsClause ) )? )
            {
            // InternalTypescript.g:620:2: (otherlv_0= 'interface' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_extendClause_2_0= ruleInterfaceExtendsClause ) )? )
            // InternalTypescript.g:621:3: otherlv_0= 'interface' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_extendClause_2_0= ruleInterfaceExtendsClause ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceDeclarationAccess().getInterfaceKeyword_0());
            		
            // InternalTypescript.g:625:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalTypescript.g:626:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalTypescript.g:626:4: (lv_name_1_0= ruleIdentifier )
            // InternalTypescript.g:627:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ch.vobos.Typescript.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTypescript.g:644:3: ( (lv_extendClause_2_0= ruleInterfaceExtendsClause ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTypescript.g:645:4: (lv_extendClause_2_0= ruleInterfaceExtendsClause )
                    {
                    // InternalTypescript.g:645:4: (lv_extendClause_2_0= ruleInterfaceExtendsClause )
                    // InternalTypescript.g:646:5: lv_extendClause_2_0= ruleInterfaceExtendsClause
                    {

                    					newCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getExtendClauseInterfaceExtendsClauseParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_extendClause_2_0=ruleInterfaceExtendsClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInterfaceDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"extendClause",
                    						lv_extendClause_2_0,
                    						"ch.vobos.Typescript.InterfaceExtendsClause");
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
    // $ANTLR end "ruleInterfaceDeclaration"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalTypescript.g:667:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalTypescript.g:667:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalTypescript.g:668:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
            {
             newCompositeNode(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDeclaration=ruleClassDeclaration();

            state._fsp--;

             current =iv_ruleClassDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalTypescript.g:674:1: ruleClassDeclaration returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalTypescript.g:680:2: ( (otherlv_0= 'class' ( (lv_name_1_0= ruleIdentifier ) ) ) )
            // InternalTypescript.g:681:2: (otherlv_0= 'class' ( (lv_name_1_0= ruleIdentifier ) ) )
            {
            // InternalTypescript.g:681:2: (otherlv_0= 'class' ( (lv_name_1_0= ruleIdentifier ) ) )
            // InternalTypescript.g:682:3: otherlv_0= 'class' ( (lv_name_1_0= ruleIdentifier ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getClassDeclarationAccess().getClassKeyword_0());
            		
            // InternalTypescript.g:686:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalTypescript.g:687:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalTypescript.g:687:4: (lv_name_1_0= ruleIdentifier )
            // InternalTypescript.g:688:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ch.vobos.Typescript.Identifier");
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
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleIdentifier"
    // InternalTypescript.g:709:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalTypescript.g:709:50: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalTypescript.g:710:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalTypescript.g:716:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalTypescript.g:722:2: (this_ID_0= RULE_ID )
            // InternalTypescript.g:723:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

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


    // $ANTLR start "entryRuleInterfaceExtendsClause"
    // InternalTypescript.g:733:1: entryRuleInterfaceExtendsClause returns [EObject current=null] : iv_ruleInterfaceExtendsClause= ruleInterfaceExtendsClause EOF ;
    public final EObject entryRuleInterfaceExtendsClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceExtendsClause = null;


        try {
            // InternalTypescript.g:733:63: (iv_ruleInterfaceExtendsClause= ruleInterfaceExtendsClause EOF )
            // InternalTypescript.g:734:2: iv_ruleInterfaceExtendsClause= ruleInterfaceExtendsClause EOF
            {
             newCompositeNode(grammarAccess.getInterfaceExtendsClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceExtendsClause=ruleInterfaceExtendsClause();

            state._fsp--;

             current =iv_ruleInterfaceExtendsClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceExtendsClause"


    // $ANTLR start "ruleInterfaceExtendsClause"
    // InternalTypescript.g:740:1: ruleInterfaceExtendsClause returns [EObject current=null] : (otherlv_0= 'extends' this_ClassOrInterfaceTypeList_1= ruleClassOrInterfaceTypeList ) ;
    public final EObject ruleInterfaceExtendsClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ClassOrInterfaceTypeList_1 = null;



        	enterRule();

        try {
            // InternalTypescript.g:746:2: ( (otherlv_0= 'extends' this_ClassOrInterfaceTypeList_1= ruleClassOrInterfaceTypeList ) )
            // InternalTypescript.g:747:2: (otherlv_0= 'extends' this_ClassOrInterfaceTypeList_1= ruleClassOrInterfaceTypeList )
            {
            // InternalTypescript.g:747:2: (otherlv_0= 'extends' this_ClassOrInterfaceTypeList_1= ruleClassOrInterfaceTypeList )
            // InternalTypescript.g:748:3: otherlv_0= 'extends' this_ClassOrInterfaceTypeList_1= ruleClassOrInterfaceTypeList
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceExtendsClauseAccess().getExtendsKeyword_0());
            		

            			newCompositeNode(grammarAccess.getInterfaceExtendsClauseAccess().getClassOrInterfaceTypeListParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_ClassOrInterfaceTypeList_1=ruleClassOrInterfaceTypeList();

            state._fsp--;


            			current = this_ClassOrInterfaceTypeList_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceExtendsClause"


    // $ANTLR start "entryRuleClassOrInterfaceTypeList"
    // InternalTypescript.g:764:1: entryRuleClassOrInterfaceTypeList returns [EObject current=null] : iv_ruleClassOrInterfaceTypeList= ruleClassOrInterfaceTypeList EOF ;
    public final EObject entryRuleClassOrInterfaceTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassOrInterfaceTypeList = null;


        try {
            // InternalTypescript.g:764:65: (iv_ruleClassOrInterfaceTypeList= ruleClassOrInterfaceTypeList EOF )
            // InternalTypescript.g:765:2: iv_ruleClassOrInterfaceTypeList= ruleClassOrInterfaceTypeList EOF
            {
             newCompositeNode(grammarAccess.getClassOrInterfaceTypeListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassOrInterfaceTypeList=ruleClassOrInterfaceTypeList();

            state._fsp--;

             current =iv_ruleClassOrInterfaceTypeList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassOrInterfaceTypeList"


    // $ANTLR start "ruleClassOrInterfaceTypeList"
    // InternalTypescript.g:771:1: ruleClassOrInterfaceTypeList returns [EObject current=null] : ( () ( (lv_parents_1_0= ruleTypeReference ) ) (otherlv_2= ',' ( (lv_parents_3_0= ruleTypeReference ) ) )* ) ;
    public final EObject ruleClassOrInterfaceTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_parents_1_0 = null;

        EObject lv_parents_3_0 = null;



        	enterRule();

        try {
            // InternalTypescript.g:777:2: ( ( () ( (lv_parents_1_0= ruleTypeReference ) ) (otherlv_2= ',' ( (lv_parents_3_0= ruleTypeReference ) ) )* ) )
            // InternalTypescript.g:778:2: ( () ( (lv_parents_1_0= ruleTypeReference ) ) (otherlv_2= ',' ( (lv_parents_3_0= ruleTypeReference ) ) )* )
            {
            // InternalTypescript.g:778:2: ( () ( (lv_parents_1_0= ruleTypeReference ) ) (otherlv_2= ',' ( (lv_parents_3_0= ruleTypeReference ) ) )* )
            // InternalTypescript.g:779:3: () ( (lv_parents_1_0= ruleTypeReference ) ) (otherlv_2= ',' ( (lv_parents_3_0= ruleTypeReference ) ) )*
            {
            // InternalTypescript.g:779:3: ()
            // InternalTypescript.g:780:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassOrInterfaceTypeListAccess().getClassOrInterfaceTypeListAction_0(),
            					current);
            			

            }

            // InternalTypescript.g:786:3: ( (lv_parents_1_0= ruleTypeReference ) )
            // InternalTypescript.g:787:4: (lv_parents_1_0= ruleTypeReference )
            {
            // InternalTypescript.g:787:4: (lv_parents_1_0= ruleTypeReference )
            // InternalTypescript.g:788:5: lv_parents_1_0= ruleTypeReference
            {

            					newCompositeNode(grammarAccess.getClassOrInterfaceTypeListAccess().getParentsTypeReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_parents_1_0=ruleTypeReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassOrInterfaceTypeListRule());
            					}
            					add(
            						current,
            						"parents",
            						lv_parents_1_0,
            						"ch.vobos.Typescript.TypeReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTypescript.g:805:3: (otherlv_2= ',' ( (lv_parents_3_0= ruleTypeReference ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTypescript.g:806:4: otherlv_2= ',' ( (lv_parents_3_0= ruleTypeReference ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getClassOrInterfaceTypeListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalTypescript.g:810:4: ( (lv_parents_3_0= ruleTypeReference ) )
            	    // InternalTypescript.g:811:5: (lv_parents_3_0= ruleTypeReference )
            	    {
            	    // InternalTypescript.g:811:5: (lv_parents_3_0= ruleTypeReference )
            	    // InternalTypescript.g:812:6: lv_parents_3_0= ruleTypeReference
            	    {

            	    						newCompositeNode(grammarAccess.getClassOrInterfaceTypeListAccess().getParentsTypeReferenceParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_parents_3_0=ruleTypeReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassOrInterfaceTypeListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parents",
            	    							lv_parents_3_0,
            	    							"ch.vobos.Typescript.TypeReference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleClassOrInterfaceTypeList"


    // $ANTLR start "entryRuleObjectType"
    // InternalTypescript.g:834:1: entryRuleObjectType returns [EObject current=null] : iv_ruleObjectType= ruleObjectType EOF ;
    public final EObject entryRuleObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectType = null;


        try {
            // InternalTypescript.g:834:51: (iv_ruleObjectType= ruleObjectType EOF )
            // InternalTypescript.g:835:2: iv_ruleObjectType= ruleObjectType EOF
            {
             newCompositeNode(grammarAccess.getObjectTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectType=ruleObjectType();

            state._fsp--;

             current =iv_ruleObjectType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectType"


    // $ANTLR start "ruleObjectType"
    // InternalTypescript.g:841:1: ruleObjectType returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleTypeMember ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleObjectType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_members_2_0 = null;



        	enterRule();

        try {
            // InternalTypescript.g:847:2: ( ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleTypeMember ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // InternalTypescript.g:848:2: ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleTypeMember ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // InternalTypescript.g:848:2: ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleTypeMember ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // InternalTypescript.g:849:3: () otherlv_1= '{' ( ( (lv_members_2_0= ruleTypeMember ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // InternalTypescript.g:849:3: ()
            // InternalTypescript.g:850:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectTypeAccess().getObjectTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTypescript.g:860:3: ( ( (lv_members_2_0= ruleTypeMember ) ) (otherlv_3= ';' )? )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==28||LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTypescript.g:861:4: ( (lv_members_2_0= ruleTypeMember ) ) (otherlv_3= ';' )?
            	    {
            	    // InternalTypescript.g:861:4: ( (lv_members_2_0= ruleTypeMember ) )
            	    // InternalTypescript.g:862:5: (lv_members_2_0= ruleTypeMember )
            	    {
            	    // InternalTypescript.g:862:5: (lv_members_2_0= ruleTypeMember )
            	    // InternalTypescript.g:863:6: lv_members_2_0= ruleTypeMember
            	    {

            	    						newCompositeNode(grammarAccess.getObjectTypeAccess().getMembersTypeMemberParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_members_2_0=ruleTypeMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getObjectTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"members",
            	    							lv_members_2_0,
            	    							"ch.vobos.Typescript.TypeMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTypescript.g:880:4: (otherlv_3= ';' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==21) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalTypescript.g:881:5: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,21,FOLLOW_17); 

            	            					newLeafNode(otherlv_3, grammarAccess.getObjectTypeAccess().getSemicolonKeyword_2_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getObjectTypeAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectType"


    // $ANTLR start "entryRuleTypeMember"
    // InternalTypescript.g:895:1: entryRuleTypeMember returns [EObject current=null] : iv_ruleTypeMember= ruleTypeMember EOF ;
    public final EObject entryRuleTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMember = null;


        try {
            // InternalTypescript.g:895:51: (iv_ruleTypeMember= ruleTypeMember EOF )
            // InternalTypescript.g:896:2: iv_ruleTypeMember= ruleTypeMember EOF
            {
             newCompositeNode(grammarAccess.getTypeMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeMember=ruleTypeMember();

            state._fsp--;

             current =iv_ruleTypeMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeMember"


    // $ANTLR start "ruleTypeMember"
    // InternalTypescript.g:902:1: ruleTypeMember returns [EObject current=null] : ( ( (lv_docComment_0_0= ruleDocComment ) )? ( ( (lv_signature_1_1= rulePropertySignature | lv_signature_1_2= ruleIndexSignature ) ) ) ) ;
    public final EObject ruleTypeMember() throws RecognitionException {
        EObject current = null;

        EObject lv_docComment_0_0 = null;

        EObject lv_signature_1_1 = null;

        EObject lv_signature_1_2 = null;



        	enterRule();

        try {
            // InternalTypescript.g:908:2: ( ( ( (lv_docComment_0_0= ruleDocComment ) )? ( ( (lv_signature_1_1= rulePropertySignature | lv_signature_1_2= ruleIndexSignature ) ) ) ) )
            // InternalTypescript.g:909:2: ( ( (lv_docComment_0_0= ruleDocComment ) )? ( ( (lv_signature_1_1= rulePropertySignature | lv_signature_1_2= ruleIndexSignature ) ) ) )
            {
            // InternalTypescript.g:909:2: ( ( (lv_docComment_0_0= ruleDocComment ) )? ( ( (lv_signature_1_1= rulePropertySignature | lv_signature_1_2= ruleIndexSignature ) ) ) )
            // InternalTypescript.g:910:3: ( (lv_docComment_0_0= ruleDocComment ) )? ( ( (lv_signature_1_1= rulePropertySignature | lv_signature_1_2= ruleIndexSignature ) ) )
            {
            // InternalTypescript.g:910:3: ( (lv_docComment_0_0= ruleDocComment ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTypescript.g:911:4: (lv_docComment_0_0= ruleDocComment )
                    {
                    // InternalTypescript.g:911:4: (lv_docComment_0_0= ruleDocComment )
                    // InternalTypescript.g:912:5: lv_docComment_0_0= ruleDocComment
                    {

                    					newCompositeNode(grammarAccess.getTypeMemberAccess().getDocCommentDocCommentParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_docComment_0_0=ruleDocComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeMemberRule());
                    					}
                    					set(
                    						current,
                    						"docComment",
                    						lv_docComment_0_0,
                    						"ch.vobos.Typescript.DocComment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTypescript.g:929:3: ( ( (lv_signature_1_1= rulePropertySignature | lv_signature_1_2= ruleIndexSignature ) ) )
            // InternalTypescript.g:930:4: ( (lv_signature_1_1= rulePropertySignature | lv_signature_1_2= ruleIndexSignature ) )
            {
            // InternalTypescript.g:930:4: ( (lv_signature_1_1= rulePropertySignature | lv_signature_1_2= ruleIndexSignature ) )
            // InternalTypescript.g:931:5: (lv_signature_1_1= rulePropertySignature | lv_signature_1_2= ruleIndexSignature )
            {
            // InternalTypescript.g:931:5: (lv_signature_1_1= rulePropertySignature | lv_signature_1_2= ruleIndexSignature )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==28) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalTypescript.g:932:6: lv_signature_1_1= rulePropertySignature
                    {

                    						newCompositeNode(grammarAccess.getTypeMemberAccess().getSignaturePropertySignatureParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_signature_1_1=rulePropertySignature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeMemberRule());
                    						}
                    						set(
                    							current,
                    							"signature",
                    							lv_signature_1_1,
                    							"ch.vobos.Typescript.PropertySignature");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTypescript.g:948:6: lv_signature_1_2= ruleIndexSignature
                    {

                    						newCompositeNode(grammarAccess.getTypeMemberAccess().getSignatureIndexSignatureParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_signature_1_2=ruleIndexSignature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeMemberRule());
                    						}
                    						set(
                    							current,
                    							"signature",
                    							lv_signature_1_2,
                    							"ch.vobos.Typescript.IndexSignature");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleTypeMember"


    // $ANTLR start "entryRulePropertySignature"
    // InternalTypescript.g:970:1: entryRulePropertySignature returns [EObject current=null] : iv_rulePropertySignature= rulePropertySignature EOF ;
    public final EObject entryRulePropertySignature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySignature = null;


        try {
            // InternalTypescript.g:970:58: (iv_rulePropertySignature= rulePropertySignature EOF )
            // InternalTypescript.g:971:2: iv_rulePropertySignature= rulePropertySignature EOF
            {
             newCompositeNode(grammarAccess.getPropertySignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertySignature=rulePropertySignature();

            state._fsp--;

             current =iv_rulePropertySignature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertySignature"


    // $ANTLR start "rulePropertySignature"
    // InternalTypescript.g:977:1: rulePropertySignature returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentifierName ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject rulePropertySignature() throws RecognitionException {
        EObject current = null;

        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalTypescript.g:983:2: ( ( ( (lv_name_0_0= ruleIdentifierName ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalTypescript.g:984:2: ( ( (lv_name_0_0= ruleIdentifierName ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalTypescript.g:984:2: ( ( (lv_name_0_0= ruleIdentifierName ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalTypescript.g:985:3: ( (lv_name_0_0= ruleIdentifierName ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // InternalTypescript.g:985:3: ( (lv_name_0_0= ruleIdentifierName ) )
            // InternalTypescript.g:986:4: (lv_name_0_0= ruleIdentifierName )
            {
            // InternalTypescript.g:986:4: (lv_name_0_0= ruleIdentifierName )
            // InternalTypescript.g:987:5: lv_name_0_0= ruleIdentifierName
            {

            					newCompositeNode(grammarAccess.getPropertySignatureAccess().getNameIdentifierNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_0_0=ruleIdentifierName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertySignatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ch.vobos.Typescript.IdentifierName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTypescript.g:1004:3: ( (lv_optional_1_0= '?' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTypescript.g:1005:4: (lv_optional_1_0= '?' )
                    {
                    // InternalTypescript.g:1005:4: (lv_optional_1_0= '?' )
                    // InternalTypescript.g:1006:5: lv_optional_1_0= '?'
                    {
                    lv_optional_1_0=(Token)match(input,26,FOLLOW_21); 

                    					newLeafNode(lv_optional_1_0, grammarAccess.getPropertySignatureAccess().getOptionalQuestionMarkKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPropertySignatureRule());
                    					}
                    					setWithLastConsumed(current, "optional", lv_optional_1_0 != null, "?");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertySignatureAccess().getColonKeyword_2());
            		
            // InternalTypescript.g:1022:3: ( (lv_type_3_0= ruleType ) )
            // InternalTypescript.g:1023:4: (lv_type_3_0= ruleType )
            {
            // InternalTypescript.g:1023:4: (lv_type_3_0= ruleType )
            // InternalTypescript.g:1024:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPropertySignatureAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertySignatureRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"ch.vobos.Typescript.Type");
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
    // $ANTLR end "rulePropertySignature"


    // $ANTLR start "entryRuleIdentifierName"
    // InternalTypescript.g:1045:1: entryRuleIdentifierName returns [String current=null] : iv_ruleIdentifierName= ruleIdentifierName EOF ;
    public final String entryRuleIdentifierName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifierName = null;


        try {
            // InternalTypescript.g:1045:54: (iv_ruleIdentifierName= ruleIdentifierName EOF )
            // InternalTypescript.g:1046:2: iv_ruleIdentifierName= ruleIdentifierName EOF
            {
             newCompositeNode(grammarAccess.getIdentifierNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifierName=ruleIdentifierName();

            state._fsp--;

             current =iv_ruleIdentifierName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifierName"


    // $ANTLR start "ruleIdentifierName"
    // InternalTypescript.g:1052:1: ruleIdentifierName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIdentifierName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalTypescript.g:1058:2: (this_ID_0= RULE_ID )
            // InternalTypescript.g:1059:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getIdentifierNameAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifierName"


    // $ANTLR start "entryRuleType"
    // InternalTypescript.g:1069:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalTypescript.g:1069:45: (iv_ruleType= ruleType EOF )
            // InternalTypescript.g:1070:2: iv_ruleType= ruleType EOF
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
    // InternalTypescript.g:1076:1: ruleType returns [EObject current=null] : (this_PredefinedType_0= rulePredefinedType | this_TypeReference_1= ruleTypeReference | this_TypeLiteral_2= ruleTypeLiteral ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_PredefinedType_0 = null;

        EObject this_TypeReference_1 = null;

        EObject this_TypeLiteral_2 = null;



        	enterRule();

        try {
            // InternalTypescript.g:1082:2: ( (this_PredefinedType_0= rulePredefinedType | this_TypeReference_1= ruleTypeReference | this_TypeLiteral_2= ruleTypeLiteral ) )
            // InternalTypescript.g:1083:2: (this_PredefinedType_0= rulePredefinedType | this_TypeReference_1= ruleTypeReference | this_TypeLiteral_2= ruleTypeLiteral )
            {
            // InternalTypescript.g:1083:2: (this_PredefinedType_0= rulePredefinedType | this_TypeReference_1= ruleTypeReference | this_TypeLiteral_2= ruleTypeLiteral )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalTypescript.g:1084:3: this_PredefinedType_0= rulePredefinedType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getPredefinedTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PredefinedType_0=rulePredefinedType();

                    state._fsp--;


                    			current = this_PredefinedType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTypescript.g:1093:3: this_TypeReference_1= ruleTypeReference
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getTypeReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeReference_1=ruleTypeReference();

                    state._fsp--;


                    			current = this_TypeReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTypescript.g:1102:3: this_TypeLiteral_2= ruleTypeLiteral
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getTypeLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeLiteral_2=ruleTypeLiteral();

                    state._fsp--;


                    			current = this_TypeLiteral_2;
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


    // $ANTLR start "entryRulePredefinedType"
    // InternalTypescript.g:1114:1: entryRulePredefinedType returns [EObject current=null] : iv_rulePredefinedType= rulePredefinedType EOF ;
    public final EObject entryRulePredefinedType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredefinedType = null;


        try {
            // InternalTypescript.g:1114:55: (iv_rulePredefinedType= rulePredefinedType EOF )
            // InternalTypescript.g:1115:2: iv_rulePredefinedType= rulePredefinedType EOF
            {
             newCompositeNode(grammarAccess.getPredefinedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredefinedType=rulePredefinedType();

            state._fsp--;

             current =iv_rulePredefinedType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredefinedType"


    // $ANTLR start "rulePredefinedType"
    // InternalTypescript.g:1121:1: rulePredefinedType returns [EObject current=null] : ( (lv_predefinedType_0_0= rulePredefinedTypeEnum ) ) ;
    public final EObject rulePredefinedType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_predefinedType_0_0 = null;



        	enterRule();

        try {
            // InternalTypescript.g:1127:2: ( ( (lv_predefinedType_0_0= rulePredefinedTypeEnum ) ) )
            // InternalTypescript.g:1128:2: ( (lv_predefinedType_0_0= rulePredefinedTypeEnum ) )
            {
            // InternalTypescript.g:1128:2: ( (lv_predefinedType_0_0= rulePredefinedTypeEnum ) )
            // InternalTypescript.g:1129:3: (lv_predefinedType_0_0= rulePredefinedTypeEnum )
            {
            // InternalTypescript.g:1129:3: (lv_predefinedType_0_0= rulePredefinedTypeEnum )
            // InternalTypescript.g:1130:4: lv_predefinedType_0_0= rulePredefinedTypeEnum
            {

            				newCompositeNode(grammarAccess.getPredefinedTypeAccess().getPredefinedTypePredefinedTypeEnumEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_predefinedType_0_0=rulePredefinedTypeEnum();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPredefinedTypeRule());
            				}
            				set(
            					current,
            					"predefinedType",
            					lv_predefinedType_0_0,
            					"ch.vobos.Typescript.PredefinedTypeEnum");
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
    // $ANTLR end "rulePredefinedType"


    // $ANTLR start "entryRuleTypeLiteral"
    // InternalTypescript.g:1150:1: entryRuleTypeLiteral returns [EObject current=null] : iv_ruleTypeLiteral= ruleTypeLiteral EOF ;
    public final EObject entryRuleTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteral = null;


        try {
            // InternalTypescript.g:1150:52: (iv_ruleTypeLiteral= ruleTypeLiteral EOF )
            // InternalTypescript.g:1151:2: iv_ruleTypeLiteral= ruleTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getTypeLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeLiteral=ruleTypeLiteral();

            state._fsp--;

             current =iv_ruleTypeLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteral"


    // $ANTLR start "ruleTypeLiteral"
    // InternalTypescript.g:1157:1: ruleTypeLiteral returns [EObject current=null] : (this_ObjectType_0= ruleObjectType | this_ArrayType_1= ruleArrayType ) ;
    public final EObject ruleTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectType_0 = null;

        EObject this_ArrayType_1 = null;



        	enterRule();

        try {
            // InternalTypescript.g:1163:2: ( (this_ObjectType_0= ruleObjectType | this_ArrayType_1= ruleArrayType ) )
            // InternalTypescript.g:1164:2: (this_ObjectType_0= ruleObjectType | this_ArrayType_1= ruleArrayType )
            {
            // InternalTypescript.g:1164:2: (this_ObjectType_0= ruleObjectType | this_ArrayType_1= ruleArrayType )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID||(LA19_0>=31 && LA19_0<=35)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalTypescript.g:1165:3: this_ObjectType_0= ruleObjectType
                    {

                    			newCompositeNode(grammarAccess.getTypeLiteralAccess().getObjectTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectType_0=ruleObjectType();

                    state._fsp--;


                    			current = this_ObjectType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTypescript.g:1174:3: this_ArrayType_1= ruleArrayType
                    {

                    			newCompositeNode(grammarAccess.getTypeLiteralAccess().getArrayTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayType_1=ruleArrayType();

                    state._fsp--;


                    			current = this_ArrayType_1;
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
    // $ANTLR end "ruleTypeLiteral"


    // $ANTLR start "entryRuleArrayType"
    // InternalTypescript.g:1186:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalTypescript.g:1186:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalTypescript.g:1187:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalTypescript.g:1193:1: ruleArrayType returns [EObject current=null] : ( ( () ( (lv_array_1_0= rulePredefinedType ) ) otherlv_2= '[' otherlv_3= ']' ) | (this_TypeReference_4= ruleTypeReference otherlv_5= '[' otherlv_6= ']' ) ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_array_1_0 = null;

        EObject this_TypeReference_4 = null;



        	enterRule();

        try {
            // InternalTypescript.g:1199:2: ( ( ( () ( (lv_array_1_0= rulePredefinedType ) ) otherlv_2= '[' otherlv_3= ']' ) | (this_TypeReference_4= ruleTypeReference otherlv_5= '[' otherlv_6= ']' ) ) )
            // InternalTypescript.g:1200:2: ( ( () ( (lv_array_1_0= rulePredefinedType ) ) otherlv_2= '[' otherlv_3= ']' ) | (this_TypeReference_4= ruleTypeReference otherlv_5= '[' otherlv_6= ']' ) )
            {
            // InternalTypescript.g:1200:2: ( ( () ( (lv_array_1_0= rulePredefinedType ) ) otherlv_2= '[' otherlv_3= ']' ) | (this_TypeReference_4= ruleTypeReference otherlv_5= '[' otherlv_6= ']' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=31 && LA20_0<=35)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalTypescript.g:1201:3: ( () ( (lv_array_1_0= rulePredefinedType ) ) otherlv_2= '[' otherlv_3= ']' )
                    {
                    // InternalTypescript.g:1201:3: ( () ( (lv_array_1_0= rulePredefinedType ) ) otherlv_2= '[' otherlv_3= ']' )
                    // InternalTypescript.g:1202:4: () ( (lv_array_1_0= rulePredefinedType ) ) otherlv_2= '[' otherlv_3= ']'
                    {
                    // InternalTypescript.g:1202:4: ()
                    // InternalTypescript.g:1203:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getArrayTypeAccess().getArrayTypeAction_0_0(),
                    						current);
                    				

                    }

                    // InternalTypescript.g:1209:4: ( (lv_array_1_0= rulePredefinedType ) )
                    // InternalTypescript.g:1210:5: (lv_array_1_0= rulePredefinedType )
                    {
                    // InternalTypescript.g:1210:5: (lv_array_1_0= rulePredefinedType )
                    // InternalTypescript.g:1211:6: lv_array_1_0= rulePredefinedType
                    {

                    						newCompositeNode(grammarAccess.getArrayTypeAccess().getArrayPredefinedTypeParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_array_1_0=rulePredefinedType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    						}
                    						set(
                    							current,
                    							"array",
                    							lv_array_1_0,
                    							"ch.vobos.Typescript.PredefinedType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTypescript.g:1238:3: (this_TypeReference_4= ruleTypeReference otherlv_5= '[' otherlv_6= ']' )
                    {
                    // InternalTypescript.g:1238:3: (this_TypeReference_4= ruleTypeReference otherlv_5= '[' otherlv_6= ']' )
                    // InternalTypescript.g:1239:4: this_TypeReference_4= ruleTypeReference otherlv_5= '[' otherlv_6= ']'
                    {

                    				newCompositeNode(grammarAccess.getArrayTypeAccess().getTypeReferenceParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_23);
                    this_TypeReference_4=ruleTypeReference();

                    state._fsp--;


                    				current = this_TypeReference_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    otherlv_6=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleTypeReference"
    // InternalTypescript.g:1260:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalTypescript.g:1260:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalTypescript.g:1261:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
             newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;

             current =iv_ruleTypeReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalTypescript.g:1267:1: ruleTypeReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalTypescript.g:1273:2: ( ( ( ruleQualifiedName ) ) )
            // InternalTypescript.g:1274:2: ( ( ruleQualifiedName ) )
            {
            // InternalTypescript.g:1274:2: ( ( ruleQualifiedName ) )
            // InternalTypescript.g:1275:3: ( ruleQualifiedName )
            {
            // InternalTypescript.g:1275:3: ( ruleQualifiedName )
            // InternalTypescript.g:1276:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeReferenceRule());
            				}
            			

            				newCompositeNode(grammarAccess.getTypeReferenceAccess().getReferenceInterfaceOrClassDeclarationCrossReference_0());
            			
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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalTypescript.g:1293:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalTypescript.g:1293:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalTypescript.g:1294:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalTypescript.g:1300:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalTypescript.g:1306:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalTypescript.g:1307:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalTypescript.g:1307:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalTypescript.g:1308:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalTypescript.g:1315:3: (kw= '.' this_ID_2= RULE_ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTypescript.g:1316:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
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


    // $ANTLR start "entryRuleDocComment"
    // InternalTypescript.g:1333:1: entryRuleDocComment returns [EObject current=null] : iv_ruleDocComment= ruleDocComment EOF ;
    public final EObject entryRuleDocComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocComment = null;


        try {
            // InternalTypescript.g:1333:51: (iv_ruleDocComment= ruleDocComment EOF )
            // InternalTypescript.g:1334:2: iv_ruleDocComment= ruleDocComment EOF
            {
             newCompositeNode(grammarAccess.getDocCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocComment=ruleDocComment();

            state._fsp--;

             current =iv_ruleDocComment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocComment"


    // $ANTLR start "ruleDocComment"
    // InternalTypescript.g:1340:1: ruleDocComment returns [EObject current=null] : ( () otherlv_1= '/**' ( (lv_lines_2_0= RULE_DOC_COMMENT_LINE ) )* ( (lv_annotations_3_0= ruleAnnotationLine ) )* this_DOC_COMMENT_END_4= RULE_DOC_COMMENT_END ) ;
    public final EObject ruleDocComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lines_2_0=null;
        Token this_DOC_COMMENT_END_4=null;
        EObject lv_annotations_3_0 = null;



        	enterRule();

        try {
            // InternalTypescript.g:1346:2: ( ( () otherlv_1= '/**' ( (lv_lines_2_0= RULE_DOC_COMMENT_LINE ) )* ( (lv_annotations_3_0= ruleAnnotationLine ) )* this_DOC_COMMENT_END_4= RULE_DOC_COMMENT_END ) )
            // InternalTypescript.g:1347:2: ( () otherlv_1= '/**' ( (lv_lines_2_0= RULE_DOC_COMMENT_LINE ) )* ( (lv_annotations_3_0= ruleAnnotationLine ) )* this_DOC_COMMENT_END_4= RULE_DOC_COMMENT_END )
            {
            // InternalTypescript.g:1347:2: ( () otherlv_1= '/**' ( (lv_lines_2_0= RULE_DOC_COMMENT_LINE ) )* ( (lv_annotations_3_0= ruleAnnotationLine ) )* this_DOC_COMMENT_END_4= RULE_DOC_COMMENT_END )
            // InternalTypescript.g:1348:3: () otherlv_1= '/**' ( (lv_lines_2_0= RULE_DOC_COMMENT_LINE ) )* ( (lv_annotations_3_0= ruleAnnotationLine ) )* this_DOC_COMMENT_END_4= RULE_DOC_COMMENT_END
            {
            // InternalTypescript.g:1348:3: ()
            // InternalTypescript.g:1349:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocCommentAccess().getDocCommentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDocCommentAccess().getSolidusAsteriskAsteriskKeyword_1());
            		
            // InternalTypescript.g:1359:3: ( (lv_lines_2_0= RULE_DOC_COMMENT_LINE ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_DOC_COMMENT_LINE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTypescript.g:1360:4: (lv_lines_2_0= RULE_DOC_COMMENT_LINE )
            	    {
            	    // InternalTypescript.g:1360:4: (lv_lines_2_0= RULE_DOC_COMMENT_LINE )
            	    // InternalTypescript.g:1361:5: lv_lines_2_0= RULE_DOC_COMMENT_LINE
            	    {
            	    lv_lines_2_0=(Token)match(input,RULE_DOC_COMMENT_LINE,FOLLOW_26); 

            	    					newLeafNode(lv_lines_2_0, grammarAccess.getDocCommentAccess().getLinesDOC_COMMENT_LINETerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDocCommentRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"lines",
            	    						lv_lines_2_0,
            	    						"ch.vobos.Typescript.DOC_COMMENT_LINE");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalTypescript.g:1377:3: ( (lv_annotations_3_0= ruleAnnotationLine ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_DOC_ANNOTATION_PREFIX) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTypescript.g:1378:4: (lv_annotations_3_0= ruleAnnotationLine )
            	    {
            	    // InternalTypescript.g:1378:4: (lv_annotations_3_0= ruleAnnotationLine )
            	    // InternalTypescript.g:1379:5: lv_annotations_3_0= ruleAnnotationLine
            	    {

            	    					newCompositeNode(grammarAccess.getDocCommentAccess().getAnnotationsAnnotationLineParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_annotations_3_0=ruleAnnotationLine();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDocCommentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_3_0,
            	    						"ch.vobos.Typescript.AnnotationLine");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            this_DOC_COMMENT_END_4=(Token)match(input,RULE_DOC_COMMENT_END,FOLLOW_2); 

            			newLeafNode(this_DOC_COMMENT_END_4, grammarAccess.getDocCommentAccess().getDOC_COMMENT_ENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocComment"


    // $ANTLR start "entryRuleAnnotationLine"
    // InternalTypescript.g:1404:1: entryRuleAnnotationLine returns [EObject current=null] : iv_ruleAnnotationLine= ruleAnnotationLine EOF ;
    public final EObject entryRuleAnnotationLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationLine = null;


        try {
            // InternalTypescript.g:1404:55: (iv_ruleAnnotationLine= ruleAnnotationLine EOF )
            // InternalTypescript.g:1405:2: iv_ruleAnnotationLine= ruleAnnotationLine EOF
            {
             newCompositeNode(grammarAccess.getAnnotationLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationLine=ruleAnnotationLine();

            state._fsp--;

             current =iv_ruleAnnotationLine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationLine"


    // $ANTLR start "ruleAnnotationLine"
    // InternalTypescript.g:1411:1: ruleAnnotationLine returns [EObject current=null] : (this_DOC_ANNOTATION_PREFIX_0= RULE_DOC_ANNOTATION_PREFIX ( (lv_annotationName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAnnotationLine() throws RecognitionException {
        EObject current = null;

        Token this_DOC_ANNOTATION_PREFIX_0=null;
        Token lv_annotationName_1_0=null;


        	enterRule();

        try {
            // InternalTypescript.g:1417:2: ( (this_DOC_ANNOTATION_PREFIX_0= RULE_DOC_ANNOTATION_PREFIX ( (lv_annotationName_1_0= RULE_ID ) ) ) )
            // InternalTypescript.g:1418:2: (this_DOC_ANNOTATION_PREFIX_0= RULE_DOC_ANNOTATION_PREFIX ( (lv_annotationName_1_0= RULE_ID ) ) )
            {
            // InternalTypescript.g:1418:2: (this_DOC_ANNOTATION_PREFIX_0= RULE_DOC_ANNOTATION_PREFIX ( (lv_annotationName_1_0= RULE_ID ) ) )
            // InternalTypescript.g:1419:3: this_DOC_ANNOTATION_PREFIX_0= RULE_DOC_ANNOTATION_PREFIX ( (lv_annotationName_1_0= RULE_ID ) )
            {
            this_DOC_ANNOTATION_PREFIX_0=(Token)match(input,RULE_DOC_ANNOTATION_PREFIX,FOLLOW_5); 

            			newLeafNode(this_DOC_ANNOTATION_PREFIX_0, grammarAccess.getAnnotationLineAccess().getDOC_ANNOTATION_PREFIXTerminalRuleCall_0());
            		
            // InternalTypescript.g:1423:3: ( (lv_annotationName_1_0= RULE_ID ) )
            // InternalTypescript.g:1424:4: (lv_annotationName_1_0= RULE_ID )
            {
            // InternalTypescript.g:1424:4: (lv_annotationName_1_0= RULE_ID )
            // InternalTypescript.g:1425:5: lv_annotationName_1_0= RULE_ID
            {
            lv_annotationName_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_annotationName_1_0, grammarAccess.getAnnotationLineAccess().getAnnotationNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationLineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"annotationName",
            						lv_annotationName_1_0,
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
    // $ANTLR end "ruleAnnotationLine"


    // $ANTLR start "entryRuleIndexSignature"
    // InternalTypescript.g:1445:1: entryRuleIndexSignature returns [EObject current=null] : iv_ruleIndexSignature= ruleIndexSignature EOF ;
    public final EObject entryRuleIndexSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexSignature = null;


        try {
            // InternalTypescript.g:1445:55: (iv_ruleIndexSignature= ruleIndexSignature EOF )
            // InternalTypescript.g:1446:2: iv_ruleIndexSignature= ruleIndexSignature EOF
            {
             newCompositeNode(grammarAccess.getIndexSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexSignature=ruleIndexSignature();

            state._fsp--;

             current =iv_ruleIndexSignature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexSignature"


    // $ANTLR start "ruleIndexSignature"
    // InternalTypescript.g:1452:1: ruleIndexSignature returns [EObject current=null] : (otherlv_0= '[' this_ID_1= RULE_ID otherlv_2= ':' ( (lv_indexType_3_0= ruleIndexType ) ) otherlv_4= ']' ( (lv_valueType_5_0= ruleType ) ) ) ;
    public final EObject ruleIndexSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_indexType_3_0 = null;

        EObject lv_valueType_5_0 = null;



        	enterRule();

        try {
            // InternalTypescript.g:1458:2: ( (otherlv_0= '[' this_ID_1= RULE_ID otherlv_2= ':' ( (lv_indexType_3_0= ruleIndexType ) ) otherlv_4= ']' ( (lv_valueType_5_0= ruleType ) ) ) )
            // InternalTypescript.g:1459:2: (otherlv_0= '[' this_ID_1= RULE_ID otherlv_2= ':' ( (lv_indexType_3_0= ruleIndexType ) ) otherlv_4= ']' ( (lv_valueType_5_0= ruleType ) ) )
            {
            // InternalTypescript.g:1459:2: (otherlv_0= '[' this_ID_1= RULE_ID otherlv_2= ':' ( (lv_indexType_3_0= ruleIndexType ) ) otherlv_4= ']' ( (lv_valueType_5_0= ruleType ) ) )
            // InternalTypescript.g:1460:3: otherlv_0= '[' this_ID_1= RULE_ID otherlv_2= ':' ( (lv_indexType_3_0= ruleIndexType ) ) otherlv_4= ']' ( (lv_valueType_5_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexSignatureAccess().getLeftSquareBracketKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            			newLeafNode(this_ID_1, grammarAccess.getIndexSignatureAccess().getIDTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexSignatureAccess().getColonKeyword_2());
            		
            // InternalTypescript.g:1472:3: ( (lv_indexType_3_0= ruleIndexType ) )
            // InternalTypescript.g:1473:4: (lv_indexType_3_0= ruleIndexType )
            {
            // InternalTypescript.g:1473:4: (lv_indexType_3_0= ruleIndexType )
            // InternalTypescript.g:1474:5: lv_indexType_3_0= ruleIndexType
            {

            					newCompositeNode(grammarAccess.getIndexSignatureAccess().getIndexTypeIndexTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_indexType_3_0=ruleIndexType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexSignatureRule());
            					}
            					set(
            						current,
            						"indexType",
            						lv_indexType_3_0,
            						"ch.vobos.Typescript.IndexType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexSignatureAccess().getRightSquareBracketKeyword_4());
            		
            // InternalTypescript.g:1495:3: ( (lv_valueType_5_0= ruleType ) )
            // InternalTypescript.g:1496:4: (lv_valueType_5_0= ruleType )
            {
            // InternalTypescript.g:1496:4: (lv_valueType_5_0= ruleType )
            // InternalTypescript.g:1497:5: lv_valueType_5_0= ruleType
            {

            					newCompositeNode(grammarAccess.getIndexSignatureAccess().getValueTypeTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_valueType_5_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexSignatureRule());
            					}
            					set(
            						current,
            						"valueType",
            						lv_valueType_5_0,
            						"ch.vobos.Typescript.Type");
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
    // $ANTLR end "ruleIndexSignature"


    // $ANTLR start "rulePredefinedTypeEnum"
    // InternalTypescript.g:1518:1: rulePredefinedTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'void' ) ) ;
    public final Enumerator rulePredefinedTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalTypescript.g:1524:2: ( ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'void' ) ) )
            // InternalTypescript.g:1525:2: ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'void' ) )
            {
            // InternalTypescript.g:1525:2: ( (enumLiteral_0= 'any' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'void' ) )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt24=1;
                }
                break;
            case 32:
                {
                alt24=2;
                }
                break;
            case 33:
                {
                alt24=3;
                }
                break;
            case 34:
                {
                alt24=4;
                }
                break;
            case 35:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalTypescript.g:1526:3: (enumLiteral_0= 'any' )
                    {
                    // InternalTypescript.g:1526:3: (enumLiteral_0= 'any' )
                    // InternalTypescript.g:1527:4: enumLiteral_0= 'any'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedTypeEnumAccess().getAnyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPredefinedTypeEnumAccess().getAnyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTypescript.g:1534:3: (enumLiteral_1= 'number' )
                    {
                    // InternalTypescript.g:1534:3: (enumLiteral_1= 'number' )
                    // InternalTypescript.g:1535:4: enumLiteral_1= 'number'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedTypeEnumAccess().getNumberEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPredefinedTypeEnumAccess().getNumberEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTypescript.g:1542:3: (enumLiteral_2= 'boolean' )
                    {
                    // InternalTypescript.g:1542:3: (enumLiteral_2= 'boolean' )
                    // InternalTypescript.g:1543:4: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedTypeEnumAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPredefinedTypeEnumAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTypescript.g:1550:3: (enumLiteral_3= 'string' )
                    {
                    // InternalTypescript.g:1550:3: (enumLiteral_3= 'string' )
                    // InternalTypescript.g:1551:4: enumLiteral_3= 'string'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedTypeEnumAccess().getStringEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPredefinedTypeEnumAccess().getStringEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTypescript.g:1558:3: (enumLiteral_4= 'void' )
                    {
                    // InternalTypescript.g:1558:3: (enumLiteral_4= 'void' )
                    // InternalTypescript.g:1559:4: enumLiteral_4= 'void'
                    {
                    enumLiteral_4=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPredefinedTypeEnumAccess().getVoidEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPredefinedTypeEnumAccess().getVoidEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "rulePredefinedTypeEnum"


    // $ANTLR start "ruleIndexType"
    // InternalTypescript.g:1569:1: ruleIndexType returns [Enumerator current=null] : ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'string' ) ) ;
    public final Enumerator ruleIndexType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTypescript.g:1575:2: ( ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'string' ) ) )
            // InternalTypescript.g:1576:2: ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'string' ) )
            {
            // InternalTypescript.g:1576:2: ( (enumLiteral_0= 'number' ) | (enumLiteral_1= 'string' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            else if ( (LA25_0==34) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalTypescript.g:1577:3: (enumLiteral_0= 'number' )
                    {
                    // InternalTypescript.g:1577:3: (enumLiteral_0= 'number' )
                    // InternalTypescript.g:1578:4: enumLiteral_0= 'number'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getIndexTypeAccess().getNumberEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIndexTypeAccess().getNumberEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTypescript.g:1585:3: (enumLiteral_1= 'string' )
                    {
                    // InternalTypescript.g:1585:3: (enumLiteral_1= 'string' )
                    // InternalTypescript.g:1586:4: enumLiteral_1= 'string'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getIndexTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIndexTypeAccess().getStringEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleIndexType"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\1\10\uffff";
    static final String dfa_3s = "\1\20\1\uffff\1\5\2\uffff\1\5\1\4\1\20\1\6";
    static final String dfa_4s = "\1\36\1\uffff\1\7\2\uffff\1\7\1\4\1\27\1\7";
    static final String dfa_5s = "\1\uffff\1\3\1\uffff\1\1\1\2\4\uffff";
    static final String dfa_6s = "\11\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\5\uffff\2\4\6\uffff\1\2",
            "",
            "\1\5\1\7\1\6",
            "",
            "",
            "\1\5\1\7\1\6",
            "\1\10",
            "\1\3\5\uffff\2\4",
            "\1\7\1\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 144:3: ( ( (lv_modules_1_0= ruleModuleDeclaration ) ) | ( (lv_types_2_0= ruleDeclaration ) ) )*";
        }
    }
    static final String dfa_8s = "\1\16\1\5\3\uffff\1\5\1\4\1\20\1\6";
    static final String dfa_9s = "\1\36\1\7\3\uffff\1\7\1\4\1\27\1\7";
    static final String dfa_10s = "\2\uffff\1\1\1\2\1\3\4\uffff";
    static final String[] dfa_11s = {
            "\1\4\1\uffff\1\3\5\uffff\2\2\6\uffff\1\1",
            "\1\5\1\7\1\6",
            "",
            "",
            "",
            "\1\5\1\7\1\6",
            "\1\10",
            "\1\3\5\uffff\2\2",
            "\1\7\1\6"
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_6;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "431:5: (lv_moduleContent_1_1= ruleDeclaration | lv_moduleContent_1_2= ruleModuleDeclaration | lv_moduleContent_1_3= ruleImportDeclaration )";
        }
    }
    static final String dfa_12s = "\16\uffff";
    static final String dfa_13s = "\1\uffff\5\11\1\14\6\uffff\1\14";
    static final String dfa_14s = "\7\4\1\uffff\1\4\1\uffff\2\4\1\uffff\1\4";
    static final String dfa_15s = "\1\43\6\36\1\uffff\1\35\1\uffff\1\4\1\35\1\uffff\1\36";
    static final String dfa_16s = "\7\uffff\1\3\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String dfa_17s = "\16\uffff}>";
    static final String[] dfa_18s = {
            "\1\6\15\uffff\1\7\14\uffff\1\1\1\2\1\3\1\4\1\5",
            "\1\11\16\uffff\1\11\1\uffff\1\11\6\uffff\1\10\1\uffff\1\11",
            "\1\11\16\uffff\1\11\1\uffff\1\11\6\uffff\1\10\1\uffff\1\11",
            "\1\11\16\uffff\1\11\1\uffff\1\11\6\uffff\1\10\1\uffff\1\11",
            "\1\11\16\uffff\1\11\1\uffff\1\11\6\uffff\1\10\1\uffff\1\11",
            "\1\11\16\uffff\1\11\1\uffff\1\11\6\uffff\1\10\1\uffff\1\11",
            "\1\14\14\uffff\1\12\1\uffff\1\14\1\uffff\1\14\6\uffff\1\13\1\uffff\1\14",
            "",
            "\1\11\30\uffff\1\7",
            "",
            "\1\15",
            "\1\14\30\uffff\1\7",
            "",
            "\1\14\14\uffff\1\12\1\uffff\1\14\1\uffff\1\14\6\uffff\1\13\1\uffff\1\14"
    };

    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_12;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1083:2: (this_PredefinedType_0= rulePredefinedType | this_TypeReference_1= ruleTypeReference | this_TypeLiteral_2= ruleTypeLiteral )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040C14000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040C10002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040D94000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040D14002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040C10000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000050080010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000050280010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000050000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000F80040010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000500000000L});

}