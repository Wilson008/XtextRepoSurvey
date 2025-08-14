package workflowdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import workflowdsl.services.WorkflowDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWorkflowDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'workflow definition'", "'{'", "'}'", "'package'", "'class name'", "'event'", "'string based conditional variable'", "'start node'", "'end node'", "'signal'", "'asyncronous task'", "'syncronous task'", "'exclusive diverging'", "'parallel diverging'", "'exclusive converging'", "'parallel converging'", "'connect'", "'task name input'", "'variable based input'", "'map based input'", "'output'", "'conditional connector'", "'test'", "'process variable'", "'fire signal'", "'assertflow'", "'assertWait'", "'.*'", "'.'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWorkflowDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWorkflowDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWorkflowDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWorkflowDsl.g"; }



     	private WorkflowDslGrammarAccess grammarAccess;

        public InternalWorkflowDslParser(TokenStream input, WorkflowDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected WorkflowDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalWorkflowDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalWorkflowDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalWorkflowDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalWorkflowDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_workflowDefinitions_1_0= ruleWorkflowDefinition ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_workflowDefinitions_1_0 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_workflowDefinitions_1_0= ruleWorkflowDefinition ) )+ ) )
            // InternalWorkflowDsl.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_workflowDefinitions_1_0= ruleWorkflowDefinition ) )+ )
            {
            // InternalWorkflowDsl.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )+ ( (lv_workflowDefinitions_1_0= ruleWorkflowDefinition ) )+ )
            // InternalWorkflowDsl.g:79:3: ( (lv_imports_0_0= ruleImport ) )+ ( (lv_workflowDefinitions_1_0= ruleWorkflowDefinition ) )+
            {
            // InternalWorkflowDsl.g:79:3: ( (lv_imports_0_0= ruleImport ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWorkflowDsl.g:80:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalWorkflowDsl.g:80:4: (lv_imports_0_0= ruleImport )
            	    // InternalWorkflowDsl.g:81:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"workflowdsl.WorkflowDsl.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalWorkflowDsl.g:98:3: ( (lv_workflowDefinitions_1_0= ruleWorkflowDefinition ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWorkflowDsl.g:99:4: (lv_workflowDefinitions_1_0= ruleWorkflowDefinition )
            	    {
            	    // InternalWorkflowDsl.g:99:4: (lv_workflowDefinitions_1_0= ruleWorkflowDefinition )
            	    // InternalWorkflowDsl.g:100:5: lv_workflowDefinitions_1_0= ruleWorkflowDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getWorkflowDefinitionsWorkflowDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_workflowDefinitions_1_0=ruleWorkflowDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"workflowDefinitions",
            	    						lv_workflowDefinitions_1_0,
            	    						"workflowdsl.WorkflowDsl.WorkflowDefinition");
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


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleImport"
    // InternalWorkflowDsl.g:121:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalWorkflowDsl.g:121:47: (iv_ruleImport= ruleImport EOF )
            // InternalWorkflowDsl.g:122:2: iv_ruleImport= ruleImport EOF
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
    // InternalWorkflowDsl.g:128:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:134:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // InternalWorkflowDsl.g:135:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // InternalWorkflowDsl.g:135:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // InternalWorkflowDsl.g:136:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalWorkflowDsl.g:140:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // InternalWorkflowDsl.g:141:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // InternalWorkflowDsl.g:141:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // InternalWorkflowDsl.g:142:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
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
            						"workflowdsl.WorkflowDsl.QualifiedNameWithWildCard");
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


    // $ANTLR start "entryRuleWorkflowDefinition"
    // InternalWorkflowDsl.g:163:1: entryRuleWorkflowDefinition returns [EObject current=null] : iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF ;
    public final EObject entryRuleWorkflowDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDefinition = null;


        try {
            // InternalWorkflowDsl.g:163:59: (iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF )
            // InternalWorkflowDsl.g:164:2: iv_ruleWorkflowDefinition= ruleWorkflowDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkflowDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowDefinition=ruleWorkflowDefinition();

            state._fsp--;

             current =iv_ruleWorkflowDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowDefinition"


    // $ANTLR start "ruleWorkflowDefinition"
    // InternalWorkflowDsl.g:170:1: ruleWorkflowDefinition returns [EObject current=null] : (otherlv_0= 'workflow definition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_className_3_0= ruleClassName ) ) ( (lv_packages_4_0= rulePackage ) ) ( (lv_events_5_0= ruleEvent ) )* ( (lv_variables_6_0= ruleVariable ) )* ( (lv_nodes_7_0= ruleNode ) )+ ( (lv_connectors_8_0= ruleConnector ) )+ ( (lv_tests_9_0= ruleTest ) )+ otherlv_10= '}' ) ;
    public final EObject ruleWorkflowDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_10=null;
        EObject lv_className_3_0 = null;

        EObject lv_packages_4_0 = null;

        EObject lv_events_5_0 = null;

        EObject lv_variables_6_0 = null;

        EObject lv_nodes_7_0 = null;

        EObject lv_connectors_8_0 = null;

        EObject lv_tests_9_0 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:176:2: ( (otherlv_0= 'workflow definition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_className_3_0= ruleClassName ) ) ( (lv_packages_4_0= rulePackage ) ) ( (lv_events_5_0= ruleEvent ) )* ( (lv_variables_6_0= ruleVariable ) )* ( (lv_nodes_7_0= ruleNode ) )+ ( (lv_connectors_8_0= ruleConnector ) )+ ( (lv_tests_9_0= ruleTest ) )+ otherlv_10= '}' ) )
            // InternalWorkflowDsl.g:177:2: (otherlv_0= 'workflow definition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_className_3_0= ruleClassName ) ) ( (lv_packages_4_0= rulePackage ) ) ( (lv_events_5_0= ruleEvent ) )* ( (lv_variables_6_0= ruleVariable ) )* ( (lv_nodes_7_0= ruleNode ) )+ ( (lv_connectors_8_0= ruleConnector ) )+ ( (lv_tests_9_0= ruleTest ) )+ otherlv_10= '}' )
            {
            // InternalWorkflowDsl.g:177:2: (otherlv_0= 'workflow definition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_className_3_0= ruleClassName ) ) ( (lv_packages_4_0= rulePackage ) ) ( (lv_events_5_0= ruleEvent ) )* ( (lv_variables_6_0= ruleVariable ) )* ( (lv_nodes_7_0= ruleNode ) )+ ( (lv_connectors_8_0= ruleConnector ) )+ ( (lv_tests_9_0= ruleTest ) )+ otherlv_10= '}' )
            // InternalWorkflowDsl.g:178:3: otherlv_0= 'workflow definition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_className_3_0= ruleClassName ) ) ( (lv_packages_4_0= rulePackage ) ) ( (lv_events_5_0= ruleEvent ) )* ( (lv_variables_6_0= ruleVariable ) )* ( (lv_nodes_7_0= ruleNode ) )+ ( (lv_connectors_8_0= ruleConnector ) )+ ( (lv_tests_9_0= ruleTest ) )+ otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowDefinitionAccess().getWorkflowDefinitionKeyword_0());
            		
            // InternalWorkflowDsl.g:182:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDsl.g:183:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDsl.g:183:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDsl.g:184:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkflowDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkflowDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWorkflowDsl.g:204:3: ( (lv_className_3_0= ruleClassName ) )
            // InternalWorkflowDsl.g:205:4: (lv_className_3_0= ruleClassName )
            {
            // InternalWorkflowDsl.g:205:4: (lv_className_3_0= ruleClassName )
            // InternalWorkflowDsl.g:206:5: lv_className_3_0= ruleClassName
            {

            					newCompositeNode(grammarAccess.getWorkflowDefinitionAccess().getClassNameClassNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_className_3_0=ruleClassName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkflowDefinitionRule());
            					}
            					set(
            						current,
            						"className",
            						lv_className_3_0,
            						"workflowdsl.WorkflowDsl.ClassName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWorkflowDsl.g:223:3: ( (lv_packages_4_0= rulePackage ) )
            // InternalWorkflowDsl.g:224:4: (lv_packages_4_0= rulePackage )
            {
            // InternalWorkflowDsl.g:224:4: (lv_packages_4_0= rulePackage )
            // InternalWorkflowDsl.g:225:5: lv_packages_4_0= rulePackage
            {

            					newCompositeNode(grammarAccess.getWorkflowDefinitionAccess().getPackagesPackageParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_packages_4_0=rulePackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkflowDefinitionRule());
            					}
            					set(
            						current,
            						"packages",
            						lv_packages_4_0,
            						"workflowdsl.WorkflowDsl.Package");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWorkflowDsl.g:242:3: ( (lv_events_5_0= ruleEvent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWorkflowDsl.g:243:4: (lv_events_5_0= ruleEvent )
            	    {
            	    // InternalWorkflowDsl.g:243:4: (lv_events_5_0= ruleEvent )
            	    // InternalWorkflowDsl.g:244:5: lv_events_5_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowDefinitionAccess().getEventsEventParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_events_5_0=ruleEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkflowDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"events",
            	    						lv_events_5_0,
            	    						"workflowdsl.WorkflowDsl.Event");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalWorkflowDsl.g:261:3: ( (lv_variables_6_0= ruleVariable ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWorkflowDsl.g:262:4: (lv_variables_6_0= ruleVariable )
            	    {
            	    // InternalWorkflowDsl.g:262:4: (lv_variables_6_0= ruleVariable )
            	    // InternalWorkflowDsl.g:263:5: lv_variables_6_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowDefinitionAccess().getVariablesVariableParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_variables_6_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkflowDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_6_0,
            	    						"workflowdsl.WorkflowDsl.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalWorkflowDsl.g:280:3: ( (lv_nodes_7_0= ruleNode ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=19 && LA5_0<=27)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWorkflowDsl.g:281:4: (lv_nodes_7_0= ruleNode )
            	    {
            	    // InternalWorkflowDsl.g:281:4: (lv_nodes_7_0= ruleNode )
            	    // InternalWorkflowDsl.g:282:5: lv_nodes_7_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowDefinitionAccess().getNodesNodeParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_nodes_7_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkflowDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_7_0,
            	    						"workflowdsl.WorkflowDsl.Node");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            // InternalWorkflowDsl.g:299:3: ( (lv_connectors_8_0= ruleConnector ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28||LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWorkflowDsl.g:300:4: (lv_connectors_8_0= ruleConnector )
            	    {
            	    // InternalWorkflowDsl.g:300:4: (lv_connectors_8_0= ruleConnector )
            	    // InternalWorkflowDsl.g:301:5: lv_connectors_8_0= ruleConnector
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowDefinitionAccess().getConnectorsConnectorParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_connectors_8_0=ruleConnector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkflowDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connectors",
            	    						lv_connectors_8_0,
            	    						"workflowdsl.WorkflowDsl.Connector");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // InternalWorkflowDsl.g:318:3: ( (lv_tests_9_0= ruleTest ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWorkflowDsl.g:319:4: (lv_tests_9_0= ruleTest )
            	    {
            	    // InternalWorkflowDsl.g:319:4: (lv_tests_9_0= ruleTest )
            	    // InternalWorkflowDsl.g:320:5: lv_tests_9_0= ruleTest
            	    {

            	    					newCompositeNode(grammarAccess.getWorkflowDefinitionAccess().getTestsTestParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_tests_9_0=ruleTest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorkflowDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tests",
            	    						lv_tests_9_0,
            	    						"workflowdsl.WorkflowDsl.Test");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getWorkflowDefinitionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowDefinition"


    // $ANTLR start "entryRulePackage"
    // InternalWorkflowDsl.g:345:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalWorkflowDsl.g:345:48: (iv_rulePackage= rulePackage EOF )
            // InternalWorkflowDsl.g:346:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalWorkflowDsl.g:352:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:358:2: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalWorkflowDsl.g:359:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalWorkflowDsl.g:359:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalWorkflowDsl.g:360:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalWorkflowDsl.g:364:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDsl.g:365:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDsl.g:365:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDsl.g:366:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageRule());
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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleClassName"
    // InternalWorkflowDsl.g:386:1: entryRuleClassName returns [EObject current=null] : iv_ruleClassName= ruleClassName EOF ;
    public final EObject entryRuleClassName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassName = null;


        try {
            // InternalWorkflowDsl.g:386:50: (iv_ruleClassName= ruleClassName EOF )
            // InternalWorkflowDsl.g:387:2: iv_ruleClassName= ruleClassName EOF
            {
             newCompositeNode(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassName=ruleClassName();

            state._fsp--;

             current =iv_ruleClassName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassName"


    // $ANTLR start "ruleClassName"
    // InternalWorkflowDsl.g:393:1: ruleClassName returns [EObject current=null] : (otherlv_0= 'class name' ( (lv_className_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleClassName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_className_1_0=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:399:2: ( (otherlv_0= 'class name' ( (lv_className_1_0= RULE_STRING ) ) ) )
            // InternalWorkflowDsl.g:400:2: (otherlv_0= 'class name' ( (lv_className_1_0= RULE_STRING ) ) )
            {
            // InternalWorkflowDsl.g:400:2: (otherlv_0= 'class name' ( (lv_className_1_0= RULE_STRING ) ) )
            // InternalWorkflowDsl.g:401:3: otherlv_0= 'class name' ( (lv_className_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getClassNameAccess().getClassNameKeyword_0());
            		
            // InternalWorkflowDsl.g:405:3: ( (lv_className_1_0= RULE_STRING ) )
            // InternalWorkflowDsl.g:406:4: (lv_className_1_0= RULE_STRING )
            {
            // InternalWorkflowDsl.g:406:4: (lv_className_1_0= RULE_STRING )
            // InternalWorkflowDsl.g:407:5: lv_className_1_0= RULE_STRING
            {
            lv_className_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_className_1_0, grammarAccess.getClassNameAccess().getClassNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"className",
            						lv_className_1_0,
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
    // $ANTLR end "ruleClassName"


    // $ANTLR start "entryRuleEvent"
    // InternalWorkflowDsl.g:427:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalWorkflowDsl.g:427:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalWorkflowDsl.g:428:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalWorkflowDsl.g:434:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:440:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalWorkflowDsl.g:441:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalWorkflowDsl.g:441:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalWorkflowDsl.g:442:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalWorkflowDsl.g:446:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDsl.g:447:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDsl.g:447:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDsl.g:448:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleVariable"
    // InternalWorkflowDsl.g:468:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalWorkflowDsl.g:468:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalWorkflowDsl.g:469:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalWorkflowDsl.g:475:1: ruleVariable returns [EObject current=null] : this_StringBasedConditionalVaraible_0= ruleStringBasedConditionalVaraible ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_StringBasedConditionalVaraible_0 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:481:2: (this_StringBasedConditionalVaraible_0= ruleStringBasedConditionalVaraible )
            // InternalWorkflowDsl.g:482:2: this_StringBasedConditionalVaraible_0= ruleStringBasedConditionalVaraible
            {

            		newCompositeNode(grammarAccess.getVariableAccess().getStringBasedConditionalVaraibleParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_StringBasedConditionalVaraible_0=ruleStringBasedConditionalVaraible();

            state._fsp--;


            		current = this_StringBasedConditionalVaraible_0;
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleStringBasedConditionalVaraible"
    // InternalWorkflowDsl.g:493:1: entryRuleStringBasedConditionalVaraible returns [EObject current=null] : iv_ruleStringBasedConditionalVaraible= ruleStringBasedConditionalVaraible EOF ;
    public final EObject entryRuleStringBasedConditionalVaraible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringBasedConditionalVaraible = null;


        try {
            // InternalWorkflowDsl.g:493:71: (iv_ruleStringBasedConditionalVaraible= ruleStringBasedConditionalVaraible EOF )
            // InternalWorkflowDsl.g:494:2: iv_ruleStringBasedConditionalVaraible= ruleStringBasedConditionalVaraible EOF
            {
             newCompositeNode(grammarAccess.getStringBasedConditionalVaraibleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringBasedConditionalVaraible=ruleStringBasedConditionalVaraible();

            state._fsp--;

             current =iv_ruleStringBasedConditionalVaraible; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringBasedConditionalVaraible"


    // $ANTLR start "ruleStringBasedConditionalVaraible"
    // InternalWorkflowDsl.g:500:1: ruleStringBasedConditionalVaraible returns [EObject current=null] : (otherlv_0= 'string based conditional variable' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStringBasedConditionalVaraible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:506:2: ( (otherlv_0= 'string based conditional variable' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalWorkflowDsl.g:507:2: (otherlv_0= 'string based conditional variable' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalWorkflowDsl.g:507:2: (otherlv_0= 'string based conditional variable' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalWorkflowDsl.g:508:3: otherlv_0= 'string based conditional variable' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStringBasedConditionalVaraibleAccess().getStringBasedConditionalVariableKeyword_0());
            		
            // InternalWorkflowDsl.g:512:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDsl.g:513:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDsl.g:513:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDsl.g:514:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStringBasedConditionalVaraibleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringBasedConditionalVaraibleRule());
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
    // $ANTLR end "ruleStringBasedConditionalVaraible"


    // $ANTLR start "entryRuleNode"
    // InternalWorkflowDsl.g:534:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalWorkflowDsl.g:534:45: (iv_ruleNode= ruleNode EOF )
            // InternalWorkflowDsl.g:535:2: iv_ruleNode= ruleNode EOF
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
    // InternalWorkflowDsl.g:541:1: ruleNode returns [EObject current=null] : (this_StartNode_0= ruleStartNode | this_EndNode_1= ruleEndNode | this_ServiceTask_2= ruleServiceTask | this_Gateway_3= ruleGateway | this_Signal_4= ruleSignal ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_StartNode_0 = null;

        EObject this_EndNode_1 = null;

        EObject this_ServiceTask_2 = null;

        EObject this_Gateway_3 = null;

        EObject this_Signal_4 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:547:2: ( (this_StartNode_0= ruleStartNode | this_EndNode_1= ruleEndNode | this_ServiceTask_2= ruleServiceTask | this_Gateway_3= ruleGateway | this_Signal_4= ruleSignal ) )
            // InternalWorkflowDsl.g:548:2: (this_StartNode_0= ruleStartNode | this_EndNode_1= ruleEndNode | this_ServiceTask_2= ruleServiceTask | this_Gateway_3= ruleGateway | this_Signal_4= ruleSignal )
            {
            // InternalWorkflowDsl.g:548:2: (this_StartNode_0= ruleStartNode | this_EndNode_1= ruleEndNode | this_ServiceTask_2= ruleServiceTask | this_Gateway_3= ruleGateway | this_Signal_4= ruleSignal )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 22:
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt8=4;
                }
                break;
            case 21:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalWorkflowDsl.g:549:3: this_StartNode_0= ruleStartNode
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getStartNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StartNode_0=ruleStartNode();

                    state._fsp--;


                    			current = this_StartNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWorkflowDsl.g:558:3: this_EndNode_1= ruleEndNode
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getEndNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndNode_1=ruleEndNode();

                    state._fsp--;


                    			current = this_EndNode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalWorkflowDsl.g:567:3: this_ServiceTask_2= ruleServiceTask
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getServiceTaskParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServiceTask_2=ruleServiceTask();

                    state._fsp--;


                    			current = this_ServiceTask_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalWorkflowDsl.g:576:3: this_Gateway_3= ruleGateway
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getGatewayParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Gateway_3=ruleGateway();

                    state._fsp--;


                    			current = this_Gateway_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalWorkflowDsl.g:585:3: this_Signal_4= ruleSignal
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getSignalParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Signal_4=ruleSignal();

                    state._fsp--;


                    			current = this_Signal_4;
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleServiceTask"
    // InternalWorkflowDsl.g:597:1: entryRuleServiceTask returns [EObject current=null] : iv_ruleServiceTask= ruleServiceTask EOF ;
    public final EObject entryRuleServiceTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceTask = null;


        try {
            // InternalWorkflowDsl.g:597:52: (iv_ruleServiceTask= ruleServiceTask EOF )
            // InternalWorkflowDsl.g:598:2: iv_ruleServiceTask= ruleServiceTask EOF
            {
             newCompositeNode(grammarAccess.getServiceTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceTask=ruleServiceTask();

            state._fsp--;

             current =iv_ruleServiceTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceTask"


    // $ANTLR start "ruleServiceTask"
    // InternalWorkflowDsl.g:604:1: ruleServiceTask returns [EObject current=null] : (this_AsyncronousServiceTask_0= ruleAsyncronousServiceTask | this_SyncronousServiceTask_1= ruleSyncronousServiceTask ) ;
    public final EObject ruleServiceTask() throws RecognitionException {
        EObject current = null;

        EObject this_AsyncronousServiceTask_0 = null;

        EObject this_SyncronousServiceTask_1 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:610:2: ( (this_AsyncronousServiceTask_0= ruleAsyncronousServiceTask | this_SyncronousServiceTask_1= ruleSyncronousServiceTask ) )
            // InternalWorkflowDsl.g:611:2: (this_AsyncronousServiceTask_0= ruleAsyncronousServiceTask | this_SyncronousServiceTask_1= ruleSyncronousServiceTask )
            {
            // InternalWorkflowDsl.g:611:2: (this_AsyncronousServiceTask_0= ruleAsyncronousServiceTask | this_SyncronousServiceTask_1= ruleSyncronousServiceTask )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalWorkflowDsl.g:612:3: this_AsyncronousServiceTask_0= ruleAsyncronousServiceTask
                    {

                    			newCompositeNode(grammarAccess.getServiceTaskAccess().getAsyncronousServiceTaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AsyncronousServiceTask_0=ruleAsyncronousServiceTask();

                    state._fsp--;


                    			current = this_AsyncronousServiceTask_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWorkflowDsl.g:621:3: this_SyncronousServiceTask_1= ruleSyncronousServiceTask
                    {

                    			newCompositeNode(grammarAccess.getServiceTaskAccess().getSyncronousServiceTaskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SyncronousServiceTask_1=ruleSyncronousServiceTask();

                    state._fsp--;


                    			current = this_SyncronousServiceTask_1;
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
    // $ANTLR end "ruleServiceTask"


    // $ANTLR start "entryRuleGateway"
    // InternalWorkflowDsl.g:633:1: entryRuleGateway returns [EObject current=null] : iv_ruleGateway= ruleGateway EOF ;
    public final EObject entryRuleGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGateway = null;


        try {
            // InternalWorkflowDsl.g:633:48: (iv_ruleGateway= ruleGateway EOF )
            // InternalWorkflowDsl.g:634:2: iv_ruleGateway= ruleGateway EOF
            {
             newCompositeNode(grammarAccess.getGatewayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGateway=ruleGateway();

            state._fsp--;

             current =iv_ruleGateway; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGateway"


    // $ANTLR start "ruleGateway"
    // InternalWorkflowDsl.g:640:1: ruleGateway returns [EObject current=null] : (this_DivergingGateway_0= ruleDivergingGateway | this_ConvergingGateway_1= ruleConvergingGateway ) ;
    public final EObject ruleGateway() throws RecognitionException {
        EObject current = null;

        EObject this_DivergingGateway_0 = null;

        EObject this_ConvergingGateway_1 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:646:2: ( (this_DivergingGateway_0= ruleDivergingGateway | this_ConvergingGateway_1= ruleConvergingGateway ) )
            // InternalWorkflowDsl.g:647:2: (this_DivergingGateway_0= ruleDivergingGateway | this_ConvergingGateway_1= ruleConvergingGateway )
            {
            // InternalWorkflowDsl.g:647:2: (this_DivergingGateway_0= ruleDivergingGateway | this_ConvergingGateway_1= ruleConvergingGateway )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=24 && LA10_0<=25)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=26 && LA10_0<=27)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalWorkflowDsl.g:648:3: this_DivergingGateway_0= ruleDivergingGateway
                    {

                    			newCompositeNode(grammarAccess.getGatewayAccess().getDivergingGatewayParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DivergingGateway_0=ruleDivergingGateway();

                    state._fsp--;


                    			current = this_DivergingGateway_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWorkflowDsl.g:657:3: this_ConvergingGateway_1= ruleConvergingGateway
                    {

                    			newCompositeNode(grammarAccess.getGatewayAccess().getConvergingGatewayParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConvergingGateway_1=ruleConvergingGateway();

                    state._fsp--;


                    			current = this_ConvergingGateway_1;
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
    // $ANTLR end "ruleGateway"


    // $ANTLR start "entryRuleDivergingGateway"
    // InternalWorkflowDsl.g:669:1: entryRuleDivergingGateway returns [EObject current=null] : iv_ruleDivergingGateway= ruleDivergingGateway EOF ;
    public final EObject entryRuleDivergingGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivergingGateway = null;


        try {
            // InternalWorkflowDsl.g:669:57: (iv_ruleDivergingGateway= ruleDivergingGateway EOF )
            // InternalWorkflowDsl.g:670:2: iv_ruleDivergingGateway= ruleDivergingGateway EOF
            {
             newCompositeNode(grammarAccess.getDivergingGatewayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivergingGateway=ruleDivergingGateway();

            state._fsp--;

             current =iv_ruleDivergingGateway; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivergingGateway"


    // $ANTLR start "ruleDivergingGateway"
    // InternalWorkflowDsl.g:676:1: ruleDivergingGateway returns [EObject current=null] : (this_ExlcusiveDiverging_0= ruleExlcusiveDiverging | this_ParallelDiverging_1= ruleParallelDiverging ) ;
    public final EObject ruleDivergingGateway() throws RecognitionException {
        EObject current = null;

        EObject this_ExlcusiveDiverging_0 = null;

        EObject this_ParallelDiverging_1 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:682:2: ( (this_ExlcusiveDiverging_0= ruleExlcusiveDiverging | this_ParallelDiverging_1= ruleParallelDiverging ) )
            // InternalWorkflowDsl.g:683:2: (this_ExlcusiveDiverging_0= ruleExlcusiveDiverging | this_ParallelDiverging_1= ruleParallelDiverging )
            {
            // InternalWorkflowDsl.g:683:2: (this_ExlcusiveDiverging_0= ruleExlcusiveDiverging | this_ParallelDiverging_1= ruleParallelDiverging )
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
                    // InternalWorkflowDsl.g:684:3: this_ExlcusiveDiverging_0= ruleExlcusiveDiverging
                    {

                    			newCompositeNode(grammarAccess.getDivergingGatewayAccess().getExlcusiveDivergingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExlcusiveDiverging_0=ruleExlcusiveDiverging();

                    state._fsp--;


                    			current = this_ExlcusiveDiverging_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWorkflowDsl.g:693:3: this_ParallelDiverging_1= ruleParallelDiverging
                    {

                    			newCompositeNode(grammarAccess.getDivergingGatewayAccess().getParallelDivergingParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParallelDiverging_1=ruleParallelDiverging();

                    state._fsp--;


                    			current = this_ParallelDiverging_1;
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
    // $ANTLR end "ruleDivergingGateway"


    // $ANTLR start "entryRuleConvergingGateway"
    // InternalWorkflowDsl.g:705:1: entryRuleConvergingGateway returns [EObject current=null] : iv_ruleConvergingGateway= ruleConvergingGateway EOF ;
    public final EObject entryRuleConvergingGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConvergingGateway = null;


        try {
            // InternalWorkflowDsl.g:705:58: (iv_ruleConvergingGateway= ruleConvergingGateway EOF )
            // InternalWorkflowDsl.g:706:2: iv_ruleConvergingGateway= ruleConvergingGateway EOF
            {
             newCompositeNode(grammarAccess.getConvergingGatewayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConvergingGateway=ruleConvergingGateway();

            state._fsp--;

             current =iv_ruleConvergingGateway; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConvergingGateway"


    // $ANTLR start "ruleConvergingGateway"
    // InternalWorkflowDsl.g:712:1: ruleConvergingGateway returns [EObject current=null] : (this_ExclusiveConverging_0= ruleExclusiveConverging | this_ParallelConverging_1= ruleParallelConverging ) ;
    public final EObject ruleConvergingGateway() throws RecognitionException {
        EObject current = null;

        EObject this_ExclusiveConverging_0 = null;

        EObject this_ParallelConverging_1 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:718:2: ( (this_ExclusiveConverging_0= ruleExclusiveConverging | this_ParallelConverging_1= ruleParallelConverging ) )
            // InternalWorkflowDsl.g:719:2: (this_ExclusiveConverging_0= ruleExclusiveConverging | this_ParallelConverging_1= ruleParallelConverging )
            {
            // InternalWorkflowDsl.g:719:2: (this_ExclusiveConverging_0= ruleExclusiveConverging | this_ParallelConverging_1= ruleParallelConverging )
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
                    // InternalWorkflowDsl.g:720:3: this_ExclusiveConverging_0= ruleExclusiveConverging
                    {

                    			newCompositeNode(grammarAccess.getConvergingGatewayAccess().getExclusiveConvergingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExclusiveConverging_0=ruleExclusiveConverging();

                    state._fsp--;


                    			current = this_ExclusiveConverging_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWorkflowDsl.g:729:3: this_ParallelConverging_1= ruleParallelConverging
                    {

                    			newCompositeNode(grammarAccess.getConvergingGatewayAccess().getParallelConvergingParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParallelConverging_1=ruleParallelConverging();

                    state._fsp--;


                    			current = this_ParallelConverging_1;
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
    // $ANTLR end "ruleConvergingGateway"


    // $ANTLR start "entryRuleStartNode"
    // InternalWorkflowDsl.g:741:1: entryRuleStartNode returns [EObject current=null] : iv_ruleStartNode= ruleStartNode EOF ;
    public final EObject entryRuleStartNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartNode = null;


        try {
            // InternalWorkflowDsl.g:741:50: (iv_ruleStartNode= ruleStartNode EOF )
            // InternalWorkflowDsl.g:742:2: iv_ruleStartNode= ruleStartNode EOF
            {
             newCompositeNode(grammarAccess.getStartNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartNode=ruleStartNode();

            state._fsp--;

             current =iv_ruleStartNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStartNode"


    // $ANTLR start "ruleStartNode"
    // InternalWorkflowDsl.g:748:1: ruleStartNode returns [EObject current=null] : (otherlv_0= 'start node' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStartNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:754:2: ( (otherlv_0= 'start node' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalWorkflowDsl.g:755:2: (otherlv_0= 'start node' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalWorkflowDsl.g:755:2: (otherlv_0= 'start node' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalWorkflowDsl.g:756:3: otherlv_0= 'start node' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStartNodeAccess().getStartNodeKeyword_0());
            		
            // InternalWorkflowDsl.g:760:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDsl.g:761:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDsl.g:761:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDsl.g:762:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStartNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartNodeRule());
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
    // $ANTLR end "ruleStartNode"


    // $ANTLR start "entryRuleEndNode"
    // InternalWorkflowDsl.g:782:1: entryRuleEndNode returns [EObject current=null] : iv_ruleEndNode= ruleEndNode EOF ;
    public final EObject entryRuleEndNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndNode = null;


        try {
            // InternalWorkflowDsl.g:782:48: (iv_ruleEndNode= ruleEndNode EOF )
            // InternalWorkflowDsl.g:783:2: iv_ruleEndNode= ruleEndNode EOF
            {
             newCompositeNode(grammarAccess.getEndNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndNode=ruleEndNode();

            state._fsp--;

             current =iv_ruleEndNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndNode"


    // $ANTLR start "ruleEndNode"
    // InternalWorkflowDsl.g:789:1: ruleEndNode returns [EObject current=null] : (otherlv_0= 'end node' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEndNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:795:2: ( (otherlv_0= 'end node' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalWorkflowDsl.g:796:2: (otherlv_0= 'end node' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalWorkflowDsl.g:796:2: (otherlv_0= 'end node' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalWorkflowDsl.g:797:3: otherlv_0= 'end node' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEndNodeAccess().getEndNodeKeyword_0());
            		
            // InternalWorkflowDsl.g:801:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDsl.g:802:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDsl.g:802:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDsl.g:803:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEndNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndNodeRule());
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
    // $ANTLR end "ruleEndNode"


    // $ANTLR start "entryRuleSignal"
    // InternalWorkflowDsl.g:823:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // InternalWorkflowDsl.g:823:47: (iv_ruleSignal= ruleSignal EOF )
            // InternalWorkflowDsl.g:824:2: iv_ruleSignal= ruleSignal EOF
            {
             newCompositeNode(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignal=ruleSignal();

            state._fsp--;

             current =iv_ruleSignal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalWorkflowDsl.g:830:1: ruleSignal returns [EObject current=null] : (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( (lv_output_4_0= ruleOutputData ) )? otherlv_5= '}' ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_output_4_0 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:836:2: ( (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( (lv_output_4_0= ruleOutputData ) )? otherlv_5= '}' ) )
            // InternalWorkflowDsl.g:837:2: (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( (lv_output_4_0= ruleOutputData ) )? otherlv_5= '}' )
            {
            // InternalWorkflowDsl.g:837:2: (otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( (lv_output_4_0= ruleOutputData ) )? otherlv_5= '}' )
            // InternalWorkflowDsl.g:838:3: otherlv_0= 'signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( (lv_output_4_0= ruleOutputData ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSignalAccess().getSignalKeyword_0());
            		
            // InternalWorkflowDsl.g:842:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDsl.g:843:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDsl.g:843:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDsl.g:844:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSignalAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWorkflowDsl.g:864:3: ( (otherlv_3= RULE_ID ) )
            // InternalWorkflowDsl.g:865:4: (otherlv_3= RULE_ID )
            {
            // InternalWorkflowDsl.g:865:4: (otherlv_3= RULE_ID )
            // InternalWorkflowDsl.g:866:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignalRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_3, grammarAccess.getSignalAccess().getEventEventCrossReference_3_0());
            				

            }


            }

            // InternalWorkflowDsl.g:877:3: ( (lv_output_4_0= ruleOutputData ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalWorkflowDsl.g:878:4: (lv_output_4_0= ruleOutputData )
                    {
                    // InternalWorkflowDsl.g:878:4: (lv_output_4_0= ruleOutputData )
                    // InternalWorkflowDsl.g:879:5: lv_output_4_0= ruleOutputData
                    {

                    					newCompositeNode(grammarAccess.getSignalAccess().getOutputOutputDataParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_output_4_0=ruleOutputData();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSignalRule());
                    					}
                    					set(
                    						current,
                    						"output",
                    						lv_output_4_0,
                    						"workflowdsl.WorkflowDsl.OutputData");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSignalAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleAsyncronousServiceTask"
    // InternalWorkflowDsl.g:904:1: entryRuleAsyncronousServiceTask returns [EObject current=null] : iv_ruleAsyncronousServiceTask= ruleAsyncronousServiceTask EOF ;
    public final EObject entryRuleAsyncronousServiceTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsyncronousServiceTask = null;


        try {
            // InternalWorkflowDsl.g:904:63: (iv_ruleAsyncronousServiceTask= ruleAsyncronousServiceTask EOF )
            // InternalWorkflowDsl.g:905:2: iv_ruleAsyncronousServiceTask= ruleAsyncronousServiceTask EOF
            {
             newCompositeNode(grammarAccess.getAsyncronousServiceTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsyncronousServiceTask=ruleAsyncronousServiceTask();

            state._fsp--;

             current =iv_ruleAsyncronousServiceTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsyncronousServiceTask"


    // $ANTLR start "ruleAsyncronousServiceTask"
    // InternalWorkflowDsl.g:911:1: ruleAsyncronousServiceTask returns [EObject current=null] : (otherlv_0= 'asyncronous task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputs_3_0= ruleInputData ) )* ( (lv_output_4_0= ruleOutputData ) )? otherlv_5= '}' ) ;
    public final EObject ruleAsyncronousServiceTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_output_4_0 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:917:2: ( (otherlv_0= 'asyncronous task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputs_3_0= ruleInputData ) )* ( (lv_output_4_0= ruleOutputData ) )? otherlv_5= '}' ) )
            // InternalWorkflowDsl.g:918:2: (otherlv_0= 'asyncronous task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputs_3_0= ruleInputData ) )* ( (lv_output_4_0= ruleOutputData ) )? otherlv_5= '}' )
            {
            // InternalWorkflowDsl.g:918:2: (otherlv_0= 'asyncronous task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputs_3_0= ruleInputData ) )* ( (lv_output_4_0= ruleOutputData ) )? otherlv_5= '}' )
            // InternalWorkflowDsl.g:919:3: otherlv_0= 'asyncronous task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputs_3_0= ruleInputData ) )* ( (lv_output_4_0= ruleOutputData ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAsyncronousServiceTaskAccess().getAsyncronousTaskKeyword_0());
            		
            // InternalWorkflowDsl.g:923:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDsl.g:924:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDsl.g:924:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDsl.g:925:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAsyncronousServiceTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsyncronousServiceTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getAsyncronousServiceTaskAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWorkflowDsl.g:945:3: ( (lv_inputs_3_0= ruleInputData ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=29 && LA14_0<=31)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalWorkflowDsl.g:946:4: (lv_inputs_3_0= ruleInputData )
            	    {
            	    // InternalWorkflowDsl.g:946:4: (lv_inputs_3_0= ruleInputData )
            	    // InternalWorkflowDsl.g:947:5: lv_inputs_3_0= ruleInputData
            	    {

            	    					newCompositeNode(grammarAccess.getAsyncronousServiceTaskAccess().getInputsInputDataParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_inputs_3_0=ruleInputData();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAsyncronousServiceTaskRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inputs",
            	    						lv_inputs_3_0,
            	    						"workflowdsl.WorkflowDsl.InputData");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalWorkflowDsl.g:964:3: ( (lv_output_4_0= ruleOutputData ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalWorkflowDsl.g:965:4: (lv_output_4_0= ruleOutputData )
                    {
                    // InternalWorkflowDsl.g:965:4: (lv_output_4_0= ruleOutputData )
                    // InternalWorkflowDsl.g:966:5: lv_output_4_0= ruleOutputData
                    {

                    					newCompositeNode(grammarAccess.getAsyncronousServiceTaskAccess().getOutputOutputDataParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_output_4_0=ruleOutputData();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAsyncronousServiceTaskRule());
                    					}
                    					set(
                    						current,
                    						"output",
                    						lv_output_4_0,
                    						"workflowdsl.WorkflowDsl.OutputData");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAsyncronousServiceTaskAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsyncronousServiceTask"


    // $ANTLR start "entryRuleSyncronousServiceTask"
    // InternalWorkflowDsl.g:991:1: entryRuleSyncronousServiceTask returns [EObject current=null] : iv_ruleSyncronousServiceTask= ruleSyncronousServiceTask EOF ;
    public final EObject entryRuleSyncronousServiceTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSyncronousServiceTask = null;


        try {
            // InternalWorkflowDsl.g:991:62: (iv_ruleSyncronousServiceTask= ruleSyncronousServiceTask EOF )
            // InternalWorkflowDsl.g:992:2: iv_ruleSyncronousServiceTask= ruleSyncronousServiceTask EOF
            {
             newCompositeNode(grammarAccess.getSyncronousServiceTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSyncronousServiceTask=ruleSyncronousServiceTask();

            state._fsp--;

             current =iv_ruleSyncronousServiceTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSyncronousServiceTask"


    // $ANTLR start "ruleSyncronousServiceTask"
    // InternalWorkflowDsl.g:998:1: ruleSyncronousServiceTask returns [EObject current=null] : (otherlv_0= 'syncronous task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputs_3_0= ruleInputData ) )* ( (lv_output_4_0= ruleOutputData ) )? otherlv_5= '}' ) ;
    public final EObject ruleSyncronousServiceTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_output_4_0 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:1004:2: ( (otherlv_0= 'syncronous task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputs_3_0= ruleInputData ) )* ( (lv_output_4_0= ruleOutputData ) )? otherlv_5= '}' ) )
            // InternalWorkflowDsl.g:1005:2: (otherlv_0= 'syncronous task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputs_3_0= ruleInputData ) )* ( (lv_output_4_0= ruleOutputData ) )? otherlv_5= '}' )
            {
            // InternalWorkflowDsl.g:1005:2: (otherlv_0= 'syncronous task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputs_3_0= ruleInputData ) )* ( (lv_output_4_0= ruleOutputData ) )? otherlv_5= '}' )
            // InternalWorkflowDsl.g:1006:3: otherlv_0= 'syncronous task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputs_3_0= ruleInputData ) )* ( (lv_output_4_0= ruleOutputData ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSyncronousServiceTaskAccess().getSyncronousTaskKeyword_0());
            		
            // InternalWorkflowDsl.g:1010:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDsl.g:1011:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDsl.g:1011:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDsl.g:1012:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSyncronousServiceTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSyncronousServiceTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSyncronousServiceTaskAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWorkflowDsl.g:1032:3: ( (lv_inputs_3_0= ruleInputData ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=29 && LA16_0<=31)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalWorkflowDsl.g:1033:4: (lv_inputs_3_0= ruleInputData )
            	    {
            	    // InternalWorkflowDsl.g:1033:4: (lv_inputs_3_0= ruleInputData )
            	    // InternalWorkflowDsl.g:1034:5: lv_inputs_3_0= ruleInputData
            	    {

            	    					newCompositeNode(grammarAccess.getSyncronousServiceTaskAccess().getInputsInputDataParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_inputs_3_0=ruleInputData();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSyncronousServiceTaskRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inputs",
            	    						lv_inputs_3_0,
            	    						"workflowdsl.WorkflowDsl.InputData");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalWorkflowDsl.g:1051:3: ( (lv_output_4_0= ruleOutputData ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalWorkflowDsl.g:1052:4: (lv_output_4_0= ruleOutputData )
                    {
                    // InternalWorkflowDsl.g:1052:4: (lv_output_4_0= ruleOutputData )
                    // InternalWorkflowDsl.g:1053:5: lv_output_4_0= ruleOutputData
                    {

                    					newCompositeNode(grammarAccess.getSyncronousServiceTaskAccess().getOutputOutputDataParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_output_4_0=ruleOutputData();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSyncronousServiceTaskRule());
                    					}
                    					set(
                    						current,
                    						"output",
                    						lv_output_4_0,
                    						"workflowdsl.WorkflowDsl.OutputData");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSyncronousServiceTaskAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSyncronousServiceTask"


    // $ANTLR start "entryRuleExlcusiveDiverging"
    // InternalWorkflowDsl.g:1078:1: entryRuleExlcusiveDiverging returns [EObject current=null] : iv_ruleExlcusiveDiverging= ruleExlcusiveDiverging EOF ;
    public final EObject entryRuleExlcusiveDiverging() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExlcusiveDiverging = null;


        try {
            // InternalWorkflowDsl.g:1078:59: (iv_ruleExlcusiveDiverging= ruleExlcusiveDiverging EOF )
            // InternalWorkflowDsl.g:1079:2: iv_ruleExlcusiveDiverging= ruleExlcusiveDiverging EOF
            {
             newCompositeNode(grammarAccess.getExlcusiveDivergingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExlcusiveDiverging=ruleExlcusiveDiverging();

            state._fsp--;

             current =iv_ruleExlcusiveDiverging; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExlcusiveDiverging"


    // $ANTLR start "ruleExlcusiveDiverging"
    // InternalWorkflowDsl.g:1085:1: ruleExlcusiveDiverging returns [EObject current=null] : (otherlv_0= 'exclusive diverging' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleExlcusiveDiverging() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:1091:2: ( (otherlv_0= 'exclusive diverging' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalWorkflowDsl.g:1092:2: (otherlv_0= 'exclusive diverging' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalWorkflowDsl.g:1092:2: (otherlv_0= 'exclusive diverging' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalWorkflowDsl.g:1093:3: otherlv_0= 'exclusive diverging' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExlcusiveDivergingAccess().getExclusiveDivergingKeyword_0());
            		
            // InternalWorkflowDsl.g:1097:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDsl.g:1098:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDsl.g:1098:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDsl.g:1099:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExlcusiveDivergingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExlcusiveDivergingRule());
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
    // $ANTLR end "ruleExlcusiveDiverging"


    // $ANTLR start "entryRuleParallelDiverging"
    // InternalWorkflowDsl.g:1119:1: entryRuleParallelDiverging returns [EObject current=null] : iv_ruleParallelDiverging= ruleParallelDiverging EOF ;
    public final EObject entryRuleParallelDiverging() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelDiverging = null;


        try {
            // InternalWorkflowDsl.g:1119:58: (iv_ruleParallelDiverging= ruleParallelDiverging EOF )
            // InternalWorkflowDsl.g:1120:2: iv_ruleParallelDiverging= ruleParallelDiverging EOF
            {
             newCompositeNode(grammarAccess.getParallelDivergingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallelDiverging=ruleParallelDiverging();

            state._fsp--;

             current =iv_ruleParallelDiverging; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallelDiverging"


    // $ANTLR start "ruleParallelDiverging"
    // InternalWorkflowDsl.g:1126:1: ruleParallelDiverging returns [EObject current=null] : (otherlv_0= 'parallel diverging' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParallelDiverging() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:1132:2: ( (otherlv_0= 'parallel diverging' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalWorkflowDsl.g:1133:2: (otherlv_0= 'parallel diverging' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalWorkflowDsl.g:1133:2: (otherlv_0= 'parallel diverging' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalWorkflowDsl.g:1134:3: otherlv_0= 'parallel diverging' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelDivergingAccess().getParallelDivergingKeyword_0());
            		
            // InternalWorkflowDsl.g:1138:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDsl.g:1139:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDsl.g:1139:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDsl.g:1140:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParallelDivergingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParallelDivergingRule());
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
    // $ANTLR end "ruleParallelDiverging"


    // $ANTLR start "entryRuleExclusiveConverging"
    // InternalWorkflowDsl.g:1160:1: entryRuleExclusiveConverging returns [EObject current=null] : iv_ruleExclusiveConverging= ruleExclusiveConverging EOF ;
    public final EObject entryRuleExclusiveConverging() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusiveConverging = null;


        try {
            // InternalWorkflowDsl.g:1160:60: (iv_ruleExclusiveConverging= ruleExclusiveConverging EOF )
            // InternalWorkflowDsl.g:1161:2: iv_ruleExclusiveConverging= ruleExclusiveConverging EOF
            {
             newCompositeNode(grammarAccess.getExclusiveConvergingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExclusiveConverging=ruleExclusiveConverging();

            state._fsp--;

             current =iv_ruleExclusiveConverging; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExclusiveConverging"


    // $ANTLR start "ruleExclusiveConverging"
    // InternalWorkflowDsl.g:1167:1: ruleExclusiveConverging returns [EObject current=null] : (otherlv_0= 'exclusive converging' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleExclusiveConverging() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:1173:2: ( (otherlv_0= 'exclusive converging' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalWorkflowDsl.g:1174:2: (otherlv_0= 'exclusive converging' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalWorkflowDsl.g:1174:2: (otherlv_0= 'exclusive converging' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalWorkflowDsl.g:1175:3: otherlv_0= 'exclusive converging' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExclusiveConvergingAccess().getExclusiveConvergingKeyword_0());
            		
            // InternalWorkflowDsl.g:1179:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDsl.g:1180:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDsl.g:1180:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDsl.g:1181:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExclusiveConvergingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExclusiveConvergingRule());
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
    // $ANTLR end "ruleExclusiveConverging"


    // $ANTLR start "entryRuleParallelConverging"
    // InternalWorkflowDsl.g:1201:1: entryRuleParallelConverging returns [EObject current=null] : iv_ruleParallelConverging= ruleParallelConverging EOF ;
    public final EObject entryRuleParallelConverging() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelConverging = null;


        try {
            // InternalWorkflowDsl.g:1201:59: (iv_ruleParallelConverging= ruleParallelConverging EOF )
            // InternalWorkflowDsl.g:1202:2: iv_ruleParallelConverging= ruleParallelConverging EOF
            {
             newCompositeNode(grammarAccess.getParallelConvergingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallelConverging=ruleParallelConverging();

            state._fsp--;

             current =iv_ruleParallelConverging; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallelConverging"


    // $ANTLR start "ruleParallelConverging"
    // InternalWorkflowDsl.g:1208:1: ruleParallelConverging returns [EObject current=null] : (otherlv_0= 'parallel converging' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParallelConverging() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:1214:2: ( (otherlv_0= 'parallel converging' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalWorkflowDsl.g:1215:2: (otherlv_0= 'parallel converging' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalWorkflowDsl.g:1215:2: (otherlv_0= 'parallel converging' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalWorkflowDsl.g:1216:3: otherlv_0= 'parallel converging' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelConvergingAccess().getParallelConvergingKeyword_0());
            		
            // InternalWorkflowDsl.g:1220:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDsl.g:1221:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDsl.g:1221:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDsl.g:1222:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParallelConvergingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParallelConvergingRule());
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
    // $ANTLR end "ruleParallelConverging"


    // $ANTLR start "entryRuleConnector"
    // InternalWorkflowDsl.g:1242:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalWorkflowDsl.g:1242:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalWorkflowDsl.g:1243:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalWorkflowDsl.g:1249:1: ruleConnector returns [EObject current=null] : (this_BasicConnector_0= ruleBasicConnector | this_ConditionalConnector_1= ruleConditionalConnector ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        EObject this_BasicConnector_0 = null;

        EObject this_ConditionalConnector_1 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:1255:2: ( (this_BasicConnector_0= ruleBasicConnector | this_ConditionalConnector_1= ruleConditionalConnector ) )
            // InternalWorkflowDsl.g:1256:2: (this_BasicConnector_0= ruleBasicConnector | this_ConditionalConnector_1= ruleConditionalConnector )
            {
            // InternalWorkflowDsl.g:1256:2: (this_BasicConnector_0= ruleBasicConnector | this_ConditionalConnector_1= ruleConditionalConnector )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            else if ( (LA18_0==33) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalWorkflowDsl.g:1257:3: this_BasicConnector_0= ruleBasicConnector
                    {

                    			newCompositeNode(grammarAccess.getConnectorAccess().getBasicConnectorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicConnector_0=ruleBasicConnector();

                    state._fsp--;


                    			current = this_BasicConnector_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWorkflowDsl.g:1266:3: this_ConditionalConnector_1= ruleConditionalConnector
                    {

                    			newCompositeNode(grammarAccess.getConnectorAccess().getConditionalConnectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalConnector_1=ruleConditionalConnector();

                    state._fsp--;


                    			current = this_ConditionalConnector_1;
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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleBasicConnector"
    // InternalWorkflowDsl.g:1278:1: entryRuleBasicConnector returns [EObject current=null] : iv_ruleBasicConnector= ruleBasicConnector EOF ;
    public final EObject entryRuleBasicConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicConnector = null;


        try {
            // InternalWorkflowDsl.g:1278:55: (iv_ruleBasicConnector= ruleBasicConnector EOF )
            // InternalWorkflowDsl.g:1279:2: iv_ruleBasicConnector= ruleBasicConnector EOF
            {
             newCompositeNode(grammarAccess.getBasicConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicConnector=ruleBasicConnector();

            state._fsp--;

             current =iv_ruleBasicConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicConnector"


    // $ANTLR start "ruleBasicConnector"
    // InternalWorkflowDsl.g:1285:1: ruleBasicConnector returns [EObject current=null] : (otherlv_0= 'connect' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleBasicConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:1291:2: ( (otherlv_0= 'connect' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalWorkflowDsl.g:1292:2: (otherlv_0= 'connect' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalWorkflowDsl.g:1292:2: (otherlv_0= 'connect' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalWorkflowDsl.g:1293:3: otherlv_0= 'connect' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBasicConnectorAccess().getConnectKeyword_0());
            		
            // InternalWorkflowDsl.g:1297:3: ( (otherlv_1= RULE_ID ) )
            // InternalWorkflowDsl.g:1298:4: (otherlv_1= RULE_ID )
            {
            // InternalWorkflowDsl.g:1298:4: (otherlv_1= RULE_ID )
            // InternalWorkflowDsl.g:1299:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicConnectorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getBasicConnectorAccess().getFromNodeCrossReference_1_0());
            				

            }


            }

            // InternalWorkflowDsl.g:1310:3: ( (otherlv_2= RULE_ID ) )
            // InternalWorkflowDsl.g:1311:4: (otherlv_2= RULE_ID )
            {
            // InternalWorkflowDsl.g:1311:4: (otherlv_2= RULE_ID )
            // InternalWorkflowDsl.g:1312:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicConnectorRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getBasicConnectorAccess().getToNodeCrossReference_2_0());
            				

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
    // $ANTLR end "ruleBasicConnector"


    // $ANTLR start "entryRuleInputData"
    // InternalWorkflowDsl.g:1327:1: entryRuleInputData returns [EObject current=null] : iv_ruleInputData= ruleInputData EOF ;
    public final EObject entryRuleInputData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputData = null;


        try {
            // InternalWorkflowDsl.g:1327:50: (iv_ruleInputData= ruleInputData EOF )
            // InternalWorkflowDsl.g:1328:2: iv_ruleInputData= ruleInputData EOF
            {
             newCompositeNode(grammarAccess.getInputDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputData=ruleInputData();

            state._fsp--;

             current =iv_ruleInputData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputData"


    // $ANTLR start "ruleInputData"
    // InternalWorkflowDsl.g:1334:1: ruleInputData returns [EObject current=null] : (this_TaskNameInput_0= ruleTaskNameInput | this_VariableBasedInput_1= ruleVariableBasedInput | this_EventBasedInput_2= ruleEventBasedInput ) ;
    public final EObject ruleInputData() throws RecognitionException {
        EObject current = null;

        EObject this_TaskNameInput_0 = null;

        EObject this_VariableBasedInput_1 = null;

        EObject this_EventBasedInput_2 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:1340:2: ( (this_TaskNameInput_0= ruleTaskNameInput | this_VariableBasedInput_1= ruleVariableBasedInput | this_EventBasedInput_2= ruleEventBasedInput ) )
            // InternalWorkflowDsl.g:1341:2: (this_TaskNameInput_0= ruleTaskNameInput | this_VariableBasedInput_1= ruleVariableBasedInput | this_EventBasedInput_2= ruleEventBasedInput )
            {
            // InternalWorkflowDsl.g:1341:2: (this_TaskNameInput_0= ruleTaskNameInput | this_VariableBasedInput_1= ruleVariableBasedInput | this_EventBasedInput_2= ruleEventBasedInput )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt19=1;
                }
                break;
            case 30:
                {
                alt19=2;
                }
                break;
            case 31:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalWorkflowDsl.g:1342:3: this_TaskNameInput_0= ruleTaskNameInput
                    {

                    			newCompositeNode(grammarAccess.getInputDataAccess().getTaskNameInputParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskNameInput_0=ruleTaskNameInput();

                    state._fsp--;


                    			current = this_TaskNameInput_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWorkflowDsl.g:1351:3: this_VariableBasedInput_1= ruleVariableBasedInput
                    {

                    			newCompositeNode(grammarAccess.getInputDataAccess().getVariableBasedInputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableBasedInput_1=ruleVariableBasedInput();

                    state._fsp--;


                    			current = this_VariableBasedInput_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalWorkflowDsl.g:1360:3: this_EventBasedInput_2= ruleEventBasedInput
                    {

                    			newCompositeNode(grammarAccess.getInputDataAccess().getEventBasedInputParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EventBasedInput_2=ruleEventBasedInput();

                    state._fsp--;


                    			current = this_EventBasedInput_2;
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
    // $ANTLR end "ruleInputData"


    // $ANTLR start "entryRuleTaskNameInput"
    // InternalWorkflowDsl.g:1372:1: entryRuleTaskNameInput returns [EObject current=null] : iv_ruleTaskNameInput= ruleTaskNameInput EOF ;
    public final EObject entryRuleTaskNameInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskNameInput = null;


        try {
            // InternalWorkflowDsl.g:1372:54: (iv_ruleTaskNameInput= ruleTaskNameInput EOF )
            // InternalWorkflowDsl.g:1373:2: iv_ruleTaskNameInput= ruleTaskNameInput EOF
            {
             newCompositeNode(grammarAccess.getTaskNameInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskNameInput=ruleTaskNameInput();

            state._fsp--;

             current =iv_ruleTaskNameInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskNameInput"


    // $ANTLR start "ruleTaskNameInput"
    // InternalWorkflowDsl.g:1379:1: ruleTaskNameInput returns [EObject current=null] : (otherlv_0= 'task name input' () ) ;
    public final EObject ruleTaskNameInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:1385:2: ( (otherlv_0= 'task name input' () ) )
            // InternalWorkflowDsl.g:1386:2: (otherlv_0= 'task name input' () )
            {
            // InternalWorkflowDsl.g:1386:2: (otherlv_0= 'task name input' () )
            // InternalWorkflowDsl.g:1387:3: otherlv_0= 'task name input' ()
            {
            otherlv_0=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskNameInputAccess().getTaskNameInputKeyword_0());
            		
            // InternalWorkflowDsl.g:1391:3: ()
            // InternalWorkflowDsl.g:1392:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskNameInputAccess().getTaskNameInputAction_1(),
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
    // $ANTLR end "ruleTaskNameInput"


    // $ANTLR start "entryRuleVariableBasedInput"
    // InternalWorkflowDsl.g:1402:1: entryRuleVariableBasedInput returns [EObject current=null] : iv_ruleVariableBasedInput= ruleVariableBasedInput EOF ;
    public final EObject entryRuleVariableBasedInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableBasedInput = null;


        try {
            // InternalWorkflowDsl.g:1402:59: (iv_ruleVariableBasedInput= ruleVariableBasedInput EOF )
            // InternalWorkflowDsl.g:1403:2: iv_ruleVariableBasedInput= ruleVariableBasedInput EOF
            {
             newCompositeNode(grammarAccess.getVariableBasedInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableBasedInput=ruleVariableBasedInput();

            state._fsp--;

             current =iv_ruleVariableBasedInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableBasedInput"


    // $ANTLR start "ruleVariableBasedInput"
    // InternalWorkflowDsl.g:1409:1: ruleVariableBasedInput returns [EObject current=null] : (otherlv_0= 'variable based input' ( (otherlv_1= RULE_ID ) ) ( (lv_eventParameterName_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleVariableBasedInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_eventParameterName_2_0=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:1415:2: ( (otherlv_0= 'variable based input' ( (otherlv_1= RULE_ID ) ) ( (lv_eventParameterName_2_0= RULE_STRING ) ) ) )
            // InternalWorkflowDsl.g:1416:2: (otherlv_0= 'variable based input' ( (otherlv_1= RULE_ID ) ) ( (lv_eventParameterName_2_0= RULE_STRING ) ) )
            {
            // InternalWorkflowDsl.g:1416:2: (otherlv_0= 'variable based input' ( (otherlv_1= RULE_ID ) ) ( (lv_eventParameterName_2_0= RULE_STRING ) ) )
            // InternalWorkflowDsl.g:1417:3: otherlv_0= 'variable based input' ( (otherlv_1= RULE_ID ) ) ( (lv_eventParameterName_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableBasedInputAccess().getVariableBasedInputKeyword_0());
            		
            // InternalWorkflowDsl.g:1421:3: ( (otherlv_1= RULE_ID ) )
            // InternalWorkflowDsl.g:1422:4: (otherlv_1= RULE_ID )
            {
            // InternalWorkflowDsl.g:1422:4: (otherlv_1= RULE_ID )
            // InternalWorkflowDsl.g:1423:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableBasedInputRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getVariableBasedInputAccess().getVariableStringBasedConditionalVaraibleCrossReference_1_0());
            				

            }


            }

            // InternalWorkflowDsl.g:1434:3: ( (lv_eventParameterName_2_0= RULE_STRING ) )
            // InternalWorkflowDsl.g:1435:4: (lv_eventParameterName_2_0= RULE_STRING )
            {
            // InternalWorkflowDsl.g:1435:4: (lv_eventParameterName_2_0= RULE_STRING )
            // InternalWorkflowDsl.g:1436:5: lv_eventParameterName_2_0= RULE_STRING
            {
            lv_eventParameterName_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_eventParameterName_2_0, grammarAccess.getVariableBasedInputAccess().getEventParameterNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableBasedInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"eventParameterName",
            						lv_eventParameterName_2_0,
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
    // $ANTLR end "ruleVariableBasedInput"


    // $ANTLR start "entryRuleEventBasedInput"
    // InternalWorkflowDsl.g:1456:1: entryRuleEventBasedInput returns [EObject current=null] : iv_ruleEventBasedInput= ruleEventBasedInput EOF ;
    public final EObject entryRuleEventBasedInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventBasedInput = null;


        try {
            // InternalWorkflowDsl.g:1456:56: (iv_ruleEventBasedInput= ruleEventBasedInput EOF )
            // InternalWorkflowDsl.g:1457:2: iv_ruleEventBasedInput= ruleEventBasedInput EOF
            {
             newCompositeNode(grammarAccess.getEventBasedInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventBasedInput=ruleEventBasedInput();

            state._fsp--;

             current =iv_ruleEventBasedInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventBasedInput"


    // $ANTLR start "ruleEventBasedInput"
    // InternalWorkflowDsl.g:1463:1: ruleEventBasedInput returns [EObject current=null] : (otherlv_0= 'map based input' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_eventParameterName_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleEventBasedInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_eventParameterName_3_0=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:1469:2: ( (otherlv_0= 'map based input' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_eventParameterName_3_0= RULE_STRING ) ) ) )
            // InternalWorkflowDsl.g:1470:2: (otherlv_0= 'map based input' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_eventParameterName_3_0= RULE_STRING ) ) )
            {
            // InternalWorkflowDsl.g:1470:2: (otherlv_0= 'map based input' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_eventParameterName_3_0= RULE_STRING ) ) )
            // InternalWorkflowDsl.g:1471:3: otherlv_0= 'map based input' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_eventParameterName_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEventBasedInputAccess().getMapBasedInputKeyword_0());
            		
            // InternalWorkflowDsl.g:1475:3: ( (otherlv_1= RULE_ID ) )
            // InternalWorkflowDsl.g:1476:4: (otherlv_1= RULE_ID )
            {
            // InternalWorkflowDsl.g:1476:4: (otherlv_1= RULE_ID )
            // InternalWorkflowDsl.g:1477:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventBasedInputRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getEventBasedInputAccess().getEventEventCrossReference_1_0());
            				

            }


            }

            // InternalWorkflowDsl.g:1488:3: ( (otherlv_2= RULE_ID ) )
            // InternalWorkflowDsl.g:1489:4: (otherlv_2= RULE_ID )
            {
            // InternalWorkflowDsl.g:1489:4: (otherlv_2= RULE_ID )
            // InternalWorkflowDsl.g:1490:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventBasedInputRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getEventBasedInputAccess().getVariableStringBasedConditionalVaraibleCrossReference_2_0());
            				

            }


            }

            // InternalWorkflowDsl.g:1501:3: ( (lv_eventParameterName_3_0= RULE_STRING ) )
            // InternalWorkflowDsl.g:1502:4: (lv_eventParameterName_3_0= RULE_STRING )
            {
            // InternalWorkflowDsl.g:1502:4: (lv_eventParameterName_3_0= RULE_STRING )
            // InternalWorkflowDsl.g:1503:5: lv_eventParameterName_3_0= RULE_STRING
            {
            lv_eventParameterName_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_eventParameterName_3_0, grammarAccess.getEventBasedInputAccess().getEventParameterNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventBasedInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"eventParameterName",
            						lv_eventParameterName_3_0,
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
    // $ANTLR end "ruleEventBasedInput"


    // $ANTLR start "entryRuleOutputData"
    // InternalWorkflowDsl.g:1523:1: entryRuleOutputData returns [EObject current=null] : iv_ruleOutputData= ruleOutputData EOF ;
    public final EObject entryRuleOutputData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputData = null;


        try {
            // InternalWorkflowDsl.g:1523:51: (iv_ruleOutputData= ruleOutputData EOF )
            // InternalWorkflowDsl.g:1524:2: iv_ruleOutputData= ruleOutputData EOF
            {
             newCompositeNode(grammarAccess.getOutputDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputData=ruleOutputData();

            state._fsp--;

             current =iv_ruleOutputData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputData"


    // $ANTLR start "ruleOutputData"
    // InternalWorkflowDsl.g:1530:1: ruleOutputData returns [EObject current=null] : (otherlv_0= 'output' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleOutputData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:1536:2: ( (otherlv_0= 'output' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalWorkflowDsl.g:1537:2: (otherlv_0= 'output' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalWorkflowDsl.g:1537:2: (otherlv_0= 'output' ( (otherlv_1= RULE_ID ) ) )
            // InternalWorkflowDsl.g:1538:3: otherlv_0= 'output' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputDataAccess().getOutputKeyword_0());
            		
            // InternalWorkflowDsl.g:1542:3: ( (otherlv_1= RULE_ID ) )
            // InternalWorkflowDsl.g:1543:4: (otherlv_1= RULE_ID )
            {
            // InternalWorkflowDsl.g:1543:4: (otherlv_1= RULE_ID )
            // InternalWorkflowDsl.g:1544:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputDataRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getOutputDataAccess().getValueStringBasedConditionalVaraibleCrossReference_1_0());
            				

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
    // $ANTLR end "ruleOutputData"


    // $ANTLR start "entryRuleConditionalConnector"
    // InternalWorkflowDsl.g:1559:1: entryRuleConditionalConnector returns [EObject current=null] : iv_ruleConditionalConnector= ruleConditionalConnector EOF ;
    public final EObject entryRuleConditionalConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalConnector = null;


        try {
            // InternalWorkflowDsl.g:1559:61: (iv_ruleConditionalConnector= ruleConditionalConnector EOF )
            // InternalWorkflowDsl.g:1560:2: iv_ruleConditionalConnector= ruleConditionalConnector EOF
            {
             newCompositeNode(grammarAccess.getConditionalConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalConnector=ruleConditionalConnector();

            state._fsp--;

             current =iv_ruleConditionalConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalConnector"


    // $ANTLR start "ruleConditionalConnector"
    // InternalWorkflowDsl.g:1566:1: ruleConditionalConnector returns [EObject current=null] : (otherlv_0= 'conditional connector' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleConditionalConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:1572:2: ( (otherlv_0= 'conditional connector' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // InternalWorkflowDsl.g:1573:2: (otherlv_0= 'conditional connector' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // InternalWorkflowDsl.g:1573:2: (otherlv_0= 'conditional connector' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // InternalWorkflowDsl.g:1574:3: otherlv_0= 'conditional connector' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalConnectorAccess().getConditionalConnectorKeyword_0());
            		
            // InternalWorkflowDsl.g:1578:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDsl.g:1579:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDsl.g:1579:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDsl.g:1580:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConditionalConnectorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalConnectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWorkflowDsl.g:1596:3: ( (otherlv_2= RULE_ID ) )
            // InternalWorkflowDsl.g:1597:4: (otherlv_2= RULE_ID )
            {
            // InternalWorkflowDsl.g:1597:4: (otherlv_2= RULE_ID )
            // InternalWorkflowDsl.g:1598:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalConnectorRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_2, grammarAccess.getConditionalConnectorAccess().getFromNodeCrossReference_2_0());
            				

            }


            }

            // InternalWorkflowDsl.g:1609:3: ( (otherlv_3= RULE_ID ) )
            // InternalWorkflowDsl.g:1610:4: (otherlv_3= RULE_ID )
            {
            // InternalWorkflowDsl.g:1610:4: (otherlv_3= RULE_ID )
            // InternalWorkflowDsl.g:1611:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalConnectorRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getConditionalConnectorAccess().getToNodeCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalConnectorAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalWorkflowDsl.g:1626:3: ( (otherlv_5= RULE_ID ) )
            // InternalWorkflowDsl.g:1627:4: (otherlv_5= RULE_ID )
            {
            // InternalWorkflowDsl.g:1627:4: (otherlv_5= RULE_ID )
            // InternalWorkflowDsl.g:1628:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalConnectorRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_5, grammarAccess.getConditionalConnectorAccess().getEventEventCrossReference_5_0());
            				

            }


            }

            // InternalWorkflowDsl.g:1639:3: ( (otherlv_6= RULE_ID ) )
            // InternalWorkflowDsl.g:1640:4: (otherlv_6= RULE_ID )
            {
            // InternalWorkflowDsl.g:1640:4: (otherlv_6= RULE_ID )
            // InternalWorkflowDsl.g:1641:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalConnectorRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_6, grammarAccess.getConditionalConnectorAccess().getStringBasedConditionalExpressionStringBasedConditionalVaraibleCrossReference_6_0());
            				

            }


            }

            // InternalWorkflowDsl.g:1652:3: ( (lv_value_7_0= RULE_STRING ) )
            // InternalWorkflowDsl.g:1653:4: (lv_value_7_0= RULE_STRING )
            {
            // InternalWorkflowDsl.g:1653:4: (lv_value_7_0= RULE_STRING )
            // InternalWorkflowDsl.g:1654:5: lv_value_7_0= RULE_STRING
            {
            lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_value_7_0, grammarAccess.getConditionalConnectorAccess().getValueSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalConnectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConditionalConnectorAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalConnector"


    // $ANTLR start "entryRuleTest"
    // InternalWorkflowDsl.g:1678:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalWorkflowDsl.g:1678:45: (iv_ruleTest= ruleTest EOF )
            // InternalWorkflowDsl.g:1679:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalWorkflowDsl.g:1685:1: ruleTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processVariables_3_0= ruleProcessVariable ) )* ( (lv_fireSignal_4_0= ruleFireSignal ) )* ( (lv_assertFlow_5_0= ruleAssertFlow ) )* ( (lv_assertWait_6_0= ruleAssertWait ) )* otherlv_7= '}' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_processVariables_3_0 = null;

        EObject lv_fireSignal_4_0 = null;

        EObject lv_assertFlow_5_0 = null;

        EObject lv_assertWait_6_0 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:1691:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processVariables_3_0= ruleProcessVariable ) )* ( (lv_fireSignal_4_0= ruleFireSignal ) )* ( (lv_assertFlow_5_0= ruleAssertFlow ) )* ( (lv_assertWait_6_0= ruleAssertWait ) )* otherlv_7= '}' ) )
            // InternalWorkflowDsl.g:1692:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processVariables_3_0= ruleProcessVariable ) )* ( (lv_fireSignal_4_0= ruleFireSignal ) )* ( (lv_assertFlow_5_0= ruleAssertFlow ) )* ( (lv_assertWait_6_0= ruleAssertWait ) )* otherlv_7= '}' )
            {
            // InternalWorkflowDsl.g:1692:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processVariables_3_0= ruleProcessVariable ) )* ( (lv_fireSignal_4_0= ruleFireSignal ) )* ( (lv_assertFlow_5_0= ruleAssertFlow ) )* ( (lv_assertWait_6_0= ruleAssertWait ) )* otherlv_7= '}' )
            // InternalWorkflowDsl.g:1693:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processVariables_3_0= ruleProcessVariable ) )* ( (lv_fireSignal_4_0= ruleFireSignal ) )* ( (lv_assertFlow_5_0= ruleAssertFlow ) )* ( (lv_assertWait_6_0= ruleAssertWait ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
            		
            // InternalWorkflowDsl.g:1697:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWorkflowDsl.g:1698:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWorkflowDsl.g:1698:4: (lv_name_1_0= RULE_ID )
            // InternalWorkflowDsl.g:1699:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWorkflowDsl.g:1719:3: ( (lv_processVariables_3_0= ruleProcessVariable ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalWorkflowDsl.g:1720:4: (lv_processVariables_3_0= ruleProcessVariable )
            	    {
            	    // InternalWorkflowDsl.g:1720:4: (lv_processVariables_3_0= ruleProcessVariable )
            	    // InternalWorkflowDsl.g:1721:5: lv_processVariables_3_0= ruleProcessVariable
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getProcessVariablesProcessVariableParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_processVariables_3_0=ruleProcessVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processVariables",
            	    						lv_processVariables_3_0,
            	    						"workflowdsl.WorkflowDsl.ProcessVariable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalWorkflowDsl.g:1738:3: ( (lv_fireSignal_4_0= ruleFireSignal ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==36) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalWorkflowDsl.g:1739:4: (lv_fireSignal_4_0= ruleFireSignal )
            	    {
            	    // InternalWorkflowDsl.g:1739:4: (lv_fireSignal_4_0= ruleFireSignal )
            	    // InternalWorkflowDsl.g:1740:5: lv_fireSignal_4_0= ruleFireSignal
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getFireSignalFireSignalParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_fireSignal_4_0=ruleFireSignal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fireSignal",
            	    						lv_fireSignal_4_0,
            	    						"workflowdsl.WorkflowDsl.FireSignal");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalWorkflowDsl.g:1757:3: ( (lv_assertFlow_5_0= ruleAssertFlow ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalWorkflowDsl.g:1758:4: (lv_assertFlow_5_0= ruleAssertFlow )
            	    {
            	    // InternalWorkflowDsl.g:1758:4: (lv_assertFlow_5_0= ruleAssertFlow )
            	    // InternalWorkflowDsl.g:1759:5: lv_assertFlow_5_0= ruleAssertFlow
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getAssertFlowAssertFlowParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_assertFlow_5_0=ruleAssertFlow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assertFlow",
            	    						lv_assertFlow_5_0,
            	    						"workflowdsl.WorkflowDsl.AssertFlow");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalWorkflowDsl.g:1776:3: ( (lv_assertWait_6_0= ruleAssertWait ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalWorkflowDsl.g:1777:4: (lv_assertWait_6_0= ruleAssertWait )
            	    {
            	    // InternalWorkflowDsl.g:1777:4: (lv_assertWait_6_0= ruleAssertWait )
            	    // InternalWorkflowDsl.g:1778:5: lv_assertWait_6_0= ruleAssertWait
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getAssertWaitAssertWaitParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_assertWait_6_0=ruleAssertWait();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assertWait",
            	    						lv_assertWait_6_0,
            	    						"workflowdsl.WorkflowDsl.AssertWait");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleProcessVariable"
    // InternalWorkflowDsl.g:1803:1: entryRuleProcessVariable returns [EObject current=null] : iv_ruleProcessVariable= ruleProcessVariable EOF ;
    public final EObject entryRuleProcessVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessVariable = null;


        try {
            // InternalWorkflowDsl.g:1803:56: (iv_ruleProcessVariable= ruleProcessVariable EOF )
            // InternalWorkflowDsl.g:1804:2: iv_ruleProcessVariable= ruleProcessVariable EOF
            {
             newCompositeNode(grammarAccess.getProcessVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessVariable=ruleProcessVariable();

            state._fsp--;

             current =iv_ruleProcessVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessVariable"


    // $ANTLR start "ruleProcessVariable"
    // InternalWorkflowDsl.g:1810:1: ruleProcessVariable returns [EObject current=null] : (otherlv_0= 'process variable' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleProcessVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:1816:2: ( (otherlv_0= 'process variable' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalWorkflowDsl.g:1817:2: (otherlv_0= 'process variable' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalWorkflowDsl.g:1817:2: (otherlv_0= 'process variable' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalWorkflowDsl.g:1818:3: otherlv_0= 'process variable' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessVariableAccess().getProcessVariableKeyword_0());
            		
            // InternalWorkflowDsl.g:1822:3: ( (otherlv_1= RULE_ID ) )
            // InternalWorkflowDsl.g:1823:4: (otherlv_1= RULE_ID )
            {
            // InternalWorkflowDsl.g:1823:4: (otherlv_1= RULE_ID )
            // InternalWorkflowDsl.g:1824:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessVariableRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getProcessVariableAccess().getVariableStringBasedConditionalVaraibleCrossReference_1_0());
            				

            }


            }

            // InternalWorkflowDsl.g:1835:3: ( (otherlv_2= RULE_ID ) )
            // InternalWorkflowDsl.g:1836:4: (otherlv_2= RULE_ID )
            {
            // InternalWorkflowDsl.g:1836:4: (otherlv_2= RULE_ID )
            // InternalWorkflowDsl.g:1837:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessVariableRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getProcessVariableAccess().getValueConditionalConnectorCrossReference_2_0());
            				

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
    // $ANTLR end "ruleProcessVariable"


    // $ANTLR start "entryRuleFireSignal"
    // InternalWorkflowDsl.g:1852:1: entryRuleFireSignal returns [EObject current=null] : iv_ruleFireSignal= ruleFireSignal EOF ;
    public final EObject entryRuleFireSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFireSignal = null;


        try {
            // InternalWorkflowDsl.g:1852:51: (iv_ruleFireSignal= ruleFireSignal EOF )
            // InternalWorkflowDsl.g:1853:2: iv_ruleFireSignal= ruleFireSignal EOF
            {
             newCompositeNode(grammarAccess.getFireSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFireSignal=ruleFireSignal();

            state._fsp--;

             current =iv_ruleFireSignal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFireSignal"


    // $ANTLR start "ruleFireSignal"
    // InternalWorkflowDsl.g:1859:1: ruleFireSignal returns [EObject current=null] : (otherlv_0= 'fire signal' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )? otherlv_4= '}' ) ;
    public final EObject ruleFireSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:1865:2: ( (otherlv_0= 'fire signal' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )? otherlv_4= '}' ) )
            // InternalWorkflowDsl.g:1866:2: (otherlv_0= 'fire signal' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )? otherlv_4= '}' )
            {
            // InternalWorkflowDsl.g:1866:2: (otherlv_0= 'fire signal' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )? otherlv_4= '}' )
            // InternalWorkflowDsl.g:1867:3: otherlv_0= 'fire signal' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFireSignalAccess().getFireSignalKeyword_0());
            		
            // InternalWorkflowDsl.g:1871:3: ( (otherlv_1= RULE_ID ) )
            // InternalWorkflowDsl.g:1872:4: (otherlv_1= RULE_ID )
            {
            // InternalWorkflowDsl.g:1872:4: (otherlv_1= RULE_ID )
            // InternalWorkflowDsl.g:1873:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFireSignalRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_1, grammarAccess.getFireSignalAccess().getFireSignalSignalCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getFireSignalAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWorkflowDsl.g:1888:3: ( (otherlv_3= RULE_ID ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalWorkflowDsl.g:1889:4: (otherlv_3= RULE_ID )
                    {
                    // InternalWorkflowDsl.g:1889:4: (otherlv_3= RULE_ID )
                    // InternalWorkflowDsl.g:1890:5: otherlv_3= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFireSignalRule());
                    					}
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

                    					newLeafNode(otherlv_3, grammarAccess.getFireSignalAccess().getCaseConditionalConnectorCrossReference_3_0());
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFireSignalAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFireSignal"


    // $ANTLR start "entryRuleAssertFlow"
    // InternalWorkflowDsl.g:1909:1: entryRuleAssertFlow returns [EObject current=null] : iv_ruleAssertFlow= ruleAssertFlow EOF ;
    public final EObject entryRuleAssertFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertFlow = null;


        try {
            // InternalWorkflowDsl.g:1909:51: (iv_ruleAssertFlow= ruleAssertFlow EOF )
            // InternalWorkflowDsl.g:1910:2: iv_ruleAssertFlow= ruleAssertFlow EOF
            {
             newCompositeNode(grammarAccess.getAssertFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertFlow=ruleAssertFlow();

            state._fsp--;

             current =iv_ruleAssertFlow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertFlow"


    // $ANTLR start "ruleAssertFlow"
    // InternalWorkflowDsl.g:1916:1: ruleAssertFlow returns [EObject current=null] : (otherlv_0= 'assertflow' otherlv_1= '{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}' ) ;
    public final EObject ruleAssertFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:1922:2: ( (otherlv_0= 'assertflow' otherlv_1= '{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}' ) )
            // InternalWorkflowDsl.g:1923:2: (otherlv_0= 'assertflow' otherlv_1= '{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}' )
            {
            // InternalWorkflowDsl.g:1923:2: (otherlv_0= 'assertflow' otherlv_1= '{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}' )
            // InternalWorkflowDsl.g:1924:3: otherlv_0= 'assertflow' otherlv_1= '{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertFlowAccess().getAssertflowKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertFlowAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWorkflowDsl.g:1932:3: ( (otherlv_2= RULE_ID ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalWorkflowDsl.g:1933:4: (otherlv_2= RULE_ID )
            	    {
            	    // InternalWorkflowDsl.g:1933:4: (otherlv_2= RULE_ID )
            	    // InternalWorkflowDsl.g:1934:5: otherlv_2= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getAssertFlowRule());
            	    					}
            	    				
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    					newLeafNode(otherlv_2, grammarAccess.getAssertFlowAccess().getNodesNodeCrossReference_2_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAssertFlowAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertFlow"


    // $ANTLR start "entryRuleAssertWait"
    // InternalWorkflowDsl.g:1953:1: entryRuleAssertWait returns [EObject current=null] : iv_ruleAssertWait= ruleAssertWait EOF ;
    public final EObject entryRuleAssertWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertWait = null;


        try {
            // InternalWorkflowDsl.g:1953:51: (iv_ruleAssertWait= ruleAssertWait EOF )
            // InternalWorkflowDsl.g:1954:2: iv_ruleAssertWait= ruleAssertWait EOF
            {
             newCompositeNode(grammarAccess.getAssertWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertWait=ruleAssertWait();

            state._fsp--;

             current =iv_ruleAssertWait; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertWait"


    // $ANTLR start "ruleAssertWait"
    // InternalWorkflowDsl.g:1960:1: ruleAssertWait returns [EObject current=null] : (otherlv_0= 'assertWait' otherlv_1= '{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}' ) ;
    public final EObject ruleAssertWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:1966:2: ( (otherlv_0= 'assertWait' otherlv_1= '{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}' ) )
            // InternalWorkflowDsl.g:1967:2: (otherlv_0= 'assertWait' otherlv_1= '{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}' )
            {
            // InternalWorkflowDsl.g:1967:2: (otherlv_0= 'assertWait' otherlv_1= '{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}' )
            // InternalWorkflowDsl.g:1968:3: otherlv_0= 'assertWait' otherlv_1= '{' ( (otherlv_2= RULE_ID ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertWaitAccess().getAssertWaitKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertWaitAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWorkflowDsl.g:1976:3: ( (otherlv_2= RULE_ID ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalWorkflowDsl.g:1977:4: (otherlv_2= RULE_ID )
            	    {
            	    // InternalWorkflowDsl.g:1977:4: (otherlv_2= RULE_ID )
            	    // InternalWorkflowDsl.g:1978:5: otherlv_2= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getAssertWaitRule());
            	    					}
            	    				
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    					newLeafNode(otherlv_2, grammarAccess.getAssertWaitAccess().getNodesNodeCrossReference_2_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAssertWaitAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertWait"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // InternalWorkflowDsl.g:1997:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // InternalWorkflowDsl.g:1997:65: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // InternalWorkflowDsl.g:1998:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
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
    // InternalWorkflowDsl.g:2004:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalWorkflowDsl.g:2010:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalWorkflowDsl.g:2011:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalWorkflowDsl.g:2011:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalWorkflowDsl.g:2012:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalWorkflowDsl.g:2022:3: (kw= '.*' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalWorkflowDsl.g:2023:4: kw= '.*'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalWorkflowDsl.g:2033:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalWorkflowDsl.g:2033:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalWorkflowDsl.g:2034:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalWorkflowDsl.g:2040:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalWorkflowDsl.g:2046:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalWorkflowDsl.g:2047:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalWorkflowDsl.g:2047:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalWorkflowDsl.g:2048:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalWorkflowDsl.g:2055:3: (kw= '.' this_ID_2= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalWorkflowDsl.g:2056:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,40,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_23); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000FFE0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000021FFE0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000610000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001E0004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000007800004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000006000004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000002L});

}