package org.softlang.megal.language.ide.contentassist.antlr.internal;

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
import org.softlang.megal.language.services.MegalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMegalParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANN_ID", "RULE_STRING", "RULE_VAR_ID", "RULE_INT", "RULE_COMMENT", "RULE_WS", "'model'", "'import'", "'='", "'('", "')'", "'|->'", "'<'", "'as'", "'entity'", "'*'", "'['", "']'", "'->'", "':'", "','", "'from'", "'{'", "'}'", "'(+)'", "'+'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_ANN_ID=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_VAR_ID=7;
    public static final int RULE_COMMENT=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMegalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMegalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMegalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMegal.g"; }


    	private MegalGrammarAccess grammarAccess;

    	public void setGrammarAccess(MegalGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMegalFile"
    // InternalMegal.g:53:1: entryRuleMegalFile : ruleMegalFile EOF ;
    public final void entryRuleMegalFile() throws RecognitionException {
        try {
            // InternalMegal.g:54:1: ( ruleMegalFile EOF )
            // InternalMegal.g:55:1: ruleMegalFile EOF
            {
             before(grammarAccess.getMegalFileRule()); 
            pushFollow(FOLLOW_1);
            ruleMegalFile();

            state._fsp--;

             after(grammarAccess.getMegalFileRule()); 
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
    // $ANTLR end "entryRuleMegalFile"


    // $ANTLR start "ruleMegalFile"
    // InternalMegal.g:62:1: ruleMegalFile : ( ( rule__MegalFile__Group__0 ) ) ;
    public final void ruleMegalFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:66:2: ( ( ( rule__MegalFile__Group__0 ) ) )
            // InternalMegal.g:67:2: ( ( rule__MegalFile__Group__0 ) )
            {
            // InternalMegal.g:67:2: ( ( rule__MegalFile__Group__0 ) )
            // InternalMegal.g:68:3: ( rule__MegalFile__Group__0 )
            {
             before(grammarAccess.getMegalFileAccess().getGroup()); 
            // InternalMegal.g:69:3: ( rule__MegalFile__Group__0 )
            // InternalMegal.g:69:4: rule__MegalFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MegalFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalFile"


    // $ANTLR start "entryRuleMegalAnnotation"
    // InternalMegal.g:78:1: entryRuleMegalAnnotation : ruleMegalAnnotation EOF ;
    public final void entryRuleMegalAnnotation() throws RecognitionException {
        try {
            // InternalMegal.g:79:1: ( ruleMegalAnnotation EOF )
            // InternalMegal.g:80:1: ruleMegalAnnotation EOF
            {
             before(grammarAccess.getMegalAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalAnnotationRule()); 
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
    // $ANTLR end "entryRuleMegalAnnotation"


    // $ANTLR start "ruleMegalAnnotation"
    // InternalMegal.g:87:1: ruleMegalAnnotation : ( ( rule__MegalAnnotation__Group__0 ) ) ;
    public final void ruleMegalAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:91:2: ( ( ( rule__MegalAnnotation__Group__0 ) ) )
            // InternalMegal.g:92:2: ( ( rule__MegalAnnotation__Group__0 ) )
            {
            // InternalMegal.g:92:2: ( ( rule__MegalAnnotation__Group__0 ) )
            // InternalMegal.g:93:3: ( rule__MegalAnnotation__Group__0 )
            {
             before(grammarAccess.getMegalAnnotationAccess().getGroup()); 
            // InternalMegal.g:94:3: ( rule__MegalAnnotation__Group__0 )
            // InternalMegal.g:94:4: rule__MegalAnnotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MegalAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalAnnotation"


    // $ANTLR start "entryRuleMegalLink"
    // InternalMegal.g:103:1: entryRuleMegalLink : ruleMegalLink EOF ;
    public final void entryRuleMegalLink() throws RecognitionException {
        try {
            // InternalMegal.g:104:1: ( ruleMegalLink EOF )
            // InternalMegal.g:105:1: ruleMegalLink EOF
            {
             before(grammarAccess.getMegalLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleMegalLink();

            state._fsp--;

             after(grammarAccess.getMegalLinkRule()); 
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
    // $ANTLR end "entryRuleMegalLink"


    // $ANTLR start "ruleMegalLink"
    // InternalMegal.g:112:1: ruleMegalLink : ( ( rule__MegalLink__Group__0 ) ) ;
    public final void ruleMegalLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:116:2: ( ( ( rule__MegalLink__Group__0 ) ) )
            // InternalMegal.g:117:2: ( ( rule__MegalLink__Group__0 ) )
            {
            // InternalMegal.g:117:2: ( ( rule__MegalLink__Group__0 ) )
            // InternalMegal.g:118:3: ( rule__MegalLink__Group__0 )
            {
             before(grammarAccess.getMegalLinkAccess().getGroup()); 
            // InternalMegal.g:119:3: ( rule__MegalLink__Group__0 )
            // InternalMegal.g:119:4: rule__MegalLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MegalLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalLink"


    // $ANTLR start "entryRuleMegalEntityType"
    // InternalMegal.g:128:1: entryRuleMegalEntityType : ruleMegalEntityType EOF ;
    public final void entryRuleMegalEntityType() throws RecognitionException {
        try {
            // InternalMegal.g:129:1: ( ruleMegalEntityType EOF )
            // InternalMegal.g:130:1: ruleMegalEntityType EOF
            {
             before(grammarAccess.getMegalEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMegalEntityType();

            state._fsp--;

             after(grammarAccess.getMegalEntityTypeRule()); 
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
    // $ANTLR end "entryRuleMegalEntityType"


    // $ANTLR start "ruleMegalEntityType"
    // InternalMegal.g:137:1: ruleMegalEntityType : ( ( rule__MegalEntityType__Group__0 ) ) ;
    public final void ruleMegalEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:141:2: ( ( ( rule__MegalEntityType__Group__0 ) ) )
            // InternalMegal.g:142:2: ( ( rule__MegalEntityType__Group__0 ) )
            {
            // InternalMegal.g:142:2: ( ( rule__MegalEntityType__Group__0 ) )
            // InternalMegal.g:143:3: ( rule__MegalEntityType__Group__0 )
            {
             before(grammarAccess.getMegalEntityTypeAccess().getGroup()); 
            // InternalMegal.g:144:3: ( rule__MegalEntityType__Group__0 )
            // InternalMegal.g:144:4: rule__MegalEntityType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MegalEntityType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalEntityType"


    // $ANTLR start "entryRuleMegalRelationshipType"
    // InternalMegal.g:153:1: entryRuleMegalRelationshipType : ruleMegalRelationshipType EOF ;
    public final void entryRuleMegalRelationshipType() throws RecognitionException {
        try {
            // InternalMegal.g:154:1: ( ruleMegalRelationshipType EOF )
            // InternalMegal.g:155:1: ruleMegalRelationshipType EOF
            {
             before(grammarAccess.getMegalRelationshipTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMegalRelationshipType();

            state._fsp--;

             after(grammarAccess.getMegalRelationshipTypeRule()); 
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
    // $ANTLR end "entryRuleMegalRelationshipType"


    // $ANTLR start "ruleMegalRelationshipType"
    // InternalMegal.g:162:1: ruleMegalRelationshipType : ( ( rule__MegalRelationshipType__Group__0 ) ) ;
    public final void ruleMegalRelationshipType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:166:2: ( ( ( rule__MegalRelationshipType__Group__0 ) ) )
            // InternalMegal.g:167:2: ( ( rule__MegalRelationshipType__Group__0 ) )
            {
            // InternalMegal.g:167:2: ( ( rule__MegalRelationshipType__Group__0 ) )
            // InternalMegal.g:168:3: ( rule__MegalRelationshipType__Group__0 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getGroup()); 
            // InternalMegal.g:169:3: ( rule__MegalRelationshipType__Group__0 )
            // InternalMegal.g:169:4: rule__MegalRelationshipType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalRelationshipType"


    // $ANTLR start "entryRuleMegalEntity"
    // InternalMegal.g:178:1: entryRuleMegalEntity : ruleMegalEntity EOF ;
    public final void entryRuleMegalEntity() throws RecognitionException {
        try {
            // InternalMegal.g:179:1: ( ruleMegalEntity EOF )
            // InternalMegal.g:180:1: ruleMegalEntity EOF
            {
             before(grammarAccess.getMegalEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleMegalEntity();

            state._fsp--;

             after(grammarAccess.getMegalEntityRule()); 
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
    // $ANTLR end "entryRuleMegalEntity"


    // $ANTLR start "ruleMegalEntity"
    // InternalMegal.g:187:1: ruleMegalEntity : ( ( rule__MegalEntity__Group__0 ) ) ;
    public final void ruleMegalEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:191:2: ( ( ( rule__MegalEntity__Group__0 ) ) )
            // InternalMegal.g:192:2: ( ( rule__MegalEntity__Group__0 ) )
            {
            // InternalMegal.g:192:2: ( ( rule__MegalEntity__Group__0 ) )
            // InternalMegal.g:193:3: ( rule__MegalEntity__Group__0 )
            {
             before(grammarAccess.getMegalEntityAccess().getGroup()); 
            // InternalMegal.g:194:3: ( rule__MegalEntity__Group__0 )
            // InternalMegal.g:194:4: rule__MegalEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MegalEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalEntity"


    // $ANTLR start "entryRuleMegalRelationship"
    // InternalMegal.g:203:1: entryRuleMegalRelationship : ruleMegalRelationship EOF ;
    public final void entryRuleMegalRelationship() throws RecognitionException {
        try {
            // InternalMegal.g:204:1: ( ruleMegalRelationship EOF )
            // InternalMegal.g:205:1: ruleMegalRelationship EOF
            {
             before(grammarAccess.getMegalRelationshipRule()); 
            pushFollow(FOLLOW_1);
            ruleMegalRelationship();

            state._fsp--;

             after(grammarAccess.getMegalRelationshipRule()); 
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
    // $ANTLR end "entryRuleMegalRelationship"


    // $ANTLR start "ruleMegalRelationship"
    // InternalMegal.g:212:1: ruleMegalRelationship : ( ( rule__MegalRelationship__Group__0 ) ) ;
    public final void ruleMegalRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:216:2: ( ( ( rule__MegalRelationship__Group__0 ) ) )
            // InternalMegal.g:217:2: ( ( rule__MegalRelationship__Group__0 ) )
            {
            // InternalMegal.g:217:2: ( ( rule__MegalRelationship__Group__0 ) )
            // InternalMegal.g:218:3: ( rule__MegalRelationship__Group__0 )
            {
             before(grammarAccess.getMegalRelationshipAccess().getGroup()); 
            // InternalMegal.g:219:3: ( rule__MegalRelationship__Group__0 )
            // InternalMegal.g:219:4: rule__MegalRelationship__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationship__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalRelationship"


    // $ANTLR start "entryRuleMegalPair"
    // InternalMegal.g:228:1: entryRuleMegalPair : ruleMegalPair EOF ;
    public final void entryRuleMegalPair() throws RecognitionException {
        try {
            // InternalMegal.g:229:1: ( ruleMegalPair EOF )
            // InternalMegal.g:230:1: ruleMegalPair EOF
            {
             before(grammarAccess.getMegalPairRule()); 
            pushFollow(FOLLOW_1);
            ruleMegalPair();

            state._fsp--;

             after(grammarAccess.getMegalPairRule()); 
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
    // $ANTLR end "entryRuleMegalPair"


    // $ANTLR start "ruleMegalPair"
    // InternalMegal.g:237:1: ruleMegalPair : ( ( rule__MegalPair__Group__0 ) ) ;
    public final void ruleMegalPair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:241:2: ( ( ( rule__MegalPair__Group__0 ) ) )
            // InternalMegal.g:242:2: ( ( rule__MegalPair__Group__0 ) )
            {
            // InternalMegal.g:242:2: ( ( rule__MegalPair__Group__0 ) )
            // InternalMegal.g:243:3: ( rule__MegalPair__Group__0 )
            {
             before(grammarAccess.getMegalPairAccess().getGroup()); 
            // InternalMegal.g:244:3: ( rule__MegalPair__Group__0 )
            // InternalMegal.g:244:4: rule__MegalPair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MegalPair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalPairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalPair"


    // $ANTLR start "entryRuleSelection"
    // InternalMegal.g:253:1: entryRuleSelection : ruleSelection EOF ;
    public final void entryRuleSelection() throws RecognitionException {
        try {
            // InternalMegal.g:254:1: ( ruleSelection EOF )
            // InternalMegal.g:255:1: ruleSelection EOF
            {
             before(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSelectionRule()); 
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
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // InternalMegal.g:262:1: ruleSelection : ( ( rule__Selection__Group__0 ) ) ;
    public final void ruleSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:266:2: ( ( ( rule__Selection__Group__0 ) ) )
            // InternalMegal.g:267:2: ( ( rule__Selection__Group__0 ) )
            {
            // InternalMegal.g:267:2: ( ( rule__Selection__Group__0 ) )
            // InternalMegal.g:268:3: ( rule__Selection__Group__0 )
            {
             before(grammarAccess.getSelectionAccess().getGroup()); 
            // InternalMegal.g:269:3: ( rule__Selection__Group__0 )
            // InternalMegal.g:269:4: rule__Selection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleQueryStatement"
    // InternalMegal.g:278:1: entryRuleQueryStatement : ruleQueryStatement EOF ;
    public final void entryRuleQueryStatement() throws RecognitionException {
        try {
            // InternalMegal.g:279:1: ( ruleQueryStatement EOF )
            // InternalMegal.g:280:1: ruleQueryStatement EOF
            {
             before(grammarAccess.getQueryStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryStatement();

            state._fsp--;

             after(grammarAccess.getQueryStatementRule()); 
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
    // $ANTLR end "entryRuleQueryStatement"


    // $ANTLR start "ruleQueryStatement"
    // InternalMegal.g:287:1: ruleQueryStatement : ( ( rule__QueryStatement__Group__0 ) ) ;
    public final void ruleQueryStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:291:2: ( ( ( rule__QueryStatement__Group__0 ) ) )
            // InternalMegal.g:292:2: ( ( rule__QueryStatement__Group__0 ) )
            {
            // InternalMegal.g:292:2: ( ( rule__QueryStatement__Group__0 ) )
            // InternalMegal.g:293:3: ( rule__QueryStatement__Group__0 )
            {
             before(grammarAccess.getQueryStatementAccess().getGroup()); 
            // InternalMegal.g:294:3: ( rule__QueryStatement__Group__0 )
            // InternalMegal.g:294:4: rule__QueryStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryStatement"


    // $ANTLR start "entryRuleQueryDefEntry"
    // InternalMegal.g:303:1: entryRuleQueryDefEntry : ruleQueryDefEntry EOF ;
    public final void entryRuleQueryDefEntry() throws RecognitionException {
        try {
            // InternalMegal.g:304:1: ( ruleQueryDefEntry EOF )
            // InternalMegal.g:305:1: ruleQueryDefEntry EOF
            {
             before(grammarAccess.getQueryDefEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryDefEntry();

            state._fsp--;

             after(grammarAccess.getQueryDefEntryRule()); 
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
    // $ANTLR end "entryRuleQueryDefEntry"


    // $ANTLR start "ruleQueryDefEntry"
    // InternalMegal.g:312:1: ruleQueryDefEntry : ( ( rule__QueryDefEntry__Alternatives ) ) ;
    public final void ruleQueryDefEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:316:2: ( ( ( rule__QueryDefEntry__Alternatives ) ) )
            // InternalMegal.g:317:2: ( ( rule__QueryDefEntry__Alternatives ) )
            {
            // InternalMegal.g:317:2: ( ( rule__QueryDefEntry__Alternatives ) )
            // InternalMegal.g:318:3: ( rule__QueryDefEntry__Alternatives )
            {
             before(grammarAccess.getQueryDefEntryAccess().getAlternatives()); 
            // InternalMegal.g:319:3: ( rule__QueryDefEntry__Alternatives )
            // InternalMegal.g:319:4: rule__QueryDefEntry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QueryDefEntry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQueryDefEntryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryDefEntry"


    // $ANTLR start "entryRuleQueryRefEntry"
    // InternalMegal.g:328:1: entryRuleQueryRefEntry : ruleQueryRefEntry EOF ;
    public final void entryRuleQueryRefEntry() throws RecognitionException {
        try {
            // InternalMegal.g:329:1: ( ruleQueryRefEntry EOF )
            // InternalMegal.g:330:1: ruleQueryRefEntry EOF
            {
             before(grammarAccess.getQueryRefEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryRefEntry();

            state._fsp--;

             after(grammarAccess.getQueryRefEntryRule()); 
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
    // $ANTLR end "entryRuleQueryRefEntry"


    // $ANTLR start "ruleQueryRefEntry"
    // InternalMegal.g:337:1: ruleQueryRefEntry : ( ( rule__QueryRefEntry__Alternatives ) ) ;
    public final void ruleQueryRefEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:341:2: ( ( ( rule__QueryRefEntry__Alternatives ) ) )
            // InternalMegal.g:342:2: ( ( rule__QueryRefEntry__Alternatives ) )
            {
            // InternalMegal.g:342:2: ( ( rule__QueryRefEntry__Alternatives ) )
            // InternalMegal.g:343:3: ( rule__QueryRefEntry__Alternatives )
            {
             before(grammarAccess.getQueryRefEntryAccess().getAlternatives()); 
            // InternalMegal.g:344:3: ( rule__QueryRefEntry__Alternatives )
            // InternalMegal.g:344:4: rule__QueryRefEntry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QueryRefEntry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQueryRefEntryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryRefEntry"


    // $ANTLR start "entryRuleQueryParam"
    // InternalMegal.g:353:1: entryRuleQueryParam : ruleQueryParam EOF ;
    public final void entryRuleQueryParam() throws RecognitionException {
        try {
            // InternalMegal.g:354:1: ( ruleQueryParam EOF )
            // InternalMegal.g:355:1: ruleQueryParam EOF
            {
             before(grammarAccess.getQueryParamRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryParam();

            state._fsp--;

             after(grammarAccess.getQueryParamRule()); 
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
    // $ANTLR end "entryRuleQueryParam"


    // $ANTLR start "ruleQueryParam"
    // InternalMegal.g:362:1: ruleQueryParam : ( ( rule__QueryParam__Group__0 ) ) ;
    public final void ruleQueryParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:366:2: ( ( ( rule__QueryParam__Group__0 ) ) )
            // InternalMegal.g:367:2: ( ( rule__QueryParam__Group__0 ) )
            {
            // InternalMegal.g:367:2: ( ( rule__QueryParam__Group__0 ) )
            // InternalMegal.g:368:3: ( rule__QueryParam__Group__0 )
            {
             before(grammarAccess.getQueryParamAccess().getGroup()); 
            // InternalMegal.g:369:3: ( rule__QueryParam__Group__0 )
            // InternalMegal.g:369:4: rule__QueryParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryParam"


    // $ANTLR start "entryRuleQueryReference"
    // InternalMegal.g:378:1: entryRuleQueryReference : ruleQueryReference EOF ;
    public final void entryRuleQueryReference() throws RecognitionException {
        try {
            // InternalMegal.g:379:1: ( ruleQueryReference EOF )
            // InternalMegal.g:380:1: ruleQueryReference EOF
            {
             before(grammarAccess.getQueryReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryReference();

            state._fsp--;

             after(grammarAccess.getQueryReferenceRule()); 
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
    // $ANTLR end "entryRuleQueryReference"


    // $ANTLR start "ruleQueryReference"
    // InternalMegal.g:387:1: ruleQueryReference : ( ( rule__QueryReference__RefAssignment ) ) ;
    public final void ruleQueryReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:391:2: ( ( ( rule__QueryReference__RefAssignment ) ) )
            // InternalMegal.g:392:2: ( ( rule__QueryReference__RefAssignment ) )
            {
            // InternalMegal.g:392:2: ( ( rule__QueryReference__RefAssignment ) )
            // InternalMegal.g:393:3: ( rule__QueryReference__RefAssignment )
            {
             before(grammarAccess.getQueryReferenceAccess().getRefAssignment()); 
            // InternalMegal.g:394:3: ( rule__QueryReference__RefAssignment )
            // InternalMegal.g:394:4: rule__QueryReference__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__QueryReference__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQueryReferenceAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryReference"


    // $ANTLR start "entryRuleQueryString"
    // InternalMegal.g:403:1: entryRuleQueryString : ruleQueryString EOF ;
    public final void entryRuleQueryString() throws RecognitionException {
        try {
            // InternalMegal.g:404:1: ( ruleQueryString EOF )
            // InternalMegal.g:405:1: ruleQueryString EOF
            {
             before(grammarAccess.getQueryStringRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryString();

            state._fsp--;

             after(grammarAccess.getQueryStringRule()); 
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
    // $ANTLR end "entryRuleQueryString"


    // $ANTLR start "ruleQueryString"
    // InternalMegal.g:412:1: ruleQueryString : ( ( rule__QueryString__ValueAssignment ) ) ;
    public final void ruleQueryString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:416:2: ( ( ( rule__QueryString__ValueAssignment ) ) )
            // InternalMegal.g:417:2: ( ( rule__QueryString__ValueAssignment ) )
            {
            // InternalMegal.g:417:2: ( ( rule__QueryString__ValueAssignment ) )
            // InternalMegal.g:418:3: ( rule__QueryString__ValueAssignment )
            {
             before(grammarAccess.getQueryStringAccess().getValueAssignment()); 
            // InternalMegal.g:419:3: ( rule__QueryString__ValueAssignment )
            // InternalMegal.g:419:4: rule__QueryString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__QueryString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQueryStringAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryString"


    // $ANTLR start "entryRuleQueryEntity"
    // InternalMegal.g:428:1: entryRuleQueryEntity : ruleQueryEntity EOF ;
    public final void entryRuleQueryEntity() throws RecognitionException {
        try {
            // InternalMegal.g:429:1: ( ruleQueryEntity EOF )
            // InternalMegal.g:430:1: ruleQueryEntity EOF
            {
             before(grammarAccess.getQueryEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryEntity();

            state._fsp--;

             after(grammarAccess.getQueryEntityRule()); 
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
    // $ANTLR end "entryRuleQueryEntity"


    // $ANTLR start "ruleQueryEntity"
    // InternalMegal.g:437:1: ruleQueryEntity : ( ( rule__QueryEntity__EntityAssignment ) ) ;
    public final void ruleQueryEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:441:2: ( ( ( rule__QueryEntity__EntityAssignment ) ) )
            // InternalMegal.g:442:2: ( ( rule__QueryEntity__EntityAssignment ) )
            {
            // InternalMegal.g:442:2: ( ( rule__QueryEntity__EntityAssignment ) )
            // InternalMegal.g:443:3: ( rule__QueryEntity__EntityAssignment )
            {
             before(grammarAccess.getQueryEntityAccess().getEntityAssignment()); 
            // InternalMegal.g:444:3: ( rule__QueryEntity__EntityAssignment )
            // InternalMegal.g:444:4: rule__QueryEntity__EntityAssignment
            {
            pushFollow(FOLLOW_2);
            rule__QueryEntity__EntityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQueryEntityAccess().getEntityAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryEntity"


    // $ANTLR start "entryRuleQueryPos"
    // InternalMegal.g:453:1: entryRuleQueryPos : ruleQueryPos EOF ;
    public final void entryRuleQueryPos() throws RecognitionException {
        try {
            // InternalMegal.g:454:1: ( ruleQueryPos EOF )
            // InternalMegal.g:455:1: ruleQueryPos EOF
            {
             before(grammarAccess.getQueryPosRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryPos();

            state._fsp--;

             after(grammarAccess.getQueryPosRule()); 
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
    // $ANTLR end "entryRuleQueryPos"


    // $ANTLR start "ruleQueryPos"
    // InternalMegal.g:462:1: ruleQueryPos : ( ( rule__QueryPos__Group__0 ) ) ;
    public final void ruleQueryPos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:466:2: ( ( ( rule__QueryPos__Group__0 ) ) )
            // InternalMegal.g:467:2: ( ( rule__QueryPos__Group__0 ) )
            {
            // InternalMegal.g:467:2: ( ( rule__QueryPos__Group__0 ) )
            // InternalMegal.g:468:3: ( rule__QueryPos__Group__0 )
            {
             before(grammarAccess.getQueryPosAccess().getGroup()); 
            // InternalMegal.g:469:3: ( rule__QueryPos__Group__0 )
            // InternalMegal.g:469:4: rule__QueryPos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryPos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryPosAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryPos"


    // $ANTLR start "rule__MegalFile__Alternatives_3"
    // InternalMegal.g:477:1: rule__MegalFile__Alternatives_3 : ( ( ( rule__MegalFile__Group_3_0__0 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_1 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_2 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_3 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_4 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_5 ) ) | ( ( rule__MegalFile__BindingsAssignment_3_6 ) ) );
    public final void rule__MegalFile__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:481:1: ( ( ( rule__MegalFile__Group_3_0__0 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_1 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_2 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_3 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_4 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_5 ) ) | ( ( rule__MegalFile__BindingsAssignment_3_6 ) ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMegal.g:482:2: ( ( rule__MegalFile__Group_3_0__0 ) )
                    {
                    // InternalMegal.g:482:2: ( ( rule__MegalFile__Group_3_0__0 ) )
                    // InternalMegal.g:483:3: ( rule__MegalFile__Group_3_0__0 )
                    {
                     before(grammarAccess.getMegalFileAccess().getGroup_3_0()); 
                    // InternalMegal.g:484:3: ( rule__MegalFile__Group_3_0__0 )
                    // InternalMegal.g:484:4: rule__MegalFile__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalFile__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalFileAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMegal.g:488:2: ( ( rule__MegalFile__DeclarationsAssignment_3_1 ) )
                    {
                    // InternalMegal.g:488:2: ( ( rule__MegalFile__DeclarationsAssignment_3_1 ) )
                    // InternalMegal.g:489:3: ( rule__MegalFile__DeclarationsAssignment_3_1 )
                    {
                     before(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_1()); 
                    // InternalMegal.g:490:3: ( rule__MegalFile__DeclarationsAssignment_3_1 )
                    // InternalMegal.g:490:4: rule__MegalFile__DeclarationsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalFile__DeclarationsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMegal.g:494:2: ( ( rule__MegalFile__DeclarationsAssignment_3_2 ) )
                    {
                    // InternalMegal.g:494:2: ( ( rule__MegalFile__DeclarationsAssignment_3_2 ) )
                    // InternalMegal.g:495:3: ( rule__MegalFile__DeclarationsAssignment_3_2 )
                    {
                     before(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_2()); 
                    // InternalMegal.g:496:3: ( rule__MegalFile__DeclarationsAssignment_3_2 )
                    // InternalMegal.g:496:4: rule__MegalFile__DeclarationsAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalFile__DeclarationsAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMegal.g:500:2: ( ( rule__MegalFile__DeclarationsAssignment_3_3 ) )
                    {
                    // InternalMegal.g:500:2: ( ( rule__MegalFile__DeclarationsAssignment_3_3 ) )
                    // InternalMegal.g:501:3: ( rule__MegalFile__DeclarationsAssignment_3_3 )
                    {
                     before(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_3()); 
                    // InternalMegal.g:502:3: ( rule__MegalFile__DeclarationsAssignment_3_3 )
                    // InternalMegal.g:502:4: rule__MegalFile__DeclarationsAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalFile__DeclarationsAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMegal.g:506:2: ( ( rule__MegalFile__DeclarationsAssignment_3_4 ) )
                    {
                    // InternalMegal.g:506:2: ( ( rule__MegalFile__DeclarationsAssignment_3_4 ) )
                    // InternalMegal.g:507:3: ( rule__MegalFile__DeclarationsAssignment_3_4 )
                    {
                     before(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_4()); 
                    // InternalMegal.g:508:3: ( rule__MegalFile__DeclarationsAssignment_3_4 )
                    // InternalMegal.g:508:4: rule__MegalFile__DeclarationsAssignment_3_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalFile__DeclarationsAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMegal.g:512:2: ( ( rule__MegalFile__DeclarationsAssignment_3_5 ) )
                    {
                    // InternalMegal.g:512:2: ( ( rule__MegalFile__DeclarationsAssignment_3_5 ) )
                    // InternalMegal.g:513:3: ( rule__MegalFile__DeclarationsAssignment_3_5 )
                    {
                     before(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_5()); 
                    // InternalMegal.g:514:3: ( rule__MegalFile__DeclarationsAssignment_3_5 )
                    // InternalMegal.g:514:4: rule__MegalFile__DeclarationsAssignment_3_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalFile__DeclarationsAssignment_3_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMegal.g:518:2: ( ( rule__MegalFile__BindingsAssignment_3_6 ) )
                    {
                    // InternalMegal.g:518:2: ( ( rule__MegalFile__BindingsAssignment_3_6 ) )
                    // InternalMegal.g:519:3: ( rule__MegalFile__BindingsAssignment_3_6 )
                    {
                     before(grammarAccess.getMegalFileAccess().getBindingsAssignment_3_6()); 
                    // InternalMegal.g:520:3: ( rule__MegalFile__BindingsAssignment_3_6 )
                    // InternalMegal.g:520:4: rule__MegalFile__BindingsAssignment_3_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalFile__BindingsAssignment_3_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalFileAccess().getBindingsAssignment_3_6()); 

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
    // $ANTLR end "rule__MegalFile__Alternatives_3"


    // $ANTLR start "rule__MegalEntityType__Alternatives_2"
    // InternalMegal.g:528:1: rule__MegalEntityType__Alternatives_2 : ( ( ( rule__MegalEntityType__Group_2_0__0 ) ) | ( ( rule__MegalEntityType__Group_2_1__0 ) ) );
    public final void rule__MegalEntityType__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:532:1: ( ( ( rule__MegalEntityType__Group_2_0__0 ) ) | ( ( rule__MegalEntityType__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMegal.g:533:2: ( ( rule__MegalEntityType__Group_2_0__0 ) )
                    {
                    // InternalMegal.g:533:2: ( ( rule__MegalEntityType__Group_2_0__0 ) )
                    // InternalMegal.g:534:3: ( rule__MegalEntityType__Group_2_0__0 )
                    {
                     before(grammarAccess.getMegalEntityTypeAccess().getGroup_2_0()); 
                    // InternalMegal.g:535:3: ( rule__MegalEntityType__Group_2_0__0 )
                    // InternalMegal.g:535:4: rule__MegalEntityType__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalEntityType__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalEntityTypeAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMegal.g:539:2: ( ( rule__MegalEntityType__Group_2_1__0 ) )
                    {
                    // InternalMegal.g:539:2: ( ( rule__MegalEntityType__Group_2_1__0 ) )
                    // InternalMegal.g:540:3: ( rule__MegalEntityType__Group_2_1__0 )
                    {
                     before(grammarAccess.getMegalEntityTypeAccess().getGroup_2_1()); 
                    // InternalMegal.g:541:3: ( rule__MegalEntityType__Group_2_1__0 )
                    // InternalMegal.g:541:4: rule__MegalEntityType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalEntityType__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalEntityTypeAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__MegalEntityType__Alternatives_2"


    // $ANTLR start "rule__MegalRelationshipType__Alternatives_5"
    // InternalMegal.g:549:1: rule__MegalRelationshipType__Alternatives_5 : ( ( ( rule__MegalRelationshipType__LeftBothAssignment_5_0 ) ) | ( ( rule__MegalRelationshipType__LeftManyAssignment_5_1 ) ) );
    public final void rule__MegalRelationshipType__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:553:1: ( ( ( rule__MegalRelationshipType__LeftBothAssignment_5_0 ) ) | ( ( rule__MegalRelationshipType__LeftManyAssignment_5_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==30) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMegal.g:554:2: ( ( rule__MegalRelationshipType__LeftBothAssignment_5_0 ) )
                    {
                    // InternalMegal.g:554:2: ( ( rule__MegalRelationshipType__LeftBothAssignment_5_0 ) )
                    // InternalMegal.g:555:3: ( rule__MegalRelationshipType__LeftBothAssignment_5_0 )
                    {
                     before(grammarAccess.getMegalRelationshipTypeAccess().getLeftBothAssignment_5_0()); 
                    // InternalMegal.g:556:3: ( rule__MegalRelationshipType__LeftBothAssignment_5_0 )
                    // InternalMegal.g:556:4: rule__MegalRelationshipType__LeftBothAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalRelationshipType__LeftBothAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalRelationshipTypeAccess().getLeftBothAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMegal.g:560:2: ( ( rule__MegalRelationshipType__LeftManyAssignment_5_1 ) )
                    {
                    // InternalMegal.g:560:2: ( ( rule__MegalRelationshipType__LeftManyAssignment_5_1 ) )
                    // InternalMegal.g:561:3: ( rule__MegalRelationshipType__LeftManyAssignment_5_1 )
                    {
                     before(grammarAccess.getMegalRelationshipTypeAccess().getLeftManyAssignment_5_1()); 
                    // InternalMegal.g:562:3: ( rule__MegalRelationshipType__LeftManyAssignment_5_1 )
                    // InternalMegal.g:562:4: rule__MegalRelationshipType__LeftManyAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalRelationshipType__LeftManyAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalRelationshipTypeAccess().getLeftManyAssignment_5_1()); 

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
    // $ANTLR end "rule__MegalRelationshipType__Alternatives_5"


    // $ANTLR start "rule__MegalRelationshipType__Alternatives_9"
    // InternalMegal.g:570:1: rule__MegalRelationshipType__Alternatives_9 : ( ( ( rule__MegalRelationshipType__RightBothAssignment_9_0 ) ) | ( ( rule__MegalRelationshipType__RightManyAssignment_9_1 ) ) );
    public final void rule__MegalRelationshipType__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:574:1: ( ( ( rule__MegalRelationshipType__RightBothAssignment_9_0 ) ) | ( ( rule__MegalRelationshipType__RightManyAssignment_9_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMegal.g:575:2: ( ( rule__MegalRelationshipType__RightBothAssignment_9_0 ) )
                    {
                    // InternalMegal.g:575:2: ( ( rule__MegalRelationshipType__RightBothAssignment_9_0 ) )
                    // InternalMegal.g:576:3: ( rule__MegalRelationshipType__RightBothAssignment_9_0 )
                    {
                     before(grammarAccess.getMegalRelationshipTypeAccess().getRightBothAssignment_9_0()); 
                    // InternalMegal.g:577:3: ( rule__MegalRelationshipType__RightBothAssignment_9_0 )
                    // InternalMegal.g:577:4: rule__MegalRelationshipType__RightBothAssignment_9_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalRelationshipType__RightBothAssignment_9_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalRelationshipTypeAccess().getRightBothAssignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMegal.g:581:2: ( ( rule__MegalRelationshipType__RightManyAssignment_9_1 ) )
                    {
                    // InternalMegal.g:581:2: ( ( rule__MegalRelationshipType__RightManyAssignment_9_1 ) )
                    // InternalMegal.g:582:3: ( rule__MegalRelationshipType__RightManyAssignment_9_1 )
                    {
                     before(grammarAccess.getMegalRelationshipTypeAccess().getRightManyAssignment_9_1()); 
                    // InternalMegal.g:583:3: ( rule__MegalRelationshipType__RightManyAssignment_9_1 )
                    // InternalMegal.g:583:4: rule__MegalRelationshipType__RightManyAssignment_9_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalRelationshipType__RightManyAssignment_9_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalRelationshipTypeAccess().getRightManyAssignment_9_1()); 

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
    // $ANTLR end "rule__MegalRelationshipType__Alternatives_9"


    // $ANTLR start "rule__QueryDefEntry__Alternatives"
    // InternalMegal.g:591:1: rule__QueryDefEntry__Alternatives : ( ( ruleQueryParam ) | ( ruleQueryString ) | ( ruleQueryEntity ) | ( ruleQueryPos ) );
    public final void rule__QueryDefEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:595:1: ( ( ruleQueryParam ) | ( ruleQueryString ) | ( ruleQueryEntity ) | ( ruleQueryPos ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_VAR_ID:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMegal.g:596:2: ( ruleQueryParam )
                    {
                    // InternalMegal.g:596:2: ( ruleQueryParam )
                    // InternalMegal.g:597:3: ruleQueryParam
                    {
                     before(grammarAccess.getQueryDefEntryAccess().getQueryParamParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQueryParam();

                    state._fsp--;

                     after(grammarAccess.getQueryDefEntryAccess().getQueryParamParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMegal.g:602:2: ( ruleQueryString )
                    {
                    // InternalMegal.g:602:2: ( ruleQueryString )
                    // InternalMegal.g:603:3: ruleQueryString
                    {
                     before(grammarAccess.getQueryDefEntryAccess().getQueryStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQueryString();

                    state._fsp--;

                     after(grammarAccess.getQueryDefEntryAccess().getQueryStringParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMegal.g:608:2: ( ruleQueryEntity )
                    {
                    // InternalMegal.g:608:2: ( ruleQueryEntity )
                    // InternalMegal.g:609:3: ruleQueryEntity
                    {
                     before(grammarAccess.getQueryDefEntryAccess().getQueryEntityParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleQueryEntity();

                    state._fsp--;

                     after(grammarAccess.getQueryDefEntryAccess().getQueryEntityParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMegal.g:614:2: ( ruleQueryPos )
                    {
                    // InternalMegal.g:614:2: ( ruleQueryPos )
                    // InternalMegal.g:615:3: ruleQueryPos
                    {
                     before(grammarAccess.getQueryDefEntryAccess().getQueryPosParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleQueryPos();

                    state._fsp--;

                     after(grammarAccess.getQueryDefEntryAccess().getQueryPosParserRuleCall_3()); 

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
    // $ANTLR end "rule__QueryDefEntry__Alternatives"


    // $ANTLR start "rule__QueryRefEntry__Alternatives"
    // InternalMegal.g:624:1: rule__QueryRefEntry__Alternatives : ( ( ruleQueryReference ) | ( ruleQueryString ) | ( ruleQueryEntity ) | ( ruleQueryPos ) );
    public final void rule__QueryRefEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:628:1: ( ( ruleQueryReference ) | ( ruleQueryString ) | ( ruleQueryEntity ) | ( ruleQueryPos ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_VAR_ID:
                {
                alt6=1;
                }
                break;
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMegal.g:629:2: ( ruleQueryReference )
                    {
                    // InternalMegal.g:629:2: ( ruleQueryReference )
                    // InternalMegal.g:630:3: ruleQueryReference
                    {
                     before(grammarAccess.getQueryRefEntryAccess().getQueryReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQueryReference();

                    state._fsp--;

                     after(grammarAccess.getQueryRefEntryAccess().getQueryReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMegal.g:635:2: ( ruleQueryString )
                    {
                    // InternalMegal.g:635:2: ( ruleQueryString )
                    // InternalMegal.g:636:3: ruleQueryString
                    {
                     before(grammarAccess.getQueryRefEntryAccess().getQueryStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQueryString();

                    state._fsp--;

                     after(grammarAccess.getQueryRefEntryAccess().getQueryStringParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMegal.g:641:2: ( ruleQueryEntity )
                    {
                    // InternalMegal.g:641:2: ( ruleQueryEntity )
                    // InternalMegal.g:642:3: ruleQueryEntity
                    {
                     before(grammarAccess.getQueryRefEntryAccess().getQueryEntityParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleQueryEntity();

                    state._fsp--;

                     after(grammarAccess.getQueryRefEntryAccess().getQueryEntityParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMegal.g:647:2: ( ruleQueryPos )
                    {
                    // InternalMegal.g:647:2: ( ruleQueryPos )
                    // InternalMegal.g:648:3: ruleQueryPos
                    {
                     before(grammarAccess.getQueryRefEntryAccess().getQueryPosParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleQueryPos();

                    state._fsp--;

                     after(grammarAccess.getQueryRefEntryAccess().getQueryPosParserRuleCall_3()); 

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
    // $ANTLR end "rule__QueryRefEntry__Alternatives"


    // $ANTLR start "rule__MegalFile__Group__0"
    // InternalMegal.g:657:1: rule__MegalFile__Group__0 : rule__MegalFile__Group__0__Impl rule__MegalFile__Group__1 ;
    public final void rule__MegalFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:661:1: ( rule__MegalFile__Group__0__Impl rule__MegalFile__Group__1 )
            // InternalMegal.g:662:2: rule__MegalFile__Group__0__Impl rule__MegalFile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MegalFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalFile__Group__1();

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
    // $ANTLR end "rule__MegalFile__Group__0"


    // $ANTLR start "rule__MegalFile__Group__0__Impl"
    // InternalMegal.g:669:1: rule__MegalFile__Group__0__Impl : ( ( rule__MegalFile__AnnotationsAssignment_0 )* ) ;
    public final void rule__MegalFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:673:1: ( ( ( rule__MegalFile__AnnotationsAssignment_0 )* ) )
            // InternalMegal.g:674:1: ( ( rule__MegalFile__AnnotationsAssignment_0 )* )
            {
            // InternalMegal.g:674:1: ( ( rule__MegalFile__AnnotationsAssignment_0 )* )
            // InternalMegal.g:675:2: ( rule__MegalFile__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getMegalFileAccess().getAnnotationsAssignment_0()); 
            // InternalMegal.g:676:2: ( rule__MegalFile__AnnotationsAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ANN_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMegal.g:676:3: rule__MegalFile__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MegalFile__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMegalFileAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group__0__Impl"


    // $ANTLR start "rule__MegalFile__Group__1"
    // InternalMegal.g:684:1: rule__MegalFile__Group__1 : rule__MegalFile__Group__1__Impl rule__MegalFile__Group__2 ;
    public final void rule__MegalFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:688:1: ( rule__MegalFile__Group__1__Impl rule__MegalFile__Group__2 )
            // InternalMegal.g:689:2: rule__MegalFile__Group__1__Impl rule__MegalFile__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MegalFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalFile__Group__2();

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
    // $ANTLR end "rule__MegalFile__Group__1"


    // $ANTLR start "rule__MegalFile__Group__1__Impl"
    // InternalMegal.g:696:1: rule__MegalFile__Group__1__Impl : ( 'model' ) ;
    public final void rule__MegalFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:700:1: ( ( 'model' ) )
            // InternalMegal.g:701:1: ( 'model' )
            {
            // InternalMegal.g:701:1: ( 'model' )
            // InternalMegal.g:702:2: 'model'
            {
             before(grammarAccess.getMegalFileAccess().getModelKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMegalFileAccess().getModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group__1__Impl"


    // $ANTLR start "rule__MegalFile__Group__2"
    // InternalMegal.g:711:1: rule__MegalFile__Group__2 : rule__MegalFile__Group__2__Impl rule__MegalFile__Group__3 ;
    public final void rule__MegalFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:715:1: ( rule__MegalFile__Group__2__Impl rule__MegalFile__Group__3 )
            // InternalMegal.g:716:2: rule__MegalFile__Group__2__Impl rule__MegalFile__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MegalFile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalFile__Group__3();

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
    // $ANTLR end "rule__MegalFile__Group__2"


    // $ANTLR start "rule__MegalFile__Group__2__Impl"
    // InternalMegal.g:723:1: rule__MegalFile__Group__2__Impl : ( ( rule__MegalFile__NameAssignment_2 ) ) ;
    public final void rule__MegalFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:727:1: ( ( ( rule__MegalFile__NameAssignment_2 ) ) )
            // InternalMegal.g:728:1: ( ( rule__MegalFile__NameAssignment_2 ) )
            {
            // InternalMegal.g:728:1: ( ( rule__MegalFile__NameAssignment_2 ) )
            // InternalMegal.g:729:2: ( rule__MegalFile__NameAssignment_2 )
            {
             before(grammarAccess.getMegalFileAccess().getNameAssignment_2()); 
            // InternalMegal.g:730:2: ( rule__MegalFile__NameAssignment_2 )
            // InternalMegal.g:730:3: rule__MegalFile__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MegalFile__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMegalFileAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group__2__Impl"


    // $ANTLR start "rule__MegalFile__Group__3"
    // InternalMegal.g:738:1: rule__MegalFile__Group__3 : rule__MegalFile__Group__3__Impl ;
    public final void rule__MegalFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:742:1: ( rule__MegalFile__Group__3__Impl )
            // InternalMegal.g:743:2: rule__MegalFile__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalFile__Group__3__Impl();

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
    // $ANTLR end "rule__MegalFile__Group__3"


    // $ANTLR start "rule__MegalFile__Group__3__Impl"
    // InternalMegal.g:749:1: rule__MegalFile__Group__3__Impl : ( ( rule__MegalFile__Alternatives_3 )* ) ;
    public final void rule__MegalFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:753:1: ( ( ( rule__MegalFile__Alternatives_3 )* ) )
            // InternalMegal.g:754:1: ( ( rule__MegalFile__Alternatives_3 )* )
            {
            // InternalMegal.g:754:1: ( ( rule__MegalFile__Alternatives_3 )* )
            // InternalMegal.g:755:2: ( rule__MegalFile__Alternatives_3 )*
            {
             before(grammarAccess.getMegalFileAccess().getAlternatives_3()); 
            // InternalMegal.g:756:2: ( rule__MegalFile__Alternatives_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_ANN_ID)||LA8_0==12) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMegal.g:756:3: rule__MegalFile__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__MegalFile__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMegalFileAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group__3__Impl"


    // $ANTLR start "rule__MegalFile__Group_3_0__0"
    // InternalMegal.g:765:1: rule__MegalFile__Group_3_0__0 : rule__MegalFile__Group_3_0__0__Impl rule__MegalFile__Group_3_0__1 ;
    public final void rule__MegalFile__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:769:1: ( rule__MegalFile__Group_3_0__0__Impl rule__MegalFile__Group_3_0__1 )
            // InternalMegal.g:770:2: rule__MegalFile__Group_3_0__0__Impl rule__MegalFile__Group_3_0__1
            {
            pushFollow(FOLLOW_5);
            rule__MegalFile__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalFile__Group_3_0__1();

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
    // $ANTLR end "rule__MegalFile__Group_3_0__0"


    // $ANTLR start "rule__MegalFile__Group_3_0__0__Impl"
    // InternalMegal.g:777:1: rule__MegalFile__Group_3_0__0__Impl : ( 'import' ) ;
    public final void rule__MegalFile__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:781:1: ( ( 'import' ) )
            // InternalMegal.g:782:1: ( 'import' )
            {
            // InternalMegal.g:782:1: ( 'import' )
            // InternalMegal.g:783:2: 'import'
            {
             before(grammarAccess.getMegalFileAccess().getImportKeyword_3_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMegalFileAccess().getImportKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group_3_0__0__Impl"


    // $ANTLR start "rule__MegalFile__Group_3_0__1"
    // InternalMegal.g:792:1: rule__MegalFile__Group_3_0__1 : rule__MegalFile__Group_3_0__1__Impl ;
    public final void rule__MegalFile__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:796:1: ( rule__MegalFile__Group_3_0__1__Impl )
            // InternalMegal.g:797:2: rule__MegalFile__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalFile__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__MegalFile__Group_3_0__1"


    // $ANTLR start "rule__MegalFile__Group_3_0__1__Impl"
    // InternalMegal.g:803:1: rule__MegalFile__Group_3_0__1__Impl : ( ( rule__MegalFile__ImportsAssignment_3_0_1 ) ) ;
    public final void rule__MegalFile__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:807:1: ( ( ( rule__MegalFile__ImportsAssignment_3_0_1 ) ) )
            // InternalMegal.g:808:1: ( ( rule__MegalFile__ImportsAssignment_3_0_1 ) )
            {
            // InternalMegal.g:808:1: ( ( rule__MegalFile__ImportsAssignment_3_0_1 ) )
            // InternalMegal.g:809:2: ( rule__MegalFile__ImportsAssignment_3_0_1 )
            {
             before(grammarAccess.getMegalFileAccess().getImportsAssignment_3_0_1()); 
            // InternalMegal.g:810:2: ( rule__MegalFile__ImportsAssignment_3_0_1 )
            // InternalMegal.g:810:3: rule__MegalFile__ImportsAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MegalFile__ImportsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalFileAccess().getImportsAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group_3_0__1__Impl"


    // $ANTLR start "rule__MegalAnnotation__Group__0"
    // InternalMegal.g:819:1: rule__MegalAnnotation__Group__0 : rule__MegalAnnotation__Group__0__Impl rule__MegalAnnotation__Group__1 ;
    public final void rule__MegalAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:823:1: ( rule__MegalAnnotation__Group__0__Impl rule__MegalAnnotation__Group__1 )
            // InternalMegal.g:824:2: rule__MegalAnnotation__Group__0__Impl rule__MegalAnnotation__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MegalAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalAnnotation__Group__1();

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
    // $ANTLR end "rule__MegalAnnotation__Group__0"


    // $ANTLR start "rule__MegalAnnotation__Group__0__Impl"
    // InternalMegal.g:831:1: rule__MegalAnnotation__Group__0__Impl : ( ( rule__MegalAnnotation__KeyAssignment_0 ) ) ;
    public final void rule__MegalAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:835:1: ( ( ( rule__MegalAnnotation__KeyAssignment_0 ) ) )
            // InternalMegal.g:836:1: ( ( rule__MegalAnnotation__KeyAssignment_0 ) )
            {
            // InternalMegal.g:836:1: ( ( rule__MegalAnnotation__KeyAssignment_0 ) )
            // InternalMegal.g:837:2: ( rule__MegalAnnotation__KeyAssignment_0 )
            {
             before(grammarAccess.getMegalAnnotationAccess().getKeyAssignment_0()); 
            // InternalMegal.g:838:2: ( rule__MegalAnnotation__KeyAssignment_0 )
            // InternalMegal.g:838:3: rule__MegalAnnotation__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MegalAnnotation__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMegalAnnotationAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalAnnotation__Group__0__Impl"


    // $ANTLR start "rule__MegalAnnotation__Group__1"
    // InternalMegal.g:846:1: rule__MegalAnnotation__Group__1 : rule__MegalAnnotation__Group__1__Impl ;
    public final void rule__MegalAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:850:1: ( rule__MegalAnnotation__Group__1__Impl )
            // InternalMegal.g:851:2: rule__MegalAnnotation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalAnnotation__Group__1__Impl();

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
    // $ANTLR end "rule__MegalAnnotation__Group__1"


    // $ANTLR start "rule__MegalAnnotation__Group__1__Impl"
    // InternalMegal.g:857:1: rule__MegalAnnotation__Group__1__Impl : ( ( rule__MegalAnnotation__SelectionAssignment_1 )? ) ;
    public final void rule__MegalAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:861:1: ( ( ( rule__MegalAnnotation__SelectionAssignment_1 )? ) )
            // InternalMegal.g:862:1: ( ( rule__MegalAnnotation__SelectionAssignment_1 )? )
            {
            // InternalMegal.g:862:1: ( ( rule__MegalAnnotation__SelectionAssignment_1 )? )
            // InternalMegal.g:863:2: ( rule__MegalAnnotation__SelectionAssignment_1 )?
            {
             before(grammarAccess.getMegalAnnotationAccess().getSelectionAssignment_1()); 
            // InternalMegal.g:864:2: ( rule__MegalAnnotation__SelectionAssignment_1 )?
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalMegal.g:864:3: rule__MegalAnnotation__SelectionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalAnnotation__SelectionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalAnnotationAccess().getSelectionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalAnnotation__Group__1__Impl"


    // $ANTLR start "rule__MegalLink__Group__0"
    // InternalMegal.g:873:1: rule__MegalLink__Group__0 : rule__MegalLink__Group__0__Impl rule__MegalLink__Group__1 ;
    public final void rule__MegalLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:877:1: ( rule__MegalLink__Group__0__Impl rule__MegalLink__Group__1 )
            // InternalMegal.g:878:2: rule__MegalLink__Group__0__Impl rule__MegalLink__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MegalLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalLink__Group__1();

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
    // $ANTLR end "rule__MegalLink__Group__0"


    // $ANTLR start "rule__MegalLink__Group__0__Impl"
    // InternalMegal.g:885:1: rule__MegalLink__Group__0__Impl : ( ( rule__MegalLink__AnnotationsAssignment_0 )* ) ;
    public final void rule__MegalLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:889:1: ( ( ( rule__MegalLink__AnnotationsAssignment_0 )* ) )
            // InternalMegal.g:890:1: ( ( rule__MegalLink__AnnotationsAssignment_0 )* )
            {
            // InternalMegal.g:890:1: ( ( rule__MegalLink__AnnotationsAssignment_0 )* )
            // InternalMegal.g:891:2: ( rule__MegalLink__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getMegalLinkAccess().getAnnotationsAssignment_0()); 
            // InternalMegal.g:892:2: ( rule__MegalLink__AnnotationsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ANN_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMegal.g:892:3: rule__MegalLink__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MegalLink__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMegalLinkAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group__0__Impl"


    // $ANTLR start "rule__MegalLink__Group__1"
    // InternalMegal.g:900:1: rule__MegalLink__Group__1 : rule__MegalLink__Group__1__Impl rule__MegalLink__Group__2 ;
    public final void rule__MegalLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:904:1: ( rule__MegalLink__Group__1__Impl rule__MegalLink__Group__2 )
            // InternalMegal.g:905:2: rule__MegalLink__Group__1__Impl rule__MegalLink__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MegalLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalLink__Group__2();

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
    // $ANTLR end "rule__MegalLink__Group__1"


    // $ANTLR start "rule__MegalLink__Group__1__Impl"
    // InternalMegal.g:912:1: rule__MegalLink__Group__1__Impl : ( ( rule__MegalLink__LinkAssignment_1 ) ) ;
    public final void rule__MegalLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:916:1: ( ( ( rule__MegalLink__LinkAssignment_1 ) ) )
            // InternalMegal.g:917:1: ( ( rule__MegalLink__LinkAssignment_1 ) )
            {
            // InternalMegal.g:917:1: ( ( rule__MegalLink__LinkAssignment_1 ) )
            // InternalMegal.g:918:2: ( rule__MegalLink__LinkAssignment_1 )
            {
             before(grammarAccess.getMegalLinkAccess().getLinkAssignment_1()); 
            // InternalMegal.g:919:2: ( rule__MegalLink__LinkAssignment_1 )
            // InternalMegal.g:919:3: rule__MegalLink__LinkAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MegalLink__LinkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalLinkAccess().getLinkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group__1__Impl"


    // $ANTLR start "rule__MegalLink__Group__2"
    // InternalMegal.g:927:1: rule__MegalLink__Group__2 : rule__MegalLink__Group__2__Impl rule__MegalLink__Group__3 ;
    public final void rule__MegalLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:931:1: ( rule__MegalLink__Group__2__Impl rule__MegalLink__Group__3 )
            // InternalMegal.g:932:2: rule__MegalLink__Group__2__Impl rule__MegalLink__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__MegalLink__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalLink__Group__3();

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
    // $ANTLR end "rule__MegalLink__Group__2"


    // $ANTLR start "rule__MegalLink__Group__2__Impl"
    // InternalMegal.g:939:1: rule__MegalLink__Group__2__Impl : ( ( rule__MegalLink__Group_2__0 )? ) ;
    public final void rule__MegalLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:943:1: ( ( ( rule__MegalLink__Group_2__0 )? ) )
            // InternalMegal.g:944:1: ( ( rule__MegalLink__Group_2__0 )? )
            {
            // InternalMegal.g:944:1: ( ( rule__MegalLink__Group_2__0 )? )
            // InternalMegal.g:945:2: ( rule__MegalLink__Group_2__0 )?
            {
             before(grammarAccess.getMegalLinkAccess().getGroup_2()); 
            // InternalMegal.g:946:2: ( rule__MegalLink__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMegal.g:946:3: rule__MegalLink__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalLink__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalLinkAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group__2__Impl"


    // $ANTLR start "rule__MegalLink__Group__3"
    // InternalMegal.g:954:1: rule__MegalLink__Group__3 : rule__MegalLink__Group__3__Impl rule__MegalLink__Group__4 ;
    public final void rule__MegalLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:958:1: ( rule__MegalLink__Group__3__Impl rule__MegalLink__Group__4 )
            // InternalMegal.g:959:2: rule__MegalLink__Group__3__Impl rule__MegalLink__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__MegalLink__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalLink__Group__4();

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
    // $ANTLR end "rule__MegalLink__Group__3"


    // $ANTLR start "rule__MegalLink__Group__3__Impl"
    // InternalMegal.g:966:1: rule__MegalLink__Group__3__Impl : ( '=' ) ;
    public final void rule__MegalLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:970:1: ( ( '=' ) )
            // InternalMegal.g:971:1: ( '=' )
            {
            // InternalMegal.g:971:1: ( '=' )
            // InternalMegal.g:972:2: '='
            {
             before(grammarAccess.getMegalLinkAccess().getEqualsSignKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMegalLinkAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group__3__Impl"


    // $ANTLR start "rule__MegalLink__Group__4"
    // InternalMegal.g:981:1: rule__MegalLink__Group__4 : rule__MegalLink__Group__4__Impl ;
    public final void rule__MegalLink__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:985:1: ( rule__MegalLink__Group__4__Impl )
            // InternalMegal.g:986:2: rule__MegalLink__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalLink__Group__4__Impl();

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
    // $ANTLR end "rule__MegalLink__Group__4"


    // $ANTLR start "rule__MegalLink__Group__4__Impl"
    // InternalMegal.g:992:1: rule__MegalLink__Group__4__Impl : ( ( rule__MegalLink__ToAssignment_4 ) ) ;
    public final void rule__MegalLink__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:996:1: ( ( ( rule__MegalLink__ToAssignment_4 ) ) )
            // InternalMegal.g:997:1: ( ( rule__MegalLink__ToAssignment_4 ) )
            {
            // InternalMegal.g:997:1: ( ( rule__MegalLink__ToAssignment_4 ) )
            // InternalMegal.g:998:2: ( rule__MegalLink__ToAssignment_4 )
            {
             before(grammarAccess.getMegalLinkAccess().getToAssignment_4()); 
            // InternalMegal.g:999:2: ( rule__MegalLink__ToAssignment_4 )
            // InternalMegal.g:999:3: rule__MegalLink__ToAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MegalLink__ToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMegalLinkAccess().getToAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group__4__Impl"


    // $ANTLR start "rule__MegalLink__Group_2__0"
    // InternalMegal.g:1008:1: rule__MegalLink__Group_2__0 : rule__MegalLink__Group_2__0__Impl rule__MegalLink__Group_2__1 ;
    public final void rule__MegalLink__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1012:1: ( rule__MegalLink__Group_2__0__Impl rule__MegalLink__Group_2__1 )
            // InternalMegal.g:1013:2: rule__MegalLink__Group_2__0__Impl rule__MegalLink__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__MegalLink__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalLink__Group_2__1();

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
    // $ANTLR end "rule__MegalLink__Group_2__0"


    // $ANTLR start "rule__MegalLink__Group_2__0__Impl"
    // InternalMegal.g:1020:1: rule__MegalLink__Group_2__0__Impl : ( '(' ) ;
    public final void rule__MegalLink__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1024:1: ( ( '(' ) )
            // InternalMegal.g:1025:1: ( '(' )
            {
            // InternalMegal.g:1025:1: ( '(' )
            // InternalMegal.g:1026:2: '('
            {
             before(grammarAccess.getMegalLinkAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMegalLinkAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group_2__0__Impl"


    // $ANTLR start "rule__MegalLink__Group_2__1"
    // InternalMegal.g:1035:1: rule__MegalLink__Group_2__1 : rule__MegalLink__Group_2__1__Impl rule__MegalLink__Group_2__2 ;
    public final void rule__MegalLink__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1039:1: ( rule__MegalLink__Group_2__1__Impl rule__MegalLink__Group_2__2 )
            // InternalMegal.g:1040:2: rule__MegalLink__Group_2__1__Impl rule__MegalLink__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__MegalLink__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalLink__Group_2__2();

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
    // $ANTLR end "rule__MegalLink__Group_2__1"


    // $ANTLR start "rule__MegalLink__Group_2__1__Impl"
    // InternalMegal.g:1047:1: rule__MegalLink__Group_2__1__Impl : ( ( rule__MegalLink__FirstAssignment_2_1 ) ) ;
    public final void rule__MegalLink__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1051:1: ( ( ( rule__MegalLink__FirstAssignment_2_1 ) ) )
            // InternalMegal.g:1052:1: ( ( rule__MegalLink__FirstAssignment_2_1 ) )
            {
            // InternalMegal.g:1052:1: ( ( rule__MegalLink__FirstAssignment_2_1 ) )
            // InternalMegal.g:1053:2: ( rule__MegalLink__FirstAssignment_2_1 )
            {
             before(grammarAccess.getMegalLinkAccess().getFirstAssignment_2_1()); 
            // InternalMegal.g:1054:2: ( rule__MegalLink__FirstAssignment_2_1 )
            // InternalMegal.g:1054:3: rule__MegalLink__FirstAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MegalLink__FirstAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalLinkAccess().getFirstAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group_2__1__Impl"


    // $ANTLR start "rule__MegalLink__Group_2__2"
    // InternalMegal.g:1062:1: rule__MegalLink__Group_2__2 : rule__MegalLink__Group_2__2__Impl rule__MegalLink__Group_2__3 ;
    public final void rule__MegalLink__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1066:1: ( rule__MegalLink__Group_2__2__Impl rule__MegalLink__Group_2__3 )
            // InternalMegal.g:1067:2: rule__MegalLink__Group_2__2__Impl rule__MegalLink__Group_2__3
            {
            pushFollow(FOLLOW_12);
            rule__MegalLink__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalLink__Group_2__3();

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
    // $ANTLR end "rule__MegalLink__Group_2__2"


    // $ANTLR start "rule__MegalLink__Group_2__2__Impl"
    // InternalMegal.g:1074:1: rule__MegalLink__Group_2__2__Impl : ( ')' ) ;
    public final void rule__MegalLink__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1078:1: ( ( ')' ) )
            // InternalMegal.g:1079:1: ( ')' )
            {
            // InternalMegal.g:1079:1: ( ')' )
            // InternalMegal.g:1080:2: ')'
            {
             before(grammarAccess.getMegalLinkAccess().getRightParenthesisKeyword_2_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMegalLinkAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group_2__2__Impl"


    // $ANTLR start "rule__MegalLink__Group_2__3"
    // InternalMegal.g:1089:1: rule__MegalLink__Group_2__3 : rule__MegalLink__Group_2__3__Impl rule__MegalLink__Group_2__4 ;
    public final void rule__MegalLink__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1093:1: ( rule__MegalLink__Group_2__3__Impl rule__MegalLink__Group_2__4 )
            // InternalMegal.g:1094:2: rule__MegalLink__Group_2__3__Impl rule__MegalLink__Group_2__4
            {
            pushFollow(FOLLOW_5);
            rule__MegalLink__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalLink__Group_2__4();

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
    // $ANTLR end "rule__MegalLink__Group_2__3"


    // $ANTLR start "rule__MegalLink__Group_2__3__Impl"
    // InternalMegal.g:1101:1: rule__MegalLink__Group_2__3__Impl : ( '|->' ) ;
    public final void rule__MegalLink__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1105:1: ( ( '|->' ) )
            // InternalMegal.g:1106:1: ( '|->' )
            {
            // InternalMegal.g:1106:1: ( '|->' )
            // InternalMegal.g:1107:2: '|->'
            {
             before(grammarAccess.getMegalLinkAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_2_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMegalLinkAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group_2__3__Impl"


    // $ANTLR start "rule__MegalLink__Group_2__4"
    // InternalMegal.g:1116:1: rule__MegalLink__Group_2__4 : rule__MegalLink__Group_2__4__Impl ;
    public final void rule__MegalLink__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1120:1: ( rule__MegalLink__Group_2__4__Impl )
            // InternalMegal.g:1121:2: rule__MegalLink__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalLink__Group_2__4__Impl();

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
    // $ANTLR end "rule__MegalLink__Group_2__4"


    // $ANTLR start "rule__MegalLink__Group_2__4__Impl"
    // InternalMegal.g:1127:1: rule__MegalLink__Group_2__4__Impl : ( ( rule__MegalLink__SecondAssignment_2_4 ) ) ;
    public final void rule__MegalLink__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1131:1: ( ( ( rule__MegalLink__SecondAssignment_2_4 ) ) )
            // InternalMegal.g:1132:1: ( ( rule__MegalLink__SecondAssignment_2_4 ) )
            {
            // InternalMegal.g:1132:1: ( ( rule__MegalLink__SecondAssignment_2_4 ) )
            // InternalMegal.g:1133:2: ( rule__MegalLink__SecondAssignment_2_4 )
            {
             before(grammarAccess.getMegalLinkAccess().getSecondAssignment_2_4()); 
            // InternalMegal.g:1134:2: ( rule__MegalLink__SecondAssignment_2_4 )
            // InternalMegal.g:1134:3: rule__MegalLink__SecondAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__MegalLink__SecondAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getMegalLinkAccess().getSecondAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group_2__4__Impl"


    // $ANTLR start "rule__MegalEntityType__Group__0"
    // InternalMegal.g:1143:1: rule__MegalEntityType__Group__0 : rule__MegalEntityType__Group__0__Impl rule__MegalEntityType__Group__1 ;
    public final void rule__MegalEntityType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1147:1: ( rule__MegalEntityType__Group__0__Impl rule__MegalEntityType__Group__1 )
            // InternalMegal.g:1148:2: rule__MegalEntityType__Group__0__Impl rule__MegalEntityType__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MegalEntityType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalEntityType__Group__1();

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
    // $ANTLR end "rule__MegalEntityType__Group__0"


    // $ANTLR start "rule__MegalEntityType__Group__0__Impl"
    // InternalMegal.g:1155:1: rule__MegalEntityType__Group__0__Impl : ( ( rule__MegalEntityType__AnnotationsAssignment_0 )* ) ;
    public final void rule__MegalEntityType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1159:1: ( ( ( rule__MegalEntityType__AnnotationsAssignment_0 )* ) )
            // InternalMegal.g:1160:1: ( ( rule__MegalEntityType__AnnotationsAssignment_0 )* )
            {
            // InternalMegal.g:1160:1: ( ( rule__MegalEntityType__AnnotationsAssignment_0 )* )
            // InternalMegal.g:1161:2: ( rule__MegalEntityType__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getMegalEntityTypeAccess().getAnnotationsAssignment_0()); 
            // InternalMegal.g:1162:2: ( rule__MegalEntityType__AnnotationsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ANN_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMegal.g:1162:3: rule__MegalEntityType__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MegalEntityType__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMegalEntityTypeAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group__0__Impl"


    // $ANTLR start "rule__MegalEntityType__Group__1"
    // InternalMegal.g:1170:1: rule__MegalEntityType__Group__1 : rule__MegalEntityType__Group__1__Impl rule__MegalEntityType__Group__2 ;
    public final void rule__MegalEntityType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1174:1: ( rule__MegalEntityType__Group__1__Impl rule__MegalEntityType__Group__2 )
            // InternalMegal.g:1175:2: rule__MegalEntityType__Group__1__Impl rule__MegalEntityType__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__MegalEntityType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalEntityType__Group__2();

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
    // $ANTLR end "rule__MegalEntityType__Group__1"


    // $ANTLR start "rule__MegalEntityType__Group__1__Impl"
    // InternalMegal.g:1182:1: rule__MegalEntityType__Group__1__Impl : ( ( rule__MegalEntityType__NameAssignment_1 ) ) ;
    public final void rule__MegalEntityType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1186:1: ( ( ( rule__MegalEntityType__NameAssignment_1 ) ) )
            // InternalMegal.g:1187:1: ( ( rule__MegalEntityType__NameAssignment_1 ) )
            {
            // InternalMegal.g:1187:1: ( ( rule__MegalEntityType__NameAssignment_1 ) )
            // InternalMegal.g:1188:2: ( rule__MegalEntityType__NameAssignment_1 )
            {
             before(grammarAccess.getMegalEntityTypeAccess().getNameAssignment_1()); 
            // InternalMegal.g:1189:2: ( rule__MegalEntityType__NameAssignment_1 )
            // InternalMegal.g:1189:3: rule__MegalEntityType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MegalEntityType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group__1__Impl"


    // $ANTLR start "rule__MegalEntityType__Group__2"
    // InternalMegal.g:1197:1: rule__MegalEntityType__Group__2 : rule__MegalEntityType__Group__2__Impl ;
    public final void rule__MegalEntityType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1201:1: ( rule__MegalEntityType__Group__2__Impl )
            // InternalMegal.g:1202:2: rule__MegalEntityType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalEntityType__Group__2__Impl();

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
    // $ANTLR end "rule__MegalEntityType__Group__2"


    // $ANTLR start "rule__MegalEntityType__Group__2__Impl"
    // InternalMegal.g:1208:1: rule__MegalEntityType__Group__2__Impl : ( ( rule__MegalEntityType__Alternatives_2 ) ) ;
    public final void rule__MegalEntityType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1212:1: ( ( ( rule__MegalEntityType__Alternatives_2 ) ) )
            // InternalMegal.g:1213:1: ( ( rule__MegalEntityType__Alternatives_2 ) )
            {
            // InternalMegal.g:1213:1: ( ( rule__MegalEntityType__Alternatives_2 ) )
            // InternalMegal.g:1214:2: ( rule__MegalEntityType__Alternatives_2 )
            {
             before(grammarAccess.getMegalEntityTypeAccess().getAlternatives_2()); 
            // InternalMegal.g:1215:2: ( rule__MegalEntityType__Alternatives_2 )
            // InternalMegal.g:1215:3: rule__MegalEntityType__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__MegalEntityType__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityTypeAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group__2__Impl"


    // $ANTLR start "rule__MegalEntityType__Group_2_0__0"
    // InternalMegal.g:1224:1: rule__MegalEntityType__Group_2_0__0 : rule__MegalEntityType__Group_2_0__0__Impl rule__MegalEntityType__Group_2_0__1 ;
    public final void rule__MegalEntityType__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1228:1: ( rule__MegalEntityType__Group_2_0__0__Impl rule__MegalEntityType__Group_2_0__1 )
            // InternalMegal.g:1229:2: rule__MegalEntityType__Group_2_0__0__Impl rule__MegalEntityType__Group_2_0__1
            {
            pushFollow(FOLLOW_5);
            rule__MegalEntityType__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalEntityType__Group_2_0__1();

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
    // $ANTLR end "rule__MegalEntityType__Group_2_0__0"


    // $ANTLR start "rule__MegalEntityType__Group_2_0__0__Impl"
    // InternalMegal.g:1236:1: rule__MegalEntityType__Group_2_0__0__Impl : ( '<' ) ;
    public final void rule__MegalEntityType__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1240:1: ( ( '<' ) )
            // InternalMegal.g:1241:1: ( '<' )
            {
            // InternalMegal.g:1241:1: ( '<' )
            // InternalMegal.g:1242:2: '<'
            {
             before(grammarAccess.getMegalEntityTypeAccess().getLessThanSignKeyword_2_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMegalEntityTypeAccess().getLessThanSignKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group_2_0__0__Impl"


    // $ANTLR start "rule__MegalEntityType__Group_2_0__1"
    // InternalMegal.g:1251:1: rule__MegalEntityType__Group_2_0__1 : rule__MegalEntityType__Group_2_0__1__Impl ;
    public final void rule__MegalEntityType__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1255:1: ( rule__MegalEntityType__Group_2_0__1__Impl )
            // InternalMegal.g:1256:2: rule__MegalEntityType__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalEntityType__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__MegalEntityType__Group_2_0__1"


    // $ANTLR start "rule__MegalEntityType__Group_2_0__1__Impl"
    // InternalMegal.g:1262:1: rule__MegalEntityType__Group_2_0__1__Impl : ( ( rule__MegalEntityType__SupertypeAssignment_2_0_1 ) ) ;
    public final void rule__MegalEntityType__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1266:1: ( ( ( rule__MegalEntityType__SupertypeAssignment_2_0_1 ) ) )
            // InternalMegal.g:1267:1: ( ( rule__MegalEntityType__SupertypeAssignment_2_0_1 ) )
            {
            // InternalMegal.g:1267:1: ( ( rule__MegalEntityType__SupertypeAssignment_2_0_1 ) )
            // InternalMegal.g:1268:2: ( rule__MegalEntityType__SupertypeAssignment_2_0_1 )
            {
             before(grammarAccess.getMegalEntityTypeAccess().getSupertypeAssignment_2_0_1()); 
            // InternalMegal.g:1269:2: ( rule__MegalEntityType__SupertypeAssignment_2_0_1 )
            // InternalMegal.g:1269:3: rule__MegalEntityType__SupertypeAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MegalEntityType__SupertypeAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityTypeAccess().getSupertypeAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group_2_0__1__Impl"


    // $ANTLR start "rule__MegalEntityType__Group_2_1__0"
    // InternalMegal.g:1278:1: rule__MegalEntityType__Group_2_1__0 : rule__MegalEntityType__Group_2_1__0__Impl rule__MegalEntityType__Group_2_1__1 ;
    public final void rule__MegalEntityType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1282:1: ( rule__MegalEntityType__Group_2_1__0__Impl rule__MegalEntityType__Group_2_1__1 )
            // InternalMegal.g:1283:2: rule__MegalEntityType__Group_2_1__0__Impl rule__MegalEntityType__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
            rule__MegalEntityType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalEntityType__Group_2_1__1();

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
    // $ANTLR end "rule__MegalEntityType__Group_2_1__0"


    // $ANTLR start "rule__MegalEntityType__Group_2_1__0__Impl"
    // InternalMegal.g:1290:1: rule__MegalEntityType__Group_2_1__0__Impl : ( 'as' ) ;
    public final void rule__MegalEntityType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1294:1: ( ( 'as' ) )
            // InternalMegal.g:1295:1: ( 'as' )
            {
            // InternalMegal.g:1295:1: ( 'as' )
            // InternalMegal.g:1296:2: 'as'
            {
             before(grammarAccess.getMegalEntityTypeAccess().getAsKeyword_2_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMegalEntityTypeAccess().getAsKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group_2_1__0__Impl"


    // $ANTLR start "rule__MegalEntityType__Group_2_1__1"
    // InternalMegal.g:1305:1: rule__MegalEntityType__Group_2_1__1 : rule__MegalEntityType__Group_2_1__1__Impl ;
    public final void rule__MegalEntityType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1309:1: ( rule__MegalEntityType__Group_2_1__1__Impl )
            // InternalMegal.g:1310:2: rule__MegalEntityType__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalEntityType__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__MegalEntityType__Group_2_1__1"


    // $ANTLR start "rule__MegalEntityType__Group_2_1__1__Impl"
    // InternalMegal.g:1316:1: rule__MegalEntityType__Group_2_1__1__Impl : ( 'entity' ) ;
    public final void rule__MegalEntityType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1320:1: ( ( 'entity' ) )
            // InternalMegal.g:1321:1: ( 'entity' )
            {
            // InternalMegal.g:1321:1: ( 'entity' )
            // InternalMegal.g:1322:2: 'entity'
            {
             before(grammarAccess.getMegalEntityTypeAccess().getEntityKeyword_2_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMegalEntityTypeAccess().getEntityKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group_2_1__1__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__0"
    // InternalMegal.g:1332:1: rule__MegalRelationshipType__Group__0 : rule__MegalRelationshipType__Group__0__Impl rule__MegalRelationshipType__Group__1 ;
    public final void rule__MegalRelationshipType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1336:1: ( rule__MegalRelationshipType__Group__0__Impl rule__MegalRelationshipType__Group__1 )
            // InternalMegal.g:1337:2: rule__MegalRelationshipType__Group__0__Impl rule__MegalRelationshipType__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MegalRelationshipType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group__1();

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
    // $ANTLR end "rule__MegalRelationshipType__Group__0"


    // $ANTLR start "rule__MegalRelationshipType__Group__0__Impl"
    // InternalMegal.g:1344:1: rule__MegalRelationshipType__Group__0__Impl : ( ( rule__MegalRelationshipType__AnnotationsAssignment_0 )* ) ;
    public final void rule__MegalRelationshipType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1348:1: ( ( ( rule__MegalRelationshipType__AnnotationsAssignment_0 )* ) )
            // InternalMegal.g:1349:1: ( ( rule__MegalRelationshipType__AnnotationsAssignment_0 )* )
            {
            // InternalMegal.g:1349:1: ( ( rule__MegalRelationshipType__AnnotationsAssignment_0 )* )
            // InternalMegal.g:1350:2: ( rule__MegalRelationshipType__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getAnnotationsAssignment_0()); 
            // InternalMegal.g:1351:2: ( rule__MegalRelationshipType__AnnotationsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ANN_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMegal.g:1351:3: rule__MegalRelationshipType__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MegalRelationshipType__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMegalRelationshipTypeAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__0__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__1"
    // InternalMegal.g:1359:1: rule__MegalRelationshipType__Group__1 : rule__MegalRelationshipType__Group__1__Impl rule__MegalRelationshipType__Group__2 ;
    public final void rule__MegalRelationshipType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1363:1: ( rule__MegalRelationshipType__Group__1__Impl rule__MegalRelationshipType__Group__2 )
            // InternalMegal.g:1364:2: rule__MegalRelationshipType__Group__1__Impl rule__MegalRelationshipType__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__MegalRelationshipType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group__2();

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
    // $ANTLR end "rule__MegalRelationshipType__Group__1"


    // $ANTLR start "rule__MegalRelationshipType__Group__1__Impl"
    // InternalMegal.g:1371:1: rule__MegalRelationshipType__Group__1__Impl : ( ( rule__MegalRelationshipType__NameAssignment_1 ) ) ;
    public final void rule__MegalRelationshipType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1375:1: ( ( ( rule__MegalRelationshipType__NameAssignment_1 ) ) )
            // InternalMegal.g:1376:1: ( ( rule__MegalRelationshipType__NameAssignment_1 ) )
            {
            // InternalMegal.g:1376:1: ( ( rule__MegalRelationshipType__NameAssignment_1 ) )
            // InternalMegal.g:1377:2: ( rule__MegalRelationshipType__NameAssignment_1 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getNameAssignment_1()); 
            // InternalMegal.g:1378:2: ( rule__MegalRelationshipType__NameAssignment_1 )
            // InternalMegal.g:1378:3: rule__MegalRelationshipType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__1__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__2"
    // InternalMegal.g:1386:1: rule__MegalRelationshipType__Group__2 : rule__MegalRelationshipType__Group__2__Impl rule__MegalRelationshipType__Group__3 ;
    public final void rule__MegalRelationshipType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1390:1: ( rule__MegalRelationshipType__Group__2__Impl rule__MegalRelationshipType__Group__3 )
            // InternalMegal.g:1391:2: rule__MegalRelationshipType__Group__2__Impl rule__MegalRelationshipType__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MegalRelationshipType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group__3();

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
    // $ANTLR end "rule__MegalRelationshipType__Group__2"


    // $ANTLR start "rule__MegalRelationshipType__Group__2__Impl"
    // InternalMegal.g:1398:1: rule__MegalRelationshipType__Group__2__Impl : ( '<' ) ;
    public final void rule__MegalRelationshipType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1402:1: ( ( '<' ) )
            // InternalMegal.g:1403:1: ( '<' )
            {
            // InternalMegal.g:1403:1: ( '<' )
            // InternalMegal.g:1404:2: '<'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLessThanSignKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__2__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__3"
    // InternalMegal.g:1413:1: rule__MegalRelationshipType__Group__3 : rule__MegalRelationshipType__Group__3__Impl rule__MegalRelationshipType__Group__4 ;
    public final void rule__MegalRelationshipType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1417:1: ( rule__MegalRelationshipType__Group__3__Impl rule__MegalRelationshipType__Group__4 )
            // InternalMegal.g:1418:2: rule__MegalRelationshipType__Group__3__Impl rule__MegalRelationshipType__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__MegalRelationshipType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group__4();

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
    // $ANTLR end "rule__MegalRelationshipType__Group__3"


    // $ANTLR start "rule__MegalRelationshipType__Group__3__Impl"
    // InternalMegal.g:1425:1: rule__MegalRelationshipType__Group__3__Impl : ( ( rule__MegalRelationshipType__LeftAssignment_3 ) ) ;
    public final void rule__MegalRelationshipType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1429:1: ( ( ( rule__MegalRelationshipType__LeftAssignment_3 ) ) )
            // InternalMegal.g:1430:1: ( ( rule__MegalRelationshipType__LeftAssignment_3 ) )
            {
            // InternalMegal.g:1430:1: ( ( rule__MegalRelationshipType__LeftAssignment_3 ) )
            // InternalMegal.g:1431:2: ( rule__MegalRelationshipType__LeftAssignment_3 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftAssignment_3()); 
            // InternalMegal.g:1432:2: ( rule__MegalRelationshipType__LeftAssignment_3 )
            // InternalMegal.g:1432:3: rule__MegalRelationshipType__LeftAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__LeftAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__3__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__4"
    // InternalMegal.g:1440:1: rule__MegalRelationshipType__Group__4 : rule__MegalRelationshipType__Group__4__Impl rule__MegalRelationshipType__Group__5 ;
    public final void rule__MegalRelationshipType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1444:1: ( rule__MegalRelationshipType__Group__4__Impl rule__MegalRelationshipType__Group__5 )
            // InternalMegal.g:1445:2: rule__MegalRelationshipType__Group__4__Impl rule__MegalRelationshipType__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__MegalRelationshipType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group__5();

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
    // $ANTLR end "rule__MegalRelationshipType__Group__4"


    // $ANTLR start "rule__MegalRelationshipType__Group__4__Impl"
    // InternalMegal.g:1452:1: rule__MegalRelationshipType__Group__4__Impl : ( ( rule__MegalRelationshipType__Group_4__0 )? ) ;
    public final void rule__MegalRelationshipType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1456:1: ( ( ( rule__MegalRelationshipType__Group_4__0 )? ) )
            // InternalMegal.g:1457:1: ( ( rule__MegalRelationshipType__Group_4__0 )? )
            {
            // InternalMegal.g:1457:1: ( ( rule__MegalRelationshipType__Group_4__0 )? )
            // InternalMegal.g:1458:2: ( rule__MegalRelationshipType__Group_4__0 )?
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getGroup_4()); 
            // InternalMegal.g:1459:2: ( rule__MegalRelationshipType__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMegal.g:1459:3: rule__MegalRelationshipType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalRelationshipType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__4__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__5"
    // InternalMegal.g:1467:1: rule__MegalRelationshipType__Group__5 : rule__MegalRelationshipType__Group__5__Impl rule__MegalRelationshipType__Group__6 ;
    public final void rule__MegalRelationshipType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1471:1: ( rule__MegalRelationshipType__Group__5__Impl rule__MegalRelationshipType__Group__6 )
            // InternalMegal.g:1472:2: rule__MegalRelationshipType__Group__5__Impl rule__MegalRelationshipType__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__MegalRelationshipType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group__6();

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
    // $ANTLR end "rule__MegalRelationshipType__Group__5"


    // $ANTLR start "rule__MegalRelationshipType__Group__5__Impl"
    // InternalMegal.g:1479:1: rule__MegalRelationshipType__Group__5__Impl : ( ( rule__MegalRelationshipType__Alternatives_5 )? ) ;
    public final void rule__MegalRelationshipType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1483:1: ( ( ( rule__MegalRelationshipType__Alternatives_5 )? ) )
            // InternalMegal.g:1484:1: ( ( rule__MegalRelationshipType__Alternatives_5 )? )
            {
            // InternalMegal.g:1484:1: ( ( rule__MegalRelationshipType__Alternatives_5 )? )
            // InternalMegal.g:1485:2: ( rule__MegalRelationshipType__Alternatives_5 )?
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getAlternatives_5()); 
            // InternalMegal.g:1486:2: ( rule__MegalRelationshipType__Alternatives_5 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=29 && LA15_0<=30)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMegal.g:1486:3: rule__MegalRelationshipType__Alternatives_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalRelationshipType__Alternatives_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__5__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__6"
    // InternalMegal.g:1494:1: rule__MegalRelationshipType__Group__6 : rule__MegalRelationshipType__Group__6__Impl rule__MegalRelationshipType__Group__7 ;
    public final void rule__MegalRelationshipType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1498:1: ( rule__MegalRelationshipType__Group__6__Impl rule__MegalRelationshipType__Group__7 )
            // InternalMegal.g:1499:2: rule__MegalRelationshipType__Group__6__Impl rule__MegalRelationshipType__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__MegalRelationshipType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group__7();

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
    // $ANTLR end "rule__MegalRelationshipType__Group__6"


    // $ANTLR start "rule__MegalRelationshipType__Group__6__Impl"
    // InternalMegal.g:1506:1: rule__MegalRelationshipType__Group__6__Impl : ( '*' ) ;
    public final void rule__MegalRelationshipType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1510:1: ( ( '*' ) )
            // InternalMegal.g:1511:1: ( '*' )
            {
            // InternalMegal.g:1511:1: ( '*' )
            // InternalMegal.g:1512:2: '*'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getAsteriskKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getAsteriskKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__6__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__7"
    // InternalMegal.g:1521:1: rule__MegalRelationshipType__Group__7 : rule__MegalRelationshipType__Group__7__Impl rule__MegalRelationshipType__Group__8 ;
    public final void rule__MegalRelationshipType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1525:1: ( rule__MegalRelationshipType__Group__7__Impl rule__MegalRelationshipType__Group__8 )
            // InternalMegal.g:1526:2: rule__MegalRelationshipType__Group__7__Impl rule__MegalRelationshipType__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__MegalRelationshipType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group__8();

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
    // $ANTLR end "rule__MegalRelationshipType__Group__7"


    // $ANTLR start "rule__MegalRelationshipType__Group__7__Impl"
    // InternalMegal.g:1533:1: rule__MegalRelationshipType__Group__7__Impl : ( ( rule__MegalRelationshipType__RightAssignment_7 ) ) ;
    public final void rule__MegalRelationshipType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1537:1: ( ( ( rule__MegalRelationshipType__RightAssignment_7 ) ) )
            // InternalMegal.g:1538:1: ( ( rule__MegalRelationshipType__RightAssignment_7 ) )
            {
            // InternalMegal.g:1538:1: ( ( rule__MegalRelationshipType__RightAssignment_7 ) )
            // InternalMegal.g:1539:2: ( rule__MegalRelationshipType__RightAssignment_7 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightAssignment_7()); 
            // InternalMegal.g:1540:2: ( rule__MegalRelationshipType__RightAssignment_7 )
            // InternalMegal.g:1540:3: rule__MegalRelationshipType__RightAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__RightAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__7__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__8"
    // InternalMegal.g:1548:1: rule__MegalRelationshipType__Group__8 : rule__MegalRelationshipType__Group__8__Impl rule__MegalRelationshipType__Group__9 ;
    public final void rule__MegalRelationshipType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1552:1: ( rule__MegalRelationshipType__Group__8__Impl rule__MegalRelationshipType__Group__9 )
            // InternalMegal.g:1553:2: rule__MegalRelationshipType__Group__8__Impl rule__MegalRelationshipType__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__MegalRelationshipType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group__9();

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
    // $ANTLR end "rule__MegalRelationshipType__Group__8"


    // $ANTLR start "rule__MegalRelationshipType__Group__8__Impl"
    // InternalMegal.g:1560:1: rule__MegalRelationshipType__Group__8__Impl : ( ( rule__MegalRelationshipType__Group_8__0 )? ) ;
    public final void rule__MegalRelationshipType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1564:1: ( ( ( rule__MegalRelationshipType__Group_8__0 )? ) )
            // InternalMegal.g:1565:1: ( ( rule__MegalRelationshipType__Group_8__0 )? )
            {
            // InternalMegal.g:1565:1: ( ( rule__MegalRelationshipType__Group_8__0 )? )
            // InternalMegal.g:1566:2: ( rule__MegalRelationshipType__Group_8__0 )?
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getGroup_8()); 
            // InternalMegal.g:1567:2: ( rule__MegalRelationshipType__Group_8__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMegal.g:1567:3: rule__MegalRelationshipType__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalRelationshipType__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__8__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__9"
    // InternalMegal.g:1575:1: rule__MegalRelationshipType__Group__9 : rule__MegalRelationshipType__Group__9__Impl ;
    public final void rule__MegalRelationshipType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1579:1: ( rule__MegalRelationshipType__Group__9__Impl )
            // InternalMegal.g:1580:2: rule__MegalRelationshipType__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group__9__Impl();

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
    // $ANTLR end "rule__MegalRelationshipType__Group__9"


    // $ANTLR start "rule__MegalRelationshipType__Group__9__Impl"
    // InternalMegal.g:1586:1: rule__MegalRelationshipType__Group__9__Impl : ( ( rule__MegalRelationshipType__Alternatives_9 )? ) ;
    public final void rule__MegalRelationshipType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1590:1: ( ( ( rule__MegalRelationshipType__Alternatives_9 )? ) )
            // InternalMegal.g:1591:1: ( ( rule__MegalRelationshipType__Alternatives_9 )? )
            {
            // InternalMegal.g:1591:1: ( ( rule__MegalRelationshipType__Alternatives_9 )? )
            // InternalMegal.g:1592:2: ( rule__MegalRelationshipType__Alternatives_9 )?
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getAlternatives_9()); 
            // InternalMegal.g:1593:2: ( rule__MegalRelationshipType__Alternatives_9 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=29 && LA17_0<=30)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMegal.g:1593:3: rule__MegalRelationshipType__Alternatives_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalRelationshipType__Alternatives_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__9__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__0"
    // InternalMegal.g:1602:1: rule__MegalRelationshipType__Group_4__0 : rule__MegalRelationshipType__Group_4__0__Impl rule__MegalRelationshipType__Group_4__1 ;
    public final void rule__MegalRelationshipType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1606:1: ( rule__MegalRelationshipType__Group_4__0__Impl rule__MegalRelationshipType__Group_4__1 )
            // InternalMegal.g:1607:2: rule__MegalRelationshipType__Group_4__0__Impl rule__MegalRelationshipType__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__MegalRelationshipType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group_4__1();

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
    // $ANTLR end "rule__MegalRelationshipType__Group_4__0"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__0__Impl"
    // InternalMegal.g:1614:1: rule__MegalRelationshipType__Group_4__0__Impl : ( '[' ) ;
    public final void rule__MegalRelationshipType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1618:1: ( ( '[' ) )
            // InternalMegal.g:1619:1: ( '[' )
            {
            // InternalMegal.g:1619:1: ( '[' )
            // InternalMegal.g:1620:2: '['
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4__0__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__1"
    // InternalMegal.g:1629:1: rule__MegalRelationshipType__Group_4__1 : rule__MegalRelationshipType__Group_4__1__Impl rule__MegalRelationshipType__Group_4__2 ;
    public final void rule__MegalRelationshipType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1633:1: ( rule__MegalRelationshipType__Group_4__1__Impl rule__MegalRelationshipType__Group_4__2 )
            // InternalMegal.g:1634:2: rule__MegalRelationshipType__Group_4__1__Impl rule__MegalRelationshipType__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__MegalRelationshipType__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group_4__2();

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
    // $ANTLR end "rule__MegalRelationshipType__Group_4__1"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__1__Impl"
    // InternalMegal.g:1641:1: rule__MegalRelationshipType__Group_4__1__Impl : ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_1 ) ) ;
    public final void rule__MegalRelationshipType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1645:1: ( ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_1 ) ) )
            // InternalMegal.g:1646:1: ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_1 ) )
            {
            // InternalMegal.g:1646:1: ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_1 ) )
            // InternalMegal.g:1647:2: ( rule__MegalRelationshipType__LeftParamsAssignment_4_1 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsAssignment_4_1()); 
            // InternalMegal.g:1648:2: ( rule__MegalRelationshipType__LeftParamsAssignment_4_1 )
            // InternalMegal.g:1648:3: rule__MegalRelationshipType__LeftParamsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__LeftParamsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4__1__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__2"
    // InternalMegal.g:1656:1: rule__MegalRelationshipType__Group_4__2 : rule__MegalRelationshipType__Group_4__2__Impl rule__MegalRelationshipType__Group_4__3 ;
    public final void rule__MegalRelationshipType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1660:1: ( rule__MegalRelationshipType__Group_4__2__Impl rule__MegalRelationshipType__Group_4__3 )
            // InternalMegal.g:1661:2: rule__MegalRelationshipType__Group_4__2__Impl rule__MegalRelationshipType__Group_4__3
            {
            pushFollow(FOLLOW_19);
            rule__MegalRelationshipType__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group_4__3();

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
    // $ANTLR end "rule__MegalRelationshipType__Group_4__2"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__2__Impl"
    // InternalMegal.g:1668:1: rule__MegalRelationshipType__Group_4__2__Impl : ( ( rule__MegalRelationshipType__Group_4_2__0 )* ) ;
    public final void rule__MegalRelationshipType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1672:1: ( ( ( rule__MegalRelationshipType__Group_4_2__0 )* ) )
            // InternalMegal.g:1673:1: ( ( rule__MegalRelationshipType__Group_4_2__0 )* )
            {
            // InternalMegal.g:1673:1: ( ( rule__MegalRelationshipType__Group_4_2__0 )* )
            // InternalMegal.g:1674:2: ( rule__MegalRelationshipType__Group_4_2__0 )*
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getGroup_4_2()); 
            // InternalMegal.g:1675:2: ( rule__MegalRelationshipType__Group_4_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMegal.g:1675:3: rule__MegalRelationshipType__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__MegalRelationshipType__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMegalRelationshipTypeAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4__2__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__3"
    // InternalMegal.g:1683:1: rule__MegalRelationshipType__Group_4__3 : rule__MegalRelationshipType__Group_4__3__Impl ;
    public final void rule__MegalRelationshipType__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1687:1: ( rule__MegalRelationshipType__Group_4__3__Impl )
            // InternalMegal.g:1688:2: rule__MegalRelationshipType__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group_4__3__Impl();

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
    // $ANTLR end "rule__MegalRelationshipType__Group_4__3"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__3__Impl"
    // InternalMegal.g:1694:1: rule__MegalRelationshipType__Group_4__3__Impl : ( ']' ) ;
    public final void rule__MegalRelationshipType__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1698:1: ( ( ']' ) )
            // InternalMegal.g:1699:1: ( ']' )
            {
            // InternalMegal.g:1699:1: ( ']' )
            // InternalMegal.g:1700:2: ']'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightSquareBracketKeyword_4_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getRightSquareBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4__3__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_4_2__0"
    // InternalMegal.g:1710:1: rule__MegalRelationshipType__Group_4_2__0 : rule__MegalRelationshipType__Group_4_2__0__Impl rule__MegalRelationshipType__Group_4_2__1 ;
    public final void rule__MegalRelationshipType__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1714:1: ( rule__MegalRelationshipType__Group_4_2__0__Impl rule__MegalRelationshipType__Group_4_2__1 )
            // InternalMegal.g:1715:2: rule__MegalRelationshipType__Group_4_2__0__Impl rule__MegalRelationshipType__Group_4_2__1
            {
            pushFollow(FOLLOW_5);
            rule__MegalRelationshipType__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group_4_2__1();

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
    // $ANTLR end "rule__MegalRelationshipType__Group_4_2__0"


    // $ANTLR start "rule__MegalRelationshipType__Group_4_2__0__Impl"
    // InternalMegal.g:1722:1: rule__MegalRelationshipType__Group_4_2__0__Impl : ( '->' ) ;
    public final void rule__MegalRelationshipType__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1726:1: ( ( '->' ) )
            // InternalMegal.g:1727:1: ( '->' )
            {
            // InternalMegal.g:1727:1: ( '->' )
            // InternalMegal.g:1728:2: '->'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getHyphenMinusGreaterThanSignKeyword_4_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getHyphenMinusGreaterThanSignKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4_2__0__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_4_2__1"
    // InternalMegal.g:1737:1: rule__MegalRelationshipType__Group_4_2__1 : rule__MegalRelationshipType__Group_4_2__1__Impl ;
    public final void rule__MegalRelationshipType__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1741:1: ( rule__MegalRelationshipType__Group_4_2__1__Impl )
            // InternalMegal.g:1742:2: rule__MegalRelationshipType__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__MegalRelationshipType__Group_4_2__1"


    // $ANTLR start "rule__MegalRelationshipType__Group_4_2__1__Impl"
    // InternalMegal.g:1748:1: rule__MegalRelationshipType__Group_4_2__1__Impl : ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_2_1 ) ) ;
    public final void rule__MegalRelationshipType__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1752:1: ( ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_2_1 ) ) )
            // InternalMegal.g:1753:1: ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_2_1 ) )
            {
            // InternalMegal.g:1753:1: ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_2_1 ) )
            // InternalMegal.g:1754:2: ( rule__MegalRelationshipType__LeftParamsAssignment_4_2_1 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsAssignment_4_2_1()); 
            // InternalMegal.g:1755:2: ( rule__MegalRelationshipType__LeftParamsAssignment_4_2_1 )
            // InternalMegal.g:1755:3: rule__MegalRelationshipType__LeftParamsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__LeftParamsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4_2__1__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__0"
    // InternalMegal.g:1764:1: rule__MegalRelationshipType__Group_8__0 : rule__MegalRelationshipType__Group_8__0__Impl rule__MegalRelationshipType__Group_8__1 ;
    public final void rule__MegalRelationshipType__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1768:1: ( rule__MegalRelationshipType__Group_8__0__Impl rule__MegalRelationshipType__Group_8__1 )
            // InternalMegal.g:1769:2: rule__MegalRelationshipType__Group_8__0__Impl rule__MegalRelationshipType__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__MegalRelationshipType__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group_8__1();

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
    // $ANTLR end "rule__MegalRelationshipType__Group_8__0"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__0__Impl"
    // InternalMegal.g:1776:1: rule__MegalRelationshipType__Group_8__0__Impl : ( '[' ) ;
    public final void rule__MegalRelationshipType__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1780:1: ( ( '[' ) )
            // InternalMegal.g:1781:1: ( '[' )
            {
            // InternalMegal.g:1781:1: ( '[' )
            // InternalMegal.g:1782:2: '['
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftSquareBracketKeyword_8_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftSquareBracketKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8__0__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__1"
    // InternalMegal.g:1791:1: rule__MegalRelationshipType__Group_8__1 : rule__MegalRelationshipType__Group_8__1__Impl rule__MegalRelationshipType__Group_8__2 ;
    public final void rule__MegalRelationshipType__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1795:1: ( rule__MegalRelationshipType__Group_8__1__Impl rule__MegalRelationshipType__Group_8__2 )
            // InternalMegal.g:1796:2: rule__MegalRelationshipType__Group_8__1__Impl rule__MegalRelationshipType__Group_8__2
            {
            pushFollow(FOLLOW_19);
            rule__MegalRelationshipType__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group_8__2();

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
    // $ANTLR end "rule__MegalRelationshipType__Group_8__1"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__1__Impl"
    // InternalMegal.g:1803:1: rule__MegalRelationshipType__Group_8__1__Impl : ( ( rule__MegalRelationshipType__RightParamsAssignment_8_1 ) ) ;
    public final void rule__MegalRelationshipType__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1807:1: ( ( ( rule__MegalRelationshipType__RightParamsAssignment_8_1 ) ) )
            // InternalMegal.g:1808:1: ( ( rule__MegalRelationshipType__RightParamsAssignment_8_1 ) )
            {
            // InternalMegal.g:1808:1: ( ( rule__MegalRelationshipType__RightParamsAssignment_8_1 ) )
            // InternalMegal.g:1809:2: ( rule__MegalRelationshipType__RightParamsAssignment_8_1 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsAssignment_8_1()); 
            // InternalMegal.g:1810:2: ( rule__MegalRelationshipType__RightParamsAssignment_8_1 )
            // InternalMegal.g:1810:3: rule__MegalRelationshipType__RightParamsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__RightParamsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8__1__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__2"
    // InternalMegal.g:1818:1: rule__MegalRelationshipType__Group_8__2 : rule__MegalRelationshipType__Group_8__2__Impl rule__MegalRelationshipType__Group_8__3 ;
    public final void rule__MegalRelationshipType__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1822:1: ( rule__MegalRelationshipType__Group_8__2__Impl rule__MegalRelationshipType__Group_8__3 )
            // InternalMegal.g:1823:2: rule__MegalRelationshipType__Group_8__2__Impl rule__MegalRelationshipType__Group_8__3
            {
            pushFollow(FOLLOW_19);
            rule__MegalRelationshipType__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group_8__3();

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
    // $ANTLR end "rule__MegalRelationshipType__Group_8__2"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__2__Impl"
    // InternalMegal.g:1830:1: rule__MegalRelationshipType__Group_8__2__Impl : ( ( rule__MegalRelationshipType__Group_8_2__0 )* ) ;
    public final void rule__MegalRelationshipType__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1834:1: ( ( ( rule__MegalRelationshipType__Group_8_2__0 )* ) )
            // InternalMegal.g:1835:1: ( ( rule__MegalRelationshipType__Group_8_2__0 )* )
            {
            // InternalMegal.g:1835:1: ( ( rule__MegalRelationshipType__Group_8_2__0 )* )
            // InternalMegal.g:1836:2: ( rule__MegalRelationshipType__Group_8_2__0 )*
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getGroup_8_2()); 
            // InternalMegal.g:1837:2: ( rule__MegalRelationshipType__Group_8_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMegal.g:1837:3: rule__MegalRelationshipType__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__MegalRelationshipType__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMegalRelationshipTypeAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8__2__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__3"
    // InternalMegal.g:1845:1: rule__MegalRelationshipType__Group_8__3 : rule__MegalRelationshipType__Group_8__3__Impl ;
    public final void rule__MegalRelationshipType__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1849:1: ( rule__MegalRelationshipType__Group_8__3__Impl )
            // InternalMegal.g:1850:2: rule__MegalRelationshipType__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group_8__3__Impl();

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
    // $ANTLR end "rule__MegalRelationshipType__Group_8__3"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__3__Impl"
    // InternalMegal.g:1856:1: rule__MegalRelationshipType__Group_8__3__Impl : ( ']' ) ;
    public final void rule__MegalRelationshipType__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1860:1: ( ( ']' ) )
            // InternalMegal.g:1861:1: ( ']' )
            {
            // InternalMegal.g:1861:1: ( ']' )
            // InternalMegal.g:1862:2: ']'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightSquareBracketKeyword_8_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getRightSquareBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8__3__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_8_2__0"
    // InternalMegal.g:1872:1: rule__MegalRelationshipType__Group_8_2__0 : rule__MegalRelationshipType__Group_8_2__0__Impl rule__MegalRelationshipType__Group_8_2__1 ;
    public final void rule__MegalRelationshipType__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1876:1: ( rule__MegalRelationshipType__Group_8_2__0__Impl rule__MegalRelationshipType__Group_8_2__1 )
            // InternalMegal.g:1877:2: rule__MegalRelationshipType__Group_8_2__0__Impl rule__MegalRelationshipType__Group_8_2__1
            {
            pushFollow(FOLLOW_5);
            rule__MegalRelationshipType__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group_8_2__1();

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
    // $ANTLR end "rule__MegalRelationshipType__Group_8_2__0"


    // $ANTLR start "rule__MegalRelationshipType__Group_8_2__0__Impl"
    // InternalMegal.g:1884:1: rule__MegalRelationshipType__Group_8_2__0__Impl : ( '->' ) ;
    public final void rule__MegalRelationshipType__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1888:1: ( ( '->' ) )
            // InternalMegal.g:1889:1: ( '->' )
            {
            // InternalMegal.g:1889:1: ( '->' )
            // InternalMegal.g:1890:2: '->'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getHyphenMinusGreaterThanSignKeyword_8_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getHyphenMinusGreaterThanSignKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8_2__0__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_8_2__1"
    // InternalMegal.g:1899:1: rule__MegalRelationshipType__Group_8_2__1 : rule__MegalRelationshipType__Group_8_2__1__Impl ;
    public final void rule__MegalRelationshipType__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1903:1: ( rule__MegalRelationshipType__Group_8_2__1__Impl )
            // InternalMegal.g:1904:2: rule__MegalRelationshipType__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__Group_8_2__1__Impl();

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
    // $ANTLR end "rule__MegalRelationshipType__Group_8_2__1"


    // $ANTLR start "rule__MegalRelationshipType__Group_8_2__1__Impl"
    // InternalMegal.g:1910:1: rule__MegalRelationshipType__Group_8_2__1__Impl : ( ( rule__MegalRelationshipType__RightParamsAssignment_8_2_1 ) ) ;
    public final void rule__MegalRelationshipType__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1914:1: ( ( ( rule__MegalRelationshipType__RightParamsAssignment_8_2_1 ) ) )
            // InternalMegal.g:1915:1: ( ( rule__MegalRelationshipType__RightParamsAssignment_8_2_1 ) )
            {
            // InternalMegal.g:1915:1: ( ( rule__MegalRelationshipType__RightParamsAssignment_8_2_1 ) )
            // InternalMegal.g:1916:2: ( rule__MegalRelationshipType__RightParamsAssignment_8_2_1 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsAssignment_8_2_1()); 
            // InternalMegal.g:1917:2: ( rule__MegalRelationshipType__RightParamsAssignment_8_2_1 )
            // InternalMegal.g:1917:3: rule__MegalRelationshipType__RightParamsAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationshipType__RightParamsAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsAssignment_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8_2__1__Impl"


    // $ANTLR start "rule__MegalEntity__Group__0"
    // InternalMegal.g:1926:1: rule__MegalEntity__Group__0 : rule__MegalEntity__Group__0__Impl rule__MegalEntity__Group__1 ;
    public final void rule__MegalEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1930:1: ( rule__MegalEntity__Group__0__Impl rule__MegalEntity__Group__1 )
            // InternalMegal.g:1931:2: rule__MegalEntity__Group__0__Impl rule__MegalEntity__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MegalEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalEntity__Group__1();

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
    // $ANTLR end "rule__MegalEntity__Group__0"


    // $ANTLR start "rule__MegalEntity__Group__0__Impl"
    // InternalMegal.g:1938:1: rule__MegalEntity__Group__0__Impl : ( ( rule__MegalEntity__AnnotationsAssignment_0 )* ) ;
    public final void rule__MegalEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1942:1: ( ( ( rule__MegalEntity__AnnotationsAssignment_0 )* ) )
            // InternalMegal.g:1943:1: ( ( rule__MegalEntity__AnnotationsAssignment_0 )* )
            {
            // InternalMegal.g:1943:1: ( ( rule__MegalEntity__AnnotationsAssignment_0 )* )
            // InternalMegal.g:1944:2: ( rule__MegalEntity__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getMegalEntityAccess().getAnnotationsAssignment_0()); 
            // InternalMegal.g:1945:2: ( rule__MegalEntity__AnnotationsAssignment_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ANN_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMegal.g:1945:3: rule__MegalEntity__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MegalEntity__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMegalEntityAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__0__Impl"


    // $ANTLR start "rule__MegalEntity__Group__1"
    // InternalMegal.g:1953:1: rule__MegalEntity__Group__1 : rule__MegalEntity__Group__1__Impl rule__MegalEntity__Group__2 ;
    public final void rule__MegalEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1957:1: ( rule__MegalEntity__Group__1__Impl rule__MegalEntity__Group__2 )
            // InternalMegal.g:1958:2: rule__MegalEntity__Group__1__Impl rule__MegalEntity__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__MegalEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalEntity__Group__2();

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
    // $ANTLR end "rule__MegalEntity__Group__1"


    // $ANTLR start "rule__MegalEntity__Group__1__Impl"
    // InternalMegal.g:1965:1: rule__MegalEntity__Group__1__Impl : ( ( rule__MegalEntity__NameAssignment_1 ) ) ;
    public final void rule__MegalEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1969:1: ( ( ( rule__MegalEntity__NameAssignment_1 ) ) )
            // InternalMegal.g:1970:1: ( ( rule__MegalEntity__NameAssignment_1 ) )
            {
            // InternalMegal.g:1970:1: ( ( rule__MegalEntity__NameAssignment_1 ) )
            // InternalMegal.g:1971:2: ( rule__MegalEntity__NameAssignment_1 )
            {
             before(grammarAccess.getMegalEntityAccess().getNameAssignment_1()); 
            // InternalMegal.g:1972:2: ( rule__MegalEntity__NameAssignment_1 )
            // InternalMegal.g:1972:3: rule__MegalEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MegalEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__1__Impl"


    // $ANTLR start "rule__MegalEntity__Group__2"
    // InternalMegal.g:1980:1: rule__MegalEntity__Group__2 : rule__MegalEntity__Group__2__Impl rule__MegalEntity__Group__3 ;
    public final void rule__MegalEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1984:1: ( rule__MegalEntity__Group__2__Impl rule__MegalEntity__Group__3 )
            // InternalMegal.g:1985:2: rule__MegalEntity__Group__2__Impl rule__MegalEntity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MegalEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalEntity__Group__3();

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
    // $ANTLR end "rule__MegalEntity__Group__2"


    // $ANTLR start "rule__MegalEntity__Group__2__Impl"
    // InternalMegal.g:1992:1: rule__MegalEntity__Group__2__Impl : ( ':' ) ;
    public final void rule__MegalEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:1996:1: ( ( ':' ) )
            // InternalMegal.g:1997:1: ( ':' )
            {
            // InternalMegal.g:1997:1: ( ':' )
            // InternalMegal.g:1998:2: ':'
            {
             before(grammarAccess.getMegalEntityAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMegalEntityAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__2__Impl"


    // $ANTLR start "rule__MegalEntity__Group__3"
    // InternalMegal.g:2007:1: rule__MegalEntity__Group__3 : rule__MegalEntity__Group__3__Impl rule__MegalEntity__Group__4 ;
    public final void rule__MegalEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2011:1: ( rule__MegalEntity__Group__3__Impl rule__MegalEntity__Group__4 )
            // InternalMegal.g:2012:2: rule__MegalEntity__Group__3__Impl rule__MegalEntity__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__MegalEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalEntity__Group__4();

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
    // $ANTLR end "rule__MegalEntity__Group__3"


    // $ANTLR start "rule__MegalEntity__Group__3__Impl"
    // InternalMegal.g:2019:1: rule__MegalEntity__Group__3__Impl : ( ( rule__MegalEntity__TypeAssignment_3 ) ) ;
    public final void rule__MegalEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2023:1: ( ( ( rule__MegalEntity__TypeAssignment_3 ) ) )
            // InternalMegal.g:2024:1: ( ( rule__MegalEntity__TypeAssignment_3 ) )
            {
            // InternalMegal.g:2024:1: ( ( rule__MegalEntity__TypeAssignment_3 ) )
            // InternalMegal.g:2025:2: ( rule__MegalEntity__TypeAssignment_3 )
            {
             before(grammarAccess.getMegalEntityAccess().getTypeAssignment_3()); 
            // InternalMegal.g:2026:2: ( rule__MegalEntity__TypeAssignment_3 )
            // InternalMegal.g:2026:3: rule__MegalEntity__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MegalEntity__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__3__Impl"


    // $ANTLR start "rule__MegalEntity__Group__4"
    // InternalMegal.g:2034:1: rule__MegalEntity__Group__4 : rule__MegalEntity__Group__4__Impl rule__MegalEntity__Group__5 ;
    public final void rule__MegalEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2038:1: ( rule__MegalEntity__Group__4__Impl rule__MegalEntity__Group__5 )
            // InternalMegal.g:2039:2: rule__MegalEntity__Group__4__Impl rule__MegalEntity__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__MegalEntity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalEntity__Group__5();

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
    // $ANTLR end "rule__MegalEntity__Group__4"


    // $ANTLR start "rule__MegalEntity__Group__4__Impl"
    // InternalMegal.g:2046:1: rule__MegalEntity__Group__4__Impl : ( ( rule__MegalEntity__Group_4__0 )? ) ;
    public final void rule__MegalEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2050:1: ( ( ( rule__MegalEntity__Group_4__0 )? ) )
            // InternalMegal.g:2051:1: ( ( rule__MegalEntity__Group_4__0 )? )
            {
            // InternalMegal.g:2051:1: ( ( rule__MegalEntity__Group_4__0 )? )
            // InternalMegal.g:2052:2: ( rule__MegalEntity__Group_4__0 )?
            {
             before(grammarAccess.getMegalEntityAccess().getGroup_4()); 
            // InternalMegal.g:2053:2: ( rule__MegalEntity__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMegal.g:2053:3: rule__MegalEntity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalEntity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalEntityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__4__Impl"


    // $ANTLR start "rule__MegalEntity__Group__5"
    // InternalMegal.g:2061:1: rule__MegalEntity__Group__5 : rule__MegalEntity__Group__5__Impl ;
    public final void rule__MegalEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2065:1: ( rule__MegalEntity__Group__5__Impl )
            // InternalMegal.g:2066:2: rule__MegalEntity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalEntity__Group__5__Impl();

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
    // $ANTLR end "rule__MegalEntity__Group__5"


    // $ANTLR start "rule__MegalEntity__Group__5__Impl"
    // InternalMegal.g:2072:1: rule__MegalEntity__Group__5__Impl : ( ( rule__MegalEntity__ManyAssignment_5 )? ) ;
    public final void rule__MegalEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2076:1: ( ( ( rule__MegalEntity__ManyAssignment_5 )? ) )
            // InternalMegal.g:2077:1: ( ( rule__MegalEntity__ManyAssignment_5 )? )
            {
            // InternalMegal.g:2077:1: ( ( rule__MegalEntity__ManyAssignment_5 )? )
            // InternalMegal.g:2078:2: ( rule__MegalEntity__ManyAssignment_5 )?
            {
             before(grammarAccess.getMegalEntityAccess().getManyAssignment_5()); 
            // InternalMegal.g:2079:2: ( rule__MegalEntity__ManyAssignment_5 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMegal.g:2079:3: rule__MegalEntity__ManyAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__MegalEntity__ManyAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalEntityAccess().getManyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__5__Impl"


    // $ANTLR start "rule__MegalEntity__Group_4__0"
    // InternalMegal.g:2088:1: rule__MegalEntity__Group_4__0 : rule__MegalEntity__Group_4__0__Impl rule__MegalEntity__Group_4__1 ;
    public final void rule__MegalEntity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2092:1: ( rule__MegalEntity__Group_4__0__Impl rule__MegalEntity__Group_4__1 )
            // InternalMegal.g:2093:2: rule__MegalEntity__Group_4__0__Impl rule__MegalEntity__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__MegalEntity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalEntity__Group_4__1();

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
    // $ANTLR end "rule__MegalEntity__Group_4__0"


    // $ANTLR start "rule__MegalEntity__Group_4__0__Impl"
    // InternalMegal.g:2100:1: rule__MegalEntity__Group_4__0__Impl : ( '[' ) ;
    public final void rule__MegalEntity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2104:1: ( ( '[' ) )
            // InternalMegal.g:2105:1: ( '[' )
            {
            // InternalMegal.g:2105:1: ( '[' )
            // InternalMegal.g:2106:2: '['
            {
             before(grammarAccess.getMegalEntityAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMegalEntityAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4__0__Impl"


    // $ANTLR start "rule__MegalEntity__Group_4__1"
    // InternalMegal.g:2115:1: rule__MegalEntity__Group_4__1 : rule__MegalEntity__Group_4__1__Impl rule__MegalEntity__Group_4__2 ;
    public final void rule__MegalEntity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2119:1: ( rule__MegalEntity__Group_4__1__Impl rule__MegalEntity__Group_4__2 )
            // InternalMegal.g:2120:2: rule__MegalEntity__Group_4__1__Impl rule__MegalEntity__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__MegalEntity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalEntity__Group_4__2();

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
    // $ANTLR end "rule__MegalEntity__Group_4__1"


    // $ANTLR start "rule__MegalEntity__Group_4__1__Impl"
    // InternalMegal.g:2127:1: rule__MegalEntity__Group_4__1__Impl : ( ( rule__MegalEntity__ParamsAssignment_4_1 ) ) ;
    public final void rule__MegalEntity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2131:1: ( ( ( rule__MegalEntity__ParamsAssignment_4_1 ) ) )
            // InternalMegal.g:2132:1: ( ( rule__MegalEntity__ParamsAssignment_4_1 ) )
            {
            // InternalMegal.g:2132:1: ( ( rule__MegalEntity__ParamsAssignment_4_1 ) )
            // InternalMegal.g:2133:2: ( rule__MegalEntity__ParamsAssignment_4_1 )
            {
             before(grammarAccess.getMegalEntityAccess().getParamsAssignment_4_1()); 
            // InternalMegal.g:2134:2: ( rule__MegalEntity__ParamsAssignment_4_1 )
            // InternalMegal.g:2134:3: rule__MegalEntity__ParamsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MegalEntity__ParamsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityAccess().getParamsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4__1__Impl"


    // $ANTLR start "rule__MegalEntity__Group_4__2"
    // InternalMegal.g:2142:1: rule__MegalEntity__Group_4__2 : rule__MegalEntity__Group_4__2__Impl rule__MegalEntity__Group_4__3 ;
    public final void rule__MegalEntity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2146:1: ( rule__MegalEntity__Group_4__2__Impl rule__MegalEntity__Group_4__3 )
            // InternalMegal.g:2147:2: rule__MegalEntity__Group_4__2__Impl rule__MegalEntity__Group_4__3
            {
            pushFollow(FOLLOW_19);
            rule__MegalEntity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalEntity__Group_4__3();

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
    // $ANTLR end "rule__MegalEntity__Group_4__2"


    // $ANTLR start "rule__MegalEntity__Group_4__2__Impl"
    // InternalMegal.g:2154:1: rule__MegalEntity__Group_4__2__Impl : ( ( rule__MegalEntity__Group_4_2__0 )* ) ;
    public final void rule__MegalEntity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2158:1: ( ( ( rule__MegalEntity__Group_4_2__0 )* ) )
            // InternalMegal.g:2159:1: ( ( rule__MegalEntity__Group_4_2__0 )* )
            {
            // InternalMegal.g:2159:1: ( ( rule__MegalEntity__Group_4_2__0 )* )
            // InternalMegal.g:2160:2: ( rule__MegalEntity__Group_4_2__0 )*
            {
             before(grammarAccess.getMegalEntityAccess().getGroup_4_2()); 
            // InternalMegal.g:2161:2: ( rule__MegalEntity__Group_4_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMegal.g:2161:3: rule__MegalEntity__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__MegalEntity__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMegalEntityAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4__2__Impl"


    // $ANTLR start "rule__MegalEntity__Group_4__3"
    // InternalMegal.g:2169:1: rule__MegalEntity__Group_4__3 : rule__MegalEntity__Group_4__3__Impl ;
    public final void rule__MegalEntity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2173:1: ( rule__MegalEntity__Group_4__3__Impl )
            // InternalMegal.g:2174:2: rule__MegalEntity__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalEntity__Group_4__3__Impl();

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
    // $ANTLR end "rule__MegalEntity__Group_4__3"


    // $ANTLR start "rule__MegalEntity__Group_4__3__Impl"
    // InternalMegal.g:2180:1: rule__MegalEntity__Group_4__3__Impl : ( ']' ) ;
    public final void rule__MegalEntity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2184:1: ( ( ']' ) )
            // InternalMegal.g:2185:1: ( ']' )
            {
            // InternalMegal.g:2185:1: ( ']' )
            // InternalMegal.g:2186:2: ']'
            {
             before(grammarAccess.getMegalEntityAccess().getRightSquareBracketKeyword_4_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMegalEntityAccess().getRightSquareBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4__3__Impl"


    // $ANTLR start "rule__MegalEntity__Group_4_2__0"
    // InternalMegal.g:2196:1: rule__MegalEntity__Group_4_2__0 : rule__MegalEntity__Group_4_2__0__Impl rule__MegalEntity__Group_4_2__1 ;
    public final void rule__MegalEntity__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2200:1: ( rule__MegalEntity__Group_4_2__0__Impl rule__MegalEntity__Group_4_2__1 )
            // InternalMegal.g:2201:2: rule__MegalEntity__Group_4_2__0__Impl rule__MegalEntity__Group_4_2__1
            {
            pushFollow(FOLLOW_5);
            rule__MegalEntity__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalEntity__Group_4_2__1();

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
    // $ANTLR end "rule__MegalEntity__Group_4_2__0"


    // $ANTLR start "rule__MegalEntity__Group_4_2__0__Impl"
    // InternalMegal.g:2208:1: rule__MegalEntity__Group_4_2__0__Impl : ( '->' ) ;
    public final void rule__MegalEntity__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2212:1: ( ( '->' ) )
            // InternalMegal.g:2213:1: ( '->' )
            {
            // InternalMegal.g:2213:1: ( '->' )
            // InternalMegal.g:2214:2: '->'
            {
             before(grammarAccess.getMegalEntityAccess().getHyphenMinusGreaterThanSignKeyword_4_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMegalEntityAccess().getHyphenMinusGreaterThanSignKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4_2__0__Impl"


    // $ANTLR start "rule__MegalEntity__Group_4_2__1"
    // InternalMegal.g:2223:1: rule__MegalEntity__Group_4_2__1 : rule__MegalEntity__Group_4_2__1__Impl ;
    public final void rule__MegalEntity__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2227:1: ( rule__MegalEntity__Group_4_2__1__Impl )
            // InternalMegal.g:2228:2: rule__MegalEntity__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalEntity__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__MegalEntity__Group_4_2__1"


    // $ANTLR start "rule__MegalEntity__Group_4_2__1__Impl"
    // InternalMegal.g:2234:1: rule__MegalEntity__Group_4_2__1__Impl : ( ( rule__MegalEntity__ParamsAssignment_4_2_1 ) ) ;
    public final void rule__MegalEntity__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2238:1: ( ( ( rule__MegalEntity__ParamsAssignment_4_2_1 ) ) )
            // InternalMegal.g:2239:1: ( ( rule__MegalEntity__ParamsAssignment_4_2_1 ) )
            {
            // InternalMegal.g:2239:1: ( ( rule__MegalEntity__ParamsAssignment_4_2_1 ) )
            // InternalMegal.g:2240:2: ( rule__MegalEntity__ParamsAssignment_4_2_1 )
            {
             before(grammarAccess.getMegalEntityAccess().getParamsAssignment_4_2_1()); 
            // InternalMegal.g:2241:2: ( rule__MegalEntity__ParamsAssignment_4_2_1 )
            // InternalMegal.g:2241:3: rule__MegalEntity__ParamsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MegalEntity__ParamsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityAccess().getParamsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4_2__1__Impl"


    // $ANTLR start "rule__MegalRelationship__Group__0"
    // InternalMegal.g:2250:1: rule__MegalRelationship__Group__0 : rule__MegalRelationship__Group__0__Impl rule__MegalRelationship__Group__1 ;
    public final void rule__MegalRelationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2254:1: ( rule__MegalRelationship__Group__0__Impl rule__MegalRelationship__Group__1 )
            // InternalMegal.g:2255:2: rule__MegalRelationship__Group__0__Impl rule__MegalRelationship__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MegalRelationship__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationship__Group__1();

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
    // $ANTLR end "rule__MegalRelationship__Group__0"


    // $ANTLR start "rule__MegalRelationship__Group__0__Impl"
    // InternalMegal.g:2262:1: rule__MegalRelationship__Group__0__Impl : ( ( rule__MegalRelationship__AnnotationsAssignment_0 )* ) ;
    public final void rule__MegalRelationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2266:1: ( ( ( rule__MegalRelationship__AnnotationsAssignment_0 )* ) )
            // InternalMegal.g:2267:1: ( ( rule__MegalRelationship__AnnotationsAssignment_0 )* )
            {
            // InternalMegal.g:2267:1: ( ( rule__MegalRelationship__AnnotationsAssignment_0 )* )
            // InternalMegal.g:2268:2: ( rule__MegalRelationship__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getMegalRelationshipAccess().getAnnotationsAssignment_0()); 
            // InternalMegal.g:2269:2: ( rule__MegalRelationship__AnnotationsAssignment_0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ANN_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMegal.g:2269:3: rule__MegalRelationship__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MegalRelationship__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getMegalRelationshipAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__Group__0__Impl"


    // $ANTLR start "rule__MegalRelationship__Group__1"
    // InternalMegal.g:2277:1: rule__MegalRelationship__Group__1 : rule__MegalRelationship__Group__1__Impl rule__MegalRelationship__Group__2 ;
    public final void rule__MegalRelationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2281:1: ( rule__MegalRelationship__Group__1__Impl rule__MegalRelationship__Group__2 )
            // InternalMegal.g:2282:2: rule__MegalRelationship__Group__1__Impl rule__MegalRelationship__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MegalRelationship__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationship__Group__2();

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
    // $ANTLR end "rule__MegalRelationship__Group__1"


    // $ANTLR start "rule__MegalRelationship__Group__1__Impl"
    // InternalMegal.g:2289:1: rule__MegalRelationship__Group__1__Impl : ( ( rule__MegalRelationship__LeftAssignment_1 ) ) ;
    public final void rule__MegalRelationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2293:1: ( ( ( rule__MegalRelationship__LeftAssignment_1 ) ) )
            // InternalMegal.g:2294:1: ( ( rule__MegalRelationship__LeftAssignment_1 ) )
            {
            // InternalMegal.g:2294:1: ( ( rule__MegalRelationship__LeftAssignment_1 ) )
            // InternalMegal.g:2295:2: ( rule__MegalRelationship__LeftAssignment_1 )
            {
             before(grammarAccess.getMegalRelationshipAccess().getLeftAssignment_1()); 
            // InternalMegal.g:2296:2: ( rule__MegalRelationship__LeftAssignment_1 )
            // InternalMegal.g:2296:3: rule__MegalRelationship__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationship__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipAccess().getLeftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__Group__1__Impl"


    // $ANTLR start "rule__MegalRelationship__Group__2"
    // InternalMegal.g:2304:1: rule__MegalRelationship__Group__2 : rule__MegalRelationship__Group__2__Impl rule__MegalRelationship__Group__3 ;
    public final void rule__MegalRelationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2308:1: ( rule__MegalRelationship__Group__2__Impl rule__MegalRelationship__Group__3 )
            // InternalMegal.g:2309:2: rule__MegalRelationship__Group__2__Impl rule__MegalRelationship__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MegalRelationship__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalRelationship__Group__3();

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
    // $ANTLR end "rule__MegalRelationship__Group__2"


    // $ANTLR start "rule__MegalRelationship__Group__2__Impl"
    // InternalMegal.g:2316:1: rule__MegalRelationship__Group__2__Impl : ( ( rule__MegalRelationship__TypeAssignment_2 ) ) ;
    public final void rule__MegalRelationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2320:1: ( ( ( rule__MegalRelationship__TypeAssignment_2 ) ) )
            // InternalMegal.g:2321:1: ( ( rule__MegalRelationship__TypeAssignment_2 ) )
            {
            // InternalMegal.g:2321:1: ( ( rule__MegalRelationship__TypeAssignment_2 ) )
            // InternalMegal.g:2322:2: ( rule__MegalRelationship__TypeAssignment_2 )
            {
             before(grammarAccess.getMegalRelationshipAccess().getTypeAssignment_2()); 
            // InternalMegal.g:2323:2: ( rule__MegalRelationship__TypeAssignment_2 )
            // InternalMegal.g:2323:3: rule__MegalRelationship__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationship__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__Group__2__Impl"


    // $ANTLR start "rule__MegalRelationship__Group__3"
    // InternalMegal.g:2331:1: rule__MegalRelationship__Group__3 : rule__MegalRelationship__Group__3__Impl ;
    public final void rule__MegalRelationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2335:1: ( rule__MegalRelationship__Group__3__Impl )
            // InternalMegal.g:2336:2: rule__MegalRelationship__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationship__Group__3__Impl();

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
    // $ANTLR end "rule__MegalRelationship__Group__3"


    // $ANTLR start "rule__MegalRelationship__Group__3__Impl"
    // InternalMegal.g:2342:1: rule__MegalRelationship__Group__3__Impl : ( ( rule__MegalRelationship__RightAssignment_3 ) ) ;
    public final void rule__MegalRelationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2346:1: ( ( ( rule__MegalRelationship__RightAssignment_3 ) ) )
            // InternalMegal.g:2347:1: ( ( rule__MegalRelationship__RightAssignment_3 ) )
            {
            // InternalMegal.g:2347:1: ( ( rule__MegalRelationship__RightAssignment_3 ) )
            // InternalMegal.g:2348:2: ( rule__MegalRelationship__RightAssignment_3 )
            {
             before(grammarAccess.getMegalRelationshipAccess().getRightAssignment_3()); 
            // InternalMegal.g:2349:2: ( rule__MegalRelationship__RightAssignment_3 )
            // InternalMegal.g:2349:3: rule__MegalRelationship__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MegalRelationship__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipAccess().getRightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__Group__3__Impl"


    // $ANTLR start "rule__MegalPair__Group__0"
    // InternalMegal.g:2358:1: rule__MegalPair__Group__0 : rule__MegalPair__Group__0__Impl rule__MegalPair__Group__1 ;
    public final void rule__MegalPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2362:1: ( rule__MegalPair__Group__0__Impl rule__MegalPair__Group__1 )
            // InternalMegal.g:2363:2: rule__MegalPair__Group__0__Impl rule__MegalPair__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MegalPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalPair__Group__1();

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
    // $ANTLR end "rule__MegalPair__Group__0"


    // $ANTLR start "rule__MegalPair__Group__0__Impl"
    // InternalMegal.g:2370:1: rule__MegalPair__Group__0__Impl : ( ( rule__MegalPair__AnnotationsAssignment_0 )* ) ;
    public final void rule__MegalPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2374:1: ( ( ( rule__MegalPair__AnnotationsAssignment_0 )* ) )
            // InternalMegal.g:2375:1: ( ( rule__MegalPair__AnnotationsAssignment_0 )* )
            {
            // InternalMegal.g:2375:1: ( ( rule__MegalPair__AnnotationsAssignment_0 )* )
            // InternalMegal.g:2376:2: ( rule__MegalPair__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getMegalPairAccess().getAnnotationsAssignment_0()); 
            // InternalMegal.g:2377:2: ( rule__MegalPair__AnnotationsAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ANN_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMegal.g:2377:3: rule__MegalPair__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MegalPair__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMegalPairAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__0__Impl"


    // $ANTLR start "rule__MegalPair__Group__1"
    // InternalMegal.g:2385:1: rule__MegalPair__Group__1 : rule__MegalPair__Group__1__Impl rule__MegalPair__Group__2 ;
    public final void rule__MegalPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2389:1: ( rule__MegalPair__Group__1__Impl rule__MegalPair__Group__2 )
            // InternalMegal.g:2390:2: rule__MegalPair__Group__1__Impl rule__MegalPair__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__MegalPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalPair__Group__2();

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
    // $ANTLR end "rule__MegalPair__Group__1"


    // $ANTLR start "rule__MegalPair__Group__1__Impl"
    // InternalMegal.g:2397:1: rule__MegalPair__Group__1__Impl : ( ( rule__MegalPair__SetAssignment_1 ) ) ;
    public final void rule__MegalPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2401:1: ( ( ( rule__MegalPair__SetAssignment_1 ) ) )
            // InternalMegal.g:2402:1: ( ( rule__MegalPair__SetAssignment_1 ) )
            {
            // InternalMegal.g:2402:1: ( ( rule__MegalPair__SetAssignment_1 ) )
            // InternalMegal.g:2403:2: ( rule__MegalPair__SetAssignment_1 )
            {
             before(grammarAccess.getMegalPairAccess().getSetAssignment_1()); 
            // InternalMegal.g:2404:2: ( rule__MegalPair__SetAssignment_1 )
            // InternalMegal.g:2404:3: rule__MegalPair__SetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MegalPair__SetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalPairAccess().getSetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__1__Impl"


    // $ANTLR start "rule__MegalPair__Group__2"
    // InternalMegal.g:2412:1: rule__MegalPair__Group__2 : rule__MegalPair__Group__2__Impl rule__MegalPair__Group__3 ;
    public final void rule__MegalPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2416:1: ( rule__MegalPair__Group__2__Impl rule__MegalPair__Group__3 )
            // InternalMegal.g:2417:2: rule__MegalPair__Group__2__Impl rule__MegalPair__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MegalPair__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalPair__Group__3();

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
    // $ANTLR end "rule__MegalPair__Group__2"


    // $ANTLR start "rule__MegalPair__Group__2__Impl"
    // InternalMegal.g:2424:1: rule__MegalPair__Group__2__Impl : ( '(' ) ;
    public final void rule__MegalPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2428:1: ( ( '(' ) )
            // InternalMegal.g:2429:1: ( '(' )
            {
            // InternalMegal.g:2429:1: ( '(' )
            // InternalMegal.g:2430:2: '('
            {
             before(grammarAccess.getMegalPairAccess().getLeftParenthesisKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMegalPairAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__2__Impl"


    // $ANTLR start "rule__MegalPair__Group__3"
    // InternalMegal.g:2439:1: rule__MegalPair__Group__3 : rule__MegalPair__Group__3__Impl rule__MegalPair__Group__4 ;
    public final void rule__MegalPair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2443:1: ( rule__MegalPair__Group__3__Impl rule__MegalPair__Group__4 )
            // InternalMegal.g:2444:2: rule__MegalPair__Group__3__Impl rule__MegalPair__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__MegalPair__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalPair__Group__4();

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
    // $ANTLR end "rule__MegalPair__Group__3"


    // $ANTLR start "rule__MegalPair__Group__3__Impl"
    // InternalMegal.g:2451:1: rule__MegalPair__Group__3__Impl : ( ( rule__MegalPair__FirstAssignment_3 ) ) ;
    public final void rule__MegalPair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2455:1: ( ( ( rule__MegalPair__FirstAssignment_3 ) ) )
            // InternalMegal.g:2456:1: ( ( rule__MegalPair__FirstAssignment_3 ) )
            {
            // InternalMegal.g:2456:1: ( ( rule__MegalPair__FirstAssignment_3 ) )
            // InternalMegal.g:2457:2: ( rule__MegalPair__FirstAssignment_3 )
            {
             before(grammarAccess.getMegalPairAccess().getFirstAssignment_3()); 
            // InternalMegal.g:2458:2: ( rule__MegalPair__FirstAssignment_3 )
            // InternalMegal.g:2458:3: rule__MegalPair__FirstAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MegalPair__FirstAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMegalPairAccess().getFirstAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__3__Impl"


    // $ANTLR start "rule__MegalPair__Group__4"
    // InternalMegal.g:2466:1: rule__MegalPair__Group__4 : rule__MegalPair__Group__4__Impl rule__MegalPair__Group__5 ;
    public final void rule__MegalPair__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2470:1: ( rule__MegalPair__Group__4__Impl rule__MegalPair__Group__5 )
            // InternalMegal.g:2471:2: rule__MegalPair__Group__4__Impl rule__MegalPair__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__MegalPair__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalPair__Group__5();

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
    // $ANTLR end "rule__MegalPair__Group__4"


    // $ANTLR start "rule__MegalPair__Group__4__Impl"
    // InternalMegal.g:2478:1: rule__MegalPair__Group__4__Impl : ( ')' ) ;
    public final void rule__MegalPair__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2482:1: ( ( ')' ) )
            // InternalMegal.g:2483:1: ( ')' )
            {
            // InternalMegal.g:2483:1: ( ')' )
            // InternalMegal.g:2484:2: ')'
            {
             before(grammarAccess.getMegalPairAccess().getRightParenthesisKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMegalPairAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__4__Impl"


    // $ANTLR start "rule__MegalPair__Group__5"
    // InternalMegal.g:2493:1: rule__MegalPair__Group__5 : rule__MegalPair__Group__5__Impl rule__MegalPair__Group__6 ;
    public final void rule__MegalPair__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2497:1: ( rule__MegalPair__Group__5__Impl rule__MegalPair__Group__6 )
            // InternalMegal.g:2498:2: rule__MegalPair__Group__5__Impl rule__MegalPair__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__MegalPair__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MegalPair__Group__6();

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
    // $ANTLR end "rule__MegalPair__Group__5"


    // $ANTLR start "rule__MegalPair__Group__5__Impl"
    // InternalMegal.g:2505:1: rule__MegalPair__Group__5__Impl : ( '|->' ) ;
    public final void rule__MegalPair__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2509:1: ( ( '|->' ) )
            // InternalMegal.g:2510:1: ( '|->' )
            {
            // InternalMegal.g:2510:1: ( '|->' )
            // InternalMegal.g:2511:2: '|->'
            {
             before(grammarAccess.getMegalPairAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMegalPairAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__5__Impl"


    // $ANTLR start "rule__MegalPair__Group__6"
    // InternalMegal.g:2520:1: rule__MegalPair__Group__6 : rule__MegalPair__Group__6__Impl ;
    public final void rule__MegalPair__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2524:1: ( rule__MegalPair__Group__6__Impl )
            // InternalMegal.g:2525:2: rule__MegalPair__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MegalPair__Group__6__Impl();

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
    // $ANTLR end "rule__MegalPair__Group__6"


    // $ANTLR start "rule__MegalPair__Group__6__Impl"
    // InternalMegal.g:2531:1: rule__MegalPair__Group__6__Impl : ( ( rule__MegalPair__SecondAssignment_6 ) ) ;
    public final void rule__MegalPair__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2535:1: ( ( ( rule__MegalPair__SecondAssignment_6 ) ) )
            // InternalMegal.g:2536:1: ( ( rule__MegalPair__SecondAssignment_6 ) )
            {
            // InternalMegal.g:2536:1: ( ( rule__MegalPair__SecondAssignment_6 ) )
            // InternalMegal.g:2537:2: ( rule__MegalPair__SecondAssignment_6 )
            {
             before(grammarAccess.getMegalPairAccess().getSecondAssignment_6()); 
            // InternalMegal.g:2538:2: ( rule__MegalPair__SecondAssignment_6 )
            // InternalMegal.g:2538:3: rule__MegalPair__SecondAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__MegalPair__SecondAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMegalPairAccess().getSecondAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__6__Impl"


    // $ANTLR start "rule__Selection__Group__0"
    // InternalMegal.g:2547:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2551:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // InternalMegal.g:2552:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Selection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group__1();

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
    // $ANTLR end "rule__Selection__Group__0"


    // $ANTLR start "rule__Selection__Group__0__Impl"
    // InternalMegal.g:2559:1: rule__Selection__Group__0__Impl : ( ( rule__Selection__SelectAssignment_0 ) ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2563:1: ( ( ( rule__Selection__SelectAssignment_0 ) ) )
            // InternalMegal.g:2564:1: ( ( rule__Selection__SelectAssignment_0 ) )
            {
            // InternalMegal.g:2564:1: ( ( rule__Selection__SelectAssignment_0 ) )
            // InternalMegal.g:2565:2: ( rule__Selection__SelectAssignment_0 )
            {
             before(grammarAccess.getSelectionAccess().getSelectAssignment_0()); 
            // InternalMegal.g:2566:2: ( rule__Selection__SelectAssignment_0 )
            // InternalMegal.g:2566:3: rule__Selection__SelectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Selection__SelectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getSelectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__0__Impl"


    // $ANTLR start "rule__Selection__Group__1"
    // InternalMegal.g:2574:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2578:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // InternalMegal.g:2579:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Selection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group__2();

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
    // $ANTLR end "rule__Selection__Group__1"


    // $ANTLR start "rule__Selection__Group__1__Impl"
    // InternalMegal.g:2586:1: rule__Selection__Group__1__Impl : ( ( rule__Selection__Group_1__0 )* ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2590:1: ( ( ( rule__Selection__Group_1__0 )* ) )
            // InternalMegal.g:2591:1: ( ( rule__Selection__Group_1__0 )* )
            {
            // InternalMegal.g:2591:1: ( ( rule__Selection__Group_1__0 )* )
            // InternalMegal.g:2592:2: ( rule__Selection__Group_1__0 )*
            {
             before(grammarAccess.getSelectionAccess().getGroup_1()); 
            // InternalMegal.g:2593:2: ( rule__Selection__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==25) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMegal.g:2593:3: rule__Selection__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Selection__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getSelectionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__1__Impl"


    // $ANTLR start "rule__Selection__Group__2"
    // InternalMegal.g:2601:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2605:1: ( rule__Selection__Group__2__Impl )
            // InternalMegal.g:2606:2: rule__Selection__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group__2__Impl();

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
    // $ANTLR end "rule__Selection__Group__2"


    // $ANTLR start "rule__Selection__Group__2__Impl"
    // InternalMegal.g:2612:1: rule__Selection__Group__2__Impl : ( ( rule__Selection__Group_2__0 )? ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2616:1: ( ( ( rule__Selection__Group_2__0 )? ) )
            // InternalMegal.g:2617:1: ( ( rule__Selection__Group_2__0 )? )
            {
            // InternalMegal.g:2617:1: ( ( rule__Selection__Group_2__0 )? )
            // InternalMegal.g:2618:2: ( rule__Selection__Group_2__0 )?
            {
             before(grammarAccess.getSelectionAccess().getGroup_2()); 
            // InternalMegal.g:2619:2: ( rule__Selection__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMegal.g:2619:3: rule__Selection__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selection__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__2__Impl"


    // $ANTLR start "rule__Selection__Group_1__0"
    // InternalMegal.g:2628:1: rule__Selection__Group_1__0 : rule__Selection__Group_1__0__Impl rule__Selection__Group_1__1 ;
    public final void rule__Selection__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2632:1: ( rule__Selection__Group_1__0__Impl rule__Selection__Group_1__1 )
            // InternalMegal.g:2633:2: rule__Selection__Group_1__0__Impl rule__Selection__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Selection__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_1__1();

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
    // $ANTLR end "rule__Selection__Group_1__0"


    // $ANTLR start "rule__Selection__Group_1__0__Impl"
    // InternalMegal.g:2640:1: rule__Selection__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Selection__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2644:1: ( ( ',' ) )
            // InternalMegal.g:2645:1: ( ',' )
            {
            // InternalMegal.g:2645:1: ( ',' )
            // InternalMegal.g:2646:2: ','
            {
             before(grammarAccess.getSelectionAccess().getCommaKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_1__0__Impl"


    // $ANTLR start "rule__Selection__Group_1__1"
    // InternalMegal.g:2655:1: rule__Selection__Group_1__1 : rule__Selection__Group_1__1__Impl ;
    public final void rule__Selection__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2659:1: ( rule__Selection__Group_1__1__Impl )
            // InternalMegal.g:2660:2: rule__Selection__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group_1__1__Impl();

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
    // $ANTLR end "rule__Selection__Group_1__1"


    // $ANTLR start "rule__Selection__Group_1__1__Impl"
    // InternalMegal.g:2666:1: rule__Selection__Group_1__1__Impl : ( ( rule__Selection__SelectAssignment_1_1 ) ) ;
    public final void rule__Selection__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2670:1: ( ( ( rule__Selection__SelectAssignment_1_1 ) ) )
            // InternalMegal.g:2671:1: ( ( rule__Selection__SelectAssignment_1_1 ) )
            {
            // InternalMegal.g:2671:1: ( ( rule__Selection__SelectAssignment_1_1 ) )
            // InternalMegal.g:2672:2: ( rule__Selection__SelectAssignment_1_1 )
            {
             before(grammarAccess.getSelectionAccess().getSelectAssignment_1_1()); 
            // InternalMegal.g:2673:2: ( rule__Selection__SelectAssignment_1_1 )
            // InternalMegal.g:2673:3: rule__Selection__SelectAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Selection__SelectAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getSelectAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_1__1__Impl"


    // $ANTLR start "rule__Selection__Group_2__0"
    // InternalMegal.g:2682:1: rule__Selection__Group_2__0 : rule__Selection__Group_2__0__Impl rule__Selection__Group_2__1 ;
    public final void rule__Selection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2686:1: ( rule__Selection__Group_2__0__Impl rule__Selection__Group_2__1 )
            // InternalMegal.g:2687:2: rule__Selection__Group_2__0__Impl rule__Selection__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__Selection__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_2__1();

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
    // $ANTLR end "rule__Selection__Group_2__0"


    // $ANTLR start "rule__Selection__Group_2__0__Impl"
    // InternalMegal.g:2694:1: rule__Selection__Group_2__0__Impl : ( 'from' ) ;
    public final void rule__Selection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2698:1: ( ( 'from' ) )
            // InternalMegal.g:2699:1: ( 'from' )
            {
            // InternalMegal.g:2699:1: ( 'from' )
            // InternalMegal.g:2700:2: 'from'
            {
             before(grammarAccess.getSelectionAccess().getFromKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getFromKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2__0__Impl"


    // $ANTLR start "rule__Selection__Group_2__1"
    // InternalMegal.g:2709:1: rule__Selection__Group_2__1 : rule__Selection__Group_2__1__Impl rule__Selection__Group_2__2 ;
    public final void rule__Selection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2713:1: ( rule__Selection__Group_2__1__Impl rule__Selection__Group_2__2 )
            // InternalMegal.g:2714:2: rule__Selection__Group_2__1__Impl rule__Selection__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__Selection__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_2__2();

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
    // $ANTLR end "rule__Selection__Group_2__1"


    // $ANTLR start "rule__Selection__Group_2__1__Impl"
    // InternalMegal.g:2721:1: rule__Selection__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Selection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2725:1: ( ( '{' ) )
            // InternalMegal.g:2726:1: ( '{' )
            {
            // InternalMegal.g:2726:1: ( '{' )
            // InternalMegal.g:2727:2: '{'
            {
             before(grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2__1__Impl"


    // $ANTLR start "rule__Selection__Group_2__2"
    // InternalMegal.g:2736:1: rule__Selection__Group_2__2 : rule__Selection__Group_2__2__Impl rule__Selection__Group_2__3 ;
    public final void rule__Selection__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2740:1: ( rule__Selection__Group_2__2__Impl rule__Selection__Group_2__3 )
            // InternalMegal.g:2741:2: rule__Selection__Group_2__2__Impl rule__Selection__Group_2__3
            {
            pushFollow(FOLLOW_27);
            rule__Selection__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_2__3();

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
    // $ANTLR end "rule__Selection__Group_2__2"


    // $ANTLR start "rule__Selection__Group_2__2__Impl"
    // InternalMegal.g:2748:1: rule__Selection__Group_2__2__Impl : ( ( ( rule__Selection__QueryAssignment_2_2 ) ) ( ( rule__Selection__QueryAssignment_2_2 )* ) ) ;
    public final void rule__Selection__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2752:1: ( ( ( ( rule__Selection__QueryAssignment_2_2 ) ) ( ( rule__Selection__QueryAssignment_2_2 )* ) ) )
            // InternalMegal.g:2753:1: ( ( ( rule__Selection__QueryAssignment_2_2 ) ) ( ( rule__Selection__QueryAssignment_2_2 )* ) )
            {
            // InternalMegal.g:2753:1: ( ( ( rule__Selection__QueryAssignment_2_2 ) ) ( ( rule__Selection__QueryAssignment_2_2 )* ) )
            // InternalMegal.g:2754:2: ( ( rule__Selection__QueryAssignment_2_2 ) ) ( ( rule__Selection__QueryAssignment_2_2 )* )
            {
            // InternalMegal.g:2754:2: ( ( rule__Selection__QueryAssignment_2_2 ) )
            // InternalMegal.g:2755:3: ( rule__Selection__QueryAssignment_2_2 )
            {
             before(grammarAccess.getSelectionAccess().getQueryAssignment_2_2()); 
            // InternalMegal.g:2756:3: ( rule__Selection__QueryAssignment_2_2 )
            // InternalMegal.g:2756:4: rule__Selection__QueryAssignment_2_2
            {
            pushFollow(FOLLOW_28);
            rule__Selection__QueryAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getQueryAssignment_2_2()); 

            }

            // InternalMegal.g:2759:2: ( ( rule__Selection__QueryAssignment_2_2 )* )
            // InternalMegal.g:2760:3: ( rule__Selection__QueryAssignment_2_2 )*
            {
             before(grammarAccess.getSelectionAccess().getQueryAssignment_2_2()); 
            // InternalMegal.g:2761:3: ( rule__Selection__QueryAssignment_2_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||(LA28_0>=RULE_STRING && LA28_0<=RULE_VAR_ID)||LA28_0==14) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMegal.g:2761:4: rule__Selection__QueryAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Selection__QueryAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSelectionAccess().getQueryAssignment_2_2()); 

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
    // $ANTLR end "rule__Selection__Group_2__2__Impl"


    // $ANTLR start "rule__Selection__Group_2__3"
    // InternalMegal.g:2770:1: rule__Selection__Group_2__3 : rule__Selection__Group_2__3__Impl ;
    public final void rule__Selection__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2774:1: ( rule__Selection__Group_2__3__Impl )
            // InternalMegal.g:2775:2: rule__Selection__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group_2__3__Impl();

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
    // $ANTLR end "rule__Selection__Group_2__3"


    // $ANTLR start "rule__Selection__Group_2__3__Impl"
    // InternalMegal.g:2781:1: rule__Selection__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Selection__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2785:1: ( ( '}' ) )
            // InternalMegal.g:2786:1: ( '}' )
            {
            // InternalMegal.g:2786:1: ( '}' )
            // InternalMegal.g:2787:2: '}'
            {
             before(grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_2__3__Impl"


    // $ANTLR start "rule__QueryStatement__Group__0"
    // InternalMegal.g:2797:1: rule__QueryStatement__Group__0 : rule__QueryStatement__Group__0__Impl rule__QueryStatement__Group__1 ;
    public final void rule__QueryStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2801:1: ( rule__QueryStatement__Group__0__Impl rule__QueryStatement__Group__1 )
            // InternalMegal.g:2802:2: rule__QueryStatement__Group__0__Impl rule__QueryStatement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__QueryStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryStatement__Group__1();

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
    // $ANTLR end "rule__QueryStatement__Group__0"


    // $ANTLR start "rule__QueryStatement__Group__0__Impl"
    // InternalMegal.g:2809:1: rule__QueryStatement__Group__0__Impl : ( ( rule__QueryStatement__SubjectAssignment_0 ) ) ;
    public final void rule__QueryStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2813:1: ( ( ( rule__QueryStatement__SubjectAssignment_0 ) ) )
            // InternalMegal.g:2814:1: ( ( rule__QueryStatement__SubjectAssignment_0 ) )
            {
            // InternalMegal.g:2814:1: ( ( rule__QueryStatement__SubjectAssignment_0 ) )
            // InternalMegal.g:2815:2: ( rule__QueryStatement__SubjectAssignment_0 )
            {
             before(grammarAccess.getQueryStatementAccess().getSubjectAssignment_0()); 
            // InternalMegal.g:2816:2: ( rule__QueryStatement__SubjectAssignment_0 )
            // InternalMegal.g:2816:3: rule__QueryStatement__SubjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QueryStatement__SubjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryStatementAccess().getSubjectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryStatement__Group__0__Impl"


    // $ANTLR start "rule__QueryStatement__Group__1"
    // InternalMegal.g:2824:1: rule__QueryStatement__Group__1 : rule__QueryStatement__Group__1__Impl rule__QueryStatement__Group__2 ;
    public final void rule__QueryStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2828:1: ( rule__QueryStatement__Group__1__Impl rule__QueryStatement__Group__2 )
            // InternalMegal.g:2829:2: rule__QueryStatement__Group__1__Impl rule__QueryStatement__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__QueryStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryStatement__Group__2();

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
    // $ANTLR end "rule__QueryStatement__Group__1"


    // $ANTLR start "rule__QueryStatement__Group__1__Impl"
    // InternalMegal.g:2836:1: rule__QueryStatement__Group__1__Impl : ( ( rule__QueryStatement__PredicateAssignment_1 ) ) ;
    public final void rule__QueryStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2840:1: ( ( ( rule__QueryStatement__PredicateAssignment_1 ) ) )
            // InternalMegal.g:2841:1: ( ( rule__QueryStatement__PredicateAssignment_1 ) )
            {
            // InternalMegal.g:2841:1: ( ( rule__QueryStatement__PredicateAssignment_1 ) )
            // InternalMegal.g:2842:2: ( rule__QueryStatement__PredicateAssignment_1 )
            {
             before(grammarAccess.getQueryStatementAccess().getPredicateAssignment_1()); 
            // InternalMegal.g:2843:2: ( rule__QueryStatement__PredicateAssignment_1 )
            // InternalMegal.g:2843:3: rule__QueryStatement__PredicateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QueryStatement__PredicateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryStatementAccess().getPredicateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryStatement__Group__1__Impl"


    // $ANTLR start "rule__QueryStatement__Group__2"
    // InternalMegal.g:2851:1: rule__QueryStatement__Group__2 : rule__QueryStatement__Group__2__Impl ;
    public final void rule__QueryStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2855:1: ( rule__QueryStatement__Group__2__Impl )
            // InternalMegal.g:2856:2: rule__QueryStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryStatement__Group__2__Impl();

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
    // $ANTLR end "rule__QueryStatement__Group__2"


    // $ANTLR start "rule__QueryStatement__Group__2__Impl"
    // InternalMegal.g:2862:1: rule__QueryStatement__Group__2__Impl : ( ( rule__QueryStatement__ObjectAssignment_2 ) ) ;
    public final void rule__QueryStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2866:1: ( ( ( rule__QueryStatement__ObjectAssignment_2 ) ) )
            // InternalMegal.g:2867:1: ( ( rule__QueryStatement__ObjectAssignment_2 ) )
            {
            // InternalMegal.g:2867:1: ( ( rule__QueryStatement__ObjectAssignment_2 ) )
            // InternalMegal.g:2868:2: ( rule__QueryStatement__ObjectAssignment_2 )
            {
             before(grammarAccess.getQueryStatementAccess().getObjectAssignment_2()); 
            // InternalMegal.g:2869:2: ( rule__QueryStatement__ObjectAssignment_2 )
            // InternalMegal.g:2869:3: rule__QueryStatement__ObjectAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QueryStatement__ObjectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQueryStatementAccess().getObjectAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryStatement__Group__2__Impl"


    // $ANTLR start "rule__QueryParam__Group__0"
    // InternalMegal.g:2878:1: rule__QueryParam__Group__0 : rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 ;
    public final void rule__QueryParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2882:1: ( rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 )
            // InternalMegal.g:2883:2: rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__QueryParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__1();

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
    // $ANTLR end "rule__QueryParam__Group__0"


    // $ANTLR start "rule__QueryParam__Group__0__Impl"
    // InternalMegal.g:2890:1: rule__QueryParam__Group__0__Impl : ( ( rule__QueryParam__NameAssignment_0 ) ) ;
    public final void rule__QueryParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2894:1: ( ( ( rule__QueryParam__NameAssignment_0 ) ) )
            // InternalMegal.g:2895:1: ( ( rule__QueryParam__NameAssignment_0 ) )
            {
            // InternalMegal.g:2895:1: ( ( rule__QueryParam__NameAssignment_0 ) )
            // InternalMegal.g:2896:2: ( rule__QueryParam__NameAssignment_0 )
            {
             before(grammarAccess.getQueryParamAccess().getNameAssignment_0()); 
            // InternalMegal.g:2897:2: ( rule__QueryParam__NameAssignment_0 )
            // InternalMegal.g:2897:3: rule__QueryParam__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__0__Impl"


    // $ANTLR start "rule__QueryParam__Group__1"
    // InternalMegal.g:2905:1: rule__QueryParam__Group__1 : rule__QueryParam__Group__1__Impl ;
    public final void rule__QueryParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2909:1: ( rule__QueryParam__Group__1__Impl )
            // InternalMegal.g:2910:2: rule__QueryParam__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__1__Impl();

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
    // $ANTLR end "rule__QueryParam__Group__1"


    // $ANTLR start "rule__QueryParam__Group__1__Impl"
    // InternalMegal.g:2916:1: rule__QueryParam__Group__1__Impl : ( ( rule__QueryParam__Group_1__0 )? ) ;
    public final void rule__QueryParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2920:1: ( ( ( rule__QueryParam__Group_1__0 )? ) )
            // InternalMegal.g:2921:1: ( ( rule__QueryParam__Group_1__0 )? )
            {
            // InternalMegal.g:2921:1: ( ( rule__QueryParam__Group_1__0 )? )
            // InternalMegal.g:2922:2: ( rule__QueryParam__Group_1__0 )?
            {
             before(grammarAccess.getQueryParamAccess().getGroup_1()); 
            // InternalMegal.g:2923:2: ( rule__QueryParam__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMegal.g:2923:3: rule__QueryParam__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QueryParam__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryParamAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__1__Impl"


    // $ANTLR start "rule__QueryParam__Group_1__0"
    // InternalMegal.g:2932:1: rule__QueryParam__Group_1__0 : rule__QueryParam__Group_1__0__Impl rule__QueryParam__Group_1__1 ;
    public final void rule__QueryParam__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2936:1: ( rule__QueryParam__Group_1__0__Impl rule__QueryParam__Group_1__1 )
            // InternalMegal.g:2937:2: rule__QueryParam__Group_1__0__Impl rule__QueryParam__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QueryParam__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryParam__Group_1__1();

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
    // $ANTLR end "rule__QueryParam__Group_1__0"


    // $ANTLR start "rule__QueryParam__Group_1__0__Impl"
    // InternalMegal.g:2944:1: rule__QueryParam__Group_1__0__Impl : ( ':' ) ;
    public final void rule__QueryParam__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2948:1: ( ( ':' ) )
            // InternalMegal.g:2949:1: ( ':' )
            {
            // InternalMegal.g:2949:1: ( ':' )
            // InternalMegal.g:2950:2: ':'
            {
             before(grammarAccess.getQueryParamAccess().getColonKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group_1__0__Impl"


    // $ANTLR start "rule__QueryParam__Group_1__1"
    // InternalMegal.g:2959:1: rule__QueryParam__Group_1__1 : rule__QueryParam__Group_1__1__Impl ;
    public final void rule__QueryParam__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2963:1: ( rule__QueryParam__Group_1__1__Impl )
            // InternalMegal.g:2964:2: rule__QueryParam__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__Group_1__1__Impl();

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
    // $ANTLR end "rule__QueryParam__Group_1__1"


    // $ANTLR start "rule__QueryParam__Group_1__1__Impl"
    // InternalMegal.g:2970:1: rule__QueryParam__Group_1__1__Impl : ( ( rule__QueryParam__TypeAssignment_1_1 ) ) ;
    public final void rule__QueryParam__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2974:1: ( ( ( rule__QueryParam__TypeAssignment_1_1 ) ) )
            // InternalMegal.g:2975:1: ( ( rule__QueryParam__TypeAssignment_1_1 ) )
            {
            // InternalMegal.g:2975:1: ( ( rule__QueryParam__TypeAssignment_1_1 ) )
            // InternalMegal.g:2976:2: ( rule__QueryParam__TypeAssignment_1_1 )
            {
             before(grammarAccess.getQueryParamAccess().getTypeAssignment_1_1()); 
            // InternalMegal.g:2977:2: ( rule__QueryParam__TypeAssignment_1_1 )
            // InternalMegal.g:2977:3: rule__QueryParam__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group_1__1__Impl"


    // $ANTLR start "rule__QueryPos__Group__0"
    // InternalMegal.g:2986:1: rule__QueryPos__Group__0 : rule__QueryPos__Group__0__Impl rule__QueryPos__Group__1 ;
    public final void rule__QueryPos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:2990:1: ( rule__QueryPos__Group__0__Impl rule__QueryPos__Group__1 )
            // InternalMegal.g:2991:2: rule__QueryPos__Group__0__Impl rule__QueryPos__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__QueryPos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryPos__Group__1();

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
    // $ANTLR end "rule__QueryPos__Group__0"


    // $ANTLR start "rule__QueryPos__Group__0__Impl"
    // InternalMegal.g:2998:1: rule__QueryPos__Group__0__Impl : ( '(' ) ;
    public final void rule__QueryPos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3002:1: ( ( '(' ) )
            // InternalMegal.g:3003:1: ( '(' )
            {
            // InternalMegal.g:3003:1: ( '(' )
            // InternalMegal.g:3004:2: '('
            {
             before(grammarAccess.getQueryPosAccess().getLeftParenthesisKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQueryPosAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPos__Group__0__Impl"


    // $ANTLR start "rule__QueryPos__Group__1"
    // InternalMegal.g:3013:1: rule__QueryPos__Group__1 : rule__QueryPos__Group__1__Impl rule__QueryPos__Group__2 ;
    public final void rule__QueryPos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3017:1: ( rule__QueryPos__Group__1__Impl rule__QueryPos__Group__2 )
            // InternalMegal.g:3018:2: rule__QueryPos__Group__1__Impl rule__QueryPos__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__QueryPos__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryPos__Group__2();

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
    // $ANTLR end "rule__QueryPos__Group__1"


    // $ANTLR start "rule__QueryPos__Group__1__Impl"
    // InternalMegal.g:3025:1: rule__QueryPos__Group__1__Impl : ( ( rule__QueryPos__ValueAssignment_1 ) ) ;
    public final void rule__QueryPos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3029:1: ( ( ( rule__QueryPos__ValueAssignment_1 ) ) )
            // InternalMegal.g:3030:1: ( ( rule__QueryPos__ValueAssignment_1 ) )
            {
            // InternalMegal.g:3030:1: ( ( rule__QueryPos__ValueAssignment_1 ) )
            // InternalMegal.g:3031:2: ( rule__QueryPos__ValueAssignment_1 )
            {
             before(grammarAccess.getQueryPosAccess().getValueAssignment_1()); 
            // InternalMegal.g:3032:2: ( rule__QueryPos__ValueAssignment_1 )
            // InternalMegal.g:3032:3: rule__QueryPos__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QueryPos__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryPosAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPos__Group__1__Impl"


    // $ANTLR start "rule__QueryPos__Group__2"
    // InternalMegal.g:3040:1: rule__QueryPos__Group__2 : rule__QueryPos__Group__2__Impl ;
    public final void rule__QueryPos__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3044:1: ( rule__QueryPos__Group__2__Impl )
            // InternalMegal.g:3045:2: rule__QueryPos__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryPos__Group__2__Impl();

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
    // $ANTLR end "rule__QueryPos__Group__2"


    // $ANTLR start "rule__QueryPos__Group__2__Impl"
    // InternalMegal.g:3051:1: rule__QueryPos__Group__2__Impl : ( ')' ) ;
    public final void rule__QueryPos__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3055:1: ( ( ')' ) )
            // InternalMegal.g:3056:1: ( ')' )
            {
            // InternalMegal.g:3056:1: ( ')' )
            // InternalMegal.g:3057:2: ')'
            {
             before(grammarAccess.getQueryPosAccess().getRightParenthesisKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQueryPosAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPos__Group__2__Impl"


    // $ANTLR start "rule__MegalFile__AnnotationsAssignment_0"
    // InternalMegal.g:3067:1: rule__MegalFile__AnnotationsAssignment_0 : ( ruleMegalAnnotation ) ;
    public final void rule__MegalFile__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3071:1: ( ( ruleMegalAnnotation ) )
            // InternalMegal.g:3072:2: ( ruleMegalAnnotation )
            {
            // InternalMegal.g:3072:2: ( ruleMegalAnnotation )
            // InternalMegal.g:3073:3: ruleMegalAnnotation
            {
             before(grammarAccess.getMegalFileAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalFileAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__AnnotationsAssignment_0"


    // $ANTLR start "rule__MegalFile__NameAssignment_2"
    // InternalMegal.g:3082:1: rule__MegalFile__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MegalFile__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3086:1: ( ( RULE_ID ) )
            // InternalMegal.g:3087:2: ( RULE_ID )
            {
            // InternalMegal.g:3087:2: ( RULE_ID )
            // InternalMegal.g:3088:3: RULE_ID
            {
             before(grammarAccess.getMegalFileAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalFileAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__NameAssignment_2"


    // $ANTLR start "rule__MegalFile__ImportsAssignment_3_0_1"
    // InternalMegal.g:3097:1: rule__MegalFile__ImportsAssignment_3_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalFile__ImportsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3101:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3102:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3102:2: ( ( RULE_ID ) )
            // InternalMegal.g:3103:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalFileAccess().getImportsMegalFileCrossReference_3_0_1_0()); 
            // InternalMegal.g:3104:3: ( RULE_ID )
            // InternalMegal.g:3105:4: RULE_ID
            {
             before(grammarAccess.getMegalFileAccess().getImportsMegalFileIDTerminalRuleCall_3_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalFileAccess().getImportsMegalFileIDTerminalRuleCall_3_0_1_0_1()); 

            }

             after(grammarAccess.getMegalFileAccess().getImportsMegalFileCrossReference_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__ImportsAssignment_3_0_1"


    // $ANTLR start "rule__MegalFile__DeclarationsAssignment_3_1"
    // InternalMegal.g:3116:1: rule__MegalFile__DeclarationsAssignment_3_1 : ( ruleMegalEntityType ) ;
    public final void rule__MegalFile__DeclarationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3120:1: ( ( ruleMegalEntityType ) )
            // InternalMegal.g:3121:2: ( ruleMegalEntityType )
            {
            // InternalMegal.g:3121:2: ( ruleMegalEntityType )
            // InternalMegal.g:3122:3: ruleMegalEntityType
            {
             before(grammarAccess.getMegalFileAccess().getDeclarationsMegalEntityTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMegalEntityType();

            state._fsp--;

             after(grammarAccess.getMegalFileAccess().getDeclarationsMegalEntityTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__DeclarationsAssignment_3_1"


    // $ANTLR start "rule__MegalFile__DeclarationsAssignment_3_2"
    // InternalMegal.g:3131:1: rule__MegalFile__DeclarationsAssignment_3_2 : ( ruleMegalRelationshipType ) ;
    public final void rule__MegalFile__DeclarationsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3135:1: ( ( ruleMegalRelationshipType ) )
            // InternalMegal.g:3136:2: ( ruleMegalRelationshipType )
            {
            // InternalMegal.g:3136:2: ( ruleMegalRelationshipType )
            // InternalMegal.g:3137:3: ruleMegalRelationshipType
            {
             before(grammarAccess.getMegalFileAccess().getDeclarationsMegalRelationshipTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMegalRelationshipType();

            state._fsp--;

             after(grammarAccess.getMegalFileAccess().getDeclarationsMegalRelationshipTypeParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__DeclarationsAssignment_3_2"


    // $ANTLR start "rule__MegalFile__DeclarationsAssignment_3_3"
    // InternalMegal.g:3146:1: rule__MegalFile__DeclarationsAssignment_3_3 : ( ruleMegalEntity ) ;
    public final void rule__MegalFile__DeclarationsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3150:1: ( ( ruleMegalEntity ) )
            // InternalMegal.g:3151:2: ( ruleMegalEntity )
            {
            // InternalMegal.g:3151:2: ( ruleMegalEntity )
            // InternalMegal.g:3152:3: ruleMegalEntity
            {
             before(grammarAccess.getMegalFileAccess().getDeclarationsMegalEntityParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMegalEntity();

            state._fsp--;

             after(grammarAccess.getMegalFileAccess().getDeclarationsMegalEntityParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__DeclarationsAssignment_3_3"


    // $ANTLR start "rule__MegalFile__DeclarationsAssignment_3_4"
    // InternalMegal.g:3161:1: rule__MegalFile__DeclarationsAssignment_3_4 : ( ruleMegalRelationship ) ;
    public final void rule__MegalFile__DeclarationsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3165:1: ( ( ruleMegalRelationship ) )
            // InternalMegal.g:3166:2: ( ruleMegalRelationship )
            {
            // InternalMegal.g:3166:2: ( ruleMegalRelationship )
            // InternalMegal.g:3167:3: ruleMegalRelationship
            {
             before(grammarAccess.getMegalFileAccess().getDeclarationsMegalRelationshipParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMegalRelationship();

            state._fsp--;

             after(grammarAccess.getMegalFileAccess().getDeclarationsMegalRelationshipParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__DeclarationsAssignment_3_4"


    // $ANTLR start "rule__MegalFile__DeclarationsAssignment_3_5"
    // InternalMegal.g:3176:1: rule__MegalFile__DeclarationsAssignment_3_5 : ( ruleMegalPair ) ;
    public final void rule__MegalFile__DeclarationsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3180:1: ( ( ruleMegalPair ) )
            // InternalMegal.g:3181:2: ( ruleMegalPair )
            {
            // InternalMegal.g:3181:2: ( ruleMegalPair )
            // InternalMegal.g:3182:3: ruleMegalPair
            {
             before(grammarAccess.getMegalFileAccess().getDeclarationsMegalPairParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMegalPair();

            state._fsp--;

             after(grammarAccess.getMegalFileAccess().getDeclarationsMegalPairParserRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__DeclarationsAssignment_3_5"


    // $ANTLR start "rule__MegalFile__BindingsAssignment_3_6"
    // InternalMegal.g:3191:1: rule__MegalFile__BindingsAssignment_3_6 : ( ruleMegalLink ) ;
    public final void rule__MegalFile__BindingsAssignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3195:1: ( ( ruleMegalLink ) )
            // InternalMegal.g:3196:2: ( ruleMegalLink )
            {
            // InternalMegal.g:3196:2: ( ruleMegalLink )
            // InternalMegal.g:3197:3: ruleMegalLink
            {
             before(grammarAccess.getMegalFileAccess().getBindingsMegalLinkParserRuleCall_3_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMegalLink();

            state._fsp--;

             after(grammarAccess.getMegalFileAccess().getBindingsMegalLinkParserRuleCall_3_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__BindingsAssignment_3_6"


    // $ANTLR start "rule__MegalAnnotation__KeyAssignment_0"
    // InternalMegal.g:3206:1: rule__MegalAnnotation__KeyAssignment_0 : ( RULE_ANN_ID ) ;
    public final void rule__MegalAnnotation__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3210:1: ( ( RULE_ANN_ID ) )
            // InternalMegal.g:3211:2: ( RULE_ANN_ID )
            {
            // InternalMegal.g:3211:2: ( RULE_ANN_ID )
            // InternalMegal.g:3212:3: RULE_ANN_ID
            {
             before(grammarAccess.getMegalAnnotationAccess().getKeyANN_IDTerminalRuleCall_0_0()); 
            match(input,RULE_ANN_ID,FOLLOW_2); 
             after(grammarAccess.getMegalAnnotationAccess().getKeyANN_IDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalAnnotation__KeyAssignment_0"


    // $ANTLR start "rule__MegalAnnotation__SelectionAssignment_1"
    // InternalMegal.g:3221:1: rule__MegalAnnotation__SelectionAssignment_1 : ( ruleSelection ) ;
    public final void rule__MegalAnnotation__SelectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3225:1: ( ( ruleSelection ) )
            // InternalMegal.g:3226:2: ( ruleSelection )
            {
            // InternalMegal.g:3226:2: ( ruleSelection )
            // InternalMegal.g:3227:3: ruleSelection
            {
             before(grammarAccess.getMegalAnnotationAccess().getSelectionSelectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getMegalAnnotationAccess().getSelectionSelectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalAnnotation__SelectionAssignment_1"


    // $ANTLR start "rule__MegalLink__AnnotationsAssignment_0"
    // InternalMegal.g:3236:1: rule__MegalLink__AnnotationsAssignment_0 : ( ruleMegalAnnotation ) ;
    public final void rule__MegalLink__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3240:1: ( ( ruleMegalAnnotation ) )
            // InternalMegal.g:3241:2: ( ruleMegalAnnotation )
            {
            // InternalMegal.g:3241:2: ( ruleMegalAnnotation )
            // InternalMegal.g:3242:3: ruleMegalAnnotation
            {
             before(grammarAccess.getMegalLinkAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalLinkAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__AnnotationsAssignment_0"


    // $ANTLR start "rule__MegalLink__LinkAssignment_1"
    // InternalMegal.g:3251:1: rule__MegalLink__LinkAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalLink__LinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3255:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3256:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3256:2: ( ( RULE_ID ) )
            // InternalMegal.g:3257:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalLinkAccess().getLinkMegalEntityCrossReference_1_0()); 
            // InternalMegal.g:3258:3: ( RULE_ID )
            // InternalMegal.g:3259:4: RULE_ID
            {
             before(grammarAccess.getMegalLinkAccess().getLinkMegalEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalLinkAccess().getLinkMegalEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMegalLinkAccess().getLinkMegalEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__LinkAssignment_1"


    // $ANTLR start "rule__MegalLink__FirstAssignment_2_1"
    // InternalMegal.g:3270:1: rule__MegalLink__FirstAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalLink__FirstAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3274:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3275:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3275:2: ( ( RULE_ID ) )
            // InternalMegal.g:3276:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalLinkAccess().getFirstMegalEntityCrossReference_2_1_0()); 
            // InternalMegal.g:3277:3: ( RULE_ID )
            // InternalMegal.g:3278:4: RULE_ID
            {
             before(grammarAccess.getMegalLinkAccess().getFirstMegalEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalLinkAccess().getFirstMegalEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getMegalLinkAccess().getFirstMegalEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__FirstAssignment_2_1"


    // $ANTLR start "rule__MegalLink__SecondAssignment_2_4"
    // InternalMegal.g:3289:1: rule__MegalLink__SecondAssignment_2_4 : ( ( RULE_ID ) ) ;
    public final void rule__MegalLink__SecondAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3293:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3294:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3294:2: ( ( RULE_ID ) )
            // InternalMegal.g:3295:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalLinkAccess().getSecondMegalEntityCrossReference_2_4_0()); 
            // InternalMegal.g:3296:3: ( RULE_ID )
            // InternalMegal.g:3297:4: RULE_ID
            {
             before(grammarAccess.getMegalLinkAccess().getSecondMegalEntityIDTerminalRuleCall_2_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalLinkAccess().getSecondMegalEntityIDTerminalRuleCall_2_4_0_1()); 

            }

             after(grammarAccess.getMegalLinkAccess().getSecondMegalEntityCrossReference_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__SecondAssignment_2_4"


    // $ANTLR start "rule__MegalLink__ToAssignment_4"
    // InternalMegal.g:3308:1: rule__MegalLink__ToAssignment_4 : ( RULE_STRING ) ;
    public final void rule__MegalLink__ToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3312:1: ( ( RULE_STRING ) )
            // InternalMegal.g:3313:2: ( RULE_STRING )
            {
            // InternalMegal.g:3313:2: ( RULE_STRING )
            // InternalMegal.g:3314:3: RULE_STRING
            {
             before(grammarAccess.getMegalLinkAccess().getToSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMegalLinkAccess().getToSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__ToAssignment_4"


    // $ANTLR start "rule__MegalEntityType__AnnotationsAssignment_0"
    // InternalMegal.g:3323:1: rule__MegalEntityType__AnnotationsAssignment_0 : ( ruleMegalAnnotation ) ;
    public final void rule__MegalEntityType__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3327:1: ( ( ruleMegalAnnotation ) )
            // InternalMegal.g:3328:2: ( ruleMegalAnnotation )
            {
            // InternalMegal.g:3328:2: ( ruleMegalAnnotation )
            // InternalMegal.g:3329:3: ruleMegalAnnotation
            {
             before(grammarAccess.getMegalEntityTypeAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalEntityTypeAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__AnnotationsAssignment_0"


    // $ANTLR start "rule__MegalEntityType__NameAssignment_1"
    // InternalMegal.g:3338:1: rule__MegalEntityType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MegalEntityType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3342:1: ( ( RULE_ID ) )
            // InternalMegal.g:3343:2: ( RULE_ID )
            {
            // InternalMegal.g:3343:2: ( RULE_ID )
            // InternalMegal.g:3344:3: RULE_ID
            {
             before(grammarAccess.getMegalEntityTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalEntityTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__NameAssignment_1"


    // $ANTLR start "rule__MegalEntityType__SupertypeAssignment_2_0_1"
    // InternalMegal.g:3353:1: rule__MegalEntityType__SupertypeAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalEntityType__SupertypeAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3357:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3358:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3358:2: ( ( RULE_ID ) )
            // InternalMegal.g:3359:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalEntityTypeAccess().getSupertypeMegalEntityTypeCrossReference_2_0_1_0()); 
            // InternalMegal.g:3360:3: ( RULE_ID )
            // InternalMegal.g:3361:4: RULE_ID
            {
             before(grammarAccess.getMegalEntityTypeAccess().getSupertypeMegalEntityTypeIDTerminalRuleCall_2_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalEntityTypeAccess().getSupertypeMegalEntityTypeIDTerminalRuleCall_2_0_1_0_1()); 

            }

             after(grammarAccess.getMegalEntityTypeAccess().getSupertypeMegalEntityTypeCrossReference_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__SupertypeAssignment_2_0_1"


    // $ANTLR start "rule__MegalRelationshipType__AnnotationsAssignment_0"
    // InternalMegal.g:3372:1: rule__MegalRelationshipType__AnnotationsAssignment_0 : ( ruleMegalAnnotation ) ;
    public final void rule__MegalRelationshipType__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3376:1: ( ( ruleMegalAnnotation ) )
            // InternalMegal.g:3377:2: ( ruleMegalAnnotation )
            {
            // InternalMegal.g:3377:2: ( ruleMegalAnnotation )
            // InternalMegal.g:3378:3: ruleMegalAnnotation
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalRelationshipTypeAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__AnnotationsAssignment_0"


    // $ANTLR start "rule__MegalRelationshipType__NameAssignment_1"
    // InternalMegal.g:3387:1: rule__MegalRelationshipType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MegalRelationshipType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3391:1: ( ( RULE_ID ) )
            // InternalMegal.g:3392:2: ( RULE_ID )
            {
            // InternalMegal.g:3392:2: ( RULE_ID )
            // InternalMegal.g:3393:3: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__NameAssignment_1"


    // $ANTLR start "rule__MegalRelationshipType__LeftAssignment_3"
    // InternalMegal.g:3402:1: rule__MegalRelationshipType__LeftAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationshipType__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3406:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3407:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3407:2: ( ( RULE_ID ) )
            // InternalMegal.g:3408:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftMegalEntityTypeCrossReference_3_0()); 
            // InternalMegal.g:3409:3: ( RULE_ID )
            // InternalMegal.g:3410:4: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftMegalEntityTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftMegalEntityTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftMegalEntityTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__LeftAssignment_3"


    // $ANTLR start "rule__MegalRelationshipType__LeftParamsAssignment_4_1"
    // InternalMegal.g:3421:1: rule__MegalRelationshipType__LeftParamsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationshipType__LeftParamsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3425:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3426:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3426:2: ( ( RULE_ID ) )
            // InternalMegal.g:3427:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityCrossReference_4_1_0()); 
            // InternalMegal.g:3428:3: ( RULE_ID )
            // InternalMegal.g:3429:4: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__LeftParamsAssignment_4_1"


    // $ANTLR start "rule__MegalRelationshipType__LeftParamsAssignment_4_2_1"
    // InternalMegal.g:3440:1: rule__MegalRelationshipType__LeftParamsAssignment_4_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationshipType__LeftParamsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3444:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3445:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3445:2: ( ( RULE_ID ) )
            // InternalMegal.g:3446:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityCrossReference_4_2_1_0()); 
            // InternalMegal.g:3447:3: ( RULE_ID )
            // InternalMegal.g:3448:4: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityIDTerminalRuleCall_4_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityIDTerminalRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__LeftParamsAssignment_4_2_1"


    // $ANTLR start "rule__MegalRelationshipType__LeftBothAssignment_5_0"
    // InternalMegal.g:3459:1: rule__MegalRelationshipType__LeftBothAssignment_5_0 : ( ( '(+)' ) ) ;
    public final void rule__MegalRelationshipType__LeftBothAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3463:1: ( ( ( '(+)' ) ) )
            // InternalMegal.g:3464:2: ( ( '(+)' ) )
            {
            // InternalMegal.g:3464:2: ( ( '(+)' ) )
            // InternalMegal.g:3465:3: ( '(+)' )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftBothLeftParenthesisPlusSignRightParenthesisKeyword_5_0_0()); 
            // InternalMegal.g:3466:3: ( '(+)' )
            // InternalMegal.g:3467:4: '(+)'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftBothLeftParenthesisPlusSignRightParenthesisKeyword_5_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftBothLeftParenthesisPlusSignRightParenthesisKeyword_5_0_0()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftBothLeftParenthesisPlusSignRightParenthesisKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__LeftBothAssignment_5_0"


    // $ANTLR start "rule__MegalRelationshipType__LeftManyAssignment_5_1"
    // InternalMegal.g:3478:1: rule__MegalRelationshipType__LeftManyAssignment_5_1 : ( ( '+' ) ) ;
    public final void rule__MegalRelationshipType__LeftManyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3482:1: ( ( ( '+' ) ) )
            // InternalMegal.g:3483:2: ( ( '+' ) )
            {
            // InternalMegal.g:3483:2: ( ( '+' ) )
            // InternalMegal.g:3484:3: ( '+' )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftManyPlusSignKeyword_5_1_0()); 
            // InternalMegal.g:3485:3: ( '+' )
            // InternalMegal.g:3486:4: '+'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftManyPlusSignKeyword_5_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftManyPlusSignKeyword_5_1_0()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftManyPlusSignKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__LeftManyAssignment_5_1"


    // $ANTLR start "rule__MegalRelationshipType__RightAssignment_7"
    // InternalMegal.g:3497:1: rule__MegalRelationshipType__RightAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationshipType__RightAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3501:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3502:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3502:2: ( ( RULE_ID ) )
            // InternalMegal.g:3503:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightMegalEntityTypeCrossReference_7_0()); 
            // InternalMegal.g:3504:3: ( RULE_ID )
            // InternalMegal.g:3505:4: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightMegalEntityTypeIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getRightMegalEntityTypeIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightMegalEntityTypeCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__RightAssignment_7"


    // $ANTLR start "rule__MegalRelationshipType__RightParamsAssignment_8_1"
    // InternalMegal.g:3516:1: rule__MegalRelationshipType__RightParamsAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationshipType__RightParamsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3520:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3521:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3521:2: ( ( RULE_ID ) )
            // InternalMegal.g:3522:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityCrossReference_8_1_0()); 
            // InternalMegal.g:3523:3: ( RULE_ID )
            // InternalMegal.g:3524:4: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__RightParamsAssignment_8_1"


    // $ANTLR start "rule__MegalRelationshipType__RightParamsAssignment_8_2_1"
    // InternalMegal.g:3535:1: rule__MegalRelationshipType__RightParamsAssignment_8_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationshipType__RightParamsAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3539:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3540:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3540:2: ( ( RULE_ID ) )
            // InternalMegal.g:3541:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityCrossReference_8_2_1_0()); 
            // InternalMegal.g:3542:3: ( RULE_ID )
            // InternalMegal.g:3543:4: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityIDTerminalRuleCall_8_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityIDTerminalRuleCall_8_2_1_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityCrossReference_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__RightParamsAssignment_8_2_1"


    // $ANTLR start "rule__MegalRelationshipType__RightBothAssignment_9_0"
    // InternalMegal.g:3554:1: rule__MegalRelationshipType__RightBothAssignment_9_0 : ( ( '(+)' ) ) ;
    public final void rule__MegalRelationshipType__RightBothAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3558:1: ( ( ( '(+)' ) ) )
            // InternalMegal.g:3559:2: ( ( '(+)' ) )
            {
            // InternalMegal.g:3559:2: ( ( '(+)' ) )
            // InternalMegal.g:3560:3: ( '(+)' )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightBothLeftParenthesisPlusSignRightParenthesisKeyword_9_0_0()); 
            // InternalMegal.g:3561:3: ( '(+)' )
            // InternalMegal.g:3562:4: '(+)'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightBothLeftParenthesisPlusSignRightParenthesisKeyword_9_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getRightBothLeftParenthesisPlusSignRightParenthesisKeyword_9_0_0()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightBothLeftParenthesisPlusSignRightParenthesisKeyword_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__RightBothAssignment_9_0"


    // $ANTLR start "rule__MegalRelationshipType__RightManyAssignment_9_1"
    // InternalMegal.g:3573:1: rule__MegalRelationshipType__RightManyAssignment_9_1 : ( ( '+' ) ) ;
    public final void rule__MegalRelationshipType__RightManyAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3577:1: ( ( ( '+' ) ) )
            // InternalMegal.g:3578:2: ( ( '+' ) )
            {
            // InternalMegal.g:3578:2: ( ( '+' ) )
            // InternalMegal.g:3579:3: ( '+' )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightManyPlusSignKeyword_9_1_0()); 
            // InternalMegal.g:3580:3: ( '+' )
            // InternalMegal.g:3581:4: '+'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightManyPlusSignKeyword_9_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getRightManyPlusSignKeyword_9_1_0()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightManyPlusSignKeyword_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__RightManyAssignment_9_1"


    // $ANTLR start "rule__MegalEntity__AnnotationsAssignment_0"
    // InternalMegal.g:3592:1: rule__MegalEntity__AnnotationsAssignment_0 : ( ruleMegalAnnotation ) ;
    public final void rule__MegalEntity__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3596:1: ( ( ruleMegalAnnotation ) )
            // InternalMegal.g:3597:2: ( ruleMegalAnnotation )
            {
            // InternalMegal.g:3597:2: ( ruleMegalAnnotation )
            // InternalMegal.g:3598:3: ruleMegalAnnotation
            {
             before(grammarAccess.getMegalEntityAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalEntityAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__AnnotationsAssignment_0"


    // $ANTLR start "rule__MegalEntity__NameAssignment_1"
    // InternalMegal.g:3607:1: rule__MegalEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MegalEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3611:1: ( ( RULE_ID ) )
            // InternalMegal.g:3612:2: ( RULE_ID )
            {
            // InternalMegal.g:3612:2: ( RULE_ID )
            // InternalMegal.g:3613:3: RULE_ID
            {
             before(grammarAccess.getMegalEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__NameAssignment_1"


    // $ANTLR start "rule__MegalEntity__TypeAssignment_3"
    // InternalMegal.g:3622:1: rule__MegalEntity__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MegalEntity__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3626:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3627:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3627:2: ( ( RULE_ID ) )
            // InternalMegal.g:3628:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalEntityAccess().getTypeMegalEntityTypeCrossReference_3_0()); 
            // InternalMegal.g:3629:3: ( RULE_ID )
            // InternalMegal.g:3630:4: RULE_ID
            {
             before(grammarAccess.getMegalEntityAccess().getTypeMegalEntityTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalEntityAccess().getTypeMegalEntityTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMegalEntityAccess().getTypeMegalEntityTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__TypeAssignment_3"


    // $ANTLR start "rule__MegalEntity__ParamsAssignment_4_1"
    // InternalMegal.g:3641:1: rule__MegalEntity__ParamsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalEntity__ParamsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3645:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3646:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3646:2: ( ( RULE_ID ) )
            // InternalMegal.g:3647:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalEntityAccess().getParamsMegalEntityCrossReference_4_1_0()); 
            // InternalMegal.g:3648:3: ( RULE_ID )
            // InternalMegal.g:3649:4: RULE_ID
            {
             before(grammarAccess.getMegalEntityAccess().getParamsMegalEntityIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalEntityAccess().getParamsMegalEntityIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMegalEntityAccess().getParamsMegalEntityCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__ParamsAssignment_4_1"


    // $ANTLR start "rule__MegalEntity__ParamsAssignment_4_2_1"
    // InternalMegal.g:3660:1: rule__MegalEntity__ParamsAssignment_4_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalEntity__ParamsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3664:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3665:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3665:2: ( ( RULE_ID ) )
            // InternalMegal.g:3666:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalEntityAccess().getParamsMegalEntityCrossReference_4_2_1_0()); 
            // InternalMegal.g:3667:3: ( RULE_ID )
            // InternalMegal.g:3668:4: RULE_ID
            {
             before(grammarAccess.getMegalEntityAccess().getParamsMegalEntityIDTerminalRuleCall_4_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalEntityAccess().getParamsMegalEntityIDTerminalRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getMegalEntityAccess().getParamsMegalEntityCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__ParamsAssignment_4_2_1"


    // $ANTLR start "rule__MegalEntity__ManyAssignment_5"
    // InternalMegal.g:3679:1: rule__MegalEntity__ManyAssignment_5 : ( ( '+' ) ) ;
    public final void rule__MegalEntity__ManyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3683:1: ( ( ( '+' ) ) )
            // InternalMegal.g:3684:2: ( ( '+' ) )
            {
            // InternalMegal.g:3684:2: ( ( '+' ) )
            // InternalMegal.g:3685:3: ( '+' )
            {
             before(grammarAccess.getMegalEntityAccess().getManyPlusSignKeyword_5_0()); 
            // InternalMegal.g:3686:3: ( '+' )
            // InternalMegal.g:3687:4: '+'
            {
             before(grammarAccess.getMegalEntityAccess().getManyPlusSignKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMegalEntityAccess().getManyPlusSignKeyword_5_0()); 

            }

             after(grammarAccess.getMegalEntityAccess().getManyPlusSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__ManyAssignment_5"


    // $ANTLR start "rule__MegalRelationship__AnnotationsAssignment_0"
    // InternalMegal.g:3698:1: rule__MegalRelationship__AnnotationsAssignment_0 : ( ruleMegalAnnotation ) ;
    public final void rule__MegalRelationship__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3702:1: ( ( ruleMegalAnnotation ) )
            // InternalMegal.g:3703:2: ( ruleMegalAnnotation )
            {
            // InternalMegal.g:3703:2: ( ruleMegalAnnotation )
            // InternalMegal.g:3704:3: ruleMegalAnnotation
            {
             before(grammarAccess.getMegalRelationshipAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalRelationshipAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__AnnotationsAssignment_0"


    // $ANTLR start "rule__MegalRelationship__LeftAssignment_1"
    // InternalMegal.g:3713:1: rule__MegalRelationship__LeftAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationship__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3717:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3718:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3718:2: ( ( RULE_ID ) )
            // InternalMegal.g:3719:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipAccess().getLeftMegalEntityCrossReference_1_0()); 
            // InternalMegal.g:3720:3: ( RULE_ID )
            // InternalMegal.g:3721:4: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipAccess().getLeftMegalEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipAccess().getLeftMegalEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipAccess().getLeftMegalEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__LeftAssignment_1"


    // $ANTLR start "rule__MegalRelationship__TypeAssignment_2"
    // InternalMegal.g:3732:1: rule__MegalRelationship__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationship__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3736:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3737:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3737:2: ( ( RULE_ID ) )
            // InternalMegal.g:3738:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipAccess().getTypeMegalRelationshipTypeCrossReference_2_0()); 
            // InternalMegal.g:3739:3: ( RULE_ID )
            // InternalMegal.g:3740:4: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipAccess().getTypeMegalRelationshipTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipAccess().getTypeMegalRelationshipTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipAccess().getTypeMegalRelationshipTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__TypeAssignment_2"


    // $ANTLR start "rule__MegalRelationship__RightAssignment_3"
    // InternalMegal.g:3751:1: rule__MegalRelationship__RightAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationship__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3755:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3756:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3756:2: ( ( RULE_ID ) )
            // InternalMegal.g:3757:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipAccess().getRightMegalEntityCrossReference_3_0()); 
            // InternalMegal.g:3758:3: ( RULE_ID )
            // InternalMegal.g:3759:4: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipAccess().getRightMegalEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalRelationshipAccess().getRightMegalEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipAccess().getRightMegalEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__RightAssignment_3"


    // $ANTLR start "rule__MegalPair__AnnotationsAssignment_0"
    // InternalMegal.g:3770:1: rule__MegalPair__AnnotationsAssignment_0 : ( ruleMegalAnnotation ) ;
    public final void rule__MegalPair__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3774:1: ( ( ruleMegalAnnotation ) )
            // InternalMegal.g:3775:2: ( ruleMegalAnnotation )
            {
            // InternalMegal.g:3775:2: ( ruleMegalAnnotation )
            // InternalMegal.g:3776:3: ruleMegalAnnotation
            {
             before(grammarAccess.getMegalPairAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalPairAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__AnnotationsAssignment_0"


    // $ANTLR start "rule__MegalPair__SetAssignment_1"
    // InternalMegal.g:3785:1: rule__MegalPair__SetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalPair__SetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3789:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3790:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3790:2: ( ( RULE_ID ) )
            // InternalMegal.g:3791:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalPairAccess().getSetMegalEntityCrossReference_1_0()); 
            // InternalMegal.g:3792:3: ( RULE_ID )
            // InternalMegal.g:3793:4: RULE_ID
            {
             before(grammarAccess.getMegalPairAccess().getSetMegalEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalPairAccess().getSetMegalEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMegalPairAccess().getSetMegalEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__SetAssignment_1"


    // $ANTLR start "rule__MegalPair__FirstAssignment_3"
    // InternalMegal.g:3804:1: rule__MegalPair__FirstAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MegalPair__FirstAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3808:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3809:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3809:2: ( ( RULE_ID ) )
            // InternalMegal.g:3810:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalPairAccess().getFirstMegalEntityCrossReference_3_0()); 
            // InternalMegal.g:3811:3: ( RULE_ID )
            // InternalMegal.g:3812:4: RULE_ID
            {
             before(grammarAccess.getMegalPairAccess().getFirstMegalEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalPairAccess().getFirstMegalEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMegalPairAccess().getFirstMegalEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__FirstAssignment_3"


    // $ANTLR start "rule__MegalPair__SecondAssignment_6"
    // InternalMegal.g:3823:1: rule__MegalPair__SecondAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__MegalPair__SecondAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3827:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3828:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3828:2: ( ( RULE_ID ) )
            // InternalMegal.g:3829:3: ( RULE_ID )
            {
             before(grammarAccess.getMegalPairAccess().getSecondMegalEntityCrossReference_6_0()); 
            // InternalMegal.g:3830:3: ( RULE_ID )
            // InternalMegal.g:3831:4: RULE_ID
            {
             before(grammarAccess.getMegalPairAccess().getSecondMegalEntityIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMegalPairAccess().getSecondMegalEntityIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getMegalPairAccess().getSecondMegalEntityCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__SecondAssignment_6"


    // $ANTLR start "rule__Selection__SelectAssignment_0"
    // InternalMegal.g:3842:1: rule__Selection__SelectAssignment_0 : ( ruleQueryDefEntry ) ;
    public final void rule__Selection__SelectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3846:1: ( ( ruleQueryDefEntry ) )
            // InternalMegal.g:3847:2: ( ruleQueryDefEntry )
            {
            // InternalMegal.g:3847:2: ( ruleQueryDefEntry )
            // InternalMegal.g:3848:3: ruleQueryDefEntry
            {
             before(grammarAccess.getSelectionAccess().getSelectQueryDefEntryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryDefEntry();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getSelectQueryDefEntryParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__SelectAssignment_0"


    // $ANTLR start "rule__Selection__SelectAssignment_1_1"
    // InternalMegal.g:3857:1: rule__Selection__SelectAssignment_1_1 : ( ruleQueryDefEntry ) ;
    public final void rule__Selection__SelectAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3861:1: ( ( ruleQueryDefEntry ) )
            // InternalMegal.g:3862:2: ( ruleQueryDefEntry )
            {
            // InternalMegal.g:3862:2: ( ruleQueryDefEntry )
            // InternalMegal.g:3863:3: ruleQueryDefEntry
            {
             before(grammarAccess.getSelectionAccess().getSelectQueryDefEntryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryDefEntry();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getSelectQueryDefEntryParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__SelectAssignment_1_1"


    // $ANTLR start "rule__Selection__QueryAssignment_2_2"
    // InternalMegal.g:3872:1: rule__Selection__QueryAssignment_2_2 : ( ruleQueryStatement ) ;
    public final void rule__Selection__QueryAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3876:1: ( ( ruleQueryStatement ) )
            // InternalMegal.g:3877:2: ( ruleQueryStatement )
            {
            // InternalMegal.g:3877:2: ( ruleQueryStatement )
            // InternalMegal.g:3878:3: ruleQueryStatement
            {
             before(grammarAccess.getSelectionAccess().getQueryQueryStatementParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryStatement();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getQueryQueryStatementParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__QueryAssignment_2_2"


    // $ANTLR start "rule__QueryStatement__SubjectAssignment_0"
    // InternalMegal.g:3887:1: rule__QueryStatement__SubjectAssignment_0 : ( ruleQueryRefEntry ) ;
    public final void rule__QueryStatement__SubjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3891:1: ( ( ruleQueryRefEntry ) )
            // InternalMegal.g:3892:2: ( ruleQueryRefEntry )
            {
            // InternalMegal.g:3892:2: ( ruleQueryRefEntry )
            // InternalMegal.g:3893:3: ruleQueryRefEntry
            {
             before(grammarAccess.getQueryStatementAccess().getSubjectQueryRefEntryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryRefEntry();

            state._fsp--;

             after(grammarAccess.getQueryStatementAccess().getSubjectQueryRefEntryParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryStatement__SubjectAssignment_0"


    // $ANTLR start "rule__QueryStatement__PredicateAssignment_1"
    // InternalMegal.g:3902:1: rule__QueryStatement__PredicateAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__QueryStatement__PredicateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3906:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3907:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3907:2: ( ( RULE_ID ) )
            // InternalMegal.g:3908:3: ( RULE_ID )
            {
             before(grammarAccess.getQueryStatementAccess().getPredicateMegalRelationshipTypeCrossReference_1_0()); 
            // InternalMegal.g:3909:3: ( RULE_ID )
            // InternalMegal.g:3910:4: RULE_ID
            {
             before(grammarAccess.getQueryStatementAccess().getPredicateMegalRelationshipTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryStatementAccess().getPredicateMegalRelationshipTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getQueryStatementAccess().getPredicateMegalRelationshipTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryStatement__PredicateAssignment_1"


    // $ANTLR start "rule__QueryStatement__ObjectAssignment_2"
    // InternalMegal.g:3921:1: rule__QueryStatement__ObjectAssignment_2 : ( ruleQueryRefEntry ) ;
    public final void rule__QueryStatement__ObjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3925:1: ( ( ruleQueryRefEntry ) )
            // InternalMegal.g:3926:2: ( ruleQueryRefEntry )
            {
            // InternalMegal.g:3926:2: ( ruleQueryRefEntry )
            // InternalMegal.g:3927:3: ruleQueryRefEntry
            {
             before(grammarAccess.getQueryStatementAccess().getObjectQueryRefEntryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryRefEntry();

            state._fsp--;

             after(grammarAccess.getQueryStatementAccess().getObjectQueryRefEntryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryStatement__ObjectAssignment_2"


    // $ANTLR start "rule__QueryParam__NameAssignment_0"
    // InternalMegal.g:3936:1: rule__QueryParam__NameAssignment_0 : ( RULE_VAR_ID ) ;
    public final void rule__QueryParam__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3940:1: ( ( RULE_VAR_ID ) )
            // InternalMegal.g:3941:2: ( RULE_VAR_ID )
            {
            // InternalMegal.g:3941:2: ( RULE_VAR_ID )
            // InternalMegal.g:3942:3: RULE_VAR_ID
            {
             before(grammarAccess.getQueryParamAccess().getNameVAR_IDTerminalRuleCall_0_0()); 
            match(input,RULE_VAR_ID,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getNameVAR_IDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__NameAssignment_0"


    // $ANTLR start "rule__QueryParam__TypeAssignment_1_1"
    // InternalMegal.g:3951:1: rule__QueryParam__TypeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__QueryParam__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3955:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:3956:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:3956:2: ( ( RULE_ID ) )
            // InternalMegal.g:3957:3: ( RULE_ID )
            {
             before(grammarAccess.getQueryParamAccess().getTypeMegalEntityTypeCrossReference_1_1_0()); 
            // InternalMegal.g:3958:3: ( RULE_ID )
            // InternalMegal.g:3959:4: RULE_ID
            {
             before(grammarAccess.getQueryParamAccess().getTypeMegalEntityTypeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getTypeMegalEntityTypeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getQueryParamAccess().getTypeMegalEntityTypeCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__TypeAssignment_1_1"


    // $ANTLR start "rule__QueryReference__RefAssignment"
    // InternalMegal.g:3970:1: rule__QueryReference__RefAssignment : ( ( RULE_VAR_ID ) ) ;
    public final void rule__QueryReference__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3974:1: ( ( ( RULE_VAR_ID ) ) )
            // InternalMegal.g:3975:2: ( ( RULE_VAR_ID ) )
            {
            // InternalMegal.g:3975:2: ( ( RULE_VAR_ID ) )
            // InternalMegal.g:3976:3: ( RULE_VAR_ID )
            {
             before(grammarAccess.getQueryReferenceAccess().getRefQueryParamCrossReference_0()); 
            // InternalMegal.g:3977:3: ( RULE_VAR_ID )
            // InternalMegal.g:3978:4: RULE_VAR_ID
            {
             before(grammarAccess.getQueryReferenceAccess().getRefQueryParamVAR_IDTerminalRuleCall_0_1()); 
            match(input,RULE_VAR_ID,FOLLOW_2); 
             after(grammarAccess.getQueryReferenceAccess().getRefQueryParamVAR_IDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getQueryReferenceAccess().getRefQueryParamCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReference__RefAssignment"


    // $ANTLR start "rule__QueryString__ValueAssignment"
    // InternalMegal.g:3989:1: rule__QueryString__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__QueryString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:3993:1: ( ( RULE_STRING ) )
            // InternalMegal.g:3994:2: ( RULE_STRING )
            {
            // InternalMegal.g:3994:2: ( RULE_STRING )
            // InternalMegal.g:3995:3: RULE_STRING
            {
             before(grammarAccess.getQueryStringAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQueryStringAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryString__ValueAssignment"


    // $ANTLR start "rule__QueryEntity__EntityAssignment"
    // InternalMegal.g:4004:1: rule__QueryEntity__EntityAssignment : ( ( RULE_ID ) ) ;
    public final void rule__QueryEntity__EntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:4008:1: ( ( ( RULE_ID ) ) )
            // InternalMegal.g:4009:2: ( ( RULE_ID ) )
            {
            // InternalMegal.g:4009:2: ( ( RULE_ID ) )
            // InternalMegal.g:4010:3: ( RULE_ID )
            {
             before(grammarAccess.getQueryEntityAccess().getEntityMegalEntityCrossReference_0()); 
            // InternalMegal.g:4011:3: ( RULE_ID )
            // InternalMegal.g:4012:4: RULE_ID
            {
             before(grammarAccess.getQueryEntityAccess().getEntityMegalEntityIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryEntityAccess().getEntityMegalEntityIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getQueryEntityAccess().getEntityMegalEntityCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryEntity__EntityAssignment"


    // $ANTLR start "rule__QueryPos__ValueAssignment_1"
    // InternalMegal.g:4023:1: rule__QueryPos__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__QueryPos__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMegal.g:4027:1: ( ( RULE_INT ) )
            // InternalMegal.g:4028:2: ( RULE_INT )
            {
            // InternalMegal.g:4028:2: ( RULE_INT )
            // InternalMegal.g:4029:3: RULE_INT
            {
             before(grammarAccess.getQueryPosAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getQueryPosAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPos__ValueAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\100\uffff";
    static final String dfa_2s = "\23\uffff\1\11\25\uffff\1\57\26\uffff";
    static final String dfa_3s = "\1\4\1\uffff\5\4\1\10\1\4\2\uffff\1\4\2\uffff\2\4\1\33\1\4\1\17\1\4\1\17\4\4\1\10\2\4\1\uffff\1\20\1\4\1\17\3\4\1\10\4\4\1\17\4\4\1\10\1\4\1\uffff\3\4\1\10\1\4\1\17\1\4\1\17\4\4\1\10\1\4\1\17\1\4";
    static final String dfa_4s = "\1\14\1\uffff\1\16\1\30\3\32\1\10\1\4\2\uffff\1\4\2\uffff\1\4\1\16\1\33\1\30\1\17\1\36\1\17\4\32\1\10\1\16\1\32\1\uffff\1\20\1\4\1\17\3\4\1\10\1\4\2\32\1\16\1\17\1\15\3\34\1\10\1\4\1\uffff\3\4\1\10\1\5\1\17\1\16\1\17\4\34\1\10\1\4\1\17\1\34";
    static final String dfa_5s = "\1\uffff\1\1\7\uffff\1\2\1\4\1\uffff\1\7\1\5\16\uffff\1\3\22\uffff\1\6\20\uffff";
    static final String dfa_6s = "\100\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\2\6\uffff\1\1",
            "",
            "\1\6\1\2\1\5\1\4\6\uffff\1\7",
            "\1\15\10\uffff\1\14\1\13\2\uffff\1\10\1\11\5\uffff\1\12",
            "\1\3\1\2\22\uffff\1\16\1\17\1\20",
            "\1\3\1\2\23\uffff\1\17\1\20",
            "\1\21\1\2\7\uffff\1\14\1\13\2\uffff\1\10\1\11\5\uffff\1\12\1\17\1\20",
            "\1\22",
            "\1\23",
            "",
            "",
            "\1\24",
            "",
            "",
            "\1\25",
            "\1\30\1\uffff\1\27\1\26\6\uffff\1\31",
            "\1\32",
            "\1\15\10\uffff\1\14\1\13\2\uffff\1\10\1\11\5\uffff\1\12",
            "\1\33",
            "\2\11\6\uffff\1\11\7\uffff\2\34\7\uffff\2\34",
            "\1\35",
            "\1\3\1\2\23\uffff\1\17\1\20",
            "\1\3\1\2\22\uffff\1\36\1\17\1\20",
            "\1\3\1\2\23\uffff\1\17\1\20",
            "\1\3\1\2\23\uffff\1\17\1\20",
            "\1\37",
            "\1\42\1\uffff\1\41\1\40\6\uffff\1\43",
            "\1\3\1\2\23\uffff\1\17\1\20",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\3\1\2\23\uffff\1\17\1\20",
            "\1\3\1\2\23\uffff\1\17\1\20",
            "\1\54\1\uffff\1\53\1\52\6\uffff\1\55",
            "\1\56",
            "\2\57\6\uffff\1\57\1\14",
            "\1\62\1\uffff\1\61\1\60\6\uffff\1\63\15\uffff\1\64",
            "\1\62\1\uffff\1\61\1\60\6\uffff\1\63\15\uffff\1\64",
            "\1\62\1\uffff\1\61\1\60\6\uffff\1\63\15\uffff\1\64",
            "\1\65",
            "\1\47",
            "",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\67",
            "\1\3\1\2",
            "\1\70",
            "\1\73\1\uffff\1\72\1\71\6\uffff\1\74",
            "\1\75",
            "\1\62\1\uffff\1\61\1\60\6\uffff\1\63\15\uffff\1\64",
            "\1\62\1\uffff\1\61\1\60\6\uffff\1\63\15\uffff\1\64",
            "\1\62\1\uffff\1\61\1\60\6\uffff\1\63\15\uffff\1\64",
            "\1\62\1\uffff\1\61\1\60\6\uffff\1\63\15\uffff\1\64",
            "\1\76",
            "\1\66",
            "\1\77",
            "\1\62\1\uffff\1\61\1\60\6\uffff\1\63\15\uffff\1\64"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "477:1: rule__MegalFile__Alternatives_3 : ( ( ( rule__MegalFile__Group_3_0__0 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_1 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_2 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_3 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_4 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_5 ) ) | ( ( rule__MegalFile__BindingsAssignment_3_6 ) ) );";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\3\1\uffff\1\1\2\uffff\1\3\1\1\1\uffff\1\3\1\1";
    static final String dfa_10s = "\1\4\1\uffff\1\4\1\uffff\6\4";
    static final String dfa_11s = "\1\16\1\uffff\1\32\1\uffff\1\30\1\14\2\30\1\14\1\30";
    static final String dfa_12s = "\1\uffff\1\1\1\uffff\1\2\6\uffff";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\1\3\2\1\3\uffff\1\3\2\uffff\1\1",
            "",
            "\1\4\1\1\5\uffff\1\1\1\uffff\2\3\2\uffff\2\3\5\uffff\1\3\2\1",
            "",
            "\1\5\10\uffff\2\1\2\uffff\2\1\5\uffff\1\1",
            "\1\6\1\3\6\uffff\1\3",
            "\1\7\1\1\6\uffff\1\1\2\3\2\uffff\2\3\5\uffff\1\3",
            "\1\10\10\uffff\2\1\2\uffff\2\1\5\uffff\1\1",
            "\1\11\1\3\6\uffff\1\3",
            "\1\7\1\1\6\uffff\1\1\2\3\2\uffff\2\3\5\uffff\1\3"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "864:2: ( rule__MegalAnnotation__SelectionAssignment_1 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000040D0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000060300000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000060200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000040D2L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000100L});

}