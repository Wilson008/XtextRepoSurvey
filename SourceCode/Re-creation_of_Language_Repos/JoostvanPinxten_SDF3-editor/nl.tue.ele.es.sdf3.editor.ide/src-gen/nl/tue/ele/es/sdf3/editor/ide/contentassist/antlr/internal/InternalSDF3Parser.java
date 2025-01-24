package nl.tue.ele.es.sdf3.editor.ide.contentassist.antlr.internal;

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
import nl.tue.ele.es.sdf3.editor.services.SDF3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSDF3Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DECIMAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SDF'", "'SADF'", "'in'", "'out'", "'type'", "';'", "'properties'", "'{'", "'}'", "'application'", "'graph'", "'actor'", "'['", "']'", "','", "'channel'", "'to'", "'initially'", "'.'", "'throughput'", "'for'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DECIMAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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


        public InternalSDF3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSDF3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSDF3Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalSDF3.g"; }


    	private SDF3GrammarAccess grammarAccess;

    	public void setGrammarAccess(SDF3GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSDF3"
    // InternalSDF3.g:53:1: entryRuleSDF3 : ruleSDF3 EOF ;
    public final void entryRuleSDF3() throws RecognitionException {
        try {
            // InternalSDF3.g:54:1: ( ruleSDF3 EOF )
            // InternalSDF3.g:55:1: ruleSDF3 EOF
            {
             before(grammarAccess.getSDF3Rule()); 
            pushFollow(FOLLOW_1);
            ruleSDF3();

            state._fsp--;

             after(grammarAccess.getSDF3Rule()); 
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
    // $ANTLR end "entryRuleSDF3"


    // $ANTLR start "ruleSDF3"
    // InternalSDF3.g:62:1: ruleSDF3 : ( ( rule__SDF3__Group__0 ) ) ;
    public final void ruleSDF3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:66:2: ( ( ( rule__SDF3__Group__0 ) ) )
            // InternalSDF3.g:67:2: ( ( rule__SDF3__Group__0 ) )
            {
            // InternalSDF3.g:67:2: ( ( rule__SDF3__Group__0 ) )
            // InternalSDF3.g:68:3: ( rule__SDF3__Group__0 )
            {
             before(grammarAccess.getSDF3Access().getGroup()); 
            // InternalSDF3.g:69:3: ( rule__SDF3__Group__0 )
            // InternalSDF3.g:69:4: rule__SDF3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SDF3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSDF3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDF3"


    // $ANTLR start "entryRuleApplicationGraph"
    // InternalSDF3.g:78:1: entryRuleApplicationGraph : ruleApplicationGraph EOF ;
    public final void entryRuleApplicationGraph() throws RecognitionException {
        try {
            // InternalSDF3.g:79:1: ( ruleApplicationGraph EOF )
            // InternalSDF3.g:80:1: ruleApplicationGraph EOF
            {
             before(grammarAccess.getApplicationGraphRule()); 
            pushFollow(FOLLOW_1);
            ruleApplicationGraph();

            state._fsp--;

             after(grammarAccess.getApplicationGraphRule()); 
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
    // $ANTLR end "entryRuleApplicationGraph"


    // $ANTLR start "ruleApplicationGraph"
    // InternalSDF3.g:87:1: ruleApplicationGraph : ( ( rule__ApplicationGraph__Group__0 ) ) ;
    public final void ruleApplicationGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:91:2: ( ( ( rule__ApplicationGraph__Group__0 ) ) )
            // InternalSDF3.g:92:2: ( ( rule__ApplicationGraph__Group__0 ) )
            {
            // InternalSDF3.g:92:2: ( ( rule__ApplicationGraph__Group__0 ) )
            // InternalSDF3.g:93:3: ( rule__ApplicationGraph__Group__0 )
            {
             before(grammarAccess.getApplicationGraphAccess().getGroup()); 
            // InternalSDF3.g:94:3: ( rule__ApplicationGraph__Group__0 )
            // InternalSDF3.g:94:4: rule__ApplicationGraph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationGraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationGraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationGraph"


    // $ANTLR start "entryRuleActor"
    // InternalSDF3.g:103:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalSDF3.g:104:1: ( ruleActor EOF )
            // InternalSDF3.g:105:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalSDF3.g:112:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:116:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalSDF3.g:117:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalSDF3.g:117:2: ( ( rule__Actor__Group__0 ) )
            // InternalSDF3.g:118:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalSDF3.g:119:3: ( rule__Actor__Group__0 )
            // InternalSDF3.g:119:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRulePort"
    // InternalSDF3.g:128:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalSDF3.g:129:1: ( rulePort EOF )
            // InternalSDF3.g:130:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalSDF3.g:137:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:141:2: ( ( ( rule__Port__Group__0 ) ) )
            // InternalSDF3.g:142:2: ( ( rule__Port__Group__0 ) )
            {
            // InternalSDF3.g:142:2: ( ( rule__Port__Group__0 ) )
            // InternalSDF3.g:143:3: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // InternalSDF3.g:144:3: ( rule__Port__Group__0 )
            // InternalSDF3.g:144:4: rule__Port__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleChannel"
    // InternalSDF3.g:153:1: entryRuleChannel : ruleChannel EOF ;
    public final void entryRuleChannel() throws RecognitionException {
        try {
            // InternalSDF3.g:154:1: ( ruleChannel EOF )
            // InternalSDF3.g:155:1: ruleChannel EOF
            {
             before(grammarAccess.getChannelRule()); 
            pushFollow(FOLLOW_1);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getChannelRule()); 
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
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalSDF3.g:162:1: ruleChannel : ( ( rule__Channel__Group__0 ) ) ;
    public final void ruleChannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:166:2: ( ( ( rule__Channel__Group__0 ) ) )
            // InternalSDF3.g:167:2: ( ( rule__Channel__Group__0 ) )
            {
            // InternalSDF3.g:167:2: ( ( rule__Channel__Group__0 ) )
            // InternalSDF3.g:168:3: ( rule__Channel__Group__0 )
            {
             before(grammarAccess.getChannelAccess().getGroup()); 
            // InternalSDF3.g:169:3: ( rule__Channel__Group__0 )
            // InternalSDF3.g:169:4: rule__Channel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleFQN"
    // InternalSDF3.g:178:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalSDF3.g:179:1: ( ruleFQN EOF )
            // InternalSDF3.g:180:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalSDF3.g:187:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:191:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalSDF3.g:192:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalSDF3.g:192:2: ( ( rule__FQN__Group__0 ) )
            // InternalSDF3.g:193:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalSDF3.g:194:3: ( rule__FQN__Group__0 )
            // InternalSDF3.g:194:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleProperty"
    // InternalSDF3.g:203:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalSDF3.g:204:1: ( ruleProperty EOF )
            // InternalSDF3.g:205:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalSDF3.g:212:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:216:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalSDF3.g:217:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalSDF3.g:217:2: ( ( rule__Property__Alternatives ) )
            // InternalSDF3.g:218:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalSDF3.g:219:3: ( rule__Property__Alternatives )
            // InternalSDF3.g:219:4: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleGraphProperty"
    // InternalSDF3.g:228:1: entryRuleGraphProperty : ruleGraphProperty EOF ;
    public final void entryRuleGraphProperty() throws RecognitionException {
        try {
            // InternalSDF3.g:229:1: ( ruleGraphProperty EOF )
            // InternalSDF3.g:230:1: ruleGraphProperty EOF
            {
             before(grammarAccess.getGraphPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphProperty();

            state._fsp--;

             after(grammarAccess.getGraphPropertyRule()); 
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
    // $ANTLR end "entryRuleGraphProperty"


    // $ANTLR start "ruleGraphProperty"
    // InternalSDF3.g:237:1: ruleGraphProperty : ( ( rule__GraphProperty__Group__0 ) ) ;
    public final void ruleGraphProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:241:2: ( ( ( rule__GraphProperty__Group__0 ) ) )
            // InternalSDF3.g:242:2: ( ( rule__GraphProperty__Group__0 ) )
            {
            // InternalSDF3.g:242:2: ( ( rule__GraphProperty__Group__0 ) )
            // InternalSDF3.g:243:3: ( rule__GraphProperty__Group__0 )
            {
             before(grammarAccess.getGraphPropertyAccess().getGroup()); 
            // InternalSDF3.g:244:3: ( rule__GraphProperty__Group__0 )
            // InternalSDF3.g:244:4: rule__GraphProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphProperty"


    // $ANTLR start "entryRuleChannelProperty"
    // InternalSDF3.g:253:1: entryRuleChannelProperty : ruleChannelProperty EOF ;
    public final void entryRuleChannelProperty() throws RecognitionException {
        try {
            // InternalSDF3.g:254:1: ( ruleChannelProperty EOF )
            // InternalSDF3.g:255:1: ruleChannelProperty EOF
            {
             before(grammarAccess.getChannelPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleChannelProperty();

            state._fsp--;

             after(grammarAccess.getChannelPropertyRule()); 
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
    // $ANTLR end "entryRuleChannelProperty"


    // $ANTLR start "ruleChannelProperty"
    // InternalSDF3.g:262:1: ruleChannelProperty : ( ( rule__ChannelProperty__Group__0 ) ) ;
    public final void ruleChannelProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:266:2: ( ( ( rule__ChannelProperty__Group__0 ) ) )
            // InternalSDF3.g:267:2: ( ( rule__ChannelProperty__Group__0 ) )
            {
            // InternalSDF3.g:267:2: ( ( rule__ChannelProperty__Group__0 ) )
            // InternalSDF3.g:268:3: ( rule__ChannelProperty__Group__0 )
            {
             before(grammarAccess.getChannelPropertyAccess().getGroup()); 
            // InternalSDF3.g:269:3: ( rule__ChannelProperty__Group__0 )
            // InternalSDF3.g:269:4: rule__ChannelProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChannelProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChannelPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChannelProperty"


    // $ANTLR start "entryRuleActorProperty"
    // InternalSDF3.g:278:1: entryRuleActorProperty : ruleActorProperty EOF ;
    public final void entryRuleActorProperty() throws RecognitionException {
        try {
            // InternalSDF3.g:279:1: ( ruleActorProperty EOF )
            // InternalSDF3.g:280:1: ruleActorProperty EOF
            {
             before(grammarAccess.getActorPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleActorProperty();

            state._fsp--;

             after(grammarAccess.getActorPropertyRule()); 
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
    // $ANTLR end "entryRuleActorProperty"


    // $ANTLR start "ruleActorProperty"
    // InternalSDF3.g:287:1: ruleActorProperty : ( ( rule__ActorProperty__Group__0 ) ) ;
    public final void ruleActorProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:291:2: ( ( ( rule__ActorProperty__Group__0 ) ) )
            // InternalSDF3.g:292:2: ( ( rule__ActorProperty__Group__0 ) )
            {
            // InternalSDF3.g:292:2: ( ( rule__ActorProperty__Group__0 ) )
            // InternalSDF3.g:293:3: ( rule__ActorProperty__Group__0 )
            {
             before(grammarAccess.getActorPropertyAccess().getGroup()); 
            // InternalSDF3.g:294:3: ( rule__ActorProperty__Group__0 )
            // InternalSDF3.g:294:4: rule__ActorProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActorProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActorProperty"


    // $ANTLR start "entryRuleSDF_TYPE"
    // InternalSDF3.g:303:1: entryRuleSDF_TYPE : ruleSDF_TYPE EOF ;
    public final void entryRuleSDF_TYPE() throws RecognitionException {
        try {
            // InternalSDF3.g:304:1: ( ruleSDF_TYPE EOF )
            // InternalSDF3.g:305:1: ruleSDF_TYPE EOF
            {
             before(grammarAccess.getSDF_TYPERule()); 
            pushFollow(FOLLOW_1);
            ruleSDF_TYPE();

            state._fsp--;

             after(grammarAccess.getSDF_TYPERule()); 
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
    // $ANTLR end "entryRuleSDF_TYPE"


    // $ANTLR start "ruleSDF_TYPE"
    // InternalSDF3.g:312:1: ruleSDF_TYPE : ( ( rule__SDF_TYPE__Alternatives ) ) ;
    public final void ruleSDF_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:316:2: ( ( ( rule__SDF_TYPE__Alternatives ) ) )
            // InternalSDF3.g:317:2: ( ( rule__SDF_TYPE__Alternatives ) )
            {
            // InternalSDF3.g:317:2: ( ( rule__SDF_TYPE__Alternatives ) )
            // InternalSDF3.g:318:3: ( rule__SDF_TYPE__Alternatives )
            {
             before(grammarAccess.getSDF_TYPEAccess().getAlternatives()); 
            // InternalSDF3.g:319:3: ( rule__SDF_TYPE__Alternatives )
            // InternalSDF3.g:319:4: rule__SDF_TYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SDF_TYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSDF_TYPEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDF_TYPE"


    // $ANTLR start "rulePortType"
    // InternalSDF3.g:328:1: rulePortType : ( ( rule__PortType__Alternatives ) ) ;
    public final void rulePortType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:332:1: ( ( ( rule__PortType__Alternatives ) ) )
            // InternalSDF3.g:333:2: ( ( rule__PortType__Alternatives ) )
            {
            // InternalSDF3.g:333:2: ( ( rule__PortType__Alternatives ) )
            // InternalSDF3.g:334:3: ( rule__PortType__Alternatives )
            {
             before(grammarAccess.getPortTypeAccess().getAlternatives()); 
            // InternalSDF3.g:335:3: ( rule__PortType__Alternatives )
            // InternalSDF3.g:335:4: rule__PortType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PortType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPortTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePortType"


    // $ANTLR start "rule__Property__Alternatives"
    // InternalSDF3.g:343:1: rule__Property__Alternatives : ( ( ruleActorProperty ) | ( ruleChannelProperty ) | ( ruleGraphProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:347:1: ( ( ruleActorProperty ) | ( ruleChannelProperty ) | ( ruleGraphProperty ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==23) ) {
                    alt1=1;
                }
                else if ( (LA1_1==27) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==31) ) {
                alt1=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSDF3.g:348:2: ( ruleActorProperty )
                    {
                    // InternalSDF3.g:348:2: ( ruleActorProperty )
                    // InternalSDF3.g:349:3: ruleActorProperty
                    {
                     before(grammarAccess.getPropertyAccess().getActorPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActorProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getActorPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSDF3.g:354:2: ( ruleChannelProperty )
                    {
                    // InternalSDF3.g:354:2: ( ruleChannelProperty )
                    // InternalSDF3.g:355:3: ruleChannelProperty
                    {
                     before(grammarAccess.getPropertyAccess().getChannelPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleChannelProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getChannelPropertyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSDF3.g:360:2: ( ruleGraphProperty )
                    {
                    // InternalSDF3.g:360:2: ( ruleGraphProperty )
                    // InternalSDF3.g:361:3: ruleGraphProperty
                    {
                     before(grammarAccess.getPropertyAccess().getGraphPropertyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getGraphPropertyParserRuleCall_2()); 

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
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__SDF_TYPE__Alternatives"
    // InternalSDF3.g:370:1: rule__SDF_TYPE__Alternatives : ( ( 'SDF' ) | ( 'SADF' ) );
    public final void rule__SDF_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:374:1: ( ( 'SDF' ) | ( 'SADF' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSDF3.g:375:2: ( 'SDF' )
                    {
                    // InternalSDF3.g:375:2: ( 'SDF' )
                    // InternalSDF3.g:376:3: 'SDF'
                    {
                     before(grammarAccess.getSDF_TYPEAccess().getSDFKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSDF_TYPEAccess().getSDFKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSDF3.g:381:2: ( 'SADF' )
                    {
                    // InternalSDF3.g:381:2: ( 'SADF' )
                    // InternalSDF3.g:382:3: 'SADF'
                    {
                     before(grammarAccess.getSDF_TYPEAccess().getSADFKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSDF_TYPEAccess().getSADFKeyword_1()); 

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
    // $ANTLR end "rule__SDF_TYPE__Alternatives"


    // $ANTLR start "rule__PortType__Alternatives"
    // InternalSDF3.g:391:1: rule__PortType__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );
    public final void rule__PortType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:395:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSDF3.g:396:2: ( ( 'in' ) )
                    {
                    // InternalSDF3.g:396:2: ( ( 'in' ) )
                    // InternalSDF3.g:397:3: ( 'in' )
                    {
                     before(grammarAccess.getPortTypeAccess().getINEnumLiteralDeclaration_0()); 
                    // InternalSDF3.g:398:3: ( 'in' )
                    // InternalSDF3.g:398:4: 'in'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPortTypeAccess().getINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSDF3.g:402:2: ( ( 'out' ) )
                    {
                    // InternalSDF3.g:402:2: ( ( 'out' ) )
                    // InternalSDF3.g:403:3: ( 'out' )
                    {
                     before(grammarAccess.getPortTypeAccess().getOUTEnumLiteralDeclaration_1()); 
                    // InternalSDF3.g:404:3: ( 'out' )
                    // InternalSDF3.g:404:4: 'out'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPortTypeAccess().getOUTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__PortType__Alternatives"


    // $ANTLR start "rule__SDF3__Group__0"
    // InternalSDF3.g:412:1: rule__SDF3__Group__0 : rule__SDF3__Group__0__Impl rule__SDF3__Group__1 ;
    public final void rule__SDF3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:416:1: ( rule__SDF3__Group__0__Impl rule__SDF3__Group__1 )
            // InternalSDF3.g:417:2: rule__SDF3__Group__0__Impl rule__SDF3__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SDF3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDF3__Group__1();

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
    // $ANTLR end "rule__SDF3__Group__0"


    // $ANTLR start "rule__SDF3__Group__0__Impl"
    // InternalSDF3.g:424:1: rule__SDF3__Group__0__Impl : ( 'type' ) ;
    public final void rule__SDF3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:428:1: ( ( 'type' ) )
            // InternalSDF3.g:429:1: ( 'type' )
            {
            // InternalSDF3.g:429:1: ( 'type' )
            // InternalSDF3.g:430:2: 'type'
            {
             before(grammarAccess.getSDF3Access().getTypeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSDF3Access().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDF3__Group__0__Impl"


    // $ANTLR start "rule__SDF3__Group__1"
    // InternalSDF3.g:439:1: rule__SDF3__Group__1 : rule__SDF3__Group__1__Impl rule__SDF3__Group__2 ;
    public final void rule__SDF3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:443:1: ( rule__SDF3__Group__1__Impl rule__SDF3__Group__2 )
            // InternalSDF3.g:444:2: rule__SDF3__Group__1__Impl rule__SDF3__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SDF3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDF3__Group__2();

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
    // $ANTLR end "rule__SDF3__Group__1"


    // $ANTLR start "rule__SDF3__Group__1__Impl"
    // InternalSDF3.g:451:1: rule__SDF3__Group__1__Impl : ( ruleSDF_TYPE ) ;
    public final void rule__SDF3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:455:1: ( ( ruleSDF_TYPE ) )
            // InternalSDF3.g:456:1: ( ruleSDF_TYPE )
            {
            // InternalSDF3.g:456:1: ( ruleSDF_TYPE )
            // InternalSDF3.g:457:2: ruleSDF_TYPE
            {
             before(grammarAccess.getSDF3Access().getSDF_TYPEParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleSDF_TYPE();

            state._fsp--;

             after(grammarAccess.getSDF3Access().getSDF_TYPEParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDF3__Group__1__Impl"


    // $ANTLR start "rule__SDF3__Group__2"
    // InternalSDF3.g:466:1: rule__SDF3__Group__2 : rule__SDF3__Group__2__Impl rule__SDF3__Group__3 ;
    public final void rule__SDF3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:470:1: ( rule__SDF3__Group__2__Impl rule__SDF3__Group__3 )
            // InternalSDF3.g:471:2: rule__SDF3__Group__2__Impl rule__SDF3__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SDF3__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDF3__Group__3();

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
    // $ANTLR end "rule__SDF3__Group__2"


    // $ANTLR start "rule__SDF3__Group__2__Impl"
    // InternalSDF3.g:478:1: rule__SDF3__Group__2__Impl : ( ';' ) ;
    public final void rule__SDF3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:482:1: ( ( ';' ) )
            // InternalSDF3.g:483:1: ( ';' )
            {
            // InternalSDF3.g:483:1: ( ';' )
            // InternalSDF3.g:484:2: ';'
            {
             before(grammarAccess.getSDF3Access().getSemicolonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSDF3Access().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDF3__Group__2__Impl"


    // $ANTLR start "rule__SDF3__Group__3"
    // InternalSDF3.g:493:1: rule__SDF3__Group__3 : rule__SDF3__Group__3__Impl rule__SDF3__Group__4 ;
    public final void rule__SDF3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:497:1: ( rule__SDF3__Group__3__Impl rule__SDF3__Group__4 )
            // InternalSDF3.g:498:2: rule__SDF3__Group__3__Impl rule__SDF3__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__SDF3__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDF3__Group__4();

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
    // $ANTLR end "rule__SDF3__Group__3"


    // $ANTLR start "rule__SDF3__Group__3__Impl"
    // InternalSDF3.g:505:1: rule__SDF3__Group__3__Impl : ( ( rule__SDF3__ApplicationAssignment_3 ) ) ;
    public final void rule__SDF3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:509:1: ( ( ( rule__SDF3__ApplicationAssignment_3 ) ) )
            // InternalSDF3.g:510:1: ( ( rule__SDF3__ApplicationAssignment_3 ) )
            {
            // InternalSDF3.g:510:1: ( ( rule__SDF3__ApplicationAssignment_3 ) )
            // InternalSDF3.g:511:2: ( rule__SDF3__ApplicationAssignment_3 )
            {
             before(grammarAccess.getSDF3Access().getApplicationAssignment_3()); 
            // InternalSDF3.g:512:2: ( rule__SDF3__ApplicationAssignment_3 )
            // InternalSDF3.g:512:3: rule__SDF3__ApplicationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SDF3__ApplicationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSDF3Access().getApplicationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDF3__Group__3__Impl"


    // $ANTLR start "rule__SDF3__Group__4"
    // InternalSDF3.g:520:1: rule__SDF3__Group__4 : rule__SDF3__Group__4__Impl rule__SDF3__Group__5 ;
    public final void rule__SDF3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:524:1: ( rule__SDF3__Group__4__Impl rule__SDF3__Group__5 )
            // InternalSDF3.g:525:2: rule__SDF3__Group__4__Impl rule__SDF3__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__SDF3__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDF3__Group__5();

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
    // $ANTLR end "rule__SDF3__Group__4"


    // $ANTLR start "rule__SDF3__Group__4__Impl"
    // InternalSDF3.g:532:1: rule__SDF3__Group__4__Impl : ( 'properties' ) ;
    public final void rule__SDF3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:536:1: ( ( 'properties' ) )
            // InternalSDF3.g:537:1: ( 'properties' )
            {
            // InternalSDF3.g:537:1: ( 'properties' )
            // InternalSDF3.g:538:2: 'properties'
            {
             before(grammarAccess.getSDF3Access().getPropertiesKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSDF3Access().getPropertiesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDF3__Group__4__Impl"


    // $ANTLR start "rule__SDF3__Group__5"
    // InternalSDF3.g:547:1: rule__SDF3__Group__5 : rule__SDF3__Group__5__Impl rule__SDF3__Group__6 ;
    public final void rule__SDF3__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:551:1: ( rule__SDF3__Group__5__Impl rule__SDF3__Group__6 )
            // InternalSDF3.g:552:2: rule__SDF3__Group__5__Impl rule__SDF3__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__SDF3__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDF3__Group__6();

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
    // $ANTLR end "rule__SDF3__Group__5"


    // $ANTLR start "rule__SDF3__Group__5__Impl"
    // InternalSDF3.g:559:1: rule__SDF3__Group__5__Impl : ( '{' ) ;
    public final void rule__SDF3__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:563:1: ( ( '{' ) )
            // InternalSDF3.g:564:1: ( '{' )
            {
            // InternalSDF3.g:564:1: ( '{' )
            // InternalSDF3.g:565:2: '{'
            {
             before(grammarAccess.getSDF3Access().getLeftCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSDF3Access().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDF3__Group__5__Impl"


    // $ANTLR start "rule__SDF3__Group__6"
    // InternalSDF3.g:574:1: rule__SDF3__Group__6 : rule__SDF3__Group__6__Impl rule__SDF3__Group__7 ;
    public final void rule__SDF3__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:578:1: ( rule__SDF3__Group__6__Impl rule__SDF3__Group__7 )
            // InternalSDF3.g:579:2: rule__SDF3__Group__6__Impl rule__SDF3__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__SDF3__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDF3__Group__7();

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
    // $ANTLR end "rule__SDF3__Group__6"


    // $ANTLR start "rule__SDF3__Group__6__Impl"
    // InternalSDF3.g:586:1: rule__SDF3__Group__6__Impl : ( ( rule__SDF3__PropertiesAssignment_6 )* ) ;
    public final void rule__SDF3__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:590:1: ( ( ( rule__SDF3__PropertiesAssignment_6 )* ) )
            // InternalSDF3.g:591:1: ( ( rule__SDF3__PropertiesAssignment_6 )* )
            {
            // InternalSDF3.g:591:1: ( ( rule__SDF3__PropertiesAssignment_6 )* )
            // InternalSDF3.g:592:2: ( rule__SDF3__PropertiesAssignment_6 )*
            {
             before(grammarAccess.getSDF3Access().getPropertiesAssignment_6()); 
            // InternalSDF3.g:593:2: ( rule__SDF3__PropertiesAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=31 && LA4_0<=32)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSDF3.g:593:3: rule__SDF3__PropertiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SDF3__PropertiesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSDF3Access().getPropertiesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDF3__Group__6__Impl"


    // $ANTLR start "rule__SDF3__Group__7"
    // InternalSDF3.g:601:1: rule__SDF3__Group__7 : rule__SDF3__Group__7__Impl ;
    public final void rule__SDF3__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:605:1: ( rule__SDF3__Group__7__Impl )
            // InternalSDF3.g:606:2: rule__SDF3__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SDF3__Group__7__Impl();

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
    // $ANTLR end "rule__SDF3__Group__7"


    // $ANTLR start "rule__SDF3__Group__7__Impl"
    // InternalSDF3.g:612:1: rule__SDF3__Group__7__Impl : ( '}' ) ;
    public final void rule__SDF3__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:616:1: ( ( '}' ) )
            // InternalSDF3.g:617:1: ( '}' )
            {
            // InternalSDF3.g:617:1: ( '}' )
            // InternalSDF3.g:618:2: '}'
            {
             before(grammarAccess.getSDF3Access().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSDF3Access().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDF3__Group__7__Impl"


    // $ANTLR start "rule__ApplicationGraph__Group__0"
    // InternalSDF3.g:628:1: rule__ApplicationGraph__Group__0 : rule__ApplicationGraph__Group__0__Impl rule__ApplicationGraph__Group__1 ;
    public final void rule__ApplicationGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:632:1: ( rule__ApplicationGraph__Group__0__Impl rule__ApplicationGraph__Group__1 )
            // InternalSDF3.g:633:2: rule__ApplicationGraph__Group__0__Impl rule__ApplicationGraph__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ApplicationGraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationGraph__Group__1();

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
    // $ANTLR end "rule__ApplicationGraph__Group__0"


    // $ANTLR start "rule__ApplicationGraph__Group__0__Impl"
    // InternalSDF3.g:640:1: rule__ApplicationGraph__Group__0__Impl : ( 'application' ) ;
    public final void rule__ApplicationGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:644:1: ( ( 'application' ) )
            // InternalSDF3.g:645:1: ( 'application' )
            {
            // InternalSDF3.g:645:1: ( 'application' )
            // InternalSDF3.g:646:2: 'application'
            {
             before(grammarAccess.getApplicationGraphAccess().getApplicationKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getApplicationGraphAccess().getApplicationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationGraph__Group__0__Impl"


    // $ANTLR start "rule__ApplicationGraph__Group__1"
    // InternalSDF3.g:655:1: rule__ApplicationGraph__Group__1 : rule__ApplicationGraph__Group__1__Impl rule__ApplicationGraph__Group__2 ;
    public final void rule__ApplicationGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:659:1: ( rule__ApplicationGraph__Group__1__Impl rule__ApplicationGraph__Group__2 )
            // InternalSDF3.g:660:2: rule__ApplicationGraph__Group__1__Impl rule__ApplicationGraph__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ApplicationGraph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationGraph__Group__2();

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
    // $ANTLR end "rule__ApplicationGraph__Group__1"


    // $ANTLR start "rule__ApplicationGraph__Group__1__Impl"
    // InternalSDF3.g:667:1: rule__ApplicationGraph__Group__1__Impl : ( 'graph' ) ;
    public final void rule__ApplicationGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:671:1: ( ( 'graph' ) )
            // InternalSDF3.g:672:1: ( 'graph' )
            {
            // InternalSDF3.g:672:1: ( 'graph' )
            // InternalSDF3.g:673:2: 'graph'
            {
             before(grammarAccess.getApplicationGraphAccess().getGraphKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getApplicationGraphAccess().getGraphKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationGraph__Group__1__Impl"


    // $ANTLR start "rule__ApplicationGraph__Group__2"
    // InternalSDF3.g:682:1: rule__ApplicationGraph__Group__2 : rule__ApplicationGraph__Group__2__Impl rule__ApplicationGraph__Group__3 ;
    public final void rule__ApplicationGraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:686:1: ( rule__ApplicationGraph__Group__2__Impl rule__ApplicationGraph__Group__3 )
            // InternalSDF3.g:687:2: rule__ApplicationGraph__Group__2__Impl rule__ApplicationGraph__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ApplicationGraph__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationGraph__Group__3();

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
    // $ANTLR end "rule__ApplicationGraph__Group__2"


    // $ANTLR start "rule__ApplicationGraph__Group__2__Impl"
    // InternalSDF3.g:694:1: rule__ApplicationGraph__Group__2__Impl : ( ( rule__ApplicationGraph__NameAssignment_2 ) ) ;
    public final void rule__ApplicationGraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:698:1: ( ( ( rule__ApplicationGraph__NameAssignment_2 ) ) )
            // InternalSDF3.g:699:1: ( ( rule__ApplicationGraph__NameAssignment_2 ) )
            {
            // InternalSDF3.g:699:1: ( ( rule__ApplicationGraph__NameAssignment_2 ) )
            // InternalSDF3.g:700:2: ( rule__ApplicationGraph__NameAssignment_2 )
            {
             before(grammarAccess.getApplicationGraphAccess().getNameAssignment_2()); 
            // InternalSDF3.g:701:2: ( rule__ApplicationGraph__NameAssignment_2 )
            // InternalSDF3.g:701:3: rule__ApplicationGraph__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationGraph__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApplicationGraphAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationGraph__Group__2__Impl"


    // $ANTLR start "rule__ApplicationGraph__Group__3"
    // InternalSDF3.g:709:1: rule__ApplicationGraph__Group__3 : rule__ApplicationGraph__Group__3__Impl rule__ApplicationGraph__Group__4 ;
    public final void rule__ApplicationGraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:713:1: ( rule__ApplicationGraph__Group__3__Impl rule__ApplicationGraph__Group__4 )
            // InternalSDF3.g:714:2: rule__ApplicationGraph__Group__3__Impl rule__ApplicationGraph__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ApplicationGraph__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationGraph__Group__4();

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
    // $ANTLR end "rule__ApplicationGraph__Group__3"


    // $ANTLR start "rule__ApplicationGraph__Group__3__Impl"
    // InternalSDF3.g:721:1: rule__ApplicationGraph__Group__3__Impl : ( '{' ) ;
    public final void rule__ApplicationGraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:725:1: ( ( '{' ) )
            // InternalSDF3.g:726:1: ( '{' )
            {
            // InternalSDF3.g:726:1: ( '{' )
            // InternalSDF3.g:727:2: '{'
            {
             before(grammarAccess.getApplicationGraphAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getApplicationGraphAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationGraph__Group__3__Impl"


    // $ANTLR start "rule__ApplicationGraph__Group__4"
    // InternalSDF3.g:736:1: rule__ApplicationGraph__Group__4 : rule__ApplicationGraph__Group__4__Impl rule__ApplicationGraph__Group__5 ;
    public final void rule__ApplicationGraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:740:1: ( rule__ApplicationGraph__Group__4__Impl rule__ApplicationGraph__Group__5 )
            // InternalSDF3.g:741:2: rule__ApplicationGraph__Group__4__Impl rule__ApplicationGraph__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__ApplicationGraph__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationGraph__Group__5();

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
    // $ANTLR end "rule__ApplicationGraph__Group__4"


    // $ANTLR start "rule__ApplicationGraph__Group__4__Impl"
    // InternalSDF3.g:748:1: rule__ApplicationGraph__Group__4__Impl : ( ( ( rule__ApplicationGraph__ActorsAssignment_4 ) ) ( ( rule__ApplicationGraph__ActorsAssignment_4 )* ) ) ;
    public final void rule__ApplicationGraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:752:1: ( ( ( ( rule__ApplicationGraph__ActorsAssignment_4 ) ) ( ( rule__ApplicationGraph__ActorsAssignment_4 )* ) ) )
            // InternalSDF3.g:753:1: ( ( ( rule__ApplicationGraph__ActorsAssignment_4 ) ) ( ( rule__ApplicationGraph__ActorsAssignment_4 )* ) )
            {
            // InternalSDF3.g:753:1: ( ( ( rule__ApplicationGraph__ActorsAssignment_4 ) ) ( ( rule__ApplicationGraph__ActorsAssignment_4 )* ) )
            // InternalSDF3.g:754:2: ( ( rule__ApplicationGraph__ActorsAssignment_4 ) ) ( ( rule__ApplicationGraph__ActorsAssignment_4 )* )
            {
            // InternalSDF3.g:754:2: ( ( rule__ApplicationGraph__ActorsAssignment_4 ) )
            // InternalSDF3.g:755:3: ( rule__ApplicationGraph__ActorsAssignment_4 )
            {
             before(grammarAccess.getApplicationGraphAccess().getActorsAssignment_4()); 
            // InternalSDF3.g:756:3: ( rule__ApplicationGraph__ActorsAssignment_4 )
            // InternalSDF3.g:756:4: rule__ApplicationGraph__ActorsAssignment_4
            {
            pushFollow(FOLLOW_14);
            rule__ApplicationGraph__ActorsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getApplicationGraphAccess().getActorsAssignment_4()); 

            }

            // InternalSDF3.g:759:2: ( ( rule__ApplicationGraph__ActorsAssignment_4 )* )
            // InternalSDF3.g:760:3: ( rule__ApplicationGraph__ActorsAssignment_4 )*
            {
             before(grammarAccess.getApplicationGraphAccess().getActorsAssignment_4()); 
            // InternalSDF3.g:761:3: ( rule__ApplicationGraph__ActorsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSDF3.g:761:4: rule__ApplicationGraph__ActorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ApplicationGraph__ActorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getApplicationGraphAccess().getActorsAssignment_4()); 

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
    // $ANTLR end "rule__ApplicationGraph__Group__4__Impl"


    // $ANTLR start "rule__ApplicationGraph__Group__5"
    // InternalSDF3.g:770:1: rule__ApplicationGraph__Group__5 : rule__ApplicationGraph__Group__5__Impl rule__ApplicationGraph__Group__6 ;
    public final void rule__ApplicationGraph__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:774:1: ( rule__ApplicationGraph__Group__5__Impl rule__ApplicationGraph__Group__6 )
            // InternalSDF3.g:775:2: rule__ApplicationGraph__Group__5__Impl rule__ApplicationGraph__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__ApplicationGraph__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationGraph__Group__6();

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
    // $ANTLR end "rule__ApplicationGraph__Group__5"


    // $ANTLR start "rule__ApplicationGraph__Group__5__Impl"
    // InternalSDF3.g:782:1: rule__ApplicationGraph__Group__5__Impl : ( ( ( rule__ApplicationGraph__ChannelsAssignment_5 ) ) ( ( rule__ApplicationGraph__ChannelsAssignment_5 )* ) ) ;
    public final void rule__ApplicationGraph__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:786:1: ( ( ( ( rule__ApplicationGraph__ChannelsAssignment_5 ) ) ( ( rule__ApplicationGraph__ChannelsAssignment_5 )* ) ) )
            // InternalSDF3.g:787:1: ( ( ( rule__ApplicationGraph__ChannelsAssignment_5 ) ) ( ( rule__ApplicationGraph__ChannelsAssignment_5 )* ) )
            {
            // InternalSDF3.g:787:1: ( ( ( rule__ApplicationGraph__ChannelsAssignment_5 ) ) ( ( rule__ApplicationGraph__ChannelsAssignment_5 )* ) )
            // InternalSDF3.g:788:2: ( ( rule__ApplicationGraph__ChannelsAssignment_5 ) ) ( ( rule__ApplicationGraph__ChannelsAssignment_5 )* )
            {
            // InternalSDF3.g:788:2: ( ( rule__ApplicationGraph__ChannelsAssignment_5 ) )
            // InternalSDF3.g:789:3: ( rule__ApplicationGraph__ChannelsAssignment_5 )
            {
             before(grammarAccess.getApplicationGraphAccess().getChannelsAssignment_5()); 
            // InternalSDF3.g:790:3: ( rule__ApplicationGraph__ChannelsAssignment_5 )
            // InternalSDF3.g:790:4: rule__ApplicationGraph__ChannelsAssignment_5
            {
            pushFollow(FOLLOW_16);
            rule__ApplicationGraph__ChannelsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getApplicationGraphAccess().getChannelsAssignment_5()); 

            }

            // InternalSDF3.g:793:2: ( ( rule__ApplicationGraph__ChannelsAssignment_5 )* )
            // InternalSDF3.g:794:3: ( rule__ApplicationGraph__ChannelsAssignment_5 )*
            {
             before(grammarAccess.getApplicationGraphAccess().getChannelsAssignment_5()); 
            // InternalSDF3.g:795:3: ( rule__ApplicationGraph__ChannelsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSDF3.g:795:4: rule__ApplicationGraph__ChannelsAssignment_5
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ApplicationGraph__ChannelsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getApplicationGraphAccess().getChannelsAssignment_5()); 

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
    // $ANTLR end "rule__ApplicationGraph__Group__5__Impl"


    // $ANTLR start "rule__ApplicationGraph__Group__6"
    // InternalSDF3.g:804:1: rule__ApplicationGraph__Group__6 : rule__ApplicationGraph__Group__6__Impl ;
    public final void rule__ApplicationGraph__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:808:1: ( rule__ApplicationGraph__Group__6__Impl )
            // InternalSDF3.g:809:2: rule__ApplicationGraph__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationGraph__Group__6__Impl();

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
    // $ANTLR end "rule__ApplicationGraph__Group__6"


    // $ANTLR start "rule__ApplicationGraph__Group__6__Impl"
    // InternalSDF3.g:815:1: rule__ApplicationGraph__Group__6__Impl : ( '}' ) ;
    public final void rule__ApplicationGraph__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:819:1: ( ( '}' ) )
            // InternalSDF3.g:820:1: ( '}' )
            {
            // InternalSDF3.g:820:1: ( '}' )
            // InternalSDF3.g:821:2: '}'
            {
             before(grammarAccess.getApplicationGraphAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getApplicationGraphAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationGraph__Group__6__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // InternalSDF3.g:831:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:835:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalSDF3.g:836:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

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
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalSDF3.g:843:1: rule__Actor__Group__0__Impl : ( 'actor' ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:847:1: ( ( 'actor' ) )
            // InternalSDF3.g:848:1: ( 'actor' )
            {
            // InternalSDF3.g:848:1: ( 'actor' )
            // InternalSDF3.g:849:2: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getActorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalSDF3.g:858:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:862:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalSDF3.g:863:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__2();

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
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalSDF3.g:870:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__NameAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:874:1: ( ( ( rule__Actor__NameAssignment_1 ) ) )
            // InternalSDF3.g:875:1: ( ( rule__Actor__NameAssignment_1 ) )
            {
            // InternalSDF3.g:875:1: ( ( rule__Actor__NameAssignment_1 ) )
            // InternalSDF3.g:876:2: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // InternalSDF3.g:877:2: ( rule__Actor__NameAssignment_1 )
            // InternalSDF3.g:877:3: rule__Actor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // InternalSDF3.g:885:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:889:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalSDF3.g:890:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Actor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__3();

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
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // InternalSDF3.g:897:1: rule__Actor__Group__2__Impl : ( '[' ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:901:1: ( ( '[' ) )
            // InternalSDF3.g:902:1: ( '[' )
            {
            // InternalSDF3.g:902:1: ( '[' )
            // InternalSDF3.g:903:2: '['
            {
             before(grammarAccess.getActorAccess().getLeftSquareBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__3"
    // InternalSDF3.g:912:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl rule__Actor__Group__4 ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:916:1: ( rule__Actor__Group__3__Impl rule__Actor__Group__4 )
            // InternalSDF3.g:917:2: rule__Actor__Group__3__Impl rule__Actor__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Actor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__4();

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
    // $ANTLR end "rule__Actor__Group__3"


    // $ANTLR start "rule__Actor__Group__3__Impl"
    // InternalSDF3.g:924:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__TypeAssignment_3 ) ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:928:1: ( ( ( rule__Actor__TypeAssignment_3 ) ) )
            // InternalSDF3.g:929:1: ( ( rule__Actor__TypeAssignment_3 ) )
            {
            // InternalSDF3.g:929:1: ( ( rule__Actor__TypeAssignment_3 ) )
            // InternalSDF3.g:930:2: ( rule__Actor__TypeAssignment_3 )
            {
             before(grammarAccess.getActorAccess().getTypeAssignment_3()); 
            // InternalSDF3.g:931:2: ( rule__Actor__TypeAssignment_3 )
            // InternalSDF3.g:931:3: rule__Actor__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Actor__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3__Impl"


    // $ANTLR start "rule__Actor__Group__4"
    // InternalSDF3.g:939:1: rule__Actor__Group__4 : rule__Actor__Group__4__Impl rule__Actor__Group__5 ;
    public final void rule__Actor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:943:1: ( rule__Actor__Group__4__Impl rule__Actor__Group__5 )
            // InternalSDF3.g:944:2: rule__Actor__Group__4__Impl rule__Actor__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Actor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__5();

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
    // $ANTLR end "rule__Actor__Group__4"


    // $ANTLR start "rule__Actor__Group__4__Impl"
    // InternalSDF3.g:951:1: rule__Actor__Group__4__Impl : ( ']' ) ;
    public final void rule__Actor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:955:1: ( ( ']' ) )
            // InternalSDF3.g:956:1: ( ']' )
            {
            // InternalSDF3.g:956:1: ( ']' )
            // InternalSDF3.g:957:2: ']'
            {
             before(grammarAccess.getActorAccess().getRightSquareBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__4__Impl"


    // $ANTLR start "rule__Actor__Group__5"
    // InternalSDF3.g:966:1: rule__Actor__Group__5 : rule__Actor__Group__5__Impl rule__Actor__Group__6 ;
    public final void rule__Actor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:970:1: ( rule__Actor__Group__5__Impl rule__Actor__Group__6 )
            // InternalSDF3.g:971:2: rule__Actor__Group__5__Impl rule__Actor__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Actor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__6();

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
    // $ANTLR end "rule__Actor__Group__5"


    // $ANTLR start "rule__Actor__Group__5__Impl"
    // InternalSDF3.g:978:1: rule__Actor__Group__5__Impl : ( ( rule__Actor__PortsAssignment_5 ) ) ;
    public final void rule__Actor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:982:1: ( ( ( rule__Actor__PortsAssignment_5 ) ) )
            // InternalSDF3.g:983:1: ( ( rule__Actor__PortsAssignment_5 ) )
            {
            // InternalSDF3.g:983:1: ( ( rule__Actor__PortsAssignment_5 ) )
            // InternalSDF3.g:984:2: ( rule__Actor__PortsAssignment_5 )
            {
             before(grammarAccess.getActorAccess().getPortsAssignment_5()); 
            // InternalSDF3.g:985:2: ( rule__Actor__PortsAssignment_5 )
            // InternalSDF3.g:985:3: rule__Actor__PortsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Actor__PortsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getPortsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__5__Impl"


    // $ANTLR start "rule__Actor__Group__6"
    // InternalSDF3.g:993:1: rule__Actor__Group__6 : rule__Actor__Group__6__Impl rule__Actor__Group__7 ;
    public final void rule__Actor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:997:1: ( rule__Actor__Group__6__Impl rule__Actor__Group__7 )
            // InternalSDF3.g:998:2: rule__Actor__Group__6__Impl rule__Actor__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Actor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__7();

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
    // $ANTLR end "rule__Actor__Group__6"


    // $ANTLR start "rule__Actor__Group__6__Impl"
    // InternalSDF3.g:1005:1: rule__Actor__Group__6__Impl : ( ( rule__Actor__Group_6__0 )* ) ;
    public final void rule__Actor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1009:1: ( ( ( rule__Actor__Group_6__0 )* ) )
            // InternalSDF3.g:1010:1: ( ( rule__Actor__Group_6__0 )* )
            {
            // InternalSDF3.g:1010:1: ( ( rule__Actor__Group_6__0 )* )
            // InternalSDF3.g:1011:2: ( rule__Actor__Group_6__0 )*
            {
             before(grammarAccess.getActorAccess().getGroup_6()); 
            // InternalSDF3.g:1012:2: ( rule__Actor__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSDF3.g:1012:3: rule__Actor__Group_6__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Actor__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__6__Impl"


    // $ANTLR start "rule__Actor__Group__7"
    // InternalSDF3.g:1020:1: rule__Actor__Group__7 : rule__Actor__Group__7__Impl ;
    public final void rule__Actor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1024:1: ( rule__Actor__Group__7__Impl )
            // InternalSDF3.g:1025:2: rule__Actor__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__7__Impl();

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
    // $ANTLR end "rule__Actor__Group__7"


    // $ANTLR start "rule__Actor__Group__7__Impl"
    // InternalSDF3.g:1031:1: rule__Actor__Group__7__Impl : ( ';' ) ;
    public final void rule__Actor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1035:1: ( ( ';' ) )
            // InternalSDF3.g:1036:1: ( ';' )
            {
            // InternalSDF3.g:1036:1: ( ';' )
            // InternalSDF3.g:1037:2: ';'
            {
             before(grammarAccess.getActorAccess().getSemicolonKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__7__Impl"


    // $ANTLR start "rule__Actor__Group_6__0"
    // InternalSDF3.g:1047:1: rule__Actor__Group_6__0 : rule__Actor__Group_6__0__Impl rule__Actor__Group_6__1 ;
    public final void rule__Actor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1051:1: ( rule__Actor__Group_6__0__Impl rule__Actor__Group_6__1 )
            // InternalSDF3.g:1052:2: rule__Actor__Group_6__0__Impl rule__Actor__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__Actor__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_6__1();

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
    // $ANTLR end "rule__Actor__Group_6__0"


    // $ANTLR start "rule__Actor__Group_6__0__Impl"
    // InternalSDF3.g:1059:1: rule__Actor__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Actor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1063:1: ( ( ',' ) )
            // InternalSDF3.g:1064:1: ( ',' )
            {
            // InternalSDF3.g:1064:1: ( ',' )
            // InternalSDF3.g:1065:2: ','
            {
             before(grammarAccess.getActorAccess().getCommaKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_6__0__Impl"


    // $ANTLR start "rule__Actor__Group_6__1"
    // InternalSDF3.g:1074:1: rule__Actor__Group_6__1 : rule__Actor__Group_6__1__Impl ;
    public final void rule__Actor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1078:1: ( rule__Actor__Group_6__1__Impl )
            // InternalSDF3.g:1079:2: rule__Actor__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_6__1__Impl();

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
    // $ANTLR end "rule__Actor__Group_6__1"


    // $ANTLR start "rule__Actor__Group_6__1__Impl"
    // InternalSDF3.g:1085:1: rule__Actor__Group_6__1__Impl : ( ( rule__Actor__PortsAssignment_6_1 ) ) ;
    public final void rule__Actor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1089:1: ( ( ( rule__Actor__PortsAssignment_6_1 ) ) )
            // InternalSDF3.g:1090:1: ( ( rule__Actor__PortsAssignment_6_1 ) )
            {
            // InternalSDF3.g:1090:1: ( ( rule__Actor__PortsAssignment_6_1 ) )
            // InternalSDF3.g:1091:2: ( rule__Actor__PortsAssignment_6_1 )
            {
             before(grammarAccess.getActorAccess().getPortsAssignment_6_1()); 
            // InternalSDF3.g:1092:2: ( rule__Actor__PortsAssignment_6_1 )
            // InternalSDF3.g:1092:3: rule__Actor__PortsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__PortsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getPortsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_6__1__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // InternalSDF3.g:1101:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1105:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalSDF3.g:1106:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__1();

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
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // InternalSDF3.g:1113:1: rule__Port__Group__0__Impl : ( ( rule__Port__PortTypeAssignment_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1117:1: ( ( ( rule__Port__PortTypeAssignment_0 ) ) )
            // InternalSDF3.g:1118:1: ( ( rule__Port__PortTypeAssignment_0 ) )
            {
            // InternalSDF3.g:1118:1: ( ( rule__Port__PortTypeAssignment_0 ) )
            // InternalSDF3.g:1119:2: ( rule__Port__PortTypeAssignment_0 )
            {
             before(grammarAccess.getPortAccess().getPortTypeAssignment_0()); 
            // InternalSDF3.g:1120:2: ( rule__Port__PortTypeAssignment_0 )
            // InternalSDF3.g:1120:3: rule__Port__PortTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Port__PortTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getPortTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // InternalSDF3.g:1128:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1132:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // InternalSDF3.g:1133:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__2();

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
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // InternalSDF3.g:1140:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1144:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // InternalSDF3.g:1145:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // InternalSDF3.g:1145:1: ( ( rule__Port__NameAssignment_1 ) )
            // InternalSDF3.g:1146:2: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // InternalSDF3.g:1147:2: ( rule__Port__NameAssignment_1 )
            // InternalSDF3.g:1147:3: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Port__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Port__Group__2"
    // InternalSDF3.g:1155:1: rule__Port__Group__2 : rule__Port__Group__2__Impl ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1159:1: ( rule__Port__Group__2__Impl )
            // InternalSDF3.g:1160:2: rule__Port__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__2__Impl();

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
    // $ANTLR end "rule__Port__Group__2"


    // $ANTLR start "rule__Port__Group__2__Impl"
    // InternalSDF3.g:1166:1: rule__Port__Group__2__Impl : ( ( rule__Port__RateAssignment_2 ) ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1170:1: ( ( ( rule__Port__RateAssignment_2 ) ) )
            // InternalSDF3.g:1171:1: ( ( rule__Port__RateAssignment_2 ) )
            {
            // InternalSDF3.g:1171:1: ( ( rule__Port__RateAssignment_2 ) )
            // InternalSDF3.g:1172:2: ( rule__Port__RateAssignment_2 )
            {
             before(grammarAccess.getPortAccess().getRateAssignment_2()); 
            // InternalSDF3.g:1173:2: ( rule__Port__RateAssignment_2 )
            // InternalSDF3.g:1173:3: rule__Port__RateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Port__RateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getRateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__2__Impl"


    // $ANTLR start "rule__Channel__Group__0"
    // InternalSDF3.g:1182:1: rule__Channel__Group__0 : rule__Channel__Group__0__Impl rule__Channel__Group__1 ;
    public final void rule__Channel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1186:1: ( rule__Channel__Group__0__Impl rule__Channel__Group__1 )
            // InternalSDF3.g:1187:2: rule__Channel__Group__0__Impl rule__Channel__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Channel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__1();

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
    // $ANTLR end "rule__Channel__Group__0"


    // $ANTLR start "rule__Channel__Group__0__Impl"
    // InternalSDF3.g:1194:1: rule__Channel__Group__0__Impl : ( 'channel' ) ;
    public final void rule__Channel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1198:1: ( ( 'channel' ) )
            // InternalSDF3.g:1199:1: ( 'channel' )
            {
            // InternalSDF3.g:1199:1: ( 'channel' )
            // InternalSDF3.g:1200:2: 'channel'
            {
             before(grammarAccess.getChannelAccess().getChannelKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getChannelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__0__Impl"


    // $ANTLR start "rule__Channel__Group__1"
    // InternalSDF3.g:1209:1: rule__Channel__Group__1 : rule__Channel__Group__1__Impl rule__Channel__Group__2 ;
    public final void rule__Channel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1213:1: ( rule__Channel__Group__1__Impl rule__Channel__Group__2 )
            // InternalSDF3.g:1214:2: rule__Channel__Group__1__Impl rule__Channel__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Channel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__2();

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
    // $ANTLR end "rule__Channel__Group__1"


    // $ANTLR start "rule__Channel__Group__1__Impl"
    // InternalSDF3.g:1221:1: rule__Channel__Group__1__Impl : ( ( rule__Channel__NameAssignment_1 ) ) ;
    public final void rule__Channel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1225:1: ( ( ( rule__Channel__NameAssignment_1 ) ) )
            // InternalSDF3.g:1226:1: ( ( rule__Channel__NameAssignment_1 ) )
            {
            // InternalSDF3.g:1226:1: ( ( rule__Channel__NameAssignment_1 ) )
            // InternalSDF3.g:1227:2: ( rule__Channel__NameAssignment_1 )
            {
             before(grammarAccess.getChannelAccess().getNameAssignment_1()); 
            // InternalSDF3.g:1228:2: ( rule__Channel__NameAssignment_1 )
            // InternalSDF3.g:1228:3: rule__Channel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Channel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__1__Impl"


    // $ANTLR start "rule__Channel__Group__2"
    // InternalSDF3.g:1236:1: rule__Channel__Group__2 : rule__Channel__Group__2__Impl rule__Channel__Group__3 ;
    public final void rule__Channel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1240:1: ( rule__Channel__Group__2__Impl rule__Channel__Group__3 )
            // InternalSDF3.g:1241:2: rule__Channel__Group__2__Impl rule__Channel__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Channel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__3();

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
    // $ANTLR end "rule__Channel__Group__2"


    // $ANTLR start "rule__Channel__Group__2__Impl"
    // InternalSDF3.g:1248:1: rule__Channel__Group__2__Impl : ( ( rule__Channel__SourceAssignment_2 ) ) ;
    public final void rule__Channel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1252:1: ( ( ( rule__Channel__SourceAssignment_2 ) ) )
            // InternalSDF3.g:1253:1: ( ( rule__Channel__SourceAssignment_2 ) )
            {
            // InternalSDF3.g:1253:1: ( ( rule__Channel__SourceAssignment_2 ) )
            // InternalSDF3.g:1254:2: ( rule__Channel__SourceAssignment_2 )
            {
             before(grammarAccess.getChannelAccess().getSourceAssignment_2()); 
            // InternalSDF3.g:1255:2: ( rule__Channel__SourceAssignment_2 )
            // InternalSDF3.g:1255:3: rule__Channel__SourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Channel__SourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__2__Impl"


    // $ANTLR start "rule__Channel__Group__3"
    // InternalSDF3.g:1263:1: rule__Channel__Group__3 : rule__Channel__Group__3__Impl rule__Channel__Group__4 ;
    public final void rule__Channel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1267:1: ( rule__Channel__Group__3__Impl rule__Channel__Group__4 )
            // InternalSDF3.g:1268:2: rule__Channel__Group__3__Impl rule__Channel__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Channel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__4();

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
    // $ANTLR end "rule__Channel__Group__3"


    // $ANTLR start "rule__Channel__Group__3__Impl"
    // InternalSDF3.g:1275:1: rule__Channel__Group__3__Impl : ( 'to' ) ;
    public final void rule__Channel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1279:1: ( ( 'to' ) )
            // InternalSDF3.g:1280:1: ( 'to' )
            {
            // InternalSDF3.g:1280:1: ( 'to' )
            // InternalSDF3.g:1281:2: 'to'
            {
             before(grammarAccess.getChannelAccess().getToKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__3__Impl"


    // $ANTLR start "rule__Channel__Group__4"
    // InternalSDF3.g:1290:1: rule__Channel__Group__4 : rule__Channel__Group__4__Impl rule__Channel__Group__5 ;
    public final void rule__Channel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1294:1: ( rule__Channel__Group__4__Impl rule__Channel__Group__5 )
            // InternalSDF3.g:1295:2: rule__Channel__Group__4__Impl rule__Channel__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Channel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__5();

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
    // $ANTLR end "rule__Channel__Group__4"


    // $ANTLR start "rule__Channel__Group__4__Impl"
    // InternalSDF3.g:1302:1: rule__Channel__Group__4__Impl : ( ( rule__Channel__DestinationAssignment_4 ) ) ;
    public final void rule__Channel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1306:1: ( ( ( rule__Channel__DestinationAssignment_4 ) ) )
            // InternalSDF3.g:1307:1: ( ( rule__Channel__DestinationAssignment_4 ) )
            {
            // InternalSDF3.g:1307:1: ( ( rule__Channel__DestinationAssignment_4 ) )
            // InternalSDF3.g:1308:2: ( rule__Channel__DestinationAssignment_4 )
            {
             before(grammarAccess.getChannelAccess().getDestinationAssignment_4()); 
            // InternalSDF3.g:1309:2: ( rule__Channel__DestinationAssignment_4 )
            // InternalSDF3.g:1309:3: rule__Channel__DestinationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Channel__DestinationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getDestinationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__4__Impl"


    // $ANTLR start "rule__Channel__Group__5"
    // InternalSDF3.g:1317:1: rule__Channel__Group__5 : rule__Channel__Group__5__Impl ;
    public final void rule__Channel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1321:1: ( rule__Channel__Group__5__Impl )
            // InternalSDF3.g:1322:2: rule__Channel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Group__5__Impl();

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
    // $ANTLR end "rule__Channel__Group__5"


    // $ANTLR start "rule__Channel__Group__5__Impl"
    // InternalSDF3.g:1328:1: rule__Channel__Group__5__Impl : ( ( rule__Channel__Group_5__0 )? ) ;
    public final void rule__Channel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1332:1: ( ( ( rule__Channel__Group_5__0 )? ) )
            // InternalSDF3.g:1333:1: ( ( rule__Channel__Group_5__0 )? )
            {
            // InternalSDF3.g:1333:1: ( ( rule__Channel__Group_5__0 )? )
            // InternalSDF3.g:1334:2: ( rule__Channel__Group_5__0 )?
            {
             before(grammarAccess.getChannelAccess().getGroup_5()); 
            // InternalSDF3.g:1335:2: ( rule__Channel__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSDF3.g:1335:3: rule__Channel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Channel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChannelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__5__Impl"


    // $ANTLR start "rule__Channel__Group_5__0"
    // InternalSDF3.g:1344:1: rule__Channel__Group_5__0 : rule__Channel__Group_5__0__Impl rule__Channel__Group_5__1 ;
    public final void rule__Channel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1348:1: ( rule__Channel__Group_5__0__Impl rule__Channel__Group_5__1 )
            // InternalSDF3.g:1349:2: rule__Channel__Group_5__0__Impl rule__Channel__Group_5__1
            {
            pushFollow(FOLLOW_22);
            rule__Channel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group_5__1();

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
    // $ANTLR end "rule__Channel__Group_5__0"


    // $ANTLR start "rule__Channel__Group_5__0__Impl"
    // InternalSDF3.g:1356:1: rule__Channel__Group_5__0__Impl : ( 'initially' ) ;
    public final void rule__Channel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1360:1: ( ( 'initially' ) )
            // InternalSDF3.g:1361:1: ( 'initially' )
            {
            // InternalSDF3.g:1361:1: ( 'initially' )
            // InternalSDF3.g:1362:2: 'initially'
            {
             before(grammarAccess.getChannelAccess().getInitiallyKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getInitiallyKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group_5__0__Impl"


    // $ANTLR start "rule__Channel__Group_5__1"
    // InternalSDF3.g:1371:1: rule__Channel__Group_5__1 : rule__Channel__Group_5__1__Impl ;
    public final void rule__Channel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1375:1: ( rule__Channel__Group_5__1__Impl )
            // InternalSDF3.g:1376:2: rule__Channel__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Group_5__1__Impl();

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
    // $ANTLR end "rule__Channel__Group_5__1"


    // $ANTLR start "rule__Channel__Group_5__1__Impl"
    // InternalSDF3.g:1382:1: rule__Channel__Group_5__1__Impl : ( ( rule__Channel__InitialTokensAssignment_5_1 ) ) ;
    public final void rule__Channel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1386:1: ( ( ( rule__Channel__InitialTokensAssignment_5_1 ) ) )
            // InternalSDF3.g:1387:1: ( ( rule__Channel__InitialTokensAssignment_5_1 ) )
            {
            // InternalSDF3.g:1387:1: ( ( rule__Channel__InitialTokensAssignment_5_1 ) )
            // InternalSDF3.g:1388:2: ( rule__Channel__InitialTokensAssignment_5_1 )
            {
             before(grammarAccess.getChannelAccess().getInitialTokensAssignment_5_1()); 
            // InternalSDF3.g:1389:2: ( rule__Channel__InitialTokensAssignment_5_1 )
            // InternalSDF3.g:1389:3: rule__Channel__InitialTokensAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Channel__InitialTokensAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getInitialTokensAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group_5__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalSDF3.g:1398:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1402:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalSDF3.g:1403:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

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
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalSDF3.g:1410:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1414:1: ( ( RULE_ID ) )
            // InternalSDF3.g:1415:1: ( RULE_ID )
            {
            // InternalSDF3.g:1415:1: ( RULE_ID )
            // InternalSDF3.g:1416:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalSDF3.g:1425:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1429:1: ( rule__FQN__Group__1__Impl )
            // InternalSDF3.g:1430:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

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
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalSDF3.g:1436:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1440:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalSDF3.g:1441:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalSDF3.g:1441:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalSDF3.g:1442:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalSDF3.g:1443:2: ( rule__FQN__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSDF3.g:1443:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalSDF3.g:1452:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1456:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalSDF3.g:1457:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

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
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalSDF3.g:1464:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1468:1: ( ( '.' ) )
            // InternalSDF3.g:1469:1: ( '.' )
            {
            // InternalSDF3.g:1469:1: ( '.' )
            // InternalSDF3.g:1470:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalSDF3.g:1479:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1483:1: ( rule__FQN__Group_1__1__Impl )
            // InternalSDF3.g:1484:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

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
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalSDF3.g:1490:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1494:1: ( ( RULE_ID ) )
            // InternalSDF3.g:1495:1: ( RULE_ID )
            {
            // InternalSDF3.g:1495:1: ( RULE_ID )
            // InternalSDF3.g:1496:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__GraphProperty__Group__0"
    // InternalSDF3.g:1506:1: rule__GraphProperty__Group__0 : rule__GraphProperty__Group__0__Impl rule__GraphProperty__Group__1 ;
    public final void rule__GraphProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1510:1: ( rule__GraphProperty__Group__0__Impl rule__GraphProperty__Group__1 )
            // InternalSDF3.g:1511:2: rule__GraphProperty__Group__0__Impl rule__GraphProperty__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__GraphProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphProperty__Group__1();

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
    // $ANTLR end "rule__GraphProperty__Group__0"


    // $ANTLR start "rule__GraphProperty__Group__0__Impl"
    // InternalSDF3.g:1518:1: rule__GraphProperty__Group__0__Impl : ( 'throughput' ) ;
    public final void rule__GraphProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1522:1: ( ( 'throughput' ) )
            // InternalSDF3.g:1523:1: ( 'throughput' )
            {
            // InternalSDF3.g:1523:1: ( 'throughput' )
            // InternalSDF3.g:1524:2: 'throughput'
            {
             before(grammarAccess.getGraphPropertyAccess().getThroughputKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGraphPropertyAccess().getThroughputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphProperty__Group__0__Impl"


    // $ANTLR start "rule__GraphProperty__Group__1"
    // InternalSDF3.g:1533:1: rule__GraphProperty__Group__1 : rule__GraphProperty__Group__1__Impl rule__GraphProperty__Group__2 ;
    public final void rule__GraphProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1537:1: ( rule__GraphProperty__Group__1__Impl rule__GraphProperty__Group__2 )
            // InternalSDF3.g:1538:2: rule__GraphProperty__Group__1__Impl rule__GraphProperty__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GraphProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphProperty__Group__2();

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
    // $ANTLR end "rule__GraphProperty__Group__1"


    // $ANTLR start "rule__GraphProperty__Group__1__Impl"
    // InternalSDF3.g:1545:1: rule__GraphProperty__Group__1__Impl : ( ( rule__GraphProperty__ThroughputAssignment_1 ) ) ;
    public final void rule__GraphProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1549:1: ( ( ( rule__GraphProperty__ThroughputAssignment_1 ) ) )
            // InternalSDF3.g:1550:1: ( ( rule__GraphProperty__ThroughputAssignment_1 ) )
            {
            // InternalSDF3.g:1550:1: ( ( rule__GraphProperty__ThroughputAssignment_1 ) )
            // InternalSDF3.g:1551:2: ( rule__GraphProperty__ThroughputAssignment_1 )
            {
             before(grammarAccess.getGraphPropertyAccess().getThroughputAssignment_1()); 
            // InternalSDF3.g:1552:2: ( rule__GraphProperty__ThroughputAssignment_1 )
            // InternalSDF3.g:1552:3: rule__GraphProperty__ThroughputAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphProperty__ThroughputAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphPropertyAccess().getThroughputAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphProperty__Group__1__Impl"


    // $ANTLR start "rule__GraphProperty__Group__2"
    // InternalSDF3.g:1560:1: rule__GraphProperty__Group__2 : rule__GraphProperty__Group__2__Impl ;
    public final void rule__GraphProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1564:1: ( rule__GraphProperty__Group__2__Impl )
            // InternalSDF3.g:1565:2: rule__GraphProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphProperty__Group__2__Impl();

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
    // $ANTLR end "rule__GraphProperty__Group__2"


    // $ANTLR start "rule__GraphProperty__Group__2__Impl"
    // InternalSDF3.g:1571:1: rule__GraphProperty__Group__2__Impl : ( ';' ) ;
    public final void rule__GraphProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1575:1: ( ( ';' ) )
            // InternalSDF3.g:1576:1: ( ';' )
            {
            // InternalSDF3.g:1576:1: ( ';' )
            // InternalSDF3.g:1577:2: ';'
            {
             before(grammarAccess.getGraphPropertyAccess().getSemicolonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGraphPropertyAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphProperty__Group__2__Impl"


    // $ANTLR start "rule__ChannelProperty__Group__0"
    // InternalSDF3.g:1587:1: rule__ChannelProperty__Group__0 : rule__ChannelProperty__Group__0__Impl rule__ChannelProperty__Group__1 ;
    public final void rule__ChannelProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1591:1: ( rule__ChannelProperty__Group__0__Impl rule__ChannelProperty__Group__1 )
            // InternalSDF3.g:1592:2: rule__ChannelProperty__Group__0__Impl rule__ChannelProperty__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ChannelProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChannelProperty__Group__1();

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
    // $ANTLR end "rule__ChannelProperty__Group__0"


    // $ANTLR start "rule__ChannelProperty__Group__0__Impl"
    // InternalSDF3.g:1599:1: rule__ChannelProperty__Group__0__Impl : ( 'for' ) ;
    public final void rule__ChannelProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1603:1: ( ( 'for' ) )
            // InternalSDF3.g:1604:1: ( 'for' )
            {
            // InternalSDF3.g:1604:1: ( 'for' )
            // InternalSDF3.g:1605:2: 'for'
            {
             before(grammarAccess.getChannelPropertyAccess().getForKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getChannelPropertyAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelProperty__Group__0__Impl"


    // $ANTLR start "rule__ChannelProperty__Group__1"
    // InternalSDF3.g:1614:1: rule__ChannelProperty__Group__1 : rule__ChannelProperty__Group__1__Impl rule__ChannelProperty__Group__2 ;
    public final void rule__ChannelProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1618:1: ( rule__ChannelProperty__Group__1__Impl rule__ChannelProperty__Group__2 )
            // InternalSDF3.g:1619:2: rule__ChannelProperty__Group__1__Impl rule__ChannelProperty__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ChannelProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChannelProperty__Group__2();

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
    // $ANTLR end "rule__ChannelProperty__Group__1"


    // $ANTLR start "rule__ChannelProperty__Group__1__Impl"
    // InternalSDF3.g:1626:1: rule__ChannelProperty__Group__1__Impl : ( 'channel' ) ;
    public final void rule__ChannelProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1630:1: ( ( 'channel' ) )
            // InternalSDF3.g:1631:1: ( 'channel' )
            {
            // InternalSDF3.g:1631:1: ( 'channel' )
            // InternalSDF3.g:1632:2: 'channel'
            {
             before(grammarAccess.getChannelPropertyAccess().getChannelKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChannelPropertyAccess().getChannelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelProperty__Group__1__Impl"


    // $ANTLR start "rule__ChannelProperty__Group__2"
    // InternalSDF3.g:1641:1: rule__ChannelProperty__Group__2 : rule__ChannelProperty__Group__2__Impl rule__ChannelProperty__Group__3 ;
    public final void rule__ChannelProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1645:1: ( rule__ChannelProperty__Group__2__Impl rule__ChannelProperty__Group__3 )
            // InternalSDF3.g:1646:2: rule__ChannelProperty__Group__2__Impl rule__ChannelProperty__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ChannelProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChannelProperty__Group__3();

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
    // $ANTLR end "rule__ChannelProperty__Group__2"


    // $ANTLR start "rule__ChannelProperty__Group__2__Impl"
    // InternalSDF3.g:1653:1: rule__ChannelProperty__Group__2__Impl : ( ( rule__ChannelProperty__ChannelAssignment_2 ) ) ;
    public final void rule__ChannelProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1657:1: ( ( ( rule__ChannelProperty__ChannelAssignment_2 ) ) )
            // InternalSDF3.g:1658:1: ( ( rule__ChannelProperty__ChannelAssignment_2 ) )
            {
            // InternalSDF3.g:1658:1: ( ( rule__ChannelProperty__ChannelAssignment_2 ) )
            // InternalSDF3.g:1659:2: ( rule__ChannelProperty__ChannelAssignment_2 )
            {
             before(grammarAccess.getChannelPropertyAccess().getChannelAssignment_2()); 
            // InternalSDF3.g:1660:2: ( rule__ChannelProperty__ChannelAssignment_2 )
            // InternalSDF3.g:1660:3: rule__ChannelProperty__ChannelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChannelProperty__ChannelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChannelPropertyAccess().getChannelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelProperty__Group__2__Impl"


    // $ANTLR start "rule__ChannelProperty__Group__3"
    // InternalSDF3.g:1668:1: rule__ChannelProperty__Group__3 : rule__ChannelProperty__Group__3__Impl rule__ChannelProperty__Group__4 ;
    public final void rule__ChannelProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1672:1: ( rule__ChannelProperty__Group__3__Impl rule__ChannelProperty__Group__4 )
            // InternalSDF3.g:1673:2: rule__ChannelProperty__Group__3__Impl rule__ChannelProperty__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ChannelProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChannelProperty__Group__4();

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
    // $ANTLR end "rule__ChannelProperty__Group__3"


    // $ANTLR start "rule__ChannelProperty__Group__3__Impl"
    // InternalSDF3.g:1680:1: rule__ChannelProperty__Group__3__Impl : ( '{' ) ;
    public final void rule__ChannelProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1684:1: ( ( '{' ) )
            // InternalSDF3.g:1685:1: ( '{' )
            {
            // InternalSDF3.g:1685:1: ( '{' )
            // InternalSDF3.g:1686:2: '{'
            {
             before(grammarAccess.getChannelPropertyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getChannelPropertyAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelProperty__Group__3__Impl"


    // $ANTLR start "rule__ChannelProperty__Group__4"
    // InternalSDF3.g:1695:1: rule__ChannelProperty__Group__4 : rule__ChannelProperty__Group__4__Impl ;
    public final void rule__ChannelProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1699:1: ( rule__ChannelProperty__Group__4__Impl )
            // InternalSDF3.g:1700:2: rule__ChannelProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChannelProperty__Group__4__Impl();

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
    // $ANTLR end "rule__ChannelProperty__Group__4"


    // $ANTLR start "rule__ChannelProperty__Group__4__Impl"
    // InternalSDF3.g:1706:1: rule__ChannelProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__ChannelProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1710:1: ( ( '}' ) )
            // InternalSDF3.g:1711:1: ( '}' )
            {
            // InternalSDF3.g:1711:1: ( '}' )
            // InternalSDF3.g:1712:2: '}'
            {
             before(grammarAccess.getChannelPropertyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChannelPropertyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelProperty__Group__4__Impl"


    // $ANTLR start "rule__ActorProperty__Group__0"
    // InternalSDF3.g:1722:1: rule__ActorProperty__Group__0 : rule__ActorProperty__Group__0__Impl rule__ActorProperty__Group__1 ;
    public final void rule__ActorProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1726:1: ( rule__ActorProperty__Group__0__Impl rule__ActorProperty__Group__1 )
            // InternalSDF3.g:1727:2: rule__ActorProperty__Group__0__Impl rule__ActorProperty__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ActorProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorProperty__Group__1();

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
    // $ANTLR end "rule__ActorProperty__Group__0"


    // $ANTLR start "rule__ActorProperty__Group__0__Impl"
    // InternalSDF3.g:1734:1: rule__ActorProperty__Group__0__Impl : ( 'for' ) ;
    public final void rule__ActorProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1738:1: ( ( 'for' ) )
            // InternalSDF3.g:1739:1: ( 'for' )
            {
            // InternalSDF3.g:1739:1: ( 'for' )
            // InternalSDF3.g:1740:2: 'for'
            {
             before(grammarAccess.getActorPropertyAccess().getForKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getActorPropertyAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorProperty__Group__0__Impl"


    // $ANTLR start "rule__ActorProperty__Group__1"
    // InternalSDF3.g:1749:1: rule__ActorProperty__Group__1 : rule__ActorProperty__Group__1__Impl rule__ActorProperty__Group__2 ;
    public final void rule__ActorProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1753:1: ( rule__ActorProperty__Group__1__Impl rule__ActorProperty__Group__2 )
            // InternalSDF3.g:1754:2: rule__ActorProperty__Group__1__Impl rule__ActorProperty__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ActorProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorProperty__Group__2();

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
    // $ANTLR end "rule__ActorProperty__Group__1"


    // $ANTLR start "rule__ActorProperty__Group__1__Impl"
    // InternalSDF3.g:1761:1: rule__ActorProperty__Group__1__Impl : ( 'actor' ) ;
    public final void rule__ActorProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1765:1: ( ( 'actor' ) )
            // InternalSDF3.g:1766:1: ( 'actor' )
            {
            // InternalSDF3.g:1766:1: ( 'actor' )
            // InternalSDF3.g:1767:2: 'actor'
            {
             before(grammarAccess.getActorPropertyAccess().getActorKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActorPropertyAccess().getActorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorProperty__Group__1__Impl"


    // $ANTLR start "rule__ActorProperty__Group__2"
    // InternalSDF3.g:1776:1: rule__ActorProperty__Group__2 : rule__ActorProperty__Group__2__Impl rule__ActorProperty__Group__3 ;
    public final void rule__ActorProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1780:1: ( rule__ActorProperty__Group__2__Impl rule__ActorProperty__Group__3 )
            // InternalSDF3.g:1781:2: rule__ActorProperty__Group__2__Impl rule__ActorProperty__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ActorProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorProperty__Group__3();

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
    // $ANTLR end "rule__ActorProperty__Group__2"


    // $ANTLR start "rule__ActorProperty__Group__2__Impl"
    // InternalSDF3.g:1788:1: rule__ActorProperty__Group__2__Impl : ( ( rule__ActorProperty__ActorAssignment_2 ) ) ;
    public final void rule__ActorProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1792:1: ( ( ( rule__ActorProperty__ActorAssignment_2 ) ) )
            // InternalSDF3.g:1793:1: ( ( rule__ActorProperty__ActorAssignment_2 ) )
            {
            // InternalSDF3.g:1793:1: ( ( rule__ActorProperty__ActorAssignment_2 ) )
            // InternalSDF3.g:1794:2: ( rule__ActorProperty__ActorAssignment_2 )
            {
             before(grammarAccess.getActorPropertyAccess().getActorAssignment_2()); 
            // InternalSDF3.g:1795:2: ( rule__ActorProperty__ActorAssignment_2 )
            // InternalSDF3.g:1795:3: rule__ActorProperty__ActorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ActorProperty__ActorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActorPropertyAccess().getActorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorProperty__Group__2__Impl"


    // $ANTLR start "rule__ActorProperty__Group__3"
    // InternalSDF3.g:1803:1: rule__ActorProperty__Group__3 : rule__ActorProperty__Group__3__Impl rule__ActorProperty__Group__4 ;
    public final void rule__ActorProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1807:1: ( rule__ActorProperty__Group__3__Impl rule__ActorProperty__Group__4 )
            // InternalSDF3.g:1808:2: rule__ActorProperty__Group__3__Impl rule__ActorProperty__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ActorProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorProperty__Group__4();

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
    // $ANTLR end "rule__ActorProperty__Group__3"


    // $ANTLR start "rule__ActorProperty__Group__3__Impl"
    // InternalSDF3.g:1815:1: rule__ActorProperty__Group__3__Impl : ( '{' ) ;
    public final void rule__ActorProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1819:1: ( ( '{' ) )
            // InternalSDF3.g:1820:1: ( '{' )
            {
            // InternalSDF3.g:1820:1: ( '{' )
            // InternalSDF3.g:1821:2: '{'
            {
             before(grammarAccess.getActorPropertyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActorPropertyAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorProperty__Group__3__Impl"


    // $ANTLR start "rule__ActorProperty__Group__4"
    // InternalSDF3.g:1830:1: rule__ActorProperty__Group__4 : rule__ActorProperty__Group__4__Impl ;
    public final void rule__ActorProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1834:1: ( rule__ActorProperty__Group__4__Impl )
            // InternalSDF3.g:1835:2: rule__ActorProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActorProperty__Group__4__Impl();

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
    // $ANTLR end "rule__ActorProperty__Group__4"


    // $ANTLR start "rule__ActorProperty__Group__4__Impl"
    // InternalSDF3.g:1841:1: rule__ActorProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__ActorProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1845:1: ( ( '}' ) )
            // InternalSDF3.g:1846:1: ( '}' )
            {
            // InternalSDF3.g:1846:1: ( '}' )
            // InternalSDF3.g:1847:2: '}'
            {
             before(grammarAccess.getActorPropertyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActorPropertyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorProperty__Group__4__Impl"


    // $ANTLR start "rule__SDF3__ApplicationAssignment_3"
    // InternalSDF3.g:1857:1: rule__SDF3__ApplicationAssignment_3 : ( ruleApplicationGraph ) ;
    public final void rule__SDF3__ApplicationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1861:1: ( ( ruleApplicationGraph ) )
            // InternalSDF3.g:1862:2: ( ruleApplicationGraph )
            {
            // InternalSDF3.g:1862:2: ( ruleApplicationGraph )
            // InternalSDF3.g:1863:3: ruleApplicationGraph
            {
             before(grammarAccess.getSDF3Access().getApplicationApplicationGraphParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleApplicationGraph();

            state._fsp--;

             after(grammarAccess.getSDF3Access().getApplicationApplicationGraphParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDF3__ApplicationAssignment_3"


    // $ANTLR start "rule__SDF3__PropertiesAssignment_6"
    // InternalSDF3.g:1872:1: rule__SDF3__PropertiesAssignment_6 : ( ruleProperty ) ;
    public final void rule__SDF3__PropertiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1876:1: ( ( ruleProperty ) )
            // InternalSDF3.g:1877:2: ( ruleProperty )
            {
            // InternalSDF3.g:1877:2: ( ruleProperty )
            // InternalSDF3.g:1878:3: ruleProperty
            {
             before(grammarAccess.getSDF3Access().getPropertiesPropertyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getSDF3Access().getPropertiesPropertyParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDF3__PropertiesAssignment_6"


    // $ANTLR start "rule__ApplicationGraph__NameAssignment_2"
    // InternalSDF3.g:1887:1: rule__ApplicationGraph__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ApplicationGraph__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1891:1: ( ( RULE_ID ) )
            // InternalSDF3.g:1892:2: ( RULE_ID )
            {
            // InternalSDF3.g:1892:2: ( RULE_ID )
            // InternalSDF3.g:1893:3: RULE_ID
            {
             before(grammarAccess.getApplicationGraphAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationGraphAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationGraph__NameAssignment_2"


    // $ANTLR start "rule__ApplicationGraph__ActorsAssignment_4"
    // InternalSDF3.g:1902:1: rule__ApplicationGraph__ActorsAssignment_4 : ( ruleActor ) ;
    public final void rule__ApplicationGraph__ActorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1906:1: ( ( ruleActor ) )
            // InternalSDF3.g:1907:2: ( ruleActor )
            {
            // InternalSDF3.g:1907:2: ( ruleActor )
            // InternalSDF3.g:1908:3: ruleActor
            {
             before(grammarAccess.getApplicationGraphAccess().getActorsActorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getApplicationGraphAccess().getActorsActorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationGraph__ActorsAssignment_4"


    // $ANTLR start "rule__ApplicationGraph__ChannelsAssignment_5"
    // InternalSDF3.g:1917:1: rule__ApplicationGraph__ChannelsAssignment_5 : ( ruleChannel ) ;
    public final void rule__ApplicationGraph__ChannelsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1921:1: ( ( ruleChannel ) )
            // InternalSDF3.g:1922:2: ( ruleChannel )
            {
            // InternalSDF3.g:1922:2: ( ruleChannel )
            // InternalSDF3.g:1923:3: ruleChannel
            {
             before(grammarAccess.getApplicationGraphAccess().getChannelsChannelParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getApplicationGraphAccess().getChannelsChannelParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationGraph__ChannelsAssignment_5"


    // $ANTLR start "rule__Actor__NameAssignment_1"
    // InternalSDF3.g:1932:1: rule__Actor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1936:1: ( ( RULE_ID ) )
            // InternalSDF3.g:1937:2: ( RULE_ID )
            {
            // InternalSDF3.g:1937:2: ( RULE_ID )
            // InternalSDF3.g:1938:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__NameAssignment_1"


    // $ANTLR start "rule__Actor__TypeAssignment_3"
    // InternalSDF3.g:1947:1: rule__Actor__TypeAssignment_3 : ( RULE_ID ) ;
    public final void rule__Actor__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1951:1: ( ( RULE_ID ) )
            // InternalSDF3.g:1952:2: ( RULE_ID )
            {
            // InternalSDF3.g:1952:2: ( RULE_ID )
            // InternalSDF3.g:1953:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getTypeIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getTypeIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__TypeAssignment_3"


    // $ANTLR start "rule__Actor__PortsAssignment_5"
    // InternalSDF3.g:1962:1: rule__Actor__PortsAssignment_5 : ( rulePort ) ;
    public final void rule__Actor__PortsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1966:1: ( ( rulePort ) )
            // InternalSDF3.g:1967:2: ( rulePort )
            {
            // InternalSDF3.g:1967:2: ( rulePort )
            // InternalSDF3.g:1968:3: rulePort
            {
             before(grammarAccess.getActorAccess().getPortsPortParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getActorAccess().getPortsPortParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__PortsAssignment_5"


    // $ANTLR start "rule__Actor__PortsAssignment_6_1"
    // InternalSDF3.g:1977:1: rule__Actor__PortsAssignment_6_1 : ( rulePort ) ;
    public final void rule__Actor__PortsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1981:1: ( ( rulePort ) )
            // InternalSDF3.g:1982:2: ( rulePort )
            {
            // InternalSDF3.g:1982:2: ( rulePort )
            // InternalSDF3.g:1983:3: rulePort
            {
             before(grammarAccess.getActorAccess().getPortsPortParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getActorAccess().getPortsPortParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__PortsAssignment_6_1"


    // $ANTLR start "rule__Port__PortTypeAssignment_0"
    // InternalSDF3.g:1992:1: rule__Port__PortTypeAssignment_0 : ( rulePortType ) ;
    public final void rule__Port__PortTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:1996:1: ( ( rulePortType ) )
            // InternalSDF3.g:1997:2: ( rulePortType )
            {
            // InternalSDF3.g:1997:2: ( rulePortType )
            // InternalSDF3.g:1998:3: rulePortType
            {
             before(grammarAccess.getPortAccess().getPortTypePortTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePortType();

            state._fsp--;

             after(grammarAccess.getPortAccess().getPortTypePortTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__PortTypeAssignment_0"


    // $ANTLR start "rule__Port__NameAssignment_1"
    // InternalSDF3.g:2007:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:2011:1: ( ( RULE_ID ) )
            // InternalSDF3.g:2012:2: ( RULE_ID )
            {
            // InternalSDF3.g:2012:2: ( RULE_ID )
            // InternalSDF3.g:2013:3: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__NameAssignment_1"


    // $ANTLR start "rule__Port__RateAssignment_2"
    // InternalSDF3.g:2022:1: rule__Port__RateAssignment_2 : ( RULE_INT ) ;
    public final void rule__Port__RateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:2026:1: ( ( RULE_INT ) )
            // InternalSDF3.g:2027:2: ( RULE_INT )
            {
            // InternalSDF3.g:2027:2: ( RULE_INT )
            // InternalSDF3.g:2028:3: RULE_INT
            {
             before(grammarAccess.getPortAccess().getRateINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getRateINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__RateAssignment_2"


    // $ANTLR start "rule__Channel__NameAssignment_1"
    // InternalSDF3.g:2037:1: rule__Channel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Channel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:2041:1: ( ( RULE_ID ) )
            // InternalSDF3.g:2042:2: ( RULE_ID )
            {
            // InternalSDF3.g:2042:2: ( RULE_ID )
            // InternalSDF3.g:2043:3: RULE_ID
            {
             before(grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__NameAssignment_1"


    // $ANTLR start "rule__Channel__SourceAssignment_2"
    // InternalSDF3.g:2052:1: rule__Channel__SourceAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__Channel__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:2056:1: ( ( ( ruleFQN ) ) )
            // InternalSDF3.g:2057:2: ( ( ruleFQN ) )
            {
            // InternalSDF3.g:2057:2: ( ( ruleFQN ) )
            // InternalSDF3.g:2058:3: ( ruleFQN )
            {
             before(grammarAccess.getChannelAccess().getSourcePortCrossReference_2_0()); 
            // InternalSDF3.g:2059:3: ( ruleFQN )
            // InternalSDF3.g:2060:4: ruleFQN
            {
             before(grammarAccess.getChannelAccess().getSourcePortFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getChannelAccess().getSourcePortFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getChannelAccess().getSourcePortCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__SourceAssignment_2"


    // $ANTLR start "rule__Channel__DestinationAssignment_4"
    // InternalSDF3.g:2071:1: rule__Channel__DestinationAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__Channel__DestinationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:2075:1: ( ( ( ruleFQN ) ) )
            // InternalSDF3.g:2076:2: ( ( ruleFQN ) )
            {
            // InternalSDF3.g:2076:2: ( ( ruleFQN ) )
            // InternalSDF3.g:2077:3: ( ruleFQN )
            {
             before(grammarAccess.getChannelAccess().getDestinationPortCrossReference_4_0()); 
            // InternalSDF3.g:2078:3: ( ruleFQN )
            // InternalSDF3.g:2079:4: ruleFQN
            {
             before(grammarAccess.getChannelAccess().getDestinationPortFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getChannelAccess().getDestinationPortFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getChannelAccess().getDestinationPortCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__DestinationAssignment_4"


    // $ANTLR start "rule__Channel__InitialTokensAssignment_5_1"
    // InternalSDF3.g:2090:1: rule__Channel__InitialTokensAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__Channel__InitialTokensAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:2094:1: ( ( RULE_INT ) )
            // InternalSDF3.g:2095:2: ( RULE_INT )
            {
            // InternalSDF3.g:2095:2: ( RULE_INT )
            // InternalSDF3.g:2096:3: RULE_INT
            {
             before(grammarAccess.getChannelAccess().getInitialTokensINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getInitialTokensINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__InitialTokensAssignment_5_1"


    // $ANTLR start "rule__GraphProperty__ThroughputAssignment_1"
    // InternalSDF3.g:2105:1: rule__GraphProperty__ThroughputAssignment_1 : ( RULE_DECIMAL ) ;
    public final void rule__GraphProperty__ThroughputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:2109:1: ( ( RULE_DECIMAL ) )
            // InternalSDF3.g:2110:2: ( RULE_DECIMAL )
            {
            // InternalSDF3.g:2110:2: ( RULE_DECIMAL )
            // InternalSDF3.g:2111:3: RULE_DECIMAL
            {
             before(grammarAccess.getGraphPropertyAccess().getThroughputDECIMALTerminalRuleCall_1_0()); 
            match(input,RULE_DECIMAL,FOLLOW_2); 
             after(grammarAccess.getGraphPropertyAccess().getThroughputDECIMALTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphProperty__ThroughputAssignment_1"


    // $ANTLR start "rule__ChannelProperty__ChannelAssignment_2"
    // InternalSDF3.g:2120:1: rule__ChannelProperty__ChannelAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ChannelProperty__ChannelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:2124:1: ( ( ( RULE_ID ) ) )
            // InternalSDF3.g:2125:2: ( ( RULE_ID ) )
            {
            // InternalSDF3.g:2125:2: ( ( RULE_ID ) )
            // InternalSDF3.g:2126:3: ( RULE_ID )
            {
             before(grammarAccess.getChannelPropertyAccess().getChannelChannelCrossReference_2_0()); 
            // InternalSDF3.g:2127:3: ( RULE_ID )
            // InternalSDF3.g:2128:4: RULE_ID
            {
             before(grammarAccess.getChannelPropertyAccess().getChannelChannelIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChannelPropertyAccess().getChannelChannelIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getChannelPropertyAccess().getChannelChannelCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelProperty__ChannelAssignment_2"


    // $ANTLR start "rule__ActorProperty__ActorAssignment_2"
    // InternalSDF3.g:2139:1: rule__ActorProperty__ActorAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ActorProperty__ActorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSDF3.g:2143:1: ( ( ( ruleFQN ) ) )
            // InternalSDF3.g:2144:2: ( ( ruleFQN ) )
            {
            // InternalSDF3.g:2144:2: ( ( ruleFQN ) )
            // InternalSDF3.g:2145:3: ( ruleFQN )
            {
             before(grammarAccess.getActorPropertyAccess().getActorActorCrossReference_2_0()); 
            // InternalSDF3.g:2146:3: ( ruleFQN )
            // InternalSDF3.g:2147:4: ruleFQN
            {
             before(grammarAccess.getActorPropertyAccess().getActorActorFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getActorPropertyAccess().getActorActorFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getActorPropertyAccess().getActorActorCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorProperty__ActorAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000180100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});

}