package workflowdsl.ide.contentassist.antlr.internal;

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
import workflowdsl.services.WorkflowDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWorkflowDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(WorkflowDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalWorkflowDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:54:1: ( ruleModel EOF )
            // InternalWorkflowDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalWorkflowDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalWorkflowDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalWorkflowDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalWorkflowDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalWorkflowDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalWorkflowDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalWorkflowDsl.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:79:1: ( ruleImport EOF )
            // InternalWorkflowDsl.g:80:1: ruleImport EOF
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
    // InternalWorkflowDsl.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalWorkflowDsl.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalWorkflowDsl.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalWorkflowDsl.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalWorkflowDsl.g:94:3: ( rule__Import__Group__0 )
            // InternalWorkflowDsl.g:94:4: rule__Import__Group__0
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


    // $ANTLR start "entryRuleWorkflowDefinition"
    // InternalWorkflowDsl.g:103:1: entryRuleWorkflowDefinition : ruleWorkflowDefinition EOF ;
    public final void entryRuleWorkflowDefinition() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:104:1: ( ruleWorkflowDefinition EOF )
            // InternalWorkflowDsl.g:105:1: ruleWorkflowDefinition EOF
            {
             before(grammarAccess.getWorkflowDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkflowDefinition();

            state._fsp--;

             after(grammarAccess.getWorkflowDefinitionRule()); 
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
    // $ANTLR end "entryRuleWorkflowDefinition"


    // $ANTLR start "ruleWorkflowDefinition"
    // InternalWorkflowDsl.g:112:1: ruleWorkflowDefinition : ( ( rule__WorkflowDefinition__Group__0 ) ) ;
    public final void ruleWorkflowDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:116:2: ( ( ( rule__WorkflowDefinition__Group__0 ) ) )
            // InternalWorkflowDsl.g:117:2: ( ( rule__WorkflowDefinition__Group__0 ) )
            {
            // InternalWorkflowDsl.g:117:2: ( ( rule__WorkflowDefinition__Group__0 ) )
            // InternalWorkflowDsl.g:118:3: ( rule__WorkflowDefinition__Group__0 )
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getGroup()); 
            // InternalWorkflowDsl.g:119:3: ( rule__WorkflowDefinition__Group__0 )
            // InternalWorkflowDsl.g:119:4: rule__WorkflowDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkflowDefinition"


    // $ANTLR start "entryRulePackage"
    // InternalWorkflowDsl.g:128:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:129:1: ( rulePackage EOF )
            // InternalWorkflowDsl.g:130:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalWorkflowDsl.g:137:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:141:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalWorkflowDsl.g:142:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalWorkflowDsl.g:142:2: ( ( rule__Package__Group__0 ) )
            // InternalWorkflowDsl.g:143:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalWorkflowDsl.g:144:3: ( rule__Package__Group__0 )
            // InternalWorkflowDsl.g:144:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleClassName"
    // InternalWorkflowDsl.g:153:1: entryRuleClassName : ruleClassName EOF ;
    public final void entryRuleClassName() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:154:1: ( ruleClassName EOF )
            // InternalWorkflowDsl.g:155:1: ruleClassName EOF
            {
             before(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_1);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getClassNameRule()); 
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
    // $ANTLR end "entryRuleClassName"


    // $ANTLR start "ruleClassName"
    // InternalWorkflowDsl.g:162:1: ruleClassName : ( ( rule__ClassName__Group__0 ) ) ;
    public final void ruleClassName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:166:2: ( ( ( rule__ClassName__Group__0 ) ) )
            // InternalWorkflowDsl.g:167:2: ( ( rule__ClassName__Group__0 ) )
            {
            // InternalWorkflowDsl.g:167:2: ( ( rule__ClassName__Group__0 ) )
            // InternalWorkflowDsl.g:168:3: ( rule__ClassName__Group__0 )
            {
             before(grammarAccess.getClassNameAccess().getGroup()); 
            // InternalWorkflowDsl.g:169:3: ( rule__ClassName__Group__0 )
            // InternalWorkflowDsl.g:169:4: rule__ClassName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassName"


    // $ANTLR start "entryRuleEvent"
    // InternalWorkflowDsl.g:178:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:179:1: ( ruleEvent EOF )
            // InternalWorkflowDsl.g:180:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalWorkflowDsl.g:187:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:191:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalWorkflowDsl.g:192:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalWorkflowDsl.g:192:2: ( ( rule__Event__Group__0 ) )
            // InternalWorkflowDsl.g:193:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalWorkflowDsl.g:194:3: ( rule__Event__Group__0 )
            // InternalWorkflowDsl.g:194:4: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleVariable"
    // InternalWorkflowDsl.g:203:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:204:1: ( ruleVariable EOF )
            // InternalWorkflowDsl.g:205:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalWorkflowDsl.g:212:1: ruleVariable : ( ruleStringBasedConditionalVaraible ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:216:2: ( ( ruleStringBasedConditionalVaraible ) )
            // InternalWorkflowDsl.g:217:2: ( ruleStringBasedConditionalVaraible )
            {
            // InternalWorkflowDsl.g:217:2: ( ruleStringBasedConditionalVaraible )
            // InternalWorkflowDsl.g:218:3: ruleStringBasedConditionalVaraible
            {
             before(grammarAccess.getVariableAccess().getStringBasedConditionalVaraibleParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleStringBasedConditionalVaraible();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getStringBasedConditionalVaraibleParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleStringBasedConditionalVaraible"
    // InternalWorkflowDsl.g:228:1: entryRuleStringBasedConditionalVaraible : ruleStringBasedConditionalVaraible EOF ;
    public final void entryRuleStringBasedConditionalVaraible() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:229:1: ( ruleStringBasedConditionalVaraible EOF )
            // InternalWorkflowDsl.g:230:1: ruleStringBasedConditionalVaraible EOF
            {
             before(grammarAccess.getStringBasedConditionalVaraibleRule()); 
            pushFollow(FOLLOW_1);
            ruleStringBasedConditionalVaraible();

            state._fsp--;

             after(grammarAccess.getStringBasedConditionalVaraibleRule()); 
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
    // $ANTLR end "entryRuleStringBasedConditionalVaraible"


    // $ANTLR start "ruleStringBasedConditionalVaraible"
    // InternalWorkflowDsl.g:237:1: ruleStringBasedConditionalVaraible : ( ( rule__StringBasedConditionalVaraible__Group__0 ) ) ;
    public final void ruleStringBasedConditionalVaraible() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:241:2: ( ( ( rule__StringBasedConditionalVaraible__Group__0 ) ) )
            // InternalWorkflowDsl.g:242:2: ( ( rule__StringBasedConditionalVaraible__Group__0 ) )
            {
            // InternalWorkflowDsl.g:242:2: ( ( rule__StringBasedConditionalVaraible__Group__0 ) )
            // InternalWorkflowDsl.g:243:3: ( rule__StringBasedConditionalVaraible__Group__0 )
            {
             before(grammarAccess.getStringBasedConditionalVaraibleAccess().getGroup()); 
            // InternalWorkflowDsl.g:244:3: ( rule__StringBasedConditionalVaraible__Group__0 )
            // InternalWorkflowDsl.g:244:4: rule__StringBasedConditionalVaraible__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringBasedConditionalVaraible__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringBasedConditionalVaraibleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringBasedConditionalVaraible"


    // $ANTLR start "entryRuleNode"
    // InternalWorkflowDsl.g:253:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:254:1: ( ruleNode EOF )
            // InternalWorkflowDsl.g:255:1: ruleNode EOF
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
    // InternalWorkflowDsl.g:262:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:266:2: ( ( ( rule__Node__Alternatives ) ) )
            // InternalWorkflowDsl.g:267:2: ( ( rule__Node__Alternatives ) )
            {
            // InternalWorkflowDsl.g:267:2: ( ( rule__Node__Alternatives ) )
            // InternalWorkflowDsl.g:268:3: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // InternalWorkflowDsl.g:269:3: ( rule__Node__Alternatives )
            // InternalWorkflowDsl.g:269:4: rule__Node__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Node__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleServiceTask"
    // InternalWorkflowDsl.g:278:1: entryRuleServiceTask : ruleServiceTask EOF ;
    public final void entryRuleServiceTask() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:279:1: ( ruleServiceTask EOF )
            // InternalWorkflowDsl.g:280:1: ruleServiceTask EOF
            {
             before(grammarAccess.getServiceTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceTask();

            state._fsp--;

             after(grammarAccess.getServiceTaskRule()); 
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
    // $ANTLR end "entryRuleServiceTask"


    // $ANTLR start "ruleServiceTask"
    // InternalWorkflowDsl.g:287:1: ruleServiceTask : ( ( rule__ServiceTask__Alternatives ) ) ;
    public final void ruleServiceTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:291:2: ( ( ( rule__ServiceTask__Alternatives ) ) )
            // InternalWorkflowDsl.g:292:2: ( ( rule__ServiceTask__Alternatives ) )
            {
            // InternalWorkflowDsl.g:292:2: ( ( rule__ServiceTask__Alternatives ) )
            // InternalWorkflowDsl.g:293:3: ( rule__ServiceTask__Alternatives )
            {
             before(grammarAccess.getServiceTaskAccess().getAlternatives()); 
            // InternalWorkflowDsl.g:294:3: ( rule__ServiceTask__Alternatives )
            // InternalWorkflowDsl.g:294:4: rule__ServiceTask__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ServiceTask__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceTaskAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceTask"


    // $ANTLR start "entryRuleGateway"
    // InternalWorkflowDsl.g:303:1: entryRuleGateway : ruleGateway EOF ;
    public final void entryRuleGateway() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:304:1: ( ruleGateway EOF )
            // InternalWorkflowDsl.g:305:1: ruleGateway EOF
            {
             before(grammarAccess.getGatewayRule()); 
            pushFollow(FOLLOW_1);
            ruleGateway();

            state._fsp--;

             after(grammarAccess.getGatewayRule()); 
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
    // $ANTLR end "entryRuleGateway"


    // $ANTLR start "ruleGateway"
    // InternalWorkflowDsl.g:312:1: ruleGateway : ( ( rule__Gateway__Alternatives ) ) ;
    public final void ruleGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:316:2: ( ( ( rule__Gateway__Alternatives ) ) )
            // InternalWorkflowDsl.g:317:2: ( ( rule__Gateway__Alternatives ) )
            {
            // InternalWorkflowDsl.g:317:2: ( ( rule__Gateway__Alternatives ) )
            // InternalWorkflowDsl.g:318:3: ( rule__Gateway__Alternatives )
            {
             before(grammarAccess.getGatewayAccess().getAlternatives()); 
            // InternalWorkflowDsl.g:319:3: ( rule__Gateway__Alternatives )
            // InternalWorkflowDsl.g:319:4: rule__Gateway__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGatewayAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGateway"


    // $ANTLR start "entryRuleDivergingGateway"
    // InternalWorkflowDsl.g:328:1: entryRuleDivergingGateway : ruleDivergingGateway EOF ;
    public final void entryRuleDivergingGateway() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:329:1: ( ruleDivergingGateway EOF )
            // InternalWorkflowDsl.g:330:1: ruleDivergingGateway EOF
            {
             before(grammarAccess.getDivergingGatewayRule()); 
            pushFollow(FOLLOW_1);
            ruleDivergingGateway();

            state._fsp--;

             after(grammarAccess.getDivergingGatewayRule()); 
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
    // $ANTLR end "entryRuleDivergingGateway"


    // $ANTLR start "ruleDivergingGateway"
    // InternalWorkflowDsl.g:337:1: ruleDivergingGateway : ( ( rule__DivergingGateway__Alternatives ) ) ;
    public final void ruleDivergingGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:341:2: ( ( ( rule__DivergingGateway__Alternatives ) ) )
            // InternalWorkflowDsl.g:342:2: ( ( rule__DivergingGateway__Alternatives ) )
            {
            // InternalWorkflowDsl.g:342:2: ( ( rule__DivergingGateway__Alternatives ) )
            // InternalWorkflowDsl.g:343:3: ( rule__DivergingGateway__Alternatives )
            {
             before(grammarAccess.getDivergingGatewayAccess().getAlternatives()); 
            // InternalWorkflowDsl.g:344:3: ( rule__DivergingGateway__Alternatives )
            // InternalWorkflowDsl.g:344:4: rule__DivergingGateway__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DivergingGateway__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDivergingGatewayAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDivergingGateway"


    // $ANTLR start "entryRuleConvergingGateway"
    // InternalWorkflowDsl.g:353:1: entryRuleConvergingGateway : ruleConvergingGateway EOF ;
    public final void entryRuleConvergingGateway() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:354:1: ( ruleConvergingGateway EOF )
            // InternalWorkflowDsl.g:355:1: ruleConvergingGateway EOF
            {
             before(grammarAccess.getConvergingGatewayRule()); 
            pushFollow(FOLLOW_1);
            ruleConvergingGateway();

            state._fsp--;

             after(grammarAccess.getConvergingGatewayRule()); 
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
    // $ANTLR end "entryRuleConvergingGateway"


    // $ANTLR start "ruleConvergingGateway"
    // InternalWorkflowDsl.g:362:1: ruleConvergingGateway : ( ( rule__ConvergingGateway__Alternatives ) ) ;
    public final void ruleConvergingGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:366:2: ( ( ( rule__ConvergingGateway__Alternatives ) ) )
            // InternalWorkflowDsl.g:367:2: ( ( rule__ConvergingGateway__Alternatives ) )
            {
            // InternalWorkflowDsl.g:367:2: ( ( rule__ConvergingGateway__Alternatives ) )
            // InternalWorkflowDsl.g:368:3: ( rule__ConvergingGateway__Alternatives )
            {
             before(grammarAccess.getConvergingGatewayAccess().getAlternatives()); 
            // InternalWorkflowDsl.g:369:3: ( rule__ConvergingGateway__Alternatives )
            // InternalWorkflowDsl.g:369:4: rule__ConvergingGateway__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConvergingGateway__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConvergingGatewayAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConvergingGateway"


    // $ANTLR start "entryRuleStartNode"
    // InternalWorkflowDsl.g:378:1: entryRuleStartNode : ruleStartNode EOF ;
    public final void entryRuleStartNode() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:379:1: ( ruleStartNode EOF )
            // InternalWorkflowDsl.g:380:1: ruleStartNode EOF
            {
             before(grammarAccess.getStartNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleStartNode();

            state._fsp--;

             after(grammarAccess.getStartNodeRule()); 
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
    // $ANTLR end "entryRuleStartNode"


    // $ANTLR start "ruleStartNode"
    // InternalWorkflowDsl.g:387:1: ruleStartNode : ( ( rule__StartNode__Group__0 ) ) ;
    public final void ruleStartNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:391:2: ( ( ( rule__StartNode__Group__0 ) ) )
            // InternalWorkflowDsl.g:392:2: ( ( rule__StartNode__Group__0 ) )
            {
            // InternalWorkflowDsl.g:392:2: ( ( rule__StartNode__Group__0 ) )
            // InternalWorkflowDsl.g:393:3: ( rule__StartNode__Group__0 )
            {
             before(grammarAccess.getStartNodeAccess().getGroup()); 
            // InternalWorkflowDsl.g:394:3: ( rule__StartNode__Group__0 )
            // InternalWorkflowDsl.g:394:4: rule__StartNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartNode"


    // $ANTLR start "entryRuleEndNode"
    // InternalWorkflowDsl.g:403:1: entryRuleEndNode : ruleEndNode EOF ;
    public final void entryRuleEndNode() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:404:1: ( ruleEndNode EOF )
            // InternalWorkflowDsl.g:405:1: ruleEndNode EOF
            {
             before(grammarAccess.getEndNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleEndNode();

            state._fsp--;

             after(grammarAccess.getEndNodeRule()); 
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
    // $ANTLR end "entryRuleEndNode"


    // $ANTLR start "ruleEndNode"
    // InternalWorkflowDsl.g:412:1: ruleEndNode : ( ( rule__EndNode__Group__0 ) ) ;
    public final void ruleEndNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:416:2: ( ( ( rule__EndNode__Group__0 ) ) )
            // InternalWorkflowDsl.g:417:2: ( ( rule__EndNode__Group__0 ) )
            {
            // InternalWorkflowDsl.g:417:2: ( ( rule__EndNode__Group__0 ) )
            // InternalWorkflowDsl.g:418:3: ( rule__EndNode__Group__0 )
            {
             before(grammarAccess.getEndNodeAccess().getGroup()); 
            // InternalWorkflowDsl.g:419:3: ( rule__EndNode__Group__0 )
            // InternalWorkflowDsl.g:419:4: rule__EndNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EndNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndNode"


    // $ANTLR start "entryRuleSignal"
    // InternalWorkflowDsl.g:428:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:429:1: ( ruleSignal EOF )
            // InternalWorkflowDsl.g:430:1: ruleSignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_1);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getSignalRule()); 
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
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalWorkflowDsl.g:437:1: ruleSignal : ( ( rule__Signal__Group__0 ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:441:2: ( ( ( rule__Signal__Group__0 ) ) )
            // InternalWorkflowDsl.g:442:2: ( ( rule__Signal__Group__0 ) )
            {
            // InternalWorkflowDsl.g:442:2: ( ( rule__Signal__Group__0 ) )
            // InternalWorkflowDsl.g:443:3: ( rule__Signal__Group__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup()); 
            // InternalWorkflowDsl.g:444:3: ( rule__Signal__Group__0 )
            // InternalWorkflowDsl.g:444:4: rule__Signal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleAsyncronousServiceTask"
    // InternalWorkflowDsl.g:453:1: entryRuleAsyncronousServiceTask : ruleAsyncronousServiceTask EOF ;
    public final void entryRuleAsyncronousServiceTask() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:454:1: ( ruleAsyncronousServiceTask EOF )
            // InternalWorkflowDsl.g:455:1: ruleAsyncronousServiceTask EOF
            {
             before(grammarAccess.getAsyncronousServiceTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleAsyncronousServiceTask();

            state._fsp--;

             after(grammarAccess.getAsyncronousServiceTaskRule()); 
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
    // $ANTLR end "entryRuleAsyncronousServiceTask"


    // $ANTLR start "ruleAsyncronousServiceTask"
    // InternalWorkflowDsl.g:462:1: ruleAsyncronousServiceTask : ( ( rule__AsyncronousServiceTask__Group__0 ) ) ;
    public final void ruleAsyncronousServiceTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:466:2: ( ( ( rule__AsyncronousServiceTask__Group__0 ) ) )
            // InternalWorkflowDsl.g:467:2: ( ( rule__AsyncronousServiceTask__Group__0 ) )
            {
            // InternalWorkflowDsl.g:467:2: ( ( rule__AsyncronousServiceTask__Group__0 ) )
            // InternalWorkflowDsl.g:468:3: ( rule__AsyncronousServiceTask__Group__0 )
            {
             before(grammarAccess.getAsyncronousServiceTaskAccess().getGroup()); 
            // InternalWorkflowDsl.g:469:3: ( rule__AsyncronousServiceTask__Group__0 )
            // InternalWorkflowDsl.g:469:4: rule__AsyncronousServiceTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AsyncronousServiceTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAsyncronousServiceTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAsyncronousServiceTask"


    // $ANTLR start "entryRuleSyncronousServiceTask"
    // InternalWorkflowDsl.g:478:1: entryRuleSyncronousServiceTask : ruleSyncronousServiceTask EOF ;
    public final void entryRuleSyncronousServiceTask() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:479:1: ( ruleSyncronousServiceTask EOF )
            // InternalWorkflowDsl.g:480:1: ruleSyncronousServiceTask EOF
            {
             before(grammarAccess.getSyncronousServiceTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleSyncronousServiceTask();

            state._fsp--;

             after(grammarAccess.getSyncronousServiceTaskRule()); 
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
    // $ANTLR end "entryRuleSyncronousServiceTask"


    // $ANTLR start "ruleSyncronousServiceTask"
    // InternalWorkflowDsl.g:487:1: ruleSyncronousServiceTask : ( ( rule__SyncronousServiceTask__Group__0 ) ) ;
    public final void ruleSyncronousServiceTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:491:2: ( ( ( rule__SyncronousServiceTask__Group__0 ) ) )
            // InternalWorkflowDsl.g:492:2: ( ( rule__SyncronousServiceTask__Group__0 ) )
            {
            // InternalWorkflowDsl.g:492:2: ( ( rule__SyncronousServiceTask__Group__0 ) )
            // InternalWorkflowDsl.g:493:3: ( rule__SyncronousServiceTask__Group__0 )
            {
             before(grammarAccess.getSyncronousServiceTaskAccess().getGroup()); 
            // InternalWorkflowDsl.g:494:3: ( rule__SyncronousServiceTask__Group__0 )
            // InternalWorkflowDsl.g:494:4: rule__SyncronousServiceTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SyncronousServiceTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSyncronousServiceTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSyncronousServiceTask"


    // $ANTLR start "entryRuleExlcusiveDiverging"
    // InternalWorkflowDsl.g:503:1: entryRuleExlcusiveDiverging : ruleExlcusiveDiverging EOF ;
    public final void entryRuleExlcusiveDiverging() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:504:1: ( ruleExlcusiveDiverging EOF )
            // InternalWorkflowDsl.g:505:1: ruleExlcusiveDiverging EOF
            {
             before(grammarAccess.getExlcusiveDivergingRule()); 
            pushFollow(FOLLOW_1);
            ruleExlcusiveDiverging();

            state._fsp--;

             after(grammarAccess.getExlcusiveDivergingRule()); 
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
    // $ANTLR end "entryRuleExlcusiveDiverging"


    // $ANTLR start "ruleExlcusiveDiverging"
    // InternalWorkflowDsl.g:512:1: ruleExlcusiveDiverging : ( ( rule__ExlcusiveDiverging__Group__0 ) ) ;
    public final void ruleExlcusiveDiverging() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:516:2: ( ( ( rule__ExlcusiveDiverging__Group__0 ) ) )
            // InternalWorkflowDsl.g:517:2: ( ( rule__ExlcusiveDiverging__Group__0 ) )
            {
            // InternalWorkflowDsl.g:517:2: ( ( rule__ExlcusiveDiverging__Group__0 ) )
            // InternalWorkflowDsl.g:518:3: ( rule__ExlcusiveDiverging__Group__0 )
            {
             before(grammarAccess.getExlcusiveDivergingAccess().getGroup()); 
            // InternalWorkflowDsl.g:519:3: ( rule__ExlcusiveDiverging__Group__0 )
            // InternalWorkflowDsl.g:519:4: rule__ExlcusiveDiverging__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExlcusiveDiverging__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExlcusiveDivergingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExlcusiveDiverging"


    // $ANTLR start "entryRuleParallelDiverging"
    // InternalWorkflowDsl.g:528:1: entryRuleParallelDiverging : ruleParallelDiverging EOF ;
    public final void entryRuleParallelDiverging() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:529:1: ( ruleParallelDiverging EOF )
            // InternalWorkflowDsl.g:530:1: ruleParallelDiverging EOF
            {
             before(grammarAccess.getParallelDivergingRule()); 
            pushFollow(FOLLOW_1);
            ruleParallelDiverging();

            state._fsp--;

             after(grammarAccess.getParallelDivergingRule()); 
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
    // $ANTLR end "entryRuleParallelDiverging"


    // $ANTLR start "ruleParallelDiverging"
    // InternalWorkflowDsl.g:537:1: ruleParallelDiverging : ( ( rule__ParallelDiverging__Group__0 ) ) ;
    public final void ruleParallelDiverging() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:541:2: ( ( ( rule__ParallelDiverging__Group__0 ) ) )
            // InternalWorkflowDsl.g:542:2: ( ( rule__ParallelDiverging__Group__0 ) )
            {
            // InternalWorkflowDsl.g:542:2: ( ( rule__ParallelDiverging__Group__0 ) )
            // InternalWorkflowDsl.g:543:3: ( rule__ParallelDiverging__Group__0 )
            {
             before(grammarAccess.getParallelDivergingAccess().getGroup()); 
            // InternalWorkflowDsl.g:544:3: ( rule__ParallelDiverging__Group__0 )
            // InternalWorkflowDsl.g:544:4: rule__ParallelDiverging__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParallelDiverging__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParallelDivergingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParallelDiverging"


    // $ANTLR start "entryRuleExclusiveConverging"
    // InternalWorkflowDsl.g:553:1: entryRuleExclusiveConverging : ruleExclusiveConverging EOF ;
    public final void entryRuleExclusiveConverging() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:554:1: ( ruleExclusiveConverging EOF )
            // InternalWorkflowDsl.g:555:1: ruleExclusiveConverging EOF
            {
             before(grammarAccess.getExclusiveConvergingRule()); 
            pushFollow(FOLLOW_1);
            ruleExclusiveConverging();

            state._fsp--;

             after(grammarAccess.getExclusiveConvergingRule()); 
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
    // $ANTLR end "entryRuleExclusiveConverging"


    // $ANTLR start "ruleExclusiveConverging"
    // InternalWorkflowDsl.g:562:1: ruleExclusiveConverging : ( ( rule__ExclusiveConverging__Group__0 ) ) ;
    public final void ruleExclusiveConverging() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:566:2: ( ( ( rule__ExclusiveConverging__Group__0 ) ) )
            // InternalWorkflowDsl.g:567:2: ( ( rule__ExclusiveConverging__Group__0 ) )
            {
            // InternalWorkflowDsl.g:567:2: ( ( rule__ExclusiveConverging__Group__0 ) )
            // InternalWorkflowDsl.g:568:3: ( rule__ExclusiveConverging__Group__0 )
            {
             before(grammarAccess.getExclusiveConvergingAccess().getGroup()); 
            // InternalWorkflowDsl.g:569:3: ( rule__ExclusiveConverging__Group__0 )
            // InternalWorkflowDsl.g:569:4: rule__ExclusiveConverging__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveConverging__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveConvergingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExclusiveConverging"


    // $ANTLR start "entryRuleParallelConverging"
    // InternalWorkflowDsl.g:578:1: entryRuleParallelConverging : ruleParallelConverging EOF ;
    public final void entryRuleParallelConverging() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:579:1: ( ruleParallelConverging EOF )
            // InternalWorkflowDsl.g:580:1: ruleParallelConverging EOF
            {
             before(grammarAccess.getParallelConvergingRule()); 
            pushFollow(FOLLOW_1);
            ruleParallelConverging();

            state._fsp--;

             after(grammarAccess.getParallelConvergingRule()); 
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
    // $ANTLR end "entryRuleParallelConverging"


    // $ANTLR start "ruleParallelConverging"
    // InternalWorkflowDsl.g:587:1: ruleParallelConverging : ( ( rule__ParallelConverging__Group__0 ) ) ;
    public final void ruleParallelConverging() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:591:2: ( ( ( rule__ParallelConverging__Group__0 ) ) )
            // InternalWorkflowDsl.g:592:2: ( ( rule__ParallelConverging__Group__0 ) )
            {
            // InternalWorkflowDsl.g:592:2: ( ( rule__ParallelConverging__Group__0 ) )
            // InternalWorkflowDsl.g:593:3: ( rule__ParallelConverging__Group__0 )
            {
             before(grammarAccess.getParallelConvergingAccess().getGroup()); 
            // InternalWorkflowDsl.g:594:3: ( rule__ParallelConverging__Group__0 )
            // InternalWorkflowDsl.g:594:4: rule__ParallelConverging__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParallelConverging__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParallelConvergingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParallelConverging"


    // $ANTLR start "entryRuleConnector"
    // InternalWorkflowDsl.g:603:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:604:1: ( ruleConnector EOF )
            // InternalWorkflowDsl.g:605:1: ruleConnector EOF
            {
             before(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorRule()); 
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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalWorkflowDsl.g:612:1: ruleConnector : ( ( rule__Connector__Alternatives ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:616:2: ( ( ( rule__Connector__Alternatives ) ) )
            // InternalWorkflowDsl.g:617:2: ( ( rule__Connector__Alternatives ) )
            {
            // InternalWorkflowDsl.g:617:2: ( ( rule__Connector__Alternatives ) )
            // InternalWorkflowDsl.g:618:3: ( rule__Connector__Alternatives )
            {
             before(grammarAccess.getConnectorAccess().getAlternatives()); 
            // InternalWorkflowDsl.g:619:3: ( rule__Connector__Alternatives )
            // InternalWorkflowDsl.g:619:4: rule__Connector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleBasicConnector"
    // InternalWorkflowDsl.g:628:1: entryRuleBasicConnector : ruleBasicConnector EOF ;
    public final void entryRuleBasicConnector() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:629:1: ( ruleBasicConnector EOF )
            // InternalWorkflowDsl.g:630:1: ruleBasicConnector EOF
            {
             before(grammarAccess.getBasicConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicConnector();

            state._fsp--;

             after(grammarAccess.getBasicConnectorRule()); 
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
    // $ANTLR end "entryRuleBasicConnector"


    // $ANTLR start "ruleBasicConnector"
    // InternalWorkflowDsl.g:637:1: ruleBasicConnector : ( ( rule__BasicConnector__Group__0 ) ) ;
    public final void ruleBasicConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:641:2: ( ( ( rule__BasicConnector__Group__0 ) ) )
            // InternalWorkflowDsl.g:642:2: ( ( rule__BasicConnector__Group__0 ) )
            {
            // InternalWorkflowDsl.g:642:2: ( ( rule__BasicConnector__Group__0 ) )
            // InternalWorkflowDsl.g:643:3: ( rule__BasicConnector__Group__0 )
            {
             before(grammarAccess.getBasicConnectorAccess().getGroup()); 
            // InternalWorkflowDsl.g:644:3: ( rule__BasicConnector__Group__0 )
            // InternalWorkflowDsl.g:644:4: rule__BasicConnector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicConnector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicConnectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicConnector"


    // $ANTLR start "entryRuleInputData"
    // InternalWorkflowDsl.g:653:1: entryRuleInputData : ruleInputData EOF ;
    public final void entryRuleInputData() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:654:1: ( ruleInputData EOF )
            // InternalWorkflowDsl.g:655:1: ruleInputData EOF
            {
             before(grammarAccess.getInputDataRule()); 
            pushFollow(FOLLOW_1);
            ruleInputData();

            state._fsp--;

             after(grammarAccess.getInputDataRule()); 
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
    // $ANTLR end "entryRuleInputData"


    // $ANTLR start "ruleInputData"
    // InternalWorkflowDsl.g:662:1: ruleInputData : ( ( rule__InputData__Alternatives ) ) ;
    public final void ruleInputData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:666:2: ( ( ( rule__InputData__Alternatives ) ) )
            // InternalWorkflowDsl.g:667:2: ( ( rule__InputData__Alternatives ) )
            {
            // InternalWorkflowDsl.g:667:2: ( ( rule__InputData__Alternatives ) )
            // InternalWorkflowDsl.g:668:3: ( rule__InputData__Alternatives )
            {
             before(grammarAccess.getInputDataAccess().getAlternatives()); 
            // InternalWorkflowDsl.g:669:3: ( rule__InputData__Alternatives )
            // InternalWorkflowDsl.g:669:4: rule__InputData__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InputData__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInputDataAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputData"


    // $ANTLR start "entryRuleTaskNameInput"
    // InternalWorkflowDsl.g:678:1: entryRuleTaskNameInput : ruleTaskNameInput EOF ;
    public final void entryRuleTaskNameInput() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:679:1: ( ruleTaskNameInput EOF )
            // InternalWorkflowDsl.g:680:1: ruleTaskNameInput EOF
            {
             before(grammarAccess.getTaskNameInputRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskNameInput();

            state._fsp--;

             after(grammarAccess.getTaskNameInputRule()); 
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
    // $ANTLR end "entryRuleTaskNameInput"


    // $ANTLR start "ruleTaskNameInput"
    // InternalWorkflowDsl.g:687:1: ruleTaskNameInput : ( ( rule__TaskNameInput__Group__0 ) ) ;
    public final void ruleTaskNameInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:691:2: ( ( ( rule__TaskNameInput__Group__0 ) ) )
            // InternalWorkflowDsl.g:692:2: ( ( rule__TaskNameInput__Group__0 ) )
            {
            // InternalWorkflowDsl.g:692:2: ( ( rule__TaskNameInput__Group__0 ) )
            // InternalWorkflowDsl.g:693:3: ( rule__TaskNameInput__Group__0 )
            {
             before(grammarAccess.getTaskNameInputAccess().getGroup()); 
            // InternalWorkflowDsl.g:694:3: ( rule__TaskNameInput__Group__0 )
            // InternalWorkflowDsl.g:694:4: rule__TaskNameInput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskNameInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskNameInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskNameInput"


    // $ANTLR start "entryRuleVariableBasedInput"
    // InternalWorkflowDsl.g:703:1: entryRuleVariableBasedInput : ruleVariableBasedInput EOF ;
    public final void entryRuleVariableBasedInput() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:704:1: ( ruleVariableBasedInput EOF )
            // InternalWorkflowDsl.g:705:1: ruleVariableBasedInput EOF
            {
             before(grammarAccess.getVariableBasedInputRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableBasedInput();

            state._fsp--;

             after(grammarAccess.getVariableBasedInputRule()); 
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
    // $ANTLR end "entryRuleVariableBasedInput"


    // $ANTLR start "ruleVariableBasedInput"
    // InternalWorkflowDsl.g:712:1: ruleVariableBasedInput : ( ( rule__VariableBasedInput__Group__0 ) ) ;
    public final void ruleVariableBasedInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:716:2: ( ( ( rule__VariableBasedInput__Group__0 ) ) )
            // InternalWorkflowDsl.g:717:2: ( ( rule__VariableBasedInput__Group__0 ) )
            {
            // InternalWorkflowDsl.g:717:2: ( ( rule__VariableBasedInput__Group__0 ) )
            // InternalWorkflowDsl.g:718:3: ( rule__VariableBasedInput__Group__0 )
            {
             before(grammarAccess.getVariableBasedInputAccess().getGroup()); 
            // InternalWorkflowDsl.g:719:3: ( rule__VariableBasedInput__Group__0 )
            // InternalWorkflowDsl.g:719:4: rule__VariableBasedInput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableBasedInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableBasedInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableBasedInput"


    // $ANTLR start "entryRuleEventBasedInput"
    // InternalWorkflowDsl.g:728:1: entryRuleEventBasedInput : ruleEventBasedInput EOF ;
    public final void entryRuleEventBasedInput() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:729:1: ( ruleEventBasedInput EOF )
            // InternalWorkflowDsl.g:730:1: ruleEventBasedInput EOF
            {
             before(grammarAccess.getEventBasedInputRule()); 
            pushFollow(FOLLOW_1);
            ruleEventBasedInput();

            state._fsp--;

             after(grammarAccess.getEventBasedInputRule()); 
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
    // $ANTLR end "entryRuleEventBasedInput"


    // $ANTLR start "ruleEventBasedInput"
    // InternalWorkflowDsl.g:737:1: ruleEventBasedInput : ( ( rule__EventBasedInput__Group__0 ) ) ;
    public final void ruleEventBasedInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:741:2: ( ( ( rule__EventBasedInput__Group__0 ) ) )
            // InternalWorkflowDsl.g:742:2: ( ( rule__EventBasedInput__Group__0 ) )
            {
            // InternalWorkflowDsl.g:742:2: ( ( rule__EventBasedInput__Group__0 ) )
            // InternalWorkflowDsl.g:743:3: ( rule__EventBasedInput__Group__0 )
            {
             before(grammarAccess.getEventBasedInputAccess().getGroup()); 
            // InternalWorkflowDsl.g:744:3: ( rule__EventBasedInput__Group__0 )
            // InternalWorkflowDsl.g:744:4: rule__EventBasedInput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventBasedInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventBasedInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventBasedInput"


    // $ANTLR start "entryRuleOutputData"
    // InternalWorkflowDsl.g:753:1: entryRuleOutputData : ruleOutputData EOF ;
    public final void entryRuleOutputData() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:754:1: ( ruleOutputData EOF )
            // InternalWorkflowDsl.g:755:1: ruleOutputData EOF
            {
             before(grammarAccess.getOutputDataRule()); 
            pushFollow(FOLLOW_1);
            ruleOutputData();

            state._fsp--;

             after(grammarAccess.getOutputDataRule()); 
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
    // $ANTLR end "entryRuleOutputData"


    // $ANTLR start "ruleOutputData"
    // InternalWorkflowDsl.g:762:1: ruleOutputData : ( ( rule__OutputData__Group__0 ) ) ;
    public final void ruleOutputData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:766:2: ( ( ( rule__OutputData__Group__0 ) ) )
            // InternalWorkflowDsl.g:767:2: ( ( rule__OutputData__Group__0 ) )
            {
            // InternalWorkflowDsl.g:767:2: ( ( rule__OutputData__Group__0 ) )
            // InternalWorkflowDsl.g:768:3: ( rule__OutputData__Group__0 )
            {
             before(grammarAccess.getOutputDataAccess().getGroup()); 
            // InternalWorkflowDsl.g:769:3: ( rule__OutputData__Group__0 )
            // InternalWorkflowDsl.g:769:4: rule__OutputData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutputData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputData"


    // $ANTLR start "entryRuleConditionalConnector"
    // InternalWorkflowDsl.g:778:1: entryRuleConditionalConnector : ruleConditionalConnector EOF ;
    public final void entryRuleConditionalConnector() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:779:1: ( ruleConditionalConnector EOF )
            // InternalWorkflowDsl.g:780:1: ruleConditionalConnector EOF
            {
             before(grammarAccess.getConditionalConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalConnector();

            state._fsp--;

             after(grammarAccess.getConditionalConnectorRule()); 
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
    // $ANTLR end "entryRuleConditionalConnector"


    // $ANTLR start "ruleConditionalConnector"
    // InternalWorkflowDsl.g:787:1: ruleConditionalConnector : ( ( rule__ConditionalConnector__Group__0 ) ) ;
    public final void ruleConditionalConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:791:2: ( ( ( rule__ConditionalConnector__Group__0 ) ) )
            // InternalWorkflowDsl.g:792:2: ( ( rule__ConditionalConnector__Group__0 ) )
            {
            // InternalWorkflowDsl.g:792:2: ( ( rule__ConditionalConnector__Group__0 ) )
            // InternalWorkflowDsl.g:793:3: ( rule__ConditionalConnector__Group__0 )
            {
             before(grammarAccess.getConditionalConnectorAccess().getGroup()); 
            // InternalWorkflowDsl.g:794:3: ( rule__ConditionalConnector__Group__0 )
            // InternalWorkflowDsl.g:794:4: rule__ConditionalConnector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalConnectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalConnector"


    // $ANTLR start "entryRuleTest"
    // InternalWorkflowDsl.g:803:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:804:1: ( ruleTest EOF )
            // InternalWorkflowDsl.g:805:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalWorkflowDsl.g:812:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:816:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalWorkflowDsl.g:817:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalWorkflowDsl.g:817:2: ( ( rule__Test__Group__0 ) )
            // InternalWorkflowDsl.g:818:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalWorkflowDsl.g:819:3: ( rule__Test__Group__0 )
            // InternalWorkflowDsl.g:819:4: rule__Test__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleProcessVariable"
    // InternalWorkflowDsl.g:828:1: entryRuleProcessVariable : ruleProcessVariable EOF ;
    public final void entryRuleProcessVariable() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:829:1: ( ruleProcessVariable EOF )
            // InternalWorkflowDsl.g:830:1: ruleProcessVariable EOF
            {
             before(grammarAccess.getProcessVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessVariable();

            state._fsp--;

             after(grammarAccess.getProcessVariableRule()); 
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
    // $ANTLR end "entryRuleProcessVariable"


    // $ANTLR start "ruleProcessVariable"
    // InternalWorkflowDsl.g:837:1: ruleProcessVariable : ( ( rule__ProcessVariable__Group__0 ) ) ;
    public final void ruleProcessVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:841:2: ( ( ( rule__ProcessVariable__Group__0 ) ) )
            // InternalWorkflowDsl.g:842:2: ( ( rule__ProcessVariable__Group__0 ) )
            {
            // InternalWorkflowDsl.g:842:2: ( ( rule__ProcessVariable__Group__0 ) )
            // InternalWorkflowDsl.g:843:3: ( rule__ProcessVariable__Group__0 )
            {
             before(grammarAccess.getProcessVariableAccess().getGroup()); 
            // InternalWorkflowDsl.g:844:3: ( rule__ProcessVariable__Group__0 )
            // InternalWorkflowDsl.g:844:4: rule__ProcessVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProcessVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessVariable"


    // $ANTLR start "entryRuleFireSignal"
    // InternalWorkflowDsl.g:853:1: entryRuleFireSignal : ruleFireSignal EOF ;
    public final void entryRuleFireSignal() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:854:1: ( ruleFireSignal EOF )
            // InternalWorkflowDsl.g:855:1: ruleFireSignal EOF
            {
             before(grammarAccess.getFireSignalRule()); 
            pushFollow(FOLLOW_1);
            ruleFireSignal();

            state._fsp--;

             after(grammarAccess.getFireSignalRule()); 
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
    // $ANTLR end "entryRuleFireSignal"


    // $ANTLR start "ruleFireSignal"
    // InternalWorkflowDsl.g:862:1: ruleFireSignal : ( ( rule__FireSignal__Group__0 ) ) ;
    public final void ruleFireSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:866:2: ( ( ( rule__FireSignal__Group__0 ) ) )
            // InternalWorkflowDsl.g:867:2: ( ( rule__FireSignal__Group__0 ) )
            {
            // InternalWorkflowDsl.g:867:2: ( ( rule__FireSignal__Group__0 ) )
            // InternalWorkflowDsl.g:868:3: ( rule__FireSignal__Group__0 )
            {
             before(grammarAccess.getFireSignalAccess().getGroup()); 
            // InternalWorkflowDsl.g:869:3: ( rule__FireSignal__Group__0 )
            // InternalWorkflowDsl.g:869:4: rule__FireSignal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FireSignal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFireSignalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFireSignal"


    // $ANTLR start "entryRuleAssertFlow"
    // InternalWorkflowDsl.g:878:1: entryRuleAssertFlow : ruleAssertFlow EOF ;
    public final void entryRuleAssertFlow() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:879:1: ( ruleAssertFlow EOF )
            // InternalWorkflowDsl.g:880:1: ruleAssertFlow EOF
            {
             before(grammarAccess.getAssertFlowRule()); 
            pushFollow(FOLLOW_1);
            ruleAssertFlow();

            state._fsp--;

             after(grammarAccess.getAssertFlowRule()); 
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
    // $ANTLR end "entryRuleAssertFlow"


    // $ANTLR start "ruleAssertFlow"
    // InternalWorkflowDsl.g:887:1: ruleAssertFlow : ( ( rule__AssertFlow__Group__0 ) ) ;
    public final void ruleAssertFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:891:2: ( ( ( rule__AssertFlow__Group__0 ) ) )
            // InternalWorkflowDsl.g:892:2: ( ( rule__AssertFlow__Group__0 ) )
            {
            // InternalWorkflowDsl.g:892:2: ( ( rule__AssertFlow__Group__0 ) )
            // InternalWorkflowDsl.g:893:3: ( rule__AssertFlow__Group__0 )
            {
             before(grammarAccess.getAssertFlowAccess().getGroup()); 
            // InternalWorkflowDsl.g:894:3: ( rule__AssertFlow__Group__0 )
            // InternalWorkflowDsl.g:894:4: rule__AssertFlow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssertFlow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssertFlowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssertFlow"


    // $ANTLR start "entryRuleAssertWait"
    // InternalWorkflowDsl.g:903:1: entryRuleAssertWait : ruleAssertWait EOF ;
    public final void entryRuleAssertWait() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:904:1: ( ruleAssertWait EOF )
            // InternalWorkflowDsl.g:905:1: ruleAssertWait EOF
            {
             before(grammarAccess.getAssertWaitRule()); 
            pushFollow(FOLLOW_1);
            ruleAssertWait();

            state._fsp--;

             after(grammarAccess.getAssertWaitRule()); 
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
    // $ANTLR end "entryRuleAssertWait"


    // $ANTLR start "ruleAssertWait"
    // InternalWorkflowDsl.g:912:1: ruleAssertWait : ( ( rule__AssertWait__Group__0 ) ) ;
    public final void ruleAssertWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:916:2: ( ( ( rule__AssertWait__Group__0 ) ) )
            // InternalWorkflowDsl.g:917:2: ( ( rule__AssertWait__Group__0 ) )
            {
            // InternalWorkflowDsl.g:917:2: ( ( rule__AssertWait__Group__0 ) )
            // InternalWorkflowDsl.g:918:3: ( rule__AssertWait__Group__0 )
            {
             before(grammarAccess.getAssertWaitAccess().getGroup()); 
            // InternalWorkflowDsl.g:919:3: ( rule__AssertWait__Group__0 )
            // InternalWorkflowDsl.g:919:4: rule__AssertWait__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssertWait__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssertWaitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssertWait"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // InternalWorkflowDsl.g:928:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:929:1: ( ruleQualifiedNameWithWildCard EOF )
            // InternalWorkflowDsl.g:930:1: ruleQualifiedNameWithWildCard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildCard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardRule()); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // InternalWorkflowDsl.g:937:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:941:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // InternalWorkflowDsl.g:942:2: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // InternalWorkflowDsl.g:942:2: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // InternalWorkflowDsl.g:943:3: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // InternalWorkflowDsl.g:944:3: ( rule__QualifiedNameWithWildCard__Group__0 )
            // InternalWorkflowDsl.g:944:4: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildCard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalWorkflowDsl.g:953:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalWorkflowDsl.g:954:1: ( ruleQualifiedName EOF )
            // InternalWorkflowDsl.g:955:1: ruleQualifiedName EOF
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
    // InternalWorkflowDsl.g:962:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:966:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalWorkflowDsl.g:967:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalWorkflowDsl.g:967:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalWorkflowDsl.g:968:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalWorkflowDsl.g:969:3: ( rule__QualifiedName__Group__0 )
            // InternalWorkflowDsl.g:969:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "rule__Node__Alternatives"
    // InternalWorkflowDsl.g:977:1: rule__Node__Alternatives : ( ( ruleStartNode ) | ( ruleEndNode ) | ( ruleServiceTask ) | ( ruleGateway ) | ( ruleSignal ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:981:1: ( ( ruleStartNode ) | ( ruleEndNode ) | ( ruleServiceTask ) | ( ruleGateway ) | ( ruleSignal ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 22:
            case 23:
                {
                alt1=3;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt1=4;
                }
                break;
            case 21:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalWorkflowDsl.g:982:2: ( ruleStartNode )
                    {
                    // InternalWorkflowDsl.g:982:2: ( ruleStartNode )
                    // InternalWorkflowDsl.g:983:3: ruleStartNode
                    {
                     before(grammarAccess.getNodeAccess().getStartNodeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStartNode();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getStartNodeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWorkflowDsl.g:988:2: ( ruleEndNode )
                    {
                    // InternalWorkflowDsl.g:988:2: ( ruleEndNode )
                    // InternalWorkflowDsl.g:989:3: ruleEndNode
                    {
                     before(grammarAccess.getNodeAccess().getEndNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEndNode();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getEndNodeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWorkflowDsl.g:994:2: ( ruleServiceTask )
                    {
                    // InternalWorkflowDsl.g:994:2: ( ruleServiceTask )
                    // InternalWorkflowDsl.g:995:3: ruleServiceTask
                    {
                     before(grammarAccess.getNodeAccess().getServiceTaskParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleServiceTask();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getServiceTaskParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWorkflowDsl.g:1000:2: ( ruleGateway )
                    {
                    // InternalWorkflowDsl.g:1000:2: ( ruleGateway )
                    // InternalWorkflowDsl.g:1001:3: ruleGateway
                    {
                     before(grammarAccess.getNodeAccess().getGatewayParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGateway();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getGatewayParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWorkflowDsl.g:1006:2: ( ruleSignal )
                    {
                    // InternalWorkflowDsl.g:1006:2: ( ruleSignal )
                    // InternalWorkflowDsl.g:1007:3: ruleSignal
                    {
                     before(grammarAccess.getNodeAccess().getSignalParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSignal();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getSignalParserRuleCall_4()); 

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
    // $ANTLR end "rule__Node__Alternatives"


    // $ANTLR start "rule__ServiceTask__Alternatives"
    // InternalWorkflowDsl.g:1016:1: rule__ServiceTask__Alternatives : ( ( ruleAsyncronousServiceTask ) | ( ruleSyncronousServiceTask ) );
    public final void rule__ServiceTask__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1020:1: ( ( ruleAsyncronousServiceTask ) | ( ruleSyncronousServiceTask ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWorkflowDsl.g:1021:2: ( ruleAsyncronousServiceTask )
                    {
                    // InternalWorkflowDsl.g:1021:2: ( ruleAsyncronousServiceTask )
                    // InternalWorkflowDsl.g:1022:3: ruleAsyncronousServiceTask
                    {
                     before(grammarAccess.getServiceTaskAccess().getAsyncronousServiceTaskParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAsyncronousServiceTask();

                    state._fsp--;

                     after(grammarAccess.getServiceTaskAccess().getAsyncronousServiceTaskParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWorkflowDsl.g:1027:2: ( ruleSyncronousServiceTask )
                    {
                    // InternalWorkflowDsl.g:1027:2: ( ruleSyncronousServiceTask )
                    // InternalWorkflowDsl.g:1028:3: ruleSyncronousServiceTask
                    {
                     before(grammarAccess.getServiceTaskAccess().getSyncronousServiceTaskParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSyncronousServiceTask();

                    state._fsp--;

                     after(grammarAccess.getServiceTaskAccess().getSyncronousServiceTaskParserRuleCall_1()); 

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
    // $ANTLR end "rule__ServiceTask__Alternatives"


    // $ANTLR start "rule__Gateway__Alternatives"
    // InternalWorkflowDsl.g:1037:1: rule__Gateway__Alternatives : ( ( ruleDivergingGateway ) | ( ruleConvergingGateway ) );
    public final void rule__Gateway__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1041:1: ( ( ruleDivergingGateway ) | ( ruleConvergingGateway ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=24 && LA3_0<=25)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=26 && LA3_0<=27)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalWorkflowDsl.g:1042:2: ( ruleDivergingGateway )
                    {
                    // InternalWorkflowDsl.g:1042:2: ( ruleDivergingGateway )
                    // InternalWorkflowDsl.g:1043:3: ruleDivergingGateway
                    {
                     before(grammarAccess.getGatewayAccess().getDivergingGatewayParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDivergingGateway();

                    state._fsp--;

                     after(grammarAccess.getGatewayAccess().getDivergingGatewayParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWorkflowDsl.g:1048:2: ( ruleConvergingGateway )
                    {
                    // InternalWorkflowDsl.g:1048:2: ( ruleConvergingGateway )
                    // InternalWorkflowDsl.g:1049:3: ruleConvergingGateway
                    {
                     before(grammarAccess.getGatewayAccess().getConvergingGatewayParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConvergingGateway();

                    state._fsp--;

                     after(grammarAccess.getGatewayAccess().getConvergingGatewayParserRuleCall_1()); 

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
    // $ANTLR end "rule__Gateway__Alternatives"


    // $ANTLR start "rule__DivergingGateway__Alternatives"
    // InternalWorkflowDsl.g:1058:1: rule__DivergingGateway__Alternatives : ( ( ruleExlcusiveDiverging ) | ( ruleParallelDiverging ) );
    public final void rule__DivergingGateway__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1062:1: ( ( ruleExlcusiveDiverging ) | ( ruleParallelDiverging ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalWorkflowDsl.g:1063:2: ( ruleExlcusiveDiverging )
                    {
                    // InternalWorkflowDsl.g:1063:2: ( ruleExlcusiveDiverging )
                    // InternalWorkflowDsl.g:1064:3: ruleExlcusiveDiverging
                    {
                     before(grammarAccess.getDivergingGatewayAccess().getExlcusiveDivergingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExlcusiveDiverging();

                    state._fsp--;

                     after(grammarAccess.getDivergingGatewayAccess().getExlcusiveDivergingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWorkflowDsl.g:1069:2: ( ruleParallelDiverging )
                    {
                    // InternalWorkflowDsl.g:1069:2: ( ruleParallelDiverging )
                    // InternalWorkflowDsl.g:1070:3: ruleParallelDiverging
                    {
                     before(grammarAccess.getDivergingGatewayAccess().getParallelDivergingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParallelDiverging();

                    state._fsp--;

                     after(grammarAccess.getDivergingGatewayAccess().getParallelDivergingParserRuleCall_1()); 

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
    // $ANTLR end "rule__DivergingGateway__Alternatives"


    // $ANTLR start "rule__ConvergingGateway__Alternatives"
    // InternalWorkflowDsl.g:1079:1: rule__ConvergingGateway__Alternatives : ( ( ruleExclusiveConverging ) | ( ruleParallelConverging ) );
    public final void rule__ConvergingGateway__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1083:1: ( ( ruleExclusiveConverging ) | ( ruleParallelConverging ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalWorkflowDsl.g:1084:2: ( ruleExclusiveConverging )
                    {
                    // InternalWorkflowDsl.g:1084:2: ( ruleExclusiveConverging )
                    // InternalWorkflowDsl.g:1085:3: ruleExclusiveConverging
                    {
                     before(grammarAccess.getConvergingGatewayAccess().getExclusiveConvergingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExclusiveConverging();

                    state._fsp--;

                     after(grammarAccess.getConvergingGatewayAccess().getExclusiveConvergingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWorkflowDsl.g:1090:2: ( ruleParallelConverging )
                    {
                    // InternalWorkflowDsl.g:1090:2: ( ruleParallelConverging )
                    // InternalWorkflowDsl.g:1091:3: ruleParallelConverging
                    {
                     before(grammarAccess.getConvergingGatewayAccess().getParallelConvergingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParallelConverging();

                    state._fsp--;

                     after(grammarAccess.getConvergingGatewayAccess().getParallelConvergingParserRuleCall_1()); 

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
    // $ANTLR end "rule__ConvergingGateway__Alternatives"


    // $ANTLR start "rule__Connector__Alternatives"
    // InternalWorkflowDsl.g:1100:1: rule__Connector__Alternatives : ( ( ruleBasicConnector ) | ( ruleConditionalConnector ) );
    public final void rule__Connector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1104:1: ( ( ruleBasicConnector ) | ( ruleConditionalConnector ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            else if ( (LA6_0==33) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalWorkflowDsl.g:1105:2: ( ruleBasicConnector )
                    {
                    // InternalWorkflowDsl.g:1105:2: ( ruleBasicConnector )
                    // InternalWorkflowDsl.g:1106:3: ruleBasicConnector
                    {
                     before(grammarAccess.getConnectorAccess().getBasicConnectorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicConnector();

                    state._fsp--;

                     after(grammarAccess.getConnectorAccess().getBasicConnectorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWorkflowDsl.g:1111:2: ( ruleConditionalConnector )
                    {
                    // InternalWorkflowDsl.g:1111:2: ( ruleConditionalConnector )
                    // InternalWorkflowDsl.g:1112:3: ruleConditionalConnector
                    {
                     before(grammarAccess.getConnectorAccess().getConditionalConnectorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionalConnector();

                    state._fsp--;

                     after(grammarAccess.getConnectorAccess().getConditionalConnectorParserRuleCall_1()); 

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
    // $ANTLR end "rule__Connector__Alternatives"


    // $ANTLR start "rule__InputData__Alternatives"
    // InternalWorkflowDsl.g:1121:1: rule__InputData__Alternatives : ( ( ruleTaskNameInput ) | ( ruleVariableBasedInput ) | ( ruleEventBasedInput ) );
    public final void rule__InputData__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1125:1: ( ( ruleTaskNameInput ) | ( ruleVariableBasedInput ) | ( ruleEventBasedInput ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalWorkflowDsl.g:1126:2: ( ruleTaskNameInput )
                    {
                    // InternalWorkflowDsl.g:1126:2: ( ruleTaskNameInput )
                    // InternalWorkflowDsl.g:1127:3: ruleTaskNameInput
                    {
                     before(grammarAccess.getInputDataAccess().getTaskNameInputParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTaskNameInput();

                    state._fsp--;

                     after(grammarAccess.getInputDataAccess().getTaskNameInputParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWorkflowDsl.g:1132:2: ( ruleVariableBasedInput )
                    {
                    // InternalWorkflowDsl.g:1132:2: ( ruleVariableBasedInput )
                    // InternalWorkflowDsl.g:1133:3: ruleVariableBasedInput
                    {
                     before(grammarAccess.getInputDataAccess().getVariableBasedInputParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableBasedInput();

                    state._fsp--;

                     after(grammarAccess.getInputDataAccess().getVariableBasedInputParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWorkflowDsl.g:1138:2: ( ruleEventBasedInput )
                    {
                    // InternalWorkflowDsl.g:1138:2: ( ruleEventBasedInput )
                    // InternalWorkflowDsl.g:1139:3: ruleEventBasedInput
                    {
                     before(grammarAccess.getInputDataAccess().getEventBasedInputParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEventBasedInput();

                    state._fsp--;

                     after(grammarAccess.getInputDataAccess().getEventBasedInputParserRuleCall_2()); 

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
    // $ANTLR end "rule__InputData__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalWorkflowDsl.g:1148:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1152:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalWorkflowDsl.g:1153:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalWorkflowDsl.g:1160:1: rule__Model__Group__0__Impl : ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1164:1: ( ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) ) )
            // InternalWorkflowDsl.g:1165:1: ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) )
            {
            // InternalWorkflowDsl.g:1165:1: ( ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* ) )
            // InternalWorkflowDsl.g:1166:2: ( ( rule__Model__ImportsAssignment_0 ) ) ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // InternalWorkflowDsl.g:1166:2: ( ( rule__Model__ImportsAssignment_0 ) )
            // InternalWorkflowDsl.g:1167:3: ( rule__Model__ImportsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalWorkflowDsl.g:1168:3: ( rule__Model__ImportsAssignment_0 )
            // InternalWorkflowDsl.g:1168:4: rule__Model__ImportsAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__Model__ImportsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }

            // InternalWorkflowDsl.g:1171:2: ( ( rule__Model__ImportsAssignment_0 )* )
            // InternalWorkflowDsl.g:1172:3: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalWorkflowDsl.g:1173:3: ( rule__Model__ImportsAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==11) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWorkflowDsl.g:1173:4: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalWorkflowDsl.g:1182:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1186:1: ( rule__Model__Group__1__Impl )
            // InternalWorkflowDsl.g:1187:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalWorkflowDsl.g:1193:1: rule__Model__Group__1__Impl : ( ( ( rule__Model__WorkflowDefinitionsAssignment_1 ) ) ( ( rule__Model__WorkflowDefinitionsAssignment_1 )* ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1197:1: ( ( ( ( rule__Model__WorkflowDefinitionsAssignment_1 ) ) ( ( rule__Model__WorkflowDefinitionsAssignment_1 )* ) ) )
            // InternalWorkflowDsl.g:1198:1: ( ( ( rule__Model__WorkflowDefinitionsAssignment_1 ) ) ( ( rule__Model__WorkflowDefinitionsAssignment_1 )* ) )
            {
            // InternalWorkflowDsl.g:1198:1: ( ( ( rule__Model__WorkflowDefinitionsAssignment_1 ) ) ( ( rule__Model__WorkflowDefinitionsAssignment_1 )* ) )
            // InternalWorkflowDsl.g:1199:2: ( ( rule__Model__WorkflowDefinitionsAssignment_1 ) ) ( ( rule__Model__WorkflowDefinitionsAssignment_1 )* )
            {
            // InternalWorkflowDsl.g:1199:2: ( ( rule__Model__WorkflowDefinitionsAssignment_1 ) )
            // InternalWorkflowDsl.g:1200:3: ( rule__Model__WorkflowDefinitionsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getWorkflowDefinitionsAssignment_1()); 
            // InternalWorkflowDsl.g:1201:3: ( rule__Model__WorkflowDefinitionsAssignment_1 )
            // InternalWorkflowDsl.g:1201:4: rule__Model__WorkflowDefinitionsAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__Model__WorkflowDefinitionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getWorkflowDefinitionsAssignment_1()); 

            }

            // InternalWorkflowDsl.g:1204:2: ( ( rule__Model__WorkflowDefinitionsAssignment_1 )* )
            // InternalWorkflowDsl.g:1205:3: ( rule__Model__WorkflowDefinitionsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getWorkflowDefinitionsAssignment_1()); 
            // InternalWorkflowDsl.g:1206:3: ( rule__Model__WorkflowDefinitionsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==12) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWorkflowDsl.g:1206:4: rule__Model__WorkflowDefinitionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__WorkflowDefinitionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getWorkflowDefinitionsAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalWorkflowDsl.g:1216:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1220:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalWorkflowDsl.g:1221:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalWorkflowDsl.g:1228:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1232:1: ( ( 'import' ) )
            // InternalWorkflowDsl.g:1233:1: ( 'import' )
            {
            // InternalWorkflowDsl.g:1233:1: ( 'import' )
            // InternalWorkflowDsl.g:1234:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalWorkflowDsl.g:1243:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1247:1: ( rule__Import__Group__1__Impl )
            // InternalWorkflowDsl.g:1248:2: rule__Import__Group__1__Impl
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
    // InternalWorkflowDsl.g:1254:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1258:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalWorkflowDsl.g:1259:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:1259:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalWorkflowDsl.g:1260:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalWorkflowDsl.g:1261:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalWorkflowDsl.g:1261:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__WorkflowDefinition__Group__0"
    // InternalWorkflowDsl.g:1270:1: rule__WorkflowDefinition__Group__0 : rule__WorkflowDefinition__Group__0__Impl rule__WorkflowDefinition__Group__1 ;
    public final void rule__WorkflowDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1274:1: ( rule__WorkflowDefinition__Group__0__Impl rule__WorkflowDefinition__Group__1 )
            // InternalWorkflowDsl.g:1275:2: rule__WorkflowDefinition__Group__0__Impl rule__WorkflowDefinition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__WorkflowDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__0"


    // $ANTLR start "rule__WorkflowDefinition__Group__0__Impl"
    // InternalWorkflowDsl.g:1282:1: rule__WorkflowDefinition__Group__0__Impl : ( 'workflow definition' ) ;
    public final void rule__WorkflowDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1286:1: ( ( 'workflow definition' ) )
            // InternalWorkflowDsl.g:1287:1: ( 'workflow definition' )
            {
            // InternalWorkflowDsl.g:1287:1: ( 'workflow definition' )
            // InternalWorkflowDsl.g:1288:2: 'workflow definition'
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getWorkflowDefinitionKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWorkflowDefinitionAccess().getWorkflowDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__1"
    // InternalWorkflowDsl.g:1297:1: rule__WorkflowDefinition__Group__1 : rule__WorkflowDefinition__Group__1__Impl rule__WorkflowDefinition__Group__2 ;
    public final void rule__WorkflowDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1301:1: ( rule__WorkflowDefinition__Group__1__Impl rule__WorkflowDefinition__Group__2 )
            // InternalWorkflowDsl.g:1302:2: rule__WorkflowDefinition__Group__1__Impl rule__WorkflowDefinition__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__WorkflowDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__1"


    // $ANTLR start "rule__WorkflowDefinition__Group__1__Impl"
    // InternalWorkflowDsl.g:1309:1: rule__WorkflowDefinition__Group__1__Impl : ( ( rule__WorkflowDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkflowDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1313:1: ( ( ( rule__WorkflowDefinition__NameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:1314:1: ( ( rule__WorkflowDefinition__NameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:1314:1: ( ( rule__WorkflowDefinition__NameAssignment_1 ) )
            // InternalWorkflowDsl.g:1315:2: ( rule__WorkflowDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getNameAssignment_1()); 
            // InternalWorkflowDsl.g:1316:2: ( rule__WorkflowDefinition__NameAssignment_1 )
            // InternalWorkflowDsl.g:1316:3: rule__WorkflowDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__2"
    // InternalWorkflowDsl.g:1324:1: rule__WorkflowDefinition__Group__2 : rule__WorkflowDefinition__Group__2__Impl rule__WorkflowDefinition__Group__3 ;
    public final void rule__WorkflowDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1328:1: ( rule__WorkflowDefinition__Group__2__Impl rule__WorkflowDefinition__Group__3 )
            // InternalWorkflowDsl.g:1329:2: rule__WorkflowDefinition__Group__2__Impl rule__WorkflowDefinition__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__WorkflowDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__2"


    // $ANTLR start "rule__WorkflowDefinition__Group__2__Impl"
    // InternalWorkflowDsl.g:1336:1: rule__WorkflowDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__WorkflowDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1340:1: ( ( '{' ) )
            // InternalWorkflowDsl.g:1341:1: ( '{' )
            {
            // InternalWorkflowDsl.g:1341:1: ( '{' )
            // InternalWorkflowDsl.g:1342:2: '{'
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWorkflowDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__3"
    // InternalWorkflowDsl.g:1351:1: rule__WorkflowDefinition__Group__3 : rule__WorkflowDefinition__Group__3__Impl rule__WorkflowDefinition__Group__4 ;
    public final void rule__WorkflowDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1355:1: ( rule__WorkflowDefinition__Group__3__Impl rule__WorkflowDefinition__Group__4 )
            // InternalWorkflowDsl.g:1356:2: rule__WorkflowDefinition__Group__3__Impl rule__WorkflowDefinition__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__WorkflowDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__3"


    // $ANTLR start "rule__WorkflowDefinition__Group__3__Impl"
    // InternalWorkflowDsl.g:1363:1: rule__WorkflowDefinition__Group__3__Impl : ( ( rule__WorkflowDefinition__ClassNameAssignment_3 ) ) ;
    public final void rule__WorkflowDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1367:1: ( ( ( rule__WorkflowDefinition__ClassNameAssignment_3 ) ) )
            // InternalWorkflowDsl.g:1368:1: ( ( rule__WorkflowDefinition__ClassNameAssignment_3 ) )
            {
            // InternalWorkflowDsl.g:1368:1: ( ( rule__WorkflowDefinition__ClassNameAssignment_3 ) )
            // InternalWorkflowDsl.g:1369:2: ( rule__WorkflowDefinition__ClassNameAssignment_3 )
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getClassNameAssignment_3()); 
            // InternalWorkflowDsl.g:1370:2: ( rule__WorkflowDefinition__ClassNameAssignment_3 )
            // InternalWorkflowDsl.g:1370:3: rule__WorkflowDefinition__ClassNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__ClassNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowDefinitionAccess().getClassNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__3__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__4"
    // InternalWorkflowDsl.g:1378:1: rule__WorkflowDefinition__Group__4 : rule__WorkflowDefinition__Group__4__Impl rule__WorkflowDefinition__Group__5 ;
    public final void rule__WorkflowDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1382:1: ( rule__WorkflowDefinition__Group__4__Impl rule__WorkflowDefinition__Group__5 )
            // InternalWorkflowDsl.g:1383:2: rule__WorkflowDefinition__Group__4__Impl rule__WorkflowDefinition__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__WorkflowDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__4"


    // $ANTLR start "rule__WorkflowDefinition__Group__4__Impl"
    // InternalWorkflowDsl.g:1390:1: rule__WorkflowDefinition__Group__4__Impl : ( ( rule__WorkflowDefinition__PackagesAssignment_4 ) ) ;
    public final void rule__WorkflowDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1394:1: ( ( ( rule__WorkflowDefinition__PackagesAssignment_4 ) ) )
            // InternalWorkflowDsl.g:1395:1: ( ( rule__WorkflowDefinition__PackagesAssignment_4 ) )
            {
            // InternalWorkflowDsl.g:1395:1: ( ( rule__WorkflowDefinition__PackagesAssignment_4 ) )
            // InternalWorkflowDsl.g:1396:2: ( rule__WorkflowDefinition__PackagesAssignment_4 )
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getPackagesAssignment_4()); 
            // InternalWorkflowDsl.g:1397:2: ( rule__WorkflowDefinition__PackagesAssignment_4 )
            // InternalWorkflowDsl.g:1397:3: rule__WorkflowDefinition__PackagesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__PackagesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowDefinitionAccess().getPackagesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__4__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__5"
    // InternalWorkflowDsl.g:1405:1: rule__WorkflowDefinition__Group__5 : rule__WorkflowDefinition__Group__5__Impl rule__WorkflowDefinition__Group__6 ;
    public final void rule__WorkflowDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1409:1: ( rule__WorkflowDefinition__Group__5__Impl rule__WorkflowDefinition__Group__6 )
            // InternalWorkflowDsl.g:1410:2: rule__WorkflowDefinition__Group__5__Impl rule__WorkflowDefinition__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__WorkflowDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__5"


    // $ANTLR start "rule__WorkflowDefinition__Group__5__Impl"
    // InternalWorkflowDsl.g:1417:1: rule__WorkflowDefinition__Group__5__Impl : ( ( rule__WorkflowDefinition__EventsAssignment_5 )* ) ;
    public final void rule__WorkflowDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1421:1: ( ( ( rule__WorkflowDefinition__EventsAssignment_5 )* ) )
            // InternalWorkflowDsl.g:1422:1: ( ( rule__WorkflowDefinition__EventsAssignment_5 )* )
            {
            // InternalWorkflowDsl.g:1422:1: ( ( rule__WorkflowDefinition__EventsAssignment_5 )* )
            // InternalWorkflowDsl.g:1423:2: ( rule__WorkflowDefinition__EventsAssignment_5 )*
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getEventsAssignment_5()); 
            // InternalWorkflowDsl.g:1424:2: ( rule__WorkflowDefinition__EventsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalWorkflowDsl.g:1424:3: rule__WorkflowDefinition__EventsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__WorkflowDefinition__EventsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getWorkflowDefinitionAccess().getEventsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__5__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__6"
    // InternalWorkflowDsl.g:1432:1: rule__WorkflowDefinition__Group__6 : rule__WorkflowDefinition__Group__6__Impl rule__WorkflowDefinition__Group__7 ;
    public final void rule__WorkflowDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1436:1: ( rule__WorkflowDefinition__Group__6__Impl rule__WorkflowDefinition__Group__7 )
            // InternalWorkflowDsl.g:1437:2: rule__WorkflowDefinition__Group__6__Impl rule__WorkflowDefinition__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__WorkflowDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__6"


    // $ANTLR start "rule__WorkflowDefinition__Group__6__Impl"
    // InternalWorkflowDsl.g:1444:1: rule__WorkflowDefinition__Group__6__Impl : ( ( rule__WorkflowDefinition__VariablesAssignment_6 )* ) ;
    public final void rule__WorkflowDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1448:1: ( ( ( rule__WorkflowDefinition__VariablesAssignment_6 )* ) )
            // InternalWorkflowDsl.g:1449:1: ( ( rule__WorkflowDefinition__VariablesAssignment_6 )* )
            {
            // InternalWorkflowDsl.g:1449:1: ( ( rule__WorkflowDefinition__VariablesAssignment_6 )* )
            // InternalWorkflowDsl.g:1450:2: ( rule__WorkflowDefinition__VariablesAssignment_6 )*
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getVariablesAssignment_6()); 
            // InternalWorkflowDsl.g:1451:2: ( rule__WorkflowDefinition__VariablesAssignment_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalWorkflowDsl.g:1451:3: rule__WorkflowDefinition__VariablesAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__WorkflowDefinition__VariablesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getWorkflowDefinitionAccess().getVariablesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__6__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__7"
    // InternalWorkflowDsl.g:1459:1: rule__WorkflowDefinition__Group__7 : rule__WorkflowDefinition__Group__7__Impl rule__WorkflowDefinition__Group__8 ;
    public final void rule__WorkflowDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1463:1: ( rule__WorkflowDefinition__Group__7__Impl rule__WorkflowDefinition__Group__8 )
            // InternalWorkflowDsl.g:1464:2: rule__WorkflowDefinition__Group__7__Impl rule__WorkflowDefinition__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__WorkflowDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__7"


    // $ANTLR start "rule__WorkflowDefinition__Group__7__Impl"
    // InternalWorkflowDsl.g:1471:1: rule__WorkflowDefinition__Group__7__Impl : ( ( ( rule__WorkflowDefinition__NodesAssignment_7 ) ) ( ( rule__WorkflowDefinition__NodesAssignment_7 )* ) ) ;
    public final void rule__WorkflowDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1475:1: ( ( ( ( rule__WorkflowDefinition__NodesAssignment_7 ) ) ( ( rule__WorkflowDefinition__NodesAssignment_7 )* ) ) )
            // InternalWorkflowDsl.g:1476:1: ( ( ( rule__WorkflowDefinition__NodesAssignment_7 ) ) ( ( rule__WorkflowDefinition__NodesAssignment_7 )* ) )
            {
            // InternalWorkflowDsl.g:1476:1: ( ( ( rule__WorkflowDefinition__NodesAssignment_7 ) ) ( ( rule__WorkflowDefinition__NodesAssignment_7 )* ) )
            // InternalWorkflowDsl.g:1477:2: ( ( rule__WorkflowDefinition__NodesAssignment_7 ) ) ( ( rule__WorkflowDefinition__NodesAssignment_7 )* )
            {
            // InternalWorkflowDsl.g:1477:2: ( ( rule__WorkflowDefinition__NodesAssignment_7 ) )
            // InternalWorkflowDsl.g:1478:3: ( rule__WorkflowDefinition__NodesAssignment_7 )
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getNodesAssignment_7()); 
            // InternalWorkflowDsl.g:1479:3: ( rule__WorkflowDefinition__NodesAssignment_7 )
            // InternalWorkflowDsl.g:1479:4: rule__WorkflowDefinition__NodesAssignment_7
            {
            pushFollow(FOLLOW_14);
            rule__WorkflowDefinition__NodesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowDefinitionAccess().getNodesAssignment_7()); 

            }

            // InternalWorkflowDsl.g:1482:2: ( ( rule__WorkflowDefinition__NodesAssignment_7 )* )
            // InternalWorkflowDsl.g:1483:3: ( rule__WorkflowDefinition__NodesAssignment_7 )*
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getNodesAssignment_7()); 
            // InternalWorkflowDsl.g:1484:3: ( rule__WorkflowDefinition__NodesAssignment_7 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=19 && LA12_0<=27)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWorkflowDsl.g:1484:4: rule__WorkflowDefinition__NodesAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__WorkflowDefinition__NodesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getWorkflowDefinitionAccess().getNodesAssignment_7()); 

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
    // $ANTLR end "rule__WorkflowDefinition__Group__7__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__8"
    // InternalWorkflowDsl.g:1493:1: rule__WorkflowDefinition__Group__8 : rule__WorkflowDefinition__Group__8__Impl rule__WorkflowDefinition__Group__9 ;
    public final void rule__WorkflowDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1497:1: ( rule__WorkflowDefinition__Group__8__Impl rule__WorkflowDefinition__Group__9 )
            // InternalWorkflowDsl.g:1498:2: rule__WorkflowDefinition__Group__8__Impl rule__WorkflowDefinition__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__WorkflowDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__8"


    // $ANTLR start "rule__WorkflowDefinition__Group__8__Impl"
    // InternalWorkflowDsl.g:1505:1: rule__WorkflowDefinition__Group__8__Impl : ( ( ( rule__WorkflowDefinition__ConnectorsAssignment_8 ) ) ( ( rule__WorkflowDefinition__ConnectorsAssignment_8 )* ) ) ;
    public final void rule__WorkflowDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1509:1: ( ( ( ( rule__WorkflowDefinition__ConnectorsAssignment_8 ) ) ( ( rule__WorkflowDefinition__ConnectorsAssignment_8 )* ) ) )
            // InternalWorkflowDsl.g:1510:1: ( ( ( rule__WorkflowDefinition__ConnectorsAssignment_8 ) ) ( ( rule__WorkflowDefinition__ConnectorsAssignment_8 )* ) )
            {
            // InternalWorkflowDsl.g:1510:1: ( ( ( rule__WorkflowDefinition__ConnectorsAssignment_8 ) ) ( ( rule__WorkflowDefinition__ConnectorsAssignment_8 )* ) )
            // InternalWorkflowDsl.g:1511:2: ( ( rule__WorkflowDefinition__ConnectorsAssignment_8 ) ) ( ( rule__WorkflowDefinition__ConnectorsAssignment_8 )* )
            {
            // InternalWorkflowDsl.g:1511:2: ( ( rule__WorkflowDefinition__ConnectorsAssignment_8 ) )
            // InternalWorkflowDsl.g:1512:3: ( rule__WorkflowDefinition__ConnectorsAssignment_8 )
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getConnectorsAssignment_8()); 
            // InternalWorkflowDsl.g:1513:3: ( rule__WorkflowDefinition__ConnectorsAssignment_8 )
            // InternalWorkflowDsl.g:1513:4: rule__WorkflowDefinition__ConnectorsAssignment_8
            {
            pushFollow(FOLLOW_16);
            rule__WorkflowDefinition__ConnectorsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowDefinitionAccess().getConnectorsAssignment_8()); 

            }

            // InternalWorkflowDsl.g:1516:2: ( ( rule__WorkflowDefinition__ConnectorsAssignment_8 )* )
            // InternalWorkflowDsl.g:1517:3: ( rule__WorkflowDefinition__ConnectorsAssignment_8 )*
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getConnectorsAssignment_8()); 
            // InternalWorkflowDsl.g:1518:3: ( rule__WorkflowDefinition__ConnectorsAssignment_8 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28||LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalWorkflowDsl.g:1518:4: rule__WorkflowDefinition__ConnectorsAssignment_8
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__WorkflowDefinition__ConnectorsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getWorkflowDefinitionAccess().getConnectorsAssignment_8()); 

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
    // $ANTLR end "rule__WorkflowDefinition__Group__8__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__9"
    // InternalWorkflowDsl.g:1527:1: rule__WorkflowDefinition__Group__9 : rule__WorkflowDefinition__Group__9__Impl rule__WorkflowDefinition__Group__10 ;
    public final void rule__WorkflowDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1531:1: ( rule__WorkflowDefinition__Group__9__Impl rule__WorkflowDefinition__Group__10 )
            // InternalWorkflowDsl.g:1532:2: rule__WorkflowDefinition__Group__9__Impl rule__WorkflowDefinition__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__WorkflowDefinition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__9"


    // $ANTLR start "rule__WorkflowDefinition__Group__9__Impl"
    // InternalWorkflowDsl.g:1539:1: rule__WorkflowDefinition__Group__9__Impl : ( ( ( rule__WorkflowDefinition__TestsAssignment_9 ) ) ( ( rule__WorkflowDefinition__TestsAssignment_9 )* ) ) ;
    public final void rule__WorkflowDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1543:1: ( ( ( ( rule__WorkflowDefinition__TestsAssignment_9 ) ) ( ( rule__WorkflowDefinition__TestsAssignment_9 )* ) ) )
            // InternalWorkflowDsl.g:1544:1: ( ( ( rule__WorkflowDefinition__TestsAssignment_9 ) ) ( ( rule__WorkflowDefinition__TestsAssignment_9 )* ) )
            {
            // InternalWorkflowDsl.g:1544:1: ( ( ( rule__WorkflowDefinition__TestsAssignment_9 ) ) ( ( rule__WorkflowDefinition__TestsAssignment_9 )* ) )
            // InternalWorkflowDsl.g:1545:2: ( ( rule__WorkflowDefinition__TestsAssignment_9 ) ) ( ( rule__WorkflowDefinition__TestsAssignment_9 )* )
            {
            // InternalWorkflowDsl.g:1545:2: ( ( rule__WorkflowDefinition__TestsAssignment_9 ) )
            // InternalWorkflowDsl.g:1546:3: ( rule__WorkflowDefinition__TestsAssignment_9 )
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getTestsAssignment_9()); 
            // InternalWorkflowDsl.g:1547:3: ( rule__WorkflowDefinition__TestsAssignment_9 )
            // InternalWorkflowDsl.g:1547:4: rule__WorkflowDefinition__TestsAssignment_9
            {
            pushFollow(FOLLOW_18);
            rule__WorkflowDefinition__TestsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowDefinitionAccess().getTestsAssignment_9()); 

            }

            // InternalWorkflowDsl.g:1550:2: ( ( rule__WorkflowDefinition__TestsAssignment_9 )* )
            // InternalWorkflowDsl.g:1551:3: ( rule__WorkflowDefinition__TestsAssignment_9 )*
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getTestsAssignment_9()); 
            // InternalWorkflowDsl.g:1552:3: ( rule__WorkflowDefinition__TestsAssignment_9 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalWorkflowDsl.g:1552:4: rule__WorkflowDefinition__TestsAssignment_9
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__WorkflowDefinition__TestsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getWorkflowDefinitionAccess().getTestsAssignment_9()); 

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
    // $ANTLR end "rule__WorkflowDefinition__Group__9__Impl"


    // $ANTLR start "rule__WorkflowDefinition__Group__10"
    // InternalWorkflowDsl.g:1561:1: rule__WorkflowDefinition__Group__10 : rule__WorkflowDefinition__Group__10__Impl ;
    public final void rule__WorkflowDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1565:1: ( rule__WorkflowDefinition__Group__10__Impl )
            // InternalWorkflowDsl.g:1566:2: rule__WorkflowDefinition__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkflowDefinition__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__10"


    // $ANTLR start "rule__WorkflowDefinition__Group__10__Impl"
    // InternalWorkflowDsl.g:1572:1: rule__WorkflowDefinition__Group__10__Impl : ( '}' ) ;
    public final void rule__WorkflowDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1576:1: ( ( '}' ) )
            // InternalWorkflowDsl.g:1577:1: ( '}' )
            {
            // InternalWorkflowDsl.g:1577:1: ( '}' )
            // InternalWorkflowDsl.g:1578:2: '}'
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWorkflowDefinitionAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__Group__10__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // InternalWorkflowDsl.g:1588:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1592:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalWorkflowDsl.g:1593:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalWorkflowDsl.g:1600:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1604:1: ( ( 'package' ) )
            // InternalWorkflowDsl.g:1605:1: ( 'package' )
            {
            // InternalWorkflowDsl.g:1605:1: ( 'package' )
            // InternalWorkflowDsl.g:1606:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalWorkflowDsl.g:1615:1: rule__Package__Group__1 : rule__Package__Group__1__Impl ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1619:1: ( rule__Package__Group__1__Impl )
            // InternalWorkflowDsl.g:1620:2: rule__Package__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalWorkflowDsl.g:1626:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1630:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:1631:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:1631:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalWorkflowDsl.g:1632:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalWorkflowDsl.g:1633:2: ( rule__Package__NameAssignment_1 )
            // InternalWorkflowDsl.g:1633:3: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__ClassName__Group__0"
    // InternalWorkflowDsl.g:1642:1: rule__ClassName__Group__0 : rule__ClassName__Group__0__Impl rule__ClassName__Group__1 ;
    public final void rule__ClassName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1646:1: ( rule__ClassName__Group__0__Impl rule__ClassName__Group__1 )
            // InternalWorkflowDsl.g:1647:2: rule__ClassName__Group__0__Impl rule__ClassName__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ClassName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassName__Group__0"


    // $ANTLR start "rule__ClassName__Group__0__Impl"
    // InternalWorkflowDsl.g:1654:1: rule__ClassName__Group__0__Impl : ( 'class name' ) ;
    public final void rule__ClassName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1658:1: ( ( 'class name' ) )
            // InternalWorkflowDsl.g:1659:1: ( 'class name' )
            {
            // InternalWorkflowDsl.g:1659:1: ( 'class name' )
            // InternalWorkflowDsl.g:1660:2: 'class name'
            {
             before(grammarAccess.getClassNameAccess().getClassNameKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClassNameAccess().getClassNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassName__Group__0__Impl"


    // $ANTLR start "rule__ClassName__Group__1"
    // InternalWorkflowDsl.g:1669:1: rule__ClassName__Group__1 : rule__ClassName__Group__1__Impl ;
    public final void rule__ClassName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1673:1: ( rule__ClassName__Group__1__Impl )
            // InternalWorkflowDsl.g:1674:2: rule__ClassName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassName__Group__1"


    // $ANTLR start "rule__ClassName__Group__1__Impl"
    // InternalWorkflowDsl.g:1680:1: rule__ClassName__Group__1__Impl : ( ( rule__ClassName__ClassNameAssignment_1 ) ) ;
    public final void rule__ClassName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1684:1: ( ( ( rule__ClassName__ClassNameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:1685:1: ( ( rule__ClassName__ClassNameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:1685:1: ( ( rule__ClassName__ClassNameAssignment_1 ) )
            // InternalWorkflowDsl.g:1686:2: ( rule__ClassName__ClassNameAssignment_1 )
            {
             before(grammarAccess.getClassNameAccess().getClassNameAssignment_1()); 
            // InternalWorkflowDsl.g:1687:2: ( rule__ClassName__ClassNameAssignment_1 )
            // InternalWorkflowDsl.g:1687:3: rule__ClassName__ClassNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassName__ClassNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassNameAccess().getClassNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassName__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // InternalWorkflowDsl.g:1696:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1700:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalWorkflowDsl.g:1701:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalWorkflowDsl.g:1708:1: rule__Event__Group__0__Impl : ( 'event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1712:1: ( ( 'event' ) )
            // InternalWorkflowDsl.g:1713:1: ( 'event' )
            {
            // InternalWorkflowDsl.g:1713:1: ( 'event' )
            // InternalWorkflowDsl.g:1714:2: 'event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEventKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalWorkflowDsl.g:1723:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1727:1: ( rule__Event__Group__1__Impl )
            // InternalWorkflowDsl.g:1728:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalWorkflowDsl.g:1734:1: rule__Event__Group__1__Impl : ( ( rule__Event__NameAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1738:1: ( ( ( rule__Event__NameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:1739:1: ( ( rule__Event__NameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:1739:1: ( ( rule__Event__NameAssignment_1 ) )
            // InternalWorkflowDsl.g:1740:2: ( rule__Event__NameAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_1()); 
            // InternalWorkflowDsl.g:1741:2: ( rule__Event__NameAssignment_1 )
            // InternalWorkflowDsl.g:1741:3: rule__Event__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__StringBasedConditionalVaraible__Group__0"
    // InternalWorkflowDsl.g:1750:1: rule__StringBasedConditionalVaraible__Group__0 : rule__StringBasedConditionalVaraible__Group__0__Impl rule__StringBasedConditionalVaraible__Group__1 ;
    public final void rule__StringBasedConditionalVaraible__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1754:1: ( rule__StringBasedConditionalVaraible__Group__0__Impl rule__StringBasedConditionalVaraible__Group__1 )
            // InternalWorkflowDsl.g:1755:2: rule__StringBasedConditionalVaraible__Group__0__Impl rule__StringBasedConditionalVaraible__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__StringBasedConditionalVaraible__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringBasedConditionalVaraible__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasedConditionalVaraible__Group__0"


    // $ANTLR start "rule__StringBasedConditionalVaraible__Group__0__Impl"
    // InternalWorkflowDsl.g:1762:1: rule__StringBasedConditionalVaraible__Group__0__Impl : ( 'string based conditional variable' ) ;
    public final void rule__StringBasedConditionalVaraible__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1766:1: ( ( 'string based conditional variable' ) )
            // InternalWorkflowDsl.g:1767:1: ( 'string based conditional variable' )
            {
            // InternalWorkflowDsl.g:1767:1: ( 'string based conditional variable' )
            // InternalWorkflowDsl.g:1768:2: 'string based conditional variable'
            {
             before(grammarAccess.getStringBasedConditionalVaraibleAccess().getStringBasedConditionalVariableKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStringBasedConditionalVaraibleAccess().getStringBasedConditionalVariableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasedConditionalVaraible__Group__0__Impl"


    // $ANTLR start "rule__StringBasedConditionalVaraible__Group__1"
    // InternalWorkflowDsl.g:1777:1: rule__StringBasedConditionalVaraible__Group__1 : rule__StringBasedConditionalVaraible__Group__1__Impl ;
    public final void rule__StringBasedConditionalVaraible__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1781:1: ( rule__StringBasedConditionalVaraible__Group__1__Impl )
            // InternalWorkflowDsl.g:1782:2: rule__StringBasedConditionalVaraible__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringBasedConditionalVaraible__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasedConditionalVaraible__Group__1"


    // $ANTLR start "rule__StringBasedConditionalVaraible__Group__1__Impl"
    // InternalWorkflowDsl.g:1788:1: rule__StringBasedConditionalVaraible__Group__1__Impl : ( ( rule__StringBasedConditionalVaraible__NameAssignment_1 ) ) ;
    public final void rule__StringBasedConditionalVaraible__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1792:1: ( ( ( rule__StringBasedConditionalVaraible__NameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:1793:1: ( ( rule__StringBasedConditionalVaraible__NameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:1793:1: ( ( rule__StringBasedConditionalVaraible__NameAssignment_1 ) )
            // InternalWorkflowDsl.g:1794:2: ( rule__StringBasedConditionalVaraible__NameAssignment_1 )
            {
             before(grammarAccess.getStringBasedConditionalVaraibleAccess().getNameAssignment_1()); 
            // InternalWorkflowDsl.g:1795:2: ( rule__StringBasedConditionalVaraible__NameAssignment_1 )
            // InternalWorkflowDsl.g:1795:3: rule__StringBasedConditionalVaraible__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringBasedConditionalVaraible__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringBasedConditionalVaraibleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasedConditionalVaraible__Group__1__Impl"


    // $ANTLR start "rule__StartNode__Group__0"
    // InternalWorkflowDsl.g:1804:1: rule__StartNode__Group__0 : rule__StartNode__Group__0__Impl rule__StartNode__Group__1 ;
    public final void rule__StartNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1808:1: ( rule__StartNode__Group__0__Impl rule__StartNode__Group__1 )
            // InternalWorkflowDsl.g:1809:2: rule__StartNode__Group__0__Impl rule__StartNode__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__StartNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartNode__Group__0"


    // $ANTLR start "rule__StartNode__Group__0__Impl"
    // InternalWorkflowDsl.g:1816:1: rule__StartNode__Group__0__Impl : ( 'start node' ) ;
    public final void rule__StartNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1820:1: ( ( 'start node' ) )
            // InternalWorkflowDsl.g:1821:1: ( 'start node' )
            {
            // InternalWorkflowDsl.g:1821:1: ( 'start node' )
            // InternalWorkflowDsl.g:1822:2: 'start node'
            {
             before(grammarAccess.getStartNodeAccess().getStartNodeKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStartNodeAccess().getStartNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartNode__Group__0__Impl"


    // $ANTLR start "rule__StartNode__Group__1"
    // InternalWorkflowDsl.g:1831:1: rule__StartNode__Group__1 : rule__StartNode__Group__1__Impl ;
    public final void rule__StartNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1835:1: ( rule__StartNode__Group__1__Impl )
            // InternalWorkflowDsl.g:1836:2: rule__StartNode__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartNode__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartNode__Group__1"


    // $ANTLR start "rule__StartNode__Group__1__Impl"
    // InternalWorkflowDsl.g:1842:1: rule__StartNode__Group__1__Impl : ( ( rule__StartNode__NameAssignment_1 ) ) ;
    public final void rule__StartNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1846:1: ( ( ( rule__StartNode__NameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:1847:1: ( ( rule__StartNode__NameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:1847:1: ( ( rule__StartNode__NameAssignment_1 ) )
            // InternalWorkflowDsl.g:1848:2: ( rule__StartNode__NameAssignment_1 )
            {
             before(grammarAccess.getStartNodeAccess().getNameAssignment_1()); 
            // InternalWorkflowDsl.g:1849:2: ( rule__StartNode__NameAssignment_1 )
            // InternalWorkflowDsl.g:1849:3: rule__StartNode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StartNode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStartNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartNode__Group__1__Impl"


    // $ANTLR start "rule__EndNode__Group__0"
    // InternalWorkflowDsl.g:1858:1: rule__EndNode__Group__0 : rule__EndNode__Group__0__Impl rule__EndNode__Group__1 ;
    public final void rule__EndNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1862:1: ( rule__EndNode__Group__0__Impl rule__EndNode__Group__1 )
            // InternalWorkflowDsl.g:1863:2: rule__EndNode__Group__0__Impl rule__EndNode__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__EndNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndNode__Group__0"


    // $ANTLR start "rule__EndNode__Group__0__Impl"
    // InternalWorkflowDsl.g:1870:1: rule__EndNode__Group__0__Impl : ( 'end node' ) ;
    public final void rule__EndNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1874:1: ( ( 'end node' ) )
            // InternalWorkflowDsl.g:1875:1: ( 'end node' )
            {
            // InternalWorkflowDsl.g:1875:1: ( 'end node' )
            // InternalWorkflowDsl.g:1876:2: 'end node'
            {
             before(grammarAccess.getEndNodeAccess().getEndNodeKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEndNodeAccess().getEndNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndNode__Group__0__Impl"


    // $ANTLR start "rule__EndNode__Group__1"
    // InternalWorkflowDsl.g:1885:1: rule__EndNode__Group__1 : rule__EndNode__Group__1__Impl ;
    public final void rule__EndNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1889:1: ( rule__EndNode__Group__1__Impl )
            // InternalWorkflowDsl.g:1890:2: rule__EndNode__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndNode__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndNode__Group__1"


    // $ANTLR start "rule__EndNode__Group__1__Impl"
    // InternalWorkflowDsl.g:1896:1: rule__EndNode__Group__1__Impl : ( ( rule__EndNode__NameAssignment_1 ) ) ;
    public final void rule__EndNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1900:1: ( ( ( rule__EndNode__NameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:1901:1: ( ( rule__EndNode__NameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:1901:1: ( ( rule__EndNode__NameAssignment_1 ) )
            // InternalWorkflowDsl.g:1902:2: ( rule__EndNode__NameAssignment_1 )
            {
             before(grammarAccess.getEndNodeAccess().getNameAssignment_1()); 
            // InternalWorkflowDsl.g:1903:2: ( rule__EndNode__NameAssignment_1 )
            // InternalWorkflowDsl.g:1903:3: rule__EndNode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EndNode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEndNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndNode__Group__1__Impl"


    // $ANTLR start "rule__Signal__Group__0"
    // InternalWorkflowDsl.g:1912:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1916:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // InternalWorkflowDsl.g:1917:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Signal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__0"


    // $ANTLR start "rule__Signal__Group__0__Impl"
    // InternalWorkflowDsl.g:1924:1: rule__Signal__Group__0__Impl : ( 'signal' ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1928:1: ( ( 'signal' ) )
            // InternalWorkflowDsl.g:1929:1: ( 'signal' )
            {
            // InternalWorkflowDsl.g:1929:1: ( 'signal' )
            // InternalWorkflowDsl.g:1930:2: 'signal'
            {
             before(grammarAccess.getSignalAccess().getSignalKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getSignalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__0__Impl"


    // $ANTLR start "rule__Signal__Group__1"
    // InternalWorkflowDsl.g:1939:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1943:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // InternalWorkflowDsl.g:1944:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Signal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__1"


    // $ANTLR start "rule__Signal__Group__1__Impl"
    // InternalWorkflowDsl.g:1951:1: rule__Signal__Group__1__Impl : ( ( rule__Signal__NameAssignment_1 ) ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1955:1: ( ( ( rule__Signal__NameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:1956:1: ( ( rule__Signal__NameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:1956:1: ( ( rule__Signal__NameAssignment_1 ) )
            // InternalWorkflowDsl.g:1957:2: ( rule__Signal__NameAssignment_1 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_1()); 
            // InternalWorkflowDsl.g:1958:2: ( rule__Signal__NameAssignment_1 )
            // InternalWorkflowDsl.g:1958:3: rule__Signal__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Signal__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__1__Impl"


    // $ANTLR start "rule__Signal__Group__2"
    // InternalWorkflowDsl.g:1966:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1970:1: ( rule__Signal__Group__2__Impl rule__Signal__Group__3 )
            // InternalWorkflowDsl.g:1971:2: rule__Signal__Group__2__Impl rule__Signal__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Signal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__2"


    // $ANTLR start "rule__Signal__Group__2__Impl"
    // InternalWorkflowDsl.g:1978:1: rule__Signal__Group__2__Impl : ( '{' ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1982:1: ( ( '{' ) )
            // InternalWorkflowDsl.g:1983:1: ( '{' )
            {
            // InternalWorkflowDsl.g:1983:1: ( '{' )
            // InternalWorkflowDsl.g:1984:2: '{'
            {
             before(grammarAccess.getSignalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__2__Impl"


    // $ANTLR start "rule__Signal__Group__3"
    // InternalWorkflowDsl.g:1993:1: rule__Signal__Group__3 : rule__Signal__Group__3__Impl rule__Signal__Group__4 ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:1997:1: ( rule__Signal__Group__3__Impl rule__Signal__Group__4 )
            // InternalWorkflowDsl.g:1998:2: rule__Signal__Group__3__Impl rule__Signal__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Signal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__3"


    // $ANTLR start "rule__Signal__Group__3__Impl"
    // InternalWorkflowDsl.g:2005:1: rule__Signal__Group__3__Impl : ( ( rule__Signal__EventAssignment_3 ) ) ;
    public final void rule__Signal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2009:1: ( ( ( rule__Signal__EventAssignment_3 ) ) )
            // InternalWorkflowDsl.g:2010:1: ( ( rule__Signal__EventAssignment_3 ) )
            {
            // InternalWorkflowDsl.g:2010:1: ( ( rule__Signal__EventAssignment_3 ) )
            // InternalWorkflowDsl.g:2011:2: ( rule__Signal__EventAssignment_3 )
            {
             before(grammarAccess.getSignalAccess().getEventAssignment_3()); 
            // InternalWorkflowDsl.g:2012:2: ( rule__Signal__EventAssignment_3 )
            // InternalWorkflowDsl.g:2012:3: rule__Signal__EventAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Signal__EventAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getEventAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__3__Impl"


    // $ANTLR start "rule__Signal__Group__4"
    // InternalWorkflowDsl.g:2020:1: rule__Signal__Group__4 : rule__Signal__Group__4__Impl rule__Signal__Group__5 ;
    public final void rule__Signal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2024:1: ( rule__Signal__Group__4__Impl rule__Signal__Group__5 )
            // InternalWorkflowDsl.g:2025:2: rule__Signal__Group__4__Impl rule__Signal__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Signal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__4"


    // $ANTLR start "rule__Signal__Group__4__Impl"
    // InternalWorkflowDsl.g:2032:1: rule__Signal__Group__4__Impl : ( ( rule__Signal__OutputAssignment_4 )? ) ;
    public final void rule__Signal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2036:1: ( ( ( rule__Signal__OutputAssignment_4 )? ) )
            // InternalWorkflowDsl.g:2037:1: ( ( rule__Signal__OutputAssignment_4 )? )
            {
            // InternalWorkflowDsl.g:2037:1: ( ( rule__Signal__OutputAssignment_4 )? )
            // InternalWorkflowDsl.g:2038:2: ( rule__Signal__OutputAssignment_4 )?
            {
             before(grammarAccess.getSignalAccess().getOutputAssignment_4()); 
            // InternalWorkflowDsl.g:2039:2: ( rule__Signal__OutputAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalWorkflowDsl.g:2039:3: rule__Signal__OutputAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signal__OutputAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignalAccess().getOutputAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__4__Impl"


    // $ANTLR start "rule__Signal__Group__5"
    // InternalWorkflowDsl.g:2047:1: rule__Signal__Group__5 : rule__Signal__Group__5__Impl ;
    public final void rule__Signal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2051:1: ( rule__Signal__Group__5__Impl )
            // InternalWorkflowDsl.g:2052:2: rule__Signal__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__5"


    // $ANTLR start "rule__Signal__Group__5__Impl"
    // InternalWorkflowDsl.g:2058:1: rule__Signal__Group__5__Impl : ( '}' ) ;
    public final void rule__Signal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2062:1: ( ( '}' ) )
            // InternalWorkflowDsl.g:2063:1: ( '}' )
            {
            // InternalWorkflowDsl.g:2063:1: ( '}' )
            // InternalWorkflowDsl.g:2064:2: '}'
            {
             before(grammarAccess.getSignalAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__Group__5__Impl"


    // $ANTLR start "rule__AsyncronousServiceTask__Group__0"
    // InternalWorkflowDsl.g:2074:1: rule__AsyncronousServiceTask__Group__0 : rule__AsyncronousServiceTask__Group__0__Impl rule__AsyncronousServiceTask__Group__1 ;
    public final void rule__AsyncronousServiceTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2078:1: ( rule__AsyncronousServiceTask__Group__0__Impl rule__AsyncronousServiceTask__Group__1 )
            // InternalWorkflowDsl.g:2079:2: rule__AsyncronousServiceTask__Group__0__Impl rule__AsyncronousServiceTask__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AsyncronousServiceTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AsyncronousServiceTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsyncronousServiceTask__Group__0"


    // $ANTLR start "rule__AsyncronousServiceTask__Group__0__Impl"
    // InternalWorkflowDsl.g:2086:1: rule__AsyncronousServiceTask__Group__0__Impl : ( 'asyncronous task' ) ;
    public final void rule__AsyncronousServiceTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2090:1: ( ( 'asyncronous task' ) )
            // InternalWorkflowDsl.g:2091:1: ( 'asyncronous task' )
            {
            // InternalWorkflowDsl.g:2091:1: ( 'asyncronous task' )
            // InternalWorkflowDsl.g:2092:2: 'asyncronous task'
            {
             before(grammarAccess.getAsyncronousServiceTaskAccess().getAsyncronousTaskKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAsyncronousServiceTaskAccess().getAsyncronousTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsyncronousServiceTask__Group__0__Impl"


    // $ANTLR start "rule__AsyncronousServiceTask__Group__1"
    // InternalWorkflowDsl.g:2101:1: rule__AsyncronousServiceTask__Group__1 : rule__AsyncronousServiceTask__Group__1__Impl rule__AsyncronousServiceTask__Group__2 ;
    public final void rule__AsyncronousServiceTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2105:1: ( rule__AsyncronousServiceTask__Group__1__Impl rule__AsyncronousServiceTask__Group__2 )
            // InternalWorkflowDsl.g:2106:2: rule__AsyncronousServiceTask__Group__1__Impl rule__AsyncronousServiceTask__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__AsyncronousServiceTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AsyncronousServiceTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsyncronousServiceTask__Group__1"


    // $ANTLR start "rule__AsyncronousServiceTask__Group__1__Impl"
    // InternalWorkflowDsl.g:2113:1: rule__AsyncronousServiceTask__Group__1__Impl : ( ( rule__AsyncronousServiceTask__NameAssignment_1 ) ) ;
    public final void rule__AsyncronousServiceTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2117:1: ( ( ( rule__AsyncronousServiceTask__NameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:2118:1: ( ( rule__AsyncronousServiceTask__NameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:2118:1: ( ( rule__AsyncronousServiceTask__NameAssignment_1 ) )
            // InternalWorkflowDsl.g:2119:2: ( rule__AsyncronousServiceTask__NameAssignment_1 )
            {
             before(grammarAccess.getAsyncronousServiceTaskAccess().getNameAssignment_1()); 
            // InternalWorkflowDsl.g:2120:2: ( rule__AsyncronousServiceTask__NameAssignment_1 )
            // InternalWorkflowDsl.g:2120:3: rule__AsyncronousServiceTask__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AsyncronousServiceTask__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAsyncronousServiceTaskAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsyncronousServiceTask__Group__1__Impl"


    // $ANTLR start "rule__AsyncronousServiceTask__Group__2"
    // InternalWorkflowDsl.g:2128:1: rule__AsyncronousServiceTask__Group__2 : rule__AsyncronousServiceTask__Group__2__Impl rule__AsyncronousServiceTask__Group__3 ;
    public final void rule__AsyncronousServiceTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2132:1: ( rule__AsyncronousServiceTask__Group__2__Impl rule__AsyncronousServiceTask__Group__3 )
            // InternalWorkflowDsl.g:2133:2: rule__AsyncronousServiceTask__Group__2__Impl rule__AsyncronousServiceTask__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__AsyncronousServiceTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AsyncronousServiceTask__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsyncronousServiceTask__Group__2"


    // $ANTLR start "rule__AsyncronousServiceTask__Group__2__Impl"
    // InternalWorkflowDsl.g:2140:1: rule__AsyncronousServiceTask__Group__2__Impl : ( '{' ) ;
    public final void rule__AsyncronousServiceTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2144:1: ( ( '{' ) )
            // InternalWorkflowDsl.g:2145:1: ( '{' )
            {
            // InternalWorkflowDsl.g:2145:1: ( '{' )
            // InternalWorkflowDsl.g:2146:2: '{'
            {
             before(grammarAccess.getAsyncronousServiceTaskAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAsyncronousServiceTaskAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsyncronousServiceTask__Group__2__Impl"


    // $ANTLR start "rule__AsyncronousServiceTask__Group__3"
    // InternalWorkflowDsl.g:2155:1: rule__AsyncronousServiceTask__Group__3 : rule__AsyncronousServiceTask__Group__3__Impl rule__AsyncronousServiceTask__Group__4 ;
    public final void rule__AsyncronousServiceTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2159:1: ( rule__AsyncronousServiceTask__Group__3__Impl rule__AsyncronousServiceTask__Group__4 )
            // InternalWorkflowDsl.g:2160:2: rule__AsyncronousServiceTask__Group__3__Impl rule__AsyncronousServiceTask__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__AsyncronousServiceTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AsyncronousServiceTask__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsyncronousServiceTask__Group__3"


    // $ANTLR start "rule__AsyncronousServiceTask__Group__3__Impl"
    // InternalWorkflowDsl.g:2167:1: rule__AsyncronousServiceTask__Group__3__Impl : ( ( rule__AsyncronousServiceTask__InputsAssignment_3 )* ) ;
    public final void rule__AsyncronousServiceTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2171:1: ( ( ( rule__AsyncronousServiceTask__InputsAssignment_3 )* ) )
            // InternalWorkflowDsl.g:2172:1: ( ( rule__AsyncronousServiceTask__InputsAssignment_3 )* )
            {
            // InternalWorkflowDsl.g:2172:1: ( ( rule__AsyncronousServiceTask__InputsAssignment_3 )* )
            // InternalWorkflowDsl.g:2173:2: ( rule__AsyncronousServiceTask__InputsAssignment_3 )*
            {
             before(grammarAccess.getAsyncronousServiceTaskAccess().getInputsAssignment_3()); 
            // InternalWorkflowDsl.g:2174:2: ( rule__AsyncronousServiceTask__InputsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=29 && LA16_0<=31)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalWorkflowDsl.g:2174:3: rule__AsyncronousServiceTask__InputsAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__AsyncronousServiceTask__InputsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAsyncronousServiceTaskAccess().getInputsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsyncronousServiceTask__Group__3__Impl"


    // $ANTLR start "rule__AsyncronousServiceTask__Group__4"
    // InternalWorkflowDsl.g:2182:1: rule__AsyncronousServiceTask__Group__4 : rule__AsyncronousServiceTask__Group__4__Impl rule__AsyncronousServiceTask__Group__5 ;
    public final void rule__AsyncronousServiceTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2186:1: ( rule__AsyncronousServiceTask__Group__4__Impl rule__AsyncronousServiceTask__Group__5 )
            // InternalWorkflowDsl.g:2187:2: rule__AsyncronousServiceTask__Group__4__Impl rule__AsyncronousServiceTask__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__AsyncronousServiceTask__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AsyncronousServiceTask__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsyncronousServiceTask__Group__4"


    // $ANTLR start "rule__AsyncronousServiceTask__Group__4__Impl"
    // InternalWorkflowDsl.g:2194:1: rule__AsyncronousServiceTask__Group__4__Impl : ( ( rule__AsyncronousServiceTask__OutputAssignment_4 )? ) ;
    public final void rule__AsyncronousServiceTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2198:1: ( ( ( rule__AsyncronousServiceTask__OutputAssignment_4 )? ) )
            // InternalWorkflowDsl.g:2199:1: ( ( rule__AsyncronousServiceTask__OutputAssignment_4 )? )
            {
            // InternalWorkflowDsl.g:2199:1: ( ( rule__AsyncronousServiceTask__OutputAssignment_4 )? )
            // InternalWorkflowDsl.g:2200:2: ( rule__AsyncronousServiceTask__OutputAssignment_4 )?
            {
             before(grammarAccess.getAsyncronousServiceTaskAccess().getOutputAssignment_4()); 
            // InternalWorkflowDsl.g:2201:2: ( rule__AsyncronousServiceTask__OutputAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalWorkflowDsl.g:2201:3: rule__AsyncronousServiceTask__OutputAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__AsyncronousServiceTask__OutputAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAsyncronousServiceTaskAccess().getOutputAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsyncronousServiceTask__Group__4__Impl"


    // $ANTLR start "rule__AsyncronousServiceTask__Group__5"
    // InternalWorkflowDsl.g:2209:1: rule__AsyncronousServiceTask__Group__5 : rule__AsyncronousServiceTask__Group__5__Impl ;
    public final void rule__AsyncronousServiceTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2213:1: ( rule__AsyncronousServiceTask__Group__5__Impl )
            // InternalWorkflowDsl.g:2214:2: rule__AsyncronousServiceTask__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AsyncronousServiceTask__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsyncronousServiceTask__Group__5"


    // $ANTLR start "rule__AsyncronousServiceTask__Group__5__Impl"
    // InternalWorkflowDsl.g:2220:1: rule__AsyncronousServiceTask__Group__5__Impl : ( '}' ) ;
    public final void rule__AsyncronousServiceTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2224:1: ( ( '}' ) )
            // InternalWorkflowDsl.g:2225:1: ( '}' )
            {
            // InternalWorkflowDsl.g:2225:1: ( '}' )
            // InternalWorkflowDsl.g:2226:2: '}'
            {
             before(grammarAccess.getAsyncronousServiceTaskAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAsyncronousServiceTaskAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsyncronousServiceTask__Group__5__Impl"


    // $ANTLR start "rule__SyncronousServiceTask__Group__0"
    // InternalWorkflowDsl.g:2236:1: rule__SyncronousServiceTask__Group__0 : rule__SyncronousServiceTask__Group__0__Impl rule__SyncronousServiceTask__Group__1 ;
    public final void rule__SyncronousServiceTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2240:1: ( rule__SyncronousServiceTask__Group__0__Impl rule__SyncronousServiceTask__Group__1 )
            // InternalWorkflowDsl.g:2241:2: rule__SyncronousServiceTask__Group__0__Impl rule__SyncronousServiceTask__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SyncronousServiceTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SyncronousServiceTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyncronousServiceTask__Group__0"


    // $ANTLR start "rule__SyncronousServiceTask__Group__0__Impl"
    // InternalWorkflowDsl.g:2248:1: rule__SyncronousServiceTask__Group__0__Impl : ( 'syncronous task' ) ;
    public final void rule__SyncronousServiceTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2252:1: ( ( 'syncronous task' ) )
            // InternalWorkflowDsl.g:2253:1: ( 'syncronous task' )
            {
            // InternalWorkflowDsl.g:2253:1: ( 'syncronous task' )
            // InternalWorkflowDsl.g:2254:2: 'syncronous task'
            {
             before(grammarAccess.getSyncronousServiceTaskAccess().getSyncronousTaskKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSyncronousServiceTaskAccess().getSyncronousTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyncronousServiceTask__Group__0__Impl"


    // $ANTLR start "rule__SyncronousServiceTask__Group__1"
    // InternalWorkflowDsl.g:2263:1: rule__SyncronousServiceTask__Group__1 : rule__SyncronousServiceTask__Group__1__Impl rule__SyncronousServiceTask__Group__2 ;
    public final void rule__SyncronousServiceTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2267:1: ( rule__SyncronousServiceTask__Group__1__Impl rule__SyncronousServiceTask__Group__2 )
            // InternalWorkflowDsl.g:2268:2: rule__SyncronousServiceTask__Group__1__Impl rule__SyncronousServiceTask__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__SyncronousServiceTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SyncronousServiceTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyncronousServiceTask__Group__1"


    // $ANTLR start "rule__SyncronousServiceTask__Group__1__Impl"
    // InternalWorkflowDsl.g:2275:1: rule__SyncronousServiceTask__Group__1__Impl : ( ( rule__SyncronousServiceTask__NameAssignment_1 ) ) ;
    public final void rule__SyncronousServiceTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2279:1: ( ( ( rule__SyncronousServiceTask__NameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:2280:1: ( ( rule__SyncronousServiceTask__NameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:2280:1: ( ( rule__SyncronousServiceTask__NameAssignment_1 ) )
            // InternalWorkflowDsl.g:2281:2: ( rule__SyncronousServiceTask__NameAssignment_1 )
            {
             before(grammarAccess.getSyncronousServiceTaskAccess().getNameAssignment_1()); 
            // InternalWorkflowDsl.g:2282:2: ( rule__SyncronousServiceTask__NameAssignment_1 )
            // InternalWorkflowDsl.g:2282:3: rule__SyncronousServiceTask__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SyncronousServiceTask__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSyncronousServiceTaskAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyncronousServiceTask__Group__1__Impl"


    // $ANTLR start "rule__SyncronousServiceTask__Group__2"
    // InternalWorkflowDsl.g:2290:1: rule__SyncronousServiceTask__Group__2 : rule__SyncronousServiceTask__Group__2__Impl rule__SyncronousServiceTask__Group__3 ;
    public final void rule__SyncronousServiceTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2294:1: ( rule__SyncronousServiceTask__Group__2__Impl rule__SyncronousServiceTask__Group__3 )
            // InternalWorkflowDsl.g:2295:2: rule__SyncronousServiceTask__Group__2__Impl rule__SyncronousServiceTask__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__SyncronousServiceTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SyncronousServiceTask__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyncronousServiceTask__Group__2"


    // $ANTLR start "rule__SyncronousServiceTask__Group__2__Impl"
    // InternalWorkflowDsl.g:2302:1: rule__SyncronousServiceTask__Group__2__Impl : ( '{' ) ;
    public final void rule__SyncronousServiceTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2306:1: ( ( '{' ) )
            // InternalWorkflowDsl.g:2307:1: ( '{' )
            {
            // InternalWorkflowDsl.g:2307:1: ( '{' )
            // InternalWorkflowDsl.g:2308:2: '{'
            {
             before(grammarAccess.getSyncronousServiceTaskAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSyncronousServiceTaskAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyncronousServiceTask__Group__2__Impl"


    // $ANTLR start "rule__SyncronousServiceTask__Group__3"
    // InternalWorkflowDsl.g:2317:1: rule__SyncronousServiceTask__Group__3 : rule__SyncronousServiceTask__Group__3__Impl rule__SyncronousServiceTask__Group__4 ;
    public final void rule__SyncronousServiceTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2321:1: ( rule__SyncronousServiceTask__Group__3__Impl rule__SyncronousServiceTask__Group__4 )
            // InternalWorkflowDsl.g:2322:2: rule__SyncronousServiceTask__Group__3__Impl rule__SyncronousServiceTask__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__SyncronousServiceTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SyncronousServiceTask__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyncronousServiceTask__Group__3"


    // $ANTLR start "rule__SyncronousServiceTask__Group__3__Impl"
    // InternalWorkflowDsl.g:2329:1: rule__SyncronousServiceTask__Group__3__Impl : ( ( rule__SyncronousServiceTask__InputsAssignment_3 )* ) ;
    public final void rule__SyncronousServiceTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2333:1: ( ( ( rule__SyncronousServiceTask__InputsAssignment_3 )* ) )
            // InternalWorkflowDsl.g:2334:1: ( ( rule__SyncronousServiceTask__InputsAssignment_3 )* )
            {
            // InternalWorkflowDsl.g:2334:1: ( ( rule__SyncronousServiceTask__InputsAssignment_3 )* )
            // InternalWorkflowDsl.g:2335:2: ( rule__SyncronousServiceTask__InputsAssignment_3 )*
            {
             before(grammarAccess.getSyncronousServiceTaskAccess().getInputsAssignment_3()); 
            // InternalWorkflowDsl.g:2336:2: ( rule__SyncronousServiceTask__InputsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=29 && LA18_0<=31)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalWorkflowDsl.g:2336:3: rule__SyncronousServiceTask__InputsAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__SyncronousServiceTask__InputsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSyncronousServiceTaskAccess().getInputsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyncronousServiceTask__Group__3__Impl"


    // $ANTLR start "rule__SyncronousServiceTask__Group__4"
    // InternalWorkflowDsl.g:2344:1: rule__SyncronousServiceTask__Group__4 : rule__SyncronousServiceTask__Group__4__Impl rule__SyncronousServiceTask__Group__5 ;
    public final void rule__SyncronousServiceTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2348:1: ( rule__SyncronousServiceTask__Group__4__Impl rule__SyncronousServiceTask__Group__5 )
            // InternalWorkflowDsl.g:2349:2: rule__SyncronousServiceTask__Group__4__Impl rule__SyncronousServiceTask__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__SyncronousServiceTask__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SyncronousServiceTask__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyncronousServiceTask__Group__4"


    // $ANTLR start "rule__SyncronousServiceTask__Group__4__Impl"
    // InternalWorkflowDsl.g:2356:1: rule__SyncronousServiceTask__Group__4__Impl : ( ( rule__SyncronousServiceTask__OutputAssignment_4 )? ) ;
    public final void rule__SyncronousServiceTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2360:1: ( ( ( rule__SyncronousServiceTask__OutputAssignment_4 )? ) )
            // InternalWorkflowDsl.g:2361:1: ( ( rule__SyncronousServiceTask__OutputAssignment_4 )? )
            {
            // InternalWorkflowDsl.g:2361:1: ( ( rule__SyncronousServiceTask__OutputAssignment_4 )? )
            // InternalWorkflowDsl.g:2362:2: ( rule__SyncronousServiceTask__OutputAssignment_4 )?
            {
             before(grammarAccess.getSyncronousServiceTaskAccess().getOutputAssignment_4()); 
            // InternalWorkflowDsl.g:2363:2: ( rule__SyncronousServiceTask__OutputAssignment_4 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalWorkflowDsl.g:2363:3: rule__SyncronousServiceTask__OutputAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SyncronousServiceTask__OutputAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSyncronousServiceTaskAccess().getOutputAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyncronousServiceTask__Group__4__Impl"


    // $ANTLR start "rule__SyncronousServiceTask__Group__5"
    // InternalWorkflowDsl.g:2371:1: rule__SyncronousServiceTask__Group__5 : rule__SyncronousServiceTask__Group__5__Impl ;
    public final void rule__SyncronousServiceTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2375:1: ( rule__SyncronousServiceTask__Group__5__Impl )
            // InternalWorkflowDsl.g:2376:2: rule__SyncronousServiceTask__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SyncronousServiceTask__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyncronousServiceTask__Group__5"


    // $ANTLR start "rule__SyncronousServiceTask__Group__5__Impl"
    // InternalWorkflowDsl.g:2382:1: rule__SyncronousServiceTask__Group__5__Impl : ( '}' ) ;
    public final void rule__SyncronousServiceTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2386:1: ( ( '}' ) )
            // InternalWorkflowDsl.g:2387:1: ( '}' )
            {
            // InternalWorkflowDsl.g:2387:1: ( '}' )
            // InternalWorkflowDsl.g:2388:2: '}'
            {
             before(grammarAccess.getSyncronousServiceTaskAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSyncronousServiceTaskAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyncronousServiceTask__Group__5__Impl"


    // $ANTLR start "rule__ExlcusiveDiverging__Group__0"
    // InternalWorkflowDsl.g:2398:1: rule__ExlcusiveDiverging__Group__0 : rule__ExlcusiveDiverging__Group__0__Impl rule__ExlcusiveDiverging__Group__1 ;
    public final void rule__ExlcusiveDiverging__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2402:1: ( rule__ExlcusiveDiverging__Group__0__Impl rule__ExlcusiveDiverging__Group__1 )
            // InternalWorkflowDsl.g:2403:2: rule__ExlcusiveDiverging__Group__0__Impl rule__ExlcusiveDiverging__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ExlcusiveDiverging__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExlcusiveDiverging__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExlcusiveDiverging__Group__0"


    // $ANTLR start "rule__ExlcusiveDiverging__Group__0__Impl"
    // InternalWorkflowDsl.g:2410:1: rule__ExlcusiveDiverging__Group__0__Impl : ( 'exclusive diverging' ) ;
    public final void rule__ExlcusiveDiverging__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2414:1: ( ( 'exclusive diverging' ) )
            // InternalWorkflowDsl.g:2415:1: ( 'exclusive diverging' )
            {
            // InternalWorkflowDsl.g:2415:1: ( 'exclusive diverging' )
            // InternalWorkflowDsl.g:2416:2: 'exclusive diverging'
            {
             before(grammarAccess.getExlcusiveDivergingAccess().getExclusiveDivergingKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExlcusiveDivergingAccess().getExclusiveDivergingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExlcusiveDiverging__Group__0__Impl"


    // $ANTLR start "rule__ExlcusiveDiverging__Group__1"
    // InternalWorkflowDsl.g:2425:1: rule__ExlcusiveDiverging__Group__1 : rule__ExlcusiveDiverging__Group__1__Impl ;
    public final void rule__ExlcusiveDiverging__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2429:1: ( rule__ExlcusiveDiverging__Group__1__Impl )
            // InternalWorkflowDsl.g:2430:2: rule__ExlcusiveDiverging__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExlcusiveDiverging__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExlcusiveDiverging__Group__1"


    // $ANTLR start "rule__ExlcusiveDiverging__Group__1__Impl"
    // InternalWorkflowDsl.g:2436:1: rule__ExlcusiveDiverging__Group__1__Impl : ( ( rule__ExlcusiveDiverging__NameAssignment_1 ) ) ;
    public final void rule__ExlcusiveDiverging__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2440:1: ( ( ( rule__ExlcusiveDiverging__NameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:2441:1: ( ( rule__ExlcusiveDiverging__NameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:2441:1: ( ( rule__ExlcusiveDiverging__NameAssignment_1 ) )
            // InternalWorkflowDsl.g:2442:2: ( rule__ExlcusiveDiverging__NameAssignment_1 )
            {
             before(grammarAccess.getExlcusiveDivergingAccess().getNameAssignment_1()); 
            // InternalWorkflowDsl.g:2443:2: ( rule__ExlcusiveDiverging__NameAssignment_1 )
            // InternalWorkflowDsl.g:2443:3: rule__ExlcusiveDiverging__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExlcusiveDiverging__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExlcusiveDivergingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExlcusiveDiverging__Group__1__Impl"


    // $ANTLR start "rule__ParallelDiverging__Group__0"
    // InternalWorkflowDsl.g:2452:1: rule__ParallelDiverging__Group__0 : rule__ParallelDiverging__Group__0__Impl rule__ParallelDiverging__Group__1 ;
    public final void rule__ParallelDiverging__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2456:1: ( rule__ParallelDiverging__Group__0__Impl rule__ParallelDiverging__Group__1 )
            // InternalWorkflowDsl.g:2457:2: rule__ParallelDiverging__Group__0__Impl rule__ParallelDiverging__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ParallelDiverging__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelDiverging__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelDiverging__Group__0"


    // $ANTLR start "rule__ParallelDiverging__Group__0__Impl"
    // InternalWorkflowDsl.g:2464:1: rule__ParallelDiverging__Group__0__Impl : ( 'parallel diverging' ) ;
    public final void rule__ParallelDiverging__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2468:1: ( ( 'parallel diverging' ) )
            // InternalWorkflowDsl.g:2469:1: ( 'parallel diverging' )
            {
            // InternalWorkflowDsl.g:2469:1: ( 'parallel diverging' )
            // InternalWorkflowDsl.g:2470:2: 'parallel diverging'
            {
             before(grammarAccess.getParallelDivergingAccess().getParallelDivergingKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getParallelDivergingAccess().getParallelDivergingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelDiverging__Group__0__Impl"


    // $ANTLR start "rule__ParallelDiverging__Group__1"
    // InternalWorkflowDsl.g:2479:1: rule__ParallelDiverging__Group__1 : rule__ParallelDiverging__Group__1__Impl ;
    public final void rule__ParallelDiverging__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2483:1: ( rule__ParallelDiverging__Group__1__Impl )
            // InternalWorkflowDsl.g:2484:2: rule__ParallelDiverging__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParallelDiverging__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelDiverging__Group__1"


    // $ANTLR start "rule__ParallelDiverging__Group__1__Impl"
    // InternalWorkflowDsl.g:2490:1: rule__ParallelDiverging__Group__1__Impl : ( ( rule__ParallelDiverging__NameAssignment_1 ) ) ;
    public final void rule__ParallelDiverging__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2494:1: ( ( ( rule__ParallelDiverging__NameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:2495:1: ( ( rule__ParallelDiverging__NameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:2495:1: ( ( rule__ParallelDiverging__NameAssignment_1 ) )
            // InternalWorkflowDsl.g:2496:2: ( rule__ParallelDiverging__NameAssignment_1 )
            {
             before(grammarAccess.getParallelDivergingAccess().getNameAssignment_1()); 
            // InternalWorkflowDsl.g:2497:2: ( rule__ParallelDiverging__NameAssignment_1 )
            // InternalWorkflowDsl.g:2497:3: rule__ParallelDiverging__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParallelDiverging__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParallelDivergingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelDiverging__Group__1__Impl"


    // $ANTLR start "rule__ExclusiveConverging__Group__0"
    // InternalWorkflowDsl.g:2506:1: rule__ExclusiveConverging__Group__0 : rule__ExclusiveConverging__Group__0__Impl rule__ExclusiveConverging__Group__1 ;
    public final void rule__ExclusiveConverging__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2510:1: ( rule__ExclusiveConverging__Group__0__Impl rule__ExclusiveConverging__Group__1 )
            // InternalWorkflowDsl.g:2511:2: rule__ExclusiveConverging__Group__0__Impl rule__ExclusiveConverging__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ExclusiveConverging__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExclusiveConverging__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveConverging__Group__0"


    // $ANTLR start "rule__ExclusiveConverging__Group__0__Impl"
    // InternalWorkflowDsl.g:2518:1: rule__ExclusiveConverging__Group__0__Impl : ( 'exclusive converging' ) ;
    public final void rule__ExclusiveConverging__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2522:1: ( ( 'exclusive converging' ) )
            // InternalWorkflowDsl.g:2523:1: ( 'exclusive converging' )
            {
            // InternalWorkflowDsl.g:2523:1: ( 'exclusive converging' )
            // InternalWorkflowDsl.g:2524:2: 'exclusive converging'
            {
             before(grammarAccess.getExclusiveConvergingAccess().getExclusiveConvergingKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExclusiveConvergingAccess().getExclusiveConvergingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveConverging__Group__0__Impl"


    // $ANTLR start "rule__ExclusiveConverging__Group__1"
    // InternalWorkflowDsl.g:2533:1: rule__ExclusiveConverging__Group__1 : rule__ExclusiveConverging__Group__1__Impl ;
    public final void rule__ExclusiveConverging__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2537:1: ( rule__ExclusiveConverging__Group__1__Impl )
            // InternalWorkflowDsl.g:2538:2: rule__ExclusiveConverging__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveConverging__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveConverging__Group__1"


    // $ANTLR start "rule__ExclusiveConverging__Group__1__Impl"
    // InternalWorkflowDsl.g:2544:1: rule__ExclusiveConverging__Group__1__Impl : ( ( rule__ExclusiveConverging__NameAssignment_1 ) ) ;
    public final void rule__ExclusiveConverging__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2548:1: ( ( ( rule__ExclusiveConverging__NameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:2549:1: ( ( rule__ExclusiveConverging__NameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:2549:1: ( ( rule__ExclusiveConverging__NameAssignment_1 ) )
            // InternalWorkflowDsl.g:2550:2: ( rule__ExclusiveConverging__NameAssignment_1 )
            {
             before(grammarAccess.getExclusiveConvergingAccess().getNameAssignment_1()); 
            // InternalWorkflowDsl.g:2551:2: ( rule__ExclusiveConverging__NameAssignment_1 )
            // InternalWorkflowDsl.g:2551:3: rule__ExclusiveConverging__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExclusiveConverging__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExclusiveConvergingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveConverging__Group__1__Impl"


    // $ANTLR start "rule__ParallelConverging__Group__0"
    // InternalWorkflowDsl.g:2560:1: rule__ParallelConverging__Group__0 : rule__ParallelConverging__Group__0__Impl rule__ParallelConverging__Group__1 ;
    public final void rule__ParallelConverging__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2564:1: ( rule__ParallelConverging__Group__0__Impl rule__ParallelConverging__Group__1 )
            // InternalWorkflowDsl.g:2565:2: rule__ParallelConverging__Group__0__Impl rule__ParallelConverging__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ParallelConverging__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelConverging__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelConverging__Group__0"


    // $ANTLR start "rule__ParallelConverging__Group__0__Impl"
    // InternalWorkflowDsl.g:2572:1: rule__ParallelConverging__Group__0__Impl : ( 'parallel converging' ) ;
    public final void rule__ParallelConverging__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2576:1: ( ( 'parallel converging' ) )
            // InternalWorkflowDsl.g:2577:1: ( 'parallel converging' )
            {
            // InternalWorkflowDsl.g:2577:1: ( 'parallel converging' )
            // InternalWorkflowDsl.g:2578:2: 'parallel converging'
            {
             before(grammarAccess.getParallelConvergingAccess().getParallelConvergingKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getParallelConvergingAccess().getParallelConvergingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelConverging__Group__0__Impl"


    // $ANTLR start "rule__ParallelConverging__Group__1"
    // InternalWorkflowDsl.g:2587:1: rule__ParallelConverging__Group__1 : rule__ParallelConverging__Group__1__Impl ;
    public final void rule__ParallelConverging__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2591:1: ( rule__ParallelConverging__Group__1__Impl )
            // InternalWorkflowDsl.g:2592:2: rule__ParallelConverging__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParallelConverging__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelConverging__Group__1"


    // $ANTLR start "rule__ParallelConverging__Group__1__Impl"
    // InternalWorkflowDsl.g:2598:1: rule__ParallelConverging__Group__1__Impl : ( ( rule__ParallelConverging__NameAssignment_1 ) ) ;
    public final void rule__ParallelConverging__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2602:1: ( ( ( rule__ParallelConverging__NameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:2603:1: ( ( rule__ParallelConverging__NameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:2603:1: ( ( rule__ParallelConverging__NameAssignment_1 ) )
            // InternalWorkflowDsl.g:2604:2: ( rule__ParallelConverging__NameAssignment_1 )
            {
             before(grammarAccess.getParallelConvergingAccess().getNameAssignment_1()); 
            // InternalWorkflowDsl.g:2605:2: ( rule__ParallelConverging__NameAssignment_1 )
            // InternalWorkflowDsl.g:2605:3: rule__ParallelConverging__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParallelConverging__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParallelConvergingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelConverging__Group__1__Impl"


    // $ANTLR start "rule__BasicConnector__Group__0"
    // InternalWorkflowDsl.g:2614:1: rule__BasicConnector__Group__0 : rule__BasicConnector__Group__0__Impl rule__BasicConnector__Group__1 ;
    public final void rule__BasicConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2618:1: ( rule__BasicConnector__Group__0__Impl rule__BasicConnector__Group__1 )
            // InternalWorkflowDsl.g:2619:2: rule__BasicConnector__Group__0__Impl rule__BasicConnector__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__BasicConnector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicConnector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicConnector__Group__0"


    // $ANTLR start "rule__BasicConnector__Group__0__Impl"
    // InternalWorkflowDsl.g:2626:1: rule__BasicConnector__Group__0__Impl : ( 'connect' ) ;
    public final void rule__BasicConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2630:1: ( ( 'connect' ) )
            // InternalWorkflowDsl.g:2631:1: ( 'connect' )
            {
            // InternalWorkflowDsl.g:2631:1: ( 'connect' )
            // InternalWorkflowDsl.g:2632:2: 'connect'
            {
             before(grammarAccess.getBasicConnectorAccess().getConnectKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBasicConnectorAccess().getConnectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicConnector__Group__0__Impl"


    // $ANTLR start "rule__BasicConnector__Group__1"
    // InternalWorkflowDsl.g:2641:1: rule__BasicConnector__Group__1 : rule__BasicConnector__Group__1__Impl rule__BasicConnector__Group__2 ;
    public final void rule__BasicConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2645:1: ( rule__BasicConnector__Group__1__Impl rule__BasicConnector__Group__2 )
            // InternalWorkflowDsl.g:2646:2: rule__BasicConnector__Group__1__Impl rule__BasicConnector__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__BasicConnector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicConnector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicConnector__Group__1"


    // $ANTLR start "rule__BasicConnector__Group__1__Impl"
    // InternalWorkflowDsl.g:2653:1: rule__BasicConnector__Group__1__Impl : ( ( rule__BasicConnector__FromAssignment_1 ) ) ;
    public final void rule__BasicConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2657:1: ( ( ( rule__BasicConnector__FromAssignment_1 ) ) )
            // InternalWorkflowDsl.g:2658:1: ( ( rule__BasicConnector__FromAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:2658:1: ( ( rule__BasicConnector__FromAssignment_1 ) )
            // InternalWorkflowDsl.g:2659:2: ( rule__BasicConnector__FromAssignment_1 )
            {
             before(grammarAccess.getBasicConnectorAccess().getFromAssignment_1()); 
            // InternalWorkflowDsl.g:2660:2: ( rule__BasicConnector__FromAssignment_1 )
            // InternalWorkflowDsl.g:2660:3: rule__BasicConnector__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicConnector__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicConnectorAccess().getFromAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicConnector__Group__1__Impl"


    // $ANTLR start "rule__BasicConnector__Group__2"
    // InternalWorkflowDsl.g:2668:1: rule__BasicConnector__Group__2 : rule__BasicConnector__Group__2__Impl ;
    public final void rule__BasicConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2672:1: ( rule__BasicConnector__Group__2__Impl )
            // InternalWorkflowDsl.g:2673:2: rule__BasicConnector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicConnector__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicConnector__Group__2"


    // $ANTLR start "rule__BasicConnector__Group__2__Impl"
    // InternalWorkflowDsl.g:2679:1: rule__BasicConnector__Group__2__Impl : ( ( rule__BasicConnector__ToAssignment_2 ) ) ;
    public final void rule__BasicConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2683:1: ( ( ( rule__BasicConnector__ToAssignment_2 ) ) )
            // InternalWorkflowDsl.g:2684:1: ( ( rule__BasicConnector__ToAssignment_2 ) )
            {
            // InternalWorkflowDsl.g:2684:1: ( ( rule__BasicConnector__ToAssignment_2 ) )
            // InternalWorkflowDsl.g:2685:2: ( rule__BasicConnector__ToAssignment_2 )
            {
             before(grammarAccess.getBasicConnectorAccess().getToAssignment_2()); 
            // InternalWorkflowDsl.g:2686:2: ( rule__BasicConnector__ToAssignment_2 )
            // InternalWorkflowDsl.g:2686:3: rule__BasicConnector__ToAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BasicConnector__ToAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBasicConnectorAccess().getToAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicConnector__Group__2__Impl"


    // $ANTLR start "rule__TaskNameInput__Group__0"
    // InternalWorkflowDsl.g:2695:1: rule__TaskNameInput__Group__0 : rule__TaskNameInput__Group__0__Impl rule__TaskNameInput__Group__1 ;
    public final void rule__TaskNameInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2699:1: ( rule__TaskNameInput__Group__0__Impl rule__TaskNameInput__Group__1 )
            // InternalWorkflowDsl.g:2700:2: rule__TaskNameInput__Group__0__Impl rule__TaskNameInput__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__TaskNameInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskNameInput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskNameInput__Group__0"


    // $ANTLR start "rule__TaskNameInput__Group__0__Impl"
    // InternalWorkflowDsl.g:2707:1: rule__TaskNameInput__Group__0__Impl : ( 'task name input' ) ;
    public final void rule__TaskNameInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2711:1: ( ( 'task name input' ) )
            // InternalWorkflowDsl.g:2712:1: ( 'task name input' )
            {
            // InternalWorkflowDsl.g:2712:1: ( 'task name input' )
            // InternalWorkflowDsl.g:2713:2: 'task name input'
            {
             before(grammarAccess.getTaskNameInputAccess().getTaskNameInputKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTaskNameInputAccess().getTaskNameInputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskNameInput__Group__0__Impl"


    // $ANTLR start "rule__TaskNameInput__Group__1"
    // InternalWorkflowDsl.g:2722:1: rule__TaskNameInput__Group__1 : rule__TaskNameInput__Group__1__Impl ;
    public final void rule__TaskNameInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2726:1: ( rule__TaskNameInput__Group__1__Impl )
            // InternalWorkflowDsl.g:2727:2: rule__TaskNameInput__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskNameInput__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskNameInput__Group__1"


    // $ANTLR start "rule__TaskNameInput__Group__1__Impl"
    // InternalWorkflowDsl.g:2733:1: rule__TaskNameInput__Group__1__Impl : ( () ) ;
    public final void rule__TaskNameInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2737:1: ( ( () ) )
            // InternalWorkflowDsl.g:2738:1: ( () )
            {
            // InternalWorkflowDsl.g:2738:1: ( () )
            // InternalWorkflowDsl.g:2739:2: ()
            {
             before(grammarAccess.getTaskNameInputAccess().getTaskNameInputAction_1()); 
            // InternalWorkflowDsl.g:2740:2: ()
            // InternalWorkflowDsl.g:2740:3: 
            {
            }

             after(grammarAccess.getTaskNameInputAccess().getTaskNameInputAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskNameInput__Group__1__Impl"


    // $ANTLR start "rule__VariableBasedInput__Group__0"
    // InternalWorkflowDsl.g:2749:1: rule__VariableBasedInput__Group__0 : rule__VariableBasedInput__Group__0__Impl rule__VariableBasedInput__Group__1 ;
    public final void rule__VariableBasedInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2753:1: ( rule__VariableBasedInput__Group__0__Impl rule__VariableBasedInput__Group__1 )
            // InternalWorkflowDsl.g:2754:2: rule__VariableBasedInput__Group__0__Impl rule__VariableBasedInput__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VariableBasedInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBasedInput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBasedInput__Group__0"


    // $ANTLR start "rule__VariableBasedInput__Group__0__Impl"
    // InternalWorkflowDsl.g:2761:1: rule__VariableBasedInput__Group__0__Impl : ( 'variable based input' ) ;
    public final void rule__VariableBasedInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2765:1: ( ( 'variable based input' ) )
            // InternalWorkflowDsl.g:2766:1: ( 'variable based input' )
            {
            // InternalWorkflowDsl.g:2766:1: ( 'variable based input' )
            // InternalWorkflowDsl.g:2767:2: 'variable based input'
            {
             before(grammarAccess.getVariableBasedInputAccess().getVariableBasedInputKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVariableBasedInputAccess().getVariableBasedInputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBasedInput__Group__0__Impl"


    // $ANTLR start "rule__VariableBasedInput__Group__1"
    // InternalWorkflowDsl.g:2776:1: rule__VariableBasedInput__Group__1 : rule__VariableBasedInput__Group__1__Impl rule__VariableBasedInput__Group__2 ;
    public final void rule__VariableBasedInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2780:1: ( rule__VariableBasedInput__Group__1__Impl rule__VariableBasedInput__Group__2 )
            // InternalWorkflowDsl.g:2781:2: rule__VariableBasedInput__Group__1__Impl rule__VariableBasedInput__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__VariableBasedInput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBasedInput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBasedInput__Group__1"


    // $ANTLR start "rule__VariableBasedInput__Group__1__Impl"
    // InternalWorkflowDsl.g:2788:1: rule__VariableBasedInput__Group__1__Impl : ( ( rule__VariableBasedInput__VariableAssignment_1 ) ) ;
    public final void rule__VariableBasedInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2792:1: ( ( ( rule__VariableBasedInput__VariableAssignment_1 ) ) )
            // InternalWorkflowDsl.g:2793:1: ( ( rule__VariableBasedInput__VariableAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:2793:1: ( ( rule__VariableBasedInput__VariableAssignment_1 ) )
            // InternalWorkflowDsl.g:2794:2: ( rule__VariableBasedInput__VariableAssignment_1 )
            {
             before(grammarAccess.getVariableBasedInputAccess().getVariableAssignment_1()); 
            // InternalWorkflowDsl.g:2795:2: ( rule__VariableBasedInput__VariableAssignment_1 )
            // InternalWorkflowDsl.g:2795:3: rule__VariableBasedInput__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableBasedInput__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableBasedInputAccess().getVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBasedInput__Group__1__Impl"


    // $ANTLR start "rule__VariableBasedInput__Group__2"
    // InternalWorkflowDsl.g:2803:1: rule__VariableBasedInput__Group__2 : rule__VariableBasedInput__Group__2__Impl ;
    public final void rule__VariableBasedInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2807:1: ( rule__VariableBasedInput__Group__2__Impl )
            // InternalWorkflowDsl.g:2808:2: rule__VariableBasedInput__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableBasedInput__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBasedInput__Group__2"


    // $ANTLR start "rule__VariableBasedInput__Group__2__Impl"
    // InternalWorkflowDsl.g:2814:1: rule__VariableBasedInput__Group__2__Impl : ( ( rule__VariableBasedInput__EventParameterNameAssignment_2 ) ) ;
    public final void rule__VariableBasedInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2818:1: ( ( ( rule__VariableBasedInput__EventParameterNameAssignment_2 ) ) )
            // InternalWorkflowDsl.g:2819:1: ( ( rule__VariableBasedInput__EventParameterNameAssignment_2 ) )
            {
            // InternalWorkflowDsl.g:2819:1: ( ( rule__VariableBasedInput__EventParameterNameAssignment_2 ) )
            // InternalWorkflowDsl.g:2820:2: ( rule__VariableBasedInput__EventParameterNameAssignment_2 )
            {
             before(grammarAccess.getVariableBasedInputAccess().getEventParameterNameAssignment_2()); 
            // InternalWorkflowDsl.g:2821:2: ( rule__VariableBasedInput__EventParameterNameAssignment_2 )
            // InternalWorkflowDsl.g:2821:3: rule__VariableBasedInput__EventParameterNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableBasedInput__EventParameterNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableBasedInputAccess().getEventParameterNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBasedInput__Group__2__Impl"


    // $ANTLR start "rule__EventBasedInput__Group__0"
    // InternalWorkflowDsl.g:2830:1: rule__EventBasedInput__Group__0 : rule__EventBasedInput__Group__0__Impl rule__EventBasedInput__Group__1 ;
    public final void rule__EventBasedInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2834:1: ( rule__EventBasedInput__Group__0__Impl rule__EventBasedInput__Group__1 )
            // InternalWorkflowDsl.g:2835:2: rule__EventBasedInput__Group__0__Impl rule__EventBasedInput__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__EventBasedInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventBasedInput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBasedInput__Group__0"


    // $ANTLR start "rule__EventBasedInput__Group__0__Impl"
    // InternalWorkflowDsl.g:2842:1: rule__EventBasedInput__Group__0__Impl : ( 'map based input' ) ;
    public final void rule__EventBasedInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2846:1: ( ( 'map based input' ) )
            // InternalWorkflowDsl.g:2847:1: ( 'map based input' )
            {
            // InternalWorkflowDsl.g:2847:1: ( 'map based input' )
            // InternalWorkflowDsl.g:2848:2: 'map based input'
            {
             before(grammarAccess.getEventBasedInputAccess().getMapBasedInputKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEventBasedInputAccess().getMapBasedInputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBasedInput__Group__0__Impl"


    // $ANTLR start "rule__EventBasedInput__Group__1"
    // InternalWorkflowDsl.g:2857:1: rule__EventBasedInput__Group__1 : rule__EventBasedInput__Group__1__Impl rule__EventBasedInput__Group__2 ;
    public final void rule__EventBasedInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2861:1: ( rule__EventBasedInput__Group__1__Impl rule__EventBasedInput__Group__2 )
            // InternalWorkflowDsl.g:2862:2: rule__EventBasedInput__Group__1__Impl rule__EventBasedInput__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__EventBasedInput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventBasedInput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBasedInput__Group__1"


    // $ANTLR start "rule__EventBasedInput__Group__1__Impl"
    // InternalWorkflowDsl.g:2869:1: rule__EventBasedInput__Group__1__Impl : ( ( rule__EventBasedInput__EventAssignment_1 ) ) ;
    public final void rule__EventBasedInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2873:1: ( ( ( rule__EventBasedInput__EventAssignment_1 ) ) )
            // InternalWorkflowDsl.g:2874:1: ( ( rule__EventBasedInput__EventAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:2874:1: ( ( rule__EventBasedInput__EventAssignment_1 ) )
            // InternalWorkflowDsl.g:2875:2: ( rule__EventBasedInput__EventAssignment_1 )
            {
             before(grammarAccess.getEventBasedInputAccess().getEventAssignment_1()); 
            // InternalWorkflowDsl.g:2876:2: ( rule__EventBasedInput__EventAssignment_1 )
            // InternalWorkflowDsl.g:2876:3: rule__EventBasedInput__EventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EventBasedInput__EventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventBasedInputAccess().getEventAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBasedInput__Group__1__Impl"


    // $ANTLR start "rule__EventBasedInput__Group__2"
    // InternalWorkflowDsl.g:2884:1: rule__EventBasedInput__Group__2 : rule__EventBasedInput__Group__2__Impl rule__EventBasedInput__Group__3 ;
    public final void rule__EventBasedInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2888:1: ( rule__EventBasedInput__Group__2__Impl rule__EventBasedInput__Group__3 )
            // InternalWorkflowDsl.g:2889:2: rule__EventBasedInput__Group__2__Impl rule__EventBasedInput__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__EventBasedInput__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventBasedInput__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBasedInput__Group__2"


    // $ANTLR start "rule__EventBasedInput__Group__2__Impl"
    // InternalWorkflowDsl.g:2896:1: rule__EventBasedInput__Group__2__Impl : ( ( rule__EventBasedInput__VariableAssignment_2 ) ) ;
    public final void rule__EventBasedInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2900:1: ( ( ( rule__EventBasedInput__VariableAssignment_2 ) ) )
            // InternalWorkflowDsl.g:2901:1: ( ( rule__EventBasedInput__VariableAssignment_2 ) )
            {
            // InternalWorkflowDsl.g:2901:1: ( ( rule__EventBasedInput__VariableAssignment_2 ) )
            // InternalWorkflowDsl.g:2902:2: ( rule__EventBasedInput__VariableAssignment_2 )
            {
             before(grammarAccess.getEventBasedInputAccess().getVariableAssignment_2()); 
            // InternalWorkflowDsl.g:2903:2: ( rule__EventBasedInput__VariableAssignment_2 )
            // InternalWorkflowDsl.g:2903:3: rule__EventBasedInput__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EventBasedInput__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventBasedInputAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBasedInput__Group__2__Impl"


    // $ANTLR start "rule__EventBasedInput__Group__3"
    // InternalWorkflowDsl.g:2911:1: rule__EventBasedInput__Group__3 : rule__EventBasedInput__Group__3__Impl ;
    public final void rule__EventBasedInput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2915:1: ( rule__EventBasedInput__Group__3__Impl )
            // InternalWorkflowDsl.g:2916:2: rule__EventBasedInput__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventBasedInput__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBasedInput__Group__3"


    // $ANTLR start "rule__EventBasedInput__Group__3__Impl"
    // InternalWorkflowDsl.g:2922:1: rule__EventBasedInput__Group__3__Impl : ( ( rule__EventBasedInput__EventParameterNameAssignment_3 ) ) ;
    public final void rule__EventBasedInput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2926:1: ( ( ( rule__EventBasedInput__EventParameterNameAssignment_3 ) ) )
            // InternalWorkflowDsl.g:2927:1: ( ( rule__EventBasedInput__EventParameterNameAssignment_3 ) )
            {
            // InternalWorkflowDsl.g:2927:1: ( ( rule__EventBasedInput__EventParameterNameAssignment_3 ) )
            // InternalWorkflowDsl.g:2928:2: ( rule__EventBasedInput__EventParameterNameAssignment_3 )
            {
             before(grammarAccess.getEventBasedInputAccess().getEventParameterNameAssignment_3()); 
            // InternalWorkflowDsl.g:2929:2: ( rule__EventBasedInput__EventParameterNameAssignment_3 )
            // InternalWorkflowDsl.g:2929:3: rule__EventBasedInput__EventParameterNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EventBasedInput__EventParameterNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEventBasedInputAccess().getEventParameterNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBasedInput__Group__3__Impl"


    // $ANTLR start "rule__OutputData__Group__0"
    // InternalWorkflowDsl.g:2938:1: rule__OutputData__Group__0 : rule__OutputData__Group__0__Impl rule__OutputData__Group__1 ;
    public final void rule__OutputData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2942:1: ( rule__OutputData__Group__0__Impl rule__OutputData__Group__1 )
            // InternalWorkflowDsl.g:2943:2: rule__OutputData__Group__0__Impl rule__OutputData__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__OutputData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputData__Group__0"


    // $ANTLR start "rule__OutputData__Group__0__Impl"
    // InternalWorkflowDsl.g:2950:1: rule__OutputData__Group__0__Impl : ( 'output' ) ;
    public final void rule__OutputData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2954:1: ( ( 'output' ) )
            // InternalWorkflowDsl.g:2955:1: ( 'output' )
            {
            // InternalWorkflowDsl.g:2955:1: ( 'output' )
            // InternalWorkflowDsl.g:2956:2: 'output'
            {
             before(grammarAccess.getOutputDataAccess().getOutputKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getOutputDataAccess().getOutputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputData__Group__0__Impl"


    // $ANTLR start "rule__OutputData__Group__1"
    // InternalWorkflowDsl.g:2965:1: rule__OutputData__Group__1 : rule__OutputData__Group__1__Impl ;
    public final void rule__OutputData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2969:1: ( rule__OutputData__Group__1__Impl )
            // InternalWorkflowDsl.g:2970:2: rule__OutputData__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputData__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputData__Group__1"


    // $ANTLR start "rule__OutputData__Group__1__Impl"
    // InternalWorkflowDsl.g:2976:1: rule__OutputData__Group__1__Impl : ( ( rule__OutputData__ValueAssignment_1 ) ) ;
    public final void rule__OutputData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2980:1: ( ( ( rule__OutputData__ValueAssignment_1 ) ) )
            // InternalWorkflowDsl.g:2981:1: ( ( rule__OutputData__ValueAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:2981:1: ( ( rule__OutputData__ValueAssignment_1 ) )
            // InternalWorkflowDsl.g:2982:2: ( rule__OutputData__ValueAssignment_1 )
            {
             before(grammarAccess.getOutputDataAccess().getValueAssignment_1()); 
            // InternalWorkflowDsl.g:2983:2: ( rule__OutputData__ValueAssignment_1 )
            // InternalWorkflowDsl.g:2983:3: rule__OutputData__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OutputData__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputDataAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputData__Group__1__Impl"


    // $ANTLR start "rule__ConditionalConnector__Group__0"
    // InternalWorkflowDsl.g:2992:1: rule__ConditionalConnector__Group__0 : rule__ConditionalConnector__Group__0__Impl rule__ConditionalConnector__Group__1 ;
    public final void rule__ConditionalConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:2996:1: ( rule__ConditionalConnector__Group__0__Impl rule__ConditionalConnector__Group__1 )
            // InternalWorkflowDsl.g:2997:2: rule__ConditionalConnector__Group__0__Impl rule__ConditionalConnector__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ConditionalConnector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__0"


    // $ANTLR start "rule__ConditionalConnector__Group__0__Impl"
    // InternalWorkflowDsl.g:3004:1: rule__ConditionalConnector__Group__0__Impl : ( 'conditional connector' ) ;
    public final void rule__ConditionalConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3008:1: ( ( 'conditional connector' ) )
            // InternalWorkflowDsl.g:3009:1: ( 'conditional connector' )
            {
            // InternalWorkflowDsl.g:3009:1: ( 'conditional connector' )
            // InternalWorkflowDsl.g:3010:2: 'conditional connector'
            {
             before(grammarAccess.getConditionalConnectorAccess().getConditionalConnectorKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getConditionalConnectorAccess().getConditionalConnectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__0__Impl"


    // $ANTLR start "rule__ConditionalConnector__Group__1"
    // InternalWorkflowDsl.g:3019:1: rule__ConditionalConnector__Group__1 : rule__ConditionalConnector__Group__1__Impl rule__ConditionalConnector__Group__2 ;
    public final void rule__ConditionalConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3023:1: ( rule__ConditionalConnector__Group__1__Impl rule__ConditionalConnector__Group__2 )
            // InternalWorkflowDsl.g:3024:2: rule__ConditionalConnector__Group__1__Impl rule__ConditionalConnector__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ConditionalConnector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__1"


    // $ANTLR start "rule__ConditionalConnector__Group__1__Impl"
    // InternalWorkflowDsl.g:3031:1: rule__ConditionalConnector__Group__1__Impl : ( ( rule__ConditionalConnector__NameAssignment_1 ) ) ;
    public final void rule__ConditionalConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3035:1: ( ( ( rule__ConditionalConnector__NameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:3036:1: ( ( rule__ConditionalConnector__NameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:3036:1: ( ( rule__ConditionalConnector__NameAssignment_1 ) )
            // InternalWorkflowDsl.g:3037:2: ( rule__ConditionalConnector__NameAssignment_1 )
            {
             before(grammarAccess.getConditionalConnectorAccess().getNameAssignment_1()); 
            // InternalWorkflowDsl.g:3038:2: ( rule__ConditionalConnector__NameAssignment_1 )
            // InternalWorkflowDsl.g:3038:3: rule__ConditionalConnector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalConnectorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__1__Impl"


    // $ANTLR start "rule__ConditionalConnector__Group__2"
    // InternalWorkflowDsl.g:3046:1: rule__ConditionalConnector__Group__2 : rule__ConditionalConnector__Group__2__Impl rule__ConditionalConnector__Group__3 ;
    public final void rule__ConditionalConnector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3050:1: ( rule__ConditionalConnector__Group__2__Impl rule__ConditionalConnector__Group__3 )
            // InternalWorkflowDsl.g:3051:2: rule__ConditionalConnector__Group__2__Impl rule__ConditionalConnector__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ConditionalConnector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__2"


    // $ANTLR start "rule__ConditionalConnector__Group__2__Impl"
    // InternalWorkflowDsl.g:3058:1: rule__ConditionalConnector__Group__2__Impl : ( ( rule__ConditionalConnector__FromAssignment_2 ) ) ;
    public final void rule__ConditionalConnector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3062:1: ( ( ( rule__ConditionalConnector__FromAssignment_2 ) ) )
            // InternalWorkflowDsl.g:3063:1: ( ( rule__ConditionalConnector__FromAssignment_2 ) )
            {
            // InternalWorkflowDsl.g:3063:1: ( ( rule__ConditionalConnector__FromAssignment_2 ) )
            // InternalWorkflowDsl.g:3064:2: ( rule__ConditionalConnector__FromAssignment_2 )
            {
             before(grammarAccess.getConditionalConnectorAccess().getFromAssignment_2()); 
            // InternalWorkflowDsl.g:3065:2: ( rule__ConditionalConnector__FromAssignment_2 )
            // InternalWorkflowDsl.g:3065:3: rule__ConditionalConnector__FromAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__FromAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalConnectorAccess().getFromAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__2__Impl"


    // $ANTLR start "rule__ConditionalConnector__Group__3"
    // InternalWorkflowDsl.g:3073:1: rule__ConditionalConnector__Group__3 : rule__ConditionalConnector__Group__3__Impl rule__ConditionalConnector__Group__4 ;
    public final void rule__ConditionalConnector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3077:1: ( rule__ConditionalConnector__Group__3__Impl rule__ConditionalConnector__Group__4 )
            // InternalWorkflowDsl.g:3078:2: rule__ConditionalConnector__Group__3__Impl rule__ConditionalConnector__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ConditionalConnector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__3"


    // $ANTLR start "rule__ConditionalConnector__Group__3__Impl"
    // InternalWorkflowDsl.g:3085:1: rule__ConditionalConnector__Group__3__Impl : ( ( rule__ConditionalConnector__ToAssignment_3 ) ) ;
    public final void rule__ConditionalConnector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3089:1: ( ( ( rule__ConditionalConnector__ToAssignment_3 ) ) )
            // InternalWorkflowDsl.g:3090:1: ( ( rule__ConditionalConnector__ToAssignment_3 ) )
            {
            // InternalWorkflowDsl.g:3090:1: ( ( rule__ConditionalConnector__ToAssignment_3 ) )
            // InternalWorkflowDsl.g:3091:2: ( rule__ConditionalConnector__ToAssignment_3 )
            {
             before(grammarAccess.getConditionalConnectorAccess().getToAssignment_3()); 
            // InternalWorkflowDsl.g:3092:2: ( rule__ConditionalConnector__ToAssignment_3 )
            // InternalWorkflowDsl.g:3092:3: rule__ConditionalConnector__ToAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__ToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionalConnectorAccess().getToAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__3__Impl"


    // $ANTLR start "rule__ConditionalConnector__Group__4"
    // InternalWorkflowDsl.g:3100:1: rule__ConditionalConnector__Group__4 : rule__ConditionalConnector__Group__4__Impl rule__ConditionalConnector__Group__5 ;
    public final void rule__ConditionalConnector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3104:1: ( rule__ConditionalConnector__Group__4__Impl rule__ConditionalConnector__Group__5 )
            // InternalWorkflowDsl.g:3105:2: rule__ConditionalConnector__Group__4__Impl rule__ConditionalConnector__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ConditionalConnector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__4"


    // $ANTLR start "rule__ConditionalConnector__Group__4__Impl"
    // InternalWorkflowDsl.g:3112:1: rule__ConditionalConnector__Group__4__Impl : ( '{' ) ;
    public final void rule__ConditionalConnector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3116:1: ( ( '{' ) )
            // InternalWorkflowDsl.g:3117:1: ( '{' )
            {
            // InternalWorkflowDsl.g:3117:1: ( '{' )
            // InternalWorkflowDsl.g:3118:2: '{'
            {
             before(grammarAccess.getConditionalConnectorAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConditionalConnectorAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__4__Impl"


    // $ANTLR start "rule__ConditionalConnector__Group__5"
    // InternalWorkflowDsl.g:3127:1: rule__ConditionalConnector__Group__5 : rule__ConditionalConnector__Group__5__Impl rule__ConditionalConnector__Group__6 ;
    public final void rule__ConditionalConnector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3131:1: ( rule__ConditionalConnector__Group__5__Impl rule__ConditionalConnector__Group__6 )
            // InternalWorkflowDsl.g:3132:2: rule__ConditionalConnector__Group__5__Impl rule__ConditionalConnector__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ConditionalConnector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__5"


    // $ANTLR start "rule__ConditionalConnector__Group__5__Impl"
    // InternalWorkflowDsl.g:3139:1: rule__ConditionalConnector__Group__5__Impl : ( ( rule__ConditionalConnector__EventAssignment_5 ) ) ;
    public final void rule__ConditionalConnector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3143:1: ( ( ( rule__ConditionalConnector__EventAssignment_5 ) ) )
            // InternalWorkflowDsl.g:3144:1: ( ( rule__ConditionalConnector__EventAssignment_5 ) )
            {
            // InternalWorkflowDsl.g:3144:1: ( ( rule__ConditionalConnector__EventAssignment_5 ) )
            // InternalWorkflowDsl.g:3145:2: ( rule__ConditionalConnector__EventAssignment_5 )
            {
             before(grammarAccess.getConditionalConnectorAccess().getEventAssignment_5()); 
            // InternalWorkflowDsl.g:3146:2: ( rule__ConditionalConnector__EventAssignment_5 )
            // InternalWorkflowDsl.g:3146:3: rule__ConditionalConnector__EventAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__EventAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConditionalConnectorAccess().getEventAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__5__Impl"


    // $ANTLR start "rule__ConditionalConnector__Group__6"
    // InternalWorkflowDsl.g:3154:1: rule__ConditionalConnector__Group__6 : rule__ConditionalConnector__Group__6__Impl rule__ConditionalConnector__Group__7 ;
    public final void rule__ConditionalConnector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3158:1: ( rule__ConditionalConnector__Group__6__Impl rule__ConditionalConnector__Group__7 )
            // InternalWorkflowDsl.g:3159:2: rule__ConditionalConnector__Group__6__Impl rule__ConditionalConnector__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__ConditionalConnector__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__6"


    // $ANTLR start "rule__ConditionalConnector__Group__6__Impl"
    // InternalWorkflowDsl.g:3166:1: rule__ConditionalConnector__Group__6__Impl : ( ( rule__ConditionalConnector__StringBasedConditionalExpressionAssignment_6 ) ) ;
    public final void rule__ConditionalConnector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3170:1: ( ( ( rule__ConditionalConnector__StringBasedConditionalExpressionAssignment_6 ) ) )
            // InternalWorkflowDsl.g:3171:1: ( ( rule__ConditionalConnector__StringBasedConditionalExpressionAssignment_6 ) )
            {
            // InternalWorkflowDsl.g:3171:1: ( ( rule__ConditionalConnector__StringBasedConditionalExpressionAssignment_6 ) )
            // InternalWorkflowDsl.g:3172:2: ( rule__ConditionalConnector__StringBasedConditionalExpressionAssignment_6 )
            {
             before(grammarAccess.getConditionalConnectorAccess().getStringBasedConditionalExpressionAssignment_6()); 
            // InternalWorkflowDsl.g:3173:2: ( rule__ConditionalConnector__StringBasedConditionalExpressionAssignment_6 )
            // InternalWorkflowDsl.g:3173:3: rule__ConditionalConnector__StringBasedConditionalExpressionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__StringBasedConditionalExpressionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConditionalConnectorAccess().getStringBasedConditionalExpressionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__6__Impl"


    // $ANTLR start "rule__ConditionalConnector__Group__7"
    // InternalWorkflowDsl.g:3181:1: rule__ConditionalConnector__Group__7 : rule__ConditionalConnector__Group__7__Impl rule__ConditionalConnector__Group__8 ;
    public final void rule__ConditionalConnector__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3185:1: ( rule__ConditionalConnector__Group__7__Impl rule__ConditionalConnector__Group__8 )
            // InternalWorkflowDsl.g:3186:2: rule__ConditionalConnector__Group__7__Impl rule__ConditionalConnector__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__ConditionalConnector__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__7"


    // $ANTLR start "rule__ConditionalConnector__Group__7__Impl"
    // InternalWorkflowDsl.g:3193:1: rule__ConditionalConnector__Group__7__Impl : ( ( rule__ConditionalConnector__ValueAssignment_7 ) ) ;
    public final void rule__ConditionalConnector__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3197:1: ( ( ( rule__ConditionalConnector__ValueAssignment_7 ) ) )
            // InternalWorkflowDsl.g:3198:1: ( ( rule__ConditionalConnector__ValueAssignment_7 ) )
            {
            // InternalWorkflowDsl.g:3198:1: ( ( rule__ConditionalConnector__ValueAssignment_7 ) )
            // InternalWorkflowDsl.g:3199:2: ( rule__ConditionalConnector__ValueAssignment_7 )
            {
             before(grammarAccess.getConditionalConnectorAccess().getValueAssignment_7()); 
            // InternalWorkflowDsl.g:3200:2: ( rule__ConditionalConnector__ValueAssignment_7 )
            // InternalWorkflowDsl.g:3200:3: rule__ConditionalConnector__ValueAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__ValueAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConditionalConnectorAccess().getValueAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__7__Impl"


    // $ANTLR start "rule__ConditionalConnector__Group__8"
    // InternalWorkflowDsl.g:3208:1: rule__ConditionalConnector__Group__8 : rule__ConditionalConnector__Group__8__Impl ;
    public final void rule__ConditionalConnector__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3212:1: ( rule__ConditionalConnector__Group__8__Impl )
            // InternalWorkflowDsl.g:3213:2: rule__ConditionalConnector__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalConnector__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__8"


    // $ANTLR start "rule__ConditionalConnector__Group__8__Impl"
    // InternalWorkflowDsl.g:3219:1: rule__ConditionalConnector__Group__8__Impl : ( '}' ) ;
    public final void rule__ConditionalConnector__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3223:1: ( ( '}' ) )
            // InternalWorkflowDsl.g:3224:1: ( '}' )
            {
            // InternalWorkflowDsl.g:3224:1: ( '}' )
            // InternalWorkflowDsl.g:3225:2: '}'
            {
             before(grammarAccess.getConditionalConnectorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConditionalConnectorAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__Group__8__Impl"


    // $ANTLR start "rule__Test__Group__0"
    // InternalWorkflowDsl.g:3235:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3239:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalWorkflowDsl.g:3240:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // InternalWorkflowDsl.g:3247:1: rule__Test__Group__0__Impl : ( 'test' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3251:1: ( ( 'test' ) )
            // InternalWorkflowDsl.g:3252:1: ( 'test' )
            {
            // InternalWorkflowDsl.g:3252:1: ( 'test' )
            // InternalWorkflowDsl.g:3253:2: 'test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getTestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // InternalWorkflowDsl.g:3262:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3266:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalWorkflowDsl.g:3267:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // InternalWorkflowDsl.g:3274:1: rule__Test__Group__1__Impl : ( ( rule__Test__NameAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3278:1: ( ( ( rule__Test__NameAssignment_1 ) ) )
            // InternalWorkflowDsl.g:3279:1: ( ( rule__Test__NameAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:3279:1: ( ( rule__Test__NameAssignment_1 ) )
            // InternalWorkflowDsl.g:3280:2: ( rule__Test__NameAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_1()); 
            // InternalWorkflowDsl.g:3281:2: ( rule__Test__NameAssignment_1 )
            // InternalWorkflowDsl.g:3281:3: rule__Test__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Test__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // InternalWorkflowDsl.g:3289:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3293:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalWorkflowDsl.g:3294:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // InternalWorkflowDsl.g:3301:1: rule__Test__Group__2__Impl : ( '{' ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3305:1: ( ( '{' ) )
            // InternalWorkflowDsl.g:3306:1: ( '{' )
            {
            // InternalWorkflowDsl.g:3306:1: ( '{' )
            // InternalWorkflowDsl.g:3307:2: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // InternalWorkflowDsl.g:3316:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3320:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalWorkflowDsl.g:3321:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // InternalWorkflowDsl.g:3328:1: rule__Test__Group__3__Impl : ( ( rule__Test__ProcessVariablesAssignment_3 )* ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3332:1: ( ( ( rule__Test__ProcessVariablesAssignment_3 )* ) )
            // InternalWorkflowDsl.g:3333:1: ( ( rule__Test__ProcessVariablesAssignment_3 )* )
            {
            // InternalWorkflowDsl.g:3333:1: ( ( rule__Test__ProcessVariablesAssignment_3 )* )
            // InternalWorkflowDsl.g:3334:2: ( rule__Test__ProcessVariablesAssignment_3 )*
            {
             before(grammarAccess.getTestAccess().getProcessVariablesAssignment_3()); 
            // InternalWorkflowDsl.g:3335:2: ( rule__Test__ProcessVariablesAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalWorkflowDsl.g:3335:3: rule__Test__ProcessVariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Test__ProcessVariablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getProcessVariablesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__Test__Group__4"
    // InternalWorkflowDsl.g:3343:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3347:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalWorkflowDsl.g:3348:2: rule__Test__Group__4__Impl rule__Test__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Test__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4"


    // $ANTLR start "rule__Test__Group__4__Impl"
    // InternalWorkflowDsl.g:3355:1: rule__Test__Group__4__Impl : ( ( rule__Test__FireSignalAssignment_4 )* ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3359:1: ( ( ( rule__Test__FireSignalAssignment_4 )* ) )
            // InternalWorkflowDsl.g:3360:1: ( ( rule__Test__FireSignalAssignment_4 )* )
            {
            // InternalWorkflowDsl.g:3360:1: ( ( rule__Test__FireSignalAssignment_4 )* )
            // InternalWorkflowDsl.g:3361:2: ( rule__Test__FireSignalAssignment_4 )*
            {
             before(grammarAccess.getTestAccess().getFireSignalAssignment_4()); 
            // InternalWorkflowDsl.g:3362:2: ( rule__Test__FireSignalAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==36) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalWorkflowDsl.g:3362:3: rule__Test__FireSignalAssignment_4
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Test__FireSignalAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getFireSignalAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4__Impl"


    // $ANTLR start "rule__Test__Group__5"
    // InternalWorkflowDsl.g:3370:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3374:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalWorkflowDsl.g:3375:2: rule__Test__Group__5__Impl rule__Test__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Test__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5"


    // $ANTLR start "rule__Test__Group__5__Impl"
    // InternalWorkflowDsl.g:3382:1: rule__Test__Group__5__Impl : ( ( rule__Test__AssertFlowAssignment_5 )* ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3386:1: ( ( ( rule__Test__AssertFlowAssignment_5 )* ) )
            // InternalWorkflowDsl.g:3387:1: ( ( rule__Test__AssertFlowAssignment_5 )* )
            {
            // InternalWorkflowDsl.g:3387:1: ( ( rule__Test__AssertFlowAssignment_5 )* )
            // InternalWorkflowDsl.g:3388:2: ( rule__Test__AssertFlowAssignment_5 )*
            {
             before(grammarAccess.getTestAccess().getAssertFlowAssignment_5()); 
            // InternalWorkflowDsl.g:3389:2: ( rule__Test__AssertFlowAssignment_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalWorkflowDsl.g:3389:3: rule__Test__AssertFlowAssignment_5
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Test__AssertFlowAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getAssertFlowAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5__Impl"


    // $ANTLR start "rule__Test__Group__6"
    // InternalWorkflowDsl.g:3397:1: rule__Test__Group__6 : rule__Test__Group__6__Impl rule__Test__Group__7 ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3401:1: ( rule__Test__Group__6__Impl rule__Test__Group__7 )
            // InternalWorkflowDsl.g:3402:2: rule__Test__Group__6__Impl rule__Test__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Test__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6"


    // $ANTLR start "rule__Test__Group__6__Impl"
    // InternalWorkflowDsl.g:3409:1: rule__Test__Group__6__Impl : ( ( rule__Test__AssertWaitAssignment_6 )* ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3413:1: ( ( ( rule__Test__AssertWaitAssignment_6 )* ) )
            // InternalWorkflowDsl.g:3414:1: ( ( rule__Test__AssertWaitAssignment_6 )* )
            {
            // InternalWorkflowDsl.g:3414:1: ( ( rule__Test__AssertWaitAssignment_6 )* )
            // InternalWorkflowDsl.g:3415:2: ( rule__Test__AssertWaitAssignment_6 )*
            {
             before(grammarAccess.getTestAccess().getAssertWaitAssignment_6()); 
            // InternalWorkflowDsl.g:3416:2: ( rule__Test__AssertWaitAssignment_6 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalWorkflowDsl.g:3416:3: rule__Test__AssertWaitAssignment_6
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Test__AssertWaitAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getAssertWaitAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6__Impl"


    // $ANTLR start "rule__Test__Group__7"
    // InternalWorkflowDsl.g:3424:1: rule__Test__Group__7 : rule__Test__Group__7__Impl ;
    public final void rule__Test__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3428:1: ( rule__Test__Group__7__Impl )
            // InternalWorkflowDsl.g:3429:2: rule__Test__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__7"


    // $ANTLR start "rule__Test__Group__7__Impl"
    // InternalWorkflowDsl.g:3435:1: rule__Test__Group__7__Impl : ( '}' ) ;
    public final void rule__Test__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3439:1: ( ( '}' ) )
            // InternalWorkflowDsl.g:3440:1: ( '}' )
            {
            // InternalWorkflowDsl.g:3440:1: ( '}' )
            // InternalWorkflowDsl.g:3441:2: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__7__Impl"


    // $ANTLR start "rule__ProcessVariable__Group__0"
    // InternalWorkflowDsl.g:3451:1: rule__ProcessVariable__Group__0 : rule__ProcessVariable__Group__0__Impl rule__ProcessVariable__Group__1 ;
    public final void rule__ProcessVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3455:1: ( rule__ProcessVariable__Group__0__Impl rule__ProcessVariable__Group__1 )
            // InternalWorkflowDsl.g:3456:2: rule__ProcessVariable__Group__0__Impl rule__ProcessVariable__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ProcessVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessVariable__Group__0"


    // $ANTLR start "rule__ProcessVariable__Group__0__Impl"
    // InternalWorkflowDsl.g:3463:1: rule__ProcessVariable__Group__0__Impl : ( 'process variable' ) ;
    public final void rule__ProcessVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3467:1: ( ( 'process variable' ) )
            // InternalWorkflowDsl.g:3468:1: ( 'process variable' )
            {
            // InternalWorkflowDsl.g:3468:1: ( 'process variable' )
            // InternalWorkflowDsl.g:3469:2: 'process variable'
            {
             before(grammarAccess.getProcessVariableAccess().getProcessVariableKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProcessVariableAccess().getProcessVariableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessVariable__Group__0__Impl"


    // $ANTLR start "rule__ProcessVariable__Group__1"
    // InternalWorkflowDsl.g:3478:1: rule__ProcessVariable__Group__1 : rule__ProcessVariable__Group__1__Impl rule__ProcessVariable__Group__2 ;
    public final void rule__ProcessVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3482:1: ( rule__ProcessVariable__Group__1__Impl rule__ProcessVariable__Group__2 )
            // InternalWorkflowDsl.g:3483:2: rule__ProcessVariable__Group__1__Impl rule__ProcessVariable__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ProcessVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProcessVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessVariable__Group__1"


    // $ANTLR start "rule__ProcessVariable__Group__1__Impl"
    // InternalWorkflowDsl.g:3490:1: rule__ProcessVariable__Group__1__Impl : ( ( rule__ProcessVariable__VariableAssignment_1 ) ) ;
    public final void rule__ProcessVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3494:1: ( ( ( rule__ProcessVariable__VariableAssignment_1 ) ) )
            // InternalWorkflowDsl.g:3495:1: ( ( rule__ProcessVariable__VariableAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:3495:1: ( ( rule__ProcessVariable__VariableAssignment_1 ) )
            // InternalWorkflowDsl.g:3496:2: ( rule__ProcessVariable__VariableAssignment_1 )
            {
             before(grammarAccess.getProcessVariableAccess().getVariableAssignment_1()); 
            // InternalWorkflowDsl.g:3497:2: ( rule__ProcessVariable__VariableAssignment_1 )
            // InternalWorkflowDsl.g:3497:3: rule__ProcessVariable__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProcessVariable__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessVariableAccess().getVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessVariable__Group__1__Impl"


    // $ANTLR start "rule__ProcessVariable__Group__2"
    // InternalWorkflowDsl.g:3505:1: rule__ProcessVariable__Group__2 : rule__ProcessVariable__Group__2__Impl ;
    public final void rule__ProcessVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3509:1: ( rule__ProcessVariable__Group__2__Impl )
            // InternalWorkflowDsl.g:3510:2: rule__ProcessVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProcessVariable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessVariable__Group__2"


    // $ANTLR start "rule__ProcessVariable__Group__2__Impl"
    // InternalWorkflowDsl.g:3516:1: rule__ProcessVariable__Group__2__Impl : ( ( rule__ProcessVariable__ValueAssignment_2 ) ) ;
    public final void rule__ProcessVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3520:1: ( ( ( rule__ProcessVariable__ValueAssignment_2 ) ) )
            // InternalWorkflowDsl.g:3521:1: ( ( rule__ProcessVariable__ValueAssignment_2 ) )
            {
            // InternalWorkflowDsl.g:3521:1: ( ( rule__ProcessVariable__ValueAssignment_2 ) )
            // InternalWorkflowDsl.g:3522:2: ( rule__ProcessVariable__ValueAssignment_2 )
            {
             before(grammarAccess.getProcessVariableAccess().getValueAssignment_2()); 
            // InternalWorkflowDsl.g:3523:2: ( rule__ProcessVariable__ValueAssignment_2 )
            // InternalWorkflowDsl.g:3523:3: rule__ProcessVariable__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProcessVariable__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessVariableAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessVariable__Group__2__Impl"


    // $ANTLR start "rule__FireSignal__Group__0"
    // InternalWorkflowDsl.g:3532:1: rule__FireSignal__Group__0 : rule__FireSignal__Group__0__Impl rule__FireSignal__Group__1 ;
    public final void rule__FireSignal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3536:1: ( rule__FireSignal__Group__0__Impl rule__FireSignal__Group__1 )
            // InternalWorkflowDsl.g:3537:2: rule__FireSignal__Group__0__Impl rule__FireSignal__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__FireSignal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FireSignal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireSignal__Group__0"


    // $ANTLR start "rule__FireSignal__Group__0__Impl"
    // InternalWorkflowDsl.g:3544:1: rule__FireSignal__Group__0__Impl : ( 'fire signal' ) ;
    public final void rule__FireSignal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3548:1: ( ( 'fire signal' ) )
            // InternalWorkflowDsl.g:3549:1: ( 'fire signal' )
            {
            // InternalWorkflowDsl.g:3549:1: ( 'fire signal' )
            // InternalWorkflowDsl.g:3550:2: 'fire signal'
            {
             before(grammarAccess.getFireSignalAccess().getFireSignalKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFireSignalAccess().getFireSignalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireSignal__Group__0__Impl"


    // $ANTLR start "rule__FireSignal__Group__1"
    // InternalWorkflowDsl.g:3559:1: rule__FireSignal__Group__1 : rule__FireSignal__Group__1__Impl rule__FireSignal__Group__2 ;
    public final void rule__FireSignal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3563:1: ( rule__FireSignal__Group__1__Impl rule__FireSignal__Group__2 )
            // InternalWorkflowDsl.g:3564:2: rule__FireSignal__Group__1__Impl rule__FireSignal__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__FireSignal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FireSignal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireSignal__Group__1"


    // $ANTLR start "rule__FireSignal__Group__1__Impl"
    // InternalWorkflowDsl.g:3571:1: rule__FireSignal__Group__1__Impl : ( ( rule__FireSignal__FireSignalAssignment_1 ) ) ;
    public final void rule__FireSignal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3575:1: ( ( ( rule__FireSignal__FireSignalAssignment_1 ) ) )
            // InternalWorkflowDsl.g:3576:1: ( ( rule__FireSignal__FireSignalAssignment_1 ) )
            {
            // InternalWorkflowDsl.g:3576:1: ( ( rule__FireSignal__FireSignalAssignment_1 ) )
            // InternalWorkflowDsl.g:3577:2: ( rule__FireSignal__FireSignalAssignment_1 )
            {
             before(grammarAccess.getFireSignalAccess().getFireSignalAssignment_1()); 
            // InternalWorkflowDsl.g:3578:2: ( rule__FireSignal__FireSignalAssignment_1 )
            // InternalWorkflowDsl.g:3578:3: rule__FireSignal__FireSignalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FireSignal__FireSignalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFireSignalAccess().getFireSignalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireSignal__Group__1__Impl"


    // $ANTLR start "rule__FireSignal__Group__2"
    // InternalWorkflowDsl.g:3586:1: rule__FireSignal__Group__2 : rule__FireSignal__Group__2__Impl rule__FireSignal__Group__3 ;
    public final void rule__FireSignal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3590:1: ( rule__FireSignal__Group__2__Impl rule__FireSignal__Group__3 )
            // InternalWorkflowDsl.g:3591:2: rule__FireSignal__Group__2__Impl rule__FireSignal__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__FireSignal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FireSignal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireSignal__Group__2"


    // $ANTLR start "rule__FireSignal__Group__2__Impl"
    // InternalWorkflowDsl.g:3598:1: rule__FireSignal__Group__2__Impl : ( '{' ) ;
    public final void rule__FireSignal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3602:1: ( ( '{' ) )
            // InternalWorkflowDsl.g:3603:1: ( '{' )
            {
            // InternalWorkflowDsl.g:3603:1: ( '{' )
            // InternalWorkflowDsl.g:3604:2: '{'
            {
             before(grammarAccess.getFireSignalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFireSignalAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireSignal__Group__2__Impl"


    // $ANTLR start "rule__FireSignal__Group__3"
    // InternalWorkflowDsl.g:3613:1: rule__FireSignal__Group__3 : rule__FireSignal__Group__3__Impl rule__FireSignal__Group__4 ;
    public final void rule__FireSignal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3617:1: ( rule__FireSignal__Group__3__Impl rule__FireSignal__Group__4 )
            // InternalWorkflowDsl.g:3618:2: rule__FireSignal__Group__3__Impl rule__FireSignal__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__FireSignal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FireSignal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireSignal__Group__3"


    // $ANTLR start "rule__FireSignal__Group__3__Impl"
    // InternalWorkflowDsl.g:3625:1: rule__FireSignal__Group__3__Impl : ( ( rule__FireSignal__CaseAssignment_3 )? ) ;
    public final void rule__FireSignal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3629:1: ( ( ( rule__FireSignal__CaseAssignment_3 )? ) )
            // InternalWorkflowDsl.g:3630:1: ( ( rule__FireSignal__CaseAssignment_3 )? )
            {
            // InternalWorkflowDsl.g:3630:1: ( ( rule__FireSignal__CaseAssignment_3 )? )
            // InternalWorkflowDsl.g:3631:2: ( rule__FireSignal__CaseAssignment_3 )?
            {
             before(grammarAccess.getFireSignalAccess().getCaseAssignment_3()); 
            // InternalWorkflowDsl.g:3632:2: ( rule__FireSignal__CaseAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalWorkflowDsl.g:3632:3: rule__FireSignal__CaseAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FireSignal__CaseAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFireSignalAccess().getCaseAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireSignal__Group__3__Impl"


    // $ANTLR start "rule__FireSignal__Group__4"
    // InternalWorkflowDsl.g:3640:1: rule__FireSignal__Group__4 : rule__FireSignal__Group__4__Impl ;
    public final void rule__FireSignal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3644:1: ( rule__FireSignal__Group__4__Impl )
            // InternalWorkflowDsl.g:3645:2: rule__FireSignal__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FireSignal__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireSignal__Group__4"


    // $ANTLR start "rule__FireSignal__Group__4__Impl"
    // InternalWorkflowDsl.g:3651:1: rule__FireSignal__Group__4__Impl : ( '}' ) ;
    public final void rule__FireSignal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3655:1: ( ( '}' ) )
            // InternalWorkflowDsl.g:3656:1: ( '}' )
            {
            // InternalWorkflowDsl.g:3656:1: ( '}' )
            // InternalWorkflowDsl.g:3657:2: '}'
            {
             before(grammarAccess.getFireSignalAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFireSignalAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireSignal__Group__4__Impl"


    // $ANTLR start "rule__AssertFlow__Group__0"
    // InternalWorkflowDsl.g:3667:1: rule__AssertFlow__Group__0 : rule__AssertFlow__Group__0__Impl rule__AssertFlow__Group__1 ;
    public final void rule__AssertFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3671:1: ( rule__AssertFlow__Group__0__Impl rule__AssertFlow__Group__1 )
            // InternalWorkflowDsl.g:3672:2: rule__AssertFlow__Group__0__Impl rule__AssertFlow__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__AssertFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertFlow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertFlow__Group__0"


    // $ANTLR start "rule__AssertFlow__Group__0__Impl"
    // InternalWorkflowDsl.g:3679:1: rule__AssertFlow__Group__0__Impl : ( 'assertflow' ) ;
    public final void rule__AssertFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3683:1: ( ( 'assertflow' ) )
            // InternalWorkflowDsl.g:3684:1: ( 'assertflow' )
            {
            // InternalWorkflowDsl.g:3684:1: ( 'assertflow' )
            // InternalWorkflowDsl.g:3685:2: 'assertflow'
            {
             before(grammarAccess.getAssertFlowAccess().getAssertflowKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAssertFlowAccess().getAssertflowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertFlow__Group__0__Impl"


    // $ANTLR start "rule__AssertFlow__Group__1"
    // InternalWorkflowDsl.g:3694:1: rule__AssertFlow__Group__1 : rule__AssertFlow__Group__1__Impl rule__AssertFlow__Group__2 ;
    public final void rule__AssertFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3698:1: ( rule__AssertFlow__Group__1__Impl rule__AssertFlow__Group__2 )
            // InternalWorkflowDsl.g:3699:2: rule__AssertFlow__Group__1__Impl rule__AssertFlow__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AssertFlow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertFlow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertFlow__Group__1"


    // $ANTLR start "rule__AssertFlow__Group__1__Impl"
    // InternalWorkflowDsl.g:3706:1: rule__AssertFlow__Group__1__Impl : ( '{' ) ;
    public final void rule__AssertFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3710:1: ( ( '{' ) )
            // InternalWorkflowDsl.g:3711:1: ( '{' )
            {
            // InternalWorkflowDsl.g:3711:1: ( '{' )
            // InternalWorkflowDsl.g:3712:2: '{'
            {
             before(grammarAccess.getAssertFlowAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAssertFlowAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertFlow__Group__1__Impl"


    // $ANTLR start "rule__AssertFlow__Group__2"
    // InternalWorkflowDsl.g:3721:1: rule__AssertFlow__Group__2 : rule__AssertFlow__Group__2__Impl rule__AssertFlow__Group__3 ;
    public final void rule__AssertFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3725:1: ( rule__AssertFlow__Group__2__Impl rule__AssertFlow__Group__3 )
            // InternalWorkflowDsl.g:3726:2: rule__AssertFlow__Group__2__Impl rule__AssertFlow__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__AssertFlow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertFlow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertFlow__Group__2"


    // $ANTLR start "rule__AssertFlow__Group__2__Impl"
    // InternalWorkflowDsl.g:3733:1: rule__AssertFlow__Group__2__Impl : ( ( ( rule__AssertFlow__NodesAssignment_2 ) ) ( ( rule__AssertFlow__NodesAssignment_2 )* ) ) ;
    public final void rule__AssertFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3737:1: ( ( ( ( rule__AssertFlow__NodesAssignment_2 ) ) ( ( rule__AssertFlow__NodesAssignment_2 )* ) ) )
            // InternalWorkflowDsl.g:3738:1: ( ( ( rule__AssertFlow__NodesAssignment_2 ) ) ( ( rule__AssertFlow__NodesAssignment_2 )* ) )
            {
            // InternalWorkflowDsl.g:3738:1: ( ( ( rule__AssertFlow__NodesAssignment_2 ) ) ( ( rule__AssertFlow__NodesAssignment_2 )* ) )
            // InternalWorkflowDsl.g:3739:2: ( ( rule__AssertFlow__NodesAssignment_2 ) ) ( ( rule__AssertFlow__NodesAssignment_2 )* )
            {
            // InternalWorkflowDsl.g:3739:2: ( ( rule__AssertFlow__NodesAssignment_2 ) )
            // InternalWorkflowDsl.g:3740:3: ( rule__AssertFlow__NodesAssignment_2 )
            {
             before(grammarAccess.getAssertFlowAccess().getNodesAssignment_2()); 
            // InternalWorkflowDsl.g:3741:3: ( rule__AssertFlow__NodesAssignment_2 )
            // InternalWorkflowDsl.g:3741:4: rule__AssertFlow__NodesAssignment_2
            {
            pushFollow(FOLLOW_29);
            rule__AssertFlow__NodesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssertFlowAccess().getNodesAssignment_2()); 

            }

            // InternalWorkflowDsl.g:3744:2: ( ( rule__AssertFlow__NodesAssignment_2 )* )
            // InternalWorkflowDsl.g:3745:3: ( rule__AssertFlow__NodesAssignment_2 )*
            {
             before(grammarAccess.getAssertFlowAccess().getNodesAssignment_2()); 
            // InternalWorkflowDsl.g:3746:3: ( rule__AssertFlow__NodesAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalWorkflowDsl.g:3746:4: rule__AssertFlow__NodesAssignment_2
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__AssertFlow__NodesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAssertFlowAccess().getNodesAssignment_2()); 

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
    // $ANTLR end "rule__AssertFlow__Group__2__Impl"


    // $ANTLR start "rule__AssertFlow__Group__3"
    // InternalWorkflowDsl.g:3755:1: rule__AssertFlow__Group__3 : rule__AssertFlow__Group__3__Impl ;
    public final void rule__AssertFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3759:1: ( rule__AssertFlow__Group__3__Impl )
            // InternalWorkflowDsl.g:3760:2: rule__AssertFlow__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssertFlow__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertFlow__Group__3"


    // $ANTLR start "rule__AssertFlow__Group__3__Impl"
    // InternalWorkflowDsl.g:3766:1: rule__AssertFlow__Group__3__Impl : ( '}' ) ;
    public final void rule__AssertFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3770:1: ( ( '}' ) )
            // InternalWorkflowDsl.g:3771:1: ( '}' )
            {
            // InternalWorkflowDsl.g:3771:1: ( '}' )
            // InternalWorkflowDsl.g:3772:2: '}'
            {
             before(grammarAccess.getAssertFlowAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAssertFlowAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertFlow__Group__3__Impl"


    // $ANTLR start "rule__AssertWait__Group__0"
    // InternalWorkflowDsl.g:3782:1: rule__AssertWait__Group__0 : rule__AssertWait__Group__0__Impl rule__AssertWait__Group__1 ;
    public final void rule__AssertWait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3786:1: ( rule__AssertWait__Group__0__Impl rule__AssertWait__Group__1 )
            // InternalWorkflowDsl.g:3787:2: rule__AssertWait__Group__0__Impl rule__AssertWait__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__AssertWait__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertWait__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertWait__Group__0"


    // $ANTLR start "rule__AssertWait__Group__0__Impl"
    // InternalWorkflowDsl.g:3794:1: rule__AssertWait__Group__0__Impl : ( 'assertWait' ) ;
    public final void rule__AssertWait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3798:1: ( ( 'assertWait' ) )
            // InternalWorkflowDsl.g:3799:1: ( 'assertWait' )
            {
            // InternalWorkflowDsl.g:3799:1: ( 'assertWait' )
            // InternalWorkflowDsl.g:3800:2: 'assertWait'
            {
             before(grammarAccess.getAssertWaitAccess().getAssertWaitKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAssertWaitAccess().getAssertWaitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertWait__Group__0__Impl"


    // $ANTLR start "rule__AssertWait__Group__1"
    // InternalWorkflowDsl.g:3809:1: rule__AssertWait__Group__1 : rule__AssertWait__Group__1__Impl rule__AssertWait__Group__2 ;
    public final void rule__AssertWait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3813:1: ( rule__AssertWait__Group__1__Impl rule__AssertWait__Group__2 )
            // InternalWorkflowDsl.g:3814:2: rule__AssertWait__Group__1__Impl rule__AssertWait__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AssertWait__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertWait__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertWait__Group__1"


    // $ANTLR start "rule__AssertWait__Group__1__Impl"
    // InternalWorkflowDsl.g:3821:1: rule__AssertWait__Group__1__Impl : ( '{' ) ;
    public final void rule__AssertWait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3825:1: ( ( '{' ) )
            // InternalWorkflowDsl.g:3826:1: ( '{' )
            {
            // InternalWorkflowDsl.g:3826:1: ( '{' )
            // InternalWorkflowDsl.g:3827:2: '{'
            {
             before(grammarAccess.getAssertWaitAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAssertWaitAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertWait__Group__1__Impl"


    // $ANTLR start "rule__AssertWait__Group__2"
    // InternalWorkflowDsl.g:3836:1: rule__AssertWait__Group__2 : rule__AssertWait__Group__2__Impl rule__AssertWait__Group__3 ;
    public final void rule__AssertWait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3840:1: ( rule__AssertWait__Group__2__Impl rule__AssertWait__Group__3 )
            // InternalWorkflowDsl.g:3841:2: rule__AssertWait__Group__2__Impl rule__AssertWait__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__AssertWait__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertWait__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertWait__Group__2"


    // $ANTLR start "rule__AssertWait__Group__2__Impl"
    // InternalWorkflowDsl.g:3848:1: rule__AssertWait__Group__2__Impl : ( ( ( rule__AssertWait__NodesAssignment_2 ) ) ( ( rule__AssertWait__NodesAssignment_2 )* ) ) ;
    public final void rule__AssertWait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3852:1: ( ( ( ( rule__AssertWait__NodesAssignment_2 ) ) ( ( rule__AssertWait__NodesAssignment_2 )* ) ) )
            // InternalWorkflowDsl.g:3853:1: ( ( ( rule__AssertWait__NodesAssignment_2 ) ) ( ( rule__AssertWait__NodesAssignment_2 )* ) )
            {
            // InternalWorkflowDsl.g:3853:1: ( ( ( rule__AssertWait__NodesAssignment_2 ) ) ( ( rule__AssertWait__NodesAssignment_2 )* ) )
            // InternalWorkflowDsl.g:3854:2: ( ( rule__AssertWait__NodesAssignment_2 ) ) ( ( rule__AssertWait__NodesAssignment_2 )* )
            {
            // InternalWorkflowDsl.g:3854:2: ( ( rule__AssertWait__NodesAssignment_2 ) )
            // InternalWorkflowDsl.g:3855:3: ( rule__AssertWait__NodesAssignment_2 )
            {
             before(grammarAccess.getAssertWaitAccess().getNodesAssignment_2()); 
            // InternalWorkflowDsl.g:3856:3: ( rule__AssertWait__NodesAssignment_2 )
            // InternalWorkflowDsl.g:3856:4: rule__AssertWait__NodesAssignment_2
            {
            pushFollow(FOLLOW_29);
            rule__AssertWait__NodesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssertWaitAccess().getNodesAssignment_2()); 

            }

            // InternalWorkflowDsl.g:3859:2: ( ( rule__AssertWait__NodesAssignment_2 )* )
            // InternalWorkflowDsl.g:3860:3: ( rule__AssertWait__NodesAssignment_2 )*
            {
             before(grammarAccess.getAssertWaitAccess().getNodesAssignment_2()); 
            // InternalWorkflowDsl.g:3861:3: ( rule__AssertWait__NodesAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalWorkflowDsl.g:3861:4: rule__AssertWait__NodesAssignment_2
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__AssertWait__NodesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getAssertWaitAccess().getNodesAssignment_2()); 

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
    // $ANTLR end "rule__AssertWait__Group__2__Impl"


    // $ANTLR start "rule__AssertWait__Group__3"
    // InternalWorkflowDsl.g:3870:1: rule__AssertWait__Group__3 : rule__AssertWait__Group__3__Impl ;
    public final void rule__AssertWait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3874:1: ( rule__AssertWait__Group__3__Impl )
            // InternalWorkflowDsl.g:3875:2: rule__AssertWait__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssertWait__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertWait__Group__3"


    // $ANTLR start "rule__AssertWait__Group__3__Impl"
    // InternalWorkflowDsl.g:3881:1: rule__AssertWait__Group__3__Impl : ( '}' ) ;
    public final void rule__AssertWait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3885:1: ( ( '}' ) )
            // InternalWorkflowDsl.g:3886:1: ( '}' )
            {
            // InternalWorkflowDsl.g:3886:1: ( '}' )
            // InternalWorkflowDsl.g:3887:2: '}'
            {
             before(grammarAccess.getAssertWaitAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAssertWaitAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertWait__Group__3__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0"
    // InternalWorkflowDsl.g:3897:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3901:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // InternalWorkflowDsl.g:3902:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildCard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0__Impl"
    // InternalWorkflowDsl.g:3909:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3913:1: ( ( ruleQualifiedName ) )
            // InternalWorkflowDsl.g:3914:1: ( ruleQualifiedName )
            {
            // InternalWorkflowDsl.g:3914:1: ( ruleQualifiedName )
            // InternalWorkflowDsl.g:3915:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1"
    // InternalWorkflowDsl.g:3924:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3928:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // InternalWorkflowDsl.g:3929:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildCard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1__Impl"
    // InternalWorkflowDsl.g:3935:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3939:1: ( ( ( '.*' )? ) )
            // InternalWorkflowDsl.g:3940:1: ( ( '.*' )? )
            {
            // InternalWorkflowDsl.g:3940:1: ( ( '.*' )? )
            // InternalWorkflowDsl.g:3941:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalWorkflowDsl.g:3942:2: ( '.*' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalWorkflowDsl.g:3942:3: '.*'
                    {
                    match(input,39,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalWorkflowDsl.g:3951:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3955:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalWorkflowDsl.g:3956:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalWorkflowDsl.g:3963:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3967:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:3968:1: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:3968:1: ( RULE_ID )
            // InternalWorkflowDsl.g:3969:2: RULE_ID
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
    // InternalWorkflowDsl.g:3978:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3982:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalWorkflowDsl.g:3983:2: rule__QualifiedName__Group__1__Impl
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
    // InternalWorkflowDsl.g:3989:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:3993:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalWorkflowDsl.g:3994:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalWorkflowDsl.g:3994:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalWorkflowDsl.g:3995:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalWorkflowDsl.g:3996:2: ( rule__QualifiedName__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalWorkflowDsl.g:3996:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalWorkflowDsl.g:4005:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4009:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalWorkflowDsl.g:4010:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalWorkflowDsl.g:4017:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4021:1: ( ( '.' ) )
            // InternalWorkflowDsl.g:4022:1: ( '.' )
            {
            // InternalWorkflowDsl.g:4022:1: ( '.' )
            // InternalWorkflowDsl.g:4023:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalWorkflowDsl.g:4032:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4036:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalWorkflowDsl.g:4037:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalWorkflowDsl.g:4043:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4047:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4048:1: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4048:1: ( RULE_ID )
            // InternalWorkflowDsl.g:4049:2: RULE_ID
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


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // InternalWorkflowDsl.g:4059:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4063:1: ( ( ruleImport ) )
            // InternalWorkflowDsl.g:4064:2: ( ruleImport )
            {
            // InternalWorkflowDsl.g:4064:2: ( ruleImport )
            // InternalWorkflowDsl.g:4065:3: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__WorkflowDefinitionsAssignment_1"
    // InternalWorkflowDsl.g:4074:1: rule__Model__WorkflowDefinitionsAssignment_1 : ( ruleWorkflowDefinition ) ;
    public final void rule__Model__WorkflowDefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4078:1: ( ( ruleWorkflowDefinition ) )
            // InternalWorkflowDsl.g:4079:2: ( ruleWorkflowDefinition )
            {
            // InternalWorkflowDsl.g:4079:2: ( ruleWorkflowDefinition )
            // InternalWorkflowDsl.g:4080:3: ruleWorkflowDefinition
            {
             before(grammarAccess.getModelAccess().getWorkflowDefinitionsWorkflowDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkflowDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getWorkflowDefinitionsWorkflowDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__WorkflowDefinitionsAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalWorkflowDsl.g:4089:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4093:1: ( ( ruleQualifiedNameWithWildCard ) )
            // InternalWorkflowDsl.g:4094:2: ( ruleQualifiedNameWithWildCard )
            {
            // InternalWorkflowDsl.g:4094:2: ( ruleQualifiedNameWithWildCard )
            // InternalWorkflowDsl.g:4095:3: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildCard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__WorkflowDefinition__NameAssignment_1"
    // InternalWorkflowDsl.g:4104:1: rule__WorkflowDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkflowDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4108:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4109:2: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4109:2: ( RULE_ID )
            // InternalWorkflowDsl.g:4110:3: RULE_ID
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkflowDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__NameAssignment_1"


    // $ANTLR start "rule__WorkflowDefinition__ClassNameAssignment_3"
    // InternalWorkflowDsl.g:4119:1: rule__WorkflowDefinition__ClassNameAssignment_3 : ( ruleClassName ) ;
    public final void rule__WorkflowDefinition__ClassNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4123:1: ( ( ruleClassName ) )
            // InternalWorkflowDsl.g:4124:2: ( ruleClassName )
            {
            // InternalWorkflowDsl.g:4124:2: ( ruleClassName )
            // InternalWorkflowDsl.g:4125:3: ruleClassName
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getClassNameClassNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getWorkflowDefinitionAccess().getClassNameClassNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__ClassNameAssignment_3"


    // $ANTLR start "rule__WorkflowDefinition__PackagesAssignment_4"
    // InternalWorkflowDsl.g:4134:1: rule__WorkflowDefinition__PackagesAssignment_4 : ( rulePackage ) ;
    public final void rule__WorkflowDefinition__PackagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4138:1: ( ( rulePackage ) )
            // InternalWorkflowDsl.g:4139:2: ( rulePackage )
            {
            // InternalWorkflowDsl.g:4139:2: ( rulePackage )
            // InternalWorkflowDsl.g:4140:3: rulePackage
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getPackagesPackageParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getWorkflowDefinitionAccess().getPackagesPackageParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__PackagesAssignment_4"


    // $ANTLR start "rule__WorkflowDefinition__EventsAssignment_5"
    // InternalWorkflowDsl.g:4149:1: rule__WorkflowDefinition__EventsAssignment_5 : ( ruleEvent ) ;
    public final void rule__WorkflowDefinition__EventsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4153:1: ( ( ruleEvent ) )
            // InternalWorkflowDsl.g:4154:2: ( ruleEvent )
            {
            // InternalWorkflowDsl.g:4154:2: ( ruleEvent )
            // InternalWorkflowDsl.g:4155:3: ruleEvent
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getEventsEventParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getWorkflowDefinitionAccess().getEventsEventParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__EventsAssignment_5"


    // $ANTLR start "rule__WorkflowDefinition__VariablesAssignment_6"
    // InternalWorkflowDsl.g:4164:1: rule__WorkflowDefinition__VariablesAssignment_6 : ( ruleVariable ) ;
    public final void rule__WorkflowDefinition__VariablesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4168:1: ( ( ruleVariable ) )
            // InternalWorkflowDsl.g:4169:2: ( ruleVariable )
            {
            // InternalWorkflowDsl.g:4169:2: ( ruleVariable )
            // InternalWorkflowDsl.g:4170:3: ruleVariable
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getVariablesVariableParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getWorkflowDefinitionAccess().getVariablesVariableParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__VariablesAssignment_6"


    // $ANTLR start "rule__WorkflowDefinition__NodesAssignment_7"
    // InternalWorkflowDsl.g:4179:1: rule__WorkflowDefinition__NodesAssignment_7 : ( ruleNode ) ;
    public final void rule__WorkflowDefinition__NodesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4183:1: ( ( ruleNode ) )
            // InternalWorkflowDsl.g:4184:2: ( ruleNode )
            {
            // InternalWorkflowDsl.g:4184:2: ( ruleNode )
            // InternalWorkflowDsl.g:4185:3: ruleNode
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getNodesNodeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getWorkflowDefinitionAccess().getNodesNodeParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__NodesAssignment_7"


    // $ANTLR start "rule__WorkflowDefinition__ConnectorsAssignment_8"
    // InternalWorkflowDsl.g:4194:1: rule__WorkflowDefinition__ConnectorsAssignment_8 : ( ruleConnector ) ;
    public final void rule__WorkflowDefinition__ConnectorsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4198:1: ( ( ruleConnector ) )
            // InternalWorkflowDsl.g:4199:2: ( ruleConnector )
            {
            // InternalWorkflowDsl.g:4199:2: ( ruleConnector )
            // InternalWorkflowDsl.g:4200:3: ruleConnector
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getConnectorsConnectorParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getWorkflowDefinitionAccess().getConnectorsConnectorParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__ConnectorsAssignment_8"


    // $ANTLR start "rule__WorkflowDefinition__TestsAssignment_9"
    // InternalWorkflowDsl.g:4209:1: rule__WorkflowDefinition__TestsAssignment_9 : ( ruleTest ) ;
    public final void rule__WorkflowDefinition__TestsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4213:1: ( ( ruleTest ) )
            // InternalWorkflowDsl.g:4214:2: ( ruleTest )
            {
            // InternalWorkflowDsl.g:4214:2: ( ruleTest )
            // InternalWorkflowDsl.g:4215:3: ruleTest
            {
             before(grammarAccess.getWorkflowDefinitionAccess().getTestsTestParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getWorkflowDefinitionAccess().getTestsTestParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkflowDefinition__TestsAssignment_9"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // InternalWorkflowDsl.g:4224:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4228:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4229:2: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4229:2: ( RULE_ID )
            // InternalWorkflowDsl.g:4230:3: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__ClassName__ClassNameAssignment_1"
    // InternalWorkflowDsl.g:4239:1: rule__ClassName__ClassNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ClassName__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4243:1: ( ( RULE_STRING ) )
            // InternalWorkflowDsl.g:4244:2: ( RULE_STRING )
            {
            // InternalWorkflowDsl.g:4244:2: ( RULE_STRING )
            // InternalWorkflowDsl.g:4245:3: RULE_STRING
            {
             before(grammarAccess.getClassNameAccess().getClassNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClassNameAccess().getClassNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassName__ClassNameAssignment_1"


    // $ANTLR start "rule__Event__NameAssignment_1"
    // InternalWorkflowDsl.g:4254:1: rule__Event__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4258:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4259:2: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4259:2: ( RULE_ID )
            // InternalWorkflowDsl.g:4260:3: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_1"


    // $ANTLR start "rule__StringBasedConditionalVaraible__NameAssignment_1"
    // InternalWorkflowDsl.g:4269:1: rule__StringBasedConditionalVaraible__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringBasedConditionalVaraible__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4273:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4274:2: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4274:2: ( RULE_ID )
            // InternalWorkflowDsl.g:4275:3: RULE_ID
            {
             before(grammarAccess.getStringBasedConditionalVaraibleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringBasedConditionalVaraibleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasedConditionalVaraible__NameAssignment_1"


    // $ANTLR start "rule__StartNode__NameAssignment_1"
    // InternalWorkflowDsl.g:4284:1: rule__StartNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StartNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4288:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4289:2: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4289:2: ( RULE_ID )
            // InternalWorkflowDsl.g:4290:3: RULE_ID
            {
             before(grammarAccess.getStartNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStartNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartNode__NameAssignment_1"


    // $ANTLR start "rule__EndNode__NameAssignment_1"
    // InternalWorkflowDsl.g:4299:1: rule__EndNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EndNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4303:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4304:2: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4304:2: ( RULE_ID )
            // InternalWorkflowDsl.g:4305:3: RULE_ID
            {
             before(grammarAccess.getEndNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEndNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndNode__NameAssignment_1"


    // $ANTLR start "rule__Signal__NameAssignment_1"
    // InternalWorkflowDsl.g:4314:1: rule__Signal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4318:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4319:2: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4319:2: ( RULE_ID )
            // InternalWorkflowDsl.g:4320:3: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__NameAssignment_1"


    // $ANTLR start "rule__Signal__EventAssignment_3"
    // InternalWorkflowDsl.g:4329:1: rule__Signal__EventAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Signal__EventAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4333:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4334:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4334:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4335:3: ( RULE_ID )
            {
             before(grammarAccess.getSignalAccess().getEventEventCrossReference_3_0()); 
            // InternalWorkflowDsl.g:4336:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4337:4: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getEventEventIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getEventEventIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSignalAccess().getEventEventCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__EventAssignment_3"


    // $ANTLR start "rule__Signal__OutputAssignment_4"
    // InternalWorkflowDsl.g:4348:1: rule__Signal__OutputAssignment_4 : ( ruleOutputData ) ;
    public final void rule__Signal__OutputAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4352:1: ( ( ruleOutputData ) )
            // InternalWorkflowDsl.g:4353:2: ( ruleOutputData )
            {
            // InternalWorkflowDsl.g:4353:2: ( ruleOutputData )
            // InternalWorkflowDsl.g:4354:3: ruleOutputData
            {
             before(grammarAccess.getSignalAccess().getOutputOutputDataParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputData();

            state._fsp--;

             after(grammarAccess.getSignalAccess().getOutputOutputDataParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__OutputAssignment_4"


    // $ANTLR start "rule__AsyncronousServiceTask__NameAssignment_1"
    // InternalWorkflowDsl.g:4363:1: rule__AsyncronousServiceTask__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AsyncronousServiceTask__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4367:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4368:2: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4368:2: ( RULE_ID )
            // InternalWorkflowDsl.g:4369:3: RULE_ID
            {
             before(grammarAccess.getAsyncronousServiceTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAsyncronousServiceTaskAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsyncronousServiceTask__NameAssignment_1"


    // $ANTLR start "rule__AsyncronousServiceTask__InputsAssignment_3"
    // InternalWorkflowDsl.g:4378:1: rule__AsyncronousServiceTask__InputsAssignment_3 : ( ruleInputData ) ;
    public final void rule__AsyncronousServiceTask__InputsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4382:1: ( ( ruleInputData ) )
            // InternalWorkflowDsl.g:4383:2: ( ruleInputData )
            {
            // InternalWorkflowDsl.g:4383:2: ( ruleInputData )
            // InternalWorkflowDsl.g:4384:3: ruleInputData
            {
             before(grammarAccess.getAsyncronousServiceTaskAccess().getInputsInputDataParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInputData();

            state._fsp--;

             after(grammarAccess.getAsyncronousServiceTaskAccess().getInputsInputDataParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsyncronousServiceTask__InputsAssignment_3"


    // $ANTLR start "rule__AsyncronousServiceTask__OutputAssignment_4"
    // InternalWorkflowDsl.g:4393:1: rule__AsyncronousServiceTask__OutputAssignment_4 : ( ruleOutputData ) ;
    public final void rule__AsyncronousServiceTask__OutputAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4397:1: ( ( ruleOutputData ) )
            // InternalWorkflowDsl.g:4398:2: ( ruleOutputData )
            {
            // InternalWorkflowDsl.g:4398:2: ( ruleOutputData )
            // InternalWorkflowDsl.g:4399:3: ruleOutputData
            {
             before(grammarAccess.getAsyncronousServiceTaskAccess().getOutputOutputDataParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputData();

            state._fsp--;

             after(grammarAccess.getAsyncronousServiceTaskAccess().getOutputOutputDataParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsyncronousServiceTask__OutputAssignment_4"


    // $ANTLR start "rule__SyncronousServiceTask__NameAssignment_1"
    // InternalWorkflowDsl.g:4408:1: rule__SyncronousServiceTask__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SyncronousServiceTask__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4412:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4413:2: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4413:2: ( RULE_ID )
            // InternalWorkflowDsl.g:4414:3: RULE_ID
            {
             before(grammarAccess.getSyncronousServiceTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSyncronousServiceTaskAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyncronousServiceTask__NameAssignment_1"


    // $ANTLR start "rule__SyncronousServiceTask__InputsAssignment_3"
    // InternalWorkflowDsl.g:4423:1: rule__SyncronousServiceTask__InputsAssignment_3 : ( ruleInputData ) ;
    public final void rule__SyncronousServiceTask__InputsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4427:1: ( ( ruleInputData ) )
            // InternalWorkflowDsl.g:4428:2: ( ruleInputData )
            {
            // InternalWorkflowDsl.g:4428:2: ( ruleInputData )
            // InternalWorkflowDsl.g:4429:3: ruleInputData
            {
             before(grammarAccess.getSyncronousServiceTaskAccess().getInputsInputDataParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInputData();

            state._fsp--;

             after(grammarAccess.getSyncronousServiceTaskAccess().getInputsInputDataParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyncronousServiceTask__InputsAssignment_3"


    // $ANTLR start "rule__SyncronousServiceTask__OutputAssignment_4"
    // InternalWorkflowDsl.g:4438:1: rule__SyncronousServiceTask__OutputAssignment_4 : ( ruleOutputData ) ;
    public final void rule__SyncronousServiceTask__OutputAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4442:1: ( ( ruleOutputData ) )
            // InternalWorkflowDsl.g:4443:2: ( ruleOutputData )
            {
            // InternalWorkflowDsl.g:4443:2: ( ruleOutputData )
            // InternalWorkflowDsl.g:4444:3: ruleOutputData
            {
             before(grammarAccess.getSyncronousServiceTaskAccess().getOutputOutputDataParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputData();

            state._fsp--;

             after(grammarAccess.getSyncronousServiceTaskAccess().getOutputOutputDataParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyncronousServiceTask__OutputAssignment_4"


    // $ANTLR start "rule__ExlcusiveDiverging__NameAssignment_1"
    // InternalWorkflowDsl.g:4453:1: rule__ExlcusiveDiverging__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExlcusiveDiverging__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4457:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4458:2: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4458:2: ( RULE_ID )
            // InternalWorkflowDsl.g:4459:3: RULE_ID
            {
             before(grammarAccess.getExlcusiveDivergingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExlcusiveDivergingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExlcusiveDiverging__NameAssignment_1"


    // $ANTLR start "rule__ParallelDiverging__NameAssignment_1"
    // InternalWorkflowDsl.g:4468:1: rule__ParallelDiverging__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParallelDiverging__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4472:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4473:2: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4473:2: ( RULE_ID )
            // InternalWorkflowDsl.g:4474:3: RULE_ID
            {
             before(grammarAccess.getParallelDivergingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParallelDivergingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelDiverging__NameAssignment_1"


    // $ANTLR start "rule__ExclusiveConverging__NameAssignment_1"
    // InternalWorkflowDsl.g:4483:1: rule__ExclusiveConverging__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExclusiveConverging__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4487:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4488:2: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4488:2: ( RULE_ID )
            // InternalWorkflowDsl.g:4489:3: RULE_ID
            {
             before(grammarAccess.getExclusiveConvergingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExclusiveConvergingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusiveConverging__NameAssignment_1"


    // $ANTLR start "rule__ParallelConverging__NameAssignment_1"
    // InternalWorkflowDsl.g:4498:1: rule__ParallelConverging__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParallelConverging__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4502:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4503:2: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4503:2: ( RULE_ID )
            // InternalWorkflowDsl.g:4504:3: RULE_ID
            {
             before(grammarAccess.getParallelConvergingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParallelConvergingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelConverging__NameAssignment_1"


    // $ANTLR start "rule__BasicConnector__FromAssignment_1"
    // InternalWorkflowDsl.g:4513:1: rule__BasicConnector__FromAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__BasicConnector__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4517:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4518:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4518:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4519:3: ( RULE_ID )
            {
             before(grammarAccess.getBasicConnectorAccess().getFromNodeCrossReference_1_0()); 
            // InternalWorkflowDsl.g:4520:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4521:4: RULE_ID
            {
             before(grammarAccess.getBasicConnectorAccess().getFromNodeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBasicConnectorAccess().getFromNodeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBasicConnectorAccess().getFromNodeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicConnector__FromAssignment_1"


    // $ANTLR start "rule__BasicConnector__ToAssignment_2"
    // InternalWorkflowDsl.g:4532:1: rule__BasicConnector__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BasicConnector__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4536:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4537:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4537:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4538:3: ( RULE_ID )
            {
             before(grammarAccess.getBasicConnectorAccess().getToNodeCrossReference_2_0()); 
            // InternalWorkflowDsl.g:4539:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4540:4: RULE_ID
            {
             before(grammarAccess.getBasicConnectorAccess().getToNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBasicConnectorAccess().getToNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBasicConnectorAccess().getToNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicConnector__ToAssignment_2"


    // $ANTLR start "rule__VariableBasedInput__VariableAssignment_1"
    // InternalWorkflowDsl.g:4551:1: rule__VariableBasedInput__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VariableBasedInput__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4555:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4556:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4556:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4557:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableBasedInputAccess().getVariableStringBasedConditionalVaraibleCrossReference_1_0()); 
            // InternalWorkflowDsl.g:4558:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4559:4: RULE_ID
            {
             before(grammarAccess.getVariableBasedInputAccess().getVariableStringBasedConditionalVaraibleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableBasedInputAccess().getVariableStringBasedConditionalVaraibleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVariableBasedInputAccess().getVariableStringBasedConditionalVaraibleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBasedInput__VariableAssignment_1"


    // $ANTLR start "rule__VariableBasedInput__EventParameterNameAssignment_2"
    // InternalWorkflowDsl.g:4570:1: rule__VariableBasedInput__EventParameterNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VariableBasedInput__EventParameterNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4574:1: ( ( RULE_STRING ) )
            // InternalWorkflowDsl.g:4575:2: ( RULE_STRING )
            {
            // InternalWorkflowDsl.g:4575:2: ( RULE_STRING )
            // InternalWorkflowDsl.g:4576:3: RULE_STRING
            {
             before(grammarAccess.getVariableBasedInputAccess().getEventParameterNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVariableBasedInputAccess().getEventParameterNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBasedInput__EventParameterNameAssignment_2"


    // $ANTLR start "rule__EventBasedInput__EventAssignment_1"
    // InternalWorkflowDsl.g:4585:1: rule__EventBasedInput__EventAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EventBasedInput__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4589:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4590:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4590:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4591:3: ( RULE_ID )
            {
             before(grammarAccess.getEventBasedInputAccess().getEventEventCrossReference_1_0()); 
            // InternalWorkflowDsl.g:4592:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4593:4: RULE_ID
            {
             before(grammarAccess.getEventBasedInputAccess().getEventEventIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventBasedInputAccess().getEventEventIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEventBasedInputAccess().getEventEventCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBasedInput__EventAssignment_1"


    // $ANTLR start "rule__EventBasedInput__VariableAssignment_2"
    // InternalWorkflowDsl.g:4604:1: rule__EventBasedInput__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__EventBasedInput__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4608:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4609:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4609:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4610:3: ( RULE_ID )
            {
             before(grammarAccess.getEventBasedInputAccess().getVariableStringBasedConditionalVaraibleCrossReference_2_0()); 
            // InternalWorkflowDsl.g:4611:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4612:4: RULE_ID
            {
             before(grammarAccess.getEventBasedInputAccess().getVariableStringBasedConditionalVaraibleIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventBasedInputAccess().getVariableStringBasedConditionalVaraibleIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEventBasedInputAccess().getVariableStringBasedConditionalVaraibleCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBasedInput__VariableAssignment_2"


    // $ANTLR start "rule__EventBasedInput__EventParameterNameAssignment_3"
    // InternalWorkflowDsl.g:4623:1: rule__EventBasedInput__EventParameterNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__EventBasedInput__EventParameterNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4627:1: ( ( RULE_STRING ) )
            // InternalWorkflowDsl.g:4628:2: ( RULE_STRING )
            {
            // InternalWorkflowDsl.g:4628:2: ( RULE_STRING )
            // InternalWorkflowDsl.g:4629:3: RULE_STRING
            {
             before(grammarAccess.getEventBasedInputAccess().getEventParameterNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEventBasedInputAccess().getEventParameterNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventBasedInput__EventParameterNameAssignment_3"


    // $ANTLR start "rule__OutputData__ValueAssignment_1"
    // InternalWorkflowDsl.g:4638:1: rule__OutputData__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OutputData__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4642:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4643:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4643:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4644:3: ( RULE_ID )
            {
             before(grammarAccess.getOutputDataAccess().getValueStringBasedConditionalVaraibleCrossReference_1_0()); 
            // InternalWorkflowDsl.g:4645:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4646:4: RULE_ID
            {
             before(grammarAccess.getOutputDataAccess().getValueStringBasedConditionalVaraibleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOutputDataAccess().getValueStringBasedConditionalVaraibleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOutputDataAccess().getValueStringBasedConditionalVaraibleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputData__ValueAssignment_1"


    // $ANTLR start "rule__ConditionalConnector__NameAssignment_1"
    // InternalWorkflowDsl.g:4657:1: rule__ConditionalConnector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConditionalConnector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4661:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4662:2: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4662:2: ( RULE_ID )
            // InternalWorkflowDsl.g:4663:3: RULE_ID
            {
             before(grammarAccess.getConditionalConnectorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionalConnectorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__NameAssignment_1"


    // $ANTLR start "rule__ConditionalConnector__FromAssignment_2"
    // InternalWorkflowDsl.g:4672:1: rule__ConditionalConnector__FromAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionalConnector__FromAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4676:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4677:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4677:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4678:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionalConnectorAccess().getFromNodeCrossReference_2_0()); 
            // InternalWorkflowDsl.g:4679:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4680:4: RULE_ID
            {
             before(grammarAccess.getConditionalConnectorAccess().getFromNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionalConnectorAccess().getFromNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConditionalConnectorAccess().getFromNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__FromAssignment_2"


    // $ANTLR start "rule__ConditionalConnector__ToAssignment_3"
    // InternalWorkflowDsl.g:4691:1: rule__ConditionalConnector__ToAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionalConnector__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4695:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4696:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4696:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4697:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionalConnectorAccess().getToNodeCrossReference_3_0()); 
            // InternalWorkflowDsl.g:4698:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4699:4: RULE_ID
            {
             before(grammarAccess.getConditionalConnectorAccess().getToNodeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionalConnectorAccess().getToNodeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getConditionalConnectorAccess().getToNodeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__ToAssignment_3"


    // $ANTLR start "rule__ConditionalConnector__EventAssignment_5"
    // InternalWorkflowDsl.g:4710:1: rule__ConditionalConnector__EventAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionalConnector__EventAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4714:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4715:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4715:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4716:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionalConnectorAccess().getEventEventCrossReference_5_0()); 
            // InternalWorkflowDsl.g:4717:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4718:4: RULE_ID
            {
             before(grammarAccess.getConditionalConnectorAccess().getEventEventIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionalConnectorAccess().getEventEventIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getConditionalConnectorAccess().getEventEventCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__EventAssignment_5"


    // $ANTLR start "rule__ConditionalConnector__StringBasedConditionalExpressionAssignment_6"
    // InternalWorkflowDsl.g:4729:1: rule__ConditionalConnector__StringBasedConditionalExpressionAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__ConditionalConnector__StringBasedConditionalExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4733:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4734:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4734:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4735:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionalConnectorAccess().getStringBasedConditionalExpressionStringBasedConditionalVaraibleCrossReference_6_0()); 
            // InternalWorkflowDsl.g:4736:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4737:4: RULE_ID
            {
             before(grammarAccess.getConditionalConnectorAccess().getStringBasedConditionalExpressionStringBasedConditionalVaraibleIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionalConnectorAccess().getStringBasedConditionalExpressionStringBasedConditionalVaraibleIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getConditionalConnectorAccess().getStringBasedConditionalExpressionStringBasedConditionalVaraibleCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__StringBasedConditionalExpressionAssignment_6"


    // $ANTLR start "rule__ConditionalConnector__ValueAssignment_7"
    // InternalWorkflowDsl.g:4748:1: rule__ConditionalConnector__ValueAssignment_7 : ( RULE_STRING ) ;
    public final void rule__ConditionalConnector__ValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4752:1: ( ( RULE_STRING ) )
            // InternalWorkflowDsl.g:4753:2: ( RULE_STRING )
            {
            // InternalWorkflowDsl.g:4753:2: ( RULE_STRING )
            // InternalWorkflowDsl.g:4754:3: RULE_STRING
            {
             before(grammarAccess.getConditionalConnectorAccess().getValueSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConditionalConnectorAccess().getValueSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalConnector__ValueAssignment_7"


    // $ANTLR start "rule__Test__NameAssignment_1"
    // InternalWorkflowDsl.g:4763:1: rule__Test__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Test__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4767:1: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4768:2: ( RULE_ID )
            {
            // InternalWorkflowDsl.g:4768:2: ( RULE_ID )
            // InternalWorkflowDsl.g:4769:3: RULE_ID
            {
             before(grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__NameAssignment_1"


    // $ANTLR start "rule__Test__ProcessVariablesAssignment_3"
    // InternalWorkflowDsl.g:4778:1: rule__Test__ProcessVariablesAssignment_3 : ( ruleProcessVariable ) ;
    public final void rule__Test__ProcessVariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4782:1: ( ( ruleProcessVariable ) )
            // InternalWorkflowDsl.g:4783:2: ( ruleProcessVariable )
            {
            // InternalWorkflowDsl.g:4783:2: ( ruleProcessVariable )
            // InternalWorkflowDsl.g:4784:3: ruleProcessVariable
            {
             before(grammarAccess.getTestAccess().getProcessVariablesProcessVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessVariable();

            state._fsp--;

             after(grammarAccess.getTestAccess().getProcessVariablesProcessVariableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__ProcessVariablesAssignment_3"


    // $ANTLR start "rule__Test__FireSignalAssignment_4"
    // InternalWorkflowDsl.g:4793:1: rule__Test__FireSignalAssignment_4 : ( ruleFireSignal ) ;
    public final void rule__Test__FireSignalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4797:1: ( ( ruleFireSignal ) )
            // InternalWorkflowDsl.g:4798:2: ( ruleFireSignal )
            {
            // InternalWorkflowDsl.g:4798:2: ( ruleFireSignal )
            // InternalWorkflowDsl.g:4799:3: ruleFireSignal
            {
             before(grammarAccess.getTestAccess().getFireSignalFireSignalParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFireSignal();

            state._fsp--;

             after(grammarAccess.getTestAccess().getFireSignalFireSignalParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__FireSignalAssignment_4"


    // $ANTLR start "rule__Test__AssertFlowAssignment_5"
    // InternalWorkflowDsl.g:4808:1: rule__Test__AssertFlowAssignment_5 : ( ruleAssertFlow ) ;
    public final void rule__Test__AssertFlowAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4812:1: ( ( ruleAssertFlow ) )
            // InternalWorkflowDsl.g:4813:2: ( ruleAssertFlow )
            {
            // InternalWorkflowDsl.g:4813:2: ( ruleAssertFlow )
            // InternalWorkflowDsl.g:4814:3: ruleAssertFlow
            {
             before(grammarAccess.getTestAccess().getAssertFlowAssertFlowParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertFlow();

            state._fsp--;

             after(grammarAccess.getTestAccess().getAssertFlowAssertFlowParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__AssertFlowAssignment_5"


    // $ANTLR start "rule__Test__AssertWaitAssignment_6"
    // InternalWorkflowDsl.g:4823:1: rule__Test__AssertWaitAssignment_6 : ( ruleAssertWait ) ;
    public final void rule__Test__AssertWaitAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4827:1: ( ( ruleAssertWait ) )
            // InternalWorkflowDsl.g:4828:2: ( ruleAssertWait )
            {
            // InternalWorkflowDsl.g:4828:2: ( ruleAssertWait )
            // InternalWorkflowDsl.g:4829:3: ruleAssertWait
            {
             before(grammarAccess.getTestAccess().getAssertWaitAssertWaitParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertWait();

            state._fsp--;

             after(grammarAccess.getTestAccess().getAssertWaitAssertWaitParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__AssertWaitAssignment_6"


    // $ANTLR start "rule__ProcessVariable__VariableAssignment_1"
    // InternalWorkflowDsl.g:4838:1: rule__ProcessVariable__VariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProcessVariable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4842:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4843:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4843:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4844:3: ( RULE_ID )
            {
             before(grammarAccess.getProcessVariableAccess().getVariableStringBasedConditionalVaraibleCrossReference_1_0()); 
            // InternalWorkflowDsl.g:4845:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4846:4: RULE_ID
            {
             before(grammarAccess.getProcessVariableAccess().getVariableStringBasedConditionalVaraibleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessVariableAccess().getVariableStringBasedConditionalVaraibleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getProcessVariableAccess().getVariableStringBasedConditionalVaraibleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessVariable__VariableAssignment_1"


    // $ANTLR start "rule__ProcessVariable__ValueAssignment_2"
    // InternalWorkflowDsl.g:4857:1: rule__ProcessVariable__ValueAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ProcessVariable__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4861:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4862:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4862:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4863:3: ( RULE_ID )
            {
             before(grammarAccess.getProcessVariableAccess().getValueConditionalConnectorCrossReference_2_0()); 
            // InternalWorkflowDsl.g:4864:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4865:4: RULE_ID
            {
             before(grammarAccess.getProcessVariableAccess().getValueConditionalConnectorIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessVariableAccess().getValueConditionalConnectorIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getProcessVariableAccess().getValueConditionalConnectorCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessVariable__ValueAssignment_2"


    // $ANTLR start "rule__FireSignal__FireSignalAssignment_1"
    // InternalWorkflowDsl.g:4876:1: rule__FireSignal__FireSignalAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FireSignal__FireSignalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4880:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4881:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4881:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4882:3: ( RULE_ID )
            {
             before(grammarAccess.getFireSignalAccess().getFireSignalSignalCrossReference_1_0()); 
            // InternalWorkflowDsl.g:4883:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4884:4: RULE_ID
            {
             before(grammarAccess.getFireSignalAccess().getFireSignalSignalIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFireSignalAccess().getFireSignalSignalIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFireSignalAccess().getFireSignalSignalCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireSignal__FireSignalAssignment_1"


    // $ANTLR start "rule__FireSignal__CaseAssignment_3"
    // InternalWorkflowDsl.g:4895:1: rule__FireSignal__CaseAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__FireSignal__CaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4899:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4900:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4900:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4901:3: ( RULE_ID )
            {
             before(grammarAccess.getFireSignalAccess().getCaseConditionalConnectorCrossReference_3_0()); 
            // InternalWorkflowDsl.g:4902:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4903:4: RULE_ID
            {
             before(grammarAccess.getFireSignalAccess().getCaseConditionalConnectorIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFireSignalAccess().getCaseConditionalConnectorIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFireSignalAccess().getCaseConditionalConnectorCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FireSignal__CaseAssignment_3"


    // $ANTLR start "rule__AssertFlow__NodesAssignment_2"
    // InternalWorkflowDsl.g:4914:1: rule__AssertFlow__NodesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AssertFlow__NodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4918:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4919:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4919:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4920:3: ( RULE_ID )
            {
             before(grammarAccess.getAssertFlowAccess().getNodesNodeCrossReference_2_0()); 
            // InternalWorkflowDsl.g:4921:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4922:4: RULE_ID
            {
             before(grammarAccess.getAssertFlowAccess().getNodesNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssertFlowAccess().getNodesNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAssertFlowAccess().getNodesNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertFlow__NodesAssignment_2"


    // $ANTLR start "rule__AssertWait__NodesAssignment_2"
    // InternalWorkflowDsl.g:4933:1: rule__AssertWait__NodesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AssertWait__NodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWorkflowDsl.g:4937:1: ( ( ( RULE_ID ) ) )
            // InternalWorkflowDsl.g:4938:2: ( ( RULE_ID ) )
            {
            // InternalWorkflowDsl.g:4938:2: ( ( RULE_ID ) )
            // InternalWorkflowDsl.g:4939:3: ( RULE_ID )
            {
             before(grammarAccess.getAssertWaitAccess().getNodesNodeCrossReference_2_0()); 
            // InternalWorkflowDsl.g:4940:3: ( RULE_ID )
            // InternalWorkflowDsl.g:4941:4: RULE_ID
            {
             before(grammarAccess.getAssertWaitAccess().getNodesNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssertWaitAccess().getNodesNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAssertWaitAccess().getNodesNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertWait__NodesAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000FFE0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000FFE0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000210000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000001E0004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007800004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000002L});

}