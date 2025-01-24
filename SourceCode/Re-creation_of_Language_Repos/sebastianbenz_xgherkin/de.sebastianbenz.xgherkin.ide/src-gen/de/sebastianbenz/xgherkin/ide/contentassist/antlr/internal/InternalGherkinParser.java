package de.sebastianbenz.xgherkin.ide.contentassist.antlr.internal;

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
import de.sebastianbenz.xgherkin.services.GherkinGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGherkinParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TEXT", "RULE_CODE", "RULE_EXAMPLE_HEADING", "RULE_EXAMPLE_ROW_END", "RULE_TAG", "RULE_FEATURE_TEXT", "RULE_AS_A", "RULE_IN_ORDER_TO", "RULE_I_WANT_TO", "RULE_SCENARIO_TEXT", "RULE_SCENARIO_OUTLINE_TEXT", "RULE_EXAMPLE_CELL", "RULE_BACKGROUND_TEXT", "RULE_WHEN_TEXT", "RULE_THEN_TEXT", "RULE_GIVEN_TEXT", "RULE_AND_TEXT", "RULE_SPACES", "RULE_NNL", "RULE_NL", "RULE_SL_COMMENT", "RULE_WS"
    };
    public static final int RULE_WHEN_TEXT=17;
    public static final int RULE_TAG=8;
    public static final int RULE_I_WANT_TO=12;
    public static final int RULE_THEN_TEXT=18;
    public static final int RULE_FEATURE_TEXT=9;
    public static final int RULE_SCENARIO_TEXT=13;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_GIVEN_TEXT=19;
    public static final int RULE_EXAMPLE_HEADING=6;
    public static final int RULE_BACKGROUND_TEXT=16;
    public static final int EOF=-1;
    public static final int RULE_IN_ORDER_TO=11;
    public static final int RULE_AND_TEXT=20;
    public static final int RULE_WS=25;
    public static final int RULE_SCENARIO_OUTLINE_TEXT=14;
    public static final int RULE_SPACES=21;
    public static final int RULE_CODE=5;
    public static final int RULE_NNL=22;
    public static final int RULE_EXAMPLE_CELL=15;
    public static final int RULE_AS_A=10;
    public static final int RULE_TEXT=4;
    public static final int RULE_NL=23;
    public static final int RULE_EXAMPLE_ROW_END=7;

    // delegates
    // delegators


        public InternalGherkinParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGherkinParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGherkinParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGherkin.g"; }


    	private GherkinGrammarAccess grammarAccess;

    	public void setGrammarAccess(GherkinGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleFeature"
    // InternalGherkin.g:53:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalGherkin.g:54:1: ( ruleFeature EOF )
            // InternalGherkin.g:55:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalGherkin.g:62:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:66:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalGherkin.g:67:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalGherkin.g:67:2: ( ( rule__Feature__Group__0 ) )
            // InternalGherkin.g:68:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalGherkin.g:69:3: ( rule__Feature__Group__0 )
            // InternalGherkin.g:69:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleNarrativeElement"
    // InternalGherkin.g:78:1: entryRuleNarrativeElement : ruleNarrativeElement EOF ;
    public final void entryRuleNarrativeElement() throws RecognitionException {
        try {
            // InternalGherkin.g:79:1: ( ruleNarrativeElement EOF )
            // InternalGherkin.g:80:1: ruleNarrativeElement EOF
            {
             before(grammarAccess.getNarrativeElementRule()); 
            pushFollow(FOLLOW_1);
            ruleNarrativeElement();

            state._fsp--;

             after(grammarAccess.getNarrativeElementRule()); 
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
    // $ANTLR end "entryRuleNarrativeElement"


    // $ANTLR start "ruleNarrativeElement"
    // InternalGherkin.g:87:1: ruleNarrativeElement : ( ( rule__NarrativeElement__Alternatives ) ) ;
    public final void ruleNarrativeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:91:2: ( ( ( rule__NarrativeElement__Alternatives ) ) )
            // InternalGherkin.g:92:2: ( ( rule__NarrativeElement__Alternatives ) )
            {
            // InternalGherkin.g:92:2: ( ( rule__NarrativeElement__Alternatives ) )
            // InternalGherkin.g:93:3: ( rule__NarrativeElement__Alternatives )
            {
             before(grammarAccess.getNarrativeElementAccess().getAlternatives()); 
            // InternalGherkin.g:94:3: ( rule__NarrativeElement__Alternatives )
            // InternalGherkin.g:94:4: rule__NarrativeElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NarrativeElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNarrativeElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNarrativeElement"


    // $ANTLR start "entryRuleFreeText"
    // InternalGherkin.g:103:1: entryRuleFreeText : ruleFreeText EOF ;
    public final void entryRuleFreeText() throws RecognitionException {
        try {
            // InternalGherkin.g:104:1: ( ruleFreeText EOF )
            // InternalGherkin.g:105:1: ruleFreeText EOF
            {
             before(grammarAccess.getFreeTextRule()); 
            pushFollow(FOLLOW_1);
            ruleFreeText();

            state._fsp--;

             after(grammarAccess.getFreeTextRule()); 
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
    // $ANTLR end "entryRuleFreeText"


    // $ANTLR start "ruleFreeText"
    // InternalGherkin.g:112:1: ruleFreeText : ( ( rule__FreeText__NameAssignment ) ) ;
    public final void ruleFreeText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:116:2: ( ( ( rule__FreeText__NameAssignment ) ) )
            // InternalGherkin.g:117:2: ( ( rule__FreeText__NameAssignment ) )
            {
            // InternalGherkin.g:117:2: ( ( rule__FreeText__NameAssignment ) )
            // InternalGherkin.g:118:3: ( rule__FreeText__NameAssignment )
            {
             before(grammarAccess.getFreeTextAccess().getNameAssignment()); 
            // InternalGherkin.g:119:3: ( rule__FreeText__NameAssignment )
            // InternalGherkin.g:119:4: rule__FreeText__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FreeText__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFreeTextAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleFreeText"


    // $ANTLR start "entryRuleAsA"
    // InternalGherkin.g:128:1: entryRuleAsA : ruleAsA EOF ;
    public final void entryRuleAsA() throws RecognitionException {
        try {
            // InternalGherkin.g:129:1: ( ruleAsA EOF )
            // InternalGherkin.g:130:1: ruleAsA EOF
            {
             before(grammarAccess.getAsARule()); 
            pushFollow(FOLLOW_1);
            ruleAsA();

            state._fsp--;

             after(grammarAccess.getAsARule()); 
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
    // $ANTLR end "entryRuleAsA"


    // $ANTLR start "ruleAsA"
    // InternalGherkin.g:137:1: ruleAsA : ( ( rule__AsA__NameAssignment ) ) ;
    public final void ruleAsA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:141:2: ( ( ( rule__AsA__NameAssignment ) ) )
            // InternalGherkin.g:142:2: ( ( rule__AsA__NameAssignment ) )
            {
            // InternalGherkin.g:142:2: ( ( rule__AsA__NameAssignment ) )
            // InternalGherkin.g:143:3: ( rule__AsA__NameAssignment )
            {
             before(grammarAccess.getAsAAccess().getNameAssignment()); 
            // InternalGherkin.g:144:3: ( rule__AsA__NameAssignment )
            // InternalGherkin.g:144:4: rule__AsA__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AsA__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAsAAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleAsA"


    // $ANTLR start "entryRuleInOrderTo"
    // InternalGherkin.g:153:1: entryRuleInOrderTo : ruleInOrderTo EOF ;
    public final void entryRuleInOrderTo() throws RecognitionException {
        try {
            // InternalGherkin.g:154:1: ( ruleInOrderTo EOF )
            // InternalGherkin.g:155:1: ruleInOrderTo EOF
            {
             before(grammarAccess.getInOrderToRule()); 
            pushFollow(FOLLOW_1);
            ruleInOrderTo();

            state._fsp--;

             after(grammarAccess.getInOrderToRule()); 
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
    // $ANTLR end "entryRuleInOrderTo"


    // $ANTLR start "ruleInOrderTo"
    // InternalGherkin.g:162:1: ruleInOrderTo : ( ( rule__InOrderTo__NameAssignment ) ) ;
    public final void ruleInOrderTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:166:2: ( ( ( rule__InOrderTo__NameAssignment ) ) )
            // InternalGherkin.g:167:2: ( ( rule__InOrderTo__NameAssignment ) )
            {
            // InternalGherkin.g:167:2: ( ( rule__InOrderTo__NameAssignment ) )
            // InternalGherkin.g:168:3: ( rule__InOrderTo__NameAssignment )
            {
             before(grammarAccess.getInOrderToAccess().getNameAssignment()); 
            // InternalGherkin.g:169:3: ( rule__InOrderTo__NameAssignment )
            // InternalGherkin.g:169:4: rule__InOrderTo__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__InOrderTo__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInOrderToAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleInOrderTo"


    // $ANTLR start "entryRuleIWantTo"
    // InternalGherkin.g:178:1: entryRuleIWantTo : ruleIWantTo EOF ;
    public final void entryRuleIWantTo() throws RecognitionException {
        try {
            // InternalGherkin.g:179:1: ( ruleIWantTo EOF )
            // InternalGherkin.g:180:1: ruleIWantTo EOF
            {
             before(grammarAccess.getIWantToRule()); 
            pushFollow(FOLLOW_1);
            ruleIWantTo();

            state._fsp--;

             after(grammarAccess.getIWantToRule()); 
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
    // $ANTLR end "entryRuleIWantTo"


    // $ANTLR start "ruleIWantTo"
    // InternalGherkin.g:187:1: ruleIWantTo : ( ( rule__IWantTo__NameAssignment ) ) ;
    public final void ruleIWantTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:191:2: ( ( ( rule__IWantTo__NameAssignment ) ) )
            // InternalGherkin.g:192:2: ( ( rule__IWantTo__NameAssignment ) )
            {
            // InternalGherkin.g:192:2: ( ( rule__IWantTo__NameAssignment ) )
            // InternalGherkin.g:193:3: ( rule__IWantTo__NameAssignment )
            {
             before(grammarAccess.getIWantToAccess().getNameAssignment()); 
            // InternalGherkin.g:194:3: ( rule__IWantTo__NameAssignment )
            // InternalGherkin.g:194:4: rule__IWantTo__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IWantTo__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIWantToAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleIWantTo"


    // $ANTLR start "entryRuleAbstractScenario"
    // InternalGherkin.g:203:1: entryRuleAbstractScenario : ruleAbstractScenario EOF ;
    public final void entryRuleAbstractScenario() throws RecognitionException {
        try {
            // InternalGherkin.g:204:1: ( ruleAbstractScenario EOF )
            // InternalGherkin.g:205:1: ruleAbstractScenario EOF
            {
             before(grammarAccess.getAbstractScenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractScenario();

            state._fsp--;

             after(grammarAccess.getAbstractScenarioRule()); 
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
    // $ANTLR end "entryRuleAbstractScenario"


    // $ANTLR start "ruleAbstractScenario"
    // InternalGherkin.g:212:1: ruleAbstractScenario : ( ( rule__AbstractScenario__Alternatives ) ) ;
    public final void ruleAbstractScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:216:2: ( ( ( rule__AbstractScenario__Alternatives ) ) )
            // InternalGherkin.g:217:2: ( ( rule__AbstractScenario__Alternatives ) )
            {
            // InternalGherkin.g:217:2: ( ( rule__AbstractScenario__Alternatives ) )
            // InternalGherkin.g:218:3: ( rule__AbstractScenario__Alternatives )
            {
             before(grammarAccess.getAbstractScenarioAccess().getAlternatives()); 
            // InternalGherkin.g:219:3: ( rule__AbstractScenario__Alternatives )
            // InternalGherkin.g:219:4: rule__AbstractScenario__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractScenario__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractScenarioAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractScenario"


    // $ANTLR start "entryRuleScenario"
    // InternalGherkin.g:228:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalGherkin.g:229:1: ( ruleScenario EOF )
            // InternalGherkin.g:230:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalGherkin.g:237:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:241:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalGherkin.g:242:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalGherkin.g:242:2: ( ( rule__Scenario__Group__0 ) )
            // InternalGherkin.g:243:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalGherkin.g:244:3: ( rule__Scenario__Group__0 )
            // InternalGherkin.g:244:4: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleScenarioWithOutline"
    // InternalGherkin.g:253:1: entryRuleScenarioWithOutline : ruleScenarioWithOutline EOF ;
    public final void entryRuleScenarioWithOutline() throws RecognitionException {
        try {
            // InternalGherkin.g:254:1: ( ruleScenarioWithOutline EOF )
            // InternalGherkin.g:255:1: ruleScenarioWithOutline EOF
            {
             before(grammarAccess.getScenarioWithOutlineRule()); 
            pushFollow(FOLLOW_1);
            ruleScenarioWithOutline();

            state._fsp--;

             after(grammarAccess.getScenarioWithOutlineRule()); 
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
    // $ANTLR end "entryRuleScenarioWithOutline"


    // $ANTLR start "ruleScenarioWithOutline"
    // InternalGherkin.g:262:1: ruleScenarioWithOutline : ( ( rule__ScenarioWithOutline__Group__0 ) ) ;
    public final void ruleScenarioWithOutline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:266:2: ( ( ( rule__ScenarioWithOutline__Group__0 ) ) )
            // InternalGherkin.g:267:2: ( ( rule__ScenarioWithOutline__Group__0 ) )
            {
            // InternalGherkin.g:267:2: ( ( rule__ScenarioWithOutline__Group__0 ) )
            // InternalGherkin.g:268:3: ( rule__ScenarioWithOutline__Group__0 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getGroup()); 
            // InternalGherkin.g:269:3: ( rule__ScenarioWithOutline__Group__0 )
            // InternalGherkin.g:269:4: rule__ScenarioWithOutline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioWithOutline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioWithOutlineAccess().getGroup()); 

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
    // $ANTLR end "ruleScenarioWithOutline"


    // $ANTLR start "entryRuleExample"
    // InternalGherkin.g:278:1: entryRuleExample : ruleExample EOF ;
    public final void entryRuleExample() throws RecognitionException {
        try {
            // InternalGherkin.g:279:1: ( ruleExample EOF )
            // InternalGherkin.g:280:1: ruleExample EOF
            {
             before(grammarAccess.getExampleRule()); 
            pushFollow(FOLLOW_1);
            ruleExample();

            state._fsp--;

             after(grammarAccess.getExampleRule()); 
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
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // InternalGherkin.g:287:1: ruleExample : ( ( rule__Example__Group__0 ) ) ;
    public final void ruleExample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:291:2: ( ( ( rule__Example__Group__0 ) ) )
            // InternalGherkin.g:292:2: ( ( rule__Example__Group__0 ) )
            {
            // InternalGherkin.g:292:2: ( ( rule__Example__Group__0 ) )
            // InternalGherkin.g:293:3: ( rule__Example__Group__0 )
            {
             before(grammarAccess.getExampleAccess().getGroup()); 
            // InternalGherkin.g:294:3: ( rule__Example__Group__0 )
            // InternalGherkin.g:294:4: rule__Example__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getGroup()); 

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
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleExampleRow"
    // InternalGherkin.g:303:1: entryRuleExampleRow : ruleExampleRow EOF ;
    public final void entryRuleExampleRow() throws RecognitionException {
        try {
            // InternalGherkin.g:304:1: ( ruleExampleRow EOF )
            // InternalGherkin.g:305:1: ruleExampleRow EOF
            {
             before(grammarAccess.getExampleRowRule()); 
            pushFollow(FOLLOW_1);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getExampleRowRule()); 
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
    // $ANTLR end "entryRuleExampleRow"


    // $ANTLR start "ruleExampleRow"
    // InternalGherkin.g:312:1: ruleExampleRow : ( ( rule__ExampleRow__Group__0 ) ) ;
    public final void ruleExampleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:316:2: ( ( ( rule__ExampleRow__Group__0 ) ) )
            // InternalGherkin.g:317:2: ( ( rule__ExampleRow__Group__0 ) )
            {
            // InternalGherkin.g:317:2: ( ( rule__ExampleRow__Group__0 ) )
            // InternalGherkin.g:318:3: ( rule__ExampleRow__Group__0 )
            {
             before(grammarAccess.getExampleRowAccess().getGroup()); 
            // InternalGherkin.g:319:3: ( rule__ExampleRow__Group__0 )
            // InternalGherkin.g:319:4: rule__ExampleRow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExampleRow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExampleRowAccess().getGroup()); 

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
    // $ANTLR end "ruleExampleRow"


    // $ANTLR start "entryRuleExampleCell"
    // InternalGherkin.g:328:1: entryRuleExampleCell : ruleExampleCell EOF ;
    public final void entryRuleExampleCell() throws RecognitionException {
        try {
            // InternalGherkin.g:329:1: ( ruleExampleCell EOF )
            // InternalGherkin.g:330:1: ruleExampleCell EOF
            {
             before(grammarAccess.getExampleCellRule()); 
            pushFollow(FOLLOW_1);
            ruleExampleCell();

            state._fsp--;

             after(grammarAccess.getExampleCellRule()); 
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
    // $ANTLR end "entryRuleExampleCell"


    // $ANTLR start "ruleExampleCell"
    // InternalGherkin.g:337:1: ruleExampleCell : ( ( rule__ExampleCell__ValueAssignment ) ) ;
    public final void ruleExampleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:341:2: ( ( ( rule__ExampleCell__ValueAssignment ) ) )
            // InternalGherkin.g:342:2: ( ( rule__ExampleCell__ValueAssignment ) )
            {
            // InternalGherkin.g:342:2: ( ( rule__ExampleCell__ValueAssignment ) )
            // InternalGherkin.g:343:3: ( rule__ExampleCell__ValueAssignment )
            {
             before(grammarAccess.getExampleCellAccess().getValueAssignment()); 
            // InternalGherkin.g:344:3: ( rule__ExampleCell__ValueAssignment )
            // InternalGherkin.g:344:4: rule__ExampleCell__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExampleCell__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExampleCellAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleExampleCell"


    // $ANTLR start "entryRuleBackground"
    // InternalGherkin.g:353:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // InternalGherkin.g:354:1: ( ruleBackground EOF )
            // InternalGherkin.g:355:1: ruleBackground EOF
            {
             before(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_1);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getBackgroundRule()); 
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
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // InternalGherkin.g:362:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:366:2: ( ( ( rule__Background__Group__0 ) ) )
            // InternalGherkin.g:367:2: ( ( rule__Background__Group__0 ) )
            {
            // InternalGherkin.g:367:2: ( ( rule__Background__Group__0 ) )
            // InternalGherkin.g:368:3: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // InternalGherkin.g:369:3: ( rule__Background__Group__0 )
            // InternalGherkin.g:369:4: rule__Background__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getGroup()); 

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
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleStep"
    // InternalGherkin.g:378:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalGherkin.g:379:1: ( ruleStep EOF )
            // InternalGherkin.g:380:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalGherkin.g:387:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:391:2: ( ( ( rule__Step__Alternatives ) ) )
            // InternalGherkin.g:392:2: ( ( rule__Step__Alternatives ) )
            {
            // InternalGherkin.g:392:2: ( ( rule__Step__Alternatives ) )
            // InternalGherkin.g:393:3: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // InternalGherkin.g:394:3: ( rule__Step__Alternatives )
            // InternalGherkin.g:394:4: rule__Step__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Step__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleWhenStep"
    // InternalGherkin.g:403:1: entryRuleWhenStep : ruleWhenStep EOF ;
    public final void entryRuleWhenStep() throws RecognitionException {
        try {
            // InternalGherkin.g:404:1: ( ruleWhenStep EOF )
            // InternalGherkin.g:405:1: ruleWhenStep EOF
            {
             before(grammarAccess.getWhenStepRule()); 
            pushFollow(FOLLOW_1);
            ruleWhenStep();

            state._fsp--;

             after(grammarAccess.getWhenStepRule()); 
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
    // $ANTLR end "entryRuleWhenStep"


    // $ANTLR start "ruleWhenStep"
    // InternalGherkin.g:412:1: ruleWhenStep : ( ( rule__WhenStep__Group__0 ) ) ;
    public final void ruleWhenStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:416:2: ( ( ( rule__WhenStep__Group__0 ) ) )
            // InternalGherkin.g:417:2: ( ( rule__WhenStep__Group__0 ) )
            {
            // InternalGherkin.g:417:2: ( ( rule__WhenStep__Group__0 ) )
            // InternalGherkin.g:418:3: ( rule__WhenStep__Group__0 )
            {
             before(grammarAccess.getWhenStepAccess().getGroup()); 
            // InternalGherkin.g:419:3: ( rule__WhenStep__Group__0 )
            // InternalGherkin.g:419:4: rule__WhenStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhenStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhenStepAccess().getGroup()); 

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
    // $ANTLR end "ruleWhenStep"


    // $ANTLR start "entryRuleThenStep"
    // InternalGherkin.g:428:1: entryRuleThenStep : ruleThenStep EOF ;
    public final void entryRuleThenStep() throws RecognitionException {
        try {
            // InternalGherkin.g:429:1: ( ruleThenStep EOF )
            // InternalGherkin.g:430:1: ruleThenStep EOF
            {
             before(grammarAccess.getThenStepRule()); 
            pushFollow(FOLLOW_1);
            ruleThenStep();

            state._fsp--;

             after(grammarAccess.getThenStepRule()); 
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
    // $ANTLR end "entryRuleThenStep"


    // $ANTLR start "ruleThenStep"
    // InternalGherkin.g:437:1: ruleThenStep : ( ( rule__ThenStep__Group__0 ) ) ;
    public final void ruleThenStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:441:2: ( ( ( rule__ThenStep__Group__0 ) ) )
            // InternalGherkin.g:442:2: ( ( rule__ThenStep__Group__0 ) )
            {
            // InternalGherkin.g:442:2: ( ( rule__ThenStep__Group__0 ) )
            // InternalGherkin.g:443:3: ( rule__ThenStep__Group__0 )
            {
             before(grammarAccess.getThenStepAccess().getGroup()); 
            // InternalGherkin.g:444:3: ( rule__ThenStep__Group__0 )
            // InternalGherkin.g:444:4: rule__ThenStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ThenStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThenStepAccess().getGroup()); 

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
    // $ANTLR end "ruleThenStep"


    // $ANTLR start "entryRuleGivenStep"
    // InternalGherkin.g:453:1: entryRuleGivenStep : ruleGivenStep EOF ;
    public final void entryRuleGivenStep() throws RecognitionException {
        try {
            // InternalGherkin.g:454:1: ( ruleGivenStep EOF )
            // InternalGherkin.g:455:1: ruleGivenStep EOF
            {
             before(grammarAccess.getGivenStepRule()); 
            pushFollow(FOLLOW_1);
            ruleGivenStep();

            state._fsp--;

             after(grammarAccess.getGivenStepRule()); 
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
    // $ANTLR end "entryRuleGivenStep"


    // $ANTLR start "ruleGivenStep"
    // InternalGherkin.g:462:1: ruleGivenStep : ( ( rule__GivenStep__Group__0 ) ) ;
    public final void ruleGivenStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:466:2: ( ( ( rule__GivenStep__Group__0 ) ) )
            // InternalGherkin.g:467:2: ( ( rule__GivenStep__Group__0 ) )
            {
            // InternalGherkin.g:467:2: ( ( rule__GivenStep__Group__0 ) )
            // InternalGherkin.g:468:3: ( rule__GivenStep__Group__0 )
            {
             before(grammarAccess.getGivenStepAccess().getGroup()); 
            // InternalGherkin.g:469:3: ( rule__GivenStep__Group__0 )
            // InternalGherkin.g:469:4: rule__GivenStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GivenStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenStepAccess().getGroup()); 

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
    // $ANTLR end "ruleGivenStep"


    // $ANTLR start "entryRuleAndStep"
    // InternalGherkin.g:478:1: entryRuleAndStep : ruleAndStep EOF ;
    public final void entryRuleAndStep() throws RecognitionException {
        try {
            // InternalGherkin.g:479:1: ( ruleAndStep EOF )
            // InternalGherkin.g:480:1: ruleAndStep EOF
            {
             before(grammarAccess.getAndStepRule()); 
            pushFollow(FOLLOW_1);
            ruleAndStep();

            state._fsp--;

             after(grammarAccess.getAndStepRule()); 
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
    // $ANTLR end "entryRuleAndStep"


    // $ANTLR start "ruleAndStep"
    // InternalGherkin.g:487:1: ruleAndStep : ( ( rule__AndStep__Group__0 ) ) ;
    public final void ruleAndStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:491:2: ( ( ( rule__AndStep__Group__0 ) ) )
            // InternalGherkin.g:492:2: ( ( rule__AndStep__Group__0 ) )
            {
            // InternalGherkin.g:492:2: ( ( rule__AndStep__Group__0 ) )
            // InternalGherkin.g:493:3: ( rule__AndStep__Group__0 )
            {
             before(grammarAccess.getAndStepAccess().getGroup()); 
            // InternalGherkin.g:494:3: ( rule__AndStep__Group__0 )
            // InternalGherkin.g:494:4: rule__AndStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndStepAccess().getGroup()); 

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
    // $ANTLR end "ruleAndStep"


    // $ANTLR start "entryRuleOptionalText"
    // InternalGherkin.g:503:1: entryRuleOptionalText : ruleOptionalText EOF ;
    public final void entryRuleOptionalText() throws RecognitionException {
        try {
            // InternalGherkin.g:504:1: ( ruleOptionalText EOF )
            // InternalGherkin.g:505:1: ruleOptionalText EOF
            {
             before(grammarAccess.getOptionalTextRule()); 
            pushFollow(FOLLOW_1);
            ruleOptionalText();

            state._fsp--;

             after(grammarAccess.getOptionalTextRule()); 
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
    // $ANTLR end "entryRuleOptionalText"


    // $ANTLR start "ruleOptionalText"
    // InternalGherkin.g:512:1: ruleOptionalText : ( ( rule__OptionalText__Alternatives ) ) ;
    public final void ruleOptionalText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:516:2: ( ( ( rule__OptionalText__Alternatives ) ) )
            // InternalGherkin.g:517:2: ( ( rule__OptionalText__Alternatives ) )
            {
            // InternalGherkin.g:517:2: ( ( rule__OptionalText__Alternatives ) )
            // InternalGherkin.g:518:3: ( rule__OptionalText__Alternatives )
            {
             before(grammarAccess.getOptionalTextAccess().getAlternatives()); 
            // InternalGherkin.g:519:3: ( rule__OptionalText__Alternatives )
            // InternalGherkin.g:519:4: rule__OptionalText__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OptionalText__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionalTextAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOptionalText"


    // $ANTLR start "rule__NarrativeElement__Alternatives"
    // InternalGherkin.g:527:1: rule__NarrativeElement__Alternatives : ( ( ruleInOrderTo ) | ( ruleAsA ) | ( ruleIWantTo ) | ( ruleFreeText ) );
    public final void rule__NarrativeElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:531:1: ( ( ruleInOrderTo ) | ( ruleAsA ) | ( ruleIWantTo ) | ( ruleFreeText ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_IN_ORDER_TO:
                {
                alt1=1;
                }
                break;
            case RULE_AS_A:
                {
                alt1=2;
                }
                break;
            case RULE_I_WANT_TO:
                {
                alt1=3;
                }
                break;
            case RULE_TEXT:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGherkin.g:532:2: ( ruleInOrderTo )
                    {
                    // InternalGherkin.g:532:2: ( ruleInOrderTo )
                    // InternalGherkin.g:533:3: ruleInOrderTo
                    {
                     before(grammarAccess.getNarrativeElementAccess().getInOrderToParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInOrderTo();

                    state._fsp--;

                     after(grammarAccess.getNarrativeElementAccess().getInOrderToParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGherkin.g:538:2: ( ruleAsA )
                    {
                    // InternalGherkin.g:538:2: ( ruleAsA )
                    // InternalGherkin.g:539:3: ruleAsA
                    {
                     before(grammarAccess.getNarrativeElementAccess().getAsAParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAsA();

                    state._fsp--;

                     after(grammarAccess.getNarrativeElementAccess().getAsAParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGherkin.g:544:2: ( ruleIWantTo )
                    {
                    // InternalGherkin.g:544:2: ( ruleIWantTo )
                    // InternalGherkin.g:545:3: ruleIWantTo
                    {
                     before(grammarAccess.getNarrativeElementAccess().getIWantToParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIWantTo();

                    state._fsp--;

                     after(grammarAccess.getNarrativeElementAccess().getIWantToParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGherkin.g:550:2: ( ruleFreeText )
                    {
                    // InternalGherkin.g:550:2: ( ruleFreeText )
                    // InternalGherkin.g:551:3: ruleFreeText
                    {
                     before(grammarAccess.getNarrativeElementAccess().getFreeTextParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFreeText();

                    state._fsp--;

                     after(grammarAccess.getNarrativeElementAccess().getFreeTextParserRuleCall_3()); 

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
    // $ANTLR end "rule__NarrativeElement__Alternatives"


    // $ANTLR start "rule__AbstractScenario__Alternatives"
    // InternalGherkin.g:560:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioWithOutline ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:564:1: ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioWithOutline ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalGherkin.g:565:2: ( ruleBackground )
                    {
                    // InternalGherkin.g:565:2: ( ruleBackground )
                    // InternalGherkin.g:566:3: ruleBackground
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBackground();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGherkin.g:571:2: ( ruleScenario )
                    {
                    // InternalGherkin.g:571:2: ( ruleScenario )
                    // InternalGherkin.g:572:3: ruleScenario
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleScenario();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGherkin.g:577:2: ( ruleScenarioWithOutline )
                    {
                    // InternalGherkin.g:577:2: ( ruleScenarioWithOutline )
                    // InternalGherkin.g:578:3: ruleScenarioWithOutline
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getScenarioWithOutlineParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleScenarioWithOutline();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getScenarioWithOutlineParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractScenario__Alternatives"


    // $ANTLR start "rule__Step__Alternatives"
    // InternalGherkin.g:587:1: rule__Step__Alternatives : ( ( ruleWhenStep ) | ( ruleThenStep ) | ( ruleGivenStep ) | ( ruleAndStep ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:591:1: ( ( ruleWhenStep ) | ( ruleThenStep ) | ( ruleGivenStep ) | ( ruleAndStep ) )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalGherkin.g:592:2: ( ruleWhenStep )
                    {
                    // InternalGherkin.g:592:2: ( ruleWhenStep )
                    // InternalGherkin.g:593:3: ruleWhenStep
                    {
                     before(grammarAccess.getStepAccess().getWhenStepParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWhenStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getWhenStepParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGherkin.g:598:2: ( ruleThenStep )
                    {
                    // InternalGherkin.g:598:2: ( ruleThenStep )
                    // InternalGherkin.g:599:3: ruleThenStep
                    {
                     before(grammarAccess.getStepAccess().getThenStepParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleThenStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getThenStepParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGherkin.g:604:2: ( ruleGivenStep )
                    {
                    // InternalGherkin.g:604:2: ( ruleGivenStep )
                    // InternalGherkin.g:605:3: ruleGivenStep
                    {
                     before(grammarAccess.getStepAccess().getGivenStepParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGivenStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getGivenStepParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGherkin.g:610:2: ( ruleAndStep )
                    {
                    // InternalGherkin.g:610:2: ( ruleAndStep )
                    // InternalGherkin.g:611:3: ruleAndStep
                    {
                     before(grammarAccess.getStepAccess().getAndStepParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAndStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getAndStepParserRuleCall_3()); 

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
    // $ANTLR end "rule__Step__Alternatives"


    // $ANTLR start "rule__OptionalText__Alternatives"
    // InternalGherkin.g:620:1: rule__OptionalText__Alternatives : ( ( RULE_TEXT ) | ( RULE_CODE ) );
    public final void rule__OptionalText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:624:1: ( ( RULE_TEXT ) | ( RULE_CODE ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_TEXT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_CODE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGherkin.g:625:2: ( RULE_TEXT )
                    {
                    // InternalGherkin.g:625:2: ( RULE_TEXT )
                    // InternalGherkin.g:626:3: RULE_TEXT
                    {
                     before(grammarAccess.getOptionalTextAccess().getTEXTTerminalRuleCall_0()); 
                    match(input,RULE_TEXT,FOLLOW_2); 
                     after(grammarAccess.getOptionalTextAccess().getTEXTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGherkin.g:631:2: ( RULE_CODE )
                    {
                    // InternalGherkin.g:631:2: ( RULE_CODE )
                    // InternalGherkin.g:632:3: RULE_CODE
                    {
                     before(grammarAccess.getOptionalTextAccess().getCODETerminalRuleCall_1()); 
                    match(input,RULE_CODE,FOLLOW_2); 
                     after(grammarAccess.getOptionalTextAccess().getCODETerminalRuleCall_1()); 

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
    // $ANTLR end "rule__OptionalText__Alternatives"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalGherkin.g:641:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:645:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalGherkin.g:646:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

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
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalGherkin.g:653:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__TagsAssignment_0 )* ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:657:1: ( ( ( rule__Feature__TagsAssignment_0 )* ) )
            // InternalGherkin.g:658:1: ( ( rule__Feature__TagsAssignment_0 )* )
            {
            // InternalGherkin.g:658:1: ( ( rule__Feature__TagsAssignment_0 )* )
            // InternalGherkin.g:659:2: ( rule__Feature__TagsAssignment_0 )*
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 
            // InternalGherkin.g:660:2: ( rule__Feature__TagsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_TAG) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGherkin.g:660:3: rule__Feature__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Feature__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalGherkin.g:668:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:672:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalGherkin.g:673:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

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
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalGherkin.g:680:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:684:1: ( ( ( rule__Feature__NameAssignment_1 )? ) )
            // InternalGherkin.g:685:1: ( ( rule__Feature__NameAssignment_1 )? )
            {
            // InternalGherkin.g:685:1: ( ( rule__Feature__NameAssignment_1 )? )
            // InternalGherkin.g:686:2: ( rule__Feature__NameAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalGherkin.g:687:2: ( rule__Feature__NameAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_FEATURE_TEXT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGherkin.g:687:3: rule__Feature__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalGherkin.g:695:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:699:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalGherkin.g:700:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

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
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalGherkin.g:707:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__ElementsAssignment_2 )* ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:711:1: ( ( ( rule__Feature__ElementsAssignment_2 )* ) )
            // InternalGherkin.g:712:1: ( ( rule__Feature__ElementsAssignment_2 )* )
            {
            // InternalGherkin.g:712:1: ( ( rule__Feature__ElementsAssignment_2 )* )
            // InternalGherkin.g:713:2: ( rule__Feature__ElementsAssignment_2 )*
            {
             before(grammarAccess.getFeatureAccess().getElementsAssignment_2()); 
            // InternalGherkin.g:714:2: ( rule__Feature__ElementsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_TEXT||(LA7_0>=RULE_AS_A && LA7_0<=RULE_I_WANT_TO)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGherkin.g:714:3: rule__Feature__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Feature__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalGherkin.g:722:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:726:1: ( rule__Feature__Group__3__Impl )
            // InternalGherkin.g:727:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__3__Impl();

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
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalGherkin.g:733:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__ScenariosAssignment_3 )* ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:737:1: ( ( ( rule__Feature__ScenariosAssignment_3 )* ) )
            // InternalGherkin.g:738:1: ( ( rule__Feature__ScenariosAssignment_3 )* )
            {
            // InternalGherkin.g:738:1: ( ( rule__Feature__ScenariosAssignment_3 )* )
            // InternalGherkin.g:739:2: ( rule__Feature__ScenariosAssignment_3 )*
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_3()); 
            // InternalGherkin.g:740:2: ( rule__Feature__ScenariosAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_TAG||(LA8_0>=RULE_SCENARIO_TEXT && LA8_0<=RULE_SCENARIO_OUTLINE_TEXT)||LA8_0==RULE_BACKGROUND_TEXT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGherkin.g:740:3: rule__Feature__ScenariosAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Feature__ScenariosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getScenariosAssignment_3()); 

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
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalGherkin.g:749:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:753:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalGherkin.g:754:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__1();

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
    // $ANTLR end "rule__Scenario__Group__0"


    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // InternalGherkin.g:761:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__TagsAssignment_0 )* ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:765:1: ( ( ( rule__Scenario__TagsAssignment_0 )* ) )
            // InternalGherkin.g:766:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            {
            // InternalGherkin.g:766:1: ( ( rule__Scenario__TagsAssignment_0 )* )
            // InternalGherkin.g:767:2: ( rule__Scenario__TagsAssignment_0 )*
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 
            // InternalGherkin.g:768:2: ( rule__Scenario__TagsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_TAG) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGherkin.g:768:3: rule__Scenario__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Scenario__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // InternalGherkin.g:776:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:780:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalGherkin.g:781:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__2();

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
    // $ANTLR end "rule__Scenario__Group__1"


    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // InternalGherkin.g:788:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__NameAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:792:1: ( ( ( rule__Scenario__NameAssignment_1 ) ) )
            // InternalGherkin.g:793:1: ( ( rule__Scenario__NameAssignment_1 ) )
            {
            // InternalGherkin.g:793:1: ( ( rule__Scenario__NameAssignment_1 ) )
            // InternalGherkin.g:794:2: ( rule__Scenario__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1()); 
            // InternalGherkin.g:795:2: ( rule__Scenario__NameAssignment_1 )
            // InternalGherkin.g:795:3: rule__Scenario__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__2"
    // InternalGherkin.g:803:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:807:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalGherkin.g:808:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__3();

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
    // $ANTLR end "rule__Scenario__Group__2"


    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // InternalGherkin.g:815:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__ElementsAssignment_2 )* ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:819:1: ( ( ( rule__Scenario__ElementsAssignment_2 )* ) )
            // InternalGherkin.g:820:1: ( ( rule__Scenario__ElementsAssignment_2 )* )
            {
            // InternalGherkin.g:820:1: ( ( rule__Scenario__ElementsAssignment_2 )* )
            // InternalGherkin.g:821:2: ( rule__Scenario__ElementsAssignment_2 )*
            {
             before(grammarAccess.getScenarioAccess().getElementsAssignment_2()); 
            // InternalGherkin.g:822:2: ( rule__Scenario__ElementsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_TEXT||(LA10_0>=RULE_AS_A && LA10_0<=RULE_I_WANT_TO)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGherkin.g:822:3: rule__Scenario__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Scenario__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__3"
    // InternalGherkin.g:830:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:834:1: ( rule__Scenario__Group__3__Impl )
            // InternalGherkin.g:835:2: rule__Scenario__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__3__Impl();

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
    // $ANTLR end "rule__Scenario__Group__3"


    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // InternalGherkin.g:841:1: rule__Scenario__Group__3__Impl : ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:845:1: ( ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) ) )
            // InternalGherkin.g:846:1: ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) )
            {
            // InternalGherkin.g:846:1: ( ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* ) )
            // InternalGherkin.g:847:2: ( ( rule__Scenario__StepsAssignment_3 ) ) ( ( rule__Scenario__StepsAssignment_3 )* )
            {
            // InternalGherkin.g:847:2: ( ( rule__Scenario__StepsAssignment_3 ) )
            // InternalGherkin.g:848:3: ( rule__Scenario__StepsAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_3()); 
            // InternalGherkin.g:849:3: ( rule__Scenario__StepsAssignment_3 )
            // InternalGherkin.g:849:4: rule__Scenario__StepsAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Scenario__StepsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getStepsAssignment_3()); 

            }

            // InternalGherkin.g:852:2: ( ( rule__Scenario__StepsAssignment_3 )* )
            // InternalGherkin.g:853:3: ( rule__Scenario__StepsAssignment_3 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_3()); 
            // InternalGherkin.g:854:3: ( rule__Scenario__StepsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalGherkin.g:854:4: rule__Scenario__StepsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Scenario__StepsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getStepsAssignment_3()); 

            }


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
    // $ANTLR end "rule__Scenario__Group__3__Impl"


    // $ANTLR start "rule__ScenarioWithOutline__Group__0"
    // InternalGherkin.g:864:1: rule__ScenarioWithOutline__Group__0 : rule__ScenarioWithOutline__Group__0__Impl rule__ScenarioWithOutline__Group__1 ;
    public final void rule__ScenarioWithOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:868:1: ( rule__ScenarioWithOutline__Group__0__Impl rule__ScenarioWithOutline__Group__1 )
            // InternalGherkin.g:869:2: rule__ScenarioWithOutline__Group__0__Impl rule__ScenarioWithOutline__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ScenarioWithOutline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioWithOutline__Group__1();

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__0"


    // $ANTLR start "rule__ScenarioWithOutline__Group__0__Impl"
    // InternalGherkin.g:876:1: rule__ScenarioWithOutline__Group__0__Impl : ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* ) ;
    public final void rule__ScenarioWithOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:880:1: ( ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* ) )
            // InternalGherkin.g:881:1: ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* )
            {
            // InternalGherkin.g:881:1: ( ( rule__ScenarioWithOutline__TagsAssignment_0 )* )
            // InternalGherkin.g:882:2: ( rule__ScenarioWithOutline__TagsAssignment_0 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getTagsAssignment_0()); 
            // InternalGherkin.g:883:2: ( rule__ScenarioWithOutline__TagsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_TAG) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGherkin.g:883:3: rule__ScenarioWithOutline__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ScenarioWithOutline__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getScenarioWithOutlineAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__0__Impl"


    // $ANTLR start "rule__ScenarioWithOutline__Group__1"
    // InternalGherkin.g:891:1: rule__ScenarioWithOutline__Group__1 : rule__ScenarioWithOutline__Group__1__Impl rule__ScenarioWithOutline__Group__2 ;
    public final void rule__ScenarioWithOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:895:1: ( rule__ScenarioWithOutline__Group__1__Impl rule__ScenarioWithOutline__Group__2 )
            // InternalGherkin.g:896:2: rule__ScenarioWithOutline__Group__1__Impl rule__ScenarioWithOutline__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioWithOutline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioWithOutline__Group__2();

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__1"


    // $ANTLR start "rule__ScenarioWithOutline__Group__1__Impl"
    // InternalGherkin.g:903:1: rule__ScenarioWithOutline__Group__1__Impl : ( ( rule__ScenarioWithOutline__NameAssignment_1 ) ) ;
    public final void rule__ScenarioWithOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:907:1: ( ( ( rule__ScenarioWithOutline__NameAssignment_1 ) ) )
            // InternalGherkin.g:908:1: ( ( rule__ScenarioWithOutline__NameAssignment_1 ) )
            {
            // InternalGherkin.g:908:1: ( ( rule__ScenarioWithOutline__NameAssignment_1 ) )
            // InternalGherkin.g:909:2: ( rule__ScenarioWithOutline__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getNameAssignment_1()); 
            // InternalGherkin.g:910:2: ( rule__ScenarioWithOutline__NameAssignment_1 )
            // InternalGherkin.g:910:3: rule__ScenarioWithOutline__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioWithOutline__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioWithOutlineAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__1__Impl"


    // $ANTLR start "rule__ScenarioWithOutline__Group__2"
    // InternalGherkin.g:918:1: rule__ScenarioWithOutline__Group__2 : rule__ScenarioWithOutline__Group__2__Impl rule__ScenarioWithOutline__Group__3 ;
    public final void rule__ScenarioWithOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:922:1: ( rule__ScenarioWithOutline__Group__2__Impl rule__ScenarioWithOutline__Group__3 )
            // InternalGherkin.g:923:2: rule__ScenarioWithOutline__Group__2__Impl rule__ScenarioWithOutline__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ScenarioWithOutline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioWithOutline__Group__3();

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__2"


    // $ANTLR start "rule__ScenarioWithOutline__Group__2__Impl"
    // InternalGherkin.g:930:1: rule__ScenarioWithOutline__Group__2__Impl : ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* ) ;
    public final void rule__ScenarioWithOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:934:1: ( ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* ) )
            // InternalGherkin.g:935:1: ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* )
            {
            // InternalGherkin.g:935:1: ( ( rule__ScenarioWithOutline__ElementsAssignment_2 )* )
            // InternalGherkin.g:936:2: ( rule__ScenarioWithOutline__ElementsAssignment_2 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getElementsAssignment_2()); 
            // InternalGherkin.g:937:2: ( rule__ScenarioWithOutline__ElementsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_TEXT||(LA13_0>=RULE_AS_A && LA13_0<=RULE_I_WANT_TO)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGherkin.g:937:3: rule__ScenarioWithOutline__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ScenarioWithOutline__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getScenarioWithOutlineAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__2__Impl"


    // $ANTLR start "rule__ScenarioWithOutline__Group__3"
    // InternalGherkin.g:945:1: rule__ScenarioWithOutline__Group__3 : rule__ScenarioWithOutline__Group__3__Impl rule__ScenarioWithOutline__Group__4 ;
    public final void rule__ScenarioWithOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:949:1: ( rule__ScenarioWithOutline__Group__3__Impl rule__ScenarioWithOutline__Group__4 )
            // InternalGherkin.g:950:2: rule__ScenarioWithOutline__Group__3__Impl rule__ScenarioWithOutline__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__ScenarioWithOutline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioWithOutline__Group__4();

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__3"


    // $ANTLR start "rule__ScenarioWithOutline__Group__3__Impl"
    // InternalGherkin.g:957:1: rule__ScenarioWithOutline__Group__3__Impl : ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) ) ;
    public final void rule__ScenarioWithOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:961:1: ( ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) ) )
            // InternalGherkin.g:962:1: ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) )
            {
            // InternalGherkin.g:962:1: ( ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* ) )
            // InternalGherkin.g:963:2: ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) ) ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* )
            {
            // InternalGherkin.g:963:2: ( ( rule__ScenarioWithOutline__StepsAssignment_3 ) )
            // InternalGherkin.g:964:3: ( rule__ScenarioWithOutline__StepsAssignment_3 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_3()); 
            // InternalGherkin.g:965:3: ( rule__ScenarioWithOutline__StepsAssignment_3 )
            // InternalGherkin.g:965:4: rule__ScenarioWithOutline__StepsAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__ScenarioWithOutline__StepsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_3()); 

            }

            // InternalGherkin.g:968:2: ( ( rule__ScenarioWithOutline__StepsAssignment_3 )* )
            // InternalGherkin.g:969:3: ( rule__ScenarioWithOutline__StepsAssignment_3 )*
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_3()); 
            // InternalGherkin.g:970:3: ( rule__ScenarioWithOutline__StepsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_TAG||(LA14_0>=RULE_WHEN_TEXT && LA14_0<=RULE_AND_TEXT)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGherkin.g:970:4: rule__ScenarioWithOutline__StepsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ScenarioWithOutline__StepsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getScenarioWithOutlineAccess().getStepsAssignment_3()); 

            }


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
    // $ANTLR end "rule__ScenarioWithOutline__Group__3__Impl"


    // $ANTLR start "rule__ScenarioWithOutline__Group__4"
    // InternalGherkin.g:979:1: rule__ScenarioWithOutline__Group__4 : rule__ScenarioWithOutline__Group__4__Impl ;
    public final void rule__ScenarioWithOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:983:1: ( rule__ScenarioWithOutline__Group__4__Impl )
            // InternalGherkin.g:984:2: rule__ScenarioWithOutline__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioWithOutline__Group__4__Impl();

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__4"


    // $ANTLR start "rule__ScenarioWithOutline__Group__4__Impl"
    // InternalGherkin.g:990:1: rule__ScenarioWithOutline__Group__4__Impl : ( ( rule__ScenarioWithOutline__ExampleAssignment_4 ) ) ;
    public final void rule__ScenarioWithOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:994:1: ( ( ( rule__ScenarioWithOutline__ExampleAssignment_4 ) ) )
            // InternalGherkin.g:995:1: ( ( rule__ScenarioWithOutline__ExampleAssignment_4 ) )
            {
            // InternalGherkin.g:995:1: ( ( rule__ScenarioWithOutline__ExampleAssignment_4 ) )
            // InternalGherkin.g:996:2: ( rule__ScenarioWithOutline__ExampleAssignment_4 )
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getExampleAssignment_4()); 
            // InternalGherkin.g:997:2: ( rule__ScenarioWithOutline__ExampleAssignment_4 )
            // InternalGherkin.g:997:3: rule__ScenarioWithOutline__ExampleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioWithOutline__ExampleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScenarioWithOutlineAccess().getExampleAssignment_4()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__Group__4__Impl"


    // $ANTLR start "rule__Example__Group__0"
    // InternalGherkin.g:1006:1: rule__Example__Group__0 : rule__Example__Group__0__Impl rule__Example__Group__1 ;
    public final void rule__Example__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1010:1: ( rule__Example__Group__0__Impl rule__Example__Group__1 )
            // InternalGherkin.g:1011:2: rule__Example__Group__0__Impl rule__Example__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Example__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__1();

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
    // $ANTLR end "rule__Example__Group__0"


    // $ANTLR start "rule__Example__Group__0__Impl"
    // InternalGherkin.g:1018:1: rule__Example__Group__0__Impl : ( RULE_EXAMPLE_HEADING ) ;
    public final void rule__Example__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1022:1: ( ( RULE_EXAMPLE_HEADING ) )
            // InternalGherkin.g:1023:1: ( RULE_EXAMPLE_HEADING )
            {
            // InternalGherkin.g:1023:1: ( RULE_EXAMPLE_HEADING )
            // InternalGherkin.g:1024:2: RULE_EXAMPLE_HEADING
            {
             before(grammarAccess.getExampleAccess().getEXAMPLE_HEADINGTerminalRuleCall_0()); 
            match(input,RULE_EXAMPLE_HEADING,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getEXAMPLE_HEADINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Example__Group__0__Impl"


    // $ANTLR start "rule__Example__Group__1"
    // InternalGherkin.g:1033:1: rule__Example__Group__1 : rule__Example__Group__1__Impl rule__Example__Group__2 ;
    public final void rule__Example__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1037:1: ( rule__Example__Group__1__Impl rule__Example__Group__2 )
            // InternalGherkin.g:1038:2: rule__Example__Group__1__Impl rule__Example__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Example__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__2();

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
    // $ANTLR end "rule__Example__Group__1"


    // $ANTLR start "rule__Example__Group__1__Impl"
    // InternalGherkin.g:1045:1: rule__Example__Group__1__Impl : ( ( rule__Example__HeadingAssignment_1 ) ) ;
    public final void rule__Example__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1049:1: ( ( ( rule__Example__HeadingAssignment_1 ) ) )
            // InternalGherkin.g:1050:1: ( ( rule__Example__HeadingAssignment_1 ) )
            {
            // InternalGherkin.g:1050:1: ( ( rule__Example__HeadingAssignment_1 ) )
            // InternalGherkin.g:1051:2: ( rule__Example__HeadingAssignment_1 )
            {
             before(grammarAccess.getExampleAccess().getHeadingAssignment_1()); 
            // InternalGherkin.g:1052:2: ( rule__Example__HeadingAssignment_1 )
            // InternalGherkin.g:1052:3: rule__Example__HeadingAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Example__HeadingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getHeadingAssignment_1()); 

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
    // $ANTLR end "rule__Example__Group__1__Impl"


    // $ANTLR start "rule__Example__Group__2"
    // InternalGherkin.g:1060:1: rule__Example__Group__2 : rule__Example__Group__2__Impl ;
    public final void rule__Example__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1064:1: ( rule__Example__Group__2__Impl )
            // InternalGherkin.g:1065:2: rule__Example__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group__2__Impl();

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
    // $ANTLR end "rule__Example__Group__2"


    // $ANTLR start "rule__Example__Group__2__Impl"
    // InternalGherkin.g:1071:1: rule__Example__Group__2__Impl : ( ( rule__Example__RowsAssignment_2 )* ) ;
    public final void rule__Example__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1075:1: ( ( ( rule__Example__RowsAssignment_2 )* ) )
            // InternalGherkin.g:1076:1: ( ( rule__Example__RowsAssignment_2 )* )
            {
            // InternalGherkin.g:1076:1: ( ( rule__Example__RowsAssignment_2 )* )
            // InternalGherkin.g:1077:2: ( rule__Example__RowsAssignment_2 )*
            {
             before(grammarAccess.getExampleAccess().getRowsAssignment_2()); 
            // InternalGherkin.g:1078:2: ( rule__Example__RowsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_EXAMPLE_CELL) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGherkin.g:1078:3: rule__Example__RowsAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Example__RowsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getExampleAccess().getRowsAssignment_2()); 

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
    // $ANTLR end "rule__Example__Group__2__Impl"


    // $ANTLR start "rule__ExampleRow__Group__0"
    // InternalGherkin.g:1087:1: rule__ExampleRow__Group__0 : rule__ExampleRow__Group__0__Impl rule__ExampleRow__Group__1 ;
    public final void rule__ExampleRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1091:1: ( rule__ExampleRow__Group__0__Impl rule__ExampleRow__Group__1 )
            // InternalGherkin.g:1092:2: rule__ExampleRow__Group__0__Impl rule__ExampleRow__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ExampleRow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExampleRow__Group__1();

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
    // $ANTLR end "rule__ExampleRow__Group__0"


    // $ANTLR start "rule__ExampleRow__Group__0__Impl"
    // InternalGherkin.g:1099:1: rule__ExampleRow__Group__0__Impl : ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) ) ;
    public final void rule__ExampleRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1103:1: ( ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) ) )
            // InternalGherkin.g:1104:1: ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) )
            {
            // InternalGherkin.g:1104:1: ( ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* ) )
            // InternalGherkin.g:1105:2: ( ( rule__ExampleRow__CellsAssignment_0 ) ) ( ( rule__ExampleRow__CellsAssignment_0 )* )
            {
            // InternalGherkin.g:1105:2: ( ( rule__ExampleRow__CellsAssignment_0 ) )
            // InternalGherkin.g:1106:3: ( rule__ExampleRow__CellsAssignment_0 )
            {
             before(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 
            // InternalGherkin.g:1107:3: ( rule__ExampleRow__CellsAssignment_0 )
            // InternalGherkin.g:1107:4: rule__ExampleRow__CellsAssignment_0
            {
            pushFollow(FOLLOW_13);
            rule__ExampleRow__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 

            }

            // InternalGherkin.g:1110:2: ( ( rule__ExampleRow__CellsAssignment_0 )* )
            // InternalGherkin.g:1111:3: ( rule__ExampleRow__CellsAssignment_0 )*
            {
             before(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 
            // InternalGherkin.g:1112:3: ( rule__ExampleRow__CellsAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_EXAMPLE_CELL) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGherkin.g:1112:4: rule__ExampleRow__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ExampleRow__CellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getExampleRowAccess().getCellsAssignment_0()); 

            }


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
    // $ANTLR end "rule__ExampleRow__Group__0__Impl"


    // $ANTLR start "rule__ExampleRow__Group__1"
    // InternalGherkin.g:1121:1: rule__ExampleRow__Group__1 : rule__ExampleRow__Group__1__Impl ;
    public final void rule__ExampleRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1125:1: ( rule__ExampleRow__Group__1__Impl )
            // InternalGherkin.g:1126:2: rule__ExampleRow__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExampleRow__Group__1__Impl();

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
    // $ANTLR end "rule__ExampleRow__Group__1"


    // $ANTLR start "rule__ExampleRow__Group__1__Impl"
    // InternalGherkin.g:1132:1: rule__ExampleRow__Group__1__Impl : ( RULE_EXAMPLE_ROW_END ) ;
    public final void rule__ExampleRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1136:1: ( ( RULE_EXAMPLE_ROW_END ) )
            // InternalGherkin.g:1137:1: ( RULE_EXAMPLE_ROW_END )
            {
            // InternalGherkin.g:1137:1: ( RULE_EXAMPLE_ROW_END )
            // InternalGherkin.g:1138:2: RULE_EXAMPLE_ROW_END
            {
             before(grammarAccess.getExampleRowAccess().getEXAMPLE_ROW_ENDTerminalRuleCall_1()); 
            match(input,RULE_EXAMPLE_ROW_END,FOLLOW_2); 
             after(grammarAccess.getExampleRowAccess().getEXAMPLE_ROW_ENDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ExampleRow__Group__1__Impl"


    // $ANTLR start "rule__Background__Group__0"
    // InternalGherkin.g:1148:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1152:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalGherkin.g:1153:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Background__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__1();

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
    // $ANTLR end "rule__Background__Group__0"


    // $ANTLR start "rule__Background__Group__0__Impl"
    // InternalGherkin.g:1160:1: rule__Background__Group__0__Impl : ( ( rule__Background__TagsAssignment_0 )* ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1164:1: ( ( ( rule__Background__TagsAssignment_0 )* ) )
            // InternalGherkin.g:1165:1: ( ( rule__Background__TagsAssignment_0 )* )
            {
            // InternalGherkin.g:1165:1: ( ( rule__Background__TagsAssignment_0 )* )
            // InternalGherkin.g:1166:2: ( rule__Background__TagsAssignment_0 )*
            {
             before(grammarAccess.getBackgroundAccess().getTagsAssignment_0()); 
            // InternalGherkin.g:1167:2: ( rule__Background__TagsAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_TAG) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGherkin.g:1167:3: rule__Background__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Background__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__Background__Group__0__Impl"


    // $ANTLR start "rule__Background__Group__1"
    // InternalGherkin.g:1175:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1179:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalGherkin.g:1180:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Background__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__2();

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
    // $ANTLR end "rule__Background__Group__1"


    // $ANTLR start "rule__Background__Group__1__Impl"
    // InternalGherkin.g:1187:1: rule__Background__Group__1__Impl : ( ( rule__Background__NameAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1191:1: ( ( ( rule__Background__NameAssignment_1 ) ) )
            // InternalGherkin.g:1192:1: ( ( rule__Background__NameAssignment_1 ) )
            {
            // InternalGherkin.g:1192:1: ( ( rule__Background__NameAssignment_1 ) )
            // InternalGherkin.g:1193:2: ( rule__Background__NameAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_1()); 
            // InternalGherkin.g:1194:2: ( rule__Background__NameAssignment_1 )
            // InternalGherkin.g:1194:3: rule__Background__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Background__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Background__Group__1__Impl"


    // $ANTLR start "rule__Background__Group__2"
    // InternalGherkin.g:1202:1: rule__Background__Group__2 : rule__Background__Group__2__Impl ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1206:1: ( rule__Background__Group__2__Impl )
            // InternalGherkin.g:1207:2: rule__Background__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__2__Impl();

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
    // $ANTLR end "rule__Background__Group__2"


    // $ANTLR start "rule__Background__Group__2__Impl"
    // InternalGherkin.g:1213:1: rule__Background__Group__2__Impl : ( ( rule__Background__StepsAssignment_2 )* ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1217:1: ( ( ( rule__Background__StepsAssignment_2 )* ) )
            // InternalGherkin.g:1218:1: ( ( rule__Background__StepsAssignment_2 )* )
            {
            // InternalGherkin.g:1218:1: ( ( rule__Background__StepsAssignment_2 )* )
            // InternalGherkin.g:1219:2: ( rule__Background__StepsAssignment_2 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_2()); 
            // InternalGherkin.g:1220:2: ( rule__Background__StepsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalGherkin.g:1220:3: rule__Background__StepsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Background__StepsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getStepsAssignment_2()); 

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
    // $ANTLR end "rule__Background__Group__2__Impl"


    // $ANTLR start "rule__WhenStep__Group__0"
    // InternalGherkin.g:1229:1: rule__WhenStep__Group__0 : rule__WhenStep__Group__0__Impl rule__WhenStep__Group__1 ;
    public final void rule__WhenStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1233:1: ( rule__WhenStep__Group__0__Impl rule__WhenStep__Group__1 )
            // InternalGherkin.g:1234:2: rule__WhenStep__Group__0__Impl rule__WhenStep__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__WhenStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhenStep__Group__1();

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
    // $ANTLR end "rule__WhenStep__Group__0"


    // $ANTLR start "rule__WhenStep__Group__0__Impl"
    // InternalGherkin.g:1241:1: rule__WhenStep__Group__0__Impl : ( ( rule__WhenStep__TagsAssignment_0 )* ) ;
    public final void rule__WhenStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1245:1: ( ( ( rule__WhenStep__TagsAssignment_0 )* ) )
            // InternalGherkin.g:1246:1: ( ( rule__WhenStep__TagsAssignment_0 )* )
            {
            // InternalGherkin.g:1246:1: ( ( rule__WhenStep__TagsAssignment_0 )* )
            // InternalGherkin.g:1247:2: ( rule__WhenStep__TagsAssignment_0 )*
            {
             before(grammarAccess.getWhenStepAccess().getTagsAssignment_0()); 
            // InternalGherkin.g:1248:2: ( rule__WhenStep__TagsAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_TAG) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGherkin.g:1248:3: rule__WhenStep__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__WhenStep__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getWhenStepAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__WhenStep__Group__0__Impl"


    // $ANTLR start "rule__WhenStep__Group__1"
    // InternalGherkin.g:1256:1: rule__WhenStep__Group__1 : rule__WhenStep__Group__1__Impl rule__WhenStep__Group__2 ;
    public final void rule__WhenStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1260:1: ( rule__WhenStep__Group__1__Impl rule__WhenStep__Group__2 )
            // InternalGherkin.g:1261:2: rule__WhenStep__Group__1__Impl rule__WhenStep__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__WhenStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhenStep__Group__2();

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
    // $ANTLR end "rule__WhenStep__Group__1"


    // $ANTLR start "rule__WhenStep__Group__1__Impl"
    // InternalGherkin.g:1268:1: rule__WhenStep__Group__1__Impl : ( ( rule__WhenStep__DescAssignment_1 ) ) ;
    public final void rule__WhenStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1272:1: ( ( ( rule__WhenStep__DescAssignment_1 ) ) )
            // InternalGherkin.g:1273:1: ( ( rule__WhenStep__DescAssignment_1 ) )
            {
            // InternalGherkin.g:1273:1: ( ( rule__WhenStep__DescAssignment_1 ) )
            // InternalGherkin.g:1274:2: ( rule__WhenStep__DescAssignment_1 )
            {
             before(grammarAccess.getWhenStepAccess().getDescAssignment_1()); 
            // InternalGherkin.g:1275:2: ( rule__WhenStep__DescAssignment_1 )
            // InternalGherkin.g:1275:3: rule__WhenStep__DescAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhenStep__DescAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhenStepAccess().getDescAssignment_1()); 

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
    // $ANTLR end "rule__WhenStep__Group__1__Impl"


    // $ANTLR start "rule__WhenStep__Group__2"
    // InternalGherkin.g:1283:1: rule__WhenStep__Group__2 : rule__WhenStep__Group__2__Impl rule__WhenStep__Group__3 ;
    public final void rule__WhenStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1287:1: ( rule__WhenStep__Group__2__Impl rule__WhenStep__Group__3 )
            // InternalGherkin.g:1288:2: rule__WhenStep__Group__2__Impl rule__WhenStep__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__WhenStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhenStep__Group__3();

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
    // $ANTLR end "rule__WhenStep__Group__2"


    // $ANTLR start "rule__WhenStep__Group__2__Impl"
    // InternalGherkin.g:1295:1: rule__WhenStep__Group__2__Impl : ( ( rule__WhenStep__DescAssignment_2 )* ) ;
    public final void rule__WhenStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1299:1: ( ( ( rule__WhenStep__DescAssignment_2 )* ) )
            // InternalGherkin.g:1300:1: ( ( rule__WhenStep__DescAssignment_2 )* )
            {
            // InternalGherkin.g:1300:1: ( ( rule__WhenStep__DescAssignment_2 )* )
            // InternalGherkin.g:1301:2: ( rule__WhenStep__DescAssignment_2 )*
            {
             before(grammarAccess.getWhenStepAccess().getDescAssignment_2()); 
            // InternalGherkin.g:1302:2: ( rule__WhenStep__DescAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_TEXT && LA20_0<=RULE_CODE)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGherkin.g:1302:3: rule__WhenStep__DescAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__WhenStep__DescAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getWhenStepAccess().getDescAssignment_2()); 

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
    // $ANTLR end "rule__WhenStep__Group__2__Impl"


    // $ANTLR start "rule__WhenStep__Group__3"
    // InternalGherkin.g:1310:1: rule__WhenStep__Group__3 : rule__WhenStep__Group__3__Impl ;
    public final void rule__WhenStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1314:1: ( rule__WhenStep__Group__3__Impl )
            // InternalGherkin.g:1315:2: rule__WhenStep__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhenStep__Group__3__Impl();

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
    // $ANTLR end "rule__WhenStep__Group__3"


    // $ANTLR start "rule__WhenStep__Group__3__Impl"
    // InternalGherkin.g:1321:1: rule__WhenStep__Group__3__Impl : ( ( rule__WhenStep__RowsAssignment_3 )* ) ;
    public final void rule__WhenStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1325:1: ( ( ( rule__WhenStep__RowsAssignment_3 )* ) )
            // InternalGherkin.g:1326:1: ( ( rule__WhenStep__RowsAssignment_3 )* )
            {
            // InternalGherkin.g:1326:1: ( ( rule__WhenStep__RowsAssignment_3 )* )
            // InternalGherkin.g:1327:2: ( rule__WhenStep__RowsAssignment_3 )*
            {
             before(grammarAccess.getWhenStepAccess().getRowsAssignment_3()); 
            // InternalGherkin.g:1328:2: ( rule__WhenStep__RowsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_EXAMPLE_CELL) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGherkin.g:1328:3: rule__WhenStep__RowsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__WhenStep__RowsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getWhenStepAccess().getRowsAssignment_3()); 

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
    // $ANTLR end "rule__WhenStep__Group__3__Impl"


    // $ANTLR start "rule__ThenStep__Group__0"
    // InternalGherkin.g:1337:1: rule__ThenStep__Group__0 : rule__ThenStep__Group__0__Impl rule__ThenStep__Group__1 ;
    public final void rule__ThenStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1341:1: ( rule__ThenStep__Group__0__Impl rule__ThenStep__Group__1 )
            // InternalGherkin.g:1342:2: rule__ThenStep__Group__0__Impl rule__ThenStep__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ThenStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThenStep__Group__1();

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
    // $ANTLR end "rule__ThenStep__Group__0"


    // $ANTLR start "rule__ThenStep__Group__0__Impl"
    // InternalGherkin.g:1349:1: rule__ThenStep__Group__0__Impl : ( ( rule__ThenStep__TagsAssignment_0 )* ) ;
    public final void rule__ThenStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1353:1: ( ( ( rule__ThenStep__TagsAssignment_0 )* ) )
            // InternalGherkin.g:1354:1: ( ( rule__ThenStep__TagsAssignment_0 )* )
            {
            // InternalGherkin.g:1354:1: ( ( rule__ThenStep__TagsAssignment_0 )* )
            // InternalGherkin.g:1355:2: ( rule__ThenStep__TagsAssignment_0 )*
            {
             before(grammarAccess.getThenStepAccess().getTagsAssignment_0()); 
            // InternalGherkin.g:1356:2: ( rule__ThenStep__TagsAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_TAG) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGherkin.g:1356:3: rule__ThenStep__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ThenStep__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getThenStepAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__ThenStep__Group__0__Impl"


    // $ANTLR start "rule__ThenStep__Group__1"
    // InternalGherkin.g:1364:1: rule__ThenStep__Group__1 : rule__ThenStep__Group__1__Impl rule__ThenStep__Group__2 ;
    public final void rule__ThenStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1368:1: ( rule__ThenStep__Group__1__Impl rule__ThenStep__Group__2 )
            // InternalGherkin.g:1369:2: rule__ThenStep__Group__1__Impl rule__ThenStep__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ThenStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThenStep__Group__2();

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
    // $ANTLR end "rule__ThenStep__Group__1"


    // $ANTLR start "rule__ThenStep__Group__1__Impl"
    // InternalGherkin.g:1376:1: rule__ThenStep__Group__1__Impl : ( ( rule__ThenStep__DescAssignment_1 ) ) ;
    public final void rule__ThenStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1380:1: ( ( ( rule__ThenStep__DescAssignment_1 ) ) )
            // InternalGherkin.g:1381:1: ( ( rule__ThenStep__DescAssignment_1 ) )
            {
            // InternalGherkin.g:1381:1: ( ( rule__ThenStep__DescAssignment_1 ) )
            // InternalGherkin.g:1382:2: ( rule__ThenStep__DescAssignment_1 )
            {
             before(grammarAccess.getThenStepAccess().getDescAssignment_1()); 
            // InternalGherkin.g:1383:2: ( rule__ThenStep__DescAssignment_1 )
            // InternalGherkin.g:1383:3: rule__ThenStep__DescAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ThenStep__DescAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThenStepAccess().getDescAssignment_1()); 

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
    // $ANTLR end "rule__ThenStep__Group__1__Impl"


    // $ANTLR start "rule__ThenStep__Group__2"
    // InternalGherkin.g:1391:1: rule__ThenStep__Group__2 : rule__ThenStep__Group__2__Impl rule__ThenStep__Group__3 ;
    public final void rule__ThenStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1395:1: ( rule__ThenStep__Group__2__Impl rule__ThenStep__Group__3 )
            // InternalGherkin.g:1396:2: rule__ThenStep__Group__2__Impl rule__ThenStep__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ThenStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThenStep__Group__3();

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
    // $ANTLR end "rule__ThenStep__Group__2"


    // $ANTLR start "rule__ThenStep__Group__2__Impl"
    // InternalGherkin.g:1403:1: rule__ThenStep__Group__2__Impl : ( ( rule__ThenStep__DescAssignment_2 )* ) ;
    public final void rule__ThenStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1407:1: ( ( ( rule__ThenStep__DescAssignment_2 )* ) )
            // InternalGherkin.g:1408:1: ( ( rule__ThenStep__DescAssignment_2 )* )
            {
            // InternalGherkin.g:1408:1: ( ( rule__ThenStep__DescAssignment_2 )* )
            // InternalGherkin.g:1409:2: ( rule__ThenStep__DescAssignment_2 )*
            {
             before(grammarAccess.getThenStepAccess().getDescAssignment_2()); 
            // InternalGherkin.g:1410:2: ( rule__ThenStep__DescAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_TEXT && LA23_0<=RULE_CODE)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGherkin.g:1410:3: rule__ThenStep__DescAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ThenStep__DescAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getThenStepAccess().getDescAssignment_2()); 

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
    // $ANTLR end "rule__ThenStep__Group__2__Impl"


    // $ANTLR start "rule__ThenStep__Group__3"
    // InternalGherkin.g:1418:1: rule__ThenStep__Group__3 : rule__ThenStep__Group__3__Impl ;
    public final void rule__ThenStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1422:1: ( rule__ThenStep__Group__3__Impl )
            // InternalGherkin.g:1423:2: rule__ThenStep__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ThenStep__Group__3__Impl();

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
    // $ANTLR end "rule__ThenStep__Group__3"


    // $ANTLR start "rule__ThenStep__Group__3__Impl"
    // InternalGherkin.g:1429:1: rule__ThenStep__Group__3__Impl : ( ( rule__ThenStep__RowsAssignment_3 )* ) ;
    public final void rule__ThenStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1433:1: ( ( ( rule__ThenStep__RowsAssignment_3 )* ) )
            // InternalGherkin.g:1434:1: ( ( rule__ThenStep__RowsAssignment_3 )* )
            {
            // InternalGherkin.g:1434:1: ( ( rule__ThenStep__RowsAssignment_3 )* )
            // InternalGherkin.g:1435:2: ( rule__ThenStep__RowsAssignment_3 )*
            {
             before(grammarAccess.getThenStepAccess().getRowsAssignment_3()); 
            // InternalGherkin.g:1436:2: ( rule__ThenStep__RowsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_EXAMPLE_CELL) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGherkin.g:1436:3: rule__ThenStep__RowsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ThenStep__RowsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getThenStepAccess().getRowsAssignment_3()); 

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
    // $ANTLR end "rule__ThenStep__Group__3__Impl"


    // $ANTLR start "rule__GivenStep__Group__0"
    // InternalGherkin.g:1445:1: rule__GivenStep__Group__0 : rule__GivenStep__Group__0__Impl rule__GivenStep__Group__1 ;
    public final void rule__GivenStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1449:1: ( rule__GivenStep__Group__0__Impl rule__GivenStep__Group__1 )
            // InternalGherkin.g:1450:2: rule__GivenStep__Group__0__Impl rule__GivenStep__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__GivenStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivenStep__Group__1();

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
    // $ANTLR end "rule__GivenStep__Group__0"


    // $ANTLR start "rule__GivenStep__Group__0__Impl"
    // InternalGherkin.g:1457:1: rule__GivenStep__Group__0__Impl : ( ( rule__GivenStep__TagsAssignment_0 )* ) ;
    public final void rule__GivenStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1461:1: ( ( ( rule__GivenStep__TagsAssignment_0 )* ) )
            // InternalGherkin.g:1462:1: ( ( rule__GivenStep__TagsAssignment_0 )* )
            {
            // InternalGherkin.g:1462:1: ( ( rule__GivenStep__TagsAssignment_0 )* )
            // InternalGherkin.g:1463:2: ( rule__GivenStep__TagsAssignment_0 )*
            {
             before(grammarAccess.getGivenStepAccess().getTagsAssignment_0()); 
            // InternalGherkin.g:1464:2: ( rule__GivenStep__TagsAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_TAG) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGherkin.g:1464:3: rule__GivenStep__TagsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__GivenStep__TagsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getGivenStepAccess().getTagsAssignment_0()); 

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
    // $ANTLR end "rule__GivenStep__Group__0__Impl"


    // $ANTLR start "rule__GivenStep__Group__1"
    // InternalGherkin.g:1472:1: rule__GivenStep__Group__1 : rule__GivenStep__Group__1__Impl rule__GivenStep__Group__2 ;
    public final void rule__GivenStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1476:1: ( rule__GivenStep__Group__1__Impl rule__GivenStep__Group__2 )
            // InternalGherkin.g:1477:2: rule__GivenStep__Group__1__Impl rule__GivenStep__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__GivenStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivenStep__Group__2();

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
    // $ANTLR end "rule__GivenStep__Group__1"


    // $ANTLR start "rule__GivenStep__Group__1__Impl"
    // InternalGherkin.g:1484:1: rule__GivenStep__Group__1__Impl : ( ( rule__GivenStep__DescAssignment_1 ) ) ;
    public final void rule__GivenStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1488:1: ( ( ( rule__GivenStep__DescAssignment_1 ) ) )
            // InternalGherkin.g:1489:1: ( ( rule__GivenStep__DescAssignment_1 ) )
            {
            // InternalGherkin.g:1489:1: ( ( rule__GivenStep__DescAssignment_1 ) )
            // InternalGherkin.g:1490:2: ( rule__GivenStep__DescAssignment_1 )
            {
             before(grammarAccess.getGivenStepAccess().getDescAssignment_1()); 
            // InternalGherkin.g:1491:2: ( rule__GivenStep__DescAssignment_1 )
            // InternalGherkin.g:1491:3: rule__GivenStep__DescAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GivenStep__DescAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGivenStepAccess().getDescAssignment_1()); 

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
    // $ANTLR end "rule__GivenStep__Group__1__Impl"


    // $ANTLR start "rule__GivenStep__Group__2"
    // InternalGherkin.g:1499:1: rule__GivenStep__Group__2 : rule__GivenStep__Group__2__Impl rule__GivenStep__Group__3 ;
    public final void rule__GivenStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1503:1: ( rule__GivenStep__Group__2__Impl rule__GivenStep__Group__3 )
            // InternalGherkin.g:1504:2: rule__GivenStep__Group__2__Impl rule__GivenStep__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__GivenStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivenStep__Group__3();

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
    // $ANTLR end "rule__GivenStep__Group__2"


    // $ANTLR start "rule__GivenStep__Group__2__Impl"
    // InternalGherkin.g:1511:1: rule__GivenStep__Group__2__Impl : ( ( rule__GivenStep__DescAssignment_2 )* ) ;
    public final void rule__GivenStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1515:1: ( ( ( rule__GivenStep__DescAssignment_2 )* ) )
            // InternalGherkin.g:1516:1: ( ( rule__GivenStep__DescAssignment_2 )* )
            {
            // InternalGherkin.g:1516:1: ( ( rule__GivenStep__DescAssignment_2 )* )
            // InternalGherkin.g:1517:2: ( rule__GivenStep__DescAssignment_2 )*
            {
             before(grammarAccess.getGivenStepAccess().getDescAssignment_2()); 
            // InternalGherkin.g:1518:2: ( rule__GivenStep__DescAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_TEXT && LA26_0<=RULE_CODE)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalGherkin.g:1518:3: rule__GivenStep__DescAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__GivenStep__DescAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getGivenStepAccess().getDescAssignment_2()); 

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
    // $ANTLR end "rule__GivenStep__Group__2__Impl"


    // $ANTLR start "rule__GivenStep__Group__3"
    // InternalGherkin.g:1526:1: rule__GivenStep__Group__3 : rule__GivenStep__Group__3__Impl ;
    public final void rule__GivenStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1530:1: ( rule__GivenStep__Group__3__Impl )
            // InternalGherkin.g:1531:2: rule__GivenStep__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GivenStep__Group__3__Impl();

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
    // $ANTLR end "rule__GivenStep__Group__3"


    // $ANTLR start "rule__GivenStep__Group__3__Impl"
    // InternalGherkin.g:1537:1: rule__GivenStep__Group__3__Impl : ( ( rule__GivenStep__RowsAssignment_3 )* ) ;
    public final void rule__GivenStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1541:1: ( ( ( rule__GivenStep__RowsAssignment_3 )* ) )
            // InternalGherkin.g:1542:1: ( ( rule__GivenStep__RowsAssignment_3 )* )
            {
            // InternalGherkin.g:1542:1: ( ( rule__GivenStep__RowsAssignment_3 )* )
            // InternalGherkin.g:1543:2: ( rule__GivenStep__RowsAssignment_3 )*
            {
             before(grammarAccess.getGivenStepAccess().getRowsAssignment_3()); 
            // InternalGherkin.g:1544:2: ( rule__GivenStep__RowsAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_EXAMPLE_CELL) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalGherkin.g:1544:3: rule__GivenStep__RowsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GivenStep__RowsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getGivenStepAccess().getRowsAssignment_3()); 

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
    // $ANTLR end "rule__GivenStep__Group__3__Impl"


    // $ANTLR start "rule__AndStep__Group__0"
    // InternalGherkin.g:1553:1: rule__AndStep__Group__0 : rule__AndStep__Group__0__Impl rule__AndStep__Group__1 ;
    public final void rule__AndStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1557:1: ( rule__AndStep__Group__0__Impl rule__AndStep__Group__1 )
            // InternalGherkin.g:1558:2: rule__AndStep__Group__0__Impl rule__AndStep__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__AndStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndStep__Group__1();

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
    // $ANTLR end "rule__AndStep__Group__0"


    // $ANTLR start "rule__AndStep__Group__0__Impl"
    // InternalGherkin.g:1565:1: rule__AndStep__Group__0__Impl : ( ( rule__AndStep__DescAssignment_0 ) ) ;
    public final void rule__AndStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1569:1: ( ( ( rule__AndStep__DescAssignment_0 ) ) )
            // InternalGherkin.g:1570:1: ( ( rule__AndStep__DescAssignment_0 ) )
            {
            // InternalGherkin.g:1570:1: ( ( rule__AndStep__DescAssignment_0 ) )
            // InternalGherkin.g:1571:2: ( rule__AndStep__DescAssignment_0 )
            {
             before(grammarAccess.getAndStepAccess().getDescAssignment_0()); 
            // InternalGherkin.g:1572:2: ( rule__AndStep__DescAssignment_0 )
            // InternalGherkin.g:1572:3: rule__AndStep__DescAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AndStep__DescAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAndStepAccess().getDescAssignment_0()); 

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
    // $ANTLR end "rule__AndStep__Group__0__Impl"


    // $ANTLR start "rule__AndStep__Group__1"
    // InternalGherkin.g:1580:1: rule__AndStep__Group__1 : rule__AndStep__Group__1__Impl rule__AndStep__Group__2 ;
    public final void rule__AndStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1584:1: ( rule__AndStep__Group__1__Impl rule__AndStep__Group__2 )
            // InternalGherkin.g:1585:2: rule__AndStep__Group__1__Impl rule__AndStep__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__AndStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndStep__Group__2();

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
    // $ANTLR end "rule__AndStep__Group__1"


    // $ANTLR start "rule__AndStep__Group__1__Impl"
    // InternalGherkin.g:1592:1: rule__AndStep__Group__1__Impl : ( ( rule__AndStep__DescAssignment_1 )* ) ;
    public final void rule__AndStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1596:1: ( ( ( rule__AndStep__DescAssignment_1 )* ) )
            // InternalGherkin.g:1597:1: ( ( rule__AndStep__DescAssignment_1 )* )
            {
            // InternalGherkin.g:1597:1: ( ( rule__AndStep__DescAssignment_1 )* )
            // InternalGherkin.g:1598:2: ( rule__AndStep__DescAssignment_1 )*
            {
             before(grammarAccess.getAndStepAccess().getDescAssignment_1()); 
            // InternalGherkin.g:1599:2: ( rule__AndStep__DescAssignment_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_TEXT && LA28_0<=RULE_CODE)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGherkin.g:1599:3: rule__AndStep__DescAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__AndStep__DescAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getAndStepAccess().getDescAssignment_1()); 

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
    // $ANTLR end "rule__AndStep__Group__1__Impl"


    // $ANTLR start "rule__AndStep__Group__2"
    // InternalGherkin.g:1607:1: rule__AndStep__Group__2 : rule__AndStep__Group__2__Impl ;
    public final void rule__AndStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1611:1: ( rule__AndStep__Group__2__Impl )
            // InternalGherkin.g:1612:2: rule__AndStep__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndStep__Group__2__Impl();

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
    // $ANTLR end "rule__AndStep__Group__2"


    // $ANTLR start "rule__AndStep__Group__2__Impl"
    // InternalGherkin.g:1618:1: rule__AndStep__Group__2__Impl : ( ( rule__AndStep__RowsAssignment_2 )* ) ;
    public final void rule__AndStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1622:1: ( ( ( rule__AndStep__RowsAssignment_2 )* ) )
            // InternalGherkin.g:1623:1: ( ( rule__AndStep__RowsAssignment_2 )* )
            {
            // InternalGherkin.g:1623:1: ( ( rule__AndStep__RowsAssignment_2 )* )
            // InternalGherkin.g:1624:2: ( rule__AndStep__RowsAssignment_2 )*
            {
             before(grammarAccess.getAndStepAccess().getRowsAssignment_2()); 
            // InternalGherkin.g:1625:2: ( rule__AndStep__RowsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_EXAMPLE_CELL) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGherkin.g:1625:3: rule__AndStep__RowsAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AndStep__RowsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getAndStepAccess().getRowsAssignment_2()); 

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
    // $ANTLR end "rule__AndStep__Group__2__Impl"


    // $ANTLR start "rule__Feature__TagsAssignment_0"
    // InternalGherkin.g:1634:1: rule__Feature__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__Feature__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1638:1: ( ( RULE_TAG ) )
            // InternalGherkin.g:1639:2: ( RULE_TAG )
            {
            // InternalGherkin.g:1639:2: ( RULE_TAG )
            // InternalGherkin.g:1640:3: RULE_TAG
            {
             before(grammarAccess.getFeatureAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getTagsTAGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Feature__TagsAssignment_0"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // InternalGherkin.g:1649:1: rule__Feature__NameAssignment_1 : ( RULE_FEATURE_TEXT ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1653:1: ( ( RULE_FEATURE_TEXT ) )
            // InternalGherkin.g:1654:2: ( RULE_FEATURE_TEXT )
            {
            // InternalGherkin.g:1654:2: ( RULE_FEATURE_TEXT )
            // InternalGherkin.g:1655:3: RULE_FEATURE_TEXT
            {
             before(grammarAccess.getFeatureAccess().getNameFEATURE_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_FEATURE_TEXT,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameFEATURE_TEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__ElementsAssignment_2"
    // InternalGherkin.g:1664:1: rule__Feature__ElementsAssignment_2 : ( ruleNarrativeElement ) ;
    public final void rule__Feature__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1668:1: ( ( ruleNarrativeElement ) )
            // InternalGherkin.g:1669:2: ( ruleNarrativeElement )
            {
            // InternalGherkin.g:1669:2: ( ruleNarrativeElement )
            // InternalGherkin.g:1670:3: ruleNarrativeElement
            {
             before(grammarAccess.getFeatureAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNarrativeElement();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getElementsNarrativeElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Feature__ElementsAssignment_2"


    // $ANTLR start "rule__Feature__ScenariosAssignment_3"
    // InternalGherkin.g:1679:1: rule__Feature__ScenariosAssignment_3 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__ScenariosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1683:1: ( ( ruleAbstractScenario ) )
            // InternalGherkin.g:1684:2: ( ruleAbstractScenario )
            {
            // InternalGherkin.g:1684:2: ( ruleAbstractScenario )
            // InternalGherkin.g:1685:3: ruleAbstractScenario
            {
             before(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getScenariosAbstractScenarioParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Feature__ScenariosAssignment_3"


    // $ANTLR start "rule__FreeText__NameAssignment"
    // InternalGherkin.g:1694:1: rule__FreeText__NameAssignment : ( RULE_TEXT ) ;
    public final void rule__FreeText__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1698:1: ( ( RULE_TEXT ) )
            // InternalGherkin.g:1699:2: ( RULE_TEXT )
            {
            // InternalGherkin.g:1699:2: ( RULE_TEXT )
            // InternalGherkin.g:1700:3: RULE_TEXT
            {
             before(grammarAccess.getFreeTextAccess().getNameTEXTTerminalRuleCall_0()); 
            match(input,RULE_TEXT,FOLLOW_2); 
             after(grammarAccess.getFreeTextAccess().getNameTEXTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FreeText__NameAssignment"


    // $ANTLR start "rule__AsA__NameAssignment"
    // InternalGherkin.g:1709:1: rule__AsA__NameAssignment : ( RULE_AS_A ) ;
    public final void rule__AsA__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1713:1: ( ( RULE_AS_A ) )
            // InternalGherkin.g:1714:2: ( RULE_AS_A )
            {
            // InternalGherkin.g:1714:2: ( RULE_AS_A )
            // InternalGherkin.g:1715:3: RULE_AS_A
            {
             before(grammarAccess.getAsAAccess().getNameAS_ATerminalRuleCall_0()); 
            match(input,RULE_AS_A,FOLLOW_2); 
             after(grammarAccess.getAsAAccess().getNameAS_ATerminalRuleCall_0()); 

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
    // $ANTLR end "rule__AsA__NameAssignment"


    // $ANTLR start "rule__InOrderTo__NameAssignment"
    // InternalGherkin.g:1724:1: rule__InOrderTo__NameAssignment : ( RULE_IN_ORDER_TO ) ;
    public final void rule__InOrderTo__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1728:1: ( ( RULE_IN_ORDER_TO ) )
            // InternalGherkin.g:1729:2: ( RULE_IN_ORDER_TO )
            {
            // InternalGherkin.g:1729:2: ( RULE_IN_ORDER_TO )
            // InternalGherkin.g:1730:3: RULE_IN_ORDER_TO
            {
             before(grammarAccess.getInOrderToAccess().getNameIN_ORDER_TOTerminalRuleCall_0()); 
            match(input,RULE_IN_ORDER_TO,FOLLOW_2); 
             after(grammarAccess.getInOrderToAccess().getNameIN_ORDER_TOTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__InOrderTo__NameAssignment"


    // $ANTLR start "rule__IWantTo__NameAssignment"
    // InternalGherkin.g:1739:1: rule__IWantTo__NameAssignment : ( RULE_I_WANT_TO ) ;
    public final void rule__IWantTo__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1743:1: ( ( RULE_I_WANT_TO ) )
            // InternalGherkin.g:1744:2: ( RULE_I_WANT_TO )
            {
            // InternalGherkin.g:1744:2: ( RULE_I_WANT_TO )
            // InternalGherkin.g:1745:3: RULE_I_WANT_TO
            {
             before(grammarAccess.getIWantToAccess().getNameI_WANT_TOTerminalRuleCall_0()); 
            match(input,RULE_I_WANT_TO,FOLLOW_2); 
             after(grammarAccess.getIWantToAccess().getNameI_WANT_TOTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IWantTo__NameAssignment"


    // $ANTLR start "rule__Scenario__TagsAssignment_0"
    // InternalGherkin.g:1754:1: rule__Scenario__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__Scenario__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1758:1: ( ( RULE_TAG ) )
            // InternalGherkin.g:1759:2: ( RULE_TAG )
            {
            // InternalGherkin.g:1759:2: ( RULE_TAG )
            // InternalGherkin.g:1760:3: RULE_TAG
            {
             before(grammarAccess.getScenarioAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getTagsTAGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Scenario__TagsAssignment_0"


    // $ANTLR start "rule__Scenario__NameAssignment_1"
    // InternalGherkin.g:1769:1: rule__Scenario__NameAssignment_1 : ( RULE_SCENARIO_TEXT ) ;
    public final void rule__Scenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1773:1: ( ( RULE_SCENARIO_TEXT ) )
            // InternalGherkin.g:1774:2: ( RULE_SCENARIO_TEXT )
            {
            // InternalGherkin.g:1774:2: ( RULE_SCENARIO_TEXT )
            // InternalGherkin.g:1775:3: RULE_SCENARIO_TEXT
            {
             before(grammarAccess.getScenarioAccess().getNameSCENARIO_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_SCENARIO_TEXT,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getNameSCENARIO_TEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Scenario__NameAssignment_1"


    // $ANTLR start "rule__Scenario__ElementsAssignment_2"
    // InternalGherkin.g:1784:1: rule__Scenario__ElementsAssignment_2 : ( ruleNarrativeElement ) ;
    public final void rule__Scenario__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1788:1: ( ( ruleNarrativeElement ) )
            // InternalGherkin.g:1789:2: ( ruleNarrativeElement )
            {
            // InternalGherkin.g:1789:2: ( ruleNarrativeElement )
            // InternalGherkin.g:1790:3: ruleNarrativeElement
            {
             before(grammarAccess.getScenarioAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNarrativeElement();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getElementsNarrativeElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Scenario__ElementsAssignment_2"


    // $ANTLR start "rule__Scenario__StepsAssignment_3"
    // InternalGherkin.g:1799:1: rule__Scenario__StepsAssignment_3 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1803:1: ( ( ruleStep ) )
            // InternalGherkin.g:1804:2: ( ruleStep )
            {
            // InternalGherkin.g:1804:2: ( ruleStep )
            // InternalGherkin.g:1805:3: ruleStep
            {
             before(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Scenario__StepsAssignment_3"


    // $ANTLR start "rule__ScenarioWithOutline__TagsAssignment_0"
    // InternalGherkin.g:1814:1: rule__ScenarioWithOutline__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__ScenarioWithOutline__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1818:1: ( ( RULE_TAG ) )
            // InternalGherkin.g:1819:2: ( RULE_TAG )
            {
            // InternalGherkin.g:1819:2: ( RULE_TAG )
            // InternalGherkin.g:1820:3: RULE_TAG
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_2); 
             after(grammarAccess.getScenarioWithOutlineAccess().getTagsTAGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__TagsAssignment_0"


    // $ANTLR start "rule__ScenarioWithOutline__NameAssignment_1"
    // InternalGherkin.g:1829:1: rule__ScenarioWithOutline__NameAssignment_1 : ( RULE_SCENARIO_OUTLINE_TEXT ) ;
    public final void rule__ScenarioWithOutline__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1833:1: ( ( RULE_SCENARIO_OUTLINE_TEXT ) )
            // InternalGherkin.g:1834:2: ( RULE_SCENARIO_OUTLINE_TEXT )
            {
            // InternalGherkin.g:1834:2: ( RULE_SCENARIO_OUTLINE_TEXT )
            // InternalGherkin.g:1835:3: RULE_SCENARIO_OUTLINE_TEXT
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getNameSCENARIO_OUTLINE_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_SCENARIO_OUTLINE_TEXT,FOLLOW_2); 
             after(grammarAccess.getScenarioWithOutlineAccess().getNameSCENARIO_OUTLINE_TEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__NameAssignment_1"


    // $ANTLR start "rule__ScenarioWithOutline__ElementsAssignment_2"
    // InternalGherkin.g:1844:1: rule__ScenarioWithOutline__ElementsAssignment_2 : ( ruleNarrativeElement ) ;
    public final void rule__ScenarioWithOutline__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1848:1: ( ( ruleNarrativeElement ) )
            // InternalGherkin.g:1849:2: ( ruleNarrativeElement )
            {
            // InternalGherkin.g:1849:2: ( ruleNarrativeElement )
            // InternalGherkin.g:1850:3: ruleNarrativeElement
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getElementsNarrativeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNarrativeElement();

            state._fsp--;

             after(grammarAccess.getScenarioWithOutlineAccess().getElementsNarrativeElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__ElementsAssignment_2"


    // $ANTLR start "rule__ScenarioWithOutline__StepsAssignment_3"
    // InternalGherkin.g:1859:1: rule__ScenarioWithOutline__StepsAssignment_3 : ( ruleStep ) ;
    public final void rule__ScenarioWithOutline__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1863:1: ( ( ruleStep ) )
            // InternalGherkin.g:1864:2: ( ruleStep )
            {
            // InternalGherkin.g:1864:2: ( ruleStep )
            // InternalGherkin.g:1865:3: ruleStep
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getStepsStepParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioWithOutlineAccess().getStepsStepParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__StepsAssignment_3"


    // $ANTLR start "rule__ScenarioWithOutline__ExampleAssignment_4"
    // InternalGherkin.g:1874:1: rule__ScenarioWithOutline__ExampleAssignment_4 : ( ruleExample ) ;
    public final void rule__ScenarioWithOutline__ExampleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1878:1: ( ( ruleExample ) )
            // InternalGherkin.g:1879:2: ( ruleExample )
            {
            // InternalGherkin.g:1879:2: ( ruleExample )
            // InternalGherkin.g:1880:3: ruleExample
            {
             before(grammarAccess.getScenarioWithOutlineAccess().getExampleExampleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExample();

            state._fsp--;

             after(grammarAccess.getScenarioWithOutlineAccess().getExampleExampleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ScenarioWithOutline__ExampleAssignment_4"


    // $ANTLR start "rule__Example__HeadingAssignment_1"
    // InternalGherkin.g:1889:1: rule__Example__HeadingAssignment_1 : ( ruleExampleRow ) ;
    public final void rule__Example__HeadingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1893:1: ( ( ruleExampleRow ) )
            // InternalGherkin.g:1894:2: ( ruleExampleRow )
            {
            // InternalGherkin.g:1894:2: ( ruleExampleRow )
            // InternalGherkin.g:1895:3: ruleExampleRow
            {
             before(grammarAccess.getExampleAccess().getHeadingExampleRowParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getHeadingExampleRowParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Example__HeadingAssignment_1"


    // $ANTLR start "rule__Example__RowsAssignment_2"
    // InternalGherkin.g:1904:1: rule__Example__RowsAssignment_2 : ( ruleExampleRow ) ;
    public final void rule__Example__RowsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1908:1: ( ( ruleExampleRow ) )
            // InternalGherkin.g:1909:2: ( ruleExampleRow )
            {
            // InternalGherkin.g:1909:2: ( ruleExampleRow )
            // InternalGherkin.g:1910:3: ruleExampleRow
            {
             before(grammarAccess.getExampleAccess().getRowsExampleRowParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getRowsExampleRowParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Example__RowsAssignment_2"


    // $ANTLR start "rule__ExampleRow__CellsAssignment_0"
    // InternalGherkin.g:1919:1: rule__ExampleRow__CellsAssignment_0 : ( ruleExampleCell ) ;
    public final void rule__ExampleRow__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1923:1: ( ( ruleExampleCell ) )
            // InternalGherkin.g:1924:2: ( ruleExampleCell )
            {
            // InternalGherkin.g:1924:2: ( ruleExampleCell )
            // InternalGherkin.g:1925:3: ruleExampleCell
            {
             before(grammarAccess.getExampleRowAccess().getCellsExampleCellParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExampleCell();

            state._fsp--;

             after(grammarAccess.getExampleRowAccess().getCellsExampleCellParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ExampleRow__CellsAssignment_0"


    // $ANTLR start "rule__ExampleCell__ValueAssignment"
    // InternalGherkin.g:1934:1: rule__ExampleCell__ValueAssignment : ( RULE_EXAMPLE_CELL ) ;
    public final void rule__ExampleCell__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1938:1: ( ( RULE_EXAMPLE_CELL ) )
            // InternalGherkin.g:1939:2: ( RULE_EXAMPLE_CELL )
            {
            // InternalGherkin.g:1939:2: ( RULE_EXAMPLE_CELL )
            // InternalGherkin.g:1940:3: RULE_EXAMPLE_CELL
            {
             before(grammarAccess.getExampleCellAccess().getValueEXAMPLE_CELLTerminalRuleCall_0()); 
            match(input,RULE_EXAMPLE_CELL,FOLLOW_2); 
             after(grammarAccess.getExampleCellAccess().getValueEXAMPLE_CELLTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ExampleCell__ValueAssignment"


    // $ANTLR start "rule__Background__TagsAssignment_0"
    // InternalGherkin.g:1949:1: rule__Background__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__Background__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1953:1: ( ( RULE_TAG ) )
            // InternalGherkin.g:1954:2: ( RULE_TAG )
            {
            // InternalGherkin.g:1954:2: ( RULE_TAG )
            // InternalGherkin.g:1955:3: RULE_TAG
            {
             before(grammarAccess.getBackgroundAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getTagsTAGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Background__TagsAssignment_0"


    // $ANTLR start "rule__Background__NameAssignment_1"
    // InternalGherkin.g:1964:1: rule__Background__NameAssignment_1 : ( RULE_BACKGROUND_TEXT ) ;
    public final void rule__Background__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1968:1: ( ( RULE_BACKGROUND_TEXT ) )
            // InternalGherkin.g:1969:2: ( RULE_BACKGROUND_TEXT )
            {
            // InternalGherkin.g:1969:2: ( RULE_BACKGROUND_TEXT )
            // InternalGherkin.g:1970:3: RULE_BACKGROUND_TEXT
            {
             before(grammarAccess.getBackgroundAccess().getNameBACKGROUND_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_BACKGROUND_TEXT,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getNameBACKGROUND_TEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Background__NameAssignment_1"


    // $ANTLR start "rule__Background__StepsAssignment_2"
    // InternalGherkin.g:1979:1: rule__Background__StepsAssignment_2 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1983:1: ( ( ruleStep ) )
            // InternalGherkin.g:1984:2: ( ruleStep )
            {
            // InternalGherkin.g:1984:2: ( ruleStep )
            // InternalGherkin.g:1985:3: ruleStep
            {
             before(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Background__StepsAssignment_2"


    // $ANTLR start "rule__WhenStep__TagsAssignment_0"
    // InternalGherkin.g:1994:1: rule__WhenStep__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__WhenStep__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:1998:1: ( ( RULE_TAG ) )
            // InternalGherkin.g:1999:2: ( RULE_TAG )
            {
            // InternalGherkin.g:1999:2: ( RULE_TAG )
            // InternalGherkin.g:2000:3: RULE_TAG
            {
             before(grammarAccess.getWhenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_2); 
             after(grammarAccess.getWhenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__WhenStep__TagsAssignment_0"


    // $ANTLR start "rule__WhenStep__DescAssignment_1"
    // InternalGherkin.g:2009:1: rule__WhenStep__DescAssignment_1 : ( RULE_WHEN_TEXT ) ;
    public final void rule__WhenStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:2013:1: ( ( RULE_WHEN_TEXT ) )
            // InternalGherkin.g:2014:2: ( RULE_WHEN_TEXT )
            {
            // InternalGherkin.g:2014:2: ( RULE_WHEN_TEXT )
            // InternalGherkin.g:2015:3: RULE_WHEN_TEXT
            {
             before(grammarAccess.getWhenStepAccess().getDescWHEN_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_WHEN_TEXT,FOLLOW_2); 
             after(grammarAccess.getWhenStepAccess().getDescWHEN_TEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__WhenStep__DescAssignment_1"


    // $ANTLR start "rule__WhenStep__DescAssignment_2"
    // InternalGherkin.g:2024:1: rule__WhenStep__DescAssignment_2 : ( ruleOptionalText ) ;
    public final void rule__WhenStep__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:2028:1: ( ( ruleOptionalText ) )
            // InternalGherkin.g:2029:2: ( ruleOptionalText )
            {
            // InternalGherkin.g:2029:2: ( ruleOptionalText )
            // InternalGherkin.g:2030:3: ruleOptionalText
            {
             before(grammarAccess.getWhenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionalText();

            state._fsp--;

             after(grammarAccess.getWhenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__WhenStep__DescAssignment_2"


    // $ANTLR start "rule__WhenStep__RowsAssignment_3"
    // InternalGherkin.g:2039:1: rule__WhenStep__RowsAssignment_3 : ( ruleExampleRow ) ;
    public final void rule__WhenStep__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:2043:1: ( ( ruleExampleRow ) )
            // InternalGherkin.g:2044:2: ( ruleExampleRow )
            {
            // InternalGherkin.g:2044:2: ( ruleExampleRow )
            // InternalGherkin.g:2045:3: ruleExampleRow
            {
             before(grammarAccess.getWhenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getWhenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__WhenStep__RowsAssignment_3"


    // $ANTLR start "rule__ThenStep__TagsAssignment_0"
    // InternalGherkin.g:2054:1: rule__ThenStep__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__ThenStep__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:2058:1: ( ( RULE_TAG ) )
            // InternalGherkin.g:2059:2: ( RULE_TAG )
            {
            // InternalGherkin.g:2059:2: ( RULE_TAG )
            // InternalGherkin.g:2060:3: RULE_TAG
            {
             before(grammarAccess.getThenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_2); 
             after(grammarAccess.getThenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ThenStep__TagsAssignment_0"


    // $ANTLR start "rule__ThenStep__DescAssignment_1"
    // InternalGherkin.g:2069:1: rule__ThenStep__DescAssignment_1 : ( RULE_THEN_TEXT ) ;
    public final void rule__ThenStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:2073:1: ( ( RULE_THEN_TEXT ) )
            // InternalGherkin.g:2074:2: ( RULE_THEN_TEXT )
            {
            // InternalGherkin.g:2074:2: ( RULE_THEN_TEXT )
            // InternalGherkin.g:2075:3: RULE_THEN_TEXT
            {
             before(grammarAccess.getThenStepAccess().getDescTHEN_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_THEN_TEXT,FOLLOW_2); 
             after(grammarAccess.getThenStepAccess().getDescTHEN_TEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ThenStep__DescAssignment_1"


    // $ANTLR start "rule__ThenStep__DescAssignment_2"
    // InternalGherkin.g:2084:1: rule__ThenStep__DescAssignment_2 : ( ruleOptionalText ) ;
    public final void rule__ThenStep__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:2088:1: ( ( ruleOptionalText ) )
            // InternalGherkin.g:2089:2: ( ruleOptionalText )
            {
            // InternalGherkin.g:2089:2: ( ruleOptionalText )
            // InternalGherkin.g:2090:3: ruleOptionalText
            {
             before(grammarAccess.getThenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionalText();

            state._fsp--;

             after(grammarAccess.getThenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ThenStep__DescAssignment_2"


    // $ANTLR start "rule__ThenStep__RowsAssignment_3"
    // InternalGherkin.g:2099:1: rule__ThenStep__RowsAssignment_3 : ( ruleExampleRow ) ;
    public final void rule__ThenStep__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:2103:1: ( ( ruleExampleRow ) )
            // InternalGherkin.g:2104:2: ( ruleExampleRow )
            {
            // InternalGherkin.g:2104:2: ( ruleExampleRow )
            // InternalGherkin.g:2105:3: ruleExampleRow
            {
             before(grammarAccess.getThenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getThenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ThenStep__RowsAssignment_3"


    // $ANTLR start "rule__GivenStep__TagsAssignment_0"
    // InternalGherkin.g:2114:1: rule__GivenStep__TagsAssignment_0 : ( RULE_TAG ) ;
    public final void rule__GivenStep__TagsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:2118:1: ( ( RULE_TAG ) )
            // InternalGherkin.g:2119:2: ( RULE_TAG )
            {
            // InternalGherkin.g:2119:2: ( RULE_TAG )
            // InternalGherkin.g:2120:3: RULE_TAG
            {
             before(grammarAccess.getGivenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 
            match(input,RULE_TAG,FOLLOW_2); 
             after(grammarAccess.getGivenStepAccess().getTagsTAGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__GivenStep__TagsAssignment_0"


    // $ANTLR start "rule__GivenStep__DescAssignment_1"
    // InternalGherkin.g:2129:1: rule__GivenStep__DescAssignment_1 : ( RULE_GIVEN_TEXT ) ;
    public final void rule__GivenStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:2133:1: ( ( RULE_GIVEN_TEXT ) )
            // InternalGherkin.g:2134:2: ( RULE_GIVEN_TEXT )
            {
            // InternalGherkin.g:2134:2: ( RULE_GIVEN_TEXT )
            // InternalGherkin.g:2135:3: RULE_GIVEN_TEXT
            {
             before(grammarAccess.getGivenStepAccess().getDescGIVEN_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_GIVEN_TEXT,FOLLOW_2); 
             after(grammarAccess.getGivenStepAccess().getDescGIVEN_TEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__GivenStep__DescAssignment_1"


    // $ANTLR start "rule__GivenStep__DescAssignment_2"
    // InternalGherkin.g:2144:1: rule__GivenStep__DescAssignment_2 : ( ruleOptionalText ) ;
    public final void rule__GivenStep__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:2148:1: ( ( ruleOptionalText ) )
            // InternalGherkin.g:2149:2: ( ruleOptionalText )
            {
            // InternalGherkin.g:2149:2: ( ruleOptionalText )
            // InternalGherkin.g:2150:3: ruleOptionalText
            {
             before(grammarAccess.getGivenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionalText();

            state._fsp--;

             after(grammarAccess.getGivenStepAccess().getDescOptionalTextParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__GivenStep__DescAssignment_2"


    // $ANTLR start "rule__GivenStep__RowsAssignment_3"
    // InternalGherkin.g:2159:1: rule__GivenStep__RowsAssignment_3 : ( ruleExampleRow ) ;
    public final void rule__GivenStep__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:2163:1: ( ( ruleExampleRow ) )
            // InternalGherkin.g:2164:2: ( ruleExampleRow )
            {
            // InternalGherkin.g:2164:2: ( ruleExampleRow )
            // InternalGherkin.g:2165:3: ruleExampleRow
            {
             before(grammarAccess.getGivenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getGivenStepAccess().getRowsExampleRowParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__GivenStep__RowsAssignment_3"


    // $ANTLR start "rule__AndStep__DescAssignment_0"
    // InternalGherkin.g:2174:1: rule__AndStep__DescAssignment_0 : ( RULE_AND_TEXT ) ;
    public final void rule__AndStep__DescAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:2178:1: ( ( RULE_AND_TEXT ) )
            // InternalGherkin.g:2179:2: ( RULE_AND_TEXT )
            {
            // InternalGherkin.g:2179:2: ( RULE_AND_TEXT )
            // InternalGherkin.g:2180:3: RULE_AND_TEXT
            {
             before(grammarAccess.getAndStepAccess().getDescAND_TEXTTerminalRuleCall_0_0()); 
            match(input,RULE_AND_TEXT,FOLLOW_2); 
             after(grammarAccess.getAndStepAccess().getDescAND_TEXTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__AndStep__DescAssignment_0"


    // $ANTLR start "rule__AndStep__DescAssignment_1"
    // InternalGherkin.g:2189:1: rule__AndStep__DescAssignment_1 : ( ruleOptionalText ) ;
    public final void rule__AndStep__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:2193:1: ( ( ruleOptionalText ) )
            // InternalGherkin.g:2194:2: ( ruleOptionalText )
            {
            // InternalGherkin.g:2194:2: ( ruleOptionalText )
            // InternalGherkin.g:2195:3: ruleOptionalText
            {
             before(grammarAccess.getAndStepAccess().getDescOptionalTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionalText();

            state._fsp--;

             after(grammarAccess.getAndStepAccess().getDescOptionalTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AndStep__DescAssignment_1"


    // $ANTLR start "rule__AndStep__RowsAssignment_2"
    // InternalGherkin.g:2204:1: rule__AndStep__RowsAssignment_2 : ( ruleExampleRow ) ;
    public final void rule__AndStep__RowsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkin.g:2208:1: ( ( ruleExampleRow ) )
            // InternalGherkin.g:2209:2: ( ruleExampleRow )
            {
            // InternalGherkin.g:2209:2: ( ruleExampleRow )
            // InternalGherkin.g:2210:3: ruleExampleRow
            {
             before(grammarAccess.getAndStepAccess().getRowsExampleRowParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExampleRow();

            state._fsp--;

             after(grammarAccess.getAndStepAccess().getRowsExampleRowParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AndStep__RowsAssignment_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\2\10\3\uffff";
    static final String dfa_3s = "\2\20\3\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\3";
    static final String dfa_5s = "\5\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\4\uffff\1\3\1\4\1\uffff\1\2",
            "\1\1\4\uffff\1\3\1\4\1\uffff\1\2",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "560:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioWithOutline ) );";
        }
    }
    static final String dfa_7s = "\6\uffff";
    static final String dfa_8s = "\2\10\4\uffff";
    static final String dfa_9s = "\1\24\1\23\4\uffff";
    static final String dfa_10s = "\2\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_11s = "\6\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\10\uffff\1\2\1\3\1\4\1\5",
            "\1\1\10\uffff\1\2\1\3\1\4",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "587:1: rule__Step__Alternatives : ( ( ruleWhenStep ) | ( ruleThenStep ) | ( ruleGivenStep ) | ( ruleAndStep ) );";
        }
    }
    static final String dfa_13s = "\4\uffff";
    static final String dfa_14s = "\1\1\3\uffff";
    static final String dfa_15s = "\1\10\1\uffff\1\10\1\uffff";
    static final String dfa_16s = "\1\24\1\uffff\1\23\1\uffff";
    static final String dfa_17s = "\1\uffff\1\2\1\uffff\1\1";
    static final String dfa_18s = "\4\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\4\uffff\2\1\1\uffff\1\1\4\3",
            "",
            "\1\2\4\uffff\2\1\1\uffff\1\1\3\3",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()* loopback of 854:3: ( rule__Scenario__StepsAssignment_3 )*";
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()* loopback of 1220:2: ( rule__Background__StepsAssignment_2 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000017F10L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001C12L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016102L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001E1D10L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001E1D12L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000016100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080100L});

}