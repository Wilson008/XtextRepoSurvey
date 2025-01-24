package hu.sze.aut.ros.middleware.statepubsub.ide.contentassist.antlr.internal;

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
import hu.sze.aut.ros.middleware.statepubsub.services.RosNetworkDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosNetworkDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ROS1'", "'ROS2'", "'Python'", "'Cpp'", "'true'", "'false'", "'stack'", "'{'", "'networktype'", "'}'", "','", "'channels'", "'package'", "'filter'", "'input'", "'output'", "'field'", "'messagetype'", "'servicetype'", "'service'", "':'", "'topic'", "'bool'", "'='", "'->'", "'int'", "'<'", "'>'", "'double'", "'parametergroup'", "'configobject'", "'generate'", "'templatenode'", "'namespace'", "'language'", "'implements'", "'parameters'", "'stati'", "'node'", "'['", "']'", "'continuousstate'", "'port'", "'<-'", "'estimated_freq'", "'sample_tolerance'", "'syncstate'", "'.'", "'debug'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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


        public InternalRosNetworkDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosNetworkDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRosNetworkDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRosNetworkDsl.g"; }


    	private RosNetworkDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(RosNetworkDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMiddleWareNetwork"
    // InternalRosNetworkDsl.g:53:1: entryRuleMiddleWareNetwork : ruleMiddleWareNetwork EOF ;
    public final void entryRuleMiddleWareNetwork() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:54:1: ( ruleMiddleWareNetwork EOF )
            // InternalRosNetworkDsl.g:55:1: ruleMiddleWareNetwork EOF
            {
             before(grammarAccess.getMiddleWareNetworkRule()); 
            pushFollow(FOLLOW_1);
            ruleMiddleWareNetwork();

            state._fsp--;

             after(grammarAccess.getMiddleWareNetworkRule()); 
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
    // $ANTLR end "entryRuleMiddleWareNetwork"


    // $ANTLR start "ruleMiddleWareNetwork"
    // InternalRosNetworkDsl.g:62:1: ruleMiddleWareNetwork : ( ( rule__MiddleWareNetwork__Group__0 ) ) ;
    public final void ruleMiddleWareNetwork() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:66:2: ( ( ( rule__MiddleWareNetwork__Group__0 ) ) )
            // InternalRosNetworkDsl.g:67:2: ( ( rule__MiddleWareNetwork__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:67:2: ( ( rule__MiddleWareNetwork__Group__0 ) )
            // InternalRosNetworkDsl.g:68:3: ( rule__MiddleWareNetwork__Group__0 )
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getGroup()); 
            // InternalRosNetworkDsl.g:69:3: ( rule__MiddleWareNetwork__Group__0 )
            // InternalRosNetworkDsl.g:69:4: rule__MiddleWareNetwork__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMiddleWareNetworkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMiddleWareNetwork"


    // $ANTLR start "entryRuleFilePackage"
    // InternalRosNetworkDsl.g:78:1: entryRuleFilePackage : ruleFilePackage EOF ;
    public final void entryRuleFilePackage() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:79:1: ( ruleFilePackage EOF )
            // InternalRosNetworkDsl.g:80:1: ruleFilePackage EOF
            {
             before(grammarAccess.getFilePackageRule()); 
            pushFollow(FOLLOW_1);
            ruleFilePackage();

            state._fsp--;

             after(grammarAccess.getFilePackageRule()); 
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
    // $ANTLR end "entryRuleFilePackage"


    // $ANTLR start "ruleFilePackage"
    // InternalRosNetworkDsl.g:87:1: ruleFilePackage : ( ( rule__FilePackage__Group__0 ) ) ;
    public final void ruleFilePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:91:2: ( ( ( rule__FilePackage__Group__0 ) ) )
            // InternalRosNetworkDsl.g:92:2: ( ( rule__FilePackage__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:92:2: ( ( rule__FilePackage__Group__0 ) )
            // InternalRosNetworkDsl.g:93:3: ( rule__FilePackage__Group__0 )
            {
             before(grammarAccess.getFilePackageAccess().getGroup()); 
            // InternalRosNetworkDsl.g:94:3: ( rule__FilePackage__Group__0 )
            // InternalRosNetworkDsl.g:94:4: rule__FilePackage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilePackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilePackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilePackage"


    // $ANTLR start "entryRuleFilterDefinition"
    // InternalRosNetworkDsl.g:103:1: entryRuleFilterDefinition : ruleFilterDefinition EOF ;
    public final void entryRuleFilterDefinition() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:104:1: ( ruleFilterDefinition EOF )
            // InternalRosNetworkDsl.g:105:1: ruleFilterDefinition EOF
            {
             before(grammarAccess.getFilterDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterDefinition();

            state._fsp--;

             after(grammarAccess.getFilterDefinitionRule()); 
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
    // $ANTLR end "entryRuleFilterDefinition"


    // $ANTLR start "ruleFilterDefinition"
    // InternalRosNetworkDsl.g:112:1: ruleFilterDefinition : ( ( rule__FilterDefinition__Group__0 ) ) ;
    public final void ruleFilterDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:116:2: ( ( ( rule__FilterDefinition__Group__0 ) ) )
            // InternalRosNetworkDsl.g:117:2: ( ( rule__FilterDefinition__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:117:2: ( ( rule__FilterDefinition__Group__0 ) )
            // InternalRosNetworkDsl.g:118:3: ( rule__FilterDefinition__Group__0 )
            {
             before(grammarAccess.getFilterDefinitionAccess().getGroup()); 
            // InternalRosNetworkDsl.g:119:3: ( rule__FilterDefinition__Group__0 )
            // InternalRosNetworkDsl.g:119:4: rule__FilterDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterDefinition"


    // $ANTLR start "entryRuleSerializedField"
    // InternalRosNetworkDsl.g:128:1: entryRuleSerializedField : ruleSerializedField EOF ;
    public final void entryRuleSerializedField() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:129:1: ( ruleSerializedField EOF )
            // InternalRosNetworkDsl.g:130:1: ruleSerializedField EOF
            {
             before(grammarAccess.getSerializedFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleSerializedField();

            state._fsp--;

             after(grammarAccess.getSerializedFieldRule()); 
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
    // $ANTLR end "entryRuleSerializedField"


    // $ANTLR start "ruleSerializedField"
    // InternalRosNetworkDsl.g:137:1: ruleSerializedField : ( ( rule__SerializedField__Group__0 ) ) ;
    public final void ruleSerializedField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:141:2: ( ( ( rule__SerializedField__Group__0 ) ) )
            // InternalRosNetworkDsl.g:142:2: ( ( rule__SerializedField__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:142:2: ( ( rule__SerializedField__Group__0 ) )
            // InternalRosNetworkDsl.g:143:3: ( rule__SerializedField__Group__0 )
            {
             before(grammarAccess.getSerializedFieldAccess().getGroup()); 
            // InternalRosNetworkDsl.g:144:3: ( rule__SerializedField__Group__0 )
            // InternalRosNetworkDsl.g:144:4: rule__SerializedField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SerializedField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSerializedFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSerializedField"


    // $ANTLR start "entryRuleAbstractRosFileElement"
    // InternalRosNetworkDsl.g:153:1: entryRuleAbstractRosFileElement : ruleAbstractRosFileElement EOF ;
    public final void entryRuleAbstractRosFileElement() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:154:1: ( ruleAbstractRosFileElement EOF )
            // InternalRosNetworkDsl.g:155:1: ruleAbstractRosFileElement EOF
            {
             before(grammarAccess.getAbstractRosFileElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractRosFileElement();

            state._fsp--;

             after(grammarAccess.getAbstractRosFileElementRule()); 
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
    // $ANTLR end "entryRuleAbstractRosFileElement"


    // $ANTLR start "ruleAbstractRosFileElement"
    // InternalRosNetworkDsl.g:162:1: ruleAbstractRosFileElement : ( ( rule__AbstractRosFileElement__Alternatives ) ) ;
    public final void ruleAbstractRosFileElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:166:2: ( ( ( rule__AbstractRosFileElement__Alternatives ) ) )
            // InternalRosNetworkDsl.g:167:2: ( ( rule__AbstractRosFileElement__Alternatives ) )
            {
            // InternalRosNetworkDsl.g:167:2: ( ( rule__AbstractRosFileElement__Alternatives ) )
            // InternalRosNetworkDsl.g:168:3: ( rule__AbstractRosFileElement__Alternatives )
            {
             before(grammarAccess.getAbstractRosFileElementAccess().getAlternatives()); 
            // InternalRosNetworkDsl.g:169:3: ( rule__AbstractRosFileElement__Alternatives )
            // InternalRosNetworkDsl.g:169:4: rule__AbstractRosFileElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractRosFileElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractRosFileElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractRosFileElement"


    // $ANTLR start "entryRuleAbstractMessageType"
    // InternalRosNetworkDsl.g:178:1: entryRuleAbstractMessageType : ruleAbstractMessageType EOF ;
    public final void entryRuleAbstractMessageType() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:179:1: ( ruleAbstractMessageType EOF )
            // InternalRosNetworkDsl.g:180:1: ruleAbstractMessageType EOF
            {
             before(grammarAccess.getAbstractMessageTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractMessageType();

            state._fsp--;

             after(grammarAccess.getAbstractMessageTypeRule()); 
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
    // $ANTLR end "entryRuleAbstractMessageType"


    // $ANTLR start "ruleAbstractMessageType"
    // InternalRosNetworkDsl.g:187:1: ruleAbstractMessageType : ( ( rule__AbstractMessageType__Alternatives ) ) ;
    public final void ruleAbstractMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:191:2: ( ( ( rule__AbstractMessageType__Alternatives ) ) )
            // InternalRosNetworkDsl.g:192:2: ( ( rule__AbstractMessageType__Alternatives ) )
            {
            // InternalRosNetworkDsl.g:192:2: ( ( rule__AbstractMessageType__Alternatives ) )
            // InternalRosNetworkDsl.g:193:3: ( rule__AbstractMessageType__Alternatives )
            {
             before(grammarAccess.getAbstractMessageTypeAccess().getAlternatives()); 
            // InternalRosNetworkDsl.g:194:3: ( rule__AbstractMessageType__Alternatives )
            // InternalRosNetworkDsl.g:194:4: rule__AbstractMessageType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractMessageType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractMessageTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractMessageType"


    // $ANTLR start "entryRuleNetworkType"
    // InternalRosNetworkDsl.g:203:1: entryRuleNetworkType : ruleNetworkType EOF ;
    public final void entryRuleNetworkType() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:204:1: ( ruleNetworkType EOF )
            // InternalRosNetworkDsl.g:205:1: ruleNetworkType EOF
            {
             before(grammarAccess.getNetworkTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleNetworkType();

            state._fsp--;

             after(grammarAccess.getNetworkTypeRule()); 
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
    // $ANTLR end "entryRuleNetworkType"


    // $ANTLR start "ruleNetworkType"
    // InternalRosNetworkDsl.g:212:1: ruleNetworkType : ( ( rule__NetworkType__Alternatives ) ) ;
    public final void ruleNetworkType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:216:2: ( ( ( rule__NetworkType__Alternatives ) ) )
            // InternalRosNetworkDsl.g:217:2: ( ( rule__NetworkType__Alternatives ) )
            {
            // InternalRosNetworkDsl.g:217:2: ( ( rule__NetworkType__Alternatives ) )
            // InternalRosNetworkDsl.g:218:3: ( rule__NetworkType__Alternatives )
            {
             before(grammarAccess.getNetworkTypeAccess().getAlternatives()); 
            // InternalRosNetworkDsl.g:219:3: ( rule__NetworkType__Alternatives )
            // InternalRosNetworkDsl.g:219:4: rule__NetworkType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NetworkType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNetworkTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNetworkType"


    // $ANTLR start "entryRuleTopicMessage"
    // InternalRosNetworkDsl.g:228:1: entryRuleTopicMessage : ruleTopicMessage EOF ;
    public final void entryRuleTopicMessage() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:229:1: ( ruleTopicMessage EOF )
            // InternalRosNetworkDsl.g:230:1: ruleTopicMessage EOF
            {
             before(grammarAccess.getTopicMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleTopicMessage();

            state._fsp--;

             after(grammarAccess.getTopicMessageRule()); 
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
    // $ANTLR end "entryRuleTopicMessage"


    // $ANTLR start "ruleTopicMessage"
    // InternalRosNetworkDsl.g:237:1: ruleTopicMessage : ( ( rule__TopicMessage__Group__0 ) ) ;
    public final void ruleTopicMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:241:2: ( ( ( rule__TopicMessage__Group__0 ) ) )
            // InternalRosNetworkDsl.g:242:2: ( ( rule__TopicMessage__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:242:2: ( ( rule__TopicMessage__Group__0 ) )
            // InternalRosNetworkDsl.g:243:3: ( rule__TopicMessage__Group__0 )
            {
             before(grammarAccess.getTopicMessageAccess().getGroup()); 
            // InternalRosNetworkDsl.g:244:3: ( rule__TopicMessage__Group__0 )
            // InternalRosNetworkDsl.g:244:4: rule__TopicMessage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TopicMessage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopicMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopicMessage"


    // $ANTLR start "entryRuleServiceType"
    // InternalRosNetworkDsl.g:253:1: entryRuleServiceType : ruleServiceType EOF ;
    public final void entryRuleServiceType() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:254:1: ( ruleServiceType EOF )
            // InternalRosNetworkDsl.g:255:1: ruleServiceType EOF
            {
             before(grammarAccess.getServiceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceType();

            state._fsp--;

             after(grammarAccess.getServiceTypeRule()); 
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
    // $ANTLR end "entryRuleServiceType"


    // $ANTLR start "ruleServiceType"
    // InternalRosNetworkDsl.g:262:1: ruleServiceType : ( ( rule__ServiceType__Group__0 ) ) ;
    public final void ruleServiceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:266:2: ( ( ( rule__ServiceType__Group__0 ) ) )
            // InternalRosNetworkDsl.g:267:2: ( ( rule__ServiceType__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:267:2: ( ( rule__ServiceType__Group__0 ) )
            // InternalRosNetworkDsl.g:268:3: ( rule__ServiceType__Group__0 )
            {
             before(grammarAccess.getServiceTypeAccess().getGroup()); 
            // InternalRosNetworkDsl.g:269:3: ( rule__ServiceType__Group__0 )
            // InternalRosNetworkDsl.g:269:4: rule__ServiceType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceType"


    // $ANTLR start "entryRuleChannel"
    // InternalRosNetworkDsl.g:278:1: entryRuleChannel : ruleChannel EOF ;
    public final void entryRuleChannel() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:279:1: ( ruleChannel EOF )
            // InternalRosNetworkDsl.g:280:1: ruleChannel EOF
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
    // InternalRosNetworkDsl.g:287:1: ruleChannel : ( ( rule__Channel__Alternatives ) ) ;
    public final void ruleChannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:291:2: ( ( ( rule__Channel__Alternatives ) ) )
            // InternalRosNetworkDsl.g:292:2: ( ( rule__Channel__Alternatives ) )
            {
            // InternalRosNetworkDsl.g:292:2: ( ( rule__Channel__Alternatives ) )
            // InternalRosNetworkDsl.g:293:3: ( rule__Channel__Alternatives )
            {
             before(grammarAccess.getChannelAccess().getAlternatives()); 
            // InternalRosNetworkDsl.g:294:3: ( rule__Channel__Alternatives )
            // InternalRosNetworkDsl.g:294:4: rule__Channel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleService"
    // InternalRosNetworkDsl.g:303:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:304:1: ( ruleService EOF )
            // InternalRosNetworkDsl.g:305:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalRosNetworkDsl.g:312:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:316:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalRosNetworkDsl.g:317:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:317:2: ( ( rule__Service__Group__0 ) )
            // InternalRosNetworkDsl.g:318:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalRosNetworkDsl.g:319:3: ( rule__Service__Group__0 )
            // InternalRosNetworkDsl.g:319:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleTopic"
    // InternalRosNetworkDsl.g:328:1: entryRuleTopic : ruleTopic EOF ;
    public final void entryRuleTopic() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:329:1: ( ruleTopic EOF )
            // InternalRosNetworkDsl.g:330:1: ruleTopic EOF
            {
             before(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_1);
            ruleTopic();

            state._fsp--;

             after(grammarAccess.getTopicRule()); 
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
    // $ANTLR end "entryRuleTopic"


    // $ANTLR start "ruleTopic"
    // InternalRosNetworkDsl.g:337:1: ruleTopic : ( ( rule__Topic__Group__0 ) ) ;
    public final void ruleTopic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:341:2: ( ( ( rule__Topic__Group__0 ) ) )
            // InternalRosNetworkDsl.g:342:2: ( ( rule__Topic__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:342:2: ( ( rule__Topic__Group__0 ) )
            // InternalRosNetworkDsl.g:343:3: ( rule__Topic__Group__0 )
            {
             before(grammarAccess.getTopicAccess().getGroup()); 
            // InternalRosNetworkDsl.g:344:3: ( rule__Topic__Group__0 )
            // InternalRosNetworkDsl.g:344:4: rule__Topic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Topic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopic"


    // $ANTLR start "entryRuleNodeParameter"
    // InternalRosNetworkDsl.g:353:1: entryRuleNodeParameter : ruleNodeParameter EOF ;
    public final void entryRuleNodeParameter() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:354:1: ( ruleNodeParameter EOF )
            // InternalRosNetworkDsl.g:355:1: ruleNodeParameter EOF
            {
             before(grammarAccess.getNodeParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeParameter();

            state._fsp--;

             after(grammarAccess.getNodeParameterRule()); 
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
    // $ANTLR end "entryRuleNodeParameter"


    // $ANTLR start "ruleNodeParameter"
    // InternalRosNetworkDsl.g:362:1: ruleNodeParameter : ( ( rule__NodeParameter__Alternatives ) ) ;
    public final void ruleNodeParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:366:2: ( ( ( rule__NodeParameter__Alternatives ) ) )
            // InternalRosNetworkDsl.g:367:2: ( ( rule__NodeParameter__Alternatives ) )
            {
            // InternalRosNetworkDsl.g:367:2: ( ( rule__NodeParameter__Alternatives ) )
            // InternalRosNetworkDsl.g:368:3: ( rule__NodeParameter__Alternatives )
            {
             before(grammarAccess.getNodeParameterAccess().getAlternatives()); 
            // InternalRosNetworkDsl.g:369:3: ( rule__NodeParameter__Alternatives )
            // InternalRosNetworkDsl.g:369:4: rule__NodeParameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NodeParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeParameter"


    // $ANTLR start "entryRuleBooleanParameter"
    // InternalRosNetworkDsl.g:378:1: entryRuleBooleanParameter : ruleBooleanParameter EOF ;
    public final void entryRuleBooleanParameter() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:379:1: ( ruleBooleanParameter EOF )
            // InternalRosNetworkDsl.g:380:1: ruleBooleanParameter EOF
            {
             before(grammarAccess.getBooleanParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanParameter();

            state._fsp--;

             after(grammarAccess.getBooleanParameterRule()); 
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
    // $ANTLR end "entryRuleBooleanParameter"


    // $ANTLR start "ruleBooleanParameter"
    // InternalRosNetworkDsl.g:387:1: ruleBooleanParameter : ( ( rule__BooleanParameter__Group__0 ) ) ;
    public final void ruleBooleanParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:391:2: ( ( ( rule__BooleanParameter__Group__0 ) ) )
            // InternalRosNetworkDsl.g:392:2: ( ( rule__BooleanParameter__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:392:2: ( ( rule__BooleanParameter__Group__0 ) )
            // InternalRosNetworkDsl.g:393:3: ( rule__BooleanParameter__Group__0 )
            {
             before(grammarAccess.getBooleanParameterAccess().getGroup()); 
            // InternalRosNetworkDsl.g:394:3: ( rule__BooleanParameter__Group__0 )
            // InternalRosNetworkDsl.g:394:4: rule__BooleanParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanParameter"


    // $ANTLR start "entryRuleIntegerParameter"
    // InternalRosNetworkDsl.g:403:1: entryRuleIntegerParameter : ruleIntegerParameter EOF ;
    public final void entryRuleIntegerParameter() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:404:1: ( ruleIntegerParameter EOF )
            // InternalRosNetworkDsl.g:405:1: ruleIntegerParameter EOF
            {
             before(grammarAccess.getIntegerParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerParameter();

            state._fsp--;

             after(grammarAccess.getIntegerParameterRule()); 
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
    // $ANTLR end "entryRuleIntegerParameter"


    // $ANTLR start "ruleIntegerParameter"
    // InternalRosNetworkDsl.g:412:1: ruleIntegerParameter : ( ( rule__IntegerParameter__Group__0 ) ) ;
    public final void ruleIntegerParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:416:2: ( ( ( rule__IntegerParameter__Group__0 ) ) )
            // InternalRosNetworkDsl.g:417:2: ( ( rule__IntegerParameter__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:417:2: ( ( rule__IntegerParameter__Group__0 ) )
            // InternalRosNetworkDsl.g:418:3: ( rule__IntegerParameter__Group__0 )
            {
             before(grammarAccess.getIntegerParameterAccess().getGroup()); 
            // InternalRosNetworkDsl.g:419:3: ( rule__IntegerParameter__Group__0 )
            // InternalRosNetworkDsl.g:419:4: rule__IntegerParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerParameter"


    // $ANTLR start "entryRuleDoubleParameter"
    // InternalRosNetworkDsl.g:428:1: entryRuleDoubleParameter : ruleDoubleParameter EOF ;
    public final void entryRuleDoubleParameter() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:429:1: ( ruleDoubleParameter EOF )
            // InternalRosNetworkDsl.g:430:1: ruleDoubleParameter EOF
            {
             before(grammarAccess.getDoubleParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleDoubleParameter();

            state._fsp--;

             after(grammarAccess.getDoubleParameterRule()); 
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
    // $ANTLR end "entryRuleDoubleParameter"


    // $ANTLR start "ruleDoubleParameter"
    // InternalRosNetworkDsl.g:437:1: ruleDoubleParameter : ( ( rule__DoubleParameter__Group__0 ) ) ;
    public final void ruleDoubleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:441:2: ( ( ( rule__DoubleParameter__Group__0 ) ) )
            // InternalRosNetworkDsl.g:442:2: ( ( rule__DoubleParameter__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:442:2: ( ( rule__DoubleParameter__Group__0 ) )
            // InternalRosNetworkDsl.g:443:3: ( rule__DoubleParameter__Group__0 )
            {
             before(grammarAccess.getDoubleParameterAccess().getGroup()); 
            // InternalRosNetworkDsl.g:444:3: ( rule__DoubleParameter__Group__0 )
            // InternalRosNetworkDsl.g:444:4: rule__DoubleParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleParameter"


    // $ANTLR start "entryRuleNodeParameterGroup"
    // InternalRosNetworkDsl.g:453:1: entryRuleNodeParameterGroup : ruleNodeParameterGroup EOF ;
    public final void entryRuleNodeParameterGroup() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:454:1: ( ruleNodeParameterGroup EOF )
            // InternalRosNetworkDsl.g:455:1: ruleNodeParameterGroup EOF
            {
             before(grammarAccess.getNodeParameterGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeParameterGroup();

            state._fsp--;

             after(grammarAccess.getNodeParameterGroupRule()); 
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
    // $ANTLR end "entryRuleNodeParameterGroup"


    // $ANTLR start "ruleNodeParameterGroup"
    // InternalRosNetworkDsl.g:462:1: ruleNodeParameterGroup : ( ( rule__NodeParameterGroup__Group__0 ) ) ;
    public final void ruleNodeParameterGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:466:2: ( ( ( rule__NodeParameterGroup__Group__0 ) ) )
            // InternalRosNetworkDsl.g:467:2: ( ( rule__NodeParameterGroup__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:467:2: ( ( rule__NodeParameterGroup__Group__0 ) )
            // InternalRosNetworkDsl.g:468:3: ( rule__NodeParameterGroup__Group__0 )
            {
             before(grammarAccess.getNodeParameterGroupAccess().getGroup()); 
            // InternalRosNetworkDsl.g:469:3: ( rule__NodeParameterGroup__Group__0 )
            // InternalRosNetworkDsl.g:469:4: rule__NodeParameterGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeParameterGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeParameterGroup"


    // $ANTLR start "entryRuleAbstractNodeParameter"
    // InternalRosNetworkDsl.g:478:1: entryRuleAbstractNodeParameter : ruleAbstractNodeParameter EOF ;
    public final void entryRuleAbstractNodeParameter() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:479:1: ( ruleAbstractNodeParameter EOF )
            // InternalRosNetworkDsl.g:480:1: ruleAbstractNodeParameter EOF
            {
             before(grammarAccess.getAbstractNodeParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractNodeParameter();

            state._fsp--;

             after(grammarAccess.getAbstractNodeParameterRule()); 
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
    // $ANTLR end "entryRuleAbstractNodeParameter"


    // $ANTLR start "ruleAbstractNodeParameter"
    // InternalRosNetworkDsl.g:487:1: ruleAbstractNodeParameter : ( ( rule__AbstractNodeParameter__Alternatives ) ) ;
    public final void ruleAbstractNodeParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:491:2: ( ( ( rule__AbstractNodeParameter__Alternatives ) ) )
            // InternalRosNetworkDsl.g:492:2: ( ( rule__AbstractNodeParameter__Alternatives ) )
            {
            // InternalRosNetworkDsl.g:492:2: ( ( rule__AbstractNodeParameter__Alternatives ) )
            // InternalRosNetworkDsl.g:493:3: ( rule__AbstractNodeParameter__Alternatives )
            {
             before(grammarAccess.getAbstractNodeParameterAccess().getAlternatives()); 
            // InternalRosNetworkDsl.g:494:3: ( rule__AbstractNodeParameter__Alternatives )
            // InternalRosNetworkDsl.g:494:4: rule__AbstractNodeParameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractNodeParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractNodeParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractNodeParameter"


    // $ANTLR start "entryRuleLibrary"
    // InternalRosNetworkDsl.g:503:1: entryRuleLibrary : ruleLibrary EOF ;
    public final void entryRuleLibrary() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:504:1: ( ruleLibrary EOF )
            // InternalRosNetworkDsl.g:505:1: ruleLibrary EOF
            {
             before(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_1);
            ruleLibrary();

            state._fsp--;

             after(grammarAccess.getLibraryRule()); 
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
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // InternalRosNetworkDsl.g:512:1: ruleLibrary : ( ( rule__Library__Group__0 ) ) ;
    public final void ruleLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:516:2: ( ( ( rule__Library__Group__0 ) ) )
            // InternalRosNetworkDsl.g:517:2: ( ( rule__Library__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:517:2: ( ( rule__Library__Group__0 ) )
            // InternalRosNetworkDsl.g:518:3: ( rule__Library__Group__0 )
            {
             before(grammarAccess.getLibraryAccess().getGroup()); 
            // InternalRosNetworkDsl.g:519:3: ( rule__Library__Group__0 )
            // InternalRosNetworkDsl.g:519:4: rule__Library__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleNode"
    // InternalRosNetworkDsl.g:528:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:529:1: ( ruleNode EOF )
            // InternalRosNetworkDsl.g:530:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalRosNetworkDsl.g:537:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:541:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalRosNetworkDsl.g:542:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:542:2: ( ( rule__Node__Group__0 ) )
            // InternalRosNetworkDsl.g:543:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalRosNetworkDsl.g:544:3: ( rule__Node__Group__0 )
            // InternalRosNetworkDsl.g:544:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleFilterConnection"
    // InternalRosNetworkDsl.g:553:1: entryRuleFilterConnection : ruleFilterConnection EOF ;
    public final void entryRuleFilterConnection() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:554:1: ( ruleFilterConnection EOF )
            // InternalRosNetworkDsl.g:555:1: ruleFilterConnection EOF
            {
             before(grammarAccess.getFilterConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterConnection();

            state._fsp--;

             after(grammarAccess.getFilterConnectionRule()); 
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
    // $ANTLR end "entryRuleFilterConnection"


    // $ANTLR start "ruleFilterConnection"
    // InternalRosNetworkDsl.g:562:1: ruleFilterConnection : ( ( rule__FilterConnection__Group__0 ) ) ;
    public final void ruleFilterConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:566:2: ( ( ( rule__FilterConnection__Group__0 ) ) )
            // InternalRosNetworkDsl.g:567:2: ( ( rule__FilterConnection__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:567:2: ( ( rule__FilterConnection__Group__0 ) )
            // InternalRosNetworkDsl.g:568:3: ( rule__FilterConnection__Group__0 )
            {
             before(grammarAccess.getFilterConnectionAccess().getGroup()); 
            // InternalRosNetworkDsl.g:569:3: ( rule__FilterConnection__Group__0 )
            // InternalRosNetworkDsl.g:569:4: rule__FilterConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterConnection"


    // $ANTLR start "entryRuleContinuousState"
    // InternalRosNetworkDsl.g:578:1: entryRuleContinuousState : ruleContinuousState EOF ;
    public final void entryRuleContinuousState() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:579:1: ( ruleContinuousState EOF )
            // InternalRosNetworkDsl.g:580:1: ruleContinuousState EOF
            {
             before(grammarAccess.getContinuousStateRule()); 
            pushFollow(FOLLOW_1);
            ruleContinuousState();

            state._fsp--;

             after(grammarAccess.getContinuousStateRule()); 
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
    // $ANTLR end "entryRuleContinuousState"


    // $ANTLR start "ruleContinuousState"
    // InternalRosNetworkDsl.g:587:1: ruleContinuousState : ( ( rule__ContinuousState__Group__0 ) ) ;
    public final void ruleContinuousState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:591:2: ( ( ( rule__ContinuousState__Group__0 ) ) )
            // InternalRosNetworkDsl.g:592:2: ( ( rule__ContinuousState__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:592:2: ( ( rule__ContinuousState__Group__0 ) )
            // InternalRosNetworkDsl.g:593:3: ( rule__ContinuousState__Group__0 )
            {
             before(grammarAccess.getContinuousStateAccess().getGroup()); 
            // InternalRosNetworkDsl.g:594:3: ( rule__ContinuousState__Group__0 )
            // InternalRosNetworkDsl.g:594:4: rule__ContinuousState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContinuousState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContinuousStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContinuousState"


    // $ANTLR start "entryRuleLanguageType"
    // InternalRosNetworkDsl.g:603:1: entryRuleLanguageType : ruleLanguageType EOF ;
    public final void entryRuleLanguageType() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:604:1: ( ruleLanguageType EOF )
            // InternalRosNetworkDsl.g:605:1: ruleLanguageType EOF
            {
             before(grammarAccess.getLanguageTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguageType();

            state._fsp--;

             after(grammarAccess.getLanguageTypeRule()); 
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
    // $ANTLR end "entryRuleLanguageType"


    // $ANTLR start "ruleLanguageType"
    // InternalRosNetworkDsl.g:612:1: ruleLanguageType : ( ( rule__LanguageType__Alternatives ) ) ;
    public final void ruleLanguageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:616:2: ( ( ( rule__LanguageType__Alternatives ) ) )
            // InternalRosNetworkDsl.g:617:2: ( ( rule__LanguageType__Alternatives ) )
            {
            // InternalRosNetworkDsl.g:617:2: ( ( rule__LanguageType__Alternatives ) )
            // InternalRosNetworkDsl.g:618:3: ( rule__LanguageType__Alternatives )
            {
             before(grammarAccess.getLanguageTypeAccess().getAlternatives()); 
            // InternalRosNetworkDsl.g:619:3: ( rule__LanguageType__Alternatives )
            // InternalRosNetworkDsl.g:619:4: rule__LanguageType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LanguageType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLanguageTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguageType"


    // $ANTLR start "entryRulePort"
    // InternalRosNetworkDsl.g:628:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:629:1: ( rulePort EOF )
            // InternalRosNetworkDsl.g:630:1: rulePort EOF
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
    // InternalRosNetworkDsl.g:637:1: rulePort : ( ( rule__Port__Alternatives ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:641:2: ( ( ( rule__Port__Alternatives ) ) )
            // InternalRosNetworkDsl.g:642:2: ( ( rule__Port__Alternatives ) )
            {
            // InternalRosNetworkDsl.g:642:2: ( ( rule__Port__Alternatives ) )
            // InternalRosNetworkDsl.g:643:3: ( rule__Port__Alternatives )
            {
             before(grammarAccess.getPortAccess().getAlternatives()); 
            // InternalRosNetworkDsl.g:644:3: ( rule__Port__Alternatives )
            // InternalRosNetworkDsl.g:644:4: rule__Port__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Port__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleInputPort"
    // InternalRosNetworkDsl.g:653:1: entryRuleInputPort : ruleInputPort EOF ;
    public final void entryRuleInputPort() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:654:1: ( ruleInputPort EOF )
            // InternalRosNetworkDsl.g:655:1: ruleInputPort EOF
            {
             before(grammarAccess.getInputPortRule()); 
            pushFollow(FOLLOW_1);
            ruleInputPort();

            state._fsp--;

             after(grammarAccess.getInputPortRule()); 
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
    // $ANTLR end "entryRuleInputPort"


    // $ANTLR start "ruleInputPort"
    // InternalRosNetworkDsl.g:662:1: ruleInputPort : ( ( rule__InputPort__Group__0 ) ) ;
    public final void ruleInputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:666:2: ( ( ( rule__InputPort__Group__0 ) ) )
            // InternalRosNetworkDsl.g:667:2: ( ( rule__InputPort__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:667:2: ( ( rule__InputPort__Group__0 ) )
            // InternalRosNetworkDsl.g:668:3: ( rule__InputPort__Group__0 )
            {
             before(grammarAccess.getInputPortAccess().getGroup()); 
            // InternalRosNetworkDsl.g:669:3: ( rule__InputPort__Group__0 )
            // InternalRosNetworkDsl.g:669:4: rule__InputPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputPort"


    // $ANTLR start "entryRuleOutputPort"
    // InternalRosNetworkDsl.g:678:1: entryRuleOutputPort : ruleOutputPort EOF ;
    public final void entryRuleOutputPort() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:679:1: ( ruleOutputPort EOF )
            // InternalRosNetworkDsl.g:680:1: ruleOutputPort EOF
            {
             before(grammarAccess.getOutputPortRule()); 
            pushFollow(FOLLOW_1);
            ruleOutputPort();

            state._fsp--;

             after(grammarAccess.getOutputPortRule()); 
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
    // $ANTLR end "entryRuleOutputPort"


    // $ANTLR start "ruleOutputPort"
    // InternalRosNetworkDsl.g:687:1: ruleOutputPort : ( ( rule__OutputPort__Group__0 ) ) ;
    public final void ruleOutputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:691:2: ( ( ( rule__OutputPort__Group__0 ) ) )
            // InternalRosNetworkDsl.g:692:2: ( ( rule__OutputPort__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:692:2: ( ( rule__OutputPort__Group__0 ) )
            // InternalRosNetworkDsl.g:693:3: ( rule__OutputPort__Group__0 )
            {
             before(grammarAccess.getOutputPortAccess().getGroup()); 
            // InternalRosNetworkDsl.g:694:3: ( rule__OutputPort__Group__0 )
            // InternalRosNetworkDsl.g:694:4: rule__OutputPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputPort"


    // $ANTLR start "entryRuleEBoolean"
    // InternalRosNetworkDsl.g:703:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:704:1: ( ruleEBoolean EOF )
            // InternalRosNetworkDsl.g:705:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalRosNetworkDsl.g:712:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:716:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalRosNetworkDsl.g:717:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalRosNetworkDsl.g:717:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalRosNetworkDsl.g:718:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalRosNetworkDsl.g:719:3: ( rule__EBoolean__Alternatives )
            // InternalRosNetworkDsl.g:719:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalRosNetworkDsl.g:728:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:729:1: ( ruleEInt EOF )
            // InternalRosNetworkDsl.g:730:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRosNetworkDsl.g:737:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:741:2: ( ( RULE_INT ) )
            // InternalRosNetworkDsl.g:742:2: ( RULE_INT )
            {
            // InternalRosNetworkDsl.g:742:2: ( RULE_INT )
            // InternalRosNetworkDsl.g:743:3: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleDouble"
    // InternalRosNetworkDsl.g:753:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:754:1: ( ruleDouble EOF )
            // InternalRosNetworkDsl.g:755:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalRosNetworkDsl.g:762:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:766:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalRosNetworkDsl.g:767:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalRosNetworkDsl.g:767:2: ( ( rule__Double__Group__0 ) )
            // InternalRosNetworkDsl.g:768:3: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // InternalRosNetworkDsl.g:769:3: ( rule__Double__Group__0 )
            // InternalRosNetworkDsl.g:769:4: rule__Double__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleEString"
    // InternalRosNetworkDsl.g:778:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRosNetworkDsl.g:779:1: ( ruleEString EOF )
            // InternalRosNetworkDsl.g:780:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRosNetworkDsl.g:787:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:791:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRosNetworkDsl.g:792:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRosNetworkDsl.g:792:2: ( ( rule__EString__Alternatives ) )
            // InternalRosNetworkDsl.g:793:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRosNetworkDsl.g:794:3: ( rule__EString__Alternatives )
            // InternalRosNetworkDsl.g:794:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__AbstractRosFileElement__Alternatives"
    // InternalRosNetworkDsl.g:802:1: rule__AbstractRosFileElement__Alternatives : ( ( ruleAbstractMessageType ) | ( ruleNode ) );
    public final void rule__AbstractRosFileElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:806:1: ( ( ruleAbstractMessageType ) | ( ruleNode ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=28 && LA1_0<=29)) ) {
                alt1=1;
            }
            else if ( (LA1_0==49) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRosNetworkDsl.g:807:2: ( ruleAbstractMessageType )
                    {
                    // InternalRosNetworkDsl.g:807:2: ( ruleAbstractMessageType )
                    // InternalRosNetworkDsl.g:808:3: ruleAbstractMessageType
                    {
                     before(grammarAccess.getAbstractRosFileElementAccess().getAbstractMessageTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractMessageType();

                    state._fsp--;

                     after(grammarAccess.getAbstractRosFileElementAccess().getAbstractMessageTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:813:2: ( ruleNode )
                    {
                    // InternalRosNetworkDsl.g:813:2: ( ruleNode )
                    // InternalRosNetworkDsl.g:814:3: ruleNode
                    {
                     before(grammarAccess.getAbstractRosFileElementAccess().getNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNode();

                    state._fsp--;

                     after(grammarAccess.getAbstractRosFileElementAccess().getNodeParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractRosFileElement__Alternatives"


    // $ANTLR start "rule__AbstractMessageType__Alternatives"
    // InternalRosNetworkDsl.g:823:1: rule__AbstractMessageType__Alternatives : ( ( ruleTopicMessage ) | ( ruleServiceType ) );
    public final void rule__AbstractMessageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:827:1: ( ( ruleTopicMessage ) | ( ruleServiceType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRosNetworkDsl.g:828:2: ( ruleTopicMessage )
                    {
                    // InternalRosNetworkDsl.g:828:2: ( ruleTopicMessage )
                    // InternalRosNetworkDsl.g:829:3: ruleTopicMessage
                    {
                     before(grammarAccess.getAbstractMessageTypeAccess().getTopicMessageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTopicMessage();

                    state._fsp--;

                     after(grammarAccess.getAbstractMessageTypeAccess().getTopicMessageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:834:2: ( ruleServiceType )
                    {
                    // InternalRosNetworkDsl.g:834:2: ( ruleServiceType )
                    // InternalRosNetworkDsl.g:835:3: ruleServiceType
                    {
                     before(grammarAccess.getAbstractMessageTypeAccess().getServiceTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleServiceType();

                    state._fsp--;

                     after(grammarAccess.getAbstractMessageTypeAccess().getServiceTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractMessageType__Alternatives"


    // $ANTLR start "rule__NetworkType__Alternatives"
    // InternalRosNetworkDsl.g:844:1: rule__NetworkType__Alternatives : ( ( 'ROS1' ) | ( 'ROS2' ) );
    public final void rule__NetworkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:848:1: ( ( 'ROS1' ) | ( 'ROS2' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRosNetworkDsl.g:849:2: ( 'ROS1' )
                    {
                    // InternalRosNetworkDsl.g:849:2: ( 'ROS1' )
                    // InternalRosNetworkDsl.g:850:3: 'ROS1'
                    {
                     before(grammarAccess.getNetworkTypeAccess().getROS1Keyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getNetworkTypeAccess().getROS1Keyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:855:2: ( 'ROS2' )
                    {
                    // InternalRosNetworkDsl.g:855:2: ( 'ROS2' )
                    // InternalRosNetworkDsl.g:856:3: 'ROS2'
                    {
                     before(grammarAccess.getNetworkTypeAccess().getROS2Keyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNetworkTypeAccess().getROS2Keyword_1()); 

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
    // $ANTLR end "rule__NetworkType__Alternatives"


    // $ANTLR start "rule__Channel__Alternatives"
    // InternalRosNetworkDsl.g:865:1: rule__Channel__Alternatives : ( ( ruleTopic ) | ( ruleService ) );
    public final void rule__Channel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:869:1: ( ( ruleTopic ) | ( ruleService ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
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
                    // InternalRosNetworkDsl.g:870:2: ( ruleTopic )
                    {
                    // InternalRosNetworkDsl.g:870:2: ( ruleTopic )
                    // InternalRosNetworkDsl.g:871:3: ruleTopic
                    {
                     before(grammarAccess.getChannelAccess().getTopicParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTopic();

                    state._fsp--;

                     after(grammarAccess.getChannelAccess().getTopicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:876:2: ( ruleService )
                    {
                    // InternalRosNetworkDsl.g:876:2: ( ruleService )
                    // InternalRosNetworkDsl.g:877:3: ruleService
                    {
                     before(grammarAccess.getChannelAccess().getServiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleService();

                    state._fsp--;

                     after(grammarAccess.getChannelAccess().getServiceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Channel__Alternatives"


    // $ANTLR start "rule__NodeParameter__Alternatives"
    // InternalRosNetworkDsl.g:886:1: rule__NodeParameter__Alternatives : ( ( ruleDoubleParameter ) | ( ruleIntegerParameter ) | ( ruleBooleanParameter ) );
    public final void rule__NodeParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:890:1: ( ( ruleDoubleParameter ) | ( ruleIntegerParameter ) | ( ruleBooleanParameter ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt5=1;
                }
                break;
            case 36:
                {
                alt5=2;
                }
                break;
            case 33:
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
                    // InternalRosNetworkDsl.g:891:2: ( ruleDoubleParameter )
                    {
                    // InternalRosNetworkDsl.g:891:2: ( ruleDoubleParameter )
                    // InternalRosNetworkDsl.g:892:3: ruleDoubleParameter
                    {
                     before(grammarAccess.getNodeParameterAccess().getDoubleParameterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDoubleParameter();

                    state._fsp--;

                     after(grammarAccess.getNodeParameterAccess().getDoubleParameterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:897:2: ( ruleIntegerParameter )
                    {
                    // InternalRosNetworkDsl.g:897:2: ( ruleIntegerParameter )
                    // InternalRosNetworkDsl.g:898:3: ruleIntegerParameter
                    {
                     before(grammarAccess.getNodeParameterAccess().getIntegerParameterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerParameter();

                    state._fsp--;

                     after(grammarAccess.getNodeParameterAccess().getIntegerParameterParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRosNetworkDsl.g:903:2: ( ruleBooleanParameter )
                    {
                    // InternalRosNetworkDsl.g:903:2: ( ruleBooleanParameter )
                    // InternalRosNetworkDsl.g:904:3: ruleBooleanParameter
                    {
                     before(grammarAccess.getNodeParameterAccess().getBooleanParameterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanParameter();

                    state._fsp--;

                     after(grammarAccess.getNodeParameterAccess().getBooleanParameterParserRuleCall_2()); 

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
    // $ANTLR end "rule__NodeParameter__Alternatives"


    // $ANTLR start "rule__AbstractNodeParameter__Alternatives"
    // InternalRosNetworkDsl.g:913:1: rule__AbstractNodeParameter__Alternatives : ( ( ruleNodeParameter ) | ( ruleNodeParameterGroup ) );
    public final void rule__AbstractNodeParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:917:1: ( ( ruleNodeParameter ) | ( ruleNodeParameterGroup ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33||LA6_0==36||LA6_0==39) ) {
                alt6=1;
            }
            else if ( (LA6_0==40) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRosNetworkDsl.g:918:2: ( ruleNodeParameter )
                    {
                    // InternalRosNetworkDsl.g:918:2: ( ruleNodeParameter )
                    // InternalRosNetworkDsl.g:919:3: ruleNodeParameter
                    {
                     before(grammarAccess.getAbstractNodeParameterAccess().getNodeParameterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNodeParameter();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeParameterAccess().getNodeParameterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:924:2: ( ruleNodeParameterGroup )
                    {
                    // InternalRosNetworkDsl.g:924:2: ( ruleNodeParameterGroup )
                    // InternalRosNetworkDsl.g:925:3: ruleNodeParameterGroup
                    {
                     before(grammarAccess.getAbstractNodeParameterAccess().getNodeParameterGroupParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNodeParameterGroup();

                    state._fsp--;

                     after(grammarAccess.getAbstractNodeParameterAccess().getNodeParameterGroupParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractNodeParameter__Alternatives"


    // $ANTLR start "rule__LanguageType__Alternatives"
    // InternalRosNetworkDsl.g:934:1: rule__LanguageType__Alternatives : ( ( 'Python' ) | ( 'Cpp' ) );
    public final void rule__LanguageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:938:1: ( ( 'Python' ) | ( 'Cpp' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRosNetworkDsl.g:939:2: ( 'Python' )
                    {
                    // InternalRosNetworkDsl.g:939:2: ( 'Python' )
                    // InternalRosNetworkDsl.g:940:3: 'Python'
                    {
                     before(grammarAccess.getLanguageTypeAccess().getPythonKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getLanguageTypeAccess().getPythonKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:945:2: ( 'Cpp' )
                    {
                    // InternalRosNetworkDsl.g:945:2: ( 'Cpp' )
                    // InternalRosNetworkDsl.g:946:3: 'Cpp'
                    {
                     before(grammarAccess.getLanguageTypeAccess().getCppKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLanguageTypeAccess().getCppKeyword_1()); 

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
    // $ANTLR end "rule__LanguageType__Alternatives"


    // $ANTLR start "rule__Port__Alternatives"
    // InternalRosNetworkDsl.g:955:1: rule__Port__Alternatives : ( ( ruleInputPort ) | ( ruleOutputPort ) );
    public final void rule__Port__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:959:1: ( ( ruleInputPort ) | ( ruleOutputPort ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==53) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_STRING) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==35) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==54) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA8_1==RULE_ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==54) ) {
                        alt8=1;
                    }
                    else if ( (LA8_3==35) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRosNetworkDsl.g:960:2: ( ruleInputPort )
                    {
                    // InternalRosNetworkDsl.g:960:2: ( ruleInputPort )
                    // InternalRosNetworkDsl.g:961:3: ruleInputPort
                    {
                     before(grammarAccess.getPortAccess().getInputPortParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInputPort();

                    state._fsp--;

                     after(grammarAccess.getPortAccess().getInputPortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:966:2: ( ruleOutputPort )
                    {
                    // InternalRosNetworkDsl.g:966:2: ( ruleOutputPort )
                    // InternalRosNetworkDsl.g:967:3: ruleOutputPort
                    {
                     before(grammarAccess.getPortAccess().getOutputPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOutputPort();

                    state._fsp--;

                     after(grammarAccess.getPortAccess().getOutputPortParserRuleCall_1()); 

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
    // $ANTLR end "rule__Port__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalRosNetworkDsl.g:976:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:980:1: ( ( 'true' ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRosNetworkDsl.g:981:2: ( 'true' )
                    {
                    // InternalRosNetworkDsl.g:981:2: ( 'true' )
                    // InternalRosNetworkDsl.g:982:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:987:2: ( 'false' )
                    {
                    // InternalRosNetworkDsl.g:987:2: ( 'false' )
                    // InternalRosNetworkDsl.g:988:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRosNetworkDsl.g:997:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1001:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRosNetworkDsl.g:1002:2: ( RULE_STRING )
                    {
                    // InternalRosNetworkDsl.g:1002:2: ( RULE_STRING )
                    // InternalRosNetworkDsl.g:1003:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosNetworkDsl.g:1008:2: ( RULE_ID )
                    {
                    // InternalRosNetworkDsl.g:1008:2: ( RULE_ID )
                    // InternalRosNetworkDsl.g:1009:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__MiddleWareNetwork__Group__0"
    // InternalRosNetworkDsl.g:1018:1: rule__MiddleWareNetwork__Group__0 : rule__MiddleWareNetwork__Group__0__Impl rule__MiddleWareNetwork__Group__1 ;
    public final void rule__MiddleWareNetwork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1022:1: ( rule__MiddleWareNetwork__Group__0__Impl rule__MiddleWareNetwork__Group__1 )
            // InternalRosNetworkDsl.g:1023:2: rule__MiddleWareNetwork__Group__0__Impl rule__MiddleWareNetwork__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MiddleWareNetwork__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__0"


    // $ANTLR start "rule__MiddleWareNetwork__Group__0__Impl"
    // InternalRosNetworkDsl.g:1030:1: rule__MiddleWareNetwork__Group__0__Impl : ( () ) ;
    public final void rule__MiddleWareNetwork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1034:1: ( ( () ) )
            // InternalRosNetworkDsl.g:1035:1: ( () )
            {
            // InternalRosNetworkDsl.g:1035:1: ( () )
            // InternalRosNetworkDsl.g:1036:2: ()
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getStackAction_0()); 
            // InternalRosNetworkDsl.g:1037:2: ()
            // InternalRosNetworkDsl.g:1037:3: 
            {
            }

             after(grammarAccess.getMiddleWareNetworkAccess().getStackAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__0__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group__1"
    // InternalRosNetworkDsl.g:1045:1: rule__MiddleWareNetwork__Group__1 : rule__MiddleWareNetwork__Group__1__Impl rule__MiddleWareNetwork__Group__2 ;
    public final void rule__MiddleWareNetwork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1049:1: ( rule__MiddleWareNetwork__Group__1__Impl rule__MiddleWareNetwork__Group__2 )
            // InternalRosNetworkDsl.g:1050:2: rule__MiddleWareNetwork__Group__1__Impl rule__MiddleWareNetwork__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MiddleWareNetwork__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__1"


    // $ANTLR start "rule__MiddleWareNetwork__Group__1__Impl"
    // InternalRosNetworkDsl.g:1057:1: rule__MiddleWareNetwork__Group__1__Impl : ( 'stack' ) ;
    public final void rule__MiddleWareNetwork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1061:1: ( ( 'stack' ) )
            // InternalRosNetworkDsl.g:1062:1: ( 'stack' )
            {
            // InternalRosNetworkDsl.g:1062:1: ( 'stack' )
            // InternalRosNetworkDsl.g:1063:2: 'stack'
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getStackKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMiddleWareNetworkAccess().getStackKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__1__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group__2"
    // InternalRosNetworkDsl.g:1072:1: rule__MiddleWareNetwork__Group__2 : rule__MiddleWareNetwork__Group__2__Impl rule__MiddleWareNetwork__Group__3 ;
    public final void rule__MiddleWareNetwork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1076:1: ( rule__MiddleWareNetwork__Group__2__Impl rule__MiddleWareNetwork__Group__3 )
            // InternalRosNetworkDsl.g:1077:2: rule__MiddleWareNetwork__Group__2__Impl rule__MiddleWareNetwork__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MiddleWareNetwork__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__2"


    // $ANTLR start "rule__MiddleWareNetwork__Group__2__Impl"
    // InternalRosNetworkDsl.g:1084:1: rule__MiddleWareNetwork__Group__2__Impl : ( ( rule__MiddleWareNetwork__NameAssignment_2 ) ) ;
    public final void rule__MiddleWareNetwork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1088:1: ( ( ( rule__MiddleWareNetwork__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:1089:1: ( ( rule__MiddleWareNetwork__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:1089:1: ( ( rule__MiddleWareNetwork__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:1090:2: ( rule__MiddleWareNetwork__NameAssignment_2 )
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:1091:2: ( rule__MiddleWareNetwork__NameAssignment_2 )
            // InternalRosNetworkDsl.g:1091:3: rule__MiddleWareNetwork__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMiddleWareNetworkAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__2__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group__3"
    // InternalRosNetworkDsl.g:1099:1: rule__MiddleWareNetwork__Group__3 : rule__MiddleWareNetwork__Group__3__Impl rule__MiddleWareNetwork__Group__4 ;
    public final void rule__MiddleWareNetwork__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1103:1: ( rule__MiddleWareNetwork__Group__3__Impl rule__MiddleWareNetwork__Group__4 )
            // InternalRosNetworkDsl.g:1104:2: rule__MiddleWareNetwork__Group__3__Impl rule__MiddleWareNetwork__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__MiddleWareNetwork__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__3"


    // $ANTLR start "rule__MiddleWareNetwork__Group__3__Impl"
    // InternalRosNetworkDsl.g:1111:1: rule__MiddleWareNetwork__Group__3__Impl : ( '{' ) ;
    public final void rule__MiddleWareNetwork__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1115:1: ( ( '{' ) )
            // InternalRosNetworkDsl.g:1116:1: ( '{' )
            {
            // InternalRosNetworkDsl.g:1116:1: ( '{' )
            // InternalRosNetworkDsl.g:1117:2: '{'
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMiddleWareNetworkAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__3__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group__4"
    // InternalRosNetworkDsl.g:1126:1: rule__MiddleWareNetwork__Group__4 : rule__MiddleWareNetwork__Group__4__Impl rule__MiddleWareNetwork__Group__5 ;
    public final void rule__MiddleWareNetwork__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1130:1: ( rule__MiddleWareNetwork__Group__4__Impl rule__MiddleWareNetwork__Group__5 )
            // InternalRosNetworkDsl.g:1131:2: rule__MiddleWareNetwork__Group__4__Impl rule__MiddleWareNetwork__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MiddleWareNetwork__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__4"


    // $ANTLR start "rule__MiddleWareNetwork__Group__4__Impl"
    // InternalRosNetworkDsl.g:1138:1: rule__MiddleWareNetwork__Group__4__Impl : ( 'networktype' ) ;
    public final void rule__MiddleWareNetwork__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1142:1: ( ( 'networktype' ) )
            // InternalRosNetworkDsl.g:1143:1: ( 'networktype' )
            {
            // InternalRosNetworkDsl.g:1143:1: ( 'networktype' )
            // InternalRosNetworkDsl.g:1144:2: 'networktype'
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getNetworktypeKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMiddleWareNetworkAccess().getNetworktypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__4__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group__5"
    // InternalRosNetworkDsl.g:1153:1: rule__MiddleWareNetwork__Group__5 : rule__MiddleWareNetwork__Group__5__Impl rule__MiddleWareNetwork__Group__6 ;
    public final void rule__MiddleWareNetwork__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1157:1: ( rule__MiddleWareNetwork__Group__5__Impl rule__MiddleWareNetwork__Group__6 )
            // InternalRosNetworkDsl.g:1158:2: rule__MiddleWareNetwork__Group__5__Impl rule__MiddleWareNetwork__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__MiddleWareNetwork__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__5"


    // $ANTLR start "rule__MiddleWareNetwork__Group__5__Impl"
    // InternalRosNetworkDsl.g:1165:1: rule__MiddleWareNetwork__Group__5__Impl : ( ( rule__MiddleWareNetwork__NetworktypeAssignment_5 ) ) ;
    public final void rule__MiddleWareNetwork__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1169:1: ( ( ( rule__MiddleWareNetwork__NetworktypeAssignment_5 ) ) )
            // InternalRosNetworkDsl.g:1170:1: ( ( rule__MiddleWareNetwork__NetworktypeAssignment_5 ) )
            {
            // InternalRosNetworkDsl.g:1170:1: ( ( rule__MiddleWareNetwork__NetworktypeAssignment_5 ) )
            // InternalRosNetworkDsl.g:1171:2: ( rule__MiddleWareNetwork__NetworktypeAssignment_5 )
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getNetworktypeAssignment_5()); 
            // InternalRosNetworkDsl.g:1172:2: ( rule__MiddleWareNetwork__NetworktypeAssignment_5 )
            // InternalRosNetworkDsl.g:1172:3: rule__MiddleWareNetwork__NetworktypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__NetworktypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMiddleWareNetworkAccess().getNetworktypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__5__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group__6"
    // InternalRosNetworkDsl.g:1180:1: rule__MiddleWareNetwork__Group__6 : rule__MiddleWareNetwork__Group__6__Impl rule__MiddleWareNetwork__Group__7 ;
    public final void rule__MiddleWareNetwork__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1184:1: ( rule__MiddleWareNetwork__Group__6__Impl rule__MiddleWareNetwork__Group__7 )
            // InternalRosNetworkDsl.g:1185:2: rule__MiddleWareNetwork__Group__6__Impl rule__MiddleWareNetwork__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__MiddleWareNetwork__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__6"


    // $ANTLR start "rule__MiddleWareNetwork__Group__6__Impl"
    // InternalRosNetworkDsl.g:1192:1: rule__MiddleWareNetwork__Group__6__Impl : ( ( rule__MiddleWareNetwork__Group_6__0 )* ) ;
    public final void rule__MiddleWareNetwork__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1196:1: ( ( ( rule__MiddleWareNetwork__Group_6__0 )* ) )
            // InternalRosNetworkDsl.g:1197:1: ( ( rule__MiddleWareNetwork__Group_6__0 )* )
            {
            // InternalRosNetworkDsl.g:1197:1: ( ( rule__MiddleWareNetwork__Group_6__0 )* )
            // InternalRosNetworkDsl.g:1198:2: ( rule__MiddleWareNetwork__Group_6__0 )*
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getGroup_6()); 
            // InternalRosNetworkDsl.g:1199:2: ( rule__MiddleWareNetwork__Group_6__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:1199:3: rule__MiddleWareNetwork__Group_6__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MiddleWareNetwork__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMiddleWareNetworkAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__6__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group__7"
    // InternalRosNetworkDsl.g:1207:1: rule__MiddleWareNetwork__Group__7 : rule__MiddleWareNetwork__Group__7__Impl rule__MiddleWareNetwork__Group__8 ;
    public final void rule__MiddleWareNetwork__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1211:1: ( rule__MiddleWareNetwork__Group__7__Impl rule__MiddleWareNetwork__Group__8 )
            // InternalRosNetworkDsl.g:1212:2: rule__MiddleWareNetwork__Group__7__Impl rule__MiddleWareNetwork__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__MiddleWareNetwork__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__7"


    // $ANTLR start "rule__MiddleWareNetwork__Group__7__Impl"
    // InternalRosNetworkDsl.g:1219:1: rule__MiddleWareNetwork__Group__7__Impl : ( ( rule__MiddleWareNetwork__FilepackageAssignment_7 ) ) ;
    public final void rule__MiddleWareNetwork__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1223:1: ( ( ( rule__MiddleWareNetwork__FilepackageAssignment_7 ) ) )
            // InternalRosNetworkDsl.g:1224:1: ( ( rule__MiddleWareNetwork__FilepackageAssignment_7 ) )
            {
            // InternalRosNetworkDsl.g:1224:1: ( ( rule__MiddleWareNetwork__FilepackageAssignment_7 ) )
            // InternalRosNetworkDsl.g:1225:2: ( rule__MiddleWareNetwork__FilepackageAssignment_7 )
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getFilepackageAssignment_7()); 
            // InternalRosNetworkDsl.g:1226:2: ( rule__MiddleWareNetwork__FilepackageAssignment_7 )
            // InternalRosNetworkDsl.g:1226:3: rule__MiddleWareNetwork__FilepackageAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__FilepackageAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMiddleWareNetworkAccess().getFilepackageAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__7__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group__8"
    // InternalRosNetworkDsl.g:1234:1: rule__MiddleWareNetwork__Group__8 : rule__MiddleWareNetwork__Group__8__Impl rule__MiddleWareNetwork__Group__9 ;
    public final void rule__MiddleWareNetwork__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1238:1: ( rule__MiddleWareNetwork__Group__8__Impl rule__MiddleWareNetwork__Group__9 )
            // InternalRosNetworkDsl.g:1239:2: rule__MiddleWareNetwork__Group__8__Impl rule__MiddleWareNetwork__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__MiddleWareNetwork__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__8"


    // $ANTLR start "rule__MiddleWareNetwork__Group__8__Impl"
    // InternalRosNetworkDsl.g:1246:1: rule__MiddleWareNetwork__Group__8__Impl : ( ( rule__MiddleWareNetwork__FilepackageAssignment_8 )* ) ;
    public final void rule__MiddleWareNetwork__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1250:1: ( ( ( rule__MiddleWareNetwork__FilepackageAssignment_8 )* ) )
            // InternalRosNetworkDsl.g:1251:1: ( ( rule__MiddleWareNetwork__FilepackageAssignment_8 )* )
            {
            // InternalRosNetworkDsl.g:1251:1: ( ( rule__MiddleWareNetwork__FilepackageAssignment_8 )* )
            // InternalRosNetworkDsl.g:1252:2: ( rule__MiddleWareNetwork__FilepackageAssignment_8 )*
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getFilepackageAssignment_8()); 
            // InternalRosNetworkDsl.g:1253:2: ( rule__MiddleWareNetwork__FilepackageAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:1253:3: rule__MiddleWareNetwork__FilepackageAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__MiddleWareNetwork__FilepackageAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMiddleWareNetworkAccess().getFilepackageAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__8__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group__9"
    // InternalRosNetworkDsl.g:1261:1: rule__MiddleWareNetwork__Group__9 : rule__MiddleWareNetwork__Group__9__Impl rule__MiddleWareNetwork__Group__10 ;
    public final void rule__MiddleWareNetwork__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1265:1: ( rule__MiddleWareNetwork__Group__9__Impl rule__MiddleWareNetwork__Group__10 )
            // InternalRosNetworkDsl.g:1266:2: rule__MiddleWareNetwork__Group__9__Impl rule__MiddleWareNetwork__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__MiddleWareNetwork__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__9"


    // $ANTLR start "rule__MiddleWareNetwork__Group__9__Impl"
    // InternalRosNetworkDsl.g:1273:1: rule__MiddleWareNetwork__Group__9__Impl : ( ( rule__MiddleWareNetwork__Group_9__0 )? ) ;
    public final void rule__MiddleWareNetwork__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1277:1: ( ( ( rule__MiddleWareNetwork__Group_9__0 )? ) )
            // InternalRosNetworkDsl.g:1278:1: ( ( rule__MiddleWareNetwork__Group_9__0 )? )
            {
            // InternalRosNetworkDsl.g:1278:1: ( ( rule__MiddleWareNetwork__Group_9__0 )? )
            // InternalRosNetworkDsl.g:1279:2: ( rule__MiddleWareNetwork__Group_9__0 )?
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getGroup_9()); 
            // InternalRosNetworkDsl.g:1280:2: ( rule__MiddleWareNetwork__Group_9__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRosNetworkDsl.g:1280:3: rule__MiddleWareNetwork__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MiddleWareNetwork__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMiddleWareNetworkAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__9__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group__10"
    // InternalRosNetworkDsl.g:1288:1: rule__MiddleWareNetwork__Group__10 : rule__MiddleWareNetwork__Group__10__Impl ;
    public final void rule__MiddleWareNetwork__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1292:1: ( rule__MiddleWareNetwork__Group__10__Impl )
            // InternalRosNetworkDsl.g:1293:2: rule__MiddleWareNetwork__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__10"


    // $ANTLR start "rule__MiddleWareNetwork__Group__10__Impl"
    // InternalRosNetworkDsl.g:1299:1: rule__MiddleWareNetwork__Group__10__Impl : ( '}' ) ;
    public final void rule__MiddleWareNetwork__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1303:1: ( ( '}' ) )
            // InternalRosNetworkDsl.g:1304:1: ( '}' )
            {
            // InternalRosNetworkDsl.g:1304:1: ( '}' )
            // InternalRosNetworkDsl.g:1305:2: '}'
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getRightCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMiddleWareNetworkAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group__10__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group_6__0"
    // InternalRosNetworkDsl.g:1315:1: rule__MiddleWareNetwork__Group_6__0 : rule__MiddleWareNetwork__Group_6__0__Impl rule__MiddleWareNetwork__Group_6__1 ;
    public final void rule__MiddleWareNetwork__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1319:1: ( rule__MiddleWareNetwork__Group_6__0__Impl rule__MiddleWareNetwork__Group_6__1 )
            // InternalRosNetworkDsl.g:1320:2: rule__MiddleWareNetwork__Group_6__0__Impl rule__MiddleWareNetwork__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__MiddleWareNetwork__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group_6__0"


    // $ANTLR start "rule__MiddleWareNetwork__Group_6__0__Impl"
    // InternalRosNetworkDsl.g:1327:1: rule__MiddleWareNetwork__Group_6__0__Impl : ( ',' ) ;
    public final void rule__MiddleWareNetwork__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1331:1: ( ( ',' ) )
            // InternalRosNetworkDsl.g:1332:1: ( ',' )
            {
            // InternalRosNetworkDsl.g:1332:1: ( ',' )
            // InternalRosNetworkDsl.g:1333:2: ','
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getCommaKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMiddleWareNetworkAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group_6__0__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group_6__1"
    // InternalRosNetworkDsl.g:1342:1: rule__MiddleWareNetwork__Group_6__1 : rule__MiddleWareNetwork__Group_6__1__Impl ;
    public final void rule__MiddleWareNetwork__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1346:1: ( rule__MiddleWareNetwork__Group_6__1__Impl )
            // InternalRosNetworkDsl.g:1347:2: rule__MiddleWareNetwork__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group_6__1"


    // $ANTLR start "rule__MiddleWareNetwork__Group_6__1__Impl"
    // InternalRosNetworkDsl.g:1353:1: rule__MiddleWareNetwork__Group_6__1__Impl : ( ( rule__MiddleWareNetwork__NetworktypeAssignment_6_1 ) ) ;
    public final void rule__MiddleWareNetwork__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1357:1: ( ( ( rule__MiddleWareNetwork__NetworktypeAssignment_6_1 ) ) )
            // InternalRosNetworkDsl.g:1358:1: ( ( rule__MiddleWareNetwork__NetworktypeAssignment_6_1 ) )
            {
            // InternalRosNetworkDsl.g:1358:1: ( ( rule__MiddleWareNetwork__NetworktypeAssignment_6_1 ) )
            // InternalRosNetworkDsl.g:1359:2: ( rule__MiddleWareNetwork__NetworktypeAssignment_6_1 )
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getNetworktypeAssignment_6_1()); 
            // InternalRosNetworkDsl.g:1360:2: ( rule__MiddleWareNetwork__NetworktypeAssignment_6_1 )
            // InternalRosNetworkDsl.g:1360:3: rule__MiddleWareNetwork__NetworktypeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__NetworktypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMiddleWareNetworkAccess().getNetworktypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group_6__1__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group_9__0"
    // InternalRosNetworkDsl.g:1369:1: rule__MiddleWareNetwork__Group_9__0 : rule__MiddleWareNetwork__Group_9__0__Impl rule__MiddleWareNetwork__Group_9__1 ;
    public final void rule__MiddleWareNetwork__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1373:1: ( rule__MiddleWareNetwork__Group_9__0__Impl rule__MiddleWareNetwork__Group_9__1 )
            // InternalRosNetworkDsl.g:1374:2: rule__MiddleWareNetwork__Group_9__0__Impl rule__MiddleWareNetwork__Group_9__1
            {
            pushFollow(FOLLOW_5);
            rule__MiddleWareNetwork__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group_9__0"


    // $ANTLR start "rule__MiddleWareNetwork__Group_9__0__Impl"
    // InternalRosNetworkDsl.g:1381:1: rule__MiddleWareNetwork__Group_9__0__Impl : ( 'channels' ) ;
    public final void rule__MiddleWareNetwork__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1385:1: ( ( 'channels' ) )
            // InternalRosNetworkDsl.g:1386:1: ( 'channels' )
            {
            // InternalRosNetworkDsl.g:1386:1: ( 'channels' )
            // InternalRosNetworkDsl.g:1387:2: 'channels'
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getChannelsKeyword_9_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMiddleWareNetworkAccess().getChannelsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group_9__0__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group_9__1"
    // InternalRosNetworkDsl.g:1396:1: rule__MiddleWareNetwork__Group_9__1 : rule__MiddleWareNetwork__Group_9__1__Impl rule__MiddleWareNetwork__Group_9__2 ;
    public final void rule__MiddleWareNetwork__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1400:1: ( rule__MiddleWareNetwork__Group_9__1__Impl rule__MiddleWareNetwork__Group_9__2 )
            // InternalRosNetworkDsl.g:1401:2: rule__MiddleWareNetwork__Group_9__1__Impl rule__MiddleWareNetwork__Group_9__2
            {
            pushFollow(FOLLOW_12);
            rule__MiddleWareNetwork__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group_9__1"


    // $ANTLR start "rule__MiddleWareNetwork__Group_9__1__Impl"
    // InternalRosNetworkDsl.g:1408:1: rule__MiddleWareNetwork__Group_9__1__Impl : ( '{' ) ;
    public final void rule__MiddleWareNetwork__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1412:1: ( ( '{' ) )
            // InternalRosNetworkDsl.g:1413:1: ( '{' )
            {
            // InternalRosNetworkDsl.g:1413:1: ( '{' )
            // InternalRosNetworkDsl.g:1414:2: '{'
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMiddleWareNetworkAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group_9__1__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group_9__2"
    // InternalRosNetworkDsl.g:1423:1: rule__MiddleWareNetwork__Group_9__2 : rule__MiddleWareNetwork__Group_9__2__Impl rule__MiddleWareNetwork__Group_9__3 ;
    public final void rule__MiddleWareNetwork__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1427:1: ( rule__MiddleWareNetwork__Group_9__2__Impl rule__MiddleWareNetwork__Group_9__3 )
            // InternalRosNetworkDsl.g:1428:2: rule__MiddleWareNetwork__Group_9__2__Impl rule__MiddleWareNetwork__Group_9__3
            {
            pushFollow(FOLLOW_13);
            rule__MiddleWareNetwork__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group_9__2"


    // $ANTLR start "rule__MiddleWareNetwork__Group_9__2__Impl"
    // InternalRosNetworkDsl.g:1435:1: rule__MiddleWareNetwork__Group_9__2__Impl : ( ( rule__MiddleWareNetwork__ChannelsAssignment_9_2 ) ) ;
    public final void rule__MiddleWareNetwork__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1439:1: ( ( ( rule__MiddleWareNetwork__ChannelsAssignment_9_2 ) ) )
            // InternalRosNetworkDsl.g:1440:1: ( ( rule__MiddleWareNetwork__ChannelsAssignment_9_2 ) )
            {
            // InternalRosNetworkDsl.g:1440:1: ( ( rule__MiddleWareNetwork__ChannelsAssignment_9_2 ) )
            // InternalRosNetworkDsl.g:1441:2: ( rule__MiddleWareNetwork__ChannelsAssignment_9_2 )
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getChannelsAssignment_9_2()); 
            // InternalRosNetworkDsl.g:1442:2: ( rule__MiddleWareNetwork__ChannelsAssignment_9_2 )
            // InternalRosNetworkDsl.g:1442:3: rule__MiddleWareNetwork__ChannelsAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__ChannelsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getMiddleWareNetworkAccess().getChannelsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group_9__2__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group_9__3"
    // InternalRosNetworkDsl.g:1450:1: rule__MiddleWareNetwork__Group_9__3 : rule__MiddleWareNetwork__Group_9__3__Impl rule__MiddleWareNetwork__Group_9__4 ;
    public final void rule__MiddleWareNetwork__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1454:1: ( rule__MiddleWareNetwork__Group_9__3__Impl rule__MiddleWareNetwork__Group_9__4 )
            // InternalRosNetworkDsl.g:1455:2: rule__MiddleWareNetwork__Group_9__3__Impl rule__MiddleWareNetwork__Group_9__4
            {
            pushFollow(FOLLOW_13);
            rule__MiddleWareNetwork__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group_9__3"


    // $ANTLR start "rule__MiddleWareNetwork__Group_9__3__Impl"
    // InternalRosNetworkDsl.g:1462:1: rule__MiddleWareNetwork__Group_9__3__Impl : ( ( rule__MiddleWareNetwork__ChannelsAssignment_9_3 )* ) ;
    public final void rule__MiddleWareNetwork__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1466:1: ( ( ( rule__MiddleWareNetwork__ChannelsAssignment_9_3 )* ) )
            // InternalRosNetworkDsl.g:1467:1: ( ( rule__MiddleWareNetwork__ChannelsAssignment_9_3 )* )
            {
            // InternalRosNetworkDsl.g:1467:1: ( ( rule__MiddleWareNetwork__ChannelsAssignment_9_3 )* )
            // InternalRosNetworkDsl.g:1468:2: ( rule__MiddleWareNetwork__ChannelsAssignment_9_3 )*
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getChannelsAssignment_9_3()); 
            // InternalRosNetworkDsl.g:1469:2: ( rule__MiddleWareNetwork__ChannelsAssignment_9_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30||LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:1469:3: rule__MiddleWareNetwork__ChannelsAssignment_9_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__MiddleWareNetwork__ChannelsAssignment_9_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMiddleWareNetworkAccess().getChannelsAssignment_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group_9__3__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__Group_9__4"
    // InternalRosNetworkDsl.g:1477:1: rule__MiddleWareNetwork__Group_9__4 : rule__MiddleWareNetwork__Group_9__4__Impl ;
    public final void rule__MiddleWareNetwork__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1481:1: ( rule__MiddleWareNetwork__Group_9__4__Impl )
            // InternalRosNetworkDsl.g:1482:2: rule__MiddleWareNetwork__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiddleWareNetwork__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group_9__4"


    // $ANTLR start "rule__MiddleWareNetwork__Group_9__4__Impl"
    // InternalRosNetworkDsl.g:1488:1: rule__MiddleWareNetwork__Group_9__4__Impl : ( '}' ) ;
    public final void rule__MiddleWareNetwork__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1492:1: ( ( '}' ) )
            // InternalRosNetworkDsl.g:1493:1: ( '}' )
            {
            // InternalRosNetworkDsl.g:1493:1: ( '}' )
            // InternalRosNetworkDsl.g:1494:2: '}'
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMiddleWareNetworkAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__Group_9__4__Impl"


    // $ANTLR start "rule__FilePackage__Group__0"
    // InternalRosNetworkDsl.g:1504:1: rule__FilePackage__Group__0 : rule__FilePackage__Group__0__Impl rule__FilePackage__Group__1 ;
    public final void rule__FilePackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1508:1: ( rule__FilePackage__Group__0__Impl rule__FilePackage__Group__1 )
            // InternalRosNetworkDsl.g:1509:2: rule__FilePackage__Group__0__Impl rule__FilePackage__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FilePackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilePackage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__0"


    // $ANTLR start "rule__FilePackage__Group__0__Impl"
    // InternalRosNetworkDsl.g:1516:1: rule__FilePackage__Group__0__Impl : ( () ) ;
    public final void rule__FilePackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1520:1: ( ( () ) )
            // InternalRosNetworkDsl.g:1521:1: ( () )
            {
            // InternalRosNetworkDsl.g:1521:1: ( () )
            // InternalRosNetworkDsl.g:1522:2: ()
            {
             before(grammarAccess.getFilePackageAccess().getFilePackageAction_0()); 
            // InternalRosNetworkDsl.g:1523:2: ()
            // InternalRosNetworkDsl.g:1523:3: 
            {
            }

             after(grammarAccess.getFilePackageAccess().getFilePackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__0__Impl"


    // $ANTLR start "rule__FilePackage__Group__1"
    // InternalRosNetworkDsl.g:1531:1: rule__FilePackage__Group__1 : rule__FilePackage__Group__1__Impl rule__FilePackage__Group__2 ;
    public final void rule__FilePackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1535:1: ( rule__FilePackage__Group__1__Impl rule__FilePackage__Group__2 )
            // InternalRosNetworkDsl.g:1536:2: rule__FilePackage__Group__1__Impl rule__FilePackage__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FilePackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilePackage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__1"


    // $ANTLR start "rule__FilePackage__Group__1__Impl"
    // InternalRosNetworkDsl.g:1543:1: rule__FilePackage__Group__1__Impl : ( 'package' ) ;
    public final void rule__FilePackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1547:1: ( ( 'package' ) )
            // InternalRosNetworkDsl.g:1548:1: ( 'package' )
            {
            // InternalRosNetworkDsl.g:1548:1: ( 'package' )
            // InternalRosNetworkDsl.g:1549:2: 'package'
            {
             before(grammarAccess.getFilePackageAccess().getPackageKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFilePackageAccess().getPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__1__Impl"


    // $ANTLR start "rule__FilePackage__Group__2"
    // InternalRosNetworkDsl.g:1558:1: rule__FilePackage__Group__2 : rule__FilePackage__Group__2__Impl rule__FilePackage__Group__3 ;
    public final void rule__FilePackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1562:1: ( rule__FilePackage__Group__2__Impl rule__FilePackage__Group__3 )
            // InternalRosNetworkDsl.g:1563:2: rule__FilePackage__Group__2__Impl rule__FilePackage__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__FilePackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilePackage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__2"


    // $ANTLR start "rule__FilePackage__Group__2__Impl"
    // InternalRosNetworkDsl.g:1570:1: rule__FilePackage__Group__2__Impl : ( ( rule__FilePackage__NameAssignment_2 ) ) ;
    public final void rule__FilePackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1574:1: ( ( ( rule__FilePackage__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:1575:1: ( ( rule__FilePackage__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:1575:1: ( ( rule__FilePackage__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:1576:2: ( rule__FilePackage__NameAssignment_2 )
            {
             before(grammarAccess.getFilePackageAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:1577:2: ( rule__FilePackage__NameAssignment_2 )
            // InternalRosNetworkDsl.g:1577:3: rule__FilePackage__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FilePackage__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilePackageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__2__Impl"


    // $ANTLR start "rule__FilePackage__Group__3"
    // InternalRosNetworkDsl.g:1585:1: rule__FilePackage__Group__3 : rule__FilePackage__Group__3__Impl rule__FilePackage__Group__4 ;
    public final void rule__FilePackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1589:1: ( rule__FilePackage__Group__3__Impl rule__FilePackage__Group__4 )
            // InternalRosNetworkDsl.g:1590:2: rule__FilePackage__Group__3__Impl rule__FilePackage__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__FilePackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilePackage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__3"


    // $ANTLR start "rule__FilePackage__Group__3__Impl"
    // InternalRosNetworkDsl.g:1597:1: rule__FilePackage__Group__3__Impl : ( ( rule__FilePackage__GenerateartifactAssignment_3 )? ) ;
    public final void rule__FilePackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1601:1: ( ( ( rule__FilePackage__GenerateartifactAssignment_3 )? ) )
            // InternalRosNetworkDsl.g:1602:1: ( ( rule__FilePackage__GenerateartifactAssignment_3 )? )
            {
            // InternalRosNetworkDsl.g:1602:1: ( ( rule__FilePackage__GenerateartifactAssignment_3 )? )
            // InternalRosNetworkDsl.g:1603:2: ( rule__FilePackage__GenerateartifactAssignment_3 )?
            {
             before(grammarAccess.getFilePackageAccess().getGenerateartifactAssignment_3()); 
            // InternalRosNetworkDsl.g:1604:2: ( rule__FilePackage__GenerateartifactAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosNetworkDsl.g:1604:3: rule__FilePackage__GenerateartifactAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilePackage__GenerateartifactAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilePackageAccess().getGenerateartifactAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__3__Impl"


    // $ANTLR start "rule__FilePackage__Group__4"
    // InternalRosNetworkDsl.g:1612:1: rule__FilePackage__Group__4 : rule__FilePackage__Group__4__Impl rule__FilePackage__Group__5 ;
    public final void rule__FilePackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1616:1: ( rule__FilePackage__Group__4__Impl rule__FilePackage__Group__5 )
            // InternalRosNetworkDsl.g:1617:2: rule__FilePackage__Group__4__Impl rule__FilePackage__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__FilePackage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilePackage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__4"


    // $ANTLR start "rule__FilePackage__Group__4__Impl"
    // InternalRosNetworkDsl.g:1624:1: rule__FilePackage__Group__4__Impl : ( '{' ) ;
    public final void rule__FilePackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1628:1: ( ( '{' ) )
            // InternalRosNetworkDsl.g:1629:1: ( '{' )
            {
            // InternalRosNetworkDsl.g:1629:1: ( '{' )
            // InternalRosNetworkDsl.g:1630:2: '{'
            {
             before(grammarAccess.getFilePackageAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFilePackageAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__4__Impl"


    // $ANTLR start "rule__FilePackage__Group__5"
    // InternalRosNetworkDsl.g:1639:1: rule__FilePackage__Group__5 : rule__FilePackage__Group__5__Impl rule__FilePackage__Group__6 ;
    public final void rule__FilePackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1643:1: ( rule__FilePackage__Group__5__Impl rule__FilePackage__Group__6 )
            // InternalRosNetworkDsl.g:1644:2: rule__FilePackage__Group__5__Impl rule__FilePackage__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__FilePackage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilePackage__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__5"


    // $ANTLR start "rule__FilePackage__Group__5__Impl"
    // InternalRosNetworkDsl.g:1651:1: rule__FilePackage__Group__5__Impl : ( ( rule__FilePackage__AbstractroselementAssignment_5 ) ) ;
    public final void rule__FilePackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1655:1: ( ( ( rule__FilePackage__AbstractroselementAssignment_5 ) ) )
            // InternalRosNetworkDsl.g:1656:1: ( ( rule__FilePackage__AbstractroselementAssignment_5 ) )
            {
            // InternalRosNetworkDsl.g:1656:1: ( ( rule__FilePackage__AbstractroselementAssignment_5 ) )
            // InternalRosNetworkDsl.g:1657:2: ( rule__FilePackage__AbstractroselementAssignment_5 )
            {
             before(grammarAccess.getFilePackageAccess().getAbstractroselementAssignment_5()); 
            // InternalRosNetworkDsl.g:1658:2: ( rule__FilePackage__AbstractroselementAssignment_5 )
            // InternalRosNetworkDsl.g:1658:3: rule__FilePackage__AbstractroselementAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FilePackage__AbstractroselementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFilePackageAccess().getAbstractroselementAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__5__Impl"


    // $ANTLR start "rule__FilePackage__Group__6"
    // InternalRosNetworkDsl.g:1666:1: rule__FilePackage__Group__6 : rule__FilePackage__Group__6__Impl rule__FilePackage__Group__7 ;
    public final void rule__FilePackage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1670:1: ( rule__FilePackage__Group__6__Impl rule__FilePackage__Group__7 )
            // InternalRosNetworkDsl.g:1671:2: rule__FilePackage__Group__6__Impl rule__FilePackage__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__FilePackage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilePackage__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__6"


    // $ANTLR start "rule__FilePackage__Group__6__Impl"
    // InternalRosNetworkDsl.g:1678:1: rule__FilePackage__Group__6__Impl : ( ( rule__FilePackage__AbstractroselementAssignment_6 )* ) ;
    public final void rule__FilePackage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1682:1: ( ( ( rule__FilePackage__AbstractroselementAssignment_6 )* ) )
            // InternalRosNetworkDsl.g:1683:1: ( ( rule__FilePackage__AbstractroselementAssignment_6 )* )
            {
            // InternalRosNetworkDsl.g:1683:1: ( ( rule__FilePackage__AbstractroselementAssignment_6 )* )
            // InternalRosNetworkDsl.g:1684:2: ( rule__FilePackage__AbstractroselementAssignment_6 )*
            {
             before(grammarAccess.getFilePackageAccess().getAbstractroselementAssignment_6()); 
            // InternalRosNetworkDsl.g:1685:2: ( rule__FilePackage__AbstractroselementAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=28 && LA16_0<=29)||LA16_0==49) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:1685:3: rule__FilePackage__AbstractroselementAssignment_6
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__FilePackage__AbstractroselementAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFilePackageAccess().getAbstractroselementAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__6__Impl"


    // $ANTLR start "rule__FilePackage__Group__7"
    // InternalRosNetworkDsl.g:1693:1: rule__FilePackage__Group__7 : rule__FilePackage__Group__7__Impl rule__FilePackage__Group__8 ;
    public final void rule__FilePackage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1697:1: ( rule__FilePackage__Group__7__Impl rule__FilePackage__Group__8 )
            // InternalRosNetworkDsl.g:1698:2: rule__FilePackage__Group__7__Impl rule__FilePackage__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__FilePackage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilePackage__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__7"


    // $ANTLR start "rule__FilePackage__Group__7__Impl"
    // InternalRosNetworkDsl.g:1705:1: rule__FilePackage__Group__7__Impl : ( ( rule__FilePackage__Group_7__0 )? ) ;
    public final void rule__FilePackage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1709:1: ( ( ( rule__FilePackage__Group_7__0 )? ) )
            // InternalRosNetworkDsl.g:1710:1: ( ( rule__FilePackage__Group_7__0 )? )
            {
            // InternalRosNetworkDsl.g:1710:1: ( ( rule__FilePackage__Group_7__0 )? )
            // InternalRosNetworkDsl.g:1711:2: ( rule__FilePackage__Group_7__0 )?
            {
             before(grammarAccess.getFilePackageAccess().getGroup_7()); 
            // InternalRosNetworkDsl.g:1712:2: ( rule__FilePackage__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRosNetworkDsl.g:1712:3: rule__FilePackage__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilePackage__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilePackageAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__7__Impl"


    // $ANTLR start "rule__FilePackage__Group__8"
    // InternalRosNetworkDsl.g:1720:1: rule__FilePackage__Group__8 : rule__FilePackage__Group__8__Impl ;
    public final void rule__FilePackage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1724:1: ( rule__FilePackage__Group__8__Impl )
            // InternalRosNetworkDsl.g:1725:2: rule__FilePackage__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilePackage__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__8"


    // $ANTLR start "rule__FilePackage__Group__8__Impl"
    // InternalRosNetworkDsl.g:1731:1: rule__FilePackage__Group__8__Impl : ( '}' ) ;
    public final void rule__FilePackage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1735:1: ( ( '}' ) )
            // InternalRosNetworkDsl.g:1736:1: ( '}' )
            {
            // InternalRosNetworkDsl.g:1736:1: ( '}' )
            // InternalRosNetworkDsl.g:1737:2: '}'
            {
             before(grammarAccess.getFilePackageAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFilePackageAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group__8__Impl"


    // $ANTLR start "rule__FilePackage__Group_7__0"
    // InternalRosNetworkDsl.g:1747:1: rule__FilePackage__Group_7__0 : rule__FilePackage__Group_7__0__Impl rule__FilePackage__Group_7__1 ;
    public final void rule__FilePackage__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1751:1: ( rule__FilePackage__Group_7__0__Impl rule__FilePackage__Group_7__1 )
            // InternalRosNetworkDsl.g:1752:2: rule__FilePackage__Group_7__0__Impl rule__FilePackage__Group_7__1
            {
            pushFollow(FOLLOW_19);
            rule__FilePackage__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilePackage__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group_7__0"


    // $ANTLR start "rule__FilePackage__Group_7__0__Impl"
    // InternalRosNetworkDsl.g:1759:1: rule__FilePackage__Group_7__0__Impl : ( ( rule__FilePackage__FilterAssignment_7_0 ) ) ;
    public final void rule__FilePackage__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1763:1: ( ( ( rule__FilePackage__FilterAssignment_7_0 ) ) )
            // InternalRosNetworkDsl.g:1764:1: ( ( rule__FilePackage__FilterAssignment_7_0 ) )
            {
            // InternalRosNetworkDsl.g:1764:1: ( ( rule__FilePackage__FilterAssignment_7_0 ) )
            // InternalRosNetworkDsl.g:1765:2: ( rule__FilePackage__FilterAssignment_7_0 )
            {
             before(grammarAccess.getFilePackageAccess().getFilterAssignment_7_0()); 
            // InternalRosNetworkDsl.g:1766:2: ( rule__FilePackage__FilterAssignment_7_0 )
            // InternalRosNetworkDsl.g:1766:3: rule__FilePackage__FilterAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__FilePackage__FilterAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getFilePackageAccess().getFilterAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group_7__0__Impl"


    // $ANTLR start "rule__FilePackage__Group_7__1"
    // InternalRosNetworkDsl.g:1774:1: rule__FilePackage__Group_7__1 : rule__FilePackage__Group_7__1__Impl ;
    public final void rule__FilePackage__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1778:1: ( rule__FilePackage__Group_7__1__Impl )
            // InternalRosNetworkDsl.g:1779:2: rule__FilePackage__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilePackage__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group_7__1"


    // $ANTLR start "rule__FilePackage__Group_7__1__Impl"
    // InternalRosNetworkDsl.g:1785:1: rule__FilePackage__Group_7__1__Impl : ( ( rule__FilePackage__FilterAssignment_7_1 )* ) ;
    public final void rule__FilePackage__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1789:1: ( ( ( rule__FilePackage__FilterAssignment_7_1 )* ) )
            // InternalRosNetworkDsl.g:1790:1: ( ( rule__FilePackage__FilterAssignment_7_1 )* )
            {
            // InternalRosNetworkDsl.g:1790:1: ( ( rule__FilePackage__FilterAssignment_7_1 )* )
            // InternalRosNetworkDsl.g:1791:2: ( rule__FilePackage__FilterAssignment_7_1 )*
            {
             before(grammarAccess.getFilePackageAccess().getFilterAssignment_7_1()); 
            // InternalRosNetworkDsl.g:1792:2: ( rule__FilePackage__FilterAssignment_7_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:1792:3: rule__FilePackage__FilterAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__FilePackage__FilterAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getFilePackageAccess().getFilterAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__Group_7__1__Impl"


    // $ANTLR start "rule__FilterDefinition__Group__0"
    // InternalRosNetworkDsl.g:1801:1: rule__FilterDefinition__Group__0 : rule__FilterDefinition__Group__0__Impl rule__FilterDefinition__Group__1 ;
    public final void rule__FilterDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1805:1: ( rule__FilterDefinition__Group__0__Impl rule__FilterDefinition__Group__1 )
            // InternalRosNetworkDsl.g:1806:2: rule__FilterDefinition__Group__0__Impl rule__FilterDefinition__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FilterDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__0"


    // $ANTLR start "rule__FilterDefinition__Group__0__Impl"
    // InternalRosNetworkDsl.g:1813:1: rule__FilterDefinition__Group__0__Impl : ( () ) ;
    public final void rule__FilterDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1817:1: ( ( () ) )
            // InternalRosNetworkDsl.g:1818:1: ( () )
            {
            // InternalRosNetworkDsl.g:1818:1: ( () )
            // InternalRosNetworkDsl.g:1819:2: ()
            {
             before(grammarAccess.getFilterDefinitionAccess().getFilterDefinitionAction_0()); 
            // InternalRosNetworkDsl.g:1820:2: ()
            // InternalRosNetworkDsl.g:1820:3: 
            {
            }

             after(grammarAccess.getFilterDefinitionAccess().getFilterDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__0__Impl"


    // $ANTLR start "rule__FilterDefinition__Group__1"
    // InternalRosNetworkDsl.g:1828:1: rule__FilterDefinition__Group__1 : rule__FilterDefinition__Group__1__Impl rule__FilterDefinition__Group__2 ;
    public final void rule__FilterDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1832:1: ( rule__FilterDefinition__Group__1__Impl rule__FilterDefinition__Group__2 )
            // InternalRosNetworkDsl.g:1833:2: rule__FilterDefinition__Group__1__Impl rule__FilterDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FilterDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__1"


    // $ANTLR start "rule__FilterDefinition__Group__1__Impl"
    // InternalRosNetworkDsl.g:1840:1: rule__FilterDefinition__Group__1__Impl : ( 'filter' ) ;
    public final void rule__FilterDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1844:1: ( ( 'filter' ) )
            // InternalRosNetworkDsl.g:1845:1: ( 'filter' )
            {
            // InternalRosNetworkDsl.g:1845:1: ( 'filter' )
            // InternalRosNetworkDsl.g:1846:2: 'filter'
            {
             before(grammarAccess.getFilterDefinitionAccess().getFilterKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFilterDefinitionAccess().getFilterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__1__Impl"


    // $ANTLR start "rule__FilterDefinition__Group__2"
    // InternalRosNetworkDsl.g:1855:1: rule__FilterDefinition__Group__2 : rule__FilterDefinition__Group__2__Impl rule__FilterDefinition__Group__3 ;
    public final void rule__FilterDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1859:1: ( rule__FilterDefinition__Group__2__Impl rule__FilterDefinition__Group__3 )
            // InternalRosNetworkDsl.g:1860:2: rule__FilterDefinition__Group__2__Impl rule__FilterDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__FilterDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__2"


    // $ANTLR start "rule__FilterDefinition__Group__2__Impl"
    // InternalRosNetworkDsl.g:1867:1: rule__FilterDefinition__Group__2__Impl : ( ( rule__FilterDefinition__NameAssignment_2 ) ) ;
    public final void rule__FilterDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1871:1: ( ( ( rule__FilterDefinition__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:1872:1: ( ( rule__FilterDefinition__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:1872:1: ( ( rule__FilterDefinition__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:1873:2: ( rule__FilterDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getFilterDefinitionAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:1874:2: ( rule__FilterDefinition__NameAssignment_2 )
            // InternalRosNetworkDsl.g:1874:3: rule__FilterDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FilterDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__2__Impl"


    // $ANTLR start "rule__FilterDefinition__Group__3"
    // InternalRosNetworkDsl.g:1882:1: rule__FilterDefinition__Group__3 : rule__FilterDefinition__Group__3__Impl rule__FilterDefinition__Group__4 ;
    public final void rule__FilterDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1886:1: ( rule__FilterDefinition__Group__3__Impl rule__FilterDefinition__Group__4 )
            // InternalRosNetworkDsl.g:1887:2: rule__FilterDefinition__Group__3__Impl rule__FilterDefinition__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__FilterDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__3"


    // $ANTLR start "rule__FilterDefinition__Group__3__Impl"
    // InternalRosNetworkDsl.g:1894:1: rule__FilterDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__FilterDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1898:1: ( ( '{' ) )
            // InternalRosNetworkDsl.g:1899:1: ( '{' )
            {
            // InternalRosNetworkDsl.g:1899:1: ( '{' )
            // InternalRosNetworkDsl.g:1900:2: '{'
            {
             before(grammarAccess.getFilterDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFilterDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__3__Impl"


    // $ANTLR start "rule__FilterDefinition__Group__4"
    // InternalRosNetworkDsl.g:1909:1: rule__FilterDefinition__Group__4 : rule__FilterDefinition__Group__4__Impl rule__FilterDefinition__Group__5 ;
    public final void rule__FilterDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1913:1: ( rule__FilterDefinition__Group__4__Impl rule__FilterDefinition__Group__5 )
            // InternalRosNetworkDsl.g:1914:2: rule__FilterDefinition__Group__4__Impl rule__FilterDefinition__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__FilterDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__4"


    // $ANTLR start "rule__FilterDefinition__Group__4__Impl"
    // InternalRosNetworkDsl.g:1921:1: rule__FilterDefinition__Group__4__Impl : ( 'input' ) ;
    public final void rule__FilterDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1925:1: ( ( 'input' ) )
            // InternalRosNetworkDsl.g:1926:1: ( 'input' )
            {
            // InternalRosNetworkDsl.g:1926:1: ( 'input' )
            // InternalRosNetworkDsl.g:1927:2: 'input'
            {
             before(grammarAccess.getFilterDefinitionAccess().getInputKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFilterDefinitionAccess().getInputKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__4__Impl"


    // $ANTLR start "rule__FilterDefinition__Group__5"
    // InternalRosNetworkDsl.g:1936:1: rule__FilterDefinition__Group__5 : rule__FilterDefinition__Group__5__Impl rule__FilterDefinition__Group__6 ;
    public final void rule__FilterDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1940:1: ( rule__FilterDefinition__Group__5__Impl rule__FilterDefinition__Group__6 )
            // InternalRosNetworkDsl.g:1941:2: rule__FilterDefinition__Group__5__Impl rule__FilterDefinition__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__FilterDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__5"


    // $ANTLR start "rule__FilterDefinition__Group__5__Impl"
    // InternalRosNetworkDsl.g:1948:1: rule__FilterDefinition__Group__5__Impl : ( ( rule__FilterDefinition__Input_fieldAssignment_5 ) ) ;
    public final void rule__FilterDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1952:1: ( ( ( rule__FilterDefinition__Input_fieldAssignment_5 ) ) )
            // InternalRosNetworkDsl.g:1953:1: ( ( rule__FilterDefinition__Input_fieldAssignment_5 ) )
            {
            // InternalRosNetworkDsl.g:1953:1: ( ( rule__FilterDefinition__Input_fieldAssignment_5 ) )
            // InternalRosNetworkDsl.g:1954:2: ( rule__FilterDefinition__Input_fieldAssignment_5 )
            {
             before(grammarAccess.getFilterDefinitionAccess().getInput_fieldAssignment_5()); 
            // InternalRosNetworkDsl.g:1955:2: ( rule__FilterDefinition__Input_fieldAssignment_5 )
            // InternalRosNetworkDsl.g:1955:3: rule__FilterDefinition__Input_fieldAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Input_fieldAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFilterDefinitionAccess().getInput_fieldAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__5__Impl"


    // $ANTLR start "rule__FilterDefinition__Group__6"
    // InternalRosNetworkDsl.g:1963:1: rule__FilterDefinition__Group__6 : rule__FilterDefinition__Group__6__Impl rule__FilterDefinition__Group__7 ;
    public final void rule__FilterDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1967:1: ( rule__FilterDefinition__Group__6__Impl rule__FilterDefinition__Group__7 )
            // InternalRosNetworkDsl.g:1968:2: rule__FilterDefinition__Group__6__Impl rule__FilterDefinition__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__FilterDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__6"


    // $ANTLR start "rule__FilterDefinition__Group__6__Impl"
    // InternalRosNetworkDsl.g:1975:1: rule__FilterDefinition__Group__6__Impl : ( ( rule__FilterDefinition__Group_6__0 )* ) ;
    public final void rule__FilterDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1979:1: ( ( ( rule__FilterDefinition__Group_6__0 )* ) )
            // InternalRosNetworkDsl.g:1980:1: ( ( rule__FilterDefinition__Group_6__0 )* )
            {
            // InternalRosNetworkDsl.g:1980:1: ( ( rule__FilterDefinition__Group_6__0 )* )
            // InternalRosNetworkDsl.g:1981:2: ( rule__FilterDefinition__Group_6__0 )*
            {
             before(grammarAccess.getFilterDefinitionAccess().getGroup_6()); 
            // InternalRosNetworkDsl.g:1982:2: ( rule__FilterDefinition__Group_6__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:1982:3: rule__FilterDefinition__Group_6__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__FilterDefinition__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getFilterDefinitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__6__Impl"


    // $ANTLR start "rule__FilterDefinition__Group__7"
    // InternalRosNetworkDsl.g:1990:1: rule__FilterDefinition__Group__7 : rule__FilterDefinition__Group__7__Impl rule__FilterDefinition__Group__8 ;
    public final void rule__FilterDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:1994:1: ( rule__FilterDefinition__Group__7__Impl rule__FilterDefinition__Group__8 )
            // InternalRosNetworkDsl.g:1995:2: rule__FilterDefinition__Group__7__Impl rule__FilterDefinition__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__FilterDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__7"


    // $ANTLR start "rule__FilterDefinition__Group__7__Impl"
    // InternalRosNetworkDsl.g:2002:1: rule__FilterDefinition__Group__7__Impl : ( 'output' ) ;
    public final void rule__FilterDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2006:1: ( ( 'output' ) )
            // InternalRosNetworkDsl.g:2007:1: ( 'output' )
            {
            // InternalRosNetworkDsl.g:2007:1: ( 'output' )
            // InternalRosNetworkDsl.g:2008:2: 'output'
            {
             before(grammarAccess.getFilterDefinitionAccess().getOutputKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFilterDefinitionAccess().getOutputKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__7__Impl"


    // $ANTLR start "rule__FilterDefinition__Group__8"
    // InternalRosNetworkDsl.g:2017:1: rule__FilterDefinition__Group__8 : rule__FilterDefinition__Group__8__Impl rule__FilterDefinition__Group__9 ;
    public final void rule__FilterDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2021:1: ( rule__FilterDefinition__Group__8__Impl rule__FilterDefinition__Group__9 )
            // InternalRosNetworkDsl.g:2022:2: rule__FilterDefinition__Group__8__Impl rule__FilterDefinition__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__FilterDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__8"


    // $ANTLR start "rule__FilterDefinition__Group__8__Impl"
    // InternalRosNetworkDsl.g:2029:1: rule__FilterDefinition__Group__8__Impl : ( ( rule__FilterDefinition__Output_fieldAssignment_8 ) ) ;
    public final void rule__FilterDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2033:1: ( ( ( rule__FilterDefinition__Output_fieldAssignment_8 ) ) )
            // InternalRosNetworkDsl.g:2034:1: ( ( rule__FilterDefinition__Output_fieldAssignment_8 ) )
            {
            // InternalRosNetworkDsl.g:2034:1: ( ( rule__FilterDefinition__Output_fieldAssignment_8 ) )
            // InternalRosNetworkDsl.g:2035:2: ( rule__FilterDefinition__Output_fieldAssignment_8 )
            {
             before(grammarAccess.getFilterDefinitionAccess().getOutput_fieldAssignment_8()); 
            // InternalRosNetworkDsl.g:2036:2: ( rule__FilterDefinition__Output_fieldAssignment_8 )
            // InternalRosNetworkDsl.g:2036:3: rule__FilterDefinition__Output_fieldAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Output_fieldAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFilterDefinitionAccess().getOutput_fieldAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__8__Impl"


    // $ANTLR start "rule__FilterDefinition__Group__9"
    // InternalRosNetworkDsl.g:2044:1: rule__FilterDefinition__Group__9 : rule__FilterDefinition__Group__9__Impl ;
    public final void rule__FilterDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2048:1: ( rule__FilterDefinition__Group__9__Impl )
            // InternalRosNetworkDsl.g:2049:2: rule__FilterDefinition__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__9"


    // $ANTLR start "rule__FilterDefinition__Group__9__Impl"
    // InternalRosNetworkDsl.g:2055:1: rule__FilterDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__FilterDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2059:1: ( ( '}' ) )
            // InternalRosNetworkDsl.g:2060:1: ( '}' )
            {
            // InternalRosNetworkDsl.g:2060:1: ( '}' )
            // InternalRosNetworkDsl.g:2061:2: '}'
            {
             before(grammarAccess.getFilterDefinitionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFilterDefinitionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group__9__Impl"


    // $ANTLR start "rule__FilterDefinition__Group_6__0"
    // InternalRosNetworkDsl.g:2071:1: rule__FilterDefinition__Group_6__0 : rule__FilterDefinition__Group_6__0__Impl rule__FilterDefinition__Group_6__1 ;
    public final void rule__FilterDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2075:1: ( rule__FilterDefinition__Group_6__0__Impl rule__FilterDefinition__Group_6__1 )
            // InternalRosNetworkDsl.g:2076:2: rule__FilterDefinition__Group_6__0__Impl rule__FilterDefinition__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__FilterDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group_6__0"


    // $ANTLR start "rule__FilterDefinition__Group_6__0__Impl"
    // InternalRosNetworkDsl.g:2083:1: rule__FilterDefinition__Group_6__0__Impl : ( 'input' ) ;
    public final void rule__FilterDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2087:1: ( ( 'input' ) )
            // InternalRosNetworkDsl.g:2088:1: ( 'input' )
            {
            // InternalRosNetworkDsl.g:2088:1: ( 'input' )
            // InternalRosNetworkDsl.g:2089:2: 'input'
            {
             before(grammarAccess.getFilterDefinitionAccess().getInputKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFilterDefinitionAccess().getInputKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__FilterDefinition__Group_6__1"
    // InternalRosNetworkDsl.g:2098:1: rule__FilterDefinition__Group_6__1 : rule__FilterDefinition__Group_6__1__Impl ;
    public final void rule__FilterDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2102:1: ( rule__FilterDefinition__Group_6__1__Impl )
            // InternalRosNetworkDsl.g:2103:2: rule__FilterDefinition__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group_6__1"


    // $ANTLR start "rule__FilterDefinition__Group_6__1__Impl"
    // InternalRosNetworkDsl.g:2109:1: rule__FilterDefinition__Group_6__1__Impl : ( ( rule__FilterDefinition__Input_fieldAssignment_6_1 ) ) ;
    public final void rule__FilterDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2113:1: ( ( ( rule__FilterDefinition__Input_fieldAssignment_6_1 ) ) )
            // InternalRosNetworkDsl.g:2114:1: ( ( rule__FilterDefinition__Input_fieldAssignment_6_1 ) )
            {
            // InternalRosNetworkDsl.g:2114:1: ( ( rule__FilterDefinition__Input_fieldAssignment_6_1 ) )
            // InternalRosNetworkDsl.g:2115:2: ( rule__FilterDefinition__Input_fieldAssignment_6_1 )
            {
             before(grammarAccess.getFilterDefinitionAccess().getInput_fieldAssignment_6_1()); 
            // InternalRosNetworkDsl.g:2116:2: ( rule__FilterDefinition__Input_fieldAssignment_6_1 )
            // InternalRosNetworkDsl.g:2116:3: rule__FilterDefinition__Input_fieldAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterDefinition__Input_fieldAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterDefinitionAccess().getInput_fieldAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__SerializedField__Group__0"
    // InternalRosNetworkDsl.g:2125:1: rule__SerializedField__Group__0 : rule__SerializedField__Group__0__Impl rule__SerializedField__Group__1 ;
    public final void rule__SerializedField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2129:1: ( rule__SerializedField__Group__0__Impl rule__SerializedField__Group__1 )
            // InternalRosNetworkDsl.g:2130:2: rule__SerializedField__Group__0__Impl rule__SerializedField__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__SerializedField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SerializedField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerializedField__Group__0"


    // $ANTLR start "rule__SerializedField__Group__0__Impl"
    // InternalRosNetworkDsl.g:2137:1: rule__SerializedField__Group__0__Impl : ( () ) ;
    public final void rule__SerializedField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2141:1: ( ( () ) )
            // InternalRosNetworkDsl.g:2142:1: ( () )
            {
            // InternalRosNetworkDsl.g:2142:1: ( () )
            // InternalRosNetworkDsl.g:2143:2: ()
            {
             before(grammarAccess.getSerializedFieldAccess().getSerializedFieldAction_0()); 
            // InternalRosNetworkDsl.g:2144:2: ()
            // InternalRosNetworkDsl.g:2144:3: 
            {
            }

             after(grammarAccess.getSerializedFieldAccess().getSerializedFieldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerializedField__Group__0__Impl"


    // $ANTLR start "rule__SerializedField__Group__1"
    // InternalRosNetworkDsl.g:2152:1: rule__SerializedField__Group__1 : rule__SerializedField__Group__1__Impl rule__SerializedField__Group__2 ;
    public final void rule__SerializedField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2156:1: ( rule__SerializedField__Group__1__Impl rule__SerializedField__Group__2 )
            // InternalRosNetworkDsl.g:2157:2: rule__SerializedField__Group__1__Impl rule__SerializedField__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SerializedField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SerializedField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerializedField__Group__1"


    // $ANTLR start "rule__SerializedField__Group__1__Impl"
    // InternalRosNetworkDsl.g:2164:1: rule__SerializedField__Group__1__Impl : ( 'field' ) ;
    public final void rule__SerializedField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2168:1: ( ( 'field' ) )
            // InternalRosNetworkDsl.g:2169:1: ( 'field' )
            {
            // InternalRosNetworkDsl.g:2169:1: ( 'field' )
            // InternalRosNetworkDsl.g:2170:2: 'field'
            {
             before(grammarAccess.getSerializedFieldAccess().getFieldKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSerializedFieldAccess().getFieldKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerializedField__Group__1__Impl"


    // $ANTLR start "rule__SerializedField__Group__2"
    // InternalRosNetworkDsl.g:2179:1: rule__SerializedField__Group__2 : rule__SerializedField__Group__2__Impl rule__SerializedField__Group__3 ;
    public final void rule__SerializedField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2183:1: ( rule__SerializedField__Group__2__Impl rule__SerializedField__Group__3 )
            // InternalRosNetworkDsl.g:2184:2: rule__SerializedField__Group__2__Impl rule__SerializedField__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SerializedField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SerializedField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerializedField__Group__2"


    // $ANTLR start "rule__SerializedField__Group__2__Impl"
    // InternalRosNetworkDsl.g:2191:1: rule__SerializedField__Group__2__Impl : ( ( rule__SerializedField__IdAssignment_2 ) ) ;
    public final void rule__SerializedField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2195:1: ( ( ( rule__SerializedField__IdAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:2196:1: ( ( rule__SerializedField__IdAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:2196:1: ( ( rule__SerializedField__IdAssignment_2 ) )
            // InternalRosNetworkDsl.g:2197:2: ( rule__SerializedField__IdAssignment_2 )
            {
             before(grammarAccess.getSerializedFieldAccess().getIdAssignment_2()); 
            // InternalRosNetworkDsl.g:2198:2: ( rule__SerializedField__IdAssignment_2 )
            // InternalRosNetworkDsl.g:2198:3: rule__SerializedField__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SerializedField__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSerializedFieldAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerializedField__Group__2__Impl"


    // $ANTLR start "rule__SerializedField__Group__3"
    // InternalRosNetworkDsl.g:2206:1: rule__SerializedField__Group__3 : rule__SerializedField__Group__3__Impl ;
    public final void rule__SerializedField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2210:1: ( rule__SerializedField__Group__3__Impl )
            // InternalRosNetworkDsl.g:2211:2: rule__SerializedField__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SerializedField__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerializedField__Group__3"


    // $ANTLR start "rule__SerializedField__Group__3__Impl"
    // InternalRosNetworkDsl.g:2217:1: rule__SerializedField__Group__3__Impl : ( ( rule__SerializedField__TopicmessageAssignment_3 ) ) ;
    public final void rule__SerializedField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2221:1: ( ( ( rule__SerializedField__TopicmessageAssignment_3 ) ) )
            // InternalRosNetworkDsl.g:2222:1: ( ( rule__SerializedField__TopicmessageAssignment_3 ) )
            {
            // InternalRosNetworkDsl.g:2222:1: ( ( rule__SerializedField__TopicmessageAssignment_3 ) )
            // InternalRosNetworkDsl.g:2223:2: ( rule__SerializedField__TopicmessageAssignment_3 )
            {
             before(grammarAccess.getSerializedFieldAccess().getTopicmessageAssignment_3()); 
            // InternalRosNetworkDsl.g:2224:2: ( rule__SerializedField__TopicmessageAssignment_3 )
            // InternalRosNetworkDsl.g:2224:3: rule__SerializedField__TopicmessageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SerializedField__TopicmessageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSerializedFieldAccess().getTopicmessageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerializedField__Group__3__Impl"


    // $ANTLR start "rule__TopicMessage__Group__0"
    // InternalRosNetworkDsl.g:2233:1: rule__TopicMessage__Group__0 : rule__TopicMessage__Group__0__Impl rule__TopicMessage__Group__1 ;
    public final void rule__TopicMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2237:1: ( rule__TopicMessage__Group__0__Impl rule__TopicMessage__Group__1 )
            // InternalRosNetworkDsl.g:2238:2: rule__TopicMessage__Group__0__Impl rule__TopicMessage__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__TopicMessage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicMessage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicMessage__Group__0"


    // $ANTLR start "rule__TopicMessage__Group__0__Impl"
    // InternalRosNetworkDsl.g:2245:1: rule__TopicMessage__Group__0__Impl : ( () ) ;
    public final void rule__TopicMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2249:1: ( ( () ) )
            // InternalRosNetworkDsl.g:2250:1: ( () )
            {
            // InternalRosNetworkDsl.g:2250:1: ( () )
            // InternalRosNetworkDsl.g:2251:2: ()
            {
             before(grammarAccess.getTopicMessageAccess().getTopicMessageAction_0()); 
            // InternalRosNetworkDsl.g:2252:2: ()
            // InternalRosNetworkDsl.g:2252:3: 
            {
            }

             after(grammarAccess.getTopicMessageAccess().getTopicMessageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicMessage__Group__0__Impl"


    // $ANTLR start "rule__TopicMessage__Group__1"
    // InternalRosNetworkDsl.g:2260:1: rule__TopicMessage__Group__1 : rule__TopicMessage__Group__1__Impl rule__TopicMessage__Group__2 ;
    public final void rule__TopicMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2264:1: ( rule__TopicMessage__Group__1__Impl rule__TopicMessage__Group__2 )
            // InternalRosNetworkDsl.g:2265:2: rule__TopicMessage__Group__1__Impl rule__TopicMessage__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TopicMessage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicMessage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicMessage__Group__1"


    // $ANTLR start "rule__TopicMessage__Group__1__Impl"
    // InternalRosNetworkDsl.g:2272:1: rule__TopicMessage__Group__1__Impl : ( 'messagetype' ) ;
    public final void rule__TopicMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2276:1: ( ( 'messagetype' ) )
            // InternalRosNetworkDsl.g:2277:1: ( 'messagetype' )
            {
            // InternalRosNetworkDsl.g:2277:1: ( 'messagetype' )
            // InternalRosNetworkDsl.g:2278:2: 'messagetype'
            {
             before(grammarAccess.getTopicMessageAccess().getMessagetypeKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTopicMessageAccess().getMessagetypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicMessage__Group__1__Impl"


    // $ANTLR start "rule__TopicMessage__Group__2"
    // InternalRosNetworkDsl.g:2287:1: rule__TopicMessage__Group__2 : rule__TopicMessage__Group__2__Impl ;
    public final void rule__TopicMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2291:1: ( rule__TopicMessage__Group__2__Impl )
            // InternalRosNetworkDsl.g:2292:2: rule__TopicMessage__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopicMessage__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicMessage__Group__2"


    // $ANTLR start "rule__TopicMessage__Group__2__Impl"
    // InternalRosNetworkDsl.g:2298:1: rule__TopicMessage__Group__2__Impl : ( ( rule__TopicMessage__NameAssignment_2 ) ) ;
    public final void rule__TopicMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2302:1: ( ( ( rule__TopicMessage__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:2303:1: ( ( rule__TopicMessage__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:2303:1: ( ( rule__TopicMessage__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:2304:2: ( rule__TopicMessage__NameAssignment_2 )
            {
             before(grammarAccess.getTopicMessageAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:2305:2: ( rule__TopicMessage__NameAssignment_2 )
            // InternalRosNetworkDsl.g:2305:3: rule__TopicMessage__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TopicMessage__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTopicMessageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicMessage__Group__2__Impl"


    // $ANTLR start "rule__ServiceType__Group__0"
    // InternalRosNetworkDsl.g:2314:1: rule__ServiceType__Group__0 : rule__ServiceType__Group__0__Impl rule__ServiceType__Group__1 ;
    public final void rule__ServiceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2318:1: ( rule__ServiceType__Group__0__Impl rule__ServiceType__Group__1 )
            // InternalRosNetworkDsl.g:2319:2: rule__ServiceType__Group__0__Impl rule__ServiceType__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ServiceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceType__Group__0"


    // $ANTLR start "rule__ServiceType__Group__0__Impl"
    // InternalRosNetworkDsl.g:2326:1: rule__ServiceType__Group__0__Impl : ( () ) ;
    public final void rule__ServiceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2330:1: ( ( () ) )
            // InternalRosNetworkDsl.g:2331:1: ( () )
            {
            // InternalRosNetworkDsl.g:2331:1: ( () )
            // InternalRosNetworkDsl.g:2332:2: ()
            {
             before(grammarAccess.getServiceTypeAccess().getServiceTypeAction_0()); 
            // InternalRosNetworkDsl.g:2333:2: ()
            // InternalRosNetworkDsl.g:2333:3: 
            {
            }

             after(grammarAccess.getServiceTypeAccess().getServiceTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceType__Group__0__Impl"


    // $ANTLR start "rule__ServiceType__Group__1"
    // InternalRosNetworkDsl.g:2341:1: rule__ServiceType__Group__1 : rule__ServiceType__Group__1__Impl rule__ServiceType__Group__2 ;
    public final void rule__ServiceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2345:1: ( rule__ServiceType__Group__1__Impl rule__ServiceType__Group__2 )
            // InternalRosNetworkDsl.g:2346:2: rule__ServiceType__Group__1__Impl rule__ServiceType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ServiceType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceType__Group__1"


    // $ANTLR start "rule__ServiceType__Group__1__Impl"
    // InternalRosNetworkDsl.g:2353:1: rule__ServiceType__Group__1__Impl : ( 'servicetype' ) ;
    public final void rule__ServiceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2357:1: ( ( 'servicetype' ) )
            // InternalRosNetworkDsl.g:2358:1: ( 'servicetype' )
            {
            // InternalRosNetworkDsl.g:2358:1: ( 'servicetype' )
            // InternalRosNetworkDsl.g:2359:2: 'servicetype'
            {
             before(grammarAccess.getServiceTypeAccess().getServicetypeKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getServiceTypeAccess().getServicetypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceType__Group__1__Impl"


    // $ANTLR start "rule__ServiceType__Group__2"
    // InternalRosNetworkDsl.g:2368:1: rule__ServiceType__Group__2 : rule__ServiceType__Group__2__Impl ;
    public final void rule__ServiceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2372:1: ( rule__ServiceType__Group__2__Impl )
            // InternalRosNetworkDsl.g:2373:2: rule__ServiceType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceType__Group__2"


    // $ANTLR start "rule__ServiceType__Group__2__Impl"
    // InternalRosNetworkDsl.g:2379:1: rule__ServiceType__Group__2__Impl : ( ( rule__ServiceType__NameAssignment_2 ) ) ;
    public final void rule__ServiceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2383:1: ( ( ( rule__ServiceType__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:2384:1: ( ( rule__ServiceType__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:2384:1: ( ( rule__ServiceType__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:2385:2: ( rule__ServiceType__NameAssignment_2 )
            {
             before(grammarAccess.getServiceTypeAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:2386:2: ( rule__ServiceType__NameAssignment_2 )
            // InternalRosNetworkDsl.g:2386:3: rule__ServiceType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ServiceType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceType__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalRosNetworkDsl.g:2395:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2399:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalRosNetworkDsl.g:2400:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalRosNetworkDsl.g:2407:1: rule__Service__Group__0__Impl : ( () ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2411:1: ( ( () ) )
            // InternalRosNetworkDsl.g:2412:1: ( () )
            {
            // InternalRosNetworkDsl.g:2412:1: ( () )
            // InternalRosNetworkDsl.g:2413:2: ()
            {
             before(grammarAccess.getServiceAccess().getServiceAction_0()); 
            // InternalRosNetworkDsl.g:2414:2: ()
            // InternalRosNetworkDsl.g:2414:3: 
            {
            }

             after(grammarAccess.getServiceAccess().getServiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalRosNetworkDsl.g:2422:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2426:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalRosNetworkDsl.g:2427:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalRosNetworkDsl.g:2434:1: rule__Service__Group__1__Impl : ( 'service' ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2438:1: ( ( 'service' ) )
            // InternalRosNetworkDsl.g:2439:1: ( 'service' )
            {
            // InternalRosNetworkDsl.g:2439:1: ( 'service' )
            // InternalRosNetworkDsl.g:2440:2: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalRosNetworkDsl.g:2449:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2453:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalRosNetworkDsl.g:2454:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalRosNetworkDsl.g:2461:1: rule__Service__Group__2__Impl : ( ( rule__Service__NameAssignment_2 ) ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2465:1: ( ( ( rule__Service__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:2466:1: ( ( rule__Service__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:2466:1: ( ( rule__Service__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:2467:2: ( rule__Service__NameAssignment_2 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:2468:2: ( rule__Service__NameAssignment_2 )
            // InternalRosNetworkDsl.g:2468:3: rule__Service__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalRosNetworkDsl.g:2476:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2480:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalRosNetworkDsl.g:2481:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalRosNetworkDsl.g:2488:1: rule__Service__Group__3__Impl : ( ':' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2492:1: ( ( ':' ) )
            // InternalRosNetworkDsl.g:2493:1: ( ':' )
            {
            // InternalRosNetworkDsl.g:2493:1: ( ':' )
            // InternalRosNetworkDsl.g:2494:2: ':'
            {
             before(grammarAccess.getServiceAccess().getColonKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalRosNetworkDsl.g:2503:1: rule__Service__Group__4 : rule__Service__Group__4__Impl ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2507:1: ( rule__Service__Group__4__Impl )
            // InternalRosNetworkDsl.g:2508:2: rule__Service__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalRosNetworkDsl.g:2514:1: rule__Service__Group__4__Impl : ( ( rule__Service__TypeAssignment_4 ) ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2518:1: ( ( ( rule__Service__TypeAssignment_4 ) ) )
            // InternalRosNetworkDsl.g:2519:1: ( ( rule__Service__TypeAssignment_4 ) )
            {
            // InternalRosNetworkDsl.g:2519:1: ( ( rule__Service__TypeAssignment_4 ) )
            // InternalRosNetworkDsl.g:2520:2: ( rule__Service__TypeAssignment_4 )
            {
             before(grammarAccess.getServiceAccess().getTypeAssignment_4()); 
            // InternalRosNetworkDsl.g:2521:2: ( rule__Service__TypeAssignment_4 )
            // InternalRosNetworkDsl.g:2521:3: rule__Service__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Service__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Topic__Group__0"
    // InternalRosNetworkDsl.g:2530:1: rule__Topic__Group__0 : rule__Topic__Group__0__Impl rule__Topic__Group__1 ;
    public final void rule__Topic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2534:1: ( rule__Topic__Group__0__Impl rule__Topic__Group__1 )
            // InternalRosNetworkDsl.g:2535:2: rule__Topic__Group__0__Impl rule__Topic__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Topic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__0"


    // $ANTLR start "rule__Topic__Group__0__Impl"
    // InternalRosNetworkDsl.g:2542:1: rule__Topic__Group__0__Impl : ( () ) ;
    public final void rule__Topic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2546:1: ( ( () ) )
            // InternalRosNetworkDsl.g:2547:1: ( () )
            {
            // InternalRosNetworkDsl.g:2547:1: ( () )
            // InternalRosNetworkDsl.g:2548:2: ()
            {
             before(grammarAccess.getTopicAccess().getTopicAction_0()); 
            // InternalRosNetworkDsl.g:2549:2: ()
            // InternalRosNetworkDsl.g:2549:3: 
            {
            }

             after(grammarAccess.getTopicAccess().getTopicAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__0__Impl"


    // $ANTLR start "rule__Topic__Group__1"
    // InternalRosNetworkDsl.g:2557:1: rule__Topic__Group__1 : rule__Topic__Group__1__Impl rule__Topic__Group__2 ;
    public final void rule__Topic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2561:1: ( rule__Topic__Group__1__Impl rule__Topic__Group__2 )
            // InternalRosNetworkDsl.g:2562:2: rule__Topic__Group__1__Impl rule__Topic__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Topic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__1"


    // $ANTLR start "rule__Topic__Group__1__Impl"
    // InternalRosNetworkDsl.g:2569:1: rule__Topic__Group__1__Impl : ( 'topic' ) ;
    public final void rule__Topic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2573:1: ( ( 'topic' ) )
            // InternalRosNetworkDsl.g:2574:1: ( 'topic' )
            {
            // InternalRosNetworkDsl.g:2574:1: ( 'topic' )
            // InternalRosNetworkDsl.g:2575:2: 'topic'
            {
             before(grammarAccess.getTopicAccess().getTopicKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getTopicKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__1__Impl"


    // $ANTLR start "rule__Topic__Group__2"
    // InternalRosNetworkDsl.g:2584:1: rule__Topic__Group__2 : rule__Topic__Group__2__Impl rule__Topic__Group__3 ;
    public final void rule__Topic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2588:1: ( rule__Topic__Group__2__Impl rule__Topic__Group__3 )
            // InternalRosNetworkDsl.g:2589:2: rule__Topic__Group__2__Impl rule__Topic__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Topic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__2"


    // $ANTLR start "rule__Topic__Group__2__Impl"
    // InternalRosNetworkDsl.g:2596:1: rule__Topic__Group__2__Impl : ( ( rule__Topic__NameAssignment_2 ) ) ;
    public final void rule__Topic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2600:1: ( ( ( rule__Topic__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:2601:1: ( ( rule__Topic__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:2601:1: ( ( rule__Topic__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:2602:2: ( rule__Topic__NameAssignment_2 )
            {
             before(grammarAccess.getTopicAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:2603:2: ( rule__Topic__NameAssignment_2 )
            // InternalRosNetworkDsl.g:2603:3: rule__Topic__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Topic__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__2__Impl"


    // $ANTLR start "rule__Topic__Group__3"
    // InternalRosNetworkDsl.g:2611:1: rule__Topic__Group__3 : rule__Topic__Group__3__Impl rule__Topic__Group__4 ;
    public final void rule__Topic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2615:1: ( rule__Topic__Group__3__Impl rule__Topic__Group__4 )
            // InternalRosNetworkDsl.g:2616:2: rule__Topic__Group__3__Impl rule__Topic__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Topic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__3"


    // $ANTLR start "rule__Topic__Group__3__Impl"
    // InternalRosNetworkDsl.g:2623:1: rule__Topic__Group__3__Impl : ( ':' ) ;
    public final void rule__Topic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2627:1: ( ( ':' ) )
            // InternalRosNetworkDsl.g:2628:1: ( ':' )
            {
            // InternalRosNetworkDsl.g:2628:1: ( ':' )
            // InternalRosNetworkDsl.g:2629:2: ':'
            {
             before(grammarAccess.getTopicAccess().getColonKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTopicAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__3__Impl"


    // $ANTLR start "rule__Topic__Group__4"
    // InternalRosNetworkDsl.g:2638:1: rule__Topic__Group__4 : rule__Topic__Group__4__Impl ;
    public final void rule__Topic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2642:1: ( rule__Topic__Group__4__Impl )
            // InternalRosNetworkDsl.g:2643:2: rule__Topic__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Topic__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__4"


    // $ANTLR start "rule__Topic__Group__4__Impl"
    // InternalRosNetworkDsl.g:2649:1: rule__Topic__Group__4__Impl : ( ( rule__Topic__TypeAssignment_4 ) ) ;
    public final void rule__Topic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2653:1: ( ( ( rule__Topic__TypeAssignment_4 ) ) )
            // InternalRosNetworkDsl.g:2654:1: ( ( rule__Topic__TypeAssignment_4 ) )
            {
            // InternalRosNetworkDsl.g:2654:1: ( ( rule__Topic__TypeAssignment_4 ) )
            // InternalRosNetworkDsl.g:2655:2: ( rule__Topic__TypeAssignment_4 )
            {
             before(grammarAccess.getTopicAccess().getTypeAssignment_4()); 
            // InternalRosNetworkDsl.g:2656:2: ( rule__Topic__TypeAssignment_4 )
            // InternalRosNetworkDsl.g:2656:3: rule__Topic__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Topic__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTopicAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__Group__4__Impl"


    // $ANTLR start "rule__BooleanParameter__Group__0"
    // InternalRosNetworkDsl.g:2665:1: rule__BooleanParameter__Group__0 : rule__BooleanParameter__Group__0__Impl rule__BooleanParameter__Group__1 ;
    public final void rule__BooleanParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2669:1: ( rule__BooleanParameter__Group__0__Impl rule__BooleanParameter__Group__1 )
            // InternalRosNetworkDsl.g:2670:2: rule__BooleanParameter__Group__0__Impl rule__BooleanParameter__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__BooleanParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group__0"


    // $ANTLR start "rule__BooleanParameter__Group__0__Impl"
    // InternalRosNetworkDsl.g:2677:1: rule__BooleanParameter__Group__0__Impl : ( () ) ;
    public final void rule__BooleanParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2681:1: ( ( () ) )
            // InternalRosNetworkDsl.g:2682:1: ( () )
            {
            // InternalRosNetworkDsl.g:2682:1: ( () )
            // InternalRosNetworkDsl.g:2683:2: ()
            {
             before(grammarAccess.getBooleanParameterAccess().getBooleanParameterAction_0()); 
            // InternalRosNetworkDsl.g:2684:2: ()
            // InternalRosNetworkDsl.g:2684:3: 
            {
            }

             after(grammarAccess.getBooleanParameterAccess().getBooleanParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group__0__Impl"


    // $ANTLR start "rule__BooleanParameter__Group__1"
    // InternalRosNetworkDsl.g:2692:1: rule__BooleanParameter__Group__1 : rule__BooleanParameter__Group__1__Impl rule__BooleanParameter__Group__2 ;
    public final void rule__BooleanParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2696:1: ( rule__BooleanParameter__Group__1__Impl rule__BooleanParameter__Group__2 )
            // InternalRosNetworkDsl.g:2697:2: rule__BooleanParameter__Group__1__Impl rule__BooleanParameter__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BooleanParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group__1"


    // $ANTLR start "rule__BooleanParameter__Group__1__Impl"
    // InternalRosNetworkDsl.g:2704:1: rule__BooleanParameter__Group__1__Impl : ( 'bool' ) ;
    public final void rule__BooleanParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2708:1: ( ( 'bool' ) )
            // InternalRosNetworkDsl.g:2709:1: ( 'bool' )
            {
            // InternalRosNetworkDsl.g:2709:1: ( 'bool' )
            // InternalRosNetworkDsl.g:2710:2: 'bool'
            {
             before(grammarAccess.getBooleanParameterAccess().getBoolKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBooleanParameterAccess().getBoolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group__1__Impl"


    // $ANTLR start "rule__BooleanParameter__Group__2"
    // InternalRosNetworkDsl.g:2719:1: rule__BooleanParameter__Group__2 : rule__BooleanParameter__Group__2__Impl rule__BooleanParameter__Group__3 ;
    public final void rule__BooleanParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2723:1: ( rule__BooleanParameter__Group__2__Impl rule__BooleanParameter__Group__3 )
            // InternalRosNetworkDsl.g:2724:2: rule__BooleanParameter__Group__2__Impl rule__BooleanParameter__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__BooleanParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanParameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group__2"


    // $ANTLR start "rule__BooleanParameter__Group__2__Impl"
    // InternalRosNetworkDsl.g:2731:1: rule__BooleanParameter__Group__2__Impl : ( ( rule__BooleanParameter__NameAssignment_2 ) ) ;
    public final void rule__BooleanParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2735:1: ( ( ( rule__BooleanParameter__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:2736:1: ( ( rule__BooleanParameter__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:2736:1: ( ( rule__BooleanParameter__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:2737:2: ( rule__BooleanParameter__NameAssignment_2 )
            {
             before(grammarAccess.getBooleanParameterAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:2738:2: ( rule__BooleanParameter__NameAssignment_2 )
            // InternalRosNetworkDsl.g:2738:3: rule__BooleanParameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanParameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group__2__Impl"


    // $ANTLR start "rule__BooleanParameter__Group__3"
    // InternalRosNetworkDsl.g:2746:1: rule__BooleanParameter__Group__3 : rule__BooleanParameter__Group__3__Impl rule__BooleanParameter__Group__4 ;
    public final void rule__BooleanParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2750:1: ( rule__BooleanParameter__Group__3__Impl rule__BooleanParameter__Group__4 )
            // InternalRosNetworkDsl.g:2751:2: rule__BooleanParameter__Group__3__Impl rule__BooleanParameter__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__BooleanParameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanParameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group__3"


    // $ANTLR start "rule__BooleanParameter__Group__3__Impl"
    // InternalRosNetworkDsl.g:2758:1: rule__BooleanParameter__Group__3__Impl : ( '=' ) ;
    public final void rule__BooleanParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2762:1: ( ( '=' ) )
            // InternalRosNetworkDsl.g:2763:1: ( '=' )
            {
            // InternalRosNetworkDsl.g:2763:1: ( '=' )
            // InternalRosNetworkDsl.g:2764:2: '='
            {
             before(grammarAccess.getBooleanParameterAccess().getEqualsSignKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBooleanParameterAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group__3__Impl"


    // $ANTLR start "rule__BooleanParameter__Group__4"
    // InternalRosNetworkDsl.g:2773:1: rule__BooleanParameter__Group__4 : rule__BooleanParameter__Group__4__Impl rule__BooleanParameter__Group__5 ;
    public final void rule__BooleanParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2777:1: ( rule__BooleanParameter__Group__4__Impl rule__BooleanParameter__Group__5 )
            // InternalRosNetworkDsl.g:2778:2: rule__BooleanParameter__Group__4__Impl rule__BooleanParameter__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__BooleanParameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanParameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group__4"


    // $ANTLR start "rule__BooleanParameter__Group__4__Impl"
    // InternalRosNetworkDsl.g:2785:1: rule__BooleanParameter__Group__4__Impl : ( ( rule__BooleanParameter__DefaultvalAssignment_4 ) ) ;
    public final void rule__BooleanParameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2789:1: ( ( ( rule__BooleanParameter__DefaultvalAssignment_4 ) ) )
            // InternalRosNetworkDsl.g:2790:1: ( ( rule__BooleanParameter__DefaultvalAssignment_4 ) )
            {
            // InternalRosNetworkDsl.g:2790:1: ( ( rule__BooleanParameter__DefaultvalAssignment_4 ) )
            // InternalRosNetworkDsl.g:2791:2: ( rule__BooleanParameter__DefaultvalAssignment_4 )
            {
             before(grammarAccess.getBooleanParameterAccess().getDefaultvalAssignment_4()); 
            // InternalRosNetworkDsl.g:2792:2: ( rule__BooleanParameter__DefaultvalAssignment_4 )
            // InternalRosNetworkDsl.g:2792:3: rule__BooleanParameter__DefaultvalAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BooleanParameter__DefaultvalAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBooleanParameterAccess().getDefaultvalAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group__4__Impl"


    // $ANTLR start "rule__BooleanParameter__Group__5"
    // InternalRosNetworkDsl.g:2800:1: rule__BooleanParameter__Group__5 : rule__BooleanParameter__Group__5__Impl ;
    public final void rule__BooleanParameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2804:1: ( rule__BooleanParameter__Group__5__Impl )
            // InternalRosNetworkDsl.g:2805:2: rule__BooleanParameter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanParameter__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group__5"


    // $ANTLR start "rule__BooleanParameter__Group__5__Impl"
    // InternalRosNetworkDsl.g:2811:1: rule__BooleanParameter__Group__5__Impl : ( ( rule__BooleanParameter__Group_5__0 )? ) ;
    public final void rule__BooleanParameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2815:1: ( ( ( rule__BooleanParameter__Group_5__0 )? ) )
            // InternalRosNetworkDsl.g:2816:1: ( ( rule__BooleanParameter__Group_5__0 )? )
            {
            // InternalRosNetworkDsl.g:2816:1: ( ( rule__BooleanParameter__Group_5__0 )? )
            // InternalRosNetworkDsl.g:2817:2: ( rule__BooleanParameter__Group_5__0 )?
            {
             before(grammarAccess.getBooleanParameterAccess().getGroup_5()); 
            // InternalRosNetworkDsl.g:2818:2: ( rule__BooleanParameter__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRosNetworkDsl.g:2818:3: rule__BooleanParameter__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanParameter__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanParameterAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group__5__Impl"


    // $ANTLR start "rule__BooleanParameter__Group_5__0"
    // InternalRosNetworkDsl.g:2827:1: rule__BooleanParameter__Group_5__0 : rule__BooleanParameter__Group_5__0__Impl rule__BooleanParameter__Group_5__1 ;
    public final void rule__BooleanParameter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2831:1: ( rule__BooleanParameter__Group_5__0__Impl rule__BooleanParameter__Group_5__1 )
            // InternalRosNetworkDsl.g:2832:2: rule__BooleanParameter__Group_5__0__Impl rule__BooleanParameter__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__BooleanParameter__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanParameter__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group_5__0"


    // $ANTLR start "rule__BooleanParameter__Group_5__0__Impl"
    // InternalRosNetworkDsl.g:2839:1: rule__BooleanParameter__Group_5__0__Impl : ( '->' ) ;
    public final void rule__BooleanParameter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2843:1: ( ( '->' ) )
            // InternalRosNetworkDsl.g:2844:1: ( '->' )
            {
            // InternalRosNetworkDsl.g:2844:1: ( '->' )
            // InternalRosNetworkDsl.g:2845:2: '->'
            {
             before(grammarAccess.getBooleanParameterAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBooleanParameterAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group_5__0__Impl"


    // $ANTLR start "rule__BooleanParameter__Group_5__1"
    // InternalRosNetworkDsl.g:2854:1: rule__BooleanParameter__Group_5__1 : rule__BooleanParameter__Group_5__1__Impl ;
    public final void rule__BooleanParameter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2858:1: ( rule__BooleanParameter__Group_5__1__Impl )
            // InternalRosNetworkDsl.g:2859:2: rule__BooleanParameter__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanParameter__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group_5__1"


    // $ANTLR start "rule__BooleanParameter__Group_5__1__Impl"
    // InternalRosNetworkDsl.g:2865:1: rule__BooleanParameter__Group_5__1__Impl : ( ( rule__BooleanParameter__TargetvarAssignment_5_1 ) ) ;
    public final void rule__BooleanParameter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2869:1: ( ( ( rule__BooleanParameter__TargetvarAssignment_5_1 ) ) )
            // InternalRosNetworkDsl.g:2870:1: ( ( rule__BooleanParameter__TargetvarAssignment_5_1 ) )
            {
            // InternalRosNetworkDsl.g:2870:1: ( ( rule__BooleanParameter__TargetvarAssignment_5_1 ) )
            // InternalRosNetworkDsl.g:2871:2: ( rule__BooleanParameter__TargetvarAssignment_5_1 )
            {
             before(grammarAccess.getBooleanParameterAccess().getTargetvarAssignment_5_1()); 
            // InternalRosNetworkDsl.g:2872:2: ( rule__BooleanParameter__TargetvarAssignment_5_1 )
            // InternalRosNetworkDsl.g:2872:3: rule__BooleanParameter__TargetvarAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanParameter__TargetvarAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanParameterAccess().getTargetvarAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__Group_5__1__Impl"


    // $ANTLR start "rule__IntegerParameter__Group__0"
    // InternalRosNetworkDsl.g:2881:1: rule__IntegerParameter__Group__0 : rule__IntegerParameter__Group__0__Impl rule__IntegerParameter__Group__1 ;
    public final void rule__IntegerParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2885:1: ( rule__IntegerParameter__Group__0__Impl rule__IntegerParameter__Group__1 )
            // InternalRosNetworkDsl.g:2886:2: rule__IntegerParameter__Group__0__Impl rule__IntegerParameter__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__IntegerParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__0"


    // $ANTLR start "rule__IntegerParameter__Group__0__Impl"
    // InternalRosNetworkDsl.g:2893:1: rule__IntegerParameter__Group__0__Impl : ( () ) ;
    public final void rule__IntegerParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2897:1: ( ( () ) )
            // InternalRosNetworkDsl.g:2898:1: ( () )
            {
            // InternalRosNetworkDsl.g:2898:1: ( () )
            // InternalRosNetworkDsl.g:2899:2: ()
            {
             before(grammarAccess.getIntegerParameterAccess().getIntegerParameterAction_0()); 
            // InternalRosNetworkDsl.g:2900:2: ()
            // InternalRosNetworkDsl.g:2900:3: 
            {
            }

             after(grammarAccess.getIntegerParameterAccess().getIntegerParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__0__Impl"


    // $ANTLR start "rule__IntegerParameter__Group__1"
    // InternalRosNetworkDsl.g:2908:1: rule__IntegerParameter__Group__1 : rule__IntegerParameter__Group__1__Impl rule__IntegerParameter__Group__2 ;
    public final void rule__IntegerParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2912:1: ( rule__IntegerParameter__Group__1__Impl rule__IntegerParameter__Group__2 )
            // InternalRosNetworkDsl.g:2913:2: rule__IntegerParameter__Group__1__Impl rule__IntegerParameter__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__IntegerParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__1"


    // $ANTLR start "rule__IntegerParameter__Group__1__Impl"
    // InternalRosNetworkDsl.g:2920:1: rule__IntegerParameter__Group__1__Impl : ( 'int' ) ;
    public final void rule__IntegerParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2924:1: ( ( 'int' ) )
            // InternalRosNetworkDsl.g:2925:1: ( 'int' )
            {
            // InternalRosNetworkDsl.g:2925:1: ( 'int' )
            // InternalRosNetworkDsl.g:2926:2: 'int'
            {
             before(grammarAccess.getIntegerParameterAccess().getIntKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getIntegerParameterAccess().getIntKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__1__Impl"


    // $ANTLR start "rule__IntegerParameter__Group__2"
    // InternalRosNetworkDsl.g:2935:1: rule__IntegerParameter__Group__2 : rule__IntegerParameter__Group__2__Impl rule__IntegerParameter__Group__3 ;
    public final void rule__IntegerParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2939:1: ( rule__IntegerParameter__Group__2__Impl rule__IntegerParameter__Group__3 )
            // InternalRosNetworkDsl.g:2940:2: rule__IntegerParameter__Group__2__Impl rule__IntegerParameter__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__IntegerParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__2"


    // $ANTLR start "rule__IntegerParameter__Group__2__Impl"
    // InternalRosNetworkDsl.g:2947:1: rule__IntegerParameter__Group__2__Impl : ( ( rule__IntegerParameter__NameAssignment_2 ) ) ;
    public final void rule__IntegerParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2951:1: ( ( ( rule__IntegerParameter__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:2952:1: ( ( rule__IntegerParameter__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:2952:1: ( ( rule__IntegerParameter__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:2953:2: ( rule__IntegerParameter__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerParameterAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:2954:2: ( rule__IntegerParameter__NameAssignment_2 )
            // InternalRosNetworkDsl.g:2954:3: rule__IntegerParameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IntegerParameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__2__Impl"


    // $ANTLR start "rule__IntegerParameter__Group__3"
    // InternalRosNetworkDsl.g:2962:1: rule__IntegerParameter__Group__3 : rule__IntegerParameter__Group__3__Impl rule__IntegerParameter__Group__4 ;
    public final void rule__IntegerParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2966:1: ( rule__IntegerParameter__Group__3__Impl rule__IntegerParameter__Group__4 )
            // InternalRosNetworkDsl.g:2967:2: rule__IntegerParameter__Group__3__Impl rule__IntegerParameter__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__IntegerParameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__3"


    // $ANTLR start "rule__IntegerParameter__Group__3__Impl"
    // InternalRosNetworkDsl.g:2974:1: rule__IntegerParameter__Group__3__Impl : ( '=' ) ;
    public final void rule__IntegerParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2978:1: ( ( '=' ) )
            // InternalRosNetworkDsl.g:2979:1: ( '=' )
            {
            // InternalRosNetworkDsl.g:2979:1: ( '=' )
            // InternalRosNetworkDsl.g:2980:2: '='
            {
             before(grammarAccess.getIntegerParameterAccess().getEqualsSignKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getIntegerParameterAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__3__Impl"


    // $ANTLR start "rule__IntegerParameter__Group__4"
    // InternalRosNetworkDsl.g:2989:1: rule__IntegerParameter__Group__4 : rule__IntegerParameter__Group__4__Impl rule__IntegerParameter__Group__5 ;
    public final void rule__IntegerParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:2993:1: ( rule__IntegerParameter__Group__4__Impl rule__IntegerParameter__Group__5 )
            // InternalRosNetworkDsl.g:2994:2: rule__IntegerParameter__Group__4__Impl rule__IntegerParameter__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__IntegerParameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__4"


    // $ANTLR start "rule__IntegerParameter__Group__4__Impl"
    // InternalRosNetworkDsl.g:3001:1: rule__IntegerParameter__Group__4__Impl : ( ( rule__IntegerParameter__DefaultvalAssignment_4 ) ) ;
    public final void rule__IntegerParameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3005:1: ( ( ( rule__IntegerParameter__DefaultvalAssignment_4 ) ) )
            // InternalRosNetworkDsl.g:3006:1: ( ( rule__IntegerParameter__DefaultvalAssignment_4 ) )
            {
            // InternalRosNetworkDsl.g:3006:1: ( ( rule__IntegerParameter__DefaultvalAssignment_4 ) )
            // InternalRosNetworkDsl.g:3007:2: ( rule__IntegerParameter__DefaultvalAssignment_4 )
            {
             before(grammarAccess.getIntegerParameterAccess().getDefaultvalAssignment_4()); 
            // InternalRosNetworkDsl.g:3008:2: ( rule__IntegerParameter__DefaultvalAssignment_4 )
            // InternalRosNetworkDsl.g:3008:3: rule__IntegerParameter__DefaultvalAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IntegerParameter__DefaultvalAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntegerParameterAccess().getDefaultvalAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__4__Impl"


    // $ANTLR start "rule__IntegerParameter__Group__5"
    // InternalRosNetworkDsl.g:3016:1: rule__IntegerParameter__Group__5 : rule__IntegerParameter__Group__5__Impl rule__IntegerParameter__Group__6 ;
    public final void rule__IntegerParameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3020:1: ( rule__IntegerParameter__Group__5__Impl rule__IntegerParameter__Group__6 )
            // InternalRosNetworkDsl.g:3021:2: rule__IntegerParameter__Group__5__Impl rule__IntegerParameter__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__IntegerParameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParameter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__5"


    // $ANTLR start "rule__IntegerParameter__Group__5__Impl"
    // InternalRosNetworkDsl.g:3028:1: rule__IntegerParameter__Group__5__Impl : ( '<' ) ;
    public final void rule__IntegerParameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3032:1: ( ( '<' ) )
            // InternalRosNetworkDsl.g:3033:1: ( '<' )
            {
            // InternalRosNetworkDsl.g:3033:1: ( '<' )
            // InternalRosNetworkDsl.g:3034:2: '<'
            {
             before(grammarAccess.getIntegerParameterAccess().getLessThanSignKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getIntegerParameterAccess().getLessThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__5__Impl"


    // $ANTLR start "rule__IntegerParameter__Group__6"
    // InternalRosNetworkDsl.g:3043:1: rule__IntegerParameter__Group__6 : rule__IntegerParameter__Group__6__Impl rule__IntegerParameter__Group__7 ;
    public final void rule__IntegerParameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3047:1: ( rule__IntegerParameter__Group__6__Impl rule__IntegerParameter__Group__7 )
            // InternalRosNetworkDsl.g:3048:2: rule__IntegerParameter__Group__6__Impl rule__IntegerParameter__Group__7
            {
            pushFollow(FOLLOW_37);
            rule__IntegerParameter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParameter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__6"


    // $ANTLR start "rule__IntegerParameter__Group__6__Impl"
    // InternalRosNetworkDsl.g:3055:1: rule__IntegerParameter__Group__6__Impl : ( ( rule__IntegerParameter__MinvalAssignment_6 ) ) ;
    public final void rule__IntegerParameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3059:1: ( ( ( rule__IntegerParameter__MinvalAssignment_6 ) ) )
            // InternalRosNetworkDsl.g:3060:1: ( ( rule__IntegerParameter__MinvalAssignment_6 ) )
            {
            // InternalRosNetworkDsl.g:3060:1: ( ( rule__IntegerParameter__MinvalAssignment_6 ) )
            // InternalRosNetworkDsl.g:3061:2: ( rule__IntegerParameter__MinvalAssignment_6 )
            {
             before(grammarAccess.getIntegerParameterAccess().getMinvalAssignment_6()); 
            // InternalRosNetworkDsl.g:3062:2: ( rule__IntegerParameter__MinvalAssignment_6 )
            // InternalRosNetworkDsl.g:3062:3: rule__IntegerParameter__MinvalAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__IntegerParameter__MinvalAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getIntegerParameterAccess().getMinvalAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__6__Impl"


    // $ANTLR start "rule__IntegerParameter__Group__7"
    // InternalRosNetworkDsl.g:3070:1: rule__IntegerParameter__Group__7 : rule__IntegerParameter__Group__7__Impl rule__IntegerParameter__Group__8 ;
    public final void rule__IntegerParameter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3074:1: ( rule__IntegerParameter__Group__7__Impl rule__IntegerParameter__Group__8 )
            // InternalRosNetworkDsl.g:3075:2: rule__IntegerParameter__Group__7__Impl rule__IntegerParameter__Group__8
            {
            pushFollow(FOLLOW_35);
            rule__IntegerParameter__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParameter__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__7"


    // $ANTLR start "rule__IntegerParameter__Group__7__Impl"
    // InternalRosNetworkDsl.g:3082:1: rule__IntegerParameter__Group__7__Impl : ( ',' ) ;
    public final void rule__IntegerParameter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3086:1: ( ( ',' ) )
            // InternalRosNetworkDsl.g:3087:1: ( ',' )
            {
            // InternalRosNetworkDsl.g:3087:1: ( ',' )
            // InternalRosNetworkDsl.g:3088:2: ','
            {
             before(grammarAccess.getIntegerParameterAccess().getCommaKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getIntegerParameterAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__7__Impl"


    // $ANTLR start "rule__IntegerParameter__Group__8"
    // InternalRosNetworkDsl.g:3097:1: rule__IntegerParameter__Group__8 : rule__IntegerParameter__Group__8__Impl rule__IntegerParameter__Group__9 ;
    public final void rule__IntegerParameter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3101:1: ( rule__IntegerParameter__Group__8__Impl rule__IntegerParameter__Group__9 )
            // InternalRosNetworkDsl.g:3102:2: rule__IntegerParameter__Group__8__Impl rule__IntegerParameter__Group__9
            {
            pushFollow(FOLLOW_38);
            rule__IntegerParameter__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParameter__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__8"


    // $ANTLR start "rule__IntegerParameter__Group__8__Impl"
    // InternalRosNetworkDsl.g:3109:1: rule__IntegerParameter__Group__8__Impl : ( ( rule__IntegerParameter__MaxvalAssignment_8 ) ) ;
    public final void rule__IntegerParameter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3113:1: ( ( ( rule__IntegerParameter__MaxvalAssignment_8 ) ) )
            // InternalRosNetworkDsl.g:3114:1: ( ( rule__IntegerParameter__MaxvalAssignment_8 ) )
            {
            // InternalRosNetworkDsl.g:3114:1: ( ( rule__IntegerParameter__MaxvalAssignment_8 ) )
            // InternalRosNetworkDsl.g:3115:2: ( rule__IntegerParameter__MaxvalAssignment_8 )
            {
             before(grammarAccess.getIntegerParameterAccess().getMaxvalAssignment_8()); 
            // InternalRosNetworkDsl.g:3116:2: ( rule__IntegerParameter__MaxvalAssignment_8 )
            // InternalRosNetworkDsl.g:3116:3: rule__IntegerParameter__MaxvalAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__IntegerParameter__MaxvalAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getIntegerParameterAccess().getMaxvalAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__8__Impl"


    // $ANTLR start "rule__IntegerParameter__Group__9"
    // InternalRosNetworkDsl.g:3124:1: rule__IntegerParameter__Group__9 : rule__IntegerParameter__Group__9__Impl rule__IntegerParameter__Group__10 ;
    public final void rule__IntegerParameter__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3128:1: ( rule__IntegerParameter__Group__9__Impl rule__IntegerParameter__Group__10 )
            // InternalRosNetworkDsl.g:3129:2: rule__IntegerParameter__Group__9__Impl rule__IntegerParameter__Group__10
            {
            pushFollow(FOLLOW_33);
            rule__IntegerParameter__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParameter__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__9"


    // $ANTLR start "rule__IntegerParameter__Group__9__Impl"
    // InternalRosNetworkDsl.g:3136:1: rule__IntegerParameter__Group__9__Impl : ( '>' ) ;
    public final void rule__IntegerParameter__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3140:1: ( ( '>' ) )
            // InternalRosNetworkDsl.g:3141:1: ( '>' )
            {
            // InternalRosNetworkDsl.g:3141:1: ( '>' )
            // InternalRosNetworkDsl.g:3142:2: '>'
            {
             before(grammarAccess.getIntegerParameterAccess().getGreaterThanSignKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getIntegerParameterAccess().getGreaterThanSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__9__Impl"


    // $ANTLR start "rule__IntegerParameter__Group__10"
    // InternalRosNetworkDsl.g:3151:1: rule__IntegerParameter__Group__10 : rule__IntegerParameter__Group__10__Impl ;
    public final void rule__IntegerParameter__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3155:1: ( rule__IntegerParameter__Group__10__Impl )
            // InternalRosNetworkDsl.g:3156:2: rule__IntegerParameter__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerParameter__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__10"


    // $ANTLR start "rule__IntegerParameter__Group__10__Impl"
    // InternalRosNetworkDsl.g:3162:1: rule__IntegerParameter__Group__10__Impl : ( ( rule__IntegerParameter__Group_10__0 )? ) ;
    public final void rule__IntegerParameter__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3166:1: ( ( ( rule__IntegerParameter__Group_10__0 )? ) )
            // InternalRosNetworkDsl.g:3167:1: ( ( rule__IntegerParameter__Group_10__0 )? )
            {
            // InternalRosNetworkDsl.g:3167:1: ( ( rule__IntegerParameter__Group_10__0 )? )
            // InternalRosNetworkDsl.g:3168:2: ( rule__IntegerParameter__Group_10__0 )?
            {
             before(grammarAccess.getIntegerParameterAccess().getGroup_10()); 
            // InternalRosNetworkDsl.g:3169:2: ( rule__IntegerParameter__Group_10__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRosNetworkDsl.g:3169:3: rule__IntegerParameter__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerParameter__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerParameterAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group__10__Impl"


    // $ANTLR start "rule__IntegerParameter__Group_10__0"
    // InternalRosNetworkDsl.g:3178:1: rule__IntegerParameter__Group_10__0 : rule__IntegerParameter__Group_10__0__Impl rule__IntegerParameter__Group_10__1 ;
    public final void rule__IntegerParameter__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3182:1: ( rule__IntegerParameter__Group_10__0__Impl rule__IntegerParameter__Group_10__1 )
            // InternalRosNetworkDsl.g:3183:2: rule__IntegerParameter__Group_10__0__Impl rule__IntegerParameter__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__IntegerParameter__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParameter__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group_10__0"


    // $ANTLR start "rule__IntegerParameter__Group_10__0__Impl"
    // InternalRosNetworkDsl.g:3190:1: rule__IntegerParameter__Group_10__0__Impl : ( '->' ) ;
    public final void rule__IntegerParameter__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3194:1: ( ( '->' ) )
            // InternalRosNetworkDsl.g:3195:1: ( '->' )
            {
            // InternalRosNetworkDsl.g:3195:1: ( '->' )
            // InternalRosNetworkDsl.g:3196:2: '->'
            {
             before(grammarAccess.getIntegerParameterAccess().getHyphenMinusGreaterThanSignKeyword_10_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIntegerParameterAccess().getHyphenMinusGreaterThanSignKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group_10__0__Impl"


    // $ANTLR start "rule__IntegerParameter__Group_10__1"
    // InternalRosNetworkDsl.g:3205:1: rule__IntegerParameter__Group_10__1 : rule__IntegerParameter__Group_10__1__Impl ;
    public final void rule__IntegerParameter__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3209:1: ( rule__IntegerParameter__Group_10__1__Impl )
            // InternalRosNetworkDsl.g:3210:2: rule__IntegerParameter__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerParameter__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group_10__1"


    // $ANTLR start "rule__IntegerParameter__Group_10__1__Impl"
    // InternalRosNetworkDsl.g:3216:1: rule__IntegerParameter__Group_10__1__Impl : ( ( rule__IntegerParameter__TargetvarAssignment_10_1 ) ) ;
    public final void rule__IntegerParameter__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3220:1: ( ( ( rule__IntegerParameter__TargetvarAssignment_10_1 ) ) )
            // InternalRosNetworkDsl.g:3221:1: ( ( rule__IntegerParameter__TargetvarAssignment_10_1 ) )
            {
            // InternalRosNetworkDsl.g:3221:1: ( ( rule__IntegerParameter__TargetvarAssignment_10_1 ) )
            // InternalRosNetworkDsl.g:3222:2: ( rule__IntegerParameter__TargetvarAssignment_10_1 )
            {
             before(grammarAccess.getIntegerParameterAccess().getTargetvarAssignment_10_1()); 
            // InternalRosNetworkDsl.g:3223:2: ( rule__IntegerParameter__TargetvarAssignment_10_1 )
            // InternalRosNetworkDsl.g:3223:3: rule__IntegerParameter__TargetvarAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerParameter__TargetvarAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerParameterAccess().getTargetvarAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__Group_10__1__Impl"


    // $ANTLR start "rule__DoubleParameter__Group__0"
    // InternalRosNetworkDsl.g:3232:1: rule__DoubleParameter__Group__0 : rule__DoubleParameter__Group__0__Impl rule__DoubleParameter__Group__1 ;
    public final void rule__DoubleParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3236:1: ( rule__DoubleParameter__Group__0__Impl rule__DoubleParameter__Group__1 )
            // InternalRosNetworkDsl.g:3237:2: rule__DoubleParameter__Group__0__Impl rule__DoubleParameter__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__DoubleParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__0"


    // $ANTLR start "rule__DoubleParameter__Group__0__Impl"
    // InternalRosNetworkDsl.g:3244:1: rule__DoubleParameter__Group__0__Impl : ( () ) ;
    public final void rule__DoubleParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3248:1: ( ( () ) )
            // InternalRosNetworkDsl.g:3249:1: ( () )
            {
            // InternalRosNetworkDsl.g:3249:1: ( () )
            // InternalRosNetworkDsl.g:3250:2: ()
            {
             before(grammarAccess.getDoubleParameterAccess().getDoubleParameterAction_0()); 
            // InternalRosNetworkDsl.g:3251:2: ()
            // InternalRosNetworkDsl.g:3251:3: 
            {
            }

             after(grammarAccess.getDoubleParameterAccess().getDoubleParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__0__Impl"


    // $ANTLR start "rule__DoubleParameter__Group__1"
    // InternalRosNetworkDsl.g:3259:1: rule__DoubleParameter__Group__1 : rule__DoubleParameter__Group__1__Impl rule__DoubleParameter__Group__2 ;
    public final void rule__DoubleParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3263:1: ( rule__DoubleParameter__Group__1__Impl rule__DoubleParameter__Group__2 )
            // InternalRosNetworkDsl.g:3264:2: rule__DoubleParameter__Group__1__Impl rule__DoubleParameter__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DoubleParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__1"


    // $ANTLR start "rule__DoubleParameter__Group__1__Impl"
    // InternalRosNetworkDsl.g:3271:1: rule__DoubleParameter__Group__1__Impl : ( 'double' ) ;
    public final void rule__DoubleParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3275:1: ( ( 'double' ) )
            // InternalRosNetworkDsl.g:3276:1: ( 'double' )
            {
            // InternalRosNetworkDsl.g:3276:1: ( 'double' )
            // InternalRosNetworkDsl.g:3277:2: 'double'
            {
             before(grammarAccess.getDoubleParameterAccess().getDoubleKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDoubleParameterAccess().getDoubleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__1__Impl"


    // $ANTLR start "rule__DoubleParameter__Group__2"
    // InternalRosNetworkDsl.g:3286:1: rule__DoubleParameter__Group__2 : rule__DoubleParameter__Group__2__Impl rule__DoubleParameter__Group__3 ;
    public final void rule__DoubleParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3290:1: ( rule__DoubleParameter__Group__2__Impl rule__DoubleParameter__Group__3 )
            // InternalRosNetworkDsl.g:3291:2: rule__DoubleParameter__Group__2__Impl rule__DoubleParameter__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__DoubleParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleParameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__2"


    // $ANTLR start "rule__DoubleParameter__Group__2__Impl"
    // InternalRosNetworkDsl.g:3298:1: rule__DoubleParameter__Group__2__Impl : ( ( rule__DoubleParameter__NameAssignment_2 ) ) ;
    public final void rule__DoubleParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3302:1: ( ( ( rule__DoubleParameter__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:3303:1: ( ( rule__DoubleParameter__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:3303:1: ( ( rule__DoubleParameter__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:3304:2: ( rule__DoubleParameter__NameAssignment_2 )
            {
             before(grammarAccess.getDoubleParameterAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:3305:2: ( rule__DoubleParameter__NameAssignment_2 )
            // InternalRosNetworkDsl.g:3305:3: rule__DoubleParameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DoubleParameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDoubleParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__2__Impl"


    // $ANTLR start "rule__DoubleParameter__Group__3"
    // InternalRosNetworkDsl.g:3313:1: rule__DoubleParameter__Group__3 : rule__DoubleParameter__Group__3__Impl rule__DoubleParameter__Group__4 ;
    public final void rule__DoubleParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3317:1: ( rule__DoubleParameter__Group__3__Impl rule__DoubleParameter__Group__4 )
            // InternalRosNetworkDsl.g:3318:2: rule__DoubleParameter__Group__3__Impl rule__DoubleParameter__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__DoubleParameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleParameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__3"


    // $ANTLR start "rule__DoubleParameter__Group__3__Impl"
    // InternalRosNetworkDsl.g:3325:1: rule__DoubleParameter__Group__3__Impl : ( '=' ) ;
    public final void rule__DoubleParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3329:1: ( ( '=' ) )
            // InternalRosNetworkDsl.g:3330:1: ( '=' )
            {
            // InternalRosNetworkDsl.g:3330:1: ( '=' )
            // InternalRosNetworkDsl.g:3331:2: '='
            {
             before(grammarAccess.getDoubleParameterAccess().getEqualsSignKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDoubleParameterAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__3__Impl"


    // $ANTLR start "rule__DoubleParameter__Group__4"
    // InternalRosNetworkDsl.g:3340:1: rule__DoubleParameter__Group__4 : rule__DoubleParameter__Group__4__Impl rule__DoubleParameter__Group__5 ;
    public final void rule__DoubleParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3344:1: ( rule__DoubleParameter__Group__4__Impl rule__DoubleParameter__Group__5 )
            // InternalRosNetworkDsl.g:3345:2: rule__DoubleParameter__Group__4__Impl rule__DoubleParameter__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__DoubleParameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleParameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__4"


    // $ANTLR start "rule__DoubleParameter__Group__4__Impl"
    // InternalRosNetworkDsl.g:3352:1: rule__DoubleParameter__Group__4__Impl : ( ( rule__DoubleParameter__DefaultvalAssignment_4 ) ) ;
    public final void rule__DoubleParameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3356:1: ( ( ( rule__DoubleParameter__DefaultvalAssignment_4 ) ) )
            // InternalRosNetworkDsl.g:3357:1: ( ( rule__DoubleParameter__DefaultvalAssignment_4 ) )
            {
            // InternalRosNetworkDsl.g:3357:1: ( ( rule__DoubleParameter__DefaultvalAssignment_4 ) )
            // InternalRosNetworkDsl.g:3358:2: ( rule__DoubleParameter__DefaultvalAssignment_4 )
            {
             before(grammarAccess.getDoubleParameterAccess().getDefaultvalAssignment_4()); 
            // InternalRosNetworkDsl.g:3359:2: ( rule__DoubleParameter__DefaultvalAssignment_4 )
            // InternalRosNetworkDsl.g:3359:3: rule__DoubleParameter__DefaultvalAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DoubleParameter__DefaultvalAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDoubleParameterAccess().getDefaultvalAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__4__Impl"


    // $ANTLR start "rule__DoubleParameter__Group__5"
    // InternalRosNetworkDsl.g:3367:1: rule__DoubleParameter__Group__5 : rule__DoubleParameter__Group__5__Impl rule__DoubleParameter__Group__6 ;
    public final void rule__DoubleParameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3371:1: ( rule__DoubleParameter__Group__5__Impl rule__DoubleParameter__Group__6 )
            // InternalRosNetworkDsl.g:3372:2: rule__DoubleParameter__Group__5__Impl rule__DoubleParameter__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__DoubleParameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleParameter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__5"


    // $ANTLR start "rule__DoubleParameter__Group__5__Impl"
    // InternalRosNetworkDsl.g:3379:1: rule__DoubleParameter__Group__5__Impl : ( '<' ) ;
    public final void rule__DoubleParameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3383:1: ( ( '<' ) )
            // InternalRosNetworkDsl.g:3384:1: ( '<' )
            {
            // InternalRosNetworkDsl.g:3384:1: ( '<' )
            // InternalRosNetworkDsl.g:3385:2: '<'
            {
             before(grammarAccess.getDoubleParameterAccess().getLessThanSignKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDoubleParameterAccess().getLessThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__5__Impl"


    // $ANTLR start "rule__DoubleParameter__Group__6"
    // InternalRosNetworkDsl.g:3394:1: rule__DoubleParameter__Group__6 : rule__DoubleParameter__Group__6__Impl rule__DoubleParameter__Group__7 ;
    public final void rule__DoubleParameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3398:1: ( rule__DoubleParameter__Group__6__Impl rule__DoubleParameter__Group__7 )
            // InternalRosNetworkDsl.g:3399:2: rule__DoubleParameter__Group__6__Impl rule__DoubleParameter__Group__7
            {
            pushFollow(FOLLOW_37);
            rule__DoubleParameter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleParameter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__6"


    // $ANTLR start "rule__DoubleParameter__Group__6__Impl"
    // InternalRosNetworkDsl.g:3406:1: rule__DoubleParameter__Group__6__Impl : ( ( rule__DoubleParameter__MinvalAssignment_6 ) ) ;
    public final void rule__DoubleParameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3410:1: ( ( ( rule__DoubleParameter__MinvalAssignment_6 ) ) )
            // InternalRosNetworkDsl.g:3411:1: ( ( rule__DoubleParameter__MinvalAssignment_6 ) )
            {
            // InternalRosNetworkDsl.g:3411:1: ( ( rule__DoubleParameter__MinvalAssignment_6 ) )
            // InternalRosNetworkDsl.g:3412:2: ( rule__DoubleParameter__MinvalAssignment_6 )
            {
             before(grammarAccess.getDoubleParameterAccess().getMinvalAssignment_6()); 
            // InternalRosNetworkDsl.g:3413:2: ( rule__DoubleParameter__MinvalAssignment_6 )
            // InternalRosNetworkDsl.g:3413:3: rule__DoubleParameter__MinvalAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DoubleParameter__MinvalAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDoubleParameterAccess().getMinvalAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__6__Impl"


    // $ANTLR start "rule__DoubleParameter__Group__7"
    // InternalRosNetworkDsl.g:3421:1: rule__DoubleParameter__Group__7 : rule__DoubleParameter__Group__7__Impl rule__DoubleParameter__Group__8 ;
    public final void rule__DoubleParameter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3425:1: ( rule__DoubleParameter__Group__7__Impl rule__DoubleParameter__Group__8 )
            // InternalRosNetworkDsl.g:3426:2: rule__DoubleParameter__Group__7__Impl rule__DoubleParameter__Group__8
            {
            pushFollow(FOLLOW_35);
            rule__DoubleParameter__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleParameter__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__7"


    // $ANTLR start "rule__DoubleParameter__Group__7__Impl"
    // InternalRosNetworkDsl.g:3433:1: rule__DoubleParameter__Group__7__Impl : ( ',' ) ;
    public final void rule__DoubleParameter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3437:1: ( ( ',' ) )
            // InternalRosNetworkDsl.g:3438:1: ( ',' )
            {
            // InternalRosNetworkDsl.g:3438:1: ( ',' )
            // InternalRosNetworkDsl.g:3439:2: ','
            {
             before(grammarAccess.getDoubleParameterAccess().getCommaKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDoubleParameterAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__7__Impl"


    // $ANTLR start "rule__DoubleParameter__Group__8"
    // InternalRosNetworkDsl.g:3448:1: rule__DoubleParameter__Group__8 : rule__DoubleParameter__Group__8__Impl rule__DoubleParameter__Group__9 ;
    public final void rule__DoubleParameter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3452:1: ( rule__DoubleParameter__Group__8__Impl rule__DoubleParameter__Group__9 )
            // InternalRosNetworkDsl.g:3453:2: rule__DoubleParameter__Group__8__Impl rule__DoubleParameter__Group__9
            {
            pushFollow(FOLLOW_38);
            rule__DoubleParameter__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleParameter__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__8"


    // $ANTLR start "rule__DoubleParameter__Group__8__Impl"
    // InternalRosNetworkDsl.g:3460:1: rule__DoubleParameter__Group__8__Impl : ( ( rule__DoubleParameter__MaxvalAssignment_8 ) ) ;
    public final void rule__DoubleParameter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3464:1: ( ( ( rule__DoubleParameter__MaxvalAssignment_8 ) ) )
            // InternalRosNetworkDsl.g:3465:1: ( ( rule__DoubleParameter__MaxvalAssignment_8 ) )
            {
            // InternalRosNetworkDsl.g:3465:1: ( ( rule__DoubleParameter__MaxvalAssignment_8 ) )
            // InternalRosNetworkDsl.g:3466:2: ( rule__DoubleParameter__MaxvalAssignment_8 )
            {
             before(grammarAccess.getDoubleParameterAccess().getMaxvalAssignment_8()); 
            // InternalRosNetworkDsl.g:3467:2: ( rule__DoubleParameter__MaxvalAssignment_8 )
            // InternalRosNetworkDsl.g:3467:3: rule__DoubleParameter__MaxvalAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__DoubleParameter__MaxvalAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDoubleParameterAccess().getMaxvalAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__8__Impl"


    // $ANTLR start "rule__DoubleParameter__Group__9"
    // InternalRosNetworkDsl.g:3475:1: rule__DoubleParameter__Group__9 : rule__DoubleParameter__Group__9__Impl rule__DoubleParameter__Group__10 ;
    public final void rule__DoubleParameter__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3479:1: ( rule__DoubleParameter__Group__9__Impl rule__DoubleParameter__Group__10 )
            // InternalRosNetworkDsl.g:3480:2: rule__DoubleParameter__Group__9__Impl rule__DoubleParameter__Group__10
            {
            pushFollow(FOLLOW_33);
            rule__DoubleParameter__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleParameter__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__9"


    // $ANTLR start "rule__DoubleParameter__Group__9__Impl"
    // InternalRosNetworkDsl.g:3487:1: rule__DoubleParameter__Group__9__Impl : ( '>' ) ;
    public final void rule__DoubleParameter__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3491:1: ( ( '>' ) )
            // InternalRosNetworkDsl.g:3492:1: ( '>' )
            {
            // InternalRosNetworkDsl.g:3492:1: ( '>' )
            // InternalRosNetworkDsl.g:3493:2: '>'
            {
             before(grammarAccess.getDoubleParameterAccess().getGreaterThanSignKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDoubleParameterAccess().getGreaterThanSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__9__Impl"


    // $ANTLR start "rule__DoubleParameter__Group__10"
    // InternalRosNetworkDsl.g:3502:1: rule__DoubleParameter__Group__10 : rule__DoubleParameter__Group__10__Impl ;
    public final void rule__DoubleParameter__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3506:1: ( rule__DoubleParameter__Group__10__Impl )
            // InternalRosNetworkDsl.g:3507:2: rule__DoubleParameter__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleParameter__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__10"


    // $ANTLR start "rule__DoubleParameter__Group__10__Impl"
    // InternalRosNetworkDsl.g:3513:1: rule__DoubleParameter__Group__10__Impl : ( ( rule__DoubleParameter__Group_10__0 )? ) ;
    public final void rule__DoubleParameter__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3517:1: ( ( ( rule__DoubleParameter__Group_10__0 )? ) )
            // InternalRosNetworkDsl.g:3518:1: ( ( rule__DoubleParameter__Group_10__0 )? )
            {
            // InternalRosNetworkDsl.g:3518:1: ( ( rule__DoubleParameter__Group_10__0 )? )
            // InternalRosNetworkDsl.g:3519:2: ( rule__DoubleParameter__Group_10__0 )?
            {
             before(grammarAccess.getDoubleParameterAccess().getGroup_10()); 
            // InternalRosNetworkDsl.g:3520:2: ( rule__DoubleParameter__Group_10__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRosNetworkDsl.g:3520:3: rule__DoubleParameter__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleParameter__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoubleParameterAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group__10__Impl"


    // $ANTLR start "rule__DoubleParameter__Group_10__0"
    // InternalRosNetworkDsl.g:3529:1: rule__DoubleParameter__Group_10__0 : rule__DoubleParameter__Group_10__0__Impl rule__DoubleParameter__Group_10__1 ;
    public final void rule__DoubleParameter__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3533:1: ( rule__DoubleParameter__Group_10__0__Impl rule__DoubleParameter__Group_10__1 )
            // InternalRosNetworkDsl.g:3534:2: rule__DoubleParameter__Group_10__0__Impl rule__DoubleParameter__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__DoubleParameter__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleParameter__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group_10__0"


    // $ANTLR start "rule__DoubleParameter__Group_10__0__Impl"
    // InternalRosNetworkDsl.g:3541:1: rule__DoubleParameter__Group_10__0__Impl : ( '->' ) ;
    public final void rule__DoubleParameter__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3545:1: ( ( '->' ) )
            // InternalRosNetworkDsl.g:3546:1: ( '->' )
            {
            // InternalRosNetworkDsl.g:3546:1: ( '->' )
            // InternalRosNetworkDsl.g:3547:2: '->'
            {
             before(grammarAccess.getDoubleParameterAccess().getHyphenMinusGreaterThanSignKeyword_10_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDoubleParameterAccess().getHyphenMinusGreaterThanSignKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group_10__0__Impl"


    // $ANTLR start "rule__DoubleParameter__Group_10__1"
    // InternalRosNetworkDsl.g:3556:1: rule__DoubleParameter__Group_10__1 : rule__DoubleParameter__Group_10__1__Impl ;
    public final void rule__DoubleParameter__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3560:1: ( rule__DoubleParameter__Group_10__1__Impl )
            // InternalRosNetworkDsl.g:3561:2: rule__DoubleParameter__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleParameter__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group_10__1"


    // $ANTLR start "rule__DoubleParameter__Group_10__1__Impl"
    // InternalRosNetworkDsl.g:3567:1: rule__DoubleParameter__Group_10__1__Impl : ( ( rule__DoubleParameter__TargetvarAssignment_10_1 ) ) ;
    public final void rule__DoubleParameter__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3571:1: ( ( ( rule__DoubleParameter__TargetvarAssignment_10_1 ) ) )
            // InternalRosNetworkDsl.g:3572:1: ( ( rule__DoubleParameter__TargetvarAssignment_10_1 ) )
            {
            // InternalRosNetworkDsl.g:3572:1: ( ( rule__DoubleParameter__TargetvarAssignment_10_1 ) )
            // InternalRosNetworkDsl.g:3573:2: ( rule__DoubleParameter__TargetvarAssignment_10_1 )
            {
             before(grammarAccess.getDoubleParameterAccess().getTargetvarAssignment_10_1()); 
            // InternalRosNetworkDsl.g:3574:2: ( rule__DoubleParameter__TargetvarAssignment_10_1 )
            // InternalRosNetworkDsl.g:3574:3: rule__DoubleParameter__TargetvarAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__DoubleParameter__TargetvarAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getDoubleParameterAccess().getTargetvarAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__Group_10__1__Impl"


    // $ANTLR start "rule__NodeParameterGroup__Group__0"
    // InternalRosNetworkDsl.g:3583:1: rule__NodeParameterGroup__Group__0 : rule__NodeParameterGroup__Group__0__Impl rule__NodeParameterGroup__Group__1 ;
    public final void rule__NodeParameterGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3587:1: ( rule__NodeParameterGroup__Group__0__Impl rule__NodeParameterGroup__Group__1 )
            // InternalRosNetworkDsl.g:3588:2: rule__NodeParameterGroup__Group__0__Impl rule__NodeParameterGroup__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__NodeParameterGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__0"


    // $ANTLR start "rule__NodeParameterGroup__Group__0__Impl"
    // InternalRosNetworkDsl.g:3595:1: rule__NodeParameterGroup__Group__0__Impl : ( () ) ;
    public final void rule__NodeParameterGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3599:1: ( ( () ) )
            // InternalRosNetworkDsl.g:3600:1: ( () )
            {
            // InternalRosNetworkDsl.g:3600:1: ( () )
            // InternalRosNetworkDsl.g:3601:2: ()
            {
             before(grammarAccess.getNodeParameterGroupAccess().getNodeParameterGroupAction_0()); 
            // InternalRosNetworkDsl.g:3602:2: ()
            // InternalRosNetworkDsl.g:3602:3: 
            {
            }

             after(grammarAccess.getNodeParameterGroupAccess().getNodeParameterGroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__0__Impl"


    // $ANTLR start "rule__NodeParameterGroup__Group__1"
    // InternalRosNetworkDsl.g:3610:1: rule__NodeParameterGroup__Group__1 : rule__NodeParameterGroup__Group__1__Impl rule__NodeParameterGroup__Group__2 ;
    public final void rule__NodeParameterGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3614:1: ( rule__NodeParameterGroup__Group__1__Impl rule__NodeParameterGroup__Group__2 )
            // InternalRosNetworkDsl.g:3615:2: rule__NodeParameterGroup__Group__1__Impl rule__NodeParameterGroup__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NodeParameterGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__1"


    // $ANTLR start "rule__NodeParameterGroup__Group__1__Impl"
    // InternalRosNetworkDsl.g:3622:1: rule__NodeParameterGroup__Group__1__Impl : ( 'parametergroup' ) ;
    public final void rule__NodeParameterGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3626:1: ( ( 'parametergroup' ) )
            // InternalRosNetworkDsl.g:3627:1: ( 'parametergroup' )
            {
            // InternalRosNetworkDsl.g:3627:1: ( 'parametergroup' )
            // InternalRosNetworkDsl.g:3628:2: 'parametergroup'
            {
             before(grammarAccess.getNodeParameterGroupAccess().getParametergroupKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getNodeParameterGroupAccess().getParametergroupKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__1__Impl"


    // $ANTLR start "rule__NodeParameterGroup__Group__2"
    // InternalRosNetworkDsl.g:3637:1: rule__NodeParameterGroup__Group__2 : rule__NodeParameterGroup__Group__2__Impl rule__NodeParameterGroup__Group__3 ;
    public final void rule__NodeParameterGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3641:1: ( rule__NodeParameterGroup__Group__2__Impl rule__NodeParameterGroup__Group__3 )
            // InternalRosNetworkDsl.g:3642:2: rule__NodeParameterGroup__Group__2__Impl rule__NodeParameterGroup__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__NodeParameterGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__2"


    // $ANTLR start "rule__NodeParameterGroup__Group__2__Impl"
    // InternalRosNetworkDsl.g:3649:1: rule__NodeParameterGroup__Group__2__Impl : ( ( rule__NodeParameterGroup__NameAssignment_2 ) ) ;
    public final void rule__NodeParameterGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3653:1: ( ( ( rule__NodeParameterGroup__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:3654:1: ( ( rule__NodeParameterGroup__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:3654:1: ( ( rule__NodeParameterGroup__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:3655:2: ( rule__NodeParameterGroup__NameAssignment_2 )
            {
             before(grammarAccess.getNodeParameterGroupAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:3656:2: ( rule__NodeParameterGroup__NameAssignment_2 )
            // InternalRosNetworkDsl.g:3656:3: rule__NodeParameterGroup__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeParameterGroupAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__2__Impl"


    // $ANTLR start "rule__NodeParameterGroup__Group__3"
    // InternalRosNetworkDsl.g:3664:1: rule__NodeParameterGroup__Group__3 : rule__NodeParameterGroup__Group__3__Impl rule__NodeParameterGroup__Group__4 ;
    public final void rule__NodeParameterGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3668:1: ( rule__NodeParameterGroup__Group__3__Impl rule__NodeParameterGroup__Group__4 )
            // InternalRosNetworkDsl.g:3669:2: rule__NodeParameterGroup__Group__3__Impl rule__NodeParameterGroup__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__NodeParameterGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__3"


    // $ANTLR start "rule__NodeParameterGroup__Group__3__Impl"
    // InternalRosNetworkDsl.g:3676:1: rule__NodeParameterGroup__Group__3__Impl : ( ( rule__NodeParameterGroup__Group_3__0 )? ) ;
    public final void rule__NodeParameterGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3680:1: ( ( ( rule__NodeParameterGroup__Group_3__0 )? ) )
            // InternalRosNetworkDsl.g:3681:1: ( ( rule__NodeParameterGroup__Group_3__0 )? )
            {
            // InternalRosNetworkDsl.g:3681:1: ( ( rule__NodeParameterGroup__Group_3__0 )? )
            // InternalRosNetworkDsl.g:3682:2: ( rule__NodeParameterGroup__Group_3__0 )?
            {
             before(grammarAccess.getNodeParameterGroupAccess().getGroup_3()); 
            // InternalRosNetworkDsl.g:3683:2: ( rule__NodeParameterGroup__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRosNetworkDsl.g:3683:3: rule__NodeParameterGroup__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeParameterGroup__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeParameterGroupAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__3__Impl"


    // $ANTLR start "rule__NodeParameterGroup__Group__4"
    // InternalRosNetworkDsl.g:3691:1: rule__NodeParameterGroup__Group__4 : rule__NodeParameterGroup__Group__4__Impl rule__NodeParameterGroup__Group__5 ;
    public final void rule__NodeParameterGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3695:1: ( rule__NodeParameterGroup__Group__4__Impl rule__NodeParameterGroup__Group__5 )
            // InternalRosNetworkDsl.g:3696:2: rule__NodeParameterGroup__Group__4__Impl rule__NodeParameterGroup__Group__5
            {
            pushFollow(FOLLOW_41);
            rule__NodeParameterGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__4"


    // $ANTLR start "rule__NodeParameterGroup__Group__4__Impl"
    // InternalRosNetworkDsl.g:3703:1: rule__NodeParameterGroup__Group__4__Impl : ( ( rule__NodeParameterGroup__Group_4__0 )? ) ;
    public final void rule__NodeParameterGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3707:1: ( ( ( rule__NodeParameterGroup__Group_4__0 )? ) )
            // InternalRosNetworkDsl.g:3708:1: ( ( rule__NodeParameterGroup__Group_4__0 )? )
            {
            // InternalRosNetworkDsl.g:3708:1: ( ( rule__NodeParameterGroup__Group_4__0 )? )
            // InternalRosNetworkDsl.g:3709:2: ( rule__NodeParameterGroup__Group_4__0 )?
            {
             before(grammarAccess.getNodeParameterGroupAccess().getGroup_4()); 
            // InternalRosNetworkDsl.g:3710:2: ( rule__NodeParameterGroup__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRosNetworkDsl.g:3710:3: rule__NodeParameterGroup__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeParameterGroup__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeParameterGroupAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__4__Impl"


    // $ANTLR start "rule__NodeParameterGroup__Group__5"
    // InternalRosNetworkDsl.g:3718:1: rule__NodeParameterGroup__Group__5 : rule__NodeParameterGroup__Group__5__Impl rule__NodeParameterGroup__Group__6 ;
    public final void rule__NodeParameterGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3722:1: ( rule__NodeParameterGroup__Group__5__Impl rule__NodeParameterGroup__Group__6 )
            // InternalRosNetworkDsl.g:3723:2: rule__NodeParameterGroup__Group__5__Impl rule__NodeParameterGroup__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__NodeParameterGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__5"


    // $ANTLR start "rule__NodeParameterGroup__Group__5__Impl"
    // InternalRosNetworkDsl.g:3730:1: rule__NodeParameterGroup__Group__5__Impl : ( '{' ) ;
    public final void rule__NodeParameterGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3734:1: ( ( '{' ) )
            // InternalRosNetworkDsl.g:3735:1: ( '{' )
            {
            // InternalRosNetworkDsl.g:3735:1: ( '{' )
            // InternalRosNetworkDsl.g:3736:2: '{'
            {
             before(grammarAccess.getNodeParameterGroupAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNodeParameterGroupAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__5__Impl"


    // $ANTLR start "rule__NodeParameterGroup__Group__6"
    // InternalRosNetworkDsl.g:3745:1: rule__NodeParameterGroup__Group__6 : rule__NodeParameterGroup__Group__6__Impl rule__NodeParameterGroup__Group__7 ;
    public final void rule__NodeParameterGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3749:1: ( rule__NodeParameterGroup__Group__6__Impl rule__NodeParameterGroup__Group__7 )
            // InternalRosNetworkDsl.g:3750:2: rule__NodeParameterGroup__Group__6__Impl rule__NodeParameterGroup__Group__7
            {
            pushFollow(FOLLOW_43);
            rule__NodeParameterGroup__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__6"


    // $ANTLR start "rule__NodeParameterGroup__Group__6__Impl"
    // InternalRosNetworkDsl.g:3757:1: rule__NodeParameterGroup__Group__6__Impl : ( ( rule__NodeParameterGroup__NodeparameterAssignment_6 ) ) ;
    public final void rule__NodeParameterGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3761:1: ( ( ( rule__NodeParameterGroup__NodeparameterAssignment_6 ) ) )
            // InternalRosNetworkDsl.g:3762:1: ( ( rule__NodeParameterGroup__NodeparameterAssignment_6 ) )
            {
            // InternalRosNetworkDsl.g:3762:1: ( ( rule__NodeParameterGroup__NodeparameterAssignment_6 ) )
            // InternalRosNetworkDsl.g:3763:2: ( rule__NodeParameterGroup__NodeparameterAssignment_6 )
            {
             before(grammarAccess.getNodeParameterGroupAccess().getNodeparameterAssignment_6()); 
            // InternalRosNetworkDsl.g:3764:2: ( rule__NodeParameterGroup__NodeparameterAssignment_6 )
            // InternalRosNetworkDsl.g:3764:3: rule__NodeParameterGroup__NodeparameterAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__NodeparameterAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getNodeParameterGroupAccess().getNodeparameterAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__6__Impl"


    // $ANTLR start "rule__NodeParameterGroup__Group__7"
    // InternalRosNetworkDsl.g:3772:1: rule__NodeParameterGroup__Group__7 : rule__NodeParameterGroup__Group__7__Impl rule__NodeParameterGroup__Group__8 ;
    public final void rule__NodeParameterGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3776:1: ( rule__NodeParameterGroup__Group__7__Impl rule__NodeParameterGroup__Group__8 )
            // InternalRosNetworkDsl.g:3777:2: rule__NodeParameterGroup__Group__7__Impl rule__NodeParameterGroup__Group__8
            {
            pushFollow(FOLLOW_43);
            rule__NodeParameterGroup__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__7"


    // $ANTLR start "rule__NodeParameterGroup__Group__7__Impl"
    // InternalRosNetworkDsl.g:3784:1: rule__NodeParameterGroup__Group__7__Impl : ( ( rule__NodeParameterGroup__NodeparameterAssignment_7 )* ) ;
    public final void rule__NodeParameterGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3788:1: ( ( ( rule__NodeParameterGroup__NodeparameterAssignment_7 )* ) )
            // InternalRosNetworkDsl.g:3789:1: ( ( rule__NodeParameterGroup__NodeparameterAssignment_7 )* )
            {
            // InternalRosNetworkDsl.g:3789:1: ( ( rule__NodeParameterGroup__NodeparameterAssignment_7 )* )
            // InternalRosNetworkDsl.g:3790:2: ( rule__NodeParameterGroup__NodeparameterAssignment_7 )*
            {
             before(grammarAccess.getNodeParameterGroupAccess().getNodeparameterAssignment_7()); 
            // InternalRosNetworkDsl.g:3791:2: ( rule__NodeParameterGroup__NodeparameterAssignment_7 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33||LA25_0==36||LA25_0==39) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:3791:3: rule__NodeParameterGroup__NodeparameterAssignment_7
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__NodeParameterGroup__NodeparameterAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getNodeParameterGroupAccess().getNodeparameterAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__7__Impl"


    // $ANTLR start "rule__NodeParameterGroup__Group__8"
    // InternalRosNetworkDsl.g:3799:1: rule__NodeParameterGroup__Group__8 : rule__NodeParameterGroup__Group__8__Impl ;
    public final void rule__NodeParameterGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3803:1: ( rule__NodeParameterGroup__Group__8__Impl )
            // InternalRosNetworkDsl.g:3804:2: rule__NodeParameterGroup__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__8"


    // $ANTLR start "rule__NodeParameterGroup__Group__8__Impl"
    // InternalRosNetworkDsl.g:3810:1: rule__NodeParameterGroup__Group__8__Impl : ( '}' ) ;
    public final void rule__NodeParameterGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3814:1: ( ( '}' ) )
            // InternalRosNetworkDsl.g:3815:1: ( '}' )
            {
            // InternalRosNetworkDsl.g:3815:1: ( '}' )
            // InternalRosNetworkDsl.g:3816:2: '}'
            {
             before(grammarAccess.getNodeParameterGroupAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNodeParameterGroupAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group__8__Impl"


    // $ANTLR start "rule__NodeParameterGroup__Group_3__0"
    // InternalRosNetworkDsl.g:3826:1: rule__NodeParameterGroup__Group_3__0 : rule__NodeParameterGroup__Group_3__0__Impl rule__NodeParameterGroup__Group_3__1 ;
    public final void rule__NodeParameterGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3830:1: ( rule__NodeParameterGroup__Group_3__0__Impl rule__NodeParameterGroup__Group_3__1 )
            // InternalRosNetworkDsl.g:3831:2: rule__NodeParameterGroup__Group_3__0__Impl rule__NodeParameterGroup__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__NodeParameterGroup__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group_3__0"


    // $ANTLR start "rule__NodeParameterGroup__Group_3__0__Impl"
    // InternalRosNetworkDsl.g:3838:1: rule__NodeParameterGroup__Group_3__0__Impl : ( 'configobject' ) ;
    public final void rule__NodeParameterGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3842:1: ( ( 'configobject' ) )
            // InternalRosNetworkDsl.g:3843:1: ( 'configobject' )
            {
            // InternalRosNetworkDsl.g:3843:1: ( 'configobject' )
            // InternalRosNetworkDsl.g:3844:2: 'configobject'
            {
             before(grammarAccess.getNodeParameterGroupAccess().getConfigobjectKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNodeParameterGroupAccess().getConfigobjectKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group_3__0__Impl"


    // $ANTLR start "rule__NodeParameterGroup__Group_3__1"
    // InternalRosNetworkDsl.g:3853:1: rule__NodeParameterGroup__Group_3__1 : rule__NodeParameterGroup__Group_3__1__Impl ;
    public final void rule__NodeParameterGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3857:1: ( rule__NodeParameterGroup__Group_3__1__Impl )
            // InternalRosNetworkDsl.g:3858:2: rule__NodeParameterGroup__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group_3__1"


    // $ANTLR start "rule__NodeParameterGroup__Group_3__1__Impl"
    // InternalRosNetworkDsl.g:3864:1: rule__NodeParameterGroup__Group_3__1__Impl : ( ( rule__NodeParameterGroup__Config_objAssignment_3_1 ) ) ;
    public final void rule__NodeParameterGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3868:1: ( ( ( rule__NodeParameterGroup__Config_objAssignment_3_1 ) ) )
            // InternalRosNetworkDsl.g:3869:1: ( ( rule__NodeParameterGroup__Config_objAssignment_3_1 ) )
            {
            // InternalRosNetworkDsl.g:3869:1: ( ( rule__NodeParameterGroup__Config_objAssignment_3_1 ) )
            // InternalRosNetworkDsl.g:3870:2: ( rule__NodeParameterGroup__Config_objAssignment_3_1 )
            {
             before(grammarAccess.getNodeParameterGroupAccess().getConfig_objAssignment_3_1()); 
            // InternalRosNetworkDsl.g:3871:2: ( rule__NodeParameterGroup__Config_objAssignment_3_1 )
            // InternalRosNetworkDsl.g:3871:3: rule__NodeParameterGroup__Config_objAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Config_objAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeParameterGroupAccess().getConfig_objAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group_3__1__Impl"


    // $ANTLR start "rule__NodeParameterGroup__Group_4__0"
    // InternalRosNetworkDsl.g:3880:1: rule__NodeParameterGroup__Group_4__0 : rule__NodeParameterGroup__Group_4__0__Impl rule__NodeParameterGroup__Group_4__1 ;
    public final void rule__NodeParameterGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3884:1: ( rule__NodeParameterGroup__Group_4__0__Impl rule__NodeParameterGroup__Group_4__1 )
            // InternalRosNetworkDsl.g:3885:2: rule__NodeParameterGroup__Group_4__0__Impl rule__NodeParameterGroup__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__NodeParameterGroup__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group_4__0"


    // $ANTLR start "rule__NodeParameterGroup__Group_4__0__Impl"
    // InternalRosNetworkDsl.g:3892:1: rule__NodeParameterGroup__Group_4__0__Impl : ( 'generate' ) ;
    public final void rule__NodeParameterGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3896:1: ( ( 'generate' ) )
            // InternalRosNetworkDsl.g:3897:1: ( 'generate' )
            {
            // InternalRosNetworkDsl.g:3897:1: ( 'generate' )
            // InternalRosNetworkDsl.g:3898:2: 'generate'
            {
             before(grammarAccess.getNodeParameterGroupAccess().getGenerateKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getNodeParameterGroupAccess().getGenerateKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group_4__0__Impl"


    // $ANTLR start "rule__NodeParameterGroup__Group_4__1"
    // InternalRosNetworkDsl.g:3907:1: rule__NodeParameterGroup__Group_4__1 : rule__NodeParameterGroup__Group_4__1__Impl ;
    public final void rule__NodeParameterGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3911:1: ( rule__NodeParameterGroup__Group_4__1__Impl )
            // InternalRosNetworkDsl.g:3912:2: rule__NodeParameterGroup__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group_4__1"


    // $ANTLR start "rule__NodeParameterGroup__Group_4__1__Impl"
    // InternalRosNetworkDsl.g:3918:1: rule__NodeParameterGroup__Group_4__1__Impl : ( ( rule__NodeParameterGroup__Generate_structAssignment_4_1 ) ) ;
    public final void rule__NodeParameterGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3922:1: ( ( ( rule__NodeParameterGroup__Generate_structAssignment_4_1 ) ) )
            // InternalRosNetworkDsl.g:3923:1: ( ( rule__NodeParameterGroup__Generate_structAssignment_4_1 ) )
            {
            // InternalRosNetworkDsl.g:3923:1: ( ( rule__NodeParameterGroup__Generate_structAssignment_4_1 ) )
            // InternalRosNetworkDsl.g:3924:2: ( rule__NodeParameterGroup__Generate_structAssignment_4_1 )
            {
             before(grammarAccess.getNodeParameterGroupAccess().getGenerate_structAssignment_4_1()); 
            // InternalRosNetworkDsl.g:3925:2: ( rule__NodeParameterGroup__Generate_structAssignment_4_1 )
            // InternalRosNetworkDsl.g:3925:3: rule__NodeParameterGroup__Generate_structAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeParameterGroup__Generate_structAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeParameterGroupAccess().getGenerate_structAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Group_4__1__Impl"


    // $ANTLR start "rule__Library__Group__0"
    // InternalRosNetworkDsl.g:3934:1: rule__Library__Group__0 : rule__Library__Group__0__Impl rule__Library__Group__1 ;
    public final void rule__Library__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3938:1: ( rule__Library__Group__0__Impl rule__Library__Group__1 )
            // InternalRosNetworkDsl.g:3939:2: rule__Library__Group__0__Impl rule__Library__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Library__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__0"


    // $ANTLR start "rule__Library__Group__0__Impl"
    // InternalRosNetworkDsl.g:3946:1: rule__Library__Group__0__Impl : ( () ) ;
    public final void rule__Library__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3950:1: ( ( () ) )
            // InternalRosNetworkDsl.g:3951:1: ( () )
            {
            // InternalRosNetworkDsl.g:3951:1: ( () )
            // InternalRosNetworkDsl.g:3952:2: ()
            {
             before(grammarAccess.getLibraryAccess().getTemplateNodeAction_0()); 
            // InternalRosNetworkDsl.g:3953:2: ()
            // InternalRosNetworkDsl.g:3953:3: 
            {
            }

             after(grammarAccess.getLibraryAccess().getTemplateNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__0__Impl"


    // $ANTLR start "rule__Library__Group__1"
    // InternalRosNetworkDsl.g:3961:1: rule__Library__Group__1 : rule__Library__Group__1__Impl rule__Library__Group__2 ;
    public final void rule__Library__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3965:1: ( rule__Library__Group__1__Impl rule__Library__Group__2 )
            // InternalRosNetworkDsl.g:3966:2: rule__Library__Group__1__Impl rule__Library__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Library__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__1"


    // $ANTLR start "rule__Library__Group__1__Impl"
    // InternalRosNetworkDsl.g:3973:1: rule__Library__Group__1__Impl : ( 'templatenode' ) ;
    public final void rule__Library__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3977:1: ( ( 'templatenode' ) )
            // InternalRosNetworkDsl.g:3978:1: ( 'templatenode' )
            {
            // InternalRosNetworkDsl.g:3978:1: ( 'templatenode' )
            // InternalRosNetworkDsl.g:3979:2: 'templatenode'
            {
             before(grammarAccess.getLibraryAccess().getTemplatenodeKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getTemplatenodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__1__Impl"


    // $ANTLR start "rule__Library__Group__2"
    // InternalRosNetworkDsl.g:3988:1: rule__Library__Group__2 : rule__Library__Group__2__Impl rule__Library__Group__3 ;
    public final void rule__Library__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:3992:1: ( rule__Library__Group__2__Impl rule__Library__Group__3 )
            // InternalRosNetworkDsl.g:3993:2: rule__Library__Group__2__Impl rule__Library__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__Library__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__2"


    // $ANTLR start "rule__Library__Group__2__Impl"
    // InternalRosNetworkDsl.g:4000:1: rule__Library__Group__2__Impl : ( ( rule__Library__NameAssignment_2 ) ) ;
    public final void rule__Library__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4004:1: ( ( ( rule__Library__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:4005:1: ( ( rule__Library__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:4005:1: ( ( rule__Library__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:4006:2: ( rule__Library__NameAssignment_2 )
            {
             before(grammarAccess.getLibraryAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:4007:2: ( rule__Library__NameAssignment_2 )
            // InternalRosNetworkDsl.g:4007:3: rule__Library__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Library__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__2__Impl"


    // $ANTLR start "rule__Library__Group__3"
    // InternalRosNetworkDsl.g:4015:1: rule__Library__Group__3 : rule__Library__Group__3__Impl rule__Library__Group__4 ;
    public final void rule__Library__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4019:1: ( rule__Library__Group__3__Impl rule__Library__Group__4 )
            // InternalRosNetworkDsl.g:4020:2: rule__Library__Group__3__Impl rule__Library__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Library__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__3"


    // $ANTLR start "rule__Library__Group__3__Impl"
    // InternalRosNetworkDsl.g:4027:1: rule__Library__Group__3__Impl : ( 'namespace' ) ;
    public final void rule__Library__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4031:1: ( ( 'namespace' ) )
            // InternalRosNetworkDsl.g:4032:1: ( 'namespace' )
            {
            // InternalRosNetworkDsl.g:4032:1: ( 'namespace' )
            // InternalRosNetworkDsl.g:4033:2: 'namespace'
            {
             before(grammarAccess.getLibraryAccess().getNamespaceKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getNamespaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__3__Impl"


    // $ANTLR start "rule__Library__Group__4"
    // InternalRosNetworkDsl.g:4042:1: rule__Library__Group__4 : rule__Library__Group__4__Impl rule__Library__Group__5 ;
    public final void rule__Library__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4046:1: ( rule__Library__Group__4__Impl rule__Library__Group__5 )
            // InternalRosNetworkDsl.g:4047:2: rule__Library__Group__4__Impl rule__Library__Group__5
            {
            pushFollow(FOLLOW_47);
            rule__Library__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__4"


    // $ANTLR start "rule__Library__Group__4__Impl"
    // InternalRosNetworkDsl.g:4054:1: rule__Library__Group__4__Impl : ( ( rule__Library__NamespaceAssignment_4 ) ) ;
    public final void rule__Library__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4058:1: ( ( ( rule__Library__NamespaceAssignment_4 ) ) )
            // InternalRosNetworkDsl.g:4059:1: ( ( rule__Library__NamespaceAssignment_4 ) )
            {
            // InternalRosNetworkDsl.g:4059:1: ( ( rule__Library__NamespaceAssignment_4 ) )
            // InternalRosNetworkDsl.g:4060:2: ( rule__Library__NamespaceAssignment_4 )
            {
             before(grammarAccess.getLibraryAccess().getNamespaceAssignment_4()); 
            // InternalRosNetworkDsl.g:4061:2: ( rule__Library__NamespaceAssignment_4 )
            // InternalRosNetworkDsl.g:4061:3: rule__Library__NamespaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Library__NamespaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getNamespaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__4__Impl"


    // $ANTLR start "rule__Library__Group__5"
    // InternalRosNetworkDsl.g:4069:1: rule__Library__Group__5 : rule__Library__Group__5__Impl rule__Library__Group__6 ;
    public final void rule__Library__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4073:1: ( rule__Library__Group__5__Impl rule__Library__Group__6 )
            // InternalRosNetworkDsl.g:4074:2: rule__Library__Group__5__Impl rule__Library__Group__6
            {
            pushFollow(FOLLOW_47);
            rule__Library__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__5"


    // $ANTLR start "rule__Library__Group__5__Impl"
    // InternalRosNetworkDsl.g:4081:1: rule__Library__Group__5__Impl : ( ( rule__Library__Group_5__0 )? ) ;
    public final void rule__Library__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4085:1: ( ( ( rule__Library__Group_5__0 )? ) )
            // InternalRosNetworkDsl.g:4086:1: ( ( rule__Library__Group_5__0 )? )
            {
            // InternalRosNetworkDsl.g:4086:1: ( ( rule__Library__Group_5__0 )? )
            // InternalRosNetworkDsl.g:4087:2: ( rule__Library__Group_5__0 )?
            {
             before(grammarAccess.getLibraryAccess().getGroup_5()); 
            // InternalRosNetworkDsl.g:4088:2: ( rule__Library__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRosNetworkDsl.g:4088:3: rule__Library__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Library__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__5__Impl"


    // $ANTLR start "rule__Library__Group__6"
    // InternalRosNetworkDsl.g:4096:1: rule__Library__Group__6 : rule__Library__Group__6__Impl rule__Library__Group__7 ;
    public final void rule__Library__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4100:1: ( rule__Library__Group__6__Impl rule__Library__Group__7 )
            // InternalRosNetworkDsl.g:4101:2: rule__Library__Group__6__Impl rule__Library__Group__7
            {
            pushFollow(FOLLOW_47);
            rule__Library__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__6"


    // $ANTLR start "rule__Library__Group__6__Impl"
    // InternalRosNetworkDsl.g:4108:1: rule__Library__Group__6__Impl : ( ( rule__Library__GenerateartifactAssignment_6 )? ) ;
    public final void rule__Library__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4112:1: ( ( ( rule__Library__GenerateartifactAssignment_6 )? ) )
            // InternalRosNetworkDsl.g:4113:1: ( ( rule__Library__GenerateartifactAssignment_6 )? )
            {
            // InternalRosNetworkDsl.g:4113:1: ( ( rule__Library__GenerateartifactAssignment_6 )? )
            // InternalRosNetworkDsl.g:4114:2: ( rule__Library__GenerateartifactAssignment_6 )?
            {
             before(grammarAccess.getLibraryAccess().getGenerateartifactAssignment_6()); 
            // InternalRosNetworkDsl.g:4115:2: ( rule__Library__GenerateartifactAssignment_6 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRosNetworkDsl.g:4115:3: rule__Library__GenerateartifactAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Library__GenerateartifactAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryAccess().getGenerateartifactAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__6__Impl"


    // $ANTLR start "rule__Library__Group__7"
    // InternalRosNetworkDsl.g:4123:1: rule__Library__Group__7 : rule__Library__Group__7__Impl rule__Library__Group__8 ;
    public final void rule__Library__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4127:1: ( rule__Library__Group__7__Impl rule__Library__Group__8 )
            // InternalRosNetworkDsl.g:4128:2: rule__Library__Group__7__Impl rule__Library__Group__8
            {
            pushFollow(FOLLOW_48);
            rule__Library__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__7"


    // $ANTLR start "rule__Library__Group__7__Impl"
    // InternalRosNetworkDsl.g:4135:1: rule__Library__Group__7__Impl : ( '{' ) ;
    public final void rule__Library__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4139:1: ( ( '{' ) )
            // InternalRosNetworkDsl.g:4140:1: ( '{' )
            {
            // InternalRosNetworkDsl.g:4140:1: ( '{' )
            // InternalRosNetworkDsl.g:4141:2: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__7__Impl"


    // $ANTLR start "rule__Library__Group__8"
    // InternalRosNetworkDsl.g:4150:1: rule__Library__Group__8 : rule__Library__Group__8__Impl rule__Library__Group__9 ;
    public final void rule__Library__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4154:1: ( rule__Library__Group__8__Impl rule__Library__Group__9 )
            // InternalRosNetworkDsl.g:4155:2: rule__Library__Group__8__Impl rule__Library__Group__9
            {
            pushFollow(FOLLOW_49);
            rule__Library__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__8"


    // $ANTLR start "rule__Library__Group__8__Impl"
    // InternalRosNetworkDsl.g:4162:1: rule__Library__Group__8__Impl : ( 'language' ) ;
    public final void rule__Library__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4166:1: ( ( 'language' ) )
            // InternalRosNetworkDsl.g:4167:1: ( 'language' )
            {
            // InternalRosNetworkDsl.g:4167:1: ( 'language' )
            // InternalRosNetworkDsl.g:4168:2: 'language'
            {
             before(grammarAccess.getLibraryAccess().getLanguageKeyword_8()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getLanguageKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__8__Impl"


    // $ANTLR start "rule__Library__Group__9"
    // InternalRosNetworkDsl.g:4177:1: rule__Library__Group__9 : rule__Library__Group__9__Impl rule__Library__Group__10 ;
    public final void rule__Library__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4181:1: ( rule__Library__Group__9__Impl rule__Library__Group__10 )
            // InternalRosNetworkDsl.g:4182:2: rule__Library__Group__9__Impl rule__Library__Group__10
            {
            pushFollow(FOLLOW_50);
            rule__Library__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__9"


    // $ANTLR start "rule__Library__Group__9__Impl"
    // InternalRosNetworkDsl.g:4189:1: rule__Library__Group__9__Impl : ( ( rule__Library__LanguageAssignment_9 ) ) ;
    public final void rule__Library__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4193:1: ( ( ( rule__Library__LanguageAssignment_9 ) ) )
            // InternalRosNetworkDsl.g:4194:1: ( ( rule__Library__LanguageAssignment_9 ) )
            {
            // InternalRosNetworkDsl.g:4194:1: ( ( rule__Library__LanguageAssignment_9 ) )
            // InternalRosNetworkDsl.g:4195:2: ( rule__Library__LanguageAssignment_9 )
            {
             before(grammarAccess.getLibraryAccess().getLanguageAssignment_9()); 
            // InternalRosNetworkDsl.g:4196:2: ( rule__Library__LanguageAssignment_9 )
            // InternalRosNetworkDsl.g:4196:3: rule__Library__LanguageAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Library__LanguageAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getLanguageAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__9__Impl"


    // $ANTLR start "rule__Library__Group__10"
    // InternalRosNetworkDsl.g:4204:1: rule__Library__Group__10 : rule__Library__Group__10__Impl rule__Library__Group__11 ;
    public final void rule__Library__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4208:1: ( rule__Library__Group__10__Impl rule__Library__Group__11 )
            // InternalRosNetworkDsl.g:4209:2: rule__Library__Group__10__Impl rule__Library__Group__11
            {
            pushFollow(FOLLOW_50);
            rule__Library__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__10"


    // $ANTLR start "rule__Library__Group__10__Impl"
    // InternalRosNetworkDsl.g:4216:1: rule__Library__Group__10__Impl : ( ( rule__Library__Group_10__0 )* ) ;
    public final void rule__Library__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4220:1: ( ( ( rule__Library__Group_10__0 )* ) )
            // InternalRosNetworkDsl.g:4221:1: ( ( rule__Library__Group_10__0 )* )
            {
            // InternalRosNetworkDsl.g:4221:1: ( ( rule__Library__Group_10__0 )* )
            // InternalRosNetworkDsl.g:4222:2: ( rule__Library__Group_10__0 )*
            {
             before(grammarAccess.getLibraryAccess().getGroup_10()); 
            // InternalRosNetworkDsl.g:4223:2: ( rule__Library__Group_10__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:4223:3: rule__Library__Group_10__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Library__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getLibraryAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__10__Impl"


    // $ANTLR start "rule__Library__Group__11"
    // InternalRosNetworkDsl.g:4231:1: rule__Library__Group__11 : rule__Library__Group__11__Impl rule__Library__Group__12 ;
    public final void rule__Library__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4235:1: ( rule__Library__Group__11__Impl rule__Library__Group__12 )
            // InternalRosNetworkDsl.g:4236:2: rule__Library__Group__11__Impl rule__Library__Group__12
            {
            pushFollow(FOLLOW_50);
            rule__Library__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__11"


    // $ANTLR start "rule__Library__Group__11__Impl"
    // InternalRosNetworkDsl.g:4243:1: rule__Library__Group__11__Impl : ( ( rule__Library__Group_11__0 )? ) ;
    public final void rule__Library__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4247:1: ( ( ( rule__Library__Group_11__0 )? ) )
            // InternalRosNetworkDsl.g:4248:1: ( ( rule__Library__Group_11__0 )? )
            {
            // InternalRosNetworkDsl.g:4248:1: ( ( rule__Library__Group_11__0 )? )
            // InternalRosNetworkDsl.g:4249:2: ( rule__Library__Group_11__0 )?
            {
             before(grammarAccess.getLibraryAccess().getGroup_11()); 
            // InternalRosNetworkDsl.g:4250:2: ( rule__Library__Group_11__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRosNetworkDsl.g:4250:3: rule__Library__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Library__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__11__Impl"


    // $ANTLR start "rule__Library__Group__12"
    // InternalRosNetworkDsl.g:4258:1: rule__Library__Group__12 : rule__Library__Group__12__Impl rule__Library__Group__13 ;
    public final void rule__Library__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4262:1: ( rule__Library__Group__12__Impl rule__Library__Group__13 )
            // InternalRosNetworkDsl.g:4263:2: rule__Library__Group__12__Impl rule__Library__Group__13
            {
            pushFollow(FOLLOW_50);
            rule__Library__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__12"


    // $ANTLR start "rule__Library__Group__12__Impl"
    // InternalRosNetworkDsl.g:4270:1: rule__Library__Group__12__Impl : ( ( rule__Library__Group_12__0 )? ) ;
    public final void rule__Library__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4274:1: ( ( ( rule__Library__Group_12__0 )? ) )
            // InternalRosNetworkDsl.g:4275:1: ( ( rule__Library__Group_12__0 )? )
            {
            // InternalRosNetworkDsl.g:4275:1: ( ( rule__Library__Group_12__0 )? )
            // InternalRosNetworkDsl.g:4276:2: ( rule__Library__Group_12__0 )?
            {
             before(grammarAccess.getLibraryAccess().getGroup_12()); 
            // InternalRosNetworkDsl.g:4277:2: ( rule__Library__Group_12__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRosNetworkDsl.g:4277:3: rule__Library__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Library__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__12__Impl"


    // $ANTLR start "rule__Library__Group__13"
    // InternalRosNetworkDsl.g:4285:1: rule__Library__Group__13 : rule__Library__Group__13__Impl rule__Library__Group__14 ;
    public final void rule__Library__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4289:1: ( rule__Library__Group__13__Impl rule__Library__Group__14 )
            // InternalRosNetworkDsl.g:4290:2: rule__Library__Group__13__Impl rule__Library__Group__14
            {
            pushFollow(FOLLOW_50);
            rule__Library__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__13"


    // $ANTLR start "rule__Library__Group__13__Impl"
    // InternalRosNetworkDsl.g:4297:1: rule__Library__Group__13__Impl : ( ( rule__Library__Group_13__0 )? ) ;
    public final void rule__Library__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4301:1: ( ( ( rule__Library__Group_13__0 )? ) )
            // InternalRosNetworkDsl.g:4302:1: ( ( rule__Library__Group_13__0 )? )
            {
            // InternalRosNetworkDsl.g:4302:1: ( ( rule__Library__Group_13__0 )? )
            // InternalRosNetworkDsl.g:4303:2: ( rule__Library__Group_13__0 )?
            {
             before(grammarAccess.getLibraryAccess().getGroup_13()); 
            // InternalRosNetworkDsl.g:4304:2: ( rule__Library__Group_13__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRosNetworkDsl.g:4304:3: rule__Library__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Library__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__13__Impl"


    // $ANTLR start "rule__Library__Group__14"
    // InternalRosNetworkDsl.g:4312:1: rule__Library__Group__14 : rule__Library__Group__14__Impl ;
    public final void rule__Library__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4316:1: ( rule__Library__Group__14__Impl )
            // InternalRosNetworkDsl.g:4317:2: rule__Library__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__14"


    // $ANTLR start "rule__Library__Group__14__Impl"
    // InternalRosNetworkDsl.g:4323:1: rule__Library__Group__14__Impl : ( '}' ) ;
    public final void rule__Library__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4327:1: ( ( '}' ) )
            // InternalRosNetworkDsl.g:4328:1: ( '}' )
            {
            // InternalRosNetworkDsl.g:4328:1: ( '}' )
            // InternalRosNetworkDsl.g:4329:2: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_14()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__14__Impl"


    // $ANTLR start "rule__Library__Group_5__0"
    // InternalRosNetworkDsl.g:4339:1: rule__Library__Group_5__0 : rule__Library__Group_5__0__Impl rule__Library__Group_5__1 ;
    public final void rule__Library__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4343:1: ( rule__Library__Group_5__0__Impl rule__Library__Group_5__1 )
            // InternalRosNetworkDsl.g:4344:2: rule__Library__Group_5__0__Impl rule__Library__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Library__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5__0"


    // $ANTLR start "rule__Library__Group_5__0__Impl"
    // InternalRosNetworkDsl.g:4351:1: rule__Library__Group_5__0__Impl : ( 'implements' ) ;
    public final void rule__Library__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4355:1: ( ( 'implements' ) )
            // InternalRosNetworkDsl.g:4356:1: ( 'implements' )
            {
            // InternalRosNetworkDsl.g:4356:1: ( 'implements' )
            // InternalRosNetworkDsl.g:4357:2: 'implements'
            {
             before(grammarAccess.getLibraryAccess().getImplementsKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getImplementsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5__0__Impl"


    // $ANTLR start "rule__Library__Group_5__1"
    // InternalRosNetworkDsl.g:4366:1: rule__Library__Group_5__1 : rule__Library__Group_5__1__Impl ;
    public final void rule__Library__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4370:1: ( rule__Library__Group_5__1__Impl )
            // InternalRosNetworkDsl.g:4371:2: rule__Library__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5__1"


    // $ANTLR start "rule__Library__Group_5__1__Impl"
    // InternalRosNetworkDsl.g:4377:1: rule__Library__Group_5__1__Impl : ( ( rule__Library__ImplementsAssignment_5_1 ) ) ;
    public final void rule__Library__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4381:1: ( ( ( rule__Library__ImplementsAssignment_5_1 ) ) )
            // InternalRosNetworkDsl.g:4382:1: ( ( rule__Library__ImplementsAssignment_5_1 ) )
            {
            // InternalRosNetworkDsl.g:4382:1: ( ( rule__Library__ImplementsAssignment_5_1 ) )
            // InternalRosNetworkDsl.g:4383:2: ( rule__Library__ImplementsAssignment_5_1 )
            {
             before(grammarAccess.getLibraryAccess().getImplementsAssignment_5_1()); 
            // InternalRosNetworkDsl.g:4384:2: ( rule__Library__ImplementsAssignment_5_1 )
            // InternalRosNetworkDsl.g:4384:3: rule__Library__ImplementsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Library__ImplementsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getImplementsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5__1__Impl"


    // $ANTLR start "rule__Library__Group_10__0"
    // InternalRosNetworkDsl.g:4393:1: rule__Library__Group_10__0 : rule__Library__Group_10__0__Impl rule__Library__Group_10__1 ;
    public final void rule__Library__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4397:1: ( rule__Library__Group_10__0__Impl rule__Library__Group_10__1 )
            // InternalRosNetworkDsl.g:4398:2: rule__Library__Group_10__0__Impl rule__Library__Group_10__1
            {
            pushFollow(FOLLOW_49);
            rule__Library__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_10__0"


    // $ANTLR start "rule__Library__Group_10__0__Impl"
    // InternalRosNetworkDsl.g:4405:1: rule__Library__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Library__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4409:1: ( ( ',' ) )
            // InternalRosNetworkDsl.g:4410:1: ( ',' )
            {
            // InternalRosNetworkDsl.g:4410:1: ( ',' )
            // InternalRosNetworkDsl.g:4411:2: ','
            {
             before(grammarAccess.getLibraryAccess().getCommaKeyword_10_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_10__0__Impl"


    // $ANTLR start "rule__Library__Group_10__1"
    // InternalRosNetworkDsl.g:4420:1: rule__Library__Group_10__1 : rule__Library__Group_10__1__Impl ;
    public final void rule__Library__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4424:1: ( rule__Library__Group_10__1__Impl )
            // InternalRosNetworkDsl.g:4425:2: rule__Library__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_10__1"


    // $ANTLR start "rule__Library__Group_10__1__Impl"
    // InternalRosNetworkDsl.g:4431:1: rule__Library__Group_10__1__Impl : ( ( rule__Library__LanguageAssignment_10_1 ) ) ;
    public final void rule__Library__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4435:1: ( ( ( rule__Library__LanguageAssignment_10_1 ) ) )
            // InternalRosNetworkDsl.g:4436:1: ( ( rule__Library__LanguageAssignment_10_1 ) )
            {
            // InternalRosNetworkDsl.g:4436:1: ( ( rule__Library__LanguageAssignment_10_1 ) )
            // InternalRosNetworkDsl.g:4437:2: ( rule__Library__LanguageAssignment_10_1 )
            {
             before(grammarAccess.getLibraryAccess().getLanguageAssignment_10_1()); 
            // InternalRosNetworkDsl.g:4438:2: ( rule__Library__LanguageAssignment_10_1 )
            // InternalRosNetworkDsl.g:4438:3: rule__Library__LanguageAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Library__LanguageAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getLanguageAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_10__1__Impl"


    // $ANTLR start "rule__Library__Group_11__0"
    // InternalRosNetworkDsl.g:4447:1: rule__Library__Group_11__0 : rule__Library__Group_11__0__Impl rule__Library__Group_11__1 ;
    public final void rule__Library__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4451:1: ( rule__Library__Group_11__0__Impl rule__Library__Group_11__1 )
            // InternalRosNetworkDsl.g:4452:2: rule__Library__Group_11__0__Impl rule__Library__Group_11__1
            {
            pushFollow(FOLLOW_5);
            rule__Library__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_11__0"


    // $ANTLR start "rule__Library__Group_11__0__Impl"
    // InternalRosNetworkDsl.g:4459:1: rule__Library__Group_11__0__Impl : ( 'parameters' ) ;
    public final void rule__Library__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4463:1: ( ( 'parameters' ) )
            // InternalRosNetworkDsl.g:4464:1: ( 'parameters' )
            {
            // InternalRosNetworkDsl.g:4464:1: ( 'parameters' )
            // InternalRosNetworkDsl.g:4465:2: 'parameters'
            {
             before(grammarAccess.getLibraryAccess().getParametersKeyword_11_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getParametersKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_11__0__Impl"


    // $ANTLR start "rule__Library__Group_11__1"
    // InternalRosNetworkDsl.g:4474:1: rule__Library__Group_11__1 : rule__Library__Group_11__1__Impl rule__Library__Group_11__2 ;
    public final void rule__Library__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4478:1: ( rule__Library__Group_11__1__Impl rule__Library__Group_11__2 )
            // InternalRosNetworkDsl.g:4479:2: rule__Library__Group_11__1__Impl rule__Library__Group_11__2
            {
            pushFollow(FOLLOW_51);
            rule__Library__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_11__1"


    // $ANTLR start "rule__Library__Group_11__1__Impl"
    // InternalRosNetworkDsl.g:4486:1: rule__Library__Group_11__1__Impl : ( '{' ) ;
    public final void rule__Library__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4490:1: ( ( '{' ) )
            // InternalRosNetworkDsl.g:4491:1: ( '{' )
            {
            // InternalRosNetworkDsl.g:4491:1: ( '{' )
            // InternalRosNetworkDsl.g:4492:2: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_11__1__Impl"


    // $ANTLR start "rule__Library__Group_11__2"
    // InternalRosNetworkDsl.g:4501:1: rule__Library__Group_11__2 : rule__Library__Group_11__2__Impl rule__Library__Group_11__3 ;
    public final void rule__Library__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4505:1: ( rule__Library__Group_11__2__Impl rule__Library__Group_11__3 )
            // InternalRosNetworkDsl.g:4506:2: rule__Library__Group_11__2__Impl rule__Library__Group_11__3
            {
            pushFollow(FOLLOW_52);
            rule__Library__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_11__2"


    // $ANTLR start "rule__Library__Group_11__2__Impl"
    // InternalRosNetworkDsl.g:4513:1: rule__Library__Group_11__2__Impl : ( ( rule__Library__NodeparametersAssignment_11_2 ) ) ;
    public final void rule__Library__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4517:1: ( ( ( rule__Library__NodeparametersAssignment_11_2 ) ) )
            // InternalRosNetworkDsl.g:4518:1: ( ( rule__Library__NodeparametersAssignment_11_2 ) )
            {
            // InternalRosNetworkDsl.g:4518:1: ( ( rule__Library__NodeparametersAssignment_11_2 ) )
            // InternalRosNetworkDsl.g:4519:2: ( rule__Library__NodeparametersAssignment_11_2 )
            {
             before(grammarAccess.getLibraryAccess().getNodeparametersAssignment_11_2()); 
            // InternalRosNetworkDsl.g:4520:2: ( rule__Library__NodeparametersAssignment_11_2 )
            // InternalRosNetworkDsl.g:4520:3: rule__Library__NodeparametersAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Library__NodeparametersAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getNodeparametersAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_11__2__Impl"


    // $ANTLR start "rule__Library__Group_11__3"
    // InternalRosNetworkDsl.g:4528:1: rule__Library__Group_11__3 : rule__Library__Group_11__3__Impl rule__Library__Group_11__4 ;
    public final void rule__Library__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4532:1: ( rule__Library__Group_11__3__Impl rule__Library__Group_11__4 )
            // InternalRosNetworkDsl.g:4533:2: rule__Library__Group_11__3__Impl rule__Library__Group_11__4
            {
            pushFollow(FOLLOW_52);
            rule__Library__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_11__3"


    // $ANTLR start "rule__Library__Group_11__3__Impl"
    // InternalRosNetworkDsl.g:4540:1: rule__Library__Group_11__3__Impl : ( ( rule__Library__NodeparametersAssignment_11_3 )* ) ;
    public final void rule__Library__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4544:1: ( ( ( rule__Library__NodeparametersAssignment_11_3 )* ) )
            // InternalRosNetworkDsl.g:4545:1: ( ( rule__Library__NodeparametersAssignment_11_3 )* )
            {
            // InternalRosNetworkDsl.g:4545:1: ( ( rule__Library__NodeparametersAssignment_11_3 )* )
            // InternalRosNetworkDsl.g:4546:2: ( rule__Library__NodeparametersAssignment_11_3 )*
            {
             before(grammarAccess.getLibraryAccess().getNodeparametersAssignment_11_3()); 
            // InternalRosNetworkDsl.g:4547:2: ( rule__Library__NodeparametersAssignment_11_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==33||LA32_0==36||(LA32_0>=39 && LA32_0<=40)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:4547:3: rule__Library__NodeparametersAssignment_11_3
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__Library__NodeparametersAssignment_11_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getLibraryAccess().getNodeparametersAssignment_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_11__3__Impl"


    // $ANTLR start "rule__Library__Group_11__4"
    // InternalRosNetworkDsl.g:4555:1: rule__Library__Group_11__4 : rule__Library__Group_11__4__Impl ;
    public final void rule__Library__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4559:1: ( rule__Library__Group_11__4__Impl )
            // InternalRosNetworkDsl.g:4560:2: rule__Library__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_11__4"


    // $ANTLR start "rule__Library__Group_11__4__Impl"
    // InternalRosNetworkDsl.g:4566:1: rule__Library__Group_11__4__Impl : ( '}' ) ;
    public final void rule__Library__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4570:1: ( ( '}' ) )
            // InternalRosNetworkDsl.g:4571:1: ( '}' )
            {
            // InternalRosNetworkDsl.g:4571:1: ( '}' )
            // InternalRosNetworkDsl.g:4572:2: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_11__4__Impl"


    // $ANTLR start "rule__Library__Group_12__0"
    // InternalRosNetworkDsl.g:4582:1: rule__Library__Group_12__0 : rule__Library__Group_12__0__Impl rule__Library__Group_12__1 ;
    public final void rule__Library__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4586:1: ( rule__Library__Group_12__0__Impl rule__Library__Group_12__1 )
            // InternalRosNetworkDsl.g:4587:2: rule__Library__Group_12__0__Impl rule__Library__Group_12__1
            {
            pushFollow(FOLLOW_5);
            rule__Library__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_12__0"


    // $ANTLR start "rule__Library__Group_12__0__Impl"
    // InternalRosNetworkDsl.g:4594:1: rule__Library__Group_12__0__Impl : ( 'stati' ) ;
    public final void rule__Library__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4598:1: ( ( 'stati' ) )
            // InternalRosNetworkDsl.g:4599:1: ( 'stati' )
            {
            // InternalRosNetworkDsl.g:4599:1: ( 'stati' )
            // InternalRosNetworkDsl.g:4600:2: 'stati'
            {
             before(grammarAccess.getLibraryAccess().getStatiKeyword_12_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getStatiKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_12__0__Impl"


    // $ANTLR start "rule__Library__Group_12__1"
    // InternalRosNetworkDsl.g:4609:1: rule__Library__Group_12__1 : rule__Library__Group_12__1__Impl rule__Library__Group_12__2 ;
    public final void rule__Library__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4613:1: ( rule__Library__Group_12__1__Impl rule__Library__Group_12__2 )
            // InternalRosNetworkDsl.g:4614:2: rule__Library__Group_12__1__Impl rule__Library__Group_12__2
            {
            pushFollow(FOLLOW_54);
            rule__Library__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_12__1"


    // $ANTLR start "rule__Library__Group_12__1__Impl"
    // InternalRosNetworkDsl.g:4621:1: rule__Library__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Library__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4625:1: ( ( '{' ) )
            // InternalRosNetworkDsl.g:4626:1: ( '{' )
            {
            // InternalRosNetworkDsl.g:4626:1: ( '{' )
            // InternalRosNetworkDsl.g:4627:2: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_12__1__Impl"


    // $ANTLR start "rule__Library__Group_12__2"
    // InternalRosNetworkDsl.g:4636:1: rule__Library__Group_12__2 : rule__Library__Group_12__2__Impl rule__Library__Group_12__3 ;
    public final void rule__Library__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4640:1: ( rule__Library__Group_12__2__Impl rule__Library__Group_12__3 )
            // InternalRosNetworkDsl.g:4641:2: rule__Library__Group_12__2__Impl rule__Library__Group_12__3
            {
            pushFollow(FOLLOW_25);
            rule__Library__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_12__2"


    // $ANTLR start "rule__Library__Group_12__2__Impl"
    // InternalRosNetworkDsl.g:4648:1: rule__Library__Group_12__2__Impl : ( ( rule__Library__ContinousstateAssignment_12_2 ) ) ;
    public final void rule__Library__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4652:1: ( ( ( rule__Library__ContinousstateAssignment_12_2 ) ) )
            // InternalRosNetworkDsl.g:4653:1: ( ( rule__Library__ContinousstateAssignment_12_2 ) )
            {
            // InternalRosNetworkDsl.g:4653:1: ( ( rule__Library__ContinousstateAssignment_12_2 ) )
            // InternalRosNetworkDsl.g:4654:2: ( rule__Library__ContinousstateAssignment_12_2 )
            {
             before(grammarAccess.getLibraryAccess().getContinousstateAssignment_12_2()); 
            // InternalRosNetworkDsl.g:4655:2: ( rule__Library__ContinousstateAssignment_12_2 )
            // InternalRosNetworkDsl.g:4655:3: rule__Library__ContinousstateAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Library__ContinousstateAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getContinousstateAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_12__2__Impl"


    // $ANTLR start "rule__Library__Group_12__3"
    // InternalRosNetworkDsl.g:4663:1: rule__Library__Group_12__3 : rule__Library__Group_12__3__Impl ;
    public final void rule__Library__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4667:1: ( rule__Library__Group_12__3__Impl )
            // InternalRosNetworkDsl.g:4668:2: rule__Library__Group_12__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group_12__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_12__3"


    // $ANTLR start "rule__Library__Group_12__3__Impl"
    // InternalRosNetworkDsl.g:4674:1: rule__Library__Group_12__3__Impl : ( '}' ) ;
    public final void rule__Library__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4678:1: ( ( '}' ) )
            // InternalRosNetworkDsl.g:4679:1: ( '}' )
            {
            // InternalRosNetworkDsl.g:4679:1: ( '}' )
            // InternalRosNetworkDsl.g:4680:2: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_12_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_12__3__Impl"


    // $ANTLR start "rule__Library__Group_13__0"
    // InternalRosNetworkDsl.g:4690:1: rule__Library__Group_13__0 : rule__Library__Group_13__0__Impl rule__Library__Group_13__1 ;
    public final void rule__Library__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4694:1: ( rule__Library__Group_13__0__Impl rule__Library__Group_13__1 )
            // InternalRosNetworkDsl.g:4695:2: rule__Library__Group_13__0__Impl rule__Library__Group_13__1
            {
            pushFollow(FOLLOW_55);
            rule__Library__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_13__0"


    // $ANTLR start "rule__Library__Group_13__0__Impl"
    // InternalRosNetworkDsl.g:4702:1: rule__Library__Group_13__0__Impl : ( ( rule__Library__PortAssignment_13_0 ) ) ;
    public final void rule__Library__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4706:1: ( ( ( rule__Library__PortAssignment_13_0 ) ) )
            // InternalRosNetworkDsl.g:4707:1: ( ( rule__Library__PortAssignment_13_0 ) )
            {
            // InternalRosNetworkDsl.g:4707:1: ( ( rule__Library__PortAssignment_13_0 ) )
            // InternalRosNetworkDsl.g:4708:2: ( rule__Library__PortAssignment_13_0 )
            {
             before(grammarAccess.getLibraryAccess().getPortAssignment_13_0()); 
            // InternalRosNetworkDsl.g:4709:2: ( rule__Library__PortAssignment_13_0 )
            // InternalRosNetworkDsl.g:4709:3: rule__Library__PortAssignment_13_0
            {
            pushFollow(FOLLOW_2);
            rule__Library__PortAssignment_13_0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getPortAssignment_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_13__0__Impl"


    // $ANTLR start "rule__Library__Group_13__1"
    // InternalRosNetworkDsl.g:4717:1: rule__Library__Group_13__1 : rule__Library__Group_13__1__Impl ;
    public final void rule__Library__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4721:1: ( rule__Library__Group_13__1__Impl )
            // InternalRosNetworkDsl.g:4722:2: rule__Library__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_13__1"


    // $ANTLR start "rule__Library__Group_13__1__Impl"
    // InternalRosNetworkDsl.g:4728:1: rule__Library__Group_13__1__Impl : ( ( rule__Library__PortAssignment_13_1 )* ) ;
    public final void rule__Library__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4732:1: ( ( ( rule__Library__PortAssignment_13_1 )* ) )
            // InternalRosNetworkDsl.g:4733:1: ( ( rule__Library__PortAssignment_13_1 )* )
            {
            // InternalRosNetworkDsl.g:4733:1: ( ( rule__Library__PortAssignment_13_1 )* )
            // InternalRosNetworkDsl.g:4734:2: ( rule__Library__PortAssignment_13_1 )*
            {
             before(grammarAccess.getLibraryAccess().getPortAssignment_13_1()); 
            // InternalRosNetworkDsl.g:4735:2: ( rule__Library__PortAssignment_13_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==53) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:4735:3: rule__Library__PortAssignment_13_1
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__Library__PortAssignment_13_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getLibraryAccess().getPortAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_13__1__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalRosNetworkDsl.g:4744:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4748:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalRosNetworkDsl.g:4749:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalRosNetworkDsl.g:4756:1: rule__Node__Group__0__Impl : ( () ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4760:1: ( ( () ) )
            // InternalRosNetworkDsl.g:4761:1: ( () )
            {
            // InternalRosNetworkDsl.g:4761:1: ( () )
            // InternalRosNetworkDsl.g:4762:2: ()
            {
             before(grammarAccess.getNodeAccess().getNodeAction_0()); 
            // InternalRosNetworkDsl.g:4763:2: ()
            // InternalRosNetworkDsl.g:4763:3: 
            {
            }

             after(grammarAccess.getNodeAccess().getNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalRosNetworkDsl.g:4771:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4775:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalRosNetworkDsl.g:4776:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalRosNetworkDsl.g:4783:1: rule__Node__Group__1__Impl : ( 'node' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4787:1: ( ( 'node' ) )
            // InternalRosNetworkDsl.g:4788:1: ( 'node' )
            {
            // InternalRosNetworkDsl.g:4788:1: ( 'node' )
            // InternalRosNetworkDsl.g:4789:2: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // InternalRosNetworkDsl.g:4798:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4802:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalRosNetworkDsl.g:4803:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // InternalRosNetworkDsl.g:4810:1: rule__Node__Group__2__Impl : ( ( rule__Node__NameAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4814:1: ( ( ( rule__Node__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:4815:1: ( ( rule__Node__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:4815:1: ( ( rule__Node__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:4816:2: ( rule__Node__NameAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:4817:2: ( rule__Node__NameAssignment_2 )
            // InternalRosNetworkDsl.g:4817:3: rule__Node__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__3"
    // InternalRosNetworkDsl.g:4825:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4829:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // InternalRosNetworkDsl.g:4830:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Node__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // InternalRosNetworkDsl.g:4837:1: rule__Node__Group__3__Impl : ( 'namespace' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4841:1: ( ( 'namespace' ) )
            // InternalRosNetworkDsl.g:4842:1: ( 'namespace' )
            {
            // InternalRosNetworkDsl.g:4842:1: ( 'namespace' )
            // InternalRosNetworkDsl.g:4843:2: 'namespace'
            {
             before(grammarAccess.getNodeAccess().getNamespaceKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNamespaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Node__Group__4"
    // InternalRosNetworkDsl.g:4852:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4856:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // InternalRosNetworkDsl.g:4857:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_47);
            rule__Node__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4"


    // $ANTLR start "rule__Node__Group__4__Impl"
    // InternalRosNetworkDsl.g:4864:1: rule__Node__Group__4__Impl : ( ( rule__Node__NamespaceAssignment_4 ) ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4868:1: ( ( ( rule__Node__NamespaceAssignment_4 ) ) )
            // InternalRosNetworkDsl.g:4869:1: ( ( rule__Node__NamespaceAssignment_4 ) )
            {
            // InternalRosNetworkDsl.g:4869:1: ( ( rule__Node__NamespaceAssignment_4 ) )
            // InternalRosNetworkDsl.g:4870:2: ( rule__Node__NamespaceAssignment_4 )
            {
             before(grammarAccess.getNodeAccess().getNamespaceAssignment_4()); 
            // InternalRosNetworkDsl.g:4871:2: ( rule__Node__NamespaceAssignment_4 )
            // InternalRosNetworkDsl.g:4871:3: rule__Node__NamespaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Node__NamespaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNamespaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4__Impl"


    // $ANTLR start "rule__Node__Group__5"
    // InternalRosNetworkDsl.g:4879:1: rule__Node__Group__5 : rule__Node__Group__5__Impl rule__Node__Group__6 ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4883:1: ( rule__Node__Group__5__Impl rule__Node__Group__6 )
            // InternalRosNetworkDsl.g:4884:2: rule__Node__Group__5__Impl rule__Node__Group__6
            {
            pushFollow(FOLLOW_47);
            rule__Node__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5"


    // $ANTLR start "rule__Node__Group__5__Impl"
    // InternalRosNetworkDsl.g:4891:1: rule__Node__Group__5__Impl : ( ( rule__Node__Group_5__0 )? ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4895:1: ( ( ( rule__Node__Group_5__0 )? ) )
            // InternalRosNetworkDsl.g:4896:1: ( ( rule__Node__Group_5__0 )? )
            {
            // InternalRosNetworkDsl.g:4896:1: ( ( rule__Node__Group_5__0 )? )
            // InternalRosNetworkDsl.g:4897:2: ( rule__Node__Group_5__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_5()); 
            // InternalRosNetworkDsl.g:4898:2: ( rule__Node__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRosNetworkDsl.g:4898:3: rule__Node__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5__Impl"


    // $ANTLR start "rule__Node__Group__6"
    // InternalRosNetworkDsl.g:4906:1: rule__Node__Group__6 : rule__Node__Group__6__Impl rule__Node__Group__7 ;
    public final void rule__Node__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4910:1: ( rule__Node__Group__6__Impl rule__Node__Group__7 )
            // InternalRosNetworkDsl.g:4911:2: rule__Node__Group__6__Impl rule__Node__Group__7
            {
            pushFollow(FOLLOW_47);
            rule__Node__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6"


    // $ANTLR start "rule__Node__Group__6__Impl"
    // InternalRosNetworkDsl.g:4918:1: rule__Node__Group__6__Impl : ( ( rule__Node__GenerateartifactAssignment_6 )? ) ;
    public final void rule__Node__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4922:1: ( ( ( rule__Node__GenerateartifactAssignment_6 )? ) )
            // InternalRosNetworkDsl.g:4923:1: ( ( rule__Node__GenerateartifactAssignment_6 )? )
            {
            // InternalRosNetworkDsl.g:4923:1: ( ( rule__Node__GenerateartifactAssignment_6 )? )
            // InternalRosNetworkDsl.g:4924:2: ( rule__Node__GenerateartifactAssignment_6 )?
            {
             before(grammarAccess.getNodeAccess().getGenerateartifactAssignment_6()); 
            // InternalRosNetworkDsl.g:4925:2: ( rule__Node__GenerateartifactAssignment_6 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRosNetworkDsl.g:4925:3: rule__Node__GenerateartifactAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__GenerateartifactAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGenerateartifactAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6__Impl"


    // $ANTLR start "rule__Node__Group__7"
    // InternalRosNetworkDsl.g:4933:1: rule__Node__Group__7 : rule__Node__Group__7__Impl rule__Node__Group__8 ;
    public final void rule__Node__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4937:1: ( rule__Node__Group__7__Impl rule__Node__Group__8 )
            // InternalRosNetworkDsl.g:4938:2: rule__Node__Group__7__Impl rule__Node__Group__8
            {
            pushFollow(FOLLOW_48);
            rule__Node__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__7"


    // $ANTLR start "rule__Node__Group__7__Impl"
    // InternalRosNetworkDsl.g:4945:1: rule__Node__Group__7__Impl : ( '{' ) ;
    public final void rule__Node__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4949:1: ( ( '{' ) )
            // InternalRosNetworkDsl.g:4950:1: ( '{' )
            {
            // InternalRosNetworkDsl.g:4950:1: ( '{' )
            // InternalRosNetworkDsl.g:4951:2: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__7__Impl"


    // $ANTLR start "rule__Node__Group__8"
    // InternalRosNetworkDsl.g:4960:1: rule__Node__Group__8 : rule__Node__Group__8__Impl rule__Node__Group__9 ;
    public final void rule__Node__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4964:1: ( rule__Node__Group__8__Impl rule__Node__Group__9 )
            // InternalRosNetworkDsl.g:4965:2: rule__Node__Group__8__Impl rule__Node__Group__9
            {
            pushFollow(FOLLOW_49);
            rule__Node__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__8"


    // $ANTLR start "rule__Node__Group__8__Impl"
    // InternalRosNetworkDsl.g:4972:1: rule__Node__Group__8__Impl : ( 'language' ) ;
    public final void rule__Node__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4976:1: ( ( 'language' ) )
            // InternalRosNetworkDsl.g:4977:1: ( 'language' )
            {
            // InternalRosNetworkDsl.g:4977:1: ( 'language' )
            // InternalRosNetworkDsl.g:4978:2: 'language'
            {
             before(grammarAccess.getNodeAccess().getLanguageKeyword_8()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getLanguageKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__8__Impl"


    // $ANTLR start "rule__Node__Group__9"
    // InternalRosNetworkDsl.g:4987:1: rule__Node__Group__9 : rule__Node__Group__9__Impl rule__Node__Group__10 ;
    public final void rule__Node__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:4991:1: ( rule__Node__Group__9__Impl rule__Node__Group__10 )
            // InternalRosNetworkDsl.g:4992:2: rule__Node__Group__9__Impl rule__Node__Group__10
            {
            pushFollow(FOLLOW_57);
            rule__Node__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__9"


    // $ANTLR start "rule__Node__Group__9__Impl"
    // InternalRosNetworkDsl.g:4999:1: rule__Node__Group__9__Impl : ( ( rule__Node__LanguageAssignment_9 ) ) ;
    public final void rule__Node__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5003:1: ( ( ( rule__Node__LanguageAssignment_9 ) ) )
            // InternalRosNetworkDsl.g:5004:1: ( ( rule__Node__LanguageAssignment_9 ) )
            {
            // InternalRosNetworkDsl.g:5004:1: ( ( rule__Node__LanguageAssignment_9 ) )
            // InternalRosNetworkDsl.g:5005:2: ( rule__Node__LanguageAssignment_9 )
            {
             before(grammarAccess.getNodeAccess().getLanguageAssignment_9()); 
            // InternalRosNetworkDsl.g:5006:2: ( rule__Node__LanguageAssignment_9 )
            // InternalRosNetworkDsl.g:5006:3: rule__Node__LanguageAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Node__LanguageAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getLanguageAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__9__Impl"


    // $ANTLR start "rule__Node__Group__10"
    // InternalRosNetworkDsl.g:5014:1: rule__Node__Group__10 : rule__Node__Group__10__Impl rule__Node__Group__11 ;
    public final void rule__Node__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5018:1: ( rule__Node__Group__10__Impl rule__Node__Group__11 )
            // InternalRosNetworkDsl.g:5019:2: rule__Node__Group__10__Impl rule__Node__Group__11
            {
            pushFollow(FOLLOW_57);
            rule__Node__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__10"


    // $ANTLR start "rule__Node__Group__10__Impl"
    // InternalRosNetworkDsl.g:5026:1: rule__Node__Group__10__Impl : ( ( rule__Node__Group_10__0 )* ) ;
    public final void rule__Node__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5030:1: ( ( ( rule__Node__Group_10__0 )* ) )
            // InternalRosNetworkDsl.g:5031:1: ( ( rule__Node__Group_10__0 )* )
            {
            // InternalRosNetworkDsl.g:5031:1: ( ( rule__Node__Group_10__0 )* )
            // InternalRosNetworkDsl.g:5032:2: ( rule__Node__Group_10__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_10()); 
            // InternalRosNetworkDsl.g:5033:2: ( rule__Node__Group_10__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==21) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:5033:3: rule__Node__Group_10__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Node__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__10__Impl"


    // $ANTLR start "rule__Node__Group__11"
    // InternalRosNetworkDsl.g:5041:1: rule__Node__Group__11 : rule__Node__Group__11__Impl rule__Node__Group__12 ;
    public final void rule__Node__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5045:1: ( rule__Node__Group__11__Impl rule__Node__Group__12 )
            // InternalRosNetworkDsl.g:5046:2: rule__Node__Group__11__Impl rule__Node__Group__12
            {
            pushFollow(FOLLOW_57);
            rule__Node__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__11"


    // $ANTLR start "rule__Node__Group__11__Impl"
    // InternalRosNetworkDsl.g:5053:1: rule__Node__Group__11__Impl : ( ( rule__Node__Group_11__0 )? ) ;
    public final void rule__Node__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5057:1: ( ( ( rule__Node__Group_11__0 )? ) )
            // InternalRosNetworkDsl.g:5058:1: ( ( rule__Node__Group_11__0 )? )
            {
            // InternalRosNetworkDsl.g:5058:1: ( ( rule__Node__Group_11__0 )? )
            // InternalRosNetworkDsl.g:5059:2: ( rule__Node__Group_11__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_11()); 
            // InternalRosNetworkDsl.g:5060:2: ( rule__Node__Group_11__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRosNetworkDsl.g:5060:3: rule__Node__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__11__Impl"


    // $ANTLR start "rule__Node__Group__12"
    // InternalRosNetworkDsl.g:5068:1: rule__Node__Group__12 : rule__Node__Group__12__Impl rule__Node__Group__13 ;
    public final void rule__Node__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5072:1: ( rule__Node__Group__12__Impl rule__Node__Group__13 )
            // InternalRosNetworkDsl.g:5073:2: rule__Node__Group__12__Impl rule__Node__Group__13
            {
            pushFollow(FOLLOW_57);
            rule__Node__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__12"


    // $ANTLR start "rule__Node__Group__12__Impl"
    // InternalRosNetworkDsl.g:5080:1: rule__Node__Group__12__Impl : ( ( rule__Node__Group_12__0 )? ) ;
    public final void rule__Node__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5084:1: ( ( ( rule__Node__Group_12__0 )? ) )
            // InternalRosNetworkDsl.g:5085:1: ( ( rule__Node__Group_12__0 )? )
            {
            // InternalRosNetworkDsl.g:5085:1: ( ( rule__Node__Group_12__0 )? )
            // InternalRosNetworkDsl.g:5086:2: ( rule__Node__Group_12__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_12()); 
            // InternalRosNetworkDsl.g:5087:2: ( rule__Node__Group_12__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRosNetworkDsl.g:5087:3: rule__Node__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__12__Impl"


    // $ANTLR start "rule__Node__Group__13"
    // InternalRosNetworkDsl.g:5095:1: rule__Node__Group__13 : rule__Node__Group__13__Impl rule__Node__Group__14 ;
    public final void rule__Node__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5099:1: ( rule__Node__Group__13__Impl rule__Node__Group__14 )
            // InternalRosNetworkDsl.g:5100:2: rule__Node__Group__13__Impl rule__Node__Group__14
            {
            pushFollow(FOLLOW_57);
            rule__Node__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__13"


    // $ANTLR start "rule__Node__Group__13__Impl"
    // InternalRosNetworkDsl.g:5107:1: rule__Node__Group__13__Impl : ( ( rule__Node__Group_13__0 )? ) ;
    public final void rule__Node__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5111:1: ( ( ( rule__Node__Group_13__0 )? ) )
            // InternalRosNetworkDsl.g:5112:1: ( ( rule__Node__Group_13__0 )? )
            {
            // InternalRosNetworkDsl.g:5112:1: ( ( rule__Node__Group_13__0 )? )
            // InternalRosNetworkDsl.g:5113:2: ( rule__Node__Group_13__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_13()); 
            // InternalRosNetworkDsl.g:5114:2: ( rule__Node__Group_13__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==53) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRosNetworkDsl.g:5114:3: rule__Node__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__13__Impl"


    // $ANTLR start "rule__Node__Group__14"
    // InternalRosNetworkDsl.g:5122:1: rule__Node__Group__14 : rule__Node__Group__14__Impl rule__Node__Group__15 ;
    public final void rule__Node__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5126:1: ( rule__Node__Group__14__Impl rule__Node__Group__15 )
            // InternalRosNetworkDsl.g:5127:2: rule__Node__Group__14__Impl rule__Node__Group__15
            {
            pushFollow(FOLLOW_57);
            rule__Node__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__14"


    // $ANTLR start "rule__Node__Group__14__Impl"
    // InternalRosNetworkDsl.g:5134:1: rule__Node__Group__14__Impl : ( ( rule__Node__Group_14__0 )? ) ;
    public final void rule__Node__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5138:1: ( ( ( rule__Node__Group_14__0 )? ) )
            // InternalRosNetworkDsl.g:5139:1: ( ( rule__Node__Group_14__0 )? )
            {
            // InternalRosNetworkDsl.g:5139:1: ( ( rule__Node__Group_14__0 )? )
            // InternalRosNetworkDsl.g:5140:2: ( rule__Node__Group_14__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_14()); 
            // InternalRosNetworkDsl.g:5141:2: ( rule__Node__Group_14__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==24) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRosNetworkDsl.g:5141:3: rule__Node__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__14__Impl"


    // $ANTLR start "rule__Node__Group__15"
    // InternalRosNetworkDsl.g:5149:1: rule__Node__Group__15 : rule__Node__Group__15__Impl ;
    public final void rule__Node__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5153:1: ( rule__Node__Group__15__Impl )
            // InternalRosNetworkDsl.g:5154:2: rule__Node__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__15"


    // $ANTLR start "rule__Node__Group__15__Impl"
    // InternalRosNetworkDsl.g:5160:1: rule__Node__Group__15__Impl : ( '}' ) ;
    public final void rule__Node__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5164:1: ( ( '}' ) )
            // InternalRosNetworkDsl.g:5165:1: ( '}' )
            {
            // InternalRosNetworkDsl.g:5165:1: ( '}' )
            // InternalRosNetworkDsl.g:5166:2: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_15()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__15__Impl"


    // $ANTLR start "rule__Node__Group_5__0"
    // InternalRosNetworkDsl.g:5176:1: rule__Node__Group_5__0 : rule__Node__Group_5__0__Impl rule__Node__Group_5__1 ;
    public final void rule__Node__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5180:1: ( rule__Node__Group_5__0__Impl rule__Node__Group_5__1 )
            // InternalRosNetworkDsl.g:5181:2: rule__Node__Group_5__0__Impl rule__Node__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Node__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_5__0"


    // $ANTLR start "rule__Node__Group_5__0__Impl"
    // InternalRosNetworkDsl.g:5188:1: rule__Node__Group_5__0__Impl : ( 'implements' ) ;
    public final void rule__Node__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5192:1: ( ( 'implements' ) )
            // InternalRosNetworkDsl.g:5193:1: ( 'implements' )
            {
            // InternalRosNetworkDsl.g:5193:1: ( 'implements' )
            // InternalRosNetworkDsl.g:5194:2: 'implements'
            {
             before(grammarAccess.getNodeAccess().getImplementsKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getImplementsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_5__0__Impl"


    // $ANTLR start "rule__Node__Group_5__1"
    // InternalRosNetworkDsl.g:5203:1: rule__Node__Group_5__1 : rule__Node__Group_5__1__Impl ;
    public final void rule__Node__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5207:1: ( rule__Node__Group_5__1__Impl )
            // InternalRosNetworkDsl.g:5208:2: rule__Node__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_5__1"


    // $ANTLR start "rule__Node__Group_5__1__Impl"
    // InternalRosNetworkDsl.g:5214:1: rule__Node__Group_5__1__Impl : ( ( rule__Node__ImplementsAssignment_5_1 ) ) ;
    public final void rule__Node__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5218:1: ( ( ( rule__Node__ImplementsAssignment_5_1 ) ) )
            // InternalRosNetworkDsl.g:5219:1: ( ( rule__Node__ImplementsAssignment_5_1 ) )
            {
            // InternalRosNetworkDsl.g:5219:1: ( ( rule__Node__ImplementsAssignment_5_1 ) )
            // InternalRosNetworkDsl.g:5220:2: ( rule__Node__ImplementsAssignment_5_1 )
            {
             before(grammarAccess.getNodeAccess().getImplementsAssignment_5_1()); 
            // InternalRosNetworkDsl.g:5221:2: ( rule__Node__ImplementsAssignment_5_1 )
            // InternalRosNetworkDsl.g:5221:3: rule__Node__ImplementsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__ImplementsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getImplementsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_5__1__Impl"


    // $ANTLR start "rule__Node__Group_10__0"
    // InternalRosNetworkDsl.g:5230:1: rule__Node__Group_10__0 : rule__Node__Group_10__0__Impl rule__Node__Group_10__1 ;
    public final void rule__Node__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5234:1: ( rule__Node__Group_10__0__Impl rule__Node__Group_10__1 )
            // InternalRosNetworkDsl.g:5235:2: rule__Node__Group_10__0__Impl rule__Node__Group_10__1
            {
            pushFollow(FOLLOW_49);
            rule__Node__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_10__0"


    // $ANTLR start "rule__Node__Group_10__0__Impl"
    // InternalRosNetworkDsl.g:5242:1: rule__Node__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Node__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5246:1: ( ( ',' ) )
            // InternalRosNetworkDsl.g:5247:1: ( ',' )
            {
            // InternalRosNetworkDsl.g:5247:1: ( ',' )
            // InternalRosNetworkDsl.g:5248:2: ','
            {
             before(grammarAccess.getNodeAccess().getCommaKeyword_10_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_10__0__Impl"


    // $ANTLR start "rule__Node__Group_10__1"
    // InternalRosNetworkDsl.g:5257:1: rule__Node__Group_10__1 : rule__Node__Group_10__1__Impl ;
    public final void rule__Node__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5261:1: ( rule__Node__Group_10__1__Impl )
            // InternalRosNetworkDsl.g:5262:2: rule__Node__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_10__1"


    // $ANTLR start "rule__Node__Group_10__1__Impl"
    // InternalRosNetworkDsl.g:5268:1: rule__Node__Group_10__1__Impl : ( ( rule__Node__LanguageAssignment_10_1 ) ) ;
    public final void rule__Node__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5272:1: ( ( ( rule__Node__LanguageAssignment_10_1 ) ) )
            // InternalRosNetworkDsl.g:5273:1: ( ( rule__Node__LanguageAssignment_10_1 ) )
            {
            // InternalRosNetworkDsl.g:5273:1: ( ( rule__Node__LanguageAssignment_10_1 ) )
            // InternalRosNetworkDsl.g:5274:2: ( rule__Node__LanguageAssignment_10_1 )
            {
             before(grammarAccess.getNodeAccess().getLanguageAssignment_10_1()); 
            // InternalRosNetworkDsl.g:5275:2: ( rule__Node__LanguageAssignment_10_1 )
            // InternalRosNetworkDsl.g:5275:3: rule__Node__LanguageAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__LanguageAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getLanguageAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_10__1__Impl"


    // $ANTLR start "rule__Node__Group_11__0"
    // InternalRosNetworkDsl.g:5284:1: rule__Node__Group_11__0 : rule__Node__Group_11__0__Impl rule__Node__Group_11__1 ;
    public final void rule__Node__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5288:1: ( rule__Node__Group_11__0__Impl rule__Node__Group_11__1 )
            // InternalRosNetworkDsl.g:5289:2: rule__Node__Group_11__0__Impl rule__Node__Group_11__1
            {
            pushFollow(FOLLOW_5);
            rule__Node__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_11__0"


    // $ANTLR start "rule__Node__Group_11__0__Impl"
    // InternalRosNetworkDsl.g:5296:1: rule__Node__Group_11__0__Impl : ( 'parameters' ) ;
    public final void rule__Node__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5300:1: ( ( 'parameters' ) )
            // InternalRosNetworkDsl.g:5301:1: ( 'parameters' )
            {
            // InternalRosNetworkDsl.g:5301:1: ( 'parameters' )
            // InternalRosNetworkDsl.g:5302:2: 'parameters'
            {
             before(grammarAccess.getNodeAccess().getParametersKeyword_11_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getParametersKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_11__0__Impl"


    // $ANTLR start "rule__Node__Group_11__1"
    // InternalRosNetworkDsl.g:5311:1: rule__Node__Group_11__1 : rule__Node__Group_11__1__Impl rule__Node__Group_11__2 ;
    public final void rule__Node__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5315:1: ( rule__Node__Group_11__1__Impl rule__Node__Group_11__2 )
            // InternalRosNetworkDsl.g:5316:2: rule__Node__Group_11__1__Impl rule__Node__Group_11__2
            {
            pushFollow(FOLLOW_51);
            rule__Node__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_11__1"


    // $ANTLR start "rule__Node__Group_11__1__Impl"
    // InternalRosNetworkDsl.g:5323:1: rule__Node__Group_11__1__Impl : ( '{' ) ;
    public final void rule__Node__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5327:1: ( ( '{' ) )
            // InternalRosNetworkDsl.g:5328:1: ( '{' )
            {
            // InternalRosNetworkDsl.g:5328:1: ( '{' )
            // InternalRosNetworkDsl.g:5329:2: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_11__1__Impl"


    // $ANTLR start "rule__Node__Group_11__2"
    // InternalRosNetworkDsl.g:5338:1: rule__Node__Group_11__2 : rule__Node__Group_11__2__Impl rule__Node__Group_11__3 ;
    public final void rule__Node__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5342:1: ( rule__Node__Group_11__2__Impl rule__Node__Group_11__3 )
            // InternalRosNetworkDsl.g:5343:2: rule__Node__Group_11__2__Impl rule__Node__Group_11__3
            {
            pushFollow(FOLLOW_52);
            rule__Node__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_11__2"


    // $ANTLR start "rule__Node__Group_11__2__Impl"
    // InternalRosNetworkDsl.g:5350:1: rule__Node__Group_11__2__Impl : ( ( rule__Node__NodeparametersAssignment_11_2 ) ) ;
    public final void rule__Node__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5354:1: ( ( ( rule__Node__NodeparametersAssignment_11_2 ) ) )
            // InternalRosNetworkDsl.g:5355:1: ( ( rule__Node__NodeparametersAssignment_11_2 ) )
            {
            // InternalRosNetworkDsl.g:5355:1: ( ( rule__Node__NodeparametersAssignment_11_2 ) )
            // InternalRosNetworkDsl.g:5356:2: ( rule__Node__NodeparametersAssignment_11_2 )
            {
             before(grammarAccess.getNodeAccess().getNodeparametersAssignment_11_2()); 
            // InternalRosNetworkDsl.g:5357:2: ( rule__Node__NodeparametersAssignment_11_2 )
            // InternalRosNetworkDsl.g:5357:3: rule__Node__NodeparametersAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Node__NodeparametersAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNodeparametersAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_11__2__Impl"


    // $ANTLR start "rule__Node__Group_11__3"
    // InternalRosNetworkDsl.g:5365:1: rule__Node__Group_11__3 : rule__Node__Group_11__3__Impl rule__Node__Group_11__4 ;
    public final void rule__Node__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5369:1: ( rule__Node__Group_11__3__Impl rule__Node__Group_11__4 )
            // InternalRosNetworkDsl.g:5370:2: rule__Node__Group_11__3__Impl rule__Node__Group_11__4
            {
            pushFollow(FOLLOW_52);
            rule__Node__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_11__3"


    // $ANTLR start "rule__Node__Group_11__3__Impl"
    // InternalRosNetworkDsl.g:5377:1: rule__Node__Group_11__3__Impl : ( ( rule__Node__NodeparametersAssignment_11_3 )* ) ;
    public final void rule__Node__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5381:1: ( ( ( rule__Node__NodeparametersAssignment_11_3 )* ) )
            // InternalRosNetworkDsl.g:5382:1: ( ( rule__Node__NodeparametersAssignment_11_3 )* )
            {
            // InternalRosNetworkDsl.g:5382:1: ( ( rule__Node__NodeparametersAssignment_11_3 )* )
            // InternalRosNetworkDsl.g:5383:2: ( rule__Node__NodeparametersAssignment_11_3 )*
            {
             before(grammarAccess.getNodeAccess().getNodeparametersAssignment_11_3()); 
            // InternalRosNetworkDsl.g:5384:2: ( rule__Node__NodeparametersAssignment_11_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==33||LA41_0==36||(LA41_0>=39 && LA41_0<=40)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:5384:3: rule__Node__NodeparametersAssignment_11_3
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__Node__NodeparametersAssignment_11_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getNodeparametersAssignment_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_11__3__Impl"


    // $ANTLR start "rule__Node__Group_11__4"
    // InternalRosNetworkDsl.g:5392:1: rule__Node__Group_11__4 : rule__Node__Group_11__4__Impl ;
    public final void rule__Node__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5396:1: ( rule__Node__Group_11__4__Impl )
            // InternalRosNetworkDsl.g:5397:2: rule__Node__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_11__4"


    // $ANTLR start "rule__Node__Group_11__4__Impl"
    // InternalRosNetworkDsl.g:5403:1: rule__Node__Group_11__4__Impl : ( '}' ) ;
    public final void rule__Node__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5407:1: ( ( '}' ) )
            // InternalRosNetworkDsl.g:5408:1: ( '}' )
            {
            // InternalRosNetworkDsl.g:5408:1: ( '}' )
            // InternalRosNetworkDsl.g:5409:2: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_11__4__Impl"


    // $ANTLR start "rule__Node__Group_12__0"
    // InternalRosNetworkDsl.g:5419:1: rule__Node__Group_12__0 : rule__Node__Group_12__0__Impl rule__Node__Group_12__1 ;
    public final void rule__Node__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5423:1: ( rule__Node__Group_12__0__Impl rule__Node__Group_12__1 )
            // InternalRosNetworkDsl.g:5424:2: rule__Node__Group_12__0__Impl rule__Node__Group_12__1
            {
            pushFollow(FOLLOW_5);
            rule__Node__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_12__0"


    // $ANTLR start "rule__Node__Group_12__0__Impl"
    // InternalRosNetworkDsl.g:5431:1: rule__Node__Group_12__0__Impl : ( 'stati' ) ;
    public final void rule__Node__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5435:1: ( ( 'stati' ) )
            // InternalRosNetworkDsl.g:5436:1: ( 'stati' )
            {
            // InternalRosNetworkDsl.g:5436:1: ( 'stati' )
            // InternalRosNetworkDsl.g:5437:2: 'stati'
            {
             before(grammarAccess.getNodeAccess().getStatiKeyword_12_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getStatiKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_12__0__Impl"


    // $ANTLR start "rule__Node__Group_12__1"
    // InternalRosNetworkDsl.g:5446:1: rule__Node__Group_12__1 : rule__Node__Group_12__1__Impl rule__Node__Group_12__2 ;
    public final void rule__Node__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5450:1: ( rule__Node__Group_12__1__Impl rule__Node__Group_12__2 )
            // InternalRosNetworkDsl.g:5451:2: rule__Node__Group_12__1__Impl rule__Node__Group_12__2
            {
            pushFollow(FOLLOW_54);
            rule__Node__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_12__1"


    // $ANTLR start "rule__Node__Group_12__1__Impl"
    // InternalRosNetworkDsl.g:5458:1: rule__Node__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Node__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5462:1: ( ( '{' ) )
            // InternalRosNetworkDsl.g:5463:1: ( '{' )
            {
            // InternalRosNetworkDsl.g:5463:1: ( '{' )
            // InternalRosNetworkDsl.g:5464:2: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_12__1__Impl"


    // $ANTLR start "rule__Node__Group_12__2"
    // InternalRosNetworkDsl.g:5473:1: rule__Node__Group_12__2 : rule__Node__Group_12__2__Impl rule__Node__Group_12__3 ;
    public final void rule__Node__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5477:1: ( rule__Node__Group_12__2__Impl rule__Node__Group_12__3 )
            // InternalRosNetworkDsl.g:5478:2: rule__Node__Group_12__2__Impl rule__Node__Group_12__3
            {
            pushFollow(FOLLOW_25);
            rule__Node__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_12__2"


    // $ANTLR start "rule__Node__Group_12__2__Impl"
    // InternalRosNetworkDsl.g:5485:1: rule__Node__Group_12__2__Impl : ( ( rule__Node__ContinousstateAssignment_12_2 ) ) ;
    public final void rule__Node__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5489:1: ( ( ( rule__Node__ContinousstateAssignment_12_2 ) ) )
            // InternalRosNetworkDsl.g:5490:1: ( ( rule__Node__ContinousstateAssignment_12_2 ) )
            {
            // InternalRosNetworkDsl.g:5490:1: ( ( rule__Node__ContinousstateAssignment_12_2 ) )
            // InternalRosNetworkDsl.g:5491:2: ( rule__Node__ContinousstateAssignment_12_2 )
            {
             before(grammarAccess.getNodeAccess().getContinousstateAssignment_12_2()); 
            // InternalRosNetworkDsl.g:5492:2: ( rule__Node__ContinousstateAssignment_12_2 )
            // InternalRosNetworkDsl.g:5492:3: rule__Node__ContinousstateAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Node__ContinousstateAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getContinousstateAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_12__2__Impl"


    // $ANTLR start "rule__Node__Group_12__3"
    // InternalRosNetworkDsl.g:5500:1: rule__Node__Group_12__3 : rule__Node__Group_12__3__Impl ;
    public final void rule__Node__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5504:1: ( rule__Node__Group_12__3__Impl )
            // InternalRosNetworkDsl.g:5505:2: rule__Node__Group_12__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_12__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_12__3"


    // $ANTLR start "rule__Node__Group_12__3__Impl"
    // InternalRosNetworkDsl.g:5511:1: rule__Node__Group_12__3__Impl : ( '}' ) ;
    public final void rule__Node__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5515:1: ( ( '}' ) )
            // InternalRosNetworkDsl.g:5516:1: ( '}' )
            {
            // InternalRosNetworkDsl.g:5516:1: ( '}' )
            // InternalRosNetworkDsl.g:5517:2: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_12_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_12__3__Impl"


    // $ANTLR start "rule__Node__Group_13__0"
    // InternalRosNetworkDsl.g:5527:1: rule__Node__Group_13__0 : rule__Node__Group_13__0__Impl rule__Node__Group_13__1 ;
    public final void rule__Node__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5531:1: ( rule__Node__Group_13__0__Impl rule__Node__Group_13__1 )
            // InternalRosNetworkDsl.g:5532:2: rule__Node__Group_13__0__Impl rule__Node__Group_13__1
            {
            pushFollow(FOLLOW_55);
            rule__Node__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_13__0"


    // $ANTLR start "rule__Node__Group_13__0__Impl"
    // InternalRosNetworkDsl.g:5539:1: rule__Node__Group_13__0__Impl : ( ( rule__Node__PortAssignment_13_0 ) ) ;
    public final void rule__Node__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5543:1: ( ( ( rule__Node__PortAssignment_13_0 ) ) )
            // InternalRosNetworkDsl.g:5544:1: ( ( rule__Node__PortAssignment_13_0 ) )
            {
            // InternalRosNetworkDsl.g:5544:1: ( ( rule__Node__PortAssignment_13_0 ) )
            // InternalRosNetworkDsl.g:5545:2: ( rule__Node__PortAssignment_13_0 )
            {
             before(grammarAccess.getNodeAccess().getPortAssignment_13_0()); 
            // InternalRosNetworkDsl.g:5546:2: ( rule__Node__PortAssignment_13_0 )
            // InternalRosNetworkDsl.g:5546:3: rule__Node__PortAssignment_13_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__PortAssignment_13_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getPortAssignment_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_13__0__Impl"


    // $ANTLR start "rule__Node__Group_13__1"
    // InternalRosNetworkDsl.g:5554:1: rule__Node__Group_13__1 : rule__Node__Group_13__1__Impl ;
    public final void rule__Node__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5558:1: ( rule__Node__Group_13__1__Impl )
            // InternalRosNetworkDsl.g:5559:2: rule__Node__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_13__1"


    // $ANTLR start "rule__Node__Group_13__1__Impl"
    // InternalRosNetworkDsl.g:5565:1: rule__Node__Group_13__1__Impl : ( ( rule__Node__PortAssignment_13_1 )* ) ;
    public final void rule__Node__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5569:1: ( ( ( rule__Node__PortAssignment_13_1 )* ) )
            // InternalRosNetworkDsl.g:5570:1: ( ( rule__Node__PortAssignment_13_1 )* )
            {
            // InternalRosNetworkDsl.g:5570:1: ( ( rule__Node__PortAssignment_13_1 )* )
            // InternalRosNetworkDsl.g:5571:2: ( rule__Node__PortAssignment_13_1 )*
            {
             before(grammarAccess.getNodeAccess().getPortAssignment_13_1()); 
            // InternalRosNetworkDsl.g:5572:2: ( rule__Node__PortAssignment_13_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==53) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:5572:3: rule__Node__PortAssignment_13_1
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__Node__PortAssignment_13_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getPortAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_13__1__Impl"


    // $ANTLR start "rule__Node__Group_14__0"
    // InternalRosNetworkDsl.g:5581:1: rule__Node__Group_14__0 : rule__Node__Group_14__0__Impl rule__Node__Group_14__1 ;
    public final void rule__Node__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5585:1: ( rule__Node__Group_14__0__Impl rule__Node__Group_14__1 )
            // InternalRosNetworkDsl.g:5586:2: rule__Node__Group_14__0__Impl rule__Node__Group_14__1
            {
            pushFollow(FOLLOW_19);
            rule__Node__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_14__0"


    // $ANTLR start "rule__Node__Group_14__0__Impl"
    // InternalRosNetworkDsl.g:5593:1: rule__Node__Group_14__0__Impl : ( ( rule__Node__FilterconnectionAssignment_14_0 ) ) ;
    public final void rule__Node__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5597:1: ( ( ( rule__Node__FilterconnectionAssignment_14_0 ) ) )
            // InternalRosNetworkDsl.g:5598:1: ( ( rule__Node__FilterconnectionAssignment_14_0 ) )
            {
            // InternalRosNetworkDsl.g:5598:1: ( ( rule__Node__FilterconnectionAssignment_14_0 ) )
            // InternalRosNetworkDsl.g:5599:2: ( rule__Node__FilterconnectionAssignment_14_0 )
            {
             before(grammarAccess.getNodeAccess().getFilterconnectionAssignment_14_0()); 
            // InternalRosNetworkDsl.g:5600:2: ( rule__Node__FilterconnectionAssignment_14_0 )
            // InternalRosNetworkDsl.g:5600:3: rule__Node__FilterconnectionAssignment_14_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__FilterconnectionAssignment_14_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getFilterconnectionAssignment_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_14__0__Impl"


    // $ANTLR start "rule__Node__Group_14__1"
    // InternalRosNetworkDsl.g:5608:1: rule__Node__Group_14__1 : rule__Node__Group_14__1__Impl ;
    public final void rule__Node__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5612:1: ( rule__Node__Group_14__1__Impl )
            // InternalRosNetworkDsl.g:5613:2: rule__Node__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_14__1"


    // $ANTLR start "rule__Node__Group_14__1__Impl"
    // InternalRosNetworkDsl.g:5619:1: rule__Node__Group_14__1__Impl : ( ( rule__Node__FilterconnectionAssignment_14_1 )* ) ;
    public final void rule__Node__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5623:1: ( ( ( rule__Node__FilterconnectionAssignment_14_1 )* ) )
            // InternalRosNetworkDsl.g:5624:1: ( ( rule__Node__FilterconnectionAssignment_14_1 )* )
            {
            // InternalRosNetworkDsl.g:5624:1: ( ( rule__Node__FilterconnectionAssignment_14_1 )* )
            // InternalRosNetworkDsl.g:5625:2: ( rule__Node__FilterconnectionAssignment_14_1 )*
            {
             before(grammarAccess.getNodeAccess().getFilterconnectionAssignment_14_1()); 
            // InternalRosNetworkDsl.g:5626:2: ( rule__Node__FilterconnectionAssignment_14_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==24) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:5626:3: rule__Node__FilterconnectionAssignment_14_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Node__FilterconnectionAssignment_14_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getFilterconnectionAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_14__1__Impl"


    // $ANTLR start "rule__FilterConnection__Group__0"
    // InternalRosNetworkDsl.g:5635:1: rule__FilterConnection__Group__0 : rule__FilterConnection__Group__0__Impl rule__FilterConnection__Group__1 ;
    public final void rule__FilterConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5639:1: ( rule__FilterConnection__Group__0__Impl rule__FilterConnection__Group__1 )
            // InternalRosNetworkDsl.g:5640:2: rule__FilterConnection__Group__0__Impl rule__FilterConnection__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FilterConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterConnection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__0"


    // $ANTLR start "rule__FilterConnection__Group__0__Impl"
    // InternalRosNetworkDsl.g:5647:1: rule__FilterConnection__Group__0__Impl : ( () ) ;
    public final void rule__FilterConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5651:1: ( ( () ) )
            // InternalRosNetworkDsl.g:5652:1: ( () )
            {
            // InternalRosNetworkDsl.g:5652:1: ( () )
            // InternalRosNetworkDsl.g:5653:2: ()
            {
             before(grammarAccess.getFilterConnectionAccess().getFilterConnectionAction_0()); 
            // InternalRosNetworkDsl.g:5654:2: ()
            // InternalRosNetworkDsl.g:5654:3: 
            {
            }

             after(grammarAccess.getFilterConnectionAccess().getFilterConnectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__0__Impl"


    // $ANTLR start "rule__FilterConnection__Group__1"
    // InternalRosNetworkDsl.g:5662:1: rule__FilterConnection__Group__1 : rule__FilterConnection__Group__1__Impl rule__FilterConnection__Group__2 ;
    public final void rule__FilterConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5666:1: ( rule__FilterConnection__Group__1__Impl rule__FilterConnection__Group__2 )
            // InternalRosNetworkDsl.g:5667:2: rule__FilterConnection__Group__1__Impl rule__FilterConnection__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FilterConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterConnection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__1"


    // $ANTLR start "rule__FilterConnection__Group__1__Impl"
    // InternalRosNetworkDsl.g:5674:1: rule__FilterConnection__Group__1__Impl : ( 'filter' ) ;
    public final void rule__FilterConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5678:1: ( ( 'filter' ) )
            // InternalRosNetworkDsl.g:5679:1: ( 'filter' )
            {
            // InternalRosNetworkDsl.g:5679:1: ( 'filter' )
            // InternalRosNetworkDsl.g:5680:2: 'filter'
            {
             before(grammarAccess.getFilterConnectionAccess().getFilterKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFilterConnectionAccess().getFilterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__1__Impl"


    // $ANTLR start "rule__FilterConnection__Group__2"
    // InternalRosNetworkDsl.g:5689:1: rule__FilterConnection__Group__2 : rule__FilterConnection__Group__2__Impl rule__FilterConnection__Group__3 ;
    public final void rule__FilterConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5693:1: ( rule__FilterConnection__Group__2__Impl rule__FilterConnection__Group__3 )
            // InternalRosNetworkDsl.g:5694:2: rule__FilterConnection__Group__2__Impl rule__FilterConnection__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__FilterConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterConnection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__2"


    // $ANTLR start "rule__FilterConnection__Group__2__Impl"
    // InternalRosNetworkDsl.g:5701:1: rule__FilterConnection__Group__2__Impl : ( ( rule__FilterConnection__NameAssignment_2 ) ) ;
    public final void rule__FilterConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5705:1: ( ( ( rule__FilterConnection__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:5706:1: ( ( rule__FilterConnection__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:5706:1: ( ( rule__FilterConnection__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:5707:2: ( rule__FilterConnection__NameAssignment_2 )
            {
             before(grammarAccess.getFilterConnectionAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:5708:2: ( rule__FilterConnection__NameAssignment_2 )
            // InternalRosNetworkDsl.g:5708:3: rule__FilterConnection__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FilterConnection__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterConnectionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__2__Impl"


    // $ANTLR start "rule__FilterConnection__Group__3"
    // InternalRosNetworkDsl.g:5716:1: rule__FilterConnection__Group__3 : rule__FilterConnection__Group__3__Impl rule__FilterConnection__Group__4 ;
    public final void rule__FilterConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5720:1: ( rule__FilterConnection__Group__3__Impl rule__FilterConnection__Group__4 )
            // InternalRosNetworkDsl.g:5721:2: rule__FilterConnection__Group__3__Impl rule__FilterConnection__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__FilterConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterConnection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__3"


    // $ANTLR start "rule__FilterConnection__Group__3__Impl"
    // InternalRosNetworkDsl.g:5728:1: rule__FilterConnection__Group__3__Impl : ( ':' ) ;
    public final void rule__FilterConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5732:1: ( ( ':' ) )
            // InternalRosNetworkDsl.g:5733:1: ( ':' )
            {
            // InternalRosNetworkDsl.g:5733:1: ( ':' )
            // InternalRosNetworkDsl.g:5734:2: ':'
            {
             before(grammarAccess.getFilterConnectionAccess().getColonKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFilterConnectionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__3__Impl"


    // $ANTLR start "rule__FilterConnection__Group__4"
    // InternalRosNetworkDsl.g:5743:1: rule__FilterConnection__Group__4 : rule__FilterConnection__Group__4__Impl rule__FilterConnection__Group__5 ;
    public final void rule__FilterConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5747:1: ( rule__FilterConnection__Group__4__Impl rule__FilterConnection__Group__5 )
            // InternalRosNetworkDsl.g:5748:2: rule__FilterConnection__Group__4__Impl rule__FilterConnection__Group__5
            {
            pushFollow(FOLLOW_58);
            rule__FilterConnection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterConnection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__4"


    // $ANTLR start "rule__FilterConnection__Group__4__Impl"
    // InternalRosNetworkDsl.g:5755:1: rule__FilterConnection__Group__4__Impl : ( ( rule__FilterConnection__UsedfilterAssignment_4 ) ) ;
    public final void rule__FilterConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5759:1: ( ( ( rule__FilterConnection__UsedfilterAssignment_4 ) ) )
            // InternalRosNetworkDsl.g:5760:1: ( ( rule__FilterConnection__UsedfilterAssignment_4 ) )
            {
            // InternalRosNetworkDsl.g:5760:1: ( ( rule__FilterConnection__UsedfilterAssignment_4 ) )
            // InternalRosNetworkDsl.g:5761:2: ( rule__FilterConnection__UsedfilterAssignment_4 )
            {
             before(grammarAccess.getFilterConnectionAccess().getUsedfilterAssignment_4()); 
            // InternalRosNetworkDsl.g:5762:2: ( rule__FilterConnection__UsedfilterAssignment_4 )
            // InternalRosNetworkDsl.g:5762:3: rule__FilterConnection__UsedfilterAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FilterConnection__UsedfilterAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFilterConnectionAccess().getUsedfilterAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__4__Impl"


    // $ANTLR start "rule__FilterConnection__Group__5"
    // InternalRosNetworkDsl.g:5770:1: rule__FilterConnection__Group__5 : rule__FilterConnection__Group__5__Impl rule__FilterConnection__Group__6 ;
    public final void rule__FilterConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5774:1: ( rule__FilterConnection__Group__5__Impl rule__FilterConnection__Group__6 )
            // InternalRosNetworkDsl.g:5775:2: rule__FilterConnection__Group__5__Impl rule__FilterConnection__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__FilterConnection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterConnection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__5"


    // $ANTLR start "rule__FilterConnection__Group__5__Impl"
    // InternalRosNetworkDsl.g:5782:1: rule__FilterConnection__Group__5__Impl : ( '[' ) ;
    public final void rule__FilterConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5786:1: ( ( '[' ) )
            // InternalRosNetworkDsl.g:5787:1: ( '[' )
            {
            // InternalRosNetworkDsl.g:5787:1: ( '[' )
            // InternalRosNetworkDsl.g:5788:2: '['
            {
             before(grammarAccess.getFilterConnectionAccess().getLeftSquareBracketKeyword_5()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFilterConnectionAccess().getLeftSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__5__Impl"


    // $ANTLR start "rule__FilterConnection__Group__6"
    // InternalRosNetworkDsl.g:5797:1: rule__FilterConnection__Group__6 : rule__FilterConnection__Group__6__Impl rule__FilterConnection__Group__7 ;
    public final void rule__FilterConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5801:1: ( rule__FilterConnection__Group__6__Impl rule__FilterConnection__Group__7 )
            // InternalRosNetworkDsl.g:5802:2: rule__FilterConnection__Group__6__Impl rule__FilterConnection__Group__7
            {
            pushFollow(FOLLOW_59);
            rule__FilterConnection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterConnection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__6"


    // $ANTLR start "rule__FilterConnection__Group__6__Impl"
    // InternalRosNetworkDsl.g:5809:1: rule__FilterConnection__Group__6__Impl : ( ( rule__FilterConnection__InputAssignment_6 ) ) ;
    public final void rule__FilterConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5813:1: ( ( ( rule__FilterConnection__InputAssignment_6 ) ) )
            // InternalRosNetworkDsl.g:5814:1: ( ( rule__FilterConnection__InputAssignment_6 ) )
            {
            // InternalRosNetworkDsl.g:5814:1: ( ( rule__FilterConnection__InputAssignment_6 ) )
            // InternalRosNetworkDsl.g:5815:2: ( rule__FilterConnection__InputAssignment_6 )
            {
             before(grammarAccess.getFilterConnectionAccess().getInputAssignment_6()); 
            // InternalRosNetworkDsl.g:5816:2: ( rule__FilterConnection__InputAssignment_6 )
            // InternalRosNetworkDsl.g:5816:3: rule__FilterConnection__InputAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FilterConnection__InputAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFilterConnectionAccess().getInputAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__6__Impl"


    // $ANTLR start "rule__FilterConnection__Group__7"
    // InternalRosNetworkDsl.g:5824:1: rule__FilterConnection__Group__7 : rule__FilterConnection__Group__7__Impl rule__FilterConnection__Group__8 ;
    public final void rule__FilterConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5828:1: ( rule__FilterConnection__Group__7__Impl rule__FilterConnection__Group__8 )
            // InternalRosNetworkDsl.g:5829:2: rule__FilterConnection__Group__7__Impl rule__FilterConnection__Group__8
            {
            pushFollow(FOLLOW_59);
            rule__FilterConnection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterConnection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__7"


    // $ANTLR start "rule__FilterConnection__Group__7__Impl"
    // InternalRosNetworkDsl.g:5836:1: rule__FilterConnection__Group__7__Impl : ( ( rule__FilterConnection__Group_7__0 )* ) ;
    public final void rule__FilterConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5840:1: ( ( ( rule__FilterConnection__Group_7__0 )* ) )
            // InternalRosNetworkDsl.g:5841:1: ( ( rule__FilterConnection__Group_7__0 )* )
            {
            // InternalRosNetworkDsl.g:5841:1: ( ( rule__FilterConnection__Group_7__0 )* )
            // InternalRosNetworkDsl.g:5842:2: ( rule__FilterConnection__Group_7__0 )*
            {
             before(grammarAccess.getFilterConnectionAccess().getGroup_7()); 
            // InternalRosNetworkDsl.g:5843:2: ( rule__FilterConnection__Group_7__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==21) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalRosNetworkDsl.g:5843:3: rule__FilterConnection__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__FilterConnection__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getFilterConnectionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__7__Impl"


    // $ANTLR start "rule__FilterConnection__Group__8"
    // InternalRosNetworkDsl.g:5851:1: rule__FilterConnection__Group__8 : rule__FilterConnection__Group__8__Impl rule__FilterConnection__Group__9 ;
    public final void rule__FilterConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5855:1: ( rule__FilterConnection__Group__8__Impl rule__FilterConnection__Group__9 )
            // InternalRosNetworkDsl.g:5856:2: rule__FilterConnection__Group__8__Impl rule__FilterConnection__Group__9
            {
            pushFollow(FOLLOW_33);
            rule__FilterConnection__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterConnection__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__8"


    // $ANTLR start "rule__FilterConnection__Group__8__Impl"
    // InternalRosNetworkDsl.g:5863:1: rule__FilterConnection__Group__8__Impl : ( ']' ) ;
    public final void rule__FilterConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5867:1: ( ( ']' ) )
            // InternalRosNetworkDsl.g:5868:1: ( ']' )
            {
            // InternalRosNetworkDsl.g:5868:1: ( ']' )
            // InternalRosNetworkDsl.g:5869:2: ']'
            {
             before(grammarAccess.getFilterConnectionAccess().getRightSquareBracketKeyword_8()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getFilterConnectionAccess().getRightSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__8__Impl"


    // $ANTLR start "rule__FilterConnection__Group__9"
    // InternalRosNetworkDsl.g:5878:1: rule__FilterConnection__Group__9 : rule__FilterConnection__Group__9__Impl rule__FilterConnection__Group__10 ;
    public final void rule__FilterConnection__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5882:1: ( rule__FilterConnection__Group__9__Impl rule__FilterConnection__Group__10 )
            // InternalRosNetworkDsl.g:5883:2: rule__FilterConnection__Group__9__Impl rule__FilterConnection__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__FilterConnection__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterConnection__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__9"


    // $ANTLR start "rule__FilterConnection__Group__9__Impl"
    // InternalRosNetworkDsl.g:5890:1: rule__FilterConnection__Group__9__Impl : ( '->' ) ;
    public final void rule__FilterConnection__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5894:1: ( ( '->' ) )
            // InternalRosNetworkDsl.g:5895:1: ( '->' )
            {
            // InternalRosNetworkDsl.g:5895:1: ( '->' )
            // InternalRosNetworkDsl.g:5896:2: '->'
            {
             before(grammarAccess.getFilterConnectionAccess().getHyphenMinusGreaterThanSignKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFilterConnectionAccess().getHyphenMinusGreaterThanSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__9__Impl"


    // $ANTLR start "rule__FilterConnection__Group__10"
    // InternalRosNetworkDsl.g:5905:1: rule__FilterConnection__Group__10 : rule__FilterConnection__Group__10__Impl ;
    public final void rule__FilterConnection__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5909:1: ( rule__FilterConnection__Group__10__Impl )
            // InternalRosNetworkDsl.g:5910:2: rule__FilterConnection__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterConnection__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__10"


    // $ANTLR start "rule__FilterConnection__Group__10__Impl"
    // InternalRosNetworkDsl.g:5916:1: rule__FilterConnection__Group__10__Impl : ( ( rule__FilterConnection__OutputAssignment_10 ) ) ;
    public final void rule__FilterConnection__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5920:1: ( ( ( rule__FilterConnection__OutputAssignment_10 ) ) )
            // InternalRosNetworkDsl.g:5921:1: ( ( rule__FilterConnection__OutputAssignment_10 ) )
            {
            // InternalRosNetworkDsl.g:5921:1: ( ( rule__FilterConnection__OutputAssignment_10 ) )
            // InternalRosNetworkDsl.g:5922:2: ( rule__FilterConnection__OutputAssignment_10 )
            {
             before(grammarAccess.getFilterConnectionAccess().getOutputAssignment_10()); 
            // InternalRosNetworkDsl.g:5923:2: ( rule__FilterConnection__OutputAssignment_10 )
            // InternalRosNetworkDsl.g:5923:3: rule__FilterConnection__OutputAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__FilterConnection__OutputAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getFilterConnectionAccess().getOutputAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group__10__Impl"


    // $ANTLR start "rule__FilterConnection__Group_7__0"
    // InternalRosNetworkDsl.g:5932:1: rule__FilterConnection__Group_7__0 : rule__FilterConnection__Group_7__0__Impl rule__FilterConnection__Group_7__1 ;
    public final void rule__FilterConnection__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5936:1: ( rule__FilterConnection__Group_7__0__Impl rule__FilterConnection__Group_7__1 )
            // InternalRosNetworkDsl.g:5937:2: rule__FilterConnection__Group_7__0__Impl rule__FilterConnection__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__FilterConnection__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterConnection__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group_7__0"


    // $ANTLR start "rule__FilterConnection__Group_7__0__Impl"
    // InternalRosNetworkDsl.g:5944:1: rule__FilterConnection__Group_7__0__Impl : ( ',' ) ;
    public final void rule__FilterConnection__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5948:1: ( ( ',' ) )
            // InternalRosNetworkDsl.g:5949:1: ( ',' )
            {
            // InternalRosNetworkDsl.g:5949:1: ( ',' )
            // InternalRosNetworkDsl.g:5950:2: ','
            {
             before(grammarAccess.getFilterConnectionAccess().getCommaKeyword_7_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFilterConnectionAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group_7__0__Impl"


    // $ANTLR start "rule__FilterConnection__Group_7__1"
    // InternalRosNetworkDsl.g:5959:1: rule__FilterConnection__Group_7__1 : rule__FilterConnection__Group_7__1__Impl ;
    public final void rule__FilterConnection__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5963:1: ( rule__FilterConnection__Group_7__1__Impl )
            // InternalRosNetworkDsl.g:5964:2: rule__FilterConnection__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterConnection__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group_7__1"


    // $ANTLR start "rule__FilterConnection__Group_7__1__Impl"
    // InternalRosNetworkDsl.g:5970:1: rule__FilterConnection__Group_7__1__Impl : ( ( rule__FilterConnection__InputAssignment_7_1 ) ) ;
    public final void rule__FilterConnection__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5974:1: ( ( ( rule__FilterConnection__InputAssignment_7_1 ) ) )
            // InternalRosNetworkDsl.g:5975:1: ( ( rule__FilterConnection__InputAssignment_7_1 ) )
            {
            // InternalRosNetworkDsl.g:5975:1: ( ( rule__FilterConnection__InputAssignment_7_1 ) )
            // InternalRosNetworkDsl.g:5976:2: ( rule__FilterConnection__InputAssignment_7_1 )
            {
             before(grammarAccess.getFilterConnectionAccess().getInputAssignment_7_1()); 
            // InternalRosNetworkDsl.g:5977:2: ( rule__FilterConnection__InputAssignment_7_1 )
            // InternalRosNetworkDsl.g:5977:3: rule__FilterConnection__InputAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterConnection__InputAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterConnectionAccess().getInputAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__Group_7__1__Impl"


    // $ANTLR start "rule__ContinuousState__Group__0"
    // InternalRosNetworkDsl.g:5986:1: rule__ContinuousState__Group__0 : rule__ContinuousState__Group__0__Impl rule__ContinuousState__Group__1 ;
    public final void rule__ContinuousState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:5990:1: ( rule__ContinuousState__Group__0__Impl rule__ContinuousState__Group__1 )
            // InternalRosNetworkDsl.g:5991:2: rule__ContinuousState__Group__0__Impl rule__ContinuousState__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__ContinuousState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContinuousState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContinuousState__Group__0"


    // $ANTLR start "rule__ContinuousState__Group__0__Impl"
    // InternalRosNetworkDsl.g:5998:1: rule__ContinuousState__Group__0__Impl : ( () ) ;
    public final void rule__ContinuousState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6002:1: ( ( () ) )
            // InternalRosNetworkDsl.g:6003:1: ( () )
            {
            // InternalRosNetworkDsl.g:6003:1: ( () )
            // InternalRosNetworkDsl.g:6004:2: ()
            {
             before(grammarAccess.getContinuousStateAccess().getContinousStateAction_0()); 
            // InternalRosNetworkDsl.g:6005:2: ()
            // InternalRosNetworkDsl.g:6005:3: 
            {
            }

             after(grammarAccess.getContinuousStateAccess().getContinousStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContinuousState__Group__0__Impl"


    // $ANTLR start "rule__ContinuousState__Group__1"
    // InternalRosNetworkDsl.g:6013:1: rule__ContinuousState__Group__1 : rule__ContinuousState__Group__1__Impl rule__ContinuousState__Group__2 ;
    public final void rule__ContinuousState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6017:1: ( rule__ContinuousState__Group__1__Impl rule__ContinuousState__Group__2 )
            // InternalRosNetworkDsl.g:6018:2: rule__ContinuousState__Group__1__Impl rule__ContinuousState__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ContinuousState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContinuousState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContinuousState__Group__1"


    // $ANTLR start "rule__ContinuousState__Group__1__Impl"
    // InternalRosNetworkDsl.g:6025:1: rule__ContinuousState__Group__1__Impl : ( 'continuousstate' ) ;
    public final void rule__ContinuousState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6029:1: ( ( 'continuousstate' ) )
            // InternalRosNetworkDsl.g:6030:1: ( 'continuousstate' )
            {
            // InternalRosNetworkDsl.g:6030:1: ( 'continuousstate' )
            // InternalRosNetworkDsl.g:6031:2: 'continuousstate'
            {
             before(grammarAccess.getContinuousStateAccess().getContinuousstateKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getContinuousStateAccess().getContinuousstateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContinuousState__Group__1__Impl"


    // $ANTLR start "rule__ContinuousState__Group__2"
    // InternalRosNetworkDsl.g:6040:1: rule__ContinuousState__Group__2 : rule__ContinuousState__Group__2__Impl ;
    public final void rule__ContinuousState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6044:1: ( rule__ContinuousState__Group__2__Impl )
            // InternalRosNetworkDsl.g:6045:2: rule__ContinuousState__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContinuousState__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContinuousState__Group__2"


    // $ANTLR start "rule__ContinuousState__Group__2__Impl"
    // InternalRosNetworkDsl.g:6051:1: rule__ContinuousState__Group__2__Impl : ( ( rule__ContinuousState__NameAssignment_2 ) ) ;
    public final void rule__ContinuousState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6055:1: ( ( ( rule__ContinuousState__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:6056:1: ( ( rule__ContinuousState__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:6056:1: ( ( rule__ContinuousState__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:6057:2: ( rule__ContinuousState__NameAssignment_2 )
            {
             before(grammarAccess.getContinuousStateAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:6058:2: ( rule__ContinuousState__NameAssignment_2 )
            // InternalRosNetworkDsl.g:6058:3: rule__ContinuousState__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContinuousState__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContinuousStateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContinuousState__Group__2__Impl"


    // $ANTLR start "rule__InputPort__Group__0"
    // InternalRosNetworkDsl.g:6067:1: rule__InputPort__Group__0 : rule__InputPort__Group__0__Impl rule__InputPort__Group__1 ;
    public final void rule__InputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6071:1: ( rule__InputPort__Group__0__Impl rule__InputPort__Group__1 )
            // InternalRosNetworkDsl.g:6072:2: rule__InputPort__Group__0__Impl rule__InputPort__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__InputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__0"


    // $ANTLR start "rule__InputPort__Group__0__Impl"
    // InternalRosNetworkDsl.g:6079:1: rule__InputPort__Group__0__Impl : ( () ) ;
    public final void rule__InputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6083:1: ( ( () ) )
            // InternalRosNetworkDsl.g:6084:1: ( () )
            {
            // InternalRosNetworkDsl.g:6084:1: ( () )
            // InternalRosNetworkDsl.g:6085:2: ()
            {
             before(grammarAccess.getInputPortAccess().getInputPortAction_0()); 
            // InternalRosNetworkDsl.g:6086:2: ()
            // InternalRosNetworkDsl.g:6086:3: 
            {
            }

             after(grammarAccess.getInputPortAccess().getInputPortAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__0__Impl"


    // $ANTLR start "rule__InputPort__Group__1"
    // InternalRosNetworkDsl.g:6094:1: rule__InputPort__Group__1 : rule__InputPort__Group__1__Impl rule__InputPort__Group__2 ;
    public final void rule__InputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6098:1: ( rule__InputPort__Group__1__Impl rule__InputPort__Group__2 )
            // InternalRosNetworkDsl.g:6099:2: rule__InputPort__Group__1__Impl rule__InputPort__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__InputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__1"


    // $ANTLR start "rule__InputPort__Group__1__Impl"
    // InternalRosNetworkDsl.g:6106:1: rule__InputPort__Group__1__Impl : ( 'port' ) ;
    public final void rule__InputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6110:1: ( ( 'port' ) )
            // InternalRosNetworkDsl.g:6111:1: ( 'port' )
            {
            // InternalRosNetworkDsl.g:6111:1: ( 'port' )
            // InternalRosNetworkDsl.g:6112:2: 'port'
            {
             before(grammarAccess.getInputPortAccess().getPortKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getPortKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__1__Impl"


    // $ANTLR start "rule__InputPort__Group__2"
    // InternalRosNetworkDsl.g:6121:1: rule__InputPort__Group__2 : rule__InputPort__Group__2__Impl rule__InputPort__Group__3 ;
    public final void rule__InputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6125:1: ( rule__InputPort__Group__2__Impl rule__InputPort__Group__3 )
            // InternalRosNetworkDsl.g:6126:2: rule__InputPort__Group__2__Impl rule__InputPort__Group__3
            {
            pushFollow(FOLLOW_60);
            rule__InputPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__2"


    // $ANTLR start "rule__InputPort__Group__2__Impl"
    // InternalRosNetworkDsl.g:6133:1: rule__InputPort__Group__2__Impl : ( ( rule__InputPort__NameAssignment_2 ) ) ;
    public final void rule__InputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6137:1: ( ( ( rule__InputPort__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:6138:1: ( ( rule__InputPort__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:6138:1: ( ( rule__InputPort__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:6139:2: ( rule__InputPort__NameAssignment_2 )
            {
             before(grammarAccess.getInputPortAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:6140:2: ( rule__InputPort__NameAssignment_2 )
            // InternalRosNetworkDsl.g:6140:3: rule__InputPort__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__2__Impl"


    // $ANTLR start "rule__InputPort__Group__3"
    // InternalRosNetworkDsl.g:6148:1: rule__InputPort__Group__3 : rule__InputPort__Group__3__Impl rule__InputPort__Group__4 ;
    public final void rule__InputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6152:1: ( rule__InputPort__Group__3__Impl rule__InputPort__Group__4 )
            // InternalRosNetworkDsl.g:6153:2: rule__InputPort__Group__3__Impl rule__InputPort__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__InputPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__3"


    // $ANTLR start "rule__InputPort__Group__3__Impl"
    // InternalRosNetworkDsl.g:6160:1: rule__InputPort__Group__3__Impl : ( '<-' ) ;
    public final void rule__InputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6164:1: ( ( '<-' ) )
            // InternalRosNetworkDsl.g:6165:1: ( '<-' )
            {
            // InternalRosNetworkDsl.g:6165:1: ( '<-' )
            // InternalRosNetworkDsl.g:6166:2: '<-'
            {
             before(grammarAccess.getInputPortAccess().getLessThanSignHyphenMinusKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getLessThanSignHyphenMinusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__3__Impl"


    // $ANTLR start "rule__InputPort__Group__4"
    // InternalRosNetworkDsl.g:6175:1: rule__InputPort__Group__4 : rule__InputPort__Group__4__Impl rule__InputPort__Group__5 ;
    public final void rule__InputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6179:1: ( rule__InputPort__Group__4__Impl rule__InputPort__Group__5 )
            // InternalRosNetworkDsl.g:6180:2: rule__InputPort__Group__4__Impl rule__InputPort__Group__5
            {
            pushFollow(FOLLOW_61);
            rule__InputPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__4"


    // $ANTLR start "rule__InputPort__Group__4__Impl"
    // InternalRosNetworkDsl.g:6187:1: rule__InputPort__Group__4__Impl : ( ( rule__InputPort__ChannelAssignment_4 ) ) ;
    public final void rule__InputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6191:1: ( ( ( rule__InputPort__ChannelAssignment_4 ) ) )
            // InternalRosNetworkDsl.g:6192:1: ( ( rule__InputPort__ChannelAssignment_4 ) )
            {
            // InternalRosNetworkDsl.g:6192:1: ( ( rule__InputPort__ChannelAssignment_4 ) )
            // InternalRosNetworkDsl.g:6193:2: ( rule__InputPort__ChannelAssignment_4 )
            {
             before(grammarAccess.getInputPortAccess().getChannelAssignment_4()); 
            // InternalRosNetworkDsl.g:6194:2: ( rule__InputPort__ChannelAssignment_4 )
            // InternalRosNetworkDsl.g:6194:3: rule__InputPort__ChannelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__ChannelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getChannelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__4__Impl"


    // $ANTLR start "rule__InputPort__Group__5"
    // InternalRosNetworkDsl.g:6202:1: rule__InputPort__Group__5 : rule__InputPort__Group__5__Impl rule__InputPort__Group__6 ;
    public final void rule__InputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6206:1: ( rule__InputPort__Group__5__Impl rule__InputPort__Group__6 )
            // InternalRosNetworkDsl.g:6207:2: rule__InputPort__Group__5__Impl rule__InputPort__Group__6
            {
            pushFollow(FOLLOW_61);
            rule__InputPort__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__5"


    // $ANTLR start "rule__InputPort__Group__5__Impl"
    // InternalRosNetworkDsl.g:6214:1: rule__InputPort__Group__5__Impl : ( ( rule__InputPort__Group_5__0 )? ) ;
    public final void rule__InputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6218:1: ( ( ( rule__InputPort__Group_5__0 )? ) )
            // InternalRosNetworkDsl.g:6219:1: ( ( rule__InputPort__Group_5__0 )? )
            {
            // InternalRosNetworkDsl.g:6219:1: ( ( rule__InputPort__Group_5__0 )? )
            // InternalRosNetworkDsl.g:6220:2: ( rule__InputPort__Group_5__0 )?
            {
             before(grammarAccess.getInputPortAccess().getGroup_5()); 
            // InternalRosNetworkDsl.g:6221:2: ( rule__InputPort__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==55) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRosNetworkDsl.g:6221:3: rule__InputPort__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputPort__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputPortAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__5__Impl"


    // $ANTLR start "rule__InputPort__Group__6"
    // InternalRosNetworkDsl.g:6229:1: rule__InputPort__Group__6 : rule__InputPort__Group__6__Impl ;
    public final void rule__InputPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6233:1: ( rule__InputPort__Group__6__Impl )
            // InternalRosNetworkDsl.g:6234:2: rule__InputPort__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__6"


    // $ANTLR start "rule__InputPort__Group__6__Impl"
    // InternalRosNetworkDsl.g:6240:1: rule__InputPort__Group__6__Impl : ( ( rule__InputPort__Group_6__0 )? ) ;
    public final void rule__InputPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6244:1: ( ( ( rule__InputPort__Group_6__0 )? ) )
            // InternalRosNetworkDsl.g:6245:1: ( ( rule__InputPort__Group_6__0 )? )
            {
            // InternalRosNetworkDsl.g:6245:1: ( ( rule__InputPort__Group_6__0 )? )
            // InternalRosNetworkDsl.g:6246:2: ( rule__InputPort__Group_6__0 )?
            {
             before(grammarAccess.getInputPortAccess().getGroup_6()); 
            // InternalRosNetworkDsl.g:6247:2: ( rule__InputPort__Group_6__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==57) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRosNetworkDsl.g:6247:3: rule__InputPort__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputPort__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputPortAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__6__Impl"


    // $ANTLR start "rule__InputPort__Group_5__0"
    // InternalRosNetworkDsl.g:6256:1: rule__InputPort__Group_5__0 : rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1 ;
    public final void rule__InputPort__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6260:1: ( rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1 )
            // InternalRosNetworkDsl.g:6261:2: rule__InputPort__Group_5__0__Impl rule__InputPort__Group_5__1
            {
            pushFollow(FOLLOW_35);
            rule__InputPort__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__0"


    // $ANTLR start "rule__InputPort__Group_5__0__Impl"
    // InternalRosNetworkDsl.g:6268:1: rule__InputPort__Group_5__0__Impl : ( 'estimated_freq' ) ;
    public final void rule__InputPort__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6272:1: ( ( 'estimated_freq' ) )
            // InternalRosNetworkDsl.g:6273:1: ( 'estimated_freq' )
            {
            // InternalRosNetworkDsl.g:6273:1: ( 'estimated_freq' )
            // InternalRosNetworkDsl.g:6274:2: 'estimated_freq'
            {
             before(grammarAccess.getInputPortAccess().getEstimated_freqKeyword_5_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getEstimated_freqKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__0__Impl"


    // $ANTLR start "rule__InputPort__Group_5__1"
    // InternalRosNetworkDsl.g:6283:1: rule__InputPort__Group_5__1 : rule__InputPort__Group_5__1__Impl rule__InputPort__Group_5__2 ;
    public final void rule__InputPort__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6287:1: ( rule__InputPort__Group_5__1__Impl rule__InputPort__Group_5__2 )
            // InternalRosNetworkDsl.g:6288:2: rule__InputPort__Group_5__1__Impl rule__InputPort__Group_5__2
            {
            pushFollow(FOLLOW_62);
            rule__InputPort__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__1"


    // $ANTLR start "rule__InputPort__Group_5__1__Impl"
    // InternalRosNetworkDsl.g:6295:1: rule__InputPort__Group_5__1__Impl : ( ( rule__InputPort__Estimated_freqAssignment_5_1 ) ) ;
    public final void rule__InputPort__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6299:1: ( ( ( rule__InputPort__Estimated_freqAssignment_5_1 ) ) )
            // InternalRosNetworkDsl.g:6300:1: ( ( rule__InputPort__Estimated_freqAssignment_5_1 ) )
            {
            // InternalRosNetworkDsl.g:6300:1: ( ( rule__InputPort__Estimated_freqAssignment_5_1 ) )
            // InternalRosNetworkDsl.g:6301:2: ( rule__InputPort__Estimated_freqAssignment_5_1 )
            {
             before(grammarAccess.getInputPortAccess().getEstimated_freqAssignment_5_1()); 
            // InternalRosNetworkDsl.g:6302:2: ( rule__InputPort__Estimated_freqAssignment_5_1 )
            // InternalRosNetworkDsl.g:6302:3: rule__InputPort__Estimated_freqAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__Estimated_freqAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getEstimated_freqAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__1__Impl"


    // $ANTLR start "rule__InputPort__Group_5__2"
    // InternalRosNetworkDsl.g:6310:1: rule__InputPort__Group_5__2 : rule__InputPort__Group_5__2__Impl rule__InputPort__Group_5__3 ;
    public final void rule__InputPort__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6314:1: ( rule__InputPort__Group_5__2__Impl rule__InputPort__Group_5__3 )
            // InternalRosNetworkDsl.g:6315:2: rule__InputPort__Group_5__2__Impl rule__InputPort__Group_5__3
            {
            pushFollow(FOLLOW_35);
            rule__InputPort__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__2"


    // $ANTLR start "rule__InputPort__Group_5__2__Impl"
    // InternalRosNetworkDsl.g:6322:1: rule__InputPort__Group_5__2__Impl : ( 'sample_tolerance' ) ;
    public final void rule__InputPort__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6326:1: ( ( 'sample_tolerance' ) )
            // InternalRosNetworkDsl.g:6327:1: ( 'sample_tolerance' )
            {
            // InternalRosNetworkDsl.g:6327:1: ( 'sample_tolerance' )
            // InternalRosNetworkDsl.g:6328:2: 'sample_tolerance'
            {
             before(grammarAccess.getInputPortAccess().getSample_toleranceKeyword_5_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getSample_toleranceKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__2__Impl"


    // $ANTLR start "rule__InputPort__Group_5__3"
    // InternalRosNetworkDsl.g:6337:1: rule__InputPort__Group_5__3 : rule__InputPort__Group_5__3__Impl rule__InputPort__Group_5__4 ;
    public final void rule__InputPort__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6341:1: ( rule__InputPort__Group_5__3__Impl rule__InputPort__Group_5__4 )
            // InternalRosNetworkDsl.g:6342:2: rule__InputPort__Group_5__3__Impl rule__InputPort__Group_5__4
            {
            pushFollow(FOLLOW_63);
            rule__InputPort__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__3"


    // $ANTLR start "rule__InputPort__Group_5__3__Impl"
    // InternalRosNetworkDsl.g:6349:1: rule__InputPort__Group_5__3__Impl : ( ( rule__InputPort__Sample_toleranceAssignment_5_3 ) ) ;
    public final void rule__InputPort__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6353:1: ( ( ( rule__InputPort__Sample_toleranceAssignment_5_3 ) ) )
            // InternalRosNetworkDsl.g:6354:1: ( ( rule__InputPort__Sample_toleranceAssignment_5_3 ) )
            {
            // InternalRosNetworkDsl.g:6354:1: ( ( rule__InputPort__Sample_toleranceAssignment_5_3 ) )
            // InternalRosNetworkDsl.g:6355:2: ( rule__InputPort__Sample_toleranceAssignment_5_3 )
            {
             before(grammarAccess.getInputPortAccess().getSample_toleranceAssignment_5_3()); 
            // InternalRosNetworkDsl.g:6356:2: ( rule__InputPort__Sample_toleranceAssignment_5_3 )
            // InternalRosNetworkDsl.g:6356:3: rule__InputPort__Sample_toleranceAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__Sample_toleranceAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getSample_toleranceAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__3__Impl"


    // $ANTLR start "rule__InputPort__Group_5__4"
    // InternalRosNetworkDsl.g:6364:1: rule__InputPort__Group_5__4 : rule__InputPort__Group_5__4__Impl ;
    public final void rule__InputPort__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6368:1: ( rule__InputPort__Group_5__4__Impl )
            // InternalRosNetworkDsl.g:6369:2: rule__InputPort__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__4"


    // $ANTLR start "rule__InputPort__Group_5__4__Impl"
    // InternalRosNetworkDsl.g:6375:1: rule__InputPort__Group_5__4__Impl : ( ( rule__InputPort__DebugAssignment_5_4 )? ) ;
    public final void rule__InputPort__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6379:1: ( ( ( rule__InputPort__DebugAssignment_5_4 )? ) )
            // InternalRosNetworkDsl.g:6380:1: ( ( rule__InputPort__DebugAssignment_5_4 )? )
            {
            // InternalRosNetworkDsl.g:6380:1: ( ( rule__InputPort__DebugAssignment_5_4 )? )
            // InternalRosNetworkDsl.g:6381:2: ( rule__InputPort__DebugAssignment_5_4 )?
            {
             before(grammarAccess.getInputPortAccess().getDebugAssignment_5_4()); 
            // InternalRosNetworkDsl.g:6382:2: ( rule__InputPort__DebugAssignment_5_4 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==59) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRosNetworkDsl.g:6382:3: rule__InputPort__DebugAssignment_5_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputPort__DebugAssignment_5_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputPortAccess().getDebugAssignment_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_5__4__Impl"


    // $ANTLR start "rule__InputPort__Group_6__0"
    // InternalRosNetworkDsl.g:6391:1: rule__InputPort__Group_6__0 : rule__InputPort__Group_6__0__Impl rule__InputPort__Group_6__1 ;
    public final void rule__InputPort__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6395:1: ( rule__InputPort__Group_6__0__Impl rule__InputPort__Group_6__1 )
            // InternalRosNetworkDsl.g:6396:2: rule__InputPort__Group_6__0__Impl rule__InputPort__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__InputPort__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_6__0"


    // $ANTLR start "rule__InputPort__Group_6__0__Impl"
    // InternalRosNetworkDsl.g:6403:1: rule__InputPort__Group_6__0__Impl : ( 'syncstate' ) ;
    public final void rule__InputPort__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6407:1: ( ( 'syncstate' ) )
            // InternalRosNetworkDsl.g:6408:1: ( 'syncstate' )
            {
            // InternalRosNetworkDsl.g:6408:1: ( 'syncstate' )
            // InternalRosNetworkDsl.g:6409:2: 'syncstate'
            {
             before(grammarAccess.getInputPortAccess().getSyncstateKeyword_6_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getSyncstateKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_6__0__Impl"


    // $ANTLR start "rule__InputPort__Group_6__1"
    // InternalRosNetworkDsl.g:6418:1: rule__InputPort__Group_6__1 : rule__InputPort__Group_6__1__Impl ;
    public final void rule__InputPort__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6422:1: ( rule__InputPort__Group_6__1__Impl )
            // InternalRosNetworkDsl.g:6423:2: rule__InputPort__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_6__1"


    // $ANTLR start "rule__InputPort__Group_6__1__Impl"
    // InternalRosNetworkDsl.g:6429:1: rule__InputPort__Group_6__1__Impl : ( ( rule__InputPort__SynchronizesStateAssignment_6_1 ) ) ;
    public final void rule__InputPort__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6433:1: ( ( ( rule__InputPort__SynchronizesStateAssignment_6_1 ) ) )
            // InternalRosNetworkDsl.g:6434:1: ( ( rule__InputPort__SynchronizesStateAssignment_6_1 ) )
            {
            // InternalRosNetworkDsl.g:6434:1: ( ( rule__InputPort__SynchronizesStateAssignment_6_1 ) )
            // InternalRosNetworkDsl.g:6435:2: ( rule__InputPort__SynchronizesStateAssignment_6_1 )
            {
             before(grammarAccess.getInputPortAccess().getSynchronizesStateAssignment_6_1()); 
            // InternalRosNetworkDsl.g:6436:2: ( rule__InputPort__SynchronizesStateAssignment_6_1 )
            // InternalRosNetworkDsl.g:6436:3: rule__InputPort__SynchronizesStateAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__SynchronizesStateAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getSynchronizesStateAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group_6__1__Impl"


    // $ANTLR start "rule__OutputPort__Group__0"
    // InternalRosNetworkDsl.g:6445:1: rule__OutputPort__Group__0 : rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 ;
    public final void rule__OutputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6449:1: ( rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 )
            // InternalRosNetworkDsl.g:6450:2: rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__OutputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__0"


    // $ANTLR start "rule__OutputPort__Group__0__Impl"
    // InternalRosNetworkDsl.g:6457:1: rule__OutputPort__Group__0__Impl : ( () ) ;
    public final void rule__OutputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6461:1: ( ( () ) )
            // InternalRosNetworkDsl.g:6462:1: ( () )
            {
            // InternalRosNetworkDsl.g:6462:1: ( () )
            // InternalRosNetworkDsl.g:6463:2: ()
            {
             before(grammarAccess.getOutputPortAccess().getOutputPortAction_0()); 
            // InternalRosNetworkDsl.g:6464:2: ()
            // InternalRosNetworkDsl.g:6464:3: 
            {
            }

             after(grammarAccess.getOutputPortAccess().getOutputPortAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__0__Impl"


    // $ANTLR start "rule__OutputPort__Group__1"
    // InternalRosNetworkDsl.g:6472:1: rule__OutputPort__Group__1 : rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 ;
    public final void rule__OutputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6476:1: ( rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 )
            // InternalRosNetworkDsl.g:6477:2: rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__OutputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__1"


    // $ANTLR start "rule__OutputPort__Group__1__Impl"
    // InternalRosNetworkDsl.g:6484:1: rule__OutputPort__Group__1__Impl : ( 'port' ) ;
    public final void rule__OutputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6488:1: ( ( 'port' ) )
            // InternalRosNetworkDsl.g:6489:1: ( 'port' )
            {
            // InternalRosNetworkDsl.g:6489:1: ( 'port' )
            // InternalRosNetworkDsl.g:6490:2: 'port'
            {
             before(grammarAccess.getOutputPortAccess().getPortKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getPortKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__1__Impl"


    // $ANTLR start "rule__OutputPort__Group__2"
    // InternalRosNetworkDsl.g:6499:1: rule__OutputPort__Group__2 : rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 ;
    public final void rule__OutputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6503:1: ( rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 )
            // InternalRosNetworkDsl.g:6504:2: rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__OutputPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__2"


    // $ANTLR start "rule__OutputPort__Group__2__Impl"
    // InternalRosNetworkDsl.g:6511:1: rule__OutputPort__Group__2__Impl : ( ( rule__OutputPort__NameAssignment_2 ) ) ;
    public final void rule__OutputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6515:1: ( ( ( rule__OutputPort__NameAssignment_2 ) ) )
            // InternalRosNetworkDsl.g:6516:1: ( ( rule__OutputPort__NameAssignment_2 ) )
            {
            // InternalRosNetworkDsl.g:6516:1: ( ( rule__OutputPort__NameAssignment_2 ) )
            // InternalRosNetworkDsl.g:6517:2: ( rule__OutputPort__NameAssignment_2 )
            {
             before(grammarAccess.getOutputPortAccess().getNameAssignment_2()); 
            // InternalRosNetworkDsl.g:6518:2: ( rule__OutputPort__NameAssignment_2 )
            // InternalRosNetworkDsl.g:6518:3: rule__OutputPort__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__2__Impl"


    // $ANTLR start "rule__OutputPort__Group__3"
    // InternalRosNetworkDsl.g:6526:1: rule__OutputPort__Group__3 : rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 ;
    public final void rule__OutputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6530:1: ( rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 )
            // InternalRosNetworkDsl.g:6531:2: rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__OutputPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__3"


    // $ANTLR start "rule__OutputPort__Group__3__Impl"
    // InternalRosNetworkDsl.g:6538:1: rule__OutputPort__Group__3__Impl : ( '->' ) ;
    public final void rule__OutputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6542:1: ( ( '->' ) )
            // InternalRosNetworkDsl.g:6543:1: ( '->' )
            {
            // InternalRosNetworkDsl.g:6543:1: ( '->' )
            // InternalRosNetworkDsl.g:6544:2: '->'
            {
             before(grammarAccess.getOutputPortAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__3__Impl"


    // $ANTLR start "rule__OutputPort__Group__4"
    // InternalRosNetworkDsl.g:6553:1: rule__OutputPort__Group__4 : rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 ;
    public final void rule__OutputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6557:1: ( rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 )
            // InternalRosNetworkDsl.g:6558:2: rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5
            {
            pushFollow(FOLLOW_64);
            rule__OutputPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__4"


    // $ANTLR start "rule__OutputPort__Group__4__Impl"
    // InternalRosNetworkDsl.g:6565:1: rule__OutputPort__Group__4__Impl : ( ( rule__OutputPort__ChannelAssignment_4 ) ) ;
    public final void rule__OutputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6569:1: ( ( ( rule__OutputPort__ChannelAssignment_4 ) ) )
            // InternalRosNetworkDsl.g:6570:1: ( ( rule__OutputPort__ChannelAssignment_4 ) )
            {
            // InternalRosNetworkDsl.g:6570:1: ( ( rule__OutputPort__ChannelAssignment_4 ) )
            // InternalRosNetworkDsl.g:6571:2: ( rule__OutputPort__ChannelAssignment_4 )
            {
             before(grammarAccess.getOutputPortAccess().getChannelAssignment_4()); 
            // InternalRosNetworkDsl.g:6572:2: ( rule__OutputPort__ChannelAssignment_4 )
            // InternalRosNetworkDsl.g:6572:3: rule__OutputPort__ChannelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__ChannelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getChannelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__4__Impl"


    // $ANTLR start "rule__OutputPort__Group__5"
    // InternalRosNetworkDsl.g:6580:1: rule__OutputPort__Group__5 : rule__OutputPort__Group__5__Impl ;
    public final void rule__OutputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6584:1: ( rule__OutputPort__Group__5__Impl )
            // InternalRosNetworkDsl.g:6585:2: rule__OutputPort__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__5"


    // $ANTLR start "rule__OutputPort__Group__5__Impl"
    // InternalRosNetworkDsl.g:6591:1: rule__OutputPort__Group__5__Impl : ( ( rule__OutputPort__Group_5__0 ) ) ;
    public final void rule__OutputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6595:1: ( ( ( rule__OutputPort__Group_5__0 ) ) )
            // InternalRosNetworkDsl.g:6596:1: ( ( rule__OutputPort__Group_5__0 ) )
            {
            // InternalRosNetworkDsl.g:6596:1: ( ( rule__OutputPort__Group_5__0 ) )
            // InternalRosNetworkDsl.g:6597:2: ( rule__OutputPort__Group_5__0 )
            {
             before(grammarAccess.getOutputPortAccess().getGroup_5()); 
            // InternalRosNetworkDsl.g:6598:2: ( rule__OutputPort__Group_5__0 )
            // InternalRosNetworkDsl.g:6598:3: rule__OutputPort__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__5__Impl"


    // $ANTLR start "rule__OutputPort__Group_5__0"
    // InternalRosNetworkDsl.g:6607:1: rule__OutputPort__Group_5__0 : rule__OutputPort__Group_5__0__Impl rule__OutputPort__Group_5__1 ;
    public final void rule__OutputPort__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6611:1: ( rule__OutputPort__Group_5__0__Impl rule__OutputPort__Group_5__1 )
            // InternalRosNetworkDsl.g:6612:2: rule__OutputPort__Group_5__0__Impl rule__OutputPort__Group_5__1
            {
            pushFollow(FOLLOW_35);
            rule__OutputPort__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_5__0"


    // $ANTLR start "rule__OutputPort__Group_5__0__Impl"
    // InternalRosNetworkDsl.g:6619:1: rule__OutputPort__Group_5__0__Impl : ( 'estimated_freq' ) ;
    public final void rule__OutputPort__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6623:1: ( ( 'estimated_freq' ) )
            // InternalRosNetworkDsl.g:6624:1: ( 'estimated_freq' )
            {
            // InternalRosNetworkDsl.g:6624:1: ( 'estimated_freq' )
            // InternalRosNetworkDsl.g:6625:2: 'estimated_freq'
            {
             before(grammarAccess.getOutputPortAccess().getEstimated_freqKeyword_5_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getEstimated_freqKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_5__0__Impl"


    // $ANTLR start "rule__OutputPort__Group_5__1"
    // InternalRosNetworkDsl.g:6634:1: rule__OutputPort__Group_5__1 : rule__OutputPort__Group_5__1__Impl rule__OutputPort__Group_5__2 ;
    public final void rule__OutputPort__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6638:1: ( rule__OutputPort__Group_5__1__Impl rule__OutputPort__Group_5__2 )
            // InternalRosNetworkDsl.g:6639:2: rule__OutputPort__Group_5__1__Impl rule__OutputPort__Group_5__2
            {
            pushFollow(FOLLOW_63);
            rule__OutputPort__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_5__1"


    // $ANTLR start "rule__OutputPort__Group_5__1__Impl"
    // InternalRosNetworkDsl.g:6646:1: rule__OutputPort__Group_5__1__Impl : ( ( rule__OutputPort__Estimated_freqAssignment_5_1 ) ) ;
    public final void rule__OutputPort__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6650:1: ( ( ( rule__OutputPort__Estimated_freqAssignment_5_1 ) ) )
            // InternalRosNetworkDsl.g:6651:1: ( ( rule__OutputPort__Estimated_freqAssignment_5_1 ) )
            {
            // InternalRosNetworkDsl.g:6651:1: ( ( rule__OutputPort__Estimated_freqAssignment_5_1 ) )
            // InternalRosNetworkDsl.g:6652:2: ( rule__OutputPort__Estimated_freqAssignment_5_1 )
            {
             before(grammarAccess.getOutputPortAccess().getEstimated_freqAssignment_5_1()); 
            // InternalRosNetworkDsl.g:6653:2: ( rule__OutputPort__Estimated_freqAssignment_5_1 )
            // InternalRosNetworkDsl.g:6653:3: rule__OutputPort__Estimated_freqAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__Estimated_freqAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getEstimated_freqAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_5__1__Impl"


    // $ANTLR start "rule__OutputPort__Group_5__2"
    // InternalRosNetworkDsl.g:6661:1: rule__OutputPort__Group_5__2 : rule__OutputPort__Group_5__2__Impl ;
    public final void rule__OutputPort__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6665:1: ( rule__OutputPort__Group_5__2__Impl )
            // InternalRosNetworkDsl.g:6666:2: rule__OutputPort__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_5__2"


    // $ANTLR start "rule__OutputPort__Group_5__2__Impl"
    // InternalRosNetworkDsl.g:6672:1: rule__OutputPort__Group_5__2__Impl : ( ( rule__OutputPort__DebugAssignment_5_2 )? ) ;
    public final void rule__OutputPort__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6676:1: ( ( ( rule__OutputPort__DebugAssignment_5_2 )? ) )
            // InternalRosNetworkDsl.g:6677:1: ( ( rule__OutputPort__DebugAssignment_5_2 )? )
            {
            // InternalRosNetworkDsl.g:6677:1: ( ( rule__OutputPort__DebugAssignment_5_2 )? )
            // InternalRosNetworkDsl.g:6678:2: ( rule__OutputPort__DebugAssignment_5_2 )?
            {
             before(grammarAccess.getOutputPortAccess().getDebugAssignment_5_2()); 
            // InternalRosNetworkDsl.g:6679:2: ( rule__OutputPort__DebugAssignment_5_2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==59) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRosNetworkDsl.g:6679:3: rule__OutputPort__DebugAssignment_5_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__OutputPort__DebugAssignment_5_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputPortAccess().getDebugAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group_5__2__Impl"


    // $ANTLR start "rule__Double__Group__0"
    // InternalRosNetworkDsl.g:6688:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6692:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalRosNetworkDsl.g:6693:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_65);
            rule__Double__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0"


    // $ANTLR start "rule__Double__Group__0__Impl"
    // InternalRosNetworkDsl.g:6700:1: rule__Double__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6704:1: ( ( RULE_INT ) )
            // InternalRosNetworkDsl.g:6705:1: ( RULE_INT )
            {
            // InternalRosNetworkDsl.g:6705:1: ( RULE_INT )
            // InternalRosNetworkDsl.g:6706:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0__Impl"


    // $ANTLR start "rule__Double__Group__1"
    // InternalRosNetworkDsl.g:6715:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6719:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalRosNetworkDsl.g:6720:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Double__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1"


    // $ANTLR start "rule__Double__Group__1__Impl"
    // InternalRosNetworkDsl.g:6727:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6731:1: ( ( '.' ) )
            // InternalRosNetworkDsl.g:6732:1: ( '.' )
            {
            // InternalRosNetworkDsl.g:6732:1: ( '.' )
            // InternalRosNetworkDsl.g:6733:2: '.'
            {
             before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__2"
    // InternalRosNetworkDsl.g:6742:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6746:1: ( rule__Double__Group__2__Impl )
            // InternalRosNetworkDsl.g:6747:2: rule__Double__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2"


    // $ANTLR start "rule__Double__Group__2__Impl"
    // InternalRosNetworkDsl.g:6753:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6757:1: ( ( RULE_INT ) )
            // InternalRosNetworkDsl.g:6758:1: ( RULE_INT )
            {
            // InternalRosNetworkDsl.g:6758:1: ( RULE_INT )
            // InternalRosNetworkDsl.g:6759:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2__Impl"


    // $ANTLR start "rule__MiddleWareNetwork__NameAssignment_2"
    // InternalRosNetworkDsl.g:6769:1: rule__MiddleWareNetwork__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MiddleWareNetwork__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6773:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:6774:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:6774:2: ( ruleEString )
            // InternalRosNetworkDsl.g:6775:3: ruleEString
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMiddleWareNetworkAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__NameAssignment_2"


    // $ANTLR start "rule__MiddleWareNetwork__NetworktypeAssignment_5"
    // InternalRosNetworkDsl.g:6784:1: rule__MiddleWareNetwork__NetworktypeAssignment_5 : ( ruleNetworkType ) ;
    public final void rule__MiddleWareNetwork__NetworktypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6788:1: ( ( ruleNetworkType ) )
            // InternalRosNetworkDsl.g:6789:2: ( ruleNetworkType )
            {
            // InternalRosNetworkDsl.g:6789:2: ( ruleNetworkType )
            // InternalRosNetworkDsl.g:6790:3: ruleNetworkType
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getNetworktypeNetworkTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNetworkType();

            state._fsp--;

             after(grammarAccess.getMiddleWareNetworkAccess().getNetworktypeNetworkTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__NetworktypeAssignment_5"


    // $ANTLR start "rule__MiddleWareNetwork__NetworktypeAssignment_6_1"
    // InternalRosNetworkDsl.g:6799:1: rule__MiddleWareNetwork__NetworktypeAssignment_6_1 : ( ruleNetworkType ) ;
    public final void rule__MiddleWareNetwork__NetworktypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6803:1: ( ( ruleNetworkType ) )
            // InternalRosNetworkDsl.g:6804:2: ( ruleNetworkType )
            {
            // InternalRosNetworkDsl.g:6804:2: ( ruleNetworkType )
            // InternalRosNetworkDsl.g:6805:3: ruleNetworkType
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getNetworktypeNetworkTypeParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNetworkType();

            state._fsp--;

             after(grammarAccess.getMiddleWareNetworkAccess().getNetworktypeNetworkTypeParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__NetworktypeAssignment_6_1"


    // $ANTLR start "rule__MiddleWareNetwork__FilepackageAssignment_7"
    // InternalRosNetworkDsl.g:6814:1: rule__MiddleWareNetwork__FilepackageAssignment_7 : ( ruleFilePackage ) ;
    public final void rule__MiddleWareNetwork__FilepackageAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6818:1: ( ( ruleFilePackage ) )
            // InternalRosNetworkDsl.g:6819:2: ( ruleFilePackage )
            {
            // InternalRosNetworkDsl.g:6819:2: ( ruleFilePackage )
            // InternalRosNetworkDsl.g:6820:3: ruleFilePackage
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getFilepackageFilePackageParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleFilePackage();

            state._fsp--;

             after(grammarAccess.getMiddleWareNetworkAccess().getFilepackageFilePackageParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__FilepackageAssignment_7"


    // $ANTLR start "rule__MiddleWareNetwork__FilepackageAssignment_8"
    // InternalRosNetworkDsl.g:6829:1: rule__MiddleWareNetwork__FilepackageAssignment_8 : ( ruleFilePackage ) ;
    public final void rule__MiddleWareNetwork__FilepackageAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6833:1: ( ( ruleFilePackage ) )
            // InternalRosNetworkDsl.g:6834:2: ( ruleFilePackage )
            {
            // InternalRosNetworkDsl.g:6834:2: ( ruleFilePackage )
            // InternalRosNetworkDsl.g:6835:3: ruleFilePackage
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getFilepackageFilePackageParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFilePackage();

            state._fsp--;

             after(grammarAccess.getMiddleWareNetworkAccess().getFilepackageFilePackageParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__FilepackageAssignment_8"


    // $ANTLR start "rule__MiddleWareNetwork__ChannelsAssignment_9_2"
    // InternalRosNetworkDsl.g:6844:1: rule__MiddleWareNetwork__ChannelsAssignment_9_2 : ( ruleChannel ) ;
    public final void rule__MiddleWareNetwork__ChannelsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6848:1: ( ( ruleChannel ) )
            // InternalRosNetworkDsl.g:6849:2: ( ruleChannel )
            {
            // InternalRosNetworkDsl.g:6849:2: ( ruleChannel )
            // InternalRosNetworkDsl.g:6850:3: ruleChannel
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getChannelsChannelParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getMiddleWareNetworkAccess().getChannelsChannelParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__ChannelsAssignment_9_2"


    // $ANTLR start "rule__MiddleWareNetwork__ChannelsAssignment_9_3"
    // InternalRosNetworkDsl.g:6859:1: rule__MiddleWareNetwork__ChannelsAssignment_9_3 : ( ruleChannel ) ;
    public final void rule__MiddleWareNetwork__ChannelsAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6863:1: ( ( ruleChannel ) )
            // InternalRosNetworkDsl.g:6864:2: ( ruleChannel )
            {
            // InternalRosNetworkDsl.g:6864:2: ( ruleChannel )
            // InternalRosNetworkDsl.g:6865:3: ruleChannel
            {
             before(grammarAccess.getMiddleWareNetworkAccess().getChannelsChannelParserRuleCall_9_3_0()); 
            pushFollow(FOLLOW_2);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getMiddleWareNetworkAccess().getChannelsChannelParserRuleCall_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiddleWareNetwork__ChannelsAssignment_9_3"


    // $ANTLR start "rule__FilePackage__NameAssignment_2"
    // InternalRosNetworkDsl.g:6874:1: rule__FilePackage__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__FilePackage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6878:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:6879:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:6879:2: ( ruleEString )
            // InternalRosNetworkDsl.g:6880:3: ruleEString
            {
             before(grammarAccess.getFilePackageAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilePackageAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__NameAssignment_2"


    // $ANTLR start "rule__FilePackage__GenerateartifactAssignment_3"
    // InternalRosNetworkDsl.g:6889:1: rule__FilePackage__GenerateartifactAssignment_3 : ( ( 'generate' ) ) ;
    public final void rule__FilePackage__GenerateartifactAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6893:1: ( ( ( 'generate' ) ) )
            // InternalRosNetworkDsl.g:6894:2: ( ( 'generate' ) )
            {
            // InternalRosNetworkDsl.g:6894:2: ( ( 'generate' ) )
            // InternalRosNetworkDsl.g:6895:3: ( 'generate' )
            {
             before(grammarAccess.getFilePackageAccess().getGenerateartifactGenerateKeyword_3_0()); 
            // InternalRosNetworkDsl.g:6896:3: ( 'generate' )
            // InternalRosNetworkDsl.g:6897:4: 'generate'
            {
             before(grammarAccess.getFilePackageAccess().getGenerateartifactGenerateKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFilePackageAccess().getGenerateartifactGenerateKeyword_3_0()); 

            }

             after(grammarAccess.getFilePackageAccess().getGenerateartifactGenerateKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__GenerateartifactAssignment_3"


    // $ANTLR start "rule__FilePackage__AbstractroselementAssignment_5"
    // InternalRosNetworkDsl.g:6908:1: rule__FilePackage__AbstractroselementAssignment_5 : ( ruleAbstractRosFileElement ) ;
    public final void rule__FilePackage__AbstractroselementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6912:1: ( ( ruleAbstractRosFileElement ) )
            // InternalRosNetworkDsl.g:6913:2: ( ruleAbstractRosFileElement )
            {
            // InternalRosNetworkDsl.g:6913:2: ( ruleAbstractRosFileElement )
            // InternalRosNetworkDsl.g:6914:3: ruleAbstractRosFileElement
            {
             before(grammarAccess.getFilePackageAccess().getAbstractroselementAbstractRosFileElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractRosFileElement();

            state._fsp--;

             after(grammarAccess.getFilePackageAccess().getAbstractroselementAbstractRosFileElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__AbstractroselementAssignment_5"


    // $ANTLR start "rule__FilePackage__AbstractroselementAssignment_6"
    // InternalRosNetworkDsl.g:6923:1: rule__FilePackage__AbstractroselementAssignment_6 : ( ruleAbstractRosFileElement ) ;
    public final void rule__FilePackage__AbstractroselementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6927:1: ( ( ruleAbstractRosFileElement ) )
            // InternalRosNetworkDsl.g:6928:2: ( ruleAbstractRosFileElement )
            {
            // InternalRosNetworkDsl.g:6928:2: ( ruleAbstractRosFileElement )
            // InternalRosNetworkDsl.g:6929:3: ruleAbstractRosFileElement
            {
             before(grammarAccess.getFilePackageAccess().getAbstractroselementAbstractRosFileElementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractRosFileElement();

            state._fsp--;

             after(grammarAccess.getFilePackageAccess().getAbstractroselementAbstractRosFileElementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__AbstractroselementAssignment_6"


    // $ANTLR start "rule__FilePackage__FilterAssignment_7_0"
    // InternalRosNetworkDsl.g:6938:1: rule__FilePackage__FilterAssignment_7_0 : ( ruleFilterDefinition ) ;
    public final void rule__FilePackage__FilterAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6942:1: ( ( ruleFilterDefinition ) )
            // InternalRosNetworkDsl.g:6943:2: ( ruleFilterDefinition )
            {
            // InternalRosNetworkDsl.g:6943:2: ( ruleFilterDefinition )
            // InternalRosNetworkDsl.g:6944:3: ruleFilterDefinition
            {
             before(grammarAccess.getFilePackageAccess().getFilterFilterDefinitionParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterDefinition();

            state._fsp--;

             after(grammarAccess.getFilePackageAccess().getFilterFilterDefinitionParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__FilterAssignment_7_0"


    // $ANTLR start "rule__FilePackage__FilterAssignment_7_1"
    // InternalRosNetworkDsl.g:6953:1: rule__FilePackage__FilterAssignment_7_1 : ( ruleFilterDefinition ) ;
    public final void rule__FilePackage__FilterAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6957:1: ( ( ruleFilterDefinition ) )
            // InternalRosNetworkDsl.g:6958:2: ( ruleFilterDefinition )
            {
            // InternalRosNetworkDsl.g:6958:2: ( ruleFilterDefinition )
            // InternalRosNetworkDsl.g:6959:3: ruleFilterDefinition
            {
             before(grammarAccess.getFilePackageAccess().getFilterFilterDefinitionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterDefinition();

            state._fsp--;

             after(grammarAccess.getFilePackageAccess().getFilterFilterDefinitionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilePackage__FilterAssignment_7_1"


    // $ANTLR start "rule__FilterDefinition__NameAssignment_2"
    // InternalRosNetworkDsl.g:6968:1: rule__FilterDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__FilterDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6972:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:6973:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:6973:2: ( ruleEString )
            // InternalRosNetworkDsl.g:6974:3: ruleEString
            {
             before(grammarAccess.getFilterDefinitionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilterDefinitionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__NameAssignment_2"


    // $ANTLR start "rule__FilterDefinition__Input_fieldAssignment_5"
    // InternalRosNetworkDsl.g:6983:1: rule__FilterDefinition__Input_fieldAssignment_5 : ( ruleSerializedField ) ;
    public final void rule__FilterDefinition__Input_fieldAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:6987:1: ( ( ruleSerializedField ) )
            // InternalRosNetworkDsl.g:6988:2: ( ruleSerializedField )
            {
            // InternalRosNetworkDsl.g:6988:2: ( ruleSerializedField )
            // InternalRosNetworkDsl.g:6989:3: ruleSerializedField
            {
             before(grammarAccess.getFilterDefinitionAccess().getInput_fieldSerializedFieldParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSerializedField();

            state._fsp--;

             after(grammarAccess.getFilterDefinitionAccess().getInput_fieldSerializedFieldParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Input_fieldAssignment_5"


    // $ANTLR start "rule__FilterDefinition__Input_fieldAssignment_6_1"
    // InternalRosNetworkDsl.g:6998:1: rule__FilterDefinition__Input_fieldAssignment_6_1 : ( ruleSerializedField ) ;
    public final void rule__FilterDefinition__Input_fieldAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7002:1: ( ( ruleSerializedField ) )
            // InternalRosNetworkDsl.g:7003:2: ( ruleSerializedField )
            {
            // InternalRosNetworkDsl.g:7003:2: ( ruleSerializedField )
            // InternalRosNetworkDsl.g:7004:3: ruleSerializedField
            {
             before(grammarAccess.getFilterDefinitionAccess().getInput_fieldSerializedFieldParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSerializedField();

            state._fsp--;

             after(grammarAccess.getFilterDefinitionAccess().getInput_fieldSerializedFieldParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Input_fieldAssignment_6_1"


    // $ANTLR start "rule__FilterDefinition__Output_fieldAssignment_8"
    // InternalRosNetworkDsl.g:7013:1: rule__FilterDefinition__Output_fieldAssignment_8 : ( ruleSerializedField ) ;
    public final void rule__FilterDefinition__Output_fieldAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7017:1: ( ( ruleSerializedField ) )
            // InternalRosNetworkDsl.g:7018:2: ( ruleSerializedField )
            {
            // InternalRosNetworkDsl.g:7018:2: ( ruleSerializedField )
            // InternalRosNetworkDsl.g:7019:3: ruleSerializedField
            {
             before(grammarAccess.getFilterDefinitionAccess().getOutput_fieldSerializedFieldParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSerializedField();

            state._fsp--;

             after(grammarAccess.getFilterDefinitionAccess().getOutput_fieldSerializedFieldParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterDefinition__Output_fieldAssignment_8"


    // $ANTLR start "rule__SerializedField__IdAssignment_2"
    // InternalRosNetworkDsl.g:7028:1: rule__SerializedField__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__SerializedField__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7032:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7033:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7033:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7034:3: ruleEString
            {
             before(grammarAccess.getSerializedFieldAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSerializedFieldAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerializedField__IdAssignment_2"


    // $ANTLR start "rule__SerializedField__TopicmessageAssignment_3"
    // InternalRosNetworkDsl.g:7043:1: rule__SerializedField__TopicmessageAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__SerializedField__TopicmessageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7047:1: ( ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:7048:2: ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:7048:2: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7049:3: ( ruleEString )
            {
             before(grammarAccess.getSerializedFieldAccess().getTopicmessageTopicMessageCrossReference_3_0()); 
            // InternalRosNetworkDsl.g:7050:3: ( ruleEString )
            // InternalRosNetworkDsl.g:7051:4: ruleEString
            {
             before(grammarAccess.getSerializedFieldAccess().getTopicmessageTopicMessageEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSerializedFieldAccess().getTopicmessageTopicMessageEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSerializedFieldAccess().getTopicmessageTopicMessageCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SerializedField__TopicmessageAssignment_3"


    // $ANTLR start "rule__TopicMessage__NameAssignment_2"
    // InternalRosNetworkDsl.g:7062:1: rule__TopicMessage__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TopicMessage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7066:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7067:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7067:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7068:3: ruleEString
            {
             before(grammarAccess.getTopicMessageAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicMessageAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicMessage__NameAssignment_2"


    // $ANTLR start "rule__ServiceType__NameAssignment_2"
    // InternalRosNetworkDsl.g:7077:1: rule__ServiceType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ServiceType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7081:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7082:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7082:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7083:3: ruleEString
            {
             before(grammarAccess.getServiceTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceType__NameAssignment_2"


    // $ANTLR start "rule__Service__NameAssignment_2"
    // InternalRosNetworkDsl.g:7092:1: rule__Service__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Service__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7096:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7097:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7097:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7098:3: ruleEString
            {
             before(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_2"


    // $ANTLR start "rule__Service__TypeAssignment_4"
    // InternalRosNetworkDsl.g:7107:1: rule__Service__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Service__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7111:1: ( ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:7112:2: ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:7112:2: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7113:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getTypeServiceTypeCrossReference_4_0()); 
            // InternalRosNetworkDsl.g:7114:3: ( ruleEString )
            // InternalRosNetworkDsl.g:7115:4: ruleEString
            {
             before(grammarAccess.getServiceAccess().getTypeServiceTypeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getTypeServiceTypeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getTypeServiceTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__TypeAssignment_4"


    // $ANTLR start "rule__Topic__NameAssignment_2"
    // InternalRosNetworkDsl.g:7126:1: rule__Topic__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Topic__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7130:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7131:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7131:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7132:3: ruleEString
            {
             before(grammarAccess.getTopicAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__NameAssignment_2"


    // $ANTLR start "rule__Topic__TypeAssignment_4"
    // InternalRosNetworkDsl.g:7141:1: rule__Topic__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Topic__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7145:1: ( ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:7146:2: ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:7146:2: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7147:3: ( ruleEString )
            {
             before(grammarAccess.getTopicAccess().getTypeTopicMessageCrossReference_4_0()); 
            // InternalRosNetworkDsl.g:7148:3: ( ruleEString )
            // InternalRosNetworkDsl.g:7149:4: ruleEString
            {
             before(grammarAccess.getTopicAccess().getTypeTopicMessageEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicAccess().getTypeTopicMessageEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTopicAccess().getTypeTopicMessageCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topic__TypeAssignment_4"


    // $ANTLR start "rule__BooleanParameter__NameAssignment_2"
    // InternalRosNetworkDsl.g:7160:1: rule__BooleanParameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BooleanParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7164:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7165:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7165:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7166:3: ruleEString
            {
             before(grammarAccess.getBooleanParameterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanParameterAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__NameAssignment_2"


    // $ANTLR start "rule__BooleanParameter__DefaultvalAssignment_4"
    // InternalRosNetworkDsl.g:7175:1: rule__BooleanParameter__DefaultvalAssignment_4 : ( ruleEBoolean ) ;
    public final void rule__BooleanParameter__DefaultvalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7179:1: ( ( ruleEBoolean ) )
            // InternalRosNetworkDsl.g:7180:2: ( ruleEBoolean )
            {
            // InternalRosNetworkDsl.g:7180:2: ( ruleEBoolean )
            // InternalRosNetworkDsl.g:7181:3: ruleEBoolean
            {
             before(grammarAccess.getBooleanParameterAccess().getDefaultvalEBooleanParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanParameterAccess().getDefaultvalEBooleanParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__DefaultvalAssignment_4"


    // $ANTLR start "rule__BooleanParameter__TargetvarAssignment_5_1"
    // InternalRosNetworkDsl.g:7190:1: rule__BooleanParameter__TargetvarAssignment_5_1 : ( ruleEString ) ;
    public final void rule__BooleanParameter__TargetvarAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7194:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7195:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7195:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7196:3: ruleEString
            {
             before(grammarAccess.getBooleanParameterAccess().getTargetvarEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanParameterAccess().getTargetvarEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanParameter__TargetvarAssignment_5_1"


    // $ANTLR start "rule__IntegerParameter__NameAssignment_2"
    // InternalRosNetworkDsl.g:7205:1: rule__IntegerParameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__IntegerParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7209:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7210:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7210:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7211:3: ruleEString
            {
             before(grammarAccess.getIntegerParameterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerParameterAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__NameAssignment_2"


    // $ANTLR start "rule__IntegerParameter__DefaultvalAssignment_4"
    // InternalRosNetworkDsl.g:7220:1: rule__IntegerParameter__DefaultvalAssignment_4 : ( ruleEInt ) ;
    public final void rule__IntegerParameter__DefaultvalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7224:1: ( ( ruleEInt ) )
            // InternalRosNetworkDsl.g:7225:2: ( ruleEInt )
            {
            // InternalRosNetworkDsl.g:7225:2: ( ruleEInt )
            // InternalRosNetworkDsl.g:7226:3: ruleEInt
            {
             before(grammarAccess.getIntegerParameterAccess().getDefaultvalEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerParameterAccess().getDefaultvalEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__DefaultvalAssignment_4"


    // $ANTLR start "rule__IntegerParameter__MinvalAssignment_6"
    // InternalRosNetworkDsl.g:7235:1: rule__IntegerParameter__MinvalAssignment_6 : ( ruleEInt ) ;
    public final void rule__IntegerParameter__MinvalAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7239:1: ( ( ruleEInt ) )
            // InternalRosNetworkDsl.g:7240:2: ( ruleEInt )
            {
            // InternalRosNetworkDsl.g:7240:2: ( ruleEInt )
            // InternalRosNetworkDsl.g:7241:3: ruleEInt
            {
             before(grammarAccess.getIntegerParameterAccess().getMinvalEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerParameterAccess().getMinvalEIntParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__MinvalAssignment_6"


    // $ANTLR start "rule__IntegerParameter__MaxvalAssignment_8"
    // InternalRosNetworkDsl.g:7250:1: rule__IntegerParameter__MaxvalAssignment_8 : ( ruleEInt ) ;
    public final void rule__IntegerParameter__MaxvalAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7254:1: ( ( ruleEInt ) )
            // InternalRosNetworkDsl.g:7255:2: ( ruleEInt )
            {
            // InternalRosNetworkDsl.g:7255:2: ( ruleEInt )
            // InternalRosNetworkDsl.g:7256:3: ruleEInt
            {
             before(grammarAccess.getIntegerParameterAccess().getMaxvalEIntParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerParameterAccess().getMaxvalEIntParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__MaxvalAssignment_8"


    // $ANTLR start "rule__IntegerParameter__TargetvarAssignment_10_1"
    // InternalRosNetworkDsl.g:7265:1: rule__IntegerParameter__TargetvarAssignment_10_1 : ( ruleEString ) ;
    public final void rule__IntegerParameter__TargetvarAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7269:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7270:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7270:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7271:3: ruleEString
            {
             before(grammarAccess.getIntegerParameterAccess().getTargetvarEStringParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerParameterAccess().getTargetvarEStringParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerParameter__TargetvarAssignment_10_1"


    // $ANTLR start "rule__DoubleParameter__NameAssignment_2"
    // InternalRosNetworkDsl.g:7280:1: rule__DoubleParameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DoubleParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7284:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7285:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7285:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7286:3: ruleEString
            {
             before(grammarAccess.getDoubleParameterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDoubleParameterAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__NameAssignment_2"


    // $ANTLR start "rule__DoubleParameter__DefaultvalAssignment_4"
    // InternalRosNetworkDsl.g:7295:1: rule__DoubleParameter__DefaultvalAssignment_4 : ( ruleDouble ) ;
    public final void rule__DoubleParameter__DefaultvalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7299:1: ( ( ruleDouble ) )
            // InternalRosNetworkDsl.g:7300:2: ( ruleDouble )
            {
            // InternalRosNetworkDsl.g:7300:2: ( ruleDouble )
            // InternalRosNetworkDsl.g:7301:3: ruleDouble
            {
             before(grammarAccess.getDoubleParameterAccess().getDefaultvalDoubleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleParameterAccess().getDefaultvalDoubleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__DefaultvalAssignment_4"


    // $ANTLR start "rule__DoubleParameter__MinvalAssignment_6"
    // InternalRosNetworkDsl.g:7310:1: rule__DoubleParameter__MinvalAssignment_6 : ( ruleDouble ) ;
    public final void rule__DoubleParameter__MinvalAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7314:1: ( ( ruleDouble ) )
            // InternalRosNetworkDsl.g:7315:2: ( ruleDouble )
            {
            // InternalRosNetworkDsl.g:7315:2: ( ruleDouble )
            // InternalRosNetworkDsl.g:7316:3: ruleDouble
            {
             before(grammarAccess.getDoubleParameterAccess().getMinvalDoubleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleParameterAccess().getMinvalDoubleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__MinvalAssignment_6"


    // $ANTLR start "rule__DoubleParameter__MaxvalAssignment_8"
    // InternalRosNetworkDsl.g:7325:1: rule__DoubleParameter__MaxvalAssignment_8 : ( ruleDouble ) ;
    public final void rule__DoubleParameter__MaxvalAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7329:1: ( ( ruleDouble ) )
            // InternalRosNetworkDsl.g:7330:2: ( ruleDouble )
            {
            // InternalRosNetworkDsl.g:7330:2: ( ruleDouble )
            // InternalRosNetworkDsl.g:7331:3: ruleDouble
            {
             before(grammarAccess.getDoubleParameterAccess().getMaxvalDoubleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleParameterAccess().getMaxvalDoubleParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__MaxvalAssignment_8"


    // $ANTLR start "rule__DoubleParameter__TargetvarAssignment_10_1"
    // InternalRosNetworkDsl.g:7340:1: rule__DoubleParameter__TargetvarAssignment_10_1 : ( ruleEString ) ;
    public final void rule__DoubleParameter__TargetvarAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7344:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7345:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7345:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7346:3: ruleEString
            {
             before(grammarAccess.getDoubleParameterAccess().getTargetvarEStringParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDoubleParameterAccess().getTargetvarEStringParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleParameter__TargetvarAssignment_10_1"


    // $ANTLR start "rule__NodeParameterGroup__NameAssignment_2"
    // InternalRosNetworkDsl.g:7355:1: rule__NodeParameterGroup__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__NodeParameterGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7359:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7360:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7360:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7361:3: ruleEString
            {
             before(grammarAccess.getNodeParameterGroupAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNodeParameterGroupAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__NameAssignment_2"


    // $ANTLR start "rule__NodeParameterGroup__Config_objAssignment_3_1"
    // InternalRosNetworkDsl.g:7370:1: rule__NodeParameterGroup__Config_objAssignment_3_1 : ( ruleEString ) ;
    public final void rule__NodeParameterGroup__Config_objAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7374:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7375:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7375:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7376:3: ruleEString
            {
             before(grammarAccess.getNodeParameterGroupAccess().getConfig_objEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNodeParameterGroupAccess().getConfig_objEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Config_objAssignment_3_1"


    // $ANTLR start "rule__NodeParameterGroup__Generate_structAssignment_4_1"
    // InternalRosNetworkDsl.g:7385:1: rule__NodeParameterGroup__Generate_structAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__NodeParameterGroup__Generate_structAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7389:1: ( ( ruleEBoolean ) )
            // InternalRosNetworkDsl.g:7390:2: ( ruleEBoolean )
            {
            // InternalRosNetworkDsl.g:7390:2: ( ruleEBoolean )
            // InternalRosNetworkDsl.g:7391:3: ruleEBoolean
            {
             before(grammarAccess.getNodeParameterGroupAccess().getGenerate_structEBooleanParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getNodeParameterGroupAccess().getGenerate_structEBooleanParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__Generate_structAssignment_4_1"


    // $ANTLR start "rule__NodeParameterGroup__NodeparameterAssignment_6"
    // InternalRosNetworkDsl.g:7400:1: rule__NodeParameterGroup__NodeparameterAssignment_6 : ( ruleNodeParameter ) ;
    public final void rule__NodeParameterGroup__NodeparameterAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7404:1: ( ( ruleNodeParameter ) )
            // InternalRosNetworkDsl.g:7405:2: ( ruleNodeParameter )
            {
            // InternalRosNetworkDsl.g:7405:2: ( ruleNodeParameter )
            // InternalRosNetworkDsl.g:7406:3: ruleNodeParameter
            {
             before(grammarAccess.getNodeParameterGroupAccess().getNodeparameterNodeParameterParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeParameter();

            state._fsp--;

             after(grammarAccess.getNodeParameterGroupAccess().getNodeparameterNodeParameterParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__NodeparameterAssignment_6"


    // $ANTLR start "rule__NodeParameterGroup__NodeparameterAssignment_7"
    // InternalRosNetworkDsl.g:7415:1: rule__NodeParameterGroup__NodeparameterAssignment_7 : ( ruleNodeParameter ) ;
    public final void rule__NodeParameterGroup__NodeparameterAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7419:1: ( ( ruleNodeParameter ) )
            // InternalRosNetworkDsl.g:7420:2: ( ruleNodeParameter )
            {
            // InternalRosNetworkDsl.g:7420:2: ( ruleNodeParameter )
            // InternalRosNetworkDsl.g:7421:3: ruleNodeParameter
            {
             before(grammarAccess.getNodeParameterGroupAccess().getNodeparameterNodeParameterParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeParameter();

            state._fsp--;

             after(grammarAccess.getNodeParameterGroupAccess().getNodeparameterNodeParameterParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeParameterGroup__NodeparameterAssignment_7"


    // $ANTLR start "rule__Library__NameAssignment_2"
    // InternalRosNetworkDsl.g:7430:1: rule__Library__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Library__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7434:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7435:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7435:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7436:3: ruleEString
            {
             before(grammarAccess.getLibraryAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__NameAssignment_2"


    // $ANTLR start "rule__Library__NamespaceAssignment_4"
    // InternalRosNetworkDsl.g:7445:1: rule__Library__NamespaceAssignment_4 : ( ruleEString ) ;
    public final void rule__Library__NamespaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7449:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7450:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7450:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7451:3: ruleEString
            {
             before(grammarAccess.getLibraryAccess().getNamespaceEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getNamespaceEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__NamespaceAssignment_4"


    // $ANTLR start "rule__Library__ImplementsAssignment_5_1"
    // InternalRosNetworkDsl.g:7460:1: rule__Library__ImplementsAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Library__ImplementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7464:1: ( ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:7465:2: ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:7465:2: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7466:3: ( ruleEString )
            {
             before(grammarAccess.getLibraryAccess().getImplementsNodeCrossReference_5_1_0()); 
            // InternalRosNetworkDsl.g:7467:3: ( ruleEString )
            // InternalRosNetworkDsl.g:7468:4: ruleEString
            {
             before(grammarAccess.getLibraryAccess().getImplementsNodeEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getImplementsNodeEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getLibraryAccess().getImplementsNodeCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__ImplementsAssignment_5_1"


    // $ANTLR start "rule__Library__GenerateartifactAssignment_6"
    // InternalRosNetworkDsl.g:7479:1: rule__Library__GenerateartifactAssignment_6 : ( ( 'generate' ) ) ;
    public final void rule__Library__GenerateartifactAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7483:1: ( ( ( 'generate' ) ) )
            // InternalRosNetworkDsl.g:7484:2: ( ( 'generate' ) )
            {
            // InternalRosNetworkDsl.g:7484:2: ( ( 'generate' ) )
            // InternalRosNetworkDsl.g:7485:3: ( 'generate' )
            {
             before(grammarAccess.getLibraryAccess().getGenerateartifactGenerateKeyword_6_0()); 
            // InternalRosNetworkDsl.g:7486:3: ( 'generate' )
            // InternalRosNetworkDsl.g:7487:4: 'generate'
            {
             before(grammarAccess.getLibraryAccess().getGenerateartifactGenerateKeyword_6_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getGenerateartifactGenerateKeyword_6_0()); 

            }

             after(grammarAccess.getLibraryAccess().getGenerateartifactGenerateKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__GenerateartifactAssignment_6"


    // $ANTLR start "rule__Library__LanguageAssignment_9"
    // InternalRosNetworkDsl.g:7498:1: rule__Library__LanguageAssignment_9 : ( ruleLanguageType ) ;
    public final void rule__Library__LanguageAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7502:1: ( ( ruleLanguageType ) )
            // InternalRosNetworkDsl.g:7503:2: ( ruleLanguageType )
            {
            // InternalRosNetworkDsl.g:7503:2: ( ruleLanguageType )
            // InternalRosNetworkDsl.g:7504:3: ruleLanguageType
            {
             before(grammarAccess.getLibraryAccess().getLanguageLanguageTypeParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageType();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getLanguageLanguageTypeParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__LanguageAssignment_9"


    // $ANTLR start "rule__Library__LanguageAssignment_10_1"
    // InternalRosNetworkDsl.g:7513:1: rule__Library__LanguageAssignment_10_1 : ( ruleLanguageType ) ;
    public final void rule__Library__LanguageAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7517:1: ( ( ruleLanguageType ) )
            // InternalRosNetworkDsl.g:7518:2: ( ruleLanguageType )
            {
            // InternalRosNetworkDsl.g:7518:2: ( ruleLanguageType )
            // InternalRosNetworkDsl.g:7519:3: ruleLanguageType
            {
             before(grammarAccess.getLibraryAccess().getLanguageLanguageTypeParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageType();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getLanguageLanguageTypeParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__LanguageAssignment_10_1"


    // $ANTLR start "rule__Library__NodeparametersAssignment_11_2"
    // InternalRosNetworkDsl.g:7528:1: rule__Library__NodeparametersAssignment_11_2 : ( ruleAbstractNodeParameter ) ;
    public final void rule__Library__NodeparametersAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7532:1: ( ( ruleAbstractNodeParameter ) )
            // InternalRosNetworkDsl.g:7533:2: ( ruleAbstractNodeParameter )
            {
            // InternalRosNetworkDsl.g:7533:2: ( ruleAbstractNodeParameter )
            // InternalRosNetworkDsl.g:7534:3: ruleAbstractNodeParameter
            {
             before(grammarAccess.getLibraryAccess().getNodeparametersAbstractNodeParameterParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractNodeParameter();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getNodeparametersAbstractNodeParameterParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__NodeparametersAssignment_11_2"


    // $ANTLR start "rule__Library__NodeparametersAssignment_11_3"
    // InternalRosNetworkDsl.g:7543:1: rule__Library__NodeparametersAssignment_11_3 : ( ruleAbstractNodeParameter ) ;
    public final void rule__Library__NodeparametersAssignment_11_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7547:1: ( ( ruleAbstractNodeParameter ) )
            // InternalRosNetworkDsl.g:7548:2: ( ruleAbstractNodeParameter )
            {
            // InternalRosNetworkDsl.g:7548:2: ( ruleAbstractNodeParameter )
            // InternalRosNetworkDsl.g:7549:3: ruleAbstractNodeParameter
            {
             before(grammarAccess.getLibraryAccess().getNodeparametersAbstractNodeParameterParserRuleCall_11_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractNodeParameter();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getNodeparametersAbstractNodeParameterParserRuleCall_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__NodeparametersAssignment_11_3"


    // $ANTLR start "rule__Library__ContinousstateAssignment_12_2"
    // InternalRosNetworkDsl.g:7558:1: rule__Library__ContinousstateAssignment_12_2 : ( ruleContinuousState ) ;
    public final void rule__Library__ContinousstateAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7562:1: ( ( ruleContinuousState ) )
            // InternalRosNetworkDsl.g:7563:2: ( ruleContinuousState )
            {
            // InternalRosNetworkDsl.g:7563:2: ( ruleContinuousState )
            // InternalRosNetworkDsl.g:7564:3: ruleContinuousState
            {
             before(grammarAccess.getLibraryAccess().getContinousstateContinuousStateParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContinuousState();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getContinousstateContinuousStateParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__ContinousstateAssignment_12_2"


    // $ANTLR start "rule__Library__PortAssignment_13_0"
    // InternalRosNetworkDsl.g:7573:1: rule__Library__PortAssignment_13_0 : ( rulePort ) ;
    public final void rule__Library__PortAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7577:1: ( ( rulePort ) )
            // InternalRosNetworkDsl.g:7578:2: ( rulePort )
            {
            // InternalRosNetworkDsl.g:7578:2: ( rulePort )
            // InternalRosNetworkDsl.g:7579:3: rulePort
            {
             before(grammarAccess.getLibraryAccess().getPortPortParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getPortPortParserRuleCall_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__PortAssignment_13_0"


    // $ANTLR start "rule__Library__PortAssignment_13_1"
    // InternalRosNetworkDsl.g:7588:1: rule__Library__PortAssignment_13_1 : ( rulePort ) ;
    public final void rule__Library__PortAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7592:1: ( ( rulePort ) )
            // InternalRosNetworkDsl.g:7593:2: ( rulePort )
            {
            // InternalRosNetworkDsl.g:7593:2: ( rulePort )
            // InternalRosNetworkDsl.g:7594:3: rulePort
            {
             before(grammarAccess.getLibraryAccess().getPortPortParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getPortPortParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__PortAssignment_13_1"


    // $ANTLR start "rule__Node__NameAssignment_2"
    // InternalRosNetworkDsl.g:7603:1: rule__Node__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Node__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7607:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7608:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7608:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7609:3: ruleEString
            {
             before(grammarAccess.getNodeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_2"


    // $ANTLR start "rule__Node__NamespaceAssignment_4"
    // InternalRosNetworkDsl.g:7618:1: rule__Node__NamespaceAssignment_4 : ( ruleEString ) ;
    public final void rule__Node__NamespaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7622:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7623:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7623:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7624:3: ruleEString
            {
             before(grammarAccess.getNodeAccess().getNamespaceEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getNamespaceEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NamespaceAssignment_4"


    // $ANTLR start "rule__Node__ImplementsAssignment_5_1"
    // InternalRosNetworkDsl.g:7633:1: rule__Node__ImplementsAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Node__ImplementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7637:1: ( ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:7638:2: ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:7638:2: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7639:3: ( ruleEString )
            {
             before(grammarAccess.getNodeAccess().getImplementsNodeCrossReference_5_1_0()); 
            // InternalRosNetworkDsl.g:7640:3: ( ruleEString )
            // InternalRosNetworkDsl.g:7641:4: ruleEString
            {
             before(grammarAccess.getNodeAccess().getImplementsNodeEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getImplementsNodeEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getImplementsNodeCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__ImplementsAssignment_5_1"


    // $ANTLR start "rule__Node__GenerateartifactAssignment_6"
    // InternalRosNetworkDsl.g:7652:1: rule__Node__GenerateartifactAssignment_6 : ( ( 'generate' ) ) ;
    public final void rule__Node__GenerateartifactAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7656:1: ( ( ( 'generate' ) ) )
            // InternalRosNetworkDsl.g:7657:2: ( ( 'generate' ) )
            {
            // InternalRosNetworkDsl.g:7657:2: ( ( 'generate' ) )
            // InternalRosNetworkDsl.g:7658:3: ( 'generate' )
            {
             before(grammarAccess.getNodeAccess().getGenerateartifactGenerateKeyword_6_0()); 
            // InternalRosNetworkDsl.g:7659:3: ( 'generate' )
            // InternalRosNetworkDsl.g:7660:4: 'generate'
            {
             before(grammarAccess.getNodeAccess().getGenerateartifactGenerateKeyword_6_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getGenerateartifactGenerateKeyword_6_0()); 

            }

             after(grammarAccess.getNodeAccess().getGenerateartifactGenerateKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__GenerateartifactAssignment_6"


    // $ANTLR start "rule__Node__LanguageAssignment_9"
    // InternalRosNetworkDsl.g:7671:1: rule__Node__LanguageAssignment_9 : ( ruleLanguageType ) ;
    public final void rule__Node__LanguageAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7675:1: ( ( ruleLanguageType ) )
            // InternalRosNetworkDsl.g:7676:2: ( ruleLanguageType )
            {
            // InternalRosNetworkDsl.g:7676:2: ( ruleLanguageType )
            // InternalRosNetworkDsl.g:7677:3: ruleLanguageType
            {
             before(grammarAccess.getNodeAccess().getLanguageLanguageTypeParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageType();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getLanguageLanguageTypeParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__LanguageAssignment_9"


    // $ANTLR start "rule__Node__LanguageAssignment_10_1"
    // InternalRosNetworkDsl.g:7686:1: rule__Node__LanguageAssignment_10_1 : ( ruleLanguageType ) ;
    public final void rule__Node__LanguageAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7690:1: ( ( ruleLanguageType ) )
            // InternalRosNetworkDsl.g:7691:2: ( ruleLanguageType )
            {
            // InternalRosNetworkDsl.g:7691:2: ( ruleLanguageType )
            // InternalRosNetworkDsl.g:7692:3: ruleLanguageType
            {
             before(grammarAccess.getNodeAccess().getLanguageLanguageTypeParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageType();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getLanguageLanguageTypeParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__LanguageAssignment_10_1"


    // $ANTLR start "rule__Node__NodeparametersAssignment_11_2"
    // InternalRosNetworkDsl.g:7701:1: rule__Node__NodeparametersAssignment_11_2 : ( ruleAbstractNodeParameter ) ;
    public final void rule__Node__NodeparametersAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7705:1: ( ( ruleAbstractNodeParameter ) )
            // InternalRosNetworkDsl.g:7706:2: ( ruleAbstractNodeParameter )
            {
            // InternalRosNetworkDsl.g:7706:2: ( ruleAbstractNodeParameter )
            // InternalRosNetworkDsl.g:7707:3: ruleAbstractNodeParameter
            {
             before(grammarAccess.getNodeAccess().getNodeparametersAbstractNodeParameterParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractNodeParameter();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getNodeparametersAbstractNodeParameterParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NodeparametersAssignment_11_2"


    // $ANTLR start "rule__Node__NodeparametersAssignment_11_3"
    // InternalRosNetworkDsl.g:7716:1: rule__Node__NodeparametersAssignment_11_3 : ( ruleAbstractNodeParameter ) ;
    public final void rule__Node__NodeparametersAssignment_11_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7720:1: ( ( ruleAbstractNodeParameter ) )
            // InternalRosNetworkDsl.g:7721:2: ( ruleAbstractNodeParameter )
            {
            // InternalRosNetworkDsl.g:7721:2: ( ruleAbstractNodeParameter )
            // InternalRosNetworkDsl.g:7722:3: ruleAbstractNodeParameter
            {
             before(grammarAccess.getNodeAccess().getNodeparametersAbstractNodeParameterParserRuleCall_11_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractNodeParameter();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getNodeparametersAbstractNodeParameterParserRuleCall_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NodeparametersAssignment_11_3"


    // $ANTLR start "rule__Node__ContinousstateAssignment_12_2"
    // InternalRosNetworkDsl.g:7731:1: rule__Node__ContinousstateAssignment_12_2 : ( ruleContinuousState ) ;
    public final void rule__Node__ContinousstateAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7735:1: ( ( ruleContinuousState ) )
            // InternalRosNetworkDsl.g:7736:2: ( ruleContinuousState )
            {
            // InternalRosNetworkDsl.g:7736:2: ( ruleContinuousState )
            // InternalRosNetworkDsl.g:7737:3: ruleContinuousState
            {
             before(grammarAccess.getNodeAccess().getContinousstateContinuousStateParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContinuousState();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getContinousstateContinuousStateParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__ContinousstateAssignment_12_2"


    // $ANTLR start "rule__Node__PortAssignment_13_0"
    // InternalRosNetworkDsl.g:7746:1: rule__Node__PortAssignment_13_0 : ( rulePort ) ;
    public final void rule__Node__PortAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7750:1: ( ( rulePort ) )
            // InternalRosNetworkDsl.g:7751:2: ( rulePort )
            {
            // InternalRosNetworkDsl.g:7751:2: ( rulePort )
            // InternalRosNetworkDsl.g:7752:3: rulePort
            {
             before(grammarAccess.getNodeAccess().getPortPortParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getPortPortParserRuleCall_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__PortAssignment_13_0"


    // $ANTLR start "rule__Node__PortAssignment_13_1"
    // InternalRosNetworkDsl.g:7761:1: rule__Node__PortAssignment_13_1 : ( rulePort ) ;
    public final void rule__Node__PortAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7765:1: ( ( rulePort ) )
            // InternalRosNetworkDsl.g:7766:2: ( rulePort )
            {
            // InternalRosNetworkDsl.g:7766:2: ( rulePort )
            // InternalRosNetworkDsl.g:7767:3: rulePort
            {
             before(grammarAccess.getNodeAccess().getPortPortParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getPortPortParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__PortAssignment_13_1"


    // $ANTLR start "rule__Node__FilterconnectionAssignment_14_0"
    // InternalRosNetworkDsl.g:7776:1: rule__Node__FilterconnectionAssignment_14_0 : ( ruleFilterConnection ) ;
    public final void rule__Node__FilterconnectionAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7780:1: ( ( ruleFilterConnection ) )
            // InternalRosNetworkDsl.g:7781:2: ( ruleFilterConnection )
            {
            // InternalRosNetworkDsl.g:7781:2: ( ruleFilterConnection )
            // InternalRosNetworkDsl.g:7782:3: ruleFilterConnection
            {
             before(grammarAccess.getNodeAccess().getFilterconnectionFilterConnectionParserRuleCall_14_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterConnection();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getFilterconnectionFilterConnectionParserRuleCall_14_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__FilterconnectionAssignment_14_0"


    // $ANTLR start "rule__Node__FilterconnectionAssignment_14_1"
    // InternalRosNetworkDsl.g:7791:1: rule__Node__FilterconnectionAssignment_14_1 : ( ruleFilterConnection ) ;
    public final void rule__Node__FilterconnectionAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7795:1: ( ( ruleFilterConnection ) )
            // InternalRosNetworkDsl.g:7796:2: ( ruleFilterConnection )
            {
            // InternalRosNetworkDsl.g:7796:2: ( ruleFilterConnection )
            // InternalRosNetworkDsl.g:7797:3: ruleFilterConnection
            {
             before(grammarAccess.getNodeAccess().getFilterconnectionFilterConnectionParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterConnection();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getFilterconnectionFilterConnectionParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__FilterconnectionAssignment_14_1"


    // $ANTLR start "rule__FilterConnection__NameAssignment_2"
    // InternalRosNetworkDsl.g:7806:1: rule__FilterConnection__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__FilterConnection__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7810:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7811:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7811:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7812:3: ruleEString
            {
             before(grammarAccess.getFilterConnectionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilterConnectionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__NameAssignment_2"


    // $ANTLR start "rule__FilterConnection__UsedfilterAssignment_4"
    // InternalRosNetworkDsl.g:7821:1: rule__FilterConnection__UsedfilterAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__FilterConnection__UsedfilterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7825:1: ( ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:7826:2: ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:7826:2: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7827:3: ( ruleEString )
            {
             before(grammarAccess.getFilterConnectionAccess().getUsedfilterFilterDefinitionCrossReference_4_0()); 
            // InternalRosNetworkDsl.g:7828:3: ( ruleEString )
            // InternalRosNetworkDsl.g:7829:4: ruleEString
            {
             before(grammarAccess.getFilterConnectionAccess().getUsedfilterFilterDefinitionEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilterConnectionAccess().getUsedfilterFilterDefinitionEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getFilterConnectionAccess().getUsedfilterFilterDefinitionCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__UsedfilterAssignment_4"


    // $ANTLR start "rule__FilterConnection__InputAssignment_6"
    // InternalRosNetworkDsl.g:7840:1: rule__FilterConnection__InputAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__FilterConnection__InputAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7844:1: ( ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:7845:2: ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:7845:2: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7846:3: ( ruleEString )
            {
             before(grammarAccess.getFilterConnectionAccess().getInputInternalNodeCrossReference_6_0()); 
            // InternalRosNetworkDsl.g:7847:3: ( ruleEString )
            // InternalRosNetworkDsl.g:7848:4: ruleEString
            {
             before(grammarAccess.getFilterConnectionAccess().getInputInternalNodeEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilterConnectionAccess().getInputInternalNodeEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getFilterConnectionAccess().getInputInternalNodeCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__InputAssignment_6"


    // $ANTLR start "rule__FilterConnection__InputAssignment_7_1"
    // InternalRosNetworkDsl.g:7859:1: rule__FilterConnection__InputAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__FilterConnection__InputAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7863:1: ( ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:7864:2: ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:7864:2: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7865:3: ( ruleEString )
            {
             before(grammarAccess.getFilterConnectionAccess().getInputInternalNodeCrossReference_7_1_0()); 
            // InternalRosNetworkDsl.g:7866:3: ( ruleEString )
            // InternalRosNetworkDsl.g:7867:4: ruleEString
            {
             before(grammarAccess.getFilterConnectionAccess().getInputInternalNodeEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilterConnectionAccess().getInputInternalNodeEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getFilterConnectionAccess().getInputInternalNodeCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__InputAssignment_7_1"


    // $ANTLR start "rule__FilterConnection__OutputAssignment_10"
    // InternalRosNetworkDsl.g:7878:1: rule__FilterConnection__OutputAssignment_10 : ( ( ruleEString ) ) ;
    public final void rule__FilterConnection__OutputAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7882:1: ( ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:7883:2: ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:7883:2: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7884:3: ( ruleEString )
            {
             before(grammarAccess.getFilterConnectionAccess().getOutputInternalNodeCrossReference_10_0()); 
            // InternalRosNetworkDsl.g:7885:3: ( ruleEString )
            // InternalRosNetworkDsl.g:7886:4: ruleEString
            {
             before(grammarAccess.getFilterConnectionAccess().getOutputInternalNodeEStringParserRuleCall_10_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilterConnectionAccess().getOutputInternalNodeEStringParserRuleCall_10_0_1()); 

            }

             after(grammarAccess.getFilterConnectionAccess().getOutputInternalNodeCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterConnection__OutputAssignment_10"


    // $ANTLR start "rule__ContinuousState__NameAssignment_2"
    // InternalRosNetworkDsl.g:7897:1: rule__ContinuousState__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ContinuousState__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7901:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7902:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7902:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7903:3: ruleEString
            {
             before(grammarAccess.getContinuousStateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContinuousStateAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContinuousState__NameAssignment_2"


    // $ANTLR start "rule__InputPort__NameAssignment_2"
    // InternalRosNetworkDsl.g:7912:1: rule__InputPort__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InputPort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7916:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7917:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:7917:2: ( ruleEString )
            // InternalRosNetworkDsl.g:7918:3: ruleEString
            {
             before(grammarAccess.getInputPortAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputPortAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__NameAssignment_2"


    // $ANTLR start "rule__InputPort__ChannelAssignment_4"
    // InternalRosNetworkDsl.g:7927:1: rule__InputPort__ChannelAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__InputPort__ChannelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7931:1: ( ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:7932:2: ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:7932:2: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:7933:3: ( ruleEString )
            {
             before(grammarAccess.getInputPortAccess().getChannelChannelCrossReference_4_0()); 
            // InternalRosNetworkDsl.g:7934:3: ( ruleEString )
            // InternalRosNetworkDsl.g:7935:4: ruleEString
            {
             before(grammarAccess.getInputPortAccess().getChannelChannelEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputPortAccess().getChannelChannelEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInputPortAccess().getChannelChannelCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__ChannelAssignment_4"


    // $ANTLR start "rule__InputPort__Estimated_freqAssignment_5_1"
    // InternalRosNetworkDsl.g:7946:1: rule__InputPort__Estimated_freqAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__InputPort__Estimated_freqAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7950:1: ( ( ruleEInt ) )
            // InternalRosNetworkDsl.g:7951:2: ( ruleEInt )
            {
            // InternalRosNetworkDsl.g:7951:2: ( ruleEInt )
            // InternalRosNetworkDsl.g:7952:3: ruleEInt
            {
             before(grammarAccess.getInputPortAccess().getEstimated_freqEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInputPortAccess().getEstimated_freqEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Estimated_freqAssignment_5_1"


    // $ANTLR start "rule__InputPort__Sample_toleranceAssignment_5_3"
    // InternalRosNetworkDsl.g:7961:1: rule__InputPort__Sample_toleranceAssignment_5_3 : ( ruleDouble ) ;
    public final void rule__InputPort__Sample_toleranceAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7965:1: ( ( ruleDouble ) )
            // InternalRosNetworkDsl.g:7966:2: ( ruleDouble )
            {
            // InternalRosNetworkDsl.g:7966:2: ( ruleDouble )
            // InternalRosNetworkDsl.g:7967:3: ruleDouble
            {
             before(grammarAccess.getInputPortAccess().getSample_toleranceDoubleParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getInputPortAccess().getSample_toleranceDoubleParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Sample_toleranceAssignment_5_3"


    // $ANTLR start "rule__InputPort__DebugAssignment_5_4"
    // InternalRosNetworkDsl.g:7976:1: rule__InputPort__DebugAssignment_5_4 : ( ( 'debug' ) ) ;
    public final void rule__InputPort__DebugAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7980:1: ( ( ( 'debug' ) ) )
            // InternalRosNetworkDsl.g:7981:2: ( ( 'debug' ) )
            {
            // InternalRosNetworkDsl.g:7981:2: ( ( 'debug' ) )
            // InternalRosNetworkDsl.g:7982:3: ( 'debug' )
            {
             before(grammarAccess.getInputPortAccess().getDebugDebugKeyword_5_4_0()); 
            // InternalRosNetworkDsl.g:7983:3: ( 'debug' )
            // InternalRosNetworkDsl.g:7984:4: 'debug'
            {
             before(grammarAccess.getInputPortAccess().getDebugDebugKeyword_5_4_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getDebugDebugKeyword_5_4_0()); 

            }

             after(grammarAccess.getInputPortAccess().getDebugDebugKeyword_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__DebugAssignment_5_4"


    // $ANTLR start "rule__InputPort__SynchronizesStateAssignment_6_1"
    // InternalRosNetworkDsl.g:7995:1: rule__InputPort__SynchronizesStateAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__InputPort__SynchronizesStateAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:7999:1: ( ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:8000:2: ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:8000:2: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:8001:3: ( ruleEString )
            {
             before(grammarAccess.getInputPortAccess().getSynchronizesStateContinousStateCrossReference_6_1_0()); 
            // InternalRosNetworkDsl.g:8002:3: ( ruleEString )
            // InternalRosNetworkDsl.g:8003:4: ruleEString
            {
             before(grammarAccess.getInputPortAccess().getSynchronizesStateContinousStateEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputPortAccess().getSynchronizesStateContinousStateEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getInputPortAccess().getSynchronizesStateContinousStateCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__SynchronizesStateAssignment_6_1"


    // $ANTLR start "rule__OutputPort__NameAssignment_2"
    // InternalRosNetworkDsl.g:8014:1: rule__OutputPort__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__OutputPort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:8018:1: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:8019:2: ( ruleEString )
            {
            // InternalRosNetworkDsl.g:8019:2: ( ruleEString )
            // InternalRosNetworkDsl.g:8020:3: ruleEString
            {
             before(grammarAccess.getOutputPortAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputPortAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__NameAssignment_2"


    // $ANTLR start "rule__OutputPort__ChannelAssignment_4"
    // InternalRosNetworkDsl.g:8029:1: rule__OutputPort__ChannelAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__OutputPort__ChannelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:8033:1: ( ( ( ruleEString ) ) )
            // InternalRosNetworkDsl.g:8034:2: ( ( ruleEString ) )
            {
            // InternalRosNetworkDsl.g:8034:2: ( ( ruleEString ) )
            // InternalRosNetworkDsl.g:8035:3: ( ruleEString )
            {
             before(grammarAccess.getOutputPortAccess().getChannelChannelCrossReference_4_0()); 
            // InternalRosNetworkDsl.g:8036:3: ( ruleEString )
            // InternalRosNetworkDsl.g:8037:4: ruleEString
            {
             before(grammarAccess.getOutputPortAccess().getChannelChannelEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputPortAccess().getChannelChannelEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getOutputPortAccess().getChannelChannelCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__ChannelAssignment_4"


    // $ANTLR start "rule__OutputPort__Estimated_freqAssignment_5_1"
    // InternalRosNetworkDsl.g:8048:1: rule__OutputPort__Estimated_freqAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__OutputPort__Estimated_freqAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:8052:1: ( ( ruleEInt ) )
            // InternalRosNetworkDsl.g:8053:2: ( ruleEInt )
            {
            // InternalRosNetworkDsl.g:8053:2: ( ruleEInt )
            // InternalRosNetworkDsl.g:8054:3: ruleEInt
            {
             before(grammarAccess.getOutputPortAccess().getEstimated_freqEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOutputPortAccess().getEstimated_freqEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Estimated_freqAssignment_5_1"


    // $ANTLR start "rule__OutputPort__DebugAssignment_5_2"
    // InternalRosNetworkDsl.g:8063:1: rule__OutputPort__DebugAssignment_5_2 : ( ( 'debug' ) ) ;
    public final void rule__OutputPort__DebugAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosNetworkDsl.g:8067:1: ( ( ( 'debug' ) ) )
            // InternalRosNetworkDsl.g:8068:2: ( ( 'debug' ) )
            {
            // InternalRosNetworkDsl.g:8068:2: ( ( 'debug' ) )
            // InternalRosNetworkDsl.g:8069:3: ( 'debug' )
            {
             before(grammarAccess.getOutputPortAccess().getDebugDebugKeyword_5_2_0()); 
            // InternalRosNetworkDsl.g:8070:3: ( 'debug' )
            // InternalRosNetworkDsl.g:8071:4: 'debug'
            {
             before(grammarAccess.getOutputPortAccess().getDebugDebugKeyword_5_2_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getDebugDebugKeyword_5_2_0()); 

            }

             after(grammarAccess.getOutputPortAccess().getDebugDebugKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__DebugAssignment_5_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000140100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000140000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002000030000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0002000031100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002000030000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000060000040000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000009200000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000009200100000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000009200000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000440000040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0021800000300000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000019200000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000019200100000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000019200000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0021800001300000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0400000000000000L});

}