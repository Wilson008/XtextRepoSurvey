package de.beyondjava.xtext.jsf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.beyondjava.xtext.jsf.services.ComponentLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'attribute_list'", "'{'", "'}'", "'widget'", "'implemented_by '", "'rendered_by '", "'processes_input'", "'extends'", "'has_children'", "'has_tooltip'", "'is_responsive'", "'description'", "'+'", "'default'", "'mandatory'", "'inherited'", "'.'", "'-'", "'String'", "'Boolean'", "'Integer'", "'Float'", "'javax.el.MethodExpression'", "'javax.faces.event.ActionListener'", "'javax.faces.component.UIComponent'", "'javax.el.ValueExpression'", "'javax.faces.event.ValueChangeListener'", "'java.faces.convert.Converter'", "'java.util.List'", "'javax.faces.validator.Validator'", "'TreeNodeEventListener'", "'Map<'", "','", "'>'", "'Drawing'", "'java.lang.Object'", "'ScrollSpyEventListener'", "'Node'"
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


        public InternalComponentLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentLanguage.g"; }



     	private ComponentLanguageGrammarAccess grammarAccess;

        public InternalComponentLanguageParser(TokenStream input, ComponentLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected ComponentLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalComponentLanguage.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalComponentLanguage.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalComponentLanguage.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalComponentLanguage.g:71:1: ruleDomainmodel returns [EObject current=null] : ( ( (lv_elements_0_0= ruleAttributeList ) )* ( (lv_elements_1_0= ruleComponent ) )* ) ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalComponentLanguage.g:77:2: ( ( ( (lv_elements_0_0= ruleAttributeList ) )* ( (lv_elements_1_0= ruleComponent ) )* ) )
            // InternalComponentLanguage.g:78:2: ( ( (lv_elements_0_0= ruleAttributeList ) )* ( (lv_elements_1_0= ruleComponent ) )* )
            {
            // InternalComponentLanguage.g:78:2: ( ( (lv_elements_0_0= ruleAttributeList ) )* ( (lv_elements_1_0= ruleComponent ) )* )
            // InternalComponentLanguage.g:79:3: ( (lv_elements_0_0= ruleAttributeList ) )* ( (lv_elements_1_0= ruleComponent ) )*
            {
            // InternalComponentLanguage.g:79:3: ( (lv_elements_0_0= ruleAttributeList ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalComponentLanguage.g:80:4: (lv_elements_0_0= ruleAttributeList )
            	    {
            	    // InternalComponentLanguage.g:80:4: (lv_elements_0_0= ruleAttributeList )
            	    // InternalComponentLanguage.g:81:5: lv_elements_0_0= ruleAttributeList
            	    {

            	    					newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsAttributeListParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAttributeList();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_0_0,
            	    						"de.beyondjava.xtext.jsf.ComponentLanguage.AttributeList");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalComponentLanguage.g:98:3: ( (lv_elements_1_0= ruleComponent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalComponentLanguage.g:99:4: (lv_elements_1_0= ruleComponent )
            	    {
            	    // InternalComponentLanguage.g:99:4: (lv_elements_1_0= ruleComponent )
            	    // InternalComponentLanguage.g:100:5: lv_elements_1_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsComponentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_elements_1_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"de.beyondjava.xtext.jsf.ComponentLanguage.Component");
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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleAttributeList"
    // InternalComponentLanguage.g:121:1: entryRuleAttributeList returns [EObject current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final EObject entryRuleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeList = null;


        try {
            // InternalComponentLanguage.g:121:54: (iv_ruleAttributeList= ruleAttributeList EOF )
            // InternalComponentLanguage.g:122:2: iv_ruleAttributeList= ruleAttributeList EOF
            {
             newCompositeNode(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeList=ruleAttributeList();

            state._fsp--;

             current =iv_ruleAttributeList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeList"


    // $ANTLR start "ruleAttributeList"
    // InternalComponentLanguage.g:128:1: ruleAttributeList returns [EObject current=null] : (otherlv_0= 'attribute_list' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleAttributeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalComponentLanguage.g:134:2: ( (otherlv_0= 'attribute_list' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalComponentLanguage.g:135:2: (otherlv_0= 'attribute_list' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalComponentLanguage.g:135:2: (otherlv_0= 'attribute_list' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalComponentLanguage.g:136:3: otherlv_0= 'attribute_list' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeListAccess().getAttribute_listKeyword_0());
            		
            // InternalComponentLanguage.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentLanguage.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentLanguage.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalComponentLanguage.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeListAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeListAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentLanguage.g:162:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalComponentLanguage.g:163:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalComponentLanguage.g:163:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalComponentLanguage.g:164:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributeListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"de.beyondjava.xtext.jsf.ComponentLanguage.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeListAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeList"


    // $ANTLR start "entryRuleComponent"
    // InternalComponentLanguage.g:189:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalComponentLanguage.g:189:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalComponentLanguage.g:190:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalComponentLanguage.g:196:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'widget' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'implemented_by ' ( (lv_implementedBy_3_0= ruleQualifiedName ) ) )? (otherlv_4= 'rendered_by ' ( (lv_renderedBy_5_0= ruleQualifiedName ) ) )? ( (lv_processesInput_6_0= 'processes_input' ) )? (otherlv_7= 'extends' ( (lv_extends_8_0= ruleQualifiedName ) ) )? ( (lv_hasChildren_9_0= 'has_children' ) )? ( (lv_hasTooltip_10_0= 'has_tooltip' ) )? ( (lv_isReponsive_11_0= 'is_responsive' ) )? (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )? otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) )* (otherlv_16= '+' ( (lv_attributeLists_17_0= RULE_ID ) ) )* otherlv_18= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_processesInput_6_0=null;
        Token otherlv_7=null;
        Token lv_hasChildren_9_0=null;
        Token lv_hasTooltip_10_0=null;
        Token lv_isReponsive_11_0=null;
        Token otherlv_12=null;
        Token lv_description_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_attributeLists_17_0=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_implementedBy_3_0 = null;

        AntlrDatatypeRuleToken lv_renderedBy_5_0 = null;

        AntlrDatatypeRuleToken lv_extends_8_0 = null;

        EObject lv_attributes_15_0 = null;



        	enterRule();

        try {
            // InternalComponentLanguage.g:202:2: ( (otherlv_0= 'widget' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'implemented_by ' ( (lv_implementedBy_3_0= ruleQualifiedName ) ) )? (otherlv_4= 'rendered_by ' ( (lv_renderedBy_5_0= ruleQualifiedName ) ) )? ( (lv_processesInput_6_0= 'processes_input' ) )? (otherlv_7= 'extends' ( (lv_extends_8_0= ruleQualifiedName ) ) )? ( (lv_hasChildren_9_0= 'has_children' ) )? ( (lv_hasTooltip_10_0= 'has_tooltip' ) )? ( (lv_isReponsive_11_0= 'is_responsive' ) )? (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )? otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) )* (otherlv_16= '+' ( (lv_attributeLists_17_0= RULE_ID ) ) )* otherlv_18= '}' ) )
            // InternalComponentLanguage.g:203:2: (otherlv_0= 'widget' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'implemented_by ' ( (lv_implementedBy_3_0= ruleQualifiedName ) ) )? (otherlv_4= 'rendered_by ' ( (lv_renderedBy_5_0= ruleQualifiedName ) ) )? ( (lv_processesInput_6_0= 'processes_input' ) )? (otherlv_7= 'extends' ( (lv_extends_8_0= ruleQualifiedName ) ) )? ( (lv_hasChildren_9_0= 'has_children' ) )? ( (lv_hasTooltip_10_0= 'has_tooltip' ) )? ( (lv_isReponsive_11_0= 'is_responsive' ) )? (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )? otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) )* (otherlv_16= '+' ( (lv_attributeLists_17_0= RULE_ID ) ) )* otherlv_18= '}' )
            {
            // InternalComponentLanguage.g:203:2: (otherlv_0= 'widget' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'implemented_by ' ( (lv_implementedBy_3_0= ruleQualifiedName ) ) )? (otherlv_4= 'rendered_by ' ( (lv_renderedBy_5_0= ruleQualifiedName ) ) )? ( (lv_processesInput_6_0= 'processes_input' ) )? (otherlv_7= 'extends' ( (lv_extends_8_0= ruleQualifiedName ) ) )? ( (lv_hasChildren_9_0= 'has_children' ) )? ( (lv_hasTooltip_10_0= 'has_tooltip' ) )? ( (lv_isReponsive_11_0= 'is_responsive' ) )? (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )? otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) )* (otherlv_16= '+' ( (lv_attributeLists_17_0= RULE_ID ) ) )* otherlv_18= '}' )
            // InternalComponentLanguage.g:204:3: otherlv_0= 'widget' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'implemented_by ' ( (lv_implementedBy_3_0= ruleQualifiedName ) ) )? (otherlv_4= 'rendered_by ' ( (lv_renderedBy_5_0= ruleQualifiedName ) ) )? ( (lv_processesInput_6_0= 'processes_input' ) )? (otherlv_7= 'extends' ( (lv_extends_8_0= ruleQualifiedName ) ) )? ( (lv_hasChildren_9_0= 'has_children' ) )? ( (lv_hasTooltip_10_0= 'has_tooltip' ) )? ( (lv_isReponsive_11_0= 'is_responsive' ) )? (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )? otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) )* (otherlv_16= '+' ( (lv_attributeLists_17_0= RULE_ID ) ) )* otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getWidgetKeyword_0());
            		
            // InternalComponentLanguage.g:208:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentLanguage.g:209:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentLanguage.g:209:4: (lv_name_1_0= RULE_ID )
            // InternalComponentLanguage.g:210:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalComponentLanguage.g:226:3: (otherlv_2= 'implemented_by ' ( (lv_implementedBy_3_0= ruleQualifiedName ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentLanguage.g:227:4: otherlv_2= 'implemented_by ' ( (lv_implementedBy_3_0= ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getImplemented_byKeyword_2_0());
                    			
                    // InternalComponentLanguage.g:231:4: ( (lv_implementedBy_3_0= ruleQualifiedName ) )
                    // InternalComponentLanguage.g:232:5: (lv_implementedBy_3_0= ruleQualifiedName )
                    {
                    // InternalComponentLanguage.g:232:5: (lv_implementedBy_3_0= ruleQualifiedName )
                    // InternalComponentLanguage.g:233:6: lv_implementedBy_3_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getImplementedByQualifiedNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_implementedBy_3_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"implementedBy",
                    							lv_implementedBy_3_0,
                    							"de.beyondjava.xtext.jsf.ComponentLanguage.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentLanguage.g:251:3: (otherlv_4= 'rendered_by ' ( (lv_renderedBy_5_0= ruleQualifiedName ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentLanguage.g:252:4: otherlv_4= 'rendered_by ' ( (lv_renderedBy_5_0= ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getRendered_byKeyword_3_0());
                    			
                    // InternalComponentLanguage.g:256:4: ( (lv_renderedBy_5_0= ruleQualifiedName ) )
                    // InternalComponentLanguage.g:257:5: (lv_renderedBy_5_0= ruleQualifiedName )
                    {
                    // InternalComponentLanguage.g:257:5: (lv_renderedBy_5_0= ruleQualifiedName )
                    // InternalComponentLanguage.g:258:6: lv_renderedBy_5_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getRenderedByQualifiedNameParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_renderedBy_5_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"renderedBy",
                    							lv_renderedBy_5_0,
                    							"de.beyondjava.xtext.jsf.ComponentLanguage.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentLanguage.g:276:3: ( (lv_processesInput_6_0= 'processes_input' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentLanguage.g:277:4: (lv_processesInput_6_0= 'processes_input' )
                    {
                    // InternalComponentLanguage.g:277:4: (lv_processesInput_6_0= 'processes_input' )
                    // InternalComponentLanguage.g:278:5: lv_processesInput_6_0= 'processes_input'
                    {
                    lv_processesInput_6_0=(Token)match(input,17,FOLLOW_11); 

                    					newLeafNode(lv_processesInput_6_0, grammarAccess.getComponentAccess().getProcessesInputProcesses_inputKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComponentRule());
                    					}
                    					setWithLastConsumed(current, "processesInput", lv_processesInput_6_0, "processes_input");
                    				

                    }


                    }
                    break;

            }

            // InternalComponentLanguage.g:290:3: (otherlv_7= 'extends' ( (lv_extends_8_0= ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentLanguage.g:291:4: otherlv_7= 'extends' ( (lv_extends_8_0= ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getExtendsKeyword_5_0());
                    			
                    // InternalComponentLanguage.g:295:4: ( (lv_extends_8_0= ruleQualifiedName ) )
                    // InternalComponentLanguage.g:296:5: (lv_extends_8_0= ruleQualifiedName )
                    {
                    // InternalComponentLanguage.g:296:5: (lv_extends_8_0= ruleQualifiedName )
                    // InternalComponentLanguage.g:297:6: lv_extends_8_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getExtendsQualifiedNameParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_extends_8_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						set(
                    							current,
                    							"extends",
                    							lv_extends_8_0,
                    							"de.beyondjava.xtext.jsf.ComponentLanguage.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentLanguage.g:315:3: ( (lv_hasChildren_9_0= 'has_children' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentLanguage.g:316:4: (lv_hasChildren_9_0= 'has_children' )
                    {
                    // InternalComponentLanguage.g:316:4: (lv_hasChildren_9_0= 'has_children' )
                    // InternalComponentLanguage.g:317:5: lv_hasChildren_9_0= 'has_children'
                    {
                    lv_hasChildren_9_0=(Token)match(input,19,FOLLOW_13); 

                    					newLeafNode(lv_hasChildren_9_0, grammarAccess.getComponentAccess().getHasChildrenHas_childrenKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComponentRule());
                    					}
                    					setWithLastConsumed(current, "hasChildren", lv_hasChildren_9_0, "has_children");
                    				

                    }


                    }
                    break;

            }

            // InternalComponentLanguage.g:329:3: ( (lv_hasTooltip_10_0= 'has_tooltip' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentLanguage.g:330:4: (lv_hasTooltip_10_0= 'has_tooltip' )
                    {
                    // InternalComponentLanguage.g:330:4: (lv_hasTooltip_10_0= 'has_tooltip' )
                    // InternalComponentLanguage.g:331:5: lv_hasTooltip_10_0= 'has_tooltip'
                    {
                    lv_hasTooltip_10_0=(Token)match(input,20,FOLLOW_14); 

                    					newLeafNode(lv_hasTooltip_10_0, grammarAccess.getComponentAccess().getHasTooltipHas_tooltipKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComponentRule());
                    					}
                    					setWithLastConsumed(current, "hasTooltip", lv_hasTooltip_10_0, "has_tooltip");
                    				

                    }


                    }
                    break;

            }

            // InternalComponentLanguage.g:343:3: ( (lv_isReponsive_11_0= 'is_responsive' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentLanguage.g:344:4: (lv_isReponsive_11_0= 'is_responsive' )
                    {
                    // InternalComponentLanguage.g:344:4: (lv_isReponsive_11_0= 'is_responsive' )
                    // InternalComponentLanguage.g:345:5: lv_isReponsive_11_0= 'is_responsive'
                    {
                    lv_isReponsive_11_0=(Token)match(input,21,FOLLOW_15); 

                    					newLeafNode(lv_isReponsive_11_0, grammarAccess.getComponentAccess().getIsReponsiveIs_responsiveKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComponentRule());
                    					}
                    					setWithLastConsumed(current, "isReponsive", lv_isReponsive_11_0, "is_responsive");
                    				

                    }


                    }
                    break;

            }

            // InternalComponentLanguage.g:357:3: (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentLanguage.g:358:4: otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getDescriptionKeyword_9_0());
                    			
                    // InternalComponentLanguage.g:362:4: ( (lv_description_13_0= RULE_STRING ) )
                    // InternalComponentLanguage.g:363:5: (lv_description_13_0= RULE_STRING )
                    {
                    // InternalComponentLanguage.g:363:5: (lv_description_13_0= RULE_STRING )
                    // InternalComponentLanguage.g:364:6: lv_description_13_0= RULE_STRING
                    {
                    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_description_13_0, grammarAccess.getComponentAccess().getDescriptionSTRINGTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_14, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalComponentLanguage.g:385:3: ( (lv_attributes_15_0= ruleAttribute ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComponentLanguage.g:386:4: (lv_attributes_15_0= ruleAttribute )
            	    {
            	    // InternalComponentLanguage.g:386:4: (lv_attributes_15_0= ruleAttribute )
            	    // InternalComponentLanguage.g:387:5: lv_attributes_15_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getAttributesAttributeParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_attributes_15_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_15_0,
            	    						"de.beyondjava.xtext.jsf.ComponentLanguage.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalComponentLanguage.g:404:3: (otherlv_16= '+' ( (lv_attributeLists_17_0= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalComponentLanguage.g:405:4: otherlv_16= '+' ( (lv_attributeLists_17_0= RULE_ID ) )
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_5); 

            	    				newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getPlusSignKeyword_12_0());
            	    			
            	    // InternalComponentLanguage.g:409:4: ( (lv_attributeLists_17_0= RULE_ID ) )
            	    // InternalComponentLanguage.g:410:5: (lv_attributeLists_17_0= RULE_ID )
            	    {
            	    // InternalComponentLanguage.g:410:5: (lv_attributeLists_17_0= RULE_ID )
            	    // InternalComponentLanguage.g:411:6: lv_attributeLists_17_0= RULE_ID
            	    {
            	    lv_attributeLists_17_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    						newLeafNode(lv_attributeLists_17_0, grammarAccess.getComponentAccess().getAttributeListsIDTerminalRuleCall_12_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getComponentRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"attributeLists",
            	    							lv_attributeLists_17_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_18=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAttribute"
    // InternalComponentLanguage.g:436:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalComponentLanguage.g:436:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalComponentLanguage.g:437:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalComponentLanguage.g:443:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleCSSID ) ) ( (lv_type_1_0= ruleAttributetype ) )? (otherlv_2= 'default' ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ( (lv_required_4_0= 'mandatory' ) )? ( (lv_inherited_5_0= 'inherited' ) )? ( (lv_desc_6_0= RULE_STRING ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_defaultValue_3_0=null;
        Token lv_required_4_0=null;
        Token lv_inherited_5_0=null;
        Token lv_desc_6_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalComponentLanguage.g:449:2: ( ( ( (lv_name_0_0= ruleCSSID ) ) ( (lv_type_1_0= ruleAttributetype ) )? (otherlv_2= 'default' ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ( (lv_required_4_0= 'mandatory' ) )? ( (lv_inherited_5_0= 'inherited' ) )? ( (lv_desc_6_0= RULE_STRING ) )? ) )
            // InternalComponentLanguage.g:450:2: ( ( (lv_name_0_0= ruleCSSID ) ) ( (lv_type_1_0= ruleAttributetype ) )? (otherlv_2= 'default' ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ( (lv_required_4_0= 'mandatory' ) )? ( (lv_inherited_5_0= 'inherited' ) )? ( (lv_desc_6_0= RULE_STRING ) )? )
            {
            // InternalComponentLanguage.g:450:2: ( ( (lv_name_0_0= ruleCSSID ) ) ( (lv_type_1_0= ruleAttributetype ) )? (otherlv_2= 'default' ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ( (lv_required_4_0= 'mandatory' ) )? ( (lv_inherited_5_0= 'inherited' ) )? ( (lv_desc_6_0= RULE_STRING ) )? )
            // InternalComponentLanguage.g:451:3: ( (lv_name_0_0= ruleCSSID ) ) ( (lv_type_1_0= ruleAttributetype ) )? (otherlv_2= 'default' ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ( (lv_required_4_0= 'mandatory' ) )? ( (lv_inherited_5_0= 'inherited' ) )? ( (lv_desc_6_0= RULE_STRING ) )?
            {
            // InternalComponentLanguage.g:451:3: ( (lv_name_0_0= ruleCSSID ) )
            // InternalComponentLanguage.g:452:4: (lv_name_0_0= ruleCSSID )
            {
            // InternalComponentLanguage.g:452:4: (lv_name_0_0= ruleCSSID )
            // InternalComponentLanguage.g:453:5: lv_name_0_0= ruleCSSID
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameCSSIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_name_0_0=ruleCSSID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.beyondjava.xtext.jsf.ComponentLanguage.CSSID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentLanguage.g:470:3: ( (lv_type_1_0= ruleAttributetype ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=29 && LA14_0<=42)||(LA14_0>=45 && LA14_0<=48)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentLanguage.g:471:4: (lv_type_1_0= ruleAttributetype )
                    {
                    // InternalComponentLanguage.g:471:4: (lv_type_1_0= ruleAttributetype )
                    // InternalComponentLanguage.g:472:5: lv_type_1_0= ruleAttributetype
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributetypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_type_1_0=ruleAttributetype();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_1_0,
                    						"de.beyondjava.xtext.jsf.ComponentLanguage.Attributetype");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalComponentLanguage.g:489:3: (otherlv_2= 'default' ( (lv_defaultValue_3_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentLanguage.g:490:4: otherlv_2= 'default' ( (lv_defaultValue_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalComponentLanguage.g:494:4: ( (lv_defaultValue_3_0= RULE_STRING ) )
                    // InternalComponentLanguage.g:495:5: (lv_defaultValue_3_0= RULE_STRING )
                    {
                    // InternalComponentLanguage.g:495:5: (lv_defaultValue_3_0= RULE_STRING )
                    // InternalComponentLanguage.g:496:6: lv_defaultValue_3_0= RULE_STRING
                    {
                    lv_defaultValue_3_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_defaultValue_3_0, grammarAccess.getAttributeAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
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

            // InternalComponentLanguage.g:513:3: ( (lv_required_4_0= 'mandatory' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentLanguage.g:514:4: (lv_required_4_0= 'mandatory' )
                    {
                    // InternalComponentLanguage.g:514:4: (lv_required_4_0= 'mandatory' )
                    // InternalComponentLanguage.g:515:5: lv_required_4_0= 'mandatory'
                    {
                    lv_required_4_0=(Token)match(input,25,FOLLOW_22); 

                    					newLeafNode(lv_required_4_0, grammarAccess.getAttributeAccess().getRequiredMandatoryKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "required", lv_required_4_0, "mandatory");
                    				

                    }


                    }
                    break;

            }

            // InternalComponentLanguage.g:527:3: ( (lv_inherited_5_0= 'inherited' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentLanguage.g:528:4: (lv_inherited_5_0= 'inherited' )
                    {
                    // InternalComponentLanguage.g:528:4: (lv_inherited_5_0= 'inherited' )
                    // InternalComponentLanguage.g:529:5: lv_inherited_5_0= 'inherited'
                    {
                    lv_inherited_5_0=(Token)match(input,26,FOLLOW_23); 

                    					newLeafNode(lv_inherited_5_0, grammarAccess.getAttributeAccess().getInheritedInheritedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "inherited", lv_inherited_5_0, "inherited");
                    				

                    }


                    }
                    break;

            }

            // InternalComponentLanguage.g:541:3: ( (lv_desc_6_0= RULE_STRING ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentLanguage.g:542:4: (lv_desc_6_0= RULE_STRING )
                    {
                    // InternalComponentLanguage.g:542:4: (lv_desc_6_0= RULE_STRING )
                    // InternalComponentLanguage.g:543:5: lv_desc_6_0= RULE_STRING
                    {
                    lv_desc_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_desc_6_0, grammarAccess.getAttributeAccess().getDescSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"desc",
                    						lv_desc_6_0,
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalComponentLanguage.g:563:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalComponentLanguage.g:563:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalComponentLanguage.g:564:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalComponentLanguage.g:570:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComponentLanguage.g:576:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalComponentLanguage.g:577:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalComponentLanguage.g:577:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalComponentLanguage.g:578:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalComponentLanguage.g:585:3: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalComponentLanguage.g:586:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
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


    // $ANTLR start "entryRuleCSSID"
    // InternalComponentLanguage.g:603:1: entryRuleCSSID returns [String current=null] : iv_ruleCSSID= ruleCSSID EOF ;
    public final String entryRuleCSSID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCSSID = null;


        try {
            // InternalComponentLanguage.g:603:45: (iv_ruleCSSID= ruleCSSID EOF )
            // InternalComponentLanguage.g:604:2: iv_ruleCSSID= ruleCSSID EOF
            {
             newCompositeNode(grammarAccess.getCSSIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCSSID=ruleCSSID();

            state._fsp--;

             current =iv_ruleCSSID.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSSID"


    // $ANTLR start "ruleCSSID"
    // InternalComponentLanguage.g:610:1: ruleCSSID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleCSSID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComponentLanguage.g:616:2: ( (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* ) )
            // InternalComponentLanguage.g:617:2: (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* )
            {
            // InternalComponentLanguage.g:617:2: (this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )* )
            // InternalComponentLanguage.g:618:3: this_ID_0= RULE_ID (kw= '-' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getCSSIDAccess().getIDTerminalRuleCall_0());
            		
            // InternalComponentLanguage.g:625:3: (kw= '-' this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalComponentLanguage.g:626:4: kw= '-' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getCSSIDAccess().getHyphenMinusKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getCSSIDAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleCSSID"


    // $ANTLR start "entryRuleAttributetype"
    // InternalComponentLanguage.g:643:1: entryRuleAttributetype returns [String current=null] : iv_ruleAttributetype= ruleAttributetype EOF ;
    public final String entryRuleAttributetype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributetype = null;


        try {
            // InternalComponentLanguage.g:643:53: (iv_ruleAttributetype= ruleAttributetype EOF )
            // InternalComponentLanguage.g:644:2: iv_ruleAttributetype= ruleAttributetype EOF
            {
             newCompositeNode(grammarAccess.getAttributetypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributetype=ruleAttributetype();

            state._fsp--;

             current =iv_ruleAttributetype.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributetype"


    // $ANTLR start "ruleAttributetype"
    // InternalComponentLanguage.g:650:1: ruleAttributetype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Boolean' | kw= 'Integer' | kw= 'Float' | kw= 'javax.el.MethodExpression' | kw= 'javax.faces.event.ActionListener' | kw= 'javax.faces.component.UIComponent' | kw= 'javax.el.ValueExpression' | kw= 'javax.faces.event.ValueChangeListener' | kw= 'java.faces.convert.Converter' | kw= 'java.util.List' | kw= 'javax.faces.validator.Validator' | kw= 'TreeNodeEventListener' | (kw= 'Map<' this_QualifiedName_14= ruleQualifiedName kw= ',' this_QualifiedName_16= ruleQualifiedName kw= '>' ) | kw= 'Drawing' | kw= 'java.lang.Object' | kw= 'ScrollSpyEventListener' | kw= 'Node' ) ;
    public final AntlrDatatypeRuleToken ruleAttributetype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_14 = null;

        AntlrDatatypeRuleToken this_QualifiedName_16 = null;



        	enterRule();

        try {
            // InternalComponentLanguage.g:656:2: ( (kw= 'String' | kw= 'Boolean' | kw= 'Integer' | kw= 'Float' | kw= 'javax.el.MethodExpression' | kw= 'javax.faces.event.ActionListener' | kw= 'javax.faces.component.UIComponent' | kw= 'javax.el.ValueExpression' | kw= 'javax.faces.event.ValueChangeListener' | kw= 'java.faces.convert.Converter' | kw= 'java.util.List' | kw= 'javax.faces.validator.Validator' | kw= 'TreeNodeEventListener' | (kw= 'Map<' this_QualifiedName_14= ruleQualifiedName kw= ',' this_QualifiedName_16= ruleQualifiedName kw= '>' ) | kw= 'Drawing' | kw= 'java.lang.Object' | kw= 'ScrollSpyEventListener' | kw= 'Node' ) )
            // InternalComponentLanguage.g:657:2: (kw= 'String' | kw= 'Boolean' | kw= 'Integer' | kw= 'Float' | kw= 'javax.el.MethodExpression' | kw= 'javax.faces.event.ActionListener' | kw= 'javax.faces.component.UIComponent' | kw= 'javax.el.ValueExpression' | kw= 'javax.faces.event.ValueChangeListener' | kw= 'java.faces.convert.Converter' | kw= 'java.util.List' | kw= 'javax.faces.validator.Validator' | kw= 'TreeNodeEventListener' | (kw= 'Map<' this_QualifiedName_14= ruleQualifiedName kw= ',' this_QualifiedName_16= ruleQualifiedName kw= '>' ) | kw= 'Drawing' | kw= 'java.lang.Object' | kw= 'ScrollSpyEventListener' | kw= 'Node' )
            {
            // InternalComponentLanguage.g:657:2: (kw= 'String' | kw= 'Boolean' | kw= 'Integer' | kw= 'Float' | kw= 'javax.el.MethodExpression' | kw= 'javax.faces.event.ActionListener' | kw= 'javax.faces.component.UIComponent' | kw= 'javax.el.ValueExpression' | kw= 'javax.faces.event.ValueChangeListener' | kw= 'java.faces.convert.Converter' | kw= 'java.util.List' | kw= 'javax.faces.validator.Validator' | kw= 'TreeNodeEventListener' | (kw= 'Map<' this_QualifiedName_14= ruleQualifiedName kw= ',' this_QualifiedName_16= ruleQualifiedName kw= '>' ) | kw= 'Drawing' | kw= 'java.lang.Object' | kw= 'ScrollSpyEventListener' | kw= 'Node' )
            int alt21=18;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt21=1;
                }
                break;
            case 30:
                {
                alt21=2;
                }
                break;
            case 31:
                {
                alt21=3;
                }
                break;
            case 32:
                {
                alt21=4;
                }
                break;
            case 33:
                {
                alt21=5;
                }
                break;
            case 34:
                {
                alt21=6;
                }
                break;
            case 35:
                {
                alt21=7;
                }
                break;
            case 36:
                {
                alt21=8;
                }
                break;
            case 37:
                {
                alt21=9;
                }
                break;
            case 38:
                {
                alt21=10;
                }
                break;
            case 39:
                {
                alt21=11;
                }
                break;
            case 40:
                {
                alt21=12;
                }
                break;
            case 41:
                {
                alt21=13;
                }
                break;
            case 42:
                {
                alt21=14;
                }
                break;
            case 45:
                {
                alt21=15;
                }
                break;
            case 46:
                {
                alt21=16;
                }
                break;
            case 47:
                {
                alt21=17;
                }
                break;
            case 48:
                {
                alt21=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalComponentLanguage.g:658:3: kw= 'String'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentLanguage.g:664:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getBooleanKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentLanguage.g:670:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getIntegerKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalComponentLanguage.g:676:3: kw= 'Float'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getFloatKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalComponentLanguage.g:682:3: kw= 'javax.el.MethodExpression'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getJavaxElMethodExpressionKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalComponentLanguage.g:688:3: kw= 'javax.faces.event.ActionListener'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getJavaxFacesEventActionListenerKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalComponentLanguage.g:694:3: kw= 'javax.faces.component.UIComponent'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getJavaxFacesComponentUIComponentKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalComponentLanguage.g:700:3: kw= 'javax.el.ValueExpression'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getJavaxElValueExpressionKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalComponentLanguage.g:706:3: kw= 'javax.faces.event.ValueChangeListener'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getJavaxFacesEventValueChangeListenerKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalComponentLanguage.g:712:3: kw= 'java.faces.convert.Converter'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getJavaFacesConvertConverterKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalComponentLanguage.g:718:3: kw= 'java.util.List'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getJavaUtilListKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalComponentLanguage.g:724:3: kw= 'javax.faces.validator.Validator'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getJavaxFacesValidatorValidatorKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalComponentLanguage.g:730:3: kw= 'TreeNodeEventListener'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getTreeNodeEventListenerKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalComponentLanguage.g:736:3: (kw= 'Map<' this_QualifiedName_14= ruleQualifiedName kw= ',' this_QualifiedName_16= ruleQualifiedName kw= '>' )
                    {
                    // InternalComponentLanguage.g:736:3: (kw= 'Map<' this_QualifiedName_14= ruleQualifiedName kw= ',' this_QualifiedName_16= ruleQualifiedName kw= '>' )
                    // InternalComponentLanguage.g:737:4: kw= 'Map<' this_QualifiedName_14= ruleQualifiedName kw= ',' this_QualifiedName_16= ruleQualifiedName kw= '>'
                    {
                    kw=(Token)match(input,42,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAttributetypeAccess().getMapKeyword_13_0());
                    			

                    				newCompositeNode(grammarAccess.getAttributetypeAccess().getQualifiedNameParserRuleCall_13_1());
                    			
                    pushFollow(FOLLOW_26);
                    this_QualifiedName_14=ruleQualifiedName();

                    state._fsp--;


                    				current.merge(this_QualifiedName_14);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,43,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAttributetypeAccess().getCommaKeyword_13_2());
                    			

                    				newCompositeNode(grammarAccess.getAttributetypeAccess().getQualifiedNameParserRuleCall_13_3());
                    			
                    pushFollow(FOLLOW_27);
                    this_QualifiedName_16=ruleQualifiedName();

                    state._fsp--;


                    				current.merge(this_QualifiedName_16);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,44,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAttributetypeAccess().getGreaterThanSignKeyword_13_4());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalComponentLanguage.g:774:3: kw= 'Drawing'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getDrawingKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalComponentLanguage.g:780:3: kw= 'java.lang.Object'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getJavaLangObjectKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalComponentLanguage.g:786:3: kw= 'ScrollSpyEventListener'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getScrollSpyEventListenerKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalComponentLanguage.g:792:3: kw= 'Node'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributetypeAccess().getNodeKeyword_17());
                    		

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
    // $ANTLR end "ruleAttributetype"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000007F9000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000007F1000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000007E1000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000007C1000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000781000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000701000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000601000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000802010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001E7FFE7000022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007000022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006000022L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});

}