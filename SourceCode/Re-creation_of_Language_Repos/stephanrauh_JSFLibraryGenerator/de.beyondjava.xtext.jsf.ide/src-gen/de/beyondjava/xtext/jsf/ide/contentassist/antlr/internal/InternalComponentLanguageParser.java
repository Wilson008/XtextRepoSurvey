package de.beyondjava.xtext.jsf.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.beyondjava.xtext.jsf.services.ComponentLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Boolean'", "'Integer'", "'Float'", "'javax.el.MethodExpression'", "'javax.faces.event.ActionListener'", "'javax.faces.component.UIComponent'", "'javax.el.ValueExpression'", "'javax.faces.event.ValueChangeListener'", "'java.faces.convert.Converter'", "'java.util.List'", "'javax.faces.validator.Validator'", "'TreeNodeEventListener'", "'Drawing'", "'java.lang.Object'", "'ScrollSpyEventListener'", "'Node'", "'attribute_list'", "'{'", "'}'", "'widget'", "'implemented_by '", "'rendered_by '", "'extends'", "'description'", "'+'", "'default'", "'.'", "'-'", "'Map<'", "','", "'>'", "'processes_input'", "'has_children'", "'has_tooltip'", "'is_responsive'", "'mandatory'", "'inherited'"
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

    	public void setGrammarAccess(ComponentLanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDomainmodel"
    // InternalComponentLanguage.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalComponentLanguage.g:54:1: ( ruleDomainmodel EOF )
            // InternalComponentLanguage.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalComponentLanguage.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__Group__0 ) ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:66:2: ( ( ( rule__Domainmodel__Group__0 ) ) )
            // InternalComponentLanguage.g:67:2: ( ( rule__Domainmodel__Group__0 ) )
            {
            // InternalComponentLanguage.g:67:2: ( ( rule__Domainmodel__Group__0 ) )
            // InternalComponentLanguage.g:68:3: ( rule__Domainmodel__Group__0 )
            {
             before(grammarAccess.getDomainmodelAccess().getGroup()); 
            // InternalComponentLanguage.g:69:3: ( rule__Domainmodel__Group__0 )
            // InternalComponentLanguage.g:69:4: rule__Domainmodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainmodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleAttributeList"
    // InternalComponentLanguage.g:78:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // InternalComponentLanguage.g:79:1: ( ruleAttributeList EOF )
            // InternalComponentLanguage.g:80:1: ruleAttributeList EOF
            {
             before(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getAttributeListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeList"


    // $ANTLR start "ruleAttributeList"
    // InternalComponentLanguage.g:87:1: ruleAttributeList : ( ( rule__AttributeList__Group__0 ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:91:2: ( ( ( rule__AttributeList__Group__0 ) ) )
            // InternalComponentLanguage.g:92:2: ( ( rule__AttributeList__Group__0 ) )
            {
            // InternalComponentLanguage.g:92:2: ( ( rule__AttributeList__Group__0 ) )
            // InternalComponentLanguage.g:93:3: ( rule__AttributeList__Group__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup()); 
            // InternalComponentLanguage.g:94:3: ( rule__AttributeList__Group__0 )
            // InternalComponentLanguage.g:94:4: rule__AttributeList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeList"


    // $ANTLR start "entryRuleComponent"
    // InternalComponentLanguage.g:103:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalComponentLanguage.g:104:1: ( ruleComponent EOF )
            // InternalComponentLanguage.g:105:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalComponentLanguage.g:112:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:116:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalComponentLanguage.g:117:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalComponentLanguage.g:117:2: ( ( rule__Component__Group__0 ) )
            // InternalComponentLanguage.g:118:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalComponentLanguage.g:119:3: ( rule__Component__Group__0 )
            // InternalComponentLanguage.g:119:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleAttribute"
    // InternalComponentLanguage.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalComponentLanguage.g:129:1: ( ruleAttribute EOF )
            // InternalComponentLanguage.g:130:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalComponentLanguage.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:141:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalComponentLanguage.g:142:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalComponentLanguage.g:142:2: ( ( rule__Attribute__Group__0 ) )
            // InternalComponentLanguage.g:143:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalComponentLanguage.g:144:3: ( rule__Attribute__Group__0 )
            // InternalComponentLanguage.g:144:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalComponentLanguage.g:153:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalComponentLanguage.g:154:1: ( ruleQualifiedName EOF )
            // InternalComponentLanguage.g:155:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalComponentLanguage.g:162:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:166:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalComponentLanguage.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalComponentLanguage.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalComponentLanguage.g:168:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalComponentLanguage.g:169:3: ( rule__QualifiedName__Group__0 )
            // InternalComponentLanguage.g:169:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleCSSID"
    // InternalComponentLanguage.g:178:1: entryRuleCSSID : ruleCSSID EOF ;
    public final void entryRuleCSSID() throws RecognitionException {
        try {
            // InternalComponentLanguage.g:179:1: ( ruleCSSID EOF )
            // InternalComponentLanguage.g:180:1: ruleCSSID EOF
            {
             before(grammarAccess.getCSSIDRule()); 
            pushFollow(FOLLOW_1);
            ruleCSSID();

            state._fsp--;

             after(grammarAccess.getCSSIDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSSID"


    // $ANTLR start "ruleCSSID"
    // InternalComponentLanguage.g:187:1: ruleCSSID : ( ( rule__CSSID__Group__0 ) ) ;
    public final void ruleCSSID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:191:2: ( ( ( rule__CSSID__Group__0 ) ) )
            // InternalComponentLanguage.g:192:2: ( ( rule__CSSID__Group__0 ) )
            {
            // InternalComponentLanguage.g:192:2: ( ( rule__CSSID__Group__0 ) )
            // InternalComponentLanguage.g:193:3: ( rule__CSSID__Group__0 )
            {
             before(grammarAccess.getCSSIDAccess().getGroup()); 
            // InternalComponentLanguage.g:194:3: ( rule__CSSID__Group__0 )
            // InternalComponentLanguage.g:194:4: rule__CSSID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSSID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCSSIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSSID"


    // $ANTLR start "entryRuleAttributetype"
    // InternalComponentLanguage.g:203:1: entryRuleAttributetype : ruleAttributetype EOF ;
    public final void entryRuleAttributetype() throws RecognitionException {
        try {
            // InternalComponentLanguage.g:204:1: ( ruleAttributetype EOF )
            // InternalComponentLanguage.g:205:1: ruleAttributetype EOF
            {
             before(grammarAccess.getAttributetypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributetype();

            state._fsp--;

             after(grammarAccess.getAttributetypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributetype"


    // $ANTLR start "ruleAttributetype"
    // InternalComponentLanguage.g:212:1: ruleAttributetype : ( ( rule__Attributetype__Alternatives ) ) ;
    public final void ruleAttributetype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:216:2: ( ( ( rule__Attributetype__Alternatives ) ) )
            // InternalComponentLanguage.g:217:2: ( ( rule__Attributetype__Alternatives ) )
            {
            // InternalComponentLanguage.g:217:2: ( ( rule__Attributetype__Alternatives ) )
            // InternalComponentLanguage.g:218:3: ( rule__Attributetype__Alternatives )
            {
             before(grammarAccess.getAttributetypeAccess().getAlternatives()); 
            // InternalComponentLanguage.g:219:3: ( rule__Attributetype__Alternatives )
            // InternalComponentLanguage.g:219:4: rule__Attributetype__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Attributetype__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributetypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributetype"


    // $ANTLR start "rule__Attributetype__Alternatives"
    // InternalComponentLanguage.g:227:1: rule__Attributetype__Alternatives : ( ( 'String' ) | ( 'Boolean' ) | ( 'Integer' ) | ( 'Float' ) | ( 'javax.el.MethodExpression' ) | ( 'javax.faces.event.ActionListener' ) | ( 'javax.faces.component.UIComponent' ) | ( 'javax.el.ValueExpression' ) | ( 'javax.faces.event.ValueChangeListener' ) | ( 'java.faces.convert.Converter' ) | ( 'java.util.List' ) | ( 'javax.faces.validator.Validator' ) | ( 'TreeNodeEventListener' ) | ( ( rule__Attributetype__Group_13__0 ) ) | ( 'Drawing' ) | ( 'java.lang.Object' ) | ( 'ScrollSpyEventListener' ) | ( 'Node' ) );
    public final void rule__Attributetype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:231:1: ( ( 'String' ) | ( 'Boolean' ) | ( 'Integer' ) | ( 'Float' ) | ( 'javax.el.MethodExpression' ) | ( 'javax.faces.event.ActionListener' ) | ( 'javax.faces.component.UIComponent' ) | ( 'javax.el.ValueExpression' ) | ( 'javax.faces.event.ValueChangeListener' ) | ( 'java.faces.convert.Converter' ) | ( 'java.util.List' ) | ( 'javax.faces.validator.Validator' ) | ( 'TreeNodeEventListener' ) | ( ( rule__Attributetype__Group_13__0 ) ) | ( 'Drawing' ) | ( 'java.lang.Object' ) | ( 'ScrollSpyEventListener' ) | ( 'Node' ) )
            int alt1=18;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            case 16:
                {
                alt1=6;
                }
                break;
            case 17:
                {
                alt1=7;
                }
                break;
            case 18:
                {
                alt1=8;
                }
                break;
            case 19:
                {
                alt1=9;
                }
                break;
            case 20:
                {
                alt1=10;
                }
                break;
            case 21:
                {
                alt1=11;
                }
                break;
            case 22:
                {
                alt1=12;
                }
                break;
            case 23:
                {
                alt1=13;
                }
                break;
            case 40:
                {
                alt1=14;
                }
                break;
            case 24:
                {
                alt1=15;
                }
                break;
            case 25:
                {
                alt1=16;
                }
                break;
            case 26:
                {
                alt1=17;
                }
                break;
            case 27:
                {
                alt1=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalComponentLanguage.g:232:2: ( 'String' )
                    {
                    // InternalComponentLanguage.g:232:2: ( 'String' )
                    // InternalComponentLanguage.g:233:3: 'String'
                    {
                     before(grammarAccess.getAttributetypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentLanguage.g:238:2: ( 'Boolean' )
                    {
                    // InternalComponentLanguage.g:238:2: ( 'Boolean' )
                    // InternalComponentLanguage.g:239:3: 'Boolean'
                    {
                     before(grammarAccess.getAttributetypeAccess().getBooleanKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getBooleanKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentLanguage.g:244:2: ( 'Integer' )
                    {
                    // InternalComponentLanguage.g:244:2: ( 'Integer' )
                    // InternalComponentLanguage.g:245:3: 'Integer'
                    {
                     before(grammarAccess.getAttributetypeAccess().getIntegerKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getIntegerKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentLanguage.g:250:2: ( 'Float' )
                    {
                    // InternalComponentLanguage.g:250:2: ( 'Float' )
                    // InternalComponentLanguage.g:251:3: 'Float'
                    {
                     before(grammarAccess.getAttributetypeAccess().getFloatKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getFloatKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalComponentLanguage.g:256:2: ( 'javax.el.MethodExpression' )
                    {
                    // InternalComponentLanguage.g:256:2: ( 'javax.el.MethodExpression' )
                    // InternalComponentLanguage.g:257:3: 'javax.el.MethodExpression'
                    {
                     before(grammarAccess.getAttributetypeAccess().getJavaxElMethodExpressionKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getJavaxElMethodExpressionKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalComponentLanguage.g:262:2: ( 'javax.faces.event.ActionListener' )
                    {
                    // InternalComponentLanguage.g:262:2: ( 'javax.faces.event.ActionListener' )
                    // InternalComponentLanguage.g:263:3: 'javax.faces.event.ActionListener'
                    {
                     before(grammarAccess.getAttributetypeAccess().getJavaxFacesEventActionListenerKeyword_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getJavaxFacesEventActionListenerKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalComponentLanguage.g:268:2: ( 'javax.faces.component.UIComponent' )
                    {
                    // InternalComponentLanguage.g:268:2: ( 'javax.faces.component.UIComponent' )
                    // InternalComponentLanguage.g:269:3: 'javax.faces.component.UIComponent'
                    {
                     before(grammarAccess.getAttributetypeAccess().getJavaxFacesComponentUIComponentKeyword_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getJavaxFacesComponentUIComponentKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalComponentLanguage.g:274:2: ( 'javax.el.ValueExpression' )
                    {
                    // InternalComponentLanguage.g:274:2: ( 'javax.el.ValueExpression' )
                    // InternalComponentLanguage.g:275:3: 'javax.el.ValueExpression'
                    {
                     before(grammarAccess.getAttributetypeAccess().getJavaxElValueExpressionKeyword_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getJavaxElValueExpressionKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalComponentLanguage.g:280:2: ( 'javax.faces.event.ValueChangeListener' )
                    {
                    // InternalComponentLanguage.g:280:2: ( 'javax.faces.event.ValueChangeListener' )
                    // InternalComponentLanguage.g:281:3: 'javax.faces.event.ValueChangeListener'
                    {
                     before(grammarAccess.getAttributetypeAccess().getJavaxFacesEventValueChangeListenerKeyword_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getJavaxFacesEventValueChangeListenerKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalComponentLanguage.g:286:2: ( 'java.faces.convert.Converter' )
                    {
                    // InternalComponentLanguage.g:286:2: ( 'java.faces.convert.Converter' )
                    // InternalComponentLanguage.g:287:3: 'java.faces.convert.Converter'
                    {
                     before(grammarAccess.getAttributetypeAccess().getJavaFacesConvertConverterKeyword_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getJavaFacesConvertConverterKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalComponentLanguage.g:292:2: ( 'java.util.List' )
                    {
                    // InternalComponentLanguage.g:292:2: ( 'java.util.List' )
                    // InternalComponentLanguage.g:293:3: 'java.util.List'
                    {
                     before(grammarAccess.getAttributetypeAccess().getJavaUtilListKeyword_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getJavaUtilListKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalComponentLanguage.g:298:2: ( 'javax.faces.validator.Validator' )
                    {
                    // InternalComponentLanguage.g:298:2: ( 'javax.faces.validator.Validator' )
                    // InternalComponentLanguage.g:299:3: 'javax.faces.validator.Validator'
                    {
                     before(grammarAccess.getAttributetypeAccess().getJavaxFacesValidatorValidatorKeyword_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getJavaxFacesValidatorValidatorKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalComponentLanguage.g:304:2: ( 'TreeNodeEventListener' )
                    {
                    // InternalComponentLanguage.g:304:2: ( 'TreeNodeEventListener' )
                    // InternalComponentLanguage.g:305:3: 'TreeNodeEventListener'
                    {
                     before(grammarAccess.getAttributetypeAccess().getTreeNodeEventListenerKeyword_12()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getTreeNodeEventListenerKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalComponentLanguage.g:310:2: ( ( rule__Attributetype__Group_13__0 ) )
                    {
                    // InternalComponentLanguage.g:310:2: ( ( rule__Attributetype__Group_13__0 ) )
                    // InternalComponentLanguage.g:311:3: ( rule__Attributetype__Group_13__0 )
                    {
                     before(grammarAccess.getAttributetypeAccess().getGroup_13()); 
                    // InternalComponentLanguage.g:312:3: ( rule__Attributetype__Group_13__0 )
                    // InternalComponentLanguage.g:312:4: rule__Attributetype__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attributetype__Group_13__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributetypeAccess().getGroup_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalComponentLanguage.g:316:2: ( 'Drawing' )
                    {
                    // InternalComponentLanguage.g:316:2: ( 'Drawing' )
                    // InternalComponentLanguage.g:317:3: 'Drawing'
                    {
                     before(grammarAccess.getAttributetypeAccess().getDrawingKeyword_14()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getDrawingKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalComponentLanguage.g:322:2: ( 'java.lang.Object' )
                    {
                    // InternalComponentLanguage.g:322:2: ( 'java.lang.Object' )
                    // InternalComponentLanguage.g:323:3: 'java.lang.Object'
                    {
                     before(grammarAccess.getAttributetypeAccess().getJavaLangObjectKeyword_15()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getJavaLangObjectKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalComponentLanguage.g:328:2: ( 'ScrollSpyEventListener' )
                    {
                    // InternalComponentLanguage.g:328:2: ( 'ScrollSpyEventListener' )
                    // InternalComponentLanguage.g:329:3: 'ScrollSpyEventListener'
                    {
                     before(grammarAccess.getAttributetypeAccess().getScrollSpyEventListenerKeyword_16()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getScrollSpyEventListenerKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalComponentLanguage.g:334:2: ( 'Node' )
                    {
                    // InternalComponentLanguage.g:334:2: ( 'Node' )
                    // InternalComponentLanguage.g:335:3: 'Node'
                    {
                     before(grammarAccess.getAttributetypeAccess().getNodeKeyword_17()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAttributetypeAccess().getNodeKeyword_17()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributetype__Alternatives"


    // $ANTLR start "rule__Domainmodel__Group__0"
    // InternalComponentLanguage.g:344:1: rule__Domainmodel__Group__0 : rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 ;
    public final void rule__Domainmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:348:1: ( rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 )
            // InternalComponentLanguage.g:349:2: rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Domainmodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__0"


    // $ANTLR start "rule__Domainmodel__Group__0__Impl"
    // InternalComponentLanguage.g:356:1: rule__Domainmodel__Group__0__Impl : ( ( rule__Domainmodel__ElementsAssignment_0 )* ) ;
    public final void rule__Domainmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:360:1: ( ( ( rule__Domainmodel__ElementsAssignment_0 )* ) )
            // InternalComponentLanguage.g:361:1: ( ( rule__Domainmodel__ElementsAssignment_0 )* )
            {
            // InternalComponentLanguage.g:361:1: ( ( rule__Domainmodel__ElementsAssignment_0 )* )
            // InternalComponentLanguage.g:362:2: ( rule__Domainmodel__ElementsAssignment_0 )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment_0()); 
            // InternalComponentLanguage.g:363:2: ( rule__Domainmodel__ElementsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==28) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalComponentLanguage.g:363:3: rule__Domainmodel__ElementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Domainmodel__ElementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__0__Impl"


    // $ANTLR start "rule__Domainmodel__Group__1"
    // InternalComponentLanguage.g:371:1: rule__Domainmodel__Group__1 : rule__Domainmodel__Group__1__Impl ;
    public final void rule__Domainmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:375:1: ( rule__Domainmodel__Group__1__Impl )
            // InternalComponentLanguage.g:376:2: rule__Domainmodel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__1"


    // $ANTLR start "rule__Domainmodel__Group__1__Impl"
    // InternalComponentLanguage.g:382:1: rule__Domainmodel__Group__1__Impl : ( ( rule__Domainmodel__ElementsAssignment_1 )* ) ;
    public final void rule__Domainmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:386:1: ( ( ( rule__Domainmodel__ElementsAssignment_1 )* ) )
            // InternalComponentLanguage.g:387:1: ( ( rule__Domainmodel__ElementsAssignment_1 )* )
            {
            // InternalComponentLanguage.g:387:1: ( ( rule__Domainmodel__ElementsAssignment_1 )* )
            // InternalComponentLanguage.g:388:2: ( rule__Domainmodel__ElementsAssignment_1 )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment_1()); 
            // InternalComponentLanguage.g:389:2: ( rule__Domainmodel__ElementsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalComponentLanguage.g:389:3: rule__Domainmodel__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Domainmodel__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__1__Impl"


    // $ANTLR start "rule__AttributeList__Group__0"
    // InternalComponentLanguage.g:398:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:402:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // InternalComponentLanguage.g:403:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AttributeList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__0"


    // $ANTLR start "rule__AttributeList__Group__0__Impl"
    // InternalComponentLanguage.g:410:1: rule__AttributeList__Group__0__Impl : ( 'attribute_list' ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:414:1: ( ( 'attribute_list' ) )
            // InternalComponentLanguage.g:415:1: ( 'attribute_list' )
            {
            // InternalComponentLanguage.g:415:1: ( 'attribute_list' )
            // InternalComponentLanguage.g:416:2: 'attribute_list'
            {
             before(grammarAccess.getAttributeListAccess().getAttribute_listKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAttributeListAccess().getAttribute_listKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__0__Impl"


    // $ANTLR start "rule__AttributeList__Group__1"
    // InternalComponentLanguage.g:425:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl rule__AttributeList__Group__2 ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:429:1: ( rule__AttributeList__Group__1__Impl rule__AttributeList__Group__2 )
            // InternalComponentLanguage.g:430:2: rule__AttributeList__Group__1__Impl rule__AttributeList__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__AttributeList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__1"


    // $ANTLR start "rule__AttributeList__Group__1__Impl"
    // InternalComponentLanguage.g:437:1: rule__AttributeList__Group__1__Impl : ( ( rule__AttributeList__NameAssignment_1 ) ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:441:1: ( ( ( rule__AttributeList__NameAssignment_1 ) ) )
            // InternalComponentLanguage.g:442:1: ( ( rule__AttributeList__NameAssignment_1 ) )
            {
            // InternalComponentLanguage.g:442:1: ( ( rule__AttributeList__NameAssignment_1 ) )
            // InternalComponentLanguage.g:443:2: ( rule__AttributeList__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeListAccess().getNameAssignment_1()); 
            // InternalComponentLanguage.g:444:2: ( rule__AttributeList__NameAssignment_1 )
            // InternalComponentLanguage.g:444:3: rule__AttributeList__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__1__Impl"


    // $ANTLR start "rule__AttributeList__Group__2"
    // InternalComponentLanguage.g:452:1: rule__AttributeList__Group__2 : rule__AttributeList__Group__2__Impl rule__AttributeList__Group__3 ;
    public final void rule__AttributeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:456:1: ( rule__AttributeList__Group__2__Impl rule__AttributeList__Group__3 )
            // InternalComponentLanguage.g:457:2: rule__AttributeList__Group__2__Impl rule__AttributeList__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__AttributeList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__2"


    // $ANTLR start "rule__AttributeList__Group__2__Impl"
    // InternalComponentLanguage.g:464:1: rule__AttributeList__Group__2__Impl : ( '{' ) ;
    public final void rule__AttributeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:468:1: ( ( '{' ) )
            // InternalComponentLanguage.g:469:1: ( '{' )
            {
            // InternalComponentLanguage.g:469:1: ( '{' )
            // InternalComponentLanguage.g:470:2: '{'
            {
             before(grammarAccess.getAttributeListAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAttributeListAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__2__Impl"


    // $ANTLR start "rule__AttributeList__Group__3"
    // InternalComponentLanguage.g:479:1: rule__AttributeList__Group__3 : rule__AttributeList__Group__3__Impl rule__AttributeList__Group__4 ;
    public final void rule__AttributeList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:483:1: ( rule__AttributeList__Group__3__Impl rule__AttributeList__Group__4 )
            // InternalComponentLanguage.g:484:2: rule__AttributeList__Group__3__Impl rule__AttributeList__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__AttributeList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__3"


    // $ANTLR start "rule__AttributeList__Group__3__Impl"
    // InternalComponentLanguage.g:491:1: rule__AttributeList__Group__3__Impl : ( ( rule__AttributeList__AttributesAssignment_3 )* ) ;
    public final void rule__AttributeList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:495:1: ( ( ( rule__AttributeList__AttributesAssignment_3 )* ) )
            // InternalComponentLanguage.g:496:1: ( ( rule__AttributeList__AttributesAssignment_3 )* )
            {
            // InternalComponentLanguage.g:496:1: ( ( rule__AttributeList__AttributesAssignment_3 )* )
            // InternalComponentLanguage.g:497:2: ( rule__AttributeList__AttributesAssignment_3 )*
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_3()); 
            // InternalComponentLanguage.g:498:2: ( rule__AttributeList__AttributesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalComponentLanguage.g:498:3: rule__AttributeList__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AttributeList__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAttributeListAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__3__Impl"


    // $ANTLR start "rule__AttributeList__Group__4"
    // InternalComponentLanguage.g:506:1: rule__AttributeList__Group__4 : rule__AttributeList__Group__4__Impl ;
    public final void rule__AttributeList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:510:1: ( rule__AttributeList__Group__4__Impl )
            // InternalComponentLanguage.g:511:2: rule__AttributeList__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__4"


    // $ANTLR start "rule__AttributeList__Group__4__Impl"
    // InternalComponentLanguage.g:517:1: rule__AttributeList__Group__4__Impl : ( '}' ) ;
    public final void rule__AttributeList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:521:1: ( ( '}' ) )
            // InternalComponentLanguage.g:522:1: ( '}' )
            {
            // InternalComponentLanguage.g:522:1: ( '}' )
            // InternalComponentLanguage.g:523:2: '}'
            {
             before(grammarAccess.getAttributeListAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAttributeListAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalComponentLanguage.g:533:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:537:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalComponentLanguage.g:538:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalComponentLanguage.g:545:1: rule__Component__Group__0__Impl : ( 'widget' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:549:1: ( ( 'widget' ) )
            // InternalComponentLanguage.g:550:1: ( 'widget' )
            {
            // InternalComponentLanguage.g:550:1: ( 'widget' )
            // InternalComponentLanguage.g:551:2: 'widget'
            {
             before(grammarAccess.getComponentAccess().getWidgetKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getWidgetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalComponentLanguage.g:560:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:564:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalComponentLanguage.g:565:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalComponentLanguage.g:572:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:576:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalComponentLanguage.g:577:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalComponentLanguage.g:577:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalComponentLanguage.g:578:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalComponentLanguage.g:579:2: ( rule__Component__NameAssignment_1 )
            // InternalComponentLanguage.g:579:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalComponentLanguage.g:587:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:591:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalComponentLanguage.g:592:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalComponentLanguage.g:599:1: rule__Component__Group__2__Impl : ( ( rule__Component__Group_2__0 )? ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:603:1: ( ( ( rule__Component__Group_2__0 )? ) )
            // InternalComponentLanguage.g:604:1: ( ( rule__Component__Group_2__0 )? )
            {
            // InternalComponentLanguage.g:604:1: ( ( rule__Component__Group_2__0 )? )
            // InternalComponentLanguage.g:605:2: ( rule__Component__Group_2__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_2()); 
            // InternalComponentLanguage.g:606:2: ( rule__Component__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentLanguage.g:606:3: rule__Component__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalComponentLanguage.g:614:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:618:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalComponentLanguage.g:619:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalComponentLanguage.g:626:1: rule__Component__Group__3__Impl : ( ( rule__Component__Group_3__0 )? ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:630:1: ( ( ( rule__Component__Group_3__0 )? ) )
            // InternalComponentLanguage.g:631:1: ( ( rule__Component__Group_3__0 )? )
            {
            // InternalComponentLanguage.g:631:1: ( ( rule__Component__Group_3__0 )? )
            // InternalComponentLanguage.g:632:2: ( rule__Component__Group_3__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_3()); 
            // InternalComponentLanguage.g:633:2: ( rule__Component__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentLanguage.g:633:3: rule__Component__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalComponentLanguage.g:641:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:645:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalComponentLanguage.g:646:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalComponentLanguage.g:653:1: rule__Component__Group__4__Impl : ( ( rule__Component__ProcessesInputAssignment_4 )? ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:657:1: ( ( ( rule__Component__ProcessesInputAssignment_4 )? ) )
            // InternalComponentLanguage.g:658:1: ( ( rule__Component__ProcessesInputAssignment_4 )? )
            {
            // InternalComponentLanguage.g:658:1: ( ( rule__Component__ProcessesInputAssignment_4 )? )
            // InternalComponentLanguage.g:659:2: ( rule__Component__ProcessesInputAssignment_4 )?
            {
             before(grammarAccess.getComponentAccess().getProcessesInputAssignment_4()); 
            // InternalComponentLanguage.g:660:2: ( rule__Component__ProcessesInputAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==43) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentLanguage.g:660:3: rule__Component__ProcessesInputAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__ProcessesInputAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getProcessesInputAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // InternalComponentLanguage.g:668:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:672:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalComponentLanguage.g:673:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // InternalComponentLanguage.g:680:1: rule__Component__Group__5__Impl : ( ( rule__Component__Group_5__0 )? ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:684:1: ( ( ( rule__Component__Group_5__0 )? ) )
            // InternalComponentLanguage.g:685:1: ( ( rule__Component__Group_5__0 )? )
            {
            // InternalComponentLanguage.g:685:1: ( ( rule__Component__Group_5__0 )? )
            // InternalComponentLanguage.g:686:2: ( rule__Component__Group_5__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_5()); 
            // InternalComponentLanguage.g:687:2: ( rule__Component__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentLanguage.g:687:3: rule__Component__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // InternalComponentLanguage.g:695:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:699:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalComponentLanguage.g:700:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // InternalComponentLanguage.g:707:1: rule__Component__Group__6__Impl : ( ( rule__Component__HasChildrenAssignment_6 )? ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:711:1: ( ( ( rule__Component__HasChildrenAssignment_6 )? ) )
            // InternalComponentLanguage.g:712:1: ( ( rule__Component__HasChildrenAssignment_6 )? )
            {
            // InternalComponentLanguage.g:712:1: ( ( rule__Component__HasChildrenAssignment_6 )? )
            // InternalComponentLanguage.g:713:2: ( rule__Component__HasChildrenAssignment_6 )?
            {
             before(grammarAccess.getComponentAccess().getHasChildrenAssignment_6()); 
            // InternalComponentLanguage.g:714:2: ( rule__Component__HasChildrenAssignment_6 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==44) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentLanguage.g:714:3: rule__Component__HasChildrenAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__HasChildrenAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getHasChildrenAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group__7"
    // InternalComponentLanguage.g:722:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:726:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalComponentLanguage.g:727:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7"


    // $ANTLR start "rule__Component__Group__7__Impl"
    // InternalComponentLanguage.g:734:1: rule__Component__Group__7__Impl : ( ( rule__Component__HasTooltipAssignment_7 )? ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:738:1: ( ( ( rule__Component__HasTooltipAssignment_7 )? ) )
            // InternalComponentLanguage.g:739:1: ( ( rule__Component__HasTooltipAssignment_7 )? )
            {
            // InternalComponentLanguage.g:739:1: ( ( rule__Component__HasTooltipAssignment_7 )? )
            // InternalComponentLanguage.g:740:2: ( rule__Component__HasTooltipAssignment_7 )?
            {
             before(grammarAccess.getComponentAccess().getHasTooltipAssignment_7()); 
            // InternalComponentLanguage.g:741:2: ( rule__Component__HasTooltipAssignment_7 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==45) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentLanguage.g:741:3: rule__Component__HasTooltipAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__HasTooltipAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getHasTooltipAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7__Impl"


    // $ANTLR start "rule__Component__Group__8"
    // InternalComponentLanguage.g:749:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:753:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // InternalComponentLanguage.g:754:2: rule__Component__Group__8__Impl rule__Component__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__8"


    // $ANTLR start "rule__Component__Group__8__Impl"
    // InternalComponentLanguage.g:761:1: rule__Component__Group__8__Impl : ( ( rule__Component__IsReponsiveAssignment_8 )? ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:765:1: ( ( ( rule__Component__IsReponsiveAssignment_8 )? ) )
            // InternalComponentLanguage.g:766:1: ( ( rule__Component__IsReponsiveAssignment_8 )? )
            {
            // InternalComponentLanguage.g:766:1: ( ( rule__Component__IsReponsiveAssignment_8 )? )
            // InternalComponentLanguage.g:767:2: ( rule__Component__IsReponsiveAssignment_8 )?
            {
             before(grammarAccess.getComponentAccess().getIsReponsiveAssignment_8()); 
            // InternalComponentLanguage.g:768:2: ( rule__Component__IsReponsiveAssignment_8 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==46) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentLanguage.g:768:3: rule__Component__IsReponsiveAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__IsReponsiveAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getIsReponsiveAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__8__Impl"


    // $ANTLR start "rule__Component__Group__9"
    // InternalComponentLanguage.g:776:1: rule__Component__Group__9 : rule__Component__Group__9__Impl rule__Component__Group__10 ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:780:1: ( rule__Component__Group__9__Impl rule__Component__Group__10 )
            // InternalComponentLanguage.g:781:2: rule__Component__Group__9__Impl rule__Component__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__9"


    // $ANTLR start "rule__Component__Group__9__Impl"
    // InternalComponentLanguage.g:788:1: rule__Component__Group__9__Impl : ( ( rule__Component__Group_9__0 )? ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:792:1: ( ( ( rule__Component__Group_9__0 )? ) )
            // InternalComponentLanguage.g:793:1: ( ( rule__Component__Group_9__0 )? )
            {
            // InternalComponentLanguage.g:793:1: ( ( rule__Component__Group_9__0 )? )
            // InternalComponentLanguage.g:794:2: ( rule__Component__Group_9__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_9()); 
            // InternalComponentLanguage.g:795:2: ( rule__Component__Group_9__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentLanguage.g:795:3: rule__Component__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__9__Impl"


    // $ANTLR start "rule__Component__Group__10"
    // InternalComponentLanguage.g:803:1: rule__Component__Group__10 : rule__Component__Group__10__Impl rule__Component__Group__11 ;
    public final void rule__Component__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:807:1: ( rule__Component__Group__10__Impl rule__Component__Group__11 )
            // InternalComponentLanguage.g:808:2: rule__Component__Group__10__Impl rule__Component__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Component__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__10"


    // $ANTLR start "rule__Component__Group__10__Impl"
    // InternalComponentLanguage.g:815:1: rule__Component__Group__10__Impl : ( '{' ) ;
    public final void rule__Component__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:819:1: ( ( '{' ) )
            // InternalComponentLanguage.g:820:1: ( '{' )
            {
            // InternalComponentLanguage.g:820:1: ( '{' )
            // InternalComponentLanguage.g:821:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__10__Impl"


    // $ANTLR start "rule__Component__Group__11"
    // InternalComponentLanguage.g:830:1: rule__Component__Group__11 : rule__Component__Group__11__Impl rule__Component__Group__12 ;
    public final void rule__Component__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:834:1: ( rule__Component__Group__11__Impl rule__Component__Group__12 )
            // InternalComponentLanguage.g:835:2: rule__Component__Group__11__Impl rule__Component__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__Component__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__11"


    // $ANTLR start "rule__Component__Group__11__Impl"
    // InternalComponentLanguage.g:842:1: rule__Component__Group__11__Impl : ( ( rule__Component__AttributesAssignment_11 )* ) ;
    public final void rule__Component__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:846:1: ( ( ( rule__Component__AttributesAssignment_11 )* ) )
            // InternalComponentLanguage.g:847:1: ( ( rule__Component__AttributesAssignment_11 )* )
            {
            // InternalComponentLanguage.g:847:1: ( ( rule__Component__AttributesAssignment_11 )* )
            // InternalComponentLanguage.g:848:2: ( rule__Component__AttributesAssignment_11 )*
            {
             before(grammarAccess.getComponentAccess().getAttributesAssignment_11()); 
            // InternalComponentLanguage.g:849:2: ( rule__Component__AttributesAssignment_11 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalComponentLanguage.g:849:3: rule__Component__AttributesAssignment_11
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Component__AttributesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getAttributesAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__11__Impl"


    // $ANTLR start "rule__Component__Group__12"
    // InternalComponentLanguage.g:857:1: rule__Component__Group__12 : rule__Component__Group__12__Impl rule__Component__Group__13 ;
    public final void rule__Component__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:861:1: ( rule__Component__Group__12__Impl rule__Component__Group__13 )
            // InternalComponentLanguage.g:862:2: rule__Component__Group__12__Impl rule__Component__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__Component__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__12"


    // $ANTLR start "rule__Component__Group__12__Impl"
    // InternalComponentLanguage.g:869:1: rule__Component__Group__12__Impl : ( ( rule__Component__Group_12__0 )* ) ;
    public final void rule__Component__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:873:1: ( ( ( rule__Component__Group_12__0 )* ) )
            // InternalComponentLanguage.g:874:1: ( ( rule__Component__Group_12__0 )* )
            {
            // InternalComponentLanguage.g:874:1: ( ( rule__Component__Group_12__0 )* )
            // InternalComponentLanguage.g:875:2: ( rule__Component__Group_12__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_12()); 
            // InternalComponentLanguage.g:876:2: ( rule__Component__Group_12__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalComponentLanguage.g:876:3: rule__Component__Group_12__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Component__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__12__Impl"


    // $ANTLR start "rule__Component__Group__13"
    // InternalComponentLanguage.g:884:1: rule__Component__Group__13 : rule__Component__Group__13__Impl ;
    public final void rule__Component__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:888:1: ( rule__Component__Group__13__Impl )
            // InternalComponentLanguage.g:889:2: rule__Component__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__13"


    // $ANTLR start "rule__Component__Group__13__Impl"
    // InternalComponentLanguage.g:895:1: rule__Component__Group__13__Impl : ( '}' ) ;
    public final void rule__Component__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:899:1: ( ( '}' ) )
            // InternalComponentLanguage.g:900:1: ( '}' )
            {
            // InternalComponentLanguage.g:900:1: ( '}' )
            // InternalComponentLanguage.g:901:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_13()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__13__Impl"


    // $ANTLR start "rule__Component__Group_2__0"
    // InternalComponentLanguage.g:911:1: rule__Component__Group_2__0 : rule__Component__Group_2__0__Impl rule__Component__Group_2__1 ;
    public final void rule__Component__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:915:1: ( rule__Component__Group_2__0__Impl rule__Component__Group_2__1 )
            // InternalComponentLanguage.g:916:2: rule__Component__Group_2__0__Impl rule__Component__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__0"


    // $ANTLR start "rule__Component__Group_2__0__Impl"
    // InternalComponentLanguage.g:923:1: rule__Component__Group_2__0__Impl : ( 'implemented_by ' ) ;
    public final void rule__Component__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:927:1: ( ( 'implemented_by ' ) )
            // InternalComponentLanguage.g:928:1: ( 'implemented_by ' )
            {
            // InternalComponentLanguage.g:928:1: ( 'implemented_by ' )
            // InternalComponentLanguage.g:929:2: 'implemented_by '
            {
             before(grammarAccess.getComponentAccess().getImplemented_byKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getImplemented_byKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__0__Impl"


    // $ANTLR start "rule__Component__Group_2__1"
    // InternalComponentLanguage.g:938:1: rule__Component__Group_2__1 : rule__Component__Group_2__1__Impl ;
    public final void rule__Component__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:942:1: ( rule__Component__Group_2__1__Impl )
            // InternalComponentLanguage.g:943:2: rule__Component__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__1"


    // $ANTLR start "rule__Component__Group_2__1__Impl"
    // InternalComponentLanguage.g:949:1: rule__Component__Group_2__1__Impl : ( ( rule__Component__ImplementedByAssignment_2_1 ) ) ;
    public final void rule__Component__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:953:1: ( ( ( rule__Component__ImplementedByAssignment_2_1 ) ) )
            // InternalComponentLanguage.g:954:1: ( ( rule__Component__ImplementedByAssignment_2_1 ) )
            {
            // InternalComponentLanguage.g:954:1: ( ( rule__Component__ImplementedByAssignment_2_1 ) )
            // InternalComponentLanguage.g:955:2: ( rule__Component__ImplementedByAssignment_2_1 )
            {
             before(grammarAccess.getComponentAccess().getImplementedByAssignment_2_1()); 
            // InternalComponentLanguage.g:956:2: ( rule__Component__ImplementedByAssignment_2_1 )
            // InternalComponentLanguage.g:956:3: rule__Component__ImplementedByAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ImplementedByAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getImplementedByAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__1__Impl"


    // $ANTLR start "rule__Component__Group_3__0"
    // InternalComponentLanguage.g:965:1: rule__Component__Group_3__0 : rule__Component__Group_3__0__Impl rule__Component__Group_3__1 ;
    public final void rule__Component__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:969:1: ( rule__Component__Group_3__0__Impl rule__Component__Group_3__1 )
            // InternalComponentLanguage.g:970:2: rule__Component__Group_3__0__Impl rule__Component__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__0"


    // $ANTLR start "rule__Component__Group_3__0__Impl"
    // InternalComponentLanguage.g:977:1: rule__Component__Group_3__0__Impl : ( 'rendered_by ' ) ;
    public final void rule__Component__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:981:1: ( ( 'rendered_by ' ) )
            // InternalComponentLanguage.g:982:1: ( 'rendered_by ' )
            {
            // InternalComponentLanguage.g:982:1: ( 'rendered_by ' )
            // InternalComponentLanguage.g:983:2: 'rendered_by '
            {
             before(grammarAccess.getComponentAccess().getRendered_byKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRendered_byKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__0__Impl"


    // $ANTLR start "rule__Component__Group_3__1"
    // InternalComponentLanguage.g:992:1: rule__Component__Group_3__1 : rule__Component__Group_3__1__Impl ;
    public final void rule__Component__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:996:1: ( rule__Component__Group_3__1__Impl )
            // InternalComponentLanguage.g:997:2: rule__Component__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__1"


    // $ANTLR start "rule__Component__Group_3__1__Impl"
    // InternalComponentLanguage.g:1003:1: rule__Component__Group_3__1__Impl : ( ( rule__Component__RenderedByAssignment_3_1 ) ) ;
    public final void rule__Component__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1007:1: ( ( ( rule__Component__RenderedByAssignment_3_1 ) ) )
            // InternalComponentLanguage.g:1008:1: ( ( rule__Component__RenderedByAssignment_3_1 ) )
            {
            // InternalComponentLanguage.g:1008:1: ( ( rule__Component__RenderedByAssignment_3_1 ) )
            // InternalComponentLanguage.g:1009:2: ( rule__Component__RenderedByAssignment_3_1 )
            {
             before(grammarAccess.getComponentAccess().getRenderedByAssignment_3_1()); 
            // InternalComponentLanguage.g:1010:2: ( rule__Component__RenderedByAssignment_3_1 )
            // InternalComponentLanguage.g:1010:3: rule__Component__RenderedByAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__RenderedByAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getRenderedByAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_3__1__Impl"


    // $ANTLR start "rule__Component__Group_5__0"
    // InternalComponentLanguage.g:1019:1: rule__Component__Group_5__0 : rule__Component__Group_5__0__Impl rule__Component__Group_5__1 ;
    public final void rule__Component__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1023:1: ( rule__Component__Group_5__0__Impl rule__Component__Group_5__1 )
            // InternalComponentLanguage.g:1024:2: rule__Component__Group_5__0__Impl rule__Component__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__0"


    // $ANTLR start "rule__Component__Group_5__0__Impl"
    // InternalComponentLanguage.g:1031:1: rule__Component__Group_5__0__Impl : ( 'extends' ) ;
    public final void rule__Component__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1035:1: ( ( 'extends' ) )
            // InternalComponentLanguage.g:1036:1: ( 'extends' )
            {
            // InternalComponentLanguage.g:1036:1: ( 'extends' )
            // InternalComponentLanguage.g:1037:2: 'extends'
            {
             before(grammarAccess.getComponentAccess().getExtendsKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getExtendsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__0__Impl"


    // $ANTLR start "rule__Component__Group_5__1"
    // InternalComponentLanguage.g:1046:1: rule__Component__Group_5__1 : rule__Component__Group_5__1__Impl ;
    public final void rule__Component__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1050:1: ( rule__Component__Group_5__1__Impl )
            // InternalComponentLanguage.g:1051:2: rule__Component__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__1"


    // $ANTLR start "rule__Component__Group_5__1__Impl"
    // InternalComponentLanguage.g:1057:1: rule__Component__Group_5__1__Impl : ( ( rule__Component__ExtendsAssignment_5_1 ) ) ;
    public final void rule__Component__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1061:1: ( ( ( rule__Component__ExtendsAssignment_5_1 ) ) )
            // InternalComponentLanguage.g:1062:1: ( ( rule__Component__ExtendsAssignment_5_1 ) )
            {
            // InternalComponentLanguage.g:1062:1: ( ( rule__Component__ExtendsAssignment_5_1 ) )
            // InternalComponentLanguage.g:1063:2: ( rule__Component__ExtendsAssignment_5_1 )
            {
             before(grammarAccess.getComponentAccess().getExtendsAssignment_5_1()); 
            // InternalComponentLanguage.g:1064:2: ( rule__Component__ExtendsAssignment_5_1 )
            // InternalComponentLanguage.g:1064:3: rule__Component__ExtendsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ExtendsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getExtendsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__1__Impl"


    // $ANTLR start "rule__Component__Group_9__0"
    // InternalComponentLanguage.g:1073:1: rule__Component__Group_9__0 : rule__Component__Group_9__0__Impl rule__Component__Group_9__1 ;
    public final void rule__Component__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1077:1: ( rule__Component__Group_9__0__Impl rule__Component__Group_9__1 )
            // InternalComponentLanguage.g:1078:2: rule__Component__Group_9__0__Impl rule__Component__Group_9__1
            {
            pushFollow(FOLLOW_13);
            rule__Component__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9__0"


    // $ANTLR start "rule__Component__Group_9__0__Impl"
    // InternalComponentLanguage.g:1085:1: rule__Component__Group_9__0__Impl : ( 'description' ) ;
    public final void rule__Component__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1089:1: ( ( 'description' ) )
            // InternalComponentLanguage.g:1090:1: ( 'description' )
            {
            // InternalComponentLanguage.g:1090:1: ( 'description' )
            // InternalComponentLanguage.g:1091:2: 'description'
            {
             before(grammarAccess.getComponentAccess().getDescriptionKeyword_9_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getDescriptionKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9__0__Impl"


    // $ANTLR start "rule__Component__Group_9__1"
    // InternalComponentLanguage.g:1100:1: rule__Component__Group_9__1 : rule__Component__Group_9__1__Impl ;
    public final void rule__Component__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1104:1: ( rule__Component__Group_9__1__Impl )
            // InternalComponentLanguage.g:1105:2: rule__Component__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9__1"


    // $ANTLR start "rule__Component__Group_9__1__Impl"
    // InternalComponentLanguage.g:1111:1: rule__Component__Group_9__1__Impl : ( ( rule__Component__DescriptionAssignment_9_1 ) ) ;
    public final void rule__Component__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1115:1: ( ( ( rule__Component__DescriptionAssignment_9_1 ) ) )
            // InternalComponentLanguage.g:1116:1: ( ( rule__Component__DescriptionAssignment_9_1 ) )
            {
            // InternalComponentLanguage.g:1116:1: ( ( rule__Component__DescriptionAssignment_9_1 ) )
            // InternalComponentLanguage.g:1117:2: ( rule__Component__DescriptionAssignment_9_1 )
            {
             before(grammarAccess.getComponentAccess().getDescriptionAssignment_9_1()); 
            // InternalComponentLanguage.g:1118:2: ( rule__Component__DescriptionAssignment_9_1 )
            // InternalComponentLanguage.g:1118:3: rule__Component__DescriptionAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__DescriptionAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getDescriptionAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9__1__Impl"


    // $ANTLR start "rule__Component__Group_12__0"
    // InternalComponentLanguage.g:1127:1: rule__Component__Group_12__0 : rule__Component__Group_12__0__Impl rule__Component__Group_12__1 ;
    public final void rule__Component__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1131:1: ( rule__Component__Group_12__0__Impl rule__Component__Group_12__1 )
            // InternalComponentLanguage.g:1132:2: rule__Component__Group_12__0__Impl rule__Component__Group_12__1
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_12__0"


    // $ANTLR start "rule__Component__Group_12__0__Impl"
    // InternalComponentLanguage.g:1139:1: rule__Component__Group_12__0__Impl : ( '+' ) ;
    public final void rule__Component__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1143:1: ( ( '+' ) )
            // InternalComponentLanguage.g:1144:1: ( '+' )
            {
            // InternalComponentLanguage.g:1144:1: ( '+' )
            // InternalComponentLanguage.g:1145:2: '+'
            {
             before(grammarAccess.getComponentAccess().getPlusSignKeyword_12_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getPlusSignKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_12__0__Impl"


    // $ANTLR start "rule__Component__Group_12__1"
    // InternalComponentLanguage.g:1154:1: rule__Component__Group_12__1 : rule__Component__Group_12__1__Impl ;
    public final void rule__Component__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1158:1: ( rule__Component__Group_12__1__Impl )
            // InternalComponentLanguage.g:1159:2: rule__Component__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_12__1"


    // $ANTLR start "rule__Component__Group_12__1__Impl"
    // InternalComponentLanguage.g:1165:1: rule__Component__Group_12__1__Impl : ( ( rule__Component__AttributeListsAssignment_12_1 ) ) ;
    public final void rule__Component__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1169:1: ( ( ( rule__Component__AttributeListsAssignment_12_1 ) ) )
            // InternalComponentLanguage.g:1170:1: ( ( rule__Component__AttributeListsAssignment_12_1 ) )
            {
            // InternalComponentLanguage.g:1170:1: ( ( rule__Component__AttributeListsAssignment_12_1 ) )
            // InternalComponentLanguage.g:1171:2: ( rule__Component__AttributeListsAssignment_12_1 )
            {
             before(grammarAccess.getComponentAccess().getAttributeListsAssignment_12_1()); 
            // InternalComponentLanguage.g:1172:2: ( rule__Component__AttributeListsAssignment_12_1 )
            // InternalComponentLanguage.g:1172:3: rule__Component__AttributeListsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__AttributeListsAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAttributeListsAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_12__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalComponentLanguage.g:1181:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1185:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalComponentLanguage.g:1186:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalComponentLanguage.g:1193:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1197:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalComponentLanguage.g:1198:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalComponentLanguage.g:1198:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalComponentLanguage.g:1199:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalComponentLanguage.g:1200:2: ( rule__Attribute__NameAssignment_0 )
            // InternalComponentLanguage.g:1200:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalComponentLanguage.g:1208:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1212:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalComponentLanguage.g:1213:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalComponentLanguage.g:1220:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__TypeAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1224:1: ( ( ( rule__Attribute__TypeAssignment_1 )? ) )
            // InternalComponentLanguage.g:1225:1: ( ( rule__Attribute__TypeAssignment_1 )? )
            {
            // InternalComponentLanguage.g:1225:1: ( ( rule__Attribute__TypeAssignment_1 )? )
            // InternalComponentLanguage.g:1226:2: ( rule__Attribute__TypeAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 
            // InternalComponentLanguage.g:1227:2: ( rule__Attribute__TypeAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=11 && LA15_0<=27)||LA15_0==40) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentLanguage.g:1227:3: rule__Attribute__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__TypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalComponentLanguage.g:1235:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1239:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalComponentLanguage.g:1240:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalComponentLanguage.g:1247:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1251:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // InternalComponentLanguage.g:1252:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // InternalComponentLanguage.g:1252:1: ( ( rule__Attribute__Group_2__0 )? )
            // InternalComponentLanguage.g:1253:2: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // InternalComponentLanguage.g:1254:2: ( rule__Attribute__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentLanguage.g:1254:3: rule__Attribute__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalComponentLanguage.g:1262:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1266:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalComponentLanguage.g:1267:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalComponentLanguage.g:1274:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__RequiredAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1278:1: ( ( ( rule__Attribute__RequiredAssignment_3 )? ) )
            // InternalComponentLanguage.g:1279:1: ( ( rule__Attribute__RequiredAssignment_3 )? )
            {
            // InternalComponentLanguage.g:1279:1: ( ( rule__Attribute__RequiredAssignment_3 )? )
            // InternalComponentLanguage.g:1280:2: ( rule__Attribute__RequiredAssignment_3 )?
            {
             before(grammarAccess.getAttributeAccess().getRequiredAssignment_3()); 
            // InternalComponentLanguage.g:1281:2: ( rule__Attribute__RequiredAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentLanguage.g:1281:3: rule__Attribute__RequiredAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__RequiredAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getRequiredAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalComponentLanguage.g:1289:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1293:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalComponentLanguage.g:1294:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalComponentLanguage.g:1301:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__InheritedAssignment_4 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1305:1: ( ( ( rule__Attribute__InheritedAssignment_4 )? ) )
            // InternalComponentLanguage.g:1306:1: ( ( rule__Attribute__InheritedAssignment_4 )? )
            {
            // InternalComponentLanguage.g:1306:1: ( ( rule__Attribute__InheritedAssignment_4 )? )
            // InternalComponentLanguage.g:1307:2: ( rule__Attribute__InheritedAssignment_4 )?
            {
             before(grammarAccess.getAttributeAccess().getInheritedAssignment_4()); 
            // InternalComponentLanguage.g:1308:2: ( rule__Attribute__InheritedAssignment_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentLanguage.g:1308:3: rule__Attribute__InheritedAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__InheritedAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getInheritedAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalComponentLanguage.g:1316:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1320:1: ( rule__Attribute__Group__5__Impl )
            // InternalComponentLanguage.g:1321:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalComponentLanguage.g:1327:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__DescAssignment_5 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1331:1: ( ( ( rule__Attribute__DescAssignment_5 )? ) )
            // InternalComponentLanguage.g:1332:1: ( ( rule__Attribute__DescAssignment_5 )? )
            {
            // InternalComponentLanguage.g:1332:1: ( ( rule__Attribute__DescAssignment_5 )? )
            // InternalComponentLanguage.g:1333:2: ( rule__Attribute__DescAssignment_5 )?
            {
             before(grammarAccess.getAttributeAccess().getDescAssignment_5()); 
            // InternalComponentLanguage.g:1334:2: ( rule__Attribute__DescAssignment_5 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentLanguage.g:1334:3: rule__Attribute__DescAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__DescAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getDescAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group_2__0"
    // InternalComponentLanguage.g:1343:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1347:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // InternalComponentLanguage.g:1348:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__0"


    // $ANTLR start "rule__Attribute__Group_2__0__Impl"
    // InternalComponentLanguage.g:1355:1: rule__Attribute__Group_2__0__Impl : ( 'default' ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1359:1: ( ( 'default' ) )
            // InternalComponentLanguage.g:1360:1: ( 'default' )
            {
            // InternalComponentLanguage.g:1360:1: ( 'default' )
            // InternalComponentLanguage.g:1361:2: 'default'
            {
             before(grammarAccess.getAttributeAccess().getDefaultKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDefaultKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2__1"
    // InternalComponentLanguage.g:1370:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1374:1: ( rule__Attribute__Group_2__1__Impl )
            // InternalComponentLanguage.g:1375:2: rule__Attribute__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__1"


    // $ANTLR start "rule__Attribute__Group_2__1__Impl"
    // InternalComponentLanguage.g:1381:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__DefaultValueAssignment_2_1 ) ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1385:1: ( ( ( rule__Attribute__DefaultValueAssignment_2_1 ) ) )
            // InternalComponentLanguage.g:1386:1: ( ( rule__Attribute__DefaultValueAssignment_2_1 ) )
            {
            // InternalComponentLanguage.g:1386:1: ( ( rule__Attribute__DefaultValueAssignment_2_1 ) )
            // InternalComponentLanguage.g:1387:2: ( rule__Attribute__DefaultValueAssignment_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getDefaultValueAssignment_2_1()); 
            // InternalComponentLanguage.g:1388:2: ( rule__Attribute__DefaultValueAssignment_2_1 )
            // InternalComponentLanguage.g:1388:3: rule__Attribute__DefaultValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__DefaultValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDefaultValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalComponentLanguage.g:1397:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1401:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalComponentLanguage.g:1402:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalComponentLanguage.g:1409:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1413:1: ( ( RULE_ID ) )
            // InternalComponentLanguage.g:1414:1: ( RULE_ID )
            {
            // InternalComponentLanguage.g:1414:1: ( RULE_ID )
            // InternalComponentLanguage.g:1415:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalComponentLanguage.g:1424:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1428:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalComponentLanguage.g:1429:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalComponentLanguage.g:1435:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1439:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalComponentLanguage.g:1440:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalComponentLanguage.g:1440:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalComponentLanguage.g:1441:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalComponentLanguage.g:1442:2: ( rule__QualifiedName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalComponentLanguage.g:1442:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalComponentLanguage.g:1451:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1455:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalComponentLanguage.g:1456:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalComponentLanguage.g:1463:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1467:1: ( ( '.' ) )
            // InternalComponentLanguage.g:1468:1: ( '.' )
            {
            // InternalComponentLanguage.g:1468:1: ( '.' )
            // InternalComponentLanguage.g:1469:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalComponentLanguage.g:1478:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1482:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalComponentLanguage.g:1483:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalComponentLanguage.g:1489:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1493:1: ( ( RULE_ID ) )
            // InternalComponentLanguage.g:1494:1: ( RULE_ID )
            {
            // InternalComponentLanguage.g:1494:1: ( RULE_ID )
            // InternalComponentLanguage.g:1495:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__CSSID__Group__0"
    // InternalComponentLanguage.g:1505:1: rule__CSSID__Group__0 : rule__CSSID__Group__0__Impl rule__CSSID__Group__1 ;
    public final void rule__CSSID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1509:1: ( rule__CSSID__Group__0__Impl rule__CSSID__Group__1 )
            // InternalComponentLanguage.g:1510:2: rule__CSSID__Group__0__Impl rule__CSSID__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__CSSID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CSSID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSID__Group__0"


    // $ANTLR start "rule__CSSID__Group__0__Impl"
    // InternalComponentLanguage.g:1517:1: rule__CSSID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__CSSID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1521:1: ( ( RULE_ID ) )
            // InternalComponentLanguage.g:1522:1: ( RULE_ID )
            {
            // InternalComponentLanguage.g:1522:1: ( RULE_ID )
            // InternalComponentLanguage.g:1523:2: RULE_ID
            {
             before(grammarAccess.getCSSIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCSSIDAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSID__Group__0__Impl"


    // $ANTLR start "rule__CSSID__Group__1"
    // InternalComponentLanguage.g:1532:1: rule__CSSID__Group__1 : rule__CSSID__Group__1__Impl ;
    public final void rule__CSSID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1536:1: ( rule__CSSID__Group__1__Impl )
            // InternalComponentLanguage.g:1537:2: rule__CSSID__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSID__Group__1"


    // $ANTLR start "rule__CSSID__Group__1__Impl"
    // InternalComponentLanguage.g:1543:1: rule__CSSID__Group__1__Impl : ( ( rule__CSSID__Group_1__0 )* ) ;
    public final void rule__CSSID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1547:1: ( ( ( rule__CSSID__Group_1__0 )* ) )
            // InternalComponentLanguage.g:1548:1: ( ( rule__CSSID__Group_1__0 )* )
            {
            // InternalComponentLanguage.g:1548:1: ( ( rule__CSSID__Group_1__0 )* )
            // InternalComponentLanguage.g:1549:2: ( rule__CSSID__Group_1__0 )*
            {
             before(grammarAccess.getCSSIDAccess().getGroup_1()); 
            // InternalComponentLanguage.g:1550:2: ( rule__CSSID__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==39) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalComponentLanguage.g:1550:3: rule__CSSID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__CSSID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getCSSIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSID__Group__1__Impl"


    // $ANTLR start "rule__CSSID__Group_1__0"
    // InternalComponentLanguage.g:1559:1: rule__CSSID__Group_1__0 : rule__CSSID__Group_1__0__Impl rule__CSSID__Group_1__1 ;
    public final void rule__CSSID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1563:1: ( rule__CSSID__Group_1__0__Impl rule__CSSID__Group_1__1 )
            // InternalComponentLanguage.g:1564:2: rule__CSSID__Group_1__0__Impl rule__CSSID__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__CSSID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CSSID__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSID__Group_1__0"


    // $ANTLR start "rule__CSSID__Group_1__0__Impl"
    // InternalComponentLanguage.g:1571:1: rule__CSSID__Group_1__0__Impl : ( '-' ) ;
    public final void rule__CSSID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1575:1: ( ( '-' ) )
            // InternalComponentLanguage.g:1576:1: ( '-' )
            {
            // InternalComponentLanguage.g:1576:1: ( '-' )
            // InternalComponentLanguage.g:1577:2: '-'
            {
             before(grammarAccess.getCSSIDAccess().getHyphenMinusKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCSSIDAccess().getHyphenMinusKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSID__Group_1__0__Impl"


    // $ANTLR start "rule__CSSID__Group_1__1"
    // InternalComponentLanguage.g:1586:1: rule__CSSID__Group_1__1 : rule__CSSID__Group_1__1__Impl ;
    public final void rule__CSSID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1590:1: ( rule__CSSID__Group_1__1__Impl )
            // InternalComponentLanguage.g:1591:2: rule__CSSID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSSID__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSID__Group_1__1"


    // $ANTLR start "rule__CSSID__Group_1__1__Impl"
    // InternalComponentLanguage.g:1597:1: rule__CSSID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__CSSID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1601:1: ( ( RULE_ID ) )
            // InternalComponentLanguage.g:1602:1: ( RULE_ID )
            {
            // InternalComponentLanguage.g:1602:1: ( RULE_ID )
            // InternalComponentLanguage.g:1603:2: RULE_ID
            {
             before(grammarAccess.getCSSIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCSSIDAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSSID__Group_1__1__Impl"


    // $ANTLR start "rule__Attributetype__Group_13__0"
    // InternalComponentLanguage.g:1613:1: rule__Attributetype__Group_13__0 : rule__Attributetype__Group_13__0__Impl rule__Attributetype__Group_13__1 ;
    public final void rule__Attributetype__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1617:1: ( rule__Attributetype__Group_13__0__Impl rule__Attributetype__Group_13__1 )
            // InternalComponentLanguage.g:1618:2: rule__Attributetype__Group_13__0__Impl rule__Attributetype__Group_13__1
            {
            pushFollow(FOLLOW_6);
            rule__Attributetype__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributetype__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributetype__Group_13__0"


    // $ANTLR start "rule__Attributetype__Group_13__0__Impl"
    // InternalComponentLanguage.g:1625:1: rule__Attributetype__Group_13__0__Impl : ( 'Map<' ) ;
    public final void rule__Attributetype__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1629:1: ( ( 'Map<' ) )
            // InternalComponentLanguage.g:1630:1: ( 'Map<' )
            {
            // InternalComponentLanguage.g:1630:1: ( 'Map<' )
            // InternalComponentLanguage.g:1631:2: 'Map<'
            {
             before(grammarAccess.getAttributetypeAccess().getMapKeyword_13_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAttributetypeAccess().getMapKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributetype__Group_13__0__Impl"


    // $ANTLR start "rule__Attributetype__Group_13__1"
    // InternalComponentLanguage.g:1640:1: rule__Attributetype__Group_13__1 : rule__Attributetype__Group_13__1__Impl rule__Attributetype__Group_13__2 ;
    public final void rule__Attributetype__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1644:1: ( rule__Attributetype__Group_13__1__Impl rule__Attributetype__Group_13__2 )
            // InternalComponentLanguage.g:1645:2: rule__Attributetype__Group_13__1__Impl rule__Attributetype__Group_13__2
            {
            pushFollow(FOLLOW_19);
            rule__Attributetype__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributetype__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributetype__Group_13__1"


    // $ANTLR start "rule__Attributetype__Group_13__1__Impl"
    // InternalComponentLanguage.g:1652:1: rule__Attributetype__Group_13__1__Impl : ( ruleQualifiedName ) ;
    public final void rule__Attributetype__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1656:1: ( ( ruleQualifiedName ) )
            // InternalComponentLanguage.g:1657:1: ( ruleQualifiedName )
            {
            // InternalComponentLanguage.g:1657:1: ( ruleQualifiedName )
            // InternalComponentLanguage.g:1658:2: ruleQualifiedName
            {
             before(grammarAccess.getAttributetypeAccess().getQualifiedNameParserRuleCall_13_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributetypeAccess().getQualifiedNameParserRuleCall_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributetype__Group_13__1__Impl"


    // $ANTLR start "rule__Attributetype__Group_13__2"
    // InternalComponentLanguage.g:1667:1: rule__Attributetype__Group_13__2 : rule__Attributetype__Group_13__2__Impl rule__Attributetype__Group_13__3 ;
    public final void rule__Attributetype__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1671:1: ( rule__Attributetype__Group_13__2__Impl rule__Attributetype__Group_13__3 )
            // InternalComponentLanguage.g:1672:2: rule__Attributetype__Group_13__2__Impl rule__Attributetype__Group_13__3
            {
            pushFollow(FOLLOW_6);
            rule__Attributetype__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributetype__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributetype__Group_13__2"


    // $ANTLR start "rule__Attributetype__Group_13__2__Impl"
    // InternalComponentLanguage.g:1679:1: rule__Attributetype__Group_13__2__Impl : ( ',' ) ;
    public final void rule__Attributetype__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1683:1: ( ( ',' ) )
            // InternalComponentLanguage.g:1684:1: ( ',' )
            {
            // InternalComponentLanguage.g:1684:1: ( ',' )
            // InternalComponentLanguage.g:1685:2: ','
            {
             before(grammarAccess.getAttributetypeAccess().getCommaKeyword_13_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAttributetypeAccess().getCommaKeyword_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributetype__Group_13__2__Impl"


    // $ANTLR start "rule__Attributetype__Group_13__3"
    // InternalComponentLanguage.g:1694:1: rule__Attributetype__Group_13__3 : rule__Attributetype__Group_13__3__Impl rule__Attributetype__Group_13__4 ;
    public final void rule__Attributetype__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1698:1: ( rule__Attributetype__Group_13__3__Impl rule__Attributetype__Group_13__4 )
            // InternalComponentLanguage.g:1699:2: rule__Attributetype__Group_13__3__Impl rule__Attributetype__Group_13__4
            {
            pushFollow(FOLLOW_20);
            rule__Attributetype__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributetype__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributetype__Group_13__3"


    // $ANTLR start "rule__Attributetype__Group_13__3__Impl"
    // InternalComponentLanguage.g:1706:1: rule__Attributetype__Group_13__3__Impl : ( ruleQualifiedName ) ;
    public final void rule__Attributetype__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1710:1: ( ( ruleQualifiedName ) )
            // InternalComponentLanguage.g:1711:1: ( ruleQualifiedName )
            {
            // InternalComponentLanguage.g:1711:1: ( ruleQualifiedName )
            // InternalComponentLanguage.g:1712:2: ruleQualifiedName
            {
             before(grammarAccess.getAttributetypeAccess().getQualifiedNameParserRuleCall_13_3()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributetypeAccess().getQualifiedNameParserRuleCall_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributetype__Group_13__3__Impl"


    // $ANTLR start "rule__Attributetype__Group_13__4"
    // InternalComponentLanguage.g:1721:1: rule__Attributetype__Group_13__4 : rule__Attributetype__Group_13__4__Impl ;
    public final void rule__Attributetype__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1725:1: ( rule__Attributetype__Group_13__4__Impl )
            // InternalComponentLanguage.g:1726:2: rule__Attributetype__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributetype__Group_13__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributetype__Group_13__4"


    // $ANTLR start "rule__Attributetype__Group_13__4__Impl"
    // InternalComponentLanguage.g:1732:1: rule__Attributetype__Group_13__4__Impl : ( '>' ) ;
    public final void rule__Attributetype__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1736:1: ( ( '>' ) )
            // InternalComponentLanguage.g:1737:1: ( '>' )
            {
            // InternalComponentLanguage.g:1737:1: ( '>' )
            // InternalComponentLanguage.g:1738:2: '>'
            {
             before(grammarAccess.getAttributetypeAccess().getGreaterThanSignKeyword_13_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAttributetypeAccess().getGreaterThanSignKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributetype__Group_13__4__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment_0"
    // InternalComponentLanguage.g:1748:1: rule__Domainmodel__ElementsAssignment_0 : ( ruleAttributeList ) ;
    public final void rule__Domainmodel__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1752:1: ( ( ruleAttributeList ) )
            // InternalComponentLanguage.g:1753:2: ( ruleAttributeList )
            {
            // InternalComponentLanguage.g:1753:2: ( ruleAttributeList )
            // InternalComponentLanguage.g:1754:3: ruleAttributeList
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAttributeListParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsAttributeListParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment_0"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment_1"
    // InternalComponentLanguage.g:1763:1: rule__Domainmodel__ElementsAssignment_1 : ( ruleComponent ) ;
    public final void rule__Domainmodel__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1767:1: ( ( ruleComponent ) )
            // InternalComponentLanguage.g:1768:2: ( ruleComponent )
            {
            // InternalComponentLanguage.g:1768:2: ( ruleComponent )
            // InternalComponentLanguage.g:1769:3: ruleComponent
            {
             before(grammarAccess.getDomainmodelAccess().getElementsComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsComponentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment_1"


    // $ANTLR start "rule__AttributeList__NameAssignment_1"
    // InternalComponentLanguage.g:1778:1: rule__AttributeList__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributeList__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1782:1: ( ( RULE_ID ) )
            // InternalComponentLanguage.g:1783:2: ( RULE_ID )
            {
            // InternalComponentLanguage.g:1783:2: ( RULE_ID )
            // InternalComponentLanguage.g:1784:3: RULE_ID
            {
             before(grammarAccess.getAttributeListAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeListAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__NameAssignment_1"


    // $ANTLR start "rule__AttributeList__AttributesAssignment_3"
    // InternalComponentLanguage.g:1793:1: rule__AttributeList__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1797:1: ( ( ruleAttribute ) )
            // InternalComponentLanguage.g:1798:2: ( ruleAttribute )
            {
            // InternalComponentLanguage.g:1798:2: ( ruleAttribute )
            // InternalComponentLanguage.g:1799:3: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__AttributesAssignment_3"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalComponentLanguage.g:1808:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1812:1: ( ( RULE_ID ) )
            // InternalComponentLanguage.g:1813:2: ( RULE_ID )
            {
            // InternalComponentLanguage.g:1813:2: ( RULE_ID )
            // InternalComponentLanguage.g:1814:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__ImplementedByAssignment_2_1"
    // InternalComponentLanguage.g:1823:1: rule__Component__ImplementedByAssignment_2_1 : ( ruleQualifiedName ) ;
    public final void rule__Component__ImplementedByAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1827:1: ( ( ruleQualifiedName ) )
            // InternalComponentLanguage.g:1828:2: ( ruleQualifiedName )
            {
            // InternalComponentLanguage.g:1828:2: ( ruleQualifiedName )
            // InternalComponentLanguage.g:1829:3: ruleQualifiedName
            {
             before(grammarAccess.getComponentAccess().getImplementedByQualifiedNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getImplementedByQualifiedNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ImplementedByAssignment_2_1"


    // $ANTLR start "rule__Component__RenderedByAssignment_3_1"
    // InternalComponentLanguage.g:1838:1: rule__Component__RenderedByAssignment_3_1 : ( ruleQualifiedName ) ;
    public final void rule__Component__RenderedByAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1842:1: ( ( ruleQualifiedName ) )
            // InternalComponentLanguage.g:1843:2: ( ruleQualifiedName )
            {
            // InternalComponentLanguage.g:1843:2: ( ruleQualifiedName )
            // InternalComponentLanguage.g:1844:3: ruleQualifiedName
            {
             before(grammarAccess.getComponentAccess().getRenderedByQualifiedNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getRenderedByQualifiedNameParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__RenderedByAssignment_3_1"


    // $ANTLR start "rule__Component__ProcessesInputAssignment_4"
    // InternalComponentLanguage.g:1853:1: rule__Component__ProcessesInputAssignment_4 : ( ( 'processes_input' ) ) ;
    public final void rule__Component__ProcessesInputAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1857:1: ( ( ( 'processes_input' ) ) )
            // InternalComponentLanguage.g:1858:2: ( ( 'processes_input' ) )
            {
            // InternalComponentLanguage.g:1858:2: ( ( 'processes_input' ) )
            // InternalComponentLanguage.g:1859:3: ( 'processes_input' )
            {
             before(grammarAccess.getComponentAccess().getProcessesInputProcesses_inputKeyword_4_0()); 
            // InternalComponentLanguage.g:1860:3: ( 'processes_input' )
            // InternalComponentLanguage.g:1861:4: 'processes_input'
            {
             before(grammarAccess.getComponentAccess().getProcessesInputProcesses_inputKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getProcessesInputProcesses_inputKeyword_4_0()); 

            }

             after(grammarAccess.getComponentAccess().getProcessesInputProcesses_inputKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ProcessesInputAssignment_4"


    // $ANTLR start "rule__Component__ExtendsAssignment_5_1"
    // InternalComponentLanguage.g:1872:1: rule__Component__ExtendsAssignment_5_1 : ( ruleQualifiedName ) ;
    public final void rule__Component__ExtendsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1876:1: ( ( ruleQualifiedName ) )
            // InternalComponentLanguage.g:1877:2: ( ruleQualifiedName )
            {
            // InternalComponentLanguage.g:1877:2: ( ruleQualifiedName )
            // InternalComponentLanguage.g:1878:3: ruleQualifiedName
            {
             before(grammarAccess.getComponentAccess().getExtendsQualifiedNameParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getExtendsQualifiedNameParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ExtendsAssignment_5_1"


    // $ANTLR start "rule__Component__HasChildrenAssignment_6"
    // InternalComponentLanguage.g:1887:1: rule__Component__HasChildrenAssignment_6 : ( ( 'has_children' ) ) ;
    public final void rule__Component__HasChildrenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1891:1: ( ( ( 'has_children' ) ) )
            // InternalComponentLanguage.g:1892:2: ( ( 'has_children' ) )
            {
            // InternalComponentLanguage.g:1892:2: ( ( 'has_children' ) )
            // InternalComponentLanguage.g:1893:3: ( 'has_children' )
            {
             before(grammarAccess.getComponentAccess().getHasChildrenHas_childrenKeyword_6_0()); 
            // InternalComponentLanguage.g:1894:3: ( 'has_children' )
            // InternalComponentLanguage.g:1895:4: 'has_children'
            {
             before(grammarAccess.getComponentAccess().getHasChildrenHas_childrenKeyword_6_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getHasChildrenHas_childrenKeyword_6_0()); 

            }

             after(grammarAccess.getComponentAccess().getHasChildrenHas_childrenKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__HasChildrenAssignment_6"


    // $ANTLR start "rule__Component__HasTooltipAssignment_7"
    // InternalComponentLanguage.g:1906:1: rule__Component__HasTooltipAssignment_7 : ( ( 'has_tooltip' ) ) ;
    public final void rule__Component__HasTooltipAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1910:1: ( ( ( 'has_tooltip' ) ) )
            // InternalComponentLanguage.g:1911:2: ( ( 'has_tooltip' ) )
            {
            // InternalComponentLanguage.g:1911:2: ( ( 'has_tooltip' ) )
            // InternalComponentLanguage.g:1912:3: ( 'has_tooltip' )
            {
             before(grammarAccess.getComponentAccess().getHasTooltipHas_tooltipKeyword_7_0()); 
            // InternalComponentLanguage.g:1913:3: ( 'has_tooltip' )
            // InternalComponentLanguage.g:1914:4: 'has_tooltip'
            {
             before(grammarAccess.getComponentAccess().getHasTooltipHas_tooltipKeyword_7_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getHasTooltipHas_tooltipKeyword_7_0()); 

            }

             after(grammarAccess.getComponentAccess().getHasTooltipHas_tooltipKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__HasTooltipAssignment_7"


    // $ANTLR start "rule__Component__IsReponsiveAssignment_8"
    // InternalComponentLanguage.g:1925:1: rule__Component__IsReponsiveAssignment_8 : ( ( 'is_responsive' ) ) ;
    public final void rule__Component__IsReponsiveAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1929:1: ( ( ( 'is_responsive' ) ) )
            // InternalComponentLanguage.g:1930:2: ( ( 'is_responsive' ) )
            {
            // InternalComponentLanguage.g:1930:2: ( ( 'is_responsive' ) )
            // InternalComponentLanguage.g:1931:3: ( 'is_responsive' )
            {
             before(grammarAccess.getComponentAccess().getIsReponsiveIs_responsiveKeyword_8_0()); 
            // InternalComponentLanguage.g:1932:3: ( 'is_responsive' )
            // InternalComponentLanguage.g:1933:4: 'is_responsive'
            {
             before(grammarAccess.getComponentAccess().getIsReponsiveIs_responsiveKeyword_8_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getIsReponsiveIs_responsiveKeyword_8_0()); 

            }

             after(grammarAccess.getComponentAccess().getIsReponsiveIs_responsiveKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__IsReponsiveAssignment_8"


    // $ANTLR start "rule__Component__DescriptionAssignment_9_1"
    // InternalComponentLanguage.g:1944:1: rule__Component__DescriptionAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__Component__DescriptionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1948:1: ( ( RULE_STRING ) )
            // InternalComponentLanguage.g:1949:2: ( RULE_STRING )
            {
            // InternalComponentLanguage.g:1949:2: ( RULE_STRING )
            // InternalComponentLanguage.g:1950:3: RULE_STRING
            {
             before(grammarAccess.getComponentAccess().getDescriptionSTRINGTerminalRuleCall_9_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getDescriptionSTRINGTerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__DescriptionAssignment_9_1"


    // $ANTLR start "rule__Component__AttributesAssignment_11"
    // InternalComponentLanguage.g:1959:1: rule__Component__AttributesAssignment_11 : ( ruleAttribute ) ;
    public final void rule__Component__AttributesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1963:1: ( ( ruleAttribute ) )
            // InternalComponentLanguage.g:1964:2: ( ruleAttribute )
            {
            // InternalComponentLanguage.g:1964:2: ( ruleAttribute )
            // InternalComponentLanguage.g:1965:3: ruleAttribute
            {
             before(grammarAccess.getComponentAccess().getAttributesAttributeParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getAttributesAttributeParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__AttributesAssignment_11"


    // $ANTLR start "rule__Component__AttributeListsAssignment_12_1"
    // InternalComponentLanguage.g:1974:1: rule__Component__AttributeListsAssignment_12_1 : ( RULE_ID ) ;
    public final void rule__Component__AttributeListsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1978:1: ( ( RULE_ID ) )
            // InternalComponentLanguage.g:1979:2: ( RULE_ID )
            {
            // InternalComponentLanguage.g:1979:2: ( RULE_ID )
            // InternalComponentLanguage.g:1980:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getAttributeListsIDTerminalRuleCall_12_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getAttributeListsIDTerminalRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__AttributeListsAssignment_12_1"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalComponentLanguage.g:1989:1: rule__Attribute__NameAssignment_0 : ( ruleCSSID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:1993:1: ( ( ruleCSSID ) )
            // InternalComponentLanguage.g:1994:2: ( ruleCSSID )
            {
            // InternalComponentLanguage.g:1994:2: ( ruleCSSID )
            // InternalComponentLanguage.g:1995:3: ruleCSSID
            {
             before(grammarAccess.getAttributeAccess().getNameCSSIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCSSID();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameCSSIDParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_1"
    // InternalComponentLanguage.g:2004:1: rule__Attribute__TypeAssignment_1 : ( ruleAttributetype ) ;
    public final void rule__Attribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:2008:1: ( ( ruleAttributetype ) )
            // InternalComponentLanguage.g:2009:2: ( ruleAttributetype )
            {
            // InternalComponentLanguage.g:2009:2: ( ruleAttributetype )
            // InternalComponentLanguage.g:2010:3: ruleAttributetype
            {
             before(grammarAccess.getAttributeAccess().getTypeAttributetypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributetype();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeAttributetypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_1"


    // $ANTLR start "rule__Attribute__DefaultValueAssignment_2_1"
    // InternalComponentLanguage.g:2019:1: rule__Attribute__DefaultValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__DefaultValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:2023:1: ( ( RULE_STRING ) )
            // InternalComponentLanguage.g:2024:2: ( RULE_STRING )
            {
            // InternalComponentLanguage.g:2024:2: ( RULE_STRING )
            // InternalComponentLanguage.g:2025:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DefaultValueAssignment_2_1"


    // $ANTLR start "rule__Attribute__RequiredAssignment_3"
    // InternalComponentLanguage.g:2034:1: rule__Attribute__RequiredAssignment_3 : ( ( 'mandatory' ) ) ;
    public final void rule__Attribute__RequiredAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:2038:1: ( ( ( 'mandatory' ) ) )
            // InternalComponentLanguage.g:2039:2: ( ( 'mandatory' ) )
            {
            // InternalComponentLanguage.g:2039:2: ( ( 'mandatory' ) )
            // InternalComponentLanguage.g:2040:3: ( 'mandatory' )
            {
             before(grammarAccess.getAttributeAccess().getRequiredMandatoryKeyword_3_0()); 
            // InternalComponentLanguage.g:2041:3: ( 'mandatory' )
            // InternalComponentLanguage.g:2042:4: 'mandatory'
            {
             before(grammarAccess.getAttributeAccess().getRequiredMandatoryKeyword_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRequiredMandatoryKeyword_3_0()); 

            }

             after(grammarAccess.getAttributeAccess().getRequiredMandatoryKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__RequiredAssignment_3"


    // $ANTLR start "rule__Attribute__InheritedAssignment_4"
    // InternalComponentLanguage.g:2053:1: rule__Attribute__InheritedAssignment_4 : ( ( 'inherited' ) ) ;
    public final void rule__Attribute__InheritedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:2057:1: ( ( ( 'inherited' ) ) )
            // InternalComponentLanguage.g:2058:2: ( ( 'inherited' ) )
            {
            // InternalComponentLanguage.g:2058:2: ( ( 'inherited' ) )
            // InternalComponentLanguage.g:2059:3: ( 'inherited' )
            {
             before(grammarAccess.getAttributeAccess().getInheritedInheritedKeyword_4_0()); 
            // InternalComponentLanguage.g:2060:3: ( 'inherited' )
            // InternalComponentLanguage.g:2061:4: 'inherited'
            {
             before(grammarAccess.getAttributeAccess().getInheritedInheritedKeyword_4_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getInheritedInheritedKeyword_4_0()); 

            }

             after(grammarAccess.getAttributeAccess().getInheritedInheritedKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__InheritedAssignment_4"


    // $ANTLR start "rule__Attribute__DescAssignment_5"
    // InternalComponentLanguage.g:2072:1: rule__Attribute__DescAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Attribute__DescAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentLanguage.g:2076:1: ( ( RULE_STRING ) )
            // InternalComponentLanguage.g:2077:2: ( RULE_STRING )
            {
            // InternalComponentLanguage.g:2077:2: ( RULE_STRING )
            // InternalComponentLanguage.g:2078:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getDescSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDescSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DescAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000780F20000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001040000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000181200FFFF820L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});

}