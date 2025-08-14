package eu.metatools.technocat.ide.contentassist.antlr.internal;

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
import eu.metatools.technocat.services.TechnoCatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTechnoCatParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'!'", "'&&'", "'||'", "'~'", "'&'", "'|'", "'^'", "'<<'", "'>>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'?'", "'model'", "'import'", "'type'", "'from'", "','", "'relation'", "'->'", "':'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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

    	public void setGrammarAccess(TechnoCatGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTechnologyCatalog"
    // InternalTechnoCat.g:53:1: entryRuleTechnologyCatalog : ruleTechnologyCatalog EOF ;
    public final void entryRuleTechnologyCatalog() throws RecognitionException {
        try {
            // InternalTechnoCat.g:54:1: ( ruleTechnologyCatalog EOF )
            // InternalTechnoCat.g:55:1: ruleTechnologyCatalog EOF
            {
             before(grammarAccess.getTechnologyCatalogRule()); 
            pushFollow(FOLLOW_1);
            ruleTechnologyCatalog();

            state._fsp--;

             after(grammarAccess.getTechnologyCatalogRule()); 
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
    // $ANTLR end "entryRuleTechnologyCatalog"


    // $ANTLR start "ruleTechnologyCatalog"
    // InternalTechnoCat.g:62:1: ruleTechnologyCatalog : ( ( rule__TechnologyCatalog__Group__0 ) ) ;
    public final void ruleTechnologyCatalog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:66:2: ( ( ( rule__TechnologyCatalog__Group__0 ) ) )
            // InternalTechnoCat.g:67:2: ( ( rule__TechnologyCatalog__Group__0 ) )
            {
            // InternalTechnoCat.g:67:2: ( ( rule__TechnologyCatalog__Group__0 ) )
            // InternalTechnoCat.g:68:3: ( rule__TechnologyCatalog__Group__0 )
            {
             before(grammarAccess.getTechnologyCatalogAccess().getGroup()); 
            // InternalTechnoCat.g:69:3: ( rule__TechnologyCatalog__Group__0 )
            // InternalTechnoCat.g:69:4: rule__TechnologyCatalog__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TechnologyCatalog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyCatalogAccess().getGroup()); 

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
    // $ANTLR end "ruleTechnologyCatalog"


    // $ANTLR start "entryRuleImport"
    // InternalTechnoCat.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalTechnoCat.g:79:1: ( ruleImport EOF )
            // InternalTechnoCat.g:80:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalTechnoCat.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalTechnoCat.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalTechnoCat.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalTechnoCat.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalTechnoCat.g:94:3: ( rule__Import__Group__0 )
            // InternalTechnoCat.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleModelElement"
    // InternalTechnoCat.g:103:1: entryRuleModelElement : ruleModelElement EOF ;
    public final void entryRuleModelElement() throws RecognitionException {
        try {
            // InternalTechnoCat.g:104:1: ( ruleModelElement EOF )
            // InternalTechnoCat.g:105:1: ruleModelElement EOF
            {
             before(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_1);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelElementRule()); 
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
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // InternalTechnoCat.g:112:1: ruleModelElement : ( ( rule__ModelElement__Alternatives ) ) ;
    public final void ruleModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:116:2: ( ( ( rule__ModelElement__Alternatives ) ) )
            // InternalTechnoCat.g:117:2: ( ( rule__ModelElement__Alternatives ) )
            {
            // InternalTechnoCat.g:117:2: ( ( rule__ModelElement__Alternatives ) )
            // InternalTechnoCat.g:118:3: ( rule__ModelElement__Alternatives )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives()); 
            // InternalTechnoCat.g:119:3: ( rule__ModelElement__Alternatives )
            // InternalTechnoCat.g:119:4: rule__ModelElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModelElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleDefinitionElement"
    // InternalTechnoCat.g:128:1: entryRuleDefinitionElement : ruleDefinitionElement EOF ;
    public final void entryRuleDefinitionElement() throws RecognitionException {
        try {
            // InternalTechnoCat.g:129:1: ( ruleDefinitionElement EOF )
            // InternalTechnoCat.g:130:1: ruleDefinitionElement EOF
            {
             before(grammarAccess.getDefinitionElementRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinitionElement();

            state._fsp--;

             after(grammarAccess.getDefinitionElementRule()); 
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
    // $ANTLR end "entryRuleDefinitionElement"


    // $ANTLR start "ruleDefinitionElement"
    // InternalTechnoCat.g:137:1: ruleDefinitionElement : ( ( rule__DefinitionElement__Alternatives ) ) ;
    public final void ruleDefinitionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:141:2: ( ( ( rule__DefinitionElement__Alternatives ) ) )
            // InternalTechnoCat.g:142:2: ( ( rule__DefinitionElement__Alternatives ) )
            {
            // InternalTechnoCat.g:142:2: ( ( rule__DefinitionElement__Alternatives ) )
            // InternalTechnoCat.g:143:3: ( rule__DefinitionElement__Alternatives )
            {
             before(grammarAccess.getDefinitionElementAccess().getAlternatives()); 
            // InternalTechnoCat.g:144:3: ( rule__DefinitionElement__Alternatives )
            // InternalTechnoCat.g:144:4: rule__DefinitionElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DefinitionElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDefinitionElement"


    // $ANTLR start "entryRuleInstanceElement"
    // InternalTechnoCat.g:153:1: entryRuleInstanceElement : ruleInstanceElement EOF ;
    public final void entryRuleInstanceElement() throws RecognitionException {
        try {
            // InternalTechnoCat.g:154:1: ( ruleInstanceElement EOF )
            // InternalTechnoCat.g:155:1: ruleInstanceElement EOF
            {
             before(grammarAccess.getInstanceElementRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanceElement();

            state._fsp--;

             after(grammarAccess.getInstanceElementRule()); 
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
    // $ANTLR end "entryRuleInstanceElement"


    // $ANTLR start "ruleInstanceElement"
    // InternalTechnoCat.g:162:1: ruleInstanceElement : ( ( rule__InstanceElement__Alternatives ) ) ;
    public final void ruleInstanceElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:166:2: ( ( ( rule__InstanceElement__Alternatives ) ) )
            // InternalTechnoCat.g:167:2: ( ( rule__InstanceElement__Alternatives ) )
            {
            // InternalTechnoCat.g:167:2: ( ( rule__InstanceElement__Alternatives ) )
            // InternalTechnoCat.g:168:3: ( rule__InstanceElement__Alternatives )
            {
             before(grammarAccess.getInstanceElementAccess().getAlternatives()); 
            // InternalTechnoCat.g:169:3: ( rule__InstanceElement__Alternatives )
            // InternalTechnoCat.g:169:4: rule__InstanceElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InstanceElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstanceElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInstanceElement"


    // $ANTLR start "entryRuleETD"
    // InternalTechnoCat.g:178:1: entryRuleETD : ruleETD EOF ;
    public final void entryRuleETD() throws RecognitionException {
        try {
            // InternalTechnoCat.g:179:1: ( ruleETD EOF )
            // InternalTechnoCat.g:180:1: ruleETD EOF
            {
             before(grammarAccess.getETDRule()); 
            pushFollow(FOLLOW_1);
            ruleETD();

            state._fsp--;

             after(grammarAccess.getETDRule()); 
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
    // $ANTLR end "entryRuleETD"


    // $ANTLR start "ruleETD"
    // InternalTechnoCat.g:187:1: ruleETD : ( ( rule__ETD__Group__0 ) ) ;
    public final void ruleETD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:191:2: ( ( ( rule__ETD__Group__0 ) ) )
            // InternalTechnoCat.g:192:2: ( ( rule__ETD__Group__0 ) )
            {
            // InternalTechnoCat.g:192:2: ( ( rule__ETD__Group__0 ) )
            // InternalTechnoCat.g:193:3: ( rule__ETD__Group__0 )
            {
             before(grammarAccess.getETDAccess().getGroup()); 
            // InternalTechnoCat.g:194:3: ( rule__ETD__Group__0 )
            // InternalTechnoCat.g:194:4: rule__ETD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ETD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getETDAccess().getGroup()); 

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
    // $ANTLR end "ruleETD"


    // $ANTLR start "entryRuleRTD"
    // InternalTechnoCat.g:203:1: entryRuleRTD : ruleRTD EOF ;
    public final void entryRuleRTD() throws RecognitionException {
        try {
            // InternalTechnoCat.g:204:1: ( ruleRTD EOF )
            // InternalTechnoCat.g:205:1: ruleRTD EOF
            {
             before(grammarAccess.getRTDRule()); 
            pushFollow(FOLLOW_1);
            ruleRTD();

            state._fsp--;

             after(grammarAccess.getRTDRule()); 
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
    // $ANTLR end "entryRuleRTD"


    // $ANTLR start "ruleRTD"
    // InternalTechnoCat.g:212:1: ruleRTD : ( ( rule__RTD__Group__0 ) ) ;
    public final void ruleRTD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:216:2: ( ( ( rule__RTD__Group__0 ) ) )
            // InternalTechnoCat.g:217:2: ( ( rule__RTD__Group__0 ) )
            {
            // InternalTechnoCat.g:217:2: ( ( rule__RTD__Group__0 ) )
            // InternalTechnoCat.g:218:3: ( rule__RTD__Group__0 )
            {
             before(grammarAccess.getRTDAccess().getGroup()); 
            // InternalTechnoCat.g:219:3: ( rule__RTD__Group__0 )
            // InternalTechnoCat.g:219:4: rule__RTD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RTD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getGroup()); 

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
    // $ANTLR end "ruleRTD"


    // $ANTLR start "entryRuleRTDItem"
    // InternalTechnoCat.g:228:1: entryRuleRTDItem : ruleRTDItem EOF ;
    public final void entryRuleRTDItem() throws RecognitionException {
        try {
            // InternalTechnoCat.g:229:1: ( ruleRTDItem EOF )
            // InternalTechnoCat.g:230:1: ruleRTDItem EOF
            {
             before(grammarAccess.getRTDItemRule()); 
            pushFollow(FOLLOW_1);
            ruleRTDItem();

            state._fsp--;

             after(grammarAccess.getRTDItemRule()); 
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
    // $ANTLR end "entryRuleRTDItem"


    // $ANTLR start "ruleRTDItem"
    // InternalTechnoCat.g:237:1: ruleRTDItem : ( ( rule__RTDItem__Group__0 ) ) ;
    public final void ruleRTDItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:241:2: ( ( ( rule__RTDItem__Group__0 ) ) )
            // InternalTechnoCat.g:242:2: ( ( rule__RTDItem__Group__0 ) )
            {
            // InternalTechnoCat.g:242:2: ( ( rule__RTDItem__Group__0 ) )
            // InternalTechnoCat.g:243:3: ( rule__RTDItem__Group__0 )
            {
             before(grammarAccess.getRTDItemAccess().getGroup()); 
            // InternalTechnoCat.g:244:3: ( rule__RTDItem__Group__0 )
            // InternalTechnoCat.g:244:4: rule__RTDItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RTDItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRTDItemAccess().getGroup()); 

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
    // $ANTLR end "ruleRTDItem"


    // $ANTLR start "entryRuleED"
    // InternalTechnoCat.g:253:1: entryRuleED : ruleED EOF ;
    public final void entryRuleED() throws RecognitionException {
        try {
            // InternalTechnoCat.g:254:1: ( ruleED EOF )
            // InternalTechnoCat.g:255:1: ruleED EOF
            {
             before(grammarAccess.getEDRule()); 
            pushFollow(FOLLOW_1);
            ruleED();

            state._fsp--;

             after(grammarAccess.getEDRule()); 
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
    // $ANTLR end "entryRuleED"


    // $ANTLR start "ruleED"
    // InternalTechnoCat.g:262:1: ruleED : ( ( rule__ED__Group__0 ) ) ;
    public final void ruleED() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:266:2: ( ( ( rule__ED__Group__0 ) ) )
            // InternalTechnoCat.g:267:2: ( ( rule__ED__Group__0 ) )
            {
            // InternalTechnoCat.g:267:2: ( ( rule__ED__Group__0 ) )
            // InternalTechnoCat.g:268:3: ( rule__ED__Group__0 )
            {
             before(grammarAccess.getEDAccess().getGroup()); 
            // InternalTechnoCat.g:269:3: ( rule__ED__Group__0 )
            // InternalTechnoCat.g:269:4: rule__ED__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ED__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDAccess().getGroup()); 

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
    // $ANTLR end "ruleED"


    // $ANTLR start "entryRuleEDItem"
    // InternalTechnoCat.g:278:1: entryRuleEDItem : ruleEDItem EOF ;
    public final void entryRuleEDItem() throws RecognitionException {
        try {
            // InternalTechnoCat.g:279:1: ( ruleEDItem EOF )
            // InternalTechnoCat.g:280:1: ruleEDItem EOF
            {
             before(grammarAccess.getEDItemRule()); 
            pushFollow(FOLLOW_1);
            ruleEDItem();

            state._fsp--;

             after(grammarAccess.getEDItemRule()); 
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
    // $ANTLR end "entryRuleEDItem"


    // $ANTLR start "ruleEDItem"
    // InternalTechnoCat.g:287:1: ruleEDItem : ( ( rule__EDItem__Group__0 ) ) ;
    public final void ruleEDItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:291:2: ( ( ( rule__EDItem__Group__0 ) ) )
            // InternalTechnoCat.g:292:2: ( ( rule__EDItem__Group__0 ) )
            {
            // InternalTechnoCat.g:292:2: ( ( rule__EDItem__Group__0 ) )
            // InternalTechnoCat.g:293:3: ( rule__EDItem__Group__0 )
            {
             before(grammarAccess.getEDItemAccess().getGroup()); 
            // InternalTechnoCat.g:294:3: ( rule__EDItem__Group__0 )
            // InternalTechnoCat.g:294:4: rule__EDItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDItemAccess().getGroup()); 

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
    // $ANTLR end "ruleEDItem"


    // $ANTLR start "entryRuleRD"
    // InternalTechnoCat.g:303:1: entryRuleRD : ruleRD EOF ;
    public final void entryRuleRD() throws RecognitionException {
        try {
            // InternalTechnoCat.g:304:1: ( ruleRD EOF )
            // InternalTechnoCat.g:305:1: ruleRD EOF
            {
             before(grammarAccess.getRDRule()); 
            pushFollow(FOLLOW_1);
            ruleRD();

            state._fsp--;

             after(grammarAccess.getRDRule()); 
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
    // $ANTLR end "entryRuleRD"


    // $ANTLR start "ruleRD"
    // InternalTechnoCat.g:312:1: ruleRD : ( ( rule__RD__Group__0 ) ) ;
    public final void ruleRD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:316:2: ( ( ( rule__RD__Group__0 ) ) )
            // InternalTechnoCat.g:317:2: ( ( rule__RD__Group__0 ) )
            {
            // InternalTechnoCat.g:317:2: ( ( rule__RD__Group__0 ) )
            // InternalTechnoCat.g:318:3: ( rule__RD__Group__0 )
            {
             before(grammarAccess.getRDAccess().getGroup()); 
            // InternalTechnoCat.g:319:3: ( rule__RD__Group__0 )
            // InternalTechnoCat.g:319:4: rule__RD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRDAccess().getGroup()); 

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
    // $ANTLR end "ruleRD"


    // $ANTLR start "entryRuleTCID"
    // InternalTechnoCat.g:328:1: entryRuleTCID : ruleTCID EOF ;
    public final void entryRuleTCID() throws RecognitionException {
        try {
            // InternalTechnoCat.g:329:1: ( ruleTCID EOF )
            // InternalTechnoCat.g:330:1: ruleTCID EOF
            {
             before(grammarAccess.getTCIDRule()); 
            pushFollow(FOLLOW_1);
            ruleTCID();

            state._fsp--;

             after(grammarAccess.getTCIDRule()); 
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
    // $ANTLR end "entryRuleTCID"


    // $ANTLR start "ruleTCID"
    // InternalTechnoCat.g:337:1: ruleTCID : ( RULE_ID ) ;
    public final void ruleTCID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:341:2: ( ( RULE_ID ) )
            // InternalTechnoCat.g:342:2: ( RULE_ID )
            {
            // InternalTechnoCat.g:342:2: ( RULE_ID )
            // InternalTechnoCat.g:343:3: RULE_ID
            {
             before(grammarAccess.getTCIDAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTCIDAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleTCID"


    // $ANTLR start "entryRuleRTID"
    // InternalTechnoCat.g:353:1: entryRuleRTID : ruleRTID EOF ;
    public final void entryRuleRTID() throws RecognitionException {
        try {
            // InternalTechnoCat.g:354:1: ( ruleRTID EOF )
            // InternalTechnoCat.g:355:1: ruleRTID EOF
            {
             before(grammarAccess.getRTIDRule()); 
            pushFollow(FOLLOW_1);
            ruleRTID();

            state._fsp--;

             after(grammarAccess.getRTIDRule()); 
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
    // $ANTLR end "entryRuleRTID"


    // $ANTLR start "ruleRTID"
    // InternalTechnoCat.g:362:1: ruleRTID : ( ( rule__RTID__Alternatives ) ) ;
    public final void ruleRTID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:366:2: ( ( ( rule__RTID__Alternatives ) ) )
            // InternalTechnoCat.g:367:2: ( ( rule__RTID__Alternatives ) )
            {
            // InternalTechnoCat.g:367:2: ( ( rule__RTID__Alternatives ) )
            // InternalTechnoCat.g:368:3: ( rule__RTID__Alternatives )
            {
             before(grammarAccess.getRTIDAccess().getAlternatives()); 
            // InternalTechnoCat.g:369:3: ( rule__RTID__Alternatives )
            // InternalTechnoCat.g:369:4: rule__RTID__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RTID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRTIDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRTID"


    // $ANTLR start "entryRuleETID"
    // InternalTechnoCat.g:378:1: entryRuleETID : ruleETID EOF ;
    public final void entryRuleETID() throws RecognitionException {
        try {
            // InternalTechnoCat.g:379:1: ( ruleETID EOF )
            // InternalTechnoCat.g:380:1: ruleETID EOF
            {
             before(grammarAccess.getETIDRule()); 
            pushFollow(FOLLOW_1);
            ruleETID();

            state._fsp--;

             after(grammarAccess.getETIDRule()); 
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
    // $ANTLR end "entryRuleETID"


    // $ANTLR start "ruleETID"
    // InternalTechnoCat.g:387:1: ruleETID : ( ( rule__ETID__Alternatives ) ) ;
    public final void ruleETID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:391:2: ( ( ( rule__ETID__Alternatives ) ) )
            // InternalTechnoCat.g:392:2: ( ( rule__ETID__Alternatives ) )
            {
            // InternalTechnoCat.g:392:2: ( ( rule__ETID__Alternatives ) )
            // InternalTechnoCat.g:393:3: ( rule__ETID__Alternatives )
            {
             before(grammarAccess.getETIDAccess().getAlternatives()); 
            // InternalTechnoCat.g:394:3: ( rule__ETID__Alternatives )
            // InternalTechnoCat.g:394:4: rule__ETID__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ETID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getETIDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleETID"


    // $ANTLR start "entryRuleEID"
    // InternalTechnoCat.g:403:1: entryRuleEID : ruleEID EOF ;
    public final void entryRuleEID() throws RecognitionException {
        try {
            // InternalTechnoCat.g:404:1: ( ruleEID EOF )
            // InternalTechnoCat.g:405:1: ruleEID EOF
            {
             before(grammarAccess.getEIDRule()); 
            pushFollow(FOLLOW_1);
            ruleEID();

            state._fsp--;

             after(grammarAccess.getEIDRule()); 
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
    // $ANTLR end "entryRuleEID"


    // $ANTLR start "ruleEID"
    // InternalTechnoCat.g:412:1: ruleEID : ( ( rule__EID__Alternatives ) ) ;
    public final void ruleEID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:416:2: ( ( ( rule__EID__Alternatives ) ) )
            // InternalTechnoCat.g:417:2: ( ( rule__EID__Alternatives ) )
            {
            // InternalTechnoCat.g:417:2: ( ( rule__EID__Alternatives ) )
            // InternalTechnoCat.g:418:3: ( rule__EID__Alternatives )
            {
             before(grammarAccess.getEIDAccess().getAlternatives()); 
            // InternalTechnoCat.g:419:3: ( rule__EID__Alternatives )
            // InternalTechnoCat.g:419:4: rule__EID__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEIDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEID"


    // $ANTLR start "entryRuleRSYM"
    // InternalTechnoCat.g:428:1: entryRuleRSYM : ruleRSYM EOF ;
    public final void entryRuleRSYM() throws RecognitionException {
        try {
            // InternalTechnoCat.g:429:1: ( ruleRSYM EOF )
            // InternalTechnoCat.g:430:1: ruleRSYM EOF
            {
             before(grammarAccess.getRSYMRule()); 
            pushFollow(FOLLOW_1);
            ruleRSYM();

            state._fsp--;

             after(grammarAccess.getRSYMRule()); 
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
    // $ANTLR end "entryRuleRSYM"


    // $ANTLR start "ruleRSYM"
    // InternalTechnoCat.g:437:1: ruleRSYM : ( ( rule__RSYM__Alternatives ) ) ;
    public final void ruleRSYM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:441:2: ( ( ( rule__RSYM__Alternatives ) ) )
            // InternalTechnoCat.g:442:2: ( ( rule__RSYM__Alternatives ) )
            {
            // InternalTechnoCat.g:442:2: ( ( rule__RSYM__Alternatives ) )
            // InternalTechnoCat.g:443:3: ( rule__RSYM__Alternatives )
            {
             before(grammarAccess.getRSYMAccess().getAlternatives()); 
            // InternalTechnoCat.g:444:3: ( rule__RSYM__Alternatives )
            // InternalTechnoCat.g:444:4: rule__RSYM__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RSYM__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRSYMAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRSYM"


    // $ANTLR start "rule__TechnologyCatalog__Alternatives_2"
    // InternalTechnoCat.g:452:1: rule__TechnologyCatalog__Alternatives_2 : ( ( ( rule__TechnologyCatalog__ImportsAssignment_2_0 ) ) | ( ( rule__TechnologyCatalog__EntityTypesAssignment_2_1 ) ) | ( ( rule__TechnologyCatalog__RelationTypesAssignment_2_2 ) ) | ( ( rule__TechnologyCatalog__EntitiesAssignment_2_3 ) ) | ( ( rule__TechnologyCatalog__RelationsAssignment_2_4 ) ) );
    public final void rule__TechnologyCatalog__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:456:1: ( ( ( rule__TechnologyCatalog__ImportsAssignment_2_0 ) ) | ( ( rule__TechnologyCatalog__EntityTypesAssignment_2_1 ) ) | ( ( rule__TechnologyCatalog__RelationTypesAssignment_2_2 ) ) | ( ( rule__TechnologyCatalog__EntitiesAssignment_2_3 ) ) | ( ( rule__TechnologyCatalog__RelationsAssignment_2_4 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt1=1;
                }
                break;
            case 44:
                {
                alt1=2;
                }
                break;
            case 47:
                {
                alt1=3;
                }
                break;
            case RULE_ID:
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4==49) ) {
                    alt1=4;
                }
                else if ( ((LA1_4>=RULE_ID && LA1_4<=RULE_STRING)||(LA1_4>=8 && LA1_4<=41)) ) {
                    alt1=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA1_5 = input.LA(2);

                if ( ((LA1_5>=RULE_ID && LA1_5<=RULE_STRING)||(LA1_5>=8 && LA1_5<=41)) ) {
                    alt1=5;
                }
                else if ( (LA1_5==49) ) {
                    alt1=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTechnoCat.g:457:2: ( ( rule__TechnologyCatalog__ImportsAssignment_2_0 ) )
                    {
                    // InternalTechnoCat.g:457:2: ( ( rule__TechnologyCatalog__ImportsAssignment_2_0 ) )
                    // InternalTechnoCat.g:458:3: ( rule__TechnologyCatalog__ImportsAssignment_2_0 )
                    {
                     before(grammarAccess.getTechnologyCatalogAccess().getImportsAssignment_2_0()); 
                    // InternalTechnoCat.g:459:3: ( rule__TechnologyCatalog__ImportsAssignment_2_0 )
                    // InternalTechnoCat.g:459:4: rule__TechnologyCatalog__ImportsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TechnologyCatalog__ImportsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTechnologyCatalogAccess().getImportsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTechnoCat.g:463:2: ( ( rule__TechnologyCatalog__EntityTypesAssignment_2_1 ) )
                    {
                    // InternalTechnoCat.g:463:2: ( ( rule__TechnologyCatalog__EntityTypesAssignment_2_1 ) )
                    // InternalTechnoCat.g:464:3: ( rule__TechnologyCatalog__EntityTypesAssignment_2_1 )
                    {
                     before(grammarAccess.getTechnologyCatalogAccess().getEntityTypesAssignment_2_1()); 
                    // InternalTechnoCat.g:465:3: ( rule__TechnologyCatalog__EntityTypesAssignment_2_1 )
                    // InternalTechnoCat.g:465:4: rule__TechnologyCatalog__EntityTypesAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TechnologyCatalog__EntityTypesAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTechnologyCatalogAccess().getEntityTypesAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTechnoCat.g:469:2: ( ( rule__TechnologyCatalog__RelationTypesAssignment_2_2 ) )
                    {
                    // InternalTechnoCat.g:469:2: ( ( rule__TechnologyCatalog__RelationTypesAssignment_2_2 ) )
                    // InternalTechnoCat.g:470:3: ( rule__TechnologyCatalog__RelationTypesAssignment_2_2 )
                    {
                     before(grammarAccess.getTechnologyCatalogAccess().getRelationTypesAssignment_2_2()); 
                    // InternalTechnoCat.g:471:3: ( rule__TechnologyCatalog__RelationTypesAssignment_2_2 )
                    // InternalTechnoCat.g:471:4: rule__TechnologyCatalog__RelationTypesAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TechnologyCatalog__RelationTypesAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTechnologyCatalogAccess().getRelationTypesAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTechnoCat.g:475:2: ( ( rule__TechnologyCatalog__EntitiesAssignment_2_3 ) )
                    {
                    // InternalTechnoCat.g:475:2: ( ( rule__TechnologyCatalog__EntitiesAssignment_2_3 ) )
                    // InternalTechnoCat.g:476:3: ( rule__TechnologyCatalog__EntitiesAssignment_2_3 )
                    {
                     before(grammarAccess.getTechnologyCatalogAccess().getEntitiesAssignment_2_3()); 
                    // InternalTechnoCat.g:477:3: ( rule__TechnologyCatalog__EntitiesAssignment_2_3 )
                    // InternalTechnoCat.g:477:4: rule__TechnologyCatalog__EntitiesAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__TechnologyCatalog__EntitiesAssignment_2_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTechnologyCatalogAccess().getEntitiesAssignment_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTechnoCat.g:481:2: ( ( rule__TechnologyCatalog__RelationsAssignment_2_4 ) )
                    {
                    // InternalTechnoCat.g:481:2: ( ( rule__TechnologyCatalog__RelationsAssignment_2_4 ) )
                    // InternalTechnoCat.g:482:3: ( rule__TechnologyCatalog__RelationsAssignment_2_4 )
                    {
                     before(grammarAccess.getTechnologyCatalogAccess().getRelationsAssignment_2_4()); 
                    // InternalTechnoCat.g:483:3: ( rule__TechnologyCatalog__RelationsAssignment_2_4 )
                    // InternalTechnoCat.g:483:4: rule__TechnologyCatalog__RelationsAssignment_2_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__TechnologyCatalog__RelationsAssignment_2_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTechnologyCatalogAccess().getRelationsAssignment_2_4()); 

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
    // $ANTLR end "rule__TechnologyCatalog__Alternatives_2"


    // $ANTLR start "rule__ModelElement__Alternatives"
    // InternalTechnoCat.g:491:1: rule__ModelElement__Alternatives : ( ( ruleDefinitionElement ) | ( ruleInstanceElement ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:495:1: ( ( ruleDefinitionElement ) | ( ruleInstanceElement ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==44||LA2_0==47) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTechnoCat.g:496:2: ( ruleDefinitionElement )
                    {
                    // InternalTechnoCat.g:496:2: ( ruleDefinitionElement )
                    // InternalTechnoCat.g:497:3: ruleDefinitionElement
                    {
                     before(grammarAccess.getModelElementAccess().getDefinitionElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefinitionElement();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getDefinitionElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTechnoCat.g:502:2: ( ruleInstanceElement )
                    {
                    // InternalTechnoCat.g:502:2: ( ruleInstanceElement )
                    // InternalTechnoCat.g:503:3: ruleInstanceElement
                    {
                     before(grammarAccess.getModelElementAccess().getInstanceElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInstanceElement();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getInstanceElementParserRuleCall_1()); 

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
    // $ANTLR end "rule__ModelElement__Alternatives"


    // $ANTLR start "rule__DefinitionElement__Alternatives"
    // InternalTechnoCat.g:512:1: rule__DefinitionElement__Alternatives : ( ( ruleETD ) | ( ruleRTD ) );
    public final void rule__DefinitionElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:516:1: ( ( ruleETD ) | ( ruleRTD ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==44) ) {
                alt3=1;
            }
            else if ( (LA3_0==47) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTechnoCat.g:517:2: ( ruleETD )
                    {
                    // InternalTechnoCat.g:517:2: ( ruleETD )
                    // InternalTechnoCat.g:518:3: ruleETD
                    {
                     before(grammarAccess.getDefinitionElementAccess().getETDParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleETD();

                    state._fsp--;

                     after(grammarAccess.getDefinitionElementAccess().getETDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTechnoCat.g:523:2: ( ruleRTD )
                    {
                    // InternalTechnoCat.g:523:2: ( ruleRTD )
                    // InternalTechnoCat.g:524:3: ruleRTD
                    {
                     before(grammarAccess.getDefinitionElementAccess().getRTDParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRTD();

                    state._fsp--;

                     after(grammarAccess.getDefinitionElementAccess().getRTDParserRuleCall_1()); 

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
    // $ANTLR end "rule__DefinitionElement__Alternatives"


    // $ANTLR start "rule__InstanceElement__Alternatives"
    // InternalTechnoCat.g:533:1: rule__InstanceElement__Alternatives : ( ( ruleED ) | ( ruleRD ) );
    public final void rule__InstanceElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:537:1: ( ( ruleED ) | ( ruleRD ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=RULE_ID && LA4_1<=RULE_STRING)||(LA4_1>=8 && LA4_1<=41)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==49) ) {
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

                if ( ((LA4_2>=RULE_ID && LA4_2<=RULE_STRING)||(LA4_2>=8 && LA4_2<=41)) ) {
                    alt4=2;
                }
                else if ( (LA4_2==49) ) {
                    alt4=1;
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
                    // InternalTechnoCat.g:538:2: ( ruleED )
                    {
                    // InternalTechnoCat.g:538:2: ( ruleED )
                    // InternalTechnoCat.g:539:3: ruleED
                    {
                     before(grammarAccess.getInstanceElementAccess().getEDParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleED();

                    state._fsp--;

                     after(grammarAccess.getInstanceElementAccess().getEDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTechnoCat.g:544:2: ( ruleRD )
                    {
                    // InternalTechnoCat.g:544:2: ( ruleRD )
                    // InternalTechnoCat.g:545:3: ruleRD
                    {
                     before(grammarAccess.getInstanceElementAccess().getRDParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRD();

                    state._fsp--;

                     after(grammarAccess.getInstanceElementAccess().getRDParserRuleCall_1()); 

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
    // $ANTLR end "rule__InstanceElement__Alternatives"


    // $ANTLR start "rule__RTID__Alternatives"
    // InternalTechnoCat.g:554:1: rule__RTID__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleRSYM ) );
    public final void rule__RTID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:558:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleRSYM ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
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
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTechnoCat.g:559:2: ( RULE_ID )
                    {
                    // InternalTechnoCat.g:559:2: ( RULE_ID )
                    // InternalTechnoCat.g:560:3: RULE_ID
                    {
                     before(grammarAccess.getRTIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getRTIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTechnoCat.g:565:2: ( RULE_STRING )
                    {
                    // InternalTechnoCat.g:565:2: ( RULE_STRING )
                    // InternalTechnoCat.g:566:3: RULE_STRING
                    {
                     before(grammarAccess.getRTIDAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getRTIDAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTechnoCat.g:571:2: ( ruleRSYM )
                    {
                    // InternalTechnoCat.g:571:2: ( ruleRSYM )
                    // InternalTechnoCat.g:572:3: ruleRSYM
                    {
                     before(grammarAccess.getRTIDAccess().getRSYMParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRSYM();

                    state._fsp--;

                     after(grammarAccess.getRTIDAccess().getRSYMParserRuleCall_2()); 

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
    // $ANTLR end "rule__RTID__Alternatives"


    // $ANTLR start "rule__ETID__Alternatives"
    // InternalTechnoCat.g:581:1: rule__ETID__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__ETID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:585:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTechnoCat.g:586:2: ( RULE_ID )
                    {
                    // InternalTechnoCat.g:586:2: ( RULE_ID )
                    // InternalTechnoCat.g:587:3: RULE_ID
                    {
                     before(grammarAccess.getETIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getETIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTechnoCat.g:592:2: ( RULE_STRING )
                    {
                    // InternalTechnoCat.g:592:2: ( RULE_STRING )
                    // InternalTechnoCat.g:593:3: RULE_STRING
                    {
                     before(grammarAccess.getETIDAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getETIDAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ETID__Alternatives"


    // $ANTLR start "rule__EID__Alternatives"
    // InternalTechnoCat.g:602:1: rule__EID__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__EID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:606:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTechnoCat.g:607:2: ( RULE_ID )
                    {
                    // InternalTechnoCat.g:607:2: ( RULE_ID )
                    // InternalTechnoCat.g:608:3: RULE_ID
                    {
                     before(grammarAccess.getEIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTechnoCat.g:613:2: ( RULE_STRING )
                    {
                    // InternalTechnoCat.g:613:2: ( RULE_STRING )
                    // InternalTechnoCat.g:614:3: RULE_STRING
                    {
                     before(grammarAccess.getEIDAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEIDAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EID__Alternatives"


    // $ANTLR start "rule__RSYM__Alternatives"
    // InternalTechnoCat.g:623:1: rule__RSYM__Alternatives : ( ( '=' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '++' ) | ( '--' ) | ( '==' ) | ( '!=' ) | ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '!' ) | ( '&&' ) | ( '||' ) | ( '~' ) | ( '&' ) | ( '|' ) | ( '^' ) | ( '<<' ) | ( '>>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '&=' ) | ( '|=' ) | ( '^=' ) | ( '<<=' ) | ( '>>=' ) | ( '?' ) );
    public final void rule__RSYM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:627:1: ( ( '=' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '++' ) | ( '--' ) | ( '==' ) | ( '!=' ) | ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '!' ) | ( '&&' ) | ( '||' ) | ( '~' ) | ( '&' ) | ( '|' ) | ( '^' ) | ( '<<' ) | ( '>>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '&=' ) | ( '|=' ) | ( '^=' ) | ( '<<=' ) | ( '>>=' ) | ( '?' ) )
            int alt8=34;
            switch ( input.LA(1) ) {
            case 8:
                {
                alt8=1;
                }
                break;
            case 9:
                {
                alt8=2;
                }
                break;
            case 10:
                {
                alt8=3;
                }
                break;
            case 11:
                {
                alt8=4;
                }
                break;
            case 12:
                {
                alt8=5;
                }
                break;
            case 13:
                {
                alt8=6;
                }
                break;
            case 14:
                {
                alt8=7;
                }
                break;
            case 15:
                {
                alt8=8;
                }
                break;
            case 16:
                {
                alt8=9;
                }
                break;
            case 17:
                {
                alt8=10;
                }
                break;
            case 18:
                {
                alt8=11;
                }
                break;
            case 19:
                {
                alt8=12;
                }
                break;
            case 20:
                {
                alt8=13;
                }
                break;
            case 21:
                {
                alt8=14;
                }
                break;
            case 22:
                {
                alt8=15;
                }
                break;
            case 23:
                {
                alt8=16;
                }
                break;
            case 24:
                {
                alt8=17;
                }
                break;
            case 25:
                {
                alt8=18;
                }
                break;
            case 26:
                {
                alt8=19;
                }
                break;
            case 27:
                {
                alt8=20;
                }
                break;
            case 28:
                {
                alt8=21;
                }
                break;
            case 29:
                {
                alt8=22;
                }
                break;
            case 30:
                {
                alt8=23;
                }
                break;
            case 31:
                {
                alt8=24;
                }
                break;
            case 32:
                {
                alt8=25;
                }
                break;
            case 33:
                {
                alt8=26;
                }
                break;
            case 34:
                {
                alt8=27;
                }
                break;
            case 35:
                {
                alt8=28;
                }
                break;
            case 36:
                {
                alt8=29;
                }
                break;
            case 37:
                {
                alt8=30;
                }
                break;
            case 38:
                {
                alt8=31;
                }
                break;
            case 39:
                {
                alt8=32;
                }
                break;
            case 40:
                {
                alt8=33;
                }
                break;
            case 41:
                {
                alt8=34;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalTechnoCat.g:628:2: ( '=' )
                    {
                    // InternalTechnoCat.g:628:2: ( '=' )
                    // InternalTechnoCat.g:629:3: '='
                    {
                     before(grammarAccess.getRSYMAccess().getEqualsSignKeyword_0()); 
                    match(input,8,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTechnoCat.g:634:2: ( '+' )
                    {
                    // InternalTechnoCat.g:634:2: ( '+' )
                    // InternalTechnoCat.g:635:3: '+'
                    {
                     before(grammarAccess.getRSYMAccess().getPlusSignKeyword_1()); 
                    match(input,9,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getPlusSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTechnoCat.g:640:2: ( '-' )
                    {
                    // InternalTechnoCat.g:640:2: ( '-' )
                    // InternalTechnoCat.g:641:3: '-'
                    {
                     before(grammarAccess.getRSYMAccess().getHyphenMinusKeyword_2()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getHyphenMinusKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTechnoCat.g:646:2: ( '*' )
                    {
                    // InternalTechnoCat.g:646:2: ( '*' )
                    // InternalTechnoCat.g:647:3: '*'
                    {
                     before(grammarAccess.getRSYMAccess().getAsteriskKeyword_3()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTechnoCat.g:652:2: ( '/' )
                    {
                    // InternalTechnoCat.g:652:2: ( '/' )
                    // InternalTechnoCat.g:653:3: '/'
                    {
                     before(grammarAccess.getRSYMAccess().getSolidusKeyword_4()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getSolidusKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTechnoCat.g:658:2: ( '%' )
                    {
                    // InternalTechnoCat.g:658:2: ( '%' )
                    // InternalTechnoCat.g:659:3: '%'
                    {
                     before(grammarAccess.getRSYMAccess().getPercentSignKeyword_5()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getPercentSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTechnoCat.g:664:2: ( '++' )
                    {
                    // InternalTechnoCat.g:664:2: ( '++' )
                    // InternalTechnoCat.g:665:3: '++'
                    {
                     before(grammarAccess.getRSYMAccess().getPlusSignPlusSignKeyword_6()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getPlusSignPlusSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalTechnoCat.g:670:2: ( '--' )
                    {
                    // InternalTechnoCat.g:670:2: ( '--' )
                    // InternalTechnoCat.g:671:3: '--'
                    {
                     before(grammarAccess.getRSYMAccess().getHyphenMinusHyphenMinusKeyword_7()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getHyphenMinusHyphenMinusKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalTechnoCat.g:676:2: ( '==' )
                    {
                    // InternalTechnoCat.g:676:2: ( '==' )
                    // InternalTechnoCat.g:677:3: '=='
                    {
                     before(grammarAccess.getRSYMAccess().getEqualsSignEqualsSignKeyword_8()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getEqualsSignEqualsSignKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalTechnoCat.g:682:2: ( '!=' )
                    {
                    // InternalTechnoCat.g:682:2: ( '!=' )
                    // InternalTechnoCat.g:683:3: '!='
                    {
                     before(grammarAccess.getRSYMAccess().getExclamationMarkEqualsSignKeyword_9()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getExclamationMarkEqualsSignKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalTechnoCat.g:688:2: ( '>' )
                    {
                    // InternalTechnoCat.g:688:2: ( '>' )
                    // InternalTechnoCat.g:689:3: '>'
                    {
                     before(grammarAccess.getRSYMAccess().getGreaterThanSignKeyword_10()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getGreaterThanSignKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalTechnoCat.g:694:2: ( '<' )
                    {
                    // InternalTechnoCat.g:694:2: ( '<' )
                    // InternalTechnoCat.g:695:3: '<'
                    {
                     before(grammarAccess.getRSYMAccess().getLessThanSignKeyword_11()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getLessThanSignKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalTechnoCat.g:700:2: ( '>=' )
                    {
                    // InternalTechnoCat.g:700:2: ( '>=' )
                    // InternalTechnoCat.g:701:3: '>='
                    {
                     before(grammarAccess.getRSYMAccess().getGreaterThanSignEqualsSignKeyword_12()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getGreaterThanSignEqualsSignKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalTechnoCat.g:706:2: ( '<=' )
                    {
                    // InternalTechnoCat.g:706:2: ( '<=' )
                    // InternalTechnoCat.g:707:3: '<='
                    {
                     before(grammarAccess.getRSYMAccess().getLessThanSignEqualsSignKeyword_13()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getLessThanSignEqualsSignKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalTechnoCat.g:712:2: ( '!' )
                    {
                    // InternalTechnoCat.g:712:2: ( '!' )
                    // InternalTechnoCat.g:713:3: '!'
                    {
                     before(grammarAccess.getRSYMAccess().getExclamationMarkKeyword_14()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getExclamationMarkKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalTechnoCat.g:718:2: ( '&&' )
                    {
                    // InternalTechnoCat.g:718:2: ( '&&' )
                    // InternalTechnoCat.g:719:3: '&&'
                    {
                     before(grammarAccess.getRSYMAccess().getAmpersandAmpersandKeyword_15()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getAmpersandAmpersandKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalTechnoCat.g:724:2: ( '||' )
                    {
                    // InternalTechnoCat.g:724:2: ( '||' )
                    // InternalTechnoCat.g:725:3: '||'
                    {
                     before(grammarAccess.getRSYMAccess().getVerticalLineVerticalLineKeyword_16()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getVerticalLineVerticalLineKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalTechnoCat.g:730:2: ( '~' )
                    {
                    // InternalTechnoCat.g:730:2: ( '~' )
                    // InternalTechnoCat.g:731:3: '~'
                    {
                     before(grammarAccess.getRSYMAccess().getTildeKeyword_17()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getTildeKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalTechnoCat.g:736:2: ( '&' )
                    {
                    // InternalTechnoCat.g:736:2: ( '&' )
                    // InternalTechnoCat.g:737:3: '&'
                    {
                     before(grammarAccess.getRSYMAccess().getAmpersandKeyword_18()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getAmpersandKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalTechnoCat.g:742:2: ( '|' )
                    {
                    // InternalTechnoCat.g:742:2: ( '|' )
                    // InternalTechnoCat.g:743:3: '|'
                    {
                     before(grammarAccess.getRSYMAccess().getVerticalLineKeyword_19()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getVerticalLineKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalTechnoCat.g:748:2: ( '^' )
                    {
                    // InternalTechnoCat.g:748:2: ( '^' )
                    // InternalTechnoCat.g:749:3: '^'
                    {
                     before(grammarAccess.getRSYMAccess().getCircumflexAccentKeyword_20()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getCircumflexAccentKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalTechnoCat.g:754:2: ( '<<' )
                    {
                    // InternalTechnoCat.g:754:2: ( '<<' )
                    // InternalTechnoCat.g:755:3: '<<'
                    {
                     before(grammarAccess.getRSYMAccess().getLessThanSignLessThanSignKeyword_21()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getLessThanSignLessThanSignKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalTechnoCat.g:760:2: ( '>>' )
                    {
                    // InternalTechnoCat.g:760:2: ( '>>' )
                    // InternalTechnoCat.g:761:3: '>>'
                    {
                     before(grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignKeyword_22()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalTechnoCat.g:766:2: ( '+=' )
                    {
                    // InternalTechnoCat.g:766:2: ( '+=' )
                    // InternalTechnoCat.g:767:3: '+='
                    {
                     before(grammarAccess.getRSYMAccess().getPlusSignEqualsSignKeyword_23()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getPlusSignEqualsSignKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalTechnoCat.g:772:2: ( '-=' )
                    {
                    // InternalTechnoCat.g:772:2: ( '-=' )
                    // InternalTechnoCat.g:773:3: '-='
                    {
                     before(grammarAccess.getRSYMAccess().getHyphenMinusEqualsSignKeyword_24()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getHyphenMinusEqualsSignKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalTechnoCat.g:778:2: ( '*=' )
                    {
                    // InternalTechnoCat.g:778:2: ( '*=' )
                    // InternalTechnoCat.g:779:3: '*='
                    {
                     before(grammarAccess.getRSYMAccess().getAsteriskEqualsSignKeyword_25()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getAsteriskEqualsSignKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalTechnoCat.g:784:2: ( '/=' )
                    {
                    // InternalTechnoCat.g:784:2: ( '/=' )
                    // InternalTechnoCat.g:785:3: '/='
                    {
                     before(grammarAccess.getRSYMAccess().getSolidusEqualsSignKeyword_26()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getSolidusEqualsSignKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalTechnoCat.g:790:2: ( '%=' )
                    {
                    // InternalTechnoCat.g:790:2: ( '%=' )
                    // InternalTechnoCat.g:791:3: '%='
                    {
                     before(grammarAccess.getRSYMAccess().getPercentSignEqualsSignKeyword_27()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getPercentSignEqualsSignKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalTechnoCat.g:796:2: ( '&=' )
                    {
                    // InternalTechnoCat.g:796:2: ( '&=' )
                    // InternalTechnoCat.g:797:3: '&='
                    {
                     before(grammarAccess.getRSYMAccess().getAmpersandEqualsSignKeyword_28()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getAmpersandEqualsSignKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalTechnoCat.g:802:2: ( '|=' )
                    {
                    // InternalTechnoCat.g:802:2: ( '|=' )
                    // InternalTechnoCat.g:803:3: '|='
                    {
                     before(grammarAccess.getRSYMAccess().getVerticalLineEqualsSignKeyword_29()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getVerticalLineEqualsSignKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalTechnoCat.g:808:2: ( '^=' )
                    {
                    // InternalTechnoCat.g:808:2: ( '^=' )
                    // InternalTechnoCat.g:809:3: '^='
                    {
                     before(grammarAccess.getRSYMAccess().getCircumflexAccentEqualsSignKeyword_30()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getCircumflexAccentEqualsSignKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalTechnoCat.g:814:2: ( '<<=' )
                    {
                    // InternalTechnoCat.g:814:2: ( '<<=' )
                    // InternalTechnoCat.g:815:3: '<<='
                    {
                     before(grammarAccess.getRSYMAccess().getLessThanSignLessThanSignEqualsSignKeyword_31()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getLessThanSignLessThanSignEqualsSignKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalTechnoCat.g:820:2: ( '>>=' )
                    {
                    // InternalTechnoCat.g:820:2: ( '>>=' )
                    // InternalTechnoCat.g:821:3: '>>='
                    {
                     before(grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_32()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // InternalTechnoCat.g:826:2: ( '?' )
                    {
                    // InternalTechnoCat.g:826:2: ( '?' )
                    // InternalTechnoCat.g:827:3: '?'
                    {
                     before(grammarAccess.getRSYMAccess().getQuestionMarkKeyword_33()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getRSYMAccess().getQuestionMarkKeyword_33()); 

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
    // $ANTLR end "rule__RSYM__Alternatives"


    // $ANTLR start "rule__TechnologyCatalog__Group__0"
    // InternalTechnoCat.g:836:1: rule__TechnologyCatalog__Group__0 : rule__TechnologyCatalog__Group__0__Impl rule__TechnologyCatalog__Group__1 ;
    public final void rule__TechnologyCatalog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:840:1: ( rule__TechnologyCatalog__Group__0__Impl rule__TechnologyCatalog__Group__1 )
            // InternalTechnoCat.g:841:2: rule__TechnologyCatalog__Group__0__Impl rule__TechnologyCatalog__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TechnologyCatalog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnologyCatalog__Group__1();

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
    // $ANTLR end "rule__TechnologyCatalog__Group__0"


    // $ANTLR start "rule__TechnologyCatalog__Group__0__Impl"
    // InternalTechnoCat.g:848:1: rule__TechnologyCatalog__Group__0__Impl : ( 'model' ) ;
    public final void rule__TechnologyCatalog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:852:1: ( ( 'model' ) )
            // InternalTechnoCat.g:853:1: ( 'model' )
            {
            // InternalTechnoCat.g:853:1: ( 'model' )
            // InternalTechnoCat.g:854:2: 'model'
            {
             before(grammarAccess.getTechnologyCatalogAccess().getModelKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTechnologyCatalogAccess().getModelKeyword_0()); 

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
    // $ANTLR end "rule__TechnologyCatalog__Group__0__Impl"


    // $ANTLR start "rule__TechnologyCatalog__Group__1"
    // InternalTechnoCat.g:863:1: rule__TechnologyCatalog__Group__1 : rule__TechnologyCatalog__Group__1__Impl rule__TechnologyCatalog__Group__2 ;
    public final void rule__TechnologyCatalog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:867:1: ( rule__TechnologyCatalog__Group__1__Impl rule__TechnologyCatalog__Group__2 )
            // InternalTechnoCat.g:868:2: rule__TechnologyCatalog__Group__1__Impl rule__TechnologyCatalog__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TechnologyCatalog__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TechnologyCatalog__Group__2();

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
    // $ANTLR end "rule__TechnologyCatalog__Group__1"


    // $ANTLR start "rule__TechnologyCatalog__Group__1__Impl"
    // InternalTechnoCat.g:875:1: rule__TechnologyCatalog__Group__1__Impl : ( ( rule__TechnologyCatalog__NameAssignment_1 ) ) ;
    public final void rule__TechnologyCatalog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:879:1: ( ( ( rule__TechnologyCatalog__NameAssignment_1 ) ) )
            // InternalTechnoCat.g:880:1: ( ( rule__TechnologyCatalog__NameAssignment_1 ) )
            {
            // InternalTechnoCat.g:880:1: ( ( rule__TechnologyCatalog__NameAssignment_1 ) )
            // InternalTechnoCat.g:881:2: ( rule__TechnologyCatalog__NameAssignment_1 )
            {
             before(grammarAccess.getTechnologyCatalogAccess().getNameAssignment_1()); 
            // InternalTechnoCat.g:882:2: ( rule__TechnologyCatalog__NameAssignment_1 )
            // InternalTechnoCat.g:882:3: rule__TechnologyCatalog__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TechnologyCatalog__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyCatalogAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TechnologyCatalog__Group__1__Impl"


    // $ANTLR start "rule__TechnologyCatalog__Group__2"
    // InternalTechnoCat.g:890:1: rule__TechnologyCatalog__Group__2 : rule__TechnologyCatalog__Group__2__Impl ;
    public final void rule__TechnologyCatalog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:894:1: ( rule__TechnologyCatalog__Group__2__Impl )
            // InternalTechnoCat.g:895:2: rule__TechnologyCatalog__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TechnologyCatalog__Group__2__Impl();

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
    // $ANTLR end "rule__TechnologyCatalog__Group__2"


    // $ANTLR start "rule__TechnologyCatalog__Group__2__Impl"
    // InternalTechnoCat.g:901:1: rule__TechnologyCatalog__Group__2__Impl : ( ( rule__TechnologyCatalog__Alternatives_2 )* ) ;
    public final void rule__TechnologyCatalog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:905:1: ( ( ( rule__TechnologyCatalog__Alternatives_2 )* ) )
            // InternalTechnoCat.g:906:1: ( ( rule__TechnologyCatalog__Alternatives_2 )* )
            {
            // InternalTechnoCat.g:906:1: ( ( rule__TechnologyCatalog__Alternatives_2 )* )
            // InternalTechnoCat.g:907:2: ( rule__TechnologyCatalog__Alternatives_2 )*
            {
             before(grammarAccess.getTechnologyCatalogAccess().getAlternatives_2()); 
            // InternalTechnoCat.g:908:2: ( rule__TechnologyCatalog__Alternatives_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||(LA9_0>=43 && LA9_0<=44)||LA9_0==47) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTechnoCat.g:908:3: rule__TechnologyCatalog__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__TechnologyCatalog__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTechnologyCatalogAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__TechnologyCatalog__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalTechnoCat.g:917:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:921:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalTechnoCat.g:922:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalTechnoCat.g:929:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:933:1: ( ( 'import' ) )
            // InternalTechnoCat.g:934:1: ( 'import' )
            {
            // InternalTechnoCat.g:934:1: ( 'import' )
            // InternalTechnoCat.g:935:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalTechnoCat.g:944:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:948:1: ( rule__Import__Group__1__Impl )
            // InternalTechnoCat.g:949:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalTechnoCat.g:955:1: rule__Import__Group__1__Impl : ( ( rule__Import__RefAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:959:1: ( ( ( rule__Import__RefAssignment_1 ) ) )
            // InternalTechnoCat.g:960:1: ( ( rule__Import__RefAssignment_1 ) )
            {
            // InternalTechnoCat.g:960:1: ( ( rule__Import__RefAssignment_1 ) )
            // InternalTechnoCat.g:961:2: ( rule__Import__RefAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getRefAssignment_1()); 
            // InternalTechnoCat.g:962:2: ( rule__Import__RefAssignment_1 )
            // InternalTechnoCat.g:962:3: rule__Import__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__ETD__Group__0"
    // InternalTechnoCat.g:971:1: rule__ETD__Group__0 : rule__ETD__Group__0__Impl rule__ETD__Group__1 ;
    public final void rule__ETD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:975:1: ( rule__ETD__Group__0__Impl rule__ETD__Group__1 )
            // InternalTechnoCat.g:976:2: rule__ETD__Group__0__Impl rule__ETD__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ETD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ETD__Group__1();

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
    // $ANTLR end "rule__ETD__Group__0"


    // $ANTLR start "rule__ETD__Group__0__Impl"
    // InternalTechnoCat.g:983:1: rule__ETD__Group__0__Impl : ( 'type' ) ;
    public final void rule__ETD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:987:1: ( ( 'type' ) )
            // InternalTechnoCat.g:988:1: ( 'type' )
            {
            // InternalTechnoCat.g:988:1: ( 'type' )
            // InternalTechnoCat.g:989:2: 'type'
            {
             before(grammarAccess.getETDAccess().getTypeKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getETDAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__ETD__Group__0__Impl"


    // $ANTLR start "rule__ETD__Group__1"
    // InternalTechnoCat.g:998:1: rule__ETD__Group__1 : rule__ETD__Group__1__Impl rule__ETD__Group__2 ;
    public final void rule__ETD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1002:1: ( rule__ETD__Group__1__Impl rule__ETD__Group__2 )
            // InternalTechnoCat.g:1003:2: rule__ETD__Group__1__Impl rule__ETD__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ETD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ETD__Group__2();

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
    // $ANTLR end "rule__ETD__Group__1"


    // $ANTLR start "rule__ETD__Group__1__Impl"
    // InternalTechnoCat.g:1010:1: rule__ETD__Group__1__Impl : ( ( rule__ETD__NameAssignment_1 ) ) ;
    public final void rule__ETD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1014:1: ( ( ( rule__ETD__NameAssignment_1 ) ) )
            // InternalTechnoCat.g:1015:1: ( ( rule__ETD__NameAssignment_1 ) )
            {
            // InternalTechnoCat.g:1015:1: ( ( rule__ETD__NameAssignment_1 ) )
            // InternalTechnoCat.g:1016:2: ( rule__ETD__NameAssignment_1 )
            {
             before(grammarAccess.getETDAccess().getNameAssignment_1()); 
            // InternalTechnoCat.g:1017:2: ( rule__ETD__NameAssignment_1 )
            // InternalTechnoCat.g:1017:3: rule__ETD__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ETD__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getETDAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ETD__Group__1__Impl"


    // $ANTLR start "rule__ETD__Group__2"
    // InternalTechnoCat.g:1025:1: rule__ETD__Group__2 : rule__ETD__Group__2__Impl rule__ETD__Group__3 ;
    public final void rule__ETD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1029:1: ( rule__ETD__Group__2__Impl rule__ETD__Group__3 )
            // InternalTechnoCat.g:1030:2: rule__ETD__Group__2__Impl rule__ETD__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ETD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ETD__Group__3();

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
    // $ANTLR end "rule__ETD__Group__2"


    // $ANTLR start "rule__ETD__Group__2__Impl"
    // InternalTechnoCat.g:1037:1: rule__ETD__Group__2__Impl : ( ( rule__ETD__Group_2__0 )? ) ;
    public final void rule__ETD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1041:1: ( ( ( rule__ETD__Group_2__0 )? ) )
            // InternalTechnoCat.g:1042:1: ( ( rule__ETD__Group_2__0 )? )
            {
            // InternalTechnoCat.g:1042:1: ( ( rule__ETD__Group_2__0 )? )
            // InternalTechnoCat.g:1043:2: ( rule__ETD__Group_2__0 )?
            {
             before(grammarAccess.getETDAccess().getGroup_2()); 
            // InternalTechnoCat.g:1044:2: ( rule__ETD__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==45) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTechnoCat.g:1044:3: rule__ETD__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ETD__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getETDAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ETD__Group__2__Impl"


    // $ANTLR start "rule__ETD__Group__3"
    // InternalTechnoCat.g:1052:1: rule__ETD__Group__3 : rule__ETD__Group__3__Impl ;
    public final void rule__ETD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1056:1: ( rule__ETD__Group__3__Impl )
            // InternalTechnoCat.g:1057:2: rule__ETD__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ETD__Group__3__Impl();

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
    // $ANTLR end "rule__ETD__Group__3"


    // $ANTLR start "rule__ETD__Group__3__Impl"
    // InternalTechnoCat.g:1063:1: rule__ETD__Group__3__Impl : ( ( rule__ETD__Group_3__0 )? ) ;
    public final void rule__ETD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1067:1: ( ( ( rule__ETD__Group_3__0 )? ) )
            // InternalTechnoCat.g:1068:1: ( ( rule__ETD__Group_3__0 )? )
            {
            // InternalTechnoCat.g:1068:1: ( ( rule__ETD__Group_3__0 )? )
            // InternalTechnoCat.g:1069:2: ( rule__ETD__Group_3__0 )?
            {
             before(grammarAccess.getETDAccess().getGroup_3()); 
            // InternalTechnoCat.g:1070:2: ( rule__ETD__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==8) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTechnoCat.g:1070:3: rule__ETD__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ETD__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getETDAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ETD__Group__3__Impl"


    // $ANTLR start "rule__ETD__Group_2__0"
    // InternalTechnoCat.g:1079:1: rule__ETD__Group_2__0 : rule__ETD__Group_2__0__Impl rule__ETD__Group_2__1 ;
    public final void rule__ETD__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1083:1: ( rule__ETD__Group_2__0__Impl rule__ETD__Group_2__1 )
            // InternalTechnoCat.g:1084:2: rule__ETD__Group_2__0__Impl rule__ETD__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ETD__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ETD__Group_2__1();

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
    // $ANTLR end "rule__ETD__Group_2__0"


    // $ANTLR start "rule__ETD__Group_2__0__Impl"
    // InternalTechnoCat.g:1091:1: rule__ETD__Group_2__0__Impl : ( 'from' ) ;
    public final void rule__ETD__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1095:1: ( ( 'from' ) )
            // InternalTechnoCat.g:1096:1: ( 'from' )
            {
            // InternalTechnoCat.g:1096:1: ( 'from' )
            // InternalTechnoCat.g:1097:2: 'from'
            {
             before(grammarAccess.getETDAccess().getFromKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getETDAccess().getFromKeyword_2_0()); 

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
    // $ANTLR end "rule__ETD__Group_2__0__Impl"


    // $ANTLR start "rule__ETD__Group_2__1"
    // InternalTechnoCat.g:1106:1: rule__ETD__Group_2__1 : rule__ETD__Group_2__1__Impl rule__ETD__Group_2__2 ;
    public final void rule__ETD__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1110:1: ( rule__ETD__Group_2__1__Impl rule__ETD__Group_2__2 )
            // InternalTechnoCat.g:1111:2: rule__ETD__Group_2__1__Impl rule__ETD__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__ETD__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ETD__Group_2__2();

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
    // $ANTLR end "rule__ETD__Group_2__1"


    // $ANTLR start "rule__ETD__Group_2__1__Impl"
    // InternalTechnoCat.g:1118:1: rule__ETD__Group_2__1__Impl : ( ( rule__ETD__BasesAssignment_2_1 ) ) ;
    public final void rule__ETD__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1122:1: ( ( ( rule__ETD__BasesAssignment_2_1 ) ) )
            // InternalTechnoCat.g:1123:1: ( ( rule__ETD__BasesAssignment_2_1 ) )
            {
            // InternalTechnoCat.g:1123:1: ( ( rule__ETD__BasesAssignment_2_1 ) )
            // InternalTechnoCat.g:1124:2: ( rule__ETD__BasesAssignment_2_1 )
            {
             before(grammarAccess.getETDAccess().getBasesAssignment_2_1()); 
            // InternalTechnoCat.g:1125:2: ( rule__ETD__BasesAssignment_2_1 )
            // InternalTechnoCat.g:1125:3: rule__ETD__BasesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ETD__BasesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getETDAccess().getBasesAssignment_2_1()); 

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
    // $ANTLR end "rule__ETD__Group_2__1__Impl"


    // $ANTLR start "rule__ETD__Group_2__2"
    // InternalTechnoCat.g:1133:1: rule__ETD__Group_2__2 : rule__ETD__Group_2__2__Impl ;
    public final void rule__ETD__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1137:1: ( rule__ETD__Group_2__2__Impl )
            // InternalTechnoCat.g:1138:2: rule__ETD__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ETD__Group_2__2__Impl();

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
    // $ANTLR end "rule__ETD__Group_2__2"


    // $ANTLR start "rule__ETD__Group_2__2__Impl"
    // InternalTechnoCat.g:1144:1: rule__ETD__Group_2__2__Impl : ( ( rule__ETD__Group_2_2__0 )* ) ;
    public final void rule__ETD__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1148:1: ( ( ( rule__ETD__Group_2_2__0 )* ) )
            // InternalTechnoCat.g:1149:1: ( ( rule__ETD__Group_2_2__0 )* )
            {
            // InternalTechnoCat.g:1149:1: ( ( rule__ETD__Group_2_2__0 )* )
            // InternalTechnoCat.g:1150:2: ( rule__ETD__Group_2_2__0 )*
            {
             before(grammarAccess.getETDAccess().getGroup_2_2()); 
            // InternalTechnoCat.g:1151:2: ( rule__ETD__Group_2_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==46) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTechnoCat.g:1151:3: rule__ETD__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ETD__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getETDAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__ETD__Group_2__2__Impl"


    // $ANTLR start "rule__ETD__Group_2_2__0"
    // InternalTechnoCat.g:1160:1: rule__ETD__Group_2_2__0 : rule__ETD__Group_2_2__0__Impl rule__ETD__Group_2_2__1 ;
    public final void rule__ETD__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1164:1: ( rule__ETD__Group_2_2__0__Impl rule__ETD__Group_2_2__1 )
            // InternalTechnoCat.g:1165:2: rule__ETD__Group_2_2__0__Impl rule__ETD__Group_2_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ETD__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ETD__Group_2_2__1();

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
    // $ANTLR end "rule__ETD__Group_2_2__0"


    // $ANTLR start "rule__ETD__Group_2_2__0__Impl"
    // InternalTechnoCat.g:1172:1: rule__ETD__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__ETD__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1176:1: ( ( ',' ) )
            // InternalTechnoCat.g:1177:1: ( ',' )
            {
            // InternalTechnoCat.g:1177:1: ( ',' )
            // InternalTechnoCat.g:1178:2: ','
            {
             before(grammarAccess.getETDAccess().getCommaKeyword_2_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getETDAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__ETD__Group_2_2__0__Impl"


    // $ANTLR start "rule__ETD__Group_2_2__1"
    // InternalTechnoCat.g:1187:1: rule__ETD__Group_2_2__1 : rule__ETD__Group_2_2__1__Impl ;
    public final void rule__ETD__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1191:1: ( rule__ETD__Group_2_2__1__Impl )
            // InternalTechnoCat.g:1192:2: rule__ETD__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ETD__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__ETD__Group_2_2__1"


    // $ANTLR start "rule__ETD__Group_2_2__1__Impl"
    // InternalTechnoCat.g:1198:1: rule__ETD__Group_2_2__1__Impl : ( ( rule__ETD__BasesAssignment_2_2_1 ) ) ;
    public final void rule__ETD__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1202:1: ( ( ( rule__ETD__BasesAssignment_2_2_1 ) ) )
            // InternalTechnoCat.g:1203:1: ( ( rule__ETD__BasesAssignment_2_2_1 ) )
            {
            // InternalTechnoCat.g:1203:1: ( ( rule__ETD__BasesAssignment_2_2_1 ) )
            // InternalTechnoCat.g:1204:2: ( rule__ETD__BasesAssignment_2_2_1 )
            {
             before(grammarAccess.getETDAccess().getBasesAssignment_2_2_1()); 
            // InternalTechnoCat.g:1205:2: ( rule__ETD__BasesAssignment_2_2_1 )
            // InternalTechnoCat.g:1205:3: rule__ETD__BasesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ETD__BasesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getETDAccess().getBasesAssignment_2_2_1()); 

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
    // $ANTLR end "rule__ETD__Group_2_2__1__Impl"


    // $ANTLR start "rule__ETD__Group_3__0"
    // InternalTechnoCat.g:1214:1: rule__ETD__Group_3__0 : rule__ETD__Group_3__0__Impl rule__ETD__Group_3__1 ;
    public final void rule__ETD__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1218:1: ( rule__ETD__Group_3__0__Impl rule__ETD__Group_3__1 )
            // InternalTechnoCat.g:1219:2: rule__ETD__Group_3__0__Impl rule__ETD__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__ETD__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ETD__Group_3__1();

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
    // $ANTLR end "rule__ETD__Group_3__0"


    // $ANTLR start "rule__ETD__Group_3__0__Impl"
    // InternalTechnoCat.g:1226:1: rule__ETD__Group_3__0__Impl : ( '=' ) ;
    public final void rule__ETD__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1230:1: ( ( '=' ) )
            // InternalTechnoCat.g:1231:1: ( '=' )
            {
            // InternalTechnoCat.g:1231:1: ( '=' )
            // InternalTechnoCat.g:1232:2: '='
            {
             before(grammarAccess.getETDAccess().getEqualsSignKeyword_3_0()); 
            match(input,8,FOLLOW_2); 
             after(grammarAccess.getETDAccess().getEqualsSignKeyword_3_0()); 

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
    // $ANTLR end "rule__ETD__Group_3__0__Impl"


    // $ANTLR start "rule__ETD__Group_3__1"
    // InternalTechnoCat.g:1241:1: rule__ETD__Group_3__1 : rule__ETD__Group_3__1__Impl ;
    public final void rule__ETD__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1245:1: ( rule__ETD__Group_3__1__Impl )
            // InternalTechnoCat.g:1246:2: rule__ETD__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ETD__Group_3__1__Impl();

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
    // $ANTLR end "rule__ETD__Group_3__1"


    // $ANTLR start "rule__ETD__Group_3__1__Impl"
    // InternalTechnoCat.g:1252:1: rule__ETD__Group_3__1__Impl : ( ( rule__ETD__ValueAssignment_3_1 ) ) ;
    public final void rule__ETD__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1256:1: ( ( ( rule__ETD__ValueAssignment_3_1 ) ) )
            // InternalTechnoCat.g:1257:1: ( ( rule__ETD__ValueAssignment_3_1 ) )
            {
            // InternalTechnoCat.g:1257:1: ( ( rule__ETD__ValueAssignment_3_1 ) )
            // InternalTechnoCat.g:1258:2: ( rule__ETD__ValueAssignment_3_1 )
            {
             before(grammarAccess.getETDAccess().getValueAssignment_3_1()); 
            // InternalTechnoCat.g:1259:2: ( rule__ETD__ValueAssignment_3_1 )
            // InternalTechnoCat.g:1259:3: rule__ETD__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ETD__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getETDAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__ETD__Group_3__1__Impl"


    // $ANTLR start "rule__RTD__Group__0"
    // InternalTechnoCat.g:1268:1: rule__RTD__Group__0 : rule__RTD__Group__0__Impl rule__RTD__Group__1 ;
    public final void rule__RTD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1272:1: ( rule__RTD__Group__0__Impl rule__RTD__Group__1 )
            // InternalTechnoCat.g:1273:2: rule__RTD__Group__0__Impl rule__RTD__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RTD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RTD__Group__1();

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
    // $ANTLR end "rule__RTD__Group__0"


    // $ANTLR start "rule__RTD__Group__0__Impl"
    // InternalTechnoCat.g:1280:1: rule__RTD__Group__0__Impl : ( 'relation' ) ;
    public final void rule__RTD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1284:1: ( ( 'relation' ) )
            // InternalTechnoCat.g:1285:1: ( 'relation' )
            {
            // InternalTechnoCat.g:1285:1: ( 'relation' )
            // InternalTechnoCat.g:1286:2: 'relation'
            {
             before(grammarAccess.getRTDAccess().getRelationKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRTDAccess().getRelationKeyword_0()); 

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
    // $ANTLR end "rule__RTD__Group__0__Impl"


    // $ANTLR start "rule__RTD__Group__1"
    // InternalTechnoCat.g:1295:1: rule__RTD__Group__1 : rule__RTD__Group__1__Impl rule__RTD__Group__2 ;
    public final void rule__RTD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1299:1: ( rule__RTD__Group__1__Impl rule__RTD__Group__2 )
            // InternalTechnoCat.g:1300:2: rule__RTD__Group__1__Impl rule__RTD__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RTD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RTD__Group__2();

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
    // $ANTLR end "rule__RTD__Group__1"


    // $ANTLR start "rule__RTD__Group__1__Impl"
    // InternalTechnoCat.g:1307:1: rule__RTD__Group__1__Impl : ( ( rule__RTD__NameAssignment_1 ) ) ;
    public final void rule__RTD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1311:1: ( ( ( rule__RTD__NameAssignment_1 ) ) )
            // InternalTechnoCat.g:1312:1: ( ( rule__RTD__NameAssignment_1 ) )
            {
            // InternalTechnoCat.g:1312:1: ( ( rule__RTD__NameAssignment_1 ) )
            // InternalTechnoCat.g:1313:2: ( rule__RTD__NameAssignment_1 )
            {
             before(grammarAccess.getRTDAccess().getNameAssignment_1()); 
            // InternalTechnoCat.g:1314:2: ( rule__RTD__NameAssignment_1 )
            // InternalTechnoCat.g:1314:3: rule__RTD__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RTD__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RTD__Group__1__Impl"


    // $ANTLR start "rule__RTD__Group__2"
    // InternalTechnoCat.g:1322:1: rule__RTD__Group__2 : rule__RTD__Group__2__Impl rule__RTD__Group__3 ;
    public final void rule__RTD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1326:1: ( rule__RTD__Group__2__Impl rule__RTD__Group__3 )
            // InternalTechnoCat.g:1327:2: rule__RTD__Group__2__Impl rule__RTD__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RTD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RTD__Group__3();

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
    // $ANTLR end "rule__RTD__Group__2"


    // $ANTLR start "rule__RTD__Group__2__Impl"
    // InternalTechnoCat.g:1334:1: rule__RTD__Group__2__Impl : ( ( rule__RTD__Group_2__0 )? ) ;
    public final void rule__RTD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1338:1: ( ( ( rule__RTD__Group_2__0 )? ) )
            // InternalTechnoCat.g:1339:1: ( ( rule__RTD__Group_2__0 )? )
            {
            // InternalTechnoCat.g:1339:1: ( ( rule__RTD__Group_2__0 )? )
            // InternalTechnoCat.g:1340:2: ( rule__RTD__Group_2__0 )?
            {
             before(grammarAccess.getRTDAccess().getGroup_2()); 
            // InternalTechnoCat.g:1341:2: ( rule__RTD__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTechnoCat.g:1341:3: rule__RTD__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RTD__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRTDAccess().getGroup_2()); 

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
    // $ANTLR end "rule__RTD__Group__2__Impl"


    // $ANTLR start "rule__RTD__Group__3"
    // InternalTechnoCat.g:1349:1: rule__RTD__Group__3 : rule__RTD__Group__3__Impl rule__RTD__Group__4 ;
    public final void rule__RTD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1353:1: ( rule__RTD__Group__3__Impl rule__RTD__Group__4 )
            // InternalTechnoCat.g:1354:2: rule__RTD__Group__3__Impl rule__RTD__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__RTD__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RTD__Group__4();

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
    // $ANTLR end "rule__RTD__Group__3"


    // $ANTLR start "rule__RTD__Group__3__Impl"
    // InternalTechnoCat.g:1361:1: rule__RTD__Group__3__Impl : ( ( rule__RTD__Group_3__0 )? ) ;
    public final void rule__RTD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1365:1: ( ( ( rule__RTD__Group_3__0 )? ) )
            // InternalTechnoCat.g:1366:1: ( ( rule__RTD__Group_3__0 )? )
            {
            // InternalTechnoCat.g:1366:1: ( ( rule__RTD__Group_3__0 )? )
            // InternalTechnoCat.g:1367:2: ( rule__RTD__Group_3__0 )?
            {
             before(grammarAccess.getRTDAccess().getGroup_3()); 
            // InternalTechnoCat.g:1368:2: ( rule__RTD__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==8) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTechnoCat.g:1368:3: rule__RTD__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RTD__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRTDAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RTD__Group__3__Impl"


    // $ANTLR start "rule__RTD__Group__4"
    // InternalTechnoCat.g:1376:1: rule__RTD__Group__4 : rule__RTD__Group__4__Impl ;
    public final void rule__RTD__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1380:1: ( rule__RTD__Group__4__Impl )
            // InternalTechnoCat.g:1381:2: rule__RTD__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RTD__Group__4__Impl();

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
    // $ANTLR end "rule__RTD__Group__4"


    // $ANTLR start "rule__RTD__Group__4__Impl"
    // InternalTechnoCat.g:1387:1: rule__RTD__Group__4__Impl : ( ( rule__RTD__ItemsAssignment_4 )* ) ;
    public final void rule__RTD__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1391:1: ( ( ( rule__RTD__ItemsAssignment_4 )* ) )
            // InternalTechnoCat.g:1392:1: ( ( rule__RTD__ItemsAssignment_4 )* )
            {
            // InternalTechnoCat.g:1392:1: ( ( rule__RTD__ItemsAssignment_4 )* )
            // InternalTechnoCat.g:1393:2: ( rule__RTD__ItemsAssignment_4 )*
            {
             before(grammarAccess.getRTDAccess().getItemsAssignment_4()); 
            // InternalTechnoCat.g:1394:2: ( rule__RTD__ItemsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==48) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==RULE_STRING) ) {
                    int LA15_3 = input.LA(2);

                    if ( (LA15_3==48) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalTechnoCat.g:1394:3: rule__RTD__ItemsAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RTD__ItemsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRTDAccess().getItemsAssignment_4()); 

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
    // $ANTLR end "rule__RTD__Group__4__Impl"


    // $ANTLR start "rule__RTD__Group_2__0"
    // InternalTechnoCat.g:1403:1: rule__RTD__Group_2__0 : rule__RTD__Group_2__0__Impl rule__RTD__Group_2__1 ;
    public final void rule__RTD__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1407:1: ( rule__RTD__Group_2__0__Impl rule__RTD__Group_2__1 )
            // InternalTechnoCat.g:1408:2: rule__RTD__Group_2__0__Impl rule__RTD__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__RTD__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RTD__Group_2__1();

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
    // $ANTLR end "rule__RTD__Group_2__0"


    // $ANTLR start "rule__RTD__Group_2__0__Impl"
    // InternalTechnoCat.g:1415:1: rule__RTD__Group_2__0__Impl : ( 'from' ) ;
    public final void rule__RTD__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1419:1: ( ( 'from' ) )
            // InternalTechnoCat.g:1420:1: ( 'from' )
            {
            // InternalTechnoCat.g:1420:1: ( 'from' )
            // InternalTechnoCat.g:1421:2: 'from'
            {
             before(grammarAccess.getRTDAccess().getFromKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRTDAccess().getFromKeyword_2_0()); 

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
    // $ANTLR end "rule__RTD__Group_2__0__Impl"


    // $ANTLR start "rule__RTD__Group_2__1"
    // InternalTechnoCat.g:1430:1: rule__RTD__Group_2__1 : rule__RTD__Group_2__1__Impl rule__RTD__Group_2__2 ;
    public final void rule__RTD__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1434:1: ( rule__RTD__Group_2__1__Impl rule__RTD__Group_2__2 )
            // InternalTechnoCat.g:1435:2: rule__RTD__Group_2__1__Impl rule__RTD__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__RTD__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RTD__Group_2__2();

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
    // $ANTLR end "rule__RTD__Group_2__1"


    // $ANTLR start "rule__RTD__Group_2__1__Impl"
    // InternalTechnoCat.g:1442:1: rule__RTD__Group_2__1__Impl : ( ( rule__RTD__BasesAssignment_2_1 ) ) ;
    public final void rule__RTD__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1446:1: ( ( ( rule__RTD__BasesAssignment_2_1 ) ) )
            // InternalTechnoCat.g:1447:1: ( ( rule__RTD__BasesAssignment_2_1 ) )
            {
            // InternalTechnoCat.g:1447:1: ( ( rule__RTD__BasesAssignment_2_1 ) )
            // InternalTechnoCat.g:1448:2: ( rule__RTD__BasesAssignment_2_1 )
            {
             before(grammarAccess.getRTDAccess().getBasesAssignment_2_1()); 
            // InternalTechnoCat.g:1449:2: ( rule__RTD__BasesAssignment_2_1 )
            // InternalTechnoCat.g:1449:3: rule__RTD__BasesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RTD__BasesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getBasesAssignment_2_1()); 

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
    // $ANTLR end "rule__RTD__Group_2__1__Impl"


    // $ANTLR start "rule__RTD__Group_2__2"
    // InternalTechnoCat.g:1457:1: rule__RTD__Group_2__2 : rule__RTD__Group_2__2__Impl ;
    public final void rule__RTD__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1461:1: ( rule__RTD__Group_2__2__Impl )
            // InternalTechnoCat.g:1462:2: rule__RTD__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RTD__Group_2__2__Impl();

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
    // $ANTLR end "rule__RTD__Group_2__2"


    // $ANTLR start "rule__RTD__Group_2__2__Impl"
    // InternalTechnoCat.g:1468:1: rule__RTD__Group_2__2__Impl : ( ( rule__RTD__Group_2_2__0 )* ) ;
    public final void rule__RTD__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1472:1: ( ( ( rule__RTD__Group_2_2__0 )* ) )
            // InternalTechnoCat.g:1473:1: ( ( rule__RTD__Group_2_2__0 )* )
            {
            // InternalTechnoCat.g:1473:1: ( ( rule__RTD__Group_2_2__0 )* )
            // InternalTechnoCat.g:1474:2: ( rule__RTD__Group_2_2__0 )*
            {
             before(grammarAccess.getRTDAccess().getGroup_2_2()); 
            // InternalTechnoCat.g:1475:2: ( rule__RTD__Group_2_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==46) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTechnoCat.g:1475:3: rule__RTD__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RTD__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRTDAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__RTD__Group_2__2__Impl"


    // $ANTLR start "rule__RTD__Group_2_2__0"
    // InternalTechnoCat.g:1484:1: rule__RTD__Group_2_2__0 : rule__RTD__Group_2_2__0__Impl rule__RTD__Group_2_2__1 ;
    public final void rule__RTD__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1488:1: ( rule__RTD__Group_2_2__0__Impl rule__RTD__Group_2_2__1 )
            // InternalTechnoCat.g:1489:2: rule__RTD__Group_2_2__0__Impl rule__RTD__Group_2_2__1
            {
            pushFollow(FOLLOW_11);
            rule__RTD__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RTD__Group_2_2__1();

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
    // $ANTLR end "rule__RTD__Group_2_2__0"


    // $ANTLR start "rule__RTD__Group_2_2__0__Impl"
    // InternalTechnoCat.g:1496:1: rule__RTD__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__RTD__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1500:1: ( ( ',' ) )
            // InternalTechnoCat.g:1501:1: ( ',' )
            {
            // InternalTechnoCat.g:1501:1: ( ',' )
            // InternalTechnoCat.g:1502:2: ','
            {
             before(grammarAccess.getRTDAccess().getCommaKeyword_2_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRTDAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__RTD__Group_2_2__0__Impl"


    // $ANTLR start "rule__RTD__Group_2_2__1"
    // InternalTechnoCat.g:1511:1: rule__RTD__Group_2_2__1 : rule__RTD__Group_2_2__1__Impl ;
    public final void rule__RTD__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1515:1: ( rule__RTD__Group_2_2__1__Impl )
            // InternalTechnoCat.g:1516:2: rule__RTD__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RTD__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__RTD__Group_2_2__1"


    // $ANTLR start "rule__RTD__Group_2_2__1__Impl"
    // InternalTechnoCat.g:1522:1: rule__RTD__Group_2_2__1__Impl : ( ( rule__RTD__BasesAssignment_2_2_1 ) ) ;
    public final void rule__RTD__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1526:1: ( ( ( rule__RTD__BasesAssignment_2_2_1 ) ) )
            // InternalTechnoCat.g:1527:1: ( ( rule__RTD__BasesAssignment_2_2_1 ) )
            {
            // InternalTechnoCat.g:1527:1: ( ( rule__RTD__BasesAssignment_2_2_1 ) )
            // InternalTechnoCat.g:1528:2: ( rule__RTD__BasesAssignment_2_2_1 )
            {
             before(grammarAccess.getRTDAccess().getBasesAssignment_2_2_1()); 
            // InternalTechnoCat.g:1529:2: ( rule__RTD__BasesAssignment_2_2_1 )
            // InternalTechnoCat.g:1529:3: rule__RTD__BasesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RTD__BasesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getBasesAssignment_2_2_1()); 

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
    // $ANTLR end "rule__RTD__Group_2_2__1__Impl"


    // $ANTLR start "rule__RTD__Group_3__0"
    // InternalTechnoCat.g:1538:1: rule__RTD__Group_3__0 : rule__RTD__Group_3__0__Impl rule__RTD__Group_3__1 ;
    public final void rule__RTD__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1542:1: ( rule__RTD__Group_3__0__Impl rule__RTD__Group_3__1 )
            // InternalTechnoCat.g:1543:2: rule__RTD__Group_3__0__Impl rule__RTD__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__RTD__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RTD__Group_3__1();

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
    // $ANTLR end "rule__RTD__Group_3__0"


    // $ANTLR start "rule__RTD__Group_3__0__Impl"
    // InternalTechnoCat.g:1550:1: rule__RTD__Group_3__0__Impl : ( '=' ) ;
    public final void rule__RTD__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1554:1: ( ( '=' ) )
            // InternalTechnoCat.g:1555:1: ( '=' )
            {
            // InternalTechnoCat.g:1555:1: ( '=' )
            // InternalTechnoCat.g:1556:2: '='
            {
             before(grammarAccess.getRTDAccess().getEqualsSignKeyword_3_0()); 
            match(input,8,FOLLOW_2); 
             after(grammarAccess.getRTDAccess().getEqualsSignKeyword_3_0()); 

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
    // $ANTLR end "rule__RTD__Group_3__0__Impl"


    // $ANTLR start "rule__RTD__Group_3__1"
    // InternalTechnoCat.g:1565:1: rule__RTD__Group_3__1 : rule__RTD__Group_3__1__Impl ;
    public final void rule__RTD__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1569:1: ( rule__RTD__Group_3__1__Impl )
            // InternalTechnoCat.g:1570:2: rule__RTD__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RTD__Group_3__1__Impl();

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
    // $ANTLR end "rule__RTD__Group_3__1"


    // $ANTLR start "rule__RTD__Group_3__1__Impl"
    // InternalTechnoCat.g:1576:1: rule__RTD__Group_3__1__Impl : ( ( rule__RTD__ValueAssignment_3_1 ) ) ;
    public final void rule__RTD__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1580:1: ( ( ( rule__RTD__ValueAssignment_3_1 ) ) )
            // InternalTechnoCat.g:1581:1: ( ( rule__RTD__ValueAssignment_3_1 ) )
            {
            // InternalTechnoCat.g:1581:1: ( ( rule__RTD__ValueAssignment_3_1 ) )
            // InternalTechnoCat.g:1582:2: ( rule__RTD__ValueAssignment_3_1 )
            {
             before(grammarAccess.getRTDAccess().getValueAssignment_3_1()); 
            // InternalTechnoCat.g:1583:2: ( rule__RTD__ValueAssignment_3_1 )
            // InternalTechnoCat.g:1583:3: rule__RTD__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RTD__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__RTD__Group_3__1__Impl"


    // $ANTLR start "rule__RTDItem__Group__0"
    // InternalTechnoCat.g:1592:1: rule__RTDItem__Group__0 : rule__RTDItem__Group__0__Impl rule__RTDItem__Group__1 ;
    public final void rule__RTDItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1596:1: ( rule__RTDItem__Group__0__Impl rule__RTDItem__Group__1 )
            // InternalTechnoCat.g:1597:2: rule__RTDItem__Group__0__Impl rule__RTDItem__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__RTDItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RTDItem__Group__1();

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
    // $ANTLR end "rule__RTDItem__Group__0"


    // $ANTLR start "rule__RTDItem__Group__0__Impl"
    // InternalTechnoCat.g:1604:1: rule__RTDItem__Group__0__Impl : ( ( rule__RTDItem__DomainAssignment_0 ) ) ;
    public final void rule__RTDItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1608:1: ( ( ( rule__RTDItem__DomainAssignment_0 ) ) )
            // InternalTechnoCat.g:1609:1: ( ( rule__RTDItem__DomainAssignment_0 ) )
            {
            // InternalTechnoCat.g:1609:1: ( ( rule__RTDItem__DomainAssignment_0 ) )
            // InternalTechnoCat.g:1610:2: ( rule__RTDItem__DomainAssignment_0 )
            {
             before(grammarAccess.getRTDItemAccess().getDomainAssignment_0()); 
            // InternalTechnoCat.g:1611:2: ( rule__RTDItem__DomainAssignment_0 )
            // InternalTechnoCat.g:1611:3: rule__RTDItem__DomainAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RTDItem__DomainAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRTDItemAccess().getDomainAssignment_0()); 

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
    // $ANTLR end "rule__RTDItem__Group__0__Impl"


    // $ANTLR start "rule__RTDItem__Group__1"
    // InternalTechnoCat.g:1619:1: rule__RTDItem__Group__1 : rule__RTDItem__Group__1__Impl rule__RTDItem__Group__2 ;
    public final void rule__RTDItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1623:1: ( rule__RTDItem__Group__1__Impl rule__RTDItem__Group__2 )
            // InternalTechnoCat.g:1624:2: rule__RTDItem__Group__1__Impl rule__RTDItem__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__RTDItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RTDItem__Group__2();

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
    // $ANTLR end "rule__RTDItem__Group__1"


    // $ANTLR start "rule__RTDItem__Group__1__Impl"
    // InternalTechnoCat.g:1631:1: rule__RTDItem__Group__1__Impl : ( '->' ) ;
    public final void rule__RTDItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1635:1: ( ( '->' ) )
            // InternalTechnoCat.g:1636:1: ( '->' )
            {
            // InternalTechnoCat.g:1636:1: ( '->' )
            // InternalTechnoCat.g:1637:2: '->'
            {
             before(grammarAccess.getRTDItemAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRTDItemAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__RTDItem__Group__1__Impl"


    // $ANTLR start "rule__RTDItem__Group__2"
    // InternalTechnoCat.g:1646:1: rule__RTDItem__Group__2 : rule__RTDItem__Group__2__Impl rule__RTDItem__Group__3 ;
    public final void rule__RTDItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1650:1: ( rule__RTDItem__Group__2__Impl rule__RTDItem__Group__3 )
            // InternalTechnoCat.g:1651:2: rule__RTDItem__Group__2__Impl rule__RTDItem__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__RTDItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RTDItem__Group__3();

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
    // $ANTLR end "rule__RTDItem__Group__2"


    // $ANTLR start "rule__RTDItem__Group__2__Impl"
    // InternalTechnoCat.g:1658:1: rule__RTDItem__Group__2__Impl : ( ( rule__RTDItem__CodomainAssignment_2 ) ) ;
    public final void rule__RTDItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1662:1: ( ( ( rule__RTDItem__CodomainAssignment_2 ) ) )
            // InternalTechnoCat.g:1663:1: ( ( rule__RTDItem__CodomainAssignment_2 ) )
            {
            // InternalTechnoCat.g:1663:1: ( ( rule__RTDItem__CodomainAssignment_2 ) )
            // InternalTechnoCat.g:1664:2: ( rule__RTDItem__CodomainAssignment_2 )
            {
             before(grammarAccess.getRTDItemAccess().getCodomainAssignment_2()); 
            // InternalTechnoCat.g:1665:2: ( rule__RTDItem__CodomainAssignment_2 )
            // InternalTechnoCat.g:1665:3: rule__RTDItem__CodomainAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RTDItem__CodomainAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRTDItemAccess().getCodomainAssignment_2()); 

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
    // $ANTLR end "rule__RTDItem__Group__2__Impl"


    // $ANTLR start "rule__RTDItem__Group__3"
    // InternalTechnoCat.g:1673:1: rule__RTDItem__Group__3 : rule__RTDItem__Group__3__Impl ;
    public final void rule__RTDItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1677:1: ( rule__RTDItem__Group__3__Impl )
            // InternalTechnoCat.g:1678:2: rule__RTDItem__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RTDItem__Group__3__Impl();

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
    // $ANTLR end "rule__RTDItem__Group__3"


    // $ANTLR start "rule__RTDItem__Group__3__Impl"
    // InternalTechnoCat.g:1684:1: rule__RTDItem__Group__3__Impl : ( ( rule__RTDItem__Group_3__0 )? ) ;
    public final void rule__RTDItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1688:1: ( ( ( rule__RTDItem__Group_3__0 )? ) )
            // InternalTechnoCat.g:1689:1: ( ( rule__RTDItem__Group_3__0 )? )
            {
            // InternalTechnoCat.g:1689:1: ( ( rule__RTDItem__Group_3__0 )? )
            // InternalTechnoCat.g:1690:2: ( rule__RTDItem__Group_3__0 )?
            {
             before(grammarAccess.getRTDItemAccess().getGroup_3()); 
            // InternalTechnoCat.g:1691:2: ( rule__RTDItem__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==8) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTechnoCat.g:1691:3: rule__RTDItem__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RTDItem__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRTDItemAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RTDItem__Group__3__Impl"


    // $ANTLR start "rule__RTDItem__Group_3__0"
    // InternalTechnoCat.g:1700:1: rule__RTDItem__Group_3__0 : rule__RTDItem__Group_3__0__Impl rule__RTDItem__Group_3__1 ;
    public final void rule__RTDItem__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1704:1: ( rule__RTDItem__Group_3__0__Impl rule__RTDItem__Group_3__1 )
            // InternalTechnoCat.g:1705:2: rule__RTDItem__Group_3__0__Impl rule__RTDItem__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__RTDItem__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RTDItem__Group_3__1();

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
    // $ANTLR end "rule__RTDItem__Group_3__0"


    // $ANTLR start "rule__RTDItem__Group_3__0__Impl"
    // InternalTechnoCat.g:1712:1: rule__RTDItem__Group_3__0__Impl : ( '=' ) ;
    public final void rule__RTDItem__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1716:1: ( ( '=' ) )
            // InternalTechnoCat.g:1717:1: ( '=' )
            {
            // InternalTechnoCat.g:1717:1: ( '=' )
            // InternalTechnoCat.g:1718:2: '='
            {
             before(grammarAccess.getRTDItemAccess().getEqualsSignKeyword_3_0()); 
            match(input,8,FOLLOW_2); 
             after(grammarAccess.getRTDItemAccess().getEqualsSignKeyword_3_0()); 

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
    // $ANTLR end "rule__RTDItem__Group_3__0__Impl"


    // $ANTLR start "rule__RTDItem__Group_3__1"
    // InternalTechnoCat.g:1727:1: rule__RTDItem__Group_3__1 : rule__RTDItem__Group_3__1__Impl ;
    public final void rule__RTDItem__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1731:1: ( rule__RTDItem__Group_3__1__Impl )
            // InternalTechnoCat.g:1732:2: rule__RTDItem__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RTDItem__Group_3__1__Impl();

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
    // $ANTLR end "rule__RTDItem__Group_3__1"


    // $ANTLR start "rule__RTDItem__Group_3__1__Impl"
    // InternalTechnoCat.g:1738:1: rule__RTDItem__Group_3__1__Impl : ( ( rule__RTDItem__ValueAssignment_3_1 ) ) ;
    public final void rule__RTDItem__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1742:1: ( ( ( rule__RTDItem__ValueAssignment_3_1 ) ) )
            // InternalTechnoCat.g:1743:1: ( ( rule__RTDItem__ValueAssignment_3_1 ) )
            {
            // InternalTechnoCat.g:1743:1: ( ( rule__RTDItem__ValueAssignment_3_1 ) )
            // InternalTechnoCat.g:1744:2: ( rule__RTDItem__ValueAssignment_3_1 )
            {
             before(grammarAccess.getRTDItemAccess().getValueAssignment_3_1()); 
            // InternalTechnoCat.g:1745:2: ( rule__RTDItem__ValueAssignment_3_1 )
            // InternalTechnoCat.g:1745:3: rule__RTDItem__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RTDItem__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRTDItemAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__RTDItem__Group_3__1__Impl"


    // $ANTLR start "rule__ED__Group__0"
    // InternalTechnoCat.g:1754:1: rule__ED__Group__0 : rule__ED__Group__0__Impl rule__ED__Group__1 ;
    public final void rule__ED__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1758:1: ( rule__ED__Group__0__Impl rule__ED__Group__1 )
            // InternalTechnoCat.g:1759:2: rule__ED__Group__0__Impl rule__ED__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ED__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ED__Group__1();

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
    // $ANTLR end "rule__ED__Group__0"


    // $ANTLR start "rule__ED__Group__0__Impl"
    // InternalTechnoCat.g:1766:1: rule__ED__Group__0__Impl : ( ( rule__ED__TypeAssignment_0 ) ) ;
    public final void rule__ED__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1770:1: ( ( ( rule__ED__TypeAssignment_0 ) ) )
            // InternalTechnoCat.g:1771:1: ( ( rule__ED__TypeAssignment_0 ) )
            {
            // InternalTechnoCat.g:1771:1: ( ( rule__ED__TypeAssignment_0 ) )
            // InternalTechnoCat.g:1772:2: ( rule__ED__TypeAssignment_0 )
            {
             before(grammarAccess.getEDAccess().getTypeAssignment_0()); 
            // InternalTechnoCat.g:1773:2: ( rule__ED__TypeAssignment_0 )
            // InternalTechnoCat.g:1773:3: rule__ED__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ED__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEDAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__ED__Group__0__Impl"


    // $ANTLR start "rule__ED__Group__1"
    // InternalTechnoCat.g:1781:1: rule__ED__Group__1 : rule__ED__Group__1__Impl rule__ED__Group__2 ;
    public final void rule__ED__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1785:1: ( rule__ED__Group__1__Impl rule__ED__Group__2 )
            // InternalTechnoCat.g:1786:2: rule__ED__Group__1__Impl rule__ED__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ED__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ED__Group__2();

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
    // $ANTLR end "rule__ED__Group__1"


    // $ANTLR start "rule__ED__Group__1__Impl"
    // InternalTechnoCat.g:1793:1: rule__ED__Group__1__Impl : ( ':' ) ;
    public final void rule__ED__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1797:1: ( ( ':' ) )
            // InternalTechnoCat.g:1798:1: ( ':' )
            {
            // InternalTechnoCat.g:1798:1: ( ':' )
            // InternalTechnoCat.g:1799:2: ':'
            {
             before(grammarAccess.getEDAccess().getColonKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getEDAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ED__Group__1__Impl"


    // $ANTLR start "rule__ED__Group__2"
    // InternalTechnoCat.g:1808:1: rule__ED__Group__2 : rule__ED__Group__2__Impl rule__ED__Group__3 ;
    public final void rule__ED__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1812:1: ( rule__ED__Group__2__Impl rule__ED__Group__3 )
            // InternalTechnoCat.g:1813:2: rule__ED__Group__2__Impl rule__ED__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ED__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ED__Group__3();

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
    // $ANTLR end "rule__ED__Group__2"


    // $ANTLR start "rule__ED__Group__2__Impl"
    // InternalTechnoCat.g:1820:1: rule__ED__Group__2__Impl : ( ( rule__ED__ItemsAssignment_2 ) ) ;
    public final void rule__ED__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1824:1: ( ( ( rule__ED__ItemsAssignment_2 ) ) )
            // InternalTechnoCat.g:1825:1: ( ( rule__ED__ItemsAssignment_2 ) )
            {
            // InternalTechnoCat.g:1825:1: ( ( rule__ED__ItemsAssignment_2 ) )
            // InternalTechnoCat.g:1826:2: ( rule__ED__ItemsAssignment_2 )
            {
             before(grammarAccess.getEDAccess().getItemsAssignment_2()); 
            // InternalTechnoCat.g:1827:2: ( rule__ED__ItemsAssignment_2 )
            // InternalTechnoCat.g:1827:3: rule__ED__ItemsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ED__ItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEDAccess().getItemsAssignment_2()); 

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
    // $ANTLR end "rule__ED__Group__2__Impl"


    // $ANTLR start "rule__ED__Group__3"
    // InternalTechnoCat.g:1835:1: rule__ED__Group__3 : rule__ED__Group__3__Impl ;
    public final void rule__ED__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1839:1: ( rule__ED__Group__3__Impl )
            // InternalTechnoCat.g:1840:2: rule__ED__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ED__Group__3__Impl();

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
    // $ANTLR end "rule__ED__Group__3"


    // $ANTLR start "rule__ED__Group__3__Impl"
    // InternalTechnoCat.g:1846:1: rule__ED__Group__3__Impl : ( ( rule__ED__Group_3__0 )* ) ;
    public final void rule__ED__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1850:1: ( ( ( rule__ED__Group_3__0 )* ) )
            // InternalTechnoCat.g:1851:1: ( ( rule__ED__Group_3__0 )* )
            {
            // InternalTechnoCat.g:1851:1: ( ( rule__ED__Group_3__0 )* )
            // InternalTechnoCat.g:1852:2: ( rule__ED__Group_3__0 )*
            {
             before(grammarAccess.getEDAccess().getGroup_3()); 
            // InternalTechnoCat.g:1853:2: ( rule__ED__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTechnoCat.g:1853:3: rule__ED__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ED__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEDAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ED__Group__3__Impl"


    // $ANTLR start "rule__ED__Group_3__0"
    // InternalTechnoCat.g:1862:1: rule__ED__Group_3__0 : rule__ED__Group_3__0__Impl rule__ED__Group_3__1 ;
    public final void rule__ED__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1866:1: ( rule__ED__Group_3__0__Impl rule__ED__Group_3__1 )
            // InternalTechnoCat.g:1867:2: rule__ED__Group_3__0__Impl rule__ED__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__ED__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ED__Group_3__1();

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
    // $ANTLR end "rule__ED__Group_3__0"


    // $ANTLR start "rule__ED__Group_3__0__Impl"
    // InternalTechnoCat.g:1874:1: rule__ED__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ED__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1878:1: ( ( ',' ) )
            // InternalTechnoCat.g:1879:1: ( ',' )
            {
            // InternalTechnoCat.g:1879:1: ( ',' )
            // InternalTechnoCat.g:1880:2: ','
            {
             before(grammarAccess.getEDAccess().getCommaKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEDAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__ED__Group_3__0__Impl"


    // $ANTLR start "rule__ED__Group_3__1"
    // InternalTechnoCat.g:1889:1: rule__ED__Group_3__1 : rule__ED__Group_3__1__Impl ;
    public final void rule__ED__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1893:1: ( rule__ED__Group_3__1__Impl )
            // InternalTechnoCat.g:1894:2: rule__ED__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ED__Group_3__1__Impl();

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
    // $ANTLR end "rule__ED__Group_3__1"


    // $ANTLR start "rule__ED__Group_3__1__Impl"
    // InternalTechnoCat.g:1900:1: rule__ED__Group_3__1__Impl : ( ( rule__ED__ItemsAssignment_3_1 ) ) ;
    public final void rule__ED__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1904:1: ( ( ( rule__ED__ItemsAssignment_3_1 ) ) )
            // InternalTechnoCat.g:1905:1: ( ( rule__ED__ItemsAssignment_3_1 ) )
            {
            // InternalTechnoCat.g:1905:1: ( ( rule__ED__ItemsAssignment_3_1 ) )
            // InternalTechnoCat.g:1906:2: ( rule__ED__ItemsAssignment_3_1 )
            {
             before(grammarAccess.getEDAccess().getItemsAssignment_3_1()); 
            // InternalTechnoCat.g:1907:2: ( rule__ED__ItemsAssignment_3_1 )
            // InternalTechnoCat.g:1907:3: rule__ED__ItemsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ED__ItemsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEDAccess().getItemsAssignment_3_1()); 

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
    // $ANTLR end "rule__ED__Group_3__1__Impl"


    // $ANTLR start "rule__EDItem__Group__0"
    // InternalTechnoCat.g:1916:1: rule__EDItem__Group__0 : rule__EDItem__Group__0__Impl rule__EDItem__Group__1 ;
    public final void rule__EDItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1920:1: ( rule__EDItem__Group__0__Impl rule__EDItem__Group__1 )
            // InternalTechnoCat.g:1921:2: rule__EDItem__Group__0__Impl rule__EDItem__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EDItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDItem__Group__1();

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
    // $ANTLR end "rule__EDItem__Group__0"


    // $ANTLR start "rule__EDItem__Group__0__Impl"
    // InternalTechnoCat.g:1928:1: rule__EDItem__Group__0__Impl : ( ( rule__EDItem__NameAssignment_0 ) ) ;
    public final void rule__EDItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1932:1: ( ( ( rule__EDItem__NameAssignment_0 ) ) )
            // InternalTechnoCat.g:1933:1: ( ( rule__EDItem__NameAssignment_0 ) )
            {
            // InternalTechnoCat.g:1933:1: ( ( rule__EDItem__NameAssignment_0 ) )
            // InternalTechnoCat.g:1934:2: ( rule__EDItem__NameAssignment_0 )
            {
             before(grammarAccess.getEDItemAccess().getNameAssignment_0()); 
            // InternalTechnoCat.g:1935:2: ( rule__EDItem__NameAssignment_0 )
            // InternalTechnoCat.g:1935:3: rule__EDItem__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EDItem__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEDItemAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__EDItem__Group__0__Impl"


    // $ANTLR start "rule__EDItem__Group__1"
    // InternalTechnoCat.g:1943:1: rule__EDItem__Group__1 : rule__EDItem__Group__1__Impl ;
    public final void rule__EDItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1947:1: ( rule__EDItem__Group__1__Impl )
            // InternalTechnoCat.g:1948:2: rule__EDItem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDItem__Group__1__Impl();

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
    // $ANTLR end "rule__EDItem__Group__1"


    // $ANTLR start "rule__EDItem__Group__1__Impl"
    // InternalTechnoCat.g:1954:1: rule__EDItem__Group__1__Impl : ( ( rule__EDItem__Group_1__0 )? ) ;
    public final void rule__EDItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1958:1: ( ( ( rule__EDItem__Group_1__0 )? ) )
            // InternalTechnoCat.g:1959:1: ( ( rule__EDItem__Group_1__0 )? )
            {
            // InternalTechnoCat.g:1959:1: ( ( rule__EDItem__Group_1__0 )? )
            // InternalTechnoCat.g:1960:2: ( rule__EDItem__Group_1__0 )?
            {
             before(grammarAccess.getEDItemAccess().getGroup_1()); 
            // InternalTechnoCat.g:1961:2: ( rule__EDItem__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==8) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTechnoCat.g:1961:3: rule__EDItem__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDItem__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDItemAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EDItem__Group__1__Impl"


    // $ANTLR start "rule__EDItem__Group_1__0"
    // InternalTechnoCat.g:1970:1: rule__EDItem__Group_1__0 : rule__EDItem__Group_1__0__Impl rule__EDItem__Group_1__1 ;
    public final void rule__EDItem__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1974:1: ( rule__EDItem__Group_1__0__Impl rule__EDItem__Group_1__1 )
            // InternalTechnoCat.g:1975:2: rule__EDItem__Group_1__0__Impl rule__EDItem__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__EDItem__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDItem__Group_1__1();

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
    // $ANTLR end "rule__EDItem__Group_1__0"


    // $ANTLR start "rule__EDItem__Group_1__0__Impl"
    // InternalTechnoCat.g:1982:1: rule__EDItem__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EDItem__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:1986:1: ( ( '=' ) )
            // InternalTechnoCat.g:1987:1: ( '=' )
            {
            // InternalTechnoCat.g:1987:1: ( '=' )
            // InternalTechnoCat.g:1988:2: '='
            {
             before(grammarAccess.getEDItemAccess().getEqualsSignKeyword_1_0()); 
            match(input,8,FOLLOW_2); 
             after(grammarAccess.getEDItemAccess().getEqualsSignKeyword_1_0()); 

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
    // $ANTLR end "rule__EDItem__Group_1__0__Impl"


    // $ANTLR start "rule__EDItem__Group_1__1"
    // InternalTechnoCat.g:1997:1: rule__EDItem__Group_1__1 : rule__EDItem__Group_1__1__Impl ;
    public final void rule__EDItem__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2001:1: ( rule__EDItem__Group_1__1__Impl )
            // InternalTechnoCat.g:2002:2: rule__EDItem__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDItem__Group_1__1__Impl();

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
    // $ANTLR end "rule__EDItem__Group_1__1"


    // $ANTLR start "rule__EDItem__Group_1__1__Impl"
    // InternalTechnoCat.g:2008:1: rule__EDItem__Group_1__1__Impl : ( ( rule__EDItem__ValueAssignment_1_1 ) ) ;
    public final void rule__EDItem__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2012:1: ( ( ( rule__EDItem__ValueAssignment_1_1 ) ) )
            // InternalTechnoCat.g:2013:1: ( ( rule__EDItem__ValueAssignment_1_1 ) )
            {
            // InternalTechnoCat.g:2013:1: ( ( rule__EDItem__ValueAssignment_1_1 ) )
            // InternalTechnoCat.g:2014:2: ( rule__EDItem__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEDItemAccess().getValueAssignment_1_1()); 
            // InternalTechnoCat.g:2015:2: ( rule__EDItem__ValueAssignment_1_1 )
            // InternalTechnoCat.g:2015:3: rule__EDItem__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EDItem__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEDItemAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__EDItem__Group_1__1__Impl"


    // $ANTLR start "rule__RD__Group__0"
    // InternalTechnoCat.g:2024:1: rule__RD__Group__0 : rule__RD__Group__0__Impl rule__RD__Group__1 ;
    public final void rule__RD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2028:1: ( rule__RD__Group__0__Impl rule__RD__Group__1 )
            // InternalTechnoCat.g:2029:2: rule__RD__Group__0__Impl rule__RD__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RD__Group__1();

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
    // $ANTLR end "rule__RD__Group__0"


    // $ANTLR start "rule__RD__Group__0__Impl"
    // InternalTechnoCat.g:2036:1: rule__RD__Group__0__Impl : ( ( rule__RD__LeftAssignment_0 ) ) ;
    public final void rule__RD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2040:1: ( ( ( rule__RD__LeftAssignment_0 ) ) )
            // InternalTechnoCat.g:2041:1: ( ( rule__RD__LeftAssignment_0 ) )
            {
            // InternalTechnoCat.g:2041:1: ( ( rule__RD__LeftAssignment_0 ) )
            // InternalTechnoCat.g:2042:2: ( rule__RD__LeftAssignment_0 )
            {
             before(grammarAccess.getRDAccess().getLeftAssignment_0()); 
            // InternalTechnoCat.g:2043:2: ( rule__RD__LeftAssignment_0 )
            // InternalTechnoCat.g:2043:3: rule__RD__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RD__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRDAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__RD__Group__0__Impl"


    // $ANTLR start "rule__RD__Group__1"
    // InternalTechnoCat.g:2051:1: rule__RD__Group__1 : rule__RD__Group__1__Impl rule__RD__Group__2 ;
    public final void rule__RD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2055:1: ( rule__RD__Group__1__Impl rule__RD__Group__2 )
            // InternalTechnoCat.g:2056:2: rule__RD__Group__1__Impl rule__RD__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RD__Group__2();

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
    // $ANTLR end "rule__RD__Group__1"


    // $ANTLR start "rule__RD__Group__1__Impl"
    // InternalTechnoCat.g:2063:1: rule__RD__Group__1__Impl : ( ( rule__RD__RelationAssignment_1 ) ) ;
    public final void rule__RD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2067:1: ( ( ( rule__RD__RelationAssignment_1 ) ) )
            // InternalTechnoCat.g:2068:1: ( ( rule__RD__RelationAssignment_1 ) )
            {
            // InternalTechnoCat.g:2068:1: ( ( rule__RD__RelationAssignment_1 ) )
            // InternalTechnoCat.g:2069:2: ( rule__RD__RelationAssignment_1 )
            {
             before(grammarAccess.getRDAccess().getRelationAssignment_1()); 
            // InternalTechnoCat.g:2070:2: ( rule__RD__RelationAssignment_1 )
            // InternalTechnoCat.g:2070:3: rule__RD__RelationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RD__RelationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRDAccess().getRelationAssignment_1()); 

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
    // $ANTLR end "rule__RD__Group__1__Impl"


    // $ANTLR start "rule__RD__Group__2"
    // InternalTechnoCat.g:2078:1: rule__RD__Group__2 : rule__RD__Group__2__Impl rule__RD__Group__3 ;
    public final void rule__RD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2082:1: ( rule__RD__Group__2__Impl rule__RD__Group__3 )
            // InternalTechnoCat.g:2083:2: rule__RD__Group__2__Impl rule__RD__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__RD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RD__Group__3();

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
    // $ANTLR end "rule__RD__Group__2"


    // $ANTLR start "rule__RD__Group__2__Impl"
    // InternalTechnoCat.g:2090:1: rule__RD__Group__2__Impl : ( ( rule__RD__RightAssignment_2 ) ) ;
    public final void rule__RD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2094:1: ( ( ( rule__RD__RightAssignment_2 ) ) )
            // InternalTechnoCat.g:2095:1: ( ( rule__RD__RightAssignment_2 ) )
            {
            // InternalTechnoCat.g:2095:1: ( ( rule__RD__RightAssignment_2 ) )
            // InternalTechnoCat.g:2096:2: ( rule__RD__RightAssignment_2 )
            {
             before(grammarAccess.getRDAccess().getRightAssignment_2()); 
            // InternalTechnoCat.g:2097:2: ( rule__RD__RightAssignment_2 )
            // InternalTechnoCat.g:2097:3: rule__RD__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RD__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRDAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__RD__Group__2__Impl"


    // $ANTLR start "rule__RD__Group__3"
    // InternalTechnoCat.g:2105:1: rule__RD__Group__3 : rule__RD__Group__3__Impl ;
    public final void rule__RD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2109:1: ( rule__RD__Group__3__Impl )
            // InternalTechnoCat.g:2110:2: rule__RD__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RD__Group__3__Impl();

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
    // $ANTLR end "rule__RD__Group__3"


    // $ANTLR start "rule__RD__Group__3__Impl"
    // InternalTechnoCat.g:2116:1: rule__RD__Group__3__Impl : ( ( rule__RD__Group_3__0 )? ) ;
    public final void rule__RD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2120:1: ( ( ( rule__RD__Group_3__0 )? ) )
            // InternalTechnoCat.g:2121:1: ( ( rule__RD__Group_3__0 )? )
            {
            // InternalTechnoCat.g:2121:1: ( ( rule__RD__Group_3__0 )? )
            // InternalTechnoCat.g:2122:2: ( rule__RD__Group_3__0 )?
            {
             before(grammarAccess.getRDAccess().getGroup_3()); 
            // InternalTechnoCat.g:2123:2: ( rule__RD__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==8) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTechnoCat.g:2123:3: rule__RD__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RD__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RD__Group__3__Impl"


    // $ANTLR start "rule__RD__Group_3__0"
    // InternalTechnoCat.g:2132:1: rule__RD__Group_3__0 : rule__RD__Group_3__0__Impl rule__RD__Group_3__1 ;
    public final void rule__RD__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2136:1: ( rule__RD__Group_3__0__Impl rule__RD__Group_3__1 )
            // InternalTechnoCat.g:2137:2: rule__RD__Group_3__0__Impl rule__RD__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__RD__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RD__Group_3__1();

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
    // $ANTLR end "rule__RD__Group_3__0"


    // $ANTLR start "rule__RD__Group_3__0__Impl"
    // InternalTechnoCat.g:2144:1: rule__RD__Group_3__0__Impl : ( '=' ) ;
    public final void rule__RD__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2148:1: ( ( '=' ) )
            // InternalTechnoCat.g:2149:1: ( '=' )
            {
            // InternalTechnoCat.g:2149:1: ( '=' )
            // InternalTechnoCat.g:2150:2: '='
            {
             before(grammarAccess.getRDAccess().getEqualsSignKeyword_3_0()); 
            match(input,8,FOLLOW_2); 
             after(grammarAccess.getRDAccess().getEqualsSignKeyword_3_0()); 

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
    // $ANTLR end "rule__RD__Group_3__0__Impl"


    // $ANTLR start "rule__RD__Group_3__1"
    // InternalTechnoCat.g:2159:1: rule__RD__Group_3__1 : rule__RD__Group_3__1__Impl ;
    public final void rule__RD__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2163:1: ( rule__RD__Group_3__1__Impl )
            // InternalTechnoCat.g:2164:2: rule__RD__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RD__Group_3__1__Impl();

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
    // $ANTLR end "rule__RD__Group_3__1"


    // $ANTLR start "rule__RD__Group_3__1__Impl"
    // InternalTechnoCat.g:2170:1: rule__RD__Group_3__1__Impl : ( ( rule__RD__ValueAssignment_3_1 ) ) ;
    public final void rule__RD__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2174:1: ( ( ( rule__RD__ValueAssignment_3_1 ) ) )
            // InternalTechnoCat.g:2175:1: ( ( rule__RD__ValueAssignment_3_1 ) )
            {
            // InternalTechnoCat.g:2175:1: ( ( rule__RD__ValueAssignment_3_1 ) )
            // InternalTechnoCat.g:2176:2: ( rule__RD__ValueAssignment_3_1 )
            {
             before(grammarAccess.getRDAccess().getValueAssignment_3_1()); 
            // InternalTechnoCat.g:2177:2: ( rule__RD__ValueAssignment_3_1 )
            // InternalTechnoCat.g:2177:3: rule__RD__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RD__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRDAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__RD__Group_3__1__Impl"


    // $ANTLR start "rule__TechnologyCatalog__NameAssignment_1"
    // InternalTechnoCat.g:2186:1: rule__TechnologyCatalog__NameAssignment_1 : ( ruleTCID ) ;
    public final void rule__TechnologyCatalog__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2190:1: ( ( ruleTCID ) )
            // InternalTechnoCat.g:2191:2: ( ruleTCID )
            {
            // InternalTechnoCat.g:2191:2: ( ruleTCID )
            // InternalTechnoCat.g:2192:3: ruleTCID
            {
             before(grammarAccess.getTechnologyCatalogAccess().getNameTCIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTCID();

            state._fsp--;

             after(grammarAccess.getTechnologyCatalogAccess().getNameTCIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TechnologyCatalog__NameAssignment_1"


    // $ANTLR start "rule__TechnologyCatalog__ImportsAssignment_2_0"
    // InternalTechnoCat.g:2201:1: rule__TechnologyCatalog__ImportsAssignment_2_0 : ( ruleImport ) ;
    public final void rule__TechnologyCatalog__ImportsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2205:1: ( ( ruleImport ) )
            // InternalTechnoCat.g:2206:2: ( ruleImport )
            {
            // InternalTechnoCat.g:2206:2: ( ruleImport )
            // InternalTechnoCat.g:2207:3: ruleImport
            {
             before(grammarAccess.getTechnologyCatalogAccess().getImportsImportParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getTechnologyCatalogAccess().getImportsImportParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__TechnologyCatalog__ImportsAssignment_2_0"


    // $ANTLR start "rule__TechnologyCatalog__EntityTypesAssignment_2_1"
    // InternalTechnoCat.g:2216:1: rule__TechnologyCatalog__EntityTypesAssignment_2_1 : ( ruleETD ) ;
    public final void rule__TechnologyCatalog__EntityTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2220:1: ( ( ruleETD ) )
            // InternalTechnoCat.g:2221:2: ( ruleETD )
            {
            // InternalTechnoCat.g:2221:2: ( ruleETD )
            // InternalTechnoCat.g:2222:3: ruleETD
            {
             before(grammarAccess.getTechnologyCatalogAccess().getEntityTypesETDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleETD();

            state._fsp--;

             after(grammarAccess.getTechnologyCatalogAccess().getEntityTypesETDParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__TechnologyCatalog__EntityTypesAssignment_2_1"


    // $ANTLR start "rule__TechnologyCatalog__RelationTypesAssignment_2_2"
    // InternalTechnoCat.g:2231:1: rule__TechnologyCatalog__RelationTypesAssignment_2_2 : ( ruleRTD ) ;
    public final void rule__TechnologyCatalog__RelationTypesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2235:1: ( ( ruleRTD ) )
            // InternalTechnoCat.g:2236:2: ( ruleRTD )
            {
            // InternalTechnoCat.g:2236:2: ( ruleRTD )
            // InternalTechnoCat.g:2237:3: ruleRTD
            {
             before(grammarAccess.getTechnologyCatalogAccess().getRelationTypesRTDParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRTD();

            state._fsp--;

             after(grammarAccess.getTechnologyCatalogAccess().getRelationTypesRTDParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__TechnologyCatalog__RelationTypesAssignment_2_2"


    // $ANTLR start "rule__TechnologyCatalog__EntitiesAssignment_2_3"
    // InternalTechnoCat.g:2246:1: rule__TechnologyCatalog__EntitiesAssignment_2_3 : ( ruleED ) ;
    public final void rule__TechnologyCatalog__EntitiesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2250:1: ( ( ruleED ) )
            // InternalTechnoCat.g:2251:2: ( ruleED )
            {
            // InternalTechnoCat.g:2251:2: ( ruleED )
            // InternalTechnoCat.g:2252:3: ruleED
            {
             before(grammarAccess.getTechnologyCatalogAccess().getEntitiesEDParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleED();

            state._fsp--;

             after(grammarAccess.getTechnologyCatalogAccess().getEntitiesEDParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__TechnologyCatalog__EntitiesAssignment_2_3"


    // $ANTLR start "rule__TechnologyCatalog__RelationsAssignment_2_4"
    // InternalTechnoCat.g:2261:1: rule__TechnologyCatalog__RelationsAssignment_2_4 : ( ruleRD ) ;
    public final void rule__TechnologyCatalog__RelationsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2265:1: ( ( ruleRD ) )
            // InternalTechnoCat.g:2266:2: ( ruleRD )
            {
            // InternalTechnoCat.g:2266:2: ( ruleRD )
            // InternalTechnoCat.g:2267:3: ruleRD
            {
             before(grammarAccess.getTechnologyCatalogAccess().getRelationsRDParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRD();

            state._fsp--;

             after(grammarAccess.getTechnologyCatalogAccess().getRelationsRDParserRuleCall_2_4_0()); 

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
    // $ANTLR end "rule__TechnologyCatalog__RelationsAssignment_2_4"


    // $ANTLR start "rule__Import__RefAssignment_1"
    // InternalTechnoCat.g:2276:1: rule__Import__RefAssignment_1 : ( ( ruleTCID ) ) ;
    public final void rule__Import__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2280:1: ( ( ( ruleTCID ) ) )
            // InternalTechnoCat.g:2281:2: ( ( ruleTCID ) )
            {
            // InternalTechnoCat.g:2281:2: ( ( ruleTCID ) )
            // InternalTechnoCat.g:2282:3: ( ruleTCID )
            {
             before(grammarAccess.getImportAccess().getRefTechnologyCatalogCrossReference_1_0()); 
            // InternalTechnoCat.g:2283:3: ( ruleTCID )
            // InternalTechnoCat.g:2284:4: ruleTCID
            {
             before(grammarAccess.getImportAccess().getRefTechnologyCatalogTCIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleTCID();

            state._fsp--;

             after(grammarAccess.getImportAccess().getRefTechnologyCatalogTCIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getImportAccess().getRefTechnologyCatalogCrossReference_1_0()); 

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
    // $ANTLR end "rule__Import__RefAssignment_1"


    // $ANTLR start "rule__ETD__NameAssignment_1"
    // InternalTechnoCat.g:2295:1: rule__ETD__NameAssignment_1 : ( ruleETID ) ;
    public final void rule__ETD__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2299:1: ( ( ruleETID ) )
            // InternalTechnoCat.g:2300:2: ( ruleETID )
            {
            // InternalTechnoCat.g:2300:2: ( ruleETID )
            // InternalTechnoCat.g:2301:3: ruleETID
            {
             before(grammarAccess.getETDAccess().getNameETIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleETID();

            state._fsp--;

             after(grammarAccess.getETDAccess().getNameETIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ETD__NameAssignment_1"


    // $ANTLR start "rule__ETD__BasesAssignment_2_1"
    // InternalTechnoCat.g:2310:1: rule__ETD__BasesAssignment_2_1 : ( ( ruleETID ) ) ;
    public final void rule__ETD__BasesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2314:1: ( ( ( ruleETID ) ) )
            // InternalTechnoCat.g:2315:2: ( ( ruleETID ) )
            {
            // InternalTechnoCat.g:2315:2: ( ( ruleETID ) )
            // InternalTechnoCat.g:2316:3: ( ruleETID )
            {
             before(grammarAccess.getETDAccess().getBasesETDCrossReference_2_1_0()); 
            // InternalTechnoCat.g:2317:3: ( ruleETID )
            // InternalTechnoCat.g:2318:4: ruleETID
            {
             before(grammarAccess.getETDAccess().getBasesETDETIDParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleETID();

            state._fsp--;

             after(grammarAccess.getETDAccess().getBasesETDETIDParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getETDAccess().getBasesETDCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__ETD__BasesAssignment_2_1"


    // $ANTLR start "rule__ETD__BasesAssignment_2_2_1"
    // InternalTechnoCat.g:2329:1: rule__ETD__BasesAssignment_2_2_1 : ( ( ruleETID ) ) ;
    public final void rule__ETD__BasesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2333:1: ( ( ( ruleETID ) ) )
            // InternalTechnoCat.g:2334:2: ( ( ruleETID ) )
            {
            // InternalTechnoCat.g:2334:2: ( ( ruleETID ) )
            // InternalTechnoCat.g:2335:3: ( ruleETID )
            {
             before(grammarAccess.getETDAccess().getBasesETDCrossReference_2_2_1_0()); 
            // InternalTechnoCat.g:2336:3: ( ruleETID )
            // InternalTechnoCat.g:2337:4: ruleETID
            {
             before(grammarAccess.getETDAccess().getBasesETDETIDParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleETID();

            state._fsp--;

             after(grammarAccess.getETDAccess().getBasesETDETIDParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getETDAccess().getBasesETDCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__ETD__BasesAssignment_2_2_1"


    // $ANTLR start "rule__ETD__ValueAssignment_3_1"
    // InternalTechnoCat.g:2348:1: rule__ETD__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ETD__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2352:1: ( ( RULE_STRING ) )
            // InternalTechnoCat.g:2353:2: ( RULE_STRING )
            {
            // InternalTechnoCat.g:2353:2: ( RULE_STRING )
            // InternalTechnoCat.g:2354:3: RULE_STRING
            {
             before(grammarAccess.getETDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getETDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ETD__ValueAssignment_3_1"


    // $ANTLR start "rule__RTD__NameAssignment_1"
    // InternalTechnoCat.g:2363:1: rule__RTD__NameAssignment_1 : ( ruleRTID ) ;
    public final void rule__RTD__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2367:1: ( ( ruleRTID ) )
            // InternalTechnoCat.g:2368:2: ( ruleRTID )
            {
            // InternalTechnoCat.g:2368:2: ( ruleRTID )
            // InternalTechnoCat.g:2369:3: ruleRTID
            {
             before(grammarAccess.getRTDAccess().getNameRTIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRTID();

            state._fsp--;

             after(grammarAccess.getRTDAccess().getNameRTIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RTD__NameAssignment_1"


    // $ANTLR start "rule__RTD__BasesAssignment_2_1"
    // InternalTechnoCat.g:2378:1: rule__RTD__BasesAssignment_2_1 : ( ( ruleRTID ) ) ;
    public final void rule__RTD__BasesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2382:1: ( ( ( ruleRTID ) ) )
            // InternalTechnoCat.g:2383:2: ( ( ruleRTID ) )
            {
            // InternalTechnoCat.g:2383:2: ( ( ruleRTID ) )
            // InternalTechnoCat.g:2384:3: ( ruleRTID )
            {
             before(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_1_0()); 
            // InternalTechnoCat.g:2385:3: ( ruleRTID )
            // InternalTechnoCat.g:2386:4: ruleRTID
            {
             before(grammarAccess.getRTDAccess().getBasesRTDRTIDParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleRTID();

            state._fsp--;

             after(grammarAccess.getRTDAccess().getBasesRTDRTIDParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__RTD__BasesAssignment_2_1"


    // $ANTLR start "rule__RTD__BasesAssignment_2_2_1"
    // InternalTechnoCat.g:2397:1: rule__RTD__BasesAssignment_2_2_1 : ( ( ruleRTID ) ) ;
    public final void rule__RTD__BasesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2401:1: ( ( ( ruleRTID ) ) )
            // InternalTechnoCat.g:2402:2: ( ( ruleRTID ) )
            {
            // InternalTechnoCat.g:2402:2: ( ( ruleRTID ) )
            // InternalTechnoCat.g:2403:3: ( ruleRTID )
            {
             before(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_2_1_0()); 
            // InternalTechnoCat.g:2404:3: ( ruleRTID )
            // InternalTechnoCat.g:2405:4: ruleRTID
            {
             before(grammarAccess.getRTDAccess().getBasesRTDRTIDParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleRTID();

            state._fsp--;

             after(grammarAccess.getRTDAccess().getBasesRTDRTIDParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__RTD__BasesAssignment_2_2_1"


    // $ANTLR start "rule__RTD__ValueAssignment_3_1"
    // InternalTechnoCat.g:2416:1: rule__RTD__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__RTD__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2420:1: ( ( RULE_STRING ) )
            // InternalTechnoCat.g:2421:2: ( RULE_STRING )
            {
            // InternalTechnoCat.g:2421:2: ( RULE_STRING )
            // InternalTechnoCat.g:2422:3: RULE_STRING
            {
             before(grammarAccess.getRTDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRTDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__RTD__ValueAssignment_3_1"


    // $ANTLR start "rule__RTD__ItemsAssignment_4"
    // InternalTechnoCat.g:2431:1: rule__RTD__ItemsAssignment_4 : ( ruleRTDItem ) ;
    public final void rule__RTD__ItemsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2435:1: ( ( ruleRTDItem ) )
            // InternalTechnoCat.g:2436:2: ( ruleRTDItem )
            {
            // InternalTechnoCat.g:2436:2: ( ruleRTDItem )
            // InternalTechnoCat.g:2437:3: ruleRTDItem
            {
             before(grammarAccess.getRTDAccess().getItemsRTDItemParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRTDItem();

            state._fsp--;

             after(grammarAccess.getRTDAccess().getItemsRTDItemParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RTD__ItemsAssignment_4"


    // $ANTLR start "rule__RTDItem__DomainAssignment_0"
    // InternalTechnoCat.g:2446:1: rule__RTDItem__DomainAssignment_0 : ( ( ruleETID ) ) ;
    public final void rule__RTDItem__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2450:1: ( ( ( ruleETID ) ) )
            // InternalTechnoCat.g:2451:2: ( ( ruleETID ) )
            {
            // InternalTechnoCat.g:2451:2: ( ( ruleETID ) )
            // InternalTechnoCat.g:2452:3: ( ruleETID )
            {
             before(grammarAccess.getRTDItemAccess().getDomainETDCrossReference_0_0()); 
            // InternalTechnoCat.g:2453:3: ( ruleETID )
            // InternalTechnoCat.g:2454:4: ruleETID
            {
             before(grammarAccess.getRTDItemAccess().getDomainETDETIDParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleETID();

            state._fsp--;

             after(grammarAccess.getRTDItemAccess().getDomainETDETIDParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRTDItemAccess().getDomainETDCrossReference_0_0()); 

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
    // $ANTLR end "rule__RTDItem__DomainAssignment_0"


    // $ANTLR start "rule__RTDItem__CodomainAssignment_2"
    // InternalTechnoCat.g:2465:1: rule__RTDItem__CodomainAssignment_2 : ( ( ruleETID ) ) ;
    public final void rule__RTDItem__CodomainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2469:1: ( ( ( ruleETID ) ) )
            // InternalTechnoCat.g:2470:2: ( ( ruleETID ) )
            {
            // InternalTechnoCat.g:2470:2: ( ( ruleETID ) )
            // InternalTechnoCat.g:2471:3: ( ruleETID )
            {
             before(grammarAccess.getRTDItemAccess().getCodomainETDCrossReference_2_0()); 
            // InternalTechnoCat.g:2472:3: ( ruleETID )
            // InternalTechnoCat.g:2473:4: ruleETID
            {
             before(grammarAccess.getRTDItemAccess().getCodomainETDETIDParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleETID();

            state._fsp--;

             after(grammarAccess.getRTDItemAccess().getCodomainETDETIDParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRTDItemAccess().getCodomainETDCrossReference_2_0()); 

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
    // $ANTLR end "rule__RTDItem__CodomainAssignment_2"


    // $ANTLR start "rule__RTDItem__ValueAssignment_3_1"
    // InternalTechnoCat.g:2484:1: rule__RTDItem__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__RTDItem__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2488:1: ( ( RULE_STRING ) )
            // InternalTechnoCat.g:2489:2: ( RULE_STRING )
            {
            // InternalTechnoCat.g:2489:2: ( RULE_STRING )
            // InternalTechnoCat.g:2490:3: RULE_STRING
            {
             before(grammarAccess.getRTDItemAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRTDItemAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__RTDItem__ValueAssignment_3_1"


    // $ANTLR start "rule__ED__TypeAssignment_0"
    // InternalTechnoCat.g:2499:1: rule__ED__TypeAssignment_0 : ( ( ruleETID ) ) ;
    public final void rule__ED__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2503:1: ( ( ( ruleETID ) ) )
            // InternalTechnoCat.g:2504:2: ( ( ruleETID ) )
            {
            // InternalTechnoCat.g:2504:2: ( ( ruleETID ) )
            // InternalTechnoCat.g:2505:3: ( ruleETID )
            {
             before(grammarAccess.getEDAccess().getTypeETDCrossReference_0_0()); 
            // InternalTechnoCat.g:2506:3: ( ruleETID )
            // InternalTechnoCat.g:2507:4: ruleETID
            {
             before(grammarAccess.getEDAccess().getTypeETDETIDParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleETID();

            state._fsp--;

             after(grammarAccess.getEDAccess().getTypeETDETIDParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEDAccess().getTypeETDCrossReference_0_0()); 

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
    // $ANTLR end "rule__ED__TypeAssignment_0"


    // $ANTLR start "rule__ED__ItemsAssignment_2"
    // InternalTechnoCat.g:2518:1: rule__ED__ItemsAssignment_2 : ( ruleEDItem ) ;
    public final void rule__ED__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2522:1: ( ( ruleEDItem ) )
            // InternalTechnoCat.g:2523:2: ( ruleEDItem )
            {
            // InternalTechnoCat.g:2523:2: ( ruleEDItem )
            // InternalTechnoCat.g:2524:3: ruleEDItem
            {
             before(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDItem();

            state._fsp--;

             after(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ED__ItemsAssignment_2"


    // $ANTLR start "rule__ED__ItemsAssignment_3_1"
    // InternalTechnoCat.g:2533:1: rule__ED__ItemsAssignment_3_1 : ( ruleEDItem ) ;
    public final void rule__ED__ItemsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2537:1: ( ( ruleEDItem ) )
            // InternalTechnoCat.g:2538:2: ( ruleEDItem )
            {
            // InternalTechnoCat.g:2538:2: ( ruleEDItem )
            // InternalTechnoCat.g:2539:3: ruleEDItem
            {
             before(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDItem();

            state._fsp--;

             after(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ED__ItemsAssignment_3_1"


    // $ANTLR start "rule__EDItem__NameAssignment_0"
    // InternalTechnoCat.g:2548:1: rule__EDItem__NameAssignment_0 : ( ruleEID ) ;
    public final void rule__EDItem__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2552:1: ( ( ruleEID ) )
            // InternalTechnoCat.g:2553:2: ( ruleEID )
            {
            // InternalTechnoCat.g:2553:2: ( ruleEID )
            // InternalTechnoCat.g:2554:3: ruleEID
            {
             before(grammarAccess.getEDItemAccess().getNameEIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEID();

            state._fsp--;

             after(grammarAccess.getEDItemAccess().getNameEIDParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__EDItem__NameAssignment_0"


    // $ANTLR start "rule__EDItem__ValueAssignment_1_1"
    // InternalTechnoCat.g:2563:1: rule__EDItem__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__EDItem__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2567:1: ( ( RULE_STRING ) )
            // InternalTechnoCat.g:2568:2: ( RULE_STRING )
            {
            // InternalTechnoCat.g:2568:2: ( RULE_STRING )
            // InternalTechnoCat.g:2569:3: RULE_STRING
            {
             before(grammarAccess.getEDItemAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEDItemAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__EDItem__ValueAssignment_1_1"


    // $ANTLR start "rule__RD__LeftAssignment_0"
    // InternalTechnoCat.g:2578:1: rule__RD__LeftAssignment_0 : ( ( ruleEID ) ) ;
    public final void rule__RD__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2582:1: ( ( ( ruleEID ) ) )
            // InternalTechnoCat.g:2583:2: ( ( ruleEID ) )
            {
            // InternalTechnoCat.g:2583:2: ( ( ruleEID ) )
            // InternalTechnoCat.g:2584:3: ( ruleEID )
            {
             before(grammarAccess.getRDAccess().getLeftEDItemCrossReference_0_0()); 
            // InternalTechnoCat.g:2585:3: ( ruleEID )
            // InternalTechnoCat.g:2586:4: ruleEID
            {
             before(grammarAccess.getRDAccess().getLeftEDItemEIDParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEID();

            state._fsp--;

             after(grammarAccess.getRDAccess().getLeftEDItemEIDParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRDAccess().getLeftEDItemCrossReference_0_0()); 

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
    // $ANTLR end "rule__RD__LeftAssignment_0"


    // $ANTLR start "rule__RD__RelationAssignment_1"
    // InternalTechnoCat.g:2597:1: rule__RD__RelationAssignment_1 : ( ( ruleRTID ) ) ;
    public final void rule__RD__RelationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2601:1: ( ( ( ruleRTID ) ) )
            // InternalTechnoCat.g:2602:2: ( ( ruleRTID ) )
            {
            // InternalTechnoCat.g:2602:2: ( ( ruleRTID ) )
            // InternalTechnoCat.g:2603:3: ( ruleRTID )
            {
             before(grammarAccess.getRDAccess().getRelationRTDCrossReference_1_0()); 
            // InternalTechnoCat.g:2604:3: ( ruleRTID )
            // InternalTechnoCat.g:2605:4: ruleRTID
            {
             before(grammarAccess.getRDAccess().getRelationRTDRTIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleRTID();

            state._fsp--;

             after(grammarAccess.getRDAccess().getRelationRTDRTIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRDAccess().getRelationRTDCrossReference_1_0()); 

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
    // $ANTLR end "rule__RD__RelationAssignment_1"


    // $ANTLR start "rule__RD__RightAssignment_2"
    // InternalTechnoCat.g:2616:1: rule__RD__RightAssignment_2 : ( ( ruleEID ) ) ;
    public final void rule__RD__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2620:1: ( ( ( ruleEID ) ) )
            // InternalTechnoCat.g:2621:2: ( ( ruleEID ) )
            {
            // InternalTechnoCat.g:2621:2: ( ( ruleEID ) )
            // InternalTechnoCat.g:2622:3: ( ruleEID )
            {
             before(grammarAccess.getRDAccess().getRightEDItemCrossReference_2_0()); 
            // InternalTechnoCat.g:2623:3: ( ruleEID )
            // InternalTechnoCat.g:2624:4: ruleEID
            {
             before(grammarAccess.getRDAccess().getRightEDItemEIDParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEID();

            state._fsp--;

             after(grammarAccess.getRDAccess().getRightEDItemEIDParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRDAccess().getRightEDItemCrossReference_2_0()); 

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
    // $ANTLR end "rule__RD__RightAssignment_2"


    // $ANTLR start "rule__RD__ValueAssignment_3_1"
    // InternalTechnoCat.g:2635:1: rule__RD__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__RD__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTechnoCat.g:2639:1: ( ( RULE_STRING ) )
            // InternalTechnoCat.g:2640:2: ( RULE_STRING )
            {
            // InternalTechnoCat.g:2640:2: ( RULE_STRING )
            // InternalTechnoCat.g:2641:3: RULE_STRING
            {
             before(grammarAccess.getRDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__RD__ValueAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000980000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000980000000032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000200000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000003FFFFFFFF30L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000000130L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002000000000000L});

}